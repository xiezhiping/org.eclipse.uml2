/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.UseCase;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Actor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Actor#validateAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Actor#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Have Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorOperations
		extends BehavioredClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorOperations() {
		super();
	}

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
	 * @param actor The receiving '<em><b>Actor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateAssociations(Actor actor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		for (Association association : actor.getAssociations()) {
			Property otherEnd = association.getMemberEnd(null, actor)
				.getOtherEnd();
			Type otherEndType = otherEnd == null
				? null
				: otherEnd.getType();

			if (!(otherEndType instanceof UseCase || (otherEndType instanceof org.eclipse.uml2.uml.Class && !(otherEndType instanceof Behavior)))) {
				result &= false;

				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ACTOR__ASSOCIATIONS,
						UMLPlugin.INSTANCE
							.getString(
								"_UI_Actor_Associations_diagnostic", getMessageSubstitutions(context, actor, association)), //$NON-NLS-1$
						new Object[]{actor, association}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor must have a name.
	 * name->notEmpty()
	 * @param actor The receiving '<em><b>Actor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMustHaveName(Actor actor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = !isEmpty(actor.getName());

		if (!result && diagnostics != null) {
			diagnostics
				.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ACTOR__MUST_HAVE_NAME,
					UMLPlugin.INSTANCE
						.getString(
							"_UI_Actor_MustHaveName_diagnostic", getMessageSubstitutions(context, actor)), //$NON-NLS-1$
					new Object[]{actor}));
		}

		return result;
	}

} // ActorOperations