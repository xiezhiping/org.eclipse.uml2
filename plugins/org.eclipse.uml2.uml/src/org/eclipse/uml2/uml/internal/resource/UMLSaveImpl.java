/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;


public class UMLSaveImpl
		extends XMISaveImpl {
	
	public UMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected void saveIDRefMany(EObject o, EStructuralFeature f) {
		
		if (f == UMLPackage.Literals.INSTANCE_SPECIFICATION__CLASSIFIER && o instanceof EnumerationLiteral) {
			return;
		}

		super.saveIDRefMany(o, f);
	}

	@Override
	protected void saveHRefMany(EObject o, EStructuralFeature f) {

		if (f == UMLPackage.Literals.INSTANCE_SPECIFICATION__CLASSIFIER && o instanceof EnumerationLiteral) {
			return;
		}

		super.saveHRefMany(o, f);
	}

}
