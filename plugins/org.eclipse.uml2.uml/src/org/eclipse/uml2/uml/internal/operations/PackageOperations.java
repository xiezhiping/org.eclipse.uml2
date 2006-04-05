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
 * $Id: PackageOperations.java,v 1.21 2006/04/05 13:50:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Package</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isProfileApplied(org.eclipse.uml2.uml.Profile) <em>Is Profile Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#applyProfile(org.eclipse.uml2.uml.Profile) <em>Apply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#unapplyProfile(org.eclipse.uml2.uml.Profile) <em>Unapply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfiles() <em>Get Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllAppliedProfiles() <em>Get All Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String, boolean) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllProfileApplications() <em>Get All Profile Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile, boolean) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isModelLibrary() <em>Is Model Library</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#visibleMembers() <em>Visible Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement) <em>Makes Visible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageOperations
		extends NamespaceOperations {

	protected static class StereotypeApplicationCopier
			extends EcoreUtil.Copier {

		protected final Profile profile;

		protected StereotypeApplicationCopier(Profile profile) {
			super();

			this.profile = profile;
		}

		protected EObject createCopy(EObject eObject) {
			return applyStereotype(getBaseElement(eObject), getTarget(eObject
				.eClass()));
		}

		protected EClass getTarget(EClass eClass) {
			return (EClass) profile.getDefinition(getNamedElement(eClass));
		}

		protected EStructuralFeature getTarget(
				EStructuralFeature eStructuralFeature) {
			return (EStructuralFeature) profile
				.getDefinition(getNamedElement(eStructuralFeature));
		}

		protected void copyAttribute(EAttribute eAttribute, EObject eObject,
				EObject copyEObject) {

			if (eObject.eIsSet(eAttribute)) {

				try {
					if (eAttribute.getEType().eClass().getClassifierID() == EcorePackage.EENUM) {
						copyEEnumAttribute(eAttribute, eObject, copyEObject);
					} else {
						copyEDataTypeAttribute(eAttribute, eObject, copyEObject);
					}
				} catch (Exception e) {
					// ignore
				}
			}
		}

		protected void copyEDataTypeAttribute(EAttribute eAttribute,
				EObject eObject, EObject copyEObject) {
			EDataType eDataType = eAttribute.getEAttributeType();
			EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();

			EAttribute copyEAttribute = (EAttribute) getTarget(eAttribute);
			EDataType copyEDataType = copyEAttribute.getEAttributeType();
			EFactory copyEFactory = copyEDataType.getEPackage()
				.getEFactoryInstance();

			if (copyEAttribute.isMany()) {
				EList copyValues = (EList) copyEObject.eGet(copyEAttribute);

				if (eAttribute.isMany()) {
					EList values = (EList) eObject.eGet(eAttribute);

					for (int i = 0; i < values.size(); i++) {
						copyValues.add(i, copyEFactory.createFromString(
							copyEDataType, eFactory.convertToString(eDataType,
								values.get(i))));
					}
				} else {
					copyValues.add(copyEFactory.createFromString(copyEDataType,
						eFactory.convertToString(eDataType, eObject
							.eGet(eAttribute))));
				}
			} else {
				copyEObject.eSet(copyEAttribute, copyEFactory.createFromString(
					copyEDataType, eFactory.convertToString(eDataType,
						eAttribute.isMany()
							? ((EList) eObject.eGet(eAttribute)).get(0)
							: eObject.eGet(eAttribute))));
			}
		}

		protected void copyEEnumAttribute(EAttribute eAttribute,
				EObject eObject, EObject copyEObject) {
			EAttribute copyEAttribute = (EAttribute) getTarget(eAttribute);
			EEnum copyEEnum = (EEnum) copyEAttribute.getEAttributeType();

			if (copyEAttribute.isMany()) {
				EList copyValues = (EList) copyEObject.eGet(copyEAttribute);

				if (eAttribute.isMany()) {
					EList values = (EList) eObject.eGet(eAttribute);

					for (int i = 0; i < values.size(); i++) {
						copyValues.add(i, copyEEnum.getEEnumLiteral(
							((EEnumLiteral) values.get(i)).getName())
							.getInstance());
					}
				} else {
					copyValues.add(copyEEnum.getEEnumLiteral(
						((EEnumLiteral) eObject.eGet(eAttribute)).getName())
						.getInstance());
				}
			} else {
				copyEObject.eSet(copyEAttribute, copyEEnum.getEEnumLiteral(
					((EEnumLiteral) (eAttribute.isMany()
						? ((EList) eObject.eGet(eAttribute)).get(0)
						: eObject.eGet(eAttribute))).getName()).getInstance());
			}
		}

		protected void copyContainment(EReference eReference, EObject eObject,
				EObject copyEObject) {

			try {
				super.copyContainment(eReference, eObject, copyEObject);
			} catch (Exception e) {
				// ignore
			}
		}

		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {

			try {
				super.copyReference(eReference, eObject, copyEObject);
			} catch (Exception e) {
				// ignore
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
	 * self.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateElementsPublicOrPrivate(
			org.eclipse.uml2.uml.Package package_, DiagnosticChain diagnostics,
			Map context) {
		boolean result = true;

		for (Iterator ownedElements = package_.getOwnedElements().iterator(); ownedElements
			.hasNext();) {

			Element ownedElement = (Element) ownedElements.next();

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
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_Package_ElementsPublicOrPrivate_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											ownedElement, package_)),
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
	 * @generated NOT
	 */
	public static boolean isProfileApplied(
			org.eclipse.uml2.uml.Package package_, Profile profile) {
		return getProfileApplication(package_, profile) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList applyProfile(org.eclipse.uml2.uml.Package package_,
			Profile profile) {

		if (profile == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		EPackage profileDefinition = profile.getDefinition();

		if (profileDefinition == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		ProfileApplication profileApplication = package_
			.getProfileApplication(profile);

		if (profileApplication == null) {
			profileApplication = package_.createProfileApplication();
			profileApplication.setAppliedProfile(profile);

			getEAnnotation(profileApplication, UMLPackage.eNS_URI, true)
				.getReferences().add(profileDefinition);
		} else {
			getEAnnotation(profileApplication, UMLPackage.eNS_URI, true)
				.getReferences().set(0, profileDefinition);

			EList stereotypeApplications = new UniqueEList.FastCompare();
			StereotypeApplicationCopier copier = new StereotypeApplicationCopier(
				profile);

			for (Iterator allContents = getAllContents(package_, true, false); allContents
				.hasNext();) {

				Object object = allContents.next();

				if (object instanceof Element) {
					Element element = (Element) object;

					for (Iterator sa = element.getStereotypeApplications()
						.iterator(); sa.hasNext();) {

						EObject stereotypeApplication = (EObject) sa.next();
						Stereotype stereotype = getStereotype(stereotypeApplication);

						if (stereotype != null
							&& stereotype.getProfile() == profile) {

							if (element.isStereotypeApplicable(stereotype)) {
								EObject copy = copier
									.copy(stereotypeApplication);
								Resource eResource = stereotypeApplication
									.eResource();

								if (eResource != null && eResource != copy.eResource()) {
									EList contents = eResource.getContents();
									contents.set(contents
										.indexOf(stereotypeApplication), copy);
								}
							}

							stereotypeApplications.add(stereotypeApplication);
						}
					}
				}
			}

			copier.copyReferences();

			destroyAll(stereotypeApplications);
		}

		EList requiredExtensions = profile.getOwnedExtensions(true);

		return requiredExtensions.isEmpty()
			? ECollections.EMPTY_ELIST
			: applyAllRequiredStereotypes(package_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList unapplyProfile(org.eclipse.uml2.uml.Package package_,
			Profile profile) {

		if (profile == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		ProfileApplication profileApplication = package_
			.getProfileApplication(profile);

		if (profileApplication == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		profileApplication.destroy();

		return unapplyAllNonApplicableStereotypes(package_);
	}

	protected static EList getAppliedProfiles(
			org.eclipse.uml2.uml.Package package_, EList appliedProfiles) {

		for (Iterator profileApplications = package_.getProfileApplications()
			.iterator(); profileApplications.hasNext();) {

			Profile appliedProfile = ((ProfileApplication) profileApplications
				.next()).getAppliedProfile();

			if (appliedProfile != null) {
				appliedProfiles.add(appliedProfile);
			}
		}

		return appliedProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAppliedProfiles(org.eclipse.uml2.uml.Package package_) {
		return getAppliedProfiles(package_, new UniqueEList.FastCompare());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			org.eclipse.uml2.uml.Package package_, String qualifiedName) {

		for (Iterator profileApplications = package_.getProfileApplications()
			.iterator(); profileApplications.hasNext();) {

			Profile appliedProfile = ((ProfileApplication) profileApplications
				.next()).getAppliedProfile();

			if (appliedProfile != null
				&& appliedProfile.getQualifiedName().equals(qualifiedName)) {

				return appliedProfile;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			org.eclipse.uml2.uml.Package package_, String qualifiedName,
			boolean recurse) {
		Profile appliedProfile = package_.getAppliedProfile(qualifiedName);

		if (appliedProfile == null && recurse) {

			for (Namespace namespace = package_.getNamespace(); namespace != null
				&& appliedProfile == null; namespace = namespace.getNamespace()) {

				if (namespace instanceof org.eclipse.uml2.uml.Package) {
					appliedProfile = ((org.eclipse.uml2.uml.Package) namespace)
						.getAppliedProfile(qualifiedName);
				}
			}
		}

		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAllProfileApplications(
			org.eclipse.uml2.uml.Package package_) {
		EList allProfileApplications = new UniqueEList.FastCompare(package_
			.getProfileApplications());

		for (Iterator allOwningPackages = package_.allOwningPackages()
			.iterator(); allOwningPackages.hasNext();) {

			allProfileApplications
				.addAll(((org.eclipse.uml2.uml.Package) allOwningPackages
					.next()).getProfileApplications());
		}

		return ECollections.unmodifiableEList(allProfileApplications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			org.eclipse.uml2.uml.Package package_, Profile profile) {

		for (Iterator profileApplications = package_.getProfileApplications()
			.iterator(); profileApplications.hasNext();) {
			ProfileApplication profileApplication = (ProfileApplication) profileApplications
				.next();

			if (profileApplication.getAppliedProfile() == profile) {
				return profileApplication;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			org.eclipse.uml2.uml.Package package_, Profile profile,
			boolean recurse) {
		ProfileApplication profileApplication = package_
			.getProfileApplication(profile);

		if (profileApplication == null && recurse) {

			for (Namespace namespace = package_.getNamespace(); namespace != null
				&& profileApplication == null; namespace = namespace
				.getNamespace()) {

				if (namespace instanceof org.eclipse.uml2.uml.Package) {
					profileApplication = ((org.eclipse.uml2.uml.Package) namespace)
						.getProfileApplication(profile);
				}
			}
		}

		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @generated NOT
	 */
	public static boolean isModelLibrary(org.eclipse.uml2.uml.Package package_) {
		return package_.getAppliedStereotype("Standard" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "ModelLibrary") != null; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAllAppliedProfiles(
			org.eclipse.uml2.uml.Package package_) {
		EList allAppliedProfiles = getAppliedProfiles(package_,
			new UniqueEList.FastCompare());

		for (Iterator allOwningPackages = package_.allOwningPackages()
			.iterator(); allOwningPackages.hasNext();) {

			getAppliedProfiles((org.eclipse.uml2.uml.Package) allOwningPackages
				.next(), allAppliedProfiles);
		}

		return ECollections.unmodifiableEList(allAppliedProfiles);
	}

	protected static EList getAllImportedPackages(
			org.eclipse.uml2.uml.Package package_, EList allImportedPackages) {

		for (Iterator packageImports = package_.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (packageImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				org.eclipse.uml2.uml.Package importedPackage = packageImport
					.getImportedPackage();

				if (importedPackage != null
					&& allImportedPackages.add(importedPackage)) {

					getAllImportedPackages(importedPackage, allImportedPackages);
				}
			}
		}

		return allImportedPackages;
	}

	protected static EList visibleMembers(
			org.eclipse.uml2.uml.Package package_, EList visibleMembers) {

		for (Iterator ownedMembers = package_.getOwnedMembers().iterator(); ownedMembers
			.hasNext();) {

			PackageableElement ownedMember = (PackageableElement) ownedMembers
				.next();

			if (ownedMember.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				visibleMembers.add(ownedMember);
			}
		}

		for (Iterator elementImports = package_.getElementImports().iterator(); elementImports
			.hasNext();) {

			ElementImport elementImport = (ElementImport) elementImports.next();

			if (elementImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
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
	 * result = member->select( m | self.makesVisible(m))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList visibleMembers(org.eclipse.uml2.uml.Package package_) {
		EList visibleMembers = visibleMembers(package_,
			new UniqueEList.FastCompare());

		for (Iterator allImportedPackages = getAllImportedPackages(package_,
			new UniqueEList.FastCompare()).iterator(); allImportedPackages
			.hasNext();) {

			visibleMembers((org.eclipse.uml2.uml.Package) allImportedPackages
				.next(), visibleMembers);
		}

		return ECollections.unmodifiableEList(visibleMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * self.member->includes(el)
	 * result = (ownedMember->includes(el)) or
	 * (elementImport->select(ei|ei.importedElement = #public)->collect(ei|ei.importedElement)->includes(el)) or
	 * (packageImport->select(pi|pi.visibility = #public)->collect(pi|pi.importedPackage.member->includes(el))->notEmpty())
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean makesVisible(org.eclipse.uml2.uml.Package package_,
			NamedElement el) {

		if (package_.getOwnedMembers().contains(el)) {
			return el.getVisibility() == VisibilityKind.PUBLIC_LITERAL;
		}

		for (Iterator elementImports = package_.getElementImports().iterator(); elementImports
			.hasNext();) {

			ElementImport elementImport = (ElementImport) elementImports.next();

			if (safeEquals(elementImport.getImportedElement(), el)) {
				return elementImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL;
			}
		}

		for (Iterator packageImports = package_.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (packageImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
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
	 * The query mustBeOwned() indicates whether elements of this type must have an owner.
	 * result = false
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(org.eclipse.uml2.uml.Package package_) {
		return false;
	}

} // PackageOperations