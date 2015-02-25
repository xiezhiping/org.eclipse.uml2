/*
 * Copyright (c) 2006, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204202, 156879, 226397
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 457892
 * 
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

	String STANDARD_L2_PROFILE_2_1_NS_URI = "http://schema.omg.org/spec/UML/2.1/StandardProfileL2"; //$NON-NLS-1$
	
	String STANDARD_L2_PROFILE_2_1_URI = "http://schema.omg.org/spec/UML/2.1/StandardProfileL2.xmi"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_1_NS_URI = "http://schema.omg.org/spec/UML/2.1/StandardProfileL3"; //$NON-NLS-1$
	
	String STANDARD_L3_PROFILE_2_1_URI = "http://schema.omg.org/spec/UML/2.1/StandardProfileL3.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_NS_URI = "http://schema.omg.org/spec/UML/2.1"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_URI = "http://schema.omg.org/spec/UML/2.1/uml.xml"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_1_URI = UML_METAMODEL_2_1_URI;

	String STANDARD_L2_PROFILE_2_1_1_NS_URI = "http://schema.omg.org/spec/UML/2.1.1/StandardProfileL2"; //$NON-NLS-1$
	
	String STANDARD_L2_PROFILE_2_1_1_URI = "http://schema.omg.org/spec/UML/2.1.1/StandardProfileL2.xmi"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_1_1_NS_URI = "http://schema.omg.org/spec/UML/2.1.1/StandardProfileL3"; //$NON-NLS-1$
	
	String STANDARD_L3_PROFILE_2_1_1_URI = "http://schema.omg.org/spec/UML/2.1.1/StandardProfileL3.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_1_NS_URI = "http://schema.omg.org/spec/UML/2.1.1"; //$NON-NLS-1$

	String UML_METAMODEL_2_1_1_URI = "http://schema.omg.org/spec/UML/2.1.1/uml.xml"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_1_1_URI = UML_METAMODEL_2_1_1_URI;

	String STANDARD_L2_PROFILE_2_2_NS_URI = "http://schema.omg.org/spec/UML/2.2/StandardProfileL2"; //$NON-NLS-1$

	String STANDARD_L2_PROFILE_2_2_URI = "http://schema.omg.org/spec/UML/2.2/StandardProfileL2.xmi"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_2_NS_URI = "http://schema.omg.org/spec/UML/2.2/StandardProfileL3"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_2_URI = "http://schema.omg.org/spec/UML/2.2/StandardProfileL3.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_2_NS_URI = "http://schema.omg.org/spec/UML/2.2"; //$NON-NLS-1$

	String UML_METAMODEL_2_2_URI = "http://schema.omg.org/spec/UML/2.2/uml.xml"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_2_URI = UML_METAMODEL_2_2_URI;

	String STANDARD_L2_PROFILE_2_4_NS_URI = "http://www.omg.org/spec/UML/20100901/StandardProfileL2"; //$NON-NLS-1$

	String STANDARD_L2_PROFILE_2_4_URI = "http://www.omg.org/spec/UML/20100901/StandardProfileL2.xmi"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_4_NS_URI = "http://www.omg.org/spec/UML/20100901/StandardProfileL3"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_4_URI = "http://www.omg.org/spec/UML/20100901/StandardProfileL3.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_4_NS_URI = "http://www.omg.org/spec/UML/20100901"; //$NON-NLS-1$

	String UML_METAMODEL_2_4_URI = "http://www.omg.org/spec/UML/20100901/UML.xmi"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_4_NS_URI = "http://www.omg.org/spec/PrimitiveTypes/20100901"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_4_URI = "http://www.omg.org/spec/UML/20100901/PrimitiveTypes.xmi"; //$NON-NLS-1$

	String STANDARD_L2_PROFILE_2_4_1_NS_URI = "http://www.omg.org/spec/UML/20110701/StandardProfileL2"; //$NON-NLS-1$

	String STANDARD_L2_PROFILE_2_4_1_URI = "http://www.omg.org/spec/UML/20110701/StandardProfileL2.xmi"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_4_1_NS_URI = "http://www.omg.org/spec/UML/20110701/StandardProfileL3"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_2_4_1_URI = "http://www.omg.org/spec/UML/20110701/StandardProfileL3.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_4_1_NS_URI = "http://www.omg.org/spec/UML/20110701"; //$NON-NLS-1$

	String UML_METAMODEL_2_4_1_URI = "http://www.omg.org/spec/UML/20110701/UML.xmi"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_4_1_NS_URI = "http://www.omg.org/spec/PrimitiveTypes/20110701"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_4_1_URI = "http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi"; //$NON-NLS-1$

	String STANDARD_PROFILE_2_5_NS_URI = "http://www.omg.org/spec/UML/20131001/StandardProfile"; //$NON-NLS-1$

	String STANDARD_PROFILE_2_5_URI = "http://www.omg.org/spec/UML/20131001/StandardProfile.xmi"; //$NON-NLS-1$

	String UML_METAMODEL_2_5_NS_URI = "http://www.omg.org/spec/UML/20131001"; //$NON-NLS-1$

	String UML_METAMODEL_2_5_URI = "http://www.omg.org/spec/UML/20131001/UML.xmi"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_5_NS_URI = "http://www.omg.org/spec/PrimitiveTypes/20131001"; //$NON-NLS-1$

	String UML_PRIMITIVE_TYPES_LIBRARY_2_5_URI = "http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi"; //$NON-NLS-1$

	String STANDARD_PROFILE_NS_URI = STANDARD_PROFILE_2_5_NS_URI;

	String STANDARD_PROFILE_URI = STANDARD_PROFILE_2_5_URI;

	String UML_METAMODEL_NS_URI = UML_METAMODEL_2_5_NS_URI;

	String UML_METAMODEL_URI = UML_METAMODEL_2_5_URI;

	String UML_PRIMITIVE_TYPES_LIBRARY_NS_URI = UML_PRIMITIVE_TYPES_LIBRARY_2_5_NS_URI;

	String UML_PRIMITIVE_TYPES_LIBRARY_URI = UML_PRIMITIVE_TYPES_LIBRARY_2_5_URI;

	String UML_2_1_CONTENT_TYPE_IDENTIFIER = "org.omg.uml_2_1"; //$NON-NLS-1$

	String UML_2_1_1_CONTENT_TYPE_IDENTIFIER = "org.omg.uml_2_1_1"; //$NON-NLS-1$

	String UML_2_2_CONTENT_TYPE_IDENTIFIER = "org.omg.uml_2_2"; //$NON-NLS-1$

	String UML_2_4_CONTENT_TYPE_IDENTIFIER = "org.omg.uml_2_4"; //$NON-NLS-1$

	String UML_2_4_1_CONTENT_TYPE_IDENTIFIER = "org.omg.uml_2_4_1"; //$NON-NLS-1$

	String UML_2_5_CONTENT_TYPE_IDENTIFIER = "org.omg.uml_2_5"; //$NON-NLS-1$

	String UML_CONTENT_TYPE_IDENTIFIER = UML_2_5_CONTENT_TYPE_IDENTIFIER; //$NON-NLS-1$

	String XMI_2_1_NS_URI = XMI_2_1_URI; //$NON-NLS-1$

	String XMI_2_4_NS_URI = XMI_2_4_NAMESPACE_PREFIX + "20100901"; //$NON-NLS-1$

	String XMI_2_4_1_NS_URI = XMI_2_4_NAMESPACE_PREFIX + "20110701"; //$NON-NLS-1$

	String XMI_2_5_NS_URI = XMI_2_4_NAMESPACE_PREFIX + "20131001"; //$NON-NLS-1$

	String XMI_NS_URI = XMI_2_5_NS_URI;

	String MOF_2_0_NS_URI = "http://schema.omg.org/spec/MOF/2.0"; //$NON-NLS-1$

	String MOF_2_4_NS_URI = "http://www.omg.org/spec/MOF/20100901"; //$NON-NLS-1$

	String MOF_2_4_1_NS_URI = "http://www.omg.org/spec/MOF/20110701"; //$NON-NLS-1$

	String MOF_2_5_NS_URI = "http://www.omg.org/spec/MOF/20131001"; //$NON-NLS-1$

	String MOF_NS_URI = MOF_2_5_NS_URI;

}
