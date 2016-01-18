/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 327039, 351774, 397324, 418466, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.AddVariableValueAction;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ClearAssociationAction;
import org.eclipse.uml2.uml.ClearStructuralFeatureAction;
import org.eclipse.uml2.uml.ClearVariableAction;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.CommunicationPath;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Continuation;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.CreateLinkObjectAction;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.DestructionOccurrenceSpecification;
import org.eclipse.uml2.uml.Device;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.DurationInterval;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutionEnvironment;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExpansionKind;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.InformationItem;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.IntervalConstraint;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralReal;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationTemplateParameter;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.RaiseExceptionAction;
import org.eclipse.uml2.uml.ReadExtentAction;
import org.eclipse.uml2.uml.ReadIsClassifiedObjectAction;
import org.eclipse.uml2.uml.ReadLinkAction;
import org.eclipse.uml2.uml.ReadLinkObjectEndAction;
import org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction;
import org.eclipse.uml2.uml.ReadSelfAction;
import org.eclipse.uml2.uml.ReadStructuralFeatureAction;
import org.eclipse.uml2.uml.ReadVariableAction;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.ReclassifyObjectAction;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.ReduceAction;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.uml.RemoveVariableValueAction;
import org.eclipse.uml2.uml.ReplyAction;
import org.eclipse.uml2.uml.SendObjectAction;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StartClassifierBehaviorAction;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TestIdentityAction;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UnmarshallAction;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecificationAction;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLFactoryImpl
		extends EFactoryImpl
		implements UMLFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLFactory init() {
		try {
			UMLFactory theUMLFactory = (UMLFactory) EPackage.Registry.INSTANCE
				.getEFactory(UMLPackage.eNS_URI);
			if (theUMLFactory != null) {
				return theUMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLFactoryImpl() {
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
			case UMLPackage.ACTIVITY :
				return createActivity();
			case UMLPackage.CLASS :
				return createClass();
			case UMLPackage.COMMENT :
				return createComment();
			case UMLPackage.STEREOTYPE :
				return createStereotype();
			case UMLPackage.IMAGE :
				return createImage();
			case UMLPackage.PROFILE :
				return createProfile();
			case UMLPackage.PACKAGE :
				return createPackage();
			case UMLPackage.TEMPLATE_PARAMETER :
				return createTemplateParameter();
			case UMLPackage.TEMPLATE_SIGNATURE :
				return createTemplateSignature();
			case UMLPackage.TEMPLATE_BINDING :
				return createTemplateBinding();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION :
				return createTemplateParameterSubstitution();
			case UMLPackage.ASSOCIATION :
				return createAssociation();
			case UMLPackage.PROPERTY :
				return createProperty();
			case UMLPackage.CONNECTOR_END :
				return createConnectorEnd();
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER :
				return createConnectableElementTemplateParameter();
			case UMLPackage.DEPLOYMENT :
				return createDeployment();
			case UMLPackage.DEPENDENCY :
				return createDependency();
			case UMLPackage.DEPLOYMENT_SPECIFICATION :
				return createDeploymentSpecification();
			case UMLPackage.ARTIFACT :
				return createArtifact();
			case UMLPackage.MANIFESTATION :
				return createManifestation();
			case UMLPackage.ABSTRACTION :
				return createAbstraction();
			case UMLPackage.OPAQUE_EXPRESSION :
				return createOpaqueExpression();
			case UMLPackage.PARAMETER :
				return createParameter();
			case UMLPackage.OPERATION :
				return createOperation();
			case UMLPackage.PARAMETER_SET :
				return createParameterSet();
			case UMLPackage.CONSTRAINT :
				return createConstraint();
			case UMLPackage.DATA_TYPE :
				return createDataType();
			case UMLPackage.INTERFACE :
				return createInterface();
			case UMLPackage.RECEPTION :
				return createReception();
			case UMLPackage.SIGNAL :
				return createSignal();
			case UMLPackage.PROTOCOL_STATE_MACHINE :
				return createProtocolStateMachine();
			case UMLPackage.STATE_MACHINE :
				return createStateMachine();
			case UMLPackage.PSEUDOSTATE :
				return createPseudostate();
			case UMLPackage.REGION :
				return createRegion();
			case UMLPackage.STATE :
				return createState();
			case UMLPackage.CONNECTION_POINT_REFERENCE :
				return createConnectionPointReference();
			case UMLPackage.TRIGGER :
				return createTrigger();
			case UMLPackage.PORT :
				return createPort();
			case UMLPackage.TRANSITION :
				return createTransition();
			case UMLPackage.PROTOCOL_CONFORMANCE :
				return createProtocolConformance();
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER :
				return createOperationTemplateParameter();
			case UMLPackage.PACKAGE_MERGE :
				return createPackageMerge();
			case UMLPackage.PROFILE_APPLICATION :
				return createProfileApplication();
			case UMLPackage.ENUMERATION :
				return createEnumeration();
			case UMLPackage.ENUMERATION_LITERAL :
				return createEnumerationLiteral();
			case UMLPackage.INSTANCE_SPECIFICATION :
				return createInstanceSpecification();
			case UMLPackage.SLOT :
				return createSlot();
			case UMLPackage.PRIMITIVE_TYPE :
				return createPrimitiveType();
			case UMLPackage.ELEMENT_IMPORT :
				return createElementImport();
			case UMLPackage.PACKAGE_IMPORT :
				return createPackageImport();
			case UMLPackage.EXTENSION :
				return createExtension();
			case UMLPackage.EXTENSION_END :
				return createExtensionEnd();
			case UMLPackage.MODEL :
				return createModel();
			case UMLPackage.STRING_EXPRESSION :
				return createStringExpression();
			case UMLPackage.EXPRESSION :
				return createExpression();
			case UMLPackage.USAGE :
				return createUsage();
			case UMLPackage.COLLABORATION_USE :
				return createCollaborationUse();
			case UMLPackage.COLLABORATION :
				return createCollaboration();
			case UMLPackage.CONNECTOR :
				return createConnector();
			case UMLPackage.GENERALIZATION :
				return createGeneralization();
			case UMLPackage.GENERALIZATION_SET :
				return createGeneralizationSet();
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE :
				return createRedefinableTemplateSignature();
			case UMLPackage.USE_CASE :
				return createUseCase();
			case UMLPackage.EXTEND :
				return createExtend();
			case UMLPackage.EXTENSION_POINT :
				return createExtensionPoint();
			case UMLPackage.INCLUDE :
				return createInclude();
			case UMLPackage.SUBSTITUTION :
				return createSubstitution();
			case UMLPackage.REALIZATION :
				return createRealization();
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER :
				return createClassifierTemplateParameter();
			case UMLPackage.INTERFACE_REALIZATION :
				return createInterfaceRealization();
			case UMLPackage.ACTIVITY_PARTITION :
				return createActivityPartition();
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION :
				return createInterruptibleActivityRegion();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE :
				return createStructuredActivityNode();
			case UMLPackage.EXCEPTION_HANDLER :
				return createExceptionHandler();
			case UMLPackage.INPUT_PIN :
				return createInputPin();
			case UMLPackage.OUTPUT_PIN :
				return createOutputPin();
			case UMLPackage.VARIABLE :
				return createVariable();
			case UMLPackage.VALUE_SPECIFICATION_ACTION :
				return createValueSpecificationAction();
			case UMLPackage.LINK_END_DATA :
				return createLinkEndData();
			case UMLPackage.QUALIFIER_VALUE :
				return createQualifierValue();
			case UMLPackage.ACCEPT_CALL_ACTION :
				return createAcceptCallAction();
			case UMLPackage.ACCEPT_EVENT_ACTION :
				return createAcceptEventAction();
			case UMLPackage.ACTION_INPUT_PIN :
				return createActionInputPin();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION :
				return createAddStructuralFeatureValueAction();
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION :
				return createAddVariableValueAction();
			case UMLPackage.BROADCAST_SIGNAL_ACTION :
				return createBroadcastSignalAction();
			case UMLPackage.CALL_BEHAVIOR_ACTION :
				return createCallBehaviorAction();
			case UMLPackage.CALL_OPERATION_ACTION :
				return createCallOperationAction();
			case UMLPackage.CLAUSE :
				return createClause();
			case UMLPackage.CLEAR_ASSOCIATION_ACTION :
				return createClearAssociationAction();
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION :
				return createClearStructuralFeatureAction();
			case UMLPackage.CLEAR_VARIABLE_ACTION :
				return createClearVariableAction();
			case UMLPackage.CONDITIONAL_NODE :
				return createConditionalNode();
			case UMLPackage.CREATE_LINK_ACTION :
				return createCreateLinkAction();
			case UMLPackage.LINK_END_CREATION_DATA :
				return createLinkEndCreationData();
			case UMLPackage.CREATE_LINK_OBJECT_ACTION :
				return createCreateLinkObjectAction();
			case UMLPackage.CREATE_OBJECT_ACTION :
				return createCreateObjectAction();
			case UMLPackage.DESTROY_LINK_ACTION :
				return createDestroyLinkAction();
			case UMLPackage.LINK_END_DESTRUCTION_DATA :
				return createLinkEndDestructionData();
			case UMLPackage.DESTROY_OBJECT_ACTION :
				return createDestroyObjectAction();
			case UMLPackage.EXPANSION_NODE :
				return createExpansionNode();
			case UMLPackage.EXPANSION_REGION :
				return createExpansionRegion();
			case UMLPackage.LOOP_NODE :
				return createLoopNode();
			case UMLPackage.OPAQUE_ACTION :
				return createOpaqueAction();
			case UMLPackage.RAISE_EXCEPTION_ACTION :
				return createRaiseExceptionAction();
			case UMLPackage.READ_EXTENT_ACTION :
				return createReadExtentAction();
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION :
				return createReadIsClassifiedObjectAction();
			case UMLPackage.READ_LINK_ACTION :
				return createReadLinkAction();
			case UMLPackage.READ_LINK_OBJECT_END_ACTION :
				return createReadLinkObjectEndAction();
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION :
				return createReadLinkObjectEndQualifierAction();
			case UMLPackage.READ_SELF_ACTION :
				return createReadSelfAction();
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION :
				return createReadStructuralFeatureAction();
			case UMLPackage.READ_VARIABLE_ACTION :
				return createReadVariableAction();
			case UMLPackage.RECLASSIFY_OBJECT_ACTION :
				return createReclassifyObjectAction();
			case UMLPackage.REDUCE_ACTION :
				return createReduceAction();
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION :
				return createRemoveStructuralFeatureValueAction();
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION :
				return createRemoveVariableValueAction();
			case UMLPackage.REPLY_ACTION :
				return createReplyAction();
			case UMLPackage.SEND_OBJECT_ACTION :
				return createSendObjectAction();
			case UMLPackage.SEND_SIGNAL_ACTION :
				return createSendSignalAction();
			case UMLPackage.SEQUENCE_NODE :
				return createSequenceNode();
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION :
				return createStartClassifierBehaviorAction();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION :
				return createStartObjectBehaviorAction();
			case UMLPackage.TEST_IDENTITY_ACTION :
				return createTestIdentityAction();
			case UMLPackage.UNMARSHALL_ACTION :
				return createUnmarshallAction();
			case UMLPackage.VALUE_PIN :
				return createValuePin();
			case UMLPackage.ACTIVITY_FINAL_NODE :
				return createActivityFinalNode();
			case UMLPackage.ACTIVITY_PARAMETER_NODE :
				return createActivityParameterNode();
			case UMLPackage.CENTRAL_BUFFER_NODE :
				return createCentralBufferNode();
			case UMLPackage.CONTROL_FLOW :
				return createControlFlow();
			case UMLPackage.DATA_STORE_NODE :
				return createDataStoreNode();
			case UMLPackage.DECISION_NODE :
				return createDecisionNode();
			case UMLPackage.OBJECT_FLOW :
				return createObjectFlow();
			case UMLPackage.FLOW_FINAL_NODE :
				return createFlowFinalNode();
			case UMLPackage.FORK_NODE :
				return createForkNode();
			case UMLPackage.INITIAL_NODE :
				return createInitialNode();
			case UMLPackage.JOIN_NODE :
				return createJoinNode();
			case UMLPackage.MERGE_NODE :
				return createMergeNode();
			case UMLPackage.INSTANCE_VALUE :
				return createInstanceValue();
			case UMLPackage.ANY_RECEIVE_EVENT :
				return createAnyReceiveEvent();
			case UMLPackage.CALL_EVENT :
				return createCallEvent();
			case UMLPackage.CHANGE_EVENT :
				return createChangeEvent();
			case UMLPackage.FUNCTION_BEHAVIOR :
				return createFunctionBehavior();
			case UMLPackage.OPAQUE_BEHAVIOR :
				return createOpaqueBehavior();
			case UMLPackage.SIGNAL_EVENT :
				return createSignalEvent();
			case UMLPackage.TIME_EVENT :
				return createTimeEvent();
			case UMLPackage.TIME_EXPRESSION :
				return createTimeExpression();
			case UMLPackage.COMMUNICATION_PATH :
				return createCommunicationPath();
			case UMLPackage.DEVICE :
				return createDevice();
			case UMLPackage.NODE :
				return createNode();
			case UMLPackage.EXECUTION_ENVIRONMENT :
				return createExecutionEnvironment();
			case UMLPackage.INFORMATION_FLOW :
				return createInformationFlow();
			case UMLPackage.MESSAGE :
				return createMessage();
			case UMLPackage.INTERACTION :
				return createInteraction();
			case UMLPackage.LIFELINE :
				return createLifeline();
			case UMLPackage.PART_DECOMPOSITION :
				return createPartDecomposition();
			case UMLPackage.INTERACTION_USE :
				return createInteractionUse();
			case UMLPackage.GATE :
				return createGate();
			case UMLPackage.INTERACTION_OPERAND :
				return createInteractionOperand();
			case UMLPackage.INTERACTION_CONSTRAINT :
				return createInteractionConstraint();
			case UMLPackage.GENERAL_ORDERING :
				return createGeneralOrdering();
			case UMLPackage.OCCURRENCE_SPECIFICATION :
				return createOccurrenceSpecification();
			case UMLPackage.INFORMATION_ITEM :
				return createInformationItem();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION :
				return createActionExecutionSpecification();
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION :
				return createBehaviorExecutionSpecification();
			case UMLPackage.COMBINED_FRAGMENT :
				return createCombinedFragment();
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT :
				return createConsiderIgnoreFragment();
			case UMLPackage.CONTINUATION :
				return createContinuation();
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION :
				return createDestructionOccurrenceSpecification();
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION :
				return createMessageOccurrenceSpecification();
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION :
				return createExecutionOccurrenceSpecification();
			case UMLPackage.STATE_INVARIANT :
				return createStateInvariant();
			case UMLPackage.FINAL_STATE :
				return createFinalState();
			case UMLPackage.PROTOCOL_TRANSITION :
				return createProtocolTransition();
			case UMLPackage.ASSOCIATION_CLASS :
				return createAssociationClass();
			case UMLPackage.COMPONENT :
				return createComponent();
			case UMLPackage.COMPONENT_REALIZATION :
				return createComponentRealization();
			case UMLPackage.ACTOR :
				return createActor();
			case UMLPackage.DURATION :
				return createDuration();
			case UMLPackage.DURATION_CONSTRAINT :
				return createDurationConstraint();
			case UMLPackage.INTERVAL_CONSTRAINT :
				return createIntervalConstraint();
			case UMLPackage.INTERVAL :
				return createInterval();
			case UMLPackage.DURATION_INTERVAL :
				return createDurationInterval();
			case UMLPackage.DURATION_OBSERVATION :
				return createDurationObservation();
			case UMLPackage.LITERAL_BOOLEAN :
				return createLiteralBoolean();
			case UMLPackage.LITERAL_INTEGER :
				return createLiteralInteger();
			case UMLPackage.LITERAL_NULL :
				return createLiteralNull();
			case UMLPackage.LITERAL_REAL :
				return createLiteralReal();
			case UMLPackage.LITERAL_STRING :
				return createLiteralString();
			case UMLPackage.LITERAL_UNLIMITED_NATURAL :
				return createLiteralUnlimitedNatural();
			case UMLPackage.TIME_CONSTRAINT :
				return createTimeConstraint();
			case UMLPackage.TIME_INTERVAL :
				return createTimeInterval();
			case UMLPackage.TIME_OBSERVATION :
				return createTimeObservation();
			default :
				throw new IllegalArgumentException("The class '" //$NON-NLS-1$
					+ eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UMLPackage.VISIBILITY_KIND :
				return createVisibilityKindFromString(eDataType, initialValue);
			case UMLPackage.PARAMETER_DIRECTION_KIND :
				return createParameterDirectionKindFromString(eDataType,
					initialValue);
			case UMLPackage.PARAMETER_EFFECT_KIND :
				return createParameterEffectKindFromString(eDataType,
					initialValue);
			case UMLPackage.CALL_CONCURRENCY_KIND :
				return createCallConcurrencyKindFromString(eDataType,
					initialValue);
			case UMLPackage.TRANSITION_KIND :
				return createTransitionKindFromString(eDataType, initialValue);
			case UMLPackage.PSEUDOSTATE_KIND :
				return createPseudostateKindFromString(eDataType, initialValue);
			case UMLPackage.AGGREGATION_KIND :
				return createAggregationKindFromString(eDataType, initialValue);
			case UMLPackage.CONNECTOR_KIND :
				return createConnectorKindFromString(eDataType, initialValue);
			case UMLPackage.OBJECT_NODE_ORDERING_KIND :
				return createObjectNodeOrderingKindFromString(eDataType,
					initialValue);
			case UMLPackage.EXPANSION_KIND :
				return createExpansionKindFromString(eDataType, initialValue);
			case UMLPackage.MESSAGE_KIND :
				return createMessageKindFromString(eDataType, initialValue);
			case UMLPackage.MESSAGE_SORT :
				return createMessageSortFromString(eDataType, initialValue);
			case UMLPackage.INTERACTION_OPERATOR_KIND :
				return createInteractionOperatorKindFromString(eDataType,
					initialValue);
			default :
				throw new IllegalArgumentException("The datatype '" //$NON-NLS-1$
					+ eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UMLPackage.VISIBILITY_KIND :
				return convertVisibilityKindToString(eDataType, instanceValue);
			case UMLPackage.PARAMETER_DIRECTION_KIND :
				return convertParameterDirectionKindToString(eDataType,
					instanceValue);
			case UMLPackage.PARAMETER_EFFECT_KIND :
				return convertParameterEffectKindToString(eDataType,
					instanceValue);
			case UMLPackage.CALL_CONCURRENCY_KIND :
				return convertCallConcurrencyKindToString(eDataType,
					instanceValue);
			case UMLPackage.TRANSITION_KIND :
				return convertTransitionKindToString(eDataType, instanceValue);
			case UMLPackage.PSEUDOSTATE_KIND :
				return convertPseudostateKindToString(eDataType, instanceValue);
			case UMLPackage.AGGREGATION_KIND :
				return convertAggregationKindToString(eDataType, instanceValue);
			case UMLPackage.CONNECTOR_KIND :
				return convertConnectorKindToString(eDataType, instanceValue);
			case UMLPackage.OBJECT_NODE_ORDERING_KIND :
				return convertObjectNodeOrderingKindToString(eDataType,
					instanceValue);
			case UMLPackage.EXPANSION_KIND :
				return convertExpansionKindToString(eDataType, instanceValue);
			case UMLPackage.MESSAGE_KIND :
				return convertMessageKindToString(eDataType, instanceValue);
			case UMLPackage.MESSAGE_SORT :
				return convertMessageSortToString(eDataType, instanceValue);
			case UMLPackage.INTERACTION_OPERATOR_KIND :
				return convertInteractionOperatorKindToString(eDataType,
					instanceValue);
			default :
				throw new IllegalArgumentException("The datatype '" //$NON-NLS-1$
					+ eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createTemplateSignature() {
		TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBindingImpl templateBinding = new TemplateBindingImpl();
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createTemplateParameterSubstitution() {
		TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
		return templateParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport() {
		ElementImportImpl elementImport = new ElementImportImpl();
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport() {
		PackageImportImpl packageImport = new PackageImportImpl();
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge() {
		PackageMergeImpl packageMerge = new PackageMergeImpl();
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication createProfileApplication() {
		ProfileApplicationImpl profileApplication = new ProfileApplicationImpl();
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend() {
		ExtendImpl extend = new ExtendImpl();
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint() {
		ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution() {
		SubstitutionImpl substitution = new SubstitutionImpl();
		return substitution;
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
	public Abstraction createAbstraction() {
		AbstractionImpl abstraction = new AbstractionImpl();
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createConnectorEnd() {
		ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createDeploymentSpecification() {
		DeploymentSpecificationImpl deploymentSpecification = new DeploymentSpecificationImpl();
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation createManifestation() {
		ManifestationImpl manifestation = new ManifestationImpl();
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createParameterSet() {
		ParameterSetImpl parameterSet = new ParameterSetImpl();
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createReception() {
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine createProtocolStateMachine() {
		ProtocolStateMachineImpl protocolStateMachine = new ProtocolStateMachineImpl();
		return protocolStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference createConnectionPointReference() {
		ConnectionPointReferenceImpl connectionPointReference = new ConnectionPointReferenceImpl();
		return connectionPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createPseudostate() {
		PseudostateImpl pseudostate = new PseudostateImpl();
		return pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance createProtocolConformance() {
		ProtocolConformanceImpl protocolConformance = new ProtocolConformanceImpl();
		return protocolConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTemplateParameter createOperationTemplateParameter() {
		OperationTemplateParameterImpl operationTemplateParameter = new OperationTemplateParameterImpl();
		return operationTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementTemplateParameter createConnectableElementTemplateParameter() {
		ConnectableElementTemplateParameterImpl connectableElementTemplateParameter = new ConnectableElementTemplateParameterImpl();
		return connectableElementTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createCollaborationUse() {
		CollaborationUseImpl collaborationUse = new CollaborationUseImpl();
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature createRedefinableTemplateSignature() {
		RedefinableTemplateSignatureImpl redefinableTemplateSignature = new RedefinableTemplateSignatureImpl();
		return redefinableTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTemplateParameter createClassifierTemplateParameter() {
		ClassifierTemplateParameterImpl classifierTemplateParameter = new ClassifierTemplateParameterImpl();
		return classifierTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization() {
		InterfaceRealizationImpl interfaceRealization = new InterfaceRealizationImpl();
		return interfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEnd createExtensionEnd() {
		ExtensionEndImpl extensionEnd = new ExtensionEndImpl();
		return extensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNull createLiteralNull() {
		LiteralNullImpl literalNull = new LiteralNullImpl();
		return literalNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralReal createLiteralReal() {
		LiteralRealImpl literalReal = new LiteralRealImpl();
		return literalReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification createInstanceSpecification() {
		InstanceSpecificationImpl instanceSpecification = new InstanceSpecificationImpl();
		return instanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValue createInstanceValue() {
		InstanceValueImpl instanceValue = new InstanceValueImpl();
		return instanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNatural createLiteralUnlimitedNatural() {
		LiteralUnlimitedNaturalImpl literalUnlimitedNatural = new LiteralUnlimitedNaturalImpl();
		return literalUnlimitedNatural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior createOpaqueBehavior() {
		OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
		return opaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior createFunctionBehavior() {
		FunctionBehaviorImpl functionBehavior = new FunctionBehaviorImpl();
		return functionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition createPartDecomposition() {
		PartDecompositionImpl partDecomposition = new PartDecompositionImpl();
		return partDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUse createInteractionUse() {
		InteractionUseImpl interactionUse = new InteractionUseImpl();
		return interactionUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createActivityPartition() {
		ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
		return activityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode createStructuredActivityNode() {
		StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
		return structuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion createInterruptibleActivityRegion() {
		InterruptibleActivityRegionImpl interruptibleActivityRegion = new InterruptibleActivityRegionImpl();
		return interruptibleActivityRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler createExceptionHandler() {
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrderingImpl generalOrdering = new GeneralOrderingImpl();
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification createOccurrenceSpecification() {
		OccurrenceSpecificationImpl occurrenceSpecification = new OccurrenceSpecificationImpl();
		return occurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createInteractionOperand() {
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint createInteractionConstraint() {
		InteractionConstraintImpl interactionConstraint = new InteractionConstraintImpl();
		return interactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification() {
		ExecutionOccurrenceSpecificationImpl executionOccurrenceSpecification = new ExecutionOccurrenceSpecificationImpl();
		return executionOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant createStateInvariant() {
		StateInvariantImpl stateInvariant = new StateInvariantImpl();
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecutionSpecification createActionExecutionSpecification() {
		ActionExecutionSpecificationImpl actionExecutionSpecification = new ActionExecutionSpecificationImpl();
		return actionExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorExecutionSpecification createBehaviorExecutionSpecification() {
		BehaviorExecutionSpecificationImpl behaviorExecutionSpecification = new BehaviorExecutionSpecificationImpl();
		return behaviorExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurrenceSpecification createMessageOccurrenceSpecification() {
		MessageOccurrenceSpecificationImpl messageOccurrenceSpecification = new MessageOccurrenceSpecificationImpl();
		return messageOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuation createContinuation() {
		ContinuationImpl continuation = new ContinuationImpl();
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsiderIgnoreFragment createConsiderIgnoreFragment() {
		ConsiderIgnoreFragmentImpl considerIgnoreFragment = new ConsiderIgnoreFragmentImpl();
		return considerIgnoreFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEvent createCallEvent() {
		CallEventImpl callEvent = new CallEventImpl();
		return callEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent createChangeEvent() {
		ChangeEventImpl changeEvent = new ChangeEventImpl();
		return changeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEvent createSignalEvent() {
		SignalEventImpl signalEvent = new SignalEventImpl();
		return signalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyReceiveEvent createAnyReceiveEvent() {
		AnyReceiveEventImpl anyReceiveEvent = new AnyReceiveEventImpl();
		return anyReceiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectAction createCreateObjectAction() {
		CreateObjectActionImpl createObjectAction = new CreateObjectActionImpl();
		return createObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyObjectAction createDestroyObjectAction() {
		DestroyObjectActionImpl destroyObjectAction = new DestroyObjectActionImpl();
		return destroyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructionOccurrenceSpecification createDestructionOccurrenceSpecification() {
		DestructionOccurrenceSpecificationImpl destructionOccurrenceSpecification = new DestructionOccurrenceSpecificationImpl();
		return destructionOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityAction createTestIdentityAction() {
		TestIdentityActionImpl testIdentityAction = new TestIdentityActionImpl();
		return testIdentityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSelfAction createReadSelfAction() {
		ReadSelfActionImpl readSelfAction = new ReadSelfActionImpl();
		return readSelfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureAction createReadStructuralFeatureAction() {
		ReadStructuralFeatureActionImpl readStructuralFeatureAction = new ReadStructuralFeatureActionImpl();
		return readStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearStructuralFeatureAction createClearStructuralFeatureAction() {
		ClearStructuralFeatureActionImpl clearStructuralFeatureAction = new ClearStructuralFeatureActionImpl();
		return clearStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction() {
		RemoveStructuralFeatureValueActionImpl removeStructuralFeatureValueAction = new RemoveStructuralFeatureValueActionImpl();
		return removeStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueAction createAddStructuralFeatureValueAction() {
		AddStructuralFeatureValueActionImpl addStructuralFeatureValueAction = new AddStructuralFeatureValueActionImpl();
		return addStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createLinkEndData() {
		LinkEndDataImpl linkEndData = new LinkEndDataImpl();
		return linkEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifierValue() {
		QualifierValueImpl qualifierValue = new QualifierValueImpl();
		return qualifierValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkAction createReadLinkAction() {
		ReadLinkActionImpl readLinkAction = new ReadLinkActionImpl();
		return readLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndCreationData createLinkEndCreationData() {
		LinkEndCreationDataImpl linkEndCreationData = new LinkEndCreationDataImpl();
		return linkEndCreationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkAction createCreateLinkAction() {
		CreateLinkActionImpl createLinkAction = new CreateLinkActionImpl();
		return createLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyLinkAction createDestroyLinkAction() {
		DestroyLinkActionImpl destroyLinkAction = new DestroyLinkActionImpl();
		return destroyLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndDestructionData createLinkEndDestructionData() {
		LinkEndDestructionDataImpl linkEndDestructionData = new LinkEndDestructionDataImpl();
		return linkEndDestructionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearAssociationAction createClearAssociationAction() {
		ClearAssociationActionImpl clearAssociationAction = new ClearAssociationActionImpl();
		return clearAssociationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSignalAction createBroadcastSignalAction() {
		BroadcastSignalActionImpl broadcastSignalAction = new BroadcastSignalActionImpl();
		return broadcastSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectAction createSendObjectAction() {
		SendObjectActionImpl sendObjectAction = new SendObjectActionImpl();
		return sendObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationAction createValueSpecificationAction() {
		ValueSpecificationActionImpl valueSpecificationAction = new ValueSpecificationActionImpl();
		return valueSpecificationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression createTimeExpression() {
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePin createValuePin() {
		ValuePinImpl valuePin = new ValuePinImpl();
		return valuePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval createDurationInterval() {
		DurationIntervalImpl durationInterval = new DurationIntervalImpl();
		return durationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraint createTimeConstraint() {
		TimeConstraintImpl timeConstraint = new TimeConstraintImpl();
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConstraint createIntervalConstraint() {
		IntervalConstraintImpl intervalConstraint = new IntervalConstraintImpl();
		return intervalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraint createDurationConstraint() {
		DurationConstraintImpl durationConstraint = new DurationConstraintImpl();
		return durationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservation createTimeObservation() {
		TimeObservationImpl timeObservation = new TimeObservationImpl();
		return timeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservation createDurationObservation() {
		DurationObservationImpl durationObservation = new DurationObservationImpl();
		return durationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction createOpaqueAction() {
		OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
		return opaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction createSendSignalAction() {
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction createCallBehaviorAction() {
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItem createInformationItem() {
		InformationItemImpl informationItem = new InformationItemImpl();
		return informationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow createInformationFlow() {
		InformationFlowImpl informationFlow = new InformationFlowImpl();
		return informationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadVariableAction createReadVariableAction() {
		ReadVariableActionImpl readVariableAction = new ReadVariableActionImpl();
		return readVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearVariableAction createClearVariableAction() {
		ClearVariableActionImpl clearVariableAction = new ClearVariableActionImpl();
		return clearVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableValueAction createAddVariableValueAction() {
		AddVariableValueActionImpl addVariableValueAction = new AddVariableValueActionImpl();
		return addVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveVariableValueAction createRemoveVariableValueAction() {
		RemoveVariableValueActionImpl removeVariableValueAction = new RemoveVariableValueActionImpl();
		return removeVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionAction createRaiseExceptionAction() {
		RaiseExceptionActionImpl raiseExceptionAction = new RaiseExceptionActionImpl();
		return raiseExceptionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInputPin createActionInputPin() {
		ActionInputPinImpl actionInputPin = new ActionInputPinImpl();
		return actionInputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadExtentAction createReadExtentAction() {
		ReadExtentActionImpl readExtentAction = new ReadExtentActionImpl();
		return readExtentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectAction createReclassifyObjectAction() {
		ReclassifyObjectActionImpl reclassifyObjectAction = new ReclassifyObjectActionImpl();
		return reclassifyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction() {
		ReadIsClassifiedObjectActionImpl readIsClassifiedObjectAction = new ReadIsClassifiedObjectActionImpl();
		return readIsClassifiedObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartClassifierBehaviorAction createStartClassifierBehaviorAction() {
		StartClassifierBehaviorActionImpl startClassifierBehaviorAction = new StartClassifierBehaviorActionImpl();
		return startClassifierBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndAction createReadLinkObjectEndAction() {
		ReadLinkObjectEndActionImpl readLinkObjectEndAction = new ReadLinkObjectEndActionImpl();
		return readLinkObjectEndAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction() {
		ReadLinkObjectEndQualifierActionImpl readLinkObjectEndQualifierAction = new ReadLinkObjectEndQualifierActionImpl();
		return readLinkObjectEndQualifierAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkObjectAction createCreateLinkObjectAction() {
		CreateLinkObjectActionImpl createLinkObjectAction = new CreateLinkObjectActionImpl();
		return createLinkObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction createAcceptEventAction() {
		AcceptEventActionImpl acceptEventAction = new AcceptEventActionImpl();
		return acceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallAction createAcceptCallAction() {
		AcceptCallActionImpl acceptCallAction = new AcceptCallActionImpl();
		return acceptCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyAction createReplyAction() {
		ReplyActionImpl replyAction = new ReplyActionImpl();
		return replyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnmarshallAction createUnmarshallAction() {
		UnmarshallActionImpl unmarshallAction = new UnmarshallActionImpl();
		return unmarshallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReduceAction createReduceAction() {
		ReduceActionImpl reduceAction = new ReduceActionImpl();
		return reduceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartObjectBehaviorAction createStartObjectBehaviorAction() {
		StartObjectBehaviorActionImpl startObjectBehaviorAction = new StartObjectBehaviorActionImpl();
		return startObjectBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode createActivityParameterNode() {
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNode createFlowFinalNode() {
		FlowFinalNodeImpl flowFinalNode = new FlowFinalNodeImpl();
		return flowFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralBufferNode createCentralBufferNode() {
		CentralBufferNodeImpl centralBufferNode = new CentralBufferNodeImpl();
		return centralBufferNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode createDataStoreNode() {
		DataStoreNodeImpl dataStoreNode = new DataStoreNodeImpl();
		return dataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow createObjectFlow() {
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceNode createSequenceNode() {
		SequenceNodeImpl sequenceNode = new SequenceNodeImpl();
		return sequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode createLoopNode() {
		LoopNodeImpl loopNode = new LoopNodeImpl();
		return loopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode createExpansionNode() {
		ExpansionNodeImpl expansionNode = new ExpansionNodeImpl();
		return expansionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion createExpansionRegion() {
		ExpansionRegionImpl expansionRegion = new ExpansionRegionImpl();
		return expansionRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealization createComponentRealization() {
		ComponentRealizationImpl componentRealization = new ComponentRealizationImpl();
		return componentRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment createExecutionEnvironment() {
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPath createCommunicationPath() {
		CommunicationPathImpl communicationPath = new CommunicationPathImpl();
		return communicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent createTimeEvent() {
		TimeEventImpl timeEvent = new TimeEventImpl();
		return timeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransition createProtocolTransition() {
		ProtocolTransitionImpl protocolTransition = new ProtocolTransitionImpl();
		return protocolTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClass createAssociationClass() {
		AssociationClassImpl associationClass = new AssociationClassImpl();
		return associationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType,
			String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindFromString(
			EDataType eDataType, String initialValue) {
		CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind createTransitionKindFromString(EDataType eDataType,
			String initialValue) {
		TransitionKind result = TransitionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind createPseudostateKindFromString(EDataType eDataType,
			String initialValue) {
		PseudostateKind result = PseudostateKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudostateKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind createAggregationKindFromString(EDataType eDataType,
			String initialValue) {
		AggregationKind result = AggregationKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(
			EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind
			.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind createParameterEffectKindFromString(
			EDataType eDataType, String initialValue) {
		ParameterEffectKind result = ParameterEffectKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterEffectKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind createConnectorKindFromString(EDataType eDataType,
			String initialValue) {
		ConnectorKind result = ConnectorKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType,
			String initialValue) {
		MessageKind result = MessageKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType,
			String initialValue) {
		MessageSort result = MessageSort.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(
			EDataType eDataType, String initialValue) {
		ObjectNodeOrderingKind result = ObjectNodeOrderingKind
			.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind createInteractionOperatorKindFromString(
			EDataType eDataType, String initialValue) {
		InteractionOperatorKind result = InteractionOperatorKind
			.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind createExpansionKindFromString(EDataType eDataType,
			String initialValue) {
		ExpansionKind result = ExpansionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
				+ "' is not a valid enumerator of '" + eDataType.getName() //$NON-NLS-1$
				+ "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpansionKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null
			? null
			: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLPackage getUMLPackage() {
		return (UMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLPackage getPackage() {
		return UMLPackage.eINSTANCE;
	}

} //UMLFactoryImpl
