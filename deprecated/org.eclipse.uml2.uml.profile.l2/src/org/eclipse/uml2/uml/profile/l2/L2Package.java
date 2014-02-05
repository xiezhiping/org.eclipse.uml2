/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.profile.l2;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.profile.l2.L2Factory
 * @model kind="package"
 * @generated
 */
public interface L2Package
		extends EPackage {

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "l2"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/uml2/4.0.0/UML/Profile/L2"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "l2"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	L2Package eINSTANCE = org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl
		.init();

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.AuxiliaryImpl <em>Auxiliary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.AuxiliaryImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getAuxiliary()
	 * @generated
	 */
	int AUXILIARY = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Auxiliary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Auxiliary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.CallImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getCall()
	 * @generated
	 */
	int CALL = 1;

	/**
	 * The feature id for the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__BASE_USAGE = 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Client And Supplier Are Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL___VALIDATE_CLIENT_AND_SUPPLIER_ARE_OPERATIONS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.CreateImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 2;

	/**
	 * The feature id for the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__BASE_BEHAVIORAL_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__BASE_USAGE = 1;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Validate Client And Supplier Are Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE___VALIDATE_CLIENT_AND_SUPPLIER_ARE_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.DeriveImpl <em>Derive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.DeriveImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getDerive()
	 * @generated
	 */
	int DERIVE = 3;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__BASE_ABSTRACTION = 0;

	/**
	 * The feature id for the '<em><b>Computation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__COMPUTATION = 1;

	/**
	 * The number of structural features of the '<em>Derive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Derive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.DestroyImpl <em>Destroy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.DestroyImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getDestroy()
	 * @generated
	 */
	int DESTROY = 4;

	/**
	 * The feature id for the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY__BASE_BEHAVIORAL_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Destroy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Destroy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.FileImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getFile()
	 * @generated
	 */
	int FILE = 6;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.DocumentImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 5;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BASE_ARTIFACT = FILE__BASE_ARTIFACT;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.EntityImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ExecutableImpl <em>Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ExecutableImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getExecutable()
	 * @generated
	 */
	int EXECUTABLE = 8;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__BASE_ARTIFACT = FILE__BASE_ARTIFACT;

	/**
	 * The number of structural features of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.FocusImpl <em>Focus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.FocusImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getFocus()
	 * @generated
	 */
	int FOCUS = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Focus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Focus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.FrameworkImpl <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.FrameworkImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getFramework()
	 * @generated
	 */
	int FRAMEWORK = 10;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementImpl <em>Implement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getImplement()
	 * @generated
	 */
	int IMPLEMENT = 11;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Implement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Implements Specification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT___VALIDATE_IMPLEMENTS_SPECIFICATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Implement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementationClassImpl <em>Implementation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementationClassImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getImplementationClass()
	 * @generated
	 */
	int IMPLEMENTATION_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Implementation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Cannot Be Realization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS___VALIDATE_CANNOT_BE_REALIZATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Implementation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.InstantiateImpl <em>Instantiate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.InstantiateImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getInstantiate()
	 * @generated
	 */
	int INSTANTIATE = 13;

	/**
	 * The feature id for the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATE__BASE_USAGE = 0;

	/**
	 * The number of structural features of the '<em>Instantiate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Client And Supplier Are Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATE___VALIDATE_CLIENT_AND_SUPPLIER_ARE_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Instantiate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.LibraryImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 14;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BASE_ARTIFACT = FILE__BASE_ARTIFACT;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.MetaclassImpl <em>Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.MetaclassImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getMetaclass()
	 * @generated
	 */
	int METACLASS = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ModelLibraryImpl <em>Model Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ModelLibraryImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getModelLibrary()
	 * @generated
	 */
	int MODEL_LIBRARY = 16;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LIBRARY__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Model Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ProcessImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 17;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.RealizationImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 18;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__BASE_CLASSIFIER = 0;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Cannot Be Implementation Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___VALIDATE_CANNOT_BE_IMPLEMENTATION_CLASS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.RefineImpl <em>Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.RefineImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getRefine()
	 * @generated
	 */
	int REFINE = 19;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_ABSTRACTION = 0;

	/**
	 * The number of structural features of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ResponsibilityImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getResponsibility()
	 * @generated
	 */
	int RESPONSIBILITY = 20;

	/**
	 * The feature id for the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__BASE_USAGE = 0;

	/**
	 * The number of structural features of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ScriptImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 21;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__BASE_ARTIFACT = FILE__BASE_ARTIFACT;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SendImpl <em>Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SendImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSend()
	 * @generated
	 */
	int SEND = 22;

	/**
	 * The feature id for the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__BASE_USAGE = 0;

	/**
	 * The number of structural features of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Client Operation Sends Supplier Signal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND___VALIDATE_CLIENT_OPERATION_SENDS_SUPPLIER_SIGNAL__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ServiceImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 23;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SourceImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 24;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__BASE_ARTIFACT = FILE__BASE_ARTIFACT;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SpecificationImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 25;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__BASE_CLASSIFIER = 0;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Cannot Be Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___VALIDATE_CANNOT_BE_TYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SubsystemImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 26;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.TraceImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 27;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__BASE_ABSTRACTION = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.TypeImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getType()
	 * @generated
	 */
	int TYPE = 28;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Cannot Be Specification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___VALIDATE_CANNOT_BE_SPECIFICATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.UtilityImpl <em>Utility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.UtilityImpl
	 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getUtility()
	 * @generated
	 */
	int UTILITY = 29;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Utility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Is Utility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY___VALIDATE_IS_UTILITY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Utility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Auxiliary <em>Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Auxiliary
	 * @generated
	 */
	EClass getAuxiliary();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Auxiliary#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Auxiliary#getBase_Class()
	 * @see #getAuxiliary()
	 * @generated
	 */
	EReference getAuxiliary_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Call#getBase_Usage <em>Base Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Usage</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Call#getBase_Usage()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Base_Usage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Call#validateClientAndSupplierAreOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client And Supplier Are Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Client And Supplier Are Operations</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Call#validateClientAndSupplierAreOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCall__ValidateClientAndSupplierAreOperations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Create#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavioral Feature</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Create#getBase_BehavioralFeature()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_Base_BehavioralFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Create#getBase_Usage <em>Base Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Usage</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Create#getBase_Usage()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_Base_Usage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Create#validateClientAndSupplierAreClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client And Supplier Are Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Client And Supplier Are Classifiers</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Create#validateClientAndSupplierAreClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCreate__ValidateClientAndSupplierAreClassifiers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Derive <em>Derive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derive</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Derive
	 * @generated
	 */
	EClass getDerive();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Derive#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Derive#getBase_Abstraction()
	 * @see #getDerive()
	 * @generated
	 */
	EReference getDerive_Base_Abstraction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.uml2.uml.profile.l2.Derive#getComputation <em>Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Computation</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Derive#getComputation()
	 * @see #getDerive()
	 * @generated
	 */
	EReference getDerive_Computation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Destroy <em>Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Destroy
	 * @generated
	 */
	EClass getDestroy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Destroy#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavioral Feature</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Destroy#getBase_BehavioralFeature()
	 * @see #getDestroy()
	 * @generated
	 */
	EReference getDestroy_Base_BehavioralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.File#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.File#getBase_Artifact()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Entity#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Entity#getBase_Component()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Executable
	 * @generated
	 */
	EClass getExecutable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Focus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Focus
	 * @generated
	 */
	EClass getFocus();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Focus#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Focus#getBase_Class()
	 * @see #getFocus()
	 * @generated
	 */
	EReference getFocus_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Framework
	 * @generated
	 */
	EClass getFramework();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Framework#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Framework#getBase_Package()
	 * @see #getFramework()
	 * @generated
	 */
	EReference getFramework_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Implement <em>Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implement</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Implement
	 * @generated
	 */
	EClass getImplement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Implement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Implement#getBase_Component()
	 * @see #getImplement()
	 * @generated
	 */
	EReference getImplement_Base_Component();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Implement#validateImplementsSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implements Specification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Implements Specification</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Implement#validateImplementsSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getImplement__ValidateImplementsSpecification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.ImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Class</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.ImplementationClass
	 * @generated
	 */
	EClass getImplementationClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.ImplementationClass#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.ImplementationClass#getBase_Class()
	 * @see #getImplementationClass()
	 * @generated
	 */
	EReference getImplementationClass_Base_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.ImplementationClass#validateCannotBeRealization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Realization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Cannot Be Realization</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.ImplementationClass#validateCannotBeRealization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getImplementationClass__ValidateCannotBeRealization__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Instantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiate</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Instantiate
	 * @generated
	 */
	EClass getInstantiate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Instantiate#getBase_Usage <em>Base Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Usage</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Instantiate#getBase_Usage()
	 * @see #getInstantiate()
	 * @generated
	 */
	EReference getInstantiate_Base_Usage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Instantiate#validateClientAndSupplierAreClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client And Supplier Are Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Client And Supplier Are Classifiers</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Instantiate#validateClientAndSupplierAreClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInstantiate__ValidateClientAndSupplierAreClassifiers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Metaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metaclass</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Metaclass
	 * @generated
	 */
	EClass getMetaclass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Metaclass#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Metaclass#getBase_Class()
	 * @see #getMetaclass()
	 * @generated
	 */
	EReference getMetaclass_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.ModelLibrary <em>Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Library</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.ModelLibrary
	 * @generated
	 */
	EClass getModelLibrary();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.ModelLibrary#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.ModelLibrary#getBase_Package()
	 * @see #getModelLibrary()
	 * @generated
	 */
	EReference getModelLibrary_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Process#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Process#getBase_Component()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Realization#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Realization#getBase_Classifier()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_Base_Classifier();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Realization#validateCannotBeImplementationClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Implementation Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Cannot Be Implementation Class</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Realization#validateCannotBeImplementationClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRealization__ValidateCannotBeImplementationClass__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Refine
	 * @generated
	 */
	EClass getRefine();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Refine#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Refine#getBase_Abstraction()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_Base_Abstraction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsibility</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Responsibility
	 * @generated
	 */
	EClass getResponsibility();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Responsibility#getBase_Usage <em>Base Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Usage</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Responsibility#getBase_Usage()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Base_Usage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Send
	 * @generated
	 */
	EClass getSend();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Send#getBase_Usage <em>Base Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Usage</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Send#getBase_Usage()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Base_Usage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Send#validateClientOperationSendsSupplierSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Client Operation Sends Supplier Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Client Operation Sends Supplier Signal</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Send#validateClientOperationSendsSupplierSignal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSend__ValidateClientOperationSendsSupplierSignal__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Service#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Service#getBase_Component()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Specification#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Specification#getBase_Classifier()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Base_Classifier();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Specification#validateCannotBeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Cannot Be Type</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Specification#validateCannotBeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecification__ValidateCannotBeType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Subsystem#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Subsystem#getBase_Component()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Trace#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Trace#getBase_Abstraction()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Base_Abstraction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Type#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Type#getBase_Class()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Base_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Type#validateCannotBeSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cannot Be Specification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Cannot Be Specification</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Type#validateCannotBeSpecification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getType__ValidateCannotBeSpecification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.profile.l2.Utility <em>Utility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utility</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Utility
	 * @generated
	 */
	EClass getUtility();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.uml.profile.l2.Utility#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.uml2.uml.profile.l2.Utility#getBase_Class()
	 * @see #getUtility()
	 * @generated
	 */
	EReference getUtility_Base_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.uml2.uml.profile.l2.Utility#validateIsUtility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Is Utility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Is Utility</em>' operation.
	 * @see org.eclipse.uml2.uml.profile.l2.Utility#validateIsUtility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUtility__ValidateIsUtility__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	L2Factory getL2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.AuxiliaryImpl <em>Auxiliary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.AuxiliaryImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getAuxiliary()
		 * @generated
		 */
		EClass AUXILIARY = eINSTANCE.getAuxiliary();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY__BASE_CLASS = eINSTANCE.getAuxiliary_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.CallImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Base Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__BASE_USAGE = eINSTANCE.getCall_Base_Usage();

		/**
		 * The meta object literal for the '<em><b>Validate Client And Supplier Are Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL___VALIDATE_CLIENT_AND_SUPPLIER_ARE_OPERATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getCall__ValidateClientAndSupplierAreOperations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.CreateImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Base Behavioral Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__BASE_BEHAVIORAL_FEATURE = eINSTANCE
			.getCreate_Base_BehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Base Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__BASE_USAGE = eINSTANCE.getCreate_Base_Usage();

		/**
		 * The meta object literal for the '<em><b>Validate Client And Supplier Are Classifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE___VALIDATE_CLIENT_AND_SUPPLIER_ARE_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getCreate__ValidateClientAndSupplierAreClassifiers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.DeriveImpl <em>Derive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.DeriveImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getDerive()
		 * @generated
		 */
		EClass DERIVE = eINSTANCE.getDerive();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE__BASE_ABSTRACTION = eINSTANCE
			.getDerive_Base_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Computation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE__COMPUTATION = eINSTANCE.getDerive_Computation();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.DestroyImpl <em>Destroy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.DestroyImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getDestroy()
		 * @generated
		 */
		EClass DESTROY = eINSTANCE.getDestroy();

		/**
		 * The meta object literal for the '<em><b>Base Behavioral Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTROY__BASE_BEHAVIORAL_FEATURE = eINSTANCE
			.getDestroy_Base_BehavioralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.DocumentImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.FileImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__BASE_ARTIFACT = eINSTANCE.getFile_Base_Artifact();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.EntityImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BASE_COMPONENT = eINSTANCE
			.getEntity_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ExecutableImpl <em>Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ExecutableImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getExecutable()
		 * @generated
		 */
		EClass EXECUTABLE = eINSTANCE.getExecutable();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.FocusImpl <em>Focus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.FocusImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getFocus()
		 * @generated
		 */
		EClass FOCUS = eINSTANCE.getFocus();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOCUS__BASE_CLASS = eINSTANCE.getFocus_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.FrameworkImpl <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.FrameworkImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getFramework()
		 * @generated
		 */
		EClass FRAMEWORK = eINSTANCE.getFramework();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAMEWORK__BASE_PACKAGE = eINSTANCE
			.getFramework_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementImpl <em>Implement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getImplement()
		 * @generated
		 */
		EClass IMPLEMENT = eINSTANCE.getImplement();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENT__BASE_COMPONENT = eINSTANCE
			.getImplement_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Validate Implements Specification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENT___VALIDATE_IMPLEMENTS_SPECIFICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getImplement__ValidateImplementsSpecification__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementationClassImpl <em>Implementation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ImplementationClassImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getImplementationClass()
		 * @generated
		 */
		EClass IMPLEMENTATION_CLASS = eINSTANCE.getImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_CLASS__BASE_CLASS = eINSTANCE
			.getImplementationClass_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Validate Cannot Be Realization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLEMENTATION_CLASS___VALIDATE_CANNOT_BE_REALIZATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getImplementationClass__ValidateCannotBeRealization__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.InstantiateImpl <em>Instantiate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.InstantiateImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getInstantiate()
		 * @generated
		 */
		EClass INSTANTIATE = eINSTANCE.getInstantiate();

		/**
		 * The meta object literal for the '<em><b>Base Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATE__BASE_USAGE = eINSTANCE
			.getInstantiate_Base_Usage();

		/**
		 * The meta object literal for the '<em><b>Validate Client And Supplier Are Classifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSTANTIATE___VALIDATE_CLIENT_AND_SUPPLIER_ARE_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getInstantiate__ValidateClientAndSupplierAreClassifiers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.LibraryImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.MetaclassImpl <em>Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.MetaclassImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getMetaclass()
		 * @generated
		 */
		EClass METACLASS = eINSTANCE.getMetaclass();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METACLASS__BASE_CLASS = eINSTANCE.getMetaclass_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ModelLibraryImpl <em>Model Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ModelLibraryImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getModelLibrary()
		 * @generated
		 */
		EClass MODEL_LIBRARY = eINSTANCE.getModelLibrary();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LIBRARY__BASE_PACKAGE = eINSTANCE
			.getModelLibrary_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ProcessImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__BASE_COMPONENT = eINSTANCE
			.getProcess_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.RealizationImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__BASE_CLASSIFIER = eINSTANCE
			.getRealization_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Validate Cannot Be Implementation Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REALIZATION___VALIDATE_CANNOT_BE_IMPLEMENTATION_CLASS__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getRealization__ValidateCannotBeImplementationClass__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.RefineImpl <em>Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.RefineImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getRefine()
		 * @generated
		 */
		EClass REFINE = eINSTANCE.getRefine();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINE__BASE_ABSTRACTION = eINSTANCE
			.getRefine_Base_Abstraction();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ResponsibilityImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getResponsibility()
		 * @generated
		 */
		EClass RESPONSIBILITY = eINSTANCE.getResponsibility();

		/**
		 * The meta object literal for the '<em><b>Base Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__BASE_USAGE = eINSTANCE
			.getResponsibility_Base_Usage();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ScriptImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SendImpl <em>Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SendImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSend()
		 * @generated
		 */
		EClass SEND = eINSTANCE.getSend();

		/**
		 * The meta object literal for the '<em><b>Base Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__BASE_USAGE = eINSTANCE.getSend_Base_Usage();

		/**
		 * The meta object literal for the '<em><b>Validate Client Operation Sends Supplier Signal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND___VALIDATE_CLIENT_OPERATION_SENDS_SUPPLIER_SIGNAL__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getSend__ValidateClientOperationSendsSupplierSignal__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.ServiceImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASE_COMPONENT = eINSTANCE
			.getService_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SourceImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SpecificationImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__BASE_CLASSIFIER = eINSTANCE
			.getSpecification_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Validate Cannot Be Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIFICATION___VALIDATE_CANNOT_BE_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getSpecification__ValidateCannotBeType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.SubsystemImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__BASE_COMPONENT = eINSTANCE
			.getSubsystem_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.TraceImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__BASE_ABSTRACTION = eINSTANCE
			.getTrace_Base_Abstraction();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.TypeImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__BASE_CLASS = eINSTANCE.getType_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Validate Cannot Be Specification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___VALIDATE_CANNOT_BE_SPECIFICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getType__ValidateCannotBeSpecification__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.profile.l2.internal.impl.UtilityImpl <em>Utility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.UtilityImpl
		 * @see org.eclipse.uml2.uml.profile.l2.internal.impl.L2PackageImpl#getUtility()
		 * @generated
		 */
		EClass UTILITY = eINSTANCE.getUtility();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY__BASE_CLASS = eINSTANCE.getUtility_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Validate Is Utility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UTILITY___VALIDATE_IS_UTILITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
			.getUtility__ValidateIsUtility__DiagnosticChain_Map();

	}

} //L2Package
