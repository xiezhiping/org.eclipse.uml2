/*
 * Copyright (c) 2006, 2007 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204202
 * 
 * $Id: XMI2UMLResource.java,v 1.4 2007/10/29 17:53:13 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.uml.internal.resource.XMI2UMLResourceFactoryImpl;

public interface XMI2UMLResource
		extends UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new XMI2UMLResourceFactoryImpl();
	}

	String FILE_EXTENSION = "xmi"; //$NON-NLS-1$

	String STANDARD_PROFILE_NS_URI = "http://schema.omg.org/spec/UML/2.1.2/StandardProfileL2"; //$NON-NLS-1$
	
	String STANDARD_PROFILE_URI = "http://schema.omg.org/spec/UML/2.1.2/StandardProfileL2.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_NS_URI = "http://schema.omg.org/spec/UML/2.1.2"; //$NON-NLS-1$

	String UML_METAMODEL_URI = "http://schema.omg.org/spec/UML/2.1.2/uml.xml"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_URI = UML_METAMODEL_URI;

	String STANDARD_PROFILE_2_1_NS_URI = "http://schema.omg.org/spec/UML/2.1/StandardProfileL2"; //$NON-NLS-1$
	
	String STANDARD_PROFILE_2_1_URI = "http://schema.omg.org/spec/UML/2.1/StandardProfileL2.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_NS_URI = "http://schema.omg.org/spec/UML/2.1"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_URI = "http://schema.omg.org/spec/UML/2.1/uml.xml"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_1_URI = UML_METAMODEL_2_1_URI;

	String STANDARD_PROFILE_2_1_1_NS_URI = "http://schema.omg.org/spec/UML/2.1.1/StandardProfileL2"; //$NON-NLS-1$
	
	String STANDARD_PROFILE_2_1_1_URI = "http://schema.omg.org/spec/UML/2.1.1/StandardProfileL2.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_1_NS_URI = "http://schema.omg.org/spec/UML/2.1.1"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_1_URI = "http://schema.omg.org/spec/UML/2.1.1/uml.xml"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_1_1_URI = UML_METAMODEL_2_1_1_URI;

	String XMI_NS_URI = XMI_NAMESPACE_PREFIX + "2.1"; //$NON-NLS-1$

}
