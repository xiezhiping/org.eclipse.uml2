/*
 * Copyright (c) 2013, 2016 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 485756
 *
 */
package org.eclipse.uml2.uml.util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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
import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
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
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.ObjectFlow;
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
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UnmarshallAction;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecificationAction;
import org.eclipse.uml2.uml.Variable;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage
 * @generated
 */
public class UMLDerivedUnionAdapter
		extends AdapterImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = UMLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject) notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UMLPackage.ACTIVITY :
				notifyActivityChanged(notification, eClass);
				break;
			case UMLPackage.CLASS :
				notifyClassChanged(notification, eClass);
				break;
			case UMLPackage.COMMENT :
				notifyCommentChanged(notification, eClass);
				break;
			case UMLPackage.STEREOTYPE :
				notifyStereotypeChanged(notification, eClass);
				break;
			case UMLPackage.IMAGE :
				notifyImageChanged(notification, eClass);
				break;
			case UMLPackage.PROFILE :
				notifyProfileChanged(notification, eClass);
				break;
			case UMLPackage.PACKAGE :
				notifyPackageChanged(notification, eClass);
				break;
			case UMLPackage.TEMPLATE_PARAMETER :
				notifyTemplateParameterChanged(notification, eClass);
				break;
			case UMLPackage.TEMPLATE_SIGNATURE :
				notifyTemplateSignatureChanged(notification, eClass);
				break;
			case UMLPackage.TEMPLATE_BINDING :
				notifyTemplateBindingChanged(notification, eClass);
				break;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION :
				notifyTemplateParameterSubstitutionChanged(notification,
					eClass);
				break;
			case UMLPackage.ASSOCIATION :
				notifyAssociationChanged(notification, eClass);
				break;
			case UMLPackage.PROPERTY :
				notifyPropertyChanged(notification, eClass);
				break;
			case UMLPackage.CONNECTOR_END :
				notifyConnectorEndChanged(notification, eClass);
				break;
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER :
				notifyConnectableElementTemplateParameterChanged(notification,
					eClass);
				break;
			case UMLPackage.DEPLOYMENT :
				notifyDeploymentChanged(notification, eClass);
				break;
			case UMLPackage.DEPENDENCY :
				notifyDependencyChanged(notification, eClass);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION :
				notifyDeploymentSpecificationChanged(notification, eClass);
				break;
			case UMLPackage.ARTIFACT :
				notifyArtifactChanged(notification, eClass);
				break;
			case UMLPackage.MANIFESTATION :
				notifyManifestationChanged(notification, eClass);
				break;
			case UMLPackage.ABSTRACTION :
				notifyAbstractionChanged(notification, eClass);
				break;
			case UMLPackage.OPAQUE_EXPRESSION :
				notifyOpaqueExpressionChanged(notification, eClass);
				break;
			case UMLPackage.PARAMETER :
				notifyParameterChanged(notification, eClass);
				break;
			case UMLPackage.OPERATION :
				notifyOperationChanged(notification, eClass);
				break;
			case UMLPackage.PARAMETER_SET :
				notifyParameterSetChanged(notification, eClass);
				break;
			case UMLPackage.CONSTRAINT :
				notifyConstraintChanged(notification, eClass);
				break;
			case UMLPackage.DATA_TYPE :
				notifyDataTypeChanged(notification, eClass);
				break;
			case UMLPackage.INTERFACE :
				notifyInterfaceChanged(notification, eClass);
				break;
			case UMLPackage.RECEPTION :
				notifyReceptionChanged(notification, eClass);
				break;
			case UMLPackage.SIGNAL :
				notifySignalChanged(notification, eClass);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE :
				notifyProtocolStateMachineChanged(notification, eClass);
				break;
			case UMLPackage.STATE_MACHINE :
				notifyStateMachineChanged(notification, eClass);
				break;
			case UMLPackage.PSEUDOSTATE :
				notifyPseudostateChanged(notification, eClass);
				break;
			case UMLPackage.REGION :
				notifyRegionChanged(notification, eClass);
				break;
			case UMLPackage.STATE :
				notifyStateChanged(notification, eClass);
				break;
			case UMLPackage.CONNECTION_POINT_REFERENCE :
				notifyConnectionPointReferenceChanged(notification, eClass);
				break;
			case UMLPackage.TRIGGER :
				notifyTriggerChanged(notification, eClass);
				break;
			case UMLPackage.PORT :
				notifyPortChanged(notification, eClass);
				break;
			case UMLPackage.TRANSITION :
				notifyTransitionChanged(notification, eClass);
				break;
			case UMLPackage.PROTOCOL_CONFORMANCE :
				notifyProtocolConformanceChanged(notification, eClass);
				break;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER :
				notifyOperationTemplateParameterChanged(notification, eClass);
				break;
			case UMLPackage.PACKAGE_MERGE :
				notifyPackageMergeChanged(notification, eClass);
				break;
			case UMLPackage.PROFILE_APPLICATION :
				notifyProfileApplicationChanged(notification, eClass);
				break;
			case UMLPackage.ENUMERATION :
				notifyEnumerationChanged(notification, eClass);
				break;
			case UMLPackage.ENUMERATION_LITERAL :
				notifyEnumerationLiteralChanged(notification, eClass);
				break;
			case UMLPackage.INSTANCE_SPECIFICATION :
				notifyInstanceSpecificationChanged(notification, eClass);
				break;
			case UMLPackage.SLOT :
				notifySlotChanged(notification, eClass);
				break;
			case UMLPackage.PRIMITIVE_TYPE :
				notifyPrimitiveTypeChanged(notification, eClass);
				break;
			case UMLPackage.ELEMENT_IMPORT :
				notifyElementImportChanged(notification, eClass);
				break;
			case UMLPackage.PACKAGE_IMPORT :
				notifyPackageImportChanged(notification, eClass);
				break;
			case UMLPackage.EXTENSION :
				notifyExtensionChanged(notification, eClass);
				break;
			case UMLPackage.EXTENSION_END :
				notifyExtensionEndChanged(notification, eClass);
				break;
			case UMLPackage.MODEL :
				notifyModelChanged(notification, eClass);
				break;
			case UMLPackage.STRING_EXPRESSION :
				notifyStringExpressionChanged(notification, eClass);
				break;
			case UMLPackage.EXPRESSION :
				notifyExpressionChanged(notification, eClass);
				break;
			case UMLPackage.USAGE :
				notifyUsageChanged(notification, eClass);
				break;
			case UMLPackage.COLLABORATION_USE :
				notifyCollaborationUseChanged(notification, eClass);
				break;
			case UMLPackage.COLLABORATION :
				notifyCollaborationChanged(notification, eClass);
				break;
			case UMLPackage.CONNECTOR :
				notifyConnectorChanged(notification, eClass);
				break;
			case UMLPackage.GENERALIZATION :
				notifyGeneralizationChanged(notification, eClass);
				break;
			case UMLPackage.GENERALIZATION_SET :
				notifyGeneralizationSetChanged(notification, eClass);
				break;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE :
				notifyRedefinableTemplateSignatureChanged(notification, eClass);
				break;
			case UMLPackage.USE_CASE :
				notifyUseCaseChanged(notification, eClass);
				break;
			case UMLPackage.EXTEND :
				notifyExtendChanged(notification, eClass);
				break;
			case UMLPackage.EXTENSION_POINT :
				notifyExtensionPointChanged(notification, eClass);
				break;
			case UMLPackage.INCLUDE :
				notifyIncludeChanged(notification, eClass);
				break;
			case UMLPackage.SUBSTITUTION :
				notifySubstitutionChanged(notification, eClass);
				break;
			case UMLPackage.REALIZATION :
				notifyRealizationChanged(notification, eClass);
				break;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER :
				notifyClassifierTemplateParameterChanged(notification, eClass);
				break;
			case UMLPackage.INTERFACE_REALIZATION :
				notifyInterfaceRealizationChanged(notification, eClass);
				break;
			case UMLPackage.ACTIVITY_PARTITION :
				notifyActivityPartitionChanged(notification, eClass);
				break;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION :
				notifyInterruptibleActivityRegionChanged(notification, eClass);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE :
				notifyStructuredActivityNodeChanged(notification, eClass);
				break;
			case UMLPackage.EXCEPTION_HANDLER :
				notifyExceptionHandlerChanged(notification, eClass);
				break;
			case UMLPackage.INPUT_PIN :
				notifyInputPinChanged(notification, eClass);
				break;
			case UMLPackage.OUTPUT_PIN :
				notifyOutputPinChanged(notification, eClass);
				break;
			case UMLPackage.VARIABLE :
				notifyVariableChanged(notification, eClass);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION :
				notifyValueSpecificationActionChanged(notification, eClass);
				break;
			case UMLPackage.LINK_END_DATA :
				notifyLinkEndDataChanged(notification, eClass);
				break;
			case UMLPackage.QUALIFIER_VALUE :
				notifyQualifierValueChanged(notification, eClass);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION :
				notifyAcceptCallActionChanged(notification, eClass);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION :
				notifyAcceptEventActionChanged(notification, eClass);
				break;
			case UMLPackage.ACTION_INPUT_PIN :
				notifyActionInputPinChanged(notification, eClass);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION :
				notifyAddStructuralFeatureValueActionChanged(notification,
					eClass);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION :
				notifyAddVariableValueActionChanged(notification, eClass);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION :
				notifyBroadcastSignalActionChanged(notification, eClass);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION :
				notifyCallBehaviorActionChanged(notification, eClass);
				break;
			case UMLPackage.CALL_OPERATION_ACTION :
				notifyCallOperationActionChanged(notification, eClass);
				break;
			case UMLPackage.CLAUSE :
				notifyClauseChanged(notification, eClass);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION :
				notifyClearAssociationActionChanged(notification, eClass);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION :
				notifyClearStructuralFeatureActionChanged(notification, eClass);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION :
				notifyClearVariableActionChanged(notification, eClass);
				break;
			case UMLPackage.CONDITIONAL_NODE :
				notifyConditionalNodeChanged(notification, eClass);
				break;
			case UMLPackage.CREATE_LINK_ACTION :
				notifyCreateLinkActionChanged(notification, eClass);
				break;
			case UMLPackage.LINK_END_CREATION_DATA :
				notifyLinkEndCreationDataChanged(notification, eClass);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION :
				notifyCreateLinkObjectActionChanged(notification, eClass);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION :
				notifyCreateObjectActionChanged(notification, eClass);
				break;
			case UMLPackage.DESTROY_LINK_ACTION :
				notifyDestroyLinkActionChanged(notification, eClass);
				break;
			case UMLPackage.LINK_END_DESTRUCTION_DATA :
				notifyLinkEndDestructionDataChanged(notification, eClass);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION :
				notifyDestroyObjectActionChanged(notification, eClass);
				break;
			case UMLPackage.EXPANSION_NODE :
				notifyExpansionNodeChanged(notification, eClass);
				break;
			case UMLPackage.EXPANSION_REGION :
				notifyExpansionRegionChanged(notification, eClass);
				break;
			case UMLPackage.LOOP_NODE :
				notifyLoopNodeChanged(notification, eClass);
				break;
			case UMLPackage.OPAQUE_ACTION :
				notifyOpaqueActionChanged(notification, eClass);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION :
				notifyRaiseExceptionActionChanged(notification, eClass);
				break;
			case UMLPackage.READ_EXTENT_ACTION :
				notifyReadExtentActionChanged(notification, eClass);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION :
				notifyReadIsClassifiedObjectActionChanged(notification, eClass);
				break;
			case UMLPackage.READ_LINK_ACTION :
				notifyReadLinkActionChanged(notification, eClass);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION :
				notifyReadLinkObjectEndActionChanged(notification, eClass);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION :
				notifyReadLinkObjectEndQualifierActionChanged(notification,
					eClass);
				break;
			case UMLPackage.READ_SELF_ACTION :
				notifyReadSelfActionChanged(notification, eClass);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION :
				notifyReadStructuralFeatureActionChanged(notification, eClass);
				break;
			case UMLPackage.READ_VARIABLE_ACTION :
				notifyReadVariableActionChanged(notification, eClass);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION :
				notifyReclassifyObjectActionChanged(notification, eClass);
				break;
			case UMLPackage.REDUCE_ACTION :
				notifyReduceActionChanged(notification, eClass);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION :
				notifyRemoveStructuralFeatureValueActionChanged(notification,
					eClass);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION :
				notifyRemoveVariableValueActionChanged(notification, eClass);
				break;
			case UMLPackage.REPLY_ACTION :
				notifyReplyActionChanged(notification, eClass);
				break;
			case UMLPackage.SEND_OBJECT_ACTION :
				notifySendObjectActionChanged(notification, eClass);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION :
				notifySendSignalActionChanged(notification, eClass);
				break;
			case UMLPackage.SEQUENCE_NODE :
				notifySequenceNodeChanged(notification, eClass);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION :
				notifyStartClassifierBehaviorActionChanged(notification,
					eClass);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION :
				notifyStartObjectBehaviorActionChanged(notification, eClass);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION :
				notifyTestIdentityActionChanged(notification, eClass);
				break;
			case UMLPackage.UNMARSHALL_ACTION :
				notifyUnmarshallActionChanged(notification, eClass);
				break;
			case UMLPackage.VALUE_PIN :
				notifyValuePinChanged(notification, eClass);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE :
				notifyActivityFinalNodeChanged(notification, eClass);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE :
				notifyActivityParameterNodeChanged(notification, eClass);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE :
				notifyCentralBufferNodeChanged(notification, eClass);
				break;
			case UMLPackage.CONTROL_FLOW :
				notifyControlFlowChanged(notification, eClass);
				break;
			case UMLPackage.DATA_STORE_NODE :
				notifyDataStoreNodeChanged(notification, eClass);
				break;
			case UMLPackage.DECISION_NODE :
				notifyDecisionNodeChanged(notification, eClass);
				break;
			case UMLPackage.OBJECT_FLOW :
				notifyObjectFlowChanged(notification, eClass);
				break;
			case UMLPackage.FLOW_FINAL_NODE :
				notifyFlowFinalNodeChanged(notification, eClass);
				break;
			case UMLPackage.FORK_NODE :
				notifyForkNodeChanged(notification, eClass);
				break;
			case UMLPackage.INITIAL_NODE :
				notifyInitialNodeChanged(notification, eClass);
				break;
			case UMLPackage.JOIN_NODE :
				notifyJoinNodeChanged(notification, eClass);
				break;
			case UMLPackage.MERGE_NODE :
				notifyMergeNodeChanged(notification, eClass);
				break;
			case UMLPackage.INSTANCE_VALUE :
				notifyInstanceValueChanged(notification, eClass);
				break;
			case UMLPackage.ANY_RECEIVE_EVENT :
				notifyAnyReceiveEventChanged(notification, eClass);
				break;
			case UMLPackage.CALL_EVENT :
				notifyCallEventChanged(notification, eClass);
				break;
			case UMLPackage.CHANGE_EVENT :
				notifyChangeEventChanged(notification, eClass);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR :
				notifyFunctionBehaviorChanged(notification, eClass);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR :
				notifyOpaqueBehaviorChanged(notification, eClass);
				break;
			case UMLPackage.SIGNAL_EVENT :
				notifySignalEventChanged(notification, eClass);
				break;
			case UMLPackage.TIME_EVENT :
				notifyTimeEventChanged(notification, eClass);
				break;
			case UMLPackage.TIME_EXPRESSION :
				notifyTimeExpressionChanged(notification, eClass);
				break;
			case UMLPackage.COMMUNICATION_PATH :
				notifyCommunicationPathChanged(notification, eClass);
				break;
			case UMLPackage.DEVICE :
				notifyDeviceChanged(notification, eClass);
				break;
			case UMLPackage.NODE :
				notifyNodeChanged(notification, eClass);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT :
				notifyExecutionEnvironmentChanged(notification, eClass);
				break;
			case UMLPackage.INFORMATION_FLOW :
				notifyInformationFlowChanged(notification, eClass);
				break;
			case UMLPackage.MESSAGE :
				notifyMessageChanged(notification, eClass);
				break;
			case UMLPackage.INTERACTION :
				notifyInteractionChanged(notification, eClass);
				break;
			case UMLPackage.LIFELINE :
				notifyLifelineChanged(notification, eClass);
				break;
			case UMLPackage.PART_DECOMPOSITION :
				notifyPartDecompositionChanged(notification, eClass);
				break;
			case UMLPackage.INTERACTION_USE :
				notifyInteractionUseChanged(notification, eClass);
				break;
			case UMLPackage.GATE :
				notifyGateChanged(notification, eClass);
				break;
			case UMLPackage.INTERACTION_OPERAND :
				notifyInteractionOperandChanged(notification, eClass);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT :
				notifyInteractionConstraintChanged(notification, eClass);
				break;
			case UMLPackage.GENERAL_ORDERING :
				notifyGeneralOrderingChanged(notification, eClass);
				break;
			case UMLPackage.OCCURRENCE_SPECIFICATION :
				notifyOccurrenceSpecificationChanged(notification, eClass);
				break;
			case UMLPackage.INFORMATION_ITEM :
				notifyInformationItemChanged(notification, eClass);
				break;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION :
				notifyActionExecutionSpecificationChanged(notification, eClass);
				break;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION :
				notifyBehaviorExecutionSpecificationChanged(notification,
					eClass);
				break;
			case UMLPackage.COMBINED_FRAGMENT :
				notifyCombinedFragmentChanged(notification, eClass);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT :
				notifyConsiderIgnoreFragmentChanged(notification, eClass);
				break;
			case UMLPackage.CONTINUATION :
				notifyContinuationChanged(notification, eClass);
				break;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION :
				notifyDestructionOccurrenceSpecificationChanged(notification,
					eClass);
				break;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION :
				notifyMessageOccurrenceSpecificationChanged(notification,
					eClass);
				break;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION :
				notifyExecutionOccurrenceSpecificationChanged(notification,
					eClass);
				break;
			case UMLPackage.STATE_INVARIANT :
				notifyStateInvariantChanged(notification, eClass);
				break;
			case UMLPackage.FINAL_STATE :
				notifyFinalStateChanged(notification, eClass);
				break;
			case UMLPackage.PROTOCOL_TRANSITION :
				notifyProtocolTransitionChanged(notification, eClass);
				break;
			case UMLPackage.ASSOCIATION_CLASS :
				notifyAssociationClassChanged(notification, eClass);
				break;
			case UMLPackage.COMPONENT :
				notifyComponentChanged(notification, eClass);
				break;
			case UMLPackage.COMPONENT_REALIZATION :
				notifyComponentRealizationChanged(notification, eClass);
				break;
			case UMLPackage.ACTOR :
				notifyActorChanged(notification, eClass);
				break;
			case UMLPackage.DURATION :
				notifyDurationChanged(notification, eClass);
				break;
			case UMLPackage.DURATION_CONSTRAINT :
				notifyDurationConstraintChanged(notification, eClass);
				break;
			case UMLPackage.INTERVAL_CONSTRAINT :
				notifyIntervalConstraintChanged(notification, eClass);
				break;
			case UMLPackage.INTERVAL :
				notifyIntervalChanged(notification, eClass);
				break;
			case UMLPackage.DURATION_INTERVAL :
				notifyDurationIntervalChanged(notification, eClass);
				break;
			case UMLPackage.DURATION_OBSERVATION :
				notifyDurationObservationChanged(notification, eClass);
				break;
			case UMLPackage.LITERAL_BOOLEAN :
				notifyLiteralBooleanChanged(notification, eClass);
				break;
			case UMLPackage.LITERAL_INTEGER :
				notifyLiteralIntegerChanged(notification, eClass);
				break;
			case UMLPackage.LITERAL_NULL :
				notifyLiteralNullChanged(notification, eClass);
				break;
			case UMLPackage.LITERAL_REAL :
				notifyLiteralRealChanged(notification, eClass);
				break;
			case UMLPackage.LITERAL_STRING :
				notifyLiteralStringChanged(notification, eClass);
				break;
			case UMLPackage.LITERAL_UNLIMITED_NATURAL :
				notifyLiteralUnlimitedNaturalChanged(notification, eClass);
				break;
			case UMLPackage.TIME_CONSTRAINT :
				notifyTimeConstraintChanged(notification, eClass);
				break;
			case UMLPackage.TIME_INTERVAL :
				notifyTimeIntervalChanged(notification, eClass);
				break;
			case UMLPackage.TIME_OBSERVATION :
				notifyTimeObservationChanged(notification, eClass);
				break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @param derivedUnion the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass,
			EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAbstractionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Abstraction.class)) {
			case UMLPackage.ABSTRACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ABSTRACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ABSTRACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ABSTRACTION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ABSTRACTION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ABSTRACTION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ABSTRACTION__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ABSTRACTION__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ABSTRACTION__MAPPING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDependencyChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Dependency.class)) {
			case UMLPackage.DEPENDENCY__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPENDENCY__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPENDENCY__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEPENDENCY__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEPENDENCY__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPENDENCY__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPENDENCY__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPENDENCY__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCommentChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Comment.class)) {
			case UMLPackage.COMMENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStereotypeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Stereotype.class)) {
			case UMLPackage.STEREOTYPE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STEREOTYPE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STEREOTYPE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STEREOTYPE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.STEREOTYPE__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.STEREOTYPE__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STEREOTYPE__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STEREOTYPE__ICON :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClassChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(org.eclipse.uml2.uml.Class.class)) {
			case UMLPackage.CLASS__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLASS__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLASS__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLASS__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CLASS__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.CLASS__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CLASS__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStringExpressionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(StringExpression.class)) {
			case UMLPackage.STRING_EXPRESSION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRING_EXPRESSION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRING_EXPRESSION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRING_EXPRESSION__OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRING_EXPRESSION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRING_EXPRESSION__OWNING_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRING_EXPRESSION__SUB_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExpressionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Expression.class)) {
			case UMLPackage.EXPRESSION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPRESSION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPRESSION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPRESSION__OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackageChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(org.eclipse.uml2.uml.Package.class)) {
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PACKAGE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PACKAGE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PACKAGE__OWNED_STEREOTYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PACKAGE__OWNED_TYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTemplateSignatureChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TemplateSignature.class)) {
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTemplateParameterChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TemplateParameter.class)) {
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_PARAMETER__SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTemplateBindingChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TemplateBinding.class)) {
			case UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_BINDING__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_BINDING__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_BINDING__SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTemplateParameterSubstitutionChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(TemplateParameterSubstitution.class)) {
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackageMergeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(PackageMerge.class)) {
			case UMLPackage.PACKAGE_MERGE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_MERGE__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_MERGE__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_MERGE__MERGED_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyProfileApplicationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ProfileApplication.class)) {
			case UMLPackage.PROFILE_APPLICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE_APPLICATION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PROFILE_APPLICATION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PROFILE_APPLICATION__APPLIED_PROFILE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyProfileChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Profile.class)) {
			case UMLPackage.PROFILE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROFILE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROFILE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROFILE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROFILE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROFILE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__NESTED_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROFILE__NESTING_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROFILE__OWNED_STEREOTYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROFILE__OWNED_TYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROFILE__PACKAGE_MERGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__PACKAGED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROFILE__PROFILE_APPLICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyElementImportChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ElementImport.class)) {
			case UMLPackage.ELEMENT_IMPORT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ELEMENT_IMPORT__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ELEMENT_IMPORT__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ELEMENT_IMPORT__IMPORTED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackageImportChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(PackageImport.class)) {
			case UMLPackage.PACKAGE_IMPORT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_IMPORT__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_IMPORT__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExtensionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Extension.class)) {
			case UMLPackage.EXTENSION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTENSION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTENSION__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTENSION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__END_TYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__MEMBER_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXTENSION__OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION__NAVIGABLE_OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Association.class)) {
			case UMLPackage.ASSOCIATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ASSOCIATION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ASSOCIATION__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ASSOCIATION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__END_TYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__MEMBER_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION__OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPropertyChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Property.class)) {
			case UMLPackage.PROPERTY__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROPERTY__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROPERTY__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROPERTY__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROPERTY__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROPERTY__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROPERTY__DATATYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PROPERTY__INTERFACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PROPERTY__ASSOCIATION_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROPERTY__QUALIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROPERTY__CLASS :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PROPERTY__DEFAULT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROPERTY__OWNING_ASSOCIATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PROPERTY__REDEFINED_PROPERTY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConnectorEndChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ConnectorEnd.class)) {
			case UMLPackage.CONNECTOR_END__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTOR_END__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTOR_END__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConnectableElementTemplateParameterChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(ConnectableElementTemplateParameter.class)) {
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDeploymentChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Deployment.class)) {
			case UMLPackage.DEPLOYMENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEPLOYMENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEPLOYMENT__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__CONFIGURATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__DEPLOYED_ARTIFACT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT__LOCATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDeploymentSpecificationChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DeploymentSpecification.class)) {
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyArtifactChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Artifact.class)) {
			case UMLPackage.ARTIFACT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ARTIFACT__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ARTIFACT__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ARTIFACT__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__MANIFESTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyManifestationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Manifestation.class)) {
			case UMLPackage.MANIFESTATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MANIFESTATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MANIFESTATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MANIFESTATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MANIFESTATION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.MANIFESTATION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.MANIFESTATION__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.MANIFESTATION__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.MANIFESTATION__MAPPING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MANIFESTATION__UTILIZED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOperationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Operation.class)) {
			case UMLPackage.OPERATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPERATION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION__BODY_CONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__CLASS :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.OPERATION__DATATYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.OPERATION__INTERFACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.OPERATION__POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPERATION__REDEFINED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInterfaceRealizationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InterfaceRealization.class)) {
			case UMLPackage.INTERFACE_REALIZATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERFACE_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERFACE_REALIZATION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__MAPPING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__CONTRACT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRealizationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Realization.class)) {
			case UMLPackage.REALIZATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REALIZATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REALIZATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REALIZATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REALIZATION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.REALIZATION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.REALIZATION__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.REALIZATION__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.REALIZATION__MAPPING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInterfaceChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Interface.class)) {
			case UMLPackage.INTERFACE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERFACE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERFACE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERFACE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__PROTOCOL :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERFACE__REDEFINED_INTERFACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.INTERFACE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReceptionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Reception.class)) {
			case UMLPackage.RECEPTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECEPTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECEPTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.RECEPTION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.RECEPTION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECEPTION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECEPTION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.RECEPTION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.RECEPTION__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.RECEPTION__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySignalChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Signal.class)) {
			case UMLPackage.SIGNAL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SIGNAL__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SIGNAL__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SIGNAL__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SIGNAL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SIGNAL__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SIGNAL__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SIGNAL__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SIGNAL__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SIGNAL__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SIGNAL__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyProtocolStateMachineChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ProtocolStateMachine.class)) {
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONNECTION_POINT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStateMachineChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(StateMachine.class)) {
			case UMLPackage.STATE_MACHINE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE_MACHINE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE_MACHINE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.STATE_MACHINE__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__REDEFINED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.STATE_MACHINE__CONNECTION_POINT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE_MACHINE__REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPseudostateChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Pseudostate.class)) {
			case UMLPackage.PSEUDOSTATE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PSEUDOSTATE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PSEUDOSTATE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PSEUDOSTATE__CONTAINER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PSEUDOSTATE__STATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PSEUDOSTATE__STATE_MACHINE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRegionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Region.class)) {
			case UMLPackage.REGION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REGION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REGION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REGION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.REGION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REGION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REGION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.REGION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.REGION__EXTENDED_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.REGION__STATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REGION__STATE_MACHINE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REGION__TRANSITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.REGION__SUBVERTEX :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStateChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(State.class)) {
			case UMLPackage.STATE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE__CONTAINER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE__CONNECTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE__CONNECTION_POINT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE__DEFERRABLE_TRIGGER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__DO_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__ENTRY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__EXIT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE__REDEFINED_STATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.STATE__STATE_INVARIANT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STATE__REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConnectionPointReferenceChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConnectionPointReference.class)) {
			case UMLPackage.CONNECTION_POINT_REFERENCE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTION_POINT_REFERENCE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONNECTION_POINT_REFERENCE__CONTAINER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONNECTION_POINT_REFERENCE__STATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTriggerChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Trigger.class)) {
			case UMLPackage.TRIGGER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRIGGER__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRIGGER__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPortChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Port.class)) {
			case UMLPackage.PORT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PORT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PORT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PORT__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PORT__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PORT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PORT__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PORT__DATATYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PORT__INTERFACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PORT__ASSOCIATION_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PORT__QUALIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PORT__CLASS :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PORT__DEFAULT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PORT__OWNING_ASSOCIATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.PORT__REDEFINED_PROPERTY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.PORT__REDEFINED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConstraintChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Constraint.class)) {
			case UMLPackage.CONSTRAINT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONSTRAINT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONSTRAINT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONSTRAINT__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONSTRAINT__SPECIFICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTransitionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Transition.class)) {
			case UMLPackage.TRANSITION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRANSITION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRANSITION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TRANSITION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.TRANSITION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRANSITION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRANSITION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.TRANSITION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.TRANSITION__EFFECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRANSITION__GUARD :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.TRANSITION__REDEFINED_TRANSITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.TRANSITION__TRIGGER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TRANSITION__CONTAINER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyProtocolConformanceChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ProtocolConformance.class)) {
			case UMLPackage.PROTOCOL_CONFORMANCE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_CONFORMANCE__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_CONFORMANCE__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyParameterChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Parameter.class)) {
			case UMLPackage.PARAMETER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PARAMETER__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PARAMETER__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PARAMETER__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PARAMETER__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PARAMETER__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PARAMETER__DEFAULT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PARAMETER__OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyParameterSetChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ParameterSet.class)) {
			case UMLPackage.PARAMETER_SET__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PARAMETER_SET__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PARAMETER_SET__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PARAMETER_SET__CONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDataTypeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DataType.class)) {
			case UMLPackage.DATA_TYPE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DATA_TYPE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DATA_TYPE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DATA_TYPE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DATA_TYPE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DATA_TYPE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DATA_TYPE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DATA_TYPE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DATA_TYPE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DATA_TYPE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DATA_TYPE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_TYPE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOperationTemplateParameterChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(OperationTemplateParameter.class)) {
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExtensionEndChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ExtensionEnd.class)) {
			case UMLPackage.EXTENSION_END__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_END__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_END__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTENSION_END__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_END__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_END__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTENSION_END__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_END__DATATYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.EXTENSION_END__INTERFACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.EXTENSION_END__ASSOCIATION_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTENSION_END__QUALIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_END__CLASS :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.EXTENSION_END__DEFAULT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_END__OWNING_ASSOCIATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.EXTENSION_END__REDEFINED_PROPERTY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyModelChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Model.class)) {
			case UMLPackage.MODEL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MODEL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MODEL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MODEL__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.MODEL__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MODEL__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MODEL__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.MODEL__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MODEL__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MODEL__NESTED_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.MODEL__NESTING_PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MODEL__OWNED_STEREOTYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.MODEL__OWNED_TYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.MODEL__PACKAGE_MERGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MODEL__PACKAGED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.MODEL__PROFILE_APPLICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyEnumerationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Enumeration.class)) {
			case UMLPackage.ENUMERATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ENUMERATION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ENUMERATION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ENUMERATION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ENUMERATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ENUMERATION__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ENUMERATION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ENUMERATION__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ENUMERATION__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ENUMERATION__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ENUMERATION__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION__OWNED_LITERAL :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyEnumerationLiteralChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(EnumerationLiteral.class)) {
			case UMLPackage.ENUMERATION_LITERAL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION_LITERAL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION_LITERAL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ENUMERATION_LITERAL__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION_LITERAL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ENUMERATION_LITERAL__SLOT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION_LITERAL__SPECIFICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ENUMERATION_LITERAL__ENUMERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInstanceSpecificationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InstanceSpecification.class)) {
			case UMLPackage.INSTANCE_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INSTANCE_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INSTANCE_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INSTANCE_SPECIFICATION__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INSTANCE_SPECIFICATION__SLOT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INSTANCE_SPECIFICATION__SPECIFICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySlotChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Slot.class)) {
			case UMLPackage.SLOT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SLOT__VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SLOT__OWNING_INSTANCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPrimitiveTypeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(PrimitiveType.class)) {
			case UMLPackage.PRIMITIVE_TYPE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PRIMITIVE_TYPE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PRIMITIVE_TYPE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUsageChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Usage.class)) {
			case UMLPackage.USAGE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USAGE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USAGE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.USAGE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.USAGE__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.USAGE__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.USAGE__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.USAGE__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCollaborationUseChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CollaborationUse.class)) {
			case UMLPackage.COLLABORATION_USE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION_USE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION_USE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COLLABORATION_USE__ROLE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCollaborationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Collaboration.class)) {
			case UMLPackage.COLLABORATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COLLABORATION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COLLABORATION__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COLLABORATION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.COLLABORATION__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COLLABORATION__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COLLABORATION__COLLABORATION_ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyGeneralizationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Generalization.class)) {
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.GENERALIZATION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.GENERALIZATION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.GENERALIZATION__GENERAL :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.GENERALIZATION__SPECIFIC :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyGeneralizationSetChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(GeneralizationSet.class)) {
			case UMLPackage.GENERALIZATION_SET__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.GENERALIZATION_SET__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.GENERALIZATION_SET__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRedefinableTemplateSignatureChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RedefinableTemplateSignature.class)) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUseCaseChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(UseCase.class)) {
			case UMLPackage.USE_CASE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.USE_CASE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.USE_CASE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.USE_CASE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.USE_CASE__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__EXTEND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__EXTENSION_POINT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.USE_CASE__INCLUDE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExtendChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Extend.class)) {
			case UMLPackage.EXTEND__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTEND__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTEND__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTEND__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.EXTEND__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.EXTEND__CONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTEND__EXTENDED_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.EXTEND__EXTENSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExtensionPointChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ExtensionPoint.class)) {
			case UMLPackage.EXTENSION_POINT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_POINT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXTENSION_POINT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXTENSION_POINT__USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyIncludeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Include.class)) {
			case UMLPackage.INCLUDE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INCLUDE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INCLUDE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INCLUDE__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INCLUDE__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INCLUDE__ADDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INCLUDE__INCLUDING_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySubstitutionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Substitution.class)) {
			case UMLPackage.SUBSTITUTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SUBSTITUTION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SUBSTITUTION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__MAPPING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__CONTRACT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClassifierTemplateParameterChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ClassifierTemplateParameter.class)) {
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConnectorChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Connector.class)) {
			case UMLPackage.CONNECTOR__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTOR__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTOR__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONNECTOR__END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONNECTOR__REDEFINED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyImageChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Image.class)) {
			case UMLPackage.IMAGE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOpaqueExpressionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(OpaqueExpression.class)) {
			case UMLPackage.OPAQUE_EXPRESSION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_EXPRESSION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_EXPRESSION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAcceptCallActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(AcceptCallAction.class)) {
			case UMLPackage.ACCEPT_CALL_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__TRIGGER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_CALL_ACTION__RETURN_INFORMATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAcceptEventActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(AcceptEventAction.class)) {
			case UMLPackage.ACCEPT_EVENT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACCEPT_EVENT_ACTION__TRIGGER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActivityChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Activity.class)) {
			case UMLPackage.ACTIVITY__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.ACTIVITY__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.ACTIVITY__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__REDEFINED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__OWNED_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__VARIABLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTIVITY__GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__OWNED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY__STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActivityPartitionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ActivityPartition.class)) {
			case UMLPackage.ACTIVITY_PARTITION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_PARTITION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_PARTITION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_PARTITION__IN_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_PARTITION__SUBGROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_PARTITION__SUPER_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_PARTITION__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
				break;
			case UMLPackage.ACTIVITY_PARTITION__SUBPARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__SUBGROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_PARTITION__SUPER_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__SUPER_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_PARTITION__EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStructuredActivityNodeChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(StructuredActivityNode.class)) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInputPinChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InputPin.class)) {
			case UMLPackage.INPUT_PIN__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INPUT_PIN__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INPUT_PIN__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INPUT_PIN__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.INPUT_PIN__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INPUT_PIN__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.INPUT_PIN__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.INPUT_PIN__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INPUT_PIN__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INPUT_PIN__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOutputPinChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(OutputPin.class)) {
			case UMLPackage.OUTPUT_PIN__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OUTPUT_PIN__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OUTPUT_PIN__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OUTPUT_PIN__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OUTPUT_PIN__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.OUTPUT_PIN__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OUTPUT_PIN__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.OUTPUT_PIN__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.OUTPUT_PIN__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OUTPUT_PIN__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OUTPUT_PIN__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyVariableChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Variable.class)) {
			case UMLPackage.VARIABLE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VARIABLE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VARIABLE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VARIABLE__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VARIABLE__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VARIABLE__SCOPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInterruptibleActivityRegionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(InterruptibleActivityRegion.class)) {
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUBGROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExceptionHandlerChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ExceptionHandler.class)) {
			case UMLPackage.EXCEPTION_HANDLER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXCEPTION_HANDLER__PROTECTED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActionExecutionSpecificationChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ActionExecutionSpecification.class)) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLifelineChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Lifeline.class)) {
			case UMLPackage.LIFELINE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LIFELINE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LIFELINE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LIFELINE__INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LIFELINE__SELECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPartDecompositionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(PartDecomposition.class)) {
			case UMLPackage.PART_DECOMPOSITION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PART_DECOMPOSITION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PART_DECOMPOSITION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PART_DECOMPOSITION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PART_DECOMPOSITION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PART_DECOMPOSITION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PART_DECOMPOSITION__ACTUAL_GATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PART_DECOMPOSITION__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PART_DECOMPOSITION__RETURN_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInteractionUseChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InteractionUse.class)) {
			case UMLPackage.INTERACTION_USE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_USE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_USE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_USE__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_USE__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_USE__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_USE__ACTUAL_GATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_USE__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_USE__RETURN_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyGateChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Gate.class)) {
			case UMLPackage.GATE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.GATE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.GATE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyMessageChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Message.class)) {
			case UMLPackage.MESSAGE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MESSAGE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MESSAGE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MESSAGE__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MESSAGE__INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInteractionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Interaction.class)) {
			case UMLPackage.INTERACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.INTERACTION__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.INTERACTION__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__REDEFINED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__LIFELINE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__FRAGMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__ACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION__FORMAL_GATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION__MESSAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInteractionOperandChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InteractionOperand.class)) {
			case UMLPackage.INTERACTION_OPERAND__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_OPERAND__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_OPERAND__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_OPERAND__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION_OPERAND__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_OPERAND__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_OPERAND__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION_OPERAND__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INTERACTION_OPERAND__GUARD :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInteractionConstraintChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InteractionConstraint.class)) {
			case UMLPackage.INTERACTION_CONSTRAINT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT__SPECIFICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT__MAXINT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERACTION_CONSTRAINT__MININT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyGeneralOrderingChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(GeneralOrdering.class)) {
			case UMLPackage.GENERAL_ORDERING__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.GENERAL_ORDERING__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.GENERAL_ORDERING__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOccurrenceSpecificationChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(OccurrenceSpecification.class)) {
			case UMLPackage.OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OCCURRENCE_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActionInputPinChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ActionInputPin.class)) {
			case UMLPackage.ACTION_INPUT_PIN__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTION_INPUT_PIN__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTION_INPUT_PIN__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTION_INPUT_PIN__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACTION_INPUT_PIN__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTION_INPUT_PIN__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACTION_INPUT_PIN__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTION_INPUT_PIN__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTION_INPUT_PIN__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActivityFinalNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ActivityFinalNode.class)) {
			case UMLPackage.ACTIVITY_FINAL_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_FINAL_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActivityParameterNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ActivityParameterNode.class)) {
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActorChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Actor.class)) {
			case UMLPackage.ACTOR__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTOR__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTOR__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ACTOR__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ACTOR__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ACTOR__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ACTOR__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAddStructuralFeatureValueActionChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(AddStructuralFeatureValueAction.class)) {
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAddVariableValueActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AddVariableValueAction.class)) {
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION__INSERT_AT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAnyReceiveEventChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(AnyReceiveEvent.class)) {
			case UMLPackage.ANY_RECEIVE_EVENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ANY_RECEIVE_EVENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ANY_RECEIVE_EVENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ANY_RECEIVE_EVENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationClassChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(AssociationClass.class)) {
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__END_TYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyBehaviorExecutionSpecificationChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(BehaviorExecutionSpecification.class)) {
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyBroadcastSignalActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(BroadcastSignalAction.class)) {
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.BROADCAST_SIGNAL_ACTION__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCallBehaviorActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CallBehaviorAction.class)) {
			case UMLPackage.CALL_BEHAVIOR_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_BEHAVIOR_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCallEventChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CallEvent.class)) {
			case UMLPackage.CALL_EVENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_EVENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_EVENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CALL_EVENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCallOperationActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CallOperationAction.class)) {
			case UMLPackage.CALL_OPERATION_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CALL_OPERATION_ACTION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCentralBufferNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CentralBufferNode.class)) {
			case UMLPackage.CENTRAL_BUFFER_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CENTRAL_BUFFER_NODE__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChangeEventChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ChangeEvent.class)) {
			case UMLPackage.CHANGE_EVENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CHANGE_EVENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CHANGE_EVENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CHANGE_EVENT__CHANGE_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClauseChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Clause.class)) {
			case UMLPackage.CLAUSE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClearAssociationActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ClearAssociationAction.class)) {
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_ASSOCIATION_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClearStructuralFeatureActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ClearStructuralFeatureAction.class)) {
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClearVariableActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ClearVariableAction.class)) {
			case UMLPackage.CLEAR_VARIABLE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CLEAR_VARIABLE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCombinedFragmentChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CombinedFragment.class)) {
			case UMLPackage.COMBINED_FRAGMENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMBINED_FRAGMENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMBINED_FRAGMENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMBINED_FRAGMENT__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMBINED_FRAGMENT__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMBINED_FRAGMENT__OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCommunicationPathChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CommunicationPath.class)) {
			case UMLPackage.COMMUNICATION_PATH__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMMUNICATION_PATH__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMMUNICATION_PATH__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMMUNICATION_PATH__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__END_TYPE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__MEMBER_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMMUNICATION_PATH__OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMMUNICATION_PATH__NAVIGABLE_OWNED_END :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyComponentChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Component.class)) {
			case UMLPackage.COMPONENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMPONENT__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMPONENT__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMPONENT__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.COMPONENT__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.COMPONENT__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.COMPONENT__REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyComponentRealizationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ComponentRealization.class)) {
			case UMLPackage.COMPONENT_REALIZATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMPONENT_REALIZATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.COMPONENT_REALIZATION__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__CLIENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__SUPPLIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__MAPPING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.COMPONENT_REALIZATION__ABSTRACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConditionalNodeChangedGen(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ConditionalNode.class)) {
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CONDITIONAL_NODE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONDITIONAL_NODE__SUBGROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__SUPER_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.CONDITIONAL_NODE__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	protected void notifyConditionalNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ConditionalNode.class)) {
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			default :
				notifyConditionalNodeChangedGen(notification, eClass);
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConsiderIgnoreFragmentChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConsiderIgnoreFragment.class)) {
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT__OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyContinuationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Continuation.class)) {
			case UMLPackage.CONTINUATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONTINUATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONTINUATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONTINUATION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONTINUATION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONTINUATION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyControlFlowChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ControlFlow.class)) {
			case UMLPackage.CONTROL_FLOW__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONTROL_FLOW__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONTROL_FLOW__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONTROL_FLOW__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONTROL_FLOW__GUARD :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CONTROL_FLOW__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_EDGE__IN_GROUP);
				break;
			case UMLPackage.CONTROL_FLOW__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_EDGE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CONTROL_FLOW__REDEFINED_EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CONTROL_FLOW__WEIGHT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCreateLinkActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CreateLinkAction.class)) {
			case UMLPackage.CREATE_LINK_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_LINK_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CREATE_LINK_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_LINK_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CREATE_LINK_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__END_DATA :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_ACTION__INPUT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLinkEndDataChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LinkEndData.class)) {
			case UMLPackage.LINK_END_DATA__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LINK_END_DATA__QUALIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQualifierValueChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(QualifierValue.class)) {
			case UMLPackage.QUALIFIER_VALUE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLinkEndCreationDataChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LinkEndCreationData.class)) {
			case UMLPackage.LINK_END_CREATION_DATA__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LINK_END_CREATION_DATA__QUALIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCreateLinkObjectActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(CreateLinkObjectAction.class)) {
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__END_DATA :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__INPUT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_LINK_OBJECT_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCreateObjectActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(CreateObjectAction.class)) {
			case UMLPackage.CREATE_OBJECT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.CREATE_OBJECT_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDataStoreNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DataStoreNode.class)) {
			case UMLPackage.DATA_STORE_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_STORE_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DATA_STORE_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DATA_STORE_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DATA_STORE_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.DATA_STORE_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DATA_STORE_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.DATA_STORE_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.DATA_STORE_NODE__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDecisionNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DecisionNode.class)) {
			case UMLPackage.DECISION_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DECISION_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DECISION_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DECISION_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DECISION_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.DECISION_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DECISION_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.DECISION_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyObjectFlowChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ObjectFlow.class)) {
			case UMLPackage.OBJECT_FLOW__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OBJECT_FLOW__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OBJECT_FLOW__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OBJECT_FLOW__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OBJECT_FLOW__GUARD :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OBJECT_FLOW__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_EDGE__IN_GROUP);
				break;
			case UMLPackage.OBJECT_FLOW__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_EDGE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OBJECT_FLOW__REDEFINED_EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.OBJECT_FLOW__WEIGHT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDestroyLinkActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DestroyLinkAction.class)) {
			case UMLPackage.DESTROY_LINK_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__END_DATA :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_LINK_ACTION__INPUT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLinkEndDestructionDataChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LinkEndDestructionData.class)) {
			case UMLPackage.LINK_END_DESTRUCTION_DATA__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LINK_END_DESTRUCTION_DATA__QUALIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDestroyObjectActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DestroyObjectAction.class)) {
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDestructionOccurrenceSpecificationChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(DestructionOccurrenceSpecification.class)) {
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyMessageOccurrenceSpecificationChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(MessageOccurrenceSpecification.class)) {
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDeviceChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Device.class)) {
			case UMLPackage.DEVICE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEVICE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEVICE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DEVICE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.DEVICE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.DEVICE__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.DEVICE__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.DEVICE__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DEVICE__NESTED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyNodeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Node.class)) {
			case UMLPackage.NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.NODE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.NODE__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.NODE__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.NODE__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.NODE__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.NODE__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.NODE__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.NODE__NESTED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDurationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Duration.class)) {
			case UMLPackage.DURATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DURATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DURATION__EXPR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDurationConstraintChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DurationConstraint.class)) {
			case UMLPackage.DURATION_CONSTRAINT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION_CONSTRAINT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION_CONSTRAINT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DURATION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DURATION_CONSTRAINT__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DURATION_CONSTRAINT__SPECIFICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyIntervalConstraintChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(IntervalConstraint.class)) {
			case UMLPackage.INTERVAL_CONSTRAINT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERVAL_CONSTRAINT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERVAL_CONSTRAINT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERVAL_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERVAL_CONSTRAINT__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERVAL_CONSTRAINT__SPECIFICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyIntervalChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(Interval.class)) {
			case UMLPackage.INTERVAL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERVAL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INTERVAL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INTERVAL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDurationIntervalChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DurationInterval.class)) {
			case UMLPackage.DURATION_INTERVAL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION_INTERVAL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION_INTERVAL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DURATION_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDurationObservationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(DurationObservation.class)) {
			case UMLPackage.DURATION_OBSERVATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION_OBSERVATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.DURATION_OBSERVATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.DURATION_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExecutionEnvironmentChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ExecutionEnvironment.class)) {
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__DEPLOYMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_ENVIRONMENT__NESTED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExecutionOccurrenceSpecificationChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(ExecutionOccurrenceSpecification.class)) {
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExpansionNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ExpansionNode.class)) {
			case UMLPackage.EXPANSION_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.EXPANSION_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.EXPANSION_NODE__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExpansionRegionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ExpansionRegion.class)) {
			case UMLPackage.EXPANSION_REGION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_REGION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_REGION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.EXPANSION_REGION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_REGION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.EXPANSION_REGION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXPANSION_REGION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXPANSION_REGION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXPANSION_REGION__IN_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_REGION__SUBGROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__SUPER_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.EXPANSION_REGION__EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__STRUCTURED_NODE_INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__STRUCTURED_NODE_OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.EXPANSION_REGION__VARIABLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.EXPANSION_REGION__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFinalStateChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(FinalState.class)) {
			case UMLPackage.FINAL_STATE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FINAL_STATE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FINAL_STATE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FINAL_STATE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FINAL_STATE__CONTAINER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FINAL_STATE__CONNECTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FINAL_STATE__CONNECTION_POINT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FINAL_STATE__DEFERRABLE_TRIGGER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__DO_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__ENTRY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__EXIT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__REDEFINED_STATE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.FINAL_STATE__STATE_INVARIANT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FINAL_STATE__REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFlowFinalNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(FlowFinalNode.class)) {
			case UMLPackage.FLOW_FINAL_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FLOW_FINAL_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FLOW_FINAL_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FLOW_FINAL_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FLOW_FINAL_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.FLOW_FINAL_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FLOW_FINAL_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.FLOW_FINAL_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyForkNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ForkNode.class)) {
			case UMLPackage.FORK_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FORK_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FORK_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FORK_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FORK_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.FORK_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FORK_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.FORK_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFunctionBehaviorChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(FunctionBehavior.class)) {
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.FUNCTION_BEHAVIOR__REDEFINED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOpaqueBehaviorChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(OpaqueBehavior.class)) {
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__ROLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInformationFlowChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InformationFlow.class)) {
			case UMLPackage.INFORMATION_FLOW__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_FLOW__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_FLOW__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INFORMATION_FLOW__SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_FLOW__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_SOURCE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_FLOW__INFORMATION_TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInformationItemChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InformationItem.class)) {
			case UMLPackage.INFORMATION_ITEM__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INFORMATION_ITEM__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INFORMATION_ITEM__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INFORMATION_ITEM__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INFORMATION_ITEM__PACKAGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INFORMATION_ITEM__TEMPLATE_BINDING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__FEATURE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INFORMATION_ITEM__ATTRIBUTE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INFORMATION_ITEM__COLLABORATION_USE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__GENERALIZATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__INHERITED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INFORMATION_ITEM__OWNED_USE_CASE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.INFORMATION_ITEM__REDEFINED_CLASSIFIER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__REPRESENTATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INFORMATION_ITEM__SUBSTITUTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInitialNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InitialNode.class)) {
			case UMLPackage.INITIAL_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INITIAL_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INITIAL_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INITIAL_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INITIAL_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.INITIAL_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INITIAL_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.INITIAL_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInstanceValueChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(InstanceValue.class)) {
			case UMLPackage.INSTANCE_VALUE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INSTANCE_VALUE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.INSTANCE_VALUE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyJoinNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(JoinNode.class)) {
			case UMLPackage.JOIN_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.JOIN_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.JOIN_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.JOIN_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.JOIN_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.JOIN_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.JOIN_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.JOIN_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.JOIN_NODE__JOIN_SPEC :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralBooleanChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LiteralBoolean.class)) {
			case UMLPackage.LITERAL_BOOLEAN__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_BOOLEAN__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_BOOLEAN__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LITERAL_BOOLEAN__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralIntegerChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LiteralInteger.class)) {
			case UMLPackage.LITERAL_INTEGER__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_INTEGER__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_INTEGER__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LITERAL_INTEGER__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralNullChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LiteralNull.class)) {
			case UMLPackage.LITERAL_NULL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_NULL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_NULL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LITERAL_NULL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralRealChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LiteralReal.class)) {
			case UMLPackage.LITERAL_REAL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_REAL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_REAL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LITERAL_REAL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralStringChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LiteralString.class)) {
			case UMLPackage.LITERAL_STRING__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_STRING__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_STRING__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LITERAL_STRING__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralUnlimitedNaturalChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralUnlimitedNatural.class)) {
			case UMLPackage.LITERAL_UNLIMITED_NATURAL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_UNLIMITED_NATURAL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LITERAL_UNLIMITED_NATURAL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LITERAL_UNLIMITED_NATURAL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLoopNodeChangedGen(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LoopNode.class)) {
			case UMLPackage.LOOP_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LOOP_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LOOP_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.LOOP_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LOOP_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.LOOP_NODE__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.LOOP_NODE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.LOOP_NODE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.LOOP_NODE__IN_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LOOP_NODE__SUBGROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__SUPER_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.LOOP_NODE__EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__STRUCTURED_NODE_OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__VARIABLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.LOOP_NODE__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	protected void notifyLoopNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(LoopNode.class)) {
			case UMLPackage.LOOP_NODE__LOOP_VARIABLE_INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.LOOP_NODE__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			default :
				notifyLoopNodeChangedGen(notification, eClass);
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyMergeNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(MergeNode.class)) {
			case UMLPackage.MERGE_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MERGE_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.MERGE_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MERGE_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MERGE_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.MERGE_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.MERGE_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.MERGE_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOpaqueActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(OpaqueAction.class)) {
			case UMLPackage.OPAQUE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPAQUE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.OPAQUE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.OPAQUE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.OPAQUE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__INPUT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.OPAQUE_ACTION__OUTPUT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyProtocolTransitionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ProtocolTransition.class)) {
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRaiseExceptionActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(RaiseExceptionAction.class)) {
			case UMLPackage.RAISE_EXCEPTION_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RAISE_EXCEPTION_ACTION__EXCEPTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadExtentActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ReadExtentAction.class)) {
			case UMLPackage.READ_EXTENT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_EXTENT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_EXTENT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_EXTENT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_EXTENT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_EXTENT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_EXTENT_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadIsClassifiedObjectActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReadIsClassifiedObjectAction.class)) {
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadLinkActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ReadLinkAction.class)) {
			case UMLPackage.READ_LINK_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_LINK_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_LINK_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__END_DATA :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__INPUT_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadLinkObjectEndActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReadLinkObjectEndAction.class)) {
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadLinkObjectEndQualifierActionChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(ReadLinkObjectEndQualifierAction.class)) {
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadSelfActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ReadSelfAction.class)) {
			case UMLPackage.READ_SELF_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_SELF_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_SELF_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_SELF_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_SELF_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_SELF_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_SELF_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadStructuralFeatureActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReadStructuralFeatureAction.class)) {
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReadVariableActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ReadVariableAction.class)) {
			case UMLPackage.READ_VARIABLE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.READ_VARIABLE_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReclassifyObjectActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReclassifyObjectAction.class)) {
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.RECLASSIFY_OBJECT_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReduceActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ReduceAction.class)) {
			case UMLPackage.REDUCE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REDUCE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REDUCE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REDUCE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REDUCE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REDUCE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__COLLECTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REDUCE_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRemoveStructuralFeatureValueActionChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(RemoveStructuralFeatureValueAction.class)) {
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRemoveVariableValueActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RemoveVariableValueAction.class)) {
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReplyActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ReplyAction.class)) {
			case UMLPackage.REPLY_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REPLY_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REPLY_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REPLY_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.REPLY_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.REPLY_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__REPLY_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.REPLY_ACTION__RETURN_INFORMATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySendObjectActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(SendObjectAction.class)) {
			case UMLPackage.SEND_OBJECT_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_OBJECT_ACTION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySendSignalActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(SendSignalAction.class)) {
			case UMLPackage.SEND_SIGNAL_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEND_SIGNAL_ACTION__TARGET :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySequenceNodeChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(SequenceNode.class)) {
			case UMLPackage.SEQUENCE_NODE__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEQUENCE_NODE__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.SEQUENCE_NODE__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEQUENCE_NODE__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.SEQUENCE_NODE__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__OWNED_RULE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SEQUENCE_NODE__ELEMENT_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__PACKAGE_IMPORT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__OWNED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SEQUENCE_NODE__IMPORTED_MEMBER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SEQUENCE_NODE__IN_ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEQUENCE_NODE__SUBGROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__SUPER_GROUP :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SEQUENCE_NODE__EDGE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_EDGE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SEQUENCE_NODE__VARIABLE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case UMLPackage.SEQUENCE_NODE__NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_GROUP__CONTAINED_NODE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySignalEventChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(SignalEvent.class)) {
			case UMLPackage.SIGNAL_EVENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL_EVENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.SIGNAL_EVENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStartClassifierBehaviorActionChanged(
			Notification notification, EClass eClass) {
		switch (notification
			.getFeatureID(StartClassifierBehaviorAction.class)) {
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStartObjectBehaviorActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(StartObjectBehaviorAction.class)) {
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ARGUMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStateInvariantChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(StateInvariant.class)) {
			case UMLPackage.STATE_INVARIANT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_INVARIANT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_INVARIANT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_OPERAND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE_INVARIANT__ENCLOSING_INTERACTION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.STATE_INVARIANT__GENERAL_ORDERING :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.STATE_INVARIANT__INVARIANT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTestIdentityActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TestIdentityAction.class)) {
			case UMLPackage.TEST_IDENTITY_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__FIRST :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TEST_IDENTITY_ACTION__SECOND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTimeConstraintChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TimeConstraint.class)) {
			case UMLPackage.TIME_CONSTRAINT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_CONSTRAINT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_CONSTRAINT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_CONSTRAINT__CONTEXT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_CONSTRAINT__SPECIFICATION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTimeIntervalChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TimeInterval.class)) {
			case UMLPackage.TIME_INTERVAL__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_INTERVAL__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_INTERVAL__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTimeExpressionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TimeExpression.class)) {
			case UMLPackage.TIME_EXPRESSION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_EXPRESSION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_EXPRESSION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_EXPRESSION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_EXPRESSION__EXPR :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTimeEventChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TimeEvent.class)) {
			case UMLPackage.TIME_EVENT__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_EVENT__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_EVENT__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_EVENT__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_EVENT__WHEN :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTimeObservationChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(TimeObservation.class)) {
			case UMLPackage.TIME_OBSERVATION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_OBSERVATION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.TIME_OBSERVATION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.TIME_OBSERVATION__OWNING_TEMPLATE_PARAMETER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUnmarshallActionChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(UnmarshallAction.class)) {
			case UMLPackage.UNMARSHALL_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.UNMARSHALL_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.UNMARSHALL_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.UNMARSHALL_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.UNMARSHALL_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__OBJECT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__INPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.UNMARSHALL_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyValuePinChanged(Notification notification,
			EClass eClass) {
		switch (notification.getFeatureID(ValuePin.class)) {
			case UMLPackage.VALUE_PIN__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_PIN__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_PIN__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VALUE_PIN__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.VALUE_PIN__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VALUE_PIN__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.VALUE_PIN__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.VALUE_PIN__UPPER_BOUND :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_PIN__LOWER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_PIN__UPPER_VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_PIN__VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyValueSpecificationActionChanged(
			Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ValueSpecificationAction.class)) {
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OWNED_COMMENT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__NAMESPACE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__ACTIVITY :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__REDEFINED_NODE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__IN_PARTITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTIVITY_NODE__IN_GROUP);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__HANDLER :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__INPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__OUTPUT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__RESULT :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ACTION__OUTPUT);
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case UMLPackage.VALUE_SPECIFICATION_ACTION__VALUE :
				notifyChanged(notification, eClass,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

} //UMLDerivedUnionAdapter
