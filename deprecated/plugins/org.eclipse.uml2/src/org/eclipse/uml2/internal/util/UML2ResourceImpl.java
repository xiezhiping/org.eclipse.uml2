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
 * $Id: UML2ResourceImpl.java,v 1.5 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.uml2.util.UML2Resource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.internal.util.UML2ResourceFactoryImpl
 * @generated
 */
public class UML2ResourceImpl extends XMIResourceImpl implements UML2Resource {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public UML2ResourceImpl(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useIDAttributes()
	 */
	protected boolean useIDAttributes() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
	 */
	protected boolean useUUIDs() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#createXMLLoad()
	 */
	protected XMLLoad createXMLLoad() {
		return new UML2LoadImpl(createXMLHelper());
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

		PostProcessor postProcessor = null == options
			? null
			: (PostProcessor) options.get(OPTION_POST_PROCESSOR);

		if (null != postProcessor) {
			postProcessor.postLoad(this, options);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doSave(java.io.OutputStream,
	 *      java.util.Map)
	 */
	public void doSave(OutputStream outputStream, Map options)
			throws IOException {

		PreProcessor preProcessor = null == options
			? null
			: (PreProcessor) options.get(OPTION_PRE_PROCESSOR);

		if (null != preProcessor) {
			preProcessor.preSave(this, options);
		}

		super.doSave(outputStream, options);
	}

} //UML2ResourceImpl
