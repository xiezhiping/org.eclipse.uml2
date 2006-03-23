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
 * $Id: UMLResourceItemProviderAdapterFactory.java,v 1.1 2006/03/23 18:42:45 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

public class UMLResourceItemProviderAdapterFactory
		extends ResourceItemProviderAdapterFactory {

	public UMLResourceItemProviderAdapterFactory() {
		super();
	}

	public Adapter createResourceAdapter() {
		return new UMLResourceItemProvider(this);
	}

}
