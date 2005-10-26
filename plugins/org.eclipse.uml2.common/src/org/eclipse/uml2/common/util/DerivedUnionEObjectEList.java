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
 * $Id: DerivedUnionEObjectEList.java,v 1.1 2005/10/26 20:58:43 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

public class DerivedUnionEObjectEList
		extends DerivedEObjectEList {

	public DerivedUnionEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, EStructuralFeature[] sourceFeatures) {
		super(dataClass, owner, featureID, sourceFeatures);
	}

	protected boolean isIncluded(EStructuralFeature feature) {
		return true;
	}

}
