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
 * $Id: RoseImporter.java,v 1.3 2005/06/03 19:53:40 khussey Exp $
 */
package org.eclipse.uml2.importer.rose;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.uml2.importer.rose.builder.RoseUtil;

public class RoseImporter
		extends org.eclipse.emf.importer.rose.RoseImporter {

	protected org.eclipse.emf.importer.rose.builder.RoseUtil createRoseUtil() {
		RoseUtil roseUtil = new RoseUtil(createResourceSet().getURIConverter());
		roseUtil.getRoseEcoreBuilder().noQualify = noQualify;
		roseUtil.getRoseEcoreBuilder().unsettablePrimitive = unsettablePrimitive;
		return roseUtil;
	}

	public GenModel getGenModel() {

		if (genModel == null) {
			genModel = GenModelFactory.eINSTANCE.createGenModel();
			genModel.setImporterID(getID());
		}

		return genModel;
	}

	public String getID() {
		return "org.eclipse.uml2.importer.rose"; //$NON-NLS-1$
	}

}
