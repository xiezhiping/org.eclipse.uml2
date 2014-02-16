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
package org.eclipse.uml2.ant.util;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.Task;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.uml2.ant.app.IDiagnosticReporter;


/**
 * A diagnostic reporter that delegates logging to Ant.
 */
public abstract class AntDiagnosticReporter
		extends IDiagnosticReporter.AbstractReporter {

	protected AntDiagnosticReporter() {
		super();
	}

	public static AntDiagnosticReporter create(Project project) {
		return new ProjectLogger(project);
	}

	public static AntDiagnosticReporter create(Target target) {
		return new TargetLogger(target);
	}

	public static AntDiagnosticReporter create(Task task) {
		return new TaskLogger(task);
	}

	public void log(Diagnostic diagnostic) {
	}

	@Override
	protected void doReport(int depth, int severity, String message,
			Throwable exception) {

		doLog(toAntLevel(severity), indent(message, depth), exception);
	}

	protected abstract void doLog(int level, String message, Throwable exception);

	protected String indent(String text, int tabs) {
		String result = text;

		if (tabs > 0) {
			StringBuilder buf = new StringBuilder(text.length() + tabs * 2);
			for (int i = 0; i < tabs; i++) {
				buf.append("  "); //$NON-NLS-1$
			}
			buf.append(text);
			result = buf.toString();
		}

		return result;
	}

	protected int toAntLevel(int diagnosticSeverity) {
		switch (diagnosticSeverity) {
			case Diagnostic.OK :
				return Project.MSG_VERBOSE;
			case Diagnostic.INFO :
				return Project.MSG_INFO;
			case Diagnostic.WARNING :
				return Project.MSG_WARN;
			default :
				return Project.MSG_ERR;
		}
	}

	//
	// Nested types
	//

	private static class ProjectLogger
			extends AntDiagnosticReporter {

		private final Project project;

		ProjectLogger(Project project) {
			this.project = project;
		}

		@Override
		protected void doLog(int level, String message, Throwable exception) {
			project.log(message, exception, level);
		}
	}

	private static class TargetLogger
			extends AntDiagnosticReporter {

		private final Target target;

		TargetLogger(Target target) {
			this.target = target;
		}

		@Override
		protected void doLog(int level, String message, Throwable exception) {
			target.getProject().log(target, message, exception, level);
		}
	}

	private static class TaskLogger
			extends AntDiagnosticReporter {

		private final Task task;

		TaskLogger(Task task) {
			this.task = task;
		}

		@Override
		protected void doLog(int level, String message, Throwable exception) {
			task.getProject().log(task, message, exception, level);
		}
	}
}
