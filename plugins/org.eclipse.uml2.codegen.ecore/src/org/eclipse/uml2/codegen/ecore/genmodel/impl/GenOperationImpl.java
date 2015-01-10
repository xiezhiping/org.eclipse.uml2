/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 208016, 204200
 *   Kenn Hussey - 286329
 *   Kenn Hussey (CEA) - 322715, 418466, 451350
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.codegen.ecore.Generator;
import org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.GenOperation;
import org.eclipse.uml2.codegen.ecore.genmodel.GenTypedElement;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenOperationImpl#getCacheAdapterScope <em>Cache Adapter Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenOperationImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenOperationImpl
		implements GenOperation {

	/**
	 * The default value of the '{@link #getCacheAdapterScope() <em>Cache Adapter Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAdapterScope()
	 * @generated
	 * @ordered
	 */
	protected static final GenCacheAdapterScope CACHE_ADAPTER_SCOPE_EDEFAULT = GenCacheAdapterScope.NONE_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getCacheAdapterScope() <em>Cache Adapter Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_ADAPTER_SCOPE_EFLAG_OFFSET = 8;

	/**
	 * The flags representing the default value of the '{@link #getCacheAdapterScope() <em>Cache Adapter Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_ADAPTER_SCOPE_EFLAG_DEFAULT = CACHE_ADAPTER_SCOPE_EDEFAULT
		.ordinal() << CACHE_ADAPTER_SCOPE_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link GenCacheAdapterScope Gen Cache Adapter Scope}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final GenCacheAdapterScope[] CACHE_ADAPTER_SCOPE_EFLAG_VALUES = GenCacheAdapterScope
		.values();

	/**
	 * The flags representing the value of the '{@link #getCacheAdapterScope() <em>Cache Adapter Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAdapterScope()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_ADAPTER_SCOPE_EFLAG = 0x3 << CACHE_ADAPTER_SCOPE_EFLAG_OFFSET;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int EOFFSET_CORRECTION = GenModelPackage.Literals.GEN_OPERATION
		.getFeatureID(GenModelPackage.Literals.GEN_OPERATION__CACHE_ADAPTER_SCOPE)
		- GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.GEN_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCacheAdapterScope getCacheAdapterScopeGen() {
		return CACHE_ADAPTER_SCOPE_EFLAG_VALUES[(eFlags & CACHE_ADAPTER_SCOPE_EFLAG) >>> CACHE_ADAPTER_SCOPE_EFLAG_OFFSET];
	}

	public GenCacheAdapterScope getCacheAdapterScope() {

		if (isDuplicate()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenOperation redefinedGenOperation : getRedefinedGenOperations()) {

				if (getName().equals(redefinedGenOperation.getName())) {
					return UML2GenModelUtil
						.getCacheAdapterScope(redefinedGenOperation);
				}
			}
		}

		return getCacheAdapterScopeGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheAdapterScope(GenCacheAdapterScope newCacheAdapterScope) {
		GenCacheAdapterScope oldCacheAdapterScope = CACHE_ADAPTER_SCOPE_EFLAG_VALUES[(eFlags & CACHE_ADAPTER_SCOPE_EFLAG) >>> CACHE_ADAPTER_SCOPE_EFLAG_OFFSET];
		if (newCacheAdapterScope == null)
			newCacheAdapterScope = CACHE_ADAPTER_SCOPE_EDEFAULT;
		eFlags = eFlags
			& ~CACHE_ADAPTER_SCOPE_EFLAG
			| newCacheAdapterScope.ordinal() << CACHE_ADAPTER_SCOPE_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE
					+ EOFFSET_CORRECTION, oldCacheAdapterScope,
				newCacheAdapterScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				return getCacheAdapterScope();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				setCacheAdapterScope((GenCacheAdapterScope) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				setCacheAdapterScope(CACHE_ADAPTER_SCOPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID - EOFFSET_CORRECTION) {
			case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
				return (eFlags & CACHE_ADAPTER_SCOPE_EFLAG) != CACHE_ADAPTER_SCOPE_EFLAG_DEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GenBase.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == GenTypedElement.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == GenOperation.class) {
			switch (baseFeatureID - EOFFSET_CORRECTION) {
				case GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE :
					return GenModelPackage.GEN_OPERATION__CACHE_ADAPTER_SCOPE
						+ EOFFSET_CORRECTION;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cacheAdapterScope: "); //$NON-NLS-1$
		result
			.append(CACHE_ADAPTER_SCOPE_EFLAG_VALUES[(eFlags & CACHE_ADAPTER_SCOPE_EFLAG) >>> CACHE_ADAPTER_SCOPE_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
	}

	private org.eclipse.emf.codegen.ecore.genmodel.GenModel genModel;

	protected void setGenModel(
			org.eclipse.emf.codegen.ecore.genmodel.GenModel genModel) {
		this.genModel = genModel;
	}

	@Override
	public GenClass getGenClass() {
		return isDuplicate()
			? findGenClass(Generator
				.getEcoreContainingClass(getEcoreOperation()))
			: super.getGenClass();
	}

	@Override
	public org.eclipse.emf.codegen.ecore.genmodel.GenModel getGenModel() {
		return isDuplicate()
			? genModel
			: super.getGenModel();
	}

	protected String format(String name, String separator, String prefix,
			boolean includePrefix) {
		List<String> parsedName = new ArrayList<String>();

		if (prefix != null) {

			if (name.startsWith(prefix)) {
				name = name.substring(prefix.length());
			}

			if (includePrefix) {
				parsedName = CodeGenUtil.parseName(prefix, '_');
			}
		}

		if (name.length() != 0)
			parsedName.addAll(CodeGenUtil.parseName(name, '_'));

		StringBuffer result = new StringBuffer();

		for (Iterator<String> i = parsedName.iterator(); i.hasNext();) {
			String nameComponent = i.next();
			result.append(result.length() == 0
				? nameComponent
				: capName(nameComponent));

			if (i.hasNext() && nameComponent.length() > 1) {
				result.append(separator);
			}
		}

		return result.length() == 0 && prefix != null
			? prefix
			: result.toString();
	}

	@Override
	public String getName() {

		if (isInvariant()) {
			String prefix = UML2GenModelUtil.getInvariantPrefix(getGenModel());

			if (!isBlank(prefix)) {
				return format(super.getName(), "", prefix, true); //$NON-NLS-1$
			}
		}

		return super.getName();
	}

	@Override
	protected org.eclipse.emf.codegen.ecore.genmodel.GenOperation findGenOperation(
			EOperation ecoreOperation) {

		return UML2GenModelUtil.findGenOperation(getGenClass(), ecoreOperation);
	}

	public boolean isCached() {
		return GenCacheAdapterScope.NONE_LITERAL != getCacheAdapterScope();
	}

	public boolean isResourceCacheAdapterScope() {
		return GenCacheAdapterScope.RESOURCE_LITERAL == getCacheAdapterScope();
	}

	public boolean isDuplicate() {
		return Generator.isDuplicate(getEcoreOperation());
	}

	public boolean isRedefinition() {
		return Generator.isRedefinition(getEcoreOperation());
	}

	public List<org.eclipse.emf.codegen.ecore.genmodel.GenOperation> getRedefinedGenOperations() {
		List<org.eclipse.emf.codegen.ecore.genmodel.GenOperation> redefinedGenOperations = new ArrayList<org.eclipse.emf.codegen.ecore.genmodel.GenOperation>();

		for (EOperation redefinedEcoreOperation : Generator
			.getRedefinedEcoreOperations(getEcoreOperation())) {

			redefinedGenOperations
				.add(findGenOperation(redefinedEcoreOperation));
		}

		return redefinedGenOperations;
	}

	@Override
	protected void reconcileSettings(
			org.eclipse.emf.codegen.ecore.genmodel.GenOperation oldGenOperationVersion) {
		super.reconcileSettings(oldGenOperationVersion);

		setCacheAdapterScope(UML2GenModelUtil
			.getCacheAdapterScope(oldGenOperationVersion));
	}

	@Override
	public boolean isOverrideOf(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass,
			org.eclipse.emf.codegen.ecore.genmodel.GenOperation genOperation) {
		return false;
	}

	protected static final Pattern NEWLINE_PATTERN = Pattern
		.compile("([\n\r]+)");//$NON-NLS-1$

	/**
	 * Break up the OCL expression to handle multiple line breaks.
	 * 
	 * @param s 
	 * 			The string to be sanitized
	 * @return The multi-line version of the string.
	 * 
	 */
	private String splitOCLExpression(String s) {

		if (isBlank(s)) {
			return s;
		}

		StringBuilder result = new StringBuilder(s.length());
		String lineSeparator = getGenModel().getLineDelimiter();

		String[] splitStrings = NEWLINE_PATTERN.split(s);
		int splitStringsLength = splitStrings.length;

		if (splitStringsLength == 1) {
			return splitStrings[0];
		}

		for (int i = 0; i < splitStrings.length; i++) {

			String splitString = splitStrings[i];

			if (i == 0) {
				result.append(splitString + "\"+"); //$NON-NLS-1$
				result.append(lineSeparator);

			} else if (i == splitStringsLength - 1) {
				result.append("\"" + splitString); //$NON-NLS-1$

			} else {
				result.append("\"" + splitString + "\"+"); //$NON-NLS-1$ //$NON-NLS-2$ 
				result.append(lineSeparator);
			}
		}
		return result.toString();
	}

	public String getOCLBody() {
		return splitOCLExpression(EcoreUtil.getAnnotation(getEcoreOperation(),
			UML2GenModelUtil.UML2_GEN_MODEL_PACKAGE_1_1_NS_URI, "body")); //$NON-NLS-1$
	}

	public boolean hasOCLBody() {
		return !isBlank(getOCLBody());
	}

	@Override
	public boolean hasInvocationDelegate() {

		if (isDuplicate()
			&& getGenModel().getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE) {

			for (String invocationDelegate : EcoreUtil
				.getInvocationDelegates(getGenClass().getGenPackage()
					.getEcorePackage())) {
				if (getEcoreOperation().getEAnnotation(invocationDelegate) != null)
					return EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE
						.getFactory(invocationDelegate) != null;
			}
			return false;
		} else {
			return super.hasInvocationDelegate();
		}
	}

	@Override
	public String getQualifiedOperationAccessor() {

		if (isDuplicate()) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenOperation redefinedGenOperation : getRedefinedGenOperations()) {

				if (getName().equals(redefinedGenOperation.getName())) {
					return redefinedGenOperation
						.getQualifiedOperationAccessor();
				}
			}
		}

		return super.getQualifiedOperationAccessor();
	}

} // GenOperationImpl
