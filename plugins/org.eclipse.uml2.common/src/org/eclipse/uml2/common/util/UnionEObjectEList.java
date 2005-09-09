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
 * $Id: UnionEObjectEList.java,v 1.3 2005/09/09 19:16:42 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;

/**
 * 
 */
public class UnionEObjectEList
		extends EcoreEList.UnmodifiableEList {

	public UnionEObjectEList(InternalEObject owner,
			EStructuralFeature eStructuralFeature, int size, Object[] data) {
		super(owner, eStructuralFeature, size, data);
	}

	protected EObject resolveProxy(EObject eObject) {
		return eObject.eIsProxy()
			? owner.eResolveProxy((InternalEObject) eObject)
			: eObject;
	}

	protected Object resolve(int index, Object object) {
		EObject resolved = resolveProxy((EObject) object);

		if (resolved != object) {
			Object oldObject = data[index];
			assign(index, validate(index, resolved));
			didSet(index, resolved, oldObject);

			return resolved;
		} else {
			return object;
		}
	}

	protected boolean canContainNull() {
		return false;
	}

	protected boolean isUnique() {
		return true;
	}

	protected boolean useEquals() {
		return false;
	}

	public boolean contains(Object object) {
		boolean result = super.contains(object);

		if (!result) {

			for (int i = 0; i < size; i++) {

				if (resolveProxy((EObject) data[i]) == object) {
					return true;
				}
			}
		}

		return result;
	}

	public int indexOf(Object object) {
		int result = super.indexOf(object);

		if (result == -1) {

			for (int i = 0; i < size; i++) {

				if (resolveProxy((EObject) data[i]) == object) {
					return i;
				}
			}
		}

		return result;
	}

	public int lastIndexOf(Object object) {
		int result = super.lastIndexOf(object);

		if (result == -1) {

			for (int i = size - 1; i >= 0; i--) {

				if (resolveProxy((EObject) data[i]) == object) {
					return i;
				}
			}
		}

		return result;
	}

	public Iterator iterator() {
		return listIterator();
	}

	public ListIterator listIterator() {
		return new EListIterator();
	}

	public ListIterator listIterator(int index) {

		if (index < 0 || index > size()) {
			throw new BasicIndexOutOfBoundsException(index, size);
		}

		return new EListIterator(index);
	}

}
