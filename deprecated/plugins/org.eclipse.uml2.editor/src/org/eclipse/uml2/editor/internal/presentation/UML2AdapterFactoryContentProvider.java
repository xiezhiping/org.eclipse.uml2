/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2AdapterFactoryContentProvider.java,v 1.4 2005/05/18 16:42:19 khussey Exp $
 */
package org.eclipse.uml2.editor.internal.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * @deprecated Use UML2Editor$UML2AdapterFactoryContentProvider instead.
 */
public class UML2AdapterFactoryContentProvider extends AdapterFactoryContentProvider {

	public UML2AdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#createPropertySource(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertySource)
	 */
	protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
		return new UML2PropertySource(object, itemPropertySource);
	}

}
