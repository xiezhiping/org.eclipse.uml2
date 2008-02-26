/*
 * Copyright (c) 2007, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation) - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 218388
 *
 * $Id: CMOF2UMLHelperImpl.java,v 1.2 2008/02/26 05:08:04 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;

public class CMOF2UMLHelperImpl
		extends XMI2UMLHelperImpl {

	public CMOF2UMLHelperImpl(XMLResource resource) {
		super(resource);

		packages.put(UMLPackage.eINSTANCE,
			CMOF2UMLResource.CMOF_METAMODEL_NS_PREFIX);
	}

}
