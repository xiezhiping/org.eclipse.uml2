/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ClassOperations.java,v 1.5 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Package;

/**
 * A static utility class that provides operations related to classes.
 */
public final class ClassOperations
	extends UML2Operations {

	/**
	 * Constructs a new Class Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ClassOperations() {
		super();
	}

	public static Set inherit(org.eclipse.uml2.Class class_, Set inhs) {
		Set inherit = new HashSet();

		iLoop : for (Iterator i = inhs.iterator(); i.hasNext();) {
			NamedElement inh = (NamedElement) i.next();

			for (Iterator ownedMembers = class_.getOwnedMembers().iterator(); ownedMembers
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

		return inherit;
	}

	/**
	 * Determines whether the specified class is a metaclass.
	 * 
	 * @param class_
	 *            The class in question.
	 * @return <code>true</code> if the specified class is stereotyped as a
	 *         metaclass; <code>false</code> otherwise.
	 */
	public static boolean isMetaclass(org.eclipse.uml2.Class class_) {
		return null != class_.getAppliedStereotype("Basic" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "Metaclass"); //$NON-NLS-1$
	}

	public static Set getExtensions(org.eclipse.uml2.Class class_) {
		Set extensions = new HashSet();

		if (null != class_ && class_.isMetaclass()) {
			Resource resource = class_.eResource();

			if (null != resource) {
				FilteredUsageCrossReferencer.Filter filter = new FilteredUsageCrossReferencer.Filter() {

					public boolean accept(EStructuralFeature eStructuralFeature) {
						return UML2Package.eINSTANCE.getExtension_Metaclass() == eStructuralFeature;
					}
				};

				ResourceSet resourceSet = resource.getResourceSet();

				Iterator settings = null == resourceSet
					? FilteredUsageCrossReferencer.find(class_, resource,
						filter).iterator()
					: FilteredUsageCrossReferencer.find(class_, resourceSet,
						filter).iterator();

				while (settings.hasNext()) {
					extensions.add(((EStructuralFeature.Setting) settings
						.next()).getEObject());
				}
			}
		}

		return extensions;
	}
}