/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLUtil.java,v 1.1 2005/12/14 22:34:17 khussey Exp $
 */
package org.eclipse.uml2.uml.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
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
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;

public class UMLUtil
		extends UML2Util {

	public static class QualifiedTextProvider {

		public static final QualifiedTextProvider DEFAULT = new QualifiedTextProvider();

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

	public static class UML2EcoreConverter
			extends UMLSwitch
			implements Converter {

		protected class NameMatcher
				extends EClassMatcher {

			protected NameMatcher(ENamedElement eNamedElement) {
				super(eNamedElement);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((eObject == null && otherEObject == null) || ((ENamedElement) eObject)
						.getName().equalsIgnoreCase(
							((ENamedElement) otherEObject).getName()));
			}
		}

		protected class ETypeMatcher
				extends NameMatcher {

			protected ETypeMatcher(ETypedElement eTypedElement) {
				super(eTypedElement);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((eObject == null && otherEObject == null) || safeEquals(
						((ETypedElement) eObject).getEType(),
						((ETypedElement) otherEObject).getEType()));
			}
		}

		protected class SignatureMatcher
				extends ETypeMatcher {

			protected SignatureMatcher(EOperation eOperation) {
				super(eOperation);
			}

			public boolean matches(EObject otherEObject) {

				if (super.matches(otherEObject)) {
					List eParameters = ((EOperation) eObject).getEParameters();
					int eParametersSize = eParameters.size();
					List otherEParameters = ((EOperation) otherEObject)
						.getEParameters();

					if (eParametersSize == otherEParameters.size()) {

						for (int i = 0; i < eParametersSize; i++) {

							if (!new ETypeMatcher((ETypedElement) eParameters
								.get(i)).matches((EObject) otherEParameters
								.get(i))) {

								return false;
							}
						}

						return true;
					}
				}

				return false;
			}
		}

		private static final boolean DEBUG = false;

		public static final String OPTION__ECORE_TAGGED_VALUES = "ECORE_TAGGED_VALUES"; //$NON-NLS-1$

		public static final String OPTION__REDEFINING_OPERATIONS = "REDEFINING_OPERATIONS"; //$NON-NLS-1$

		public static final String OPTION__REDEFINING_PROPERTIES = "REDEFINING_PROPERTIES"; //$NON-NLS-1$

		public static final String OPTION__SUBSETTING_PROPERTIES = "SUBSETTING_PROPERTIES"; //$NON-NLS-1$

		public static final String OPTION__UNION_PROPERTIES = "UNION_PROPERTIES"; //$NON-NLS-1$

		public static final String OPTION__DERIVED_FEATURES = "DERIVED_FEATURES"; //$NON-NLS-1$

		public static final String OPTION__DUPLICATE_OPERATIONS = "DUPLICATE_OPERATIONS"; //$NON-NLS-1$

		public static final String OPTION__DUPLICATE_OPERATION_INHERITANCE = "DUPLICATE_OPERATION_INHERITANCE"; //$NON-NLS-1$

		public static final String OPTION__DUPLICATE_FEATURES = "DUPLICATE_FEATURES"; //$NON-NLS-1$

		public static final String OPTION__DUPLICATE_FEATURE_INHERITANCE = "DUPLICATE_FEATURE_INHERITANCE"; //$NON-NLS-1$

		public static final String OPTION__SUPER_CLASS_ORDER = "SUPER_CLASS_ORDER"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 2000;

		public static final int ECORE_TAGGED_VALUE = DIAGNOSTIC_CODE_OFFSET + 1;

		public static final int REDEFINING_OPERATION = DIAGNOSTIC_CODE_OFFSET + 2;

		public static final int REDEFINING_PROPERTY = DIAGNOSTIC_CODE_OFFSET + 3;

		public static final int SUBSETTING_PROPERTY = DIAGNOSTIC_CODE_OFFSET + 4;

		public static final int UNION_PROPERTY = DIAGNOSTIC_CODE_OFFSET + 5;

		public static final int DERIVED_FEATURE = DIAGNOSTIC_CODE_OFFSET + 6;

		public static final int DUPLICATE_OPERATION = DIAGNOSTIC_CODE_OFFSET + 7;

		public static final int DUPLICATE_OPERATION_INHERITANCE = DIAGNOSTIC_CODE_OFFSET + 8;

		public static final int DUPLICATE_FEATURE = DIAGNOSTIC_CODE_OFFSET + 9;

		public static final int DUPLICATE_FEATURE_INHERITANCE = DIAGNOSTIC_CODE_OFFSET + 10;

		public static final int SUPER_CLASS_ORDER = DIAGNOSTIC_CODE_OFFSET + 11;

		protected final Map elementToEModelElementMap = new HashMap();

		protected Collection packages = null;

		protected void setName(ENamedElement eNamedElement, String name,
				boolean validate) {
			eNamedElement.setName(validate
				? getValidJavaIdentifier(name)
				: name);
		}

		protected void setName(ENamedElement eNamedElement,
				NamedElement namedElement) {
			setName(eNamedElement, namedElement.getName(), true);
		}

		protected EClassifier getEType(Type type) {
			EClassifier eType = null;

			if (type != null) {
				String qualifiedName = type.getQualifiedName();

				if (!isEmpty(qualifiedName) && type instanceof PrimitiveType) {

					if ("UML2::Boolean".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEBoolean();
					} else if ("UML2::Integer".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("UML2::String".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEString();
					} else if ("UML2::UnlimitedNatural".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("Java::boolean".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEBoolean();
					} else if ("Java::byte".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEByte();
					} else if ("Java::char".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEChar();
					} else if ("Java::double".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEDouble();
					} else if ("Java::float".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEFloat();
					} else if ("Java::int".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("Java::long".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getELong();
					} else if ("Java::short".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEShort();
					} else if (qualifiedName.startsWith("Ecore::")) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEClassifier(type
							.getName());
					}
				}

				if (eType == null) {
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

		public Object caseClass(org.eclipse.uml2.uml.Class class_) {
			org.eclipse.uml2.uml.Package package_ = class_.getNearestPackage();

			if (package_ == null) {
				return super.caseClass(class_);
			} else {
				EClass eClass = EcoreFactory.eINSTANCE.createEClass();
				elementToEModelElementMap.put(class_, eClass);

				EPackage ePackage = (EPackage) doSwitch(package_);
				ePackage.getEClassifiers().add(eClass);

				setName(eClass, class_);

				eClass.setAbstract(class_.isAbstract());

				defaultCase(class_);

				return eClass;
			}
		}

		public Object caseComment(Comment comment) {

			for (Iterator annotatedElements = comment.getAnnotatedElements()
				.iterator(); annotatedElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) doSwitch((Element) annotatedElements
					.next());

				if (eModelElement != null) {
					addDocumentation(eModelElement, comment.getBody());
				}
			}

			return super.caseComment(comment);
		}

		public Object caseConstraint(Constraint constraint) {
			Namespace context = constraint.getContext();

			if (context != null) {
				EModelElement eModelElement = (EModelElement) doSwitch(context);

				if (eModelElement != null) {
					String name = constraint.getName();

					if (!isEmpty(name)) {

						if (eModelElement instanceof EClass) {
							EOperation eOperation = EcoreFactory.eINSTANCE
								.createEOperation();
							elementToEModelElementMap.put(constraint,
								eOperation);

							((EClass) eModelElement).getEOperations().add(
								eOperation);

							setName(eOperation, name, true);

							eOperation.setEType(EcorePackage.eINSTANCE
								.getEBoolean());

							EParameter eParameter = EcoreFactory.eINSTANCE
								.createEParameter();

							eOperation.getEParameters().add(eParameter);

							setName(eParameter, "diagnostics", false); //$NON-NLS-1$
							eParameter.setEType(EcorePackage.eINSTANCE
								.getEDiagnosticChain());

							eParameter = EcoreFactory.eINSTANCE
								.createEParameter();

							eOperation.getEParameters().add(eParameter);

							setName(eParameter, "context", false); //$NON-NLS-1$
							eParameter.setEType(EcorePackage.eINSTANCE
								.getEMap());

							defaultCase(constraint);

							eModelElement = eOperation;
						} else {
							addConstraint(eModelElement, name);

							if (DEBUG) {
								System.out
									.println(getQualifiedText(eModelElement)
										+ " is constrained with '" //$NON-NLS-1$
										+ name + "'"); //$NON-NLS-1$
							}
						}
					}

					ValueSpecification specification = constraint
						.getSpecification();

					if (specification != null) {
						addDocumentation(eModelElement, specification
							.stringValue());
					}

					return eModelElement;
				}
			}

			return super.caseConstraint(constraint);
		}

		public Object caseEModelElement(EModelElement eModelElement) {
			return eModelElement;
		}

		public Object caseEnumeration(Enumeration enumeration) {
			org.eclipse.uml2.uml.Package package_ = enumeration
				.getNearestPackage();

			if (package_ == null) {
				return super.caseEnumeration(enumeration);
			} else {
				EEnum eEnum = EcoreFactory.eINSTANCE.createEEnum();
				elementToEModelElementMap.put(enumeration, eEnum);

				EPackage ePackage = (EPackage) doSwitch(package_);
				ePackage.getEClassifiers().add(eEnum);

				setName(eEnum, enumeration);

				defaultCase(enumeration);

				return eEnum;
			}
		}

		public Object caseEnumerationLiteral(
				EnumerationLiteral enumerationLiteral) {
			Enumeration enumeration = enumerationLiteral.getEnumeration();

			if (enumeration == null) {
				return super.caseEnumerationLiteral(enumerationLiteral);
			} else {
				EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE
					.createEEnumLiteral();
				elementToEModelElementMap.put(enumerationLiteral, eEnumLiteral);

				EEnum eEnum = (EEnum) doSwitch(enumeration);
				eEnum.getELiterals().add(eEnumLiteral);

				setName(eEnumLiteral, enumerationLiteral);

				eEnumLiteral.setValue(enumeration.getOwnedLiterals().indexOf(
					enumerationLiteral));

				defaultCase(enumerationLiteral);

				return eEnumLiteral;
			}
		}

		public Object caseGeneralization(Generalization generalization) {
			Classifier specific = generalization.getSpecific();

			if (specific != null) {
				EClassifier specificEClassifier = (EClassifier) doSwitch(specific);

				if (specificEClassifier instanceof EClass) {
					EClass specificEClass = (EClass) specificEClassifier;
					Classifier general = generalization.getGeneral();

					if (general != null) {
						EClassifier generalEClassifier = (EClassifier) doSwitch(general);

						if (generalEClassifier instanceof EClass) {
							EClass generalEClass = (EClass) generalEClassifier;

							if (!specificEClass.isSuperTypeOf(generalEClass)) {
								specificEClass.getESuperTypes().add(
									generalEClass);
							}
						}
					}
				}
			}

			return super.caseGeneralization(generalization);
		}

		public Object caseInterfaceRealization(
				InterfaceRealization interfaceRealization) {
			BehavioredClassifier implementingClassifier = interfaceRealization
				.getImplementingClassifier();

			if (implementingClassifier != null) {
				EClassifier implementingEClassifier = (EClassifier) doSwitch(implementingClassifier);

				if (implementingEClassifier instanceof EClass) {
					EClass implementingEClass = (EClass) implementingEClassifier;
					Interface contract = interfaceRealization.getContract();

					if (contract != null) {
						EClass contractEClass = (EClass) doSwitch(contract);

						if (contractEClass != null) {
							implementingEClass.getESuperTypes().add(
								contractEClass);
						}
					}
				}
			}

			return super.caseInterfaceRealization(interfaceRealization);
		}

		public Object caseInterface(Interface interface_) {
			org.eclipse.uml2.uml.Package package_ = interface_
				.getNearestPackage();

			if (package_ == null) {
				return super.caseInterface(interface_);
			} else {
				EClass eClass = EcoreFactory.eINSTANCE.createEClass();
				elementToEModelElementMap.put(interface_, eClass);

				EPackage ePackage = (EPackage) doSwitch(package_);
				ePackage.getEClassifiers().add(eClass);

				setName(eClass, interface_);

				eClass.setAbstract(true);
				eClass.setInterface(true);

				defaultCase(interface_);

				return eClass;
			}
		}

		public Object caseMultiplicityElement(
				MultiplicityElement multiplicityElement) {
			Object eModelElement = elementToEModelElementMap
				.get(multiplicityElement);

			if (eModelElement instanceof ETypedElement) {
				ETypedElement eTypedElement = (ETypedElement) eModelElement;

				int upper = multiplicityElement.getUpper();

				if (eTypedElement.getUpperBound() != upper) {
					eTypedElement.setUpperBound(upper);
				}

				int lower = multiplicityElement.getLower();

				if (eTypedElement.getLowerBound() != lower) {
					eTypedElement.setLowerBound(lower);
				}

				eTypedElement.setOrdered(multiplicityElement.isOrdered());
				eTypedElement.setUnique(multiplicityElement.isUnique());

				return eTypedElement;
			} else {
				return super.caseMultiplicityElement(multiplicityElement);
			}
		}

		public Object caseOperation(Operation operation) {
			Namespace namespace = operation.getNamespace();

			if (!(namespace instanceof org.eclipse.uml2.uml.Class)
				&& !(namespace instanceof Interface)) {

				return super.caseOperation(operation);
			} else {
				EOperation eOperation = EcoreFactory.eINSTANCE
					.createEOperation();
				elementToEModelElementMap.put(operation, eOperation);

				EClass eClass = (EClass) doSwitch(namespace);
				eClass.getEOperations().add(eOperation);

				setName(eOperation, operation);

				EList eExceptions = eOperation.getEExceptions();

				for (Iterator raisedExceptions = operation
					.getRaisedExceptions().iterator(); raisedExceptions
					.hasNext();) {

					eExceptions.add(getEType((Type) raisedExceptions.next()));
				}

				eOperation.setEType(getEType(operation.getType()));

				int upper = operation.getUpper();

				if (eOperation.getUpperBound() != upper) {
					eOperation.setUpperBound(upper);
				}

				int lower = operation.getLower();

				if (eOperation.getLowerBound() != lower) {
					eOperation.setLowerBound(lower);
				}

				eOperation.setOrdered(operation.isOrdered());
				eOperation.setUnique(operation.isUnique());

				defaultCase(operation);

				return eOperation;
			}
		}

		public Object casePackage(org.eclipse.uml2.uml.Package package_) {
			EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
			elementToEModelElementMap.put(package_, ePackage);

			if (!packages.contains(package_)) {
				org.eclipse.uml2.uml.Package nestingPackage = package_
					.getNestingPackage();

				if (nestingPackage != null) {
					((EPackage) doSwitch(nestingPackage)).getESubpackages()
						.add(ePackage);
				}
			}

			setName(ePackage, package_);

			if (isEmpty(ePackage.getNsPrefix())) {
				EPackage eSuperPackage = ePackage.getESuperPackage();

				ePackage.setNsPrefix((eSuperPackage == null
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

		public Object caseParameter(Parameter parameter) {
			Operation operation = parameter.getOperation();

			if (operation == null
				|| parameter.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
				return super.caseParameter(parameter);
			} else {
				EParameter eParameter = EcoreFactory.eINSTANCE
					.createEParameter();
				elementToEModelElementMap.put(parameter, eParameter);

				EOperation eOperation = (EOperation) doSwitch(operation);
				eOperation.getEParameters().add(eParameter);

				setName(eParameter, parameter);

				caseTypedElement(parameter);
				caseMultiplicityElement(parameter);

				defaultCase(parameter);

				return eParameter;
			}
		}

		public Object casePrimitiveType(PrimitiveType primitiveType) {
			org.eclipse.uml2.uml.Package package_ = primitiveType
				.getNearestPackage();

			if (package_ == null) {
				return super.casePrimitiveType(primitiveType);
			} else {
				EDataType eDataType = EcoreFactory.eINSTANCE.createEDataType();
				elementToEModelElementMap.put(primitiveType, eDataType);

				EPackage ePackage = (EPackage) doSwitch(package_);
				ePackage.getEClassifiers().add(eDataType);

				setName(eDataType, primitiveType);

				eDataType.setInstanceClassName(eDataType.getName());

				defaultCase(primitiveType);

				return eDataType;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.util.UML2Switch#caseProperty(org.eclipse.uml2.Property)
		 */
		public Object caseProperty(Property property) {
			Namespace namespace = property.getNamespace();

			if (!(namespace instanceof org.eclipse.uml2.uml.Class)
				&& !(namespace instanceof Interface)) {

				return super.caseProperty(property);
			} else {
				EStructuralFeature eStructuralFeature = null;

				if (property.getType() instanceof DataType) {
					EAttribute eAttribute = (EAttribute) (eStructuralFeature = EcoreFactory.eINSTANCE
						.createEAttribute());
					elementToEModelElementMap.put(property, eAttribute);

					String default_ = property.getDefault();

					if (default_ != null) {

						try {
							EDataType eDataType = (EDataType) getEType(property);

							eDataType.getEPackage().getEFactoryInstance()
								.createFromString(eDataType, default_);
							eAttribute.setDefaultValueLiteral(default_);
						} catch (Exception e) {
							// ignore
						}
					}
				} else {
					EReference eReference = (EReference) (eStructuralFeature = EcoreFactory.eINSTANCE
						.createEReference());
					elementToEModelElementMap.put(property, eStructuralFeature);

					eReference.setContainment(property.isComposite());
				}

				EClass eClass = (EClass) doSwitch(namespace);
				eClass.getEStructuralFeatures().add(eStructuralFeature);

				setName(eStructuralFeature, property);

				eStructuralFeature.setChangeable(!property.isReadOnly());

				eStructuralFeature.setDerived(property.isDerived());

				Property opposite = property.getOpposite();

				if (opposite != null) {
					EReference eOpposite = (EReference) doSwitch(opposite);

					if (property.isComposite() && !eOpposite.isTransient()) {
						eOpposite.setTransient(true);

						if (DEBUG) {
							System.out.println("Made container " //$NON-NLS-1$
								+ getQualifiedText(eOpposite) + " transient"); //$NON-NLS-1$
						}
					}

					if (property.isDerived() && !eOpposite.isDerived()) {
						eOpposite.setDerived(true);

						if (DEBUG) {
							System.out.println("Made opposite " //$NON-NLS-1$
								+ getQualifiedText(eOpposite) + " derived"); //$NON-NLS-1$
						}
					}

					((EReference) eStructuralFeature).setEOpposite(eOpposite);
				}

				caseTypedElement(property);
				caseMultiplicityElement(property);

				defaultCase(property);

				return eStructuralFeature;
			}
		}

		public Object caseTypedElement(TypedElement typedElement) {
			Object eModelElement = elementToEModelElementMap.get(typedElement);

			if (eModelElement instanceof ETypedElement) {
				ETypedElement eTypedElement = (ETypedElement) eModelElement;

				eTypedElement.setEType(getEType(typedElement));

				return eTypedElement;
			} else {
				return super.caseTypedElement(typedElement);
			}
		}

		public Object defaultCase(EObject eObject) {

			for (Iterator eContents = eObject.eContents().iterator(); eContents
				.hasNext();) {

				doSwitch((EObject) eContents.next());
			}

			return super.defaultCase(eObject);
		}

		public Object doSwitch(EObject eObject) {
			Object eModelElement = elementToEModelElementMap.get(eObject);

			return eModelElement == null
				? super.doSwitch(eObject)
				: eModelElement;
		}

		protected void processEcoreTaggedValue(EModelElement eModelElement,
				EStructuralFeature eStructuralFeature, Element element,
				Stereotype stereotype, String propertyName, Map options,
				DiagnosticChain diagnostics, Map context) {

			if (element.hasValue(stereotype, propertyName)) {
				Object value = element.getValue(stereotype, propertyName);

				if (OPTION__PROCESS.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.INFO,
								UMLValidator.DIAGNOSTIC_SOURCE,
								ECORE_TAGGED_VALUE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML22EcoreConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eModelElement,
											getTaggedValueDefinition(
												stereotype, propertyName),
											value)),
								new Object[]{eModelElement}));
					}

					if (eStructuralFeature != null) {
						eModelElement
							.eSet(
								eStructuralFeature,
								eStructuralFeature == EcorePackage.Literals.ENAMED_ELEMENT__NAME
									? getValidJavaIdentifier((String) value)
									: value);
					} else {

						if (propertyName == PROPERTY_NAME__XML_CONTENT_KIND) {
							Enumeration contentKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__EMPTY)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.EMPTY_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__SIMPLE)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.SIMPLE_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__MIXED)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.MIXED_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__ELEMENT_ONLY)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.ELEMENT_ONLY_CONTENT);
							}
						} else if (propertyName == PROPERTY_NAME__XML_FEATURE_KIND) {
							Enumeration featureKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__SIMPLE)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.SIMPLE_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__ATTRIBUTE)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ATTRIBUTE_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__ATTRIBUTE_WILDCARD)) {

								ExtendedMetaData.INSTANCE
									.setFeatureKind(
										(EStructuralFeature) eModelElement,
										ExtendedMetaData.ATTRIBUTE_WILDCARD_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__ELEMENT)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ELEMENT_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__ELEMENT_WILDCARD)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ELEMENT_WILDCARD_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__GROUP)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.GROUP_FEATURE);
							}
						} else if (propertyName == PROPERTY_NAME__XML_NAME) {

							if (eModelElement instanceof EClassifier) {
								ExtendedMetaData.INSTANCE
									.setName((EClassifier) eModelElement,
										(String) value);
							} else if (eModelElement instanceof EStructuralFeature) {
								ExtendedMetaData.INSTANCE.setName(
									(EStructuralFeature) eModelElement,
									(String) value);
							}
						} else if (propertyName == PROPERTY_NAME__XML_NAMESPACE) {
							ExtendedMetaData.INSTANCE.setNamespace(
								(EStructuralFeature) eModelElement,
								(String) value);
						} else if (propertyName == PROPERTY_NAME__VISIBILITY) {
							eStructuralFeature = (EStructuralFeature) eModelElement;
							boolean isChangeable = eStructuralFeature
								.isChangeable();
							boolean isMany = eStructuralFeature.isMany();
							boolean isUnsettable = eStructuralFeature
								.isUnsettable();

							Enumeration visibilityKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == visibilityKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__NONE)) {

								EcoreUtil.setSuppressedVisibility(
									eStructuralFeature, EcoreUtil.GET, true);

								if (isChangeable && !isMany) {
									EcoreUtil
										.setSuppressedVisibility(
											eStructuralFeature, EcoreUtil.SET,
											true);
								}

								if (isUnsettable) {
									EcoreUtil.setSuppressedVisibility(
										eStructuralFeature, EcoreUtil.IS_SET,
										true);

									if (isChangeable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature,
											EcoreUtil.UNSET, true);
									}
								}
							} else if (value == visibilityKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__READ_ONLY)) {

								if (!isMany && isChangeable) {
									EcoreUtil
										.setSuppressedVisibility(
											eStructuralFeature, EcoreUtil.SET,
											true);
								}

								if (isUnsettable) {
									EcoreUtil.setSuppressedVisibility(
										eStructuralFeature, EcoreUtil.IS_SET,
										true);

									if (isChangeable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature,
											EcoreUtil.UNSET, true);
									}
								}
							} else if (value == visibilityKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__READ_WRITE)) {

								if (isUnsettable) {
									EcoreUtil.setSuppressedVisibility(
										eStructuralFeature, EcoreUtil.IS_SET,
										true);

									if (isChangeable) {
										EcoreUtil.setSuppressedVisibility(
											eStructuralFeature,
											EcoreUtil.UNSET, true);
									}
								}
							} else if (value == visibilityKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL_NAME__READ_ONLY_UNSETTABLE)) {

								if (!isMany && isChangeable) {
									EcoreUtil
										.setSuppressedVisibility(
											eStructuralFeature, EcoreUtil.SET,
											true);
								}

								if (isUnsettable && isChangeable) {
									EcoreUtil.setSuppressedVisibility(
										eStructuralFeature, EcoreUtil.UNSET,
										true);
								}
							}
						}
					}
				} else if (OPTION__REPORT.equals(options
					.get(OPTION__ECORE_TAGGED_VALUES))
					&& diagnostics != null) {

					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							ECORE_TAGGED_VALUE,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_UML22EcoreConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										eModelElement,
										getTaggedValueDefinition(stereotype,
											propertyName), value)),
							new Object[]{eModelElement}));
				}
			}
		}

		protected void processEcoreTaggedValues(EClassifier eClassifier,
				final Element element, final Map options,
				final DiagnosticChain diagnostics, final Map context) {
			Stereotype eClassifierStereotype = (Stereotype) new EcoreSwitch() {

				public Object caseEClass(EClass eClass) {
					Stereotype eClassStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE_NAME__E_CLASS);

					if (eClassStereotype != null) {
						processEcoreTaggedValue(eClass, EcorePackage.eINSTANCE
							.getENamedElement_Name(), element,
							eClassStereotype, PROPERTY_NAME__CLASS_NAME,
							options, diagnostics, context);

						processEcoreTaggedValue(eClass, null, element,
							eClassStereotype, PROPERTY_NAME__XML_CONTENT_KIND,
							options, diagnostics, context);
					}

					return eClassStereotype;
				}

				public Object caseEDataType(EDataType eDataType) {
					Stereotype eDataTypeStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE_NAME__E_DATA_TYPE);

					if (eDataTypeStereotype != null) {
						processEcoreTaggedValue(eDataType,
							EcorePackage.eINSTANCE.getENamedElement_Name(),
							element, eDataTypeStereotype,
							PROPERTY_NAME__DATA_TYPE_NAME, options,
							diagnostics, context);
					}

					return eDataTypeStereotype;
				}
			}.doSwitch(eClassifier);

			if (eClassifierStereotype != null) {
				processEcoreTaggedValue(eClassifier, null, element,
					eClassifierStereotype, PROPERTY_NAME__XML_NAME, options,
					diagnostics, context);

				processEcoreTaggedValue(eClassifier, EcorePackage.eINSTANCE
					.getEClassifier_InstanceClassName(), element,
					eClassifierStereotype, PROPERTY_NAME__INSTANCE_CLASS_NAME,
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EEnum eEnum, Element element,
				Map options, DiagnosticChain diagnostics, Map context) {
			Stereotype eEnumStereotype = getAppliedEcoreStereotype(element,
				STEREOTYPE_NAME__E_ENUM);

			if (eEnumStereotype != null) {
				processEcoreTaggedValue(eEnum, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eEnumStereotype,
					PROPERTY_NAME__ENUM_NAME, options, diagnostics, context);

				processEcoreTaggedValue(eEnum, null, element, eEnumStereotype,
					PROPERTY_NAME__XML_NAME, options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EEnumLiteral eEnumLiteral,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype eEnumLiteralStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE_NAME__E_ENUM_LITERAL);

			if (eEnumLiteralStereotype != null) {
				processEcoreTaggedValue(eEnumLiteral, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eEnumLiteralStereotype,
					PROPERTY_NAME__ENUM_LITERAL_NAME, options, diagnostics,
					context);
			}
		}

		protected void processEcoreTaggedValues(EOperation eOperation,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype eOperationStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE_NAME__E_OPERATION);

			if (eOperationStereotype != null) {
				processEcoreTaggedValue(eOperation, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eOperationStereotype,
					PROPERTY_NAME__OPERATION_NAME, options, diagnostics,
					context);
			}
		}

		protected void processEcoreTaggedValues(EPackage ePackage,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype ePackageStereotype = getAppliedEcoreStereotype(element,
				STEREOTYPE_NAME__E_PACKAGE);

			if (ePackageStereotype != null) {
				processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, ePackageStereotype,
					PROPERTY_NAME__PACKAGE_NAME, options, diagnostics, context);

				processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
					.getEPackage_NsPrefix(), element, ePackageStereotype,
					PROPERTY_NAME__NS_PREFIX, options, diagnostics, context);

				if (isEmpty(ePackage.getNsPrefix())) {
					processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
						.getEPackage_NsPrefix(), element, ePackageStereotype,
						PROPERTY_NAME__BASE_PACKAGE, options, diagnostics,
						context);

					String nsPrefix = ePackage.getNsPrefix();

					if (!isEmpty(nsPrefix)) {
						ePackage.setNsPrefix(nsPrefix + '.'
							+ ePackage.getName());
					}
				}

				processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
					.getEPackage_NsURI(), element, ePackageStereotype,
					PROPERTY_NAME__NS_URI, options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EParameter eParameter,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype eParameterStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE_NAME__E_PARAMETER);

			if (eParameterStereotype != null) {
				processEcoreTaggedValue(eParameter, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eParameterStereotype,
					PROPERTY_NAME__PARAMETER_NAME, options, diagnostics,
					context);
			}
		}

		protected void processEcoreTaggedValues(
				EStructuralFeature eStructuralFeature, final Element element,
				final Map options, final DiagnosticChain diagnostics,
				final Map context) {
			Stereotype eStructuralFeatureStereotype = (Stereotype) new EcoreSwitch() {

				public Object caseEAttribute(EAttribute eAttribute) {
					Stereotype eAttributeStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE_NAME__E_ATTRIBUTE);

					if (eAttributeStereotype != null) {
						processEcoreTaggedValue(eAttribute,
							EcorePackage.eINSTANCE.getENamedElement_Name(),
							element, eAttributeStereotype,
							PROPERTY_NAME__ATTRIBUTE_NAME, options,
							diagnostics, context);

						processEcoreTaggedValue(eAttribute,
							EcorePackage.eINSTANCE.getEAttribute_ID(), element,
							eAttributeStereotype, PROPERTY_NAME__IS_ID,
							options, diagnostics, context);
					}

					return eAttributeStereotype;
				}

				public Object caseEReference(EReference eReference) {
					Stereotype eReferenceStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE_NAME__E_REFERENCE);

					if (eReferenceStereotype != null) {
						processEcoreTaggedValue(eReference,
							EcorePackage.eINSTANCE.getENamedElement_Name(),
							element, eReferenceStereotype,
							PROPERTY_NAME__REFERENCE_NAME, options,
							diagnostics, context);

						processEcoreTaggedValue(eReference,
							EcorePackage.eINSTANCE
								.getEReference_ResolveProxies(), element,
							eReferenceStereotype,
							PROPERTY_NAME__IS_RESOLVE_PROXIES, options,
							diagnostics, context);
					}

					return eReferenceStereotype;
				}
			}.doSwitch(eStructuralFeature);

			if (eStructuralFeatureStereotype != null) {
				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Transient(),
					element, eStructuralFeatureStereotype,
					PROPERTY_NAME__IS_TRANSIENT, options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Unsettable(),
					element, eStructuralFeatureStereotype,
					PROPERTY_NAME__IS_UNSETTABLE, options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Volatile(),
					element, eStructuralFeatureStereotype,
					PROPERTY_NAME__IS_VOLATILE, options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, PROPERTY_NAME__XML_NAME,
					options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, PROPERTY_NAME__XML_NAMESPACE,
					options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype,
					PROPERTY_NAME__XML_FEATURE_KIND, options, diagnostics,
					context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, PROPERTY_NAME__VISIBILITY,
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			for (Iterator entries = elementToEModelElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				final Map.Entry entry = (Map.Entry) entries.next();
				EModelElement eModelElement = (EModelElement) entry.getValue();

				new EcoreSwitch() {

					public Object caseEClassifier(EClassifier eClassifier) {
						processEcoreTaggedValues(eClassifier, (Element) entry
							.getKey(), options, diagnostics, context);

						return eClassifier;
					}

					public Object caseEEnum(EEnum eEnum) {
						processEcoreTaggedValues(eEnum, (Element) entry
							.getKey(), options, diagnostics, context);

						return eEnum;
					}

					public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
						processEcoreTaggedValues(eEnumLiteral, (Element) entry
							.getKey(), options, diagnostics, context);

						return eEnumLiteral;
					}

					public Object caseEOperation(EOperation eOperation) {
						processEcoreTaggedValues(eOperation, (Element) entry
							.getKey(), options, diagnostics, context);

						return eOperation;
					}

					public Object caseEPackage(EPackage ePackage) {
						processEcoreTaggedValues(

						ePackage, (Element) entry.getKey(), options,
							diagnostics, context);

						return ePackage;
					}

					public Object caseEParameter(EParameter eParameter) {
						processEcoreTaggedValues(eParameter, (Element) entry
							.getKey(), options, diagnostics, context);

						return eParameter;
					}

					public Object caseEStructuralFeature(
							EStructuralFeature eStructuralFeature) {
						processEcoreTaggedValues(eStructuralFeature,
							(Element) entry.getKey(), options, diagnostics,
							context);

						return eStructuralFeature;
					}

				}.doSwitch(eModelElement);
			}
		}

		protected void processRedefiningOperations(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = elementToEModelElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				Element element = (Element) entry.getKey();
				EModelElement eModelElement = (EModelElement) entry.getValue();

				if (eModelElement instanceof EOperation
					&& element instanceof Operation) {

					Operation operation = (Operation) element;

					for (Iterator redefinedOperations = operation
						.getRedefinedOperations().iterator(); redefinedOperations
						.hasNext();) {

						Operation redefinedOperation = (Operation) redefinedOperations
							.next();

						EOperation eOperation = (EOperation) elementToEModelElementMap
							.get(redefinedOperation);

						if (DEBUG) {
							System.out.println(getQualifiedText(eModelElement)
								+ " redefines " + getQualifiedText(eOperation)); //$NON-NLS-1$
						}

						if (OPTION__PROCESS.equals(options
							.get(OPTION__REDEFINING_OPERATIONS))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										REDEFINING_OPERATION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML22EcoreConverter_ProcessRedefiningOperation_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													eOperation)), new Object[]{
											eModelElement, eOperation}));
							}

							getEAnnotation(eModelElement,
								ANNOTATION_SOURCE__REDEFINES, true)
								.getReferences().add(eOperation);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__REDEFINING_OPERATIONS))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									REDEFINING_OPERATION,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML22EcoreConverter_ReportRedefiningOperation_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eModelElement, eOperation)),
									new Object[]{eModelElement, eOperation}));
						}
					}
				}
			}
		}

		protected void processRedefiningProperties(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = elementToEModelElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				Element element = (Element) entry.getKey();
				EModelElement eModelElement = (EModelElement) entry.getValue();

				if (eModelElement instanceof EStructuralFeature
					&& element instanceof Property) {

					Property property = (Property) element;

					for (Iterator redefinedProperties = property
						.getRedefinedProperties().iterator(); redefinedProperties
						.hasNext();) {

						Property redefinedProperty = (Property) redefinedProperties
							.next();

						if (redefinedProperty.getOwningAssociation() == null) {

							EStructuralFeature eStructuralFeature = (EStructuralFeature) elementToEModelElementMap
								.get(redefinedProperty);

							if (DEBUG) {
								System.out
									.println(getQualifiedText(eModelElement)
										+ " redefines " //$NON-NLS-1$
										+ getQualifiedText(eStructuralFeature));
							}

							if (OPTION__PROCESS.equals(options
								.get(OPTION__REDEFINING_PROPERTIES))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											REDEFINING_PROPERTY,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML22EcoreConverter_ProcessRedefiningProperty_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eModelElement,
														eStructuralFeature)),
											new Object[]{eModelElement,
												eStructuralFeature}));
								}

								getEAnnotation(eModelElement,
									ANNOTATION_SOURCE__REDEFINES, true)
									.getReferences().add(eStructuralFeature);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__REDEFINING_PROPERTIES))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										REDEFINING_PROPERTY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML22EcoreConverter_ReportRedefiningProperty_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													eStructuralFeature)),
										new Object[]{eModelElement,
											eStructuralFeature}));
							}
						}
					}
				}
			}
		}

		protected void processSubsettingProperties(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = elementToEModelElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				Element element = (Element) entry.getKey();
				EModelElement eModelElement = (EModelElement) entry.getValue();

				if (eModelElement instanceof EStructuralFeature
					&& element instanceof Property) {

					Property property = (Property) element;

					for (Iterator subsettedProperties = property
						.getSubsettedProperties().iterator(); subsettedProperties
						.hasNext();) {

						Property subsettedProperty = (Property) subsettedProperties
							.next();

						if (subsettedProperty.getOwningAssociation() == null) {
							EStructuralFeature subsettedEStructuralFeature = (EStructuralFeature) elementToEModelElementMap
								.get(subsettedProperty);

							if (DEBUG) {
								System.out
									.println(getQualifiedText(eModelElement)
										+ " subsets " //$NON-NLS-1$
										+ getQualifiedText(subsettedEStructuralFeature));
							}

							if (OPTION__PROCESS.equals(options
								.get(OPTION__SUBSETTING_PROPERTIES))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											SUBSETTING_PROPERTY,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML22EcoreConverter_ProcessSubsettingProperty_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eModelElement,
														subsettedEStructuralFeature)),
											new Object[]{eModelElement,
												subsettedEStructuralFeature}));
								}

								if (!subsettedEStructuralFeature.isDerived()
									&& subsettedEStructuralFeature instanceof EReference) {

									EReference subsettedEReference = (EReference) subsettedEStructuralFeature;
									EReference eReference = (EReference) eModelElement;

									if (subsettedEReference.isContainment()) {
										eReference.setContainment(false);
									}

									if (!eReference.isContainment()) {
										eReference
											.setResolveProxies(subsettedEReference
												.isResolveProxies());
									}
								}

								getEAnnotation(eModelElement,
									ANNOTATION_SOURCE__SUBSETS, true)
									.getReferences().add(
										elementToEModelElementMap
											.get(subsettedProperty));
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__SUBSETTING_PROPERTIES))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										SUBSETTING_PROPERTY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML22EcoreConverter_ReportSubsettingProperty_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													subsettedEStructuralFeature)),
										new Object[]{eModelElement,
											subsettedEStructuralFeature}));
							}
						}
					}
				}
			}
		}

		protected void processUnionProperties(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = elementToEModelElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				Element element = (Element) entry.getKey();
				EModelElement eModelElement = (EModelElement) entry.getValue();

				if (eModelElement instanceof EStructuralFeature
					&& element instanceof Property
					&& ((Property) element).isDerivedUnion()) {

					EStructuralFeature eStructuralFeature = (EStructuralFeature) eModelElement;

					if (DEBUG) {
						System.out.println(getQualifiedText(eStructuralFeature)
							+ " is a union"); //$NON-NLS-1$
					}

					if (OPTION__PROCESS.equals(options
						.get(OPTION__UNION_PROPERTIES))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									UNION_PROPERTY,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML22EcoreConverter_ProcessUnionProperty_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eStructuralFeature)),
									new Object[]{eStructuralFeature}));
						}

						getEAnnotation(eStructuralFeature,
							ANNOTATION_SOURCE__UNION, true);

						eStructuralFeature.setChangeable(false);
						eStructuralFeature.setVolatile(false);
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__UNION_PROPERTIES))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UNION_PROPERTY,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_UML22EcoreConverter_ReportUnionProperty_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eModelElement)),
								new Object[]{eModelElement}));
					}
				}
			}
		}

		protected void processDerivedFeatures(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator eModelElements = elementToEModelElementMap.values()
				.iterator(); eModelElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) eModelElements
					.next();

				if (eModelElement instanceof EStructuralFeature) {
					EStructuralFeature eStructuralFeature = (EStructuralFeature) eModelElement;

					if (eStructuralFeature.isDerived()
						&& ((eStructuralFeature instanceof EReference && ((EReference) eStructuralFeature)
							.isContainment())
							|| !eStructuralFeature.isTransient() || !eStructuralFeature
							.isVolatile())) {

						if (OPTION__PROCESS.equals(options
							.get(OPTION__DERIVED_FEATURES))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										DERIVED_FEATURE,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML22EcoreConverter_ProcessDerivedFeature_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eStructuralFeature)),
										new Object[]{eStructuralFeature}));
							}

							if (eStructuralFeature instanceof EReference) {
								((EReference) eStructuralFeature)
									.setContainment(false);
							}

							eStructuralFeature.setVolatile(true);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__DERIVED_FEATURES))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									DERIVED_FEATURE,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML22EcoreConverter_ReportDerivedFeature_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eStructuralFeature)),
									new Object[]{eStructuralFeature}));
						}
					}
				}
			}
		}

		protected void ensureConformity(ETypedElement eTypedElement,
				ETypedElement otherETypedElement) {

			if (eTypedElement.isRequired() != otherETypedElement.isRequired()) {
				int lowerBound = eTypedElement.getLowerBound();
				int otherLowerBound = otherETypedElement.getLowerBound();

				int lesserLowerBound = getLesserLowerBound(otherLowerBound,
					lowerBound);

				if (lesserLowerBound != otherLowerBound) {

					if (DEBUG) {
						System.err.println("Changed lower bound of " //$NON-NLS-1$
							+ getQualifiedText(otherETypedElement) + " from " //$NON-NLS-1$
							+ otherLowerBound + " to " //$NON-NLS-1$
							+ lesserLowerBound);
					}

					otherETypedElement.setLowerBound(lesserLowerBound);
				}

				if (lesserLowerBound != lowerBound) {

					if (DEBUG) {
						System.out.println("Changed lower bound of " //$NON-NLS-1$
							+ getQualifiedText(eTypedElement) + " from " //$NON-NLS-1$
							+ lowerBound + " to " //$NON-NLS-1$
							+ lesserLowerBound);
					}

					eTypedElement.setLowerBound(lesserLowerBound);
				}
			}

			boolean isMany = eTypedElement.isMany();
			boolean otherIsMany = otherETypedElement.isMany();

			if (isMany != otherIsMany) {
				int upperBound = eTypedElement.getUpperBound();
				int otherUpperBound = otherETypedElement.getUpperBound();

				int greaterUpperBound = getGreaterUpperBound(otherUpperBound,
					upperBound);

				if (greaterUpperBound != otherUpperBound) {

					if (DEBUG) {
						System.err.println("Changed upper bound of " //$NON-NLS-1$
							+ getQualifiedText(otherETypedElement) + " from " //$NON-NLS-1$
							+ otherUpperBound + " to " //$NON-NLS-1$
							+ greaterUpperBound);
					}

					otherETypedElement.setUpperBound(greaterUpperBound);
				}

				if (greaterUpperBound != upperBound) {

					if (DEBUG) {
						System.out.println("Changed upper bound of " //$NON-NLS-1$
							+ getQualifiedText(eTypedElement) + " from " //$NON-NLS-1$
							+ upperBound + " to " //$NON-NLS-1$
							+ greaterUpperBound);
					}

					eTypedElement.setUpperBound(greaterUpperBound);
				}
			}

			if (!isMany && !otherIsMany) {
				EClassifier eType = eTypedElement.getEType();
				EClassifier otherEType = otherETypedElement.getEType();

				EClassifier commonEType = getCommonEType(otherEType, eType);

				if (commonEType != otherEType) {

					if (DEBUG) {
						System.err.println("Changed type of " //$NON-NLS-1$
							+ getQualifiedText(otherETypedElement)
							+ " from " //$NON-NLS-1$
							+ getQualifiedText(otherEType)
							+ " to " + getQualifiedText(commonEType)); //$NON-NLS-1$
					}

					otherETypedElement.setEType(commonEType);
				}

				if (commonEType != eType) {

					if (DEBUG) {
						System.out.println("Changed type of " //$NON-NLS-1$
							+ getQualifiedText(eTypedElement)
							+ " from " //$NON-NLS-1$
							+ getQualifiedText(eType)
							+ " to " + getQualifiedText(commonEType)); //$NON-NLS-1$
					}

					eTypedElement.setEType(commonEType);
				}
			}

			eTypedElement.setOrdered(otherETypedElement.isOrdered());

			eTypedElement.setUnique(otherETypedElement.isUnique());
		}

		protected void qualifyName(ENamedElement eNamedElement) {
			EObject eContainer = eNamedElement.eContainer();

			if (eContainer instanceof ENamedElement) {
				String qualifiedName = ((ENamedElement) eContainer).getName()
					+ '_' + eNamedElement.getName();

				if (DEBUG) {
					System.err.println("Qualified " //$NON-NLS-1$
						+ getQualifiedText(eNamedElement) + " as " //$NON-NLS-1$
						+ qualifiedName);
				}

				eNamedElement.setName(qualifiedName);
			}
		}

		protected void processDuplicateOperations(Map options,
				DiagnosticChain diagnostics, Map context) {
			List operationsToDuplicate = new UniqueEList();

			for (Iterator eModelElements = elementToEModelElementMap.values()
				.iterator(); eModelElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) eModelElements
					.next();

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					for (Iterator eOperations = eClass.getEOperations()
						.iterator(); eOperations.hasNext();) {

						EOperation eOperation = (EOperation) eOperations.next();

						for (Iterator eAllOperations = eClass
							.getEAllOperations().iterator(); eAllOperations
							.hasNext();) {

							EOperation eAllOperation = (EOperation) eAllOperations
								.next();

							if (eAllOperation == eOperation) {
								break;
							} else if (new SignatureMatcher(eOperation)
								.matches(eAllOperation)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__DUPLICATE_OPERATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_OPERATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML22EcoreConverter_ProcessDuplicateOperation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eOperation,
															eAllOperation)),
												new Object[]{eClass,
													eAllOperation}));
									}

									operationsToDuplicate.add(eOperation);

									ensureConformity(eOperation, eAllOperation);

									List redefinedOperations = getEAnnotation(
										eOperation,
										ANNOTATION_SOURCE__REDEFINES, true)
										.getReferences();

									if (!redefinedOperations
										.contains(eAllOperation)) {

										redefinedOperations.add(eAllOperation);
									}
								} else if (OPTION__DISCARD.equals(options
									.get(OPTION__DUPLICATE_OPERATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.WARNING,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_OPERATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML22EcoreConverter_DiscardDuplicateOperation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eOperation,
															eAllOperation)),
												new Object[]{eClass,
													eAllOperation}));
									}

									eOperations.remove();
									break;
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__DUPLICATE_OPERATIONS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.ERROR,
											UMLValidator.DIAGNOSTIC_SOURCE,
											DUPLICATE_OPERATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML22EcoreConverter_ReportDuplicateOperation_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eOperation,
														eAllOperation)),
											new Object[]{eOperation,
												eAllOperation}));
								}
							}
						}
					}

				}
			}

			for (Iterator eOperations = operationsToDuplicate.iterator(); eOperations
				.hasNext();) {

				EOperation eOperation = (EOperation) eOperations.next();

				getEAnnotation(eOperation.getEContainingClass(),
					ANNOTATION_SOURCE__DUPLICATES, true).getContents().add(
					eOperation);
			}
		}

		protected void processDuplicateOperationInheritance(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator eModelElements = elementToEModelElementMap.values()
				.iterator(); eModelElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) eModelElements
					.next();

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					if (eClass.getESuperTypes().size() > 1) {
						Iterator eSuperTypes = eClass.getESuperTypes()
							.iterator();
						eSuperTypes.next();

						while (eSuperTypes.hasNext()) {
							EClass mixinEClass = (EClass) eSuperTypes.next();

							mixinEOperationsLoop : for (Iterator mixinEOperations = mixinEClass
								.getEAllOperations().iterator(); mixinEOperations
								.hasNext();) {

								EOperation mixinEOperation = (EOperation) mixinEOperations
									.next();

								for (Iterator eOperations = eClass
									.getEAllOperations().iterator(); eOperations
									.hasNext();) {

									EOperation eOperation = (EOperation) eOperations
										.next();

									if (eOperation == mixinEOperation) {
										break;
									} else if (new SignatureMatcher(
										mixinEOperation).matches(eOperation)) {

										if (OPTION__PROCESS
											.equals(options
												.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.INFO,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_OPERATION_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML22EcoreConverter_ProcessDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eOperation,
																	mixinEOperation)),
														new Object[]{eClass,
															eOperation,
															mixinEOperation}));
											}

											qualifyName(mixinEOperation);

											List redefinedOperations = getEAnnotation(
												mixinEOperation,
												ANNOTATION_SOURCE__REDEFINES,
												true).getReferences();

											if (!redefinedOperations
												.contains(eOperation)) {

												redefinedOperations
													.add(eOperation);
											}
										} else if (OPTION__DISCARD
											.equals(options
												.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.WARNING,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_OPERATION_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML22EcoreConverter_DiscardDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eOperation,
																	mixinEOperation)),
														new Object[]{eClass,
															eOperation,
															mixinEOperation}));
											}

											eSuperTypes.remove();
											break mixinEOperationsLoop;
										} else if (OPTION__REPORT
											.equals(options
												.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))
											&& diagnostics != null) {

											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.ERROR,
													UMLValidator.DIAGNOSTIC_SOURCE,
													DUPLICATE_OPERATION_INHERITANCE,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_UML22EcoreConverter_ReportDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																eClass,
																eOperation,
																mixinEOperation)),
													new Object[]{eClass,
														eOperation,
														mixinEOperation}));
										}
									}
								}
							}
						}
					}
				}
			}
		}

		protected void processDuplicateFeatures(Map options,
				DiagnosticChain diagnostics, Map context) {
			List featuresToDuplicate = new UniqueEList();
			List featuresToRemove = new UniqueEList();

			for (Iterator eModelElements = elementToEModelElementMap.values()
				.iterator(); eModelElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) eModelElements
					.next();

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					for (Iterator eStructuralFeatures = eClass
						.getEStructuralFeatures().iterator(); eStructuralFeatures
						.hasNext();) {

						EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
							.next();

						for (Iterator eAllStructuralFeatures = eClass
							.getEAllStructuralFeatures().iterator(); eAllStructuralFeatures
							.hasNext();) {

							EStructuralFeature eAllStructuralFeature = (EStructuralFeature) eAllStructuralFeatures
								.next();

							if (eAllStructuralFeature == eStructuralFeature) {
								break;
							} else if (new NameMatcher(eStructuralFeature)
								.matches(eAllStructuralFeature)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__DUPLICATE_FEATURES))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_FEATURE,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML22EcoreConverter_ProcessDuplicateFeature_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eStructuralFeature,
															eAllStructuralFeature)),
												new Object[]{
													eStructuralFeature,
													eAllStructuralFeature}));
									}

									if (!featuresToDuplicate
										.contains(eStructuralFeature)) {

										EStructuralFeature duplicateEStructuralFeature = eAllStructuralFeature
											.isDerived()
											&& !eStructuralFeature.isDerived()
											? eAllStructuralFeature
											: eStructuralFeature;

										if (DEBUG
											&& duplicateEStructuralFeature == eAllStructuralFeature) {

											System.err
												.println("Non-derived feature " //$NON-NLS-1$
													+ getQualifiedText(eStructuralFeature)
													+ " is a duplicate of derived feature " //$NON-NLS-1$
													+ getQualifiedText(eAllStructuralFeature));
										}

										featuresToDuplicate
											.add(duplicateEStructuralFeature);

										ensureConformity(eStructuralFeature,
											eAllStructuralFeature);
									}

									EList redefinedFeatures = getEAnnotation(
										eStructuralFeature,
										ANNOTATION_SOURCE__REDEFINES, true)
										.getReferences();

									if (!redefinedFeatures
										.contains(eAllStructuralFeature)) {

										redefinedFeatures
											.add(eAllStructuralFeature);
									}
								} else if (OPTION__DISCARD.equals(options
									.get(OPTION__DUPLICATE_FEATURES))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.WARNING,
												UMLValidator.DIAGNOSTIC_SOURCE,
												DUPLICATE_FEATURE,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_UML22EcoreConverter_DiscardDuplicateFeature_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eStructuralFeature,
															eAllStructuralFeature)),
												new Object[]{eClass,
													eAllStructuralFeature}));
									}

									if (eStructuralFeature instanceof EReference) {
										EReference eOpposite = ((EReference) eStructuralFeature)
											.getEOpposite();

										if (eOpposite != null) {
											featuresToRemove.add(eOpposite);
										}
									}

									eStructuralFeatures.remove();
									break;
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__DUPLICATE_FEATURES))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.ERROR,
											UMLValidator.DIAGNOSTIC_SOURCE,
											DUPLICATE_FEATURE,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML22EcoreConverter_ReportDuplicateFeature_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														eStructuralFeature,
														eAllStructuralFeature)),
											new Object[]{eStructuralFeature,
												eAllStructuralFeature}));
								}
							}
						}
					}
				}
			}

			for (Iterator eStructuralFeatures = featuresToDuplicate.iterator(); eStructuralFeatures
				.hasNext();) {

				EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
					.next();

				getEAnnotation(eStructuralFeature.getEContainingClass(),
					ANNOTATION_SOURCE__DUPLICATES, true).getContents().add(
					eStructuralFeature);

				if (eStructuralFeature instanceof EReference) {
					EReference eOpposite = ((EReference) eStructuralFeature)
						.getEOpposite();

					if (eOpposite != null
						&& !featuresToDuplicate.contains(eOpposite)) {

						eOpposite.setEOpposite(null);

						if (((EReference) eStructuralFeature).isContainment()) {
							eOpposite.setChangeable(false);
							eOpposite.setTransient(true);
						}

						eOpposite.setVolatile(true);
					}
				}
			}

			for (Iterator eStructuralFeatures = featuresToRemove.iterator(); eStructuralFeatures
				.hasNext();) {

				EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
					.next();
				EClass eContainingClass = eStructuralFeature
					.getEContainingClass();

				if (eContainingClass != null) {
					eContainingClass.getEStructuralFeatures().remove(
						eStructuralFeature);
				}
			}
		}

		protected void processDuplicateFeatureInheritance(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator eModelElements = elementToEModelElementMap.values()
				.iterator(); eModelElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) eModelElements
					.next();

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					if (eClass.getESuperTypes().size() > 1) {
						Iterator eSuperTypes = eClass.getESuperTypes()
							.iterator();
						eSuperTypes.next();

						while (eSuperTypes.hasNext()) {
							EClass mixinEClass = (EClass) eSuperTypes.next();

							mixinEStructuralFeaturesLoop : for (Iterator mixinEStructuralFeatures = mixinEClass
								.getEAllStructuralFeatures().iterator(); mixinEStructuralFeatures
								.hasNext();) {

								EStructuralFeature mixinEStructuralFeature = (EStructuralFeature) mixinEStructuralFeatures
									.next();

								for (Iterator eStructuralFeatures = eClass
									.getEAllStructuralFeatures().iterator(); eStructuralFeatures
									.hasNext();) {

									EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
										.next();

									if (eStructuralFeature == mixinEStructuralFeature) {
										break;
									} else if (new NameMatcher(
										mixinEStructuralFeature)
										.matches(eStructuralFeature)) {

										if (OPTION__PROCESS
											.equals(options
												.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.INFO,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_FEATURE_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML22EcoreConverter_ProcessDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eStructuralFeature,
																	mixinEStructuralFeature)),
														new Object[]{eClass,
															eStructuralFeature,
															mixinEStructuralFeature}));
											}

											qualifyName(mixinEStructuralFeature);

											EList redefinedFeatures = getEAnnotation(
												mixinEStructuralFeature,
												ANNOTATION_SOURCE__REDEFINES,
												true).getReferences();

											if (!redefinedFeatures
												.contains(eStructuralFeature)) {

												redefinedFeatures
													.add(eStructuralFeature);
											}
										} else if (OPTION__DISCARD
											.equals(options
												.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))) {

											if (diagnostics != null) {
												diagnostics
													.add(new BasicDiagnostic(
														Diagnostic.WARNING,
														UMLValidator.DIAGNOSTIC_SOURCE,
														DUPLICATE_FEATURE_INHERITANCE,
														UMLPlugin.INSTANCE
															.getString(
																"_UI_UML22EcoreConverter_DiscardDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
																getMessageSubstitutions(
																	context,
																	eClass,
																	eStructuralFeature,
																	mixinEStructuralFeature)),
														new Object[]{eClass,
															eStructuralFeature,
															mixinEStructuralFeature}));
											}

											eSuperTypes.remove();
											break mixinEStructuralFeaturesLoop;
										} else if (OPTION__REPORT
											.equals(options
												.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))
											&& diagnostics != null) {

											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.ERROR,
													UMLValidator.DIAGNOSTIC_SOURCE,
													DUPLICATE_FEATURE_INHERITANCE,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_UML22EcoreConverter_ReportDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																eClass,
																eStructuralFeature,
																mixinEStructuralFeature)),
													new Object[]{eClass,
														eStructuralFeature,
														mixinEStructuralFeature}));
										}
									}
								}
							}
						}
					}
				}
			}
		}

		protected void processSuperClassOrder(Map options,
				DiagnosticChain diagnostics, Map context) {

			Comparator eClassComparator = new Comparator() {

				public int compare(Object object, Object otherObject) {
					EClass eClass = (EClass) object;
					EClass otherEClass = (EClass) otherObject;

					int eAllStructuralFeaturesSize = eClass
						.getEAllStructuralFeatures().size();
					int otherEAllStructuralFeaturesSize = otherEClass
						.getEAllStructuralFeatures().size();

					return eAllStructuralFeaturesSize < otherEAllStructuralFeaturesSize
						? 1
						: (otherEAllStructuralFeaturesSize < eAllStructuralFeaturesSize
							? -1
							: eClass.getName().compareTo(otherEClass.getName()));
				}
			};

			for (Iterator entries = elementToEModelElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				Object key = entry.getKey();
				Object value = entry.getValue();

				if (key instanceof Classifier && value instanceof EClass) {
					EClass eClass = (EClass) value;
					EList eSuperTypes = eClass.getESuperTypes();

					List extendSuperClasses = new ArrayList();
					List unspecifiedSuperClasses = new ArrayList();
					List mixinSuperClasses = new ArrayList();

					for (Iterator generalizations = ((Classifier) key)
						.getGeneralizations().iterator(); generalizations
						.hasNext();) {

						Generalization generalization = (Generalization) generalizations
							.next();
						Classifier general = generalization.getGeneral();

						if (general != null) {
							EModelElement eModelElement = (EModelElement) elementToEModelElementMap
								.get(general);

							if (eSuperTypes.contains(eModelElement)) {

								if (generalization.hasKeyword("extend")) { //$NON-NLS-1$
									extendSuperClasses.add(eModelElement);
								} else if (generalization.hasKeyword("mixin")) { //$NON-NLS-1$
									mixinSuperClasses.add(eModelElement);
								} else {
									unspecifiedSuperClasses.add(eModelElement);
								}
							}
						}

					}

					Collections.sort(extendSuperClasses, eClassComparator);
					Collections.sort(unspecifiedSuperClasses, eClassComparator);
					Collections.sort(mixinSuperClasses, eClassComparator);

					List superClasses = new UniqueEList(extendSuperClasses);
					superClasses.addAll(unspecifiedSuperClasses);
					superClasses.addAll(mixinSuperClasses);

					if (!superClasses.equals(eSuperTypes)) {

						if (OPTION__PROCESS.equals(options
							.get(OPTION__SUPER_CLASS_ORDER))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										SUPER_CLASS_ORDER,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML22EcoreConverter_ProcessSuperClassOrder_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eClass)),
										new Object[]{eClass}));
							}

							for (ListIterator sc = superClasses.listIterator(); sc
								.hasNext();) {

								Object superClass = sc.next();
								eSuperTypes
									.move(sc.previousIndex(), superClass);
							}
						}
						if (OPTION__REPORT.equals(options
							.get(OPTION__SUPER_CLASS_ORDER))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									SUPER_CLASS_ORDER,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_UML22EcoreConverter_ReportSuperClassOrder_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eClass)), new Object[]{eClass}));
						}
					}
				}
			}
		}

		protected void processOptions(Map options, DiagnosticChain diagnostics,
				Map context) {

			if (!OPTION__IGNORE
				.equals(options.get(OPTION__ECORE_TAGGED_VALUES))) {

				processEcoreTaggedValues(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__REDEFINING_OPERATIONS))) {

				processRedefiningOperations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__REDEFINING_PROPERTIES))) {

				processRedefiningProperties(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__SUBSETTING_PROPERTIES))) {

				processSubsettingProperties(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__DERIVED_FEATURES))) {
				processDerivedFeatures(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__UNION_PROPERTIES))) {
				processUnionProperties(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DUPLICATE_OPERATIONS))) {

				processDuplicateOperations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DUPLICATE_OPERATION_INHERITANCE))) {

				processDuplicateOperationInheritance(options, diagnostics,
					context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__DUPLICATE_FEATURES))) {
				processDuplicateFeatures(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DUPLICATE_FEATURE_INHERITANCE))) {

				processDuplicateFeatureInheritance(options, diagnostics,
					context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__SUPER_CLASS_ORDER))) {
				processSuperClassOrder(options, diagnostics, context);
			}
		}

		public Collection convert(Collection eObjects, Map options,
				DiagnosticChain diagnostics, Map context) {

			packages = EcoreUtil.getObjectsByType(eObjects,
				UMLPackage.Literals.PACKAGE);

			for (Iterator i = packages.iterator(); i.hasNext();) {
				doSwitch((org.eclipse.uml2.uml.Package) i.next());
			}

			if (options != null) {
				processOptions(options, diagnostics, context);
			}

			return getRootContainers(EcoreUtil.getObjectsByType(
				elementToEModelElementMap.values(), EcorePackage.eINSTANCE
					.getEPackage()));
		}

	}

	public static final String OPTION__DISCARD = "DISCARD"; //$NON-NLS-1$

	public static final String OPTION__IGNORE = "IGNORE"; //$NON-NLS-1$

	public static final String OPTION__PROCESS = "PROCESS"; //$NON-NLS-1$

	public static final String OPTION__REPORT = "REPORT"; //$NON-NLS-1$

	protected static final String ANNOTATION_SOURCE__DUPLICATES = "duplicates"; //$NON-NLS-1$

	protected static final String ANNOTATION_SOURCE__REDEFINES = "redefines"; //$NON-NLS-1$

	protected static final String ANNOTATION_SOURCE__SUBSETS = "subsets"; //$NON-NLS-1$

	protected static final String ANNOTATION_SOURCE__UNION = "union"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__ATTRIBUTE = "Attribute"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__ATTRIBUTE_WILDCARD = "AttributeWilcard"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__ELEMENT = "Element"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__ELEMENT_ONLY = "ElementOnly"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__ELEMENT_WILDCARD = "ElementWildcard"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__EMPTY = "Empty"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__GROUP = "Group"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__MIXED = "Mixed"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__NONE = "None"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__SIMPLE = "Simple"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__READ_ONLY = "ReadOnly"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__READ_ONLY_UNSETTABLE = "ReadOnlyUnsettable"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__READ_WRITE = "ReadWrite"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__READ_WRITE_UNSETTABLE = "ReadWriteUnsettable"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL_NAME__UNSPECIFIED = "Unspecified"; //$NON-NLS-1$

	protected static final String ENUMERATION_NAME__CONTENT_KIND = "ContentKind"; //$NON-NLS-1$

	protected static final String ENUMERATION_NAME__FEATURE_KIND = "FeatureKind"; //$NON-NLS-1$

	protected static final String ENUMERATION_NAME__VISIBILITY_KIND = "VisibilityKind"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__ATTRIBUTE_NAME = "attributeName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__BASE_PACKAGE = "basePackage"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__CLASS_NAME = "className"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__DATA_TYPE_NAME = "dataTypeName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__ENUM_NAME = "enumName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__ENUM_LITERAL_NAME = "enumLiteralName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__INSTANCE_CLASS_NAME = "instanceClassName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__IS_ID = "isID"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__IS_RESOLVE_PROXIES = "isResolveProxies"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__IS_TRANSIENT = "isTransient"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__IS_UNSETTABLE = "isUnsettable"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__IS_VOLATILE = "isVolatile"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__NS_PREFIX = "nsPrefix"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__NS_URI = "nsURI"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__OPERATION_NAME = "operationName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__PACKAGE_NAME = "packageName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__PARAMETER_NAME = "parameterName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__PREFIX = "prefix"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__REFERENCE_NAME = "referenceName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__VISIBILITY = "visibility"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__XML_CONTENT_KIND = "xmlContentKind"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__XML_FEATURE_KIND = "xmlFeatureKind"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__XML_NAME = "xmlName"; //$NON-NLS-1$

	protected static final String PROPERTY_NAME__XML_NAMESPACE = "xmlNamespace"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_ATTRIBUTE = "EAttribute"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_CLASS = "EClass"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_DATA_TYPE = "EDataType"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_ENUM = "EEnum"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_ENUM_LITERAL = "EEnumLiteral"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_OPERATION = "EOperation"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_PACKAGE = "EPackage"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_PARAMETER = "EParameter"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__E_REFERENCE = "EReference"; //$NON-NLS-1$

	public static String getQualifiedText(EObject eObject) {
		return getQualifiedText(eObject, QualifiedTextProvider.DEFAULT);
	}

	public static String getQualifiedText(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider) {

		return getQualifiedText(eObject, qualifiedTextProvider,
			new StringBuffer()).toString();
	}

	protected static StringBuffer getQualifiedText(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider,
			StringBuffer qualifiedText) {

		EObject eContainer = eObject == null
			? null
			: eObject.eContainer();

		if (eContainer != null) {
			getQualifiedText(eContainer, qualifiedTextProvider, qualifiedText);

			if (qualifiedText.length() > 0) {
				qualifiedText.append(qualifiedTextProvider.getSeparator());
			}
		}

		return getQualifiedTextSegment(eObject, qualifiedTextProvider,
			qualifiedText);
	}

	protected static StringBuffer getQualifiedTextSegment(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider,
			StringBuffer qualifiedText) {

		String text = qualifiedTextProvider.getText(eObject);

		if (!isEmpty(text)) {
			return qualifiedText.append(text);
		} else if (eObject == null) {
			return qualifiedText.append(String.valueOf(eObject));
		}

		qualifiedText.append('{');

		EStructuralFeature eContainingFeature = eObject.eContainingFeature();

		if (eContainingFeature != null) {
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

	protected static String getMessageSubstitution(Map context, Object object) {

		if (object instanceof EObject) {
			EObject eObject = (EObject) object;

			if (eObject instanceof NamedElement) {
				String qualifiedName = ((NamedElement) object)
					.getQualifiedName();

				if (!isEmpty(qualifiedName)) {
					return qualifiedName;
				}
			}

			if (context != null) {
				EValidator.SubstitutionLabelProvider substitutionLabelProvider = (EValidator.SubstitutionLabelProvider) context
					.get(EValidator.SubstitutionLabelProvider.class);

				if (substitutionLabelProvider != null) {
					return substitutionLabelProvider.getObjectLabel(eObject);
				}

				QualifiedTextProvider qualifiedTestProvider = (QualifiedTextProvider) context
					.get(QualifiedTextProvider.class);

				if (qualifiedTestProvider != null) {
					return getQualifiedText(eObject, qualifiedTestProvider);
				}
			}

			Resource resource = eObject.eResource();

			if (resource != null) {
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

	protected static Stereotype getStereotype(EObject stereotypeApplication) {
		EAnnotation eAnnotation = stereotypeApplication.eClass()
			.getEAnnotation(UMLPackage.eNS_URI);

		if (eAnnotation != null) {
			EList references = eAnnotation.getReferences();

			if (!references.isEmpty()) {
				Object reference = references.get(0);

				if (reference instanceof Stereotype) {
					return (Stereotype) reference;
				}
			}
		}

		return null;
	}

	protected static void safeApplyStereotype(Element element,
			Stereotype stereotype) {

		if (!element.isStereotypeApplied(stereotype)) {
			Profile profile = stereotype.getProfile();

			if (!element.getNearestPackage().getAllAppliedProfiles().contains(
				profile)) {

				element.getModel().applyProfile(profile);
			}

			element.applyStereotype(stereotype);
		}
	}

	protected static Property getTaggedValueDefinition(Stereotype stereotype,
			final String propertyName) {

		return (Property) findEObject(stereotype.getAllAttributes(),
			new EObjectMatcher() {

				public boolean matches(EObject eObject) {
					return safeEquals(((Property) eObject).getName(),
						propertyName);
				}
			});
	}

	protected static Object getTaggedValue(Element element,
			String qualifiedStereotypeName, String propertyName) {

		Stereotype stereotype = element
			.getAppliedStereotype(qualifiedStereotypeName);

		return stereotype == null
			? null
			: element.getValue(stereotype, propertyName);
	}

	protected static void setTaggedValue(Element element,
			Stereotype stereotype, String propertyName, Object value) {

		safeApplyStereotype(element, stereotype);

		element.setValue(stereotype, propertyName, value);
	}

}
