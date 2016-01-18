/*
 * Copyright (c) 2006, 2016 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181, 418466, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
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
			return owner.eDerivedStructuralFeatureID(
				eStructuralFeature.getFeatureID(), ConnectableElement.class);
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
	 * Derivation for ConnectableElement::/end : ConnectorEnd
	 * result = ConnectorEnd.allInstances()->select(e | e.role=self)
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param connectableElement The receiving '<em><b>Connectable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<ConnectorEnd> getEnds(
			ConnectableElement connectableElement) {
		EList<ConnectorEnd> ends = new UniqueEList.FastCompare<ConnectorEnd>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(
			connectableElement)) {

			if (setting
				.getEStructuralFeature() == UMLPackage.Literals.CONNECTOR_END__ROLE) {
				ends.add((ConnectorEnd) setting.getEObject());
			}
		}

		return new EndEList((InternalEObject) connectableElement,
			UMLPackage.Literals.CONNECTABLE_ELEMENT__END, ends);
	}

} // ConnectableElementOperations
