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

import org.eclipse.emf.common.util.Diagnostic;

/**
 *
 */
public interface ProgressMonitorWithBlocking {

	public void setBlocked(Diagnostic reason);

	public void clearBlocked();

}
