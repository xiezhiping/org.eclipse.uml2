/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RoseImporterApplication.java,v 1.1 2005/05/17 22:09:07 khussey Exp $
 */
package org.eclipse.uml2.importer.rose;

import org.eclipse.emf.importer.ModelImporter;

public class RoseImporterApplication
		extends org.eclipse.emf.importer.rose.RoseImporterApplication {

	protected ModelImporter createModelImporter() {
		return new RoseImporter();
	}

}
