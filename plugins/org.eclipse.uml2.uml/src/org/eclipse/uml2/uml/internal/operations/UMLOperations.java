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
 * $Id: UMLOperations.java,v 1.2 2005/12/14 22:34:27 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.util.UMLUtil;

class UMLOperations
		extends UMLUtil {

	protected static class UMLCrossReferenceAdapter
			extends ECrossReferenceAdapter {

		protected void adapt(EObject eObject) {
			Resource resource = eObject.eResource();

			if (resource == null) {
				addAdapter(EcoreUtil.getRootContainer(eObject));
			} else {
				ResourceSet resourceSet = resource.getResourceSet();

				if (resourceSet == null) {
					addAdapter(resource);
				} else {
					addAdapter(resourceSet);
				}
			}
		}

		public Collection getNonNavigableInverseReferences(EObject eObject) {
			adapt(eObject);
			return super.getNonNavigableInverseReferences(eObject);
		}

		public Collection getInverseReferences(EObject eObject) {
			adapt(eObject);
			return super.getInverseReferences(eObject);
		}
	}

	protected static final UMLCrossReferenceAdapter CROSS_REFERENCE_ADAPTER = new UMLCrossReferenceAdapter();

}
