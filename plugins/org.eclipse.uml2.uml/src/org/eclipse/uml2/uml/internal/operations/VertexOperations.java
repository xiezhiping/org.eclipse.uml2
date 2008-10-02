/*
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: VertexOperations.java,v 1.9 2008/10/02 20:56:22 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vertex</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Vertex#containingStateMachine() <em>Containing State Machine</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Vertex#getOutgoings() <em>Get Outgoings</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Vertex#getIncomings() <em>Get Incomings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertexOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the state machine in which this Vertex is defined
	 * result = if not container->isEmpty()
	 * then
	 * -- the container is a region
	 * container.containingStateMachine()
	 * else if (oclIsKindOf(Pseudostate)) then
	 * -- entry or exit point?
	 * if (kind = #entryPoint) or (kind = #exitPoint) then
	 * stateMachine
	 * else if (oclIsKindOf(ConnectionPointReference)) then
	 * state.containingStateMachine() -- no other valid cases possible
	 * endif
	 * 
	 * @param vertex The receiving '<em><b>Vertex</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static StateMachine containingStateMachine(Vertex vertex) {
		Region container = vertex.getContainer();

		if (container != null) {
			return container.containingStateMachine();
		} else if (vertex instanceof Pseudostate) {
			Pseudostate pseudostate = (Pseudostate) vertex;
			PseudostateKind kind = pseudostate.getKind();

			if (kind == PseudostateKind.ENTRY_POINT_LITERAL
				|| kind == PseudostateKind.EXIT_POINT_LITERAL) {

				return pseudostate.getStateMachine();
			}
		} else if (vertex instanceof ConnectionPointReference) {
			State state = ((ConnectionPointReference) vertex).getState();

			if (state != null) {
				return state.containingStateMachine();
			}
		}

		return null;
	}

	protected static class IncomingEList
			extends DelegatingEcoreEList<Transition> {

		private static final long serialVersionUID = 1L;

		protected final EStructuralFeature eStructuralFeature;

		protected final EList<Transition> delegateList;

		protected IncomingEList(InternalEObject owner,
				EStructuralFeature eStructuralFeature,
				EList<Transition> delegateList) {
			super(owner);

			this.eStructuralFeature = eStructuralFeature;
			this.delegateList = delegateList;
		}

		@Override
		public EStructuralFeature getEStructuralFeature() {
			return eStructuralFeature;
		}

		@Override
		public int getFeatureID() {
			return owner.eDerivedStructuralFeatureID(eStructuralFeature
				.getFeatureID(), Vertex.class);
		}

		@Override
		protected List<Transition> delegateList() {
			return delegateList;
		}

		@Override
		protected void delegateAdd(int index, Transition transition) {
			int delegateIndex = delegateList.indexOf(transition);

			if (delegateIndex != -1) {

				if (index != delegateIndex) {
					delegateList.move(index, transition);
				}
			} else if (index < delegateList.size()) {
				delegateList.add(index, transition);
			} else {
				delegateList.add(transition);
			}
		}

		@Override
		protected void didAdd(int index, Transition newTransition) {
			super.didAdd(index, newTransition);

			newTransition.setTarget((Vertex) owner);
		}

		@Override
		protected void didRemove(int index, Transition oldTransition) {
			super.didRemove(index, oldTransition);

			oldTransition.setTarget(null);
		}

		@Override
		protected void didSet(int index, Transition newTransition,
				Transition oldTransition) {
			super.didSet(index, newTransition, oldTransition);

			newTransition.setTarget((Vertex) owner);
			oldTransition.setTarget(null);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = Transition.allInstances()->select(t | t.target=self)
	 * @param vertex The receiving '<em><b>Vertex</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Transition> getIncomings(Vertex vertex) {
		EList<Transition> incomings = new UniqueEList.FastCompare<Transition>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(vertex)) {

			if (setting.getEStructuralFeature() == UMLPackage.Literals.TRANSITION__TARGET) {
				incomings.add((Transition) setting.getEObject());
			}
		}

		return new IncomingEList((InternalEObject) vertex,
			UMLPackage.Literals.VERTEX__INCOMING, incomings);
	}

	protected static class OutgoingEList
			extends DelegatingEcoreEList<Transition> {

		private static final long serialVersionUID = 1L;

		protected final EStructuralFeature eStructuralFeature;

		protected final EList<Transition> delegateList;

		protected OutgoingEList(InternalEObject owner,
				EStructuralFeature eStructuralFeature,
				EList<Transition> delegateList) {
			super(owner);

			this.eStructuralFeature = eStructuralFeature;
			this.delegateList = delegateList;
		}

		@Override
		public EStructuralFeature getEStructuralFeature() {
			return eStructuralFeature;
		}

		@Override
		public int getFeatureID() {
			return owner.eDerivedStructuralFeatureID(eStructuralFeature
				.getFeatureID(), Vertex.class);
		}

		@Override
		protected List<Transition> delegateList() {
			return delegateList;
		}

		@Override
		protected void delegateAdd(int index, Transition transition) {
			int delegateIndex = delegateList.indexOf(transition);

			if (delegateIndex != -1) {

				if (index != delegateIndex) {
					delegateList.move(index, transition);
				}
			} else if (index < delegateList.size()) {
				delegateList.add(index, transition);
			} else {
				delegateList.add(transition);
			}
		}

		@Override
		protected void didAdd(int index, Transition newTransition) {
			super.didAdd(index, newTransition);

			newTransition.setSource((Vertex) owner);
		}

		@Override
		protected void didRemove(int index, Transition oldTransition) {
			super.didRemove(index, oldTransition);

			oldTransition.setSource(null);
		}

		@Override
		protected void didSet(int index, Transition newTransition,
				Transition oldTransition) {
			super.didSet(index, newTransition, oldTransition);

			newTransition.setSource((Vertex) owner);
			oldTransition.setSource(null);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = Transition.allInstances()->select(t | t.source=self)
	 * @param vertex The receiving '<em><b>Vertex</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Transition> getOutgoings(Vertex vertex) {
		EList<Transition> outgoings = new UniqueEList.FastCompare<Transition>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(vertex)) {

			if (setting.getEStructuralFeature() == UMLPackage.Literals.TRANSITION__SOURCE) {
				outgoings.add((Transition) setting.getEObject());
			}
		}

		return new OutgoingEList((InternalEObject) vertex,
			UMLPackage.Literals.VERTEX__OUTGOING, outgoings);
	}

} // VertexOperations
