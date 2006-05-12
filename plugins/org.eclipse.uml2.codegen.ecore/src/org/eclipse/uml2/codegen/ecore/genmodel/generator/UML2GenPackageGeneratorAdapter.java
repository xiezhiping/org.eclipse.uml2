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
 * $Id: UML2GenPackageGeneratorAdapter.java,v 1.2 2006/05/12 20:43:01 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.codegen.ecore.genmodel.GenPackage;

/**
 * @since 1.2.0
 */
public class UML2GenPackageGeneratorAdapter
		extends UML2GenBaseGeneratorAdapter {

	protected static final int RESOURCE_INTERFACE_ID = 0;

	private static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS = {new JETEmitterDescriptor(
		"model/ResourceInterface.javajet", //$NON-NLS-1$
		"org.eclipse.uml2.codegen.ecore.templates.model.ResourceInterface")}; //$NON-NLS-1$

	public UML2GenPackageGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	protected JETEmitterDescriptor[] getJETEmitterDescriptors() {
		return JET_EMITTER_DESCRIPTORS;
	}

	protected Diagnostic generateModel(Object object, Monitor monitor) {
		GenPackage genPackage = (GenPackage) object;
		monitor.beginTask("", 2); //$NON-NLS-1$

		message = CodeGenEcorePlugin.INSTANCE.getString(
			"_UI_GeneratingPackage_message", new Object[]{genPackage //$NON-NLS-1$
				.getPackageInterfaceName()});
		monitor.subTask(message);

		GenModel genModel = genPackage.getGenModel();
		ensureProjectExists(genModel.getModelDirectory(), genPackage,
			MODEL_PROJECT_TYPE, genModel.isUpdateClasspath(), createMonitor(
				monitor, 1));

		generatePackageSerialization(genPackage, monitor);
		generateResourceInterface(genPackage, monitor);

		return Diagnostic.OK_INSTANCE;
	}

	protected void generateResourceInterface(GenPackage genPackage,
			Monitor monitor) {

		if (GenResourceKind.NONE_LITERAL != genPackage.getResource()
			&& genPackage.isResourceInterfaces()) {

			message = CodeGenEcorePlugin.INSTANCE.getString(
				"_UI_GeneratingJavaClass_message", new Object[]{genPackage //$NON-NLS-1$
					.getQualifiedResourceInterfaceName()});
			monitor.subTask(message);
			generateJava(genPackage.getGenModel().getModelDirectory(),
				genPackage.getUtilitiesPackageName(), genPackage
					.getResourceInterfaceName(), getJETEmitter(
					getJETEmitterDescriptors(), RESOURCE_INTERFACE_ID), null,
				createMonitor(monitor, 1));
		} else {
			monitor.worked(1);
		}
	}

	protected void generatePackageSerialization(GenPackage genPackage,
			Monitor monitor) {

		if (genPackage.hasClassifiers() && genPackage.isLoadingInitialization()) {
			monitor = createMonitor(monitor, 1);

			try {
				monitor.beginTask("", 1); //$NON-NLS-1$

				String targetPathName = genPackage.getGenModel()
					.getModelDirectory()
					+ '/'
					+ genPackage.getClassPackageName().replace('.', '/')
					+ '/' + genPackage.getSerializedPackageFilename();
				message = CodeGenEcorePlugin.INSTANCE.getString(
					"_UI_GeneratingPackageSerialization_message", //$NON-NLS-1$
					new Object[]{targetPathName});
				monitor.subTask(message);

				Resource resource = new ResourceSetImpl().getResource(
					toPlatformResourceURI(toURI(targetPathName)), true);

				List annotationsToRemove = new ArrayList();

				for (TreeIterator allContents = resource.getAllContents(); allContents
					.hasNext();) {

					EObject eObject = (EObject) allContents.next();

					if (eObject instanceof EAnnotation
						&& GenModelPackage.eNS_URI
							.equals(((EAnnotation) eObject).getSource())) {

						annotationsToRemove.add(eObject);
						allContents.prune();
					}
				}

				for (Iterator atr = annotationsToRemove.iterator(); atr
					.hasNext();) {

					((EAnnotation) atr.next()).setEModelElement(null);
				}

				try {
					resource.save(null);
				} catch (IOException ioe) {
					CodeGenEcorePlugin.INSTANCE.log(ioe);
				}
			} finally {
				monitor.done();
			}
		} else {
			monitor.worked(1);
		}
	}

}
