/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML22Ecore.java,v 1.7 2005/01/19 22:57:34 khussey Exp $
 */
package org.eclipse.uml2.examples.uml22ecore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.examples.Converter;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Switch;

/**
 * @deprecated Use UML2Util.UML22EcoreConverter instead.
 */
public class UML22Ecore
		extends UML2Switch
		implements Converter {

	protected final Map modelMap = new HashMap();

	protected final Map elementMap = new HashMap();

	public UML22Ecore() {
		super();
	}

	protected EClassifier getEClassifier(TypedElement typedElement) {
		Type type = typedElement.getType();

		if (null == type || null == type.getName()) {
			return null;
		}

		EClassifier eClassifier = null;

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
			} else {
				eClassifier = EcorePackage.eINSTANCE.getEClassifier(type
					.getName());
			}
		}

		if (null == eClassifier) {
			eClassifier = (EClassifier) doSwitch(type);
		}

		return eClassifier;
	}

	protected void setAnnotations(Element element, EModelElement eModelElement) {

		for (Iterator annotations = element.getEAnnotations().iterator(); annotations
			.hasNext();) {

			EAnnotation annotation = (EAnnotation) annotations.next();

			if (!annotation.getDetails().isEmpty()) {
				EAnnotation eAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
				eAnnotation.setSource(annotation.getSource());
				eAnnotation.getDetails().putAll(annotation.getDetails().map());

				eModelElement.getEAnnotations().add(eAnnotation);
			}
		}
	}

	protected void setName(Classifier classifier, Stereotype stereotype,
			EClass eClass) {
		String className = (String) classifier
			.getValue(stereotype, "className"); //$NON-NLS-1$

		if (null != className && 0 != className.length()) {
			eClass.setName(className);
		}
	}

	protected void setInstanceClassName(Classifier classifier,
			Stereotype stereotype, EClassifier eClassifier) {
		String instanceClassName = (String) classifier.getValue(stereotype,
			"instanceClassName"); //$NON-NLS-1$

		if (null != instanceClassName && 0 != instanceClassName.length()) {
			eClassifier.setInstanceClassName(instanceClassName);
		}
	}

	protected void setXMLName(Classifier classifier, Stereotype stereotype,
			EClassifier eClassifier) {
		String xmlName = (String) classifier.getValue(stereotype, "xmlName"); //$NON-NLS-1$

		if (null != xmlName && 0 != xmlName.length()) {
			ExtendedMetaData.INSTANCE.setName(eClassifier, xmlName);
		}
	}

	protected void setXMLName(Property property, Stereotype stereotype,
			EStructuralFeature eStructuralFeature) {
		String xmlName = (String) property.getValue(stereotype, "xmlName"); //$NON-NLS-1$

		if (null != xmlName && 0 != xmlName.length()) {
			ExtendedMetaData.INSTANCE.setName(eStructuralFeature, xmlName);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.examples.Converter#convert(org.eclipse.emf.ecore.resource.ResourceSet,
	 *      org.eclipse.core.resources.IContainer, java.lang.String)
	 */
	public void convert(ResourceSet uml2ResourceSet, IContainer container,
			String fileExtension) {

		for (Iterator uml2Resources = new ArrayList(uml2ResourceSet
			.getResources()).iterator(); uml2Resources.hasNext();) {

			doSwitch((Resource) uml2Resources.next());
		}

		ResourceSet ecoreResourceSet = new ResourceSetImpl();

		for (Iterator keys = modelMap.keySet().iterator(); keys.hasNext();) {
			Resource uml2Resource = (Resource) keys.next();

			ecoreResourceSet.createResource(
				URI.createPlatformResourceURI(container.getFullPath().append(
					uml2Resource.getURI().trimFileExtension()
						.appendFileExtension(fileExtension).lastSegment())
					.toString())).getContents().add(modelMap.get(uml2Resource));
		}

		for (Iterator values = modelMap.values().iterator(); values.hasNext();) {

			try {
				((EPackage) values.next()).eResource().save(null);
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
		return (EObject) modelMap.get(resource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#doSwitch(org.eclipse.emf.ecore.EObject)
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

		if (object.getURI().lastSegment().endsWith(
			UML2Resource.PROFILE_FILE_EXTENSION)) {
			return this;
		}

		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		modelMap.put(object, ePackage);

		ePackage.setName(object.getURI().trimFileExtension().lastSegment());

		for (Iterator contents = object.getContents().iterator(); contents
			.hasNext();) {

			doSwitch((EObject) contents.next());
		}

		return ePackage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#defaultCase(org.eclipse.emf.ecore.EObject)
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
	 * @see org.eclipse.uml2.util.UML2Switch#caseClass(org.eclipse.uml2.Class)
	 */
	public Object caseClass(org.eclipse.uml2.Class object) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		elementMap.put(object, eClass);

		EPackage ePackage = (EPackage) doSwitch(object.getPackage());
		ePackage.getEClassifiers().add(eClass);

		eClass.setName(object.getName());
		eClass.setAbstract(object.isAbstract());

		Stereotype eClassStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EClass"); //$NON-NLS-1$

		if (null != eClassStereotype) {
			setName(object, eClassStereotype, eClass);

			setXMLName(object, eClassStereotype, eClass);

			EnumerationLiteral xmlContentKind = (EnumerationLiteral) object
				.getValue(eClassStereotype, "xmlContentKind"); //$NON-NLS-1$

			int contentKind = xmlContentKind.getEnumeration()
				.getOwnedLiterals().indexOf(xmlContentKind);

			if (0 != contentKind) {
				ExtendedMetaData.INSTANCE.setContentKind(eClass, contentKind);
			}
		}

		for (Iterator generalizations = object.getGeneralizations().iterator(); generalizations
			.hasNext();) {

			Generalization generalization = (Generalization) generalizations
				.next();

			if (org.eclipse.uml2.Class.class.isInstance(generalization
				.getGeneral())) {

				eClass.getESuperTypes().add(
					null == object.getAppliedStereotype("Ecore" //$NON-NLS-1$
						+ NamedElement.SEPARATOR + "Extend") //$NON-NLS-1$
						? eClass.getESuperTypes().size()
						: 0, doSwitch(generalization.getGeneral()));
			}
		}

		setAnnotations(object, eClass);

		defaultCase(object);

		return eClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseElement(org.eclipse.emf.ecore.Element)
	 */
	public Object caseElement(Element object) {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseEnumeration(org.eclipse.uml2.Enumeration)
	 */
	public Object caseEnumeration(Enumeration object) {
		EEnum eEnum = EcoreFactory.eINSTANCE.createEEnum();
		elementMap.put(object, eEnum);

		EPackage ePackage = (EPackage) doSwitch(object.getPackage());
		ePackage.getEClassifiers().add(eEnum);

		eEnum.setName(object.getName());

		Stereotype eEnumStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EEnum"); //$NON-NLS-1$

		if (null != eEnumStereotype) {
			String enumName = (String) object.getValue(eEnumStereotype,
				"enumName"); //$NON-NLS-1$

			if (null != enumName && 0 != enumName.length()) {
				eEnum.setName(enumName);
			}

			setXMLName(object, eEnumStereotype, eEnum);
		}

		setAnnotations(object, eEnum);

		defaultCase(object);

		return eEnum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseEnumerationLiteral(org.eclipse.uml2.EnumerationLiteral)
	 */
	public Object caseEnumerationLiteral(EnumerationLiteral object) {
		EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
		elementMap.put(object, eEnumLiteral);

		((EEnum) doSwitch(object.getEnumeration())).getELiterals().add(
			eEnumLiteral);

		eEnumLiteral.setName(object.getName());
		eEnumLiteral.setValue(object.getEnumeration().getOwnedLiterals()
			.indexOf(object));

		Stereotype eEnumLiteralStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EEnumLiteral"); //$NON-NLS-1$

		if (null != eEnumLiteralStereotype) {
			String enumLiteralName = (String) object.getValue(
				eEnumLiteralStereotype, "enumLiteralName"); //$NON-NLS-1$

			if (null != enumLiteralName && 0 != enumLiteralName.length()) {
				eEnumLiteral.setName(enumLiteralName);
			}
		}

		setAnnotations(object, eEnumLiteral);

		defaultCase(object);

		return eEnumLiteral;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseInterface(org.eclipse.uml2.Interface)
	 */
	public Object caseInterface(Interface object) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		elementMap.put(object, eClass);

		EPackage ePackage = (EPackage) doSwitch(object.getPackage());
		ePackage.getEClassifiers().add(eClass);

		eClass.setName(object.getName());
		eClass.setInterface(true);

		Stereotype eClassStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EClass"); //$NON-NLS-1$

		if (null != eClassStereotype) {
			setName(object, eClassStereotype, eClass);

			setInstanceClassName(object, eClassStereotype, eClass);

			setXMLName(object, eClassStereotype, eClass);
		}

		for (Iterator generalizations = object.getGeneralizations().iterator(); generalizations
			.hasNext();) {

			Generalization generalization = (Generalization) generalizations
				.next();

			if (Interface.class.isInstance(generalization.getGeneral())) {
				eClass.getESuperTypes().add(
					doSwitch(generalization.getGeneral()));
			}
		}

		setAnnotations(object, eClass);

		defaultCase(object);

		return eClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseOperation(org.eclipse.uml2.Operation)
	 */
	public Object caseOperation(Operation object) {
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		elementMap.put(object, eOperation);

		EClass eClass = (EClass) doSwitch(object.eContainer());
		eClass.getEOperations().add(eOperation);

		eOperation.setName(object.getName());
		eOperation.setEType(getEClassifier(object));

		Stereotype eOperationStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EOperation"); //$NON-NLS-1$

		if (null != eOperationStereotype) {
			String operationName = (String) object.getValue(
				eOperationStereotype, "operationName"); //$NON-NLS-1$

			if (null != operationName && 0 != operationName.length()) {
				eOperation.setName(operationName);
			}
		}

		setAnnotations(object, eOperation);

		defaultCase(object);

		return eOperation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#casePackage(org.eclipse.uml2.Package)
	 */
	public Object casePackage(org.eclipse.uml2.Package object) {
		EPackage ePackage = null == object.getNestingPackage()
			? (EPackage) doSwitch(object.eResource())
			: EcoreFactory.eINSTANCE.createEPackage();
		elementMap.put(object, ePackage);

		EPackage eSuperPackage = (EPackage) (null == object.getNestingPackage()
			? null
			: doSwitch(object.getNestingPackage()));

		if (null != eSuperPackage) {
			eSuperPackage.getESubpackages().add(ePackage);
		}

		ePackage.setName(object.getName());

		Stereotype ePackageStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EPackage"); //$NON-NLS-1$

		String packageName = (String) (null == ePackageStereotype
			? null
			: object.getValue(ePackageStereotype, "packageName")); //$NON-NLS-1$

		if (null != packageName && 0 != packageName.length()) {
			ePackage.setName(packageName);
		}

		String basePackage = (String) (null == ePackageStereotype
			? null
			: object.getValue(ePackageStereotype, "basePackage")); //$NON-NLS-1$
		String nsPrefix = (String) (null == ePackageStereotype
			? null
			: object.getValue(ePackageStereotype, "nsPrefix")); //$NON-NLS-1$

		if (null == nsPrefix || 0 == nsPrefix.length()) {
			nsPrefix = ePackage.getName();

			if (null != eSuperPackage) {
				nsPrefix = eSuperPackage.getNsPrefix() + '.' + nsPrefix;
			} else if (null != basePackage && 0 != basePackage.length()) {
				nsPrefix = basePackage + '.' + nsPrefix;
			}
		}

		ePackage.setNsPrefix(nsPrefix);

		String nsURI = (String) (null == ePackageStereotype
			? null
			: object.getValue(ePackageStereotype, "nsURI")); //$NON-NLS-1$

		if (null == nsURI || 0 == nsURI.length()) {
			nsURI = "http:///" + nsPrefix.replace('.', '/') + ".ecore"; //$NON-NLS-1$ //$NON-NLS-2$
		}

		ePackage.setNsURI(nsURI);

		setAnnotations(object, ePackage);

		defaultCase(object);

		return ePackage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseParameter(org.eclipse.uml2.Parameter)
	 */
	public Object caseParameter(Parameter object) {

		if (null == object.getOperation()) {
			return this;
		}

		EParameter eParameter = EcoreFactory.eINSTANCE.createEParameter();
		elementMap.put(object, eParameter);

		EOperation eOperation = (EOperation) doSwitch(object.getOperation());
		eOperation.getEParameters().add(eParameter);

		eParameter.setName(object.getName());
		eParameter.setEType(getEClassifier(object));

		Stereotype eParameterStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EParameter"); //$NON-NLS-1$

		if (null != eParameterStereotype) {
			String parameterName = (String) object.getValue(
				eParameterStereotype, "parameterName"); //$NON-NLS-1$

			if (null != parameterName && 0 != parameterName.length()) {
				eParameter.setName(parameterName);
			}
		}

		setAnnotations(object, eParameter);

		defaultCase(object);

		return eParameter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#casePrimitiveType(org.eclipse.uml2.PrimitiveType)
	 */
	public Object casePrimitiveType(PrimitiveType object) {
		EDataType eDataType = EcoreFactory.eINSTANCE.createEDataType();
		elementMap.put(object, eDataType);

		EPackage ePackage = (EPackage) doSwitch(object.getPackage());
		ePackage.getEClassifiers().add(eDataType);

		eDataType.setName(object.getName());
		eDataType.setInstanceClassName(object.getName());

		Stereotype eDataTypeStereotype = object.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + "EDataType"); //$NON-NLS-1$

		if (null != eDataTypeStereotype) {
			String dataTypeName = (String) object.getValue(eDataTypeStereotype,
				"dataTypeName"); //$NON-NLS-1$

			if (null != dataTypeName && 0 != dataTypeName.length()) {
				eDataType.setName(dataTypeName);
			}

			setInstanceClassName(object, eDataTypeStereotype, eDataType);

			setXMLName(object, eDataTypeStereotype, eDataType);
		}

		setAnnotations(object, eDataType);

		defaultCase(object);

		return eDataType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseProperty(org.eclipse.uml2.Property)
	 */
	public Object caseProperty(Property object) {
		EStructuralFeature eStructuralFeature = null;
		EClass eClass = null;

		Stereotype eStructuralFeatureStereotype = null;

		if (DataType.class.isInstance(object.getType())) {
			eStructuralFeature = EcoreFactory.eINSTANCE.createEAttribute();
			elementMap.put(object, eStructuralFeature);

			eClass = (EClass) doSwitch(object.eContainer());
			eClass.getEStructuralFeatures().add(eStructuralFeature);

			EDataType eDataType = (EDataType) getEClassifier(object);

			try {
				eDataType.getEPackage().getEFactoryInstance().createFromString(
					eDataType, object.getDefault());
				eStructuralFeature.setDefaultValueLiteral(object.getDefault());
			} catch (Exception e) {
				// ignore
			}

			eStructuralFeatureStereotype = object
				.getAppliedStereotype("Ecore" + NamedElement.SEPARATOR //$NON-NLS-1$
					+ "EAttribute"); //$NON-NLS-1$

			if (null != eStructuralFeatureStereotype) {
				String attributeName = (String) object.getValue(
					eStructuralFeatureStereotype, "attributeName"); //$NON-NLS-1$

				if (null != attributeName && 0 != attributeName.length()) {
					eStructuralFeature.setName(attributeName);
				}

				((EAttribute) eStructuralFeature).setID(Boolean.TRUE
					.equals(object.getValue(eStructuralFeatureStereotype,
						"isID"))); //$NON-NLS-1$
			}
		} else {
			eStructuralFeature = EcoreFactory.eINSTANCE.createEReference();
			elementMap.put(object, eStructuralFeature);

			eClass = (EClass) doSwitch(object.eContainer());
			eClass.getEStructuralFeatures().add(eStructuralFeature);

			((EReference) eStructuralFeature).setContainment(object
				.isComposite());

			if (null != object.getOpposite()) {
				((EReference) eStructuralFeature)
					.setEOpposite((EReference) doSwitch(object.getOpposite()));
			}

			eStructuralFeatureStereotype = object
				.getAppliedStereotype("Ecore" + NamedElement.SEPARATOR //$NON-NLS-1$
					+ "EReference"); //$NON-NLS-1$

			if (null != eStructuralFeatureStereotype) {
				String referenceName = (String) object.getValue(
					eStructuralFeatureStereotype, "referenceName"); //$NON-NLS-1$

				if (null != referenceName && 0 != referenceName.length()) {
					eStructuralFeature.setName(referenceName);
				}

				((EReference) eStructuralFeature)
					.setResolveProxies(Boolean.TRUE.equals(object.getValue(
						eStructuralFeatureStereotype, "isResolveProxies"))); //$NON-NLS-1$
			}
		}

		eStructuralFeature.setName(null == eStructuralFeature.getName()
			? object.getName()
			: eStructuralFeature.getName());

		eStructuralFeature.setChangeable(!object.isReadOnly());
		eStructuralFeature.setDerived(object.isDerived());

		if (object.getUpper() != eStructuralFeature.getUpperBound()) {
			eStructuralFeature.setUpperBound(object.getUpper());
		}

		if (object.getLower() != eStructuralFeature.getLowerBound()) {
			eStructuralFeature.setLowerBound(object.getLower());
		}

		eStructuralFeature.setUnique(object.isUnique());

		eStructuralFeature.setEType(null == object.getType()
			? EcorePackage.eINSTANCE.getEObject()
			: getEClassifier(object));

		if (null != eStructuralFeatureStereotype) {
			eStructuralFeature.setTransient(Boolean.TRUE.equals(object
				.getValue(eStructuralFeatureStereotype, "isTransient"))); //$NON-NLS-1$

			eStructuralFeature.setVolatile(Boolean.TRUE.equals(object.getValue(
				eStructuralFeatureStereotype, "isVolatile"))); //$NON-NLS-1$

			eStructuralFeature.setUnsettable(Boolean.TRUE.equals(object
				.getValue(eStructuralFeatureStereotype, "isUnsettable"))); //$NON-NLS-1$

			setXMLName(object, eStructuralFeatureStereotype, eStructuralFeature);

			String xmlNamespace = (String) object.getValue(
				eStructuralFeatureStereotype, "xmlNamespace"); //$NON-NLS-1$

			if (null != xmlNamespace && 0 != xmlNamespace.length()) {
				ExtendedMetaData.INSTANCE.setNamespace(eStructuralFeature,
					xmlNamespace);
			}

			EnumerationLiteral xmlFeatureKind = (EnumerationLiteral) object
				.getValue(eStructuralFeatureStereotype, "xmlFeatureKind"); //$NON-NLS-1$

			int featureKind = xmlFeatureKind.getEnumeration()
				.getOwnedLiterals().indexOf(xmlFeatureKind);

			if (0 != featureKind) {
				ExtendedMetaData.INSTANCE.setFeatureKind(eStructuralFeature,
					featureKind);
			}

			try {
				EnumerationLiteral visibility = (EnumerationLiteral) object
					.getValue(eStructuralFeatureStereotype, "visibility"); //$NON-NLS-1$

				int visibilityKind = visibility.getEnumeration()
					.getOwnedLiterals().indexOf(visibility);

				switch (visibilityKind) {
					case 1 :
						EcoreUtil.setSuppressedVisibility(eStructuralFeature,
							EcoreUtil.GET, true);

						if (eStructuralFeature.isChangeable()
							&& !eStructuralFeature.isMany()) {

							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.SET, true);
						}

						if (eStructuralFeature.isUnsettable()) {
							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.IS_SET, true);

							if (eStructuralFeature.isChangeable()) {
								EcoreUtil.setSuppressedVisibility(
									eStructuralFeature, EcoreUtil.UNSET, true);
							}
						}
						break;
					case 2 :
						if (!eStructuralFeature.isMany()
							&& eStructuralFeature.isChangeable()) {

							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.SET, true);
						}

						if (eStructuralFeature.isUnsettable()) {
							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.IS_SET, true);

							if (eStructuralFeature.isChangeable()) {
								EcoreUtil.setSuppressedVisibility(
									eStructuralFeature, EcoreUtil.UNSET, true);
							}
						}
						break;
					case 3 :
						if (eStructuralFeature.isUnsettable()) {
							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.IS_SET, true);

							if (eStructuralFeature.isChangeable()) {
								EcoreUtil.setSuppressedVisibility(
									eStructuralFeature, EcoreUtil.UNSET, true);
							}
						}
						break;
					case 4 :
						if (!eStructuralFeature.isMany()
							&& eStructuralFeature.isChangeable()) {

							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.SET, true);
						}

						if (eStructuralFeature.isUnsettable()
							&& eStructuralFeature.isChangeable()) {

							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.UNSET, true);
						}
						break;
					default :
						break;
				}
			} catch (IllegalArgumentException iae) {
				// ignore
			}
		}

		setAnnotations(object, eStructuralFeature);

		defaultCase(object);

		return eStructuralFeature;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.util.UML2Switch#caseConstraint(org.eclipse.uml2.Constraint)
	 */
	public Object caseConstraint(Constraint object) {

		for (Iterator constrainedElements = object.getConstrainedElements()
			.iterator(); constrainedElements.hasNext();) {

			Object constrainedElement = doSwitch((Element) constrainedElements
				.next());

			if (EModelElement.class.isInstance(constrainedElement)) {
				EModelElement eModelElement = (EModelElement) constrainedElement;

				List constraints = new ArrayList(EcoreUtil
					.getConstraints(eModelElement));
				constraints.add(object.getName());

				EcoreUtil.setConstraints(eModelElement, constraints);
			}
		}

		return this;
	}
}