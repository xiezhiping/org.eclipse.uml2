/*
 * Copyright (c) 2014 CEA and others.
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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.internal.resource.UML402UMLResourceFactoryImpl;

/**
 * UML resource required for model migration.
 * OMG:  UML 2.4.x and UML 2.5
 * API:  UML2 4.x and UML2 5.0
 * 
 * @since 5.0
 */
public interface UML402UMLResource
		extends UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new UML402UMLResourceFactoryImpl();
	}

	String UML_METAMODEL_NS_URI = "http://www.eclipse.org/uml2/4.0.0/UML"; //$NON-NLS-1$

	String STANDARD_L2_PROFILE_NS_URI = "http://www.eclipse.org/uml2/4.0.0/UML/Profile/L2"; //$NON-NLS-1$

	String STANDARD_L2_PROFILE_URI = PROFILES_PATHMAP + "StandardL2." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_NS_URI = "http://www.eclipse.org/uml2/4.0.0/UML/Profile/L3"; //$NON-NLS-1$

	String STANDARD_L3_PROFILE_URI = PROFILES_PATHMAP + "StandardL3." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

}
