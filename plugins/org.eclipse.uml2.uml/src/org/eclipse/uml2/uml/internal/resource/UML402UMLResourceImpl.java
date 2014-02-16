/*
 * Copyright (c) 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.resource.UML402UMLResource;

/**
 * Resource that converts .uml models.
 * OMG:  UML 2.4.x and UML 2.5 
 * API:  UML2 4.x and UML2 5.0 
 * 
 * @since 5.0
 */
public class UML402UMLResourceImpl
		extends UMLResourceImpl
		implements UML402UMLResource {

	public UML402UMLResourceImpl(URI uri) {
		super(uri);
	}

}
