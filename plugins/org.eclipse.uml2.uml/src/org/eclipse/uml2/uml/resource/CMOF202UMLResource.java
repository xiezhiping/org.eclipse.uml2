/*
 * Copyright (c) 2007, 2011 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation) - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 218388
 *   Kenn Hussey (CEA) - 327039
 *
 */
package org.eclipse.uml2.uml.resource;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.uml2.uml.internal.resource.CMOF202UMLResourceFactoryImpl;

public interface CMOF202UMLResource
		extends CMOF2UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new CMOF202UMLResourceFactoryImpl();

	}

}
