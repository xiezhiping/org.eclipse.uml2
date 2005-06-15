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
 * $Id: ParameterOperations.java,v 1.5 2005/06/15 17:18:21 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.LiteralBoolean;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralString;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;

/**
 * A static utility class that provides operations related to '<em><b>Parameter</b></em>'
 * model objects.
 */
public final class ParameterOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private ParameterOperations() {
		super();
	}

	/**
	 * Sets the default of the specified parameter to the specified boolean
	 * value.
	 * 
	 * @param parameter
	 *            The parameter whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setBooleanDefault(Parameter parameter, boolean value) {

		if (null == parameter) {
			throw new IllegalArgumentException(String.valueOf(parameter));
		}

		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralBoolean) (LiteralBoolean.class.isInstance(defaultValue)
			? defaultValue
			: parameter.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralBoolean()))).setValue(value);
	}

	/**
	 * Sets the default of the specified parameter to the specified integer
	 * value.
	 * 
	 * @param parameter
	 *            The parameter whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setIntegerDefault(Parameter parameter, int value) {

		if (null == parameter) {
			throw new IllegalArgumentException(String.valueOf(parameter));
		}

		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralInteger) (LiteralInteger.class.isInstance(defaultValue)
			? defaultValue
			: parameter.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralInteger()))).setValue(value);
	}

	/**
	 * Sets the default of the specified parameter to the specified string
	 * value.
	 * 
	 * @param parameter
	 *            The parameter whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setStringDefault(Parameter parameter, String value) {

		if (null == parameter) {
			throw new IllegalArgumentException(String.valueOf(parameter));
		}

		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralString) (LiteralString.class.isInstance(defaultValue)
			? defaultValue
			: parameter.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralString()))).setValue(value);
	}

	/**
	 * Sets the default of the specified parameter to the specified unlimited
	 * natural value.
	 * 
	 * @param parameter
	 *            The parameter whose default to set.
	 * @param value
	 *            The new value of the default.
	 */
	public static void setUnlimitedNaturalDefault(Parameter parameter, int value) {

		if (null == parameter) {
			throw new IllegalArgumentException(String.valueOf(parameter));
		}

		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralUnlimitedNatural) (LiteralUnlimitedNatural.class
			.isInstance(defaultValue)
			? defaultValue
			: parameter.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralUnlimitedNatural()))).setValue(value);
	}

	public static String getDefault(Parameter parameter) {
		ValueSpecification defaultValue = parameter.getDefaultValue();
		return null == defaultValue
			? EMPTY_STRING
			: defaultValue.stringValue();
	}

} // ParameterOperations
