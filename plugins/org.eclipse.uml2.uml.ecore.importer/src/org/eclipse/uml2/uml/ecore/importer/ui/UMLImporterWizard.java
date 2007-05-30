/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLImporterWizard.java,v 1.4 2007/05/30 20:11:19 khussey Exp $
 */
package org.eclipse.uml2.uml.ecore.importer.ui;

import org.eclipse.emf.converter.ModelConverter;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterPackagePage;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterWizard;
import org.eclipse.uml2.uml.ecore.importer.UMLImporter;

public class UMLImporterWizard
		extends ModelImporterWizard {

	@Override
	protected ModelConverter createModelConverter() {
		return new UMLImporter();
	}

	@Override
	public void addPages() {
		UMLImporterDetailPage detailPage = new UMLImporterDetailPage(
			getModelImporter(), "UMLImporterDetailPage"); //$NON-NLS-1$
		addPage(detailPage);

		ModelImporterPackagePage packagePage = new ModelImporterPackagePage(
			getModelImporter(), "UMLImporterPackagePage") { //$NON-NLS-1$
		};

		packagePage.setShowReferencedGenModels(true);
		addPage(packagePage);
	}
}