/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Class#validatePassiveClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Passive Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#isMetaclass() <em>Is Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getExtensions() <em>Get Extensions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getSuperClasses() <em>Get Super Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassOperations
		extends EncapsulatedClassifierOperations {

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
	 * Only an active Class may own Receptions and have a classifierBehavior.
	 * not isActive implies (ownedReception->isEmpty() and classifierBehavior = null)
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validatePassiveClass(
			org.eclipse.uml2.uml.Class class_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (!class_.isActive() && !(class_.getOwnedReceptions().isEmpty()
			&& class_.getClassifierBehavior() == null)) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASS__PASSIVE_CLASS,
					UMLPlugin.INSTANCE.getString(
						"_UI_Class_PassiveClass_diagnostic", //$NON-NLS-1$
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
	 * <!-- begin-model-doc -->
	 * Derivation for Class::/extension : Extension
	 * result = (Extension.allInstances()->select(ext | 
	 *   let endTypes : Sequence(Classifier) = ext.memberEnd->collect(type.oclAsType(Classifier)) in
	 *   endTypes->includes(self) or endTypes.allParents()->includes(self) ))
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Extension> getExtensions(
			org.eclipse.uml2.uml.Class class_) {
		EList<Extension> extensions = new UniqueEList.FastCompare<Extension>();

		getExtensions(class_, extensions);

		for (Classifier parent : class_.allParents()) {

			if (parent instanceof org.eclipse.uml2.uml.Class) {
				getExtensions((org.eclipse.uml2.uml.Class) parent, extensions);
			}
		}

		return new UnionEObjectEList<Extension>((InternalEObject) class_,
			UMLPackage.Literals.CLASS__EXTENSION, extensions.size(),
			extensions.toArray());
	}

	protected static EList<Extension> getExtensions(
			org.eclipse.uml2.uml.Class class_, EList<Extension> extensions) {

		if (class_.isMetaclass()) {

			for (EStructuralFeature.Setting nonNavigableInverseReference : getNonNavigableInverseReferences(
				class_)) {

				if (nonNavigableInverseReference
					.getEStructuralFeature() == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {
					EObject eObject = nonNavigableInverseReference.getEObject();

					if (eObject instanceof Property) {
						Association association = ((Property) eObject)
							.getAssociation();

						if (association instanceof Extension) {
							extensions.add((Extension) association);
						}
					}
				}
			}
		}

		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Class::/superClass : Class
	 * result = (self.general()->select(oclIsKindOf(Class))->collect(oclAsType(Class))->asSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Class> getSuperClasses(
			org.eclipse.uml2.uml.Class class_) {
		return class_.getSuperClasses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this class.
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(
			org.eclipse.uml2.uml.Class class_, String name,
			EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
		return TypeOperations.createOwnedOperation(class_, name, parameterNames,
			parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this class is a metaclass.
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isMetaclass(org.eclipse.uml2.uml.Class class_) {
		return class_.getAppliedStereotype("StandardProfile" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "Metaclass") != null; //$NON-NLS-1$
	}

} // ClassOperations