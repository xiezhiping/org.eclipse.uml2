/*
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: EMOF2EcoreResourceHandler.java,v 1.5 2006/02/07 16:40:10 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore;

import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * 
 */
public class EMOF2EcoreResourceHandler
		extends BasicResourceHandler {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	protected static final boolean DEBUG = false;

	protected AnyType getExtension(XMLResource resource, EObject eObject) {
		return (AnyType) resource.getEObjectToExtensionMap().get(eObject);
	}

	protected AnyType putExtension(XMLResource resource, EObject eObject,
			AnyType extension) {
		return (AnyType) resource.getEObjectToExtensionMap().put(eObject,
			extension);
	}

	protected AnyType removeExtension(XMLResource resource, EObject eObject) {
		return (AnyType) resource.getEObjectToExtensionMap().remove(eObject);
	}

	protected Object getValue(FeatureMap featureMap, String name) {

		for (Iterator entries = featureMap.iterator(); entries.hasNext();) {
			FeatureMap.Entry entry = (FeatureMap.Entry) entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {
				return entry.getValue();
			}
		}

		return null;
	}

	protected Collection getValues(FeatureMap featureMap, String name) {
		Collection values = new UniqueEList.FastCompare();

		for (Iterator entries = featureMap.iterator(); entries.hasNext();) {
			FeatureMap.Entry entry = (FeatureMap.Entry) entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {
				values.add(entry.getValue());
			}
		}

		return values;
	}

	protected Object getEcoreExtension(XMLResource resource, EObject eObject,
			String name) {

		AnyType extension = getExtension(resource, eObject);

		if (null != extension) {

			for (Iterator values = getValues(extension.getMixed(), "Extension") //$NON-NLS-1$
				.iterator(); values.hasNext();) {

				AnyType ecoreExtension = (AnyType) values.next();

				if (null != ecoreExtension) {
					AnyType value = (AnyType) getValue(ecoreExtension
						.getMixed(), name);

					if (null != value) {
						return getValue(value.getMixed(), "text"); //$NON-NLS-1$
					}
				}

			}
		}

		return null;
	}

	protected EStructuralFeature processProperty(final XMLResource resource,
			EStructuralFeature eStructuralFeature) {

		EcoreUtil.Copier copier = new EcoreUtil.Copier() {

			protected EObject createCopy(EObject eObject) {
				EClassifier eType = (EClassifier) eObject.eGet(
					EcorePackage.eINSTANCE.getETypedElement_EType(), false);

				if (eType instanceof EDataType) {
					EAttribute eAttribute = eObject instanceof EAttribute
						? (EAttribute) eObject
						: EcoreFactory.eINSTANCE.createEAttribute();

					String iD = (String) getEcoreExtension(resource, eObject,
						"iD"); //$NON-NLS-1$

					if (null != iD) {
						eAttribute.setID(Boolean.valueOf(iD).booleanValue());
					}

					return eAttribute;
				} else {
					EReference eReference = eObject instanceof EReference
						? (EReference) eObject
						: EcoreFactory.eINSTANCE.createEReference();

					String resolveProxies = (String) getEcoreExtension(
						resource, eObject, "resolveProxies"); //$NON-NLS-1$

					if (null != resolveProxies) {
						eReference.setResolveProxies(Boolean.valueOf(
							resolveProxies).booleanValue());
					}

					String transient_ = (String) getEcoreExtension(resource,
						eObject, "transient"); //$NON-NLS-1$

					if (null != transient_) {
						eReference.setTransient(Boolean.valueOf(transient_)
							.booleanValue());
					}

					String volatile_ = (String) getEcoreExtension(resource,
						eObject, "volatile"); //$NON-NLS-1$

					if (null != volatile_) {
						eReference.setVolatile(Boolean.valueOf(volatile_)
							.booleanValue());
					}

					return eReference;
				}
			}

			protected void copyContainment(EReference eReference,
					EObject eObject, EObject copyEObject) {

				if (eObject != copyEObject) {
					((EStructuralFeature) copyEObject).getEAnnotations()
						.addAll(
							((EStructuralFeature) eObject).getEAnnotations());
				}
			}

			protected void copyReference(EReference eReference,
					EObject eObject, EObject copyEObject) {

				if (EcorePackage.eINSTANCE.getETypedElement_EType() == eReference) {

					if (eObject.eIsSet(eReference)) {
						EClassifier eType = (EClassifier) eObject.eGet(
							eReference, false);

						if (null == eType || eType.eIsProxy()) {
							copyEObject.eSet(getTarget(eReference), eType);
							return;
						}
					}
				}

				super.copyReference(eReference, eObject, copyEObject);
			}
		};

		EStructuralFeature copyEStructuralFeature = (EStructuralFeature) copier
			.copy(eStructuralFeature);
		copier.copyReferences();

		if (eStructuralFeature != copyEStructuralFeature) {
			EList eStucturalFeatures = eStructuralFeature.getEContainingClass()
				.getEStructuralFeatures();

			eStucturalFeatures.set(eStucturalFeatures
				.indexOf(eStructuralFeature), copyEStructuralFeature);
		}

		return copyEStructuralFeature;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.XMLResource.ResourceHandler#postLoad(org.eclipse.emf.ecore.xmi.XMLResource,
	 *      java.io.InputStream, java.util.Map)
	 */
	public void postLoad(final XMLResource resource, InputStream inputStream,
			Map options) {
		final ExtendedMetaData extendedMetaData = (ExtendedMetaData) options
			.get(XMLResource.OPTION_EXTENDED_META_DATA);

		EcoreSwitch ecoreSwitch = new EcoreSwitch() {

			public Object caseEModelElement(EModelElement eModelElement) {
				AnyType extension = removeExtension(resource, eModelElement);

				if (null != extension) {
					System.out.println(eModelElement);
					System.out.println("->"); //$NON-NLS-1$
					System.out.println(extension);

					if (DEBUG) {
						EAnnotation eAnnotation = EcoreFactory.eINSTANCE
							.createEAnnotation();
						eAnnotation.setEModelElement(eModelElement);
						eAnnotation.setSource(ExtendedMetaData.ANNOTATION_URI);

						eAnnotation.getContents().add(extension);
					}
				}

				return super.caseEModelElement(eModelElement);
			}

			public Object caseEClass(EClass eClass) {
				EList properties = eClass.getEStructuralFeatures();

				for (int i = 0; i < properties.size(); i++) {
					EStructuralFeature property = (EStructuralFeature) properties
						.get(i);
					EStructuralFeature eStructuralFeature = processProperty(
						resource, property);

					AnyType extension = getExtension(resource, property);

					if (null != extension) {
						String isReadOnly = (String) getValue(extension
							.getAnyAttribute(), "isReadOnly"); //$NON-NLS-1$

						if (null != isReadOnly) {
							eStructuralFeature.setChangeable(!Boolean.valueOf(
								isReadOnly).booleanValue());
						}

						if (property != eStructuralFeature) {
							putExtension(resource, eStructuralFeature,
								removeExtension(resource, property));

							String isComposite = (String) getValue(extension
								.getAnyAttribute(), "isComposite"); //$NON-NLS-1$

							if (null != isComposite) {
								((EReference) eStructuralFeature)
									.setContainment(Boolean
										.valueOf(isComposite).booleanValue());
							}

							String opposite = (String) getValue(extension
								.getAnyAttribute(), "opposite"); //$NON-NLS-1$

							if (null != opposite) {
								((EReference) eStructuralFeature)
									.setEOpposite((EReference) processProperty(
										resource, (EStructuralFeature) resource
											.getEObject(opposite)));
							}
						}
					}
				}

				return super.caseEClass(eClass);
			}

			public Object caseEDataType(EDataType eDataType) {
				eDataType.setInstanceClassName((String) getEcoreExtension(
					resource, eDataType, "instanceClassName")); //$NON-NLS-1$

				String serializable = (String) getEcoreExtension(resource,
					eDataType, "serializable"); //$NON-NLS-1$

				if (null != serializable) {
					eDataType.setSerializable(Boolean.valueOf(serializable)
						.booleanValue());
				}

				return super.caseEDataType(eDataType);
			}

			public Object caseEPackage(EPackage ePackage) {
				ePackage.setNsPrefix((String) getEcoreExtension(resource,
					ePackage, "nsPrefix")); //$NON-NLS-1$

				return super.caseEPackage(ePackage);
			}

			public Object caseETypedElement(ETypedElement eTypedElement) {
				EClassifier eType = (EClassifier) eTypedElement.eGet(
					EcorePackage.eINSTANCE.getETypedElement_EType(), false);

				if (null != eType && eType.eIsProxy()) {
					URI eProxyURI = ((InternalEObject) eType).eProxyURI();
					EPackage ePackage = extendedMetaData.getPackage(eProxyURI
						.trimFragment().toString());

					if (null != ePackage) {
						EClassifier eClassifier = extendedMetaData.getType(
							ePackage, eProxyURI.fragment());

						if (null != eClassifier) {
							((InternalEObject) eType).eSetProxyURI(EcoreUtil
								.getURI(eClassifier));
						}
					}
				}

				return super.caseETypedElement(eTypedElement);
			}

		};

		for (Iterator allContents = resource.getAllContents(); allContents
			.hasNext();) {

			ecoreSwitch.doSwitch((EObject) allContents.next());
		}
	}
}
