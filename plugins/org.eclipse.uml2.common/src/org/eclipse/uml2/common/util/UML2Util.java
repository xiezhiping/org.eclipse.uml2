/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2Util.java,v 1.1 2005/09/20 20:08:54 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @since 2.0
 */
public class UML2Util {

	protected UML2Util() {
		super();
	}

	public static interface EObjectMatcher {

		public boolean matches(EObject eObject);

	}

	public static class EClassMatcher
			implements EObjectMatcher {

		protected final EObject eObject;

		public EClassMatcher(EObject eObject) {
			super();

			this.eObject = eObject;
		}

		public boolean matches(EObject otherEObject) {

			return null == eObject || null == otherEObject
				? null == eObject && null == otherEObject
				: eObject.eClass() == otherEObject.eClass();
		}
	}

	/**
	 * The empty string.
	 */
	public static final String EMPTY_STRING = ""; //$NON-NLS-1$

	protected static final String LINE_SEPARATOR = System.getProperties()
		.getProperty("line.separator"); //$NON-NLS-1$

	public static boolean safeEquals(Object thisObject, Object thatObject) {
		return null == thisObject
			? null == thatObject
			: thisObject.equals(thatObject);
	}

	public static boolean isEmpty(String string) {
		return null == string || 0 == string.length();
	}

	public static EObject findEObject(Collection eObjects, EObjectMatcher filter) {
		return findEObject(eObjects.iterator(), filter);
	}

	public static EObject findEObject(Iterator iterator, EObjectMatcher filter) {

		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();

			if (filter.matches(eObject)) {
				return eObject;
			}
		}

		return null;
	}

	protected static EClassifier getCommonEType(EClassifier eType,
			final EClassifier otherEType) {

		if (null == eType || eType.equals(otherEType)) {
			return eType;
		} else {
			return (EClassifier) new EcoreSwitch() {

				public Object caseEClassifier(EClassifier eClassifier) {

					return EcorePackage.eINSTANCE.getEObject();
				}

				public Object caseEClass(EClass eClass) {

					if (otherEType instanceof EClass) {
						EClass otherEClass = (EClass) otherEType;

						if (eClass.isSuperTypeOf(otherEClass)) {
							return eClass;
						} else if (otherEClass.isSuperTypeOf(eClass)) {
							return otherEClass;
						}

						for (Iterator eAllSuperTypes = eClass
							.getEAllSuperTypes().iterator(); eAllSuperTypes
							.hasNext();) {

							EClass eSuperType = (EClass) eAllSuperTypes.next();

							if (eSuperType.isSuperTypeOf(otherEClass)) {
								return eSuperType;
							}
						}

						for (Iterator otherEAllSuperTypes = otherEClass
							.getEAllSuperTypes().iterator(); otherEAllSuperTypes
							.hasNext();) {

							EClass otherESuperType = (EClass) otherEAllSuperTypes
								.next();

							if (otherESuperType.isSuperTypeOf(eClass)) {
								return otherESuperType;
							}
						}
					}

					return super.caseEClass(eClass);
				}

				public Object caseEDataType(EDataType eDataType) {
					return otherEType instanceof EDataType
						&& eDataType.getInstanceClass().equals(
							((EDataType) otherEType).getInstanceClass())
						? eDataType
						: EcorePackage.eINSTANCE.getEJavaObject();
				}

				public Object caseEEnum(EEnum eEnum) {
					return otherEType instanceof EEnum
						? EcorePackage.eINSTANCE.getEEnumerator()
						: EcorePackage.eINSTANCE.getEJavaObject();
				}
			}.doSwitch(eType);
		}
	}

	protected static int getLesserLowerBound(int lowerBound, int otherLowerBound) {
		return Math.min(lowerBound, otherLowerBound);
	}

	protected static int getGreaterUpperBound(int upperBound,
			int otherUpperBound) {

		return ETypedElement.UNBOUNDED_MULTIPLICITY == upperBound
			|| ETypedElement.UNBOUNDED_MULTIPLICITY == otherUpperBound
			? ETypedElement.UNBOUNDED_MULTIPLICITY
			: Math.max(upperBound, otherUpperBound);
	}

	/**
	 * Obtains a valid (Java) identifier based on the specified name.
	 * 
	 * @param name
	 *            The name from which to obtain a valid identifier.
	 * @return A valid (Java) identifier.
	 */
	protected static String getValidIdentifier(String name) {
		return appendValidIdentifier(new StringBuffer(), name).toString();
	}

	/**
	 * Appends a valid (Java) identifier based on the specified name to the
	 * specified buffer.
	 * 
	 * @param validIdentifier
	 *            The buffer to which to append the valid identifier.
	 * @param name
	 *            The name from which to obtain the valid identifier.
	 * 
	 * @return The buffer.
	 */
	protected static StringBuffer appendValidIdentifier(
			StringBuffer validIdentifier, String name) {

		if (isEmpty(name)) {
			validIdentifier.append('_');
		} else {
			char char_0 = name.charAt(0);

			if (Character.isJavaIdentifierStart(char_0)) {
				validIdentifier.append(char_0);
			} else {
				validIdentifier.append('_');

				if (Character.isJavaIdentifierPart(char_0)) {
					validIdentifier.append(char_0);
				}
			}

			for (int i = 1; i < name.length(); ++i) {
				char char_i = name.charAt(i);

				if (Character.isJavaIdentifierPart(char_i)) {
					validIdentifier.append(char_i);
				}
			}
		}

		return validIdentifier;
	}

	public static int getInstanceCount(ResourceSet resourceSet,
			EClassifier eClassifier) {
		return getInstanceCount(resourceSet.getAllContents(), eClassifier);
	}

	public static int getInstanceCount(Resource resource,
			EClassifier eClassifier) {
		return getInstanceCount(resource.getAllContents(), eClassifier);
	}

	public static int getInstanceCount(EObject eObject, EClassifier eClassifier) {
		return getInstanceCount(eObject.eAllContents(), eClassifier);
	}

	public static int getInstanceCount(Iterator iterator,
			EClassifier eClassifier) {
		int count = 0;

		while (iterator.hasNext()) {

			if (eClassifier.isInstance(iterator.next())) {
				count++;
			}
		}

		return count;
	}

	protected static void addConstraint(EModelElement eModelElement,
			String constraint) {

		if (!isEmpty(constraint)) {
			List constraints = new ArrayList(EcoreUtil
				.getConstraints(eModelElement));

			constraints.add(constraint);

			EcoreUtil.setConstraints(eModelElement, constraints);
		}
	}

	protected static void addDocumentation(EModelElement eModelElement,
			String text) {

		if (!isEmpty(text)) {
			String documentation = EcoreUtil.getDocumentation(eModelElement);

			EcoreUtil.setDocumentation(eModelElement, null == documentation
				? text
				: documentation + LINE_SEPARATOR + text);
		}
	}

	protected static Collection getRootContainers(Collection eObjects) {
		Collection rootContainers = new UniqueEList();

		for (Iterator i = eObjects.iterator(); i.hasNext();) {
			rootContainers.add(EcoreUtil.getRootContainer((EObject) i.next()));
		}

		return rootContainers;
	}

	protected static TreeIterator getAllContents(EObject eObject,
			boolean includeRoot, final boolean defensiveCopy) {
		return new AbstractTreeIterator(eObject, includeRoot) {

			protected Iterator getChildren(Object object) {
				return defensiveCopy
					? new ArrayList(((EObject) object).eContents()).iterator()
					: ((EObject) object).eContents().iterator();
			}
		};
	}

}
