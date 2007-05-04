/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLTests.java,v 1.4 2007/05/04 20:35:57 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>uml</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLTests
		extends TestSuite {

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
		TestSuite suite = new UMLTests("uml Tests"); //$NON-NLS-1$
		suite.addTestSuite(CommentTest.class);
		suite.addTestSuite(PackageTest.class);
		suite.addTestSuite(DependencyTest.class);
		suite.addTestSuite(ElementImportTest.class);
		suite.addTestSuite(PackageImportTest.class);
		suite.addTestSuite(ConstraintTest.class);
		suite.addTestSuite(AssociationTest.class);
		suite.addTestSuite(TemplateBindingTest.class);
		suite.addTestSuite(TemplateSignatureTest.class);
		suite.addTestSuite(TemplateParameterTest.class);
		suite.addTestSuite(TemplateParameterSubstitutionTest.class);
		suite.addTestSuite(GeneralizationTest.class);
		suite.addTestSuite(GeneralizationSetTest.class);
		suite.addTestSuite(SubstitutionTest.class);
		suite.addTestSuite(RealizationTest.class);
		suite.addTestSuite(AbstractionTest.class);
		suite.addTestSuite(OpaqueExpressionTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(ConnectableElementTemplateParameterTest.class);
		suite.addTestSuite(ConnectorEndTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(DeploymentTest.class);
		suite.addTestSuite(DeploymentSpecificationTest.class);
		suite.addTestSuite(ArtifactTest.class);
		suite.addTestSuite(ManifestationTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(ClassTest.class);
		suite.addTestSuite(InterfaceRealizationTest.class);
		suite.addTestSuite(InterfaceTest.class);
		suite.addTestSuite(ReceptionTest.class);
		suite.addTestSuite(SignalTest.class);
		suite.addTestSuite(ProtocolStateMachineTest.class);
		suite.addTestSuite(StateMachineTest.class);
		suite.addTestSuite(RegionTest.class);
		suite.addTestSuite(TransitionTest.class);
		suite.addTestSuite(TriggerTest.class);
		suite.addTestSuite(PortTest.class);
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(ConnectionPointReferenceTest.class);
		suite.addTestSuite(PseudostateTest.class);
		suite.addTestSuite(ProtocolConformanceTest.class);
		suite.addTestSuite(ConnectorTest.class);
		suite.addTestSuite(ExtensionTest.class);
		suite.addTestSuite(ExtensionEndTest.class);
		suite.addTestSuite(StereotypeTest.class);
		suite.addTestSuite(ImageTest.class);
		suite.addTestSuite(ProfileTest.class);
		suite.addTestSuite(ModelTest.class);
		suite.addTestSuite(ParameterSetTest.class);
		suite.addTestSuite(DataTypeTest.class);
		suite.addTestSuite(OperationTemplateParameterTest.class);
		suite.addTestSuite(CollaborationUseTest.class);
		suite.addTestSuite(CollaborationTest.class);
		suite.addTestSuite(UseCaseTest.class);
		suite.addTestSuite(IncludeTest.class);
		suite.addTestSuite(ExtendTest.class);
		suite.addTestSuite(ExtensionPointTest.class);
		suite.addTestSuite(RedefinableTemplateSignatureTest.class);
		suite.addTestSuite(ClassifierTemplateParameterTest.class);
		suite.addTestSuite(StringExpressionTest.class);
		suite.addTestSuite(ExpressionTest.class);
		suite.addTestSuite(UsageTest.class);
		suite.addTestSuite(PackageMergeTest.class);
		suite.addTestSuite(ProfileApplicationTest.class);
		suite.addTestSuite(EnumerationTest.class);
		suite.addTestSuite(EnumerationLiteralTest.class);
		suite.addTestSuite(InstanceSpecificationTest.class);
		suite.addTestSuite(SlotTest.class);
		suite.addTestSuite(PrimitiveTypeTest.class);
		suite.addTestSuite(LiteralIntegerTest.class);
		suite.addTestSuite(LiteralStringTest.class);
		suite.addTestSuite(LiteralBooleanTest.class);
		suite.addTestSuite(LiteralNullTest.class);
		suite.addTestSuite(InstanceValueTest.class);
		suite.addTestSuite(LiteralUnlimitedNaturalTest.class);
		suite.addTestSuite(OpaqueBehaviorTest.class);
		suite.addTestSuite(FunctionBehaviorTest.class);
		suite.addTestSuite(OpaqueActionTest.class);
		suite.addTestSuite(StructuredActivityNodeTest.class);
		suite.addTestSuite(ActivityTest.class);
		suite.addTestSuite(VariableTest.class);
		suite.addTestSuite(ActivityPartitionTest.class);
		suite.addTestSuite(InterruptibleActivityRegionTest.class);
		suite.addTestSuite(ExceptionHandlerTest.class);
		suite.addTestSuite(OutputPinTest.class);
		suite.addTestSuite(PinTest.class);
		suite.addTestSuite(InputPinTest.class);
		suite.addTestSuite(SendSignalActionTest.class);
		suite.addTestSuite(CallOperationActionTest.class);
		suite.addTestSuite(CallBehaviorActionTest.class);
		suite.addTestSuite(SequenceNodeTest.class);
		suite.addTestSuite(ControlFlowTest.class);
		suite.addTestSuite(InitialNodeTest.class);
		suite.addTestSuite(ActivityParameterNodeTest.class);
		suite.addTestSuite(ValuePinTest.class);
		suite.addTestSuite(MessageTest.class);
		suite.addTestSuite(InteractionTest.class);
		suite.addTestSuite(LifelineTest.class);
		suite.addTestSuite(PartDecompositionTest.class);
		suite.addTestSuite(InteractionUseTest.class);
		suite.addTestSuite(GateTest.class);
		suite.addTestSuite(GeneralOrderingTest.class);
		suite.addTestSuite(OccurrenceSpecificationTest.class);
		suite.addTestSuite(InteractionOperandTest.class);
		suite.addTestSuite(InteractionConstraintTest.class);
		suite.addTestSuite(StateInvariantTest.class);
		suite.addTestSuite(ActionExecutionSpecificationTest.class);
		suite.addTestSuite(BehaviorExecutionSpecificationTest.class);
		suite.addTestSuite(ExecutionEventTest.class);
		suite.addTestSuite(CreationEventTest.class);
		suite.addTestSuite(DestructionEventTest.class);
		suite.addTestSuite(SendOperationEventTest.class);
		suite.addTestSuite(SendSignalEventTest.class);
		suite.addTestSuite(MessageOccurrenceSpecificationTest.class);
		suite.addTestSuite(ExecutionOccurrenceSpecificationTest.class);
		suite.addTestSuite(ReceiveOperationEventTest.class);
		suite.addTestSuite(ReceiveSignalEventTest.class);
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(CallEventTest.class);
		suite.addTestSuite(ChangeEventTest.class);
		suite.addTestSuite(SignalEventTest.class);
		suite.addTestSuite(AnyReceiveEventTest.class);
		suite.addTestSuite(ForkNodeTest.class);
		suite.addTestSuite(FlowFinalNodeTest.class);
		suite.addTestSuite(CentralBufferNodeTest.class);
		suite.addTestSuite(MergeNodeTest.class);
		suite.addTestSuite(DecisionNodeTest.class);
		suite.addTestSuite(ActivityFinalNodeTest.class);
		suite.addTestSuite(ComponentRealizationTest.class);
		suite.addTestSuite(ComponentTest.class);
		suite.addTestSuite(NodeTest.class);
		suite.addTestSuite(DeviceTest.class);
		suite.addTestSuite(ExecutionEnvironmentTest.class);
		suite.addTestSuite(CommunicationPathTest.class);
		suite.addTestSuite(CombinedFragmentTest.class);
		suite.addTestSuite(ContinuationTest.class);
		suite.addTestSuite(ConsiderIgnoreFragmentTest.class);
		suite.addTestSuite(CreateObjectActionTest.class);
		suite.addTestSuite(DestroyObjectActionTest.class);
		suite.addTestSuite(TestIdentityActionTest.class);
		suite.addTestSuite(ReadSelfActionTest.class);
		suite.addTestSuite(ReadStructuralFeatureActionTest.class);
		suite.addTestSuite(ClearStructuralFeatureActionTest.class);
		suite.addTestSuite(RemoveStructuralFeatureValueActionTest.class);
		suite.addTestSuite(AddStructuralFeatureValueActionTest.class);
		suite.addTestSuite(LinkEndDataTest.class);
		suite.addTestSuite(QualifierValueTest.class);
		suite.addTestSuite(ReadLinkActionTest.class);
		suite.addTestSuite(LinkEndCreationDataTest.class);
		suite.addTestSuite(CreateLinkActionTest.class);
		suite.addTestSuite(DestroyLinkActionTest.class);
		suite.addTestSuite(LinkEndDestructionDataTest.class);
		suite.addTestSuite(ClearAssociationActionTest.class);
		suite.addTestSuite(BroadcastSignalActionTest.class);
		suite.addTestSuite(SendObjectActionTest.class);
		suite.addTestSuite(ValueSpecificationActionTest.class);
		suite.addTestSuite(TimeExpressionTest.class);
		suite.addTestSuite(DurationTest.class);
		suite.addTestSuite(DurationIntervalTest.class);
		suite.addTestSuite(IntervalTest.class);
		suite.addTestSuite(TimeConstraintTest.class);
		suite.addTestSuite(IntervalConstraintTest.class);
		suite.addTestSuite(TimeIntervalTest.class);
		suite.addTestSuite(DurationConstraintTest.class);
		suite.addTestSuite(TimeObservationTest.class);
		suite.addTestSuite(DurationObservationTest.class);
		suite.addTestSuite(FinalStateTest.class);
		suite.addTestSuite(TimeEventTest.class);
		suite.addTestSuite(ReadVariableActionTest.class);
		suite.addTestSuite(ClearVariableActionTest.class);
		suite.addTestSuite(AddVariableValueActionTest.class);
		suite.addTestSuite(RemoveVariableValueActionTest.class);
		suite.addTestSuite(RaiseExceptionActionTest.class);
		suite.addTestSuite(ActionInputPinTest.class);
		suite.addTestSuite(InformationItemTest.class);
		suite.addTestSuite(InformationFlowTest.class);
		suite.addTestSuite(ReadExtentActionTest.class);
		suite.addTestSuite(ReclassifyObjectActionTest.class);
		suite.addTestSuite(ReadIsClassifiedObjectActionTest.class);
		suite.addTestSuite(StartClassifierBehaviorActionTest.class);
		suite.addTestSuite(ReadLinkObjectEndActionTest.class);
		suite.addTestSuite(ReadLinkObjectEndQualifierActionTest.class);
		suite.addTestSuite(CreateLinkObjectActionTest.class);
		suite.addTestSuite(AcceptEventActionTest.class);
		suite.addTestSuite(AcceptCallActionTest.class);
		suite.addTestSuite(ReplyActionTest.class);
		suite.addTestSuite(UnmarshallActionTest.class);
		suite.addTestSuite(ReduceActionTest.class);
		suite.addTestSuite(JoinNodeTest.class);
		suite.addTestSuite(DataStoreNodeTest.class);
		suite.addTestSuite(ObjectFlowTest.class);
		suite.addTestSuite(ConditionalNodeTest.class);
		suite.addTestSuite(ClauseTest.class);
		suite.addTestSuite(LoopNodeTest.class);
		suite.addTestSuite(ExpansionNodeTest.class);
		suite.addTestSuite(ExpansionRegionTest.class);
		suite.addTestSuite(ProtocolTransitionTest.class);
		suite.addTestSuite(AssociationClassTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLTests(String name) {
		super(name);
	}

} //UMLTests
