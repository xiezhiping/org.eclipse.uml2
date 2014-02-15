/*
 * Copyright (c) 2011, 2012 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 364419
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.CMOF2UMLResourceHandler;
import org.eclipse.uml2.uml.resource.UML302UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML302UMLResource;
import org.eclipse.uml2.uml.resource.UML302UMLResourceHandler;
import org.eclipse.uml2.uml.resource.XMI2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.resource.XMI222UMLResource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLResource;

/**
 * Resource factory that converts .xmi models.
 * OMG:  UML 2.2 and UML 2.4
 * API:  UML2 3.x and UML2 4.0.x
 * 
 * @since 4.0
 */
public class XMI222UMLResourceFactoryImpl
		extends UMLResourceFactoryImpl
		implements XMI222UMLResource.Factory {

	public XMI222UMLResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResourceGen(URI uri) {
		XMI222UMLResource result = new XMI222UMLResourceImpl(uri);
		result.setEncoding(XMI2UMLResource.DEFAULT_ENCODING);
		return result;
	}

	@Override
	public Resource createResource(URI uri) {
		XMI222UMLResource resource = (XMI222UMLResource) super
			.createResource(uri);

		ExtendedMetaData xmiExtendedMetaData = new XMI2UMLExtendedMetaData(
			EPackage.Registry.INSTANCE);

		Map<Object, Object> defaultSaveOptions = resource
			.getDefaultSaveOptions();

		defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			xmiExtendedMetaData);
		defaultSaveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,
			Boolean.TRUE);

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);

		ePackageRegistry.put(Ecore2XMLPackage.eNS_URI,
			Ecore2XMLPackage.eINSTANCE);
		ePackageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_2_NS_URI,
			UMLPackage.eINSTANCE);
		ePackageRegistry.put(CMOF2UMLResource.CMOF_2_0_METAMODEL_NS_URI,
			UMLPackage.eINSTANCE);

		ePackageRegistry
			.put(
				"platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore", UMLPackage.eINSTANCE); //$NON-NLS-1$

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.setPackageRegistry(ePackageRegistry);

		resourceSet
			.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put(Ecore2XMLResource.FILE_EXTENSION,
				Ecore2XMLResource.Factory.INSTANCE);

		Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
			Ecore2XMLRegistry.INSTANCE);
		ecore2xmlRegistry
			.put(
				UML302UMLResource.UML_METAMODEL_NS_URI,
				EcoreUtil.getObjectByType(
					resourceSet
						.getResource(
							URI.createURI("platform:/plugin/org.eclipse.uml2.uml/model/UML30_2_UML.ecore2xml"), //$NON-NLS-1$
							true).getContents(),
					Ecore2XMLPackage.Literals.XML_MAP));

		ExtendedMetaData extendedMetaData = new UML302UMLExtendedMetaData(
			ePackageRegistry, ecore2xmlRegistry);

		Map<Object, Object> defaultLoadOptions = resource
			.getDefaultLoadOptions();

		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);
		defaultLoadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING,
			Boolean.FALSE);
		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			new CMOF2UMLResourceHandler(new UML302UMLResourceHandler()));

		return resource;
	}
}
