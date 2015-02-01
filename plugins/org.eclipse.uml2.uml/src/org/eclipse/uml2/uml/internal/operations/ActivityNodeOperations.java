/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.StructuredActivityNode;

import org.eclipse.uml2.uml.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#containingActivity() <em>Containing Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityNode#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeOperations
		extends RedefinableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity that directly or indirectly contains this ActivityNode.
	 * result = (if inStructuredNode<>null then inStructuredNode.containingActivity()
	 * else activity
	 * endif)
	 * <p>From package UML::Activities.</p>
	 * @param activityNode The receiving '<em><b>Activity Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Activity containingActivity(ActivityNode activityNode) {
		StructuredActivityNode inStructuredNode = activityNode
			.getInStructuredNode();

		return inStructuredNode != null
			? inStructuredNode.containingActivity()
			: activityNode.getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = (redefiningElement.oclIsKindOf(ActivityNode))
	 * <p>From package UML::Activities.</p>
	 * @param activityNode The receiving '<em><b>Activity Node</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(ActivityNode activityNode,
			RedefinableElement redefiningElement) {
		return redefiningElement instanceof ActivityNode;
	}

} // ActivityNodeOperations