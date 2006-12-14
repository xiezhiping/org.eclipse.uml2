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
 * $Id: UML22UMLHandler.java,v 1.7 2006/12/14 15:49:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetaData;

public class UML22UMLHandler
		extends UMLHandler {

	public UML22UMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	@Override
	protected void createObject(EObject peekObject, EStructuralFeature feature) {

		if (!isNull()) {
			String xsiType = getXSIType();

			Map<String, Map<EClassifier, String>> featureToTypeMap = xsiType == null
				? UML22UMLExtendedMetaData.getFeatureToTypeMap()
				: UML22UMLExtendedMetaData.getTypeToTypeMap().get(xsiType);

			Map<EClassifier, String> typeMap = featureToTypeMap == null
				? null
				: featureToTypeMap.get(feature.getName());

			if (typeMap != null) {
				EObject eObject = peekObject instanceof AnyType
					? (EObject) objects.get(objects.size() - 2)
					: peekObject;

				for (Map.Entry<EClassifier, String> entry : typeMap.entrySet()) {

					if (entry.getKey().isInstance(eObject)) {
						xsiType = entry.getValue();
						break;
					}
				}
			}

			if (xsiType != null) {
				createObjectFromTypeName(peekObject, xsiType, feature);
			} else {
				super.createObject(peekObject, feature);
			}
		}
	}

}
