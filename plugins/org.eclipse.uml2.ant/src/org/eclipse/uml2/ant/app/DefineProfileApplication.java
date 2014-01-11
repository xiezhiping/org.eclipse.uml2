/*
 * Copyright (c) 2007, 2014 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 213218
 *   Kenn Hussey (CEA) - 322715
 *   Christian W. Damus (CEA) - 286404 (adapted from UMLImporterApplication)
 *   Christian W. Damus (CEA) - 405065
 *
 */
package org.eclipse.uml2.ant.app;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <p>
 * An Equinox application that accepts file paths for local UML profiles to
 * define, and options for the Profile-to-EPackage conversion, and converts each
 * profile using the given options and saves them <i>in situ</i>.
 * </p>
 * <p>
 * Invoke the application without any arguments, or just with <tt>-help</tt>,
 * for a usage message.
 * </p>
 */
public class DefineProfileApplication
		implements IApplication {

	protected static final Integer EXIT_FAILURE = 1;

	protected final IDiagnosticReporter reporter;

	protected List<URI> profileURIs = new java.util.ArrayList<URI>(1);

	protected Map<String, String> profileDefinitionOptions = new java.util.HashMap<String, String>();

	public DefineProfileApplication() {
		this(null);
	}

	public DefineProfileApplication(IDiagnosticReporter reporter) {
		this.reporter = (reporter == null)
			? new IDiagnosticReporter.PrintStreamReporter(System.out)
			: reporter;
	}

	public Object start(IApplicationContext context)
			throws Exception {

		String[] args = (String[]) context.getArguments().get(
			IApplicationContext.APPLICATION_ARGS);

		if (args == null) {
			args = new String[0];
		}

		return run(args);
	}

	public void stop() {
		// Pass
	}

	public Object run(final String[] args)
			throws Exception {
		try {
			IWorkspaceRunnable runnable = new IWorkspaceRunnable() {

				public void run(IProgressMonitor progressMonitor)
						throws CoreException {
					try {
						DefineProfileApplication.this.run(progressMonitor,
							(String[]) args);
					} catch (Exception exception) {
						throw new CoreException(new Status(IStatus.ERROR,
							UMLPlugin.getPlugin().getSymbolicName(), 0,
							"Error running profile definition application.", //$NON-NLS-1$
							exception));
					} finally {
						progressMonitor.done();
					}
				}
			};

			ResourcesPlugin.getWorkspace().run(runnable,
				BasicMonitor.toIProgressMonitor(new BasicMonitor.Printing(System.out)));
			return EXIT_OK;
		} catch (Exception e) {
			e.printStackTrace();
			UMLPlugin.INSTANCE.log(e);
			return EXIT_FAILURE;
		}
	}

	public void run(IProgressMonitor progressMonitor, String[] arguments)
			throws Exception {
		run(BasicMonitor.toMonitor(progressMonitor), arguments);
	}

	public void run(Monitor monitor, String[] arguments)
			throws Exception {

		if ((arguments.length == 0)
			|| "-help".equalsIgnoreCase(arguments[0].toString())) { //$NON-NLS-1$

			printUsage();
		} else {
			processArguments(arguments);
			execute(monitor);
		}
	}
	
	public void execute(Monitor monitor) throws Exception {
		ResourceSet rset = new ResourceSetImpl();

		try {
			// One work item for clean-up
			monitor.beginTask("Defining profile(s):", profileURIs.size() + 1); //$NON-NLS-1$
			for (URI profileURI : profileURIs) {
				monitor.subTask(profileURI.lastSegment());

				defineProfile(rset, profileURI);

				monitor.worked(1);
			}
		} finally {
			try {
				// Clean up the resource set
				monitor.subTask("Cleaning up."); //$NON-NLS-1$
				for (Resource next : rset.getResources()) {
					next.unload();
					next.eAdapters().clear();
				}
				rset.getResources().clear();
				rset.eAdapters().clear();
			} finally {
				monitor.done();
			}
		}
	}

	protected void defineProfile(ResourceSet rset, URI profileURI)
			throws Exception {

		Profile profile = UML2Util.load(rset, profileURI,
			UMLPackage.Literals.PROFILE);

		if (profile != null) {
			Map<Object, Object> context = new java.util.HashMap<Object, Object>();
			context.put(UML2Util.QualifiedTextProvider.class,
				new UMLUtil.QualifiedTextProvider());
			BasicDiagnostic diagnostic = new BasicDiagnostic();

			profile.define(profileDefinitionOptions, diagnostic, context);

			for (Diagnostic next : diagnostic.getChildren()) {
				reporter.report(next);
			}

			profile.eResource().save(null);
		}
	}

	public void printUsage() {
		System.out.println(getUsage());
	}

	protected String getUsage() {
		final String nl = System.getProperty("line.separator"); //$NON-NLS-1$

		StringBuilder result = new StringBuilder();

		//@formatter:off
		result.append("Usage: { <model.profile.uml> }+ <OPTIONS>").append(nl); //$NON-NLS-1$
		result.append("<OPTIONS>             ::= { <DEFINE-OPTION> }*").append(nl); //$NON-NLS-1$
		result.append("<DEFINE-OPTION>       ::= < -ECORE_TAGGED_VALUES |" ).append(nl); //$NON-NLS-1$
		result.append("                               -REDEFINING_OPERATIONS | -REDEFINING_PROPERTIES |").append(nl); //$NON-NLS-1$
		result.append("                               -SUBSETTING_PROPERTIES | -UNION_PROPERTIES | -DERIVED_FEATURES |" ).append(nl); //$NON-NLS-1$
		result.append("                               -DUPLICATE_OPERATIONS | -DUPLICATE_OPERATION_INHERITANCE |" ).append(nl); //$NON-NLS-1$
		result.append("                               -DUPLICATE_FEATURES | -DUPLICATE_FEATURE_INHERITANCE |" ).append(nl); //$NON-NLS-1$
		result.append("                               -UNTYPED_PROPERTIES |").append(nl); //$NON-NLS-1$
		result.append("                               -SUPER_CLASS_ORDER | -ANNOTATION_DETAILS |" ).append(nl); //$NON-NLS-1$
		result.append("                               -INVARIANT_CONSTRAINTS | -VALIDATION_DELEGATES | -NON_API_INVARIANTS |" ).append(nl); //$NON-NLS-1$
		result.append("                               -OPERATION_BODIES | -INVOCATION_DELEGATES |" ).append(nl); //$NON-NLS-1$
		result.append("                               -PROPERTY_DEFAULT_EXPRESSIONS |" ).append(nl); //$NON-NLS-1$
		result.append("                               -COMMENTS | -CAMEL_CASE_NAMES |" ).append(nl); //$NON-NLS-1$
		result.append("                               -FOREIGN_DEFINITIONS >" ).append(nl); //$NON-NLS-1$
		result.append("                             < PROCESS | IGNORE | REPORT | DISCARD >").append(nl); //$NON-NLS-1$
		result.append("").append(nl); //$NON-NLS-1$
		result.append("For example:").append(nl); //$NON-NLS-1$
		result.append("").append(nl); //$NON-NLS-1$
		result.append("  defineProfile").append(nl); //$NON-NLS-1$
		result.append("    ../../profiles/j2ee.profile.uml").append(nl); //$NON-NLS-1$
		result.append("    -INVARIANT_CONSTRAINTS PROCESS -VALIDATION_DELEGATES PROCESS").append(nl); //$NON-NLS-1$
		result.append("    -NON_API_INVARIANTS PROCESS -CAMEL_CASE_NAMES PROCESS").append(nl); //$NON-NLS-1$
		result.append("    -UNTYPED_PROPERTIES REPORT").append(nl); //$NON-NLS-1$
		//@formatter:on

		return result.toString();
	}

	protected void processArguments(String[] arguments) {
		int index = processModelPaths(arguments, 0);
		while (index < arguments.length) {
			index = processArgument(arguments, index);
		}
	}

	protected int processModelPaths(String[] arguments, int index) {
		while ((index < arguments.length)
			&& (!UML2Util.isEmpty(arguments[index]))
			&& !arguments[index].startsWith("-")) //$NON-NLS-1$
		{
			String location = arguments[index++];
			profileURIs.add(URI.createFileURI(new File(location)
				.getAbsolutePath()));
		}

		return index;
	}

	protected int processArgument(String[] arguments, int index) {
		if (isProfileDefinitionOption(arguments[index])) {
			profileDefinitionOptions.put(arguments[index].substring(1),
				arguments[++index]);
		} else {
			handleUnrecognizedArgument(arguments[index]);
		}

		return index + 1;
	}

	protected boolean isProfileDefinitionOption(String key) {
		String strippedKey = key.substring(1);

		return UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES
			.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__VALIDATION_DELEGATES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__NON_API_INVARIANTS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__INVOCATION_DELEGATES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__COMMENTS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.Profile2EPackageConverter.OPTION__FOREIGN_DEFINITIONS
				.equalsIgnoreCase(strippedKey);
	}

	protected void handleUnrecognizedArgument(String argument) {
		throw new IllegalArgumentException(String.format(
			"Unrecognized argument: \"%s\"", argument)); //$NON-NLS-1$
	}
}
