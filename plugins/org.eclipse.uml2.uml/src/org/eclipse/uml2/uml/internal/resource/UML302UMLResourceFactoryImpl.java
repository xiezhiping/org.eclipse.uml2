/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.uml2.uml.resource.UML302UMLResource;


/**
 * Resource factory that converts .uml models.
 * OMG:  UML 2.2 and UML 2.4 
 * API:  UML2 3.x and UML2 4.0 
 * 
 * @since 3.0
 */
public class UML302UMLResourceFactoryImpl
		extends UMLResourceFactoryImpl
		implements UML302UMLResource.Factory {

	public UML302UMLResourceFactoryImpl() {
		super();
	}

}
