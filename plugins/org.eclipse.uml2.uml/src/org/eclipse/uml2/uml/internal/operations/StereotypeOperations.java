/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 351777, 382718, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Stereotype</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBinaryAssociationsOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateGeneralize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Generalize</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateNameNotClash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Name Not Clash</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateAssociationEndOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association End Ownership</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyUpperBound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicitySingleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Multiplicity Single Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateBasePropertyMultiplicityMultipleExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Base Property Multiplicity Multiple Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createExtension(org.eclipse.uml2.uml.Class, boolean) <em>Create Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String) <em>Create Icon</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String, java.lang.String) <em>Create Icon</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses() <em>Get All Extended Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getDefinition() <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses() <em>Get Extended Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword() <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword(boolean) <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#containingProfile() <em>Containing Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getProfile() <em>Get Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypeOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotypes may only participate in binary associations.
	 * ownedAttribute.association->forAll(memberEnd->size()=2)
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBinaryAssociationsOnly(Stereotype stereotype,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STEREOTYPE__BINARY_ASSOCIATIONS_ONLY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateBinaryAssociationsOnly", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stereotype, context)}),
					new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype names should not clash with keyword names for the extended model element.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNameNotClash(Stereotype stereotype,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STEREOTYPE__NAME_NOT_CLASH,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNameNotClash", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stereotype, context)}),
					new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a stereotype’s property is an association end for an association other than a kind of extension, and the other end is not a stereotype, the other end must be owned by the association itself.
	 * ownedAttribute
	 * ->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))
	 * ->forAll(opposite.owner = association)
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociationEndOwnership(Stereotype stereotype,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STEREOTYPE__ASSOCIATION_END_OWNERSHIP,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAssociationEndOwnership", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stereotype, context)}),
					new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of base-properties is exactly 1.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBasePropertyUpperBound(Stereotype stereotype,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STEREOTYPE__BASE_PROPERTY_UPPER_BOUND,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateBasePropertyUpperBound", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stereotype, context)}),
					new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Stereotype extends only one metaclass, the multiplicity of the corresponding base-property shall be 1..1.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBasePropertyMultiplicitySingleExtension(
			Stereotype stereotype, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STEREOTYPE__BASE_PROPERTY_MULTIPLICITY_SINGLE_EXTENSION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{
							"validateBasePropertyMultiplicitySingleExtension", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stereotype, context)}),
					new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Stereotype extends more than one metaclass, the multiplicity of the corresponding base-properties shall be [0..1]. At any point in time, only one of these base-properties can contain a metaclass instance during runtime.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBasePropertyMultiplicityMultipleExtension(
			Stereotype stereotype, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STEREOTYPE__BASE_PROPERTY_MULTIPLICITY_MULTIPLE_EXTENSION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{
							"validateBasePropertyMultiplicityMultipleExtension", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stereotype, context)}),
					new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Stereotype may only generalize or specialize another Stereotype.
	 * allParents()->forAll(oclIsKindOf(Stereotype)) 
	 * and Classifier.allInstances()->forAll(c | c.allParents()->exists(oclIsKindOf(Stereotype)) implies c.oclIsKindOf(Stereotype))
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralize(Stereotype stereotype,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.STEREOTYPE__GENERALIZE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateGeneralize", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(stereotype, context)}),
					new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (required) extension of the specified metaclass with this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param metaclass The metaclass for the new extension.
	 * @param isRequired Whether the new extension should be required.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Extension createExtension(Stereotype stereotype,
			org.eclipse.uml2.uml.Class metaclass, boolean isRequired) {
		String name = stereotype.getName();

		if (isEmpty(name)) {
			throw new IllegalStateException();
		}

		Profile profile = stereotype.getProfile();

		if (profile == null) {
			throw new IllegalStateException();
		}

		if (metaclass == null || !metaclass.isMetaclass()
			|| stereotype.getExtendedMetaclasses().contains(metaclass)) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

		if (!profile.getReferencedMetaclasses().contains(metaclass) && !profile
			.getReferencedMetamodels().contains(metaclass.getModel())) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

		String metaclassName = metaclass.getName();
		Extension extension = (Extension) stereotype.getNearestPackage()
			.createOwnedType(metaclassName + '_' + name,
				UMLPackage.Literals.EXTENSION);

		ExtensionEnd extensionEnd = (ExtensionEnd) extension.createOwnedEnd(
			Extension.STEREOTYPE_ROLE_PREFIX + name, stereotype,
			UMLPackage.Literals.EXTENSION_END);
		extensionEnd.setAggregation(AggregationKind.COMPOSITE_LITERAL);

		if (isRequired) {
			extensionEnd.setLower(1);
		}

		Property property = stereotype.createOwnedAttribute(
			Extension.METACLASS_ROLE_PREFIX + metaclassName, metaclass);
		property.setAssociation(extension);

		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stereotype must be contained, directly or indirectly, in a profile.
	 * result = (self.containingProfile())
	 * <p>From package UML::Packages.</p>
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile getProfile(Stereotype stereotype) {
		return containingProfile(stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the localized keyword for this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getKeyword(Stereotype stereotype) {
		return stereotype.getKeyword(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the keyword for this stereotype, localized if indicated.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param localize Whether to localize the keyword.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getKeyword(Stereotype stereotype, boolean localize) {
		String qualifiedName = stereotype.getQualifiedName();
		String keyword = getString(stereotype,
			getValidJavaIdentifier(isEmpty(qualifiedName)
				? EMPTY_STRING
				: qualifiedName.replace(':', '_')),
			EMPTY_STRING, localize);

		if (isEmpty(keyword)) {
			keyword = getValidJavaIdentifier(stereotype.getName());
		}

		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile returns the closest profile directly or indirectly containing this stereotype.
	 * result = (self.namespace.oclAsType(Package).containingProfile())
	 * <p>From package UML::Packages.</p>
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile containingProfile(Stereotype stereotype) {
		return (Profile) getOwningElement(stereotype,
			UMLPackage.Literals.PROFILE, true);
	}

	protected static EList<org.eclipse.uml2.uml.Class> getExtendedMetaclasses(
			Stereotype stereotype,
			EList<org.eclipse.uml2.uml.Class> extendedMetaclasses) {

		for (Property ownedAttribute : stereotype.getOwnedAttributes()) {

			if (ownedAttribute.getAssociation() instanceof Extension) {
				Type type = ownedAttribute.getType();

				if (type instanceof org.eclipse.uml2.uml.Class) {
					extendedMetaclasses.add((org.eclipse.uml2.uml.Class) type);
				}
			}
		}

		return extendedMetaclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metaclasses extended by this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Class> getExtendedMetaclasses(
			Stereotype stereotype) {
		return ECollections.unmodifiableEList(getExtendedMetaclasses(stereotype,
			new UniqueEList.FastCompare<org.eclipse.uml2.uml.Class>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the metaclasses extended by this stereotype, including the metaclasses extended by its superstereotypes.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Class> getAllExtendedMetaclasses(
			Stereotype stereotype) {
		EList<org.eclipse.uml2.uml.Class> allExtendedMetaclasses = getExtendedMetaclasses(
			stereotype,
			new UniqueEList.FastCompare<org.eclipse.uml2.uml.Class>());

		for (Classifier parent : stereotype.allParents()) {

			if (parent instanceof Stereotype) {
				getExtendedMetaclasses((Stereotype) parent,
					allExtendedMetaclasses);
			}
		}

		return ECollections.unmodifiableEList(allExtendedMetaclasses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EClass getDefinition(Stereotype stereotype) {
		Profile profile = stereotype.getProfile();
		return profile == null
			? null
			: (EClass) profile.getDefinition(stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified location for this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param location The location for the new icon.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Image createIcon(Stereotype stereotype, String location) {
		Image icon = stereotype.createIcon();
		icon.setLocation(location);
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified format and content for this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param format The format for the new icon.
	 * @param content The content for the new icon.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Image createIcon(Stereotype stereotype, String format,
			String content) {
		Image icon = stereotype.createIcon();
		icon.setFormat(format);
		icon.setContent(content);
		return icon;
	}

} // StereotypeOperations