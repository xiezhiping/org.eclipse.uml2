/*
 * Copyright (c) 2011, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.StructuredActivityNode;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Action#getContext() <em>Get Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#allActions() <em>All Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#allOwnedNodes() <em>All Owned Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#containingBehavior() <em>Containing Behavior</em>}</li>
 * </ul>
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
	 * <p>From package UML::Actions.</p>
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
	 * @generated NOT
	 */
	public static EList<Action> allActions(Action action) {
		return ECollections.singletonEList(action);
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
	 * @generated NOT
	 */
	public static EList<ActivityNode> allOwnedNodes(Action action) {
		EList<ActivityNode> allOwnedNodes = new UniqueEList.FastCompare<ActivityNode>();

		allOwnedNodes.addAll(action.getInputs());
		allOwnedNodes.addAll(action.getOutputs());

		return ECollections.unmodifiableEList(allOwnedNodes);
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
	 * @generated NOT
	 */
	public static Behavior containingBehavior(Action action) {
		StructuredActivityNode inStructuredNode = action.getInStructuredNode();

		if (inStructuredNode != null) {
			return inStructuredNode.containingBehavior();
		} else {
			Activity activity = action.getActivity();

			if (activity != null) {
				return activity;
			} else {
				EObject eContainer = action.eContainer();

				return eContainer instanceof Interaction
					? (Interaction) eContainer
					: null;
			}
		}
	}

} // ActionOperations