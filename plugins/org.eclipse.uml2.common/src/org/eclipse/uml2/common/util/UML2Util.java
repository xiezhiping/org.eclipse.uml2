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
 * $Id: UML2Util.java,v 1.3 2005/12/12 20:53:04 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @since 2.0
 */
public class UML2Util {

	protected UML2Util() {
		super();
	}

	public static interface EObjectMatcher {

		public boolean matches(EObject eObject);

	}

	public static class EClassMatcher
			implements EObjectMatcher {

		protected final EObject eObject;

		public EClassMatcher(EObject eObject) {
			super();

			this.eObject = eObject;
		}

		public boolean matches(EObject otherEObject) {

			return null == eObject || null == otherEObject
				? null == eObject && null == otherEObject
				: eObject.eClass() == otherEObject.eClass();
		}
	}

	/**
	 * The empty string.
	 */
	public static final String EMPTY_STRING = ""; //$NON-NLS-1$

	protected static final String LINE_SEPARATOR = System.getProperties()
		.getProperty("line.separator"); //$NON-NLS-1$

	public static boolean safeEquals(Object thisObject, Object thatObject) {
		return null == thisObject
			? null == thatObject
			: thisObject.equals(thatObject);
	}

	public static boolean isEmpty(String string) {
		return null == string || 0 == string.length();
	}

	public static EObject findEObject(Collection eObjects, EObjectMatcher filter) {
		return findEObject(eObjects.iterator(), filter);
	}

	public static EObject findEObject(Iterator iterator, EObjectMatcher filter) {

		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();

			if (filter.matches(eObject)) {
				return eObject;
			}
		}

		return null;
	}

	protected static EClassifier getCommonEType(EClassifier eType,
			final EClassifier otherEType) {

		if (null == eType || eType.equals(otherEType)) {
			return eType;
		} else {
			return (EClassifier) new EcoreSwitch() {

				public Object caseEClassifier(EClassifier eClassifier) {

					return EcorePackage.eINSTANCE.getEObject();
				}

				public Object caseEClass(EClass eClass) {

					if (otherEType instanceof EClass) {
						EClass otherEClass = (EClass) otherEType;

						if (eClass.isSuperTypeOf(otherEClass)) {
							return eClass;
						} else if (otherEClass.isSuperTypeOf(eClass)) {
							return otherEClass;
						}

						for (Iterator eAllSuperTypes = eClass
							.getEAllSuperTypes().iterator(); eAllSuperTypes
							.hasNext();) {

							EClass eSuperType = (EClass) eAllSuperTypes.next();

							if (eSuperType.isSuperTypeOf(otherEClass)) {
								return eSuperType;
							}
						}

						for (Iterator otherEAllSuperTypes = otherEClass
							.getEAllSuperTypes().iterator(); otherEAllSuperTypes
							.hasNext();) {

							EClass otherESuperType = (EClass) otherEAllSuperTypes
								.next();

							if (otherESuperType.isSuperTypeOf(eClass)) {
								return otherESuperType;
							}
						}
					}

					return super.caseEClass(eClass);
				}

				public Object caseEDataType(EDataType eDataType) {
					return otherEType instanceof EDataType
						&& eDataType.getInstanceClass().equals(
							((EDataType) otherEType).getInstanceClass())
						? eDataType
						: EcorePackage.eINSTANCE.getEJavaObject();
				}

				public Object caseEEnum(EEnum eEnum) {
					return otherEType instanceof EEnum
						? EcorePackage.eINSTANCE.getEEnumerator()
						: EcorePackage.eINSTANCE.getEJavaObject();
				}
			}.doSwitch(eType);
		}
	}

	protected static int getLesserLowerBound(int lowerBound, int otherLowerBound) {
		return Math.min(lowerBound, otherLowerBound);
	}

	protected static int getGreaterUpperBound(int upperBound,
			int otherUpperBound) {

		return ETypedElement.UNBOUNDED_MULTIPLICITY == upperBound
			|| ETypedElement.UNBOUNDED_MULTIPLICITY == otherUpperBound
			? ETypedElement.UNBOUNDED_MULTIPLICITY
			: Math.max(upperBound, otherUpperBound);
	}

	/**
	 * Obtains a valid Java identifier based on the specified name.
	 * 
	 * @param name
	 *            The name from which to obtain a valid identifier.
	 * @return A valid (Java) identifier.
	 */
	protected static String getValidJavaIdentifier(String name) {
		return getValidJavaIdentifier(name, new StringBuffer()).toString();
	}

	/**
	 * Appends a valid Java identifier based on the specified name to the
	 * specified buffer.
	 * 
	 * @param name
	 *            The name from which to obtain the valid identifier.
	 * @param validJavaIdentifier
	 *            The buffer to which to append the valid identifier.
	 * @return The buffer.
	 */
	protected static StringBuffer getValidJavaIdentifier(String name,
			StringBuffer validJavaIdentifier) {

		if (isEmpty(name)) {
			validJavaIdentifier.append('_');
		} else {
			char char_0 = name.charAt(0);

			if (Character.isJavaIdentifierStart(char_0)) {
				validJavaIdentifier.append(char_0);
			} else {
				validJavaIdentifier.append('_');

				if (Character.isJavaIdentifierPart(char_0)) {
					validJavaIdentifier.append(char_0);
				}
			}

			for (int i = 1; i < name.length(); i++) {
				char char_i = name.charAt(i);

				if (Character.isJavaIdentifierPart(char_i)) {
					validJavaIdentifier.append(char_i);
				}
			}
		}

		return validJavaIdentifier;
	}

	protected static boolean isNCNameStart(char c) {
		return Character.isLetter(c) || c == '_';
	}

	protected static boolean isNCNamePart(char c) {
		return Character.isLetterOrDigit(c) || c == '.' || c == '-' || c == '_';
	}

	protected static String getValidNCName(String name) {
		return getValidNCName(name, new StringBuffer()).toString();
	}

	protected static StringBuffer getValidNCName(String name,
			StringBuffer validNCName) {

		if (isEmpty(name)) {
			validNCName.insert(0, '_');
		} else {

			for (int i = name.length(); --i > 0;) {
				char char_i = name.charAt(i);

				if (isNCNamePart(char_i)) {
					validNCName.insert(0, char_i);
				}
			}

			char char_0 = name.charAt(0);

			if (isNCNameStart(char_0)) {
				validNCName.insert(0, char_0);
			} else {

				if (isNCNamePart(char_0)) {
					validNCName.insert(0, char_0);
				}

				validNCName.insert(0, '_');
			}
		}

		return validNCName;
	}

	protected static String getXMIIdentifier(InternalEObject internalEObject) {
		return getXMIIdentifier(internalEObject, new StringBuffer()).toString();
	}

	protected static StringBuffer getXMIIdentifier(
			InternalEObject internalEObject, StringBuffer xmiIdentifier) {
		InternalEObject eInternalContainer = internalEObject
			.eInternalContainer();
		Resource.Internal eDirectResource = internalEObject.eDirectResource();

		while (eInternalContainer != null && eDirectResource == null) {
			getValidNCName(eInternalContainer.eURIFragmentSegment(
				internalEObject.eContainingFeature(), internalEObject),
				xmiIdentifier);

			internalEObject = eInternalContainer;
			eInternalContainer = internalEObject.eInternalContainer();
			eDirectResource = internalEObject.eDirectResource();

			if (eInternalContainer != null && eDirectResource == null) {
				xmiIdentifier.insert(0, '-');
			}
		}

		if (eDirectResource != null) {
			int index = eDirectResource.getContents().indexOf(internalEObject);
			int length = xmiIdentifier.length();

			if (index > 0 || length == 0) {

				if (length > 0) {
					xmiIdentifier.insert(0, '-');
				}

				xmiIdentifier.insert(0, index);
				xmiIdentifier.insert(0, '_');
			}
		}

		return xmiIdentifier;
	}

	public static int getInstanceCount(ResourceSet resourceSet,
			EClassifier eClassifier) {
		return getInstanceCount(resourceSet.getAllContents(), eClassifier);
	}

	public static int getInstanceCount(Resource resource,
			EClassifier eClassifier) {
		return getInstanceCount(resource.getAllContents(), eClassifier);
	}

	public static int getInstanceCount(EObject eObject, EClassifier eClassifier) {
		return getInstanceCount(eObject.eAllContents(), eClassifier);
	}

	public static int getInstanceCount(Iterator iterator,
			EClassifier eClassifier) {
		int count = 0;

		while (iterator.hasNext()) {

			if (eClassifier.isInstance(iterator.next())) {
				count++;
			}
		}

		return count;
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

	protected static Collection getRootContainers(Collection eObjects) {
		Collection rootContainers = new UniqueEList();

		for (Iterator i = eObjects.iterator(); i.hasNext();) {
			rootContainers.add(EcoreUtil.getRootContainer((EObject) i.next()));
		}

		return rootContainers;
	}

	protected static TreeIterator getAllContents(EObject eObject,
			boolean includeRoot, final boolean defensiveCopy) {
		return new AbstractTreeIterator(eObject, includeRoot) {

			protected Iterator getChildren(Object object) {
				return defensiveCopy
					? new ArrayList(((EObject) object).eContents()).iterator()
					: ((EObject) object).eContents().iterator();
			}
		};
	}

}
