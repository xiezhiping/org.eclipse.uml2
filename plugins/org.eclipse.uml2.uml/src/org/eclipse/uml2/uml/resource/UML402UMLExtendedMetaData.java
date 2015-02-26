/*
 * Copyright (c) 2014, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 458656
 *
 */
package org.eclipse.uml2.uml.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;

/**
 * Extended meta-data required for model migration.
 * OMG:  UML 2.4.x and UML 2.5 
 * API:  UML2 4.x and UML2 5.0 
 * 
 * @since 5.0
 */
public class UML402UMLExtendedMetaData
		extends BasicExtendedMetaData {

	protected static Map<URI, URI> uriMap = null;

	public static Map<URI, URI> getURIMap() {

		if (uriMap == null) {

			synchronized (UML402UMLExtendedMetaData.class) {

				if (uriMap == null) {
					uriMap = new HashMap<URI, URI>();

					// StandardL2.profile.uml -> Standard.profile.uml
					uriMap.put(URI.createURI(UML402UMLResource.STANDARD_L2_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));

					// StandardL3.profile.uml -> Standard.profile.uml
					uriMap.put(URI.createURI(UML402UMLResource.STANDARD_L3_PROFILE_URI), URI.createURI(UMLResource.STANDARD_PROFILE_URI));
				}				
			}
		}

		return uriMap;
	}

	public UML402UMLExtendedMetaData(EPackage.Registry registry) {
		super(registry);
	}

}
