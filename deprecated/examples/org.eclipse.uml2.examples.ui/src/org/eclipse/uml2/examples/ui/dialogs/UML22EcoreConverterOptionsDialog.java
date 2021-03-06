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
 * $Id: UML22EcoreConverterOptionsDialog.java,v 1.6 2005/12/16 03:54:51 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.dialogs;

import java.util.Map;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.util.UML2Util;

/**
 * 
 */
public class UML22EcoreConverterOptionsDialog
		extends OptionsDialog {

	public UML22EcoreConverterOptionsDialog(Shell parent, String title,
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
			UML2Util.UML22EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__DERIVED_FEATURES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__DISCARD, UML2Util.OPTION__PROCESS},
			UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_FEATURES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__DISCARD, UML2Util.OPTION__PROCESS},
			UML2Util.OPTION__PROCESS);

		createOptionArea(
			parent,
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__DISCARD, UML2Util.OPTION__PROCESS},
			UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__DISCARD, UML2Util.OPTION__PROCESS},
			UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__REDEFINING_OPERATIONS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__REDEFINING_PROPERTIES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__UNION_PROPERTIES,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__SUPER_CLASS_ORDER,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);

		createOptionArea(parent,
			UML2Util.UML22EcoreConverter.OPTION__ANNOTATION_DETAILS,
			new String[]{UML2Util.OPTION__IGNORE, UML2Util.OPTION__REPORT,
				UML2Util.OPTION__PROCESS}, UML2Util.OPTION__PROCESS);
	}
}
