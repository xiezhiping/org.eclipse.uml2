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
 * $Id: ParameterOperations.java,v 1.4 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.LiteralBoolean;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralString;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.UML2Package;

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

		((LiteralBoolean) (LiteralBoolean.class.isInstance(parameter
			.getDefaultValue())
			? parameter.getDefaultValue()
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

		((LiteralInteger) (LiteralInteger.class.isInstance(parameter
			.getDefaultValue())
			? parameter.getDefaultValue()
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

		((LiteralString) (LiteralString.class.isInstance(parameter
			.getDefaultValue())
			? parameter.getDefaultValue()
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

		((LiteralUnlimitedNatural) (LiteralUnlimitedNatural.class
			.isInstance(parameter.getDefaultValue())
			? parameter.getDefaultValue()
			: parameter.createDefaultValue(UML2Package.eINSTANCE
				.getLiteralUnlimitedNatural()))).setValue(value);
	}

	public static String getDefault(Parameter parameter) {
		return null == parameter.getDefaultValue()
			? EMPTY_STRING
			: parameter.getDefaultValue().stringValue();
	}

} // ParameterOperations
