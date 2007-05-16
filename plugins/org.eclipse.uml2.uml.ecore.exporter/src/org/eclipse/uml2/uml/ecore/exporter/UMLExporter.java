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
 * $Id: UMLExporter.java,v 1.10 2007/05/16 18:38:21 khussey Exp $
 */
package org.eclipse.uml2.uml.ecore.exporter;

import java.util.Collection;
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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.exporter.ModelExporter;
import org.eclipse.emf.exporter.util.ExporterUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLExporter
		extends ModelExporter {

	protected final Map<String, String> options = new HashMap<String, String>();

	public Map<String, String> getOptions() {
		return options;
	}

	@Override
	public String getID() {
		return "org.eclipse.uml2.uml.ecore.exporter"; //$NON-NLS-1$
	}

	@Override
	protected String getDefaultArtifactLocation(EPackage ePackage) {
		return getDefaultArtifactFileName(ePackage) + '.'
			+ UMLResource.FILE_EXTENSION;
	}

	@Override
	protected String doCheckEPackageArtifactLocation(String location,
			String packageName) {

		if (!location.endsWith('.' + UMLResource.FILE_EXTENSION)) {
			return UMLExporterPlugin.INSTANCE
				.getString("_UI_InvalidArtifactFileNameExtension_message"); //$NON-NLS-1$
		}

		return super.doCheckEPackageArtifactLocation(location, packageName);
	}

	@Override
	protected Diagnostic doExport(Monitor monitor, ExportData exportData)
			throws Exception {
		Diagnostic diagnostic = Diagnostic.OK_INSTANCE;

		ResourceSet resourceSet = new ResourceSetImpl();
		UMLUtil.Ecore2UMLConverter ecore2umlConverter = new UMLUtil.Ecore2UMLConverter();

		BasicDiagnostic diagnostics = new BasicDiagnostic(ConverterPlugin.ID,
			ConverterUtil.ACTION_DEFAULT, UMLExporterPlugin.INSTANCE
				.getString("_UI_ProblemsEncounteredProcessing_message"), //$NON-NLS-1$
			null);

		Map<Object, Object> context = new HashMap<Object, Object>();
		context.put(
			org.eclipse.uml2.common.util.UML2Util.QualifiedTextProvider.class,
			UMLUtil.QualifiedTextProvider.DEFAULT);

		monitor.beginTask(UML2Util.EMPTY_STRING,
			exportData.genPackageToArtifactURI.size());

		for (Map.Entry<GenPackage, URI> entry : exportData.genPackageToArtifactURI
			.entrySet()) {

			URI artifactURI = entry.getValue();
			Resource resource = resourceSet.createResource(artifactURI);
			EPackage ePackage = entry.getKey().getEcorePackage();

			monitor.subTask(UMLExporterPlugin.INSTANCE.getString(
				"_UI_Exporting_message", new Object[]{artifactURI.toString()})); //$NON-NLS-1$

			ecore2umlConverter.convert(Collections.singleton(ePackage),
				getOptions(), diagnostics, context);

			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) ecore2umlConverter
				.doSwitch(ePackage);

			EList<EObject> contents = resource.getContents();

			contents.add(package_);

			for (TreeIterator<EObject> allContents = UML2Util.getAllContents(
				package_, true, false); allContents.hasNext();) {

				EObject eObject = allContents.next();

				if (eObject instanceof Element) {
					contents.addAll(((Element) eObject)
						.getStereotypeApplications());
				}
			}

			monitor.worked(1);
		}

		for (Resource resource : resourceSet.getResources()) {
			resource.save(null);
		}

		monitor.done();

		if (Diagnostic.INFO < diagnostics.getSeverity()) {
			diagnostic = diagnostics;
		}

		return diagnostic;
	}

	@Override
	protected boolean isValidEPackage(GenPackage genPackage) {
		return genPackage.getRootGenPackage() == genPackage
			&& super.isValidEPackage(genPackage);
	}

	private static final class Ecore2UMLConverter
			extends UMLUtil.Ecore2UMLConverter {

		private Collection<EPackage> getEcorePackages() {
			return EcoreUtil.<EPackage> getObjectsByType(
				eModelElementToElementMap.keySet(),
				EcorePackage.Literals.EPACKAGE);
		}
	}
			
	@Override
	public void setGenModel(GenModel genModel)
			throws DiagnosticException {
		super.setGenModel(genModel);

		Ecore2UMLConverter converter = new Ecore2UMLConverter();

		for (Iterator<GenPackage> genPackages = new GenPackagesTreeIterator(
			genModel); genPackages.hasNext();) {

			GenPackage genPackage = genPackages.next();

			if (isValidEPackage(genPackage)) {
				converter.convert(Collections.singleton(genPackage
					.getEcorePackage()), getOptions(), null, null);
			}
		}

		Map<EPackage, GenPackage> ePackageToGenPackageMap = getEPackageToGenPackageMap();

		for (EPackage convertedEPackage : converter.getEcorePackages()) {
			GenPackage convertedGenPackage = genModel
				.findGenPackage(convertedEPackage);

			if (convertedGenPackage != null
				&& isValidEPackage(convertedGenPackage)) {

				ePackageToGenPackageMap.put(convertedEPackage,
					convertedGenPackage);

				getEPackages().add(convertedEPackage);
			}
		}

		adjustGenModel();

		genModel = getGenModel();

		if (genModel != null) {
			getOptions().putAll(
				ExporterUtil.findOrCreateGenAnnotation(genModel,
					getConverterGenAnnotationSource()).getDetails().map());
		}
	}

	@Override
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
			EMap<String, String> details = genAnnotation.getDetails();

			for (Map.Entry<String, String> entry : getOptions().entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();

				if (!value.equals(details.get(key))) {
					changed = true;
					details.put(key, value);
				}
			}
		}

		return changed;
	}

}