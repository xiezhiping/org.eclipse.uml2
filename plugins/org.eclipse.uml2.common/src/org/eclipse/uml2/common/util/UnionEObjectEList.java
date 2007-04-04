/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UnionEObjectEList.java,v 1.5 2007/04/04 03:15:12 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;

/**
 * An unmodifiable list that represents a union of elements. This list is ideal
 * for implementing derived features whose values are obtained from the values
 * of other features in a non-trivial way.
 */
public class UnionEObjectEList<E>
		extends EcoreEList.UnmodifiableEList<E> {

	private static final long serialVersionUID = 1L;

	public UnionEObjectEList(InternalEObject owner,
			EStructuralFeature eStructuralFeature, int size, Object[] data) {
		super(owner, eStructuralFeature, size, data);
	}

	protected EObject resolveProxy(EObject eObject) {
		return eObject.eIsProxy()
			? owner.eResolveProxy((InternalEObject) eObject)
			: eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected E resolve(int index, E object) {
		E resolved = (E) resolveProxy((EObject) object);

		if (resolved != object) {
			@SuppressWarnings("unchecked")
			E oldObject = (E) data[index];
			assign(index, validate(index, resolved));
			didSet(index, resolved, oldObject);

			return resolved;
		} else {
			return object;
		}
	}

	@Override
	protected boolean canContainNull() {
		return false;
	}

	@Override
	protected boolean isUnique() {
		return true;
	}

	@Override
	protected boolean useEquals() {
		return false;
	}

	@Override
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

	@Override
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

	@Override
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

	@Override
	public Iterator<E> iterator() {
		return listIterator();
	}

	@Override
	public ListIterator<E> listIterator() {
		return new EListIterator<E>();
	}

	@Override
	public ListIterator<E> listIterator(int index) {

		if (index < 0 || index > size()) {
			throw new BasicIndexOutOfBoundsException(index, size);
		}

		return new EListIterator<E>(index);
	}

}
