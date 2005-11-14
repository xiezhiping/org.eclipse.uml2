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
 * $Id: PackageableElement.java,v 1.1 2005/11/14 22:25:57 khussey Exp $
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A packageable element indicates a named element that may be owned directly by a package.
 * PackageableElements are extended to enable any such element to serve as a template parameter.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getPackageableElement()
 * @model abstract="true"
 * @generated
 */
public interface PackageableElement
		extends NamedElement, ParameterableElement {
} // PackageableElement
