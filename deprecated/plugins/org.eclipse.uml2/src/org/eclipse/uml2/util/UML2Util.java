/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2Util.java,v 1.1 2005/01/12 22:03:28 khussey Exp $
 */
package org.eclipse.uml2.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Comment;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.DirectedRelationship;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.Implementation;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.LiteralInteger;
import org.eclipse.uml2.LiteralUnlimitedNatural;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.PackageMerge;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * 
 */
public class UML2Util {

	protected UML2Util() {
		super();
	}

	protected static class QualifiedTextProvider {

		public String getText(EObject eObject) {

			return eObject instanceof NamedElement
				? ((NamedElement) eObject).getName()
				: (eObject instanceof ENamedElement
					? ((ENamedElement) eObject).getName()
					: EMPTY_STRING);
		}

		public String getSeparator() {
			return NamedElement.SEPARATOR;
		}

		public String getFeatureText(EStructuralFeature eStructuralFeature) {
			return eStructuralFeature.getName();
		}

		public String getClassText(EObject eObject) {
			return eObject.eClass().getName();
		}

	}

	protected static interface Converter {

		Collection convert(Collection eObjects, Map options,
				DiagnosticChain diagnostics, Map context);

	}

	public static class Ecore2UML2Converter
			extends EcoreSwitch
			implements Converter {

		protected final Map elementMap = new HashMap();

		protected Collection ePackages = null;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEAnnotation(org.eclipse.emf.ecore.EAnnotation)
		 */
		public Object caseEAnnotation(EAnnotation eAnnotation) {
			return super.caseEAnnotation(eAnnotation);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEAttribute(org.eclipse.emf.ecore.EAttribute)
		 */
		public Object caseEAttribute(EAttribute eAttribute) {
			return super.caseEAttribute(eAttribute);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEClass(org.eclipse.emf.ecore.EClass)
		 */
		public Object caseEClass(EClass eClass) {
			return super.caseEClass(eClass);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEDataType(org.eclipse.emf.ecore.EDataType)
		 */
		public Object caseEDataType(EDataType eDataType) {
			return super.caseEDataType(eDataType);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEEnum(org.eclipse.emf.ecore.EEnum)
		 */
		public Object caseEEnum(EEnum eEnum) {
			return super.caseEEnum(eEnum);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEEnumLiteral(org.eclipse.emf.ecore.EEnumLiteral)
		 */
		public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
			return super.caseEEnumLiteral(eEnumLiteral);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEOperation(org.eclipse.emf.ecore.EOperation)
		 */
		public Object caseEOperation(EOperation eOperation) {
			return super.caseEOperation(eOperation);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEPackage(org.eclipse.emf.ecore.EPackage)
		 */
		public Object caseEPackage(EPackage ePackage) {
			return super.caseEPackage(ePackage);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEParameter(org.eclipse.emf.ecore.EParameter)
		 */
		public Object caseEParameter(EParameter eParameter) {
			return super.caseEParameter(eParameter);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEReference(org.eclipse.emf.ecore.EReference)
		 */
		public Object caseEReference(EReference eReference) {
			return super.caseEReference(eReference);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		public Object defaultCase(EObject eObject) {

			for (Iterator eContents = eObject.eContents().iterator(); eContents
				.hasNext();) {

				doSwitch((EObject) eContents.next());
			}

			return super.defaultCase(eObject);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreSwitch#doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public Object doSwitch(EObject eObject) {
			Object element = elementMap.get(eObject);

			return null == element
				? super.doSwitch(eObject)
				: element;
		}

		protected void processOptions(EPackage ePackage, final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			new EcoreSwitch() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.emf.ecore.util.EcoreSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
				 */
				public Object defaultCase(EObject eObject) {

					for (Iterator eContents = eObject.eContents().iterator(); eContents
						.hasNext();) {

						doSwitch((EObject) eContents.next());
					}

					return super.defaultCase(eObject);
				}
			}.doSwitch(ePackage);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Util.Converter#convert(java.util.Collection)
		 */
		public Collection convert(Collection eObjects, Map options,
				DiagnosticChain diagnostics, Map context) {

			ePackages = EcoreUtil.getObjectsByType(eObjects,
				EcorePackage.eINSTANCE.getEPackage());

			for (Iterator i = ePackages.iterator(); i.hasNext();) {
				EPackage ePackage = (EPackage) i.next();

				doSwitch(ePackage);

				if (null != options) {
					processOptions(ePackage, options, diagnostics, context);
				}
			}

			return getRootContainers(EcoreUtil.getObjectsByType(elementMap
				.values(), UML2Package.eINSTANCE.getPackage()));
		}
	}

	protected static class UML22EcoreConverter
			extends UML2Switch
			implements Converter {

		protected static final String ANNOTATION_SOURCE__REDEFINES = "redefines"; //$NON-NLS-1$

		protected static final String ANNOTATION_SOURCE__SUBSETS = "subsets"; //$NON-NLS-1$

		protected static final String ANNOTATION_SOURCE__UNION = "union"; //$NON-NLS-1$

		protected final Map eModelElementMap = new HashMap();

		protected Collection packages = null;

		protected void setName(ENamedElement eNamedElement, String name) {
			eNamedElement.setName(name);
		}

		protected void setName(ENamedElement eNamedElement,
				NamedElement namedElement) {
			setName(eNamedElement, namedElement.getName());
		}

		protected void setName(ENamedElement eNamedElement,
				NamedElement namedElement, Stereotype stereotype,
				String propertyName) {

			String name = (String) namedElement.getValue(stereotype,
				propertyName);

			if (!isEmpty(name)) {
				setName(eNamedElement, name);
			}
		}

		protected void setXMLName(EClassifier eClassifier,
				Classifier classifier, Stereotype stereotype) {

			String xmlName = (String) classifier
				.getValue(stereotype, "xmlName"); //$NON-NLS-1$

			if (!isEmpty(xmlName)) {
				ExtendedMetaData.INSTANCE.setName(eClassifier, xmlName);
			}
		}

		protected void setXMLName(EStructuralFeature eStructuralFeature,
				Property property, Stereotype stereotype) {

			String xmlName = (String) property.getValue(stereotype, "xmlName"); //$NON-NLS-1$

			if (!isEmpty(xmlName)) {
				ExtendedMetaData.INSTANCE.setName(eStructuralFeature, xmlName);
			}
		}

		protected void setInstanceClassName(EClassifier eClassifier,
				Classifier classifier, Stereotype stereotype) {

			String instanceClassName = (String) classifier.getValue(stereotype,
				"instanceClassName"); //$NON-NLS-1$

			if (!isEmpty(instanceClassName)) {
				eClassifier.setInstanceClassName(instanceClassName);
			}
		}

		protected EClassifier getEType(Type type) {
			EClassifier eType = null;

			if (null != type) {
				String name = type.getName();

				if (!isEmpty(name) && type instanceof PrimitiveType) {

					if ("Boolean".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEBoolean();
					} else if ("Integer".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("String".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEString();
					} else if ("UnlimitedNatural".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("boolean".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEBoolean();
					} else if ("byte".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEByte();
					} else if ("char".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEChar();
					} else if ("double".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEDouble();
					} else if ("float".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEFloat();
					} else if ("int".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("long".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getELong();
					} else if ("short".equals(name)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEShort();
					} else {
						eType = EcorePackage.eINSTANCE.getEClassifier(name);
					}
				}

				if (null == eType) {
					eType = (EClassifier) doSwitch(type);
				}
			}

			return eType;
		}

		protected EClassifier getEType(TypedElement typedElement) {
			return getEType(typedElement.getType());
		}

		protected Stereotype getAppliedEcoreStereotype(Element element,
				String name) {

			return element.getAppliedStereotype("Ecore" //$NON-NLS-1$
				+ NamedElement.SEPARATOR + name);
		}

		protected void convertTaggedValues(final Classifier classifier,
				EClassifier eClassifier) {

			Stereotype eClassifierStereotype = (Stereotype) new EcoreSwitch() {

				public Object caseEClass(EClass eClass) {
					Stereotype eClassStereotype = getAppliedEcoreStereotype(
						classifier, "EClass"); //$NON-NLS-1$

					if (null != eClassStereotype) {
						setName(eClass, classifier, eClassStereotype,
							"className"); //$NON-NLS-1$

						EnumerationLiteral xmlContentKind = (EnumerationLiteral) classifier
							.getValue(eClassStereotype, "xmlContentKind"); //$NON-NLS-1$

						int contentKind = xmlContentKind.getEnumeration()
							.getOwnedLiterals().indexOf(xmlContentKind);

						if (0 != contentKind) {
							ExtendedMetaData.INSTANCE.setContentKind(eClass,
								contentKind);
						}
					}

					return eClassStereotype;
				}

				public Object caseEDataType(EDataType eDataType) {
					Stereotype eDataTypeStereotype = getAppliedEcoreStereotype(
						classifier, "EDataType"); //$NON-NLS-1$

					if (null != eDataTypeStereotype) {
						setName(eDataType, classifier, eDataTypeStereotype,
							"dataTypeName"); //$NON-NLS-1$
					}

					return eDataTypeStereotype;
				}
			}.doSwitch(eClassifier);

			if (null != eClassifierStereotype) {
				setXMLName(eClassifier, classifier, eClassifierStereotype);

				setInstanceClassName(eClassifier, classifier,
					eClassifierStereotype);
			}
		}

		protected void convertTaggedValues(Enumeration enumeration, EEnum eEnum) {
			Stereotype eEnumStereotype = getAppliedEcoreStereotype(enumeration,
				"EEnum"); //$NON-NLS-1$

			if (null != eEnumStereotype) {
				setName(eEnum, enumeration, eEnumStereotype, "enumName"); //$NON-NLS-1$

				setXMLName(eEnum, enumeration, eEnumStereotype);
			}
		}

		protected void convertTaggedValues(
				EnumerationLiteral enumerationLiteral, EEnumLiteral eEnumLiteral) {

			Stereotype eEnumLiteralStereotype = getAppliedEcoreStereotype(
				enumerationLiteral, "EEnumLiteral"); //$NON-NLS-1$

			if (null != eEnumLiteralStereotype) {
				setName(eEnumLiteral, enumerationLiteral,
					eEnumLiteralStereotype, "enumLiteralName"); //$NON-NLS-1$
			}
		}

		protected void convertTaggedValues(Operation operation,
				EOperation eOperation) {

			Stereotype eOperationStereotype = getAppliedEcoreStereotype(
				operation, "EOperation"); //$NON-NLS-1$

			if (null != eOperationStereotype) {
				setName(eOperation, operation, eOperationStereotype,
					"operationName"); //$NON-NLS-1$
			}
		}

		protected void convertTaggedValues(org.eclipse.uml2.Package package_,
				EPackage ePackage) {

			Stereotype ePackageStereotype = getAppliedEcoreStereotype(package_,
				"EPackage"); //$NON-NLS-1$

			if (null != ePackageStereotype) {
				setName(ePackage, package_, ePackageStereotype, "packageName"); //$NON-NLS-1$

				String nsPrefix = (String) package_.getValue(
					ePackageStereotype, "nsPrefix"); //$NON-NLS-1$

				if (isEmpty(nsPrefix)) {
					String basePackage = (String) package_.getValue(
						ePackageStereotype, "basePackage"); //$NON-NLS-1$

					if (!isEmpty(basePackage)) {
						ePackage.setNsPrefix(basePackage + '.'
							+ ePackage.getName());
					}
				} else {
					ePackage.setNsPrefix(nsPrefix);
				}

				String nsURI = (String) package_.getValue(ePackageStereotype,
					"nsURI"); //$NON-NLS-1$

				if (!isEmpty(nsURI)) {
					ePackage.setNsURI(nsURI);
				}
			}
		}

		protected void convertTaggedValues(Parameter parameter,
				EParameter eParameter) {

			Stereotype eParameterStereotype = getAppliedEcoreStereotype(
				parameter, "EParameter"); //$NON-NLS-1$

			if (null != eParameterStereotype) {
				setName(eParameter, parameter, eParameterStereotype,
					"parameterName"); //$NON-NLS-1$
			}
		}

		protected void convertTaggedValues(final Property property,
				EStructuralFeature eStructuralFeature) {

			Stereotype eStructuralFeatureStereotype = (Stereotype) new EcoreSwitch() {

				public Object caseEAttribute(EAttribute eAttribute) {
					Stereotype eAttributeStereotype = getAppliedEcoreStereotype(
						property, "EAttribute"); //$NON-NLS-1$

					if (null != eAttributeStereotype) {
						setName(eAttribute, property, eAttributeStereotype,
							"attributeName"); //$NON-NLS-1$

						eAttribute.setID(Boolean.TRUE.equals(property.getValue(
							eAttributeStereotype, "isID"))); //$NON-NLS-1$
					}

					return eAttributeStereotype;
				}

				public Object caseEReference(EReference eReference) {
					Stereotype eReferenceStereotype = getAppliedEcoreStereotype(
						property, "EReference"); //$NON-NLS-1$

					if (null != eReferenceStereotype) {
						setName(eReference, property, eReferenceStereotype,
							"referenceName"); //$NON-NLS-1$

						eReference.setResolveProxies(Boolean.TRUE
							.equals(property.getValue(eReferenceStereotype,
								"isResolveProxies"))); //$NON-NLS-1$
					}

					return eReferenceStereotype;
				}
			}.doSwitch(eStructuralFeature);

			if (null != eStructuralFeatureStereotype) {
				eStructuralFeature.setTransient(Boolean.TRUE.equals(property
					.getValue(eStructuralFeatureStereotype, "isTransient"))); //$NON-NLS-1$

				eStructuralFeature.setUnsettable(Boolean.TRUE.equals(property
					.getValue(eStructuralFeatureStereotype, "isUnsettable"))); //$NON-NLS-1$

				eStructuralFeature.setVolatile(Boolean.TRUE.equals(property
					.getValue(eStructuralFeatureStereotype, "isVolatile"))); //$NON-NLS-1$

				setXMLName(eStructuralFeature, property,
					eStructuralFeatureStereotype);

				String xmlNamespace = (String) property.getValue(
					eStructuralFeatureStereotype, "xmlNamespace"); //$NON-NLS-1$

				if (!isEmpty(xmlNamespace)) {
					ExtendedMetaData.INSTANCE.setNamespace(eStructuralFeature,
						xmlNamespace);
				}

				EnumerationLiteral xmlFeatureKind = (EnumerationLiteral) property
					.getValue(eStructuralFeatureStereotype, "xmlFeatureKind"); //$NON-NLS-1$

				int featureKind = xmlFeatureKind.getEnumeration()
					.getOwnedLiterals().indexOf(xmlFeatureKind);

				if (0 != featureKind) {
					ExtendedMetaData.INSTANCE.setFeatureKind(
						eStructuralFeature, featureKind);
				}

				try {
					EnumerationLiteral visibility = (EnumerationLiteral) property
						.getValue(eStructuralFeatureStereotype, "visibility"); //$NON-NLS-1$

					int visibilityKind = visibility.getEnumeration()
						.getOwnedLiterals().indexOf(visibility);

					switch (visibilityKind) {
						case 1 :
							EcoreUtil.setSuppressedVisibility(
								eStructuralFeature, EcoreUtil.GET, true);

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
										eStructuralFeature, EcoreUtil.UNSET,
										true);
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
										eStructuralFeature, EcoreUtil.UNSET,
										true);
								}
							}
							break;
						case 3 :
							if (eStructuralFeature.isUnsettable()) {
								EcoreUtil.setSuppressedVisibility(
									eStructuralFeature, EcoreUtil.IS_SET, true);

								if (eStructuralFeature.isChangeable()) {
									EcoreUtil.setSuppressedVisibility(
										eStructuralFeature, EcoreUtil.UNSET,
										true);
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
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseClass(org.eclipse.uml2.Class)
		 */
		public Object caseClass(org.eclipse.uml2.Class class_) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eModelElementMap.put(class_, eClass);

			EPackage ePackage = (EPackage) doSwitch(class_.getPackage());
			ePackage.getEClassifiers().add(eClass);

			setName(eClass, class_);

			eClass.setAbstract(class_.isAbstract());

			convertTaggedValues(class_, eClass);

			defaultCase(class_);

			return eClass;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseComment(org.eclipse.uml2.Comment)
		 */
		public Object caseComment(Comment comment) {

			for (Iterator annotatedElements = comment.getAnnotatedElements()
				.iterator(); annotatedElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) doSwitch((Element) annotatedElements
					.next());

				if (null != eModelElement) {
					addDocumentation(eModelElement, comment.getBody());
				}
			}

			return super.caseComment(comment);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseConstraint(org.eclipse.uml2.Constraint)
		 */
		public Object caseConstraint(Constraint constraint) {

			for (Iterator constrainedElements = constraint
				.getConstrainedElements().iterator(); constrainedElements
				.hasNext();) {

				EModelElement eModelElement = (EModelElement) doSwitch((Element) constrainedElements
					.next());

				if (null != eModelElement) {
					addConstraint(eModelElement, constraint.getName());
					addDocumentation(eModelElement, constraint
						.getSpecification().stringValue());
				}
			}

			return super.caseConstraint(constraint);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseEModelElement(org.eclipse.emf.ecore.EModelElement)
		 */
		public Object caseEModelElement(EModelElement eModelElement) {
			return eModelElement;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseEnumeration(org.eclipse.uml2.Enumeration)
		 */
		public Object caseEnumeration(Enumeration enumeration) {
			EEnum eEnum = EcoreFactory.eINSTANCE.createEEnum();
			eModelElementMap.put(enumeration, eEnum);

			EPackage ePackage = (EPackage) doSwitch(enumeration.getPackage());
			ePackage.getEClassifiers().add(eEnum);

			setName(eEnum, enumeration);

			convertTaggedValues(enumeration, eEnum);

			defaultCase(enumeration);

			return eEnum;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseEnumerationLiteral(org.eclipse.uml2.EnumerationLiteral)
		 */
		public Object caseEnumerationLiteral(
				EnumerationLiteral enumerationLiteral) {

			EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE
				.createEEnumLiteral();
			eModelElementMap.put(enumerationLiteral, eEnumLiteral);

			EEnum eEnum = (EEnum) doSwitch(enumerationLiteral.getEnumeration());
			eEnum.getELiterals().add(eEnumLiteral);

			setName(eEnumLiteral, enumerationLiteral);

			eEnumLiteral.setValue(enumerationLiteral.getEnumeration()
				.getOwnedLiterals().indexOf(enumerationLiteral));

			convertTaggedValues(enumerationLiteral, eEnumLiteral);

			defaultCase(enumerationLiteral);

			return eEnum;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseGeneralization(org.eclipse.uml2.Generalization)
		 */
		public Object caseGeneralization(Generalization generalization) {
			EClass specificEClass = (EClass) doSwitch(generalization
				.getSpecific());

			if (null != specificEClass) {
				Classifier general = generalization.getGeneral();

				if (null != general) {
					specificEClass.getESuperTypes().add(
						generalization.hasKeyword("extend") //$NON-NLS-1$
							? 0
							: specificEClass.getESuperTypes().size(),
						doSwitch(general));
				}
			}

			return super.caseGeneralization(generalization);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseImplementation(org.eclipse.uml2.Implementation)
		 */
		public Object caseImplementation(Implementation implementation) {
			EClass implementingEClass = (EClass) doSwitch(implementation
				.getImplementingClassifier());

			if (null != implementingEClass) {
				EClass contractEClass = (EClass) doSwitch(implementation
					.getContract());

				if (null != contractEClass) {
					implementingEClass.getESuperTypes().add(contractEClass);
				}
			}

			return super.caseImplementation(implementation);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseInterface(org.eclipse.uml2.Interface)
		 */
		public Object caseInterface(Interface interface_) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			eModelElementMap.put(interface_, eClass);

			EPackage ePackage = (EPackage) doSwitch(interface_.getPackage());
			ePackage.getEClassifiers().add(eClass);

			setName(eClass, interface_);

			eClass.setAbstract(true);
			eClass.setInterface(true);

			convertTaggedValues(interface_, eClass);

			defaultCase(interface_);

			return eClass;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseOperation(org.eclipse.uml2.Operation)
		 */
		public Object caseOperation(Operation operation) {
			org.eclipse.uml2.Class class_ = operation.getClass_();

			if (null == class_) {
				return super.caseOperation(operation);
			} else {
				EOperation eOperation = EcoreFactory.eINSTANCE
					.createEOperation();
				eModelElementMap.put(operation, eOperation);

				EClass eClass = (EClass) doSwitch(class_);
				eClass.getEOperations().add(eOperation);

				setName(eOperation, operation);

				Type type = operation.getType();

				if (null != type) {
					eOperation.setEType(getEType(type));
				}

				for (Iterator raisedExceptions = operation
					.getRaisedExceptions().iterator(); raisedExceptions
					.hasNext();) {

					eOperation.getEExceptions().add(
						getEType((Type) raisedExceptions.next()));
				}

				convertTaggedValues(operation, eOperation);

				defaultCase(operation);

				return eOperation;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#casePackage(org.eclipse.uml2.Package)
		 */
		public Object casePackage(org.eclipse.uml2.Package package_) {
			EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
			eModelElementMap.put(package_, ePackage);

			if (!packages.contains(package_)) {
				org.eclipse.uml2.Package nestingPackage = package_
					.getNestingPackage();

				if (null != nestingPackage) {
					((EPackage) doSwitch(nestingPackage)).getESubpackages()
						.add(ePackage);
				}
			}

			setName(ePackage, package_);

			convertTaggedValues(package_, ePackage);

			if (isEmpty(ePackage.getNsPrefix())) {
				EPackage eSuperPackage = ePackage.getESuperPackage();

				ePackage.setNsPrefix((null == eSuperPackage
					? EMPTY_STRING
					: eSuperPackage.getNsPrefix() + '.') + ePackage.getName());
			}

			if (isEmpty(ePackage.getNsURI())) {
				ePackage.setNsURI("http:///" //$NON-NLS-1$
					+ ePackage.getNsPrefix().replace('.', '/') + ".ecore"); //$NON-NLS-1$
			}

			defaultCase(package_);

			return ePackage;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseParameter(org.eclipse.uml2.Parameter)
		 */
		public Object caseParameter(Parameter parameter) {
			Operation operation = parameter.getOperation();

			if (null == operation) {
				return super.caseParameter(parameter);
			} else {
				EParameter eParameter = EcoreFactory.eINSTANCE
					.createEParameter();
				eModelElementMap.put(parameter, eParameter);

				EOperation eOperation = (EOperation) doSwitch(operation);
				eOperation.getEParameters().add(eParameter);

				setName(eParameter, parameter);

				eParameter.setEType(getEType(parameter));

				convertTaggedValues(parameter, eParameter);

				defaultCase(parameter);

				return eParameter;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#casePrimitiveType(org.eclipse.uml2.PrimitiveType)
		 */
		public Object casePrimitiveType(PrimitiveType primitiveType) {
			EDataType eDataType = EcoreFactory.eINSTANCE.createEDataType();
			eModelElementMap.put(primitiveType, eDataType);

			EPackage ePackage = (EPackage) doSwitch(primitiveType.getPackage());
			ePackage.getEClassifiers().add(eDataType);

			setName(eDataType, primitiveType);

			eDataType.setInstanceClassName(eDataType.getName());

			convertTaggedValues(primitiveType, eDataType);

			defaultCase(primitiveType);

			return eDataType;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseProperty(org.eclipse.uml2.Property)
		 */
		public Object caseProperty(Property property) {
			org.eclipse.uml2.Class class_ = property.getClass_();

			if (null == class_) {
				return super.caseProperty(property);
			} else {
				EStructuralFeature eStructuralFeature = null;

				if (DataType.class.isInstance(property.getType())) {
					eStructuralFeature = EcoreFactory.eINSTANCE
						.createEAttribute();
					eModelElementMap.put(property, eStructuralFeature);

					String default_ = property.getDefault();

					if (!isEmpty(default_)) {
						EDataType eDataType = (EDataType) getEType(property);

						try {
							eDataType.getEPackage().getEFactoryInstance()
								.createFromString(eDataType, default_);
							eStructuralFeature.setDefaultValueLiteral(default_);
						} catch (Exception e) {
							// ignore
						}
					}
				} else {
					eStructuralFeature = EcoreFactory.eINSTANCE
						.createEReference();
					eModelElementMap.put(property, eStructuralFeature);

					((EReference) eStructuralFeature).setContainment(property
						.isComposite());

					if (null != property.getOpposite()) {
						((EReference) eStructuralFeature)
							.setEOpposite((EReference) doSwitch(property
								.getOpposite()));
					}
				}

				EClass eClass = (EClass) doSwitch(class_);
				eClass.getEStructuralFeatures().add(eStructuralFeature);

				setName(eStructuralFeature, property);

				eStructuralFeature.setChangeable(!property.isReadOnly());
				eStructuralFeature.setDerived(property.isDerived());

				if (property.getUpper() != eStructuralFeature.getUpperBound()) {
					eStructuralFeature.setUpperBound(property.getUpper());
				}

				if (property.getLower() != eStructuralFeature.getLowerBound()) {
					eStructuralFeature.setLowerBound(property.getLower());
				}

				eStructuralFeature.setUnique(property.isUnique());

				eStructuralFeature.setEType(getEType(property));

				if (property.isDerivedUnion()) {
					getEAnnotation(eStructuralFeature,
						ANNOTATION_SOURCE__UNION, true);
				}

				if (!property.getSubsettedProperties().isEmpty()) {
					EAnnotation subsetsAnnotation = getEAnnotation(
						eStructuralFeature, ANNOTATION_SOURCE__SUBSETS, true);

					for (Iterator subsettedProperties = property
						.getSubsettedProperties().iterator(); subsettedProperties
						.hasNext();) {

						Property subsettedProperty = (Property) subsettedProperties
							.next();

						if (subsettedProperty.isNavigable()) {
							subsetsAnnotation.getReferences().add(
								doSwitch(subsettedProperty));
						}
					}
				}

				if (!property.getRedefinedProperties().isEmpty()) {
					EAnnotation redefinesAnnotation = getEAnnotation(
						eStructuralFeature, ANNOTATION_SOURCE__REDEFINES, true);

					for (Iterator redefinedProperties = property
						.getRedefinedProperties().iterator(); redefinedProperties
						.hasNext();) {

						Property redefinedProperty = (Property) redefinedProperties
							.next();

						if (redefinedProperty.isNavigable()) {
							redefinesAnnotation.getReferences().add(
								doSwitch(redefinedProperty));
						}
					}
				}

				convertTaggedValues(property, eStructuralFeature);

				defaultCase(property);

				return eStructuralFeature;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		public Object defaultCase(EObject eObject) {

			for (Iterator eContents = eObject.eContents().iterator(); eContents
				.hasNext();) {

				doSwitch((EObject) eContents.next());
			}

			return super.defaultCase(eObject);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public Object doSwitch(EObject eObject) {
			Object eModelElement = eModelElementMap.get(eObject);

			return null == eModelElement
				? super.doSwitch(eObject)
				: eModelElement;
		}

		protected void processOptions(org.eclipse.uml2.Package package_,
				final Map options, final DiagnosticChain diagnostics,
				final Map context) {

			new UML2Switch() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.uml2.util.UML2Switch#defaultCase(org.eclipse.emf.ecore.EObject)
				 */
				public Object defaultCase(EObject eObject) {

					for (Iterator eContents = eObject.eContents().iterator(); eContents
						.hasNext();) {

						doSwitch((EObject) eContents.next());
					}

					return super.defaultCase(eObject);
				}
			}.doSwitch(package_);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Util.Converter#convert(java.util.Collection)
		 */
		public Collection convert(Collection eObjects, Map options,
				DiagnosticChain diagnostics, Map context) {

			packages = EcoreUtil.getObjectsByType(eObjects,
				UML2Package.eINSTANCE.getPackage());

			for (Iterator i = packages.iterator(); i.hasNext();) {
				org.eclipse.uml2.Package package_ = (org.eclipse.uml2.Package) i
					.next();

				doSwitch(package_);

				if (null != options) {
					processOptions(package_, options, diagnostics, context);
				}
			}

			return getRootContainers(EcoreUtil
				.getObjectsByType(eModelElementMap.values(),
					EcorePackage.eINSTANCE.getEPackage()));
		}

	}

	protected static interface EObjectMatcher {

		public boolean matches(EObject eObject);

	}

	public static class PackageMerger
			extends EcoreUtil.Copier {

		protected class EClassMatcher
				implements EObjectMatcher {

			protected final EObject eObject;

			protected EClassMatcher(EObject eObject) {
				super();

				this.eObject = eObject;
			}

			public boolean matches(EObject otherEObject) {

				return null == eObject || null == otherEObject
					? null == eObject && null == otherEObject
					: eObject.eClass() == otherEObject.eClass();
			}
		}

		protected class BodyMatcher
				extends EClassMatcher {

			protected BodyMatcher(Comment comment) {
				super(comment);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((null == eObject && null == otherEObject) || ((Comment) eObject)
						.getBody().equals(((Comment) otherEObject).getBody()));
			}
		}

		protected class NameMatcher
				extends EClassMatcher {

			protected NameMatcher(NamedElement namedElement) {
				super(namedElement);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((null == eObject && null == otherEObject) || ((NamedElement) eObject)
						.getName().equals(
							((NamedElement) otherEObject).getName()));
			}
		}

		protected class KeyMatcher
				extends EClassMatcher {

			protected KeyMatcher(BasicEMap.Entry entry) {
				super((EObject) entry);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((null == eObject && null == otherEObject) || ((BasicEMap.Entry) eObject)
						.getKey().equals(
							((BasicEMap.Entry) otherEObject).getKey()));
			}
		}

		protected class ResultingQNameMatcher
				extends EClassMatcher {

			protected ResultingQNameMatcher(EObject eObject) {
				super(eObject);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((null == eObject && null == otherEObject) || getResultingQName(
						eObject).equals(getResultingQName(otherEObject)));
			}
		}

		protected class StringValueMatcher
				extends EClassMatcher {

			protected StringValueMatcher(ValueSpecification valueSpecification) {
				super(valueSpecification);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((null == eObject && null == otherEObject) || ((ValueSpecification) eObject)
						.stringValue().equals(
							((ValueSpecification) otherEObject).stringValue()));
			}
		}

		protected class SourceMatcher
				extends EClassMatcher {

			protected SourceMatcher(EAnnotation eAnnotation) {
				super(eAnnotation);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((null == eObject && null == otherEObject) || ((EAnnotation) eObject)
						.getSource().equals(
							((EAnnotation) otherEObject).getSource()));
			}
		}

		protected class TypeMatcher
				extends NameMatcher {

			protected TypeMatcher(TypedElement typedElement) {
				super(typedElement);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((null == eObject && null == otherEObject) || new ResultingQNameMatcher(
						((TypedElement) eObject).getType())
						.matches(((TypedElement) otherEObject).getType()));
			}
		}

		public static final String OPTION__DIFFERENT_PROPERTY_STATICITY = "DIFFERENT_PROPERTY_STATICITY"; //$NON-NLS-1$

		public static final String OPTION__DIFFERENT_PROPERTY_UNIQUENESS = "DIFFERENT_PROPERTY_UNIQUENESS"; //$NON-NLS-1$

		public static final String OPTION__REDUNDANT_GENERALIZATION = "REDUNDANT_GENERALIZATION"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 1000;

		public static final int DIFFERENT_PROPERTY_STATICITY = DIAGNOSTIC_CODE_OFFSET + 1;

		public static final int DIFFERENT_PROPERTY_UNIQUENESS = DIAGNOSTIC_CODE_OFFSET + 2;

		public static final int REDUNDANT_GENERALIZATION = DIAGNOSTIC_CODE_OFFSET + 3;

		protected org.eclipse.uml2.Package receivingPackage = null;

		protected Set mergedPackages = null;

		protected final Map resultingToMergedEObjectMap = new HashMap();

		protected List getMatchCandidates(EObject eObject) {
			EStructuralFeature eContainingFeature = eObject
				.eContainingFeature();

			return eContainingFeature.isMany()
				? (List) ((EObject) get(eObject.eContainer()))
					.eGet(eContainingFeature)
				: Collections
					.singletonList(((EObject) get(eObject.eContainer()))
						.eGet(eContainingFeature));
		}

		protected EObject getPreviouslyMergedEObject(EObject eObject) {
			List mergedEObjects = (List) resultingToMergedEObjectMap
				.get(eObject);

			return null == mergedEObjects
				? eObject
				: (EObject) mergedEObjects.get(0);
		}

		protected String getResultingQName(EObject eObject) {
			StringBuffer resultingQName = appendResultingQName(
				new StringBuffer(), eObject, new QualifiedTextProvider());

			return resultingQName.toString();
		}

		private StringBuffer appendResultingQName(StringBuffer resultingQName,
				EObject eObject, QualifiedTextProvider qualifiedTextProvider) {

			eObject = mergedPackages.contains(eObject)
				? receivingPackage
				: eObject;

			EObject eContainer = eObject.eContainer();

			if (null != eContainer) {
				appendResultingQName(resultingQName, eContainer,
					qualifiedTextProvider);

				if (0 < resultingQName.length()) {
					resultingQName.append(qualifiedTextProvider.getSeparator());
				}
			}

			return appendQualifiedTextSegment(resultingQName, eObject,
				qualifiedTextProvider);
		}

		protected void mergeAssociation_IsDerived(
				Association receivingAssociation, Association mergedAssociation) {

			receivingAssociation.setIsDerived(receivingAssociation.isDerived()
				|| mergedAssociation.isDerived());
		}

		protected void mergeClassifier_IsAbstract(
				Classifier receivingClassifier, Classifier mergedClassifier) {

			receivingClassifier.setIsAbstract(receivingClassifier.isAbstract()
				&& mergedClassifier.isAbstract());
		}

		protected void mergeLiteralInteger_Value(
				LiteralInteger receivingLiteralInteger,
				LiteralInteger mergedLiteralInteger) {

			receivingLiteralInteger.setValue(Math.min(receivingLiteralInteger
				.getValue(), mergedLiteralInteger.getValue()));
		}

		protected void mergeLiteralUnlimitedNatural_Value(
				LiteralUnlimitedNatural receivingLiteralUnlimitedNatural,
				LiteralUnlimitedNatural mergedLiteralUnlimitedNatural) {

			receivingLiteralUnlimitedNatural
				.setValue(MultiplicityElement.UNLIMITED_UPPER_BOUND == receivingLiteralUnlimitedNatural
					.getValue()
					|| MultiplicityElement.UNLIMITED_UPPER_BOUND == mergedLiteralUnlimitedNatural
						.getValue()
					? MultiplicityElement.UNLIMITED_UPPER_BOUND
					: Math.max(receivingLiteralUnlimitedNatural.getValue(),
						mergedLiteralUnlimitedNatural.getValue()));
		}

		protected void mergeMultiplicityElement_IsOrdered(
				MultiplicityElement receivingMultiplicityElement,
				MultiplicityElement mergedMultiplicityElement) {

			receivingMultiplicityElement
				.setIsOrdered(receivingMultiplicityElement.isOrdered()
					|| mergedMultiplicityElement.isOrdered());
		}

		protected void mergeMultiplicityElement_IsUnique(
				MultiplicityElement receivingMultiplicityElement,
				MultiplicityElement mergedMultiplicityElement) {

			receivingMultiplicityElement
				.setIsUnique(receivingMultiplicityElement.isUnique()
					&& mergedMultiplicityElement.isUnique());
		}

		protected void mergeNamedElement_Visibility(
				NamedElement receivingNamedElement,
				NamedElement mergedNamedElement) {

			receivingNamedElement
				.setVisibility(VisibilityKind.PRIVATE_LITERAL == receivingNamedElement
					.getVisibility()
					&& VisibilityKind.PRIVATE_LITERAL == mergedNamedElement
						.getVisibility()
					? VisibilityKind.PRIVATE_LITERAL
					: VisibilityKind.PUBLIC_LITERAL);
		}

		protected void mergePackageableElement_PackageableElement_visibility(
				PackageableElement receivingPackageableElement,
				PackageableElement mergedPackageableElement) {

			receivingPackageableElement
				.setPackageableElement_visibility(VisibilityKind.PRIVATE_LITERAL == receivingPackageableElement
					.getPackageableElement_visibility()
					&& VisibilityKind.PRIVATE_LITERAL == mergedPackageableElement
						.getPackageableElement_visibility()
					? VisibilityKind.PRIVATE_LITERAL
					: VisibilityKind.PUBLIC_LITERAL);
		}

		protected void mergeProperty_IsDerived(Property receivingProperty,
				Property mergedProperty) {

			receivingProperty.setIsDerived(receivingProperty.isDerived()
				|| mergedProperty.isDerived());
		}

		protected void mergeProperty_IsDerivedUnion(Property receivingProperty,
				Property mergedProperty) {

			receivingProperty.setIsDerivedUnion(receivingProperty
				.isDerivedUnion()
				|| mergedProperty.isDerivedUnion());
		}

		protected void mergeStructuralFeature_IsReadOnly(
				StructuralFeature receivingStructuralFeature,
				StructuralFeature mergedStructuralFeature) {

			receivingStructuralFeature.setIsReadOnly(receivingStructuralFeature
				.isReadOnly()
				&& mergedStructuralFeature.isReadOnly());
		}

		protected void copyAttribute(EAttribute eAttribute, EObject eObject,
				EObject copyEObject) {

			if (receivingPackage == copyEObject) {
				return;
			} else if (resultingToMergedEObjectMap.containsKey(copyEObject)) {

				if (UML2Package.eINSTANCE.getAssociation_IsDerived() == eAttribute) {
					mergeAssociation_IsDerived((Association) copyEObject,
						(Association) eObject);
				} else if (UML2Package.eINSTANCE.getClassifier_IsAbstract() == eAttribute) {
					mergeClassifier_IsAbstract((Classifier) copyEObject,
						(Classifier) eObject);
				} else if (UML2Package.eINSTANCE.getLiteralInteger_Value() == eAttribute
					&& UML2Package.eINSTANCE
						.getMultiplicityElement_LowerValue() == copyEObject
						.eContainingFeature()) {

					mergeLiteralInteger_Value((LiteralInteger) copyEObject,
						(LiteralInteger) eObject);
				} else if (UML2Package.eINSTANCE
					.getLiteralUnlimitedNatural_Value() == eAttribute
					&& UML2Package.eINSTANCE
						.getMultiplicityElement_UpperValue() == copyEObject
						.eContainingFeature()) {

					mergeLiteralUnlimitedNatural_Value(
						(LiteralUnlimitedNatural) copyEObject,
						(LiteralUnlimitedNatural) eObject);
				} else if (UML2Package.eINSTANCE
					.getMultiplicityElement_IsOrdered() == eAttribute) {

					mergeMultiplicityElement_IsOrdered(
						(MultiplicityElement) copyEObject,
						(MultiplicityElement) eObject);
				} else if (UML2Package.eINSTANCE
					.getMultiplicityElement_IsUnique() == eAttribute) {

					mergeMultiplicityElement_IsUnique(
						(MultiplicityElement) copyEObject,
						(MultiplicityElement) eObject);
				} else if (UML2Package.eINSTANCE.getNamedElement_Visibility() == eAttribute) {
					mergeNamedElement_Visibility((NamedElement) copyEObject,
						(NamedElement) eObject);
				} else if (UML2Package.eINSTANCE
					.getPackageableElement_PackageableElement_visibility() == eAttribute) {

					mergePackageableElement_PackageableElement_visibility(
						(PackageableElement) copyEObject,
						(PackageableElement) eObject);
				} else if (UML2Package.eINSTANCE.getProperty_IsDerived() == eAttribute) {
					mergeProperty_IsDerived((Property) copyEObject,
						(Property) eObject);
				} else if (UML2Package.eINSTANCE.getProperty_IsDerivedUnion() == eAttribute) {
					mergeProperty_IsDerivedUnion((Property) copyEObject,
						(Property) eObject);
				} else if (UML2Package.eINSTANCE
					.getStructuralFeature_IsReadOnly() == eAttribute) {

					mergeStructuralFeature_IsReadOnly(
						(StructuralFeature) copyEObject,
						(StructuralFeature) eObject);
				} else {
					super.copyAttribute(eAttribute, eObject, copyEObject);
				}
			} else {
				super.copyAttribute(eAttribute, eObject, copyEObject);
			}
		}

		protected void copyContainment(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject.eIsSet(eReference) && eReference.isMany()) {
				List targetList = (List) copyEObject
					.eGet(getTarget(eReference));

				for (Iterator i = ((List) eObject.eGet(eReference)).iterator(); i
					.hasNext();) {

					targetList.add(copy((EObject) i.next()));
				}
			} else {
				super.copyContainment(eReference, eObject, copyEObject);
			}
		}

		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject.eIsSet(eReference) && eReference.isMany()) {
				InternalEList targetList = (InternalEList) copyEObject
					.eGet(getTarget(eReference));

				boolean isBidirectional = eReference.getEOpposite() != null;
				int index = 0;

				for (Iterator i = ((List) eObject.eGet(eReference)).iterator(); i
					.hasNext();) {

					Object referencedEObject = i.next();
					Object copyReferencedEObject = get(referencedEObject);

					if (copyReferencedEObject == null) {

						if (!isBidirectional
							&& !targetList.contains(referencedEObject)) {

							targetList.add(index++, referencedEObject);
						}
					} else {

						if (isBidirectional) {
							int position = targetList
								.indexOf(copyReferencedEObject);

							if (position == -1) {
								targetList.addUnique(index++,
									copyReferencedEObject);
							} else if (index != position) {
								targetList.move(index++, copyReferencedEObject);
							}
						} else if (!targetList.contains(copyReferencedEObject)) {
							targetList.add(index++, copyReferencedEObject);
						}
					}
				}
			} else {
				super.copyReference(eReference, eObject, copyEObject);
			}
		}

		protected EObject createCopy(EObject eObject) {
			return (EObject) new UML2Switch() {

				public Object caseAssociation(Association association) {
					Association matchingAssociation = (Association) findEObject(
						getMatchCandidates(association), new NameMatcher(
							association) {

							public boolean matches(EObject otherEObject) {

								if (super.matches(otherEObject)) {
									otherEObject = getPreviouslyMergedEObject(otherEObject);

									List memberEnds = ((Association) eObject)
										.getMemberEnds();
									List otherMemberEnds = ((Association) otherEObject)
										.getMemberEnds();

									if (memberEnds.size() == otherMemberEnds
										.size()) {

										for (Iterator i = memberEnds.iterator(); i
											.hasNext();) {

											if (null == findEObject(
												otherMemberEnds,
												new TypeMatcher(
													(TypedElement) i.next()))) {

												return false;
											}
										}

										return true;
									}

								}

								return false;
							}
						});

					return null == matchingAssociation
						? super.caseAssociation(association)
						: matchingAssociation;
				}

				public Object caseClass(org.eclipse.uml2.Class class_) {
					org.eclipse.uml2.Class matchingClass = (org.eclipse.uml2.Class) findEObject(
						getMatchCandidates(class_), new NameMatcher(class_));

					return null == matchingClass
						? super.caseClass(class_)
						: matchingClass;
				}

				public Object caseComment(Comment comment) {
					Comment matchingComment = (Comment) findEObject(
						getMatchCandidates(comment), new BodyMatcher(comment));

					return null == matchingComment
						? super.caseComment(comment)
						: matchingComment;
				}

				public Object caseConstraint(Constraint constraint) {
					Constraint matchingConstraint = (Constraint) findEObject(
						getMatchCandidates(constraint), new NameMatcher(
							constraint) {

							public boolean matches(EObject otherEObject) {

								return super.matches(otherEObject)
									&& new StringValueMatcher(
										((Constraint) eObject)
											.getSpecification())
										.matches(((Constraint) otherEObject)
											.getSpecification());
							}
						});

					return null == matchingConstraint
						? super.caseConstraint(constraint)
						: matchingConstraint;
				}

				public Object caseDataType(DataType dataType) {
					DataType matchingDataType = (DataType) findEObject(
						getMatchCandidates(dataType), new NameMatcher(dataType));

					return null == matchingDataType
						? super.caseDataType(dataType)
						: matchingDataType;
				}

				public Object caseDirectedRelationship(
						DirectedRelationship directedRelationship) {
					DirectedRelationship matchingDirectedRelationship = (DirectedRelationship) findEObject(
						getMatchCandidates(directedRelationship),
						new EClassMatcher(directedRelationship) {

							public boolean matches(EObject otherEObject) {

								if (super.matches(otherEObject)) {
									otherEObject = getPreviouslyMergedEObject(otherEObject);

									List targets = ((DirectedRelationship) eObject)
										.getTargets();
									List otherTargets = ((DirectedRelationship) otherEObject)
										.getTargets();

									if (targets.size() == otherTargets.size()) {

										for (Iterator i = targets.iterator(); i
											.hasNext();) {

											if (null == findEObject(
												otherTargets,
												new ResultingQNameMatcher(
													(EObject) i.next()))) {

												return false;
											}
										}

										return true;
									}
								}

								return false;
							}
						});

					return null == matchingDirectedRelationship
						? super.caseDirectedRelationship(directedRelationship)
						: matchingDirectedRelationship;
				}

				public Object caseEnumerationLiteral(
						EnumerationLiteral enumerationLiteral) {
					EnumerationLiteral matchingEnumerationLiteral = (EnumerationLiteral) findEObject(
						getMatchCandidates(enumerationLiteral),
						new NameMatcher(enumerationLiteral));

					return null == matchingEnumerationLiteral
						? super.caseEnumerationLiteral(enumerationLiteral)
						: matchingEnumerationLiteral;
				}

				public Object caseOperation(Operation operation) {
					Operation matchingOperation = (Operation) findEObject(
						getMatchCandidates(operation), new NameMatcher(
							operation) {

							public boolean matches(EObject otherEObject) {

								if (super.matches(otherEObject)) {
									otherEObject = getPreviouslyMergedEObject(otherEObject);

									List ownedParameters = ((Operation) eObject)
										.getOwnedParameters();
									List otherOwnedParameters = ((Operation) otherEObject)
										.getOwnedParameters();

									if (ownedParameters.size() == otherOwnedParameters
										.size()) {

										for (int i = 0; i < ownedParameters
											.size(); i++) {

											if (!new TypeMatcher(
												(TypedElement) ownedParameters
													.get(i))
												.matches((EObject) otherOwnedParameters
													.get(i))) {

												return false;
											}
										}

										return true;
									}
								}

								return false;
							}
						});

					return null == matchingOperation
						? super.caseOperation(operation)
						: matchingOperation;
				}

				public Object casePackage(org.eclipse.uml2.Package package_) {
					org.eclipse.uml2.Package matchingPackage = null;

					if (mergedPackages.contains(package_)) {
						matchingPackage = receivingPackage;
					} else {
						matchingPackage = (org.eclipse.uml2.Package) findEObject(
							getMatchCandidates(package_), new NameMatcher(
								package_));
					}

					return null == matchingPackage
						? super.casePackage(package_)
						: matchingPackage;
				}

				public Object caseParameter(Parameter parameter) {
					Parameter matchingParameter = (Parameter) findEObject(
						getMatchCandidates(parameter), new NameMatcher(
							parameter));

					return null == matchingParameter
						? super.caseParameter(parameter)
						: matchingParameter;
				}

				public Object caseProperty(Property property) {
					Property matchingProperty = (Property) findEObject(
						getMatchCandidates(property), new NameMatcher(property));

					return null == matchingProperty
						? super.caseProperty(property)
						: matchingProperty;
				}

				public Object defaultCase(EObject eObject) {
					return PackageMerger.super.createCopy(eObject);
				}

				protected Object doSwitch(EClass theEClass, EObject theEObject) {

					if (EcorePackage.eINSTANCE.getEAnnotation() == theEClass) {
						EAnnotation matchingEAnnotation = (EAnnotation) findEObject(
							getMatchCandidates(theEObject), new SourceMatcher(
								(EAnnotation) theEObject));

						if (null != matchingEAnnotation) {
							return matchingEAnnotation;
						}
					} else if (EcorePackage.eINSTANCE
						.getEStringToStringMapEntry() == theEClass) {

						BasicEMap.Entry matchingEntry = (BasicEMap.Entry) findEObject(
							getMatchCandidates(theEObject), new KeyMatcher(
								(BasicEMap.Entry) theEObject));

						if (null != matchingEntry) {
							return matchingEntry;
						}
					}

					return super.doSwitch(theEClass, theEObject);
				}
			}.doSwitch(eObject);
		}

		public EObject copy(EObject eObject) {
			EObject copyEObject = super.copy(eObject);

			List mergedEObjects = (List) resultingToMergedEObjectMap
				.get(copyEObject);

			if (null == mergedEObjects) {
				resultingToMergedEObjectMap.put(copyEObject,
					mergedEObjects = new ArrayList(1));
			}

			mergedEObjects.add(eObject);

			return copyEObject;
		}

		protected Set getAllMergedPackages(org.eclipse.uml2.Package package_) {
			Set allMergedPackages = new HashSet();

			getAllMergedPackagesHelper(package_, allMergedPackages);

			return allMergedPackages;
		}

		protected void getAllMergedPackagesHelper(
				org.eclipse.uml2.Package package_, Set allMergedPackages) {

			for (Iterator packageMerges = package_.getPackageMerges()
				.iterator(); packageMerges.hasNext();) {

				org.eclipse.uml2.Package mergedPackage = ((PackageMerge) packageMerges
					.next()).getMergedPackage();

				if (null != mergedPackage) {
					getAllMergedPackagesHelper(mergedPackage, allMergedPackages);

					allMergedPackages.add(mergedPackage);
				}
			}
		}

		protected void processOptions(org.eclipse.uml2.Package package_,
				final Map options, final DiagnosticChain diagnostics,
				final Map context) {

			new UML2Switch() {

				public Object caseClassifier(Classifier classifier) {

					if (OPTION__IGNORE != options
						.get(OPTION__REDUNDANT_GENERALIZATION)) {

						for (Iterator generalizations = new ArrayList(
							classifier.getGeneralizations()).iterator(); generalizations
							.hasNext();) {

							Classifier general = ((Generalization) generalizations
								.next()).getGeneral();

							for (Iterator otherGeneralizations = classifier
								.getGeneralizations().iterator(); otherGeneralizations
								.hasNext();) {

								Classifier otherGeneral = ((Generalization) otherGeneralizations
									.next()).getGeneral();

								if (general != null
									&& general != otherGeneral
									&& general.allParents().contains(
										otherGeneral)) {

									if (OPTION__DISCARD == options
										.get(OPTION__REDUNDANT_GENERALIZATION)) {

										if (null != diagnostics) {
											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.INFO,
													UML2Validator.DIAGNOSTIC_SOURCE,
													REDUNDANT_GENERALIZATION,
													UML2Plugin.INSTANCE
														.getString(
															"_UI_PackageMerger_DiscardRedundantGeneralization_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																classifier,
																otherGeneral)),
													new Object[]{classifier,
														otherGeneral}));
										}

										otherGeneralizations.remove();
									} else if (OPTION__REPORT == options
										.get(OPTION__REDUNDANT_GENERALIZATION)
										&& null != diagnostics) {

										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.WARNING,
												UML2Validator.DIAGNOSTIC_SOURCE,
												REDUNDANT_GENERALIZATION,
												UML2Plugin.INSTANCE
													.getString(
														"_UI_PackageMerger_ReportRedundantGeneralization_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															classifier,
															general,
															otherGeneral)),
												new Object[]{classifier,
													general, otherGeneral}));
									}

									break;
								}
							}
						}
					}

					return classifier;
				}

				public Object caseProperty(Property property) {

					if (OPTION__IGNORE != options
						.get(OPTION__DIFFERENT_PROPERTY_STATICITY)
						&& OPTION__IGNORE != options
							.get(OPTION__DIFFERENT_PROPERTY_UNIQUENESS)) {
					}

					if (resultingToMergedEObjectMap.containsKey(property)) {

						for (Iterator mergedProperties = ((List) resultingToMergedEObjectMap
							.get(property)).iterator(); mergedProperties
							.hasNext();) {
							Property mergedProperty = (Property) mergedProperties
								.next();

							if (OPTION__REPORT == options
								.get(OPTION__DIFFERENT_PROPERTY_STATICITY)
								&& null != diagnostics) {

								if (property.isStatic() != mergedProperty
									.isStatic()) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.ERROR,
											UML2Validator.DIAGNOSTIC_SOURCE,
											DIFFERENT_PROPERTY_STATICITY,
											UML2Plugin.INSTANCE
												.getString(
													"_UI_PackageMerger_ReportDifferentPropertyStaticity_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, property,
														mergedProperty)),
											new Object[]{property,
												mergedProperty}));
								}
							}

							if (OPTION__REPORT == options
								.get(OPTION__DIFFERENT_PROPERTY_UNIQUENESS)
								&& null != diagnostics) {

								if (property.isUnique() != mergedProperty
									.isUnique()) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.ERROR,
											UML2Validator.DIAGNOSTIC_SOURCE,
											DIFFERENT_PROPERTY_UNIQUENESS,
											UML2Plugin.INSTANCE
												.getString(
													"_UI_PackageMerger_ReportDifferentPropertyUniqueness_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, property,
														mergedProperty)),
											new Object[]{property,
												mergedProperty}));
								}
							}
						}
					}

					return property;
				}

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.uml2.util.UML2Switch#defaultCase(org.eclipse.emf.ecore.EObject)
				 */
				public Object defaultCase(EObject eObject) {

					for (Iterator eContents = eObject.eContents().iterator(); eContents
						.hasNext();) {

						doSwitch((EObject) eContents.next());
					}

					return super.defaultCase(eObject);
				}
			}.doSwitch(package_);
		}

		public void merge(org.eclipse.uml2.Package package_, Map options,
				DiagnosticChain diagnostics, Map context) {
			receivingPackage = package_;

			mergedPackages = getAllMergedPackages(package_);

			copyAll(mergedPackages);
			copyReferences();

			receivingPackage.getPackageMerges().clear();

			if (null != options) {
				processOptions(package_, options, diagnostics, context);
			}
		}
	}

	protected static boolean DEBUG = false;

	protected static final String EMPTY_STRING = ""; //$NON-NLS-1$

	protected static final String LINE_SEPARATOR = System.getProperties()
		.getProperty("line.separator"); //$NON-NLS-1$

	public static final String OPTION__DISCARD = "DISCARD"; //$NON-NLS-1$

	public static final String OPTION__IGNORE = "IGNORE"; //$NON-NLS-1$

	public static final String OPTION__PROCESS = "PROCESS"; //$NON-NLS-1$

	public static final String OPTION__REPORT = "REPORT"; //$NON-NLS-1$

	protected static boolean isEmpty(String string) {
		return null == string || 0 == string.length();
	}

	protected static EObject findEObject(Collection eObjects,
			EObjectMatcher filter) {

		for (Iterator i = eObjects.iterator(); i.hasNext();) {
			EObject eObject = (EObject) i.next();

			if (filter.matches(eObject)) {
				return eObject;
			}
		}

		return null;
	}

	protected static Object getTaggedValue(Element element,
			String qualifiedStereotypeName, String propertyName) {

		Stereotype stereotype = element
			.getAppliedStereotype(qualifiedStereotypeName);

		return null == stereotype
			? null
			: element.getValue(stereotype, propertyName);
	}

	protected static void setTaggedValue(Element element,
			Stereotype stereotype, String propertyName, Object value) {

		if (!element.isApplied(stereotype)) {
			Profile profile = stereotype.getProfile();

			if (!element.getNearestPackage().getAllAppliedProfiles().contains(
				profile)) {

				element.getModel().apply(profile);
			}

			element.apply(stereotype);
		}

		element.setValue(stereotype, propertyName, value);
	}

	protected static String getQualifiedText(EObject eObject) {
		return getQualifiedText(eObject, new QualifiedTextProvider());
	}

	protected static String getQualifiedText(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider) {

		return appendQualifiedText(new StringBuffer(), eObject,
			qualifiedTextProvider).toString();
	}

	protected static StringBuffer appendQualifiedText(
			StringBuffer qualifiedText, EObject eObject,
			QualifiedTextProvider qualifiedTextProvider) {

		EObject eContainer = eObject.eContainer();

		if (null != eContainer) {
			appendQualifiedText(qualifiedText, eContainer,
				qualifiedTextProvider);

			if (0 < qualifiedText.length()) {
				qualifiedText.append(qualifiedTextProvider.getSeparator());
			}
		}

		return appendQualifiedTextSegment(qualifiedText, eObject,
			qualifiedTextProvider);
	}

	protected static StringBuffer appendQualifiedTextSegment(
			StringBuffer qualifiedText, EObject eObject,
			QualifiedTextProvider qualifiedTextProvider) {

		String text = qualifiedTextProvider.getText(eObject);

		if (!isEmpty(text)) {
			return qualifiedText.append(text);
		}

		qualifiedText.append('{');

		EStructuralFeature eContainingFeature = eObject.eContainingFeature();

		if (null != eContainingFeature) {
			qualifiedText.append(qualifiedTextProvider
				.getFeatureText(eContainingFeature));

			if (eContainingFeature.isMany()) {
				qualifiedText.append(' ');

				List list = (List) eObject.eContainer().eGet(
					eContainingFeature, false);

				qualifiedText.append('[');
				qualifiedText.append(list.indexOf(eObject));
				qualifiedText.append(']');
			}

			qualifiedText.append(' ');
		}

		qualifiedText.append(qualifiedTextProvider.getClassText(eObject));
		qualifiedText.append('}');

		return qualifiedText;
	}

	protected static NamedElement findNamedElement(ResourceSet resourceSet,
			String qualifiedName) {

		String[] names = qualifiedName.split(NamedElement.SEPARATOR);

		for (Iterator resources = resourceSet.getResources().iterator(); resources
			.hasNext();) {

			Namespace namespace = (Namespace) EcoreUtil.getObjectByType(
				((Resource) resources.next()).getContents(),
				UML2Package.eINSTANCE.getNamespace());

			if (null != namespace) {
				int index = 0;
				NamedElement namedElement = namespace.getName().equals(
					names[index++])
					? namespace
					: null;

				while (index < names.length
					&& namedElement instanceof Namespace) {

					namedElement = ((Namespace) namedElement)
						.getMember(names[index++]);
				}

				if (null != namedElement && index == names.length) {
					return namedElement;
				}
			}
		}

		return null;
	}

	protected static EAnnotation createEAnnotation(EModelElement eModelElement,
			String source) {

		if (Element.class.isInstance(eModelElement)) {
			return ((Element) eModelElement).createEAnnotation(source);
		} else {
			EAnnotation eAnnotation = EcoreFactory.eINSTANCE
				.createEAnnotation();

			eAnnotation.setSource(source);
			eAnnotation.setEModelElement(eModelElement);

			return eAnnotation;
		}
	}

	protected static EAnnotation getEAnnotation(EModelElement eModelElement,
			String source, boolean createOnDemand) {

		EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

		return null == eAnnotation && createOnDemand
			? createEAnnotation(eModelElement, source)
			: eAnnotation;
	}

	protected static void addConstraint(EModelElement eModelElement,
			String constraint) {

		if (!isEmpty(constraint)) {
			List constraints = new ArrayList(EcoreUtil
				.getConstraints(eModelElement));

			constraints.add(constraint);

			EcoreUtil.setConstraints(eModelElement, constraints);
		}
	}

	protected static void addDocumentation(EModelElement eModelElement,
			String text) {

		if (!isEmpty(text)) {
			String documentation = EcoreUtil.getDocumentation(eModelElement);

			EcoreUtil.setDocumentation(eModelElement, null == documentation
				? text
				: documentation + LINE_SEPARATOR + text);
		}
	}

	protected static String getMessageSubstitution(Map context, Object object) {

		if (EObject.class.isInstance(object)) {
			EObject eObject = (EObject) object;

			if (NamedElement.class.isInstance(object)) {
				String qualifiedName = ((NamedElement) object)
					.getQualifiedName();

				if (!isEmpty(qualifiedName)) {
					return qualifiedName;
				}
			}

			if (null != context) {

				EValidator.SubstitutionLabelProvider substitutionLabelProvider = (EValidator.SubstitutionLabelProvider) context
					.get(EValidator.SubstitutionLabelProvider.class);

				if (null != substitutionLabelProvider) {
					return substitutionLabelProvider.getObjectLabel(eObject);
				}

				return getQualifiedText(eObject,
					(QualifiedTextProvider) context
						.get(QualifiedTextProvider.class));
			}

			Resource resource = eObject.eResource();

			if (null != resource) {
				return resource.getURI().lastSegment() + '#'
					+ resource.getURIFragment(eObject);
			}

			return EcoreUtil.getIdentification((EObject) object);
		} else {
			return String.valueOf(object);
		}
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0) {
		return new Object[]{getMessageSubstitution(context, object0)};
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0, Object object1) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1)};
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0, Object object1, Object object2) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1),
			getMessageSubstitution(context, object2)};
	}

	protected static Collection getRootContainers(Collection eObjects) {
		Set rootContainers = new HashSet();

		for (Iterator i = eObjects.iterator(); i.hasNext();) {
			rootContainers.add(EcoreUtil.getRootContainer((EObject) i.next()));
		}

		return rootContainers;
	}

	protected static org.eclipse.uml2.Package load(ResourceSet resourceSet,
			URI uri) {
		org.eclipse.uml2.Package package_ = null;

		try {
			package_ = (org.eclipse.uml2.Package) EcoreUtil.getObjectByType(
				resourceSet.getResource(uri, true).getContents(),
				UML2Package.eINSTANCE.getPackage());
		} catch (WrappedException we) {
			// do nothing
		}

		return package_;
	}

	protected static Collection convertFromEcore(EPackage ePackage, Map options) {

		if (null == options) {
			options = new HashMap();
		}

		return convertFromEcore(ePackage, options, null, null);
	}

	protected static Collection convertFromEcore(EPackage ePackage,
			Map options, DiagnosticChain diagnostics, Map context) {

		if (null == options) {
			options = new HashMap();
		}

		return (Collection) new Ecore2UML2Converter().convert(Collections
			.singleton(ePackage), options, diagnostics, context);
	}

	public static Collection convertToEcore(org.eclipse.uml2.Package package_,
			Map options) {

		if (null == options) {
			options = new HashMap();
		}

		return convertToEcore(package_, options, null, null);
	}

	public static Collection convertToEcore(org.eclipse.uml2.Package package_,
			Map options, DiagnosticChain diagnostics, Map context) {

		if (null == options) {
			options = new HashMap();
		}

		return (Collection) new UML22EcoreConverter().convert(Collections
			.singleton(package_), options, diagnostics, context);
	}

	public static void merge(org.eclipse.uml2.Package package_, Map options) {

		if (null == options) {
			options = new HashMap();
		}

		if (!options
			.containsKey(PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY)) {

			options.put(PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS)) {

			options.put(PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__REDUNDANT_GENERALIZATION)) {

			options.put(PackageMerger.OPTION__REDUNDANT_GENERALIZATION,
				OPTION__IGNORE);
		}

		merge(package_, options, null, null);
	}

	public static void merge(org.eclipse.uml2.Package package_, Map options,
			DiagnosticChain diagnostics, Map context) {

		if (null == options) {
			options = new HashMap();
		}

		if (!options
			.containsKey(PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY)) {

			options.put(PackageMerger.OPTION__DIFFERENT_PROPERTY_STATICITY,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS)) {

			options.put(PackageMerger.OPTION__DIFFERENT_PROPERTY_UNIQUENESS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__REDUNDANT_GENERALIZATION)) {

			options.put(PackageMerger.OPTION__REDUNDANT_GENERALIZATION,
				OPTION__REPORT);
		}

		new PackageMerger().merge(package_, options, diagnostics, context);
	}
}