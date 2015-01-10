/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 451350
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.GenOperation#getCacheAdapterScope <em>Cache Adapter Scope</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenOperation()
 * @model
 * @generated
 */
public interface GenOperation
		extends org.eclipse.emf.codegen.ecore.genmodel.GenOperation,
		GenTypedElement {

	/**
	 * Returns the value of the '<em><b>Cache Adapter Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Adapter Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Adapter Scope</em>' attribute.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope
	 * @see #setCacheAdapterScope(GenCacheAdapterScope)
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage#getGenOperation_CacheAdapterScope()
	 * @model
	 * @generated
	 */
	GenCacheAdapterScope getCacheAdapterScope();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenOperation#getCacheAdapterScope <em>Cache Adapter Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Adapter Scope</em>' attribute.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope
	 * @see #getCacheAdapterScope()
	 * @generated
	 */
	void setCacheAdapterScope(GenCacheAdapterScope value);

	boolean isCached();

	boolean isResourceCacheAdapterScope();

	boolean isDuplicate();

	boolean isRedefinition();

	List<org.eclipse.emf.codegen.ecore.genmodel.GenOperation> getRedefinedGenOperations();

	/**
	 * @since 1.3
	 */
	String getOCLBody();

	/**
	 * @since 1.3
	 */
	boolean hasOCLBody();

} // GenOperation
