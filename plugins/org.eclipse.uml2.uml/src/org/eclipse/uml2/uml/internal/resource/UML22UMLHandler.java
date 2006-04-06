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
 * $Id: UML22UMLHandler.java,v 1.1 2006/04/06 04:30:32 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class UML22UMLHandler
		extends UMLHandler {

	protected static final Map xsiTypeMap = new HashMap();

	static {
		xsiTypeMap.put("formalParameter", "uml:Parameter"); //$NON-NLS-1$ //$NON-NLS-2$
		xsiTypeMap.put("ownedStateMachine", "uml:StateMachine"); //$NON-NLS-1$ //$NON-NLS-2$
		xsiTypeMap.put("packageableElement_visibility", "uml:VisibilityKind"); //$NON-NLS-1$ //$NON-NLS-2$
		xsiTypeMap.put("packageExtension", "uml:PackageMerge"); //$NON-NLS-1$ //$NON-NLS-2$
		xsiTypeMap.put("packageImport", "uml:PackageImport"); //$NON-NLS-1$ //$NON-NLS-2$
		xsiTypeMap.put("returnResult", "uml:Parameter"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public UML22UMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map options) {
		super(xmiResource, helper, options);
	}

	protected void createObject(EObject peekObject, EStructuralFeature feature) {

		if (!isNull()) {
			String xsiType = getXSIType();

			if (xsiType == null) {
				xsiType = (String) xsiTypeMap.get(feature.getName());
			}

			if (xsiType != null) {
				createObjectFromTypeName(peekObject, xsiType, feature);
			} else {
				super.createObject(peekObject, feature);
			}
		}
	}

}
