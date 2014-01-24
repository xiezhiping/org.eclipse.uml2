/*
 * Copyright (c) 2006, 2014 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   E.D.Willink - 426595
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.resource.ResourceItemProvider;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLResourceItemProvider
		extends ResourceItemProvider {

	public UMLResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Collection<?> getChildren(Object object) {
		EList<EObject> contents = ((Resource) object).getContents();
		int size = contents.size();
		Collection<Object> children = new ArrayList<Object>(size);

		for (int i = 0; i < size; i++) {
			EObject content = contents.get(i);

			if (!AdapterFactoryEditingDomain.isControlled(content)
				&& UMLUtil.getStereotype(content) == null) {

				children.add(content);
			}
		}

		return children;
	}

}
