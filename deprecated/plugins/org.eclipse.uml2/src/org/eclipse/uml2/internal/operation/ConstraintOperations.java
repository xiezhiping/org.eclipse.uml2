/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConstraintOperations.java,v 1.6 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.UML2Plugin;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Constraint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Constraint#validateNotApplyToSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Apply To Self</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ConstraintOperations extends UML2Operations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConstraintOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * A constraint cannot be applied to itself.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * not constrainedElement->includes(self)
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNotApplyToSelf(Constraint constraint, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (constraint.getConstrainedElements().contains(constraint)) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.CONSTRAINT__NOT_APPLY_TO_SELF,
					UML2Plugin.INSTANCE.getString(
						"_UI_Constraint_NotApplyToSelf_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, constraint)),
					new Object[]{constraint}));
			}
		}

		return result;
	}

} // ConstraintOperations
