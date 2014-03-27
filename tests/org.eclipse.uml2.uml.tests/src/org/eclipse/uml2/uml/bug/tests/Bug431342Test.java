/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Tests migration of profile-defined DataType EClasses between compatible
 * versions.
 */
public class Bug431342Test
		extends TestCase {

	private ResourceSet rset;

	private Element fixture;

	private Profile profile;

	private Stereotype stereo;

	private EClass multiplicityDataType;

	private EAttribute lower;

	private EAttribute upper;

	public Bug431342Test() {
		super();
	}

	public Bug431342Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug431342Test.class, "Bug 431342 tests"); //$NON-NLS-1$
	}

	//
	// Tests
	//

	public void testPreserveCompatibleDataTypeAttributes() {
		EObject multiplicity = EcoreUtil.create(multiplicityDataType);
		multiplicity.eSet(lower, 0);
		multiplicity.eSet(upper, 2);

		fixture.setValue(stereo, "multiplicity", multiplicity);

		// make an innocuous change to the profile, re-define it, and re-apply
		stereo.createOwnedAttribute("strict", getUMLPrimitiveType("Boolean"));
		defineProfile();
		applyProfile();

		multiplicity = (EObject) fixture.getValue(stereo, "multiplicity");
		assertNotNull(multiplicity);
		assertEquals("Wrong lower value", 0, multiplicity.eGet(lower));
		assertEquals("Wrong upper value", 2, multiplicity.eGet(upper));
	}

	//
	// Test framework
	//

	@Override
	protected void setUp()
			throws Exception {

		rset = new ResourceSetImpl();
		if (StandaloneSupport.isStandalone()) {
			StandaloneSupport.init(rset);
		}

		Resource res = rset.createResource(URI.createURI("bogus:///test.uml"));

		Package pkg = UMLFactory.eINSTANCE.createPackage();
		pkg.setName("pkg");
		res.getContents().add(pkg);

		fixture = pkg.createOwnedClass("Foo", false);

		URL profileURL = getClass().getResource("Bug431342.profile.uml");
		profile = UML2Util.load(rset,
			URI.createURI(profileURL.toExternalForm(), true),
			UMLPackage.Literals.PROFILE);
		stereo = profile.getOwnedStereotype("Multiple");

		applyProfile();
		fixture.applyStereotype(stereo);
	}

	@Override
	protected void tearDown()
			throws Exception {

		// clean up the CacheAdapter as well as we can
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	protected void defineProfile() {
		profile.define();
	}

	protected void applyProfile() {
		fixture.getNearestPackage().applyProfile(profile);

		// extract the definitions
		multiplicityDataType = (EClass) profile.getDefinition(profile
			.getOwnedType("Multiplicity"));
		lower = (EAttribute) multiplicityDataType
			.getEStructuralFeature("lower");
		upper = (EAttribute) multiplicityDataType
			.getEStructuralFeature("upper");
	}

	protected Type getUMLPrimitiveType(String name) {
		Package types = UML2Util.load(rset,
			URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI),
			UMLPackage.Literals.PACKAGE);
		return types.getOwnedType(name);
	}
}
