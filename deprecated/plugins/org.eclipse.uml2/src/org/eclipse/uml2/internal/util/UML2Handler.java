/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;

/**
 *
 */
public class UML2Handler
	extends SAXXMIHandler {

	public UML2Handler(XMLResource xmiResource, XMLHelper helper,
			Map options) {
		super(xmiResource, helper, options);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#getPackageForURI(java.lang.String)
	 */
	protected EPackage getPackageForURI(String uriString) {

		if (uriString == null) {
			return null;
		}

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(uriString);

		if (ePackage == null) {
			URI uri = URI.createURI(uriString);

			if (uri.scheme() == null) {

				for (Iterator entries = EPackage.Registry.INSTANCE.entrySet()
					.iterator(); entries.hasNext();) {

					Map.Entry entry = (Map.Entry) entries.next();
					String nsURI = (String) entry.getKey();

					if (nsURI.endsWith(uriString)
						&& nsURI
							.charAt(nsURI.length() - uriString.length() - 1) == '/') {

						oldStyleProxyURIs = true;
						return (EPackage) entry.getValue();
					}
				}
			}

			if (urisToLocations != null) {
				URI locationURI = (URI) urisToLocations.get(uriString);

				if (locationURI != null) {
					uri = locationURI;
				}
			}

			String fragment = uri.fragment();
			Resource resource = null;

			if (resourceSet != null) {
				URI trimmedURI = uri.trimFragment();
				resource = resourceSet.getResource(trimmedURI, false);

				if (resource == null) {

					try {
						InputStream inputStream = new UML2URIConverterImpl(
							resourceSet.getURIConverter())
							.createInputStream(trimmedURI);
						resource = resourceSet.createResource(trimmedURI);

						if (resource == null) {
							inputStream.close();
						} else {
							resource.load(inputStream, resourceSet
								.getLoadOptions());
						}
					} catch (IOException exception) {
						// ignore
					}
				}
			}

			if (resource != null) {
				Object content = null;

				if (fragment != null) {
					content = resource.getEObject(fragment);
				} else {
					List contents = resource.getContents();

					if (!contents.isEmpty()) {
						content = contents.get(0);
					}
				}

				if (content instanceof EPackage) {
					ePackage = (EPackage) content;
				}
			}
		}

		if (ePackage == null) {
			error(new PackageNotFoundException(uriString, getLocation(),
				getLineNumber(), getColumnNumber()));
		}

		return ePackage;
	}

}