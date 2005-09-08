/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PackageMergerOptionsDialog.java,v 1.4 2005/09/08 18:11:18 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.util.UML2Util;

/**
 * 
 */
public class PackageMergerOptionsDialog
		extends OptionsDialog {

	public PackageMergerOptionsDialog(Shell parent, String title,
			String message, Map options) {

		super(parent, title, message, options);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.examples.ui.dialogs.OptionsDialog#createOptionAreas(org.eclipse.swt.widgets.Composite)
	 */
	protected void createOptionAreas(Composite parent) {
		super.createOptionAreas(parent);

		createOptionArea(parent,
			UML2Util.PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT},
			UML2Util.OPTION__REPORT);
		createOptionArea(parent,
			UML2Util.PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT},
			UML2Util.OPTION__REPORT);
		createOptionArea(parent, UML2Util.PackageMerger.OPTION__EMPTY_UNIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);
		createOptionArea(parent,
			UML2Util.PackageMerger.OPTION__IMPLICIT_REDEFINITIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);
		createOptionArea(parent,
			UML2Util.PackageMerger.OPTION__INVALID_REDEFINITIONS, new String[]{
				UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__DISCARD, UML2Util.OPTION__PROCESS},
			UML2Util.OPTION__PROCESS);
		createOptionArea(parent,
			UML2Util.PackageMerger.OPTION__INVALID_SUBSETS, new String[]{
				UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__DISCARD, UML2Util.OPTION__PROCESS},
			UML2Util.OPTION__PROCESS);
		createOptionArea(parent,
			UML2Util.PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__DISCARD}, UML2Util.OPTION__DISCARD);
		createOptionArea(parent, UML2Util.PackageMerger.OPTION__CAPABILITIES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);
	}
}
