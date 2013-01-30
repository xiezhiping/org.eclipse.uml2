/*
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 399544
 */
package org.eclipse.uml2.uml.bug.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Test suite for the changes introduced for Bug 392833.
 * 
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=392833
 */
public class Bug392833Test
		extends TestCase {

	private final UMLUtilAccess util = new UMLUtilAccess();

	private ResourceSet rset;

	private Profile profile;

	/**
	 * Initializes me with my name.
	 * 
	 * @param name
	 *            my name
	 */
	public Bug392833Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug392833Test.class, "Bug 392833 tests"); //$NON-NLS-1$
	}

	/**
	 * Test that Ecore definitions correctly resolve to their UML counterparts
	 * when the Ecore definition resides separately in a package registry as it
	 * does in the CDO context.
	 */
	public void test_emulatingCDOPackageRegistry()
			throws IOException {

		Stereotype bean = profile.getOwnedStereotype("Bean"); //$NON-NLS-1$
		EPackage definition = profile.define();
		EPackage copy = makeUMLReferencesUnresolvable(EcoreUtil
			.copy(definition));
		Resource res = new EcoreResourceFactoryImpl().createResource(URI
			.createURI(definition.getNsURI()));
		res.getContents().add(copy);
		profile.eResource().getResourceSet().getPackageRegistry()
			.put(copy.getNsURI(), copy);

		Model model = createModel();
		model.applyProfile(profile);
		
		profile.define(); // define it again to try to confuse the profile look-up
		
		Class myEJB = model.createOwnedClass("MyEJB", false); //$NON-NLS-1$
		myEJB.applyStereotype(bean);

		assertTrue("Stereotype not properly applied.", //$NON-NLS-1$
			myEJB.isStereotypeApplied(bean));

		// note that this API requires the Ecore name
		myEJB.setValue(bean, "type", "session"); //$NON-NLS-1$ //$NON-NLS-2$

		// reload from fake storage in which the xsi:schemaLocation is *not*
		// used (the schema implicitly resolves from the package registry).
		// This emulates the CDO package registry structure
		String text = serialize(model.eResource());
		text = text.replaceFirst("\\s*xsi:schemaLocation=\"[^\"]+\"", ""); //$NON-NLS-1$ //$NON-NLS-2$
		model = reload(model.eResource(), text, UMLPackage.Literals.MODEL);

		// stereotype is still applied
		myEJB = (Class) model.getOwnedType("MyEJB"); //$NON-NLS-1$
		assertTrue("Stereotype not properly applied.", //$NON-NLS-1$
			myEJB.isStereotypeApplied(bean));

		// note that this API requires the Ecore name
		assertEquals("session", String.valueOf(myEJB.getValue(bean, "type"))); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public void test_profileDefinitionsAccess() {
		EPackage discombobulatedPackage = makeUMLReferencesUnresolvable(EcoreUtil
			.copy(profile.define()));

		Model model = createModel();
		model.applyProfile(profile);

		assertEEquals(discombobulatedPackage, profile.getDefinition());
		assertSame(profile,
			util.access_getNamedElement(discombobulatedPackage, model));

		EClass ejb = (EClass) discombobulatedPackage.getEClassifier("EJB"); //$NON-NLS-1$
		assertNotNull(ejb);
		Stereotype bean = profile.getOwnedStereotype("Bean"); //$NON-NLS-1$
		assertEEquals(ejb, profile.getDefinition(bean));
		assertSame(bean, util.access_getNamedElement(ejb, model));

		EStructuralFeature type = ejb.getEStructuralFeature("type"); //$NON-NLS-1$
		assertNotNull(type);
		Property kind = bean.getOwnedAttribute("kind", null); //$NON-NLS-1$
		assertEEquals(type, profile.getDefinition(kind));
		assertSame(kind, util.access_getNamedElement(type, model));

		EEnum ejbKind = (EEnum) discombobulatedPackage
			.getEClassifier("EJBKind"); //$NON-NLS-1$
		assertNotNull(ejbKind);
		Enumeration beanKind = (Enumeration) profile.getOwnedType("BeanKind"); //$NON-NLS-1$
		assertEEquals(ejbKind, profile.getDefinition(beanKind));
		assertSame(beanKind, util.access_getNamedElement(ejbKind, model));

		EEnumLiteral eLiteral = ejbKind.getEEnumLiteral("messagedriven"); //$NON-NLS-1$
		assertNotNull(eLiteral);
		EnumerationLiteral literal = beanKind.getOwnedLiteral("messagedriven"); //$NON-NLS-1$
		assertEEquals(eLiteral, profile.getDefinition(literal));
		assertSame(literal, util.access_getNamedElement(eLiteral, model));
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

	protected void assertEEquals(EObject obj1, EObject obj2) {
		new EcoreUtil.EqualityHelper() {

			private static final long serialVersionUID = 1L;

			protected boolean haveEqualReference(EObject eObject1,
					EObject eObject2, EReference reference) {

				// don't look at annotation references because we made the
				// unresolvable in the copy
				return (reference == EcorePackage.Literals.EANNOTATION__REFERENCES)
					|| super.haveEqualReference(eObject1, eObject2, reference);
			}
		}.equals(obj1, obj2);
	}

	Profile getTestProfile() {
		URL url = getClass().getResource("Bug392833.profile.uml"); //$NON-NLS-1$
		return (Profile) UML2Util.load(rset,
			URI.createURI(url.toExternalForm()), UMLPackage.Literals.PROFILE);
	}

	EPackage makeUMLReferencesUnresolvable(EPackage ecoreDefinition) {
		for (EClassifier next : ecoreDefinition.getEClassifiers()) {
			EAnnotation annotation = next
				.getEAnnotation(UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI);

			assertNotNull("Missing annotation", annotation); //$NON-NLS-1$
			assertEquals("Expected exactly one UML reference", 1, annotation //$NON-NLS-1$
				.getReferences().size());

			// replace the UML classifier reference with an unresolvable proxy
			EObject proxy = EcoreFactory.eINSTANCE.createEObject();
			((InternalEObject) proxy).eSetProxyURI(URI
				.createURI("test://bogus/" + next.getName())); //$NON-NLS-1$
			annotation.getReferences().set(0, proxy);
		}

		return ecoreDefinition;
	}

	Model createModel() {
		Resource res = UMLResource.Factory.INSTANCE.createResource(URI
			.createURI("temp://model.uml")); //$NON-NLS-1$
		rset.getResources().add(res);

		// "temp" URI scheme is fake, so force-create resource
		Model result = UMLFactory.eINSTANCE.createModel();
		res.getContents().add(result);
		return result;
	}

	String serialize(Resource res)
			throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream(2048);

		try {
			res.save(out, null);
			return new String(out.toByteArray(), "UTF-8"); //$NON-NLS-1$
		} finally {
			out.close();
		}
	}

	<T> T reload(Resource resource, String text, EClass rootClass)
			throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream(
			text.getBytes("UTF-8")); //$NON-NLS-1$

		resource.unload();

		try {
			resource.load(in, null);
			return UMLUtil.load(rset, resource.getURI(), rootClass);
		} finally {
			in.close();
		}
	}

	private static class UMLUtilAccess
			extends UMLUtil {

		NamedElement access_getNamedElement(ENamedElement definition,
				EObject context) {
			return getNamedElement(definition, context);
		}
	}
}
