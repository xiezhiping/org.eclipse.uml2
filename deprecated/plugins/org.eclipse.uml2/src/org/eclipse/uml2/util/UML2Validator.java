/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2Validator.java,v 1.1 2004/05/11 15:24:01 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.Abstraction;
import org.eclipse.uml2.AcceptCallAction;
import org.eclipse.uml2.AcceptEventAction;
import org.eclipse.uml2.Action;
import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityFinalNode;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.ActivityParameterNode;
import org.eclipse.uml2.ActivityPartition;
import org.eclipse.uml2.Actor;
import org.eclipse.uml2.AddStructuralFeatureValueAction;
import org.eclipse.uml2.AddVariableValueAction;
import org.eclipse.uml2.AnyTrigger;
import org.eclipse.uml2.ApplyFunctionAction;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.AssociationClass;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.BehavioredClassifier;
import org.eclipse.uml2.BroadcastSignalAction;
import org.eclipse.uml2.CallAction;
import org.eclipse.uml2.CallBehaviorAction;
import org.eclipse.uml2.CallOperationAction;
import org.eclipse.uml2.CallTrigger;
import org.eclipse.uml2.CentralBufferNode;
import org.eclipse.uml2.ChangeTrigger;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.ClassifierTemplateParameter;
import org.eclipse.uml2.Clause;
import org.eclipse.uml2.ClearAssociationAction;
import org.eclipse.uml2.ClearStructuralFeatureAction;
import org.eclipse.uml2.ClearVariableAction;
import org.eclipse.uml2.Collaboration;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.CombinedFragment;
import org.eclipse.uml2.Comment;
import org.eclipse.uml2.CommunicationPath;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.ConditionalNode;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.ConnectableElementTemplateParameter;
import org.eclipse.uml2.ConnectionPointReference;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.ConnectorEnd;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Continuation;
import org.eclipse.uml2.ControlFlow;
import org.eclipse.uml2.ControlNode;
import org.eclipse.uml2.CreateLinkAction;
import org.eclipse.uml2.CreateLinkObjectAction;
import org.eclipse.uml2.CreateObjectAction;
import org.eclipse.uml2.DataStoreNode;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.DecisionNode;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentSpecification;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.DestroyLinkAction;
import org.eclipse.uml2.DestroyObjectAction;
import org.eclipse.uml2.Device;
import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.Duration;
import org.eclipse.uml2.DurationConstraint;
import org.eclipse.uml2.DurationInterval;
import org.eclipse.uml2.DurationObservationAction;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.EncapsulatedClassifier;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.EventOccurrence;
import org.eclipse.uml2.ExceptionHandler;
import org.eclipse.uml2.ExecutableNode;
import org.eclipse.uml2.ExecutionEnvironment;
import org.eclipse.uml2.ExecutionOccurrence;
import org.eclipse.uml2.ExpansionNode;
import org.eclipse.uml2.ExpansionRegion;
import org.eclipse.uml2.Expression;
import org.eclipse.uml2.Extend;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.ExtensionPoint;
import org.eclipse.uml2.Feature;
import org.eclipse.uml2.FinalNode;
import org.eclipse.uml2.FinalState;
import org.eclipse.uml2.FlowFinalNode;
import org.eclipse.uml2.ForkNode;
import org.eclipse.uml2.Gate;
import org.eclipse.uml2.GeneralOrdering;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.GeneralizationSet;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Include;
import org.eclipse.uml2.InformationFlow;
import org.eclipse.uml2.InformationItem;
import org.eclipse.uml2.InitialNode;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.InstanceValue;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionConstraint;
import org.eclipse.uml2.InteractionFragment;
import org.eclipse.uml2.InteractionOccurrence;
import org.eclipse.uml2.InteractionOperand;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.InterruptibleActivityRegion;
import org.eclipse.uml2.Interval;
import org.eclipse.uml2.IntervalConstraint;
import org.eclipse.uml2.InvocationAction;
import org.eclipse.uml2.JoinNode;
import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.LinkAction;
import org.eclipse.uml2.LinkEndCreationData;
import org.eclipse.uml2.LinkEndData;
import org.eclipse.uml2.LiteralBoolean;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralNull;
import org.eclipse.uml2.LiteralSpecification;
import org.eclipse.uml2.LiteralString;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.LoopNode;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.MergeNode;
import org.eclipse.uml2.Message;
import org.eclipse.uml2.MessageEnd;
import org.eclipse.uml2.MessageTrigger;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Node;
import org.eclipse.uml2.ObjectFlow;
import org.eclipse.uml2.ObjectNode;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.OperationTemplateParameter;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageMerge;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterSet;
import org.eclipse.uml2.ParameterableClassifier;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.PartDecomposition;
import org.eclipse.uml2.Permission;
import org.eclipse.uml2.Pin;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.PrimitiveFunction;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.ProtocolConformance;
import org.eclipse.uml2.ProtocolStateMachine;
import org.eclipse.uml2.ProtocolTransition;
import org.eclipse.uml2.Pseudostate;
import org.eclipse.uml2.QualifierValue;
import org.eclipse.uml2.RaiseExceptionAction;
import org.eclipse.uml2.ReadExtentAction;
import org.eclipse.uml2.ReadIsClassifiedObjectAction;
import org.eclipse.uml2.ReadLinkAction;
import org.eclipse.uml2.ReadLinkObjectEndAction;
import org.eclipse.uml2.ReadLinkObjectEndQualifierAction;
import org.eclipse.uml2.ReadSelfAction;
import org.eclipse.uml2.ReadStructuralFeatureAction;
import org.eclipse.uml2.ReadVariableAction;
import org.eclipse.uml2.Realization;
import org.eclipse.uml2.Reception;
import org.eclipse.uml2.ReclassifyObjectAction;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.RedefinableTemplateSignature;
import org.eclipse.uml2.Region;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.RemoveVariableValueAction;
import org.eclipse.uml2.ReplyAction;
import org.eclipse.uml2.SendObjectAction;
import org.eclipse.uml2.SendSignalAction;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.SignalTrigger;
import org.eclipse.uml2.Slot;
import org.eclipse.uml2.StartOwnedBehaviorAction;
import org.eclipse.uml2.State;
import org.eclipse.uml2.StateInvariant;
import org.eclipse.uml2.StateMachine;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.Stop;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.StructuralFeatureAction;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Substitution;
import org.eclipse.uml2.TemplateBinding;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateParameterSubstitution;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.TemplateableClassifier;
import org.eclipse.uml2.TemplateableElement;
import org.eclipse.uml2.TestIdentityAction;
import org.eclipse.uml2.TimeConstraint;
import org.eclipse.uml2.TimeExpression;
import org.eclipse.uml2.TimeInterval;
import org.eclipse.uml2.TimeObservationAction;
import org.eclipse.uml2.TimeTrigger;
import org.eclipse.uml2.Transition;
import org.eclipse.uml2.Trigger;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Usage;
import org.eclipse.uml2.UseCase;
import org.eclipse.uml2.ValuePin;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.Variable;
import org.eclipse.uml2.VariableAction;
import org.eclipse.uml2.Vertex;
import org.eclipse.uml2.WriteLinkAction;
import org.eclipse.uml2.WriteStructuralFeatureAction;
import org.eclipse.uml2.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.UML2Package
 * @generated
 */
public class UML2Validator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UML2Validator INSTANCE = new UML2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.uml2";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Not Own Self' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__NOT_OWN_SELF = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Has Owner' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__HAS_OWNER = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Upper Gt0' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_GT0 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Lower Ge0' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__LOWER_GE0 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Upper Ge Lower' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_GE_LOWER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Lower Eq Lowerbound' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__LOWER_EQ_LOWERBOUND = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Upper Eq Upperbound' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_EQ_UPPERBOUND = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Opposite Is Other End' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__OPPOSITE_IS_OTHER_END = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Multiplicity Of Composite' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__MULTIPLICITY_OF_COMPOSITE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Subsetting Context' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_CONTEXT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Navigable Property Redefinition' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__NAVIGABLE_PROPERTY_REDEFINITION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Subsetting Rules' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_RULES = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Navigable Readonly' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__NAVIGABLE_READONLY = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Derived Union Is Derived' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__DERIVED_UNION_IS_DERIVED = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Type Of Result' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__TYPE_OF_RESULT = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Only Body For Query' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__ONLY_BODY_FOR_QUERY = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate No Name' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__NO_NAME = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Qualified Name' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__QUALIFIED_NAME = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Visibility Needs Ownership' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Elements Public Or Private' of 'Package'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Members Are Distinguishable' of 'Namespace'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMESPACE__MEMBERS_ARE_DISTINGUISHABLE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Imported Member Derived' of 'Namespace'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMESPACE__IMPORTED_MEMBER_DERIVED = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate No Cycles In Generalization' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__NO_CYCLES_IN_GENERALIZATION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Specialize Type' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__SPECIALIZE_TYPE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Inherited Member' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__INHERITED_MEMBER = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate General Equals Parents' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__GENERAL_EQUALS_PARENTS = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Not Apply To Self' of 'Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINT__NOT_APPLY_TO_SELF = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Slots Are Defined' of 'Instance Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__SLOTS_ARE_DEFINED = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate No Duplicate Slots' of 'Instance Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__NO_DUPLICATE_SLOTS = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Redefinition Context Valid' of 'Redefinable Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Redefinition Consistent' of 'Redefinable Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Visibility Public Or Private' of 'Element Import'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Imported Element Is Public' of 'Element Import'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'validate Public Or Private' of 'Package Import'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PACKAGE_IMPORT__PUBLIC_OR_PRIVATE = 34;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 34;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Validator() {
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return UML2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case UML2Package.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case UML2Package.MULTIPLICITY_ELEMENT:
				return validateMultiplicityElement((MultiplicityElement)value, diagnostics, context);
			case UML2Package.CLASS:
				return validateClass((org.eclipse.uml2.Class)value, diagnostics, context);
			case UML2Package.TYPE:
				return validateType((Type)value, diagnostics, context);
			case UML2Package.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case UML2Package.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case UML2Package.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case UML2Package.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case UML2Package.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case UML2Package.PACKAGE:
				return validatePackage((org.eclipse.uml2.Package)value, diagnostics, context);
			case UML2Package.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case UML2Package.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case UML2Package.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case UML2Package.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case UML2Package.OPAQUE_EXPRESSION:
				return validateOpaqueExpression((OpaqueExpression)value, diagnostics, context);
			case UML2Package.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case UML2Package.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case UML2Package.NAMESPACE:
				return validateNamespace((Namespace)value, diagnostics, context);
			case UML2Package.DIRECTED_RELATIONSHIP:
				return validateDirectedRelationship((DirectedRelationship)value, diagnostics, context);
			case UML2Package.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case UML2Package.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case UML2Package.LITERAL_BOOLEAN:
				return validateLiteralBoolean((LiteralBoolean)value, diagnostics, context);
			case UML2Package.LITERAL_SPECIFICATION:
				return validateLiteralSpecification((LiteralSpecification)value, diagnostics, context);
			case UML2Package.LITERAL_STRING:
				return validateLiteralString((LiteralString)value, diagnostics, context);
			case UML2Package.LITERAL_NULL:
				return validateLiteralNull((LiteralNull)value, diagnostics, context);
			case UML2Package.LITERAL_INTEGER:
				return validateLiteralInteger((LiteralInteger)value, diagnostics, context);
			case UML2Package.LITERAL_UNLIMITED_NATURAL:
				return validateLiteralUnlimitedNatural((LiteralUnlimitedNatural)value, diagnostics, context);
			case UML2Package.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case UML2Package.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case UML2Package.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case UML2Package.BEHAVIORAL_FEATURE:
				return validateBehavioralFeature((BehavioralFeature)value, diagnostics, context);
			case UML2Package.STRUCTURAL_FEATURE:
				return validateStructuralFeature((StructuralFeature)value, diagnostics, context);
			case UML2Package.REDEFINABLE_ELEMENT:
				return validateRedefinableElement((RedefinableElement)value, diagnostics, context);
			case UML2Package.GENERALIZATION:
				return validateGeneralization((Generalization)value, diagnostics, context);
			case UML2Package.INSTANCE_SPECIFICATION:
				return validateInstanceSpecification((InstanceSpecification)value, diagnostics, context);
			case UML2Package.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case UML2Package.INSTANCE_VALUE:
				return validateInstanceValue((InstanceValue)value, diagnostics, context);
			case UML2Package.PACKAGEABLE_ELEMENT:
				return validatePackageableElement((PackageableElement)value, diagnostics, context);
			case UML2Package.ELEMENT_IMPORT:
				return validateElementImport((ElementImport)value, diagnostics, context);
			case UML2Package.PACKAGE_IMPORT:
				return validatePackageImport((PackageImport)value, diagnostics, context);
			case UML2Package.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case UML2Package.PACKAGE_MERGE:
				return validatePackageMerge((PackageMerge)value, diagnostics, context);
			case UML2Package.STEREOTYPE:
				return validateStereotype((Stereotype)value, diagnostics, context);
			case UML2Package.PROFILE:
				return validateProfile((Profile)value, diagnostics, context);
			case UML2Package.PROFILE_APPLICATION:
				return validateProfileApplication((ProfileApplication)value, diagnostics, context);
			case UML2Package.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case UML2Package.EXTENSION_END:
				return validateExtensionEnd((ExtensionEnd)value, diagnostics, context);
			case UML2Package.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case UML2Package.ASSOCIATION_CLASS:
				return validateAssociationClass((AssociationClass)value, diagnostics, context);
			case UML2Package.GENERALIZATION_SET:
				return validateGeneralizationSet((GeneralizationSet)value, diagnostics, context);
			case UML2Package.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case UML2Package.BEHAVIORED_CLASSIFIER:
				return validateBehavioredClassifier((BehavioredClassifier)value, diagnostics, context);
			case UML2Package.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case UML2Package.PERMISSION:
				return validatePermission((Permission)value, diagnostics, context);
			case UML2Package.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case UML2Package.USAGE:
				return validateUsage((Usage)value, diagnostics, context);
			case UML2Package.ABSTRACTION:
				return validateAbstraction((Abstraction)value, diagnostics, context);
			case UML2Package.REALIZATION:
				return validateRealization((Realization)value, diagnostics, context);
			case UML2Package.SUBSTITUTION:
				return validateSubstitution((Substitution)value, diagnostics, context);
			case UML2Package.INFORMATION_ITEM:
				return validateInformationItem((InformationItem)value, diagnostics, context);
			case UML2Package.INFORMATION_FLOW:
				return validateInformationFlow((InformationFlow)value, diagnostics, context);
			case UML2Package.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case UML2Package.EXTEND:
				return validateExtend((Extend)value, diagnostics, context);
			case UML2Package.USE_CASE:
				return validateUseCase((UseCase)value, diagnostics, context);
			case UML2Package.EXTENSION_POINT:
				return validateExtensionPoint((ExtensionPoint)value, diagnostics, context);
			case UML2Package.INCLUDE:
				return validateInclude((Include)value, diagnostics, context);
			case UML2Package.ACTIVITY_EDGE:
				return validateActivityEdge((ActivityEdge)value, diagnostics, context);
			case UML2Package.ACTIVITY_GROUP:
				return validateActivityGroup((ActivityGroup)value, diagnostics, context);
			case UML2Package.ACTIVITY_NODE:
				return validateActivityNode((ActivityNode)value, diagnostics, context);
			case UML2Package.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case UML2Package.OBJECT_NODE:
				return validateObjectNode((ObjectNode)value, diagnostics, context);
			case UML2Package.CONTROL_NODE:
				return validateControlNode((ControlNode)value, diagnostics, context);
			case UML2Package.CONTROL_FLOW:
				return validateControlFlow((ControlFlow)value, diagnostics, context);
			case UML2Package.OBJECT_FLOW:
				return validateObjectFlow((ObjectFlow)value, diagnostics, context);
			case UML2Package.INITIAL_NODE:
				return validateInitialNode((InitialNode)value, diagnostics, context);
			case UML2Package.FINAL_NODE:
				return validateFinalNode((FinalNode)value, diagnostics, context);
			case UML2Package.ACTIVITY_FINAL_NODE:
				return validateActivityFinalNode((ActivityFinalNode)value, diagnostics, context);
			case UML2Package.DECISION_NODE:
				return validateDecisionNode((DecisionNode)value, diagnostics, context);
			case UML2Package.MERGE_NODE:
				return validateMergeNode((MergeNode)value, diagnostics, context);
			case UML2Package.EXECUTABLE_NODE:
				return validateExecutableNode((ExecutableNode)value, diagnostics, context);
			case UML2Package.OUTPUT_PIN:
				return validateOutputPin((OutputPin)value, diagnostics, context);
			case UML2Package.INPUT_PIN:
				return validateInputPin((InputPin)value, diagnostics, context);
			case UML2Package.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case UML2Package.ACTIVITY_PARAMETER_NODE:
				return validateActivityParameterNode((ActivityParameterNode)value, diagnostics, context);
			case UML2Package.VALUE_PIN:
				return validateValuePin((ValuePin)value, diagnostics, context);
			case UML2Package.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case UML2Package.IMPLEMENTATION:
				return validateImplementation((Implementation)value, diagnostics, context);
			case UML2Package.ARTIFACT:
				return validateArtifact((Artifact)value, diagnostics, context);
			case UML2Package.MANIFESTATION:
				return validateManifestation((Manifestation)value, diagnostics, context);
			case UML2Package.CONNECTOR_END:
				return validateConnectorEnd((ConnectorEnd)value, diagnostics, context);
			case UML2Package.CONNECTABLE_ELEMENT:
				return validateConnectableElement((ConnectableElement)value, diagnostics, context);
			case UML2Package.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case UML2Package.STRUCTURED_CLASSIFIER:
				return validateStructuredClassifier((StructuredClassifier)value, diagnostics, context);
			case UML2Package.CALL_TRIGGER:
				return validateCallTrigger((CallTrigger)value, diagnostics, context);
			case UML2Package.MESSAGE_TRIGGER:
				return validateMessageTrigger((MessageTrigger)value, diagnostics, context);
			case UML2Package.CHANGE_TRIGGER:
				return validateChangeTrigger((ChangeTrigger)value, diagnostics, context);
			case UML2Package.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case UML2Package.RECEPTION:
				return validateReception((Reception)value, diagnostics, context);
			case UML2Package.SIGNAL:
				return validateSignal((Signal)value, diagnostics, context);
			case UML2Package.SIGNAL_TRIGGER:
				return validateSignalTrigger((SignalTrigger)value, diagnostics, context);
			case UML2Package.TIME_TRIGGER:
				return validateTimeTrigger((TimeTrigger)value, diagnostics, context);
			case UML2Package.ANY_TRIGGER:
				return validateAnyTrigger((AnyTrigger)value, diagnostics, context);
			case UML2Package.PORT:
				return validatePort((Port)value, diagnostics, context);
			case UML2Package.ENCAPSULATED_CLASSIFIER:
				return validateEncapsulatedClassifier((EncapsulatedClassifier)value, diagnostics, context);
			case UML2Package.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case UML2Package.INTERACTION_FRAGMENT:
				return validateInteractionFragment((InteractionFragment)value, diagnostics, context);
			case UML2Package.LIFELINE:
				return validateLifeline((Lifeline)value, diagnostics, context);
			case UML2Package.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case UML2Package.GENERAL_ORDERING:
				return validateGeneralOrdering((GeneralOrdering)value, diagnostics, context);
			case UML2Package.MESSAGE_END:
				return validateMessageEnd((MessageEnd)value, diagnostics, context);
			case UML2Package.EVENT_OCCURRENCE:
				return validateEventOccurrence((EventOccurrence)value, diagnostics, context);
			case UML2Package.EXECUTION_OCCURRENCE:
				return validateExecutionOccurrence((ExecutionOccurrence)value, diagnostics, context);
			case UML2Package.STATE_INVARIANT:
				return validateStateInvariant((StateInvariant)value, diagnostics, context);
			case UML2Package.STOP:
				return validateStop((Stop)value, diagnostics, context);
			case UML2Package.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case UML2Package.STRUCTURED_ACTIVITY_NODE:
				return validateStructuredActivityNode((StructuredActivityNode)value, diagnostics, context);
			case UML2Package.CONDITIONAL_NODE:
				return validateConditionalNode((ConditionalNode)value, diagnostics, context);
			case UML2Package.CLAUSE:
				return validateClause((Clause)value, diagnostics, context);
			case UML2Package.LOOP_NODE:
				return validateLoopNode((LoopNode)value, diagnostics, context);
			case UML2Package.TEMPLATE_SIGNATURE:
				return validateTemplateSignature((TemplateSignature)value, diagnostics, context);
			case UML2Package.TEMPLATE_PARAMETER:
				return validateTemplateParameter((TemplateParameter)value, diagnostics, context);
			case UML2Package.TEMPLATEABLE_ELEMENT:
				return validateTemplateableElement((TemplateableElement)value, diagnostics, context);
			case UML2Package.STRING_EXPRESSION:
				return validateStringExpression((StringExpression)value, diagnostics, context);
			case UML2Package.PARAMETERABLE_ELEMENT:
				return validateParameterableElement((ParameterableElement)value, diagnostics, context);
			case UML2Package.TEMPLATE_BINDING:
				return validateTemplateBinding((TemplateBinding)value, diagnostics, context);
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION:
				return validateTemplateParameterSubstitution((TemplateParameterSubstitution)value, diagnostics, context);
			case UML2Package.COLLABORATION:
				return validateCollaboration((Collaboration)value, diagnostics, context);
			case UML2Package.OPERATION_TEMPLATE_PARAMETER:
				return validateOperationTemplateParameter((OperationTemplateParameter)value, diagnostics, context);
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER:
				return validateClassifierTemplateParameter((ClassifierTemplateParameter)value, diagnostics, context);
			case UML2Package.PARAMETERABLE_CLASSIFIER:
				return validateParameterableClassifier((ParameterableClassifier)value, diagnostics, context);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE:
				return validateRedefinableTemplateSignature((RedefinableTemplateSignature)value, diagnostics, context);
			case UML2Package.TEMPLATEABLE_CLASSIFIER:
				return validateTemplateableClassifier((TemplateableClassifier)value, diagnostics, context);
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				return validateConnectableElementTemplateParameter((ConnectableElementTemplateParameter)value, diagnostics, context);
			case UML2Package.COLLABORATION_OCCURRENCE:
				return validateCollaborationOccurrence((CollaborationOccurrence)value, diagnostics, context);
			case UML2Package.INTERACTION_OCCURRENCE:
				return validateInteractionOccurrence((InteractionOccurrence)value, diagnostics, context);
			case UML2Package.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case UML2Package.PART_DECOMPOSITION:
				return validatePartDecomposition((PartDecomposition)value, diagnostics, context);
			case UML2Package.INTERACTION_OPERAND:
				return validateInteractionOperand((InteractionOperand)value, diagnostics, context);
			case UML2Package.INTERACTION_CONSTRAINT:
				return validateInteractionConstraint((InteractionConstraint)value, diagnostics, context);
			case UML2Package.COMBINED_FRAGMENT:
				return validateCombinedFragment((CombinedFragment)value, diagnostics, context);
			case UML2Package.CONTINUATION:
				return validateContinuation((Continuation)value, diagnostics, context);
			case UML2Package.CREATE_OBJECT_ACTION:
				return validateCreateObjectAction((CreateObjectAction)value, diagnostics, context);
			case UML2Package.DESTROY_OBJECT_ACTION:
				return validateDestroyObjectAction((DestroyObjectAction)value, diagnostics, context);
			case UML2Package.TEST_IDENTITY_ACTION:
				return validateTestIdentityAction((TestIdentityAction)value, diagnostics, context);
			case UML2Package.READ_SELF_ACTION:
				return validateReadSelfAction((ReadSelfAction)value, diagnostics, context);
			case UML2Package.STRUCTURAL_FEATURE_ACTION:
				return validateStructuralFeatureAction((StructuralFeatureAction)value, diagnostics, context);
			case UML2Package.READ_STRUCTURAL_FEATURE_ACTION:
				return validateReadStructuralFeatureAction((ReadStructuralFeatureAction)value, diagnostics, context);
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION:
				return validateWriteStructuralFeatureAction((WriteStructuralFeatureAction)value, diagnostics, context);
			case UML2Package.CLEAR_STRUCTURAL_FEATURE_ACTION:
				return validateClearStructuralFeatureAction((ClearStructuralFeatureAction)value, diagnostics, context);
			case UML2Package.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				return validateRemoveStructuralFeatureValueAction((RemoveStructuralFeatureValueAction)value, diagnostics, context);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				return validateAddStructuralFeatureValueAction((AddStructuralFeatureValueAction)value, diagnostics, context);
			case UML2Package.LINK_ACTION:
				return validateLinkAction((LinkAction)value, diagnostics, context);
			case UML2Package.LINK_END_DATA:
				return validateLinkEndData((LinkEndData)value, diagnostics, context);
			case UML2Package.READ_LINK_ACTION:
				return validateReadLinkAction((ReadLinkAction)value, diagnostics, context);
			case UML2Package.LINK_END_CREATION_DATA:
				return validateLinkEndCreationData((LinkEndCreationData)value, diagnostics, context);
			case UML2Package.CREATE_LINK_ACTION:
				return validateCreateLinkAction((CreateLinkAction)value, diagnostics, context);
			case UML2Package.WRITE_LINK_ACTION:
				return validateWriteLinkAction((WriteLinkAction)value, diagnostics, context);
			case UML2Package.DESTROY_LINK_ACTION:
				return validateDestroyLinkAction((DestroyLinkAction)value, diagnostics, context);
			case UML2Package.CLEAR_ASSOCIATION_ACTION:
				return validateClearAssociationAction((ClearAssociationAction)value, diagnostics, context);
			case UML2Package.VARIABLE_ACTION:
				return validateVariableAction((VariableAction)value, diagnostics, context);
			case UML2Package.READ_VARIABLE_ACTION:
				return validateReadVariableAction((ReadVariableAction)value, diagnostics, context);
			case UML2Package.WRITE_VARIABLE_ACTION:
				return validateWriteVariableAction((WriteVariableAction)value, diagnostics, context);
			case UML2Package.CLEAR_VARIABLE_ACTION:
				return validateClearVariableAction((ClearVariableAction)value, diagnostics, context);
			case UML2Package.ADD_VARIABLE_VALUE_ACTION:
				return validateAddVariableValueAction((AddVariableValueAction)value, diagnostics, context);
			case UML2Package.REMOVE_VARIABLE_VALUE_ACTION:
				return validateRemoveVariableValueAction((RemoveVariableValueAction)value, diagnostics, context);
			case UML2Package.APPLY_FUNCTION_ACTION:
				return validateApplyFunctionAction((ApplyFunctionAction)value, diagnostics, context);
			case UML2Package.PRIMITIVE_FUNCTION:
				return validatePrimitiveFunction((PrimitiveFunction)value, diagnostics, context);
			case UML2Package.CALL_ACTION:
				return validateCallAction((CallAction)value, diagnostics, context);
			case UML2Package.INVOCATION_ACTION:
				return validateInvocationAction((InvocationAction)value, diagnostics, context);
			case UML2Package.SEND_SIGNAL_ACTION:
				return validateSendSignalAction((SendSignalAction)value, diagnostics, context);
			case UML2Package.BROADCAST_SIGNAL_ACTION:
				return validateBroadcastSignalAction((BroadcastSignalAction)value, diagnostics, context);
			case UML2Package.SEND_OBJECT_ACTION:
				return validateSendObjectAction((SendObjectAction)value, diagnostics, context);
			case UML2Package.CALL_OPERATION_ACTION:
				return validateCallOperationAction((CallOperationAction)value, diagnostics, context);
			case UML2Package.CALL_BEHAVIOR_ACTION:
				return validateCallBehaviorAction((CallBehaviorAction)value, diagnostics, context);
			case UML2Package.FORK_NODE:
				return validateForkNode((ForkNode)value, diagnostics, context);
			case UML2Package.JOIN_NODE:
				return validateJoinNode((JoinNode)value, diagnostics, context);
			case UML2Package.FLOW_FINAL_NODE:
				return validateFlowFinalNode((FlowFinalNode)value, diagnostics, context);
			case UML2Package.CENTRAL_BUFFER_NODE:
				return validateCentralBufferNode((CentralBufferNode)value, diagnostics, context);
			case UML2Package.ACTIVITY_PARTITION:
				return validateActivityPartition((ActivityPartition)value, diagnostics, context);
			case UML2Package.STATE_MACHINE:
				return validateStateMachine((StateMachine)value, diagnostics, context);
			case UML2Package.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case UML2Package.PSEUDOSTATE:
				return validatePseudostate((Pseudostate)value, diagnostics, context);
			case UML2Package.STATE:
				return validateState((State)value, diagnostics, context);
			case UML2Package.VERTEX:
				return validateVertex((Vertex)value, diagnostics, context);
			case UML2Package.CONNECTION_POINT_REFERENCE:
				return validateConnectionPointReference((ConnectionPointReference)value, diagnostics, context);
			case UML2Package.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case UML2Package.FINAL_STATE:
				return validateFinalState((FinalState)value, diagnostics, context);
			case UML2Package.EXPANSION_NODE:
				return validateExpansionNode((ExpansionNode)value, diagnostics, context);
			case UML2Package.EXPANSION_REGION:
				return validateExpansionRegion((ExpansionRegion)value, diagnostics, context);
			case UML2Package.EXCEPTION_HANDLER:
				return validateExceptionHandler((ExceptionHandler)value, diagnostics, context);
			case UML2Package.DEPLOYMENT:
				return validateDeployment((Deployment)value, diagnostics, context);
			case UML2Package.DEPLOYED_ARTIFACT:
				return validateDeployedArtifact((DeployedArtifact)value, diagnostics, context);
			case UML2Package.DEPLOYMENT_TARGET:
				return validateDeploymentTarget((DeploymentTarget)value, diagnostics, context);
			case UML2Package.NODE:
				return validateNode((Node)value, diagnostics, context);
			case UML2Package.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case UML2Package.EXECUTION_ENVIRONMENT:
				return validateExecutionEnvironment((ExecutionEnvironment)value, diagnostics, context);
			case UML2Package.COMMUNICATION_PATH:
				return validateCommunicationPath((CommunicationPath)value, diagnostics, context);
			case UML2Package.TIME_EXPRESSION:
				return validateTimeExpression((TimeExpression)value, diagnostics, context);
			case UML2Package.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case UML2Package.TIME_OBSERVATION_ACTION:
				return validateTimeObservationAction((TimeObservationAction)value, diagnostics, context);
			case UML2Package.DURATION_INTERVAL:
				return validateDurationInterval((DurationInterval)value, diagnostics, context);
			case UML2Package.INTERVAL:
				return validateInterval((Interval)value, diagnostics, context);
			case UML2Package.TIME_CONSTRAINT:
				return validateTimeConstraint((TimeConstraint)value, diagnostics, context);
			case UML2Package.INTERVAL_CONSTRAINT:
				return validateIntervalConstraint((IntervalConstraint)value, diagnostics, context);
			case UML2Package.TIME_INTERVAL:
				return validateTimeInterval((TimeInterval)value, diagnostics, context);
			case UML2Package.DURATION_OBSERVATION_ACTION:
				return validateDurationObservationAction((DurationObservationAction)value, diagnostics, context);
			case UML2Package.DURATION_CONSTRAINT:
				return validateDurationConstraint((DurationConstraint)value, diagnostics, context);
			case UML2Package.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case UML2Package.DATA_STORE_NODE:
				return validateDataStoreNode((DataStoreNode)value, diagnostics, context);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION:
				return validateInterruptibleActivityRegion((InterruptibleActivityRegion)value, diagnostics, context);
			case UML2Package.PARAMETER_SET:
				return validateParameterSet((ParameterSet)value, diagnostics, context);
			case UML2Package.PROTOCOL_CONFORMANCE:
				return validateProtocolConformance((ProtocolConformance)value, diagnostics, context);
			case UML2Package.PROTOCOL_STATE_MACHINE:
				return validateProtocolStateMachine((ProtocolStateMachine)value, diagnostics, context);
			case UML2Package.PROTOCOL_TRANSITION:
				return validateProtocolTransition((ProtocolTransition)value, diagnostics, context);
			case UML2Package.READ_EXTENT_ACTION:
				return validateReadExtentAction((ReadExtentAction)value, diagnostics, context);
			case UML2Package.RECLASSIFY_OBJECT_ACTION:
				return validateReclassifyObjectAction((ReclassifyObjectAction)value, diagnostics, context);
			case UML2Package.READ_IS_CLASSIFIED_OBJECT_ACTION:
				return validateReadIsClassifiedObjectAction((ReadIsClassifiedObjectAction)value, diagnostics, context);
			case UML2Package.START_OWNED_BEHAVIOR_ACTION:
				return validateStartOwnedBehaviorAction((StartOwnedBehaviorAction)value, diagnostics, context);
			case UML2Package.QUALIFIER_VALUE:
				return validateQualifierValue((QualifierValue)value, diagnostics, context);
			case UML2Package.READ_LINK_OBJECT_END_ACTION:
				return validateReadLinkObjectEndAction((ReadLinkObjectEndAction)value, diagnostics, context);
			case UML2Package.READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				return validateReadLinkObjectEndQualifierAction((ReadLinkObjectEndQualifierAction)value, diagnostics, context);
			case UML2Package.CREATE_LINK_OBJECT_ACTION:
				return validateCreateLinkObjectAction((CreateLinkObjectAction)value, diagnostics, context);
			case UML2Package.ACCEPT_EVENT_ACTION:
				return validateAcceptEventAction((AcceptEventAction)value, diagnostics, context);
			case UML2Package.ACCEPT_CALL_ACTION:
				return validateAcceptCallAction((AcceptCallAction)value, diagnostics, context);
			case UML2Package.REPLY_ACTION:
				return validateReplyAction((ReplyAction)value, diagnostics, context);
			case UML2Package.RAISE_EXCEPTION_ACTION:
				return validateRaiseExceptionAction((RaiseExceptionAction)value, diagnostics, context);
			case UML2Package.DEPLOYMENT_SPECIFICATION:
				return validateDeploymentSpecification((DeploymentSpecification)value, diagnostics, context);
			case UML2Package.VISIBILITY_KIND:
				return validateVisibilityKind((Object)value, diagnostics, context);
			case UML2Package.PARAMETER_DIRECTION_KIND:
				return validateParameterDirectionKind((Object)value, diagnostics, context);
			case UML2Package.AGGREGATION_KIND:
				return validateAggregationKind((Object)value, diagnostics, context);
			case UML2Package.CALL_CONCURRENCY_KIND:
				return validateCallConcurrencyKind((Object)value, diagnostics, context);
			case UML2Package.MESSAGE_KIND:
				return validateMessageKind((Object)value, diagnostics, context);
			case UML2Package.MESSAGE_SORT:
				return validateMessageSort((Object)value, diagnostics, context);
			case UML2Package.INTERACTION_OPERATOR:
				return validateInteractionOperator((Object)value, diagnostics, context);
			case UML2Package.TRANSITION_KIND:
				return validateTransitionKind((Object)value, diagnostics, context);
			case UML2Package.PSEUDOSTATE_KIND:
				return validatePseudostateKind((Object)value, diagnostics, context);
			case UML2Package.EXPANSION_KIND:
				return validateExpansionKind((Object)value, diagnostics, context);
			case UML2Package.CONNECTOR_KIND:
				return validateConnectorKind((Object)value, diagnostics, context);
			case UML2Package.PARAMETER_EFFECT_KIND:
				return validateParameterEffectKind((Object)value, diagnostics, context);
			case UML2Package.OBJECT_NODE_ORDERING_KIND:
				return validateObjectNodeOrderingKind((Object)value, diagnostics, context);
			case UML2Package.INTEGER:
				return validateInteger(((Integer)value).intValue(), diagnostics, context);
			case UML2Package.BOOLEAN:
				return validateBoolean(((Boolean)value).booleanValue(), diagnostics, context);
			case UML2Package.STRING:
				return validateString((String)value, diagnostics, context);
			case UML2Package.UNLIMITED_NATURAL:
				return validateUnlimitedNatural(((Integer)value).intValue(), diagnostics, context);
			case UML2Package.SEQUENCE:
				return validateSequence((List)value, diagnostics, context);
			case UML2Package.SET:
				return validateSet((Set)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(element, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNotOwnSelf constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_validateNotOwnSelf(Element element, DiagnosticChain diagnostics, Map context) {
		return element.validateNotOwnSelf(diagnostics, context);
	}

	/**
	 * Validates the validateHasOwner constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_validateHasOwner(Element element, DiagnosticChain diagnostics, Map context) {
		return element.validateHasOwner(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(multiplicityElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUpperGt0 constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_validateUpperGt0(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		return multiplicityElement.validateUpperGt0(diagnostics, context);
	}

	/**
	 * Validates the validateLowerGe0 constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_validateLowerGe0(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		return multiplicityElement.validateLowerGe0(diagnostics, context);
	}

	/**
	 * Validates the validateUpperGeLower constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_validateUpperGeLower(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		return multiplicityElement.validateUpperGeLower(diagnostics, context);
	}

	/**
	 * Validates the validateLowerEqLowerbound constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_validateLowerEqLowerbound(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		return multiplicityElement.validateLowerEqLowerbound(diagnostics, context);
	}

	/**
	 * Validates the validateUpperEqUpperbound constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_validateUpperEqUpperbound(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map context) {
		return multiplicityElement.validateUpperEqUpperbound(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(org.eclipse.uml2.Class class_, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(class_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateOppositeIsOtherEnd(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateMultiplicityOfComposite(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateSubsettingContext(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateNavigablePropertyRedefinition(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateSubsettingRules(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateNavigableReadonly(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateDerivedUnionIsDerived(property, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOppositeIsOtherEnd constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateOppositeIsOtherEnd(Property property, DiagnosticChain diagnostics, Map context) {
		return property.validateOppositeIsOtherEnd(diagnostics, context);
	}

	/**
	 * Validates the validateMultiplicityOfComposite constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateMultiplicityOfComposite(Property property, DiagnosticChain diagnostics, Map context) {
		return property.validateMultiplicityOfComposite(diagnostics, context);
	}

	/**
	 * Validates the validateSubsettingContext constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateSubsettingContext(Property property, DiagnosticChain diagnostics, Map context) {
		return property.validateSubsettingContext(diagnostics, context);
	}

	/**
	 * Validates the validateNavigablePropertyRedefinition constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateNavigablePropertyRedefinition(Property property, DiagnosticChain diagnostics, Map context) {
		return property.validateNavigablePropertyRedefinition(diagnostics, context);
	}

	/**
	 * Validates the validateSubsettingRules constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateSubsettingRules(Property property, DiagnosticChain diagnostics, Map context) {
		return property.validateSubsettingRules(diagnostics, context);
	}

	/**
	 * Validates the validateNavigableReadonly constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateNavigableReadonly(Property property, DiagnosticChain diagnostics, Map context) {
		return property.validateNavigableReadonly(diagnostics, context);
	}

	/**
	 * Validates the validateDerivedUnionIsDerived constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateDerivedUnionIsDerived(Property property, DiagnosticChain diagnostics, Map context) {
		return property.validateDerivedUnionIsDerived(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateTypeOfResult(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateOnlyBodyForQuery(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeOfResult constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_validateTypeOfResult(Operation operation, DiagnosticChain diagnostics, Map context) {
		return operation.validateTypeOfResult(diagnostics, context);
	}

	/**
	 * Validates the validateOnlyBodyForQuery constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_validateOnlyBodyForQuery(Operation operation, DiagnosticChain diagnostics, Map context) {
		return operation.validateOnlyBodyForQuery(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(typedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(parameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNoName constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validateNoName(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		return namedElement.validateNoName(diagnostics, context);
	}

	/**
	 * Validates the validateQualifiedName constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validateQualifiedName(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		return namedElement.validateQualifiedName(diagnostics, context);
	}

	/**
	 * Validates the validateVisibilityNeedsOwnership constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validateVisibilityNeedsOwnership(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		return namedElement.validateVisibilityNeedsOwnership(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(org.eclipse.uml2.Package package_, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_validateElementsPublicOrPrivate(package_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateElementsPublicOrPrivate constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_validateElementsPublicOrPrivate(org.eclipse.uml2.Package package_, DiagnosticChain diagnostics, Map context) {
		return package_.validateElementsPublicOrPrivate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_validateSlotsAreDefined(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_validateNoDuplicateSlots(enumerationLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(primitiveType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(comment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedRelationship(DirectedRelationship directedRelationship, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(directedRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(relationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(opaqueExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(valueSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(expression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace(Namespace namespace, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(namespace, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMembersAreDistinguishable constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace_validateMembersAreDistinguishable(Namespace namespace, DiagnosticChain diagnostics, Map context) {
		return namespace.validateMembersAreDistinguishable(diagnostics, context);
	}

	/**
	 * Validates the validateImportedMemberDerived constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace_validateImportedMemberDerived(Namespace namespace, DiagnosticChain diagnostics, Map context) {
		return namespace.validateImportedMemberDerived(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(classifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNoCyclesInGeneralization constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_validateNoCyclesInGeneralization(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		return classifier.validateNoCyclesInGeneralization(diagnostics, context);
	}

	/**
	 * Validates the validateSpecializeType constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_validateSpecializeType(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		return classifier.validateSpecializeType(diagnostics, context);
	}

	/**
	 * Validates the validateInheritedMember constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_validateInheritedMember(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		return classifier.validateInheritedMember(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralEqualsParents constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_validateGeneralEqualsParents(Classifier classifier, DiagnosticChain diagnostics, Map context) {
		return classifier.validateGeneralEqualsParents(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralBoolean(LiteralBoolean literalBoolean, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(literalBoolean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralSpecification(LiteralSpecification literalSpecification, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(literalSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralString(LiteralString literalString, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(literalString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralNull(LiteralNull literalNull, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(literalNull, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralInteger(LiteralInteger literalInteger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(literalInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralUnlimitedNatural(LiteralUnlimitedNatural literalUnlimitedNatural, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(literalUnlimitedNatural, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_validateNotApplyToSelf(constraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNotApplyToSelf constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_validateNotApplyToSelf(Constraint constraint, DiagnosticChain diagnostics, Map context) {
		return constraint.validateNotApplyToSelf(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioralFeature(BehavioralFeature behavioralFeature, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(behavioralFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(StructuralFeature structuralFeature, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(structuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization(Generalization generalization, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(generalization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(redefinableElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateRedefinitionContextValid constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_validateRedefinitionContextValid(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map context) {
		return redefinableElement.validateRedefinitionContextValid(diagnostics, context);
	}

	/**
	 * Validates the validateRedefinitionConsistent constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_validateRedefinitionConsistent(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map context) {
		return redefinableElement.validateRedefinitionConsistent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_validateSlotsAreDefined(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_validateNoDuplicateSlots(instanceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSlotsAreDefined constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_validateSlotsAreDefined(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map context) {
		return instanceSpecification.validateSlotsAreDefined(diagnostics, context);
	}

	/**
	 * Validates the validateNoDuplicateSlots constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_validateNoDuplicateSlots(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map context) {
		return instanceSpecification.validateNoDuplicateSlots(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(slot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceValue(InstanceValue instanceValue, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(instanceValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageableElement(PackageableElement packageableElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(packageableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport(ElementImport elementImport, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementImport_validateVisibilityPublicOrPrivate(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementImport_validateImportedElementIsPublic(elementImport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVisibilityPublicOrPrivate constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport_validateVisibilityPublicOrPrivate(ElementImport elementImport, DiagnosticChain diagnostics, Map context) {
		return elementImport.validateVisibilityPublicOrPrivate(diagnostics, context);
	}

	/**
	 * Validates the validateImportedElementIsPublic constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport_validateImportedElementIsPublic(ElementImport elementImport, DiagnosticChain diagnostics, Map context) {
		return elementImport.validateImportedElementIsPublic(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageImport(PackageImport packageImport, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageImport_validatePublicOrPrivate(packageImport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePublicOrPrivate constraint of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageImport_validatePublicOrPrivate(PackageImport packageImport, DiagnosticChain diagnostics, Map context) {
		return packageImport.validatePublicOrPrivate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(association, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageMerge(PackageMerge packageMerge, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(packageMerge, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype(Stereotype stereotype, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(stereotype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile(Profile profile, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_validateElementsPublicOrPrivate(profile, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileApplication(ProfileApplication profileApplication, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageImport_validatePublicOrPrivate(profileApplication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(extension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionEnd(ExtensionEnd extensionEnd, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateOppositeIsOtherEnd(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateMultiplicityOfComposite(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateSubsettingContext(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateNavigablePropertyRedefinition(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateSubsettingRules(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateNavigableReadonly(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateDerivedUnionIsDerived(extensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass(AssociationClass associationClass, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(associationClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermission(Permission permission, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(permission, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(dependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsage(Usage usage, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(usage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstraction(Abstraction abstraction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(abstraction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization(Realization realization, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(realization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitution(Substitution substitution, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(substitution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem(InformationItem informationItem, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(informationItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow(InformationFlow informationFlow, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(informationFlow, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(model, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_validateElementsPublicOrPrivate(model, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(generalizationSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(behavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioredClassifier(BehavioredClassifier behavioredClassifier, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(behavioredClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(activity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(actor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtend(Extend extend, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(extend, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase(UseCase useCase, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(useCase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionPoint(ExtensionPoint extensionPoint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(extensionPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInclude(Include include, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(include, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(activityEdge, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(activityGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityNode(ActivityNode activityNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(activityNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(action, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode(ObjectNode objectNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(objectNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlNode(ControlNode controlNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(controlNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlFlow(ControlFlow controlFlow, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(controlFlow, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(objectFlow, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode(InitialNode initialNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(initialNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalNode(FinalNode finalNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(finalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityFinalNode(ActivityFinalNode activityFinalNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(activityFinalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode(DecisionNode decisionNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(decisionNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeNode(MergeNode mergeNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(mergeNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableNode(ExecutableNode executableNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(executableNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin(OutputPin outputPin, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(outputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(InputPin inputPin, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(inputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(pin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(activityParameterNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePin(ValuePin valuePin, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(valuePin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact(Artifact artifact, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(artifact, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManifestation(Manifestation manifestation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(manifestation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(connectorEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectableElement(ConnectableElement connectableElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(connectableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(connector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredClassifier(StructuredClassifier structuredClassifier, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(structuredClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(interface_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementation(Implementation implementation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(implementation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(implementation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(interaction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionFragment(InteractionFragment interactionFragment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(interactionFragment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(lifeline, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(message, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralOrdering(GeneralOrdering generalOrdering, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(generalOrdering, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEnd(MessageEnd messageEnd, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(messageEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventOccurrence(EventOccurrence eventOccurrence, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(eventOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(eventOccurrence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionOccurrence(ExecutionOccurrence executionOccurrence, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(executionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(executionOccurrence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateInvariant(StateInvariant stateInvariant, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(stateInvariant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStop(Stop stop, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(stop, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationOccurrence(CollaborationOccurrence collaborationOccurrence, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(collaborationOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(collaborationOccurrence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaboration(Collaboration collaboration, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(collaboration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateSignature(TemplateSignature templateSignature, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(templateSignature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameter(TemplateParameter templateParameter, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(templateParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateableElement(TemplateableElement templateableElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(templateableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression(StringExpression stringExpression, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(stringExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterableElement(ParameterableElement parameterableElement, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(parameterableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding(TemplateBinding templateBinding, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(templateBinding, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameterSubstitution(TemplateParameterSubstitution templateParameterSubstitution, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(templateParameterSubstitution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTemplateParameter(OperationTemplateParameter operationTemplateParameter, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(operationTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(classifierTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterableClassifier(ParameterableClassifier parameterableClassifier, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(parameterableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(parameterableClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableTemplateSignature(RedefinableTemplateSignature redefinableTemplateSignature, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(redefinableTemplateSignature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateableClassifier(TemplateableClassifier templateableClassifier, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(templateableClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(templateableClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectableElementTemplateParameter(ConnectableElementTemplateParameter connectableElementTemplateParameter, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(connectableElementTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGt0(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerGe0(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperGeLower(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateLowerEqLowerbound(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_validateUpperEqUpperbound(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateOppositeIsOtherEnd(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateMultiplicityOfComposite(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateSubsettingContext(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateNavigablePropertyRedefinition(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateSubsettingRules(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateNavigableReadonly(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateDerivedUnionIsDerived(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulatedClassifier(EncapsulatedClassifier encapsulatedClassifier, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(encapsulatedClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(variable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(structuredActivityNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(conditionalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause(Clause clause, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(clause, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode(LoopNode loopNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(loopNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallTrigger(CallTrigger callTrigger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(callTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(callTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTrigger(MessageTrigger messageTrigger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(messageTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(messageTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeTrigger(ChangeTrigger changeTrigger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(changeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(changeTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(trigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReception(Reception reception, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(reception, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal(Signal signal, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(signal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalTrigger(SignalTrigger signalTrigger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(signalTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(signalTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeTrigger(TimeTrigger timeTrigger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(timeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(timeTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyTrigger(AnyTrigger anyTrigger, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(anyTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(anyTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionNode(ExpansionNode expansionNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(expansionNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionRegion(ExpansionRegion expansionRegion, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(expansionRegion, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(exceptionHandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(stateMachine, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(region, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate(Pseudostate pseudostate, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(pseudostate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(state, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertex(Vertex vertex, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(vertex, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(connectionPointReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(transition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState(FinalState finalState, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(finalState, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkNode(ForkNode forkNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(forkNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinNode(JoinNode joinNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(joinNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowFinalNode(FlowFinalNode flowFinalNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(flowFinalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentralBufferNode(CentralBufferNode centralBufferNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(centralBufferNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(activityPartition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOccurrence(InteractionOccurrence interactionOccurrence, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(interactionOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(interactionOccurrence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(gate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(partDecomposition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(interactionOperand, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_validateNotApplyToSelf(interactionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(combinedFragment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation(Continuation continuation, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(continuation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(createObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyObjectAction(DestroyObjectAction destroyObjectAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(destroyObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(testIdentityAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readSelfAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(structuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadStructuralFeatureAction(ReadStructuralFeatureAction readStructuralFeatureAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(writeStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearStructuralFeatureAction(ClearStructuralFeatureAction clearStructuralFeatureAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(clearStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(removeStructuralFeatureValueAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddStructuralFeatureValueAction(AddStructuralFeatureValueAction addStructuralFeatureValueAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(addStructuralFeatureValueAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction(LinkAction linkAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(linkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData(LinkEndData linkEndData, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(linkEndData, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndCreationData(LinkEndCreationData linkEndCreationData, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(linkEndCreationData, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkAction(CreateLinkAction createLinkAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(createLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteLinkAction(WriteLinkAction writeLinkAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(writeLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyLinkAction(DestroyLinkAction destroyLinkAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(destroyLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearAssociationAction(ClearAssociationAction clearAssociationAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(clearAssociationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAction(VariableAction variableAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(variableAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadVariableAction(ReadVariableAction readVariableAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteVariableAction(WriteVariableAction writeVariableAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(writeVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearVariableAction(ClearVariableAction clearVariableAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(clearVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddVariableValueAction(AddVariableValueAction addVariableValueAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(addVariableValueAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveVariableValueAction(RemoveVariableValueAction removeVariableValueAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(removeVariableValueAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyFunctionAction(ApplyFunctionAction applyFunctionAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(applyFunctionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(applyFunctionAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveFunction(PrimitiveFunction primitiveFunction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(primitiveFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(primitiveFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(primitiveFunction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction(CallAction callAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(callAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationAction(InvocationAction invocationAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(invocationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(sendSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(broadcastSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendObjectAction(SendObjectAction sendObjectAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(sendObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(callOperationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallBehaviorAction(CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(callBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStoreNode(DataStoreNode dataStoreNode, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(dataStoreNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptibleActivityRegion(InterruptibleActivityRegion interruptibleActivityRegion, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interruptibleActivityRegion, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet(ParameterSet parameterSet, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(parameterSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment(Deployment deployment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(deployment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedArtifact(DeployedArtifact deployedArtifact, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(deployedArtifact, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DeploymentTarget deploymentTarget, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(deploymentTarget, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(node, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(device, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionEnvironment(ExecutionEnvironment executionEnvironment, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(executionEnvironment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPath(CommunicationPath communicationPath, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(communicationPath, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadExtentAction(ReadExtentAction readExtentAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readExtentAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(reclassifyObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readIsClassifiedObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartOwnedBehaviorAction(StartOwnedBehaviorAction startOwnedBehaviorAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(startOwnedBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(startOwnedBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(qualifierValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readLinkObjectEndAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(readLinkObjectEndQualifierAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(createLinkObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(acceptEventAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(acceptCallAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyAction(ReplyAction replyAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(replyAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaiseExceptionAction(RaiseExceptionAction raiseExceptionAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(raiseExceptionAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeExpression(TimeExpression timeExpression, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(timeExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(duration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeObservationAction(TimeObservationAction timeObservationAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(timeObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(timeObservationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInterval(DurationInterval durationInterval, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(durationInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval(Interval interval, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(interval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConstraint(TimeConstraint timeConstraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_validateNotApplyToSelf(timeConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntervalConstraint(IntervalConstraint intervalConstraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_validateNotApplyToSelf(intervalConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval(TimeInterval timeInterval, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(timeInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationObservationAction(DurationObservationAction durationObservationAction, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(durationObservationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(durationObservationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationConstraint(DurationConstraint durationConstraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_validateNotApplyToSelf(durationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(component, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolConformance(ProtocolConformance protocolConformance, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(protocolConformance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(protocolStateMachine, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(protocolTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentSpecification(DeploymentSpecification deploymentSpecification, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateNotOwnSelf(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validateHasOwner(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateNoName(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateQualifiedName(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validateVisibilityNeedsOwnership(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateMembersAreDistinguishable(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_validateImportedMemberDerived(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionContextValid(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_validateRedefinitionConsistent(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateNoCyclesInGeneralization(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateSpecializeType(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateInheritedMember(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_validateGeneralEqualsParents(deploymentSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityKind(Object visibilityKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDirectionKind(Object parameterDirectionKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationKind(Object aggregationKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageKind(Object messageKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSort(Object messageSort, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallConcurrencyKind(Object callConcurrencyKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionKind(Object expansionKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionKind(Object transitionKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostateKind(Object pseudostateKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperator(Object interactionOperator, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterEffectKind(Object parameterEffectKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNodeOrderingKind(Object objectNodeOrderingKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorKind(Object connectorKind, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(int integer, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedNatural(int unlimitedNatural, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(List sequence, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSet(Set set, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //UML2Validator
