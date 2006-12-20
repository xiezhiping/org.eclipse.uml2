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
 * $Id: UML2GenBaseGeneratorAdapter.java,v 1.2 2006/12/20 19:54:15 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.generator;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;

/**
 * @since 1.2.0
 */
public class UML2GenBaseGeneratorAdapter
		extends GenBaseGeneratorAdapter {

	protected static void addUML2ClasspathEntries(JETEmitter jetEmitter)
			throws JETException {
		jetEmitter.addVariable("UML2_CODEGEN_ECORE", //$NON-NLS-1$
			"org.eclipse.uml2.codegen.ecore"); //$NON-NLS-1$
	}

	public UML2GenBaseGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	@Override
	protected void addClasspathEntries(JETEmitter jetEmitter)
			throws JETException {
		super.addClasspathEntries(jetEmitter);

		addUML2ClasspathEntries(jetEmitter);
	}

}
