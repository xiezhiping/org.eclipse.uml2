/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: StereotypeOperations.java,v 1.3 2004/04/27 13:56:09 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.uml2.AggregationKind;
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
 * A static utility class that provides operations related to stereotypes.
 */
public final class StereotypeOperations
	extends UML2Operations {

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

	/**
	 * Constructs a new Streotype Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
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
		return (EClass) ProfileOperations.getEPackage(stereotype.getProfile(),
			version).getEClassifier(
			ProfileOperations.getEClassifierName(stereotype));
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

		for (Iterator contents = getEAnnotation(
			ANNOTATION_SOURCE__APPLIED_STEREOTYPES, element).getContents()
			.iterator(); contents.hasNext();) {

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
		return (Stereotype) getEAnnotation(ANNOTATION_SOURCE__STEREOTYPE,
			eObject.eClass()).getReferences().get(0);
	}

	/**
	 * Retrieves the enumeration literal represented by the specified Ecore
	 * enum literal.
	 * 
	 * @param eEnumLiteral
	 *            The Ecore enum literal for which to retrieve the enumeration
	 *            literal.
	 * @return The enumeration literal represented by the Ecore enum literal.
	 */
	public static EnumerationLiteral getEnumerationLiteral(
			EEnumLiteral eEnumLiteral) {
		return (EnumerationLiteral) getEAnnotation(
			ANNOTATION_SOURCE__ENUMERATION_LITERAL, eEnumLiteral)
			.getReferences().get(0);
	}

	/**
	 * Retrieves the set of Ecore classes extended by the specified stereotype,
	 * including the Ecore classes extended by its super(stereo)types.
	 * 
	 * @param stereotype
	 *            The stereotype for which to retrieve the Ecore classes.
	 * @return The Ecore classes extended by the stereotype.
	 */
	public static Set getExtendedEClasses(Stereotype stereotype) {
		Set extendedEClasses = new HashSet();

		getExtendedEClassesHelper(stereotype, extendedEClasses);

		return extendedEClasses;
	}

	/**
	 * Adds the Ecore classes extended by the specified stereotype, including
	 * the Ecore classes extended by its super(stereo)types, to the specified
	 * set.
	 * 
	 * @param stereotype
	 *            The stereotype for which to add the Ecore classes.
	 * @param extendedEClasses
	 *            The set to which to add the Ecore classes.
	 */
	protected static void getExtendedEClassesHelper(Stereotype stereotype,
			Set extendedEClasses) {

		ownedAttributesLoop: for (Iterator ownedAttributes = stereotype
			.getOwnedAttributes().iterator(); ownedAttributes.hasNext();) {

			Property property = (Property) ownedAttributes.next();

			if (org.eclipse.uml2.Class.class.isInstance(property.getType())
				&& Extension.class.isInstance(property.getAssociation())) {

				EClassifier eClassifier = UML2Package.eINSTANCE
					.getEClassifier(property.getType().getName());

				if (EClass.class.isInstance(eClassifier)) {

					for (Iterator eClasses = extendedEClasses.iterator(); eClasses
						.hasNext();) {

						EClass eClass = (EClass) eClasses.next();

						if (((EClass) eClassifier).isSuperTypeOf(eClass)) {
							continue ownedAttributesLoop;
						}
					}

					extendedEClasses.add(eClassifier);
				}
			}
		}

		for (Iterator generalizations = stereotype.getGeneralizations()
			.iterator(); generalizations.hasNext();) {

			Generalization generalization = (Generalization) generalizations
				.next();

			if (Stereotype.class.isInstance(generalization.getGeneral())) {
				getExtendedEClassesHelper((Stereotype) generalization
					.getGeneral(), extendedEClasses);
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

		if (null == stereotype || isApplied(stereotype, element)
			|| !getApplicableStereotypes(element).contains(stereotype)) {

			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EClass eClass = getEClass(stereotype, ProfileOperations
			.getAppliedVersion(stereotype.getProfile(), element
				.getNearestPackage()));

		getOrCreateEAnnotation(ANNOTATION_SOURCE__APPLIED_STEREOTYPES, element)
			.getContents().add(
				eClass.getEPackage().getEFactoryInstance().create(eClass));
	}

	/**
	 * Creates a(n) (required) extension of the specified metaclass with the
	 * specified stereotype.
	 * 
	 * @param stereotype
	 *            The stereotype with which to extend the metaclass.
	 * @param eClass
	 *            The metaclass to be extended.
	 * @param required
	 *            Whether the extension should be required.
	 * @return The new extension.
	 * @throws IllegalArgumentException
	 *             If the stereotype already extends the metaclass.
	 */
	public static Extension createExtension(Stereotype stereotype,
			EClass eClass, boolean required) {

		if (null == stereotype || isEmpty(stereotype.getName())
			|| null == stereotype.getProfile()) {

			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (null == eClass) {
			throw new IllegalArgumentException(String.valueOf(eClass));
		}

		for (Iterator extendedEClasses = getExtendedEClasses(stereotype)
			.iterator(); extendedEClasses.hasNext();) {

			if (eClass.isSuperTypeOf((EClass) extendedEClasses.next())) {
				throw new IllegalArgumentException(String.valueOf(eClass));
			}
		}

		org.eclipse.uml2.Class class_ = null;

		for (Iterator referencedMetaclasses = stereotype.getProfile()
			.getReferencedMetaclasses().iterator(); referencedMetaclasses
			.hasNext();) {

			org.eclipse.uml2.Class referencedMetaclass = (org.eclipse.uml2.Class) referencedMetaclasses
				.next();

			if (eClass.getName().equals(referencedMetaclass.getName())) {
				class_ = referencedMetaclass;
				break;
			}
		}

		if (null == class_) {

			for (Iterator referencedMetamodels = stereotype.getProfile()
				.getReferencedMetamodels().iterator(); referencedMetamodels
				.hasNext();) {

				Type type = ((Model) referencedMetamodels.next())
					.getOwnedType(eClass.getName());

				if (org.eclipse.uml2.Class.class.isInstance(type)) {
					class_ = (org.eclipse.uml2.Class) type;
					break;
				}
			}
		}

		if (null == class_) {
			throw new IllegalArgumentException(String.valueOf(eClass));
		}

		Extension extension = (Extension) stereotype.getPackage()
			.createOwnedMember(UML2Package.eINSTANCE.getExtension());

		extension.setName(class_.getName() + '_' + stereotype.getName());

		ExtensionEnd extensionEnd = (ExtensionEnd) extension
			.createOwnedEnd(UML2Package.eINSTANCE.getExtensionEnd());

		extensionEnd.setName(STEREOTYPE_EXTENSION_ROLE_PREFIX + stereotype.getName());
		extensionEnd.setAggregation(AggregationKind.COMPOSITE_LITERAL);
		extensionEnd.setType(stereotype);

		if (!required) {
			extensionEnd.createLowerValue(UML2Package.eINSTANCE
				.getLiteralInteger());
		}

		Property property = stereotype
			.createOwnedAttribute(UML2Package.eINSTANCE.getProperty());

		property.setName(METACLASS_EXTENSION_ROLE_PREFIX + class_.getName());
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

		if (null == element || null == element.getNearestPackage()) {
			return applicableStereotypes;
		}

		for (Iterator allAppliedProfiles = element.getNearestPackage()
			.getAllAppliedProfiles().iterator(); allAppliedProfiles.hasNext();) {

			Profile profile = (Profile) allAppliedProfiles.next();

			for (Iterator ownedStereotypes = profile.getOwnedStereotypes()
				.iterator(); ownedStereotypes.hasNext();) {

				Stereotype stereotype = (Stereotype) ownedStereotypes.next();

				if (!stereotype.isAbstract()
					&& null != getEClass(stereotype,
						ProfileOperations.getAppliedVersion(profile, element
							.getNearestPackage()))) {

					for (Iterator extendedEClasses = getExtendedEClasses(
						stereotype).iterator(); extendedEClasses.hasNext();) {

						if (((EClass) extendedEClasses.next())
							.isInstance(element)) {

							applicableStereotypes.add(stereotype);
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

		for (Iterator applicableStereotypes = getApplicableStereotypes(element)
			.iterator(); applicableStereotypes.hasNext();) {

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

		for (Iterator allApplicableStereotypes = getApplicableStereotypes(
			element).iterator(); allApplicableStereotypes.hasNext();) {

			Stereotype stereotype = (Stereotype) allApplicableStereotypes
				.next();

			if (isApplied(stereotype, element)) {
				appliedStereotypes.add(stereotype);
			}
		}

		return appliedStereotypes;
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

		for (Iterator appliedStereotypes = getAppliedStereotypes(element)
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

		for (StringTokenizer tokens = new StringTokenizer(propertyName,
			NamedElement.SEPARATOR); tokens.hasMoreTokens();) {

			String token = tokens.nextToken();

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

			if (tokens.hasMoreTokens()) {

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
				Object value = null;

				if (eStructuralFeature.isMany()) {
					List list = null == eObject
						? Collections.EMPTY_LIST : (List) eObject
							.eGet(eStructuralFeature);

					value = -1 == index
						? list : list.get(index);
				} else {
					value = null == eObject
						? eStructuralFeature.getDefaultValue() : eObject
							.eGet(eStructuralFeature);
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

		if (null == stereotype) {
			return false;
		}

		if (null == element) {
			return false;
		}

		if (isRequired(stereotype, element)
			&& null != element.getNearestPackage()) {

			return element.getNearestPackage().getAllAppliedProfiles()
				.contains(stereotype.getProfile());
		}

		return null != getEObject(stereotype, element);
	}

	/**
	 * Determines whether the specified stereotype is required for the
	 * specified element.
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

			if (org.eclipse.uml2.Class.class.isInstance(property.getType())
				&& Extension.class.isInstance(property.getAssociation())) {

				EClassifier eClassifier = UML2Package.eINSTANCE
					.getEClassifier(property.getType().getName());

				if (EClass.class.isInstance(eClassifier)
					&& ((EClass) eClassifier).isInstance(element)) {

					return ((Extension) property.getAssociation()).isRequired();
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

		for (StringTokenizer tokens = new StringTokenizer(propertyName,
			NamedElement.SEPARATOR); tokens.hasMoreTokens();) {

			String token = tokens.nextToken();

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

			if (tokens.hasMoreTokens()) {

				if (!EClass.class.isInstance(eStructuralFeature.getEType())) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				eClass = (EClass) eStructuralFeature.getEType();

				if (eStructuralFeature.isMany()) {
					List list = (List) eObject.eGet(eStructuralFeature);

					for (int i = list.size(); i <= index; i++) {
						list.add(i, eClass.getEPackage().getEFactoryInstance()
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

				if (EClass.class.isInstance(eStructuralFeature.getEType())) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				if (EcorePackage.eINSTANCE.getEEnum().isInstance(
					eStructuralFeature.getEType())
					&& EnumerationLiteral.class.isInstance(value)) {

					value = ((EEnum) eStructuralFeature.getEType())
						.getEEnumLiteral(((EnumerationLiteral) value).getName())
						.getInstance();
				}

				if (null == value) {
					value = eStructuralFeature.getDefaultValue();
				}

				if (eStructuralFeature.isMany()) {

					if (-1 == index) {
						throw new IllegalArgumentException(String
							.valueOf(propertyName));
					}

					List list = (List) eObject.eGet(eStructuralFeature);

					for (int i = list.size(); i < index; i++) {
						list.add(i, eStructuralFeature.getDefaultValue());
					}

					if (index == list.size()) {
						list.add(index, value);
					} else {
						list.set(index, value);
					}
				} else {
					eObject.eSet(eStructuralFeature, value);
				}

				if (null == getEObject(stereotype, element)) {
					getOrCreateEAnnotation(
						ANNOTATION_SOURCE__APPLIED_STEREOTYPES, element)
						.getContents().add(stereotypeEObject);
				}
			}
		}
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

		EAnnotation appliedStereotypesEAnnotation = getEAnnotation(
			ANNOTATION_SOURCE__APPLIED_STEREOTYPES, element);

		for (Iterator contents = appliedStereotypesEAnnotation.getContents()
			.iterator(); contents.hasNext();) {

			if (stereotype == getStereotype((EObject) contents.next())) {
				contents.remove();
			}
		}

		if (appliedStereotypesEAnnotation.getContents().isEmpty()) {
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
		return null == stereotype
			? null : (Profile) stereotype.getPackage();
	}

}