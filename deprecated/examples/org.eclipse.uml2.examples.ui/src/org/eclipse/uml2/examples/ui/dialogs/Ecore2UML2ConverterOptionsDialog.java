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
 * $Id: Ecore2UML2ConverterOptionsDialog.java,v 1.2 2005/12/16 03:54:51 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.util.UML2Util;

/**
 * 
 */
public class Ecore2UML2ConverterOptionsDialog
		extends OptionsDialog {

	public Ecore2UML2ConverterOptionsDialog(Shell parent, String title,
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
			UML2Util.Ecore2UML2Converter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.Ecore2UML2Converter.OPTION__REDEFINES_ANNOTATIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.Ecore2UML2Converter.OPTION__SUBSETS_ANNOTATIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.Ecore2UML2Converter.OPTION__UNION_ANNOTATIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.Ecore2UML2Converter.OPTION__ANNOTATION_DETAILS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__IGNORE);
	}
}
