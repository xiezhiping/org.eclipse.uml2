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
 * $Id: UML2Tests.java,v 1.2 2005/05/18 17:04:27 khussey Exp $
 */
package org.eclipse.uml2.tests;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>uml2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2Tests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
		TestSuite suite = new UML2Tests("uml2 Tests"); //$NON-NLS-1$
		suite.addTestSuite(OpaqueExpressionTest.class);
		suite.addTestSuite(ExpressionTest.class);
		suite.addTestSuite(CommentTest.class);
		suite.addTestSuite(ClassTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(PackageTest.class);
		suite.addTestSuite(EnumerationTest.class);
		suite.addTestSuite(DataTypeTest.class);
		suite.addTestSuite(EnumerationLiteralTest.class);
		suite.addTestSuite(PrimitiveTypeTest.class);
		suite.addTestSuite(ConstraintTest.class);
		suite.addTestSuite(LiteralBooleanTest.class);
		suite.addTestSuite(LiteralStringTest.class);
		suite.addTestSuite(LiteralNullTest.class);
		suite.addTestSuite(LiteralIntegerTest.class);
		suite.addTestSuite(LiteralUnlimitedNaturalTest.class);
		suite.addTestSuite(InstanceSpecificationTest.class);
		suite.addTestSuite(SlotTest.class);
		suite.addTestSuite(InstanceValueTest.class);
		suite.addTestSuite(GeneralizationTest.class);
		suite.addTestSuite(ElementImportTest.class);
		suite.addTestSuite(PackageImportTest.class);
		suite.addTestSuite(AssociationTest.class);
		suite.addTestSuite(PackageMergeTest.class);
		suite.addTestSuite(StereotypeTest.class);
		suite.addTestSuite(ProfileTest.class);
		suite.addTestSuite(ProfileApplicationTest.class);
		suite.addTestSuite(ExtensionTest.class);
		suite.addTestSuite(ExtensionEndTest.class);
		suite.addTestSuite(ActivityTest.class);
		suite.addTestSuite(PermissionTest.class);
		suite.addTestSuite(DependencyTest.class);
		suite.addTestSuite(UsageTest.class);
		suite.addTestSuite(AbstractionTest.class);
		suite.addTestSuite(RealizationTest.class);
		suite.addTestSuite(SubstitutionTest.class);
		suite.addTestSuite(GeneralizationSetTest.class);
		suite.addTestSuite(AssociationClassTest.class);
		suite.addTestSuite(InformationItemTest.class);
		suite.addTestSuite(InformationFlowTest.class);
		suite.addTestSuite(ModelTest.class);
		suite.addTestSuite(ConnectorEndTest.class);
		suite.addTestSuite(ConnectorTest.class);
		suite.addTestSuite(ActionTest.class);
		suite.addTestSuite(ControlFlowTest.class);
		suite.addTestSuite(ObjectFlowTest.class);
		suite.addTestSuite(InitialNodeTest.class);
		suite.addTestSuite(ActivityFinalNodeTest.class);
		suite.addTestSuite(DecisionNodeTest.class);
		suite.addTestSuite(MergeNodeTest.class);
		suite.addTestSuite(OutputPinTest.class);
		suite.addTestSuite(InputPinTest.class);
		suite.addTestSuite(ActivityParameterNodeTest.class);
		suite.addTestSuite(ValuePinTest.class);
		suite.addTestSuite(InterfaceTest.class);
		suite.addTestSuite(ImplementationTest.class);
		suite.addTestSuite(ArtifactTest.class);
		suite.addTestSuite(ManifestationTest.class);
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(ExtendTest.class);
		suite.addTestSuite(UseCaseTest.class);
		suite.addTestSuite(ExtensionPointTest.class);
		suite.addTestSuite(IncludeTest.class);
		suite.addTestSuite(CollaborationOccurrenceTest.class);
		suite.addTestSuite(CollaborationTest.class);
		suite.addTestSuite(PortTest.class);
		suite.addTestSuite(CallTriggerTest.class);
		suite.addTestSuite(ChangeTriggerTest.class);
		suite.addTestSuite(ReceptionTest.class);
		suite.addTestSuite(SignalTest.class);
		suite.addTestSuite(SignalTriggerTest.class);
		suite.addTestSuite(TimeTriggerTest.class);
		suite.addTestSuite(AnyTriggerTest.class);
		suite.addTestSuite(VariableTest.class);
		suite.addTestSuite(StructuredActivityNodeTest.class);
		suite.addTestSuite(ConditionalNodeTest.class);
		suite.addTestSuite(ClauseTest.class);
		suite.addTestSuite(LoopNodeTest.class);
		suite.addTestSuite(InteractionTest.class);
		suite.addTestSuite(LifelineTest.class);
		suite.addTestSuite(MessageTest.class);
		suite.addTestSuite(GeneralOrderingTest.class);
		suite.addTestSuite(EventOccurrenceTest.class);
		suite.addTestSuite(ExecutionOccurrenceTest.class);
		suite.addTestSuite(StateInvariantTest.class);
		suite.addTestSuite(StopTest.class);
		suite.addTestSuite(TemplateSignatureTest.class);
		suite.addTestSuite(TemplateParameterTest.class);
		suite.addTestSuite(StringExpressionTest.class);
		suite.addTestSuite(TemplateBindingTest.class);
		suite.addTestSuite(TemplateParameterSubstitutionTest.class);
		suite.addTestSuite(OperationTemplateParameterTest.class);
		suite.addTestSuite(ClassifierTemplateParameterTest.class);
		suite.addTestSuite(RedefinableTemplateSignatureTest.class);
		suite.addTestSuite(ConnectableElementTemplateParameterTest.class);
		suite.addTestSuite(ForkNodeTest.class);
		suite.addTestSuite(JoinNodeTest.class);
		suite.addTestSuite(FlowFinalNodeTest.class);
		suite.addTestSuite(CentralBufferNodeTest.class);
		suite.addTestSuite(ActivityPartitionTest.class);
		suite.addTestSuite(ExpansionNodeTest.class);
		suite.addTestSuite(ExpansionRegionTest.class);
		suite.addTestSuite(ExceptionHandlerTest.class);
		suite.addTestSuite(InteractionOccurrenceTest.class);
		suite.addTestSuite(GateTest.class);
		suite.addTestSuite(PartDecompositionTest.class);
		suite.addTestSuite(InteractionOperandTest.class);
		suite.addTestSuite(InteractionConstraintTest.class);
		suite.addTestSuite(CombinedFragmentTest.class);
		suite.addTestSuite(ContinuationTest.class);
		suite.addTestSuite(StateMachineTest.class);
		suite.addTestSuite(RegionTest.class);
		suite.addTestSuite(PseudostateTest.class);
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(ConnectionPointReferenceTest.class);
		suite.addTestSuite(TransitionTest.class);
		suite.addTestSuite(FinalStateTest.class);
		suite.addTestSuite(CreateObjectActionTest.class);
		suite.addTestSuite(DestroyObjectActionTest.class);
		suite.addTestSuite(TestIdentityActionTest.class);
		suite.addTestSuite(ReadSelfActionTest.class);
		suite.addTestSuite(ReadStructuralFeatureActionTest.class);
		suite.addTestSuite(ClearStructuralFeatureActionTest.class);
		suite.addTestSuite(RemoveStructuralFeatureValueActionTest.class);
		suite.addTestSuite(AddStructuralFeatureValueActionTest.class);
		suite.addTestSuite(LinkEndDataTest.class);
		suite.addTestSuite(ReadLinkActionTest.class);
		suite.addTestSuite(LinkEndCreationDataTest.class);
		suite.addTestSuite(CreateLinkActionTest.class);
		suite.addTestSuite(DestroyLinkActionTest.class);
		suite.addTestSuite(ClearAssociationActionTest.class);
		suite.addTestSuite(ReadVariableActionTest.class);
		suite.addTestSuite(ClearVariableActionTest.class);
		suite.addTestSuite(AddVariableValueActionTest.class);
		suite.addTestSuite(RemoveVariableValueActionTest.class);
		suite.addTestSuite(ApplyFunctionActionTest.class);
		suite.addTestSuite(PrimitiveFunctionTest.class);
		suite.addTestSuite(SendSignalActionTest.class);
		suite.addTestSuite(BroadcastSignalActionTest.class);
		suite.addTestSuite(SendObjectActionTest.class);
		suite.addTestSuite(CallOperationActionTest.class);
		suite.addTestSuite(CallBehaviorActionTest.class);
		suite.addTestSuite(TimeExpressionTest.class);
		suite.addTestSuite(DurationTest.class);
		suite.addTestSuite(TimeObservationActionTest.class);
		suite.addTestSuite(DurationIntervalTest.class);
		suite.addTestSuite(IntervalTest.class);
		suite.addTestSuite(TimeConstraintTest.class);
		suite.addTestSuite(IntervalConstraintTest.class);
		suite.addTestSuite(TimeIntervalTest.class);
		suite.addTestSuite(DurationObservationActionTest.class);
		suite.addTestSuite(DurationConstraintTest.class);
		suite.addTestSuite(DataStoreNodeTest.class);
		suite.addTestSuite(InterruptibleActivityRegionTest.class);
		suite.addTestSuite(ParameterSetTest.class);
		suite.addTestSuite(ComponentTest.class);
		suite.addTestSuite(DeploymentTest.class);
		suite.addTestSuite(NodeTest.class);
		suite.addTestSuite(DeviceTest.class);
		suite.addTestSuite(ExecutionEnvironmentTest.class);
		suite.addTestSuite(CommunicationPathTest.class);
		suite.addTestSuite(ProtocolConformanceTest.class);
		suite.addTestSuite(ProtocolStateMachineTest.class);
		suite.addTestSuite(ProtocolTransitionTest.class);
		suite.addTestSuite(ReadExtentActionTest.class);
		suite.addTestSuite(ReclassifyObjectActionTest.class);
		suite.addTestSuite(ReadIsClassifiedObjectActionTest.class);
		suite.addTestSuite(StartOwnedBehaviorActionTest.class);
		suite.addTestSuite(QualifierValueTest.class);
		suite.addTestSuite(ReadLinkObjectEndActionTest.class);
		suite.addTestSuite(ReadLinkObjectEndQualifierActionTest.class);
		suite.addTestSuite(CreateLinkObjectActionTest.class);
		suite.addTestSuite(AcceptEventActionTest.class);
		suite.addTestSuite(AcceptCallActionTest.class);
		suite.addTestSuite(ReplyActionTest.class);
		suite.addTestSuite(RaiseExceptionActionTest.class);
		suite.addTestSuite(DeploymentSpecificationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Tests(String name) {
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

} // UML2Tests
