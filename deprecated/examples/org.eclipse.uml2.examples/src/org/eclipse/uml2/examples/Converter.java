/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Converter.java,v 1.3 2005/04/06 19:59:31 khussey Exp $
 */
package org.eclipse.uml2.examples;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @deprecated Use UML2Util.Converter instead.
 */
public interface Converter {

	public void convert(ResourceSet resourceSet, IContainer container,
			String fileExtension);

	public EObject getModel(Resource resource);

}