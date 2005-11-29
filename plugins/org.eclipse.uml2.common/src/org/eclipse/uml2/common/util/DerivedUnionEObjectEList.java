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
 * $Id: DerivedUnionEObjectEList.java,v 1.3 2005/11/29 17:44:48 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

public class DerivedUnionEObjectEList
		extends DerivedEObjectEList {

	public DerivedUnionEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] sourceFeatureIDs) {
		super(dataClass, owner, featureID, sourceFeatureIDs);
	}

	public List basicList() {
		return new DerivedUnionEObjectEList(dataClass, owner, featureID,
			sourceFeatureIDs) {

			public ListIterator listIterator(int index) {
				return basicListIterator(index);
			}
		};
	}

	protected boolean isIncluded(EStructuralFeature feature) {
		return true;
	}

}
