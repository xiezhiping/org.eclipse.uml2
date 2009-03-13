/*
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CommonPlugin.java,v 1.2 2009/03/13 19:54:31 jbruck Exp $
 */
package org.eclipse.uml2.common;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * @since 1.5
 */
public class CommonPlugin
		extends EMFPlugin {

	/**
	 * The singleton instance of the plugin.
	 */
	public static final CommonPlugin INSTANCE = new CommonPlugin();

	/**
	 * The one instance of this class.
	 */
	private static Implementation plugin;

	/**
	 * Creates the singleton instance.
	 */
	private CommonPlugin() {
		super(new ResourceLocator[]{});
	}

	/**
	 * Returns the singleton instance of the plugin.
	 * 
	 * @return the singleton instance.
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * The actual implementation of the <b>Plugin</b>.
	 */
	public static class Implementation
			extends EclipsePlugin {

		public Implementation() {
			super();

			plugin = this;
		}
	}

}
