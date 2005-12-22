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
 * $Id: ElementOperations.java,v 1.12 2005/12/22 22:44:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ElementOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element may not directly or indirectly own itself.
	 * not self.allOwnedElements()->includes(self)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotOwnSelf(Element element,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ELEMENT__NOT_OWN_SELF,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotOwnSelf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(element, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{element}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements that must be owned must have an owner.
	 * self.mustBeOwned() implies owner->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasOwner(Element element,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ELEMENT__HAS_OWNER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHasOwner", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(element, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{element}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getStereotypeApplications(Element element) {
		EList stereotypeApplications = new UniqueEList();

		for (Iterator nonNavigableInverseReferences = CROSS_REFERENCE_ADAPTER
			.getNonNavigableInverseReferences(element).iterator(); nonNavigableInverseReferences
			.hasNext();) {

			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) nonNavigableInverseReferences
				.next();

			if (setting.getEStructuralFeature().getName().startsWith(
				Extension.METACLASS_ROLE_PREFIX)) {

				EObject eObject = setting.getEObject();

				if (getStereotype(eObject) != null) {
					stereotypeApplications.add(eObject);
				}
			}
		}

		return ECollections.unmodifiableEList(stereotypeApplications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EObject getStereotypeApplication(Element element,
			Stereotype stereotype) {

		for (Iterator stereotypeApplications = element
			.getStereotypeApplications().iterator(); stereotypeApplications
			.hasNext();) {

			EObject stereotypeApplication = (EObject) stereotypeApplications
				.next();

			if (getStereotype(stereotypeApplication) == stereotype) {
				return stereotypeApplication;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getRequiredStereotypes(Element element) {
		org.eclipse.uml2.uml.Package package_ = element.getNearestPackage();

		if (package_ != null) {
			EList requiredStereotypes = new UniqueEList();

			for (Iterator allAppliedProfiles = package_.getAllAppliedProfiles()
				.iterator(); allAppliedProfiles.hasNext();) {

				Profile profile = (Profile) allAppliedProfiles.next();

				for (Iterator ownedStereotypes = profile.getOwnedStereotypes()
					.iterator(); ownedStereotypes.hasNext();) {

					Stereotype stereotype = (Stereotype) ownedStereotypes
						.next();
					Extension extension = getExtension(element, stereotype);

					if (extension != null && extension.isRequired()) {
						requiredStereotypes.add(stereotype);
					}
				}

				return ECollections.unmodifiableEList(requiredStereotypes);
			}
		}

		return ECollections.EMPTY_ELIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Stereotype getRequiredStereotype(Element element,
			String qualifiedName) {

		for (Iterator requiredStereotypes = element.getRequiredStereotypes()
			.iterator(); requiredStereotypes.hasNext();) {

			Stereotype requiredStereotype = (Stereotype) requiredStereotypes
				.next();

			if (safeEquals(requiredStereotype.getQualifiedName(), qualifiedName)) {
				return requiredStereotype;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAppliedStereotypes(Element element) {
		EList appliedStereotypes = new UniqueEList();

		for (Iterator nonNavigableInverseReferences = CROSS_REFERENCE_ADAPTER
			.getNonNavigableInverseReferences(element).iterator(); nonNavigableInverseReferences
			.hasNext();) {

			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) nonNavigableInverseReferences
				.next();

			if (setting.getEStructuralFeature().getName().startsWith(
				Extension.METACLASS_ROLE_PREFIX)) {

				Stereotype stereotype = getStereotype(setting.getEObject());

				if (stereotype != null) {
					appliedStereotypes.add(stereotype);
				}
			}
		}

		return ECollections.unmodifiableEList(appliedStereotypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Stereotype getAppliedStereotype(Element element,
			String qualifiedName) {

		for (Iterator appliedStereotypes = element.getAppliedStereotypes()
			.iterator(); appliedStereotypes.hasNext();) {

			Stereotype appliedStereotype = (Stereotype) appliedStereotypes
				.next();

			if (safeEquals(appliedStereotype.getQualifiedName(), qualifiedName)) {
				return appliedStereotype;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAppliedSubstereotypes(Element element,
			Stereotype stereotype) {
		EList appliedSubstereotypes = new UniqueEList();

		for (Iterator appliedStereotypes = element.getAppliedStereotypes()
			.iterator(); appliedStereotypes.hasNext();) {

			Stereotype appliedStereotype = (Stereotype) appliedStereotypes
				.next();

			if (appliedStereotype.allParents().contains(stereotype)) {
				appliedSubstereotypes.add(appliedStereotype);
			}
		}

		return ECollections.unmodifiableEList(appliedSubstereotypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Stereotype getAppliedSubstereotype(Element element,
			Stereotype stereotype, String qualifiedName) {

		for (Iterator appliedSubstereotypes = element.getAppliedSubstereotypes(
			stereotype).iterator(); appliedSubstereotypes.hasNext();) {

			Stereotype appliedSubstereotype = (Stereotype) appliedSubstereotypes
				.next();

			if (safeEquals(appliedSubstereotype.getQualifiedName(),
				qualifiedName)) {

				return appliedSubstereotype;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean hasValue(Element element, Stereotype stereotype,
			String propertyName) {
		EObject eObject = element.getStereotypeApplication(stereotype);

		if (eObject != null && !isEmpty(propertyName)) {
			EClass eClass = eObject.eClass();
			String[] segments = propertyName.split(NamedElement.SEPARATOR);

			for (int i = 0, length = segments.length; i < length; i++) {
				String segment = segments[i];
				EStructuralFeature eStructuralFeature = null;
				int index = -1;

				if (segment.indexOf('[') == -1) {
					eStructuralFeature = eClass
						.getEStructuralFeature(getValidJavaIdentifier(segment));
				} else {
					eStructuralFeature = eClass
						.getEStructuralFeature(getValidJavaIdentifier(segment
							.substring(0, segment.indexOf('['))));

					try {
						index = Integer.parseInt(segment.substring(segment
							.indexOf('[') + 1, segment.indexOf(']')));
					} catch (Exception e) {
						return false;
					}
				}

				if (eStructuralFeature != null) {

					if (length > i + 1) {

						if (eObject != null) {
							EClassifier eType = eStructuralFeature.getEType();

							if (eType instanceof EClass) {
								eClass = (EClass) eType;

								eObject = (EObject) (eStructuralFeature
									.isMany()
									? ((List) eObject.eGet(eStructuralFeature))
										.get(index)
									: eObject.eGet(eStructuralFeature));
							}
						} else {
							return false;
						}
					} else {

						if (eObject != null
							|| getStereotype(eObject) == stereotype) {

							if (eStructuralFeature.isMany()) {
								List list = eObject == null
									? Collections.EMPTY_LIST
									: (List) eObject.eGet(eStructuralFeature);

								return index == -1
									? !list.isEmpty()
									: !safeEquals(eStructuralFeature
										.getDefaultValue(), list.get(index));
							} else {
								return eObject == null
									? false
									: !safeEquals(eStructuralFeature
										.getDefaultValue(), eObject
										.eGet(eStructuralFeature));
							}
						} else {
							return false;
						}
					}
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Object getValue(Element element, Stereotype stereotype,
			String propertyName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void setValue(Element element, Stereotype stereotype,
			String propertyName, Object newValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getKeywords(Element element) {
		EAnnotation eAnnotation = element.getEAnnotation(UMLPackage.eNS_URI);

		if (eAnnotation != null) {
			EMap details = eAnnotation.getDetails();

			if (!details.isEmpty()) {
				EList keywords = new UniqueEList();

				for (Iterator d = details.iterator(); d.hasNext();) {
					keywords.add(((Map.Entry) d).getKey());
				}

				return ECollections.unmodifiableEList(keywords);
			}
		}

		return ECollections.EMPTY_ELIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean addKeyword(Element element, String keyword) {
		EMap details = getEAnnotation(element, UMLPackage.eNS_URI, true)
			.getDetails();

		if (!details.containsKey(keyword)) {
			details.put(keyword, null);
			return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean removeKeyword(Element element, String keyword) {
		EAnnotation eAnnotation = element.getEAnnotation(UMLPackage.eNS_URI);

		if (eAnnotation != null) {
			EMap details = eAnnotation.getDetails();

			if (details.containsKey(keyword)) {
				details.removeKey(keyword);
				return true;
			}
		}

		return false;
	}

	protected static Element getOwningElement(Element element, EClass eClass,
			boolean resolve) {
		Element owningElement = null;

		for (Element owner = element; (owningElement = (Element) owner.eGet(
			UMLPackage.Literals.ELEMENT__OWNER, resolve)) != null
			&& !(eClass.isInstance(owningElement));) {

			owner = owner.getOwner();
		}

		return owningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static org.eclipse.uml2.uml.Package getNearestPackage(Element element) {
		return (org.eclipse.uml2.uml.Package) (element instanceof org.eclipse.uml2.uml.Package
			? element
			: getOwningElement(element, UMLPackage.Literals.PACKAGE, true));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Model getModel(Element element) {
		return (Model) (element instanceof Model
			? element
			: getOwningElement(element, UMLPackage.Literals.MODEL, true));
	}

	protected static Extension getExtension(Element element,
			Stereotype stereotype) {

		for (Iterator allAttributes = stereotype.getAllAttributes().iterator(); allAttributes
			.hasNext();) {

			Property attribute = (Property) allAttributes.next();
			Association association = attribute.getAssociation();

			if (association instanceof Extension) {
				Type type = attribute.getType();

				if (type instanceof org.eclipse.uml2.uml.Class) {
					EClassifier eClassifier = UMLPackage.eINSTANCE
						.getEClassifier(type.getName());

					if (eClassifier != null && eClassifier.isInstance(element)) {
						return (Extension) association;
					}
				}
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isStereotypeApplicable(Element element,
			Stereotype stereotype) {

		if (stereotype != null && !stereotype.isAbstract()) {
			Profile profile = stereotype.getProfile();

			if (profile != null && profile.getDefinition(stereotype) != null) {
				org.eclipse.uml2.uml.Package package_ = element
					.getNearestPackage();

				if (package_ != null
					&& package_.getAllAppliedProfiles().contains(profile)) {

					if (getExtension(element, stereotype) != null) {
						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isStereotypeRequired(Element element,
			Stereotype stereotype) {

		if (stereotype != null && !stereotype.isAbstract()) {
			Profile profile = stereotype.getProfile();

			if (profile != null && profile.getDefinition(stereotype) != null) {
				org.eclipse.uml2.uml.Package package_ = element
					.getNearestPackage();

				if (package_ != null
					&& package_.getAllAppliedProfiles().contains(profile)) {

					Extension extension = getExtension(element, stereotype);

					if (extension != null && extension.isRequired()) {
						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isStereotypeApplied(Element element,
			Stereotype stereotype) {
		return element.getStereotypeApplication(stereotype) != null;
	}

	protected static EObject applyStereotype(Element element,
			Stereotype stereotype, Resource resource) {
		EObject stereotypeApplication = stereotype.getProfile().create(
			stereotype);

		for (Iterator eAllStructuralFeatures = stereotypeApplication.eClass()
			.getEAllStructuralFeatures().iterator(); eAllStructuralFeatures
			.hasNext();) {

			EStructuralFeature eStructuralFeature = (EStructuralFeature) eAllStructuralFeatures
				.next();

			if (eStructuralFeature.getName().startsWith(
				Extension.METACLASS_ROLE_PREFIX)
				&& eStructuralFeature.getEType().isInstance(element)) {

				stereotypeApplication.eSet(eStructuralFeature, element);
			}
		}

		if (resource != null) {
			resource.getContents().add(stereotypeApplication);
		}

		return stereotypeApplication;
	}

	public static EList applyAllRequiredStereotypes(Element element) {
		EList stereotypeApplications = new UniqueEList();

		for (Iterator allContents = getAllContents(element, true, false); allContents
			.hasNext();) {

			EObject eObject = (EObject) allContents.next();

			if (eObject instanceof Element) {
				Element containedElement = (Element) eObject;

				for (Iterator rs = containedElement.getRequiredStereotypes()
					.iterator(); rs.hasNext();) {

					Stereotype stereotype = (Stereotype) rs.next();

					if (!containedElement.isStereotypeApplied(stereotype)) {
						stereotypeApplications.add(applyStereotype(
							containedElement, stereotype, element.eResource()));
					}
				}
			}

			return stereotypeApplications;
		}

		return ECollections.EMPTY_ELIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EObject applyStereotype(Element element, Stereotype stereotype) {

		if (stereotype == null || !element.isStereotypeApplicable(stereotype)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EObject stereotypeApplication = element
			.getStereotypeApplication(stereotype);

		if (stereotypeApplication != null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		return applyStereotype(element, stereotype, element.eResource());
	}

	public static EList unapplyAllNonApplicableStereotypes(Element element) {
		EList stereotypeApplications = new UniqueEList();

		for (Iterator allContents = getAllContents(element, true, false); allContents
			.hasNext();) {

			EObject eObject = (EObject) allContents.next();

			if (eObject instanceof Element) {
				Element containedElement = (Element) eObject;

				for (Iterator sa = containedElement.getStereotypeApplications()
					.iterator(); sa.hasNext();) {

					EObject stereotypeApplication = (EObject) sa.next();

					if (!containedElement
						.isStereotypeApplicable(getStereotype(stereotypeApplication))) {

						destroy(stereotypeApplication);

						stereotypeApplications.add(stereotypeApplication);
					}
				}
			}
		}

		return stereotypeApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EObject unapplyStereotype(Element element,
			Stereotype stereotype) {

		if (stereotype == null || element.isStereotypeRequired(stereotype)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EObject stereotypeApplication = element
			.getStereotypeApplication(stereotype);

		if (stereotypeApplication == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		destroy(stereotypeApplication);

		return stereotypeApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getApplicableStereotypes(Element element) {
		org.eclipse.uml2.uml.Package package_ = element.getNearestPackage();

		if (package_ != null) {
			EList applicableStereotypes = new UniqueEList();

			for (Iterator allAppliedProfiles = package_.getAllAppliedProfiles()
				.iterator(); allAppliedProfiles.hasNext();) {

				Profile profile = (Profile) allAppliedProfiles.next();

				for (Iterator ownedStereotypes = profile.getOwnedStereotypes()
					.iterator(); ownedStereotypes.hasNext();) {

					Stereotype stereotype = (Stereotype) ownedStereotypes
						.next();

					if (getExtension(element, stereotype) != null) {
						applicableStereotypes.add(stereotype);
					}
				}

				return ECollections.unmodifiableEList(applicableStereotypes);
			}
		}

		return ECollections.EMPTY_ELIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Stereotype getApplicableStereotype(Element element,
			String qualifiedName) {

		for (Iterator applicableStereotypes = element
			.getApplicableStereotypes().iterator(); applicableStereotypes
			.hasNext();) {

			Stereotype applicableStereotype = (Stereotype) applicableStereotypes
				.next();

			if (safeEquals(applicableStereotype.getQualifiedName(),
				qualifiedName)) {

				return applicableStereotype;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean hasKeyword(Element element, String keyword) {
		EAnnotation eAnnotation = element.getEAnnotation(UMLPackage.eNS_URI);

		return eAnnotation != null
			&& eAnnotation.getDetails().containsKey(keyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void destroy(Element element) {
		destroy((EObject) element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwnedElements() gives all of the direct and indirect owned elements of an element.
	 * result = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList allOwnedElements(Element element) {
		EList ownedElements = element.getOwnedElements();
		EList allOwnedElements = new UniqueEList(ownedElements);

		for (Iterator oe = ownedElements.iterator(); oe.hasNext();) {
			allOwnedElements.addAll(((Element) oe.next()).allOwnedElements());
		}

		return ECollections.unmodifiableEList(allOwnedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner. Subclasses of Element that do not require an owner must override this operation.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(Element element) {
		return true;
	}

} // ElementOperations