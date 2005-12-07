/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLResourceImpl.java,v 1.1 2005/12/07 14:17:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl
 * @generated
 */
public class UMLResourceImpl
		extends XMIResourceImpl
		implements UMLResource {

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public UMLResourceImpl(URI uri) {
		super(uri);
	}

	protected XMLHelper createXMLHelper() {
		return new UMLHelperImpl(this);
	}

	protected XMLLoad createXMLLoad() {
		return new UMLLoadImpl(createXMLHelper());
	}

	protected XMLSave createXMLSave() {
	    return new UMLSaveImpl(createXMLHelper());
	}

	protected boolean useIDAttributes() {
		return false;
	}

	protected boolean useUUIDs() {
		return true;
	}

} //UMLResourceImpl
