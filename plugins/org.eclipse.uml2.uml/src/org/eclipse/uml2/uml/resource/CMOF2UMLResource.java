/*
 * Copyright (c) 2007, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation) - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 218388
 *
 * $Id: CMOF2UMLResource.java,v 1.4 2008/04/21 13:28:47 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.internal.resource.CMOF2UMLResourceFactoryImpl;

public interface CMOF2UMLResource
		extends UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new CMOF2UMLResourceFactoryImpl();

	}

	String CMOF_METAMODEL_URI = "http://schema.omg.org/spec/MOF/2.0/cmof.xml"; //$NON-NLS-1$

	String CMOF_METAMODEL_NS_URI = CMOF_METAMODEL_URI;

	String CMOF_METAMODEL_NS_PREFIX = "cmof"; //$NON-NLS-1$

	String FILE_EXTENSION = CMOF_METAMODEL_NS_PREFIX;

	String CMOF_CONTENT_TYPE_IDENTIFIER = "org.omg.mof.cmof"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_0_URI = "http://schema.omg.org/spec/UML/2.0/uml.xml"; //$NON-NLS-1$

}
