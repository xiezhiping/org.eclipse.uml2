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
package org.eclipse.uml2.uml.profile.standard.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.uml.profile.standard.Auxiliary;
import org.eclipse.uml2.uml.profile.standard.BuildComponent;
import org.eclipse.uml2.uml.profile.standard.Call;
import org.eclipse.uml2.uml.profile.standard.Create;
import org.eclipse.uml2.uml.profile.standard.Derive;
import org.eclipse.uml2.uml.profile.standard.Destroy;
import org.eclipse.uml2.uml.profile.standard.Document;
import org.eclipse.uml2.uml.profile.standard.Entity;
import org.eclipse.uml2.uml.profile.standard.Executable;
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
import org.eclipse.uml2.uml.profile.standard.StandardFactory;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.profile.standard.Subsystem;
import org.eclipse.uml2.uml.profile.standard.SystemModel;
import org.eclipse.uml2.uml.profile.standard.Trace;
import org.eclipse.uml2.uml.profile.standard.Type;
import org.eclipse.uml2.uml.profile.standard.Utility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardFactoryImpl
		extends EFactoryImpl
		implements StandardFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardFactory init() {
		try {
			StandardFactory theStandardFactory = (StandardFactory) EPackage.Registry.INSTANCE
				.getEFactory(StandardPackage.eNS_URI);
			if (theStandardFactory != null) {
				return theStandardFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StandardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFactoryImpl() {
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
			case StandardPackage.AUXILIARY :
				return createAuxiliary();
			case StandardPackage.CALL :
				return createCall();
			case StandardPackage.CREATE :
				return createCreate();
			case StandardPackage.DERIVE :
				return createDerive();
			case StandardPackage.DESTROY :
				return createDestroy();
			case StandardPackage.DOCUMENT :
				return createDocument();
			case StandardPackage.ENTITY :
				return createEntity();
			case StandardPackage.EXECUTABLE :
				return createExecutable();
			case StandardPackage.FOCUS :
				return createFocus();
			case StandardPackage.FRAMEWORK :
				return createFramework();
			case StandardPackage.IMPLEMENT :
				return createImplement();
			case StandardPackage.IMPLEMENTATION_CLASS :
				return createImplementationClass();
			case StandardPackage.INSTANTIATE :
				return createInstantiate();
			case StandardPackage.LIBRARY :
				return createLibrary();
			case StandardPackage.METACLASS :
				return createMetaclass();
			case StandardPackage.MODEL_LIBRARY :
				return createModelLibrary();
			case StandardPackage.PROCESS :
				return createProcess();
			case StandardPackage.REALIZATION :
				return createRealization();
			case StandardPackage.REFINE :
				return createRefine();
			case StandardPackage.RESPONSIBILITY :
				return createResponsibility();
			case StandardPackage.SCRIPT :
				return createScript();
			case StandardPackage.SEND :
				return createSend();
			case StandardPackage.SERVICE :
				return createService();
			case StandardPackage.SOURCE :
				return createSource();
			case StandardPackage.SPECIFICATION :
				return createSpecification();
			case StandardPackage.SUBSYSTEM :
				return createSubsystem();
			case StandardPackage.TRACE :
				return createTrace();
			case StandardPackage.TYPE :
				return createType();
			case StandardPackage.UTILITY :
				return createUtility();
			case StandardPackage.BUILD_COMPONENT :
				return createBuildComponent();
			case StandardPackage.METAMODEL :
				return createMetamodel();
			case StandardPackage.SYSTEM_MODEL :
				return createSystemModel();
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
	public org.eclipse.uml2.uml.profile.standard.Process createProcess() {
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
	public BuildComponent createBuildComponent() {
		BuildComponentImpl buildComponent = new BuildComponentImpl();
		return buildComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModel createSystemModel() {
		SystemModelImpl systemModel = new SystemModelImpl();
		return systemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPackage getStandardPackage() {
		return (StandardPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StandardPackage getPackage() {
		return StandardPackage.eINSTANCE;
	}

} //StandardFactoryImpl
