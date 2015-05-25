/*
 * Copyright (c) 2013, 2015 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 468230
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * Common protocol for {@linkplain Classifier classifiers} that own
 * {@linkplain Classifier#getAttributes() attributes}.
 * 
 * @since 5.0
 */
public interface AttributeOwner {

	/**
	 * Obtains the attributes owned by this classifier.
	 * 
	 * @return my owned attributes
	 */
	EList<Property> getOwnedAttributes();

	/**
	 * Creates a new {@link Property} as an owned attribute of this classifier.
	 * 
	 * @param name
	 *            the name of the new attribute (may be {@code null})
	 * @param type
	 *            the type of the new attribute (may be {@code null})
	 * 
	 * @return the new owned attribute
	 * 
	 * @see #createOwnedAttribute(String, Type, EClass)
	 * @see #getOwnedAttribute(String, Type)
	 */
	Property createOwnedAttribute(String name, Type type);

	/**
	 * Creates a new property as an owned attribute of this classifier.
	 * 
	 * @param name
	 *            the name of the new attribute (may be {@code null})
	 * @param type
	 *            the type of the new attribute (may be {@code null})
	 * @param eClass
	 *            the Ecore metaclass of the attribute to create
	 * 
	 * @return the new owned attribute
	 * 
	 * @see #createOwnedAttribute(String, Type)
	 * @see #getOwnedAttribute(String, Type, boolean, EClass, boolean)
	 */
	Property createOwnedAttribute(String name, Type type, EClass eClass);

	/**
	 * Finds the first owned attribute that matches the given {@code name}
	 * and/or {@code type}.
	 * 
	 * @param name
	 *            the attribute name to match, or {@code null} to match any
	 *            attribute name
	 * @param type
	 *            the attribute type to match, or {@code null} to match any
	 *            attribute type
	 * 
	 * @return any matching attribute, or {@code null} if not found
	 * 
	 * @see #getOwnedAttribute(String, Type, boolean, EClass, boolean)
	 */
	Property getOwnedAttribute(String name, Type type);

	/**
	 * Finds the first owned attribute that matches the given {@code name}
	 * (optionally irrespective of case) and/or {@code type}.
	 * 
	 * @param name
	 *            the attribute name to match, or {@code null} to match any
	 *            attribute name
	 * @param type
	 *            the attribute type to match, or {@code null} to match any
	 *            attribute type
	 * @param ignoreCase
	 *            whether to match names case-insensitively
	 * @param eClass
	 *            the Ecore metaclass of attribute to match, or {@code null} to
	 *            match any kind of attribute
	 * @param createOnDemand
	 *            whether to create the owned attribute and return it if an
	 *            existing match is not found
	 * 
	 * @return any matching attribute, or {@code null} if not found and
	 *         {@code createOnDemand} is {@code false}
	 * 
	 * @see #getOwnedAttribute(String, Type)
	 */
	Property getOwnedAttribute(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

}
