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
 * $Id: PropertyOperations.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.LiteralBoolean;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralString;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;

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

	public static boolean isConsistentWith(Property property,
			RedefinableElement redefinee) {

		if (redefinee.isRedefinitionContextValid(property)
			&& Property.class.isInstance(redefinee)) {

			Property prop = (Property) redefinee;

			return (null == property.getType()
				? null == prop.getType() : property.getType().conformsTo(
					prop.getType()))
				&& property.lowerBound() >= prop.lowerBound()
				&& property.upperBound() <= prop.upperBound()
				&& (prop.isDerived()
					? property.isDerived() : true);
		}

		return false;
	}

	public static Property opposite(Property property) {

		if (null == property.getOwningAssociation()
			&& null != property.getAssociation()
			&& 2 == property.getAssociation().getMemberEnds().size()) {

			for (Iterator memberEnds = property.getAssociation()
				.getMemberEnds().iterator(); memberEnds.hasNext();) {

				Property memberEnd = (Property) memberEnds.next();

				if (property != memberEnd
					&& null == memberEnd.getOwningAssociation()) {

					return memberEnd;
				}
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
	 * @return <code>true</code> if the property is navigable; <code>false</code>
	 *         otherwise.
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
	 * Sets the default of the specified property to the specified string
	 * value.
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

}