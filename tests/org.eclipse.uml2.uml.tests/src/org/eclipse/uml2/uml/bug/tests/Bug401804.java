/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

/**
 * Main class for ad hoc testing of the {@link UMLPlugin.ExtensionProcessor}
 * API.
 */
public class Bug401804 {

	public Bug401804() {
		super();
	}

	public static void main(String[] args) {
		UMLPlugin.ExtensionProcessor.process(null);

		final URI modelURI = URI.createURI(
			"pathmap://UML_TEST_MODELS/Bug401804.uml", true);

		// This abstract URI resolves to a platform:/plugin URI, which needs to
		// be further resolved to a physical location URI
		URIConverter.URI_MAP.putAll(EcorePlugin
			.computePlatformResourceToPlatformPluginMap(Collections
				.singleton(URIConverter.INSTANCE.normalize(modelURI))));

		ResourceSet rset = new ResourceSetImpl();

		Model model = UML2Util.load(rset, modelURI, UMLPackage.Literals.MODEL);
		System.out.printf("Model loaded: %s%n", model != null);

		Type sessionManagerBean = model.getOwnedType("SessionManager");

		// This stereotype is dynamically defined, which does not require any
		// UML-specific extension point to resolve (only Ecore extension points)
		Stereotype bean = sessionManagerBean
			.getAppliedStereotype("bug401804::Bean");
		System.out.printf("SessionManager is a <<bean>>: %s%n", bean != null);

		if (bean != null) {
			System.out
				.printf("  Bean kind: %s%n",
					((EnumerationLiteral) sessionManagerBean.getValue(bean,
						"kind")).getLabel());
		}

		// This stereotype is statically generated, which requires a
		// UML-specific extension point to resolve
		Stereotype specification = sessionManagerBean
			.getAppliedStereotype("StandardProfile::Specification");
		System.out.printf("SessionManager is a <<specification>>: %s%n",
			specification != null);
	}

}
