/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship from an extending UseCase to an extended UseCase that specifies how and when the behavior defined in the extending UseCase can be inserted into the behavior defined in the extended UseCase.
 * <p>From package UML::UseCases.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getExtensionLocations <em>Extension Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend
		extends NamedElement, DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Extended Case</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that is being extended.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Case</em>' reference.
	 * @see #setExtendedCase(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_ExtendedCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getExtendedCase();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Extend#getExtendedCase <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Case</em>' reference.
	 * @see #getExtendedCase()
	 * @generated
	 */
	void setExtendedCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the condition that must hold when the first ExtensionPoint is reached for the extension to take place. If no constraint is associated with the Extend relationship, the extension is unconditional.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Constraint)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_Condition()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	Constraint getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Extend#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Constraint value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getCondition()
	 * @generated
	 */
	Constraint createCondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint},with the specified '<em><b>Name</b></em>', and sets the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getCondition()
	 * @generated
	 */
	Constraint createCondition(String name);

	/**
	 * Returns the value of the '<em><b>Extension Location</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ordered list of ExtensionPoints belonging to the extended UseCase, specifying where the respective behavioral fragments of the extending UseCase are to be inserted. The first fragment in the extending UseCase is associated with the first extension point in the list, the second fragment with the second point, and so on. Note that, in most practical cases, the extending UseCase has just a single behavior fragment, so that the list of ExtensionPoints is trivial.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Location</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_ExtensionLocation()
	 * @model required="true"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionLocations();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionLocations()
	 * @generated
	 */
	ExtensionPoint getExtensionLocation(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionLocations()
	 * @generated
	 */
	ExtensionPoint getExtensionLocation(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.UseCase#getExtends <em>Extend</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that represents the extension and owns the Extend relationship.
	 * <p>From package UML::UseCases.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' container reference.
	 * @see #setExtension(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_Extension()
	 * @see org.eclipse.uml2.uml.UseCase#getExtends
	 * @model opposite="extend" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Extend#getExtension <em>Extension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' container reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(UseCase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtensionPoints referenced by the Extend relationship must belong to the UseCase that is being extended.
	 * extensionLocation->forAll (xp | extendedCase.extensionPoint->includes(xp))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExtensionPoints(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Extend
