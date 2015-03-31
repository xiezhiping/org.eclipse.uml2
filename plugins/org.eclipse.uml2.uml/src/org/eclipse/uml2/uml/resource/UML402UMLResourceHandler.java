/*
 * Copyright (c) 2014, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 463551
 *
 */
package org.eclipse.uml2.uml.resource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * Resource handler that converts .uml models.
 * OMG:  UML 2.4.x and UML 2.5
 * API:  UML2 4.x and UML2 5.0
 * 
 * @since 5.0
 */
public class UML402UMLResourceHandler
		extends BasicResourceHandler {

	protected boolean resolveProxies = true;

	protected String xmiVersion = null;

	protected AnyType getExtension(XMLResource resource, EObject eObject) {
		return resource.getEObjectToExtensionMap().get(eObject);
	}

	protected Object getValue(FeatureMap featureMap, String name, boolean remove) {

		for (Iterator<FeatureMap.Entry> entries = featureMap.iterator(); entries
			.hasNext();) {

			FeatureMap.Entry entry = entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {

				if (remove) {
					entries.remove();
				}

				return entry.getValue();
			}
		}

		return null;
	}

	@Override
	public void preLoad(XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {
		xmiVersion = ((XMIResource) resource).getXMIVersion();
	}

	protected InternalEObject handleProxy(InternalEObject internalEObject) {

		if (internalEObject != null && internalEObject.eIsProxy()) {
			URI eProxyURI = internalEObject.eProxyURI();

			Map<URI, URI> uriMap = UML402UMLExtendedMetaData.getURIMap();
			URI uri = uriMap.get(eProxyURI);

			if (uri != null) {
				internalEObject.eSetProxyURI(uri);
			}
		}

		return internalEObject;
	}

	@Override
	public void postLoad(final XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {
		final EList<EObject> resourceContents = resource.getContents();

		final List<ProfileApplication> profileApplicationsToRemove = new ArrayList<ProfileApplication>();

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

			@Override
			public Object caseComment(Comment comment) {
				AnyType extension = getExtension(resource, comment);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"body", true); //$NON-NLS-1$

					if (value instanceof String) {
						comment.setBody((String) value);
					}
				}

				return super.caseComment(comment);
			}

			@Override
			public Object caseProfileApplication(
					ProfileApplication profileApplication) {
				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {
					org.eclipse.uml2.uml.Package applyingPackage = profileApplication
						.getApplyingPackage();

					if (applyingPackage != null
						&& applyingPackage
							.getProfileApplication(appliedProfile) != profileApplication) {
						profileApplicationsToRemove.add(profileApplication);
					}
				}

				return super.caseProfileApplication(profileApplication);
			}

			@Override
			public Object defaultCase(EObject eObject) {

				for (EReference eReference : eObject.eClass()
					.getEAllReferences()) {

					if (!eReference.isDerived() && !eReference.isContainer()
						&& !eReference.isContainment()
						&& eObject.eIsSet(eReference)) {

						if (eReference.isMany()) {
							@SuppressWarnings("unchecked")
							InternalEList<InternalEObject> values = (InternalEList<InternalEObject>) eObject
								.eGet(eReference);

							for (InternalEObject value : values) {
								handleProxy(value);
							}
						} else {
							handleProxy((InternalEObject) eObject.eGet(
								eReference, false));
						}
					}
				}

				Iterator<?> contents = resolveProxies
					? eObject.eContents().iterator()
					: ((InternalEList<?>) eObject.eContents()).basicIterator();

				if (contents != null) {

					while (contents.hasNext()) {
						doSwitch((EObject) contents.next());
					}
				}

				return eObject;
			}
		};

		for (int i = 0; i < resourceContents.size(); i++) {
			umlSwitch.doSwitch(resourceContents.get(i));
		}

		for (ProfileApplication profileApplication : profileApplicationsToRemove) {
			profileApplication.getApplyingPackage().getProfileApplications()
				.remove(profileApplication);
		}

		((XMIResource) resource).setXMIVersion(xmiVersion);
	}

}
