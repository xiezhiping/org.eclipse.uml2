/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RoseImporterWizard.java,v 1.6 2006/05/24 20:12:48 khussey Exp $
 */
package org.eclipse.uml2.importer.rose.ui;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.converter.ModelConverter;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.importer.rose.ui.RoseDetailPage;
import org.eclipse.emf.importer.ui.contribution.base.ModelImporterPackagePage;
import org.eclipse.uml2.importer.rose.RoseImporter;

public class RoseImporterWizard
		extends org.eclipse.emf.importer.rose.ui.RoseImporterWizard {

	protected ModelConverter createModelConverter() {
		return new RoseImporter();
	}

	public void addPages() {
		RoseDetailPage detailPage = new RoseDetailPage(getModelImporter(),
			"RoseModel") { //$NON-NLS-1$

			protected ConverterUtil.DecodedAction decodeAction(
					Diagnostic diagnostic) {
				return ConverterUtil
					.decodeAction(ConverterUtil.ACTION_MESSAGE_SET);
			}
		};
		addPage(detailPage);

		ModelImporterPackagePage packagePage = new ModelImporterPackagePage(
			getModelImporter(), "RosePackages"); //$NON-NLS-1$
		packagePage.setShowReferencedGenModels(true);
		addPage(packagePage);
	}

}
