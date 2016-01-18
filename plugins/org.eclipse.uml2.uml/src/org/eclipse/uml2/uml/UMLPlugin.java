/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 215488
 *   Kenn Hussey (CEA) - 279044, 485756
 *   Christian W. Damus (CEA) - 401804
 *
 */
package org.eclipse.uml2.uml;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.plugin.RegistryReader;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the UML model plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class UMLPlugin
		extends EMFPlugin {

	protected static class PackageRegistryReader
			extends RegistryReader {

		protected static final String TAG_PROFILE = "profile"; //$NON-NLS-1$

		protected static final String ATT_URI = "uri"; //$NON-NLS-1$

		protected static final String ATT_LOCATION = "location"; //$NON-NLS-1$

		protected Map<String, URI> ePackageNsURIToProfileLocationMap;

		protected PackageRegistryReader(IExtensionRegistry pluginRegistry,
				String pluginID, String extensionPointID) {
			super(pluginRegistry, pluginID, extensionPointID);
		}

		protected PackageRegistryReader(IExtensionRegistry pluginRegistry,
				String pluginID, String extensionPointID,
				Map<String, URI> ePackageNsURIToProfileLocationMap) {
			this(pluginRegistry, pluginID, extensionPointID);

			this.ePackageNsURIToProfileLocationMap = ePackageNsURIToProfileLocationMap;
		}

		@Override
		protected boolean readElement(IConfigurationElement element,
				boolean add) {

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
										.getContributor().getName() + '/'
										+ location,
									false);
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

	protected static class GeneratedPackageRegistryReader
			extends PackageRegistryReader {

		protected GeneratedPackageRegistryReader() {
			super(Platform.getExtensionRegistry(),
				UMLPlugin.INSTANCE.getSymbolicName(), GENERATED_PACKAGE_PPID);
		}

		protected GeneratedPackageRegistryReader(
				Map<String, URI> ePackageNsURIToProfileLocationMap) {
			super(Platform.getExtensionRegistry(),
				UMLPlugin.INSTANCE.getSymbolicName(), GENERATED_PACKAGE_PPID,
				ePackageNsURIToProfileLocationMap);
		}
	}

	protected static class DynamicPackageRegistryReader
			extends PackageRegistryReader {

		protected DynamicPackageRegistryReader() {
			super(Platform.getExtensionRegistry(),
				UMLPlugin.INSTANCE.getSymbolicName(), DYNAMIC_PACKAGE_PPID);
		}

		protected DynamicPackageRegistryReader(
				Map<String, URI> ePackageNsURIToProfileLocationMap) {
			super(Platform.getExtensionRegistry(),
				UMLPlugin.INSTANCE.getSymbolicName(), DYNAMIC_PACKAGE_PPID,
				ePackageNsURIToProfileLocationMap);
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

	protected static final String DYNAMIC_PACKAGE_PPID = "dynamic_package"; //$NON-NLS-1$

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

			ExtensionProcessor.internalProcessExtensions();
		}

	}

	/**
	 * A utility for loading of <tt>plugin.xml</tt> extensions in a non-Eclipse
	 * application.
	 * 
	 * @see ExtensionProcessor#process(ClassLoader)
	 * @since 5.0
	 */
	public static class ExtensionProcessor {

		/**
		 * Populate all Ecore and UML2 extensions points from
		 * <tt>plugin.xml</tt> files on the classpath (or in the development
		 * workspace, as appropriate). This method has no effect when the
		 * Eclipse platform is running, as in that context bundle activation
		 * takes care of these extensions points.
		 * 
		 * @param classLoader
		 *            an optional class-loader used to scan for
		 *            <tt>plugin.xml</tt> files. If {@code null}, the current
		 *            {@linkplain Thread#getContextClassLoader() context
		 *            class-loader} will be used
		 * 
		 * @since 5.0
		 */
		public static synchronized void process(ClassLoader classLoader) {
			// Initialize the Ecore extensions that we rely on, which operation
			// actually populates the Eclipse registry that we need to read
			EcorePlugin.ExtensionProcessor.process(classLoader);

			// Ensure that we only do this once, and then only in an
			// Eclipse-free context
			if ((ePackageNsURIToProfileLocationMap == null)
				&& !EMFPlugin.IS_ECLIPSE_RUNNING) {

				ePackageNsURIToProfileLocationMap = new HashMap<String, URI>();

				internalProcessExtensions();
				mapPlatformPluginURIs();
			}
		}

		private static void internalProcessExtensions() {
			new GeneratedPackageRegistryReader(
				getEPackageNsURIToProfileLocationMap()).readRegistry();
			new DynamicPackageRegistryReader(
				getEPackageNsURIToProfileLocationMap()).readRegistry();
		}

		private static void mapPlatformPluginURIs() {
			// The resources plug-in doesn't register any genmodels, so EMF will
			// not automatically map its platform:/plugin/... URI to a location
			// URI. Let's force the issue by asking EMF to map some
			// representative URI that maps to the resources plug-in
			Set<URI> umlResourceURIs = new HashSet<URI>();
			umlResourceURIs.add(URIConverter.INSTANCE
				.normalize(URI.createURI(UMLResource.LIBRARIES_PATHMAP)));

			URIConverter.URI_MAP.putAll(EcorePlugin
				.computePlatformResourceToPlatformPluginMap(umlResourceURIs));
		}
	}

}
