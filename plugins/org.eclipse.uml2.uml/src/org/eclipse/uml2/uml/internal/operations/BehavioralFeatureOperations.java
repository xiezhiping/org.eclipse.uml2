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
 * $Id: BehavioralFeatureOperations.java,v 1.2 2005/11/30 21:21:17 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behavioral Feature</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class BehavioralFeatureOperations extends UMLOperations {

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
	 * The query isDistinguishableFrom() determines whether two BehavioralFeatures may coexist in the same Namespace. It specifies that they have to have different signatures.
	 * result = if n.oclIsKindOf(BehavioralFeature)
	 * then
	 *   if ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->notEmpty()
	 *   then Set{}->including(self)->including(n)->isUnique(bf | bf.ownedParameter->collect(type))
	 *   else true
	 *   endif
	 * else true
	 * endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(
			BehavioralFeature behavioralFeature, NamedElement n, Namespace ns) {

		if (n instanceof BehavioralFeature) {
			List namesOfMemberN = ns.getNamesOfMember(n);

			for (Iterator namesOfMemberBF = ns.getNamesOfMember(
				behavioralFeature).iterator(); namesOfMemberBF.hasNext();) {

				if (namesOfMemberN.contains(namesOfMemberBF.next())) {
					Iterator bfParameters = behavioralFeature
						.getOwnedParameters().iterator();
					Iterator nParameters = ((BehavioralFeature) n)
						.getOwnedParameters().iterator();

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
