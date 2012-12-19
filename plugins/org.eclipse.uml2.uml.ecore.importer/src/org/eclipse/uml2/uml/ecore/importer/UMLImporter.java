/*
 * Copyright (c) 2006, 2012 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 220552, 226102
 *   Kenn Hussey (CEA) - 327039, 351774, 364419, 366289
 *
 */
package org.eclipse.uml2.uml.ecore.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UMLImporter
		extends ModelImporter {

	protected final Map<String, String> options = new HashMap<String, String>();

	public static class EPackageImportInfo
			extends ModelImporter.EPackageImportInfo {

		protected String operationsPackage;

		protected boolean resourceInterfaces = false;

		public String getOperationsPackage() {
			return operationsPackage;
		}

		public void setOperationsPackage(String operationsPackage) {
			this.operationsPackage = operationsPackage;
		}

		public boolean isResourceInterfaces() {
			return resourceInterfaces;
		}

		public void setResourceInterfaces(boolean resourceInterfaces) {
			this.resourceInterfaces = resourceInterfaces;
		}
	}

	@Override
	protected EPackageConvertInfo createEPackageInfo(EPackage ePackage) {
		return new EPackageImportInfo();
	}

	public Map<String, String> getOptions() {
		return options;
	}

	@Override
	public String getID() {
		return "org.eclipse.uml2.uml.ecore.importer"; //$NON-NLS-1$
	}

	@Override
	public GenModel getGenModel() {

		if (genModel == null) {
			genModel = org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory.eINSTANCE
				.createGenModel();
			genModel.setImporterID(getID());
		}

		return genModel;
	}

	@Override
	protected Diagnostic doComputeEPackages(Monitor monitor)
			throws Exception {
		Diagnostic diagnostic = Diagnostic.OK_INSTANCE;
		List<URI> locationURIs = getModelLocationURIs();

		if (locationURIs.isEmpty()) {
			diagnostic = new BasicDiagnostic(Diagnostic.ERROR,
				ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT,
				UMLImporterPlugin.INSTANCE
					.getString("_UI_SpecifyAValidUMLModel_message"), null); //$NON-NLS-1$
		} else {
			monitor.beginTask(UML2Util.EMPTY_STRING, 2);
			monitor.subTask(UMLImporterPlugin.INSTANCE.getString(
				"_UI_Loading_message", new Object[]{locationURIs})); //$NON-NLS-1$

			Collection<org.eclipse.uml2.uml.Package> packages = new ArrayList<org.eclipse.uml2.uml.Package>();

			ResourceSet umlResourceSet = createResourceSet();

			for (URI locationURI : locationURIs) {
				packages.addAll(EcoreUtil
					.<org.eclipse.uml2.uml.Package> getObjectsByType(
						umlResourceSet.getResource(locationURI, true)
							.getContents(), UMLPackage.Literals.PACKAGE));
			}

			EcoreUtil.resolveAll(umlResourceSet);

			monitor.worked(1);

			BasicDiagnostic diagnostics = new BasicDiagnostic(
				ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT,
				UMLImporterPlugin.INSTANCE
					.getString("_UI_ProblemsEncounteredProcessing_message"), //$NON-NLS-1$
				null);

			Map<Object, Object> context = new HashMap<Object, Object>();
			context
				.put(
					org.eclipse.uml2.common.util.UML2Util.QualifiedTextProvider.class,
					UMLUtil.QualifiedTextProvider.DEFAULT);

			@SuppressWarnings("unchecked")
			Collection<EPackage> ePackages = (Collection<EPackage>) new UMLUtil.UML2EcoreConverter() {

				@Override
				protected void processEcoreTaggedValues(EPackage ePackage,
						Element element, Map<String, String> options,
						DiagnosticChain diagnostics, Map<Object, Object> context) {

					super.processEcoreTaggedValues(ePackage, element, options,
						diagnostics, context);

					Stereotype ePackageStereotype = getAppliedEcoreStereotype(
						element, UMLUtil.STEREOTYPE__E_PACKAGE);

					if (null != ePackageStereotype) {
						ModelImporter.EPackageImportInfo ePackageInfo = getEPackageImportInfo(ePackage);

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
			}.convert(packages, options, diagnostics, context);

			getEPackages().addAll(ePackages);

			monitor.done();

			if (Diagnostic.INFO < diagnostics.getSeverity()) {
				diagnostic = diagnostics;
			}

			if (Diagnostic.ERROR > diagnostics.getSeverity()) {
				adjustEPackages(monitor);
			}
		}

		return diagnostic;
	}

	@Override
	protected void adjustGenPackageDuringTraverse(GenPackage genPackage) {
		super.adjustGenPackageDuringTraverse(genPackage);

		if (genPackage instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) {
			org.eclipse.uml2.codegen.ecore.genmodel.GenPackage uml2GenPackage = (org.eclipse.uml2.codegen.ecore.genmodel.GenPackage) genPackage;
			EPackageImportInfo umlEPackageImportInfo = (EPackageImportInfo) getEPackageImportInfo(genPackage
				.getEcorePackage());

			uml2GenPackage.setOperationsPackage(umlEPackageImportInfo
				.getOperationsPackage());
			uml2GenPackage.setResourceInterfaces(umlEPackageImportInfo
				.isResourceInterfaces());
		}
	}

	@Override
	public void adjustEPackage(Monitor monitor, EPackage ePackage) {
		ModelImporter.EPackageImportInfo ePackageInfo = getEPackageImportInfo(ePackage);
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

	@Override
	protected void adjustGenModel(Monitor monitor) {
		super.adjustGenModel(monitor);

		URI genModelURI = createFileURI(getGenModelPath().toString());
		GenModel genModel = getGenModel();
		EList<String> foreignModel = genModel.getForeignModel();

		for (URI modelLocationURI : getModelLocationURIs()) {
			foreignModel.add(makeRelative(modelLocationURI, genModelURI)
				.toString());
		}
	}

	@Override
	protected void handleOriginalGenModel()
			throws DiagnosticException {
		URI genModelURI = getOriginalGenModel().eResource().getURI();
		StringBuffer text = new StringBuffer();
		GenModel originalGenModel = getOriginalGenModel();

		for (String value : originalGenModel.getForeignModel()) {

			if (value.endsWith('.' + UMLResource.FILE_EXTENSION)
				|| value.endsWith('.' + UMLResource.FILE_EXTENSION
					.toUpperCase())
				|| value.endsWith('.' + UML22UMLResource.FILE_EXTENSION)
				|| value.endsWith('.' + UML22UMLResource.FILE_EXTENSION
					.toUpperCase())
				|| value.endsWith('.' + XMI2UMLResource.FILE_EXTENSION)
				|| value.endsWith('.' + XMI2UMLResource.FILE_EXTENSION
					.toUpperCase())
				|| value.endsWith('.' + CMOF2UMLResource.FILE_EXTENSION)
				|| value.endsWith('.' + CMOF2UMLResource.FILE_EXTENSION
					.toUpperCase())) {

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

	@Override
	public void prepareGenModelAndEPackages(Monitor monitor) {
		super.prepareGenModelAndEPackages(monitor);

		UML2GenModelUtil.getGenAnnotation(genModel,
			getConverterGenAnnotationSource(), true).getDetails().putAll(
			getOptions());
	}

	@Override
	public ResourceSet createResourceSet() {
		ResourceSet resourceSet = super.createResourceSet();

		if (resourceSet instanceof ResourceSetImpl) {
			new ResourceSetImpl.MappedResourceLocator(
				(ResourceSetImpl) resourceSet);
		}

		return UMLUtil.init(resourceSet);
	}

}