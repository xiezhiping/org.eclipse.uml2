/*
 * Copyright (c) 2012 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 */
package org.eclipse.uml2.uml.validation.tests;

import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintFilter;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test suite for the {@link DelegatingConstraintProvider} class and attendant
 * classes.
 */
public class DelegatingConstraintProviderTest
		extends TestCase {

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public DelegatingConstraintProviderTest(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(DelegatingConstraintProviderTest.class,
			"Delegating constraint provider tests"); //$NON-NLS-1$
	}

	public void test_constraintsCategorized() {
		Category testCategory = CategoryManager.getInstance().getCategory(
			"org.eclipse.uml2.uml.tests"); //$NON-NLS-1$

		boolean found = false;
		for (IConstraintDescriptor next : testCategory.getConstraints()) {
			if (next.getClass().getSimpleName()
				.equals("DelegatingConstraintDescriptor")) { //$NON-NLS-1$
				found = true;
				break;
			}
		}

		assertTrue(
			"Didn't find any UML constraints in the test category", found); //$NON-NLS-1$
	}

	public void test_providedConstraintsRun() {
		Package package_ = UMLFactory.eINSTANCE.createPackage();
		Component component = (Component) package_.createOwnedType(
			"MyComponent", UMLPackage.Literals.COMPONENT); //$NON-NLS-1$
		Actor user = (Actor) package_.createOwnedType("User", //$NON-NLS-1$
			UMLPackage.Literals.ACTOR);
		Generalization generalization = user.createGeneralization(component);

		// actor does not have a name. It must. Only check this constraint
		IBatchValidator validator = ModelValidationService.getInstance()
			.newValidator(EvaluationMode.BATCH);
		validator.addConstraintFilter(new NameFilter("SpecializeType")); //$NON-NLS-1$

		IStatus status = validator.validate(package_);

		assertTrue(
			"Validation should not have passed.", status.getSeverity() >= IStatus.WARNING); //$NON-NLS-1$
		assertProblemOn(status, user);

		generalization.setGeneral((Actor) package_.createOwnedType("Sys Admin", //$NON-NLS-1$
			UMLPackage.Literals.ACTOR));
		status = validator.validate(package_);

		assertNoProblemOn(status, user);
	}

	//
	// Test framework
	//

	@Override
	protected void setUp()
			throws Exception {
		super.setUp();

		TestClientContextSelector.turnOn();

		// poke the framework to make sure that our provider loads its
		// constraints
		ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH)
			.validate(UMLFactory.eINSTANCE.createPackage());
	}

	@Override
	protected void tearDown()
			throws Exception {
		TestClientContextSelector.turnOff();

		super.tearDown();
	}

	IConstraintStatus findStatusOf(IStatus status, EObject object) {
		IConstraintStatus result = null;

		if (status instanceof IConstraintStatus) {
			IConstraintStatus candidate = (IConstraintStatus) status;

			if (candidate.getTarget() == object) {
				result = candidate;
			}
		}

		if ((result == null) && status.isMultiStatus()) {
			for (IStatus next : status.getChildren()) {
				result = findStatusOf(next, object);

				if (result != null) {
					break;
				}
			}
		}

		return result;
	}

	void assertProblemOn(IStatus status, EObject object) {
		IConstraintStatus specific = findStatusOf(status, object);

		if (specific == null) {
			fail("No status for object " + object); //$NON-NLS-1$
		}

		assertFalse("Status is not a problem", specific.isOK()); //$NON-NLS-1$
	}

	void assertNoProblemOn(IStatus status, EObject object) {
		IConstraintStatus specific = findStatusOf(status, object);

		if (specific != null) {
			assertTrue("Status is a problem", specific.isOK()); //$NON-NLS-1$
		}
	}

	//
	// Nested types
	//

	static class NameFilter
			implements IConstraintFilter {

		private final Pattern pattern;

		NameFilter(String pattern) {
			this.pattern = Pattern.compile(pattern);
		}

		public boolean accept(IConstraintDescriptor constraint, EObject target) {
			return pattern.matcher(constraint.getName()).find();
		}
	}
}
