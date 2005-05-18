/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: EMOF2EcoreResource.java,v 1.5 2005/05/18 16:42:31 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.examples.emof2ecore.internal.EMOF2EcoreResourceFactoryImpl;

/**
 * 
 */
public interface EMOF2EcoreResource
		extends XMIResource {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new EMOF2EcoreResourceFactoryImpl();

	}

	public static final String EMOF_NS_URI = "http://schema.omg.org/spec/mof/2.0/emof.xmi"; //$NON-NLS-1$

	public static final String FILE_EXTENSION = "emof2ecore"; //$NON-NLS-1$

	public static final String DEFAULT_ENCODING = "UTF-8"; //$NON-NLS-1$

}
