/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2URIConverterImpl.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.core.runtime.IPluginDescriptor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PluginVersionIdentifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.URIConverter;

/**
 *  
 */
public class UML2URIConverterImpl
	implements URIConverter {

	// ECLIPSE-DEPEND-BEGIN
	public static class WorkbenchHelper {

		public static InputStream createPlatformPluginInputStream(
				String platformPluginPath)
			throws IOException {

			int segmentIndex = platformPluginPath.indexOf('/', 1);
			int versionIndex = platformPluginPath.substring(0, segmentIndex)
				.lastIndexOf('_');

			String pluginId = platformPluginPath.substring(1,
				-1 == versionIndex
					? segmentIndex : versionIndex);
			IPluginDescriptor plugin = -1 == versionIndex
				? Platform.getPluginRegistry().getPluginDescriptor(pluginId)
				: Platform.getPluginRegistry().getPluginDescriptor(
					pluginId,
					new PluginVersionIdentifier(platformPluginPath.substring(
						versionIndex + 1, segmentIndex)));

			return plugin.find(
				new Path(platformPluginPath.substring(segmentIndex + 1)))
				.openConnection().getInputStream();
		}
	}

	// ECLIPSE-DEPEND-END

	private static final String SCHEME_PLATFORM = "platform"; //$NON-NLS-1$

	private static final String SEGMENT_PLUGIN = "plugin"; //$NON-NLS-1$

	private final URIConverter uriConverter;

	public UML2URIConverterImpl(URIConverter uriConverter) {
		super();

		this.uriConverter = uriConverter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.URIConverter#normalize(org.eclipse.emf.common.util.URI)
	 */
	public URI normalize(URI uri) {
		return uriConverter.normalize(uri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.URIConverter#getURIMap()
	 */
	public Map getURIMap() {
		return uriConverter.getURIMap();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.URIConverter#createInputStream(org.eclipse.emf.common.util.URI)
	 */
	public InputStream createInputStream(URI uri)
		throws IOException {

		try {
			return uriConverter.createInputStream(uri);
		} catch (IOException ioe) {
			URI normalizedURI = normalize(uri);

			if (SCHEME_PLATFORM.equals(normalizedURI.scheme())
				&& 1 < normalizedURI.segmentCount()
				&& SEGMENT_PLUGIN.equals(normalizedURI.segment(0))) {

				StringBuffer platformPluginPath = new StringBuffer();

				for (int i = 1, size = normalizedURI.segmentCount(); i < size; ++i) {
					platformPluginPath.append('/');
					platformPluginPath.append(normalizedURI.segment(i));
				}

				return createPlatformPluginInputStream(platformPluginPath
					.toString());
			} else {
				throw ioe;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.URIConverter#createOutputStream(org.eclipse.emf.common.util.URI)
	 */
	public OutputStream createOutputStream(URI uri)
		throws IOException {

		return uriConverter.createOutputStream(uri);
	}

	protected InputStream createPlatformPluginInputStream(
			String platformPluginPath)
		throws IOException {

		if (null == EcorePlugin.getWorkspaceRoot()) {
			URI resolvedURI = EcorePlugin
				.resolvePlatformResourcePath(platformPluginPath);

			if (null != resolvedURI) {
				return createInputStream(resolvedURI);
			}

			throw new IOException("The path '" + platformPluginPath //$NON-NLS-1$
				+ "' is not mapped"); //$NON-NLS-1$
		} else {
			// ECLIPSE-DEPEND-BEGIN
			return WorkbenchHelper
				.createPlatformPluginInputStream(platformPluginPath);
			// ECLIPSE-DEPEND-END
		}
	}

}