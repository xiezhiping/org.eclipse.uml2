/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioralFeatureOperations.java,v 1.8 2007/05/03 21:11:51 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behavioral Feature</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#createReturnResult(java.lang.String, org.eclipse.uml2.uml.Type) <em>Create Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioralFeature#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioralFeatureOperations
		extends NamespaceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a return result parameter with the specified name and type.
	 * @param behavioralFeature The receiving '<em><b>Behavioral Feature</b></em>' model object.
	 * @param name The name for the new return result, or null.
	 * @param type The type for the new return result, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Parameter createReturnResult(
			BehavioralFeature behavioralFeature, String name, Type type) {
		Parameter returnResult = behavioralFeature.createOwnedParameter(name,
			type);
		returnResult.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		return returnResult;
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
	 * @param behavioralFeature The receiving '<em><b>Behavioral Feature</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(
			BehavioralFeature behavioralFeature, NamedElement n, Namespace ns) {

		if (n instanceof BehavioralFeature) {
			EList<String> namesOfMemberN = ns.getNamesOfMember(n);

			for (String nameOfMemberBF : ns.getNamesOfMember(behavioralFeature)) {

				if (namesOfMemberN.contains(nameOfMemberBF)) {
					Iterator<Parameter> bfParameters = behavioralFeature
						.getOwnedParameters().iterator();
					Iterator<Parameter> nParameters = ((BehavioralFeature) n)
						.getOwnedParameters().iterator();

					while (bfParameters.hasNext() && nParameters.hasNext()) {

						if (!safeEquals(bfParameters.next().getType(),
							nParameters.next().getType())) {

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
