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
public interface ProgressMonitor {

	public final static int UNKNOWN = -1;

	public void beginTask(String name, int totalWork);

	public void done();

	public void internalWorked(double work);

	public boolean isCanceled();

	public void setCanceled(boolean value);

	public void setTaskName(String name);

	public void subTask(String name);

	public void worked(int work);

}
