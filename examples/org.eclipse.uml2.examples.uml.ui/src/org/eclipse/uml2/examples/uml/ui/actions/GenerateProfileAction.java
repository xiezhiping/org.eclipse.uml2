/*
 * Copyright (c) 2005, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 321461
 *
 * $Id: GenerateProfileAction.java,v 1.9 2010/08/19 18:39:38 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.editor.actions.UMLCommandAction;
import org.eclipse.uml2.uml.resource.UMLResource;

public abstract class GenerateProfileAction
		extends UMLCommandAction {

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Profile) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	protected PrimitiveType getImportedUMLPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {
		Model umlPrimitiveTypes = UML2Util.load(package_.eResource()
			.getResourceSet(), URI
			.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI),
			UMLPackage.Literals.MODEL);
		PrimitiveType primitiveType = (PrimitiveType) umlPrimitiveTypes
			.getOwnedType(name);

		if (!package_.getImportedElements().contains(primitiveType)) {
			package_.createElementImport(primitiveType,
				VisibilityKind.PUBLIC_LITERAL);
		}

		return primitiveType;
	}

	protected org.eclipse.uml2.uml.Class getReferencedUMLMetaclass(
			Profile profile, EClass eClass) {
		Model umlMetamodel = UML2Util.load(
			profile.eResource().getResourceSet(),
			URI.createURI(UMLResource.UML_METAMODEL_URI),
			UMLPackage.Literals.MODEL);

		if (!profile.getReferencedMetamodels().contains(umlMetamodel)) {
			profile.createMetamodelReference(umlMetamodel);
		}

		return (org.eclipse.uml2.uml.Class) umlMetamodel.getOwnedType(eClass
			.getName());
	}

	protected Stereotype generateOwnedStereotype(Profile profile, String name,
			boolean isAbstract) {
		Stereotype stereotype = (Stereotype) profile.getPackagedElement(name,
			false, UMLPackage.Literals.STEREOTYPE, true);
		stereotype.setIsAbstract(isAbstract);
		return stereotype;
	}

	protected Extension generateExtension(final Stereotype stereotype,
			final org.eclipse.uml2.uml.Class metaclass, boolean required) {
		Extension extension = (Extension) UML2Util.findEObject(EcoreUtil
			.<Extension> getObjectsByType(stereotype.getProfile()
				.getOwnedTypes(), UMLPackage.Literals.EXTENSION),
			new UML2Util.EObjectMatcher() {

				public boolean matches(EObject eObject) {
					Extension extension = (Extension) eObject;
					return extension.getMetaclass() == metaclass
						&& extension.metaclassEnd().getClass_() == stereotype;
				}
			});

		if (extension == null) {
			extension = stereotype.createExtension(metaclass, required);
		}

		extension.getStereotypeEnd().setLower(required
			? 1
			: 0);

		return extension;
	}

	protected Generalization generateGeneralization(
			Classifier specificClassifier, final Classifier generalClassifier) {
		return specificClassifier.getGeneralization(generalClassifier, true);
	}

	protected Property generateOwnedAttribute(
			org.eclipse.uml2.uml.Class class_, String name, Type type,
			int lower, int upper) {
		Property ownedAttribute = class_.getOwnedAttribute(name, type, false,
			UMLPackage.Literals.PROPERTY, true);
		ownedAttribute.setUpper(upper);
		ownedAttribute.setLower(lower);
		return ownedAttribute;
	}

	protected Enumeration generateOwnedEnumeration(
			org.eclipse.uml2.uml.Package package_, final String name) {
		return (Enumeration) package_.getPackagedElement(name, false,
			UMLPackage.Literals.ENUMERATION, true);
	}

	protected EnumerationLiteral generateOwnedLiteral(Enumeration enumeration,
			String name) {
		return enumeration.getOwnedLiteral(name, false, true);
	}

	protected Image generateIcon(Stereotype stereotype, final String location) {
		Image icon = (Image) UML2Util.findEObject(stereotype.getIcons(),
			new UML2Util.EObjectMatcher() {

				public boolean matches(EObject eObject) {
					return UML2Util.safeEquals(((Image) eObject).getLocation(),
						location);
				}
			});

		if (icon == null) {
			icon = stereotype.createIcon(location);
		}

		return icon;
	}

	protected void setIDs(Profile profile) {
		Resource eResource = profile.eResource();

		if (eResource instanceof XMIResource) {
			XMIResource xmiResource = (XMIResource) eResource;

			xmiResource.setID(profile,
				UML2Util.getXMIIdentifier((InternalEObject) profile));

			for (TreeIterator<EObject> eAllContents = profile.eAllContents(); eAllContents
				.hasNext();) {

				InternalEObject internalEObject = (InternalEObject) eAllContents
					.next();

				if (internalEObject instanceof EAnnotation) {
					eAllContents.prune();
				} else {
					xmiResource.setID(internalEObject,
						UML2Util.getXMIIdentifier(internalEObject));
				}
			}
		}
	}

	protected Property getMetaclassEnd(Extension extension) {
		return extension.getStereotypeEnd().getOtherEnd();
	}
}
