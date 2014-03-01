/*
 * Copyright (c) 2012, 2014 CEA, Obeo, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 389542, 399544, 425846, 418466, 429352
 *   Mikael Barbero (Obeo) - 414572
 *   Christian W. Damus (CEA) - 414572, 401682
 */
package org.eclipse.uml2.uml.resources.util;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLContentHandlerImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UML212UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UML302UMLResource;
import org.eclipse.uml2.uml.resource.UML402UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.resources.ResourcesPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * @since 4.0
 */
public class UMLResourcesUtil
		extends UMLUtil {

	private static final ContentHandler XMI_CONTENT_HANDLER = new XMLContentHandlerImpl.XMI();

	private static final ContentHandler UML2_1_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		UML22UMLResource.UML2_CONTENT_TYPE_IDENTIFIER,
		new String[]{UML22UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		UML22UMLResource.UML2_METAMODEL_NS_URI, null);

	private static final ContentHandler UML2_2_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		UMLResource.UML_2_0_0_CONTENT_TYPE_IDENTIFIER,
		new String[]{UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND, UML2_UML_PACKAGE_2_0_NS_URI, null);

	private static final ContentHandler UML2_2_1_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		UMLResource.UML_2_1_0_CONTENT_TYPE_IDENTIFIER,
		new String[]{UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		UML212UMLResource.UML_METAMODEL_NS_URI, null);

	private static final ContentHandler UML2_3_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		UMLResource.UML_3_0_0_CONTENT_TYPE_IDENTIFIER,
		new String[]{UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		UML302UMLResource.UML_METAMODEL_NS_URI, null);

	private static final ContentHandler UML2_4_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		UMLResource.UML_4_0_0_CONTENT_TYPE_IDENTIFIER,
		new String[]{UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		UML402UMLResource.UML_METAMODEL_NS_URI, null);

	private static final ContentHandler UML2_5_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		UMLResource.UML_5_0_0_CONTENT_TYPE_IDENTIFIER,
		new String[]{UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND, UMLPackage.eNS_URI, null);

	private static final ContentHandler OMG_2_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		XMI2UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER,
		new String[]{XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		XMI2UMLResource.UML_METAMODEL_2_1_NS_URI, null);

	private static final ContentHandler OMG_2_1_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		XMI2UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER,
		new String[]{XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI, null);

	private static final ContentHandler OMG_2_2_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		XMI2UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER,
		new String[]{XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		XMI2UMLResource.UML_METAMODEL_2_2_NS_URI, null);

	private static final ContentHandler OMG_2_4_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		XMI2UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER,
		new String[]{XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		XMI2UMLResource.UML_METAMODEL_2_4_NS_URI, null);

	private static final ContentHandler OMG_2_4_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		XMI2UMLResource.UML_2_4_1_CONTENT_TYPE_IDENTIFIER,
		new String[]{XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		XMI2UMLResource.UML_METAMODEL_2_4_1_NS_URI, null);

	private static final ContentHandler OMG_2_5_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		XMI2UMLResource.UML_2_5_CONTENT_TYPE_IDENTIFIER,
		new String[]{XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		XMI2UMLResource.UML_METAMODEL_2_5_NS_URI, null);

	private static final ContentHandler CMOF_2_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		CMOF2UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER, new String[]{
			CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		CMOF2UMLResource.CMOF_2_0_METAMODEL_NS_URI, null);

	private static final ContentHandler CMOF_2_4_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		CMOF2UMLResource.CMOF_2_4_CONTENT_TYPE_IDENTIFIER, new String[]{
			CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		CMOF2UMLResource.CMOF_2_4_METAMODEL_NS_URI, null);

	private static final ContentHandler CMOF_2_4_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		CMOF2UMLResource.CMOF_2_4_1_CONTENT_TYPE_IDENTIFIER, new String[]{
			CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		CMOF2UMLResource.CMOF_2_4_1_METAMODEL_NS_URI, null);

	private static final ContentHandler CMOF_2_5_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
		CMOF2UMLResource.CMOF_2_5_CONTENT_TYPE_IDENTIFIER, new String[]{
			CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
		RootXMLContentHandlerImpl.XMI_KIND,
		CMOF2UMLResource.CMOF_2_5_METAMODEL_NS_URI, null);

	/**
	 * Adds registrations to EMF's and UML2's global registries that enable
	 * working with UML models. To apply the same registrations only locally on
	 * a resource set (e.g., for isolation from other EMF-based code in the same
	 * class loader), use the {@link #initLocalRegistries(ResourceSet)} method,
	 * instead.
	 * 
	 * @see #initLocalRegistries(ResourceSet)
	 * 
	 * @since 5.0
	 */
	public static void initGlobalRegistries() {
		initPackageRegistry(EPackage.Registry.INSTANCE);
		initEPackageNsURIToProfileLocationMap(UMLPlugin
			.getEPackageNsURIToProfileLocationMap());
		initURIConverterURIMap(URIConverter.URI_MAP);
		initContentHandlerRegistry(ContentHandler.Registry.INSTANCE);
		initResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
	}

	/**
	 * Adds registrations to a resource set's local registries that enable
	 * working with UML models in that resource set.
	 * 
	 * @see #initPackageRegistry(org.eclipse.emf.ecore.EPackage.Registry)
	 * @see #initResourceFactoryRegistry(org.eclipse.emf.ecore.resource.Resource.Factory.Registry)
	 * @see #initContentHandlerRegistry(org.eclipse.emf.ecore.resource.ContentHandler.Registry)
	 * @see #initURIConverterURIMap(Map)
	 * @see #initEPackageNsURIToProfileLocationMap(Map)
	 * 
	 * @since 5.0
	 */
	public static void initLocalRegistries(ResourceSet resourceSet) {
		initPackageRegistry(resourceSet.getPackageRegistry());

		// there is no local registry for this
		initEPackageNsURIToProfileLocationMap(UMLPlugin
			.getEPackageNsURIToProfileLocationMap());

		initURIConverterURIMap(resourceSet.getURIConverter().getURIMap());

		// there is no local registry for this
		initContentHandlerRegistry(ContentHandler.Registry.INSTANCE);

		initResourceFactoryRegistry(resourceSet.getResourceFactoryRegistry());
	}

	/**
	 * <p>
	 * Initializes the registries for the specified resource set (and/or the
	 * global registries) with the registrations needed to work with UML2
	 * resources in stand-alone mode (i.e., without Eclipse).
	 * </p>
	 * <p>
	 * <string>Note</string> that as of the 4.2 release, clients now have more
	 * fine-grained control of which registries (local or global) are
	 * initialized. Clients are encouraged to use these new APIs to ensure
	 * optimal behaviour and, where necessary, isolation from other code in the
	 * same class loader using the global registries.
	 * </p>
	 * 
	 * @param resourceSet
	 *            The resource set whose registries to initialize, or
	 *            <code>null</code> to perform only global registrations.
	 * @return The resource set (or <code>null</code>).
	 * 
	 * @since 4.0
	 * 
	 * @see #initLocalRegistries(ResourceSet)
	 * @see #initGlobalRegistries()
	 */
	public static ResourceSet init(ResourceSet resourceSet) {
		initGlobalRegistries();
		return UMLUtil.init(resourceSet);
	}

	/**
	 * Adds packages required for working with UML models to the specified
	 * registry.
	 * 
	 * @param packageRegistry
	 *            a package registry, perhaps local to a resource set or perhaps
	 *            the global registry
	 * 
	 * @return the same {@code packageRegistry}
	 * 
	 * @since 5.0
	 */
	public static EPackage.Registry initPackageRegistry(
			EPackage.Registry packageRegistry) {
		packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

		packageRegistry.put(UML2_TYPES_PACKAGE_4_0_NS_URI,
			TypesPackage.eINSTANCE);

		packageRegistry.put(TypesPackage.eNS_URI, TypesPackage.eINSTANCE);

		packageRegistry.put(UML2_UML_PACKAGE_2_0_NS_URI, UMLPackage.eINSTANCE);

		packageRegistry.put(UML212UMLResource.UML_METAMODEL_NS_URI,
			UMLPackage.eINSTANCE);

		packageRegistry.put(UML302UMLResource.UML_METAMODEL_NS_URI,
			UMLPackage.eINSTANCE);

		packageRegistry.put(UML402UMLResource.UML_METAMODEL_NS_URI,
			UMLPackage.eINSTANCE);

		packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);

		packageRegistry.put(UML212UMLResource.STANDARD_PROFILE_NS_URI,
			StandardPackage.eINSTANCE);

		packageRegistry.put(UML402UMLResource.STANDARD_L2_PROFILE_NS_URI,
			StandardPackage.eINSTANCE);
		packageRegistry.put(UML402UMLResource.STANDARD_L3_PROFILE_NS_URI,
			StandardPackage.eINSTANCE);

		packageRegistry.put(StandardPackage.eNS_URI, StandardPackage.eINSTANCE);

		return packageRegistry;
	}

	/**
	 * Adds resource factories required for working with UML models to the
	 * specified registry.
	 * 
	 * @param resourceFactoryRegistry
	 *            a resource-factory registry, perhaps local to a resource set
	 *            or perhaps the global registry
	 * 
	 * @return the same {@code resourceFactoryRegistry}
	 * 
	 * @since 5.0
	 */
	public static Resource.Factory.Registry initResourceFactoryRegistry(
			Resource.Factory.Registry resourceFactoryRegistry) {
		Map<String, Object> extensionToFactoryMap = resourceFactoryRegistry
			.getExtensionToFactoryMap();
		extensionToFactoryMap.put(UMLResource.FILE_EXTENSION,
			UMLResource.Factory.INSTANCE);

		Map<String, Object> contentTypeToFactoryMap = resourceFactoryRegistry
			.getContentTypeToFactoryMap();
		contentTypeToFactoryMap.put(UMLResource.UML_CONTENT_TYPE_IDENTIFIER,
			UMLResource.Factory.INSTANCE);

		return resourceFactoryRegistry;
	}

	/**
	 * Adds content-type handlers required for working with UML models to the
	 * specified registry.
	 * 
	 * @param contentHandlerRegistry
	 *            a content-type handler registry, perhaps local to a resource
	 *            set or perhaps the global registry
	 * 
	 * @return the same {@code contentHandlerRegistry}
	 * 
	 * @since 5.0
	 */
	public static ContentHandler.Registry initContentHandlerRegistry(
			ContentHandler.Registry contentHandlerRegistry) {
		List<ContentHandler> contentHandlers = contentHandlerRegistry
			.get(ContentHandler.Registry.LOW_PRIORITY);

		if (contentHandlers == null
			|| !contentHandlers.contains(XMI_CONTENT_HANDLER)) {

			contentHandlerRegistry.put(ContentHandler.Registry.LOW_PRIORITY,
				XMI_CONTENT_HANDLER);
		}

		contentHandlers = contentHandlerRegistry
			.get(ContentHandler.Registry.NORMAL_PRIORITY);

		if (contentHandlers == null) {
			contentHandlerRegistry.put(ContentHandler.Registry.NORMAL_PRIORITY,
				contentHandlers = new ArrayList<ContentHandler>());
		}

		if (!contentHandlers.contains(UML2_5_0_0_CONTENT_HANDLER)) {
			contentHandlers.add(UML2_5_0_0_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(UML2_4_0_0_CONTENT_HANDLER)) {
			contentHandlers.add(UML2_4_0_0_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(UML2_3_0_0_CONTENT_HANDLER)) {
			contentHandlers.add(UML2_3_0_0_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(UML2_2_1_0_CONTENT_HANDLER)) {
			contentHandlers.add(UML2_2_1_0_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(UML2_2_0_0_CONTENT_HANDLER)) {
			contentHandlers.add(UML2_2_0_0_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(UML2_1_0_0_CONTENT_HANDLER)) {
			contentHandlers.add(UML2_1_0_0_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(OMG_2_5_CONTENT_HANDLER)) {
			contentHandlers.add(OMG_2_5_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(OMG_2_4_1_CONTENT_HANDLER)) {
			contentHandlers.add(OMG_2_4_1_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(OMG_2_4_CONTENT_HANDLER)) {
			contentHandlers.add(OMG_2_4_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(OMG_2_2_CONTENT_HANDLER)) {
			contentHandlers.add(OMG_2_2_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(OMG_2_1_1_CONTENT_HANDLER)) {
			contentHandlers.add(OMG_2_1_1_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(OMG_2_1_CONTENT_HANDLER)) {
			contentHandlers.add(OMG_2_1_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(CMOF_2_5_CONTENT_HANDLER)) {
			contentHandlers.add(CMOF_2_5_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(CMOF_2_4_1_CONTENT_HANDLER)) {
			contentHandlers.add(CMOF_2_4_1_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(CMOF_2_4_CONTENT_HANDLER)) {
			contentHandlers.add(CMOF_2_4_CONTENT_HANDLER);
		}

		if (!contentHandlers.contains(CMOF_2_0_CONTENT_HANDLER)) {
			contentHandlers.add(CMOF_2_0_CONTENT_HANDLER);
		}

		return contentHandlerRegistry;
	}

	/**
	 * Adds resource URI mappings required for working with UML models to the
	 * specified map. These include at least mappings for the UML2-provided
	 * model libraries, metamodels, and profiles.
	 * 
	 * @param uriMap
	 *            a URI map, perhaps local to a resource set or perhaps the
	 *            global URI map
	 * 
	 * @return the same {@code uriMap}
	 * 
	 * @since 5.0
	 */
	public static Map<URI, URI> initURIConverterURIMap(Map<URI, URI> uriMap) {
		URI baseURI = getBaseUMLResourceURI();
		mapUMLResourceURIs(uriMap, UMLResource.METAMODELS_PATHMAP,
			baseURI.appendSegment("metamodels")); //$NON-NLS-1$
		mapUMLResourceURIs(uriMap, UMLResource.PROFILES_PATHMAP,
			baseURI.appendSegment("profiles")); //$NON-NLS-1$
		mapUMLResourceURIs(uriMap, UMLResource.LIBRARIES_PATHMAP,
			baseURI.appendSegment("libraries")); //$NON-NLS-1$

		return uriMap;
	}

	/**
	 * Adds profile namespace URI mappings required for working with UML models
	 * to the specified map. These include at least mappings for the
	 * UML2-provided profiles.
	 * 
	 * @param ePackageNsURIToProfileLocationMap
	 *            a profile location map, perhaps local to a resource set or
	 *            perhaps the global location map
	 * 
	 * @return the same {@code ePackageNsURIToProfileLocationMap}
	 * 
	 * @since 5.0
	 */
	public static Map<String, URI> initEPackageNsURIToProfileLocationMap(
			Map<String, URI> ePackageNsURIToProfileLocationMap) {
		ePackageNsURIToProfileLocationMap.put(StandardPackage.eNS_URI,
			URI.createURI("pathmap://UML_PROFILES/Standard.profile.uml#_0")); //$NON-NLS-1$

		ePackageNsURIToProfileLocationMap.put(UMLResource.ECORE_PROFILE_NS_URI,
			URI.createURI("pathmap://UML_PROFILES/Ecore.profile.uml#_0")); //$NON-NLS-1$

		ePackageNsURIToProfileLocationMap.put(UMLResource.UML2_PROFILE_NS_URI,
			URI.createURI("pathmap://UML_PROFILES/UML2.profile.uml#_0")); //$NON-NLS-1$

		return ePackageNsURIToProfileLocationMap;
	}

	private static URI getBaseUMLResourceURI() {
		URI umlMetamodel = URI.createURI(UMLResource.UML_METAMODEL_URI);
		URL resultURL = UMLResourcesUtil.class.getClassLoader().getResource(
			String.format("metamodels/%s", umlMetamodel.lastSegment())); //$NON-NLS-1$

		URI result;

		if (resultURL != null) {
			// remove the /metamodel/UML.metamodel.uml segments of the resource
			// we found
			result = URI.createURI(resultURL.toExternalForm(), true)
				.trimSegments(2);
		} else {
			// probably, we're not running with JARs, so assume the source
			// project folder layout
			resultURL = UMLResourcesUtil.class
				.getResource("UMLResourcesUtil.class"); //$NON-NLS-1$

			String baseURL = resultURL.toExternalForm();
			baseURL = baseURL.substring(0, baseURL.lastIndexOf("/bin/")); //$NON-NLS-1$
			result = URI.createURI(baseURL, true);
		}

		return result;
	}

	private static void mapUMLResourceURIs(Map<URI, URI> uriMap, String uri,
			URI location) {

		URI prefix = URI.createURI(uri);

		// ensure trailing separator (make it a "URI prefix")
		if (!prefix.hasTrailingPathSeparator()) {
			prefix = prefix.appendSegment(""); //$NON-NLS-1$
		}

		// same with the location
		if (!location.hasTrailingPathSeparator()) {
			location = location.appendSegment(""); //$NON-NLS-1$
		}

		uriMap.put(prefix, location);

		// and platform URIs, too
		String folder = location.segment(location.segmentCount() - 2);
		String platformURI = String.format("%s/%s/", //$NON-NLS-1$
			ResourcesPlugin.PLUGIN_ID, folder);
		uriMap.put(URI.createPlatformPluginURI(platformURI, true), location);
		uriMap.put(URI.createPlatformResourceURI(platformURI, true), location);
	}
}
