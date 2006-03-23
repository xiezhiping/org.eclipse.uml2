/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLResourceItemProvider.java,v 1.1 2006/03/23 18:42:45 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
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

	public Collection getChildren(Object object) {
		List contents = ((Resource) object).getContents();
		Collection children = new ArrayList(contents.size());

		for (Iterator c = contents.iterator(); c.hasNext();) {
			Object o = c.next();

			if (!AdapterFactoryEditingDomain.isControlled(o)
				&& UMLUtil.getStereotype((EObject) o) == null) {

				children.add(o);
			}
		}

		return children;
	}

}
