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
 * $Id: ClassOperations.java,v 1.19 2006/05/09 17:53:38 khussey Exp $
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
import org.eclipse.uml2.uml.UMLPlugin;

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
 *   <li>{@link org.eclipse.uml2.uml.Class#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#isMetaclass() <em>Is Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassOperations
		extends StructuredClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A passive class may not own receptions.
	 * not self.isActive implies self.ownedReception.isEmpty()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validatePassiveClass(
			org.eclipse.uml2.uml.Class class_, DiagnosticChain diagnostics,
			Map context) {

		if (!class_.isActive() && !(class_.getOwnedReceptions().isEmpty())) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASS__PASSIVE_CLASS, UMLPlugin.INSTANCE
						.getString("_UI_Class_PassiveClass_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, class_)),
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
		EList extensions = ECollections.EMPTY_ELIST;

		if (class_.isMetaclass()) {
			extensions = new UniqueEList.FastCompare();

			for (Iterator nonNavigableInverseReferences = getNonNavigableInverseReferences(
				class_).iterator(); nonNavigableInverseReferences.hasNext();) {

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
			org.eclipse.uml2.uml.Class class_, String name,
			EList parameterNames, EList parameterTypes, Type returnType) {
		return TypeOperations.createOwnedOperation(class_, name,
			parameterNames, parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isMetaclass(org.eclipse.uml2.uml.Class class_) {
		return class_.getAppliedStereotype("Standard" //$NON-NLS-1$
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
		EList inherit = new UniqueEList.FastCompare();

		EList redefinedElements = new UniqueEList.FastCompare();

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