/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: IItemQualifiedTextProvider.java,v 1.3 2005/03/15 18:48:28 khussey Exp $
 */
package org.eclipse.uml2.provider;

/**
 * A provider of qualified text for an item.
 */
public interface IItemQualifiedTextProvider {

	/**
	 * Fetches qualified text for the specified object instance.
	 * 
	 * @param object
	 *            The object instance for which to fetch qualified text.
	 * @return The qualified text.
	 */
	public String getQualifiedText(Object object);

}