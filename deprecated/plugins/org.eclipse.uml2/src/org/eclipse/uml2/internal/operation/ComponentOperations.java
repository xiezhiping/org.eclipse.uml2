/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ComponentOperations.java,v 1.1 2005/04/14 17:30:57 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.Component;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.UML2Package;

/**
 * A static utility class that provides operations related to components.
 */
public final class ComponentOperations
		extends UML2Operations {

	/**
	 * Constructs a new Component Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ComponentOperations() {
		super();
	}

	/**
	 * Creates a(n) (abstract) class with the specified name as an owned member
	 * of the specified component.
	 * 
	 * @param component
	 *            The component in which to create the owned class.
	 * @param name
	 *            The name for the owned class.
	 * @param isAbstract
	 *            Whether the owned class should be abstract.
	 * @return The new class.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static org.eclipse.uml2.Class createOwnedClass(Component component,
			String name, boolean isAbstract) {

		if (null == component) {
			throw new IllegalArgumentException(String.valueOf(component));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		org.eclipse.uml2.Class ownedClass = (org.eclipse.uml2.Class) component
			.createOwnedMember(UML2Package.eINSTANCE.getClass_());
		ownedClass.setName(name);
		ownedClass.setIsAbstract(isAbstract);
		return ownedClass;
	}

	/**
	 * Creates an enumeration with the specified name as an owned member of the
	 * specified component.
	 * 
	 * @param component
	 *            The component in which to create the owned enumeration.
	 * @param name
	 *            The name for the owned enumeration.
	 * @return The new enumeration.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static Enumeration createOwnedEnumeration(Component component,
			String name) {

		if (null == component) {
			throw new IllegalArgumentException(String.valueOf(component));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		Enumeration ownedEnumeration = (Enumeration) component
			.createOwnedMember(UML2Package.eINSTANCE.getEnumeration());
		ownedEnumeration.setName(name);
		return ownedEnumeration;
	}

	/**
	 * Creates a package with the specified name as an owned member of the
	 * specified component.
	 * 
	 * @param component
	 *            The component in which to create the owned package.
	 * @param name
	 *            The name for the owned package.
	 * @return The new package.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static org.eclipse.uml2.Package createOwnedPackage(
			Component component, String name) {

		if (null == component) {
			throw new IllegalArgumentException(String.valueOf(component));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		org.eclipse.uml2.Package ownedPackage = (org.eclipse.uml2.Package) component
			.createOwnedMember(UML2Package.eINSTANCE.getPackage());
		ownedPackage.setName(name);
		return ownedPackage;
	}

	/**
	 * Creates a primitive type with the specified name as an owned member of
	 * the specified component.
	 * 
	 * @param component
	 *            The component in which to create the owned primitive type.
	 * @param name
	 *            The name for the owned primitive type.
	 * @return The new primitive type.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static PrimitiveType createOwnedPrimitiveType(Component component,
			String name) {

		if (null == component) {
			throw new IllegalArgumentException(String.valueOf(component));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		PrimitiveType ownedPrimitiveType = (PrimitiveType) component
			.createOwnedMember(UML2Package.eINSTANCE.getPrimitiveType());
		ownedPrimitiveType.setName(name);
		return ownedPrimitiveType;
	}

}