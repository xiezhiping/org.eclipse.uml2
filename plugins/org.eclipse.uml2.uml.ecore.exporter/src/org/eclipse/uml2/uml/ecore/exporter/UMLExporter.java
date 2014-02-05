/*
 * Copyright (c) 2006, 2014 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 273949
 *   Kenn Hussey (CEA) - 316165, 273948, 418466
 *
 */
package org.eclipse.uml2.uml.ecore.exporter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.exporter.ModelExporter;
import org.eclipse.emf.exporter.util.ExporterUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;

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

		if (!location.endsWith('.' + UMLResource.FILE_EXTENSION)
			&& !location.endsWith('.' + XMI2UMLResource.FILE_EXTENSION)
			&& !location.endsWith('.' + CMOF2UMLResource.FILE_EXTENSION)) {

			return UMLExporterPlugin.INSTANCE
				.getString("_UI_InvalidArtifactFileNameExtension_message"); //$NON-NLS-1$
		}

		return super.doCheckEPackageArtifactLocation(location, packageName);
	}

	@Override
	protected Diagnostic doExport(Monitor monitor, ExportData exportData)
			throws Exception {
		Diagnostic diagnostic = Diagnostic.OK_INSTANCE;

		final ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, Object> extensionToFactoryMap = resourceSet
			.getResourceFactoryRegistry().getExtensionToFactoryMap();

		extensionToFactoryMap.put(XMI2UMLResource.FILE_EXTENSION,
			XMI2UMLResource.Factory.INSTANCE);
		extensionToFactoryMap.put(CMOF2UMLResource.FILE_EXTENSION,
			CMOF2UMLResource.Factory.INSTANCE);

		UMLUtil.Ecore2UMLConverter ecore2umlConverter = new UMLUtil.Ecore2UMLConverter() {

			@Override
			protected Profile getEcoreProfile(EObject eObject) {
				return UMLUtil.load(resourceSet,
					URI.createURI(UMLResource.ECORE_PROFILE_URI),
					UMLPackage.Literals.PROFILE);
			}

			@Override
			protected void processEcoreTaggedValues(Element element,
					EPackage ePackage, Map<String, String> options,
					DiagnosticChain diagnostics, Map<Object, Object> context) {
				super.processEcoreTaggedValues(element, ePackage, options,
					diagnostics, context);

				GenPackage genPackage = getEPackageToGenPackageMap().get(
					ePackage);

				if (genPackage != null) {
					Stereotype ePackageStereotype = getEcoreStereotype(
						ePackage, UMLUtil.STEREOTYPE__E_PACKAGE);

					if (ePackageStereotype != null) {
						UMLUtil
							.safeApplyStereotype(element, ePackageStereotype);

						processEcoreTaggedValue(element, ePackageStereotype,
							UMLUtil.TAG_DEFINITION__BASE_PACKAGE,
							genPackage.getBasePackage(), options, diagnostics,
							context);
					}
				}
			}

		};

		BasicDiagnostic diagnostics = new BasicDiagnostic(ConverterPlugin.ID,
			ConverterUtil.ACTION_DEFAULT,
			UMLExporterPlugin.INSTANCE
				.getString("_UI_ProblemsEncounteredProcessing_message"), //$NON-NLS-1$
			null);

		Map<Object, Object> context = new HashMap<Object, Object>();
		context.put(
			org.eclipse.uml2.common.util.UML2Util.QualifiedTextProvider.class,
			UMLUtil.QualifiedTextProvider.DEFAULT);

		monitor.beginTask(UML2Util.EMPTY_STRING,
			exportData.genPackageToArtifactURI.size());

		List<Resource> resourcesToSave = new ArrayList<Resource>();

		for (Map.Entry<GenPackage, URI> entry : exportData.genPackageToArtifactURI
			.entrySet()) {

			URI artifactURI = entry.getValue();
			Resource resource = resourceSet.createResource(artifactURI);
			resourcesToSave.add(resource);

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

			if (UMLUtil.OPTION__PROCESS.equals(options
				.get(UMLUtil.Ecore2UMLConverter.OPTION__XMI_IDENTIFIERS))
				&& resource instanceof XMIResource) {

				XMIResource xmiResource = (XMIResource) resource;

				for (TreeIterator<EObject> allContents = xmiResource
					.getAllContents(); allContents.hasNext();) {

					EObject eObject = allContents.next();
					String xmiIdentifier = UML2Util
						.getXMIIdentifier((InternalEObject) eObject);

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLUtil.Ecore2UMLConverter.XMI_IDENTIFIER,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_Ecore2UMLConverter_ProcessXMIIdentifier_diagnostic", //$NON-NLS-1$
										UML2Util.getMessageSubstitutions(
											context, eObject, xmiIdentifier)),
								new Object[]{eObject}));
					}

					xmiResource.setID(eObject, xmiIdentifier);
				}
			}

			monitor.worked(1);
		}

		for (Map.Entry<GenPackage, URI> entry : exportData.referencedGenPackagesToArtifactURI
			.entrySet()) {

			Resource referencedResource = resourceSet.getResource(
				entry.getValue(), true);

			if (referencedResource != null) {
				org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) ecore2umlConverter
					.doSwitch(getReferredEPackage(entry.getKey()));

				for (TreeIterator<EObject> allContents = UML2Util
					.getAllContents(package_, true, false); allContents
					.hasNext();) {

					EObject eObject = allContents.next();

					if (eObject instanceof NamedElement) {
						Collection<NamedElement> namedElements = UMLUtil
							.findNamedElements(referencedResource,
								((NamedElement) eObject).getQualifiedName(),
								true);

						if (namedElements.size() == 1) {
							((InternalEObject) eObject).eSetProxyURI(EcoreUtil
								.getURI(namedElements.iterator().next()));
						}
					}
				}
			}

			monitor.worked(1);
		}

		for (Resource resource : resourcesToSave) {
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
		EPackage ecorePackage = genPackage.getEcorePackage();
		return ecorePackage != null && ecorePackage.getESuperPackage() == null;
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
				converter.convert(
					Collections.singleton(genPackage.getEcorePackage()),
					getOptions(), null, null);
			}
		}

		Map<EPackage, GenPackage> ePackageToGenPackageMap = getEPackageToGenPackageMap();
		List<EPackage> ePackages = getEPackages();

		for (EPackage convertedEPackage : converter.getEcorePackages()) {
			GenPackage convertedGenPackage = genModel
				.findGenPackage(convertedEPackage);

			if (convertedGenPackage != null
				&& isValidEPackage(convertedGenPackage)) {

				ePackageToGenPackageMap.put(convertedEPackage,
					convertedGenPackage);

				String nsURI = convertedEPackage.getNsURI();

				for (int i = 0; i < ePackages.size(); i++) {
					EPackage ePackage = ePackages.get(i);

					if (ePackage != convertedEPackage
						&& UML2Util.safeEquals(ePackage.getNsURI(), nsURI)) {

						ePackages.remove(i);
						ePackages.add(i, convertedEPackage);
					}
				}

				if (!ePackages.contains(convertedEPackage)) {
					ePackages.add(convertedEPackage);
				}
			}
		}

		adjustGenModel();

		genModel = getGenModel();

		if (genModel != null) {
			getOptions().putAll(
				ExporterUtil
					.findOrCreateGenAnnotation(genModel,
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

			ExporterUtil
				.findOrCreateGenAnnotation(genModel,
					getConverterGenAnnotationSource()).getDetails()
				.putAll(getOptions());
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

	@Override
	protected ReferencedGenPackageConvertInfo createGenPackageConvertInfo(
			GenPackage genPackage) {
		ReferencedGenPackageExportInfo genPackageInfo = (ReferencedGenPackageExportInfo) super
			.createGenPackageConvertInfo(genPackage);

		if (getExporterNestedGenAnnotations(genPackage).isEmpty()) {
			String nsURI = genPackage.getEcorePackage().getNsURI();

			if (EcorePackage.eNS_URI.equals(nsURI)) {
				genPackageInfo.setArtifactURI(URI
					.createURI(UMLResource.ECORE_METAMODEL_URI));
			} else if (TypesPackage.eNS_URI.equals(nsURI)) {
				genPackageInfo.setArtifactURI(URI
					.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));
			} else if (UMLPackage.eNS_URI.equals(nsURI)) {
				genPackageInfo.setArtifactURI(URI
					.createURI(UMLResource.UML_METAMODEL_URI));
			} else if (UMLResource.STANDARD_PROFILE_NS_URI.equals(nsURI)) {
				genPackageInfo.setArtifactURI(URI
					.createURI(UMLResource.STANDARD_PROFILE_URI));
			}

			genPackageInfo
				.setValidReference(genPackageInfo.getArtifactURI() != null);
		}

		return genPackageInfo;
	}

}