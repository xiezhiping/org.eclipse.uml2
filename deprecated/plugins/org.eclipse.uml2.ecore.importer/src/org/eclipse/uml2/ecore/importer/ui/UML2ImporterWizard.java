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
 * $Id: UML2ImporterWizard.java,v 1.4 2005/12/14 17:02:49 khussey Exp $
 */
package org.eclipse.uml2.ecore.importer.ui;

import org.eclipse.emf.importer.ui.contribution.base.ModelImporterWizard;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterPackagePage;
import org.eclipse.emf.converter.ModelConverter;

import org.eclipse.uml2.ecore.importer.UML2Importer;

public class UML2ImporterWizard
		extends ModelImporterWizard {

	protected ModelConverter createModelConverter() {
		return new UML2Importer();
	}

	public void addPages() {
		UML2DetailPage detailPage = new UML2DetailPage(getModelImporter(),
			"UML2Model"); //$NON-NLS-1$
		addPage(detailPage);

		ModelImporterPackagePage packagePage = new ModelImporterPackagePage(getModelImporter(),
			"UML2Packages"); //$NON-NLS-1$
		packagePage.setShowReferencedGenModels(true);
		addPage(packagePage);
	}
}