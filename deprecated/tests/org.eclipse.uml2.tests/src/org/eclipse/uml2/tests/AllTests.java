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
 * $Id: AllTests.java,v 1.3 2004/05/11 15:20:50 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.eclipse.uml2.impl.tests.AbstractionImplTest;
import org.eclipse.uml2.impl.tests.AcceptCallActionImplTest;
import org.eclipse.uml2.impl.tests.AcceptEventActionImplTest;
import org.eclipse.uml2.impl.tests.ActionImplTest;
import org.eclipse.uml2.impl.tests.ActivityFinalNodeImplTest;
import org.eclipse.uml2.impl.tests.ActivityImplTest;
import org.eclipse.uml2.impl.tests.ActivityParameterNodeImplTest;
import org.eclipse.uml2.impl.tests.ActivityPartitionImplTest;
import org.eclipse.uml2.impl.tests.ActorImplTest;
import org.eclipse.uml2.impl.tests.AddStructuralFeatureValueActionImplTest;
import org.eclipse.uml2.impl.tests.AddVariableValueActionImplTest;
import org.eclipse.uml2.impl.tests.AnyTriggerImplTest;
import org.eclipse.uml2.impl.tests.ApplyFunctionActionImplTest;
import org.eclipse.uml2.impl.tests.ArtifactImplTest;
import org.eclipse.uml2.impl.tests.AssociationClassImplTest;
import org.eclipse.uml2.impl.tests.AssociationImplTest;
import org.eclipse.uml2.impl.tests.BroadcastSignalActionImplTest;
import org.eclipse.uml2.impl.tests.CallBehaviorActionImplTest;
import org.eclipse.uml2.impl.tests.CallOperationActionImplTest;
import org.eclipse.uml2.impl.tests.CallTriggerImplTest;
import org.eclipse.uml2.impl.tests.CentralBufferNodeImplTest;
import org.eclipse.uml2.impl.tests.ChangeTriggerImplTest;
import org.eclipse.uml2.impl.tests.ClassImplTest;
import org.eclipse.uml2.impl.tests.ClassifierTemplateParameterImplTest;
import org.eclipse.uml2.impl.tests.ClauseImplTest;
import org.eclipse.uml2.impl.tests.ClearAssociationActionImplTest;
import org.eclipse.uml2.impl.tests.ClearStructuralFeatureActionImplTest;
import org.eclipse.uml2.impl.tests.ClearVariableActionImplTest;
import org.eclipse.uml2.impl.tests.CollaborationImplTest;
import org.eclipse.uml2.impl.tests.CollaborationOccurrenceImplTest;
import org.eclipse.uml2.impl.tests.CombinedFragmentImplTest;
import org.eclipse.uml2.impl.tests.CommentImplTest;
import org.eclipse.uml2.impl.tests.CommunicationPathImplTest;
import org.eclipse.uml2.impl.tests.ComponentImplTest;
import org.eclipse.uml2.impl.tests.ConditionalNodeImplTest;
import org.eclipse.uml2.impl.tests.ConnectableElementTemplateParameterImplTest;
import org.eclipse.uml2.impl.tests.ConnectionPointReferenceImplTest;
import org.eclipse.uml2.impl.tests.ConnectorEndImplTest;
import org.eclipse.uml2.impl.tests.ConnectorImplTest;
import org.eclipse.uml2.impl.tests.ConstraintImplTest;
import org.eclipse.uml2.impl.tests.ContinuationImplTest;
import org.eclipse.uml2.impl.tests.ControlFlowImplTest;
import org.eclipse.uml2.impl.tests.CreateLinkActionImplTest;
import org.eclipse.uml2.impl.tests.CreateLinkObjectActionImplTest;
import org.eclipse.uml2.impl.tests.CreateObjectActionImplTest;
import org.eclipse.uml2.impl.tests.DataStoreNodeImplTest;
import org.eclipse.uml2.impl.tests.DataTypeImplTest;
import org.eclipse.uml2.impl.tests.DecisionNodeImplTest;
import org.eclipse.uml2.impl.tests.DependencyImplTest;
import org.eclipse.uml2.impl.tests.DeploymentImplTest;
import org.eclipse.uml2.impl.tests.DeploymentSpecificationImplTest;
import org.eclipse.uml2.impl.tests.DestroyLinkActionImplTest;
import org.eclipse.uml2.impl.tests.DestroyObjectActionImplTest;
import org.eclipse.uml2.impl.tests.DeviceImplTest;
import org.eclipse.uml2.impl.tests.DurationConstraintImplTest;
import org.eclipse.uml2.impl.tests.DurationImplTest;
import org.eclipse.uml2.impl.tests.DurationIntervalImplTest;
import org.eclipse.uml2.impl.tests.DurationObservationActionImplTest;
import org.eclipse.uml2.impl.tests.ElementImportImplTest;
import org.eclipse.uml2.impl.tests.EnumerationImplTest;
import org.eclipse.uml2.impl.tests.EnumerationLiteralImplTest;
import org.eclipse.uml2.impl.tests.EventOccurrenceImplTest;
import org.eclipse.uml2.impl.tests.ExceptionHandlerImplTest;
import org.eclipse.uml2.impl.tests.ExecutionEnvironmentImplTest;
import org.eclipse.uml2.impl.tests.ExecutionOccurrenceImplTest;
import org.eclipse.uml2.impl.tests.ExpansionNodeImplTest;
import org.eclipse.uml2.impl.tests.ExpansionRegionImplTest;
import org.eclipse.uml2.impl.tests.ExpressionImplTest;
import org.eclipse.uml2.impl.tests.ExtendImplTest;
import org.eclipse.uml2.impl.tests.ExtensionEndImplTest;
import org.eclipse.uml2.impl.tests.ExtensionImplTest;
import org.eclipse.uml2.impl.tests.ExtensionPointImplTest;
import org.eclipse.uml2.impl.tests.FinalStateImplTest;
import org.eclipse.uml2.impl.tests.FlowFinalNodeImplTest;
import org.eclipse.uml2.impl.tests.ForkNodeImplTest;
import org.eclipse.uml2.impl.tests.GateImplTest;
import org.eclipse.uml2.impl.tests.GeneralOrderingImplTest;
import org.eclipse.uml2.impl.tests.GeneralizationImplTest;
import org.eclipse.uml2.impl.tests.GeneralizationSetImplTest;
import org.eclipse.uml2.impl.tests.ImplementationImplTest;
import org.eclipse.uml2.impl.tests.IncludeImplTest;
import org.eclipse.uml2.impl.tests.InformationFlowImplTest;
import org.eclipse.uml2.impl.tests.InformationItemImplTest;
import org.eclipse.uml2.impl.tests.InitialNodeImplTest;
import org.eclipse.uml2.impl.tests.InputPinImplTest;
import org.eclipse.uml2.impl.tests.InstanceSpecificationImplTest;
import org.eclipse.uml2.impl.tests.InstanceValueImplTest;
import org.eclipse.uml2.impl.tests.InteractionConstraintImplTest;
import org.eclipse.uml2.impl.tests.InteractionImplTest;
import org.eclipse.uml2.impl.tests.InteractionOccurrenceImplTest;
import org.eclipse.uml2.impl.tests.InteractionOperandImplTest;
import org.eclipse.uml2.impl.tests.InterfaceImplTest;
import org.eclipse.uml2.impl.tests.InterruptibleActivityRegionImplTest;
import org.eclipse.uml2.impl.tests.IntervalConstraintImplTest;
import org.eclipse.uml2.impl.tests.IntervalImplTest;
import org.eclipse.uml2.impl.tests.JoinNodeImplTest;
import org.eclipse.uml2.impl.tests.LifelineImplTest;
import org.eclipse.uml2.impl.tests.LinkEndCreationDataImplTest;
import org.eclipse.uml2.impl.tests.LinkEndDataImplTest;
import org.eclipse.uml2.impl.tests.LiteralBooleanImplTest;
import org.eclipse.uml2.impl.tests.LiteralIntegerImplTest;
import org.eclipse.uml2.impl.tests.LiteralNullImplTest;
import org.eclipse.uml2.impl.tests.LiteralStringImplTest;
import org.eclipse.uml2.impl.tests.LiteralUnlimitedNaturalImplTest;
import org.eclipse.uml2.impl.tests.LoopNodeImplTest;
import org.eclipse.uml2.impl.tests.ManifestationImplTest;
import org.eclipse.uml2.impl.tests.MergeNodeImplTest;
import org.eclipse.uml2.impl.tests.MessageImplTest;
import org.eclipse.uml2.impl.tests.ModelImplTest;
import org.eclipse.uml2.impl.tests.NodeImplTest;
import org.eclipse.uml2.impl.tests.ObjectFlowImplTest;
import org.eclipse.uml2.impl.tests.OpaqueExpressionImplTest;
import org.eclipse.uml2.impl.tests.OperationImplTest;
import org.eclipse.uml2.impl.tests.OperationTemplateParameterImplTest;
import org.eclipse.uml2.impl.tests.OutputPinImplTest;
import org.eclipse.uml2.impl.tests.PackageImplTest;
import org.eclipse.uml2.impl.tests.PackageImportImplTest;
import org.eclipse.uml2.impl.tests.PackageMergeImplTest;
import org.eclipse.uml2.impl.tests.ParameterImplTest;
import org.eclipse.uml2.impl.tests.ParameterSetImplTest;
import org.eclipse.uml2.impl.tests.PartDecompositionImplTest;
import org.eclipse.uml2.impl.tests.PermissionImplTest;
import org.eclipse.uml2.impl.tests.PortImplTest;
import org.eclipse.uml2.impl.tests.PrimitiveFunctionImplTest;
import org.eclipse.uml2.impl.tests.PrimitiveTypeImplTest;
import org.eclipse.uml2.impl.tests.ProfileApplicationImplTest;
import org.eclipse.uml2.impl.tests.ProfileImplTest;
import org.eclipse.uml2.impl.tests.PropertyImplTest;
import org.eclipse.uml2.impl.tests.ProtocolConformanceImplTest;
import org.eclipse.uml2.impl.tests.ProtocolStateMachineImplTest;
import org.eclipse.uml2.impl.tests.ProtocolTransitionImplTest;
import org.eclipse.uml2.impl.tests.PseudostateImplTest;
import org.eclipse.uml2.impl.tests.QualifierValueImplTest;
import org.eclipse.uml2.impl.tests.RaiseExceptionActionImplTest;
import org.eclipse.uml2.impl.tests.ReadExtentActionImplTest;
import org.eclipse.uml2.impl.tests.ReadIsClassifiedObjectActionImplTest;
import org.eclipse.uml2.impl.tests.ReadLinkActionImplTest;
import org.eclipse.uml2.impl.tests.ReadLinkObjectEndActionImplTest;
import org.eclipse.uml2.impl.tests.ReadLinkObjectEndQualifierActionImplTest;
import org.eclipse.uml2.impl.tests.ReadSelfActionImplTest;
import org.eclipse.uml2.impl.tests.ReadStructuralFeatureActionImplTest;
import org.eclipse.uml2.impl.tests.ReadVariableActionImplTest;
import org.eclipse.uml2.impl.tests.RealizationImplTest;
import org.eclipse.uml2.impl.tests.ReceptionImplTest;
import org.eclipse.uml2.impl.tests.ReclassifyObjectActionImplTest;
import org.eclipse.uml2.impl.tests.RedefinableTemplateSignatureImplTest;
import org.eclipse.uml2.impl.tests.RegionImplTest;
import org.eclipse.uml2.impl.tests.RemoveStructuralFeatureValueActionImplTest;
import org.eclipse.uml2.impl.tests.RemoveVariableValueActionImplTest;
import org.eclipse.uml2.impl.tests.ReplyActionImplTest;
import org.eclipse.uml2.impl.tests.SendObjectActionImplTest;
import org.eclipse.uml2.impl.tests.SendSignalActionImplTest;
import org.eclipse.uml2.impl.tests.SignalImplTest;
import org.eclipse.uml2.impl.tests.SignalTriggerImplTest;
import org.eclipse.uml2.impl.tests.SlotImplTest;
import org.eclipse.uml2.impl.tests.StartOwnedBehaviorActionImplTest;
import org.eclipse.uml2.impl.tests.StateImplTest;
import org.eclipse.uml2.impl.tests.StateInvariantImplTest;
import org.eclipse.uml2.impl.tests.StateMachineImplTest;
import org.eclipse.uml2.impl.tests.StereotypeImplTest;
import org.eclipse.uml2.impl.tests.StopImplTest;
import org.eclipse.uml2.impl.tests.StringExpressionImplTest;
import org.eclipse.uml2.impl.tests.StructuredActivityNodeImplTest;
import org.eclipse.uml2.impl.tests.SubstitutionImplTest;
import org.eclipse.uml2.impl.tests.TemplateBindingImplTest;
import org.eclipse.uml2.impl.tests.TemplateParameterImplTest;
import org.eclipse.uml2.impl.tests.TemplateParameterSubstitutionImplTest;
import org.eclipse.uml2.impl.tests.TemplateSignatureImplTest;
import org.eclipse.uml2.impl.tests.TestIdentityActionImplTest;
import org.eclipse.uml2.impl.tests.TimeConstraintImplTest;
import org.eclipse.uml2.impl.tests.TimeExpressionImplTest;
import org.eclipse.uml2.impl.tests.TimeIntervalImplTest;
import org.eclipse.uml2.impl.tests.TimeObservationActionImplTest;
import org.eclipse.uml2.impl.tests.TimeTriggerImplTest;
import org.eclipse.uml2.impl.tests.TransitionImplTest;
import org.eclipse.uml2.impl.tests.UsageImplTest;
import org.eclipse.uml2.impl.tests.UseCaseImplTest;
import org.eclipse.uml2.impl.tests.ValuePinImplTest;
import org.eclipse.uml2.impl.tests.VariableImplTest;

import org.eclipse.uml2.internal.operation.tests.ClassifierOperationsTest;
import org.eclipse.uml2.internal.operation.tests.ElementOperationsTest;
import org.eclipse.uml2.internal.operation.tests.MultiplicityElementOperationsTest;
import org.eclipse.uml2.internal.operation.tests.NamespaceOperationsTest;
import org.eclipse.uml2.internal.operation.tests.ParameterOperationsTest;
import org.eclipse.uml2.internal.operation.tests.ProfileOperationsTest;
import org.eclipse.uml2.internal.operation.tests.PropertyOperationsTest;
import org.eclipse.uml2.internal.operation.tests.StereotypeOperationsTest;
import org.eclipse.uml2.internal.operation.tests.TypeOperationsTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>UML2</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllTests {

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
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suiteGen() {
		TestSuite suite = new TestSuite("UML2 Tests"); //$NON-NLS-1$
		suite.addTestSuite(ClassImplTest.class);
		suite.addTestSuite(PropertyImplTest.class);
		suite.addTestSuite(OperationImplTest.class);
		suite.addTestSuite(ParameterImplTest.class);
		suite.addTestSuite(PackageImplTest.class);
		suite.addTestSuite(EnumerationImplTest.class);
		suite.addTestSuite(DataTypeImplTest.class);
		suite.addTestSuite(EnumerationLiteralImplTest.class);
		suite.addTestSuite(PrimitiveTypeImplTest.class);
		suite.addTestSuite(OpaqueExpressionImplTest.class);
		suite.addTestSuite(ExpressionImplTest.class);
		suite.addTestSuite(CommentImplTest.class);
		suite.addTestSuite(LiteralBooleanImplTest.class);
		suite.addTestSuite(LiteralStringImplTest.class);
		suite.addTestSuite(LiteralNullImplTest.class);
		suite.addTestSuite(LiteralIntegerImplTest.class);
		suite.addTestSuite(LiteralUnlimitedNaturalImplTest.class);
		suite.addTestSuite(ConstraintImplTest.class);
		suite.addTestSuite(GeneralizationImplTest.class);
		suite.addTestSuite(InstanceSpecificationImplTest.class);
		suite.addTestSuite(SlotImplTest.class);
		suite.addTestSuite(InstanceValueImplTest.class);
		suite.addTestSuite(ElementImportImplTest.class);
		suite.addTestSuite(PackageImportImplTest.class);
		suite.addTestSuite(AssociationImplTest.class);
		suite.addTestSuite(PackageMergeImplTest.class);
		suite.addTestSuite(StereotypeImplTest.class);
		suite.addTestSuite(ProfileImplTest.class);
		suite.addTestSuite(ProfileApplicationImplTest.class);
		suite.addTestSuite(ExtensionImplTest.class);
		suite.addTestSuite(ExtensionEndImplTest.class);
		suite.addTestSuite(ModelImplTest.class);
		suite.addTestSuite(AssociationClassImplTest.class);
		suite.addTestSuite(GeneralizationSetImplTest.class);
		suite.addTestSuite(ActivityImplTest.class);
		suite.addTestSuite(PermissionImplTest.class);
		suite.addTestSuite(DependencyImplTest.class);
		suite.addTestSuite(UsageImplTest.class);
		suite.addTestSuite(AbstractionImplTest.class);
		suite.addTestSuite(RealizationImplTest.class);
		suite.addTestSuite(SubstitutionImplTest.class);
		suite.addTestSuite(InformationItemImplTest.class);
		suite.addTestSuite(InformationFlowImplTest.class);
		suite.addTestSuite(ActorImplTest.class);
		suite.addTestSuite(ExtendImplTest.class);
		suite.addTestSuite(UseCaseImplTest.class);
		suite.addTestSuite(ExtensionPointImplTest.class);
		suite.addTestSuite(IncludeImplTest.class);
		suite.addTestSuite(ActionImplTest.class);
		suite.addTestSuite(ControlFlowImplTest.class);
		suite.addTestSuite(ObjectFlowImplTest.class);
		suite.addTestSuite(InitialNodeImplTest.class);
		suite.addTestSuite(ActivityFinalNodeImplTest.class);
		suite.addTestSuite(DecisionNodeImplTest.class);
		suite.addTestSuite(MergeNodeImplTest.class);
		suite.addTestSuite(OutputPinImplTest.class);
		suite.addTestSuite(InputPinImplTest.class);
		suite.addTestSuite(ActivityParameterNodeImplTest.class);
		suite.addTestSuite(ValuePinImplTest.class);
		suite.addTestSuite(InterfaceImplTest.class);
		suite.addTestSuite(ImplementationImplTest.class);
		suite.addTestSuite(ArtifactImplTest.class);
		suite.addTestSuite(ManifestationImplTest.class);
		suite.addTestSuite(ConnectorEndImplTest.class);
		suite.addTestSuite(ConnectorImplTest.class);
		suite.addTestSuite(CallTriggerImplTest.class);
		suite.addTestSuite(ChangeTriggerImplTest.class);
		suite.addTestSuite(ReceptionImplTest.class);
		suite.addTestSuite(SignalImplTest.class);
		suite.addTestSuite(SignalTriggerImplTest.class);
		suite.addTestSuite(TimeTriggerImplTest.class);
		suite.addTestSuite(AnyTriggerImplTest.class);
		suite.addTestSuite(PortImplTest.class);
		suite.addTestSuite(InteractionImplTest.class);
		suite.addTestSuite(LifelineImplTest.class);
		suite.addTestSuite(MessageImplTest.class);
		suite.addTestSuite(GeneralOrderingImplTest.class);
		suite.addTestSuite(EventOccurrenceImplTest.class);
		suite.addTestSuite(ExecutionOccurrenceImplTest.class);
		suite.addTestSuite(StateInvariantImplTest.class);
		suite.addTestSuite(StopImplTest.class);
		suite.addTestSuite(VariableImplTest.class);
		suite.addTestSuite(StructuredActivityNodeImplTest.class);
		suite.addTestSuite(ConditionalNodeImplTest.class);
		suite.addTestSuite(ClauseImplTest.class);
		suite.addTestSuite(LoopNodeImplTest.class);
		suite.addTestSuite(TemplateSignatureImplTest.class);
		suite.addTestSuite(TemplateParameterImplTest.class);
		suite.addTestSuite(StringExpressionImplTest.class);
		suite.addTestSuite(TemplateBindingImplTest.class);
		suite.addTestSuite(TemplateParameterSubstitutionImplTest.class);
		suite.addTestSuite(CollaborationImplTest.class);
		suite.addTestSuite(OperationTemplateParameterImplTest.class);
		suite.addTestSuite(ClassifierTemplateParameterImplTest.class);
		suite.addTestSuite(RedefinableTemplateSignatureImplTest.class);
		suite.addTestSuite(ConnectableElementTemplateParameterImplTest.class);
		suite.addTestSuite(CollaborationOccurrenceImplTest.class);
		suite.addTestSuite(InteractionOccurrenceImplTest.class);
		suite.addTestSuite(GateImplTest.class);
		suite.addTestSuite(PartDecompositionImplTest.class);
		suite.addTestSuite(InteractionOperandImplTest.class);
		suite.addTestSuite(InteractionConstraintImplTest.class);
		suite.addTestSuite(CombinedFragmentImplTest.class);
		suite.addTestSuite(ContinuationImplTest.class);
		suite.addTestSuite(CreateObjectActionImplTest.class);
		suite.addTestSuite(DestroyObjectActionImplTest.class);
		suite.addTestSuite(TestIdentityActionImplTest.class);
		suite.addTestSuite(ReadSelfActionImplTest.class);
		suite.addTestSuite(ReadStructuralFeatureActionImplTest.class);
		suite.addTestSuite(ClearStructuralFeatureActionImplTest.class);
		suite.addTestSuite(RemoveStructuralFeatureValueActionImplTest.class);
		suite.addTestSuite(AddStructuralFeatureValueActionImplTest.class);
		suite.addTestSuite(LinkEndDataImplTest.class);
		suite.addTestSuite(ReadLinkActionImplTest.class);
		suite.addTestSuite(LinkEndCreationDataImplTest.class);
		suite.addTestSuite(CreateLinkActionImplTest.class);
		suite.addTestSuite(DestroyLinkActionImplTest.class);
		suite.addTestSuite(ClearAssociationActionImplTest.class);
		suite.addTestSuite(ReadVariableActionImplTest.class);
		suite.addTestSuite(ClearVariableActionImplTest.class);
		suite.addTestSuite(AddVariableValueActionImplTest.class);
		suite.addTestSuite(RemoveVariableValueActionImplTest.class);
		suite.addTestSuite(ApplyFunctionActionImplTest.class);
		suite.addTestSuite(PrimitiveFunctionImplTest.class);
		suite.addTestSuite(SendSignalActionImplTest.class);
		suite.addTestSuite(BroadcastSignalActionImplTest.class);
		suite.addTestSuite(SendObjectActionImplTest.class);
		suite.addTestSuite(CallOperationActionImplTest.class);
		suite.addTestSuite(CallBehaviorActionImplTest.class);
		suite.addTestSuite(ForkNodeImplTest.class);
		suite.addTestSuite(JoinNodeImplTest.class);
		suite.addTestSuite(FlowFinalNodeImplTest.class);
		suite.addTestSuite(CentralBufferNodeImplTest.class);
		suite.addTestSuite(ActivityPartitionImplTest.class);
		suite.addTestSuite(StateMachineImplTest.class);
		suite.addTestSuite(RegionImplTest.class);
		suite.addTestSuite(PseudostateImplTest.class);
		suite.addTestSuite(StateImplTest.class);
		suite.addTestSuite(ConnectionPointReferenceImplTest.class);
		suite.addTestSuite(TransitionImplTest.class);
		suite.addTestSuite(FinalStateImplTest.class);
		suite.addTestSuite(ExpansionNodeImplTest.class);
		suite.addTestSuite(ExpansionRegionImplTest.class);
		suite.addTestSuite(ExceptionHandlerImplTest.class);
		suite.addTestSuite(DeploymentImplTest.class);
		suite.addTestSuite(NodeImplTest.class);
		suite.addTestSuite(DeviceImplTest.class);
		suite.addTestSuite(ExecutionEnvironmentImplTest.class);
		suite.addTestSuite(CommunicationPathImplTest.class);
		suite.addTestSuite(TimeExpressionImplTest.class);
		suite.addTestSuite(DurationImplTest.class);
		suite.addTestSuite(TimeObservationActionImplTest.class);
		suite.addTestSuite(DurationIntervalImplTest.class);
		suite.addTestSuite(IntervalImplTest.class);
		suite.addTestSuite(TimeConstraintImplTest.class);
		suite.addTestSuite(IntervalConstraintImplTest.class);
		suite.addTestSuite(TimeIntervalImplTest.class);
		suite.addTestSuite(DurationObservationActionImplTest.class);
		suite.addTestSuite(DurationConstraintImplTest.class);
		suite.addTestSuite(ComponentImplTest.class);
		suite.addTestSuite(DataStoreNodeImplTest.class);
		suite.addTestSuite(InterruptibleActivityRegionImplTest.class);
		suite.addTestSuite(ParameterSetImplTest.class);
		suite.addTestSuite(ProtocolConformanceImplTest.class);
		suite.addTestSuite(ProtocolStateMachineImplTest.class);
		suite.addTestSuite(ProtocolTransitionImplTest.class);
		suite.addTestSuite(ReadExtentActionImplTest.class);
		suite.addTestSuite(ReclassifyObjectActionImplTest.class);
		suite.addTestSuite(ReadIsClassifiedObjectActionImplTest.class);
		suite.addTestSuite(StartOwnedBehaviorActionImplTest.class);
		suite.addTestSuite(QualifierValueImplTest.class);
		suite.addTestSuite(ReadLinkObjectEndActionImplTest.class);
		suite.addTestSuite(ReadLinkObjectEndQualifierActionImplTest.class);
		suite.addTestSuite(CreateLinkObjectActionImplTest.class);
		suite.addTestSuite(AcceptEventActionImplTest.class);
		suite.addTestSuite(AcceptCallActionImplTest.class);
		suite.addTestSuite(ReplyActionImplTest.class);
		suite.addTestSuite(RaiseExceptionActionImplTest.class);
		suite.addTestSuite(DeploymentSpecificationImplTest.class);
		return suite;
	}

	public static Test suite() {
		TestSuite suite = (TestSuite) suiteGen();
		suite.addTestSuite(ElementOperationsTest.class);
		suite.addTestSuite(ClassifierOperationsTest.class);
		suite.addTestSuite(MultiplicityElementOperationsTest.class);
		suite.addTestSuite(NamespaceOperationsTest.class);
		suite.addTestSuite(ParameterOperationsTest.class);
		suite.addTestSuite(ProfileOperationsTest.class);
		suite.addTestSuite(PropertyOperationsTest.class);
		suite.addTestSuite(StereotypeOperationsTest.class);
		suite.addTestSuite(TypeOperationsTest.class);
		return suite;
	}

}
