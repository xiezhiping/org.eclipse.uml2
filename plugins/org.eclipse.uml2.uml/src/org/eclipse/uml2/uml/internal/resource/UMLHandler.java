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
 * $Id: UMLHandler.java,v 1.1 2005/12/07 14:17:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;


public class UMLHandler
		extends SAXXMIHandler {

	protected final Map urisToProxies = new HashMap();

	public UMLHandler(XMLResource xmiResource, XMLHelper helper, Map options) {
		super(xmiResource, helper, options);
	}

	public void endDocument() {
		super.endDocument();

		if (extendedMetaData != null) {

			for (Iterator demandedPackages = extendedMetaData
				.demandedPackages().iterator(); demandedPackages.hasNext();) {

				EPackage ePackage = (EPackage) demandedPackages.next();
				String nsURI = ePackage.getNsURI();

				if (nsURI != null) {

					if (urisToLocations != null) {
						URI locationURI = (URI) urisToLocations.get(nsURI);

						if (locationURI != null) {
							Resource resource = new ResourceImpl();
							resource.setURI(locationURI);
							resource.getContents().add(ePackage);
						}
					}

					for (Iterator entries = helper.getPrefixToNamespaceMap()
						.iterator(); entries.hasNext();) {

						Map.Entry entry = (Map.Entry) entries.next();

						if (nsURI.equals(entry.getValue())) {
							ePackage.setNsPrefix((String) entry.getKey());
						}
					}
				}
			}
		}
	}

	protected EObject validateCreateObjectFromFactory(EFactory factory,
			String typeName, EObject newObject, EStructuralFeature feature) {

		if (!(objects.peek() instanceof AnyType) && newObject != null
			&& newObject.eIsProxy() && !sameDocumentProxies.contains(newObject)) {

			URI proxyURI = ((InternalEObject) newObject).eProxyURI();
			Map typeNamesToProxies = (Map) urisToProxies.get(proxyURI);

			if (typeNamesToProxies == null) {
				urisToProxies.put(proxyURI, typeNamesToProxies = new HashMap());
			}

			EObject proxy = (EObject) typeNamesToProxies.get(typeName);

			if (proxy == null) {
				typeNamesToProxies.put(typeName, proxy = newObject);
			}

			// canonicalize proxies
			newObject = proxy;
		}

		return super.validateCreateObjectFromFactory(factory, typeName,
			newObject, feature);
	}

}
