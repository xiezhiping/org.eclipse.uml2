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
 * $Id: BehavioralFeatureOperations.java,v 1.4 2005/05/18 16:38:31 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Parameter;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behavioral Feature</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.BehavioralFeature#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class BehavioralFeatureOperations extends UML2Operations {

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
	private BehavioralFeatureOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if n.oclIsKindOf(BehavioralFeature)
	 * then
	 *     if ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->notEmpty()
	 *     then Set{}->include(self)->include(n)->isUnique( bf | bf.parameter->collect(type))
	 *     else true
	 *     endif
	 * else true
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(BehavioralFeature behavioralFeature, NamedElement n, Namespace ns) {

		if (BehavioralFeature.class.isInstance(n)) {

			for (Iterator namesOfMember = ns
					.getNamesOfMember(behavioralFeature).iterator(); namesOfMember
					.hasNext();) {

				if (ns.getNamesOfMember(n).contains(namesOfMember.next())) {
					Iterator bfParameters = behavioralFeature.getParameters()
							.iterator();
					Iterator nParameters = ((BehavioralFeature) n)
							.getParameters().iterator();

					while (bfParameters.hasNext() && nParameters.hasNext()) {

						if (!safeEquals(((Parameter) bfParameters.next())
							.getType(), ((Parameter) nParameters.next())
							.getType())) {

							return true;
						}
					}

					return bfParameters.hasNext() || nParameters.hasNext();
				}
			}
		}

		return true;
	}

} // BehavioralFeatureOperations