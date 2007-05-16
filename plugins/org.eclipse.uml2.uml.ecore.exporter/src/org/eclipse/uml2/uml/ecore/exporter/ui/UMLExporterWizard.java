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
 * $Id: UMLExporterWizard.java,v 1.3 2007/05/16 18:38:21 khussey Exp $
 */
package org.eclipse.uml2.uml.ecore.exporter.ui;

import org.eclipse.emf.converter.ModelConverter;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterDirectoryURIPage;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterPackagePage;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterWizard;
import org.eclipse.uml2.uml.ecore.exporter.UMLExporter;
import org.eclipse.uml2.uml.ecore.exporter.UMLExporterPlugin;

public class UMLExporterWizard
		extends ModelExporterWizard {

	@Override
	protected ModelConverter createModelConverter() {
		return new UMLExporter();
	}

	@Override
	public void addPages() {
		ModelExporterDirectoryURIPage directoryURIPage = new ModelExporterDirectoryURIPage(
			getModelExporter(), "UMLExporterDirectoryURIPage"); //$NON-NLS-1$
		directoryURIPage.setTitle(UMLExporterPlugin.INSTANCE
			.getString("_UI_UMLExport_title")); //$NON-NLS-1$
		addPage(directoryURIPage);

		ModelExporterPackagePage packagePage = new ModelExporterPackagePage(
			getModelExporter(), "UMLExporterPackagePage") {
			
			@Override
			protected boolean supportsNestedPackages() {
				return false;
			}
		};
		packagePage.setTitle(UMLExporterPlugin.INSTANCE
			.getString("_UI_UMLExport_title")); //$NON-NLS-1$
		addPage(packagePage);

		UMLExporterOptionsPage optionsPage = new UMLExporterOptionsPage(
			getModelExporter(), "UMLExporterOptionsPage"); //$NON-NLS-1$
		optionsPage.setTitle(UMLExporterPlugin.INSTANCE
			.getString("_UI_UMLExport_title")); //$NON-NLS-1$
		addPage(optionsPage);
	}
}