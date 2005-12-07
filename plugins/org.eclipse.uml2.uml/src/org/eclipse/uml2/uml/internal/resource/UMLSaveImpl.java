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
 * $Id: UMLSaveImpl.java,v 1.1 2005/12/07 14:17:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.uml2.uml.UMLPackage;

public class UMLSaveImpl
		extends XMISaveImpl {

	public UMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	protected String getDatatypeValue(Object value, EStructuralFeature feature,
			boolean isAttribute) {
		String result = super.getDatatypeValue(value, feature, isAttribute);

		return (feature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER || feature == UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL__VALUE)
			&& result.equals("-1") //$NON-NLS-1$
			? "*" //$NON-NLS-1$
			: result;
	}

}
