/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLSwitch.java,v 1.11 2006/05/16 15:07:26 khussey Exp $
 */
package org.eclipse.uml2.uml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.AddVariableValueAction;
import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.CallAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Classifier;
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
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Continuation;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.ControlNode;
import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.CreateLinkObjectAction;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.CreationEvent;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.DestructionEvent;
import org.eclipse.uml2.uml.Device;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.DurationInterval;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.ExecutionEnvironment;
import org.eclipse.uml2.uml.ExecutionEvent;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.FinalNode;
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
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.IntervalConstraint;
import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LinkAction;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralSpecification;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageEvent;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationTemplateParameter;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.Pin;
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
import org.eclipse.uml2.uml.ReceiveOperationEvent;
import org.eclipse.uml2.uml.ReceiveSignalEvent;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.ReclassifyObjectAction;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.ReduceAction;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.uml.RemoveVariableValueAction;
import org.eclipse.uml2.uml.ReplyAction;
import org.eclipse.uml2.uml.SendObjectAction;
import org.eclipse.uml2.uml.SendOperationEvent;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.SendSignalEvent;
import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StartClassifierBehaviorAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuralFeatureAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.TestIdentityAction;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UnmarshallAction;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.ValueSpecificationAction;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VariableAction;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.WriteLinkAction;
import org.eclipse.uml2.uml.WriteStructuralFeatureAction;
import org.eclipse.uml2.uml.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage
 * @generated
 */
public class UMLSwitch {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLSwitch() {
		if (modelPackage == null) {
			modelPackage = UMLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
				? defaultCase(theEObject)
				: doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UMLPackage.COMMENT : {
				Comment comment = (Comment) theEObject;
				Object result = caseComment(comment);
				if (result == null)
					result = caseElement(comment);
				if (result == null)
					result = caseEModelElement(comment);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ELEMENT : {
				Element element = (Element) theEObject;
				Object result = caseElement(element);
				if (result == null)
					result = caseEModelElement(element);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PACKAGE : {
				org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) theEObject;
				Object result = casePackage(package_);
				if (result == null)
					result = caseNamespace(package_);
				if (result == null)
					result = casePackageableElement(package_);
				if (result == null)
					result = caseTemplateableElement(package_);
				if (result == null)
					result = caseNamedElement(package_);
				if (result == null)
					result = caseParameterableElement(package_);
				if (result == null)
					result = caseElement(package_);
				if (result == null)
					result = caseEModelElement(package_);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PACKAGEABLE_ELEMENT : {
				PackageableElement packageableElement = (PackageableElement) theEObject;
				Object result = casePackageableElement(packageableElement);
				if (result == null)
					result = caseNamedElement(packageableElement);
				if (result == null)
					result = caseParameterableElement(packageableElement);
				if (result == null)
					result = caseElement(packageableElement);
				if (result == null)
					result = caseEModelElement(packageableElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.NAMED_ELEMENT : {
				NamedElement namedElement = (NamedElement) theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null)
					result = caseElement(namedElement);
				if (result == null)
					result = caseEModelElement(namedElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DEPENDENCY : {
				Dependency dependency = (Dependency) theEObject;
				Object result = caseDependency(dependency);
				if (result == null)
					result = casePackageableElement(dependency);
				if (result == null)
					result = caseDirectedRelationship(dependency);
				if (result == null)
					result = caseNamedElement(dependency);
				if (result == null)
					result = caseParameterableElement(dependency);
				if (result == null)
					result = caseRelationship(dependency);
				if (result == null)
					result = caseElement(dependency);
				if (result == null)
					result = caseEModelElement(dependency);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DIRECTED_RELATIONSHIP : {
				DirectedRelationship directedRelationship = (DirectedRelationship) theEObject;
				Object result = caseDirectedRelationship(directedRelationship);
				if (result == null)
					result = caseRelationship(directedRelationship);
				if (result == null)
					result = caseElement(directedRelationship);
				if (result == null)
					result = caseEModelElement(directedRelationship);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.RELATIONSHIP : {
				Relationship relationship = (Relationship) theEObject;
				Object result = caseRelationship(relationship);
				if (result == null)
					result = caseElement(relationship);
				if (result == null)
					result = caseEModelElement(relationship);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.NAMESPACE : {
				Namespace namespace = (Namespace) theEObject;
				Object result = caseNamespace(namespace);
				if (result == null)
					result = caseNamedElement(namespace);
				if (result == null)
					result = caseElement(namespace);
				if (result == null)
					result = caseEModelElement(namespace);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ELEMENT_IMPORT : {
				ElementImport elementImport = (ElementImport) theEObject;
				Object result = caseElementImport(elementImport);
				if (result == null)
					result = caseDirectedRelationship(elementImport);
				if (result == null)
					result = caseRelationship(elementImport);
				if (result == null)
					result = caseElement(elementImport);
				if (result == null)
					result = caseEModelElement(elementImport);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PACKAGE_IMPORT : {
				PackageImport packageImport = (PackageImport) theEObject;
				Object result = casePackageImport(packageImport);
				if (result == null)
					result = caseDirectedRelationship(packageImport);
				if (result == null)
					result = caseRelationship(packageImport);
				if (result == null)
					result = caseElement(packageImport);
				if (result == null)
					result = caseEModelElement(packageImport);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONSTRAINT : {
				Constraint constraint = (Constraint) theEObject;
				Object result = caseConstraint(constraint);
				if (result == null)
					result = casePackageableElement(constraint);
				if (result == null)
					result = caseNamedElement(constraint);
				if (result == null)
					result = caseParameterableElement(constraint);
				if (result == null)
					result = caseElement(constraint);
				if (result == null)
					result = caseEModelElement(constraint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.VALUE_SPECIFICATION : {
				ValueSpecification valueSpecification = (ValueSpecification) theEObject;
				Object result = caseValueSpecification(valueSpecification);
				if (result == null)
					result = casePackageableElement(valueSpecification);
				if (result == null)
					result = caseTypedElement(valueSpecification);
				if (result == null)
					result = caseNamedElement(valueSpecification);
				if (result == null)
					result = caseParameterableElement(valueSpecification);
				if (result == null)
					result = caseElement(valueSpecification);
				if (result == null)
					result = caseEModelElement(valueSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TYPED_ELEMENT : {
				TypedElement typedElement = (TypedElement) theEObject;
				Object result = caseTypedElement(typedElement);
				if (result == null)
					result = caseNamedElement(typedElement);
				if (result == null)
					result = caseElement(typedElement);
				if (result == null)
					result = caseEModelElement(typedElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TYPE : {
				Type type = (Type) theEObject;
				Object result = caseType(type);
				if (result == null)
					result = casePackageableElement(type);
				if (result == null)
					result = caseNamedElement(type);
				if (result == null)
					result = caseParameterableElement(type);
				if (result == null)
					result = caseElement(type);
				if (result == null)
					result = caseEModelElement(type);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ASSOCIATION : {
				Association association = (Association) theEObject;
				Object result = caseAssociation(association);
				if (result == null)
					result = caseClassifier(association);
				if (result == null)
					result = caseRelationship(association);
				if (result == null)
					result = caseNamespace(association);
				if (result == null)
					result = caseRedefinableElement(association);
				if (result == null)
					result = caseType(association);
				if (result == null)
					result = caseTemplateableElement(association);
				if (result == null)
					result = caseElement(association);
				if (result == null)
					result = caseNamedElement(association);
				if (result == null)
					result = casePackageableElement(association);
				if (result == null)
					result = caseEModelElement(association);
				if (result == null)
					result = caseParameterableElement(association);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CLASSIFIER : {
				Classifier classifier = (Classifier) theEObject;
				Object result = caseClassifier(classifier);
				if (result == null)
					result = caseNamespace(classifier);
				if (result == null)
					result = caseRedefinableElement(classifier);
				if (result == null)
					result = caseType(classifier);
				if (result == null)
					result = caseTemplateableElement(classifier);
				if (result == null)
					result = caseNamedElement(classifier);
				if (result == null)
					result = casePackageableElement(classifier);
				if (result == null)
					result = caseElement(classifier);
				if (result == null)
					result = caseParameterableElement(classifier);
				if (result == null)
					result = caseEModelElement(classifier);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REDEFINABLE_ELEMENT : {
				RedefinableElement redefinableElement = (RedefinableElement) theEObject;
				Object result = caseRedefinableElement(redefinableElement);
				if (result == null)
					result = caseNamedElement(redefinableElement);
				if (result == null)
					result = caseElement(redefinableElement);
				if (result == null)
					result = caseEModelElement(redefinableElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TEMPLATEABLE_ELEMENT : {
				TemplateableElement templateableElement = (TemplateableElement) theEObject;
				Object result = caseTemplateableElement(templateableElement);
				if (result == null)
					result = caseElement(templateableElement);
				if (result == null)
					result = caseEModelElement(templateableElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TEMPLATE_BINDING : {
				TemplateBinding templateBinding = (TemplateBinding) theEObject;
				Object result = caseTemplateBinding(templateBinding);
				if (result == null)
					result = caseDirectedRelationship(templateBinding);
				if (result == null)
					result = caseRelationship(templateBinding);
				if (result == null)
					result = caseElement(templateBinding);
				if (result == null)
					result = caseEModelElement(templateBinding);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TEMPLATE_SIGNATURE : {
				TemplateSignature templateSignature = (TemplateSignature) theEObject;
				Object result = caseTemplateSignature(templateSignature);
				if (result == null)
					result = caseElement(templateSignature);
				if (result == null)
					result = caseEModelElement(templateSignature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TEMPLATE_PARAMETER : {
				TemplateParameter templateParameter = (TemplateParameter) theEObject;
				Object result = caseTemplateParameter(templateParameter);
				if (result == null)
					result = caseElement(templateParameter);
				if (result == null)
					result = caseEModelElement(templateParameter);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PARAMETERABLE_ELEMENT : {
				ParameterableElement parameterableElement = (ParameterableElement) theEObject;
				Object result = caseParameterableElement(parameterableElement);
				if (result == null)
					result = caseElement(parameterableElement);
				if (result == null)
					result = caseEModelElement(parameterableElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION : {
				TemplateParameterSubstitution templateParameterSubstitution = (TemplateParameterSubstitution) theEObject;
				Object result = caseTemplateParameterSubstitution(templateParameterSubstitution);
				if (result == null)
					result = caseElement(templateParameterSubstitution);
				if (result == null)
					result = caseEModelElement(templateParameterSubstitution);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.GENERALIZATION : {
				Generalization generalization = (Generalization) theEObject;
				Object result = caseGeneralization(generalization);
				if (result == null)
					result = caseDirectedRelationship(generalization);
				if (result == null)
					result = caseRelationship(generalization);
				if (result == null)
					result = caseElement(generalization);
				if (result == null)
					result = caseEModelElement(generalization);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.GENERALIZATION_SET : {
				GeneralizationSet generalizationSet = (GeneralizationSet) theEObject;
				Object result = caseGeneralizationSet(generalizationSet);
				if (result == null)
					result = casePackageableElement(generalizationSet);
				if (result == null)
					result = caseNamedElement(generalizationSet);
				if (result == null)
					result = caseParameterableElement(generalizationSet);
				if (result == null)
					result = caseElement(generalizationSet);
				if (result == null)
					result = caseEModelElement(generalizationSet);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.FEATURE : {
				Feature feature = (Feature) theEObject;
				Object result = caseFeature(feature);
				if (result == null)
					result = caseRedefinableElement(feature);
				if (result == null)
					result = caseNamedElement(feature);
				if (result == null)
					result = caseElement(feature);
				if (result == null)
					result = caseEModelElement(feature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SUBSTITUTION : {
				Substitution substitution = (Substitution) theEObject;
				Object result = caseSubstitution(substitution);
				if (result == null)
					result = caseRealization(substitution);
				if (result == null)
					result = caseAbstraction(substitution);
				if (result == null)
					result = caseDependency(substitution);
				if (result == null)
					result = casePackageableElement(substitution);
				if (result == null)
					result = caseDirectedRelationship(substitution);
				if (result == null)
					result = caseNamedElement(substitution);
				if (result == null)
					result = caseParameterableElement(substitution);
				if (result == null)
					result = caseRelationship(substitution);
				if (result == null)
					result = caseElement(substitution);
				if (result == null)
					result = caseEModelElement(substitution);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REALIZATION : {
				Realization realization = (Realization) theEObject;
				Object result = caseRealization(realization);
				if (result == null)
					result = caseAbstraction(realization);
				if (result == null)
					result = caseDependency(realization);
				if (result == null)
					result = casePackageableElement(realization);
				if (result == null)
					result = caseDirectedRelationship(realization);
				if (result == null)
					result = caseNamedElement(realization);
				if (result == null)
					result = caseParameterableElement(realization);
				if (result == null)
					result = caseRelationship(realization);
				if (result == null)
					result = caseElement(realization);
				if (result == null)
					result = caseEModelElement(realization);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ABSTRACTION : {
				Abstraction abstraction = (Abstraction) theEObject;
				Object result = caseAbstraction(abstraction);
				if (result == null)
					result = caseDependency(abstraction);
				if (result == null)
					result = casePackageableElement(abstraction);
				if (result == null)
					result = caseDirectedRelationship(abstraction);
				if (result == null)
					result = caseNamedElement(abstraction);
				if (result == null)
					result = caseParameterableElement(abstraction);
				if (result == null)
					result = caseRelationship(abstraction);
				if (result == null)
					result = caseElement(abstraction);
				if (result == null)
					result = caseEModelElement(abstraction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OPAQUE_EXPRESSION : {
				OpaqueExpression opaqueExpression = (OpaqueExpression) theEObject;
				Object result = caseOpaqueExpression(opaqueExpression);
				if (result == null)
					result = caseValueSpecification(opaqueExpression);
				if (result == null)
					result = casePackageableElement(opaqueExpression);
				if (result == null)
					result = caseTypedElement(opaqueExpression);
				if (result == null)
					result = caseNamedElement(opaqueExpression);
				if (result == null)
					result = caseParameterableElement(opaqueExpression);
				if (result == null)
					result = caseElement(opaqueExpression);
				if (result == null)
					result = caseEModelElement(opaqueExpression);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PARAMETER : {
				Parameter parameter = (Parameter) theEObject;
				Object result = caseParameter(parameter);
				if (result == null)
					result = caseConnectableElement(parameter);
				if (result == null)
					result = caseMultiplicityElement(parameter);
				if (result == null)
					result = caseTypedElement(parameter);
				if (result == null)
					result = caseParameterableElement(parameter);
				if (result == null)
					result = caseElement(parameter);
				if (result == null)
					result = caseNamedElement(parameter);
				if (result == null)
					result = caseEModelElement(parameter);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MULTIPLICITY_ELEMENT : {
				MultiplicityElement multiplicityElement = (MultiplicityElement) theEObject;
				Object result = caseMultiplicityElement(multiplicityElement);
				if (result == null)
					result = caseElement(multiplicityElement);
				if (result == null)
					result = caseEModelElement(multiplicityElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONNECTABLE_ELEMENT : {
				ConnectableElement connectableElement = (ConnectableElement) theEObject;
				Object result = caseConnectableElement(connectableElement);
				if (result == null)
					result = caseTypedElement(connectableElement);
				if (result == null)
					result = caseParameterableElement(connectableElement);
				if (result == null)
					result = caseNamedElement(connectableElement);
				if (result == null)
					result = caseElement(connectableElement);
				if (result == null)
					result = caseEModelElement(connectableElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONNECTOR_END : {
				ConnectorEnd connectorEnd = (ConnectorEnd) theEObject;
				Object result = caseConnectorEnd(connectorEnd);
				if (result == null)
					result = caseMultiplicityElement(connectorEnd);
				if (result == null)
					result = caseElement(connectorEnd);
				if (result == null)
					result = caseEModelElement(connectorEnd);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PROPERTY : {
				Property property = (Property) theEObject;
				Object result = caseProperty(property);
				if (result == null)
					result = caseStructuralFeature(property);
				if (result == null)
					result = caseConnectableElement(property);
				if (result == null)
					result = caseDeploymentTarget(property);
				if (result == null)
					result = caseTemplateableElement(property);
				if (result == null)
					result = caseFeature(property);
				if (result == null)
					result = caseTypedElement(property);
				if (result == null)
					result = caseMultiplicityElement(property);
				if (result == null)
					result = caseParameterableElement(property);
				if (result == null)
					result = caseNamedElement(property);
				if (result == null)
					result = caseElement(property);
				if (result == null)
					result = caseRedefinableElement(property);
				if (result == null)
					result = caseEModelElement(property);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DEPLOYMENT_TARGET : {
				DeploymentTarget deploymentTarget = (DeploymentTarget) theEObject;
				Object result = caseDeploymentTarget(deploymentTarget);
				if (result == null)
					result = caseNamedElement(deploymentTarget);
				if (result == null)
					result = caseElement(deploymentTarget);
				if (result == null)
					result = caseEModelElement(deploymentTarget);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DEPLOYMENT : {
				Deployment deployment = (Deployment) theEObject;
				Object result = caseDeployment(deployment);
				if (result == null)
					result = caseDependency(deployment);
				if (result == null)
					result = casePackageableElement(deployment);
				if (result == null)
					result = caseDirectedRelationship(deployment);
				if (result == null)
					result = caseNamedElement(deployment);
				if (result == null)
					result = caseParameterableElement(deployment);
				if (result == null)
					result = caseRelationship(deployment);
				if (result == null)
					result = caseElement(deployment);
				if (result == null)
					result = caseEModelElement(deployment);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DEPLOYED_ARTIFACT : {
				DeployedArtifact deployedArtifact = (DeployedArtifact) theEObject;
				Object result = caseDeployedArtifact(deployedArtifact);
				if (result == null)
					result = caseNamedElement(deployedArtifact);
				if (result == null)
					result = caseElement(deployedArtifact);
				if (result == null)
					result = caseEModelElement(deployedArtifact);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DEPLOYMENT_SPECIFICATION : {
				DeploymentSpecification deploymentSpecification = (DeploymentSpecification) theEObject;
				Object result = caseDeploymentSpecification(deploymentSpecification);
				if (result == null)
					result = caseArtifact(deploymentSpecification);
				if (result == null)
					result = caseClassifier(deploymentSpecification);
				if (result == null)
					result = caseDeployedArtifact(deploymentSpecification);
				if (result == null)
					result = caseNamespace(deploymentSpecification);
				if (result == null)
					result = caseRedefinableElement(deploymentSpecification);
				if (result == null)
					result = caseType(deploymentSpecification);
				if (result == null)
					result = caseTemplateableElement(deploymentSpecification);
				if (result == null)
					result = caseNamedElement(deploymentSpecification);
				if (result == null)
					result = casePackageableElement(deploymentSpecification);
				if (result == null)
					result = caseElement(deploymentSpecification);
				if (result == null)
					result = caseParameterableElement(deploymentSpecification);
				if (result == null)
					result = caseEModelElement(deploymentSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ARTIFACT : {
				Artifact artifact = (Artifact) theEObject;
				Object result = caseArtifact(artifact);
				if (result == null)
					result = caseClassifier(artifact);
				if (result == null)
					result = caseDeployedArtifact(artifact);
				if (result == null)
					result = caseNamespace(artifact);
				if (result == null)
					result = caseRedefinableElement(artifact);
				if (result == null)
					result = caseType(artifact);
				if (result == null)
					result = caseTemplateableElement(artifact);
				if (result == null)
					result = caseNamedElement(artifact);
				if (result == null)
					result = casePackageableElement(artifact);
				if (result == null)
					result = caseElement(artifact);
				if (result == null)
					result = caseParameterableElement(artifact);
				if (result == null)
					result = caseEModelElement(artifact);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MANIFESTATION : {
				Manifestation manifestation = (Manifestation) theEObject;
				Object result = caseManifestation(manifestation);
				if (result == null)
					result = caseAbstraction(manifestation);
				if (result == null)
					result = caseDependency(manifestation);
				if (result == null)
					result = casePackageableElement(manifestation);
				if (result == null)
					result = caseDirectedRelationship(manifestation);
				if (result == null)
					result = caseNamedElement(manifestation);
				if (result == null)
					result = caseParameterableElement(manifestation);
				if (result == null)
					result = caseRelationship(manifestation);
				if (result == null)
					result = caseElement(manifestation);
				if (result == null)
					result = caseEModelElement(manifestation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OPERATION : {
				Operation operation = (Operation) theEObject;
				Object result = caseOperation(operation);
				if (result == null)
					result = caseBehavioralFeature(operation);
				if (result == null)
					result = caseParameterableElement(operation);
				if (result == null)
					result = caseTemplateableElement(operation);
				if (result == null)
					result = caseNamespace(operation);
				if (result == null)
					result = caseFeature(operation);
				if (result == null)
					result = caseElement(operation);
				if (result == null)
					result = caseNamedElement(operation);
				if (result == null)
					result = caseRedefinableElement(operation);
				if (result == null)
					result = caseEModelElement(operation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.BEHAVIORAL_FEATURE : {
				BehavioralFeature behavioralFeature = (BehavioralFeature) theEObject;
				Object result = caseBehavioralFeature(behavioralFeature);
				if (result == null)
					result = caseNamespace(behavioralFeature);
				if (result == null)
					result = caseFeature(behavioralFeature);
				if (result == null)
					result = caseNamedElement(behavioralFeature);
				if (result == null)
					result = caseRedefinableElement(behavioralFeature);
				if (result == null)
					result = caseElement(behavioralFeature);
				if (result == null)
					result = caseEModelElement(behavioralFeature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.BEHAVIOR : {
				Behavior behavior = (Behavior) theEObject;
				Object result = caseBehavior(behavior);
				if (result == null)
					result = caseClass(behavior);
				if (result == null)
					result = caseEncapsulatedClassifier(behavior);
				if (result == null)
					result = caseBehavioredClassifier(behavior);
				if (result == null)
					result = caseStructuredClassifier(behavior);
				if (result == null)
					result = caseClassifier(behavior);
				if (result == null)
					result = caseNamespace(behavior);
				if (result == null)
					result = caseRedefinableElement(behavior);
				if (result == null)
					result = caseType(behavior);
				if (result == null)
					result = caseTemplateableElement(behavior);
				if (result == null)
					result = caseNamedElement(behavior);
				if (result == null)
					result = casePackageableElement(behavior);
				if (result == null)
					result = caseElement(behavior);
				if (result == null)
					result = caseParameterableElement(behavior);
				if (result == null)
					result = caseEModelElement(behavior);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CLASS : {
				org.eclipse.uml2.uml.Class class_ = (org.eclipse.uml2.uml.Class) theEObject;
				Object result = caseClass(class_);
				if (result == null)
					result = caseEncapsulatedClassifier(class_);
				if (result == null)
					result = caseBehavioredClassifier(class_);
				if (result == null)
					result = caseStructuredClassifier(class_);
				if (result == null)
					result = caseClassifier(class_);
				if (result == null)
					result = caseNamespace(class_);
				if (result == null)
					result = caseRedefinableElement(class_);
				if (result == null)
					result = caseType(class_);
				if (result == null)
					result = caseTemplateableElement(class_);
				if (result == null)
					result = caseNamedElement(class_);
				if (result == null)
					result = casePackageableElement(class_);
				if (result == null)
					result = caseElement(class_);
				if (result == null)
					result = caseParameterableElement(class_);
				if (result == null)
					result = caseEModelElement(class_);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.BEHAVIORED_CLASSIFIER : {
				BehavioredClassifier behavioredClassifier = (BehavioredClassifier) theEObject;
				Object result = caseBehavioredClassifier(behavioredClassifier);
				if (result == null)
					result = caseClassifier(behavioredClassifier);
				if (result == null)
					result = caseNamespace(behavioredClassifier);
				if (result == null)
					result = caseRedefinableElement(behavioredClassifier);
				if (result == null)
					result = caseType(behavioredClassifier);
				if (result == null)
					result = caseTemplateableElement(behavioredClassifier);
				if (result == null)
					result = caseNamedElement(behavioredClassifier);
				if (result == null)
					result = casePackageableElement(behavioredClassifier);
				if (result == null)
					result = caseElement(behavioredClassifier);
				if (result == null)
					result = caseParameterableElement(behavioredClassifier);
				if (result == null)
					result = caseEModelElement(behavioredClassifier);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERFACE_REALIZATION : {
				InterfaceRealization interfaceRealization = (InterfaceRealization) theEObject;
				Object result = caseInterfaceRealization(interfaceRealization);
				if (result == null)
					result = caseRealization(interfaceRealization);
				if (result == null)
					result = caseAbstraction(interfaceRealization);
				if (result == null)
					result = caseDependency(interfaceRealization);
				if (result == null)
					result = casePackageableElement(interfaceRealization);
				if (result == null)
					result = caseDirectedRelationship(interfaceRealization);
				if (result == null)
					result = caseNamedElement(interfaceRealization);
				if (result == null)
					result = caseParameterableElement(interfaceRealization);
				if (result == null)
					result = caseRelationship(interfaceRealization);
				if (result == null)
					result = caseElement(interfaceRealization);
				if (result == null)
					result = caseEModelElement(interfaceRealization);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERFACE : {
				Interface interface_ = (Interface) theEObject;
				Object result = caseInterface(interface_);
				if (result == null)
					result = caseClassifier(interface_);
				if (result == null)
					result = caseNamespace(interface_);
				if (result == null)
					result = caseRedefinableElement(interface_);
				if (result == null)
					result = caseType(interface_);
				if (result == null)
					result = caseTemplateableElement(interface_);
				if (result == null)
					result = caseNamedElement(interface_);
				if (result == null)
					result = casePackageableElement(interface_);
				if (result == null)
					result = caseElement(interface_);
				if (result == null)
					result = caseParameterableElement(interface_);
				if (result == null)
					result = caseEModelElement(interface_);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.RECEPTION : {
				Reception reception = (Reception) theEObject;
				Object result = caseReception(reception);
				if (result == null)
					result = caseBehavioralFeature(reception);
				if (result == null)
					result = caseNamespace(reception);
				if (result == null)
					result = caseFeature(reception);
				if (result == null)
					result = caseNamedElement(reception);
				if (result == null)
					result = caseRedefinableElement(reception);
				if (result == null)
					result = caseElement(reception);
				if (result == null)
					result = caseEModelElement(reception);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SIGNAL : {
				Signal signal = (Signal) theEObject;
				Object result = caseSignal(signal);
				if (result == null)
					result = caseClassifier(signal);
				if (result == null)
					result = caseNamespace(signal);
				if (result == null)
					result = caseRedefinableElement(signal);
				if (result == null)
					result = caseType(signal);
				if (result == null)
					result = caseTemplateableElement(signal);
				if (result == null)
					result = caseNamedElement(signal);
				if (result == null)
					result = casePackageableElement(signal);
				if (result == null)
					result = caseElement(signal);
				if (result == null)
					result = caseParameterableElement(signal);
				if (result == null)
					result = caseEModelElement(signal);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PROTOCOL_STATE_MACHINE : {
				ProtocolStateMachine protocolStateMachine = (ProtocolStateMachine) theEObject;
				Object result = caseProtocolStateMachine(protocolStateMachine);
				if (result == null)
					result = caseStateMachine(protocolStateMachine);
				if (result == null)
					result = caseBehavior(protocolStateMachine);
				if (result == null)
					result = caseClass(protocolStateMachine);
				if (result == null)
					result = caseEncapsulatedClassifier(protocolStateMachine);
				if (result == null)
					result = caseBehavioredClassifier(protocolStateMachine);
				if (result == null)
					result = caseStructuredClassifier(protocolStateMachine);
				if (result == null)
					result = caseClassifier(protocolStateMachine);
				if (result == null)
					result = caseNamespace(protocolStateMachine);
				if (result == null)
					result = caseRedefinableElement(protocolStateMachine);
				if (result == null)
					result = caseType(protocolStateMachine);
				if (result == null)
					result = caseTemplateableElement(protocolStateMachine);
				if (result == null)
					result = caseNamedElement(protocolStateMachine);
				if (result == null)
					result = casePackageableElement(protocolStateMachine);
				if (result == null)
					result = caseElement(protocolStateMachine);
				if (result == null)
					result = caseParameterableElement(protocolStateMachine);
				if (result == null)
					result = caseEModelElement(protocolStateMachine);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STATE_MACHINE : {
				StateMachine stateMachine = (StateMachine) theEObject;
				Object result = caseStateMachine(stateMachine);
				if (result == null)
					result = caseBehavior(stateMachine);
				if (result == null)
					result = caseClass(stateMachine);
				if (result == null)
					result = caseEncapsulatedClassifier(stateMachine);
				if (result == null)
					result = caseBehavioredClassifier(stateMachine);
				if (result == null)
					result = caseStructuredClassifier(stateMachine);
				if (result == null)
					result = caseClassifier(stateMachine);
				if (result == null)
					result = caseNamespace(stateMachine);
				if (result == null)
					result = caseRedefinableElement(stateMachine);
				if (result == null)
					result = caseType(stateMachine);
				if (result == null)
					result = caseTemplateableElement(stateMachine);
				if (result == null)
					result = caseNamedElement(stateMachine);
				if (result == null)
					result = casePackageableElement(stateMachine);
				if (result == null)
					result = caseElement(stateMachine);
				if (result == null)
					result = caseParameterableElement(stateMachine);
				if (result == null)
					result = caseEModelElement(stateMachine);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REGION : {
				Region region = (Region) theEObject;
				Object result = caseRegion(region);
				if (result == null)
					result = caseNamespace(region);
				if (result == null)
					result = caseRedefinableElement(region);
				if (result == null)
					result = caseNamedElement(region);
				if (result == null)
					result = caseElement(region);
				if (result == null)
					result = caseEModelElement(region);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.VERTEX : {
				Vertex vertex = (Vertex) theEObject;
				Object result = caseVertex(vertex);
				if (result == null)
					result = caseNamedElement(vertex);
				if (result == null)
					result = caseElement(vertex);
				if (result == null)
					result = caseEModelElement(vertex);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TRANSITION : {
				Transition transition = (Transition) theEObject;
				Object result = caseTransition(transition);
				if (result == null)
					result = caseNamespace(transition);
				if (result == null)
					result = caseRedefinableElement(transition);
				if (result == null)
					result = caseNamedElement(transition);
				if (result == null)
					result = caseElement(transition);
				if (result == null)
					result = caseEModelElement(transition);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TRIGGER : {
				Trigger trigger = (Trigger) theEObject;
				Object result = caseTrigger(trigger);
				if (result == null)
					result = caseNamedElement(trigger);
				if (result == null)
					result = caseElement(trigger);
				if (result == null)
					result = caseEModelElement(trigger);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EVENT : {
				Event event = (Event) theEObject;
				Object result = caseEvent(event);
				if (result == null)
					result = casePackageableElement(event);
				if (result == null)
					result = caseNamedElement(event);
				if (result == null)
					result = caseParameterableElement(event);
				if (result == null)
					result = caseElement(event);
				if (result == null)
					result = caseEModelElement(event);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PORT : {
				Port port = (Port) theEObject;
				Object result = casePort(port);
				if (result == null)
					result = caseProperty(port);
				if (result == null)
					result = caseStructuralFeature(port);
				if (result == null)
					result = caseConnectableElement(port);
				if (result == null)
					result = caseDeploymentTarget(port);
				if (result == null)
					result = caseTemplateableElement(port);
				if (result == null)
					result = caseFeature(port);
				if (result == null)
					result = caseTypedElement(port);
				if (result == null)
					result = caseMultiplicityElement(port);
				if (result == null)
					result = caseParameterableElement(port);
				if (result == null)
					result = caseNamedElement(port);
				if (result == null)
					result = caseElement(port);
				if (result == null)
					result = caseRedefinableElement(port);
				if (result == null)
					result = caseEModelElement(port);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STATE : {
				State state = (State) theEObject;
				Object result = caseState(state);
				if (result == null)
					result = caseNamespace(state);
				if (result == null)
					result = caseRedefinableElement(state);
				if (result == null)
					result = caseVertex(state);
				if (result == null)
					result = caseNamedElement(state);
				if (result == null)
					result = caseElement(state);
				if (result == null)
					result = caseEModelElement(state);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONNECTION_POINT_REFERENCE : {
				ConnectionPointReference connectionPointReference = (ConnectionPointReference) theEObject;
				Object result = caseConnectionPointReference(connectionPointReference);
				if (result == null)
					result = caseVertex(connectionPointReference);
				if (result == null)
					result = caseNamedElement(connectionPointReference);
				if (result == null)
					result = caseElement(connectionPointReference);
				if (result == null)
					result = caseEModelElement(connectionPointReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PSEUDOSTATE : {
				Pseudostate pseudostate = (Pseudostate) theEObject;
				Object result = casePseudostate(pseudostate);
				if (result == null)
					result = caseVertex(pseudostate);
				if (result == null)
					result = caseNamedElement(pseudostate);
				if (result == null)
					result = caseElement(pseudostate);
				if (result == null)
					result = caseEModelElement(pseudostate);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PROTOCOL_CONFORMANCE : {
				ProtocolConformance protocolConformance = (ProtocolConformance) theEObject;
				Object result = caseProtocolConformance(protocolConformance);
				if (result == null)
					result = caseDirectedRelationship(protocolConformance);
				if (result == null)
					result = caseRelationship(protocolConformance);
				if (result == null)
					result = caseElement(protocolConformance);
				if (result == null)
					result = caseEModelElement(protocolConformance);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ENCAPSULATED_CLASSIFIER : {
				EncapsulatedClassifier encapsulatedClassifier = (EncapsulatedClassifier) theEObject;
				Object result = caseEncapsulatedClassifier(encapsulatedClassifier);
				if (result == null)
					result = caseStructuredClassifier(encapsulatedClassifier);
				if (result == null)
					result = caseClassifier(encapsulatedClassifier);
				if (result == null)
					result = caseNamespace(encapsulatedClassifier);
				if (result == null)
					result = caseRedefinableElement(encapsulatedClassifier);
				if (result == null)
					result = caseType(encapsulatedClassifier);
				if (result == null)
					result = caseTemplateableElement(encapsulatedClassifier);
				if (result == null)
					result = caseNamedElement(encapsulatedClassifier);
				if (result == null)
					result = casePackageableElement(encapsulatedClassifier);
				if (result == null)
					result = caseElement(encapsulatedClassifier);
				if (result == null)
					result = caseParameterableElement(encapsulatedClassifier);
				if (result == null)
					result = caseEModelElement(encapsulatedClassifier);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STRUCTURED_CLASSIFIER : {
				StructuredClassifier structuredClassifier = (StructuredClassifier) theEObject;
				Object result = caseStructuredClassifier(structuredClassifier);
				if (result == null)
					result = caseClassifier(structuredClassifier);
				if (result == null)
					result = caseNamespace(structuredClassifier);
				if (result == null)
					result = caseRedefinableElement(structuredClassifier);
				if (result == null)
					result = caseType(structuredClassifier);
				if (result == null)
					result = caseTemplateableElement(structuredClassifier);
				if (result == null)
					result = caseNamedElement(structuredClassifier);
				if (result == null)
					result = casePackageableElement(structuredClassifier);
				if (result == null)
					result = caseElement(structuredClassifier);
				if (result == null)
					result = caseParameterableElement(structuredClassifier);
				if (result == null)
					result = caseEModelElement(structuredClassifier);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONNECTOR : {
				Connector connector = (Connector) theEObject;
				Object result = caseConnector(connector);
				if (result == null)
					result = caseFeature(connector);
				if (result == null)
					result = caseRedefinableElement(connector);
				if (result == null)
					result = caseNamedElement(connector);
				if (result == null)
					result = caseElement(connector);
				if (result == null)
					result = caseEModelElement(connector);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXTENSION : {
				Extension extension = (Extension) theEObject;
				Object result = caseExtension(extension);
				if (result == null)
					result = caseAssociation(extension);
				if (result == null)
					result = caseClassifier(extension);
				if (result == null)
					result = caseRelationship(extension);
				if (result == null)
					result = caseNamespace(extension);
				if (result == null)
					result = caseRedefinableElement(extension);
				if (result == null)
					result = caseType(extension);
				if (result == null)
					result = caseTemplateableElement(extension);
				if (result == null)
					result = caseElement(extension);
				if (result == null)
					result = caseNamedElement(extension);
				if (result == null)
					result = casePackageableElement(extension);
				if (result == null)
					result = caseEModelElement(extension);
				if (result == null)
					result = caseParameterableElement(extension);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXTENSION_END : {
				ExtensionEnd extensionEnd = (ExtensionEnd) theEObject;
				Object result = caseExtensionEnd(extensionEnd);
				if (result == null)
					result = caseProperty(extensionEnd);
				if (result == null)
					result = caseStructuralFeature(extensionEnd);
				if (result == null)
					result = caseConnectableElement(extensionEnd);
				if (result == null)
					result = caseDeploymentTarget(extensionEnd);
				if (result == null)
					result = caseTemplateableElement(extensionEnd);
				if (result == null)
					result = caseFeature(extensionEnd);
				if (result == null)
					result = caseTypedElement(extensionEnd);
				if (result == null)
					result = caseMultiplicityElement(extensionEnd);
				if (result == null)
					result = caseParameterableElement(extensionEnd);
				if (result == null)
					result = caseNamedElement(extensionEnd);
				if (result == null)
					result = caseElement(extensionEnd);
				if (result == null)
					result = caseRedefinableElement(extensionEnd);
				if (result == null)
					result = caseEModelElement(extensionEnd);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STEREOTYPE : {
				Stereotype stereotype = (Stereotype) theEObject;
				Object result = caseStereotype(stereotype);
				if (result == null)
					result = caseClass(stereotype);
				if (result == null)
					result = caseEncapsulatedClassifier(stereotype);
				if (result == null)
					result = caseBehavioredClassifier(stereotype);
				if (result == null)
					result = caseStructuredClassifier(stereotype);
				if (result == null)
					result = caseClassifier(stereotype);
				if (result == null)
					result = caseNamespace(stereotype);
				if (result == null)
					result = caseRedefinableElement(stereotype);
				if (result == null)
					result = caseType(stereotype);
				if (result == null)
					result = caseTemplateableElement(stereotype);
				if (result == null)
					result = caseNamedElement(stereotype);
				if (result == null)
					result = casePackageableElement(stereotype);
				if (result == null)
					result = caseElement(stereotype);
				if (result == null)
					result = caseParameterableElement(stereotype);
				if (result == null)
					result = caseEModelElement(stereotype);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.IMAGE : {
				Image image = (Image) theEObject;
				Object result = caseImage(image);
				if (result == null)
					result = caseElement(image);
				if (result == null)
					result = caseEModelElement(image);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PROFILE : {
				Profile profile = (Profile) theEObject;
				Object result = caseProfile(profile);
				if (result == null)
					result = casePackage(profile);
				if (result == null)
					result = caseNamespace(profile);
				if (result == null)
					result = casePackageableElement(profile);
				if (result == null)
					result = caseTemplateableElement(profile);
				if (result == null)
					result = caseNamedElement(profile);
				if (result == null)
					result = caseParameterableElement(profile);
				if (result == null)
					result = caseElement(profile);
				if (result == null)
					result = caseEModelElement(profile);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MODEL : {
				Model model = (Model) theEObject;
				Object result = caseModel(model);
				if (result == null)
					result = casePackage(model);
				if (result == null)
					result = caseNamespace(model);
				if (result == null)
					result = casePackageableElement(model);
				if (result == null)
					result = caseTemplateableElement(model);
				if (result == null)
					result = caseNamedElement(model);
				if (result == null)
					result = caseParameterableElement(model);
				if (result == null)
					result = caseElement(model);
				if (result == null)
					result = caseEModelElement(model);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PARAMETER_SET : {
				ParameterSet parameterSet = (ParameterSet) theEObject;
				Object result = caseParameterSet(parameterSet);
				if (result == null)
					result = caseNamedElement(parameterSet);
				if (result == null)
					result = caseElement(parameterSet);
				if (result == null)
					result = caseEModelElement(parameterSet);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DATA_TYPE : {
				DataType dataType = (DataType) theEObject;
				Object result = caseDataType(dataType);
				if (result == null)
					result = caseClassifier(dataType);
				if (result == null)
					result = caseNamespace(dataType);
				if (result == null)
					result = caseRedefinableElement(dataType);
				if (result == null)
					result = caseType(dataType);
				if (result == null)
					result = caseTemplateableElement(dataType);
				if (result == null)
					result = caseNamedElement(dataType);
				if (result == null)
					result = casePackageableElement(dataType);
				if (result == null)
					result = caseElement(dataType);
				if (result == null)
					result = caseParameterableElement(dataType);
				if (result == null)
					result = caseEModelElement(dataType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OPERATION_TEMPLATE_PARAMETER : {
				OperationTemplateParameter operationTemplateParameter = (OperationTemplateParameter) theEObject;
				Object result = caseOperationTemplateParameter(operationTemplateParameter);
				if (result == null)
					result = caseTemplateParameter(operationTemplateParameter);
				if (result == null)
					result = caseElement(operationTemplateParameter);
				if (result == null)
					result = caseEModelElement(operationTemplateParameter);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STRUCTURAL_FEATURE : {
				StructuralFeature structuralFeature = (StructuralFeature) theEObject;
				Object result = caseStructuralFeature(structuralFeature);
				if (result == null)
					result = caseFeature(structuralFeature);
				if (result == null)
					result = caseTypedElement(structuralFeature);
				if (result == null)
					result = caseMultiplicityElement(structuralFeature);
				if (result == null)
					result = caseRedefinableElement(structuralFeature);
				if (result == null)
					result = caseNamedElement(structuralFeature);
				if (result == null)
					result = caseElement(structuralFeature);
				if (result == null)
					result = caseEModelElement(structuralFeature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER : {
				ConnectableElementTemplateParameter connectableElementTemplateParameter = (ConnectableElementTemplateParameter) theEObject;
				Object result = caseConnectableElementTemplateParameter(connectableElementTemplateParameter);
				if (result == null)
					result = caseTemplateParameter(connectableElementTemplateParameter);
				if (result == null)
					result = caseElement(connectableElementTemplateParameter);
				if (result == null)
					result = caseEModelElement(connectableElementTemplateParameter);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.COLLABORATION_USE : {
				CollaborationUse collaborationUse = (CollaborationUse) theEObject;
				Object result = caseCollaborationUse(collaborationUse);
				if (result == null)
					result = caseNamedElement(collaborationUse);
				if (result == null)
					result = caseElement(collaborationUse);
				if (result == null)
					result = caseEModelElement(collaborationUse);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.COLLABORATION : {
				Collaboration collaboration = (Collaboration) theEObject;
				Object result = caseCollaboration(collaboration);
				if (result == null)
					result = caseBehavioredClassifier(collaboration);
				if (result == null)
					result = caseStructuredClassifier(collaboration);
				if (result == null)
					result = caseClassifier(collaboration);
				if (result == null)
					result = caseNamespace(collaboration);
				if (result == null)
					result = caseRedefinableElement(collaboration);
				if (result == null)
					result = caseType(collaboration);
				if (result == null)
					result = caseTemplateableElement(collaboration);
				if (result == null)
					result = caseNamedElement(collaboration);
				if (result == null)
					result = casePackageableElement(collaboration);
				if (result == null)
					result = caseElement(collaboration);
				if (result == null)
					result = caseParameterableElement(collaboration);
				if (result == null)
					result = caseEModelElement(collaboration);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.USE_CASE : {
				UseCase useCase = (UseCase) theEObject;
				Object result = caseUseCase(useCase);
				if (result == null)
					result = caseBehavioredClassifier(useCase);
				if (result == null)
					result = caseClassifier(useCase);
				if (result == null)
					result = caseNamespace(useCase);
				if (result == null)
					result = caseRedefinableElement(useCase);
				if (result == null)
					result = caseType(useCase);
				if (result == null)
					result = caseTemplateableElement(useCase);
				if (result == null)
					result = caseNamedElement(useCase);
				if (result == null)
					result = casePackageableElement(useCase);
				if (result == null)
					result = caseElement(useCase);
				if (result == null)
					result = caseParameterableElement(useCase);
				if (result == null)
					result = caseEModelElement(useCase);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INCLUDE : {
				Include include = (Include) theEObject;
				Object result = caseInclude(include);
				if (result == null)
					result = caseNamedElement(include);
				if (result == null)
					result = caseDirectedRelationship(include);
				if (result == null)
					result = caseElement(include);
				if (result == null)
					result = caseRelationship(include);
				if (result == null)
					result = caseEModelElement(include);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXTEND : {
				Extend extend = (Extend) theEObject;
				Object result = caseExtend(extend);
				if (result == null)
					result = caseNamedElement(extend);
				if (result == null)
					result = caseDirectedRelationship(extend);
				if (result == null)
					result = caseElement(extend);
				if (result == null)
					result = caseRelationship(extend);
				if (result == null)
					result = caseEModelElement(extend);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXTENSION_POINT : {
				ExtensionPoint extensionPoint = (ExtensionPoint) theEObject;
				Object result = caseExtensionPoint(extensionPoint);
				if (result == null)
					result = caseRedefinableElement(extensionPoint);
				if (result == null)
					result = caseNamedElement(extensionPoint);
				if (result == null)
					result = caseElement(extensionPoint);
				if (result == null)
					result = caseEModelElement(extensionPoint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE : {
				RedefinableTemplateSignature redefinableTemplateSignature = (RedefinableTemplateSignature) theEObject;
				Object result = caseRedefinableTemplateSignature(redefinableTemplateSignature);
				if (result == null)
					result = caseRedefinableElement(redefinableTemplateSignature);
				if (result == null)
					result = caseTemplateSignature(redefinableTemplateSignature);
				if (result == null)
					result = caseNamedElement(redefinableTemplateSignature);
				if (result == null)
					result = caseElement(redefinableTemplateSignature);
				if (result == null)
					result = caseEModelElement(redefinableTemplateSignature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CLASSIFIER_TEMPLATE_PARAMETER : {
				ClassifierTemplateParameter classifierTemplateParameter = (ClassifierTemplateParameter) theEObject;
				Object result = caseClassifierTemplateParameter(classifierTemplateParameter);
				if (result == null)
					result = caseTemplateParameter(classifierTemplateParameter);
				if (result == null)
					result = caseElement(classifierTemplateParameter);
				if (result == null)
					result = caseEModelElement(classifierTemplateParameter);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STRING_EXPRESSION : {
				StringExpression stringExpression = (StringExpression) theEObject;
				Object result = caseStringExpression(stringExpression);
				if (result == null)
					result = caseExpression(stringExpression);
				if (result == null)
					result = caseTemplateableElement(stringExpression);
				if (result == null)
					result = caseValueSpecification(stringExpression);
				if (result == null)
					result = caseElement(stringExpression);
				if (result == null)
					result = casePackageableElement(stringExpression);
				if (result == null)
					result = caseTypedElement(stringExpression);
				if (result == null)
					result = caseEModelElement(stringExpression);
				if (result == null)
					result = caseNamedElement(stringExpression);
				if (result == null)
					result = caseParameterableElement(stringExpression);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXPRESSION : {
				Expression expression = (Expression) theEObject;
				Object result = caseExpression(expression);
				if (result == null)
					result = caseValueSpecification(expression);
				if (result == null)
					result = casePackageableElement(expression);
				if (result == null)
					result = caseTypedElement(expression);
				if (result == null)
					result = caseNamedElement(expression);
				if (result == null)
					result = caseParameterableElement(expression);
				if (result == null)
					result = caseElement(expression);
				if (result == null)
					result = caseEModelElement(expression);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PACKAGE_MERGE : {
				PackageMerge packageMerge = (PackageMerge) theEObject;
				Object result = casePackageMerge(packageMerge);
				if (result == null)
					result = caseDirectedRelationship(packageMerge);
				if (result == null)
					result = caseRelationship(packageMerge);
				if (result == null)
					result = caseElement(packageMerge);
				if (result == null)
					result = caseEModelElement(packageMerge);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PROFILE_APPLICATION : {
				ProfileApplication profileApplication = (ProfileApplication) theEObject;
				Object result = caseProfileApplication(profileApplication);
				if (result == null)
					result = caseDirectedRelationship(profileApplication);
				if (result == null)
					result = caseRelationship(profileApplication);
				if (result == null)
					result = caseElement(profileApplication);
				if (result == null)
					result = caseEModelElement(profileApplication);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ENUMERATION : {
				Enumeration enumeration = (Enumeration) theEObject;
				Object result = caseEnumeration(enumeration);
				if (result == null)
					result = caseDataType(enumeration);
				if (result == null)
					result = caseClassifier(enumeration);
				if (result == null)
					result = caseNamespace(enumeration);
				if (result == null)
					result = caseRedefinableElement(enumeration);
				if (result == null)
					result = caseType(enumeration);
				if (result == null)
					result = caseTemplateableElement(enumeration);
				if (result == null)
					result = caseNamedElement(enumeration);
				if (result == null)
					result = casePackageableElement(enumeration);
				if (result == null)
					result = caseElement(enumeration);
				if (result == null)
					result = caseParameterableElement(enumeration);
				if (result == null)
					result = caseEModelElement(enumeration);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ENUMERATION_LITERAL : {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral) theEObject;
				Object result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null)
					result = caseInstanceSpecification(enumerationLiteral);
				if (result == null)
					result = caseDeploymentTarget(enumerationLiteral);
				if (result == null)
					result = casePackageableElement(enumerationLiteral);
				if (result == null)
					result = caseDeployedArtifact(enumerationLiteral);
				if (result == null)
					result = caseNamedElement(enumerationLiteral);
				if (result == null)
					result = caseParameterableElement(enumerationLiteral);
				if (result == null)
					result = caseElement(enumerationLiteral);
				if (result == null)
					result = caseEModelElement(enumerationLiteral);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INSTANCE_SPECIFICATION : {
				InstanceSpecification instanceSpecification = (InstanceSpecification) theEObject;
				Object result = caseInstanceSpecification(instanceSpecification);
				if (result == null)
					result = caseDeploymentTarget(instanceSpecification);
				if (result == null)
					result = casePackageableElement(instanceSpecification);
				if (result == null)
					result = caseDeployedArtifact(instanceSpecification);
				if (result == null)
					result = caseNamedElement(instanceSpecification);
				if (result == null)
					result = caseParameterableElement(instanceSpecification);
				if (result == null)
					result = caseElement(instanceSpecification);
				if (result == null)
					result = caseEModelElement(instanceSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SLOT : {
				Slot slot = (Slot) theEObject;
				Object result = caseSlot(slot);
				if (result == null)
					result = caseElement(slot);
				if (result == null)
					result = caseEModelElement(slot);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PRIMITIVE_TYPE : {
				PrimitiveType primitiveType = (PrimitiveType) theEObject;
				Object result = casePrimitiveType(primitiveType);
				if (result == null)
					result = caseDataType(primitiveType);
				if (result == null)
					result = caseClassifier(primitiveType);
				if (result == null)
					result = caseNamespace(primitiveType);
				if (result == null)
					result = caseRedefinableElement(primitiveType);
				if (result == null)
					result = caseType(primitiveType);
				if (result == null)
					result = caseTemplateableElement(primitiveType);
				if (result == null)
					result = caseNamedElement(primitiveType);
				if (result == null)
					result = casePackageableElement(primitiveType);
				if (result == null)
					result = caseElement(primitiveType);
				if (result == null)
					result = caseParameterableElement(primitiveType);
				if (result == null)
					result = caseEModelElement(primitiveType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LITERAL_SPECIFICATION : {
				LiteralSpecification literalSpecification = (LiteralSpecification) theEObject;
				Object result = caseLiteralSpecification(literalSpecification);
				if (result == null)
					result = caseValueSpecification(literalSpecification);
				if (result == null)
					result = casePackageableElement(literalSpecification);
				if (result == null)
					result = caseTypedElement(literalSpecification);
				if (result == null)
					result = caseNamedElement(literalSpecification);
				if (result == null)
					result = caseParameterableElement(literalSpecification);
				if (result == null)
					result = caseElement(literalSpecification);
				if (result == null)
					result = caseEModelElement(literalSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LITERAL_INTEGER : {
				LiteralInteger literalInteger = (LiteralInteger) theEObject;
				Object result = caseLiteralInteger(literalInteger);
				if (result == null)
					result = caseLiteralSpecification(literalInteger);
				if (result == null)
					result = caseValueSpecification(literalInteger);
				if (result == null)
					result = casePackageableElement(literalInteger);
				if (result == null)
					result = caseTypedElement(literalInteger);
				if (result == null)
					result = caseNamedElement(literalInteger);
				if (result == null)
					result = caseParameterableElement(literalInteger);
				if (result == null)
					result = caseElement(literalInteger);
				if (result == null)
					result = caseEModelElement(literalInteger);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LITERAL_STRING : {
				LiteralString literalString = (LiteralString) theEObject;
				Object result = caseLiteralString(literalString);
				if (result == null)
					result = caseLiteralSpecification(literalString);
				if (result == null)
					result = caseValueSpecification(literalString);
				if (result == null)
					result = casePackageableElement(literalString);
				if (result == null)
					result = caseTypedElement(literalString);
				if (result == null)
					result = caseNamedElement(literalString);
				if (result == null)
					result = caseParameterableElement(literalString);
				if (result == null)
					result = caseElement(literalString);
				if (result == null)
					result = caseEModelElement(literalString);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LITERAL_BOOLEAN : {
				LiteralBoolean literalBoolean = (LiteralBoolean) theEObject;
				Object result = caseLiteralBoolean(literalBoolean);
				if (result == null)
					result = caseLiteralSpecification(literalBoolean);
				if (result == null)
					result = caseValueSpecification(literalBoolean);
				if (result == null)
					result = casePackageableElement(literalBoolean);
				if (result == null)
					result = caseTypedElement(literalBoolean);
				if (result == null)
					result = caseNamedElement(literalBoolean);
				if (result == null)
					result = caseParameterableElement(literalBoolean);
				if (result == null)
					result = caseElement(literalBoolean);
				if (result == null)
					result = caseEModelElement(literalBoolean);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LITERAL_NULL : {
				LiteralNull literalNull = (LiteralNull) theEObject;
				Object result = caseLiteralNull(literalNull);
				if (result == null)
					result = caseLiteralSpecification(literalNull);
				if (result == null)
					result = caseValueSpecification(literalNull);
				if (result == null)
					result = casePackageableElement(literalNull);
				if (result == null)
					result = caseTypedElement(literalNull);
				if (result == null)
					result = caseNamedElement(literalNull);
				if (result == null)
					result = caseParameterableElement(literalNull);
				if (result == null)
					result = caseElement(literalNull);
				if (result == null)
					result = caseEModelElement(literalNull);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INSTANCE_VALUE : {
				InstanceValue instanceValue = (InstanceValue) theEObject;
				Object result = caseInstanceValue(instanceValue);
				if (result == null)
					result = caseValueSpecification(instanceValue);
				if (result == null)
					result = casePackageableElement(instanceValue);
				if (result == null)
					result = caseTypedElement(instanceValue);
				if (result == null)
					result = caseNamedElement(instanceValue);
				if (result == null)
					result = caseParameterableElement(instanceValue);
				if (result == null)
					result = caseElement(instanceValue);
				if (result == null)
					result = caseEModelElement(instanceValue);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LITERAL_UNLIMITED_NATURAL : {
				LiteralUnlimitedNatural literalUnlimitedNatural = (LiteralUnlimitedNatural) theEObject;
				Object result = caseLiteralUnlimitedNatural(literalUnlimitedNatural);
				if (result == null)
					result = caseLiteralSpecification(literalUnlimitedNatural);
				if (result == null)
					result = caseValueSpecification(literalUnlimitedNatural);
				if (result == null)
					result = casePackageableElement(literalUnlimitedNatural);
				if (result == null)
					result = caseTypedElement(literalUnlimitedNatural);
				if (result == null)
					result = caseNamedElement(literalUnlimitedNatural);
				if (result == null)
					result = caseParameterableElement(literalUnlimitedNatural);
				if (result == null)
					result = caseElement(literalUnlimitedNatural);
				if (result == null)
					result = caseEModelElement(literalUnlimitedNatural);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OPAQUE_BEHAVIOR : {
				OpaqueBehavior opaqueBehavior = (OpaqueBehavior) theEObject;
				Object result = caseOpaqueBehavior(opaqueBehavior);
				if (result == null)
					result = caseBehavior(opaqueBehavior);
				if (result == null)
					result = caseClass(opaqueBehavior);
				if (result == null)
					result = caseEncapsulatedClassifier(opaqueBehavior);
				if (result == null)
					result = caseBehavioredClassifier(opaqueBehavior);
				if (result == null)
					result = caseStructuredClassifier(opaqueBehavior);
				if (result == null)
					result = caseClassifier(opaqueBehavior);
				if (result == null)
					result = caseNamespace(opaqueBehavior);
				if (result == null)
					result = caseRedefinableElement(opaqueBehavior);
				if (result == null)
					result = caseType(opaqueBehavior);
				if (result == null)
					result = caseTemplateableElement(opaqueBehavior);
				if (result == null)
					result = caseNamedElement(opaqueBehavior);
				if (result == null)
					result = casePackageableElement(opaqueBehavior);
				if (result == null)
					result = caseElement(opaqueBehavior);
				if (result == null)
					result = caseParameterableElement(opaqueBehavior);
				if (result == null)
					result = caseEModelElement(opaqueBehavior);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.FUNCTION_BEHAVIOR : {
				FunctionBehavior functionBehavior = (FunctionBehavior) theEObject;
				Object result = caseFunctionBehavior(functionBehavior);
				if (result == null)
					result = caseOpaqueBehavior(functionBehavior);
				if (result == null)
					result = caseBehavior(functionBehavior);
				if (result == null)
					result = caseClass(functionBehavior);
				if (result == null)
					result = caseEncapsulatedClassifier(functionBehavior);
				if (result == null)
					result = caseBehavioredClassifier(functionBehavior);
				if (result == null)
					result = caseStructuredClassifier(functionBehavior);
				if (result == null)
					result = caseClassifier(functionBehavior);
				if (result == null)
					result = caseNamespace(functionBehavior);
				if (result == null)
					result = caseRedefinableElement(functionBehavior);
				if (result == null)
					result = caseType(functionBehavior);
				if (result == null)
					result = caseTemplateableElement(functionBehavior);
				if (result == null)
					result = caseNamedElement(functionBehavior);
				if (result == null)
					result = casePackageableElement(functionBehavior);
				if (result == null)
					result = caseElement(functionBehavior);
				if (result == null)
					result = caseParameterableElement(functionBehavior);
				if (result == null)
					result = caseEModelElement(functionBehavior);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OPAQUE_ACTION : {
				OpaqueAction opaqueAction = (OpaqueAction) theEObject;
				Object result = caseOpaqueAction(opaqueAction);
				if (result == null)
					result = caseAction(opaqueAction);
				if (result == null)
					result = caseExecutableNode(opaqueAction);
				if (result == null)
					result = caseActivityNode(opaqueAction);
				if (result == null)
					result = caseRedefinableElement(opaqueAction);
				if (result == null)
					result = caseNamedElement(opaqueAction);
				if (result == null)
					result = caseElement(opaqueAction);
				if (result == null)
					result = caseEModelElement(opaqueAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTION : {
				Action action = (Action) theEObject;
				Object result = caseAction(action);
				if (result == null)
					result = caseExecutableNode(action);
				if (result == null)
					result = caseActivityNode(action);
				if (result == null)
					result = caseRedefinableElement(action);
				if (result == null)
					result = caseNamedElement(action);
				if (result == null)
					result = caseElement(action);
				if (result == null)
					result = caseEModelElement(action);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXECUTABLE_NODE : {
				ExecutableNode executableNode = (ExecutableNode) theEObject;
				Object result = caseExecutableNode(executableNode);
				if (result == null)
					result = caseActivityNode(executableNode);
				if (result == null)
					result = caseRedefinableElement(executableNode);
				if (result == null)
					result = caseNamedElement(executableNode);
				if (result == null)
					result = caseElement(executableNode);
				if (result == null)
					result = caseEModelElement(executableNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTIVITY_NODE : {
				ActivityNode activityNode = (ActivityNode) theEObject;
				Object result = caseActivityNode(activityNode);
				if (result == null)
					result = caseRedefinableElement(activityNode);
				if (result == null)
					result = caseNamedElement(activityNode);
				if (result == null)
					result = caseElement(activityNode);
				if (result == null)
					result = caseEModelElement(activityNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STRUCTURED_ACTIVITY_NODE : {
				StructuredActivityNode structuredActivityNode = (StructuredActivityNode) theEObject;
				Object result = caseStructuredActivityNode(structuredActivityNode);
				if (result == null)
					result = caseAction(structuredActivityNode);
				if (result == null)
					result = caseNamespace(structuredActivityNode);
				if (result == null)
					result = caseActivityGroup(structuredActivityNode);
				if (result == null)
					result = caseExecutableNode(structuredActivityNode);
				if (result == null)
					result = caseNamedElement(structuredActivityNode);
				if (result == null)
					result = caseElement(structuredActivityNode);
				if (result == null)
					result = caseActivityNode(structuredActivityNode);
				if (result == null)
					result = caseEModelElement(structuredActivityNode);
				if (result == null)
					result = caseRedefinableElement(structuredActivityNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTIVITY_GROUP : {
				ActivityGroup activityGroup = (ActivityGroup) theEObject;
				Object result = caseActivityGroup(activityGroup);
				if (result == null)
					result = caseElement(activityGroup);
				if (result == null)
					result = caseEModelElement(activityGroup);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTIVITY : {
				Activity activity = (Activity) theEObject;
				Object result = caseActivity(activity);
				if (result == null)
					result = caseBehavior(activity);
				if (result == null)
					result = caseClass(activity);
				if (result == null)
					result = caseEncapsulatedClassifier(activity);
				if (result == null)
					result = caseBehavioredClassifier(activity);
				if (result == null)
					result = caseStructuredClassifier(activity);
				if (result == null)
					result = caseClassifier(activity);
				if (result == null)
					result = caseNamespace(activity);
				if (result == null)
					result = caseRedefinableElement(activity);
				if (result == null)
					result = caseType(activity);
				if (result == null)
					result = caseTemplateableElement(activity);
				if (result == null)
					result = caseNamedElement(activity);
				if (result == null)
					result = casePackageableElement(activity);
				if (result == null)
					result = caseElement(activity);
				if (result == null)
					result = caseParameterableElement(activity);
				if (result == null)
					result = caseEModelElement(activity);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.VARIABLE : {
				Variable variable = (Variable) theEObject;
				Object result = caseVariable(variable);
				if (result == null)
					result = caseConnectableElement(variable);
				if (result == null)
					result = caseMultiplicityElement(variable);
				if (result == null)
					result = caseTypedElement(variable);
				if (result == null)
					result = caseParameterableElement(variable);
				if (result == null)
					result = caseElement(variable);
				if (result == null)
					result = caseNamedElement(variable);
				if (result == null)
					result = caseEModelElement(variable);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTIVITY_EDGE : {
				ActivityEdge activityEdge = (ActivityEdge) theEObject;
				Object result = caseActivityEdge(activityEdge);
				if (result == null)
					result = caseRedefinableElement(activityEdge);
				if (result == null)
					result = caseNamedElement(activityEdge);
				if (result == null)
					result = caseElement(activityEdge);
				if (result == null)
					result = caseEModelElement(activityEdge);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTIVITY_PARTITION : {
				ActivityPartition activityPartition = (ActivityPartition) theEObject;
				Object result = caseActivityPartition(activityPartition);
				if (result == null)
					result = caseNamedElement(activityPartition);
				if (result == null)
					result = caseActivityGroup(activityPartition);
				if (result == null)
					result = caseElement(activityPartition);
				if (result == null)
					result = caseEModelElement(activityPartition);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERRUPTIBLE_ACTIVITY_REGION : {
				InterruptibleActivityRegion interruptibleActivityRegion = (InterruptibleActivityRegion) theEObject;
				Object result = caseInterruptibleActivityRegion(interruptibleActivityRegion);
				if (result == null)
					result = caseActivityGroup(interruptibleActivityRegion);
				if (result == null)
					result = caseElement(interruptibleActivityRegion);
				if (result == null)
					result = caseEModelElement(interruptibleActivityRegion);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXCEPTION_HANDLER : {
				ExceptionHandler exceptionHandler = (ExceptionHandler) theEObject;
				Object result = caseExceptionHandler(exceptionHandler);
				if (result == null)
					result = caseElement(exceptionHandler);
				if (result == null)
					result = caseEModelElement(exceptionHandler);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OBJECT_NODE : {
				ObjectNode objectNode = (ObjectNode) theEObject;
				Object result = caseObjectNode(objectNode);
				if (result == null)
					result = caseActivityNode(objectNode);
				if (result == null)
					result = caseTypedElement(objectNode);
				if (result == null)
					result = caseRedefinableElement(objectNode);
				if (result == null)
					result = caseNamedElement(objectNode);
				if (result == null)
					result = caseElement(objectNode);
				if (result == null)
					result = caseEModelElement(objectNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OUTPUT_PIN : {
				OutputPin outputPin = (OutputPin) theEObject;
				Object result = caseOutputPin(outputPin);
				if (result == null)
					result = casePin(outputPin);
				if (result == null)
					result = caseObjectNode(outputPin);
				if (result == null)
					result = caseMultiplicityElement(outputPin);
				if (result == null)
					result = caseActivityNode(outputPin);
				if (result == null)
					result = caseTypedElement(outputPin);
				if (result == null)
					result = caseElement(outputPin);
				if (result == null)
					result = caseRedefinableElement(outputPin);
				if (result == null)
					result = caseNamedElement(outputPin);
				if (result == null)
					result = caseEModelElement(outputPin);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PIN : {
				Pin pin = (Pin) theEObject;
				Object result = casePin(pin);
				if (result == null)
					result = caseObjectNode(pin);
				if (result == null)
					result = caseMultiplicityElement(pin);
				if (result == null)
					result = caseActivityNode(pin);
				if (result == null)
					result = caseTypedElement(pin);
				if (result == null)
					result = caseElement(pin);
				if (result == null)
					result = caseRedefinableElement(pin);
				if (result == null)
					result = caseNamedElement(pin);
				if (result == null)
					result = caseEModelElement(pin);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INPUT_PIN : {
				InputPin inputPin = (InputPin) theEObject;
				Object result = caseInputPin(inputPin);
				if (result == null)
					result = casePin(inputPin);
				if (result == null)
					result = caseObjectNode(inputPin);
				if (result == null)
					result = caseMultiplicityElement(inputPin);
				if (result == null)
					result = caseActivityNode(inputPin);
				if (result == null)
					result = caseTypedElement(inputPin);
				if (result == null)
					result = caseElement(inputPin);
				if (result == null)
					result = caseRedefinableElement(inputPin);
				if (result == null)
					result = caseNamedElement(inputPin);
				if (result == null)
					result = caseEModelElement(inputPin);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CALL_ACTION : {
				CallAction callAction = (CallAction) theEObject;
				Object result = caseCallAction(callAction);
				if (result == null)
					result = caseInvocationAction(callAction);
				if (result == null)
					result = caseAction(callAction);
				if (result == null)
					result = caseExecutableNode(callAction);
				if (result == null)
					result = caseActivityNode(callAction);
				if (result == null)
					result = caseRedefinableElement(callAction);
				if (result == null)
					result = caseNamedElement(callAction);
				if (result == null)
					result = caseElement(callAction);
				if (result == null)
					result = caseEModelElement(callAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INVOCATION_ACTION : {
				InvocationAction invocationAction = (InvocationAction) theEObject;
				Object result = caseInvocationAction(invocationAction);
				if (result == null)
					result = caseAction(invocationAction);
				if (result == null)
					result = caseExecutableNode(invocationAction);
				if (result == null)
					result = caseActivityNode(invocationAction);
				if (result == null)
					result = caseRedefinableElement(invocationAction);
				if (result == null)
					result = caseNamedElement(invocationAction);
				if (result == null)
					result = caseElement(invocationAction);
				if (result == null)
					result = caseEModelElement(invocationAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SEND_SIGNAL_ACTION : {
				SendSignalAction sendSignalAction = (SendSignalAction) theEObject;
				Object result = caseSendSignalAction(sendSignalAction);
				if (result == null)
					result = caseInvocationAction(sendSignalAction);
				if (result == null)
					result = caseAction(sendSignalAction);
				if (result == null)
					result = caseExecutableNode(sendSignalAction);
				if (result == null)
					result = caseActivityNode(sendSignalAction);
				if (result == null)
					result = caseRedefinableElement(sendSignalAction);
				if (result == null)
					result = caseNamedElement(sendSignalAction);
				if (result == null)
					result = caseElement(sendSignalAction);
				if (result == null)
					result = caseEModelElement(sendSignalAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CALL_OPERATION_ACTION : {
				CallOperationAction callOperationAction = (CallOperationAction) theEObject;
				Object result = caseCallOperationAction(callOperationAction);
				if (result == null)
					result = caseCallAction(callOperationAction);
				if (result == null)
					result = caseInvocationAction(callOperationAction);
				if (result == null)
					result = caseAction(callOperationAction);
				if (result == null)
					result = caseExecutableNode(callOperationAction);
				if (result == null)
					result = caseActivityNode(callOperationAction);
				if (result == null)
					result = caseRedefinableElement(callOperationAction);
				if (result == null)
					result = caseNamedElement(callOperationAction);
				if (result == null)
					result = caseElement(callOperationAction);
				if (result == null)
					result = caseEModelElement(callOperationAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CALL_BEHAVIOR_ACTION : {
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction) theEObject;
				Object result = caseCallBehaviorAction(callBehaviorAction);
				if (result == null)
					result = caseCallAction(callBehaviorAction);
				if (result == null)
					result = caseInvocationAction(callBehaviorAction);
				if (result == null)
					result = caseAction(callBehaviorAction);
				if (result == null)
					result = caseExecutableNode(callBehaviorAction);
				if (result == null)
					result = caseActivityNode(callBehaviorAction);
				if (result == null)
					result = caseRedefinableElement(callBehaviorAction);
				if (result == null)
					result = caseNamedElement(callBehaviorAction);
				if (result == null)
					result = caseElement(callBehaviorAction);
				if (result == null)
					result = caseEModelElement(callBehaviorAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SEQUENCE_NODE : {
				SequenceNode sequenceNode = (SequenceNode) theEObject;
				Object result = caseSequenceNode(sequenceNode);
				if (result == null)
					result = caseStructuredActivityNode(sequenceNode);
				if (result == null)
					result = caseAction(sequenceNode);
				if (result == null)
					result = caseNamespace(sequenceNode);
				if (result == null)
					result = caseActivityGroup(sequenceNode);
				if (result == null)
					result = caseExecutableNode(sequenceNode);
				if (result == null)
					result = caseNamedElement(sequenceNode);
				if (result == null)
					result = caseElement(sequenceNode);
				if (result == null)
					result = caseActivityNode(sequenceNode);
				if (result == null)
					result = caseEModelElement(sequenceNode);
				if (result == null)
					result = caseRedefinableElement(sequenceNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.USAGE : {
				Usage usage = (Usage) theEObject;
				Object result = caseUsage(usage);
				if (result == null)
					result = caseDependency(usage);
				if (result == null)
					result = casePackageableElement(usage);
				if (result == null)
					result = caseDirectedRelationship(usage);
				if (result == null)
					result = caseNamedElement(usage);
				if (result == null)
					result = caseParameterableElement(usage);
				if (result == null)
					result = caseRelationship(usage);
				if (result == null)
					result = caseElement(usage);
				if (result == null)
					result = caseEModelElement(usage);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONTROL_NODE : {
				ControlNode controlNode = (ControlNode) theEObject;
				Object result = caseControlNode(controlNode);
				if (result == null)
					result = caseActivityNode(controlNode);
				if (result == null)
					result = caseRedefinableElement(controlNode);
				if (result == null)
					result = caseNamedElement(controlNode);
				if (result == null)
					result = caseElement(controlNode);
				if (result == null)
					result = caseEModelElement(controlNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONTROL_FLOW : {
				ControlFlow controlFlow = (ControlFlow) theEObject;
				Object result = caseControlFlow(controlFlow);
				if (result == null)
					result = caseActivityEdge(controlFlow);
				if (result == null)
					result = caseRedefinableElement(controlFlow);
				if (result == null)
					result = caseNamedElement(controlFlow);
				if (result == null)
					result = caseElement(controlFlow);
				if (result == null)
					result = caseEModelElement(controlFlow);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INITIAL_NODE : {
				InitialNode initialNode = (InitialNode) theEObject;
				Object result = caseInitialNode(initialNode);
				if (result == null)
					result = caseControlNode(initialNode);
				if (result == null)
					result = caseActivityNode(initialNode);
				if (result == null)
					result = caseRedefinableElement(initialNode);
				if (result == null)
					result = caseNamedElement(initialNode);
				if (result == null)
					result = caseElement(initialNode);
				if (result == null)
					result = caseEModelElement(initialNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTIVITY_PARAMETER_NODE : {
				ActivityParameterNode activityParameterNode = (ActivityParameterNode) theEObject;
				Object result = caseActivityParameterNode(activityParameterNode);
				if (result == null)
					result = caseObjectNode(activityParameterNode);
				if (result == null)
					result = caseActivityNode(activityParameterNode);
				if (result == null)
					result = caseTypedElement(activityParameterNode);
				if (result == null)
					result = caseRedefinableElement(activityParameterNode);
				if (result == null)
					result = caseNamedElement(activityParameterNode);
				if (result == null)
					result = caseElement(activityParameterNode);
				if (result == null)
					result = caseEModelElement(activityParameterNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.VALUE_PIN : {
				ValuePin valuePin = (ValuePin) theEObject;
				Object result = caseValuePin(valuePin);
				if (result == null)
					result = caseInputPin(valuePin);
				if (result == null)
					result = casePin(valuePin);
				if (result == null)
					result = caseObjectNode(valuePin);
				if (result == null)
					result = caseMultiplicityElement(valuePin);
				if (result == null)
					result = caseActivityNode(valuePin);
				if (result == null)
					result = caseTypedElement(valuePin);
				if (result == null)
					result = caseElement(valuePin);
				if (result == null)
					result = caseRedefinableElement(valuePin);
				if (result == null)
					result = caseNamedElement(valuePin);
				if (result == null)
					result = caseEModelElement(valuePin);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MESSAGE : {
				Message message = (Message) theEObject;
				Object result = caseMessage(message);
				if (result == null)
					result = caseNamedElement(message);
				if (result == null)
					result = caseElement(message);
				if (result == null)
					result = caseEModelElement(message);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MESSAGE_END : {
				MessageEnd messageEnd = (MessageEnd) theEObject;
				Object result = caseMessageEnd(messageEnd);
				if (result == null)
					result = caseNamedElement(messageEnd);
				if (result == null)
					result = caseElement(messageEnd);
				if (result == null)
					result = caseEModelElement(messageEnd);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERACTION : {
				Interaction interaction = (Interaction) theEObject;
				Object result = caseInteraction(interaction);
				if (result == null)
					result = caseBehavior(interaction);
				if (result == null)
					result = caseInteractionFragment(interaction);
				if (result == null)
					result = caseClass(interaction);
				if (result == null)
					result = caseNamedElement(interaction);
				if (result == null)
					result = caseEncapsulatedClassifier(interaction);
				if (result == null)
					result = caseBehavioredClassifier(interaction);
				if (result == null)
					result = caseElement(interaction);
				if (result == null)
					result = caseStructuredClassifier(interaction);
				if (result == null)
					result = caseClassifier(interaction);
				if (result == null)
					result = caseEModelElement(interaction);
				if (result == null)
					result = caseNamespace(interaction);
				if (result == null)
					result = caseRedefinableElement(interaction);
				if (result == null)
					result = caseType(interaction);
				if (result == null)
					result = caseTemplateableElement(interaction);
				if (result == null)
					result = casePackageableElement(interaction);
				if (result == null)
					result = caseParameterableElement(interaction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERACTION_FRAGMENT : {
				InteractionFragment interactionFragment = (InteractionFragment) theEObject;
				Object result = caseInteractionFragment(interactionFragment);
				if (result == null)
					result = caseNamedElement(interactionFragment);
				if (result == null)
					result = caseElement(interactionFragment);
				if (result == null)
					result = caseEModelElement(interactionFragment);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LIFELINE : {
				Lifeline lifeline = (Lifeline) theEObject;
				Object result = caseLifeline(lifeline);
				if (result == null)
					result = caseNamedElement(lifeline);
				if (result == null)
					result = caseElement(lifeline);
				if (result == null)
					result = caseEModelElement(lifeline);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PART_DECOMPOSITION : {
				PartDecomposition partDecomposition = (PartDecomposition) theEObject;
				Object result = casePartDecomposition(partDecomposition);
				if (result == null)
					result = caseInteractionUse(partDecomposition);
				if (result == null)
					result = caseInteractionFragment(partDecomposition);
				if (result == null)
					result = caseNamedElement(partDecomposition);
				if (result == null)
					result = caseElement(partDecomposition);
				if (result == null)
					result = caseEModelElement(partDecomposition);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERACTION_USE : {
				InteractionUse interactionUse = (InteractionUse) theEObject;
				Object result = caseInteractionUse(interactionUse);
				if (result == null)
					result = caseInteractionFragment(interactionUse);
				if (result == null)
					result = caseNamedElement(interactionUse);
				if (result == null)
					result = caseElement(interactionUse);
				if (result == null)
					result = caseEModelElement(interactionUse);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.GATE : {
				Gate gate = (Gate) theEObject;
				Object result = caseGate(gate);
				if (result == null)
					result = caseMessageEnd(gate);
				if (result == null)
					result = caseNamedElement(gate);
				if (result == null)
					result = caseElement(gate);
				if (result == null)
					result = caseEModelElement(gate);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.GENERAL_ORDERING : {
				GeneralOrdering generalOrdering = (GeneralOrdering) theEObject;
				Object result = caseGeneralOrdering(generalOrdering);
				if (result == null)
					result = caseNamedElement(generalOrdering);
				if (result == null)
					result = caseElement(generalOrdering);
				if (result == null)
					result = caseEModelElement(generalOrdering);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OCCURRENCE_SPECIFICATION : {
				OccurrenceSpecification occurrenceSpecification = (OccurrenceSpecification) theEObject;
				Object result = caseOccurrenceSpecification(occurrenceSpecification);
				if (result == null)
					result = caseInteractionFragment(occurrenceSpecification);
				if (result == null)
					result = caseNamedElement(occurrenceSpecification);
				if (result == null)
					result = caseElement(occurrenceSpecification);
				if (result == null)
					result = caseEModelElement(occurrenceSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERACTION_OPERAND : {
				InteractionOperand interactionOperand = (InteractionOperand) theEObject;
				Object result = caseInteractionOperand(interactionOperand);
				if (result == null)
					result = caseNamespace(interactionOperand);
				if (result == null)
					result = caseInteractionFragment(interactionOperand);
				if (result == null)
					result = caseNamedElement(interactionOperand);
				if (result == null)
					result = caseElement(interactionOperand);
				if (result == null)
					result = caseEModelElement(interactionOperand);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERACTION_CONSTRAINT : {
				InteractionConstraint interactionConstraint = (InteractionConstraint) theEObject;
				Object result = caseInteractionConstraint(interactionConstraint);
				if (result == null)
					result = caseConstraint(interactionConstraint);
				if (result == null)
					result = casePackageableElement(interactionConstraint);
				if (result == null)
					result = caseNamedElement(interactionConstraint);
				if (result == null)
					result = caseParameterableElement(interactionConstraint);
				if (result == null)
					result = caseElement(interactionConstraint);
				if (result == null)
					result = caseEModelElement(interactionConstraint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXECUTION_SPECIFICATION : {
				ExecutionSpecification executionSpecification = (ExecutionSpecification) theEObject;
				Object result = caseExecutionSpecification(executionSpecification);
				if (result == null)
					result = caseInteractionFragment(executionSpecification);
				if (result == null)
					result = caseNamedElement(executionSpecification);
				if (result == null)
					result = caseElement(executionSpecification);
				if (result == null)
					result = caseEModelElement(executionSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STATE_INVARIANT : {
				StateInvariant stateInvariant = (StateInvariant) theEObject;
				Object result = caseStateInvariant(stateInvariant);
				if (result == null)
					result = caseInteractionFragment(stateInvariant);
				if (result == null)
					result = caseNamedElement(stateInvariant);
				if (result == null)
					result = caseElement(stateInvariant);
				if (result == null)
					result = caseEModelElement(stateInvariant);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION : {
				ActionExecutionSpecification actionExecutionSpecification = (ActionExecutionSpecification) theEObject;
				Object result = caseActionExecutionSpecification(actionExecutionSpecification);
				if (result == null)
					result = caseExecutionSpecification(actionExecutionSpecification);
				if (result == null)
					result = caseInteractionFragment(actionExecutionSpecification);
				if (result == null)
					result = caseNamedElement(actionExecutionSpecification);
				if (result == null)
					result = caseElement(actionExecutionSpecification);
				if (result == null)
					result = caseEModelElement(actionExecutionSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION : {
				BehaviorExecutionSpecification behaviorExecutionSpecification = (BehaviorExecutionSpecification) theEObject;
				Object result = caseBehaviorExecutionSpecification(behaviorExecutionSpecification);
				if (result == null)
					result = caseExecutionSpecification(behaviorExecutionSpecification);
				if (result == null)
					result = caseInteractionFragment(behaviorExecutionSpecification);
				if (result == null)
					result = caseNamedElement(behaviorExecutionSpecification);
				if (result == null)
					result = caseElement(behaviorExecutionSpecification);
				if (result == null)
					result = caseEModelElement(behaviorExecutionSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXECUTION_EVENT : {
				ExecutionEvent executionEvent = (ExecutionEvent) theEObject;
				Object result = caseExecutionEvent(executionEvent);
				if (result == null)
					result = caseEvent(executionEvent);
				if (result == null)
					result = casePackageableElement(executionEvent);
				if (result == null)
					result = caseNamedElement(executionEvent);
				if (result == null)
					result = caseParameterableElement(executionEvent);
				if (result == null)
					result = caseElement(executionEvent);
				if (result == null)
					result = caseEModelElement(executionEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CREATION_EVENT : {
				CreationEvent creationEvent = (CreationEvent) theEObject;
				Object result = caseCreationEvent(creationEvent);
				if (result == null)
					result = caseEvent(creationEvent);
				if (result == null)
					result = casePackageableElement(creationEvent);
				if (result == null)
					result = caseNamedElement(creationEvent);
				if (result == null)
					result = caseParameterableElement(creationEvent);
				if (result == null)
					result = caseElement(creationEvent);
				if (result == null)
					result = caseEModelElement(creationEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DESTRUCTION_EVENT : {
				DestructionEvent destructionEvent = (DestructionEvent) theEObject;
				Object result = caseDestructionEvent(destructionEvent);
				if (result == null)
					result = caseEvent(destructionEvent);
				if (result == null)
					result = casePackageableElement(destructionEvent);
				if (result == null)
					result = caseNamedElement(destructionEvent);
				if (result == null)
					result = caseParameterableElement(destructionEvent);
				if (result == null)
					result = caseElement(destructionEvent);
				if (result == null)
					result = caseEModelElement(destructionEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SEND_OPERATION_EVENT : {
				SendOperationEvent sendOperationEvent = (SendOperationEvent) theEObject;
				Object result = caseSendOperationEvent(sendOperationEvent);
				if (result == null)
					result = caseMessageEvent(sendOperationEvent);
				if (result == null)
					result = caseEvent(sendOperationEvent);
				if (result == null)
					result = casePackageableElement(sendOperationEvent);
				if (result == null)
					result = caseNamedElement(sendOperationEvent);
				if (result == null)
					result = caseParameterableElement(sendOperationEvent);
				if (result == null)
					result = caseElement(sendOperationEvent);
				if (result == null)
					result = caseEModelElement(sendOperationEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MESSAGE_EVENT : {
				MessageEvent messageEvent = (MessageEvent) theEObject;
				Object result = caseMessageEvent(messageEvent);
				if (result == null)
					result = caseEvent(messageEvent);
				if (result == null)
					result = casePackageableElement(messageEvent);
				if (result == null)
					result = caseNamedElement(messageEvent);
				if (result == null)
					result = caseParameterableElement(messageEvent);
				if (result == null)
					result = caseElement(messageEvent);
				if (result == null)
					result = caseEModelElement(messageEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SEND_SIGNAL_EVENT : {
				SendSignalEvent sendSignalEvent = (SendSignalEvent) theEObject;
				Object result = caseSendSignalEvent(sendSignalEvent);
				if (result == null)
					result = caseMessageEvent(sendSignalEvent);
				if (result == null)
					result = caseEvent(sendSignalEvent);
				if (result == null)
					result = casePackageableElement(sendSignalEvent);
				if (result == null)
					result = caseNamedElement(sendSignalEvent);
				if (result == null)
					result = caseParameterableElement(sendSignalEvent);
				if (result == null)
					result = caseElement(sendSignalEvent);
				if (result == null)
					result = caseEModelElement(sendSignalEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION : {
				MessageOccurrenceSpecification messageOccurrenceSpecification = (MessageOccurrenceSpecification) theEObject;
				Object result = caseMessageOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null)
					result = caseOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null)
					result = caseMessageEnd(messageOccurrenceSpecification);
				if (result == null)
					result = caseInteractionFragment(messageOccurrenceSpecification);
				if (result == null)
					result = caseNamedElement(messageOccurrenceSpecification);
				if (result == null)
					result = caseElement(messageOccurrenceSpecification);
				if (result == null)
					result = caseEModelElement(messageOccurrenceSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXECUTION_OCCURRENCE_SPECIFICATION : {
				ExecutionOccurrenceSpecification executionOccurrenceSpecification = (ExecutionOccurrenceSpecification) theEObject;
				Object result = caseExecutionOccurrenceSpecification(executionOccurrenceSpecification);
				if (result == null)
					result = caseOccurrenceSpecification(executionOccurrenceSpecification);
				if (result == null)
					result = caseInteractionFragment(executionOccurrenceSpecification);
				if (result == null)
					result = caseNamedElement(executionOccurrenceSpecification);
				if (result == null)
					result = caseElement(executionOccurrenceSpecification);
				if (result == null)
					result = caseEModelElement(executionOccurrenceSpecification);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.RECEIVE_OPERATION_EVENT : {
				ReceiveOperationEvent receiveOperationEvent = (ReceiveOperationEvent) theEObject;
				Object result = caseReceiveOperationEvent(receiveOperationEvent);
				if (result == null)
					result = caseMessageEvent(receiveOperationEvent);
				if (result == null)
					result = caseEvent(receiveOperationEvent);
				if (result == null)
					result = casePackageableElement(receiveOperationEvent);
				if (result == null)
					result = caseNamedElement(receiveOperationEvent);
				if (result == null)
					result = caseParameterableElement(receiveOperationEvent);
				if (result == null)
					result = caseElement(receiveOperationEvent);
				if (result == null)
					result = caseEModelElement(receiveOperationEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.RECEIVE_SIGNAL_EVENT : {
				ReceiveSignalEvent receiveSignalEvent = (ReceiveSignalEvent) theEObject;
				Object result = caseReceiveSignalEvent(receiveSignalEvent);
				if (result == null)
					result = caseMessageEvent(receiveSignalEvent);
				if (result == null)
					result = caseEvent(receiveSignalEvent);
				if (result == null)
					result = casePackageableElement(receiveSignalEvent);
				if (result == null)
					result = caseNamedElement(receiveSignalEvent);
				if (result == null)
					result = caseParameterableElement(receiveSignalEvent);
				if (result == null)
					result = caseElement(receiveSignalEvent);
				if (result == null)
					result = caseEModelElement(receiveSignalEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTOR : {
				Actor actor = (Actor) theEObject;
				Object result = caseActor(actor);
				if (result == null)
					result = caseBehavioredClassifier(actor);
				if (result == null)
					result = caseClassifier(actor);
				if (result == null)
					result = caseNamespace(actor);
				if (result == null)
					result = caseRedefinableElement(actor);
				if (result == null)
					result = caseType(actor);
				if (result == null)
					result = caseTemplateableElement(actor);
				if (result == null)
					result = caseNamedElement(actor);
				if (result == null)
					result = casePackageableElement(actor);
				if (result == null)
					result = caseElement(actor);
				if (result == null)
					result = caseParameterableElement(actor);
				if (result == null)
					result = caseEModelElement(actor);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CALL_EVENT : {
				CallEvent callEvent = (CallEvent) theEObject;
				Object result = caseCallEvent(callEvent);
				if (result == null)
					result = caseMessageEvent(callEvent);
				if (result == null)
					result = caseEvent(callEvent);
				if (result == null)
					result = casePackageableElement(callEvent);
				if (result == null)
					result = caseNamedElement(callEvent);
				if (result == null)
					result = caseParameterableElement(callEvent);
				if (result == null)
					result = caseElement(callEvent);
				if (result == null)
					result = caseEModelElement(callEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CHANGE_EVENT : {
				ChangeEvent changeEvent = (ChangeEvent) theEObject;
				Object result = caseChangeEvent(changeEvent);
				if (result == null)
					result = caseEvent(changeEvent);
				if (result == null)
					result = casePackageableElement(changeEvent);
				if (result == null)
					result = caseNamedElement(changeEvent);
				if (result == null)
					result = caseParameterableElement(changeEvent);
				if (result == null)
					result = caseElement(changeEvent);
				if (result == null)
					result = caseEModelElement(changeEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SIGNAL_EVENT : {
				SignalEvent signalEvent = (SignalEvent) theEObject;
				Object result = caseSignalEvent(signalEvent);
				if (result == null)
					result = caseMessageEvent(signalEvent);
				if (result == null)
					result = caseEvent(signalEvent);
				if (result == null)
					result = casePackageableElement(signalEvent);
				if (result == null)
					result = caseNamedElement(signalEvent);
				if (result == null)
					result = caseParameterableElement(signalEvent);
				if (result == null)
					result = caseElement(signalEvent);
				if (result == null)
					result = caseEModelElement(signalEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ANY_RECEIVE_EVENT : {
				AnyReceiveEvent anyReceiveEvent = (AnyReceiveEvent) theEObject;
				Object result = caseAnyReceiveEvent(anyReceiveEvent);
				if (result == null)
					result = caseMessageEvent(anyReceiveEvent);
				if (result == null)
					result = caseEvent(anyReceiveEvent);
				if (result == null)
					result = casePackageableElement(anyReceiveEvent);
				if (result == null)
					result = caseNamedElement(anyReceiveEvent);
				if (result == null)
					result = caseParameterableElement(anyReceiveEvent);
				if (result == null)
					result = caseElement(anyReceiveEvent);
				if (result == null)
					result = caseEModelElement(anyReceiveEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.FORK_NODE : {
				ForkNode forkNode = (ForkNode) theEObject;
				Object result = caseForkNode(forkNode);
				if (result == null)
					result = caseControlNode(forkNode);
				if (result == null)
					result = caseActivityNode(forkNode);
				if (result == null)
					result = caseRedefinableElement(forkNode);
				if (result == null)
					result = caseNamedElement(forkNode);
				if (result == null)
					result = caseElement(forkNode);
				if (result == null)
					result = caseEModelElement(forkNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.FLOW_FINAL_NODE : {
				FlowFinalNode flowFinalNode = (FlowFinalNode) theEObject;
				Object result = caseFlowFinalNode(flowFinalNode);
				if (result == null)
					result = caseFinalNode(flowFinalNode);
				if (result == null)
					result = caseControlNode(flowFinalNode);
				if (result == null)
					result = caseActivityNode(flowFinalNode);
				if (result == null)
					result = caseRedefinableElement(flowFinalNode);
				if (result == null)
					result = caseNamedElement(flowFinalNode);
				if (result == null)
					result = caseElement(flowFinalNode);
				if (result == null)
					result = caseEModelElement(flowFinalNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.FINAL_NODE : {
				FinalNode finalNode = (FinalNode) theEObject;
				Object result = caseFinalNode(finalNode);
				if (result == null)
					result = caseControlNode(finalNode);
				if (result == null)
					result = caseActivityNode(finalNode);
				if (result == null)
					result = caseRedefinableElement(finalNode);
				if (result == null)
					result = caseNamedElement(finalNode);
				if (result == null)
					result = caseElement(finalNode);
				if (result == null)
					result = caseEModelElement(finalNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CENTRAL_BUFFER_NODE : {
				CentralBufferNode centralBufferNode = (CentralBufferNode) theEObject;
				Object result = caseCentralBufferNode(centralBufferNode);
				if (result == null)
					result = caseObjectNode(centralBufferNode);
				if (result == null)
					result = caseActivityNode(centralBufferNode);
				if (result == null)
					result = caseTypedElement(centralBufferNode);
				if (result == null)
					result = caseRedefinableElement(centralBufferNode);
				if (result == null)
					result = caseNamedElement(centralBufferNode);
				if (result == null)
					result = caseElement(centralBufferNode);
				if (result == null)
					result = caseEModelElement(centralBufferNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.MERGE_NODE : {
				MergeNode mergeNode = (MergeNode) theEObject;
				Object result = caseMergeNode(mergeNode);
				if (result == null)
					result = caseControlNode(mergeNode);
				if (result == null)
					result = caseActivityNode(mergeNode);
				if (result == null)
					result = caseRedefinableElement(mergeNode);
				if (result == null)
					result = caseNamedElement(mergeNode);
				if (result == null)
					result = caseElement(mergeNode);
				if (result == null)
					result = caseEModelElement(mergeNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DECISION_NODE : {
				DecisionNode decisionNode = (DecisionNode) theEObject;
				Object result = caseDecisionNode(decisionNode);
				if (result == null)
					result = caseControlNode(decisionNode);
				if (result == null)
					result = caseActivityNode(decisionNode);
				if (result == null)
					result = caseRedefinableElement(decisionNode);
				if (result == null)
					result = caseNamedElement(decisionNode);
				if (result == null)
					result = caseElement(decisionNode);
				if (result == null)
					result = caseEModelElement(decisionNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTIVITY_FINAL_NODE : {
				ActivityFinalNode activityFinalNode = (ActivityFinalNode) theEObject;
				Object result = caseActivityFinalNode(activityFinalNode);
				if (result == null)
					result = caseFinalNode(activityFinalNode);
				if (result == null)
					result = caseControlNode(activityFinalNode);
				if (result == null)
					result = caseActivityNode(activityFinalNode);
				if (result == null)
					result = caseRedefinableElement(activityFinalNode);
				if (result == null)
					result = caseNamedElement(activityFinalNode);
				if (result == null)
					result = caseElement(activityFinalNode);
				if (result == null)
					result = caseEModelElement(activityFinalNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.COMPONENT_REALIZATION : {
				ComponentRealization componentRealization = (ComponentRealization) theEObject;
				Object result = caseComponentRealization(componentRealization);
				if (result == null)
					result = caseRealization(componentRealization);
				if (result == null)
					result = caseAbstraction(componentRealization);
				if (result == null)
					result = caseDependency(componentRealization);
				if (result == null)
					result = casePackageableElement(componentRealization);
				if (result == null)
					result = caseDirectedRelationship(componentRealization);
				if (result == null)
					result = caseNamedElement(componentRealization);
				if (result == null)
					result = caseParameterableElement(componentRealization);
				if (result == null)
					result = caseRelationship(componentRealization);
				if (result == null)
					result = caseElement(componentRealization);
				if (result == null)
					result = caseEModelElement(componentRealization);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.COMPONENT : {
				Component component = (Component) theEObject;
				Object result = caseComponent(component);
				if (result == null)
					result = caseClass(component);
				if (result == null)
					result = caseNamespace(component);
				if (result == null)
					result = caseEncapsulatedClassifier(component);
				if (result == null)
					result = caseBehavioredClassifier(component);
				if (result == null)
					result = caseNamedElement(component);
				if (result == null)
					result = caseStructuredClassifier(component);
				if (result == null)
					result = caseClassifier(component);
				if (result == null)
					result = caseElement(component);
				if (result == null)
					result = caseRedefinableElement(component);
				if (result == null)
					result = caseType(component);
				if (result == null)
					result = caseTemplateableElement(component);
				if (result == null)
					result = caseEModelElement(component);
				if (result == null)
					result = casePackageableElement(component);
				if (result == null)
					result = caseParameterableElement(component);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.NODE : {
				Node node = (Node) theEObject;
				Object result = caseNode(node);
				if (result == null)
					result = caseClass(node);
				if (result == null)
					result = caseDeploymentTarget(node);
				if (result == null)
					result = caseEncapsulatedClassifier(node);
				if (result == null)
					result = caseBehavioredClassifier(node);
				if (result == null)
					result = caseNamedElement(node);
				if (result == null)
					result = caseStructuredClassifier(node);
				if (result == null)
					result = caseClassifier(node);
				if (result == null)
					result = caseElement(node);
				if (result == null)
					result = caseNamespace(node);
				if (result == null)
					result = caseRedefinableElement(node);
				if (result == null)
					result = caseType(node);
				if (result == null)
					result = caseTemplateableElement(node);
				if (result == null)
					result = caseEModelElement(node);
				if (result == null)
					result = casePackageableElement(node);
				if (result == null)
					result = caseParameterableElement(node);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DEVICE : {
				Device device = (Device) theEObject;
				Object result = caseDevice(device);
				if (result == null)
					result = caseNode(device);
				if (result == null)
					result = caseClass(device);
				if (result == null)
					result = caseDeploymentTarget(device);
				if (result == null)
					result = caseEncapsulatedClassifier(device);
				if (result == null)
					result = caseBehavioredClassifier(device);
				if (result == null)
					result = caseNamedElement(device);
				if (result == null)
					result = caseStructuredClassifier(device);
				if (result == null)
					result = caseClassifier(device);
				if (result == null)
					result = caseElement(device);
				if (result == null)
					result = caseNamespace(device);
				if (result == null)
					result = caseRedefinableElement(device);
				if (result == null)
					result = caseType(device);
				if (result == null)
					result = caseTemplateableElement(device);
				if (result == null)
					result = caseEModelElement(device);
				if (result == null)
					result = casePackageableElement(device);
				if (result == null)
					result = caseParameterableElement(device);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXECUTION_ENVIRONMENT : {
				ExecutionEnvironment executionEnvironment = (ExecutionEnvironment) theEObject;
				Object result = caseExecutionEnvironment(executionEnvironment);
				if (result == null)
					result = caseNode(executionEnvironment);
				if (result == null)
					result = caseClass(executionEnvironment);
				if (result == null)
					result = caseDeploymentTarget(executionEnvironment);
				if (result == null)
					result = caseEncapsulatedClassifier(executionEnvironment);
				if (result == null)
					result = caseBehavioredClassifier(executionEnvironment);
				if (result == null)
					result = caseNamedElement(executionEnvironment);
				if (result == null)
					result = caseStructuredClassifier(executionEnvironment);
				if (result == null)
					result = caseClassifier(executionEnvironment);
				if (result == null)
					result = caseElement(executionEnvironment);
				if (result == null)
					result = caseNamespace(executionEnvironment);
				if (result == null)
					result = caseRedefinableElement(executionEnvironment);
				if (result == null)
					result = caseType(executionEnvironment);
				if (result == null)
					result = caseTemplateableElement(executionEnvironment);
				if (result == null)
					result = caseEModelElement(executionEnvironment);
				if (result == null)
					result = casePackageableElement(executionEnvironment);
				if (result == null)
					result = caseParameterableElement(executionEnvironment);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.COMMUNICATION_PATH : {
				CommunicationPath communicationPath = (CommunicationPath) theEObject;
				Object result = caseCommunicationPath(communicationPath);
				if (result == null)
					result = caseAssociation(communicationPath);
				if (result == null)
					result = caseClassifier(communicationPath);
				if (result == null)
					result = caseRelationship(communicationPath);
				if (result == null)
					result = caseNamespace(communicationPath);
				if (result == null)
					result = caseRedefinableElement(communicationPath);
				if (result == null)
					result = caseType(communicationPath);
				if (result == null)
					result = caseTemplateableElement(communicationPath);
				if (result == null)
					result = caseElement(communicationPath);
				if (result == null)
					result = caseNamedElement(communicationPath);
				if (result == null)
					result = casePackageableElement(communicationPath);
				if (result == null)
					result = caseEModelElement(communicationPath);
				if (result == null)
					result = caseParameterableElement(communicationPath);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.COMBINED_FRAGMENT : {
				CombinedFragment combinedFragment = (CombinedFragment) theEObject;
				Object result = caseCombinedFragment(combinedFragment);
				if (result == null)
					result = caseInteractionFragment(combinedFragment);
				if (result == null)
					result = caseNamedElement(combinedFragment);
				if (result == null)
					result = caseElement(combinedFragment);
				if (result == null)
					result = caseEModelElement(combinedFragment);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONTINUATION : {
				Continuation continuation = (Continuation) theEObject;
				Object result = caseContinuation(continuation);
				if (result == null)
					result = caseInteractionFragment(continuation);
				if (result == null)
					result = caseNamedElement(continuation);
				if (result == null)
					result = caseElement(continuation);
				if (result == null)
					result = caseEModelElement(continuation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONSIDER_IGNORE_FRAGMENT : {
				ConsiderIgnoreFragment considerIgnoreFragment = (ConsiderIgnoreFragment) theEObject;
				Object result = caseConsiderIgnoreFragment(considerIgnoreFragment);
				if (result == null)
					result = caseCombinedFragment(considerIgnoreFragment);
				if (result == null)
					result = caseInteractionFragment(considerIgnoreFragment);
				if (result == null)
					result = caseNamedElement(considerIgnoreFragment);
				if (result == null)
					result = caseElement(considerIgnoreFragment);
				if (result == null)
					result = caseEModelElement(considerIgnoreFragment);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CREATE_OBJECT_ACTION : {
				CreateObjectAction createObjectAction = (CreateObjectAction) theEObject;
				Object result = caseCreateObjectAction(createObjectAction);
				if (result == null)
					result = caseAction(createObjectAction);
				if (result == null)
					result = caseExecutableNode(createObjectAction);
				if (result == null)
					result = caseActivityNode(createObjectAction);
				if (result == null)
					result = caseRedefinableElement(createObjectAction);
				if (result == null)
					result = caseNamedElement(createObjectAction);
				if (result == null)
					result = caseElement(createObjectAction);
				if (result == null)
					result = caseEModelElement(createObjectAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DESTROY_OBJECT_ACTION : {
				DestroyObjectAction destroyObjectAction = (DestroyObjectAction) theEObject;
				Object result = caseDestroyObjectAction(destroyObjectAction);
				if (result == null)
					result = caseAction(destroyObjectAction);
				if (result == null)
					result = caseExecutableNode(destroyObjectAction);
				if (result == null)
					result = caseActivityNode(destroyObjectAction);
				if (result == null)
					result = caseRedefinableElement(destroyObjectAction);
				if (result == null)
					result = caseNamedElement(destroyObjectAction);
				if (result == null)
					result = caseElement(destroyObjectAction);
				if (result == null)
					result = caseEModelElement(destroyObjectAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TEST_IDENTITY_ACTION : {
				TestIdentityAction testIdentityAction = (TestIdentityAction) theEObject;
				Object result = caseTestIdentityAction(testIdentityAction);
				if (result == null)
					result = caseAction(testIdentityAction);
				if (result == null)
					result = caseExecutableNode(testIdentityAction);
				if (result == null)
					result = caseActivityNode(testIdentityAction);
				if (result == null)
					result = caseRedefinableElement(testIdentityAction);
				if (result == null)
					result = caseNamedElement(testIdentityAction);
				if (result == null)
					result = caseElement(testIdentityAction);
				if (result == null)
					result = caseEModelElement(testIdentityAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_SELF_ACTION : {
				ReadSelfAction readSelfAction = (ReadSelfAction) theEObject;
				Object result = caseReadSelfAction(readSelfAction);
				if (result == null)
					result = caseAction(readSelfAction);
				if (result == null)
					result = caseExecutableNode(readSelfAction);
				if (result == null)
					result = caseActivityNode(readSelfAction);
				if (result == null)
					result = caseRedefinableElement(readSelfAction);
				if (result == null)
					result = caseNamedElement(readSelfAction);
				if (result == null)
					result = caseElement(readSelfAction);
				if (result == null)
					result = caseEModelElement(readSelfAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.STRUCTURAL_FEATURE_ACTION : {
				StructuralFeatureAction structuralFeatureAction = (StructuralFeatureAction) theEObject;
				Object result = caseStructuralFeatureAction(structuralFeatureAction);
				if (result == null)
					result = caseAction(structuralFeatureAction);
				if (result == null)
					result = caseExecutableNode(structuralFeatureAction);
				if (result == null)
					result = caseActivityNode(structuralFeatureAction);
				if (result == null)
					result = caseRedefinableElement(structuralFeatureAction);
				if (result == null)
					result = caseNamedElement(structuralFeatureAction);
				if (result == null)
					result = caseElement(structuralFeatureAction);
				if (result == null)
					result = caseEModelElement(structuralFeatureAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_STRUCTURAL_FEATURE_ACTION : {
				ReadStructuralFeatureAction readStructuralFeatureAction = (ReadStructuralFeatureAction) theEObject;
				Object result = caseReadStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null)
					result = caseStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null)
					result = caseAction(readStructuralFeatureAction);
				if (result == null)
					result = caseExecutableNode(readStructuralFeatureAction);
				if (result == null)
					result = caseActivityNode(readStructuralFeatureAction);
				if (result == null)
					result = caseRedefinableElement(readStructuralFeatureAction);
				if (result == null)
					result = caseNamedElement(readStructuralFeatureAction);
				if (result == null)
					result = caseElement(readStructuralFeatureAction);
				if (result == null)
					result = caseEModelElement(readStructuralFeatureAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.WRITE_STRUCTURAL_FEATURE_ACTION : {
				WriteStructuralFeatureAction writeStructuralFeatureAction = (WriteStructuralFeatureAction) theEObject;
				Object result = caseWriteStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null)
					result = caseStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null)
					result = caseAction(writeStructuralFeatureAction);
				if (result == null)
					result = caseExecutableNode(writeStructuralFeatureAction);
				if (result == null)
					result = caseActivityNode(writeStructuralFeatureAction);
				if (result == null)
					result = caseRedefinableElement(writeStructuralFeatureAction);
				if (result == null)
					result = caseNamedElement(writeStructuralFeatureAction);
				if (result == null)
					result = caseElement(writeStructuralFeatureAction);
				if (result == null)
					result = caseEModelElement(writeStructuralFeatureAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CLEAR_STRUCTURAL_FEATURE_ACTION : {
				ClearStructuralFeatureAction clearStructuralFeatureAction = (ClearStructuralFeatureAction) theEObject;
				Object result = caseClearStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null)
					result = caseStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null)
					result = caseAction(clearStructuralFeatureAction);
				if (result == null)
					result = caseExecutableNode(clearStructuralFeatureAction);
				if (result == null)
					result = caseActivityNode(clearStructuralFeatureAction);
				if (result == null)
					result = caseRedefinableElement(clearStructuralFeatureAction);
				if (result == null)
					result = caseNamedElement(clearStructuralFeatureAction);
				if (result == null)
					result = caseElement(clearStructuralFeatureAction);
				if (result == null)
					result = caseEModelElement(clearStructuralFeatureAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION : {
				RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction = (RemoveStructuralFeatureValueAction) theEObject;
				Object result = caseRemoveStructuralFeatureValueAction(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseWriteStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseAction(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseExecutableNode(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseActivityNode(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseRedefinableElement(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseNamedElement(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseElement(removeStructuralFeatureValueAction);
				if (result == null)
					result = caseEModelElement(removeStructuralFeatureValueAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION : {
				AddStructuralFeatureValueAction addStructuralFeatureValueAction = (AddStructuralFeatureValueAction) theEObject;
				Object result = caseAddStructuralFeatureValueAction(addStructuralFeatureValueAction);
				if (result == null)
					result = caseWriteStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null)
					result = caseStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null)
					result = caseAction(addStructuralFeatureValueAction);
				if (result == null)
					result = caseExecutableNode(addStructuralFeatureValueAction);
				if (result == null)
					result = caseActivityNode(addStructuralFeatureValueAction);
				if (result == null)
					result = caseRedefinableElement(addStructuralFeatureValueAction);
				if (result == null)
					result = caseNamedElement(addStructuralFeatureValueAction);
				if (result == null)
					result = caseElement(addStructuralFeatureValueAction);
				if (result == null)
					result = caseEModelElement(addStructuralFeatureValueAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LINK_ACTION : {
				LinkAction linkAction = (LinkAction) theEObject;
				Object result = caseLinkAction(linkAction);
				if (result == null)
					result = caseAction(linkAction);
				if (result == null)
					result = caseExecutableNode(linkAction);
				if (result == null)
					result = caseActivityNode(linkAction);
				if (result == null)
					result = caseRedefinableElement(linkAction);
				if (result == null)
					result = caseNamedElement(linkAction);
				if (result == null)
					result = caseElement(linkAction);
				if (result == null)
					result = caseEModelElement(linkAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LINK_END_DATA : {
				LinkEndData linkEndData = (LinkEndData) theEObject;
				Object result = caseLinkEndData(linkEndData);
				if (result == null)
					result = caseElement(linkEndData);
				if (result == null)
					result = caseEModelElement(linkEndData);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.QUALIFIER_VALUE : {
				QualifierValue qualifierValue = (QualifierValue) theEObject;
				Object result = caseQualifierValue(qualifierValue);
				if (result == null)
					result = caseElement(qualifierValue);
				if (result == null)
					result = caseEModelElement(qualifierValue);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_LINK_ACTION : {
				ReadLinkAction readLinkAction = (ReadLinkAction) theEObject;
				Object result = caseReadLinkAction(readLinkAction);
				if (result == null)
					result = caseLinkAction(readLinkAction);
				if (result == null)
					result = caseAction(readLinkAction);
				if (result == null)
					result = caseExecutableNode(readLinkAction);
				if (result == null)
					result = caseActivityNode(readLinkAction);
				if (result == null)
					result = caseRedefinableElement(readLinkAction);
				if (result == null)
					result = caseNamedElement(readLinkAction);
				if (result == null)
					result = caseElement(readLinkAction);
				if (result == null)
					result = caseEModelElement(readLinkAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LINK_END_CREATION_DATA : {
				LinkEndCreationData linkEndCreationData = (LinkEndCreationData) theEObject;
				Object result = caseLinkEndCreationData(linkEndCreationData);
				if (result == null)
					result = caseLinkEndData(linkEndCreationData);
				if (result == null)
					result = caseElement(linkEndCreationData);
				if (result == null)
					result = caseEModelElement(linkEndCreationData);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CREATE_LINK_ACTION : {
				CreateLinkAction createLinkAction = (CreateLinkAction) theEObject;
				Object result = caseCreateLinkAction(createLinkAction);
				if (result == null)
					result = caseWriteLinkAction(createLinkAction);
				if (result == null)
					result = caseLinkAction(createLinkAction);
				if (result == null)
					result = caseAction(createLinkAction);
				if (result == null)
					result = caseExecutableNode(createLinkAction);
				if (result == null)
					result = caseActivityNode(createLinkAction);
				if (result == null)
					result = caseRedefinableElement(createLinkAction);
				if (result == null)
					result = caseNamedElement(createLinkAction);
				if (result == null)
					result = caseElement(createLinkAction);
				if (result == null)
					result = caseEModelElement(createLinkAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.WRITE_LINK_ACTION : {
				WriteLinkAction writeLinkAction = (WriteLinkAction) theEObject;
				Object result = caseWriteLinkAction(writeLinkAction);
				if (result == null)
					result = caseLinkAction(writeLinkAction);
				if (result == null)
					result = caseAction(writeLinkAction);
				if (result == null)
					result = caseExecutableNode(writeLinkAction);
				if (result == null)
					result = caseActivityNode(writeLinkAction);
				if (result == null)
					result = caseRedefinableElement(writeLinkAction);
				if (result == null)
					result = caseNamedElement(writeLinkAction);
				if (result == null)
					result = caseElement(writeLinkAction);
				if (result == null)
					result = caseEModelElement(writeLinkAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DESTROY_LINK_ACTION : {
				DestroyLinkAction destroyLinkAction = (DestroyLinkAction) theEObject;
				Object result = caseDestroyLinkAction(destroyLinkAction);
				if (result == null)
					result = caseWriteLinkAction(destroyLinkAction);
				if (result == null)
					result = caseLinkAction(destroyLinkAction);
				if (result == null)
					result = caseAction(destroyLinkAction);
				if (result == null)
					result = caseExecutableNode(destroyLinkAction);
				if (result == null)
					result = caseActivityNode(destroyLinkAction);
				if (result == null)
					result = caseRedefinableElement(destroyLinkAction);
				if (result == null)
					result = caseNamedElement(destroyLinkAction);
				if (result == null)
					result = caseElement(destroyLinkAction);
				if (result == null)
					result = caseEModelElement(destroyLinkAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LINK_END_DESTRUCTION_DATA : {
				LinkEndDestructionData linkEndDestructionData = (LinkEndDestructionData) theEObject;
				Object result = caseLinkEndDestructionData(linkEndDestructionData);
				if (result == null)
					result = caseLinkEndData(linkEndDestructionData);
				if (result == null)
					result = caseElement(linkEndDestructionData);
				if (result == null)
					result = caseEModelElement(linkEndDestructionData);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CLEAR_ASSOCIATION_ACTION : {
				ClearAssociationAction clearAssociationAction = (ClearAssociationAction) theEObject;
				Object result = caseClearAssociationAction(clearAssociationAction);
				if (result == null)
					result = caseAction(clearAssociationAction);
				if (result == null)
					result = caseExecutableNode(clearAssociationAction);
				if (result == null)
					result = caseActivityNode(clearAssociationAction);
				if (result == null)
					result = caseRedefinableElement(clearAssociationAction);
				if (result == null)
					result = caseNamedElement(clearAssociationAction);
				if (result == null)
					result = caseElement(clearAssociationAction);
				if (result == null)
					result = caseEModelElement(clearAssociationAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.BROADCAST_SIGNAL_ACTION : {
				BroadcastSignalAction broadcastSignalAction = (BroadcastSignalAction) theEObject;
				Object result = caseBroadcastSignalAction(broadcastSignalAction);
				if (result == null)
					result = caseInvocationAction(broadcastSignalAction);
				if (result == null)
					result = caseAction(broadcastSignalAction);
				if (result == null)
					result = caseExecutableNode(broadcastSignalAction);
				if (result == null)
					result = caseActivityNode(broadcastSignalAction);
				if (result == null)
					result = caseRedefinableElement(broadcastSignalAction);
				if (result == null)
					result = caseNamedElement(broadcastSignalAction);
				if (result == null)
					result = caseElement(broadcastSignalAction);
				if (result == null)
					result = caseEModelElement(broadcastSignalAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.SEND_OBJECT_ACTION : {
				SendObjectAction sendObjectAction = (SendObjectAction) theEObject;
				Object result = caseSendObjectAction(sendObjectAction);
				if (result == null)
					result = caseInvocationAction(sendObjectAction);
				if (result == null)
					result = caseAction(sendObjectAction);
				if (result == null)
					result = caseExecutableNode(sendObjectAction);
				if (result == null)
					result = caseActivityNode(sendObjectAction);
				if (result == null)
					result = caseRedefinableElement(sendObjectAction);
				if (result == null)
					result = caseNamedElement(sendObjectAction);
				if (result == null)
					result = caseElement(sendObjectAction);
				if (result == null)
					result = caseEModelElement(sendObjectAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.VALUE_SPECIFICATION_ACTION : {
				ValueSpecificationAction valueSpecificationAction = (ValueSpecificationAction) theEObject;
				Object result = caseValueSpecificationAction(valueSpecificationAction);
				if (result == null)
					result = caseAction(valueSpecificationAction);
				if (result == null)
					result = caseExecutableNode(valueSpecificationAction);
				if (result == null)
					result = caseActivityNode(valueSpecificationAction);
				if (result == null)
					result = caseRedefinableElement(valueSpecificationAction);
				if (result == null)
					result = caseNamedElement(valueSpecificationAction);
				if (result == null)
					result = caseElement(valueSpecificationAction);
				if (result == null)
					result = caseEModelElement(valueSpecificationAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TIME_EXPRESSION : {
				TimeExpression timeExpression = (TimeExpression) theEObject;
				Object result = caseTimeExpression(timeExpression);
				if (result == null)
					result = caseValueSpecification(timeExpression);
				if (result == null)
					result = casePackageableElement(timeExpression);
				if (result == null)
					result = caseTypedElement(timeExpression);
				if (result == null)
					result = caseNamedElement(timeExpression);
				if (result == null)
					result = caseParameterableElement(timeExpression);
				if (result == null)
					result = caseElement(timeExpression);
				if (result == null)
					result = caseEModelElement(timeExpression);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OBSERVATION : {
				Observation observation = (Observation) theEObject;
				Object result = caseObservation(observation);
				if (result == null)
					result = casePackageableElement(observation);
				if (result == null)
					result = caseNamedElement(observation);
				if (result == null)
					result = caseParameterableElement(observation);
				if (result == null)
					result = caseElement(observation);
				if (result == null)
					result = caseEModelElement(observation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DURATION : {
				Duration duration = (Duration) theEObject;
				Object result = caseDuration(duration);
				if (result == null)
					result = caseValueSpecification(duration);
				if (result == null)
					result = casePackageableElement(duration);
				if (result == null)
					result = caseTypedElement(duration);
				if (result == null)
					result = caseNamedElement(duration);
				if (result == null)
					result = caseParameterableElement(duration);
				if (result == null)
					result = caseElement(duration);
				if (result == null)
					result = caseEModelElement(duration);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DURATION_INTERVAL : {
				DurationInterval durationInterval = (DurationInterval) theEObject;
				Object result = caseDurationInterval(durationInterval);
				if (result == null)
					result = caseInterval(durationInterval);
				if (result == null)
					result = caseValueSpecification(durationInterval);
				if (result == null)
					result = casePackageableElement(durationInterval);
				if (result == null)
					result = caseTypedElement(durationInterval);
				if (result == null)
					result = caseNamedElement(durationInterval);
				if (result == null)
					result = caseParameterableElement(durationInterval);
				if (result == null)
					result = caseElement(durationInterval);
				if (result == null)
					result = caseEModelElement(durationInterval);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERVAL : {
				Interval interval = (Interval) theEObject;
				Object result = caseInterval(interval);
				if (result == null)
					result = caseValueSpecification(interval);
				if (result == null)
					result = casePackageableElement(interval);
				if (result == null)
					result = caseTypedElement(interval);
				if (result == null)
					result = caseNamedElement(interval);
				if (result == null)
					result = caseParameterableElement(interval);
				if (result == null)
					result = caseElement(interval);
				if (result == null)
					result = caseEModelElement(interval);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TIME_CONSTRAINT : {
				TimeConstraint timeConstraint = (TimeConstraint) theEObject;
				Object result = caseTimeConstraint(timeConstraint);
				if (result == null)
					result = caseIntervalConstraint(timeConstraint);
				if (result == null)
					result = caseConstraint(timeConstraint);
				if (result == null)
					result = casePackageableElement(timeConstraint);
				if (result == null)
					result = caseNamedElement(timeConstraint);
				if (result == null)
					result = caseParameterableElement(timeConstraint);
				if (result == null)
					result = caseElement(timeConstraint);
				if (result == null)
					result = caseEModelElement(timeConstraint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INTERVAL_CONSTRAINT : {
				IntervalConstraint intervalConstraint = (IntervalConstraint) theEObject;
				Object result = caseIntervalConstraint(intervalConstraint);
				if (result == null)
					result = caseConstraint(intervalConstraint);
				if (result == null)
					result = casePackageableElement(intervalConstraint);
				if (result == null)
					result = caseNamedElement(intervalConstraint);
				if (result == null)
					result = caseParameterableElement(intervalConstraint);
				if (result == null)
					result = caseElement(intervalConstraint);
				if (result == null)
					result = caseEModelElement(intervalConstraint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TIME_INTERVAL : {
				TimeInterval timeInterval = (TimeInterval) theEObject;
				Object result = caseTimeInterval(timeInterval);
				if (result == null)
					result = caseInterval(timeInterval);
				if (result == null)
					result = caseValueSpecification(timeInterval);
				if (result == null)
					result = casePackageableElement(timeInterval);
				if (result == null)
					result = caseTypedElement(timeInterval);
				if (result == null)
					result = caseNamedElement(timeInterval);
				if (result == null)
					result = caseParameterableElement(timeInterval);
				if (result == null)
					result = caseElement(timeInterval);
				if (result == null)
					result = caseEModelElement(timeInterval);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DURATION_CONSTRAINT : {
				DurationConstraint durationConstraint = (DurationConstraint) theEObject;
				Object result = caseDurationConstraint(durationConstraint);
				if (result == null)
					result = caseIntervalConstraint(durationConstraint);
				if (result == null)
					result = caseConstraint(durationConstraint);
				if (result == null)
					result = casePackageableElement(durationConstraint);
				if (result == null)
					result = caseNamedElement(durationConstraint);
				if (result == null)
					result = caseParameterableElement(durationConstraint);
				if (result == null)
					result = caseElement(durationConstraint);
				if (result == null)
					result = caseEModelElement(durationConstraint);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TIME_OBSERVATION : {
				TimeObservation timeObservation = (TimeObservation) theEObject;
				Object result = caseTimeObservation(timeObservation);
				if (result == null)
					result = caseObservation(timeObservation);
				if (result == null)
					result = casePackageableElement(timeObservation);
				if (result == null)
					result = caseNamedElement(timeObservation);
				if (result == null)
					result = caseParameterableElement(timeObservation);
				if (result == null)
					result = caseElement(timeObservation);
				if (result == null)
					result = caseEModelElement(timeObservation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DURATION_OBSERVATION : {
				DurationObservation durationObservation = (DurationObservation) theEObject;
				Object result = caseDurationObservation(durationObservation);
				if (result == null)
					result = caseObservation(durationObservation);
				if (result == null)
					result = casePackageableElement(durationObservation);
				if (result == null)
					result = caseNamedElement(durationObservation);
				if (result == null)
					result = caseParameterableElement(durationObservation);
				if (result == null)
					result = caseElement(durationObservation);
				if (result == null)
					result = caseEModelElement(durationObservation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.FINAL_STATE : {
				FinalState finalState = (FinalState) theEObject;
				Object result = caseFinalState(finalState);
				if (result == null)
					result = caseState(finalState);
				if (result == null)
					result = caseNamespace(finalState);
				if (result == null)
					result = caseRedefinableElement(finalState);
				if (result == null)
					result = caseVertex(finalState);
				if (result == null)
					result = caseNamedElement(finalState);
				if (result == null)
					result = caseElement(finalState);
				if (result == null)
					result = caseEModelElement(finalState);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.TIME_EVENT : {
				TimeEvent timeEvent = (TimeEvent) theEObject;
				Object result = caseTimeEvent(timeEvent);
				if (result == null)
					result = caseEvent(timeEvent);
				if (result == null)
					result = casePackageableElement(timeEvent);
				if (result == null)
					result = caseNamedElement(timeEvent);
				if (result == null)
					result = caseParameterableElement(timeEvent);
				if (result == null)
					result = caseElement(timeEvent);
				if (result == null)
					result = caseEModelElement(timeEvent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.VARIABLE_ACTION : {
				VariableAction variableAction = (VariableAction) theEObject;
				Object result = caseVariableAction(variableAction);
				if (result == null)
					result = caseAction(variableAction);
				if (result == null)
					result = caseExecutableNode(variableAction);
				if (result == null)
					result = caseActivityNode(variableAction);
				if (result == null)
					result = caseRedefinableElement(variableAction);
				if (result == null)
					result = caseNamedElement(variableAction);
				if (result == null)
					result = caseElement(variableAction);
				if (result == null)
					result = caseEModelElement(variableAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_VARIABLE_ACTION : {
				ReadVariableAction readVariableAction = (ReadVariableAction) theEObject;
				Object result = caseReadVariableAction(readVariableAction);
				if (result == null)
					result = caseVariableAction(readVariableAction);
				if (result == null)
					result = caseAction(readVariableAction);
				if (result == null)
					result = caseExecutableNode(readVariableAction);
				if (result == null)
					result = caseActivityNode(readVariableAction);
				if (result == null)
					result = caseRedefinableElement(readVariableAction);
				if (result == null)
					result = caseNamedElement(readVariableAction);
				if (result == null)
					result = caseElement(readVariableAction);
				if (result == null)
					result = caseEModelElement(readVariableAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.WRITE_VARIABLE_ACTION : {
				WriteVariableAction writeVariableAction = (WriteVariableAction) theEObject;
				Object result = caseWriteVariableAction(writeVariableAction);
				if (result == null)
					result = caseVariableAction(writeVariableAction);
				if (result == null)
					result = caseAction(writeVariableAction);
				if (result == null)
					result = caseExecutableNode(writeVariableAction);
				if (result == null)
					result = caseActivityNode(writeVariableAction);
				if (result == null)
					result = caseRedefinableElement(writeVariableAction);
				if (result == null)
					result = caseNamedElement(writeVariableAction);
				if (result == null)
					result = caseElement(writeVariableAction);
				if (result == null)
					result = caseEModelElement(writeVariableAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CLEAR_VARIABLE_ACTION : {
				ClearVariableAction clearVariableAction = (ClearVariableAction) theEObject;
				Object result = caseClearVariableAction(clearVariableAction);
				if (result == null)
					result = caseVariableAction(clearVariableAction);
				if (result == null)
					result = caseAction(clearVariableAction);
				if (result == null)
					result = caseExecutableNode(clearVariableAction);
				if (result == null)
					result = caseActivityNode(clearVariableAction);
				if (result == null)
					result = caseRedefinableElement(clearVariableAction);
				if (result == null)
					result = caseNamedElement(clearVariableAction);
				if (result == null)
					result = caseElement(clearVariableAction);
				if (result == null)
					result = caseEModelElement(clearVariableAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ADD_VARIABLE_VALUE_ACTION : {
				AddVariableValueAction addVariableValueAction = (AddVariableValueAction) theEObject;
				Object result = caseAddVariableValueAction(addVariableValueAction);
				if (result == null)
					result = caseWriteVariableAction(addVariableValueAction);
				if (result == null)
					result = caseVariableAction(addVariableValueAction);
				if (result == null)
					result = caseAction(addVariableValueAction);
				if (result == null)
					result = caseExecutableNode(addVariableValueAction);
				if (result == null)
					result = caseActivityNode(addVariableValueAction);
				if (result == null)
					result = caseRedefinableElement(addVariableValueAction);
				if (result == null)
					result = caseNamedElement(addVariableValueAction);
				if (result == null)
					result = caseElement(addVariableValueAction);
				if (result == null)
					result = caseEModelElement(addVariableValueAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REMOVE_VARIABLE_VALUE_ACTION : {
				RemoveVariableValueAction removeVariableValueAction = (RemoveVariableValueAction) theEObject;
				Object result = caseRemoveVariableValueAction(removeVariableValueAction);
				if (result == null)
					result = caseWriteVariableAction(removeVariableValueAction);
				if (result == null)
					result = caseVariableAction(removeVariableValueAction);
				if (result == null)
					result = caseAction(removeVariableValueAction);
				if (result == null)
					result = caseExecutableNode(removeVariableValueAction);
				if (result == null)
					result = caseActivityNode(removeVariableValueAction);
				if (result == null)
					result = caseRedefinableElement(removeVariableValueAction);
				if (result == null)
					result = caseNamedElement(removeVariableValueAction);
				if (result == null)
					result = caseElement(removeVariableValueAction);
				if (result == null)
					result = caseEModelElement(removeVariableValueAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.RAISE_EXCEPTION_ACTION : {
				RaiseExceptionAction raiseExceptionAction = (RaiseExceptionAction) theEObject;
				Object result = caseRaiseExceptionAction(raiseExceptionAction);
				if (result == null)
					result = caseAction(raiseExceptionAction);
				if (result == null)
					result = caseExecutableNode(raiseExceptionAction);
				if (result == null)
					result = caseActivityNode(raiseExceptionAction);
				if (result == null)
					result = caseRedefinableElement(raiseExceptionAction);
				if (result == null)
					result = caseNamedElement(raiseExceptionAction);
				if (result == null)
					result = caseElement(raiseExceptionAction);
				if (result == null)
					result = caseEModelElement(raiseExceptionAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACTION_INPUT_PIN : {
				ActionInputPin actionInputPin = (ActionInputPin) theEObject;
				Object result = caseActionInputPin(actionInputPin);
				if (result == null)
					result = caseInputPin(actionInputPin);
				if (result == null)
					result = casePin(actionInputPin);
				if (result == null)
					result = caseObjectNode(actionInputPin);
				if (result == null)
					result = caseMultiplicityElement(actionInputPin);
				if (result == null)
					result = caseActivityNode(actionInputPin);
				if (result == null)
					result = caseTypedElement(actionInputPin);
				if (result == null)
					result = caseElement(actionInputPin);
				if (result == null)
					result = caseRedefinableElement(actionInputPin);
				if (result == null)
					result = caseNamedElement(actionInputPin);
				if (result == null)
					result = caseEModelElement(actionInputPin);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INFORMATION_ITEM : {
				InformationItem informationItem = (InformationItem) theEObject;
				Object result = caseInformationItem(informationItem);
				if (result == null)
					result = caseClassifier(informationItem);
				if (result == null)
					result = caseNamespace(informationItem);
				if (result == null)
					result = caseRedefinableElement(informationItem);
				if (result == null)
					result = caseType(informationItem);
				if (result == null)
					result = caseTemplateableElement(informationItem);
				if (result == null)
					result = caseNamedElement(informationItem);
				if (result == null)
					result = casePackageableElement(informationItem);
				if (result == null)
					result = caseElement(informationItem);
				if (result == null)
					result = caseParameterableElement(informationItem);
				if (result == null)
					result = caseEModelElement(informationItem);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.INFORMATION_FLOW : {
				InformationFlow informationFlow = (InformationFlow) theEObject;
				Object result = caseInformationFlow(informationFlow);
				if (result == null)
					result = casePackageableElement(informationFlow);
				if (result == null)
					result = caseDirectedRelationship(informationFlow);
				if (result == null)
					result = caseNamedElement(informationFlow);
				if (result == null)
					result = caseParameterableElement(informationFlow);
				if (result == null)
					result = caseRelationship(informationFlow);
				if (result == null)
					result = caseElement(informationFlow);
				if (result == null)
					result = caseEModelElement(informationFlow);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_EXTENT_ACTION : {
				ReadExtentAction readExtentAction = (ReadExtentAction) theEObject;
				Object result = caseReadExtentAction(readExtentAction);
				if (result == null)
					result = caseAction(readExtentAction);
				if (result == null)
					result = caseExecutableNode(readExtentAction);
				if (result == null)
					result = caseActivityNode(readExtentAction);
				if (result == null)
					result = caseRedefinableElement(readExtentAction);
				if (result == null)
					result = caseNamedElement(readExtentAction);
				if (result == null)
					result = caseElement(readExtentAction);
				if (result == null)
					result = caseEModelElement(readExtentAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.RECLASSIFY_OBJECT_ACTION : {
				ReclassifyObjectAction reclassifyObjectAction = (ReclassifyObjectAction) theEObject;
				Object result = caseReclassifyObjectAction(reclassifyObjectAction);
				if (result == null)
					result = caseAction(reclassifyObjectAction);
				if (result == null)
					result = caseExecutableNode(reclassifyObjectAction);
				if (result == null)
					result = caseActivityNode(reclassifyObjectAction);
				if (result == null)
					result = caseRedefinableElement(reclassifyObjectAction);
				if (result == null)
					result = caseNamedElement(reclassifyObjectAction);
				if (result == null)
					result = caseElement(reclassifyObjectAction);
				if (result == null)
					result = caseEModelElement(reclassifyObjectAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_IS_CLASSIFIED_OBJECT_ACTION : {
				ReadIsClassifiedObjectAction readIsClassifiedObjectAction = (ReadIsClassifiedObjectAction) theEObject;
				Object result = caseReadIsClassifiedObjectAction(readIsClassifiedObjectAction);
				if (result == null)
					result = caseAction(readIsClassifiedObjectAction);
				if (result == null)
					result = caseExecutableNode(readIsClassifiedObjectAction);
				if (result == null)
					result = caseActivityNode(readIsClassifiedObjectAction);
				if (result == null)
					result = caseRedefinableElement(readIsClassifiedObjectAction);
				if (result == null)
					result = caseNamedElement(readIsClassifiedObjectAction);
				if (result == null)
					result = caseElement(readIsClassifiedObjectAction);
				if (result == null)
					result = caseEModelElement(readIsClassifiedObjectAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.START_CLASSIFIER_BEHAVIOR_ACTION : {
				StartClassifierBehaviorAction startClassifierBehaviorAction = (StartClassifierBehaviorAction) theEObject;
				Object result = caseStartClassifierBehaviorAction(startClassifierBehaviorAction);
				if (result == null)
					result = caseAction(startClassifierBehaviorAction);
				if (result == null)
					result = caseExecutableNode(startClassifierBehaviorAction);
				if (result == null)
					result = caseActivityNode(startClassifierBehaviorAction);
				if (result == null)
					result = caseRedefinableElement(startClassifierBehaviorAction);
				if (result == null)
					result = caseNamedElement(startClassifierBehaviorAction);
				if (result == null)
					result = caseElement(startClassifierBehaviorAction);
				if (result == null)
					result = caseEModelElement(startClassifierBehaviorAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_LINK_OBJECT_END_ACTION : {
				ReadLinkObjectEndAction readLinkObjectEndAction = (ReadLinkObjectEndAction) theEObject;
				Object result = caseReadLinkObjectEndAction(readLinkObjectEndAction);
				if (result == null)
					result = caseAction(readLinkObjectEndAction);
				if (result == null)
					result = caseExecutableNode(readLinkObjectEndAction);
				if (result == null)
					result = caseActivityNode(readLinkObjectEndAction);
				if (result == null)
					result = caseRedefinableElement(readLinkObjectEndAction);
				if (result == null)
					result = caseNamedElement(readLinkObjectEndAction);
				if (result == null)
					result = caseElement(readLinkObjectEndAction);
				if (result == null)
					result = caseEModelElement(readLinkObjectEndAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION : {
				ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction = (ReadLinkObjectEndQualifierAction) theEObject;
				Object result = caseReadLinkObjectEndQualifierAction(readLinkObjectEndQualifierAction);
				if (result == null)
					result = caseAction(readLinkObjectEndQualifierAction);
				if (result == null)
					result = caseExecutableNode(readLinkObjectEndQualifierAction);
				if (result == null)
					result = caseActivityNode(readLinkObjectEndQualifierAction);
				if (result == null)
					result = caseRedefinableElement(readLinkObjectEndQualifierAction);
				if (result == null)
					result = caseNamedElement(readLinkObjectEndQualifierAction);
				if (result == null)
					result = caseElement(readLinkObjectEndQualifierAction);
				if (result == null)
					result = caseEModelElement(readLinkObjectEndQualifierAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CREATE_LINK_OBJECT_ACTION : {
				CreateLinkObjectAction createLinkObjectAction = (CreateLinkObjectAction) theEObject;
				Object result = caseCreateLinkObjectAction(createLinkObjectAction);
				if (result == null)
					result = caseCreateLinkAction(createLinkObjectAction);
				if (result == null)
					result = caseWriteLinkAction(createLinkObjectAction);
				if (result == null)
					result = caseLinkAction(createLinkObjectAction);
				if (result == null)
					result = caseAction(createLinkObjectAction);
				if (result == null)
					result = caseExecutableNode(createLinkObjectAction);
				if (result == null)
					result = caseActivityNode(createLinkObjectAction);
				if (result == null)
					result = caseRedefinableElement(createLinkObjectAction);
				if (result == null)
					result = caseNamedElement(createLinkObjectAction);
				if (result == null)
					result = caseElement(createLinkObjectAction);
				if (result == null)
					result = caseEModelElement(createLinkObjectAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACCEPT_EVENT_ACTION : {
				AcceptEventAction acceptEventAction = (AcceptEventAction) theEObject;
				Object result = caseAcceptEventAction(acceptEventAction);
				if (result == null)
					result = caseAction(acceptEventAction);
				if (result == null)
					result = caseExecutableNode(acceptEventAction);
				if (result == null)
					result = caseActivityNode(acceptEventAction);
				if (result == null)
					result = caseRedefinableElement(acceptEventAction);
				if (result == null)
					result = caseNamedElement(acceptEventAction);
				if (result == null)
					result = caseElement(acceptEventAction);
				if (result == null)
					result = caseEModelElement(acceptEventAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ACCEPT_CALL_ACTION : {
				AcceptCallAction acceptCallAction = (AcceptCallAction) theEObject;
				Object result = caseAcceptCallAction(acceptCallAction);
				if (result == null)
					result = caseAcceptEventAction(acceptCallAction);
				if (result == null)
					result = caseAction(acceptCallAction);
				if (result == null)
					result = caseExecutableNode(acceptCallAction);
				if (result == null)
					result = caseActivityNode(acceptCallAction);
				if (result == null)
					result = caseRedefinableElement(acceptCallAction);
				if (result == null)
					result = caseNamedElement(acceptCallAction);
				if (result == null)
					result = caseElement(acceptCallAction);
				if (result == null)
					result = caseEModelElement(acceptCallAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REPLY_ACTION : {
				ReplyAction replyAction = (ReplyAction) theEObject;
				Object result = caseReplyAction(replyAction);
				if (result == null)
					result = caseAction(replyAction);
				if (result == null)
					result = caseExecutableNode(replyAction);
				if (result == null)
					result = caseActivityNode(replyAction);
				if (result == null)
					result = caseRedefinableElement(replyAction);
				if (result == null)
					result = caseNamedElement(replyAction);
				if (result == null)
					result = caseElement(replyAction);
				if (result == null)
					result = caseEModelElement(replyAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UNMARSHALL_ACTION : {
				UnmarshallAction unmarshallAction = (UnmarshallAction) theEObject;
				Object result = caseUnmarshallAction(unmarshallAction);
				if (result == null)
					result = caseAction(unmarshallAction);
				if (result == null)
					result = caseExecutableNode(unmarshallAction);
				if (result == null)
					result = caseActivityNode(unmarshallAction);
				if (result == null)
					result = caseRedefinableElement(unmarshallAction);
				if (result == null)
					result = caseNamedElement(unmarshallAction);
				if (result == null)
					result = caseElement(unmarshallAction);
				if (result == null)
					result = caseEModelElement(unmarshallAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.REDUCE_ACTION : {
				ReduceAction reduceAction = (ReduceAction) theEObject;
				Object result = caseReduceAction(reduceAction);
				if (result == null)
					result = caseAction(reduceAction);
				if (result == null)
					result = caseExecutableNode(reduceAction);
				if (result == null)
					result = caseActivityNode(reduceAction);
				if (result == null)
					result = caseRedefinableElement(reduceAction);
				if (result == null)
					result = caseNamedElement(reduceAction);
				if (result == null)
					result = caseElement(reduceAction);
				if (result == null)
					result = caseEModelElement(reduceAction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.JOIN_NODE : {
				JoinNode joinNode = (JoinNode) theEObject;
				Object result = caseJoinNode(joinNode);
				if (result == null)
					result = caseControlNode(joinNode);
				if (result == null)
					result = caseActivityNode(joinNode);
				if (result == null)
					result = caseRedefinableElement(joinNode);
				if (result == null)
					result = caseNamedElement(joinNode);
				if (result == null)
					result = caseElement(joinNode);
				if (result == null)
					result = caseEModelElement(joinNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.DATA_STORE_NODE : {
				DataStoreNode dataStoreNode = (DataStoreNode) theEObject;
				Object result = caseDataStoreNode(dataStoreNode);
				if (result == null)
					result = caseCentralBufferNode(dataStoreNode);
				if (result == null)
					result = caseObjectNode(dataStoreNode);
				if (result == null)
					result = caseActivityNode(dataStoreNode);
				if (result == null)
					result = caseTypedElement(dataStoreNode);
				if (result == null)
					result = caseRedefinableElement(dataStoreNode);
				if (result == null)
					result = caseNamedElement(dataStoreNode);
				if (result == null)
					result = caseElement(dataStoreNode);
				if (result == null)
					result = caseEModelElement(dataStoreNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.OBJECT_FLOW : {
				ObjectFlow objectFlow = (ObjectFlow) theEObject;
				Object result = caseObjectFlow(objectFlow);
				if (result == null)
					result = caseActivityEdge(objectFlow);
				if (result == null)
					result = caseRedefinableElement(objectFlow);
				if (result == null)
					result = caseNamedElement(objectFlow);
				if (result == null)
					result = caseElement(objectFlow);
				if (result == null)
					result = caseEModelElement(objectFlow);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CONDITIONAL_NODE : {
				ConditionalNode conditionalNode = (ConditionalNode) theEObject;
				Object result = caseConditionalNode(conditionalNode);
				if (result == null)
					result = caseStructuredActivityNode(conditionalNode);
				if (result == null)
					result = caseAction(conditionalNode);
				if (result == null)
					result = caseNamespace(conditionalNode);
				if (result == null)
					result = caseActivityGroup(conditionalNode);
				if (result == null)
					result = caseExecutableNode(conditionalNode);
				if (result == null)
					result = caseNamedElement(conditionalNode);
				if (result == null)
					result = caseElement(conditionalNode);
				if (result == null)
					result = caseActivityNode(conditionalNode);
				if (result == null)
					result = caseEModelElement(conditionalNode);
				if (result == null)
					result = caseRedefinableElement(conditionalNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.CLAUSE : {
				Clause clause = (Clause) theEObject;
				Object result = caseClause(clause);
				if (result == null)
					result = caseElement(clause);
				if (result == null)
					result = caseEModelElement(clause);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.LOOP_NODE : {
				LoopNode loopNode = (LoopNode) theEObject;
				Object result = caseLoopNode(loopNode);
				if (result == null)
					result = caseStructuredActivityNode(loopNode);
				if (result == null)
					result = caseAction(loopNode);
				if (result == null)
					result = caseNamespace(loopNode);
				if (result == null)
					result = caseActivityGroup(loopNode);
				if (result == null)
					result = caseExecutableNode(loopNode);
				if (result == null)
					result = caseNamedElement(loopNode);
				if (result == null)
					result = caseElement(loopNode);
				if (result == null)
					result = caseActivityNode(loopNode);
				if (result == null)
					result = caseEModelElement(loopNode);
				if (result == null)
					result = caseRedefinableElement(loopNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXPANSION_NODE : {
				ExpansionNode expansionNode = (ExpansionNode) theEObject;
				Object result = caseExpansionNode(expansionNode);
				if (result == null)
					result = caseObjectNode(expansionNode);
				if (result == null)
					result = caseActivityNode(expansionNode);
				if (result == null)
					result = caseTypedElement(expansionNode);
				if (result == null)
					result = caseRedefinableElement(expansionNode);
				if (result == null)
					result = caseNamedElement(expansionNode);
				if (result == null)
					result = caseElement(expansionNode);
				if (result == null)
					result = caseEModelElement(expansionNode);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.EXPANSION_REGION : {
				ExpansionRegion expansionRegion = (ExpansionRegion) theEObject;
				Object result = caseExpansionRegion(expansionRegion);
				if (result == null)
					result = caseStructuredActivityNode(expansionRegion);
				if (result == null)
					result = caseAction(expansionRegion);
				if (result == null)
					result = caseNamespace(expansionRegion);
				if (result == null)
					result = caseActivityGroup(expansionRegion);
				if (result == null)
					result = caseExecutableNode(expansionRegion);
				if (result == null)
					result = caseNamedElement(expansionRegion);
				if (result == null)
					result = caseElement(expansionRegion);
				if (result == null)
					result = caseActivityNode(expansionRegion);
				if (result == null)
					result = caseEModelElement(expansionRegion);
				if (result == null)
					result = caseRedefinableElement(expansionRegion);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.PROTOCOL_TRANSITION : {
				ProtocolTransition protocolTransition = (ProtocolTransition) theEObject;
				Object result = caseProtocolTransition(protocolTransition);
				if (result == null)
					result = caseTransition(protocolTransition);
				if (result == null)
					result = caseNamespace(protocolTransition);
				if (result == null)
					result = caseRedefinableElement(protocolTransition);
				if (result == null)
					result = caseNamedElement(protocolTransition);
				if (result == null)
					result = caseElement(protocolTransition);
				if (result == null)
					result = caseEModelElement(protocolTransition);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.ASSOCIATION_CLASS : {
				AssociationClass associationClass = (AssociationClass) theEObject;
				Object result = caseAssociationClass(associationClass);
				if (result == null)
					result = caseClass(associationClass);
				if (result == null)
					result = caseAssociation(associationClass);
				if (result == null)
					result = caseEncapsulatedClassifier(associationClass);
				if (result == null)
					result = caseBehavioredClassifier(associationClass);
				if (result == null)
					result = caseClassifier(associationClass);
				if (result == null)
					result = caseRelationship(associationClass);
				if (result == null)
					result = caseStructuredClassifier(associationClass);
				if (result == null)
					result = caseNamespace(associationClass);
				if (result == null)
					result = caseRedefinableElement(associationClass);
				if (result == null)
					result = caseType(associationClass);
				if (result == null)
					result = caseTemplateableElement(associationClass);
				if (result == null)
					result = caseElement(associationClass);
				if (result == null)
					result = caseNamedElement(associationClass);
				if (result == null)
					result = casePackageableElement(associationClass);
				if (result == null)
					result = caseEModelElement(associationClass);
				if (result == null)
					result = caseParameterableElement(associationClass);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default :
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralSpecification(LiteralSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateSignature(TemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Template Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateBinding(TemplateBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateParameterSubstitution(
			TemplateParameterSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Element Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElementImport(ElementImport object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackageImport(PackageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(org.eclipse.uml2.uml.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Package Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Package Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackageMerge(PackageMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Profile Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Profile Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProfileApplication(ProfileApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStereotype(Stereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClass(org.eclipse.uml2.uml.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUseCase(UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtend(Extend object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extension Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtensionPoint(ExtensionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubstitution(Substitution object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstraction(Abstraction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Opaque Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOpaqueExpression(OpaqueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectorEnd(ConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Deployment Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Deployment Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeploymentTarget(DeploymentTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Deployed Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Deployed Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeployedArtifact(DeployedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Deployment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeploymentSpecification(DeploymentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManifestation(Manifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehavioralFeature(BehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameter Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameterSet(ParameterSet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Reception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReception(Reception object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Protocol State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProtocolStateMachine(ProtocolStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connection Point Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectionPointReference(ConnectionPointReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Pseudostate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePseudostate(Pseudostate object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Protocol Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Protocol Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProtocolConformance(ProtocolConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperationTemplateParameter(
			OperationTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectableElementTemplateParameter(
			ConnectableElementTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Collaboration Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCollaborationUse(CollaborationUse object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCollaboration(Collaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRedefinableTemplateSignature(
			RedefinableTemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassifierTemplateParameter(
			ClassifierTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interface Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterfaceRealization(InterfaceRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtensionEnd(ExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Instance Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceSpecification(InstanceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Instance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Instance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceValue(InstanceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Opaque Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Opaque Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOpaqueBehavior(OpaqueBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Function Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFunctionBehavior(FunctionBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Part Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePartDecomposition(PartDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interaction Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionUse(InteractionUse object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Activity Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityPartition(ActivityPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Activity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityGroup(ActivityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Structured Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructuredActivityNode(StructuredActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterruptibleActivityRegion(
			InterruptibleActivityRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExceptionHandler(ExceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>General Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneralOrdering(GeneralOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOccurrenceSpecification(OccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionOperand(InteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionConstraint(InteractionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutionSpecification(ExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutionOccurrenceSpecification(
			ExecutionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Execution Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Execution Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutionEvent(ExecutionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>State Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStateInvariant(StateInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Action Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionExecutionSpecification(
			ActionExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehaviorExecutionSpecification(
			BehaviorExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Creation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Creation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreationEvent(CreationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Destruction Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Destruction Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDestructionEvent(DestructionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Send Operation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Send Operation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendOperationEvent(SendOperationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMessageEvent(MessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Send Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Send Signal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendSignalEvent(SendSignalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMessageOccurrenceSpecification(
			MessageOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Receive Operation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Receive Operation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReceiveOperationEvent(ReceiveOperationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Receive Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Receive Signal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReceiveSignalEvent(ReceiveSignalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Continuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContinuation(Continuation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConsiderIgnoreFragment(ConsiderIgnoreFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Call Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Call Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallEvent(CallEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Change Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChangeEvent(ChangeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Signal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSignalEvent(SignalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Any Receive Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Any Receive Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnyReceiveEvent(AnyReceiveEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Create Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateObjectAction(CreateObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Destroy Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDestroyObjectAction(DestroyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Test Identity Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTestIdentityAction(TestIdentityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Self Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadSelfAction(ReadSelfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructuralFeatureAction(StructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadStructuralFeatureAction(
			ReadStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWriteStructuralFeatureAction(
			WriteStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClearStructuralFeatureAction(
			ClearStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemoveStructuralFeatureValueAction(
			RemoveStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddStructuralFeatureValueAction(
			AddStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkAction(LinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link End Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkEndData(LinkEndData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Qualifier Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQualifierValue(QualifierValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadLinkAction(ReadLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link End Creation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkEndCreationData(LinkEndCreationData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Create Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateLinkAction(CreateLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Write Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWriteLinkAction(WriteLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Destroy Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Destroy Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDestroyLinkAction(DestroyLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkEndDestructionData(LinkEndDestructionData object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clear Association Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClearAssociationAction(ClearAssociationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBroadcastSignalAction(BroadcastSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Invocation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInvocationAction(InvocationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Send Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendObjectAction(SendObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Value Specification Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueSpecificationAction(ValueSpecificationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Value Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValuePin(ValuePin object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Duration Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Duration Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDurationInterval(DurationInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeConstraint(TimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interval Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interval Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntervalConstraint(IntervalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Duration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDurationConstraint(DurationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Time Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Time Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeObservation(TimeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Duration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDurationObservation(DurationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOpaqueAction(OpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallAction(CallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Call Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallOperationAction(CallOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Call Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallBehaviorAction(CallBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Information Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInformationItem(InformationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInformationFlow(InformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableAction(VariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadVariableAction(ReadVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Write Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWriteVariableAction(WriteVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clear Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clear Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClearVariableAction(ClearVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddVariableValueAction(AddVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemoveVariableValueAction(RemoveVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Raise Exception Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRaiseExceptionAction(RaiseExceptionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Action Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionInputPin(ActionInputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Extent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadExtentAction(ReadExtentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReclassifyObjectAction(ReclassifyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadIsClassifiedObjectAction(
			ReadIsClassifiedObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStartClassifierBehaviorAction(
			StartClassifierBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadLinkObjectEndQualifierAction(
			ReadLinkObjectEndQualifierAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Create Link Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateLinkObjectAction(CreateLinkObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Accept Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAcceptEventAction(AcceptEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Accept Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAcceptCallAction(AcceptCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Reply Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReplyAction(ReplyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unmarshall Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnmarshallAction(UnmarshallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Reduce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReduceAction(ReduceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityParameterNode(ActivityParameterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Central Buffer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Central Buffer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCentralBufferNode(CentralBufferNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Data Store Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Data Store Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataStoreNode(DataStoreNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectFlow(ObjectFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSequenceNode(SequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expansion Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpansionNode(ExpansionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expansion Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpansionRegion(ExpansionRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Component Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Component Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentRealization(ComponentRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Communication Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommunicationPath(CommunicationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeEvent(TimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Protocol Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProtocolTransition(ProtocolTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociationClass(AssociationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //UMLSwitch
