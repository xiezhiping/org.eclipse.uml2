/*
 * Copyright (c) 2006, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 394623
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.generator;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.uml2.codegen.ecore.genmodel.GenPackage;

/**
 * @since 1.2.0
 */
public class UML2GenPackageGeneratorAdapter
		extends UML2GenBaseGeneratorAdapter {

	protected static final int RESOURCE_INTERFACE_ID = 0;
	
	protected static final int DERIVED_UNION_ADAPTER_CLASS_ID = 1;

	private static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS = {
		new JETEmitterDescriptor("model/ResourceInterface.javajet", //$NON-NLS-1$
			"org.eclipse.uml2.codegen.ecore.templates.model.ResourceInterface"), //$NON-NLS-1$
		new JETEmitterDescriptor("model/DerivedUnionAdapterClass.javajet", //$NON-NLS-1$
			"org.eclipse.uml2.codegen.ecore.templates.model.DerivedUnionAdapterClass")}; //$NON-NLS-1$

	public UML2GenPackageGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	protected JETEmitterDescriptor[] getJETEmitterDescriptors() {
		return JET_EMITTER_DESCRIPTORS;
	}

	@Override
	protected Diagnostic generateModel(Object object, Monitor monitor) {
		GenPackage genPackage = (GenPackage) object;
		monitor.beginTask("", 3); //$NON-NLS-1$

		message = CodeGenEcorePlugin.INSTANCE.getString(
			"_UI_GeneratingPackage_message", new Object[]{genPackage //$NON-NLS-1$
				.getPackageInterfaceName()});
		monitor.subTask(message);

		GenModel genModel = genPackage.getGenModel();
		ensureProjectExists(genModel.getModelDirectory(), genPackage,
			MODEL_PROJECT_TYPE, genModel.isUpdateClasspath(), createMonitor(
				monitor, 1));

		generateResourceInterface(genPackage, monitor);

		generateDerivedUnionAdapterClass(genPackage, monitor);

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

	protected void generateDerivedUnionAdapterClass(GenPackage genPackage,
			Monitor monitor) {

		if (!genPackage.getDerivedUnionAdapterGenClasses().isEmpty()) {
			message = CodeGenEcorePlugin.INSTANCE.getString(
				"_UI_GeneratingJavaClass_message", new Object[]{genPackage
					.getQualifiedDerivedUnionAdapterClassName()});
			monitor.subTask(message);
			generateJava(
				genPackage.getGenModel().getModelDirectory(),
				genPackage.getUtilitiesPackageName(),
				genPackage.getDerivedUnionAdapterClassName(),
				getJETEmitter(getJETEmitterDescriptors(),
					DERIVED_UNION_ADAPTER_CLASS_ID), null,
				createMonitor(monitor, 1));
		} else {
			monitor.worked(1);
		}
	}

}
