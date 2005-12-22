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
 * $Id: ClassOperations.java,v 1.7 2005/12/22 20:21:23 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Class#validatePassiveClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Passive Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getExtensions() <em>Get Extensions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#inherit(java.util.List) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ClassOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClassOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A passive class may not own receptions.
	 * not self.isActive implies self.ownedReception.isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePassiveClass(
			org.eclipse.uml2.uml.Class class_, DiagnosticChain diagnostics,
			Map context) {
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
						UMLValidator.CLASS__PASSIVE_CLASS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePassiveClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(class_, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{class_}));
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
	public static EList getExtensions(org.eclipse.uml2.uml.Class class_) {
		EList extensions = new UniqueEList();

		for (Iterator nonNavigableInverseReferences = CROSS_REFERENCE_ADAPTER
			.getNonNavigableInverseReferences(class_).iterator(); nonNavigableInverseReferences
			.hasNext();) {

			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) nonNavigableInverseReferences
				.next();

			if (setting.getEStructuralFeature() == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {
				EObject eObject = setting.getEObject();

				if (eObject instanceof Property) {
					Association association = ((Property) eObject)
						.getAssociation();

					if (association instanceof Extension) {
						extensions.add(association);
					}
				}
			}
		}

		return new UnionEObjectEList((InternalEObject) class_,
			UMLPackage.Literals.CLASS__EXTENSION, extensions.size(), extensions
				.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(
			org.eclipse.uml2.uml.Class class_, String name, Type returnType,
			EList parameterNames, EList parameterTypes) {
		return TypeOperations.createOwnedOperation(class_, name, returnType,
			parameterNames, parameterTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isMetaclass(org.eclipse.uml2.uml.Class class_) {
		return class_.getAppliedStereotype("UML" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "Metaclass") != null; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties.
	 * result = inhs->excluding(inh | ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList inherit(org.eclipse.uml2.uml.Class class_, EList inhs) {
		EList inherit = new UniqueEList();

		EList redefinedElements = new UniqueEList();

		for (Iterator ownedMembers = class_.getOwnedMembers().iterator(); ownedMembers
			.hasNext();) {

			Object ownedMember = ownedMembers.next();

			if (ownedMember instanceof RedefinableElement) {
				redefinedElements.addAll(((RedefinableElement) ownedMember)
					.getRedefinedElements());
			}
		}

		for (Iterator i = inhs.iterator(); i.hasNext();) {
			Object inh = i.next();

			if (!redefinedElements.contains(inh)) {
				inherit.add(inh);
			}
		}

		return ECollections.unmodifiableEList(inherit);
	}

} // ClassOperations