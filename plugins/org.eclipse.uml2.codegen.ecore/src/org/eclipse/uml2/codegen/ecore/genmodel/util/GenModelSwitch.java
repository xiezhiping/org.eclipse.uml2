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
 * $Id: GenModelSwitch.java,v 1.1 2005/05/17 22:06:28 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.codegen.ecore.genmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage
 * @generated
 */
public class GenModelSwitch {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelSwitch() {
		if (modelPackage == null) {
			modelPackage = GenModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					(EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GenModelPackage.GEN_BASE: {
			GenBase genBase = (GenBase) theEObject;
			Object result = caseGenBase(genBase);
			if (result == null)
				result = caseGenModel_GenBase(genBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_CLASS: {
			GenClass genClass = (GenClass) theEObject;
			Object result = caseGenClass(genClass);
			if (result == null)
				result = caseGenModel_GenClass(genClass);
			if (result == null)
				result = caseGenClassifier(genClass);
			if (result == null)
				result = caseGenModel_GenClassifier(genClass);
			if (result == null)
				result = caseGenBase(genClass);
			if (result == null)
				result = caseGenModel_GenBase(genClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_CLASSIFIER: {
			GenClassifier genClassifier = (GenClassifier) theEObject;
			Object result = caseGenClassifier(genClassifier);
			if (result == null)
				result = caseGenModel_GenClassifier(genClassifier);
			if (result == null)
				result = caseGenBase(genClassifier);
			if (result == null)
				result = caseGenModel_GenBase(genClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_DATA_TYPE: {
			GenDataType genDataType = (GenDataType) theEObject;
			Object result = caseGenDataType(genDataType);
			if (result == null)
				result = caseGenModel_GenDataType(genDataType);
			if (result == null)
				result = caseGenClassifier(genDataType);
			if (result == null)
				result = caseGenModel_GenClassifier(genDataType);
			if (result == null)
				result = caseGenBase(genDataType);
			if (result == null)
				result = caseGenModel_GenBase(genDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_ENUM: {
			GenEnum genEnum = (GenEnum) theEObject;
			Object result = caseGenEnum(genEnum);
			if (result == null)
				result = caseGenModel_GenEnum(genEnum);
			if (result == null)
				result = caseGenDataType(genEnum);
			if (result == null)
				result = caseGenModel_GenDataType(genEnum);
			if (result == null)
				result = caseGenClassifier(genEnum);
			if (result == null)
				result = caseGenModel_GenClassifier(genEnum);
			if (result == null)
				result = caseGenBase(genEnum);
			if (result == null)
				result = caseGenModel_GenBase(genEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_ENUM_LITERAL: {
			GenEnumLiteral genEnumLiteral = (GenEnumLiteral) theEObject;
			Object result = caseGenEnumLiteral(genEnumLiteral);
			if (result == null)
				result = caseGenModel_GenEnumLiteral(genEnumLiteral);
			if (result == null)
				result = caseGenBase(genEnumLiteral);
			if (result == null)
				result = caseGenModel_GenBase(genEnumLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_FEATURE: {
			GenFeature genFeature = (GenFeature) theEObject;
			Object result = caseGenFeature(genFeature);
			if (result == null)
				result = caseGenModel_GenFeature(genFeature);
			if (result == null)
				result = caseGenBase(genFeature);
			if (result == null)
				result = caseGenModel_GenBase(genFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_MODEL: {
			GenModel genModel = (GenModel) theEObject;
			Object result = caseGenModel(genModel);
			if (result == null)
				result = caseGenModel_GenModel(genModel);
			if (result == null)
				result = caseGenBase(genModel);
			if (result == null)
				result = caseGenModel_GenBase(genModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_OPERATION: {
			GenOperation genOperation = (GenOperation) theEObject;
			Object result = caseGenOperation(genOperation);
			if (result == null)
				result = caseGenModel_GenOperation(genOperation);
			if (result == null)
				result = caseGenBase(genOperation);
			if (result == null)
				result = caseGenModel_GenBase(genOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_PACKAGE: {
			GenPackage genPackage = (GenPackage) theEObject;
			Object result = caseGenPackage(genPackage);
			if (result == null)
				result = caseGenModel_GenPackage(genPackage);
			if (result == null)
				result = caseGenBase(genPackage);
			if (result == null)
				result = caseGenModel_GenBase(genPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GenModelPackage.GEN_PARAMETER: {
			GenParameter genParameter = (GenParameter) theEObject;
			Object result = caseGenParameter(genParameter);
			if (result == null)
				result = caseGenModel_GenParameter(genParameter);
			if (result == null)
				result = caseGenBase(genParameter);
			if (result == null)
				result = caseGenModel_GenBase(genParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenBase(GenBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenClass(GenClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenClassifier(GenClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenDataType(GenDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenEnum(GenEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenEnumLiteral(GenEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenFeature(GenFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel(GenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenOperation(GenOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenPackage(GenPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenParameter(GenParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenBase(
			org.eclipse.emf.codegen.ecore.genmodel.GenBase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenClassifier(
			org.eclipse.emf.codegen.ecore.genmodel.GenClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenClass(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenDataType(
			org.eclipse.emf.codegen.ecore.genmodel.GenDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenEnum(
			org.eclipse.emf.codegen.ecore.genmodel.GenEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenEnumLiteral(
			org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenFeature(
			org.eclipse.emf.codegen.ecore.genmodel.GenFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenModel(
			org.eclipse.emf.codegen.ecore.genmodel.GenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenOperation(
			org.eclipse.emf.codegen.ecore.genmodel.GenOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenPackage(
			org.eclipse.emf.codegen.ecore.genmodel.GenPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gen Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gen Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenModel_GenParameter(
			org.eclipse.emf.codegen.ecore.genmodel.GenParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //GenModelSwitch
