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
 * $Id: ValidateElementAction.java,v 1.1 2004/04/29 15:31:13 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.edit.util.UML2Validator;
import org.eclipse.uml2.util.ProgressMonitor;

/**
 *  
 */
public class ValidateElementAction
	extends CommandAction {

	public ValidateElementAction() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& Element.class.isInstance(collection.toArray()[0])) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {

		if (UnexecutableCommand.INSTANCE != command) {

			try {
				IRunnableWithProgress runnable = new IRunnableWithProgress() {

					public void run(final IProgressMonitor monitor) {
						IFileEditorInput fileEditorInput = (IFileEditorInput) editorPart
							.getEditorInput();

						try {
							fileEditorInput.getFile()
								.deleteMarkers(IMarker.PROBLEM, true,
									IResource.DEPTH_INFINITE);
						} catch (CoreException ce) {
							ce.printStackTrace(System.err);
						}

						Diagnostic diagnostics = UML2Validator.INSTANCE
							.validate((Element) collection.toArray()[0],
								new ProgressMonitor() {

									public void beginTask(String name,
											int totalWork) {
										monitor.beginTask(name, totalWork);
									}

									public void done() {
										monitor.done();
									}

									public void internalWorked(double work) {
										monitor.internalWorked(work);
									}

									public boolean isCanceled() {
										return monitor.isCanceled();
									}

									public void setCanceled(boolean value) {
										monitor.setCanceled(value);
									}

									public void setTaskName(String name) {
										monitor.setTaskName(name);
									}

									public void subTask(String name) {
										monitor.subTask(name);
									}

									public void worked(int work) {
										monitor.worked(work);
									}

								});

						if (!monitor.isCanceled()
							&& Diagnostic.OK != diagnostics.getSeverity()) {

							for (Iterator children = diagnostics.getChildren()
								.iterator(); children.hasNext();) {

								Diagnostic diagnostic = (Diagnostic) children
									.next();

								try {
									Map attributes = new HashMap();

									attributes.put(IMarker.MESSAGE, diagnostic
										.getMessage());

									switch (diagnostic.getSeverity()) {
										case IStatus.ERROR:
											attributes
												.put(
													IMarker.SEVERITY,
													new Integer(
															IMarker.SEVERITY_ERROR));
											break;
										case IStatus.WARNING:
											attributes
												.put(
													IMarker.SEVERITY,
													new Integer(
															IMarker.SEVERITY_WARNING));
											break;
										case IStatus.INFO:
											attributes.put(IMarker.SEVERITY,
												new Integer(
														IMarker.SEVERITY_INFO));
											break;
									}

									fileEditorInput.getFile().createMarker(
										IMarker.PROBLEM).setAttributes(
										attributes);
								} catch (CoreException ce) {
									System.err.println(diagnostic.getMessage());
								}
							}
						}
					}
				};

				new ProgressMonitorDialog(editorPart.getEditorSite().getShell())
					.run(true, true, runnable);
			} catch (InvocationTargetException ite) {
				ite.printStackTrace(System.err);
			} catch (InterruptedException ie) {
				// ignore
			}
		}
	}

}