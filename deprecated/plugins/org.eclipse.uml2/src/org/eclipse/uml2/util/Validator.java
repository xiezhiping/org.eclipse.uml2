/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: Validator.java,v 1.3 2004/04/27 16:38:55 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;

/**
 * A utility that performs validation operations on objects and notifies a
 * monitor of progress. The outcome of a validation operation is represented by
 * a diagnostic containing zero or more children.
 * 
 * @see org.eclipse.emf.common.util.Diagnostic
 * @see ProgressMonitor
 */
public interface Validator {

	public static class ValidationContext {

		private final Map context = new HashMap();

		private final BasicDiagnostic diagnostics;

		private final ProgressMonitor monitor;

		public ValidationContext(BasicDiagnostic diagnostics, ProgressMonitor monitor) {
			super();

			this.diagnostics = diagnostics;
			this.monitor = monitor;
		}

		public Map getData() {
			return data;
		}

		public BasicDiagnostic getDiagnostics() {
			return diagnostics;
		}

		public ProgressMonitor getMonitor() {
			return monitor;
		}

	}

	/**
	 * Performs a validation operation on the specified object and notifies the
	 * specified monitor of progress.
	 * 
	 * @param object The object to be validated.
	 * @param monitor The monitor to notify of progress.
	 * @return A diagnostic indicating the outcome of the operation.
	 */
	public Diagnostic validate(EObject object, ProgressMonitor monitor);

}
