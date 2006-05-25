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
 * $Id: UMLImporter.java,v 1.3 2006/05/25 16:42:17 khussey Exp $
 */
package org.eclipse.uml2.uml.ecore.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLImporter
		extends ModelImporter {

	protected final Map options = new HashMap();

	public Map getOptions() {
		return options;
	}

	public String getID() {
		return "org.eclipse.uml2.uml.ecore.importer"; //$NON-NLS-1$
	}

	public GenModel getGenModel() {

		if (genModel == null) {

			if (options
				.get(
					UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)
				.equals(UMLUtil.OPTION__PROCESS)
				|| options.get(
					UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)
					.equals(UMLUtil.OPTION__PROCESS)
				|| options
					.get(
						UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)
					.equals(UMLUtil.OPTION__PROCESS)
				|| options.get(
					UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)
					.equals(UMLUtil.OPTION__PROCESS)
				|| options.get(
					UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)
					.equals(UMLUtil.OPTION__PROCESS)
				|| options.get(
					UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)
					.equals(UMLUtil.OPTION__PROCESS)
				|| options.get(
					UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)
					.equals(UMLUtil.OPTION__PROCESS)
				|| options.get(
					UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES)
					.equals(UMLUtil.OPTION__PROCESS)) {

				genModel = org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory.eINSTANCE
					.createGenModel();
			} else {
				genModel = GenModelFactory.eINSTANCE.createGenModel();
			}

			genModel.setImporterID(getID());
		}

		return genModel;
	}

	protected Diagnostic doComputeEPackages(Monitor monitor)
			throws Exception {
		Diagnostic diagnostic = Diagnostic.OK_INSTANCE;
		List locationURIs = getModelLocationURIs();

		if (locationURIs.isEmpty()) {
			diagnostic = new BasicDiagnostic(Diagnostic.ERROR,
				ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT,
				UMLImporterPlugin.INSTANCE
					.getString("_UI_SpecifyAValidUMLModel_message"), null); //$NON-NLS-1$
		} else {
			monitor.beginTask(UML2Util.EMPTY_STRING, 2);
			monitor.subTask(UMLImporterPlugin.INSTANCE.getString(
				"_UI_Loading_message", new Object[]{locationURIs})); //$NON-NLS-1$

			Collection packages = new ArrayList();

			ResourceSet umlResourceSet = createResourceSet();

			for (Iterator i = locationURIs.iterator(); i.hasNext();) {
				packages.addAll(EcoreUtil.getObjectsByType(umlResourceSet
					.getResource((URI) i.next(), true).getContents(),
					UMLPackage.Literals.PACKAGE));
			}

			EcoreUtil.resolveAll(umlResourceSet);

			monitor.worked(1);

			BasicDiagnostic diagnostics = new BasicDiagnostic(
				ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT,
				UMLImporterPlugin.INSTANCE
					.getString("_UI_ProblemsEncounteredProcessing_message"), //$NON-NLS-1$
				null);

			Map context = new HashMap();
			context
				.put(
					org.eclipse.uml2.common.util.UML2Util.QualifiedTextProvider.class,
					UMLUtil.QualifiedTextProvider.DEFAULT);

			getEPackages().addAll(new UMLUtil.UML2EcoreConverter() {

				protected void processEcoreTaggedValues(EPackage ePackage,
						Element element, Map options,
						DiagnosticChain diagnostics, Map context) {

					super.processEcoreTaggedValues(ePackage, element, options,
						diagnostics, context);

					Stereotype ePackageStereotype = getAppliedEcoreStereotype(
						element, UMLUtil.STEREOTYPE__E_PACKAGE);

					if (null != ePackageStereotype) {
						EPackageImportInfo ePackageInfo = getEPackageImportInfo(ePackage);

						if (element.hasValue(ePackageStereotype,
							UMLUtil.TAG_DEFINITION__BASE_PACKAGE)) {

							StringBuffer basePackage = new StringBuffer();

							for (StringTokenizer stringTokenizer = new StringTokenizer(
								(String) element.getValue(ePackageStereotype,
									UMLUtil.TAG_DEFINITION__BASE_PACKAGE), "."); stringTokenizer //$NON-NLS-1$
								.hasMoreTokens();) {

								basePackage.append(CodeGenUtil
									.safeName(stringTokenizer.nextToken()));

								if (stringTokenizer.hasMoreTokens()) {
									basePackage.append('.');
								}
							}

							ePackageInfo.setBasePackage(basePackage.toString());
						}

						if (element.hasValue(ePackageStereotype,
							UMLUtil.TAG_DEFINITION__PREFIX)) {

							ePackageInfo.setPrefix((String) element.getValue(
								ePackageStereotype,
								UMLUtil.TAG_DEFINITION__PREFIX));
						}
					}
				}
			}.convert(packages, options, diagnostics, context));

			monitor.done();

			if (Diagnostic.INFO < diagnostics.getSeverity()) {
				diagnostic = diagnostics;
			}
		}

		return diagnostic;
	}

	public void adjustEPackage(Monitor monitor, EPackage ePackage) {
		EPackageImportInfo ePackageInfo = getEPackageImportInfo(ePackage);
		String name = ePackage.getName();

		if (ePackageInfo.getPrefix() == null) {
			ePackageInfo.setPrefix(Character.toUpperCase(name.charAt(0))
				+ name.substring(1));
		}

		String ecoreFileName = null;
		GenPackage genPackage = getGenPackage(ePackage);

		if (genPackage != null) {
			String ePackagePath = genPackage.getEcorePackage().eResource()
				.getURI().lastSegment();
			ecoreFileName = URI.decode(ePackagePath);
		} else {
			ecoreFileName = ePackage.eResource() == null
				? name + ".ecore" //$NON-NLS-1$
				: ePackage.eResource().getURI().lastSegment();
		}

		ePackageInfo.setEcoreFileName(ecoreFileName);
	}

	protected void adjustGenModel(Monitor monitor) {
		super.adjustGenModel(monitor);

		URI genModelURI = createFileURI(getGenModelPath().toString());
		GenModel genModel = getGenModel();
		EList foreignModel = genModel.getForeignModel();

		for (Iterator i = getModelLocationURIs().iterator(); i.hasNext();) {
			foreignModel.add(makeRelative((URI) i.next(), genModelURI)
				.toString());
		}
	}

	protected void loadOriginalGenModel(URI genModelURI)
			throws DiagnosticException {
		super.loadOriginalGenModel(genModelURI);

		StringBuffer text = new StringBuffer();
		GenModel originalGenModel = getOriginalGenModel();

		for (Iterator i = originalGenModel.getForeignModel().iterator(); i
			.hasNext();) {

			String value = (String) i.next();

			if (value.endsWith('.' + UMLResource.FILE_EXTENSION)
				|| value.endsWith('.' + UML22UMLResource.FILE_EXTENSION)
				|| value.endsWith('.' + XMI2UMLResource.FILE_EXTENSION)) {

				text.append(makeAbsolute(URI.createURI(value), genModelURI)
					.toString());
				text.append(" "); //$NON-NLS-1$
			}
		}

		setModelLocation(text.toString().trim());

		getOptions().putAll(
			UML2GenModelUtil.getGenAnnotation(originalGenModel,
				getConverterGenAnnotationSource(), true).getDetails().map());
	}

	public void prepareGenModelAndEPackages(Monitor monitor) {
		super.prepareGenModelAndEPackages(monitor);

		UML2GenModelUtil.getGenAnnotation(genModel,
			getConverterGenAnnotationSource(), true).getDetails().putAll(
			getOptions());
	}

	public ResourceSet createResourceSet() {
		ResourceSet resourceSet = super.createResourceSet();

		Map extensionToFactoryMap = resourceSet.getResourceFactoryRegistry()
			.getExtensionToFactoryMap();

		extensionToFactoryMap.put(UML22UMLResource.FILE_EXTENSION,
			UML22UMLResource.Factory.INSTANCE);
		extensionToFactoryMap.put(XMI2UMLResource.FILE_EXTENSION,
			XMI2UMLResource.Factory.INSTANCE);

		resourceSet.getURIConverter().getURIMap().putAll(
			UML22UMLExtendedMetaData.getURIMap());

		return resourceSet;
	}

}