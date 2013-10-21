/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 414572, 401682
 *
 */
package org.eclipse.uml2.uml.tests.util;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
	}

	public static ResourceSet init(ResourceSet rset) {
		UMLResourcesUtil.initLocalRegistries(rset);
		return rset;
	}

}