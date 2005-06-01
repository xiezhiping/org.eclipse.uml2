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
 * $Id: GenModelPackage.java,v 1.3 2005/06/01 21:43:44 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore.genmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory
 * @generated
 */
public interface GenModelPackage
		extends EPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genmodel"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/uml2/1.1.0/GenModel"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genmodel"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenModelPackage eINSTANCE = org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl
		.init();

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenBaseImpl <em>Gen Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenBaseImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenBase()
	 * @generated
	 */
	int GEN_BASE = 0;

	/**
	 * The number of structural features of the the '<em>Gen Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BASE_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenClassImpl <em>Gen Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenClassImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenClass()
	 * @generated
	 */
	int GEN_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__GEN_PACKAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__GEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__PROVIDER = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__PROVIDER;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__IMAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__IMAGE;

	/**
	 * The feature id for the '<em><b>Ecore Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__ECORE_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__ECORE_CLASS;

	/**
	 * The feature id for the '<em><b>Gen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__GEN_FEATURES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__GEN_FEATURES;

	/**
	 * The feature id for the '<em><b>Gen Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__GEN_OPERATIONS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__GEN_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Label Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS__LABEL_FEATURE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS__LABEL_FEATURE;

	/**
	 * The number of structural features of the the '<em>Gen Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASS_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenClassifierImpl <em>Gen Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenClassifierImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenClassifier()
	 * @generated
	 */
	int GEN_CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASSIFIER__GEN_PACKAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASSIFIER__GEN_PACKAGE;

	/**
	 * The number of structural features of the the '<em>Gen Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASSIFIER_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenDataTypeImpl <em>Gen Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenDataTypeImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenDataType()
	 * @generated
	 */
	int GEN_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__GEN_PACKAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_DATA_TYPE__GEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Ecore Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__ECORE_DATA_TYPE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE;

	/**
	 * The number of structural features of the the '<em>Gen Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenEnumImpl <em>Gen Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenEnumImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenEnum()
	 * @generated
	 */
	int GEN_ENUM = 4;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM__GEN_PACKAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM__GEN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Ecore Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM__ECORE_DATA_TYPE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM__ECORE_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Ecore Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM__ECORE_ENUM = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM__ECORE_ENUM;

	/**
	 * The feature id for the '<em><b>Gen Enum Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM__GEN_ENUM_LITERALS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM__GEN_ENUM_LITERALS;

	/**
	 * The number of structural features of the the '<em>Gen Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenEnumLiteralImpl <em>Gen Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenEnumLiteralImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenEnumLiteral()
	 * @generated
	 */
	int GEN_ENUM_LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Gen Enum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM_LITERAL__GEN_ENUM = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM_LITERAL__GEN_ENUM;

	/**
	 * The feature id for the '<em><b>Ecore Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM_LITERAL__ECORE_ENUM_LITERAL = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM_LITERAL__ECORE_ENUM_LITERAL;

	/**
	 * The number of structural features of the the '<em>Gen Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENUM_LITERAL_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_ENUM_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenFeatureImpl <em>Gen Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenFeatureImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenFeature()
	 * @generated
	 */
	int GEN_FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__PROPERTY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Notify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__NOTIFY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__NOTIFY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__CHILDREN = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Create Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__CREATE_CHILD = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__CREATE_CHILD;

	/**
	 * The feature id for the '<em><b>Property Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__PROPERTY_CATEGORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__PROPERTY_CATEGORY;

	/**
	 * The feature id for the '<em><b>Property Filter Flags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__PROPERTY_FILTER_FLAGS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__PROPERTY_FILTER_FLAGS;

	/**
	 * The feature id for the '<em><b>Property Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__PROPERTY_DESCRIPTION = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__PROPERTY_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__GEN_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__GEN_CLASS;

	/**
	 * The feature id for the '<em><b>Ecore Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__ECORE_FEATURE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE__ECORE_FEATURE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__KEY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Gen Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl <em>Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenModel()
	 * @generated
	 */
	int GEN_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__COPYRIGHT_TEXT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__MODEL_DIRECTORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__MODEL_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Creation Commands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__CREATION_COMMANDS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__CREATION_COMMANDS;

	/**
	 * The feature id for the '<em><b>Creation Icons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__CREATION_ICONS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__CREATION_ICONS;

	/**
	 * The feature id for the '<em><b>Edit Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__EDIT_DIRECTORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__EDIT_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Editor Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__EDITOR_DIRECTORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Model Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__MODEL_PLUGIN_ID = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Template Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__TEMPLATE_DIRECTORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Runtime Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__RUNTIME_JAR = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__RUNTIME_JAR;

	/**
	 * The feature id for the '<em><b>Foreign Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__FOREIGN_MODEL = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__FOREIGN_MODEL;

	/**
	 * The feature id for the '<em><b>Dynamic Templates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__DYNAMIC_TEMPLATES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES;

	/**
	 * The feature id for the '<em><b>Redirection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__REDIRECTION = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__REDIRECTION;

	/**
	 * The feature id for the '<em><b>Force Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__FORCE_OVERWRITE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__FORCE_OVERWRITE;

	/**
	 * The feature id for the '<em><b>Non Externalized String Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__NON_EXTERNALIZED_STRING_TAG = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__NON_EXTERNALIZED_STRING_TAG;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__MODEL_NAME = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__MODEL_NAME;

	/**
	 * The feature id for the '<em><b>Model Plugin Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__MODEL_PLUGIN_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS;

	/**
	 * The feature id for the '<em><b>Edit Plugin Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__EDIT_PLUGIN_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS;

	/**
	 * The feature id for the '<em><b>Editor Plugin Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__EDITOR_PLUGIN_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS;

	/**
	 * The feature id for the '<em><b>Update Classpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__UPDATE_CLASSPATH = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__UPDATE_CLASSPATH;

	/**
	 * The feature id for the '<em><b>Generate Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__GENERATE_SCHEMA = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__GENERATE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Non NLS Markers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__NON_NLS_MARKERS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__NON_NLS_MARKERS;

	/**
	 * The feature id for the '<em><b>Static Packages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__STATIC_PACKAGES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__STATIC_PACKAGES;

	/**
	 * The feature id for the '<em><b>Model Plugin Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__MODEL_PLUGIN_VARIABLES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES;

	/**
	 * The feature id for the '<em><b>Root Extends Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__ROOT_EXTENDS_INTERFACE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Root Extends Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__ROOT_EXTENDS_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS;

	/**
	 * The feature id for the '<em><b>Root Implements Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Suppress EMF Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__SUPPRESS_EMF_TYPES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__SUPPRESS_EMF_TYPES;

	/**
	 * The feature id for the '<em><b>Feature Map Wrapper Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE;

	/**
	 * The feature id for the '<em><b>Feature Map Wrapper Internal Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Feature Map Wrapper Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS;

	/**
	 * The feature id for the '<em><b>Runtime Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__RUNTIME_COMPATIBILITY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__RUNTIME_COMPATIBILITY;

	/**
	 * The feature id for the '<em><b>Rich Client Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__RICH_CLIENT_PLATFORM = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__RICH_CLIENT_PLATFORM;

	/**
	 * The feature id for the '<em><b>Reflective Delegation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__REFLECTIVE_DELEGATION = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__REFLECTIVE_DELEGATION;

	/**
	 * The feature id for the '<em><b>Code Formatting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__CODE_FORMATTING = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__CODE_FORMATTING;

	/**
	 * The feature id for the '<em><b>Tests Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__TESTS_DIRECTORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__TESTS_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Test Suite Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__TEST_SUITE_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__TEST_SUITE_CLASS;

	/**
	 * The feature id for the '<em><b>Boolean Flags Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__BOOLEAN_FLAGS_FIELD = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD;

	/**
	 * The feature id for the '<em><b>Boolean Flags Reserved Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS;

	/**
	 * The feature id for the '<em><b>Importer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__IMPORTER_ID = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__IMPORTER_ID;

	/**
	 * The feature id for the '<em><b>Gen Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__GEN_PACKAGES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__GEN_PACKAGES;

	/**
	 * The feature id for the '<em><b>Used Gen Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__USED_GEN_PACKAGES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL__USED_GEN_PACKAGES;

	/**
	 * The feature id for the '<em><b>Factory Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__FACTORY_METHODS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pluralized Getters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__PLURALIZED_GETTERS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cache Adapter Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__CACHE_ADAPTER_SUPPORT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Safe Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__SAFE_STRINGS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invariant Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__INVARIANT_PREFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_MODEL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenOperationImpl <em>Gen Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenOperationImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenOperation()
	 * @generated
	 */
	int GEN_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__GEN_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_OPERATION__GEN_CLASS;

	/**
	 * The feature id for the '<em><b>Ecore Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__ECORE_OPERATION = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_OPERATION__ECORE_OPERATION;

	/**
	 * The feature id for the '<em><b>Gen Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__GEN_PARAMETERS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_OPERATION__GEN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Cache Adapter Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION__CACHE_ADAPTER_SCOPE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Gen Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPERATION_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenPackageImpl <em>Gen Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenPackageImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenPackage()
	 * @generated
	 */
	int GEN_PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__PREFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__PREFIX;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__BASE_PACKAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__BASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__RESOURCE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Disposable Provider Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__DISPOSABLE_PROVIDER_FACTORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__DISPOSABLE_PROVIDER_FACTORY;

	/**
	 * The feature id for the '<em><b>Adapter Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__ADAPTER_FACTORY = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__ADAPTER_FACTORY;

	/**
	 * The feature id for the '<em><b>Load Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__LOAD_INITIALIZATION = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__LOAD_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Interface Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__INTERFACE_PACKAGE_SUFFIX;

	/**
	 * The feature id for the '<em><b>Class Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__CLASS_PACKAGE_SUFFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__CLASS_PACKAGE_SUFFIX;

	/**
	 * The feature id for the '<em><b>Utility Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__UTILITY_PACKAGE_SUFFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__UTILITY_PACKAGE_SUFFIX;

	/**
	 * The feature id for the '<em><b>Provider Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__PROVIDER_PACKAGE_SUFFIX;

	/**
	 * The feature id for the '<em><b>Presentation Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__PRESENTATION_PACKAGE_SUFFIX;

	/**
	 * The feature id for the '<em><b>Tests Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__TESTS_PACKAGE_SUFFIX = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__TESTS_PACKAGE_SUFFIX;

	/**
	 * The feature id for the '<em><b>Generate Example Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GENERATE_EXAMPLE_CLASS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__GENERATE_EXAMPLE_CLASS;

	/**
	 * The feature id for the '<em><b>Ecore Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__ECORE_PACKAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__ECORE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_MODEL = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_ENUMS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__GEN_ENUMS;

	/**
	 * The feature id for the '<em><b>Gen Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_DATA_TYPES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__GEN_DATA_TYPES;

	/**
	 * The feature id for the '<em><b>Gen Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_CLASSES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__GEN_CLASSES;

	/**
	 * The feature id for the '<em><b>Nested Gen Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__NESTED_GEN_PACKAGES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__NESTED_GEN_PACKAGES;

	/**
	 * The feature id for the '<em><b>Gen Classifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__GEN_CLASSIFIERS = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE__GEN_CLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Resource Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__RESOURCE_INTERFACES = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE__OPERATIONS_PACKAGE = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Gen Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PACKAGE_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenParameterImpl <em>Gen Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenParameterImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenParameter()
	 * @generated
	 */
	int GEN_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Gen Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER__GEN_OPERATION = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PARAMETER__GEN_OPERATION;

	/**
	 * The feature id for the '<em><b>Ecore Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER__ECORE_PARAMETER = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PARAMETER__ECORE_PARAMETER;

	/**
	 * The number of structural features of the the '<em>Gen Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PARAMETER_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.impl.GenTypedElementImpl <em>Gen Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenTypedElementImpl
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenTypedElement()
	 * @generated
	 */
	int GEN_TYPED_ELEMENT = 11;

	/**
	 * The number of structural features of the the '<em>Gen Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TYPED_ELEMENT_FEATURE_COUNT = org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.GEN_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope <em>Gen Cache Adapter Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.impl.GenModelPackageImpl#getGenCacheAdapterScope()
	 * @generated
	 */
	int GEN_CACHE_ADAPTER_SCOPE = 12;

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenBase <em>Gen Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Base</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenBase
	 * @generated
	 */
	EClass getGenBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Class</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenClass
	 * @generated
	 */
	EClass getGenClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier <em>Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Classifier</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier
	 * @generated
	 */
	EClass getGenClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Data Type</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenDataType
	 * @generated
	 */
	EClass getGenDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenEnum <em>Gen Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Enum</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenEnum
	 * @generated
	 */
	EClass getGenEnum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenEnumLiteral <em>Gen Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Enum Literal</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenEnumLiteral
	 * @generated
	 */
	EClass getGenEnumLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenFeature
	 * @generated
	 */
	EClass getGenFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenFeature#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenFeature#isKey()
	 * @see #getGenFeature()
	 * @generated
	 */
	EAttribute getGenFeature_Key();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Model</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModel
	 * @generated
	 */
	EClass getGenModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isFactoryMethods <em>Factory Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Methods</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isFactoryMethods()
	 * @see #getGenModel()
	 * @generated
	 */
	EAttribute getGenModel_FactoryMethods();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isPluralizedGetters <em>Pluralized Getters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pluralized Getters</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isPluralizedGetters()
	 * @see #getGenModel()
	 * @generated
	 */
	EAttribute getGenModel_PluralizedGetters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isCacheAdapterSupport <em>Cache Adapter Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Adapter Support</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isCacheAdapterSupport()
	 * @see #getGenModel()
	 * @generated
	 */
	EAttribute getGenModel_CacheAdapterSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isSafeStrings <em>Safe Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe Strings</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModel#isSafeStrings()
	 * @see #getGenModel()
	 * @generated
	 */
	EAttribute getGenModel_SafeStrings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenModel#getInvariantPrefix <em>Invariant Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invariant Prefix</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModel#getInvariantPrefix()
	 * @see #getGenModel()
	 * @generated
	 */
	EAttribute getGenModel_InvariantPrefix();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenOperation <em>Gen Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Operation</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenOperation
	 * @generated
	 */
	EClass getGenOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenOperation#getCacheAdapterScope <em>Cache Adapter Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Adapter Scope</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenOperation#getCacheAdapterScope()
	 * @see #getGenOperation()
	 * @generated
	 */
	EAttribute getGenOperation_CacheAdapterScope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Package</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenPackage
	 * @generated
	 */
	EClass getGenPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#isResourceInterfaces <em>Resource Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Interfaces</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#isResourceInterfaces()
	 * @see #getGenPackage()
	 * @generated
	 */
	EAttribute getGenPackage_ResourceInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#getOperationsPackage <em>Operations Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operations Package</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenPackage#getOperationsPackage()
	 * @see #getGenPackage()
	 * @generated
	 */
	EAttribute getGenPackage_OperationsPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenParameter <em>Gen Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Parameter</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenParameter
	 * @generated
	 */
	EClass getGenParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenTypedElement <em>Gen Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Typed Element</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenTypedElement
	 * @generated
	 */
	EClass getGenTypedElement();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope <em>Gen Cache Adapter Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gen Cache Adapter Scope</em>'.
	 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenCacheAdapterScope
	 * @generated
	 */
	EEnum getGenCacheAdapterScope();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenModelFactory getGenModelFactory();

} //GenModelPackage
