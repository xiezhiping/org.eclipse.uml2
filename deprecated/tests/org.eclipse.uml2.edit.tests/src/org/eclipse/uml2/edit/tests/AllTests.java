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
 * $Id: AllTests.java,v 1.8 2004/06/06 01:23:32 khussey Exp $
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
import org.eclipse.uml2.provider.tests.ActivityItemProviderTest;
import org.eclipse.uml2.provider.tests.ActorItemProviderTest;
import org.eclipse.uml2.provider.tests.ArtifactItemProviderTest;
import org.eclipse.uml2.provider.tests.AssociationClassItemProviderTest;
import org.eclipse.uml2.provider.tests.AssociationItemProviderTest;
import org.eclipse.uml2.provider.tests.ClassItemProviderTest;
import org.eclipse.uml2.provider.tests.ClassifierTemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.CollaborationItemProviderTest;
import org.eclipse.uml2.provider.tests.CommunicationPathItemProviderTest;
import org.eclipse.uml2.provider.tests.ComponentItemProviderTest;
import org.eclipse.uml2.provider.tests.ConnectableElementTemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.ConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.DataTypeItemProviderTest;
import org.eclipse.uml2.provider.tests.DependencyItemProviderTest;
import org.eclipse.uml2.provider.tests.DeploymentItemProviderTest;
import org.eclipse.uml2.provider.tests.DeploymentSpecificationItemProviderTest;
import org.eclipse.uml2.provider.tests.DeviceItemProviderTest;
import org.eclipse.uml2.provider.tests.DurationConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.DurationIntervalItemProviderTest;
import org.eclipse.uml2.provider.tests.DurationItemProviderTest;
import org.eclipse.uml2.provider.tests.EnumerationItemProviderTest;
import org.eclipse.uml2.provider.tests.EnumerationLiteralItemProviderTest;
import org.eclipse.uml2.provider.tests.ExecutionEnvironmentItemProviderTest;
import org.eclipse.uml2.provider.tests.ExpressionItemProviderTest;
import org.eclipse.uml2.provider.tests.ExtensionEndItemProviderTest;
import org.eclipse.uml2.provider.tests.ExtensionItemProviderTest;
import org.eclipse.uml2.provider.tests.GeneralizationSetItemProviderTest;
import org.eclipse.uml2.provider.tests.ImplementationItemProviderTest;
import org.eclipse.uml2.provider.tests.InformationFlowItemProviderTest;
import org.eclipse.uml2.provider.tests.InformationItemItemProviderTest;
import org.eclipse.uml2.provider.tests.InstanceSpecificationItemProviderTest;
import org.eclipse.uml2.provider.tests.InstanceValueItemProviderTest;
import org.eclipse.uml2.provider.tests.InteractionConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.InteractionItemProviderTest;
import org.eclipse.uml2.provider.tests.InterfaceItemProviderTest;
import org.eclipse.uml2.provider.tests.IntervalConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.IntervalItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralBooleanItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralIntegerItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralNullItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralStringItemProviderTest;
import org.eclipse.uml2.provider.tests.LiteralUnlimitedNaturalItemProviderTest;
import org.eclipse.uml2.provider.tests.ManifestationItemProviderTest;
import org.eclipse.uml2.provider.tests.ModelItemProviderTest;
import org.eclipse.uml2.provider.tests.NodeItemProviderTest;
import org.eclipse.uml2.provider.tests.OpaqueExpressionItemProviderTest;
import org.eclipse.uml2.provider.tests.OperationItemProviderTest;
import org.eclipse.uml2.provider.tests.OperationTemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.PackageItemProviderTest;
import org.eclipse.uml2.provider.tests.ParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.PermissionItemProviderTest;
import org.eclipse.uml2.provider.tests.PortItemProviderTest;
import org.eclipse.uml2.provider.tests.PrimitiveFunctionItemProviderTest;
import org.eclipse.uml2.provider.tests.PrimitiveTypeItemProviderTest;
import org.eclipse.uml2.provider.tests.ProfileApplicationItemProviderTest;
import org.eclipse.uml2.provider.tests.ProfileItemProviderTest;
import org.eclipse.uml2.provider.tests.PropertyItemProviderTest;
import org.eclipse.uml2.provider.tests.ProtocolStateMachineItemProviderTest;
import org.eclipse.uml2.provider.tests.ProtocolTransitionItemProviderTest;
import org.eclipse.uml2.provider.tests.RealizationItemProviderTest;
import org.eclipse.uml2.provider.tests.RedefinableTemplateSignatureItemProviderTest;
import org.eclipse.uml2.provider.tests.SignalItemProviderTest;
import org.eclipse.uml2.provider.tests.StateMachineItemProviderTest;
import org.eclipse.uml2.provider.tests.StereotypeItemProviderTest;
import org.eclipse.uml2.provider.tests.SubstitutionItemProviderTest;
import org.eclipse.uml2.provider.tests.TemplateParameterItemProviderTest;
import org.eclipse.uml2.provider.tests.TemplateParameterSubstitutionItemProviderTest;
import org.eclipse.uml2.provider.tests.TemplateSignatureItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeConstraintItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeExpressionItemProviderTest;
import org.eclipse.uml2.provider.tests.TimeIntervalItemProviderTest;
import org.eclipse.uml2.provider.tests.UsageItemProviderTest;
import org.eclipse.uml2.provider.tests.UseCaseItemProviderTest;
import org.eclipse.uml2.provider.tests.VariableItemProviderTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for '<em><b>UML2</b></em>' edit support.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllTests extends TestSuite {

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
	public static Test suite() {
		TestSuite suite = new AllTests("UML2 Edit Tests"); //$NON-NLS-1$            
		suite.addTestSuite(ClassItemProviderTest.class);        
		suite.addTestSuite(PropertyItemProviderTest.class);    
		suite.addTestSuite(OperationItemProviderTest.class);        
		suite.addTestSuite(ParameterItemProviderTest.class);        
		suite.addTestSuite(PackageItemProviderTest.class);    
		suite.addTestSuite(EnumerationItemProviderTest.class);    
		suite.addTestSuite(DataTypeItemProviderTest.class);    
		suite.addTestSuite(EnumerationLiteralItemProviderTest.class);    
		suite.addTestSuite(PrimitiveTypeItemProviderTest.class);            
		suite.addTestSuite(OpaqueExpressionItemProviderTest.class);        
		suite.addTestSuite(ExpressionItemProviderTest.class);            
		suite.addTestSuite(LiteralBooleanItemProviderTest.class);        
		suite.addTestSuite(LiteralStringItemProviderTest.class);    
		suite.addTestSuite(LiteralNullItemProviderTest.class);    
		suite.addTestSuite(LiteralIntegerItemProviderTest.class);    
		suite.addTestSuite(LiteralUnlimitedNaturalItemProviderTest.class);    
		suite.addTestSuite(ConstraintItemProviderTest.class);                            
		suite.addTestSuite(InstanceSpecificationItemProviderTest.class);        
		suite.addTestSuite(InstanceValueItemProviderTest.class);                
		suite.addTestSuite(AssociationItemProviderTest.class);        
		suite.addTestSuite(StereotypeItemProviderTest.class);    
		suite.addTestSuite(ProfileItemProviderTest.class);    
		suite.addTestSuite(ProfileApplicationItemProviderTest.class);    
		suite.addTestSuite(ExtensionItemProviderTest.class);    
		suite.addTestSuite(ExtensionEndItemProviderTest.class);    
		suite.addTestSuite(AssociationClassItemProviderTest.class);            
		suite.addTestSuite(ActivityItemProviderTest.class);    
		suite.addTestSuite(GeneralizationSetItemProviderTest.class);    
		suite.addTestSuite(ModelItemProviderTest.class);    
		suite.addTestSuite(InformationItemItemProviderTest.class);    
		suite.addTestSuite(InformationFlowItemProviderTest.class);    
		suite.addTestSuite(PermissionItemProviderTest.class);    
		suite.addTestSuite(DependencyItemProviderTest.class);    
		suite.addTestSuite(UsageItemProviderTest.class);    
		suite.addTestSuite(AbstractionItemProviderTest.class);    
		suite.addTestSuite(RealizationItemProviderTest.class);    
		suite.addTestSuite(SubstitutionItemProviderTest.class);    
		suite.addTestSuite(ArtifactItemProviderTest.class);    
		suite.addTestSuite(ManifestationItemProviderTest.class);    
		suite.addTestSuite(ActorItemProviderTest.class);        
		suite.addTestSuite(UseCaseItemProviderTest.class);                                                                                        
		suite.addTestSuite(InterfaceItemProviderTest.class);    
		suite.addTestSuite(ImplementationItemProviderTest.class);                    
		suite.addTestSuite(TemplateSignatureItemProviderTest.class);    
		suite.addTestSuite(TemplateParameterItemProviderTest.class);                    
		suite.addTestSuite(TemplateParameterSubstitutionItemProviderTest.class);    
		suite.addTestSuite(CollaborationItemProviderTest.class);    
		suite.addTestSuite(OperationTemplateParameterItemProviderTest.class);    
		suite.addTestSuite(ClassifierTemplateParameterItemProviderTest.class);        
		suite.addTestSuite(RedefinableTemplateSignatureItemProviderTest.class);        
		suite.addTestSuite(ConnectableElementTemplateParameterItemProviderTest.class);                        
		suite.addTestSuite(SignalItemProviderTest.class);                
		suite.addTestSuite(InteractionItemProviderTest.class);                                        
		suite.addTestSuite(VariableItemProviderTest.class);                    
		suite.addTestSuite(PortItemProviderTest.class);            
		suite.addTestSuite(StateMachineItemProviderTest.class);                                                
		suite.addTestSuite(InteractionConstraintItemProviderTest.class);                                                                                                                
		suite.addTestSuite(PrimitiveFunctionItemProviderTest.class);                                                                
		suite.addTestSuite(TimeExpressionItemProviderTest.class);    
		suite.addTestSuite(DurationItemProviderTest.class);        
		suite.addTestSuite(DurationIntervalItemProviderTest.class);    
		suite.addTestSuite(IntervalItemProviderTest.class);    
		suite.addTestSuite(TimeConstraintItemProviderTest.class);    
		suite.addTestSuite(IntervalConstraintItemProviderTest.class);    
		suite.addTestSuite(TimeIntervalItemProviderTest.class);        
		suite.addTestSuite(DurationConstraintItemProviderTest.class);                                                    
		suite.addTestSuite(DeploymentItemProviderTest.class);            
		suite.addTestSuite(NodeItemProviderTest.class);    
		suite.addTestSuite(DeviceItemProviderTest.class);    
		suite.addTestSuite(ExecutionEnvironmentItemProviderTest.class);    
		suite.addTestSuite(CommunicationPathItemProviderTest.class);    
		suite.addTestSuite(ComponentItemProviderTest.class);                    
		suite.addTestSuite(ProtocolStateMachineItemProviderTest.class);    
		suite.addTestSuite(ProtocolTransitionItemProviderTest.class);    
		suite.addTestSuite(DeploymentSpecificationItemProviderTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTests(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestSuite#addTestSuite(java.lang.Class)
	 */
	public void addTestSuite(final Class testClass) {
		TestSuite suite = new TestSuite();

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

		if (0 == suite.testCount()) {
			suite.addTest(warning("No tests found in " + testClass.getName())); //$NON-NLS-1$
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

}
