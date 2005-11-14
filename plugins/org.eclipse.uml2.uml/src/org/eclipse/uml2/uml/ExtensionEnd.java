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
 * $Id: ExtensionEnd.java,v 1.1 2005/11/14 22:26:01 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ExtensionEnd is a kind of Property that is always typed by a Stereotype. An ExtensionEnd is never navigable. If it was navigable, it would be a property of the extended classifier. Since a profile is not allowed to change the referenced metamodel, it is not possible to add properties to the extended classifier. As a consequence, an ExtensionEnd can only be owned by an Extension. The aggregation of an ExtensionEnd is always composite. The default multiplicity of an ExtensionEnd is 0..1.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExtensionEnd()
 * @model
 * @generated
 */
public interface ExtensionEnd
		extends Property {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of ExtensionEnd is 0..1 or 1.
	 * (self->lowerBound() = 0 or self->lowerBound() = 1) and self->upperBound() = 1
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation of an ExtensionEnd is composite.
	 * self.aggregation = #composite
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAggregation(DiagnosticChain diagnostics, Map context);

} // ExtensionEnd
