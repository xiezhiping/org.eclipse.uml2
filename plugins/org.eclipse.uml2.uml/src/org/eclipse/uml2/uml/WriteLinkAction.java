/*
 * Copyright (c) 2005, 2014 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteLinkAction is an abstract class for LinkActions that create and destroy links.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getWriteLinkAction()
 * @model abstract="true"
 * @generated
 */
public interface WriteLinkAction
		extends LinkAction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of at least one end must allow access from the context Classifier of the WriteLinkAction.
	 * endData.end->exists(end |
	 *   end.type=_'context' or
	 *   end.visibility=VisibilityKind::public or 
	 *   end.visibility=VisibilityKind::protected and
	 *   endData.end->exists(other | 
	 *     other<>end and _'context'.conformsTo(other.type.oclAsType(Classifier))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAllowAccess(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // WriteLinkAction
