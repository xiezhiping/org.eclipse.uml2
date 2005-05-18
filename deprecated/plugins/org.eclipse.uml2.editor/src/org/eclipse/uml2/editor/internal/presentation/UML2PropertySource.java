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
 * $Id: UML2PropertySource.java,v 1.4 2005/05/18 16:42:19 khussey Exp $
 */
package org.eclipse.uml2.editor.internal.presentation;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * @deprecated Use UML2Editor$UML2PropertySource instead.
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
