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
 * $Id: UMLExporter.java,v 1.4 2006/04/13 01:48:28 khussey Exp $
 */
package org.eclipse.uml2.uml.ecore.exporter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.exporter.ModelExporter;
import org.eclipse.emf.exporter.util.ExporterUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLExporter
		extends ModelExporter {

	protected final Map options = new HashMap();

	public Map getOptions() {
		return options;
	}

	public String getID() {
		return "org.eclipse.uml2.uml.ecore.exporter"; //$NON-NLS-1$
	}

	protected String getDefaultArtifactLocation(EPackage ePackage) {
		return getDefaultArtifactFileName(ePackage) + '.'
			+ UMLResource.FILE_EXTENSION;
	}

	protected String doCheckEPackageArtifactLocation(String location,
			String packageName) {

		if (!location.endsWith('.' + UMLResource.FILE_EXTENSION)) {
			return UMLExporterPlugin.INSTANCE
				.getString("_UI_InvalidArtifactFileNameExtension_message");
		}

		return super.doCheckEPackageArtifactLocation(location, packageName);
	}

	protected void doExport(Monitor monitor, ExportData exportData)
			throws Exception {
		Diagnostic diagnostic = Diagnostic.OK_INSTANCE;

		ResourceSet resourceSet = new ResourceSetImpl();
		UMLUtil.Ecore2UMLConverter ecore2umlConverter = new UMLUtil.Ecore2UMLConverter();

		BasicDiagnostic diagnostics = new BasicDiagnostic(ConverterPlugin.ID,
			ConverterUtil.ACTION_DEFAULT, UMLExporterPlugin.INSTANCE
				.getString("_UI_ProblemsEncounteredProcessing_message"), //$NON-NLS-1$
			null);

		Map context = new HashMap();
		context.put(
			org.eclipse.uml2.common.util.UML2Util.QualifiedTextProvider.class,
			UMLUtil.QualifiedTextProvider.DEFAULT);

		monitor.beginTask(UML2Util.EMPTY_STRING,
			exportData.genPackageToArtifactURI.size());

		for (Iterator i = exportData.genPackageToArtifactURI.entrySet()
			.iterator(); i.hasNext();) {

			Map.Entry entry = (Map.Entry) i.next();
			URI artifactURI = (URI) entry.getValue();
			Resource resource = resourceSet.createResource(artifactURI);
			EPackage ePackage = ((GenPackage) entry.getKey()).getEcorePackage();

			monitor.subTask(UMLExporterPlugin.INSTANCE.getString(
				"_UI_Exporting_message", new Object[]{artifactURI.toString()})); //$NON-NLS-1$

			ecore2umlConverter.convert(Collections.singleton(ePackage),
				getOptions(), diagnostics, context);

			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) ecore2umlConverter
				.doSwitch(ePackage);

			EList contents = resource.getContents();

			contents.add(package_);

			for (Iterator allContents = UMLUtil.getAllContents(package_, true,
				false); allContents.hasNext();) {

				EObject eObject = (EObject) allContents.next();

				if (eObject instanceof Element) {
					contents.addAll(((Element) eObject)
						.getStereotypeApplications());
				}
			}

			monitor.worked(1);
		}

		for (Iterator r = resourceSet.getResources().iterator(); r.hasNext();) {
			((Resource) r.next()).save(null);
		}

		monitor.done();

		if (Diagnostic.INFO < diagnostics.getSeverity()) {
			diagnostic = diagnostics;
		}

//		return diagnostic;
	}

	public void setGenModel(GenModel genModel)
			throws DiagnosticException {
		super.setGenModel(genModel);

		genModel = getGenModel();

		if (genModel != null) {
			getOptions().putAll(
				ExporterUtil.findOrCreateGenAnnotation(genModel,
					getConverterGenAnnotationSource()).getDetails().map());
		}
	}

	protected boolean saveExporter() {
		boolean changed = super.saveExporter();

		GenModel genModel = getGenModel();
		GenAnnotation genAnnotation = genModel
			.getGenAnnotation(getConverterGenAnnotationSource());

		if (genAnnotation == null) {
			changed = true;

			ExporterUtil.findOrCreateGenAnnotation(genModel,
				getConverterGenAnnotationSource()).getDetails().putAll(
				getOptions());
		} else {
			EMap details = genAnnotation.getDetails();

			for (Iterator entries = getOptions().entrySet().iterator(); entries
				.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				String key = (String) entry.getKey();
				String value = (String) entry.getValue();

				if (!value.equals(details.get(key))) {
					changed = true;
					details.put(key, value);
				}
			}
		}

		return changed;
	}

}