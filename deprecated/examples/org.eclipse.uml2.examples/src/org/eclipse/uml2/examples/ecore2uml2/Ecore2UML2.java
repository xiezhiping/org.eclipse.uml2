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
 * $Id: Ecore2UML2.java,v 1.4 2004/11/02 15:31:00 khussey Exp $
 */
package org.eclipse.uml2.examples.ecore2uml2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.AggregationKind;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterDirectionKind;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.examples.Converter;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Switch;

/**
 *  
 */
public class Ecore2UML2
	extends EcoreSwitch
	implements Converter {

	protected static final String ANNOTATION_SOURCE__REDEFINES = "redefines"; //$NON-NLS-1$

	protected static final String ANNOTATION_SOURCE__SUBSETS = "subsets"; //$NON-NLS-1$

	protected static final String ANNOTATION_SOURCE__UNION = "union"; //$NON-NLS-1$

	protected final Map modelMap = new HashMap();

	protected final Map elementMap = new HashMap();

	protected Model ecorePrimitiveTypes = null;

	public Ecore2UML2() {
		super();
	}

	protected PrimitiveType getEcorePrimitiveType(String name) {

		if (null == ecorePrimitiveTypes) {

			try {
				ecorePrimitiveTypes = (Model) EcoreUtil
					.getObjectByType(
						new ResourceSetImpl()
							.getResource(
								URI
									.createURI(UML2Resource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
								true).getContents(), UML2Package.eINSTANCE
							.getModel());
			} catch (Exception e) {
				e.printStackTrace(System.err);

				ecorePrimitiveTypes = UML2Factory.eINSTANCE.createModel();
			}
		}

		return (PrimitiveType) ecorePrimitiveTypes.getOwnedType(name);
	}

	protected EPackage getNearestEPackage(EObject eObject) {
		return EPackage.class.isInstance(eObject)
			? (EPackage) eObject
			: (null == eObject.eContainer()
				? null
				: getNearestEPackage(eObject.eContainer()));
	}

	protected EList getOwnedAttributes(Type type) {

		return (EList) new UML2Switch() {

			public Object caseArtifact(Artifact object) {
				return object.getOwnedAttributes();
			}

			public Object caseDataType(DataType object) {
				return object.getOwnedAttributes();
			}

			public Object caseInterface(Interface object) {
				return object.getOwnedAttributes();
			}

			public Object caseSignal(Signal object) {
				return object.getOwnedAttributes();
			}

			public Object caseStructuredClassifier(StructuredClassifier object) {
				return object.getOwnedAttributes();
			}
		}.doSwitch(type);
	}

	protected EList getOwnedOperations(Type type) {

		return (EList) new UML2Switch() {

			public Object caseClass(org.eclipse.uml2.Class object) {
				return object.getOwnedOperations();
			}

			public Object caseDataType(DataType object) {
				return object.getOwnedOperations();
			}

			public Object caseInterface(Interface object) {
				return object.getOwnedOperations();
			}
		}.doSwitch(type);
	}

	protected Type getType(ETypedElement eTypedElement) {
		EClassifier eClassifier = eTypedElement.getEType();

		if (null == eClassifier || null == eClassifier.getName()) {
			return null;
		}

		Type type = null;

		if (EcorePackage.EDATA_TYPE == eClassifier.eClass().getClassifierID()) {
			type = getEcorePrimitiveType(eClassifier.getName());
		}

		if (null == type) {
			type = (Type) doSwitch(eClassifier);
		}

		org.eclipse.uml2.Package package_ = (org.eclipse.uml2.Package) doSwitch(getNearestEPackage(eTypedElement));

		if (!package_.getOwnedMembers().contains(type)
			&& !package_.getImportedPackages().contains(type.getPackage())) {

			package_.importPackage(VisibilityKind.PUBLIC_LITERAL, type
				.getPackage());
		}

		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.examples.Converter#convert(org.eclipse.emf.ecore.resource.ResourceSet,
	 *      org.eclipse.core.resources.IContainer, java.lang.String)
	 */
	public void convert(ResourceSet ecoreResourceSet, IContainer container,
			String fileExtension) {

		for (Iterator ecoreResources = new ArrayList(ecoreResourceSet
			.getResources()).iterator(); ecoreResources.hasNext();) {

			doSwitch((Resource) ecoreResources.next());
		}

		ResourceSet uml2ResourceSet = new ResourceSetImpl();

		for (Iterator keys = modelMap.keySet().iterator(); keys.hasNext();) {
			Resource ecoreResource = (Resource) keys.next();

			uml2ResourceSet.createResource(
				URI.createPlatformResourceURI(container.getFullPath().append(
					ecoreResource.getURI().trimFileExtension()
						.appendFileExtension(fileExtension).lastSegment())
					.toString())).getContents()
				.add(modelMap.get(ecoreResource));
		}

		for (Iterator values = modelMap.values().iterator(); values.hasNext();) {

			try {
				((Model) values.next()).eResource().save(null);
			} catch (IOException ioe) {
				ioe.printStackTrace(System.err);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.examples.Converter#getModel(org.eclipse.emf.ecore.resource.Resource)
	 */
	public EObject getModel(Resource resource) {

		if (EcorePackage.eINSTANCE.eResource().getURI().trimFileExtension()
			.lastSegment().equals(
				resource.getURI().trimFileExtension().lastSegment())) {

			resource = EcorePackage.eINSTANCE.eResource();
		}

		return (EObject) modelMap.get(resource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#doSwitch(org.eclipse.emf.ecore.EObject)
	 */
	public Object doSwitch(EObject theEObject) {

		if (null != theEObject.eContainer()) {
			doSwitch(theEObject.eContainer());
		}

		return elementMap.containsKey(theEObject)
			? elementMap.get(theEObject)
			: super.doSwitch(theEObject);
	}

	public Object doSwitch(Resource resource) {
		return modelMap.containsKey(resource)
			? modelMap.get(resource)
			: caseResource(resource);
	}

	public Object caseResource(Resource object) {

		if (EcorePackage.eINSTANCE.eResource().getURI().trimFileExtension()
			.lastSegment().equals(
				object.getURI().trimFileExtension().lastSegment())) {

			object = EcorePackage.eINSTANCE.eResource();
		}

		Model model = UML2Factory.eINSTANCE.createModel();
		modelMap.put(object, model);

		model.setName(object.getURI().trimFileExtension().lastSegment());

		for (Iterator contents = object.getContents().iterator(); contents
			.hasNext();) {

			doSwitch((EObject) contents.next());
		}

		return model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	public Object defaultCase(EObject object) {

		if (object.eClass().eContainer() == modelPackage) {

			for (Iterator eContents = object.eContents().iterator(); eContents
				.hasNext();) {

				doSwitch((EObject) eContents.next());
			}
		}

		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEAnnotation(org.eclipse.emf.ecore.EAnnotation)
	 */
	public Object caseEAnnotation(EAnnotation object) {

		switch (object.getEModelElement().eClass().getClassifierID()) {
			case EcorePackage.EATTRIBUTE :
			case EcorePackage.EREFERENCE :
				Property property = (Property) doSwitch(object
					.getEModelElement());

				if (ANNOTATION_SOURCE__UNION.equals(object.getSource())) {
					property.setIsDerivedUnion(true);
				}

				if (ANNOTATION_SOURCE__REDEFINES.equals(object.getSource())) {

					for (Iterator references = object.getReferences()
						.iterator(); references.hasNext();) {

						ETypedElement typedElement = (ETypedElement) references
							.next();

						if (EcorePackage.EOPERATION != typedElement.eClass()
							.getClassifierID()) {

							property.getRedefinedProperties().add(
								doSwitch(typedElement));
						}
					}
				}

				if (ANNOTATION_SOURCE__SUBSETS.equals(object.getSource())) {

					for (Iterator references = object.getReferences()
						.iterator(); references.hasNext();) {

						ETypedElement typedElement = (ETypedElement) references
							.next();

						if (EcorePackage.EOPERATION != typedElement.eClass()
							.getClassifierID()) {

							property.getSubsettedProperties().add(
								doSwitch(typedElement));
						}
					}
				}

				break;
			case EcorePackage.EOPERATION :
				Operation operation = (Operation) doSwitch(object
					.getEModelElement());

				if (ANNOTATION_SOURCE__REDEFINES.equals(object.getSource())) {

					for (Iterator references = object.getReferences()
						.iterator(); references.hasNext();) {

						ETypedElement typedElement = (ETypedElement) references
							.next();

						if (EcorePackage.EOPERATION == typedElement.eClass()
							.getClassifierID()) {

							operation.getRedefinedOperations().add(
								doSwitch(typedElement));
						}
					}
				}

				break;
		}

		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEAttribute(org.eclipse.emf.ecore.EAttribute)
	 */
	public Object caseEAttribute(EAttribute object) {
		Property property = UML2Factory.eINSTANCE.createProperty();
		elementMap.put(object, property);

		getOwnedAttributes((Classifier) doSwitch(object.getEContainingClass()))
			.add(property);

		property.setName(object.getName());
		property.setIsReadOnly(!object.isChangeable());
		property.setIsDerived(object.isDerived());
		property.setType(getType(object));
		property.setVisibility(VisibilityKind.PUBLIC_LITERAL);

		if (object.getUpperBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY
			&& object.getUpperBound() != property.getUpper()) {

			property.setUpperBound(object.getUpperBound());
		}

		if (object.getLowerBound() != property.getLower()) {
			property.setLowerBound(object.getLowerBound());
		}

		defaultCase(object);

		return property;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEClass(org.eclipse.emf.ecore.EClass)
	 */
	public Object caseEClass(EClass object) {

		if (EcorePackage.eNS_URI.equals(object.getEPackage().getNsURI())) {
			object = (EClass) EcorePackage.eINSTANCE.getEClassifier(object
				.getName());

			if (elementMap.containsKey(object)) {
				return elementMap.get(object);
			}
		}

		Classifier classifier = object.isInterface()
			? (Classifier) UML2Factory.eINSTANCE.createInterface()
			: (Classifier) UML2Factory.eINSTANCE.createClass();
		elementMap.put(object, classifier);

		((org.eclipse.uml2.Package) doSwitch(object.getEPackage()))
			.getOwnedMembers().add(classifier);

		classifier.setName(object.getName());
		classifier.setIsAbstract(object.isAbstract());

		for (Iterator eSuperClasses = object.getESuperTypes().iterator(); eSuperClasses
			.hasNext();) {

			classifier.createGeneralization(
				UML2Package.eINSTANCE.getGeneralization()).setGeneral(
				(Classifier) doSwitch((EClass) eSuperClasses.next()));
		}

		defaultCase(object);

		return classifier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEDataType(org.eclipse.emf.ecore.EDataType)
	 */
	public Object caseEDataType(EDataType object) {

		if (EcorePackage.eNS_URI.equals(object.getEPackage().getNsURI())) {
			object = (EDataType) EcorePackage.eINSTANCE.getEClassifier(object
				.getName());

			if (elementMap.containsKey(object)) {
				return elementMap.get(object);
			}
		}

		PrimitiveType primitiveType = UML2Factory.eINSTANCE
			.createPrimitiveType();
		elementMap.put(object, primitiveType);

		((org.eclipse.uml2.Package) doSwitch(object.getEPackage()))
			.getOwnedMembers().add(primitiveType);

		primitiveType.setName(object.getName());

		defaultCase(object);

		return primitiveType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEEnum(org.eclipse.emf.ecore.EEnum)
	 */
	public Object caseEEnum(EEnum object) {

		if (EcorePackage.eNS_URI.equals(object.getEPackage().getNsURI())) {
			object = (EEnum) EcorePackage.eINSTANCE.getEClassifier(object
				.getName());

			if (elementMap.containsKey(object)) {
				return elementMap.get(object);
			}
		}

		Enumeration enumeration = UML2Factory.eINSTANCE.createEnumeration();
		elementMap.put(object, enumeration);

		((org.eclipse.uml2.Package) doSwitch(object.getEPackage()))
			.getOwnedMembers().add(enumeration);

		enumeration.setName(object.getName());

		defaultCase(object);

		return enumeration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEEnumLiteral(org.eclipse.emf.ecore.EEnumLiteral)
	 */
	public Object caseEEnumLiteral(EEnumLiteral object) {
		EnumerationLiteral enumerationLiteral = UML2Factory.eINSTANCE
			.createEnumerationLiteral();
		elementMap.put(object, enumerationLiteral);

		((Enumeration) doSwitch(object.getEEnum())).getOwnedLiterals().add(
			enumerationLiteral);

		enumerationLiteral.setName(object.getName());

		defaultCase(object);

		return enumerationLiteral;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEOperation(org.eclipse.emf.ecore.EOperation)
	 */
	public Object caseEOperation(EOperation object) {
		Operation operation = UML2Factory.eINSTANCE.createOperation();
		elementMap.put(object, operation);

		getOwnedOperations((Classifier) doSwitch(object.getEContainingClass()))
			.add(operation);

		operation.setName(object.getName());

		if (null != object.getEType()) {
			Parameter parameter = operation
				.createReturnResult(UML2Package.eINSTANCE.getParameter());

			parameter.setDirection(ParameterDirectionKind.RETURN_LITERAL);
			parameter.setType(getType(object));
		}

		operation.setVisibility(VisibilityKind.PUBLIC_LITERAL);

		defaultCase(object);

		return operation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEPackage(org.eclipse.emf.ecore.EPackage)
	 */
	public Object caseEPackage(EPackage object) {

		if (EcorePackage.eNS_URI.equals(object.getNsURI())) {
			object = EcorePackage.eINSTANCE;

			if (elementMap.containsKey(object)) {
				return elementMap.get(object);
			}
		}

		org.eclipse.uml2.Package package_ = null == object.getESuperPackage()
			? (org.eclipse.uml2.Package) doSwitch(object.eResource())
			: UML2Factory.eINSTANCE.createPackage();
		elementMap.put(object, package_);

		org.eclipse.uml2.Package superPackage = (org.eclipse.uml2.Package) (null == object
			.getESuperPackage()
			? null
			: doSwitch(object.getESuperPackage()));

		if (null != superPackage) {
			superPackage.getOwnedMembers().add(package_);
		}

		package_.setName(object.getName());

		defaultCase(object);

		return package_;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEParameter(org.eclipse.emf.ecore.EParameter)
	 */
	public Object caseEParameter(EParameter object) {
		Parameter parameter = UML2Factory.eINSTANCE.createParameter();
		elementMap.put(object, parameter);

		((Operation) doSwitch(object.getEOperation())).getOwnedParameters()
			.add(parameter);

		parameter.setName(object.getName());
		parameter.setType(getType(object));

		defaultCase(object);

		return parameter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEReference(org.eclipse.emf.ecore.EReference)
	 */
	public Object caseEReference(EReference object) {
		EReference end1 = object.isContainer()
			? object.getEOpposite()
			: object;
		EReference end2 = end1.getEOpposite();

		Property end1Property = UML2Factory.eINSTANCE.createProperty();
		elementMap.put(end1, end1Property);

		Classifier end1Classifier = (Classifier) doSwitch(end1
			.getEContainingClass());
		getOwnedAttributes(end1Classifier).add(end1Property);

		Association association = (Association) end1Classifier.getPackage()
			.createOwnedMember(UML2Package.eINSTANCE.getAssociation());

		end1Property.setName(end1.getName());
		end1Property.setAggregation(end1.isContainment()
			? AggregationKind.COMPOSITE_LITERAL
			: AggregationKind.NONE_LITERAL);
		end1Property.setAssociation(association);
		end1Property.setIsDerived(end1.isDerived());
		end1Property.setIsOrdered(true);
		end1Property.setIsReadOnly(!end1.isChangeable());

		if (end1.getUpperBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY
			&& end1.getUpperBound() != end1Property.getUpper()) {

			end1Property.setUpperBound(end1.getUpperBound());
		}

		if (end1.getLowerBound() != end1Property.getLower()) {
			end1Property.setLowerBound(end1.getLowerBound());
		}

		end1Property.setVisibility(VisibilityKind.PUBLIC_LITERAL);

		Classifier end2Classifier = null;

		if (null == end2) {
			end2Classifier = (Classifier) doSwitch(end1.getEType());
			association.createOwnedEnd(UML2Package.eINSTANCE.getProperty())
				.setType(end1Classifier);
		} else {
			Property end2Property = UML2Factory.eINSTANCE.createProperty();
			elementMap.put(end2, end2Property);

			end2Classifier = (Classifier) doSwitch(end1.getEType());
			getOwnedAttributes(end2Classifier).add(end2Property);

			end2Property.setName(end2.getName());
			end2Property.setAssociation(association);
			end2Property.setIsDerived(end2.isDerived());
			end2Property.setIsOrdered(true);
			end2Property.setIsReadOnly(!end2.isChangeable());

			if (end2.getUpperBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY
				&& end2.getUpperBound() != end2Property.getUpper()) {

				end2Property.setUpperBound(end2.getUpperBound());
			}

			if (end2.getLowerBound() != end2Property.getLower()) {
				end2Property.setLowerBound(end2.getLowerBound());
			}

			end2Property.setType(end1Classifier);
			end2Property.setVisibility(VisibilityKind.PUBLIC_LITERAL);
		}

		end1Property.setType(end2Classifier);

		defaultCase(object);

		return end1Property;
	}

}