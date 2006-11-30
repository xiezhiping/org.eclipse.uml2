/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ImportPrimitiveTypeAction.java,v 1.3 2006/11/30 05:15:31 khussey Exp $
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

public class ImportPrimitiveTypeAction
		extends ImportTypeAction {

	public ImportPrimitiveTypeAction() {
		super();
	}

	protected List getChoiceOfValues(Package package_) {
		List choiceOfValues = super.getChoiceOfValues(package_);

		for (Iterator cov = choiceOfValues.iterator(); cov.hasNext();) {
			Object type = cov.next();

			if (!(type instanceof PrimitiveType)) {
				cov.remove();
			}
		}

		return choiceOfValues;
	}

	protected String getActionCommandLabel() {
		return UMLEditorPlugin.INSTANCE
			.getString("_UI_ImportPrimitiveTypeActionCommand_label"); //$NON-NLS-1$
	}

}
