/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLReflectiveItemProvider.java,v 1.2 2007/01/05 21:49:15 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLReflectiveItemProvider
		extends ReflectiveItemProvider {

	public UMLReflectiveItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(Object object) {
		EObject eContainer = ((EObject) object).eContainer();
		Element baseElement = eContainer == null
			? null
			: UMLUtil.getBaseElement(eContainer);

		return baseElement == null
			? super.getParent(object)
			: baseElement;
	}

}
