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
 * $Id: UnionEObjectEList.java,v 1.1 2005/05/17 22:02:04 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * 
 */
public class UnionEObjectEList
		extends BasicEList.UnmodifiableEList
		implements InternalEList {

	protected final InternalEObject owner;

	public UnionEObjectEList(InternalEObject owner, int size, Object[] data) {
		super(size, data);
		this.owner = owner;
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

	public NotificationChain basicAdd(Object object,
			NotificationChain notifications) {
		throw new UnsupportedOperationException();
	}

	public Iterator basicIterator() {
		return super.basicIterator();
	}

	public List basicList() {
		return super.basicList();
	}

	public ListIterator basicListIterator() {
		return super.basicListIterator();
	}

	public ListIterator basicListIterator(int index) {
		return super.basicListIterator(index);
	}

	public NotificationChain basicRemove(Object object,
			NotificationChain notifications) {
		throw new UnsupportedOperationException();
	}

}
