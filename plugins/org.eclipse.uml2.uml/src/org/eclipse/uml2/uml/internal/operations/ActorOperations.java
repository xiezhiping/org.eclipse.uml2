/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Actor#validateAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Actor#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Have Name</em>}</li>
 * </ul>
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
			result &= association.isBinary();

			if (result) {
				Property actorEnd = association.getMemberEnd(null, actor)
					.getOtherEnd();
				Type actorEndType = actorEnd == null
					? null
					: actorEnd.getType();

				result &= actorEndType instanceof UseCase
					|| (actorEndType instanceof org.eclipse.uml2.uml.Class
						&& !(actorEndType instanceof Behavior));
			}

			if (!result) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ACTOR__ASSOCIATIONS,
						UMLPlugin.INSTANCE.getString(
							"_UI_Actor_Associations_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, actor,
								association)),
						new Object[]{actor, association}));
				}

				break;
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Actor must have a name.
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
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.ACTOR__MUST_HAVE_NAME,
				UMLPlugin.INSTANCE.getString(
					"_UI_Actor_MustHaveName_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, actor)),
				new Object[]{actor}));
		}

		return result;
	}

} // ActorOperations