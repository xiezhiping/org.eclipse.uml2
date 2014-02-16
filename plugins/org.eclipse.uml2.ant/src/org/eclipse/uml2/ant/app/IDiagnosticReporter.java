/*
 * Copyright (c) 2013, 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 286404
 *
 */
package org.eclipse.uml2.ant.app;

import java.io.PrintStream;

import org.eclipse.emf.common.util.Diagnostic;

/**
 * An interface for objects that can consume ("report") {@link Diagnostic}s
 * produced by the UML-to-Ecore conversion of a profile.
 * 
 * @see PrintStreamReporter
 */
public interface IDiagnosticReporter {

	void report(Diagnostic diagnostic);

	/**
	 * Partial implementation of a diagnostic reporter.
	 */
	abstract class AbstractReporter
			implements IDiagnosticReporter {

		public AbstractReporter() {
			super();
		}

		public void report(Diagnostic diagnostic) {
			report(0, diagnostic);
		}

		protected void report(int depth, Diagnostic diagnostic) {
			doReport(depth, diagnostic.getSeverity(), diagnostic.getMessage(),
				diagnostic.getException());

			if (!diagnostic.getChildren().isEmpty()) {
				for (Diagnostic next : diagnostic.getChildren()) {
					report(depth + 1, next);
				}
			}
		}

		protected abstract void doReport(int depth, int severity,
				String message, Throwable exception);

		protected String toSeverityString(int severity) {
			switch (severity) {
				case Diagnostic.OK :
					return "OK"; //$NON-NLS-1$
				case Diagnostic.INFO :
					return "INFO"; //$NON-NLS-1$
				case Diagnostic.WARNING :
					return "WARN"; //$NON-NLS-1$
				default :
					return "ERROR"; //$NON-NLS-1$
			}
		}
	}

	/**
	 * A diagnostic reporter that prints diagnostics to a stream.
	 */
	class PrintStreamReporter
			extends AbstractReporter {

		private final PrintStream stream;

		public PrintStreamReporter(PrintStream stream) {
			this.stream = stream;
		}

		@Override
		protected void doReport(int depth, int severity, String message,
				Throwable exception) {

			stream.printf("%" + (2 * depth) + "s[%5s] %s%n", //$NON-NLS-1$ //$NON-NLS-2$
				"", //$NON-NLS-1$
				toSeverityString(severity), message);
		}

		@Override
		protected String toSeverityString(int severity) {
			switch (severity) {
				case Diagnostic.OK :
					return "OK"; //$NON-NLS-1$
				case Diagnostic.INFO :
					return "INFO"; //$NON-NLS-1$
				case Diagnostic.WARNING :
					return "WARN"; //$NON-NLS-1$
				default :
					return "ERROR"; //$NON-NLS-1$
			}
		}
	}
}
