/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 414572
 *
 */
package org.eclipse.uml2.uml.tests.util;

import java.io.File;
import java.net.URL;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

/**
 * Utility for configuring the test environment for stand-alone execution.
 */
public class StandaloneSupport {

	/**
	 * Not instantiable by clients.
	 */
	private StandaloneSupport() {
		super();
	}

	public static boolean isStandalone() {
		return !EcorePlugin.IS_ECLIPSE_RUNNING;
	}

	public static void initGlobals() {
		UMLResourcesUtil.initGlobalRegistries();
		initUMLResourceMappings(URIConverter.INSTANCE.getURIMap());
	}

	public static ResourceSet init(ResourceSet rset) {
		UMLResourcesUtil.initLocalRegistries(rset);

		initUMLResourceMappings(rset.getURIConverter().getURIMap());

		return rset;
	}

	private static void initUMLResourceMappings(Map<URI, URI> uriMap) {
		mapUMLResourceURIs(uriMap, UMLResource.UML_METAMODEL_URI, "metamodels");
		mapUMLResourceURIs(uriMap, UMLResource.ECORE_PROFILE_URI, "profiles");
		mapUMLResourceURIs(uriMap, UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI,
			"libraries");
	}

	public static void mapUMLResourceURIs(Map<URI, URI> uriMap, String uri,
			String folder) {

		URI uriToMap = URI.createURI(uri);
		URI prefix = uriToMap.trimSegments(1).appendSegment(""); // ensure
																	// trailing
																	// separator

		URL resourceURL = StandaloneSupport.class.getClassLoader().getResource(
			"/" + folder + "/" + uriToMap.lastSegment());

		if (resourceURL == null) {
			// probably, we're not running with JARs, so assuming a git
			// workspace
			try {
				resourceURL = new File("")
					.getAbsoluteFile()
					.getParentFile()
					.getParentFile()
					.toURI()
					.resolve(
						"plugins/org.eclipse.uml2.uml.resources/" + folder
							+ "/" + uriToMap.lastSegment()).toURL();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (resourceURL != null) {
			URI resolved = URI.createURI(resourceURL.toExternalForm())
				.trimSegments(1).appendSegment("");
			uriMap.put(prefix, resolved);

			// and platform URIs, too
			uriMap.put(URI
				.createURI("platform:/plugin/org.eclipse.uml2.uml.resources/"
					+ folder + "/"), resolved);
			uriMap.put(URI
				.createURI("platform:/resource/org.eclipse.uml2.uml.resources/"
					+ folder + "/"), resolved);
		}
	}

}