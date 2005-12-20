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
 * $Id: ProfileOperations.java,v 1.5 2005/12/20 16:34:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.Profile;

import org.eclipse.uml2.uml.Stereotype;

import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Profile</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Profile#validateMetaclassReferenceNotSpecialized(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Metaclass Reference Not Specialized</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#validateReferencesSameMetamodel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate References Same Metamodel</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#create(org.eclipse.uml2.uml.Classifier) <em>Create</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#createMetaclassReference(org.eclipse.uml2.uml.Class) <em>Create Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#createMetamodelReference(org.eclipse.uml2.uml.Model) <em>Create Metamodel Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#createOwnedStereotype(java.lang.String, boolean) <em>Create Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#isDefined() <em>Is Defined</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#define() <em>Define</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getDefinition() <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getDefinition(org.eclipse.uml2.uml.NamedElement) <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getReferencedMetaclasses() <em>Get Referenced Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getReferencedMetamodels() <em>Get Referenced Metamodels</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#allOwningPackages() <em>All Owning Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ProfileOperations
		extends UMLOperations {

	public static final class Profile2EPackageConverter
			extends UML2EcoreConverter {

		public Object caseProfile(Profile profile) {
			EPackage ePackage = packages.contains(profile)
				? EcoreFactory.eINSTANCE.createEPackage()
				: (EPackage) doSwitch((Profile) packages.iterator().next());
			elementToEModelElementMap.put(profile, ePackage);

			if (packages.contains(profile)) {
				setName(ePackage, profile);

				String name = ePackage.getName();
				ePackage.setNsPrefix(name);
				ePackage.setNsURI("http:///" + name + EcoreUtil.generateUUID() //$NON-NLS-1$
					+ "." + UMLResource.PROFILE_FILE_EXTENSION); //$NON-NLS-1$				
			}

			defaultCase(profile);

			return ePackage;
		}

		protected EClassifier getEType(Type type) {

			if (type instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class class_ = (org.eclipse.uml2.uml.Class) type;

				if (class_.isMetaclass()) {
					return UMLPackage.eINSTANCE
						.getEClassifier(class_.getName());
				}
			}

			return super.getEType(type);
		}

		protected void setName(final ENamedElement eNamedElement,
				NamedElement namedElement) {

			new UMLSwitch() {

				public Object caseClassifier(Classifier classifier) {
					setName(eNamedElement, classifier.getQualifiedName(), true);
					return classifier;
				}

				public Object caseEnumerationLiteral(
						EnumerationLiteral enumerationLiteral) {
					setName(eNamedElement, enumerationLiteral.getName(), false);
					return enumerationLiteral;
				}

				public Object caseProfile(Profile profile) {
					setName(eNamedElement, profile.getQualifiedName(), true);
					return profile;
				}

			}.doSwitch(namedElement);
		}

		public Object doSwitch(EObject eObject) {
			Object eModelElement = super.doSwitch(eObject);

			if (eModelElement instanceof EClassifier) {
				EList references = getEAnnotation((EClassifier) eModelElement,
					UMLPackage.eNS_URI, true).getReferences();

				if (references.isEmpty()) {
					references.add(eObject);
				}
			}

			return eModelElement;
		}

		public static EPackage convert(Profile profile) {
			Collection ePackages = new Profile2EPackageConverter().convert(
				Collections.singleton(profile), null, null, null);
			return ePackages.size() == 1
				? (EPackage) ePackages.iterator().next()
				: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProfileOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element imported as a metaclassReference is not specialized or generalized in a Profile.
	 * self.metaclassReference.importedElement->
	 * 
	 *   select(c | c.oclIsKindOf(Classifier) and
	 * 
	 *     (c.generalization.namespace = self or
	 * 
	 *       (c.specialization.namespace = self) )->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMetaclassReferenceNotSpecialized(
			Profile profile, DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.PROFILE__METACLASS_REFERENCE_NOT_SPECIALIZED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMetaclassReferenceNotSpecialized", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(profile, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{profile}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements imported either as metaclassReferences or through metamodelReferences are members of the same base reference metamodel.
	 * self.metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages())->
	 * 
	 *   union(self.metaclassReference.importedElement.allOwningPackages() )->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferencesSameMetamodel(Profile profile,
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
						UMLValidator.PROFILE__REFERENCES_SAME_METAMODEL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateReferencesSameMetamodel", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(profile, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{profile}));
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
	public static EObject create(Profile profile, Classifier classifier) {
		ENamedElement definition = profile.getDefinition(classifier);

		if (definition instanceof EClass) {
			EClass eClass = (EClass) definition;
			return eClass.getEPackage().getEFactoryInstance().create(eClass);
		}

		throw new IllegalArgumentException(String.valueOf(classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ElementImport createMetaclassReference(Profile profile,
			org.eclipse.uml2.uml.Class metaclass) {

		if (metaclass == null
			|| profile.getReferencedMetaclasses().contains(metaclass)) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

		ElementImport metaclassReference = profile.createElementImport(
			metaclass, VisibilityKind.PUBLIC_LITERAL);

		profile.getMetaclassReferences().add(metaclassReference);

		return metaclassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static PackageImport createMetamodelReference(Profile profile,
			Model metamodel) {

		if (metamodel == null
			|| profile.getReferencedMetamodels().contains(metamodel)) {

			throw new IllegalArgumentException(String.valueOf(metamodel));
		}

		PackageImport metamodelReference = profile.createPackageImport(
			metamodel, VisibilityKind.PUBLIC_LITERAL);

		profile.getMetamodelReferences().add(metamodelReference);

		return metamodelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Stereotype createOwnedStereotype(Profile profile,
			String name, boolean isAbstract) {

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		Stereotype ownedStereotype = (Stereotype) profile
			.createPackagedElement(UMLPackage.Literals.STEREOTYPE);
		ownedStereotype.setName(name);
		ownedStereotype.setIsAbstract(isAbstract);
		return ownedStereotype;
}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isDefined(Profile profile) {
		EAnnotation eAnnotation = profile.getEAnnotation(UMLPackage.eNS_URI);
		return eAnnotation != null && eAnnotation.getContents().size() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EPackage define(Profile profile) {
		EPackage definition = Profile2EPackageConverter.convert(profile);
		getEAnnotation(profile, UMLPackage.eNS_URI, true).getContents().add(0,
			definition);
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EPackage getDefinition(Profile profile) {
		EAnnotation eAnnotation = profile.getEAnnotation(UMLPackage.eNS_URI);

		if (eAnnotation != null) {
			EList contents = eAnnotation.getContents();

			if (contents.size() > 0) {
				return (EPackage) contents.get(0);
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ENamedElement getDefinition(final Profile profile,
			NamedElement namedElement) {

		return (ENamedElement) new UMLSwitch() {

			public Object caseClassifier(Classifier classifier) {
				EPackage profileDefinition = profile.getDefinition();
				return profileDefinition == null
					? null
					: profileDefinition
						.getEClassifier(getValidJavaIdentifier(classifier
							.getQualifiedName()));
			}

			public Object caseEnumerationLiteral(
					EnumerationLiteral enumerationLiteral) {
				Object enumerationDefinition = doSwitch(enumerationLiteral
					.getEnumeration());
				return enumerationDefinition instanceof EEnum
					? ((EEnum) enumerationDefinition)
						.getEEnumLiteral(enumerationLiteral.getName())
					: null;
			}

			public Object caseProperty(Property property) {
				Object namespaceDefinition = doSwitch(property.getNamespace());
				return namespaceDefinition instanceof EClass
					? ((EClass) namespaceDefinition)
						.getEStructuralFeature(getValidJavaIdentifier(property
							.getName()))
					: null;
			}

			public Object casePackage(org.eclipse.uml2.uml.Package package_) {
				return package_ == profile
					? profile.getDefinition()
					: null;
			}

			public Object doSwitch(EObject eObject) {
				return eObject == null
					? null
					: super.doSwitch(eObject);
			}
		}.doSwitch(namedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getReferencedMetaclasses(Profile profile) {
		EList referencedMetaclasses = new UniqueEList();

		for (Iterator metaclassReferences = profile.getMetaclassReferences()
			.iterator(); metaclassReferences.hasNext();) {

			PackageableElement importedElement = ((ElementImport) metaclassReferences
				.next()).getImportedElement();

			if (importedElement != null) {
				referencedMetaclasses.add(importedElement);
			}
		}

		return ECollections.unmodifiableEList(referencedMetaclasses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getReferencedMetamodels(Profile profile) {
		EList referencedMetamodels = new UniqueEList();

		for (Iterator metamodelReferences = profile.getMetamodelReferences()
			.iterator(); metamodelReferences.hasNext();) {

			org.eclipse.uml2.uml.Package importedPackage = ((PackageImport) metamodelReferences
				.next()).getImportedPackage();

			if (importedPackage != null) {
				referencedMetamodels.add(importedPackage);
			}
		}

		return ECollections.unmodifiableEList(referencedMetamodels);
	}

} // ProfileOperations