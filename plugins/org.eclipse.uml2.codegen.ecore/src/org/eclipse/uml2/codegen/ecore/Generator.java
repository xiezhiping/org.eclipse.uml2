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
 * $Id: Generator.java,v 1.2 2005/06/03 19:53:36 khussey Exp $
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

	public static final String ANNOTATION_SOURCE__REDEFINES = "redefines"; //$NON-NLS-1$

	public static final String ANNOTATION_SOURCE__SUBSETS = "subsets"; //$NON-NLS-1$

	public static final String ANNOTATION_SOURCE__UNION = "union"; //$NON-NLS-1$

	public static final String ANNOTATION_SOURCE__DUPLICATES = "duplicates"; //$NON-NLS-1$

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

		if (name.equalsIgnoreCase("children") || name.endsWith("Children")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name;
		} else if (name.equalsIgnoreCase("child") || name.endsWith("Child")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name + "ren"; //$NON-NLS-1$
		} else if (name.equalsIgnoreCase("data") || name.endsWith("Data")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name;
		} else if (name.equalsIgnoreCase("datum") || name.endsWith("Datum")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name.substring(0, name.length() - 2) + "a"; //$NON-NLS-1$
		} else if (name.endsWith("By")) { //$NON-NLS-1$
			return name + "s"; //$NON-NLS-1$
		} else if (name.endsWith("y")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 1) + "ies"; //$NON-NLS-1$
		} else if (name.endsWith("ex")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 2) + "ices"; //$NON-NLS-1$
		} else if (name.endsWith("x")) { //$NON-NLS-1$
			return name + "es"; //$NON-NLS-1$
		} else if (name.endsWith("us")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 2) + "i"; //$NON-NLS-1$
		} else if (name.endsWith("ss")) { //$NON-NLS-1$
			return name + "es"; //$NON-NLS-1$
		} else if (name.endsWith("s")) { //$NON-NLS-1$
			return name;
		} else {
			return name + "s"; //$NON-NLS-1$
		}
	}

}