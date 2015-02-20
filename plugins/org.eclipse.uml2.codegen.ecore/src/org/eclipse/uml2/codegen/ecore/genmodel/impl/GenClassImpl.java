/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 206636, 204200
 *   Lutz Wrage - 241411
 *   Kenn Hussey - 286329, 323181, 344908, 346183
 *   Kenn Hussey (CEA) - 351777, 394623, 322715, 212765, 451350, 459723
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.codegen.ecore.Generator;
import org.eclipse.uml2.codegen.ecore.genmodel.GenClass;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenClassImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl
		implements GenClass {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.GEN_CLASS;
	}

	protected List<GenFeature> duplicateGenFeatures = null;

	public List<GenFeature> getDuplicateGenFeatures() {
		List<GenFeature> result = new ArrayList<GenFeature>(getGenFeatures());

		if (duplicateGenFeatures == null) {
			duplicateGenFeatures = new ArrayList<GenFeature>();

			for (EStructuralFeature duplicateEcoreFeature : Generator
				.getDuplicateEcoreFeatures(getEcoreClass())) {

				GenFeature duplicateGenFeature = getGenModel()
					.createGenFeature();
				duplicateGenFeature.initialize(duplicateEcoreFeature);
				duplicateGenFeatures.add(duplicateGenFeature);
			}
		}

		result.addAll(duplicateGenFeatures);

		return result;
	}

	protected List<GenFeature> collectDuplicateGenFeatures(
			List<org.eclipse.emf.codegen.ecore.genmodel.GenClass> genClasses,
			List<GenFeature> genFeatures, GenFeatureFilter filter) {
		List<GenFeature> result = new ArrayList<GenFeature>();

		if (genClasses != null) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass : genClasses) {
				result
					.addAll(collectGenFeatures(null,
						UML2GenModelUtil.getDuplicateGenFeatures(genClass),
						filter));
			}
		}

		if (genFeatures != null) {
			result.addAll(collectGenFeatures(null, genFeatures, filter));
		}

		return result;
	}

	protected List<GenFeature> getAllDuplicateGenFeatures() {
		return collectDuplicateGenFeatures(getAllBaseGenClasses(),
			getDuplicateGenFeatures(), null);
	}

	@Override
	public List<GenFeature> getDeclaredGenFeatures() {
		Map<String, GenFeature> declaredGenFeatures = new LinkedHashMap<String, GenFeature>();

		List<GenFeature> redefinedGenFeatures = collectGenFeatures(null,
			getRedefinedGenFeatures(), new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return !getAllGenFeatures().contains(genFeature);
				}
			});

		for (GenFeature redefinedGenFeature : redefinedGenFeatures) {
			declaredGenFeatures.put(redefinedGenFeature.getName(),
				redefinedGenFeature);
		}

		List<GenFeature> duplicateGenFeatures = collectGenFeatures(null,
			getDuplicateGenFeatures(), new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return !UML2GenModelUtil.isDuplicate(genFeature)
						|| !UML2GenModelUtil.isRedefinition(genFeature);
				}
			});

		for (GenFeature duplicateGenFeature : duplicateGenFeatures) {
			declaredGenFeatures.put(duplicateGenFeature.getName(),
				duplicateGenFeature);
		}

		return new ArrayList<GenFeature>(declaredGenFeatures.values());
	}

	protected List<GenFeature> getImplementedGenFeatures(GenFeatureFilter filter) {
		Map<String, GenFeature> implementedGenFeatures = new LinkedHashMap<String, GenFeature>();

		for (org.eclipse.emf.codegen.ecore.genmodel.GenClass implementedGenClass : getImplementedGenClasses()) {

			for (GenFeature unionGenFeature : UML2GenModelUtil
				.getUnionGenFeatures(implementedGenClass)) {

				implementedGenFeatures.put(unionGenFeature.getName(),
					unionGenFeature);
			}

			for (GenFeature supersetGenFeature : UML2GenModelUtil
				.getSupersetGenFeatures(implementedGenClass)) {

				implementedGenFeatures.put(supersetGenFeature.getName(),
					supersetGenFeature);
			}

			for (GenFeature redefinedGenFeature : UML2GenModelUtil
				.getRedefinedGenFeatures(implementedGenClass)) {

				implementedGenFeatures.put(redefinedGenFeature.getName(),
					redefinedGenFeature);
			}

			for (GenFeature duplicateGenFeature : UML2GenModelUtil
				.getDuplicateGenFeatures(implementedGenClass)) {

				implementedGenFeatures.put(duplicateGenFeature.getName(),
					duplicateGenFeature);
			}
		}

		return collectGenFeatures(null, new ArrayList<GenFeature>(
			implementedGenFeatures.values()), filter);
	}

	@Override
	public List<GenFeature> getDeclaredFieldGenFeatures() {
		return getImplementedGenFeatures(new GenFeatureFilter() {

			public boolean accept(GenFeature genFeature) {

				if (UML2GenModelUtil.isDuplicate(genFeature)) {

					for (GenFeature redefinedGenFeature : UML2GenModelUtil
						.getRedefinedGenFeatures(genFeature)) {

						if (getExtendedGenFeatures().contains(
							redefinedGenFeature)) {

							return !UML2GenModelUtil
								.isUnion(redefinedGenFeature)
								&& !isRedefined(redefinedGenFeature);
						}
					}
				}

				return !getExtendedGenFeatures().contains(genFeature)
					&& !UML2GenModelUtil.isUnion(genFeature)
					&& !isRedefined(genFeature);
			}
		});
	}

	@Override
	public List<GenFeature> getImplementedGenFeatures() {
		return getImplementedGenFeatures(new GenFeatureFilter() {

			public boolean accept(GenFeature genFeature) {
				return !isRedefined(genFeature);
			}
		});
	}

	@Override
	public List<GenFeature> getExtendedGenFeatures() {
		return collectDuplicateGenFeatures(getExtendedGenClasses(), null, null);
	}

	protected List<GenOperation> duplicateGenOperations = null;

	public List<GenOperation> getDuplicateGenOperations() {
		List<GenOperation> result = new ArrayList<GenOperation>(
			getGenOperations());

		if (duplicateGenOperations == null) {
			duplicateGenOperations = new ArrayList<GenOperation>();

			for (EOperation duplicateEcoreOperation : Generator
				.getDuplicateEcoreOperations(getEcoreClass())) {

				GenOperation duplicateGenOperation = getGenModel()
					.createGenOperation();
				duplicateGenOperation.initialize(duplicateEcoreOperation);
				duplicateGenOperations.add(duplicateGenOperation);
			}
		}

		result.addAll(duplicateGenOperations);

		return result;
	}

	protected List<GenOperation> collectDuplicateGenOperations(
			List<org.eclipse.emf.codegen.ecore.genmodel.GenClass> genClasses,
			List<GenOperation> genOperations, GenOperationFilter filter) {
		List<GenOperation> result = new ArrayList<GenOperation>();

		if (genClasses != null) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass : genClasses) {
				result.addAll(collectGenOperations(this, null,
					UML2GenModelUtil.getDuplicateGenOperations(genClass),
					filter));
			}
		}

		if (genFeatures != null) {
			result.addAll(collectGenOperations(this, null, genOperations,
				filter));
		}

		return result;
	}

	protected List<GenOperation> getAllDuplicateGenOperations() {
		return collectDuplicateGenOperations(getAllBaseGenClasses(),
			getDuplicateGenOperations(), null);
	}

	@Override
	public List<GenOperation> getDeclaredGenOperations() {
		Map<String, GenOperation> declaredGenOperations = new LinkedHashMap<String, GenOperation>();

		List<GenOperation> redefinedGenOperations = collectGenOperations(this,
			null, getRedefinedGenOperations(), new GenOperationFilter() {

				public boolean accept(GenOperation genOperation) {
					return !getAllDuplicateGenOperations().contains(
						genOperation);
				}
			});

		for (GenOperation redefinedGenOperation : redefinedGenOperations) {
			declaredGenOperations
				.put(
					redefinedGenOperation.getName()
						+ redefinedGenOperation.getParameterTypes(""), redefinedGenOperation); //$NON-NLS-1$
		}

		List<GenOperation> duplicateGenOperations = collectGenOperations(this,
			null, getDuplicateGenOperations(), new GenOperationFilter() {

				public boolean accept(GenOperation genOperation) {
					return !UML2GenModelUtil.isDuplicate(genOperation)
						|| !UML2GenModelUtil.isRedefinition(genOperation);
				}
			});

		for (GenOperation duplicateGenOperation : duplicateGenOperations) {
			declaredGenOperations
				.put(
					duplicateGenOperation.getName()
						+ duplicateGenOperation.getParameterTypes(""), duplicateGenOperation); //$NON-NLS-1$
		}

		return collectGenOperations(this, null, new ArrayList<GenOperation>(
			declaredGenOperations.values()), new CollidingGenOperationFilter() {

			@Override
			public boolean accept(GenOperation genOperation) {
				return super.accept(genOperation)
					&& !genOperation.isSuppressedVisibility();
			}
		});
	}

	protected List<GenOperation> getImplementedGenOperations(
			GenOperationFilter filter) {
		Map<String, GenOperation> implementedGenOperations = new LinkedHashMap<String, GenOperation>();

		for (org.eclipse.emf.codegen.ecore.genmodel.GenClass implementedGenClass : getImplementedGenClasses()) {

			for (GenOperation redefinedGenOperation : UML2GenModelUtil
				.getRedefinedGenOperations(implementedGenClass)) {

				implementedGenOperations
					.put(
						redefinedGenOperation.getName()
							+ redefinedGenOperation.getParameterTypes(""), redefinedGenOperation); //$NON-NLS-1$
			}

			for (GenOperation duplicateGenOperation : UML2GenModelUtil
				.getDuplicateGenOperations(implementedGenClass)) {

				implementedGenOperations
					.put(
						duplicateGenOperation.getName()
							+ duplicateGenOperation.getParameterTypes(""), duplicateGenOperation); //$NON-NLS-1$
			}
		}

		return collectGenOperations(this, null, new ArrayList<GenOperation>(
			implementedGenOperations.values()), filter);
	}

	@Override
	public List<GenOperation> getImplementedGenOperations() {
		return getImplementedGenOperations(new CollidingGenOperationFilter() {

			@Override
			public boolean accept(GenOperation genOperation) {
				return super.accept(genOperation) && !isRedefined(genOperation);
			}
		});
	}

	public GenOperation getImplementedCollidingGetGenOperation(
			final GenFeature genFeature) {
		List<GenOperation> implementedCollidingGenOperations = getImplementedGenOperations(new CollidingGenOperationFilter() {

			@Override
			public boolean accept(GenOperation genOperation) {
				return !super.accept(genOperation)
					&& genOperation.getName().equals(
						genFeature.getGetAccessor());
			}
		});

		return implementedCollidingGenOperations.isEmpty()
			? null
			: (GenOperation) implementedCollidingGenOperations.get(0);
	}

	public GenOperation getImplementedCollidingSetGenOperation(
			final GenFeature genFeature) {
		List<GenOperation> implementedCollidingGenOperations = getImplementedGenOperations(new CollidingGenOperationFilter() {

			@Override
			public boolean accept(GenOperation genOperation) {
				return !super.accept(genOperation)
					&& genOperation.getName().equals("set" //$NON-NLS-1$
						+ genFeature.getAccessorName());
			}
		});

		return implementedCollidingGenOperations.isEmpty()
			? null
			: (GenOperation) implementedCollidingGenOperations.get(0);
	}

	public GenOperation getImplementedCollidingIsSetGenOperation(
			final GenFeature genFeature) {
		List<GenOperation> implementedCollidingGenOperations = getImplementedGenOperations(new CollidingGenOperationFilter() {

			@Override
			public boolean accept(GenOperation genOperation) {
				return !super.accept(genOperation)
					&& genOperation.getName().equals("isSet" //$NON-NLS-1$
						+ genFeature.getAccessorName());
			}
		});

		return implementedCollidingGenOperations.isEmpty()
			? null
			: (GenOperation) implementedCollidingGenOperations.get(0);
	}

	public GenOperation getImplementedCollidingUnsetGenOperation(
			final GenFeature genFeature) {
		List<GenOperation> implementedCollidingGenOperations = getImplementedGenOperations(new CollidingGenOperationFilter() {

			@Override
			public boolean accept(GenOperation genOperation) {
				return !super.accept(genOperation)
					&& genOperation.getName().equals("unset" //$NON-NLS-1$
						+ genFeature.getAccessorName());
			}
		});

		return implementedCollidingGenOperations.isEmpty()
			? null
			: (GenOperation) implementedCollidingGenOperations.get(0);
	}

	@Override
	public List<GenOperation> getExtendedGenOperations() {
		return collectDuplicateGenOperations(getExtendedGenClasses(), null,
			null);
	}

	@Override
	public List<GenOperation> getInvariantOperations() {
		return collectGenOperations(this, null, getDuplicateGenOperations(),
			new GenOperationFilter() {

				public boolean accept(GenOperation genOperation) {
					return genOperation.isInvariant();
				}
			});
	}

	public String getImportedOperationsClassName() {
		return getGenModel().getImportedName(getQualifiedOperationsClassName());
	}

	public String getOperationsClassName() {
		return getName() + "Operations"; //$NON-NLS-1$
	}

	public String getQualifiedOperationsClassName() {
		return UML2GenModelUtil.getOperationsPackageName(getGenPackage()) + "." //$NON-NLS-1$
			+ getOperationsClassName();
	}

	public List<GenOperation> getOperationsClassGenOperations() {
		EList<GenOperation> result = new UniqueEList.FastCompare<GenOperation>();

		if (!isInterface()) {

			for (GenOperation genOperation : getImplementedGenOperations(null)) {
				org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass = genOperation
					.getGenClass();

				if ((genClass == this || genClass.isInterface())
					&& !genOperation.hasBody()
					&& (genClass.getGenModel().getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE || (!genOperation
						.hasInvariantExpression() && !genOperation
						.hasInvocationDelegate()))) {

					result.add(genOperation);
				}
			}
		}

		return result;
	}

	@Override
	public String getOperationID(GenOperation genOperation) {

		if (genOperation.isInvariant()) {
			String prefix = UML2GenModelUtil.getInvariantPrefix(getGenModel());

			if (!isBlank(prefix)) {
				return getClassifierID()
					+ "__" //$NON-NLS-1$
					+ format(genOperation.getName(), '_', prefix, false, false)
						.toUpperCase();
			}
		}

		return super.getOperationID(genOperation);
	}

	public String getOperationsClassExtends() {

		for (org.eclipse.emf.codegen.ecore.genmodel.GenClass classExtendsGenClass = getClassExtendsGenClass(); classExtendsGenClass != null; classExtendsGenClass = classExtendsGenClass
			.getClassExtendsGenClass()) {

			if (UML2GenModelUtil.isOperationsClasses(classExtendsGenClass
				.getGenPackage())
				&& !UML2GenModelUtil.getOperationsClassGenOperations(
					classExtendsGenClass).isEmpty()) {

				return " extends " //$NON-NLS-1$
					+ UML2GenModelUtil
						.getImportedOperationsClassName(classExtendsGenClass);
			}
		}

		return ""; //$NON-NLS-1$
	}

	@Override
	public List<GenFeature> getEInverseAddGenFeatures() {
		return collectGenFeatures(null, super.getEInverseAddGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return !genFeature.isDerived();
				}
			});
	}

	@Override
	public List<GenFeature> getEInverseRemoveGenFeatures() {
		return collectGenFeatures(null, super.getEInverseRemoveGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return !genFeature.isDerived();
				}
			});
	}

	protected String getSubsetListConstructor(GenFeature genFeature) {
		return getSubsetSupersetListConstructor(genFeature);
	}

	protected String getSupersetListConstructor(GenFeature genFeature) {
		return getSubsetSupersetListConstructor(genFeature);
	}

	private void appendReifiedFeatureInverseOverride(StringBuffer sb,
			GenFeature genFeature) {
		org.eclipse.emf.codegen.ecore.genmodel.GenClass sourceGenClass = genFeature
			.getGenClass();
		EGenericType eGenericType = genFeature.getEcoreFeature()
			.getEGenericType();

		if (isReifiedType(sourceGenClass, eGenericType)) {
			sb.append(" { private static final long serialVersionUID = 1L; @Override public ");
			sb.append(getGenModel().getImportedName("java.lang.Class"));
			sb.append("<?> getInverseFeatureClass() { return ");
			sb.append(getTypeArgument(sourceGenClass, eGenericType, true, true));
			sb.append(".class; } }");
		}
	}

	protected String getSubsetSupersetListConstructor(GenFeature genFeature) {
		StringBuffer sb = new StringBuffer();

		String unsettable = genFeature.isUnsettable()
			? ".Unsettable" //$NON-NLS-1$
			: ""; //$NON-NLS-1$
		String offsetCorrectionField = hasOffsetCorrection()
			? " + " + getOffsetCorrectionField(null) //$NON-NLS-1$
			: ""; //$NON-NLS-1$

		boolean isJava5 = getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50;

		if (genFeature.isMapType()) {
			return super.getListConstructor(genFeature);
		} else if (genFeature.isFeatureMapType()) {
			return super.getListConstructor(genFeature);
		} else {
			EGenericType eGenericType = genFeature.getEcoreFeature()
				.getEGenericType();

			if (getGenModel().isSuppressNotification()) {
				sb.append(getGenModel().getImportedName(
					"org.eclipse.emf.ecore.util.BasicInternalEList")); //$NON-NLS-1$
				if (getGenModel().getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF28_VALUE) {
					sb.append(unsettable);
				}
				if (isJava5) {
					sb.append('<');
					sb.append(UML2GenModelUtil.getRedefinedListItemType(this,
						genFeature));
					sb.append('>');
				}
				sb.append("("); //$NON-NLS-1$
				sb.append(getTypeArgument(this, eGenericType, true, true));
				sb.append(".class)"); //$NON-NLS-1$
			} else if (genFeature.isEffectiveContains()) {
				if (genFeature.isBidirectional()) {
					GenFeature reverseFeature = genFeature.getReverse();
					sb.append(getGenModel()
						.getImportedName(
							"org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList")); //$NON-NLS-1$
					sb.append(unsettable);
					if (genFeature.isResolveProxies()) {
						sb.append(".Resolving"); //$NON-NLS-1$
					}
					if (isJava5) {
						sb.append('<');
						sb.append(UML2GenModelUtil.getRedefinedListItemType(
							this, genFeature));
						sb.append('>');
					}
					sb.append("("); //$NON-NLS-1$
					sb.append(getTypeArgument(this, eGenericType, true, true));
					sb.append(".class, this, "); //$NON-NLS-1$
					sb.append(getQualifiedFeatureID(genFeature));
					sb.append(offsetCorrectionField);
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSupersetGenFeatures(this,
						genFeature, false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUPERSETS"); //$NON-NLS-1$
					}
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSubsetGenFeatures(this, genFeature,
						false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUBSETS"); //$NON-NLS-1$
					}
					sb.append(", "); //$NON-NLS-1$
					sb.append(reverseFeature.getGenClass()
						.getQualifiedFeatureID(reverseFeature));
					if (reverseFeature.getGenClass().hasOffsetCorrection()) {
						sb.append(" + ");
						sb.append(getOffsetCorrectionField(genFeature));
					}
					sb.append(")"); //$NON-NLS-1$
					appendReifiedFeatureInverseOverride(sb, genFeature);
				} else {
					sb.append(getGenModel()
						.getImportedName(
							"org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList")); //$NON-NLS-1$
					sb.append(unsettable);
					if (genFeature.isResolveProxies()) {
						sb.append(".Resolving"); //$NON-NLS-1$
					}
					if (isJava5) {
						sb.append('<');
						sb.append(UML2GenModelUtil.getRedefinedListItemType(
							this, genFeature));
						sb.append('>');
					}
					sb.append("("); //$NON-NLS-1$
					sb.append(getTypeArgument(this, eGenericType, true, true));
					sb.append(".class, this, "); //$NON-NLS-1$
					sb.append(getQualifiedFeatureID(genFeature));
					sb.append(offsetCorrectionField);
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSupersetGenFeatures(this,
						genFeature, false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUPERSETS"); //$NON-NLS-1$
					}
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSubsetGenFeatures(this, genFeature,
						false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUBSETS"); //$NON-NLS-1$
					}
					sb.append(")"); //$NON-NLS-1$
				}
			} else if (genFeature.isReferenceType()) {
				if (genFeature.isBidirectional()) {
					GenFeature reverseFeature = genFeature.getReverse();
					if (genFeature.isResolveProxies()) {
						sb.append(getGenModel()
							.getImportedName(
								"org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList")); //$NON-NLS-1$
					} else {
						sb.append(getGenModel()
							.getImportedName(
								"org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseEList")); //$NON-NLS-1$
					}
					sb.append(unsettable);
					if (reverseFeature.isListType()) {
						sb.append(".ManyInverse"); //$NON-NLS-1$
					}
					if (isJava5) {
						sb.append('<');
						sb.append(UML2GenModelUtil.getRedefinedListItemType(
							this, genFeature));
						sb.append('>');
					}
					sb.append("("); //$NON-NLS-1$
					sb.append(getTypeArgument(this, eGenericType, true, true));
					sb.append(".class, this, "); //$NON-NLS-1$
					sb.append(getQualifiedFeatureID(genFeature));
					sb.append(offsetCorrectionField);
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSupersetGenFeatures(this,
						genFeature, false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUPERSETS"); //$NON-NLS-1$
					}
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSubsetGenFeatures(this, genFeature,
						false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUBSETS"); //$NON-NLS-1$
					}
					sb.append(", "); //$NON-NLS-1$
					sb.append(reverseFeature.getGenClass()
						.getQualifiedFeatureID(reverseFeature));
					if (reverseFeature.getGenClass().hasOffsetCorrection()) {
						sb.append(" + ");
						sb.append(getOffsetCorrectionField(genFeature));
					}
					sb.append(")"); //$NON-NLS-1$
					appendReifiedFeatureInverseOverride(sb, genFeature);
				} else {
					if (genFeature.isResolveProxies()) {
						sb.append(getGenModel()
							.getImportedName(
								"org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList")); //$NON-NLS-1$
					} else {
						sb.append(getGenModel()
							.getImportedName(
								"org.eclipse.uml2.common.util.SubsetSupersetEObjectEList")); //$NON-NLS-1$
					}
					sb.append(unsettable);
					if (isJava5) {
						sb.append('<');
						sb.append(UML2GenModelUtil.getRedefinedListItemType(
							this, genFeature));
						sb.append('>');
					}
					sb.append("("); //$NON-NLS-1$
					sb.append(getTypeArgument(this, eGenericType, true, true));
					sb.append(".class, this, "); //$NON-NLS-1$
					sb.append(getQualifiedFeatureID(genFeature));
					sb.append(offsetCorrectionField);
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSupersetGenFeatures(this,
						genFeature, false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUPERSETS"); //$NON-NLS-1$
					}
					sb.append(", "); //$NON-NLS-1$
					if (UML2GenModelUtil.getSubsetGenFeatures(this, genFeature,
						false).isEmpty()) {
						sb.append("null"); //$NON-NLS-1$
					} else {
						sb.append(genFeature.getUpperName());
						sb.append("_ESUBSETS"); //$NON-NLS-1$
					}
					sb.append(")"); //$NON-NLS-1$
				}
			} else { // datatype
				if (genFeature.isUnique()) {
					sb.append(getGenModel()
						.getImportedName(
							"org.eclipse.uml2.common.util.SubsetSupersetEDataTypeUniqueEList"));
				} else {
					sb.append(getGenModel()
						.getImportedName(
							"org.eclipse.uml2.common.util.SubsetSupersetEDataTypeEList"));
				}
				sb.append(unsettable);
				if (isJava5) {
					sb.append('<');
					sb.append(genFeature.getListItemType(this));
					sb.append('>');
				}
				sb.append("(");
				sb.append(isPrimitiveType(eGenericType.getERawType())
					? genFeature.getRawListItemType()
					: getTypeArgument(this, eGenericType, true, true));
				sb.append(".class, this, ");
				sb.append(getQualifiedFeatureID(genFeature));
				sb.append(offsetCorrectionField);
				sb.append(", "); //$NON-NLS-1$
				if (UML2GenModelUtil.getSupersetGenFeatures(this, genFeature,
					false).isEmpty()) {
					sb.append("null"); //$NON-NLS-1$
				} else {
					sb.append(genFeature.getUpperName());
					sb.append("_ESUPERSETS"); //$NON-NLS-1$
				}
				sb.append(", "); //$NON-NLS-1$
				if (UML2GenModelUtil.getSubsetGenFeatures(this, genFeature,
					false).isEmpty()) {
					sb.append("null"); //$NON-NLS-1$
				} else {
					sb.append(genFeature.getUpperName());
					sb.append("_ESUBSETS"); //$NON-NLS-1$
				}
				sb.append(")");
			}
		}
		return sb.toString();
	}

	protected String getDerivedUnionListConstructor(GenFeature genFeature) {
		StringBuffer sb = new StringBuffer();

		if (genFeature.isMapType()) {
			return super.getListConstructor(genFeature);
		} else if (genFeature.isFeatureMapType()) {
			return super.getListConstructor(genFeature);
		} else if (genFeature.isReferenceType()) {
			sb.append(getGenModel().getImportedName(
				"org.eclipse.uml2.common.util.DerivedUnionEObjectEList")); //$NON-NLS-1$
			if (getEffectiveComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
				sb.append('<');
				sb.append(UML2GenModelUtil.getRedefinedListItemType(this,
					genFeature));
				sb.append('>');
			}
			sb.append("("); //$NON-NLS-1$
			sb.append(genFeature.getRawListItemType());
			sb.append(".class, this, "); //$NON-NLS-1$
			sb.append(getQualifiedFeatureID(genFeature));
			sb.append(", "); //$NON-NLS-1$
			if (UML2GenModelUtil.getSubsetGenFeatures(this, genFeature, true)
				.isEmpty()) {
				sb.append("null"); //$NON-NLS-1$
			} else {
				sb.append(genFeature.getUpperName());
				sb.append("_ESUBSETS"); //$NON-NLS-1$
			}
			sb.append(")"); //$NON-NLS-1$
		} else { // datatype
			return super.getListConstructor(genFeature);
		}
		return sb.toString();
	}

	@Override
	public String getListConstructor(GenFeature genFeature) {

		if (UML2GenModelUtil.isUnion(genFeature)) {
			return getDerivedUnionListConstructor(genFeature);
		}

		if (isSuperset(genFeature)
			&& !getSubsetGenFeatures(genFeature, false).isEmpty()) {

			return getSupersetListConstructor(genFeature);
		}

		if (UML2GenModelUtil.isSubset(genFeature)
			&& !getSupersetGenFeatures(genFeature, false).isEmpty()) {

			return getSubsetListConstructor(genFeature);
		}

		return super.getListConstructor(genFeature);
	}

	@Override
	public GenFeature findGenFeature(EStructuralFeature ecoreFeature) {
		org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass = findGenClass(Generator
			.getEcoreContainingClass(ecoreFeature));

		for (GenFeature duplicateGenFeature : UML2GenModelUtil
			.getDuplicateGenFeatures(genClass)) {

			if (ecoreFeature.getName().equals(
				duplicateGenFeature.getEcoreFeature().getName())) {

				return duplicateGenFeature;
			}
		}

		return null;
	}

	@Override
	public GenOperation findGenOperation(EOperation ecoreOperation) {
		org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass = findGenClass(Generator
			.getEcoreContainingClass(ecoreOperation));

		genOperationsLoop : for (GenOperation duplicateGenOperation : UML2GenModelUtil
			.getDuplicateGenOperations(genClass)) {

			if (ecoreOperation.getName().equals(
				duplicateGenOperation.getEcoreOperation().getName())
				&& ecoreOperation.getEParameters().size() == duplicateGenOperation
					.getEcoreOperation().getEParameters().size()) {

				for (int j = 0; j < ecoreOperation.getEParameters().size(); j++) {
					EParameter ecoreParameter = ecoreOperation.getEParameters()
						.get(j);

					if (!ecoreParameter
						.getEType()
						.getName()
						.equals(
							(duplicateGenOperation.getEcoreOperation()
								.getEParameters().get(j)).getEType().getName())) {

						continue genOperationsLoop;
					}
				}

				return duplicateGenOperation;
			}
		}

		return null;
	}

	public boolean isDerivedUnionListType(GenFeature genFeature) {

		if (UML2GenModelUtil.isUnion(genFeature) && genFeature.isListType()) {

			if (UML2GenModelUtil.isDuplicate(genFeature)
				&& !UML2GenModelUtil.isRedefinition(genFeature)) {

				return false;
			}

			for (GenFeature subsetGenFeature : getSubsetGenFeatures(genFeature)) {

				if (UML2GenModelUtil.isDuplicate(subsetGenFeature)
					&& !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	public List<GenFeature> getUnionGenFeatures() {
		List<GenFeature> unionGenFeatures = new UniqueEList.FastCompare<GenFeature>();

		for (GenFeature duplicateGenFeature : getDuplicateGenFeatures()) {

			if (UML2GenModelUtil.isUnion(duplicateGenFeature)) {
				unionGenFeatures.add(duplicateGenFeature);
			}

			for (GenFeature subsettedGenFeature : UML2GenModelUtil
				.getSubsettedGenFeatures(duplicateGenFeature)) {

				if (UML2GenModelUtil.isUnion(subsettedGenFeature)) {
					unionGenFeatures.add(subsettedGenFeature);
				}
			}
		}

		return unionGenFeatures;
	}

	public List<GenFeature> getImplementedUnionGenFeatures() {
		return getImplementedGenFeatures(new GenFeatureFilter() {

			public boolean accept(GenFeature genFeature) {
				return UML2GenModelUtil.isUnion(genFeature)
					&& !isRedefined(genFeature);
			}
		});
	}

	public boolean isSuperset(GenFeature genFeature) {
		final EStructuralFeature ecoreFeature = genFeature.getEcoreFeature();

		return !genFeature.isDerived()
			&& !collectGenFeatures(null, getAllDuplicateGenFeatures(),
				new GenFeatureFilter() {

					public boolean accept(GenFeature genFeature) {
						return Generator.getSubsettedEcoreFeatures(
							genFeature.getEcoreFeature())
							.contains(ecoreFeature);
					}
				}).isEmpty();
	}

	public List<GenFeature> getSupersetGenFeatures() {
		List<GenFeature> supersetGenFeatures = new UniqueEList.FastCompare<GenFeature>();

		for (GenFeature duplicateGenFeature : getDuplicateGenFeatures()) {

			if (isSuperset(duplicateGenFeature)) {
				supersetGenFeatures.add(duplicateGenFeature);
			}

			for (GenFeature subsettedGenFeature : UML2GenModelUtil
				.getSubsettedGenFeatures(duplicateGenFeature)) {

				if (isSuperset(subsettedGenFeature)) {
					supersetGenFeatures.add(subsettedGenFeature);
				}
			}
		}

		return supersetGenFeatures;
	}

	public List<GenFeature> getSubsetGenFeatures(GenFeature supersetGenFeature) {
		return getSubsetGenFeatures(supersetGenFeature, true);
	}

	public List<GenFeature> getSubsetGenFeatures(GenFeature supersetGenFeature,
			boolean includeDerived) {
		return getSubsetGenFeatures(supersetGenFeature, includeDerived, true);
	}

	public List<GenFeature> getSubsetGenFeatures(GenFeature supersetGenFeature,
			boolean includeDerived, boolean includeListType) {
		Map<String, GenFeature> subsetGenFeatures = new LinkedHashMap<String, GenFeature>();

		final EStructuralFeature supersetEcoreFeature = supersetGenFeature
			.getEcoreFeature();

		for (GenFeature duplicateGenFeature : getAllDuplicateGenFeatures()) {

			if (Generator.getSubsettedEcoreFeatures(
				duplicateGenFeature.getEcoreFeature()).contains(
				supersetEcoreFeature)
				&& (includeDerived || !duplicateGenFeature.isDerived())
				&& (includeListType || !duplicateGenFeature.isListType())) {

				subsetGenFeatures.put(duplicateGenFeature.getName(),
					duplicateGenFeature);
			}
		}

		return new ArrayList<GenFeature>(subsetGenFeatures.values());
	}

	public List<GenFeature> getIsSetSubsetGenFeatures(GenFeature unionGenFeature) {
		return collectGenFeatures(null, getSubsetGenFeatures(unionGenFeature),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return !getExtendedGenFeatures().contains(genFeature);
				}
			});
	}

	public List<GenFeature> getSubsetGenFeatures() {
		return collectGenFeatures(null, getDuplicateGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return UML2GenModelUtil.isSubset(genFeature);
				}
			});
	}

	public List<GenFeature> getImplementedSubsetGenFeatures() {
		return getImplementedGenFeatures(new GenFeatureFilter() {

			public boolean accept(GenFeature genFeature) {
				return UML2GenModelUtil.isSubset(genFeature)
					&& !collectGenFeatures(null,
						getSupersetGenFeatures(genFeature),
						new GenFeatureFilter() {

							public boolean accept(GenFeature genFeature) {
								return !genFeature.isDerived();
							}
						}).isEmpty();
			}
		});
	}

	public List<GenFeature> getImplementedSubsetGenFeatures(
			final boolean listType) {
		return collectGenFeatures(null, getImplementedSubsetGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return listType == genFeature.isListType();
				}
			});
	}

	public String getSubsetFeatureAccessorArray(GenFeature supersetGenFeature) {
		return getSubsetFeatureAccessorArray(supersetGenFeature, false);
	}

	public String getSubsetFeatureAccessorArray(GenFeature supersetGenFeature,
			boolean includeDerived) {
		StringBuffer sb = new StringBuffer();

		Iterator<GenFeature> subsetGenFeatures = getSubsetGenFeatures(
			supersetGenFeature, includeDerived).iterator();

		if (subsetGenFeatures.hasNext()) {
			sb.append("new "); //$NON-NLS-1$
			sb.append(getGenModel().getImportedName(
				"org.eclipse.emf.ecore.EStructuralFeature")); //$NON-NLS-1$
			sb.append("[] {"); //$NON-NLS-1$

			while (subsetGenFeatures.hasNext()) {
				GenFeature subsetGenFeature = subsetGenFeatures.next();

				sb.append(subsetGenFeature.getQualifiedFeatureAccessor());

				if (subsetGenFeatures.hasNext()) {
					sb.append(", "); //$NON-NLS-1$
				}
			}

			sb.append("}"); //$NON-NLS-1$
		} else {
			sb.append("null"); //$NON-NLS-1$
		}

		return sb.toString();
	}

	public String getSubsetFeatureIDArray(GenFeature supersetGenFeature) {
		return getSubsetFeatureIDArray(supersetGenFeature, false);
	}

	public String getSubsetFeatureIDArray(GenFeature supersetGenFeature,
			boolean includeDerived) {
		StringBuffer sb = new StringBuffer();

		Iterator<GenFeature> subsetGenFeatures = getSubsetGenFeatures(
			supersetGenFeature, includeDerived).iterator();

		if (subsetGenFeatures.hasNext()) {
			sb.append("new int[] {"); //$NON-NLS-1$

			while (subsetGenFeatures.hasNext()) {
				GenFeature subsetGenFeature = subsetGenFeatures.next();

				sb.append(getQualifiedFeatureID(subsetGenFeature));

				if (subsetGenFeatures.hasNext()) {
					sb.append(", "); //$NON-NLS-1$
				}
			}

			sb.append("}"); //$NON-NLS-1$			
		} else {
			sb.append("null"); //$NON-NLS-1$
		}

		return sb.toString();
	}

	public List<GenFeature> getSupersetGenFeatures(GenFeature subsetGenFeature) {
		return getSupersetGenFeatures(subsetGenFeature, true);
	}

	public List<GenFeature> getSupersetGenFeatures(GenFeature subsetGenFeature,
			boolean includeDerived) {
		return getSupersetGenFeatures(subsetGenFeature, includeDerived, true);
	}

	public List<GenFeature> getSupersetGenFeatures(GenFeature subsetGenFeature,
			final boolean includeDerived, final boolean includeListType) {
		return collectGenFeatures(null,
			UML2GenModelUtil.getSubsettedGenFeatures(subsetGenFeature),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return (includeDerived || !genFeature.isDerived())
						&& (includeListType || !genFeature.isListType());
				}
			});
	}

	public List<GenFeature> getImplementedSupersetGenFeatures() {
		return getImplementedGenFeatures(new GenFeatureFilter() {

			public boolean accept(GenFeature genFeature) {
				return isSuperset(genFeature)
					&& !getSubsetGenFeatures(genFeature, false).isEmpty();
			}
		});
	}

	public List<GenFeature> getImplementedSupersetGenFeatures(
			final boolean listType) {
		return collectGenFeatures(null, getImplementedSupersetGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return listType == genFeature.isListType();
				}
			});
	}

	public String getSupersetFeatureAccessorArray(GenFeature subsetGenFeature) {
		StringBuffer sb = new StringBuffer();

		Iterator<GenFeature> supersetGenFeatures = getSupersetGenFeatures(
			subsetGenFeature, false).iterator();

		if (supersetGenFeatures.hasNext()) {
			sb.append("new "); //$NON-NLS-1$
			sb.append(getGenModel().getImportedName(
				"org.eclipse.emf.ecore.EStructuralFeature")); //$NON-NLS-1$
			sb.append("[] {"); //$NON-NLS-1$

			while (supersetGenFeatures.hasNext()) {
				GenFeature supersetGenFeature = supersetGenFeatures.next();

				sb.append(supersetGenFeature.getQualifiedFeatureAccessor());

				if (supersetGenFeatures.hasNext()) {
					sb.append(", "); //$NON-NLS-1$
				}
			}

			sb.append("}"); //$NON-NLS-1$
		} else {
			sb.append("null"); //$NON-NLS-1$
		}

		return sb.toString();
	}

	public String getSupersetFeatureIDArray(GenFeature subsetGenFeature) {
		StringBuffer sb = new StringBuffer();

		Iterator<GenFeature> supersetGenFeatures = getSupersetGenFeatures(
			subsetGenFeature, false).iterator();

		if (supersetGenFeatures.hasNext()) {
			sb.append("new int[] {"); //$NON-NLS-1$

			while (supersetGenFeatures.hasNext()) {
				GenFeature supersetGenFeature = supersetGenFeatures.next();

				sb.append(getQualifiedFeatureID(supersetGenFeature));

				if (supersetGenFeatures.hasNext()) {
					sb.append(", "); //$NON-NLS-1$
				}
			}

			sb.append("}"); //$NON-NLS-1$
		} else {
			sb.append("null"); //$NON-NLS-1$
		}

		return sb.toString();
	}

	public boolean isRedefined(GenFeature genFeature) {
		final EStructuralFeature ecoreFeature = genFeature.getEcoreFeature();

		return !collectGenFeatures(null, getAllDuplicateGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return Generator.getRedefinedEcoreFeatures(
						genFeature.getEcoreFeature()).contains(ecoreFeature);
				}
			}).isEmpty();
	}

	public List<GenFeature> getRedefinedGenFeatures() {
		List<GenFeature> redefinedGenFeatures = new UniqueEList.FastCompare<GenFeature>();

		for (GenFeature duplicateGenFeature : getDuplicateGenFeatures()) {

			if (isRedefined(duplicateGenFeature)) {
				redefinedGenFeatures.add(duplicateGenFeature);
			}

			for (GenFeature redefinedGenFeature : UML2GenModelUtil
				.getRedefinedGenFeatures(duplicateGenFeature)) {

				if (!duplicateGenFeature.getName().equals(
					redefinedGenFeature.getName())) {

					redefinedGenFeatures.add(redefinedGenFeature);
				}
			}
		}

		return redefinedGenFeatures;
	}

	public List<GenFeature> getImplementedRedefinedGenFeatures() {
		return getImplementedGenFeatures(new GenFeatureFilter() {

			public boolean accept(GenFeature genFeature) {
				return isRedefined(genFeature);
			}
		});
	}

	public List<GenFeature> getRedefinitionGenFeatures(
			GenFeature redefinedGenFeature) {
		Map<String, GenFeature> redefinitionGenFeatures = new LinkedHashMap<String, GenFeature>();

		EStructuralFeature redefinedEcoreFeature = redefinedGenFeature
			.getEcoreFeature();

		for (GenFeature duplicateGenFeature : getAllDuplicateGenFeatures()) {

			if (Generator.getRedefinedEcoreFeatures(
				duplicateGenFeature.getEcoreFeature()).contains(
				redefinedEcoreFeature)) {

				if (!duplicateGenFeature.getName().equals(
					redefinedGenFeature.getName())) {

					redefinitionGenFeatures.put(duplicateGenFeature.getName(),
						duplicateGenFeature);
				}
			}
		}

		return new ArrayList<GenFeature>(redefinitionGenFeatures.values());
	}

	public boolean isRedefined(GenOperation genOperation) {
		final EOperation ecoreOperation = genOperation.getEcoreOperation();

		return !collectGenOperations(this, null,
			getAllDuplicateGenOperations(), new GenOperationFilter() {

				public boolean accept(GenOperation genOperation) {
					return Generator.getRedefinedEcoreOperations(
						genOperation.getEcoreOperation()).contains(
						ecoreOperation);
				}
			}).isEmpty();
	}

	public List<GenOperation> getRedefinedGenOperations() {
		List<GenOperation> redefinedGenOperations = new UniqueEList.FastCompare<GenOperation>();

		for (GenOperation duplicateGenOperation : getDuplicateGenOperations()) {

			if (isRedefined(duplicateGenOperation)) {
				redefinedGenOperations.add(duplicateGenOperation);
			}

			for (GenOperation redefinedGenOperation : UML2GenModelUtil
				.getRedefinedGenOperations(duplicateGenOperation)) {

				if (!(duplicateGenOperation.getName() + duplicateGenOperation
					.getParameterTypes("")).equals(redefinedGenOperation //$NON-NLS-1$
					.getName() + redefinedGenOperation.getParameterTypes(""))) { //$NON-NLS-1$

					redefinedGenOperations.add(redefinedGenOperation);
				}
			}
		}

		return redefinedGenOperations;
	}

	public List<GenOperation> getImplementedRedefinedGenOperations() {
		return getImplementedGenOperations(new CollidingGenOperationFilter() {

			@Override
			public boolean accept(GenOperation genOperation) {
				return super.accept(genOperation) && isRedefined(genOperation);
			}
		});
	}

	public List<GenOperation> getRedefinitionGenOperations(
			GenOperation redefinedGenOperation) {
		Map<String, GenOperation> redefinitionGenOperations = new LinkedHashMap<String, GenOperation>();

		EOperation redefinedEcoreOperation = redefinedGenOperation
			.getEcoreOperation();

		for (GenOperation duplicateGenOperation : getAllDuplicateGenOperations()) {

			if (Generator.getRedefinedEcoreOperations(
				duplicateGenOperation.getEcoreOperation()).contains(
				redefinedEcoreOperation)) {

				if (!(duplicateGenOperation.getName() + duplicateGenOperation
					.getParameterTypes("")).equals(redefinedGenOperation //$NON-NLS-1$
					.getName() + redefinedGenOperation.getParameterTypes(""))) { //$NON-NLS-1$

					redefinitionGenOperations.put(
						duplicateGenOperation.getName(), duplicateGenOperation);
				}
			}
		}

		return new ArrayList<GenOperation>(redefinitionGenOperations.values());
	}

	public List<GenFeature> getKeyGenFeatures() {
		return getKeyGenFeatures(true);
	}

	public List<GenFeature> getKeyGenFeatures(final boolean includeContains) {
		return collectGenFeatures(null, getAllGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return UML2GenModelUtil.isKey(genFeature)
						&& !genFeature.isPrimitiveType()
						&& (includeContains || !genFeature.isContains());
				}
			});
	}

	public boolean isFactoryMethods(GenFeature genFeature) {
		return UML2GenModelUtil.isFactoryMethods(genFeature.getGenModel())
			&& genFeature.isChangeable()
			&& (genFeature.isEffectiveContains() || UML2GenModelUtil
				.isEffectiveContainsSubset(genFeature))
			&& getChildrenClasses(genFeature).size() > 0;
	}

	@Override
	public boolean isESetField(GenFeature genFeature) {
		return super.isESetField(genFeature)
			&& (!UML2GenModelUtil.isUnion(genFeature))
			&& !isRedefined(genFeature);
	}

	@Override
	public boolean isField(GenFeature genFeature) {
		return super.isField(genFeature)
			&& (!UML2GenModelUtil.isUnion(genFeature))
			&& !isRedefined(genFeature);
	}

	protected class CollidingGenOperationFilter
			extends
			org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl.CollidingGenOperationFilter {

		protected CollidingGenOperationFilter() {
			super();

			allGenFeatures = getAllDuplicateGenFeatures();
		}

		@Override
		public boolean accept(GenOperation genOperation) {
			boolean hasBody = genOperation.hasBody()
				|| genOperation.hasInvocationDelegate();

			if (hasBody
				&& (genOperation.getName().startsWith("get") || genOperation //$NON-NLS-1$
					.getName().startsWith("is")) //$NON-NLS-1$
				&& genOperation.getGenParameters().isEmpty()) {

				String operationType = genOperation.getType(GenClassImpl.this);

				for (GenFeature genFeature : allGenFeatures) {

					if (genFeature.getGetAccessor().equals(
						genOperation.getName())
						&& (genFeature.getType(GenClassImpl.this).equals(
							operationType) || !extendsGenClassFeatures
							.contains(genFeature))
						&& genFeature.isVolatile()
						&& !genFeature.hasDelegateFeature()
						&& !extendsGenClassFeatures.contains(genFeature)) {

						return false;
					}
				}

				return !genOperation.getGenClass().isEObject();
			} else {
				return super.accept(genOperation);
			}
		}

	}

	@Override
	public List<GenFeature> getToStringGenFeatures() {
		return collectGenFeatures(null, super.getToStringGenFeatures(),
			new GenFeatureFilter() {

				public boolean accept(GenFeature genFeature) {
					return !isRedefined(genFeature);
				}
			});
	}

	@Override
	public List<GenFeature> getEGetGenFeatures() {
		final List<GenFeature> allGenFeatures = getAllGenFeatures();
		final List<GenFeature> extendedGenFeatures = getExtendedGenFeatures();

		if (getGenModel().isMinimalReflectiveMethods()) {
			return collectGenFeatures(null, getImplementedGenFeatures(null),
				new GenFeatureFilter() {

					public boolean accept(GenFeature genFeature) {

						if (UML2GenModelUtil.isDuplicate(genFeature)) {

							for (GenFeature redefinedGenFeature : UML2GenModelUtil
								.getRedefinedGenFeatures(genFeature)) {

								if (!extendedGenFeatures
									.contains(redefinedGenFeature)) {

									return allGenFeatures
										.contains(redefinedGenFeature);
								}
							}
						}
						return allGenFeatures.contains(genFeature)
							&& !extendedGenFeatures.contains(genFeature);
					}
				});
		} else {
			return super.getEGetGenFeatures();
		}
	}

	@Override
	public List<GenFeature> getESetGenFeatures() {
		final List<GenFeature> allGenFeatures = getAllGenFeatures();
		final List<GenFeature> extendedGenFeatures = getExtendedGenFeatures();

		if (getGenModel().isMinimalReflectiveMethods()) {
			return collectGenFeatures(null, getImplementedGenFeatures(null),
				new GenFeatureFilter() {

					public boolean accept(GenFeature genFeature) {

						if (UML2GenModelUtil.isDuplicate(genFeature)) {

							for (GenFeature redefinedGenFeature : UML2GenModelUtil
								.getRedefinedGenFeatures(genFeature)) {

								if (!extendedGenFeatures
									.contains(redefinedGenFeature)) {

									return genFeature.isChangeable()
										&& allGenFeatures
											.contains(redefinedGenFeature);
								}
							}
						}
						return genFeature.isChangeable()
							&& allGenFeatures.contains(genFeature)
							&& !extendedGenFeatures.contains(genFeature);
					}
				});
		} else {
			return super.getESetGenFeatures();
		}
	}

	public boolean hasOCLOperationBodies() {

		for (GenOperation genOperation : getAllGenOperations()) {

			if (UML2GenModelUtil.hasOCLBody(genOperation)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String getUniqueName(GenOperation genOperation) {
		GenOperation redefinedGenOperation = genOperation;

		while (UML2GenModelUtil.isDuplicate(redefinedGenOperation)) {
			List<GenOperation> redefinedGenOperations = UML2GenModelUtil
				.getRedefinedGenOperations(redefinedGenOperation);

			if (redefinedGenOperations.size() > 0) {
				redefinedGenOperation = redefinedGenOperations.get(0);
			} else {
				break;
			}
		}

		return super.getUniqueName(redefinedGenOperation);
	}

	protected List<GenFeature> collectUnionGenFeatures(
			List<org.eclipse.emf.codegen.ecore.genmodel.GenClass> genClasses,
			List<GenFeature> genFeatures, GenFeatureFilter filter) {
		List<GenFeature> result = new ArrayList<GenFeature>();

		if (genClasses != null) {

			for (org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass : genClasses) {
				result.addAll(collectGenFeatures(null,
					UML2GenModelUtil.getUnionGenFeatures(genClass), filter));
			}
		}

		if (genFeatures != null) {
			result.addAll(collectGenFeatures(null, genFeatures, filter));
		}

		return result;
	}

	public List<GenFeature> getAllUnionGenFeatures() {
		return collectUnionGenFeatures(getAllBaseGenClasses(),
			getUnionGenFeatures(), null);
	}

	@Override
	public List<GenFeature> getEIsSetGenFeatures() {

		if (getGenModel().isMinimalReflectiveMethods()) {
			return getImplementedGenFeatures(null);
		} else {
			return super.getEIsSetGenFeatures();
		}
	}

	@Override
	public boolean implementsAny(Collection<GenFeature> genFeatures) {
		List<GenFeature> implementedGenFeatures = getImplementedGenFeatures(null);

		for (GenFeature genFeature : genFeatures) {
			final EStructuralFeature ecoreFeature = genFeature
				.getEcoreFeature();

			if (implementedGenFeatures.contains(genFeature)
				|| !collectGenFeatures(null, getDuplicateGenFeatures(),
					new GenFeatureFilter() {

						public boolean accept(GenFeature genFeature) {
							return Generator.getRedefinedEcoreFeatures(
								genFeature.getEcoreFeature()).contains(
								ecoreFeature);
						}
					}).isEmpty()) {

				return true;
			}
		}

		return false;
	}

}
