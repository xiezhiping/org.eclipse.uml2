/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.util;

/**
 *
 */
public class BasicProgressMonitor implements ProgressMonitor {

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#beginTask(java.lang.String, int)
	 */
	public void beginTask(String name, int totalWork) {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#done()
	 */
	public void done() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#internalWorked(double)
	 */
	public void internalWorked(double work) {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#isCanceled()
	 */
	public boolean isCanceled() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#setCanceled(boolean)
	 */
	public void setCanceled(boolean value) {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#setTaskName(java.lang.String)
	 */
	public void setTaskName(String name) {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#subTask(java.lang.String)
	 */
	public void subTask(String name) {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.ProgressMonitor#worked(int)
	 */
	public void worked(int work) {
		// do nothing
	}

}
