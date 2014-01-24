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
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Actor specifies a role played by a user or any other system that interacts with the subject.
 * <p>From package UML::UseCases.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActor()
 * @model
 * @generated
 */
public interface Actor
		extends BehavioredClassifier {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Actor can only have Associations to UseCases, Components, and Classes. Furthermore these Associations must be binary.
	 * Association.allInstances()->forAll( a |
	 *   a.memberEnd->collect(type)->includes(self) implies
	 *   (
	 *     a.memberEnd->size() = 2 and
	 *     let actorEnd : Property = a.memberEnd->any(type = self) in
	 *       actorEnd.opposite.class.oclIsKindOf(UseCase) or
	 *       ( actorEnd.opposite.class.oclIsKindOf(Class) and not
	 *          actorEnd.opposite.class.oclIsKindOf(Behavior))
	 *       )
	 *   )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociations(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Actor must have a name.
	 * name->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustHaveName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Actor
