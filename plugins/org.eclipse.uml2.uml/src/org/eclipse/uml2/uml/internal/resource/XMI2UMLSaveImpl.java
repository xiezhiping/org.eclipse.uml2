/*
 * Copyright (c) 2006, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;

import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLExtendedMetaData;

public class XMI2UMLSaveImpl
		extends UMLSaveImpl {

	protected static class Lookup
			extends XMISaveImpl.Lookup {

		public Lookup(XMLResource.XMLMap map, ExtendedMetaData extendedMetaData) {
			super(map, extendedMetaData);
		}

		@Override
		protected int featureKind(EStructuralFeature f) {
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

	public XMI2UMLSaveImpl(XMLHelper helper) {
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
				EcorePackage.eNS_URI);
			super.saveContainedMany(eObject, eStructuralFeature);
			doc.endElement();
		} else {
			super.saveContainedMany(eObject, eStructuralFeature);
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

				if (extendedMetaData == null
					|| featureTable.getDocumentRoot(eClass.getEPackage()) != eClass) {

					String name = helper.getQName(eClass);
					doc.startElement(name);
					root = top;
					saveElementID(top);
				} else {
					doc.startElement(null);
					root = top;
					saveFeatures(top);
					doc.addLine();
				}
			}

			int index = contents.size();

			for (Iterator<EObject> properContents = EcoreUtil
				.getAllProperContents(contents, false); properContents
				.hasNext();) {

				EObject eObject = properContents.next();

				if (eObject instanceof Profile) {
					Profile profile = (Profile) eObject;

					String nsPrefix = profile.getName();

					if (!UML2Util.isEmpty(nsPrefix)) {
						doc.startElement(CMOF2UMLExtendedMetaData.CMOF_TAG);
						doc.addAttribute(idAttributeName, "_" + index++); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_NAME,
							CMOF2UMLExtendedMetaData.XMI_TAG__NS_PREFIX);
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE,
							nsPrefix);
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, helper
								.getIDREF(profile));
						doc.endEmptyElement();
					}

					String nsURI = profile.getName();

					if (!UML2Util.isEmpty(nsURI)) {
						doc.startElement(CMOF2UMLExtendedMetaData.CMOF_TAG);
						doc.addAttribute(idAttributeName, "_" + index++); //$NON-NLS-1$
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_NAME,
							CMOF2UMLExtendedMetaData.XMI_TAG__NS_URI);
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_VALUE,
							nsURI);
						doc.addAttribute(
							CMOF2UMLExtendedMetaData.CMOF_TAG_ELEMENT, helper
								.getIDREF(profile));
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
