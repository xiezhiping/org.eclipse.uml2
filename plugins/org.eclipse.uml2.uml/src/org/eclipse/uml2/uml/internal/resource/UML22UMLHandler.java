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
 *   Christian W. Damus (CEA) - 437977
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UML22UMLHandler
		extends UMLHandler {

	public UML22UMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	@Override
	protected void createObject(EObject peekObject, EStructuralFeature feature) {

		if (isNull()) {
			super.createObject(peekObject, feature);
		} else {
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

	@Override
	protected EFactory getFactoryForPrefix(String prefix) {

		if ("Basic_0".equals(prefix) || "Intermediate_0".equals(prefix) //$NON-NLS-1$ //$NON-NLS-2$
			|| "Complete_0".equals(prefix)) { //$NON-NLS-1$

			EFactory factory = prefixesToFactories.get(prefix);

			if (factory == null) {
				EPackage ePackage = getPackageForURI(UMLResource.STANDARD_PROFILE_NS_URI);

				if (ePackage != null) {
					factory = ePackage.getEFactoryInstance();
					prefixesToFactories.put(prefix, factory);
				}
			}

			return factory;
		}

		return super.getFactoryForPrefix(prefix);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected EObject createObjectFromFactory(EFactory factory, String typeName) {

		if (typeName.startsWith("Basic__")) { //$NON-NLS-1$
			typeName = typeName.substring(7);
		} else if (typeName.startsWith("Intermediate__")) { //$NON-NLS-1$
			typeName = typeName.substring(14);
		} else if (typeName.startsWith("Complete__")) { //$NON-NLS-1$
			typeName = typeName.substring(10);
		}

		return super.createObjectFromFactory(factory, typeName);
	}

	@Override
	protected void setFeatureValue(EObject object, EStructuralFeature feature,
			Object value, int position) {

		if (feature == UMLPackage.Literals.OPERATION__TYPE) {
			return;
		}

		super.setFeatureValue(object, feature, value, position);
	}

}
