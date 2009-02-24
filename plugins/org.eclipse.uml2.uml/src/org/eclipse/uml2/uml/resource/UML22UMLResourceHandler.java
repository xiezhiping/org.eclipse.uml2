/*
 * Copyright (c) 2006, 2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: UML22UMLResourceHandler.java,v 1.37 2009/02/24 23:19:53 jbruck Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DestructionEvent;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.ExecutionEvent;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageEvent;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.ReceiveOperationEvent;
import org.eclipse.uml2.uml.ReceiveSignalEvent;
import org.eclipse.uml2.uml.SendOperationEvent;
import org.eclipse.uml2.uml.SendSignalEvent;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.ElementOperations;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UML22UMLResourceHandler
		extends BasicResourceHandler {

	protected static final boolean DEBUG = false;

	protected boolean resolveProxies = true;
	
	protected static final String STEREOTYPE__ACTION = "Action"; //$NON-NLS-1$

	protected static final String STEREOTYPE__ACTIVITY = "Activity"; //$NON-NLS-1$

	protected static final String STEREOTYPE__COMMENT = "Comment"; //$NON-NLS-1$

	protected static final String STEREOTYPE__EXPRESSION = "Expression"; //$NON-NLS-1$

	protected static final String STEREOTYPE__MESSAGE = "Message"; //$NON-NLS-1$

	protected static final String STEREOTYPE__OPAQUE_EXPRESSION = "OpaqueExpression"; //$NON-NLS-1$

	protected static final String STEREOTYPE__TEMPLATE_SIGNATURE = "TemplateSignature"; //$NON-NLS-1$
	
	protected static final String STEREOTYPE__TIME_EVENT = "TimeEvent"; //$NON-NLS-1$

	protected static final String STEREOTYPE__TEMPLATEABLE_ELEMENT = "TemplateableElement"; //$NON-NLS-1$

	protected static final String STEREOTYPE__CLASSIFIER_TEMPLATE_PARAMETER = "ClassifierTemplateParameter"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__BEHAVIOR = "behavior"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__BODY = "body"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__BODY_EXPRESSION = "bodyExpression"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__EFFECT = "effect"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__LANGUAGE = "language"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__NESTED_SIGNATURE = "nestedSignature"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__NESTING_SIGNATURE = "nestingSignature"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__OPERAND = "operand"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__SIGNATURE = "signature"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__SYMBOL = "symbol"; //$NON-NLS-1$
	
	protected static final String TAG_DEFINITION__WHEN = "when"; //$NON-NLS-1$
		
	protected static final String TAG_DEFINITION__DEFAULT_CLASSIFER = "defaultClassifier"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__TEMPLATE_BINDING = "templateBinding"; //$NON-NLS-1$

	protected static final String TAG_DEFINITION__OWNED_TEMPLATE_SIGNATURE = "ownedTemplateSignature"; //$NON-NLS-1$

	protected static final String UML2_UML_PACKAGE_2_0_NS_URI = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$

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
					return (EObject) value;
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
			URI uri = UML22UMLExtendedMetaData.getURIMap().get(
				eProxyURI.trimFragment());

			if (uri != null) {
				String fragment = UML22UMLExtendedMetaData.getFragmentMap()
					.get(eProxyURI.fragment());

				if (fragment != null) {
					internalEObject.eSetProxyURI(uri.appendFragment(fragment));
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

	protected EObject reincarnate(EObject eObject, EClass eClass) {
		return reincarnate(eObject, eClass, null);
	}

	protected Profile getUML2Profile(Element element) {
		Resource eResource = element.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				return UML2Util.load(resourceSet, URI
					.createURI(UML22UMLResource.UML2_PROFILE_URI),
					UMLPackage.Literals.PROFILE);
			}
		}

		return null;
	}

	protected Stereotype getUML2Stereotype(Element element, String name) {
		Profile ecoreProfile = getUML2Profile(element);

		return ecoreProfile != null
			? ecoreProfile.getOwnedStereotype(name)
			: null;
	}

	@Override
	public void postLoad(final XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {
		final EList<EObject> resourceContents = resource.getContents();

		final List<EAnnotation> annotationsToRemove = new ArrayList<EAnnotation>();

		final Map<org.eclipse.uml2.uml.Package, DestructionEvent> destructionEvents = new HashMap<org.eclipse.uml2.uml.Package, DestructionEvent>();
		final Map<org.eclipse.uml2.uml.Package, ExecutionEvent> executionEvents = new HashMap<org.eclipse.uml2.uml.Package, ExecutionEvent>();
		final Map<org.eclipse.uml2.uml.Package, Map<NamedElement, MessageEvent>> sendEvents = new HashMap<org.eclipse.uml2.uml.Package, Map<NamedElement, MessageEvent>>();
		final Map<org.eclipse.uml2.uml.Package, Map<NamedElement, MessageEvent>> receiveEvents = new HashMap<org.eclipse.uml2.uml.Package, Map<NamedElement, MessageEvent>>();

		final List<org.eclipse.uml2.uml.Package> packagesRequiringStereotypes = new ArrayList<org.eclipse.uml2.uml.Package>();

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

			@Override
			public Object caseAcceptEventAction(
					AcceptEventAction acceptEventAction) {
				AnyType extension = getExtension(resource, acceptEventAction);

				if (extension != null) {
					EList<Trigger> triggers = acceptEventAction.getTriggers();

					for (EObject eObject : getEObjects(extension, resource,
						"trigger", true)) { //$NON-NLS-1$

						if (eObject instanceof Trigger) {
							doSwitch(eObject);

							triggers.add((Trigger) EcoreUtil.copy(eObject));
						}
					}
				}

				return super.caseAcceptEventAction(acceptEventAction);
			}

			@Override
			public Object caseAction(Action action) {
				AnyType extension = getExtension(resource, action);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"effect", true); //$NON-NLS-1$

					if (value instanceof String) {
						UMLUtil.setTaggedValue(action, getUML2Stereotype(
							action, STEREOTYPE__ACTION),
							TAG_DEFINITION__EFFECT, value);
					}
				}

				return super.caseAction(action);
			}

			@Override
			public Object caseActivity(Activity activity) {
				AnyType extension = getExtension(resource, activity);

				if (extension != null) {
					getEObjects(extension, resource, "action", true); //$NON-NLS-1$

					Object value = getValue(extension.getAnyAttribute(),
						"body", true); //$NON-NLS-1$

					if (value instanceof String) {
						UMLUtil.setTaggedValue(activity, getUML2Stereotype(
							activity, STEREOTYPE__ACTIVITY),
							TAG_DEFINITION__BODY, value);
					}

					value = getValue(extension.getAnyAttribute(),
						"language", true); //$NON-NLS-1$

					if (value instanceof String) {
						UMLUtil.setTaggedValue(activity, getUML2Stereotype(
							activity, STEREOTYPE__ACTIVITY),
							TAG_DEFINITION__LANGUAGE, value);
					}

				}

				return super.caseActivity(activity);
			}

			@Override
			public Object caseBehavioralFeature(
					BehavioralFeature behavioralFeature) {
				AnyType extension = getExtension(resource, behavioralFeature);

				if (extension != null) {
					EList<Parameter> ownedParameters = behavioralFeature
						.getOwnedParameters();
					List<EObject> returnResult = new ArrayList<EObject>(
						getEObjects(extension, resource, "returnResult", true)); //$NON-NLS-1$

					for (ListIterator<EObject> eObjects = returnResult
						.listIterator(returnResult.size()); eObjects
						.hasPrevious();) {

						EObject eObject = eObjects.previous();

						if (eObject instanceof Parameter) {
							ownedParameters.add(0, (Parameter) eObject);
						}
					}

					for (EObject eObject : getEObjects(extension, resource,
						"formalParameter", true)) { //$NON-NLS-1$

						if (eObject instanceof Parameter) {
							ownedParameters.add((Parameter) eObject);
						}
					}
				}

				return super.caseBehavioralFeature(behavioralFeature);
			}

			@Override
			public Object caseBehavioredClassifier(
					BehavioredClassifier behavioredClassifier) {
				AnyType extension = getExtension(resource, behavioredClassifier);

				if (extension != null) {
					EList<Behavior> ownedBehaviors = behavioredClassifier
						.getOwnedBehaviors();

					for (EObject eObject : getEObjects(extension, resource,
						"ownedStateMachine", true)) { //$NON-NLS-1$

						if (eObject instanceof StateMachine) {
							ownedBehaviors.add((StateMachine) eObject);
						}
					}
				}

				return super.caseBehavioredClassifier(behavioredClassifier);
			}

			@Override
			public Object caseCallBehaviorAction(
					CallBehaviorAction callBehaviorAction) {
				EObject eObject = getEObject(getExtension(resource,
					callBehaviorAction), resource, "function", true); //$NON-NLS-1$

				if (eObject instanceof FunctionBehavior) {
					callBehaviorAction.setBehavior((FunctionBehavior) eObject);
				}

				return super.caseCallBehaviorAction(callBehaviorAction);
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

					EObject eObject = getEObject(extension, resource,
						"bodyExpression", true); //$NON-NLS-1$

					if (eObject instanceof StringExpression) {
						UMLUtil.setTaggedValue(comment, getUML2Stereotype(
							comment, STEREOTYPE__COMMENT),
							TAG_DEFINITION__BODY_EXPRESSION, eObject);
					}
				}

				return super.caseComment(comment);
			}

			@Override
			public Object caseDuration(Duration duration) {
				AnyType extension = getExtension(resource, duration);

				if (extension != null) {
					Boolean isFirstEvent = Boolean.valueOf(!"false" //$NON-NLS-1$
						.equals(getValue(extension.getAnyAttribute(),
							"isFirstTime", true))); //$NON-NLS-1$

					Collection<EObject> eObjects = getEObjects(extension,
						resource, "event", true); //$NON-NLS-1$

					if (!eObjects.isEmpty()) {
						DurationObservation durationObservation = (DurationObservation) duration
							.getNearestPackage().createPackagedElement(
								duration.getName(),
								UMLPackage.Literals.DURATION_OBSERVATION);

						EList<NamedElement> events = durationObservation
							.getEvents();
						EList<Boolean> firstEvents = durationObservation
							.getFirstEvents();

						for (EObject eObject : eObjects) {

							if (eObject instanceof NamedElement) {
								events.add((NamedElement) eObject);
								firstEvents.add(isFirstEvent);
							}
						}

						duration.getObservations().add(durationObservation);
					}
				}

				return super.caseDuration(duration);
			}

			@Override
			public Object caseElement(Element element) {
				EAnnotation keywordsAnnotation = element
					.getEAnnotation("keywords"); //$NON-NLS-1$

				if (keywordsAnnotation != null) {
					keywordsAnnotation.setSource(UML2_UML_PACKAGE_2_0_NS_URI);
				}

				EAnnotation appliedStereotypesAnnotation = element
					.getEAnnotation("appliedStereotypes"); //$NON-NLS-1$

				if (appliedStereotypesAnnotation != null) {
					annotationsToRemove.add(appliedStereotypesAnnotation);

					EList<EObject> contents = appliedStereotypesAnnotation
						.getContents();

					for (int i = contents.size(); i > 0;) {
						InternalEObject stereotypeApplication = (InternalEObject) contents
							.get(--i);

						UMLUtil.setBaseElement(stereotypeApplication, element);

						resourceContents.add(stereotypeApplication);
					}
				}

				return super.caseElement(element);
			}

			@Override
			public Object caseExecutionOccurrenceSpecification(
					ExecutionOccurrenceSpecification executionOccurrenceSpecification) {
				org.eclipse.uml2.uml.Package nearestPackage = executionOccurrenceSpecification
					.getNearestPackage();

				if (nearestPackage != null) {
					ExecutionEvent executionEvent = executionEvents
						.get(nearestPackage);

					if (executionEvent == null) {
						executionEvents.put(nearestPackage,
							executionEvent = (ExecutionEvent) nearestPackage
								.createPackagedElement(null,
									UMLPackage.Literals.EXECUTION_EVENT));
					}

					executionOccurrenceSpecification.setEvent(executionEvent);
				}

				defaultCase(executionOccurrenceSpecification);

				return executionOccurrenceSpecification;
			}

			@Override
			public Object caseExpression(Expression expression) {
				AnyType extension = getExtension(resource, expression);

				if (extension != null) {
					Stereotype stereotype = getUML2Stereotype(expression,
						STEREOTYPE__OPAQUE_EXPRESSION);

					EObject eObject = getEObject(extension, resource,
						"behavior", true); //$NON-NLS-1$

					if (eObject instanceof Behavior) {
						UMLUtil.setTaggedValue(expression, stereotype,
							TAG_DEFINITION__BEHAVIOR, eObject);
					}

					Object value = getValue(extension.getAnyAttribute(),
						"body", true); //$NON-NLS-1$

					if (value instanceof String) {
						UMLUtil.setTaggedValue(expression, stereotype,
							TAG_DEFINITION__BODY, value);
					}

					value = getValue(extension.getMixed(), "body", true); //$NON-NLS-1$

					if (value instanceof AnyType) {
						value = getValue(((AnyType) value).getMixed(),
							"text", true); //$NON-NLS-1$

						if (value instanceof String) {
							UMLUtil.setTaggedValue(expression, stereotype,
								TAG_DEFINITION__BODY, value);
						}
					}

					value = getValue(extension.getAnyAttribute(),
						"language", true); //$NON-NLS-1$

					if (value instanceof String) {
						UMLUtil.setTaggedValue(expression, stereotype,
							TAG_DEFINITION__LANGUAGE, value);
					}
				}

				return super.caseExpression(expression);
			}

			@Override
			public Object caseExtensionEnd(ExtensionEnd extensionEnd) {
				String name = extensionEnd.getName();

				if (!UML2Util.isEmpty(name) && name.startsWith("extension$")) { //$NON-NLS-1$
					extensionEnd.setName(Extension.STEREOTYPE_ROLE_PREFIX
						+ name.substring(10));
				}

				if (extensionEnd.getLowerValue() == null) {
					AnyType extension = getExtension(resource, extensionEnd);

					if (extension == null
						|| getEObject(extension, resource, "lowerValue", true) == null) { //$NON-NLS-1$

						extensionEnd.setLower(1);
					}
				}

				return super.caseExtensionEnd(extensionEnd);
			}

			@Override
			public Object caseInteractionUse(InteractionUse interactionUse) {
				AnyType extension = getExtension(resource, interactionUse);

				if (extension != null) {
					EObject eObject = getEObject(extension, resource,
						"argument", true); //$NON-NLS-1$

					if (eObject instanceof InputPin) {
						InputPin inputValue = (InputPin) eObject;
						((OpaqueAction) interactionUse.createArgument(
							inputValue.getName(),
							UMLPackage.Literals.OPAQUE_ACTION))
							.getInputValues().add(inputValue);
					}
				}

				return super.caseInteractionUse(interactionUse);
			}

			@Override
			public Object caseMultiplicityElement(
					MultiplicityElement multiplicityElement) {
				AnyType extension = getExtension(resource, multiplicityElement);

				if (extension != null) {
					EObject eObject = getEObject(extension, resource,
						"lowerValue", true); //$NON-NLS-1$

					if (eObject instanceof ValueSpecification) {
						multiplicityElement
							.setLowerValue((ValueSpecification) eObject);
					}
				}

				return super.caseMultiplicityElement(multiplicityElement);
			}

			@Override
			public Object caseMessage(Message message) {
				AnyType extension = getExtension(resource, message);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"messageSort", true); //$NON-NLS-1$

					if (value instanceof String) {
						message.setMessageSort("synchSignal" //$NON-NLS-1$
							.equals(value)
								? MessageSort.ASYNCH_SIGNAL_LITERAL
								: MessageSort.get((String) value));
					}

					EObject eObject = getEObject(extension, resource,
						"signature", true); //$NON-NLS-1$

					if (eObject instanceof NamedElement) {
						UMLUtil.setTaggedValue(message, getUML2Stereotype(
							message, STEREOTYPE__MESSAGE),
							TAG_DEFINITION__SIGNATURE, eObject);
					}
				}

				return super.caseMessage(message);
			}

			@Override
			public Object caseMessageEnd(MessageEnd messageEnd) {
				AnyType extension = getExtension(resource, messageEnd);

				if (extension != null) {
					EObject eObject = getEObject(extension, resource,
						"receiveMessage", true); //$NON-NLS-1$

					if (eObject instanceof Message) {
						messageEnd.setMessage((Message) eObject);
					}

					eObject = getEObject(extension, resource,
						"sendMessage", true); //$NON-NLS-1$

					if (eObject instanceof Message) {
						messageEnd.setMessage((Message) eObject);
					}
				}

				return super.caseMessageEnd(messageEnd);
			}

			@Override
			public Object caseMessageOccurrenceSpecification(
					MessageOccurrenceSpecification messageOccurrenceSpecification) {
				caseMessageEnd(messageOccurrenceSpecification);
				caseNamedElement(messageOccurrenceSpecification);
				caseElement(messageOccurrenceSpecification);

				AnyType extension = getExtension(resource,
					messageOccurrenceSpecification);

				Message message = messageOccurrenceSpecification.getMessage();

				if (message == null) {
					Collection<EObject> eObjects = Collections
						.<EObject> emptyList();

					if (extension != null) {
						eObjects = getEObjects(extension, resource,
							"startExec", true); //$NON-NLS-1$

						if (eObjects.isEmpty()) {
							eObjects = getEObjects(extension, resource,
								"finishExec", true); //$NON-NLS-1$
						}
					}

					if (eObjects.isEmpty()) {
						return caseOccurrenceSpecification((OccurrenceSpecification) reincarnate(
							messageOccurrenceSpecification,
							UMLPackage.Literals.OCCURRENCE_SPECIFICATION,
							resource));
					} else {

						for (EObject eObject : eObjects) {

							if (eObject instanceof ExecutionSpecification) {
								ExecutionSpecification execution = (ExecutionSpecification) eObject;

								if (execution.getFinish() == messageOccurrenceSpecification) {
									OccurrenceSpecification start = execution
										.getStart();

									if (start instanceof MessageOccurrenceSpecification
										&& ((MessageOccurrenceSpecification) start)
											.getMessage() != null) {

										break;
									}
								}

								ExecutionOccurrenceSpecification executionOccurrenceSpecification = (ExecutionOccurrenceSpecification) reincarnate(
									messageOccurrenceSpecification,
									UMLPackage.Literals.EXECUTION_OCCURRENCE_SPECIFICATION,
									resource);

								executionOccurrenceSpecification
									.setExecution(execution);

								return caseExecutionOccurrenceSpecification(executionOccurrenceSpecification);
							}
						}
					}
				} else {
					org.eclipse.uml2.uml.Package nearestPackage = messageOccurrenceSpecification
						.getNearestPackage();

					if (nearestPackage != null) {
						doSwitch(message);

						Stereotype stereotype = getUML2Stereotype(message,
							STEREOTYPE__MESSAGE);

						NamedElement signature = message.hasValue(stereotype,
							TAG_DEFINITION__SIGNATURE)
							? (NamedElement) message.getValue(stereotype,
								TAG_DEFINITION__SIGNATURE)
							: null;

						if (message.getSendEvent() == messageOccurrenceSpecification) {
							Map<NamedElement, MessageEvent> nearestSendEvents = sendEvents
								.get(nearestPackage);

							switch (message.getMessageSort().getValue()) {
								case MessageSort.SYNCH_CALL :
								case MessageSort.ASYNCH_CALL :
									SendOperationEvent sendOperationEvent = signature instanceof Operation
										? (nearestSendEvents == null
											? null
											: (SendOperationEvent) nearestSendEvents
												.get(signature))
										: null;

									if (sendOperationEvent == null) {
										sendOperationEvent = (SendOperationEvent) nearestPackage
											.createPackagedElement(
												null,
												UMLPackage.Literals.SEND_OPERATION_EVENT);

										if (signature instanceof Operation) {
											sendOperationEvent
												.setOperation((Operation) signature);

											if (nearestSendEvents == null) {
												sendEvents
													.put(
														nearestPackage,
														nearestSendEvents = new HashMap<NamedElement, MessageEvent>());
											}

											nearestSendEvents.put(signature,
												sendOperationEvent);
										}
									}

									messageOccurrenceSpecification
										.setEvent(sendOperationEvent);
									break;
								case MessageSort.ASYNCH_SIGNAL :
									SendSignalEvent sendSignalEvent = signature instanceof Signal
										? (nearestSendEvents == null
											? null
											: (SendSignalEvent) nearestSendEvents
												.get(signature))
										: null;

									if (sendSignalEvent == null) {
										sendSignalEvent = (SendSignalEvent) nearestPackage
											.createPackagedElement(
												null,
												UMLPackage.Literals.SEND_SIGNAL_EVENT);

										if (signature instanceof Signal) {
											sendSignalEvent
												.setSignal((Signal) signature);

											if (nearestSendEvents == null) {
												sendEvents
													.put(
														nearestPackage,
														nearestSendEvents = new HashMap<NamedElement, MessageEvent>());
											}

											nearestSendEvents.put(signature,
												sendSignalEvent);
										}
									}

									messageOccurrenceSpecification
										.setEvent(sendSignalEvent);
									break;
							}
						} else if (message.getReceiveEvent() == messageOccurrenceSpecification) {
							Map<NamedElement, MessageEvent> nearestReceiveEvents = receiveEvents
								.get(nearestPackage);

							switch (message.getMessageSort().getValue()) {
								case MessageSort.SYNCH_CALL :
								case MessageSort.ASYNCH_CALL :
									ReceiveOperationEvent receiveOperationEvent = signature instanceof Operation
										? (nearestReceiveEvents == null
											? null
											: (ReceiveOperationEvent) nearestReceiveEvents
												.get(signature))
										: null;

									if (receiveOperationEvent == null) {
										receiveOperationEvent = (ReceiveOperationEvent) nearestPackage
											.createPackagedElement(
												null,
												UMLPackage.Literals.RECEIVE_OPERATION_EVENT);

										if (signature instanceof Operation) {
											receiveOperationEvent
												.setOperation((Operation) signature);

											if (nearestReceiveEvents == null) {
												receiveEvents
													.put(
														nearestPackage,
														nearestReceiveEvents = new HashMap<NamedElement, MessageEvent>());
											}

											nearestReceiveEvents.put(signature,
												receiveOperationEvent);
										}
									}

									messageOccurrenceSpecification
										.setEvent(receiveOperationEvent);
									break;
								case MessageSort.ASYNCH_SIGNAL :
									ReceiveSignalEvent receiveSignalEvent = signature instanceof Signal
										? (nearestReceiveEvents == null
											? null
											: (ReceiveSignalEvent) nearestReceiveEvents
												.get(signature))
										: null;

									if (receiveSignalEvent == null) {
										receiveSignalEvent = (ReceiveSignalEvent) nearestPackage
											.createPackagedElement(
												null,
												UMLPackage.Literals.RECEIVE_SIGNAL_EVENT);

										if (signature instanceof Signal) {
											receiveSignalEvent
												.setSignal((Signal) signature);

											if (nearestReceiveEvents == null) {
												receiveEvents
													.put(
														nearestPackage,
														nearestReceiveEvents = new HashMap<NamedElement, MessageEvent>());
											}

											nearestReceiveEvents.put(signature,
												receiveSignalEvent);
										}
									}

									messageOccurrenceSpecification
										.setEvent(receiveSignalEvent);
									break;
							}
						}
					}

					if (extension != null) {
						Collection<EObject> eObjects = getEObjects(extension,
							resource, "startExec", true); //$NON-NLS-1$

						if (eObjects.isEmpty()) {
							eObjects = getEObjects(extension, resource,
								"finishExec", true); //$NON-NLS-1$
						}

						for (EObject eObject : eObjects) {

							if (eObject instanceof ExecutionSpecification) {
								ExecutionSpecification execution = (ExecutionSpecification) eObject;

								if (execution.getFinish() == messageOccurrenceSpecification) {
									OccurrenceSpecification start = execution
										.getStart();

									if (start instanceof MessageOccurrenceSpecification) {
										Message startMessage = ((MessageOccurrenceSpecification) start)
											.getMessage();

										if (startMessage != null) {
											doSwitch(startMessage);

											if (startMessage.getMessageSort() == MessageSort.SYNCH_CALL_LITERAL) {
												message
													.setMessageSort(MessageSort.REPLY_LITERAL);
											}
										}
									}

									break;
								}
							}
						}
					}
				}

				defaultCase(messageOccurrenceSpecification);

				return messageOccurrenceSpecification;
			}

			@Override
			public Object caseNamespace(Namespace namespace) {
				AnyType extension = getExtension(resource, namespace);

				if (extension != null) {
					EList<PackageImport> packageImports = namespace
						.getPackageImports();

					for (EObject eObject : getEObjects(extension, resource,
						"packageImport", true)) { //$NON-NLS-1$

						if (eObject instanceof PackageImport) {
							packageImports.add((PackageImport) eObject);
						}
					}
				}

				return super.caseNamespace(namespace);
			}

			@Override
			public Object caseOccurrenceSpecification(
					OccurrenceSpecification occurrenceSpecification) {

				if (occurrenceSpecification.getEvent() == null) {
					org.eclipse.uml2.uml.Package nearestPackage = occurrenceSpecification
						.getNearestPackage();

					if (nearestPackage != null) {
						DestructionEvent destructionEvent = destructionEvents
							.get(nearestPackage);

						if (destructionEvent == null) {
							destructionEvents
								.put(
									nearestPackage,
									destructionEvent = (DestructionEvent) nearestPackage
										.createPackagedElement(
											null,
											UMLPackage.Literals.DESTRUCTION_EVENT));
						}

						occurrenceSpecification.setEvent(destructionEvent);
					}
				}

				defaultCase(occurrenceSpecification);

				return occurrenceSpecification;
			}

			@Override
			public Object caseOpaqueAction(OpaqueAction opaqueAction) {
				AnyType extension = getExtension(resource, opaqueAction);

				if (extension != null) {
					EObject eObject = getEObject(extension, resource,
						"duration", true); //$NON-NLS-1$

					if (eObject instanceof Duration) {
						Duration duration = (Duration) eObject;

						ValuePin inputValue = (ValuePin) opaqueAction
							.createInputValue(duration.getName(), duration
								.getType(), UMLPackage.Literals.VALUE_PIN);

						inputValue.setValue(duration);
					}

					eObject = getEObject(extension, resource, "now", true); //$NON-NLS-1$

					if (eObject instanceof TimeExpression) {
						TimeExpression timeExpression = (TimeExpression) eObject;

						ValuePin inputValue = (ValuePin) opaqueAction
							.createInputValue(timeExpression.getName(),
								timeExpression.getType(),
								UMLPackage.Literals.VALUE_PIN);

						inputValue.setValue(timeExpression);
					}
				}

				return super.caseOpaqueAction(opaqueAction);
			}

			@Override
			public Object caseOpaqueExpression(OpaqueExpression opaqueExpression) {
				AnyType extension = getExtension(resource, opaqueExpression);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"body", true); //$NON-NLS-1$

					if (value instanceof String) {
						opaqueExpression.getBodies().add((String) value);
					}

					Stereotype stereotype = getUML2Stereotype(opaqueExpression,
						STEREOTYPE__EXPRESSION);

					Collection<EObject> eObjects = getEObjects(extension,
						resource, "operand", true); //$NON-NLS-1$

					if (!eObjects.isEmpty()) {

						if (UMLUtil.safeApplyStereotype(opaqueExpression,
							stereotype) != null) {

							@SuppressWarnings("unchecked")
							EList<ValueSpecification> operands = (EList<ValueSpecification>) opaqueExpression
								.getValue(stereotype, TAG_DEFINITION__OPERAND);

							for (EObject eObject : eObjects) {

								if (eObject instanceof ValueSpecification) {
									operands.add((ValueSpecification) eObject);
								}
							}
						}
					}

					value = getValue(extension.getAnyAttribute(),
						"symbol", true); //$NON-NLS-1$

					if (value instanceof String) {
						UMLUtil.setTaggedValue(opaqueExpression, stereotype,
							TAG_DEFINITION__SYMBOL, value);
					}
				}

				return super.caseOpaqueExpression(opaqueExpression);
			}

			@Override
			public Object caseOperation(Operation operation) {
				Parameter returnResult = operation.getReturnResult();

				if (returnResult != null) {
					returnResult.destroy();
				}

				return super.caseOperation(operation);
			}

			@Override
			public Object casePackageableElement(
					PackageableElement packageableElement) {
				AnyType extension = getExtension(resource, packageableElement);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"packageableElement_visibility", true); //$NON-NLS-1$

					if (value instanceof String) {
						packageableElement.setVisibility(VisibilityKind
							.get((String) value));
					}
				}

				return super.casePackageableElement(packageableElement);
			}

			@Override
			public Object caseParameterableElement(
					ParameterableElement parameterableElement) {
				getEObject(getExtension(resource, parameterableElement),
					resource, "templateParameter", true); //$NON-NLS-1$

				return super.caseParameterableElement(parameterableElement);
			}

			@Override
			public Object caseProfileApplication(
					ProfileApplication profileApplication) {
				caseElement(profileApplication);

				AnyType extension = removeExtension(resource,
					profileApplication);

				if (extension != null) {
					EObject eObject = getEObject(extension, resource,
						"importedPackage", true); //$NON-NLS-1$

					if (eObject instanceof Profile) {
						removeExtension(resource, eObject);
					}
				}

				String profileName = null;
				InternalEObject internalEObject = (InternalEObject) profileApplication
					.eGet(
						UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE,
						false);

				if (internalEObject != null && internalEObject.eIsProxy()) {
					URI eProxyURI = internalEObject.eProxyURI();

					if (eProxyURI.toString().startsWith(
						UML22UMLResource.PROFILES_PATHMAP)) {

						String segment0 = eProxyURI.segment(0);
						profileName = segment0.substring(0, segment0
							.indexOf('.'));
					}
				}

				defaultCase(profileApplication);

				EAnnotation attributesAnnotation = profileApplication
					.getEAnnotation("attributes"); //$NON-NLS-1$

				if (attributesAnnotation != null) {
					attributesAnnotation.setSource(UML2_UML_PACKAGE_2_0_NS_URI);

					EMap<String, String> details = attributesAnnotation
						.getDetails();
					String version = details.get("version"); //$NON-NLS-1$

					if (!UML2Util.isEmpty(version)) {
						Profile appliedProfile = profileApplication
							.getAppliedProfile();

						if (appliedProfile != null) {

							if (profileName == null) {
								profileName = appliedProfile.getName();
							}

							EAnnotation eAnnotation = appliedProfile
								.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);

							if (eAnnotation != null) {
								EList<EObject> contents = eAnnotation
									.getContents();

								for (int i = contents.size(); i > 0;) {
									EPackage ePackage = (EPackage) contents
										.get(--i);

									if (ePackage
										.getNsPrefix()
										.endsWith(
											UML2Util
												.getValidJavaIdentifier(profileName)
												+ '_' + version)) {

										attributesAnnotation.getReferences()
											.add(0, ePackage);
										break;
									}
								}
							}

							org.eclipse.uml2.uml.Package applyingPackage = profileApplication
								.getApplyingPackage();

							if (applyingPackage != null
								&& !appliedProfile.getOwnedExtensions(true)
									.isEmpty()) {

								packagesRequiringStereotypes
									.add(applyingPackage);
							}
						}
					}

					details.clear();
				}

				return profileApplication;
			}

			@Override
			public Object caseProfile(Profile profile) {
				caseNamespace(profile);
				casePackageableElement(profile);
				caseParameterableElement(profile);
				caseElement(profile);

				defaultCase(profile);

				EAnnotation attributesAnnotation = profile
					.getEAnnotation("attributes"); //$NON-NLS-1$

				if (attributesAnnotation != null) {
					annotationsToRemove.add(attributesAnnotation);
				}

				EAnnotation ePackagesAnnotation = profile
					.getEAnnotation("ePackages"); //$NON-NLS-1$

				if (ePackagesAnnotation != null) {
					ePackagesAnnotation.setSource(UML2_UML_PACKAGE_2_0_NS_URI);

					new EcoreSwitch<Object>() {

						@Override
						public Object caseEClass(EClass eClass) {
							EAnnotation stereotypeAnnotation = eClass
								.getEAnnotation("stereotype"); //$NON-NLS-1$

							if (stereotypeAnnotation != null) {
								stereotypeAnnotation
									.setSource(UML2_UML_PACKAGE_2_0_NS_URI);

								EList<EObject> references = stereotypeAnnotation
									.getReferences();

								if (!references.isEmpty()) {
									Object reference = references.get(0);

									if (reference instanceof Stereotype) {
										Stereotype stereotype = (Stereotype) reference;

										ownedAttributesLoop : for (Property ownedAttribute : stereotype
											.getOwnedAttributes()) {

											String name = ownedAttribute
												.getName();

											if (!UML2Util.isEmpty(name)
												&& name
													.startsWith(Extension.METACLASS_ROLE_PREFIX)) {

												Type type = ownedAttribute
													.getType();

												if (type instanceof org.eclipse.uml2.uml.Class) {
													org.eclipse.uml2.uml.Class class_ = (org.eclipse.uml2.uml.Class) type;

													if (class_.isMetaclass()) {

														for (Classifier parent : stereotype
															.parents()) {

															if (parent instanceof Stereotype
																&& ((Stereotype) parent)
																	.getAllExtendedMetaclasses()
																	.contains(
																		class_)) {

																continue ownedAttributesLoop;
															}
														}

														EReference eReference = EcoreFactory.eINSTANCE
															.createEReference();
														eReference
															.setName(UML2Util
																.getValidJavaIdentifier(name));
														eReference
															.setEType(UMLPackage.eINSTANCE
																.getEClassifier(class_
																	.getName()));

														eClass
															.getEStructuralFeatures()
															.add(0, eReference);
													}
												}
											}
										}
									}
								}
							}

							return super.caseEClass(eClass);
						}

						@Override
						public Object caseEEnum(EEnum eEnum) {

							for (EEnumLiteral eLiteral : eEnum.getELiterals()) {
								EAnnotation enumerationLiteralAnnotation = eLiteral
									.getEAnnotation("enumerationLiteral"); //$NON-NLS-1$

								if (enumerationLiteralAnnotation != null) {
									annotationsToRemove
										.add(enumerationLiteralAnnotation);

									EList<EObject> eEnumReferences = UML2Util
										.getEAnnotation(eEnum,
											UML2_UML_PACKAGE_2_0_NS_URI, true)
										.getReferences();

									if (eEnumReferences.isEmpty()) {
										EList<EObject> eEnumLiteralReferences = enumerationLiteralAnnotation
											.getReferences();

										if (!eEnumLiteralReferences.isEmpty()) {
											Object reference = eEnumLiteralReferences
												.get(0);

											if (reference instanceof EnumerationLiteral) {
												eEnumReferences
													.add(((EnumerationLiteral) reference)
														.getEnumeration());
											}
										}
									}
								}
							}

							return super.caseEEnum(eEnum);
						}

						@Override
						public Object defaultCase(EObject eObject) {

							for (EObject eContent : eObject.eContents()) {
								doSwitch(eContent);
							}

							return eObject;
						}
					}.doSwitch(ePackagesAnnotation);
				}

				return profile;
			}

			@Override
			public Object caseProperty(Property property) {

				if (property.eGet(UMLPackage.Literals.PROPERTY__ASSOCIATION,
					false) instanceof Extension) {

					String name = property.getName();

					if (!UML2Util.isEmpty(name) && name.startsWith("base$")) { //$NON-NLS-1$
						property.setName(Extension.METACLASS_ROLE_PREFIX
							+ name.substring(5));
					}
				}
				
				AnyType extension = getExtension(resource, property);
				if (extension != null) {

					EObject ownedTemplateSignature = getEObject(extension,
						resource, "ownedTemplateSignature", true); //$NON-NLS-1$

					UMLUtil.setTaggedValue(property, getUML2Stereotype(
						property, STEREOTYPE__TEMPLATEABLE_ELEMENT),
						TAG_DEFINITION__OWNED_TEMPLATE_SIGNATURE,
						ownedTemplateSignature);

					Collection<EObject> templateBindings = getEObjects(
						extension, resource, "templateBinding", true); //$NON-NLS-1$

					if (!templateBindings.isEmpty()) {
						UMLUtil.setTaggedValue(property, getUML2Stereotype(
							property, STEREOTYPE__TEMPLATEABLE_ELEMENT),
							TAG_DEFINITION__TEMPLATE_BINDING, templateBindings);
					}
				}
				
				return super.caseProperty(property);
			}
					

			@Override
			public Object caseRealization(Realization realization) {
				getEObject(getExtension(resource, realization), resource,
					"realizingClassifier", true); //$NON-NLS-1$

				return super.caseRealization(realization);
			}

			@Override
			public Object caseState(State state) {
				AnyType extension = getExtension(resource, state);

				if (extension != null) {
					EList<Trigger> deferrableTriggers = state
						.getDeferrableTriggers();

					for (EObject eObject : getEObjects(extension, resource,
						"deferrableTrigger", true)) { //$NON-NLS-1$

						if (eObject instanceof Trigger) {
							doSwitch(eObject);

							deferrableTriggers.add((Trigger) EcoreUtil
								.copy(eObject));
						}
					}
				}

				return super.caseState(state);
			}

			@Override
			public Object caseTemplateParameter(
					TemplateParameter templateParameter) {
				AnyType extension = getExtension(resource, templateParameter);

				if (extension != null) {
					EObject eObject = getEObject(extension, resource,
						"ownedParameteredElement", true); //$NON-NLS-1$

					if (eObject instanceof ParameterableElement) {
						ParameterableElement parameterableElement = (ParameterableElement) eObject;

						doSwitch(parameterableElement);

						if (parameterableElement instanceof Classifier) {
							templateParameter = (TemplateParameter) reincarnate(
								templateParameter,
								UMLPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
								resource);
						} else if (parameterableElement instanceof ConnectableElement) {
							templateParameter = (TemplateParameter) reincarnate(
								templateParameter,
								UMLPackage.Literals.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER,
								resource);
						} else if (parameterableElement instanceof Operation) {
							templateParameter = (TemplateParameter) reincarnate(
								templateParameter,
								UMLPackage.Literals.OPERATION_TEMPLATE_PARAMETER,
								resource);
						}

						templateParameter
							.setOwnedParameteredElement(parameterableElement);
					}

					eObject = getEObject(extension, resource,
						"parameteredElement", true); //$NON-NLS-1$

					if (eObject instanceof ParameterableElement) {
						ParameterableElement parameterableElement = (ParameterableElement) eObject;

						doSwitch(parameterableElement);

						if (parameterableElement instanceof Classifier) {
							templateParameter = (TemplateParameter) reincarnate(
								templateParameter,
								UMLPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
								resource);
						} else if (parameterableElement instanceof ConnectableElement) {
							templateParameter = (TemplateParameter) reincarnate(
								templateParameter,
								UMLPackage.Literals.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER,
								resource);
						} else if (parameterableElement instanceof Operation) {
							templateParameter = (TemplateParameter) reincarnate(
								templateParameter,
								UMLPackage.Literals.OPERATION_TEMPLATE_PARAMETER,
								resource);
						}

						templateParameter
							.setParameteredElement(parameterableElement);
					}
				}

				return super.caseTemplateParameter(templateParameter);
			}

			@Override
			public Object caseTemplateSignature(
					TemplateSignature templateSignature) {
				AnyType extension = getExtension(resource, templateSignature);

				if (extension != null) {
					Stereotype stereotype = getUML2Stereotype(
						templateSignature, STEREOTYPE__TEMPLATE_SIGNATURE);

					Collection<EObject> eObjects = getEObjects(extension,
						resource, "nestedSignature", true); //$NON-NLS-1$

					if (!eObjects.isEmpty()) {

						if (UMLUtil.safeApplyStereotype(templateSignature,
							stereotype) != null) {

							@SuppressWarnings("unchecked")
							EList<TemplateSignature> nestedSignatures = (EList<TemplateSignature>) templateSignature
								.getValue(stereotype,
									TAG_DEFINITION__NESTED_SIGNATURE);

							for (EObject eObject : eObjects) {

								if (eObject instanceof TemplateSignature) {
									nestedSignatures
										.add((TemplateSignature) eObject);
								}
							}
						}
					}

					EObject eObject = getEObject(extension, resource,
						"nestingSignature", true); //$NON-NLS-1$

					if (eObject instanceof TemplateSignature) {
						UMLUtil.setTaggedValue(templateSignature, stereotype,
							TAG_DEFINITION__NESTING_SIGNATURE, eObject);
					}
				}

				return super.caseTemplateSignature(templateSignature);
			}

			@Override
			public Object caseTimeExpression(TimeExpression timeExpression) {
				AnyType extension = getExtension(resource, timeExpression);

				if (extension != null) {
					boolean firstEvent = !"false".equals(getValue(extension //$NON-NLS-1$
						.getAnyAttribute(), "isFirstTime", true)); //$NON-NLS-1$

					EObject eObject = getEObject(extension, resource,
						"event", true); //$NON-NLS-1$

					if (eObject instanceof NamedElement) {
						TimeObservation timeObservation = (TimeObservation) timeExpression
							.getNearestPackage().createPackagedElement(
								timeExpression.getName(),
								UMLPackage.Literals.TIME_OBSERVATION);

						timeObservation.setEvent((NamedElement) eObject);
						timeObservation.setFirstEvent(firstEvent);
					}
				}

				return super.caseTimeExpression(timeExpression);
			}

			@Override
			public Object caseTransition(Transition transition) {
				Constraint guard = transition.getGuard();

				if (guard != null) {
					EList<Constraint> ownedRules = transition.getOwnedRules();

					if (!ownedRules.contains(guard)) {
						ownedRules.add(guard);
					}
				}

				AnyType extension = getExtension(resource, transition);

				if (extension != null) {
					EList<Trigger> triggers = transition.getTriggers();

					for (EObject eObject : getEObjects(extension, resource,
						"trigger", true)) { //$NON-NLS-1$

						if (eObject instanceof Trigger) {
							doSwitch(eObject);

							triggers.add((Trigger) EcoreUtil.copy(eObject));
						}
					}
				}

				return super.caseTransition(transition);
			}

			@Override
			public Object caseTrigger(Trigger trigger) {
				Event event = trigger.getEvent();
				AnyType extension = getExtension(resource, trigger);

				if (extension != null) {
					EObject eObject = getEObject(extension, resource,
						"changeExpression", true); //$NON-NLS-1$

					if (eObject instanceof ValueSpecification) {
						event = (Event) trigger.getNearestPackage()
							.createPackagedElement(trigger.getName(),
								UMLPackage.Literals.CHANGE_EVENT);
						((ChangeEvent) event)
							.setChangeExpression((ValueSpecification) eObject);
					} else {
						eObject = getEObject(extension, resource,
							"operation", true); //$NON-NLS-1$

						if (eObject instanceof Operation) {
							event = (CallEvent) trigger.getNearestPackage()
								.createPackagedElement(trigger.getName(),
									UMLPackage.Literals.CALL_EVENT);
							((CallEvent) event)
								.setOperation((Operation) eObject);
						} else {
							eObject = getEObject(extension, resource,
								"signal", true); //$NON-NLS-1$

							if (eObject instanceof Signal) {
								event = (SignalEvent) trigger
									.getNearestPackage().createPackagedElement(
										trigger.getName(),
										UMLPackage.Literals.SIGNAL_EVENT);
								((SignalEvent) event)
									.setSignal((Signal) eObject);
							} else {
								eObject = getEObject(extension, resource,
									"when", true); //$NON-NLS-1$

								if (eObject instanceof ValueSpecification) {
									
									event = (TimeEvent) trigger
										.getNearestPackage()
										.createPackagedElement(
											trigger.getName(),
											UMLPackage.Literals.TIME_EVENT);
																		
									Object value = getValue(extension
										.getAnyAttribute(), "isRelative", true); //$NON-NLS-1$

									if (value instanceof String) {
										((TimeEvent) event)
											.setIsRelative(Boolean.valueOf(
												(String) value).booleanValue());
									}
									
									if (eObject instanceof TimeExpression) {
										((TimeEvent) event)
											.setWhen((TimeExpression) eObject);
										
									} else {
										UMLUtil.setTaggedValue(event,
											getUML2Stereotype(event,
												STEREOTYPE__TIME_EVENT),
											TAG_DEFINITION__WHEN,
											(TimeExpression) eObject);
									}
								}
							}
						}
					}
				}

				if (event == null) {
					event = (Event) trigger.getNearestPackage()
						.createPackagedElement(trigger.getName(),
							UMLPackage.Literals.ANY_RECEIVE_EVENT);
				}

				trigger.setEvent(event);

				return super.caseTrigger(trigger);
			}
			
			@Override
			public Object caseClassifierTemplateParameter(
					ClassifierTemplateParameter classifierTemplateParameter) {

				AnyType extension = getExtension(resource,
					classifierTemplateParameter);

				if (extension != null) {
					EObject value = getEObject(extension, resource,
						"defaultClassifier", true); //$NON-NLS-1$

					if (classifierTemplateParameter.getDefault() == null) {

						classifierTemplateParameter
							.setDefault((ParameterableElement) value);

					} else {
						UMLUtil.setTaggedValue(classifierTemplateParameter,
							getUML2Stereotype(classifierTemplateParameter,
								STEREOTYPE__CLASSIFIER_TEMPLATE_PARAMETER),
							TAG_DEFINITION__DEFAULT_CLASSIFER, value);
					}
				}
				return super
					.caseClassifierTemplateParameter(classifierTemplateParameter);
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

		for (EAnnotation eAnnotation : annotationsToRemove) {
			eAnnotation.setEModelElement(null);
		}

		for (org.eclipse.uml2.uml.Package package_ : packagesRequiringStereotypes) {
			ElementOperations.applyAllRequiredStereotypes(package_);
		}
	}

}
