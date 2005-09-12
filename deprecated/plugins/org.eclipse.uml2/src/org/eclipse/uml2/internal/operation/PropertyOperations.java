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
 * $Id: PropertyOperations.java,v 1.16 2005/09/12 19:41:23 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.LiteralBoolean;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralString;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.ValueSpecification;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Property</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Property#validateOppositeIsOtherEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Opposite Is Other End</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#opposite() <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateSubsettingContext(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateNavigablePropertyRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Property Redefinition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Rules</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Readonly</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class PropertyOperations extends UML2Operations {

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
	private PropertyOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * If this property is owned by a class, associated with a binary
	 * association, and the other end of the association is also owned by a
	 * class, then opposite gives the other end.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * opposite = 
	 * 	if owningAssociation->notEmpty() and association.memberEnd->size() = 2 then 
	 * 		let otherEnd = (association.memberEnd - self)->any() in 
	 * 			if otherEnd.owningAssociation->notEmpty then otherEnd else Set{} endif
	 * 	else Set {}
	 * 	endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateOppositeIsOtherEnd(Property property, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		Property opposite = null;

		if (null == property.getOwningAssociation()) {
			Property otherEnd = getOtherEnd(property);

			if (null != otherEnd && null == otherEnd.getOwningAssociation()) {
				opposite = otherEnd;
			}
		}

		if (!safeEquals(property.getOpposite(), opposite)) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.PROPERTY__OPPOSITE_IS_OTHER_END,
					UML2Plugin.INSTANCE.getString(
						"_UI_Property_OppositeIsOtherEnd_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, property)),
					new Object[]{property, opposite}));

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
	 * if owningAssociation->notEmpty() and association.memberEnd->size() = 2 then 
	 * 		let otherEnd = (association.memberEnd - self)->any() in 
	 * 			if otherEnd.owningAssociation->notEmpty then otherEnd else Set{} endif
	 * 	else Set {}
	 * 	endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property opposite(Property property) {

		if (null == property.getOwningAssociation()) {
			Property otherEnd = getOtherEnd(property);

			if (null != otherEnd && null == otherEnd.getOwningAssociation()) {
				return otherEnd;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * A multiplicity of a composite aggregation must not have an upper bound
	 * greater than 1.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMultiplicityOfComposite(Property property, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (property.isComposite()) {
			Property otherEnd = getOtherEnd(property);

			if (null != otherEnd) {
				int upperBound = otherEnd.upperBound();

				if (MultiplicityElement.UNLIMITED_UPPER_BOUND == upperBound
					|| 1 < upperBound) {

					result = false;

					if (null != diagnostics) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UML2Validator.DIAGNOSTIC_SOURCE,
								UML2Validator.PROPERTY__MULTIPLICITY_OF_COMPOSITE,
								UML2Plugin.INSTANCE
									.getString(
										"_UI_Property_MultiplicityOfComposite_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											property)), new Object[]{property,
									new Integer(upperBound)}));
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
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * subsettedProperty->notEmpty() implies
	 * 	(subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |
	 * 		subsettedProperty->forAll(sp | 
	 * 			sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSubsettingContext(Property property, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		spLoop : for (Iterator sp = property.getSubsettedProperties()
			.iterator(); sp.hasNext();) {

			Property subsettedProperty = (Property) sp.next();

			for (Iterator sc = property.subsettingContext().iterator(); sc
				.hasNext();) {

				Classifier subsettingContext = (Classifier) sc.next();

				for (Iterator c = subsettedProperty.subsettingContext()
					.iterator(); c.hasNext();) {

					if (subsettingContext.conformsTo((Classifier) c.next())) {
						continue spLoop;
					}
				}
			}

			result = false;

			if (null == diagnostics) {
				return result;
			} else {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.PROPERTY__SUBSETTING_CONTEXT,
					UML2Plugin.INSTANCE.getString(
						"_UI_Property_SubsettingContext_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, property,
							subsettedProperty)), new Object[]{property,
						subsettedProperty}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * A navigable property (one that is owned by a class) can only be redefined
	 * or subsetted by a navigable property.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * (subsettedProperty->exists(sp | sp.class->notEmpty())	
	 * 		implies class->notEmpty())
	 * and
	 * (redefinedProperty->exists(rp | rp.class->notEmpty())	
	 * 		implies class->notEmpty())
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNavigablePropertyRedefinition(Property property, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		for (Iterator subsettedProperties = property.getSubsettedProperties()
			.iterator(); subsettedProperties.hasNext();) {

			Property subsettedProperty = (Property) subsettedProperties.next();

			if (subsettedProperty.isNavigable() && !property.isNavigable()) {
				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.PROPERTY__NAVIGABLE_PROPERTY_REDEFINITION,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_Property_NavigablePropertySubsetted_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, property,
										subsettedProperty)), new Object[]{
								property, subsettedProperty}));
				}
			}
		}

		for (Iterator redefinedProperties = property.getRedefinedProperties()
			.iterator(); redefinedProperties.hasNext();) {

			Property redefinedProperty = (Property) redefinedProperties.next();

			if (redefinedProperty.isNavigable() && !property.isNavigable()) {
				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.PROPERTY__NAVIGABLE_PROPERTY_REDEFINITION,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_Property_NavigablePropertyRedefined_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, property,
										redefinedProperty)), new Object[]{
								property, redefinedProperty}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * A subsetting property may strengthen the type of the subsetted property,
	 * and its upper bound may be less.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * subsettedProperty->forAll(sp |
	 * 	type.conformsTo(sp.type) and
	 * 		((upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	 * 			upperBound()<=sp.upperBound() ))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSubsettingRules(Property property,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		Type type = property.getType();
		int upperBound = property.upperBound();

		for (Iterator subsettedProperties = property.getSubsettedProperties()
			.iterator(); subsettedProperties.hasNext();) {

			Property subsettedProperty = (Property) subsettedProperties.next();
			int subsettedUpperBound = subsettedProperty.upperBound();

			if (!type.conformsTo(subsettedProperty.getType())
				|| (MultiplicityElement.UNLIMITED_UPPER_BOUND != subsettedUpperBound && (upperBound == MultiplicityElement.UNLIMITED_UPPER_BOUND || upperBound > subsettedUpperBound))) {

				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UML2Validator.DIAGNOSTIC_SOURCE,
						UML2Validator.PROPERTY__SUBSETTING_RULES,
						UML2Plugin.INSTANCE.getString(
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
	 * Only a navigable property can be marked as read-only.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * isReadOnly implies class->notEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNavigableReadonly(Property property, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (property.isReadOnly() && null != property.getAssociation()
			&& !property.isNavigable()) {

			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.PROPERTY__NAVIGABLE_READONLY,
					UML2Plugin.INSTANCE.getString(
						"_UI_Property_NavigableReadOnly_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, property)),
					new Object[]{property}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * A derived union is derived.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * isDerivedUnion implies isDerived
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateDerivedUnionIsDerived(Property property, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (property.isDerivedUnion() && !property.isDerived()) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.PROPERTY__DERIVED_UNION_IS_DERIVED,
					UML2Plugin.INSTANCE.getString(
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
	 * A query based on the following OCL expression:
	 * <code>
	 * if association->notEmpty()
	 * then association.endType-type 
	 * else if classifier->notEmpty then Set{classifier} else Set{} endif
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set subsettingContext(Property property) {
		Set subsettingContext = new HashSet();

		Association association = property.getAssociation();

		if (null == association) {
			EObject eContainer = property.eContainer();

			if (Classifier.class.isInstance(eContainer)) {
				subsettingContext.add(eContainer);
			}
		} else {

			for (Iterator memberEnds = association.getMemberEnds().iterator(); memberEnds
				.hasNext();) {

				Property memberEnd = (Property) memberEnds.next();

				if (memberEnd != property) {
					Type memberEndType = memberEnd.getType();

					if (Classifier.class.isInstance(memberEndType)) {
						subsettingContext.add(memberEndType);
					}
				}
			}
		}

		return Collections.unmodifiableSet(subsettingContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (redefinee.oclIsKindOf(Property) and 
	 *     let prop: Property = redefinee.oclAsType(Property) in
	 *         type.conformsTo(prop.type) and
	 *         (lowerBound()->notEmpty and prop.lowerBound()->notEmpty() implies lowerBound() >= prop.lowerBound())
	 *     and
	 *         (upperBound()->notEmpty and prop.upperBound()->notEmpty() implies upperBound() <= prop.upperBound())
	 *     and
	 *         (prop.isDerived implies isDerived))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Property property,
			RedefinableElement redefinee) {

		if (redefinee.isRedefinitionContextValid(property)
			&& Property.class.isInstance(redefinee)) {

			Property prop = (Property) redefinee;

			Type type = property.getType();
			int upperBound = property.upperBound();

			Type propType = prop.getType();
			int propUpperBound = prop.upperBound();

			return (null == type
				? null == propType
				: propType.conformsTo(type))
				&& prop.lowerBound() >= property.lowerBound()
				&& (MultiplicityElement.UNLIMITED_UPPER_BOUND == upperBound || (propUpperBound != MultiplicityElement.UNLIMITED_UPPER_BOUND && propUpperBound <= upperBound))
				&& (property.isDerived()
					? prop.isDerived()
					: true);
		}

		return false;
	}

	// <!-- begin-custom-operations -->

	protected static Property getOtherEnd(Property property) {
		Association association = property.getAssociation();

		if (null != association && association.isBinary()) {
			List memberEnds = association.getMemberEnds();

			return (Property) memberEnds.get(Math.abs(memberEnds
				.indexOf(property) - 1));
		}

		return null;
	}

	/**
	 * Determines whether the specified property is navigable, i.e. it is part
	 * of an assocation and owned by one its the end types.
	 * 
	 * @param property
	 *            The property for which to determine navigability.
	 * @return <code>true</code> if the property is navigable;
	 *         <code>false</code> otherwise.
	 */
	public static boolean isNavigable(Property property) {

		if (null == property) {
			return false;
		}

		return null != property.getAssociation()
			&& null == property.getOwningAssociation();
	}

	/**
	 * Sets the navigability of the specified property as specified.
	 * 
	 * @param property
	 *            The property for which to set the navigability.
	 * @param navigable
	 *            Whether the property should be navigable.
	 * @exception IllegalArgumentException
	 *                If the specified property is not an association end or if
	 *                the specified navigability does not apply.
	 */
	public static void setNavigable(Property property, boolean navigable) {

		if (null == property) {
			throw new IllegalArgumentException(String.valueOf(property));
		}

		Association association = property.getAssociation();

		if (null == association || !association.isBinary()) {
			throw new IllegalArgumentException(String.valueOf(property));
		}

		if (navigable != isNavigable(property)) {

			if (navigable) {
				List ownedAttributes = getOwnedAttributes(getOtherEnd(
					property).getType());

				if (null == ownedAttributes) {
					throw new IllegalArgumentException(String
						.valueOf(navigable));
				} else {
					ownedAttributes.add(property);
				}
			} else {
				association.getOwnedEnds().add(property);
			}
		}
	}

	/**
	 * Sets the default of the specified property to the specified boolean
	 * value.
	 * 
	 * @param property
	 *            The property whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setBooleanDefault(Property property, boolean value) {

		if (null == property) {
			throw new IllegalArgumentException(String.valueOf(property));
		}

		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralBoolean) (LiteralBoolean.class.isInstance(defaultValue)
			? defaultValue
			: property.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralBoolean()))).setValue(value);
	}

	/**
	 * Sets the default of the specified property to the specified integer
	 * value.
	 * 
	 * @param property
	 *            The property whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setIntegerDefault(Property property, int value) {

		if (null == property) {
			throw new IllegalArgumentException(String.valueOf(property));
		}

		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralInteger) (LiteralInteger.class.isInstance(defaultValue)
			? defaultValue
			: property.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralInteger()))).setValue(value);
	}

	/**
	 * Sets the default of the specified property to the specified string value.
	 * 
	 * @param property
	 *            The property whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setStringDefault(Property property, String value) {

		if (null == property) {
			throw new IllegalArgumentException(String.valueOf(property));
		}

		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralString) (LiteralString.class.isInstance(defaultValue)
			? defaultValue
			: property.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralString()))).setValue(value);
	}

	/**
	 * Sets the default of the specified property to the specified unlimited
	 * natural value.
	 * 
	 * @param property
	 *            The property whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setUnlimitedNaturalDefault(Property property, int value) {

		if (null == property) {
			throw new IllegalArgumentException(String.valueOf(property));
		}

		ValueSpecification defaultValue = property.getDefaultValue();

		((LiteralUnlimitedNatural) (LiteralUnlimitedNatural.class
			.isInstance(defaultValue)
			? defaultValue
			: property.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralUnlimitedNatural()))).setValue(value);
	}

	public static String getDefault(Property property) {
		ValueSpecification defaultValue = property.getDefaultValue();
		return null == defaultValue
			? EMPTY_STRING
			: defaultValue.stringValue();
	}

	// <!-- end-custom-operations -->

} // PropertyOperations