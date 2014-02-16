/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.uml2.uml.internal.resource.XMI222UMLResourceFactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * XMI resource required for model migration.
 * OMG:  UML 2.2 and UML 2.4 
 * API:  UML2 3.x and UML2 4.0 
 * 
 * @since 4.0
 */
public interface XMI222UMLResource
		extends XMI2UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new XMI222UMLResourceFactoryImpl();
	}
}
