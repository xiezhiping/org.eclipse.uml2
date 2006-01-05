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
 * $Id: StereotypeOperations.java,v 1.6 2006/01/05 22:43:26 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Extension;
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
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateNameNotClash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Name Not Clash</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateGeneralize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Generalize</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createExtension(org.eclipse.uml2.uml.Class, boolean) <em>Create Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getProfile() <em>Get Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword() <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword(boolean) <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses() <em>Get Extended Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses() <em>Get All Extended Metaclasses</em>}</li>
 * </ul>
 * </p>
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
	 * Stereotype names should not clash with keyword names for the extended model element.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNameNotClash(Stereotype stereotype,
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
						UMLValidator.STEREOTYPE__NAME_NOT_CLASH,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNameNotClash", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stereotype, context)}), //$NON-NLS-1$ //$NON-NLS-2$
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
	 * generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) 
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralize(Stereotype stereotype,
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
						UMLValidator.STEREOTYPE__GENERALIZE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGeneralize", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stereotype, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stereotype}));
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
			.createPackagedElement(UMLPackage.Literals.EXTENSION);

		extension.setName(metaclassName + '_' + name);

		ExtensionEnd extensionEnd = (ExtensionEnd) extension
			.createOwnedEnd(UMLPackage.Literals.EXTENSION_END);

		extensionEnd.setName(Extension.STEREOTYPE_ROLE_PREFIX + name);
		extensionEnd.setAggregation(AggregationKind.COMPOSITE_LITERAL);
		extensionEnd.setType(stereotype);

		if (!isRequired) {
			extensionEnd.setLower(0);
		}

		Property property = stereotype
			.createOwnedAttribute(UMLPackage.Literals.PROPERTY);

		property.setName(Extension.METACLASS_ROLE_PREFIX + metaclassName);
		property.setType(metaclass);
		property.setAssociation(extension);

		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Profile getProfile(Stereotype stereotype) {
		return (Profile) getOwningElement(stereotype,
			UMLPackage.Literals.PROFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getKeyword(Stereotype stereotype) {
		return stereotype.getKeyword(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getKeyword(Stereotype stereotype, boolean isLocalized) {
		String keyword = getString(stereotype,
			getValidJavaIdentifier(stereotype.getQualifiedName().replace(':',
				'_')), EMPTY_STRING, isLocalized);

		if (isEmpty(keyword)) {
			String identifier = getValidJavaIdentifier(stereotype.getName());

			keyword = identifier.length() > 0
				? Character.toLowerCase(identifier.charAt(0))
					+ identifier.substring(1)
				: identifier;
		}

		return keyword;
	}

	protected static EList getExtendedMetaclasses(Stereotype stereotype,
			EList extendedMetaclasses) {

		for (Iterator ownedAttributes = stereotype.getOwnedAttributes()
			.iterator(); ownedAttributes.hasNext();) {

			Property property = (Property) ownedAttributes.next();

			if (property.getAssociation() instanceof Extension) {
				Type type = property.getType();

				if (type instanceof org.eclipse.uml2.uml.Class) {
					extendedMetaclasses.add(type);
				}
			}
		}

		return extendedMetaclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getExtendedMetaclasses(Stereotype stereotype) {
		return ECollections.unmodifiableEList(getExtendedMetaclasses(
			stereotype, new UniqueEList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAllExtendedMetaclasses(Stereotype stereotype) {
		EList allExtendedMetaclasses = getExtendedMetaclasses(stereotype,
			new UniqueEList());

		for (Iterator allParents = stereotype.allParents().iterator(); allParents
			.hasNext();) {

			Object parent = allParents.next();

			if (parent instanceof Stereotype) {
				getExtendedMetaclasses((Stereotype) parent,
					allExtendedMetaclasses);
			}
		}

		return ECollections.unmodifiableEList(allExtendedMetaclasses);
	}

} // StereotypeOperations