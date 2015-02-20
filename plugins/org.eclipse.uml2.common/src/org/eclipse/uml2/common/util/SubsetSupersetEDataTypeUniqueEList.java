/*
 * Copyright (c) 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.ecore.InternalEObject;

/**
 * @since 2.1
 */
public class SubsetSupersetEDataTypeUniqueEList<E>
		extends SubsetSupersetEDataTypeEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SubsetSupersetEDataTypeEList.Unsettable<E> {

		private static final long serialVersionUID = 1L;

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs);
		}

		@Override
		protected boolean isUnique() {
			return true;
		}
	}

	public SubsetSupersetEDataTypeUniqueEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID, supersetFeatureIDs, subsetFeatureIDs);
	}

	@Override
	protected boolean isUnique() {
		return true;
	}

}