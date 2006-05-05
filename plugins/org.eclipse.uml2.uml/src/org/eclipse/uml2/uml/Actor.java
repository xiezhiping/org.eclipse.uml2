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
 * $Id: Actor.java,v 1.3 2006/05/05 19:36:07 khussey Exp $
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
 * An Actor models a type of role played by an entity that interacts with the subject (e.g., by exchanging signals and data), but which is external to the subject (i.e., in the sense that an instance of an actor is not a part of the instance of its corresponding subject). Actors may represent roles played by human users, external hardware, or other subjects. 
 * Note that an actor does not necessarily represent a specific physical entity but merely a particular facet (i.e., role) of some entity that is relevant to the specification of its associated use cases. Thus, a single physical instance may play the role of several different actors and, conversely, a given actor may be played by multiple different instances.
 * 
 * Since an actor is external to the subject, it is typically defined in the same classifier or package that incorporates the subject classifier.
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
	 * An actor can only have associations to use cases, components and classes. Furthermore these associations must be binary.
	 * self.ownedAttribute->forAll ( a |
	 * (a.association->notEmpty()) implies
	 * ((a.association.memberEnd.size() = 2) and
	 * (a.opposite.class.oclIsKindOf(UseCase) or
	 * (a.opposite.class.oclIsKindOf(Class) and not a.opposite.class.oclIsKindOf(Behavior))))
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociations(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor must have a name.
	 * name->notEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustHaveName(DiagnosticChain diagnostics, Map context);

} // Actor
