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
import org.eclipse.uml2.uml.internal.resource.CMOF242UMLResourceFactoryImpl;

public interface CMOF242UMLResource
		extends CMOF2UMLResource {

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new CMOF242UMLResourceFactoryImpl();

	}

}
