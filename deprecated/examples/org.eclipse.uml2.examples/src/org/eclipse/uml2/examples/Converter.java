/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: Converter.java,v 1.1 2004/04/29 15:14:39 khussey Exp $
 */
package org.eclipse.uml2.examples;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 *
 */
public interface Converter {

	public void convert(ResourceSet resourceSet, IContainer container,
			String fileExtension);

	public EObject getModel(Resource resource);

}