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
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Use Case</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateNoAssociationToUseCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Association To Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateCannotIncludeSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Include Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Have Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.UseCase#allIncludedUseCases() <em>All Included Use Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseOperations
		extends BehavioredClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UseCase must have a name.
	 * name -> notEmpty ()
	 * @param useCase The receiving '<em><b>Use Case</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMustHaveName(UseCase useCase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (isEmpty(useCase.getName())) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.USE_CASE__MUST_HAVE_NAME,
					UMLPlugin.INSTANCE.getString(
						"_UI_UseCase_MustHaveName_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, useCase)),
					new Object[]{useCase}));
			}

			return false;
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases can only be involved in binary Associations.
	 * Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies a.memberEnd->size() = 2)
	 * @param useCase The receiving '<em><b>Use Case</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateBinaryAssociations(UseCase useCase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		for (Association association : useCase.getAssociations()) {

			if (!association.isBinary()) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.USE_CASE__BINARY_ASSOCIATIONS,
						UMLPlugin.INSTANCE.getString(
							"_UI_UseCase_BinaryAssociations_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, useCase)),
						new Object[]{useCase}));
				}

				return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseCases cannot have Associations to UseCases specifying the same subject.
	 * Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies 
	 *    (
	 *    let usecases: Set(UseCase) = a.memberEnd.type->select(oclIsKindOf(UseCase))->collect(oclAsType(UseCase))->asSet() in
	 *    usecases->size() > 1 implies usecases->collect(subject)->size() > 1
	 *    )
	 * )
	 * @param useCase The receiving '<em><b>Use Case</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNoAssociationToUseCase(UseCase useCase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		for (Association association : useCase.getAssociations()) {
			EList<Type> endTypes = association.getEndTypes();

			if (endTypes.size() == 2) {
				Type end1 = endTypes.get(0);
				Type end2 = endTypes.get(1);

				if (end1 instanceof UseCase && end2 instanceof UseCase) {
					UseCase useCase1 = (UseCase) end1;
					UseCase useCase2 = (UseCase) end2;

					EList<Classifier> subjects = new UniqueEList.FastCompare<Classifier>(
						useCase1.getSubjects());
					subjects.retainAll(useCase2.getSubjects());

					if (!subjects.isEmpty()) {

						if (diagnostics != null) {
							diagnostics.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.USE_CASE__NO_ASSOCIATION_TO_USE_CASE,
								UMLPlugin.INSTANCE.getString(
									"_UI_UseCase_NoAssociationToUseCase_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, useCase1,
										useCase2)),
								new Object[]{useCase1, useCase2}));
						}

						return false;
					}
				}
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UseCase cannot include UseCases that directly or indirectly include it.
	 * not allIncludedUseCases()->includes(self)
	 * @param useCase The receiving '<em><b>Use Case</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateCannotIncludeSelf(UseCase useCase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (useCase.allIncludedUseCases().contains(useCase)) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.USE_CASE__CANNOT_INCLUDE_SELF,
					UMLPlugin.INSTANCE.getString(
						"_UI_UseCase_CannotIncludeSelf_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, useCase)),
					new Object[]{useCase}));
			}

			return false;
		}

		return true;
	}

	protected static EList<UseCase> allIncludedUseCases(UseCase useCase,
			EList<UseCase> allIncludedUseCases) {

		for (Include include : useCase.getIncludes()) {
			UseCase addition = include.getAddition();

			if (addition != null && allIncludedUseCases.add(addition)) {
				allIncludedUseCases(addition, allIncludedUseCases);
			}
		}

		return allIncludedUseCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allIncludedUseCases() returns the transitive closure of all UseCases (directly or indirectly) included by this UseCase.
	 * result = (self.include.addition->union(self.include.addition->collect(uc | uc.allIncludedUseCases()))->asSet())
	 * <p>From package UML::UseCases.</p>
	 * @param useCase The receiving '<em><b>Use Case</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<UseCase> allIncludedUseCases(UseCase useCase) {
		return ECollections.unmodifiableEList(allIncludedUseCases(useCase,
			new UniqueEList.FastCompare<UseCase>()));
	}

} // UseCaseOperations
