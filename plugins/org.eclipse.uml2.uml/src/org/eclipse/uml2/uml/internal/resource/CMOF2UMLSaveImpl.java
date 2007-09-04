/*
 * Copyright (c) 2007 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation, Embarcadero Technologies) - initial API and implementation
 *
 * $Id: CMOF2UMLSaveImpl.java,v 1.1 2007/09/04 15:28:48 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLExtendedMetaData;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CMOF2UMLSaveImpl
		extends XMISaveImpl {

	protected static class Lookup
			extends XMISaveImpl.Lookup {

		public Lookup(XMLResource.XMLMap map, ExtendedMetaData extendedMetaData) {
			super(map, extendedMetaData);
		}

		@Override
		protected int featureKind(EStructuralFeature f) {

			if (f == UMLPackage.Literals.CLASSIFIER__GENERAL
				|| f == UMLPackage.Literals.CLASS__SUPER_CLASS) {

				return OBJECT_HREF_MANY;
			} else if (f == UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER
				|| f == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER
				|| f == UMLPackage.Literals.PARAMETER__DEFAULT
				|| f == UMLPackage.Literals.PROPERTY__DEFAULT
				|| f == UMLPackage.Literals.PROPERTY__IS_COMPOSITE) {

				return DATATYPE_SINGLE;
			}

			return !f.isTransient()
				&& ((EStructuralFeature.Internal) f).isContainer()
				? (f.isUnsettable()
					? OBJECT_HREF_SINGLE_UNSETTABLE
					: OBJECT_HREF_SINGLE)
				: ((f == UMLPackage.Literals.CONNECTABLE_ELEMENT__END
					|| f == UMLPackage.Literals.VERTEX__INCOMING || f == UMLPackage.Literals.VERTEX__OUTGOING)
					? OBJECT_HREF_MANY
					: super.featureKind(f));
		}

	}

	public CMOF2UMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected void init(XMLResource resource, Map<?, ?> options) {
		super.init(resource, options);

		featureTable = new Lookup(map, extendedMetaData);
	}

	@Override
	protected void saveContainedMany(EObject eObject,
			EStructuralFeature eStructuralFeature) {

		if (eStructuralFeature == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS) {
			doc.startElement(EMOFExtendedMetaData.XMI_EXTENSION_ELEMENT);
			doc.addAttribute(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE,
				UMLPackage.eNS_URI);
			super.saveContainedMany(eObject, eStructuralFeature);
			doc.endElement();
		} else if (((CMOF2UMLExtendedMetaData) extendedMetaData).getName(
			eStructuralFeature, true) == null) {

			if (eStructuralFeature != UMLPackage.Literals.CLASSIFIER__GENERALIZATION) {
				doc.startElement(EMOFExtendedMetaData.XMI_EXTENSION_ELEMENT);
				doc.addAttribute(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE,
					UMLPackage.eNS_URI);
				super.saveContainedMany(eObject, eStructuralFeature);
				doc.endElement();
			}
		} else {
			super.saveContainedMany(eObject, eStructuralFeature);
		}
	}

	@Override
	protected void saveContainedSingle(EObject eObject,
			EStructuralFeature eStructuralFeature) {

		if (((CMOF2UMLExtendedMetaData) extendedMetaData).getName(
			eStructuralFeature, true) == null) {

			if (eStructuralFeature != UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE
				&& eStructuralFeature != UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE
				&& eStructuralFeature != UMLPackage.Literals.PARAMETER__DEFAULT_VALUE
				&& eStructuralFeature != UMLPackage.Literals.PROPERTY__DEFAULT_VALUE) {

				doc.startElement(EMOFExtendedMetaData.XMI_EXTENSION_ELEMENT);
				doc.addAttribute(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE,
					UMLPackage.eNS_URI);
				super.saveContainedSingle(eObject, eStructuralFeature);
				doc.endElement();
			}
		} else {
			super.saveContainedSingle(eObject, eStructuralFeature);
		}
	}

	@Override
	protected void saveDataTypeMany(EObject eObject,
			EStructuralFeature eStructuralFeature) {

		if (((CMOF2UMLExtendedMetaData) extendedMetaData).getName(
			eStructuralFeature, true) != null) {

			super.saveDataTypeMany(eObject, eStructuralFeature);
		}
	}

	@Override
	protected void saveDataTypeSingle(EObject eObject,
			EStructuralFeature eStructuralFeature) {

		if (((CMOF2UMLExtendedMetaData) extendedMetaData).getName(
			eStructuralFeature, true) != null) {

			super.saveDataTypeSingle(eObject, eStructuralFeature);
		}
	}

	@Override
	public Object writeTopObjects(List<? extends EObject> contents) {

		if (!toDOM) {
			doc.startElement(XMI_TAG_NS);
			Object mark = doc.mark();

			for (int i = 0, size = contents.size(); i < size; i++) {
				EObject top = contents.get(i);
				EClass eClass = top.eClass();
				EPackage ePackage = eClass.getEPackage();

				String name = ((CMOF2UMLExtendedMetaData) extendedMetaData)
					.getName(eClass, true);

				if (UMLUtil.getStereotype(top) != null) {
					doc
						.startElement(EMOFExtendedMetaData.XMI_EXTENSION_ELEMENT);
					doc.addAttribute(
						EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE,
						UMLPackage.eNS_URI);
				}

				if (extendedMetaData == null
					|| featureTable.getDocumentRoot(eClass.getEPackage()) != eClass) {

					doc.startElement(helper.getQName(eClass));
					root = top;
					saveElementID(top);
				} else {
					doc.startElement(null);
					root = top;
					saveFeatures(top);
					doc.addLine();
				}

				if (ePackage != UMLPackage.eINSTANCE || name == null) {
					doc.endElement();
				}
			}

			int index = contents.size();

			for (Iterator<EObject> properContents = EcoreUtil
				.getAllProperContents(contents, false); properContents
				.hasNext();) {

				EObject eObject = properContents.next();

				if (eObject instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) eObject;

					Object nsPrefix = UMLUtil.getTaggedValue(package_,
						UMLUtil.PROFILE__ECORE + NamedElement.SEPARATOR
							+ UMLUtil.STEREOTYPE__E_PACKAGE,
						UMLUtil.TAG_DEFINITION__NS_PREFIX);

					if (nsPrefix instanceof String) {
						doc.startElement(CMOF2UMLExtendedMetaData.CMOF_TAG);
						doc.addAttribute(idAttributeName, "_" + index++); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_NAME,
							"org.omg.xmi.nsPrefix"); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE,
							(String) nsPrefix);
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, helper
								.getIDREF(package_));
						doc.endEmptyElement();
					}

					Object nsURI = UMLUtil.getTaggedValue(package_,
						UMLUtil.PROFILE__ECORE + NamedElement.SEPARATOR
							+ UMLUtil.STEREOTYPE__E_PACKAGE,
						UMLUtil.TAG_DEFINITION__NS_URI);

					if (nsURI instanceof String) {
						doc.startElement(CMOF2UMLExtendedMetaData.CMOF_TAG);
						doc.addAttribute(idAttributeName, "_" + index++); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_NAME,
							"org.omg.xmi.nsURI"); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE,
							(String) nsURI);
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, helper
								.getIDREF(package_));
						doc.endEmptyElement();
					}
				} else if (eObject instanceof PrimitiveType) {
					String name = ((PrimitiveType) eObject).getName();

					if (name.equalsIgnoreCase("Boolean")) { //$NON-NLS-1$
						doc.startElement(CMOF2UMLExtendedMetaData.CMOF_TAG);
						doc.addAttribute(idAttributeName, "_" + index++); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_NAME,
							"org.omg.xmi.schemaType"); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE,
							"http://www.w3.org/2001/XMLSchema#boolean"); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, helper
								.getIDREF(eObject));
						doc.endEmptyElement();
					} else if (name.equalsIgnoreCase("Integer")) { //$NON-NLS-1$
						doc.startElement(CMOF2UMLExtendedMetaData.CMOF_TAG);
						doc.addAttribute(idAttributeName, "_" + index++); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_NAME,
							"org.omg.xmi.schemaType"); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE,
							"http://www.w3.org/2001/XMLSchema#integer"); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, helper
								.getIDREF(eObject));
						doc.endEmptyElement();
					}
				}
			}

			doc.endElement();
			return mark;
		} else {
			return super.writeTopObjects(contents);
		}
	}

}
