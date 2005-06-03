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
 * $Id: ComponentOperations.java,v 1.4 2005/06/03 20:10:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Realization;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Package;

/**
 * A static utility class that provides operations related to '<em><b>Component</b></em>'
 * model objects.
 */
public final class ComponentOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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

	public static EList getProvideds(Component component) {
		EList provideds = new UniqueEList();

		if (component != null) {
			provideds.addAll(component.getImplementedInterfaces());

			for (Iterator realizations = component.getRealizations().iterator(); realizations
				.hasNext();) {

				Classifier realizingClassifier = ((Realization) realizations
					.next()).getRealizingClassifier();

				if (Interface.class.isInstance(realizingClassifier)) {
					provideds.add(realizingClassifier);
				} else if (BehavioredClassifier.class
					.isInstance(realizingClassifier)) {

					provideds
						.addAll(((BehavioredClassifier) realizingClassifier)
							.getImplementedInterfaces());
				}
			}

			for (Iterator ownedPorts = component.getOwnedPorts().iterator(); ownedPorts
				.hasNext();) {

				provideds.addAll(((Port) ownedPorts.next()).getProvideds());
			}
		}

		return provideds;
	}

	public static EList getRequireds(Component component) {
		EList requireds = new UniqueEList();

		if (component != null) {
			requireds.addAll(component.getUsedInterfaces());

			for (Iterator realizations = component.getRealizations().iterator(); realizations
				.hasNext();) {

				Realization realization = (Realization) realizations.next();

				if (null != realization.getRealizingClassifier()) {
					requireds.addAll(realization.getRealizingClassifier()
						.getUsedInterfaces());
				}
			}

			for (Iterator ownedPorts = component.getOwnedPorts().iterator(); ownedPorts
				.hasNext();) {

				requireds.addAll(((Port) ownedPorts.next()).getRequireds());
			}
		}

		return requireds;
	}

	public static EList getOwnedMembers(Component component) {
		EList ownedMembers = new UniqueEList();

		if (component != null) {
			ownedMembers.addAll(component.getOwnedRules());
			ownedMembers.addAll(component.getOwnedUseCases());
			ownedMembers.addAll(component.getOwnedBehaviors());
			ownedMembers.addAll(component.getOwnedTriggers());
			ownedMembers.addAll(component.getOwnedAttributes());
			ownedMembers.addAll(component.getOwnedConnectors());
			ownedMembers.addAll(component.getOwnedPorts());
			ownedMembers.addAll(component.getOwnedOperations());
			ownedMembers.addAll(component.getNestedClassifiers());
			ownedMembers.addAll(component.getOwnedReceptions());
			ownedMembers.addAll(component.getOwnedMembers());
		}

		return ownedMembers;
	}

	public static Set getNamesOfMember(Component component, NamedElement element) {
		Set namesOfMember = new HashSet();

		if (getOwnedMembers(component).contains(element)) {

			if (!isEmpty(element.getName())) {
				namesOfMember.add(element.getName());
			}
		} else {
			return NamespaceOperations.getNamesOfMember(component, element);
		}

		return Collections.unmodifiableSet(namesOfMember);
	}

	public static Set importMembers(Component component, Set imps) {
		Set importMembers = new HashSet();

		excludeCollisionsLoop : for (Iterator excludeCollisions = component
			.excludeCollisions(imps).iterator(); excludeCollisions.hasNext();) {

			PackageableElement excludeCollision = (PackageableElement) excludeCollisions
				.next();

			for (Iterator ownedMembers = getOwnedMembers(component).iterator(); ownedMembers
				.hasNext();) {

				PackageableElement ownedMember = (PackageableElement) ownedMembers
					.next();

				if (!excludeCollision.isDistinguishableFrom(ownedMember,
					component)) {

					continue excludeCollisionsLoop;
				}
			}

			importMembers.add(excludeCollision);
		}

		return Collections.unmodifiableSet(importMembers);
	}

	public static Set inherit(Component component, Set inhs) {
		Set inherit = new HashSet();

		iLoop : for (Iterator i = inhs.iterator(); i.hasNext();) {
			NamedElement inh = (NamedElement) i.next();

			for (Iterator ownedMembers = getOwnedMembers(component).iterator(); ownedMembers
				.hasNext();) {

				NamedElement ownedMember = (NamedElement) ownedMembers.next();

				if (RedefinableElement.class.isInstance(ownedMember)
					&& ((RedefinableElement) ownedMember)
						.getRedefinedElements().contains(inh)) {

					continue iLoop;
				}
			}

			inherit.add(inh);
		}

		return Collections.unmodifiableSet(inherit);
	}

} // ComponentOperations
