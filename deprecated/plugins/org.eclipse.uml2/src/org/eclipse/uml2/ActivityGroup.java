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
 * $Id: ActivityGroup.java,v 1.5 2005/04/04 20:11:15 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Activity groups are a generic grouping construct for nodes and edges. Nodes and edges can belong to more than group. They have no inherent semantics and can be used for various purposes. Subclasses of ActivityGroup may add semantics. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup extends Element{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Group</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getActivityGroup_SuperGroup()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwner=''"
	 *        annotation="redefined eOpposite='subgroup' eOpposite.containment='false' eOpposite.lowerBound='0' eOpposite.upperBound='-1'"
	 * @generated
	 */
	ActivityGroup getSuperGroup();

	/**
	 * Returns the value of the '<em><b>Activity Group activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Activity#getGroups <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Group activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity containing the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Group activity</em>' container reference.
	 * @see #setActivityGroup_activity(Activity)
	 * @see org.eclipse.uml2.UML2Package#getActivityGroup_ActivityGroup_activity()
	 * @see org.eclipse.uml2.Activity#getGroups
	 * @model opposite="group" volatile="true"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwner=''"
	 *        annotation="redefines org.eclipse.uml2.ActivityNode#getActivity=''"
	 * @generated
	 */
	Activity getActivityGroup_activity();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Group activity</em>' container reference.
	 * @see #getActivityGroup_activity()
	 * @generated
	 */
	void setActivityGroup_activity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='subgroup' eOpposite='superGroup' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.ActivityGroup' eOpposite.lowerBound='0'"
	 *        annotation="subsets org.eclipse.uml2.Element#getOwnedElements=''" 
	 * @generated
	 */
	EList getSubgroups();

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='containedEdge' eOpposite='inGroup' derived='true' eOpposite.upperBound='-1' eType='org.eclipse.uml2.ActivityEdge' eOpposite.lowerBound='0'" 
	 * @generated
	 */
    EList getContainedEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='containedNode' eOpposite='inGroup' derived='true' eOpposite.upperBound='-1' eType='org.eclipse.uml2.ActivityNode' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getContainedNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='true' containment='false' name='activity' eOpposite='node' derived='false' eOpposite.upperBound='-1' eType='org.eclipse.uml2.Activity' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	Activity getActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="feature eOpposite.containment='true' containment='false' name='activity' eOpposite='node' derived='false' eOpposite.upperBound='-1' eType='org.eclipse.uml2.Activity' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='ownedElement' eOpposite='owner' derived='true' eOpposite.upperBound='1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 *        annotation="feature eOpposite.containment='false' containment='false' name='owner' eOpposite='ownedElement' derived='true' eOpposite.upperBound='-1' eType='org.eclipse.uml2.Element' eOpposite.lowerBound='0'" 
	 * @generated
	 */
	Element getOwner();

} // ActivityGroup
