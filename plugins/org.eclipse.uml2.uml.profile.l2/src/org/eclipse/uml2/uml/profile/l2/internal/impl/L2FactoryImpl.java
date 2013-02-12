/*
 * Copyright (c) 2011, 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *   Kenn Hussey (CEA) - 397324
 *
 */
package org.eclipse.uml2.uml.profile.l2.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.uml.profile.l2.Auxiliary;
import org.eclipse.uml2.uml.profile.l2.Call;
import org.eclipse.uml2.uml.profile.l2.Create;
import org.eclipse.uml2.uml.profile.l2.Derive;
import org.eclipse.uml2.uml.profile.l2.Destroy;
import org.eclipse.uml2.uml.profile.l2.Document;
import org.eclipse.uml2.uml.profile.l2.Entity;
import org.eclipse.uml2.uml.profile.l2.Executable;
import org.eclipse.uml2.uml.profile.l2.Focus;
import org.eclipse.uml2.uml.profile.l2.Framework;
import org.eclipse.uml2.uml.profile.l2.Implement;
import org.eclipse.uml2.uml.profile.l2.ImplementationClass;
import org.eclipse.uml2.uml.profile.l2.Instantiate;
import org.eclipse.uml2.uml.profile.l2.L2Factory;
import org.eclipse.uml2.uml.profile.l2.L2Package;
import org.eclipse.uml2.uml.profile.l2.Library;
import org.eclipse.uml2.uml.profile.l2.Metaclass;
import org.eclipse.uml2.uml.profile.l2.ModelLibrary;
import org.eclipse.uml2.uml.profile.l2.Realization;
import org.eclipse.uml2.uml.profile.l2.Refine;
import org.eclipse.uml2.uml.profile.l2.Responsibility;
import org.eclipse.uml2.uml.profile.l2.Script;
import org.eclipse.uml2.uml.profile.l2.Send;
import org.eclipse.uml2.uml.profile.l2.Service;
import org.eclipse.uml2.uml.profile.l2.Source;
import org.eclipse.uml2.uml.profile.l2.Specification;
import org.eclipse.uml2.uml.profile.l2.Subsystem;
import org.eclipse.uml2.uml.profile.l2.Trace;
import org.eclipse.uml2.uml.profile.l2.Type;
import org.eclipse.uml2.uml.profile.l2.Utility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class L2FactoryImpl
		extends EFactoryImpl
		implements L2Factory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static L2Factory init() {
		try {
			L2Factory theL2Factory = (L2Factory) EPackage.Registry.INSTANCE
				.getEFactory(L2Package.eNS_URI);
			if (theL2Factory != null) {
				return theL2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new L2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case L2Package.AUXILIARY :
				return createAuxiliary();
			case L2Package.CALL :
				return createCall();
			case L2Package.CREATE :
				return createCreate();
			case L2Package.DERIVE :
				return createDerive();
			case L2Package.DESTROY :
				return createDestroy();
			case L2Package.DOCUMENT :
				return createDocument();
			case L2Package.ENTITY :
				return createEntity();
			case L2Package.EXECUTABLE :
				return createExecutable();
			case L2Package.FOCUS :
				return createFocus();
			case L2Package.FRAMEWORK :
				return createFramework();
			case L2Package.IMPLEMENT :
				return createImplement();
			case L2Package.IMPLEMENTATION_CLASS :
				return createImplementationClass();
			case L2Package.INSTANTIATE :
				return createInstantiate();
			case L2Package.LIBRARY :
				return createLibrary();
			case L2Package.METACLASS :
				return createMetaclass();
			case L2Package.MODEL_LIBRARY :
				return createModelLibrary();
			case L2Package.PROCESS :
				return createProcess();
			case L2Package.REALIZATION :
				return createRealization();
			case L2Package.REFINE :
				return createRefine();
			case L2Package.RESPONSIBILITY :
				return createResponsibility();
			case L2Package.SCRIPT :
				return createScript();
			case L2Package.SEND :
				return createSend();
			case L2Package.SERVICE :
				return createService();
			case L2Package.SOURCE :
				return createSource();
			case L2Package.SPECIFICATION :
				return createSpecification();
			case L2Package.SUBSYSTEM :
				return createSubsystem();
			case L2Package.TRACE :
				return createTrace();
			case L2Package.TYPE :
				return createType();
			case L2Package.UTILITY :
				return createUtility();
			default :
				throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auxiliary createAuxiliary() {
		AuxiliaryImpl auxiliary = new AuxiliaryImpl();
		return auxiliary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derive createDerive() {
		DeriveImpl derive = new DeriveImpl();
		return derive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destroy createDestroy() {
		DestroyImpl destroy = new DestroyImpl();
		return destroy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executable createExecutable() {
		ExecutableImpl executable = new ExecutableImpl();
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Focus createFocus() {
		FocusImpl focus = new FocusImpl();
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework createFramework() {
		FrameworkImpl framework = new FrameworkImpl();
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implement createImplement() {
		ImplementImpl implement = new ImplementImpl();
		return implement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationClass createImplementationClass() {
		ImplementationClassImpl implementationClass = new ImplementationClassImpl();
		return implementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instantiate createInstantiate() {
		InstantiateImpl instantiate = new InstantiateImpl();
		return instantiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass createMetaclass() {
		MetaclassImpl metaclass = new MetaclassImpl();
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLibrary createModelLibrary() {
		ModelLibraryImpl modelLibrary = new ModelLibraryImpl();
		return modelLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.profile.l2.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refine createRefine() {
		RefineImpl refine = new RefineImpl();
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility createResponsibility() {
		ResponsibilityImpl responsibility = new ResponsibilityImpl();
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send createSend() {
		SendImpl send = new SendImpl();
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utility createUtility() {
		UtilityImpl utility = new UtilityImpl();
		return utility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L2Package getL2Package() {
		return (L2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static L2Package getPackage() {
		return L2Package.eINSTANCE;
	}

} //L2FactoryImpl
