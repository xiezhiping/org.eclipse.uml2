/*
 * Copyright (c) 2012 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 */
package org.eclipse.uml2.uml.validation;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.AbstractConstraintProvider;
import org.eclipse.emf.validation.service.ConstraintExistsException;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.UMLPlugin;

/**
 * A provider of constraints that delegate to an {@link EPackage}'s constraints
 * via its generated {@link EValidator}.
 */
public class DelegatingConstraintProvider
		extends AbstractConstraintProvider {

	private static final String E_CATEGORY = "category"; //$NON-NLS-1$

	private static final String A_PATH = "path"; //$NON-NLS-1$

	private static final String E_EVALIDATOR_PROVIDER = "eValidatorProvider"; //$NON-NLS-1$

	private static final String A_CLASS = "class"; //$NON-NLS-1$

	/**
	 * Initializes me.
	 */
	public DelegatingConstraintProvider() {
		super();
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data)
			throws CoreException {

		super.setInitializationData(config, propertyName, data);

		// first, grab the categories that I'll be assigning to my constraints
		final Set<Category> categories = getCategories(config);

		// get an EValidator provider
		IEValidatorProvider validatorProvider = getEValidatorProvider(config);

		// then find the constraints that I need to adapt
		for (String next : getNamespaceUris()) {
			// find the EValidator for this package
			EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(next);

			if (epackage == null) {
				UMLPlugin.INSTANCE
					.log(new Status(
						IStatus.WARNING,
						UMLPlugin.INSTANCE.getSymbolicName(),
						"No such EPackage available for model validation: " + next)); //$NON-NLS-1$
			} else {
				EValidator validator = validatorProvider
					.getEValidator(epackage);
				if (validator == null) {
					UMLPlugin.INSTANCE
						.log(new Status(
							IStatus.WARNING,
							UMLPlugin.INSTANCE.getSymbolicName(),
							"No generated validator available for package: " + next)); //$NON-NLS-1$
				} else {
					EValidator.SubstitutionLabelProvider labelProvider = validatorProvider
						.getSubstitutionLabelProvider(epackage);

					try {
						Iterable<? extends IModelConstraint> constraints = createConstraints(
							config.getNamespaceIdentifier(), epackage,
							validator, labelProvider);

						if (!categories.isEmpty()) {
							Category[] cats = categories
								.toArray(new Category[categories.size()]);
							for (IModelConstraint constraint : constraints) {
								IConstraintDescriptor desc = constraint
									.getDescriptor();
								for (int i = 0; i < cats.length; i++) {
									desc.addCategory(cats[i]);
								}
							}
						}
					} catch (ConstraintExistsException e) {
						throw new CoreException(new Status(IStatus.ERROR,
							UMLPlugin.INSTANCE.getSymbolicName(),
							"Failed to register model validation constraints.", //$NON-NLS-1$
							e));
					}
				}
			}
		}
	}

	private Set<Category> getCategories(IConfigurationElement config) {
		final Set<Category> result = new java.util.HashSet<Category>();
		for (IConfigurationElement next : config.getChildren(E_CATEGORY)) {
			String path = next.getAttribute(A_PATH);

			if (!UML2Util.isEmpty(path)) {
				// if the category doesn't already exist, it is implicitly
				// created, so
				// we won't get a null category
				result.add(CategoryManager.getInstance().getCategory(path));
			}
		}

		return result;
	}

	private IEValidatorProvider getEValidatorProvider(
			IConfigurationElement config) {

		IEValidatorProvider result = null;

		IConfigurationElement[] vpConfig = config
			.getChildren(E_EVALIDATOR_PROVIDER);
		if (vpConfig.length > 0) {
			Object ext;
			try {
				ext = vpConfig[0].createExecutableExtension(A_CLASS);
				if (ext instanceof IEValidatorProvider) {
					result = (IEValidatorProvider) ext;
				}
			} catch (CoreException e) {
				UMLPlugin.INSTANCE.log(e.getStatus());
			}
		}

		if (result == null) {
			result = new IEValidatorProvider.Default();
		}

		return result;
	}

	private Iterable<? extends IModelConstraint> createConstraints(
			final String namespace, final EPackage epackage,
			final EValidator validator,
			final EValidator.SubstitutionLabelProvider labelProvider)
			throws ConstraintExistsException {

		final List<IModelConstraint> result = new java.util.ArrayList<IModelConstraint>();
		final Matcher m = Pattern.compile("validate\\w+_validate(\\w+)") //$NON-NLS-1$
			.matcher(""); //$NON-NLS-1$
		final Map<Class<?>, EClass> eclasses = new java.util.HashMap<Class<?>, EClass>();

		for (Method next : validator.getClass().getDeclaredMethods()) {
			if (Modifier.isPublic(next.getModifiers())) {
				final Class<?>[] signature = next.getParameterTypes();

				m.reset(next.getName());
				if (m.matches()
					&& isConstraintMethod(next.getReturnType(), signature)) {
					EClass eclass = getEClass(eclasses, epackage, signature[0]);

					// constraint methods could exist for EDataTypes; this
					// framework doesn't handle them
					if (eclass != null) {
						result.add(new DelegatingModelConstraint(namespace,
							validator, labelProvider, eclass, next));
					}
				}
			}
		}

		getConstraints().addAll(result);
		registerConstraints(result);

		return result;
	}

	private static boolean isConstraintMethod(Class<?> returnType,
			Class<?>[] parameterTypes) {

		boolean result = false;

		if ((returnType == boolean.class) && (parameterTypes.length == 3)) {
			result = EObject.class.isAssignableFrom(parameterTypes[0])
				&& (parameterTypes[1] == DiagnosticChain.class)
				&& (parameterTypes[2] == Map.class);
		}

		return result;
	}

	/**
	 * Look up an {@link EClass} by instance-class, using a cache for
	 * performance of repeated queries.
	 * 
	 * @param cache
	 *            a cache of previous look-up results
	 * @param epackage
	 *            the epackage in which to find the eclass
	 * @param interfaceType
	 *            the Java interface type by which to look up the eclass
	 * 
	 * @return the eclass, or {@code null} if not found
	 */
	private static EClass getEClass(Map<Class<?>, EClass> cache,
			EPackage epackage, Class<?> interfaceType) {

		EClass result = cache.get(interfaceType);

		if (result == null) {
			for (EClassifier next : epackage.getEClassifiers()) {
				if ((next.getInstanceClass() == interfaceType)
					&& (next instanceof EClass)) {
					result = (EClass) next;
					cache.put(interfaceType, result);
					break;
				}
			}
		}

		return result;
	}
}
