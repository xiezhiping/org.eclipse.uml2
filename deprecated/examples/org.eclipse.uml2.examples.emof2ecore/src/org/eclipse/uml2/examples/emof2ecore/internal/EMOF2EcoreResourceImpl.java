/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 * 
 * $Id: EMOF2EcoreResourceImpl.java,v 1.1 2004/12/21 22:06:15 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResource;

/**
 * The <b>Resource </b> associated with the package.
 * 
 * @see org.eclipse.uml2.examples.emof2ecore.Ecore2EcoreResourceFactoryImpl
 */
public class EMOF2EcoreResourceImpl
		extends XMIResourceImpl
		implements EMOF2EcoreResource {

	public static final String copyright = "Copyright (c) 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource.
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 */
	public EMOF2EcoreResourceImpl(URI uri) {
		super(uri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doLoad(java.io.InputStream,
	 *      java.util.Map)
	 */
	public void doLoad(InputStream inputStream, Map options)
			throws IOException {

		super.doLoad(inputStream, options);

		PostProcessor postProcessor = (PostProcessor) options
			.get(OPTION_POST_PROCESSOR);

		if (null != postProcessor) {
			postProcessor.postLoad(this, options);
		}
	}

} // EMOF2EcoreResourceImpl
