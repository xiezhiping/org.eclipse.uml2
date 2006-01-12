/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StereotypeOperations.java,v 1.30 2006/01/12 02:17:07 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;

/**
 * A static utility class that provides operations related to '<em><b>Stereotype</b></em>'
 * model objects.
 */
public final class StereotypeOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The source for the appliedStereotypes annotation on elements.
	 */
	public static final String ANNOTATION_SOURCE__APPLIED_STEREOTYPES = "appliedStereotypes"; //$NON-NLS-1$

	/**
	 * The source for the stereotype annotation on Ecore classes.
	 */
	public static final String ANNOTATION_SOURCE__STEREOTYPE = "stereotype"; //$NON-NLS-1$

	/**
	 * The source for the enumerationLiteral annotation on Ecore enum literals.
	 */
	public static final String ANNOTATION_SOURCE__ENUMERATION_LITERAL = "enumerationLiteral"; //$NON-NLS-1$

	/**
	 * The prefix for metaclass extension role names.
	 */
	public static final String METACLASS_EXTENSION_ROLE_PREFIX = "base$"; //$NON-NLS-1$

	/**
	 * The prefix for stereotype extension role names.
	 */
	public static final String STEREOTYPE_EXTENSION_ROLE_PREFIX = "extension$"; //$NON-NLS-1$

	private StereotypeOperations() {
		super();
	}

	/**
	 * Retrieves the specified version of the Ecore class representing the
	 * specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the Ecore class.
	 * @param version
	 *            The version of the Ecore class to retrieve.
	 * @return The Ecore class representing the stereotype, or <code>null</code>.
	 */
	public static EClass getEClass(Stereotype stereotype, String version) {
		EPackage ePackage = ProfileOperations.getEPackage(stereotype
			.getProfile(), version);

		return null == ePackage
			? null
			: (EClass) ePackage.getEClassifier(ProfileOperations
				.getEClassifierName(stereotype));
	}

	/**
	 * Retrieves the Ecore object representing an application of the specified
	 * stereotype to the specified element.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the Ecore object.
	 * @param element
	 *            The element to which the stereotype is applied.
	 * @return The Ecore object representing the stereotype application.
	 */
	public static EObject getEObject(Stereotype stereotype, Element element) {

		for (Iterator contents = safeGetEAnnotation(element,
			ANNOTATION_SOURCE__APPLIED_STEREOTYPES).getContents().iterator(); contents
			.hasNext();) {

			EObject eObject = (EObject) contents.next();

			if (stereotype == getStereotype(eObject)) {
				return eObject;
			}
		}

		return null;
	}

	/**
	 * Retrieves the stereotype whose application is represented by the
	 * specified Ecore object.
	 * 
	 * @param eObject
	 *            The Ecore object for which to retrieve the stereotype.
	 * @return The stereotype whose application is represented by the Ecore
	 *         object.
	 */
	public static Stereotype getStereotype(EObject eObject) {
		return null == eObject
			? null
			: getStereotype(eObject.eClass());
	}

	/**
	 * Retrieves the stereotype represented by the specified Ecore class.
	 * 
	 * @param eClass
	 *            The Ecore class for which to retrieve the stereotype.
	 * @return The stereotype represented by the Ecore class.
	 */
	protected static Stereotype getStereotype(EClass eClass) {
		EList stereotypeEAnnotationReferences = safeGetEAnnotation(eClass,
			ANNOTATION_SOURCE__STEREOTYPE).getReferences();

		return stereotypeEAnnotationReferences.isEmpty()
			? null
			: (Stereotype) stereotypeEAnnotationReferences.get(0);
	}

	/**
	 * Retrieves the enumeration literal represented by the specified Ecore enum
	 * literal.
	 * 
	 * @param eEnumLiteral
	 *            The Ecore enum literal for which to retrieve the enumeration
	 *            literal.
	 * @return The enumeration literal represented by the Ecore enum literal.
	 */
	public static EnumerationLiteral getEnumerationLiteral(
			EEnumLiteral eEnumLiteral) {
		EList enumerationLiteralEAnnotationReferences = safeGetEAnnotation(
			eEnumLiteral, ANNOTATION_SOURCE__ENUMERATION_LITERAL)
			.getReferences();

		return enumerationLiteralEAnnotationReferences.isEmpty()
			? null
			: (EnumerationLiteral) enumerationLiteralEAnnotationReferences
				.get(0);
	}

	/**
	 * Retrieves the set of Ecore classes extended by the specified stereotype,
	 * including the Ecore classes extended by its super(stereo)types.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the Ecore classes.
	 * @return The Ecore classes extended by the stereotype and its
	 *         super(stereo)types.
	 * @deprecated Use getAllExtendedMetaclasses(Stereotype) instead.
	 */
	public static Set getAllExtendedEClasses(Stereotype stereotype) {
		Set allExtendedEClasses = new HashSet();

		getAllExtendedEClassesHelper(stereotype, allExtendedEClasses);

		return allExtendedEClasses;
	}

	/**
	 * Adds the Ecore classes extended by the specified stereotype, including
	 * the Ecore classes extended by its super(stereo)types, to the specified
	 * set.
	 * 
	 * @param stereotype
	 *            The stereotype for which to add the Ecore classes.
	 * @param allExtendedEClasses
	 *            The set to which to add the Ecore classes.
	 * @deprecated Use getExtendedMetaclassesHelper(Stereotype, Set) instead.
	 */
	protected static void getAllExtendedEClassesHelper(Stereotype stereotype,
			Set allExtendedEClasses) {

		ownedAttributesLoop : for (Iterator ownedAttributes = stereotype
			.getOwnedAttributes().iterator(); ownedAttributes.hasNext();) {

			Property property = (Property) ownedAttributes.next();
			Type type = property.getType();

			if (org.eclipse.uml2.Class.class.isInstance(type)
				&& Extension.class.isInstance(property.getAssociation())) {

				EClassifier eClassifier = UML2Package.eINSTANCE
					.getEClassifier(type.getName());

				if (EClass.class.isInstance(eClassifier)) {

					for (Iterator eClasses = allExtendedEClasses.iterator(); eClasses
						.hasNext();) {

						EClass eClass = (EClass) eClasses.next();

						if (((EClass) eClassifier).isSuperTypeOf(eClass)) {
							continue ownedAttributesLoop;
						}
					}

					allExtendedEClasses.add(eClassifier);
				}
			}
		}

		for (Iterator generalizations = stereotype.getGeneralizations()
			.iterator(); generalizations.hasNext();) {

			Classifier general = ((Generalization) generalizations.next())
				.getGeneral();

			if (Stereotype.class.isInstance(general)) {
				getAllExtendedEClassesHelper((Stereotype) general,
					allExtendedEClasses);
			}
		}
	}

	/**
	 * Applies the specified stereotype to the specified element.
	 * 
	 * @param stereotype
	 *            The stereotype to be applied.
	 * @param element
	 *            The element to which to apply the stereotype.
	 * @throws IllegalArgumentException
	 *             If the stereotype is already applied or is not applicable to
	 *             the element.
	 */
	public static void apply(Stereotype stereotype, Element element) {

		if (null == element) {
			throw new IllegalArgumentException(String.valueOf(element));
		}

		if (null == stereotype || isApplied(stereotype, element)
			|| !element.getApplicableStereotypes().contains(stereotype)) {

			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EClass eClass = getEClass(stereotype, ProfileOperations
			.getAppliedVersion(stereotype.getProfile(), element
				.getNearestPackage()));

		getEAnnotation(element, ANNOTATION_SOURCE__APPLIED_STEREOTYPES, true)
			.getContents().add(
				eClass.getEPackage().getEFactoryInstance().create(eClass));
	}

	/**
	 * Creates a(n) (required) extension of the specified Ecore class with the
	 * specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype with which to extend the Ecore class.
	 * @param eClass
	 *            The Ecore class to be extended.
	 * @param required
	 *            Whether the extension should be required.
	 * @return The new extension.
	 * @throws IllegalArgumentException
	 *             If the stereotype already extends (a subclass of) the Ecore
	 *             class.
	 * @deprecated Use createExtension(Stereotype, org.eclipse.uml2.Class,
	 *             boolean) instead.
	 */
	public static Extension createExtension(Stereotype stereotype,
			EClass eClass, boolean required) {

		if (null == stereotype) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		String name = stereotype.getName();

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		Profile profile = stereotype.getProfile();

		if (null == stereotype.getProfile()) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (null == eClass) {
			throw new IllegalArgumentException(String.valueOf(eClass));
		}

		for (Iterator extendedEClasses = stereotype.getAllExtendedEClasses()
			.iterator(); extendedEClasses.hasNext();) {

			if (eClass.isSuperTypeOf((EClass) extendedEClasses.next())) {
				throw new IllegalArgumentException(String.valueOf(eClass));
			}
		}

		org.eclipse.uml2.Class class_ = null;
		String eClassName = eClass.getName();

		for (Iterator referencedMetaclasses = profile
			.getReferencedMetaclasses().iterator(); referencedMetaclasses
			.hasNext();) {

			org.eclipse.uml2.Class referencedMetaclass = (org.eclipse.uml2.Class) referencedMetaclasses
				.next();

			if (eClassName.equals(referencedMetaclass.getName())) {
				class_ = referencedMetaclass;
				break;
			}
		}

		if (null == class_) {

			for (Iterator referencedMetamodels = profile
				.getReferencedMetamodels().iterator(); referencedMetamodels
				.hasNext();) {

				Type type = ((Model) referencedMetamodels.next())
					.getOwnedType(eClassName);

				if (org.eclipse.uml2.Class.class.isInstance(type)) {
					class_ = (org.eclipse.uml2.Class) type;
					break;
				}
			}
		}

		if (null == class_) {
			throw new IllegalArgumentException(String.valueOf(eClass));
		}

		String className = class_.getName();
		Extension extension = (Extension) profile
			.createOwnedMember(UML2Package.Literals.EXTENSION);

		extension.setName(className + '_' + name);

		ExtensionEnd extensionEnd = (ExtensionEnd) extension
			.createOwnedEnd(UML2Package.Literals.EXTENSION_END);

		extensionEnd.setName(STEREOTYPE_EXTENSION_ROLE_PREFIX + name);
		extensionEnd.setAggregation(AggregationKind.COMPOSITE_LITERAL);
		extensionEnd.setType(stereotype);

		if (!required) {
			extensionEnd.createLowerValue(UML2Package.Literals.LITERAL_INTEGER);
		}

		Property property = stereotype
			.createOwnedAttribute(UML2Package.Literals.PROPERTY);

		property.setName(METACLASS_EXTENSION_ROLE_PREFIX + className);
		property.setType(class_);
		property.setAssociation(extension);

		return extension;
	}

	/**
	 * Retrieves the set of stereotypes that are applicable to the specified
	 * element, including those are required and/or may already be applied.
	 * 
	 * @param element
	 *            The element for which to retrieve applicable stereotypes.
	 * @return The stereotypes applicable to the element.
	 */
	public static Set getApplicableStereotypes(Element element) {
		Set applicableStereotypes = new HashSet();

		if (null == element) {
			return applicableStereotypes;
		}

		org.eclipse.uml2.Package package_ = element.getNearestPackage();

		if (null == package_) {
			return applicableStereotypes;
		}

		for (Iterator allAppliedProfiles = package_.getAllAppliedProfiles()
			.iterator(); allAppliedProfiles.hasNext();) {

			Profile profile = (Profile) allAppliedProfiles.next();
			String appliedVersion = package_.getAppliedVersion(profile);

			for (Iterator ownedStereotypes = profile.getOwnedStereotypes()
				.iterator(); ownedStereotypes.hasNext();) {

				Stereotype stereotype = (Stereotype) ownedStereotypes.next();

				if (!stereotype.isAbstract()
					&& null != getEClass(stereotype, appliedVersion)) {

					for (Iterator extendedMetaclasses = stereotype
						.getAllExtendedMetaclasses().iterator(); extendedMetaclasses
						.hasNext();) {

						EClass eClass = getEClass((org.eclipse.uml2.Class) extendedMetaclasses
							.next());

						if (null != eClass && eClass.isInstance(element)) {
							applicableStereotypes.add(stereotype);
							break;
						}
					}
				}
			}
		}

		return applicableStereotypes;
	}

	/**
	 * Retrieves the stereotype with the specified qualified name that is
	 * applicable to the specified element, or <code>null</code> if no such
	 * stereotype exists.
	 * 
	 * @param element
	 *            The element for which to retrieve the applicable stereotype.
	 * @param qualifiedStereotypeName
	 *            The qualified name of the applicable stereotype to retrieve.
	 * @return The applicable stereotype with the specified qualified name.
	 */
	public static Stereotype getApplicableStereotype(Element element,
			String qualifiedStereotypeName) {

		if (null == element || isEmpty(qualifiedStereotypeName)) {
			return null;
		}

		for (Iterator applicableStereotypes = element
			.getApplicableStereotypes().iterator(); applicableStereotypes
			.hasNext();) {

			Stereotype applicableStereotype = (Stereotype) applicableStereotypes
				.next();

			if (qualifiedStereotypeName.equals(applicableStereotype
				.getQualifiedName())) {

				return applicableStereotype;
			}
		}

		return null;
	}

	/**
	 * Retrieves the set of stereotypes applied to the specified element.
	 * 
	 * @param element
	 *            The element for which to retrieve applied stereotypes.
	 * @return The stereotypes applied to the element.
	 */
	public static Set getAppliedStereotypes(Element element) {
		Set appliedStereotypes = new HashSet();

		if (null == element) {
			return appliedStereotypes;
		}

		for (Iterator allApplicableStereotypes = element
			.getApplicableStereotypes().iterator(); allApplicableStereotypes
			.hasNext();) {

			Stereotype stereotype = (Stereotype) allApplicableStereotypes
				.next();

			if (isApplied(stereotype, element)) {
				appliedStereotypes.add(stereotype);
			}
		}

		return appliedStereotypes;
	}

	/**
	 * Retrieves the set of substereotypes of the specified superstereotype that
	 * are applied to the specified element.
	 * 
	 * @param element
	 *            The element for which to retrieve applied (sub)stereotypes.
	 * @param superstereotype
	 *            The superstereotype of the applied (sub)stereotypes to
	 *            retrieve.
	 * @return The (sub)stereotypes applied to the element.
	 */
	public static Set getAppliedSubstereotypes(Element element,
			Stereotype superstereotype) {
		Set appliedSubstereotypes = new HashSet();

		if (null == element) {
			return appliedSubstereotypes;
		}

		for (Iterator appliedStereotypes = element.getAppliedStereotypes()
			.iterator(); appliedStereotypes.hasNext();) {

			Stereotype stereotype = (Stereotype) appliedStereotypes.next();

			if (stereotype.allParents().contains(superstereotype)) {
				appliedSubstereotypes.add(stereotype);
			}
		}

		return appliedSubstereotypes;
	}

	/**
	 * Retrieves the stereotype with the specified qualified name that is
	 * applied to the specified element, or <code>null</code> if no such
	 * stereotype is applied.
	 * 
	 * @param element
	 *            The element for which to retrieve the applied stereotype.
	 * @param qualifiedStereotypeName
	 *            The qualified name of the applied stereotype to retrieve.
	 * @return The applied stereotype with the specified qualified name.
	 */
	public static Stereotype getAppliedStereotype(Element element,
			String qualifiedStereotypeName) {

		if (null == element || isEmpty(qualifiedStereotypeName)) {
			return null;
		}

		for (Iterator appliedStereotypes = element.getAppliedStereotypes()
			.iterator(); appliedStereotypes.hasNext();) {

			Stereotype appliedStereotype = (Stereotype) appliedStereotypes
				.next();

			if (qualifiedStereotypeName.equals(appliedStereotype
				.getQualifiedName())) {

				return appliedStereotype;
			}
		}

		return null;
	}

	/**
	 * Retrieves the substereotype (of the specified superstereotype) with the
	 * specified qualified name that is applied to the specified element, or
	 * <code>null</code> if no such stereotype is applied.
	 * 
	 * @param element
	 *            The element for which to retrieve the applied (sub)stereotype.
	 * @param superstereotype
	 *            The superstereotype of the applied (sub)stereotype to
	 *            retrieve.
	 * @param qualifiedStereotypeName
	 *            The qualified name of the applied (sub)stereotype to retrieve.
	 * @return The applied (sub)stereotype with the specified qualified name.
	 */
	public static Stereotype getAppliedSubstereotype(Element element,
			Stereotype superstereotype, String qualifiedStereotypeName) {

		if (null == element || isEmpty(qualifiedStereotypeName)) {
			return null;
		}

		for (Iterator appliedSubstereotypes = element.getAppliedSubstereotypes(
			superstereotype).iterator(); appliedSubstereotypes.hasNext();) {

			Stereotype appliedSubstereotype = (Stereotype) appliedSubstereotypes
				.next();

			if (qualifiedStereotypeName.equals(appliedSubstereotype
				.getQualifiedName())) {

				return appliedSubstereotype;
			}
		}

		return null;
	}

	/**
	 * Retrieves the version of the specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype whose version is to be retrieved.
	 * @return The version of the stereotype, or <code>null</code> if
	 *         undefined.
	 */
	public static String getVersion(Stereotype stereotype) {

		if (null == stereotype) {
			return null;
		}

		return ProfileOperations.getVersion(stereotype.getProfile());
	}

	/**
	 * Retrieves the version of the specified stereotype that is applied to the
	 * specified element.
	 * 
	 * @param stereotype
	 *            The stereotype whose applied version to retrieve.
	 * @param element
	 *            The element for which to retrieve the stereotype version.
	 * @return The version of the stereotype, or <code>null</code> if not
	 *         applied.
	 */
	public static String getAppliedVersion(Stereotype stereotype,
			Element element) {

		if (isApplied(stereotype, element)) {
			return ProfileOperations.getAppliedVersion(stereotype.getProfile(),
				element.getNearestPackage());
		}

		return null;
	}

	/**
	 * Retrieves the value of the property with the specified name from the
	 * specified stereotype application for the specified element.
	 * 
	 * @param stereotype
	 *            The stereotype whose application contains the property.
	 * @param element
	 *            The element for which to retrieve the value.
	 * @param propertyName
	 *            The name of the property whose value to retrieve.
	 * @return The value of the applied stereotype property.
	 * @throws IllegalArgumentException
	 *             If the stereotype is not applied to the element or the
	 *             property does not exist.
	 */
	public static Object getValue(Stereotype stereotype, Element element,
			String propertyName) {

		if (null == stereotype || !isApplied(stereotype, element)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (isEmpty(propertyName)) {
			throw new IllegalArgumentException(String.valueOf(propertyName));
		}

		EClass eClass = getEClass(stereotype, getAppliedVersion(stereotype,
			element));

		EObject eObject = getEObject(stereotype, element);

		String[] tokens = propertyName.split(NamedElement.SEPARATOR);

		for (int i = 0, length = tokens.length; i < length; i++) {
			String token = tokens[i];

			EStructuralFeature eStructuralFeature = null;
			int index = -1;

			if (-1 == token.indexOf('[')) {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(token));
			} else {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(token.substring(
						0, token.indexOf('['))));

				try {
					index = Integer.parseInt(token.substring(
						token.indexOf('[') + 1, token.indexOf(']')));
				} catch (Exception e) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}
			}

			if (null == eStructuralFeature) {
				throw new IllegalArgumentException(String.valueOf(propertyName));
			}

			if (i + 1 < length) {

				if (null == eObject
					|| !EClass.class.isInstance(eStructuralFeature.getEType())) {

					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				eClass = (EClass) eStructuralFeature.getEType();

				eObject = (EObject) (eStructuralFeature.isMany()
					? ((List) eObject.eGet(eStructuralFeature)).get(index)
					: eObject.eGet(eStructuralFeature));
			} else {

				if (null == eObject && stereotype != getStereotype(eClass)) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				Object value = null;

				if (eStructuralFeature.isMany()) {
					List list = null == eObject
						? Collections.EMPTY_LIST
						: (List) eObject.eGet(eStructuralFeature);

					value = -1 == index
						? list
						: list.get(index);
				} else {
					value = null == eObject
						? eStructuralFeature.getDefaultValue()
						: eObject.eGet(eStructuralFeature);
				}

				if (EcorePackage.eINSTANCE.getEEnum().isInstance(
					eStructuralFeature.getEType())
					&& EEnumLiteral.class.isInstance(value)) {

					value = getEnumerationLiteral((EEnumLiteral) value);
				}

				return value;
			}
		}

		return null;
	}

	/**
	 * Determines whether the specified stereotype is applied to the specified
	 * element.
	 * 
	 * @param stereotype
	 *            The stereotype to test for application.
	 * @param element
	 *            The element for which to determine stereotype application.
	 * @return <code>true</code> if the stereotype is applied to the element;
	 *         <code>false</code> otherwise.
	 */
	public static boolean isApplied(Stereotype stereotype, Element element) {

		if (null == stereotype || null == element) {
			return false;
		}

		org.eclipse.uml2.Package nearestPackage = element.getNearestPackage();

		if (null != nearestPackage) {

			if (null != getEObject(stereotype, element)) {
				return true;
			}

			String appliedVersion = nearestPackage.getAppliedVersion(stereotype
				.getProfile());

			if (null != appliedVersion) {
				return isRequired(stereotype, element)
					&& null != getEClass(stereotype, appliedVersion);
			}
		}

		return false;
	}

	/**
	 * Determines whether the specified stereotype is required for the specified
	 * element.
	 * 
	 * @param stereotype
	 *            The stereotype to test for requirement.
	 * @param element
	 *            The element for which to determine stereotype requirement.
	 * @return <code>true</code> if the stereotype is required for the
	 *         element; <code>false</code> otherwise.
	 */
	public static boolean isRequired(Stereotype stereotype, Element element) {

		if (null == stereotype) {
			return false;
		}

		if (null == element) {
			return false;
		}

		for (Iterator ownedAttributes = stereotype.getOwnedAttributes()
			.iterator(); ownedAttributes.hasNext();) {

			Property property = (Property) ownedAttributes.next();
			Type type = property.getType();

			if (org.eclipse.uml2.Class.class.isInstance(type)) {
				Association association = property.getAssociation();

				if (Extension.class.isInstance(association)) {
					EClassifier eClassifier = UML2Package.eINSTANCE
						.getEClassifier(type.getName());

					if (EClass.class.isInstance(eClassifier)
						&& ((EClass) eClassifier).isInstance(element)) {

						return ((Extension) association).isRequired();
					}
				}
			}
		}

		return false;
	}

	/**
	 * Sets the value of the property with the specified name in the specified
	 * stereotype application for the specified element.
	 * 
	 * @param stereotype
	 *            The stereotype whose application contains the property.
	 * @param element
	 *            The element for which to set the value.
	 * @param propertyName
	 *            The name of the property whose value to set.
	 * @param value
	 *            The new value of the applied stereotype property.
	 * @throws IllegalArgumentException
	 *             If the stereotype is not applied to the element or the
	 *             property does not exist.
	 */
	public static void setValue(Stereotype stereotype, Element element,
			String propertyName, Object value) {

		if (null == stereotype || !isApplied(stereotype, element)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (isEmpty(propertyName)) {
			throw new IllegalArgumentException(String.valueOf(propertyName));
		}

		EClass eClass = getEClass(stereotype, getAppliedVersion(stereotype,
			element));

		EObject stereotypeEObject = getEObject(stereotype, element);

		if (null == stereotypeEObject) {
			stereotypeEObject = eClass.getEPackage().getEFactoryInstance()
				.create(eClass);
		}

		EObject eObject = stereotypeEObject;

		String[] tokens = propertyName.split(NamedElement.SEPARATOR);

		for (int i = 0, length = tokens.length; i < length; i++) {
			String token = tokens[i];

			EStructuralFeature eStructuralFeature = null;
			int index = -1;

			if (-1 == token.indexOf('[')) {
				eStructuralFeature = eClass.getEStructuralFeature(token);
			} else {
				eStructuralFeature = eClass.getEStructuralFeature(token
					.substring(0, token.indexOf('[')));

				try {
					index = Integer.parseInt(token.substring(
						token.indexOf('[') + 1, token.indexOf(']')));
				} catch (Exception e) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}
			}

			if (null == eStructuralFeature) {
				throw new IllegalArgumentException(String.valueOf(propertyName));
			}

			EClassifier eType = eStructuralFeature.getEType();

			if (i + 1 < length) {

				if (!EClass.class.isInstance(eType)) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				eClass = (EClass) eType;

				if (eStructuralFeature.isMany()) {
					List list = (List) eObject.eGet(eStructuralFeature);

					for (int j = list.size(); j <= index; j++) {
						list.add(j, eClass.getEPackage().getEFactoryInstance()
							.create(eClass));
					}

					eObject = (EObject) list.get(index);
				} else {

					if (null == eObject.eGet(eStructuralFeature)) {
						eObject.eSet(eStructuralFeature, eClass.getEPackage()
							.getEFactoryInstance().create(eClass));
					}

					eObject = (EObject) eObject.eGet(eStructuralFeature);
				}
			} else {

				if (null != value) {

					if (EcorePackage.eINSTANCE.getEClass().isInstance(eType)) {
						EClass eClassType = (EClass) eType;

						if (value instanceof List) {

							for (Iterator j = ((List) value).iterator(); j
								.hasNext();) {

								if (!eClassType.isInstance(j.next())) {
									throw new IllegalArgumentException(String
										.valueOf(value));
								}
							}
						} else if (!eClassType.isInstance(value)) {
							throw new IllegalArgumentException(String
								.valueOf(value));
						}
					} else if (EcorePackage.eINSTANCE.getEDataType()
						.isInstance(eType)) {

						EDataType eDataType = (EDataType) eType;
						EFactory eFactoryInstance = eDataType.getEPackage()
							.getEFactoryInstance();

						if (value instanceof List) {
							value = new ArrayList((List) value);

							if (EcorePackage.eINSTANCE.getEEnum().isInstance(
								eType)) {

								EEnum eEnum = (EEnum) eDataType;

								for (ListIterator li = ((List) value)
									.listIterator(); li.hasNext();) {

									Object item = li.next();

									if (item instanceof EnumerationLiteral) {
										li.set(eEnum.getEEnumLiteral(
											((EnumerationLiteral) item)
												.getName()).getInstance());
									}
								}
							}

							for (ListIterator li = ((List) value)
								.listIterator(); li.hasNext();) {

								Object item = li.next();

								if (item instanceof String) {

									try {
										li.set(eFactoryInstance
											.createFromString(eDataType,
												(String) item));
									} catch (Exception e) {
										// ignore
									}
								}
							}
						} else {

							if (EcorePackage.eINSTANCE.getEEnum().isInstance(
								eType)) {

								EEnum eEnum = (EEnum) eDataType;

								if (value instanceof EnumerationLiteral) {
									value = eEnum.getEEnumLiteral(
										((EnumerationLiteral) value).getName())
										.getInstance();
								}
							}

							if (value instanceof String) {

								try {
									value = eFactoryInstance.createFromString(
										eDataType, (String) value);
								} catch (Exception e) {
									// ignore
								}
							}
						}
					}
				}

				if (null == value) {
					value = eStructuralFeature.getDefaultValue();
				}

				if (eStructuralFeature.isMany()) {

					if (-1 == index) {

						if (value instanceof List) {
							eObject.eSet(eStructuralFeature, value);
						} else {
							throw new IllegalArgumentException(String
								.valueOf(value));
						}
					} else {
						List list = (List) eObject.eGet(eStructuralFeature);

						for (int j = list.size(); j < index; j++) {
							list.add(j, eStructuralFeature.getDefaultValue());
						}

						if (index == list.size()) {
							list.add(index, value);
						} else {
							list.set(index, value);
						}
					}

				} else {
					eObject.eSet(eStructuralFeature, value);
				}

				if (null == getEObject(stereotype, element)) {
					getEAnnotation(element,
						ANNOTATION_SOURCE__APPLIED_STEREOTYPES, true)
						.getContents().add(stereotypeEObject);
				}
			}
		}
	}

	/**
	 * Determines whether the specified element has a (non-default) value for
	 * the property with the specified name in the specified stereotype
	 * application.
	 * 
	 * @param stereotype
	 *            The stereotype whose application contains the property.
	 * @param element
	 *            The element for which to test the value.
	 * @param propertyName
	 *            The name of the property whose value to test.
	 * @return <code>true</code> if the applied stereotype property has a
	 *         (non-default) value; <code>false</code> otherwise.
	 */
	public static boolean hasValue(Stereotype stereotype, Element element,
			String propertyName) {

		if (null == stereotype || !isApplied(stereotype, element)) {
			return false;
		}

		if (isEmpty(propertyName)) {
			return false;
		}

		EClass eClass = getEClass(stereotype, getAppliedVersion(stereotype,
			element));

		EObject eObject = getEObject(stereotype, element);

		String[] tokens = propertyName.split(NamedElement.SEPARATOR);

		for (int i = 0, length = tokens.length; i < length; i++) {
			String token = tokens[i];

			EStructuralFeature eStructuralFeature = null;
			int index = -1;

			if (-1 == token.indexOf('[')) {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(token));
			} else {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(token.substring(
						0, token.indexOf('['))));

				try {
					index = Integer.parseInt(token.substring(
						token.indexOf('[') + 1, token.indexOf(']')));
				} catch (Exception e) {
					return false;
				}
			}

			if (null == eStructuralFeature) {
				return false;
			}

			if (i + 1 < length) {

				if (null == eObject
					|| !EClass.class.isInstance(eStructuralFeature.getEType())) {

					return false;
				}

				eClass = (EClass) eStructuralFeature.getEType();

				eObject = (EObject) (eStructuralFeature.isMany()
					? ((List) eObject.eGet(eStructuralFeature)).get(index)
					: eObject.eGet(eStructuralFeature));
			} else {

				if (null == eObject && stereotype != getStereotype(eClass)) {
					return false;
				}

				if (eStructuralFeature.isMany()) {
					List list = null == eObject
						? Collections.EMPTY_LIST
						: (List) eObject.eGet(eStructuralFeature);

					return -1 == index
						? !list.isEmpty()
						: !safeEquals(eStructuralFeature.getDefaultValue(),
							list.get(index));
				} else {
					return null == eObject
						? false
						: !safeEquals(eStructuralFeature.getDefaultValue(),
							eObject.eGet(eStructuralFeature));
				}
			}
		}

		return false;
	}

	/**
	 * Unapplies the specified stereotype from the specified element.
	 * 
	 * @param stereotype
	 *            The stereotype to be unapplied.
	 * @param element
	 *            The element from which to unapply the stereotype.
	 * @throws IllegalArgumentException
	 *             If the stereotype is required or is not applied to the
	 *             element.
	 */
	public static void unapply(Stereotype stereotype, Element element) {

		if (null == stereotype || isRequired(stereotype, element)
			|| !isApplied(stereotype, element)) {

			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EAnnotation appliedStereotypesEAnnotation = safeGetEAnnotation(element,
			ANNOTATION_SOURCE__APPLIED_STEREOTYPES);
		EList appliedStereotypesEAnnotationContents = appliedStereotypesEAnnotation
			.getContents();

		for (Iterator i = appliedStereotypesEAnnotationContents.iterator(); i
			.hasNext();) {

			if (stereotype == getStereotype((EObject) i.next())) {
				i.remove();
			}
		}

		if (appliedStereotypesEAnnotationContents.isEmpty()) {
			element.getEAnnotations().remove(appliedStereotypesEAnnotation);
		}
	}

	/**
	 * Retrieves the profile that owns the specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the profile.
	 * @return The profile that owns the stereotype.
	 */
	public static Profile getProfile(Stereotype stereotype) {

		if (null != stereotype) {
			org.eclipse.uml2.Package package_ = stereotype.getPackage();

			if (package_ instanceof Profile) {
				return (Profile) package_;
			}
		}

		return null;
	}

	/**
	 * Retrieves the localized keyword for the specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the localized keyword.
	 * @return The localized keyword for the stereotype.
	 */
	public static String getKeyword(Stereotype stereotype) {
		return getKeyword(stereotype, true);
	}

	/**
	 * Retrieves the keyword for the specified stereotype, localized if
	 * indicated.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the (localized) keyword.
	 * @param localize
	 *            Whether the keyword should be localized.
	 * @return The (localized) keyword for the stereotype.
	 */
	public static String getKeyword(Stereotype stereotype, boolean localize) {
		String keyword = EMPTY_STRING;

		if (null != stereotype) {
			keyword = getString(stereotype, getValidJavaIdentifier(stereotype
				.getQualifiedName().replace(':', '_')), EMPTY_STRING, localize);

			if (isEmpty(keyword)) {
				String identifier = getValidJavaIdentifier(stereotype.getName());

				keyword = identifier.length() > 0
					? Character.toLowerCase(identifier.charAt(0))
						+ identifier.substring(1)
					: identifier;
			}
		}

		return keyword;
	}

	protected static EClass getEClass(org.eclipse.uml2.Class metaclass) {
		return (EClass) UML2Package.eINSTANCE.getEClassifier(metaclass
			.getName());
	}

	/**
	 * Creates a(n) (required) extension of the specified metaclass with the
	 * specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype with which to extend the metaclass.
	 * @param metaclass
	 *            The metaclass to be extended.
	 * @param required
	 *            Whether the extension should be required.
	 * @return The new extension.
	 * @throws IllegalArgumentException
	 *             If the stereotype or any of its super(stereo)types already
	 *             extends the metaclass.
	 */
	public static Extension createExtension(Stereotype stereotype,
			org.eclipse.uml2.Class metaclass, boolean required) {

		if (null == stereotype) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		String name = stereotype.getName();

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		Profile profile = stereotype.getProfile();

		if (null == profile) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (null == metaclass || !metaclass.isMetaclass()
			|| stereotype.getAllExtendedMetaclasses().contains(metaclass)) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

		if (!profile.getReferencedMetaclasses().contains(metaclass)
			&& !profile.getReferencedMetamodels()
				.contains(metaclass.getModel())) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

		String metaclassName = metaclass.getName();
		Extension extension = (Extension) profile
			.createOwnedMember(UML2Package.Literals.EXTENSION);

		extension.setName(metaclassName + '_' + name);

		ExtensionEnd extensionEnd = (ExtensionEnd) extension
			.createOwnedEnd(UML2Package.Literals.EXTENSION_END);

		extensionEnd.setName(STEREOTYPE_EXTENSION_ROLE_PREFIX + name);
		extensionEnd.setAggregation(AggregationKind.COMPOSITE_LITERAL);
		extensionEnd.setType(stereotype);

		if (!required) {
			extensionEnd.createLowerValue(UML2Package.Literals.LITERAL_INTEGER);
		}

		Property property = stereotype
			.createOwnedAttribute(UML2Package.Literals.PROPERTY);

		property.setName(METACLASS_EXTENSION_ROLE_PREFIX + metaclassName);
		property.setType(metaclass);
		property.setAssociation(extension);

		return extension;
	}

	protected static Set getExtendedMetaclassesHelper(Stereotype stereotype,
			Set extendedMetaclasses) {

		for (Iterator ownedAttributes = stereotype.getOwnedAttributes()
			.iterator(); ownedAttributes.hasNext();) {

			Property property = (Property) ownedAttributes.next();
			Type type = property.getType();

			if (org.eclipse.uml2.Class.class.isInstance(type)
				&& Extension.class.isInstance(property.getAssociation())) {

				extendedMetaclasses.add(type);
			}
		}

		return extendedMetaclasses;
	}

	/**
	 * Retrieves the metaclasses extended by the specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the extended metaclasses.
	 * @return The metaclasses extended by the stereotype.
	 */
	public static Set getExtendedMetaclasses(Stereotype stereotype) {
		Set extendedMetaclasses = new HashSet();

		if (null != stereotype) {
			getExtendedMetaclassesHelper(stereotype, extendedMetaclasses);
		}

		return extendedMetaclasses;
	}

	/**
	 * Retrieves the metaclasses extended by the specified stereotype, including
	 * the metaclasses extended by its super(stereo)types.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the extended metaclasses.
	 * @return The metaclasses extended by the specified stereotype and its
	 *         super(stereo)types.
	 */
	public static Set getAllExtendedMetaclasses(Stereotype stereotype) {
		Set allExtendedMetaclasses = new HashSet();

		if (null != stereotype) {
			getExtendedMetaclassesHelper(stereotype, allExtendedMetaclasses);

			for (Iterator allParents = stereotype.allParents().iterator(); allParents
				.hasNext();) {

				Classifier parent = (Classifier) allParents.next();

				if (Stereotype.class.isInstance(parent)) {
					getExtendedMetaclassesHelper((Stereotype) parent,
						allExtendedMetaclasses);
				}
			}
		}

		return allExtendedMetaclasses;
	}

} // StereotypeOperations
