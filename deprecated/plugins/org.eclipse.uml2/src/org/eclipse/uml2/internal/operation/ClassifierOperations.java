/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ClassifierOperations.java,v 1.11 2005/05/31 17:36:00 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.Usage;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateInheritedMember(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#inheritedMember() <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#allParents() <em>All Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#inheritableMembers(org.eclipse.uml2.Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#hasVisibilityOf(org.eclipse.uml2.NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#inherit(java.util.Set) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#maySpecializeType(org.eclipse.uml2.Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#general() <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#validateGeneralEqualsParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Equals Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#conformsTo(org.eclipse.uml2.Classifier) <em>Conforms To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ClassifierOperations extends UML2Operations {

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
	private ClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * member->select(oclIsKindOf(Feature))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set allFeatures(Classifier classifier) {
		Set allFeatures = new HashSet();

		for (Iterator members = classifier.getMembers().iterator(); members
			.hasNext();) {

			NamedElement member = (NamedElement) members.next();

			if (Feature.class.isInstance(member)) {
				allFeatures.add(member);
			}
		}

		return Collections.unmodifiableSet(allFeatures);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier
	 * can not be both a transitively general and transitively specific
	 * classifier of the same classifier.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * not self.allParents()->includes(self)
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNoCyclesInGeneralization(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (classifier.allParents().contains(classifier)) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
					UML2Plugin.INSTANCE.getString(
						"_UI_Classifier_NoCyclesInGeneralization_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, classifier)),
					new Object[]{classifier}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * A classifier may only specialize classifiers of a valid type.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.parents()->forAll(c | self.maySpecializeType(c))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSpecializeType(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			Classifier parent = (Classifier) parents.next();

			if (!classifier.maySpecializeType(parent)) {
				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UML2Validator.DIAGNOSTIC_SOURCE,
						UML2Validator.CLASSIFIER__SPECIALIZE_TYPE,
						UML2Plugin.INSTANCE.getString(
							"_UI_Classifier_SpecializeType_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context,
								classifier, parent)), new Object[]{classifier,
							parent}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * The inherited members are derived by inheriting the inheritable members
	 * of the parents.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.inheritedMember->includesAll(self.inherit(self.parents()->collect(p | p.inheritableMembers(self)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateInheritedMember(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		Set inheritedMember = new HashSet();

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			inheritedMember.addAll(((Classifier) parents.next())
				.inheritableMembers(classifier));
		}

		if (!classifier.inheritedMember().containsAll(
			classifier.inherit(inheritedMember))) {

			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.CLASSIFIER__INHERITED_MEMBER,
					UML2Plugin.INSTANCE.getString(
						"_UI_Classifier_InheritedMember_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, classifier)),
					new Object[]{classifier}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.inherit(self.parents()->collect(p | p.inheritableMembers(self))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set inheritedMember(Classifier classifier) {
		Set inheritedMember = new HashSet();

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			inheritedMember.addAll(((Classifier) parents.next())
				.inheritableMembers(classifier));
		}

		return classifier.inherit(inheritedMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * generalization.general
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set parents(Classifier classifier) {
		Set parents = new HashSet();

		for (Iterator generalizations = classifier.getGeneralizations()
			.iterator(); generalizations.hasNext();) {

			Classifier general = ((Generalization) generalizations.next())
				.getGeneral();

			if (null != general) {
				parents.add(general);
			}
		}

		return Collections.unmodifiableSet(parents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.parents()->union(self.parents()->collect(p | p.allParents())
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set allParents(Classifier classifier) {
		Set allParents = new HashSet();

		allParentsHelper(classifier, allParents);

		return Collections.unmodifiableSet(allParents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * member->select(m | c.hasVisibilityOf(m))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set inheritableMembers(Classifier classifier, Classifier c) {
		Set inheritableMembers = new HashSet();

		if (classifier == c || !c.allParents().contains(classifier)
			|| classifier.allParents().contains(c)) {

			return inheritableMembers;
		}

		for (Iterator members = classifier.getMembers().iterator(); members
			.hasNext();) {

			NamedElement member = (NamedElement) members.next();

			if (c.hasVisibilityOf(member)) {
				inheritableMembers.add(member);
			}
		}

		return Collections.unmodifiableSet(inheritableMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * true
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean hasVisibilityOf(Classifier classifier, NamedElement n) {

		for (Iterator allParents = classifier.allParents().iterator(); allParents
			.hasNext();) {

			if (((Classifier) allParents.next()).getMembers().contains(n)) {
				return VisibilityKind.PRIVATE_LITERAL != n.getVisibility();
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * inhs
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set inherit(Classifier classifier, Set inhs) {
		return Collections.unmodifiableSet(inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.oclIsKindOf(c.oclType)
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean maySpecializeType(Classifier classifier, Classifier c) {
		return c.eClass().isSuperTypeOf(classifier.eClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.parents()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set general(Classifier classifier) {
		return classifier.parents();
	}

	/**
	 * <!-- begin-user-doc -->
	 * The general classifiers are the classifiers referenced by the
	 * generalization relationships.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * general = self.parents()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateGeneralEqualsParents(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (!classifier.general().equals(classifier.parents())) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.CLASSIFIER__GENERAL_EQUALS_PARENTS,
					UML2Plugin.INSTANCE.getString(
						"_UI_Classifier_GeneralEqualsParents_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, classifier)),
					new Object[]{classifier}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (self=other) or (self.allParents()->includes(other))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean conformsTo(Classifier classifier, Classifier other) {
		return classifier == other || classifier.allParents().contains(other);
	}

	// <!-- begin-custom-operations -->

	protected static void allParentsHelper(Classifier classifier, Set allParents) {

		for (Iterator parents = classifier.parents().iterator(); parents
			.hasNext();) {

			Classifier parent = (Classifier) parents.next();

			if (!allParents.contains(parent)) {
				allParents.add(parent);

				allParentsHelper(parent, allParents);
			}
		}

	}

	/**
	 * Creates a generalization between the specified classifier and the
	 * specified general classifier.
	 * 
	 * @param classifier
	 *            The classifier from which to create a generalization.
	 * @param generalClassifier
	 *            The classifier to which to create a generalization.
	 * @return The new generalization.
	 * @exception IllegalArgumentException
	 *                If either of the classifiers is already a direct or
	 *                indirect parent of the other.
	 */
	public static Generalization createGeneralization(Classifier classifier,
			Classifier generalClassifier) {

		if (null == classifier) {
			throw new IllegalArgumentException(String.valueOf(classifier));
		}

		if (null == generalClassifier
			|| classifier.allParents().contains(generalClassifier)
			|| generalClassifier.allParents().contains(classifier)) {

			throw new IllegalArgumentException(String
				.valueOf(generalClassifier));
		}

		Generalization generalization = classifier.createGeneralization();
		generalization.setGeneral(generalClassifier);

		return generalization;
	}

	/**
	 * Retrieves the interfaces on which the specified classifier has a usage
	 * dependency.
	 * 
	 * @param classifier
	 *            The classfier for which to retrieve the useed interfaces.
	 * @return The interfaces used by the specified classifier.
	 */
	public static Set getUsedInterfaces(Classifier classifier) {
		Set usedInterfaces = new HashSet();

		if (null != classifier) {

			for (Iterator clientDependencies = classifier
				.getClientDependencies().iterator(); clientDependencies
				.hasNext();) {

				Dependency clientDependency = (Dependency) clientDependencies
					.next();

				if (Usage.class.isInstance(clientDependency)) {

					for (Iterator suppliers = clientDependency.getSuppliers()
						.iterator(); suppliers.hasNext();) {

						NamedElement supplier = (NamedElement) suppliers.next();

						if (Interface.class.isInstance(supplier)) {
							usedInterfaces.add(supplier);
						}
					}
				}
			}
		}

		return usedInterfaces;
	}

	// <!-- end-custom-operations -->

} // ClassifierOperations