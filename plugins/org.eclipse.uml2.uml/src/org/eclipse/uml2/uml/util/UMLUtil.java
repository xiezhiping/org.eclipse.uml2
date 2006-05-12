/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLUtil.java,v 1.30 2006/05/12 20:41:28 khussey Exp $
 */
package org.eclipse.uml2.uml.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UMLUtil
		extends UML2Util {

	public static class QualifiedTextProvider
			extends UML2Util.QualifiedTextProvider {

		public static final QualifiedTextProvider DEFAULT = new QualifiedTextProvider();

		public String getText(EObject eObject) {

			return eObject instanceof NamedElement
				? ((NamedElement) eObject).getName()
				: super.getText(eObject);
		}

		public String getSeparator() {
			return NamedElement.SEPARATOR;
		}

	}

	public static class PackageMerger
			extends EcoreUtil.Copier {

		protected class BodyMatcher
				extends EClassMatcher {

			protected BodyMatcher(Comment comment) {
				super(comment);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((eObject == null && otherEObject == null) || safeEquals(
						((Comment) eObject).getBody(), ((Comment) otherEObject)
							.getBody()));
			}
		}

		protected class NameMatcher
				extends EClassMatcher {

			protected NameMatcher(NamedElement namedElement) {
				super(namedElement);
			}

			public boolean matches(EObject otherEObject) {

				return super.matches(otherEObject)
					&& ((eObject == null && otherEObject == null) || safeEquals(
						((NamedElement) eObject).getName(),
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
					&& ((eObject == null && otherEObject == null) || safeEquals(
						((BasicEMap.Entry) eObject).getKey(),
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
					&& ((eObject == null && otherEObject == null) || getResultingQName(
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
					&& ((eObject == null && otherEObject == null) || safeEquals(
						((ValueSpecification) eObject).stringValue(),
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
					&& ((eObject == null && otherEObject == null) || safeEquals(
						((EAnnotation) eObject).getSource(),
						((EAnnotation) otherEObject).getSource()));
			}
		}

		protected class TypeMatcher
				extends NameMatcher {

			protected TypeMatcher(TypedElement typedElement) {
				super(typedElement);
			}

			public boolean matches(EObject otherEObject) {

				if (super.matches(otherEObject)) {

					if (eObject == null && otherEObject == null) {
						return true;
					} else {
						Type type = ((TypedElement) eObject).getType();
						Type otherType = ((TypedElement) otherEObject)
							.getType();

						return new ResultingQNameMatcher(type)
							.matches(otherType)
							|| (type instanceof Classifier
								&& otherType instanceof Classifier && (findEObject(
								((Classifier) type).allParents(),
								new ResultingQNameMatcher(otherType)) != null || findEObject(
								((Classifier) otherType).allParents(),
								new ResultingQNameMatcher(type)) != null));
					}
				}

				return false;
			}
		}

		private static final boolean DEBUG = false;

		public static final String OPTION__DIFFERENT_PROPERTY_STATICITY = "DIFFERENT_PROPERTY_STATICITY"; //$NON-NLS-1$

		public static final String OPTION__DIFFERENT_PROPERTY_UNIQUENESS = "DIFFERENT_PROPERTY_UNIQUENESS"; //$NON-NLS-1$

		public static final String OPTION__REDUNDANT_GENERALIZATIONS = "REDUNDANT_GENERALIZATIONS"; //$NON-NLS-1$

		public static final String OPTION__IMPLICIT_REDEFINITIONS = "IMPLICIT_REDEFINITIONS"; //$NON-NLS-1$

		public static final String OPTION__INVALID_REDEFINITIONS = "INVALID_REDEFINITIONS"; //$NON-NLS-1$

		public static final String OPTION__INVALID_SUBSETS = "INVALID_SUBSETS"; //$NON-NLS-1$

		public static final String OPTION__EMPTY_UNIONS = "EMPTY_UNIONS"; //$NON-NLS-1$

		public static final String OPTION__ASSOCIATION_SPECIALIZATIONS = "ASSOCIATION_SPECIALIZATIONS"; //$NON-NLS-1$

		public static final String OPTION__CAPABILITIES = "CAPABILITIES"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 1000;

		public static final int DIFFERENT_PROPERTY_STATICITY = DIAGNOSTIC_CODE_OFFSET + 1;

		public static final int DIFFERENT_PROPERTY_UNIQUENESS = DIAGNOSTIC_CODE_OFFSET + 2;

		public static final int REDUNDANT_GENERALIZATION = DIAGNOSTIC_CODE_OFFSET + 3;

		public static final int IMPLICIT_REDEFINITION = DIAGNOSTIC_CODE_OFFSET + 4;

		public static final int INVALID_REDEFINITION = DIAGNOSTIC_CODE_OFFSET + 5;

		public static final int INVALID_SUBSET = DIAGNOSTIC_CODE_OFFSET + 6;

		public static final int EMPTY_UNION = DIAGNOSTIC_CODE_OFFSET + 7;

		public static final int ASSOCIATION_SPECIALIZATION = DIAGNOSTIC_CODE_OFFSET + 8;

		public static final int CAPABILITY = DIAGNOSTIC_CODE_OFFSET + 9;

		protected static final String ANNOTATION_SOURCE__CAPABILITIES = "capabilities"; //$NON-NLS-1$

		protected org.eclipse.uml2.uml.Package receivingPackage = null;

		protected Collection mergedPackages = null;

		protected final Map resultingToMergedEObjectMap = new HashMap();

		protected List getMatchCandidates(EObject eObject) {
			Element baseElement = getBaseElement(eObject);

			if (baseElement == null) {
				EStructuralFeature eContainingFeature = eObject
					.eContainingFeature();

				return eContainingFeature.isMany()
					? (List) ((EObject) get(eObject.eContainer()))
						.eGet(eContainingFeature)
					: Collections.singletonList(((EObject) get(eObject
						.eContainer())).eGet(eContainingFeature));
			} else {
				return ((Element) get(baseElement)).getStereotypeApplications();
			}
		}

		protected List getMergedEObjects(EObject resultingEObject) {
			Object mergedEObjects = resultingToMergedEObjectMap
				.get(resultingEObject);

			return mergedEObjects == null
				? Collections.singletonList(resultingEObject)
				: (List) mergedEObjects;
		}

		protected EObject getPreviouslyMergedEObject(EObject resultingEObject) {
			List mergedEObjects = getMergedEObjects(resultingEObject);

			return (EObject) mergedEObjects.get(mergedEObjects.size() - 1);
		}

		protected String getResultingQName(EObject eObject) {
			StringBuffer resultingQName = appendResultingQName(
				new StringBuffer(), eObject, QualifiedTextProvider.DEFAULT);

			return resultingQName.toString();
		}

		private StringBuffer appendResultingQName(StringBuffer resultingQName,
				EObject eObject, QualifiedTextProvider qualifiedTextProvider) {
			eObject = mergedPackages.contains(eObject)
				? receivingPackage
				: eObject;

			EObject eContainer = eObject.eContainer();

			if (eContainer != null) {
				appendResultingQName(resultingQName, eContainer,
					qualifiedTextProvider);

				if (resultingQName.length() > 0) {
					resultingQName.append(qualifiedTextProvider.getSeparator());
				}
			}

			return getQualifiedTextSegment(eObject, qualifiedTextProvider,
				resultingQName);
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
			receivingLiteralInteger.setValue(getLesserLowerBound(
				receivingLiteralInteger.getValue(), mergedLiteralInteger
					.getValue()));
		}

		protected void mergeLiteralUnlimitedNatural_Value(
				LiteralUnlimitedNatural receivingLiteralUnlimitedNatural,
				LiteralUnlimitedNatural mergedLiteralUnlimitedNatural) {
			receivingLiteralUnlimitedNatural.setValue(getGreaterUpperBound(
				receivingLiteralUnlimitedNatural.getValue(),
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
				.setVisibility(receivingNamedElement.getVisibility() == VisibilityKind.PRIVATE_LITERAL
					&& mergedNamedElement.getVisibility() == VisibilityKind.PRIVATE_LITERAL
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

			if (eObject != copyEObject) {

				if (copyEObject == receivingPackage) {
					return;
				} else if (resultingToMergedEObjectMap.containsKey(copyEObject)) {

					if (eAttribute == UMLPackage.Literals.ASSOCIATION__IS_DERIVED) {
						mergeAssociation_IsDerived((Association) copyEObject,
							(Association) eObject);
					} else if (eAttribute == UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT) {
						mergeClassifier_IsAbstract((Classifier) copyEObject,
							(Classifier) eObject);
					} else if (eAttribute == UMLPackage.Literals.LITERAL_INTEGER__VALUE
						&& copyEObject.eContainingFeature() == UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE) {

						mergeLiteralInteger_Value((LiteralInteger) copyEObject,
							(LiteralInteger) eObject);
					} else if (eAttribute == UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL__VALUE
						&& copyEObject.eContainingFeature() == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE) {

						mergeLiteralUnlimitedNatural_Value(
							(LiteralUnlimitedNatural) copyEObject,
							(LiteralUnlimitedNatural) eObject);
					} else if (eAttribute == UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED) {
						mergeMultiplicityElement_IsOrdered(
							(MultiplicityElement) copyEObject,
							(MultiplicityElement) eObject);
					} else if (eAttribute == UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE) {
						mergeMultiplicityElement_IsUnique(
							(MultiplicityElement) copyEObject,
							(MultiplicityElement) eObject);
					} else if (eAttribute == UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY) {
						mergeNamedElement_Visibility(
							(NamedElement) copyEObject, (NamedElement) eObject);
					} else if (eAttribute == UMLPackage.Literals.PROPERTY__IS_DERIVED) {
						mergeProperty_IsDerived((Property) copyEObject,
							(Property) eObject);
					} else if (eAttribute == UMLPackage.Literals.PROPERTY__IS_DERIVED_UNION) {
						mergeProperty_IsDerivedUnion((Property) copyEObject,
							(Property) eObject);
					} else if (eAttribute == UMLPackage.Literals.STRUCTURAL_FEATURE__IS_READ_ONLY) {
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
		}

		protected void copyContainment(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject != copyEObject) {

				if (eReference.isMany()) {
					InternalEList targetList = (InternalEList) copyEObject
						.eGet(getTarget(eReference));

					for (Iterator i = ((List) eObject.eGet(eReference))
						.iterator(); i.hasNext();) {

						EObject childEObject = (EObject) i.next();
						EObject copyChildEObject = copy(childEObject);

						if (childEObject != copyChildEObject) {
							targetList.addUnique(copyChildEObject);
						}
					}
				} else {
					EObject childEObject = (EObject) eObject.eGet(eReference);
					EObject copyChildEObject = childEObject == null
						? null
						: copy(childEObject);

					if (childEObject != copyChildEObject) {
						copyEObject.eSet(getTarget(eReference),
							copyChildEObject);
					}
				}
			}
		}

		protected void mergeTypedElement_Type(
				TypedElement receivingTypedElement,
				TypedElement mergedTypedElement) {
			Type receivingType = receivingTypedElement.getType();
			Type mergedType = mergedTypedElement.getType();

			if (receivingType != null && mergedType instanceof Classifier) {
				EList allParents = ((Classifier) mergedType).allParents();

				for (Iterator mergedEObjects = getMergedEObjects(receivingType)
					.iterator(); mergedEObjects.hasNext();) {

					EObject mergedEObject = (EObject) mergedEObjects.next();

					if (findEObject(allParents, new ResultingQNameMatcher(
						mergedEObject)) != null) {

						mergedType = (Type) mergedEObject;
					}
				}
			}

			Type resultingType = mergedType == null
				? null
				: (Type) get(mergedType);

			receivingTypedElement.setType(resultingType == null
				? mergedType
				: resultingType);
		}

		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject != copyEObject && eObject.eIsSet(eReference)) {

				if (eReference == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {
					mergeTypedElement_Type((TypedElement) copyEObject,
						(TypedElement) eObject);
				} else if (eReference.isMany()) {
					InternalEList targetList = (InternalEList) copyEObject
						.eGet(getTarget(eReference));

					boolean isBidirectional = eReference.getEOpposite() != null;
					int index = 0;

					for (Iterator i = ((List) eObject.eGet(eReference))
						.iterator(); i.hasNext();) {

						Object referencedEObject = i.next();
						Object copyReferencedEObject = get(referencedEObject);

						if (copyReferencedEObject == null) {

							if (!isBidirectional
								&& !targetList.contains(referencedEObject)) {

								targetList
									.addUnique(index++, referencedEObject);
							}
						} else {

							if (isBidirectional) {
								int position = targetList
									.indexOf(copyReferencedEObject);

								if (position == -1) {
									targetList.addUnique(index++,
										copyReferencedEObject);
								} else if (index != position) {
									targetList.move(index < targetList.size()
										? index++
										: --index, copyReferencedEObject);
								}
							} else if (!targetList
								.contains(copyReferencedEObject)) {

								targetList.addUnique(index++,
									copyReferencedEObject);
							}
						}
					}
				} else {
					super.copyReference(eReference, eObject, copyEObject);
				}
			}
		}

		protected EObject createCopy(EObject eObject) {
			return (EObject) new UMLSwitch() {

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

											if (findEObject(otherMemberEnds,
												new TypeMatcher(
													(TypedElement) i.next())) == null) {

												return false;
											}
										}

										return true;
									}

								}

								return false;
							}
						});

					return matchingAssociation == null
						? super.caseAssociation(association)
						: matchingAssociation;
				}

				public Object caseClass(org.eclipse.uml2.uml.Class class_) {
					org.eclipse.uml2.uml.Class matchingClass = (org.eclipse.uml2.uml.Class) findEObject(
						getMatchCandidates(class_), new NameMatcher(class_));

					return matchingClass == null
						? super.caseClass(class_)
						: matchingClass;
				}

				public Object caseComment(Comment comment) {
					Comment matchingComment = (Comment) findEObject(
						getMatchCandidates(comment), new BodyMatcher(comment));

					return matchingComment == null
						? super.caseComment(comment)
						: matchingComment;
				}

				public Object caseConstraint(Constraint constraint) {
					Constraint matchingConstraint = (Constraint) findEObject(
						getMatchCandidates(constraint), new NameMatcher(
							constraint));

					return matchingConstraint == null
						? super.caseConstraint(constraint)
						: matchingConstraint;
				}

				public Object caseDataType(DataType dataType) {
					DataType matchingDataType = (DataType) findEObject(
						getMatchCandidates(dataType), new NameMatcher(dataType));

					return matchingDataType == null
						? super.caseDataType(dataType)
						: matchingDataType;
				}

				public Object caseDirectedRelationship(
						DirectedRelationship directedRelationship) {

					if (mergedPackages.containsAll(directedRelationship
						.getTargets())) {

						return directedRelationship;
					}

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

											if (findEObject(otherTargets,
												new ResultingQNameMatcher(
													(EObject) i.next())) == null) {

												return false;
											}
										}

										return true;
									}
								}

								return false;
							}
						});

					return matchingDirectedRelationship == null
						? super.caseDirectedRelationship(directedRelationship)
						: matchingDirectedRelationship;
				}

				public Object caseEnumerationLiteral(
						EnumerationLiteral enumerationLiteral) {
					EnumerationLiteral matchingEnumerationLiteral = (EnumerationLiteral) findEObject(
						getMatchCandidates(enumerationLiteral),
						new NameMatcher(enumerationLiteral));

					return matchingEnumerationLiteral == null
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

					return matchingOperation == null
						? super.caseOperation(operation)
						: matchingOperation;
				}

				public Object casePackage(org.eclipse.uml2.uml.Package package_) {
					org.eclipse.uml2.uml.Package matchingPackage = null;

					if (mergedPackages.contains(package_)) {
						matchingPackage = receivingPackage;
					} else {
						matchingPackage = (org.eclipse.uml2.uml.Package) findEObject(
							getMatchCandidates(package_), new NameMatcher(
								package_));
					}

					return matchingPackage == null
						? super.casePackage(package_)
						: matchingPackage;
				}

				public Object caseParameter(Parameter parameter) {
					Parameter matchingParameter = (Parameter) findEObject(
						getMatchCandidates(parameter), new NameMatcher(
							parameter));

					return matchingParameter == null
						? super.caseParameter(parameter)
						: matchingParameter;
				}

				public Object caseProperty(Property property) {
					Property matchingProperty = (Property) findEObject(
						getMatchCandidates(property), new NameMatcher(property));

					return matchingProperty == null
						? super.caseProperty(property)
						: matchingProperty;
				}

				public Object defaultCase(EObject eObject) {
					Element baseElement = getBaseElement(eObject);

					return baseElement == null
						? PackageMerger.super.createCopy(eObject)
						: applyStereotype((Element) get(baseElement),
							getTarget(eObject.eClass()));
				}

				protected Object doSwitch(EClass theEClass, EObject theEObject) {

					if (theEClass.eContainer() != modelPackage) {

						if (theEClass == EcorePackage.Literals.EANNOTATION) {
							EAnnotation matchingEAnnotation = (EAnnotation) findEObject(
								getMatchCandidates(theEObject),
								new SourceMatcher((EAnnotation) theEObject));

							if (matchingEAnnotation != null) {
								return matchingEAnnotation;
							}
						} else if (theEClass == EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY) {
							BasicEMap.Entry matchingEntry = (BasicEMap.Entry) findEObject(
								getMatchCandidates(theEObject), new KeyMatcher(
									(BasicEMap.Entry) theEObject));

							if (matchingEntry != null) {
								return matchingEntry;
							}
						} else if (getStereotype(theEClass) != null) {
							EObject matchingEObject = findEObject(
								getMatchCandidates(theEObject),
								new EClassMatcher(theEObject));

							if (matchingEObject != null) {
								return matchingEObject;
							}
						}
					}

					return super.doSwitch(theEClass, theEObject);
				}
			}.doSwitch(eObject);
		}

		public EObject copy(EObject eObject) {
			EObject copyEObject = super.copy(eObject);

			if (eObject != copyEObject) {
				List mergedEObjects = (List) resultingToMergedEObjectMap
					.get(copyEObject);

				if (mergedEObjects == null) {
					resultingToMergedEObjectMap.put(copyEObject,
						mergedEObjects = new UniqueEList.FastCompare(1));
				}

				mergedEObjects.add(eObject);
			}

			if (DEBUG) {
				System.out.println(getQualifiedText(eObject) + "->" //$NON-NLS-1$
					+ getQualifiedText(copyEObject));
			}

			return copyEObject;
		}

		public Collection copyAll(Collection eObjects) {
			Collection result = new ArrayList(eObjects.size());

			for (Iterator o = eObjects.iterator(); o.hasNext();) {
				EObject eObject = (EObject) o.next();
				result.add(copy(eObject));

				for (Iterator eAllContents = eObject.eAllContents(); eAllContents
					.hasNext();) {

					EObject childEObject = (EObject) eAllContents.next();

					if (childEObject instanceof Element) {
						result.addAll(super.copyAll(((Element) childEObject)
							.getStereotypeApplications()));
					}
				}
			}

			return result;
		}

		protected Collection getAllMergedPackages(
				org.eclipse.uml2.uml.Package package_) {
			return getAllMergedPackages(package_, new UniqueEList.FastCompare());
		}

		private Collection getAllMergedPackages(
				org.eclipse.uml2.uml.Package package_,
				Collection allMergedPackages) {

			for (Iterator packageMerges = package_.getPackageMerges()
				.iterator(); packageMerges.hasNext();) {

				org.eclipse.uml2.uml.Package mergedPackage = ((PackageMerge) packageMerges
					.next()).getMergedPackage();

				if (mergedPackage != null) {
					getAllMergedPackages(mergedPackage, allMergedPackages);

					allMergedPackages.add(mergedPackage);
				}
			}

			return allMergedPackages;
		}

		protected void processDifferentPropertyStaticity(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = resultingToMergedEObjectMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				Object key = entry.getKey();

				if (key instanceof Property) {
					Property property = (Property) key;

					for (Iterator mergedProperties = ((List) entry.getValue())
						.iterator(); mergedProperties.hasNext();) {

						Property mergedProperty = (Property) mergedProperties
							.next();

						if (OPTION__REPORT.equals(options
							.get(OPTION__DIFFERENT_PROPERTY_STATICITY))
							&& diagnostics != null) {

							if (property.isStatic() != mergedProperty
								.isStatic()) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										UMLValidator.DIAGNOSTIC_SOURCE,
										DIFFERENT_PROPERTY_STATICITY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportDifferentPropertyStaticity_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, property,
													mergedProperty)),
										new Object[]{property, mergedProperty}));
							}
						}
					}
				}
			}
		}

		protected void processDifferentPropertyUniqueness(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = resultingToMergedEObjectMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				Object key = entry.getKey();

				if (key instanceof Property) {
					Property property = (Property) key;

					for (Iterator mergedProperties = ((List) entry.getValue())
						.iterator(); mergedProperties.hasNext();) {

						Property mergedProperty = (Property) mergedProperties
							.next();

						if (OPTION__REPORT.equals(options
							.get(OPTION__DIFFERENT_PROPERTY_UNIQUENESS))
							&& diagnostics != null) {

							if (property.isUnique() != mergedProperty
								.isUnique()) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										UMLValidator.DIAGNOSTIC_SOURCE,
										DIFFERENT_PROPERTY_UNIQUENESS,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportDifferentPropertyUniqueness_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, property,
													mergedProperty)),
										new Object[]{property, mergedProperty}));
							}
						}
					}
				}
			}
		}

		protected void processImplicitRedefinitions(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator resultingEObjects = resultingToMergedEObjectMap
				.keySet().iterator(); resultingEObjects.hasNext();) {

				EObject resultingEObject = (EObject) resultingEObjects.next();

				if (resultingEObject instanceof Feature) {
					Feature redefiningFeature = (Feature) resultingEObject;
					List redefinedFeatures = getRedefinedFeatures(redefiningFeature);

					for (Iterator validRedefinitions = findValidRedefinitions(
						redefiningFeature, redefiningFeature.getName())
						.iterator(); validRedefinitions.hasNext();) {

						Feature redefinedFeature = (Feature) validRedefinitions
							.next();

						if (!redefinedFeatures.contains(redefinedFeature)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__IMPLICIT_REDEFINITIONS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											IMPLICIT_REDEFINITION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_ProcessImplicitFeatureRedefinition_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														redefiningFeature,
														redefinedFeature)),
											new Object[]{redefiningFeature,
												redefinedFeature}));
								}

								redefinedFeatures.add(redefinedFeature);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__IMPLICIT_REDEFINITIONS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										IMPLICIT_REDEFINITION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportImplicitFeatureRedefinition_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, redefiningFeature,
													redefinedFeature)),
										new Object[]{redefiningFeature,
											redefinedFeature}));
							}
						}
					}
				}
			}
		}

		protected void processInvalidRedefinitions(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator resultingEObjects = resultingToMergedEObjectMap
				.keySet().iterator(); resultingEObjects.hasNext();) {

				EObject resultingEObject = (EObject) resultingEObjects.next();

				if (resultingEObject instanceof Feature) {
					Feature redefiningFeature = (Feature) resultingEObject;
					List redefinedFeatures = getRedefinedFeatures(redefiningFeature);

					for (Iterator i = new ArrayList(redefinedFeatures)
						.iterator(); i.hasNext();) {

						Feature redefinedFeature = (Feature) i.next();

						if (!UMLUtil.isRedefinitionValid(redefiningFeature,
							redefinedFeature)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__INVALID_REDEFINITIONS))
								|| OPTION__DISCARD.equals(options
									.get(OPTION__INVALID_REDEFINITIONS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											INVALID_REDEFINITION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_DiscardInvalidFeatureRedefinition_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														redefiningFeature,
														redefinedFeature)),
											new Object[]{redefiningFeature,
												redefinedFeature}));
								}

								redefinedFeatures.remove(redefinedFeature);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__INVALID_REDEFINITIONS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										INVALID_REDEFINITION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportInvalidFeatureRedefinition_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, redefiningFeature,
													redefinedFeature)),
										new Object[]{redefiningFeature,
											redefinedFeature}));
							}
						}

						if (OPTION__PROCESS.equals(options
							.get(OPTION__INVALID_REDEFINITIONS))) {

							Collection validRedefinitions = findValidRedefinitions(
								redefiningFeature, redefinedFeature.getName());

							if (!validRedefinitions.isEmpty()) {

								for (Iterator j = validRedefinitions.iterator(); j
									.hasNext();) {

									Feature validRedefinition = (Feature) j
										.next();

									if (!redefinedFeatures
										.contains(validRedefinition)) {

										if (diagnostics != null) {
											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.INFO,
													UMLValidator.DIAGNOSTIC_SOURCE,
													INVALID_REDEFINITION,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_PackageMerger_ProcessInvalidRedefinition_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																redefiningFeature,
																redefinedFeature,
																validRedefinition)),
													new Object[]{
														redefiningFeature,
														validRedefinition}));
										}

										redefinedFeatures
											.add(validRedefinition);
									}
								}

								if (!validRedefinitions
									.contains(redefinedFeature)) {

									redefinedFeatures.remove(redefinedFeature);
								}
							}
						}
					}
				}
			}
		}

		protected void processInvalidSubsets(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator resultingEObjects = resultingToMergedEObjectMap
				.keySet().iterator(); resultingEObjects.hasNext();) {

				EObject resultingEObject = (EObject) resultingEObjects.next();

				if (resultingEObject instanceof Property) {
					Property subsettingProperty = (Property) resultingEObject;
					List subsettedProperties = subsettingProperty
						.getSubsettedProperties();

					for (Iterator i = new ArrayList(subsettedProperties)
						.iterator(); i.hasNext();) {

						Property subsettedProperty = (Property) i.next();

						if (!UMLUtil.isSubsetValid(subsettingProperty,
							subsettedProperty)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__INVALID_SUBSETS))
								|| OPTION__DISCARD.equals(options
									.get(OPTION__INVALID_SUBSETS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											INVALID_SUBSET,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_DiscardInvalidSubset_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context,
														subsettingProperty,
														subsettedProperty)),
											new Object[]{subsettingProperty,
												subsettedProperty}));
								}

								subsettedProperties.remove(subsettedProperty);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__INVALID_SUBSETS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										INVALID_SUBSET,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportInvalidSubset_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context,
													subsettingProperty,
													subsettedProperty)),
										new Object[]{subsettingProperty,
											subsettedProperty}));
							}
						}

						if (OPTION__PROCESS.equals(options
							.get(OPTION__INVALID_SUBSETS))) {

							Collection validSubsets = findValidSubsets(
								subsettingProperty, subsettedProperty.getName());

							if (!validSubsets.isEmpty()) {

								for (Iterator j = validSubsets.iterator(); j
									.hasNext();) {

									Property validSubset = (Property) j.next();

									if (!subsettedProperties
										.contains(validSubset)) {

										if (diagnostics != null) {
											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.INFO,
													UMLValidator.DIAGNOSTIC_SOURCE,
													INVALID_SUBSET,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_PackageMerger_ProcessInvalidSubset_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																subsettingProperty,
																subsettedProperty,
																validSubset)),
													new Object[]{
														subsettingProperty,
														validSubset}));
										}

										subsettedProperties.add(validSubset);
									}
								}

								if (!validSubsets.contains(subsettedProperty)) {
									subsettedProperties
										.remove(subsettedProperty);
								}
							}
						}
					}
				}
			}
		}

		protected void processEmptyUnions(Map options,
				DiagnosticChain diagnostics, Map context) {
			Map unionToSubsettingPropertyMap = new HashMap();

			for (Iterator resultingEObjects = resultingToMergedEObjectMap
				.keySet().iterator(); resultingEObjects.hasNext();) {

				EObject resultingEObject = (EObject) resultingEObjects.next();

				if (resultingEObject instanceof Property) {
					Property property = (Property) resultingEObject;

					if (property.isDerivedUnion()
						&& !unionToSubsettingPropertyMap.containsKey(property)) {

						unionToSubsettingPropertyMap.put(property,
							new HashSet());
					}

					for (Iterator subsettedProperties = property
						.getSubsettedProperties().iterator(); subsettedProperties
						.hasNext();) {

						Property subsettedProperty = (Property) subsettedProperties
							.next();

						if (subsettedProperty.isDerivedUnion()) {
							Set subsettingProperties = (Set) unionToSubsettingPropertyMap
								.get(subsettedProperty);

							if (subsettingProperties == null) {
								unionToSubsettingPropertyMap.put(
									subsettedProperty,
									subsettingProperties = new HashSet());
							}

							subsettingProperties.add(property);
						}
					}
				}
			}

			for (Iterator entries = unionToSubsettingPropertyMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();

				if (((Set) entry.getValue()).isEmpty()) {
					Property unionProperty = (Property) entry.getKey();

					if (OPTION__PROCESS.equals(options
						.get(OPTION__EMPTY_UNIONS))) {

						if (diagnostics != null) {
							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.INFO,
									UMLValidator.DIAGNOSTIC_SOURCE,
									EMPTY_UNION,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_PackageMerger_ProcessEmptyUnion_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												unionProperty)),
									new Object[]{unionProperty}));
						}

						unionProperty.setIsDerivedUnion(false);
					} else if (OPTION__REPORT.equals(options
						.get(OPTION__EMPTY_UNIONS))
						&& diagnostics != null) {

						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								EMPTY_UNION,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_PackageMerger_ReportEmptyUnion_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											unionProperty)),
								new Object[]{unionProperty}));
					}
				}
			}
		}

		protected void processRedundantGeneralizations(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator resultingEObjects = resultingToMergedEObjectMap
				.keySet().iterator(); resultingEObjects.hasNext();) {

				EObject resultingEObject = (EObject) resultingEObjects.next();

				if (resultingEObject instanceof Classifier) {
					Classifier classifier = (Classifier) resultingEObject;
					EList generalizations = classifier.getGeneralizations();

					for (Iterator i = new ArrayList(generalizations).iterator(); i
						.hasNext();) {

						Classifier general = ((Generalization) i.next())
							.getGeneral();

						if (general != null) {
							EList generalAllParents = general.allParents();

							for (Iterator j = generalizations.iterator(); j
								.hasNext();) {

								Generalization otherGeneralization = (Generalization) j
									.next();
								Classifier otherGeneral = otherGeneralization
									.getGeneral();

								if (general != otherGeneral
									&& generalAllParents.contains(otherGeneral)
									&& !otherGeneralization
										.hasKeyword("extend")) { //$NON-NLS-1$

									if (OPTION__DISCARD
										.equals(options
											.get(OPTION__REDUNDANT_GENERALIZATIONS))) {

										if (diagnostics != null) {
											diagnostics
												.add(new BasicDiagnostic(
													Diagnostic.INFO,
													UMLValidator.DIAGNOSTIC_SOURCE,
													REDUNDANT_GENERALIZATION,
													UMLPlugin.INSTANCE
														.getString(
															"_UI_PackageMerger_DiscardRedundantGeneralization_diagnostic", //$NON-NLS-1$
															getMessageSubstitutions(
																context,
																classifier,
																otherGeneral,
																general)),
													new Object[]{classifier,
														otherGeneral}));
										}

										j.remove();
									} else if (OPTION__REPORT
										.equals(options
											.get(OPTION__REDUNDANT_GENERALIZATIONS))
										&& diagnostics != null) {

										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.WARNING,
												UMLValidator.DIAGNOSTIC_SOURCE,
												REDUNDANT_GENERALIZATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_PackageMerger_ReportRedundantGeneralization_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															classifier,
															otherGeneral,
															general)),
												new Object[]{classifier,
													otherGeneral}));
									}

									break;
								}
							}
						}
					}
				}
			}
		}

		protected void processAssociationSpecializations(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = resultingToMergedEObjectMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				EObject resultingEObject = (EObject) entry.getKey();

				if (resultingEObject instanceof Association) {
					Association association = (Association) resultingEObject;

					List generalAssociations = new UniqueEList.FastCompare();

					for (Iterator memberEnds = association.getMemberEnds()
						.iterator(); memberEnds.hasNext();) {

						Property memberEnd = (Property) memberEnds.next();

						for (Iterator redefinedProperties = memberEnd
							.getRedefinedProperties().iterator(); redefinedProperties
							.hasNext();) {

							Association redefinedAssociation = ((Property) redefinedProperties
								.next()).getAssociation();

							if (redefinedAssociation != null) {
								generalAssociations.add(redefinedAssociation);
							}
						}

						for (Iterator subsettedProperties = memberEnd
							.getSubsettedProperties().iterator(); subsettedProperties
							.hasNext();) {

							Association subsettedAssociation = ((Property) subsettedProperties
								.next()).getAssociation();

							if (subsettedAssociation != null) {
								generalAssociations.add(subsettedAssociation);
							}
						}
					}

					for (Iterator i = generalAssociations.iterator(); i
						.hasNext();) {

						Association generalAssocation = (Association) i.next();

						if (!association.allParents().contains(
							generalAssocation)) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__ASSOCIATION_SPECIALIZATIONS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											ASSOCIATION_SPECIALIZATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_PackageMerger_ProcessAssociationSpecialization_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, association,
														generalAssocation)),
											new Object[]{association,
												generalAssocation}));
								}

								association
									.createGeneralization(generalAssocation);
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__ASSOCIATION_SPECIALIZATIONS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										ASSOCIATION_SPECIALIZATION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ReportAssociationSpecialization_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, association,
													generalAssocation)),
										new Object[]{association,
											generalAssocation}));
							}
						}
					}
				}
			}
		}

		protected void processCapabilities(Map options,
				DiagnosticChain diagnostics, Map context) {

			for (Iterator entries = resultingToMergedEObjectMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				EObject resultingEObject = (EObject) entry.getKey();

				if (resultingEObject instanceof RedefinableElement) {
					org.eclipse.uml2.uml.Package resultingPackage = ((RedefinableElement) resultingEObject)
						.getNearestPackage();

					for (Iterator mergedEObjects = ((List) entry.getValue())
						.iterator(); mergedEObjects.hasNext();) {

						org.eclipse.uml2.uml.Package mergedPackage = ((Element) mergedEObjects
							.next()).getNearestPackage();

						if (OPTION__PROCESS.equals(options
							.get(OPTION__CAPABILITIES))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										CAPABILITY,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_PackageMerger_ProcessCapability_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, resultingEObject,
													mergedPackage)),
										new Object[]{resultingEObject,
											mergedPackage}));
							}

							getEAnnotation(
								getEAnnotation(resultingPackage,
									ANNOTATION_SOURCE__CAPABILITIES, true),
								mergedPackage.getQualifiedName(), true)
								.getReferences().add(resultingEObject);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__CAPABILITIES))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									CAPABILITY,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_PackageMerger_ReportCapability_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												resultingEObject, mergedPackage)),
									new Object[]{resultingEObject,
										mergedPackage}));
						}
					}
				}
			}
		}

		protected void processOptions(Map options, DiagnosticChain diagnostics,
				Map context) {

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DIFFERENT_PROPERTY_STATICITY))) {

				processDifferentPropertyStaticity(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__DIFFERENT_PROPERTY_UNIQUENESS))) {

				processDifferentPropertyUniqueness(options, diagnostics,
					context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__IMPLICIT_REDEFINITIONS))) {

				processImplicitRedefinitions(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__INVALID_REDEFINITIONS))) {

				processInvalidRedefinitions(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__INVALID_SUBSETS))) {
				processInvalidSubsets(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__EMPTY_UNIONS))) {
				processEmptyUnions(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__ASSOCIATION_SPECIALIZATIONS))) {

				processAssociationSpecializations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options
				.get(OPTION__REDUNDANT_GENERALIZATIONS))) {

				processRedundantGeneralizations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__CAPABILITIES))) {
				processCapabilities(options, diagnostics, context);
			}
		}

		public void merge(org.eclipse.uml2.uml.Package package_, Map options,
				DiagnosticChain diagnostics, Map context) {
			receivingPackage = package_;

			mergedPackages = getAllMergedPackages(package_);

			copyAll(mergedPackages);
			copyReferences();

			receivingPackage.getPackageMerges().clear();

			if (options != null) {
				processOptions(options, diagnostics, context);
			}
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

		public static final String OPTION__ANNOTATION_DETAILS = "ANNOTATION_DETAILS"; //$NON-NLS-1$

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

		public static final int ANNOTATION_DETAILS = DIAGNOSTIC_CODE_OFFSET + 12;

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

					if ("UMLPrimitiveTypes::Boolean".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEBoolean();
					} else if ("UMLPrimitiveTypes::Integer".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("UMLPrimitiveTypes::String".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEString();
					} else if ("UMLPrimitiveTypes::UnlimitedNatural".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("JavaPrimitiveTypes::boolean".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEBoolean();
					} else if ("JavaPrimitiveTypes::byte".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEByte();
					} else if ("JavaPrimitiveTypes::char".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEChar();
					} else if ("JavaPrimitiveTypes::double".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEDouble();
					} else if ("JavaPrimitiveTypes::float".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEFloat();
					} else if ("JavaPrimitiveTypes::int".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEInt();
					} else if ("JavaPrimitiveTypes::long".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getELong();
					} else if ("JavaPrimitiveTypes::short".equals(qualifiedName)) { //$NON-NLS-1$
						eType = EcorePackage.eINSTANCE.getEShort();
					} else if (qualifiedName
						.startsWith("EcorePrimitiveTypes::")) { //$NON-NLS-1$
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

							if (addConstraint(eModelElement, name) && DEBUG) {
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
						eAttribute.setDefaultValueLiteral(default_);
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
										"_UI_UML2EcoreConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											eModelElement, getTagDefinition(
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

						if (propertyName == TAG_DEFINITION__XML_CONTENT_KIND) {
							Enumeration contentKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__EMPTY)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.EMPTY_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.SIMPLE_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__MIXED)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.MIXED_CONTENT);
							} else if (value == contentKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_ONLY)) {

								ExtendedMetaData.INSTANCE.setContentKind(
									(EClass) eModelElement,
									ExtendedMetaData.ELEMENT_ONLY_CONTENT);
							}
						} else if (propertyName == TAG_DEFINITION__XML_FEATURE_KIND) {
							Enumeration featureKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.SIMPLE_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ATTRIBUTE_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE_WILDCARD)) {

								ExtendedMetaData.INSTANCE
									.setFeatureKind(
										(EStructuralFeature) eModelElement,
										ExtendedMetaData.ATTRIBUTE_WILDCARD_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ELEMENT_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_WILDCARD)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.ELEMENT_WILDCARD_FEATURE);
							} else if (value == featureKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__GROUP)) {

								ExtendedMetaData.INSTANCE.setFeatureKind(
									(EStructuralFeature) eModelElement,
									ExtendedMetaData.GROUP_FEATURE);
							}
						} else if (propertyName == TAG_DEFINITION__XML_NAME) {

							if (eModelElement instanceof EClassifier) {
								ExtendedMetaData.INSTANCE
									.setName((EClassifier) eModelElement,
										(String) value);
							} else if (eModelElement instanceof EStructuralFeature) {
								ExtendedMetaData.INSTANCE.setName(
									(EStructuralFeature) eModelElement,
									(String) value);
							}
						} else if (propertyName == TAG_DEFINITION__XML_NAMESPACE) {
							ExtendedMetaData.INSTANCE.setNamespace(
								(EStructuralFeature) eModelElement,
								(String) value);
						} else if (propertyName == TAG_DEFINITION__VISIBILITY) {
							eStructuralFeature = (EStructuralFeature) eModelElement;
							boolean isChangeable = eStructuralFeature
								.isChangeable();
							boolean isMany = eStructuralFeature.isMany();
							boolean isUnsettable = eStructuralFeature
								.isUnsettable();

							Enumeration visibilityKindEnumeration = ((EnumerationLiteral) value)
								.getEnumeration();

							if (value == visibilityKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__NONE)) {

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
								.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY)) {

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
								.getOwnedLiteral(ENUMERATION_LITERAL__READ_WRITE)) {

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
								.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY_UNSETTABLE)) {

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
									"_UI_UML2EcoreConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										eModelElement, getTagDefinition(
											stereotype, propertyName), value)),
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
						element, STEREOTYPE__E_CLASS);

					if (eClassStereotype != null) {
						processEcoreTaggedValue(eClass, EcorePackage.eINSTANCE
							.getENamedElement_Name(), element,
							eClassStereotype, TAG_DEFINITION__CLASS_NAME,
							options, diagnostics, context);

						processEcoreTaggedValue(eClass, null, element,
							eClassStereotype, TAG_DEFINITION__XML_CONTENT_KIND,
							options, diagnostics, context);
					}

					return eClassStereotype;
				}

				public Object caseEDataType(EDataType eDataType) {
					Stereotype eDataTypeStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE__E_DATA_TYPE);

					if (eDataTypeStereotype != null) {
						processEcoreTaggedValue(eDataType,
							EcorePackage.eINSTANCE.getENamedElement_Name(),
							element, eDataTypeStereotype,
							TAG_DEFINITION__DATA_TYPE_NAME, options,
							diagnostics, context);
					}

					return eDataTypeStereotype;
				}
			}.doSwitch(eClassifier);

			if (eClassifierStereotype != null) {
				processEcoreTaggedValue(eClassifier, null, element,
					eClassifierStereotype, TAG_DEFINITION__XML_NAME, options,
					diagnostics, context);

				processEcoreTaggedValue(eClassifier, EcorePackage.eINSTANCE
					.getEClassifier_InstanceClassName(), element,
					eClassifierStereotype, TAG_DEFINITION__INSTANCE_CLASS_NAME,
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EEnum eEnum, Element element,
				Map options, DiagnosticChain diagnostics, Map context) {
			Stereotype eEnumStereotype = getAppliedEcoreStereotype(element,
				STEREOTYPE__E_ENUM);

			if (eEnumStereotype != null) {
				processEcoreTaggedValue(eEnum, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eEnumStereotype,
					TAG_DEFINITION__ENUM_NAME, options, diagnostics, context);

				processEcoreTaggedValue(eEnum, null, element, eEnumStereotype,
					TAG_DEFINITION__XML_NAME, options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EEnumLiteral eEnumLiteral,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype eEnumLiteralStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_ENUM_LITERAL);

			if (eEnumLiteralStereotype != null) {
				processEcoreTaggedValue(eEnumLiteral, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eEnumLiteralStereotype,
					TAG_DEFINITION__ENUM_LITERAL_NAME, options, diagnostics,
					context);
			}
		}

		protected void processEcoreTaggedValues(EOperation eOperation,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype eOperationStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_OPERATION);

			if (eOperationStereotype != null) {
				processEcoreTaggedValue(eOperation, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eOperationStereotype,
					TAG_DEFINITION__OPERATION_NAME, options, diagnostics,
					context);
			}
		}

		protected void processEcoreTaggedValues(EPackage ePackage,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype ePackageStereotype = getAppliedEcoreStereotype(element,
				STEREOTYPE__E_PACKAGE);

			if (ePackageStereotype != null) {
				processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, ePackageStereotype,
					TAG_DEFINITION__PACKAGE_NAME, options, diagnostics, context);

				processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
					.getEPackage_NsPrefix(), element, ePackageStereotype,
					TAG_DEFINITION__NS_PREFIX, options, diagnostics, context);

				if (isEmpty(ePackage.getNsPrefix())) {
					processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
						.getEPackage_NsPrefix(), element, ePackageStereotype,
						TAG_DEFINITION__BASE_PACKAGE, options, diagnostics,
						context);

					String nsPrefix = ePackage.getNsPrefix();

					if (!isEmpty(nsPrefix)) {
						ePackage.setNsPrefix(nsPrefix + '.'
							+ ePackage.getName());
					}
				}

				processEcoreTaggedValue(ePackage, EcorePackage.eINSTANCE
					.getEPackage_NsURI(), element, ePackageStereotype,
					TAG_DEFINITION__NS_URI, options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(EParameter eParameter,
				Element element, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype eParameterStereotype = getAppliedEcoreStereotype(
				element, STEREOTYPE__E_PARAMETER);

			if (eParameterStereotype != null) {
				processEcoreTaggedValue(eParameter, EcorePackage.eINSTANCE
					.getENamedElement_Name(), element, eParameterStereotype,
					TAG_DEFINITION__PARAMETER_NAME, options, diagnostics,
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
						element, STEREOTYPE__E_ATTRIBUTE);

					if (eAttributeStereotype != null) {
						processEcoreTaggedValue(eAttribute,
							EcorePackage.eINSTANCE.getENamedElement_Name(),
							element, eAttributeStereotype,
							TAG_DEFINITION__ATTRIBUTE_NAME, options,
							diagnostics, context);

						processEcoreTaggedValue(eAttribute,
							EcorePackage.eINSTANCE.getEAttribute_ID(), element,
							eAttributeStereotype, TAG_DEFINITION__IS_ID,
							options, diagnostics, context);
					}

					return eAttributeStereotype;
				}

				public Object caseEReference(EReference eReference) {
					Stereotype eReferenceStereotype = getAppliedEcoreStereotype(
						element, STEREOTYPE__E_REFERENCE);

					if (eReferenceStereotype != null) {
						processEcoreTaggedValue(eReference,
							EcorePackage.eINSTANCE.getENamedElement_Name(),
							element, eReferenceStereotype,
							TAG_DEFINITION__REFERENCE_NAME, options,
							diagnostics, context);

						processEcoreTaggedValue(eReference,
							EcorePackage.eINSTANCE
								.getEReference_ResolveProxies(), element,
							eReferenceStereotype,
							TAG_DEFINITION__IS_RESOLVE_PROXIES, options,
							diagnostics, context);
					}

					return eReferenceStereotype;
				}
			}.doSwitch(eStructuralFeature);

			if (eStructuralFeatureStereotype != null) {
				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Transient(),
					element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_TRANSIENT, options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Unsettable(),
					element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_UNSETTABLE, options, diagnostics,
					context);

				processEcoreTaggedValue(eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Volatile(),
					element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_VOLATILE, options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, TAG_DEFINITION__XML_NAME,
					options, diagnostics, context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_NAMESPACE, options, diagnostics,
					context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_FEATURE_KIND, options, diagnostics,
					context);

				processEcoreTaggedValue(eStructuralFeature, null, element,
					eStructuralFeatureStereotype, TAG_DEFINITION__VISIBILITY,
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
												"_UI_UML2EcoreConverter_ProcessRedefiningOperation_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													eOperation)), new Object[]{
											eModelElement, eOperation}));
							}

							getEAnnotation(eModelElement,
								ANNOTATION__REDEFINES, true).getReferences()
								.add(eOperation);
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
											"_UI_UML2EcoreConverter_ReportRedefiningOperation_diagnostic", //$NON-NLS-1$
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
													"_UI_UML2EcoreConverter_ProcessRedefiningProperty_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eModelElement,
														eStructuralFeature)),
											new Object[]{eModelElement,
												eStructuralFeature}));
								}

								getEAnnotation(eModelElement,
									ANNOTATION__REDEFINES, true)
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
												"_UI_UML2EcoreConverter_ReportRedefiningProperty_diagnostic", //$NON-NLS-1$
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

		protected boolean isCompositeSubset(Property property) {

			for (Iterator subsettedProperties = property
				.getSubsettedProperties().iterator(); subsettedProperties
				.hasNext();) {

				Property subsettedProperty = (Property) subsettedProperties
					.next();

				if (subsettedProperty.isComposite()
					|| isCompositeSubset(subsettedProperty)) {

					return true;
				}
			}

			return false;
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
													"_UI_UML2EcoreConverter_ProcessSubsettingProperty_diagnostic", //$NON-NLS-1$
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

									if (subsettedEReference.isContainment()
										|| isCompositeSubset(subsettedProperty)) {

										eReference.setContainment(false);
									}

									if (!eReference.isContainment()) {
										eReference
											.setResolveProxies(subsettedEReference
												.isResolveProxies());
									}
								}

								getEAnnotation(eModelElement,
									ANNOTATION__SUBSETS, true).getReferences()
									.add(
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
												"_UI_UML2EcoreConverter_ReportSubsettingProperty_diagnostic", //$NON-NLS-1$
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
											"_UI_UML2EcoreConverter_ProcessUnionProperty_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eStructuralFeature)),
									new Object[]{eStructuralFeature}));
						}

						getEAnnotation(eStructuralFeature, ANNOTATION__UNION,
							true);

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
										"_UI_UML2EcoreConverter_ReportUnionProperty_diagnostic", //$NON-NLS-1$
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
					EStructuralFeature.Internal eStructuralFeature = (EStructuralFeature.Internal) eModelElement;

					if (eStructuralFeature.isDerived()
						&& (eStructuralFeature.isContainment() || !eStructuralFeature
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
												"_UI_UML2EcoreConverter_ProcessDerivedFeature_diagnostic", //$NON-NLS-1$
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
											"_UI_UML2EcoreConverter_ReportDerivedFeature_diagnostic", //$NON-NLS-1$
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
			List operationsToDuplicate = new UniqueEList.FastCompare();

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
														"_UI_UML2EcoreConverter_ProcessDuplicateOperation_diagnostic", //$NON-NLS-1$
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
										eOperation, ANNOTATION__REDEFINES, true)
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
														"_UI_UML2EcoreConverter_DiscardDuplicateOperation_diagnostic", //$NON-NLS-1$
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
													"_UI_UML2EcoreConverter_ReportDuplicateOperation_diagnostic", //$NON-NLS-1$
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
					ANNOTATION__DUPLICATES, true).getContents().add(eOperation);
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
																"_UI_UML2EcoreConverter_ProcessDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
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
												ANNOTATION__REDEFINES, true)
												.getReferences();

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
																"_UI_UML2EcoreConverter_DiscardDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
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
															"_UI_UML2EcoreConverter_ReportDuplicateOperationInheritance_diagnostic", //$NON-NLS-1$
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
			List featuresToDuplicate = new UniqueEList.FastCompare();
			List featuresToRemove = new UniqueEList.FastCompare();

			for (Iterator eModelElements = elementToEModelElementMap.values()
				.iterator(); eModelElements.hasNext();) {

				EModelElement eModelElement = (EModelElement) eModelElements
					.next();

				if (eModelElement instanceof EClass) {
					EClass eClass = (EClass) eModelElement;

					for (Iterator eStructuralFeatures = eClass
						.getEStructuralFeatures().iterator(); eStructuralFeatures
						.hasNext();) {

						EStructuralFeature.Internal eStructuralFeature = (EStructuralFeature.Internal) eStructuralFeatures
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
														"_UI_UML2EcoreConverter_ProcessDuplicateFeature_diagnostic", //$NON-NLS-1$
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
										ANNOTATION__REDEFINES, true)
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
														"_UI_UML2EcoreConverter_DiscardDuplicateFeature_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context,
															eStructuralFeature,
															eAllStructuralFeature)),
												new Object[]{eClass,
													eAllStructuralFeature}));
									}

									EReference eOpposite = eStructuralFeature
										.getEOpposite();

									if (eOpposite != null) {
										featuresToRemove.add(eOpposite);
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
													"_UI_UML2EcoreConverter_ReportDuplicateFeature_diagnostic", //$NON-NLS-1$
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

				EStructuralFeature.Internal eStructuralFeature = (EStructuralFeature.Internal) eStructuralFeatures
					.next();

				getEAnnotation(eStructuralFeature.getEContainingClass(),
					ANNOTATION__DUPLICATES, true).getContents().add(
					eStructuralFeature);

				EReference eOpposite = eStructuralFeature.getEOpposite();

				if (eOpposite != null
					&& !featuresToDuplicate.contains(eOpposite)) {

					eOpposite.setEOpposite(null);

					if (eStructuralFeature.isContainment()) {
						eOpposite.setChangeable(false);
						eOpposite.setTransient(true);
					}

					eOpposite.setVolatile(true);
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
																"_UI_UML2EcoreConverter_ProcessDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
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
												ANNOTATION__REDEFINES, true)
												.getReferences();

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
																"_UI_UML2EcoreConverter_DiscardDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
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
															"_UI_UML2EcoreConverter_ReportDuplicateFeatureInheritance_diagnostic", //$NON-NLS-1$
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

					List superClasses = new UniqueEList.FastCompare(
						extendSuperClasses);
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
												"_UI_UML2EcoreConverter_ProcessSuperClassOrder_diagnostic", //$NON-NLS-1$
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
											"_UI_UML2EcoreConverter_ReportSuperClassOrder_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												eClass)), new Object[]{eClass}));
						}
					}
				}
			}
		}

		protected void processAnnotationDetails(final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			for (Iterator entries = elementToEModelElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				final Map.Entry entry = (Map.Entry) entries.next();
				EModelElement eModelElement = (EModelElement) entry.getValue();

				if (eModelElement != null) {
					Element element = (Element) entry.getKey();

					for (Iterator eAnnotations = element.getEAnnotations()
						.iterator(); eAnnotations.hasNext();) {

						EAnnotation eAnnotation = (EAnnotation) eAnnotations
							.next();
						EMap details = eAnnotation.getDetails();

						if (!details.isEmpty()) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__ANNOTATION_DETAILS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											ANNOTATION_DETAILS,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_UML2EcoreConverter_ProcessAnnotationDetails_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, eModelElement,
														eAnnotation.getSource())),
											new Object[]{eModelElement}));
								}

								getEAnnotation(eModelElement,
									eAnnotation.getSource(), true).getDetails()
									.putAll(details.map());
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__ANNOTATION_DETAILS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										ANNOTATION_DETAILS,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_UML2EcoreConverter_ReportAnnotationDetails_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, eModelElement,
													eAnnotation.getSource())),
										new Object[]{eModelElement}));
							}
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

			if (!OPTION__IGNORE.equals(options.get(OPTION__ANNOTATION_DETAILS))) {
				processAnnotationDetails(options, diagnostics, context);
			}
		}

		public Collection convert(Collection eObjects, Map options,
				DiagnosticChain diagnostics, Map context) {
			packages = EcoreUtil.getObjectsByType(eObjects,
				UMLPackage.Literals.PACKAGE);

			for (Iterator p = packages.iterator(); p.hasNext();) {
				doSwitch((org.eclipse.uml2.uml.Package) p.next());
			}

			if (options != null) {
				processOptions(options, diagnostics, context);
			}

			return getRootContainers(EcoreUtil.getObjectsByType(
				elementToEModelElementMap.values(),
				EcorePackage.Literals.EPACKAGE));
		}

	}

	public static class Profile2EPackageConverter
			extends UML2EcoreConverter {

		public Object casePackage(org.eclipse.uml2.uml.Package package_) {
			return packages.contains(package_)
				? super.casePackage(package_)
				: doSwitch((Profile) packages.iterator().next());
		}

		public Object caseProfile(Profile profile) {
			EPackage ePackage = (EPackage) casePackage(profile);

			if (packages.contains(profile)) {
				String profileName = ePackage.getName();

				ePackage.setNsPrefix(profileName);

				org.eclipse.uml2.uml.Package nestingPackage = profile
					.getNestingPackage();
				String profileParentQualifiedName = nestingPackage == null
					? EMPTY_STRING
					: getQualifiedName(nestingPackage, "."); //$NON-NLS-1$

				String version = String.valueOf(0);

				try {
					EPackage definition = profile.getDefinition();
					String nsURI = definition.getNsURI();
					int lastIndex = nsURI.lastIndexOf('/');

					if (lastIndex > 7) { // 2.0 format
						version = String.valueOf(Integer.parseInt(nsURI
							.substring(lastIndex + 1)) + 1);
					} else { // 1.x format
						String nsPrefix = definition.getNsPrefix();
						version = String.valueOf(Integer.parseInt(nsPrefix
							.substring(nsPrefix.lastIndexOf('_') + 1)) + 1);
					}
				} catch (Exception e) {
					// ignore
				}

				StringBuffer nsURI = new StringBuffer("http://"); //$NON-NLS-1$
				nsURI.append(profileParentQualifiedName);
				nsURI.append("/schemas/"); //$NON-NLS-1$
				nsURI.append(profileName);
				nsURI.append('/');
				nsURI.append(version);

				ePackage.setNsURI(nsURI.toString());
			}

			return ePackage;
		}

		protected EClassifier getEType(Type type) {

			if (type instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class class_ = (org.eclipse.uml2.uml.Class) type;

				if (class_.isMetaclass()) {
					return getEClassifier(class_);
				}
			}

			return super.getEType(type);
		}

		protected void setName(final ENamedElement eNamedElement,
				NamedElement namedElement) {

			new UMLSwitch() {

				public Object caseClassifier(Classifier classifier) {
					setName(eNamedElement, packages.contains(classifier
						.getPackage())
						? classifier.getName()
						: getQualifiedName(classifier, "_"), true); //$NON-NLS-1$
					return classifier;
				}

				public Object caseEnumerationLiteral(
						EnumerationLiteral enumerationLiteral) {
					setName(eNamedElement, enumerationLiteral.getName(), false);
					return enumerationLiteral;
				}

				public Object caseNamedElement(NamedElement namedElement) {
					setName(eNamedElement, namedElement.getName(), true);
					return namedElement;
				}

			}.doSwitch(namedElement);
		}

		public Object doSwitch(EObject eObject) {
			Object eModelElement = super.doSwitch(eObject);

			if (eModelElement instanceof EClassifier) {
				EList references = getEAnnotation((EClassifier) eModelElement,
					UMLPackage.eNS_URI, true).getReferences();

				if (references.isEmpty()) {
					references.add(eObject);
				}
			}

			return eModelElement;
		}
	}

	public static class Ecore2UMLConverter
			extends EcoreSwitch
			implements Converter {

		public static final String OPTION__ECORE_TAGGED_VALUES = "ECORE_TAGGED_VALUES"; //$NON-NLS-1$

		public static final String OPTION__REDEFINES_ANNOTATIONS = "REDEFINES_ANNOTATIONS"; //$NON-NLS-1$

		public static final String OPTION__SUBSETS_ANNOTATIONS = "SUBSETS_ANNOTATIONS"; //$NON-NLS-1$

		public static final String OPTION__UNION_ANNOTATIONS = "UNION_ANNOTATIONS"; //$NON-NLS-1$

		public static final String OPTION__ANNOTATION_DETAILS = "ANNOTATION_DETAILS"; //$NON-NLS-1$

		private static final int DIAGNOSTIC_CODE_OFFSET = 3000;

		public static final int ECORE_TAGGED_VALUE = DIAGNOSTIC_CODE_OFFSET + 1;

		public static final int REDEFINES_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 2;

		public static final int SUBSETS_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 3;

		public static final int UNION_ANNOTATION = DIAGNOSTIC_CODE_OFFSET + 4;

		public static final int ANNOTATION_DETAILS = DIAGNOSTIC_CODE_OFFSET + 5;

		protected final Map eModelElementToElementMap = new HashMap();

		protected Collection ePackages = null;

		protected Model getEcorePrimitiveTypesLibrary(
				EModelElement eModelElement) {
			Resource eResource = eModelElement.eResource();

			if (eResource != null) {
				ResourceSet resourceSet = eResource.getResourceSet();

				if (resourceSet != null) {
					return (Model) load(
						resourceSet,
						URI
							.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
						UMLPackage.Literals.MODEL);
				}
			}

			return null;
		}

		protected PrimitiveType getEcorePrimitiveType(
				EModelElement eModelElement, String name) {
			Model ecorePrimitiveTypesLibrary = getEcorePrimitiveTypesLibrary(eModelElement);

			return ecorePrimitiveTypesLibrary != null
				? (PrimitiveType) ecorePrimitiveTypesLibrary.getOwnedType(name)
				: null;
		}

		protected Type getType(EModelElement eModelElement, EClassifier eType) {
			Type type = null;

			if (eType != null) {
				String name = eType.getName();

				if (!isEmpty(name) && eType instanceof EDataType) {
					type = getEcorePrimitiveType(eModelElement, name);
				}

				if (type == null) {
					type = (Type) doSwitch(eType);
				}
			}

			return type;
		}

		protected Type getType(ETypedElement eTypedElement) {
			return getType(eTypedElement, eTypedElement.getEType());
		}

		public Object caseEAttribute(EAttribute eAttribute) {
			Property property = UMLFactory.eINSTANCE.createProperty();
			eModelElementToElementMap.put(eAttribute, property);

			Classifier classifier = (Classifier) doSwitch(eAttribute
				.getEContainingClass());
			getOwnedAttributes(classifier).add(property);

			property.setName(eAttribute.getName());
			property.setIsReadOnly(!eAttribute.isChangeable());
			property.setIsDerived(eAttribute.isDerived());
			property.setVisibility(VisibilityKind.PUBLIC_LITERAL);

			caseETypedElement(eAttribute);

			defaultCase(eAttribute);

			return property;
		}

		public Object caseEClass(EClass eClass) {
			Classifier classifier = eClass.isInterface()
				? (Classifier) UMLFactory.eINSTANCE.createInterface()
				: (Classifier) UMLFactory.eINSTANCE.createClass();
			eModelElementToElementMap.put(eClass, classifier);

			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) doSwitch(eClass
				.getEPackage());
			package_.getOwnedTypes().add(classifier);

			classifier.setName(eClass.getName());

			if (!eClass.isInterface()) {
				((org.eclipse.uml2.uml.Class) classifier).setIsAbstract(eClass
					.isAbstract());
			}

			for (Iterator eSuperTypes = eClass.getESuperTypes().iterator(); eSuperTypes
				.hasNext();) {

				EClass eSuperType = (EClass) eSuperTypes.next();

				if (eSuperType.isInterface()) {
					((BehavioredClassifier) classifier)
						.createInterfaceRealization(null,
							(Interface) doSwitch(eSuperType));
				} else {
					Classifier generalClassifier = (Classifier) doSwitch(eSuperType);

					if (generalClassifier != null
						&& !classifier.allParents().contains(generalClassifier)) {

						classifier.createGeneralization(generalClassifier);
					}
				}
			}

			defaultCase(eClass);

			return classifier;
		}

		public Object caseEDataType(EDataType eDataType) {
			PrimitiveType primitiveType = UMLFactory.eINSTANCE
				.createPrimitiveType();
			eModelElementToElementMap.put(eDataType, primitiveType);

			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) doSwitch(eDataType
				.getEPackage());
			package_.getOwnedTypes().add(primitiveType);

			primitiveType.setName(eDataType.getName());

			defaultCase(eDataType);

			return primitiveType;
		}

		public Object caseEEnum(EEnum eEnum) {
			Enumeration enumeration = UMLFactory.eINSTANCE.createEnumeration();
			eModelElementToElementMap.put(eEnum, enumeration);

			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) doSwitch(eEnum
				.getEPackage());
			package_.getOwnedTypes().add(enumeration);

			enumeration.setName(eEnum.getName());

			defaultCase(eEnum);

			return enumeration;
		}

		public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
			EnumerationLiteral enumerationLiteral = UMLFactory.eINSTANCE
				.createEnumerationLiteral();
			eModelElementToElementMap.put(eEnumLiteral, enumerationLiteral);

			Enumeration enumeration = (Enumeration) doSwitch(eEnumLiteral
				.getEEnum());
			enumeration.getOwnedLiterals().add(enumerationLiteral);

			enumerationLiteral.setName(eEnumLiteral.getName());

			defaultCase(eEnumLiteral);

			return enumerationLiteral;
		}

		public Object caseEModelElement(EModelElement eModelElement) {
			return eModelElement;
		}

		public Object caseEOperation(EOperation eOperation) {
			Operation operation = UMLFactory.eINSTANCE.createOperation();
			eModelElementToElementMap.put(eOperation, operation);

			Classifier classifier = (Classifier) doSwitch(eOperation
				.getEContainingClass());
			getOwnedOperations(classifier).add(operation);

			operation.setName(eOperation.getName());

			EClassifier eType = eOperation.getEType();

			if (eType != null) {
				operation.createReturnResult(null, getType(eOperation, eType));
			}

			EList raisedExceptions = operation.getRaisedExceptions();

			for (Iterator eExceptions = eOperation.getEExceptions().iterator(); eExceptions
				.hasNext();) {

				raisedExceptions.add(getType(eOperation,
					(EClassifier) eExceptions.next()));
			}

			operation.setVisibility(VisibilityKind.PUBLIC_LITERAL);

			int upperBound = eOperation.getUpperBound();

			if (upperBound != ETypedElement.UNSPECIFIED_MULTIPLICITY
				&& upperBound != operation.getUpper()) {

				operation.setUpper(upperBound);
			}

			int lowerBound = eOperation.getLowerBound();

			if (lowerBound != operation.getLower()) {
				operation.setLower(lowerBound);
			}

			operation.setIsOrdered(eOperation.isOrdered());
			operation.setIsUnique(eOperation.isUnique());

			defaultCase(eOperation);

			return operation;
		}

		public Object caseEPackage(EPackage ePackage) {
			org.eclipse.uml2.uml.Package package_ = ePackage.getESuperPackage() == null
				? UMLFactory.eINSTANCE.createModel()
				: UMLFactory.eINSTANCE.createPackage();
			eModelElementToElementMap.put(ePackage, package_);

			if (!ePackages.contains(ePackage)) {
				EPackage eSuperPackage = ePackage.getESuperPackage();

				if (eSuperPackage != null) {
					((org.eclipse.uml2.uml.Package) doSwitch(eSuperPackage))
						.getNestedPackages().add(package_);
				}
			}

			package_.setName(ePackage.getName());

			defaultCase(ePackage);

			return package_;
		}

		public Object caseEParameter(EParameter eParameter) {
			Parameter parameter = UMLFactory.eINSTANCE.createParameter();
			eModelElementToElementMap.put(eParameter, parameter);

			Operation operation = (Operation) doSwitch(eParameter
				.getEOperation());
			operation.getOwnedParameters().add(parameter);

			parameter.setName(eParameter.getName());

			caseETypedElement(eParameter);

			defaultCase(eParameter);

			return parameter;
		}

		public Object caseEReference(EReference eReference) {
			Property property = UMLFactory.eINSTANCE.createProperty();
			eModelElementToElementMap.put(eReference, property);

			EClass eContainingClass = eReference.getEContainingClass();
			Classifier classifier = (Classifier) doSwitch(eContainingClass);
			getOwnedAttributes(classifier).add(property);

			property.setName(eReference.getName());
			property.setAggregation(eReference.isContainment()
				? AggregationKind.COMPOSITE_LITERAL
				: AggregationKind.NONE_LITERAL);
			property.setIsDerived(eReference.isDerived());
			property.setIsReadOnly(!eReference.isChangeable());

			caseETypedElement(eReference);

			EReference eOpposite = eReference.getEOpposite();

			if (eOpposite == null) {
				Association association = (Association) ((org.eclipse.uml2.uml.Package) doSwitch(eContainingClass
					.getEPackage())).createOwnedType(null,
					UMLPackage.Literals.ASSOCIATION);

				property.setAssociation(association);

				association.createOwnedEnd(null, classifier);
			} else {
				Property opposite = (Property) doSwitch(eOpposite);
				Association association = opposite.getAssociation();

				if (association == null) {

					if (eReference.isContainer()) {
						opposite
							.setAssociation(association = (Association) ((org.eclipse.uml2.uml.Package) doSwitch(eOpposite
								.getEContainingClass().getEPackage()))
								.createOwnedType(null,
									UMLPackage.Literals.ASSOCIATION));

						property.setAssociation(association);
					} else {
						property
							.setAssociation(association = (Association) ((org.eclipse.uml2.uml.Package) doSwitch(eContainingClass
								.getEPackage())).createOwnedType(null,
								UMLPackage.Literals.ASSOCIATION));

						opposite.setAssociation(association);
					}
				} else {
					property.setAssociation(association);
				}
			}

			defaultCase(eReference);

			return property;
		}

		public Object caseETypedElement(ETypedElement eTypedElement) {
			Object element = eModelElementToElementMap.get(eTypedElement);

			if (element == null) {
				return super.caseETypedElement(eTypedElement);
			} else {

				if (element instanceof TypedElement) {
					((TypedElement) element).setType(getType(eTypedElement));
				}

				if (element instanceof MultiplicityElement) {
					MultiplicityElement multiplicityElement = (MultiplicityElement) element;

					int upperBound = eTypedElement.getUpperBound();

					if (upperBound != ETypedElement.UNSPECIFIED_MULTIPLICITY
						&& upperBound != multiplicityElement.getUpper()) {

						multiplicityElement.setUpper(upperBound);
					}

					int lowerBound = eTypedElement.getLowerBound();

					if (lowerBound != multiplicityElement.getLower()) {
						multiplicityElement.setLower(lowerBound);
					}

					multiplicityElement.setIsOrdered(eTypedElement.isOrdered());
					multiplicityElement.setIsUnique(eTypedElement.isUnique());
				}

				return element;
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
			Object element = eModelElementToElementMap.get(eObject);

			return element == null
				? super.doSwitch(eObject)
				: element;
		}

		protected Profile getEcoreProfile(EModelElement eModelElement) {
			Resource eResource = eModelElement.eResource();

			if (eResource != null) {
				ResourceSet resourceSet = eResource.getResourceSet();

				if (resourceSet != null) {
					return (Profile) load(resourceSet, URI
						.createURI(UMLResource.ECORE_PROFILE_URI),
						UMLPackage.Literals.PROFILE);
				}
			}

			return null;
		}

		protected Stereotype getEcoreStereotype(EModelElement eModelElement,
				String name) {
			Profile ecoreProfile = getEcoreProfile(eModelElement);

			return ecoreProfile != null
				? ecoreProfile.getOwnedStereotype(name)
				: null;
		}

		protected void processEcoreTaggedValue(Element element,
				Stereotype stereotype, String propertyName,
				EModelElement eModelElement,
				EStructuralFeature eStructuralFeature, Map options,
				DiagnosticChain diagnostics, Map context) {
			Object value = null;

			if (eStructuralFeature != null) {
				value = eModelElement.eGet(eStructuralFeature);

				if (safeEquals(value, eStructuralFeature.getDefaultValue())) {
					return;
				}
			} else {

				if (propertyName == TAG_DEFINITION__XML_CONTENT_KIND) {
					Enumeration contentKindEnumeration = (Enumeration) getEcoreProfile(
						eModelElement).getOwnedType(ENUMERATION__CONTENT_KIND);

					if (contentKindEnumeration != null) {

						switch (ExtendedMetaData.INSTANCE
							.getContentKind((EClass) eModelElement)) {

							case ExtendedMetaData.EMPTY_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__EMPTY);
								break;
							case ExtendedMetaData.SIMPLE_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE);
								break;
							case ExtendedMetaData.MIXED_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__MIXED);
								break;
							case ExtendedMetaData.ELEMENT_ONLY_CONTENT :
								value = contentKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_ONLY);
								break;
						}
					}

					if (value == null) {
						return;
					}
				} else if (propertyName == TAG_DEFINITION__XML_FEATURE_KIND) {
					Enumeration featureKindEnumeration = (Enumeration) getEcoreProfile(
						eModelElement).getOwnedType(ENUMERATION__FEATURE_KIND);

					if (featureKindEnumeration != null) {

						switch (ExtendedMetaData.INSTANCE
							.getFeatureKind((EStructuralFeature) eModelElement)) {

							case ExtendedMetaData.SIMPLE_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__SIMPLE);
								break;
							case ExtendedMetaData.ATTRIBUTE_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE);
								break;
							case ExtendedMetaData.ATTRIBUTE_WILDCARD_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ATTRIBUTE_WILDCARD);
								break;
							case ExtendedMetaData.ELEMENT_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT);
								break;
							case ExtendedMetaData.ELEMENT_WILDCARD_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__ELEMENT_WILDCARD);
								break;
							case ExtendedMetaData.GROUP_FEATURE :
								value = featureKindEnumeration
									.getOwnedLiteral(ENUMERATION_LITERAL__GROUP);
								break;
						}
					}

					if (value == null) {
						return;
					}
				} else if (propertyName == TAG_DEFINITION__XML_NAME) {

					if (eModelElement instanceof EClassifier) {
						value = ExtendedMetaData.INSTANCE
							.getName((EClassifier) eModelElement);
					} else if (eModelElement instanceof EStructuralFeature) {
						value = ExtendedMetaData.INSTANCE
							.getName((EStructuralFeature) eModelElement);
					}

					if (safeEquals(value, ((ENamedElement) eModelElement)
						.getName())) {
						return;
					}
				} else if (propertyName == TAG_DEFINITION__XML_NAMESPACE) {
					value = ExtendedMetaData.INSTANCE
						.getNamespace((EStructuralFeature) eModelElement);

					if (value == null) {
						return;
					}
				} else if (propertyName == TAG_DEFINITION__VISIBILITY) {
					Enumeration visibilityKindEnumeration = (Enumeration) getEcoreProfile(
						eModelElement).getOwnedType(
						ENUMERATION__VISIBILITY_KIND);

					if (visibilityKindEnumeration != null) {
						eStructuralFeature = (EStructuralFeature) eModelElement;

						if (EcoreUtil.isSuppressedVisibility(
							eStructuralFeature, EcoreUtil.GET)) {

							value = visibilityKindEnumeration
								.getOwnedLiteral(ENUMERATION_LITERAL__NONE);
						} else {

							if (EcoreUtil.isSuppressedVisibility(
								eStructuralFeature, EcoreUtil.SET)) {

								if (EcoreUtil.isSuppressedVisibility(
									eStructuralFeature, EcoreUtil.IS_SET)) {

									value = visibilityKindEnumeration
										.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY);
								} else {
									value = visibilityKindEnumeration
										.getOwnedLiteral(ENUMERATION_LITERAL__READ_ONLY_UNSETTABLE);
								}
							} else {

								if (EcoreUtil.isSuppressedVisibility(
									eStructuralFeature, EcoreUtil.UNSET)) {

									value = visibilityKindEnumeration
										.getOwnedLiteral(ENUMERATION_LITERAL__READ_WRITE);
								}
							}
						}
					}

					if (value == null) {
						return;
					}
				}
			}

			if (OPTION__PROCESS
				.equals(options.get(OPTION__ECORE_TAGGED_VALUES))) {

				if (diagnostics != null) {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.INFO,
							UMLValidator.DIAGNOSTIC_SOURCE,
							ECORE_TAGGED_VALUE,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_Ecore2UMLConverter_ProcessEcoreTaggedValue_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, element,
										getTagDefinition(stereotype,
											propertyName), value)),
							new Object[]{element}));
				}

				setTaggedValue(element, stereotype, propertyName, value);
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
								"_UI_Ecore2UMLConverter_ReportEcoreTaggedValue_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, element,
									getTagDefinition(stereotype, propertyName),
									value)), new Object[]{element}));
			}
		}

		protected void processEcoreTaggedValues(Element element,
				EPackage ePackage, Map options, DiagnosticChain diagnostics,
				Map context) {
			Stereotype ePackageStereotype = getEcoreStereotype(ePackage,
				STEREOTYPE__E_PACKAGE);

			if (ePackageStereotype != null) {
				safeApplyStereotype(element, ePackageStereotype);

				processEcoreTaggedValue(element, ePackageStereotype,
					TAG_DEFINITION__NS_PREFIX, ePackage, EcorePackage.eINSTANCE
						.getEPackage_NsPrefix(), options, diagnostics, context);

				processEcoreTaggedValue(element, ePackageStereotype,
					TAG_DEFINITION__NS_URI, ePackage, EcorePackage.eINSTANCE
						.getEPackage_NsURI(), options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(Element element,
				final EClassifier eClassifier, final Map options,
				final DiagnosticChain diagnostics, final Map context) {
			Stereotype eClassifierStereotype = (Stereotype) new UMLSwitch() {

				public Object caseClass(org.eclipse.uml2.uml.Class class_) {
					Stereotype eClassStereotype = getEcoreStereotype(
						eClassifier, STEREOTYPE__E_CLASS);

					if (eClassStereotype != null) {
						safeApplyStereotype(class_, eClassStereotype);

						processEcoreTaggedValue(class_, eClassStereotype,
							TAG_DEFINITION__XML_CONTENT_KIND, eClassifier,
							null, options, diagnostics, context);
					}

					return eClassStereotype;
				}

				public Object caseDataType(DataType dataType) {
					Stereotype eDataTypeStereotype = getEcoreStereotype(
						eClassifier, STEREOTYPE__E_DATA_TYPE);

					if (eDataTypeStereotype != null) {
						safeApplyStereotype(dataType, eDataTypeStereotype);
					}

					return eDataTypeStereotype;
				}

				public Object caseInterface(Interface interface_) {
					Stereotype eClassStereotype = getEcoreStereotype(
						eClassifier, STEREOTYPE__E_CLASS);

					if (eClassStereotype != null) {
						safeApplyStereotype(interface_, eClassStereotype);

						processEcoreTaggedValue(interface_, eClassStereotype,
							TAG_DEFINITION__XML_CONTENT_KIND, eClassifier,
							null, options, diagnostics, context);
					}

					return eClassStereotype;
				}
			}.doSwitch(element);

			if (eClassifierStereotype != null) {
				processEcoreTaggedValue(element, eClassifierStereotype,
					TAG_DEFINITION__XML_NAME, eClassifier, null, options,
					diagnostics, context);

				processEcoreTaggedValue(element, eClassifierStereotype,
					TAG_DEFINITION__INSTANCE_CLASS_NAME, eClassifier,
					EcorePackage.eINSTANCE.getEClassifier_InstanceClassName(),
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(final Element element,
				EStructuralFeature eStructuralFeature, final Map options,
				final DiagnosticChain diagnostics, final Map context) {
			Stereotype eStructuralFeatureStereotype = (Stereotype) new EcoreSwitch() {

				public Object caseEAttribute(EAttribute eAttribute) {
					Stereotype eAttributeStereotype = getEcoreStereotype(
						eAttribute, STEREOTYPE__E_ATTRIBUTE);

					if (eAttributeStereotype != null) {
						safeApplyStereotype(element, eAttributeStereotype);

						processEcoreTaggedValue(element, eAttributeStereotype,
							TAG_DEFINITION__IS_ID, eAttribute,
							EcorePackage.eINSTANCE.getEAttribute_ID(), options,
							diagnostics, context);
					}

					return eAttributeStereotype;
				}

				public Object caseEReference(EReference eReference) {
					Stereotype eReferenceStereotype = getEcoreStereotype(
						eReference, STEREOTYPE__E_REFERENCE);

					if (eReferenceStereotype != null) {
						safeApplyStereotype(element, eReferenceStereotype);

						processEcoreTaggedValue(element, eReferenceStereotype,
							TAG_DEFINITION__IS_RESOLVE_PROXIES, eReference,
							EcorePackage.eINSTANCE
								.getEReference_ResolveProxies(), options,
							diagnostics, context);
					}

					return eReferenceStereotype;
				}
			}.doSwitch(eStructuralFeature);

			if (eStructuralFeatureStereotype != null) {
				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_TRANSIENT, eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Transient(),
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_UNSETTABLE, eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Unsettable(),
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__IS_VOLATILE, eStructuralFeature,
					EcorePackage.eINSTANCE.getEStructuralFeature_Volatile(),
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_FEATURE_KIND, eStructuralFeature, null,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_NAME, eStructuralFeature, null,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__XML_NAMESPACE, eStructuralFeature, null,
					options, diagnostics, context);

				processEcoreTaggedValue(element, eStructuralFeatureStereotype,
					TAG_DEFINITION__VISIBILITY, eStructuralFeature, null,
					options, diagnostics, context);
			}
		}

		protected void processEcoreTaggedValues(final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			for (Iterator entries = eModelElementToElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				EModelElement eModelElement = (EModelElement) entry.getKey();
				final Element element = (Element) entry.getValue();

				new EcoreSwitch() {

					public Object caseEClassifier(EClassifier eClassifier) {
						processEcoreTaggedValues(element, eClassifier, options,
							diagnostics, context);

						return eClassifier;
					}

					public Object caseEDataType(EDataType eDataType) {
						processEcoreTaggedValues(element, eDataType, options,
							diagnostics, context);

						return eDataType;
					}

					public Object caseEEnum(EEnum eEnum) {
						Stereotype eEnumStereotype = getEcoreStereotype(eEnum,
							STEREOTYPE__E_ENUM);

						if (eEnumStereotype != null) {
							safeApplyStereotype(element, eEnumStereotype);
						}

						return eEnum;
					}

					public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
						Stereotype eEnumLiteralStereotype = getEcoreStereotype(
							eEnumLiteral, STEREOTYPE__E_ENUM_LITERAL);

						if (eEnumLiteralStereotype != null) {
							safeApplyStereotype(element, eEnumLiteralStereotype);
						}

						return eEnumLiteral;
					}

					public Object caseEOperation(EOperation eOperation) {
						Stereotype eOperationStereotype = getEcoreStereotype(
							eOperation, STEREOTYPE__E_OPERATION);

						if (eOperationStereotype != null) {
							safeApplyStereotype(element, eOperationStereotype);
						}

						return eOperation;
					}

					public Object caseEPackage(EPackage ePackage) {
						processEcoreTaggedValues(element, ePackage, options,
							diagnostics, context);

						return ePackage;
					}

					public Object caseEParameter(EParameter eParameter) {
						Stereotype eParameterStereotype = getEcoreStereotype(
							eParameter, STEREOTYPE__E_PARAMETER);

						if (eParameterStereotype != null) {
							safeApplyStereotype(element, eParameterStereotype);
						}

						return eParameter;
					}

					public Object caseEStructuralFeature(
							EStructuralFeature eStructuralFeature) {
						processEcoreTaggedValues(element, eStructuralFeature,
							options, diagnostics, context);

						return eStructuralFeature;
					}

				}.doSwitch(eModelElement);
			}
		}

		protected void processRedefinesAnnotations(final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			for (Iterator entries = eModelElementToElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				EModelElement eModelElement = (EModelElement) entry.getKey();

				if (eModelElement instanceof ETypedElement) {
					EAnnotation redefinesEAnnotation = getEAnnotation(
						eModelElement, ANNOTATION__REDEFINES, false);

					if (redefinesEAnnotation != null) {
						Feature feature = (Feature) entry.getValue();

						for (Iterator references = redefinesEAnnotation
							.getReferences().iterator(); references.hasNext();) {

							Feature redefinedFeature = (Feature) eModelElementToElementMap
								.get(references.next());

							if (redefinedFeature != null
								&& findValidRedefinitions(feature,
									redefinedFeature.getName()).contains(
									redefinedFeature)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__REDEFINES_ANNOTATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												REDEFINES_ANNOTATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_Ecore2UMLConverter_ProcessRedefinesAnnotation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context, feature,
															redefinedFeature)),
												new Object[]{feature,
													redefinedFeature}));
									}

									getRedefinedFeatures(feature).add(
										redefinedFeature);
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__REDEFINES_ANNOTATIONS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.WARNING,
											UMLValidator.DIAGNOSTIC_SOURCE,
											REDEFINES_ANNOTATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_Ecore2UMLConverter_ReportRedefinesAnnotation_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, feature,
														redefinedFeature)),
											new Object[]{feature,
												redefinedFeature}));
								}
							}
						}
					}
				}
			}
		}

		protected void processSubsetsAnnotations(final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			for (Iterator entries = eModelElementToElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				EModelElement eModelElement = (EModelElement) entry.getKey();

				if (eModelElement instanceof EStructuralFeature) {
					EAnnotation subsetsEAnnotation = getEAnnotation(
						eModelElement, ANNOTATION__SUBSETS, false);

					if (subsetsEAnnotation != null) {
						Property property = (Property) entry.getValue();

						for (Iterator references = subsetsEAnnotation
							.getReferences().iterator(); references.hasNext();) {

							Property subsettedProperty = (Property) eModelElementToElementMap
								.get(references.next());

							if (subsettedProperty != null
								&& findValidSubsets(property,
									subsettedProperty.getName()).contains(
									subsettedProperty)) {

								if (OPTION__PROCESS.equals(options
									.get(OPTION__SUBSETS_ANNOTATIONS))) {

									if (diagnostics != null) {
										diagnostics
											.add(new BasicDiagnostic(
												Diagnostic.INFO,
												UMLValidator.DIAGNOSTIC_SOURCE,
												SUBSETS_ANNOTATION,
												UMLPlugin.INSTANCE
													.getString(
														"_UI_Ecore2UMLConverter_ProcessSubsetsAnnotation_diagnostic", //$NON-NLS-1$
														getMessageSubstitutions(
															context, property,
															subsettedProperty)),
												new Object[]{property,
													subsettedProperty}));
									}

									property.getSubsettedProperties().add(
										subsettedProperty);
								} else if (OPTION__REPORT.equals(options
									.get(OPTION__SUBSETS_ANNOTATIONS))
									&& diagnostics != null) {

									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.WARNING,
											UMLValidator.DIAGNOSTIC_SOURCE,
											SUBSETS_ANNOTATION,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_Ecore2UMLConverter_ReportSubsetsAnnotation_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, property,
														subsettedProperty)),
											new Object[]{property,
												subsettedProperty}));
								}
							}
						}
					}
				}
			}
		}

		protected void processUnionAnnotations(final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			for (Iterator entries = eModelElementToElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				Map.Entry entry = (Map.Entry) entries.next();
				EModelElement eModelElement = (EModelElement) entry.getKey();

				if (eModelElement instanceof EStructuralFeature) {
					EAnnotation unionEAnnotation = getEAnnotation(
						eModelElement, ANNOTATION__UNION, false);

					if (unionEAnnotation != null) {
						Property property = (Property) entry.getValue();

						if (OPTION__PROCESS.equals(options
							.get(OPTION__UNION_ANNOTATIONS))) {

							if (diagnostics != null) {
								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.INFO,
										UMLValidator.DIAGNOSTIC_SOURCE,
										UNION_ANNOTATION,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_Ecore2UMLConverter_ProcessUnionAnnotation_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, property)),
										new Object[]{property}));
							}

							property.setIsDerivedUnion(true);
						} else if (OPTION__REPORT.equals(options
							.get(OPTION__UNION_ANNOTATIONS))
							&& diagnostics != null) {

							diagnostics
								.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									UMLValidator.DIAGNOSTIC_SOURCE,
									UNION_ANNOTATION,
									UMLPlugin.INSTANCE
										.getString(
											"_UI_Ecore2UMLConverter_ReportUnionAnnotation_diagnostic", //$NON-NLS-1$
											getMessageSubstitutions(context,
												property)),
									new Object[]{property}));
						}
					}
				}
			}
		}

		protected void processAnnotationDetails(final Map options,
				final DiagnosticChain diagnostics, final Map context) {

			for (Iterator entries = eModelElementToElementMap.entrySet()
				.iterator(); entries.hasNext();) {

				final Map.Entry entry = (Map.Entry) entries.next();
				Element element = (Element) entry.getValue();

				if (element != null) {
					EModelElement eModelElement = (EModelElement) entry
						.getKey();

					for (Iterator eAnnotations = eModelElement
						.getEAnnotations().iterator(); eAnnotations.hasNext();) {

						EAnnotation eAnnotation = (EAnnotation) eAnnotations
							.next();
						EMap details = eAnnotation.getDetails();

						if (!details.isEmpty()) {

							if (OPTION__PROCESS.equals(options
								.get(OPTION__ANNOTATION_DETAILS))) {

								if (diagnostics != null) {
									diagnostics
										.add(new BasicDiagnostic(
											Diagnostic.INFO,
											UMLValidator.DIAGNOSTIC_SOURCE,
											ANNOTATION_DETAILS,
											UMLPlugin.INSTANCE
												.getString(
													"_UI_Ecore2UMLConverter_ProcessAnnotationDetails_diagnostic", //$NON-NLS-1$
													getMessageSubstitutions(
														context, element,
														eAnnotation.getSource())),
											new Object[]{element}));
								}

								getEAnnotation(element,
									eAnnotation.getSource(), true).getDetails()
									.putAll(details.map());
							} else if (OPTION__REPORT.equals(options
								.get(OPTION__ANNOTATION_DETAILS))
								&& diagnostics != null) {

								diagnostics
									.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										UMLValidator.DIAGNOSTIC_SOURCE,
										ANNOTATION_DETAILS,
										UMLPlugin.INSTANCE
											.getString(
												"_UI_Ecore2UMLConverter_ReportAnnotationDetails_diagnostic", //$NON-NLS-1$
												getMessageSubstitutions(
													context, element,
													eAnnotation.getSource())),
										new Object[]{element}));
							}
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
				.get(OPTION__REDEFINES_ANNOTATIONS))) {

				processRedefinesAnnotations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE
				.equals(options.get(OPTION__SUBSETS_ANNOTATIONS))) {

				processSubsetsAnnotations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__UNION_ANNOTATIONS))) {
				processUnionAnnotations(options, diagnostics, context);
			}

			if (!OPTION__IGNORE.equals(options.get(OPTION__ANNOTATION_DETAILS))) {
				processAnnotationDetails(options, diagnostics, context);
			}
		}

		public Collection convert(Collection eObjects, Map options,
				DiagnosticChain diagnostics, Map context) {
			ePackages = EcoreUtil.getObjectsByType(eObjects,
				EcorePackage.eINSTANCE.getEPackage());

			for (Iterator ep = ePackages.iterator(); ep.hasNext();) {
				doSwitch((EPackage) ep.next());
			}

			if (options != null) {
				processOptions(options, diagnostics, context);
			}

			return getRootContainers(EcoreUtil
				.getObjectsByType(eModelElementToElementMap.values(),
					UMLPackage.Literals.PACKAGE));
		}
	}

	public static final String OPTION__DISCARD = "DISCARD"; //$NON-NLS-1$

	public static final String OPTION__IGNORE = "IGNORE"; //$NON-NLS-1$

	public static final String OPTION__PROCESS = "PROCESS"; //$NON-NLS-1$

	public static final String OPTION__REPORT = "REPORT"; //$NON-NLS-1$

	protected static final String ANNOTATION__DUPLICATES = "duplicates"; //$NON-NLS-1$

	protected static final String ANNOTATION__REDEFINES = "redefines"; //$NON-NLS-1$

	protected static final String ANNOTATION__SUBSETS = "subsets"; //$NON-NLS-1$

	protected static final String ANNOTATION__UNION = "union"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__ATTRIBUTE = "Attribute"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__ATTRIBUTE_WILDCARD = "AttributeWilcard"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__ELEMENT = "Element"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__ELEMENT_ONLY = "ElementOnly"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__ELEMENT_WILDCARD = "ElementWildcard"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__EMPTY = "Empty"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__GROUP = "Group"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__MIXED = "Mixed"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__NONE = "None"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__SIMPLE = "Simple"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_ONLY = "ReadOnly"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_ONLY_UNSETTABLE = "ReadOnlyUnsettable"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_WRITE = "ReadWrite"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__READ_WRITE_UNSETTABLE = "ReadWriteUnsettable"; //$NON-NLS-1$

	protected static final String ENUMERATION_LITERAL__UNSPECIFIED = "Unspecified"; //$NON-NLS-1$

	protected static final String ENUMERATION__CONTENT_KIND = "ContentKind"; //$NON-NLS-1$

	protected static final String ENUMERATION__FEATURE_KIND = "FeatureKind"; //$NON-NLS-1$

	protected static final String ENUMERATION__VISIBILITY_KIND = "VisibilityKind"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_ATTRIBUTE = "EAttribute"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_CLASS = "EClass"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_DATA_TYPE = "EDataType"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_ENUM = "EEnum"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_ENUM_LITERAL = "EEnumLiteral"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_OPERATION = "EOperation"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_PACKAGE = "EPackage"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_PARAMETER = "EParameter"; //$NON-NLS-1$

	public static final String STEREOTYPE__E_REFERENCE = "EReference"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__ATTRIBUTE_NAME = "attributeName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__BASE_PACKAGE = "basePackage"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__CLASS_NAME = "className"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__DATA_TYPE_NAME = "dataTypeName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__ENUM_NAME = "enumName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__ENUM_LITERAL_NAME = "enumLiteralName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__INSTANCE_CLASS_NAME = "instanceClassName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__IS_ID = "isID"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__IS_RESOLVE_PROXIES = "isResolveProxies"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__IS_TRANSIENT = "isTransient"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__IS_UNSETTABLE = "isUnsettable"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__IS_VOLATILE = "isVolatile"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__NS_PREFIX = "nsPrefix"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__NS_URI = "nsURI"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__OPERATION_NAME = "operationName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__PACKAGE_NAME = "packageName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__PARAMETER_NAME = "parameterName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__PREFIX = "prefix"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__REFERENCE_NAME = "referenceName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__VISIBILITY = "visibility"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__XML_CONTENT_KIND = "xmlContentKind"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__XML_FEATURE_KIND = "xmlFeatureKind"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__XML_NAME = "xmlName"; //$NON-NLS-1$

	public static final String TAG_DEFINITION__XML_NAMESPACE = "xmlNamespace"; //$NON-NLS-1$

	public static String getQualifiedText(EObject eObject) {
		return getQualifiedText(eObject, QualifiedTextProvider.DEFAULT);
	}

	protected static String getQualifiedName(NamedElement namedElement,
			String separator) {
		String name = namedElement.getName();

		if (isEmpty(name)) {
			return null;
		}

		StringBuffer qualifiedName = new StringBuffer(name);

		for (Iterator allNamespaces = namedElement.allNamespaces().iterator(); allNamespaces
			.hasNext();) {

			String namespaceName = ((Namespace) allNamespaces.next()).getName();

			if (isEmpty(namespaceName)) {
				return null;
			} else {
				qualifiedName.insert(0, separator);
				qualifiedName.insert(0, namespaceName);
			}
		}

		return qualifiedName.toString();
	}

	public static Collection findNamedElements(ResourceSet resourceSet,
			String qualifiedName) {
		return findNamedElements(resourceSet, qualifiedName, false);
	}

	public static Collection findNamedElements(ResourceSet resourceSet,
			String qualifiedName, boolean ignoreCase) {
		return findNamedElements(resourceSet, qualifiedName, ignoreCase,
			UMLPackage.Literals.NAMED_ELEMENT);
	}

	public static Collection findNamedElements(ResourceSet resourceSet,
			String qualifiedName, boolean ignoreCase, EClass eClass) {

		if (!isEmpty(qualifiedName)
			&& UMLPackage.Literals.NAMED_ELEMENT.isSuperTypeOf(eClass)) {

			EList resources = resourceSet.getResources();
			int size = resources.size();

			if (size > 0) {
				EList namedElements = new UniqueEList.FastCompare();

				for (int i = 0; i < size; i++) {
					findNamedElements(((Resource) resources.get(i))
						.getContents(), qualifiedName, ignoreCase, eClass,
						namedElements);
				}

				return ECollections.unmodifiableEList(namedElements);
			}
		}

		return ECollections.EMPTY_ELIST;
	}

	public static Collection findNamedElements(Resource resource,
			String qualifiedName) {
		return findNamedElements(resource, qualifiedName, false);
	}

	public static Collection findNamedElements(Resource resource,
			String qualifiedName, boolean ignoreCase) {
		return findNamedElements(resource, qualifiedName, ignoreCase,
			UMLPackage.Literals.NAMED_ELEMENT);
	}

	public static Collection findNamedElements(Resource resource,
			String qualifiedName, boolean ignoreCase, EClass eClass) {

		if (!isEmpty(qualifiedName)
			&& UMLPackage.Literals.NAMED_ELEMENT.isSuperTypeOf(eClass)) {

			EList contents = resource.getContents();

			if (!contents.isEmpty()) {
				EList namedElements = new UniqueEList.FastCompare();

				findNamedElements(contents, qualifiedName, ignoreCase, eClass,
					namedElements);

				return ECollections.unmodifiableEList(namedElements);
			}
		}

		return ECollections.EMPTY_ELIST;
	}

	protected static Collection findNamedElements(Collection eObjects,
			String qualifiedName, boolean ignoreCase, EClass eClass,
			Collection namedElements) {
		int index = qualifiedName.indexOf(NamedElement.SEPARATOR);

		if (index == -1) {

			for (Iterator members = EcoreUtil
				.getObjectsByType(eObjects, eClass).iterator(); members
				.hasNext();) {

				NamedElement member = (NamedElement) members.next();

				if (ignoreCase
					? qualifiedName.equalsIgnoreCase(member.getName())
					: qualifiedName.equals(member.getName())) {

					namedElements.add(member);
				}
			}
		} else {
			String name = qualifiedName.substring(0, index);
			qualifiedName = qualifiedName.substring(index
				+ NamedElement.SEPARATOR.length());

			for (Iterator namespaces = EcoreUtil.getObjectsByType(eObjects,
				UMLPackage.Literals.NAMESPACE).iterator(); namespaces.hasNext();) {

				Namespace namespace = (Namespace) namespaces.next();

				if (ignoreCase
					? name.equalsIgnoreCase(namespace.getName())
					: name.equals(namespace.getName())) {

					findNamedElements(namespace.getMembers(), qualifiedName,
						ignoreCase, eClass, namedElements);
				}
			}
		}

		return namedElements;
	}

	public static Profile getProfile(EPackage definition) {
		EObject eContainer = definition.eContainer();

		if (eContainer instanceof EAnnotation) {
			EAnnotation eAnnotation = (EAnnotation) eContainer;

			if (safeEquals(eAnnotation.getSource(), UMLPackage.eNS_URI)) {
				eContainer = eAnnotation.eContainer();

				if (eContainer instanceof Profile) {
					return (Profile) eContainer;
				}
			}
		}

		return null;
	}

	protected static EClassifier getEClassifier(
			org.eclipse.uml2.uml.Class metaclass) {
		return UMLPackage.eINSTANCE.getEClassifier(metaclass.getName());
	}

	protected static NamedElement getNamedElement(ENamedElement definition) {

		return (NamedElement) new EcoreSwitch() {

			public Object caseEClassifier(EClassifier eClassifier) {
				EAnnotation eAnnotation = eClassifier
					.getEAnnotation(UMLPackage.eNS_URI);

				if (eAnnotation != null) {
					EList references = eAnnotation.getReferences();

					if (!references.isEmpty()) {
						Object reference = references.get(0);

						if (reference instanceof Classifier) {
							return reference;
						}
					}
				}

				return null;
			}

			public Object caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
				Enumeration enumeration = (Enumeration) doSwitch(eEnumLiteral
					.getEEnum());
				return enumeration == null
					? null
					: enumeration.getOwnedLiteral(eEnumLiteral.getName());
			}

			public Object caseEStructuralFeature(
					EStructuralFeature eStructuralFeature) {
				org.eclipse.uml2.uml.Class class_ = (org.eclipse.uml2.uml.Class) doSwitch(eStructuralFeature
					.getEContainingClass());

				if (class_ != null) {
					String name = eStructuralFeature.getName();

					for (Iterator ownedAttributes = class_.getOwnedAttributes()
						.iterator(); ownedAttributes.hasNext();) {

						Property ownedAttribute = (Property) ownedAttributes
							.next();

						if (safeEquals(getValidJavaIdentifier(ownedAttribute
							.getName()), name)) {

							return ownedAttribute;
						}
					}
				}

				return null;
			}

			public Object caseEPackage(EPackage ePackage) {
				return getProfile(ePackage);
			}

			public Object doSwitch(EObject eObject) {
				return eObject == null
					? null
					: super.doSwitch(eObject);
			}
		}.doSwitch(definition);
	}

	protected static Stereotype getStereotype(EClass definition) {
		NamedElement namedElement = getNamedElement(definition);
		return namedElement instanceof Stereotype
			? (Stereotype) namedElement
			: null;
	}

	public static Stereotype getStereotype(EObject stereotypeApplication) {
		return stereotypeApplication == null
			? null
			: getStereotype(stereotypeApplication.eClass());
	}

	public static Element getBaseElement(EObject stereotypeApplication) {

		if (stereotypeApplication != null) {
			EClass eClass = stereotypeApplication.eClass();

			if (getStereotype(eClass) != null) {

				for (Iterator eAllStructuralFeatures = eClass
					.getEAllStructuralFeatures().iterator(); eAllStructuralFeatures
					.hasNext();) {

					EStructuralFeature eStructuralFeature = (EStructuralFeature) eAllStructuralFeatures
						.next();

					if (eStructuralFeature.getName().startsWith(
						Extension.METACLASS_ROLE_PREFIX)) {

						Object value = stereotypeApplication
							.eGet(eStructuralFeature);

						if (value instanceof Element) {
							return (Element) value;
						}
					}
				}
			}
		}

		return null;
	}

	public static void setBaseElement(EObject stereotypeApplication,
			Element element) {

		if (getStereotype(stereotypeApplication) != null) {

			for (Iterator eAllStructuralFeatures = stereotypeApplication
				.eClass().getEAllStructuralFeatures().iterator(); eAllStructuralFeatures
				.hasNext();) {

				EStructuralFeature eStructuralFeature = (EStructuralFeature) eAllStructuralFeatures
					.next();

				if (eStructuralFeature.getName().startsWith(
					Extension.METACLASS_ROLE_PREFIX)
					&& (element == null || eStructuralFeature.getEType()
						.isInstance(element))) {

					stereotypeApplication.eSet(eStructuralFeature, element);
				}
			}
		}
	}

	protected static EObject applyStereotype(Element element, EClass definition) {
		EObject stereotypeApplication = EcoreUtil.create(definition);

		CacheAdapter.INSTANCE.adapt(stereotypeApplication);

		Resource eResource = element.eResource();

		if (eResource != null) {
			eResource.getContents().add(stereotypeApplication);
		}

		setBaseElement(stereotypeApplication, element);

		return stereotypeApplication;
	}

	public static EObject safeApplyStereotype(Element element,
			Stereotype stereotype) {

		if (stereotype != null) {
			EObject stereotypeApplication = element
				.getStereotypeApplication(stereotype);

			if (stereotypeApplication == null) {
				org.eclipse.uml2.uml.Package nearestPackage = element
					.getNearestPackage();

				if (nearestPackage != null) {
					Profile profile = stereotype.getProfile();

					if (!nearestPackage.getAllAppliedProfiles().contains(
						profile)) {

						EList allOwningPackages = nearestPackage
							.allOwningPackages();
						int size = allOwningPackages.size();

						(size > 0
							? (org.eclipse.uml2.uml.Package) allOwningPackages
								.get(size - 1)
							: nearestPackage).applyProfile(profile);
					}

					stereotypeApplication = element.applyStereotype(stereotype);
				}
			}

			return stereotypeApplication;
		}

		return null;
	}

	protected static Property getTagDefinition(Stereotype stereotype,
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

	public static boolean setTaggedValue(Element element,
			Stereotype stereotype, String propertyName, Object value) {

		if (safeApplyStereotype(element, stereotype) != null) {
			element.setValue(stereotype, propertyName, value);
			return true;
		}

		return false;
	}

	protected static EList getOwnedAttributes(Type type) {

		return (EList) new UMLSwitch() {

			public Object caseArtifact(Artifact artifact) {
				return artifact.getOwnedAttributes();
			}

			public Object caseDataType(DataType dataType) {
				return dataType.getOwnedAttributes();
			}

			public Object caseInterface(Interface interface_) {
				return interface_.getOwnedAttributes();
			}

			public Object caseSignal(Signal signal) {
				return signal.getOwnedAttributes();
			}

			public Object caseStructuredClassifier(
					StructuredClassifier structuredClassifier) {
				return structuredClassifier.getOwnedAttributes();
			}

			public Object doSwitch(EObject eObject) {
				return eObject == null
					? null
					: super.doSwitch(eObject);
			}
		}.doSwitch(type);
	}

	protected static EList getOwnedOperations(Type type) {

		return (EList) new UMLSwitch() {

			public Object caseArtifact(Artifact artifact) {
				return artifact.getOwnedOperations();
			}

			public Object caseClass(org.eclipse.uml2.uml.Class class_) {
				return class_.getOwnedOperations();
			}

			public Object caseDataType(DataType dataType) {
				return dataType.getOwnedOperations();
			}

			public Object caseInterface(Interface interface_) {
				return interface_.getOwnedOperations();
			}

			public Object doSwitch(EObject eObject) {
				return eObject == null
					? null
					: super.doSwitch(eObject);
			}
		}.doSwitch(type);
	}

	protected static EList getRedefinedFeatures(Feature feature) {

		return (EList) new UMLSwitch() {

			public Object caseOperation(Operation operation) {
				return operation.getRedefinedOperations();
			}

			public Object caseProperty(Property property) {
				return property.getRedefinedProperties();
			}

			public Object defaultCase(EObject eObject) {
				return ECollections.EMPTY_ELIST;
			}
		}.doSwitch(feature);
	}

	protected static boolean isRedefinitionValid(Feature redefiningFeature,
			Feature redefinedFeature) {
		return redefinedFeature.isConsistentWith(redefiningFeature);
	}

	protected static Collection findValidRedefinitions(
			Feature redefiningFeature, String name) {
		Collection redefinedFeatures = new UniqueEList.FastCompare();

		for (Iterator redefinitionContexts = redefiningFeature
			.getRedefinitionContexts().iterator(); redefinitionContexts
			.hasNext();) {

			findValidRedefinitions(redefinedFeatures, redefiningFeature, name,
				(Classifier) redefinitionContexts.next());
		}

		return redefinedFeatures;
	}

	protected static Collection findValidRedefinitions(
			Collection redefinedFeatures, Feature redefiningFeature,
			final String name, Classifier redefinitionContext) {
		Feature redefinedFeature = (Feature) findEObject(redefinitionContext
			.getFeatures(), new EClassMatcher(redefiningFeature) {

			public boolean matches(EObject otherEObject) {

				if (super.matches(otherEObject)) {
					Feature feature = (Feature) eObject;
					Feature otherFeature = (Feature) otherEObject;

					return (feature == null && otherFeature == null)
						|| (feature != otherFeature
							&& safeEquals(otherFeature.getName(), name) && isRedefinitionValid(
							feature, otherFeature));
				}

				return false;
			}
		});

		if (redefinedFeature == null) {

			for (Iterator generals = redefinitionContext.getGenerals()
				.iterator(); generals.hasNext();) {

				findValidRedefinitions(redefinedFeatures, redefiningFeature,
					name, (Classifier) generals.next());
			}
		} else {
			redefinedFeatures.add(redefinedFeature);
		}

		return redefinedFeatures;
	}

	protected static boolean isSubsetValid(Property subsettingProperty,
			Property subsettedProperty) {

		for (Iterator subsettingContexts = subsettingProperty
			.subsettingContext().iterator(); subsettingContexts.hasNext();) {

			Classifier subsettingContext = (Classifier) subsettingContexts
				.next();

			for (Iterator subsettedContexts = subsettedProperty
				.subsettingContext().iterator(); subsettedContexts.hasNext();) {

				if (!subsettingContext
					.conformsTo((Classifier) subsettedContexts.next())) {

					return false;
				}
			}
		}

		return true;
	}

	protected static Collection findValidSubsets(Property subsettingProperty,
			String name) {
		Collection subsettedProperties = new UniqueEList.FastCompare();

		for (Iterator subsettingContexts = subsettingProperty
			.subsettingContext().iterator(); subsettingContexts.hasNext();) {

			findValidSubsets(subsettedProperties, subsettingProperty, name,
				(Classifier) subsettingContexts.next());
		}

		return subsettedProperties;
	}

	protected static Collection findValidSubsets(
			Collection subsettedProperties, Property subsettingProperty,
			final String name, Classifier subsettingContext) {
		Property subsettedProperty = (Property) findEObject(subsettingContext
			.getAttributes(), new EClassMatcher(subsettingProperty) {

			public boolean matches(EObject otherEObject) {

				if (super.matches(otherEObject)) {
					Property property = (Property) eObject;
					Property otherProperty = (Property) otherEObject;

					return (property == null && otherProperty == null)
						|| (property != otherProperty
							&& otherProperty.getName().equals(name) && isSubsetValid(
							property, otherProperty));
				}

				return false;
			}
		});

		if (subsettedProperty == null) {

			for (Iterator generals = subsettingContext.getGenerals().iterator(); generals
				.hasNext();) {

				findValidSubsets(subsettedProperties, subsettingProperty, name,
					(Classifier) generals.next());
			}
		} else {
			subsettedProperties.add(subsettedProperty);
		}

		return subsettedProperties;
	}

	public static void merge(org.eclipse.uml2.uml.Package package_, Map options) {

		if (options == null) {
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
			.containsKey(PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS)) {

			options.put(PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS,
				OPTION__IGNORE);
		}

		if (!options.containsKey(PackageMerger.OPTION__IMPLICIT_REDEFINITIONS)) {
			options.put(PackageMerger.OPTION__IMPLICIT_REDEFINITIONS,
				OPTION__IGNORE);
		}

		if (!options.containsKey(PackageMerger.OPTION__INVALID_REDEFINITIONS)) {
			options.put(PackageMerger.OPTION__INVALID_REDEFINITIONS,
				OPTION__IGNORE);
		}

		if (!options.containsKey(PackageMerger.OPTION__INVALID_SUBSETS)) {
			options.put(PackageMerger.OPTION__INVALID_SUBSETS, OPTION__IGNORE);
		}

		if (!options.containsKey(PackageMerger.OPTION__EMPTY_UNIONS)) {
			options.put(PackageMerger.OPTION__EMPTY_UNIONS, OPTION__IGNORE);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__ASSOCIATION_SPECIALIZATIONS)) {

			options.put(PackageMerger.OPTION__ASSOCIATION_SPECIALIZATIONS,
				OPTION__IGNORE);
		}

		if (!options.containsKey(PackageMerger.OPTION__CAPABILITIES)) {
			options.put(PackageMerger.OPTION__CAPABILITIES, OPTION__IGNORE);
		}

		merge(package_, options, null, null);
	}

	public static void merge(org.eclipse.uml2.uml.Package package_,
			Map options, DiagnosticChain diagnostics, Map context) {

		if (options == null) {
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
			.containsKey(PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS)) {

			options.put(PackageMerger.OPTION__REDUNDANT_GENERALIZATIONS,
				OPTION__REPORT);
		}

		if (!options.containsKey(PackageMerger.OPTION__IMPLICIT_REDEFINITIONS)) {
			options.put(PackageMerger.OPTION__IMPLICIT_REDEFINITIONS,
				OPTION__REPORT);
		}

		if (!options.containsKey(PackageMerger.OPTION__INVALID_REDEFINITIONS)) {
			options.put(PackageMerger.OPTION__INVALID_REDEFINITIONS,
				OPTION__REPORT);
		}

		if (!options.containsKey(PackageMerger.OPTION__INVALID_SUBSETS)) {
			options.put(PackageMerger.OPTION__INVALID_SUBSETS, OPTION__REPORT);
		}

		if (!options.containsKey(PackageMerger.OPTION__EMPTY_UNIONS)) {
			options.put(PackageMerger.OPTION__EMPTY_UNIONS, OPTION__REPORT);
		}

		if (!options
			.containsKey(PackageMerger.OPTION__ASSOCIATION_SPECIALIZATIONS)) {

			options.put(PackageMerger.OPTION__ASSOCIATION_SPECIALIZATIONS,
				OPTION__REPORT);
		}

		if (!options.containsKey(PackageMerger.OPTION__CAPABILITIES)) {
			options.put(PackageMerger.OPTION__CAPABILITIES, OPTION__REPORT);
		}

		new PackageMerger().merge(package_, options, diagnostics, context);
	}

	public static Collection convertToEcore(
			org.eclipse.uml2.uml.Package package_, Map options) {

		if (options == null) {
			options = new HashMap();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__IGNORE);
		}

		return convertToEcore(package_, options, null, null);
	}

	public static Collection convertToEcore(
			org.eclipse.uml2.uml.Package package_, Map options,
			DiagnosticChain diagnostics, Map context) {

		if (options == null) {
			options = new HashMap();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__REPORT);
		}

		return new UML2EcoreConverter().convert(
			Collections.singleton(package_), options, diagnostics, context);
	}

	public static Collection convertToEcore(Profile profile, Map options) {

		if (options == null) {
			options = new HashMap();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__IGNORE);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__IGNORE);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__IGNORE);
		}

		return convertToEcore(profile, options, null, null);
	}

	public static Collection convertToEcore(Profile profile, Map options,
			DiagnosticChain diagnostics, Map context) {

		if (options == null) {
			options = new HashMap();
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES)) {

			options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES)) {

			options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__UNION_PROPERTIES)) {
			options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DERIVED_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS)) {

			options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES)) {
			options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
				OPTION__REPORT);
		}

		if (!options
			.containsKey(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE)) {

			options.put(
				UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER)) {
			options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER,
				OPTION__REPORT);
		}

		if (!options.containsKey(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS)) {
			options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS,
				OPTION__REPORT);
		}

		Collection ePackages = new Profile2EPackageConverter().convert(
			Collections.singleton(profile), options, null, null);

		for (Iterator allContents = EcoreUtil.getAllContents(ePackages); allContents
			.hasNext();) {

			new EcoreSwitch() {

				public Object caseEAttribute(EAttribute eAttribute) {

					try {
						eAttribute.getDefaultValue();
					} catch (Exception e) {
						eAttribute.setDefaultValueLiteral(null);
					}

					return eAttribute;
				}

				public Object caseEDataType(EDataType eDataType) {

					try {
						eDataType.getInstanceClass();
					} catch (Exception e) {
						eDataType
							.setInstanceClassName(EcorePackage.Literals.ESTRING
								.getInstanceClassName());
					}

					return eDataType;
				}

			}.doSwitch((EObject) allContents.next());
		}

		return ePackages;
	}

	public static Collection convertFromEcore(EPackage ePackage, Map options) {

		if (options == null) {
			options = new HashMap();
		}

		return convertFromEcore(ePackage, options, null, null);
	}

	public static Collection convertFromEcore(EPackage ePackage, Map options,
			DiagnosticChain diagnostics, Map context) {

		if (options == null) {
			options = new HashMap();
		}

		return new Ecore2UMLConverter().convert(
			Collections.singleton(ePackage), options, diagnostics, context);
	}

}
