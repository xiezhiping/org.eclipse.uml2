/*
 * Copyright (c) 2011, 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *   Kenn Hussey (CEA) - 418466
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Action#getContext() <em>Get Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#allActions() <em>All Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#allOwnedNodes() <em>All Owned Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#containingBehavior() <em>Containing Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derivation for the context property.
	 * result = (let behavior: Behavior = self.containingBehavior() in
	 * if behavior=null then null
	 * else if behavior._'context' = null then behavior
	 * else behavior._'context'
	 * endif
	 * endif)
	 * true
	 * @param action The receiving '<em><b>Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Classifier getContext(Action action) {
		Behavior behavior = action.containingBehavior();

		if (behavior != null) {
			BehavioredClassifier context = behavior.getContext();
			return context == null
				? behavior
				: context;
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return this Action and all Actions contained directly or indirectly in it. By default only the Action itself is returned, but the operation is overridden for StructuredActivityNodes.
	 * result = (self->asSet())
	 * <p>From package UML::Actions.</p>
	 * @param action The receiving '<em><b>Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Action> allActions(Action action) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the ActivityNodes directly or indirectly owned by this Action. This includes at least all the Pins of the Action.
	 * result = (input.oclAsType(Pin)->asSet()->union(output->asSet()))
	 * <p>From package UML::Actions.</p>
	 * @param action The receiving '<em><b>Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ActivityNode> allOwnedNodes(Action action) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = (if inStructuredNode<>null then inStructuredNode.containingBehavior() 
	 * else if activity<>null then activity
	 * else interaction 
	 * endif
	 * endif
	 * )
	 * <p>From package UML::Actions.</p>
	 * @param action The receiving '<em><b>Action</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Behavior containingBehavior(Action action) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ActionOperations