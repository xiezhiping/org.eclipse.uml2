/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: PropertyOperations.java,v 1.7 2004/05/11 15:24:01 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
import org.eclipse.uml2.util.UML2Validator;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;

/**
 * A static utility class that provides operations related to properties.
 */
public final class PropertyOperations
	extends UML2Operations {

	/**
	 * Constructs a new Property Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private PropertyOperations() {
		super();
	}

	protected static Property getOtherEnd(Property property) {
		Association association = property.getAssociation();

		if (null != association) {
			List memberEnds = association.getMemberEnds();

			if (2 == memberEnds.size()) {
				return (Property) memberEnds.get(Math.abs(memberEnds
					.indexOf(property) - 1));
			}
		}

		return null;
	}

	public static boolean isConsistentWith(Property property,
			RedefinableElement redefinee) {

		if (redefinee.isRedefinitionContextValid(property)
			&& Property.class.isInstance(redefinee)) {

			Property prop = (Property) redefinee;

			return (null == property.getType()
				? null == prop.getType() : property.getType().conformsTo(
					prop.getType()))
				&& property.lowerBound() >= prop.lowerBound()
				&& (MultiplicityElement.UNLIMITED_UPPER_BOUND == prop
					.upperBound() || (property.upperBound() != MultiplicityElement.UNLIMITED_UPPER_BOUND && property
					.upperBound() <= prop.upperBound())) && (prop.isDerived()
					? property.isDerived() : true);
		}

		return false;
	}

	public static Property opposite(Property property) {

		if (null == property.getOwningAssociation()) {
			Property otherEnd = getOtherEnd(property);

			if (null != otherEnd && null == otherEnd.getOwningAssociation()) {
				return otherEnd;
			}
		}

		return null;
	}

	public static Set subsettingContext(Property property) {
		Set subsettingContext = new HashSet();

		if (null == property.getAssociation()) {

			if (null != property.getType()) {
				subsettingContext.add(property.getType());
			}
		} else {
			subsettingContext.addAll(property.getAssociation().getEndTypes());
		}

		return subsettingContext;
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

		if (null == association || 2 != association.getEndTypes().size()) {
			throw new IllegalArgumentException(String.valueOf(property));
		}

		if (navigable != isNavigable(property)) {

			if (navigable) {
				List ownedAttributes = getOwnedAttributes((Type) association
					.getEndTypes().get(
						association.getMemberEnds().indexOf(property)));

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

		((LiteralBoolean) (LiteralBoolean.class.isInstance(property
			.getDefaultValue())
			? property.getDefaultValue() : property
				.createDefaultValue(UML2Package.eINSTANCE.getLiteralBoolean())))
			.setValue(value);
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

		((LiteralInteger) (LiteralInteger.class.isInstance(property
			.getDefaultValue())
			? property.getDefaultValue() : property
				.createDefaultValue(UML2Package.eINSTANCE.getLiteralInteger())))
			.setValue(value);
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

		((LiteralString) (LiteralString.class.isInstance(property
			.getDefaultValue())
			? property.getDefaultValue() : property
				.createDefaultValue(UML2Package.eINSTANCE.getLiteralString())))
			.setValue(value);
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

		((LiteralUnlimitedNatural) (LiteralUnlimitedNatural.class
			.isInstance(property.getDefaultValue())
			? property.getDefaultValue() : property
				.createDefaultValue(UML2Package.eINSTANCE
					.getLiteralUnlimitedNatural()))).setValue(value);
	}

	public static String getDefault(Property property) {
		return null == property.getDefaultValue()
			? EMPTY_STRING : property.getDefaultValue().stringValue();
	}

	/**
	 * If this property is owned by a class, associated with a binary
	 * association, and the other end of the association is also owned by a
	 * class, then opposite gives the other end.
	 *  
	 */
	public static boolean validateOppositeIsOtherEnd(Property property,
			DiagnosticChain diagnostics, Map context) {
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
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.ERROR,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.PROPERTY__OPPOSITE_IS_OTHER_END,
							UML2Plugin.INSTANCE.getString(
								"_UI_Property_OppositeIsOtherEnd_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, property)),
							new Object[] {property, opposite}));

			}
		}

		return result;
	}

	/**
	 * A multiplicity of a composite aggregation must not have an upper bound
	 * greater than 1.
	 *  
	 */
	public static boolean validateMultiplicityOfComposite(Property property,
			DiagnosticChain diagnostics, Map context) {
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
												property)),
									new Object[] {property, new Integer(upperBound)}));
					}
				}
			}
		}

		return result;
	}

	/**
	 * Subsetting may only occur when the context of the subsetting property
	 * conforms to the context of the subsetted property.
	 *  
	 */
	public static boolean validateSubsettingContext(Property property,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		spLoop: for (Iterator sp = property.getSubsettedProperties().iterator(); sp
			.hasNext();) {

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
								subsettedProperty)),
						new Object[] {property, subsettedProperty}));
			}
		}

		return result;
	}

	/**
	 * A navigable property (one that is owned by a class) can only be redefined
	 * or subsetted by a navigable property.
	 *  
	 */
	public static boolean validateNavigablePropertyRedefinition(
			Property property, DiagnosticChain diagnostics, Map context) {
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
										"_UI_Property_NavigablePropertyRedefinition_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											property, subsettedProperty)),
								new Object[] {property, subsettedProperty}));
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
										"_UI_Property_NavigablePropertyRedefinition_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											property, redefinedProperty)),
								new Object[] {property, redefinedProperty}));
				}
			}
		}

		return result;
	}

	/**
	 * A subsetting property may strengthen the type of the subsetted property,
	 * and its upper bound may be less.
	 *  
	 */
	public static boolean validateSubsettingRules(Property property,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		for (Iterator subsettedProperties = property.getSubsettedProperties()
			.iterator(); subsettedProperties.hasNext();) {

			Property subsettedProperty = (Property) subsettedProperties.next();

			if (!property.getType().conformsTo(subsettedProperty.getType())
				|| (MultiplicityElement.UNLIMITED_UPPER_BOUND != subsettedProperty
					.upperBound() && (property.upperBound() == MultiplicityElement.UNLIMITED_UPPER_BOUND || property
					.upperBound() > subsettedProperty.upperBound()))) {

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
									subsettedProperty)),
							new Object[] {property, subsettedProperty}));
				}
			}
		}

		return result;
	}

	/**
	 * Only a navigable property can be marked as read-only.
	 *  
	 */
	public static boolean validateNavigableReadonly(Property property,
			DiagnosticChain diagnostics, Map context) {
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
						new Object [] {property}));
			}
		}

		return result;
	}

	/**
	 * A derived union is derived.
	 *  
	 */
	public static boolean validateDerivedUnionIsDerived(Property property,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (property.isDerivedUnion() && !property.isDerived()) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.PROPERTY__DERIVED_UNION_IS_DERIVED,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_Property_DerivedUnionIsDerived_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, property)),
							new Object[] {property}));
			}
		}

		return result;
	}

}