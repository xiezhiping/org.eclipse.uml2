/*
 * Copyright (c) 2014 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.profile.standard.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.profile.standard.Auxiliary;
import org.eclipse.uml2.uml.profile.standard.BuildComponent;
import org.eclipse.uml2.uml.profile.standard.Call;
import org.eclipse.uml2.uml.profile.standard.Create;
import org.eclipse.uml2.uml.profile.standard.Derive;
import org.eclipse.uml2.uml.profile.standard.Destroy;
import org.eclipse.uml2.uml.profile.standard.Document;
import org.eclipse.uml2.uml.profile.standard.Entity;
import org.eclipse.uml2.uml.profile.standard.Executable;
import org.eclipse.uml2.uml.profile.standard.File;
import org.eclipse.uml2.uml.profile.standard.Focus;
import org.eclipse.uml2.uml.profile.standard.Framework;
import org.eclipse.uml2.uml.profile.standard.Implement;
import org.eclipse.uml2.uml.profile.standard.ImplementationClass;
import org.eclipse.uml2.uml.profile.standard.Instantiate;
import org.eclipse.uml2.uml.profile.standard.Library;
import org.eclipse.uml2.uml.profile.standard.Metaclass;
import org.eclipse.uml2.uml.profile.standard.Metamodel;
import org.eclipse.uml2.uml.profile.standard.ModelLibrary;
import org.eclipse.uml2.uml.profile.standard.Realization;
import org.eclipse.uml2.uml.profile.standard.Refine;
import org.eclipse.uml2.uml.profile.standard.Responsibility;
import org.eclipse.uml2.uml.profile.standard.Script;
import org.eclipse.uml2.uml.profile.standard.Send;
import org.eclipse.uml2.uml.profile.standard.Service;
import org.eclipse.uml2.uml.profile.standard.Source;
import org.eclipse.uml2.uml.profile.standard.Specification;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.profile.standard.StandardPlugin;
import org.eclipse.uml2.uml.profile.standard.Subsystem;
import org.eclipse.uml2.uml.profile.standard.SystemModel;
import org.eclipse.uml2.uml.profile.standard.Trace;
import org.eclipse.uml2.uml.profile.standard.Type;
import org.eclipse.uml2.uml.profile.standard.Utility;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.profile.standard.StandardPackage
 * @generated
 */
public class StandardValidator
		extends EObjectValidator {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StandardValidator INSTANCE = new StandardValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.uml2.uml.profile.standard"; //$NON-NLS-1$

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client And Supplier Are Operations' of 'Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL__CLIENT_AND_SUPPLIER_ARE_OPERATIONS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client And Supplier Are Classifiers' of 'Create'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE__CLIENT_AND_SUPPLIER_ARE_CLASSIFIERS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Implements Specification' of 'Implement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMPLEMENT__IMPLEMENTS_SPECIFICATION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cannot Be Realization' of 'Implementation Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMPLEMENTATION_CLASS__CANNOT_BE_REALIZATION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client And Supplier Are Classifiers' of 'Instantiate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANTIATE__CLIENT_AND_SUPPLIER_ARE_CLASSIFIERS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cannot Be Implementation Class' of 'Realization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REALIZATION__CANNOT_BE_IMPLEMENTATION_CLASS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client Operation Sends Supplier Signal' of 'Send'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEND__CLIENT_OPERATION_SENDS_SUPPLIER_SIGNAL = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cannot Be Type' of 'Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPECIFICATION__CANNOT_BE_TYPE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cannot Be Specification' of 'Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TYPE__CANNOT_BE_SPECIFICATION = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Is Utility' of 'Utility'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UTILITY__IS_UTILITY = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return StandardPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StandardPackage.AUXILIARY :
				return validateAuxiliary((Auxiliary) value, diagnostics,
					context);
			case StandardPackage.CALL :
				return validateCall((Call) value, diagnostics, context);
			case StandardPackage.CREATE :
				return validateCreate((Create) value, diagnostics, context);
			case StandardPackage.DERIVE :
				return validateDerive((Derive) value, diagnostics, context);
			case StandardPackage.DESTROY :
				return validateDestroy((Destroy) value, diagnostics, context);
			case StandardPackage.DOCUMENT :
				return validateDocument((Document) value, diagnostics, context);
			case StandardPackage.FILE :
				return validateFile((File) value, diagnostics, context);
			case StandardPackage.ENTITY :
				return validateEntity((Entity) value, diagnostics, context);
			case StandardPackage.EXECUTABLE :
				return validateExecutable((Executable) value, diagnostics,
					context);
			case StandardPackage.FOCUS :
				return validateFocus((Focus) value, diagnostics, context);
			case StandardPackage.FRAMEWORK :
				return validateFramework((Framework) value, diagnostics,
					context);
			case StandardPackage.IMPLEMENT :
				return validateImplement((Implement) value, diagnostics,
					context);
			case StandardPackage.IMPLEMENTATION_CLASS :
				return validateImplementationClass((ImplementationClass) value,
					diagnostics, context);
			case StandardPackage.INSTANTIATE :
				return validateInstantiate((Instantiate) value, diagnostics,
					context);
			case StandardPackage.LIBRARY :
				return validateLibrary((Library) value, diagnostics, context);
			case StandardPackage.METACLASS :
				return validateMetaclass((Metaclass) value, diagnostics,
					context);
			case StandardPackage.MODEL_LIBRARY :
				return validateModelLibrary((ModelLibrary) value, diagnostics,
					context);
			case StandardPackage.PROCESS :
				return validateProcess(
					(org.eclipse.uml2.uml.profile.standard.Process) value,
					diagnostics, context);
			case StandardPackage.REALIZATION :
				return validateRealization((Realization) value, diagnostics,
					context);
			case StandardPackage.REFINE :
				return validateRefine((Refine) value, diagnostics, context);
			case StandardPackage.RESPONSIBILITY :
				return validateResponsibility((Responsibility) value,
					diagnostics, context);
			case StandardPackage.SCRIPT :
				return validateScript((Script) value, diagnostics, context);
			case StandardPackage.SEND :
				return validateSend((Send) value, diagnostics, context);
			case StandardPackage.SERVICE :
				return validateService((Service) value, diagnostics, context);
			case StandardPackage.SOURCE :
				return validateSource((Source) value, diagnostics, context);
			case StandardPackage.SPECIFICATION :
				return validateSpecification((Specification) value,
					diagnostics, context);
			case StandardPackage.SUBSYSTEM :
				return validateSubsystem((Subsystem) value, diagnostics,
					context);
			case StandardPackage.TRACE :
				return validateTrace((Trace) value, diagnostics, context);
			case StandardPackage.TYPE :
				return validateType((Type) value, diagnostics, context);
			case StandardPackage.UTILITY :
				return validateUtility((Utility) value, diagnostics, context);
			case StandardPackage.BUILD_COMPONENT :
				return validateBuildComponent((BuildComponent) value,
					diagnostics, context);
			case StandardPackage.METAMODEL :
				return validateMetamodel((Metamodel) value, diagnostics,
					context);
			case StandardPackage.SYSTEM_MODEL :
				return validateSystemModel((SystemModel) value, diagnostics,
					context);
			default :
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuxiliary(Auxiliary auxiliary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auxiliary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCall(Call call, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(call, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(call, diagnostics,
			context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(call, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(call, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(call,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(call, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(call, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(call, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(call, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCall_validateClientAndSupplierAreOperations(call,
				diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClientAndSupplierAreOperations constraint of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCall_validateClientAndSupplierAreOperations(
			Call call, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return call
			.validateClientAndSupplierAreOperations(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate(Create create, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(create, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(create,
			diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(create, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(create, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(create,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(create, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(create, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(create, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(create, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCreate_validateClientAndSupplierAreClassifiers(
				create, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClientAndSupplierAreClassifiers constraint of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate_validateClientAndSupplierAreClassifiers(
			Create create, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return create.validateClientAndSupplierAreClassifiers(diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerive(Derive derive, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroy(Destroy destroy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(destroy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocument(Document document,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(document, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(file, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutable(Executable executable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFocus(Focus focus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(focus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramework(Framework framework,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(framework, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplement(Implement implement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(implement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(implement,
			diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(implement, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(implement,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(implement,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(implement, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(implement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(implement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(implement, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validateImplement_validateImplementsSpecification(
				implement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateImplementsSpecification constraint of '<em>Implement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplement_validateImplementsSpecification(
			Implement implement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return implement.validateImplementsSpecification(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationClass(
			ImplementationClass implementationClass,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(implementationClass, diagnostics,
			context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
			implementationClass, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(implementationClass,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(implementationClass,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
				implementationClass, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(implementationClass,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(implementationClass, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(implementationClass, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(implementationClass,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImplementationClass_validateCannotBeRealization(
				implementationClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCannotBeRealization constraint of '<em>Implementation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationClass_validateCannotBeRealization(
			ImplementationClass implementationClass,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return implementationClass.validateCannotBeRealization(diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiate(Instantiate instantiate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instantiate, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(instantiate,
			diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(instantiate, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(instantiate,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(instantiate,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(instantiate, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(instantiate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(instantiate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(instantiate, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validateInstantiate_validateClientAndSupplierAreClassifiers(
				instantiate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClientAndSupplierAreClassifiers constraint of '<em>Instantiate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantiate_validateClientAndSupplierAreClassifiers(
			Instantiate instantiate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return instantiate.validateClientAndSupplierAreClassifiers(diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaclass(Metaclass metaclass,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaclass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLibrary(ModelLibrary modelLibrary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLibrary, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(
			org.eclipse.uml2.uml.profile.standard.Process process,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization(Realization realization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realization, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(realization,
			diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(realization, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(realization,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(realization,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(realization, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(realization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(realization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(realization, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validateRealization_validateCannotBeImplementationClass(
				realization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCannotBeImplementationClass constraint of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization_validateCannotBeImplementationClass(
			Realization realization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return realization.validateCannotBeImplementationClass(diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefine(Refine refine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibility(Responsibility responsibility,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibility, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScript(Script script, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(script, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSend(Send send, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(send, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(send, diagnostics,
			context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(send, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(send, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(send,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(send, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(send, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(send, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(send, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSend_validateClientOperationSendsSupplierSignal(
				send, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClientOperationSendsSupplierSignal constraint of '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSend_validateClientOperationSendsSupplierSignal(
			Send send, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return send.validateClientOperationSendsSupplierSignal(diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource(Source source, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(source, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecification(Specification specification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specification, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(specification,
			diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(specification,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(specification,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
				specification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(specification, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(specification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(specification, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(specification, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validateSpecification_validateCannotBeType(specification,
				diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCannotBeType constraint of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecification_validateCannotBeType(
			Specification specification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return specification.validateCannotBeType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsystem(Subsystem subsystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace(Trace trace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics,
			context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(type, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(type, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(type,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateType_validateCannotBeSpecification(type,
				diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCannotBeSpecification constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_validateCannotBeSpecification(Type type,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return type.validateCannotBeSpecification(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUtility(Utility utility,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(utility, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(utility,
			diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(utility, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(utility, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(utility,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(utility, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(utility, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(utility, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(utility, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validateUtility_validateIsUtility(utility, diagnostics,
				context);
		return result;
	}

	/**
	 * Validates the validateIsUtility constraint of '<em>Utility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUtility_validateIsUtility(Utility utility,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return utility.validateIsUtility(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuildComponent(BuildComponent buildComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildComponent, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetamodel(Metamodel metamodel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metamodel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemModel(SystemModel systemModel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemModel, diagnostics,
			context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StandardPlugin.INSTANCE;
	}

} //StandardValidator
