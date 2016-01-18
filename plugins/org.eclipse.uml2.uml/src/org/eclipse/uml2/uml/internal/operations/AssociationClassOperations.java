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

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Association Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AssociationClass#validateCannotBeDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Defined</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AssociationClass#validateDisjointAttributesEnds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disjoint Attributes Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationClassOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationClassOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AssociationClass cannot be defined between itself and something else.
	 * self.endType()->excludes(self) and self.endType()->collect(et|et.oclAsType(Classifier).allParents())->flatten()->excludes(self)
	 * @param associationClass The receiving '<em><b>Association Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateCannotBeDefined(
			AssociationClass associationClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (Type endType : associationClass.getEndTypes()) {

			if (endType == associationClass
				|| (endType instanceof Classifier && ((Classifier) endType)
					.allParents().contains(associationClass))) {

				result = false;
				break;
			}
		}

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.ASSOCIATION_CLASS__CANNOT_BE_DEFINED,
				UMLPlugin.INSTANCE.getString(
					"_UI_AssociationClass_CannotBeDefined_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, associationClass)),
				new Object[]{associationClass}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owned attributes and owned ends of an AssociationClass are disjoint.
	 * ownedAttribute->intersection(ownedEnd)->isEmpty()
	 * @param associationClass The receiving '<em><b>Association Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateDisjointAttributesEnds(
			AssociationClass associationClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = Collections.disjoint(
			associationClass.getOwnedAttributes(),
			associationClass.getOwnedEnds());

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.ASSOCIATION_CLASS__DISJOINT_ATTRIBUTES_ENDS,
				UMLPlugin.INSTANCE.getString(
					"_UI_AssociationClass_DisjointAttributesEnds_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, associationClass)),
				new Object[]{associationClass}));
		}

		return result;
	}

} // AssociationClassOperations