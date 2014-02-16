/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.uml2.uml.internal.resource.UML302UMLResourceFactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * UML resource required for model migration.
 * OMG:  UML 2.2 and UML 2.4
 * API:  UML2 3.x and UML2 4.0
 * 
 * @since 4.0
 */
public interface UML302UMLResource
		extends UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new UML302UMLResourceFactoryImpl();
	}

	String UML_METAMODEL_NS_URI = "http://www.eclipse.org/uml2/3.0.0/UML"; //$NON-NLS-1$

	String STANDARD_PROFILE_NS_URI = "http://www.eclipse.org/uml2/schemas/Standard/1"; //$NON-NLS-1$

	String STANDARD_PROFILE_URI = PROFILES_PATHMAP + "Standard." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

}
