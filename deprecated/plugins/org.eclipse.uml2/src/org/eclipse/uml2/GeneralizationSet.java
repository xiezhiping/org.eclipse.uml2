/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: GeneralizationSet.java,v 1.3 2004/05/11 15:24:00 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.GeneralizationSet#isCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.eclipse.uml2.GeneralizationSet#isDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.eclipse.uml2.GeneralizationSet#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link org.eclipse.uml2.GeneralizationSet#getGeneralizations <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getGeneralizationSet()
 * @model 
 * @generated
 */
public interface GeneralizationSet extends PackageableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Covering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see org.eclipse.uml2.UML2Package#getGeneralizationSet_IsCovering()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isCovering();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.GeneralizationSet#isCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #isCovering()
	 * @generated
	 */
	void setIsCovering(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see org.eclipse.uml2.UML2Package#getGeneralizationSet_IsDisjoint()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isDisjoint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.GeneralizationSet#isDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Powertype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Classifier#getPowertypeExtents <em>Powertype Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype</em>' reference.
	 * @see #setPowertype(Classifier)
	 * @see org.eclipse.uml2.UML2Package#getGeneralizationSet_Powertype()
	 * @see org.eclipse.uml2.Classifier#getPowertypeExtents
	 * @model opposite="powertypeExtent"
	 * @generated
	 */
	Classifier getPowertype();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.GeneralizationSet#getPowertype <em>Powertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype</em>' reference.
	 * @see #getPowertype()
	 * @generated
	 */
	void setPowertype(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Generalization#getGeneralizationSets <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getGeneralizationSet_Generalization()
	 * @see org.eclipse.uml2.Generalization#getGeneralizationSets
	 * @model type="org.eclipse.uml2.Generalization" opposite="generalizationSet" ordered="false"
	 * @generated
	 */
	EList getGeneralizations();

} // GeneralizationSet
