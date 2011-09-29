/*
 * Copyright (c) 2006, 2011 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 204200
 *   Kenn Hussey (CEA) - 327039
 * 
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.internal.resource.UML22UMLResourceFactoryImpl;

public interface UML22UMLResource
		extends UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new UML22UMLResourceFactoryImpl();
	}

	String FILE_EXTENSION = "uml2"; //$NON-NLS-1$

	String PROFILES_PATHMAP = "pathmap://UML2_PROFILES/"; //$NON-NLS-1$

	String ECORE_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/EcorePrimitiveTypes.library.uml2"; //$NON-NLS-1$

	String JAVA_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/JavaPrimitiveTypes.library.uml2"; //$NON-NLS-1$

	String UML2_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/UML2PrimitiveTypes.library.uml2"; //$NON-NLS-1$

	String ECORE_METAMODEL_URI = "pathmap://UML2_METAMODELS/Ecore.metamodel.uml2"; //$NON-NLS-1$

	String UML2_METAMODEL_NS_URI = "http://www.eclipse.org/uml2/1.0.0/UML"; //$NON-NLS-1$

	String UML2_METAMODEL_URI = "pathmap://UML2_METAMODELS/UML2.metamodel.uml2"; //$NON-NLS-1$

	String BASIC_PROFILE_URI = "pathmap://UML2_PROFILES/Basic.profile.uml2"; //$NON-NLS-1$

	String INTERMEDIATE_PROFILE_URI = "pathmap://UML2_PROFILES/Intermediate.profile.uml2"; //$NON-NLS-1$

	String COMPLETE_PROFILE_URI = "pathmap://UML2_PROFILES/Complete.profile.uml2"; //$NON-NLS-1$

	String ECORE_PROFILE_URI = "pathmap://UML2_PROFILES/Ecore.profile.uml2"; //$NON-NLS-1$

	String UML2_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2"; //$NON-NLS-1$
}
