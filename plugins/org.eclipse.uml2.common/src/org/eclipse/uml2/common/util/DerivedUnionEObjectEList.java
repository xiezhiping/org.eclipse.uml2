/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DerivedUnionEObjectEList.java,v 1.5 2006/12/14 15:47:33 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * @since 1.2
 */
public class DerivedUnionEObjectEList<E>
		extends DerivedEObjectEList<E> {

	public DerivedUnionEObjectEList(Class<?> dataClass, InternalEObject owner,
			int featureID, int[] sourceFeatureIDs) {
		super(dataClass, owner, featureID, sourceFeatureIDs);
	}

	@Override
	public List<E> basicList() {
		return new DerivedUnionEObjectEList<E>(dataClass, owner, featureID,
			sourceFeatureIDs) {

			@Override
			public ListIterator<E> listIterator(int index) {
				return basicListIterator(index);
			}
		};
	}

	@Override
	protected boolean isIncluded(EStructuralFeature feature) {
		return true;
	}

}
