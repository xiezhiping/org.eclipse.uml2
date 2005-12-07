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
 * $Id: UMLHelperImpl.java,v 1.1 2005/12/07 14:17:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.UMLPackage;


public class UMLHelperImpl
		extends XMIHelperImpl {

	public UMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	public void setValue(EObject object, EStructuralFeature feature,
			Object value, int position) {

		if (feature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER
			&& value.equals("*")) { //$NON-NLS-1$

			((MultiplicityElement) object)
				.setUpper(MultiplicityElement.UNLIMITED_UPPER_BOUND);
		} else if (feature == UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL__VALUE
			&& value.equals("*")) { //$NON-NLS-1$

			((LiteralUnlimitedNatural) object)
				.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND);
		} else {
			super.setValue(object, feature, value, position);
		}
	}

}
