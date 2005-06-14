/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2ExtendedMetaData.java,v 1.4 2005/06/14 16:48:18 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLInfoImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

/**
 * Extended metadata for UML2 resources. Provides forward compatibility support
 * by matching namespace URIs.
 */
public class UML2ExtendedMetaData
		extends BasicExtendedMetaData {

	/**
	 * The registry of 'compatible' packages.
	 */
	private final EPackage.Registry compatibilityRegistry = new EPackageRegistryImpl();

	/**
	 * The map used to map compatible packages to their original namespaces.
	 */
	private final XMLResource.XMLMap xmlMap = new XMLMapImpl();

	/**
	 * Constructs a new UML2 extended metadata with the specified package
	 * registry.
	 * 
	 * @param registry
	 *            The resource set's package registry.
	 */
	public UML2ExtendedMetaData(EPackage.Registry registry) {
		super(registry);
	}

	/**
	 * Retrieves a pattern for the specified namespace URI by replacing version
	 * information (i.e. digits) with wildcards.
	 * 
	 * @param nsURI
	 *            The namespace URI for which to retrieve a pattern.
	 * @return The namespace URI pattern.
	 */
	protected String getNsURIPattern(String nsURI) {
		StringBuffer nsURIPattern = new StringBuffer();

		for (int i = 0; i < nsURI.length(); i++) {

			if (Character.isDigit(nsURI.charAt(i))) {
				nsURIPattern.append("\\d");//$NON-NLS-1$
			} else {
				nsURIPattern.append(nsURI.charAt(i));
			}
		}

		return nsURIPattern.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.ExtendedMetaData#getPackage(java.lang.String)
	 */
	public EPackage getPackage(String namespace) {
		EPackage ePackage = super.getPackage(namespace);

		if (null == ePackage && null != namespace) {
			ePackage = compatibilityRegistry.getEPackage(namespace);

			if (null != ePackage) {
				return ePackage;
			}

			ePackage = findPackage(registry, getNsURIPattern(namespace));

			if (null != ePackage) {
				compatibilityRegistry.put(namespace, ePackage);

				XMLResource.XMLInfo xmlInfo = new XMLInfoImpl();
				xmlInfo.setTargetNamespace(namespace);
				xmlMap.add(ePackage, xmlInfo);
			}
		}

		return ePackage;
	}

	protected EPackage findPackage(EPackage.Registry registry,
			String nsURIPattern) {

		for (Iterator nsURIs = registry.keySet().iterator(); nsURIs.hasNext();) {
			String nsURI = (String) nsURIs.next();

			if (nsURI.matches(nsURIPattern)) {
				return registry.getEPackage(nsURI);
			}
		}

		return EPackage.Registry.INSTANCE != registry
			? findPackage(EPackage.Registry.INSTANCE, nsURIPattern)
			: null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.ExtendedMetaData#getNamespace(org.eclipse.emf.ecore.EPackage)
	 */
	public String getNamespace(EPackage ePackage) {
		XMLResource.XMLInfo xmlInfo = xmlMap.getInfo(ePackage);

		if (null != xmlInfo) {
			String namespace = xmlInfo.getTargetNamespace();

			if (null != namespace) {
				return namespace;
			}
		}

		return super.getNamespace(ePackage);
	}

}