/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181, 354452
 *   Kenn Hussey (CEA) - 327039, 392833, 163556, 451350, 485756
 *   Christian W. Damus (CEA) - 405065
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Profile</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Profile#validateMetaclassReferenceNotSpecialized(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Metaclass Reference Not Specialized</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#validateReferencesSameMetamodel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate References Same Metamodel</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#create(org.eclipse.uml2.uml.Classifier) <em>Create</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#define() <em>Define</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#define(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Define</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getDefinition() <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getDefinition(org.eclipse.uml2.uml.NamedElement) <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getOwnedExtensions(boolean) <em>Get Owned Extensions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getReferencedMetaclasses() <em>Get Referenced Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getReferencedMetamodels() <em>Get Referenced Metamodels</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#isDefined() <em>Is Defined</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileOperations
		extends PackageOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element imported as a metaclassReference is not specialized or generalized in a Profile.
	 * metaclassReference.importedElement->
	 * 	select(c | c.oclIsKindOf(Classifier) and
	 * 		(c.oclAsType(Classifier).allParents()->collect(namespace)->includes(self)))->isEmpty()
	 * and 
	 * packagedElement->
	 *     select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier).allParents())->
	 *        intersection(metaclassReference.importedElement->select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier)))->isEmpty()
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMetaclassReferenceNotSpecialized(
			Profile profile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (org.eclipse.uml2.uml.Class referencedMetaclass : profile
			.getReferencedMetaclasses()) {

			for (TreeIterator<EObject> allContents = getAllContents(profile,
				true, false); allContents.hasNext();) {

				EObject eObject = allContents.next();

				if (eObject instanceof org.eclipse.uml2.uml.Package
					&& containsSpecializations(
						(org.eclipse.uml2.uml.Package) eObject,
						referencedMetaclass)) {

					result = false;
					break;
				}
			}

			if (result) {

				for (Classifier parent : referencedMetaclass.allParents()) {

					if (EcoreUtil.isAncestor(profile, parent)) {
						result = false;
						break;
					}
				}
			}
		}

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.PROFILE__METACLASS_REFERENCE_NOT_SPECIALIZED,
				UMLPlugin.INSTANCE.getString(
					"_UI_Profile_MetaclassReferenceNotSpecialized_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, profile)),
				new Object[]{profile}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements imported either as metaclassReferences or through metamodelReferences are members of the same base reference metamodel.
	 * metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages()->
	 *   union(metaclassReference.importedElement.allOwningPackages() )->notEmpty()
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateReferencesSameMetamodel(Profile profile,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		EList<Model> metamodels = new UniqueEList.FastCompare<Model>(
			profile.getReferencedMetamodels());

		for (org.eclipse.uml2.uml.Class referencedMetaclass : profile
			.getReferencedMetaclasses()) {

			metamodels.add(referencedMetaclass.getModel());
		}

		if (metamodels.size() != 1) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROFILE__REFERENCES_SAME_METAMODEL,
					UMLPlugin.INSTANCE.getString(
						"_UI_Profile_ReferencesSameMetamodel_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, profile)),
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
	 * Creates and returns an instance of (the Ecore representation of) the specified classifier defined in this profile.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * @param classifier The classifier of which to create an instance.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EObject create(Profile profile, Classifier classifier) {
		ENamedElement definition = profile.getDefinition(classifier);

		if (definition instanceof EClass) {
			return EcoreUtil.create((EClass) definition);
		}

		throw new IllegalArgumentException(String.valueOf(classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this profile is defined.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDefined(Profile profile) {
		return profile.getDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines this profile by (re)creating Ecore representations of its current contents.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EPackage define(Profile profile) {
		Map<String, String> options = new HashMap<String, String>();

		options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			OPTION__PROCESS);
		options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
			OPTION__PROCESS);
		options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			OPTION__PROCESS);
		options.put(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS,
			OPTION__IGNORE);
		options.put(UML2EcoreConverter.OPTION__OPERATION_BODIES,
			OPTION__IGNORE);
		options.put(UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
			OPTION__IGNORE);
		options.put(UML2EcoreConverter.OPTION__COMMENTS, OPTION__IGNORE);

		return profile.define(options, null, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines this profile by (re)creating Ecore representations of its current contents, using the specified options, diagnostics, and context.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * @param options The options to use.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EPackage define(Profile profile, Map<String, String> options,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		Collection<EPackage> ePackages = convertToEcore(profile, options,
			diagnostics, context);
		EPackage definition = ePackages.size() == 1
			? ePackages.iterator().next()
			: null;

		if (definition != null) {
			getEAnnotation(profile, UML2_UML_PACKAGE_2_0_NS_URI, true)
				.getContents().add(0, definition);
		}

		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of this profile.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EPackage getDefinition(Profile profile) {
		EPackage definition = getEPackage(profile);

		if (definition == null) {
			EAnnotation eAnnotation = profile
				.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);

			if (eAnnotation != null) {
				EList<EObject> contents = eAnnotation.getContents();

				if (contents.size() > 0) {
					definition = (EPackage) contents.get(0);
				}
			}
		}

		return definition;
	}

	protected static ENamedElement getDefinition(Profile profile,
			NamedElement namedElement, EPackage profileDefinition) {

		if (namedElement instanceof Classifier) {
			ENamedElement packageDefinition = getDefinition(profile,
				((Classifier) namedElement).getPackage(), profileDefinition);

			if (packageDefinition instanceof EPackage) {

				if (packageDefinition.eContainer() instanceof EAnnotation) {

					for (EClassifier eClassifier : ((EPackage) packageDefinition)
						.getEClassifiers()) {

						EAnnotation eAnnotation = eClassifier
							.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);

						if (eAnnotation != null && eAnnotation.getReferences()
							.contains(namedElement)) {

							return eClassifier;
						}
					}
				} else {
					return ((EPackage) packageDefinition)
						.getEClassifier(getEcoreName(namedElement));
				}
			}

			return null;
		} else if (namedElement instanceof Property) {
			ENamedElement namespaceDefinition = getDefinition(profile,
				namedElement.getNamespace(), profileDefinition);
			return namespaceDefinition instanceof EClass
				? ((EClass) namespaceDefinition)
					.getEStructuralFeature(getEcoreName(namedElement))
				: null;
		} else if (namedElement instanceof EnumerationLiteral) {
			ENamedElement namespaceDefinition = getDefinition(profile,
				namedElement.getNamespace(), profileDefinition);
			return namespaceDefinition instanceof EEnum
				? ((EEnum) namespaceDefinition)
					.getEEnumLiteral(getEcoreName(namedElement))
				: null;
		} else if (namedElement instanceof Profile) {

			if (namedElement != profile) {
				EAnnotation eAnnotation = profileDefinition
					.getEAnnotation(UML2_UML_PACKAGE_4_1_NS_URI);

				if (eAnnotation != null) {

					for (EObject reference : eAnnotation.getReferences()) {

						if (reference instanceof EPackage) {
							EPackage ePackage = (EPackage) reference;

							if (getProfile(ePackage, profile) == namedElement) {
								return ePackage;
							}
						}
					}
				}
			}

			return profileDefinition;
		} else if (namedElement instanceof org.eclipse.uml2.uml.Package) {
			ENamedElement packageDefinition = getDefinition(profile,
				((org.eclipse.uml2.uml.Package) namedElement)
					.getNestingPackage(),
				profileDefinition);

			if (packageDefinition instanceof EPackage) {

				if (profileDefinition.eContainer() instanceof EAnnotation) {

					for (EPackage eSubpackage : ((EPackage) packageDefinition)
						.getESubpackages()) {

						EAnnotation eAnnotation = eSubpackage
							.getEAnnotation(UML2_UML_PACKAGE_4_0_NS_URI);

						if (eAnnotation != null && eAnnotation.getReferences()
							.contains(namedElement)) {

							return eSubpackage;
						}
					}
				} else {
					String name = getEcoreName(namedElement);

					for (EPackage eSubpackage : ((EPackage) packageDefinition)
						.getESubpackages()) {

						if (safeEquals(eSubpackage.getName(), name)) {
							return eSubpackage;
						}
					}
				}
			}

			return getDefinition(profile,
				((org.eclipse.uml2.uml.Package) namedElement)
					.containingProfile(),
				profileDefinition);
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of the specified named element in this profile.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * @param namedElement The named element whose definition to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ENamedElement getDefinition(Profile profile,
			NamedElement namedElement) {
		return getDefinition(profile, namedElement, profile.getDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metaclasses referenced by this profile.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Class> getReferencedMetaclasses(
			Profile profile) {
		EList<org.eclipse.uml2.uml.Class> referencedMetaclasses = new UniqueEList.FastCompare<org.eclipse.uml2.uml.Class>();

		for (ElementImport metaclassReference : profile
			.getMetaclassReferences()) {

			PackageableElement importedElement = metaclassReference
				.getImportedElement();

			if (importedElement instanceof org.eclipse.uml2.uml.Class) {
				referencedMetaclasses
					.add((org.eclipse.uml2.uml.Class) importedElement);
			}
		}

		return ECollections.unmodifiableEList(referencedMetaclasses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metamodels referenced by this profile.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Model> getReferencedMetamodels(Profile profile) {
		EList<Model> referencedMetamodels = new UniqueEList.FastCompare<Model>();

		for (PackageImport metamodelReference : profile
			.getMetamodelReferences()) {

			org.eclipse.uml2.uml.Package importedPackage = metamodelReference
				.getImportedPackage();

			if (importedPackage instanceof Model) {
				referencedMetamodels.add((Model) importedPackage);
			}
		}

		return ECollections.unmodifiableEList(referencedMetamodels);
	}

	protected static EList<Extension> getOwnedExtensions(Profile profile,
			boolean requiredOnly, EList<Extension> ownedExtensions) {

		for (Extension extension : EcoreUtil.<Extension> getObjectsByType(
			profile.getPackagedElements(), UMLPackage.Literals.EXTENSION)) {

			if (!requiredOnly || extension.isRequired()) {
				ownedExtensions.add(extension);
			}
		}

		return ownedExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the extensions owned by this profile, excluding non-required extensions if indicated.
	 * @param profile The receiving '<em><b>Profile</b></em>' model object.
	 * @param requiredOnly Whether to retrieve only required extensions.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Extension> getOwnedExtensions(Profile profile,
			boolean requiredOnly) {
		return ECollections.unmodifiableEList(getOwnedExtensions(profile,
			requiredOnly, new UniqueEList.FastCompare<Extension>()));
	}

} // ProfileOperations