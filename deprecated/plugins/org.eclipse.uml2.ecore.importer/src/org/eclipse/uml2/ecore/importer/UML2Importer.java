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
 * $Id: UML2Importer.java,v 1.18 2005/12/14 17:02:49 khussey Exp $
 */
package org.eclipse.uml2.ecore.importer;

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
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Util;

public class UML2Importer
		extends ModelImporter {

	protected final Map options = new HashMap();

	public Map getOptions() {
		return options;
	}

	public String getID() {
		return "org.eclipse.uml2.ecore.importer"; //$NON-NLS-1$
	}

	public GenModel getGenModel() {

		if (genModel == null) {

			if (options
				.get(
					UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)
				.equals(UML2Util.OPTION__PROCESS)
				|| options.get(
					UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURES)
					.equals(UML2Util.OPTION__PROCESS)
				|| options
					.get(
						UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)
					.equals(UML2Util.OPTION__PROCESS)
				|| options.get(
					UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATIONS)
					.equals(UML2Util.OPTION__PROCESS)
				|| options.get(
					UML2Util.UML22EcoreConverter.OPTION__REDEFINING_OPERATIONS)
					.equals(UML2Util.OPTION__PROCESS)
				|| options.get(
					UML2Util.UML22EcoreConverter.OPTION__REDEFINING_PROPERTIES)
					.equals(UML2Util.OPTION__PROCESS)
				|| options.get(
					UML2Util.UML22EcoreConverter.OPTION__SUBSETTING_PROPERTIES)
					.equals(UML2Util.OPTION__PROCESS)
				|| options.get(
					UML2Util.UML22EcoreConverter.OPTION__UNION_PROPERTIES)
					.equals(UML2Util.OPTION__PROCESS)) {

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
			diagnostic = new BasicDiagnostic(Diagnostic.ERROR, ConverterPlugin.ID,
				ConverterUtil.ACTION_DEFAULT, UML2ImporterPlugin.INSTANCE
					.getString("_UI_SpecifyAValidUML2Model_message"), null); //$NON-NLS-1$
		} else {
            monitor.beginTask("", 2); //$NON-NLS-1$
			monitor.subTask(UML2ImporterPlugin.INSTANCE.getString(
				"_UI_Loading_message", new Object[]{locationURIs})); //$NON-NLS-1$

			Collection packages = new ArrayList();

			ResourceSet uml2ResourceSet = createResourceSet();

			for (Iterator i = locationURIs.iterator(); i.hasNext();) {
				packages.addAll(EcoreUtil.getObjectsByType(uml2ResourceSet
					.getResource((URI) i.next(), true).getContents(),
					UML2Package.Literals.PACKAGE));
			}

			EcoreUtil.resolveAll(uml2ResourceSet);

			monitor.worked(1);

			BasicDiagnostic diagnostics = new BasicDiagnostic(
				ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT,
				UML2ImporterPlugin.INSTANCE
					.getString("_UI_ProblemsEncounteredProcessing_message"), //$NON-NLS-1$
				null);

			Map context = new HashMap();
			context.put(UML2Util.QualifiedTextProvider.class,
				UML2Util.QualifiedTextProvider.DEFAULT);

			getEPackages().addAll(new UML2Util.UML22EcoreConverter() {

				protected void processEcoreTaggedValues(EPackage ePackage,
						Element element, Map options,
						DiagnosticChain diagnostics, Map context) {

					super.processEcoreTaggedValues(ePackage, element, options,
						diagnostics, context);

					Stereotype ePackageStereotype = getAppliedEcoreStereotype(
						element, UML2Util.STEREOTYPE_NAME__E_PACKAGE);

					if (null != ePackageStereotype) {
						EPackageImportInfo ePackageInfo = getEPackageImportInfo(ePackage);

						if (element.hasValue(ePackageStereotype,
							UML2Util.PROPERTY_NAME__BASE_PACKAGE)) {

							StringBuffer basePackage = new StringBuffer();

							for (StringTokenizer stringTokenizer = new StringTokenizer(
								(String) element.getValue(ePackageStereotype,
									UML2Util.PROPERTY_NAME__BASE_PACKAGE), "."); stringTokenizer //$NON-NLS-1$
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
							UML2Util.PROPERTY_NAME__PREFIX)) {

							ePackageInfo.setPrefix((String) element.getValue(
								ePackageStereotype,
								UML2Util.PROPERTY_NAME__PREFIX));
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

	public void adjustEPackage(Monitor monitor,
			EPackage ePackage) {
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

		for (Iterator i = getModelLocationURIs().iterator(); i.hasNext();) {
			getGenModel().getForeignModel().add(
				makeRelative((URI) i.next(), genModelURI).toString());
		}
	}

	protected void loadOriginalGenModel(URI genModelURI)
			throws DiagnosticException {
		super.loadOriginalGenModel(genModelURI);

		StringBuffer text = new StringBuffer();

		for (Iterator i = getOriginalGenModel().getForeignModel().iterator(); i
			.hasNext();) {

			String value = (String) i.next();

			if (value.endsWith('.' + UML2Resource.FILE_EXTENSION)) {
				text.append(makeAbsolute(URI.createURI(value), genModelURI)
					.toString());
				text.append(" "); //$NON-NLS-1$
			}
		}

		setModelLocation(text.toString().trim());
	}

}