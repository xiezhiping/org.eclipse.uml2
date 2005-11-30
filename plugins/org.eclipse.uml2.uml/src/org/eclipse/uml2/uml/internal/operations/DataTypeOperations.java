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
 * $Id: DataTypeOperations.java,v 1.3 2005/11/30 21:43:11 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Data Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DataType#inherit(java.util.List) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class DataTypeOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataTypeOperations() {
		super();
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
	public static List inherit(DataType dataType, List inhs) {
		List inherit = new UniqueEList();

		List redefinedElements = new UniqueEList();

		for (Iterator ownedMembers = dataType.getOwnedMembers().iterator(); ownedMembers
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

		return Collections.unmodifiableList(inherit);
	}

} // DataTypeOperations