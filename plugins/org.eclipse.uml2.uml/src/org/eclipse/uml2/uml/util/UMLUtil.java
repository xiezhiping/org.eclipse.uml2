/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 199624, 184249, 204406, 208125, 204200, 213218, 213903, 220669, 208016, 226396, 271470
 *   Nicolas Rouquette (JPL) - 260120, 313837
 *   Kenn Hussey - 286329, 313601, 314971, 344907, 236184, 335125
 *   Kenn Hussey (CEA) - 327039, 358792, 364419, 366350, 307343, 382637, 273949, 389542, 389495, 316165, 392833, 399544, 322715, 163556, 212765, 397324, 204658, 408612, 411731, 269598, 422000, 416833, 424568, 427167, 418466, 419324, 429994, 433157, 439915, 446388, 454864, 458906, 461374, 463066
 *   Yann Tanguy (CEA) - 350402
 *   Christian W. Damus (CEA) - 392833, 251963, 405061, 409396, 176998, 180744, 403374, 416833, 420338, 405065, 431342
 *   E.D.Willink - 420338
 *   Christian W. Damus - 444588
 *
 */
package org.eclipse.uml2.uml.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.types.TypesFactory;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AttributeOwner;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationOwner;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.resource.CMOF202UMLResource;
import org.eclipse.uml2.uml.resource.CMOF242UMLResource;
import org.eclipse.uml2.uml.resource.CMOF2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UML212UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML212UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UML302UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML302UMLResource;
import org.eclipse.uml2.uml.resource.UML402UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML402UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI212UMLResource;
import org.eclipse.uml2.uml.resource.XMI222UMLResource;
import org.eclipse.uml2.uml.resource.XMI242UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

/**
 * Utilities for working with UML elements and resources.
 * 
 * @since 2.0
 */
public class UMLUtil
		extends UML2Util {

	/**
	 * The ProfileApplicationHelper can be overridden to change the way packages
	 * are traversed when looking for profile applications relevant to an
	 * element in a given package.
	 * 
	 * @since 3.0
	 */
	public static class ProfileApplicationHelper {

		/**
		 * @deprecated Since the 5.1 release, direct reliance on this shared
		 *             helper instance is deprecated. Instead, use the
		 *             {@link #getInstance(Notifier)} method to obtain a helper
		 *             specific to the particular model context
		 */
		@Deprecated
		public static final ProfileApplicationHelper INSTANCE = createProfileApplicationHelper();

		/**
		 * Obtains the most appropriate {@link ProfileApplicationHelper}
		 * instance for managing profile applications in the given
		 * {@code context}. This helper should always be preferred over using
		 * the default {@code INSTANCE}.
		 * 
		 * @param context
		 *            a {@link ResourceSet}, {@link Resource}, or
		 *            {@link EObject} in the context of which the caller is
		 *            working with profile applications
		 * 
		 * @return the specific helper associated with a {@code ResourceSet} if
		 *         there is such reachable from the {@code context}, or else the
		 *         default {@link #INSTANCE}. The result is never {@code null}
		 * 
		 * @since 5.1
		 */
		public static ProfileApplicationHelper getInstance(Notifier context) {
			if (context == null) {
				return INSTANCE;
			} else if (context instanceof ResourceSet) {
				return getInstance((ResourceSet) context);
			} else if (context instanceof Resource) {
				return getInstance(((Resource) context).getResourceSet());
			} else if (context instanceof EObject) {
				return getInstance(((EObject) context).eResource());
			} else {
				return INSTANCE;
			}
		}

		/**
		 * Assigns a particular helper {@code instance} for management of
		 * profile applications in the scope of a resource set. This supersedes
		 * the default {@link #INSTANCE} for all profile-application operations
		 * on packages in the resource set.
		 * 
		 * @param resourceSet
		 *            a resource set. Must not be {@code null}
		 * @param instance
		 *            a profile application helper to assign. Must not be
		 *            {@code null}. May be the default {@link #INSTANCE}
		 * 
		 * @return the helper that was previously in effect for the resource
		 *         set, which could be the default {@link #INSTANCE} if no
		 *         specific helper was assigned
		 * 
		 * @since 5.1
		 */
		public static ProfileApplicationHelper setInstance(
				ResourceSet resourceSet, ProfileApplicationHelper instance) {
			ProfileApplicationHelper result = HelperLink.link(resourceSet,
				ProfileApplicationHelper.class, instance);

			// If no helper was associated, the shared instance was implied
			return (result == null)
				? INSTANCE
				: result;
		}

		private static ProfileApplicationHelper getInstance(
				ResourceSet resourceSet) {
			HelperLink<ProfileApplicationHelper> link = (resourceSet == null)
				? null
				: HelperLink.getInstance(resourceSet,
					ProfileApplicationHelper.class);
			return (link != null)
				? link.getHelper()
				: INSTANCE;
		}

		private static ProfileApplicationHelper createProfileApplicationHelper() {
			ProfileApplicationHelper profileApplicationHelper = UML2Util
				.loadClassFromSystemProperty("org.eclipse.uml2.uml.util.UMLUtil$ProfileApplicationHelper.INSTANCE"); //$NON-NLS-1$

			if (profileApplicationHelper != null) {
				return profileApplicationHelper;
			}

			return new ProfileApplicationHelper();
		}

		public Iterable<org.eclipse.uml2.uml.Package> getOtherApplyingPackages(
				org.eclipse.uml2.uml.Package package_) {
			return package_.allOwningPackages();
		}
	}
	
	/**
	 * The StereotypeApplicationHelper can be overridden to change the default
	 * location of applied stereotypes. 
	 * Typically, stereotype applications are placed in the same location as
	 * the element to which the stereotype is applied, however, stereotype 
	 * applications may be placed in other resources.
	 * 
	 * @since 3.0
	 */
	public static class StereotypeApplicationHelper {

		/**
		 * @deprecated Since the 5.1 release, direct reliance on this shared
		 *             helper instance is deprecated. Instead, use the
		 *             {@link #getInstance(Notifier)} method to obtain a helper
		 *             specific to the particular model context
		 */
		@Deprecated
		public static final StereotypeApplicationHelper INSTANCE = createStereotypeApplicationHelper();

		/**
		 * Obtains the most appropriate {@link StereotypeApplicationHelper}
		 * instance for managing stereotype applications in the given
		 * {@code context}. This helper should always be preferred over using
		 * the default {@code INSTANCE}.
		 * 
		 * @param context
		 *            a {@link ResourceSet}, {@link Resource}, or
		 *            {@link EObject} in the context of which the caller is
		 *            working with stereotype applications
		 * 
		 * @return the specific helper associated with a {@code ResourceSet} if
		 *         there is such reachable from the {@code context}, or else the
		 *         default {@link #INSTANCE}. The result is never {@code null}
		 * 
		 * @since 5.1
		 */
		public static StereotypeApplicationHelper getInstance(Notifier context) {
			if (context == null) {
				return INSTANCE;
			} else if (context instanceof ResourceSet) {
				return getInstance((ResourceSet)context);
			} else if (context instanceof Resource) {
				return getInstance(((Resource)context).getResourceSet());
			} else if (context instanceof EObject) {
				return getInstance(((EObject)context).eResource());
			} else {
				return INSTANCE;
			}
		}

		/**
		 * Assigns a particular helper {@code instance} for management of
		 * stereotype applications in the scope of a resource set. This
		 * supersedes the default {@link #INSTANCE} for all stereotype
		 * operations on model elements in the resource set.
		 * 
		 * @param resourceSet
		 *            a resource set. Must not be {@code null}
		 * @param instance
		 *            a stereotype application helper to assign. Must not be
		 *            {@code null}. May be the default {@link #INSTANCE}
		 * 
		 * @return the helper that was previously in effect for the resource
		 *         set, which could be the default {@link #INSTANCE} if no
		 *         specific helper was assigned
		 * 
		 * @since 5.1
		 */
		public static StereotypeApplicationHelper setInstance(ResourceSet resourceSet, StereotypeApplicationHelper instance) {
			StereotypeApplicationHelper result = HelperLink.link(resourceSet,
				StereotypeApplicationHelper.class, instance);

			// If no helper was associated, the shared instance was implied
			return (result == null)
				? INSTANCE
				: result;
		}

		private static StereotypeApplicationHelper getInstance(ResourceSet resourceSet) {
			HelperLink<StereotypeApplicationHelper> link = (resourceSet == null)
				? null
				: HelperLink.getInstance(resourceSet,
					StereotypeApplicationHelper.class);
			return (link != null) ? link.getHelper() : INSTANCE;
		}
		
		private static StereotypeApplicationHelper createStereotypeApplicationHelper() {
			StereotypeApplicationHelper stereotypeApplicationHelper = UML2Util
				.loadClassFromSystemProperty("org.eclipse.uml2.uml.util.UMLUtil$StereotypeApplicationHelper.INSTANCE"); //$NON-NLS-1$

			if (stereotypeApplicationHelper != null) {
				return stereotypeApplicationHelper;
			}

			return new StereotypeApplicationHelper();
		}

		protected EList<EObject> getContainmentList(Element element,
				EClass definition) {
			Resource eResource = element.eResource();

			if (eResource != null) {
				return eResource.getContents();
			}

			return null;
		}

		public boolean addToContainmentList(Element element,
				EObject stereotypeApplication) {
			boolean result = false;

			EList<EObject> containmentList = getContainmentList(element,
				stereotypeApplication.eClass());

			if (containmentList != null) {
				result = containmentList.add(stereotypeApplication);
			}

			return result;
		}

		public boolean removeFromContainmentList(Element element,
				EObject stereotypeApplication) {
			boolean result = false;

			EList<EObject> containmentList = getContainmentList(element,
				stereotypeApplication.eClass());

			if (containmentList != null) {
				result = containmentList.remove(stereotypeApplication);
			}

			return result;
		}

		public EObject applyStereotype(Element element, EClass definition) {
			EObject stereotypeApplication = EcoreUtil.create(definition);

			CacheAdapter.getInstance().adapt(stereotypeApplication);

			addToContainmentList(element, stereotypeApplication);
			setBaseElement(stereotypeApplication, element);

			return stereotypeApplication;
		}
	}

	private static final class HelperLink<T>
			extends AdapterImpl {

		private final Class<T> helperType;

		private final T helper;

		private HelperLink(Class<T> helperType, T helper) {
			this.helper = helper;
			this.helperType = helperType;
		}

		static <T> HelperLink<T> getInstance(Notifier notifier,
				Class<T> helperType) {
			return getInstance(notifier.eAdapters(), helperType);
		}

		@SuppressWarnings("unchecked")
		static <T> HelperLink<T> getInstance(List<Adapter> adapters,
				Class<T> helperType) {
			// Our isAdapterForType() implementation ensures that the generic
			// signature matches
			return (HelperLink<T>) EcoreUtil.getAdapter(adapters, helperType);
		}

		static <T> T link(Notifier notifier, Class<T> helperType, T helper) {
			T result = helper;

			EList<Adapter> adapters = notifier.eAdapters();
			HelperLink<T> link = getInstance(adapters, helperType);

			if (link == null) {
				adapters.add(new HelperLink<T>(helperType, helper));
			} else {
				result = link.getHelper();
				if (helper == null) {
					adapters.remove(link);
				} else if (result != helper) {
					int index = adapters.indexOf(link);
					adapters.set(index, new HelperLink<T>(helperType, helper));
				}
			}

			return result;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return (type == helperType) || (type == helper);
		}

		T getHelper() {
			return helper;
		}
	}

	/**
	 * A qualified text provider that uses names of named elements as qualified
	 * text segments and :: as a separator.
	 */
	public static class QualifiedTextProvider
			extends UML2Util.QualifiedTextProvider {

		/**
		 * The default instance.
		 */
		public static final QualifiedTextProvider DEFAULT = new QualifiedTextProvider();

		@Override
		public String getText(EObject eObject) {

			return eObject instanceof NamedElement
				? ((NamedElement) eObject).getName()
				: super.getText(eObject);
		}

		@Override
		public String getSeparator() {
			return NamedElement.SEPARATOR;
		}

	}

	/**
	 * A copier that merges the contents of packages involved in package merge
	 * relationships based on the rules defined in the UML specification.
	 */
	public static class PackageMerger
			extends EcoreUtil.Copier {

		private static final long serialVersionUID = 1L;

		protected class BodyMatcher
				extends EStructuralFeatureMatcher {

			protected BodyMatcher(Comment comment) {
				super(comment, UMLPackage.Literals.COMMENT__BODY);
			}
		}

		protected class NameMatcher
				extends EStructuralFeatureMatcher {

			protected NameMatcher(NamedElement namedElement) {
				super(namedElement, UMLPackage.Literals.NAMED_ELEMENT__NAME);
			}
		}

		protected class ImplicitAssociationNameMatcher
				extends EClassMatcher {

			private final String name;

			ImplicitAssociationNameMatcher(Association association) {
				super(association);

				name = getName(association);
			}

			@Override
			public boolean matches(EObject otherEObject) {
				boolean result = super.matches(otherEObject);

				if (result) {
					Association other = (Association) otherEObject;
					result = safeEquals(name, getName(other));
				}

				return result;
			}

			protected String getName(Association association) {
				String result = association.getName();

				if (result == null) {
					StringBuilder buf = new StringBuilder();

					buf.append('A');
					for (Property end : association.getMemberEnds()) {
						buf.append('_');
						buf.append(getName(end));
					}

					result = buf.toString();
				}

				return result;
			}

			protected String getName(Property end) {
				String result = end.getName();

				if ((result == null) && (end.getType() != null)) {
					result = end.getType().getName();

					if (!UML2Util.isEmpty(result)) {
						result = String.format(
							"%s%s", //$NON-NLS-1$
							Character.toLowerCase(result.charAt(0)),
							result.substring(1));
					}
				}

				return result;
			}
		}

		protected class KeyMatcher
				extends EClassMatcher {

			protected KeyMatcher(BasicEMap.Entry<String, String> entry) {
				super((EObject) entry);
			}

			@SuppressWarnings("unchecked")
			@Override
			public boolean matches(EObject otherEObject) {
				return super.matches(otherEObject)
					&& safeEquals(
						((BasicEMap.Entry<String, String>) eObject).getKey(),
						((BasicEMap.Entry<String, String>) otherEObject)
							.getKey());
			}
		}

		protected class ResultingQNameMatcher
				extends EClassMatcher {

			protected ResultingQNameMatcher(EObject eObject) {
				super(eObject);
			}

			@Override
			public boolean matches(EObject otherEObject) {
				return super.matches(otherEObject)
					&& safeEquals(getResultingQName(eObject),
						getResultingQName(otherEObject));
			}
		}

		protected class StringValueMatcher
				extends EClassMatcher {

			protected StringValueMatcher(ValueSpecification valueSpecification) {
				super(valueSpecification);
			}

			@Override
			public boolean matches(EObject otherEObject) {
				return super.matches(otherEObject)
					&& safeEquals(((ValueSpecification) eObject).stringValue(),
						((ValueSpecification) otherEObject).stringValue());
			}
		}

		protected class SourceMatcher
				extends EStructuralFeatureMatcher {

			protected SourceMatcher(EAnnotation eAnnotation) {
				super(eAnnotation, EcorePackage.Literals.EANNOTATION__SOURCE);
			}
		}

		protected class TypeMatcher
				extends NameMatcher {

			protected TypeMatcher(TypedElement typedElement) {
				super(typedElement);
			}

			@Override
			public boolean matches(EObject otherEObject) {

				if (super.matches(otherEObject)) {
					Type type = ((TypedElement) eObject).getType();
					Type otherType = ((TypedElement) otherEObject).getType();

					return (type == null && otherType == null)
						|| new ResultingQNameMatcher(type).matches(otherType)
						|| (type instanceof Classifier
							&& otherType instanceof Classifier && (findEObject(
							((Classifier) type).allParents(),
							new ResultingQNameMatcher(otherType)) != null || findEObject(
							((Classifier) otherType).allParents(),
							new ResultingQNameMatcher(type)) != null));
				}

				return false;
			}
		}

		private static final boolean DEBUG = false;

		/**
		 * The option for handling cases where the staticity of merged
		 * properties does not match. Supported choices are
		 * <code>OPTION__IGNORE</code> and <code>OPTION__REPORT</code>.
		 */
		public static final String OPTION__DIFFERENT_PROPERTY_STATICITY = "DIFFERENT_PROPERTY_STATICITY"; //$NON-NLS-1$

		/**
		 * The option for handling cases where the uniqueness of merged
		 * properties does not match. Supported choices are
		 * <code>OPTION__IGNORE</code> and <code>OPTION__REPORT</code>.
		 */
		public static final String OPTION__DIFFERENT_PROPERTY_UNIQUENESS = "DIFFERENT_PROPERTY_UNIQUENESS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a redundant generalization is
		 * detected. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__DISCARD</code>.
		 */
		public static final String OPTION__REDUNDANT_GENERALIZATIONS = "REDUNDANT_GENERALIZATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an implicit redefinition is
		 * detected. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__IMPLICIT_REDEFINITIONS = "IMPLICIT_REDEFINITIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an invalid redefinition is
		 * detected. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, <code>OPTION__DISCARD</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__INVALID_REDEFINITIONS = "INVALID_REDEFINITIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an invalid subset is detected.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, <code>OPTION__DISCARD</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__INVALID_SUBSETS = "INVALID_SUBSETS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an empty union is detected.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__EMPTY_UNIONS = "EMPTY_UNIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an association specialization is
		 * missing. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__ASSOCIATION_SPECIALIZATIONS = "ASSOCIATION_SPECIALIZATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where capability information is
		 * missing. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__CAPABILITIES = "CAPABILITIES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a classifier with an empty
		 * qualified name is detected. Supported choices are
		 * <code>OPTION__IGNORE</code> and <code>OPTION__REPORT</code>.
		 */
		public static final String OPTION__EMPTY_QUALIFIED_NAMES = "EMPTY_QUALIFIED_NAMES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an indistinguishable classifier
		 * is detected. Supported choices are <code>OPTION__IGNORE</code> and
		 * <code>OPTION__REPORT</code>.
		 */
		public static final String OPTION__INDISTINGUISHABLE_CLASSIFIERS = "INDISTINGUISHABLE_CLASSIFIERS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an attribute transformation
		 * should be performed. Supported choices are
		 * <code>OPTION__IGNORE</code>, <code>OPTION__REPORT</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__ATTRIBUTE_TRANSFORMATIONS = "ATTRIBUTE_TRANSFORMATIONS"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 1000;

		/**
		 * The diagnostic code for cases where the staticity of merged
		 * properties does not match.
		 */
		public static final int DIFFERENT_PROPERTY_STATICITY = DIAGNOSTIC_CODE_OFFSET + 1;

		/**
		 * The diagnostic code for cases where the uniqueness of merged
		 * properties does not match.
		 */
		public static final int DIFFERENT_PROPERTY_UNIQUENESS = DIAGNOSTIC_CODE_OFFSET + 2;

		/**
		 * The diagnostic code for cases where a redundant generalization is
		 * detected.
		 */
		public static final int REDUNDANT_GENERALIZATION = DIAGNOSTIC_CODE_OFFSET + 3;

		/**
		 * The diagnostic code for cases where an implicit redefinition is
		 * detected.
		 */
		public static final int IMPLICIT_REDEFINITION = DIAGNOSTIC_CODE_OFFSET + 4;

		/**
		 * The diagnostic code for cases where an invalid redefinition is
		 * detected.
		 */
		public static final int INVALID_REDEFINITION = DIAGNOSTIC_CODE_OFFSET + 5;

		/**
		 * The diagnostic code for cases where an invalid subset is detected.
		 */
		public static final int INVALID_SUBSET = DIAGNOSTIC_CODE_OFFSET + 6;

		/**
		 * The diagnostic code for cases where an empty union is detected.
		 */
		public static final int EMPTY_UNION = DIAGNOSTIC_CODE_OFFSET + 7;

		/**
		 * The diagnostic code for cases where an association specialization is
		 * missing.
		 */
		public static final int ASSOCIATION_SPECIALIZATION = DIAGNOSTIC_CODE_OFFSET + 8;

		/**
		 * The diagnostic code for cases where capability information is
		 * missing.
		 */
		public static final int CAPABILITY = DIAGNOSTIC_CODE_OFFSET + 9;

		/**
		 * The diagnostic code for cases where the qualified named of a
		 * classifier in a receiving or merged package is empty.
		 */
		public static final int EMPTY_QUALIFIED_NAME = DIAGNOSTIC_CODE_OFFSET + 10;

		/**
		 * The diagnostic code for cases where a classifier in a receiving or
		 * merged package is indistinguishable.
		 */
		public static final int INDISTINGUISHABLE_CLASSIFIER = DIAGNOSTIC_CODE_OFFSET + 11;

		/**
		 * The diagnostic code for cases where an attribute transformation
		 * should be performed.
		 */
		public static final int ATTRIBUTE_TRANSFORMATION = DIAGNOSTIC_CODE_OFFSET + 12;

		protected TemplateableElement receivingElement = null;

		protected Collection<? extends TemplateableElement> mergedElements = null;

		/**
		 * @deprecated Use the {@link #receivingElement}, instead.
		 */
		@Deprecated
		protected org.eclipse.uml2.uml.Package receivingPackage = null;

		/**
		 * @deprecated Use the {@link #mergedElements}, instead
		 */
		@Deprecated
		protected Collection<org.eclipse.uml2.uml.Package> mergedPackages = null;

		protected final Map<EObject, List<EObject>> resultingToMergedEObjectMap = new LinkedHashMap<EObject, List<EObject>>();

		protected Map<String, String> options = null;

		protected DiagnosticChain diagnostics = null;

		protected Map<Object, Object> context = null;

		protected <EO extends EObject> List<EO> getMatchCandidates(EO eObject) {
			Element baseElement = getBaseElement(eObject);

			if (baseElement == null) {
				EStructuralFeature eContainingFeature = eObject
					.eContainingFeature();

				if (eContainingFeature.isMany()) {
					@SuppressWarnings("unchecked")
					List<EO> values = (List<EO>) get(eObject.eContainer())
						.eGet(eContainingFeature);
					return values;
				} else {
					@SuppressWarnings("unchecked")
					EO value = (EO) get(eObject.eContainer()).eGet(
						eContainingFeature);
					return Collections.<EO> singletonList(value);
				}
			} else {
				@SuppressWarnings("unchecked")
				List<EO> stereotypeApplications = (List<EO>) ((Element) get(baseElement))
					.getStereotypeApplications();
				return stereotypeApplications;
			}
		}

		protected <EO extends EObject> List<EO> getMergedEObjects(
				EO resultingEObject) {
			@SuppressWarnings("unchecked")
			List<EO> mergedEObjects = (List<EO>) resultingToMergedEObjectMap
				.get(resultingEObject);

			return mergedEObjects == null
				? Collections.<EO> singletonList(resultingEObject)
				: (List<EO>) mergedEObjects;
		}

		protected <EO extends EObject> EO getPreviouslyMergedEObject(
				EO resultingEObject) {
			List<EO> mergedEObjects = getMergedEObjects(resultingEObject);
			return mergedEObjects.get(mergedEObjects.size() - 1);
		}

		protected String getResultingQName(EObject eObject) {
			StringBuffer resultingQName = appendResultingQName(
				new StringBuffer(), eObject, QualifiedTextProvider.DEFAULT);

			return resultingQName.toString();
		}

		private StringBuffer appendResultingQName(StringBuffer resultingQName,
				EObject eObject, QualifiedTextProvider qualifiedTextProvider) {
			eObject = mergedElements.contains(eObject)
				? receivingElement
				: eObject;

			EObject eContainer = eObject.eContainer();

			if (eContainer != null) {
				appendResultingQName(resultingQName, eContainer,
					qualifiedTextProvider);

				if (resultingQName.length() > 0) {
					resultingQName.append(qualifiedTextProvider.getSeparator());
				}
			}

			return getQualifiedTextSegment(eObject, qualifiedTextProvider,
				resultingQName);
		}

		protected void mergeAssociation_IsDerived(
				Association receivingAssociation, Association mergedAssociation) {
			boolean receivingIsDerived = receivingAssociation.isDerived();
			boolean resultingIsDerived = receivingIsDerived
				|| mergedAssociation.isDerived();

			if (receivingIsDerived != resultingIsDerived) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.ASSOCIATION__IS_DERIVED,
											receivingAssociation,
											mergedAssociation)),
								new Object[]{receivingAssociation}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.ASSOCIATION__IS_DERIVED,
											receivingAssociation,
											mergedAssociation)),
								new Object[]{receivingAssociation}));
					}

					receivingAssociation.setIsDerived(resultingIsDerived);
				}

			}
		}

		protected void mergeClassifier_IsAbstract(
				Classifier receivingClassifier, Classifier mergedClassifier) {
			boolean receivingIsAbstract = receivingClassifier.isAbstract();
			boolean resultingIsAbstract = receivingIsAbstract
				&& mergedClassifier.isAbstract();

			if (receivingIsAbstract != resultingIsAbstract) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT,
											receivingClassifier,
											mergedClassifier)),
								new Object[]{receivingClassifier}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT,
											receivingClassifier,
											mergedClassifier)),
								new Object[]{receivingClassifier}));
					}

					receivingClassifier.setIsAbstract(resultingIsAbstract);
				}
			}
		}

		protected void mergeClassifier_IsFinalSpecialization(
				Classifier receivingClassifier, Classifier mergedClassifier) {
			boolean receivingIsFinalSpecialization = receivingClassifier
				.isFinalSpecialization();
			boolean resultingIsFinalSpecification = receivingIsFinalSpecialization
				&& mergedClassifier.isFinalSpecialization();

			if (receivingIsFinalSpecialization != resultingIsFinalSpecification) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION,
											receivingClassifier,
											mergedClassifier)),
								new Object[]{receivingClassifier}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION,
											receivingClassifier,
											mergedClassifier)),
								new Object[]{receivingClassifier}));
					}

					receivingClassifier
						.setIsFinalSpecialization(resultingIsFinalSpecification);
				}
			}
		}

		/**
		 * @deprecated 4.2 these values are only merged in the context of
		 *             MultiplicityElement lower-bounds, which is done by the
		 *             {@link #mergeMultiplicityElement_Lower(MultiplicityElement, MultiplicityElement)}
		 *             method
		 */
		@Deprecated
		protected void mergeLiteralInteger_Value(
				LiteralInteger receivingLiteralInteger,
				LiteralInteger mergedLiteralInteger) {
			receivingLiteralInteger.setValue(getLesserLowerBound(
				receivingLiteralInteger.getValue(),
				mergedLiteralInteger.getValue()));
		}

		/**
		 * @deprecated 4.2 these values are only merged in the context of
		 *             MultiplicityElement upper-bounds, which is done by the
		 *             {@link #mergeMultiplicityElement_Upper(MultiplicityElement, MultiplicityElement)}
		 *             method
		 */
		@Deprecated
		protected void mergeLiteralUnlimitedNatural_Value(
				LiteralUnlimitedNatural receivingLiteralUnlimitedNatural,
				LiteralUnlimitedNatural mergedLiteralUnlimitedNatural) {
			receivingLiteralUnlimitedNatural.setValue(getGreaterUpperBound(
				receivingLiteralUnlimitedNatural.getValue(),
				mergedLiteralUnlimitedNatural.getValue()));
		}

		protected void mergeMultiplicityElement_IsOrdered(
				MultiplicityElement receivingMultiplicityElement,
				MultiplicityElement mergedMultiplicityElement) {
			boolean receivingIsOrdered = receivingMultiplicityElement
				.isOrdered();
			boolean resultingIsOrdered = receivingIsOrdered
				|| mergedMultiplicityElement.isOrdered();

			if (receivingIsOrdered != resultingIsOrdered) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}

					receivingMultiplicityElement
						.setIsOrdered(resultingIsOrdered);
				}
			}
		}

		protected void mergeMultiplicityElement_IsUnique(
				MultiplicityElement receivingMultiplicityElement,
				MultiplicityElement mergedMultiplicityElement) {
			boolean receivingIsUnique = receivingMultiplicityElement.isUnique();
			boolean resultingIsUnique = receivingIsUnique
				&& mergedMultiplicityElement.isUnique();

			if (receivingIsUnique != resultingIsUnique) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}

					receivingMultiplicityElement.setIsUnique(resultingIsUnique);
				}
			}
		}

		protected void mergeMultiplicityElement_Lower(
				MultiplicityElement receivingMultiplicityElement,
				MultiplicityElement mergedMultiplicityElement) {
			int receivingLower = receivingMultiplicityElement.getLower();
			int resultingLower = getLesserLowerBound(receivingLower,
				mergedMultiplicityElement.getLower());

			if (receivingLower != resultingLower) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}

					receivingMultiplicityElement.setLower(resultingLower);
				}
			}
		}

		protected void mergeMultiplicityElement_Upper(
				MultiplicityElement receivingMultiplicityElement,
				MultiplicityElement mergedMultiplicityElement) {
			int receivingUpper = receivingMultiplicityElement.getUpper();
			int resultingUpper = getGreaterUpperBound(receivingUpper,
				mergedMultiplicityElement.getUpper());

			if (receivingUpper != resultingUpper) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER,
											receivingMultiplicityElement,
											mergedMultiplicityElement)),
								new Object[]{receivingMultiplicityElement}));
					}

					receivingMultiplicityElement.setUpper(resultingUpper);
				}
			}
		}

		protected void mergeNamedElement_Visibility(
				NamedElement receivingNamedElement,
				NamedElement mergedNamedElement) {
			VisibilityKind receivingVisibility = receivingNamedElement
				.getVisibility();
			VisibilityKind resultingVisibility = receivingVisibility == VisibilityKind.PRIVATE_LITERAL
				&& mergedNamedElement.getVisibility() == VisibilityKind.PRIVATE_LITERAL
				? VisibilityKind.PRIVATE_LITERAL
				: VisibilityKind.PUBLIC_LITERAL;

			if (receivingVisibility != resultingVisibility) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY,
											receivingNamedElement,
											mergedNamedElement)),
								new Object[]{receivingNamedElement}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY,
											receivingNamedElement,
											mergedNamedElement)),
								new Object[]{receivingNamedElement}));
					}

					receivingNamedElement.setVisibility(resultingVisibility);
				}
			}
		}

		protected void mergeProperty_IsDerived(Property receivingProperty,
				Property mergedProperty) {
			boolean receivingIsDerived = receivingProperty.isDerived();
			boolean resultingIsDerived = receivingIsDerived
				|| mergedProperty.isDerived();

			if (receivingIsDerived != resultingIsDerived) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.PROPERTY__IS_DERIVED,
											receivingProperty, mergedProperty)),
								new Object[]{receivingProperty}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.PROPERTY__IS_DERIVED,
											receivingProperty, mergedProperty)),
								new Object[]{receivingProperty}));
					}

					receivingProperty.setIsDerived(resultingIsDerived);
				}
			}
		}

		protected void mergeProperty_IsDerivedUnion(Property receivingProperty,
				Property mergedProperty) {
			boolean receivingIsDerivedUnion = receivingProperty
				.isDerivedUnion();
			boolean resultingIsDerivedUnion = receivingIsDerivedUnion
				|| mergedProperty.isDerivedUnion();

			if (receivingIsDerivedUnion != resultingIsDerivedUnion) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.PROPERTY__IS_DERIVED_UNION,
											receivingProperty, mergedProperty)),
								new Object[]{receivingProperty}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.PROPERTY__IS_DERIVED_UNION,
											receivingProperty, mergedProperty)),
								new Object[]{receivingProperty}));
					}

					receivingProperty
						.setIsDerivedUnion(resultingIsDerivedUnion);
				}
			}
		}

		protected void mergeRedefinableElement_IsLeaf(
				RedefinableElement receivingRedefinableElement,
				RedefinableElement mergedRedefinableElement) {
			boolean receivingIsLeaf = receivingRedefinableElement.isLeaf();
			boolean resultingIsLeaf = receivingIsLeaf
				&& mergedRedefinableElement.isLeaf();

			if (receivingIsLeaf != resultingIsLeaf) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.REDEFINABLE_ELEMENT__IS_LEAF,
											receivingRedefinableElement,
											mergedRedefinableElement)),
								new Object[]{receivingRedefinableElement}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.REDEFINABLE_ELEMENT__IS_LEAF,
											receivingRedefinableElement,
											mergedRedefinableElement)),
								new Object[]{receivingRedefinableElement}));
					}

					receivingRedefinableElement.setIsLeaf(resultingIsLeaf);
				}
			}
		}

		protected void mergeStructuralFeature_IsReadOnly(
				StructuralFeature receivingStructuralFeature,
				StructuralFeature mergedStructuralFeature) {
			boolean receivingIsReadOnly = receivingStructuralFeature
				.isReadOnly();
			boolean resultingIsReadOnly = receivingIsReadOnly
				&& mergedStructuralFeature.isReadOnly();

			if (receivingIsReadOnly != resultingIsReadOnly) {

				if (options != null
					&& OPTION__REPORT.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.STRUCTURAL_FEATURE__IS_READ_ONLY,
											receivingStructuralFeature,
											mergedStructuralFeature)),
								new Object[]{receivingStructuralFeature}));
					}
				} else {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ATTRIBUTE_TRANSFORMATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ProcessAttributeTransformation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(
											context,
											UMLPackage.Literals.STRUCTURAL_FEATURE__IS_READ_ONLY,
											receivingStructuralFeature,
											mergedStructuralFeature)),
								new Object[]{receivingStructuralFeature}));
					}

					receivingStructuralFeature
						.setIsReadOnly(resultingIsReadOnly);
				}
			}
		}

		@Override
		protected void copyAttribute(EAttribute eAttribute, EObject eObject,
				EObject copyEObject) {

			if (eObject != copyEObject) {

				if (copyEObject == receivingElement) {
					return;
				} else if (EcoreUtil.isAncestor(receivingElement, copyEObject)
					&& options != null
					&& !OPTION__IGNORE.equals(options
						.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

					if (eAttribute == UMLPackage.Literals.ASSOCIATION__IS_DERIVED) {
						mergeAssociation_IsDerived((Association) copyEObject,
							(Association) eObject);
					} else if (eAttribute == UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT) {
						mergeClassifier_IsAbstract((Classifier) copyEObject,
							(Classifier) eObject);
					} else if (eAttribute == UMLPackage.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION) {
						mergeClassifier_IsFinalSpecialization(
							(Classifier) copyEObject, (Classifier) eObject);
					} else if (eAttribute == UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED) {
						mergeMultiplicityElement_IsOrdered(
							(MultiplicityElement) copyEObject,
							(MultiplicityElement) eObject);
					} else if (eAttribute == UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE) {
						mergeMultiplicityElement_IsUnique(
							(MultiplicityElement) copyEObject,
							(MultiplicityElement) eObject);
					} else if (eAttribute == UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY) {
						mergeNamedElement_Visibility(
							(NamedElement) copyEObject, (NamedElement) eObject);
					} else if (eAttribute == UMLPackage.Literals.PROPERTY__IS_DERIVED) {
						mergeProperty_IsDerived((Property) copyEObject,
							(Property) eObject);
					} else if (eAttribute == UMLPackage.Literals.PROPERTY__IS_DERIVED_UNION) {
						mergeProperty_IsDerivedUnion((Property) copyEObject,
							(Property) eObject);
					} else if (eAttribute == UMLPackage.Literals.REDEFINABLE_ELEMENT__IS_LEAF) {
						mergeRedefinableElement_IsLeaf(
							(RedefinableElement) copyEObject,
							(RedefinableElement) eObject);
					} else if (eAttribute == UMLPackage.Literals.STRUCTURAL_FEATURE__IS_READ_ONLY) {
						mergeStructuralFeature_IsReadOnly(
							(StructuralFeature) copyEObject,
							(StructuralFeature) eObject);
					} else {
						super.copyAttribute(eAttribute, eObject, copyEObject);
					}
				} else {
					super.copyAttribute(eAttribute, eObject, copyEObject);
				}
			}
		}

		@Override
		protected void copyContainment(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if ((eReference == UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE || eReference == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE)
				&& EcoreUtil.isAncestor(receivingElement, copyEObject)
				&& options != null
				&& !OPTION__IGNORE.equals(options
					.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

				return;
			}

			if (eObject != copyEObject) {

				if (eReference.isMany()) {
					@SuppressWarnings("unchecked")
					List<EObject> sourceList = (List<EObject>) eObject
						.eGet(eReference);
					@SuppressWarnings("unchecked")
					InternalEList<EObject> targetList = (InternalEList<EObject>) copyEObject
						.eGet(getTarget(eReference));

					for (EObject childEObject : sourceList) {
						EObject copyChildEObject = copy(childEObject);

						if (childEObject != copyChildEObject) {
							targetList.addUnique(copyChildEObject);
						}
					}
				} else {
					EObject childEObject = (EObject) eObject.eGet(eReference);
					EObject copyChildEObject = childEObject == null
						? null
						: copy(childEObject);

					if (childEObject != copyChildEObject) {
						copyEObject.eSet(getTarget(eReference),
							copyChildEObject);
					}
				}
			}
		}

		protected void mergeTypedElement_Type(
				TypedElement receivingTypedElement,
				TypedElement mergedTypedElement) {
			Type receivingType = receivingTypedElement.getType();
			Type mergedType = mergedTypedElement.getType();

			if (receivingType != null && mergedType instanceof Classifier) {
				EList<Classifier> allParents = ((Classifier) mergedType)
					.allParents();

				for (EObject mergedEObject : getMergedEObjects(receivingType)) {

					if (findEObject(allParents, new ResultingQNameMatcher(
						mergedEObject)) != null) {

						mergedType = (Type) mergedEObject;
					}
				}
			}

			Type resultingType = mergedType == null
				? null
				: (Type) get(mergedType);

			receivingTypedElement.setType(resultingType == null
				? mergedType
				: resultingType);
		}

		@Override
		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject != copyEObject && eObject.eIsSet(eReference)) {

				if (eReference == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {
					mergeTypedElement_Type((TypedElement) copyEObject,
						(TypedElement) eObject);
				} else if (eReference.isMany()) {
					@SuppressWarnings("unchecked")
					List<EObject> sourceList = (List<EObject>) eObject
						.eGet(eReference);
					@SuppressWarnings("unchecked")
					InternalEList<EObject> targetList = (InternalEList<EObject>) copyEObject
						.eGet(getTarget(eReference));

					boolean isBidirectional = eReference.getEOpposite() != null;
					int index = 0;

					for (EObject referencedEObject : sourceList) {
						EObject copyReferencedEObject = get(referencedEObject);

						if (copyReferencedEObject == null) {

							if (!isBidirectional) {

								if (!targetList.contains(referencedEObject)) {
									targetList.addUnique(index,
										referencedEObject);
								}

								index++;
							}
						} else {

							if (isBidirectional) {
								int position = targetList
									.indexOf(copyReferencedEObject);

								if (position == -1) {
									targetList.addUnique(index,
										copyReferencedEObject);
								} else if (index != position) {
									targetList.move(index,
										copyReferencedEObject);
								}
							} else if (!targetList
								.contains(copyReferencedEObject)) {

								targetList.addUnique(index,
									copyReferencedEObject);
							}

							index++;
						}
					}
				} else {
					super.copyReference(eReference, eObject, copyEObject);
				}
			}
		}

		protected EObjectMatcher getAssociationMatcher(Association association) {
			return new NameMatcher(association);
		}

		@Override
		protected EObject createCopy(EObject eObject) {
			EObject copyEObject = new UMLSwitch<EObject>() {

				@Override
				public EObject caseAssociation(Association association) {
					Association matchingAssociation = (Association) findEObject(
						getMatchCandidates(association),
						getAssociationMatcher(association));

					return matchingAssociation == null
						? super.caseAssociation(association)
						: matchingAssociation;
				}

				@Override
				public EObject caseClass(org.eclipse.uml2.uml.Class class_) {
					org.eclipse.uml2.uml.Class matchingClass = (org.eclipse.uml2.uml.Class) findEObject(
						getMatchCandidates(class_), new NameMatcher(class_));

					return matchingClass == null
						? super.caseClass(class_)
						: matchingClass;
				}

				@Override
				public EObject caseComment(Comment comment) {
					Comment matchingComment = (Comment) findEObject(
						getMatchCandidates(comment), new BodyMatcher(comment));

					return matchingComment == null
						? super.caseComment(comment)
						: matchingComment;
				}

				@Override
				public EObject caseConstraint(Constraint constraint) {
					Constraint matchingConstraint = (Constraint) findEObject(
						getMatchCandidates(constraint), new NameMatcher(
							constraint));

					return matchingConstraint == null
						? super.caseConstraint(constraint)
						: matchingConstraint;
				}

				@Override
				public EObject caseDataType(DataType dataType) {
					DataType matchingDataType = (DataType) findEObject(
						getMatchCandidates(dataType), new NameMatcher(dataType));

					return matchingDataType == null
						? super.caseDataType(dataType)
						: matchingDataType;
				}

				@Override
				public EObject caseDirectedRelationship(
						DirectedRelationship directedRelationship) {

					if (mergedElements.containsAll(directedRelationship
						.getTargets())) {

						return directedRelationship;
					}

					DirectedRelationship matchingDirectedRelationship = (DirectedRelationship) findEObject(
						getMatchCandidates(directedRelationship),
						new EClassMatcher(directedRelationship) {

							@Override
							public boolean matches(EObject otherEObject) {

								if (super.matches(otherEObject)) {
									otherEObject = getPreviouslyMergedEObject(otherEObject);

									List<Element> targets = ((DirectedRelationship) eObject)
										.getTargets();
									List<Element> otherTargets = ((DirectedRelationship) otherEObject)
										.getTargets();

									if (targets.size() == otherTargets.size()) {

										for (Element target : targets) {

											if (findEObject(otherTargets,
												new ResultingQNameMatcher(
													target)) == null) {

												return false;
											}
										}

										return true;
									}
								}

								return false;
							}
						});

					return matchingDirectedRelationship == null
						? super.caseDirectedRelationship(directedRelationship)
						: matchingDirectedRelationship;
				}

				@Override
				public EObject caseEnumerationLiteral(
						EnumerationLiteral enumerationLiteral) {
					EnumerationLiteral matchingEnumerationLiteral = (EnumerationLiteral) findEObject(
						getMatchCandidates(enumerationLiteral),
						new NameMatcher(enumerationLiteral));

					return matchingEnumerationLiteral == null
						? super.caseEnumerationLiteral(enumerationLiteral)
						: matchingEnumerationLiteral;
				}

				@Override
				public EObject caseOperation(Operation operation) {
					Operation matchingOperation = (Operation) findEObject(
						getMatchCandidates(operation), new NameMatcher(
							operation) {

							@Override
							public boolean matches(EObject otherEObject) {

								if (super.matches(otherEObject)) {
									otherEObject = getPreviouslyMergedEObject(otherEObject);

									List<Parameter> ownedParameters = ((Operation) eObject)
										.getOwnedParameters();
									List<Parameter> otherOwnedParameters = ((Operation) otherEObject)
										.getOwnedParameters();

									if (ownedParameters.size() == otherOwnedParameters
										.size()) {

										for (int i = 0; i < ownedParameters
											.size(); i++) {

											if (!new TypeMatcher(
												ownedParameters.get(i))
												.matches(otherOwnedParameters
													.get(i))) {

												return false;
											}
										}

										return true;
									}
								}

								return false;
							}
						});

					return matchingOperation == null
						? super.caseOperation(operation)
						: matchingOperation;
				}

				@Override
				public EObject casePackage(org.eclipse.uml2.uml.Package package_) {
					org.eclipse.uml2.uml.Package matchingPackage = null;

					if (mergedElements.contains(package_)) {
						matchingPackage = (org.eclipse.uml2.uml.Package) receivingElement;
					} else {
						matchingPackage = (org.eclipse.uml2.uml.Package) findEObject(
							getMatchCandidates(package_), new NameMatcher(
								package_));
					}

					return matchingPackage == null
						? super.casePackage(package_)
						: matchingPackage;
				}

				@Override
				public EObject caseParameter(Parameter parameter) {
					Parameter matchingParameter = (Parameter) findEObject(
						getMatchCandidates(parameter), new NameMatcher(
							parameter));

					return matchingParameter == null
						? super.caseParameter(parameter)
						: matchingParameter;
				}

				@Override
				public EObject caseProperty(Property property) {
					Property matchingProperty = (Property) findEObject(
						getMatchCandidates(property), new NameMatcher(property));

					return matchingProperty == null
						? super.caseProperty(property)
						: matchingProperty;
				}

				@Override
				public EObject defaultCase(EObject eObject) {
					Element baseElement = getBaseElement(eObject);

					return baseElement == null
						? PackageMerger.super.createCopy(eObject)
						: applyStereotype((Element) get(baseElement),
							getTarget(eObject.eClass()));
				}

				@Override
				protected EObject doSwitch(EClass theEClass, EObject theEObject) {

					if (theEClass.eContainer() != modelPackage) {

						if (theEClass == EcorePackage.Literals.EANNOTATION) {
							EAnnotation matchingEAnnotation = (EAnnotation) findEObject(
								getMatchCandidates(theEObject),
								new SourceMatcher((EAnnotation) theEObject));

							if (matchingEAnnotation != null) {
								return matchingEAnnotation;
							}
						} else if (theEClass == EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY) {
							@SuppressWarnings("unchecked")
							BasicEMap.Entry<String, String> matchingEntry = (BasicEMap.Entry<String, String>) findEObject(
								getMatchCandidates(theEObject),
								new KeyMatcher(
									(BasicEMap.Entry<String, String>) theEObject));

							if (matchingEntry != null) {
								return (EObject) matchingEntry;
							}
						} else if (getStereotype(theEClass, theEObject) != null) {
							EObject matchingEObject = findEObject(
								getMatchCandidates(theEObject),
								new EClassMatcher(theEObject));

							if (matchingEObject != null) {
								return matchingEObject;
							}
						}
					}

					return super.doSwitch(theEClass, theEObject);
				}
			}.doSwitch(eObject);

			if (copyEObject instanceof MultiplicityElement
				&& EcoreUtil.isAncestor(receivingElement, copyEObject)
				&& options != null
				&& !OPTION__IGNORE.equals(options
					.get(OPTION__ATTRIBUTE_TRANSFORMATIONS))) {

				MultiplicityElement receivingMultiplicityElement = (MultiplicityElement) copyEObject;
				MultiplicityElement mergedMultiplicityElement = (MultiplicityElement) eObject;

				mergeMultiplicityElement_Lower(receivingMultiplicityElement,
					mergedMultiplicityElement);
				mergeMultiplicityElement_Upper(receivingMultiplicityElement,
					mergedMultiplicityElement);
			}

			return copyEObject;
		}

		@Override
		public EObject copy(EObject eObject) {
			EObject copyEObject = super.copy(eObject);

			if (eObject != copyEObject) {
				List<EObject> mergedEObjects = resultingToMergedEObjectMap
					.get(copyEObject);

				if (mergedEObjects == null) {
					resultingToMergedEObjectMap
						.put(
							copyEObject,
							mergedEObjects = new UniqueEList.FastCompare<EObject>(
								1));
				}

				// the forward mapping
				mergedEObjects.add(eObject);
			}

			if (DEBUG) {
				System.out.println(getQualifiedText(eObject) + "->" //$NON-NLS-1$
					+ getQualifiedText(copyEObject));
			}

			return copyEObject;
		}

		@Override
		public <T> Collection<T> copyAll(Collection<? extends T> eObjects) {
			Collection<T> result = new ArrayList<T>(eObjects.size());

			for (Object object : eObjects) {
				@SuppressWarnings("unchecked")
				T copy = (T) copy((EObject) object);
				result.add(copy);

				for (TreeIterator<EObject> eAllContents = ((EObject) object)
					.eAllContents(); eAllContents.hasNext();) {

					EObject childEObject = eAllContents.next();

					if (childEObject instanceof Element) {
						@SuppressWarnings("unchecked")
						Collection<T> copies = (Collection<T>) super
							.copyAll(((Element) childEObject)
								.getStereotypeApplications());
						result.addAll(copies);
					}
				}
			}

			return result;
		}

		protected Collection<org.eclipse.uml2.uml.Package> getAllMergedPackages(
				org.eclipse.uml2.uml.Package package_) {
			return getAllMergedPackages(package_,
				new UniqueEList.FastCompare<org.eclipse.uml2.uml.Package>());
		}

		private Collection<org.eclipse.uml2.uml.Package> getAllMergedPackages(
				org.eclipse.uml2.uml.Package package_,
				Collection<org.eclipse.uml2.uml.Package> allMergedPackages) {

			return getAllMergedPackages(package_, allMergedPackages,
				new UniqueEList.FastCompare<org.eclipse.uml2.uml.Package>());
		}

		private Collection<org.eclipse.uml2.uml.Package> getAllMergedPackages(
				org.eclipse.uml2.uml.Package package_,
				Collection<org.eclipse.uml2.uml.Package> allMergedPackages,
				Collection<org.eclipse.uml2.uml.Package> visitedPackages) {

			for (PackageMerge packageMerge : package_.getPackageMerges()) {
				org.eclipse.uml2.uml.Package mergedPackage = packageMerge
					.getMergedPackage();

				if (mergedPackage != null && visitedPackages.add(mergedPackage)) {

					getAllMergedPackages(mergedPackage, allMergedPackages,
						visitedPackages);
					allMergedPackages.add(mergedPackage);
				}
			}

			return allMergedPackages;
		}

		/**
		 * Updates the merge results to replace references to elements in merged
		 * packages by references to their counterparts in the merge result.
		 * This accounts for any references that the receiving package had to
		 * elements in the merged packages before the merge.
		 * 
		 * @since 5.0
		 */
		protected void updateReferences() {

			for (Iterator<EObject> iter = EcoreUtil.getAllContents(Collections
				.singleton(receivingElement)); iter.hasNext();) {

				EObject next = iter.next();

				// UML does not use feature maps, so this is simpler than it
				// might have been
				for (EReference reference : next.eClass().getEAllReferences()) {

					if (!reference.isContainment() && !reference.isContainer()
						&& reference.isChangeable() && !reference.isDerived()) {

						if (!reference.isMany()) {
							// get the object, if any, that the next referenced
							// element was merged into
							EObject mergeResult = get((EObject) next
								.eGet(reference));

							if (mergeResult != null) {
								// replace the reference with the merge result
								next.eSet(reference, mergeResult);
							}
						} else {
							@SuppressWarnings("unchecked")
							ListIterator<EObject> xrefs = ((EList<EObject>) next
								.eGet(reference)).listIterator();

							while (xrefs.hasNext()) {
								// get the object, if any, that the next
								// referenced element was merged into
								EObject mergeResult = get(xrefs.next());

								if (mergeResult != null) {
									// replace the reference with the merge
									// result
									xrefs.set(mergeResult);
								}
							}
						}
					}
				}
			}
		}

		protected void processDifferentPropertyStaticity(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (Map.Entry<EObject, List<EObject>> entry : resultingToMergedEObjectMap
				.entrySet()) {
				EObject key = entry.getKey();

				if (key instanceof Property) {
					Property property = (Property) key;

					for (EObject mergedProperty : entry.getValue()) {

						if (OPTION__REPORT.equals(options
							.get(OPTION__DIFFERENT_PROPERTY_STATICITY))
							&& diagnostics != null) {

							if (property.isStatic() != ((Property) mergedProperty)
								.isStatic()) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										UMLValidator.DIAGNOSTIC_SOURCE,
										DIFFERENT_PROPERTY_STATICITY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportDifferentPropertyStaticity_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, property,
													mergedProperty)),
										new Object[]{property, mergedProperty}));
							}
						}
					}
				}
			}
		}

		protected void processDifferentPropertyUniqueness(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (Map.Entry<EObject, List<EObject>> entry : resultingToMergedEObjectMap
				.entrySet()) {
				EObject key = entry.getKey();

				if (key instanceof Property) {
					Property property = (Property) key;

					for (EObject mergedProperty : entry.getValue()) {

						if (OPTION__REPORT.equals(options
							.get(OPTION__DIFFERENT_PROPERTY_UNIQUENESS))
							&& diagnostics != null) {

							if (property.isUnique() != ((Property) mergedProperty)
								.isUnique()) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										UMLValidator.DIAGNOSTIC_SOURCE,
										DIFFERENT_PROPERTY_UNIQUENESS,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportDifferentPropertyUniqueness_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, property,
													mergedProperty)),
										new Object[]{property, mergedProperty}));
							}
						}
					}
				}
			}
		}

		protected void processImplicitRedefinitions(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (EObject resultingEObject : resultingToMergedEObjectMap
				.keySet()) {

				if (resultingEObject instanceof Feature) {
					Feature redefiningFeature = (Feature) resultingEObject;
					EList<Feature> redefinedFeatures = getRedefinedFeatures(redefiningFeature);

					for (Feature validRedefinition : findValidRedefinitions(
						redefiningFeature, redefiningFeature.getName())) {

						if (!redefinedFeatures.contains(validRedefinition)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__IMPLICIT_REDEFINITIONS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											IMPLICIT_REDEFINITION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_ProcessImplicitFeatureRedefinition_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														redefiningFeature,
														validRedefinition)),
											new Object[]{redefiningFeature,
												validRedefinition}));
								}

								redefinedFeatures.add(validRedefinition);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__IMPLICIT_REDEFINITIONS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										IMPLICIT_REDEFINITION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportImplicitFeatureRedefinition_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, redefiningFeature,
													validRedefinition)),
										new Object[]{redefiningFeature,
											validRedefinition}));
							}
						}
					}
				}
			}
		}

		protected void processInvalidRedefinitions(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (EObject resultingEObject : resultingToMergedEObjectMap
				.keySet()) {

				if (resultingEObject instanceof Feature) {
					Feature redefiningFeature = (Feature) resultingEObject;
					EList<Feature> redefinedFeatures = getRedefinedFeatures(redefiningFeature);

					for (Feature redefinedFeature : new ArrayList<Feature>(
						redefinedFeatures)) {

						if (!UMLUtil.isRedefinitionValid(redefiningFeature,
							redefinedFeature)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__INVALID_REDEFINITIONS))
								|| OPTION__DISCARD.equals(options
									.get(OPTION__INVALID_REDEFINITIONS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											INVALID_REDEFINITION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_DiscardInvalidFeatureRedefinition_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														redefiningFeature,
														redefinedFeature)),
											new Object[]{redefiningFeature,
												redefinedFeature}));
								}

								redefinedFeatures.remove(redefinedFeature);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__INVALID_REDEFINITIONS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										INVALID_REDEFINITION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportInvalidFeatureRedefinition_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, redefiningFeature,
													redefinedFeature)),
										new Object[]{redefiningFeature,
											redefinedFeature}));
							}
						}

						if (OPTION__PROCESS.equals(options
							.get(OPTION__INVALID_REDEFINITIONS))) {

							Collection<Feature> validRedefinitions = findValidRedefinitions(
								redefiningFeature, redefinedFeature.getName());

							if (!validRedefinitions.isEmpty()) {

								for (Feature validRedefinition : validRedefinitions) {

									if (!redefinedFeatures
										.contains(validRedefinition)) {

										if (diagnostics != null) {
											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.INFO,
													UMLValidator.DIAGNOSTIC_SOURCE,
													INVALID_REDEFINITION,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_PackageMerger_ProcessInvalidRedefinition_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																redefiningFeature,
																redefinedFeature,
																validRedefinition)),
													new Object[]{
														redefiningFeature,
														validRedefinition}));
										}

										redefinedFeatures
											.add(validRedefinition);
									}
								}

								if (!validRedefinitions
									.contains(redefinedFeature)) {

									redefinedFeatures.remove(redefinedFeature);
								}
							}
						}
					}
				}
			}
		}

		protected void processInvalidSubsets(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (EObject resultingEObject : resultingToMergedEObjectMap
				.keySet()) {

				if (resultingEObject instanceof Property) {
					Property subsettingProperty = (Property) resultingEObject;
					EList<Property> subsettedProperties = subsettingProperty
						.getSubsettedProperties();

					for (Property subsettedProperty : new ArrayList<Property>(
						subsettedProperties)) {

						if (!UMLUtil.isSubsetValid(subsettingProperty,
							subsettedProperty)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__INVALID_SUBSETS))
								|| OPTION__DISCARD.equals(options
									.get(OPTION__INVALID_SUBSETS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											INVALID_SUBSET,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_DiscardInvalidSubset_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														subsettingProperty,
														subsettedProperty)),
											new Object[]{subsettingProperty,
												subsettedProperty}));
								}

								subsettedProperties.remove(subsettedProperty);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__INVALID_SUBSETS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										INVALID_SUBSET,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportInvalidSubset_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context,
													subsettingProperty,
													subsettedProperty)),
										new Object[]{subsettingProperty,
											subsettedProperty}));
							}

							if (OPTION__PROCESS.equals(options
								.get(OPTION__INVALID_SUBSETS))) {

								Collection<Property> validSubsets = findValidSubsets(
									subsettingProperty,
									subsettedProperty.getName());

								if (!validSubsets.isEmpty()) {

									for (Property validSubset : validSubsets) {

										if (!subsettedProperties
											.contains(validSubset)) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.INFO,
														UMLValidator.DIAGNOSTIC_SOURCE,
														INVALID_SUBSET,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_PackageMerger_ProcessInvalidSubset_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	subsettingProperty,
																	subsettedProperty,
																	validSubset)),
														new Object[]{
															subsettingProperty,
															validSubset}));
											}

											subsettedProperties
												.add(validSubset);
										}
									}

									if (!validSubsets
										.contains(subsettedProperty)) {
										subsettedProperties
											.remove(subsettedProperty);
									}
								}
							}
						}
					}
				}
			}
		}

		protected void processEmptyUnions(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Map<Property, EList<Property>> unionToSubsettingPropertyMap = new LinkedHashMap<Property, EList<Property>>();

			for (EObject resultingEObject : resultingToMergedEObjectMap
				.keySet()) {

				if (resultingEObject instanceof Property) {
					Property property = (Property) resultingEObject;

					if (property.isDerivedUnion()
						&& !unionToSubsettingPropertyMap.containsKey(property)) {

						unionToSubsettingPropertyMap.put(property,
							new UniqueEList.FastCompare<Property>());
					}

					for (Property subsettedProperty : property
						.getSubsettedProperties()) {

						if (subsettedProperty.isDerivedUnion()) {
							EList<Property> subsettingProperties = unionToSubsettingPropertyMap
								.get(subsettedProperty);

							if (subsettingProperties == null) {
								unionToSubsettingPropertyMap
									.put(
										subsettedProperty,
										subsettingProperties = new UniqueEList.FastCompare<Property>());
							}

							subsettingProperties.add(property);
						}
					}
				}
			}

			for (Map.Entry<Property, EList<Property>> entry : unionToSubsettingPropertyMap
				.entrySet()) {

				if (entry.getValue().isEmpty()) {
					Property unionProperty = entry.getKey();

					if (OPTION__PROCESS.equals(options
						.get(OPTION__EMPTY_UNIONS))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									EMPTY_UNION,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_PackageMerger_ProcessEmptyUnion_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												unionProperty)),
									new Object[]{unionProperty}));
						}

						unionProperty.setIsDerivedUnion(false);
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__EMPTY_UNIONS)) && diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								EMPTY_UNION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportEmptyUnion_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											unionProperty)),
								new Object[]{unionProperty}));
					}
				}
			}
		}

		protected void processRedundantGeneralizations(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (EObject resultingEObject : resultingToMergedEObjectMap
				.keySet()) {

				if (resultingEObject instanceof Classifier) {
					Classifier classifier = (Classifier) resultingEObject;
					EList<Generalization> generalizations = classifier
						.getGeneralizations();

					for (Generalization generalization : new ArrayList<Generalization>(
						generalizations)) {

						Classifier general = generalization.getGeneral();

						if (general != null) {
							EList<Classifier> generalAllParents = general
								.allParents();

							for (Iterator<Generalization> g = generalizations
								.iterator(); g.hasNext();) {

								Generalization otherGeneralization = g.next();
								Classifier otherGeneral = otherGeneralization
									.getGeneral();

								if (general != otherGeneral
									&& generalAllParents.contains(otherGeneral)
									&& !otherGeneralization
										.hasKeyword("extend")) { //$NON-NLS-1$

									if (OPTION__DISCARD
										.equals(options
											.get(OPTION__REDUNDANT_GENERALIZATIONS))) {

										if (diagnostics != null) {
											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.INFO,
													UMLValidator.DIAGNOSTIC_SOURCE,
													REDUNDANT_GENERALIZATION,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_PackageMerger_DiscardRedundantGeneralization_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																classifier,
																otherGeneral,
																general)),
													new Object[]{classifier,
														otherGeneral}));
										}

										g.remove();
										otherGeneralization.destroy();
									} else if (OPTION__REPORT
										.equals(options
											.get(OPTION__REDUNDANT_GENERALIZATIONS))
										&& diagnostics != null) {

										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.WARNING,
												UMLValidator.DIAGNOSTIC_SOURCE,
												REDUNDANT_GENERALIZATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_PackageMerger_ReportRedundantGeneralization_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															classifier,
															otherGeneral,
															general)),
												new Object[]{classifier,
													otherGeneral}));
									}

									break;
								}
							}
						}
					}
				}
			}
		}

		protected void processEmptyQualifiedNames(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			if (OPTION__REPORT.equals(options
				.get(OPTION__EMPTY_QUALIFIED_NAMES)) && diagnostics != null) {

				EList<org.eclipse.uml2.uml.Package> packages = new UniqueEList<org.eclipse.uml2.uml.Package>();

				if (receivingElement instanceof org.eclipse.uml2.uml.Package) {
					packages
						.add((org.eclipse.uml2.uml.Package) receivingElement);
					packages.addAll(EcoreUtil
						.<org.eclipse.uml2.uml.Package> getObjectsByType(
							mergedElements, UMLPackage.Literals.PACKAGE));
				}

				for (org.eclipse.uml2.uml.Package package_ : packages) {

					for (Type ownedType : package_.getOwnedTypes()) {

						if (UML2Util.isEmpty(ownedType.getQualifiedName())) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									UMLValidator.DIAGNOSTIC_SOURCE,
									EMPTY_QUALIFIED_NAME,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_PackageMerger_ReportEmptyQualifiedName_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												ownedType, package_)),
									new Object[]{ownedType, package_}));
						}
					}
				}
			}
		}

		protected void processIndistinguishableClassifiers(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			if (OPTION__REPORT.equals(options
				.get(OPTION__INDISTINGUISHABLE_CLASSIFIERS))
				&& diagnostics != null) {

				EList<org.eclipse.uml2.uml.Package> packages = new UniqueEList<org.eclipse.uml2.uml.Package>();

				if (receivingElement instanceof org.eclipse.uml2.uml.Package) {
					packages
						.add((org.eclipse.uml2.uml.Package) receivingElement);
					packages.addAll(EcoreUtil
						.<org.eclipse.uml2.uml.Package> getObjectsByType(
							mergedElements, UMLPackage.Literals.PACKAGE));
				}

				for (org.eclipse.uml2.uml.Package package_ : packages) {
					EList<Type> ownedTypes = package_.getOwnedTypes();

					for (Type ownedType : ownedTypes) {

						for (Type otherOwnedType : ownedTypes) {

							if (ownedType != otherOwnedType
								&& !ownedType.isDistinguishableFrom(
									otherOwnedType, package_)) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										UMLValidator.DIAGNOSTIC_SOURCE,
										INDISTINGUISHABLE_CLASSIFIER,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportIndistinguishableClassifier_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, ownedType,
													package_)), new Object[]{
											ownedType, package_}));
								break;
							}
						}
					}
				}
			}
		}

		protected void processAssociationSpecializations(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (EObject resultingEObject : resultingToMergedEObjectMap
				.keySet()) {

				if (resultingEObject instanceof Association) {
					Association association = (Association) resultingEObject;

					EList<Association> generalAssociations = new UniqueEList.FastCompare<Association>();

					for (Property memberEnd : association.getMemberEnds()) {

						for (Property redefinedProperty : memberEnd
							.getRedefinedProperties()) {

							Association redefinedAssociation = redefinedProperty
								.getAssociation();

							if (redefinedAssociation != null) {
								generalAssociations.add(redefinedAssociation);
							}
						}

						for (Property subsettedProperty : memberEnd
							.getSubsettedProperties()) {

							Association subsettedAssociation = subsettedProperty
								.getAssociation();

							if (subsettedAssociation != null) {
								generalAssociations.add(subsettedAssociation);
							}
						}
					}

					for (Association generalAssociation : generalAssociations) {

						if (!association.allParents().contains(
							generalAssociation)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__ASSOCIATION_SPECIALIZATIONS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											ASSOCIATION_SPECIALIZATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_ProcessAssociationSpecialization_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, association,
														generalAssociation)),
											new Object[]{association,
												generalAssociation}));
								}

								association
									.createGeneralization(generalAssociation);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__ASSOCIATION_SPECIALIZATIONS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										ASSOCIATION_SPECIALIZATION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportAssociationSpecialization_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, association,
													generalAssociation)),
										new Object[]{association,
											generalAssociation}));
							}
						}
					}
				}
			}
		}

		protected void processCapabilities(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (Map.Entry<EObject, List<EObject>> entry : resultingToMergedEObjectMap
				.entrySet()) {
				EObject resultingEObject = entry.getKey();
				NamedElement receivingElement = getReceivingElement(resultingEObject);

				if (receivingElement != null) {
					for (EObject mergedEObject : entry.getValue()) {
						NamedElement capabilityElement = getCapability((Element) mergedEObject);

						if (OPTION__PROCESS.equals(options
							.get(OPTION__CAPABILITIES))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										CAPABILITY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ProcessCapability_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, resultingEObject,
													capabilityElement)),
										new Object[]{resultingEObject,
											capabilityElement}));
							}

							String qualifiedName = capabilityElement
								.getQualifiedName();

							if (!UML2Util.isEmpty(qualifiedName)) {
								qualifiedName = qualifiedName.replace(
									NamedElement.SEPARATOR, "/"); //$NON-NLS-1$
							}

							EAnnotation eAnnotation = getEAnnotation(
								getEAnnotation(receivingElement,
									UML2_UML_PACKAGE_2_0_NS_URI, true),
								qualifiedName, true);

							eAnnotation.getReferences().add(resultingEObject);

							if (capabilityElement instanceof org.eclipse.uml2.uml.Package) {
								org.eclipse.uml2.uml.Package mergedPackage = (org.eclipse.uml2.uml.Package) capabilityElement;

								if (!UML2Util.isEmpty(mergedPackage.getURI())) {
									eAnnotation.getDetails().put(
										ANNOTATION_DETAIL__URI,
										mergedPackage.getURI());
								}
							}
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__CAPABILITIES)) && diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									CAPABILITY,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_PackageMerger_ReportCapability_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												resultingEObject,
												capabilityElement)),
									new Object[]{resultingEObject,
										capabilityElement}));
						}
					}
				}
			}
		}

		/**
		 * Obtains the element receiving a capability from a package merge.
		 * 
		 * @param resultingEObject
		 *            an object resulting from the copy step of a package merge
		 * 
		 * @return the receiving element, or {@code null} if there is no merge
		 *         receiver distinguished for this element
		 * 
		 * @since 5.0
		 */
		protected NamedElement getReceivingElement(EObject resultingEObject) {
			return (resultingEObject instanceof RedefinableElement)
				? ((RedefinableElement) resultingEObject).getNearestPackage()
				: null;
		}

		/**
		 * Obtains the element representing the capability that contributes a
		 * merged object.
		 * 
		 * @param mergedEObject
		 *            an source object from the copy step of a package merge
		 * 
		 * @return the capability element (never {@code null})
		 * 
		 * @since 5.0
		 */
		protected NamedElement getCapability(EObject mergedEObject) {
			return ((Element) mergedEObject).getNearestPackage();
		}

		protected void processOptions(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__EMPTY_QUALIFIED_NAMES))) {

				processEmptyQualifiedNames(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__INDISTINGUISHABLE_CLASSIFIERS))) {

				processIndistinguishableClassifiers(options, diagnostics,
					context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DIFFERENT_PROPERTY_STATICITY))) {

				processDifferentPropertyStaticity(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DIFFERENT_PROPERTY_UNIQUENESS))) {

				processDifferentPropertyUniqueness(options, diagnostics,
					context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__IMPLICIT_REDEFINITIONS))) {

				processImplicitRedefinitions(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__INVALID_REDEFINITIONS))) {

				processInvalidRedefinitions(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__INVALID_SUBSETS))) {
				processInvalidSubsets(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__EMPTY_UNIONS))) {
				processEmptyUnions(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__ASSOCIATION_SPECIALIZATIONS))) {

				processAssociationSpecializations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__REDUNDANT_GENERALIZATIONS))) {

				processRedundantGeneralizations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__CAPABILITIES))) {
				processCapabilities(options, diagnostics, context);
			}
		}

		/**
		 * Merges the contents of (all of) the packages merged by the specified
		 * package using the specified options, reporting problems to the
		 * specified diagnostics, within the specified context.
		 * 
		 * @param package_
		 *            The receiving package.
		 * @param options
		 *            The options to use.
		 * @param diagnostics
		 *            The chain of diagnostics to which problems are to be
		 *            appended.
		 * @param context
		 *            The cache of context-specific information.
		 * 
		 * @return A traceability map from resulting elements to merged
		 *         elements.
		 */
		public Map<EObject, List<EObject>> merge(
				org.eclipse.uml2.uml.Package package_,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			receivingPackage = package_; // compatibility
			mergedPackages = getAllMergedPackages(package_); // compatibility

			return merge(receivingPackage, mergedPackages, options,
				diagnostics, context);
		}

		/**
		 * Queries whether the current operation is a package merge, or some
		 * derivative.
		 * 
		 * @return whether I am a package merge operation ({@code true}) or
		 *         something else ({@false})
		 * 
		 * @since 5.0
		 */
		protected boolean isPackageMerge() {
			// N.B.: Don't test whether receivingElement is a package, because
			// that will be true in the case of expanding a package template!
			return receivingPackage != null;
		}

		/**
		 * Cleans up (removing or otherwise trimming as necessary) the
		 * relationships on the {@link #receivingElement} that define the merges
		 * that were performed.
		 * 
		 * @since 5.0
		 */
		protected void cleanupMergeRelationships() {

			if (isPackageMerge()) {
				// we ran a package merge. Destroy the merge relationships
				for (Iterator<PackageMerge> packageMerges = receivingPackage
					.getPackageMerges().iterator(); packageMerges.hasNext();) {

					PackageMerge packageMerge = packageMerges.next();
					packageMerges.remove();
					packageMerge.destroy();
				}
			}
		}

		/**
		 * Merges the contents of (all of) the elements merged by the specified
		 * package using the specified options, reporting problems to the
		 * specified diagnostics, within the specified context.
		 * 
		 * @param package_
		 *            The receiving package.
		 * @param options
		 *            The options to use.
		 * @param diagnostics
		 *            The chain of diagnostics to which problems are to be
		 *            appended.
		 * @param context
		 *            The cache of context-specific information.
		 * 
		 * @return A traceability map from resulting elements to merged
		 *         elements.
		 * 
		 * @since 5.0
		 */
		protected Map<EObject, List<EObject>> merge(
				TemplateableElement receivingElement,
				Collection<? extends TemplateableElement> mergedElements,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			this.receivingElement = receivingElement;
			this.mergedElements = mergedElements;

			this.options = options;
			this.diagnostics = diagnostics;
			this.context = context;

			copyAll(mergedElements);
			copyReferences();

			updateReferences();

			if (options != null) {
				processOptions(options, diagnostics, context);
			}

			cleanupMergeRelationships();

			return resultingToMergedEObjectMap;
		}
	}

	/**
	 * A specialized copier that "expands" the {@linkplain TemplateBinding
	 * bindings} of templates modeled by {@link TemplateableElement}s to apply
	 * the bindings' {@linkplain TemplateBinding#getParameterSubstitutions()
	 * parameter substitutions} within a bound element. The template bindings
	 * are then destroyed as it is effectively replaced by a realization of the
	 * template; this is in many ways similar to the way that the
	 * {@link PackageMerger} works to effect a
	 * {@link org.eclipse.uml2.uml.Package}'s {@link PackageMerge}s.
	 * 
	 * @since 5.0
	 */
	public static class TemplateExpander
			extends PackageMerger {

		private static final long serialVersionUID = 1L;

		/**
		 * The option for handling cases where a template binding does not have
		 * a substitution for some parameter and that parameter does not have a
		 * default substitution. Supported choices are {@code OPTION__IGNORE}
		 * and {@code OPTION__REPORT}.
		 */
		public static final String OPTION__MISSING_PARAMETER_SUBSTITUTIONS = "MISSING_PARAMETER_SUBSTITUTIONS"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 4000;

		/**
		 * The diagnostic code for cases where parameter substitutions are
		 * missing.
		 */
		public static final int MISSING_PARAMETER_SUBSTITUTION = DIAGNOSTIC_CODE_OFFSET + 1;

		protected TemplateBinding binding;

		protected Map<ParameterableElement, ParameterableElement> substitutionMap = new java.util.HashMap<ParameterableElement, ParameterableElement>();

		protected TemplateParameterSubstitution findSubstitution(
				TemplateParameter templateParameter) {

			TemplateParameterSubstitution result = null;

			for (TemplateParameterSubstitution substitution : binding
				.getParameterSubstitutions()) {

				if (substitution.getFormal() == templateParameter) {
					result = substitution;
					break;
				}
			}

			return result;
		}

		protected ParameterableElement getSubstitution(
				ParameterableElement parameterableElement) {

			ParameterableElement result = substitutionMap
				.get(parameterableElement);

			if (result == null) {
				TemplateParameter parameter = parameterableElement
					.getTemplateParameter();

				if (parameter != null) {
					// it's exposed as a template parameter. Substitute it
					TemplateParameterSubstitution substitution = findSubstitution(parameter);
					if (substitution != null) {
						result = substitution.getActual();
						substitutionMap.put(parameterableElement, result);
					} else {
						// look for a default
						result = parameter.getDefault();
						if (result != null) {
							substitutionMap.put(parameterableElement, result);
						}
					}
				}
			}

			return result;
		}

		protected void mergeNamedElement_Name(
				NamedElement receivingNamedElement,
				NamedElement mergedNamedElement) {

			// only merge names if the substituting element doesn't have a name
			// (this covers cases where the actual parameter is an object owned
			// by the bound element and the formal parameter is likewise owned
			// by the template, as in the UML Spec's package template example)
			if (!receivingNamedElement.isSetName()
				&& mergedNamedElement.isSetName()) {

				receivingNamedElement.setName(mergedNamedElement.getName());
			}
		}

		protected void mergeLiteralString_Value(
				LiteralString receivingLiteralString,
				LiteralString mergedLiteralString) {

			// only merge string values (which may be elements of name
			// expressions)
			// if the substituting string doesn't have a value
			if (!receivingLiteralString.isSetValue()
				&& mergedLiteralString.isSetValue()) {

				receivingLiteralString.setValue(mergedLiteralString.getValue());
			}
		}

		@Override
		protected void copyAttribute(EAttribute eAttribute, EObject eObject,
				EObject copyEObject) {

			if (eObject != copyEObject) {
				if (copyEObject == receivingElement) {
					return;
				} else if (eAttribute == UMLPackage.Literals.NAMED_ELEMENT__NAME) {
					// don't just blindly overwrite the names of objects matched
					// in the containment-copy phase because elements owned by
					// the template (not by its parameters) may be exposed by
					// parameters
					mergeNamedElement_Name((NamedElement) copyEObject,
						(NamedElement) eObject);
				} else if (eAttribute == UMLPackage.Literals.LITERAL_STRING__VALUE) {
					// don't just blindly overwrite the values of strings
					// matched
					// in the containment-copy phase to allow substitution of
					// string components in name expressions
					mergeLiteralString_Value((LiteralString) copyEObject,
						(LiteralString) eObject);
				} else {
					super.copyAttribute(eAttribute, eObject, copyEObject);
				}
			}
		}

		@Override
		protected void copyContainment(EReference eReference, EObject eObject,
				EObject copyEObject) {

			// don't copy the template signatures that we're expanding, nor
			// recursive bindings
			if ((eObject != copyEObject)
				&& (eReference != UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE)
				&& (eReference != UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING)) {

				if (eReference.isMany()) {
					@SuppressWarnings("unchecked")
					List<EObject> sourceList = (List<EObject>) eObject
						.eGet(eReference);
					@SuppressWarnings("unchecked")
					InternalEList<EObject> targetList = (InternalEList<EObject>) copyEObject
						.eGet(getTarget(eReference));

					for (EObject childEObject : sourceList) {
						EObject copyChildEObject = copy(childEObject);

						if (childEObject != copyChildEObject) {
							targetList.addUnique(copyChildEObject);
						}
					}
				} else {
					EObject childEObject = (EObject) eObject.eGet(eReference);
					EObject copyChildEObject = childEObject == null
						? null
						: copy(childEObject);

					if (childEObject != copyChildEObject) {
						copyEObject.eSet(getTarget(eReference),
							copyChildEObject);
					}
				}
			}
		}

		@Override
		protected EObjectMatcher getAssociationMatcher(Association association) {
			return new ImplicitAssociationNameMatcher(association);
		}

		@Override
		protected EObject createCopy(EObject eObject) {
			return new UMLSwitch<EObject>() {

				@Override
				public EObject caseParameterableElement(
						ParameterableElement object) {
					EObject result;
					ParameterableElement substitution = getSubstitution(object);

					if (substitution != null) {
						// it's exposed as a template parameter. Substitute it
						result = substitution;
					} else {
						result = super.caseParameterableElement(object);
					}

					return result;
				}

				@Override
				public EObject caseTemplateableElement(
						TemplateableElement object) {
					EObject result = null;

					if (mergedElements.contains(object)) {
						result = receivingElement;
					}

					if (result == null) {
						result = super.caseTemplateableElement(object);
					}

					return result;
				}

				protected EObject basicCreateCopy(EObject element) {
					EObject result = null;

					if (element instanceof ParameterableElement) {
						ParameterableElement parameterable = (ParameterableElement) element;
						ParameterableElement sub = getSubstitution(parameterable);

						if (sub != null) {
							result = sub;
						}
					}

					if (result == null) {
						result = TemplateExpander.super
							.createCopy((EObject) element);
					}

					return result;
				}

				@Override
				public EObject defaultCase(EObject eObject) {
					Element baseElement = getBaseElement(eObject);

					return baseElement == null
						? basicCreateCopy(eObject)
						: applyStereotype((Element) get(baseElement),
							getTarget(eObject.eClass()));
				}
			}.doSwitch(eObject);
		}

		@Override
		public void copyReferences() {
			// before we copy references, now that the content trees have been
			// merged, we can find and establish the default parameter
			// substitution mappings that will be needed to correctly map
			// references
			initializeDefaultParameterSubstitutionMappings();

			super.copyReferences();
		}

		private void initializeDefaultParameterSubstitutionMappings() {
			for (TemplateableElement template : mergedElements) {
				for (TemplateParameter parameter : template
					.getOwnedTemplateSignature().getParameters()) {

					ParameterableElement element = parameter
						.getParameteredElement();

					if ((element != null) && (parameter.getDefault() != null)) {
						ParameterableElement sub = getSubstitution(element);

						if (sub == null) {
							ParameterableElement default_ = parameter
								.getDefault();
							EObject copy = get(default_);

							if (copy != null) {
								// map the parametered element to the copy of
								// the default to effect the substitution
								put(element, copy);
							} else {
								// map the parametered element to the (uncopied)
								// default to effect the substitution
								put(element, default_);
							}
						}
					}
				}
			}
		}

		protected void processMissingParameterSubstitutions(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (TemplateableElement template : mergedElements) {

				for (TemplateParameter parameter : template
					.getOwnedTemplateSignature().getParameters()) {

					ParameterableElement element = parameter
						.getParameteredElement();

					if ((element != null) && (parameter.getDefault() == null)) {
						ParameterableElement sub = getSubstitution(element);

						if (sub == null) {

							if (OPTION__REPORT.equals(options
								.get(OPTION__MISSING_PARAMETER_SUBSTITUTIONS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										MISSING_PARAMETER_SUBSTITUTION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_TemplateExpander_ReportMissingParameterSubstitution_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, element, template)),
										new Object[]{template, element}));
							}
						}
					}
				}
			}
		}

		/**
		 * Replace named element names with (template-expanded) name expressions
		 * where appropriate.
		 */
		protected void processNameExpressions() {

			for (Iterator<?> iter = EcoreUtil.getAllContents(Collections
				.singleton(receivingElement)); iter.hasNext();) {

				Object next = iter.next();

				if (next instanceof NamedElement) {
					NamedElement namedElement = (NamedElement) next;
					StringExpression sexp = namedElement.getNameExpression();

					if (sexp != null) {
						namedElement.setName(sexp.stringValue());
						sexp.destroy();
					}
				}
			}
		}

		/**
		 * Queries the template in our scope that is or contains (recursively)
		 * the given object. A template is one that has a signature bound by a
		 * template binding that we are expanding.
		 * 
		 * @param eObject
		 *            an object
		 * 
		 * @return its nearest containing template, which may be itself
		 * 
		 * @since 5.0
		 */
		@Override
		protected NamedElement getCapability(EObject mergedEObject) {

			for (EObject e = mergedEObject; e != null; e = e.eContainer()) {

				if ((e instanceof TemplateableElement)
					&& (e instanceof NamedElement)) {

					TemplateableElement template = (TemplateableElement) e;
					TemplateSignature signature = template
						.getOwnedTemplateSignature();

					if ((signature != null)
						&& (binding.getSignature() == signature)) {

						return (NamedElement) template;
					}
				}
			}

			return null;
		}

		/**
		 * Queries the bound template in our scope that is or contains
		 * (recursively) the given object. A bound template is one that has a
		 * template binding that we are expanding.
		 * 
		 * @param eObject
		 *            an object
		 * 
		 * @return its nearest containing bound template, which may be itself
		 * 
		 * @since 5.0
		 */
		@Override
		protected NamedElement getReceivingElement(EObject resultingEObject) {

			for (EObject e = resultingEObject; e != null; e = e.eContainer()) {

				if ((e instanceof TemplateableElement)
					&& (e instanceof NamedElement)) {

					TemplateableElement template = (TemplateableElement) e;

					if (template.getTemplateBindings().contains(binding)) {
						return (NamedElement) template;
					}
				}
			}

			return null;
		}

		@Override
		protected void processOptions(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			// this is not optional
			processNameExpressions();

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__MISSING_PARAMETER_SUBSTITUTIONS))) {

				processMissingParameterSubstitutions(options, diagnostics,
					context);
			}

			super.processOptions(options, diagnostics, context);
		}

		@Override
		protected void cleanupMergeRelationships() {
			super.cleanupMergeRelationships();

			binding.destroy();
		}

		private void initializeParameteredElementMappings() {
			TemplateSignature signature = binding.getSignature();

			if (signature != null) {

				for (TemplateParameter parameter : signature.getParameters()) {

					ParameterableElement element = parameter
						.getParameteredElement();

					if (element != null) {
						ParameterableElement sub = getSubstitution(element);

						if (sub != null) {
							put(element, sub);
						} // defaults handled before copy-references step
					}
				}
			}
		}

		protected Map<EObject, List<EObject>> expand(TemplateBinding binding,
				TemplateableElement receivingElement,
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			this.binding = binding;

			this.options = options;
			this.diagnostics = diagnostics;
			this.context = context;

			// initialize some mappings for the parameter substitutions
			initializeParameteredElementMappings();

			TemplateableElement template = binding.getSignature().getTemplate();
			return merge(receivingElement, Collections.singleton(template),
				options, diagnostics, context);
		}

		public Map<EObject, List<EObject>> expand(
				TemplateableElement boundElement,
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			if (boundElement.getTemplateBindings().size() == 1) {
				// the nice case: only binding one template
				TemplateBinding binding = boundElement.getTemplateBindings()
					.get(0);
				return expand(binding, binding.getBoundElement(), options,
					diagnostics, context);
			} else {
				// apply the UML rules for multiple template bindings

				// copy the bindings because we destroy them as we go
				final List<TemplateBinding> bindings = new java.util.ArrayList<TemplateBinding>(
					boundElement.getTemplateBindings());

				return new UMLSwitch<Map<EObject, List<EObject>>>() {

					private Map<EObject, List<EObject>> merge(
							Map<EObject, List<EObject>> result,
							Map<EObject, List<EObject>> map) {

						for (Map.Entry<EObject, List<EObject>> next : map
							.entrySet()) {

							List<EObject> list = result.get(next.getKey());

							if (list == null) {
								result.put(
									next.getKey(),
									new java.util.ArrayList<EObject>(next
										.getValue()));
							} else {
								list.addAll(next.getValue());
							}
						}

						return result;
					}

					@Override
					public Map<EObject, List<EObject>> caseTemplateableElement(
							TemplateableElement object) {

						// TODO: UML does not specify how to handle multiple
						// bindings of StringExpressions and Operations, so
						// just process the first binding for now
						return expand(bindings.get(0), object, options,
							diagnostics, context);
					}

					@Override
					public Map<EObject, List<EObject>> caseClassifier(
							Classifier object) {
						// UML specifies that we create intermediate expansions
						// and specialize each
						for (TemplateBinding binding : bindings) {
							Classifier intermediate = (Classifier) EcoreUtil
								.create(object.eClass());

							// add the intermediate result to the model
							addAnonymousGeneral(intermediate, object);

							// have to use a distinct template-expander for each
							// because multiple bindings to the same template
							// are allowed and an EcoreUtil.Copier can only copy
							// an element once
							merge(resultingToMergedEObjectMap,
								new TemplateExpander()
									.expand(binding, intermediate, options,
										diagnostics, context));
						}

						return resultingToMergedEObjectMap;
					}

					private void addAnonymousGeneral(final Classifier general,
							Classifier special) {
						Classifier added = new UMLSwitch<Classifier>() {

							@Override
							public Classifier caseClassifier(Classifier object) {
								// cop out
								object.getNearestPackage()
									.getPackagedElements().add(general);
								return general;
							}

							@Override
							public Classifier caseClass(
									org.eclipse.uml2.uml.Class object) {
								object.getNestedClassifiers().add(general);
								return general;
							}

							@Override
							public Classifier caseInterface(Interface object) {
								object.getNestedClassifiers().add(general);
								return general;
							}
						}.doSwitch(special);

						added.unsetName(); // make sure it's anonymous
						special.createGeneralization(general); // specialize it
					}

					@Override
					public Map<EObject, List<EObject>> casePackage(
							org.eclipse.uml2.uml.Package object) {
						// UML specifies that we create intermediate expansions
						// and merge each. But because we are a package merger,
						// we can optimize out the intermediate packages

						for (TemplateBinding binding : bindings) {
							org.eclipse.uml2.uml.Package intermediate = (org.eclipse.uml2.uml.Package) EcoreUtil
								.create(object.eClass());

							// ensure that the capabilities processing algorithm
							// can get the qualified name of the original
							// package template by way of this intermediate
							// result
							String name = ((NamedElement) binding
								.getSignature().getTemplate())
								.getQualifiedName();
							intermediate.setName(name);

							// have to use a distinct template-expander for each
							// because multiple bindings to the same template
							// are allowed and an EcoreUtil.Copier can only copy
							// an element once
							merge(resultingToMergedEObjectMap,
								new TemplateExpander()
									.expand(binding, intermediate, options,
										diagnostics, context));

							// merge the intermediate result
							object.createPackageMerge(intermediate);
						}

						// merge the intermediate results (this is a *real*
						// package merge)
						merge(resultingToMergedEObjectMap, new PackageMerger() {

							private static final long serialVersionUID = 1L;

							@Override
							protected EObjectMatcher getAssociationMatcher(
									Association association) {
								return new ImplicitAssociationNameMatcher(
									association);
							}
						}.merge(object, options, diagnostics, context));

						return resultingToMergedEObjectMap;
					}
				}.doSwitch(boundElement);
			}
		}
	}

	/**
	 * A converter that converts UML elements to representative Ecore model
	 * elements.
	 */
	public static class UML2EcoreConverter
			extends UMLSwitch<Object>
			implements Converter {

		protected class NameMatcher
				extends EStructuralFeatureMatcher {

			protected NameMatcher(ENamedElement eNamedElement) {
				super(eNamedElement, EcorePackage.Literals.ENAMED_ELEMENT__NAME);
			}
		}

		protected class ETypeMatcher
				extends NameMatcher {

			protected ETypeMatcher(ETypedElement eTypedElement) {
				super(eTypedElement);
			}

			@Override
			public boolean matches(EObject otherEObject) {
				return super.matches(otherEObject)
					&& safeEquals(((ETypedElement) eObject).getEType(),
						((ETypedElement) otherEObject).getEType());
			}
		}

		protected class SignatureMatcher
				extends ETypeMatcher {

			protected SignatureMatcher(EOperation eOperation) {
				super(eOperation);
			}

			@Override
			public boolean matches(EObject otherEObject) {

				if (super.matches(otherEObject)) {
					List<EParameter> eParameters = ((EOperation) eObject)
						.getEParameters();
					int eParametersSize = eParameters.size();
					List<EParameter> otherEParameters = ((EOperation) otherEObject)
						.getEParameters();

					if (eParametersSize == otherEParameters.size()) {

						for (int i = 0; i < eParametersSize; i++) {

							if (!new ETypeMatcher(eParameters.get(i))
								.matches(otherEParameters.get(i))) {

								return false;
							}
						}

						return true;
					}
				}

				return false;
			}
		}

		private static final boolean DEBUG = Boolean
			.getBoolean(UML2EcoreConverter.class.getName() + ".DEBUG"); //$NON-NLS-1$

		/**
		 * The option for handling cases where an Ecore tagged value is
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__ECORE_TAGGED_VALUES = "ECORE_TAGGED_VALUES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a redefining operation is
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__REDEFINING_OPERATIONS = "REDEFINING_OPERATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a redefining property is
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__REDEFINING_PROPERTIES = "REDEFINING_PROPERTIES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a subsetting property is
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__SUBSETTING_PROPERTIES = "SUBSETTING_PROPERTIES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a derived union property is
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__UNION_PROPERTIES = "UNION_PROPERTIES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a derived feature is encountered.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__DERIVED_FEATURES = "DERIVED_FEATURES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a duplicate operation is
		 * detected. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, <code>OPTION__DISCARD</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__DUPLICATE_OPERATIONS = "DUPLICATE_OPERATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where an operation is inherited more
		 * than once. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, <code>OPTION__DISCARD</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__DUPLICATE_OPERATION_INHERITANCE = "DUPLICATE_OPERATION_INHERITANCE"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a duplicate feature is detected.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, <code>OPTION__DISCARD</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__DUPLICATE_FEATURES = "DUPLICATE_FEATURES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a feature is inherited more than
		 * once. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, <code>OPTION__DISCARD</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__DUPLICATE_FEATURE_INHERITANCE = "DUPLICATE_FEATURE_INHERITANCE"; //$NON-NLS-1$

		/**
		 * The option for handling cases where superclasses are not ordered.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__SUPER_CLASS_ORDER = "SUPER_CLASS_ORDER"; //$NON-NLS-1$

		/**
		 * The option for handling cases where annotation details are
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__ANNOTATION_DETAILS = "ANNOTATION_DETAILS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where invariant constraints are
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__INVARIANT_CONSTRAINTS = "INVARIANT_CONSTRAINTS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where operation bodies are encountered.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__OPERATION_BODIES = "OPERATION_BODIES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where comments are encountered.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__COMMENTS = "COMMENTS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where names are not camel case.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__CAMEL_CASE_NAMES = "CAMEL_CASE_NAMES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where invocation delegates can be used
		 * to define the behavior of operation bodies. Supported choices are
		 * <code>OPTION__IGNORE</code> and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__INVOCATION_DELEGATES = "INVOCATION_DELEGATES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where validation delegates can be used
		 * to define the behavior of invariant constraints. Supported choices
		 * are <code>OPTION__IGNORE</code> and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__VALIDATION_DELEGATES = "VALIDATION_DELEGATES"; //$NON-NLS-1$

		/**
		 * The option for generating invariant constraints in the non-API style
		 * in EClasses, rather than as API operations. Supported choices are
		 * <code>OPTION__IGNORE</code> and <code>OPTION__PROCESS</code>.
		 * 
		 * @since 5.0
		 */
		public static final String OPTION__NON_API_INVARIANTS = "NON_API_INVARIANTS"; //$NON-NLS-1$

		/**
		 * The option for handling untyped properties. Supported choices are
		 * {@code OPTION__IGNORE}, {@code OPTION__REPORT},
		 * {@code OPTION__DISCARD}, and {@code OPTION__PROCESS}.
		 * 
		 * @since 5.0
		 */
		public static final String OPTION__UNTYPED_PROPERTIES = "UNTYPED_PROPERTIES"; //$NON-NLS-1$

		/**
		 * The option for handling opposite role names. Supported choices are
		 * {@code OPTION__IGNORE} and {@code OPTION__PROCESS}.
		 * 
		 * @since 5.0
		 */
		public static final String OPTION__OPPOSITE_ROLE_NAMES = "OPPOSITE_ROLE_NAMES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where property default value
		 * expressions are encountered. These generate setting delegate
		 * annotations in the Ecore model. Supported choices are
		 * <code>OPTION__IGNORE</code>, <code>OPTION__REPORT</code>, and
		 * <code>OPTION__PROCESS</code>.
		 * 
		 * @since 5.0
		 */
		public static final String OPTION__PROPERTY_DEFAULT_EXPRESSIONS = "PROPERTY_DEFAULT_EXPRESSIONS"; //$NON-NLS-1$

		/**
		 * The option for specifying the line separator to use when processing
		 * text. If unspecified, the system's 'line.separator' property will be
		 * used as a default.
		 * 
		 * @since 5.0
		 */
		public static final String OPTION__LINE_SEPARATOR = "LINE_SEPARATOR"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 2000;

		/**
		 * The diagnostic code for cases where an Ecore tagged value is
		 * encountered.
		 */
		public static final int ECORE_TAGGED_VALUE = DIAGNOSTIC_CODE_OFFSET + 1;

		/**
		 * The diagnostic code for cases where a redefining operation is
		 * encountered.
		 */
		public static final int REDEFINING_OPERATION = DIAGNOSTIC_CODE_OFFSET + 2;

		/**
		 * The diagnostic code for cases where a redefining property is
		 * encountered.
		 */
		public static final int REDEFINING_PROPERTY = DIAGNOSTIC_CODE_OFFSET + 3;

		/**
		 * The diagnostic code for cases where a subsetting property is
		 * encountered.
		 */
		public static final int SUBSETTING_PROPERTY = DIAGNOSTIC_CODE_OFFSET + 4;

		/**
		 * The diagnostic code for cases where a derived union property is
		 * encountered.
		 */
		public static final int UNION_PROPERTY = DIAGNOSTIC_CODE_OFFSET + 5;

		/**
		 * The diagnostic code for cases where a derived feature is encountered.
		 */
		public static final int DERIVED_FEATURE = DIAGNOSTIC_CODE_OFFSET + 6;

		/**
		 * The diagnostic code for cases where a duplicate operation is
		 * detected.
		 */
		public static final int DUPLICATE_OPERATION = DIAGNOSTIC_CODE_OFFSET + 7;

		/**
		 * The diagnostic code for cases where an operation is inherited more
		 * than once.
		 */
		public static final int DUPLICATE_OPERATION_INHERITANCE = DIAGNOSTIC_CODE_OFFSET + 8;

		/**
		 * The diagnostic code for cases where a duplicate feature is detected.
		 */
		public static final int DUPLICATE_FEATURE = DIAGNOSTIC_CODE_OFFSET + 9;

		/**
		 * The diagnostic code for cases where a feature is inherited more than
		 * once.
		 */
		public static final int DUPLICATE_FEATURE_INHERITANCE = DIAGNOSTIC_CODE_OFFSET + 10;

		/**
		 * The diagnostic code for cases where superclasses are not ordered.
		 */
		public static final int SUPER_CLASS_ORDER = DIAGNOSTIC_CODE_OFFSET + 11;

		/**
		 * The diagnostic code for cases where annotation details are
		 * encountered.
		 */
		public static final int ANNOTATION_DETAILS = DIAGNOSTIC_CODE_OFFSET + 12;

		/**
		 * The diagnostic code for cases where invariant constraints are
		 * encountered.
		 */
		public static final int INVARIANT_CONSTRAINT = DIAGNOSTIC_CODE_OFFSET + 13;

		/**
		 * The diagnostic code for cases where operation body details are
		 * encountered.
		 */
		public static final int OPERATION_BODY = DIAGNOSTIC_CODE_OFFSET + 14;

		/**
		 * The diagnostic code for cases where comments are encountered.
		 */
		public static final int COMMENT = DIAGNOSTIC_CODE_OFFSET + 15;

		/**
		 * The diagnostic code for cases where names are not camel case.
		 */
		public static final int CAMEL_CASE_NAME = DIAGNOSTIC_CODE_OFFSET + 16;

		/**
		 * The diagnostic code for untyped properties.
		 * 
		 * @since 5.0
		 */
		public static final int UNTYPED_PROPERTY = DIAGNOSTIC_CODE_OFFSET + 17;

		/**
		 * The diagnostic code for notification of opposite role name
		 * annotations.
		 * 
		 * @since 5.0
		 */
		public static final int OPPOSITE_ROLE_NAME = DIAGNOSTIC_CODE_OFFSET + 18;

		/**
		 * The diagnostic code for cases where property default expression
		 * details are encountered.
		 * 
		 * @since 5.0
		 */
		public static final int PROPERTY_DEFAULT_EXPRESSION = DIAGNOSTIC_CODE_OFFSET + 19;

		protected static final Pattern ANNOTATION_PATTERN = Pattern
			.compile("\\G\\s*((?>\\\\.|\\S)+)((?:\\s+(?>\\\\.|\\S)+\\s*+=\\s*(['\"])((?>\\\\.|.)*?)\\3)*)"); //$NON-NLS-1$

		protected static final Pattern ANNOTATION_DETAIL_PATTERN = Pattern
			.compile("\\s+((?>\\\\.|\\S)+)\\s*+=\\s*((['\"])((?>\\\\.|.)*?)\\3)"); //$NON-NLS-1$

		protected static final String ANNOTATION_DETAIL__ORIGINAL_NAME = "originalName"; //$NON-NLS-1$

		protected static final String OCL_DELEGATE_URI = "http://www.eclipse.org/emf/2002/Ecore/OCL"; //$NON-NLS-1$

		protected final Map<Element, EModelElement> elementToEModelElementMap = new LinkedHashMap<Element, EModelElement>();

		protected Collection<org.eclipse.uml2.uml.Package> packages = null;

		protected Map<String, String> options = null;

		protected DiagnosticChain diagnostics = null;

		protected Map<Object, Object> context = null;

		/**
		 * Sets the {@code name} of a converted element.
		 * <p>
		 * As of the 4.2 API version, if the Ecore name differs for any reason
		 * from the original UML name, it is recorded for
		 * {@linkplain UMLUtil#getOriginalName(ENamedElement) later retrieval}.
		 * </p>
		 * 
		 * @param eNamedElement
		 *            the converted Ecore element in which to set a name
		 * @param name
		 *            the name to set
		 * @param validate
		 *            whether to ensure that the name is a valid Java
		 *            identifier, munging it if necessary
		 * 
		 * @see UMLUtil#getOriginalName(ENamedElement)
		 * @see UML2Util#getValidJavaIdentifier(String)
		 */
		protected void setName(ENamedElement eNamedElement, final String name,
				boolean validate) {

			String ecoreName = name;

			if (!isEmpty(name)
				&& options != null
				&& !OPTION__IGNORE
					.equals(options.get(OPTION__CAMEL_CASE_NAMES))) {

				Iterator<String> wordIterator = parseName(name, '_', "\\s").iterator(); //$NON-NLS-1$
				StringBuffer camelCaseNameBuffer = new StringBuffer();

				String word = wordIterator.next();

				if (word.length() > 0) {

					if (eNamedElement instanceof EClassifier
						|| eNamedElement instanceof ETypeParameter) {

						camelCaseNameBuffer.append(word.substring(0, 1)
							.toUpperCase());
					} else {
						camelCaseNameBuffer.append(word.substring(0, 1)
							.toLowerCase());
					}

					camelCaseNameBuffer.append(word.substring(1).toLowerCase());
				}

				while (wordIterator.hasNext()) {
					word = wordIterator.next();

					if (word.length() > 0) {
						camelCaseNameBuffer.append(word.substring(0, 1)
							.toUpperCase());
						camelCaseNameBuffer.append(word.substring(1)
							.toLowerCase());
					}
				}

				String camelCaseName = camelCaseNameBuffer.toString();

				if (OPTION__PROCESS.equals(options
					.get(OPTION__CAMEL_CASE_NAMES))) {

					ecoreName = camelCaseName;
				}

				if (!camelCaseName.equals(name)) {

					if (DEBUG) {
						System.out.println(name + " -> " + camelCaseName); //$NON-NLS-1$
					}

					if (OPTION__PROCESS.equals(options
						.get(OPTION__CAMEL_CASE_NAMES))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									CAMEL_CASE_NAME,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_ProcessCamelCaseName_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eNamedElement)),
									new Object[]{eNamedElement}));
						}
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__CAMEL_CASE_NAMES))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								CAMEL_CASE_NAME,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ReportCamelCaseName_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eNamedElement)),
								new Object[]{eNamedElement}));
					}
				}
			}

			if (validate) {
				ecoreName = getValidJavaIdentifier(ecoreName);
			}

			if (!safeEquals(ecoreName, name)) {
				// record the original name, regardless whether it was converted
				// by the camel-case names option or by munging to get a valid
				// Java identifier, because clients such as OCL will require the
				// traceability
				EcoreUtil.setAnnotation(eNamedElement,
					UML2_UML_PACKAGE_2_0_NS_URI,
					ANNOTATION_DETAIL__ORIGINAL_NAME, name);
			}

			eNamedElement.setName(ecoreName);
		}

		protected void setName(ENamedElement eNamedElement,
				NamedElement namedElement) {
			setName(eNamedElement, namedElement.getName(), true);

			if (namedElement instanceof Classifier) {
				Namespace namespace = namedElement.getNamespace();

				if (namespace instanceof Classifier) {
					qualifyName(eNamedElement, getValidJavaIdentifier(namespace
						.getName()));
				}
			}
		}

		/**
		 * Queries the original name (as defined in the source UML model) of the
		 * given Ecore named element, in the case that the original name was not a
		 * valid Ecore/Java name and was transformed either via the
		 * {@link UML2EcoreConverter#OPTION__CAMEL_CASE_NAMES} option or simply
		 * validating the name.
		 * 
		 * @param eNamedElement
		 *            an Ecore named element
		 * 
		 * @return its original name in the UML model in which it was defined, or
		 *         just its Ecore name if the original name is not recorded or is
		 *         not different
		 * 
		 * @since 5.0
		 * 
		 * @see UML2EcoreConverter#setName(ENamedElement, String, boolean)
		 */
		public static String getOriginalName(ENamedElement eNamedElement) {
			String result = eNamedElement.getName();

			EAnnotation annotation = eNamedElement
				.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);
			if (annotation != null) {
				String originalName = annotation.getDetails().get(
					ANNOTATION_DETAIL__ORIGINAL_NAME);
				if (originalName != null) {
					result = originalName;
				}
			}

			return result;
		}

		protected EClassifier getEType(Type type) {
			EClassifier eType = null;

			if (type != null) {
				String qualifiedName = type.getQualifiedName();

				if (!isEmpty(qualifiedName) && type instanceof PrimitiveType) {

					if ("JavaPrimitiveTypes::boolean".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.EBOOLEAN;
					} else if ("JavaPrimitiveTypes::byte".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.EBYTE;
					} else if ("JavaPrimitiveTypes::char".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.ECHAR;
					} else if ("JavaPrimitiveTypes::double".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.EDOUBLE;
					} else if ("JavaPrimitiveTypes::float".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.EFLOAT;
					} else if ("JavaPrimitiveTypes::int".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.EINT;
					} else if ("JavaPrimitiveTypes::long".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.ELONG;
					} else if ("JavaPrimitiveTypes::short".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.Literals.ESHORT;
					} else if (qualifiedName
						.startsWith("EcorePrimitiveTypes::")) { //$NON-NLS-1$

						eType = EcorePackage.eINSTANCE.getEClassifier(type
							.getName());
					} else if (qualifiedName.startsWith("XMLPrimitiveTypes::")) { //$NON-NLS-1$
						eType = XMLTypePackage.eINSTANCE.getEClassifier(type
							.getName());
					}
				}

				if (eType == null) {
					Object eObject = doSwitch(type);

					if (eObject instanceof EClassifier) {
						eType = (EClassifier) eObject;
					}
				}
			}

			return eType;
		}

		protected ETypeParameter getETypeParameter(Type type) {
			ETypeParameter eTypeParameter = null;

			if (type != null) {
				TemplateParameter templateParameter = type
					.getTemplateParameter();

				if (templateParameter != null) {
					TemplateSignature signature = templateParameter
						.getSignature();

					if (signature != null) {
						TemplateableElement template = signature.getTemplate();

						if (template instanceof Type) {
							EClassifier eType = getEType((Type) template);

							if (eType != null) {
								String name = type.getName();

								for (ETypeParameter eParameter : eType
									.getETypeParameters()) {

									if (safeEquals(name, eParameter.getName())) {
										eTypeParameter = eParameter;
										break;
									}
								}
							}
						}
					}
				}

				if (eTypeParameter == null) {
					Object eObject = doSwitch(type);

					if (eObject instanceof ETypeParameter) {
						eTypeParameter = (ETypeParameter) eObject;
					}
				}
			}

			return eTypeParameter;
		}

		protected EGenericType getEGenericType(Type type) {
			EGenericType eGenericType = null;

			if (type instanceof Classifier) {
				eGenericType = EcoreFactory.eINSTANCE.createEGenericType();

				EClassifier eType = getEType(type);

				if (eType == null) {
					ETypeParameter eTypeParameter = getETypeParameter(type);

					if (eTypeParameter != null) {
						eGenericType.setETypeParameter(eTypeParameter);
					} else {

						if (options != null
							&& !OPTION__IGNORE.equals(options
								.get(OPTION__ECORE_TAGGED_VALUES))) {

							processEcoreTaggedValues(eGenericType, type,
								options, diagnostics, context);
						}

						EList<EGenericType> eTypeArguments = eGenericType
							.getETypeArguments();

						for (TemplateBinding templateBinding : ((Classifier) type)
							.getTemplateBindings()) {

							TemplateSignature signature = templateBinding
								.getSignature();

							if (signature != null) {
								TemplateableElement template = signature
									.getTemplate();

								if (template instanceof Classifier) {
									eGenericType
										.setEClassifier(getEType((Classifier) template));

									for (TemplateParameterSubstitution parameterSubstitution : templateBinding
										.getParameterSubstitutions()) {

										ParameterableElement actual = parameterSubstitution
											.getActual();

										if (actual == null) {
											TemplateParameter formal = parameterSubstitution
												.getFormal();

											if (formal != null) {
												actual = formal.getDefault();
											}
										}

										if (actual instanceof Classifier) {
											eTypeArguments
												.add(getEGenericType((Classifier) actual));
										}
									}
								}
							}
						}
					}
				} else {
					eGenericType.setEClassifier(eType);
				}
			}

			return eGenericType;
		}

		protected EClassifier getEType(TypedElement typedElement) {
			return getEType(typedElement.getType());
		}

		protected Stereotype getAppliedEcoreStereotype(Element element,
				String name) {
			return element.getAppliedStereotype("Ecore" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + name);
		}

		protected boolean isEGenericType(Classifier classifier) {
			return options != null
				&& !OPTION__IGNORE.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))
				&& getAppliedEcoreStereotype(classifier,
					STEREOTYPE__E_GENERIC_TYPE) != null;
		}

		public static boolean isEDataType(Namespace namespace) {
			return !new UMLSwitch<Boolean>() {

				@Override
				public Boolean caseClass(org.eclipse.uml2.uml.Class class_) {
					return Boolean.TRUE;
				}

				@Override
				public Boolean caseDataType(DataType dataType) {
					return Boolean.TRUE;
				}

				@Override
				public Boolean caseEnumeration(Enumeration enumeration) {
					return Boolean.FALSE;
				}

				@Override
				public Boolean caseInterface(Interface interface_) {
					return Boolean.TRUE;
				}

				@Override
				public Boolean caseNamespace(Namespace namespace) {
					return Boolean.FALSE;
				}

				@Override
				public Boolean casePrimitiveType(PrimitiveType primitiveType) {
					return Boolean.FALSE;
				}

				@Override
				public Boolean doSwitch(EObject eObject) {
					return eObject == null
						? Boolean.FALSE
						: super.doSwitch(eObject);
				}

			}.doSwitch(namespace).booleanValue();
		}

		protected boolean isEClass(Namespace namespace) {
			return !isEDataType(namespace);
		}

		@Override
		public Object caseClass(org.eclipse.uml2.uml.Class class_) {

			if (!isEGenericType(class_) && !class_.isTemplateParameter()) {
				org.eclipse.uml2.uml.Package package_ = class_
					.getNearestPackage();

				if (package_ != null) {
					EClass eClass = EcoreFactory.eINSTANCE.createEClass();
					elementToEModelElementMap.put(class_, eClass);

					EPackage ePackage = (EPackage) doSwitch(package_);
					ePackage.getEClassifiers().add(eClass);

					setName(eClass, class_);

					eClass.setAbstract(class_.isAbstract());

					defaultCase(class_);

					return eClass;
				}
			}

			return super.caseClass(class_);
		}

		@Override
		public Object caseComment(Comment comment) {
			String body = comment.getBody();

			if (!isEmpty(body) && options != null
				&& !OPTION__IGNORE.equals(options.get(OPTION__COMMENTS))) {

				for (Element annotatedElement : comment.getAnnotatedElements()) {
					EModelElement eModelElement = (EModelElement) doSwitch(annotatedElement);

					if (eModelElement != null) {
						processComment(eModelElement, body, options,
							diagnostics, context);
					}
				}
			}

			return super.caseComment(comment);
		}

		@Override
		public Object caseConstraint(Constraint constraint) {
			Namespace constraintContext = constraint.getContext();

			if (constraintContext != null) {
				EModelElement eModelElement = (EModelElement) doSwitch(constraintContext);

				if (eModelElement != null) {

					if (eModelElement instanceof EClassifier
						&& options != null
						&& !OPTION__IGNORE.equals(options
							.get(OPTION__INVARIANT_CONSTRAINTS))) {

						eModelElement = processInvariantConstraint(
							(EClassifier) eModelElement, constraint, options,
							diagnostics, context);
					}

					ValueSpecification specification = constraint
						.getSpecification();

					if (specification != null
						&& !(eModelElement instanceof EOperation
							&& options != null && OPTION__PROCESS
							.equals(options.get(OPTION__OPERATION_BODIES)))) {

						addDocumentation(eModelElement,
							specification.stringValue(), getLineSeparator());
					}

					return eModelElement;
				}
			}

			return super.caseConstraint(constraint);
		}

		@Override
		public Object caseDataType(DataType dataType) {

			if (!isEGenericType(dataType) && !dataType.isTemplateParameter()) {
				org.eclipse.uml2.uml.Package package_ = dataType
					.getNearestPackage();

				if (package_ != null) {
					EClass eClass = EcoreFactory.eINSTANCE.createEClass();
					elementToEModelElementMap.put(dataType, eClass);

					EPackage ePackage = (EPackage) doSwitch(package_);
					ePackage.getEClassifiers().add(eClass);

					setName(eClass, dataType);

					defaultCase(dataType);

					return eClass;
				}
			}
			return super.caseDataType(dataType);
		}

		@Override
		public Object caseEModelElement(EModelElement eModelElement) {
			return eModelElement;
		}

		@Override
		public Object caseEnumeration(Enumeration enumeration) {
			org.eclipse.uml2.uml.Package package_ = enumeration
				.getNearestPackage();

			if (package_ != null) {
				EEnum eEnum = EcoreFactory.eINSTANCE.createEEnum();
				elementToEModelElementMap.put(enumeration, eEnum);

				EPackage ePackage = (EPackage) doSwitch(package_);
				ePackage.getEClassifiers().add(eEnum);

				setName(eEnum, enumeration);

				defaultCase(enumeration);

				return eEnum;
			}

			return super.caseEnumeration(enumeration);
		}

		@Override
		public Object caseEnumerationLiteral(
				EnumerationLiteral enumerationLiteral) {
			Enumeration enumeration = enumerationLiteral.getEnumeration();

			if (enumeration != null) {
				EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE
					.createEEnumLiteral();
				elementToEModelElementMap.put(enumerationLiteral, eEnumLiteral);

				EEnum eEnum = (EEnum) doSwitch(enumeration);
				eEnum.getELiterals().add(eEnumLiteral);

				setName(eEnumLiteral, enumerationLiteral);

				int value = enumeration.getOwnedLiterals().indexOf(
					enumerationLiteral);
				ValueSpecification specification = enumerationLiteral
					.getSpecification();

				if (specification != null) {

					try {
						value = specification.integerValue();
					} catch (Exception e) {
						// ignore
					}
				}

				eEnumLiteral.setValue(value);

				defaultCase(enumerationLiteral);

				return eEnumLiteral;
			}

			return super.caseEnumerationLiteral(enumerationLiteral);
		}

		@Override
		public Object caseGeneralization(Generalization generalization) {
			Classifier specific = generalization.getSpecific();

			if (specific != null) {
				EClassifier specificEClassifier = (EClassifier) doSwitch(specific);

				if (specificEClassifier instanceof EClass) {
					EClass specificEClass = (EClass) specificEClassifier;
					Classifier general = generalization.getGeneral();

					if (general != null) {
						EGenericType eGenericSuperType = getEGenericType(general);

						if (eGenericSuperType != null) {
							EClassifier generalEClassifier = eGenericSuperType
								.getERawType();

							if (generalEClassifier instanceof EClass) {
								EClass generalEClass = (EClass) generalEClassifier;

								if (!specificEClass
									.isSuperTypeOf(generalEClass)
									&& !generalEClass
										.isSuperTypeOf(specificEClass)) {

									specificEClass.getEGenericSuperTypes().add(
										eGenericSuperType);
								}
							}
						}
					}
				} else if (specificEClassifier instanceof EDataType) {
					EDataType specificEDataType = (EDataType) specificEClassifier;
					Classifier general = generalization.getGeneral();

					if (general != null) {
						EClassifier generalEClassifier = (EClassifier) doSwitch(general);

						if (generalEClassifier instanceof EDataType) {
							ExtendedMetaData.INSTANCE.setBaseType(
								specificEDataType,
								(EDataType) generalEClassifier);
						}
					}
				}
			}

			return super.caseGeneralization(generalization);
		}

		@Override
		public Object caseInterfaceRealization(
				InterfaceRealization interfaceRealization) {
			BehavioredClassifier implementingClassifier = interfaceRealization
				.getImplementingClassifier();

			if (implementingClassifier != null) {
				EClassifier implementingEClassifier = (EClassifier) doSwitch(implementingClassifier);

				if (implementingEClassifier instanceof EClass) {
					EClass implementingEClass = (EClass) implementingEClassifier;
					Interface contract = interfaceRealization.getContract();

					if (contract != null) {
						EGenericType eGenericSuperType = getEGenericType(contract);

						if (eGenericSuperType != null) {
							EClassifier contractEClassifier = eGenericSuperType
								.getERawType();

							if (contractEClassifier instanceof EClass) {
								EClass contractEClass = (EClass) contractEClassifier;

								if (!implementingEClass
									.isSuperTypeOf(contractEClass)) {

									implementingEClass.getEGenericSuperTypes()
										.add(eGenericSuperType);
								}
							}
						}
					}
				}
			}

			return super.caseInterfaceRealization(interfaceRealization);
		}

		@Override
		public Object caseInterface(Interface interface_) {

			if (!isEGenericType(interface_)
				&& !interface_.isTemplateParameter()) {

				org.eclipse.uml2.uml.Package package_ = interface_
					.getNearestPackage();

				if (package_ != null) {
					EClass eClass = EcoreFactory.eINSTANCE.createEClass();
					elementToEModelElementMap.put(interface_, eClass);

					EPackage ePackage = (EPackage) doSwitch(package_);
					ePackage.getEClassifiers().add(eClass);

					setName(eClass, interface_);

					eClass.setAbstract(true);
					eClass.setInterface(true);

					defaultCase(interface_);

					return eClass;
				}
			}

			return super.caseInterface(interface_);
		}

		@Override
		public Object caseMultiplicityElement(
				MultiplicityElement multiplicityElement) {
			Object eModelElement = elementToEModelElementMap
				.get(multiplicityElement);

			if (eModelElement instanceof ETypedElement) {
				ETypedElement eTypedElement = (ETypedElement) eModelElement;

				int upper = multiplicityElement.getUpper();

				if (eTypedElement.getUpperBound() != upper) {
					eTypedElement.setUpperBound(upper);
				}

				int lower = multiplicityElement.getLower();

				if (eTypedElement.getLowerBound() != lower) {
					eTypedElement.setLowerBound(lower);
				}

				eTypedElement.setOrdered(multiplicityElement.isOrdered());
				eTypedElement.setUnique(multiplicityElement.isUnique());

				return eTypedElement;
			} else {
				return super.caseMultiplicityElement(multiplicityElement);
			}
		}

		@Override
		public Object caseOperation(Operation operation) {
			Namespace namespace = operation.getNamespace();

			if (isEClass(namespace)) {
				EOperation eOperation = EcoreFactory.eINSTANCE
					.createEOperation();
				elementToEModelElementMap.put(operation, eOperation);

				EClass eClass = (EClass) doSwitch(namespace);
				eClass.getEOperations().add(eOperation);

				setName(eOperation, operation);

				EList<EGenericType> eGenericExceptions = eOperation
					.getEGenericExceptions();

				for (Type raisedException : operation.getRaisedExceptions()) {
					EGenericType eGenericType = getEGenericType(raisedException);

					if (eGenericType != null) {
						eGenericExceptions.add(eGenericType);
					}
				}

				eOperation
					.setEGenericType(getEGenericType(operation.getType()));

				int upper = operation.getUpper();

				if (eOperation.getUpperBound() != upper) {
					eOperation.setUpperBound(upper);
				}

				int lower = operation.getLower();

				if (eOperation.getLowerBound() != lower) {
					eOperation.setLowerBound(lower);
				}

				eOperation.setOrdered(operation.isOrdered());
				eOperation.setUnique(operation.isUnique());

				defaultCase(operation);

				return eOperation;
			}

			return super.caseOperation(operation);
		}

		@Override
		public Object casePackage(org.eclipse.uml2.uml.Package package_) {
			EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
			elementToEModelElementMap.put(package_, ePackage);

			if (!packages.contains(package_)) {
				org.eclipse.uml2.uml.Package nestingPackage = package_
					.getNestingPackage();

				if (nestingPackage != null) {
					((EPackage) doSwitch(nestingPackage)).getESubpackages()
						.add(ePackage);
				}
			}

			setName(ePackage, package_);

			if (isEmpty(ePackage.getNsPrefix())) {
				EPackage eSuperPackage = ePackage.getESuperPackage();

				ePackage.setNsPrefix((eSuperPackage == null
					? EMPTY_STRING
					: eSuperPackage.getNsPrefix() + '.') + ePackage.getName());
			}

			ePackage.setNsURI(package_.getURI());

			if (isEmpty(ePackage.getNsURI())) {
				ePackage.setNsURI("http:///" //$NON-NLS-1$
					+ ePackage.getNsPrefix().replace('.', '/') + ".ecore"); //$NON-NLS-1$
			}

			defaultCase(package_);

			return ePackage;
		}

		@Override
		public Object caseParameter(Parameter parameter) {
			Operation operation = parameter.getOperation();

			if (operation != null
				&& parameter.getDirection() != ParameterDirectionKind.RETURN_LITERAL) {

				EParameter eParameter = EcoreFactory.eINSTANCE
					.createEParameter();
				elementToEModelElementMap.put(parameter, eParameter);

				EOperation eOperation = (EOperation) doSwitch(operation);
				eOperation.getEParameters().add(eParameter);

				setName(eParameter, parameter);

				caseTypedElement(parameter);
				caseMultiplicityElement(parameter);

				defaultCase(parameter);

				return eParameter;
			}

			return super.caseParameter(parameter);
		}

		@Override
		public Object caseParameterableElement(
				ParameterableElement parameterableElement) {
			TemplateParameter templateParameter = parameterableElement
				.getTemplateParameter();

			if (templateParameter != null) {
				TemplateSignature signature = templateParameter.getSignature();

				if (signature != null) {
					EList<ETypeParameter> eTypeParameters = getETypeParameters((ENamedElement) doSwitch(signature
						.getTemplate()));

					if (eTypeParameters != null) {
						ETypeParameter eTypeParameter = EcoreFactory.eINSTANCE
							.createETypeParameter();
						elementToEModelElementMap.put(parameterableElement,
							eTypeParameter);

						int index = signature.getParameters().indexOf(
							templateParameter);

						if (index < eTypeParameters.size()) {
							eTypeParameters.add(index, eTypeParameter);
						} else {
							eTypeParameters.add(eTypeParameter);
						}

						if (parameterableElement instanceof NamedElement) {
							setName(eTypeParameter,
								(NamedElement) parameterableElement);
						}

						if (options != null
							&& !OPTION__IGNORE.equals(options
								.get(OPTION__ECORE_TAGGED_VALUES))) {

							processEcoreTaggedValues(eTypeParameter,
								templateParameter, options, diagnostics,
								context);
						}
					}
				}
			}

			return super.caseParameterableElement(parameterableElement);
		}

		@Override
		public Object casePrimitiveType(PrimitiveType primitiveType) {

			if (!isEGenericType(primitiveType)
				&& !primitiveType.isTemplateParameter()) {

				org.eclipse.uml2.uml.Package package_ = primitiveType
					.getNearestPackage();

				if (package_ != null) {
					EDataType eDataType = EcoreFactory.eINSTANCE
						.createEDataType();
					elementToEModelElementMap.put(primitiveType, eDataType);

					EPackage ePackage = (EPackage) doSwitch(package_);
					ePackage.getEClassifiers().add(eDataType);

					setName(eDataType, primitiveType);

					eDataType.setInstanceClassName(eDataType.getName());

					defaultCase(primitiveType);

					return eDataType;
				}
			}

			return super.casePrimitiveType(primitiveType);
		}

		@Override
		public Object caseProperty(Property property) {
			Namespace namespace = property.getNamespace();

			if (isEClass(namespace)) {
				EStructuralFeature eStructuralFeature = null;
				Classifier type = (Classifier) property.getType();

				if ((type == null)
					&& OPTION__PROCESS.equals(options
						.get(OPTION__UNTYPED_PROPERTIES))) {

					EReference eReference = (EReference) (eStructuralFeature = EcoreFactory.eINSTANCE
						.createEReference());
					elementToEModelElementMap.put(property, eReference);

					eReference.setContainment(property.isComposite());
					eReference.setEType(EcorePackage.Literals.EOBJECT);
				} else if (isEClass(type)) {
					EReference eReference = (EReference) (eStructuralFeature = EcoreFactory.eINSTANCE
						.createEReference());
					elementToEModelElementMap.put(property, eReference);

					eReference.setContainment(property.isComposite()
						|| type instanceof DataType);
				} else {
					EAttribute eAttribute = (EAttribute) (eStructuralFeature = EcoreFactory.eINSTANCE
						.createEAttribute());
					elementToEModelElementMap.put(property, eAttribute);

					// only set the default literal if the default value is
					// not an expression when we are using setting delegates
					if (!((property.getDefaultValue() instanceof OpaqueExpression) && OPTION__PROCESS
						.equals(options
							.get(OPTION__PROPERTY_DEFAULT_EXPRESSIONS)))) {

						String default_ = property.getDefault();

						if (default_ != null) {

							if (isUnlimitedNatural(type)) {
								default_ = TypesFactory.eINSTANCE
									.createFromString(
										TypesPackage.Literals.UNLIMITED_NATURAL,
										default_).toString();
							}

							eAttribute.setDefaultValueLiteral(default_);
						}
					}

					eAttribute.setID(property.isID());
				}

				EClass eClass = (EClass) doSwitch(namespace);
				eClass.getEStructuralFeatures().add(eStructuralFeature);

				setName(eStructuralFeature, property);

				eStructuralFeature.setChangeable(!property.isReadOnly());

				eStructuralFeature.setDerived(property.isDerived());

				Property opposite = property.getOpposite();

				if (opposite != null && opposite.isNavigable()) {
					EReference eOpposite = (EReference) doSwitch(opposite);

					if (eOpposite != null) {

						if (property.isDerived() && !eOpposite.isDerived()) {
							eOpposite.setDerived(true);

							if (DEBUG) {
								System.out.println("Made opposite " //$NON-NLS-1$
									+ getQualifiedText(eOpposite) + " derived"); //$NON-NLS-1$
							}
						}

						((EReference) eStructuralFeature)
							.setEOpposite(eOpposite);
					}
				} else if ((eStructuralFeature instanceof EReference)
					&& OPTION__PROCESS.equals(options
						.get(OPTION__OPPOSITE_ROLE_NAMES))) {

					Property otherEnd = property.getOtherEnd();

					if (otherEnd != null) {
						String explicitRoleName = otherEnd.getName();
						String implicitRoleName = namespace.getName();

						if (!isEmpty(explicitRoleName)
							&& !explicitRoleName.equals(implicitRoleName)) {

							EcoreUtil
								.setAnnotation(
									eStructuralFeature,
									EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE,
									EMOFExtendedMetaData.EMOF_COMMENT_BODY,
									explicitRoleName);

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										OPPOSITE_ROLE_NAME,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML2EcoreConverter_ProcessOppositeRoleName_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context,
													eStructuralFeature,
													explicitRoleName)),
										new Object[]{eStructuralFeature}));
							}
						}
					}
				}

				if (type != null) {
					caseTypedElement(property);
				}

				caseMultiplicityElement(property);

				defaultCase(property);

				return eStructuralFeature;
			}

			return super.caseProperty(property);
		}

		@Override
		public Object caseTemplateParameter(TemplateParameter templateParameter) {
			return defaultCase(templateParameter);
		}

		@Override
		public Object caseTemplateSignature(TemplateSignature templateSignature) {
			return defaultCase(templateSignature);
		}

		@Override
		public Object caseTypedElement(TypedElement typedElement) {
			Object eModelElement = elementToEModelElementMap.get(typedElement);

			if (eModelElement instanceof ETypedElement) {
				ETypedElement eTypedElement = (ETypedElement) eModelElement;

				eTypedElement.setEGenericType(getEGenericType(typedElement
					.getType()));

				return eTypedElement;
			}

			return super.caseTypedElement(typedElement);
		}

		@Override
		public Object defaultCase(EObject eObject) {

			for (EObject eContent : eObject.eContents()) {
				doSwitch(eContent);
			}

			return super.defaultCase(eObject);
		}

		@Override
		public Object doSwitch(EObject eObject) {

			if (!elementToEModelElementMap.containsKey(eObject)) {
				super.doSwitch(eObject);
			}

			return elementToEModelElementMap.get(eObject);
		}

		private static char parseChar(String c) {

			if (c == null) {
				throw new IllegalArgumentException("null"); //$NON-NLS-1$
			}

			if ("\\b".equals(c)) { //$NON-NLS-1$
				return '\b';
			} else if ("\\t".equals(c)) { //$NON-NLS-1$
				return '\t';
			} else if ("\\n".equals(c)) { //$NON-NLS-1$
				return '\n';
			} else if ("\\f".equals(c)) { //$NON-NLS-1$
				return '\f';
			} else if ("\\r".equals(c)) { //$NON-NLS-1$
				return '\r';
			} else if ("\\\"".equals(c)) { //$NON-NLS-1$
				return '\"';
			} else if ("\\\'".equals(c)) { //$NON-NLS-1$
				return '\'';
			} else if ("\\\\".equals(c)) { //$NON-NLS-1$
				return '\\';
			}

			if (c.startsWith("\\u") && c.length() == 6) { //$NON-NLS-1$
				int i = Integer.parseInt(c.substring(2), 16);

				if (i >= Character.MIN_VALUE && i <= Character.MAX_VALUE) {
					return (char) i;
				}
			} else if (c.length() >= 2 && c.length() <= 4
				&& c.charAt(0) == '\\') {

				int i = Integer.parseInt(c.substring(1), 8);

				if (i >= Character.MIN_VALUE && i <= Character.MAX_VALUE) {
					return (char) i;
				}
			}

			if (c.length() != 1) {
				throw new IllegalArgumentException(c);
			}

			return c.charAt(0);
		}

		private static String parseString(String s) {

			if (s == null) {
				return null;
			}

			int length = s.length();
			StringBuilder result = new StringBuilder(length);

			for (int i = 0; i < length; i++) {
				char c = s.charAt(i);

				if (c == '\\' && length > i + 1) {

					if ("btnfr\"\'\\".indexOf(s.charAt(i + 1)) != -1) { //$NON-NLS-1$
						c = parseChar(s.substring(i, i + 2));
						i++;
					} else if (s.charAt(i + 1) == 'u' && length > i + 5) {
						c = parseChar(s.substring(i, i + 6));
						i += 5;
					} else {
						int j;

						for (j = i + 1; j < length && j - i < 4; j++) {
							char digit = s.charAt(j);

							if (digit < '0' || digit > '7') {
								break;
							}
						}

						c = parseChar(s.substring(i, j));
						i = j - 1;
					}
				}

				result.append(c);
			}

			return result.toString();
		}

		private static List<String> parseName(String name, char separator,
				String regex) {
			List<String> result = new ArrayList<String>();

			if (name != null) {

				for (String wordString : name.split(regex)) {
					StringBuilder currentWord = new StringBuilder();
					boolean lastIsLower = false;

					for (int index = 0, length = wordString.length(); index < length; index++) {
						char curChar = wordString.charAt(index);

						if (Character.isUpperCase(curChar)
							|| (!lastIsLower && Character.isDigit(curChar))
							|| curChar == separator) {

							if (lastIsLower && currentWord.length() > 1
								|| curChar == separator
								&& currentWord.length() > 0) {

								result.add(currentWord.toString());
								currentWord = new StringBuilder();
							}

							lastIsLower = false;
						} else {

							if (!lastIsLower) {
								int currentWordLength = currentWord.length();

								if (currentWordLength > 1) {
									char lastChar = currentWord
										.charAt(--currentWordLength);
									currentWord.setLength(currentWordLength);
									result.add(currentWord.toString());
									currentWord = new StringBuilder();
									currentWord.append(lastChar);
								}
							}

							lastIsLower = true;
						}

						if (curChar != separator) {
							currentWord.append(curChar);
						}
					}

					result.add(currentWord.toString());
				}
			}

			return result;
		}

		private String getLineSeparator() {

			if (options != null) {
				String lineSeparator = options.get(OPTION__LINE_SEPARATOR);

				if (!isEmpty(lineSeparator)) {
					return lineSeparator;
				}
			}

			return LINE_SEPARATOR;
		}

		protected void processEcoreTaggedValue(EModelElement eModelElement,
				EStructuralFeature eStructuralFeature, Element element,
				Stereotype stereotype, String propertyName,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			if (element.hasValue(stereotype, propertyName)) {
				Object value = element.getValue(stereotype, propertyName);

				if (OPTION__PROCESS.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ECORE_TAGGED_VALUE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eModelElement, getTagDefinition(
												stereotype, propertyName),
											value)),
								new Object[]{eModelElement}));
					}

					if (eStructuralFeature != null) {

						if (eStructuralFeature == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
							ENamedElement eNamedElement = (ENamedElement) eModelElement;
							String name = eNamedElement.getName();

							if (!safeEquals(value, name)) {
								EcoreUtil.setAnnotation(eNamedElement,
									UML2_UML_PACKAGE_2_0_NS_URI,
									ANNOTATION_DETAIL__ORIGINAL_NAME, name);
							}

							setName(eNamedElement, (String) value, true);
						} else {
							eModelElement.eSet(eStructuralFeature, value);
						}
					} else {

						if (propertyName == TAG_DEFINITION__XML_CONTENT_KIND) {
							Enumeration contentKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__EMPTY)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.EMPTY_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.SIMPLE_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__MIXED)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.MIXED_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_ONLY)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.ELEMENT_ONLY_CONTENT);
							}
						} else if (propertyName == TAG_DEFINITION__XML_FEATURE_KIND) {
							Enumeration featureKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.SIMPLE_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ATTRIBUTE_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE_WILDCARD)) {

								ExtendedMetaData.INSTANCE
									.setFeatureKind(
										(EStructuralFeature) eModelElement,
										ExtendedMetaData.ATTRIBUTE_WILDCARD_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ELEMENT_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_WILDCARD)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ELEMENT_WILDCARD_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__GROUP)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.GROUP_FEATURE);
							}
						} else if (propertyName == TAG_DEFINITION__XML_NAME) {

							if (eModelElement instanceof EClassifier) {
								ExtendedMetaData.INSTANCE
									.setName((EClassifier) eModelElement,
										(String) value);
							} else if (eModelElement instanceof EStructuralFeature) {
								ExtendedMetaData.INSTANCE.setName(
									(EStructuralFeature) eModelElement,
									(String) value);
							}
						} else if (propertyName == TAG_DEFINITION__XML_NAMESPACE) {
							ExtendedMetaData.INSTANCE.setNamespace(
								(EStructuralFeature) eModelElement,
								(String) value);
						} else if (propertyName == TAG_DEFINITION__VISIBILITY) {
							Enumeration visibilityKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (eModelElement instanceof EOperation) {

								if (value == visibilityKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__NONE)) {

									EcoreUtil.setSuppressedVisibility(
										(EOperation) eModelElement, true);
								}
							} else {
								eStructuralFeature = (EStructuralFeature) eModelElement;
								boolean isChangeable = eStructuralFeature
									.isChangeable();
								boolean isMany = eStructuralFeature.isMany();
								boolean isUnsettable = eStructuralFeature
									.isUnsettable();

								if (value == visibilityKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__NONE)) {

									EcoreUtil
										.setSuppressedVisibility(
											eStructuralFeature, EcoreUtil.GET,
											true);

									if (isChangeable && !isMany) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature, EcoreUtil.SET,
											true);
									}

									if (isUnsettable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature,
											EcoreUtil.IS_SET, true);

										if (isChangeable) {
											EcoreUtil.setSuppressedVisibility(
												eStructuralFeature,
												EcoreUtil.UNSET, true);
										}
									}
								} else if (value == visibilityKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY)) {

									if (!isMany && isChangeable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature, EcoreUtil.SET,
											true);
									}

									if (isUnsettable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature,
											EcoreUtil.IS_SET, true);

										if (isChangeable) {
											EcoreUtil.setSuppressedVisibility(
												eStructuralFeature,
												EcoreUtil.UNSET, true);
										}
									}
								} else if (value == visibilityKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__READ_WRITE)) {

									if (isUnsettable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature,
											EcoreUtil.IS_SET, true);

										if (isChangeable) {
											EcoreUtil.setSuppressedVisibility(
												eStructuralFeature,
												EcoreUtil.UNSET, true);
										}
									}
								} else if (value == visibilityKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY_UNSETTABLE)) {

									if (!isMany && isChangeable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature, EcoreUtil.SET,
											true);
									}

									if (isUnsettable && isChangeable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature,
											EcoreUtil.UNSET, true);
									}
								}
							}
						} else if (propertyName == TAG_DEFINITION__ANNOTATIONS) {
							@SuppressWarnings("unchecked")
							EList<String> annotations = (EList<String>) value;

							for (String annotation : annotations) {
								Matcher matcher = ANNOTATION_PATTERN
									.matcher(annotation);

								if (matcher.find()) {
									EAnnotation eAnnotation = getEAnnotation(
										eModelElement, parseString(matcher
											.group(1)), true);

									for (Matcher detailMatcher = ANNOTATION_DETAIL_PATTERN
										.matcher(matcher.group(2)); detailMatcher
										.find();) {

										eAnnotation.getDetails()
											.put(
												parseString(detailMatcher
													.group(1)),
												parseString(detailMatcher
													.group(4)));
									}
								}
							}
						}
						if (propertyName == TAG_DEFINITION__KEYS) {
							EList<EAttribute> eKeys = ((EReference) eModelElement)
								.getEKeys();

							@SuppressWarnings("unchecked")
							EList<Property> keys = (EList<Property>) value;

							for (Property key : keys) {

								if (!isEClass((Classifier) key.getType())) {
									eKeys.add((EAttribute) doSwitch(key));
								}
							}
						}
					}
				} else if (OPTION__REPORT.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))
					&& diagnostics != null) {

					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							ECORE_TAGGED_VALUE,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_UML2EcoreConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										eModelElement, getTagDefinition(
											stereotype, propertyName), value)),
							new Object[]{eModelElement}));
				}
			}
		}

		protected void processEcoreTaggedValues(EClassifier eClassifier,
				final Element element, final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {
			Stereotype eClassifierStereotype = new EcoreSwitch<Stereotype>() {

				@Override
				public Stereotype caseEClass(EClass eClass) {
					Stereotype eClassStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE__E_CLASS);

					if (eClassStereotype != null) {
						processEcoreTaggedValue(eClass,
							EcorePackage.Literals.ENAMED_ELEMENT__NAME,
							element, eClassStereotype,
							TAG_DEFINITION__CLASS_NAME, options, diagnostics,
							context);

						processEcoreTaggedValue(eClass, null, element,
							eClassStereotype, TAG_DEFINITION__XML_CONTENT_KIND,
							options, diagnostics, context);
					}

					return eClassStereotype;
				}

				@Override
				public Stereotype caseEDataType(EDataType eDataType) {
					Stereotype eDataTypeStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE__E_DATA_TYPE);

					if (eDataTypeStereotype != null) {
						processEcoreTaggedValue(eDataType,
							EcorePackage.Literals.ENAMED_ELEMENT__NAME,
							element, eDataTypeStereotype,
							TAG_DEFINITION__DATA_TYPE_NAME, options,
							diagnostics, context);
					}

					return eDataTypeStereotype;
				}
			}.doSwitch(eClassifier);

			if (eClassifierStereotype != null) {
				processEcoreTaggedValue(eClassifier, null, element,
					eClassifierStereotype, TAG_DEFINITION__XML_NAME, options,
					diagnostics, context);

				processEcoreTaggedValue(eClassifier,
					EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME,
					element, eClassifierStereotype,
					TAG_DEFINITION__INSTANCE_CLASS_NAME, options, diagnostics,
					context);

				processEcoreTaggedValue(eClassifier, null, element,
					eClassifierStereotype, TAG_DEFINITION__ANNOTATIONS,
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EEnum eEnum, Element element,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			Stereotype eEnumStereotype = getAppliedEcoreStereotype(element,
				STEREOTYPE__E_ENUM);

			if (eEnumStereotype != null) {
				processEcoreTaggedValue(eEnum,
					EcorePackage.Literals.ENAMED_ELEMENT__NAME, element,
					eEnumStereotype, TAG_DEFINITION__ENUM_NAME, options,
					diagnostics, context);

				processEcoreTaggedValue(eEnum, null, element, eEnumStereotype,
					TAG_DEFINITION__XML_NAME, options, diagnostics, context);

				processEcoreTaggedValue(eEnum, null, element, eEnumStereotype,
					TAG_DEFINITION__ANNOTATIONS, options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EEnumLiteral eEnumLiteral,
				Element element, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eEnumLiteralStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_ENUM_LITERAL);

			if (eEnumLiteralStereotype != null) {
				processEcoreTaggedValue(eEnumLiteral,
					EcorePackage.Literals.ENAMED_ELEMENT__NAME, element,
					eEnumLiteralStereotype, TAG_DEFINITION__ENUM_LITERAL_NAME,
					options, diagnostics, context);

				processEcoreTaggedValue(eEnumLiteral, null, element,
					eEnumLiteralStereotype, TAG_DEFINITION__ANNOTATIONS,
					options, diagnostics, context);

				processEcoreTaggedValue(eEnumLiteral,
					EcorePackage.Literals.EENUM_LITERAL__LITERAL, element,
					eEnumLiteralStereotype, TAG_DEFINITION__LITERAL, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EGenericType eGenericType,
				Element element, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			Stereotype eGenericTypeStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_GENERIC_TYPE);

			if (eGenericTypeStereotype != null) {

				if (element.hasValue(eGenericTypeStereotype,
					TAG_DEFINITION__LOWER_BOUND)) {

					Classifier value = (Classifier) element.getValue(
						eGenericTypeStereotype, TAG_DEFINITION__LOWER_BOUND);

					if (OPTION__PROCESS.equals(options
						.get(OPTION__ECORE_TAGGED_VALUES))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									ECORE_TAGGED_VALUE,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(
												context,
												eGenericType,
												getTagDefinition(
													eGenericTypeStereotype,
													TAG_DEFINITION__LOWER_BOUND),
												value)),
									new Object[]{eGenericType}));
						}

						eGenericType.setELowerBound(getEGenericType(value));
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__ECORE_TAGGED_VALUES))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ECORE_TAGGED_VALUE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eGenericType, getTagDefinition(
												eGenericTypeStereotype,
												TAG_DEFINITION__LOWER_BOUND),
											value)), new Object[]{eGenericType}));
					}
				}

				if (element.hasValue(eGenericTypeStereotype,
					TAG_DEFINITION__UPPER_BOUND)) {

					Classifier value = (Classifier) element.getValue(
						eGenericTypeStereotype, TAG_DEFINITION__UPPER_BOUND);

					if (OPTION__PROCESS.equals(options
						.get(OPTION__ECORE_TAGGED_VALUES))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									ECORE_TAGGED_VALUE,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(
												context,
												eGenericType,
												getTagDefinition(
													eGenericTypeStereotype,
													TAG_DEFINITION__UPPER_BOUND),
												value)),
									new Object[]{eGenericType}));
						}

						eGenericType.setEUpperBound(getEGenericType(value));
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__ECORE_TAGGED_VALUES))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ECORE_TAGGED_VALUE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eGenericType, getTagDefinition(
												eGenericTypeStereotype,
												TAG_DEFINITION__UPPER_BOUND),
											value)), new Object[]{eGenericType}));
					}
				}
			}
		}

		protected void processEcoreTaggedValues(EOperation eOperation,
				Element element, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eOperationStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_OPERATION);

			if (eOperationStereotype != null) {
				processEcoreTaggedValue(eOperation,
					EcorePackage.Literals.ENAMED_ELEMENT__NAME, element,
					eOperationStereotype, TAG_DEFINITION__OPERATION_NAME,
					options, diagnostics, context);

				processEcoreTaggedValue(eOperation, null, element,
					eOperationStereotype, TAG_DEFINITION__ANNOTATIONS, options,
					diagnostics, context);

				processEcoreTaggedValue(eOperation, null, element,
					eOperationStereotype, TAG_DEFINITION__VISIBILITY, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EPackage ePackage,
				Element element, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype ePackageStereotype = getAppliedEcoreStereotype(element,
				STEREOTYPE__E_PACKAGE);

			if (ePackageStereotype != null) {
				processEcoreTaggedValue(ePackage,
					EcorePackage.Literals.ENAMED_ELEMENT__NAME, element,
					ePackageStereotype, TAG_DEFINITION__PACKAGE_NAME, options,
					diagnostics, context);

				processEcoreTaggedValue(ePackage,
					EcorePackage.Literals.EPACKAGE__NS_PREFIX, element,
					ePackageStereotype, TAG_DEFINITION__NS_PREFIX, options,
					diagnostics, context);

				if (isEmpty(ePackage.getNsPrefix())) {
					processEcoreTaggedValue(ePackage,
						EcorePackage.Literals.EPACKAGE__NS_PREFIX, element,
						ePackageStereotype, TAG_DEFINITION__BASE_PACKAGE,
						options, diagnostics, context);

					String nsPrefix = ePackage.getNsPrefix();

					if (!isEmpty(nsPrefix)) {
						ePackage.setNsPrefix(nsPrefix + '.'
							+ ePackage.getName());
					}
				}

				processEcoreTaggedValue(ePackage,
					EcorePackage.Literals.EPACKAGE__NS_URI, element,
					ePackageStereotype, TAG_DEFINITION__NS_URI, options,
					diagnostics, context);

				processEcoreTaggedValue(ePackage, null, element,
					ePackageStereotype, TAG_DEFINITION__ANNOTATIONS, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EParameter eParameter,
				Element element, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eParameterStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_PARAMETER);

			if (eParameterStereotype != null) {
				processEcoreTaggedValue(eParameter,
					EcorePackage.Literals.ENAMED_ELEMENT__NAME, element,
					eParameterStereotype, TAG_DEFINITION__PARAMETER_NAME,
					options, diagnostics, context);

				processEcoreTaggedValue(eParameter, null, element,
					eParameterStereotype, TAG_DEFINITION__ANNOTATIONS, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(
				EStructuralFeature eStructuralFeature, final Element element,
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {
			Stereotype eStructuralFeatureStereotype = new EcoreSwitch<Stereotype>() {

				@Override
				public Stereotype caseEAttribute(EAttribute eAttribute) {
					Stereotype eAttributeStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE__E_ATTRIBUTE);

					if (eAttributeStereotype != null) {
						processEcoreTaggedValue(eAttribute,
							EcorePackage.Literals.ENAMED_ELEMENT__NAME,
							element, eAttributeStereotype,
							TAG_DEFINITION__ATTRIBUTE_NAME, options,
							diagnostics, context);

						processEcoreTaggedValue(eAttribute,
							EcorePackage.Literals.EATTRIBUTE__ID, element,
							eAttributeStereotype, TAG_DEFINITION__IS_ID,
							options, diagnostics, context);
					}

					return eAttributeStereotype;
				}

				@Override
				public Stereotype caseEReference(EReference eReference) {
					Stereotype eReferenceStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE__E_REFERENCE);

					if (eReferenceStereotype != null) {
						processEcoreTaggedValue(eReference,
							EcorePackage.Literals.ENAMED_ELEMENT__NAME,
							element, eReferenceStereotype,
							TAG_DEFINITION__REFERENCE_NAME, options,
							diagnostics, context);

						processEcoreTaggedValue(eReference,
							EcorePackage.Literals.EREFERENCE__RESOLVE_PROXIES,
							element, eReferenceStereotype,
							TAG_DEFINITION__IS_RESOLVE_PROXIES, options,
							diagnostics, context);

						processEcoreTaggedValue(eReference, null, element,
							eReferenceStereotype, TAG_DEFINITION__KEYS,
							options, diagnostics, context);
					}

					return eReferenceStereotype;
				}
			}.doSwitch(eStructuralFeature);

			if (eStructuralFeatureStereotype != null) {
				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.Literals.ESTRUCTURAL_FEATURE__TRANSIENT,
					element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_TRANSIENT, options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.Literals.ESTRUCTURAL_FEATURE__UNSETTABLE,
					element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_UNSETTABLE, options, diagnostics,
					context);

				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.Literals.ESTRUCTURAL_FEATURE__VOLATILE,
					element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_VOLATILE, options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, TAG_DEFINITION__XML_NAME,
					options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_NAMESPACE, options, diagnostics,
					context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_FEATURE_KIND, options, diagnostics,
					context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, TAG_DEFINITION__VISIBILITY,
					options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, TAG_DEFINITION__ANNOTATIONS,
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(ETypeParameter eTypeParameter,
				Element element, final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {
			Stereotype eTypeParameterStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_TYPE_PARAMETER);

			if (eTypeParameterStereotype != null
				&& element.hasValue(eTypeParameterStereotype,
					TAG_DEFINITION__BOUNDS)) {

				@SuppressWarnings("unchecked")
				EList<Classifier> value = (EList<Classifier>) element.getValue(
					eTypeParameterStereotype, TAG_DEFINITION__BOUNDS);

				if (OPTION__PROCESS.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ECORE_TAGGED_VALUE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eTypeParameter, getTagDefinition(
												eTypeParameterStereotype,
												TAG_DEFINITION__BOUNDS), value)),
								new Object[]{eTypeParameter}));
					}

					EList<EGenericType> eBounds = eTypeParameter.getEBounds();

					for (Classifier bound : value) {
						eBounds.add(getEGenericType(bound));
					}
				} else if (OPTION__REPORT.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))
					&& diagnostics != null) {

					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							ECORE_TAGGED_VALUE,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_UML2EcoreConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										eTypeParameter, getTagDefinition(
											eTypeParameterStereotype,
											TAG_DEFINITION__BOUNDS), value)),
							new Object[]{eTypeParameter}));
				}
			}
		}

		protected void processEcoreTaggedValues(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (final Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {

				EModelElement eModelElement = entry.getValue();

				new EcoreSwitch<Object>() {

					@Override
					public Object caseEClassifier(EClassifier eClassifier) {
						processEcoreTaggedValues(eClassifier, entry.getKey(),
							options, diagnostics, context);

						return eClassifier;
					}

					@Override
					public Object caseEEnum(EEnum eEnum) {
						processEcoreTaggedValues(eEnum, entry.getKey(),
							options, diagnostics, context);

						return eEnum;
					}

					@Override
					public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
						processEcoreTaggedValues(eEnumLiteral, entry.getKey(),
							options, diagnostics, context);

						return eEnumLiteral;
					}

					@Override
					public Object caseEOperation(EOperation eOperation) {
						processEcoreTaggedValues(eOperation, entry.getKey(),
							options, diagnostics, context);

						return eOperation;
					}

					@Override
					public Object caseEPackage(EPackage ePackage) {
						processEcoreTaggedValues(ePackage, entry.getKey(),
							options, diagnostics, context);

						return ePackage;
					}

					@Override
					public Object caseEParameter(EParameter eParameter) {
						processEcoreTaggedValues(eParameter, entry.getKey(),
							options, diagnostics, context);

						return eParameter;
					}

					@Override
					public Object caseEStructuralFeature(
							EStructuralFeature eStructuralFeature) {
						processEcoreTaggedValues(eStructuralFeature, entry
							.getKey(), options, diagnostics, context);

						return eStructuralFeature;
					}

				}.doSwitch(eModelElement);
			}
		}

		protected void processRedefiningOperations(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {
				Element element = entry.getKey();
				EModelElement eModelElement = entry.getValue();

				if (eModelElement instanceof EOperation
					&& element instanceof Operation) {

					Operation operation = (Operation) element;

					for (Operation redefinedOperation : operation
						.getRedefinedOperations()) {

						EOperation eOperation = (EOperation) elementToEModelElementMap
							.get(redefinedOperation);

						if (DEBUG) {
							System.out.println(getQualifiedText(eModelElement)
								+ " redefines " + getQualifiedText(eOperation)); //$NON-NLS-1$
						}

						if (OPTION__PROCESS.equals(options
							.get(OPTION__REDEFINING_OPERATIONS))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										REDEFINING_OPERATION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML2EcoreConverter_ProcessRedefiningOperation_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													eOperation)), new Object[]{
											eModelElement, eOperation}));
							}

							getEAnnotation(eModelElement,
								ANNOTATION__REDEFINES, true).getReferences()
								.add(eOperation);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__REDEFINING_OPERATIONS))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									REDEFINING_OPERATION,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_ReportRedefiningOperation_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eModelElement, eOperation)),
									new Object[]{eModelElement, eOperation}));
						}
					}
				}
			}
		}

		protected void processRedefiningProperties(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {

				Element element = entry.getKey();
				EModelElement eModelElement = entry.getValue();

				if (eModelElement instanceof EStructuralFeature
					&& element instanceof Property) {

					Property property = (Property) element;

					for (Property redefinedProperty : property
						.getRedefinedProperties()) {

						if (redefinedProperty.getOwningAssociation() == null) {
							EStructuralFeature eStructuralFeature = (EStructuralFeature) elementToEModelElementMap
								.get(redefinedProperty);

							if (DEBUG) {
								System.out
									.println(getQualifiedText(eModelElement)
										+ " redefines " //$NON-NLS-1$
										+ getQualifiedText(eStructuralFeature));
							}

							if (OPTION__PROCESS.equals(options
								.get(OPTION__REDEFINING_PROPERTIES))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											REDEFINING_PROPERTY,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML2EcoreConverter_ProcessRedefiningProperty_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eModelElement,
														eStructuralFeature)),
											new Object[]{eModelElement,
												eStructuralFeature}));
								}

								getEAnnotation(eModelElement,
									ANNOTATION__REDEFINES, true)
									.getReferences().add(eStructuralFeature);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__REDEFINING_PROPERTIES))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										REDEFINING_PROPERTY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML2EcoreConverter_ReportRedefiningProperty_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													eStructuralFeature)),
										new Object[]{eModelElement,
											eStructuralFeature}));
							}
						}
					}
				}
			}
		}

		protected boolean isCompositeSubset(Property property) {

			for (Property subsettedProperty : property.getSubsettedProperties()) {

				if (subsettedProperty.isComposite()
					|| isCompositeSubset(subsettedProperty)) {

					return true;
				}
			}

			return false;
		}

		protected void processSubsettingProperties(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {
				Element element = entry.getKey();
				EModelElement eModelElement = entry.getValue();

				if (eModelElement instanceof EStructuralFeature
					&& element instanceof Property) {

					Property property = (Property) element;

					for (Property subsettedProperty : property
						.getSubsettedProperties()) {

						if (subsettedProperty.getOwningAssociation() == null) {
							EStructuralFeature subsettedEStructuralFeature = (EStructuralFeature) elementToEModelElementMap
								.get(subsettedProperty);

							if (DEBUG) {
								System.out
									.println(getQualifiedText(eModelElement)
										+ " subsets " //$NON-NLS-1$
										+ getQualifiedText(subsettedEStructuralFeature));
							}

							if (OPTION__PROCESS.equals(options
								.get(OPTION__SUBSETTING_PROPERTIES))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											SUBSETTING_PROPERTY,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML2EcoreConverter_ProcessSubsettingProperty_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eModelElement,
														subsettedEStructuralFeature)),
											new Object[]{eModelElement,
												subsettedEStructuralFeature}));
								}

								if (!subsettedEStructuralFeature.isDerived()
									&& subsettedEStructuralFeature instanceof EReference) {

									EReference subsettedEReference = (EReference) subsettedEStructuralFeature;
									EReference eReference = (EReference) eModelElement;

									if (subsettedEReference.isContainment()
										|| isCompositeSubset(subsettedProperty)) {

										eReference.setContainment(false);
									}

									if (!eReference.isContainment()) {
										eReference
											.setResolveProxies(subsettedEReference
												.isResolveProxies());
									}
								}

								getEAnnotation(eModelElement,
									ANNOTATION__SUBSETS, true).getReferences()
									.add(
										elementToEModelElementMap
											.get(subsettedProperty));
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__SUBSETTING_PROPERTIES))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										SUBSETTING_PROPERTY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML2EcoreConverter_ReportSubsettingProperty_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													subsettedEStructuralFeature)),
										new Object[]{eModelElement,
											subsettedEStructuralFeature}));
							}
						}
					}
				}
			}
		}

		protected void processUnionProperties(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {
				Element element = entry.getKey();
				EModelElement eModelElement = entry.getValue();

				if (eModelElement instanceof EStructuralFeature
					&& element instanceof Property
					&& ((Property) element).isDerivedUnion()) {

					EStructuralFeature eStructuralFeature = (EStructuralFeature) eModelElement;

					if (DEBUG) {
						System.out.println(getQualifiedText(eStructuralFeature)
							+ " is a union"); //$NON-NLS-1$
					}

					if (OPTION__PROCESS.equals(options
						.get(OPTION__UNION_PROPERTIES))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									UNION_PROPERTY,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_ProcessUnionProperty_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eStructuralFeature)),
									new Object[]{eStructuralFeature}));
						}

						getEAnnotation(eStructuralFeature, ANNOTATION__UNION,
							true);

						eStructuralFeature.setChangeable(false);
						eStructuralFeature.setTransient(true);
						eStructuralFeature.setVolatile(true);
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__UNION_PROPERTIES))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UNION_PROPERTY,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ReportUnionProperty_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eModelElement)),
								new Object[]{eModelElement}));
					}
				}
			}
		}

		protected void processDerivedFeatures(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (EModelElement eModelElement : elementToEModelElementMap
				.values()) {

				if (eModelElement instanceof EStructuralFeature) {
					EStructuralFeature.Internal eStructuralFeature = (EStructuralFeature.Internal) eModelElement;

					if (eStructuralFeature.isDerived()
						&& (eStructuralFeature.isContainment() || !eStructuralFeature
							.isVolatile())) {

						if (OPTION__PROCESS.equals(options
							.get(OPTION__DERIVED_FEATURES))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										DERIVED_FEATURE,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML2EcoreConverter_ProcessDerivedFeature_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eStructuralFeature)),
										new Object[]{eStructuralFeature}));
							}

							if (eStructuralFeature instanceof EReference) {
								((EReference) eStructuralFeature)
									.setContainment(false);
							}

							eStructuralFeature.setTransient(true);
							eStructuralFeature.setVolatile(true);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__DERIVED_FEATURES))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									DERIVED_FEATURE,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_ReportDerivedFeature_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eStructuralFeature)),
									new Object[]{eStructuralFeature}));
						}
					}
				}
			}
		}

		protected void ensureConformity(ETypedElement eTypedElement,
				ETypedElement otherETypedElement) {

			if (eTypedElement.isRequired() != otherETypedElement.isRequired()) {
				int lowerBound = eTypedElement.getLowerBound();
				int otherLowerBound = otherETypedElement.getLowerBound();

				int lesserLowerBound = getLesserLowerBound(otherLowerBound,
					lowerBound);

				if (lesserLowerBound != otherLowerBound) {

					if (DEBUG) {
						System.err.println("Changed lower bound of " //$NON-NLS-1$
							+ getQualifiedText(otherETypedElement) + " from " //$NON-NLS-1$
							+ otherLowerBound + " to " //$NON-NLS-1$
							+ lesserLowerBound);
					}

					otherETypedElement.setLowerBound(lesserLowerBound);
				}

				if (lesserLowerBound != lowerBound) {

					if (DEBUG) {
						System.out.println("Changed lower bound of " //$NON-NLS-1$
							+ getQualifiedText(eTypedElement) + " from " //$NON-NLS-1$
							+ lowerBound + " to " //$NON-NLS-1$
							+ lesserLowerBound);
					}

					eTypedElement.setLowerBound(lesserLowerBound);
				}
			}

			boolean isMany = eTypedElement.isMany();
			boolean otherIsMany = otherETypedElement.isMany();

			if (isMany != otherIsMany) {
				int upperBound = eTypedElement.getUpperBound();
				int otherUpperBound = otherETypedElement.getUpperBound();

				int greaterUpperBound = getGreaterUpperBound(otherUpperBound,
					upperBound);

				if (greaterUpperBound != otherUpperBound) {

					if (DEBUG) {
						System.err.println("Changed upper bound of " //$NON-NLS-1$
							+ getQualifiedText(otherETypedElement) + " from " //$NON-NLS-1$
							+ otherUpperBound + " to " //$NON-NLS-1$
							+ greaterUpperBound);
					}

					otherETypedElement.setUpperBound(greaterUpperBound);
				}

				if (greaterUpperBound != upperBound) {

					if (DEBUG) {
						System.out.println("Changed upper bound of " //$NON-NLS-1$
							+ getQualifiedText(eTypedElement) + " from " //$NON-NLS-1$
							+ upperBound + " to " //$NON-NLS-1$
							+ greaterUpperBound);
					}

					eTypedElement.setUpperBound(greaterUpperBound);
				}
			}

			if (!isMany && !otherIsMany) {
				EClassifier eType = eTypedElement.getEType();
				EClassifier otherEType = otherETypedElement.getEType();

				EClassifier commonEType = getCommonEType(otherEType, eType);

				if (commonEType != otherEType) {

					if (DEBUG) {
						System.err.println("Changed type of " //$NON-NLS-1$
							+ getQualifiedText(otherETypedElement)
							+ " from " //$NON-NLS-1$
							+ getQualifiedText(otherEType)
							+ " to " + getQualifiedText(commonEType)); //$NON-NLS-1$
					}

					otherETypedElement.setEType(commonEType);
				}

				if (commonEType != eType) {

					if (DEBUG) {
						System.out.println("Changed type of " //$NON-NLS-1$
							+ getQualifiedText(eTypedElement)
							+ " from " //$NON-NLS-1$
							+ getQualifiedText(eType)
							+ " to " + getQualifiedText(commonEType)); //$NON-NLS-1$
					}

					eTypedElement.setEType(commonEType);
				}
			}

			eTypedElement.setOrdered(otherETypedElement.isOrdered());

			eTypedElement.setUnique(otherETypedElement.isUnique());
		}

		protected void qualifyName(ENamedElement eNamedElement) {
			EObject eContainer = eNamedElement.eContainer();

			if (eContainer instanceof ENamedElement) {
				qualifyName(eNamedElement, ((ENamedElement) eContainer)
					.getName());
			}
		}

		protected void qualifyName(ENamedElement eNamedElement, String qualifier) {
			String qualifiedName = qualifier + '_' + eNamedElement.getName();

			if (DEBUG) {
				System.err.println("Qualified " //$NON-NLS-1$
					+ getQualifiedText(eNamedElement) + " as " //$NON-NLS-1$
					+ qualifiedName);
			}

			eNamedElement.setName(qualifiedName);
		}

		protected void processDuplicateOperations(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			List<EOperation> operationsToDuplicate = new UniqueEList.FastCompare<EOperation>();

			for (EModelElement eModelElement : elementToEModelElementMap
				.values()) {

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					for (Iterator<EOperation> eOperations = eClass
						.getEOperations().iterator(); eOperations.hasNext();) {
						EOperation eOperation = eOperations.next();

						for (EOperation otherEOperation : eClass
							.getEAllOperations()) {

							if (otherEOperation == eOperation) {
								break;
							} else if (new SignatureMatcher(eOperation)
								.matches(otherEOperation)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__DUPLICATE_OPERATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_OPERATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML2EcoreConverter_ProcessDuplicateOperation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eOperation,
															otherEOperation)),
												new Object[]{eClass,
													otherEOperation}));
									}

									operationsToDuplicate.add(eOperation);

									ensureConformity(eOperation,
										otherEOperation);

									List<EObject> redefinedOperations = getEAnnotation(
										eOperation, ANNOTATION__REDEFINES, true)
										.getReferences();

									if (!redefinedOperations
										.contains(otherEOperation)) {

										redefinedOperations
											.add(otherEOperation);
									}
								} else if (OPTION__DISCARD.equals(options
									.get(OPTION__DUPLICATE_OPERATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.WARNING,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_OPERATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML2EcoreConverter_DiscardDuplicateOperation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eOperation,
															otherEOperation)),
												new Object[]{eClass,
													otherEOperation}));
									}

									eOperations.remove();
									break;
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__DUPLICATE_OPERATIONS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.ERROR,
											UMLValidator.DIAGNOSTIC_SOURCE,
											DUPLICATE_OPERATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML2EcoreConverter_ReportDuplicateOperation_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eOperation,
														otherEOperation)),
											new Object[]{eOperation,
												otherEOperation}));
								}
							}
						}
					}
				}
			}

			for (EOperation eOperation : operationsToDuplicate) {
				getEAnnotation(eOperation.getEContainingClass(),
					ANNOTATION__DUPLICATES, true).getContents().add(eOperation);
			}
		}

		protected void processDuplicateOperationInheritance(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (EModelElement eModelElement : elementToEModelElementMap
				.values()) {

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					if (eClass.getESuperTypes().size() > 1) {
						Iterator<EClass> eSuperTypes = eClass.getESuperTypes()
							.iterator();
						eSuperTypes.next();

						while (eSuperTypes.hasNext()) {
							EClass mixinEClass = eSuperTypes.next();

							mixinEOperationLoop : for (EOperation mixinEOperation : mixinEClass
								.getEAllOperations()) {

								for (EOperation eOperation : eClass
									.getEAllOperations()) {

									if (eOperation == mixinEOperation) {
										break;
									} else if (new SignatureMatcher(
										mixinEOperation).matches(eOperation)) {

										if (OPTION__PROCESS
											.equals(options
												.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.INFO,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_OPERATION_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML2EcoreConverter_ProcessDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eOperation,
																	mixinEOperation)),
														new Object[]{eClass,
															eOperation,
															mixinEOperation}));
											}

											qualifyName(mixinEOperation);

											List<EObject> redefinedOperations = getEAnnotation(
												mixinEOperation,
												ANNOTATION__REDEFINES, true)
												.getReferences();

											if (!redefinedOperations
												.contains(eOperation)) {

												redefinedOperations
													.add(eOperation);
											}
										} else if (OPTION__DISCARD
											.equals(options
												.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.WARNING,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_OPERATION_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML2EcoreConverter_DiscardDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eOperation,
																	mixinEOperation)),
														new Object[]{eClass,
															eOperation,
															mixinEOperation}));
											}

											eSuperTypes.remove();
											break mixinEOperationLoop;
										} else if (OPTION__REPORT
											.equals(options
												.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))
											&& diagnostics != null) {

											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.ERROR,
													UMLValidator.DIAGNOSTIC_SOURCE,
													DUPLICATE_OPERATION_INHERITANCE,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_UML2EcoreConverter_ReportDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																eClass,
																eOperation,
																mixinEOperation)),
													new Object[]{eClass,
														eOperation,
														mixinEOperation}));
										}
									}
								}
							}
						}
					}
				}
			}
		}

		protected void processDuplicateFeatures(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			EList<EStructuralFeature.Internal> featuresToDuplicate = new UniqueEList.FastCompare<EStructuralFeature.Internal>();
			EList<EStructuralFeature> featuresToRemove = new UniqueEList.FastCompare<EStructuralFeature>();

			for (EModelElement eModelElement : elementToEModelElementMap
				.values()) {

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					for (Iterator<EStructuralFeature> eStructuralFeatures = eClass
						.getEStructuralFeatures().iterator(); eStructuralFeatures
						.hasNext();) {

						EStructuralFeature.Internal eStructuralFeature = (EStructuralFeature.Internal) eStructuralFeatures
							.next();

						for (EStructuralFeature otherEStructuralFeature : eClass
							.getEAllStructuralFeatures()) {

							if (otherEStructuralFeature == eStructuralFeature) {
								break;
							} else if (new NameMatcher(eStructuralFeature)
								.matches(otherEStructuralFeature)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__DUPLICATE_FEATURES))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_FEATURE,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML2EcoreConverter_ProcessDuplicateFeature_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eStructuralFeature,
															otherEStructuralFeature)),
												new Object[]{
													eStructuralFeature,
													otherEStructuralFeature}));
									}

									int lowerBound = eStructuralFeature
										.getLowerBound();
									int upperBound = eStructuralFeature
										.getUpperBound();
									EClassifier eType = eStructuralFeature
										.getEType();

									if (!featuresToDuplicate
										.contains(eStructuralFeature)) {

										EStructuralFeature.Internal duplicateEStructuralFeature = otherEStructuralFeature
											.isDerived()
											&& !eStructuralFeature.isDerived()
											? (EStructuralFeature.Internal) otherEStructuralFeature
											: eStructuralFeature;

										if (DEBUG
											&& duplicateEStructuralFeature == otherEStructuralFeature) {

											System.err
												.println("Non-derived feature " //$NON-NLS-1$
													+ getQualifiedText(eStructuralFeature)
													+ " is a duplicate of derived feature " //$NON-NLS-1$
													+ getQualifiedText(otherEStructuralFeature));
										}

										featuresToDuplicate
											.add(duplicateEStructuralFeature);

										ensureConformity(eStructuralFeature,
											otherEStructuralFeature);
									}

									EAnnotation redefinesAnnotation = getEAnnotation(
										eStructuralFeature,
										ANNOTATION__REDEFINES, true);

									EList<EObject> redefinedFeatures = redefinesAnnotation
										.getReferences();

									if (!redefinedFeatures
										.contains(otherEStructuralFeature)) {

										redefinedFeatures
											.add(otherEStructuralFeature);
									}

									EMap<String, String> redefinitionDetails = redefinesAnnotation
										.getDetails();

									if (eStructuralFeature.getLowerBound() != lowerBound) {
										redefinitionDetails
											.put(
												EcorePackage.Literals.ETYPED_ELEMENT__LOWER_BOUND
													.getName(), String
													.valueOf(lowerBound));
									}

									if (eStructuralFeature.getUpperBound() != upperBound) {
										redefinitionDetails
											.put(
												EcorePackage.Literals.ETYPED_ELEMENT__UPPER_BOUND
													.getName(), String
													.valueOf(upperBound));
									}

									if (eStructuralFeature.getEType() != eType) {
										redefinitionDetails
											.put(
												EcorePackage.Literals.ETYPED_ELEMENT__ETYPE
													.getName(),
												getQualifiedName(eType,
													NamedElement.SEPARATOR));
									}
								} else if (OPTION__DISCARD.equals(options
									.get(OPTION__DUPLICATE_FEATURES))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.WARNING,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_FEATURE,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML2EcoreConverter_DiscardDuplicateFeature_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eStructuralFeature,
															otherEStructuralFeature)),
												new Object[]{eClass,
													otherEStructuralFeature}));
									}

									EReference eOpposite = eStructuralFeature
										.getEOpposite();

									if (eOpposite != null) {
										featuresToRemove.add(eOpposite);
									}

									eStructuralFeatures.remove();
									break;
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__DUPLICATE_FEATURES))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.ERROR,
											UMLValidator.DIAGNOSTIC_SOURCE,
											DUPLICATE_FEATURE,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML2EcoreConverter_ReportDuplicateFeature_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														eStructuralFeature,
														otherEStructuralFeature)),
											new Object[]{eStructuralFeature,
												otherEStructuralFeature}));
								}
							}
						}
					}
				}
			}

			for (EStructuralFeature.Internal eStructuralFeature : featuresToDuplicate) {
				EAnnotation duplicatesAnnotation = getEAnnotation(
					eStructuralFeature.getEContainingClass(),
					ANNOTATION__DUPLICATES, true);
				duplicatesAnnotation.getContents().add(eStructuralFeature);

				EAnnotation redefinesAnnotation = eStructuralFeature
					.getEAnnotation(ANNOTATION__REDEFINES);

				if (redefinesAnnotation != null) {
					EMap<String, String> redefinitionDetails = redefinesAnnotation
						.getDetails();

					if (!redefinitionDetails.isEmpty()) {
						getEAnnotation(duplicatesAnnotation,
							eStructuralFeature.getName(), true).getDetails()
							.putAll(redefinitionDetails);
						redefinitionDetails.clear();
					}
				}

				EReference eOpposite = eStructuralFeature.getEOpposite();

				if (eOpposite != null
					&& !featuresToDuplicate.contains(eOpposite)) {

					eOpposite.setEOpposite(null);

					if (eStructuralFeature.isContainment()) {
						eOpposite.setChangeable(false);
						eOpposite.setTransient(true);
					}

					eOpposite.setVolatile(true);
				}
			}

			for (EStructuralFeature eStructuralFeature : featuresToRemove) {
				EClass eContainingClass = eStructuralFeature
					.getEContainingClass();

				if (eContainingClass != null) {
					eContainingClass.getEStructuralFeatures().remove(
						eStructuralFeature);
				}
			}
		}

		protected void processDuplicateFeatureInheritance(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (EModelElement eModelElement : elementToEModelElementMap
				.values()) {

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					if (eClass.getESuperTypes().size() > 1) {
						Iterator<EClass> eSuperTypes = eClass.getESuperTypes()
							.iterator();
						eSuperTypes.next();

						while (eSuperTypes.hasNext()) {
							EClass mixinEClass = eSuperTypes.next();

							mixinEStructuralFeatureLoop : for (EStructuralFeature mixinEStructuralFeature : mixinEClass
								.getEAllStructuralFeatures()) {

								for (EStructuralFeature eStructuralFeature : eClass
									.getEAllStructuralFeatures()) {

									if (eStructuralFeature == mixinEStructuralFeature) {
										break;
									} else if (new NameMatcher(
										mixinEStructuralFeature)
										.matches(eStructuralFeature)) {

										if (OPTION__PROCESS
											.equals(options
												.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.INFO,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_FEATURE_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML2EcoreConverter_ProcessDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eStructuralFeature,
																	mixinEStructuralFeature)),
														new Object[]{eClass,
															eStructuralFeature,
															mixinEStructuralFeature}));
											}

											qualifyName(mixinEStructuralFeature);

											EList<EObject> redefinedFeatures = getEAnnotation(
												mixinEStructuralFeature,
												ANNOTATION__REDEFINES, true)
												.getReferences();

											if (!redefinedFeatures
												.contains(eStructuralFeature)) {

												redefinedFeatures
													.add(eStructuralFeature);
											}
										} else if (OPTION__DISCARD
											.equals(options
												.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.WARNING,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_FEATURE_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML2EcoreConverter_DiscardDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eStructuralFeature,
																	mixinEStructuralFeature)),
														new Object[]{eClass,
															eStructuralFeature,
															mixinEStructuralFeature}));
											}

											eSuperTypes.remove();
											break mixinEStructuralFeatureLoop;
										} else if (OPTION__REPORT
											.equals(options
												.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))
											&& diagnostics != null) {

											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.ERROR,
													UMLValidator.DIAGNOSTIC_SOURCE,
													DUPLICATE_FEATURE_INHERITANCE,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_UML2EcoreConverter_ReportDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																eClass,
																eStructuralFeature,
																mixinEStructuralFeature)),
													new Object[]{eClass,
														eStructuralFeature,
														mixinEStructuralFeature}));
										}
									}
								}
							}
						}
					}
				}
			}
		}

		protected void processSuperClassOrder(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Comparator<EClass> eClassComparator = new Comparator<EClass>() {

				public int compare(EClass eClass, EClass otherEClass) {
					int eAllStructuralFeaturesSize = eClass
						.getEAllStructuralFeatures().size();
					int otherEAllStructuralFeaturesSize = otherEClass
						.getEAllStructuralFeatures().size();

					return eAllStructuralFeaturesSize < otherEAllStructuralFeaturesSize
						? 1
						: (otherEAllStructuralFeaturesSize < eAllStructuralFeaturesSize
							? -1
							: CommonPlugin.INSTANCE.getComparator().compare(
								eClass.getName(), otherEClass.getName()));
				}
			};

			for (Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {
				Element key = entry.getKey();
				EModelElement value = entry.getValue();

				if (key instanceof Classifier && value instanceof EClass) {
					EClass eClass = (EClass) value;
					EList<EClass> eSuperTypes = eClass.getESuperTypes();

					List<EClass> extendSuperClasses = new ArrayList<EClass>();
					List<EClass> unspecifiedSuperClasses = new ArrayList<EClass>();
					List<EClass> mixinSuperClasses = new ArrayList<EClass>();

					for (Generalization generalization : ((Classifier) key)
						.getGeneralizations()) {
						Classifier general = generalization.getGeneral();

						if (general != null) {
							EModelElement eModelElement = elementToEModelElementMap
								.get(general);

							if (eSuperTypes.contains(eModelElement)) {

								if (generalization.hasKeyword("extend")) { //$NON-NLS-1$
									extendSuperClasses
										.add((EClass) eModelElement);
								} else if (generalization.hasKeyword("mixin")) { //$NON-NLS-1$
									mixinSuperClasses
										.add((EClass) eModelElement);
								} else {
									unspecifiedSuperClasses
										.add((EClass) eModelElement);
								}
							}
						}

					}

					Collections.sort(extendSuperClasses, eClassComparator);
					Collections.sort(unspecifiedSuperClasses, eClassComparator);
					Collections.sort(mixinSuperClasses, eClassComparator);

					List<EClass> superClasses = new UniqueEList.FastCompare<EClass>(
						extendSuperClasses);
					superClasses.addAll(unspecifiedSuperClasses);
					superClasses.addAll(mixinSuperClasses);

					if (!superClasses.equals(eSuperTypes)) {

						if (OPTION__PROCESS.equals(options
							.get(OPTION__SUPER_CLASS_ORDER))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										SUPER_CLASS_ORDER,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML2EcoreConverter_ProcessSuperClassOrder_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eClass)),
										new Object[]{eClass}));
							}

							for (ListIterator<EClass> sc = superClasses
								.listIterator(); sc.hasNext();) {

								EClass superClass = sc.next();
								eSuperTypes
									.move(sc.previousIndex(), superClass);
							}
						}
						if (OPTION__REPORT.equals(options
							.get(OPTION__SUPER_CLASS_ORDER))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									SUPER_CLASS_ORDER,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_ReportSuperClassOrder_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eClass)), new Object[]{eClass}));
						}
					}
				}
			}
		}

		protected void processComment(EModelElement eModelElement,
				String comment, final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			if (OPTION__PROCESS.equals(options.get(OPTION__COMMENTS))) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.INFO,
						UMLValidator.DIAGNOSTIC_SOURCE, COMMENT,
						UMLPlugin.INSTANCE.getString(
							"_UI_UML2EcoreConverter_ProcessComment_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, eModelElement)),
						new Object[]{eModelElement}));
				}

				addDocumentation(eModelElement, comment, getLineSeparator());
			} else if (OPTION__REPORT.equals(options.get(OPTION__COMMENTS))
				&& diagnostics != null) {

				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE, COMMENT, UMLPlugin.INSTANCE
						.getString(
							"_UI_UML2EcoreConverter_ReportComment_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, eModelElement)),
					new Object[]{eModelElement}));
			}
		}

		protected void processOperationBody(EOperation eOperation,
				EList<String> languages, EList<String> bodies,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			int languagesSize = languages.size();
			int bodiesSize = bodies.size();

			for (int i = 0; i < (languagesSize == bodiesSize
				? bodiesSize
				: (bodiesSize == 1
					? 1
					: 0)); i++) {

				String language = i < languagesSize
					? languages.get(i)
					: LANGUAGE__OCL;

				if (OPTION__PROCESS.equals(options
					.get(OPTION__OPERATION_BODIES))) {

					String body = bodies.get(i);

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								OPERATION_BODY,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ProcessOperationBody_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eOperation, language)),
								new Object[]{eOperation}));

					}

					String source = UML2_GEN_MODEL_PACKAGE_1_1_NS_URI;

					if (LANGUAGE__OCL.equals(language)) {
						body = getOCLBody(body);

						if (OPTION__PROCESS.equals(options
							.get(OPTION__INVOCATION_DELEGATES))) {

							addInvocationDelegate(
								(EPackage) getContainingEObject(eOperation,
									EcorePackage.Literals.EPACKAGE, true),
								OCL_DELEGATE_URI);

							source = OCL_DELEGATE_URI;
						}
					} else if (LANGUAGE__JAVA.equals(language)) {
						source = EMF_GEN_MODEL_PACKAGE_NS_URI;
					}

					EcoreUtil.setAnnotation(eOperation, source,
						ANNOTATION_DETAIL__BODY, body);
				} else if (OPTION__REPORT.equals(options
					.get(OPTION__OPERATION_BODIES)) && diagnostics != null) {

					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							OPERATION_BODY,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_UML2EcoreConverter_ReportOperationBody_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										eOperation, language)),
							new Object[]{eOperation}));
				}
			}
		}

		protected void processOperationBodies(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			for (Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {

				Element key = entry.getKey();
				EModelElement value = entry.getValue();

				if (key instanceof Operation && value instanceof EOperation) {
					Operation operation = (Operation) key;
					EOperation eOperation = (EOperation) value;

					for (Behavior method : operation.getMethods()) {

						if (method instanceof OpaqueBehavior) {
							OpaqueBehavior body = (OpaqueBehavior) method;

							processOperationBody(eOperation, body
								.getLanguages(), body.getBodies(), options,
								diagnostics, context);
						}
					}

					Constraint bodyCondition = operation.getBodyCondition();

					if (bodyCondition != null) {
						ValueSpecification specification = bodyCondition
							.getSpecification();

						if (specification instanceof OpaqueExpression) {
							OpaqueExpression body = (OpaqueExpression) specification;

							processOperationBody(eOperation, body
								.getLanguages(), body.getBodies(), options,
								diagnostics, context);
						}
					}
				}
			}
		}

		protected void processInvariantBody(EOperation eOperation,
				EList<String> languages, EList<String> bodies,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			int languagesSize = languages.size();
			int bodiesSize = bodies.size();

			for (int i = 0; i < (languagesSize == bodiesSize
				? bodiesSize
				: (bodiesSize == 1
					? 1
					: 0)); i++) {

				String language = i < languagesSize
					? languages.get(i)
					: LANGUAGE__OCL;

				if (LANGUAGE__OCL.equals(language)) {
					addValidationDelegate(
						(EPackage) getContainingEObject(eOperation,
							EcorePackage.Literals.EPACKAGE, true),
						OCL_DELEGATE_URI);

					EcoreUtil.setAnnotation(eOperation, OCL_DELEGATE_URI,
						ANNOTATION_DETAIL__BODY, bodies.get(i));
				}
			}
		}

		protected void processConstraintBody(EClassifier eClassifier,
				String name, EList<String> languages, EList<String> bodies,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			int languagesSize = languages.size();
			int bodiesSize = bodies.size();

			for (int i = 0; i < (languagesSize == bodiesSize
				? bodiesSize
				: (bodiesSize == 1
					? 1
					: 0)); i++) {

				String language = i < languagesSize
					? languages.get(i)
					: LANGUAGE__OCL;

				if (LANGUAGE__OCL.equals(language)) {
					addValidationDelegate(
						(EPackage) getContainingEObject(eClassifier,
							EcorePackage.Literals.EPACKAGE, true),
						OCL_DELEGATE_URI);

					EcoreUtil.setAnnotation(eClassifier, OCL_DELEGATE_URI,
						name, bodies.get(i));
				}
			}
		}

		protected EModelElement processInvariantConstraint(
				EClassifier eClassifier, Constraint constraint,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			String name = constraint.getName();

			if (!isEmpty(name)) {

				if (OPTION__PROCESS.equals(options
					.get(OPTION__INVARIANT_CONSTRAINTS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								INVARIANT_CONSTRAINT,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ProcessInvariantConstraint_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eClassifier, name)),
								new Object[]{eClassifier}));
					}

					if ((eClassifier instanceof EClass)
						&& !OPTION__PROCESS.equals(options
							.get(OPTION__NON_API_INVARIANTS))) {

						EOperation eOperation = EcoreFactory.eINSTANCE
							.createEOperation();
						elementToEModelElementMap.put(constraint, eOperation);

						((EClass) eClassifier).getEOperations().add(eOperation);

						setName(eOperation, name, true);

						eOperation.setEType(EcorePackage.Literals.EBOOLEAN);

						EParameter eParameter = EcoreFactory.eINSTANCE
							.createEParameter();

						eOperation.getEParameters().add(eParameter);

						setName(eParameter, "diagnostics", false); //$NON-NLS-1$
						addDocumentation(
							eParameter,
							"The chain of diagnostics to which problems are to be appended.", getLineSeparator()); //$NON-NLS-1$

						eParameter
							.setEType(EcorePackage.Literals.EDIAGNOSTIC_CHAIN);

						eParameter = EcoreFactory.eINSTANCE.createEParameter();

						eOperation.getEParameters().add(eParameter);

						setName(eParameter, "context", false); //$NON-NLS-1$
						addDocumentation(
							eParameter,
							"The cache of context-specific information.", getLineSeparator()); //$NON-NLS-1$

						EGenericType eGenericType = EcoreFactory.eINSTANCE
							.createEGenericType();
						eGenericType.setEClassifier(EcorePackage.Literals.EMAP);
						EGenericType eGenericKeyType = EcoreFactory.eINSTANCE
							.createEGenericType();
						eGenericKeyType
							.setEClassifier(EcorePackage.Literals.EJAVA_OBJECT);
						eGenericType.getETypeArguments().add(eGenericKeyType);
						EGenericType eGenericValueType = EcoreFactory.eINSTANCE
							.createEGenericType();
						eGenericValueType
							.setEClassifier(EcorePackage.Literals.EJAVA_OBJECT);
						eGenericType.getETypeArguments().add(eGenericValueType);

						eParameter.setEGenericType(eGenericType);

						ValueSpecification specification = constraint
							.getSpecification();

						if (specification instanceof OpaqueExpression) {
							OpaqueExpression body = (OpaqueExpression) specification;

							if (OPTION__PROCESS.equals(options
								.get(OPTION__VALIDATION_DELEGATES))) {

								processInvariantBody(eOperation,
									body.getLanguages(), body.getBodies(),
									options, diagnostics, context);
							} else {
								processOperationBody(eOperation,
									body.getLanguages(), body.getBodies(),
									options, diagnostics, context);
							}
						}

						defaultCase(constraint);

						return eOperation;
					} else {

						if (addConstraint(eClassifier, name)
							&& OPTION__PROCESS.equals(options
								.get(OPTION__VALIDATION_DELEGATES))) {
							ValueSpecification specification = constraint
								.getSpecification();

							if (specification instanceof OpaqueExpression) {
								OpaqueExpression body = (OpaqueExpression) specification;

								processConstraintBody(eClassifier, name,
									body.getLanguages(), body.getBodies(),
									options, diagnostics, context);
							}
						}
					}
				} else if (OPTION__REPORT.equals(options
					.get(OPTION__INVARIANT_CONSTRAINTS)) && diagnostics != null) {

					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							INVARIANT_CONSTRAINT,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_UML2EcoreConverter_ReportInvariantConstraint_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										eClassifier, name)),
							new Object[]{eClassifier}));
				}
			}

			return eClassifier;
		}

		/**
		 * Reports or processes (as requested) default-value opaque expressions
		 * of properties to generate Ecore setting delegate annotations (or
		 * report that they should be generated).
		 * 
		 * @since 5.0
		 */
		protected void processPropertyDefaultExpressions(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {

				Element key = entry.getKey();
				EModelElement value = entry.getValue();

				if (key instanceof Property
					&& value instanceof EStructuralFeature) {
					Property property = (Property) key;
					EStructuralFeature eFeature = (EStructuralFeature) value;

					ValueSpecification specification = property
						.getDefaultValue();

					if (specification instanceof OpaqueExpression) {
						OpaqueExpression expr = (OpaqueExpression) specification;

						processPropertyDefaultExpression(eFeature,
							expr.getLanguages(), expr.getBodies(), options,
							diagnostics, context);
					}
				}
			}
		}

		/**
		 * Reports or processes (as requested) the default-value opaque
		 * expression of a property to generate Ecore setting delegate
		 * annotations (or report that they should be generated).
		 * 
		 * @since 5.0
		 */
		protected void processPropertyDefaultExpression(
				EStructuralFeature eFeature, EList<String> languages,
				EList<String> bodies, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			int languagesSize = languages.size();
			int bodiesSize = bodies.size();

			for (int i = 0; i < (languagesSize == bodiesSize
				? bodiesSize
				: (bodiesSize == 1
					? 1
					: 0)); i++) {

				String language = i < languagesSize
					? languages.get(i)
					: LANGUAGE__OCL;

				if (OPTION__PROCESS.equals(options
					.get(OPTION__PROPERTY_DEFAULT_EXPRESSIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								PROPERTY_DEFAULT_EXPRESSION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ProcessPropertyDefaultExpression_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eFeature, language)),
								new Object[]{eFeature}));

					}

					String source = UML2_GEN_MODEL_PACKAGE_1_1_NS_URI;
					String detailKey = ANNOTATION_DETAIL__DERIVATION;

					if (LANGUAGE__OCL.equals(language)) {
						addSettingDelegate(
							(EPackage) getContainingEObject(eFeature,
								EcorePackage.Literals.EPACKAGE, true),
							OCL_DELEGATE_URI);

						source = OCL_DELEGATE_URI;
					}

					if (eFeature.isChangeable() || !eFeature.isDerived()) {
						// it's an initial-value specification, not a derivation
						detailKey = ANNOTATION_DETAIL__INITIAL;
					}

					EcoreUtil.setAnnotation(eFeature, source, detailKey,
						bodies.get(i));
				} else if (OPTION__REPORT.equals(options
					.get(OPTION__PROPERTY_DEFAULT_EXPRESSIONS))
					&& diagnostics != null) {

					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							PROPERTY_DEFAULT_EXPRESSION,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_UML2EcoreConverter_ReportPropertyDefaultExpression_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, eFeature,
										language)), new Object[]{eFeature}));
				}
			}
		}

		protected void processAnnotationDetails(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (final Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {

				EModelElement eModelElement = entry.getValue();

				if (eModelElement != null) {
					Element element = entry.getKey();

					for (EAnnotation eAnnotation : element.getEAnnotations()) {

						if (!UML2_UML_PACKAGE_2_0_NS_URI.equals(eAnnotation
							.getSource())) {

							EMap<String, String> details = eAnnotation
								.getDetails();

							if (!details.isEmpty()) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__ANNOTATION_DETAILS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												ANNOTATION_DETAILS,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML2EcoreConverter_ProcessAnnotationDetails_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eModelElement,
															eAnnotation
																.getSource())),
												new Object[]{eModelElement}));
									}

									getEAnnotation(eModelElement,
										eAnnotation.getSource(), true)
										.getDetails().putAll(details.map());
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__ANNOTATION_DETAILS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.WARNING,
											UMLValidator.DIAGNOSTIC_SOURCE,
											ANNOTATION_DETAILS,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML2EcoreConverter_ReportAnnotationDetails_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eModelElement,
														eAnnotation.getSource())),
											new Object[]{eModelElement}));
								}
							}
						}
					}
				}
			}
		}

		/**
		 * Processes the capability trace information (if any) in the root
		 * packages' UML annotations to generate trace statements in the
		 * generator documentation comments of Ecore API elements.
		 * 
		 * @since 5.0
		 */
		protected void processCapabilityAnnotations(
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			for (org.eclipse.uml2.uml.Package converted : packages) {
				EAnnotation annotation = getEAnnotation(converted,
					UML2_UML_PACKAGE_2_0_NS_URI, false);

				if (annotation != null) {

					for (EAnnotation subAnnotation : annotation
						.getEAnnotations()) {

						if (isCapabilityAnnotation(subAnnotation)) {
							String capName = subAnnotation.getSource().replace(
								"/", NamedElement.SEPARATOR); //$NON-NLS-1$
							String capURI = subAnnotation.getDetails().get(
								ANNOTATION_DETAIL__URI);

							for (EObject next : subAnnotation.getReferences()) {
								// an API element is a classifier in the package
								// (neither nested nor a parametered element) or
								// a feature of a class
								if (((next instanceof Classifier) && (next
									.eContainer() instanceof org.eclipse.uml2.uml.Package))
									|| ((next instanceof Operation || next instanceof Property) && (next
										.eContainer() instanceof org.eclipse.uml2.uml.Class))) {

									EModelElement ecore = elementToEModelElementMap
										.get(next);

									if (ecore != null) {
										// add the trace comment
										String doc = UML2Util.isEmpty(capURI)
											? String.format(
												"<p>From package %s.</p>", //$NON-NLS-1$
												capName)
											: String
												.format(
													"<p>From package %s (URI {@literal %s}).</p>", //$NON-NLS-1$
													capName, capURI);
										addDocumentation(ecore, doc,
											getLineSeparator());
									}
								}
							}
						}
					}
				}

			}
		}

		/**
		 * @precondition The {@code annotation} is a sub-annotation of the UML
		 *               namespace annotation on a Package.
		 */
		private boolean isCapabilityAnnotation(EAnnotation annotation) {
			EModelElement annotated = ((EAnnotation) annotation
				.getEModelElement()).getEModelElement();

			return !annotation.getReferences().isEmpty()
				&& (EcoreUtil.isAncestor(annotated, annotation.getReferences()
					.get(0)));
		}

		/**
		 * Applies the conversion option to untyped properties in the source UML
		 * model.
		 * 
		 * @param options
		 *            the current conversion options
		 * @param diagnostics
		 *            collector of problem reports
		 * @param context
		 *            validation context for problem reporting
		 * 
		 * @since 5.0
		 */
		protected void processUntypedProperties(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (final Map.Entry<Element, EModelElement> entry : elementToEModelElementMap
				.entrySet()) {

				Element element = entry.getKey();

				if ((element instanceof Property)
					&& (((Property) element).getType() == null)) {
					final String option = options
						.get(OPTION__UNTYPED_PROPERTIES);
					EModelElement eModelElement = entry.getValue();

					if (OPTION__PROCESS.equals(option) && (diagnostics != null)) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UNTYPED_PROPERTY,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ProcessUntypedProperty_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eModelElement,
											((EStructuralFeature) eModelElement)
												.getEType())),
								new Object[]{eModelElement}));
					} else if (OPTION__REPORT.equals(option)
						&& (diagnostics != null)) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UNTYPED_PROPERTY,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML2EcoreConverter_ReportUntypedProperty_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eModelElement)),
								new Object[]{eModelElement}));
					} else if (OPTION__DISCARD.equals(option)) {
						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									UNTYPED_PROPERTY,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML2EcoreConverter_DiscardUntypedProperty_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eModelElement)),
									new Object[]{eModelElement}));
						}

						EcoreUtil.delete(eModelElement, true);
					}
				}
			}
		}

		protected void processOptions(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			if (!OPTION__IGNORE.equals(options.get(OPTION__DERIVED_FEATURES))) {
				processDerivedFeatures(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__UNION_PROPERTIES))) {
				processUnionProperties(options, diagnostics, context);
			}

			if (!OPTION__IGNORE
				.equals(options.get(OPTION__ECORE_TAGGED_VALUES))) {

				processEcoreTaggedValues(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__REDEFINING_OPERATIONS))) {

				processRedefiningOperations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__REDEFINING_PROPERTIES))) {

				processRedefiningProperties(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__SUBSETTING_PROPERTIES))) {

				processSubsettingProperties(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DUPLICATE_OPERATIONS))) {

				processDuplicateOperations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))) {

				processDuplicateOperationInheritance(options, diagnostics,
					context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__DUPLICATE_FEATURES))) {
				processDuplicateFeatures(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))) {

				processDuplicateFeatureInheritance(options, diagnostics,
					context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__SUPER_CLASS_ORDER))) {
				processSuperClassOrder(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__ANNOTATION_DETAILS))) {
				processAnnotationDetails(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__OPERATION_BODIES))) {
				processOperationBodies(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__PROPERTY_DEFAULT_EXPRESSIONS))) {

				processPropertyDefaultExpressions(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__UNTYPED_PROPERTIES))) {
				processUntypedProperties(options, diagnostics, context);
			}
		}

		public Collection<? extends EObject> convert(
				Collection<? extends EObject> eObjects,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			packages = EcoreUtil.getObjectsByType(eObjects,
				UMLPackage.Literals.PACKAGE);

			this.options = options;
			this.diagnostics = diagnostics;
			this.context = context;

			for (org.eclipse.uml2.uml.Package package_ : packages) {
				doSwitch(package_);
			}

			if (options != null) {
				processOptions(options, diagnostics, context);
			}

			processCapabilityAnnotations(options, diagnostics, context);

			return getRootContainers(EcoreUtil.<EObject> getObjectsByType(
				elementToEModelElementMap.values(),
				EcorePackage.Literals.EPACKAGE));
		}

	}

	/**
	 * A converter that converts UML profiles to representative Ecore packages.
	 */
	public static class Profile2EPackageConverter
			extends UML2EcoreConverter {

		/**
		 * The option for handling cases where foreign profile definitions are
		 * encountered. Supported choices are <code>OPTION__IGNORE</code> and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__FOREIGN_DEFINITIONS = "FOREIGN_DEFINITIONS"; //$NON-NLS-1$

		@Override
		public Object casePackage(org.eclipse.uml2.uml.Package package_) {

			if (packages.contains(package_.containingProfile())) {
				return super.casePackage(package_);
			} else {
				EPackage ePackage = (EPackage) doSwitch(packages.iterator()
					.next());
				elementToEModelElementMap.put(package_, ePackage);
				return ePackage;
			}
		}

		@Override
		public Object caseProfile(Profile profile) {
			EPackage ePackage = (EPackage) casePackage(profile);

			if (packages.contains(profile)) {
				String profileName = ePackage.getName();

				ePackage.setNsPrefix(profileName);
				ePackage.setNsURI(profile.getURI());

				if (isEmpty(ePackage.getNsURI())) {
					org.eclipse.uml2.uml.Package nestingPackage = profile
						.getNestingPackage();
					String profileParentQualifiedName = nestingPackage == null
						? EMPTY_STRING
						: getQualifiedName(nestingPackage, "."); //$NON-NLS-1$

					String version = String.valueOf(0);
					EPackage definition = profile.getDefinition();

					if (definition != null) {

						try {
							String nsURI = definition.getNsURI();
							int lastIndex = nsURI.lastIndexOf('/');

							if (lastIndex > 7) { // 2.0 format
								version = String.valueOf(Integer.parseInt(nsURI
									.substring(lastIndex + 1)) + 1);
							} else { // 1.x format
								String nsPrefix = definition.getNsPrefix();
								version = String.valueOf(Integer
									.parseInt(nsPrefix.substring(nsPrefix
										.lastIndexOf('_') + 1)) + 1);
							}
						} catch (Exception e) {
							// ignore
						}
					}

					StringBuffer nsURI = new StringBuffer("http://"); //$NON-NLS-1$
					nsURI.append(profileParentQualifiedName);
					nsURI.append("/schemas/"); //$NON-NLS-1$
					nsURI.append(profileName);
					nsURI.append('/');
					// ensure profiles with same name have different namespace
					// URIs
					nsURI.append(EcoreUtil.generateUUID());
					nsURI.append('/');
					nsURI.append(version);

					ePackage.setNsURI(nsURI.toString());
				}
			}

			return ePackage;
		}

		@Override
		protected EClassifier getEType(Type type) {
			EClassifier eType = getEClassifier(type);

			if (eType == null
				&& OPTION__PROCESS.equals(options
					.get(OPTION__FOREIGN_DEFINITIONS))) {
				Profile profile = (Profile) getOwningElement(type,
					UMLPackage.Literals.PROFILE, true);

				if (profile != null && profile != packages.iterator().next()) {
					eType = (EClassifier) profile.getDefinition(type);

					if (eType != null) {
						EList<EObject> references = getEAnnotation(
							(EPackage) doSwitch(packages.iterator().next()),
							UML2_UML_PACKAGE_4_1_NS_URI, true).getReferences();
						EPackage definition = profile.getDefinition();

						if (!references.contains(definition)) {
							references.add(definition);
						}
					}
				}
			}

			return eType == null
				? super.getEType(type)
				: eType;
		}

		@Override
		protected void processEcoreTaggedValues(EPackage ePackage,
				Element element, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			if (packages.contains(((org.eclipse.uml2.uml.Package) element)
				.containingProfile())) {

				super.processEcoreTaggedValues(ePackage, element, options,
					diagnostics, context);
			}
		}

		@Override
		protected void setName(final ENamedElement eNamedElement,
				NamedElement namedElement) {

			new UMLSwitch<Object>() {

				@Override
				public Object caseClassifier(Classifier classifier) {
					setName(eNamedElement, packages.contains(classifier
						.getNearestPackage().containingProfile())
						? classifier.getName()
						: getQualifiedName(classifier, "_"), true); //$NON-NLS-1$
					return classifier;
				}

				@Override
				public Object caseEnumerationLiteral(
						EnumerationLiteral enumerationLiteral) {
					setName(eNamedElement, enumerationLiteral.getName(), false);
					return enumerationLiteral;
				}

				@Override
				public Object caseNamedElement(NamedElement namedElement) {
					setName(eNamedElement, namedElement.getName(), true);
					return namedElement;
				}

			}.doSwitch(namedElement);
		}

		@Override
		public Object doSwitch(EObject eObject) {
			EObject eModelElement = (EObject) super.doSwitch(eObject);

			String source = eModelElement instanceof EClassifier
				? UML2_UML_PACKAGE_2_0_NS_URI
				: (eModelElement instanceof EPackage && !packages
					.contains(eObject))
					? UML2_UML_PACKAGE_4_0_NS_URI
					: null;

			if (source != null) {
				EList<EObject> references = getEAnnotation(
					(EModelElement) eModelElement, source, true)
					.getReferences();

				if (references.isEmpty()) {
					references.add(eObject);
				}
			}

			return eModelElement;
		}
	}

	/**
	 * A converter that converts Ecore model elements to representative UML
	 * elements.
	 */
	public static class Ecore2UMLConverter
			extends EcoreSwitch<Object>
			implements Converter {

		protected class ParameterSubstitutionMatcher
				extends EClassMatcher {

			protected ParameterSubstitutionMatcher(
					TemplateBinding templateBinding) {
				super(templateBinding);
			}

			@Override
			public boolean matches(EObject otherEObject) {
				EList<TemplateParameterSubstitution> parameterSubstitutions = ((TemplateBinding) eObject)
					.getParameterSubstitutions();
				EList<TemplateParameterSubstitution> otherParameterSubstitutions = ((TemplateBinding) otherEObject)
					.getParameterSubstitutions();

				if (parameterSubstitutions.size() == otherParameterSubstitutions
					.size()) {

					for (int i = 0; i < parameterSubstitutions.size(); i++) {
						TemplateParameterSubstitution parameterSubstitution = parameterSubstitutions
							.get(i);
						TemplateParameterSubstitution otherParameterSubstitution = otherParameterSubstitutions
							.get(i);

						if (!(safeEquals(parameterSubstitution.getFormal(),
							otherParameterSubstitution.getFormal()) && safeEquals(
							parameterSubstitution.getActual(),
							otherParameterSubstitution.getActual()))) {

							return false;
						}
					}

					return true;
				}

				return false;
			}
		}

		/**
		 * The option for handling cases where an Ecore tagged value is
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__ECORE_TAGGED_VALUES = "ECORE_TAGGED_VALUES"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a <code>redefines</code>
		 * annotation is encountered. Supported choices are
		 * <code>OPTION__IGNORE</code>, <code>OPTION__REPORT</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__REDEFINES_ANNOTATIONS = "REDEFINES_ANNOTATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a <code>subsets</code>
		 * annotation is encountered. Supported choices are
		 * <code>OPTION__IGNORE</code>, <code>OPTION__REPORT</code>, and
		 * <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__SUBSETS_ANNOTATIONS = "SUBSETS_ANNOTATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where a <code>union</code> annotation
		 * is encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__UNION_ANNOTATIONS = "UNION_ANNOTATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where annotation details are
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__ANNOTATION_DETAILS = "ANNOTATION_DETAILS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where body annotations are encountered.
		 * Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__BODY_ANNOTATIONS = "BODY_ANNOTATIONS"; //$NON-NLS-1$

		/**
		 * The option for handling cases where documentation annotations are
		 * encountered. Supported choices are <code>OPTION__IGNORE</code>,
		 * <code>OPTION__REPORT</code>, and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__DOCUMENTATION_ANNOTATIONS = "DOCUMENTATION_ANNOTATIONS"; //$NON-NLS-1$

		/**
		 * The option for assigning XMI identifiers based on URI fragment
		 * segments of the containment hierarchy. Supported choices are
		 * <code>OPTION__IGNORE</code> and <code>OPTION__PROCESS</code>.
		 */
		public static final String OPTION__XMI_IDENTIFIERS = "XMI_IDENTIFIERS"; //$NON-NLS-1$

		/**
		 * The option for handling opposite role name annotations. Supported
		 * choices are {@code OPTION__IGNORE} and {@code OPTION__PROCESS}.
		 * 
		 * @since 5.0
		 */
		public static final String OPTION__OPPOSITE_ROLE_NAMES = "OPPOSITE_ROLE_NAMES"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 3000;

		/**
		 * The diagnostic code for cases where an Ecore tagged value is
		 * encountered.
		 */
		public static final int ECORE_TAGGED_VALUE = DIAGNOSTIC_CODE_OFFSET + 1;

		/**
		 * The diagnostic code for cases where a <code>redefines</code>
		 * annotation is encountered.
		 */
		public static final int REDEFINES_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 2;

		/**
		 * The diagnostic code for cases where a <code>subsets</code>
		 * annotation is encountered.
		 */
		public static final int SUBSETS_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 3;

		/**
		 * The diagnostic code for cases where a <code>union</code> annotation
		 * is encountered.
		 */
		public static final int UNION_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 4;

		/**
		 * The diagnostic code for cases where annotation details are
		 * encountered.
		 */
		public static final int ANNOTATION_DETAILS = DIAGNOSTIC_CODE_OFFSET + 5;

		/**
		 * The diagnostic code for cases where body annotations are encountered.
		 */
		public static final int BODY_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 6;

		/**
		 * The diagnostic code for cases where documentation annotations are
		 * encountered.
		 */
		public static final int DOCUMENTATION_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 7;

		/**
		 * The diagnostic code for cases where an XMI identifier is assigned.
		 */
		public static final int XMI_IDENTIFIER = DIAGNOSTIC_CODE_OFFSET + 8;

		/**
		 * The diagnostic code for cases where an opposite role name annotation
		 * is encountered.
		 * 
		 * @since 5.0
		 */
		public static final int OPPOSITE_ROLE_NAME = DIAGNOSTIC_CODE_OFFSET + 9;

		protected final Map<EModelElement, Element> eModelElementToElementMap = new LinkedHashMap<EModelElement, Element>();

		protected Collection<EPackage> ePackages = null;

		protected Map<String, String> options = null;

		protected DiagnosticChain diagnostics = null;

		protected Map<Object, Object> context = null;

		private ResourceSet getResourceSet(Resource resource) {
			return resource == null
				? null
				: resource.getResourceSet();
		}

		private ResourceSet getResourceSet(EModelElement eModelElement) {
			ResourceSet resourceSet = getResourceSet(eModelElement.eResource());

			if (resourceSet == null) {

				for (EPackage ePackage : ePackages) {
					resourceSet = getResourceSet(ePackage.eResource());

					if (resourceSet != null) {
						break;
					}
				}
			}

			return resourceSet;
		}

		protected Model getEcorePrimitiveTypesLibrary(
				EModelElement eModelElement) {
			ResourceSet resourceSet = getResourceSet(eModelElement);

			if (resourceSet != null) {
				return load(resourceSet, URI
					.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
					UMLPackage.Literals.MODEL);
			}

			return null;
		}

		protected Model getUMLPrimitiveTypesLibrary(EModelElement eModelElement) {
			ResourceSet resourceSet = getResourceSet(eModelElement);

			if (resourceSet != null) {
				return load(resourceSet,
					URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI),
					UMLPackage.Literals.MODEL);
			}

			return null;
		}

		protected Model getXMLPrimitiveTypesLibrary(EModelElement eModelElement) {
			ResourceSet resourceSet = getResourceSet(eModelElement);

			if (resourceSet != null) {
				return load(resourceSet, URI
					.createURI(UMLResource.XML_PRIMITIVE_TYPES_LIBRARY_URI),
					UMLPackage.Literals.MODEL);
			}

			return null;
		}

		protected PrimitiveType getEcorePrimitiveType(
				EModelElement eModelElement, String name) {
			Model ecorePrimitiveTypesLibrary = getEcorePrimitiveTypesLibrary(eModelElement);

			return ecorePrimitiveTypesLibrary != null
				? (PrimitiveType) ecorePrimitiveTypesLibrary.getOwnedType(name)
				: null;
		}

		protected PrimitiveType getUMLPrimitiveType(
				EModelElement eModelElement, String name) {
			Model umlPrimitiveTypesLibrary = getUMLPrimitiveTypesLibrary(eModelElement);

			return umlPrimitiveTypesLibrary != null
				? (PrimitiveType) umlPrimitiveTypesLibrary.getOwnedType(name)
				: null;
		}

		protected PrimitiveType getXMLPrimitiveType(
				EModelElement eModelElement, String name) {
			Model xmlPrimitiveTypesLibrary = getXMLPrimitiveTypesLibrary(eModelElement);

			return xmlPrimitiveTypesLibrary != null
				? (PrimitiveType) xmlPrimitiveTypesLibrary.getOwnedType(name)
				: null;
		}

		protected boolean isTemplate(EClassifier eClassifier) {
			return eClassifier.getETypeParameters().size() > 0;
		}

		protected Type getType(EModelElement eModelElement, EClassifier eType) {
			Type type = null;

			if (eType != null) {
				String name = eType.getName();

				if (!isEmpty(name) && eType instanceof EDataType) {
					EPackage ePackage = eType.getEPackage();

					if (ePackage != null) {
						String nsURI = ePackage.getNsURI();

						if (XMLTypePackage.eNS_URI.equals(nsURI)) {
							type = getXMLPrimitiveType(eModelElement, name);
						} else if (TypesPackage.eNS_URI.equals(nsURI)) {
							type = getUMLPrimitiveType(eModelElement, name);
						} else if (EcorePackage.eNS_URI.equals(nsURI)) {
							type = getEcorePrimitiveType(eModelElement, name);
						}
					}
				}

				if (type == null) {
					Object eObject = doSwitch(eType);

					if (eObject instanceof Type) {
						type = (Type) eObject;
					}
				}
			}

			return type;
		}

		protected Type getType(EModelElement eModelElement,
				ETypeParameter eTypeParameter) {
			Type type = null;

			if (eTypeParameter != null) {
				EObject eContainer = eTypeParameter.eContainer();

				if (eContainer instanceof EDataType) {
					Type template = getType(eModelElement,
						(EDataType) eContainer);

					if (template instanceof Classifier) {
						TemplateSignature ownedTemplateSignature = ((Classifier) template)
							.getOwnedTemplateSignature();

						if (ownedTemplateSignature != null) {
							String name = eTypeParameter.getName();

							for (TemplateParameter parameter : ownedTemplateSignature
								.getParameters()) {

								ParameterableElement parameteredElement = parameter
									.getParameteredElement();

								if (parameteredElement instanceof Type) {
									Type parameteredType = (Type) parameteredElement;

									if (safeEquals(name, parameteredType
										.getName())) {

										type = parameteredType;
										break;
									}
								}
							}
						}
					}
				}

				if (type == null) {
					Object eObject = doSwitch(eTypeParameter);

					if (eObject instanceof Type) {
						type = (Type) eObject;
					}
				}
			}

			return type;
		}

		protected Type getType(EModelElement eModelElement,
				EGenericType eGenericType) {
			Type type = null;

			if (eGenericType != null) {
				EClassifier eClassifier = eGenericType.getEClassifier();

				if (eClassifier != null) {
					type = getType(eModelElement, eClassifier);

					if (isTemplate(eClassifier)) {
						TemplateBinding templateBinding = createTemplateBinding(
							eModelElement, eGenericType, eClassifier);
						EObjectMatcher matcher = new ParameterSubstitutionMatcher(
							templateBinding);

						TemplateSignature templateSignature = ((Classifier) type)
							.getOwnedTemplateSignature();
						EList<Type> ownedTypes = getOwnedTypes(eModelElement);

						for (DirectedRelationship relationship : templateSignature
							.getTargetDirectedRelationships(UMLPackage.Literals.TEMPLATE_BINDING)) {

							if (matcher.matches(relationship)
								&& ownedTypes.containsAll(relationship
									.getSources())) {

								templateBinding = (TemplateBinding) relationship;
								break;
							}
						}

						TemplateableElement boundElement = templateBinding
							.getBoundElement();

						if (boundElement == null) {
							boundElement = createGenericType(eModelElement,
								eGenericType, eClassifier);
							boundElement.getTemplateBindings().add(
								templateBinding);

							templateBinding.setSignature(templateSignature);
						}

						type = (Type) boundElement;
					}
				} else {
					ETypeParameter eTypeParameter = eGenericType
						.getETypeParameter();

					if (eTypeParameter != null) {
						type = getType(eModelElement, eTypeParameter);
					} else {
						type = createGenericType(eModelElement, eGenericType,
							null);
					}
				}
			}

			return type;
		}

		protected Type getType(ETypedElement eTypedElement) {
			return getType(eTypedElement, eTypedElement.getEGenericType());
		}

		protected EList<Type> getOwnedTypes(EModelElement eModelElement) {
			Namespace namespace = (Namespace) getOwningElement(
				(Element) doSwitch(eModelElement),
				UMLPackage.Literals.NAMESPACE, true);

			@SuppressWarnings("unchecked")
			EList<Type> ownedTypes = (EList<Type>) new UMLSwitch<Object>() {

				@Override
				public Object caseClass(org.eclipse.uml2.uml.Class class_) {
					return class_.getNestedClassifiers();
				}

				@Override
				public Object caseDataType(DataType dataType) {
					return doSwitch(dataType.getNamespace());
				}

				@Override
				public Object caseInterface(Interface interface_) {
					return interface_.getNestedClassifiers();
				}

				@Override
				public Object caseOperation(Operation operation) {
					return doSwitch(operation.getNamespace());
				}

				@Override
				public Object casePackage(org.eclipse.uml2.uml.Package package_) {
					return package_.getOwnedTypes();
				}

				@Override
				public Object doSwitch(EObject eObject) {
					return eObject == null
						? null
						: super.doSwitch(eObject);
				}

			}.doSwitch(namespace);

			return ownedTypes;
		}

		protected String getGenericTypeName(EGenericType eGenericType) {
			StringBuffer name = new StringBuffer();

			EClassifier eClassifier = eGenericType.getEClassifier();

			if (eClassifier != null) {
				name.append(eClassifier.getName());
			} else {
				ETypeParameter eTypeParameter = eGenericType
					.getETypeParameter();

				if (eTypeParameter != null) {
					name.append(eTypeParameter.getName());
				} else {
					name.append("Wildcard"); //$NON-NLS-1$

					if (options != null
						&& !OPTION__IGNORE.equals(options
							.get(OPTION__ECORE_TAGGED_VALUES))) {

						EGenericType eLowerBound = eGenericType
							.getELowerBound();

						if (eLowerBound != null) {
							name.append("_super_"); //$NON-NLS-1$
							name.append(getGenericTypeName(eLowerBound));
						} else {
							EGenericType eUpperBound = eGenericType
								.getEUpperBound();

							if (eUpperBound != null) {
								name.append("_extends_"); //$NON-NLS-1$
								name.append(getGenericTypeName(eUpperBound));
							}
						}
					}
				}
			}

			for (EGenericType eTypeArgument : eGenericType.getETypeArguments()) {
				name.append('_');
				name.append(getGenericTypeName(eTypeArgument));
			}

			return name.toString();
		}

		protected Classifier createGenericType(EModelElement eModelElement,
				EGenericType eGenericType, EClassifier eClassifier) {
			Classifier genericType = eClassifier instanceof EDataType
				? UMLFactory.eINSTANCE.createPrimitiveType()
				: UMLFactory.eINSTANCE.createClass();

			for (EGenericType eTypeArgument : eGenericType.getETypeArguments()) {
				ETypeParameter eTypeParameter = eTypeArgument
					.getETypeParameter();

				if (eTypeParameter != null) {
					eModelElement = eTypeParameter;
					break;
				}
			}

			getOwnedTypes(eModelElement).add(genericType);

			genericType.setName(getGenericTypeName(eGenericType));

			if (options != null
				&& !OPTION__IGNORE.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))) {

				processEcoreTaggedValues(genericType, eGenericType, options,
					diagnostics, context);
			}

			return genericType;
		}

		protected TemplateBinding createTemplateBinding(
				EModelElement eModelElement, EGenericType eGenericType,
				EClassifier eClassifier) {
			TemplateBinding templateBinding = UMLFactory.eINSTANCE
				.createTemplateBinding();

			EList<ETypeParameter> eTypeParameters = eClassifier
				.getETypeParameters();
			int eTypeParametersSize = eTypeParameters.size();

			EList<EGenericType> eTypeArguments = eGenericType
				.getETypeArguments();
			int eTypeArgumentsSize = eTypeArguments.size();

			if (eTypeArgumentsSize <= eTypeParametersSize) {

				for (int i = 0; i < eTypeArgumentsSize; i++) {
					Type parameterType = getType(eModelElement, eTypeParameters
						.get(i));

					if (parameterType != null) {
						TemplateParameter templateParameter = parameterType
							.getTemplateParameter();

						if (templateParameter != null) {
							Type argumentType = getType(eModelElement,
								eTypeArguments.get(i));

							if (argumentType != null) {
								TemplateParameterSubstitution parameterSubstitution = templateBinding
									.createParameterSubstitution();
								parameterSubstitution
									.setFormal(templateParameter);
								parameterSubstitution.setActual(argumentType);
							}
						}
					}
				}
			}

			return templateBinding;
		}

		@Override
		public Object caseEAttribute(EAttribute eAttribute) {
			EClass eContainingClass = eAttribute.getEContainingClass();

			if (eContainingClass != null) {
				Property property = UMLFactory.eINSTANCE.createProperty();
				eModelElementToElementMap.put(eAttribute, property);

				Classifier classifier = (Classifier) doSwitch(eContainingClass);
				getOwnedAttributes(classifier).add(property);

				property.setName(eAttribute.getName());
				property.setIsReadOnly(!eAttribute.isChangeable());
				property.setIsDerived(eAttribute.isDerived());
				property.setVisibility(VisibilityKind.PUBLIC_LITERAL);
				property.setIsID(eAttribute.isID());

				caseETypedElement(eAttribute);

				String defaultValueLiteral = eAttribute
					.getDefaultValueLiteral();

				if (defaultValueLiteral != null) {
					Type type = property.getType();
					EClass eClass = null;

					if (type instanceof Enumeration) {
						eClass = UMLPackage.Literals.INSTANCE_VALUE;
					} else if (isBoolean(type)) {
						eClass = UMLPackage.Literals.LITERAL_BOOLEAN;
					} else if (isInteger(type)) {
						eClass = UMLPackage.Literals.LITERAL_INTEGER;
					} else if (isReal(type)) {
						eClass = UMLPackage.Literals.LITERAL_REAL;
					} else if (isString(type)) {
						eClass = UMLPackage.Literals.LITERAL_STRING;
					} else if (isUnlimitedNatural(type)) {
						eClass = UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL;
					}

					if (eClass != null) {
						property.createDefaultValue(null, type, eClass);
					}

					property.setDefault(defaultValueLiteral);
				}

				defaultCase(eAttribute);

				return property;
			}

			return super.caseEAttribute(eAttribute);
		}

		@Override
		public Object caseEClass(EClass eClass) {
			EPackage ePackage = eClass.getEPackage();

			if (ePackage != null) {
				Classifier classifier = eClass.isInterface()
					? (Classifier) UMLFactory.eINSTANCE.createInterface()
					: (ExtendedMetaData.INSTANCE.getSimpleFeature(eClass) == null
						? (Classifier) UMLFactory.eINSTANCE.createClass()
						: (Classifier) UMLFactory.eINSTANCE.createDataType());
				eModelElementToElementMap.put(eClass, classifier);

				org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) doSwitch(ePackage);
				package_.getOwnedTypes().add(classifier);

				classifier.setName(eClass.getName());

				if (!eClass.isInterface()) {
					classifier.setIsAbstract(eClass.isAbstract());
				}

				for (EGenericType eGenericSuperType : eClass
					.getEGenericSuperTypes()) {

					Type generalType = getType(eClass, eGenericSuperType);

					if (generalType instanceof Interface
						&& classifier instanceof BehavioredClassifier) {

						((BehavioredClassifier) classifier)
							.createInterfaceRealization(null,
								(Interface) generalType);
					} else if (!classifier.allParents().contains(generalType)) {
						classifier
							.createGeneralization((Classifier) generalType);
					}
				}

				defaultCase(eClass);

				return classifier;
			}

			return super.caseEClass(eClass);
		}

		@Override
		public Object caseEDataType(EDataType eDataType) {
			EPackage ePackage = eDataType.getEPackage();

			if (ePackage != null) {
				PrimitiveType primitiveType = UMLFactory.eINSTANCE
					.createPrimitiveType();
				eModelElementToElementMap.put(eDataType, primitiveType);

				org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) doSwitch(ePackage);
				package_.getOwnedTypes().add(primitiveType);

				primitiveType.setName(eDataType.getName());

				EDataType baseType = ExtendedMetaData.INSTANCE
					.getBaseType(eDataType);

				if (baseType != null) {
					Classifier generalClassifier = (Classifier) getType(
						eDataType, baseType);

					if (!primitiveType.allParents().contains(generalClassifier)) {
						primitiveType.createGeneralization(generalClassifier);
					}
				}

				defaultCase(eDataType);

				return primitiveType;
			}

			return super.caseEDataType(eDataType);
		}

		@Override
		public Object caseEEnum(EEnum eEnum) {
			EPackage ePackage = eEnum.getEPackage();

			if (ePackage != null) {
				Enumeration enumeration = UMLFactory.eINSTANCE
					.createEnumeration();
				eModelElementToElementMap.put(eEnum, enumeration);

				org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) doSwitch(ePackage);
				package_.getOwnedTypes().add(enumeration);

				enumeration.setName(eEnum.getName());

				defaultCase(eEnum);

				return enumeration;
			}

			return super.caseEEnum(eEnum);
		}

		@Override
		public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
			EEnum eEnum = eEnumLiteral.getEEnum();

			if (eEnum != null) {
				EnumerationLiteral enumerationLiteral = UMLFactory.eINSTANCE
					.createEnumerationLiteral();
				eModelElementToElementMap.put(eEnumLiteral, enumerationLiteral);

				Enumeration enumeration = (Enumeration) doSwitch(eEnum);
				enumeration.getOwnedLiterals().add(enumerationLiteral);

				enumerationLiteral.setName(eEnumLiteral.getName());

				int value = eEnumLiteral.getValue();

				if (value != eEnum.getELiterals().indexOf(eEnumLiteral)) {
					((LiteralInteger) enumerationLiteral.createSpecification(
						null, null, UMLPackage.Literals.LITERAL_INTEGER))
						.setValue(value);
				}

				defaultCase(eEnumLiteral);

				return enumerationLiteral;
			}

			return super.caseEEnumLiteral(eEnumLiteral);
		}

		@Override
		public Object caseEModelElement(EModelElement eModelElement) {
			return eModelElement;
		}

		@Override
		public Object caseEOperation(EOperation eOperation) {
			EClass eContainingClass = eOperation.getEContainingClass();

			if (eContainingClass != null) {
				Operation operation = UMLFactory.eINSTANCE.createOperation();
				eModelElementToElementMap.put(eOperation, operation);

				Classifier classifier = (Classifier) doSwitch(eContainingClass);
				getOwnedOperations(classifier).add(operation);

				operation.setName(eOperation.getName());

				EGenericType eGenericType = eOperation.getEGenericType();

				if (eGenericType != null) {
					operation.createReturnResult(null, getType(eOperation,
						eGenericType));
				}

				EList<Type> raisedExceptions = operation.getRaisedExceptions();

				for (EGenericType eGenericException : eOperation
					.getEGenericExceptions()) {

					Type type = getType(eOperation, eGenericException);

					if (type != null) {
						raisedExceptions.add(type);
					}
				}

				operation.setVisibility(VisibilityKind.PUBLIC_LITERAL);

				int upperBound = eOperation.getUpperBound();

				if (upperBound != ETypedElement.UNSPECIFIED_MULTIPLICITY
					&& upperBound != operation.getUpper()) {

					operation.setUpper(upperBound);
				}

				int lowerBound = eOperation.getLowerBound();

				if (lowerBound != operation.getLower()) {
					operation.setLower(lowerBound);
				}

				operation.setIsOrdered(eOperation.isOrdered());
				operation.setIsUnique(eOperation.isUnique());

				defaultCase(eOperation);

				return operation;
			}

			return super.caseEOperation(eOperation);
		}

		@Override
		public Object caseEPackage(EPackage ePackage) {
			org.eclipse.uml2.uml.Package package_ = ePackage.getESuperPackage() == null
				? UMLFactory.eINSTANCE.createModel()
				: UMLFactory.eINSTANCE.createPackage();
			eModelElementToElementMap.put(ePackage, package_);

			if (!ePackages.contains(ePackage)) {
				EPackage eSuperPackage = ePackage.getESuperPackage();

				if (eSuperPackage != null) {
					((org.eclipse.uml2.uml.Package) doSwitch(eSuperPackage))
						.getNestedPackages().add(package_);
				}
			}

			package_.setName(ePackage.getName());
			package_.setURI(ePackage.getNsURI());

			defaultCase(ePackage);

			return package_;
		}

		@Override
		public Object caseEParameter(EParameter eParameter) {
			EOperation eOperation = eParameter.getEOperation();

			if (eOperation != null) {
				Parameter parameter = UMLFactory.eINSTANCE.createParameter();
				eModelElementToElementMap.put(eParameter, parameter);

				Operation operation = (Operation) doSwitch(eOperation);
				operation.getOwnedParameters().add(parameter);

				parameter.setName(eParameter.getName());

				caseETypedElement(eParameter);

				defaultCase(eParameter);

				return parameter;
			}

			return super.caseEParameter(eParameter);
		}

		@Override
		public Object caseEReference(EReference eReference) {
			EClass eContainingClass = eReference.getEContainingClass();

			if (eContainingClass != null) {
				Property property = UMLFactory.eINSTANCE.createProperty();
				eModelElementToElementMap.put(eReference, property);

				Classifier classifier = (Classifier) doSwitch(eContainingClass);
				getOwnedAttributes(classifier).add(property);

				property.setName(eReference.getName());
				property.setAggregation(eReference.isContainment()
					? AggregationKind.COMPOSITE_LITERAL
					: AggregationKind.NONE_LITERAL);
				property.setIsDerived(eReference.isDerived());
				property.setIsReadOnly(!eReference.isChangeable());

				caseETypedElement(eReference);

				EReference eOpposite = eReference.getEOpposite();

				if (eOpposite == null) {
					Association association = (Association) ((org.eclipse.uml2.uml.Package) doSwitch(eContainingClass
						.getEPackage())).createOwnedType(null,
						UMLPackage.Literals.ASSOCIATION);

					property.setAssociation(association);

					Property opposite = association.createOwnedEnd(null,
						classifier);

					if (OPTION__PROCESS.equals(options
						.get(OPTION__OPPOSITE_ROLE_NAMES))) {

						String oppositeRoleName = EcoreUtil
							.getAnnotation(
								eReference,
								EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE,
								EMOFExtendedMetaData.EMOF_COMMENT_BODY);

						if (oppositeRoleName != null) {
							opposite.setName(oppositeRoleName);

							opposite.setLower(0);

							if (!property.isComposite()) {
								opposite
									.setUpper(LiteralUnlimitedNatural.UNLIMITED);
							}

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										OPPOSITE_ROLE_NAME,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_Ecore2UMLConverter_ProcessOppositeRoleName_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, property,
													oppositeRoleName)),
										new Object[]{property, opposite}));
							}
						}
					}
				} else {
					Property opposite = (Property) doSwitch(eOpposite);

					if (opposite != null) {
						Association association = opposite.getAssociation();

						if (association == null) {

							if (eReference.isContainer()) {
								opposite
									.setAssociation(association = (Association) ((org.eclipse.uml2.uml.Package) doSwitch(eOpposite
										.getEContainingClass().getEPackage()))
										.createOwnedType(null,
											UMLPackage.Literals.ASSOCIATION));

								property.setAssociation(association);
							} else {
								property
									.setAssociation(association = (Association) ((org.eclipse.uml2.uml.Package) doSwitch(eContainingClass
										.getEPackage())).createOwnedType(null,
										UMLPackage.Literals.ASSOCIATION));

								opposite.setAssociation(association);
							}
						} else {
							property.setAssociation(association);
						}
					}
				}

				defaultCase(eReference);

				return property;
			}

			return super.caseEReference(eReference);
		}

		@Override
		public Object caseETypedElement(ETypedElement eTypedElement) {
			Object element = eModelElementToElementMap.get(eTypedElement);

			if (element != null) {

				if (element instanceof TypedElement) {
					((TypedElement) element).setType(getType(eTypedElement));
				}

				if (element instanceof MultiplicityElement) {
					MultiplicityElement multiplicityElement = (MultiplicityElement) element;

					int upperBound = eTypedElement.getUpperBound();

					if (upperBound != ETypedElement.UNSPECIFIED_MULTIPLICITY
						&& upperBound != multiplicityElement.getUpper()) {

						multiplicityElement.setUpper(upperBound);
					}

					int lowerBound = eTypedElement.getLowerBound();

					if (lowerBound != multiplicityElement.getLower()) {
						multiplicityElement.setLower(lowerBound);
					}

					multiplicityElement.setIsOrdered(eTypedElement.isOrdered());
					multiplicityElement.setIsUnique(eTypedElement.isUnique());
				}

				return element;
			}

			return super.caseETypedElement(eTypedElement);
		}

		@Override
		public Object caseETypeParameter(ETypeParameter eTypeParameter) {
			EList<ETypeParameter> eTypeParameters = getETypeParameters(eTypeParameter
				.eContainer());

			if (eTypeParameters != null) {
				ClassifierTemplateParameter templateParameter = UMLFactory.eINSTANCE
					.createClassifierTemplateParameter();
				org.eclipse.uml2.uml.Class parameterableElement = (org.eclipse.uml2.uml.Class) templateParameter
					.createOwnedParameteredElement(UMLPackage.Literals.CLASS);
				eModelElementToElementMap.put(eTypeParameter,
					parameterableElement);

				TemplateableElement template = (TemplateableElement) doSwitch(eTypeParameter
					.eContainer());
				TemplateSignature ownedTemplateSignature = template
					.getOwnedTemplateSignature();

				if (ownedTemplateSignature == null) {
					ownedTemplateSignature = template
						.createOwnedTemplateSignature();
				}

				EList<TemplateParameter> ownedParameters = ownedTemplateSignature
					.getOwnedParameters();
				int index = eTypeParameters.indexOf(eTypeParameter);

				if (index < ownedParameters.size()) {
					ownedParameters.add(index, templateParameter);
				} else {
					ownedParameters.add(templateParameter);
				}

				parameterableElement.setName(eTypeParameter.getName());

				if (options != null
					&& !OPTION__IGNORE.equals(options
						.get(OPTION__ECORE_TAGGED_VALUES))) {

					processEcoreTaggedValues(templateParameter, eTypeParameter,
						options, diagnostics, context);
				}

				return parameterableElement;
			}

			return super.caseETypeParameter(eTypeParameter);
		}

		@Override
		public Object defaultCase(EObject eObject) {

			for (EObject eContent : eObject.eContents()) {
				doSwitch(eContent);
			}

			return super.defaultCase(eObject);
		}

		@Override
		public Object doSwitch(EObject eObject) {

			if (!eModelElementToElementMap.containsKey(eObject)) {
				super.doSwitch(eObject);
			}

			return eModelElementToElementMap.get(eObject);
		}

		protected Profile getEcoreProfile(EModelElement eModelElement) {
			return getEcoreProfile((EObject) eModelElement);
		}

		protected Profile getEcoreProfile(EObject eObject) {
			Resource eResource = eObject.eResource();

			if (eResource != null) {
				ResourceSet resourceSet = eResource.getResourceSet();

				if (resourceSet != null) {
					return load(resourceSet, URI
						.createURI(UMLResource.ECORE_PROFILE_URI),
						UMLPackage.Literals.PROFILE);
				}
			}

			return null;
		}

		protected Stereotype getEcoreStereotype(EModelElement eModelElement,
				String name) {
			return getEcoreStereotype((EObject) eModelElement, name);
		}

		protected Stereotype getEcoreStereotype(EObject eObject, String name) {
			Profile ecoreProfile = getEcoreProfile(eObject);

			return ecoreProfile != null
				? ecoreProfile.getOwnedStereotype(name)
				: null;
		}

		private static String escapeString(String s,
				String additionalCharactersToEscape) {

			if (s == null) {
				return null;
			}

			int length = s.length();
			StringBuffer result = new StringBuffer(length + 16);

			for (int i = 0; i < length; i++) {
				char c = s.charAt(i);

				if (c == '\b') {
					result.append("\\b"); //$NON-NLS-1$
				} else if (c == '\t') {
					result.append("\\t"); //$NON-NLS-1$
				} else if (c == '\n') {
					result.append("\\n"); //$NON-NLS-1$
				} else if (c == '\f') {
					result.append("\\f"); //$NON-NLS-1$
				} else if (c == '\r') {
					result.append("\\r"); //$NON-NLS-1$
				} else if (c == '\"') {
					result.append("\\\""); //$NON-NLS-1$
				} else if (c == '\'') {
					result.append("\\\'"); //$NON-NLS-1$
				} else if (c == '\\') {
					result.append("\\\\"); //$NON-NLS-1$
				} else if (additionalCharactersToEscape.indexOf(c) == -1
					&& c >= 32 && c < 127) {

					result.append(c);
				} else if (c < 256) {
					String num = Integer.toOctalString(c);

					switch (num.length()) {
						case 1 :
							result.append("\\00"); //$NON-NLS-1$
							break;
						case 2 :
							result.append("\\0"); //$NON-NLS-1$
							break;
						default :
							result.append("\\"); //$NON-NLS-1$
							break;
					}

					result.append(num);
				} else {
					String num = Integer.toHexString(c);

					switch (num.length()) {
						case 1 :
							result.append("\\u000"); //$NON-NLS-1$
							break;
						case 2 :
							result.append("\\u00"); //$NON-NLS-1$
							break;
						case 3 :
							result.append("\\u0"); //$NON-NLS-1$
							break;
						default :
							result.append("\\u"); //$NON-NLS-1$
							break;
					}

					result.append(num);
				}
			}

			for (int index = result.indexOf("*/"); index != -1; index = result //$NON-NLS-1$
				.indexOf("*/", index)) { //$NON-NLS-1$

				result.replace(index, index + 1, "\\052"); //$NON-NLS-1$
			}

			return result.toString();
		}

		protected void processEcoreTaggedValue(Element element,
				Stereotype stereotype, String propertyName, Object value,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {

			if (value == null) {
				return;
			}

			if (OPTION__PROCESS
				.equals(options.get(OPTION__ECORE_TAGGED_VALUES))) {

				if (diagnostics != null) {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.INFO,
							UMLValidator.DIAGNOSTIC_SOURCE,
							ECORE_TAGGED_VALUE,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_Ecore2UMLConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(
										context,
										element,
										getTagDefinition(stereotype,
											propertyName), value)),
							new Object[]{element}));
				}

				setTaggedValue(element, stereotype, propertyName, value);
			} else if (OPTION__REPORT.equals(options
				.get(OPTION__ECORE_TAGGED_VALUES)) && diagnostics != null) {

				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						ECORE_TAGGED_VALUE,
						UMLPlugin.INSTANCE
							.getString(
								"_UI_Ecore2UMLConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, element,
									getTagDefinition(stereotype, propertyName),
									value)), new Object[]{element}));
			}
		}

		protected void processEcoreTaggedValue(Element element,
				Stereotype stereotype, String propertyName,
				EModelElement eModelElement,
				EStructuralFeature eStructuralFeature,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			Object value = null;

			if (eStructuralFeature != null) {
				value = eModelElement.eGet(eStructuralFeature);

				if (safeEquals(value, eStructuralFeature.getDefaultValue())) {
					return;
				}
			} else {

				if (propertyName == TAG_DEFINITION__XML_CONTENT_KIND) {
					Enumeration contentKindEnumeration = (Enumeration) getEcoreProfile(
						eModelElement).getOwnedType(ENUMERATION__CONTENT_KIND);

					if (contentKindEnumeration != null) {

						switch (ExtendedMetaData.INSTANCE
							.getContentKind((EClass) eModelElement)) {

							case ExtendedMetaData.EMPTY_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__EMPTY);
								break;
							case ExtendedMetaData.SIMPLE_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE);
								break;
							case ExtendedMetaData.MIXED_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__MIXED);
								break;
							case ExtendedMetaData.ELEMENT_ONLY_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_ONLY);
								break;
						}
					}
				} else if (propertyName == TAG_DEFINITION__XML_FEATURE_KIND) {
					Enumeration featureKindEnumeration = (Enumeration) getEcoreProfile(
						eModelElement).getOwnedType(ENUMERATION__FEATURE_KIND);

					if (featureKindEnumeration != null) {

						switch (ExtendedMetaData.INSTANCE
							.getFeatureKind((EStructuralFeature) eModelElement)) {

							case ExtendedMetaData.SIMPLE_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE);
								break;
							case ExtendedMetaData.ATTRIBUTE_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE);
								break;
							case ExtendedMetaData.ATTRIBUTE_WILDCARD_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE_WILDCARD);
								break;
							case ExtendedMetaData.ELEMENT_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT);
								break;
							case ExtendedMetaData.ELEMENT_WILDCARD_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_WILDCARD);
								break;
							case ExtendedMetaData.GROUP_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__GROUP);
								break;
						}
					}
				} else if (propertyName == TAG_DEFINITION__XML_NAME) {

					if (eModelElement instanceof EClassifier) {
						value = ExtendedMetaData.INSTANCE
							.getName((EClassifier) eModelElement);
					} else if (eModelElement instanceof EStructuralFeature) {
						value = ExtendedMetaData.INSTANCE
							.getName((EStructuralFeature) eModelElement);
					}

					if (safeEquals(value,
						((ENamedElement) eModelElement).getName())) {

						return;
					}
				} else if (propertyName == TAG_DEFINITION__XML_NAMESPACE) {
					value = ExtendedMetaData.INSTANCE
						.getNamespace((EStructuralFeature) eModelElement);
				} else if (propertyName == TAG_DEFINITION__VISIBILITY) {
					Enumeration visibilityKindEnumeration = (Enumeration) getEcoreProfile(
						eModelElement).getOwnedType(
						ENUMERATION__VISIBILITY_KIND);

					if (visibilityKindEnumeration != null) {

						if (eModelElement instanceof EOperation) {

							if (EcoreUtil
								.isSuppressedVisibility((EOperation) eModelElement)) {

								value = visibilityKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__NONE);
							}
						} else {
							eStructuralFeature = (EStructuralFeature) eModelElement;

							if (EcoreUtil.isSuppressedVisibility(
								eStructuralFeature, EcoreUtil.GET)) {

								value = visibilityKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__NONE);
							} else {

								if (EcoreUtil.isSuppressedVisibility(
									eStructuralFeature, EcoreUtil.SET)) {

									if (EcoreUtil.isSuppressedVisibility(
										eStructuralFeature, EcoreUtil.IS_SET)) {

										value = visibilityKindEnumeration
											.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY);
									} else {
										value = visibilityKindEnumeration
											.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY_UNSETTABLE);
									}
								} else {

									if (EcoreUtil.isSuppressedVisibility(
										eStructuralFeature, EcoreUtil.UNSET)) {

										value = visibilityKindEnumeration
											.getOwnedLiteral(ENUMERATION_LITERAL__READ_WRITE);
									}
								}
							}
						}
					}
				} else if (propertyName == TAG_DEFINITION__ANNOTATIONS
					&& !OPTION__PROCESS.equals(options
						.get(OPTION__ANNOTATION_DETAILS))) {

					EList<String> annotations = new UniqueEList<String>();

					for (EAnnotation eAnnotation : eModelElement
						.getEAnnotations()) {

						String source = eAnnotation.getSource();

						if (source != null
							&& !source.equals(EcorePackage.eNS_URI)
							&& !source.equals(ExtendedMetaData.ANNOTATION_URI)
							&& !source
								.equals(EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE)
							&& !source.equals(EMF_GEN_MODEL_PACKAGE_NS_URI)
							&& !source.equals(UML2_UML_PACKAGE_2_0_NS_URI)
							&& !source.equals(ANNOTATION__DUPLICATES)
							&& !source.equals(ANNOTATION__REDEFINES)
							&& !source.equals(ANNOTATION__SUBSETS)
							&& !source.equals(ANNOTATION__UNION)) {

							StringBuffer stringBuffer = new StringBuffer(
								escapeString(source, " =")); //$NON-NLS-1$

							for (Map.Entry<String, String> entry : eAnnotation
								.getDetails()) {

								stringBuffer.append(' ');
								stringBuffer.append(escapeString(
									entry.getKey(), " =")); //$NON-NLS-1$
								stringBuffer.append("=\'"); //$NON-NLS-1$
								stringBuffer.append(escapeString(
									entry.getValue(), "")); //$NON-NLS-1$
								stringBuffer.append('\'');
							}

							annotations.add(stringBuffer.toString());
						}
					}

					if (annotations.size() > 0) {
						value = annotations;
					}
				} else if (propertyName == TAG_DEFINITION__KEYS) {
					EList<Property> keys = new UniqueEList.FastCompare<Property>();

					for (EAttribute eKey : ((EReference) eModelElement)
						.getEKeys()) {

						keys.add((Property) doSwitch(eKey));
					}

					if (keys.size() > 0) {
						value = keys;
					}
				}
			}

			processEcoreTaggedValue(element, stereotype, propertyName, value,
				options, diagnostics, context);
		}

		protected void processEcoreTaggedValues(Element element,
				EPackage ePackage, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype ePackageStereotype = getEcoreStereotype(ePackage,
				STEREOTYPE__E_PACKAGE);

			if (ePackageStereotype != null) {
				safeApplyStereotype(element, ePackageStereotype);

				processEcoreTaggedValue(element, ePackageStereotype,
					TAG_DEFINITION__NS_PREFIX, ePackage,
					EcorePackage.Literals.EPACKAGE__NS_PREFIX, options,
					diagnostics, context);

				processEcoreTaggedValue(element, ePackageStereotype,
					TAG_DEFINITION__ANNOTATIONS, ePackage, null, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(Element element,
				final EClassifier eClassifier,
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {
			Stereotype eClassifierStereotype = new UMLSwitch<Stereotype>() {

				@Override
				public Stereotype caseClass(org.eclipse.uml2.uml.Class class_) {
					Stereotype eClassStereotype = getEcoreStereotype(
						eClassifier, STEREOTYPE__E_CLASS);

					if (eClassStereotype != null) {
						safeApplyStereotype(class_, eClassStereotype);

						processEcoreTaggedValue(class_, eClassStereotype,
							TAG_DEFINITION__XML_CONTENT_KIND, eClassifier,
							null, options, diagnostics, context);
					}

					return eClassStereotype;
				}

				@Override
				public Stereotype caseDataType(DataType dataType) {
					Stereotype eClassStereotype = getEcoreStereotype(
						eClassifier, STEREOTYPE__E_CLASS);

					if (eClassStereotype != null) {
						safeApplyStereotype(dataType, eClassStereotype);

						processEcoreTaggedValue(dataType, eClassStereotype,
							TAG_DEFINITION__XML_CONTENT_KIND, eClassifier,
							null, options, diagnostics, context);
					}

					return eClassStereotype;
				}

				@Override
				public Stereotype caseInterface(Interface interface_) {
					Stereotype eClassStereotype = getEcoreStereotype(
						eClassifier, STEREOTYPE__E_CLASS);

					if (eClassStereotype != null) {
						safeApplyStereotype(interface_, eClassStereotype);

						processEcoreTaggedValue(interface_, eClassStereotype,
							TAG_DEFINITION__XML_CONTENT_KIND, eClassifier,
							null, options, diagnostics, context);
					}

					return eClassStereotype;
				}

				@Override
				public Stereotype casePrimitiveType(PrimitiveType primitiveType) {
					Stereotype eDataTypeStereotype = getEcoreStereotype(
						eClassifier, STEREOTYPE__E_DATA_TYPE);

					if (eDataTypeStereotype != null) {
						safeApplyStereotype(primitiveType, eDataTypeStereotype);
					}

					return eDataTypeStereotype;
				}
			}.doSwitch(element);

			if (eClassifierStereotype != null) {
				processEcoreTaggedValue(element, eClassifierStereotype,
					TAG_DEFINITION__XML_NAME, eClassifier, null, options,
					diagnostics, context);

				processEcoreTaggedValue(element, eClassifierStereotype,
					TAG_DEFINITION__INSTANCE_CLASS_NAME, eClassifier,
					EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eClassifierStereotype,
					TAG_DEFINITION__ANNOTATIONS, eClassifier, null, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(final Element element,
				EStructuralFeature eStructuralFeature,
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {
			Stereotype eStructuralFeatureStereotype = new EcoreSwitch<Stereotype>() {

				@Override
				public Stereotype caseEReference(EReference eReference) {
					Stereotype eReferenceStereotype = getEcoreStereotype(
						eReference, STEREOTYPE__E_REFERENCE);

					if (eReferenceStereotype != null) {
						safeApplyStereotype(element, eReferenceStereotype);

						processEcoreTaggedValue(element, eReferenceStereotype,
							TAG_DEFINITION__IS_RESOLVE_PROXIES, eReference,
							EcorePackage.Literals.EREFERENCE__RESOLVE_PROXIES,
							options, diagnostics, context);

						processEcoreTaggedValue(element, eReferenceStereotype,
							TAG_DEFINITION__KEYS, eReference, null, options,
							diagnostics, context);
					}

					return eReferenceStereotype;
				}
			}.doSwitch(eStructuralFeature);

			if (eStructuralFeatureStereotype != null) {
				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_TRANSIENT, eStructuralFeature,
					EcorePackage.Literals.ESTRUCTURAL_FEATURE__TRANSIENT,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_UNSETTABLE, eStructuralFeature,
					EcorePackage.Literals.ESTRUCTURAL_FEATURE__UNSETTABLE,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_VOLATILE, eStructuralFeature,
					EcorePackage.Literals.ESTRUCTURAL_FEATURE__VOLATILE,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_FEATURE_KIND, eStructuralFeature, null,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_NAME, eStructuralFeature, null,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_NAMESPACE, eStructuralFeature, null,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__VISIBILITY, eStructuralFeature, null,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__ANNOTATIONS, eStructuralFeature, null,
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(Element element,
				EGenericType eGenericType, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eGenericTypeStereotype = getEcoreStereotype(
				eGenericType, STEREOTYPE__E_GENERIC_TYPE);

			if (eGenericTypeStereotype != null) {
				safeApplyStereotype(element, eGenericTypeStereotype);

				EGenericType eLowerBound = eGenericType.getELowerBound();

				if (eLowerBound != null) {
					EClassifier eClassifier = eLowerBound.getEClassifier();
					Type lowerBound = getType(eClassifier == null
						? eLowerBound.getETypeParameter()
						: eClassifier, eLowerBound);

					if (lowerBound != null) {

						if (OPTION__PROCESS.equals(options
							.get(OPTION__ECORE_TAGGED_VALUES))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										ECORE_TAGGED_VALUE,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_Ecore2UMLConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context,
													element,
													getTagDefinition(
														eGenericTypeStereotype,
														TAG_DEFINITION__LOWER_BOUND),
													lowerBound)),
										new Object[]{element}));
							}

							setTaggedValue(element, eGenericTypeStereotype,
								TAG_DEFINITION__LOWER_BOUND, lowerBound);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__ECORE_TAGGED_VALUES))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									ECORE_TAGGED_VALUE,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_Ecore2UMLConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(
												context,
												element,
												getTagDefinition(
													eGenericTypeStereotype,
													TAG_DEFINITION__LOWER_BOUND),
												lowerBound)),
									new Object[]{element}));
						}
					}
				}

				EGenericType eUpperBound = eGenericType.getEUpperBound();

				if (eUpperBound != null) {
					EClassifier eClassifier = eUpperBound.getEClassifier();
					Type upperBound = getType(eClassifier == null
						? eUpperBound.getETypeParameter()
						: eClassifier, eUpperBound);

					if (upperBound != null) {

						if (OPTION__PROCESS.equals(options
							.get(OPTION__ECORE_TAGGED_VALUES))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										ECORE_TAGGED_VALUE,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_Ecore2UMLConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context,
													element,
													getTagDefinition(
														eGenericTypeStereotype,
														TAG_DEFINITION__UPPER_BOUND),
													upperBound)),
										new Object[]{element}));
							}

							setTaggedValue(element, eGenericTypeStereotype,
								TAG_DEFINITION__UPPER_BOUND, upperBound);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__ECORE_TAGGED_VALUES))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									ECORE_TAGGED_VALUE,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_Ecore2UMLConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(
												context,
												element,
												getTagDefinition(
													eGenericTypeStereotype,
													TAG_DEFINITION__UPPER_BOUND),
												upperBound)),
									new Object[]{element}));
						}
					}
				}
			}
		}

		protected void processEcoreTaggedValues(Element element,
				ETypeParameter eTypeParameter, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eTypeParameterStereotype = getEcoreStereotype(
				eTypeParameter, STEREOTYPE__E_TYPE_PARAMETER);

			if (eTypeParameterStereotype != null) {
				safeApplyStereotype(element, eTypeParameterStereotype);

				EList<Type> bounds = new UniqueEList.FastCompare<Type>();

				for (EGenericType eBound : eTypeParameter.getEBounds()) {
					Type type = getType(eTypeParameter, eBound);

					if (type != null) {
						bounds.add(type);
					}
				}

				if (!bounds.isEmpty()) {

					if (OPTION__PROCESS.equals(options
						.get(OPTION__ECORE_TAGGED_VALUES))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									ECORE_TAGGED_VALUE,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_Ecore2UMLConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												element, getTagDefinition(
													eTypeParameterStereotype,
													TAG_DEFINITION__BOUNDS),
												bounds)), new Object[]{element}));
						}

						setTaggedValue(element, eTypeParameterStereotype,
							TAG_DEFINITION__BOUNDS, bounds);
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__ECORE_TAGGED_VALUES))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ECORE_TAGGED_VALUE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_Ecore2UMLConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											element, getTagDefinition(
												eTypeParameterStereotype,
												TAG_DEFINITION__BOUNDS), bounds)),
								new Object[]{element}));
					}
				}
			}
		}

		protected void processEcoreTaggedValues(Element element, EEnum eEnum,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			Stereotype eEnumStereotype = getEcoreStereotype(eEnum,
				STEREOTYPE__E_ENUM);

			if (eEnumStereotype != null) {
				safeApplyStereotype(element, eEnumStereotype);

				processEcoreTaggedValue(element, eEnumStereotype,
					TAG_DEFINITION__ANNOTATIONS, eEnum, null, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(Element element,
				EEnumLiteral eEnumLiteral, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eEnumLiteralStereotype = getEcoreStereotype(
				eEnumLiteral, STEREOTYPE__E_ENUM_LITERAL);

			if (eEnumLiteralStereotype != null) {
				safeApplyStereotype(element, eEnumLiteralStereotype);

				processEcoreTaggedValue(element, eEnumLiteralStereotype,
					TAG_DEFINITION__ANNOTATIONS, eEnumLiteral, null, options,
					diagnostics, context);

				processEcoreTaggedValue(element, eEnumLiteralStereotype,
					TAG_DEFINITION__LITERAL, eEnumLiteral,
					EcorePackage.Literals.EENUM_LITERAL__LITERAL, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(Element element,
				EOperation eOperation, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eOperationStereotype = getEcoreStereotype(eOperation,
				STEREOTYPE__E_OPERATION);

			if (eOperationStereotype != null) {
				safeApplyStereotype(element, eOperationStereotype);

				processEcoreTaggedValue(element, eOperationStereotype,
					TAG_DEFINITION__ANNOTATIONS, eOperation, null, options,
					diagnostics, context);

				processEcoreTaggedValue(element, eOperationStereotype,
					TAG_DEFINITION__VISIBILITY, eOperation, null, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(Element element,
				EParameter eParameter, Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {
			Stereotype eParameterStereotype = getEcoreStereotype(eParameter,
				STEREOTYPE__E_PARAMETER);

			if (eParameterStereotype != null) {
				safeApplyStereotype(element, eParameterStereotype);

				processEcoreTaggedValue(element, eParameterStereotype,
					TAG_DEFINITION__ANNOTATIONS, eParameter, null, options,
					diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (Map.Entry<EModelElement, Element> entry : eModelElementToElementMap
				.entrySet()) {

				EModelElement eModelElement = entry.getKey();
				final Element element = entry.getValue();

				new EcoreSwitch<Object>() {

					@Override
					public Object caseEClassifier(EClassifier eClassifier) {
						processEcoreTaggedValues(element, eClassifier, options,
							diagnostics, context);

						return eClassifier;
					}

					@Override
					public Object caseEDataType(EDataType eDataType) {
						processEcoreTaggedValues(element, eDataType, options,
							diagnostics, context);

						return eDataType;
					}

					@Override
					public Object caseEEnum(EEnum eEnum) {
						processEcoreTaggedValues(element, eEnum, options,
							diagnostics, context);

						return eEnum;
					}

					@Override
					public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
						processEcoreTaggedValues(element, eEnumLiteral,
							options, diagnostics, context);

						return eEnumLiteral;
					}

					@Override
					public Object caseEOperation(EOperation eOperation) {
						processEcoreTaggedValues(element, eOperation, options,
							diagnostics, context);

						return eOperation;
					}

					@Override
					public Object caseEPackage(EPackage ePackage) {
						processEcoreTaggedValues(element, ePackage, options,
							diagnostics, context);

						return ePackage;
					}

					@Override
					public Object caseEParameter(EParameter eParameter) {
						processEcoreTaggedValues(element, eParameter, options,
							diagnostics, context);

						return eParameter;
					}

					@Override
					public Object caseEStructuralFeature(
							EStructuralFeature eStructuralFeature) {
						processEcoreTaggedValues(element, eStructuralFeature,
							options, diagnostics, context);

						return eStructuralFeature;
					}

				}.doSwitch(eModelElement);
			}
		}

		protected void processRedefinesAnnotations(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (Map.Entry<EModelElement, Element> entry : eModelElementToElementMap
				.entrySet()) {
				EModelElement eModelElement = entry.getKey();

				if (eModelElement instanceof ETypedElement) {
					EAnnotation redefinesEAnnotation = getEAnnotation(
						eModelElement, ANNOTATION__REDEFINES, false);

					if (redefinesEAnnotation != null) {
						Feature feature = (Feature) entry.getValue();

						for (EObject reference : redefinesEAnnotation
							.getReferences()) {

							Feature redefinedFeature = (Feature) eModelElementToElementMap
								.get(reference);

							if (redefinedFeature != null
								&& findValidRedefinitions(feature,
									redefinedFeature.getName()).contains(
									redefinedFeature)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__REDEFINES_ANNOTATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												REDEFINES_ANNOTATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_Ecore2UMLConverter_ProcessRedefinesAnnotation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context, feature,
															redefinedFeature)),
												new Object[]{feature,
													redefinedFeature}));
									}

									getRedefinedFeatures(feature).add(
										redefinedFeature);
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__REDEFINES_ANNOTATIONS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.WARNING,
											UMLValidator.DIAGNOSTIC_SOURCE,
											REDEFINES_ANNOTATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_Ecore2UMLConverter_ReportRedefinesAnnotation_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, feature,
														redefinedFeature)),
											new Object[]{feature,
												redefinedFeature}));
								}
							}
						}
					}
				}
			}
		}

		protected void processSubsetsAnnotations(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (Map.Entry<EModelElement, Element> entry : eModelElementToElementMap
				.entrySet()) {
				EModelElement eModelElement = entry.getKey();

				if (eModelElement instanceof EStructuralFeature) {
					EAnnotation subsetsEAnnotation = getEAnnotation(
						eModelElement, ANNOTATION__SUBSETS, false);

					if (subsetsEAnnotation != null) {
						Property property = (Property) entry.getValue();

						for (EObject reference : subsetsEAnnotation
							.getReferences()) {

							Property subsettedProperty = (Property) eModelElementToElementMap
								.get(reference);

							if (subsettedProperty != null
								&& findValidSubsets(property,
									subsettedProperty.getName()).contains(
									subsettedProperty)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__SUBSETS_ANNOTATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												SUBSETS_ANNOTATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_Ecore2UMLConverter_ProcessSubsetsAnnotation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context, property,
															subsettedProperty)),
												new Object[]{property,
													subsettedProperty}));
									}

									property.getSubsettedProperties().add(
										subsettedProperty);
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__SUBSETS_ANNOTATIONS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.WARNING,
											UMLValidator.DIAGNOSTIC_SOURCE,
											SUBSETS_ANNOTATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_Ecore2UMLConverter_ReportSubsetsAnnotation_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, property,
														subsettedProperty)),
											new Object[]{property,
												subsettedProperty}));
								}
							}
						}
					}
				}
			}
		}

		protected void processUnionAnnotations(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (Map.Entry<EModelElement, Element> entry : eModelElementToElementMap
				.entrySet()) {
				EModelElement eModelElement = entry.getKey();

				if (eModelElement instanceof EStructuralFeature) {
					EAnnotation unionEAnnotation = getEAnnotation(
						eModelElement, ANNOTATION__UNION, false);

					if (unionEAnnotation != null) {
						Property property = (Property) entry.getValue();

						if (OPTION__PROCESS.equals(options
							.get(OPTION__UNION_ANNOTATIONS))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										UNION_ANNOTATION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_Ecore2UMLConverter_ProcessUnionAnnotation_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, property)),
										new Object[]{property}));
							}

							property.setIsDerivedUnion(true);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__UNION_ANNOTATIONS))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									UNION_ANNOTATION,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_Ecore2UMLConverter_ReportUnionAnnotation_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												property)),
									new Object[]{property}));
						}
					}
				}
			}
		}

		protected void processBodyAnnotation(Operation operation,
				String language, String body,
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			if (body != null) {

				if (OPTION__PROCESS.equals(options
					.get(OPTION__BODY_ANNOTATIONS))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								BODY_ANNOTATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_Ecore2UMLConverter_ProcessBodyAnnotation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											operation, language)),
								new Object[]{operation}));
					}

					Constraint bodyCondition = operation.getBodyCondition();

					if (bodyCondition == null) {
						bodyCondition = operation.createBodyCondition(null);
					}

					ValueSpecification specification = bodyCondition
						.getSpecification();
					OpaqueExpression expression = specification instanceof OpaqueExpression
						? (OpaqueExpression) specification
						: (OpaqueExpression) bodyCondition.createSpecification(
							null, null, UMLPackage.Literals.OPAQUE_EXPRESSION);

					expression.getLanguages().add(language);
					expression.getBodies().add(body);
				} else if (OPTION__REPORT.equals(options
					.get(OPTION__BODY_ANNOTATIONS))
					&& diagnostics != null) {

					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							BODY_ANNOTATION,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_Ecore2UMLConverter_ReportBodyAnnotation_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, operation,
										language)), new Object[]{operation}));
				}
			}
		}

		protected void processBodyAnnotations(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (Map.Entry<EModelElement, Element> entry : eModelElementToElementMap
				.entrySet()) {

				Element element = entry.getValue();

				if (element instanceof Operation) {
					Operation operation = (Operation) element;
					EModelElement eModelElement = entry.getKey();

					processBodyAnnotation(operation, LANGUAGE__OCL, EcoreUtil
						.getAnnotation(eModelElement,
							UML2_GEN_MODEL_PACKAGE_1_1_NS_URI,
							ANNOTATION_DETAIL__BODY), options, diagnostics,
						context);

					processBodyAnnotation(operation, LANGUAGE__JAVA, EcoreUtil
						.getAnnotation(eModelElement,
							EMF_GEN_MODEL_PACKAGE_NS_URI,
							ANNOTATION_DETAIL__BODY), options, diagnostics,
						context);
				}
			}
		}

		protected void processDocumentationAnnotations(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (Map.Entry<EModelElement, Element> entry : eModelElementToElementMap
				.entrySet()) {

				Element element = entry.getValue();
				EModelElement eModelElement = entry.getKey();

				String documentation = EcoreUtil
					.getDocumentation(eModelElement);

				if (!isEmpty(documentation)) {

					if (OPTION__PROCESS.equals(options
						.get(OPTION__DOCUMENTATION_ANNOTATIONS))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									DOCUMENTATION_ANNOTATION,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_Ecore2UMLConverter_ProcessDocumentationAnnotation_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												element)),
									new Object[]{element}));
						}

						Comment comment = element.createOwnedComment();
						comment.getAnnotatedElements().add(element);
						comment.setBody(documentation);

					} else if (OPTION__REPORT.equals(options
						.get(OPTION__DOCUMENTATION_ANNOTATIONS))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								DOCUMENTATION_ANNOTATION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_Ecore2UMLConverter_ReportDocumentationAnnotation_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											element)), new Object[]{element}));
					}
				}
			}
		}

		protected void processAnnotationDetails(
				final Map<String, String> options,
				final DiagnosticChain diagnostics,
				final Map<Object, Object> context) {

			for (Map.Entry<EModelElement, Element> entry : eModelElementToElementMap
				.entrySet()) {

				Element element = entry.getValue();

				if (element != null) {
					EModelElement eModelElement = entry.getKey();

					for (EAnnotation eAnnotation : eModelElement
						.getEAnnotations()) {

						String source = eAnnotation.getSource();

						if (source != null
							&& !source.equals(EcorePackage.eNS_URI)
							&& !source.equals(ExtendedMetaData.ANNOTATION_URI)
							&& !source
								.equals(EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE)
							&& !source.equals(EMF_GEN_MODEL_PACKAGE_NS_URI)
							&& !source.equals(UML2_UML_PACKAGE_2_0_NS_URI)
							&& !source.equals(ANNOTATION__DUPLICATES)
							&& !source.equals(ANNOTATION__REDEFINES)
							&& !source.equals(ANNOTATION__SUBSETS)
							&& !source.equals(ANNOTATION__UNION)) {

							EMap<String, String> details = eAnnotation
								.getDetails();

							if (!details.isEmpty()) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__ANNOTATION_DETAILS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												ANNOTATION_DETAILS,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_Ecore2UMLConverter_ProcessAnnotationDetails_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context, element,
															source)),
												new Object[]{element}));
									}

									getEAnnotation(element, source, true)
										.getDetails().putAll(details.map());
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__ANNOTATION_DETAILS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.WARNING,
											UMLValidator.DIAGNOSTIC_SOURCE,
											ANNOTATION_DETAILS,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_Ecore2UMLConverter_ReportAnnotationDetails_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, element,
														source)),
											new Object[]{element}));
								}
							}
						}
					}
				}
			}
		}

		protected void processOptions(Map<String, String> options,
				DiagnosticChain diagnostics, Map<Object, Object> context) {

			if (!OPTION__IGNORE
				.equals(options.get(OPTION__ECORE_TAGGED_VALUES))) {

				processEcoreTaggedValues(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__REDEFINES_ANNOTATIONS))) {

				processRedefinesAnnotations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE
				.equals(options.get(OPTION__SUBSETS_ANNOTATIONS))) {

				processSubsetsAnnotations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__UNION_ANNOTATIONS))) {
				processUnionAnnotations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__ANNOTATION_DETAILS))) {
				processAnnotationDetails(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__BODY_ANNOTATIONS))) {
				processBodyAnnotations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DOCUMENTATION_ANNOTATIONS))) {

				processDocumentationAnnotations(options, diagnostics, context);
			}
		}

		public Collection<? extends EObject> convert(
				Collection<? extends EObject> eObjects,
				Map<String, String> options, DiagnosticChain diagnostics,
				Map<Object, Object> context) {
			ePackages = EcoreUtil.getObjectsByType(eObjects,
				EcorePackage.Literals.EPACKAGE);

			this.options = options;
			this.diagnostics = diagnostics;
			this.context = context;

			for (EPackage ePackage : ePackages) {
				doSwitch(ePackage);
			}

			if (options != null) {
				processOptions(options, diagnostics, context);
			}

			return getRootContainers(EcoreUtil
				.<EObject> getObjectsByType(eModelElementToElementMap.values(),
					UMLPackage.Literals.PACKAGE));
		}
	}

	/**
	 * Represents an option choice of 'discard'.
	 */
	public static final String OPTION__DISCARD = "DISCARD"; //$NON-NLS-1$

	/**
	 * Represents an option choice of 'ignore'.
	 */
	public static final String OPTION__IGNORE = "IGNORE"; //$NON-NLS-1$

	/**
	 * Represents an option choice of 'process'.
	 */
	public static final String OPTION__PROCESS = "PROCESS"; //$NON-NLS-1$

	/**
	 * Represents an option choice of 'report'.
	 */
	public static final String OPTION__REPORT = "REPORT"; //$NON-NLS-1$

	protected static final String ANNOTATION__DUPLICATES = "duplicates"; //$NON-NLS-1$

	protected static final String ANNOTATION__REDEFINES = "redefines"; //$NON-NLS-1$

	protected static final String ANNOTATION__SUBSETS = "subsets"; //$NON-NLS-1$

	protected static final String ANNOTATION__UNION = "union"; //$NON-NLS-1$

	protected static final String ANNOTATION_DETAIL__BODY = "body"; //$NON-NLS-1$

	protected static final String ANNOTATION_DETAIL__DERIVATION = "derivation"; //$NON-NLS-1$

	protected static final String ANNOTATION_DETAIL__INITIAL = "initial"; //$NON-NLS-1$

	protected static final String ANNOTATION_DETAIL__URI = "URI"; //$NON-NLS-1$

	public static final String ENUMERATION_LITERAL__ATTRIBUTE = "Attribute"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__ATTRIBUTE_WILDCARD = "AttributeWilcard"; //$NON-NLS-1$

	public static final String ENUMERATION_LITERAL__ELEMENT = "Element"; //$NON-NLS-1$

	public static final String ENUMERATION_LITERAL__ELEMENT_ONLY = "ElementOnly"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__ELEMENT_WILDCARD = "ElementWildcard"; //$NON-NLS-1$

	public static final String ENUMERATION_LITERAL__EMPTY = "Empty"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__GROUP = "Group"; //$NON-NLS-1$

	public static final String ENUMERATION_LITERAL__MIXED = "Mixed"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__NONE = "None"; //$NON-NLS-1$

	public static final String ENUMERATION_LITERAL__SIMPLE = "Simple"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_ONLY = "ReadOnly"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_ONLY_UNSETTABLE = "ReadOnlyUnsettable"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_WRITE = "ReadWrite"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_WRITE_UNSETTABLE = "ReadWriteUnsettable"; //$NON-NLS-1$

	public static final String ENUMERATION_LITERAL__UNSPECIFIED = "Unspecified"; //$NON-NLS-1$

	public static final String ENUMERATION__CONTENT_KIND = "ContentKind"; //$NON-NLS-1$

	public static final String ENUMERATION__FEATURE_KIND = "FeatureKind"; //$NON-NLS-1$

	protected static final String ENUMERATION__VISIBILITY_KIND = "VisibilityKind"; //$NON-NLS-1$

	protected static final String EMF_GEN_MODEL_PACKAGE_NS_URI = "http://www.eclipse.org/emf/2002/GenModel"; //$NON-NLS-1$

	protected static final String UML2_GEN_MODEL_PACKAGE_NS_URI = "http://www.eclipse.org/uml2/2.2.0/GenModel"; //$NON-NLS-1$

	protected static final String UML2_GEN_MODEL_PACKAGE_1_1_NS_URI = "http://www.eclipse.org/uml2/1.1.0/GenModel"; //$NON-NLS-1$

	public static final String LANGUAGE__JAVA = "Java"; //$NON-NLS-1$

	public static final String LANGUAGE__OCL = "OCL"; //$NON-NLS-1$

	public static final String UML2_UML_PACKAGE_2_0_NS_URI = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$

	public static final String UML2_UML_PACKAGE_4_0_NS_URI = "http://www.eclipse.org/uml2/4.0.0/UML"; //$NON-NLS-1$

	public static final String UML2_UML_PACKAGE_4_1_NS_URI = "http://www.eclipse.org/uml2/4.1.0/UML"; //$NON-NLS-1$

	public static final String UML2_TYPES_PACKAGE_4_0_NS_URI = "http://www.eclipse.org/uml2/4.0.0/Types"; //$NON-NLS-1$

	/**
	 * An annotation tag that can be used for backward compatibility.
	 */
	public static final String UML2_UML_PACKAGE_2_0_NS_URI_COMPATIBILITY = "http://www.eclipse.org/uml2/2.0.0/UML/compatibility"; //$NON-NLS-1$

	/**
	 * The name of the 'Ecore' profile.
	 */
	public static final String PROFILE__ECORE = "Ecore"; //$NON-NLS-1$

	/**
	 * The name of the 'EAttribute' stereotype.
	 */
	public static final String STEREOTYPE__E_ATTRIBUTE = "EAttribute"; //$NON-NLS-1$

	/**
	 * The name of the 'EClass' stereotype.
	 */
	public static final String STEREOTYPE__E_CLASS = "EClass"; //$NON-NLS-1$

	/**
	 * The name of the 'EGenericType' stereotype.
	 */
	public static final String STEREOTYPE__E_GENERIC_TYPE = "EGenericType"; //$NON-NLS-1$

	/**
	 * The name of the 'ETypeParameter' stereotype.
	 */
	public static final String STEREOTYPE__E_TYPE_PARAMETER = "ETypeParameter"; //$NON-NLS-1$

	/**
	 * The name of the 'EDataType' stereotype.
	 */
	public static final String STEREOTYPE__E_DATA_TYPE = "EDataType"; //$NON-NLS-1$

	/**
	 * The name of the 'EEnum' stereotype.
	 */
	public static final String STEREOTYPE__E_ENUM = "EEnum"; //$NON-NLS-1$

	/**
	 * The name of the 'EEnumLiteral' stereotype.
	 */
	public static final String STEREOTYPE__E_ENUM_LITERAL = "EEnumLiteral"; //$NON-NLS-1$

	/**
	 * The name of the 'EOperation' stereotype.
	 */
	public static final String STEREOTYPE__E_OPERATION = "EOperation"; //$NON-NLS-1$

	/**
	 * The name of the 'EPackage' stereotype.
	 */
	public static final String STEREOTYPE__E_PACKAGE = "EPackage"; //$NON-NLS-1$

	/**
	 * The name of the 'EParameter' stereotype.
	 */
	public static final String STEREOTYPE__E_PARAMETER = "EParameter"; //$NON-NLS-1$

	/**
	 * The name of the 'EReference' stereotype.
	 */
	public static final String STEREOTYPE__E_REFERENCE = "EReference"; //$NON-NLS-1$

	/**
	 * The name of the 'annotations' stereotype property.
	 */
	public static final String TAG_DEFINITION__ANNOTATIONS = "annotations"; //$NON-NLS-1$

	/**
	 * The name of the 'attributeName' stereotype property.
	 */
	public static final String TAG_DEFINITION__ATTRIBUTE_NAME = "attributeName"; //$NON-NLS-1$

	/**
	 * The name of the 'basePackage' stereotype property.
	 */
	public static final String TAG_DEFINITION__BASE_PACKAGE = "basePackage"; //$NON-NLS-1$

	/**
	 * The name of the 'bounds' stereotype property.
	 */
	public static final String TAG_DEFINITION__BOUNDS = "bounds"; //$NON-NLS-1$

	/**
	 * The name of the 'className' stereotype property.
	 */
	public static final String TAG_DEFINITION__CLASS_NAME = "className"; //$NON-NLS-1$

	/**
	 * The name of the 'dataTypeName' stereotype property.
	 */
	public static final String TAG_DEFINITION__DATA_TYPE_NAME = "dataTypeName"; //$NON-NLS-1$

	/**
	 * The name of the 'enumName' stereotype property.
	 */
	public static final String TAG_DEFINITION__ENUM_NAME = "enumName"; //$NON-NLS-1$

	/**
	 * The name of the 'enumLiteralName' stereotype property.
	 */
	public static final String TAG_DEFINITION__ENUM_LITERAL_NAME = "enumLiteralName"; //$NON-NLS-1$

	/**
	 * The name of the 'instanceClassName' stereotype property.
	 */
	public static final String TAG_DEFINITION__INSTANCE_CLASS_NAME = "instanceClassName"; //$NON-NLS-1$

	/**
	 * The name of the 'isID' stereotype property.
	 */
	public static final String TAG_DEFINITION__IS_ID = "isID"; //$NON-NLS-1$

	/**
	 * The name of the 'isResolveProxies' stereotype property.
	 */
	public static final String TAG_DEFINITION__IS_RESOLVE_PROXIES = "isResolveProxies"; //$NON-NLS-1$

	/**
	 * The name of the 'isTransient' stereotype property.
	 */
	public static final String TAG_DEFINITION__IS_TRANSIENT = "isTransient"; //$NON-NLS-1$

	/**
	 * The name of the 'isUnsettable' stereotype property.
	 */
	public static final String TAG_DEFINITION__IS_UNSETTABLE = "isUnsettable"; //$NON-NLS-1$

	/**
	 * The name of the 'isVolatile' stereotype property.
	 */
	public static final String TAG_DEFINITION__IS_VOLATILE = "isVolatile"; //$NON-NLS-1$

	/**
	 * The name of the 'keys' stereotype property.
	 */
	public static final String TAG_DEFINITION__KEYS = "keys"; //$NON-NLS-1$

	/**
	 * The name of the 'literal' stereotype property.
	 */
	public static final String TAG_DEFINITION__LITERAL = "literal"; //$NON-NLS-1$

	/**
	 * The name of the 'lowerBound' stereotype property.
	 */
	public static final String TAG_DEFINITION__LOWER_BOUND = "lowerBound"; //$NON-NLS-1$

	/**
	 * The name of the 'nsPrefix' stereotype property.
	 */
	public static final String TAG_DEFINITION__NS_PREFIX = "nsPrefix"; //$NON-NLS-1$

	/**
	 * The name of the 'nsURI' stereotype property.
	 */
	public static final String TAG_DEFINITION__NS_URI = "nsURI"; //$NON-NLS-1$

	/**
	 * The name of the 'operationName' stereotype property.
	 */
	public static final String TAG_DEFINITION__OPERATION_NAME = "operationName"; //$NON-NLS-1$

	/**
	 * The name of the 'packageName' stereotype property.
	 */
	public static final String TAG_DEFINITION__PACKAGE_NAME = "packageName"; //$NON-NLS-1$

	/**
	 * The name of the 'parameterName' stereotype property.
	 */
	public static final String TAG_DEFINITION__PARAMETER_NAME = "parameterName"; //$NON-NLS-1$

	/**
	 * The name of the 'prefix' stereotype property.
	 */
	public static final String TAG_DEFINITION__PREFIX = "prefix"; //$NON-NLS-1$

	/**
	 * The name of the 'referenceName' stereotype property.
	 */
	public static final String TAG_DEFINITION__REFERENCE_NAME = "referenceName"; //$NON-NLS-1$

	/**
	 * The name of the 'upperBound' stereotype property.
	 */
	public static final String TAG_DEFINITION__UPPER_BOUND = "upperBound"; //$NON-NLS-1$

	/**
	 * The name of the 'visibility' stereotype property.
	 */
	public static final String TAG_DEFINITION__VISIBILITY = "visibility"; //$NON-NLS-1$

	/**
	 * The name of the 'xmlContentKind' stereotype property.
	 */
	public static final String TAG_DEFINITION__XML_CONTENT_KIND = "xmlContentKind"; //$NON-NLS-1$

	/**
	 * The name of the 'xmlFeatureKind' stereotype property.
	 */
	public static final String TAG_DEFINITION__XML_FEATURE_KIND = "xmlFeatureKind"; //$NON-NLS-1$

	/**
	 * The name of the 'xmlName' stereotype property.
	 */
	public static final String TAG_DEFINITION__XML_NAME = "xmlName"; //$NON-NLS-1$

	/**
	 * The name of the 'xmlNamespace' stereotype property.
	 */
	public static final String TAG_DEFINITION__XML_NAMESPACE = "xmlNamespace"; //$NON-NLS-1$

	/**
	 * Retrieves a qualified textual representation of the specified object
	 * using the default qualified text provider.
	 * 
	 * @param eObject
	 *            The object for which to retrieve qualified text.
	 * @return A qualified textual representation of the object.
	 */
	public static String getQualifiedText(EObject eObject) {
		return getQualifiedText(eObject, QualifiedTextProvider.DEFAULT);
	}

	protected static String getQualifiedName(NamedElement namedElement,
			String separator) {
		String name = namedElement.getName();

		if (isEmpty(name)) {
			return null;
		}

		StringBuffer qualifiedName = new StringBuffer(name);

		for (Namespace namespace : namedElement.allNamespaces()) {
			String namespaceName = namespace.getName();

			if (isEmpty(namespaceName)) {
				return null;
			} else {
				qualifiedName.insert(0, separator);
				qualifiedName.insert(0, namespaceName);
			}
		}

		return qualifiedName.toString();
	}

	/**
	 * Retrieves the named element(s) with the specified qualified name from the
	 * specified resource set.
	 * 
	 * @param resourceSet
	 *            The resource set in which to search.
	 * @param qualifiedName
	 *            The qualified name of the element(s) to be found.
	 * @return The named element(s).
	 */
	public static <NE extends NamedElement> Collection<NE> findNamedElements(
			ResourceSet resourceSet, String qualifiedName) {
		return findNamedElements(resourceSet, qualifiedName, false);
	}

	/**
	 * Retrieves the named element(s) with the specified qualified name from the
	 * specified resource set, optionally ignoring case when doing name
	 * comparisons.
	 * 
	 * @param resourceSet
	 *            The resource set in which to search.
	 * @param qualifiedName
	 *            The qualified name of the element(s) to be found.
	 * @param ignoreCase
	 *            Whether to ignore case when doing name comparisons.
	 * @return The named element(s).
	 */
	public static <NE extends NamedElement> Collection<NE> findNamedElements(
			ResourceSet resourceSet, String qualifiedName, boolean ignoreCase) {
		return findNamedElements(resourceSet, qualifiedName, ignoreCase,
			UMLPackage.Literals.NAMED_ELEMENT);
	}

	/**
	 * Retrieves the named element(s) of the specified type with the specified
	 * qualified name from the specified resource set, optionally ignoring case
	 * when doing name comparisons.
	 * 
	 * @param resourceSet
	 *            The resource set in which to search.
	 * @param qualifiedName
	 *            The qualified name of the element(s) to be found.
	 * @param ignoreCase
	 *            Whether to ignore case when doing name comparisons.
	 * @param eClass
	 *            The type of the element(s) to be found.
	 * @return The named element(s).
	 */
	public static <NE extends NamedElement> Collection<NE> findNamedElements(
			ResourceSet resourceSet, String qualifiedName, boolean ignoreCase,
			EClass eClass) {

		if (!isEmpty(qualifiedName)
			&& UMLPackage.Literals.NAMED_ELEMENT.isSuperTypeOf(eClass)) {

			EList<Resource> resources = resourceSet.getResources();
			int size = resources.size();

			if (size > 0) {
				EList<NE> namedElements = new UniqueEList.FastCompare<NE>();

				for (int i = 0; i < size; i++) {
					findNamedElements(resources.get(i).getContents(),
						qualifiedName, ignoreCase, eClass, namedElements);
				}

				return ECollections.unmodifiableEList(namedElements);
			}
		}

		return ECollections.<NE> emptyEList();
	}

	/**
	 * Retrieves the named element(s) with the specified qualified name from the
	 * specified resource.
	 * 
	 * @param resource
	 *            The resource in which to search.
	 * @param qualifiedName
	 *            The qualified name of the element(s) to be found.
	 * @return The named element(s).
	 */
	public static <NE extends NamedElement> Collection<NE> findNamedElements(
			Resource resource, String qualifiedName) {
		return findNamedElements(resource, qualifiedName, false);
	}

	/**
	 * Retrieves the named element(s) with the specified qualified name from the
	 * specified resource, optionally ignoring case when doing name comparisons.
	 * 
	 * @param resource
	 *            The resource in which to search.
	 * @param qualifiedName
	 *            The qualified name of the element(s) to be found.
	 * @param ignoreCase
	 *            Whether to ignore case when doing name comparisons.
	 * @return The named element(s).
	 */
	public static <NE extends NamedElement> Collection<NE> findNamedElements(
			Resource resource, String qualifiedName, boolean ignoreCase) {
		return findNamedElements(resource, qualifiedName, ignoreCase,
			UMLPackage.Literals.NAMED_ELEMENT);
	}

	/**
	 * Retrieves the named element(s) of the specified type with the specified
	 * qualified name from the specified resource, optionally ignoring case when
	 * doing name comparisons.
	 * 
	 * @param resource
	 *            The resource in which to search.
	 * @param qualifiedName
	 *            The qualified name of the element(s) to be found.
	 * @param ignoreCase
	 *            Whether to ignore case when doing name comparisons.
	 * @param eClass
	 *            The type of the element(s) to be found.
	 * @return The named element(s).
	 */
	public static <NE extends NamedElement> Collection<NE> findNamedElements(
			Resource resource, String qualifiedName, boolean ignoreCase,
			EClass eClass) {

		if (!isEmpty(qualifiedName)
			&& UMLPackage.Literals.NAMED_ELEMENT.isSuperTypeOf(eClass)) {

			EList<EObject> contents = resource.getContents();

			if (!contents.isEmpty()) {
				EList<NE> namedElements = new UniqueEList.FastCompare<NE>();

				findNamedElements(contents, qualifiedName, ignoreCase, eClass,
					namedElements);

				return ECollections.unmodifiableEList(namedElements);
			}
		}

		return ECollections.<NE> emptyEList();
	}

	protected static <NE extends NamedElement> Collection<NE> findNamedElements(
			Collection<? extends EObject> eObjects, String qualifiedName,
			boolean ignoreCase, EClass eClass, Collection<NE> namedElements) {
		int index = qualifiedName.indexOf(NamedElement.SEPARATOR);

		if (index == -1) {

			for (NE namedElement : EcoreUtil.<NE> getObjectsByType(eObjects,
				eClass)) {

				if (ignoreCase
					? qualifiedName.equalsIgnoreCase(namedElement.getName())
					: qualifiedName.equals(namedElement.getName())) {

					namedElements.add(namedElement);
				}
			}
		} else {
			String name = qualifiedName.substring(0, index);
			qualifiedName = qualifiedName.substring(index
				+ NamedElement.SEPARATOR.length());

			for (NamedElement namedElement : EcoreUtil
				.<NamedElement> getObjectsByType(eObjects,
					UMLPackage.Literals.NAMED_ELEMENT)) {

				if (ignoreCase
					? name.equalsIgnoreCase(namedElement.getName())
					: name.equals(namedElement.getName())) {

					findNamedElements(namedElement.eContents(), qualifiedName,
						ignoreCase, eClass, namedElements);
				}
			}
		}

		return namedElements;
	}

	protected static EPackage getEPackage(org.eclipse.uml2.uml.Package package_) {
		String nsURI = (String) getTaggedValue(
			package_, PROFILE__ECORE + NamedElement.SEPARATOR
			+ STEREOTYPE__E_PACKAGE, TAG_DEFINITION__NS_URI);
		return EPackage.Registry.INSTANCE.getEPackage(isEmpty(nsURI) ? package_.getURI() : nsURI);
	}

	protected static EClassifier getEClassifier(Type type) {
		Resource eResource = type.eResource();

		if (eResource != null) {

			if (UMLResource.UML_METAMODEL_URI.equals(String.valueOf(eResource
				.getURI()))) {

				return UMLPackage.eINSTANCE.getEClassifier(type.getName());
			} else if (UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI
				.equals(String.valueOf(eResource.getURI()))) {

				return TypesPackage.eINSTANCE.getEClassifier(type.getName());
			}
		}

		org.eclipse.uml2.uml.Package package_ = type.getNearestPackage();

		if (package_ != null) {
			EPackage ePackage = getEPackage(package_);

			if (ePackage != null) {
				return ePackage.getEClassifier(type.getName());
			}
		}

		return null;
	}

	protected static EClassifier getEClassifier(
			org.eclipse.uml2.uml.Class metaclass) {
		return getEClassifier((Type) metaclass);
	}

	/**
	 * Retrieves the profile for which the specified package represents a
	 * definition.
	 * 
	 * @param definition
	 *            The package.
	 * @return The profile.
	 */
	public static Profile getProfile(EPackage definition) {
		EObject eContainer = definition.eContainer();

		if (eContainer instanceof EAnnotation) {
			EAnnotation eAnnotation = (EAnnotation) eContainer;

			if (safeEquals(eAnnotation.getSource(), UML2_UML_PACKAGE_2_0_NS_URI)) {
				eContainer = eAnnotation.eContainer();

				if (eContainer instanceof Profile) {
					return (Profile) eContainer;
				}
			}
		}

		return null;
	}

	public static Profile getProfile(EPackage definition, EObject context) {
		Profile profile = getProfile(definition);

		if (profile == null && context != null) {
			Resource eResource = context.eResource();

			if (eResource != null) {
				ResourceSet resourceSet = eResource.getResourceSet();

				if (resourceSet != null) {
					String nsURI = definition.getNsURI();
					URI location = UMLPlugin
						.getEPackageNsURIToProfileLocationMap().get(nsURI);

					if (location != null) {

						try {
							profile = (Profile) resourceSet.getEObject(
								location, true);
						} catch (Exception e) {
							UMLPlugin.INSTANCE.log(e);
						}
					} else {
						LOOP : for (Resource resource : resourceSet
							.getResources()) {

							for (TreeIterator<Object> allProperContents = EcoreUtil
								.getAllProperContents(resource, false); allProperContents
								.hasNext();) {

								Object object = allProperContents.next();

								if (object instanceof Profile) {
									EAnnotation eAnnotation = ((Profile) object)
										.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);

									if (eAnnotation != null) {

										for (EObject content : eAnnotation
											.getContents()) {

											if (content instanceof EPackage
												&& safeEquals(nsURI,
													((EPackage) content)
														.getNsURI())) {

												profile = (Profile) object;
												break LOOP;
											}
										}
									}

									allProperContents.prune();
								}
							}
						}
					}
				}
			}
		}

		return profile;
	}

	protected static String getEcoreName(NamedElement namedElement) {
		String taggedValue = new UMLSwitch<String>() {

			@Override
			public String caseClassifier(Classifier classifier) {
				return (String) getTaggedValue(classifier, PROFILE__ECORE
					+ NamedElement.SEPARATOR + STEREOTYPE__E_CLASS,
					TAG_DEFINITION__CLASS_NAME);
			}

			@Override
			public String caseEnumeration(Enumeration enumeration) {
				return (String) getTaggedValue(enumeration, PROFILE__ECORE
					+ NamedElement.SEPARATOR + STEREOTYPE__E_ENUM,
					TAG_DEFINITION__ENUM_NAME);
			}

			@Override
			public String caseEnumerationLiteral(
					EnumerationLiteral enumerationLiteral) {
				String taggedValue = (String) getTaggedValue(
					enumerationLiteral, PROFILE__ECORE + NamedElement.SEPARATOR
						+ STEREOTYPE__E_ENUM_LITERAL,
					TAG_DEFINITION__ENUM_LITERAL_NAME);
				return isEmpty(taggedValue)
					? enumerationLiteral.getName()
					: taggedValue;
			}

			@Override
			public String caseOperation(Operation operation) {
				return (String) getTaggedValue(operation, PROFILE__ECORE
					+ NamedElement.SEPARATOR + STEREOTYPE__E_OPERATION,
					TAG_DEFINITION__OPERATION_NAME);
			}

			@Override
			public String casePackage(org.eclipse.uml2.uml.Package package_) {
				return (String) getTaggedValue(package_, PROFILE__ECORE
					+ NamedElement.SEPARATOR + STEREOTYPE__E_PACKAGE,
					TAG_DEFINITION__PACKAGE_NAME);
			}

			@Override
			public String caseParameter(Parameter parameter) {
				return (String) getTaggedValue(parameter, PROFILE__ECORE
					+ NamedElement.SEPARATOR + STEREOTYPE__E_PARAMETER,
					TAG_DEFINITION__PARAMETER_NAME);
			}

			@Override
			public String casePrimitiveType(PrimitiveType primitiveType) {
				return (String) getTaggedValue(primitiveType, PROFILE__ECORE
					+ NamedElement.SEPARATOR + STEREOTYPE__E_DATA_TYPE,
					TAG_DEFINITION__DATA_TYPE_NAME);
			}

			@Override
			public String caseProperty(Property property) {
				return (String) (UML2EcoreConverter
					.isEDataType((Classifier) property.getType())
					? getTaggedValue(property, PROFILE__ECORE
						+ NamedElement.SEPARATOR + STEREOTYPE__E_ATTRIBUTE,
						TAG_DEFINITION__ATTRIBUTE_NAME)
					: getTaggedValue(property, PROFILE__ECORE
						+ NamedElement.SEPARATOR + STEREOTYPE__E_REFERENCE,
						TAG_DEFINITION__REFERENCE_NAME));
			}

		}.doSwitch(namedElement);

		return isEmpty(taggedValue)
			? getValidJavaIdentifier(namedElement.getName())
			: taggedValue;
	}
	
	protected static NamedElement getNamedElement(ENamedElement definition) {
		return getNamedElement(definition, null);
	}

	protected static NamedElement getNamedElement(ENamedElement definition,
			EObject context) {

		if (definition instanceof EClassifier) {
			EAnnotation eAnnotation = definition
				.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);

			if (eAnnotation != null) {
				EList<EObject> references = eAnnotation.getReferences();

				if (!references.isEmpty()) {
					EObject reference = references.get(0);

					if ((reference instanceof Classifier) && !reference.eIsProxy()) {
						return (NamedElement) reference;
					}
				}
			}

			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) getNamedElement(
				((EClassifier) definition).getEPackage(), context);

			if (package_ != null) {
				String name = definition.getName();

				for (Type ownedType : package_.getOwnedTypes()) {

					if (safeEquals(getEcoreName(ownedType), name)) {
						return ownedType;
					}
				}
			}

			return null;
		} else if (definition instanceof EStructuralFeature) {
			AttributeOwner classifier = (AttributeOwner) getNamedElement(
				((EStructuralFeature) definition).getEContainingClass(),
				context);

			if (classifier != null) {
				String name = definition.getName();

				for (Property ownedAttribute : classifier.getOwnedAttributes()) {

					if (safeEquals(getEcoreName(ownedAttribute), name)) {
						return ownedAttribute;
					}
				}
			}

			return null;
		} else if (definition instanceof EEnumLiteral) {
			Enumeration enumeration = (Enumeration) getNamedElement(
				((EEnumLiteral) definition).getEEnum(), context);

			if (enumeration != null) {
				String name = definition.getName();

				for (EnumerationLiteral ownedLiteral : enumeration
					.getOwnedLiterals()) {

					if (safeEquals(getEcoreName(ownedLiteral), name)) {
						return ownedLiteral;
					}
				}
			}

			return null;
		} else if (definition instanceof EPackage) {
			EPackage ePackage = (EPackage) definition;
			Profile profile = getProfile(ePackage, context);

			if (profile == null) {
				EPackage eSuperPackage = ePackage.getESuperPackage();

				if (eSuperPackage != null) {
					org.eclipse.uml2.uml.Package nestingPackage = (org.eclipse.uml2.uml.Package) getNamedElement(
						eSuperPackage, context);

					if (nestingPackage != null) {
						String name = ePackage.getName();

						for (org.eclipse.uml2.uml.Package nestedPackage : nestingPackage
							.getNestedPackages()) {

							if (safeEquals(getEcoreName(nestedPackage), name)) {
								return nestedPackage;
							}
						}
					}
				}
			}

			return profile;
		} else {
			return null;
		}
	}
	
	protected static Stereotype getStereotype(EClass definition) {
		return getStereotype(definition, null);
	}

	protected static Stereotype getStereotype(EClass definition,
			EObject stereotypeApplication) {
		NamedElement namedElement = getNamedElement(definition,
			stereotypeApplication);
		return namedElement instanceof Stereotype
			? (Stereotype) namedElement
			: null;
	}

	/**
	 * Retrieves the stereotype for which the specified object represents an
	 * application.
	 * 
	 * @param stereotypeApplication
	 *            The object.
	 * @return The stereotype.
	 */
	public static Stereotype getStereotype(EObject stereotypeApplication) {

		if (stereotypeApplication != null) {
			EClass eClass = stereotypeApplication.eClass();

			for (EReference eReference : eClass.getEAllReferences()) {

				if (eReference.getName().startsWith(
					Extension.METACLASS_ROLE_PREFIX)
					&& UMLPackage.Literals.ELEMENT.isSuperTypeOf(eReference
						.getEReferenceType())) {

					return getStereotype(eClass, stereotypeApplication);
				}
			}
		}

		return null;
	}

	/**
	 * Retrieves the stereotype application of the specified class for the
	 * specified element, or null if no such stereotype application exists.
	 * 
	 * @param element The element to which the stereotype is applied.
	 * @param clazz The class of the stereotype application to retrieve.
	 * @return The stereotype application.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T getStereotypeApplication(Element element, Class<T> clazz) {

		for (EObject stereotypeApplication : element.getStereotypeApplications()) {
			
			if (clazz.isInstance(stereotypeApplication)) {
				return (T) stereotypeApplication;
			}
		}
		
		return null;
	}

	protected static Element getNearestBaseElement(EObject eObject,
			boolean resolve) {
		Element baseElement = null;

		for (EObject container = eObject; container != null
			&& (baseElement = getBaseElement(container)) == null;) {

			container = resolve
				? container.eContainer()
				: ((InternalEObject) container).eInternalContainer();
		}

		return baseElement;
	}

	protected static Element getBaseElement(EClass definition,
			EObject stereotypeApplication) {

		for (EStructuralFeature eStructuralFeature : definition
			.getEAllStructuralFeatures()) {

			if (eStructuralFeature.getName().startsWith(
				Extension.METACLASS_ROLE_PREFIX)) {

				Object value = stereotypeApplication.eGet(eStructuralFeature);

				if (value instanceof Element) {
					return (Element) value;
				}
			}
		}

		return null;
	}

	/**
	 * Retrieves the base element for the specified stereotype application, i.e.
	 * the element to which the stereotype is applied.
	 * 
	 * @param stereotypeApplication
	 *            The stereotype application.
	 * @return The base element.
	 */
	public static Element getBaseElement(EObject stereotypeApplication) {

		if (stereotypeApplication != null) {
			EClass eClass = stereotypeApplication.eClass();
			Element baseElement = getBaseElement(eClass, stereotypeApplication);

			if (baseElement != null
				&& getStereotype(eClass, stereotypeApplication) != null) {

				return baseElement;
			}
		}

		return null;
	}

	/**
	 * Sets the base element for the specified stereotype application to the
	 * specified element.
	 * 
	 * @param stereotypeApplication
	 *            The stereotype application.
	 * @param element
	 *            The new base element.
	 */
	public static void setBaseElement(EObject stereotypeApplication,
			Element element) {

		if (stereotypeApplication != null) {
			EClass eClass = stereotypeApplication.eClass();

			if (getStereotype(eClass, stereotypeApplication) != null) {

				for (EStructuralFeature eStructuralFeature : eClass
					.getEAllStructuralFeatures()) {

					if (eStructuralFeature.getName().startsWith(
						Extension.METACLASS_ROLE_PREFIX)
						&& (element == null || eStructuralFeature.getEType()
							.isInstance(element))) {

						stereotypeApplication.eSet(eStructuralFeature, element);
					}
				}
			}
		}
	}

	protected static EObject applyStereotype(Element element, EClass definition) {
		return StereotypeApplicationHelper.getInstance(element).applyStereotype(element, definition);
	}

	/**
	 * Safely applies the specified stereotype to the specified element, i.e.
	 * applies the profile if not already applied.
	 * 
	 * @param element
	 *            The element to which to apply the stereotype.
	 * @param stereotype
	 *            The stereotype to apply.
	 * @return The stereotype application.
	 */
	public static EObject safeApplyStereotype(Element element,
			Stereotype stereotype) {

		if (stereotype != null) {
			EObject stereotypeApplication = element
				.getStereotypeApplication(stereotype);

			if (stereotypeApplication == null) {
				org.eclipse.uml2.uml.Package nearestPackage = element
					.getNearestPackage();

				if (nearestPackage != null) {
					Profile profile = stereotype.getProfile();

					if (!nearestPackage.getAllAppliedProfiles().contains(
						profile)) {

						EList<org.eclipse.uml2.uml.Package> allOwningPackages = nearestPackage
							.allOwningPackages();
						int size = allOwningPackages.size();

						(size > 0
							? allOwningPackages.get(size - 1)
							: nearestPackage).applyProfile(profile);
					}

					stereotypeApplication = element
						.isStereotypeRequired(stereotype)
						? element.getStereotypeApplication(stereotype)
						: element.applyStereotype(stereotype);
				}
			}

			return stereotypeApplication;
		}

		return null;
	}

	protected static Property getTagDefinition(Stereotype stereotype,
			final String propertyName) {

		return (Property) findEObject(stereotype.getAllAttributes(),
			new EObjectMatcher() {

				public boolean matches(EObject eObject) {
					return safeEquals(((Property) eObject).getName(),
						propertyName);
				}
			});
	}

	public static Object getTaggedValue(Element element,
			String qualifiedStereotypeName, String propertyName) {
		Stereotype stereotype = element
			.getAppliedStereotype(qualifiedStereotypeName);

		return stereotype == null
			? null
			: element.getValue(stereotype, propertyName);
	}

	/**
	 * Sets the value of the specified property of the specified stereotype
	 * application on the specified element.
	 * 
	 * @param element
	 *            The element to which the stereotype is applied.
	 * @param stereotype
	 *            The stereotype.
	 * @param propertyName
	 *            The name of the stereotype property.
	 * @param value
	 *            The new value.
	 * @return <code>true</code> if the value was successfully set;
	 *         <code>false</code> otherwise.
	 */
	public static boolean setTaggedValue(Element element,
			Stereotype stereotype, String propertyName, Object value) {

		if (safeApplyStereotype(element, stereotype) != null) {
			element.setValue(stereotype, propertyName, value);
			return true;
		}

		return false;
	}

	protected static Element getOwningElement(Element element, EClass eClass,
			boolean resolve) {
		Element owningElement = null;

		for (Element owner = element; !eClass.isInstance(owningElement)
			&& owner != null;) {

			owningElement = (Element) owner.eGet(
				UMLPackage.Literals.ELEMENT__OWNER, resolve);

			owner = owningElement == null
				? getNearestBaseElement(resolve
					? owner.eContainer()
					: ((InternalEObject) owner).eInternalContainer(), resolve)
				: owningElement;
		}

		return owningElement;
	}

	protected static EList<Property> getOwnedAttributes(Type type) {
		return type instanceof AttributeOwner
			? ((AttributeOwner) type).getOwnedAttributes()
			: null;
	}

	protected static EList<Operation> getOwnedOperations(Type type) {
		return type instanceof OperationOwner
			? ((OperationOwner) type).getOwnedOperations()
			: null;
	}

	protected static EList<ETypeParameter> getETypeParameters(EObject eObject) {
		return new EcoreSwitch<EList<ETypeParameter>>() {

			@Override
			public EList<ETypeParameter> caseEClassifier(EClassifier eClassifier) {
				return eClassifier.getETypeParameters();
			}

			@Override
			public EList<ETypeParameter> caseEOperation(EOperation eOperation) {
				return eOperation.getETypeParameters();
			}

			@Override
			public EList<ETypeParameter> doSwitch(EObject eObject) {
				return eObject == null
					? null
					: super.doSwitch(eObject);
			}
		}.doSwitch(eObject);
	}

	protected static EList<Feature> getRedefinedFeatures(Feature feature) {
		@SuppressWarnings("unchecked")
		EList<Feature> redefinedFeatures = (EList<Feature>) new UMLSwitch<Object>() {

			@Override
			public Object caseOperation(Operation operation) {
				return operation.getRedefinedOperations();
			}

			@Override
			public Object caseProperty(Property property) {
				return property.getRedefinedProperties();
			}

			@Override
			public Object defaultCase(EObject eObject) {
				return ECollections.<Feature> emptyEList();
			}
		}.doSwitch(feature);

		return redefinedFeatures;
	}

	protected static boolean isRedefinitionValid(Feature redefiningFeature,
			Feature redefinedFeature) {
		return redefinedFeature.isConsistentWith(redefiningFeature);
	}

	protected static <F extends Feature> Collection<F> findValidRedefinitions(
			F redefiningFeature, String name) {
		Collection<F> redefinedFeatures = new UniqueEList.FastCompare<F>();

		for (Classifier redefinitionContext : redefiningFeature
			.getRedefinitionContexts()) {

			findValidRedefinitions(redefinedFeatures, redefiningFeature, name,
				redefinitionContext);
		}

		return redefinedFeatures;
	}

	protected static <F extends Feature> Collection<F> findValidRedefinitions(
			Collection<F> redefinedFeatures, F redefiningFeature,
			final String name, Classifier redefinitionContext) {

		F redefinedFeature = findValidRedefinition(redefiningFeature, name,
			redefinitionContext);

		if (redefinedFeature == null) {

			for (Classifier general : redefinitionContext.allParents()) {
				redefinedFeature = findValidRedefinition(redefiningFeature,
					name, general);

				if (redefinedFeature != null) {
					redefinedFeatures.add(redefinedFeature);
				}
			}
		} else {
			redefinedFeatures.add(redefinedFeature);
		}

		return redefinedFeatures;
	}

	private static <F extends Feature> F findValidRedefinition(
			F redefiningFeature, final String name,
			Classifier redefinitionContext) {

		@SuppressWarnings("unchecked")
		F redefinedFeature = (F) findEObject(redefinitionContext.getFeatures(),
			new EClassMatcher(redefiningFeature) {

				@Override
				public boolean matches(EObject otherEObject) {

					if (super.matches(otherEObject)) {
						Feature otherFeature = (Feature) otherEObject;

						return eObject != otherFeature
							&& safeEquals(otherFeature.getName(), name)
							&& isRedefinitionValid((Feature) eObject,
								otherFeature);
					}

					return false;
				}
			});

		return redefinedFeature;
	}

	protected static boolean isSubsetValid(Property subsettingProperty,
			Property subsettedProperty) {

		for (Type subsettingContext : subsettingProperty.subsettingContext()) {

			for (Type subsettedContext : subsettedProperty.subsettingContext()) {

				if (!subsettingContext.conformsTo(subsettedContext)) {
					return false;
				}
			}
		}

		return true;
	}

	protected static Collection<Property> findValidSubsets(
			Property subsettingProperty, String name) {
		Collection<Property> subsettedProperties = new UniqueEList.FastCompare<Property>();

		for (Type subsettingContext : subsettingProperty.subsettingContext()) {

			findValidSubsets(subsettedProperties, subsettingProperty, name,
				(Classifier) subsettingContext);
		}

		return subsettedProperties;
	}

	protected static Collection<Property> findValidSubsets(
			Collection<Property> subsettedProperties,
			Property subsettingProperty, final String name,
			Classifier subsettingContext) {
		Property subsettedProperty = (Property) findEObject(subsettingContext
			.getAttributes(), new EClassMatcher(subsettingProperty) {

			@Override
			public boolean matches(EObject otherEObject) {

				if (super.matches(otherEObject)) {
					Property otherProperty = (Property) otherEObject;

					return eObject != otherProperty
						&& safeEquals(otherProperty.getName(), name)
						&& isSubsetValid((Property) eObject, otherProperty);
				}

				return false;
			}
		});

		if (subsettedProperty == null) {

			for (Classifier general : subsettingContext.getGenerals()) {
				findValidSubsets(subsettedProperties, subsettingProperty, name,
					general);
			}
		} else {
			subsettedProperties.add(subsettedProperty);
		}

		return subsettedProperties;
	}

	/**
	 * Merges the contents of (all of) the packages merged by the specified
	 * package using the specified options. If a supported option is not
	 * specified, it will be defaulted to <code>OPTION__IGNORE</code>.
	 * 
	 * @param package_
	 *            The receiving package.
	 * @param options
	 *            The options to use.
	 * @return A traceability map from resulting elements to merged elements.
	 */
	public static Map<EObject, List<EObject>> merge(
			org.eclipse.uml2.uml.Package package_,
			Map<String, String> options) {

		options = defaultPackageMergeOptions(options, OPTION__IGNORE);

		return merge(package_, options, null, null);
	}

	private static Map<String, String> defaultPackageMergeOptions(
			Map<String, String> options, String defaultValue) {

		if (options == null) {
			options = new HashMap<String, String>();
		}

		if (!options
			.containsKey(PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY)) {

			options.put(PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY,
				defaultValue);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS)) {

			options.put(PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS,
				defaultValue);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS)) {

			options.put(PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS,
				defaultValue);
		}

		if (!options.containsKey(PackageMerger.OPTION__IMPLICIT_REDEFINITIONS)) {
			options.put(PackageMerger.OPTION__IMPLICIT_REDEFINITIONS,
				defaultValue);
		}

		if (!options.containsKey(PackageMerger.OPTION__INVALID_REDEFINITIONS)) {
			options.put(PackageMerger.OPTION__INVALID_REDEFINITIONS,
				defaultValue);
		}

		if (!options.containsKey(PackageMerger.OPTION__INVALID_SUBSETS)) {
			options.put(PackageMerger.OPTION__INVALID_SUBSETS, defaultValue);
		}

		if (!options.containsKey(PackageMerger.OPTION__EMPTY_UNIONS)) {
			options.put(PackageMerger.OPTION__EMPTY_UNIONS, defaultValue);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__ASSOCIATION_SPECIALIZATIONS)) {

			options.put(PackageMerger.OPTION__ASSOCIATION_SPECIALIZATIONS,
				defaultValue);
		}

		if (!options.containsKey(PackageMerger.OPTION__CAPABILITIES)) {
			options.put(PackageMerger.OPTION__CAPABILITIES, defaultValue);
		}

		if (!options.containsKey(PackageMerger.OPTION__EMPTY_QUALIFIED_NAMES)) {
			options.put(PackageMerger.OPTION__EMPTY_QUALIFIED_NAMES,
				defaultValue);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__INDISTINGUISHABLE_CLASSIFIERS)) {

			options.put(PackageMerger.OPTION__INDISTINGUISHABLE_CLASSIFIERS,
				defaultValue);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__ATTRIBUTE_TRANSFORMATIONS)) {

			options.put(PackageMerger.OPTION__ATTRIBUTE_TRANSFORMATIONS,
				defaultValue);
		}

		return options;
	}

	/**
	 * Merges the contents of (all of) the packages merged by the specified
	 * package using the specified options, reporting problems to the specified
	 * diagnostics, within the specified context. If a supported option is not
	 * specified, it will be defaulted to <code>OPTION__REPORT</code>.
	 * 
	 * @param package_
	 *            The receiving package.
	 * @param options
	 *            The options to use.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 * @return A traceability map from resulting elements to merged elements.
	 */
	public static Map<EObject, List<EObject>> merge(
			org.eclipse.uml2.uml.Package package_,
			Map<String, String> options, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		options = defaultPackageMergeOptions(options, OPTION__REPORT);

		return new PackageMerger().merge(package_, options, diagnostics, context);
	}

	/**
	 * Applies all of the {@linkplain TemplateableElement#getTemplateBindings()
	 * template bindings} of an element, copying the structure of the templates
	 * that it binds to and applying parameter substitutions. If a supported
	 * option is not specified, it will be defaulted to
	 * <code>OPTION__IGNORE</code>.
	 * 
	 * @param templateableElement
	 *            The templateable element to expand by applying its bound
	 *            templates
	 * @param options
	 *            The options to use.
	 * @return A traceability map from resulting elements to template elements.
	 * 
	 * @since 5.0
	 */
	public static Map<EObject, List<EObject>> expand(
			TemplateableElement templateableElement, Map<String, String> options) {

		options = defaultPackageMergeOptions(options, OPTION__IGNORE);

		if (!options
			.containsKey(TemplateExpander.OPTION__MISSING_PARAMETER_SUBSTITUTIONS)) {
			options.put(
				TemplateExpander.OPTION__MISSING_PARAMETER_SUBSTITUTIONS,
				OPTION__IGNORE);
		}

		return expand(templateableElement, options, null, null);
	}

	/**
	 * Applies all of the {@linkplain TemplateableElement#getTemplateBindings()
	 * template bindings} of an element, copying the structure of the templates
	 * that it binds to and applying parameter substitutions. If a supported
	 * option is not specified, it will be defaulted to
	 * <code>OPTION__REPORT</code>.
	 * 
	 * @param boundElement
	 *            The bound element to expand by applying its templates
	 * @param options
	 *            The options to use.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 * @return A traceability map from resulting elements to template elements.
	 * 
	 * @since 5.0
	 */
	public static Map<EObject, List<EObject>> expand(
			TemplateableElement boundElement,
			Map<String, String> options, final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {

		options = defaultPackageMergeOptions(options, OPTION__REPORT);

		if (!options
			.containsKey(TemplateExpander.OPTION__MISSING_PARAMETER_SUBSTITUTIONS)) {

			options.put(
				TemplateExpander.OPTION__MISSING_PARAMETER_SUBSTITUTIONS,
				OPTION__REPORT);
		}

		return new TemplateExpander().expand(boundElement, options,
			diagnostics, context);
	}

	/**
	 * Converts the specified package (and its contents) to Ecore using the
	 * specified options. If a supported option is not specified, it will be
	 * defaulted to <code>OPTION__IGNORE</code>.
	 * 
	 * @param package_
	 *            The package to convert.
	 * @param options
	 *            The options to use.
	 * @return An Ecore representation of the package.
	 */
	public static Collection<EPackage> convertToEcore(
			org.eclipse.uml2.uml.Package package_, Map<String, String> options) {

		if (options == null) {
			options = new HashMap<String, String>();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS)) {

			options.put(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__VALIDATION_DELEGATES)) {
			options.put(UML2EcoreConverter.OPTION__VALIDATION_DELEGATES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__NON_API_INVARIANTS)) {
			options.put(UML2EcoreConverter.OPTION__NON_API_INVARIANTS,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__OPERATION_BODIES)) {
			options.put(UML2EcoreConverter.OPTION__OPERATION_BODIES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__INVOCATION_DELEGATES)) {
			options.put(UML2EcoreConverter.OPTION__INVOCATION_DELEGATES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__COMMENTS)) {
			options.put(UML2EcoreConverter.OPTION__COMMENTS, OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES)) {

			options.put(UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS)) {

			options.put(
				UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
				OPTION__IGNORE);
		}

		return convertToEcore(package_, options, null, null);
	}

	/**
	 * Converts the specified package (and its contents) to Ecore using the
	 * specified options, reporting problems to the specified diagnostics,
	 * within the specified context. If a supported option is not specified, it
	 * will be defaulted to <code>OPTION__REPORT</code>.
	 * 
	 * @param package_
	 *            The package to convert.
	 * @param options
	 *            The options to use.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 * @return An Ecore representation of the package.
	 */
	public static Collection<EPackage> convertToEcore(
			org.eclipse.uml2.uml.Package package_, Map<String, String> options,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (options == null) {
			options = new HashMap<String, String>();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS)) {

			options.put(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__VALIDATION_DELEGATES)) {
			options.put(UML2EcoreConverter.OPTION__VALIDATION_DELEGATES,
				OPTION__IGNORE); // 'report' is not valid for this option
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__NON_API_INVARIANTS)) {
			options.put(UML2EcoreConverter.OPTION__NON_API_INVARIANTS,
				OPTION__IGNORE); // 'report' is not valid for this option
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__OPERATION_BODIES)) {
			options.put(UML2EcoreConverter.OPTION__OPERATION_BODIES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__INVOCATION_DELEGATES)) {
			options.put(UML2EcoreConverter.OPTION__INVOCATION_DELEGATES,
				OPTION__IGNORE); // 'report' is not valid for this option
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__COMMENTS)) {
			options.put(UML2EcoreConverter.OPTION__COMMENTS, OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS)) {

			options.put(
				UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
				OPTION__REPORT);
		}

		@SuppressWarnings("unchecked")
		Collection<EPackage> ePackages = (Collection<EPackage>) new UML2EcoreConverter()
			.convert(Collections.singletonList(package_), options, diagnostics,
				context);

		return ePackages;
	}

	/**
	 * Converts the specified profile (and its contents) to Ecore using the
	 * specified options. If a supported option is not specified, it will be
	 * defaulted to <code>OPTION__IGNORE</code>.
	 * 
	 * @param profile
	 *            The profile to convert.
	 * @param options
	 *            The options to use.
	 * @return An Ecore representation of the profile.
	 */
	public static Collection<EPackage> convertToEcore(Profile profile,
			Map<String, String> options) {

		if (options == null) {
			options = new HashMap<String, String>();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS)) {

			options.put(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__OPERATION_BODIES)) {
			options.put(UML2EcoreConverter.OPTION__OPERATION_BODIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__COMMENTS)) {
			options.put(UML2EcoreConverter.OPTION__COMMENTS, OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES)) {

			options.put(UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS)) {

			options.put(
				UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
				OPTION__IGNORE);
		}

		return convertToEcore(profile, options, null, null);
	}

	/**
	 * Converts the specified profile (and its contents) to Ecore using the
	 * specified options, reporting problems to the specified diagnostics,
	 * within the specified context. If a supported option is not specified, it
	 * will be defaulted to <code>OPTION__REPORT</code>.
	 * 
	 * @param profile
	 *            The profile to convert.
	 * @param options
	 *            The options to use.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 * @return An Ecore representation of the profile.
	 */
	public static Collection<EPackage> convertToEcore(Profile profile,
			Map<String, String> options, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (options == null) {
			options = new HashMap<String, String>();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS)) {

			options.put(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__OPERATION_BODIES)) {
			options.put(UML2EcoreConverter.OPTION__OPERATION_BODIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__COMMENTS)) {
			options.put(UML2EcoreConverter.OPTION__COMMENTS, OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS)) {

			options.put(
				UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
				OPTION__REPORT);
		}

		@SuppressWarnings("unchecked")
		Collection<EPackage> ePackages = (Collection<EPackage>) new Profile2EPackageConverter()
			.convert(Collections.singleton(profile), options, diagnostics,
				context);

		for (TreeIterator<EObject> allContents = EcoreUtil
			.getAllContents(ePackages); allContents.hasNext();) {

			new EcoreSwitch<Object>() {

				@Override
				public Object caseEAttribute(EAttribute eAttribute) {

					try {
						eAttribute.getDefaultValue();
					} catch (Exception e) {
						eAttribute.setDefaultValueLiteral(null);
					}

					return eAttribute;
				}

				@Override
				public Object caseEDataType(EDataType eDataType) {
					Class<?> instanceClass = null;

					try {
						instanceClass = eDataType.getInstanceClass();
					} catch (Exception e) {
						// do nothing
					}

					if (instanceClass == null) {
						eDataType
							.setInstanceClassName(EcorePackage.Literals.ESTRING
								.getInstanceClassName());
					}

					return eDataType;
				}

				@Override
				public Object caseEEnum(EEnum eEnum) {
					return eEnum;
				}

			}.doSwitch(allContents.next());
		}

		return ePackages;
	}

	/**
	 * Converts the specified Ecore package (and its contents) to UML using the
	 * specified options.
	 * 
	 * @param ePackage
	 *            The Ecore package to convert.
	 * @param options
	 *            The options to use.
	 * @return A UML representation of the Ecore package.
	 */
	public static Collection<org.eclipse.uml2.uml.Package> convertFromEcore(
			EPackage ePackage, Map<String, String> options) {

		if (options == null) {
			options = new HashMap<String, String>();
		}

		return convertFromEcore(ePackage, options, null, null);
	}

	/**
	 * Converts the specified Ecore package (and its contents) to UML using the
	 * specified options, reporting problems to the specified diagnostics,
	 * within the specified context.
	 * 
	 * @param ePackage
	 *            The Ecore package to convert.
	 * @param options
	 *            The options to use.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 * @return A UML representation of the Ecore package.
	 */
	public static Collection<org.eclipse.uml2.uml.Package> convertFromEcore(
			EPackage ePackage, Map<String, String> options,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (options == null) {
			options = new HashMap<String, String>();
		}

		@SuppressWarnings("unchecked")
		Collection<org.eclipse.uml2.uml.Package> packages = (Collection<org.eclipse.uml2.uml.Package>) new Ecore2UMLConverter()
			.convert(Collections.singleton(ePackage), options, diagnostics,
				context);
		return packages;
	}

	/**
	 * Initializes the registries for the specified resource set with the
	 * content type and extended metadata registrations needed to work with the
	 * various supported versions of UML, XMI, and CMOF.
	 * 
	 * @param resourceSet
	 *            The resource set whose registries to initialize.
	 * @return The resource set.
	 * 
	 * @since 4.0
	 */
	public static ResourceSet init(ResourceSet resourceSet) {

		if (resourceSet != null) {
			Map<String, Object> contentTypeToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getContentTypeToFactoryMap();

			contentTypeToFactoryMap.put(
				UML402UMLResource.UML_4_0_0_CONTENT_TYPE_IDENTIFIER,
				UML402UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				UML302UMLResource.UML_3_0_0_CONTENT_TYPE_IDENTIFIER,
				UML302UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				UML212UMLResource.UML_2_1_0_CONTENT_TYPE_IDENTIFIER,
				UML212UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				UML212UMLResource.UML_2_0_0_CONTENT_TYPE_IDENTIFIER,
				UML212UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				UML22UMLResource.UML2_CONTENT_TYPE_IDENTIFIER,
				UML22UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				XMI2UMLResource.UML_CONTENT_TYPE_IDENTIFIER,
				XMI2UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				XMI242UMLResource.UML_2_4_1_CONTENT_TYPE_IDENTIFIER,
				XMI242UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				XMI242UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER,
				XMI242UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				XMI222UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER,
				XMI222UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				XMI212UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER,
				XMI212UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				XMI212UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER,
				XMI212UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				CMOF2UMLResource.CMOF_CONTENT_TYPE_IDENTIFIER,
				CMOF2UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				CMOF242UMLResource.CMOF_2_4_1_CONTENT_TYPE_IDENTIFIER,
				CMOF242UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				CMOF242UMLResource.CMOF_2_4_CONTENT_TYPE_IDENTIFIER,
				CMOF242UMLResource.Factory.INSTANCE);
			contentTypeToFactoryMap.put(
				CMOF202UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER,
				CMOF202UMLResource.Factory.INSTANCE);

			Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();

			uriMap.putAll(UML402UMLExtendedMetaData.getURIMap());
			uriMap.putAll(UML302UMLExtendedMetaData.getURIMap());
			uriMap.putAll(UML212UMLExtendedMetaData.getURIMap());
			uriMap.putAll(UML22UMLExtendedMetaData.getURIMap());
			uriMap.putAll(XMI2UMLExtendedMetaData.getURIMap());
			uriMap.putAll(CMOF2UMLExtendedMetaData.getURIMap());
		}

		return resourceSet;
	}

	/**
	 * Determines whether the specified type is a primitive type that classifies
	 * Boolean values.
	 * 
	 * @param type
	 *            The type in question.
	 * @return <code>true</code> if the type is a Boolean primitive type;
	 *         <code>false</code> otherwise.
	 * 
	 * @since 4.0
	 */
	public static boolean isBoolean(Type type) {

		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();

			return "JavaPrimitiveTypes::boolean".equals(qualifiedName) //$NON-NLS-1$
				|| "EcorePrimitiveTypes::EBoolean".equals(qualifiedName) //$NON-NLS-1$
				|| "EcorePrimitiveTypes::EBooleanObject".equals(qualifiedName) //$NON-NLS-1$
				|| "PrimitiveTypes::Boolean".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::Boolean".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::BooleanObject".equals(qualifiedName); //$NON-NLS-1$
		}

		return false;
	}

	/**
	 * Determines whether the specified type is a primitive type that classifies
	 * integer values.
	 * 
	 * @param type
	 *            The type in question.
	 * @return <code>true</code> if the type is an integer primitive type;
	 *         <code>false</code> otherwise.
	 * 
	 * @since 4.0
	 */
	public static boolean isInteger(Type type) {

		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();

			return "JavaPrimitiveTypes::int".equals(qualifiedName) //$NON-NLS-1$
				|| "EcorePrimitiveTypes::EInt".equals(qualifiedName) //$NON-NLS-1$
				|| "EcorePrimitiveTypes::EIntegerObject".equals(qualifiedName) //$NON-NLS-1$
				|| "PrimitiveTypes::Integer".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::Int".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::Integer".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::IntObject".equals(qualifiedName); //$NON-NLS-1$
		}

		return false;
	}

	/**
	 * Determines whether the specified type is a primitive type that classifies
	 * real values.
	 * 
	 * @param type
	 *            The type in question.
	 * @return <code>true</code> if the type is a real primitive type;
	 *         <code>false</code> otherwise.
	 * 
	 * @since 4.0
	 */
	public static boolean isReal(Type type) {

		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();

			return "JavaPrimitiveTypes::double".equals(qualifiedName) //$NON-NLS-1$
				|| "EcorePrimitiveTypes::EDouble".equals(qualifiedName) //$NON-NLS-1$
				|| "EcorePrimitiveTypes::EDoubleObject".equals(qualifiedName) //$NON-NLS-1$
				|| "PrimitiveTypes::Real".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::Double".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::DoubleObject".equals(qualifiedName); //$NON-NLS-1$
		}

		return false;
	}

	/**
	 * Determines whether the specified type is a primitive type that classifies
	 * string values.
	 * 
	 * @param type
	 *            The type in question.
	 * @return <code>true</code> if the type is a string primitive type;
	 *         <code>false</code> otherwise.
	 * 
	 * @since 4.0
	 */
	public static boolean isString(Type type) {

		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();

			return "EcorePrimitiveTypes::EString".equals(qualifiedName) //$NON-NLS-1$
				|| "PrimitiveTypes::String".equals(qualifiedName) //$NON-NLS-1$
				|| "XMLPrimitiveTypes::String".equals(qualifiedName); //$NON-NLS-1$
		}

		return false;
	}

	/**
	 * Determines whether the specified type is a primitive type that classifies
	 * unlimited natural values.
	 * 
	 * @param type
	 *            The type in question.
	 * @return <code>true</code> if the type is an unlimited natural primitive
	 *         type; <code>false</code> otherwise.
	 * 
	 * @since 4.0
	 */
	public static boolean isUnlimitedNatural(Type type) {

		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();

			return "PrimitiveTypes::UnlimitedNatural".equals(qualifiedName); //$NON-NLS-1$
		}

		return false;
	}

	/**
	 * Retrieves an OCL compliant version of the specified UML body expression.
	 * 
	 * @param body
	 *            A UML body expression.
	 * @return An OCL compliant body expression.
	 * 
	 * @since 5.0
	 */
	public static String getOCLBody(String body) {
		String oclBody = body.trim();

		if (oclBody.startsWith("result")) { //$NON-NLS-1$
			oclBody = oclBody.substring(6).trim();

			if (oclBody.startsWith("=")) { //$NON-NLS-1$
				oclBody = oclBody.substring(1).trim();

				if (oclBody.startsWith("(") && oclBody.endsWith(")")) { //$NON-NLS-1$ //$NON-NLS-2$
					oclBody = oclBody.substring(1, oclBody.length() - 1).trim();
				}

				return oclBody;
			}
		}

		return body;
	}

}
