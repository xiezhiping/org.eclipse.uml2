/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: UML22UMLResource.java,v 1.2 2006/04/25 21:01:44 khussey Exp $
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

	String UML2__FILE_EXTENSION = "uml2"; //$NON-NLS-1$

	String UML2__PROFILES_PATHMAP = "pathmap://UML2_PROFILES/"; //$NON-NLS-1$

	String UML2__ECORE_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/EcorePrimitiveTypes.library.uml2"; //$NON-NLS-1$

	String UML2__JAVA_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/JavaPrimitiveTypes.library.uml2"; //$NON-NLS-1$

	String UML2__UML2_PRIMITIVE_TYPES_LIBRARY_URI = "pathmap://UML2_LIBRARIES/UML2PrimitiveTypes.library.uml2"; //$NON-NLS-1$

	String UML2__ECORE_METAMODEL_URI = "pathmap://UML2_METAMODELS/Ecore.metamodel.uml2"; //$NON-NLS-1$

	String UML2__UML2_METAMODEL_URI = "pathmap://UML2_METAMODELS/UML2.metamodel.uml2"; //$NON-NLS-1$

	String UML2__BASIC_PROFILE_URI = "pathmap://UML2_PROFILES/Basic.profile.uml2"; //$NON-NLS-1$

	String UML2__INTERMEDIATE_PROFILE_URI = "pathmap://UML2_PROFILES/Intermediate.profile.uml2"; //$NON-NLS-1$

	String UML2__COMPLETE_PROFILE_URI = "pathmap://UML2_PROFILES/Complete.profile.uml2"; //$NON-NLS-1$

	String UML2__ECORE_PROFILE_URI = "pathmap://UML2_PROFILES/Ecore.profile.uml2"; //$NON-NLS-1$

	String UML2_PROFILE_URI = PROFILES_PATHMAP + "UML2." //$NON-NLS-1$
		+ PROFILE_FILE_EXTENSION;

}
