/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 271470
 *   Kenn Hussey - 323181, 348433
 *   Kenn Hussey (CEA) - 327039, 369492, 313951, 163556, 418466, 447901, 451350, 458658, 485756
 *   Christian W. Damus (CEA) - 300957, 431998
 *   Christian W. Damus - 444588
 *   Alain Le Guennec (Esterel Technologies SAS) - 497153
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Package</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#applyProfile(org.eclipse.uml2.uml.Profile) <em>Apply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedStereotype(java.lang.String, boolean) <em>Create Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllAppliedProfiles() <em>Get All Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllProfileApplications() <em>Get All Profile Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String, boolean) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfiles() <em>Get Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile, boolean) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isModelLibrary() <em>Is Model Library</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isProfileApplied(org.eclipse.uml2.uml.Profile) <em>Is Profile Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#unapplyProfile(org.eclipse.uml2.uml.Profile) <em>Unapply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#applyProfiles(org.eclipse.emf.common.util.EList) <em>Apply Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#allApplicableStereotypes() <em>All Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#containingProfile() <em>Containing Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement) <em>Makes Visible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestedPackages() <em>Get Nested Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedStereotypes() <em>Get Owned Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedTypes() <em>Get Owned Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#visibleMembers() <em>Visible Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageOperations
		extends NamespaceOperations {

	protected static class StereotypeApplicationCopier
			extends EcoreUtil.Copier {

		private static final long serialVersionUID = 1L;

		@Deprecated
		protected final Profile profile;

		protected final List<Profile> profiles;

		protected final Map<EClass, EClass> targetClasses = new HashMap<EClass, EClass>();

		protected final Map<EStructuralFeature, EStructuralFeature> targetFeatures = new HashMap<EStructuralFeature, EStructuralFeature>();

		protected StereotypeApplicationCopier(Profile profile) {
			this(profile == null
				? Collections.<Profile> emptyList()
				: Collections.singletonList(profile));
		}

		protected StereotypeApplicationCopier(List<Profile> profiles) {
			super();

			this.profiles = profiles;
			this.profile = profiles.isEmpty()
				? null
				: profiles.get(0);
		}

		@Override
		protected EObject createCopy(EObject eObject) {
			Element baseElement = getBaseElement(eObject);
			return baseElement == null
				? super.createCopy(eObject)
				: applyStereotype(baseElement, getTarget(eObject.eClass()));
		}

		@Override
		protected EClass getTarget(EClass eClass) {

			if (targetClasses.containsKey(eClass)) {
				return targetClasses.get(eClass);
			}

			NamedElement namedElement = getNamedElement(eClass);
			EClass definition = (EClass) getDefinition(namedElement);
			targetClasses.put(eClass, definition);

			if (definition != null) {
				return definition;
			} else {
				String qualifiedName = (namedElement != null)
					? getQualifiedName(namedElement)
					: getQualifiedName(eClass, NamedElement.SEPARATOR);
				throw new IllegalStateException("Definition for class '" //$NON-NLS-1$
					+ qualifiedName + "' not found."); //$NON-NLS-1$
			}
		}

		@Override
		protected EStructuralFeature getTarget(
				EStructuralFeature eStructuralFeature) {

			if (targetFeatures.containsKey(eStructuralFeature)) {
				return targetFeatures.get(eStructuralFeature);
			}

			NamedElement namedElement = getNamedElement(eStructuralFeature);
			EStructuralFeature definition = (EStructuralFeature) getDefinition(
				namedElement);
			targetFeatures.put(eStructuralFeature, definition);

			if (definition != null) {
				return definition;
			} else {
				String qualifiedName = (namedElement != null)
					? getQualifiedName(namedElement)
					: getQualifiedName(eStructuralFeature,
						NamedElement.SEPARATOR);
				throw new IllegalStateException("Definition for property '" //$NON-NLS-1$
					+ qualifiedName + "' not found."); //$NON-NLS-1$
			}
		}

		protected NamedElement getNamedElement(ENamedElement element) {

			if (element != null) {

				for (Profile profile : profiles) {
					NamedElement namedElement = UMLUtil.getNamedElement(element,
						profile);

					if (namedElement != null) {
						return namedElement;
					}
				}
			}

			return null;
		}

		protected ENamedElement getDefinition(NamedElement element) {

			if (element != null) {

				for (Profile profile : profiles) {
					ENamedElement definition = profile.getDefinition(element);

					if (definition != null) {
						return definition;
					}
				}
			}

			return null;
		}

		@Override
		protected void copyAttribute(EAttribute eAttribute, EObject eObject,
				EObject copyEObject) {

			if (!eAttribute.isUnsettable() || eObject.eIsSet(eAttribute)) {

				try {
					if (eAttribute.getEType().eClass()
						.getClassifierID() == EcorePackage.EENUM) {
						copyEEnumAttribute(eAttribute, eObject, copyEObject);
					} else {
						copyEDataTypeAttribute(eAttribute, eObject,
							copyEObject);
					}
				} catch (Exception e) {
					handleException(e);
				}
			}
		}

		protected void handleException(Exception exception) {
			UMLPlugin.INSTANCE.log(exception);
		}

		protected void copyEDataTypeAttribute(EAttribute eAttribute,
				EObject eObject, EObject copyEObject) {
			EDataType eDataType = eAttribute.getEAttributeType();
			EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();

			EAttribute targetEAttribute = (EAttribute) getTarget(eAttribute);

			if (targetEAttribute != null && targetEAttribute.isChangeable()) {
				EDataType targetEDataType = targetEAttribute
					.getEAttributeType();
				EFactory targetEFactory = targetEDataType.getEPackage()
					.getEFactoryInstance();

				if (targetEAttribute.isMany()) {
					@SuppressWarnings("unchecked")
					EList<Object> copyValues = (EList<Object>) copyEObject
						.eGet(targetEAttribute);

					if (eAttribute.isMany()) {
						EList<?> values = (EList<?>) eObject.eGet(eAttribute);

						for (int i = 0, size = values.size(); i < size; i++) {
							copyValues.add(i,
								targetEFactory.createFromString(targetEDataType,
									eFactory.convertToString(eDataType,
										values.get(i))));
						}
					} else {
						copyValues.add(targetEFactory.createFromString(
							targetEDataType, eFactory.convertToString(eDataType,
								eObject.eGet(eAttribute))));
					}
				} else {
					copyEObject.eSet(targetEAttribute,
						targetEFactory.createFromString(targetEDataType,
							eFactory.convertToString(eDataType,
								eAttribute.isMany()
									? ((EList<?>) eObject.eGet(eAttribute))
										.get(0)
									: eObject.eGet(eAttribute))));
				}
			}
		}

		protected void copyEEnumAttribute(EAttribute eAttribute,
				EObject eObject, EObject copyEObject) {
			EAttribute targetEAttribute = (EAttribute) getTarget(eAttribute);

			if (targetEAttribute != null && targetEAttribute.isChangeable()) {
				EEnum targetEEnum = (EEnum) targetEAttribute
					.getEAttributeType();

				if (targetEAttribute.isMany()) {
					@SuppressWarnings("unchecked")
					EList<Enumerator> copyValues = (EList<Enumerator>) copyEObject
						.eGet(targetEAttribute);

					if (eAttribute.isMany()) {
						@SuppressWarnings("unchecked")
						EList<Enumerator> values = (EList<Enumerator>) eObject
							.eGet(eAttribute);

						for (int i = 0, size = values.size(); i < size; i++) {
							EEnumLiteral targetEEnumLiteral = targetEEnum
								.getEEnumLiteral(values.get(i).getName());

							if (targetEEnumLiteral != null) {
								copyValues
									.add(targetEEnumLiteral.getInstance());
							}
						}
					} else {
						Enumerator value = (Enumerator) eObject
							.eGet(eAttribute);

						if (value != null) {
							EEnumLiteral targetEEnumLiteral = targetEEnum
								.getEEnumLiteral(value.getName());

							if (targetEEnumLiteral != null) {
								copyValues
									.add(targetEEnumLiteral.getInstance());
							}
						}
					}
				} else {
					Enumerator value = (Enumerator) (eAttribute.isMany()
						? ((EList<?>) eObject.eGet(eAttribute)).get(0)
						: eObject.eGet(eAttribute));

					if (value != null) {
						EEnumLiteral targetEEnumLiteral = targetEEnum
							.getEEnumLiteral(value.getName());

						if (targetEEnumLiteral != null) {
							copyEObject.eSet(targetEAttribute,
								targetEEnumLiteral.getInstance());
						}
					}
				}
			}
		}

		@Override
		protected void copyContainment(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject.eIsSet(eReference)) {
				Object value = eObject.eGet(eReference);

				try {
					EReference targetEReference = (EReference) getTarget(
						eReference);

					if (targetEReference != null
						&& targetEReference.isChangeable()) {

						if (targetEReference.isMany()) {
							@SuppressWarnings("unchecked")
							EList<EObject> copyValues = (EList<EObject>) copyEObject
								.eGet(targetEReference);

							if (eReference.isMany()) {
								@SuppressWarnings("unchecked")
								EList<EObject> values = (EList<EObject>) value;
								copyValues.addAll(copyAll(values));
							} else if (value != null) {
								copyValues.add(copy((EObject) value));
							}
						} else {

							if (eReference.isMany()) {
								@SuppressWarnings("unchecked")
								EList<EObject> values = (EList<EObject>) value;
								copyEObject.eSet(targetEReference,
									copy(values.get(0)));
							} else {
								copyEObject.eSet(targetEReference,
									copy((EObject) value));
							}
						}
					}
				} catch (Exception e) {
					handleException(e);
				}
			}
		}

		@Override
		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject.eIsSet(eReference)) {
				Object value = eObject.eGet(eReference);

				try {
					EReference targetEReference = (EReference) getTarget(
						eReference);

					if (targetEReference != null
						&& targetEReference.isChangeable()) {

						if (targetEReference.isMany()) {
							@SuppressWarnings("unchecked")
							InternalEList<EObject> copyValues = (InternalEList<EObject>) copyEObject
								.eGet(targetEReference);

							if (eReference.isMany()) {
								EReference targetEOpposite = targetEReference
									.getEOpposite();
								int index = 0;

								@SuppressWarnings("unchecked")
								Iterator<EObject> v = ((EList<EObject>) value)
									.iterator();

								while (v.hasNext()) {
									value = v.next();
									EObject copyValue = get(value);

									if (copyValue == null) {

										if (targetEOpposite == null) {
											copyValues.addUnique(index++,
												(EObject) value);
										}
									} else {

										if (targetEOpposite != null) {
											int position = copyValues
												.indexOf(copyValue);

											if (position == -1) {
												copyValues.addUnique(index++,
													copyValue);
											} else if (position != index) {
												copyValues.move(index++,
													copyValue);
											}
										} else {
											copyValues.addUnique(index++,
												copyValue);
										}
									}
								}
							} else if (value != null) {
								EObject copyValue = get(value);

								if (copyValue == null) {

									if (targetEReference
										.getEOpposite() == null) {

										copyValues.addUnique((EObject) value);
									}
								} else {
									copyValues.addUnique(copyValue);
								}
							}
						} else {

							if (eReference.isMany()) {
								@SuppressWarnings("unchecked")
								EList<EObject> values = (EList<EObject>) value;
								value = values.get(0);
							}

							Object copyValue = get(value);

							if (copyValue == null) {

								if (targetEReference.getEOpposite() == null) {
									copyEObject.eSet(targetEReference, value);
								}
							} else {
								copyEObject.eSet(targetEReference, copyValue);
							}
						}
					}
				} catch (Exception e) {
					handleException(e);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an element that is owned by a package has visibility, it is public or private.
	 * packagedElement->forAll(e | e.visibility<> null implies e.visibility = VisibilityKind::public or e.visibility = VisibilityKind::private)
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateElementsPublicOrPrivate(
			org.eclipse.uml2.uml.Package package_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (Element ownedElement : package_.getOwnedElements()) {

			if (ownedElement instanceof NamedElement) {
				VisibilityKind visibility = ((NamedElement) ownedElement)
					.getVisibility();

				if (visibility != null
					&& visibility != VisibilityKind.PUBLIC_LITERAL
					&& visibility != VisibilityKind.PRIVATE_LITERAL) {

					result = false;

					if (diagnostics == null) {
						return result;
					} else {
						diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
							UMLPlugin.INSTANCE.getString(
								"_UI_Package_ElementsPublicOrPrivate_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, ownedElement,
									package_)),
							new Object[]{package_, ownedElement}));
					}
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static org.eclipse.uml2.uml.Class createOwnedClass(
			org.eclipse.uml2.uml.Package package_, String name,
			boolean isAbstract) {
		org.eclipse.uml2.uml.Class ownedClass = (org.eclipse.uml2.uml.Class) package_
			.createOwnedType(name, UMLPackage.Literals.CLASS);
		ownedClass.setIsAbstract(isAbstract);
		return ownedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Enumeration createOwnedEnumeration(
			org.eclipse.uml2.uml.Package package_, String name) {
		return (Enumeration) package_.createOwnedType(name,
			UMLPackage.Literals.ENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static PrimitiveType createOwnedPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {
		return (PrimitiveType) package_.createOwnedType(name,
			UMLPackage.Literals.PRIMITIVE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) stereotype with the specified name as an owned stereotype of this profile.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new stereotype, or null.
	 * @param isAbstract Whether the new stereotype should be abstract.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Stereotype createOwnedStereotype(
			org.eclipse.uml2.uml.Package package_, String name,
			boolean isAbstract) {
		Stereotype ownedStereotype = (Stereotype) package_.createOwnedType(name,
			UMLPackage.Literals.STEREOTYPE);
		ownedStereotype.setIsAbstract(isAbstract);
		return ownedStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified profile is applied to this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile in question.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isProfileApplied(
			org.eclipse.uml2.uml.Package package_, Profile profile) {
		return getProfileApplication(package_, profile) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/ownedType
	 * result = (packagedElement->select(oclIsKindOf(Type))->collect(oclAsType(Type))->asSet())
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Type> getOwnedTypes(
			org.eclipse.uml2.uml.Package package_) {
		return package_.getOwnedTypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definition of the specified profile to this package and automatically applies required stereotypes in the profile to elements within this package's namespace hieararchy. If a different definition is already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile to apply.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<EObject> applyProfile(
			org.eclipse.uml2.uml.Package package_, Profile profile) {
		return applyProfiles(package_, profile == null
			? ECollections.<Profile> emptyEList()
			: ECollections.singletonEList(profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unapplies the specified profile from this package and automatically unapplies stereotypes in the profile from elements within this package's namespace hieararchy.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile to unapply.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<EObject> unapplyProfile(
			org.eclipse.uml2.uml.Package package_, Profile profile) {

		if (profile == null) {
			throw new IllegalArgumentException("null profile"); //$NON-NLS-1$
		}

		if (package_.getProfileApplication(profile) == null) {
			throw new IllegalArgumentException(String.format(
				"profile \"%s\" is not applied", profile.getQualifiedName())); //$NON-NLS-1$
		}

		EList<ProfileApplication> profileApplications = new UniqueEList.FastCompare<ProfileApplication>();

		for (TreeIterator<EObject> allContents = getAllContents(package_, true,
			false); allContents.hasNext();) {

			EObject eObject = allContents.next();

			if (eObject instanceof org.eclipse.uml2.uml.Package) {

				for (ProfileApplication profileApplication : ((org.eclipse.uml2.uml.Package) eObject)
					.getProfileApplications()) {

					if (profileApplication.getAppliedProfile() == profile) {
						profileApplications.add(profileApplication);
					}
				}
			}
		}

		destroyAll(profileApplications);

		return package_.getAllAppliedProfiles().contains(profile)
			? ECollections.<EObject> emptyEList()
			: unapplyAllNonApplicableStereotypes(package_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definitions of the specified profiles to this package and automatically applies required stereotypes in the profiles to elements within this package's namespace hieararchy. If different definitions are already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profiles The profiles to apply.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<EObject> applyProfiles(
			org.eclipse.uml2.uml.Package package_, EList<Profile> profiles) {

		if (profiles == null || profiles.isEmpty()) {
			throw new IllegalArgumentException("No profile specified"); //$NON-NLS-1$
		}

		for (Profile profile : profiles) {
			EPackage profileDefinition = profile.getDefinition();

			if (profileDefinition == null) {
				throw new IllegalArgumentException(
					String.format("profile \"%s\" has no Ecore definition", //$NON-NLS-1$
						profile.getQualifiedName()));
			}
		}

		for (Profile profile : profiles) {

			if (package_.getProfileApplication(profile) == null) {
				package_.createProfileApplication().setAppliedProfile(profile);
			}
		}

		EList<EObject> stereotypeApplications = new UniqueEList.FastCompare<EObject>();
		StereotypeApplicationCopier copier = new StereotypeApplicationCopier(
			profiles);

		for (TreeIterator<EObject> allContents = getAllContents(package_, true,
			false); allContents.hasNext();) {

			EObject eObject = allContents.next();

			if (eObject instanceof Element) {
				Element element = (Element) eObject;

				if (element instanceof org.eclipse.uml2.uml.Package) {

					for (ProfileApplication profileApplication : ((org.eclipse.uml2.uml.Package) element)
						.getProfileApplications()) {

						Profile appliedProfile = profileApplication
							.getAppliedProfile();

						if (profiles.contains(appliedProfile)) {
							EList<EObject> references = getEAnnotation(
								profileApplication, UML2_UML_PACKAGE_2_0_NS_URI,
								true).getReferences();

							if (references.isEmpty()) {
								references.add(appliedProfile.getDefinition());
							} else {
								references.set(0,
									appliedProfile.getDefinition());
							}
						}
					}
				}

				for (EObject stereotypeApplication : element
					.getStereotypeApplications()) {

					Stereotype stereotype = getStereotype(
						stereotypeApplication);

					if (stereotype != null
						&& profiles.contains(stereotype.getProfile())) {

						if (element.isStereotypeApplicable(stereotype)) {
							EObject copy = copier.copy(stereotypeApplication);
							Resource eResource = stereotypeApplication
								.eResource();

							if (eResource != null) {
								EList<EObject> contents = eResource
									.getContents();

								if (eResource == copy.eResource()) {
									contents.move(
										contents.indexOf(stereotypeApplication),
										copy);
								} else {
									contents.set(
										contents.indexOf(stereotypeApplication),
										copy);
								}
							}
						}

						stereotypeApplications.add(stereotypeApplication);
					}
				}
			}
		}

		copier.copyReferences();

		for (EObject key : copier.keySet()) {
			EObject copy = copier.get(key);

			Resource eResource = key.eResource();

			if (eResource instanceof XMLResource) {
				XMLResource xmlResource = (XMLResource) eResource;
				String id = xmlResource.getID(key);
				xmlResource.setID(key, null);
				xmlResource.setID(copy, id);
			}

			for (Setting setting : new ArrayList<EStructuralFeature.Setting>(
				getNonNavigableInverseReferences(key))) {

				EObject eObject = setting.getEObject();

				if (!copier.containsKey(eObject)) {
					EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();

					if (eStructuralFeature != null
						&& eStructuralFeature.isChangeable()) {

						if (eStructuralFeature.isMany()) {
							Object value = eObject.eGet(eStructuralFeature);

							@SuppressWarnings("unchecked")
							EList<EObject> list = ((EList<EObject>) value);
							list.set(list.indexOf(key), copy);
						} else {
							setting.set(copy);
						}
					}
				}
			}
		}

		destroyAll(stereotypeApplications);

		for (Profile profile : profiles) {

			if (profile.getOwnedExtensions(true).size() > 0) {
				return applyAllRequiredStereotypes(package_);
			}
		}

		return ECollections.<EObject> emptyEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allApplicableStereotypes() returns all the directly or indirectly owned stereotypes, including stereotypes contained in sub-profiles.
	 * result = (let ownedPackages : Bag(Package) = ownedMember->select(oclIsKindOf(Package))->collect(oclAsType(Package)) in
	 *  ownedStereotype->union(ownedPackages.allApplicableStereotypes())->flatten()->asSet()
	 * )
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Stereotype> allApplicableStereotypes(
			org.eclipse.uml2.uml.Package package_) {
		return allApplicableStereotypes(package_,
			new UniqueEList.FastCompare<Stereotype>());
	}

	protected static EList<Stereotype> allApplicableStereotypes(
			org.eclipse.uml2.uml.Package package_,
			EList<Stereotype> allApplicableStereotypes) {
		allApplicableStereotypes.addAll(package_.getOwnedStereotypes());

		for (org.eclipse.uml2.uml.Package nestedPackage : package_
			.getNestedPackages()) {

			allApplicableStereotypes(nestedPackage, allApplicableStereotypes);
		}

		return allApplicableStereotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile() returns the closest profile directly or indirectly containing this package (or this package itself, if it is a profile).
	 * result = (if self.oclIsKindOf(Profile) then 
	 * 	self.oclAsType(Profile)
	 * else
	 * 	self.namespace.oclAsType(Package).containingProfile()
	 * endif)
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile containingProfile(
			org.eclipse.uml2.uml.Package package_) {
		return (Profile) (package_ instanceof Profile
			? package_
			: getOwningElement(package_, UMLPackage.Literals.PROFILE, true));
	}

	protected static EList<Profile> getAppliedProfiles(
			org.eclipse.uml2.uml.Package package_,
			EList<Profile> appliedProfiles) {

		for (ProfileApplication profileApplication : package_
			.getProfileApplications()) {
			Profile appliedProfile = profileApplication.getAppliedProfile();

			if (appliedProfile != null) {
				appliedProfiles.add(appliedProfile);
			}
		}

		return appliedProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profiles that are applied to this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Profile> getAppliedProfiles(
			org.eclipse.uml2.uml.Package package_) {
		return getAppliedProfiles(package_,
			new UniqueEList.FastCompare<Profile>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package, or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			org.eclipse.uml2.uml.Package package_, String qualifiedName) {

		for (ProfileApplication profileApplication : package_
			.getProfileApplications()) {

			Profile appliedProfile = profileApplication.getAppliedProfile();

			if (appliedProfile != null && safeEquals(
				appliedProfile.getQualifiedName(), qualifiedName)) {

				return appliedProfile;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			org.eclipse.uml2.uml.Package package_, String qualifiedName,
			boolean recurse) {
		Profile appliedProfile = package_.getAppliedProfile(qualifiedName);

		if (appliedProfile == null && recurse) {

			for (Iterator<org.eclipse.uml2.uml.Package> otherApplyingPackages = ProfileApplicationHelper
				.getInstance(package_).getOtherApplyingPackages(package_)
				.iterator(); otherApplyingPackages.hasNext()
					&& appliedProfile == null;) {

				appliedProfile = otherApplyingPackages.next()
					.getAppliedProfile(qualifiedName);
			}
		}

		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profile applications for this package, including profile applications for its nesting package(s).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<ProfileApplication> getAllProfileApplications(
			org.eclipse.uml2.uml.Package package_) {
		EList<ProfileApplication> allProfileApplications = new UniqueEList.FastCompare<ProfileApplication>(
			package_.getProfileApplications());

		for (org.eclipse.uml2.uml.Package applyingPackage : ProfileApplicationHelper
			.getInstance(package_).getOtherApplyingPackages(package_)) {

			allProfileApplications
				.addAll(applyingPackage.getProfileApplications());
		}

		return ECollections.unmodifiableEList(allProfileApplications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package, or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile whose application to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			org.eclipse.uml2.uml.Package package_, Profile profile) {

		for (ProfileApplication profileApplication : package_
			.getProfileApplications()) {

			if (profileApplication.getAppliedProfile() == profile) {
				return profileApplication;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile whose application to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			org.eclipse.uml2.uml.Package package_, Profile profile,
			boolean recurse) {
		ProfileApplication profileApplication = package_
			.getProfileApplication(profile);

		if (profileApplication == null && recurse) {

			for (Iterator<org.eclipse.uml2.uml.Package> otherApplyingPackages = ProfileApplicationHelper
				.getInstance(package_).getOtherApplyingPackages(package_)
				.iterator(); otherApplyingPackages.hasNext()
					&& profileApplication == null;) {

				profileApplication = otherApplyingPackages.next()
					.getProfileApplication(profile);
			}
		}

		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Interface createOwnedInterface(
			org.eclipse.uml2.uml.Package package_, String name) {
		return (Interface) package_.createOwnedType(name,
			UMLPackage.Literals.INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this package is a model library.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isModelLibrary(
			org.eclipse.uml2.uml.Package package_) {
		return package_.getAppliedStereotype("StandardProfile" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "ModelLibrary") != null; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profiles that are applied to this package, including profiles applied to its nesting package(s).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Profile> getAllAppliedProfiles(
			org.eclipse.uml2.uml.Package package_) {
		EList<Profile> allAppliedProfiles = getAppliedProfiles(package_,
			new UniqueEList.FastCompare<Profile>());

		for (org.eclipse.uml2.uml.Package applyingPackage : ProfileApplicationHelper
			.getInstance(package_).getOtherApplyingPackages(package_)) {

			getAppliedProfiles(applyingPackage, allAppliedProfiles);
		}

		return ECollections.unmodifiableEList(allAppliedProfiles);
	}

	protected static EList<org.eclipse.uml2.uml.Package> getAllImportedPackages(
			org.eclipse.uml2.uml.Package package_,
			EList<org.eclipse.uml2.uml.Package> allImportedPackages) {

		for (PackageImport packageImport : package_.getPackageImports()) {

			if (packageImport
				.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				org.eclipse.uml2.uml.Package importedPackage = packageImport
					.getImportedPackage();

				if (importedPackage != null
					&& allImportedPackages.add(importedPackage)) {

					getAllImportedPackages(importedPackage,
						allImportedPackages);
				}
			}
		}

		return allImportedPackages;
	}

	protected static EList<PackageableElement> visibleMembers(
			org.eclipse.uml2.uml.Package package_,
			EList<PackageableElement> visibleMembers) {

		for (NamedElement ownedMember : package_.getOwnedMembers()) {

			if (ownedMember instanceof PackageableElement && ownedMember
				.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {

				visibleMembers.add((PackageableElement) ownedMember);
			}
		}

		for (ElementImport elementImport : package_.getElementImports()) {

			if (elementImport
				.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				PackageableElement importedElement = elementImport
					.getImportedElement();

				if (importedElement != null) {
					visibleMembers.add(importedElement);
				}
			}
		}

		return visibleMembers;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * result = (member->select( m | m.oclIsKindOf(PackageableElement) and self.makesVisible(m))->collect(oclAsType(PackageableElement))->asSet())
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> visibleMembers(
			org.eclipse.uml2.uml.Package package_) {
		EList<PackageableElement> visibleMembers = visibleMembers(package_,
			new UniqueEList.FastCompare<PackageableElement>());

		for (org.eclipse.uml2.uml.Package importedPackage : getAllImportedPackages(
			package_,
			new UniqueEList.FastCompare<org.eclipse.uml2.uml.Package>())) {

			visibleMembers(importedPackage, visibleMembers);
		}

		return ECollections.unmodifiableEList(visibleMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * member->includes(el)
	 * result = (ownedMember->includes(el) or
	 * (elementImport->select(ei|ei.importedElement = VisibilityKind::public)->collect(importedElement.oclAsType(NamedElement))->includes(el)) or
	 * (packageImport->select(visibility = VisibilityKind::public)->collect(importedPackage.member->includes(el))->notEmpty()))
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean makesVisible(org.eclipse.uml2.uml.Package package_,
			NamedElement el) {

		if (package_.getOwnedMembers().contains(el)) {
			return el.getVisibility() == VisibilityKind.PUBLIC_LITERAL;
		}

		for (ElementImport elementImport : package_.getElementImports()) {

			if (safeEquals(elementImport.getImportedElement(), el)) {
				return elementImport
					.getVisibility() == VisibilityKind.PUBLIC_LITERAL;
			}
		}

		for (PackageImport packageImport : package_.getPackageImports()) {

			if (packageImport
				.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				org.eclipse.uml2.uml.Package importedPackage = packageImport
					.getImportedPackage();

				return importedPackage != null
					&& importedPackage.visibleMembers().contains(el);
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/nestedPackage
	 * result = (packagedElement->select(oclIsKindOf(Package))->collect(oclAsType(Package))->asSet())
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Package> getNestedPackages(
			org.eclipse.uml2.uml.Package package_) {
		return package_.getNestedPackages();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/ownedStereotype
	 * result = (packagedElement->select(oclIsKindOf(Stereotype))->collect(oclAsType(Stereotype))->asSet())
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Stereotype> getOwnedStereotypes(
			org.eclipse.uml2.uml.Package package_) {
		return package_.getOwnedStereotypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner.
	 * result = (false)
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(org.eclipse.uml2.uml.Package package_) {
		return false;
	}

	protected static boolean containsSpecializations(
			org.eclipse.uml2.uml.Package package_, Classifier classifier) {

		for (Type ownedType : package_.getOwnedTypes()) {

			if (ownedType instanceof Classifier
				&& ((Classifier) ownedType).allParents().contains(classifier)) {

				return true;
			}
		}

		return false;
	}

} // PackageOperations
