/*
 * Copyright (c) 2013 Yatta Solutions GmbH and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Manuel Bork <bork@yatta.de> (Yatta Solutions GmbH) - initial API and implementation
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Test suite for the changes introduced for Bug 422000.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=422000
 */
public class Bug422000Test
		extends TestCase {

	private ResourceSet rset;

	private Profile profile;

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public Bug422000Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug422000Test.class, "Bug 422000 tests"); //$NON-NLS-1$
	}

	public void test_ApplyStereotypeOnElementContainedInMetaClass() {

		profile.define();

		// create a Model, apply the Profile
		Model model = createModel();
		model.applyProfile(profile);

		// create a Class, apply the Stereotype on it
		Class foo = model.createOwnedClass("foo", false);
		Stereotype stereotype = profile.getOwnedStereotype("SomeStereotype"); //$NON-NLS-1$
		EObject stereotypeApplication = foo.applyStereotype(stereotype);

		// link stereotypeApplication with an instance of Type 'SomeMetaClass'
		EClass someMetaClass = (EClass) profile.getDefinition().getEClassifier(
			"SomeMetaClass");
		EObject someMetaClassObject = someMetaClass.getEPackage()
			.getEFactoryInstance().create(someMetaClass);
		EStructuralFeature stereotypeToMetaClassFeature = stereotypeApplication
			.eClass().getEStructuralFeature("stereotypeToMetaClass");
		stereotypeApplication.eSet(stereotypeToMetaClassFeature,
			someMetaClassObject);

		// link someMetaClassObject with another instance of Class ('bar')
		Class bar = UMLFactory.eINSTANCE.createClass();
		bar.setName("bar");
		EStructuralFeature metaClassToUMLClassFeature = someMetaClass
			.getEStructuralFeature("metaClassToUMLClass");
		someMetaClassObject.eSet(metaClassToUMLClassFeature, bar);

		// apply the stereotype on the Class 'bar'
		EObject eObject = bar.applyStereotype(stereotype);
		assertNotNull(eObject);
	}

	private Model createModel() {
		Resource res = UMLResource.Factory.INSTANCE.createResource(URI
			.createURI("temp://model.uml")); //$NON-NLS-1$
		rset.getResources().add(res);

		// "temp" URI scheme is fake, so force-create resource
		Model result = UMLFactory.eINSTANCE.createModel();
		res.getContents().add(result);
		return result;
	}

	private Profile getTestProfile() {
		URL url = getClass().getResource("Bug422000.profile.uml"); //$NON-NLS-1$
		return (Profile) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PROFILE);
	}

	@Override
	protected void setUp()
			throws Exception {

		rset = new ResourceSetImpl();

		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}

		profile = getTestProfile();
	}

	@Override
	protected void tearDown()
			throws Exception {

		profile = null;

		for (Resource next : rset.getResources()) {
			next.unload();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
		rset = null;
	}
}
