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
 * $Id: Generator.java,v 1.1 2005/05/17 22:06:28 khussey Exp $
 */
package org.eclipse.uml2.codegen.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 */
public class Generator
		extends org.eclipse.emf.codegen.ecore.Generator {

	public static final String ANNOTATION_SOURCE__REDEFINES = "redefines";

	public static final String ANNOTATION_SOURCE__SUBSETS = "subsets";

	public static final String ANNOTATION_SOURCE__UNION = "union";

	public static final String ANNOTATION_SOURCE__DUPLICATES = "duplicates";

	public static boolean isRedefinition(EStructuralFeature eStructuralFeature) {
		return null != eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__REDEFINES);
	}

	public static boolean isRedefinition(EOperation eOperation) {
		return null != eOperation.getEAnnotation(ANNOTATION_SOURCE__REDEFINES);
	}

	public static List getRedefinedEcoreFeatures(
			EStructuralFeature eStructuralFeature) {
		List redefinedEcoreFeatures = new ArrayList();

		EAnnotation redefinesAnnotation = eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__REDEFINES);

		if (null != redefinesAnnotation) {
			redefinedEcoreFeatures.addAll(redefinesAnnotation.getReferences());
		}

		return redefinedEcoreFeatures;
	}

	public static List getRedefinedEcoreOperations(EOperation eOperation) {
		List redefinedEcoreOperations = new ArrayList();

		EAnnotation redefinesAnnotation = eOperation
			.getEAnnotation(ANNOTATION_SOURCE__REDEFINES);

		if (null != redefinesAnnotation) {
			redefinedEcoreOperations
				.addAll(redefinesAnnotation.getReferences());
		}

		return redefinedEcoreOperations;
	}

	public static boolean isSubset(EStructuralFeature eStructuralFeature) {
		return null != eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__SUBSETS);
	}

	public static List getSubsettedEcoreFeatures(
			EStructuralFeature eStructuralFeature) {
		List subsettedEcoreFeatures = new ArrayList();

		EAnnotation subsetsAnnotation = eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__SUBSETS);

		if (null != subsetsAnnotation) {
			subsettedEcoreFeatures.addAll(subsetsAnnotation.getReferences());
		}

		return subsettedEcoreFeatures;
	}

	public static boolean isUnion(EStructuralFeature eStructuralFeature) {
		return null != eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__UNION);
	}

	public static boolean isDuplicate(EStructuralFeature eStructuralFeature) {
		return null == eStructuralFeature.getEContainingClass();
	}

	public static boolean isDuplicate(EOperation eOperation) {
		return null == eOperation.getEContainingClass();
	}

	public static List getDuplicateEcoreFeatures(EClass eClass) {
		List duplicateEcoreFeatures = new ArrayList();

		EAnnotation duplicatesAnnotation = eClass
			.getEAnnotation(ANNOTATION_SOURCE__DUPLICATES);

		if (null != duplicatesAnnotation) {
			duplicateEcoreFeatures.addAll(EcoreUtil.getObjectsByType(
				duplicatesAnnotation.getContents(), EcorePackage.eINSTANCE
					.getEStructuralFeature()));
		}

		return duplicateEcoreFeatures;
	}

	public static List getDuplicateEcoreOperations(EClass eClass) {
		List duplicateEcoreOperations = new ArrayList();

		EAnnotation duplicatesAnnotation = eClass
			.getEAnnotation(ANNOTATION_SOURCE__DUPLICATES);

		if (null != duplicatesAnnotation) {
			duplicateEcoreOperations.addAll(EcoreUtil.getObjectsByType(
				duplicatesAnnotation.getContents(), EcorePackage.eINSTANCE
					.getEOperation()));
		}

		return duplicateEcoreOperations;
	}

	public static EClass getEcoreContainingClass(
			EStructuralFeature eStructuralFeature) {
		return isDuplicate(eStructuralFeature)
			? (EClass) ((EAnnotation) eStructuralFeature.eContainer())
				.eContainer()
			: eStructuralFeature.getEContainingClass();
	}

	public static EClass getEcoreContainingClass(EOperation eOperation) {
		return isDuplicate(eOperation)
			? (EClass) ((EAnnotation) eOperation.eContainer()).eContainer()
			: eOperation.getEContainingClass();
	}

	public static String pluralize(String name) {

		if (name.equalsIgnoreCase("children") || name.endsWith("Children")) {
			return name;
		} else if (name.equalsIgnoreCase("child") || name.endsWith("Child")) {
			return name + "ren";
		} else if (name.equalsIgnoreCase("data") || name.endsWith("Data")) {
			return name;
		} else if (name.equalsIgnoreCase("datum") || name.endsWith("Datum")) {
			return name.substring(0, name.length() - 2) + "a";
		} else if (name.endsWith("By")) {
			return name + "s";
		} else if (name.endsWith("y")) {
			return name.substring(0, name.length() - 1) + "ies";
		} else if (name.endsWith("ex")) {
			return name.substring(0, name.length() - 2) + "ices";
		} else if (name.endsWith("x")) {
			return name + "es";
		} else if (name.endsWith("us")) {
			return name.substring(0, name.length() - 2) + "i";
		} else if (name.endsWith("ss")) {
			return name + "es";
		} else if (name.endsWith("s")) {
			return name;
		} else {
			return name + "s";
		}
	}

}