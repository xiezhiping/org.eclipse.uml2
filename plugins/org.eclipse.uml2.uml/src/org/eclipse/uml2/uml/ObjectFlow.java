/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ObjectFlow is an ActivityEdge that is traversed by object tokens that may hold values. Object flows also support multicast/receive, token selection from object nodes, and transformation of tokens.
 * <p>From package UML::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#isMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#isMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ObjectFlow#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getObjectFlow()
 * @model
 * @generated
 */
public interface ObjectFlow
		extends ActivityEdge {

	/**
	 * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the objects in the ObjectFlow are passed by multicasting.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Multicast</em>' attribute.
	 * @see #setIsMulticast(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectFlow_IsMulticast()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMulticast();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectFlow#isMulticast <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multicast</em>' attribute.
	 * @see #isMulticast()
	 * @generated
	 */
	void setIsMulticast(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the objects in the ObjectFlow are gathered from respondents to multicasting.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Multireceive</em>' attribute.
	 * @see #setIsMultireceive(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectFlow_IsMultireceive()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMultireceive();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectFlow#isMultireceive <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multireceive</em>' attribute.
	 * @see #isMultireceive()
	 * @generated
	 */
	void setIsMultireceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior used to change or replace object tokens flowing along the ObjectFlow.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectFlow_Transformation()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getTransformation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectFlow#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Behavior value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior used to select tokens from a source ObjectNode.
	 * <p>From package UML::Activities.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getObjectFlow_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ObjectFlow#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObjectNodes connected by an ObjectFlow, with optionally intervening ControlNodes, must have compatible types. In particular, the downstream ObjectNode type must be the same or a supertype of the upstream ObjectNode type.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCompatibleTypes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObjectNodes connected by an ObjectFlow, with optionally intervening ControlNodes, must have the same upperBounds.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSameUpperBounds(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ObjectFlow with a constant weight may not target an ObjectNode, with optionally intervening ControlNodes, that has an upper bound less than the weight.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selection Behavior has one input Parameter and one output Parameter. The input Parameter must have the same as or a supertype of the type of the source ObjectNode, be non-unique and have multiplicity 0..*. The output Parameter must be the same or a subtype of the type of source ObjectNode. The Behavior cannot have side effects.
	 * selection<>null implies
	 * 	selection.inputParameters()->size()=1 and
	 * 	selection.inputParameters()->forAll(not isUnique and is(0,*)) and
	 * 	selection.outputParameters()->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputAndOutputParameter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObjectFlows may not have ExecutableNodes at either end.
	 * not (source.oclIsKindOf(ExecutableNode) or target.oclIsKindOf(ExecutableNode))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoExecutableNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A transformation Behavior has one input Parameter and one output Parameter. The input Parameter must be the same as or a supertype of the type of object token coming from the source end. The output Parameter must be the same or a subtype of the type of object token expected downstream. The Behavior cannot have side effects.
	 * transformation<>null implies
	 * 	transformation.inputParameters()->size()=1 and
	 * 	transformation.outputParameters()->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTransformationBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ObjectFlow may have a selection Behavior only if it has an ObjectNode as its source.
	 * selection<>null implies source.oclIsKindOf(ObjectNode)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSelectionBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isMulticast and isMultireceive cannot both be true.
	 * not (isMulticast and isMultireceive)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateIsMulticastOrIsMultireceive(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ObjectFlow
