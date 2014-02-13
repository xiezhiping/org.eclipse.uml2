/*
 * Copyright (c) 2006, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.BodyOwner;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

public class XMI2UMLHelperImpl
		extends XMIHelperImpl {

	public XMI2UMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	@Override
	public String getHREF(EObject obj) {
		String href = super.getHREF(obj);

		if (href.startsWith(UMLResource.UML_METAMODEL_URI)) {
			href = XMI2UMLResource.UML_METAMODEL_URI
				+ href.substring(href.indexOf('#'));
		} else if (href.startsWith(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI)) {
			href = XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI
				+ href.substring(href.indexOf('#'));
		} else if (href.startsWith(UMLResource.STANDARD_PROFILE_URI)) {
			href = XMI2UMLResource.STANDARD_PROFILE_URI
				+ href.substring(href.indexOf('#'));
		}

		return href;
	}

	@Override
	public Object getValue(EObject eObject,
			EStructuralFeature eStructuralFeature) {
		BodyOwner bodyOwner = null;

		if (eStructuralFeature == UMLPackage.Literals.OPAQUE_BEHAVIOR__BODY) {

			for (EStructuralFeature.Setting inverseReference : UML2Util
				.getInverseReferences(eObject)) {

				if (inverseReference.getEStructuralFeature() == UMLPackage.Literals.BEHAVIORAL_FEATURE__METHOD
					&& inverseReference.getEObject() instanceof Operation) {

					bodyOwner = (BodyOwner) eObject;
					break;
				}
			}
		} else if (eStructuralFeature == UMLPackage.Literals.OPAQUE_EXPRESSION__BODY) {
			EObject eContainer = eObject.eContainer();

			if (eContainer instanceof Constraint) {

				for (EStructuralFeature.Setting nonNavigableInverseReference : UML2Util
					.getNonNavigableInverseReferences(eContainer)) {

					if (nonNavigableInverseReference.getEStructuralFeature() == UMLPackage.Literals.OPERATION__BODY_CONDITION) {
						bodyOwner = (BodyOwner) eObject;
						break;
					}
				}
			}
		}

		if (bodyOwner != null) {
			EList<String> languages = bodyOwner.getLanguages();
			List<String> bodies = new ArrayList<String>(bodyOwner.getBodies());

			int size = Math.min(languages.size(), bodies.size());

			for (int i = 0; i < size; i++) {

				if (UMLUtil.LANGUAGE__OCL.equals(languages.get(i))) {
					String body = bodies.get(i);

					if (UML2Util.safeEquals(body, UMLUtil.getOCLBody(body))) {
						bodies.set(i, "result = (" + body + ")"); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			}

			return bodies;
		} else {
			return super.getValue(eObject, eStructuralFeature);
		}
	}

}
