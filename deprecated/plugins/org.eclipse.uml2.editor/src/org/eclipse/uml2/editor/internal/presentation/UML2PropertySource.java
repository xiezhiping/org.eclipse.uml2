/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2PropertySource.java,v 1.1 2004/05/21 20:20:11 khussey Exp $
 */
package org.eclipse.uml2.editor.internal.presentation;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 *
 */
public class UML2PropertySource extends PropertySource {

	public UML2PropertySource(Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}

	/*
	 * @see org.eclipse.emf.edit.ui.provider.PropertySource#createPropertyDescriptor(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 */
	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		return new UML2PropertyDescriptor(object, itemPropertyDescriptor);
	}

}
