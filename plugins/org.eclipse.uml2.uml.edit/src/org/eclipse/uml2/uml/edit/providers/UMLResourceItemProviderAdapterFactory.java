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
 * $Id: UMLResourceItemProviderAdapterFactory.java,v 1.2 2007/01/05 21:49:18 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

public class UMLResourceItemProviderAdapterFactory
		extends ResourceItemProviderAdapterFactory {

	public UMLResourceItemProviderAdapterFactory() {
		super();
	}

	@Override
	public Adapter createResourceAdapter() {
		return new UMLResourceItemProvider(this);
	}

}
