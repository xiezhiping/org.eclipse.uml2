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
 * $Id: UML2PackageImpl.java,v 1.17 2004/10/01 19:36:28 khussey Exp $
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
		if (isInited) return (UML2Package)EPackage.Registry.INSTANCE.getEPackage(UML2Package.eNS_URI);

		// Obtain or create and register package
		UML2PackageImpl theUML2Package = (UML2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof UML2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new UML2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackageImpl.init();

		// Create package meta-data objects
		theUML2Package.createPackageContents();

		// Initialize created meta-data
		theUML2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUML2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UML2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUML2Package.freeze();

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

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);
		createEReference(namedElementEClass, NAMED_ELEMENT__CLIENT_DEPENDENCY);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAME_EXPRESSION);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_RULE);
		createEReference(namespaceEClass, NAMESPACE__IMPORTED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__ELEMENT_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__PACKAGE_IMPORT);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__RESULT);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__BEHAVIOR);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__SYMBOL);
		createEReference(expressionEClass, EXPRESSION__OPERAND);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__ANNOTATED_ELEMENT);
		createEReference(commentEClass, COMMENT__BODY_EXPRESSION);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

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

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
		createEAttribute(redefinableElementEClass, REDEFINABLE_ELEMENT__IS_LEAF);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEAttribute(generalizationEClass, GENERALIZATION__IS_SUBSTITUTABLE);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZATION_SET);

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

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COVERING);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__POWERTYPE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATION);

		associationClassEClass = createEClass(ASSOCIATION_CLASS);

		informationItemEClass = createEClass(INFORMATION_ITEM);
		createEReference(informationItemEClass, INFORMATION_ITEM__REPRESENTED);

		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZATION);
		createEReference(informationFlowEClass, INFORMATION_FLOW__CONVEYED);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__VIEWPOINT);

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

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__FILE_NAME);
		createEReference(artifactEClass, ARTIFACT__NESTED_ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__MANIFESTATION);
		createEReference(artifactEClass, ARTIFACT__OWNED_OPERATION);
		createEReference(artifactEClass, ARTIFACT__OWNED_ATTRIBUTE);

		manifestationEClass = createEClass(MANIFESTATION);
		createEReference(manifestationEClass, MANIFESTATION__UTILIZED_ELEMENT);

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

		collaborationOccurrenceEClass = createEClass(COLLABORATION_OCCURRENCE);
		createEReference(collaborationOccurrenceEClass, COLLABORATION_OCCURRENCE__TYPE);
		createEReference(collaborationOccurrenceEClass, COLLABORATION_OCCURRENCE__ROLE_BINDING);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__COLLABORATION_ROLE);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__IS_BEHAVIOR);
		createEAttribute(portEClass, PORT__IS_SERVICE);
		createEReference(portEClass, PORT__REQUIRED);
		createEReference(portEClass, PORT__REDEFINED_PORT);
		createEReference(portEClass, PORT__PROVIDED);
		createEReference(portEClass, PORT__PROTOCOL);

		encapsulatedClassifierEClass = createEClass(ENCAPSULATED_CLASSIFIER);
		createEReference(encapsulatedClassifierEClass, ENCAPSULATED_CLASSIFIER__OWNED_PORT);

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

		dataStoreNodeEClass = createEClass(DATA_STORE_NODE);

		interruptibleActivityRegionEClass = createEClass(INTERRUPTIBLE_ACTIVITY_REGION);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE);

		parameterSetEClass = createEClass(PARAMETER_SET);
		createEReference(parameterSetEClass, PARAMETER_SET__PARAMETER);
		createEReference(parameterSetEClass, PARAMETER_SET__CONDITION);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__IS_INDIRECTLY_INSTANTIATED);
		createEReference(componentEClass, COMPONENT__REQUIRED);
		createEReference(componentEClass, COMPONENT__PROVIDED);
		createEReference(componentEClass, COMPONENT__REALIZATION);
		createEReference(componentEClass, COMPONENT__OWNED_MEMBER);

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

		protocolConformanceEClass = createEClass(PROTOCOL_CONFORMANCE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__GENERAL_MACHINE);

		protocolStateMachineEClass = createEClass(PROTOCOL_STATE_MACHINE);
		createEReference(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE__CONFORMANCE);

		protocolTransitionEClass = createEClass(PROTOCOL_TRANSITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__POST_CONDITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__REFERRED);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__PRE_CONDITION);

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

		deploymentSpecificationEClass = createEClass(DEPLOYMENT_SPECIFICATION);
		createEAttribute(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION);
		createEAttribute(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
		callConcurrencyKindEEnum = createEEnum(CALL_CONCURRENCY_KIND);
		messageKindEEnum = createEEnum(MESSAGE_KIND);
		messageSortEEnum = createEEnum(MESSAGE_SORT);
		expansionKindEEnum = createEEnum(EXPANSION_KIND);
		interactionOperatorEEnum = createEEnum(INTERACTION_OPERATOR);
		transitionKindEEnum = createEEnum(TRANSITION_KIND);
		pseudostateKindEEnum = createEEnum(PSEUDOSTATE_KIND);
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
		namedElementEClass.getESuperTypes().add(this.getTemplateableElement());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		valueSpecificationEClass.getESuperTypes().add(this.getTypedElement());
		valueSpecificationEClass.getESuperTypes().add(this.getParameterableElement());
		expressionEClass.getESuperTypes().add(this.getOpaqueExpression());
		commentEClass.getESuperTypes().add(this.getTemplateableElement());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
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
		packageEClass.getESuperTypes().add(this.getNamespace());
		packageEClass.getESuperTypes().add(this.getPackageableElement());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		enumerationLiteralEClass.getESuperTypes().add(this.getInstanceSpecification());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		classifierEClass.getESuperTypes().add(this.getNamespace());
		classifierEClass.getESuperTypes().add(this.getType());
		classifierEClass.getESuperTypes().add(this.getRedefinableElement());
		featureEClass.getESuperTypes().add(this.getRedefinableElement());
		constraintEClass.getESuperTypes().add(this.getPackageableElement());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalUnlimitedNaturalEClass.getESuperTypes().add(this.getLiteralSpecification());
		behavioralFeatureEClass.getESuperTypes().add(this.getNamespace());
		behavioralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
		structuralFeatureEClass.getESuperTypes().add(this.getMultiplicityElement());
		instanceSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
		instanceSpecificationEClass.getESuperTypes().add(this.getDeploymentTarget());
		instanceSpecificationEClass.getESuperTypes().add(this.getDeployedArtifact());
		slotEClass.getESuperTypes().add(this.getElement());
		instanceValueEClass.getESuperTypes().add(this.getValueSpecification());
		redefinableElementEClass.getESuperTypes().add(this.getNamedElement());
		generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());
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
		generalizationSetEClass.getESuperTypes().add(this.getPackageableElement());
		associationClassEClass.getESuperTypes().add(this.getClass_());
		associationClassEClass.getESuperTypes().add(this.getAssociation());
		informationItemEClass.getESuperTypes().add(this.getClassifier());
		informationFlowEClass.getESuperTypes().add(this.getPackageableElement());
		informationFlowEClass.getESuperTypes().add(this.getDirectedRelationship());
		modelEClass.getESuperTypes().add(this.getPackage());
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
		artifactEClass.getESuperTypes().add(this.getClassifier());
		artifactEClass.getESuperTypes().add(this.getDeployedArtifact());
		manifestationEClass.getESuperTypes().add(this.getAbstraction());
		actorEClass.getESuperTypes().add(this.getClassifier());
		extendEClass.getESuperTypes().add(this.getNamedElement());
		extendEClass.getESuperTypes().add(this.getDirectedRelationship());
		useCaseEClass.getESuperTypes().add(this.getBehavioredClassifier());
		extensionPointEClass.getESuperTypes().add(this.getRedefinableElement());
		includeEClass.getESuperTypes().add(this.getNamedElement());
		includeEClass.getESuperTypes().add(this.getDirectedRelationship());
		collaborationOccurrenceEClass.getESuperTypes().add(this.getNamedElement());
		collaborationEClass.getESuperTypes().add(this.getBehavioredClassifier());
		collaborationEClass.getESuperTypes().add(this.getStructuredClassifier());
		portEClass.getESuperTypes().add(this.getProperty());
		encapsulatedClassifierEClass.getESuperTypes().add(this.getStructuredClassifier());
		callTriggerEClass.getESuperTypes().add(this.getMessageTrigger());
		messageTriggerEClass.getESuperTypes().add(this.getTrigger());
		changeTriggerEClass.getESuperTypes().add(this.getTrigger());
		triggerEClass.getESuperTypes().add(this.getNamedElement());
		receptionEClass.getESuperTypes().add(this.getBehavioralFeature());
		signalEClass.getESuperTypes().add(this.getClassifier());
		signalTriggerEClass.getESuperTypes().add(this.getMessageTrigger());
		timeTriggerEClass.getESuperTypes().add(this.getTrigger());
		anyTriggerEClass.getESuperTypes().add(this.getMessageTrigger());
		variableEClass.getESuperTypes().add(this.getConnectableElement());
		variableEClass.getESuperTypes().add(this.getTypedElement());
		variableEClass.getESuperTypes().add(this.getMultiplicityElement());
		structuredActivityNodeEClass.getESuperTypes().add(this.getAction());
		structuredActivityNodeEClass.getESuperTypes().add(this.getNamespace());
		structuredActivityNodeEClass.getESuperTypes().add(this.getActivityGroup());
		conditionalNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		clauseEClass.getESuperTypes().add(this.getElement());
		loopNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
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
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		flowFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		centralBufferNodeEClass.getESuperTypes().add(this.getObjectNode());
		activityPartitionEClass.getESuperTypes().add(this.getNamedElement());
		activityPartitionEClass.getESuperTypes().add(this.getActivityGroup());
		expansionNodeEClass.getESuperTypes().add(this.getObjectNode());
		expansionRegionEClass.getESuperTypes().add(this.getStructuredActivityNode());
		exceptionHandlerEClass.getESuperTypes().add(this.getElement());
		interactionOccurrenceEClass.getESuperTypes().add(this.getInteractionFragment());
		gateEClass.getESuperTypes().add(this.getMessageEnd());
		partDecompositionEClass.getESuperTypes().add(this.getInteractionOccurrence());
		interactionOperandEClass.getESuperTypes().add(this.getNamespace());
		interactionOperandEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionConstraintEClass.getESuperTypes().add(this.getConstraint());
		combinedFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		continuationEClass.getESuperTypes().add(this.getInteractionFragment());
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
		dataStoreNodeEClass.getESuperTypes().add(this.getCentralBufferNode());
		interruptibleActivityRegionEClass.getESuperTypes().add(this.getActivityGroup());
		parameterSetEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getClass_());
		deploymentEClass.getESuperTypes().add(this.getDependency());
		deployedArtifactEClass.getESuperTypes().add(this.getNamedElement());
		deploymentTargetEClass.getESuperTypes().add(this.getNamedElement());
		nodeEClass.getESuperTypes().add(this.getClass_());
		nodeEClass.getESuperTypes().add(this.getDeploymentTarget());
		deviceEClass.getESuperTypes().add(this.getNode());
		executionEnvironmentEClass.getESuperTypes().add(this.getNode());
		communicationPathEClass.getESuperTypes().add(this.getAssociation());
		protocolConformanceEClass.getESuperTypes().add(this.getDirectedRelationship());
		protocolStateMachineEClass.getESuperTypes().add(this.getStateMachine());
		protocolTransitionEClass.getESuperTypes().add(this.getTransition());
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
		deploymentSpecificationEClass.getESuperTypes().add(this.getArtifact());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(elementEClass, this.getBoolean(), "validateNotOwnSelf"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(elementEClass, this.getBoolean(), "validateHasOwner"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(elementEClass, this.getSet(), "allOwnedElements"); //$NON-NLS-1$

		addEOperation(elementEClass, this.getBoolean(), "mustBeOwned"); //$NON-NLS-1$

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMultiplicityElement_IsOrdered(), this.getBoolean(), "isOrdered", "false", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMultiplicityElement_IsUnique(), this.getBoolean(), "isUnique", "true", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMultiplicityElement_Lower(), this.getInteger(), "lower", "1", 0, 1, MultiplicityElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMultiplicityElement_Upper(), this.getUnlimitedNatural(), "upper", "1", 0, 1, MultiplicityElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getMultiplicityElement_UpperValue(), this.getValueSpecification(), null, "upperValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMultiplicityElement_LowerValue(), this.getValueSpecification(), null, "lowerValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNamedElement_Name(), this.getString(), "name", "", 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getNamedElement_QualifiedName(), this.getString(), "qualifiedName", "", 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getNamedElement_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamedElement_ClientDependency(), this.getDependency(), this.getDependency_Client(), "clientDependency", null, 0, -1, NamedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamedElement_NameExpression(), this.getStringExpression(), null, "nameExpression", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_OwnedRule(), this.getConstraint(), this.getConstraint_Namespace(), "ownedRule", null, 0, -1, Namespace.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_ImportedMember(), this.getPackageableElement(), null, "importedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_ElementImport(), this.getElementImport(), this.getElementImport_ImportingNamespace(), "elementImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getNamespace_PackageImport(), this.getPackageImport(), this.getPackageImport_ImportingNamespace(), "packageImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOpaqueExpression_Body(), this.getString(), "body", "", 0, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOpaqueExpression_Language(), this.getString(), "language", "", 0, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getOpaqueExpression_Result(), this.getParameter(), null, "result", null, 0, 1, OpaqueExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOpaqueExpression_Behavior(), this.getBehavior(), null, "behavior", null, 0, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getInteger(), "integerValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getBoolean(), "booleanValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getString(), "stringValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getUnlimitedNatural(), "unlimitedValue"); //$NON-NLS-1$

		addEOperation(valueSpecificationEClass, this.getBoolean(), "isNull"); //$NON-NLS-1$

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExpression_Symbol(), this.getString(), "symbol", "", 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getExpression_Operand(), this.getValueSpecification(), null, "operand", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(expressionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComment_Body(), this.getString(), "body", "", 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getComment_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComment_BodyExpression(), this.getStringExpression(), null, "bodyExpression", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(commentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(directedRelationshipEClass, ecorePackage.getEEList(), "getRelatedElements"); //$NON-NLS-1$

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(classEClass, org.eclipse.uml2.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClass_OwnedOperation(), this.getOperation(), this.getOperation_Class_(), "ownedOperation", null, 0, -1, org.eclipse.uml2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, org.eclipse.uml2.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_Extension(), this.getExtension(), this.getExtension_Metaclass(), "extension", null, 0, -1, org.eclipse.uml2.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, org.eclipse.uml2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getClass_IsActive(), this.getBoolean(), "isActive", null, 0, 1, org.eclipse.uml2.Class.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClass_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, org.eclipse.uml2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getType_Package(), this.getPackage(), this.getPackage_OwnedType(), "package", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(typeEClass, this.getBoolean(), "conformsTo"); //$NON-NLS-1$
		addEParameter(op, this.getType(), "other"); //$NON-NLS-1$

		addEOperation(typeEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProperty_Default(), this.getString(), "default", "", 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProperty_IsComposite(), this.getBoolean(), "isComposite", "false", 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProperty_IsDerived(), this.getBoolean(), "isDerived", "false", 0, 1, Property.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getProperty_Class_(), this.getClass_(), null, "class_", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Opposite(), this.getProperty(), null, "opposite", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProperty_IsDerivedUnion(), this.getBoolean(), "isDerivedUnion", "false", 0, 1, Property.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getProperty_OwningAssociation(), this.getAssociation(), this.getAssociation_OwnedEnd(), "owningAssociation", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_RedefinedProperty(), this.getProperty(), null, "redefinedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_SubsettedProperty(), this.getProperty(), null, "subsettedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Datatype(), this.getDataType(), this.getDataType_OwnedAttribute(), "datatype", null, 0, 1, Property.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Association(), this.getAssociation(), this.getAssociation_MemberEnd(), "association", null, 0, 1, Property.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProperty_Aggregation(), this.getAggregationKind(), "aggregation", "none", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getProperty_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_Qualifier(), this.getProperty(), this.getProperty_AssociationEnd(), "qualifier", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProperty_AssociationEnd(), this.getProperty(), this.getProperty_Qualifier(), "associationEnd", null, 0, 1, Property.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOperation_OwnedParameter(), this.getParameter(), this.getParameter_Operation(), "ownedParameter", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_Class_(), this.getClass_(), this.getClass_OwnedOperation(), "class_", null, 0, 1, Operation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOperation_IsQuery(), this.getBoolean(), "isQuery", "false", 0, 1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getOperation_Datatype(), this.getDataType(), this.getDataType_OwnedOperation(), "datatype", null, 0, 1, Operation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_RedefinedOperation(), this.getOperation(), null, "redefinedOperation", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOperation_BodyCondition(), this.getConstraint(), null, "bodyCondition", null, 0, 1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getParameter_Operation(), this.getOperation(), this.getOperation_OwnedParameter(), "operation", null, 0, 1, Parameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParameter_Default(), this.getString(), "default", "", 0, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getParameter_Direction(), this.getParameterDirectionKind(), "direction", "in", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getParameter_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParameter_IsException(), this.getBoolean(), "isException", "false", 0, 1, Parameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getParameter_IsStream(), this.getBoolean(), "isStream", "false", 0, 1, Parameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getParameter_Effect(), this.getParameterEffectKind(), "effect", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParameter_ParameterSet(), this.getParameterSet(), this.getParameterSet_Parameter(), "parameterSet", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(parameterEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(parameterEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(packageEClass, org.eclipse.uml2.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(), "nestedPackage", null, 0, -1, org.eclipse.uml2.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(), "nestingPackage", null, 0, 1, org.eclipse.uml2.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_OwnedType(), this.getType(), this.getType_Package(), "ownedType", null, 0, -1, org.eclipse.uml2.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_OwnedMember(), this.getPackageableElement(), null, "ownedMember", null, 0, -1, org.eclipse.uml2.Package.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_PackageMerge(), this.getPackageMerge(), this.getPackageMerge_MergingPackage(), "packageMerge", null, 0, -1, org.eclipse.uml2.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_AppliedProfile(), this.getProfileApplication(), null, "appliedProfile", null, 0, -1, org.eclipse.uml2.Package.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_PackageExtension(), this.getPackageMerge(), null, "packageExtension", null, 0, -1, org.eclipse.uml2.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(enumerationEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDataType_OwnedAttribute(), this.getProperty(), this.getProperty_Datatype(), "ownedAttribute", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataType_OwnedOperation(), this.getOperation(), this.getOperation_Datatype(), "ownedOperation", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(dataTypeEClass, this.getSet(), "inherit"); //$NON-NLS-1$
		addEParameter(op, this.getSet(), "inhs"); //$NON-NLS-1$

		addEOperation(dataTypeEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(dataTypeEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(dataTypeEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_OwnedLiteral(), "enumeration", null, 0, 1, EnumerationLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(enumerationLiteralEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClassifier_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(), "feature", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getClassifier_IsAbstract(), this.getBoolean(), "isAbstract", "false", 0, 1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getClassifier_InheritedMember(), this.getNamedElement(), null, "inheritedMember", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(), "generalization", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_RedefinedClassifier(), this.getClassifier(), null, "redefinedClassifier", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Substitution(), this.getSubstitution(), this.getSubstitution_SubstitutingClassifier(), "substitution", null, 0, -1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_PowertypeExtent(), this.getGeneralizationSet(), this.getGeneralizationSet_Powertype(), "powertypeExtent", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_OwnedUseCase(), this.getUseCase(), null, "ownedUseCase", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_UseCase(), this.getUseCase(), this.getUseCase_Subject(), "useCase", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Representation(), this.getCollaborationOccurrence(), null, "representation", null, 0, 1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassifier_Occurrence(), this.getCollaborationOccurrence(), null, "occurrence", null, 0, -1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFeature_FeaturingClassifier(), this.getClassifier(), this.getClassifier_Feature(), "featuringClassifier", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFeature_IsStatic(), this.getBoolean(), "isStatic", "false", 0, 1, Feature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConstraint_Context(), this.getNamespace(), null, "context", null, 0, 1, Constraint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstraint_Namespace(), this.getNamespace(), this.getNamespace_OwnedRule(), "namespace", null, 0, 1, Constraint.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstraint_Specification(), this.getValueSpecification(), null, "specification", null, 1, 1, Constraint.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstraint_ConstrainedElement(), this.getElement(), null, "constrainedElement", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(constraintEClass, this.getBoolean(), "validateNotApplyToSelf"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(constraintEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLiteralBoolean_Value(), this.getBoolean(), "value", null, 0, 1, LiteralBoolean.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(literalBooleanEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalBooleanEClass, this.getBoolean(), "booleanValue"); //$NON-NLS-1$

		initEClass(literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLiteralString_Value(), this.getString(), "value", "", 0, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(literalStringEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalStringEClass, this.getString(), "stringValue"); //$NON-NLS-1$

		initEClass(literalNullEClass, LiteralNull.class, "LiteralNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(literalNullEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalNullEClass, this.getBoolean(), "isNull"); //$NON-NLS-1$

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLiteralInteger_Value(), this.getInteger(), "value", null, 0, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(literalIntegerEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalIntegerEClass, this.getInteger(), "integerValue"); //$NON-NLS-1$

		initEClass(literalUnlimitedNaturalEClass, LiteralUnlimitedNatural.class, "LiteralUnlimitedNatural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLiteralUnlimitedNatural_Value(), this.getUnlimitedNatural(), "value", null, 0, 1, LiteralUnlimitedNatural.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(literalUnlimitedNaturalEClass, this.getBoolean(), "isComputable"); //$NON-NLS-1$

		addEOperation(literalUnlimitedNaturalEClass, this.getUnlimitedNatural(), "unlimitedValue"); //$NON-NLS-1$

		initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBehavioralFeature_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, BehavioralFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_FormalParameter(), this.getParameter(), null, "formalParameter", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_ReturnResult(), this.getParameter(), null, "returnResult", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_RaisedException(), this.getType(), null, "raisedException", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBehavioralFeature_IsAbstract(), this.getBoolean(), "isAbstract", null, 0, 1, BehavioralFeature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioralFeature_Method(), this.getBehavior(), this.getBehavior_Specification(), "method", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBehavioralFeature_Concurrency(), this.getCallConcurrencyKind(), "concurrency", null, 0, 1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(behavioralFeatureEClass, this.getBoolean(), "isDistinguishableFrom"); //$NON-NLS-1$
		addEParameter(op, this.getNamedElement(), "n"); //$NON-NLS-1$
		addEParameter(op, this.getNamespace(), "ns"); //$NON-NLS-1$

		addEOperation(behavioralFeatureEClass, ecorePackage.getEEList(), "getMembers"); //$NON-NLS-1$

		addEOperation(behavioralFeatureEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStructuralFeature_IsReadOnly(), this.getBoolean(), "isReadOnly", "false", 0, 1, StructuralFeature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(instanceSpecificationEClass, InstanceSpecification.class, "InstanceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInstanceSpecification_Slot(), this.getSlot(), this.getSlot_OwningInstance(), "slot", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInstanceSpecification_Classifier(), this.getClassifier(), null, "classifier", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInstanceSpecification_Specification(), this.getValueSpecification(), null, "specification", null, 0, 1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(instanceSpecificationEClass, this.getBoolean(), "validateSlotsAreDefined"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		op = addEOperation(instanceSpecificationEClass, this.getBoolean(), "validateNoDuplicateSlots"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(instanceSpecificationEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSlot_OwningInstance(), this.getInstanceSpecification(), this.getInstanceSpecification_Slot(), "owningInstance", null, 1, 1, Slot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSlot_Value(), this.getValueSpecification(), null, "value", null, 0, -1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSlot_DefiningFeature(), this.getStructuralFeature(), null, "definingFeature", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(slotEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(slotEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(instanceValueEClass, InstanceValue.class, "InstanceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInstanceValue_Instance(), this.getInstanceSpecification(), null, "instance", null, 1, 1, InstanceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(redefinableElementEClass, RedefinableElement.class, "RedefinableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRedefinableElement_RedefinitionContext(), this.getClassifier(), null, "redefinitionContext", null, 0, -1, RedefinableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRedefinableElement_IsLeaf(), this.getBoolean(), "isLeaf", "false", 0, 1, RedefinableElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

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

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGeneralization_Specific(), this.getClassifier(), this.getClassifier_Generalization(), "specific", null, 1, 1, Generalization.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGeneralization_IsSubstitutable(), this.getBoolean(), "isSubstitutable", null, 0, 1, Generalization.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralization_GeneralizationSet(), this.getGeneralizationSet(), this.getGeneralizationSet_Generalization(), "generalizationSet", null, 0, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(generalizationEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(generalizationEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(generalizationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPackageableElement_PackageableElement_visibility(), this.getVisibilityKind(), "packageableElement_visibility", null, 0, 1, PackageableElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(packageableElementEClass, this.getVisibilityKind(), "getVisibility"); //$NON-NLS-1$

		op = addEOperation(packageableElementEClass, null, "setVisibility"); //$NON-NLS-1$
		addEParameter(op, this.getVisibilityKind(), "newVisibility"); //$NON-NLS-1$

		initEClass(elementImportEClass, ElementImport.class, "ElementImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getElementImport_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getElementImport_Alias(), this.getString(), "alias", "", 0, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getElementImport_ImportedElement(), this.getPackageableElement(), null, "importedElement", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getElementImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_ElementImport(), "importingNamespace", null, 1, 1, ElementImport.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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

		initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPackageImport_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackageImport_ImportedPackage(), this.getPackage(), null, "importedPackage", null, 1, 1, PackageImport.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackageImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_PackageImport(), "importingNamespace", null, 1, 1, PackageImport.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(packageImportEClass, this.getBoolean(), "validatePublicOrPrivate"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics"); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEMap(), "context"); //$NON-NLS-1$

		addEOperation(packageImportEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(packageImportEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(packageImportEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAssociation_IsDerived(), this.getBoolean(), "isDerived", "false", 0, 1, Association.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAssociation_OwnedEnd(), this.getProperty(), this.getProperty_OwningAssociation(), "ownedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssociation_EndType(), this.getType(), null, "endType", null, 1, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssociation_MemberEnd(), this.getProperty(), this.getProperty_Association(), "memberEnd", null, 2, -1, Association.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getRelatedElements"); //$NON-NLS-1$

		addEOperation(associationEClass, ecorePackage.getEEList(), "getMembers"); //$NON-NLS-1$

		initEClass(packageMergeEClass, PackageMerge.class, "PackageMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPackageMerge_MergingPackage(), this.getPackage(), this.getPackage_PackageMerge(), "mergingPackage", null, 1, 1, PackageMerge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackageMerge_MergedPackage(), this.getPackage(), null, "mergedPackage", null, 1, 1, PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(packageMergeEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(packageMergeEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(packageMergeEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(stereotypeEClass, Stereotype.class, "Stereotype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProfile_OwnedStereotype(), this.getStereotype(), null, "ownedStereotype", null, 0, -1, Profile.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProfile_MetaclassReference(), this.getElementImport(), null, "metaclassReference", null, 0, -1, Profile.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProfile_MetamodelReference(), this.getPackageImport(), null, "metamodelReference", null, 0, -1, Profile.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(profileEClass, ecorePackage.getEEList(), "getElementImports"); //$NON-NLS-1$

		addEOperation(profileEClass, ecorePackage.getEEList(), "getPackageImports"); //$NON-NLS-1$

		initEClass(profileApplicationEClass, ProfileApplication.class, "ProfileApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProfileApplication_ImportedProfile(), this.getProfile(), null, "importedProfile", null, 1, 1, ProfileApplication.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(profileApplicationEClass, null, "setImportedPackage"); //$NON-NLS-1$
		addEParameter(op, this.getPackage(), "newImportedPackage"); //$NON-NLS-1$

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExtension_IsRequired(), this.getBoolean(), "isRequired", null, 0, 1, Extension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtension_Metaclass(), this.getClass_(), this.getClass_Extension(), "metaclass", null, 1, 1, Extension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(extensionEClass, ecorePackage.getEEList(), "getOwnedEnds"); //$NON-NLS-1$

		initEClass(extensionEndEClass, ExtensionEnd.class, "ExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(extensionEndEClass, this.getType(), "getType"); //$NON-NLS-1$

		op = addEOperation(extensionEndEClass, null, "setType"); //$NON-NLS-1$
		addEParameter(op, this.getType(), "newType"); //$NON-NLS-1$

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBehavior_IsReentrant(), this.getBoolean(), "isReentrant", null, 0, 1, Behavior.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Context(), this.getBehavioredClassifier(), this.getBehavioredClassifier_OwnedBehavior(), "context", null, 0, 1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_RedefinedBehavior(), this.getBehavior(), null, "redefinedBehavior", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Specification(), this.getBehavioralFeature(), this.getBehavioralFeature_Method(), "specification", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_FormalParameter(), this.getParameter(), null, "formalParameter", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_ReturnResult(), this.getParameter(), null, "returnResult", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavior_OwnedParameterSet(), this.getParameterSet(), null, "ownedParameterSet", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(behaviorEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(behaviorEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(behaviorEClass, ecorePackage.getEEList(), "getOwnedRules"); //$NON-NLS-1$

		initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_OwnedBehavior(), this.getBehavior(), this.getBehavior_Context(), "ownedBehavior", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_ClassifierBehavior(), this.getBehavior(), null, "classifierBehavior", null, 0, 1, BehavioredClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_Implementation(), this.getImplementation(), this.getImplementation_ImplementingClassifier(), "implementation", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_OwnedTrigger(), this.getTrigger(), null, "ownedTrigger", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehavioredClassifier_OwnedStateMachine(), this.getStateMachine(), this.getStateMachine_StateMachine_redefinitionContext(), "ownedStateMachine", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(behavioredClassifierEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(behavioredClassifierEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(behavioredClassifierEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getActivity_Body(), this.getString(), "body", "", 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getActivity_Language(), this.getString(), "language", "", 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getActivity_Edge(), this.getActivityEdge(), this.getActivityEdge_Activity(), "edge", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Group(), this.getActivityGroup(), this.getActivityGroup_ActivityGroup_activity(), "group", null, 0, -1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Node(), this.getActivityNode(), this.getActivityNode_Activity(), "node", null, 0, -1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Action(), this.getAction(), null, "action", null, 0, -1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_StructuredNode(), this.getStructuredActivityNode(), null, "structuredNode", null, 0, -1, Activity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getActivity_IsSingleExecution(), this.getBoolean(), "isSingleExecution", null, 0, 1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getActivity_IsReadOnly(), this.getBoolean(), "isReadOnly", "false", 0, 1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(activityEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDependency_Client(), this.getNamedElement(), this.getNamedElement_ClientDependency(), "client", null, 1, -1, Dependency.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDependency_Supplier(), this.getNamedElement(), null, "supplier", null, 1, -1, Dependency.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAbstraction_Mapping(), this.getOpaqueExpression(), null, "mapping", null, 0, 1, Abstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(abstractionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRealization_Abstraction(), this.getComponent(), this.getComponent_Realization(), "abstraction", null, 0, 1, Realization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRealization_RealizingClassifier(), this.getClassifier(), null, "realizingClassifier", null, 1, 1, Realization.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(realizationEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(realizationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSubstitution_Contract(), this.getClassifier(), null, "contract", null, 1, 1, Substitution.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSubstitution_SubstitutingClassifier(), this.getClassifier(), this.getClassifier_Substitution(), "substitutingClassifier", null, 1, 1, Substitution.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(substitutionEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getGeneralizationSet_IsCovering(), this.getBoolean(), "isCovering", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGeneralizationSet_IsDisjoint(), this.getBoolean(), "isDisjoint", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralizationSet_Powertype(), this.getClassifier(), this.getClassifier_PowertypeExtent(), "powertype", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralizationSet_Generalization(), this.getGeneralization(), this.getGeneralization_GeneralizationSet(), "generalization", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(associationClassEClass, AssociationClass.class, "AssociationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(informationItemEClass, InformationItem.class, "InformationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInformationItem_Represented(), this.getClassifier(), null, "represented", null, 0, -1, InformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(informationFlowEClass, InformationFlow.class, "InformationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInformationFlow_Realization(), this.getRelationship(), null, "realization", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInformationFlow_Conveyed(), this.getClassifier(), null, "conveyed", null, 1, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getModel_Viewpoint(), this.getString(), "viewpoint", "", 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(connectorEndEClass, ConnectorEnd.class, "ConnectorEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConnectorEnd_DefiningEnd(), this.getProperty(), null, "definingEnd", null, 0, 1, ConnectorEnd.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnectorEnd_Role(), this.getConnectableElement(), this.getConnectableElement_End(), "role", null, 0, 1, ConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnectorEnd_PartWithPort(), this.getProperty(), null, "partWithPort", null, 0, 1, ConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(connectableElementEClass, ConnectableElement.class, "ConnectableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConnectableElement_End(), this.getConnectorEnd(), this.getConnectorEnd_Role(), "end", null, 0, -1, ConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConnector_Type(), this.getAssociation(), null, "type", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnector_RedefinedConnector(), this.getConnector(), null, "redefinedConnector", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnector_End(), this.getConnectorEnd(), null, "end", null, 2, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConnector_Kind(), this.getConnectorKind(), "kind", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnector_Contract(), this.getBehavior(), null, "contract", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(connectorEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(connectorEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(structuredClassifierEClass, StructuredClassifier.class, "StructuredClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStructuredClassifier_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredClassifier_Part(), this.getProperty(), null, "part", null, 0, -1, StructuredClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredClassifier_Role(), this.getConnectableElement(), null, "role", null, 0, -1, StructuredClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredClassifier_OwnedConnector(), this.getConnector(), null, "ownedConnector", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getMembers"); //$NON-NLS-1$

		addEOperation(structuredClassifierEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getActivityEdge_Activity(), this.getActivity(), this.getActivity_Edge(), "activity", null, 0, 1, ActivityEdge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_InGroup(), this.getActivityGroup(), null, "inGroup", null, 0, -1, ActivityEdge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Guard(), this.getValueSpecification(), null, "guard", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_RedefinedElement(), this.getActivityEdge(), null, "redefinedElement", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_InStructuredNode(), this.getStructuredActivityNode(), this.getStructuredActivityNode_ContainedEdge(), "inStructuredNode", null, 0, 1, ActivityEdge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_InPartition(), this.getActivityPartition(), this.getActivityPartition_ContainedEdge(), "inPartition", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Weight(), this.getValueSpecification(), null, "weight", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityEdge_Interrupts(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_InterruptingEdge(), "interrupts", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityEdgeEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(activityEdgeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(activityGroupEClass, ActivityGroup.class, "ActivityGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getActivityGroup_SuperGroup(), this.getActivityGroup(), null, "superGroup", null, 0, 1, ActivityGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityGroup_ActivityGroup_activity(), this.getActivity(), this.getActivity_Group(), "activityGroup_activity", null, 0, 1, ActivityGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getSubgroups"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getContainedEdges"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getContainedNodes"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, this.getActivity(), "getActivity"); //$NON-NLS-1$

		op = addEOperation(activityGroupEClass, null, "setActivity"); //$NON-NLS-1$
		addEParameter(op, this.getActivity(), "newActivity"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(activityGroupEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InGroup(), this.getActivityGroup(), null, "inGroup", null, 0, -1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Node(), "activity", null, 0, 1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_RedefinedElement(), this.getActivityNode(), null, "redefinedElement", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InStructuredNode(), this.getStructuredActivityNode(), this.getStructuredActivityNode_ContainedNode(), "inStructuredNode", null, 0, 1, ActivityNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InPartition(), this.getActivityPartition(), this.getActivityPartition_ContainedNode(), "inPartition", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityNode_InInterruptibleRegion(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_ContainedNode(), "inInterruptibleRegion", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityNodeEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAction_Effect(), this.getString(), "effect", "", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAction_Output(), this.getOutputPin(), null, "output", null, 0, -1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_Input(), this.getInputPin(), null, "input", null, 0, -1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_Context(), this.getClassifier(), null, "context", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_LocalPrecondition(), this.getConstraint(), null, "localPrecondition", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAction_LocalPostcondition(), this.getConstraint(), null, "localPostcondition", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(actionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getObjectNode_Ordering(), this.getObjectNodeOrderingKind(), "ordering", "FIFO", 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getObjectNode_UpperBound(), this.getValueSpecification(), null, "upperBound", null, 1, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getObjectNode_InState(), this.getState(), null, "inState", null, 0, -1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getObjectNode_Selection(), this.getBehavior(), null, "selection", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(objectNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getObjectFlow_IsMulticast(), this.getBoolean(), "isMulticast", "false", 0, 1, ObjectFlow.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getObjectFlow_IsMultireceive(), this.getBoolean(), "isMultireceive", "false", 0, 1, ObjectFlow.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getObjectFlow_Transformation(), this.getBehavior(), null, "transformation", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getObjectFlow_Selection(), this.getBehavior(), null, "selection", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDecisionNode_DecisionInput(), this.getBehavior(), null, "decisionInput", null, 0, 1, DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExecutableNode_Handler(), this.getExceptionHandler(), this.getExceptionHandler_ProtectedNode(), "handler", null, 0, -1, ExecutableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(executableNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(activityParameterNodeEClass, ActivityParameterNode.class, "ActivityParameterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getActivityParameterNode_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ActivityParameterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(valuePinEClass, ValuePin.class, "ValuePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getValuePin_Value(), this.getValueSpecification(), null, "value", null, 1, 1, ValuePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInterface_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_OwnedOperation(), this.getOperation(), null, "ownedOperation", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_RedefinedInterface(), this.getInterface(), null, "redefinedInterface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterface_Protocol(), this.getProtocolStateMachine(), null, "protocol", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(interfaceEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getImplementation_Contract(), this.getInterface(), null, "contract", null, 1, 1, Implementation.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getImplementation_ImplementingClassifier(), this.getBehavioredClassifier(), this.getBehavioredClassifier_Implementation(), "implementingClassifier", null, 1, 1, Implementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(implementationEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArtifact_FileName(), this.getString(), "fileName", "", 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getArtifact_NestedArtifact(), this.getArtifact(), null, "nestedArtifact", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArtifact_Manifestation(), this.getManifestation(), null, "manifestation", null, 0, -1, Artifact.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArtifact_OwnedOperation(), this.getOperation(), null, "ownedOperation", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArtifact_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		addEOperation(artifactEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		initEClass(manifestationEClass, Manifestation.class, "Manifestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getManifestation_UtilizedElement(), this.getPackageableElement(), null, "utilizedElement", null, 1, 1, Manifestation.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(manifestationEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(manifestationEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(extendEClass, Extend.class, "Extend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExtend_ExtendedCase(), this.getUseCase(), null, "extendedCase", null, 1, 1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtend_Extension(), this.getUseCase(), this.getUseCase_Extend(), "extension", null, 1, 1, Extend.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtend_Condition(), this.getConstraint(), null, "condition", null, 0, 1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtend_ExtensionLocation(), this.getExtensionPoint(), null, "extensionLocation", null, 1, -1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(extendEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(extendEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(extendEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getUseCase_Include(), this.getInclude(), this.getInclude_IncludingCase(), "include", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getUseCase_Extend(), this.getExtend(), this.getExtend_Extension(), "extend", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getUseCase_ExtensionPoint(), this.getExtensionPoint(), this.getExtensionPoint_UseCase(), "extensionPoint", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getUseCase_Subject(), this.getClassifier(), this.getClassifier_UseCase(), "subject", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(useCaseEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(extensionPointEClass, ExtensionPoint.class, "ExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExtensionPoint_UseCase(), this.getUseCase(), this.getUseCase_ExtensionPoint(), "useCase", null, 1, 1, ExtensionPoint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInclude_IncludingCase(), this.getUseCase(), this.getUseCase_Include(), "includingCase", null, 1, 1, Include.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInclude_Addition(), this.getUseCase(), null, "addition", null, 1, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(includeEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(includeEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(collaborationOccurrenceEClass, CollaborationOccurrence.class, "CollaborationOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCollaborationOccurrence_Type(), this.getCollaboration(), null, "type", null, 1, 1, CollaborationOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCollaborationOccurrence_RoleBinding(), this.getDependency(), null, "roleBinding", null, 0, -1, CollaborationOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(collaborationOccurrenceEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCollaboration_CollaborationRole(), this.getConnectableElement(), null, "collaborationRole", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(collaborationEClass, ecorePackage.getEEList(), "getRoles"); //$NON-NLS-1$

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPort_IsBehavior(), this.getBoolean(), "isBehavior", "false", 0, 1, Port.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPort_IsService(), this.getBoolean(), "isService", "true", 0, 1, Port.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getPort_Required(), this.getInterface(), null, "required", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPort_RedefinedPort(), this.getPort(), null, "redefinedPort", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPort_Provided(), this.getInterface(), null, "provided", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPort_Protocol(), this.getProtocolStateMachine(), null, "protocol", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(portEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		initEClass(encapsulatedClassifierEClass, EncapsulatedClassifier.class, "EncapsulatedClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEncapsulatedClassifier_OwnedPort(), this.getPort(), null, "ownedPort", null, 0, -1, EncapsulatedClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(encapsulatedClassifierEClass, ecorePackage.getEEList(), "getFeatures"); //$NON-NLS-1$

		addEOperation(encapsulatedClassifierEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(callTriggerEClass, CallTrigger.class, "CallTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCallTrigger_Operation(), this.getOperation(), null, "operation", null, 1, 1, CallTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageTriggerEClass, MessageTrigger.class, "MessageTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(changeTriggerEClass, ChangeTrigger.class, "ChangeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getChangeTrigger_ChangeExpression(), this.getValueSpecification(), null, "changeExpression", null, 1, 1, ChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(changeTriggerEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTrigger_Port(), this.getPort(), null, "port", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(receptionEClass, Reception.class, "Reception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReception_Signal(), this.getSignal(), null, "signal", null, 0, 1, Reception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSignal_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(signalEClass, ecorePackage.getEEList(), "getAttributes"); //$NON-NLS-1$

		addEOperation(signalEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(signalTriggerEClass, SignalTrigger.class, "SignalTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSignalTrigger_Signal(), this.getSignal(), null, "signal", null, 0, -1, SignalTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(timeTriggerEClass, TimeTrigger.class, "TimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTimeTrigger_IsRelative(), this.getBoolean(), "isRelative", null, 0, 1, TimeTrigger.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTimeTrigger_When(), this.getValueSpecification(), null, "when", null, 1, 1, TimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(timeTriggerEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(anyTriggerEClass, AnyTrigger.class, "AnyTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariable_Scope(), this.getStructuredActivityNode(), this.getStructuredActivityNode_Variable(), "scope", null, 1, 1, Variable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(variableEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStructuredActivityNode_Variable(), this.getVariable(), this.getVariable_Scope(), "variable", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredActivityNode_ContainedNode(), this.getActivityNode(), this.getActivityNode_InStructuredNode(), "containedNode", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuredActivityNode_ContainedEdge(), this.getActivityEdge(), this.getActivityEdge_InStructuredNode(), "containedEdge", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStructuredActivityNode_MustIsolate(), this.getBoolean(), "mustIsolate", null, 0, 1, StructuredActivityNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(structuredActivityNodeEClass, this.getActivity(), "getActivity"); //$NON-NLS-1$

		op = addEOperation(structuredActivityNodeEClass, null, "setActivity"); //$NON-NLS-1$
		addEParameter(op, this.getActivity(), "newActivity"); //$NON-NLS-1$

		addEOperation(structuredActivityNodeEClass, this.getActivity(), "getActivityGroup_activity"); //$NON-NLS-1$

		op = addEOperation(structuredActivityNodeEClass, null, "setActivityGroup_activity"); //$NON-NLS-1$
		addEParameter(op, this.getActivity(), "newActivityGroup_activity"); //$NON-NLS-1$

		addEOperation(structuredActivityNodeEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConditionalNode_IsDeterminate(), this.getBoolean(), "isDeterminate", null, 0, 1, ConditionalNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConditionalNode_IsAssured(), this.getBoolean(), "isAssured", null, 0, 1, ConditionalNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConditionalNode_Clause(), this.getClause(), null, "clause", null, 1, -1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConditionalNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(conditionalNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(conditionalNodeEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClause_Test(), this.getActivityNode(), null, "test", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_Body(), this.getActivityNode(), null, "body", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_PredecessorClause(), this.getClause(), this.getClause_SuccessorClause(), "predecessorClause", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_SuccessorClause(), this.getClause(), this.getClause_PredecessorClause(), "successorClause", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClause_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(loopNodeEClass, LoopNode.class, "LoopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLoopNode_IsTestedFirst(), this.getBoolean(), "isTestedFirst", null, 0, 1, LoopNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_BodyPart(), this.getActivityNode(), null, "bodyPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_SetupPart(), this.getActivityNode(), null, "setupPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_Test(), this.getActivityNode(), null, "test", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_LoopVariable(), this.getOutputPin(), null, "loopVariable", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoopNode_LoopVariableInput(), this.getInputPin(), null, "loopVariableInput", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(loopNodeEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		addEOperation(loopNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(loopNodeEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInteraction_Lifeline(), this.getLifeline(), this.getLifeline_Interaction(), "lifeline", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteraction_Message(), this.getMessage(), this.getMessage_Interaction(), "message", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteraction_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingInteraction(), "fragment", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteraction_FormalGate(), this.getGate(), null, "formalGate", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInteractionFragment_Covered(), this.getLifeline(), this.getLifeline_CoveredBy(), "covered", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionFragment_GeneralOrdering(), this.getGeneralOrdering(), null, "generalOrdering", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionFragment_EnclosingInteraction(), this.getInteraction(), this.getInteraction_Fragment(), "enclosingInteraction", null, 0, 1, InteractionFragment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionFragment_EnclosingOperand(), this.getInteractionOperand(), this.getInteractionOperand_Fragment(), "enclosingOperand", null, 0, 1, InteractionFragment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionFragmentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(interactionFragmentEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(), this.getInteractionFragment_Covered(), "coveredBy", null, 0, -1, Lifeline.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_Represents(), this.getConnectableElement(), null, "represents", null, 1, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_Interaction(), this.getInteraction(), this.getInteraction_Lifeline(), "interaction", null, 1, 1, Lifeline.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_Selector(), this.getOpaqueExpression(), null, "selector", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLifeline_DecomposedAs(), this.getPartDecomposition(), null, "decomposedAs", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(lifelineEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(lifelineEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMessage_MessageKind(), this.getMessageKind(), "messageKind", null, 0, 1, Message.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMessage_MessageSort(), this.getMessageSort(), "messageSort", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), this.getMessageEnd_ReceiveMessage(), "receiveEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_SendEvent(), this.getMessageEnd(), this.getMessageEnd_SendMessage(), "sendEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Connector(), this.getConnector(), null, "connector", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Interaction(), this.getInteraction(), this.getInteraction_Message(), "interaction", null, 1, 1, Message.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Signature(), this.getNamedElement(), null, "signature", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessage_Argument(), this.getValueSpecification(), null, "argument", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(messageEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		addEOperation(messageEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(generalOrderingEClass, GeneralOrdering.class, "GeneralOrdering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGeneralOrdering_Before(), this.getEventOccurrence(), this.getEventOccurrence_ToAfter(), "before", null, 1, 1, GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneralOrdering_After(), this.getEventOccurrence(), this.getEventOccurrence_ToBefore(), "after", null, 1, 1, GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(messageEndEClass, MessageEnd.class, "MessageEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMessageEnd_ReceiveMessage(), this.getMessage(), this.getMessage_ReceiveEvent(), "receiveMessage", null, 0, 1, MessageEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMessageEnd_SendMessage(), this.getMessage(), this.getMessage_SendEvent(), "sendMessage", null, 0, 1, MessageEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(eventOccurrenceEClass, EventOccurrence.class, "EventOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventOccurrence_StartExec(), this.getExecutionOccurrence(), this.getExecutionOccurrence_Start(), "startExec", null, 0, -1, EventOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventOccurrence_FinishExec(), this.getExecutionOccurrence(), this.getExecutionOccurrence_Finish(), "finishExec", null, 0, -1, EventOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventOccurrence_ToAfter(), this.getGeneralOrdering(), this.getGeneralOrdering_Before(), "toAfter", null, 0, -1, EventOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventOccurrence_ToBefore(), this.getGeneralOrdering(), this.getGeneralOrdering_After(), "toBefore", null, 0, -1, EventOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(eventOccurrenceEClass, ecorePackage.getEEList(), "getCovereds"); //$NON-NLS-1$

		initEClass(executionOccurrenceEClass, ExecutionOccurrence.class, "ExecutionOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExecutionOccurrence_Start(), this.getEventOccurrence(), this.getEventOccurrence_StartExec(), "start", null, 1, 1, ExecutionOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExecutionOccurrence_Finish(), this.getEventOccurrence(), this.getEventOccurrence_FinishExec(), "finish", null, 1, 1, ExecutionOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExecutionOccurrence_Behavior(), this.getBehavior(), null, "behavior", null, 0, -1, ExecutionOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stateInvariantEClass, StateInvariant.class, "StateInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStateInvariant_Invariant(), this.getConstraint(), null, "invariant", null, 1, 1, StateInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stateInvariantEClass, ecorePackage.getEEList(), "getCovereds"); //$NON-NLS-1$

		addEOperation(stateInvariantEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTemplateSignature_Parameter(), this.getTemplateParameter(), null, "parameter", null, 1, -1, TemplateSignature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_OwnedParameter(), this.getTemplateParameter(), this.getTemplateParameter_Signature(), "ownedParameter", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_NestedSignature(), this.getTemplateSignature(), this.getTemplateSignature_NestingSignature(), "nestedSignature", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_NestingSignature(), this.getTemplateSignature(), this.getTemplateSignature_NestedSignature(), "nestingSignature", null, 0, 1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateSignature_Template(), this.getTemplateableElement(), this.getTemplateableElement_OwnedTemplateSignature(), "template", null, 1, 1, TemplateSignature.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateSignatureEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(templateSignatureEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTemplateParameter_Signature(), this.getTemplateSignature(), this.getTemplateSignature_OwnedParameter(), "signature", null, 1, 1, TemplateParameter.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_ParameteredElement(), this.getParameterableElement(), this.getParameterableElement_TemplateParameter(), "parameteredElement", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_OwnedParameteredElement(), this.getParameterableElement(), this.getParameterableElement_OwningParameter(), "ownedParameteredElement", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_Default(), this.getParameterableElement(), null, "default", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameter_OwnedDefault(), this.getParameterableElement(), null, "ownedDefault", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateParameterEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(templateParameterEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(templateableElementEClass, TemplateableElement.class, "TemplateableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTemplateableElement_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_BoundElement(), "templateBinding", null, 0, -1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(), this.getTemplateSignature_Template(), "ownedTemplateSignature", null, 0, 1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateableElementEClass, this.getSet(), "parameterableElements"); //$NON-NLS-1$

		addEOperation(templateableElementEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStringExpression_SubExpression(), this.getStringExpression(), this.getStringExpression_OwningExpression(), "subExpression", null, 0, -1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStringExpression_OwningExpression(), this.getStringExpression(), this.getStringExpression_SubExpression(), "owningExpression", null, 0, 1, StringExpression.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stringExpressionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(stringExpressionEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(parameterableElementEClass, ParameterableElement.class, "ParameterableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getParameterableElement_TemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_ParameteredElement(), "templateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getParameterableElement_OwningParameter(), this.getTemplateParameter(), this.getTemplateParameter_OwnedParameteredElement(), "owningParameter", null, 0, 1, ParameterableElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(parameterableElementEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTemplateBinding_BoundElement(), this.getTemplateableElement(), this.getTemplateableElement_TemplateBinding(), "boundElement", null, 1, 1, TemplateBinding.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateBinding_Signature(), this.getTemplateSignature(), null, "signature", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateBinding_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(), "parameterSubstitution", null, 0, -1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateBindingEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(templateBindingEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(templateBindingEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(templateBindingEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(templateParameterSubstitutionEClass, TemplateParameterSubstitution.class, "TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_Formal(), this.getTemplateParameter(), null, "formal", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_ParameterSubstitution(), "templateBinding", null, 1, 1, TemplateParameterSubstitution.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_Actual(), this.getParameterableElement(), null, "actual", null, 1, -1, TemplateParameterSubstitution.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTemplateParameterSubstitution_OwnedActual(), this.getParameterableElement(), null, "ownedActual", null, 0, -1, TemplateParameterSubstitution.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(templateParameterSubstitutionEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(templateParameterSubstitutionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(operationTemplateParameterEClass, OperationTemplateParameter.class, "OperationTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(classifierTemplateParameterEClass, ClassifierTemplateParameter.class, "ClassifierTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getClassifierTemplateParameter_AllowSubstitutable(), this.getBoolean(), "allowSubstitutable", "true", 0, 1, ClassifierTemplateParameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(parameterableClassifierEClass, ParameterableClassifier.class, "ParameterableClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(redefinableTemplateSignatureEClass, RedefinableTemplateSignature.class, "RedefinableTemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(templateableClassifierEClass, TemplateableClassifier.class, "TemplateableClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(connectableElementTemplateParameterEClass, ConnectableElementTemplateParameter.class, "ConnectableElementTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getJoinNode_IsCombineDuplicate(), this.getBoolean(), "isCombineDuplicate", "true", 0, 1, JoinNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getJoinNode_JoinSpec(), this.getValueSpecification(), null, "joinSpec", null, 1, 1, JoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(joinNodeEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(centralBufferNodeEClass, CentralBufferNode.class, "CentralBufferNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(activityPartitionEClass, ActivityPartition.class, "ActivityPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getActivityPartition_IsDimension(), this.getBoolean(), "isDimension", "false", 0, 1, ActivityPartition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getActivityPartition_IsExternal(), this.getBoolean(), "isExternal", "false", 0, 1, ActivityPartition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getActivityPartition_ContainedEdge(), this.getActivityEdge(), this.getActivityEdge_InPartition(), "containedEdge", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_ContainedNode(), this.getActivityNode(), this.getActivityNode_InPartition(), "containedNode", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_Subgroup(), this.getActivityPartition(), this.getActivityPartition_SuperPartition(), "subgroup", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_SuperPartition(), this.getActivityPartition(), this.getActivityPartition_Subgroup(), "superPartition", null, 0, 1, ActivityPartition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivityPartition_Represents(), this.getElement(), null, "represents", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(activityPartitionEClass, this.getActivityGroup(), "getSuperGroup"); //$NON-NLS-1$

		initEClass(expansionNodeEClass, ExpansionNode.class, "ExpansionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExpansionNode_RegionAsOutput(), this.getExpansionRegion(), this.getExpansionRegion_OutputElement(), "regionAsOutput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpansionNode_RegionAsInput(), this.getExpansionRegion(), this.getExpansionRegion_InputElement(), "regionAsInput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(expansionRegionEClass, ExpansionRegion.class, "ExpansionRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExpansionRegion_Mode(), this.getExpansionKind(), "mode", null, 0, 1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpansionRegion_OutputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsOutput(), "outputElement", null, 0, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpansionRegion_InputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsInput(), "inputElement", null, 1, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExceptionHandler_ProtectedNode(), this.getExecutableNode(), this.getExecutableNode_Handler(), "protectedNode", null, 1, 1, ExceptionHandler.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExceptionHandler_HandlerBody(), this.getExecutableNode(), null, "handlerBody", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExceptionHandler_ExceptionInput(), this.getObjectNode(), null, "exceptionInput", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExceptionHandler_ExceptionType(), this.getClassifier(), null, "exceptionType", null, 1, -1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(exceptionHandlerEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(interactionOccurrenceEClass, InteractionOccurrence.class, "InteractionOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInteractionOccurrence_RefersTo(), this.getInteraction(), null, "refersTo", null, 1, 1, InteractionOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionOccurrence_ActualGate(), this.getGate(), null, "actualGate", null, 0, -1, InteractionOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionOccurrence_Argument(), this.getInputPin(), null, "argument", null, 0, -1, InteractionOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionOccurrenceEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(partDecompositionEClass, PartDecomposition.class, "PartDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(interactionOperandEClass, InteractionOperand.class, "InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInteractionOperand_Guard(), this.getInteractionConstraint(), null, "guard", null, 0, 1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionOperand_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingOperand(), "fragment", null, 0, -1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionOperandEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(interactionConstraintEClass, InteractionConstraint.class, "InteractionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInteractionConstraint_Minint(), this.getValueSpecification(), null, "minint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInteractionConstraint_Maxint(), this.getValueSpecification(), null, "maxint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(interactionConstraintEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCombinedFragment_InteractionOperator(), this.getInteractionOperator(), "interactionOperator", null, 0, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCombinedFragment_Operand(), this.getInteractionOperand(), null, "operand", null, 1, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getCombinedFragment_CfragmentGate(), this.getGate(), null, "cfragmentGate", null, 0, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(combinedFragmentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(continuationEClass, Continuation.class, "Continuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getContinuation_Setting(), this.getBoolean(), "setting", "True", 0, 1, Continuation.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStateMachine_Region(), this.getRegion(), this.getRegion_StateMachine(), "region", null, 1, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStateMachine_ConnectionPoint(), this.getPseudostate(), null, "connectionPoint", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStateMachine_ExtendedStateMachine(), this.getStateMachine(), null, "extendedStateMachine", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStateMachine_StateMachine_redefinitionContext(), this.getBehavioredClassifier(), this.getBehavioredClassifier_OwnedStateMachine(), "stateMachine_redefinitionContext", null, 0, 1, StateMachine.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stateMachineEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(stateMachineEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(stateMachineEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRegion_Subvertex(), this.getVertex(), this.getVertex_Container(), "subvertex", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_Transition(), this.getTransition(), this.getTransition_Container(), "transition", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_StateMachine(), this.getStateMachine(), this.getStateMachine_Region(), "stateMachine", null, 0, 1, Region.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_State(), this.getState(), this.getState_Region(), "state", null, 0, 1, Region.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegion_ExtendedRegion(), this.getRegion(), null, "extendedRegion", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(regionEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(regionEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(regionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(regionEClass, this.getNamespace(), "getNamespace"); //$NON-NLS-1$

		initEClass(pseudostateEClass, Pseudostate.class, "Pseudostate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPseudostate_Kind(), this.getPseudostateKind(), "kind", null, 0, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getState_IsComposite(), this.getBoolean(), "isComposite", null, 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getState_IsOrthogonal(), this.getBoolean(), "isOrthogonal", null, 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getState_IsSimple(), this.getBoolean(), "isSimple", null, 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getState_IsSubmachineState(), this.getBoolean(), "isSubmachineState", null, 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Submachine(), this.getStateMachine(), null, "submachine", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Connection(), this.getConnectionPointReference(), null, "connection", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_RedefinedState(), this.getState(), null, "redefinedState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_DeferrableTrigger(), this.getTrigger(), null, "deferrableTrigger", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Region(), this.getRegion(), this.getRegion_State(), "region", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Entry(), this.getActivity(), null, "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_Exit(), this.getActivity(), null, "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_DoActivity(), this.getActivity(), null, "doActivity", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getState_StateInvariant(), this.getConstraint(), null, "stateInvariant", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(stateEClass, ecorePackage.getEEList(), "getOwnedMembers"); //$NON-NLS-1$

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVertex_Container(), this.getRegion(), this.getRegion_Subvertex(), "container", null, 0, 1, Vertex.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getVertex_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVertex_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(vertexEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		initEClass(connectionPointReferenceEClass, ConnectionPointReference.class, "ConnectionPointReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConnectionPointReference_Entry(), this.getPseudostate(), null, "entry", null, 0, -1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnectionPointReference_Exit(), this.getPseudostate(), null, "exit", null, 0, -1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTransition_Kind(), this.getTransitionKind(), "kind", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Container(), this.getRegion(), this.getRegion_Transition(), "container", null, 1, 1, Transition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Source(), this.getVertex(), this.getVertex_Outgoing(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Target(), this.getVertex(), this.getVertex_Incoming(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_RedefinedTransition(), this.getTransition(), null, "redefinedTransition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Guard(), this.getConstraint(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_Effect(), this.getActivity(), null, "effect", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(transitionEClass, ecorePackage.getEEList(), "getRedefinitionContexts"); //$NON-NLS-1$

		addEOperation(transitionEClass, ecorePackage.getEEList(), "getRedefinedElements"); //$NON-NLS-1$

		addEOperation(transitionEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(transitionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCreateObjectAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCreateObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(createObjectActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDestroyObjectAction_IsDestroyLinks(), this.getBoolean(), "isDestroyLinks", "false", 0, 1, DestroyObjectAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDestroyObjectAction_IsDestroyOwnedObjects(), this.getBoolean(), "isDestroyOwnedObjects", "false", 0, 1, DestroyObjectAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getDestroyObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(destroyObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(testIdentityActionEClass, TestIdentityAction.class, "TestIdentityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTestIdentityAction_First(), this.getInputPin(), null, "first", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTestIdentityAction_Second(), this.getInputPin(), null, "second", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTestIdentityAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(testIdentityActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(testIdentityActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadSelfAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadSelfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readSelfActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(structuralFeatureActionEClass, StructuralFeatureAction.class, "StructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStructuralFeatureAction_StructuralFeature(), this.getStructuralFeature(), null, "structuralFeature", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructuralFeatureAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(structuralFeatureActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(readStructuralFeatureActionEClass, ReadStructuralFeatureAction.class, "ReadStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readStructuralFeatureActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(writeStructuralFeatureActionEClass, WriteStructuralFeatureAction.class, "WriteStructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWriteStructuralFeatureAction_Value(), this.getInputPin(), null, "value", null, 1, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(writeStructuralFeatureActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(clearStructuralFeatureActionEClass, ClearStructuralFeatureAction.class, "ClearStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(removeStructuralFeatureValueActionEClass, RemoveStructuralFeatureValueAction.class, "RemoveStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(addStructuralFeatureValueActionEClass, AddStructuralFeatureValueAction.class, "AddStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAddStructuralFeatureValueAction_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAddStructuralFeatureValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(addStructuralFeatureValueActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(linkActionEClass, LinkAction.class, "LinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLinkAction_EndData(), this.getLinkEndData(), null, "endData", null, 2, -1, LinkAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(linkEndDataEClass, LinkEndData.class, "LinkEndData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLinkEndData_Value(), this.getInputPin(), null, "value", null, 0, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLinkEndData_End(), this.getProperty(), null, "end", null, 1, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLinkEndData_Qualifier(), this.getQualifierValue(), null, "qualifier", null, 0, -1, LinkEndData.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(readLinkActionEClass, ReadLinkAction.class, "ReadLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadLinkAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readLinkActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(linkEndCreationDataEClass, LinkEndCreationData.class, "LinkEndCreationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLinkEndCreationData_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, LinkEndCreationData.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getLinkEndCreationData_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(linkEndCreationDataEClass, ecorePackage.getEEList(), "getQualifiers"); //$NON-NLS-1$

		initEClass(createLinkActionEClass, CreateLinkAction.class, "CreateLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(createLinkActionEClass, ecorePackage.getEEList(), "getEndData"); //$NON-NLS-1$

		initEClass(writeLinkActionEClass, WriteLinkAction.class, "WriteLinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(destroyLinkActionEClass, DestroyLinkAction.class, "DestroyLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(clearAssociationActionEClass, ClearAssociationAction.class, "ClearAssociationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClearAssociationAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClearAssociationAction_Association(), this.getAssociation(), null, "association", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(clearAssociationActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(variableActionEClass, VariableAction.class, "VariableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariableAction_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(readVariableActionEClass, ReadVariableAction.class, "ReadVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadVariableAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readVariableActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(writeVariableActionEClass, WriteVariableAction.class, "WriteVariableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWriteVariableAction_Value(), this.getInputPin(), null, "value", null, 1, 1, WriteVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(writeVariableActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(clearVariableActionEClass, ClearVariableAction.class, "ClearVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(addVariableValueActionEClass, AddVariableValueAction.class, "AddVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAddVariableValueAction_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, AddVariableValueAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getAddVariableValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(addVariableValueActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(removeVariableValueActionEClass, RemoveVariableValueAction.class, "RemoveVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(applyFunctionActionEClass, ApplyFunctionAction.class, "ApplyFunctionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getApplyFunctionAction_Function(), this.getPrimitiveFunction(), null, "function", null, 1, 1, ApplyFunctionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getApplyFunctionAction_Argument(), this.getInputPin(), null, "argument", null, 0, -1, ApplyFunctionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getApplyFunctionAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, ApplyFunctionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(applyFunctionActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(applyFunctionActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(primitiveFunctionEClass, PrimitiveFunction.class, "PrimitiveFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPrimitiveFunction_Body(), this.getString(), "body", "", 0, 1, PrimitiveFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPrimitiveFunction_Language(), this.getString(), "language", "", 0, 1, PrimitiveFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(callActionEClass, CallAction.class, "CallAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCallAction_IsSynchronous(), this.getBoolean(), "isSynchronous", "true", 0, 1, CallAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCallAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(callActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(invocationActionEClass, InvocationAction.class, "InvocationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInvocationAction_Argument(), this.getInputPin(), null, "argument", null, 0, -1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInvocationAction_OnPort(), this.getPort(), null, "onPort", null, 0, 1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(invocationActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSendSignalAction_Target(), this.getInputPin(), null, "target", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendSignalAction_Signal(), this.getSignal(), null, "signal", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(sendSignalActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(broadcastSignalActionEClass, BroadcastSignalAction.class, "BroadcastSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBroadcastSignalAction_Signal(), this.getSignal(), null, "signal", null, 1, 1, BroadcastSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sendObjectActionEClass, SendObjectAction.class, "SendObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSendObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendObjectAction_Request(), this.getInputPin(), null, "request", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(sendObjectActionEClass, ecorePackage.getEEList(), "getArguments"); //$NON-NLS-1$

		addEOperation(sendObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(callOperationActionEClass, CallOperationAction.class, "CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCallOperationAction_Operation(), this.getOperation(), null, "operation", null, 1, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCallOperationAction_Target(), this.getInputPin(), null, "target", null, 1, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(callOperationActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCallBehaviorAction_Behavior(), this.getBehavior(), null, "behavior", null, 1, 1, CallBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTimeExpression_FirstTime(), this.getBoolean(), "firstTime", "True", 0, 1, TimeExpression.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getTimeExpression_Event(), this.getNamedElement(), null, "event", null, 0, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDuration_FirstTime(), this.getBoolean(), "firstTime", "True", 0, 1, Duration.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getDuration_Event(), this.getNamedElement(), null, "event", null, 0, 2, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(timeObservationActionEClass, TimeObservationAction.class, "TimeObservationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTimeObservationAction_Now(), this.getTimeExpression(), null, "now", null, 0, -1, TimeObservationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(timeObservationActionEClass, this.getInputPin(), "getValue"); //$NON-NLS-1$

		op = addEOperation(timeObservationActionEClass, null, "setValue"); //$NON-NLS-1$
		addEParameter(op, this.getInputPin(), "newValue"); //$NON-NLS-1$

		initEClass(durationIntervalEClass, DurationInterval.class, "DurationInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(durationIntervalEClass, ecorePackage.getEEList(), "getMins"); //$NON-NLS-1$

		addEOperation(durationIntervalEClass, ecorePackage.getEEList(), "getMaxes"); //$NON-NLS-1$

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInterval_Min(), this.getValueSpecification(), null, "min", null, 0, -1, Interval.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterval_Max(), this.getValueSpecification(), null, "max", null, 0, -1, Interval.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(timeConstraintEClass, TimeConstraint.class, "TimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(timeConstraintEClass, this.getValueSpecification(), "getSpecification"); //$NON-NLS-1$

		op = addEOperation(timeConstraintEClass, null, "setSpecification"); //$NON-NLS-1$
		addEParameter(op, this.getValueSpecification(), "newSpecification"); //$NON-NLS-1$

		initEClass(intervalConstraintEClass, IntervalConstraint.class, "IntervalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(intervalConstraintEClass, this.getValueSpecification(), "getSpecification"); //$NON-NLS-1$

		op = addEOperation(intervalConstraintEClass, null, "setSpecification"); //$NON-NLS-1$
		addEParameter(op, this.getValueSpecification(), "newSpecification"); //$NON-NLS-1$

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(timeIntervalEClass, ecorePackage.getEEList(), "getMaxes"); //$NON-NLS-1$

		addEOperation(timeIntervalEClass, ecorePackage.getEEList(), "getMins"); //$NON-NLS-1$

		initEClass(durationObservationActionEClass, DurationObservationAction.class, "DurationObservationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDurationObservationAction_Duration(), this.getDuration(), null, "duration", null, 0, -1, DurationObservationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(durationObservationActionEClass, this.getInputPin(), "getValue"); //$NON-NLS-1$

		op = addEOperation(durationObservationActionEClass, null, "setValue"); //$NON-NLS-1$
		addEParameter(op, this.getInputPin(), "newValue"); //$NON-NLS-1$

		initEClass(durationConstraintEClass, DurationConstraint.class, "DurationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(durationConstraintEClass, this.getValueSpecification(), "getSpecification"); //$NON-NLS-1$

		op = addEOperation(durationConstraintEClass, null, "setSpecification"); //$NON-NLS-1$
		addEParameter(op, this.getValueSpecification(), "newSpecification"); //$NON-NLS-1$

		initEClass(dataStoreNodeEClass, DataStoreNode.class, "DataStoreNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(interruptibleActivityRegionEClass, InterruptibleActivityRegion.class, "InterruptibleActivityRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInterruptibleActivityRegion_InterruptingEdge(), this.getActivityEdge(), this.getActivityEdge_Interrupts(), "interruptingEdge", null, 0, -1, InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterruptibleActivityRegion_ContainedNode(), this.getActivityNode(), this.getActivityNode_InInterruptibleRegion(), "containedNode", null, 0, -1, InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterSetEClass, ParameterSet.class, "ParameterSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getParameterSet_Parameter(), this.getParameter(), this.getParameter_ParameterSet(), "parameter", null, 1, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getParameterSet_Condition(), this.getConstraint(), null, "condition", null, 0, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(parameterSetEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComponent_IsIndirectlyInstantiated(), this.getBoolean(), "isIndirectlyInstantiated", null, 0, 1, Component.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_Required(), this.getInterface(), null, "required", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_Provided(), this.getInterface(), null, "provided", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_Realization(), this.getRealization(), this.getRealization_Abstraction(), "realization", null, 0, -1, Component.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getComponent_OwnedMember(), this.getPackageableElement(), null, "ownedMember", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(componentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(componentEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDeployment_DeployedArtifact(), this.getDeployedArtifact(), null, "deployedArtifact", null, 0, -1, Deployment.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeployment_Location(), this.getDeploymentTarget(), this.getDeploymentTarget_Deployment(), "location", null, 1, 1, Deployment.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeployment_Configuration(), this.getDeploymentSpecification(), null, "configuration", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getSuppliers"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getClients"); //$NON-NLS-1$

		addEOperation(deploymentEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(deployedArtifactEClass, DeployedArtifact.class, "DeployedArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(deploymentTargetEClass, DeploymentTarget.class, "DeploymentTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDeploymentTarget_Deployment(), this.getDeployment(), this.getDeployment_Location(), "deployment", null, 0, -1, DeploymentTarget.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeploymentTarget_DeployedElement(), this.getPackageableElement(), null, "deployedElement", null, 0, -1, DeploymentTarget.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(deploymentTargetEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		addEOperation(deploymentTargetEClass, ecorePackage.getEEList(), "getClientDependencies"); //$NON-NLS-1$

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNode_NestedNode(), this.getNode(), null, "nestedNode", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(nodeEClass, ecorePackage.getEEList(), "getNestedClassifiers"); //$NON-NLS-1$

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(communicationPathEClass, CommunicationPath.class, "CommunicationPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(protocolConformanceEClass, ProtocolConformance.class, "ProtocolConformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProtocolConformance_SpecificMachine(), this.getProtocolStateMachine(), this.getProtocolStateMachine_Conformance(), "specificMachine", null, 1, 1, ProtocolConformance.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProtocolConformance_GeneralMachine(), this.getProtocolStateMachine(), null, "generalMachine", null, 1, 1, ProtocolConformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(protocolConformanceEClass, ecorePackage.getEEList(), "getSources"); //$NON-NLS-1$

		addEOperation(protocolConformanceEClass, this.getElement(), "getOwner"); //$NON-NLS-1$

		addEOperation(protocolConformanceEClass, ecorePackage.getEEList(), "getTargets"); //$NON-NLS-1$

		initEClass(protocolStateMachineEClass, ProtocolStateMachine.class, "ProtocolStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProtocolStateMachine_Conformance(), this.getProtocolConformance(), this.getProtocolConformance_SpecificMachine(), "conformance", null, 0, -1, ProtocolStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(protocolStateMachineEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		initEClass(protocolTransitionEClass, ProtocolTransition.class, "ProtocolTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProtocolTransition_PostCondition(), this.getConstraint(), null, "postCondition", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProtocolTransition_Referred(), this.getOperation(), null, "referred", null, 0, -1, ProtocolTransition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProtocolTransition_PreCondition(), this.getConstraint(), null, "preCondition", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(protocolTransitionEClass, ecorePackage.getEEList(), "getOwnedElements"); //$NON-NLS-1$

		op = addEOperation(protocolTransitionEClass, null, "setGuard"); //$NON-NLS-1$
		addEParameter(op, this.getConstraint(), "newGuard"); //$NON-NLS-1$

		initEClass(readExtentActionEClass, ReadExtentAction.class, "ReadExtentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadExtentAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadExtentAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readExtentActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(reclassifyObjectActionEClass, ReclassifyObjectAction.class, "ReclassifyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReclassifyObjectAction_IsReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 0, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getReclassifyObjectAction_OldClassifier(), this.getClassifier(), null, "oldClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReclassifyObjectAction_NewClassifier(), this.getClassifier(), null, "newClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReclassifyObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(reclassifyObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(readIsClassifiedObjectActionEClass, ReadIsClassifiedObjectAction.class, "ReadIsClassifiedObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReadIsClassifiedObjectAction_IsDirect(), this.getBoolean(), "isDirect", "false", 0, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getReadIsClassifiedObjectAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadIsClassifiedObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadIsClassifiedObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readIsClassifiedObjectActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		addEOperation(readIsClassifiedObjectActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(startOwnedBehaviorActionEClass, StartOwnedBehaviorAction.class, "StartOwnedBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStartOwnedBehaviorAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StartOwnedBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(startOwnedBehaviorActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(qualifierValueEClass, QualifierValue.class, "QualifierValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getQualifierValue_Qualifier(), this.getProperty(), null, "qualifier", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getQualifierValue_Value(), this.getInputPin(), null, "value", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(readLinkObjectEndActionEClass, ReadLinkObjectEndAction.class, "ReadLinkObjectEndAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndAction_End(), this.getProperty(), null, "end", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readLinkObjectEndActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(readLinkObjectEndActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(readLinkObjectEndQualifierActionEClass, ReadLinkObjectEndQualifierAction.class, "ReadLinkObjectEndQualifierAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndQualifierAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndQualifierAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadLinkObjectEndQualifierAction_Qualifier(), this.getProperty(), null, "qualifier", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(createLinkObjectActionEClass, CreateLinkObjectAction.class, "CreateLinkObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCreateLinkObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, CreateLinkObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(createLinkObjectActionEClass, ecorePackage.getEEList(), "getEndData"); //$NON-NLS-1$

		addEOperation(createLinkObjectActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAcceptEventAction_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, AcceptEventAction.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAcceptEventAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(acceptEventActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(acceptCallActionEClass, AcceptCallAction.class, "AcceptCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAcceptCallAction_ReturnInformation(), this.getOutputPin(), null, "returnInformation", null, 1, 1, AcceptCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(acceptCallActionEClass, ecorePackage.getEEList(), "getTriggers"); //$NON-NLS-1$

		addEOperation(acceptCallActionEClass, ecorePackage.getEEList(), "getOutputs"); //$NON-NLS-1$

		initEClass(replyActionEClass, ReplyAction.class, "ReplyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReplyAction_ReplyToCall(), this.getCallTrigger(), null, "replyToCall", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReplyAction_ReplyValue(), this.getInputPin(), null, "replyValue", null, 0, -1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReplyAction_ReturnInformation(), this.getInputPin(), null, "returnInformation", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(replyActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(raiseExceptionActionEClass, RaiseExceptionAction.class, "RaiseExceptionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRaiseExceptionAction_Exception(), this.getInputPin(), null, "exception", null, 1, 1, RaiseExceptionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(raiseExceptionActionEClass, ecorePackage.getEEList(), "getInputs"); //$NON-NLS-1$

		initEClass(deploymentSpecificationEClass, DeploymentSpecification.class, "DeploymentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDeploymentSpecification_DeploymentLocation(), this.getString(), "deploymentLocation", "", 0, 1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDeploymentSpecification_ExecutionLocation(), this.getString(), "executionLocation", "", 0, 1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

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

		initEEnum(callConcurrencyKindEEnum, CallConcurrencyKind.class, "CallConcurrencyKind"); //$NON-NLS-1$
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.SEQUENTIAL_LITERAL);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.GUARDED_LITERAL);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.CONCURRENT_LITERAL);

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

		initEEnum(expansionKindEEnum, ExpansionKind.class, "ExpansionKind"); //$NON-NLS-1$
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.PARALLEL_LITERAL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.ITERATIVE_LITERAL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.STREAM_LITERAL);

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
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(unlimitedNaturalEDataType, int.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(sequenceEDataType, List.class, "Sequence", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
		  (elementEClass, 
		   source, 
		   new String[] {
			 "documentation", "Element is an abstract metaclass with no superclass. It is used as the common superclass for all metaclasses in the infrastructure library. Element has a derived composition association to itself to support the general capability for elements to own other elements. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
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
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allOwnedElements\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ElementOperations.allOwnedElements(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ElementOperations.allOwnedElements(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
		  (getElement_OwnedElement(), 
		   source, 
		   new String[] {
			 "documentation", "The Elements owned by this element. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getElement_Owner(), 
		   source, 
		   new String[] {
			 "documentation", "The Element that owns this element. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getElement_OwnedComment(), 
		   source, 
		   new String[] {
			 "documentation", "The Comments owned by this element. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (multiplicityElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A MultiplicityElement is an abstract metaclass which includes optional attributes for defining the bounds of a multiplicity. A MultiplicityElement also includes specifications of whether the values in an instantiation of this element must be unique or ordered. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getMultiplicityElement_IsOrdered(), 
		   source, 
		   new String[] {
			 "documentation", "For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered. Default is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMultiplicityElement_IsUnique(), 
		   source, 
		   new String[] {
			 "documentation", "For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique. Default is true." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMultiplicityElement_Lower(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the lower bound of the multiplicity interval, if it is expressed as an integer." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMultiplicityElement_Upper(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the upper bound of the multiplicity interval, if it is expressed as an unlimited natural." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMultiplicityElement_UpperValue(), 
		   source, 
		   new String[] {
			 "documentation", "The specification of the upper bound for this multiplicity. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMultiplicityElement_LowerValue(), 
		   source, 
		   new String[] {
			 "documentation", "The specification of the lower bound for this multiplicity. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A named element represents elements that may have a name. The name is used for identification of the named element within the namespace in which it is defined. A named element also has a qualified name that allows it to be unambiguously identified within a hierarchy of nested namespaces. NamedElement is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
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
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allNamespaces\", null); //$NON-NLS-1$\r\n\tList result = (List) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableList(org.eclipse.uml2.internal.operation.NamedElementOperations.allNamespaces(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.NamedElementOperations.allNamespaces(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
		  (getNamedElement_Name(), 
		   source, 
		   new String[] {
			 "documentation", "The name of the NamedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getNamedElement_QualifiedName(), 
		   source, 
		   new String[] {
			 "documentation", "A name which allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself. This is a derived attribute." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getNamedElement_Visibility(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the visibility of the NamedElement within different Namespaces within the overall model. Package Dependencies (\u201cDependencies\u201d on page 94)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getNamedElement_NameExpression(), 
		   source, 
		   new String[] {
			 "documentation", "The expression used to define the name of this named element." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "documentation", "A namespace is a named element that can own other named elements. Each named element may be owned by at most one namespace. A namespace provides a means for identifying named elements by name. Named elements can be identified by name in a namespace either by being directly owned by the namespace or by being introduced into the namespace by other means e.g. importing or inheriting. Namespace is an abstract metaclass. A namespace can own constraints. The constraint does not necessarily apply to the namespace itself, but may also apply to elements in the namespace. A namespace has the ability to import either individial members or all members of a package, thereby making it possible to refer to those named elements without qualification in the importing namespace. In the case of conflicts, it is necessary to use qualified names or aliases to disambiguate the referenced elements. " //$NON-NLS-1$ //$NON-NLS-2$
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
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"importedMember\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.NamespaceOperations.importedMember(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.NamespaceOperations.importedMember(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
		  (getNamespace_Member(), 
		   source, 
		   new String[] {
			 "documentation", "A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getNamespace_OwnedRule(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies a set of Constraints owned by this Namespace. Subsets Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getNamespace_ImportedMember(), 
		   source, 
		   new String[] {
			 "documentation", "References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports. Subsets Namespace::member." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getNamespace_ElementImport(), 
		   source, 
		   new String[] {
			 "documentation", "References the ElementImports owned by the Namespace. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getNamespace_PackageImport(), 
		   source, 
		   new String[] {
			 "documentation", "References the PackageImports owned by the Namespace. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "An expression contains a language-specific text string used to describe a value or values, and an optional specification of the language. One predefined language for specifying expressions is OCL. Natural language or programming languages may also be used. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOpaqueExpression_Body(), 
		   source, 
		   new String[] {
			 "documentation", "The text of the expression." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOpaqueExpression_Language(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the language in which the expression is stated. The interpretation of the expression body depends on the language. If language is unspecified, it might be implicit from the expression body or the context." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOpaqueExpression_Result(), 
		   source, 
		   new String[] {
			 "documentation", "Restricts an opaque expression to return exactly one return result. When the invocation of the opaque expression completes, a single set of values is returned to its owner. This association is derived from the single return result parameter of the associated behavior." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getOpaqueExpression_Behavior(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the behavior of the opaque expression." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (valueSpecificationEClass, 
		   source, 
		   new String[] {
			 "documentation", "ValueSpecification is an abstract metaclass used to identify a value or values in a model. It may reference an instance or it may be an expression denoting an instance or instances when evaluated. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (expressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "An expression represents a node in an expression tree, which may be non-terminal or terminal. It defines a symbol, and has a possibly empty sequence of operands which are value specifications. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getExpression_Symbol(), 
		   source, 
		   new String[] {
			 "documentation", "The symbol associated with the node in the expression tree." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getExpression_Operand(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies a sequence of operands. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (commentEClass, 
		   source, 
		   new String[] {
			 "documentation", "A comment gives the ability to attach various remarks to elements. A comment carries no semantic force, but may contain information that is useful to a modeler. A comment can be owned by any element. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getComment_Body(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies a string that is the comment." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getComment_AnnotatedElement(), 
		   source, 
		   new String[] {
			 "documentation", "References the Element(s) being commented." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (directedRelationshipEClass, 
		   source, 
		   new String[] {
			 "documentation", "A directed relationship references one or more source elements and one or more target elements. Directed relationship is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the sources of the DirectedRelationship. Subsets Relationship::relatedElement. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the targets of the DirectedRelationship. Subsets Relationship::relatedElement. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "documentation", "A relationship references one or more related elements. Relationship is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the elements related by the Relationship. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class is a kind of classifier whose features are attributes and operations. Attributes of a class are represented by instances of Property that are owned by the class. Some of these attributes may represent the navigable ends of binary associations. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ClassOperations.inherit(this, inhs);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ninhs->excluding(inh | ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																		
		addAnnotation
		  (getClass_OwnedOperation(), 
		   source, 
		   new String[] {
			 "documentation", "The operations owned by the class. The association is ordered. Subsets Classifier::feature and Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getClass_SuperClass(), 
		   source, 
		   new String[] {
			 "documentation", "This gives the superclasses of a class. It redefines Classifier::general. This is derived." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getClass_NestedClassifier(), 
		   source, 
		   new String[] {
			 "documentation", "References all the Classifiers that are defined (nested) within the Class. Subsets Element:: ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClass_IsActive(), 
		   source, 
		   new String[] {
			 "documentation", "Determines whether an object specified by this class is active or not. If true, then the owning class is referred to as an active class. If false, then such a class is referred to as a passive class." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getClass_OwnedReception(), 
		   source, 
		   new String[] {
			 "documentation", "Receptions that objects of this class are willing to accept. (Specializes Namespace.owned- Member and Classifier.feature.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A type serves as a constraint on the range of values represented by a typed element. Type is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)typeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.TypeOperations.conformsTo(this, other);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nfalse\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getType_Package(), 
		   source, 
		   new String[] {
			 "documentation", "References the owning package of a package. Subsets NamedElement::namespace." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "documentation", "Property represents a declared state of one or more instances in terms of a named relationship to a value or values. When a property is an attribute of a classifier, the value or values are related to the instance of the classifier by being held in slots of the instance. When a property is an association end, the value or values are related to the instance or instances at the other end(s) of the association (see semantics of Association). Property is indirectly a subclass of Constructs::TypedElement. The range of valid values represented by the property can be controlled by setting the property\u2019s type. Package AssociationClasses (\u201cAssociationClasses\u201d on page 107) A property may have other properties (attributes) that serve as qualifiers. " //$NON-NLS-1$ //$NON-NLS-2$
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
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"subsettingContext\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.PropertyOperations.subsettingContext(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.PropertyOperations.subsettingContext(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif association->notEmpty()\r\nthen association.endType-type \r\nelse if classifier->notEmpty then Set{classifier} else Set{} endif\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });																
		addAnnotation
		  (getProperty_IsDerived(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information. The default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getProperty_IsDerivedUnion(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether the property is derived as the union of all of the properties that are constrained to subset it. The default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getProperty_OwningAssociation(), 
		   source, 
		   new String[] {
			 "documentation", "References the owning association of this property. Subsets Property::association, NamedElement::namespace, Feature::featuringClassifier, and RedefinableElement:: redefinitionContext." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getProperty_Datatype(), 
		   source, 
		   new String[] {
			 "documentation", "The DataType that owns this Property. Subsets NamedElement::namespace, Feature::featuringClassifier, and Property::classifier." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
			 "documentation", "References the association of which this property is a member, if any." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getProperty_Aggregation(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the kind of aggregation that applies to the Property. The default value is none." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getProperty_DefaultValue(), 
		   source, 
		   new String[] {
			 "documentation", "A ValueSpecification that is evaluated to give a default value for the Property when an object of the owning Classifier is is instantiated. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "documentation", "An operation is a behavioral feature of a classifier that specifies the name, type, parameters, and constraints for invoking an associated behavior. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getOperation_IsQuery(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false). The default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getOperation_Precondition(), 
		   source, 
		   new String[] {
			 "documentation", "An optional set of Constraints on the state of the system when the Operation is invoked. Subsets Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getOperation_Postcondition(), 
		   source, 
		   new String[] {
			 "documentation", "An optional set of Constraints specifying the state of the system when the Operation is completed. Subsets Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getOperation_RedefinedOperation(), 
		   source, 
		   new String[] {
			 "documentation", "the Operations that are redefined by this Operation. Subsets RedefinableElement. redefinedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getOperation_BodyCondition(), 
		   source, 
		   new String[] {
			 "documentation", "optional Constraint on the result values of an invocation of this Operation. Subsets Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (typedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A typed element is an element that has a type that serves as a constraint on the range of values the element can represent. Typed element is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTypedElement_Type(), 
		   source, 
		   new String[] {
			 "documentation", "The type of the TypedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral feature. It has a type, and may have a multiplicity and an optional default value. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getParameter_Operation(), 
		   source, 
		   new String[] {
			 "documentation", "References the Operation for which this is a formal parameter. Subsets NamedElement:: namespace." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getParameter_Direction(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates whether a parameter is being sent into or out of a behavioral element. The default value is in." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getParameter_DefaultValue(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "documentation", "A package is a namespace for its members, and may contain other packages. Only packageable elements can be owned members of a package. By virtue of being a namespace, a package can import either individual members of other packages, or all the members of other packages. In addition a package can be merged with other packages. " //$NON-NLS-1$ //$NON-NLS-2$
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
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"visibleMembers\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.PackageOperations.visibleMembers(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.PackageOperations.visibleMembers(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
		  (getPackage_NestedPackage(), 
		   source, 
		   new String[] {
			 "documentation", "References the owned members that are Packages. Subsets Package::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getPackage_OwnedType(), 
		   source, 
		   new String[] {
			 "documentation", "References the owned members that are Types. Subsets Package::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPackage_OwnedMember(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the members that are owned by this Package. Redefines Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Enumeration is a kind of data type, whose instances may be any of a number of user-defined enumeration literals. It is possible to extend the set of applicable enumeration literals in other packages or profiles. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getEnumeration_OwnedLiteral(), 
		   source, 
		   new String[] {
			 "documentation", "ordered set of literals for this Enumeration. Subsets Element::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "documentation", "DataType defines a kind of classifier in which operations are all pure functions (i.e., they can return data values but they cannot change data values, because they have no identity). For example, an \u201cadd\u201d operation on a number with another number as an argument yields a third number as a result; the target and argument are unchanged. A DataType may also contain attributes to support the modeling of structured data types. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)dataTypeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.DataTypeOperations.inherit(this, inhs);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ninhs->excluding(inh |\r\n\townedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getDataType_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "documentation", "The Attributes owned by the DataType. Subsets Classifier::attribute and Element:: ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getDataType_OwnedOperation(), 
		   source, 
		   new String[] {
			 "documentation", "The Operations owned by the DataType. Subsets Classifier::feature and Element:: ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
			 "documentation", "An enumeration literal is a user-defined data value for an enumeration. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getEnumerationLiteral_Enumeration(), 
		   source, 
		   new String[] {
			 "documentation", "Enumeration that this EnumerationLiteral is a member of. Subsets NamedElement:: namespace." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (primitiveTypeEClass, 
		   source, 
		   new String[] {
			 "documentation", "The instances of primitive type used in UML itself include Boolean, Integer, UnlimitedNatural, and String. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
			 "documentation", "A classifier is a namespace whose members can include features. Classifier is an abstract metaclass. A classifier is a type and can own generalizations, thereby making it possible to define generalization relationships to other classifiers. A classifier can specify a generalization hierarchy by referencing its general classifiers. A classifier is a redefinable element, meaning that it is possible to redefine nested classifiers. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allFeatures\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.allFeatures(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"inheritedMember\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.inheritedMember(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.inheritedMember(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nself.inherit(self.parents()->collect(p | p.inheritableMembers(self))\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"parents\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.parents(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.parents(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\ngeneralization.general\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)classifierEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"allParents\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.allParents(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.allParents(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"general\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.ClassifierOperations.general(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.ClassifierOperations.general(this);\r\n}", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
		  (getClassifier_IsAbstract(), 
		   source, 
		   new String[] {
			 "documentation", "If true, the Classifier does not provide a complete declaration and can typically not be instantiated. An abstract classifier is intended to be used by other classifiers e.g. as the target of general metarelationships or generalization relationships. Default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getClassifier_Representation(), 
		   source, 
		   new String[] {
			 "documentation", "References a collaboration occurrence which indicates the collaboration that represents this classifier. (Subsets Classifier.occurrence.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getClassifier_Occurrence(), 
		   source, 
		   new String[] {
			 "documentation", "References the collaboration occurrences owned by the classifier. (Subsets Element. ownedElement.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "documentation", "A feature declares a behavioral or structural characteristic of instances of classifiers. Feature is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getFeature_FeaturingClassifier(), 
		   source, 
		   new String[] {
			 "documentation", "The Classifiers that have this Feature as a feature. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFeature_IsStatic(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether the feature is applied at the classifier-level (true) or the instance-level (false). Default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "Constraint contains a ValueSpecification that specifies additional semantics for one or more elements. Certain kinds of constraints (such as an association \u201cxor\u201d constraint) are predefined in UML, others may be user-defined. A user-defined Constraint is described using a specified language, whose syntax and interpretation is a tool responsibility. One predefined language for writing constraints is OCL. In some situations, a programming language such as Java may be appropriate for expressing a constraint. In other situations natural language may be used. Constraint is a condition (a Boolean expression) that restricts the extension of the associated element beyond what is imposed by the other language constructs applied to that element. Constraint contains an optional name, although they are commonly unnamed. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)constraintEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.ConstraintOperations.validateNotApplyToSelf(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nnot constrainedElement->includes(self)\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getConstraint_Context(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the Namespace that is the context for evaluating this constraint. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getConstraint_Specification(), 
		   source, 
		   new String[] {
			 "documentation", "A condition that must be true when evaluated in order for the constraint to be satisfied. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getConstraint_ConstrainedElement(), 
		   source, 
		   new String[] {
			 "documentation", "ordered set of Elements referenced by this Constraint." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (visibilityKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "VisibilityKind is an enumeration of the following literal values: \u2022 public \u2022 private \u2022 protected \u2022 package " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (literalBooleanEClass, 
		   source, 
		   new String[] {
			 "documentation", "A literal boolean contains a Boolean-valued attribute. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getLiteralBoolean_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The specified Boolean value." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (literalSpecificationEClass, 
		   source, 
		   new String[] {
			 "documentation", "A literal specification is an abstract specialization of ValueSpecification that identifies a literal constant being modeled. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (literalStringEClass, 
		   source, 
		   new String[] {
			 "documentation", "A literal string contains a String-valued attribute. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getLiteralString_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The specified String value." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (literalNullEClass, 
		   source, 
		   new String[] {
			 "documentation", "A literal null is used to represent null, i.e., the absence of a value. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (literalIntegerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A literal integer contains an Integer-valued attribute. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getLiteralInteger_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The specified Integer value." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (literalUnlimitedNaturalEClass, 
		   source, 
		   new String[] {
			 "documentation", "A literal unlimited natural contains a UnlimitedNatural-valued attribute. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getLiteralUnlimitedNatural_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The specified UnlimitedNatural value." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (behavioralFeatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "A behavioral feature specifies that an instance of a classifier will respond to a designated request by invoking a behavior. BehavioralFeature is an abstract metaclass specializing Feature and Namespace. Kinds of behavioral aspects are modeled by subclasses of BehavioralFeature. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)behavioralFeatureEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.BehavioralFeatureOperations.isDistinguishableFrom(this, n, ns);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "A query based on the following OCL expression:\r\n<code>\r\nif n.oclIsKindOf(BehavioralFeature)\r\nthen\r\n    if ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->notEmpty()\r\n    then Set{}->include(self)->include(n)->isUnique( bf | bf.parameter->collect(type))\r\n    else true\r\n    endif\r\nelse true\r\nendif\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getBehavioralFeature_Parameter(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the parameters of the BehavioralFeature. Subsets Namespace::member. This is a derived union and is ordered." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getBehavioralFeature_FormalParameter(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the ordered set of formal parameters of this BehavioralFeature. Subsets BehavioralFeature::parameter and Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getBehavioralFeature_ReturnResult(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the ordered set of return results of this BehavioralFeature. Subsets Behavioral- Feature::parameter and Namespace::ownedMember." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavioralFeature_RaisedException(), 
		   source, 
		   new String[] {
			 "documentation", "References the Types representing exceptions that may be raised during an invocation of this operation." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavioralFeature_IsAbstract(), 
		   source, 
		   new String[] {
			 "documentation", "If true, then the behavioral feature does not have an implementation, and one must be supplied by a more specific element. If false, the behavioral feature must have an implementation in the classifier or one must be inherited from a more general element. Communications" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavioralFeature_Method(), 
		   source, 
		   new String[] {
			 "documentation", "A behavioral description that implements the behavioral feature. There may be at most one behavior for a particular pairing of a classifier (as owner of the behavior) and a behavioral feature (as specification of the behavior)." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (structuralFeatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "A structural feature is a typed feature of a classifier that specify the structure of instances of the classifier. Structural feature is an abstract metaclass. By specializing multiplicity element, it supports a multiplicity that specifies valid cardinalities for the set of values associated with an instantiation of the structural feature. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStructuralFeature_IsReadOnly(), 
		   source, 
		   new String[] {
			 "documentation", "States whether the feature\u2019s value may be modified by a client. Default is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (instanceSpecificationEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, InstanceSpecification is a specialization of DeploymentTarget and DeployedArtifact. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getInstanceSpecification_Slot(), 
		   source, 
		   new String[] {
			 "documentation", "A slot giving the value or values of a structural feature of the instance. An instance specification can have one slot per structural feature of its classifiers, including inherited features. It is not necessary to model a slot for each structural feature, in which case the instance specification is a partial description. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInstanceSpecification_Classifier(), 
		   source, 
		   new String[] {
			 "documentation", "The classifier or classifiers of the represented instance. If multiple classifiers are specified, the instance is classified by all of them." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInstanceSpecification_Specification(), 
		   source, 
		   new String[] {
			 "documentation", "A specification of how to compute, derive, or construct the instance. Subsets Element:: ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (slotEClass, 
		   source, 
		   new String[] {
			 "documentation", "A slot is owned by an instance specification. It specifies the value or values for its defining feature, which must be a structural feature of a classifier of the instance specification owning the slot. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getSlot_OwningInstance(), 
		   source, 
		   new String[] {
			 "documentation", "The instance specification that owns this slot. Subsets Element::owner." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSlot_DefiningFeature(), 
		   source, 
		   new String[] {
			 "documentation", "The structural feature that specifies the values that may be held by the slot." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (instanceValueEClass, 
		   source, 
		   new String[] {
			 "documentation", "An instance value specifies the value modeled by an instance specification. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInstanceValue_Instance(), 
		   source, 
		   new String[] {
			 "documentation", "The instance that is the specified value." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (redefinableElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A redefinable element is a named element that can be redefined in the context of a generalization. RedefinableElement is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getRedefinableElement_RedefinitionContext(), 
		   source, 
		   new String[] {
			 "documentation", "the contexts that this element may be redefined from. This is a derived union." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getRedefinableElement_IsLeaf(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates whether it is possible to further specialize a RedefinableElement. If the value is true, then it is not possible to further specialize the RedefinableElement. Default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (generalizationEClass, 
		   source, 
		   new String[] {
			 "documentation", "A generalization relates a specific classifier to a more general classifier, and is owned by the specific classifier. Package PowerTypes (\u201cPowerTypes\u201d on page 109) A generalization can be designated as being a member of a particular generalization set. " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getGeneralization_Specific(), 
		   source, 
		   new String[] {
			 "documentation", "References the specializing classifier in the Generalization relationship. Subsets DirectedRelationship::source and Element::owner. Package PowerTypes (\u201cPowerTypes\u201d on page 109) \u2022 generalizationSet Designates a set in which instances of Generalization is considered members." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getGeneralization_General(), 
		   source, 
		   new String[] {
			 "documentation", "References the general classifier in the Generalization relationship. Subsets DirectedRelationship::target." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGeneralization_IsSubstitutable(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates whether the specific classifier can be used whereever the general classifier can be used. If true, the execution traces of the specific classifier will be a superset of the execution traces of the general classifier." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (packageableElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A packageable element indicates a named element that may be owned directly by a package. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getPackageableElement_PackageableElement_visibility(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates that packageable elements must always have a visibility, i.e., visibility is not optional. Redefines NamedElement::visibility." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (elementImportEClass, 
		   source, 
		   new String[] {
			 "documentation", "An element import is defined as a directed relationship between an importing namespace and a packageable element. The name of the packageable element or its alias is to be added to the namespace of the importing namespace. It is also possible to control whether the imported element can be further imported. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getElementImport_Visibility(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the visibility of the imported PackageableElement within the importing Package. The default visibility is the same as that of the imported element. If the imported element does not have a visibility, it is possible to add visibility to the element import." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getElementImport_Alias(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the name that should be added to the namespace of the importing Pack-age in lieu of the name of the imported PackagableElement. The aliased name must not clash with any other member name in the importing Package. By default, no alias is used." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getElementImport_ImportedElement(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the PackageableElement whose name is to be added to a Namespace. Subsets DirectedRelationship::target." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getElementImport_ImportingNamespace(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the Namespace that imports a PackageableElement from another Package. Subsets DirectedRelationship::source and Element::owner." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (packageImportEClass, 
		   source, 
		   new String[] {
			 "documentation", "A package import is defined as a directed relationship that identifies a package whose members are to be imported by a namespace. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)packageImportEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "return org.eclipse.uml2.internal.operation.PackageImportOperations.validatePublicOrPrivate(this, diagnostics, context);", //$NON-NLS-1$ //$NON-NLS-2$
			 "documentation", "An invariant constraint based on the following OCL expression:\r\n<code>\r\nself.visibility = #public or self.visibility = #private\r\n</code>" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getPackageImport_Visibility(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the visibility of the imported PackageableElements within the import-ing Namespace, i.e., whether imported elements will in turn be visible to other packages that use that importingPackage as an importedPackage. If the PackageImport is public, the imported elements will be visible outside the package, while if it is private they will not. By default, the value of visibility is public." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPackageImport_ImportedPackage(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the Package whose members are imported into a Namespace. Subsets DirectedRelationship::target." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPackageImport_ImportingNamespace(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the Namespace that imports the members from a Package. Subsets DirectedRelationship::source and Element::owner." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "documentation", "An association specifies a semantic relationship that can occur between typed instances. It has at least two ends represented by properties, each of which is connected to the type of the end. More than one end of the association may have the same type. When a property is owned by an association it represents a non-navigable end of the association. In this case the property does not appear in the namespace of any of the associated classifiers. When a property at an end of an association is owned by one of the associated classifiers it represents a navigable end of the association. In this case the property is also an attribute of the associated classifier. Only binary associations may have navigable ends. " //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getAssociation_IsDerived(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether the association is derived from other model elements such as other associations or constraints. The default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getAssociation_OwnedEnd(), 
		   source, 
		   new String[] {
			 "documentation", "The non-navigable ends that are owned by the association itself. This is an ordered association. Subsets Association::memberEnd, Classifier::feature, and Namespace::owned- Member." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getAssociation_EndType(), 
		   source, 
		   new String[] {
			 "documentation", "References the classifiers that are used as types of the ends of the association." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getAssociation_MemberEnd(), 
		   source, 
		   new String[] {
			 "documentation", "Each end represents participation of instances of the classifier connected to the end in links of the association. This is an ordered association. Subsets Namespace::member." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (packageMergeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A package merge is a relationship between two packages, where the contents of the target package (the one pointed at) is merged with the contents of the source package through specialization and redefinition, where applicable. This is a mechanism that should be used when elements of the same name are intended to represent the same concept, regardless of the package in which they are defined. A merging package will take elements of the same kind with the same name from one or more packages and merge them together into a single element using generalization and redefinitions. It should be noted that a package merge can be viewed as a short-hand way of explicitly defining those generalizations and redefinitions. The merged packages are still available, and the elements in those packages can be separately qualified. From an XMI point of view, it is either possible to exchange a model with all PackageMerges retained or a model where all PackageMerges have been transformed away (in which case package imports, generalizations, and redefinitions are used instead). " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getPackageMerge_MergingPackage(), 
		   source, 
		   new String[] {
			 "documentation", "References the Package that is being extended with the contents of the target of the PackageMerge. Subsets Element::owner and DirectedRelationship::source." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPackageMerge_MergedPackage(), 
		   source, 
		   new String[] {
			 "documentation", "References the Package that is to be merged with the source of the PackageMerge. Subsets DirectedRelationship;;target." //$NON-NLS-1$ //$NON-NLS-2$
		   });																		
		addAnnotation
		  (parameterDirectionKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "ParameterDirectionKind is an enumeration of the following literal values: \u2022 in Indicates that parameter values are passed into the behavioral element by the caller. \u2022 inout Indicates that parameter values are passed into a behavioral element by the caller and then back out to the caller from the behavioral element. \u2022 out Indicates that parameter values are passed from a behavioral element out to the caller. \u2022 return Indicates that parameter values are passed as return values from a behavioral element back to the caller. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (aggregationKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "AggregationKind is an enumeration of the following literal values: \u2022 none Indicates that the property has no aggregation. \u2022 shared Indicates that the property has a shared aggregation. \u2022 composite Indicates that the property is aggregated compositely, i.e., the composite object has responsibility for the existence and storage of the composed objects (parts). " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (behaviorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Behavior is a specification of how its context classifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution. A classifier behavior is always a definition of behavior and not an illustration. It describes the sequence of state changes an instance of a classifier may undergo in the course of its lifetime. Its precise semantics depends on the kind of classifier. For example, the classifier behavior of a collaboration represents emergent behavior of all the parts, whereas the classifier behavior of a class is just the behavior of instances of the class separated from the behaviors of any of its parts. When a behavior is associated as the method of a behavioral feature, it defines the implementation of that feature; i.e., the computation that generates the effects of the behavioral feature. As a classifier, a behavior can be specialized. Instantiating a behavior is referred to as \u201cinvocating\u201d the behavior, an instantiated behavior is also called a behavior \u201cexecution.\u201d A behavior may be invoked directly or its invocation may be the result of invoking the behavioral feature that specifies this behavior. A behavior can also be instantiated as an object in virtue of it being a class. The specification of a behavior can take a number of forms, as described in the subclasses of Behavior. Behavior is an abstract metaclass factoring out the commonalities of these different specification mechanisms. When a behavior is invoked, its execution receives a set of input values that are used to affect the course of execution and as a result of its execution it produces a set of output values which are returned, as specified by its parameters. The observable effects of a behavior execution may include changes of values of various objects involved in the execution, the creation and destruction of objects, generation of communications between objects, as well as an explicit set of output values. " //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getBehavior_IsReentrant(), 
		   source, 
		   new String[] {
			 "documentation", "Tells whether the behavior can be invoked while it is still executing from a previous invocation." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBehavior_Context(), 
		   source, 
		   new String[] {
			 "documentation", "The classifier owning the behavior. The features of the context classifier as well as the elements visible to the context classifier are visible to the behavior." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getBehavior_Specification(), 
		   source, 
		   new String[] {
			 "documentation", "Designates a behavioral feature that the behavior implements. The behavioral feature must be owned by the classifier that owns the behavior or be inherited by it. The parameters of the behavioral feature and the implementing behavior must match. If a behavior does not have a specification, it is directly associated with a classifier (i.e., it is the behavior of the classifier as a whole)." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getBehavior_Parameter(), 
		   source, 
		   new String[] {
			 "documentation", "References a list of parameters to the behavior which describes the order and type of arguments that can be given when the behavior is invoked and of the values which will be returned when the behavior completes its execution. (Specializes Namespace.owned- Member.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (behavioredClassifierEClass, 
		   source, 
		   new String[] {
			 "documentation", "A classifier can have behavior specifications defined in its namespace. One of these may specify the behavior of the classifier itself. " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getBehavioredClassifier_OwnedBehavior(), 
		   source, 
		   new String[] {
			 "documentation", "References behavior specifications owned by a classifier. (Specializes Namespace.owned- Member.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getBehavioredClassifier_ClassifierBehavior(), 
		   source, 
		   new String[] {
			 "documentation", "A behavior specification that specifies the behavior of the classifier itself. (Specializes BehavioredClassifier.ownedBehavior.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getBehavioredClassifier_Implementation(), 
		   source, 
		   new String[] {
			 "documentation", "(Specializes Element.ownedElement and Realization.clientDependency.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "documentation", "An activity contains a language-specific text string used to describe a computation, and an optional specification of the language. OCL, natural language, or programming languages may be used to specify an activity. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getActivity_Body(), 
		   source, 
		   new String[] {
			 "documentation", "A textual representation of the computation in the surface language determined by the language attribute." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivity_Language(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the language in which the body of the activity is stated. The interpretation of the expression body depends on the language." //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (permissionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Permission signifies granting of access rights from the supplier model element to a client model element. Or to put it another way, it signifies that the client requires access to some or all of the constituent elements of the supplier. The supplier element gives the client permission to access some or all of its constituents elements. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (dependencyEClass, 
		   source, 
		   new String[] {
			 "documentation", "A dependency is a relationship that signifies that a single or a set of model elements requires other model elements for their specification or implementation. This means that the complete semantics of the depending elements is either semantically or structurally dependent on the definition of the supplier element(s). " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDependency_Client(), 
		   source, 
		   new String[] {
			 "documentation", "The element that is affected by the supplier element. In some cases (such as a Trace Abstraction) the direction is unimportant and serves only to distinguish the two elements." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDependency_Supplier(), 
		   source, 
		   new String[] {
			 "documentation", "Designates the element that is unaffected by a change. In a two-way relationship (such as some Refinement Abstractions) this would be the more general element. In an undirected situation, such as a Trace Abstraction, the choice of client and supplier is not relevant." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (usageEClass, 
		   source, 
		   new String[] {
			 "documentation", "A usage is a relationship in which one element requires another element (or set of elements) for its full implementation or operation. In the metamodel, a Usage is a Dependency in which the client requires the presence of the supplier. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (abstractionEClass, 
		   source, 
		   new String[] {
			 "documentation", "An abstraction is a relationship that relates two elements or sets of elements that represent the same concept at different levels of abstraction or from different viewpoints. In the metamodel, an Abstraction is a Dependency in which there is a mapping between the supplier and the client. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getAbstraction_Mapping(), 
		   source, 
		   new String[] {
			 "documentation", "An composition of an Expression that states the abstraction relationship between the supplier and the client. In some cases, such as Derivation, it is usually formal and unidirectional; in other cases, such as Trace, it is usually informal and bidirectional. The mapping expression is optional and may be omitted if the precise relationship between the elements is not specified." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (realizationEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, a Realization is a subtype of Dependencies::Realization. " //$NON-NLS-1$ //$NON-NLS-2$
		   });														
		addAnnotation
		  (substitutionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A substitution is a relationship between two classifiers signifies that the substitutingClassifier complies with the contract specified by the contract classifier. This implies that instances of the substitutingClassifier are runtime substitutable where instances of the contract classifier are expected. " //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  (getSubstitution_Contract(), 
		   source, 
		   new String[] {
			 "documentation", "(Specializes Dependency.target.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSubstitution_SubstitutingClassifier(), 
		   source, 
		   new String[] {
			 "documentation", "(Specializes Dependency.client.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (generalizationSetEClass, 
		   source, 
		   new String[] {
			 "documentation", "Each Generalization is a binary relationship that relates a specific Classifier to a more general Classifier (i.e., a subclass). " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGeneralizationSet_IsCovering(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates (via the associated Generalizations) whether or not the set of specific Classifiers are covering for a particular general classifier. When isCovering is true, every instance of a particular general Classifier is also an instance of at least one of its specific Classifiers for the GeneralizationSet. When isCovering is false, there are one or more instances of the particular general Classifier that are not instances of at least one of its specific Classifiers defined for the GeneralizationSet. For example, Person could have two Generalization relationships each with a different specific Classifier: Male Person and Female Person. This GeneralizationSet would be covering because every instance of Person would be an instance of Male Person or Female Person. In contrast, Person could have a three Generalization relationships involving three specific Classifiers: North AmericanPerson, Asian Person, and European Person. This GeneralizationSet would not be covering because there are instances of Person for which these three specific Classifiers do not apply. The first example, then, could be read: any Person would be specialized as either being a Male Person or a Female Person\u2014and nothing else; the second could be read: any Person would be specialized as being North American Person, Asian Person, European Person, or something else." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGeneralizationSet_IsDisjoint(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates whether or not the set of specific Classifiers in a Generalization relationship have instance in common. If isDisjoint is true, the specific Classifiers for a particular GeneralizationSet have no members in common; that is, their intersection is empty. If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet have one or more members in common; that is, their intersection is not empty. For example, Person could have two Generalization relationships, each with the different specific Classifier: Manager or Staff. This would be disjoint because every instance of Person must either be a Manager or Staff. In contrast, Person could have two Generalization relationships involving two specific (and non-covering) Classifiers: Sales Person and Manager. This Generalization- Set would not be disjoint because there are instances of Person which can be a Sales Person and a Manager." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (associationClassEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, an AssociationClass is a declaration of a semantic relationship between Classifiers, which has a set of features of its own. AssociationClass is both an Association and a Class. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (informationItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "An information Item is an abstraction of all kinds of information that can be exchanged between objects. It is a kind of classifier intended for representing information at a very abstract way, which is cannot be instanciated. One purpose of Information Items is to be able to define preliminary models, before having taken detailed modeling decisions on types or stuctures. One other purpose of information items and information flows is to abstract complex models by a less precise but more general representation of the information exchanged betwen entities of a system. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInformationItem_Represented(), 
		   source, 
		   new String[] {
			 "documentation", ": Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers. Customer Company Employee product wage <<flow>> <<flow>>" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (informationFlowEClass, 
		   source, 
		   new String[] {
			 "documentation", "An Information Flow specifies that one or more information items circulate from its sources to its targets. Information flows require some kind of \u201cinformation channel\u201d for transmitting information items from the source to the destination. An information channel is repersented in various ways depending on the nature of its sources and targets. It may be represented by connectors, links, associations, or even dependencies. For example, if the source and destination are parts in some composite structure such as a collaboration, then the information channel is likely to be represented by a connector between them. Or, if the source and target are objects (which are a kind of InstanceSpecification), they may be represented by a link that joins the two, and so on. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInformationFlow_Realization(), 
		   source, 
		   new String[] {
			 "documentation", ": Determines which Relationship will realize the specified flow" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInformationFlow_Conveyed(), 
		   source, 
		   new String[] {
			 "documentation", ": Specifies the information items that may circulate on this information flow." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "documentation", "The Model construct is defined as a Package. It contains a (hierarchical) set of elements that together describe the physical system being modeled. A Model may also contain a set of elements that represents the environment of the system, typically Actors, together with their interrelationships, such as Associations and Dependencies " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getModel_Viewpoint(), 
		   source, 
		   new String[] {
			 "documentation", "The name of the viewpoint that is expressed by a model (This name may refer to a profile definition)." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (connectorEndEClass, 
		   source, 
		   new String[] {
			 "documentation", "A connector end is an endpoint of a connector, which attaches the connector to a connectable element. Each connector end is part of one connector. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getConnectorEnd_Role(), 
		   source, 
		   new String[] {
			 "documentation", "The connectable element attached at this connector end. When an instance of the containing classifier is created, a link may (depending on the multiplicities) be created to an instance of the classifier that types this connectable element." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (connectableElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A ConnectableElement is an abstract metaclass representing a set of instances that are owned by a containing classifier instance. Connectable elements may be joined by attached connectors and specify configurations of linked instances to be created within an instance of the containing classifier. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getConnectableElement_End(), 
		   source, 
		   new String[] {
			 "documentation", "Denotes a connector that attaches to this connectable element." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Each connector may be attached to two or more connectable elements, each representing a set of instances. Each connector end " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getConnector_Type(), 
		   source, 
		   new String[] {
			 "documentation", "An optional association that specifies the link corresponding to this connector." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getConnector_RedefinedConnector(), 
		   source, 
		   new String[] {
			 "documentation", "connector may be redefined when its containing classifier is specialized. The redefining connector may have a type that specializes the type of the redefined connector. The types of the connector ends of the redefining connector may specialize the types of the connector ends of the redefined connector. The properties of the connector ends of the redefining connector may be replaced. (Subsets Element.redefinedElement.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getConnector_End(), 
		   source, 
		   new String[] {
			 "documentation", "A connector consists of at two connector ends, each of which represents the participation of instances of the classifiers typing the connectable elements attached to this end. The set of connector ends is ordered. (Subsets Element.ownedElement.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (structuredClassifierEClass, 
		   source, 
		   new String[] {
			 "documentation", "A structured classifier is an abstract metaclass that represents any classifier whose behavior can be fully or partly described by the collaboration of owned or referenced instances. " //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  (getStructuredClassifier_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "documentation", "References the properties owned by the classifier. (Subsets StructuredClassifier.role, Classifier. attribute,and Namespace.ownedMember)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStructuredClassifier_Part(), 
		   source, 
		   new String[] {
			 "documentation", "References the properties specifying instances that the classifier owns by composition. This association is derived, selecting those owned properties where isComposite is true." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
			 "documentation", "References the roles that instances may play in this classifier. (Abstract union; subsets Classifier.feature.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getStructuredClassifier_OwnedConnector(), 
		   source, 
		   new String[] {
			 "documentation", "References the connectors owned by the classifier. (Subsets Classifier.feature and Namespace.ownedMember)" //$NON-NLS-1$ //$NON-NLS-2$
		   });												
		addAnnotation
		  (getActivityEdge_InStructuredNode(), 
		   source, 
		   new String[] {
			 "documentation", "Structured activity node containing the edge." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (activityGroupEClass, 
		   source, 
		   new String[] {
			 "documentation", "Activity groups are a generic grouping construct for nodes and edges. Nodes and edges can belong to more than group. They have no inherent semantics and can be used for various purposes. Subclasses of ActivityGroup may add semantics. " //$NON-NLS-1$ //$NON-NLS-2$
		   });																			
		addAnnotation
		  (getActivityGroup_ActivityGroup_activity(), 
		   source, 
		   new String[] {
			 "documentation", "Activity containing the group." //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getActivityNode_InStructuredNode(), 
		   source, 
		   new String[] {
			 "documentation", "Structured activity node containing the node." //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  (getAction_LocalPrecondition(), 
		   source, 
		   new String[] {
			 "documentation", "Constraint that must be satisfied when execution is started." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getAction_LocalPostcondition(), 
		   source, 
		   new String[] {
			 "documentation", "Constraint that must be satisfied when executed is completed." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getObjectNode_Ordering(), 
		   source, 
		   new String[] {
			 "documentation", "= FIFO Tells whether and how the tokens in the object node are ordered for selection to traverse edges outgoing from the object node." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getObjectNode_InState(), 
		   source, 
		   new String[] {
			 "documentation", "The required states of the object available at this point in the activity." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (controlNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A control node is an activity node used to coordinate the flows between other nodes. It covers initial node, final node and its children, fork node, join node, decision node, and merge node. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (controlFlowEClass, 
		   source, 
		   new String[] {
			 "documentation", "Objects and data cannot pass along a control flow edge. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getObjectFlow_Transformation(), 
		   source, 
		   new String[] {
			 "documentation", "Changes or replaces data tokens flowing along edge." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getObjectFlow_Selection(), 
		   source, 
		   new String[] {
			 "documentation", "Selects tokens from a source object node." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (initialNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "An activity may have more than one initial node. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (finalNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "See descriptions at children of final node. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (activityFinalNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "An activity may have more than one activity final node. The first one reached stops all flows in the activity. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (decisionNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A decision node has one incoming edge and multiple outgoing activity edges. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDecisionNode_DecisionInput(), 
		   source, 
		   new String[] {
			 "documentation", "Provides input to guard specifications on edges outgoing from the decision node." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (mergeNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A merge node has multiple incoming edges and a single outgoing edge. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getExecutableNode_Handler(), 
		   source, 
		   new String[] {
			 "documentation", "A set of exception handlers that are examined if an uncaught exception propagates to the outer level of the executable node." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (outputPinEClass, 
		   source, 
		   new String[] {
			 "documentation", "An output pin is a pin that holds output values produced by an action. Output pins are object nodes and deliver values to other actions through object flows. See Pin, Action, and ObjectNode for more details. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (inputPinEClass, 
		   source, 
		   new String[] {
			 "documentation", "An input pin is a pin that holds input values to be consumed by an action. They are object nodes and receive values from other actions through object flows. See Pin, Action, and ObjectNode for more details. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (pinEClass, 
		   source, 
		   new String[] {
			 "documentation", "Pins are connected as inputs and outputs to actions. They provide values to actions and accept result values from them. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (activityParameterNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Activity parameters are object nodes at the beginning and end of flows, to accept inputs to an activity and provide outputs from it. (CompleteActivities) Activity parameters inherit support for streaming and exceptions from Parameter. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityParameterNode_Parameter(), 
		   source, 
		   new String[] {
			 "documentation", "The parameter the object node will be accepting and providing values for." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (valuePinEClass, 
		   source, 
		   new String[] {
			 "documentation", "A value pin is an input pin that provides a value to an action that does not come from an incoming object flow edge. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getValuePin_Value(), 
		   source, 
		   new String[] {
			 "documentation", "Value that the pin will provide." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "documentation", "An interface is a kind of classifier that represents a declaration of a set of coherent public features and obligations. In a sense, " //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  (getInterface_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "documentation", "References the properties owned by the Interface. (Subsets Namespace.ownedMember and Classifier.feature.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInterface_OwnedOperation(), 
		   source, 
		   new String[] {
			 "documentation", "References the operations owned by the Interface. (Subsets Namespace.ownedMember and Classifier.feature.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInterface_RedefinedInterface(), 
		   source, 
		   new String[] {
			 "documentation", "(Subsets Element.redefinedElement.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getInterface_OwnedReception(), 
		   source, 
		   new String[] {
			 "documentation", "Receptions that objects providing this interface are willing to accept. (Subsets Namespace.ownedMember and Classifier.feature.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInterface_Protocol(), 
		   source, 
		   new String[] {
			 "documentation", "References a protocol state machine specifying the legal sequences of the invocation of the behavioral features described in the interface." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (implementationEClass, 
		   source, 
		   new String[] {
			 "documentation", "An Implementation is a specialized Realization relationship between a Classifier and an Interface. The implementation relationship signifies that the realizing classifier conforms to the contract specified by the interface. " //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  (getImplementation_Contract(), 
		   source, 
		   new String[] {
			 "documentation", "References the Interface specifying the conformance contract. (Specializes Dependency. supplier and Relationship.target)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getImplementation_ImplementingClassifier(), 
		   source, 
		   new String[] {
			 "documentation", "References the operations owned by the Interface. (Specializes Dependency.client and Relationship.source)" //$NON-NLS-1$ //$NON-NLS-2$
		   });															
		addAnnotation
		  (manifestationEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, a Manifestation is a subtype of Abstraction. A Manifestation is owned by an Artifact. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getManifestation_UtilizedElement(), 
		   source, 
		   new String[] {
			 "documentation", "The model element that is utilized in the manifestation in an Artifact. This association specializes the supplier association." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "documentation", "An Actor models a type of role played by an entity that interacts with the subject (e.g., by exchanging signals and data), but which is external to the subject (i.e., in the sense that an instance of an actor is not a part of the instance of its corresponding subject). Actors may represent roles played by human users, external hardware, or other subjects. Note that an actor does not necessarily represent a specific physical entity but merely a particular facet (i.e., \u201crole\u201d) of some entity that is relevant to the specification of its associated use cases. Thus, a single physical instance may play the role of several different actors and, conversely, a given actor may be played by multiple different instances. Since an actor is external to the subject, it is typically defined in the same classifier or package that incorporates the subject classifier. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (extendEClass, 
		   source, 
		   new String[] {
			 "documentation", "This relationship specifies that the behavior of a use case may be extended by the behavior of another (usually supplementary) use case. The extension takes place at one or more specific extension points defined in the extended use case. Note, however, that the extended use case is defined independently of the extending use case and is meaningful independently of the extending use case. On the other hand, the extending use case typically defines behavior that may not necessarily be meaningful by itself. Instead, the extending use case defines a set of modular behavior increments that augment an execution of the extended use case under specific conditions. Note that the same extending use case can extend more than one use case. Furthermore, an extending use case may itself be extended. It is a kind of DirectedRelationship, such that the source is the extending use case and the destination is the extended use case. It is also a kind of NamedElement so that it can have a name in the context of its owning use case. The extend relationship itself is owned by the extending use case. " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getExtend_ExtendedCase(), 
		   source, 
		   new String[] {
			 "documentation", "References the use case that is being extended. (Specializes DirectedRelationship.target.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (useCaseEClass, 
		   source, 
		   new String[] {
			 "documentation", "A UseCase is a kind of behaviored classifier that represents a declaration of an offered behavior. Each use case specifies some behavior, possibly including variants, that the subject can perform in collaboration with one or more actors. Use cases define the offered behavior of the subject without reference to its internal structure. These behaviors, involving interactions between the actor and the subject, may result in changes to the state of the subject and communications with its environment. A use case can include possible variations of its basic behavior, including exceptional behavior and error handling. The subject of a use case could be a physical system or any other element that may have behavior, such as a component, subsystem or class. Each use case specifies a unit of useful functionality that the subject provides to its users, i.e., a specific way of interacting with the subject. This functionality, which is initiated by an actor, must always be completed for the use case to complete. It is deemed complete if, after its execution, the subject will be in a state in which no further inputs or actions are expected and the use case can be initiated again or in an error state. Use cases can be used both for specification of the (external) requirements on a subject and for the specification of the functionality offered by a subject. Moreover, the use cases also state the requirements the specified subject poses on its environment by defining how they should interact with the subject so that it will be able to perform its services. The behavior of a use case can be described by a specification that is some kind of Behavior (through its ownedBehavior relationship), such as interactions, activities, and state machines, or by pre-conditions and post-conditions as well as by natural language text where appropriate. It may also be described indirectly through a Collaboration that uses the use case and its actors as the classifiers that type its parts. Which of these techniques to use depends on the nature of the use case behavior as well as on the intended reader. These descriptions can be combined. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (extensionPointEClass, 
		   source, 
		   new String[] {
			 "documentation", "An ExtensionPoint is a feature of a use case that identifies a point where the behavior of a use case can be augmented with elements of another (extending) use case. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (includeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Include is a DirectedRelationship between two use cases, implying that the behavior of the included use case is inserted into the behavior of the including use case. It is also a kind of NamedElement so that it can have a name in the context of its owning use case. The including use case may only depend on the result (value) of the included use case. This value is obtained as a result of the execution of the included use case. Note that the included use case is not optional, and is always required for the including use case to execute correctly. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getInclude_IncludingCase(), 
		   source, 
		   new String[] {
			 "documentation", "References the use case which will include the addition and owns the include relationship. (Specializes DirectedRelationship.source.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInclude_Addition(), 
		   source, 
		   new String[] {
			 "documentation", "References the use case that is to be included. (Specializes DirectedRelationship.target.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (collaborationOccurrenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "A collaboration occurrence represents one particular use of a collaboration to explain the relationships between the properties of a classifier. A collaboration occurrence indicates a set of roles and connectors that cooperate within the classifier according to a given collaboration, indicated by the type of the collaboration occurrence. There may be multiple occurrences of a given collaboration within a classifier, each involving a different set of roles and connectors. A given role or connector may be involved in multiple occurrences of the same or different collaborations. Associated dependencies map features of the collaboration type to features in the classifier. These dependencies indicate which role in the classifier plays which role in the collaboration. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCollaborationOccurrence_Type(), 
		   source, 
		   new String[] {
			 "documentation", "The collaboration which is used in this occurrence. The collaboration defines the cooperation between its roles which are mapped to properties of the classifier owning the collaboration occurrence." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (collaborationEClass, 
		   source, 
		   new String[] {
			 "documentation", "A collaboration is represented as a kind of classifier and defines a set of cooperating entities to be played by instances (its roles), as well as a set of connectors that define communication paths between the participating instances. The cooperating entities are the properties of the collaboration. A collaboration specifies a view (or projection) of a set of cooperating classifiers. It describes the required links between instances that play the roles of the collaboration, as well as the features required of the classifiers that specify the participating instances. Several collaborations may describe different projections of the same set of classifiers. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "documentation", "Ports represent interaction points between a classifier and its environment. The interfaces associated with a port specify the nature of the interactions that may occur over a port. The required interfaces of a port characterize the requests which may be made from the classifier to its environment through this port. The provided interfaces of a port characterize requests to the classifier that its environment may make through this port. A port has the ability to specify that any requests arriving at this port are handled by the behavior of the instance of the owning classifier, rather than being forwarded to any contained instances, if any. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getPort_IsBehavior(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether requests arriving at this port are sent to the classifier behavior of this classifier (see \u201cBehavioredClassifier (from BasicBehaviors)\u201d on page 387). Such ports are referred to as behavior port. Any invocation of a behavioral feature targeted at a behavior port will be handled by the instance of the owning classifier itself, rather than by any instances that this classifier may contain. The default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPort_IsService(), 
		   source, 
		   new String[] {
			 "documentation", "If true indicates that this port is used to provide the published functionality of a classifier; if false, this port is used to implement the classifier but is not part of the essential externally- visible functionality of the classifier and can, therefore, be altered or deleted along with the internal implementation of the classifier and other properties that are considered part of its implementation. The default value for this attribute is true." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPort_Required(), 
		   source, 
		   new String[] {
			 "documentation", "References the interfaces specifying the set of operations and receptions which the classifier expects its environment to handle. This association is derived as the set of interfaces required by the type of the port or its supertypes." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getPort_RedefinedPort(), 
		   source, 
		   new String[] {
			 "documentation", "A port may be redefined when its containing classifier is specialized. The redefining port may have additional interfaces to those that are associated with the redefined port or it may replace an interface by one of its subtypes. (Subsets Element.redefinedElement.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPort_Provided(), 
		   source, 
		   new String[] {
			 "documentation", "References the interfaces specifying the set of operations and receptions which the classifier offers to its environment, and which it will handle either directly or by forwarding it to a part of its internal structure. This association is derived from the interfaces realized by the type of the port or by the type of the port, if the port was typed by an interface." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPort_Protocol(), 
		   source, 
		   new String[] {
			 "documentation", "References an optional protocol state machine which describes valid interactions at this interaction point." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (encapsulatedClassifierEClass, 
		   source, 
		   new String[] {
			 "documentation", "Extends a classifier with the ability to own ports as specific and type checked interaction points. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getEncapsulatedClassifier_OwnedPort(), 
		   source, 
		   new String[] {
			 "documentation", "References a set of ports that an encapsulated classifier owns. (Subsets Classifier.feature and Namespace.ownedMember.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (callConcurrencyKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "CallConcurrencyKind is an enumeration with the following literals: \u2022 sequential No concurrency management mechanism is associated with the operation and, therefore, concurrency conflicts may occur. Instances that invoke a behavioral feature need to coordinate so that only one invocation to a target on any behavioral feature occurs at once. \u2022 guarded Multiple invocations of a behavioral feature may occur simultaneously to one instance, but only one is allowed to commence. The others are blocked until the performance of the first behavioral feature is complete. It is the responsibility of the system designer to ensure that deadlocks do not occur due to simultaneous blocks. \u2022 concurrent Multiple invocations of a behavioral feature may occur simultaneously to one instance and all of them may proceed concurrently. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (callTriggerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A call trigger represents the reception of a request to invoke a specific operation and specifies a call event. A call event is distinct from the call action that caused it. A call event may cause the invocation of a behavior that is the method of the operation referenced by the call request, if that operation is owned or inherited by the classifier that specified the receiver object. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCallTrigger_Operation(), 
		   source, 
		   new String[] {
			 "documentation", "Designates the operation whose invocation raised the call event that is specified by the call trigger." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (messageTriggerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A message trigger specifies the an observable event caused by a either a call or a signal. MessageTrigger is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (changeTriggerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A change trigger specifies an event that occurs when a Boolean-valued expression becomes true as a result of a change in value of one or more attributes or associations. A change event is raised implicitly and is not the result of an explicit action. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getChangeTrigger_ChangeExpression(), 
		   source, 
		   new String[] {
			 "documentation", "A Boolean-valued expression that will result in a change event whenever its value changes from false to true." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (triggerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A trigger specifies the an event that may cause the execution of an associated behavior. An event is often ultimately caused by the execution of an action, but need not be. Trigger is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTrigger_Port(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the ports at which a communication that caused an event may have arrived." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (receptionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A reception is a declaration stating that a classifier is prepared to react to the receipt of a signal. A reception designates a signal and specifies the expected behavioral response. The details of handling a signal are specified by the behavior associated with the reception or the classifier itself. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReception_Signal(), 
		   source, 
		   new String[] {
			 "documentation", "The signal that this reception handles." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (signalEClass, 
		   source, 
		   new String[] {
			 "documentation", "A signal is a specification of type of send request instances communicated between objects. The receiving object handles the signal instance as specified by its receptions. The data carried by a send request and passed to it by the occurrence of the send invocation event that caused the request is represented as attributes of the signal instance. A signal is defined independently of the classifiers handling the signal. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (signalTriggerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A signal event represents the receipt of an asynchronous signal. A signal event may cause a response, such as a state machine transition as specified in the classifier behavior of the classifier that specified the receiver object, if the signal referenced by the send request is mentioned in a reception owned or inherited by the classifier that specified the receiver object. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (timeTriggerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A time trigger specifies a time event, which models the expiration of a specific deadline. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getTimeTrigger_IsRelative(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether it is relative or absolute time." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTimeTrigger_When(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the corresponding time deadline." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (anyTriggerEClass, 
		   source, 
		   new String[] {
			 "documentation", "An AnyTrigger for a given state specifies that the transition is triggered for all applicable message triggers except for those specified explicitly on other transitions for this state. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "documentation", "A variable is considered a connectable element. " //$NON-NLS-1$ //$NON-NLS-2$
		   });																								
		addAnnotation
		  (getConditionalNode_Result(), 
		   source, 
		   new String[] {
			 "documentation", "A list of output pins that constitute the data flow outputs of the conditional." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClause_BodyOutput(), 
		   source, 
		   new String[] {
			 "documentation", "A list of output pins within the body fragment whose values are copied to the result pins of the containing conditional node or conditional node after execution of the clause body." //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getLoopNode_Result(), 
		   source, 
		   new String[] {
			 "documentation", "A list of output pins that constitute the data flow output of the entire loop." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getLoopNode_LoopVariable(), 
		   source, 
		   new String[] {
			 "documentation", "A list of output pins owned by the loop that hold the values of the loop variables during an execution of the loop. When the test fails, the values are copied to the result pins of the loop." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLoopNode_BodyOutput(), 
		   source, 
		   new String[] {
			 "documentation", "A list of output pins within the body fragment the values of which are copied to the loop variable pins after completion of execution of the body, before the next iteration of the loop begins or before the loop exits." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getLoopNode_LoopVariableInput(), 
		   source, 
		   new String[] {
			 "documentation", "A list of values that are copied into the loop variable pins before the first iteration of the loop." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interactionEClass, 
		   source, 
		   new String[] {
			 "documentation", "The point is that the InteractionConstraint \"received\" from StructuralArchitecture will consist of a set of such units described by sequence diagrams (or collaboration diagrams)." //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		   });							
		addAnnotation
		  (getInteraction_FormalGate(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the gates that form the message interface between this Interaction and any InteractionOccurrences which reference it." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interactionFragmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "An InteractionFragment is a general class that holds the common parts of CompositeFragment, AtomicFragment and InteractionExpressionOperand.\r\nConceptually it is very much the same as a full sequence diagram, but a fragment is not named and must be referred then through structure." //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getInteractionFragment_EnclosingOperand(), 
		   source, 
		   new String[] {
			 "documentation", "operand enclosing this InteractionFragment (they may nest recursively)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (lifelineEClass, 
		   source, 
		   new String[] {
			 "documentation", "A lifeline represents an individual participant in the Interaction. While Parts and StructuralFeatures may have multiplicity greater than 1, Lifelines represent only one interacting entity. Lifeline is a specialization of NamedElement. If the referenced ConnectableElement is multivalued (i.e. has a multiplicity > 1), then the Lifeline may have an expression (the \u2018selector\u2019) that specifies which particular part is represented by this Lifeline. If the selector is omitted this means that an arbitrary representative of the multivalued ConnectableElement is chosen. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getLifeline_Represents(), 
		   source, 
		   new String[] {
			 "documentation", "the ConnectableElement within the classifier that contains the enclosing interaction." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getLifeline_Interaction(), 
		   source, 
		   new String[] {
			 "documentation", "References the Interaction enclosing this Lifeline." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getLifeline_Selector(), 
		   source, 
		   new String[] {
			 "documentation", "If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Message defines a particular communication between Lifelines of an Interaction. A Message is a NamedElement that defines one specific kind of communication in an Interaction. A communication can be e.g. raising a signal, invoking an Operation, creating or destroying an Instance. The Message specifies not only the kind of communication given by the dispatching ExecutionOccurrence, but also the sender and the receiver. A Message associates normally two EventOccurrences - one sending EventOccurrence and one receiving EventOccurrence. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getMessage_MessageKind(), 
		   source, 
		   new String[] {
			 "documentation", "The derived kind of the Message (complete, lost, found or unknown) complete = sendEvent and receiveEvent are present lost = sendEvent present and receiveEvent absent found = sendEvent absent and receiveEvent present unknown = sendEvent and receiveEvent absent (should not appear)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessage_ReceiveEvent(), 
		   source, 
		   new String[] {
			 "documentation", "the Receiving of the Message" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessage_SendEvent(), 
		   source, 
		   new String[] {
			 "documentation", "References the Sending of the Message." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessage_Connector(), 
		   source, 
		   new String[] {
			 "documentation", "The Connector on which this Message is sent." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessage_Interaction(), 
		   source, 
		   new String[] {
			 "documentation", "The enclosing Interaction owning the Message" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessage_Signature(), 
		   source, 
		   new String[] {
			 "documentation", "The definition of the type or signature of the Message (depending on its kind)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getMessage_Argument(), 
		   source, 
		   new String[] {
			 "documentation", "arguments of the Message" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (generalOrderingEClass, 
		   source, 
		   new String[] {
			 "documentation", "A GeneralOrdering represents a binary relation between two Eventoccurrences, to describe that one Eventoccurrence must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of EventOccurrences that may otherwise not have a specified order. A GeneralOrdering is a specialization of NamedElement. A GeneralOrdering may appear anywhere in an Interaction, but only between Eventoccurrences. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGeneralOrdering_Before(), 
		   source, 
		   new String[] {
			 "documentation", "The Eventoccurrence referred comes before the Eventoccurrence referred by after" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGeneralOrdering_After(), 
		   source, 
		   new String[] {
			 "documentation", "The Eventoccurrence referred comes after the Eventoccurrence referred by before" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (messageEndEClass, 
		   source, 
		   new String[] {
			 "documentation", "A MessageEnd is an abstract NamedElement that represents what can occur at the end of a Message. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageEnd_ReceiveMessage(), 
		   source, 
		   new String[] {
			 "documentation", "the Message that contains the information of a receiveEvent" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getMessageEnd_SendMessage(), 
		   source, 
		   new String[] {
			 "documentation", "References the Message that contains the information of a sendEvent" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (eventOccurrenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "EventOccurrences represents moments in time to which Actions are associated. An EventOccurrence is the basic semantic unit of Interactions. The sequences of Eventoccurrences are the meanings of Interactions. Messages are sent through either asynchronous signal sending or operation calls. Likewise they are recieved by Receptions or actions of consumption. EventOccurrence is a specialization of InteractionFragment and of MessageEnd. EventOccurrences are ordered along a Lifeline. The namespace of an EventOccurrence is the Interaction in which it is contained. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (executionOccurrenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "An ExecutionOccurrence is an instantiation of a unit of behavior within the Lifeline. Since the ExecutionOccurrence will have some duration, it is represented by two Eventoccurrences, the start EventOccurrence and the finish EventOccurrence. An ExecutionOccurrence is an InteractionFragment. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExecutionOccurrence_Start(), 
		   source, 
		   new String[] {
			 "documentation", "References the Eventoccurrence that designates the start of the Action" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExecutionOccurrence_Finish(), 
		   source, 
		   new String[] {
			 "documentation", "References the Eventoccurrence that designates the finish of the Action." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExecutionOccurrence_Behavior(), 
		   source, 
		   new String[] {
			 "documentation", "References the associated behavior" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (stateInvariantEClass, 
		   source, 
		   new String[] {
			 "documentation", "A StateInvariant is a runtime constraint on the participants of the interaction. It may be used to specify a variety of different kinds of constraints, such as values of attributes or variables, internal or external states, and so on. A StateInvariant is an InteractionFragment and it is placed on a Lifeline. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getStateInvariant_Invariant(), 
		   source, 
		   new String[] {
			 "documentation", "A Constraint that should hold at runtime for this StateInvariant" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (stopEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Stop is an EventOccurrence that defines the termination of the instance specified by the Lifeline on which the Stop occurs. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (templateSignatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "A TemplateSignature is owned by a TemplateableElement and has one or more TemplateParameters that define the signature for binding this template. A TemplateSignature may reference a set of nested template signatures to reflect the hierarchical nature of a template. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getTemplateSignature_Parameter(), 
		   source, 
		   new String[] {
			 "documentation", "The complete set of formal template parameters for this template signature." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getTemplateSignature_OwnedParameter(), 
		   source, 
		   new String[] {
			 "documentation", "The formal template parameters that are owned by this template signature. Subsets parameter and Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTemplateSignature_Template(), 
		   source, 
		   new String[] {
			 "documentation", "element that owns this template signature. Subsets Element::owner." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (templateParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "TemplateParameter references a ParameterableElement which is exposed as a formal template parameter in the containing template. " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getTemplateParameter_Default(), 
		   source, 
		   new String[] {
			 "documentation", "element that is the default for this formal template parameter." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (templateableElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "TemplateableElement may contain a template signature which specifies the formal template parameters. A TemplateableElement that contains a template signature is often referred to as a template. TemplateableElement may contain bindings to templates that describe how the templateable element is constructed by replacing the formal template parameters with actual parameters. A TemplateableElement containing bindings is often referred to as a bound element. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  ((EOperation)templateableElementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "try {\r\n\tjava.lang.reflect.Method method = getClass().getMethod(\"parameterableElements\", null); //$NON-NLS-1$\r\n\tSet result = (Set) getCacheAdapter().get(this, method);\r\n\r\n\tif (null == result) {\r\n\t\tresult = java.util.Collections.unmodifiableSet(org.eclipse.uml2.internal.operation.TemplateableElementOperations.parameterableElements(this));\r\n\t\tgetCacheAdapter().put(this, method, result);\r\n\t}\r\n\r\n\treturn result;\r\n} catch (Exception e) {\r\n\treturn org.eclipse.uml2.internal.operation.TemplateableElementOperations.parameterableElements(this);\r\n}" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		   });					
		addAnnotation
		  (getTemplateableElement_TemplateBinding(), 
		   source, 
		   new String[] {
			 "documentation", "optional bindings from this element to templates." //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (parameterableElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A ParameterableElement can be referenced by a TemplateParameter when defining a formal template parameter for a template. A ParameterableElement can be referenced by a TemplateParameterSubstitution when used as an actual parameter in a binding of a template. ParameterableElement is an abstract metaclass. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (templateBindingEClass, 
		   source, 
		   new String[] {
			 "documentation", "TemplateBinding is a directed relationship from a bound templateable element to the template signature of the target template. A TemplateBinding owns a set of template parameter substitutions. " //$NON-NLS-1$ //$NON-NLS-2$
		   });											
		addAnnotation
		  (getTemplateBinding_BoundElement(), 
		   source, 
		   new String[] {
			 "documentation", "element that is bound by this binding. Subsets DirectedRelationship::source." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getTemplateBinding_ParameterSubstitution(), 
		   source, 
		   new String[] {
			 "documentation", "parameter substitutions owned by this template binding. Subsets Element::ownedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (templateParameterSubstitutionEClass, 
		   source, 
		   new String[] {
			 "documentation", "TemplateParameterSubstitution associates one or more actual parameters with a formal template parameter within the context of a TemplateBinding. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getTemplateParameterSubstitution_Formal(), 
		   source, 
		   new String[] {
			 "documentation", "The formal template parameter that is associated with this substitution." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTemplateParameterSubstitution_Actual(), 
		   source, 
		   new String[] {
			 "documentation", "elements that are the actual parameters for this substitution." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getTemplateParameterSubstitution_OwnedActual(), 
		   source, 
		   new String[] {
			 "documentation", "The actual parameters that are owned by this substitution. Subsets Element:: ownedElement and actual." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (operationTemplateParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "OperationTemplateParameter is a template parameter where the parametered element is an Operation. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (classifierTemplateParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "ClassifierTemplateParameter is a template parameter where the parametered element is a Classifier in its capacity of being a kind of ParameterableElement. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClassifierTemplateParameter_AllowSubstitutable(), 
		   source, 
		   new String[] {
			 "documentation", "the required relationship between an actual parameter and the parameteredElement for this formal parameter. Default is true." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (redefinableTemplateSignatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "RedefinableTemplateSignature specializes both TemplateSignature and RedefinableElement in order to allow the addition of new formal template parameters in the context of a specializing template Classifier. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (connectableElementTemplateParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "ConnectableElementTemplateParameter is a template parameter where the parametered element is a ConnectableElement. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (forkNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A fork node has one incoming edge and multiple outgoing edges. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getJoinNode_IsCombineDuplicate(), 
		   source, 
		   new String[] {
			 "documentation", "Tells whether tokens having objects with the same identity are combined into one by the join. Default value is true." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getJoinNode_JoinSpec(), 
		   source, 
		   new String[] {
			 "documentation", "A specification giving the conditions under which the join will emit a token. Default is \u201cand\u201d." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (flowFinalNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A flow final destroys all tokens that arrive at it. It has no effect on other flows in the activity. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (centralBufferNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A central buffer node accepts tokens from upstream objects nodes and passes them along to downstream object nodes. They act as a buffer for multiple in flows and out flows from other object nodes. They do not connect directly to actions. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (activityPartitionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Partitions divide the nodes and edges to constrain and show a view of the contained nodes. Partitions can share contents. They often correspond to organizational units in a business model. They may be used to allocate characteristics or resources among the nodes of an activity. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getActivityPartition_IsDimension(), 
		   source, 
		   new String[] {
			 "documentation", "Tells whether the partition groups other partitions along a dimension." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getActivityPartition_IsExternal(), 
		   source, 
		   new String[] {
			 "documentation", "Tells whether the partition represents an entity to which the partitioning structure does not apply." //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getActivityPartition_Represents(), 
		   source, 
		   new String[] {
			 "documentation", "An element constraining behaviors invoked by nodes in the partition." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (expansionNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "(ExtraStructuredActivities) An expansion node is an object node used to indicate a flow across the boundary of an expansion region. A flow into a region contains a collection that is broken into its individual elements inside the region, which is executed once per element. A flow out of a region combines individual elements into a collection for use outside the region. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExpansionNode_RegionAsOutput(), 
		   source, 
		   new String[] {
			 "documentation", "expansion region for which the node is an output." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExpansionNode_RegionAsInput(), 
		   source, 
		   new String[] {
			 "documentation", "expansion region for which the node is an input." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (expansionRegionEClass, 
		   source, 
		   new String[] {
			 "documentation", "An expansion region is a strictly nested region of an activity with explicit input and outputs (modeled as ExpansionNodes). Each input is a collection of values. If there are multiple input pins, each of them must hold the same kind of collection, although the types of the elements in the different collections may vary. The expansion region is executed once for each element (or position) in the input collection. If an expansion region has outputs, they must be collections of the same kind and must contain elements of the same type as the corresponding inputs. The number of output collections at runtime can differ from the number of input collections. On each execution of the region, an output value from the region is inserted into an output collection at the same position as the input elements. If the region execution ends with no output, then nothing is added to the output collection. If all the executions provide an output to the collection, then the output collections will have the same number of elements as the input collections. The inputs and outputs to an expansion region are modeled as ExpansionNodes. From \u201coutside\u201d of the region, the values on these nodes appear as collections. From \u201cinside\u201d the region the values appear as elements of the collections. Object flow edges connect pins outside the region to input and output expansion nodes as collections. Object flow edges connect pins inside the region to input and output expansion nodes as individual elements. From the inside of the region, these nodes are visible as individual values. If an expansion node has a name, it is the name of the individual element within the region. Any object flow edges that cross the boundary of the region, without passing through expansion nodes, provide values that are fixed within the different executions of the region. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExpansionRegion_Mode(), 
		   source, 
		   new String[] {
			 "documentation", "The way in which the executions interact: parallel \u2014 all interactions are independent iterative \u2014 the interactions occur in order of the elements stream \u2014 a stream of values flows into a single execution" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExpansionRegion_OutputElement(), 
		   source, 
		   new String[] {
			 "documentation", "An object node that accepts a separate element of the output collection during each of the multiple executions of the region. The values are formed into a collection that is available when the execution of the region is complete." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExpansionRegion_InputElement(), 
		   source, 
		   new String[] {
			 "documentation", "An object node that holds a separate element of the input collection during each of the multiple executions of the region." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (expansionKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", " (ExtraStructuredActivities) ExpansionKind is an enumeration type used to specify how multiple executions of an expansion region interact. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (exceptionHandlerEClass, 
		   source, 
		   new String[] {
			 "documentation", "(ExtraStructuredActivities) An exception handler is an element that specifies a body to execute in case the specified exception occurs during the execution of the protected node. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getExceptionHandler_ProtectedNode(), 
		   source, 
		   new String[] {
			 "documentation", "The node protected by the handler. The handler is examined if an exception propagates to the outside of the node." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getExceptionHandler_HandlerBody(), 
		   source, 
		   new String[] {
			 "documentation", "A node that is executed if the handler satisfies an uncaught exception." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interactionOccurrenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "InteractionOccurrence is a specialization of InteractionFragment. An InteractionOccurrence has a set of actual gates that must match the formal gates of the referenced Interaction. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getInteractionOccurrence_RefersTo(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the Interaction that defines its meaning" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInteractionOccurrence_ActualGate(), 
		   source, 
		   new String[] {
			 "documentation", "The actual gates of the InteractionOccurrence" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInteractionOccurrence_Argument(), 
		   source, 
		   new String[] {
			 "documentation", "The actual arguments of the Interaction" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Gate is a connection point for relating a Message outside an InteractionFragment with a Message inside the InteractionFragment. Gate is a specialization of MessageEnd. Gates are connected through Messages. A Gate is actually a representative of an EventOccurrence that is not in the same scope as the Gate. Gates play different roles: we have formal gates on Interactions, actual gates on InteractionOccurrences, expression gates on CombinedFragments. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (partDecompositionEClass, 
		   source, 
		   new String[] {
			 "documentation", "PartDecomposition is a description of the internal interactions of one Lifeline relative to an Interaction. A Lifeline has a class associated as the type of the ConnectableElement that the Lifeline represents. That class may have an internal structure and the PartDecomposition is an Interaction that describes the behavior of that internal structure relative to the Interaction where the decomposition is referenced. A PartDecomposition is a specialization of InteractionOccurrence. It associates with the ConnectableElement that it decomposes. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interactionOperandEClass, 
		   source, 
		   new String[] {
			 "documentation", "An InteractionOperand is contained in a CombinedFragment. An InteractionOperand represent one operand of the expression given by the enclosing CombinedFragment. An InteractionOperand is an InteractionFragment with an optional guard expression. An InteractionOperand may be guarded by a InteractionConstraint. Only InteractionOperands with a guard that evaluates to true at this point in the interaction will be considered for the production of the traces for the enclosing CombinedFragment. InteractionOperand contains an ordered set of InteractionFragments. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getInteractionOperand_Guard(), 
		   source, 
		   new String[] {
			 "documentation", "of the operand" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInteractionOperand_Fragment(), 
		   source, 
		   new String[] {
			 "documentation", "fragments of the operand." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interactionConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "An InteractionConstraint is a boolean expression that guards an operand in a CombinedFragment. InteractionConstraint is a specialization of Constraint. Furthermore the InteractionConstraint contains two expressions designating the minimum and maximum number of times a loop CombinedFragment should execute. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getInteractionConstraint_Minint(), 
		   source, 
		   new String[] {
			 "documentation", "minimum number of iterations of a loop" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInteractionConstraint_Maxint(), 
		   source, 
		   new String[] {
			 "documentation", "maximum number of iterations of a loop" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interactionOperatorEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Interaction Operator is an enumeration designating the different kinds of operators of CombinedFragments. The InteractionOperand defines the type of operator of a CombinedFragment. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (combinedFragmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "A combined fragment defines an expression of interaction fragments. A combined fragment is defined by an interaction operator and corresponding interaction operands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner. CombinedFragment is a specialization of InteractionFragment. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCombinedFragment_InteractionOperator(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the operation which defines the semantics of this combination of InteractionFragments." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCombinedFragment_Operand(), 
		   source, 
		   new String[] {
			 "documentation", "set of operands of the combined fragment." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCombinedFragment_CfragmentGate(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the gates that form the interface between this CombinedFragment and its surroundings" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (continuationEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Continuation is a syntactic way to define continuations of different branches of an Alternative CombinedFragment. Continuations is intuitively similar to labels representing intermediate points in a flow of control. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getContinuation_Setting(), 
		   source, 
		   new String[] {
			 "documentation", "True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning." //$NON-NLS-1$ //$NON-NLS-2$
		   });																																											
		addAnnotation
		  (getVertex_Container(), 
		   source, 
		   new String[] {
			 "documentation", "The region that contains this vertex." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getVertex_Outgoing(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the transitions departing from this vertex." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getVertex_Incoming(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the transitions entering this vertex." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (connectionPointReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Connection point references of a submachine state can be used as sources/targets of transitions. They represent entries into or exits out of the submachine state machine referenced by the submachine state. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getConnectionPointReference_Entry(), 
		   source, 
		   new String[] {
			 "documentation", "The entryPoint kind pseudo states corresponding to this connection point." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getConnectionPointReference_Exit(), 
		   source, 
		   new String[] {
			 "documentation", "The exitPoints kind pseudo states corresponding to this connection point." //$NON-NLS-1$ //$NON-NLS-2$
		   });										
		addAnnotation
		  (getTransition_Kind(), 
		   source, 
		   new String[] {
			 "documentation", "See definition of TransitionKind." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTransition_Source(), 
		   source, 
		   new String[] {
			 "documentation", "Designates the originating vertex (state or pseudostate) of the transition." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTransition_Target(), 
		   source, 
		   new String[] {
			 "documentation", "Designates the target vertex that is reached when the transition is taken." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTransition_Trigger(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the triggers that may fire the transition." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTransition_Guard(), 
		   source, 
		   new String[] {
			 "documentation", "A guard is a constraint that provides a fine-grained control over the firing of the transition. The guard is evaluated when an event is dispatched by the state machine. If the guard is true at that time, the transition may be enabled, otherwise, it is disabled. Guards should be pure expressions without side effects. Guard expressions with side effects are ill formed." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTransition_Effect(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies an optional activity to be performed when the transition fires." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (transitionKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "TransitionKind is an enumeration of the following literal values: \u2022 external \u2022 internal \u2022 local " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (createObjectActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action instantiates a classifier. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCreateObjectAction_Classifier(), 
		   source, 
		   new String[] {
			 "documentation", "Classifier to be instantiated." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCreateObjectAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:output) Gives the output pin on which the result is put." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (destroyObjectActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action destroys the object on its input pin at runtime. The object may be a link object, in which case the semantics of DestroyLinkAction also applies. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getDestroyObjectAction_Target(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) The input pin providing the object to be destroyed." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (testIdentityActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action returns true if the two input values are the same identity, false if they are not. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getTestIdentityAction_First(), 
		   source, 
		   new String[] {
			 "documentation", ". (Specialized from Action:input) Gives the pin on which an object is placed." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTestIdentityAction_Second(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Gives the pin on which an object is placed." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getTestIdentityAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:output) Tells whether the two input objects are identical." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (readSelfActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Every action is ultimately a part of some activity, which is in turn optionally attached in some way to the specification of a classifier\u2014for example as the body of a method or as part of a state machine. When the activity executes, it does so in the context of some specific host instance of that classifier. This action produces this host instance, if any, on its output pin. The type of the output pin is the classifier to which the activity is associated in the user model. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getReadSelfAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:output) Gives the output pin on which the hosting object is placed." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (structuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract action class statically specifies the structural feature being accessed. The object to access is specified dynamically, by referring to an input pin on which the object will be placed at runtime. The type of the value of this pin is the classifier that owns the specified structural feature, and the value\u2019s multiplicity is 1..1. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getStructuralFeatureAction_StructuralFeature(), 
		   source, 
		   new String[] {
			 "documentation", "Structural feature to be read." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getStructuralFeatureAction_Object(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Gives the input pin from which the object whose structural feature is to be read or written is obtained." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (readStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action reads the values of a structural feature, in order if the structural feature is ordered. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getReadStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:output) Gives the output pin on which the result is put." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (writeStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A write structural feature action operates on a structural feature of an object to modify its values. It has an input pin on which the value that will be added or removed is put. Other aspects of write structural feature actions are inherited from StructuralFeatureAction. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getWriteStructuralFeatureAction_Value(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Value to be added or removed from the structural feature." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (clearStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action removes all values of a structural feature. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (removeStructuralFeatureValueActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "The object to access is specified dynamically, by referring to an input pin on which the object will be placed at runtime. The type of the value of this pin is the classifier that owns the specified structural feature, and the value\u2019s multiplicity is 1..1. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (addStructuralFeatureValueActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Structural Features are potentially multi-valued and ordered, so the action supports specification of insertion points for new values. It also supports the removal of existing values of the structural feature before the new value is added. The object to access is specified dynamically, by referring to an input pin on which the object will be placed at runtime. The type of the value of this pin is the classifier that owns the specified structural feature, and the value\u2019s multiplicity is 1..1. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getAddStructuralFeatureValueAction_IsReplaceAll(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether existing values of the structural feature of the object should be removed before adding the new value." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getAddStructuralFeatureValueAction_InsertAt(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Gives the position at which to insert a new value or move an existing value in ordered structural features. The type of the pin is UnlimitedNatural, but the value cannot be zero. This pin is omitted for unordered structural features." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (linkActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A link action creates, destroys, or reads links, identifying a link by its end objects and qualifier values, if any. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLinkAction_EndData(), 
		   source, 
		   new String[] {
			 "documentation", "Data identifying one end of a link by the objects on its ends and qualifiers." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLinkEndData_Value(), 
		   source, 
		   new String[] {
			 "documentation", "Input pin that provides the specified object for the given end. This pin is omitted if the link-end data specifies an \u201copen\u201d end for reading." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLinkEndData_End(), 
		   source, 
		   new String[] {
			 "documentation", "Association end for which this link-end data specifies values." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLinkEndData_Qualifier(), 
		   source, 
		   new String[] {
			 "documentation", "Attribute representing the qualifier for which the value is to be specified." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (readLinkActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action navigates an association towards one end, which is the end that does not have an input pin to take its object (the \u201copen\u201d end). The objects put on the result output pin are the ones participating in the association at the open end, conforming to the specified qualifiers, in order if the end is ordered. The semantics is undefined for reading a link that violates the navigability or visibility of the open end. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getReadLinkAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:output) The pin on which are put the objects participating in the association at the end not specified by the inputs." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getLinkEndCreationData_IsReplaceAll(), 
		   source, 
		   new String[] {
			 "documentation", "= falseSpecifies whether the existing links emanating from the object on this end should be destroyed before creating a new link." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getLinkEndCreationData_InsertAt(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies where the new link should be inserted for ordered association ends, or where an existing link should be moved to. The type of the input is UnlimitedNatural, but the input cannot be zero. This pin is omitted for association ends that are not ordered." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (createLinkActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action can be used to create links and link objects. There is no return value in either case. This is so that no change of the action is required if the association is changed to an association class or vice versa. CreateLinkAction uses a specialization of LinkEndData called LinkEndCreationData, to support ordered associations. The insertion point is specified at runtime by an additional input pin, which is required for ordered association ends and omitted for unordered ends. The insertion point is a positive integer giving the position to insert the link, or infinity, to insert at the end. Reinserting an existing end at a new position moves the end to that position. CreateLinkAction also uses LinkEndCreationData to support the destruction of existing links of the association that connect any of the objects of the new link. When the link is created, this option is available on an end-by-end basis, and causes all links of the association emanating from the specified ends to be destroyed before the new link is created. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (writeLinkActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A write link action takes a complete identification of a link and creates or destroys it. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (destroyLinkActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action destroys a link or a link object. Link objects can also be destroyed with DestroyObjectAction. The link is specified in the same way as link creation, even for link objects. This allows actions to remain unchanged when their associations are transformed from ordinary ones to association classes and vice versa. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (clearAssociationActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action destroys all links of an association that have a particular object at one end. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getClearAssociationAction_Object(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Gives the input pin from which is obtained the object whose participation in the association is to be cleared." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClearAssociationAction_Association(), 
		   source, 
		   new String[] {
			 "documentation", "Association to be cleared." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (variableActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "VariableAction is an abstract class for actions that operate on a statically specified variable. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getVariableAction_Variable(), 
		   source, 
		   new String[] {
			 "documentation", "Variable to be read." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (readVariableActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action reads the values of a variables, in order if the variable is ordered. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getReadVariableAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:output) Gives the output pin on which the result is put." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (writeVariableActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A write variable action operates on a variable to modify its values. It has an input pin on which the value that will be added or removed is put. Other aspects of write variable actions are inherited from VariableAction. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getWriteVariableAction_Value(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Value to be added or removed from the variable." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (clearVariableActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action removes all values of an variable. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (addVariableValueActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Variables are potentially multi-valued and ordered, so the action supports specification of insertion points for new values. It also supports the removal of existing values of the variable before the new value is added. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getAddVariableValueAction_IsReplaceAll(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether existing values of the variable should be removed before adding the new value." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getAddVariableValueAction_InsertAt(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Gives the position at which to insert a new value or move an existing value in ordered variables. The types is UnlimitedINatural, but the value cannot be zero. This pin is omitted for unordered variables." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (removeVariableValueActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "One value is removed from the set of possible variable values. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (applyFunctionActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "ApplyFunctionAction is an action that invokes a primitive predefined function that computes output values based only on the input values and the function. The execution does not have access to object memory or to any objects. The execution of a primitive function has no side effects on any other object. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getApplyFunctionAction_Function(), 
		   source, 
		   new String[] {
			 "documentation", "The primitive function to be invoked." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getApplyFunctionAction_Argument(), 
		   source, 
		   new String[] {
			 "documentation", "The pins that provide inputs to the function. (Specializes Action.input.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getApplyFunctionAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "The pins on which the results of invoking the function are returned. (Specializes Action.output.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (primitiveFunctionEClass, 
		   source, 
		   new String[] {
			 "documentation", "PrimitiveFunction is not an action. It is the signature of a function that produces output values from input values for use with ApplyFunctionAction. The behavior is described using the body and language attributes. The specification of the detailed behavior is expressed in an external language and is not further specified within UML. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPrimitiveFunction_Body(), 
		   source, 
		   new String[] {
			 "documentation", "A textual representation of the function in the named surface language." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getPrimitiveFunction_Language(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the language in which the body of the primitive function is stated. The interpretation of the body depends on the language. If the language is unspecified, it might be implicit from the body or the context." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (callActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "CallAction is an abstract class for actions that invoke behavior and receive return values. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCallAction_IsSynchronous(), 
		   source, 
		   new String[] {
			 "documentation", "If true, the call is synchronous and the caller waits for completion of the invoked behavior. If false, the call is asynchronous and the caller proceeds immediately and does not expect a return values." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCallAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "A list of output pins where the results of performing the invocation are placed." //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getInvocationAction_Argument(), 
		   source, 
		   new String[] {
			 "documentation", "Specification of an argument value that appears during execution." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (sendSignalActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "SendSignalAction is an action that creates a signal instance from its inputs, and transmits it to the target object, where it may cause the firing of a state machine transition or the execution of an activity. The argument values are available to the execution of associated behaviors. The requestor continues execution immediately. Any reply message is ignored and is not transmitted to the requestor. If the input is already a signal instance, use SendObjectAction. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getSendSignalAction_Target(), 
		   source, 
		   new String[] {
			 "documentation", "The target object to which the signal is sent." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSendSignalAction_Signal(), 
		   source, 
		   new String[] {
			 "documentation", "The type of signal transmitted to the target object." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (broadcastSignalActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "BroadcastSignalAction is an action that transmits a signal instance to all the potential target objects in the system, which may cause the firing of a state machine transitions or the execution of associated activities of a target object. The argument values are available to the execution of associated behaviors. The requestor continues execution immediately after the signals are sent out. It does not wait for receipt. Any reply messages are ignored and are not transmitted to the requestor. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getBroadcastSignalAction_Signal(), 
		   source, 
		   new String[] {
			 "documentation", "The specification of signal object transmitted to the target objects." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (sendObjectActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "SendObjectAction is an action that transmits an object to the target object, where it may invoke behavior such as the firing of state machine transitions or the execution of an activity. The value of the object is available to the execution of invoked behaviors. The requestor continues execution immediately. Any reply message is ignored and is not transmitted to the requestor. " //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (callOperationActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "CallOperationAction is an action that transmits an operation call request to the target object, where it may cause the invocation of associated behavior. The argument values of the action are available to the execution of the invoked behavior. If the action is marked synchronous, the execution of the call operation action waits until the execution of the invoked behavior completes and a reply transmission is returned to the caller; otherwise execution of the action is complete when the invocation of the operation is established and the execution of the invoked operation proceeds concurrently with the execution of the calling activity. Any values returned as part of the reply transmission are put on the result output pins of the call operation action. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getCallOperationAction_Operation(), 
		   source, 
		   new String[] {
			 "documentation", "The operation to be invoked by the action execution" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCallOperationAction_Target(), 
		   source, 
		   new String[] {
			 "documentation", "The target object to which the request is sent. The classifier of the target object is used to dynamically determine a behavior to invoke. This object constitutes the context of the execution of the operation." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (callBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "CallBehaviorAction is a call action that invokes a behavior directly rather than invoking a behavioral feature that, in turn, results in the invocation of that behavior. The argument values of the action are available to the execution of the invoked behavior. The execution of the call behavior action waits until the execution of the invoked behavior completes and a result is returned on its output pin. In particular, the invoked behavior may be an activity. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCallBehaviorAction_Behavior(), 
		   source, 
		   new String[] {
			 "documentation", "The invoked behavior. It must be capable of accepting and returning control." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (timeExpressionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A TimeExpression defines a value specification that represent a time value. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTimeExpression_FirstTime(), 
		   source, 
		   new String[] {
			 "documentation", "True if the TimeExpression describes the first point in time of the NamedElement referenced by event, in cases where the NamedElement describes something which extends in time. False if the TimeExpression describes the last point in time for the referenced NamedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTimeExpression_Event(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the specification of the event occurrence that the TimeExpression describes" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (durationEClass, 
		   source, 
		   new String[] {
			 "documentation", "A duration defines a value specification that specifies the temporal distance between two time expressions that specify time instants. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDuration_FirstTime(), 
		   source, 
		   new String[] {
			 "documentation", "If the duration is between times of two NamedElements, there are two Boolean attributes, one for the start of the duration and one for the end of the duration. For each of these it holds that firstTime is true if the time information is associated with the first point in time of the NamedElement referenced by event, and false if it represents the last point in time of the NamedElement. If there is only one NamedElement referenced by event, then this attribute is irrelevant. The default value is true." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDuration_Event(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the specification(s) that describes the starting TimeExpression and the ending TimeExpression of the Duration. If only one NamedElement is referenced, the duration is from the first point in time of that NamedElement until the last point in time of that NamedElement." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (timeObservationActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A TimeObservationAction defines an action that observes the current point in time. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getTimeObservationAction_Now(), 
		   source, 
		   new String[] {
			 "documentation", "Represents the current point in time." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (durationIntervalEClass, 
		   source, 
		   new String[] {
			 "documentation", "A DurationInterval defines the range between two Durations. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (intervalEClass, 
		   source, 
		   new String[] {
			 "documentation", "An Interval defines the range between two value specifications. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterval_Min(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the ValueSpecification denoting the minimum value of the range." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getInterval_Max(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the ValueSpecification denoting the maximum value of the range." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (timeConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "A TimeConstraint defines a Constraint that refers to a TimeInterval. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (intervalConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "A IntervalConstraint defines a Constraint that refers to an Interval. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (timeIntervalEClass, 
		   source, 
		   new String[] {
			 "documentation", "A TimeInterval defines the range between two TimeExpressions. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (durationObservationActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A DurationObservationAction defines an action that observes duration in time. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getDurationObservationAction_Duration(), 
		   source, 
		   new String[] {
			 "documentation", "represent the measured Duration" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (durationConstraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "A DurationConstraint defines a Constraint that refers to a DurationInterval. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (dataStoreNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A data store keeps all tokens that enter it, copying them when they are chosen to move downstream. Incoming tokens containing a particular object replace any tokens in the object node containing that object. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (parameterEffectKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "The datatype ParameterEffectKind is an enumeration that indicates the effect of a behavior on values passed in or out of its parameters (see \u201cParameter (as specialized)\u201d on page 354). " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (interruptibleActivityRegionEClass, 
		   source, 
		   new String[] {
			 "documentation", "An interruptible region contains activity nodes. When a token leaves an interruptible region via edges designated by the region as interrupting edges, all tokens and behaviors in the region are terminated. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getInterruptibleActivityRegion_InterruptingEdge(), 
		   source, 
		   new String[] {
			 "documentation", ".The edges leaving the region that will abort other tokens flowing in the region." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (objectNodeOrderingKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "ObjectNodeOrderingKind is an enumeration indicating queuing order within a node. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (parameterSetEClass, 
		   source, 
		   new String[] {
			 "documentation", "An parameter set acts as a complete set of inputs and outputs to a behavior, exclusive of other parameter sets on the behavior. " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getComponent_IsIndirectlyInstantiated(), 
		   source, 
		   new String[] {
			 "documentation", "{default = true} The kind of instantiation that applies to a Component. If false, the component is instantiated as an addressable object. If true, the Component is defined at design-time, but at runtime (or execution-time) an object specified by the Component does not exist, that is, the component is instantiated indirectly, through the instantiation of its realizing classifiers or parts. Several standard stereotypes use this meta attribute, e.g. \u00abspecification, \u00abfocus\u00bb, \u00absubsystem \u00bb." //$NON-NLS-1$ //$NON-NLS-2$
		   });																	
		addAnnotation
		  (deployedArtifactEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, DeployedArtifact is an abstract metaclass that is a specialization of NamedElement. A DeployedArtifact is involved in one or more Deployments to a DeploymentTarget. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (deploymentTargetEClass, 
		   source, 
		   new String[] {
			 "documentation", "A deployment target is the location for a deployed artifact. In the metamodel, DeploymentTarget is an abstract metaclass that is a specialization of NamedElement. A DeploymentTarget owns a set of Deployments. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, a Node is a subclass of Class. It is associated with a Deployment of an Artifact. It is also associated with a set of Elements that are deployed on it. This is a derived association in that these PackageableElements are involved in a Manifestation of an Artifact that is deployed on the Node. Nodes may have an internal structure defined in terms of parts and connectors associated with them for advanced modeling applications. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (deviceEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Device is a physical computational resource with processing capability upon which artifacts may be deployed for execution. Devices may be complex, i.e. they may consist of other devices. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (executionEnvironmentEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, a ExecutionEnvironment is a subclass of Node. It is usually part of a general Node, representing the physical hardware environment on which the ExecutionEnvironment resides. In that environment, the ExecutionEnvironment implements a standard set of services that Components require at execution time (at the modeling level these services are usually implicit). For each component Deployment, aspects of these services may be determined by properties in a DeploymentSpecification for a particular kind of ExecutionEnvironment. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (communicationPathEClass, 
		   source, 
		   new String[] {
			 "documentation", "A communication path is an association between two Nodes, through which Nodes are able to exchange signals and messages. In the metamodel, CommunicationPath is a subclass of Association. " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getProtocolConformance_SpecificMachine(), 
		   source, 
		   new String[] {
			 "documentation", ": Specifies the state machine which conforms to the general state machine." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getProtocolConformance_GeneralMachine(), 
		   source, 
		   new String[] {
			 "documentation", ": Specifies the protocol state machine to which the specific state machine conforms." //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getProtocolStateMachine_Conformance(), 
		   source, 
		   new String[] {
			 "documentation", ": Conformance between protocol state machines." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (protocolTransitionEClass, 
		   source, 
		   new String[] {
			 "documentation", "A protocol transition (transition as specialized in the ProtocolStateMachines package) specifies a legal transition for an operation. Transitions of protocol state machines have the following information: a pre condition (guard), on trigger, and a post condition. Every protocol transition is associated to zero or one operation (referred BehavioralFeature) that belongs to the context classifier of the protocol state machine. The protocol transition specifies that the associated (referred) operation can be called for an instance in the origin state under the initial condition (guard), and that at the end of the transition, the destination state will be reached under the final condition (post). " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getProtocolTransition_PostCondition(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the post condition of the transition which is the condition that should be obtained once the transition is triggered. This post condition is part of the post condition of the operation connected to the transition." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getProtocolTransition_PreCondition(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the precondition of the transition. It specifies the condition that should be verified before triggering the transition. This guard condition added to the source state will be evaluated as part of the precondition of the operation refered by the transition if any." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (readExtentActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "(CompleteActions) ReadExtentAction is an action that retrieves the current instances of a classifier. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getReadExtentAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "The runtime instances of the classifier." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReadExtentAction_Classifier(), 
		   source, 
		   new String[] {
			 "documentation", "The classifier whose instances are to be retrieved." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (reclassifyObjectActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "ReclassifyObjectAction adds given classifier to an object and removes given classifiers from that object. Multiple classifiers may be added and removed at a time. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReclassifyObjectAction_IsReplaceAll(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies whether existing classifiers should be removed before adding the new classifiers. The default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReclassifyObjectAction_OldClassifier(), 
		   source, 
		   new String[] {
			 "documentation", "A set of classifiers to be removed from the classifiers of the object." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReclassifyObjectAction_NewClassifier(), 
		   source, 
		   new String[] {
			 "documentation", "A set of classifiers to be added to the classifiers of the object." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getReclassifyObjectAction_Object(), 
		   source, 
		   new String[] {
			 "documentation", "Holds the object to be reclassified. (Specializes Action.input.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (readIsClassifiedObjectActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action tests the classification of an object against a given class. It can be restricted to testing direct instances. " //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getReadIsClassifiedObjectAction_IsDirect(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates whether the classifier must directly classify the input object. The default value is false." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReadIsClassifiedObjectAction_Classifier(), 
		   source, 
		   new String[] {
			 "documentation", "The classifier against which the classification of the input object is tested." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getReadIsClassifiedObjectAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "After termination of the action, will hold the result of the test. (Specializes Action.output.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getReadIsClassifiedObjectAction_Object(), 
		   source, 
		   new String[] {
			 "documentation", "Holds the object whose classification is to be tested. (Specializes Action.input.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (startOwnedBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "(CompleteActions) StartOwnedBehaviorAction is an action that starts the owned behavior of the input. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getStartOwnedBehaviorAction_Object(), 
		   source, 
		   new String[] {
			 "documentation", "Holds the object on which to start the owned behavior. (Specializes Action.input.)" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (qualifierValueEClass, 
		   source, 
		   new String[] {
			 "documentation", "A link cannot be passed as a runtime value to or from an action. Instead, a link is identified by its end objects and qualifier values, as required. This requires more than one piece of data, namely, the end in the user model, the object on the end, and the qualifier values for that end. These pieces are brought together around LinkEndData. Each association end is identified separately with an instance of the LinkEndData class. " //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getQualifierValue_Value(), 
		   source, 
		   new String[] {
			 "documentation", "Input pin from which the specified value for the qualifier is taken." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (readLinkObjectEndActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action reads the object on an end of a link object. The association end to retrieve the object from is specified statically, and the link object to read is provided on the input pin at run time. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getReadLinkObjectEndAction_End(), 
		   source, 
		   new String[] {
			 "documentation", "Link end to be read." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (readLinkObjectEndQualifierActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action reads a qualifier value or values on an end of a link object. The association end to retrieve the qualifier from is specified statically, and the link object to read is provided on the input pin at run time. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Object(), 
		   source, 
		   new String[] {
			 "documentation", "(Specialized from Action:input) Gives the input pin from which the link object is obtained." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "Pin where the result value is placed" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Qualifier(), 
		   source, 
		   new String[] {
			 "documentation", "The attribute representing the qualifier to be read." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (createLinkObjectActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This action is exclusively for creating links of association classes. It returns the created link object. " //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (getAcceptEventAction_Trigger(), 
		   source, 
		   new String[] {
			 "documentation", "The type of event accepted by the action, as specified by a trigger. If it is a signal trigger, a signal of any subtype of the specified signal type is accepted." //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getAcceptEventAction_Result(), 
		   source, 
		   new String[] {
			 "documentation", "Pin holding the event object that has been received. Event objects may be copied in transmission, so identity might not be preserved." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (acceptCallActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "(CompleteActions) AcceptCallAction is an accept event action representing the receipt of a synchronous call request. In addition to the normal operation parameters, the action produces a output token that is needed later to supply the information to the ReplyAction necessary to return control to the caller. This action is for synchronous calls. " //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getAcceptCallAction_ReturnInformation(), 
		   source, 
		   new String[] {
			 "documentation", "Pin where a token is placed containing sufficient information to perform a subsequent reply and return control to the caller. The value in this token is opaque. It can be passed and copied but it cannot be manipulated by the model." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (replyActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "(CompleteActions) ReplyAction is an action that accepts a set of return values and a token containing return information produced by a previous accept call action. The reply action returns the values to the caller of the previous call, completing execution of the call. " //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (getReplyAction_ReplyToCall(), 
		   source, 
		   new String[] {
			 "documentation", "The operation call trigger being replied to." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getReplyAction_ReplyValue(), 
		   source, 
		   new String[] {
			 "documentation", "A list of pins containing the reply values of the operation. These values are returned to the caller." //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getReplyAction_ReturnInformation(), 
		   source, 
		   new String[] {
			 "documentation", "A pin containing the return information token produced by an earlier AcceptCallAction." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (raiseExceptionActionEClass, 
		   source, 
		   new String[] {
			 "documentation", "(CompleteActions) RaiseExceptionAction is an action that causes an exception to occur. The input value becomes the exception object. " //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (getRaiseExceptionAction_Exception(), 
		   source, 
		   new String[] {
			 "documentation", "An input pin whose value becomes an exception object." //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (deploymentSpecificationEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the metamodel, a DeploymentSpecification is a subtype of Artifact. It defines a set of deployment properties that are specific to a certain Container type. An instance of a DeploymentSpecification with specific values for these properties may be contained in a complex Artifact. " //$NON-NLS-1$ //$NON-NLS-2$
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
		  ((EOperation)packageEClass.getEOperations().get(0), 
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
		  ((EOperation)expressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  ((EOperation)commentEClass.getEOperations().get(0), 
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
		  ((EOperation)exceptionHandlerEClass.getEOperations().get(0), 
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
		  ((EOperation)parameterSetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  ((EOperation)componentEClass.getEOperations().get(0), 
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
		  (getExpression_Operand(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });								
		addAnnotation
		  (getComment_BodyExpression(), 
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
		  (getExceptionHandler_ProtectedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwner", "" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getParameterSet_Condition(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (getComponent_Realization(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Element#getOwnedElements", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "org.eclipse.uml2.NamedElement#getClientDependencies", "" //$NON-NLS-1$ //$NON-NLS-2$
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
		  ((EOperation)directedRelationshipEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derived", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "relatedElement", //$NON-NLS-1$ //$NON-NLS-2$
			 "eType", "org.eclipse.uml2.Element", //$NON-NLS-1$ //$NON-NLS-2$
			 "containment", "false" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getInterruptibleActivityRegion_ContainedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.ActivityGroup#getContainedNodes", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });													
		addAnnotation
		  (getComponent_OwnedMember(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Namespace#getOwnedMembers", "" //$NON-NLS-1$ //$NON-NLS-2$
		   });																									
		addAnnotation
		  (getNode_NestedNode(), 
		   source, 
		   new String[] {
			 "org.eclipse.uml2.Class#getNestedClassifiers", "" //$NON-NLS-1$ //$NON-NLS-2$
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
		  ((EOperation)sendObjectActionEClass.getEOperations().get(0), 
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
		addAnnotation
		  ((EOperation)nodeEClass.getEOperations().get(0), 
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
		  ((EOperation)componentEClass.getEOperations().get(1), 
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
	}

} //UML2PackageImpl
