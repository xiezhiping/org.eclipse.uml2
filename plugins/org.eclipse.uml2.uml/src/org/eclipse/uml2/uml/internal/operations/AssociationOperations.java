/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756, 491718
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Association</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateSpecializedEndNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Number</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateSpecializedEndTypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialized End Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateBinaryAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binary Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateAssociationEnds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Association Ends</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#validateEndsMustBeTyped(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ends Must Be Typed</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#isBinary() <em>Is Binary</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Association#getEndTypes() <em>Get End Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Association specializing another Association has the same number of ends as the other Association.
	 * parents()->select(oclIsKindOf(Association)).oclAsType(Association)->forAll(p | p.memberEnd->size() = self.memberEnd->size())
	 * @param association The receiving '<em><b>Association</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSpecializedEndNumber(Association association,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		int memberEndsSize = association.getMemberEnds().size();

		for (Classifier general : association.getGenerals()) {

			if (general instanceof Association && ((Association) general)
				.getMemberEnds().size() != memberEndsSize) {

				result = false;

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ASSOCIATION__SPECIALIZED_END_NUMBER,
						UMLPlugin.INSTANCE.getString(
							"_UI_Association_SpecializedEndNumber_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, association,
								general)),
						new Object[]{association}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When an Association specializes another Association, every end of the specific Association corresponds to an end of the general Association, and the specific end reaches the same type or a subtype of the corresponding general end.
	 * Sequence{1..memberEnd->size()}->
	 * 	forAll(i | general->select(oclIsKindOf(Association)).oclAsType(Association)->
	 * 		forAll(ga | self.memberEnd->at(i).type.conformsTo(ga.memberEnd->at(i).type)))
	 * @param association The receiving '<em><b>Association</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSpecializedEndTypes(Association association,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		EList<Property> memberEnds = association.getMemberEnds();

		for (Classifier general : association.getGenerals()) {

			if (general instanceof Association) {
				EList<Property> generalMemberEnds = ((Association) general)
					.getMemberEnds();

				for (int i = 0; i < memberEnds.size()
					&& i < generalMemberEnds.size(); i++) {

					Type memberEndType = memberEnds.get(i).getType();
					Type generalMemberEndType = generalMemberEnds.get(i)
						.getType();

					if (memberEndType != null && generalMemberEndType != null
						&& !memberEndType.conformsTo(generalMemberEndType)) {

						result = false;

						if (diagnostics != null) {
							diagnostics.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.ASSOCIATION__SPECIALIZED_END_TYPES,
								UMLPlugin.INSTANCE.getString(
									"_UI_Association_SpecializedEndTypes_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										association, general)),
								new Object[]{association}));
						}

						break;
					}
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only binary Associations can be aggregations.
	 * memberEnd->exists(aggregation <> AggregationKind::none) implies (memberEnd->size() = 2 and memberEnd->exists(aggregation = AggregationKind::none))
	 * @param association The receiving '<em><b>Association</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBinaryAssociations(Association association,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ASSOCIATION__BINARY_ASSOCIATIONS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateBinaryAssociations", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(association, context)}),
					new Object[]{association}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ends of Associations with more than two ends must be owned by the Association itself.
	 * memberEnd->size() > 2 implies ownedEnd->includesAll(memberEnd)
	 * @param association The receiving '<em><b>Association</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociationEnds(Association association,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ASSOCIATION__ASSOCIATION_ENDS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateAssociationEnds", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(association, context)}),
					new Object[]{association}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * memberEnd->forAll(type->notEmpty())
	 * @param association The receiving '<em><b>Association</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEndsMustBeTyped(Association association,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ASSOCIATION__ENDS_MUST_BE_TYPED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateEndsMustBeTyped", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(association, context)}),
					new Object[]{association}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this association is a binary association, i.e. whether it has exactly two member ends.
	 * @param association The receiving '<em><b>Association</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isBinary(Association association) {
		return association.getMemberEnds().size() == 2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * endType is derived from the types of the member ends.
	 * result = (memberEnd->collect(type)->asSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param association The receiving '<em><b>Association</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Type> getEndTypes(Association association) {
		EList<Type> endTypes = new UniqueEList.FastCompare<Type>();

		for (Property memberEnd : association.getMemberEnds()) {
			Type endType = (Type) memberEnd
				.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE, false);

			if (endType != null) {
				endTypes.add(endType);
			}
		}

		return new UnionEObjectEList<Type>((InternalEObject) association,
			UMLPackage.Literals.ASSOCIATION__END_TYPE, endTypes.size(),
			endTypes.toArray());
	}

} // AssociationOperations