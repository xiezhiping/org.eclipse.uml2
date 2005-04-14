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
 * $Id: GenerateProfileAction.java,v 1.1 2005/04/14 17:32:07 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Util;

/**
 * 
 */
public abstract class GenerateProfileAction
		extends UML2CommandAction {

	protected PrimitiveType getImportedUML2PrimitiveType(
			org.eclipse.uml2.Package package_, String name) {
		Model uml2PrimitiveTypes = (Model) UML2Util.load(package_.eResource()
			.getResourceSet(), URI
			.createURI(UML2Resource.UML2_PRIMITIVE_TYPES_LIBRARY_URI));
		PrimitiveType primitiveType = (PrimitiveType) uml2PrimitiveTypes
			.getOwnedType(name);

		if (!package_.getImportedMembers().contains(primitiveType)) {
			package_
				.importElement(VisibilityKind.PUBLIC_LITERAL, primitiveType);
		}

		return primitiveType;
	}

	protected org.eclipse.uml2.Class getReferencedUML2Metaclass(
			Profile profile, EClass eClass) {
		Model uml2Metamodel = (Model) UML2Util.load(profile.eResource()
			.getResourceSet(), URI.createURI(UML2Resource.UML2_METAMODEL_URI));
		org.eclipse.uml2.Class metaclass = (org.eclipse.uml2.Class) uml2Metamodel
			.getOwnedType(eClass.getName());

		if (!profile.getReferencedMetaclasses().contains(metaclass)) {
			profile.referenceMetaclass(metaclass);
		}

		return metaclass;
	}

	protected Stereotype generateOwnedStereotype(Profile profile, String name,
			boolean isAbstract) {
		Stereotype stereotype = profile.getOwnedStereotype(name);

		if (null == stereotype) {
			stereotype = profile.createOwnedStereotype(name, isAbstract);
		} else {
			stereotype.setIsAbstract(isAbstract);
		}

		return stereotype;
	}

	protected Extension generateExtension(Stereotype stereotype,
			org.eclipse.uml2.Class metaclass, boolean required) {
		Extension extension = metaclass.getExtension(metaclass.getName() + '_'
			+ stereotype.getName());

		if (null == extension) {
			extension = stereotype.createExtension(metaclass, required);
		} else {
			((ExtensionEnd) extension.getOwnedEnds().get(0))
				.setLowerBound(required
					? 1
					: 0);
		}

		return extension;
	}

	protected Generalization generateGeneralization(
			Classifier specificClassifier, final Classifier generalClassifier) {
		Generalization generalization = (Generalization) UML2Util.findEObject(
			specificClassifier.getGeneralizations(),
			new UML2Util.EObjectMatcher() {

				public boolean matches(EObject eObject) {
					return generalClassifier == ((Generalization) eObject)
						.getGeneral();
				}
			});

		return null == generalization
			? specificClassifier.createGeneralization(generalClassifier)
			: generalization;
	}

	protected Property generateOwnedAttribute(org.eclipse.uml2.Class class_,
			String name, Type type, int lowerBound, int upperBound) {
		Property ownedAttribute = class_.getOwnedAttribute(name);

		if (null == ownedAttribute) {
			ownedAttribute = class_.createOwnedAttribute(name, type,
				lowerBound, upperBound);
		} else {
			ownedAttribute.setType(type);
			ownedAttribute.setUpperBound(upperBound);
			ownedAttribute.setLowerBound(lowerBound);
		}

		return ownedAttribute;
	}

	protected Enumeration generateOwnedEnumeration(
			org.eclipse.uml2.Package package_, final String name) {
		Enumeration enumeration = (Enumeration) UML2Util.findEObject(package_
			.getOwnedTypes(), new UML2Util.EObjectMatcher() {

			public boolean matches(EObject eObject) {
				return eObject instanceof Enumeration
					&& ((Enumeration) eObject).getName().equals(name);
			}
		});

		return null == enumeration
			? package_.createOwnedEnumeraton(name)
			: enumeration;
	}

	protected EnumerationLiteral generateOwnedLiteral(Enumeration enumeration,
			String name) {
		EnumerationLiteral enumerationLiteral = enumeration
			.getOwnedLiteral(name);

		return null == enumerationLiteral
			? enumeration.createOwnedLiteral(name)
			: enumerationLiteral;
	}

}
