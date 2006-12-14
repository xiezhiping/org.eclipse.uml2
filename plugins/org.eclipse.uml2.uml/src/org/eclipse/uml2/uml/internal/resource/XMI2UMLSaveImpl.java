/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: XMI2UMLSaveImpl.java,v 1.2 2006/12/14 15:49:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;

public class XMI2UMLSaveImpl
		extends XMISaveImpl {

	public XMI2UMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected void saveContainedMany(EObject eObject,
			EStructuralFeature eStructuralFeature) {

		if (eStructuralFeature == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS) {
			doc.startElement(EMOFExtendedMetaData.XMI_EXTENSION_ELEMENT);
			doc.addAttribute(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE,
				EcorePackage.eNS_URI);
			super.saveContainedMany(eObject, eStructuralFeature);
			doc.endElement();
		} else {
			super.saveContainedMany(eObject, eStructuralFeature);
		}
	}

}
