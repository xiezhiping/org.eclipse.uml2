/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2PackageImpl.java,v 1.8 2004/05/20 03:20:02 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;

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
import org.eclipse.uml2.AggregationKind;
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
import org.eclipse.uml2.CallConcurrencyKind;
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
import org.eclipse.uml2.ConnectorKind;
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
import org.eclipse.uml2.ExpansionKind;
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
import org.eclipse.uml2.InteractionOperator;
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
import org.eclipse.uml2.MessageKind;
import org.eclipse.uml2.MessageSort;
import org.eclipse.uml2.MessageTrigger;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Node;
import org.eclipse.uml2.ObjectFlow;
import org.eclipse.uml2.ObjectNode;
import org.eclipse.uml2.ObjectNodeOrderingKind;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.OperationTemplateParameter;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageMerge;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterDirectionKind;
import org.eclipse.uml2.ParameterEffectKind;
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
import org.eclipse.uml2.PseudostateKind;
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
import org.eclipse.uml2.TransitionKind;
import org.eclipse.uml2.Trigger;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Usage;
import org.eclipse.uml2.UseCase;
import org.eclipse.uml2.ValuePin;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.Variable;
import org.eclipse.uml2.VariableAction;
import org.eclipse.uml2.Vertex;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.WriteLinkAction;
import org.eclipse.uml2.WriteStructuralFeatureAction;
import org.eclipse.uml2.WriteVariableAction;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2PackageImpl extends EPackageImpl implements UML2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnlimitedNaturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterableClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableTemplateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateableClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centralBufferNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOrderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAssociationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyFunctionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readExtentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readIsClassifiedObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startOwnedBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndQualifierActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptibleActivityRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObservationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationObservationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callConcurrencyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expansionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pseudostateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeOrderingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterEffectKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sequenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.uml2.UML2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UML2PackageImpl() {
		super(eNS_URI, UML2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UML2Package init() {
		if (isInited) return (UML2Package)EPackage.Registry.INSTANCE.get(UML2Package.eNS_URI);

		// Obtain or create and register package.
		UML2PackageImpl theUML2Package = (UML2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UML2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackageImpl.init();

		// Obtain or create and register interdependencies

		// Step 1: create meta-model objects
		theUML2Package.createPackageContents();

		// Step 2: complete initialization
		theUML2Package.initializePackageContents();

		EValidator.Registry.INSTANCE.put(theUML2Package, UML2Validator.INSTANCE);

		return theUML2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedComment() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_UpperValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_LowerValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsActive() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedOperation() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Extension() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NestedClassifier() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedReception() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Package() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Default() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerivedUnion() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Aggregation() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Class_() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Opposite() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningAssociation() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_RedefinedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SubsettedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Datatype() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Association() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_DefaultValue() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Qualifier() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_AssociationEnd() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsQuery() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedParameter() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Class_() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Datatype() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Precondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Postcondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RedefinedOperation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_BodyCondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Default() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsException() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsStream() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Effect() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Operation() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DefaultValue() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParameterSet() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Visibility() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ClientDependency() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_NameExpression() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedType() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedMember() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageMerge() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_AppliedProfile() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageExtension() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedAttribute() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedOperation() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Result() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Behavior() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Symbol() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_AnnotatedElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_BodyExpression() {
		return (EReference)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Source() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Target() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Member() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedRule() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ImportedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ElementImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_PackageImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecification() {
		return literalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralString_Value() {
		return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNull() {
		return literalNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralInteger() {
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralInteger_Value() {
		return (EAttribute)literalIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUnlimitedNatural() {
		return literalUnlimitedNaturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralUnlimitedNatural_Value() {
		return (EAttribute)literalUnlimitedNaturalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Context() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Namespace() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Specification() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainedElement() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Feature() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_InheritedMember() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_General() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Generalization() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Attribute() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_RedefinedClassifier() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_PowertypeExtent() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Substitution() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_OwnedUseCase() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_UseCase() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Representation() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Occurrence() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeaturingClassifier() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_IsReadOnly() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeature() {
		return behavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_IsAbstract() {
		return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_Concurrency() {
		return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_Parameter() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_FormalParameter() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_ReturnResult() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_RaisedException() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_Method() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecification() {
		return instanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Slot() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Classifier() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Specification() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_OwningInstance() {
		return (EReference)slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Value() {
		return (EReference)slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_DefiningFeature() {
		return (EReference)slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceValue() {
		return instanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceValue_Instance() {
		return (EReference)instanceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_IsSubstitutable() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_General() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_GeneralizationSet() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_IsLeaf() {
		return (EAttribute)redefinableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableElement_RedefinitionContext() {
		return (EReference)redefinableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageableElement_PackageableElement_visibility() {
		return (EAttribute)packageableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementImport() {
		return elementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Visibility() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Alias() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportedElement() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportingNamespace() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_Visibility() {
		return (EAttribute)packageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportedPackage() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportingNamespace() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsDerived() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_OwnedEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EndType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_MemberEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMerge() {
		return packageMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_MergingPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_MergedPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotype() {
		return stereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_OwnedStereotype() {
		return (EReference)profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetaclassReference() {
		return (EReference)profileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetamodelReference() {
		return (EReference)profileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileApplication() {
		return profileApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileApplication_ImportedProfile() {
		return (EReference)profileApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_IsRequired() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Metaclass() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionEnd() {
		return extensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationItem() {
		return informationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationItem_Represented() {
		return (EReference)informationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlow() {
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Realization() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Conveyed() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsCovering() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Powertype() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalization() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationClass() {
		return associationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Viewpoint() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_IsReentrant() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Context() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_RedefinedBehavior() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Specification() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Parameter() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_FormalParameter() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_ReturnResult() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Precondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Postcondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameterSet() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredClassifier() {
		return behavioredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_ClassifierBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_Implementation() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedTrigger() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedStateMachine() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Body() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Language() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsReadOnly() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsSingleExecution() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edge() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Group() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Node() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Action() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_StructuredNode() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Client() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Supplier() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstraction() {
		return abstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstraction_Mapping() {
		return (EReference)abstractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_Abstraction() {
		return (EReference)realizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_RealizingClassifier() {
		return (EReference)realizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitution() {
		return substitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_Contract() {
		return (EReference)substitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_SubstitutingClassifier() {
		return (EReference)substitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_FileName() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_NestedArtifact() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Manifestation() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedOperation() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedAttribute() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestation() {
		return manifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestation_UtilizedElement() {
		return (EReference)manifestationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedAttribute() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedOperation() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RedefinedInterface() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_NestedClassifier() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedReception() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Protocol() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Contract() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_ImplementingClassifier() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtend() {
		return extendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_ExtendedCase() {
		return (EReference)extendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_Extension() {
		return (EReference)extendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_Condition() {
		return (EReference)extendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_ExtensionLocation() {
		return (EReference)extendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Include() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Extend() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_ExtensionPoint() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Subject() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionPoint() {
		return extensionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionPoint_UseCase() {
		return (EReference)extensionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_IncludingCase() {
		return (EReference)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_Addition() {
		return (EReference)includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Activity() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InGroup() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Guard() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_RedefinedElement() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InStructuredNode() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InPartition() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Weight() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Interrupts() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGroup() {
		return activityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_SuperGroup() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_ActivityGroup_activity() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InGroup() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_RedefinedElement() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InStructuredNode() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InPartition() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InInterruptibleRegion() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Effect() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Output() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Input() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Context() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPrecondition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPostcondition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Ordering() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_UpperBound() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_InState() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_Selection() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFlow() {
		return objectFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMulticast() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMultireceive() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Transformation() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Selection() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNode_DecisionInput() {
		return (EReference)decisionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableNode_Handler() {
		return (EReference)executableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityParameterNode() {
		return activityParameterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityParameterNode_Parameter() {
		return (EReference)activityParameterNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePin() {
		return valuePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePin_Value() {
		return (EReference)valuePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Scope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNode() {
		return structuredActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredActivityNode_MustIsolate() {
		return (EAttribute)structuredActivityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Variable() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructuredActivityNode_ContainedNode() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_ContainedEdge() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNode() {
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsDeterminate() {
		return (EAttribute)conditionalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsAssured() {
		return (EAttribute)conditionalNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Clause() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Result() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Test() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Body() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_PredecessorClause() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_SuccessorClause() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Decider() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_BodyOutput() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopNode() {
		return loopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_IsTestedFirst() {
		return (EAttribute)loopNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyPart() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_SetupPart() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Decider() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Test() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Result() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariable() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyOutput() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariableInput() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEnd() {
		return connectorEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_DefiningEnd() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_Role() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_PartWithPort() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElement() {
		return connectableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectableElement_End() {
		return (EReference)connectableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Kind() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Type() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_RedefinedConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_End() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Contract() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredClassifier() {
		return structuredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedAttribute() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_Part() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_Role() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedConnector() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallTrigger() {
		return callTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallTrigger_Operation() {
		return (EReference)callTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageTrigger() {
		return messageTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeTrigger() {
		return changeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeTrigger_ChangeExpression() {
		return (EReference)changeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Port() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReception() {
		return receptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReception_Signal() {
		return (EReference)receptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_OwnedAttribute() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalTrigger() {
		return signalTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalTrigger_Signal() {
		return (EReference)signalTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTrigger() {
		return timeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTrigger_IsRelative() {
		return (EAttribute)timeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeTrigger_When() {
		return (EReference)timeTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyTrigger() {
		return anyTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSignature() {
		return templateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Parameter() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_OwnedParameter() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_NestedSignature() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_NestingSignature() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Template() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameter() {
		return templateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Signature() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_ParameteredElement() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedParameteredElement() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Default() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedDefault() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateableElement() {
		return templateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_TemplateBinding() {
		return (EReference)templateableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_OwnedTemplateSignature() {
		return (EReference)templateableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_SubExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_OwningExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterableElement() {
		return parameterableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_TemplateParameter() {
		return (EReference)parameterableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_OwningParameter() {
		return (EReference)parameterableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBinding() {
		return templateBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_BoundElement() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_Signature() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_ParameterSubstitution() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameterSubstitution() {
		return templateParameterSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Formal() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_TemplateBinding() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Actual() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_OwnedActual() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_CollaborationRole() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationTemplateParameter() {
		return operationTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierTemplateParameter() {
		return classifierTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierTemplateParameter_AllowSubstitutable() {
		return (EAttribute)classifierTemplateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterableClassifier() {
		return parameterableClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableTemplateSignature() {
		return redefinableTemplateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateableClassifier() {
		return templateableClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElementTemplateParameter() {
		return connectableElementTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinNode_IsCombineDuplicate() {
		return (EAttribute)joinNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinNode_JoinSpec() {
		return (EReference)joinNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNode() {
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentralBufferNode() {
		return centralBufferNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPartition() {
		return activityPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsDimension() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsExternal() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_ContainedEdge() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActivityPartition_ContainedNode() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Subgroup() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_SuperPartition() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Represents() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsBehavior() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsService() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Required() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RedefinedPort() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Provided() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Protocol() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedClassifier() {
		return encapsulatedClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedClassifier_OwnedPort() {
		return (EReference)encapsulatedClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionNode() {
		return expansionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsOutput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsInput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegion() {
		return expansionRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_Mode() {
		return (EAttribute)expansionRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_OutputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_InputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ProtectedNode() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_HandlerBody() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionInput() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionType() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Lifeline() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Message() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Fragment() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FormalGate() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_Covered() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_GeneralOrdering() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingInteraction() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingOperand() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_CoveredBy() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Represents() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Interaction() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Selector() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_DecomposedAs() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageKind() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageSort() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ReceiveEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_SendEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Connector() {
		return (EReference)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Interaction() {
		return (EReference)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Signature() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Argument() {
		return (EReference)messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralOrdering() {
		return generalOrderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_Before() {
		return (EReference)generalOrderingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_After() {
		return (EReference)generalOrderingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEnd() {
		return messageEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEnd_ReceiveMessage() {
		return (EReference)messageEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEnd_SendMessage() {
		return (EReference)messageEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventOccurrence() {
		return eventOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventOccurrence_StartExec() {
		return (EReference)eventOccurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventOccurrence_FinishExec() {
		return (EReference)eventOccurrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventOccurrence_ToAfter() {
		return (EReference)eventOccurrenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventOccurrence_ToBefore() {
		return (EReference)eventOccurrenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionOccurrence() {
		return executionOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionOccurrence_Start() {
		return (EReference)executionOccurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionOccurrence_Finish() {
		return (EReference)executionOccurrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionOccurrence_Behavior() {
		return (EReference)executionOccurrenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateInvariant() {
		return stateInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateInvariant_Invariant() {
		return (EReference)stateInvariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationOccurrence() {
		return collaborationOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationOccurrence_Type() {
		return (EReference)collaborationOccurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationOccurrence_RoleBinding() {
		return (EReference)collaborationOccurrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Classifier() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Result() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectAction() {
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyLinks() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyOwnedObjects() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyObjectAction_Target() {
		return (EReference)destroyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityAction() {
		return testIdentityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_First() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Second() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Result() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSelfAction_Result() {
		return (EReference)readSelfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAction() {
		return structuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_StructuralFeature() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_Object() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureAction() {
		return readStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadStructuralFeatureAction_Result() {
		return (EReference)readStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureAction() {
		return writeStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Value() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureAction() {
		return clearStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueAction() {
		return removeStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueAction() {
		return addStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStructuralFeatureValueAction_IsReplaceAll() {
		return (EAttribute)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddStructuralFeatureValueAction_InsertAt() {
		return (EReference)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAction() {
		return linkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_EndData() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndData() {
		return linkEndDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Value() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_End() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Qualifier() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkAction() {
		return readLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkAction_Result() {
		return (EReference)readLinkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationData() {
		return linkEndCreationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_IsReplaceAll() {
		return (EAttribute)linkEndCreationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndCreationData_InsertAt() {
		return (EReference)linkEndCreationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkAction() {
		return createLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkAction() {
		return writeLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkAction() {
		return destroyLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAssociationAction() {
		return clearAssociationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Object() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Association() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAction() {
		return variableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAction_Variable() {
		return (EReference)variableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadVariableAction() {
		return readVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadVariableAction_Result() {
		return (EReference)readVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteVariableAction() {
		return writeVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteVariableAction_Value() {
		return (EReference)writeVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearVariableAction() {
		return clearVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableValueAction() {
		return addVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddVariableValueAction_IsReplaceAll() {
		return (EAttribute)addVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddVariableValueAction_InsertAt() {
		return (EReference)addVariableValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveVariableValueAction() {
		return removeVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyFunctionAction() {
		return applyFunctionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyFunctionAction_Function() {
		return (EReference)applyFunctionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyFunctionAction_Argument() {
		return (EReference)applyFunctionActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyFunctionAction_Result() {
		return (EReference)applyFunctionActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveFunction() {
		return primitiveFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveFunction_Body() {
		return (EAttribute)primitiveFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveFunction_Language() {
		return (EAttribute)primitiveFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAction() {
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallAction_IsSynchronous() {
		return (EAttribute)callActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAction_Result() {
		return (EReference)callActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationAction() {
		return invocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_Argument() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_OnPort() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction() {
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Target() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Signal() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSignalAction() {
		return broadcastSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastSignalAction_Signal() {
		return (EReference)broadcastSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendObjectAction() {
		return sendObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Target() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Request() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallOperationAction() {
		return callOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Operation() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Target() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorAction() {
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallBehaviorAction_Behavior() {
		return (EReference)callBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Region() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ConnectionPoint() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ExtendedStateMachine() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_StateMachine_redefinitionContext() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Subvertex() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transition() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_StateMachine() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_State() {
		return (EReference)regionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_ExtendedRegion() {
		return (EReference)regionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostate() {
		return pseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudostate_Kind() {
		return (EAttribute)pseudostateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsComposite() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsOrthogonal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSimple() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSubmachineState() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Submachine() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Connection() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_RedefinedState() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DeferrableTrigger() {
		return (EReference)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Region() {
		return (EReference)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entry() {
		return (EReference)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Exit() {
		return (EReference)stateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoActivity() {
		return (EReference)stateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateInvariant() {
		return (EReference)stateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Container() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Outgoing() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Incoming() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPointReference() {
		return connectionPointReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Entry() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Exit() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Kind() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Container() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RedefinedTransition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Effect() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadExtentAction() {
		return readExtentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Result() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Classifier() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectAction() {
		return reclassifyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_IsReplaceAll() {
		return (EAttribute)reclassifyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_OldClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_NewClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_Object() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadIsClassifiedObjectAction() {
		return readIsClassifiedObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadIsClassifiedObjectAction_IsDirect() {
		return (EAttribute)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Classifier() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Result() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Object() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartOwnedBehaviorAction() {
		return startOwnedBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartOwnedBehaviorAction_Object() {
		return (EReference)startOwnedBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierValue() {
		return qualifierValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Qualifier() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Value() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndAction() {
		return readLinkObjectEndActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Object() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_End() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Result() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndQualifierAction() {
		return readLinkObjectEndQualifierActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Object() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Result() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Qualifier() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkObjectAction() {
		return createLinkObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateLinkObjectAction_Result() {
		return (EReference)createLinkObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Result() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptCallAction() {
		return acceptCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptCallAction_ReturnInformation() {
		return (EReference)acceptCallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyAction() {
		return replyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyToCall() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyValue() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReturnInformation() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExceptionAction() {
		return raiseExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExceptionAction_Exception() {
		return (EReference)raiseExceptionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStoreNode() {
		return dataStoreNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptibleActivityRegion() {
		return interruptibleActivityRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_InterruptingEdge() {
		return (EReference)interruptibleActivityRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getInterruptibleActivityRegion_ContainedNode() {
		return (EReference)interruptibleActivityRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSet() {
		return parameterSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Parameter() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Condition() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOccurrence() {
		return interactionOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOccurrence_RefersTo() {
		return (EReference)interactionOccurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOccurrence_ActualGate() {
		return (EReference)interactionOccurrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOccurrence_Argument() {
		return (EReference)interactionOccurrenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDecomposition() {
		return partDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperand() {
		return interactionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Guard() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Fragment() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConstraint() {
		return interactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Minint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Maxint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedFragment_InteractionOperator() {
		return (EAttribute)combinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_Operand() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_CfragmentGate() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuation() {
		return continuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuation_Setting() {
		return (EAttribute)continuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeExpression_FirstTime() {
		return (EAttribute)timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Event() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_FirstTime() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Event() {
		return (EReference)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObservationAction() {
		return timeObservationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeObservationAction_Now() {
		return (EReference)timeObservationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationInterval() {
		return durationIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Min() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Max() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraint() {
		return timeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConstraint() {
		return intervalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationObservationAction() {
		return durationObservationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationObservationAction_Duration() {
		return (EReference)durationObservationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConstraint() {
		return durationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolConformance() {
		return protocolConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_SpecificMachine() {
		return (EReference)protocolConformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_GeneralMachine() {
		return (EReference)protocolConformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStateMachine() {
		return protocolStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolStateMachine_Conformance() {
		return (EReference)protocolStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolTransition() {
		return protocolTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PostCondition() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_Referred() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PreCondition() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_IsIndirectlyInstantiated() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Required() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Provided() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Realization() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedMember() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_DeployedArtifact() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Location() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Configuration() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedArtifact() {
		return deployedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTarget() {
		return deploymentTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTarget_Deployment() {
		return (EReference)deploymentTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTarget_DeployedElement() {
		return (EReference)deploymentTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_NestedNode() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment() {
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPath() {
		return communicationPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpecification() {
		return deploymentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_DeploymentLocation() {
		return (EAttribute)deploymentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_ExecutionLocation() {
		return (EAttribute)deploymentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallConcurrencyKind() {
		return callConcurrencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpansionKind() {
		return expansionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageKind() {
		return messageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSort() {
		return messageSortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionKind() {
		return transitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPseudostateKind() {
		return pseudostateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectNodeOrderingKind() {
		return objectNodeOrderingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionOperator() {
		return interactionOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectorKind() {
		return connectorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterEffectKind() {
		return parameterEffectKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSequence() {
		return sequenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSet() {
		return setEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Factory getUML2Factory() {
		return (UML2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEReference(elementEClass, ELEMENT__OWNED_COMMENT);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_UNIQUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER_VALUE);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER_VALUE);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__RESULT);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__BEHAVIOR);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__SYMBOL);
		createEReference(expressionEClass, EXPRESSION__OPERAND);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__ANNOTATED_ELEMENT);
		createEReference(commentEClass, COMMENT__BODY_EXPRESSION);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_OPERATION);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEReference(classEClass, CLASS__EXTENSION);
		createEReference(classEClass, CLASS__NESTED_CLASSIFIER);
		createEAttribute(classEClass, CLASS__IS_ACTIVE);
		createEReference(classEClass, CLASS__OWNED_RECEPTION);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__PACKAGE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT);
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEReference(propertyEClass, PROPERTY__CLASS_);
		createEReference(propertyEClass, PROPERTY__OPPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED_UNION);
		createEReference(propertyEClass, PROPERTY__OWNING_ASSOCIATION);
		createEReference(propertyEClass, PROPERTY__REDEFINED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__SUBSETTED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__DATATYPE);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION);
		createEAttribute(propertyEClass, PROPERTY__AGGREGATION);
		createEReference(propertyEClass, PROPERTY__DEFAULT_VALUE);
		createEReference(propertyEClass, PROPERTY__QUALIFIER);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION_END);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__OWNED_PARAMETER);
		createEReference(operationEClass, OPERATION__CLASS_);
		createEAttribute(operationEClass, OPERATION__IS_QUERY);
		createEReference(operationEClass, OPERATION__DATATYPE);
		createEReference(operationEClass, OPERATION__PRECONDITION);
		createEReference(operationEClass, OPERATION__POSTCONDITION);
		createEReference(operationEClass, OPERATION__REDEFINED_OPERATION);
		createEReference(operationEClass, OPERATION__BODY_CONDITION);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEReference(parameterEClass, PARAMETER__DEFAULT_VALUE);
		createEAttribute(parameterEClass, PARAMETER__IS_EXCEPTION);
		createEAttribute(parameterEClass, PARAMETER__IS_STREAM);
		createEAttribute(parameterEClass, PARAMETER__EFFECT);
		createEReference(parameterEClass, PARAMETER__PARAMETER_SET);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);
		createEReference(namedElementEClass, NAMED_ELEMENT__CLIENT_DEPENDENCY);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAME_EXPRESSION);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEReference(packageEClass, PACKAGE__OWNED_TYPE);
		createEReference(packageEClass, PACKAGE__OWNED_MEMBER);
		createEReference(packageEClass, PACKAGE__PACKAGE_MERGE);
		createEReference(packageEClass, PACKAGE__APPLIED_PROFILE);
		createEReference(packageEClass, PACKAGE__PACKAGE_EXTENSION);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_ATTRIBUTE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_OPERATION);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_RULE);
		createEReference(namespaceEClass, NAMESPACE__IMPORTED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__ELEMENT_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__PACKAGE_IMPORT);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalSpecificationEClass = createEClass(LITERAL_SPECIFICATION);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalNullEClass = createEClass(LITERAL_NULL);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		literalUnlimitedNaturalEClass = createEClass(LITERAL_UNLIMITED_NATURAL);
		createEAttribute(literalUnlimitedNaturalEClass, LITERAL_UNLIMITED_NATURAL__VALUE);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__FEATURE);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
		createEReference(classifierEClass, CLASSIFIER__INHERITED_MEMBER);
		createEReference(classifierEClass, CLASSIFIER__GENERAL);
		createEReference(classifierEClass, CLASSIFIER__GENERALIZATION);
		createEReference(classifierEClass, CLASSIFIER__ATTRIBUTE);
		createEReference(classifierEClass, CLASSIFIER__REDEFINED_CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__SUBSTITUTION);
		createEReference(classifierEClass, CLASSIFIER__POWERTYPE_EXTENT);
		createEReference(classifierEClass, CLASSIFIER__OWNED_USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__REPRESENTATION);
		createEReference(classifierEClass, CLASSIFIER__OCCURRENCE);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__FEATURING_CLASSIFIER);
		createEAttribute(featureEClass, FEATURE__IS_STATIC);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__CONTEXT);
		createEReference(constraintEClass, CONSTRAINT__NAMESPACE);
		createEReference(constraintEClass, CONSTRAINT__SPECIFICATION);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINED_ELEMENT);

		behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__PARAMETER);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__FORMAL_PARAMETER);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__RETURN_RESULT);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__IS_ABSTRACT);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__METHOD);
		createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__CONCURRENCY);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__IS_READ_ONLY);

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
		createEAttribute(redefinableElementEClass, REDEFINABLE_ELEMENT__IS_LEAF);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEAttribute(generalizationEClass, GENERALIZATION__IS_SUBSTITUTABLE);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZATION_SET);

		instanceSpecificationEClass = createEClass(INSTANCE_SPECIFICATION);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SLOT);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__CLASSIFIER);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SPECIFICATION);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__OWNING_INSTANCE);
		createEReference(slotEClass, SLOT__VALUE);
		createEReference(slotEClass, SLOT__DEFINING_FEATURE);

		instanceValueEClass = createEClass(INSTANCE_VALUE);
		createEReference(instanceValueEClass, INSTANCE_VALUE__INSTANCE);

		packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);
		createEAttribute(packageableElementEClass, PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY);

		elementImportEClass = createEClass(ELEMENT_IMPORT);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__VISIBILITY);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__ALIAS);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTED_ELEMENT);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTING_NAMESPACE);

		packageImportEClass = createEClass(PACKAGE_IMPORT);
		createEAttribute(packageImportEClass, PACKAGE_IMPORT__VISIBILITY);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTED_PACKAGE);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTING_NAMESPACE);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__IS_DERIVED);
		createEReference(associationEClass, ASSOCIATION__OWNED_END);
		createEReference(associationEClass, ASSOCIATION__END_TYPE);
		createEReference(associationEClass, ASSOCIATION__MEMBER_END);

		packageMergeEClass = createEClass(PACKAGE_MERGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__MERGING_PACKAGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__MERGED_PACKAGE);

		stereotypeEClass = createEClass(STEREOTYPE);

		profileEClass = createEClass(PROFILE);
		createEReference(profileEClass, PROFILE__OWNED_STEREOTYPE);
		createEReference(profileEClass, PROFILE__METACLASS_REFERENCE);
		createEReference(profileEClass, PROFILE__METAMODEL_REFERENCE);

		profileApplicationEClass = createEClass(PROFILE_APPLICATION);
		createEReference(profileApplicationEClass, PROFILE_APPLICATION__IMPORTED_PROFILE);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__IS_REQUIRED);
		createEReference(extensionEClass, EXTENSION__METACLASS);

		extensionEndEClass = createEClass(EXTENSION_END);

		informationItemEClass = createEClass(INFORMATION_ITEM);
		createEReference(informationItemEClass, INFORMATION_ITEM__REPRESENTED);

		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZATION);
		createEReference(informationFlowEClass, INFORMATION_FLOW__CONVEYED);

		behaviorEClass = createEClass(BEHAVIOR);
		createEAttribute(behaviorEClass, BEHAVIOR__IS_REENTRANT);
		createEReference(behaviorEClass, BEHAVIOR__CONTEXT);
		createEReference(behaviorEClass, BEHAVIOR__REDEFINED_BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__SPECIFICATION);
		createEReference(behaviorEClass, BEHAVIOR__PARAMETER);
		createEReference(behaviorEClass, BEHAVIOR__FORMAL_PARAMETER);
		createEReference(behaviorEClass, BEHAVIOR__RETURN_RESULT);
		createEReference(behaviorEClass, BEHAVIOR__PRECONDITION);
		createEReference(behaviorEClass, BEHAVIOR__POSTCONDITION);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER_SET);

		behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__IMPLEMENTATION);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__BODY);
		createEAttribute(activityEClass, ACTIVITY__LANGUAGE);
		createEReference(activityEClass, ACTIVITY__EDGE);
		createEReference(activityEClass, ACTIVITY__GROUP);
		createEReference(activityEClass, ACTIVITY__NODE);
		createEReference(activityEClass, ACTIVITY__ACTION);
		createEReference(activityEClass, ACTIVITY__STRUCTURED_NODE);
		createEAttribute(activityEClass, ACTIVITY__IS_SINGLE_EXECUTION);
		createEAttribute(activityEClass, ACTIVITY__IS_READ_ONLY);

		permissionEClass = createEClass(PERMISSION);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__CLIENT);
		createEReference(dependencyEClass, DEPENDENCY__SUPPLIER);

		usageEClass = createEClass(USAGE);

		abstractionEClass = createEClass(ABSTRACTION);
		createEReference(abstractionEClass, ABSTRACTION__MAPPING);

		realizationEClass = createEClass(REALIZATION);
		createEReference(realizationEClass, REALIZATION__ABSTRACTION);
		createEReference(realizationEClass, REALIZATION__REALIZING_CLASSIFIER);

		substitutionEClass = createEClass(SUBSTITUTION);
		createEReference(substitutionEClass, SUBSTITUTION__CONTRACT);
		createEReference(substitutionEClass, SUBSTITUTION__SUBSTITUTING_CLASSIFIER);

		associationClassEClass = createEClass(ASSOCIATION_CLASS);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__VIEWPOINT);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COVERING);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__POWERTYPE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATION);

		actorEClass = createEClass(ACTOR);

		extendEClass = createEClass(EXTEND);
		createEReference(extendEClass, EXTEND__EXTENDED_CASE);
		createEReference(extendEClass, EXTEND__EXTENSION);
		createEReference(extendEClass, EXTEND__CONDITION);
		createEReference(extendEClass, EXTEND__EXTENSION_LOCATION);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__INCLUDE);
		createEReference(useCaseEClass, USE_CASE__EXTEND);
		createEReference(useCaseEClass, USE_CASE__EXTENSION_POINT);
		createEReference(useCaseEClass, USE_CASE__SUBJECT);

		extensionPointEClass = createEClass(EXTENSION_POINT);
		createEReference(extensionPointEClass, EXTENSION_POINT__USE_CASE);

		includeEClass = createEClass(INCLUDE);
		createEReference(includeEClass, INCLUDE__INCLUDING_CASE);
		createEReference(includeEClass, INCLUDE__ADDITION);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__FILE_NAME);
		createEReference(artifactEClass, ARTIFACT__NESTED_ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__MANIFESTATION);
		createEReference(artifactEClass, ARTIFACT__OWNED_OPERATION);
		createEReference(artifactEClass, ARTIFACT__OWNED_ATTRIBUTE);

		manifestationEClass = createEClass(MANIFESTATION);
		createEReference(manifestationEClass, MANIFESTATION__UTILIZED_ELEMENT);

		connectorEndEClass = createEClass(CONNECTOR_END);
		createEReference(connectorEndEClass, CONNECTOR_END__DEFINING_END);
		createEReference(connectorEndEClass, CONNECTOR_END__ROLE);
		createEReference(connectorEndEClass, CONNECTOR_END__PART_WITH_PORT);

		connectableElementEClass = createEClass(CONNECTABLE_ELEMENT);
		createEReference(connectableElementEClass, CONNECTABLE_ELEMENT__END);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__TYPE);
		createEReference(connectorEClass, CONNECTOR__REDEFINED_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__END);
		createEAttribute(connectorEClass, CONNECTOR__KIND);
		createEReference(connectorEClass, CONNECTOR__CONTRACT);

		structuredClassifierEClass = createEClass(STRUCTURED_CLASSIFIER);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__PART);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__ROLE);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__ACTIVITY);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_GROUP);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__REDEFINED_ELEMENT);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_PARTITION);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__WEIGHT);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__INTERRUPTS);

		activityGroupEClass = createEClass(ACTIVITY_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SUPER_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_GROUP);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEReference(activityNodeEClass, ACTIVITY_NODE__REDEFINED_ELEMENT);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_STRUCTURED_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_PARTITION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__EFFECT);
		createEReference(actionEClass, ACTION__OUTPUT);
		createEReference(actionEClass, ACTION__INPUT);
		createEReference(actionEClass, ACTION__CONTEXT);
		createEReference(actionEClass, ACTION__LOCAL_PRECONDITION);
		createEReference(actionEClass, ACTION__LOCAL_POSTCONDITION);

		objectNodeEClass = createEClass(OBJECT_NODE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__ORDERING);
		createEReference(objectNodeEClass, OBJECT_NODE__UPPER_BOUND);
		createEReference(objectNodeEClass, OBJECT_NODE__IN_STATE);
		createEReference(objectNodeEClass, OBJECT_NODE__SELECTION);

		controlNodeEClass = createEClass(CONTROL_NODE);

		controlFlowEClass = createEClass(CONTROL_FLOW);

		objectFlowEClass = createEClass(OBJECT_FLOW);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTICAST);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTIRECEIVE);
		createEReference(objectFlowEClass, OBJECT_FLOW__TRANSFORMATION);
		createEReference(objectFlowEClass, OBJECT_FLOW__SELECTION);

		initialNodeEClass = createEClass(INITIAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);
		createEReference(decisionNodeEClass, DECISION_NODE__DECISION_INPUT);

		mergeNodeEClass = createEClass(MERGE_NODE);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);
		createEReference(executableNodeEClass, EXECUTABLE_NODE__HANDLER);

		outputPinEClass = createEClass(OUTPUT_PIN);

		inputPinEClass = createEClass(INPUT_PIN);

		pinEClass = createEClass(PIN);

		activityParameterNodeEClass = createEClass(ACTIVITY_PARAMETER_NODE);
		createEReference(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE__PARAMETER);

		valuePinEClass = createEClass(VALUE_PIN);
		createEReference(valuePinEClass, VALUE_PIN__VALUE);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OWNED_ATTRIBUTE);
		createEReference(interfaceEClass, INTERFACE__OWNED_OPERATION);
		createEReference(interfaceEClass, INTERFACE__REDEFINED_INTERFACE);
		createEReference(interfaceEClass, INTERFACE__NESTED_CLASSIFIER);
		createEReference(interfaceEClass, INTERFACE__OWNED_RECEPTION);
		createEReference(interfaceEClass, INTERFACE__PROTOCOL);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEReference(implementationEClass, IMPLEMENTATION__CONTRACT);
		createEReference(implementationEClass, IMPLEMENTATION__IMPLEMENTING_CLASSIFIER);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__SCOPE);

		structuredActivityNodeEClass = createEClass(STRUCTURED_ACTIVITY_NODE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__VARIABLE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE);
		createEAttribute(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE);

		conditionalNodeEClass = createEClass(CONDITIONAL_NODE);
		createEAttribute(conditionalNodeEClass, CONDITIONAL_NODE__IS_DETERMINATE);
		createEAttribute(conditionalNodeEClass, CONDITIONAL_NODE__IS_ASSURED);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__CLAUSE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__RESULT);

		clauseEClass = createEClass(CLAUSE);
		createEReference(clauseEClass, CLAUSE__TEST);
		createEReference(clauseEClass, CLAUSE__BODY);
		createEReference(clauseEClass, CLAUSE__PREDECESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__SUCCESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__DECIDER);
		createEReference(clauseEClass, CLAUSE__BODY_OUTPUT);

		loopNodeEClass = createEClass(LOOP_NODE);
		createEAttribute(loopNodeEClass, LOOP_NODE__IS_TESTED_FIRST);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_PART);
		createEReference(loopNodeEClass, LOOP_NODE__SETUP_PART);
		createEReference(loopNodeEClass, LOOP_NODE__DECIDER);
		createEReference(loopNodeEClass, LOOP_NODE__TEST);
		createEReference(loopNodeEClass, LOOP_NODE__RESULT);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_OUTPUT);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE_INPUT);

		collaborationOccurrenceEClass = createEClass(COLLABORATION_OCCURRENCE);
		createEReference(collaborationOccurrenceEClass, COLLABORATION_OCCURRENCE__TYPE);
		createEReference(collaborationOccurrenceEClass, COLLABORATION_OCCURRENCE__ROLE_BINDING);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__COLLABORATION_ROLE);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__LIFELINE);
		createEReference(interactionEClass, INTERACTION__MESSAGE);
		createEReference(interactionEClass, INTERACTION__FRAGMENT);
		createEReference(interactionEClass, INTERACTION__FORMAL_GATE);

		interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__COVERED);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__GENERAL_ORDERING);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_OPERAND);

		lifelineEClass = createEClass(LIFELINE);
		createEReference(lifelineEClass, LIFELINE__COVERED_BY);
		createEReference(lifelineEClass, LIFELINE__REPRESENTS);
		createEReference(lifelineEClass, LIFELINE__INTERACTION);
		createEReference(lifelineEClass, LIFELINE__SELECTOR);
		createEReference(lifelineEClass, LIFELINE__DECOMPOSED_AS);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_KIND);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_SORT);
		createEReference(messageEClass, MESSAGE__RECEIVE_EVENT);
		createEReference(messageEClass, MESSAGE__SEND_EVENT);
		createEReference(messageEClass, MESSAGE__CONNECTOR);
		createEReference(messageEClass, MESSAGE__INTERACTION);
		createEReference(messageEClass, MESSAGE__SIGNATURE);
		createEReference(messageEClass, MESSAGE__ARGUMENT);

		generalOrderingEClass = createEClass(GENERAL_ORDERING);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__BEFORE);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__AFTER);

		messageEndEClass = createEClass(MESSAGE_END);
		createEReference(messageEndEClass, MESSAGE_END__RECEIVE_MESSAGE);
		createEReference(messageEndEClass, MESSAGE_END__SEND_MESSAGE);

		eventOccurrenceEClass = createEClass(EVENT_OCCURRENCE);
		createEReference(eventOccurrenceEClass, EVENT_OCCURRENCE__START_EXEC);
		createEReference(eventOccurrenceEClass, EVENT_OCCURRENCE__FINISH_EXEC);
		createEReference(eventOccurrenceEClass, EVENT_OCCURRENCE__TO_AFTER);
		createEReference(eventOccurrenceEClass, EVENT_OCCURRENCE__TO_BEFORE);

		executionOccurrenceEClass = createEClass(EXECUTION_OCCURRENCE);
		createEReference(executionOccurrenceEClass, EXECUTION_OCCURRENCE__START);
		createEReference(executionOccurrenceEClass, EXECUTION_OCCURRENCE__FINISH);
		createEReference(executionOccurrenceEClass, EXECUTION_OCCURRENCE__BEHAVIOR);

		stateInvariantEClass = createEClass(STATE_INVARIANT);
		createEReference(stateInvariantEClass, STATE_INVARIANT__INVARIANT);

		stopEClass = createEClass(STOP);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__IS_BEHAVIOR);
		createEAttribute(portEClass, PORT__IS_SERVICE);
		createEReference(portEClass, PORT__REQUIRED);
		createEReference(portEClass, PORT__REDEFINED_PORT);
		createEReference(portEClass, PORT__PROVIDED);
		createEReference(portEClass, PORT__PROTOCOL);

		encapsulatedClassifierEClass = createEClass(ENCAPSULATED_CLASSIFIER);
		createEReference(encapsulatedClassifierEClass, ENCAPSULATED_CLASSIFIER__OWNED_PORT);

		templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__PARAMETER);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__OWNED_PARAMETER);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__NESTED_SIGNATURE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__NESTING_SIGNATURE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TEMPLATE);

		templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__SIGNATURE);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__DEFAULT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__OWNED_DEFAULT);

		templateableElementEClass = createEClass(TEMPLATEABLE_ELEMENT);
		createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
		createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__SUB_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__OWNING_EXPRESSION);

		parameterableElementEClass = createEClass(PARAMETERABLE_ELEMENT);
		createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
		createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__OWNING_PARAMETER);

		templateBindingEClass = createEClass(TEMPLATE_BINDING);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_ELEMENT);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__SIGNATURE);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);

		templateParameterSubstitutionEClass = createEClass(TEMPLATE_PARAMETER_SUBSTITUTION);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);

		operationTemplateParameterEClass = createEClass(OPERATION_TEMPLATE_PARAMETER);

		classifierTemplateParameterEClass = createEClass(CLASSIFIER_TEMPLATE_PARAMETER);
		createEAttribute(classifierTemplateParameterEClass, CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE);

		parameterableClassifierEClass = createEClass(PARAMETERABLE_CLASSIFIER);

		redefinableTemplateSignatureEClass = createEClass(REDEFINABLE_TEMPLATE_SIGNATURE);

		templateableClassifierEClass = createEClass(TEMPLATEABLE_CLASSIFIER);

		connectableElementTemplateParameterEClass = createEClass(CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER);

		callTriggerEClass = createEClass(CALL_TRIGGER);
		createEReference(callTriggerEClass, CALL_TRIGGER__OPERATION);

		messageTriggerEClass = createEClass(MESSAGE_TRIGGER);

		changeTriggerEClass = createEClass(CHANGE_TRIGGER);
		createEReference(changeTriggerEClass, CHANGE_TRIGGER__CHANGE_EXPRESSION);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__PORT);

		receptionEClass = createEClass(RECEPTION);
		createEReference(receptionEClass, RECEPTION__SIGNAL);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__OWNED_ATTRIBUTE);

		signalTriggerEClass = createEClass(SIGNAL_TRIGGER);
		createEReference(signalTriggerEClass, SIGNAL_TRIGGER__SIGNAL);

		timeTriggerEClass = createEClass(TIME_TRIGGER);
		createEAttribute(timeTriggerEClass, TIME_TRIGGER__IS_RELATIVE);
		createEReference(timeTriggerEClass, TIME_TRIGGER__WHEN);

		anyTriggerEClass = createEClass(ANY_TRIGGER);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__CLASSIFIER);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__RESULT);

		destroyObjectActionEClass = createEClass(DESTROY_OBJECT_ACTION);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS);
		createEReference(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__TARGET);

		testIdentityActionEClass = createEClass(TEST_IDENTITY_ACTION);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__FIRST);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__SECOND);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__RESULT);

		readSelfActionEClass = createEClass(READ_SELF_ACTION);
		createEReference(readSelfActionEClass, READ_SELF_ACTION__RESULT);

		structuralFeatureActionEClass = createEClass(STRUCTURAL_FEATURE_ACTION);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__OBJECT);

		readStructuralFeatureActionEClass = createEClass(READ_STRUCTURAL_FEATURE_ACTION);
		createEReference(readStructuralFeatureActionEClass, READ_STRUCTURAL_FEATURE_ACTION__RESULT);

		writeStructuralFeatureActionEClass = createEClass(WRITE_STRUCTURAL_FEATURE_ACTION);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__VALUE);

		clearStructuralFeatureActionEClass = createEClass(CLEAR_STRUCTURAL_FEATURE_ACTION);

		removeStructuralFeatureValueActionEClass = createEClass(REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION);

		addStructuralFeatureValueActionEClass = createEClass(ADD_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEAttribute(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL);
		createEReference(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);

		linkActionEClass = createEClass(LINK_ACTION);
		createEReference(linkActionEClass, LINK_ACTION__END_DATA);

		linkEndDataEClass = createEClass(LINK_END_DATA);
		createEReference(linkEndDataEClass, LINK_END_DATA__VALUE);
		createEReference(linkEndDataEClass, LINK_END_DATA__END);
		createEReference(linkEndDataEClass, LINK_END_DATA__QUALIFIER);

		readLinkActionEClass = createEClass(READ_LINK_ACTION);
		createEReference(readLinkActionEClass, READ_LINK_ACTION__RESULT);

		linkEndCreationDataEClass = createEClass(LINK_END_CREATION_DATA);
		createEAttribute(linkEndCreationDataEClass, LINK_END_CREATION_DATA__IS_REPLACE_ALL);
		createEReference(linkEndCreationDataEClass, LINK_END_CREATION_DATA__INSERT_AT);

		createLinkActionEClass = createEClass(CREATE_LINK_ACTION);

		writeLinkActionEClass = createEClass(WRITE_LINK_ACTION);

		destroyLinkActionEClass = createEClass(DESTROY_LINK_ACTION);

		clearAssociationActionEClass = createEClass(CLEAR_ASSOCIATION_ACTION);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__OBJECT);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__ASSOCIATION);

		variableActionEClass = createEClass(VARIABLE_ACTION);
		createEReference(variableActionEClass, VARIABLE_ACTION__VARIABLE);

		readVariableActionEClass = createEClass(READ_VARIABLE_ACTION);
		createEReference(readVariableActionEClass, READ_VARIABLE_ACTION__RESULT);

		writeVariableActionEClass = createEClass(WRITE_VARIABLE_ACTION);
		createEReference(writeVariableActionEClass, WRITE_VARIABLE_ACTION__VALUE);

		clearVariableActionEClass = createEClass(CLEAR_VARIABLE_ACTION);

		addVariableValueActionEClass = createEClass(ADD_VARIABLE_VALUE_ACTION);
		createEAttribute(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL);
		createEReference(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION__INSERT_AT);

		removeVariableValueActionEClass = createEClass(REMOVE_VARIABLE_VALUE_ACTION);

		applyFunctionActionEClass = createEClass(APPLY_FUNCTION_ACTION);
		createEReference(applyFunctionActionEClass, APPLY_FUNCTION_ACTION__FUNCTION);
		createEReference(applyFunctionActionEClass, APPLY_FUNCTION_ACTION__ARGUMENT);
		createEReference(applyFunctionActionEClass, APPLY_FUNCTION_ACTION__RESULT);

		primitiveFunctionEClass = createEClass(PRIMITIVE_FUNCTION);
		createEAttribute(primitiveFunctionEClass, PRIMITIVE_FUNCTION__BODY);
		createEAttribute(primitiveFunctionEClass, PRIMITIVE_FUNCTION__LANGUAGE);

		callActionEClass = createEClass(CALL_ACTION);
		createEAttribute(callActionEClass, CALL_ACTION__IS_SYNCHRONOUS);
		createEReference(callActionEClass, CALL_ACTION__RESULT);

		invocationActionEClass = createEClass(INVOCATION_ACTION);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ARGUMENT);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ON_PORT);

		sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__TARGET);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__SIGNAL);

		broadcastSignalActionEClass = createEClass(BROADCAST_SIGNAL_ACTION);
		createEReference(broadcastSignalActionEClass, BROADCAST_SIGNAL_ACTION__SIGNAL);

		sendObjectActionEClass = createEClass(SEND_OBJECT_ACTION);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__TARGET);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__REQUEST);

		callOperationActionEClass = createEClass(CALL_OPERATION_ACTION);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__OPERATION);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__TARGET);

		callBehaviorActionEClass = createEClass(CALL_BEHAVIOR_ACTION);
		createEReference(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION__BEHAVIOR);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__REGION);
		createEReference(stateMachineEClass, STATE_MACHINE__CONNECTION_POINT);
		createEReference(stateMachineEClass, STATE_MACHINE__EXTENDED_STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__SUBVERTEX);
		createEReference(regionEClass, REGION__TRANSITION);
		createEReference(regionEClass, REGION__STATE_MACHINE);
		createEReference(regionEClass, REGION__STATE);
		createEReference(regionEClass, REGION__EXTENDED_REGION);

		pseudostateEClass = createEClass(PSEUDOSTATE);
		createEAttribute(pseudostateEClass, PSEUDOSTATE__KIND);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__IS_COMPOSITE);
		createEAttribute(stateEClass, STATE__IS_ORTHOGONAL);
		createEAttribute(stateEClass, STATE__IS_SIMPLE);
		createEAttribute(stateEClass, STATE__IS_SUBMACHINE_STATE);
		createEReference(stateEClass, STATE__SUBMACHINE);
		createEReference(stateEClass, STATE__CONNECTION);
		createEReference(stateEClass, STATE__REDEFINED_STATE);
		createEReference(stateEClass, STATE__DEFERRABLE_TRIGGER);
		createEReference(stateEClass, STATE__REGION);
		createEReference(stateEClass, STATE__ENTRY);
		createEReference(stateEClass, STATE__EXIT);
		createEReference(stateEClass, STATE__DO_ACTIVITY);
		createEReference(stateEClass, STATE__STATE_INVARIANT);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__CONTAINER);
		createEReference(vertexEClass, VERTEX__OUTGOING);
		createEReference(vertexEClass, VERTEX__INCOMING);

		connectionPointReferenceEClass = createEClass(CONNECTION_POINT_REFERENCE);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__ENTRY);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__EXIT);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__KIND);
		createEReference(transitionEClass, TRANSITION__CONTAINER);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__REDEFINED_TRANSITION);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__EFFECT);

		finalStateEClass = createEClass(FINAL_STATE);

		interactionOccurrenceEClass = createEClass(INTERACTION_OCCURRENCE);
		createEReference(interactionOccurrenceEClass, INTERACTION_OCCURRENCE__REFERS_TO);
		createEReference(interactionOccurrenceEClass, INTERACTION_OCCURRENCE__ACTUAL_GATE);
		createEReference(interactionOccurrenceEClass, INTERACTION_OCCURRENCE__ARGUMENT);

		gateEClass = createEClass(GATE);

		partDecompositionEClass = createEClass(PART_DECOMPOSITION);

		interactionOperandEClass = createEClass(INTERACTION_OPERAND);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__GUARD);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__FRAGMENT);

		interactionConstraintEClass = createEClass(INTERACTION_CONSTRAINT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MININT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MAXINT);

		combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
		createEAttribute(combinedFragmentEClass, COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__OPERAND);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__CFRAGMENT_GATE);

		continuationEClass = createEClass(CONTINUATION);
		createEAttribute(continuationEClass, CONTINUATION__SETTING);

		expansionNodeEClass = createEClass(EXPANSION_NODE);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_OUTPUT);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_INPUT);

		expansionRegionEClass = createEClass(EXPANSION_REGION);
		createEAttribute(expansionRegionEClass, EXPANSION_REGION__MODE);
		createEReference(expansionRegionEClass, EXPANSION_REGION__OUTPUT_ELEMENT);
		createEReference(expansionRegionEClass, EXPANSION_REGION__INPUT_ELEMENT);

		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__PROTECTED_NODE);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__HANDLER_BODY);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_INPUT);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_TYPE);

		forkNodeEClass = createEClass(FORK_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);
		createEAttribute(joinNodeEClass, JOIN_NODE__IS_COMBINE_DUPLICATE);
		createEReference(joinNodeEClass, JOIN_NODE__JOIN_SPEC);

		flowFinalNodeEClass = createEClass(FLOW_FINAL_NODE);

		centralBufferNodeEClass = createEClass(CENTRAL_BUFFER_NODE);

		activityPartitionEClass = createEClass(ACTIVITY_PARTITION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_DIMENSION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_EXTERNAL);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__CONTAINED_EDGE);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__CONTAINED_NODE);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUBGROUP);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUPER_PARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__REPRESENTS);

		readExtentActionEClass = createEClass(READ_EXTENT_ACTION);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__RESULT);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__CLASSIFIER);

		reclassifyObjectActionEClass = createEClass(RECLASSIFY_OBJECT_ACTION);
		createEAttribute(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OBJECT);

		readIsClassifiedObjectActionEClass = createEClass(READ_IS_CLASSIFIED_OBJECT_ACTION);
		createEAttribute(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT);

		startOwnedBehaviorActionEClass = createEClass(START_OWNED_BEHAVIOR_ACTION);
		createEReference(startOwnedBehaviorActionEClass, START_OWNED_BEHAVIOR_ACTION__OBJECT);

		qualifierValueEClass = createEClass(QUALIFIER_VALUE);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__QUALIFIER);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__VALUE);

		readLinkObjectEndActionEClass = createEClass(READ_LINK_OBJECT_END_ACTION);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__OBJECT);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__END);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__RESULT);

		readLinkObjectEndQualifierActionEClass = createEClass(READ_LINK_OBJECT_END_QUALIFIER_ACTION);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER);

		createLinkObjectActionEClass = createEClass(CREATE_LINK_OBJECT_ACTION);
		createEReference(createLinkObjectActionEClass, CREATE_LINK_OBJECT_ACTION__RESULT);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__TRIGGER);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__RESULT);

		acceptCallActionEClass = createEClass(ACCEPT_CALL_ACTION);
		createEReference(acceptCallActionEClass, ACCEPT_CALL_ACTION__RETURN_INFORMATION);

		replyActionEClass = createEClass(REPLY_ACTION);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_TO_CALL);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_VALUE);
		createEReference(replyActionEClass, REPLY_ACTION__RETURN_INFORMATION);

		raiseExceptionActionEClass = createEClass(RAISE_EXCEPTION_ACTION);
		createEReference(raiseExceptionActionEClass, RAISE_EXCEPTION_ACTION__EXCEPTION);

		dataStoreNodeEClass = createEClass(DATA_STORE_NODE);

		interruptibleActivityRegionEClass = createEClass(INTERRUPTIBLE_ACTIVITY_REGION);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE);

		parameterSetEClass = createEClass(PARAMETER_SET);
		createEReference(parameterSetEClass, PARAMETER_SET__PARAMETER);
		createEReference(parameterSetEClass, PARAMETER_SET__CONDITION);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__DEPLOYED_ARTIFACT);
		createEReference(deploymentEClass, DEPLOYMENT__LOCATION);
		createEReference(deploymentEClass, DEPLOYMENT__CONFIGURATION);

		deployedArtifactEClass = createEClass(DEPLOYED_ARTIFACT);

		deploymentTargetEClass = createEClass(DEPLOYMENT_TARGET);
		createEReference(deploymentTargetEClass, DEPLOYMENT_TARGET__DEPLOYMENT);
		createEReference(deploymentTargetEClass, DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__NESTED_NODE);

		deviceEClass = createEClass(DEVICE);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);

		communicationPathEClass = createEClass(COMMUNICATION_PATH);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEAttribute(timeExpressionEClass, TIME_EXPRESSION__FIRST_TIME);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__EVENT);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__FIRST_TIME);
		createEReference(durationEClass, DURATION__EVENT);

		timeObservationActionEClass = createEClass(TIME_OBSERVATION_ACTION);
		createEReference(timeObservationActionEClass, TIME_OBSERVATION_ACTION__NOW);

		durationIntervalEClass = createEClass(DURATION_INTERVAL);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__MIN);
		createEReference(intervalEClass, INTERVAL__MAX);

		timeConstraintEClass = createEClass(TIME_CONSTRAINT);

		intervalConstraintEClass = createEClass(INTERVAL_CONSTRAINT);

		timeIntervalEClass = createEClass(TIME_INTERVAL);

		durationObservationActionEClass = createEClass(DURATION_OBSERVATION_ACTION);
		createEReference(durationObservationActionEClass, DURATION_OBSERVATION_ACTION__DURATION);

		durationConstraintEClass = createEClass(DURATION_CONSTRAINT);

		protocolConformanceEClass = createEClass(PROTOCOL_CONFORMANCE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__GENERAL_MACHINE);

		protocolStateMachineEClass = createEClass(PROTOCOL_STATE_MACHINE);
		createEReference(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE__CONFORMANCE);

		protocolTransitionEClass = createEClass(PROTOCOL_TRANSITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__POST_CONDITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__REFERRED);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__PRE_CONDITION);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__IS_INDIRECTLY_INSTANTIATED);
		createEReference(componentEClass, COMPONENT__REQUIRED);
		createEReference(componentEClass, COMPONENT__PROVIDED);
		createEReference(componentEClass, COMPONENT__REALIZATION);
		createEReference(componentEClass, COMPONENT__OWNED_MEMBER);

		deploymentSpecificationEClass = createEClass(DEPLOYMENT_SPECIFICATION);
		createEAttribute(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION);
		createEAttribute(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
		messageKindEEnum = createEEnum(MESSAGE_KIND);
		messageSortEEnum = createEEnum(MESSAGE_SORT);
		callConcurrencyKindEEnum = createEEnum(CALL_CONCURRENCY_KIND);
		transitionKindEEnum = createEEnum(TRANSITION_KIND);
		pseudostateKindEEnum = createEEnum(PSEUDOSTATE_KIND);
		interactionOperatorEEnum = createEEnum(INTERACTION_OPERATOR);
		expansionKindEEnum = createEEnum(EXPANSION_KIND);
		parameterEffectKindEEnum = createEEnum(PARAMETER_EFFECT_KIND);
		objectNodeOrderingKindEEnum = createEEnum(OBJECT_NODE_ORDERING_KIND);
		connectorKindEEnum = createEEnum(CONNECTOR_KIND);

		// Create data types
		integerEDataType = createEDataType(INTEGER);
		booleanEDataType = createEDataType(BOOLEAN);
		stringEDataType = createEDataType(STRING);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
		sequenceEDataType = createEDataType(SEQUENCE);
		setEDataType = createEDataType(SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(theEcorePackage.getEModelElement());
		multiplicityElementEClass.getESuperTypes().add(this.getElement());
		opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		valueSpecificationEClass.getESuperTypes().add(this.getTypedElement());
		valueSpecificationEClass.getESuperTypes().add(this.getParameterableElement());
		expressionEClass.getESuperTypes().add(this.getOpaqueExpression());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		commentEClass.getESuperTypes().add(this.getTemplateableElement());
		classEClass.getESuperTypes().add(this.getBehavioredClassifier());
		classEClass.getESuperTypes().add(this.getEncapsulatedClassifier());
		typeEClass.getESuperTypes().add(this.getPackageableElement());
		propertyEClass.getESuperTypes().add(this.getStructuralFeature());
		propertyEClass.getESuperTypes().add(this.getConnectableElement());
		propertyEClass.getESuperTypes().add(this.getDeploymentTarget());
		operationEClass.getESuperTypes().add(this.getBehavioralFeature());
		operationEClass.getESuperTypes().add(this.getTypedElement());
		operationEClass.getESuperTypes().add(this.getMultiplicityElement());
		operationEClass.getESuperTypes().add(this.getParameterableElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getConnectableElement());
		parameterEClass.getESuperTypes().add(this.getTypedElement());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		namedElementEClass.getESuperTypes().add(this.getTemplateableElement());
		packageEClass.getESuperTypes().add(this.getNamespace());
		packageEClass.getESuperTypes().add(this.getPackageableElement());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		enumerationLiteralEClass.getESuperTypes().add(this.getInstanceSpecification());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalUnlimitedNaturalEClass.getESuperTypes().add(this.getLiteralSpecification());
		classifierEClass.getESuperTypes().add(this.getNamespace());
		classifierEClass.getESuperTypes().add(this.getType());
		classifierEClass.getESuperTypes().add(this.getRedefinableElement());
		featureEClass.getESuperTypes().add(this.getRedefinableElement());
		constraintEClass.getESuperTypes().add(this.getPackageableElement());
		behavioralFeatureEClass.getESuperTypes().add(this.getNamespace());
		behavioralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
		structuralFeatureEClass.getESuperTypes().add(this.getMultiplicityElement());
		redefinableElementEClass.getESuperTypes().add(this.getNamedElement());
		generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());
		instanceSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
		instanceSpecificationEClass.getESuperTypes().add(this.getDeploymentTarget());
		instanceSpecificationEClass.getESuperTypes().add(this.getDeployedArtifact());
		slotEClass.getESuperTypes().add(this.getElement());
		instanceValueEClass.getESuperTypes().add(this.getValueSpecification());
		packageableElementEClass.getESuperTypes().add(this.getNamedElement());
		packageableElementEClass.getESuperTypes().add(this.getParameterableElement());
		elementImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		packageImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		associationEClass.getESuperTypes().add(this.getClassifier());
		associationEClass.getESuperTypes().add(this.getRelationship());
		packageMergeEClass.getESuperTypes().add(this.getDirectedRelationship());
		stereotypeEClass.getESuperTypes().add(this.getClass_());
		profileEClass.getESuperTypes().add(this.getPackage());
		profileApplicationEClass.getESuperTypes().add(this.getPackageImport());
		extensionEClass.getESuperTypes().add(this.getAssociation());
		extensionEndEClass.getESuperTypes().add(this.getProperty());
		informationItemEClass.getESuperTypes().add(this.getClassifier());
		informationFlowEClass.getESuperTypes().add(this.getPackageableElement());
		informationFlowEClass.getESuperTypes().add(this.getDirectedRelationship());
		behaviorEClass.getESuperTypes().add(this.getClass_());
		behavioredClassifierEClass.getESuperTypes().add(this.getClassifier());
		activityEClass.getESuperTypes().add(this.getBehavior());
		permissionEClass.getESuperTypes().add(this.getDependency());
		dependencyEClass.getESuperTypes().add(this.getPackageableElement());
		dependencyEClass.getESuperTypes().add(this.getDirectedRelationship());
		usageEClass.getESuperTypes().add(this.getDependency());
		abstractionEClass.getESuperTypes().add(this.getDependency());
		realizationEClass.getESuperTypes().add(this.getAbstraction());
		substitutionEClass.getESuperTypes().add(this.getRealization());
		associationClassEClass.getESuperTypes().add(this.getClass_());
		associationClassEClass.getESuperTypes().add(this.getAssociation());
		modelEClass.getESuperTypes().add(this.getPackage());
		generalizationSetEClass.getESuperTypes().add(this.getPackageableElement());
		actorEClass.getESuperTypes().add(this.getClassifier());
		extendEClass.getESuperTypes().add(this.getNamedElement());
		extendEClass.getESuperTypes().add(this.getDirectedRelationship());
		useCaseEClass.getESuperTypes().add(this.getBehavioredClassifier());
		extensionPointEClass.getESuperTypes().add(this.getRedefinableElement());
		includeEClass.getESuperTypes().add(this.getNamedElement());
		includeEClass.getESuperTypes().add(this.getDirectedRelationship());
		artifactEClass.getESuperTypes().add(this.getClassifier());
		artifactEClass.getESuperTypes().add(this.getDeployedArtifact());
		manifestationEClass.getESuperTypes().add(this.getAbstraction());
		connectorEndEClass.getESuperTypes().add(this.getMultiplicityElement());
		connectableElementEClass.getESuperTypes().add(this.getNamedElement());
		connectableElementEClass.getESuperTypes().add(this.getParameterableElement());
		connectorEClass.getESuperTypes().add(this.getFeature());
		structuredClassifierEClass.getESuperTypes().add(this.getClassifier());
		activityEdgeEClass.getESuperTypes().add(this.getRedefinableElement());
		activityGroupEClass.getESuperTypes().add(this.getElement());
		activityNodeEClass.getESuperTypes().add(this.getRedefinableElement());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		objectNodeEClass.getESuperTypes().add(this.getActivityNode());
		objectNodeEClass.getESuperTypes().add(this.getTypedElement());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		outputPinEClass.getESuperTypes().add(this.getPin());
		inputPinEClass.getESuperTypes().add(this.getPin());
		pinEClass.getESuperTypes().add(this.getObjectNode());
		pinEClass.getESuperTypes().add(this.getMultiplicityElement());
		activityParameterNodeEClass.getESuperTypes().add(this.getObjectNode());
		valuePinEClass.getESuperTypes().add(this.getInputPin());
		interfaceEClass.getESuperTypes().add(this.getClassifier());
		implementationEClass.getESuperTypes().add(this.getRealization());
		variableEClass.getESuperTypes().add(this.getConnectableElement());
		variableEClass.getESuperTypes().add(this.getTypedElement());
		variableEClass.getESuperTypes().add(this.getMultiplicityElement());
		structuredActivityNodeEClass.getESuperTypes().add(this.getAction());
		structuredActivityNodeEClass.getESuperTypes().add(this.getNamespace());
		structuredActivityNodeEClass.getESuperTypes().add(this.getActivityGroup());
		conditionalNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		clauseEClass.getESuperTypes().add(this.getElement());
		loopNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		collaborationOccurrenceEClass.getESuperTypes().add(this.getNamedElement());
		collaborationEClass.getESuperTypes().add(this.getBehavioredClassifier());
		collaborationEClass.getESuperTypes().add(this.getStructuredClassifier());
		interactionEClass.getESuperTypes().add(this.getBehavior());
		interactionEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionFragmentEClass.getESuperTypes().add(this.getNamedElement());
		lifelineEClass.getESuperTypes().add(this.getNamedElement());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		generalOrderingEClass.getESuperTypes().add(this.getNamedElement());
		messageEndEClass.getESuperTypes().add(this.getNamedElement());
		eventOccurrenceEClass.getESuperTypes().add(this.getInteractionFragment());
		eventOccurrenceEClass.getESuperTypes().add(this.getMessageEnd());
		executionOccurrenceEClass.getESuperTypes().add(this.getInteractionFragment());
		stateInvariantEClass.getESuperTypes().add(this.getInteractionFragment());
		stopEClass.getESuperTypes().add(this.getEventOccurrence());
		portEClass.getESuperTypes().add(this.getProperty());
		encapsulatedClassifierEClass.getESuperTypes().add(this.getStructuredClassifier());
		templateSignatureEClass.getESuperTypes().add(this.getElement());
		templateParameterEClass.getESuperTypes().add(this.getElement());
		templateableElementEClass.getESuperTypes().add(this.getElement());
		stringExpressionEClass.getESuperTypes().add(this.getTemplateableElement());
		parameterableElementEClass.getESuperTypes().add(this.getElement());
		templateBindingEClass.getESuperTypes().add(this.getDirectedRelationship());
		templateParameterSubstitutionEClass.getESuperTypes().add(this.getElement());
		operationTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
		classifierTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
		parameterableClassifierEClass.getESuperTypes().add(this.getClassifier());
		redefinableTemplateSignatureEClass.getESuperTypes().add(this.getRedefinableElement());
		redefinableTemplateSignatureEClass.getESuperTypes().add(this.getTemplateSignature());
		templateableClassifierEClass.getESuperTypes().add(this.getClassifier());
		connectableElementTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
		callTriggerEClass.getESuperTypes().add(this.getMessageTrigger());
		messageTriggerEClass.getESuperTypes().add(this.getTrigger());
		changeTriggerEClass.getESuperTypes().add(this.getTrigger());
		triggerEClass.getESuperTypes().add(this.getNamedElement());
		receptionEClass.getESuperTypes().add(this.getBehavioralFeature());
		signalEClass.getESuperTypes().add(this.getClassifier());
		signalTriggerEClass.getESuperTypes().add(this.getMessageTrigger());
		timeTriggerEClass.getESuperTypes().add(this.getTrigger());
		anyTriggerEClass.getESuperTypes().add(this.getMessageTrigger());
		createObjectActionEClass.getESuperTypes().add(this.getAction());
		destroyObjectActionEClass.getESuperTypes().add(this.getAction());
		testIdentityActionEClass.getESuperTypes().add(this.getAction());
		readSelfActionEClass.getESuperTypes().add(this.getAction());
		structuralFeatureActionEClass.getESuperTypes().add(this.getAction());
		readStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		writeStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		clearStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		removeStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		addStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		linkActionEClass.getESuperTypes().add(this.getAction());
		linkEndDataEClass.getESuperTypes().add(this.getElement());
		readLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		linkEndCreationDataEClass.getESuperTypes().add(this.getLinkEndData());
		createLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		writeLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		destroyLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		clearAssociationActionEClass.getESuperTypes().add(this.getAction());
		variableActionEClass.getESuperTypes().add(this.getAction());
		readVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		writeVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		clearVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		addVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		removeVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		applyFunctionActionEClass.getESuperTypes().add(this.getAction());
		primitiveFunctionEClass.getESuperTypes().add(this.getPackageableElement());
		callActionEClass.getESuperTypes().add(this.getInvocationAction());
		invocationActionEClass.getESuperTypes().add(this.getAction());
		sendSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		broadcastSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		sendObjectActionEClass.getESuperTypes().add(this.getInvocationAction());
		callOperationActionEClass.getESuperTypes().add(this.getCallAction());
		callBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		stateMachineEClass.getESuperTypes().add(this.getBehavior());
		regionEClass.getESuperTypes().add(this.getNamespace());
		regionEClass.getESuperTypes().add(this.getRedefinableElement());
		pseudostateEClass.getESuperTypes().add(this.getVertex());
		stateEClass.getESuperTypes().add(this.getNamespace());
		stateEClass.getESuperTypes().add(this.getRedefinableElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		vertexEClass.getESuperTypes().add(this.getNamedElement());
		connectionPointReferenceEClass.getESuperTypes().add(this.getVertex());
		transitionEClass.getESuperTypes().add(this.getRedefinableElement());
		finalStateEClass.getESuperTypes().add(this.getState());
		interactionOccurrenceEClass.getESuperTypes().add(this.getInteractionFragment());
		gateEClass.getESuperTypes().add(this.getMessageEnd());
		partDecompositionEClass.getESuperTypes().add(this.getInteractionOccurrence());
		interactionOperandEClass.getESuperTypes().add(this.getNamespace());
		interactionOperandEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionConstraintEClass.getESuperTypes().add(this.getConstraint());
		combinedFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		continuationEClass.getESuperTypes().add(this.getInteractionFragment());
		expansionNodeEClass.getESuperTypes().add(this.getObjectNode());
		expansionRegionEClass.getESuperTypes().add(this.getStructuredActivityNode());
		exceptionHandlerEClass.getESuperTypes().add(this.getElement());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		flowFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		centralBufferNodeEClass.getESuperTypes().add(this.getObjectNode());
		activityPartitionEClass.getESuperTypes().add(this.getNamedElement());
		activityPartitionEClass.getESuperTypes().add(this.getActivityGroup());
		readExtentActionEClass.getESuperTypes().add(this.getAction());
		reclassifyObjectActionEClass.getESuperTypes().add(this.getAction());
		readIsClassifiedObjectActionEClass.getESuperTypes().add(this.getAction());
		startOwnedBehaviorActionEClass.getESuperTypes().add(this.getAction());
		qualifierValueEClass.getESuperTypes().add(this.getElement());
		readLinkObjectEndActionEClass.getESuperTypes().add(this.getAction());
		readLinkObjectEndQualifierActionEClass.getESuperTypes().add(this.getAction());
		createLinkObjectActionEClass.getESuperTypes().add(this.getCreateLinkAction());
		acceptEventActionEClass.getESuperTypes().add(this.getAction());
		acceptCallActionEClass.getESuperTypes().add(this.getAcceptEventAction());
		replyActionEClass.getESuperTypes().add(this.getAction());
		raiseExceptionActionEClass.getESuperTypes().add(this.getAction());
		dataStoreNodeEClass.getESuperTypes().add(this.getCentralBufferNode());
		interruptibleActivityRegionEClass.getESuperTypes().add(this.getActivityGroup());
		parameterSetEClass.getESuperTypes().add(this.getNamedElement());
		deploymentEClass.getESuperTypes().add(this.getDependency());
		deployedArtifactEClass.getESuperTypes().add(this.getNamedElement());
		deploymentTargetEClass.getESuperTypes().add(this.getNamedElement());
		nodeEClass.getESuperTypes().add(this.getClass_());
		nodeEClass.getESuperTypes().add(this.getDeploymentTarget());
		deviceEClass.getESuperTypes().add(this.getNode());
		executionEnvironmentEClass.getESuperTypes().add(this.getNode());
		communicationPathEClass.getESuperTypes().add(this.getAssociation());
		timeExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		durationEClass.getESuperTypes().add(this.getValueSpecification());
		timeObservationActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		durationIntervalEClass.getESuperTypes().add(this.getInterval());
		intervalEClass.getESuperTypes().add(this.getValueSpecification());
		timeConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		intervalConstraintEClass.getESuperTypes().add(this.getConstraint());
		timeIntervalEClass.getESuperTypes().add(this.getInterval());
		durationObservationActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		durationConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		protocolConformanceEClass.getESuperTypes().add(this.getDirectedRelationship());
		protocolStateMachineEClass.getESuperTypes().add(this.getStateMachine());
		protocolTransitionEClass.getESuperTypes().add(this.getTransition());
		componentEClass.getESuperTypes().add(this.getClass_());
		deploymentSpecificationEClass.getESuperTypes().add(this.getArtifact());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(elementEClass, this.getBoolean(), "validateNotOwnSelf"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(elementEClass, this.getBoolean(), "validateHasOwner"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(elementEClass, this.getSet(), "allOwnedElements"); //$NON-NLS-1$

		addEOperation(elementEClass, this.getBoolean(), "mustBeOwned"); //$NON-NLS-1$

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getMultiplicityElement_IsOrdered(), this.getBoolean(), "isOrdered", "false", 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMultiplicityElement_IsUnique(), this.getBoolean(), "isUnique", "true", 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMultiplicityElement_Lower(), this.getInteger(), "lower", "1", 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMultiplicityElement_Upper(), this.getUnlimitedNatural(), "upper", "1", 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getMultiplicityElement_UpperValue(), this.getValueSpecification(), null, "upperValue", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMultiplicityElement_LowerValue(), this.getValueSpecification(), null, "lowerValue", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(multiplicityElementEClass, this.getInteger(), "lowerBound"); //$NON-NLS-1$

		addEOperation(multiplicityElementEClass, this.getUnlimitedNatural(), "upperBound"); //$NON-NLS-1$

		addEOperation(multiplicityElementEClass, this.getBoolean(), "isMultivalued"); //$NON-NLS-1$

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "includesCardinality"); //$NON-NLS-1$
		addEParameter(op, this.getInteger(), "C"); //$NON-NLS-1$

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "includesMultiplicity"); //$NON-NLS-1$
		addEParameter(op, this.getMultiplicityElement(), "M"); //$NON-NLS-1$

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "validateUpperGt0"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "validateLowerGe0"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "validateUpperGeLower"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "validateLowerEqLowerbound"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "validateUpperEqUpperbound"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(multiplicityElementEClass, this.getInteger(), "lower"); //$NON-NLS-1$

		addEOperation(multiplicityElementEClass, this.getUnlimitedNatural(), "upper"); //$NON-NLS-1$

		addEOperation(multiplicityElementEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getOpaqueExpression_Body(), this.getString(), "body", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOpaqueExpression_Language(), this.getString(), "language", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getOpaqueExpression_Result(), this.getParameter(), null, "result", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOpaqueExpression_Behavior(), this.getBehavior(), null, "behavior", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getInteger(), "integerValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getBoolean(), "booleanValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getString(), "stringValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getUnlimitedNatural(), "unlimitedValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getBoolean(), "isNull"); //$NON-NLS-1$

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getExpression_Symbol(), this.getString(), "symbol", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getExpression_Operand(), this.getValueSpecification(), null, "operand", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(expressionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(directedRelationshipEClass, ecorePackage.getEEList(), "getRelatedElements"); //$NON-NLS-1$

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getComment_Body(), this.getString(), "body", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getComment_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComment_BodyExpression(), this.getStringExpression(), null, "bodyExpression", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(commentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(classEClass, org.eclipse.uml2.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getClass_OwnedOperation(), this.getOperation(), this.getOperation_Class_(), "ownedOperation", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_Extension(), this.getExtension(), this.getExtension_Metaclass(), "extension", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getClass_IsActive(), this.getBoolean(), "isActive", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(classEClass, this.getSet(), "inherit"); //$NON-NLS-1$
		addEParameter(op, this.getSet(), "inhs"); //$NON-NLS-1$

		addEOperation(classEClass, this.getBoolean(), "isAbstract"); //$NON-NLS-1$

		op = addEOperation(classEClass, null, "setIsAbstract"); //$NON-NLS-1$
		addEParameter(op, this.getBoolean(), "newIsAbstract"); //$NON-NLS-1$

		addEOperation(classEClass, ecorePackage.getEEList(), "getOwnedAttributes"); //$NON-NLS-1$

		addEOperation(classEClass, ecorePackage.getEEList(), "getGenerals"); //$NON-NLS-1$

		addEOperation(classEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(classEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(classEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getType_Package(), this.getPackage(), this.getPackage_OwnedType(), "package", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(typeEClass, this.getBoolean(), "conformsTo"); //$NON-NLS-1$
		addEParameter(op, this.getType(), "other"); //$NON-NLS-1$

		addEOperation(typeEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getProperty_Default(), this.getString(), "default", "", 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProperty_IsComposite(), this.getBoolean(), "isComposite", "false", 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProperty_IsDerived(), this.getBoolean(), "isDerived", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getProperty_Class_(), this.getClass_(), null, "class_", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Opposite(), this.getProperty(), null, "opposite", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProperty_IsDerivedUnion(), this.getBoolean(), "isDerivedUnion", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getProperty_OwningAssociation(), this.getAssociation(), this.getAssociation_OwnedEnd(), "owningAssociation", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_RedefinedProperty(), this.getProperty(), null, "redefinedProperty", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_SubsettedProperty(), this.getProperty(), null, "subsettedProperty", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Datatype(), this.getDataType(), this.getDataType_OwnedAttribute(), "datatype", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Association(), this.getAssociation(), this.getAssociation_MemberEnd(), "association", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProperty_Aggregation(), this.getAggregationKind(), "aggregation", "none", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getProperty_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Qualifier(), this.getProperty(), this.getProperty_AssociationEnd(), "qualifier", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_AssociationEnd(), this.getProperty(), this.getProperty_Qualifier(), "associationEnd", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "validateOppositeIsOtherEnd"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(propertyEClass, this.getProperty(), "opposite"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "validateMultiplicityOfComposite"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "validateSubsettingContext"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "validateNavigablePropertyRedefinition"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "validateSubsettingRules"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "validateNavigableReadonly"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "validateDerivedUnionIsDerived"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, this.getBoolean(), "isConsistentWith"); //$NON-NLS-1$
		addEParameter(op, this.getRedefinableElement(), "redefinee"); //$NON-NLS-1$

		addEOperation(propertyEClass, this.getSet(), "subsettingContext"); //$NON-NLS-1$

		addEOperation(propertyEClass, this.getBoolean(), "isReadOnly"); //$NON-NLS-1$

		op = addEOperation(propertyEClass, null, "setIsReadOnly"); //$NON-NLS-1$
		addEParameter(op, this.getBoolean(), "newIsReadOnly"); //$NON-NLS-1$

		addEOperation(propertyEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(propertyEClass, ecorePackage.getEEList(), "getFeaturingClassifiers"); //$NON-NLS-1$

		addEOperation(propertyEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(propertyEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(propertyEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getOperation_OwnedParameter(), this.getParameter(), this.getParameter_Operation(), "ownedParameter", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_Class_(), this.getClass_(), this.getClass_OwnedOperation(), "class_", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOperation_IsQuery(), this.getBoolean(), "isQuery", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getOperation_Datatype(), this.getDataType(), this.getDataType_OwnedOperation(), "datatype", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_RedefinedOperation(), this.getOperation(), null, "redefinedOperation", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_BodyCondition(), this.getConstraint(), null, "bodyCondition", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(operationEClass, this.getBoolean(), "validateTypeOfResult"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getBoolean(), "isOrdered"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getBoolean(), "isUnique"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getInteger(), "lower"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getUnlimitedNatural(), "upper"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getClassifier(), "type"); //$NON-NLS-1$

		op = addEOperation(operationEClass, this.getBoolean(), "validateOnlyBodyForQuery"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(operationEClass, this.getBoolean(), "isConsistentWith"); //$NON-NLS-1$
		addEParameter(op, this.getRedefinableElement(), "redefinee"); //$NON-NLS-1$

		addEOperation(operationEClass, ecorePackage.getEEList(), "getRaisedExceptions"); //$NON-NLS-1$

		op = addEOperation(operationEClass, null, "setIsOrdered"); //$NON-NLS-1$
		addEParameter(op, this.getBoolean(), "newIsOrdered"); //$NON-NLS-1$

		op = addEOperation(operationEClass, null, "setIsUnique"); //$NON-NLS-1$
		addEParameter(op, this.getBoolean(), "newIsUnique"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getInteger(), "getLower"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getUnlimitedNatural(), "getUpper"); //$NON-NLS-1$

		addEOperation(operationEClass, ecorePackage.getEEList(), "getFormalParameters"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getType(), "getType"); //$NON-NLS-1$

		op = addEOperation(operationEClass, null, "setType"); //$NON-NLS-1$
		addEParameter(op, this.getType(), "newType"); //$NON-NLS-1$

		addEOperation(operationEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(operationEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(operationEClass, ecorePackage.getEEList(), "getFeaturingClassifiers"); //$NON-NLS-1$

		addEOperation(operationEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(operationEClass, ecorePackage.getEEList(), "getOwnedRules"); //$NON-NLS-1$

		addEOperation(operationEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getParameter_Operation(), this.getOperation(), this.getOperation_OwnedParameter(), "operation", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParameter_Default(), this.getString(), "default", "", 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getParameter_Direction(), this.getParameterDirectionKind(), "direction", "in", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getParameter_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParameter_IsException(), this.getBoolean(), "isException", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getParameter_IsStream(), this.getBoolean(), "isStream", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getParameter_Effect(), this.getParameterEffectKind(), "effect", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParameter_ParameterSet(), this.getParameterSet(), this.getParameterSet_Parameter(), "parameterSet", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(parameterEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(parameterEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getNamedElement_Name(), this.getString(), "name", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getNamedElement_QualifiedName(), this.getString(), "qualifiedName", "", 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getNamedElement_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamedElement_ClientDependency(), this.getDependency(), this.getDependency_Client(), "clientDependency", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamedElement_NameExpression(), this.getStringExpression(), null, "nameExpression", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(namedElementEClass, this.getBoolean(), "validateNoName"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(namedElementEClass, this.getBoolean(), "validateQualifiedName"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(namedElementEClass, this.getSequence(), "allNamespaces"); //$NON-NLS-1$

		op = addEOperation(namedElementEClass, this.getBoolean(), "isDistinguishableFrom"); //$NON-NLS-1$
		addEParameter(op, this.getNamedElement(), "n"); //$NON-NLS-1$
		addEParameter(op, this.getNamespace(), "ns"); //$NON-NLS-1$

		addEOperation(namedElementEClass, this.getString(), "separator"); //$NON-NLS-1$

		addEOperation(namedElementEClass, this.getString(), "qualifiedName"); //$NON-NLS-1$

		op = addEOperation(namedElementEClass, this.getBoolean(), "validateVisibilityNeedsOwnership"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(namedElementEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(namedElementEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(namedElementEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(packageEClass, org.eclipse.uml2.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(), "nestedPackage", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(), "nestingPackage", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_OwnedType(), this.getType(), this.getType_Package(), "ownedType", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_OwnedMember(), this.getPackageableElement(), null, "ownedMember", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_PackageMerge(), this.getPackageMerge(), this.getPackageMerge_MergingPackage(), "packageMerge", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_AppliedProfile(), this.getProfileApplication(), null, "appliedProfile", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_PackageExtension(), this.getPackageMerge(), null, "packageExtension", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(packageEClass, this.getBoolean(), "validateElementsPublicOrPrivate"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(packageEClass, this.getBoolean(), "mustBeOwned"); //$NON-NLS-1$

		addEOperation(packageEClass, this.getSet(), "visibleMembers"); //$NON-NLS-1$

		op = addEOperation(packageEClass, this.getBoolean(), "makesVisible"); //$NON-NLS-1$
		addEParameter(op, this.getNamedElement(), "el"); //$NON-NLS-1$

		addEOperation(packageEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(packageEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(packageEClass, ecorePackage.getEEList(), "getPackageImports"); //$NON-NLS-1$

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(enumerationEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getDataType_OwnedAttribute(), this.getProperty(), this.getProperty_Datatype(), "ownedAttribute", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataType_OwnedOperation(), this.getOperation(), this.getOperation_Datatype(), "ownedOperation", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(dataTypeEClass, this.getSet(), "inherit"); //$NON-NLS-1$
		addEParameter(op, this.getSet(), "inhs"); //$NON-NLS-1$

		addEOperation(dataTypeEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(dataTypeEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(dataTypeEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_OwnedLiteral(), "enumeration", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(enumerationLiteralEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_OwnedRule(), this.getConstraint(), this.getConstraint_Namespace(), "ownedRule", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_ImportedMember(), this.getPackageableElement(), null, "importedMember", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_ElementImport(), this.getElementImport(), this.getElementImport_ImportingNamespace(), "elementImport", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_PackageImport(), this.getPackageImport(), this.getPackageImport_ImportingNamespace(), "packageImport", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(namespaceEClass, this.getBoolean(), "validateMembersAreDistinguishable"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(namespaceEClass, this.getSet(), "getNamesOfMember"); //$NON-NLS-1$
		addEParameter(op, this.getNamedElement(), "element"); //$NON-NLS-1$

		addEOperation(namespaceEClass, this.getBoolean(), "membersAreDistinguishable"); //$NON-NLS-1$

		op = addEOperation(namespaceEClass, this.getBoolean(), "validateImportedMemberDerived"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(namespaceEClass, this.getSet(), "importedMember"); //$NON-NLS-1$

		op = addEOperation(namespaceEClass, this.getSet(), "importMembers"); //$NON-NLS-1$
		addEParameter(op, this.getSet(), "imps"); //$NON-NLS-1$

		op = addEOperation(namespaceEClass, this.getSet(), "excludeCollisions"); //$NON-NLS-1$
		addEParameter(op, this.getSet(), "imps"); //$NON-NLS-1$

		addEOperation(namespaceEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(namespaceEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getLiteralBoolean_Value(), this.getBoolean(), "value", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(literalBooleanEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalBooleanEClass, this.getBoolean(), "booleanValue"); //$NON-NLS-1$

		initEClass(literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getLiteralString_Value(), this.getString(), "value", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(literalStringEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalStringEClass, this.getString(), "stringValue"); //$NON-NLS-1$

		initEClass(literalNullEClass, LiteralNull.class, "LiteralNull", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(literalNullEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalNullEClass, this.getBoolean(), "isNull"); //$NON-NLS-1$

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getLiteralInteger_Value(), this.getInteger(), "value", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(literalIntegerEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalIntegerEClass, this.getInteger(), "integerValue"); //$NON-NLS-1$

		initEClass(literalUnlimitedNaturalEClass, LiteralUnlimitedNatural.class, "LiteralUnlimitedNatural", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getLiteralUnlimitedNatural_Value(), this.getUnlimitedNatural(), "value", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(literalUnlimitedNaturalEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalUnlimitedNaturalEClass, this.getUnlimitedNatural(), "unlimitedValue"); //$NON-NLS-1$

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getClassifier_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(), "feature", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getClassifier_IsAbstract(), this.getBoolean(), "isAbstract", "false", 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getClassifier_InheritedMember(), this.getNamedElement(), null, "inheritedMember", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(), "generalization", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_RedefinedClassifier(), this.getClassifier(), null, "redefinedClassifier", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Substitution(), this.getSubstitution(), this.getSubstitution_SubstitutingClassifier(), "substitution", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_PowertypeExtent(), this.getGeneralizationSet(), this.getGeneralizationSet_Powertype(), "powertypeExtent", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_OwnedUseCase(), this.getUseCase(), null, "ownedUseCase", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_UseCase(), this.getUseCase(), this.getUseCase_Subject(), "useCase", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Representation(), this.getCollaborationOccurrence(), null, "representation", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Occurrence(), this.getCollaborationOccurrence(), null, "occurrence", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(classifierEClass, this.getSet(), "allFeatures"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getBoolean(), "validateNoCyclesInGeneralization"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getBoolean(), "validateSpecializeType"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getBoolean(), "validateInheritedMember"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(classifierEClass, this.getSet(), "inheritedMember"); //$NON-NLS-1$

		addEOperation(classifierEClass, this.getSet(), "parents"); //$NON-NLS-1$

		addEOperation(classifierEClass, this.getSet(), "allParents"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getSet(), "inheritableMembers"); //$NON-NLS-1$
		addEParameter(op, this.getClassifier(), "c"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getBoolean(), "hasVisibilityOf"); //$NON-NLS-1$
		addEParameter(op, this.getNamedElement(), "n"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getSet(), "inherit"); //$NON-NLS-1$
		addEParameter(op, this.getSet(), "inhs"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getBoolean(), "maySpecializeType"); //$NON-NLS-1$
		addEParameter(op, this.getClassifier(), "c"); //$NON-NLS-1$

		addEOperation(classifierEClass, this.getSet(), "general"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getBoolean(), "validateGeneralEqualsParents"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(classifierEClass, this.getBoolean(), "conformsTo"); //$NON-NLS-1$
		addEParameter(op, this.getClassifier(), "other"); //$NON-NLS-1$

		addEOperation(classifierEClass, ecorePackage.getEEList(), "getMembers"); //$NON-NLS-1$

		addEOperation(classifierEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(classifierEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(classifierEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		addEOperation(classifierEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getFeature_FeaturingClassifier(), this.getClassifier(), this.getClassifier_Feature(), "featuringClassifier", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFeature_IsStatic(), this.getBoolean(), "isStatic", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getConstraint_Context(), this.getNamespace(), null, "context", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstraint_Namespace(), this.getNamespace(), this.getNamespace_OwnedRule(), "namespace", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstraint_Specification(), this.getValueSpecification(), null, "specification", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstraint_ConstrainedElement(), this.getElement(), null, "constrainedElement", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(constraintEClass, this.getBoolean(), "validateNotApplyToSelf"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(constraintEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getBehavioralFeature_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_FormalParameter(), this.getParameter(), null, "formalParameter", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_ReturnResult(), this.getParameter(), null, "returnResult", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_RaisedException(), this.getType(), null, "raisedException", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBehavioralFeature_IsAbstract(), this.getBoolean(), "isAbstract", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_Method(), this.getBehavior(), this.getBehavior_Specification(), "method", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBehavioralFeature_Concurrency(), this.getCallConcurrencyKind(), "concurrency", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(behavioralFeatureEClass, this.getBoolean(), "isDistinguishableFrom"); //$NON-NLS-1$
		addEParameter(op, this.getNamedElement(), "n"); //$NON-NLS-1$
		addEParameter(op, this.getNamespace(), "ns"); //$NON-NLS-1$

		addEOperation(behavioralFeatureEClass, ecorePackage.getEEList(), "getMembers"); //$NON-NLS-1$

		addEOperation(behavioralFeatureEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getStructuralFeature_IsReadOnly(), this.getBoolean(), "isReadOnly", "false", 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(redefinableElementEClass, RedefinableElement.class, "RedefinableElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getRedefinableElement_RedefinitionContext(), this.getClassifier(), null, "redefinitionContext", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRedefinableElement_IsLeaf(), this.getBoolean(), "isLeaf", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = addEOperation(redefinableElementEClass, this.getBoolean(), "validateRedefinitionContextValid"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(redefinableElementEClass, this.getBoolean(), "validateRedefinitionConsistent"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(redefinableElementEClass, this.getBoolean(), "isConsistentWith"); //$NON-NLS-1$
		addEParameter(op, this.getRedefinableElement(), "redefinee"); //$NON-NLS-1$

		op = addEOperation(redefinableElementEClass, this.getBoolean(), "isRedefinitionContextValid"); //$NON-NLS-1$
		addEParameter(op, this.getRedefinableElement(), "redefinable"); //$NON-NLS-1$

		addEOperation(redefinableElementEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getGeneralization_Specific(), this.getClassifier(), this.getClassifier_Generalization(), "specific", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGeneralization_IsSubstitutable(), this.getBoolean(), "isSubstitutable", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralization_GeneralizationSet(), this.getGeneralizationSet(), this.getGeneralizationSet_Generalization(), "generalizationSet", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(generalizationEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(generalizationEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(generalizationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(instanceSpecificationEClass, InstanceSpecification.class, "InstanceSpecification", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInstanceSpecification_Slot(), this.getSlot(), this.getSlot_OwningInstance(), "slot", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInstanceSpecification_Classifier(), this.getClassifier(), null, "classifier", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInstanceSpecification_Specification(), this.getValueSpecification(), null, "specification", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(instanceSpecificationEClass, this.getBoolean(), "validateSlotsAreDefined"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(instanceSpecificationEClass, this.getBoolean(), "validateNoDuplicateSlots"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(instanceSpecificationEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getSlot_OwningInstance(), this.getInstanceSpecification(), this.getInstanceSpecification_Slot(), "owningInstance", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSlot_Value(), this.getValueSpecification(), null, "value", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSlot_DefiningFeature(), this.getStructuralFeature(), null, "definingFeature", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(slotEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(slotEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(instanceValueEClass, InstanceValue.class, "InstanceValue", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInstanceValue_Instance(), this.getInstanceSpecification(), null, "instance", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getPackageableElement_PackageableElement_visibility(), this.getVisibilityKind(), "packageableElement_visibility", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(packageableElementEClass, this.getVisibilityKind(), "getVisibility"); //$NON-NLS-1$

		op = addEOperation(packageableElementEClass, null, "setVisibility"); //$NON-NLS-1$
		addEParameter(op, this.getVisibilityKind(), "newVisibility"); //$NON-NLS-1$

		initEClass(elementImportEClass, ElementImport.class, "ElementImport", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getElementImport_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getElementImport_Alias(), this.getString(), "alias", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getElementImport_ImportedElement(), this.getPackageableElement(), null, "importedElement", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getElementImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_ElementImport(), "importingNamespace", null, 1, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(elementImportEClass, this.getBoolean(), "validateVisibilityPublicOrPrivate"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(elementImportEClass, this.getBoolean(), "validateImportedElementIsPublic"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(elementImportEClass, this.getString(), "getName"); //$NON-NLS-1$

		addEOperation(elementImportEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(elementImportEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(elementImportEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getPackageImport_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackageImport_ImportedPackage(), this.getPackage(), null, "importedPackage", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackageImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_PackageImport(), "importingNamespace", null, 1, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(packageImportEClass, this.getBoolean(), "validatePublicOrPrivate"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(packageImportEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(packageImportEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(packageImportEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getAssociation_IsDerived(), this.getBoolean(), "isDerived", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAssociation_OwnedEnd(), this.getProperty(), this.getProperty_OwningAssociation(), "ownedEnd", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssociation_EndType(), this.getType(), null, "endType", null, 1, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssociation_MemberEnd(), this.getProperty(), this.getProperty_Association(), "memberEnd", null, 2, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getRelatedElements"); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getMembers"); //$NON-NLS-1$

		initEClass(packageMergeEClass, PackageMerge.class, "PackageMerge", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getPackageMerge_MergingPackage(), this.getPackage(), this.getPackage_PackageMerge(), "mergingPackage", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackageMerge_MergedPackage(), this.getPackage(), null, "mergedPackage", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(packageMergeEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(packageMergeEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(packageMergeEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(stereotypeEClass, Stereotype.class, "Stereotype", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getProfile_OwnedStereotype(), this.getStereotype(), null, "ownedStereotype", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProfile_MetaclassReference(), this.getElementImport(), null, "metaclassReference", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProfile_MetamodelReference(), this.getPackageImport(), null, "metamodelReference", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(profileEClass, ecorePackage.getEEList(), "getElementImports"); //$NON-NLS-1$

		addEOperation(profileEClass, ecorePackage.getEEList(), "getPackageImports"); //$NON-NLS-1$

		initEClass(profileApplicationEClass, ProfileApplication.class, "ProfileApplication", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getProfileApplication_ImportedProfile(), this.getProfile(), null, "importedProfile", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(profileApplicationEClass, null, "setImportedPackage"); //$NON-NLS-1$
		addEParameter(op, this.getPackage(), "newImportedPackage"); //$NON-NLS-1$

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getExtension_IsRequired(), this.getBoolean(), "isRequired", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtension_Metaclass(), this.getClass_(), this.getClass_Extension(), "metaclass", null, 1, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(extensionEClass, ecorePackage.getEEList(), "getOwnedEnds"); //$NON-NLS-1$

		initEClass(extensionEndEClass, ExtensionEnd.class, "ExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(extensionEndEClass, this.getType(), "getType"); //$NON-NLS-1$

		op = addEOperation(extensionEndEClass, null, "setType"); //$NON-NLS-1$
		addEParameter(op, this.getType(), "newType"); //$NON-NLS-1$

		initEClass(informationItemEClass, InformationItem.class, "InformationItem", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInformationItem_Represented(), this.getClassifier(), null, "represented", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(informationFlowEClass, InformationFlow.class, "InformationFlow", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInformationFlow_Realization(), this.getRelationship(), null, "realization", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInformationFlow_Conveyed(), this.getClassifier(), null, "conveyed", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getBehavior_IsReentrant(), this.getBoolean(), "isReentrant", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Context(), this.getBehavioredClassifier(), this.getBehavioredClassifier_OwnedBehavior(), "context", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_RedefinedBehavior(), this.getBehavior(), null, "redefinedBehavior", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Specification(), this.getBehavioralFeature(), this.getBehavioralFeature_Method(), "specification", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_FormalParameter(), this.getParameter(), null, "formalParameter", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_ReturnResult(), this.getParameter(), null, "returnResult", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_OwnedParameterSet(), this.getParameterSet(), null, "ownedParameterSet", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(behaviorEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(behaviorEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(behaviorEClass, ecorePackage.getEEList(), "getOwnedRules"); //$NON-NLS-1$

		initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_OwnedBehavior(), this.getBehavior(), this.getBehavior_Context(), "ownedBehavior", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_ClassifierBehavior(), this.getBehavior(), null, "classifierBehavior", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_Implementation(), this.getImplementation(), this.getImplementation_ImplementingClassifier(), "implementation", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_OwnedTrigger(), this.getTrigger(), null, "ownedTrigger", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_OwnedStateMachine(), this.getStateMachine(), this.getStateMachine_StateMachine_redefinitionContext(), "ownedStateMachine", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(behavioredClassifierEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(behavioredClassifierEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(behavioredClassifierEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getActivity_Body(), this.getString(), "body", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getActivity_Language(), this.getString(), "language", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getActivity_Edge(), this.getActivityEdge(), this.getActivityEdge_Activity(), "edge", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Group(), this.getActivityGroup(), this.getActivityGroup_ActivityGroup_activity(), "group", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Node(), this.getActivityNode(), this.getActivityNode_Activity(), "node", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Action(), this.getAction(), null, "action", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_StructuredNode(), this.getStructuredActivityNode(), null, "structuredNode", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getActivity_IsSingleExecution(), this.getBoolean(), "isSingleExecution", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getActivity_IsReadOnly(), this.getBoolean(), "isReadOnly", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(activityEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getDependency_Client(), this.getNamedElement(), this.getNamedElement_ClientDependency(), "client", null, 1, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDependency_Supplier(), this.getNamedElement(), null, "supplier", null, 1, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getAbstraction_Mapping(), this.getOpaqueExpression(), null, "mapping", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(abstractionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getRealization_Abstraction(), this.getComponent(), this.getComponent_Realization(), "abstraction", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRealization_RealizingClassifier(), this.getClassifier(), null, "realizingClassifier", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(realizationEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getSubstitution_Contract(), this.getClassifier(), null, "contract", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSubstitution_SubstitutingClassifier(), this.getClassifier(), this.getClassifier_Substitution(), "substitutingClassifier", null, 1, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		initEClass(associationClassEClass, AssociationClass.class, "AssociationClass", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getModel_Viewpoint(), this.getString(), "viewpoint", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getGeneralizationSet_IsCovering(), this.getBoolean(), "isCovering", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGeneralizationSet_IsDisjoint(), this.getBoolean(), "isDisjoint", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralizationSet_Powertype(), this.getClassifier(), this.getClassifier_PowertypeExtent(), "powertype", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralizationSet_Generalization(), this.getGeneralization(), this.getGeneralization_GeneralizationSet(), "generalization", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(extendEClass, Extend.class, "Extend", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getExtend_ExtendedCase(), this.getUseCase(), null, "extendedCase", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtend_Extension(), this.getUseCase(), this.getUseCase_Extend(), "extension", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtend_Condition(), this.getConstraint(), null, "condition", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtend_ExtensionLocation(), this.getExtensionPoint(), null, "extensionLocation", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(extendEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(extendEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(extendEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getUseCase_Include(), this.getInclude(), this.getInclude_IncludingCase(), "include", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getUseCase_Extend(), this.getExtend(), this.getExtend_Extension(), "extend", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getUseCase_ExtensionPoint(), this.getExtensionPoint(), this.getExtensionPoint_UseCase(), "extensionPoint", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getUseCase_Subject(), this.getClassifier(), this.getClassifier_UseCase(), "subject", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(useCaseEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(extensionPointEClass, ExtensionPoint.class, "ExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getExtensionPoint_UseCase(), this.getUseCase(), this.getUseCase_ExtensionPoint(), "useCase", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInclude_IncludingCase(), this.getUseCase(), this.getUseCase_Include(), "includingCase", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInclude_Addition(), this.getUseCase(), null, "addition", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(includeEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(includeEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getArtifact_FileName(), this.getString(), "fileName", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getArtifact_NestedArtifact(), this.getArtifact(), null, "nestedArtifact", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArtifact_Manifestation(), this.getManifestation(), null, "manifestation", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArtifact_OwnedOperation(), this.getOperation(), null, "ownedOperation", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArtifact_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		initEClass(manifestationEClass, Manifestation.class, "Manifestation", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getManifestation_UtilizedElement(), this.getPackageableElement(), null, "utilizedElement", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(manifestationEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(manifestationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(connectorEndEClass, ConnectorEnd.class, "ConnectorEnd", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getConnectorEnd_DefiningEnd(), this.getProperty(), null, "definingEnd", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnectorEnd_Role(), this.getConnectableElement(), this.getConnectableElement_End(), "role", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnectorEnd_PartWithPort(), this.getProperty(), null, "partWithPort", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(connectableElementEClass, ConnectableElement.class, "ConnectableElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getConnectableElement_End(), this.getConnectorEnd(), this.getConnectorEnd_Role(), "end", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getConnector_Type(), this.getAssociation(), null, "type", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnector_RedefinedConnector(), this.getConnector(), null, "redefinedConnector", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnector_End(), this.getConnectorEnd(), null, "end", null, 2, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConnector_Kind(), this.getConnectorKind(), "kind", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnector_Contract(), this.getBehavior(), null, "contract", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(connectorEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(connectorEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(structuredClassifierEClass, StructuredClassifier.class, "StructuredClassifier", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getStructuredClassifier_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredClassifier_Part(), this.getProperty(), null, "part", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredClassifier_Role(), this.getConnectableElement(), null, "role", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredClassifier_OwnedConnector(), this.getConnector(), null, "ownedConnector", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getMembers"); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getActivityEdge_Activity(), this.getActivity(), this.getActivity_Edge(), "activity", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_InGroup(), this.getActivityGroup(), null, "inGroup", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Guard(), this.getValueSpecification(), null, "guard", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_RedefinedElement(), this.getActivityEdge(), null, "redefinedElement", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_InStructuredNode(), this.getStructuredActivityNode(), this.getStructuredActivityNode_ContainedEdge(), "inStructuredNode", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_InPartition(), this.getActivityPartition(), this.getActivityPartition_ContainedEdge(), "inPartition", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Weight(), this.getValueSpecification(), null, "weight", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Interrupts(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_InterruptingEdge(), "interrupts", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityEdgeEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(activityEdgeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(activityGroupEClass, ActivityGroup.class, "ActivityGroup", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getActivityGroup_SuperGroup(), this.getActivityGroup(), null, "superGroup", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityGroup_ActivityGroup_activity(), this.getActivity(), this.getActivity_Group(), "activityGroup_activity", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getSubgroups"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getContainedEdges"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getContainedNodes"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, this.getActivity(), "getActivity"); //$NON-NLS-1$

		op = addEOperation(activityGroupEClass, null, "setActivity"); //$NON-NLS-1$
		addEParameter(op, this.getActivity(), "newActivity"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InGroup(), this.getActivityGroup(), null, "inGroup", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Node(), "activity", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_RedefinedElement(), this.getActivityNode(), null, "redefinedElement", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InStructuredNode(), this.getStructuredActivityNode(), this.getStructuredActivityNode_ContainedNode(), "inStructuredNode", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InPartition(), this.getActivityPartition(), this.getActivityPartition_ContainedNode(), "inPartition", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InInterruptibleRegion(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_ContainedNode(), "inInterruptibleRegion", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityNodeEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getAction_Effect(), this.getString(), "effect", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAction_Output(), this.getOutputPin(), null, "output", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_Input(), this.getInputPin(), null, "input", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_Context(), this.getClassifier(), null, "context", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_LocalPrecondition(), this.getConstraint(), null, "localPrecondition", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_LocalPostcondition(), this.getConstraint(), null, "localPostcondition", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(actionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getObjectNode_Ordering(), this.getObjectNodeOrderingKind(), "ordering", "FIFO", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getObjectNode_UpperBound(), this.getValueSpecification(), null, "upperBound", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getObjectNode_InState(), this.getState(), null, "inState", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getObjectNode_Selection(), this.getBehavior(), null, "selection", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(objectNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getObjectFlow_IsMulticast(), this.getBoolean(), "isMulticast", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getObjectFlow_IsMultireceive(), this.getBoolean(), "isMultireceive", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getObjectFlow_Transformation(), this.getBehavior(), null, "transformation", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getObjectFlow_Selection(), this.getBehavior(), null, "selection", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getDecisionNode_DecisionInput(), this.getBehavior(), null, "decisionInput", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getExecutableNode_Handler(), this.getExceptionHandler(), this.getExceptionHandler_ProtectedNode(), "handler", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(executableNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(activityParameterNodeEClass, ActivityParameterNode.class, "ActivityParameterNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getActivityParameterNode_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(valuePinEClass, ValuePin.class, "ValuePin", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getValuePin_Value(), this.getValueSpecification(), null, "value", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInterface_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_OwnedOperation(), this.getOperation(), null, "ownedOperation", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_RedefinedInterface(), this.getInterface(), null, "redefinedInterface", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_Protocol(), this.getProtocolStateMachine(), null, "protocol", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getImplementation_Contract(), this.getInterface(), null, "contract", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getImplementation_ImplementingClassifier(), this.getBehavioredClassifier(), this.getBehavioredClassifier_Implementation(), "implementingClassifier", null, 1, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getVariable_Scope(), this.getStructuredActivityNode(), this.getStructuredActivityNode_Variable(), "scope", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(variableEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getStructuredActivityNode_Variable(), this.getVariable(), this.getVariable_Scope(), "variable", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredActivityNode_ContainedNode(), this.getActivityNode(), this.getActivityNode_InStructuredNode(), "containedNode", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredActivityNode_ContainedEdge(), this.getActivityEdge(), this.getActivityEdge_InStructuredNode(), "containedEdge", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStructuredActivityNode_MustIsolate(), this.getBoolean(), "mustIsolate", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(structuredActivityNodeEClass, this.getActivity(), "getActivity"); //$NON-NLS-1$

		op = addEOperation(structuredActivityNodeEClass, null, "setActivity"); //$NON-NLS-1$
		addEParameter(op, this.getActivity(), "newActivity"); //$NON-NLS-1$

		addEOperation(structuredActivityNodeEClass, this.getActivity(), "getActivityGroup_activity"); //$NON-NLS-1$

		op = addEOperation(structuredActivityNodeEClass, null, "setActivityGroup_activity"); //$NON-NLS-1$
		addEParameter(op, this.getActivity(), "newActivityGroup_activity"); //$NON-NLS-1$

		addEOperation(structuredActivityNodeEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getConditionalNode_IsDeterminate(), this.getBoolean(), "isDeterminate", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConditionalNode_IsAssured(), this.getBoolean(), "isAssured", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConditionalNode_Clause(), this.getClause(), null, "clause", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConditionalNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(conditionalNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(conditionalNodeEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getClause_Test(), this.getActivityNode(), null, "test", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_Body(), this.getActivityNode(), null, "body", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_PredecessorClause(), this.getClause(), this.getClause_SuccessorClause(), "predecessorClause", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_SuccessorClause(), this.getClause(), this.getClause_PredecessorClause(), "successorClause", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(loopNodeEClass, LoopNode.class, "LoopNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getLoopNode_IsTestedFirst(), this.getBoolean(), "isTestedFirst", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_BodyPart(), this.getActivityNode(), null, "bodyPart", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_SetupPart(), this.getActivityNode(), null, "setupPart", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_Test(), this.getActivityNode(), null, "test", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_LoopVariable(), this.getOutputPin(), null, "loopVariable", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_LoopVariableInput(), this.getInputPin(), null, "loopVariableInput", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(loopNodeEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		addEOperation(loopNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(loopNodeEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(collaborationOccurrenceEClass, CollaborationOccurrence.class, "CollaborationOccurrence", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getCollaborationOccurrence_Type(), this.getCollaboration(), null, "type", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCollaborationOccurrence_RoleBinding(), this.getDependency(), null, "roleBinding", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(collaborationOccurrenceEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getCollaboration_CollaborationRole(), this.getConnectableElement(), null, "collaborationRole", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(collaborationEClass, ecorePackage.getEEList(), "getRoles"); //$NON-NLS-1$

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInteraction_Lifeline(), this.getLifeline(), this.getLifeline_Interaction(), "lifeline", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteraction_Message(), this.getMessage(), this.getMessage_Interaction(), "message", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteraction_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingInteraction(), "fragment", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteraction_FormalGate(), this.getGate(), null, "formalGate", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInteractionFragment_Covered(), this.getLifeline(), this.getLifeline_CoveredBy(), "covered", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionFragment_GeneralOrdering(), this.getGeneralOrdering(), null, "generalOrdering", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionFragment_EnclosingInteraction(), this.getInteraction(), this.getInteraction_Fragment(), "enclosingInteraction", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionFragment_EnclosingOperand(), this.getInteractionOperand(), this.getInteractionOperand_Fragment(), "enclosingOperand", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionFragmentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(interactionFragmentEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(), this.getInteractionFragment_Covered(), "coveredBy", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_Represents(), this.getConnectableElement(), null, "represents", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_Interaction(), this.getInteraction(), this.getInteraction_Lifeline(), "interaction", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_Selector(), this.getOpaqueExpression(), null, "selector", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_DecomposedAs(), this.getPartDecomposition(), null, "decomposedAs", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(lifelineEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(lifelineEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getMessage_MessageKind(), this.getMessageKind(), "messageKind", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMessage_MessageSort(), this.getMessageSort(), "messageSort", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), this.getMessageEnd_ReceiveMessage(), "receiveEvent", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_SendEvent(), this.getMessageEnd(), this.getMessageEnd_SendMessage(), "sendEvent", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Connector(), this.getConnector(), null, "connector", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Interaction(), this.getInteraction(), this.getInteraction_Message(), "interaction", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Signature(), this.getNamedElement(), null, "signature", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Argument(), this.getValueSpecification(), null, "argument", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(messageEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(messageEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(generalOrderingEClass, GeneralOrdering.class, "GeneralOrdering", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getGeneralOrdering_Before(), this.getEventOccurrence(), this.getEventOccurrence_ToAfter(), "before", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralOrdering_After(), this.getEventOccurrence(), this.getEventOccurrence_ToBefore(), "after", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageEndEClass, MessageEnd.class, "MessageEnd", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getMessageEnd_ReceiveMessage(), this.getMessage(), this.getMessage_ReceiveEvent(), "receiveMessage", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageEnd_SendMessage(), this.getMessage(), this.getMessage_SendEvent(), "sendMessage", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(eventOccurrenceEClass, EventOccurrence.class, "EventOccurrence", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getEventOccurrence_StartExec(), this.getExecutionOccurrence(), this.getExecutionOccurrence_Start(), "startExec", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventOccurrence_FinishExec(), this.getExecutionOccurrence(), this.getExecutionOccurrence_Finish(), "finishExec", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventOccurrence_ToAfter(), this.getGeneralOrdering(), this.getGeneralOrdering_Before(), "toAfter", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventOccurrence_ToBefore(), this.getGeneralOrdering(), this.getGeneralOrdering_After(), "toBefore", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(eventOccurrenceEClass, ecorePackage.getEEList(), "getCovereds"); //$NON-NLS-1$

		initEClass(executionOccurrenceEClass, ExecutionOccurrence.class, "ExecutionOccurrence", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getExecutionOccurrence_Start(), this.getEventOccurrence(), this.getEventOccurrence_StartExec(), "start", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExecutionOccurrence_Finish(), this.getEventOccurrence(), this.getEventOccurrence_FinishExec(), "finish", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExecutionOccurrence_Behavior(), this.getBehavior(), null, "behavior", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stateInvariantEClass, StateInvariant.class, "StateInvariant", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getStateInvariant_Invariant(), this.getConstraint(), null, "invariant", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stateInvariantEClass, ecorePackage.getEEList(), "getCovereds"); //$NON-NLS-1$

		addEOperation(stateInvariantEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getPort_IsBehavior(), this.getBoolean(), "isBehavior", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPort_IsService(), this.getBoolean(), "isService", "true", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getPort_Required(), this.getInterface(), null, "required", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPort_RedefinedPort(), this.getPort(), null, "redefinedPort", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPort_Provided(), this.getInterface(), null, "provided", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPort_Protocol(), this.getProtocolStateMachine(), null, "protocol", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(portEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		initEClass(encapsulatedClassifierEClass, EncapsulatedClassifier.class, "EncapsulatedClassifier", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getEncapsulatedClassifier_OwnedPort(), this.getPort(), null, "ownedPort", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(encapsulatedClassifierEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(encapsulatedClassifierEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTemplateSignature_Parameter(), this.getTemplateParameter(), null, "parameter", null, 1, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_OwnedParameter(), this.getTemplateParameter(), this.getTemplateParameter_Signature(), "ownedParameter", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_NestedSignature(), this.getTemplateSignature(), this.getTemplateSignature_NestingSignature(), "nestedSignature", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_NestingSignature(), this.getTemplateSignature(), this.getTemplateSignature_NestedSignature(), "nestingSignature", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_Template(), this.getTemplateableElement(), this.getTemplateableElement_OwnedTemplateSignature(), "template", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateSignatureEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(templateSignatureEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTemplateParameter_Signature(), this.getTemplateSignature(), this.getTemplateSignature_OwnedParameter(), "signature", null, 1, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_ParameteredElement(), this.getParameterableElement(), this.getParameterableElement_TemplateParameter(), "parameteredElement", null, 1, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_OwnedParameteredElement(), this.getParameterableElement(), this.getParameterableElement_OwningParameter(), "ownedParameteredElement", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_Default(), this.getParameterableElement(), null, "default", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_OwnedDefault(), this.getParameterableElement(), null, "ownedDefault", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateParameterEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(templateParameterEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(templateableElementEClass, TemplateableElement.class, "TemplateableElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTemplateableElement_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_BoundElement(), "templateBinding", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(), this.getTemplateSignature_Template(), "ownedTemplateSignature", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateableElementEClass, this.getSet(), "parameterableElements"); //$NON-NLS-1$

		addEOperation(templateableElementEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getStringExpression_SubExpression(), this.getStringExpression(), this.getStringExpression_OwningExpression(), "subExpression", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStringExpression_OwningExpression(), this.getStringExpression(), this.getStringExpression_SubExpression(), "owningExpression", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stringExpressionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(stringExpressionEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(parameterableElementEClass, ParameterableElement.class, "ParameterableElement", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getParameterableElement_TemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_ParameteredElement(), "templateParameter", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParameterableElement_OwningParameter(), this.getTemplateParameter(), this.getTemplateParameter_OwnedParameteredElement(), "owningParameter", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(parameterableElementEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTemplateBinding_BoundElement(), this.getTemplateableElement(), this.getTemplateableElement_TemplateBinding(), "boundElement", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateBinding_Signature(), this.getTemplateSignature(), null, "signature", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateBinding_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(), "parameterSubstitution", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateBindingEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(templateBindingEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(templateBindingEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(templateBindingEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(templateParameterSubstitutionEClass, TemplateParameterSubstitution.class, "TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_Formal(), this.getTemplateParameter(), null, "formal", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_ParameterSubstitution(), "templateBinding", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_Actual(), this.getParameterableElement(), null, "actual", null, 1, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_OwnedActual(), this.getParameterableElement(), null, "ownedActual", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateParameterSubstitutionEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(templateParameterSubstitutionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(operationTemplateParameterEClass, OperationTemplateParameter.class, "OperationTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(classifierTemplateParameterEClass, ClassifierTemplateParameter.class, "ClassifierTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getClassifierTemplateParameter_AllowSubstitutable(), this.getBoolean(), "allowSubstitutable", "true", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(parameterableClassifierEClass, ParameterableClassifier.class, "ParameterableClassifier", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(redefinableTemplateSignatureEClass, RedefinableTemplateSignature.class, "RedefinableTemplateSignature", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(templateableClassifierEClass, TemplateableClassifier.class, "TemplateableClassifier", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(connectableElementTemplateParameterEClass, ConnectableElementTemplateParameter.class, "ConnectableElementTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(callTriggerEClass, CallTrigger.class, "CallTrigger", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getCallTrigger_Operation(), this.getOperation(), null, "operation", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageTriggerEClass, MessageTrigger.class, "MessageTrigger", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(changeTriggerEClass, ChangeTrigger.class, "ChangeTrigger", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getChangeTrigger_ChangeExpression(), this.getValueSpecification(), null, "changeExpression", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(changeTriggerEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTrigger_Port(), this.getPort(), null, "port", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(receptionEClass, Reception.class, "Reception", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReception_Signal(), this.getSignal(), null, "signal", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getSignal_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(signalEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(signalEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(signalTriggerEClass, SignalTrigger.class, "SignalTrigger", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getSignalTrigger_Signal(), this.getSignal(), null, "signal", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(timeTriggerEClass, TimeTrigger.class, "TimeTrigger", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getTimeTrigger_IsRelative(), this.getBoolean(), "isRelative", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTimeTrigger_When(), this.getValueSpecification(), null, "when", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(timeTriggerEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(anyTriggerEClass, AnyTrigger.class, "AnyTrigger", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getCreateObjectAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCreateObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(createObjectActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getDestroyObjectAction_IsDestroyLinks(), this.getBoolean(), "isDestroyLinks", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDestroyObjectAction_IsDestroyOwnedObjects(), this.getBoolean(), "isDestroyOwnedObjects", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getDestroyObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(destroyObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(testIdentityActionEClass, TestIdentityAction.class, "TestIdentityAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTestIdentityAction_First(), this.getInputPin(), null, "first", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTestIdentityAction_Second(), this.getInputPin(), null, "second", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTestIdentityAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(testIdentityActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(testIdentityActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReadSelfAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readSelfActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(structuralFeatureActionEClass, StructuralFeatureAction.class, "StructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getStructuralFeatureAction_StructuralFeature(), this.getStructuralFeature(), null, "structuralFeature", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuralFeatureAction_Object(), this.getInputPin(), null, "object", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(structuralFeatureActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(readStructuralFeatureActionEClass, ReadStructuralFeatureAction.class, "ReadStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReadStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readStructuralFeatureActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(writeStructuralFeatureActionEClass, WriteStructuralFeatureAction.class, "WriteStructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getWriteStructuralFeatureAction_Value(), this.getInputPin(), null, "value", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(writeStructuralFeatureActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(clearStructuralFeatureActionEClass, ClearStructuralFeatureAction.class, "ClearStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(removeStructuralFeatureValueActionEClass, RemoveStructuralFeatureValueAction.class, "RemoveStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(addStructuralFeatureValueActionEClass, AddStructuralFeatureValueAction.class, "AddStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getAddStructuralFeatureValueAction_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAddStructuralFeatureValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(addStructuralFeatureValueActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(linkActionEClass, LinkAction.class, "LinkAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getLinkAction_EndData(), this.getLinkEndData(), null, "endData", null, 2, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(linkEndDataEClass, LinkEndData.class, "LinkEndData", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getLinkEndData_Value(), this.getInputPin(), null, "value", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLinkEndData_End(), this.getProperty(), null, "end", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLinkEndData_Qualifier(), this.getQualifierValue(), null, "qualifier", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(readLinkActionEClass, ReadLinkAction.class, "ReadLinkAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReadLinkAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readLinkActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(linkEndCreationDataEClass, LinkEndCreationData.class, "LinkEndCreationData", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getLinkEndCreationData_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getLinkEndCreationData_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(linkEndCreationDataEClass, ecorePackage.getEEList(), "getQualifiers"); //$NON-NLS-1$

		initEClass(createLinkActionEClass, CreateLinkAction.class, "CreateLinkAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(createLinkActionEClass, ecorePackage.getEEList(), "getEndData"); //$NON-NLS-1$

		initEClass(writeLinkActionEClass, WriteLinkAction.class, "WriteLinkAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(destroyLinkActionEClass, DestroyLinkAction.class, "DestroyLinkAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(clearAssociationActionEClass, ClearAssociationAction.class, "ClearAssociationAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getClearAssociationAction_Object(), this.getInputPin(), null, "object", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClearAssociationAction_Association(), this.getAssociation(), null, "association", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(clearAssociationActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(variableActionEClass, VariableAction.class, "VariableAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getVariableAction_Variable(), this.getVariable(), null, "variable", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(readVariableActionEClass, ReadVariableAction.class, "ReadVariableAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReadVariableAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readVariableActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(writeVariableActionEClass, WriteVariableAction.class, "WriteVariableAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getWriteVariableAction_Value(), this.getInputPin(), null, "value", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(writeVariableActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(clearVariableActionEClass, ClearVariableAction.class, "ClearVariableAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(addVariableValueActionEClass, AddVariableValueAction.class, "AddVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getAddVariableValueAction_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAddVariableValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(addVariableValueActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(removeVariableValueActionEClass, RemoveVariableValueAction.class, "RemoveVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(applyFunctionActionEClass, ApplyFunctionAction.class, "ApplyFunctionAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getApplyFunctionAction_Function(), this.getPrimitiveFunction(), null, "function", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getApplyFunctionAction_Argument(), this.getInputPin(), null, "argument", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getApplyFunctionAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(applyFunctionActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(applyFunctionActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(primitiveFunctionEClass, PrimitiveFunction.class, "PrimitiveFunction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getPrimitiveFunction_Body(), this.getString(), "body", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPrimitiveFunction_Language(), this.getString(), "language", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(callActionEClass, CallAction.class, "CallAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getCallAction_IsSynchronous(), this.getBoolean(), "isSynchronous", "true", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCallAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(callActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(invocationActionEClass, InvocationAction.class, "InvocationAction", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInvocationAction_Argument(), this.getInputPin(), null, "argument", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInvocationAction_OnPort(), this.getPort(), null, "onPort", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(invocationActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getSendSignalAction_Target(), this.getInputPin(), null, "target", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendSignalAction_Signal(), this.getSignal(), null, "signal", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(sendSignalActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(broadcastSignalActionEClass, BroadcastSignalAction.class, "BroadcastSignalAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getBroadcastSignalAction_Signal(), this.getSignal(), null, "signal", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sendObjectActionEClass, SendObjectAction.class, "SendObjectAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getSendObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendObjectAction_Request(), this.getInputPin(), null, "request", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(sendObjectActionEClass, ecorePackage.getEEList(), "getArguments"); //$NON-NLS-1$

		addEOperation(sendObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(callOperationActionEClass, CallOperationAction.class, "CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getCallOperationAction_Operation(), this.getOperation(), null, "operation", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCallOperationAction_Target(), this.getInputPin(), null, "target", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(callOperationActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getCallBehaviorAction_Behavior(), this.getBehavior(), null, "behavior", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getStateMachine_Region(), this.getRegion(), this.getRegion_StateMachine(), "region", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStateMachine_ConnectionPoint(), this.getPseudostate(), null, "connectionPoint", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStateMachine_ExtendedStateMachine(), this.getStateMachine(), null, "extendedStateMachine", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStateMachine_StateMachine_redefinitionContext(), this.getBehavioredClassifier(), this.getBehavioredClassifier_OwnedStateMachine(), "stateMachine_redefinitionContext", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stateMachineEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(stateMachineEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(stateMachineEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getRegion_Subvertex(), this.getVertex(), this.getVertex_Container(), "subvertex", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_Transition(), this.getTransition(), this.getTransition_Container(), "transition", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_StateMachine(), this.getStateMachine(), this.getStateMachine_Region(), "stateMachine", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_State(), this.getState(), this.getState_Region(), "state", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_ExtendedRegion(), this.getRegion(), null, "extendedRegion", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(regionEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(regionEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(regionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(regionEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(pseudostateEClass, Pseudostate.class, "Pseudostate", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getPseudostate_Kind(), this.getPseudostateKind(), "kind", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getState_IsComposite(), this.getBoolean(), "isComposite", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getState_IsOrthogonal(), this.getBoolean(), "isOrthogonal", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getState_IsSimple(), this.getBoolean(), "isSimple", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getState_IsSubmachineState(), this.getBoolean(), "isSubmachineState", null, 0, 1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Submachine(), this.getStateMachine(), null, "submachine", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Connection(), this.getConnectionPointReference(), null, "connection", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_RedefinedState(), this.getState(), null, "redefinedState", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_DeferrableTrigger(), this.getTrigger(), null, "deferrableTrigger", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Region(), this.getRegion(), this.getRegion_State(), "region", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Entry(), this.getActivity(), null, "entry", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Exit(), this.getActivity(), null, "exit", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_DoActivity(), this.getActivity(), null, "doActivity", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_StateInvariant(), this.getConstraint(), null, "stateInvariant", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getVertex_Container(), this.getRegion(), this.getRegion_Subvertex(), "container", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getVertex_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVertex_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(vertexEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(connectionPointReferenceEClass, ConnectionPointReference.class, "ConnectionPointReference", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getConnectionPointReference_Entry(), this.getPseudostate(), null, "entry", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnectionPointReference_Exit(), this.getPseudostate(), null, "exit", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getTransition_Kind(), this.getTransitionKind(), "kind", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Container(), this.getRegion(), this.getRegion_Transition(), "container", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Source(), this.getVertex(), this.getVertex_Outgoing(), "source", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Target(), this.getVertex(), this.getVertex_Incoming(), "target", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_RedefinedTransition(), this.getTransition(), null, "redefinedTransition", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Guard(), this.getConstraint(), null, "guard", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Effect(), this.getActivity(), null, "effect", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(transitionEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(transitionEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(transitionEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(transitionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(interactionOccurrenceEClass, InteractionOccurrence.class, "InteractionOccurrence", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInteractionOccurrence_RefersTo(), this.getInteraction(), null, "refersTo", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionOccurrence_ActualGate(), this.getGate(), null, "actualGate", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionOccurrence_Argument(), this.getInputPin(), null, "argument", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionOccurrenceEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(partDecompositionEClass, PartDecomposition.class, "PartDecomposition", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(interactionOperandEClass, InteractionOperand.class, "InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInteractionOperand_Guard(), this.getInteractionConstraint(), null, "guard", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionOperand_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingOperand(), "fragment", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionOperandEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(interactionConstraintEClass, InteractionConstraint.class, "InteractionConstraint", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInteractionConstraint_Minint(), this.getValueSpecification(), null, "minint", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionConstraint_Maxint(), this.getValueSpecification(), null, "maxint", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionConstraintEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getCombinedFragment_InteractionOperator(), this.getInteractionOperator(), "interactionOperator", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCombinedFragment_Operand(), this.getInteractionOperand(), null, "operand", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getCombinedFragment_CfragmentGate(), this.getGate(), null, "cfragmentGate", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(combinedFragmentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(continuationEClass, Continuation.class, "Continuation", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getContinuation_Setting(), this.getBoolean(), "setting", "True", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(expansionNodeEClass, ExpansionNode.class, "ExpansionNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getExpansionNode_RegionAsOutput(), this.getExpansionRegion(), this.getExpansionRegion_OutputElement(), "regionAsOutput", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpansionNode_RegionAsInput(), this.getExpansionRegion(), this.getExpansionRegion_InputElement(), "regionAsInput", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(expansionRegionEClass, ExpansionRegion.class, "ExpansionRegion", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getExpansionRegion_Mode(), this.getExpansionKind(), "mode", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpansionRegion_OutputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsOutput(), "outputElement", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpansionRegion_InputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsInput(), "inputElement", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getExceptionHandler_ProtectedNode(), this.getExecutableNode(), this.getExecutableNode_Handler(), "protectedNode", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExceptionHandler_HandlerBody(), this.getExecutableNode(), null, "handlerBody", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExceptionHandler_ExceptionInput(), this.getObjectNode(), null, "exceptionInput", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExceptionHandler_ExceptionType(), this.getClassifier(), null, "exceptionType", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(exceptionHandlerEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getJoinNode_IsCombineDuplicate(), this.getBoolean(), "isCombineDuplicate", "true", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getJoinNode_JoinSpec(), this.getValueSpecification(), null, "joinSpec", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(joinNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(centralBufferNodeEClass, CentralBufferNode.class, "CentralBufferNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(activityPartitionEClass, ActivityPartition.class, "ActivityPartition", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getActivityPartition_IsDimension(), this.getBoolean(), "isDimension", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getActivityPartition_IsExternal(), this.getBoolean(), "isExternal", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getActivityPartition_ContainedEdge(), this.getActivityEdge(), this.getActivityEdge_InPartition(), "containedEdge", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_ContainedNode(), this.getActivityNode(), this.getActivityNode_InPartition(), "containedNode", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_Subgroup(), this.getActivityPartition(), this.getActivityPartition_SuperPartition(), "subgroup", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_SuperPartition(), this.getActivityPartition(), this.getActivityPartition_Subgroup(), "superPartition", null, 0, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_Represents(), this.getElement(), null, "represents", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityPartitionEClass, this.getActivityGroup(), "getSuperGroup"); //$NON-NLS-1$

		initEClass(readExtentActionEClass, ReadExtentAction.class, "ReadExtentAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReadExtentAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadExtentAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readExtentActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(reclassifyObjectActionEClass, ReclassifyObjectAction.class, "ReclassifyObjectAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getReclassifyObjectAction_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getReclassifyObjectAction_OldClassifier(), this.getClassifier(), null, "oldClassifier", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReclassifyObjectAction_NewClassifier(), this.getClassifier(), null, "newClassifier", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReclassifyObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(reclassifyObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(readIsClassifiedObjectActionEClass, ReadIsClassifiedObjectAction.class, "ReadIsClassifiedObjectAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getReadIsClassifiedObjectAction_IsDirect(), this.getBoolean(), "isDirect", "false", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getReadIsClassifiedObjectAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadIsClassifiedObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadIsClassifiedObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readIsClassifiedObjectActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		addEOperation(readIsClassifiedObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(startOwnedBehaviorActionEClass, StartOwnedBehaviorAction.class, "StartOwnedBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getStartOwnedBehaviorAction_Object(), this.getInputPin(), null, "object", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(startOwnedBehaviorActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(qualifierValueEClass, QualifierValue.class, "QualifierValue", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getQualifierValue_Qualifier(), this.getProperty(), null, "qualifier", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getQualifierValue_Value(), this.getInputPin(), null, "value", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(readLinkObjectEndActionEClass, ReadLinkObjectEndAction.class, "ReadLinkObjectEndAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndAction_Object(), this.getInputPin(), null, "object", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndAction_End(), this.getProperty(), null, "end", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readLinkObjectEndActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(readLinkObjectEndActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(readLinkObjectEndQualifierActionEClass, ReadLinkObjectEndQualifierAction.class, "ReadLinkObjectEndQualifierAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndQualifierAction_Object(), this.getInputPin(), null, "object", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndQualifierAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndQualifierAction_Qualifier(), this.getProperty(), null, "qualifier", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(createLinkObjectActionEClass, CreateLinkObjectAction.class, "CreateLinkObjectAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getCreateLinkObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(createLinkObjectActionEClass, ecorePackage.getEEList(), "getEndData"); //$NON-NLS-1$

		addEOperation(createLinkObjectActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getAcceptEventAction_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAcceptEventAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(acceptEventActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(acceptCallActionEClass, AcceptCallAction.class, "AcceptCallAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getAcceptCallAction_ReturnInformation(), this.getOutputPin(), null, "returnInformation", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(acceptCallActionEClass, ecorePackage.getEEList(), "getTriggers"); //$NON-NLS-1$

		addEOperation(acceptCallActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(replyActionEClass, ReplyAction.class, "ReplyAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getReplyAction_ReplyToCall(), this.getCallTrigger(), null, "replyToCall", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReplyAction_ReplyValue(), this.getInputPin(), null, "replyValue", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReplyAction_ReturnInformation(), this.getInputPin(), null, "returnInformation", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(replyActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(raiseExceptionActionEClass, RaiseExceptionAction.class, "RaiseExceptionAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getRaiseExceptionAction_Exception(), this.getInputPin(), null, "exception", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(raiseExceptionActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(dataStoreNodeEClass, DataStoreNode.class, "DataStoreNode", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(interruptibleActivityRegionEClass, InterruptibleActivityRegion.class, "InterruptibleActivityRegion", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInterruptibleActivityRegion_InterruptingEdge(), this.getActivityEdge(), this.getActivityEdge_Interrupts(), "interruptingEdge", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterruptibleActivityRegion_ContainedNode(), this.getActivityNode(), this.getActivityNode_InInterruptibleRegion(), "containedNode", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterSetEClass, ParameterSet.class, "ParameterSet", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getParameterSet_Parameter(), this.getParameter(), this.getParameter_ParameterSet(), "parameter", null, 1, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getParameterSet_Condition(), this.getConstraint(), null, "condition", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(parameterSetEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getDeployment_DeployedArtifact(), this.getDeployedArtifact(), null, "deployedArtifact", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeployment_Location(), this.getDeploymentTarget(), this.getDeploymentTarget_Deployment(), "location", null, 1, 1, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeployment_Configuration(), this.getDeploymentSpecification(), null, "configuration", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(deployedArtifactEClass, DeployedArtifact.class, "DeployedArtifact", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(deploymentTargetEClass, DeploymentTarget.class, "DeploymentTarget", IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getDeploymentTarget_Deployment(), this.getDeployment(), this.getDeployment_Location(), "deployment", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeploymentTarget_DeployedElement(), this.getPackageableElement(), null, "deployedElement", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(deploymentTargetEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(deploymentTargetEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getNode_NestedNode(), this.getNode(), null, "nestedNode", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(nodeEClass, ecorePackage.getEEList(), "getNestedClassifiers"); //$NON-NLS-1$

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(communicationPathEClass, CommunicationPath.class, "CommunicationPath", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getTimeExpression_FirstTime(), this.getBoolean(), "firstTime", "True", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getTimeExpression_Event(), this.getNamedElement(), null, "event", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getDuration_FirstTime(), this.getBoolean(), "firstTime", "True", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getDuration_Event(), this.getNamedElement(), null, "event", null, 0, 2, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(timeObservationActionEClass, TimeObservationAction.class, "TimeObservationAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getTimeObservationAction_Now(), this.getTimeExpression(), null, "now", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(timeObservationActionEClass, this.getInputPin(), "getValue"); //$NON-NLS-1$

		op = addEOperation(timeObservationActionEClass, null, "setValue"); //$NON-NLS-1$
		addEParameter(op, this.getInputPin(), "newValue"); //$NON-NLS-1$

		initEClass(durationIntervalEClass, DurationInterval.class, "DurationInterval", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(durationIntervalEClass, ecorePackage.getEEList(), "getMins"); //$NON-NLS-1$

		addEOperation(durationIntervalEClass, ecorePackage.getEEList(), "getMaxes"); //$NON-NLS-1$

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getInterval_Min(), this.getValueSpecification(), null, "min", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterval_Max(), this.getValueSpecification(), null, "max", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(timeConstraintEClass, TimeConstraint.class, "TimeConstraint", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(timeConstraintEClass, this.getValueSpecification(), "getSpecification"); //$NON-NLS-1$

		op = addEOperation(timeConstraintEClass, null, "setSpecification"); //$NON-NLS-1$
		addEParameter(op, this.getValueSpecification(), "newSpecification"); //$NON-NLS-1$

		initEClass(intervalConstraintEClass, IntervalConstraint.class, "IntervalConstraint", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(intervalConstraintEClass, this.getValueSpecification(), "getSpecification"); //$NON-NLS-1$

		op = addEOperation(intervalConstraintEClass, null, "setSpecification"); //$NON-NLS-1$
		addEParameter(op, this.getValueSpecification(), "newSpecification"); //$NON-NLS-1$

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(timeIntervalEClass, ecorePackage.getEEList(), "getMaxes"); //$NON-NLS-1$

		addEOperation(timeIntervalEClass, ecorePackage.getEEList(), "getMins"); //$NON-NLS-1$

		initEClass(durationObservationActionEClass, DurationObservationAction.class, "DurationObservationAction", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getDurationObservationAction_Duration(), this.getDuration(), null, "duration", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(durationObservationActionEClass, this.getInputPin(), "getValue"); //$NON-NLS-1$

		op = addEOperation(durationObservationActionEClass, null, "setValue"); //$NON-NLS-1$
		addEParameter(op, this.getInputPin(), "newValue"); //$NON-NLS-1$

		initEClass(durationConstraintEClass, DurationConstraint.class, "DurationConstraint", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$

		addEOperation(durationConstraintEClass, this.getValueSpecification(), "getSpecification"); //$NON-NLS-1$

		op = addEOperation(durationConstraintEClass, null, "setSpecification"); //$NON-NLS-1$
		addEParameter(op, this.getValueSpecification(), "newSpecification"); //$NON-NLS-1$

		initEClass(protocolConformanceEClass, ProtocolConformance.class, "ProtocolConformance", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getProtocolConformance_SpecificMachine(), this.getProtocolStateMachine(), this.getProtocolStateMachine_Conformance(), "specificMachine", null, 1, 1, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProtocolConformance_GeneralMachine(), this.getProtocolStateMachine(), null, "generalMachine", null, 1, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(protocolConformanceEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(protocolConformanceEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(protocolConformanceEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(protocolStateMachineEClass, ProtocolStateMachine.class, "ProtocolStateMachine", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getProtocolStateMachine_Conformance(), this.getProtocolConformance(), this.getProtocolConformance_SpecificMachine(), "conformance", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(protocolStateMachineEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(protocolTransitionEClass, ProtocolTransition.class, "ProtocolTransition", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEReference(getProtocolTransition_PostCondition(), this.getConstraint(), null, "postCondition", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProtocolTransition_Referred(), this.getOperation(), null, "referred", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProtocolTransition_PreCondition(), this.getConstraint(), null, "preCondition", null, 0, 1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(protocolTransitionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		op = addEOperation(protocolTransitionEClass, null, "setGuard"); //$NON-NLS-1$
		addEParameter(op, this.getConstraint(), "newGuard"); //$NON-NLS-1$

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getComponent_IsIndirectlyInstantiated(), this.getBoolean(), "isIndirectlyInstantiated", null, 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_Required(), this.getInterface(), null, "required", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_Provided(), this.getInterface(), null, "provided", null, 0, -1, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_Realization(), this.getRealization(), this.getRealization_Abstraction(), "realization", null, 0, -1, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_OwnedMember(), this.getPackageableElement(), null, "ownedMember", null, 0, -1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(componentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(componentEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		initEClass(deploymentSpecificationEClass, DeploymentSpecification.class, "DeploymentSpecification", !IS_ABSTRACT, !IS_INTERFACE); //$NON-NLS-1$
		initEAttribute(getDeploymentSpecification_DeploymentLocation(), this.getString(), "deploymentLocation", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDeploymentSpecification_ExecutionLocation(), this.getString(), "executionLocation", "", 0, 1, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind"); //$NON-NLS-1$
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC_LITERAL);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE_LITERAL);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED_LITERAL);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE_LITERAL);

		initEEnum(parameterDirectionKindEEnum, ParameterDirectionKind.class, "ParameterDirectionKind"); //$NON-NLS-1$
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.IN_LITERAL);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.INOUT_LITERAL);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.OUT_LITERAL);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.RETURN_LITERAL);

		initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind"); //$NON-NLS-1$
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE_LITERAL);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.SHARED_LITERAL);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITE_LITERAL);

		initEEnum(messageKindEEnum, MessageKind.class, "MessageKind"); //$NON-NLS-1$
		addEEnumLiteral(messageKindEEnum, MessageKind.COMPLETE_LITERAL);
		addEEnumLiteral(messageKindEEnum, MessageKind.LOST_LITERAL);
		addEEnumLiteral(messageKindEEnum, MessageKind.FOUND_LITERAL);
		addEEnumLiteral(messageKindEEnum, MessageKind.UNKNOWN_LITERAL);

		initEEnum(messageSortEEnum, MessageSort.class, "MessageSort"); //$NON-NLS-1$
		addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_CALL_LITERAL);
		addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_SIGNAL_LITERAL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_CALL_LITERAL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_SIGNAL_LITERAL);

		initEEnum(callConcurrencyKindEEnum, CallConcurrencyKind.class, "CallConcurrencyKind"); //$NON-NLS-1$
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.SEQUENTIAL_LITERAL);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.GUARDED_LITERAL);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.CONCURRENT_LITERAL);

		initEEnum(transitionKindEEnum, TransitionKind.class, "TransitionKind"); //$NON-NLS-1$
		addEEnumLiteral(transitionKindEEnum, TransitionKind.INTERNAL_LITERAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.LOCAL_LITERAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.EXTERNAL_LITERAL);

		initEEnum(pseudostateKindEEnum, PseudostateKind.class, "PseudostateKind"); //$NON-NLS-1$
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.INITIAL_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.DEEP_HISTORY_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.SHALLOW_HISTORY_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JOIN_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.FORK_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JUNCTION_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.CHOICE_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.ENTRY_POINT_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.EXIT_POINT_LITERAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.TERMINATE_LITERAL);

		initEEnum(interactionOperatorEEnum, InteractionOperator.class, "InteractionOperator"); //$NON-NLS-1$
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.SEQ_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.ALT_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.OPT_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.BREAK_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.PAR_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.STRICT_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.LOOP_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.CRITICAL_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.NEG_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.ASSERT_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.IGNORE_LITERAL);
		addEEnumLiteral(interactionOperatorEEnum, InteractionOperator.CONSIDER_LITERAL);

		initEEnum(expansionKindEEnum, ExpansionKind.class, "ExpansionKind"); //$NON-NLS-1$
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.PARALLEL_LITERAL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.ITERATIVE_LITERAL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.STREAM_LITERAL);

		initEEnum(parameterEffectKindEEnum, ParameterEffectKind.class, "ParameterEffectKind"); //$NON-NLS-1$
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.CREATE_LITERAL);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.READ_LITERAL);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.UPDATE_LITERAL);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.DELETE_LITERAL);

		initEEnum(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.class, "ObjectNodeOrderingKind"); //$NON-NLS-1$
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.UNORDERED_LITERAL);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.ORDERED_LITERAL);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.LIFO_LITERAL);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.FIFO_LITERAL);

		initEEnum(connectorKindEEnum, ConnectorKind.class, "ConnectorKind"); //$NON-NLS-1$
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.ASSEMBLY_LITERAL);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.DELEGATION_LITERAL);

		// Initialize data types
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE); //$NON-NLS-1$
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE); //$NON-NLS-1$
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE); //$NON-NLS-1$
		initEDataType(unlimitedNaturalEDataType, int.class, "UnlimitedNatural", IS_SERIALIZABLE); //$NON-NLS-1$
		initEDataType(sequenceEDataType, List.class, "Sequence", IS_SERIALIZABLE); //$NON-NLS-1$
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// constraint
		createConstraintAnnotations();
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
		// feature
		createFeatureAnnotations();
		// redefines
		createRedefinesAnnotations();
		// redefined
		createRedefinedAnnotations();
		// superset
		createSupersetAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel"; //$NON-NLS-1$		
		addAnnotation
		  ((EOperation)elementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ElementOperations.validateNotOwnSelf(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nnot self.allOwnedElements()->includes(self)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)elementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ElementOperations.validateHasOwner(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.mustBeOwned() implies owner->notEmpty()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)elementEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allOwnedElements\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ElementOperations.allOwnedElements(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ElementOperations.allOwnedElements(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nownedElement->union(ownedElement->collect(e | e.allOwnedElements()))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)elementEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ElementOperations.mustBeOwned(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.lowerBound(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.upperBound(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.isMultivalued(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nupperBound() > 1\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesCardinality(this, C);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\n(lowerBound() <= C) and (upperBound() >= C)\r\n\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesMultiplicity(this, M);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\n(self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGt0(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nupperBound()->notEmpty() implies upperBound() > 0\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nlowerBound()->notEmpty() implies lowerBound() >= 0\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\n(upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerEqLowerbound(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nlower=lowerBound()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperEqUpperbound(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nupper = upperBound()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.lower(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nlowerBound()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.upper(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nupperBound()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)valueSpecificationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ValueSpecificationOperations.isComputable(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nfalse\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)valueSpecificationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ValueSpecificationOperations.integerValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nSet{}\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)valueSpecificationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ValueSpecificationOperations.booleanValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nSet{}\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)valueSpecificationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ValueSpecificationOperations.stringValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nSet{}\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)valueSpecificationEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ValueSpecificationOperations.unlimitedValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nSet{}\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)valueSpecificationEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ValueSpecificationOperations.isNull(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nfalse\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });															
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassOperations.inherit(this, inhs);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ninhs->excluding(inh | ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																					
		addAnnotation
		  ((EOperation)typeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.TypeOperations.conformsTo(this, other);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nfalse\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.validateOppositeIsOtherEnd(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nopposite = \r\n\tif owningAssociation->notEmpty() and association.memberEnd->size() = 2 then \r\n\t\tlet otherEnd = (association.memberEnd - self)->any() in \r\n\t\t\tif otherEnd.owningAssociation->notEmpty then otherEnd else Set{} endif\r\n\telse Set {}\r\n\tendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.opposite(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif owningAssociation->notEmpty() and association.memberEnd->size() = 2 then \r\n\t\tlet otherEnd = (association.memberEnd - self)->any() in \r\n\t\t\tif otherEnd.owningAssociation->notEmpty then otherEnd else Set{} endif\r\n\telse Set {}\r\n\tendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.validateMultiplicityOfComposite(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nisComposite implies (upperBound()->isEmpty() or upperBound() <= 1)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.validateSubsettingContext(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nsubsettedProperty->notEmpty() implies\r\n\t(subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |\r\n\t\tsubsettedProperty->forAll(sp | \r\n\t\t\tsp.subsettingContext()->exists(c | sc.conformsTo(c)))))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.validateNavigablePropertyRedefinition(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\n(subsettedProperty->exists(sp | sp.class->notEmpty())\t\r\n\t\timplies class->notEmpty())\r\nand\r\n(redefinedProperty->exists(rp | rp.class->notEmpty())\t\r\n\t\timplies class->notEmpty())\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.validateSubsettingRules(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nsubsettedProperty->forAll(sp |\r\n\ttype.conformsTo(sp.type) and\r\n\t\t((upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies\r\n\t\t\tupperBound()<=sp.upperBound() ))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.validateNavigableReadonly(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nisReadOnly implies class->notEmpty()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.validateDerivedUnionIsDerived(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nisDerivedUnion implies isDerived\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PropertyOperations.isConsistentWith(this, redefinee);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\n(redefinee.oclIsKindOf(Property) and \r\n    let prop: Property = redefinee.oclAsType(Property) in\r\n        type.conformsTo(prop.type) and\r\n        (lowerBound()->notEmpty and prop.lowerBound()->notEmpty() implies lowerBound() >= prop.lowerBound())\r\n    and\r\n        (upperBound()->notEmpty and prop.upperBound()->notEmpty() implies upperBound() <= prop.upperBound())\r\n    and\r\n        (prop.isDerived implies isDerived))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"subsettingContext\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.PropertyOperations.subsettingContext(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.PropertyOperations.subsettingContext(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif association->notEmpty()\r\nthen association.endType-type \r\nelse if classifier->notEmpty then Set{classifier} else Set{} endif\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																									
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.validateTypeOfResult(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nif returnResult->size() = 1 then\r\n  type = returnResult.type\r\nelse\r\n  type = nil\r\nendif\r\n\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.isOrdered(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif returnResult->size() = 1 then returnResult->any().isOrdered else false endif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.isUnique(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\n if returnResult->size() = 1 then returnResult->any().isUnique else true endif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.lower(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif returnResult->size() = 1 then returnResult->any().lower else Set{} endif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.upper(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif returnResult->size() = 1 then returnResult->any().upper else Set{} endif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.type(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif returnResult->size() = 1 then returnResult->any().type else Set{} endif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.validateOnlyBodyForQuery(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nbodyCondition->notEmpty() implies isQuery\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.OperationOperations.isConsistentWith(this, redefinee);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\n(redefinee.oclIsKindOf(Operation) and\r\n    let op: Operation = redefinee.oclAsType(Operation) in\r\n        self.formalParameter.size() = op.formalParameter.size() and\r\n        self.returnResult.size() = op.returnResult.size() and\r\n        forAll(i | op.formalParameter[i].type.conformsTo(self.formalParameter[i].type)) and\r\n        forAll(i | op.returnResult[i].type.conformsTo(self.returnResult[i].type))\r\n)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																										
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamedElementOperations.validateNoName(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty()\r\n\timplies self.qualifiedName->isEmpty()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamedElementOperations.validateQualifiedName(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\n(self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies\r\nself.qualifiedName =\r\n self.allNamespaces()->iterate( ns : Namespace; result: String = self.name |\r\n\t\tns.name->union(self.separator())->union(result))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allNamespaces\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableList(org.eclipse.uml2.internal.operation.NamedElementOperations.allNamespaces(this)));\r\n\t}\r\n\treturn (List) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.NamedElementOperations.allNamespaces(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif self.namespace->isEmpty()\r\nthen Sequence{}\r\nelse self.namespace.allNamespaces()->prepend(self.namespace)\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamedElementOperations.isDistinguishableFrom(this, n, ns);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)\r\nthen ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()\r\nelse true\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamedElementOperations.separator(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\n\'::\'\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamedElementOperations.qualifiedName(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()\r\nthen \r\n    self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))\r\nelse\r\n    Set{}\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamedElementOperations.validateVisibilityNeedsOwnership(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nnamespace->isEmpty() implies visibility->isEmpty()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PackageOperations.validateElementsPublicOrPrivate(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PackageOperations.mustBeOwned(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nfalse\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"visibleMembers\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.PackageOperations.visibleMembers(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.PackageOperations.visibleMembers(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nmember->select( m | self.makesVisible(m))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PackageOperations.makesVisible(this, el);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nel.visibility->isEmpty() or el.visibility = #public\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																		
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.DataTypeOperations.inherit(this, inhs);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ninhs->excluding(inh |\r\n\townedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamespaceOperations.validateMembersAreDistinguishable(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nmembersAreDistinguishable()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamespaceOperations.getNamesOfMember(this, element);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif self.ownedMember->includes(element)\r\nthen Set{}->include(element.name)\r\nelse let elementImports: ElementImport = self.elementImport->select(ei | ei.importedElement = element) in\r\n    if elementImports->notEmpty()\r\n    then elementImports->collect(el | el.getName())\r\n    else \r\n        self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))->collect(pi | pi.importedPackage.getNamesOfMember(element))\r\n    endif\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamespaceOperations.membersAreDistinguishable(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.member->forAll( memb |\r\n\tself.member->excluding(memb)->forAll(other |\r\n\t\tmemb.isDistinguishableFrom(other, self)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamespaceOperations.validateImportedMemberDerived(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.importedMember->includesAll(self.importedMembers(self.elementImport.importedElement.asSet()->union(self.packageImport.importedPackage->collect(p | p.visibleMembers()))))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"importedMember\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.NamespaceOperations.importedMember(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.NamespaceOperations.importedMember(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.importedMembers(self.elementImport.importedElement.asSet()->union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamespaceOperations.importMembers(this, imps);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem | mem.imp.isDistinguishableFrom(mem, self)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.NamespaceOperations.excludeCollisions(this, imps);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nimps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  ((EOperation)literalBooleanEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralBooleanOperations.isComputable(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalBooleanEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralBooleanOperations.booleanValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nvalue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalStringEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralStringOperations.isComputable(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalStringEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralStringOperations.stringValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nvalue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalNullEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralNullOperations.isComputable(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalNullEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralNullOperations.isNull(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalIntegerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralIntegerOperations.isComputable(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalIntegerEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralIntegerOperations.integerValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nvalue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalUnlimitedNaturalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralUnlimitedNaturalOperations.isComputable(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)literalUnlimitedNaturalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.LiteralUnlimitedNaturalOperations.unlimitedValue(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nvalue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allFeatures\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nmember->select(oclIsKindOf(Feature))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.validateNoCyclesInGeneralization(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nnot self.allParents()->includes(self)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.validateSpecializeType(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.parents()->forAll(c | self.maySpecializeType(c))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.validateInheritedMember(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.inheritedMember->includesAll(self.inherit(self.parents()->collect(p | p.inheritableMembers(self)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"inheritedMember\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.inheritedMember(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.inheritedMember(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.inherit(self.parents()->collect(p | p.inheritableMembers(self))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"parents\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.parents(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.parents(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ngeneralization.general\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allParents\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allParents(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.allParents(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.parents()->union(self.parents()->collect(p | p.allParents())\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.inheritableMembers(this, c);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nmember->select(m | c.hasVisibilityOf(m))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.hasVisibilityOf(this, n);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ntrue\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.inherit(this, inhs);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ninhs\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.maySpecializeType(this, c);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.oclIsKindOf(c.oclType)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"general\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.general(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.general(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.parents()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.validateGeneralEqualsParents(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\ngeneral = self.parents()\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassifierOperations.conformsTo(this, other);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\n(self=other) or (self.allParents()->includes(other))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																									
		addAnnotation
		  ((EOperation)constraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ConstraintOperations.validateNotApplyToSelf(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nnot constrainedElement->includes(self)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)behavioralFeatureEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.BehavioralFeatureOperations.isDistinguishableFrom(this, n, ns);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif n.oclIsKindOf(BehavioralFeature)\r\nthen\r\n    if ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->notEmpty()\r\n    then Set{}->include(self)->include(n)->isUnique( bf | bf.parameter->collect(type))\r\n    else true\r\n    endif\r\nelse true\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.RedefinableElementOperations.validateRedefinitionContextValid(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.redefinedElement->forAll(e | self.isRedefinitionContextValid(e))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.RedefinableElementOperations.validateRedefinitionConsistent(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.redefinedElement->forAll(re | re.isConsistentWith(self))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isConsistentWith(this, redefinee);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nfalse\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.RedefinableElementOperations.isRedefinitionContextValid(this, redefinable);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.redefinitionContext->exists(c | redefinable.redefinitionContext->exists(r | c.allParents()->includes(r)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  ((EOperation)instanceSpecificationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.InstanceSpecificationOperations.validateSlotsAreDefined(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nslot->forAll(s |\r\n  classifier->exists(c | c.allFeatures()->includes(s.definingFeature))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)instanceSpecificationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.InstanceSpecificationOperations.validateNoDuplicateSlots(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nclassifier->forAll(c |\r\n\t(c.allFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)\r\n\t)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																		
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ElementImportOperations.validateVisibilityPublicOrPrivate(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.visibility = #public or self.visibility = #private\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ElementImportOperations.validateImportedElementIsPublic(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.importedElement.visibility.notEmpty() implies self.importedElement.visibility = #public\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ElementImportOperations.getName(this);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif self.alias->notEmpty() then \r\n    self.alias\r\nelse\r\n    self.importedElement.name\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PackageImportOperations.validatePublicOrPrivate(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.visibility = #public or self.visibility = #private\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																																																																																																																																																																																																																																																	
		addAnnotation
		  (interactionEClass, 
		   source, 
		   new String[] {
			 "documentation", "The point is that the InteractionConstraint \"received\" from StructuralArchitecture will consist of a set of such units described by sequence diagrams (or collaboration diagrams)." //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		   });							
		addAnnotation
		  (interactionFragmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "An InteractionFragment is a general class that holds the common parts of CompositeFragment, AtomicFragment and InteractionExpressionOperand.\r\nConceptually it is very much the same as a full sequence diagram, but a fragment is not named and must be referred then through structure." //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (lifelineEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Lifelineis the concept behind a lifeline in a Sequence \r\nDiagram. A Participant may be a Part or it may be a parameter representing a part. Its qualification is a Classifier which in turn may be an Interface (or ClassifierRole?)" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																													
		addAnnotation
		  ((EOperation)templateableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"parameterableElements\", new Class[] {}); //$NON-NLS-1$\r\n\tif (!getCacheAdapter().containsKey(this, method)) {\r\n\t\tgetCacheAdapter().put(this,\r\n\t\t\tmethod,\r\n\t\t\tjava.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.TemplateableElementOperations.parameterableElements(this)));\r\n\t}\r\n\treturn (Set) getCacheAdapter().get(this, method);\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.TemplateableElementOperations.parameterableElements(this);\r\n}" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		   });																																																																																																																																																																									
		addAnnotation
		  (interactionOccurrenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "A reference to an interaction with actual values. The interpretation is that the sequence diagram replaces the reference (with actual parameters substituted)" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "documentation", "A gate is a connection point. When the conceptual replacement of InteractionReferences with its referred Sequence Diagram is done, the actual gates of the reference must match the formal gates of the sequence diagram.\r\nMore implicitly the unnamed gate of the atomic fragment match adjacent fragment gates.\r\nExpression gates are found on the border of the expression and they serve both as formal and actual gates. (Details to be explained other place)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (partDecompositionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A part decomposition is a special InteractionReference that defines the behavior within one interacting entity (Part) in one sequence diagram." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interactionOperandEClass, 
		   source, 
		   new String[] {
			 "documentation", "An InteractionExpressionOperand is of course an InteractionFragment such that expressions can be nested freely.\r\nAn operand may be guarded. If the guard evaluates to true, the operand is eligible in the expression, otherwise it is ignored. (very intuitively speaking, formalization has been done in Z.120 Annex B)" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (combinedFragmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "An interaction fragment that decomposes into a set of other interaction fragments under some operator.\r\nIn principle the whole sequence diagram is an combined interaction. Syntactically, however, we will have special notation for combineations such that operands may be easily distinguished.\r\nCombined interactions consist of operands and an implicit or explicit operator" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																																																																																																																
	}

	/**
	 * Initializes the annotations for <b>constraint</b>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void createConstraintAnnotations() {
		String source = "constraint"; //$NON-NLS-1$			
		addAnnotation
		  ((EOperation)elementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)elementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });													
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
		   });																																																				
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });																												
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });																																												
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });																																		
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });																											
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
		   });																											
		addAnnotation
		  ((EOperation)constraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });																		
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																
		addAnnotation
		  ((EOperation)instanceSpecificationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)instanceSpecificationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																		
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union"; //$NON-NLS-1$								
		addAnnotation
		  (getElement_OwnedElement(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getElement_Owner(), 
		   source, 
		   new String[] {
		   });																					
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)expressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)directedRelationshipEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)commentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  ((EOperation)typeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																									
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
		   });																																						
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(17), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(18), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(19), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(21), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)parameterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)parameterEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  ((EOperation)enumerationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)enumerationLiteralEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getNamespace_Member(), 
		   source, 
		   new String[] {
		   });																																			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(18), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (getFeature_FeaturingClassifier(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)constraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getConstraint_Context(), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)behavioralFeatureEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)behavioralFeatureEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getBehavioralFeature_Parameter(), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getRedefinableElement_RedefinitionContext(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)generalizationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)generalizationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)generalizationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)instanceSpecificationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)slotEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)slotEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)packageMergeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)packageMergeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)packageMergeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });																					
		addAnnotation
		  ((EOperation)behaviorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)behaviorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)behavioredClassifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)behavioredClassifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)activityEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });										
		addAnnotation
		  ((EOperation)abstractionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)extendEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)extendEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)extendEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)useCaseEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)includeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)includeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  ((EOperation)manifestationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)connectorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)connectorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)activityEdgeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)activityEdgeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getActivityEdge_InGroup(), 
		   source, 
		   new String[] {
		   });										
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)activityNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getActivityNode_InGroup(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)actionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getAction_Output(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getAction_Input(), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)objectNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)executableNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)variableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)conditionalNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)conditionalNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)loopNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)loopNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)loopNodeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)collaborationOccurrenceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)collaborationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)interactionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)interactionFragmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)interactionFragmentEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)lifelineEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)lifelineEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)messageEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)messageEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)stateInvariantEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)portEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)encapsulatedClassifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)encapsulatedClassifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)templateSignatureEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)templateSignatureEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)templateParameterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)templateParameterEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  ((EOperation)templateableElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)stringExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)stringExpressionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)parameterableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)templateParameterSubstitutionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)templateParameterSubstitutionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)changeTriggerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)signalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)signalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)timeTriggerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)createObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)destroyObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)testIdentityActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)testIdentityActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)readSelfActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)structuralFeatureActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)readStructuralFeatureActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)writeStructuralFeatureActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)addStructuralFeatureValueActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)readLinkActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  ((EOperation)clearAssociationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)readVariableActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)writeVariableActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)addVariableValueActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)applyFunctionActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)applyFunctionActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)callActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)invocationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)sendSignalActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)sendObjectActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)callOperationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  ((EOperation)stateMachineEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });																	
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  ((EOperation)interactionOccurrenceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)interactionOperandEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)interactionConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)combinedFragmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)exceptionHandlerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)joinNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)activityPartitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)readExtentActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)reclassifyObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)readIsClassifiedObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)readIsClassifiedObjectActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)startOwnedBehaviorActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)readLinkObjectEndActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)readLinkObjectEndActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)readLinkObjectEndQualifierActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)readLinkObjectEndQualifierActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)createLinkObjectActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)acceptEventActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)acceptCallActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)replyActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)raiseExceptionActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)parameterSetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)deploymentTargetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });																																									
		addAnnotation
		  ((EOperation)protocolConformanceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)protocolConformanceEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)protocolConformanceEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)protocolStateMachineEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)protocolTransitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)componentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets"; //$NON-NLS-1$										
		addAnnotation
		  (getElement_OwnedComment(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																					
		addAnnotation
		  (getMultiplicityElement_UpperValue(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMultiplicityElement_LowerValue(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getExpression_Operand(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Relationship#getRelatedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Relationship#getRelatedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getComment_BodyExpression(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getAttributes", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getClass_OwnedOperation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getClass_NestedClassifier(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClass_OwnedReception(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getType_Package(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																	
		addAnnotation
		  (getProperty_Class_(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Feature#getFeaturingClassifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getProperty_OwningAssociation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Property#getAssociation", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getNamespace", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Feature#getFeaturingClassifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProperty_RedefinedProperty(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProperty_Datatype(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Feature#getFeaturingClassifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getProperty_DefaultValue(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProperty_Qualifier(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProperty_AssociationEnd(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																								
		addAnnotation
		  (getOperation_Class_(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinitionContexts", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getNamespace", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Feature#getFeaturingClassifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOperation_Datatype(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinitionContexts", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getNamespace", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Feature#getFeaturingClassifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOperation_Precondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedRules", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOperation_Postcondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedRules", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOperation_RedefinedOperation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOperation_BodyCondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedRules", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getParameter_Operation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getParameter_DefaultValue(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getNamedElement_NameExpression(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  (getPackage_NestedPackage(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Package#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPackage_NestingPackage(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPackage_OwnedType(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Package#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPackage_PackageMerge(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPackage_AppliedProfile(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getPackageImports", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPackage_PackageExtension(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getEnumeration_OwnedLiteral(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getDataType_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Classifier#getAttributes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDataType_OwnedOperation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Classifier#getFeatures", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getEnumerationLiteral_Enumeration(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getNamespace_OwnedRule(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getNamespace_ImportedMember(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getNamespace_ElementImport(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getNamespace_PackageImport(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																									
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifier_InheritedMember(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifier_Generalization(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifier_RedefinedClassifier(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifier_Substitution(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getClientDependencies", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifier_OwnedUseCase(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifier_Representation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getOccurrences", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifier_Occurrence(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getConstraint_Namespace(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Constraint#getContext", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getConstraint_Specification(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getBehavioralFeature_Parameter(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavioralFeature_FormalParameter(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.BehavioralFeature#getParameters", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavioralFeature_ReturnResult(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.BehavioralFeature#getParameters", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																	
		addAnnotation
		  (getGeneralization_Specific(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGeneralization_General(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getInstanceSpecification_Slot(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInstanceSpecification_Specification(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getSlot_OwningInstance(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSlot_Value(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																		
		addAnnotation
		  (getElementImport_ImportedElement(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getElementImport_ImportingNamespace(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getPackageImport_ImportedPackage(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPackageImport_ImportingNamespace(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getAssociation_OwnedEnd(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Association#getMemberEnds", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssociation_EndType(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Relationship#getRelatedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAssociation_MemberEnd(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getPackageMerge_MergingPackage(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPackageMerge_MergedPackage(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getProfile_OwnedStereotype(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Package#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProfile_MetaclassReference(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getElementImports", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProfile_MetamodelReference(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getPackageImports", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getProfileApplication_ImportedProfile(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.PackageImport#getImportedPackage", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });														
		addAnnotation
		  (getBehavior_RedefinedBehavior(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavior_Parameter(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavior_Precondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedRules", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavior_Postcondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedRules", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getBehavioredClassifier_OwnedBehavior(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getBehavioredClassifier_ClassifierBehavior(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavioredClassifier_Implementation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getClientDependencies", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavioredClassifier_OwnedTrigger(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getActivity_Edge(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivity_Group(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivity_Node(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getActivity_Action(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Activity#getNodes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivity_StructuredNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Activity#getNodes", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Activity#getGroups", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getAbstraction_Mapping(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getRealization_Abstraction(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwner", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Dependency#getClients", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRealization_RealizingClassifier(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Dependency#getSuppliers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getSubstitution_Contract(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Dependency#getSuppliers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSubstitution_SubstitutingClassifier(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Dependency#getClients", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getSources", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getExtend_ExtendedCase(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExtend_Extension(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExtend_Condition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getUseCase_Include(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getUseCase_Extend(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getUseCase_ExtensionPoint(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getInclude_IncludingCase(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInclude_Addition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getArtifact_Manifestation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getClientDependencies", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArtifact_OwnedOperation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArtifact_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getAttributes", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getManifestation_UtilizedElement(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Dependency#getSuppliers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getConnector_RedefinedConnector(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getConnector_End(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getStructuredClassifier_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.StructuredClassifier#getRoles", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Classifier#getAttributes", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStructuredClassifier_OwnedConnector(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getActivityEdge_Activity(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getActivityEdge_Guard(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getActivityEdge_InStructuredNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityEdge#getInGroups", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityEdge_InPartition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityEdge#getInGroups", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityEdge_Weight(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });														
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getActivityGroup_ActivityGroup_activity(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getActivityNode_Activity(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getActivityNode_InStructuredNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityNode#getInGroups", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityNode_InPartition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityNode#getInGroups", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityNode_InInterruptibleRegion(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityNode#getInGroups", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getAction_Output(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getAction_Input(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAction_LocalPrecondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getAction_LocalPostcondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getObjectNode_UpperBound(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getExecutableNode_Handler(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getInterface_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getAttributes", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterface_OwnedOperation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterface_RedefinedInterface(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterface_NestedClassifier(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterface_OwnedReception(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterface_Protocol(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getImplementation_Contract(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Dependency#getSuppliers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getImplementation_ImplementingClassifier(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Dependency#getClients", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getSources", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getVariable_Scope(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getStructuredActivityNode_Variable(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getConditionalNode_Clause(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getConditionalNode_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getLoopNode_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLoopNode_LoopVariable(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLoopNode_LoopVariableInput(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCollaborationOccurrence_RoleBinding(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCollaboration_CollaborationRole(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.StructuredClassifier#getRoles", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getInteraction_Lifeline(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInteraction_Message(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInteraction_FormalGate(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getInteractionFragment_GeneralOrdering(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInteractionFragment_EnclosingOperand(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getLifeline_Interaction(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLifeline_Selector(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getMessage_Interaction(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessage_Argument(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getStateInvariant_Invariant(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getPort_RedefinedPort(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getEncapsulatedClassifier_OwnedPort(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getFeatures", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getTemplateSignature_OwnedParameter(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.TemplateSignature#getParameters", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTemplateSignature_Template(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getTemplateParameter_Signature(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTemplateParameter_OwnedParameteredElement(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.TemplateParameter#getParameteredElement", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTemplateParameter_OwnedDefault(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.TemplateParameter#getDefault", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getTemplateableElement_TemplateBinding(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTemplateableElement_OwnedTemplateSignature(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getStringExpression_SubExpression(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStringExpression_OwningExpression(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getParameterableElement_OwningParameter(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.ParameterableElement#getTemplateParameter", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getTemplateBinding_BoundElement(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getSources", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTemplateBinding_Signature(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTemplateBinding_ParameterSubstitution(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getTemplateParameterSubstitution_TemplateBinding(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTemplateParameterSubstitution_OwnedActual(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.TemplateParameterSubstitution#getActuals", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getChangeTrigger_ChangeExpression(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getSignal_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getAttributes", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getTimeTrigger_When(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCreateObjectAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getDestroyObjectAction_Target(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getTestIdentityAction_First(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTestIdentityAction_Second(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTestIdentityAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReadSelfAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getStructuralFeatureAction_Object(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReadStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getWriteStructuralFeatureAction_Value(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getAddStructuralFeatureValueAction_InsertAt(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReadLinkAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getClearAssociationAction_Object(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReadVariableAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getWriteVariableAction_Value(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getAddVariableValueAction_InsertAt(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getApplyFunctionAction_Argument(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getApplyFunctionAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCallAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getInvocationAction_Argument(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getSendSignalAction_Target(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getSendObjectAction_Target(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getCallOperationAction_Target(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getStateMachine_Region(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStateMachine_ConnectionPoint(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getRegion_Subvertex(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRegion_Transition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRegion_StateMachine(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRegion_State(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  (getState_Connection(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getState_Region(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getState_Entry(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getState_Exit(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getState_DoActivity(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getState_StateInvariant(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  (getTransition_Container(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTransition_Guard(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTransition_Effect(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getInteractionOccurrence_ActualGate(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getInteractionOperand_Guard(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getInteractionConstraint_Minint(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInteractionConstraint_Maxint(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getCombinedFragment_Operand(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCombinedFragment_CfragmentGate(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getExceptionHandler_ProtectedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getJoinNode_JoinSpec(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getActivityPartition_SuperPartition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getSuperGroup", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReadExtentAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReclassifyObjectAction_Object(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getReadIsClassifiedObjectAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReadIsClassifiedObjectAction_Object(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getStartOwnedBehaviorAction_Object(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getReadLinkObjectEndAction_Object(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReadLinkObjectEndAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Object(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getCreateLinkObjectAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getAcceptEventAction_Result(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getAcceptCallAction_ReturnInformation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getOutputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReplyAction_ReplyValue(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReplyAction_ReturnInformation(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getRaiseExceptionAction_Exception(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Action#getInputs", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getParameterSet_Condition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getDeployment_DeployedArtifact(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Dependency#getSuppliers", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDeployment_Location(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Dependency#getClients", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDeployment_Configuration(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getDeploymentTarget_Deployment(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getClientDependencies", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																											
		addAnnotation
		  (getProtocolConformance_SpecificMachine(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getSources", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProtocolConformance_GeneralMachine(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.DirectedRelationship#getTargets", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getProtocolStateMachine_Conformance(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getProtocolTransition_PostCondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProtocolTransition_PreCondition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Transition#getGuard", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getComponent_Realization(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getClientDependencies", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
	}

	/**
	 * Initializes the annotations for <b>feature</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createFeatureAnnotations() {
		String source = "feature"; //$NON-NLS-1$																												
		addAnnotation
		  ((EOperation)multiplicityElementEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  ((EOperation)expressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)directedRelationshipEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "relatedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  ((EOperation)commentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "defaultValueLiteral", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "isAbstract", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Boolean" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "defaultValueLiteral", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "isAbstract", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Boolean" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedAttribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "class_", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Property", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "general", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Property", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  ((EOperation)typeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });																					
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "defaultValueLiteral", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "isReadOnly", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Boolean" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "defaultValueLiteral", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "isReadOnly", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Boolean" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });																						
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "raisedException", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Type", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "isOrdered", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Boolean" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "isUnique", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Boolean" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "lower", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Integer" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "upper", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.UnlimitedNatural" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "formalParameter", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Parameter", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "type", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Type", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "type", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Type", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinitionContext", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(17), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(18), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(19), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(20), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedRule", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Constraint", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(21), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)parameterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)parameterEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });															
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)namedElementEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "packageImport", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "importingNamespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.PackageImport", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  ((EOperation)enumerationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Property", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)enumerationLiteralEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)namespaceEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																				
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "member", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(17), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Dependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(18), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });																		
		addAnnotation
		  ((EOperation)constraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  ((EOperation)behavioralFeatureEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "member", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)behavioralFeatureEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  ((EOperation)redefinableElementEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)generalizationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)generalizationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)generalizationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)instanceSpecificationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)slotEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)slotEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)packageableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "visibility", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.VisibilityKind" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageableElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "visibility", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.VisibilityKind" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)elementImportEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "relatedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)associationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "member", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)packageMergeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageMergeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)packageMergeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)profileEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "elementImport", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "importingNamespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.ElementImport", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)profileEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "packageImport", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "importingNamespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.PackageImport", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)profileApplicationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "importedPackage", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Package", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)extensionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedEnd", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.ExtensionEnd", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)extensionEndEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "type", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Stereotype", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)extensionEndEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "type", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Stereotype", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)behaviorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)behaviorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)behaviorEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedRule", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Constraint", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)behavioredClassifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)behavioredClassifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)behavioredClassifierEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Dependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)activityEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  ((EOperation)abstractionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "supplier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "supplier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)extendEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)extendEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)extendEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)useCaseEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)includeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)includeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Dependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Property", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)manifestationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "supplier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)manifestationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)connectorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)connectorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Property", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "member", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredClassifierEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)activityEdgeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)activityEdgeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "subgroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "superGroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.ActivityGroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "containedEdge", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "inGroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.ActivityEdge", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "containedNode", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "inGroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.ActivityNode", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "node", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "node", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  ((EOperation)activityNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  ((EOperation)actionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)objectNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)executableNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Property", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)interfaceEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "supplier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)variableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "structuredNode", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "structuredNode", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activityGroup_activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "group", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "activityGroup_activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "group", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)conditionalNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)conditionalNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)loopNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)loopNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)loopNodeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)collaborationOccurrenceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)collaborationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "role", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.ConnectableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)interactionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)interactionFragmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)interactionFragmentEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)lifelineEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)lifelineEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)messageEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)messageEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)eventOccurrenceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "covered", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Lifeline", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateInvariantEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "covered", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Lifeline", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateInvariantEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)portEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)encapsulatedClassifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "featuringClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Feature", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)encapsulatedClassifierEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)templateSignatureEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)templateSignatureEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)templateParameterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)templateParameterEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  ((EOperation)templateableElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)stringExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stringExpressionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)parameterableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)templateBindingEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)templateParameterSubstitutionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)templateParameterSubstitutionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)changeTriggerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)signalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Property", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)signalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)timeTriggerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)createObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)destroyObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)testIdentityActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)testIdentityActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)readSelfActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)structuralFeatureActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)readStructuralFeatureActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)writeStructuralFeatureActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)addStructuralFeatureValueActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)readLinkActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)linkEndCreationDataEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "qualifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.QualifierValue", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)createLinkActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "endData", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.LinkEndCreationData", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)clearAssociationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)readVariableActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)writeVariableActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)addVariableValueActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)applyFunctionActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)applyFunctionActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)callActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)invocationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)sendSignalActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)sendObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "argument", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)sendObjectActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)callOperationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)stateMachineEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateMachineEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinitionContext", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateMachineEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinitionContext", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinitionContext", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedMember", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "namespace", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  ((EOperation)vertexEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinitionContext", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "redefinedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.RedefinableElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  ((EOperation)interactionOccurrenceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)interactionOperandEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)interactionConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)combinedFragmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)exceptionHandlerEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)joinNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)activityPartitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "superGroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.ActivityGroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "subgroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  ((EOperation)readExtentActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)reclassifyObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)readIsClassifiedObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)readIsClassifiedObjectActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)startOwnedBehaviorActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)readLinkObjectEndActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)readLinkObjectEndActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)readLinkObjectEndQualifierActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)readLinkObjectEndQualifierActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)createLinkObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "endData", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.LinkEndCreationData", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)createLinkObjectActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)acceptEventActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)acceptCallActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "trigger", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.CallTrigger", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)acceptCallActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "output", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.OutputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)replyActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)raiseExceptionActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "input", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)parameterSetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "supplier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.NamedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  ((EOperation)deploymentTargetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)deploymentTargetEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Dependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)nodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "nestedClassifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Classifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)timeObservationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "value", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)timeObservationActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "value", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)durationIntervalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "min", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Duration", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationIntervalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "max", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Duration", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)timeConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "specification", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.TimeInterval", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)timeConstraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "specification", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.TimeInterval", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)intervalConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "specification", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Interval", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)intervalConstraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "specification", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Interval", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)timeIntervalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "max", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.TimeExpression", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)timeIntervalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "min", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.TimeExpression", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationObservationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "value", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationObservationActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "value", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.InputPin", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)durationConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "specification", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.DurationInterval", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationConstraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "specification", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.DurationInterval", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)protocolConformanceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "source", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)protocolConformanceEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)protocolConformanceEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "target", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)protocolStateMachineEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  ((EOperation)protocolTransitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)protocolTransitionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "guard", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Constraint", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "true" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)componentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "ownedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "owner", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)componentEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "clientDependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite", "client", //$NON-NLS-1$ //$NON-NLS-2$
			 "derived", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Dependency", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines"; //$NON-NLS-1$																																																					
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#isAbstract", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#isAbstract", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.StructuredClassifier#getOwnedAttributes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getClass_SuperClass(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Classifier#getGenerals", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																										
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.StructuralFeature#isReadOnly", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)propertyEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.StructuralFeature#isReadOnly", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.BehavioralFeature#getRaisedExceptions", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.MultiplicityElement#isOrdered", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.MultiplicityElement#isUnique", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.MultiplicityElement#getLower", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.MultiplicityElement#getUpper", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Operation#getOwnedParameters", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.BehavioralFeature#getFormalParameters", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.TypedElement#getType", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.TypedElement#getType", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																										
		addAnnotation
		  (getPackage_OwnedMember(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																																																																
		addAnnotation
		  (getConstraint_Namespace(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getNamespace", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																															
		addAnnotation
		  (getPackageableElement_PackageableElement_visibility(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.NamedElement#getVisibility", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																								
		addAnnotation
		  ((EOperation)extensionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Association#getOwnedEnds", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)extensionEndEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.TypedElement#getType", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)extensionEndEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.TypedElement#getType", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																							
		addAnnotation
		  (getBehavioredClassifier_OwnedStateMachine(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.BehavioredClassifier#getOwnedBehaviors", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																																																																				
		addAnnotation
		  (getActivityEdge_RedefinedElement(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																						
		addAnnotation
		  (getActivityGroup_ActivityGroup_activity(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityNode#getActivity", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getActivityNode_RedefinedElement(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																															
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityNode#getActivity", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.ActivityGroup#getActivityGroup_activity", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityNode#getActivity", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.ActivityGroup#getActivityGroup_activity", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getStructuredActivityNode_ContainedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getContainedNodes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStructuredActivityNode_ContainedEdge(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getContainedEdges", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																		
		addAnnotation
		  ((EOperation)eventOccurrenceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.InteractionFragment#getCovereds", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateInvariantEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.InteractionFragment#getCovereds", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																																																																									
		addAnnotation
		  ((EOperation)linkEndCreationDataEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.LinkEndData#getQualifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)createLinkActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.LinkAction#getEndData", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																		
		addAnnotation
		  (getSendObjectAction_Request(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.InvocationAction#getArguments", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  (getStateMachine_ExtendedStateMachine(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStateMachine_StateMachine_redefinitionContext(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinitionContexts", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinitionContexts", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getRegion_ExtendedRegion(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinitionContexts", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getState_RedefinedState(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getVertex_Container(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinitionContexts", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getTransition_RedefinedTransition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.RedefinableElement#getRedefinedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																															
		addAnnotation
		  (getActivityPartition_ContainedEdge(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getContainedEdges", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityPartition_ContainedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getContainedNodes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityPartition_Subgroup(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getSubgroups", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																															
		addAnnotation
		  ((EOperation)createLinkObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.LinkAction#getEndData", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.CreateLinkAction#getEndData", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  ((EOperation)acceptCallActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.AcceptEventAction#getTriggers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getInterruptibleActivityRegion_ContainedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getContainedNodes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																									
		addAnnotation
		  (getNode_NestedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Class#getNestedClassifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getTimeObservationAction_Now(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.WriteStructuralFeatureAction#getValue", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationIntervalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Interval#getMins", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationIntervalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Interval#getMaxes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  ((EOperation)timeConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Constraint#getSpecification", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.IntervalConstraint#getSpecification", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)timeConstraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Constraint#getSpecification", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.IntervalConstraint#getSpecification", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)intervalConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Constraint#getSpecification", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)intervalConstraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Constraint#getSpecification", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)timeIntervalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Interval#getMaxes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)timeIntervalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Interval#getMins", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getDurationObservationAction_Duration(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.WriteStructuralFeatureAction#getValue", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationConstraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Constraint#getSpecification", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.IntervalConstraint#getSpecification", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  ((EOperation)durationConstraintEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Constraint#getSpecification", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.IntervalConstraint#getSpecification", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																								
		addAnnotation
		  (getComponent_OwnedMember(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>redefined</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinedAnnotations() {
		String source = "redefined"; //$NON-NLS-1$																																																												
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });																																																
		addAnnotation
		  (getProperty_Class_(), 
		   source, 
		   new String[] {
			 "eOpposite", "ownedAttribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																																																																																																																																																																																																					
		addAnnotation
		  ((EOperation)packageableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)packageableElementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																																																																																												
		addAnnotation
		  (getActivity_StructuredNode(), 
		   source, 
		   new String[] {
			 "eOpposite", "activity", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																																																									
		addAnnotation
		  (getActivityEdge_InGroup(), 
		   source, 
		   new String[] {
			 "eOpposite", "containedEdge", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)activityGroupEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
			 "eOpposite", "subgroup", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getActivityNode_InGroup(), 
		   source, 
		   new String[] {
			 "eOpposite", "containedNode", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.containment", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.lowerBound", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "eOpposite.upperBound", "-1" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																																					
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)structuredActivityNodeEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });																																																																																																																																																																																																
		addAnnotation
		  ((EOperation)sendObjectActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });										
		addAnnotation
		  ((EOperation)stateMachineEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)stateMachineEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)regionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  ((EOperation)vertexEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																																																																											
		addAnnotation
		  (getAcceptEventAction_Trigger(), 
		   source, 
		   new String[] {
			 "lowerBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "upperBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });																																						
		addAnnotation
		  ((EOperation)nodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)timeObservationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)timeObservationActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (getInterval_Min(), 
		   source, 
		   new String[] {
			 "lowerBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "upperBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterval_Max(), 
		   source, 
		   new String[] {
			 "lowerBound", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "upperBound", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });															
		addAnnotation
		  ((EOperation)durationObservationActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)durationObservationActionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																												
	}

	/**
	 * Initializes the annotations for <b>superset</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSupersetAnnotations() {
		String source = "superset"; //$NON-NLS-1$																																																																																																															
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
		   });																																								
		addAnnotation
		  ((EOperation)operationEClass.getEOperations().get(20), 
		   source, 
		   new String[] {
		   });																																												
		addAnnotation
		  ((EOperation)packageEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
		   });																																																																														
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(17), 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (getClassifier_Occurrence(), 
		   source, 
		   new String[] {
		   });																																																																																										
		addAnnotation
		  (getAssociation_MemberEnd(), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)profileEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)profileEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  ((EOperation)profileApplicationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  ((EOperation)behaviorEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  ((EOperation)behavioredClassifierEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getBehavioredClassifier_OwnedBehavior(), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  (getActivity_Node(), 
		   source, 
		   new String[] {
		   });													
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  ((EOperation)realizationEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)substitutionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });																													
		addAnnotation
		  ((EOperation)artifactEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  ((EOperation)manifestationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });																																																																																											
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  ((EOperation)implementationEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });																																																																																								
		addAnnotation
		  (getTemplateSignature_Parameter(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (getTemplateParameter_ParameteredElement(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getTemplateParameter_Default(), 
		   source, 
		   new String[] {
		   });																
		addAnnotation
		  (getParameterableElement_TemplateParameter(), 
		   source, 
		   new String[] {
		   });																			
		addAnnotation
		  (getTemplateParameterSubstitution_Actual(), 
		   source, 
		   new String[] {
		   });																																																																																																																																																																																																																														
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)deploymentEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });										
		addAnnotation
		  ((EOperation)deploymentTargetEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });																																																				
		addAnnotation
		  ((EOperation)protocolTransitionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)componentEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });		
	}
} //UML2PackageImpl
