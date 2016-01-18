/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 394623, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#conformsTo(org.eclipse.uml2.uml.Type) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maps To Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNonFinalParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Final Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllAttributes() <em>Get All Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllOperations() <em>Get All Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces() <em>Get All Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperations() <em>Get Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getUsedInterfaces() <em>Get Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allParents() <em>All Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>Get Generals</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#hasVisibilityOf(org.eclipse.uml2.uml.NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inheritableMembers(org.eclipse.uml2.uml.Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers() <em>Get Inherited Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#maySpecializeType(org.eclipse.uml2.uml.Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#directlyRealizedInterfaces() <em>Directly Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#directlyUsedInterfaces() <em>Directly Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allRealizedInterfaces() <em>All Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allUsedInterfaces() <em>All Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isSubstitutableFor(org.eclipse.uml2.uml.Classifier) <em>Is Substitutable For</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allAttributes() <em>All Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allSlottableFeatures() <em>All Slottable Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierOperations
		extends NamespaceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a Classifier that defines a type that conforms to another. This is used, for example, in the specification of signature conformance for operations.
	 * result = (if other.oclIsKindOf(Classifier) then
	 *   let otherClassifier : Classifier = other.oclAsType(Classifier) in
	 *     self = otherClassifier or allParents()->includes(otherClassifier)
	 * else
	 *   false
	 * endif)
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean conformsTo(Classifier classifier, Type other) {
		return other instanceof Classifier
			&& (classifier == other || classifier.allParents().contains(other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A Classifier can not be both a transitively general and transitively specific Classifier of the same Classifier.
	 * not allParents()->includes(self)
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNoCyclesInGeneralization(
			Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		if (classifier.allParents().contains(classifier)) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
					UMLPlugin.INSTANCE.getString(
						"_UI_Classifier_NoCyclesInGeneralization_diagnostic", //$NON-NLS-1$
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
	 * A Classifier may only specialize Classifiers of a valid type.
	 * parents()->forAll(c | self.maySpecializeType(c))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSpecializeType(Classifier classifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		for (Classifier parent : classifier.parents()) {

			if (!classifier.maySpecializeType(parent)) {
				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.CLASSIFIER__SPECIALIZE_TYPE,
							UMLPlugin.INSTANCE.getString(
								"_UI_Classifier_SpecializeType_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, classifier,
									parent)),
						new Object[]{classifier, parent}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances also be its subclasses.
	 * powertypeExtent->forAll( gs | 
	 *   gs.generalization->forAll( gen | 
	 *     not (gen.general = self) and not gen.general.allParents()->includes(self) and not (gen.specific = self) and not self.allParents()->includes(gen.specific) 
	 *   ))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMapsToGeneralizationSet(Classifier classifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER__MAPS_TO_GENERALIZATION_SET,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMapsToGeneralizationSet", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifier, context)}),
					new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parents of a Classifier must be non-final.
	 * parents()->forAll(not isFinalSpecialization)
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonFinalParents(Classifier classifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER__NON_FINAL_PARENTS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNonFinalParents", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(classifier, context)}),
					new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the attributes of this classifier, including those inherited from its parents.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Property> getAllAttributes(Classifier classifier) {
		EList<Property> allAttributes = new UniqueEList.FastCompare<Property>();

		for (Feature feature : classifier.allFeatures()) {

			if (feature instanceof Property) {
				allAttributes.add((Property) feature);
			}
		}

		return ECollections.unmodifiableEList(allAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the operations of this classifier.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Operation> getOperations(Classifier classifier) {
		EList<Operation> operations = new UniqueEList.FastCompare<Operation>();

		for (Feature feature : classifier.getFeatures()) {

			if (feature instanceof Operation) {
				operations.add((Operation) feature);
			}
		}

		return ECollections.unmodifiableEList(operations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the operations of this classifier, including those inherited from its parents.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Operation> getAllOperations(Classifier classifier) {
		EList<Operation> allOperations = new UniqueEList.FastCompare<Operation>();

		for (Feature feature : classifier.allFeatures()) {

			if (feature instanceof Operation) {
				allOperations.add((Operation) feature);
			}
		}

		return ECollections.unmodifiableEList(allOperations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation getOperation(Classifier classifier, String name,
			EList<String> parameterNames, EList<Type> parameterTypes) {
		return classifier.getOperation(name, parameterNames, parameterTypes,
			false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier, ignoring case if indicated.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * @param ignoreCase Whether to ignore case in String comparisons.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation getOperation(Classifier classifier, String name,
			EList<String> parameterNames, EList<Type> parameterTypes,
			boolean ignoreCase) {
		operationLoop : for (Operation operation : classifier.getOperations()) {

			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(operation.getName())
				: name.equals(operation.getName())))

				continue operationLoop;

			EList<Parameter> ownedParameterList = operation
				.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();

			if (parameterNames != null
				&& parameterNames.size() != ownedParameterListSize
				|| (parameterTypes != null
					&& parameterTypes.size() != ownedParameterListSize))

				continue operationLoop;

			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);

				if (parameterNames != null && !(ignoreCase
					? parameterNames.get(j)
						.equalsIgnoreCase(ownedParameter.getName())
					: parameterNames.get(j).equals(ownedParameter.getName())))

					continue operationLoop;

				if (parameterTypes != null
					&& !parameterTypes.get(j).equals(ownedParameter.getType()))

					continue operationLoop;
			}

			return operation;
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this classifier has a usage dependency.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getUsedInterfaces(Classifier classifier) {
		return directlyUsedInterfaces(classifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this classifier or any of its parents has a usage dependency.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getAllUsedInterfaces(Classifier classifier) {
		return allUsedInterfaces(classifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = (self.oclIsKindOf(c.oclType()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean maySpecializeType(Classifier classifier,
			Classifier c) {
		return c.eClass().isSuperTypeOf(classifier.eClass());
	}

	protected static class GeneralEList
			extends DerivedSubsetEObjectEList<Object> {

		protected GeneralEList(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		@Override
		public List<Object> basicList() {
			return new GeneralEList(dataClass, owner, featureID,
				sourceFeatureIDs) {

				@Override
				public ListIterator<Object> listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		@Override
		protected boolean isIncluded(EStructuralFeature feature) {
			return false;
		}

		@Override
		protected Object derive(Object object) {
			return ((Generalization) object).getGeneral();
		}

		@Override
		protected Object validate(int index, Object object) {
			Generalization generalization = UMLFactory.eINSTANCE
				.createGeneralization();
			generalization
				.setGeneral((Classifier) super.validate(index, object));
			return generalization;
		}

	}

	protected static final int[] GENERAL_ESUPERSETS = new int[]{
		UMLPackage.CLASSIFIER__GENERALIZATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general Classifiers are the ones referenced by the Generalization relationships.
	 * result = (parents())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public static EList<Classifier> getGenerals(Classifier classifier) {
		return (EList<Classifier>) ((EList<?>) new GeneralEList(
			Classifier.class, (InternalEObject) classifier,
			UMLPackage.CLASSIFIER__GENERAL, GENERAL_ESUPERSETS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inheritedMember association is derived by inheriting the inheritable members of the parents.
	 * result = (inherit(parents()->collect(inheritableMembers(self))->asSet()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> getInheritedMembers(
			Classifier classifier) {
		EList<NamedElement> inheritedMembers = new UniqueEList.FastCompare<NamedElement>();

		for (Classifier parent : classifier.parents()) {
			inheritedMembers.addAll(parent.inheritableMembers(classifier));
		}

		EList<NamedElement> inherit = classifier.inherit(inheritedMembers);

		return new UnionEObjectEList<NamedElement>((InternalEObject) classifier,
			UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER, inherit.size(),
			inherit.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the Features in the namespace of the Classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * result = (member->select(oclIsKindOf(Feature))->collect(oclAsType(Feature))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Feature> allFeatures(Classifier classifier) {
		EList<Feature> allFeatures = new UniqueEList.FastCompare<Feature>();

		for (NamedElement member : classifier.getMembers()) {

			if (member instanceof Feature) {
				allFeatures.add((Feature) member);
			}
		}

		return ECollections.unmodifiableEList(allFeatures);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * result = (generalization.general->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Classifier> parents(Classifier classifier) {
		EList<Classifier> parents = new UniqueEList.FastCompare<Classifier>();

		for (Generalization generalization : classifier.getGeneralizations()) {
			Classifier general = generalization.getGeneral();

			if (general != null) {
				parents.add(general);
			}
		}

		return ECollections.unmodifiableEList(parents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly realized by this Classifier
	 * result = ((clientDependency->
	 *   select(oclIsKindOf(Realization) and supplier->forAll(oclIsKindOf(Interface))))->
	 *       collect(supplier.oclAsType(Interface))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> directlyRealizedInterfaces(
			Classifier classifier) {
		return ECollections
			.unmodifiableEList(directlyRealizedInterfaces(classifier, true));
	}

	protected static EList<Interface> directlyRealizedInterfaces(
			Classifier classifier, boolean resolve) {
		return directlyRealizedInterfaces(classifier, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> directlyRealizedInterfaces(
			Classifier classifier, boolean resolve,
			EList<Interface> realizedInterfaces) {

		for (Dependency clientDependency : classifier.getClientDependencies()) {

			if (clientDependency instanceof Realization) {
				Iterator<NamedElement> suppliers = resolve
					? clientDependency.getSuppliers().iterator()
					: ((InternalEList<NamedElement>) clientDependency
						.getSuppliers()).basicIterator();

				while (suppliers.hasNext()) {
					NamedElement supplier = suppliers.next();

					if (supplier instanceof Interface) {
						realizedInterfaces.add((Interface) supplier);
					}
				}
			}
		}

		return realizedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly used by this Classifier
	 * result = ((supplierDependency->
	 *   select(oclIsKindOf(Usage) and client->forAll(oclIsKindOf(Interface))))->
	 *     collect(client.oclAsType(Interface))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> directlyUsedInterfaces(
			Classifier classifier) {
		return ECollections
			.unmodifiableEList(directlyUsedInterfaces(classifier, true));
	}

	protected static EList<Interface> directlyUsedInterfaces(
			Classifier classifier, boolean resolve) {
		return directlyUsedInterfaces(classifier, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> directlyUsedInterfaces(
			Classifier classifier, boolean resolve,
			EList<Interface> usedInterfaces) {

		for (Dependency clientDependency : classifier.getClientDependencies()) {

			if (clientDependency instanceof Usage) {
				Iterator<NamedElement> suppliers = resolve
					? clientDependency.getSuppliers().iterator()
					: ((InternalEList<NamedElement>) clientDependency
						.getSuppliers()).basicIterator();

				while (suppliers.hasNext()) {
					NamedElement supplier = suppliers.next();

					if (supplier instanceof Interface) {
						usedInterfaces.add((Interface) supplier);
					}
				}
			}
		}

		return usedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces realized by this Classifier and all of its generalizations
	 * result = (directlyRealizedInterfaces()->union(self.allParents()->collect(directlyRealizedInterfaces()))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> allRealizedInterfaces(
			Classifier classifier) {
		return allRealizedInterfaces(classifier, true,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> allRealizedInterfaces(
			Classifier classifier, boolean resolve,
			EList<Interface> allRealizedInterfaces) {
		directlyRealizedInterfaces(classifier, resolve, allRealizedInterfaces);

		for (Classifier parent : classifier.allParents()) {
			directlyRealizedInterfaces(parent, resolve, allRealizedInterfaces);
		}

		return allRealizedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces used by this Classifier and all of its generalizations
	 * result = (directlyUsedInterfaces()->union(self.allParents()->collect(directlyUsedInterfaces()))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> allUsedInterfaces(Classifier classifier) {
		return allUsedInterfaces(classifier, true,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> allUsedInterfaces(Classifier classifier,
			boolean resolve, EList<Interface> allUsedInterfaces) {
		directlyUsedInterfaces(classifier, resolve, allUsedInterfaces);

		for (Classifier parent : classifier.allParents()) {
			directlyUsedInterfaces(parent, resolve, allUsedInterfaces);
		}

		return allUsedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = (substitution.contract->includes(contract))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isSubstitutableFor(Classifier classifier,
			Classifier contract) {

		for (Substitution subsitution : classifier.getSubstitutions()) {

			if (subsitution.getContract() == contract) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allAttributes gives an ordered set of all owned and inherited attributes of the Classifier. All owned attributes appear before any inherited attributes, and the attributes inherited from any more specific parent Classifier appear before those of any more general parent Classifier. However, if the Classifier has multiple immediate parents, then the relative ordering of the sets of attributes from those parents is not defined.
	 * result = (attribute->asSequence()->union(parents()->asSequence().allAttributes())->select(p | member->includes(p))->asOrderedSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Property> allAttributes(Classifier classifier) {
		EList<Property> allAttributes = new UniqueEList.FastCompare<Property>(
			classifier.getAttributes());

		for (Classifier parent : classifier.parents()) {
			allAttributes.addAll(parent.allAttributes());
		}

		EList<NamedElement> members = classifier.getMembers();

		for (ListIterator<Property> attribute = allAttributes
			.listIterator(); attribute.hasNext();) {

			if (!members.contains(attribute.next())) {
				attribute.remove();
			}
		}

		return ECollections.unmodifiableEList(allAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All StructuralFeatures related to the Classifier that may have Slots, including direct attributes, inherited attributes, private attributes in generalizations, and memberEnds of Associations, but excluding redefined StructuralFeatures.
	 * result = (member->select(oclIsKindOf(StructuralFeature))->
	 *   collect(oclAsType(StructuralFeature))->
	 *    union(self.inherit(self.allParents()->collect(p | p.attribute)->asSet())->
	 *      collect(oclAsType(StructuralFeature)))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public static EList<StructuralFeature> allSlottableFeatures(
			Classifier classifier) {
		EList<StructuralFeature> allSlottableFeatures = new UniqueEList.FastCompare<StructuralFeature>();

		for (NamedElement member : classifier.getMembers()) {

			if (member instanceof StructuralFeature) {
				allSlottableFeatures.add((StructuralFeature) member);
			}
		}

		EList<NamedElement> parentAttributes = new UniqueEList.FastCompare<NamedElement>();

		for (Classifier parent : classifier.allParents()) {
			parentAttributes.addAll(parent.getAttributes());
		}

		allSlottableFeatures.addAll(
			(Collection<? extends StructuralFeature>) inherit(classifier,
				parentAttributes));

		return ECollections.unmodifiableEList(allSlottableFeatures);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a Classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * c.allParents()->includes(self)
	 * result = (member->select(m | c.hasVisibilityOf(m)))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> inheritableMembers(Classifier classifier,
			Classifier c) {
		EList<NamedElement> inheritableMembers = new UniqueEList.FastCompare<NamedElement>();

		if (c == classifier || !c.allParents().contains(classifier)
			|| classifier.allParents().contains(c)) {

			return inheritableMembers;
		}

		for (NamedElement member : classifier.getMembers()) {

			if (c.hasVisibilityOf(member)) {
				inheritableMembers.add(member);
			}
		}

		return ECollections.unmodifiableEList(inheritableMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a NamedElement is visible in the classifier. Non-private members are visible. It is only called when the argument is something owned by a parent.
	 * allParents()->including(self)->collect(member)->includes(n)
	 * result = (n.visibility <> VisibilityKind::private)
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean hasVisibilityOf(Classifier classifier,
			NamedElement n) {

		for (Classifier parent : classifier.allParents()) {

			if (parent != classifier
				&& !parent.allParents().contains(classifier)
				&& parent.getMembers().contains(n)) {

				return n.getVisibility() != VisibilityKind.PRIVATE_LITERAL;
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inherit() defines how to inherit a set of elements passed as its argument.  It excludes redefined elements from the result.
	 * result = (inhs->reject(inh |
	 *   inh.oclIsKindOf(RedefinableElement) and
	 *   ownedMember->select(oclIsKindOf(RedefinableElement))->
	 *     select(redefinedElement->includes(inh.oclAsType(RedefinableElement)))
	 *        ->notEmpty()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> inherit(Classifier classifier,
			EList<NamedElement> inhs) {
		EList<NamedElement> inherit = new UniqueEList.FastCompare<NamedElement>();
		EList<RedefinableElement> redefinedElements = new UniqueEList.FastCompare<RedefinableElement>();

		for (NamedElement ownedMember : classifier.getOwnedMembers()) {

			if (ownedMember instanceof RedefinableElement) {
				redefinedElements.addAll(
					((RedefinableElement) ownedMember).getRedefinedElements());
			}
		}

		for (NamedElement inh : inhs) {

			if (!redefinedElements.contains(inh)) {
				inherit.add(inh);
			}
		}

		return ECollections.unmodifiableEList(inherit);
	}

	protected static EList<Classifier> allParents(Classifier classifier,
			EList<Classifier> allParents) {

		for (Classifier parent : classifier.parents()) {

			if (allParents.add(parent)) {
				allParents(parent, allParents);
			}
		}

		return allParents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * result = (parents()->union(parents()->collect(allParents())->asSet()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Classifier> allParents(Classifier classifier) {
		return ECollections.unmodifiableEList(
			allParents(classifier, new UniqueEList.FastCompare<Classifier>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this TemplateableElement is actually a template.
	 * result = (ownedTemplateSignature <> null)
	 * <p>From package UML::CommonStructure.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isTemplate(Classifier classifier) {
		return classifier.getOwnedTemplateSignature() != null;
	}

} // ClassifierOperations