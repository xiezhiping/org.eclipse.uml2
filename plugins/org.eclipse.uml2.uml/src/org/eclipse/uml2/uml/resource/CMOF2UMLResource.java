/*
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation) - initial API and implementation
 *
 * $Id: CMOF2UMLResource.java,v 1.1 2007/09/04 15:28:48 khussey Exp $
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

}
