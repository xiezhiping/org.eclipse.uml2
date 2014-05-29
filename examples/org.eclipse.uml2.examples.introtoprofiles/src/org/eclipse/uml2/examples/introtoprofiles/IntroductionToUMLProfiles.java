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
package org.eclipse.uml2.examples.introtoprofiles;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;


/**
 * A Java program that may be run stand-alone (with the required EMF and UML2
 * bundle JARs on the classpath) to create the example profile illustrated in
 * the <em>Introduction to UML Profiles</em> article on the Wiki.
 * 
 * @see http://wiki.eclipse.org/MDT/UML2/Introduction_to_UML2_Profiles
 */
public class IntroductionToUMLProfiles {

	public static boolean DEBUG = true;

	private static File outputDir;

	private static final ResourceSet RESOURCE_SET;

	static {
		// Create a resource-set to contain the resource(s) that we load and
		// save
		RESOURCE_SET = new ResourceSetImpl();

		// Initialize registrations of resource factories, library models,
		// profiles, Ecore metadata, and other dependencies required for
		// serializing and working with UML resources. This is only necessary in
		// applications that are not hosted in the Eclipse platform run-time, in
		// which case these registrations are discovered automatically from
		// Eclipse extension points.
		UMLResourcesUtil.init(RESOURCE_SET);

	}

	/**
	 * The main program. It expects one argument, which is the local filesystem
	 * path of a directory in which to create the <tt>Ecore.profile.uml</tt>
	 * file.
	 * 
	 * @param the
	 *            program arguments, which must consist of a single filesystem
	 *            path
	 */
	public static void main(String[] args)
			throws Exception {

		if (!processArgs(args)) {
			System.exit(1);
		}

		banner("Creating root profile package and importing primitive types.");

		// Create the root profile package.
		Profile ecoreProfile = createProfile("ecore",
			"http://www.eclipse.org/schema/UML2/examples/ecore");

		// Import UML standard primitive types to be used as types of attributes
		// in our stereotypes.
		PrimitiveType booleanPrimitiveType = importPrimitiveType(ecoreProfile,
			"Boolean");
		PrimitiveType stringPrimitiveType = importPrimitiveType(ecoreProfile,
			"String");

		banner("Creating profile enumeration types.");

		// Create enumerations to be used as types of attributes in our
		// stereotypes.
		Enumeration visibilityKindEnumeration = createEnumeration(ecoreProfile,
			"VisibilityKind");
		Enumeration featureKindEnumeration = createEnumeration(ecoreProfile,
			"FeatureKind");
		createEnumerationLiteral(visibilityKindEnumeration, "Unspecified");
		createEnumerationLiteral(visibilityKindEnumeration, "None");
		createEnumerationLiteral(visibilityKindEnumeration, "ReadOnly");
		createEnumerationLiteral(visibilityKindEnumeration, "ReadWrite");
		createEnumerationLiteral(visibilityKindEnumeration,
			"ReadOnlyUnsettable");
		createEnumerationLiteral(visibilityKindEnumeration,
			"ReadWriteUnsettable");
		createEnumerationLiteral(featureKindEnumeration, "Unspecified");
		createEnumerationLiteral(featureKindEnumeration, "Simple");
		createEnumerationLiteral(featureKindEnumeration, "Attribute");
		createEnumerationLiteral(featureKindEnumeration, "Element");
		createEnumerationLiteral(featureKindEnumeration, "AttributeWildcard");
		createEnumerationLiteral(featureKindEnumeration, "ElementWildcard");
		createEnumerationLiteral(featureKindEnumeration, "Group");

		banner("Creating stereotypes.");

		// Create the stereotypes.
		Stereotype eStructuralFeatureStereotype = createStereotype(
			ecoreProfile, "EStructuralFeature", true);
		Stereotype eAttributeStereotype = createStereotype(ecoreProfile,
			"EAttribute", false);
		Stereotype eReferenceStereotype = createStereotype(ecoreProfile,
			"EReference", false);

		// Create generalization relationships amongst our stereotypes.
		createGeneralization(eAttributeStereotype, eStructuralFeatureStereotype);
		createGeneralization(eReferenceStereotype, eStructuralFeatureStereotype);

		banner("Creating attributes (\"tagged values\") of the stereotypes.");

		// Create attributes in our stereotypes.
		Property isTransientProperty = createAttribute(
			eStructuralFeatureStereotype, "isTransient", booleanPrimitiveType,
			0, 1, null);
		Property isUnsettableProperty = createAttribute(
			eStructuralFeatureStereotype, "isUnsettable", booleanPrimitiveType,
			0, 1, null);
		Property isVolatileProperty = createAttribute(
			eStructuralFeatureStereotype, "isVolatile", booleanPrimitiveType,
			0, 1, null);
		Property visibilityProperty = createAttribute(
			eStructuralFeatureStereotype, "visibility",
			visibilityKindEnumeration, 0, 1, "Unspecified");
		Property xmlNameProperty = createAttribute(
			eStructuralFeatureStereotype, "xmlName", stringPrimitiveType, 0, 1,
			null);
		Property xmlNamespaceProperty = createAttribute(
			eStructuralFeatureStereotype, "xmlNamespace", stringPrimitiveType,
			0, 1, null);
		Property xmlFeatureKindProperty = createAttribute(
			eStructuralFeatureStereotype, "xmlFeatureKind",
			featureKindEnumeration, 0, 1, "Unspecified");
		Property attributeNameProperty = createAttribute(eAttributeStereotype,
			"attributeName", stringPrimitiveType, 0, 1, null);
		Property referenceNameProperty = createAttribute(eReferenceStereotype,
			"referenceName", stringPrimitiveType, 0, 1, null);
		Property isResolveProxiesProperty = createAttribute(
			eReferenceStereotype, "isResolveProxies", booleanPrimitiveType, 0,
			1, true);

		banner("Creating metaclass extensions for the stereotypes.");

		// Reference metaclasses from UML that we will extend with our
		// stereotypes.
		org.eclipse.uml2.uml.Class propertyMetaclass = referenceMetaclass(
			ecoreProfile, UMLPackage.Literals.PROPERTY.getName());

		// Create metaclass extensions for our stereotypes.
		createExtension(propertyMetaclass, eAttributeStereotype, false);
		createExtension(propertyMetaclass, eReferenceStereotype, false);

		banner("Defining the profile (creating the Ecore metamodel).");

		// Create the Ecore definition of the profile to prepare for use.
		defineProfile(ecoreProfile);

		// Save our profile to a file in the user-specified output directory
		URI outputURI = URI.createFileURI(outputDir.getAbsolutePath())
			.appendSegment("Ecore")
			.appendFileExtension(UMLResource.PROFILE_FILE_EXTENSION);
		banner("Saving the profile to %s.", outputURI.toFileString());
		save(ecoreProfile, outputURI);

		banner("Applying the profile to an example model.");

		// Load a model to which to apply the profile
		Model epo2Model = (Model) load(URI.createFileURI(args[0])
			.appendSegment("ExtendedPO2")
			.appendFileExtension(UMLResource.FILE_EXTENSION));

		// Apply the profile to the model
		applyProfile(epo2Model, ecoreProfile);

		banner("Applying stereotypes to elements in the model.");

		// Apply stereotypes to some model elements
		org.eclipse.uml2.uml.Class supplierClass = (org.eclipse.uml2.uml.Class) epo2Model
			.getOwnedType("Supplier");
		Property pendingOrdersProperty = supplierClass.getOwnedAttribute(
			"pendingOrders", null);
		applyStereotype(pendingOrdersProperty, eReferenceStereotype);
		Property shippedOrdersProperty = supplierClass.getOwnedAttribute(
			"shippedOrders", null);
		applyStereotype(shippedOrdersProperty, eReferenceStereotype);
		org.eclipse.uml2.uml.Class customerClass = (org.eclipse.uml2.uml.Class) epo2Model
			.getOwnedType("Customer");
		Property ordersProperty = customerClass.getOwnedAttribute("orders",
			null);
		applyStereotype(ordersProperty, eReferenceStereotype);
		org.eclipse.uml2.uml.Class purchaseOrderClass = (org.eclipse.uml2.uml.Class) epo2Model
			.getOwnedType("PurchaseOrder");
		Property customerProperty = purchaseOrderClass.getOwnedAttribute(
			"customer", null);
		applyStereotype(customerProperty, eReferenceStereotype);
		Property previousOrderProperty = purchaseOrderClass.getOwnedAttribute(
			"previousOrder", null);
		applyStereotype(previousOrderProperty, eReferenceStereotype);
		Property totalAmountProperty = purchaseOrderClass.getOwnedAttribute(
			"totalAmount", null);
		// This is not a reference property
		applyStereotype(totalAmountProperty, eAttributeStereotype);

		banner("Inspecting stereotype attribute values (\"tagged values\") in the model.");

		// Inspect some stereotype property values
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isTransientProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			visibilityProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			referenceNameProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isUnsettableProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlNameProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlNamespaceProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlFeatureKindProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			attributeNameProperty);

		banner("Setting stereotype attribute values in the model.");

		// Set new values for the stereotype properties
		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isVolatileProperty, true);
		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isTransientProperty, true);
		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			visibilityProperty, "ReadWrite");
		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			referenceNameProperty, "pending");
		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty, false);
		setStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isUnsettableProperty, true);
		setStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlNameProperty, "total");
		setStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlNamespaceProperty,
			"http://www.eclipse.org/schema/UML2/examples/ecore/xml");
		setStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlFeatureKindProperty, "Element");
		setStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			attributeNameProperty, "total");

		banner("Reading new stereotype attribute values in the model.");

		// Inspect the stereotype property values again
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isTransientProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			visibilityProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			referenceNameProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isUnsettableProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlNameProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlNamespaceProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			xmlFeatureKindProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			attributeNameProperty);
	}

	//
	// Profile- and model-building utilities
	//

	protected static Profile createProfile(String name, String nsURI) {
		Profile profile = UMLFactory.eINSTANCE.createProfile();
		profile.setName(name);
		profile.setURI(nsURI);

		out("Profile '%s' created.", profile.getQualifiedName());

		return profile;
	}

	protected static PrimitiveType importPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {

		org.eclipse.uml2.uml.Package umlLibrary = (org.eclipse.uml2.uml.Package) load(URI
			.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

		PrimitiveType primitiveType = (PrimitiveType) umlLibrary
			.getOwnedType(name);

		package_.createElementImport(primitiveType);

		out("Primitive type '%s' imported.", primitiveType.getQualifiedName());

		return primitiveType;
	}

	protected static Enumeration createEnumeration(
			org.eclipse.uml2.uml.Package package_, String name) {

		Enumeration enumeration = package_.createOwnedEnumeration(name);

		out("Enumeration '%s' created.", enumeration.getQualifiedName());

		return enumeration;
	}

	protected static EnumerationLiteral createEnumerationLiteral(
			Enumeration enumeration, String name) {

		EnumerationLiteral enumerationLiteral = enumeration
			.createOwnedLiteral(name);

		out("Enumeration literal '%s' created.",
			enumerationLiteral.getQualifiedName());

		return enumerationLiteral;
	}

	protected static Stereotype createStereotype(Profile profile, String name,
			boolean isAbstract) {

		Stereotype stereotype = profile.createOwnedStereotype(name, isAbstract);

		out("Stereotype '%s' created.", stereotype.getQualifiedName());

		return stereotype;
	}

	protected static Generalization createGeneralization(
			Classifier specificClassifier, Classifier generalClassifier) {

		Generalization generalization = specificClassifier
			.createGeneralization(generalClassifier);

		out("Generalization %s --|> %s created.",
			specificClassifier.getQualifiedName(),
			generalClassifier.getQualifiedName());

		return generalization;
	}

	protected static Property createAttribute(
			org.eclipse.uml2.uml.Class class_, String name, Type type,
			int lowerBound, int upperBound, Object defaultValue) {

		Property attribute = class_.createOwnedAttribute(name, type,
			lowerBound, upperBound);

		if (defaultValue instanceof Boolean) {
			LiteralBoolean literal = (LiteralBoolean) attribute
				.createDefaultValue(null, null,
					UMLPackage.Literals.LITERAL_BOOLEAN);
			literal.setValue(((Boolean) defaultValue).booleanValue());
		} else if (defaultValue instanceof String) {
			if (type instanceof Enumeration) {
				InstanceValue value = (InstanceValue) attribute
					.createDefaultValue(null, null,
						UMLPackage.Literals.INSTANCE_VALUE);
				value.setInstance(((Enumeration) type)
					.getOwnedLiteral((String) defaultValue));
			} else {
				LiteralString literal = (LiteralString) attribute
					.createDefaultValue(null, null,
						UMLPackage.Literals.LITERAL_STRING);
				literal.setValue((String) defaultValue);
			}
		}

		out("Attribute '%s' : %s [%s..%s]%s created.", //
			attribute.getQualifiedName(), // attribute name
			type.getQualifiedName(), // type name
			lowerBound, // no special case for multiplicity lower bound
			(upperBound == LiteralUnlimitedNatural.UNLIMITED)
				? "*" // special case for unlimited bound
				: upperBound, // finite upper bound
			(defaultValue == null)
				? "" // no default value (use type's intrinsic default)
				: String.format(" = %s", defaultValue));

		return attribute;
	}

	protected static org.eclipse.uml2.uml.Class referenceMetaclass(
			Profile profile, String name) {

		Model umlMetamodel = (Model) load(URI
			.createURI(UMLResource.UML_METAMODEL_URI));

		org.eclipse.uml2.uml.Class metaclass = (org.eclipse.uml2.uml.Class) umlMetamodel
			.getOwnedType(name);

		profile.createMetaclassReference(metaclass);

		out("Metaclass '%s' referenced.", metaclass.getQualifiedName());

		return metaclass;
	}

	protected static Extension createExtension(
			org.eclipse.uml2.uml.Class metaclass, Stereotype stereotype,
			boolean required) {

		Extension extension = stereotype.createExtension(metaclass, required);

		out("%sxtension '%s' created.", //
			required
				? "Required e" // it's a required extension
				: "E", // an optional extension
			extension.getQualifiedName());

		return extension;
	}

	protected static void defineProfile(Profile profile) {
		profile.define();

		out("Profile '%s' defined.", profile.getQualifiedName());
	}

	protected static void applyProfile(org.eclipse.uml2.uml.Package package_,
			Profile profile) {

		package_.applyProfile(profile);

		out("Profile '%s' applied to package '%s'.",
			profile.getQualifiedName(), package_.getQualifiedName());
	}

	protected static void applyStereotype(NamedElement namedElement,
			Stereotype stereotype) {

		namedElement.applyStereotype(stereotype);

		out("Stereotype '%s' applied to element '%s'.",
			stereotype.getQualifiedName(), namedElement.getQualifiedName());
	}

	protected static Object getStereotypePropertyValue(
			NamedElement namedElement, Stereotype stereotype, Property property) {

		Object value = namedElement.getValue(stereotype, property.getName());

		out("Value of stereotype property '%s' on element '%s' is %s.",
			property.getQualifiedName(), namedElement.getQualifiedName(), value);

		return value;
	}

	protected static void setStereotypePropertyValue(NamedElement namedElement,
			Stereotype stereotype, Property property, Object value) {

		Object valueToSet = value;

		if ((value instanceof String)
			&& (property.getType() instanceof Enumeration)) {
			// Get the corresponding enumeration literal
			valueToSet = ((Enumeration) property.getType())
				.getOwnedLiteral((String) value);
		}

		namedElement.setValue(stereotype, property.getName(), valueToSet);

		out("Value of stereotype property '%s' on element '%s' set to %s.",
			property.getQualifiedName(), namedElement.getQualifiedName(), value);
	}

	//
	// Program control
	//

	private static boolean processArgs(String[] args)
			throws IOException {

		if (args.length != 1) {
			err("Expected 1 argument.");
			err("Usage: java -jar ... %s <dir>",
				IntroductionToUMLProfiles.class.getSimpleName());
			err("where");
			err("<dir> - path to output folder in which to save the UML profile");
			return false;
		}

		outputDir = new File(args[0]).getCanonicalFile();
		if (!outputDir.exists()) {
			err("No such directory: %s", outputDir.getAbsolutePath());
			return false;
		}

		if (!outputDir.isDirectory()) {
			err("Not a directory: %s", outputDir.getAbsolutePath());
			return false;
		}

		if (!outputDir.canWrite()) {
			err("Cannot create a file in directory: %s",
				outputDir.getAbsolutePath());
			return false;
		}

		return true;
	}

	protected static void save(org.eclipse.uml2.uml.Package package_, URI uri) {
		// Create the resource to be saved and add the package to it
		Resource resource = RESOURCE_SET.createResource(uri);
		resource.getContents().add(package_);

		// And save.
		try {
			resource.save(null);
			out("Done.");
		} catch (IOException ioe) {
			err(ioe.getMessage());
		}
	}

	protected static org.eclipse.uml2.uml.Package load(URI uri) {
		org.eclipse.uml2.uml.Package package_ = null;

		try {
			// Load the requested resource
			Resource resource = RESOURCE_SET.getResource(uri, true);

			// Get the first (should be only) package from it
			package_ = (org.eclipse.uml2.uml.Package) EcoreUtil
				.getObjectByType(resource.getContents(),
					UMLPackage.Literals.PACKAGE);
		} catch (WrappedException we) {
			err(we.getMessage());
			System.exit(1);
		}

		return package_;
	}

	//
	// Logging utilities
	//

	protected static void banner(String format, Object... args) {
		System.out.println();
		hrule();

		System.out.printf(format, args);
		if (!format.endsWith("%n")) {
			System.out.println();
		}

		hrule();
		System.out.println();
	}

	protected static void hrule() {
		System.out.println("------------------------------------");
	}

	protected static void out(String format, Object... args) {
		if (DEBUG) {
			System.out.printf(format, args);
			if (!format.endsWith("%n")) {
				System.out.println();
			}
		}
	}

	protected static void err(String format, Object... args) {
		System.err.printf(format, args);
		if (!format.endsWith("%n")) {
			System.err.println();
		}
	}
}
