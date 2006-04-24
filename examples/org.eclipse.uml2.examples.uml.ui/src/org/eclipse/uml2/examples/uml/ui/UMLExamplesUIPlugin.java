/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLExamplesUIPlugin.java,v 1.2 2006/04/24 02:05:38 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.uml2.uml.ecore.exporter.UMLExporterPlugin;

/**
 * This is the central singleton for the UML2 UML Examples UI plugin.
 */
public class UMLExamplesUIPlugin
		extends EMFPlugin {

	/**
	 * Keep track of the singleton.
	 */
	public static final UMLExamplesUIPlugin INSTANCE = new UMLExamplesUIPlugin();

	/**
	 * Keep track of the singleton.
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 */
	public UMLExamplesUIPlugin() {
		super(new ResourceLocator[]{UMLExporterPlugin.INSTANCE});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * 
	 * @return the singleton instance.
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * 
	 * @return the singleton instance.
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 */
	public static class Implementation
			extends EclipsePlugin {

		/**
		 * Creates an instance.
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}
}