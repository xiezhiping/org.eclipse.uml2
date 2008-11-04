/*
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML212UMLResource.java,v 1.2 2008/11/04 14:29:52 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.internal.resource.UML212UMLResourceFactoryImpl;

/**
 * UML resource required for model migration.
 * OMG:  UML 2.1.x and UML 2.2 
 * API:  UML2 2.2.x and UML2 3.0.x 
 * 
 * @since 3.0
 */
public interface UML212UMLResource
		extends UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new UML212UMLResourceFactoryImpl();
	}

	String UML_METAMODEL_NS_URI = "http://www.eclipse.org/uml2/2.1.0/UML"; //$NON-NLS-1$
	
}
