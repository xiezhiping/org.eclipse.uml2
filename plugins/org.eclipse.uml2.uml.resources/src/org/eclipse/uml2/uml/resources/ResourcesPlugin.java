/*
 * Copyright (c) 2012 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.resources;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * @since 4.0
 */
public class ResourcesPlugin
		extends EMFPlugin {

	/**
	 * The singleton instance of the plugin.
	 */
	public static final ResourcesPlugin INSTANCE = new ResourcesPlugin();

	/**
	 * The one instance of this class.
	 */
	private static Implementation plugin;

	/**
	 * Creates the singleton instance.
	 */
	private ResourcesPlugin() {
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
