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
 * $Id: ProfileOperations.java,v 1.10 2004/11/02 15:30:10 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.InstanceValue;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.util.UML2Resource;

/**
 * A static utility class that provides operations related to profiles.
 */
public final class ProfileOperations
	extends UML2Operations {

	/**
	 * The source for the attributes annotation on profiles.
	 */
	public static final String ANNOTATION_SOURCE__ATTRIBUTES = "attributes"; //$NON-NLS-1$

	/**
	 * The source for the ePackages annotation on profiles.
	 */
	public static final String ANNOTATION_SOURCE__E_PACKAGES = "ePackages"; //$NON-NLS-1$

	/**
	 * The key for the version details entry in the attributes annotation on
	 * profiles.
	 */
	public static final String ANNOTATION_DETAILS_KEY__VERSION = "version"; //$NON-NLS-1$

	/**
	 * The default URI converter for resource bundle look-ups.
	 */
	private static final URIConverter DEFAULT_URI_CONVERTER = new URIConverterImpl();

	/**
	 * A cache of locales per profile.
	 */
	private static final Map PROFILE_LOCALES = Collections
		.synchronizedMap(new HashMap());

	/**
	 * A cache of resource bundles per profile.
	 */
	private static final Map PROFILE_RESOURCE_BUNDLES = Collections
		.synchronizedMap(new HashMap());

	/**
	 * Constructs a new Profile Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ProfileOperations() {
		super();
	}

	/**
	 * Retrieves a name suitable for an Ecore representation of the specified
	 * named element.
	 * 
	 * @param namedElement
	 *            The named element for which to retrieve an Ecore name.
	 * @return The Ecore named element name.
	 */
	protected static String getENamedElementName(NamedElement namedElement) {
		String qualifiedName = namedElement.getQualifiedName();

		if (!isEmpty(qualifiedName)) {
			StringBuffer eNamedElementName = new StringBuffer();
			String[] names = qualifiedName.split(namedElement.separator());

			for (int i = 0, length = names.length; i < length; i++) {
				appendValidIdentifier(eNamedElementName, names[i]);

				if (i + 1 < length) {
					eNamedElementName.append("__"); //$NON-NLS-1$
				}
			}

			return eNamedElementName.toString();
		}

		return getValidIdentifier(namedElement.getName());
	}

	/**
	 * Retrieves a name suitable for an Ecore representation of the specified
	 * profile.
	 * 
	 * @param profile
	 *            The profile for which to retrieve an Ecore name.
	 * @return The Ecore package name.
	 */
	public static String getEPackageName(Profile profile) {
		return getENamedElementName(profile) + '_' + getVersion(profile);
	}

	/**
	 * Retrieves a name suitable for an Ecore representation of the specified
	 * classifier.
	 * 
	 * @param classifier
	 *            The classifier for which to retrieve an Ecore name.
	 * @return The Ecore classifier name.
	 */
	public static String getEClassifierName(Classifier classifier) {
		return getENamedElementName(classifier);
	}

	/**
	 * Retrieves the specified version of the Ecore package representing the
	 * specified profile.
	 * 
	 * @param profile
	 *            The profile for which to retrieve the Ecore package.
	 * @param version
	 *            The version of the Ecore package to retrieve.
	 * @return The Ecore package representing the profile, or <code>null</code>.
	 */
	public static EPackage getEPackage(Profile profile, String version) {

		for (Iterator ePackages = getEAnnotation(ANNOTATION_SOURCE__E_PACKAGES,
			profile).getContents().iterator(); ePackages.hasNext();) {

			EPackage ePackage = (EPackage) ePackages.next();

			if (safeEquals(version, ePackage.getName().substring(
				ePackage.getName().lastIndexOf('_') + 1))) {

				return ePackage;
			}
		}

		return null;
	}

	/**
	 * Retrieves the Ecore classifier representing the specified type from the
	 * specified Ecore package.
	 * 
	 * @param ePackage
	 *            The Ecore package from which to retrieve the classifier.
	 * @param type
	 *            The type for which to retrieve the Ecore classifier.
	 * @return The Ecore classifier representing the type.
	 */
	public static EClassifier getEClassifier(EPackage ePackage, Type type) {
		EClassifier eClassifier = ePackage.getEClassifier(type.getName());

		if (null == eClassifier) {

			if (org.eclipse.uml2.Class.class.isInstance(type)) {
				eClassifier = createEClass(ePackage,
					(org.eclipse.uml2.Class) type);
			}

			if (Interface.class.isInstance(type)) {
				eClassifier = createEClass(ePackage, (Interface) type);
			}

			if (Enumeration.class.isInstance(type)) {
				eClassifier = createEEnum(ePackage, (Enumeration) type);
			}

			if (PrimitiveType.class.isInstance(type)) {

				if ("Boolean".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEBoolean();
				} else if ("Integer".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEInt();
				} else if ("String".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEString();
				} else if ("UnlimitedNatural".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEInt();
				} else if ("boolean".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEBoolean();
				} else if ("byte".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEByte();
				} else if ("char".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEChar();
				} else if ("double".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEDouble();
				} else if ("float".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEFloat();
				} else if ("int".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEInt();
				} else if ("long".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getELong();
				} else if ("short".equals(type.getName())) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEShort();
				} else if (EDataType.class.isInstance(EcorePackage.eINSTANCE
					.getEClassifier(type.getName()))) {

					eClassifier = EcorePackage.eINSTANCE.getEClassifier(type
						.getName());
				} else {
					eClassifier = EcorePackage.eINSTANCE.getEString();
				}
			}
		}

		return eClassifier;
	}

	/**
	 * Creates an Ecore package to represent the specified profile.
	 * 
	 * @param profile
	 *            The profile for which to create an Ecore package.
	 * @return The new Ecore package.
	 */
	public static EPackage createEPackage(Profile profile) {
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();

		ePackage.setName(getEPackageName(profile));
		ePackage.setNsPrefix(ePackage.getName());
		ePackage.setNsURI("http:///" + EcoreUtil.generateUUID() + "." //$NON-NLS-1$ //$NON-NLS-2$
			+ UML2Resource.PROFILE_FILE_EXTENSION);

		for (Iterator ownedStereotypes = profile.getOwnedStereotypes()
			.iterator(); ownedStereotypes.hasNext();) {

			createEClass(ePackage, (Stereotype) ownedStereotypes.next());
		}

		return ePackage;
	}

	/**
	 * Creates an Ecore class in the specified Ecore package to represent the
	 * specified stereotype; if such an Ecore class already exists, it is
	 * returned.
	 * 
	 * @param ePackage
	 *            The Ecore package in which to create the Ecore class.
	 * @param stereotype
	 *            The stereotype for which to create an Ecore class.
	 * @return The (new) Ecore class.
	 */
	public static EClass createEClass(EPackage ePackage, Stereotype stereotype) {
		EClass eClass = (EClass) ePackage
			.getEClassifier(getEClassifierName(stereotype));

		if (null == eClass) {
			eClass = EcoreFactory.eINSTANCE.createEClass();

			createEAnnotation(
				StereotypeOperations.ANNOTATION_SOURCE__STEREOTYPE, eClass)
				.getReferences().add(stereotype);

			eClass.setName(getEClassifierName(stereotype));
			eClass.setAbstract(stereotype.isAbstract());

			ePackage.getEClassifiers().add(eClass);

			for (Iterator ownedAttributes = stereotype.getOwnedAttributes()
				.iterator(); ownedAttributes.hasNext();) {

				Property property = (Property) ownedAttributes.next();

				if (!isEmpty(property.getName())
					&& !Extension.class.isInstance(property.getAssociation())
					&& null != property.getType()) {

					if (DataType.class.isInstance(property.getType())) {
						createEAttribute(eClass, property);
					} else {
						createEReference(eClass, property);
					}
				}
			}

			for (Iterator generalizations = stereotype.getGeneralizations()
				.iterator(); generalizations.hasNext();) {

				Generalization generalization = (Generalization) generalizations
					.next();

				if (Stereotype.class.isInstance(generalization.getGeneral())) {
					eClass.getESuperTypes().add(
						createEClass(ePackage, (Stereotype) generalization
							.getGeneral()));
				}
			}
		}

		return eClass;
	}

	/**
	 * Creates an Ecore class in the specified Ecore package to represent the
	 * specified class; if such an Ecore class already exists, it is returned.
	 * 
	 * @param ePackage
	 *            The Ecore package in which to create the Ecore class.
	 * @param class_
	 *            The class for which to create an Ecore class.
	 * @return The (new) Ecore class.
	 */
	public static EClass createEClass(EPackage ePackage,
			org.eclipse.uml2.Class class_) {
		EClass eClass = (EClass) ePackage
			.getEClassifier(getEClassifierName(class_));

		if (null == eClass) {
			eClass = EcoreFactory.eINSTANCE.createEClass();

			eClass.setName(getEClassifierName(class_));
			eClass.setAbstract(class_.isAbstract());

			ePackage.getEClassifiers().add(eClass);

			for (Iterator ownedAttributes = class_.getOwnedAttributes()
				.iterator(); ownedAttributes.hasNext();) {

				Property property = (Property) ownedAttributes.next();

				if (!isEmpty(property.getName()) && null != property.getType()) {

					if (DataType.class.isInstance(property.getType())) {
						createEAttribute(eClass, property);
					} else {
						createEReference(eClass, property);
					}
				}
			}

			for (Iterator generalizations = class_.getGeneralizations()
				.iterator(); generalizations.hasNext();) {

				Generalization generalization = (Generalization) generalizations
					.next();

				if (org.eclipse.uml2.Class.class.isInstance(generalization
					.getGeneral())) {

					eClass.getESuperTypes().add(
						createEClass(ePackage,
							(org.eclipse.uml2.Class) generalization
								.getGeneral()));
				}
			}
		}

		return eClass;
	}

	/**
	 * Creates an Ecore class in the specified Ecore package to represent the
	 * specified interface; if such an Ecore class already exists, it is
	 * returned.
	 * 
	 * @param ePackage
	 *            The Ecore package in which to create the Ecore class.
	 * @param interface_
	 *            The interface for which to create an Ecore class.
	 * @return The (new) Ecore class.
	 */
	public static EClass createEClass(EPackage ePackage, Interface interface_) {
		EClass eClass = (EClass) ePackage
			.getEClassifier(getEClassifierName(interface_));

		if (null == eClass) {
			eClass = EcoreFactory.eINSTANCE.createEClass();

			eClass.setName(getEClassifierName(interface_));
			eClass.setInterface(true);

			ePackage.getEClassifiers().add(eClass);

			for (Iterator ownedAttributes = interface_.getOwnedAttributes()
				.iterator(); ownedAttributes.hasNext();) {

				Property property = (Property) ownedAttributes.next();

				if (!isEmpty(property.getName()) && null != property.getType()) {

					if (DataType.class.isInstance(property.getType())) {
						createEAttribute(eClass, property);
					} else {
						createEReference(eClass, property);
					}
				}
			}

			for (Iterator generalizations = interface_.getGeneralizations()
				.iterator(); generalizations.hasNext();) {

				Generalization generalization = (Generalization) generalizations
					.next();

				if (Interface.class.isInstance(generalization.getGeneral())) {
					eClass.getESuperTypes().add(
						createEClass(ePackage, (Interface) generalization
							.getGeneral()));
				}
			}
		}

		return eClass;
	}

	/**
	 * Creates an Ecore enum in the specified Ecore package to represent the
	 * specified enumeration; if such an Ecore enum already exists, it is
	 * returned.
	 * 
	 * @param ePackage
	 *            The Ecore package in which to create the Ecore enum.
	 * @param enumeration
	 *            The enumeration for which to create an Ecore enum.
	 * @return The (new) Ecore enum.
	 */
	public static EEnum createEEnum(EPackage ePackage, Enumeration enumeration) {
		EEnum eEnum = (EEnum) ePackage
			.getEClassifier(getEClassifierName(enumeration));

		if (null == eEnum) {
			eEnum = EcoreFactory.eINSTANCE.createEEnum();

			eEnum.setName(getEClassifierName(enumeration));

			ePackage.getEClassifiers().add(eEnum);

			for (int index = 0; index < enumeration.getOwnedLiterals().size(); index++) {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral) enumeration
					.getOwnedLiterals().get(index);

				EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE
					.createEEnumLiteral();

				createEAnnotation(
					StereotypeOperations.ANNOTATION_SOURCE__ENUMERATION_LITERAL,
					eEnumLiteral).getReferences().add(enumerationLiteral);

				eEnumLiteral.setName(getValidIdentifier(enumerationLiteral
					.getName()));
				eEnumLiteral.setValue(index);

				eEnum.getELiterals().add(eEnumLiteral);
			}
		}

		return eEnum;
	}

	/**
	 * Creates an Ecore attribute in the specified Ecore class to represent the
	 * specified property; if such an Ecore attribute already exists, it is
	 * returned.
	 * 
	 * @param eClass
	 *            The Ecore class in which to create the Ecore attribute.
	 * @param property
	 *            The property for which to create an Ecore attribute.
	 * @return The (new) Ecore attribute.
	 */
	public static EAttribute createEAttribute(EClass eClass, Property property) {
		EAttribute eAttribute = (EAttribute) eClass
			.getEStructuralFeature(property.getName());

		if (null == eAttribute) {
			eAttribute = EcoreFactory.eINSTANCE.createEAttribute();

			eAttribute.setName(getValidIdentifier(property.getName()));
			eAttribute.setChangeable(!property.isReadOnly());
			eAttribute.setUpperBound(property.getUpper());
			eAttribute.setLowerBound(property.getLower());
			eAttribute.setUnique(property.isUnique());
			eAttribute.setEType(getEClassifier(eClass.getEPackage(), property
				.getType()));

			if (InstanceValue.class.isInstance(property.getDefaultValue())
				&& EnumerationLiteral.class
					.isInstance(((InstanceValue) property.getDefaultValue())
						.getInstance())) {

				eAttribute
					.setDefaultValueLiteral(((EnumerationLiteral) ((InstanceValue) property
						.getDefaultValue()).getInstance()).getName());
			} else {

				try {
					EcorePackage.eINSTANCE.getEFactoryInstance()
						.createFromString(eAttribute.getEAttributeType(),
							property.getDefault());
					eAttribute.setDefaultValueLiteral(property.getDefault());
				} catch (Exception e) {
					// ignore
				}
			}

			eClass.getEStructuralFeatures().add(eAttribute);
		}

		return eAttribute;
	}

	/**
	 * Creates an Ecore reference in the specified Ecore class to represent the
	 * specified property; if such an Ecore reference already exists, it is
	 * returned.
	 * 
	 * @param eClass
	 *            The Ecore class in which to create the Ecore reference.
	 * @param property
	 *            The property for which to create an Ecore reference.
	 * @return The (new) Ecore reference.
	 */
	public static EReference createEReference(EClass eClass, Property property) {
		EReference eReference = (EReference) eClass
			.getEStructuralFeature(property.getName());

		if (null == eReference) {
			eReference = EcoreFactory.eINSTANCE.createEReference();

			eReference.setName(getValidIdentifier(property.getName()));
			eReference.setChangeable(true);
			eReference.setContainment(true);
			eReference.setUpperBound(property.getUpper());
			eReference.setLowerBound(property.getLower());
			eReference.setUnique(property.isUnique());
			eReference.setEType(getEClassifier(eClass.getEPackage(), property
				.getType()));

			eClass.getEStructuralFeatures().add(eReference);
		}

		return eReference;
	}

	/**
	 * Applies the current version of the specified profile to the specified
	 * package; if a different version is already applied, automatically
	 * migrates any associated stereotype values on a "best effort" basis
	 * (matching classifiers and structural features by name).
	 * 
	 * @param profile
	 *            The profile to be applied.
	 * @param package_
	 *            The package to which to apply the profile.
	 * @throws IllegalArgumentException
	 *             If the profile is not defined or its current version is
	 *             already applied.
	 */
	public static void apply(Profile profile, org.eclipse.uml2.Package package_) {

		if (null == profile
			|| null == getEPackage(profile, profile.getVersion())) {

			throw new IllegalArgumentException(String.valueOf(profile));
		}

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(package_));
		}

		ProfileApplication profileApplication = null;

		for (Iterator allProfileApplications = getAllProfileApplications(
			package_).iterator(); allProfileApplications.hasNext();) {

			profileApplication = (ProfileApplication) allProfileApplications
				.next();

			Profile importedProfile = profileApplication.getImportedProfile();

			if (profile == importedProfile) {

				if (profile.getVersion().equals(getVersion(profileApplication))) {
					throw new IllegalArgumentException(String.valueOf(profile));
				}

				break;
			} else {
				EPackage importedEPackage = getEPackage(importedProfile,
					getVersion(profileApplication));

				if (null != importedEPackage
					&& getEPackage(profile, profile.getVersion()).getNsURI()
						.equals(importedEPackage.getNsURI())) {

					throw new IllegalArgumentException(String.valueOf(profile));
				}

				profileApplication = null;
			}
		}

		if (null == profileApplication) {
			profileApplication = (ProfileApplication) package_
				.createPackageImport(UML2Package.eINSTANCE
					.getProfileApplication());
			profileApplication.setImportedProfile(profile);

			package_.getAppliedProfiles().add(profileApplication);
		} else {

			if (package_ != profileApplication.getImportingNamespace()) {
				throw new IllegalArgumentException(String.valueOf(package_));
			}

			TreeIterator eAllContents = new AbstractTreeIterator(package_, true) {

				public Iterator getChildren(Object parent) {
					return ((EObject) parent).eContents().iterator();
				}
			};

			List eAnnotationsToRemove = new ArrayList();

			while (eAllContents.hasNext()) {
				EObject eObject = (EObject) eAllContents.next();

				if (Element.class.isInstance(eObject)) {
					Element element = (Element) eObject;
					EAnnotation appliedStereotypesEAnnotation = getEAnnotation(
						StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES,
						element);
					List appliedStereotypes = appliedStereotypesEAnnotation
						.getContents();

					for (Iterator stereotypeApplications = getStereotypeApplications(
						profile, element).iterator(); stereotypeApplications
						.hasNext();) {

						EObject oldStereotypeApplication = (EObject) stereotypeApplications
							.next();

						Stereotype stereotype = StereotypeOperations
							.getStereotype(oldStereotypeApplication);

						if (null == stereotype) {
							appliedStereotypes.remove(oldStereotypeApplication);
						} else {
							EClass eClass = StereotypeOperations.getEClass(
								stereotype, profile.getVersion());
							EObject newStereotypeApplication = eClass
								.getEPackage().getEFactoryInstance().create(
									eClass);

							copyValues(oldStereotypeApplication,
								newStereotypeApplication);

							appliedStereotypes.set(appliedStereotypes
								.indexOf(oldStereotypeApplication),
								newStereotypeApplication);
						}
					}

					if (appliedStereotypes.isEmpty()) {
						eAnnotationsToRemove.add(appliedStereotypesEAnnotation);
					}
				}
			}

			for (Iterator eAnnotations = eAnnotationsToRemove.iterator(); eAnnotations
				.hasNext();) {

				((EAnnotation) eAnnotations.next()).setEModelElement(null);
			}
		}

		getOrCreateEAnnotation(ANNOTATION_SOURCE__ATTRIBUTES,
			profileApplication).getDetails().put(
			ANNOTATION_DETAILS_KEY__VERSION, profile.getVersion());
	}

	protected static void copyValues(EObject sourceEObject,
			EObject targetEObject) {

		for (Iterator targetEStructuralFeatures = targetEObject.eClass()
			.getEAllStructuralFeatures().iterator(); targetEStructuralFeatures
			.hasNext();) {

			EStructuralFeature targetEStructuralFeature = (EStructuralFeature) targetEStructuralFeatures
				.next();

			EStructuralFeature sourceEStructuralFeature = sourceEObject
				.eClass().getEStructuralFeature(
					targetEStructuralFeature.getName());

			if (null != sourceEStructuralFeature
				&& sourceEObject.eIsSet(sourceEStructuralFeature)) {

				try {
					switch (targetEStructuralFeature.getEType().eClass()
						.getClassifierID()) {

						case EcorePackage.ECLASS :
							copyEClassValue(sourceEObject,
								sourceEStructuralFeature, targetEObject,
								targetEStructuralFeature);

							break;
						case EcorePackage.EDATA_TYPE :
							copyEDataTypeValue(sourceEObject,
								sourceEStructuralFeature, targetEObject,
								targetEStructuralFeature);

							break;
						case EcorePackage.EENUM :
							copyEEnumValue(sourceEObject,
								sourceEStructuralFeature, targetEObject,
								targetEStructuralFeature);

							break;
					}
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}
	}

	protected static void copyEClassValue(EObject sourceEObject,
			EStructuralFeature sourceEStructuralFeature, EObject targetEObject,
			EStructuralFeature targetEStructuralFeature) {
		Object sourceValue = sourceEObject.eGet(sourceEStructuralFeature);

		EClass targetEClass = (EClass) targetEStructuralFeature.getEType();

		if (targetEStructuralFeature.isMany()) {
			EList targetEList = (EList) targetEObject
				.eGet(targetEStructuralFeature);

			if (sourceEStructuralFeature.isMany()) {
				EList sourceEList = (EList) sourceValue;

				for (int i = 0; i < sourceEList.size(); i++) {
					EObject targetValue = targetEClass.getEPackage()
						.getEFactoryInstance().create(targetEClass);
					copyValues((EObject) sourceEList.get(i), targetValue);
					targetEList.add(i, targetValue);
				}
			} else {
				EObject targetValue = targetEClass.getEPackage()
					.getEFactoryInstance().create(targetEClass);
				copyValues((EObject) sourceValue, targetValue);
				targetEList.add(targetValue);
			}
		} else {
			EObject targetValue = targetEClass.getEPackage()
				.getEFactoryInstance().create(targetEClass);
			copyValues((EObject) (sourceEStructuralFeature.isMany()
				? ((EList) sourceValue).get(0)
				: sourceValue), targetValue);
			targetEObject.eSet(targetEStructuralFeature, targetValue);
		}
	}

	protected static void copyEDataTypeValue(EObject sourceEObject,
			EStructuralFeature sourceEStructuralFeature, EObject targetEObject,
			EStructuralFeature targetEStructuralFeature) {
		Object sourceValue = sourceEObject.eGet(sourceEStructuralFeature);

		EDataType sourceEDataType = (EDataType) sourceEStructuralFeature
			.getEType();
		EFactory sourceEFactory = sourceEDataType.getEPackage()
			.getEFactoryInstance();
		EDataType targetEDataType = (EDataType) targetEStructuralFeature
			.getEType();
		EFactory targetEFactory = targetEDataType.getEPackage()
			.getEFactoryInstance();

		if (targetEStructuralFeature.isMany()) {
			EList targetEList = (EList) targetEObject
				.eGet(targetEStructuralFeature);

			if (sourceEStructuralFeature.isMany()) {
				EList sourceEList = (EList) sourceValue;

				for (int i = 0; i < sourceEList.size(); i++) {
					targetEList.add(i, targetEFactory.createFromString(
						targetEDataType, sourceEFactory.convertToString(
							sourceEDataType, sourceEList.get(i))));
				}
			} else {
				targetEList.add(targetEFactory.createFromString(
					targetEDataType, sourceEFactory.convertToString(
						sourceEDataType, sourceValue)));
			}
		} else {
			targetEObject.eSet(targetEStructuralFeature, targetEFactory
				.createFromString(targetEDataType, sourceEFactory
					.convertToString(sourceEDataType, sourceEStructuralFeature
						.isMany()
						? ((EList) sourceValue).get(0)
						: sourceValue)));
		}
	}

	protected static void copyEEnumValue(EObject sourceEObject,
			EStructuralFeature sourceEStructuralFeature, EObject targetEObject,
			EStructuralFeature targetEStructuralFeature) {
		Object sourceValue = sourceEObject.eGet(sourceEStructuralFeature);

		EEnum targetEEnum = (EEnum) targetEStructuralFeature.getEType();

		if (targetEStructuralFeature.isMany()) {
			EList targetEList = (EList) targetEObject
				.eGet(targetEStructuralFeature);

			if (sourceEStructuralFeature.isMany()) {
				EList sourceEList = (EList) sourceValue;

				for (int i = 0; i < sourceEList.size(); i++) {
					targetEList.add(i, targetEEnum.getEEnumLiteral(
						((EEnumLiteral) sourceEList.get(i)).getName())
						.getInstance());
				}
			} else {
				targetEList.add(targetEEnum.getEEnumLiteral(
					((EEnumLiteral) sourceValue).getName()).getInstance());
			}
		} else {
			targetEObject.eSet(targetEStructuralFeature, targetEEnum
				.getEEnumLiteral(
					((EEnumLiteral) (sourceEStructuralFeature.isMany()
						? ((EList) sourceValue).get(0)
						: sourceValue)).getName()).getInstance());
		}
	}

	/**
	 * Defines the specified profile by (re)creating Ecore representations of
	 * its current contents and incrementing its version.
	 * 
	 * @param profile
	 *            The profile to be defined.
	 * @throws IllegalArgumentException
	 *             If the profile has no qualified name.
	 */
	public static void define(Profile profile) {

		if (null == profile || isEmpty(profile.getQualifiedName())) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		String version = getVersion(profile);
		getOrCreateEAnnotation(ANNOTATION_SOURCE__ATTRIBUTES, profile)
			.getDetails().put(ANNOTATION_DETAILS_KEY__VERSION, null == version
				? String.valueOf(0)
				: String.valueOf(new Integer(Integer.parseInt(version) + 1)));

		getOrCreateEAnnotation(ANNOTATION_SOURCE__E_PACKAGES, profile)
			.getContents().add(0, createEPackage(profile));
	}

	/**
	 * Retrieves the set of all profile applications on the specified package,
	 * including profiles applications on its nesting package(s).
	 * 
	 * @param package_
	 *            The package for which to retrieve the profile applications.
	 * @return The profile applications on the package.
	 */
	protected static Set getAllProfileApplications(
			org.eclipse.uml2.Package package_) {
		Set allProfileApplications = new HashSet();

		while (null != package_) {
			allProfileApplications.addAll(package_.getAppliedProfiles());

			package_ = null == package_.getNamespace()
				? null
				: package_.getNamespace().getNearestPackage();
		}

		return allProfileApplications;
	}

	/**
	 * Retrieves the set of all profiles that are applied to the specified
	 * package, including profiles applied to its nesting package(s).
	 * 
	 * @param package_
	 *            The package for which to retrieve the applied profiles.
	 * @return The profiles applied to the package.
	 */
	public static Set getAllAppliedProfiles(org.eclipse.uml2.Package package_) {
		Set allAppliedProfiles = new HashSet();

		if (null == package_) {
			return allAppliedProfiles;
		}

		for (Iterator appliedProfiles = package_.getAppliedProfiles()
			.iterator(); appliedProfiles.hasNext();) {

			ProfileApplication profileApplication = (ProfileApplication) appliedProfiles
				.next();

			if (null != profileApplication.getImportedProfile()) {
				allAppliedProfiles.add(profileApplication.getImportedProfile());
			}
		}

		Namespace namespace = package_.getNamespace();

		if (null != namespace) {
			allAppliedProfiles.addAll(getAllAppliedProfiles(namespace
				.getNearestPackage()));
		}

		return allAppliedProfiles;
	}

	/**
	 * Retrieves the version of the specified profile.
	 * 
	 * @param profile
	 *            The profile whose version is to be retrieved.
	 * @return The version of the profile, or <code>null</code> if undefined.
	 */
	public static String getVersion(Profile profile) {

		if (null == profile) {
			return null;
		}

		return (String) getEAnnotation(ANNOTATION_SOURCE__ATTRIBUTES, profile)
			.getDetails().get(ANNOTATION_DETAILS_KEY__VERSION);
	}

	/**
	 * Retrieves the version of the specified profile that is applied to the
	 * specified package or (one of) its nesting package(s).
	 * 
	 * @param profile
	 *            The profile whose applied version to retrieve.
	 * @param package_
	 *            The package for which to retrieve the profile version.
	 * @return The version of the profile, or <code>null</code> if not
	 *         applied.
	 */
	public static String getAppliedVersion(Profile profile,
			org.eclipse.uml2.Package package_) {

		if (null == profile || null == package_) {
			return null;
		}

		ProfileApplication profileApplication = getProfileApplication(profile,
			package_);

		if (null != profileApplication) {
			return getVersion(profileApplication);
		}

		Namespace namespace = package_.getNamespace();

		if (null != namespace) {
			return getAppliedVersion(profile, namespace.getNearestPackage());
		}

		return null;
	}

	protected static String getVersion(ProfileApplication profileApplication) {
		return (String) getEAnnotation(ANNOTATION_SOURCE__ATTRIBUTES,
			profileApplication).getDetails().get(
			ANNOTATION_DETAILS_KEY__VERSION);
	}

	protected static ProfileApplication getProfileApplication(Profile profile,
			org.eclipse.uml2.Package package_) {

		for (Iterator appliedProfiles = package_.getAppliedProfiles()
			.iterator(); appliedProfiles.hasNext();) {

			ProfileApplication profileApplication = (ProfileApplication) appliedProfiles
				.next();

			if (profile == profileApplication.getImportedProfile()) {
				return profileApplication;
			}
		}

		return null;
	}

	protected static Set getStereotypeApplications(Profile profile,
			Element element) {
		Set stereotypeApplications = new HashSet();

		List ePackages = getEAnnotation(ANNOTATION_SOURCE__E_PACKAGES, profile)
			.getContents();

		for (Iterator appliedStereotypes = getEAnnotation(
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES,
			element).getContents().iterator(); appliedStereotypes.hasNext();) {

			EObject stereotypeApplication = (EObject) appliedStereotypes.next();

			if (ePackages
				.contains(stereotypeApplication.eClass().getEPackage())) {

				stereotypeApplications.add(stereotypeApplication);
			}
		}

		return stereotypeApplications;
	}

	/**
	 * Determines whether the specified profile is applied to the specified
	 * package.
	 * 
	 * @param profile
	 *            The profile to test for application.
	 * @param package_
	 *            The package for which to determine profile application.
	 * @return <code>true</code> if the profile is applied to the package;
	 *         <code>false</code> otherwise.
	 */
	public static boolean isApplied(Profile profile,
			org.eclipse.uml2.Package package_) {

		if (null == profile || !isDefined(profile)) {
			return false;
		}

		if (null == package_) {
			return false;
		}

		return null != getProfileApplication(profile, package_);
	}

	/**
	 * Determines whether the specified profile is defined.
	 * 
	 * @param profile
	 *            The profile to test for definition.
	 * @return <code>true</code> if the profile is defined; <code>false</code>
	 *         otherwise.
	 */
	public static boolean isDefined(Profile profile) {
		return null == profile
			? false
			: getEAnnotation(ANNOTATION_SOURCE__E_PACKAGES, profile)
				.getContents().size() > 0;
	}

	/**
	 * Unapplies the specified profile from the specified package.
	 * 
	 * @param profile
	 *            The profile to be unapplied.
	 * @param package_
	 *            The package from which to unapply the profile.
	 * @throws IllegalArgumentException
	 *             If the profile is not applied to the package.
	 */
	public static void unapply(Profile profile,
			org.eclipse.uml2.Package package_) {

		if (null == profile || !isApplied(profile, package_)) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		TreeIterator eAllContents = new AbstractTreeIterator(package_, true) {

			public Iterator getChildren(Object parent) {
				return ((EObject) parent).eContents().iterator();
			}
		};

		List eAnnotationsToRemove = new ArrayList();

		while (eAllContents.hasNext()) {
			EObject eObject = (EObject) eAllContents.next();

			if (Element.class.isInstance(eObject)) {
				Element element = (Element) eObject;

				EAnnotation appliedStereotypesEAnnotation = getEAnnotation(
					StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES,
					element);

				appliedStereotypesEAnnotation.getContents().removeAll(
					getStereotypeApplications(profile, element));

				if (appliedStereotypesEAnnotation.getContents().isEmpty()) {
					eAnnotationsToRemove.add(appliedStereotypesEAnnotation);
				}
			}
		}

		for (Iterator eAnnotations = eAnnotationsToRemove.iterator(); eAnnotations
			.hasNext();) {

			((EAnnotation) eAnnotations.next()).setEModelElement(null);
		}

		package_.getPackageImports().remove(
			getProfileApplication(profile, package_));
	}

	/**
	 * Retrieves the set of metaclasses referenced by the specified profile.
	 * 
	 * @param profile
	 *            The profile for which to retrieve referenced metaclasses.
	 * @return The metaclasses referenced by the profile.
	 */
	public static Set getReferencedMetaclasses(Profile profile) {
		Set referencedMetaclasses = new HashSet();

		if (null == profile) {
			return referencedMetaclasses;
		}

		for (Iterator metaclassReferences = profile.getMetaclassReferences()
			.iterator(); metaclassReferences.hasNext();) {

			referencedMetaclasses.add(((ElementImport) metaclassReferences
				.next()).getImportedElement());
		}

		return referencedMetaclasses;
	}

	/**
	 * References the specified metaclass in the specified profile with private
	 * visibility.
	 * 
	 * @param profile
	 *            The profile in which to reference the metaclass.
	 * @param class_
	 *            The metaclass to reference.
	 * @exception IllegalArgumentException
	 *                If the profile already references the metaclass.
	 */
	public static void referenceMetaclass(Profile profile,
			org.eclipse.uml2.Class class_) {

		if (null == profile) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		if (null == class_
			|| profile.getReferencedMetaclasses().contains(class_)) {

			throw new IllegalArgumentException(String.valueOf(class_));
		}

		ElementImport elementImport = profile
			.createElementImport(UML2Package.eINSTANCE.getElementImport());

		elementImport.setVisibility(VisibilityKind.PRIVATE_LITERAL);
		elementImport.setImportedElement(class_);

		profile.getMetaclassReferences().add(elementImport);
	}

	/**
	 * Retrieves the set of metamodels referenced by the specified profile.
	 * 
	 * @param profile
	 *            The profile for which to retrieve referenced metamodels.
	 * @return The metamodels referenced by the profile.
	 */
	public static Set getReferencedMetamodels(Profile profile) {
		Set referencedMetamodels = new HashSet();

		if (null == profile) {
			return referencedMetamodels;
		}

		for (Iterator metamodelReferences = profile.getMetamodelReferences()
			.iterator(); metamodelReferences.hasNext();) {

			referencedMetamodels.add(((PackageImport) metamodelReferences
				.next()).getImportedPackage());
		}

		return referencedMetamodels;
	}

	/**
	 * References the specified metamodel in the specified profile with private
	 * visibility.
	 * 
	 * @param profile
	 *            The profile in which to reference the metamodel.
	 * @param model
	 *            The metamodel to reference.
	 * @exception IllegalArgumentException
	 *                If the profile already references the metamodel.
	 */
	public static void referenceMetamodel(Profile profile, Model model) {

		if (null == profile) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		if (null == model || profile.getReferencedMetamodels().contains(model)) {
			throw new IllegalArgumentException(String.valueOf(model));
		}

		PackageImport packageImport = profile
			.createPackageImport(UML2Package.eINSTANCE.getPackageImport());

		packageImport.setVisibility(VisibilityKind.PRIVATE_LITERAL);
		packageImport.setImportedPackage(model);

		profile.getMetamodelReferences().add(packageImport);
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified profile in the
	 * specified locale.
	 * 
	 * @param profile
	 *            The profile for which to retrieve the resource bundle.
	 * @param locale
	 *            The locale in which to retrieve the resource bundle.
	 * @return The resource bundle for the profile in the locale.
	 */
	protected static ResourceBundle getResourceBundle(Profile profile,
			Locale locale) {

		if (!PROFILE_RESOURCE_BUNDLES.containsKey(profile)
			|| !locale.equals(PROFILE_LOCALES.get(profile))) {

			ResourceBundle resourceBundle = null;
			Resource resource = profile.eResource();

			if (null != resource) {
				ResourceSet resourceSet = resource.getResourceSet();
				URIConverter uriConverter = null == resourceSet
					? DEFAULT_URI_CONVERTER
					: resourceSet.getURIConverter();

				for (Iterator resourceBundleURIs = getResourceBundleURIs(
					resource.getURI(), locale).iterator(); resourceBundleURIs
					.hasNext();) {

					try {
						resourceBundle = new PropertyResourceBundle(
							uriConverter
								.createInputStream((URI) resourceBundleURIs
									.next()));
						locale = resourceBundle.getLocale();
						break;
					} catch (IOException ioe) {
						// ignore
					}
				}
			}

			PROFILE_LOCALES.put(profile, locale);
			PROFILE_RESOURCE_BUNDLES.put(profile, resourceBundle);
		}

		return (ResourceBundle) PROFILE_RESOURCE_BUNDLES.get(profile);
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified profile in the
	 * default locale.
	 * 
	 * @param profile
	 *            The profile for which to retrieve the resource bundle.
	 * @return The resource bundle for the profile in the default locale.
	 */
	protected static ResourceBundle getResourceBundle(Profile profile) {
		return getResourceBundle(profile, Locale.getDefault());
	}

}