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
 * $Id: ExtensionEndOperations.java,v 1.8 2005/12/12 18:11:59 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;

import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extension End</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#validateAggregation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#setLower(int) <em>Set Lower</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ExtensionEndOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExtensionEndOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of ExtensionEnd is 0..1 or 1.
	 * (self->lowerBound() = 0 or self->lowerBound() = 1) and self->upperBound() = 1
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(ExtensionEnd extensionEnd,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.EXTENSION_END__MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extensionEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extensionEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation of an ExtensionEnd is composite.
	 * self.aggregation = #composite
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAggregation(ExtensionEnd extensionEnd,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.EXTENSION_END__AGGREGATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAggregation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extensionEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extensionEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query lowerBound() returns the lower bound of the multiplicity as an Integer. This is a redefinition of the default
	 * 
	 * lower bound, which normally, for MultiplicityElements, evaluates to 1 if empty.
	 * result = lowerBound = if lowerValue->isEmpty() then 0 else lowerValue->IntegerValue() endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(ExtensionEnd extensionEnd) {
		ValueSpecification lowerValue = extensionEnd.getLowerValue();

		if (lowerValue instanceof LiteralInteger) {
			return lowerValue.integerValue();
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) extensionEnd;
			return ((Integer) basicEObjectImpl
				.eVirtualGet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER),
					new Integer(0))).intValue();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int getLower(ExtensionEnd extensionEnd) {
		return extensionEnd.lowerBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setLower(ExtensionEnd extensionEnd, int newLower) {
		ValueSpecification lowerValue = extensionEnd.getLowerValue();

		if (lowerValue != null) {

			if (lowerValue instanceof LiteralInteger) {
				((LiteralInteger) lowerValue).setValue(newLower);
			} else {
				throw new IllegalArgumentException(String.valueOf(newLower));
			}
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) extensionEnd;
			basicEObjectImpl
				.eVirtualSet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER),
					new Integer(newLower));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isSetLower(ExtensionEnd extensionEnd) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) extensionEnd;
		return basicEObjectImpl
			.eVirtualIsSet(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void unsetLower(ExtensionEnd extensionEnd) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) extensionEnd;
		basicEObjectImpl
			.eVirtualUnset(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER));
	}

} // ExtensionEndOperations