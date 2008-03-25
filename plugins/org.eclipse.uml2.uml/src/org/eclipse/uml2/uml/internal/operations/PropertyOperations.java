/*
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PropertyOperations.java,v 1.38 2008/03/25 13:41:38 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Property</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Property#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettingContextConforms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Context Conforms</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateRedefinedPropertyInherited(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Property Inherited</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Rules</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Readonly</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDerivedUnionIsReadOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettedPropertyNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetted Property Names</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDeploymentTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deployment Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateBindingToAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binding To Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getDefault() <em>Get Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isSetDefault() <em>Is Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setDefault(java.lang.String) <em>Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setIsComposite(boolean) <em>Set Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setOpposite(org.eclipse.uml2.uml.Property) <em>Set Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#unsetDefault() <em>Unset Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setIsNavigable(boolean) <em>Set Is Navigable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getOtherEnd() <em>Get Other End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setBooleanDefaultValue(boolean) <em>Set Boolean Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setIntegerDefaultValue(int) <em>Set Integer Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setStringDefaultValue(java.lang.String) <em>Set String Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setUnlimitedNaturalDefaultValue(int) <em>Set Unlimited Natural Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setNullDefaultValue() <em>Set Null Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isAttribute(org.eclipse.uml2.uml.Property) <em>Is Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getOpposite() <em>Get Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isNavigable() <em>Is Navigable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyOperations
		extends RedefinableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A multiplicity of a composite aggregation must not have an upper bound greater than 1.
	 * A multiplicity on an aggregate end of a composite aggregation must not have an upper bound greater than 1.
	 * isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMultiplicityOfComposite(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		int upperBound = property.upperBound();

		if (upperBound == LiteralUnlimitedNatural.UNLIMITED || upperBound > 1) {
			Property otherEnd = property.getOtherEnd();

			if (otherEnd != null && otherEnd.isComposite()) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__MULTIPLICITY_OF_COMPOSITE,
						UMLPlugin.INSTANCE.getString(
							"_UI_Property_MultiplicityOfComposite_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, property)),
						new Object[]{property, new Integer(upperBound)}));
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
	 * Subsetting may only occur when the context of the subsetting property conforms to the context of the subsetted property.
	 * self.subsettedProperty->notEmpty() implies
	 *   (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |
	 *     self.subsettedProperty->forAll(sp |
	 *       sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSubsettingContextConforms(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		spLoop : for (Property subsettedProperty : property
			.getSubsettedProperties()) {

			for (Type subsettingContext : property.subsettingContext()) {

				for (Type spSubsettingContext : subsettedProperty
					.subsettingContext()) {

					if (subsettingContext.conformsTo(spSubsettingContext)) {
						continue spLoop;
					}
				}
			}

			result = false;

			if (diagnostics == null) {
				return result;
			} else {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__SUBSETTING_CONTEXT_CONFORMS,
					UMLPlugin.INSTANCE.getString(
						"_UI_Property_SubsettingContextConforms_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, property,
							subsettedProperty)), new Object[]{property,
						subsettedProperty}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefined property must be inherited from a more general classifier containing the redefining property.
	 * if (redefinedProperty->notEmpty()) then
	 *   (redefinitionContext->notEmpty() and
	 *       redefinedProperty->forAll(rp|
	 *         ((redefinitionContext->collect(fc|
	 *           fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp))
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRedefinedPropertyInherited(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__REDEFINED_PROPERTY_INHERITED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRedefinedPropertyInherited", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subsetting property may strengthen the type of the subsetted property, and its upper bound may be less.
	 * self.subsettedProperty->forAll(sp |
	 *   self.type.conformsTo(sp.type) and
	 *     ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	 *       self.upperBound()<=sp.upperBound() ))
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSubsettingRules(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		Type type = property.getType();
		int upperBound = property.upperBound();

		for (Property subsettedProperty : property.getSubsettedProperties()) {
			Type subsettedType = subsettedProperty.getType();
			int subsettedUpperBound = subsettedProperty.upperBound();

			if (!(type == null
				? subsettedType == null
				: type.conformsTo(subsettedProperty.getType()))
				|| (subsettedUpperBound != LiteralUnlimitedNatural.UNLIMITED && (upperBound == LiteralUnlimitedNatural.UNLIMITED || upperBound > subsettedUpperBound))) {

				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__SUBSETTING_RULES,
						UMLPlugin.INSTANCE.getString(
							"_UI_Property_SubsettingRules_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, property,
								subsettedProperty)), new Object[]{property,
							subsettedProperty}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only a navigable property can be marked as readOnly.
	 * isReadOnly implies isNavigable()
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNavigableReadonly(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (property.isReadOnly() && property.getAssociation() != null
			&& !property.isNavigable()) {

			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__NAVIGABLE_READONLY,
					UMLPlugin.INSTANCE.getString(
						"_UI_Property_NavigableReadOnly_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, property)),
					new Object[]{property}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is derived.
	 * isDerivedUnion implies isDerived
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateDerivedUnionIsDerived(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (property.isDerivedUnion() && !property.isDerived()) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__DERIVED_UNION_IS_DERIVED,
					UMLPlugin.INSTANCE.getString(
						"_UI_Property_DerivedUnionIsDerived_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, property)),
					new Object[]{property}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is read only.
	 * isDerivedUnion implies isReadOnly
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateDerivedUnionIsReadOnly(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (property.isDerivedUnion() && !property.isReadOnly()) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__DERIVED_UNION_IS_READ_ONLY,
					UMLPlugin.INSTANCE.getString(
						"_UI_Property_DerivedUnionIsReadOnly_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, property)),
					new Object[]{property}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property may not subset a property with the same name.
	 * true
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSubsettedPropertyNames(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		String name = property.getName();

		for (Property subsettedProperty : property.getSubsettedProperties()) {

			if (safeEquals(name, subsettedProperty.getName())) {
				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__SUBSETTED_PROPERTY_NAMES,
						UMLPlugin.INSTANCE.getString(
							"_UI_Property_SubsettingPropertyNames_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, property,
								subsettedProperty)), new Object[]{property,
							subsettedProperty}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Property can be a DeploymentTarget if it is a kind of Node and functions as a part in the internal structure of an encompassing Node.
	 * true
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateDeploymentTarget(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (!property.getDeployments().isEmpty()) {

			if (!property.isComposite()
				|| !(property.getType() instanceof Node)
				|| !(property.getOwner() instanceof Node)) {

				result = false;

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__DEPLOYMENT_TARGET,
						UMLPlugin.INSTANCE.getString(
							"_UI_Property_DeploymentTarget_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, property)),
						new Object[]{property}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binding of a property template parameter representing an attribute must be to an attribute.
	 * (isAttribute(self) and (templateParameterSubstitution->notEmpty())
	 *   implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBindingToAttribute(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__BINDING_TO_ATTRIBUTE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBindingToAttribute", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isAttribute() is true if the Property is defined as an attribute of some classifier.
	 * result = Classifier.allInstances->exists(c | c.attribute->includes(p))
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isAttribute(Property property, Property p) {

		for (EStructuralFeature.Setting nonNavigableInverseReference : getNonNavigableInverseReferences(p)) {
			EObject eObject = nonNavigableInverseReference.getEObject();

			if (eObject instanceof Classifier
				&& ((Classifier) eObject).getAttributes().contains(p)) {

				return true;
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified Boolean value.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setBooleanDefaultValue(Property property, boolean value) {
		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralBoolean) (defaultValue instanceof LiteralBoolean
			? defaultValue
			: property.createDefaultValue(null, null,
				UMLPackage.Literals.LITERAL_BOOLEAN))).setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified integer value.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setIntegerDefaultValue(Property property, int value) {
		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralInteger) (defaultValue instanceof LiteralInteger
			? defaultValue
			: property.createDefaultValue(null, null,
				UMLPackage.Literals.LITERAL_INTEGER))).setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified string value.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setStringDefaultValue(Property property, String value) {
		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralString) (defaultValue instanceof LiteralString
			? defaultValue
			: property.createDefaultValue(null, null,
				UMLPackage.Literals.LITERAL_STRING))).setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified unlimited natural value.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setUnlimitedNaturalDefaultValue(Property property,
			int value) {
		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralUnlimitedNatural) (defaultValue instanceof LiteralUnlimitedNatural
			? defaultValue
			: property.createDefaultValue(null, null,
				UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL)))
			.setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the null value.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setNullDefaultValue(Property property) {

		if (!(property.getDefaultValue() instanceof LiteralNull)) {
			property.createDefaultValue(null, null,
				UMLPackage.Literals.LITERAL_NULL);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is owned by a class, associated with a binary association, and the other end of the association is also owned by a class, then opposite gives the other end.
	 * result = if owningAssociation->isEmpty() and association.memberEnd->size() = 2
	 *   then
	 *     let otherEnd = (association.memberEnd - self)->any() in
	 *       if otherEnd.owningAssociation->isEmpty() then otherEnd else Set{} endif
	 *     else Set {}
	 *     endif
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property getOpposite(Property property) {

		if (property.isNavigable()) {
			Association association = property.getAssociation();

			if (association != null) {
				EList<Property> memberEnds = association.getMemberEnds();

				if (memberEnds.size() == 2) {
					int index = memberEnds.indexOf(property);

					if (index != -1) {
						Property otherEnd = ((InternalEList<Property>) memberEnds)
							.basicGet(Math.abs(index - 1));

						if (!association.getOwnedEnds().contains(otherEnd)
							|| association.getNavigableOwnedEnds().contains(
								otherEnd)) {

							return otherEnd;
						}
					}
				}
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of isComposite is true only if aggregation is composite.
	 * result = (self.aggregation = #composite)
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComposite(Property property) {
		return property.getAggregation() == AggregationKind.COMPOSITE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query subsettingContext() gives the context for subsetting a property. It consists, in the case of an attribute, of the corresponding classifier, and in the case of an association end, all of the classifiers at the other ends.
	 * result = if association->notEmpty()
	 * then association.endType-type
	 * else if classifier->notEmpty() then Set{classifier} else Set{} endif
	 * endif
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Type> subsettingContext(Property property) {
		EList<Type> subsettingContext = new UniqueEList.FastCompare<Type>();

		Association association = property.getAssociation();

		if (association == null) {
			Namespace namespace = property.getNamespace();

			if (namespace instanceof Type) {
				subsettingContext.add((Type) namespace);
			}
		} else {

			for (Property memberEnd : association.getMemberEnds()) {

				if (memberEnd != property) {
					Type memberEndType = memberEnd.getType();

					if (memberEndType instanceof Classifier) {
						subsettingContext.add(memberEndType);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(subsettingContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNavigable() indicates whether it is possible to navigate across the property.
	 * result = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isNavigable(Property property) {
		Association owningAssociation = property.getOwningAssociation();
		return owningAssociation == null
			? property.eGet(UMLPackage.Literals.ELEMENT__OWNER, false) instanceof Classifier
			: owningAssociation.getNavigableOwnedEnds().contains(property);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getDefault(Property property) {
		ValueSpecification defaultValue = property.getDefaultValue();

		return defaultValue == null
			? null
			: defaultValue.stringValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setDefault(Property property, String newDefault) {
		ValueSpecification defaultValue = property.getDefaultValue();

		if (defaultValue != null) {
			ValueSpecificationOperations.setValue(defaultValue, newDefault);
		} else {
			property.setStringDefaultValue(newDefault);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setIsComposite(Property property, boolean newIsComposite) {
		property.setAggregation(newIsComposite
			? AggregationKind.COMPOSITE_LITERAL
			: AggregationKind.NONE_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setOpposite(Property property, Property newOpposite) {

		if (property.getOwningAssociation() != null) {
			throw new IllegalStateException();
		}

		if (newOpposite != null && newOpposite.getOwningAssociation() != null) {
			throw new IllegalArgumentException(String.valueOf(newOpposite));
		}

		Association association = property.getAssociation();

		if (association == null) {
			association = UMLFactory.eINSTANCE.createAssociation();

			org.eclipse.uml2.uml.Package owningPackage = (org.eclipse.uml2.uml.Package) ElementOperations
				.getOwningElement(property, UMLPackage.Literals.PACKAGE, true);

			if (owningPackage != null) {
				owningPackage.getPackagedElements().add(association);
			}
		}

		EList<Property> memberEnds = association.getMemberEnds();

		switch (memberEnds.size()) {
			case 0 :
				memberEnds.add(property);
			case 1 :
				if (newOpposite != null) {
					memberEnds.add(newOpposite);
				}
				break;
			case 2 :
				if (newOpposite == null) {
					memberEnds.remove(Math
						.abs(memberEnds.indexOf(property) - 1));
				} else {
					memberEnds.set(Math.abs(memberEnds.indexOf(property) - 1),
						newOpposite);
				}
				break;
			default :
				throw new IllegalStateException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isSetDefault(Property property) {
		return property.getDefault() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void unsetDefault(Property property) {

		if (property.isSetDefault()) {
			property.eUnset(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the navigability of this property as indicated.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param isNavigable The new navigability.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setIsNavigable(Property property, boolean isNavigable) {

		if (property.isNavigable() != isNavigable) {
			Association association = property.getAssociation();

			if (association == null) {
				throw new IllegalStateException();
			}

			EList<Property> navigableOwnedEnds = association
				.getNavigableOwnedEnds();

			if (isNavigable) {
				navigableOwnedEnds.add(property);
			} else {
				navigableOwnedEnds.remove(property);
				association.getOwnedEnds().add(property);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the other end of the (binary) association in which this property is a member end.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property getOtherEnd(Property property) {
		Association association = property.getAssociation();

		if (association != null) {
			EList<Property> memberEnds = association.getMemberEnds();

			if (memberEnds.size() == 2) {
				int index = memberEnds.indexOf(property);

				if (index != -1) {
					return memberEnds.get(Math.abs(index - 1));
				}
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two Properties in a context in which redefinition is possible, whether redefinition would be logically consistent. A redefining property is consistent with a redefined property if the type of the redefining property conforms to the type of the redefined property, the multiplicity of the redefining property (if specified) is contained in the multiplicity of the redefined property, and the redefining property is derived if the redefined property is derived.
	 * redefinee.isRedefinitionContextValid(self)
	 * result = redefinee.oclIsKindOf(Property) and 
	 *   let prop : Property = redefinee.oclAsType(Property) in 
	 *   (prop.type.conformsTo(self.type) and 
	 *   ((prop.lowerBound()->notEmpty() and self.lowerBound()->notEmpty()) implies prop.lowerBound() >= self.lowerBound()) and 
	 *   ((prop.upperBound()->notEmpty() and self.upperBound()->notEmpty()) implies prop.lowerBound() <= self.lowerBound()) and 
	 *   (self.isDerived implies prop.isDerived) and
	 *   (self.isComposite implies prop.isComposite))
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Property property,
			RedefinableElement redefinee) {

		if (redefinee instanceof Property
			&& redefinee.isRedefinitionContextValid(property)) {

			Property prop = (Property) redefinee;

			Type type = property.getType();
			int upperBound = property.upperBound();

			Type propType = prop.getType();
			int propUpperBound = prop.upperBound();

			return (propType == null
				? type == null
				: propType.conformsTo(type))
				&& prop.lowerBound() >= property.lowerBound()
				&& (upperBound == LiteralUnlimitedNatural.UNLIMITED || (propUpperBound != LiteralUnlimitedNatural.UNLIMITED && propUpperBound <= upperBound))
				&& (property.isDerived()
					? prop.isDerived()
					: true) && (property.isComposite()
					? prop.isComposite()
					: true);
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this parameterable element is compatible with the specified parameterable element. By default parameterable element P is compatible with parameterable element Q if the kind of P is the same or a subtype as the kind of Q. In addition, for properties, the type must be conformant with the type of the specified parameterable element.
	 * 
	 * result = p->oclIsKindOf(self.oclType) and self.type.conformsTo(p.oclAsType(TypedElement).type)
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isCompatibleWith(Property property,
			ParameterableElement p) {

		if (property.eClass().isInstance(p)) {
			Type type = property.getType();

			return type == null
				? ((Property) p).eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
					false) == null
				: type.conformsTo(((Property) p).getType());
		}

		return false;
	}

} // PropertyOperations