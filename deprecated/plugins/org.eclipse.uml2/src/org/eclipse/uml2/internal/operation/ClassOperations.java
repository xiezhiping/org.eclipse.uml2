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
 * $Id: ClassOperations.java,v 1.6 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
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
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Class#inherit(java.util.Set) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ClassOperations extends UML2Operations {

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
	private ClassOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * inhs->excluding(inh | ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
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

		return Collections.unmodifiableSet(inherit);
	}

	// <!-- begin-custom-operations -->

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
					? FilteredUsageCrossReferencer.find(class_,
						resource, filter).iterator()
					: FilteredUsageCrossReferencer.find(class_,
						resourceSet, filter).iterator();

				while (settings.hasNext()) {
					extensions.add(((EStructuralFeature.Setting) settings
						.next()).getEObject());
				}
			}
		}

		return extensions;
	}

	// <!-- end-custom-operations -->

} // ClassOperations