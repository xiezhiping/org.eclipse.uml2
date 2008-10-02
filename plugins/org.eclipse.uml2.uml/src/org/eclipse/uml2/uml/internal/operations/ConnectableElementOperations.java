/*
 * Copyright (c) 2006, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConnectableElementOperations.java,v 1.6 2008/10/02 20:56:22 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * A static utility class that provides operations related to '<em><b>Connectable Element</b></em>' model objects.
 */
public class ConnectableElementOperations
		extends NamedElementOperations {

	protected ConnectableElementOperations() {
		super();
	}

	protected static class EndEList
			extends DelegatingEcoreEList<ConnectorEnd> {

		private static final long serialVersionUID = 1L;

		protected final EStructuralFeature eStructuralFeature;

		protected final EList<ConnectorEnd> delegateList;

		protected EndEList(InternalEObject owner,
				EStructuralFeature eStructuralFeature,
				EList<ConnectorEnd> delegateList) {
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
				.getFeatureID(), ConnectableElement.class);
		}

		@Override
		protected List<ConnectorEnd> delegateList() {
			return delegateList;
		}

		@Override
		protected void delegateAdd(int index, ConnectorEnd connectorEnd) {
			int delegateIndex = delegateList.indexOf(connectorEnd);

			if (delegateIndex != -1) {

				if (index != delegateIndex) {
					delegateList.move(index, connectorEnd);
				}
			} else if (index < delegateList.size()) {
				delegateList.add(index, connectorEnd);
			} else {
				delegateList.add(connectorEnd);
			}
		}

		@Override
		protected void didAdd(int index, ConnectorEnd newConnectorEnd) {
			super.didAdd(index, newConnectorEnd);

			newConnectorEnd.setRole((ConnectableElement) owner);
		}

		@Override
		protected void didRemove(int index, ConnectorEnd oldConnectorEnd) {
			super.didRemove(index, oldConnectorEnd);

			oldConnectorEnd.setRole(null);
		}

		@Override
		protected void didSet(int index, ConnectorEnd newConnectorEnd,
				ConnectorEnd oldConnectorEnd) {
			super.didSet(index, newConnectorEnd, oldConnectorEnd);

			newConnectorEnd.setRole((ConnectableElement) owner);
			oldConnectorEnd.setRole(null);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = ConnectorEnd.allInstances()->select(e | e.role=self)
	 * @param connectableElement The receiving '<em><b>Connectable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<ConnectorEnd> getEnds(
			ConnectableElement connectableElement) {
		EList<ConnectorEnd> ends = new UniqueEList.FastCompare<ConnectorEnd>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(connectableElement)) {

			if (setting.getEStructuralFeature() == UMLPackage.Literals.CONNECTOR_END__ROLE) {
				ends.add((ConnectorEnd) setting.getEObject());
			}
		}

		return new EndEList((InternalEObject) connectableElement,
			UMLPackage.Literals.CONNECTABLE_ELEMENT__END, ends);
	}

	protected static EList<Interface> getRequiredInterfaces(
			ConnectableElement connectableElement) {
		EList<Interface> requiredInterfaces = new UniqueEList.FastCompare<Interface>();

		if (connectableElement instanceof Port) {
			requiredInterfaces.addAll(((Port) connectableElement)
				.getRequireds());
		} else if (connectableElement instanceof Property) {
			Type type = connectableElement.getType();

			if (type instanceof Component) {
				ComponentOperations.getAllRequireds((Component) type,
					requiredInterfaces);
			} else if (type instanceof Classifier) {
				Classifier classifier = (Classifier) type;
				ComponentOperations.usedInterfaces(null, classifier, true,
					requiredInterfaces);

				for (Classifier parent : classifier.allParents()) {
					ComponentOperations.usedInterfaces(null, parent, true,
						requiredInterfaces);
				}
			}
		}

		for (int i = 0, size = requiredInterfaces.size(); i < size; i++) {

			for (Classifier parent : requiredInterfaces.get(i).allParents()) {

				if (parent instanceof Interface) {
					requiredInterfaces.add((Interface) parent);
				}
			}
		}

		return ECollections.unmodifiableEList(requiredInterfaces);
	}

	protected static EList<Interface> getProvidedInterfaces(
			ConnectableElement connectableElement) {
		EList<Interface> providedInterfaces = new UniqueEList.FastCompare<Interface>();

		if (connectableElement instanceof Port) {
			providedInterfaces.addAll(((Port) connectableElement)
				.getProvideds());
		} else if (connectableElement instanceof Property) {
			Type type = ((Property) connectableElement).getType();

			if (type instanceof Component) {
				ComponentOperations.getAllProvideds((Component) type,
					providedInterfaces);
			} else if (type instanceof Interface) {
				providedInterfaces.add((Interface) type);
			} else if (type instanceof Classifier) {
				Classifier classifier = (Classifier) type;
				ComponentOperations.realizedInterfaces(null, classifier, true,
					providedInterfaces);

				for (Classifier parent : classifier.allParents()) {
					ComponentOperations.realizedInterfaces(null, parent, true,
						providedInterfaces);
				}
			}
		}

		for (int i = 0, size = providedInterfaces.size(); i < size; i++) {

			for (Classifier parent : providedInterfaces.get(i).allParents()) {

				if (parent instanceof Interface) {
					providedInterfaces.add((Interface) parent);
				}
			}
		}

		return ECollections.unmodifiableEList(providedInterfaces);
	}

} // ConnectableElementOperations
