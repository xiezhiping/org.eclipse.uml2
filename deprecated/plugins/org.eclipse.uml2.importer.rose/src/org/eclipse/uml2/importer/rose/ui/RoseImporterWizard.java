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
 * $Id: RoseImporterWizard.java,v 1.3 2005/06/10 14:39:13 khussey Exp $
 */
package org.eclipse.uml2.importer.rose.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.emf.importer.rose.ui.RoseDetailPage;
import org.eclipse.emf.importer.ui.contribution.base.ModelPackagePage;
import org.eclipse.emf.importer.util.ImporterUtil;
import org.eclipse.uml2.importer.rose.RoseImporter;

public class RoseImporterWizard
		extends org.eclipse.emf.importer.rose.ui.RoseImporterWizard {

	protected ModelImporter createModelImporter() {
		return new RoseImporter();
	}

	public void addPages() {
		RoseDetailPage detailPage = new RoseDetailPage(getModelImporter(),
			"RoseModel") { //$NON-NLS-1$

			protected ImporterUtil.DecodedAction decodeAction(IStatus status) {
				return ImporterUtil
					.decodeAction(ImporterUtil.ACTION_MESSAGE_SET);
			}
		};
		addPage(detailPage);

		ModelPackagePage packagePage = new ModelPackagePage(getModelImporter(),
			"RosePackages"); //$NON-NLS-1$
		packagePage.setShowReferencedGenModels(true);
		addPage(packagePage);
	}

}
