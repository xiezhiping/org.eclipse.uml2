/*
 * Copyright (c) 2008, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *
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

	String STANDARD_PROFILE_NS_URI = "http://www.eclipse.org/uml2/schemas/Standard/1"; //$NON-NLS-1$

	String STANDARD_PROFILE_URI = PROFILES_PATHMAP + "Standard." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

}
