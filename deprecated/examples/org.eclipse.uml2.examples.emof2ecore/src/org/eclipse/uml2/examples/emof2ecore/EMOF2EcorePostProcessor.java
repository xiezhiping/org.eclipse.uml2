/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 * 
 * $Id: EMOF2EcorePostProcessor.java,v 1.2 2004/12/22 15:15:27 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResource.PostProcessor;

/**
 * 
 */
public class EMOF2EcorePostProcessor
		extends PostProcessor {

	public static final String copyright = "Copyright (c) 2004 IBM Corporation and others."; //$NON-NLS-1$

	protected AnyType getExtension(EMOF2EcoreResource resource, EObject eObject) {
		return (AnyType) resource.getEObjectToExtensionMap().get(eObject);
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

	protected Object getEcoreExtension(EMOF2EcoreResource resource,
			EObject eObject, String name) {

		AnyType extension = getExtension(resource, eObject);

		if (null != extension) {

			AnyType ecoreExtension = (AnyType) getValue(extension.getMixed(),
				"Extension");

			if (null != ecoreExtension) {
				AnyType instanceClassName = (AnyType) getValue(ecoreExtension
					.getMixed(), name);

				if (null != instanceClassName) {
					return getValue(instanceClassName.getMixed(), "text");
				}
			}
		}

		return null;
	}

	protected EStructuralFeature processProperty(
			final EMOF2EcoreResource resource,
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
						"iD");

					if (null != iD) {
						eAttribute.setID(Boolean.valueOf(iD).booleanValue());
					}

					return eAttribute;
				} else {
					EReference eReference = eObject instanceof EReference
						? (EReference) eObject
						: EcoreFactory.eINSTANCE.createEReference();

					String resolveProxies = (String) getEcoreExtension(
						resource, eObject, "resolveProxies");

					if (null != resolveProxies) {
						eReference.setResolveProxies(Boolean.valueOf(
							resolveProxies).booleanValue());
					}

					String transient_ = (String) getEcoreExtension(resource,
						eObject, "transient");

					if (null != transient_) {
						eReference.setTransient(Boolean.valueOf(transient_)
							.booleanValue());
					}

					String volatile_ = (String) getEcoreExtension(resource,
						eObject, "volatile");

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
	 * @see org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResource.PostProcessor#postLoad(org.eclipse.uml2.examples.emof2ecore.EMOF2EcoreResource,
	 *      java.util.Map)
	 */
	public void postLoad(final EMOF2EcoreResource resource, Map options) {
		final ExtendedMetaData extendedMetaData = (ExtendedMetaData) options
			.get(XMLResource.OPTION_EXTENDED_META_DATA);

		EcoreSwitch ecoreSwitch = new EcoreSwitch() {

			public Object caseEModelElement(EModelElement eModelElement) {
				AnyType extension = getExtension(resource, eModelElement);

				if (null != extension) {
					System.out.println(eModelElement);
					System.out.println("->");
					System.out.println(extension);

					resource.getEObjectToExtensionMap().remove(eModelElement);
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
							.getAnyAttribute(), "isReadOnly");

						if (null != isReadOnly) {
							eStructuralFeature.setChangeable(!Boolean.valueOf(
								isReadOnly).booleanValue());
						}

						if (property != eStructuralFeature) {
							String isComposite = (String) getValue(extension
								.getAnyAttribute(), "isComposite");

							if (null != isComposite) {
								((EReference) eStructuralFeature)
									.setContainment(Boolean
										.valueOf(isComposite).booleanValue());
							}

							String opposite = (String) getValue(extension
								.getAnyAttribute(), "opposite");

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
					resource, eDataType, "instanceClassName"));

				String serializable = (String) getEcoreExtension(resource,
					eDataType, "serializable");

				if (null != serializable) {
					eDataType.setSerializable(Boolean.valueOf(serializable)
						.booleanValue());
				}

				return super.caseEDataType(eDataType);
			}

			public Object caseEPackage(EPackage ePackage) {
				ePackage.setNsPrefix((String) getEcoreExtension(resource,
					ePackage, "nsPrefix"));

				return super.caseEPackage(ePackage);
			}

			public Object caseETypedElement(ETypedElement eTypedElement) {
				EClassifier eType = (EClassifier) eTypedElement.eGet(
					EcorePackage.eINSTANCE.getETypedElement_EType(), false);

				if (null != eType && eType.eIsProxy()
					&& eType == EcoreUtil.resolve(eType, eTypedElement)) {

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
