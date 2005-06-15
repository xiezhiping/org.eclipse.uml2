/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProfileOperations.java,v 1.27 2005/06/15 17:18:21 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.InstanceValue;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.ProfileApplication;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Switch;

/**
 * A static utility class that provides operations related to '<em><b>Profile</b></em>'
 * model objects.
 */
public final class ProfileOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	public static final class Profile2EPackageConverter
			extends UML22EcoreConverter {

		public Object caseEnumerationLiteral(
				EnumerationLiteral enumerationLiteral) {
			EEnumLiteral eEnumLiteral = (EEnumLiteral) super
				.caseEnumerationLiteral(enumerationLiteral);
			createEAnnotation(eEnumLiteral,
				StereotypeOperations.ANNOTATION_SOURCE__ENUMERATION_LITERAL)
				.getReferences().add(enumerationLiteral);
			return eEnumLiteral;
		}

		public Object caseProfile(Profile profile) {
			EPackage ePackage = (EPackage) casePackage(profile);
			String name = ePackage.getName();
			ePackage.setNsPrefix(name);
			ePackage.setNsURI("http:///" + name + EcoreUtil.generateUUID() //$NON-NLS-1$
				+ "." + UML2Resource.PROFILE_FILE_EXTENSION); //$NON-NLS-1$
			return ePackage;
		}

		public Object caseProperty(final Property property) {

			if (!isEmpty(property.getName()) && null != property.getType()
				&& !Extension.class.isInstance(property.getAssociation())) {

				return new EcoreSwitch() {

					public Object caseEAttribute(EAttribute eAttribute) {

						if (EcorePackage.eINSTANCE.getEString() == eAttribute
							.getEAttributeType()) {
							eAttribute.setDefaultValueLiteral(property
								.getDefault());
						}

						return eAttribute;
					}

					public Object caseEReference(EReference eReference) {
						eReference.setChangeable(true);
						eReference.setContainment(true);
						return eReference;
					}
				}.doSwitch((EStructuralFeature) super.caseProperty(property));
			}
			return null;
		}

		public Object caseStereotype(Stereotype stereotype) {
			EClass eClass = (EClass) caseClass(stereotype);
			createEAnnotation(eClass,
				StereotypeOperations.ANNOTATION_SOURCE__STEREOTYPE)
				.getReferences().add(stereotype);
			return eClass;
		}

		protected void setName(final ENamedElement eNamedElement,
				NamedElement namedElement) {

			new UML2Switch() {

				public Object caseClassifier(Classifier classifier) {
					setName(eNamedElement, getEClassifierName(classifier),
						false);
					return classifier;
				}

				public Object caseEnumerationLiteral(
						EnumerationLiteral enumerationLiteral) {
					setName(eNamedElement, enumerationLiteral.getName(), false);
					return enumerationLiteral;
				}

				public Object caseProfile(Profile profile) {
					setName(eNamedElement, getEPackageName(profile), false);
					return profile;
				}

				public Object caseNamedElement(NamedElement namedElement) {
					setName(eNamedElement, namedElement.getName(), true);
					return namedElement;
				}
			}.doSwitch(namedElement);
		}

		public static EPackage convert(Profile profile) {
			Collection ePackages = new Profile2EPackageConverter().convert(
				Collections.singleton(profile), null, null, null);
			return 1 == ePackages.size()
				? (EPackage) ePackages.iterator().next()
				: null;
		}
	}

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

		for (Iterator ePackages = safeGetEAnnotation(profile,
			ANNOTATION_SOURCE__E_PACKAGES).getContents().iterator(); ePackages
			.hasNext();) {

			EPackage ePackage = (EPackage) ePackages.next();
			String name = ePackage.getName();

			if (safeEquals(version, name.substring(name.lastIndexOf('_') + 1))) {
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
	 * 
	 * @deprecated Use EPackage.getEClassifier(String) instead.
	 */
	public static EClassifier getEClassifier(EPackage ePackage, Type type) {
		String typeName = type.getName();
		EClassifier eClassifier = ePackage.getEClassifier(typeName);

		if (null == eClassifier) {

			if (PrimitiveType.class.isInstance(type)) {

				if ("Boolean".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEBoolean();
				} else if ("Integer".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEInt();
				} else if ("String".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEString();
				} else if ("UnlimitedNatural".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEInt();
				} else if ("boolean".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEBoolean();
				} else if ("byte".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEByte();
				} else if ("char".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEChar();
				} else if ("double".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEDouble();
				} else if ("float".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEFloat();
				} else if ("int".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEInt();
				} else if ("long".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getELong();
				} else if ("short".equals(typeName)) { //$NON-NLS-1$
					eClassifier = EcorePackage.eINSTANCE.getEShort();
				} else if (EDataType.class.isInstance(EcorePackage.eINSTANCE
					.getEClassifier(typeName))) {

					eClassifier = EcorePackage.eINSTANCE
						.getEClassifier(typeName);
				} else {
					eClassifier = EcorePackage.eINSTANCE.getEString();
				}
			} else {
				eClassifier = createEClassifier(ePackage, type);
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
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	public static EPackage createEPackage(Profile profile) {
		return Profile2EPackageConverter.convert(profile);
	}

	/**
	 * Creates an Ecore classifier in the specified Ecore package to represent
	 * the specified type; if such an Ecore classifier already exists, it is
	 * returned.
	 * 
	 * @param ePackage
	 *            The Ecore package in which to create the Ecore classifier.
	 * @param type
	 *            The type for which to create an Ecore classifier.
	 * @return The (new) Ecore classifier.
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	protected static EClassifier createEClassifier(final EPackage ePackage,
			Type type) {

		return (EClassifier) new UML2Switch() {

			public Object caseClass(org.eclipse.uml2.Class class_) {
				return createEClass(ePackage, class_);
			}

			public Object caseEnumeration(Enumeration enumeration) {
				return createEEnum(ePackage, enumeration);
			}

			public Object caseInterface(Interface interface_) {
				return createEClass(ePackage, interface_);
			}

			public Object caseStereotype(Stereotype stereotype) {
				return createEClass(ePackage, stereotype);
			}
		}.doSwitch(type);
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
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	public static EClass createEClass(EPackage ePackage, Stereotype stereotype) {
		String name = getEClassifierName(stereotype);
		EClass eClass = (EClass) ePackage.getEClassifier(name);

		if (null == eClass) {
			eClass = EcoreFactory.eINSTANCE.createEClass();

			createEAnnotation(eClass,
				StereotypeOperations.ANNOTATION_SOURCE__STEREOTYPE)
				.getReferences().add(stereotype);

			eClass.setName(name);
			eClass.setAbstract(stereotype.isAbstract());

			ePackage.getEClassifiers().add(eClass);

			for (Iterator ownedAttributes = stereotype.getOwnedAttributes()
				.iterator(); ownedAttributes.hasNext();) {

				Property property = (Property) ownedAttributes.next();

				if (!isEmpty(property.getName())
					&& !Extension.class.isInstance(property.getAssociation())) {

					Type type = property.getType();

					if (null != type) {

						if (DataType.class.isInstance(type)) {
							createEAttribute(eClass, property);
						} else {
							createEReference(eClass, property);
						}

					}
				}
			}

			for (Iterator generalizations = stereotype.getGeneralizations()
				.iterator(); generalizations.hasNext();) {

				Classifier general = ((Generalization) generalizations.next())
					.getGeneral();

				if (Stereotype.class.isInstance(general)) {
					eClass.getESuperTypes().add(
						createEClass(ePackage, (Stereotype) general));
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
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	public static EClass createEClass(EPackage ePackage,
			org.eclipse.uml2.Class class_) {
		String name = getEClassifierName(class_);
		EClass eClass = (EClass) ePackage.getEClassifier(name);

		if (null == eClass) {
			eClass = EcoreFactory.eINSTANCE.createEClass();

			eClass.setName(name);
			eClass.setAbstract(class_.isAbstract());

			ePackage.getEClassifiers().add(eClass);

			for (Iterator ownedAttributes = class_.getOwnedAttributes()
				.iterator(); ownedAttributes.hasNext();) {

				Property property = (Property) ownedAttributes.next();

				if (!isEmpty(property.getName())) {
					Type type = property.getType();

					if (null != type) {

						if (DataType.class.isInstance(type)) {
							createEAttribute(eClass, property);
						} else {
							createEReference(eClass, property);
						}
					}
				}
			}

			for (Iterator generalizations = class_.getGeneralizations()
				.iterator(); generalizations.hasNext();) {

				Classifier general = ((Generalization) generalizations.next())
					.getGeneral();

				if (org.eclipse.uml2.Class.class.isInstance(general)) {
					eClass.getESuperTypes()
						.add(
							createEClass(ePackage,
								(org.eclipse.uml2.Class) general));
				}
			}

			for (Iterator implementations = class_.getImplementations()
				.iterator(); implementations.hasNext();) {

				Interface contract = ((Implementation) implementations.next())
					.getContract();

				if (null != contract) {
					eClass.getESuperTypes().add(
						createEClass(ePackage, contract));
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
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	public static EClass createEClass(EPackage ePackage, Interface interface_) {
		String name = getEClassifierName(interface_);
		EClass eClass = (EClass) ePackage.getEClassifier(name);

		if (null == eClass) {
			eClass = EcoreFactory.eINSTANCE.createEClass();

			eClass.setName(name);
			eClass.setAbstract(true);
			eClass.setInterface(true);

			ePackage.getEClassifiers().add(eClass);

			for (Iterator ownedAttributes = interface_.getOwnedAttributes()
				.iterator(); ownedAttributes.hasNext();) {

				Property property = (Property) ownedAttributes.next();

				if (!isEmpty(property.getName())) {
					Type type = property.getType();

					if (null != type) {

						if (DataType.class.isInstance(type)) {
							createEAttribute(eClass, property);
						} else {
							createEReference(eClass, property);
						}
					}
				}
			}

			for (Iterator generalizations = interface_.getGeneralizations()
				.iterator(); generalizations.hasNext();) {

				Classifier general = ((Generalization) generalizations.next())
					.getGeneral();

				if (Interface.class.isInstance(general)) {
					eClass.getESuperTypes().add(
						createEClass(ePackage, (Interface) general));
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
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	public static EEnum createEEnum(EPackage ePackage, Enumeration enumeration) {
		String name = getEClassifierName(enumeration);
		EEnum eEnum = (EEnum) ePackage.getEClassifier(name);

		if (null == eEnum) {
			eEnum = EcoreFactory.eINSTANCE.createEEnum();

			eEnum.setName(name);

			ePackage.getEClassifiers().add(eEnum);

			EList eLiterals = eEnum.getELiterals();
			EList ownedLiterals = enumeration.getOwnedLiterals();

			for (int index = 0; index < ownedLiterals.size(); index++) {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral) ownedLiterals
					.get(index);

				EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE
					.createEEnumLiteral();

				createEAnnotation(eEnumLiteral,
					StereotypeOperations.ANNOTATION_SOURCE__ENUMERATION_LITERAL)
					.getReferences().add(enumerationLiteral);

				eEnumLiteral.setName(enumerationLiteral.getName());
				eEnumLiteral.setValue(index);

				eLiterals.add(eEnumLiteral);
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
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	public static EAttribute createEAttribute(EClass eClass, Property property) {
		String name = getValidIdentifier(property.getName());
		EAttribute eAttribute = (EAttribute) eClass.getEStructuralFeature(name);

		if (null == eAttribute) {
			eAttribute = EcoreFactory.eINSTANCE.createEAttribute();

			eAttribute.setName(name);
			eAttribute.setChangeable(!property.isReadOnly());
			eAttribute.setUpperBound(property.getUpper());
			eAttribute.setLowerBound(property.getLower());
			eAttribute.setUnique(property.isUnique());
			eAttribute.setEType(getEClassifier(eClass.getEPackage(), property
				.getType()));

			ValueSpecification defaultValue = property.getDefaultValue();

			if (InstanceValue.class.isInstance(defaultValue)
				&& EnumerationLiteral.class
					.isInstance(((InstanceValue) defaultValue).getInstance())) {

				eAttribute
					.setDefaultValueLiteral(((EnumerationLiteral) ((InstanceValue) defaultValue)
						.getInstance()).getName());
			} else {

				try {
					String default_ = property.getDefault();
					EcorePackage.eINSTANCE.getEFactoryInstance()
						.createFromString(eAttribute.getEAttributeType(),
							default_);
					eAttribute.setDefaultValueLiteral(default_);
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
	 * 
	 * @deprecated Use UML2Util.UML22EcoreConverter instead.
	 */
	public static EReference createEReference(EClass eClass, Property property) {
		String name = getValidIdentifier(property.getName());
		EReference eReference = (EReference) eClass.getEStructuralFeature(name);

		if (null == eReference) {
			eReference = EcoreFactory.eINSTANCE.createEReference();

			eReference.setName(name);
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
	 *             already applied to the package or (one of) its nesting
	 *             package(s).
	 */
	public static void apply(Profile profile, org.eclipse.uml2.Package package_) {

		if (null == profile) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		String version = profile.getVersion();

		if (null == getEPackage(profile, version)) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(package_));
		}

		ProfileApplication profileApplication = getProfileApplication(profile,
			package_, true);

		if (null == profileApplication) {
			profileApplication = (ProfileApplication) package_
				.createPackageImport(UML2Package.eINSTANCE
					.getProfileApplication());
			profileApplication.setImportedProfile(profile);

			package_.getAppliedProfiles().add(profileApplication);
		} else {

			if (package_ != profileApplication.getImportingNamespace()
				|| version.equals(getVersion(profileApplication))) {

				throw new IllegalArgumentException(String.valueOf(profile));
			}

			List eAnnotationsToRemove = new ArrayList();

			for (Iterator allContents = getAllContents(package_, true, false); allContents
				.hasNext();) {

				EObject eObject = (EObject) allContents.next();

				if (Element.class.isInstance(eObject)) {
					Element element = (Element) eObject;
					EAnnotation appliedStereotypesEAnnotation = safeGetEAnnotation(
						element,
						StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);
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
								stereotype, version);
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

		getEAnnotation(profileApplication, ANNOTATION_SOURCE__ATTRIBUTES, true)
			.getDetails().put(ANNOTATION_DETAILS_KEY__VERSION, version);
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
					UML2Plugin.INSTANCE.log(e);
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
		getEAnnotation(profile, ANNOTATION_SOURCE__ATTRIBUTES, true)
			.getDetails().put(ANNOTATION_DETAILS_KEY__VERSION, null == version
				? String.valueOf(0)
				: String.valueOf(new Integer(Integer.parseInt(version) + 1)));

		getEAnnotation(profile, ANNOTATION_SOURCE__E_PACKAGES, true)
			.getContents().add(0, Profile2EPackageConverter.convert(profile));
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

			Profile importedProfile = ((ProfileApplication) appliedProfiles
				.next()).getImportedProfile();

			if (null != importedProfile) {
				allAppliedProfiles.add(importedProfile);
			}
		}

		EObject eContainer = package_.eContainer();

		if (Element.class.isInstance(eContainer)) {
			allAppliedProfiles
				.addAll(getAllAppliedProfiles(((Element) eContainer)
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

		return (String) safeGetEAnnotation(profile,
			ANNOTATION_SOURCE__ATTRIBUTES).getDetails().get(
			ANNOTATION_DETAILS_KEY__VERSION);
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
			package_, true);

		return null != profileApplication
			? getVersion(profileApplication)
			: null;
	}

	protected static String getVersion(ProfileApplication profileApplication) {
		return (String) safeGetEAnnotation(profileApplication,
			ANNOTATION_SOURCE__ATTRIBUTES).getDetails().get(
			ANNOTATION_DETAILS_KEY__VERSION);
	}

	protected static ProfileApplication getProfileApplication(Profile profile,
			org.eclipse.uml2.Package package_, boolean recurse) {

		EPackage ePackage = getEPackage(profile, profile.getVersion());

		if (null != ePackage) {

			for (Iterator appliedProfiles = package_.getAppliedProfiles()
				.iterator(); appliedProfiles.hasNext();) {

				ProfileApplication profileApplication = (ProfileApplication) appliedProfiles
					.next();
				Profile importedProfile = profileApplication
					.getImportedProfile();

				if (profile == importedProfile) {
					return profileApplication;
				} else {
					EPackage importedEPackage = getEPackage(importedProfile,
						getVersion(profileApplication));

					if (null != importedEPackage
						&& safeEquals(ePackage.getNsURI(), importedEPackage
							.getNsURI())) {

						return profileApplication;
					}
				}
			}

			if (recurse) {
				EObject eContainer = package_.eContainer();

				if (Element.class.isInstance(eContainer)) {
					return getProfileApplication(profile,
						((Element) eContainer).getNearestPackage(), recurse);
				}
			}
		}

		return null;
	}

	protected static Set getStereotypeApplications(Profile profile,
			Element element) {
		Set stereotypeApplications = new HashSet();

		List ePackages = safeGetEAnnotation(profile,
			ANNOTATION_SOURCE__E_PACKAGES).getContents();

		for (Iterator appliedStereotypes = safeGetEAnnotation(element,
			StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES)
			.getContents().iterator(); appliedStereotypes.hasNext();) {

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

		return null != getProfileApplication(profile, package_, false);
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
			: safeGetEAnnotation(profile, ANNOTATION_SOURCE__E_PACKAGES)
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

		if (null == profile) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(package_));
		}

		ProfileApplication profileApplication = getProfileApplication(profile,
			package_, false);

		if (null == profileApplication) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		List eAnnotationsToRemove = new ArrayList();

		for (Iterator allContents = getAllContents(profileApplication
			.getImportingNamespace(), true, false); allContents.hasNext();) {

			EObject eObject = (EObject) allContents.next();

			if (Element.class.isInstance(eObject)) {
				Element element = (Element) eObject;

				EAnnotation appliedStereotypesEAnnotation = safeGetEAnnotation(
					element,
					StereotypeOperations.ANNOTATION_SOURCE__APPLIED_STEREOTYPES);
				EList appliedStereotypesEAnnotationContents = appliedStereotypesEAnnotation
					.getContents();

				appliedStereotypesEAnnotationContents
					.removeAll(getStereotypeApplications(profile, element));

				if (appliedStereotypesEAnnotationContents.isEmpty()) {
					eAnnotationsToRemove.add(appliedStereotypesEAnnotation);
				}
			}
		}

		for (Iterator eAnnotations = eAnnotationsToRemove.iterator(); eAnnotations
			.hasNext();) {

			((EAnnotation) eAnnotations.next()).setEModelElement(null);
		}

		profileApplication.getImportingNamespace().getPackageImports().remove(
			profileApplication);
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

		ElementImport elementImport = profile.createElementImport();

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
	 * Creates and returns an instance of (the Ecore representation of) the
	 * specified classifier defined in the specified profile.
	 * 
	 * @param profile
	 *            The profile in which the classifier is defined.
	 * @param classifier
	 *            The classifier whose Ecore representation is to be
	 *            instantiated.
	 * @return An (Ecore) instance of the classifier.
	 * @exception IllegalArgumentException
	 *                If the classifier is not defined in the profile or cannot
	 *                be instantiated.
	 */
	public static EObject create(final Profile profile, Classifier classifier) {
		final EPackage ePackage = getEPackage(profile, getVersion(profile));

		if (null == ePackage) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		if (null == classifier || !profile.getOwnedTypes().contains(classifier)) {
			throw new IllegalArgumentException(String.valueOf(classifier));
		}

		return (EObject) new UML2Switch() {

			public Object caseClass(org.eclipse.uml2.Class class_) {

				if (!class_.isAbstract()) {
					EClass eClass = (EClass) ePackage
						.getEClassifier(getEClassifierName(class_));

					if (null != eClass) {
						return ePackage.getEFactoryInstance().create(eClass);
					}
				}

				return null;
			}

			public Object caseClassifier(Classifier classifier) {
				throw new IllegalArgumentException(String.valueOf(classifier));
			}

			public Object caseStereotype(Stereotype stereotype) {
				throw new IllegalArgumentException(String.valueOf(stereotype));
			}
		}.doSwitch(classifier);
	}

	/**
	 * Creates a(n) (abstract) stereotype with the specified name as an owned
	 * stereotype of the specified profile.
	 * 
	 * @param profile
	 *            The profile in which to create the owned stereotype.
	 * @param name
	 *            The name for the owned stereotype.
	 * @param isAbstract
	 *            Whether the owned stereotype should be abstract.
	 * @return The new stereotype.
	 * @exception IllegalArgumentException
	 *                If the name is empty.
	 */
	public static Stereotype createOwnedStereotype(Profile profile,
			String name, boolean isAbstract) {

		if (null == profile) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		Stereotype ownedStereotype = (Stereotype) profile
			.createOwnedMember(UML2Package.eINSTANCE.getStereotype());
		ownedStereotype.setName(name);
		ownedStereotype.setIsAbstract(isAbstract);
		return ownedStereotype;
	}

	public static EList getOwnedStereotypes(Profile profile) {
		EList ownedStereotypes = new UniqueEList();

		if (profile != null) {

			for (Iterator ownedMembers = profile.getOwnedMembers().iterator(); ownedMembers
				.hasNext();) {

				NamedElement ownedMember = (NamedElement) ownedMembers.next();

				if (Stereotype.class.isInstance(ownedMember)) {
					ownedStereotypes.add(ownedMember);
				}
			}
		}

		return ownedStereotypes;
	}

} // ProfileOperations
