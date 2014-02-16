/*
 * Copyright (c) 2013, 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 286404
 *
 */
package org.eclipse.uml2.ant;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;


/**
 * The plug-in activator/lifecycle class for the UML2 Ant plug-in.
 */
public class AntPlugin
		extends Plugin {

	private static AntPlugin instance;

	public AntPlugin() {
		super();
	}

	/**
	 * Obtains the shared instance of the plug-in activator.
	 */
	public static AntPlugin getInstance() {
		return instance;
	}

	@Override
	public void start(BundleContext context)
			throws Exception {

		instance = this;

		super.start(context);
	}

	@Override
	public void stop(BundleContext context)
			throws Exception {

		super.stop(context);

		instance = null;
	}
}
