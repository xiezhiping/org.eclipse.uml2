/*
 * Copyright (c) 2011, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 405374, 418466, 458737
 *
 */
package org.eclipse.uml2.uml.resource;

import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * Resource handler that converts .uml models.
 * OMG:  UML 2.2 and UML 2.4
 * API:  UML2 3.x and UML2 4.0
 * 
 * @since 4.0
 */
public class UML302UMLResourceHandler
		extends BasicResourceHandler {

	protected static final boolean DEBUG = true;

	protected static final String STEREOTYPE__BEHAVIORED_CLASSIFIER = "BehavioredClassifier"; //$NON-NLS-1$

	protected static final String STEREOTYPE__INTERACTION_USE = "InteractionUse"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__ARGUMENT = "argument"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__OWNED_TRIGGER = "ownedTrigger"; //$NON-NLS-1$

	protected boolean resolveProxies = true;

	protected String xmiVersion = null;

	protected AnyType getExtension(XMLResource resource, EObject eObject) {
		return resource.getEObjectToExtensionMap().get(eObject);
	}

	protected AnyType putExtension(XMLResource resource, EObject eObject,
			AnyType extension) {
		return resource.getEObjectToExtensionMap().put(eObject, extension);
	}

	protected AnyType removeExtension(XMLResource resource, EObject eObject) {
		return resource.getEObjectToExtensionMap().remove(eObject);
	}

	protected Object getValue(FeatureMap featureMap, String name) {
		return getValue(featureMap, name, false);
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

	private EObject getEObject(AnyType extension, Resource resource,
			String name, boolean remove) {

		if (extension != null) {
			Object value = getValue(extension.getAnyAttribute(), name, remove);

			if (value == null) {
				value = getValue(extension.getMixed(), name, remove);

				if (value instanceof EObject) {
					EObject eObject = (EObject) value;

					if (eObject.eIsProxy() && resolveProxies) {
						eObject = EcoreUtil.resolve(eObject, resource);
					}

					return eObject;
				}
			} else if (value instanceof String && resource != null) {
				return resource.getEObject((String) value);
			}
		}

		return null;
	}

	protected Collection<Object> getValues(FeatureMap featureMap, String name) {
		return getValues(featureMap, name, false);
	}

	protected Collection<Object> getValues(FeatureMap featureMap, String name,
			boolean remove) {
		Collection<Object> values = new UniqueEList.FastCompare<Object>();

		for (Iterator<FeatureMap.Entry> entries = featureMap.iterator(); entries
			.hasNext();) {

			FeatureMap.Entry entry = entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {

				if (remove) {
					entries.remove();
				}

				values.add(entry.getValue());
			}
		}

		return values;
	}

	private Collection<EObject> getEObjects(AnyType extension,
			Resource resource, String name, boolean remove) {
		Collection<EObject> eObjects = new UniqueEList.FastCompare<EObject>();

		if (extension != null) {
			Collection<Object> values = getValues(extension.getAnyAttribute(),
				name, remove);

			if (values.isEmpty()) {
				values = getValues(extension.getMixed(), name, remove);

				for (Object value : values) {

					if (value instanceof EObject) {
						eObjects.add((EObject) value);
					}
				}
			} else if (resource != null) {

				for (Object value : values) {

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject != null) {
							eObjects.add(eObject);
						}
					}
				}
			}
		}

		return eObjects;
	}

	protected InternalEObject handleProxy(InternalEObject internalEObject) {

		if (internalEObject != null && internalEObject.eIsProxy()) {
			URI eProxyURI = internalEObject.eProxyURI();

			Map<URI, URI> uriMap = UML302UMLExtendedMetaData.getURIMap();
			URI uri = uriMap.get(eProxyURI);

			if (uri != null) {
				internalEObject.eSetProxyURI(uri);
			} else {
				uri = uriMap.get(eProxyURI.trimFragment());

				if (uri != null) {
					String eProxyURIFragment = eProxyURI.fragment();
					String fragment = UML302UMLExtendedMetaData
						.getFragmentMap().get(eProxyURIFragment);

					if (fragment != null) {
						internalEObject.eSetProxyURI(uri
							.appendFragment(fragment));
					} else {
						internalEObject.eSetProxyURI(uri
							.appendFragment(eProxyURIFragment));
					}
				}
			}
		}

		return internalEObject;
	}

	protected EObject reincarnate(EObject eObject, EClass eClass,
			XMLResource resource) {

		if (eObject.eClass() == eClass) {
			return eObject;
		} else {
			EObject newEObject = EcoreUtil.create(eClass);

			if (resource != null) {
				resource.setID(newEObject, resource.getID(eObject));
			}

			for (EStructuralFeature eStructuralFeature : eObject.eClass()
				.getEAllStructuralFeatures()) {

				if (eStructuralFeature.isChangeable()
					&& ((EStructuralFeature.Internal) eStructuralFeature)
						.getEOpposite() == null
					&& eObject.eIsSet(eStructuralFeature)) {

					try {
						newEObject.eSet(
							eClass.getEStructuralFeature(eStructuralFeature
								.getName()), eStructuralFeature.isMany()
								? ((InternalEList<?>) eObject
									.eGet(eStructuralFeature)).basicList()
								: eObject.eGet(eStructuralFeature));
					} catch (Exception e) {
						UMLPlugin.INSTANCE.log(e);
					}
				}
			}

			for (EStructuralFeature.Setting inverseReference : UML2Util
				.getInverseReferences(eObject)) {

				EStructuralFeature eStructuralFeature = inverseReference
					.getEStructuralFeature();

				if (eStructuralFeature.isChangeable()) {

					try {

						if (eStructuralFeature.isMany()) {
							@SuppressWarnings("unchecked")
							List<EObject> values = (List<EObject>) inverseReference
								.get(false);
							values.set(values.indexOf(eObject), newEObject);
						} else {
							inverseReference.set(newEObject);
						}
					} catch (Exception e) {
						UMLPlugin.INSTANCE.log(e);
					}
				}
			}

			return newEObject;
		}
	}

	protected Profile getProfile(Element element, String uri) {
		Resource eResource = element.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				return UML2Util.load(resourceSet,
					URI.createURI(uri),
					UMLPackage.Literals.PROFILE);
			}
		}

		return null;
	}

	protected Profile getUML2Profile(Element element) {
		return getProfile(element, UML302UMLResource.UML2_PROFILE_URI);
	}

	protected Stereotype getUML2Stereotype(Element element, String name) {
		Profile ecoreProfile = getUML2Profile(element);

		return ecoreProfile != null
			? ecoreProfile.getOwnedStereotype(name)
			: null;
	}

	@Override
	public void preLoad(XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {
		xmiVersion = ((XMIResource)resource).getXMIVersion();
	}

	@Override
	public void postLoad(final XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {
		final EList<EObject> resourceContents = resource.getContents();

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

			@Override
			public Object caseActivity(Activity activity) {
				EList<StructuredActivityNode> structuredNodes = activity
					.getStructuredNodes();

				EList<ActivityGroup> groups = activity.getGroups();

				for (ListIterator<ActivityGroup> ownedGroups = activity
					.getOwnedGroups().listIterator(); ownedGroups.hasNext();) {

					ActivityGroup group = (ActivityGroup) ownedGroups.next();

					if (group instanceof StructuredActivityNode) {
						ownedGroups.remove();
						structuredNodes.add((StructuredActivityNode) group);
					}

					groups.add(group);
				}

				EList<ActivityNode> nodes = activity.getNodes();

				for (ListIterator<ActivityNode> ownedNodes = activity
					.getOwnedNodes().listIterator(); ownedNodes.hasNext();) {

					ActivityNode node = (ActivityNode) ownedNodes.next();

					if (node instanceof StructuredActivityNode) {
						ownedNodes.remove();
						structuredNodes.add((StructuredActivityNode) node);
					}

					nodes.add(node);
				}

				for (StructuredActivityNode structuredNode : structuredNodes) {

					if (!groups.contains(structuredNode)) {
						groups.add(structuredNode);
					}

					if (!nodes.contains(structuredNode)) {
						nodes.add(structuredNode);
					}
				}

				return super.caseActivity(activity);
			}

			@Override
			public Object caseBehavior(Behavior behavior) {

				if (!behavior.isSetIsReentrant()) {
					behavior.setIsReentrant(false);
				}

				return super.caseBehavior(behavior);
			}

			@Override
			public Object caseBehavioredClassifier(
					BehavioredClassifier behavioredClassifier) {
				AnyType extension = getExtension(resource, behavioredClassifier);

				if (extension != null) {
					Collection<EObject> ownedTriggers = getEObjects(extension,
						resource, TAG_DEFINITION__OWNED_TRIGGER, true);

					if (!ownedTriggers.isEmpty()) {
						UMLUtil.setTaggedValue(
							behavioredClassifier,
							getUML2Stereotype(behavioredClassifier,
								STEREOTYPE__BEHAVIORED_CLASSIFIER),
							TAG_DEFINITION__OWNED_TRIGGER, ownedTriggers);
					}
				}

				return super.caseBehavioredClassifier(behavioredClassifier);
			}

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
			public Object caseConnector(Connector connector) {
				AnyType extension = getExtension(resource, connector);

				if (extension != null) {
					getValue(extension.getAnyAttribute(), "kind", true); //$NON-NLS-1$
				}	
				
				return super.caseConnector(connector);
			}

			@Override
			public Object caseDependency(Dependency dependency) {
				AnyType extension = getExtension(resource, dependency);

				if (extension != null) {
					Collection<EObject> clients = getEObjects(extension,
						resource, "client", true); //$NON-NLS-1$

					InternalEList<NamedElement> dependencyClients = (InternalEList<NamedElement>) (dependency instanceof ComponentRealization
						? dependency.getSuppliers()
						: dependency.getClients());

					for (EObject client : clients) {

						if (client instanceof NamedElement
							&& !dependencyClients.contains(client)) {

							dependencyClients.addUnique((NamedElement) client);
						}
					}

					Collection<EObject> suppliers = getEObjects(extension,
						resource, "supplier", true); //$NON-NLS-1$

					InternalEList<NamedElement> dependencySuppliers = (InternalEList<NamedElement>) (dependency instanceof ComponentRealization
						? dependency.getClients()
						: dependency.getSuppliers());

					for (EObject supplier : suppliers) {

						if (supplier instanceof NamedElement
							&& !dependencySuppliers.contains(supplier)) {

							dependencySuppliers
								.addUnique((NamedElement) supplier);
						}
					}
				}

				return super.caseDependency(dependency);
			}

			@Override
			public Object caseInstanceSpecification(
					InstanceSpecification instanceSpecification) {
				AnyType extension = getExtension(resource,
					instanceSpecification);

				if (extension != null) {
					Collection<EObject> classifiers = getEObjects(extension,
						resource, "classifier", true); //$NON-NLS-1$

					if (!classifiers.isEmpty()
						&& !(instanceSpecification instanceof EnumerationLiteral)) {

						InternalEList<Classifier> instanceSpecificationClassifiers = (InternalEList<Classifier>) instanceSpecification
							.getClassifiers();

						for (EObject classifier : classifiers) {

							if (classifier instanceof Classifier) {
								instanceSpecificationClassifiers
									.addUnique((Classifier) classifier);
							}
						}
					}
				}

				return super.caseInstanceSpecification(instanceSpecification);
			}

			@Override
			public Object caseInteractionUse(InteractionUse interactionUse) {
				AnyType extension = getExtension(resource, interactionUse);

				if (extension != null) {
					Collection<EObject> arguments = getEObjects(extension,
						resource, TAG_DEFINITION__ARGUMENT, true);

					if (!arguments.isEmpty()) {
						UMLUtil.setTaggedValue(
							interactionUse,
							getUML2Stereotype(interactionUse,
								STEREOTYPE__INTERACTION_USE),
							TAG_DEFINITION__ARGUMENT, arguments);
					}
				}

				return super.caseInteractionUse(interactionUse);
			}

			@Override
			public Object caseNamedElement(NamedElement namedElement) {
				AnyType extension = getExtension(resource, namedElement);

				if (extension != null) {
					getValue(extension.getAnyAttribute(), "clientDependency", true); //$NON-NLS-1$
				}	
				
				return super.caseNamedElement(namedElement);
			}

			@Override
			public Object caseOccurrenceSpecification(OccurrenceSpecification occurrenceSpecification) {				
				EObject event = getEObject(getExtension(resource, occurrenceSpecification),
					resource, "event", true); //$NON-NLS-1$
				
				if (event != null) {
					EClass eClass = event.eClass();
					String name = eClass.getName();

					if ("DestructionEvent".equals(name)) { //$NON-NLS-1$
						return reincarnate(
							occurrenceSpecification,
							UMLPackage.Literals.DESTRUCTION_OCCURRENCE_SPECIFICATION,
							resource);
					} else if (occurrenceSpecification instanceof MessageOccurrenceSpecification) {
						Message message = ((MessageOccurrenceSpecification) occurrenceSpecification)
							.getMessage();

						if (message == null) {

							for (EStructuralFeature.Setting inverseReference : UML2Util
									.getInverseReferences(occurrenceSpecification)) {
								EObject eObject = inverseReference.getEObject();
								
								if (eObject instanceof Message) {
									message = (Message) eObject;
									break;
								}
							}
						}

						if (message != null) {

							if ("CallEvent".equals(name)) { //$NON-NLS-1$
								message.setSignature(((CallEvent) event)
									.getOperation());
							} else if ("ReceiveOperationEvent".equals(name) //$NON-NLS-1$
								|| "SendOperationEvent".equals(name)) { //$NON-NLS-1$
								message.setSignature((NamedElement) getEObject(
									(AnyType) event, resource, "operation", //$NON-NLS-1$
									false));
							} else if ("ReceiveSignalEvent".equals(name) //$NON-NLS-1$
								|| "SendSignalEvent".equals(name)) { //$NON-NLS-1$
								message
									.setSignature((NamedElement) getEObject(
										(AnyType) event, resource, "signal", //$NON-NLS-1$
										false));
							} else if ("SignalEvent".equals(name)) { //$NON-NLS-1$
								message.setSignature(((SignalEvent) event)
									.getSignal());
							}
						}
					}
				}

				return super.caseOccurrenceSpecification(occurrenceSpecification);
			}

			@Override
			public Object casePackage(org.eclipse.uml2.uml.Package package_) {
				AnyType extension = getExtension(resource, package_);

				if (extension != null) {
					getEObjects(extension, resource, "packagedElement", true); //$NON-NLS-1$
				}	

				for (ProfileApplication profileApplication : package_
					.getProfileApplications()) {

					defaultCase(profileApplication);
				}

				Object nsURI = UMLUtil.getTaggedValue(package_,
					UMLUtil.PROFILE__ECORE + NamedElement.SEPARATOR
						+ UMLUtil.STEREOTYPE__E_PACKAGE,
					UMLUtil.TAG_DEFINITION__NS_URI);

				if (nsURI instanceof String) {
					package_.setURI((String) nsURI);
				}

				return super.casePackage(package_);
			}

			@Override
			public Object caseProperty(Property property) {
				Object isID = UMLUtil.getTaggedValue(property,
					UMLUtil.PROFILE__ECORE + NamedElement.SEPARATOR
						+ UMLUtil.STEREOTYPE__E_ATTRIBUTE,
					UMLUtil.TAG_DEFINITION__IS_ID);

				if (isID instanceof Boolean) {
					property.setIsID((Boolean) isID);
				}

				return super.caseProperty(property);
			}

			@Override
			public Object defaultCase(EObject eObject) {
				AnyType extension = getExtension(resource, eObject);

				if (extension != null) {

					if (extension.getAnyAttribute().isEmpty()
						&& extension.getMixed().isEmpty()) {

						removeExtension(resource, eObject);
					} else if (DEBUG) {
						System.out.println(eObject);
						System.out.println("->"); //$NON-NLS-1$
						System.out.println(extension);

						EAnnotation eAnnotation = UML2Util.createEAnnotation(
							null, ExtendedMetaData.ANNOTATION_URI);

						eAnnotation.getContents().add(extension);
						eAnnotation.getReferences().add(eObject);

						resourceContents.add(eAnnotation);
					}
				}

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
		
		((XMIResource)resource).setXMIVersion(xmiVersion);
	}

}
