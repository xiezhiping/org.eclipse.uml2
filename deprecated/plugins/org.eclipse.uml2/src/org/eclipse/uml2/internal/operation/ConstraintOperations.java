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
 * $Id: ConstraintOperations.java,v 1.1 2004/04/27 13:56:09 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.UML2DiagnosticConstants;
import org.eclipse.uml2.UML2Plugin;


/**
 * A static utility class that provides operations related to constraints.
 */
public final class ConstraintOperations
	extends UML2Operations {

	/**
	 * Constructs a new Constraint Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ConstraintOperations() {
		super();
	}

	public static boolean validateNotApplyToSelf(Constraint constraint,
			DiagnosticChain diagnostics, Map data) {
		boolean result = true;

		if (constraint.getConstrainedElements().contains(constraint)) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.CONSTRAINT__NOT_APPLY_TO_SELF,
							UML2Plugin.INSTANCE
								.getString("_UI_Constraint_NotApplyToSelf_message"), //$NON-NLS-1$
							null));
			}
		}
		return result;
	}

}