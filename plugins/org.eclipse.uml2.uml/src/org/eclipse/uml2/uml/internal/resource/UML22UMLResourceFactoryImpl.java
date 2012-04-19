/*
 * Copyright (c) 2006, 2012 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 364419
 * 
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

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
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResourceHandler;

public class UML22UMLResourceFactoryImpl
		extends UMLResourceFactoryImpl
		implements UML22UMLResource.Factory {

	public UML22UMLResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResourceGen(URI uri) {
		UML22UMLResource result = new UML22UMLResourceImpl(uri);
		result.setEncoding(UML22UMLResource.DEFAULT_ENCODING);
		return result;
	}

	@Override
	public Resource createResource(URI uri) {
		UML22UMLResource resource = (UML22UMLResource) super
			.createResource(uri);

		Map<Object, Object> defaultLoadOptions = resource
			.getDefaultLoadOptions();

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);

		ePackageRegistry.put(Ecore2XMLPackage.eNS_URI,
			Ecore2XMLPackage.eINSTANCE);
		ePackageRegistry.put(UML22UMLResource.UML2_METAMODEL_NS_URI,
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
				UML22UMLResource.UML2_METAMODEL_NS_URI,
				EcoreUtil
					.getObjectByType(
						resourceSet
							.getResource(
								URI
									.createURI("platform:/plugin/org.eclipse.uml2.uml/model/UML2_2_UML.ecore2xml"), //$NON-NLS-1$
								true).getContents(),
						Ecore2XMLPackage.Literals.XML_MAP));

		ExtendedMetaData extendedMetaData = new UML22UMLExtendedMetaData(
			ePackageRegistry, ecore2xmlRegistry);

		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);
		defaultLoadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING,
			Boolean.FALSE);
		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			new UML22UMLResourceHandler());

		return resource;
	}

}
