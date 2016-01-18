/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Redefinable Template Signature</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#validateRedefinesParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefines Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getInheritedParameters() <em>Get Inherited Parameters</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedefinableTemplateSignatureOperations
		extends RedefinableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableTemplateSignatureOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If any of the parent Classifiers are a template, then the extendedSignature must include the signature of that Classifier.
	 * classifier.allParents()->forAll(c | c.ownedTemplateSignature->notEmpty() implies self->closure(extendedSignature)->includes(c.ownedTemplateSignature))
	 * @param redefinableTemplateSignature The receiving '<em><b>Redefinable Template Signature</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRedefinesParents(
			RedefinableTemplateSignature redefinableTemplateSignature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINES_PARENTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRedefinesParents", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(redefinableTemplateSignature,
									context)}),
					new Object[]{redefinableTemplateSignature}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for RedefinableTemplateSignature::/inheritedParameter
	 * result = (if extendedSignature->isEmpty() then Set{} else extendedSignature.parameter->asSet() endif)
	 * <p>From package UML::Classification.</p>
	 * @param redefinableTemplateSignature The receiving '<em><b>Redefinable Template Signature</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<TemplateParameter> getInheritedParameters(
			RedefinableTemplateSignature redefinableTemplateSignature) {
		EList<TemplateParameter> inheritedParameters = new UniqueEList.FastCompare<TemplateParameter>();

		for (Iterator<RedefinableTemplateSignature> extendedSignatures = redefinableTemplateSignature
			.getExtendedSignatures().iterator(); extendedSignatures
				.hasNext();) {

			inheritedParameters.addAll(
				((InternalEList<TemplateParameter>) (extendedSignatures.next())
					.getParameters()).basicList());
		}

		return new UnionEObjectEList<TemplateParameter>(
			(InternalEObject) redefinableTemplateSignature,
			UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER,
			inheritedParameters.size(), inheritedParameters.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two RedefinableTemplateSignatures in a context in which redefinition is possible, whether redefinition would be logically consistent. A redefining template signature is always consistent with a redefined template signature, as redefinition only adds new formal parameters.
	 * result = (redefiningElement.oclIsKindOf(RedefinableTemplateSignature))
	 * <p>From package UML::Classification.</p>
	 * @param redefinableTemplateSignature The receiving '<em><b>Redefinable Template Signature</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(
			RedefinableTemplateSignature redefinableTemplateSignature,
			RedefinableElement redefiningElement) {
		return redefiningElement instanceof RedefinableTemplateSignature;
	}

} // RedefinableTemplateSignatureOperations