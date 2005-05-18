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
 * $Id: UML2ResourceImpl.java,v 1.7 2005/05/18 16:38:32 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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

} //UML2ResourceImpl
