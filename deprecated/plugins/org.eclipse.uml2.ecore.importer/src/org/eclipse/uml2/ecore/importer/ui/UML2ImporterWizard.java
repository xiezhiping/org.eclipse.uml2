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
 * $Id: UML2ImporterWizard.java,v 1.1 2005/05/17 22:10:19 khussey Exp $
 */
package org.eclipse.uml2.ecore.importer.ui;

import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterWizard;
import org.eclipse.emf.importer.ui.contribution.base.ModelPackagePage;
import org.eclipse.uml2.ecore.importer.UML2Importer;

public class UML2ImporterWizard
		extends ModelImporterWizard {

	protected ModelImporter createModelImporter() {
		return new UML2Importer();
	}

	public void addPages() {
		UML2DetailPage detailPage = new UML2DetailPage(getModelImporter(),
			"UML2Model");
		detailPage
			.setShowGenModel(getModelImporter().getGenModelFileName() == null);
		addPage(detailPage);

		ModelPackagePage packagePage = new ModelPackagePage(getModelImporter(),
			"UML2Packages");
		packagePage.setShowReferencedGenModels(true);
		addPage(packagePage);
	}
}