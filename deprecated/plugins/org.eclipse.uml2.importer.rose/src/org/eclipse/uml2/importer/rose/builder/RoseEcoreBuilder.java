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
 * $Id: RoseEcoreBuilder.java,v 1.3 2005/05/18 21:08:51 khussey Exp $
 */
package org.eclipse.uml2.importer.rose.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
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
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.importer.rose.builder.RoseStrings;
import org.eclipse.emf.importer.rose.builder.TableObject;
import org.eclipse.emf.importer.rose.parser.RoseNode;
import org.eclipse.uml2.codegen.ecore.Generator;

public class RoseEcoreBuilder
		extends org.eclipse.emf.importer.rose.builder.RoseEcoreBuilder {

	protected static final String ANNOTATION_SOURCE__EXCLUSIONS = "exclusions";

	protected static final String ANNOTATION_SOURCE__INCLUSIONS = "inclusions";

	protected Map packageDependencyMap = new HashMap();

	protected Map packageDependencyDepthMap = new HashMap();

	protected boolean refIsDerived = false;

	public RoseEcoreBuilder(RoseUtil roseUtil) {
		super(roseUtil);
	}

	protected String getQualifiedTypeName(ETypedElement typedElement,
			String type) {

		if (null != type) {

			if (type.startsWith("Sequence")) {
				TableObject tableObject = (TableObject) ((RoseUtil) roseUtil)
					.getNameTable().get("Sequence");

				if (null != tableObject) {
					return tableObject.getName();
				}
			}

			if (type.startsWith("Set")) {
				TableObject tableObject = (TableObject) ((RoseUtil) roseUtil)
					.getNameTable().get("Set");

				if (null != tableObject) {
					return tableObject.getName();
				}
			}
		}

		return super.getQualifiedTypeName(typedElement, type);
	}

	protected void setEOperationProperties(RoseNode roseNode,
			EOperation eOperation) {
		super.setEOperationProperties(roseNode, eOperation);

		if (null != roseNode.getSemantics()) {
			eOperation.getEAnnotation(GenModelPackage.eNS_URI).getDetails()
				.removeKey("body");
		}
	}

	protected void setEPackageProperties(RoseNode roseNode, EPackage ePackage,
			String tentativeName) {

		// "build" package object...
		String quid = roseNode.getRoseId();

		if (quid != null && !quid.equals("")) {
			quid = quid.substring(1, quid.length() - 1);
		}

		TableObject tableObj = (TableObject) ((RoseUtil) roseUtil)
			.getQuidTable().get(quid);

		if (tableObj != null) {
			tableObj.setObject(ePackage);
		}

		super.setEPackageProperties(roseNode, ePackage, tentativeName);
	}

	protected void setEReferenceProperties(RoseNode roseNode,
			EReference eReference) {
		super.setEReferenceProperties(roseNode, eReference);

		eReference.setDerived(refIsDerived);
	}

	protected void setEStructuralFeatureProperties(RoseNode roseNode,
			EStructuralFeature eStructuralFeature) {
		super.setEStructuralFeatureProperties(roseNode, eStructuralFeature);

		// constraints...
		if (eStructuralFeature.isMany()) {
			eStructuralFeature.setOrdered(false);
		}

		if (null != roseNode.getConstraints()) {

			for (StringTokenizer st = new StringTokenizer(roseNode
				.getConstraints(), ","); st.hasMoreTokens();) {
				String constraint = st.nextToken().trim();

				if (constraint.startsWith("redefines")) {
					getOrCreateAnnotation(
						Generator.ANNOTATION_SOURCE__REDEFINES,
						eStructuralFeature).getDetails().put(
						constraint.substring(constraint.indexOf(' ')).trim(),
						"");

					continue;
				}

				if (constraint.startsWith("subsets")) {
					getOrCreateAnnotation(Generator.ANNOTATION_SOURCE__SUBSETS,
						eStructuralFeature).getDetails().put(
						constraint.substring(constraint.indexOf(' ')).trim(),
						"");

					continue;
				}

				if (constraint.startsWith("union")) {
					createAnnotation(Generator.ANNOTATION_SOURCE__UNION,
						eStructuralFeature);

					eStructuralFeature.setDerived(true);
					eStructuralFeature.setChangeable(false);

					continue;
				}

				if (constraint.startsWith("ordered")) {
					eStructuralFeature.setOrdered(true);

					continue;
				}
			}
		}

	}

	public void setETypeClassifier() {
		super.setETypeClassifier();

		for (Iterator i = eStructuralFeatures.iterator(); i.hasNext();) {
			EStructuralFeature eStructuralFeature = (EStructuralFeature) i
				.next();

			if (eStructuralFeature instanceof EAttribute) {
				EAttribute eAttribute = (EAttribute) eStructuralFeature;

				if ("java.lang.String".equals(eAttribute.getEAttributeType()
					.getInstanceClassName())
					&& null == eAttribute.getDefaultValue()) {

					eAttribute.setDefaultValueLiteral("");
				}
			}
		}
	}

	protected void sortSuper(Map superMap) {

		for (Iterator keys = ((RoseUtil) roseUtil).getDependencyTable()
			.keySet().iterator(); keys.hasNext();) {

			Object key = keys.next();

			if (key instanceof EPackage) {
				collapse((EPackage) key, getCollapsedPackages((EPackage) key),
					superMap);
			}
		}

		for (Iterator entries = superMap.entrySet().iterator(); entries
			.hasNext();) {

			Map.Entry entry = (Map.Entry) entries.next();
			EClass eClass = (EClass) entry.getKey();
			List[] collections = (List[]) entry.getValue();

			// remove redundant superclasses...
			for (Iterator superClasses = new ArrayList(eClass.getESuperTypes())
				.iterator(); superClasses.hasNext();) {

				EClass superClass = (EClass) superClasses.next();

				for (Iterator otherSuperClasses = eClass.getESuperTypes()
					.iterator(); otherSuperClasses.hasNext();) {

					EClass otherSuperClass = (EClass) otherSuperClasses.next();

					if (superClass != otherSuperClass
						&& otherSuperClass.isSuperTypeOf(superClass)) {

						otherSuperClasses.remove();

						collections[0].remove(otherSuperClass);
						collections[1].remove(otherSuperClass);
						collections[2].remove(otherSuperClass);
					}
				}
			}
		}

		super.sortSuper(superMap);
	}

	protected Object validateEClass(EClass eClass) {

		// discard duplicate operations...
		for (Iterator eOperations = eClass.getEOperations().iterator(); eOperations
			.hasNext();) {

			EOperation eOperation = (EOperation) eOperations.next();

			otherOperationsLoop : for (Iterator otherOperations = new ArrayList(
				eClass.getEOperations()).iterator(); otherOperations.hasNext();) {

				EOperation otherOperation = (EOperation) otherOperations.next();

				if (eOperation == otherOperation) {
					break;
				} else if (eOperation.getName()
					.equals(otherOperation.getName())
					&& eOperation.getEParameters().size() == otherOperation
						.getEParameters().size()) {

					for (int index = 0; index < eOperation.getEParameters()
						.size(); index++) {

						if (((EParameter) eOperation.getEParameters()
							.get(index)).getEType() != ((EParameter) otherOperation
							.getEParameters().get(index)).getEType()) {

							continue otherOperationsLoop;
						}
					}

					error("Duplicate '" + eOperation.getName()
						+ "' operation in '" + eClass.getName()
						+ "' will be discarded");
					eOperations.remove();
					break;
				}
			}
		}

		return super.validateEClass(eClass);
	}

	protected void visitObject(RoseNode roseNode, String roseNodeValue,
			String objectKey, String objectType, String objectName,
			Object parent) {

		if (objectType.equals(RoseStrings.VISIBILITY_RELATIONSHIP)) {
			visitVisibilityRelationship(roseNode, roseNodeValue, objectKey,
				objectName, parent);
		} else if (objectType.equals(RoseStrings.CLASSATTRIBUTE)) {
			visitClassattribute(roseNode, roseNodeValue, objectKey, objectName,
				parent);
		} else if (objectType.equals(RoseStrings.ROLE)) {

			if (objectName.startsWith("/")) {
				objectName = objectName.substring(1);

				// tag the reference as derived...
				refIsDerived = true;
			} else {
				refIsDerived = false;
			}

			visitRole(roseNode, roseNodeValue, objectKey, objectName, parent);
		} else {
			super.visitObject(roseNode, roseNodeValue, objectKey, objectType,
				objectName, parent);
		}
	}

	protected void visitOperation(RoseNode roseNode, String roseNodeValue,
			String objectKey, String objectName, Object parent) {
		super.visitOperation(roseNode, roseNodeValue, objectKey, objectName,
			parent);

		if (parent instanceof EClass) {
			EOperation eOperation = (EOperation) roseNode.getNode();

			if ("inv".equalsIgnoreCase(roseNode.getStereotype())) {

				if (null != roseNode.getSemantics()) {
					StringBuffer documentation = new StringBuffer();

					documentation
						.append("An invariant constraint based on the following OCL expression:");
					documentation.append(System.getProperties().getProperty(
						"line.separator"));
					documentation.append("<code>");
					documentation.append(System.getProperties().getProperty(
						"line.separator"));
					documentation.append(roseNode.getSemantics());
					documentation.append(System.getProperties().getProperty(
						"line.separator"));
					documentation.append("</code>");

					EcoreUtil.setDocumentation(eOperation, documentation
						.toString());
				}
			}

			if ("spec".equalsIgnoreCase(roseNode.getStereotype())) {

				if (null != roseNode.getSemantics()) {
					StringBuffer documentation = new StringBuffer();

					documentation
						.append("A query based on the following OCL expression:");
					documentation.append(System.getProperties().getProperty(
						"line.separator"));
					documentation.append("<code>");
					documentation.append(System.getProperties().getProperty(
						"line.separator"));
					documentation.append(roseNode.getSemantics());
					documentation.append(System.getProperties().getProperty(
						"line.separator"));
					documentation.append("</code>");

					EcoreUtil.setDocumentation(eOperation, documentation
						.toString());
				}
			}
		}
	}

	protected void visitVisibilityRelationship(RoseNode roseNode,
			String roseNodeValue, String objectKey, String objectName,
			Object parent) {

		String quidu = roseNode.getRoseRefId();

		if (quidu != null && !quidu.equals("")) {
			quidu = quidu.substring(1, quidu.length() - 1);
		}

		Map dependencyTable = ((RoseUtil) roseUtil).getDependencyTable();
		List dependencyList = (List) dependencyTable.get(parent);

		if (dependencyList == null) {
			dependencyList = new ArrayList();
			dependencyTable.put(parent, dependencyList);
		}

		dependencyList.add(quidu);
		dependencyList.add(roseNode.getStereotype());
	}

	protected List getCollapsedPackages(EPackage collapsingPackage) {
		Set collapsedPackages = new LinkedHashSet();
		Map dependencyTable = ((RoseUtil) roseUtil).getDependencyTable();

		if (dependencyTable.containsKey(collapsingPackage)) {

			for (Iterator i = ((List) dependencyTable.get(collapsingPackage))
				.iterator(); i.hasNext();) {
				TableObject tableObject = (TableObject) ((RoseUtil) roseUtil)
					.getQuidTable().get(i.next());

				if ("collapse".equals((String) i.next())) {

					if (null != tableObject
						&& tableObject.getObject() instanceof EPackage) {
						EPackage collapsedPackage = (EPackage) tableObject
							.getObject();

						collapsedPackages.add(collapsedPackage);
						collapsedPackages
							.addAll(getAllSubpackages(collapsedPackage));
					} else {
						warning("Cannot process collapse link for "
							+ collapsingPackage);
					}
				}
			}
		}

		return new ArrayList(collapsedPackages);
	}

	protected EPackage getExtendedPackage(EPackage extendingPackage) {
		Map dependencyTable = ((RoseUtil) roseUtil).getDependencyTable();

		if (dependencyTable.containsKey(extendingPackage)) {

			for (Iterator i = ((List) dependencyTable.get(extendingPackage))
				.iterator(); i.hasNext();) {

				TableObject tableObject = (TableObject) ((RoseUtil) roseUtil)
					.getQuidTable().get(i.next());

				if ("extend".equals((String) i.next())) {

					if (tableObject != null
						&& tableObject.getObject() instanceof EPackage) {

						return (EPackage) tableObject.getObject();
					} else {
						warning("Cannot process extend link for "
							+ extendingPackage);
					}
				}
			}
		}

		return null;
	}

	protected List getAllSubpackages(EPackage superPackage) {
		List allSubpackages = new ArrayList();

		for (Iterator subpackages = superPackage.getESubpackages().iterator(); subpackages
			.hasNext();) {

			EPackage subpackage = (EPackage) subpackages.next();

			allSubpackages.add(subpackage);
			allSubpackages.addAll(getAllSubpackages(subpackage));
		}

		return allSubpackages;
	}

	protected List getImportedPackages(EPackage importingPackage) {
		List importedPackages = new ArrayList();
		Map dependencyTable = ((RoseUtil) roseUtil).getDependencyTable();

		if (dependencyTable.containsKey(importingPackage)) {

			for (Iterator i = ((List) dependencyTable.get(importingPackage))
				.iterator(); i.hasNext();) {

				TableObject tableObject = (TableObject) ((RoseUtil) roseUtil)
					.getQuidTable().get(i.next());

				if ("import".equals((String) i.next())) {

					if (tableObject != null
						&& tableObject.getObject() instanceof EPackage) {

						importedPackages
							.add((EPackage) tableObject.getObject());
					} else {
						warning("Cannot process import link for "
							+ importingPackage.getNsPrefix());
					}
				}
			}
		}

		return importedPackages;
	}

	protected List getAllImportedPackages(EPackage importingPackage) {
		Set allImportedPackages = new HashSet();

		for (Iterator importedPackages = getImportedPackages(importingPackage)
			.iterator(); importedPackages.hasNext();) {

			EPackage importedPackage = (EPackage) importedPackages.next();

			allImportedPackages.add(importedPackage);
			allImportedPackages.addAll(getAllImportedPackages(importedPackage));
		}

		return new ArrayList(allImportedPackages);
	}

	protected Set getPackageDependencies(EObject object) {

		if (packageDependencyMap.containsKey(object)) {
			return (Set) packageDependencyMap.get(object);
		} else {
			final Set packageDependencies = new HashSet();

			new EcoreSwitch() {

				public Object caseEClass(EClass eClass) {

					for (Iterator eSuperTypes = eClass.getESuperTypes()
						.iterator(); eSuperTypes.hasNext();) {

						packageDependencies.add(((EClass) eSuperTypes.next())
							.getEPackage());
					}

					return null;
				}

				public Object caseEPackage(EPackage ePackage) {
					defaultCase(ePackage);

					packageDependencies.addAll(getImportedPackages(ePackage));
					packageDependencies.remove(ePackage);

					packageDependencyMap.put(ePackage, packageDependencies);

					return this;
				}

				public Object caseETypedElement(ETypedElement eTypedElement) {

					if (null != eTypedElement.getEType()) {
						packageDependencies.add(eTypedElement.getEType()
							.getEPackage());
					}

					return null;
				}

				public Object defaultCase(EObject eObject) {

					for (Iterator contents = eObject.eContents().iterator(); contents
						.hasNext();) {

						packageDependencies
							.addAll(getPackageDependencies((EObject) contents
								.next()));
					}

					return this;
				}
			}.doSwitch(object);

			return packageDependencies;
		}
	}

	protected Set getAllPackageDependencies(EObject object) {
		Set allPackageDependencies = new HashSet();

		for (Iterator packageDependencies = getPackageDependencies(object)
			.iterator(); packageDependencies.hasNext();) {

			EPackage packageDependency = (EPackage) packageDependencies.next();

			allPackageDependencies.add(packageDependency);
			allPackageDependencies
				.addAll(getAllPackageDependencies(packageDependency));
		}

		return allPackageDependencies;
	}

	protected Integer getPackageDependencyDepth(EPackage dependentPackage) {

		if (!packageDependencyDepthMap.containsKey(dependentPackage)) {
			Set packageDependencies = getPackageDependencies(dependentPackage);

			if (packageDependencies.isEmpty()) {
				packageDependencyDepthMap.put(dependentPackage, new Integer(0));
			} else {
				packageDependencyDepthMap.put(dependentPackage, new Integer(
					1 + getPackageDependencyDepth(
						(EPackage) Collections.max(packageDependencies,
							new Comparator() {

								public int compare(Object o1, Object o2) {
									return getPackageDependencyDepth(
										(EPackage) o1)
										.compareTo(
											getPackageDependencyDepth((EPackage) o2));
								}
							})).intValue()));
			}
		}

		return (Integer) packageDependencyDepthMap.get(dependentPackage);
	}

	protected EClass collapse(EPackage collapsingPackage,
			EClass collapsedClass, Map superMap) {
		EClass collapsingClass = null;

		for (Iterator collapsingClassifiers = collapsingPackage
			.getEClassifiers().iterator(); collapsingClassifiers.hasNext();) {

			EClassifier collapsingClassifier = (EClassifier) collapsingClassifiers
				.next();

			if (collapsingClassifier instanceof EClass
				&& collapsedClass.getName().equals(
					collapsingClassifier.getName())) {

				collapsingClass = (EClass) collapsingClassifier;

				if (collapsingClass.isAbstract() != collapsedClass.isAbstract()) {

					if (collapsingClass.isAbstract()) {
						collapsingClass.setAbstract(false);
						info("Made abstract class "
							+ getQualifiedName(collapsingClass)
							+ " concrete from class "
							+ getQualifiedName(collapsedClass)
							+ " based on package collapse.");
					} else {
						warning("Concrete class "
							+ getQualifiedName(collapsingClass)
							+ " would become abstract from class "
							+ getQualifiedName(collapsedClass)
							+ " based on package collapse.");
					}
				}

				if (collapsingClass.isInterface() != collapsedClass
					.isInterface()) {

					if (collapsingClass.isInterface()) {
						collapsingClass.setInterface(false);
						info("Made interface class "
							+ getQualifiedName(collapsingClass)
							+ " non-interface from class "
							+ getQualifiedName(collapsedClass)
							+ " based on package collapse.");
					} else {
						warning("Non-interface class "
							+ getQualifiedName(collapsingClass)
							+ " would become interface from class "
							+ getQualifiedName(collapsedClass)
							+ " based on package collapse.");
					}
				}

				break;
			}
		}

		if (null == collapsingClass) {
			collapsingClass = ecoreFactory.createEClass();

			collapsingClass.setAbstract(collapsedClass.isAbstract());
			collapsingClass.setInterface(collapsedClass.isInterface());
			collapsingClass.setName(collapsedClass.getName());

			collapsingPackage.getEClassifiers().add(collapsingClass);

			info("Created class " + getQualifiedName(collapsingClass)
				+ " from " + getQualifiedName(collapsedClass)
				+ " based on package collapse.");
		}

		return collapsingClass;
	}

	protected EEnum collapse(EPackage collapsingPackage, EEnum collapsedEnum,
			Map superMap) {
		EEnum collapsingEnum = null;

		for (Iterator collapsingClassifiers = collapsingPackage
			.getEClassifiers().iterator(); collapsingClassifiers.hasNext();) {

			EClassifier collapsingClassifier = (EClassifier) collapsingClassifiers
				.next();

			if (collapsingClassifier instanceof EEnum
				&& collapsedEnum.getName().equals(
					collapsingClassifier.getName())) {

				collapsingEnum = (EEnum) collapsingClassifier;
				break;
			}
		}

		if (null == collapsingEnum) {
			collapsingEnum = ecoreFactory.createEEnum();

			collapsingEnum.setName(collapsedEnum.getName());

			collapsingPackage.getEClassifiers().add(collapsingEnum);

			info("Created enum " + getQualifiedName(collapsingEnum) + " from "
				+ getQualifiedName(collapsedEnum)
				+ " based on package collapse.");
		}

		for (Iterator collapsedLiterals = collapsedEnum.getELiterals()
			.iterator(); collapsedLiterals.hasNext();) {

			EEnumLiteral collapsedLiteral = (EEnumLiteral) collapsedLiterals
				.next();
			EEnumLiteral collapsingLiteral = null;

			for (Iterator collapsingLiterals = collapsingEnum.getELiterals()
				.iterator(); collapsingLiterals.hasNext();) {

				EEnumLiteral literal = (EEnumLiteral) collapsingLiterals.next();

				if (collapsedLiteral.getName().equals(literal.getName())) {
					collapsingLiteral = literal;
					break;
				}
			}

			if (null == collapsingLiteral) {
				collapsingLiteral = ecoreFactory.createEEnumLiteral();

				collapsingLiteral.setName(collapsedLiteral.getName());
				collapsingLiteral.setValue(collapsedLiteral.getValue());

				collapsingEnum.getELiterals().add(collapsingLiteral);
			}
		}

		return collapsingEnum;
	}

	protected EDataType collapse(EPackage collapsingPackage,
			EDataType collapsedDataType, Map superMap) {
		EDataType collapsingDataType = null;

		for (Iterator collapsingClassifiers = collapsingPackage
			.getEClassifiers().iterator(); collapsingClassifiers.hasNext();) {

			EClassifier collapsingClassifier = (EClassifier) collapsingClassifiers
				.next();

			if (collapsingClassifier instanceof EDataType
				&& collapsedDataType.getName().equals(
					collapsingClassifier.getName())) {

				collapsingDataType = (EDataType) collapsingClassifier;
				break;
			}
		}

		if (null == collapsingDataType) {
			collapsingDataType = ecoreFactory.createEDataType();

			collapsingDataType.setInstanceClass(collapsedDataType
				.getInstanceClass());
			collapsingDataType.setInstanceClassName(collapsedDataType
				.getInstanceClassName());
			collapsingDataType.setName(collapsedDataType.getName());
			collapsingDataType.setSerializable(collapsedDataType
				.isSerializable());

			collapsingPackage.getEClassifiers().add(collapsingDataType);

			info("Created data type " + getQualifiedName(collapsingDataType)
				+ " from " + getQualifiedName(collapsedDataType)
				+ " based on package collapse.");
		}

		return collapsingDataType;
	}

	protected EClassifier collapse(EPackage collapsingPackage,
			EClassifier collapsedClassifier, Map superMap) {
		EClassifier collapsingClassifier = null;

		if (collapsedClassifier instanceof EClass) {
			collapsingClassifier = collapse(collapsingPackage,
				(EClass) collapsedClassifier, superMap);
		}

		if (collapsedClassifier instanceof EEnum) {
			collapsingClassifier = collapse(collapsingPackage,
				(EEnum) collapsedClassifier, superMap);
		}

		if (collapsedClassifier instanceof EDataType) {
			collapsingClassifier = collapse(collapsingPackage,
				(EDataType) collapsedClassifier, superMap);
		}

		if (null != collapsingClassifier) {
			// collapse documentation...
			String collapsedDocumentation = EcoreUtil
				.getDocumentation(collapsedClassifier);

			if (null != collapsedDocumentation) {
				String collapsingDocumentation = EcoreUtil
					.getDocumentation(collapsingClassifier);

				if (null == collapsingDocumentation) {
					EcoreUtil.setDocumentation(collapsingClassifier,
						collapsedDocumentation);
				}
			}
		}

		return collapsingClassifier;
	}

	protected void collapse(EPackage collapsingPackage, List collapsedPackages,
			Map superMap) {

		if (collapsedPackages.isEmpty()) {
			return;
		}

		Collections.sort(collapsedPackages, new Comparator() {

			public int compare(Object o1, Object o2) {
				return getPackageDependencyDepth((EPackage) o1).compareTo(
					getPackageDependencyDepth((EPackage) o2));
			}
		});

		for (Iterator packages = collapsedPackages.iterator(); packages
			.hasNext();) {

			EPackage ePackage = (EPackage) packages.next();
			info(ePackage.getNsPrefix() + " ("
				+ getPackageDependencyDepth(ePackage) + ")");
		}

		List extendedClassifiers = new ArrayList();

		EPackage extendedPackage = getExtendedPackage(collapsingPackage);

		if (null != extendedPackage) {
			collapse(extendedPackage, getCollapsedPackages(extendedPackage),
				superMap);
			extendedClassifiers.addAll(extendedPackage.getEClassifiers());

			for (Iterator packages = getCollapsedPackages(extendedPackage)
				.iterator(); packages.hasNext();) {

				extendedClassifiers.addAll(((EPackage) packages.next())
					.getEClassifiers());
			}
		}

		List collapsedClassifiers = new ArrayList();

		for (Iterator packages = collapsedPackages.iterator(); packages
			.hasNext();) {

			EPackage collapsedPackage = (EPackage) packages.next();

			if (null == extendedPackage
				|| !getCollapsedPackages(extendedPackage).contains(
					collapsedPackage)) {

				collapse(collapsedPackage,
					getCollapsedPackages(collapsedPackage), superMap);
				collapsedClassifiers.addAll(collapsedPackage.getEClassifiers());
			}
		}

		for (Iterator classifiers = collapsedClassifiers.iterator(); classifiers
			.hasNext();) {

			EClassifier collapsedClassifier = (EClassifier) classifiers.next();
			EClassifier collapsingClassifier = collapse(collapsingPackage,
				collapsedClassifier, superMap);

			if (collapsedClassifier instanceof EClass) {
				EClass collapsedClass = (EClass) collapsedClassifier;
				EClass collapsingClass = (EClass) collapsingClassifier;

				// collapse super types...
				for (Iterator collapsedSuperClasses = collapsedClass
					.getESuperTypes().iterator(); collapsedSuperClasses
					.hasNext();) {

					EClass collapsedSuperClass = (EClass) collapsedSuperClasses
						.next();

					EClass collapsingSuperClass = collapsedClassifiers
						.contains(collapsedSuperClass)
						? collapse(collapsingPackage, collapsedSuperClass,
							superMap)
						: (extendedClassifiers.contains(collapsedSuperClass)
							? collapse(extendedPackage, collapsedSuperClass,
								superMap)
							: collapsedSuperClass);

					if (collapsingClass != collapsingSuperClass
						&& !collapsingClass.getESuperTypes().contains(
							collapsingSuperClass)) {

						if (!collapsingSuperClass.isInterface()) {

							if (!superMap.containsKey(collapsingClass)) {
								superMap.put(collapsingClass, new List[]{
									new ArrayList(), new ArrayList(),
									new ArrayList()});
							}

							((List[]) superMap.get(collapsingClass))[extendedClassifiers
								.contains(collapsedSuperClass)
								? 0
								: 1].add(collapsingSuperClass);
						}

						collapsingClass.getESuperTypes().add(
							collapsingSuperClass);

						info("Created sub/super link between "
							+ getQualifiedName(collapsingClass) + " and "
							+ getQualifiedName(collapsingSuperClass)
							+ " based on package collapse.");
					}
				}

				// collapse attributes...
				for (Iterator collapsedAttributes = collapsedClass
					.getEAttributes().iterator(); collapsedAttributes.hasNext();) {

					EAttribute collapsedAttribute = (EAttribute) collapsedAttributes
						.next();
					EAttribute collapsingAttribute = null;

					for (Iterator collapsingAttributes = collapsingClass
						.getEAttributes().iterator(); collapsingAttributes
						.hasNext();) {

						EAttribute attribute = (EAttribute) collapsingAttributes
							.next();

						if (collapsedAttribute.getName().equals(
							attribute.getName())) {

							collapsingAttribute = attribute;

							collapsingAttribute.setDerived(collapsedAttribute
								.isDerived());
							collapsingAttribute
								.setLowerBound(getLesserCommonLowerBound(
									collapsingAttribute, collapsedAttribute));
							collapsingAttribute
								.setUpperBound(getGreaterCommonUpperBound(
									collapsingAttribute, collapsedAttribute));

							break;
						}
					}

					if (null == collapsingAttribute) {
						collapsingAttribute = ecoreFactory.createEAttribute();

						if (bounded.contains(collapsedAttribute)) {
							bounded.add(collapsingAttribute);
						}

						collapsingAttribute.setChangeable(collapsedAttribute
							.isChangeable());
						collapsingAttribute
							.setDefaultValueLiteral(collapsedAttribute
								.getDefaultValueLiteral());
						collapsingAttribute.setDerived(collapsedAttribute
							.isDerived());
						collapsingAttribute.setID(collapsedAttribute.isID());
						collapsingAttribute.setLowerBound(collapsedAttribute
							.getLowerBound());
						collapsingAttribute.setName(collapsedAttribute
							.getName());
						collapsingAttribute.setOrdered(collapsedAttribute
							.isOrdered());
						collapsingAttribute.setTransient(collapsedAttribute
							.isTransient());
						collapsingAttribute.setUnique(collapsedAttribute
							.isUnique());
						collapsingAttribute.setUnsettable(collapsedAttribute
							.isUnsettable());
						collapsingAttribute.setUpperBound(collapsedAttribute
							.getUpperBound());
						collapsingAttribute.setVolatile(collapsedAttribute
							.isVolatile());

						collapsingClass.getEStructuralFeatures().add(
							collapsingAttribute);

						info("Created attribute "
							+ getQualifiedName(collapsingAttribute) + " from "
							+ getQualifiedName(collapsedAttribute)
							+ " based on package collapse.");
					}

					// collapse union annotations...
					EAnnotation collapsedUnionAnnotation = collapsedAttribute
						.getEAnnotation(Generator.ANNOTATION_SOURCE__UNION);
					EAnnotation collapsingUnionAnnotation = collapsingAttribute
						.getEAnnotation(Generator.ANNOTATION_SOURCE__UNION);

					if (null != collapsedUnionAnnotation
						&& null == collapsingUnionAnnotation) {

						((EAnnotation) EcoreUtil.copy(collapsedUnionAnnotation))
							.setEModelElement(collapsingAttribute);
					}

					// collapse redefines annotations...
					EAnnotation collapsedRedefinesAnnotation = collapsedAttribute
						.getEAnnotation(Generator.ANNOTATION_SOURCE__REDEFINES);

					if (null != collapsedRedefinesAnnotation) {
						EAnnotation collapsingRedefinesAnnotation = collapsingAttribute
							.getEAnnotation(Generator.ANNOTATION_SOURCE__REDEFINES);

						if (null == collapsingRedefinesAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedRedefinesAnnotation))
								.setEModelElement(collapsingAttribute);
						} else {
							collapsingRedefinesAnnotation.getDetails()
								.putAll(
									collapsedRedefinesAnnotation.getDetails()
										.map());
						}
					}

					// collapse subsets annotations...
					EAnnotation collapsedSubsetsAnnotation = collapsedAttribute
						.getEAnnotation(Generator.ANNOTATION_SOURCE__SUBSETS);

					if (null != collapsedSubsetsAnnotation) {
						EAnnotation collapsingSubsetsAnnotation = collapsingAttribute
							.getEAnnotation(Generator.ANNOTATION_SOURCE__SUBSETS);

						if (null == collapsingSubsetsAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedSubsetsAnnotation))
								.setEModelElement(collapsingAttribute);
						} else {
							collapsingSubsetsAnnotation.getDetails().putAll(
								collapsedSubsetsAnnotation.getDetails().map());
						}
					}

					// collapse GenModel annotations...
					EAnnotation collapsedGenModelAnnotation = collapsedAttribute
						.getEAnnotation(GenModelPackage.eNS_URI);

					if (null != collapsedGenModelAnnotation) {
						EAnnotation collapsingGenModelAnnotation = collapsingAttribute
							.getEAnnotation(GenModelPackage.eNS_URI);

						if (null == collapsingGenModelAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedGenModelAnnotation))
								.setEModelElement(collapsingAttribute);
						} else {
							collapsingGenModelAnnotation.getDetails().putAll(
								collapsedGenModelAnnotation.getDetails().map());
						}
					}

					// collapse ExtendedMetaData annotations...
					EAnnotation collapsedExtendedMetaDataAnnotation = collapsedAttribute
						.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);

					if (null != collapsedExtendedMetaDataAnnotation) {
						EAnnotation collapsingExtendedMetaDataAnnotation = collapsingAttribute
							.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);

						if (null == collapsingExtendedMetaDataAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedExtendedMetaDataAnnotation))
								.setEModelElement(collapsingAttribute);
						} else {
							collapsingExtendedMetaDataAnnotation.getDetails()
								.putAll(
									collapsedExtendedMetaDataAnnotation
										.getDetails().map());
						}
					}

					collapsingAttribute.setEType(collapsedClassifiers
						.contains(collapsedAttribute.getEType())
						? collapse(collapsingPackage, collapsedAttribute
							.getEType(), superMap)
						: (extendedClassifiers.contains(collapsedAttribute
							.getEType())
							? collapse(extendedPackage, collapsedAttribute
								.getEType(), superMap)
							: collapsedAttribute.getEType()));
				}

				// collapse operations...
				for (Iterator collapsedOperations = collapsedClass
					.getEOperations().iterator(); collapsedOperations.hasNext();) {
					EOperation collapsedOperation = (EOperation) collapsedOperations
						.next();

					EOperation collapsingOperation = null;

					for (Iterator collapsingOperations = collapsingClass
						.getEOperations().iterator(); collapsingOperations
						.hasNext();) {

						EOperation operation = (EOperation) collapsingOperations
							.next();

						if (collapsedOperation.getName().equals(
							operation.getName())) {
							collapsingOperation = operation;

							break;
						}
					}

					if (null == collapsingOperation) {
						collapsingOperation = ecoreFactory.createEOperation();

						collapsingOperation.setName(collapsedOperation
							.getName());

						collapsingOperation.setOrdered(collapsedOperation
							.isOrdered());
						collapsingOperation.setUnique(collapsedOperation
							.isUnique());
						collapsingOperation.setUpperBound(collapsedOperation
							.getUpperBound());

						for (Iterator collapsedParameters = collapsedOperation
							.getEParameters().iterator(); collapsedParameters
							.hasNext();) {

							EParameter collapsedParameter = (EParameter) collapsedParameters
								.next();
							EParameter collapsingParameter = ecoreFactory
								.createEParameter();

							collapsingParameter.setName(collapsedParameter
								.getName());

							collapsingParameter
								.setEType(collapsedClassifiers
									.contains(collapsedParameter.getEType())
									? collapse(collapsingPackage,
										collapsedParameter.getEType(), superMap)
									: (extendedClassifiers
										.contains(collapsedParameter.getEType())
										? collapse(extendedPackage,
											collapsedParameter.getEType(),
											superMap)
										: collapsedParameter.getEType()));

							collapsingOperation.getEParameters().add(
								collapsingParameter);
						}

						for (Iterator collapsedExceptions = collapsedOperation
							.getEExceptions().iterator(); collapsedExceptions
							.hasNext();) {

							EClassifier collapsedException = (EClassifier) collapsedExceptions
								.next();

							collapsingOperation.getEExceptions().add(
								collapsedClassifiers
									.contains(collapsedException)
									? collapse(collapsingPackage,
										collapsedException, superMap)
									: (extendedClassifiers
										.contains(collapsedException)
										? collapse(extendedPackage,
											collapsedException, superMap)
										: collapsedException));
						}

						collapsingClass.getEOperations().add(
							collapsingOperation);

						info("Created operation "
							+ getQualifiedName(collapsingOperation) + " from "
							+ getQualifiedName(collapsedOperation)
							+ " based on package collapse.");
					}

					// collapse GenModel annotations...
					EAnnotation collapsedGenModelAnnotation = collapsedOperation
						.getEAnnotation(GenModelPackage.eNS_URI);

					if (null != collapsedGenModelAnnotation) {
						EAnnotation collapsingGenModelAnnotation = collapsingOperation
							.getEAnnotation(GenModelPackage.eNS_URI);

						if (null == collapsingGenModelAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedGenModelAnnotation))
								.setEModelElement(collapsingOperation);
						} else {
							collapsingGenModelAnnotation.getDetails().putAll(
								collapsedGenModelAnnotation.getDetails().map());
						}
					}

					collapsingOperation.setEType(collapsedClassifiers
						.contains(collapsedOperation.getEType())
						? collapse(collapsingPackage, collapsedOperation
							.getEType(), superMap)
						: (extendedClassifiers.contains(collapsedOperation
							.getEType())
							? collapse(extendedPackage, collapsedOperation
								.getEType(), superMap)
							: collapsedOperation.getEType()));
				}

				// collapse references...
				for (Iterator collapsedReferences = collapsedClass
					.getEReferences().iterator(); collapsedReferences.hasNext();) {

					EReference collapsedReference = (EReference) collapsedReferences
						.next();
					EReference collapsingReference = null;

					for (Iterator collapsingReferences = collapsingClass
						.getEReferences().iterator(); collapsingReferences
						.hasNext();) {

						EReference reference = (EReference) collapsingReferences
							.next();

						if (collapsedReference.getName().equals(
							reference.getName())) {
							collapsingReference = reference;

							collapsingReference.setDerived(collapsedReference
								.isDerived());
							collapsingReference
								.setLowerBound(getLesserCommonLowerBound(
									collapsingReference, collapsedReference));
							collapsingReference
								.setUpperBound(getGreaterCommonUpperBound(
									collapsingReference, collapsedReference));

							break;
						}
					}

					if (null == collapsingReference) {
						collapsingReference = ecoreFactory.createEReference();

						if (bounded.contains(collapsedReference)) {
							bounded.add(collapsingReference);
						}

						collapsingReference.setChangeable(collapsedReference
							.isChangeable());
						collapsingReference.setContainment(collapsedReference
							.isContainment());
						collapsingReference
							.setDefaultValueLiteral(collapsedReference
								.getDefaultValueLiteral());
						collapsingReference.setDerived(collapsedReference
							.isDerived());
						collapsingReference.setLowerBound(collapsedReference
							.getLowerBound());
						collapsingReference.setName(collapsedReference
							.getName());
						collapsingReference.setOrdered(collapsedReference
							.isOrdered());
						collapsingReference
							.setResolveProxies(collapsedReference
								.isResolveProxies());
						collapsingReference.setTransient(collapsedReference
							.isTransient());
						collapsingReference.setUnique(collapsedReference
							.isUnique());
						collapsingReference.setUnsettable(collapsedReference
							.isUnsettable());
						collapsingReference.setUpperBound(collapsedReference
							.getUpperBound());
						collapsingReference.setVolatile(collapsedReference
							.isVolatile());

						collapsingClass.getEStructuralFeatures().add(
							collapsingReference);

						info("Created reference "
							+ getQualifiedName(collapsingReference) + " from "
							+ getQualifiedName(collapsedReference)
							+ " based on package collapse.");

						if (collapsedClassifiers.contains(collapsedReference
							.getEReferenceType())) {
							collapsingReference.setEType(collapse(
								collapsingPackage, collapsedReference
									.getEReferenceType(), superMap));

							EReference collapsedOpposite = collapsedReference
								.getEOpposite();

							if (null != collapsedOpposite) {
								EReference collapsingOpposite = null;

								for (Iterator collapsingOpposites = collapsingReference
									.getEReferenceType().getEReferences()
									.iterator(); collapsingOpposites.hasNext();) {
									EReference opposite = (EReference) collapsingOpposites
										.next();

									if (collapsedOpposite.getName().equals(
										opposite.getName())) {
										collapsingOpposite = opposite;

										break;
									}
								}

								if (null != collapsingOpposite
									&& null == collapsingOpposite
										.getEOpposite()) {
									collapsingReference
										.setEOpposite(collapsingOpposite);
									collapsingOpposite
										.setEOpposite(collapsingReference);
								}
							}
						} else {
							collapsingReference.setEType(extendedClassifiers
								.contains(collapsedReference
									.getEReferenceType())
								? collapse(extendedPackage, collapsedReference
									.getEReferenceType(), superMap)
								: collapsedReference.getEReferenceType());
						}
					}

					// collapse union annotations...
					EAnnotation collapsedUnionAnnotation = collapsedReference
						.getEAnnotation(Generator.ANNOTATION_SOURCE__UNION);
					EAnnotation collapsingUnionAnnotation = collapsingReference
						.getEAnnotation(Generator.ANNOTATION_SOURCE__UNION);

					if (null != collapsedUnionAnnotation
						&& null == collapsingUnionAnnotation) {
						((EAnnotation) EcoreUtil.copy(collapsedUnionAnnotation))
							.setEModelElement(collapsingReference);
					}

					// collapse redefines annotations...
					EAnnotation collapsedRedefinesAnnotation = collapsedReference
						.getEAnnotation(Generator.ANNOTATION_SOURCE__REDEFINES);

					if (null != collapsedRedefinesAnnotation) {
						EAnnotation collapsingRedefinesAnnotation = collapsingReference
							.getEAnnotation(Generator.ANNOTATION_SOURCE__REDEFINES);

						if (null == collapsingRedefinesAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedRedefinesAnnotation))
								.setEModelElement(collapsingReference);
						} else {
							collapsingRedefinesAnnotation.getDetails()
								.putAll(
									collapsedRedefinesAnnotation.getDetails()
										.map());
						}
					}

					// collapse subsets annotations...
					EAnnotation collapsedSubsetsAnnotation = collapsedReference
						.getEAnnotation(Generator.ANNOTATION_SOURCE__SUBSETS);

					if (null != collapsedSubsetsAnnotation) {
						EAnnotation collapsingSubsetsAnnotation = collapsingReference
							.getEAnnotation(Generator.ANNOTATION_SOURCE__SUBSETS);

						if (null == collapsingSubsetsAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedSubsetsAnnotation))
								.setEModelElement(collapsingReference);
						} else {
							collapsingSubsetsAnnotation.getDetails().putAll(
								collapsedSubsetsAnnotation.getDetails().map());
						}
					}

					// collapse GenModel annotations...
					EAnnotation collapsedGenModelAnnotation = collapsedReference
						.getEAnnotation(GenModelPackage.eNS_URI);

					if (null != collapsedGenModelAnnotation) {
						EAnnotation collapsingGenModelAnnotation = collapsingReference
							.getEAnnotation(GenModelPackage.eNS_URI);

						if (null == collapsingGenModelAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedGenModelAnnotation))
								.setEModelElement(collapsingReference);
						} else {
							collapsingGenModelAnnotation.getDetails().putAll(
								collapsedGenModelAnnotation.getDetails().map());
						}
					}

					// collapse ExtendedMetaData annotations...
					EAnnotation collapsedExtendedMetaDataAnnotation = collapsedReference
						.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);

					if (null != collapsedExtendedMetaDataAnnotation) {
						EAnnotation collapsingExtendedMetaDataAnnotation = collapsingReference
							.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);

						if (null == collapsingExtendedMetaDataAnnotation) {
							((EAnnotation) EcoreUtil
								.copy(collapsedExtendedMetaDataAnnotation))
								.setEModelElement(collapsingReference);
						} else {
							collapsingExtendedMetaDataAnnotation.getDetails()
								.putAll(
									collapsedExtendedMetaDataAnnotation
										.getDetails().map());
						}
					}
				}

				// collapse inclusions annotations...
				EAnnotation collapsedInclusionsAnnotation = collapsedClass
					.getEAnnotation(ANNOTATION_SOURCE__INCLUSIONS);

				if (null != collapsedInclusionsAnnotation) {
					EAnnotation collapsingInclusionsAnnotation = collapsingClass
						.getEAnnotation(ANNOTATION_SOURCE__INCLUSIONS);

					if (null == collapsingInclusionsAnnotation) {
						((EAnnotation) EcoreUtil
							.copy(collapsedInclusionsAnnotation))
							.setEModelElement(collapsingClass);
					} else {
						collapsingInclusionsAnnotation.getDetails().putAll(
							collapsedInclusionsAnnotation.getDetails().map());
					}
				}
			}
		}
	}

	protected void calculateFeatureInclusions(EObject object) {
		new EcoreSwitch() {

			public Object caseEClass(EClass eClass) {
				EAnnotation inclusionsAnnotation = getOrCreateAnnotation(
					ANNOTATION_SOURCE__INCLUSIONS, eClass);

				for (Iterator eStructuralFeatures = eClass
					.getEAllStructuralFeatures().iterator(); eStructuralFeatures
					.hasNext();) {

					inclusionsAnnotation.getDetails().put(
						((EStructuralFeature) eStructuralFeatures.next())
							.getName(), "");
				}

				return this;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator contents = eObject.eContents().iterator(); contents
					.hasNext();) {

					calculateFeatureInclusions((EObject) contents.next());
				}

				return this;
			}
		}.doSwitch(object);
	}

	protected void calculateFeatureExclusions(EObject object) {
		new EcoreSwitch() {

			public Object caseEClass(EClass eClass) {
				EAnnotation exclusionsAnnotation = getOrCreateAnnotation(
					ANNOTATION_SOURCE__EXCLUSIONS, eClass);

				for (Iterator eStructuralFeatures = eClass
					.getEAllStructuralFeatures().iterator(); eStructuralFeatures
					.hasNext();) {

					EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
						.next();

					if (!getOrCreateAnnotation(ANNOTATION_SOURCE__INCLUSIONS,
						eClass).getDetails().containsKey(
						eStructuralFeature.getName())) {

						exclusionsAnnotation.getDetails().put(
							eStructuralFeature.getName(), "");
					}
				}

				return this;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator contents = eObject.eContents().iterator(); contents
					.hasNext();) {

					calculateFeatureExclusions((EObject) contents.next());
				}

				return this;
			}
		}.doSwitch(object);
	}

	protected EAnnotation createAnnotation(String source,
			EModelElement eModelElement) {
		EAnnotation eAnnotation = ecoreFactory.createEAnnotation();

		eAnnotation.setSource(source);
		eAnnotation.setEModelElement(eModelElement);

		return eAnnotation;
	}

	protected EAnnotation getOrCreateAnnotation(String source,
			EModelElement eModelElement) {
		EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

		if (null == eAnnotation) {
			eAnnotation = createAnnotation(source, eModelElement);
		}

		return eAnnotation;
	}

	protected void copyAnnotation(String source,
			EModelElement fromModelElement, EModelElement toModelElement) {
		EAnnotation eAnnotation = fromModelElement.getEAnnotation(source);

		if (null != eAnnotation) {
			toModelElement.getEAnnotations().add(EcoreUtil.copy(eAnnotation));
		}
	}

	public void processAnnotations(EObject eObject) {
		new EcoreSwitch() {

			public Object caseEStructuralFeature(
					EStructuralFeature eStructuralFeature) {
				EAnnotation redefinesAnnotation = eStructuralFeature
					.getEAnnotation(Generator.ANNOTATION_SOURCE__REDEFINES);

				if (null != redefinesAnnotation) {

					for (Iterator entries = redefinesAnnotation.getDetails()
						.iterator(); entries.hasNext();) {

						Map.Entry entry = (Map.Entry) entries.next();

						EStructuralFeature redefinedStructuralFeature = eStructuralFeature
							.getEContainingClass().getEStructuralFeature(
								(String) entry.getKey());

						if (null == redefinedStructuralFeature) {
							warning(getQualifiedName(eStructuralFeature)
								+ " redefines unknown feature '"
								+ entry.getKey() + "'.");
						} else {

							if (eStructuralFeature != redefinedStructuralFeature) {
								redefinesAnnotation.getReferences().add(
									redefinedStructuralFeature);
							}
						}

						entries.remove();
					}

					if (redefinesAnnotation.getReferences().isEmpty()) {
						eStructuralFeature.getEAnnotations().remove(
							redefinesAnnotation);
					}
				}

				EAnnotation subsetsAnnotation = eStructuralFeature
					.getEAnnotation(Generator.ANNOTATION_SOURCE__SUBSETS);

				if (null != subsetsAnnotation) {

					for (Iterator entries = subsetsAnnotation.getDetails()
						.iterator(); entries.hasNext();) {

						Map.Entry entry = (Map.Entry) entries.next();

						EStructuralFeature subsettedStructuralFeature = eStructuralFeature
							.getEContainingClass().getEStructuralFeature(
								(String) entry.getKey());

						if (null == subsettedStructuralFeature) {
							warning(getQualifiedName(eStructuralFeature)
								+ " subsets unknown feature '" + entry.getKey()
								+ "'.");
						} else {

							if (eStructuralFeature != subsettedStructuralFeature) {
								subsetsAnnotation.getReferences().add(
									subsettedStructuralFeature);
							}
						}

						entries.remove();
					}

					if (subsetsAnnotation.getReferences().isEmpty()) {
						eStructuralFeature.getEAnnotations().remove(
							subsetsAnnotation);
					}
				}

				return eStructuralFeature;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator contents = eObject.eContents().iterator(); contents
					.hasNext();) {

					doSwitch((EObject) contents.next());
				}

				return super.defaultCase(eObject);
			}
		}.doSwitch(eObject);
	}

	public void processUnionFeatures(EObject eObject) {
		new EcoreSwitch() {

			public Object caseEStructuralFeature(
					EStructuralFeature eStructuralFeature) {

				if (Generator.isUnion(eStructuralFeature)) {
					eStructuralFeature.setDerived(true);
				}

				return eStructuralFeature;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator eContents = eObject.eContents().iterator(); eContents
					.hasNext();) {

					doSwitch((EObject) eContents.next());
				}

				return super.defaultCase(eObject);
			}
		}.doSwitch(eObject);
	}

	public void processDerivedFeatures(EObject eObject) {
		new EcoreSwitch() {

			public Object caseEStructuralFeature(
					EStructuralFeature eStructuralFeature) {

				if (eStructuralFeature.isDerived()) {
					eStructuralFeature.setChangeable(false);
					eStructuralFeature.setTransient(true);

					if (eStructuralFeature instanceof EReference) {
						EReference eReference = (EReference) eStructuralFeature;

						eReference.setContainment(false);

						EReference eOpposite = eReference.getEOpposite();

						if (null != eOpposite) {
							eOpposite.setDerived(true);

							eOpposite.setChangeable(false);
							eOpposite.setTransient(true);

							eOpposite.setContainment(false);

							if (!Generator.isUnion(eOpposite)) {
								eOpposite.setVolatile(true);
							}
						}
					}

					if (!Generator.isUnion(eStructuralFeature)) {
						eStructuralFeature.setVolatile(true);
					}
				}

				return eStructuralFeature;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator eContents = eObject.eContents().iterator(); eContents
					.hasNext();) {

					doSwitch((EObject) eContents.next());
				}

				return super.defaultCase(eObject);
			}
		}.doSwitch(eObject);
	}

	protected void makeVolatile(EStructuralFeature eStructuralFeature) {
		eStructuralFeature.setVolatile(true);

		if (eStructuralFeature instanceof EReference) {
			EReference eReference = (EReference) eStructuralFeature;

			if (null != eReference.getEOpposite()) {
				eReference.getEOpposite().setVolatile(true);
			}
		}
	}

	protected void makeCompatible(ETypedElement eTypedElement,
			ETypedElement otherETypedElement) {

		if (eTypedElement.isRequired() != otherETypedElement.isRequired()) {

			int lesserLowerBound = getLesserCommonLowerBound(
				otherETypedElement, eTypedElement);

			if (lesserLowerBound != otherETypedElement.getLowerBound()) {
				warning("Changed lower bound of "
					+ getQualifiedName(otherETypedElement) + " from "
					+ otherETypedElement.getLowerBound() + " to "
					+ lesserLowerBound);

				otherETypedElement.setLowerBound(lesserLowerBound);
			}

			if (lesserLowerBound != eTypedElement.getLowerBound()) {
				info("Changed lower bound of "
					+ getQualifiedName(eTypedElement) + " from "
					+ eTypedElement.getLowerBound() + " to " + lesserLowerBound);

				eTypedElement.setLowerBound(lesserLowerBound);
			}
		}

		if (eTypedElement.isMany() != otherETypedElement.isMany()) {
			int greaterUpperBound = getGreaterCommonUpperBound(
				otherETypedElement, eTypedElement);

			if (greaterUpperBound != otherETypedElement.getUpperBound()) {
				warning("Changed upper bound of "
					+ getQualifiedName(otherETypedElement) + " from "
					+ otherETypedElement.getUpperBound() + " to "
					+ greaterUpperBound);

				otherETypedElement.setUpperBound(greaterUpperBound);
			}

			if (greaterUpperBound != eTypedElement.getUpperBound()) {
				info("Changed upper bound of "
					+ getQualifiedName(eTypedElement) + " from "
					+ eTypedElement.getUpperBound() + " to "
					+ greaterUpperBound);

				eTypedElement.setUpperBound(greaterUpperBound);
			}
		}

		if (!eTypedElement.isMany() && !otherETypedElement.isMany()) {
			EClassifier commonEType = getCommonEType(otherETypedElement,
				eTypedElement);

			if (commonEType != otherETypedElement.getEType()) {
				warning("Changed type of "
					+ getQualifiedName(otherETypedElement) + " from "
					+ getQualifiedName(otherETypedElement.getEType()) + " to "
					+ getQualifiedName(commonEType));

				otherETypedElement.setEType(commonEType);
			}

			if (commonEType != eTypedElement.getEType()) {
				info("Changed type of " + getQualifiedName(eTypedElement)
					+ " from " + getQualifiedName(eTypedElement.getEType())
					+ " to " + getQualifiedName(commonEType));

				eTypedElement.setEType(commonEType);
			}
		}

		eTypedElement.setOrdered(otherETypedElement.isOrdered());

		eTypedElement.setUnique(otherETypedElement.isUnique());
	}

	protected void makeNameQualified(ETypedElement eTypedElement) {
		EObject eContainer = eTypedElement.eContainer();

		if (eContainer instanceof ENamedElement) {
			String qualifiedName = ((ENamedElement) eContainer).getName() + '_'
				+ eTypedElement.getName();

			qualifiedName = qualifiedName.substring(0, 1).toLowerCase()
				+ qualifiedName.substring(1);

			info("Renaming " + getQualifiedName(eTypedElement) + " from "
				+ eTypedElement.getName() + " to " + qualifiedName + ".");

			eTypedElement.setName(qualifiedName);
		}
	}

	public void processDuplicateFeatures(EObject eObject) {
		final Set featuresToDuplicate = new HashSet();

		new EcoreSwitch() {

			public Object caseEClass(EClass eClass) {

				for (Iterator eAttributes = eClass.getEAttributes().iterator(); eAttributes
					.hasNext();) {

					EAttribute eAttribute = (EAttribute) eAttributes.next();

					for (Iterator eAllAttributes = eClass.getEAllAttributes()
						.iterator(); eAllAttributes.hasNext();) {

						EAttribute eAllAttribute = (EAttribute) eAllAttributes
							.next();

						if (eAttribute == eAllAttribute) {
							break;
						} else if (eAttribute.getName().equals(
							eAllAttribute.getName())) {

							if (!featuresToDuplicate.contains(eAttribute)) {
								featuresToDuplicate.add(eAllAttribute
									.isDerived()
									&& !eAttribute.isDerived()
									? eAllAttribute
									: eAttribute);
							}

							makeCompatible(eAllAttribute, eAttribute);

							getOrCreateAnnotation(
								Generator.ANNOTATION_SOURCE__REDEFINES,
								eAttribute).getReferences().add(eAllAttribute);
						}
					}
				}

				for (Iterator eReferences = eClass.getEReferences().iterator(); eReferences
					.hasNext();) {

					EReference eReference = (EReference) eReferences.next();

					for (Iterator eAllReferences = eClass.getEAllReferences()
						.iterator(); eAllReferences.hasNext();) {

						EReference eAllReference = (EReference) eAllReferences
							.next();

						if (eReference == eAllReference) {
							break;
						} else if (eReference.getName().equals(
							eAllReference.getName())) {

							if (!featuresToDuplicate.contains(eReference)) {

								if (isContainer(eReference)
									&& 1 != eAllReference.getUpperBound()) {

									makeNameQualified(eReference);

									makeVolatile(eReference);
								} else {
									featuresToDuplicate.add(eAllReference
										.isDerived()
										&& !eReference.isDerived()
										? eAllReference
										: eReference);

									makeCompatible(eAllReference, eReference);
								}
							} else {
								makeCompatible(eAllReference, eReference);
							}

							getOrCreateAnnotation(
								Generator.ANNOTATION_SOURCE__REDEFINES,
								eReference).getReferences().add(eAllReference);
						}
					}
				}

				if (eClass.getESuperTypes().size() > 1) {
					Iterator eSuperTypes = eClass.getESuperTypes().iterator();
					eSuperTypes.next();

					while (eSuperTypes.hasNext()) {
						EClass eMixinType = (EClass) eSuperTypes.next();

						for (Iterator eMixinFeatures = eMixinType
							.getEAllStructuralFeatures().iterator(); eMixinFeatures
							.hasNext();) {

							EStructuralFeature eMixinFeature = (EStructuralFeature) eMixinFeatures
								.next();

							for (Iterator eAllFeatures = eClass
								.getEAllStructuralFeatures().iterator(); eAllFeatures
								.hasNext();) {

								EStructuralFeature eAllFeature = (EStructuralFeature) eAllFeatures
									.next();

								if (eMixinFeature == eAllFeature) {
									break;
								} else if (eMixinFeature.getName().equals(
									eAllFeature.getName())) {

									if (!featuresToDuplicate
										.contains(eMixinFeature)
										&& !featuresToDuplicate
											.contains(eAllFeature)) {

										makeNameQualified(eMixinFeature);

										makeVolatile(eMixinFeature);

										getOrCreateAnnotation(
											Generator.ANNOTATION_SOURCE__REDEFINES,
											eMixinFeature).getReferences().add(
											eAllFeature);
									}
								}
							}
						}
					}
				}

				return eClass;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator contents = eObject.eContents().iterator(); contents
					.hasNext();) {

					doSwitch((EObject) contents.next());
				}

				return super.defaultCase(eObject);
			}
		}.doSwitch(eObject);

		for (Iterator eStructuralFeatures = featuresToDuplicate.iterator(); eStructuralFeatures
			.hasNext();) {

			EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
				.next();

			getOrCreateAnnotation(Generator.ANNOTATION_SOURCE__DUPLICATES,
				eStructuralFeature.getEContainingClass()).getContents().add(
				eStructuralFeature);

			if (eStructuralFeature instanceof EReference) {
				EReference eOpposite = ((EReference) eStructuralFeature)
					.getEOpposite();

				if (null != eOpposite
					&& !featuresToDuplicate.contains(eOpposite)) {

					eOpposite.setEOpposite(null);

					if (isContainment(eStructuralFeature)) {
						eOpposite.setChangeable(false);
						eOpposite.setTransient(true);
					}

					makeVolatile(eOpposite);
				}
			}

		}
	}

	public void processDuplicateOperations(EObject eObject) {
		final Set operationsToDuplicate = new HashSet();

		new EcoreSwitch() {

			public Object caseEClass(EClass eClass) {

				for (Iterator eOperations = eClass.getEOperations().iterator(); eOperations
					.hasNext();) {

					EOperation eOperation = (EOperation) eOperations.next();

					eAllOperationsLoop : for (Iterator eAllOperations = eClass
						.getEAllOperations().iterator(); eAllOperations
						.hasNext();) {

						EOperation eAllOperation = (EOperation) eAllOperations
							.next();

						if (eOperation == eAllOperation) {
							break;
						} else if (eOperation.getName().equals(
							eAllOperation.getName())
							&& eOperation.getEParameters().size() == eAllOperation
								.getEParameters().size()) {

							for (int index = 0; index < eOperation
								.getEParameters().size(); index++) {

								if (((EParameter) eOperation.getEParameters()
									.get(index)).getEType() != ((EParameter) eAllOperation
									.getEParameters().get(index)).getEType()) {

									continue eAllOperationsLoop;
								}
							}

							operationsToDuplicate.add(eOperation);

							makeCompatible(eAllOperation, eOperation);

							getOrCreateAnnotation(
								Generator.ANNOTATION_SOURCE__REDEFINES,
								eOperation).getReferences().add(eAllOperation);
						}
					}
				}

				if (eClass.getESuperTypes().size() > 1) {
					Iterator eSuperTypes = eClass.getESuperTypes().iterator();
					eSuperTypes.next();

					while (eSuperTypes.hasNext()) {
						EClass eMixinType = (EClass) eSuperTypes.next();

						for (Iterator eMixinOperations = eMixinType
							.getEAllOperations().iterator(); eMixinOperations
							.hasNext();) {

							EOperation eMixinOperation = (EOperation) eMixinOperations
								.next();

							eAllOpertationsLoop : for (Iterator eAllOperations = eClass
								.getEAllOperations().iterator(); eAllOperations
								.hasNext();) {

								EOperation eAllOperation = (EOperation) eAllOperations
									.next();

								if (eMixinOperation == eAllOperation) {
									break;
								} else if (eMixinOperation.getName().equals(
									eAllOperation.getName())
									&& eMixinOperation.getEParameters().size() == eAllOperation
										.getEParameters().size()) {

									for (int index = 0; index < eMixinOperation
										.getEParameters().size(); index++) {

										if (((EParameter) eMixinOperation
											.getEParameters().get(index))
											.getEType() != ((EParameter) eAllOperation
											.getEParameters().get(index))
											.getEType()) {

											continue eAllOpertationsLoop;
										}
									}

									if (!operationsToDuplicate
										.contains(eMixinOperation)
										&& !operationsToDuplicate
											.contains(eAllOperation)) {

										makeNameQualified(eMixinOperation);

										getOrCreateAnnotation(
											Generator.ANNOTATION_SOURCE__REDEFINES,
											eMixinOperation).getReferences()
											.add(eAllOperation);
									}
								}
							}
						}
					}
				}

				return eClass;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator contents = eObject.eContents().iterator(); contents
					.hasNext();) {

					doSwitch((EObject) contents.next());
				}

				return super.defaultCase(eObject);
			}
		}.doSwitch(eObject);

		for (Iterator eOperations = operationsToDuplicate.iterator(); eOperations
			.hasNext();) {

			EOperation eOperation = (EOperation) eOperations.next();

			getOrCreateAnnotation(Generator.ANNOTATION_SOURCE__DUPLICATES,
				eOperation.getEContainingClass()).getContents().add(eOperation);
		}
	}

	public void processSubsetsAnnotations(EObject eObject) {
		new EcoreSwitch() {

			public Object caseEClass(EClass eClass) {

				for (Iterator eStructuralFeatures = eClass
					.getEStructuralFeatures().iterator(); eStructuralFeatures
					.hasNext();) {

					EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
						.next();
					EAnnotation subsetsAnnotation = eStructuralFeature
						.getEAnnotation(Generator.ANNOTATION_SOURCE__SUBSETS);

					if (null != subsetsAnnotation) {

						for (Iterator subsettedStructuralFeatures = new ArrayList(
							subsetsAnnotation.getReferences()).iterator(); subsettedStructuralFeatures
							.hasNext();) {

							EStructuralFeature subsettedStructuralFeature = (EStructuralFeature) subsettedStructuralFeatures
								.next();

							if (!Generator.isUnion(subsettedStructuralFeature)
								&& null != subsettedStructuralFeature
									.getEContainingClass()) {

								if (isContainment(subsettedStructuralFeature)) {
									((EReference) eStructuralFeature)
										.setResolveProxies(false);

									if (isContainment(eStructuralFeature)) {
										((EReference) eStructuralFeature)
											.setContainment(false);
									}
								}
							}
						}
					}
				}

				return eClass;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator contents = eObject.eContents().iterator(); contents
					.hasNext();) {

					doSwitch((EObject) contents.next());
				}

				return super.defaultCase(eObject);
			}
		}.doSwitch(eObject);
	}

	public void dumpFeatureCounts(EObject eObject) {
		new EcoreSwitch() {

			public Object caseEClass(EClass eClass) {
				int changeableCount = 0;
				int manyCount = 0;
				int requiredCount = 0;
				int transientCount = 0;
				int uniqueCount = 0;
				int unsettableCount = 0;
				int volatileCount = 0;

				int containerCount = 0;
				int containmentCount = 0;

				int derivedCount = 0;
				int redefinitionCount = 0;
				int subsetCount = 0;
				int unionCount = 0;

				for (Iterator eStructuralFeatures = eClass
					.getEAllStructuralFeatures().iterator(); eStructuralFeatures
					.hasNext();) {

					EStructuralFeature eStructuralFeature = (EStructuralFeature) eStructuralFeatures
						.next();

					if (eStructuralFeature.isChangeable()) {
						changeableCount++;
					}

					if (eStructuralFeature.isMany()) {
						manyCount++;
					}

					if (eStructuralFeature.isRequired()) {
						requiredCount++;
					}

					if (eStructuralFeature.isTransient()) {
						transientCount++;
					}

					if (eStructuralFeature.isUnique()) {
						uniqueCount++;
					}

					if (eStructuralFeature.isUnsettable()) {
						unsettableCount++;
					}

					if (eStructuralFeature.isVolatile()) {
						volatileCount++;
					}

					if (isContainer(eStructuralFeature)) {
						containerCount++;
					}

					if (isContainment(eStructuralFeature)) {
						containmentCount++;
					}

					if (eStructuralFeature.isDerived()) {
						derivedCount++;
					}

					if (Generator.isRedefinition(eStructuralFeature)) {
						redefinitionCount++;
					}

					if (Generator.isSubset(eStructuralFeature)) {
						subsetCount++;
					}

					if (Generator.isUnion(eStructuralFeature)) {
						unionCount++;
					}
				}

				int inclusionsCount = 0;
				int derivedInclusionsCount = 0;
				int transientInclusionsCount = 0;

				for (Iterator featureNames = getOrCreateAnnotation(
					ANNOTATION_SOURCE__INCLUSIONS, eClass).getDetails()
					.keySet().iterator(); featureNames.hasNext();) {

					EStructuralFeature includedFeature = (EStructuralFeature) eClass
						.getEStructuralFeature((String) featureNames.next());

					if (null != includedFeature) {
						inclusionsCount++;

						if (includedFeature.isDerived()) {
							derivedInclusionsCount++;
						}

						if (includedFeature.isTransient()) {
							transientInclusionsCount++;
						}
					}
				}

				int exclusionsCount = 0;
				int derivedExclusionsCount = 0;
				int transientExclusionsCount = 0;

				for (Iterator featureNames = getOrCreateAnnotation(
					ANNOTATION_SOURCE__EXCLUSIONS, eClass).getDetails()
					.keySet().iterator(); featureNames.hasNext();) {

					EStructuralFeature excludedFeature = (EStructuralFeature) eClass
						.getEStructuralFeature((String) featureNames.next());

					if (null != excludedFeature) {
						exclusionsCount++;

						if (excludedFeature.isDerived()) {
							derivedExclusionsCount++;
						}

						if (excludedFeature.isTransient()) {
							transientExclusionsCount++;
						}
					}
				}

				info(getQualifiedName(eClass) + ": " + changeableCount
					+ " CH, " + manyCount + " MA, " + requiredCount + " RE, "
					+ transientCount + " TR, " + uniqueCount + " UQ, "
					+ unsettableCount + " US, " + volatileCount + " VO, "
					+ containerCount + " CR, " + containmentCount + " CT, "
					+ derivedCount + " DE, " + redefinitionCount + " RN, "
					+ subsetCount + " SB, " + unionCount + " UO, "
					+ inclusionsCount + " IN, " + derivedInclusionsCount
					+ " ID, " + transientInclusionsCount + " IT, "
					+ exclusionsCount + " EX, " + derivedExclusionsCount
					+ " ED, " + transientExclusionsCount + " ET, "
					+ eClass.getEAllStructuralFeatures().size() + " TO");

				return this;
			}

			public Object defaultCase(EObject eObject) {

				for (Iterator contents = eObject.eContents().iterator(); contents
					.hasNext();) {

					doSwitch((EObject) contents.next());
				}

				return this;
			}
		}.doSwitch(eObject);
	}

	protected String getQualifiedName(EClassifier classifier) {
		StringBuffer sb = new StringBuffer();

		if (null == classifier) {
			sb.append("<null>");
		} else {
			List information = (List) roseUtil.getEPackageToInformationMap()
				.get(classifier.getEPackage());

			if (null != information) {
				sb.append((String) information.get(0));
				sb.append(".");
			}

			sb.append(classifier.getEPackage().getName());
			sb.append(".");
			sb.append(classifier.getName());
		}

		return sb.toString();
	}

	protected String getQualifiedName(EStructuralFeature structuralFeature) {
		StringBuffer sb = new StringBuffer();

		sb.append(getQualifiedName(structuralFeature.getEContainingClass()));
		sb.append(".");
		sb.append(structuralFeature.getName());

		return sb.toString();
	}

	protected String getQualifiedName(EOperation operation) {
		StringBuffer sb = new StringBuffer();

		sb.append(getQualifiedName(operation.getEContainingClass()));
		sb.append("#");
		sb.append(operation.getName());

		return sb.toString();
	}

	protected String getQualifiedName(ETypedElement eTypedElement) {
		return (String) new EcoreSwitch() {

			public Object caseEOperation(EOperation eOperation) {
				return getQualifiedName(eOperation);
			}

			public Object caseEStructuralFeature(
					EStructuralFeature eStructuralFeature) {
				return getQualifiedName(eStructuralFeature);
			}

			public Object defaultCase(EObject eObject) {
				return ((ETypedElement) eObject).getName();
			}
		}.doSwitch(eTypedElement);
	}

	protected void info(String message) {
		System.err.println("-->Info: " + message);
	}

	protected EClassifier getCommonEType(ETypedElement redefiningTypedElement,
			ETypedElement redefinedTypedElement) {

		if (redefiningTypedElement.getEType().equals(
			redefinedTypedElement.getEType())) {

			return redefiningTypedElement.getEType();
		}

		if (redefiningTypedElement.getEType() instanceof EEnum) {

			if (redefinedTypedElement.getEType() instanceof EEnum) {
				return ecorePackage.getEEnumerator();
			}

			return ecorePackage.getEJavaObject();
		}

		if (redefiningTypedElement.getEType() instanceof EDataType) {
			EDataType redefiningDataType = (EDataType) redefiningTypedElement
				.getEType();

			if (redefinedTypedElement.getEType() instanceof EDataType) {
				EDataType redefinedDataType = (EDataType) redefinedTypedElement
					.getEType();

				if (redefiningDataType.getInstanceClass().equals(
					redefinedDataType.getInstanceClass())) {
					return getBasicType(redefiningDataType
						.getInstanceClassName());
				}
			}

			return ecorePackage.getEJavaObject();
		}

		if (redefiningTypedElement.getEType() instanceof EClass) {
			EClass redefiningClass = (EClass) redefiningTypedElement.getEType();

			if (redefinedTypedElement.getEType() instanceof EClass) {
				EClass redefinedClass = (EClass) redefinedTypedElement
					.getEType();

				if (redefinedClass.isSuperTypeOf(redefiningClass)) {
					return redefinedClass;
				}

				if (redefiningClass.isSuperTypeOf(redefinedClass)) {
					return redefiningClass;
				}

				for (Iterator redefinedSuperTypes = redefinedClass
					.getEAllSuperTypes().iterator(); redefinedSuperTypes
					.hasNext();) {

					EClass redefinedSuperType = (EClass) redefinedSuperTypes
						.next();

					if (redefinedSuperType.isSuperTypeOf(redefiningClass)) {
						return redefinedSuperType;
					}
				}

				for (Iterator redefiningSuperTypes = redefiningClass
					.getEAllSuperTypes().iterator(); redefiningSuperTypes
					.hasNext();) {

					EClass redefiningSuperType = (EClass) redefiningSuperTypes
						.next();

					if (redefiningSuperType.isSuperTypeOf(redefinedClass)) {
						return redefiningSuperType;
					}
				}
			}
		}

		return ecorePackage.getEObject();
	}

	protected int getGreaterCommonUpperBound(ETypedElement eTypedElement,
			ETypedElement otherETypedElement) {

		if (EStructuralFeature.UNBOUNDED_MULTIPLICITY == otherETypedElement
			.getUpperBound()
			|| EStructuralFeature.UNBOUNDED_MULTIPLICITY == eTypedElement
				.getUpperBound()) {

			return EStructuralFeature.UNBOUNDED_MULTIPLICITY;
		}

		if (otherETypedElement.getUpperBound() >= eTypedElement.getUpperBound()) {
			return otherETypedElement.getUpperBound();
		} else {
			return eTypedElement.getUpperBound();
		}
	}

	protected int getLesserCommonLowerBound(ETypedElement eTypedElement,
			ETypedElement otherETypedElement) {

		if (otherETypedElement.getLowerBound() <= eTypedElement.getLowerBound()) {
			return otherETypedElement.getLowerBound();
		} else {
			return eTypedElement.getLowerBound();
		}
	}

	protected boolean isContainer(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature instanceof EReference
			&& ((EReference) eStructuralFeature).isContainer();
	}

	protected boolean isContainment(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature instanceof EReference
			&& ((EReference) eStructuralFeature).isContainment();
	}

}