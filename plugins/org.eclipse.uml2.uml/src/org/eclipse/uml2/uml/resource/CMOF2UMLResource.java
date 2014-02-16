/*
 * Copyright (c) 2007, 2014 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation) - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 218388
 *   Kenn Hussey (CEA) - 327039, 351774, 366349, 418466
 *
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

	String CMOF_2_0_METAMODEL_URI = "http://schema.omg.org/spec/MOF/2.0/cmof.xml"; //$NON-NLS-1$

	String CMOF_2_0_METAMODEL_NS_URI = CMOF_2_0_METAMODEL_URI;

	String CMOF_2_4_METAMODEL_URI = "http://www.omg.org/spec/MOF/20100901/cmof.xmi"; //$NON-NLS-1$

	String CMOF_2_4_METAMODEL_NS_URI = CMOF_2_4_METAMODEL_URI;

	String CMOF_2_4_1_METAMODEL_URI = "http://www.omg.org/spec/MOF/20110701/cmof.xmi"; //$NON-NLS-1$

	String CMOF_2_4_1_METAMODEL_NS_URI = CMOF_2_4_1_METAMODEL_URI;

	String CMOF_2_5_METAMODEL_URI = "http://www.omg.org/spec/MOF/20131001/cmof.xmi"; //$NON-NLS-1$

	String CMOF_2_5_METAMODEL_NS_URI = CMOF_2_5_METAMODEL_URI;

	String CMOF_METAMODEL_URI = CMOF_2_5_METAMODEL_URI;

	String CMOF_METAMODEL_NS_URI = CMOF_2_5_METAMODEL_NS_URI;

	String CMOF_METAMODEL_NS_PREFIX = "cmof"; //$NON-NLS-1$

	String FILE_EXTENSION = CMOF_METAMODEL_NS_PREFIX;

	String CMOF_2_0_CONTENT_TYPE_IDENTIFIER = "org.omg.mof.cmof_2_0"; //$NON-NLS-1$

	String CMOF_2_4_CONTENT_TYPE_IDENTIFIER = "org.omg.mof.cmof_2_4"; //$NON-NLS-1$

	String CMOF_2_4_1_CONTENT_TYPE_IDENTIFIER = "org.omg.mof.cmof_2_4_1"; //$NON-NLS-1$

	String CMOF_2_5_CONTENT_TYPE_IDENTIFIER = "org.omg.mof.cmof_2_5"; //$NON-NLS-1$

	String CMOF_CONTENT_TYPE_IDENTIFIER = CMOF_2_5_CONTENT_TYPE_IDENTIFIER;

	String UML_PRIMITIVE_TYPES_LIBRARY_2_0_URI = "http://schema.omg.org/spec/UML/2.0/uml.xml"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_4_URI = "http://www.omg.org/spec/UML/20100901/PrimitiveTypes.xmi"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_4_1_URI = "http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_5_URI = "http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_URI = UML_PRIMITIVE_TYPES_LIBRARY_2_5_URI;

}
