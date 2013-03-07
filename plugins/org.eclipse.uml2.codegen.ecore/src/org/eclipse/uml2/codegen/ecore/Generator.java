/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 212765
 */
package org.eclipse.uml2.codegen.ecore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;

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

	public static List<EStructuralFeature> getRedefinedEcoreFeatures(
			EStructuralFeature eStructuralFeature) {
		return getRedefinedEcoreFeatures(eStructuralFeature, false);
	}

	public static List<EStructuralFeature> getRedefinedEcoreFeatures(
			EStructuralFeature eStructuralFeature, boolean recurse) {
		List<EStructuralFeature> redefinedEcoreFeatures = new UniqueEList.FastCompare<EStructuralFeature>();

		EAnnotation redefinesAnnotation = eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__REDEFINES);

		if (null != redefinesAnnotation) {

			for (EObject reference : redefinesAnnotation.getReferences()) {
				EStructuralFeature redefinedFeature = (EStructuralFeature) reference;

				redefinedEcoreFeatures.add(redefinedFeature);

				if (recurse) {
					redefinedEcoreFeatures.addAll(getRedefinedEcoreFeatures(
						redefinedFeature, recurse));
				}
			}
		}

		return redefinedEcoreFeatures;
	}

	public static List<EOperation> getRedefinedEcoreOperations(
			EOperation eOperation) {
		return getRedefinedEcoreOperations(eOperation, false);
	}

	public static List<EOperation> getRedefinedEcoreOperations(
			EOperation eOperation, boolean recurse) {
		List<EOperation> redefinedEcoreOperations = new UniqueEList.FastCompare<EOperation>();

		EAnnotation redefinesAnnotation = eOperation
			.getEAnnotation(ANNOTATION_SOURCE__REDEFINES);

		if (null != redefinesAnnotation) {

			for (EObject reference : redefinesAnnotation.getReferences()) {
				EOperation redefinedOperation = (EOperation) reference;

				redefinedEcoreOperations.add(redefinedOperation);

				if (recurse) {
					redefinedEcoreOperations
						.addAll(getRedefinedEcoreOperations(redefinedOperation,
							recurse));
				}
			}
		}

		return redefinedEcoreOperations;
	}

	protected static EMap<String, String> getRedefinitionDetails(
			EStructuralFeature eStructuralFeature) {
		EObject eContainer = eStructuralFeature.eContainer();

		if (eContainer instanceof EAnnotation) {
			EAnnotation eAnnotation = (EAnnotation) eContainer;

			if (ANNOTATION_SOURCE__DUPLICATES.equals(eAnnotation.getSource())) {
				eAnnotation = eAnnotation.getEAnnotation(eStructuralFeature
					.getName());

				if (eAnnotation != null) {
					return eAnnotation.getDetails();
				}
			}
		}

		return ECollections.emptyEMap();
	}

	public static int getRedefinitionLowerBound(
			EStructuralFeature eStructuralFeature) {
		String lowerBound = getRedefinitionDetails(eStructuralFeature).get(
			EcorePackage.Literals.ETYPED_ELEMENT__LOWER_BOUND.getName());

		try {
			return Integer.parseInt(lowerBound);
		} catch (Exception e) {
			// do nothing
		}

		return eStructuralFeature.getLowerBound();
	}

	public static int getRedefinitionUpperBound(EStructuralFeature eStructuralFeature) {
		String upperBound = getRedefinitionDetails(eStructuralFeature).get(
			EcorePackage.Literals.ETYPED_ELEMENT__UPPER_BOUND.getName());

		try {
			return Integer.parseInt(upperBound);
		} catch (Exception e) {
			// do nothing
		}

		return eStructuralFeature.getUpperBound();
	}

	public static EClassifier getRedefinitionEType(
			EStructuralFeature eStructuralFeature) {
		final String eType = getRedefinitionDetails(eStructuralFeature).get(
			EcorePackage.Literals.ETYPED_ELEMENT__ETYPE.getName());

		if (eType != null) {
			ResourceSet resourceSet = UML2Util
				.getResourceSet(eStructuralFeature);

			if (resourceSet != null) {
				Collection<EClassifier> eClassifiers = UML2Util
					.findENamedElements(resourceSet, eType, "::", false, //$NON-NLS-1$
						EcorePackage.Literals.ECLASSIFIER);

				if (eClassifiers.size() == 1) {
					return eClassifiers.iterator().next();
				}
			}
		}

		return eStructuralFeature.getEType();
	}

	public static boolean isSubset(EStructuralFeature eStructuralFeature) {
		return null != eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__SUBSETS);
	}

	public static List<EStructuralFeature> getSubsettedEcoreFeatures(
			EStructuralFeature eStructuralFeature) {
		return getSubsettedEcoreFeatures(eStructuralFeature, false);
	}

	public static List<EStructuralFeature> getSubsettedEcoreFeatures(
			EStructuralFeature eStructuralFeature, boolean recurse) {
		List<EStructuralFeature> subsettedEcoreFeatures = new UniqueEList.FastCompare<EStructuralFeature>();

		EAnnotation subsetsAnnotation = eStructuralFeature
			.getEAnnotation(ANNOTATION_SOURCE__SUBSETS);

		if (null != subsetsAnnotation) {

			for (EObject reference : subsetsAnnotation.getReferences()) {
				EStructuralFeature subsettedFeature = (EStructuralFeature) reference;

				subsettedEcoreFeatures.add(subsettedFeature);

				if (recurse) {
					subsettedEcoreFeatures.addAll(getSubsettedEcoreFeatures(
						subsettedFeature, recurse));
				}
			}
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

	public static List<EStructuralFeature> getDuplicateEcoreFeatures(
			EClass eClass) {
		List<EStructuralFeature> duplicateEcoreFeatures = new ArrayList<EStructuralFeature>();

		EAnnotation duplicatesAnnotation = eClass
			.getEAnnotation(ANNOTATION_SOURCE__DUPLICATES);

		if (null != duplicatesAnnotation) {
			duplicateEcoreFeatures.addAll(EcoreUtil
				.<EStructuralFeature> getObjectsByType(duplicatesAnnotation
					.getContents(), EcorePackage.eINSTANCE
					.getEStructuralFeature()));
		}

		return duplicateEcoreFeatures;
	}

	public static List<EOperation> getDuplicateEcoreOperations(EClass eClass) {
		List<EOperation> duplicateEcoreOperations = new ArrayList<EOperation>();

		EAnnotation duplicatesAnnotation = eClass
			.getEAnnotation(ANNOTATION_SOURCE__DUPLICATES);

		if (null != duplicatesAnnotation) {
			duplicateEcoreOperations.addAll(EcoreUtil
				.<EOperation> getObjectsByType(duplicatesAnnotation
					.getContents(), EcorePackage.eINSTANCE.getEOperation()));
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