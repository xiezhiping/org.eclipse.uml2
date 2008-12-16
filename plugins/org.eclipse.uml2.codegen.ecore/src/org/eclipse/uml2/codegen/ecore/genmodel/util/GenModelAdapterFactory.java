/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200, 247980
 *
 * $Id: GenModelAdapterFactory.java,v 1.6 2008/12/16 15:52:48 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.codegen.ecore.genmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage
 * @generated
 */
public class GenModelAdapterFactory
		extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenModelSwitch<Adapter> modelSwitch = new GenModelSwitch<Adapter>() {

		@Override
		public Adapter caseGenBase(GenBase object) {
			return createGenBaseAdapter();
		}

		@Override
		public Adapter caseGenClass(GenClass object) {
			return createGenClassAdapter();
		}

		@Override
		public Adapter caseGenClassifier(GenClassifier object) {
			return createGenClassifierAdapter();
		}

		@Override
		public Adapter caseGenDataType(GenDataType object) {
			return createGenDataTypeAdapter();
		}

		@Override
		public Adapter caseGenEnum(GenEnum object) {
			return createGenEnumAdapter();
		}

		@Override
		public Adapter caseGenEnumLiteral(GenEnumLiteral object) {
			return createGenEnumLiteralAdapter();
		}

		@Override
		public Adapter caseGenFeature(GenFeature object) {
			return createGenFeatureAdapter();
		}

		@Override
		public Adapter caseGenModel(GenModel object) {
			return createGenModelAdapter();
		}

		@Override
		public Adapter caseGenOperation(GenOperation object) {
			return createGenOperationAdapter();
		}

		@Override
		public Adapter caseGenPackage(GenPackage object) {
			return createGenPackageAdapter();
		}

		@Override
		public Adapter caseGenParameter(GenParameter object) {
			return createGenParameterAdapter();
		}

		@Override
		public Adapter caseGenTypedElement(GenTypedElement object) {
			return createGenTypedElementAdapter();
		}

		@Override
		public Adapter caseGenModel_GenBase(
				org.eclipse.emf.codegen.ecore.genmodel.GenBase object) {
			return createGenModel_GenBaseAdapter();
		}

		@Override
		public Adapter caseGenModel_GenClassifier(
				org.eclipse.emf.codegen.ecore.genmodel.GenClassifier object) {
			return createGenModel_GenClassifierAdapter();
		}

		@Override
		public Adapter caseGenModel_GenClass(
				org.eclipse.emf.codegen.ecore.genmodel.GenClass object) {
			return createGenModel_GenClassAdapter();
		}

		@Override
		public Adapter caseGenModel_GenDataType(
				org.eclipse.emf.codegen.ecore.genmodel.GenDataType object) {
			return createGenModel_GenDataTypeAdapter();
		}

		@Override
		public Adapter caseGenModel_GenEnum(
				org.eclipse.emf.codegen.ecore.genmodel.GenEnum object) {
			return createGenModel_GenEnumAdapter();
		}

		@Override
		public Adapter caseGenModel_GenEnumLiteral(
				org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral object) {
			return createGenModel_GenEnumLiteralAdapter();
		}

		@Override
		public Adapter caseGenModel_GenTypedElement(
				org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement object) {
			return createGenModel_GenTypedElementAdapter();
		}

		@Override
		public Adapter caseGenModel_GenFeature(
				org.eclipse.emf.codegen.ecore.genmodel.GenFeature object) {
			return createGenModel_GenFeatureAdapter();
		}

		@Override
		public Adapter caseGenModel_GenModel(
				org.eclipse.emf.codegen.ecore.genmodel.GenModel object) {
			return createGenModel_GenModelAdapter();
		}

		@Override
		public Adapter caseGenModel_GenOperation(
				org.eclipse.emf.codegen.ecore.genmodel.GenOperation object) {
			return createGenModel_GenOperationAdapter();
		}

		@Override
		public Adapter caseGenModel_GenPackage(
				org.eclipse.emf.codegen.ecore.genmodel.GenPackage object) {
			return createGenModel_GenPackageAdapter();
		}

		@Override
		public Adapter caseGenModel_GenParameter(
				org.eclipse.emf.codegen.ecore.genmodel.GenParameter object) {
			return createGenModel_GenParameterAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenBase <em>Gen Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenBase
	 * @generated
	 */
	public Adapter createGenBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenClass
	 * @generated
	 */
	public Adapter createGenClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier <em>Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier
	 * @generated
	 */
	public Adapter createGenClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenDataType
	 * @generated
	 */
	public Adapter createGenDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenEnum <em>Gen Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenEnum
	 * @generated
	 */
	public Adapter createGenEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenEnumLiteral <em>Gen Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenEnumLiteral
	 * @generated
	 */
	public Adapter createGenEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
	 * @generated
	 */
	public Adapter createGenFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModel
	 * @generated
	 */
	public Adapter createGenModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenOperation <em>Gen Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
	 * @generated
	 */
	public Adapter createGenOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
	 * @generated
	 */
	public Adapter createGenPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenParameter <em>Gen Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenParameter
	 * @generated
	 */
	public Adapter createGenParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenTypedElement <em>Gen Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenTypedElement
	 * @generated
	 */
	public Adapter createGenTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenBase <em>Gen Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenBase
	 * @generated
	 */
	public Adapter createGenModel_GenBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier <em>Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenClassifier
	 * @generated
	 */
	public Adapter createGenModel_GenClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenClass
	 * @generated
	 */
	public Adapter createGenModel_GenClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenDataType
	 * @generated
	 */
	public Adapter createGenModel_GenDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnum <em>Gen Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenEnum
	 * @generated
	 */
	public Adapter createGenModel_GenEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral <em>Gen Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral
	 * @generated
	 */
	public Adapter createGenModel_GenEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement <em>Gen Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement
	 * @generated
	 */
	public Adapter createGenModel_GenTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenFeature
	 * @generated
	 */
	public Adapter createGenModel_GenFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModel
	 * @generated
	 */
	public Adapter createGenModel_GenModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenOperation <em>Gen Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenOperation
	 * @generated
	 */
	public Adapter createGenModel_GenOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenPackage
	 * @generated
	 */
	public Adapter createGenModel_GenPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.codegen.ecore.genmodel.GenParameter <em>Gen Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenParameter
	 * @generated
	 */
	public Adapter createGenModel_GenParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GenModelAdapterFactory
