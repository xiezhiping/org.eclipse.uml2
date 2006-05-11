/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ElementOperations.java,v 1.40 2006/05/11 04:16:53 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLUtil;
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
 *   <li>{@link org.eclipse.uml2.uml.Element#destroy() <em>Destroy</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getKeywords() <em>Get Keywords</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getNearestPackage() <em>Get Nearest Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getModel() <em>Get Model</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applicable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Apply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Unapply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype) <em>Get Stereotype Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype) <em>Get Applied Substereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Has Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class ElementOperations
		extends UMLUtil {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element may not directly or indirectly own itself.
	 * not self.allOwnedElements()->includes(self)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNotOwnSelf(Element element,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (element.allOwnedElements().contains(element)) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ELEMENT__NOT_OWN_SELF, UMLPlugin.INSTANCE
						.getString("_UI_Element_NotOwnSelf_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, element)),
					new Object[]{element}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements that must be owned must have an owner.
	 * self.mustBeOwned() implies owner->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateHasOwner(Element element,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (element.mustBeOwned() && element.getOwner() == null) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ELEMENT__HAS_OWNER, UMLPlugin.INSTANCE
						.getString("_UI_Element_HasOwner_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, element)),
					new Object[]{element}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getStereotypeApplications(Element element) {
		EList stereotypeApplications = new UniqueEList.FastCompare();

		for (Iterator nonNavigableInverseReferences = getNonNavigableInverseReferences(
			element).iterator(); nonNavigableInverseReferences.hasNext();) {

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
			EList requiredStereotypes = new UniqueEList.FastCompare();

			for (Iterator allProfileApplications = package_
				.getAllProfileApplications().iterator(); allProfileApplications
				.hasNext();) {

				ProfileApplication profileApplication = (ProfileApplication) allProfileApplications
					.next();
				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {

					for (Iterator ownedStereotypes = appliedProfile
						.getOwnedStereotypes().iterator(); ownedStereotypes
						.hasNext();) {

						Stereotype stereotype = (Stereotype) ownedStereotypes
							.next();

						if (profileApplication.getAppliedDefinition(stereotype) != null) {
							Extension extension = getExtension(element,
								stereotype);

							if (extension != null && extension.isRequired()) {
								requiredStereotypes.add(stereotype);
							}
						}
					}
				}
			}

			return ECollections.unmodifiableEList(requiredStereotypes);
		}

		return ECollections.EMPTY_ELIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		EList appliedStereotypes = new UniqueEList.FastCompare();

		for (Iterator nonNavigableInverseReferences = getNonNavigableInverseReferences(
			element).iterator(); nonNavigableInverseReferences.hasNext();) {

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
		EList appliedSubstereotypes = new UniqueEList.FastCompare();

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
	public static Object getValue(Element element, Stereotype stereotype,
			String propertyName) {

		if (stereotype == null || !element.isStereotypeApplied(stereotype)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (isEmpty(propertyName)) {
			throw new IllegalArgumentException(String.valueOf(propertyName));
		}

		EObject eObject = element.getStereotypeApplication(stereotype);

		if (eObject == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

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
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}
			}

			if (eStructuralFeature == null) {
				throw new IllegalArgumentException(String.valueOf(propertyName));
			}

			EClassifier eType = eStructuralFeature.getEType();

			if (i + 1 < length) {

				if (eObject == null || !(eType instanceof EClass)) {

					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				eClass = (EClass) eType;

				eObject = (EObject) (eStructuralFeature.isMany()
					? ((List) eObject.eGet(eStructuralFeature)).get(index)
					: eObject.eGet(eStructuralFeature));
			} else {
				Object value = null;

				if (eStructuralFeature.isMany()) {
					List list = eObject == null
						? Collections.EMPTY_LIST
						: (List) eObject.eGet(eStructuralFeature);

					value = index == -1
						? list
						: list.get(index);
				} else {
					value = eObject == null
						? eStructuralFeature.getDefaultValue()
						: eObject.eGet(eStructuralFeature);
				}

				if (eType instanceof EEnum) {
					EAnnotation eAnnotation = eType
						.getEAnnotation(UMLPackage.eNS_URI);

					if (eAnnotation != null) {
						EList references = eAnnotation.getReferences();

						if (references.size() > 0) {
							Object reference = references.get(0);

							if (reference instanceof Enumeration) {
								value = ((Enumeration) reference)
									.getOwnedLiteral(((EEnumLiteral) value)
										.getName());
							}
						}
					}
				}

				return value;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setValue(Element element, Stereotype stereotype,
			String propertyName, Object newValue) {

		if (stereotype == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (isEmpty(propertyName)) {
			throw new IllegalArgumentException(String.valueOf(propertyName));
		}

		EObject eObject = element.getStereotypeApplication(stereotype);

		if (eObject == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

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
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}
			}

			if (eStructuralFeature == null) {
				throw new IllegalArgumentException(String.valueOf(propertyName));
			}

			EClassifier eType = eStructuralFeature.getEType();

			if (i + 1 < length) {

				if (!(eType instanceof EClass)) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				eClass = (EClass) eType;

				if (eStructuralFeature.isMany()) {
					List list = (List) eObject.eGet(eStructuralFeature);
					int size = list.size();

					if (size <= index) {

						if (!((EReference) eStructuralFeature).isContainment()) {
							throw new IllegalArgumentException(String
								.valueOf(propertyName));
						}

						for (int j = size; j <= index; j++) {
							list.add(j, EcoreUtil.create(eClass));
						}
					}

					eObject = (EObject) list.get(index);
				} else {
					Object value = eObject.eGet(eStructuralFeature);

					if (value == null) {

						if (!((EReference) eStructuralFeature).isContainment()) {
							throw new IllegalArgumentException(String
								.valueOf(propertyName));
						}

						eObject.eSet(eStructuralFeature, value = EcoreUtil
							.create(eClass));
					}

					eObject = (EObject) value;
				}
			} else {

				if (newValue != null) {

					if (eType instanceof EClass) {
						EClass eClassType = (EClass) eType;

						if (newValue instanceof List) {

							for (Iterator j = ((List) newValue).iterator(); j
								.hasNext();) {

								if (!eClassType.isInstance(j.next())) {
									throw new IllegalArgumentException(String
										.valueOf(newValue));
								}
							}
						} else if (!eClassType.isInstance(newValue)) {
							throw new IllegalArgumentException(String
								.valueOf(newValue));
						}
					} else if (eType instanceof EDataType) {
						EDataType eDataType = (EDataType) eType;
						EFactory eFactoryInstance = eDataType.getEPackage()
							.getEFactoryInstance();

						if (newValue instanceof List) {
							newValue = new ArrayList((List) newValue);

							if (eDataType instanceof EEnum) {
								EEnum eEnum = (EEnum) eDataType;

								for (ListIterator li = ((List) newValue)
									.listIterator(); li.hasNext();) {

									Object item = li.next();

									if (item instanceof EnumerationLiteral) {
										li.set(eEnum.getEEnumLiteral(
											((EnumerationLiteral) item)
												.getName()).getInstance());
									}
								}
							}

							for (ListIterator li = ((List) newValue)
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

							if (eDataType instanceof EEnum) {
								EEnum eEnum = (EEnum) eDataType;

								if (newValue instanceof EnumerationLiteral) {
									newValue = eEnum.getEEnumLiteral(
										((EnumerationLiteral) newValue)
											.getName()).getInstance();
								}
							}

							if (newValue instanceof String) {

								try {
									newValue = eFactoryInstance
										.createFromString(eDataType,
											(String) newValue);
								} catch (Exception e) {
									// ignore
								}
							}
						}
					}
				}

				if (newValue == null) {
					newValue = eStructuralFeature.getDefaultValue();
				}

				if (eStructuralFeature.isMany()) {

					if (index == -1) {

						if (newValue instanceof List) {
							eObject.eSet(eStructuralFeature, newValue);
						} else {
							throw new IllegalArgumentException(String
								.valueOf(newValue));
						}
					} else {
						List list = (List) eObject.eGet(eStructuralFeature);

						for (int j = list.size(); j < index; j++) {
							list.add(j, eStructuralFeature.getDefaultValue());
						}

						if (index == list.size()) {
							list.add(index, newValue);
						} else {
							list.set(index, newValue);
						}
					}

				} else {
					eObject.eSet(eStructuralFeature, newValue);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EAnnotation createEAnnotation(Element element, String source) {
		return createEAnnotation((EModelElement) element, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getRelationships(Element element) {
		return getRelationships(element, UMLPackage.Literals.RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getRelationships(Element element, EClass eClass) {
		EList relationships = new UniqueEList.FastCompare();

		for (Iterator nonNavigableInverseReferences = getNonNavigableInverseReferences(
			element).iterator(); nonNavigableInverseReferences.hasNext();) {

			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) nonNavigableInverseReferences
				.next();
			EObject eObject = setting.getEObject();

			if (eClass.isInstance(eObject)) {
				relationships.add(eObject);
			} else if (eObject instanceof Property) {
				Association association = ((Property) eObject).getAssociation();

				if (eClass.isInstance(association)) {
					relationships.add(association);
				}
			}
		}

		for (Iterator eAllReferences = element.eClass().getEAllReferences()
			.iterator(); eAllReferences.hasNext();) {

			EReference eReference = (EReference) eAllReferences.next();

			if (!eReference.isDerived() && element.eIsSet(eReference)) {
				EClass eReferenceType = eReference.getEReferenceType();

				if (eClass.isSuperTypeOf(eReferenceType)) {

					if (eReference.isMany()) {
						relationships.addAll((List) element.eGet(eReference));
					} else {
						relationships.add(element.eGet(eReference));
					}
				} else if (eReferenceType.isSuperTypeOf(eClass)) {
					Object value = element.eGet(eReference);

					if (eReference.isMany()) {

						for (Iterator i = ((List) value).iterator(); i
							.hasNext();) {

							value = i.next();

							if (eClass.isInstance(value)) {
								relationships.add(value);
							}
						}
					} else if (eClass.isInstance(value)) {
						relationships.add(value);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(relationships);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getSourceDirectedRelationships(Element element) {
		return getSourceDirectedRelationships(element,
			UMLPackage.Literals.DIRECTED_RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getSourceDirectedRelationships(Element element,
			EClass eClass) {
		EList sourceDirectedRelationships = new UniqueEList.FastCompare();

		for (Iterator directedRelationships = getRelationships(element, eClass)
			.iterator(); directedRelationships.hasNext();) {

			DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationships
				.next();

			if (directedRelationship.getSources().contains(element)) {
				sourceDirectedRelationships.add(directedRelationship);
			}
		}

		return ECollections.unmodifiableEList(sourceDirectedRelationships);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getTargetDirectedRelationships(Element element) {
		return getTargetDirectedRelationships(element,
			UMLPackage.Literals.DIRECTED_RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getTargetDirectedRelationships(Element element,
			EClass eClass) {
		EList targetDirectedRelationships = new UniqueEList.FastCompare();

		for (Iterator directedRelationships = getRelationships(element, eClass)
			.iterator(); directedRelationships.hasNext();) {

			DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationships
				.next();

			if (directedRelationship.getTargets().contains(element)) {
				targetDirectedRelationships.add(directedRelationship);
			}
		}

		return ECollections.unmodifiableEList(targetDirectedRelationships);
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
					keywords.add(((Map.Entry) d.next()).getKey());
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

		for (Element owner = element; ((owningElement = (Element) owner.eGet(
			UMLPackage.Literals.ELEMENT__OWNER, resolve)) == null
			? owner = owningElement = getBaseElement(owner.eContainer())
			: owningElement) != null
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
					EClassifier eClassifier = getEClassifier((org.eclipse.uml2.uml.Class) type);

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

			if (profile != null) {
				org.eclipse.uml2.uml.Package package_ = element
					.getNearestPackage();

				if (package_ != null) {
					ProfileApplication profileApplication = package_
						.getProfileApplication(profile, true);

					if (profileApplication != null
						&& profileApplication.getAppliedDefinition(stereotype) != null
						&& getExtension(element, stereotype) != null) {

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

			if (profile != null) {
				org.eclipse.uml2.uml.Package package_ = element
					.getNearestPackage();

				if (package_ != null) {
					ProfileApplication profileApplication = package_
						.getProfileApplication(profile, true);

					if (profileApplication != null
						&& profileApplication.getAppliedDefinition(stereotype) != null) {

						Extension extension = getExtension(element, stereotype);

						if (extension != null && extension.isRequired()) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static boolean isStereotypeApplied(Element element,
			Stereotype stereotype) {
		return element.getStereotypeApplication(stereotype) != null;
	}

	protected static EList applyAllStereotypes(Element element,
			EList extensions, EList stereotypeApplications) {

		if (!element.eIsProxy()) {

			for (Iterator e = extensions.iterator(); e.hasNext();) {
				Extension extension = (Extension) e.next();
				org.eclipse.uml2.uml.Class metaclass = extension.getMetaclass();

				if (metaclass != null) {
					EClassifier eClassifier = getEClassifier(metaclass);

					if (eClassifier != null && eClassifier.isInstance(element)) {
						Stereotype stereotype = extension.getStereotype();

						if (!element.isStereotypeApplied(stereotype)) {
							stereotypeApplications.add(applyStereotype(element,
								stereotype.getDefinition()));
						}
					}
				}
			}
		}

		return stereotypeApplications;
	}

	protected static EList applyAllStereotypes(Element element,
			EList extensions, boolean resolve) {
		EList stereotypeApplications = new UniqueEList.FastCompare();

		applyAllStereotypes(element, extensions, stereotypeApplications);

		if (!element.eContents().isEmpty()) {

			for (Iterator allContents = EcoreUtil.getAllContents(element,
				resolve); allContents.hasNext();) {

				EObject eObject = (EObject) allContents.next();

				if (eObject instanceof Element) {
					applyAllStereotypes((Element) eObject, extensions,
						stereotypeApplications);
				}
			}
		}

		return stereotypeApplications;
	}

	public static EList applyAllRequiredStereotypes(Element element) {
		return applyAllRequiredStereotypes(element, true);
	}

	public static EList applyAllRequiredStereotypes(Element element,
			boolean resolve) {
		org.eclipse.uml2.uml.Package package_ = element.getNearestPackage();

		if (package_ != null) {
			EList allRequiredExtensions = new UniqueEList.FastCompare();

			for (Iterator allAppliedProfiles = package_.getAllAppliedProfiles()
				.iterator(); allAppliedProfiles.hasNext();) {

				ProfileOperations.getOwnedExtensions(
					(Profile) allAppliedProfiles.next(), true,
					allRequiredExtensions);
			}

			if (!allRequiredExtensions.isEmpty()) {
				return applyAllStereotypes(element, allRequiredExtensions,
					resolve);
			}
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

		return applyStereotype(element, stereotype.getDefinition());
	}

	protected static EList unapplyAllNonApplicableStereotypes(Element element,
			EList nonApplicableStereotypes) {

		if (!element.eIsProxy()) {

			for (Iterator sa = element.getStereotypeApplications().iterator(); sa
				.hasNext();) {

				EObject stereotypeApplication = (EObject) sa.next();

				if (!element
					.isStereotypeApplicable(getStereotype(stereotypeApplication))) {

					nonApplicableStereotypes.add(stereotypeApplication);

					destroy(stereotypeApplication);
				}
			}
		}

		return nonApplicableStereotypes;
	}

	public static EList unapplyAllNonApplicableStereotypes(Element element) {
		return unapplyAllNonApplicableStereotypes(element, true);
	}

	public static EList unapplyAllNonApplicableStereotypes(Element element,
			boolean resolve) {
		EList nonApplicableStereotypes = new UniqueEList.FastCompare();

		unapplyAllNonApplicableStereotypes(element, nonApplicableStereotypes);

		if (!element.eContents().isEmpty()) {

			for (Iterator allContents = EcoreUtil.getAllContents(element,
				resolve); allContents.hasNext();) {

				EObject eObject = (EObject) allContents.next();

				if (eObject instanceof Element) {
					unapplyAllNonApplicableStereotypes((Element) eObject,
						nonApplicableStereotypes);
				}
			}
		}

		return nonApplicableStereotypes;
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
			EList applicableStereotypes = new UniqueEList.FastCompare();

			for (Iterator allProfileApplications = package_
				.getAllProfileApplications().iterator(); allProfileApplications
				.hasNext();) {

				ProfileApplication profileApplication = (ProfileApplication) allProfileApplications
					.next();
				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {

					for (Iterator ownedStereotypes = appliedProfile
						.getOwnedStereotypes().iterator(); ownedStereotypes
						.hasNext();) {

						Stereotype stereotype = (Stereotype) ownedStereotypes
							.next();

						if (profileApplication.getAppliedDefinition(stereotype) != null
							&& getExtension(element, stereotype) != null) {

							applicableStereotypes.add(stereotype);
						}
					}
				}
			}

			return ECollections.unmodifiableEList(applicableStereotypes);
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

		for (Iterator allContents = getAllContents(element, true, false); allContents
			.hasNext();) {

			EObject eObject = (EObject) allContents.next();

			if (eObject instanceof Element) {
				destroyAll(((Element) eObject).getStereotypeApplications());
			}
		}

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
		EList allOwnedElements = new UniqueEList.FastCompare(ownedElements);

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