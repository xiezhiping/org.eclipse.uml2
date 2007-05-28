/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLPlugin.java,v 1.4 2007/05/28 20:10:51 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.plugin.RegistryReader;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the UML model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class UMLPlugin
		extends EMFPlugin {

	protected static class GeneratedPackageRegistryReader
			extends RegistryReader {

		protected static final String TAG_PROFILE = "profile"; //$NON-NLS-1$

		protected static final String ATT_URI = "uri"; //$NON-NLS-1$

		protected static final String ATT_LOCATION = "location"; //$NON-NLS-1$

		protected Map<String, URI> ePackageNsURIToProfileLocationMap;

		protected GeneratedPackageRegistryReader() {
			super(Platform.getExtensionRegistry(), getPlugin().getBundle()
				.getSymbolicName(), GENERATED_PACKAGE_PPID);
		}

		protected GeneratedPackageRegistryReader(
				Map<String, URI> ePackageNsURIToProfileLocationMap) {
			this();

			this.ePackageNsURIToProfileLocationMap = ePackageNsURIToProfileLocationMap;
		}

		@Override
		protected boolean readElement(IConfigurationElement element, boolean add) {

			if (element.getName().equals(TAG_PROFILE)) {
				String uri = element.getAttribute(ATT_URI);

				if (uri == null) {
					logMissingAttribute(element, ATT_URI);
				} else if (add) {

					if (ePackageNsURIToProfileLocationMap != null) {
						String location = element.getAttribute(ATT_LOCATION);

						if (location != null) {
							URI profileLocation = URI.createURI(location);

							if (profileLocation.isRelative()) {
								profileLocation = URI.createPlatformPluginURI(
									element.getDeclaringExtension()
										.getContributor().getName()
										+ '/' + location, true);
							}

							ePackageNsURIToProfileLocationMap.put(uri,
								profileLocation);
						}
					}

					return true;
				} else {
					ePackageNsURIToProfileLocationMap.remove(uri);
					return true;
				}
			}

			return false;
		}
	}

	private static Map<String, URI> ePackageNsURIToProfileLocationMap;

	public static Map<String, URI> getEPackageNsURIToProfileLocationMap() {

		if (ePackageNsURIToProfileLocationMap == null) {
			ePackageNsURIToProfileLocationMap = new HashMap<String, URI>();
		}

		return ePackageNsURIToProfileLocationMap;
	}

	protected static final String GENERATED_PACKAGE_PPID = "generated_package"; //$NON-NLS-1$

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UMLPlugin INSTANCE = new UMLPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLPlugin() {
		super(new ResourceLocator[]{});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation
			extends EclipsePlugin {

		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}

		@Override
		public void start(BundleContext context)
				throws Exception {
			super.start(context);

			new GeneratedPackageRegistryReader(
				getEPackageNsURIToProfileLocationMap()).readRegistry();
		}

	}

}
