/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id: UML2EditTests.java,v 1.1 2005/04/04 20:02:10 khussey Exp $
 */
package org.eclipse.uml2.edit.tests;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import org.eclipse.uml2.provider.tests.AbstractionItemProviderTest;
import org.eclipse.uml2.provider.tests.AcceptCallActionItemProviderTest;
import org.eclipse.uml2.provider.tests.AcceptEventActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ActivityFinalNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ActivityItemProviderTest;
import org.eclipse.uml2.provider.tests.ActivityParameterNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ActivityPartitionItemProviderTest;
import org.eclipse.uml2.provider.tests.ActorItemProviderTest;
import org.eclipse.uml2.provider.tests.AddStructuralFeatureValueActionItemProviderTest;
import org.eclipse.uml2.provider.tests.AddVariableValueActionItemProviderTest;
import org.eclipse.uml2.provider.tests.AnyTriggerItemProviderTest;
import org.eclipse.uml2.provider.tests.ApplyFunctionActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ArtifactItemProviderTest;
import org.eclipse.uml2.provider.tests.AssociationClassItemProviderTest;
import org.eclipse.uml2.provider.tests.AssociationItemProviderTest;
import org.eclipse.uml2.provider.tests.BroadcastSignalActionItemProviderTest;
import org.eclipse.uml2.provider.tests.CallBehaviorActionItemProviderTest;
import org.eclipse.uml2.provider.tests.CallOperationActionItemProviderTest;
import org.eclipse.uml2.provider.tests.CallTriggerItemProviderTest;
import org.eclipse.uml2.provider.tests.CentralBufferNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ChangeTriggerItemProviderTest;
import org.eclipse.uml2.provider.tests.ClassItemProviderTest;
import org.eclipse.uml2.provider.tests.ClassifierTemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.ClauseItemProviderTest;
import org.eclipse.uml2.provider.tests.ClearAssociationActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ClearStructuralFeatureActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ClearVariableActionItemProviderTest;
import org.eclipse.uml2.provider.tests.CollaborationItemProviderTest;
import org.eclipse.uml2.provider.tests.CollaborationOccurrenceItemProviderTest;
import org.eclipse.uml2.provider.tests.CombinedFragmentItemProviderTest;
import org.eclipse.uml2.provider.tests.CommentItemProviderTest;
import org.eclipse.uml2.provider.tests.CommunicationPathItemProviderTest;
import org.eclipse.uml2.provider.tests.ComponentItemProviderTest;
import org.eclipse.uml2.provider.tests.ConditionalNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ConnectableElementTemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.ConnectionPointReferenceItemProviderTest;
import org.eclipse.uml2.provider.tests.ConnectorEndItemProviderTest;
import org.eclipse.uml2.provider.tests.ConnectorItemProviderTest;
import org.eclipse.uml2.provider.tests.ConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.ContinuationItemProviderTest;
import org.eclipse.uml2.provider.tests.ControlFlowItemProviderTest;
import org.eclipse.uml2.provider.tests.CreateLinkActionItemProviderTest;
import org.eclipse.uml2.provider.tests.CreateLinkObjectActionItemProviderTest;
import org.eclipse.uml2.provider.tests.CreateObjectActionItemProviderTest;
import org.eclipse.uml2.provider.tests.DataStoreNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.DataTypeItemProviderTest;
import org.eclipse.uml2.provider.tests.DecisionNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.DependencyItemProviderTest;
import org.eclipse.uml2.provider.tests.DeploymentItemProviderTest;
import org.eclipse.uml2.provider.tests.DeploymentSpecificationItemProviderTest;
import org.eclipse.uml2.provider.tests.DestroyLinkActionItemProviderTest;
import org.eclipse.uml2.provider.tests.DestroyObjectActionItemProviderTest;
import org.eclipse.uml2.provider.tests.DeviceItemProviderTest;
import org.eclipse.uml2.provider.tests.DurationConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.DurationIntervalItemProviderTest;
import org.eclipse.uml2.provider.tests.DurationItemProviderTest;
import org.eclipse.uml2.provider.tests.DurationObservationActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ElementImportItemProviderTest;
import org.eclipse.uml2.provider.tests.EnumerationItemProviderTest;
import org.eclipse.uml2.provider.tests.EnumerationLiteralItemProviderTest;
import org.eclipse.uml2.provider.tests.EventOccurrenceItemProviderTest;
import org.eclipse.uml2.provider.tests.ExceptionHandlerItemProviderTest;
import org.eclipse.uml2.provider.tests.ExecutionEnvironmentItemProviderTest;
import org.eclipse.uml2.provider.tests.ExecutionOccurrenceItemProviderTest;
import org.eclipse.uml2.provider.tests.ExpansionNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ExpansionRegionItemProviderTest;
import org.eclipse.uml2.provider.tests.ExpressionItemProviderTest;
import org.eclipse.uml2.provider.tests.ExtendItemProviderTest;
import org.eclipse.uml2.provider.tests.ExtensionEndItemProviderTest;
import org.eclipse.uml2.provider.tests.ExtensionItemProviderTest;
import org.eclipse.uml2.provider.tests.ExtensionPointItemProviderTest;
import org.eclipse.uml2.provider.tests.FinalStateItemProviderTest;
import org.eclipse.uml2.provider.tests.FlowFinalNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ForkNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.GateItemProviderTest;
import org.eclipse.uml2.provider.tests.GeneralOrderingItemProviderTest;
import org.eclipse.uml2.provider.tests.GeneralizationItemProviderTest;
import org.eclipse.uml2.provider.tests.GeneralizationSetItemProviderTest;
import org.eclipse.uml2.provider.tests.ImplementationItemProviderTest;
import org.eclipse.uml2.provider.tests.IncludeItemProviderTest;
import org.eclipse.uml2.provider.tests.InformationFlowItemProviderTest;
import org.eclipse.uml2.provider.tests.InformationItemItemProviderTest;
import org.eclipse.uml2.provider.tests.InitialNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.InputPinItemProviderTest;
import org.eclipse.uml2.provider.tests.InstanceSpecificationItemProviderTest;
import org.eclipse.uml2.provider.tests.InstanceValueItemProviderTest;
import org.eclipse.uml2.provider.tests.InteractionConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.InteractionItemProviderTest;
import org.eclipse.uml2.provider.tests.InteractionOccurrenceItemProviderTest;
import org.eclipse.uml2.provider.tests.InteractionOperandItemProviderTest;
import org.eclipse.uml2.provider.tests.InterfaceItemProviderTest;
import org.eclipse.uml2.provider.tests.InterruptibleActivityRegionItemProviderTest;
import org.eclipse.uml2.provider.tests.IntervalConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.IntervalItemProviderTest;
import org.eclipse.uml2.provider.tests.JoinNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.LifelineItemProviderTest;
import org.eclipse.uml2.provider.tests.LinkEndCreationDataItemProviderTest;
import org.eclipse.uml2.provider.tests.LinkEndDataItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralBooleanItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralIntegerItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralNullItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralStringItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralUnlimitedNaturalItemProviderTest;
import org.eclipse.uml2.provider.tests.LoopNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ManifestationItemProviderTest;
import org.eclipse.uml2.provider.tests.MergeNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.MessageItemProviderTest;
import org.eclipse.uml2.provider.tests.ModelItemProviderTest;
import org.eclipse.uml2.provider.tests.NodeItemProviderTest;
import org.eclipse.uml2.provider.tests.ObjectFlowItemProviderTest;
import org.eclipse.uml2.provider.tests.OpaqueExpressionItemProviderTest;
import org.eclipse.uml2.provider.tests.OperationItemProviderTest;
import org.eclipse.uml2.provider.tests.OperationTemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.OutputPinItemProviderTest;
import org.eclipse.uml2.provider.tests.PackageImportItemProviderTest;
import org.eclipse.uml2.provider.tests.PackageItemProviderTest;
import org.eclipse.uml2.provider.tests.PackageMergeItemProviderTest;
import org.eclipse.uml2.provider.tests.ParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.ParameterSetItemProviderTest;
import org.eclipse.uml2.provider.tests.PartDecompositionItemProviderTest;
import org.eclipse.uml2.provider.tests.PermissionItemProviderTest;
import org.eclipse.uml2.provider.tests.PortItemProviderTest;
import org.eclipse.uml2.provider.tests.PrimitiveFunctionItemProviderTest;
import org.eclipse.uml2.provider.tests.PrimitiveTypeItemProviderTest;
import org.eclipse.uml2.provider.tests.ProfileApplicationItemProviderTest;
import org.eclipse.uml2.provider.tests.ProfileItemProviderTest;
import org.eclipse.uml2.provider.tests.PropertyItemProviderTest;
import org.eclipse.uml2.provider.tests.ProtocolConformanceItemProviderTest;
import org.eclipse.uml2.provider.tests.ProtocolStateMachineItemProviderTest;
import org.eclipse.uml2.provider.tests.ProtocolTransitionItemProviderTest;
import org.eclipse.uml2.provider.tests.PseudostateItemProviderTest;
import org.eclipse.uml2.provider.tests.QualifierValueItemProviderTest;
import org.eclipse.uml2.provider.tests.RaiseExceptionActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadExtentActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadIsClassifiedObjectActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadLinkActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadLinkObjectEndActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadLinkObjectEndQualifierActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadSelfActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadStructuralFeatureActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReadVariableActionItemProviderTest;
import org.eclipse.uml2.provider.tests.RealizationItemProviderTest;
import org.eclipse.uml2.provider.tests.ReceptionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReclassifyObjectActionItemProviderTest;
import org.eclipse.uml2.provider.tests.RedefinableTemplateSignatureItemProviderTest;
import org.eclipse.uml2.provider.tests.RegionItemProviderTest;
import org.eclipse.uml2.provider.tests.RemoveStructuralFeatureValueActionItemProviderTest;
import org.eclipse.uml2.provider.tests.RemoveVariableValueActionItemProviderTest;
import org.eclipse.uml2.provider.tests.ReplyActionItemProviderTest;
import org.eclipse.uml2.provider.tests.SendObjectActionItemProviderTest;
import org.eclipse.uml2.provider.tests.SendSignalActionItemProviderTest;
import org.eclipse.uml2.provider.tests.SignalItemProviderTest;
import org.eclipse.uml2.provider.tests.SignalTriggerItemProviderTest;
import org.eclipse.uml2.provider.tests.SlotItemProviderTest;
import org.eclipse.uml2.provider.tests.StartOwnedBehaviorActionItemProviderTest;
import org.eclipse.uml2.provider.tests.StateInvariantItemProviderTest;
import org.eclipse.uml2.provider.tests.StateItemProviderTest;
import org.eclipse.uml2.provider.tests.StateMachineItemProviderTest;
import org.eclipse.uml2.provider.tests.StereotypeItemProviderTest;
import org.eclipse.uml2.provider.tests.StopItemProviderTest;
import org.eclipse.uml2.provider.tests.StringExpressionItemProviderTest;
import org.eclipse.uml2.provider.tests.StructuredActivityNodeItemProviderTest;
import org.eclipse.uml2.provider.tests.SubstitutionItemProviderTest;
import org.eclipse.uml2.provider.tests.TemplateBindingItemProviderTest;
import org.eclipse.uml2.provider.tests.TemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.TemplateParameterSubstitutionItemProviderTest;
import org.eclipse.uml2.provider.tests.TemplateSignatureItemProviderTest;
import org.eclipse.uml2.provider.tests.TestIdentityActionItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeExpressionItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeIntervalItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeObservationActionItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeTriggerItemProviderTest;
import org.eclipse.uml2.provider.tests.TransitionItemProviderTest;
import org.eclipse.uml2.provider.tests.UsageItemProviderTest;
import org.eclipse.uml2.provider.tests.UseCaseItemProviderTest;
import org.eclipse.uml2.provider.tests.ValuePinItemProviderTest;
import org.eclipse.uml2.provider.tests.VariableItemProviderTest;

/**
 * <!-- begin-user-doc -->
 * An edit test suite for the '<em><b>uml2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2EditTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2005 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new UML2EditTests("uml2 Edit Tests"); //$NON-NLS-1$
		suite.addTestSuite(OpaqueExpressionItemProviderTest.class);
		suite.addTestSuite(ExpressionItemProviderTest.class);
		suite.addTestSuite(CommentItemProviderTest.class);
		suite.addTestSuite(ClassItemProviderTest.class);
		suite.addTestSuite(PropertyItemProviderTest.class);
		suite.addTestSuite(OperationItemProviderTest.class);
		suite.addTestSuite(ParameterItemProviderTest.class);
		suite.addTestSuite(PackageItemProviderTest.class);
		suite.addTestSuite(EnumerationItemProviderTest.class);
		suite.addTestSuite(DataTypeItemProviderTest.class);
		suite.addTestSuite(EnumerationLiteralItemProviderTest.class);
		suite.addTestSuite(PrimitiveTypeItemProviderTest.class);
		suite.addTestSuite(ConstraintItemProviderTest.class);
		suite.addTestSuite(LiteralBooleanItemProviderTest.class);
		suite.addTestSuite(LiteralStringItemProviderTest.class);
		suite.addTestSuite(LiteralNullItemProviderTest.class);
		suite.addTestSuite(LiteralIntegerItemProviderTest.class);
		suite.addTestSuite(LiteralUnlimitedNaturalItemProviderTest.class);
		suite.addTestSuite(InstanceSpecificationItemProviderTest.class);
		suite.addTestSuite(SlotItemProviderTest.class);
		suite.addTestSuite(InstanceValueItemProviderTest.class);
		suite.addTestSuite(GeneralizationItemProviderTest.class);
		suite.addTestSuite(ElementImportItemProviderTest.class);
		suite.addTestSuite(PackageImportItemProviderTest.class);
		suite.addTestSuite(AssociationItemProviderTest.class);
		suite.addTestSuite(PackageMergeItemProviderTest.class);
		suite.addTestSuite(StereotypeItemProviderTest.class);
		suite.addTestSuite(ProfileItemProviderTest.class);
		suite.addTestSuite(ProfileApplicationItemProviderTest.class);
		suite.addTestSuite(ExtensionItemProviderTest.class);
		suite.addTestSuite(ExtensionEndItemProviderTest.class);
		suite.addTestSuite(ActivityItemProviderTest.class);
		suite.addTestSuite(PermissionItemProviderTest.class);
		suite.addTestSuite(DependencyItemProviderTest.class);
		suite.addTestSuite(UsageItemProviderTest.class);
		suite.addTestSuite(AbstractionItemProviderTest.class);
		suite.addTestSuite(RealizationItemProviderTest.class);
		suite.addTestSuite(SubstitutionItemProviderTest.class);
		suite.addTestSuite(GeneralizationSetItemProviderTest.class);
		suite.addTestSuite(AssociationClassItemProviderTest.class);
		suite.addTestSuite(InformationItemItemProviderTest.class);
		suite.addTestSuite(InformationFlowItemProviderTest.class);
		suite.addTestSuite(ModelItemProviderTest.class);
		suite.addTestSuite(ConnectorEndItemProviderTest.class);
		suite.addTestSuite(ConnectorItemProviderTest.class);
		suite.addTestSuite(ActionItemProviderTest.class);
		suite.addTestSuite(ControlFlowItemProviderTest.class);
		suite.addTestSuite(ObjectFlowItemProviderTest.class);
		suite.addTestSuite(InitialNodeItemProviderTest.class);
		suite.addTestSuite(ActivityFinalNodeItemProviderTest.class);
		suite.addTestSuite(DecisionNodeItemProviderTest.class);
		suite.addTestSuite(MergeNodeItemProviderTest.class);
		suite.addTestSuite(OutputPinItemProviderTest.class);
		suite.addTestSuite(InputPinItemProviderTest.class);
		suite.addTestSuite(ActivityParameterNodeItemProviderTest.class);
		suite.addTestSuite(ValuePinItemProviderTest.class);
		suite.addTestSuite(InterfaceItemProviderTest.class);
		suite.addTestSuite(ImplementationItemProviderTest.class);
		suite.addTestSuite(ArtifactItemProviderTest.class);
		suite.addTestSuite(ManifestationItemProviderTest.class);
		suite.addTestSuite(ActorItemProviderTest.class);
		suite.addTestSuite(ExtendItemProviderTest.class);
		suite.addTestSuite(UseCaseItemProviderTest.class);
		suite.addTestSuite(ExtensionPointItemProviderTest.class);
		suite.addTestSuite(IncludeItemProviderTest.class);
		suite.addTestSuite(CollaborationOccurrenceItemProviderTest.class);
		suite.addTestSuite(CollaborationItemProviderTest.class);
		suite.addTestSuite(PortItemProviderTest.class);
		suite.addTestSuite(CallTriggerItemProviderTest.class);
		suite.addTestSuite(ChangeTriggerItemProviderTest.class);
		suite.addTestSuite(ReceptionItemProviderTest.class);
		suite.addTestSuite(SignalItemProviderTest.class);
		suite.addTestSuite(SignalTriggerItemProviderTest.class);
		suite.addTestSuite(TimeTriggerItemProviderTest.class);
		suite.addTestSuite(AnyTriggerItemProviderTest.class);
		suite.addTestSuite(VariableItemProviderTest.class);
		suite.addTestSuite(StructuredActivityNodeItemProviderTest.class);
		suite.addTestSuite(ConditionalNodeItemProviderTest.class);
		suite.addTestSuite(ClauseItemProviderTest.class);
		suite.addTestSuite(LoopNodeItemProviderTest.class);
		suite.addTestSuite(InteractionItemProviderTest.class);
		suite.addTestSuite(LifelineItemProviderTest.class);
		suite.addTestSuite(MessageItemProviderTest.class);
		suite.addTestSuite(GeneralOrderingItemProviderTest.class);
		suite.addTestSuite(EventOccurrenceItemProviderTest.class);
		suite.addTestSuite(ExecutionOccurrenceItemProviderTest.class);
		suite.addTestSuite(StateInvariantItemProviderTest.class);
		suite.addTestSuite(StopItemProviderTest.class);
		suite.addTestSuite(TemplateSignatureItemProviderTest.class);
		suite.addTestSuite(TemplateParameterItemProviderTest.class);
		suite.addTestSuite(StringExpressionItemProviderTest.class);
		suite.addTestSuite(TemplateBindingItemProviderTest.class);
		suite.addTestSuite(TemplateParameterSubstitutionItemProviderTest.class);
		suite.addTestSuite(OperationTemplateParameterItemProviderTest.class);
		suite.addTestSuite(ClassifierTemplateParameterItemProviderTest.class);
		suite.addTestSuite(RedefinableTemplateSignatureItemProviderTest.class);
		suite.addTestSuite(ConnectableElementTemplateParameterItemProviderTest.class);
		suite.addTestSuite(ForkNodeItemProviderTest.class);
		suite.addTestSuite(JoinNodeItemProviderTest.class);
		suite.addTestSuite(FlowFinalNodeItemProviderTest.class);
		suite.addTestSuite(CentralBufferNodeItemProviderTest.class);
		suite.addTestSuite(ActivityPartitionItemProviderTest.class);
		suite.addTestSuite(ExpansionNodeItemProviderTest.class);
		suite.addTestSuite(ExpansionRegionItemProviderTest.class);
		suite.addTestSuite(ExceptionHandlerItemProviderTest.class);
		suite.addTestSuite(InteractionOccurrenceItemProviderTest.class);
		suite.addTestSuite(GateItemProviderTest.class);
		suite.addTestSuite(PartDecompositionItemProviderTest.class);
		suite.addTestSuite(InteractionOperandItemProviderTest.class);
		suite.addTestSuite(InteractionConstraintItemProviderTest.class);
		suite.addTestSuite(CombinedFragmentItemProviderTest.class);
		suite.addTestSuite(ContinuationItemProviderTest.class);
		suite.addTestSuite(StateMachineItemProviderTest.class);
		suite.addTestSuite(RegionItemProviderTest.class);
		suite.addTestSuite(PseudostateItemProviderTest.class);
		suite.addTestSuite(StateItemProviderTest.class);
		suite.addTestSuite(ConnectionPointReferenceItemProviderTest.class);
		suite.addTestSuite(TransitionItemProviderTest.class);
		suite.addTestSuite(FinalStateItemProviderTest.class);
		suite.addTestSuite(CreateObjectActionItemProviderTest.class);
		suite.addTestSuite(DestroyObjectActionItemProviderTest.class);
		suite.addTestSuite(TestIdentityActionItemProviderTest.class);
		suite.addTestSuite(ReadSelfActionItemProviderTest.class);
		suite.addTestSuite(ReadStructuralFeatureActionItemProviderTest.class);
		suite.addTestSuite(ClearStructuralFeatureActionItemProviderTest.class);
		suite.addTestSuite(RemoveStructuralFeatureValueActionItemProviderTest.class);
		suite.addTestSuite(AddStructuralFeatureValueActionItemProviderTest.class);
		suite.addTestSuite(LinkEndDataItemProviderTest.class);
		suite.addTestSuite(ReadLinkActionItemProviderTest.class);
		suite.addTestSuite(LinkEndCreationDataItemProviderTest.class);
		suite.addTestSuite(CreateLinkActionItemProviderTest.class);
		suite.addTestSuite(DestroyLinkActionItemProviderTest.class);
		suite.addTestSuite(ClearAssociationActionItemProviderTest.class);
		suite.addTestSuite(ReadVariableActionItemProviderTest.class);
		suite.addTestSuite(ClearVariableActionItemProviderTest.class);
		suite.addTestSuite(AddVariableValueActionItemProviderTest.class);
		suite.addTestSuite(RemoveVariableValueActionItemProviderTest.class);
		suite.addTestSuite(ApplyFunctionActionItemProviderTest.class);
		suite.addTestSuite(PrimitiveFunctionItemProviderTest.class);
		suite.addTestSuite(SendSignalActionItemProviderTest.class);
		suite.addTestSuite(BroadcastSignalActionItemProviderTest.class);
		suite.addTestSuite(SendObjectActionItemProviderTest.class);
		suite.addTestSuite(CallOperationActionItemProviderTest.class);
		suite.addTestSuite(CallBehaviorActionItemProviderTest.class);
		suite.addTestSuite(TimeExpressionItemProviderTest.class);
		suite.addTestSuite(DurationItemProviderTest.class);
		suite.addTestSuite(TimeObservationActionItemProviderTest.class);
		suite.addTestSuite(DurationIntervalItemProviderTest.class);
		suite.addTestSuite(IntervalItemProviderTest.class);
		suite.addTestSuite(TimeConstraintItemProviderTest.class);
		suite.addTestSuite(IntervalConstraintItemProviderTest.class);
		suite.addTestSuite(TimeIntervalItemProviderTest.class);
		suite.addTestSuite(DurationObservationActionItemProviderTest.class);
		suite.addTestSuite(DurationConstraintItemProviderTest.class);
		suite.addTestSuite(DataStoreNodeItemProviderTest.class);
		suite.addTestSuite(InterruptibleActivityRegionItemProviderTest.class);
		suite.addTestSuite(ParameterSetItemProviderTest.class);
		suite.addTestSuite(ComponentItemProviderTest.class);
		suite.addTestSuite(DeploymentItemProviderTest.class);
		suite.addTestSuite(NodeItemProviderTest.class);
		suite.addTestSuite(DeviceItemProviderTest.class);
		suite.addTestSuite(ExecutionEnvironmentItemProviderTest.class);
		suite.addTestSuite(CommunicationPathItemProviderTest.class);
		suite.addTestSuite(ProtocolConformanceItemProviderTest.class);
		suite.addTestSuite(ProtocolStateMachineItemProviderTest.class);
		suite.addTestSuite(ProtocolTransitionItemProviderTest.class);
		suite.addTestSuite(ReadExtentActionItemProviderTest.class);
		suite.addTestSuite(ReclassifyObjectActionItemProviderTest.class);
		suite.addTestSuite(ReadIsClassifiedObjectActionItemProviderTest.class);
		suite.addTestSuite(StartOwnedBehaviorActionItemProviderTest.class);
		suite.addTestSuite(QualifierValueItemProviderTest.class);
		suite.addTestSuite(ReadLinkObjectEndActionItemProviderTest.class);
		suite.addTestSuite(ReadLinkObjectEndQualifierActionItemProviderTest.class);
		suite.addTestSuite(CreateLinkObjectActionItemProviderTest.class);
		suite.addTestSuite(AcceptEventActionItemProviderTest.class);
		suite.addTestSuite(AcceptCallActionItemProviderTest.class);
		suite.addTestSuite(ReplyActionItemProviderTest.class);
		suite.addTestSuite(RaiseExceptionActionItemProviderTest.class);
		suite.addTestSuite(DeploymentSpecificationItemProviderTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2EditTests(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestSuite#addTestSuite(java.lang.Class)
	 */
	public void addTestSuite(final Class testClass) {
		TestSuite suite = new TestSuite();
		suite.setName(testClass.getName());

		try {
			getTestConstructor(testClass);
		} catch (NoSuchMethodException nsme) {
			suite
				.addTest(warning("Class " //$NON-NLS-1$
					+ testClass.getName()
					+ " has no public constructor TestCase(String name) or TestCase()")); //$NON-NLS-1$
			return;
		}

		if (!Modifier.isPublic(testClass.getModifiers())) {
			suite.addTest(warning("Class " + testClass.getName() //$NON-NLS-1$
				+ " is not public")); //$NON-NLS-1$
			return;
		}

		Class superClass = testClass;
		List names = new ArrayList();

		while (Test.class.isAssignableFrom(superClass)) {
			Method[] methods = superClass.getDeclaredMethods();

			for (int i = 0; i < methods.length; i++) {
				addTestMethod(suite, methods[i], names, testClass);
			}

			superClass = superClass.getSuperclass();
		}

		addTest(suite);
	}

	private Test warning(final String message) {
		return new TestCase("warning") { //$NON-NLS-1$

			protected void runTest() {
				fail(message);
			}
		};
	}

	private void addTestMethod(TestSuite suite, Method method, List names,
			Class testClass) {
		String name = method.getName();

		if (names.contains(name)) {
			return;
		}

		if (!isPublicTestMethod(method)) {

			if (isTestMethod(method)) {
				suite.addTest(warning("Test method isn't public: " //$NON-NLS-1$
					+ method.getName()));
			}

			return;
		}

		names.add(name);
		suite.addTest(createTest(testClass, name));
	}

	private boolean isPublicTestMethod(Method method) {
		return isTestMethod(method) && Modifier.isPublic(method.getModifiers());
	}

	private boolean isTestMethod(Method method) {
		String name = method.getName();

		return 0 == method.getParameterTypes().length
			&& name.startsWith("test") && !name.endsWith("Gen") //$NON-NLS-1$ //$NON-NLS-2$
			&& method.getReturnType().equals(Void.TYPE);
	}

} // UML2EditTests
