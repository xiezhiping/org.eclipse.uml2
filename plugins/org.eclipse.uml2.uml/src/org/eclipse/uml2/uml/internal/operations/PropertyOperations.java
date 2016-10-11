/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 407028, 418466, 433195, 439915, 451350, 485756, 505724
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralReal;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Property#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettingContextConforms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Context Conforms</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDerivedUnionIsReadOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateRedefinedPropertyInherited(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Property Inherited</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Rules</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateBindingToAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binding To Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDeploymentTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deployment Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettedPropertyNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetted Property Names</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateTypeOfOppositeEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Opposite End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateQualifiedIsAssociationEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualified Is Association End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getDefault() <em>Get Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getOtherEnd() <em>Get Other End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isSetDefault() <em>Is Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setBooleanDefaultValue(boolean) <em>Set Boolean Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setDefault(java.lang.String) <em>Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setIntegerDefaultValue(int) <em>Set Integer Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setIsComposite(boolean) <em>Set Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setIsNavigable(boolean) <em>Set Is Navigable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setNullDefaultValue() <em>Set Null Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setOpposite(org.eclipse.uml2.uml.Property) <em>Set Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setRealDefaultValue(double) <em>Set Real Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setStringDefaultValue(java.lang.String) <em>Set String Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setUnlimitedNaturalDefaultValue(int) <em>Set Unlimited Natural Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#unsetDefault() <em>Unset Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isAttribute() <em>Is Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isNavigable() <em>Is Navigable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getOpposite() <em>Get Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
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
	 * A multiplicity on the composing end of a composite aggregation must not have an upper bound greater than 1.
	 * isComposite and association <> null implies opposite.upperBound() <= 1
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
	 * subsettedProperty->notEmpty() implies
	 *   (subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |
	 *     subsettedProperty->forAll(sp |
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
							subsettedProperty)),
					new Object[]{property, subsettedProperty}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefined Property must be inherited from a more general Classifier.
	 * (redefinedProperty->notEmpty()) implies
	 *   (redefinitionContext->notEmpty() and
	 *       redefinedProperty->forAll(rp|
	 *         ((redefinitionContext->collect(fc|
	 *           fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp)))
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__REDEFINED_PROPERTY_INHERITED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateRedefinedPropertyInherited", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(property, context)}),
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
	 * A subsetting Property may strengthen the type of the subsetted Property, and its upper bound may be less.
	 * subsettedProperty->forAll(sp |
	 *   self.type.conformsTo(sp.type) and
	 *     ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	 *       self.upperBound() <= sp.upperBound() ))
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
				|| (subsettedUpperBound != LiteralUnlimitedNatural.UNLIMITED
					&& (upperBound == LiteralUnlimitedNatural.UNLIMITED
						|| upperBound > subsettedUpperBound))) {

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
								subsettedProperty)),
						new Object[]{property, subsettedProperty}));
				}
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
	 * A Property may not subset a Property with the same name.
	 * subsettedProperty->forAll(sp | sp.name <> name)
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
								subsettedProperty)),
						new Object[]{property, subsettedProperty}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Property is a classifier-owned end of a binary Association, its owner must be the type of the opposite end.
	 * (opposite->notEmpty() and owningAssociation->isEmpty()) implies classifier = opposite.type
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOfOppositeEnd(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__TYPE_OF_OPPOSITE_END,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateTypeOfOppositeEnd", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(property, context)}),
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
	 * All qualified Properties must be Association ends
	 * qualifier->notEmpty() implies association->notEmpty()
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateQualifiedIsAssociationEnd(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__QUALIFIED_IS_ASSOCIATION_END,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateQualifiedIsAssociationEnd", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(property, context)}),
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
	 * A Property can be a DeploymentTarget if it is a kind of Node and functions as a part in the internal structure of an encompassing Node.
	 * deployment->notEmpty() implies owner.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p = self))
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

			if (!property.isComposite() || !(property.getType() instanceof Node)
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
	 * A binding of a PropertyTemplateParameter representing an attribute must be to an attribute.
	 * (self.isAttribute()
	 * and (templateParameterSubstitution->notEmpty())
	 * implies (templateParameterSubstitution->forAll(ts |
	 *     ts.formal.oclIsKindOf(Property)
	 *     and ts.formal.oclAsType(Property).isAttribute())))
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
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROPERTY__BINDING_TO_ATTRIBUTE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateBindingToAttribute", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(property, context)}),
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
	 * Sets the default value for this property to the specified Boolean value.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setBooleanDefaultValue(Property property,
			boolean value) {
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
	 * @generated NOT
	 */
	public static void unsetDefault(Property property) {

		if (property.getDefault() != null) {
			property.eUnset(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE);
		}
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
	 * If this property is a memberEnd of a binary association, then opposite gives the other end.
	 * result = (if association <> null and association.memberEnd->size() = 2
	 * then
	 *     association.memberEnd->any(e | e <> self)
	 * else
	 *     null
	 * endif)
	 * <p>From package UML::Classification.</p>
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property getOpposite(Property property) {
		Association association = property.getAssociation();

		if (association != null) {
			EList<Property> memberEnds = association.getMemberEnds();

			if (memberEnds.size() == 2) {
				int index = memberEnds.indexOf(property);

				if (index != -1) {
					return ((InternalEList<Property>) memberEnds)
						.basicGet(1 - index);
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
	 * result = (aggregation = AggregationKind::composite)
	 * <p>From package UML::Classification.</p>
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
	 * The query subsettingContext() gives the context for subsetting a Property. It consists, in the case of an attribute, of the corresponding Classifier, and in the case of an association end, all of the Classifiers at the other ends.
	 * result = (if association <> null
	 * then association.memberEnd->excluding(self)->collect(type)->asSet()
	 * else 
	 *   if classifier<>null
	 *   then classifier->asSet()
	 *   else Set{} 
	 *   endif
	 * endif)
	 * <p>From package UML::Classification.</p>
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
	 * result = (not classifier->isEmpty() or association.navigableOwnedEnd->includes(self))
	 * <p>From package UML::Classification.</p>
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isNavigable(Property property) {
		Association owningAssociation = property.getOwningAssociation();
		return owningAssociation == null
			? property.eGet(UMLPackage.Literals.ELEMENT__OWNER,
				false) instanceof Classifier
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
	public static void setIsComposite(Property property,
			boolean newIsComposite) {
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
					memberEnds
						.remove(Math.abs(memberEnds.indexOf(property) - 1));
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
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified real value.
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setRealDefaultValue(Property property, double value) {
		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralReal) (defaultValue instanceof LiteralReal
			? defaultValue
			: property.createDefaultValue(null, null,
				UMLPackage.Literals.LITERAL_REAL))).setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isAttribute() is true if the Property is defined as an attribute of some Classifier.
	 * result = (not classifier->isEmpty())
	 * <p>From package UML::Classification.</p>
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isAttribute(Property property) {

		for (EStructuralFeature.Setting inverseReference : getInverseReferences(
			property)) {
			EObject eObject = inverseReference.getEObject();

			if (eObject instanceof Classifier
				&& ((Classifier) eObject).getAttributes().contains(property)) {

				return true;
			}
		}

		return false;
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
	 * @generated NOT
	 */
	public static boolean isSetDefault(Property property) {
		return property.getDefault() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two Properties in a context in which redefinition is possible, whether redefinition would be logically consistent. A redefining Property is consistent with a redefined Property if the type of the redefining Property conforms to the type of the redefined Property, and the multiplicity of the redefining Property (if specified) is contained in the multiplicity of the redefined Property.
	 * redefiningElement.isRedefinitionContextValid(self)
	 * result = (redefiningElement.oclIsKindOf(Property) and 
	 *   let prop : Property = redefiningElement.oclAsType(Property) in 
	 *   (prop.type.conformsTo(self.type) and 
	 *   ((prop.lowerBound()->notEmpty() and self.lowerBound()->notEmpty()) implies prop.lowerBound() >= self.lowerBound()) and 
	 *   ((prop.upperBound()->notEmpty() and self.upperBound()->notEmpty()) implies prop.lowerBound() <= self.lowerBound()) and 
	 *   (self.isComposite implies prop.isComposite)))
	 * <p>From package UML::Classification.</p>
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Property property,
			RedefinableElement redefiningElement) {

		if (redefiningElement instanceof Property
			&& redefiningElement.isRedefinitionContextValid(property)) {

			Property prop = (Property) redefiningElement;

			Type type = property.getType();
			int upperBound = property.upperBound();

			Type propType = prop.getType();
			int propUpperBound = prop.upperBound();

			return (propType == null
				? type == null
				: propType.conformsTo(type))
				&& prop.lowerBound() >= property.lowerBound()
				&& (upperBound == LiteralUnlimitedNatural.UNLIMITED
					|| (propUpperBound != LiteralUnlimitedNatural.UNLIMITED
						&& propUpperBound <= upperBound))
				&& (property.isComposite()
					? prop.isComposite()
					: true);
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this Property is compatible with the specified ParameterableElement. This Property is compatible with ParameterableElement p if the kind of this Property is thesame as or a subtype of the kind of p. Further, if p is a TypedElement, then the type of this Property must be conformant with the type of p.
	 * result = (self.oclIsKindOf(p.oclType()) and (p.oclIsKindOf(TypedElement) implies
	 * self.type.conformsTo(p.oclAsType(TypedElement).type)))
	 * <p>From package UML::Classification.</p>
	 * @param property The receiving '<em><b>Property</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isCompatibleWith(Property property,
			ParameterableElement p) {

		if (property.eClass().isInstance(p) && p instanceof TypedElement) {
			Type type = property.getType();

			return type == null
				? ((TypedElement) p).eGet(
					UMLPackage.Literals.TYPED_ELEMENT__TYPE, false) == null
				: type.conformsTo(((TypedElement) p).getType());
		}

		return false;
	}

} // PropertyOperations