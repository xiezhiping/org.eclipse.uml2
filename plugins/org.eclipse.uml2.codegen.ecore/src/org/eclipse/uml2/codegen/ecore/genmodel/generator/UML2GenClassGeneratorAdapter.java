/*
 * Copyright (c) 2006, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 206636
 *
 * $Id: UML2GenClassGeneratorAdapter.java,v 1.3 2008/03/21 00:22:59 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.generator;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.uml2.codegen.ecore.genmodel.GenClass;
import org.eclipse.uml2.codegen.ecore.genmodel.GenPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * @since 1.2.0
 */
public class UML2GenClassGeneratorAdapter
		extends UML2GenBaseGeneratorAdapter {

	protected static final int OPERATIONS_CLASS_ID = 0;

	private static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS = {new JETEmitterDescriptor(
		"model/OperationsClass.javajet", //$NON-NLS-1$
		"org.eclipse.uml2.codegen.ecore.templates.model.OperationsClass")}; //$NON-NLS-1$

	public UML2GenClassGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	protected JETEmitterDescriptor[] getJETEmitterDescriptors() {
		return JET_EMITTER_DESCRIPTORS;
	}

	@Override
	protected Diagnostic generateModel(Object object, Monitor monitor) {
		GenClass genClass = (GenClass) object;
		monitor.beginTask("", 1); //$NON-NLS-1$

		message = CodeGenEcorePlugin.INSTANCE.getString(
			"_UI_Generating_message", new Object[]{genClass //$NON-NLS-1$
				.getFormattedName()});
		monitor.subTask(message);

		GenModel genModel = genClass.getGenModel();
		ensureProjectExists(genModel.getModelDirectory(), genClass,
			MODEL_PROJECT_TYPE, genModel.isUpdateClasspath(), createMonitor(
				monitor, 1));

		generateOperationsClass(genClass, monitor);

		return Diagnostic.OK_INSTANCE;
	}

	protected void generateOperationsClass(GenClass genClass, Monitor monitor) {
		GenPackage genPackage = (GenPackage) genClass.getGenPackage();

		if (UML2GenModelUtil.isOperationsClasses(genPackage)
			&& !genClass.getOperationsClassGenOperations().isEmpty()) {

			message = CodeGenEcorePlugin.INSTANCE.getString(
				"_UI_GeneratingJavaClass_message", new Object[]{genClass //$NON-NLS-1$
					.getQualifiedOperationsClassName()});
			monitor.subTask(message);
			generateJava(genClass.getGenModel().getModelDirectory(),
				UML2GenModelUtil.getOperationsPackageName(genPackage), genClass
					.getOperationsClassName(), getJETEmitter(
					getJETEmitterDescriptors(), OPERATIONS_CLASS_ID), null,
				createMonitor(monitor, 1));
		} else {
			monitor.worked(1);
		}
	}

}
