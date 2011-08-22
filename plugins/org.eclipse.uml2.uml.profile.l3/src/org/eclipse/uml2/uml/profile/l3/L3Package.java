/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.profile.l3;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.profile.l3.L3Factory
 * @model kind="package"
 * @generated
 */
public interface L3Package
		extends EPackage {

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "l3"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/uml2/4.0.0/UML/Profile/L3"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "l3"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	L3Package eINSTANCE = org.eclipse.uml2.uml.profile.l3.internal.impl.L3PackageImpl
		.init();

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l3.internal.impl.BuildComponentImpl <em>Build Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.BuildComponentImpl
	 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.L3PackageImpl#getBuildComponent()
	 * @generated
	 */
	int BUILD_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Build Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Build Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l3.internal.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.MetamodelImpl
	 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.L3PackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l3.internal.impl.SystemModelImpl <em>System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.SystemModelImpl
	 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.L3PackageImpl#getSystemModel()
	 * @generated
	 */
	int SYSTEM_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l3.BuildComponent <em>Build Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Component</em>'.
	 * @see org.eclipse.uml2.uml.profile.l3.BuildComponent
	 * @generated
	 */
	EClass getBuildComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l3.BuildComponent#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.uml2.uml.profile.l3.BuildComponent#getBase_Component()
	 * @see #getBuildComponent()
	 * @generated
	 */
	EReference getBuildComponent_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l3.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see org.eclipse.uml2.uml.profile.l3.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l3.Metamodel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.uml2.uml.profile.l3.Metamodel#getBase_Model()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Base_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l3.SystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Model</em>'.
	 * @see org.eclipse.uml2.uml.profile.l3.SystemModel
	 * @generated
	 */
	EClass getSystemModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l3.SystemModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.uml2.uml.profile.l3.SystemModel#getBase_Model()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_Base_Model();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	L3Factory getL3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l3.internal.impl.BuildComponentImpl <em>Build Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.BuildComponentImpl
		 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.L3PackageImpl#getBuildComponent()
		 * @generated
		 */
		EClass BUILD_COMPONENT = eINSTANCE.getBuildComponent();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_COMPONENT__BASE_COMPONENT = eINSTANCE
			.getBuildComponent_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l3.internal.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.MetamodelImpl
		 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.L3PackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__BASE_MODEL = eINSTANCE.getMetamodel_Base_Model();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l3.internal.impl.SystemModelImpl <em>System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.SystemModelImpl
		 * @see org.eclipse.uml2.uml.profile.l3.internal.impl.L3PackageImpl#getSystemModel()
		 * @generated
		 */
		EClass SYSTEM_MODEL = eINSTANCE.getSystemModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__BASE_MODEL = eINSTANCE
			.getSystemModel_Base_Model();

	}

} //L3Package
