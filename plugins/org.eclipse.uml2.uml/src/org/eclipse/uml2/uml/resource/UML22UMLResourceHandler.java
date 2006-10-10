/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 * 
 * $Id: UML22UMLResourceHandler.java,v 1.27 2006/10/10 20:41:29 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Classifier;
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
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UML22UMLResourceHandler
		extends BasicResourceHandler {

	protected static final boolean DEBUG = false;

	protected static final String STEREOTYPE__ACTION = "Action"; //$NON-NLS-1$

	protected static final String STEREOTYPE__ACTIVITY = "Activity"; //$NON-NLS-1$

	protected static final String STEREOTYPE__COMMENT = "Comment"; //$NON-NLS-1$

	protected static final String STEREOTYPE__EXPRESSION = "Expression"; //$NON-NLS-1$

	protected static final String STEREOTYPE__MESSAGE = "Message"; //$NON-NLS-1$

	protected static final String STEREOTYPE__OPAQUE_EXPRESSION = "OpaqueExpression"; //$NON-NLS-1$

	protected static final String STEREOTYPE__TEMPLATE_SIGNATURE = "TemplateSignature"; //$NON-NLS-1$

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
		return getValue(featureMap, name, false);
	}

	protected Object getValue(FeatureMap featureMap, String name, boolean remove) {

		for (Iterator entries = featureMap.iterator(); entries.hasNext();) {
			FeatureMap.Entry entry = (FeatureMap.Entry) entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {

				if (remove) {
					entries.remove();
				}

				return entry.getValue();
			}
		}

		return null;
	}

	protected Collection getValues(FeatureMap featureMap, String name) {
		return getValues(featureMap, name, false);
	}

	protected Collection getValues(FeatureMap featureMap, String name,
			boolean remove) {
		Collection values = new UniqueEList.FastCompare();

		for (Iterator entries = featureMap.iterator(); entries.hasNext();) {
			FeatureMap.Entry entry = (FeatureMap.Entry) entries.next();

			if (name.equals(entry.getEStructuralFeature().getName())) {

				if (remove) {
					entries.remove();
				}

				values.add(entry.getValue());
			}
		}

		return values;
	}

	protected InternalEObject handleProxy(InternalEObject internalEObject) {

		if (internalEObject != null && internalEObject.eIsProxy()) {
			URI eProxyURI = internalEObject.eProxyURI();
			URI uri = (URI) UML22UMLExtendedMetaData.getURIMap().get(
				eProxyURI.trimFragment());

			if (uri != null) {
				String fragment = (String) UML22UMLExtendedMetaData
					.getFragmentMap().get(eProxyURI.fragment());

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

			for (Iterator eAllStructuralFeatures = eObject.eClass()
				.getEAllStructuralFeatures().iterator(); eAllStructuralFeatures
				.hasNext();) {

				EStructuralFeature.Internal eStructuralFeature = (EStructuralFeature.Internal) eAllStructuralFeatures
					.next();

				if (eStructuralFeature.isChangeable()
					&& eStructuralFeature.getEOpposite() == null
					&& eObject.eIsSet(eStructuralFeature)) {

					try {
						newEObject.eSet(
							eClass.getEStructuralFeature(eStructuralFeature
								.getName()), eStructuralFeature.isMany()
								? ((InternalEList) eObject
									.eGet(eStructuralFeature)).basicList()
								: eObject.eGet(eStructuralFeature));
					} catch (Exception e) {
						UMLPlugin.INSTANCE.log(e);
					}
				}
			}

			for (Iterator inverseReferences = UML2Util.getInverseReferences(
				eObject).iterator(); inverseReferences.hasNext();) {

				EStructuralFeature.Setting setting = (EStructuralFeature.Setting) inverseReferences
					.next();
				EStructuralFeature eStructuralFeature = setting
					.getEStructuralFeature();

				if (eStructuralFeature.isChangeable()) {

					try {

						if (eStructuralFeature.isMany()) {
							List values = (List) setting.get(false);
							values.set(values.indexOf(eObject), newEObject);
						} else {
							setting.set(newEObject);
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
				return (Profile) UML2Util.load(resourceSet, URI
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

	public void postLoad(final XMLResource resource, InputStream inputStream,
			Map options) {
		final EList resourceContents = resource.getContents();

		final List annotationsToRemove = new ArrayList();

		final Map destructionEvents = new HashMap();
		final Map executionEvents = new HashMap();
		final Map sendEvents = new HashMap();
		final Map receiveEvents = new HashMap();

		UMLSwitch umlSwitch = new UMLSwitch() {

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

			public Object caseActivity(Activity activity) {
				AnyType extension = getExtension(resource, activity);

				if (extension != null) {
					getValues(extension.getAnyAttribute(), "action", true); //$NON-NLS-1$

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

			public Object caseBehavioralFeature(
					BehavioralFeature behavioralFeature) {
				AnyType extension = getExtension(resource, behavioralFeature);

				if (extension != null) {
					EList ownedParameters = behavioralFeature
						.getOwnedParameters();

					List returnResult = Arrays.asList(getValues(
						extension.getMixed(), "returnResult", true).toArray()); //$NON-NLS-1$

					for (ListIterator values = returnResult
						.listIterator(returnResult.size()); values
						.hasPrevious();) {

						Object value = values.previous();

						if (value instanceof Parameter) {
							ownedParameters.add(0, value);
						}
					}

					for (Iterator values = getValues(extension.getMixed(),
						"formalParameter", true) //$NON-NLS-1$
						.iterator(); values.hasNext();) {

						Object value = values.next();

						if (value instanceof Parameter) {
							ownedParameters.add(value);
						}
					}
				}

				return super.caseBehavioralFeature(behavioralFeature);
			}

			public Object caseBehavioredClassifier(
					BehavioredClassifier behavioredClassifier) {
				AnyType extension = getExtension(resource, behavioredClassifier);

				if (extension != null) {
					EList ownedBehaviors = behavioredClassifier
						.getOwnedBehaviors();

					for (Iterator values = getValues(extension.getMixed(),
						"ownedStateMachine", true) //$NON-NLS-1$
						.iterator(); values.hasNext();) {

						Object value = values.next();

						if (value instanceof StateMachine) {
							ownedBehaviors.add(value);
						}
					}
				}

				return super.caseBehavioredClassifier(behavioredClassifier);
			}

			public Object caseCallBehaviorAction(
					CallBehaviorAction callBehaviorAction) {
				AnyType extension = getExtension(resource, callBehaviorAction);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"function", true); //$NON-NLS-1$

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject instanceof FunctionBehavior) {
							callBehaviorAction
								.setBehavior((FunctionBehavior) eObject);
						}
					}
				}

				return super.caseCallBehaviorAction(callBehaviorAction);
			}

			public Object caseComment(Comment comment) {
				AnyType extension = getExtension(resource, comment);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"body", true); //$NON-NLS-1$

					if (value instanceof String) {
						comment.setBody((String) value);
					}

					value = getValue(extension.getMixed(),
						"bodyExpression", true); //$NON-NLS-1$

					if (value instanceof StringExpression) {
						UMLUtil.setTaggedValue(comment, getUML2Stereotype(
							comment, STEREOTYPE__COMMENT),
							TAG_DEFINITION__BODY_EXPRESSION, value);
					}
				}

				return super.caseComment(comment);
			}

			public Object caseDuration(Duration duration) {
				AnyType extension = getExtension(resource, duration);

				if (extension != null) {
					Boolean isFirstEvent = Boolean.valueOf(!"false" //$NON-NLS-1$
						.equals(getValue(extension.getAnyAttribute(),
							"isFirstTime"))); //$NON-NLS-1$

					Collection values = getValues(extension.getAnyAttribute(),
						"event", true); //$NON-NLS-1$

					if (!values.isEmpty()) {
						DurationObservation durationObservation = (DurationObservation) duration
							.getNearestPackage().createPackagedElement(
								duration.getName(),
								UMLPackage.Literals.DURATION_OBSERVATION);

						EList events = durationObservation.getEvents();
						EList firstEvents = durationObservation
							.getFirstEvents();

						for (Iterator v = values.iterator(); v.hasNext();) {
							Object value = v.next();

							if (value instanceof String) {
								EObject eObject = resource
									.getEObject((String) value);

								if (eObject instanceof NamedElement) {
									events.add(eObject);
									firstEvents.add(isFirstEvent);
								}
							}
						}

						duration.getObservations().add(durationObservation);
					}
				}

				return super.caseDuration(duration);
			}

			public Object caseElement(Element element) {
				EAnnotation keywordsAnnotation = element
					.getEAnnotation("keywords"); //$NON-NLS-1$

				if (keywordsAnnotation != null) {
					keywordsAnnotation.setSource(UMLPackage.eNS_URI);
				}

				EAnnotation appliedStereotypesAnnotation = element
					.getEAnnotation("appliedStereotypes"); //$NON-NLS-1$

				if (appliedStereotypesAnnotation != null) {
					annotationsToRemove.add(appliedStereotypesAnnotation);

					EList contents = appliedStereotypesAnnotation.getContents();

					for (int i = contents.size(); i > 0;) {
						InternalEObject stereotypeApplication = (InternalEObject) contents
							.get(--i);

						UMLUtil.setBaseElement(stereotypeApplication, element);

						resourceContents.add(stereotypeApplication);
					}
				}

				return super.caseElement(element);
			}

			public Object caseExecutionOccurrenceSpecification(
					ExecutionOccurrenceSpecification executionOccurrenceSpecification) {
				org.eclipse.uml2.uml.Package nearestPackage = executionOccurrenceSpecification
					.getNearestPackage();

				if (nearestPackage != null) {
					ExecutionEvent executionEvent = (ExecutionEvent) executionEvents
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

			public Object caseExpression(Expression expression) {
				AnyType extension = getExtension(resource, expression);

				if (extension != null) {
					Stereotype stereotype = getUML2Stereotype(expression,
						STEREOTYPE__OPAQUE_EXPRESSION);

					Object value = getValue(extension.getAnyAttribute(),
						"behavior", true); //$NON-NLS-1$

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject instanceof Behavior) {
							UMLUtil.setTaggedValue(expression, stereotype,
								TAG_DEFINITION__BEHAVIOR, eObject);
						}
					}

					value = getValue(extension.getAnyAttribute(), "body", true); //$NON-NLS-1$

					if (value instanceof String) {
						UMLUtil.setTaggedValue(expression, stereotype,
							TAG_DEFINITION__BODY, value);
					}

					value = getValue(extension.getMixed(), "body", true); //$NON-NLS-1$

					if (value instanceof AnyType) {
						value = getValue(((AnyType) value).getMixed(), "text"); //$NON-NLS-1$

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

			public Object caseExtensionEnd(ExtensionEnd extensionEnd) {
				String name = extensionEnd.getName();

				if (!UML2Util.isEmpty(name) && name.startsWith("extension$")) { //$NON-NLS-1$
					extensionEnd.setName(Extension.STEREOTYPE_ROLE_PREFIX
						+ name.substring(10));
				}

				if (extensionEnd.getLowerValue() == null) {
					AnyType extension = getExtension(resource, extensionEnd);

					if (extension == null
						|| getValue(extension.getMixed(), "lowerValue") == null) { //$NON-NLS-1$

						extensionEnd.setLower(1);
					}
				}

				return super.caseExtensionEnd(extensionEnd);
			}

			public Object caseInteractionUse(InteractionUse interactionUse) {
				AnyType extension = getExtension(resource, interactionUse);

				if (extension != null) {
					Object value = getValue(extension.getMixed(),
						"argument", true); //$NON-NLS-1$

					if (value instanceof InputPin) {
						((OpaqueAction) interactionUse.createArgument(
							((InputPin) value).getName(),
							UMLPackage.Literals.OPAQUE_ACTION))
							.getInputValues().add(value);
					}
				}

				return super.caseInteractionUse(interactionUse);
			}

			public Object caseMultiplicityElement(
					MultiplicityElement multiplicityElement) {
				AnyType extension = getExtension(resource, multiplicityElement);

				if (extension != null) {
					Object value = getValue(extension.getMixed(),
						"lowerValue", true); //$NON-NLS-1$

					if (value instanceof ValueSpecification) {
						multiplicityElement
							.setLowerValue((ValueSpecification) value);
					}
				}

				return super.caseMultiplicityElement(multiplicityElement);
			}

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

					value = getValue(extension.getAnyAttribute(),
						"signature", true); //$NON-NLS-1$

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject instanceof NamedElement) {
							UMLUtil.setTaggedValue(message, getUML2Stereotype(
								message, STEREOTYPE__MESSAGE),
								TAG_DEFINITION__SIGNATURE, eObject);
						}
					}
				}

				return super.caseMessage(message);
			}

			public Object caseMessageEnd(MessageEnd messageEnd) {
				AnyType extension = getExtension(resource, messageEnd);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"receiveMessage", true); //$NON-NLS-1$

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject instanceof Message) {
							messageEnd.setMessage((Message) eObject);
						}
					}

					value = getValue(extension.getAnyAttribute(),
						"sendMessage", true); //$NON-NLS-1$

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject instanceof Message) {
							messageEnd.setMessage((Message) eObject);
						}
					}
				}

				return super.caseMessageEnd(messageEnd);
			}

			public Object caseMessageOccurrenceSpecification(
					MessageOccurrenceSpecification messageOccurrenceSpecification) {
				caseMessageEnd(messageOccurrenceSpecification);
				caseNamedElement(messageOccurrenceSpecification);
				caseElement(messageOccurrenceSpecification);

				AnyType extension = getExtension(resource,
					messageOccurrenceSpecification);

				Message message = messageOccurrenceSpecification.getMessage();

				if (message == null) {

					if (extension != null) {
						Collection values = getValues(extension
							.getAnyAttribute(), "startExec", true); //$NON-NLS-1$

						if (values.isEmpty()) {
							values = getValues(extension.getAnyAttribute(),
								"finishExec", true); //$NON-NLS-1$
						}

						if (values.isEmpty()) {
							return caseOccurrenceSpecification((OccurrenceSpecification) reincarnate(
								messageOccurrenceSpecification,
								UMLPackage.Literals.OCCURRENCE_SPECIFICATION,
								resource));
						}

						for (Iterator v = values.iterator(); v.hasNext();) {
							Object value = v.next();

							if (value instanceof String) {
								EObject eObject = resource
									.getEObject((String) value);

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
							Map nearestSendEvents = (Map) sendEvents
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
														nearestSendEvents = new HashMap());
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
														nearestSendEvents = new HashMap());
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
							Map nearestReceiveEvents = (Map) receiveEvents
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
														nearestReceiveEvents = new HashMap());
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
														nearestReceiveEvents = new HashMap());
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
						Collection values = getValues(extension
							.getAnyAttribute(), "startExec", true); //$NON-NLS-1$

						if (values.isEmpty()) {
							values = getValues(extension.getAnyAttribute(),
								"finishExec", true); //$NON-NLS-1$
						}

						for (Iterator v = values.iterator(); v.hasNext();) {
							Object value = v.next();

							if (value instanceof String) {
								EObject eObject = resource
									.getEObject((String) value);

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

												if (startMessage
													.getMessageSort() == MessageSort.SYNCH_CALL_LITERAL) {

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
				}

				defaultCase(messageOccurrenceSpecification);

				return messageOccurrenceSpecification;
			}

			public Object caseNamespace(Namespace namespace) {
				AnyType extension = getExtension(resource, namespace);

				if (extension != null) {
					EList packageImports = namespace.getPackageImports();

					for (Iterator values = getValues(extension.getMixed(),
						"packageImport", true).iterator(); values.hasNext();) { //$NON-NLS-1$

						Object value = values.next();

						if (value instanceof PackageImport) {
							packageImports.add(value);
						}
					}
				}

				return super.caseNamespace(namespace);
			}

			public Object caseOccurrenceSpecification(
					OccurrenceSpecification occurrenceSpecification) {

				if (occurrenceSpecification.getEvent() == null) {
					org.eclipse.uml2.uml.Package nearestPackage = occurrenceSpecification
						.getNearestPackage();

					if (nearestPackage != null) {
						DestructionEvent destructionEvent = (DestructionEvent) destructionEvents
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

			public Object caseOpaqueAction(OpaqueAction opaqueAction) {
				AnyType extension = getExtension(resource, opaqueAction);

				if (extension != null) {
					Object value = getValue(extension.getMixed(),
						"duration", true); //$NON-NLS-1$

					if (value instanceof Duration) {
						Duration duration = (Duration) value;

						ValuePin inputValue = (ValuePin) opaqueAction
							.createInputValue(duration.getName(), duration
								.getType(), UMLPackage.Literals.VALUE_PIN);

						inputValue.setValue(duration);
					}

					value = getValue(extension.getMixed(), "now", true); //$NON-NLS-1$

					if (value instanceof TimeExpression) {
						TimeExpression timeExpression = (TimeExpression) value;

						ValuePin inputValue = (ValuePin) opaqueAction
							.createInputValue(timeExpression.getName(),
								timeExpression.getType(),
								UMLPackage.Literals.VALUE_PIN);

						inputValue.setValue(timeExpression);
					}
				}

				return super.caseOpaqueAction(opaqueAction);
			}

			public Object caseOpaqueExpression(OpaqueExpression opaqueExpression) {
				AnyType extension = getExtension(resource, opaqueExpression);

				if (extension != null) {
					Object value = getValue(extension.getAnyAttribute(),
						"body", true); //$NON-NLS-1$

					if (value instanceof String) {
						opaqueExpression.getBodies().add(value);
					}

					Stereotype stereotype = getUML2Stereotype(opaqueExpression,
						STEREOTYPE__EXPRESSION);

					Collection values = getValues(extension.getMixed(),
						"operand", true); //$NON-NLS-1$

					if (!values.isEmpty()) {

						if (UMLUtil.safeApplyStereotype(opaqueExpression,
							stereotype) != null) {

							EList operands = (EList) opaqueExpression.getValue(
								stereotype, TAG_DEFINITION__OPERAND);

							for (Iterator v = values.iterator(); v.hasNext();) {
								value = v.next();

								if (value instanceof ValueSpecification) {
									operands.add(value);
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

			public Object caseOperation(Operation operation) {
				Parameter returnResult = operation.getReturnResult();

				if (returnResult != null) {
					returnResult.destroy();
				}

				return super.caseOperation(operation);
			}

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

			public Object caseProfileApplication(
					ProfileApplication profileApplication) {
				caseElement(profileApplication);

				AnyType extension = removeExtension(resource,
					profileApplication);

				if (extension != null) {
					Object value = getValue(extension.getMixed(),
						"importedPackage", true); //$NON-NLS-1$

					if (value instanceof Profile) {
						removeExtension(resource, (Profile) value);
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
					attributesAnnotation.setSource(UMLPackage.eNS_URI);

					EMap details = attributesAnnotation.getDetails();
					String version = (String) details.get("version"); //$NON-NLS-1$

					if (!UML2Util.isEmpty(version)) {
						Profile appliedProfile = profileApplication
							.getAppliedProfile();

						if (profileName == null) {
							profileName = appliedProfile.getName();
						}

						if (appliedProfile != null) {
							EAnnotation eAnnotation = appliedProfile
								.getEAnnotation(UMLPackage.eNS_URI);

							if (eAnnotation != null) {
								EList contents = eAnnotation.getContents();

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
						}
					}

					details.clear();
				}

				return profileApplication;
			}

			public Object caseProfile(Profile profile) {
				caseNamespace(profile);
				casePackageableElement(profile);
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
					ePackagesAnnotation.setSource(UMLPackage.eNS_URI);

					new EcoreSwitch() {

						public Object caseEClass(EClass eClass) {
							EAnnotation stereotypeAnnotation = eClass
								.getEAnnotation("stereotype"); //$NON-NLS-1$

							if (stereotypeAnnotation != null) {
								stereotypeAnnotation
									.setSource(UMLPackage.eNS_URI);

								EList references = stereotypeAnnotation
									.getReferences();

								if (!references.isEmpty()) {
									Object reference = references.get(0);

									if (reference instanceof Stereotype) {
										Stereotype stereotype = (Stereotype) reference;

										for (Iterator ownedAttributes = stereotype
											.getOwnedAttributes().iterator(); ownedAttributes
											.hasNext();) {

											Property ownedAttribute = (Property) ownedAttributes
												.next();
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

						public Object caseEEnum(EEnum eEnum) {

							for (Iterator eLiterals = eEnum.getELiterals()
								.iterator(); eLiterals.hasNext();) {

								EAnnotation enumerationLiteralAnnotation = ((EEnumLiteral) eLiterals
									.next())
									.getEAnnotation("enumerationLiteral"); //$NON-NLS-1$

								if (enumerationLiteralAnnotation != null) {
									annotationsToRemove
										.add(enumerationLiteralAnnotation);

									EList eEnumReferences = UML2Util
										.getEAnnotation(eEnum,
											UMLPackage.eNS_URI, true)
										.getReferences();

									if (eEnumReferences.isEmpty()) {
										EList eEnumLiteralReferences = enumerationLiteralAnnotation
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

						public Object defaultCase(EObject eObject) {

							for (Iterator eContents = eObject.eContents()
								.iterator(); eContents.hasNext();) {

								doSwitch((EObject) eContents.next());
							}

							return eObject;
						}
					}.doSwitch(ePackagesAnnotation);
				}

				return profile;
			}

			public Object caseProperty(Property property) {

				if (property.eGet(UMLPackage.Literals.PROPERTY__ASSOCIATION,
					false) instanceof Extension) {

					String name = property.getName();

					if (!UML2Util.isEmpty(name) && name.startsWith("base$")) { //$NON-NLS-1$
						property.setName(Extension.METACLASS_ROLE_PREFIX
							+ name.substring(5));
					}
				}

				return super.caseProperty(property);
			}

			public Object caseRealization(Realization realization) {
				AnyType extension = getExtension(resource, realization);

				if (extension != null) {
					getValue(extension.getAnyAttribute(),
						"realizingClassifier", true); //$NON-NLS-1$
				}

				return super.caseRealization(realization);
			}

			public Object caseTemplateParameter(
					TemplateParameter templateParameter) {
				AnyType extension = getExtension(resource, templateParameter);

				if (extension != null) {
					Object value = getValue(extension.getMixed(),
						"ownedParameteredElement", true); //$NON-NLS-1$

					if (value instanceof ParameterableElement) {
						ParameterableElement parameterableElement = (ParameterableElement) value;

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
						templateParameter
							.setParameteredElement(parameterableElement);
					} else {
						value = getValue(extension.getAnyAttribute(),
							"parameteredElement", true); //$NON-NLS-1$

						if (value instanceof String) {
							EObject eObject = resource
								.getEObject((String) value);

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
					}
				}

				return super.caseTemplateParameter(templateParameter);
			}

			public Object caseTemplateSignature(
					TemplateSignature templateSignature) {
				AnyType extension = getExtension(resource, templateSignature);

				if (extension != null) {
					Stereotype stereotype = getUML2Stereotype(
						templateSignature, STEREOTYPE__TEMPLATE_SIGNATURE);

					Collection values = getValues(extension.getAnyAttribute(),
						"nestedSignature", true); //$NON-NLS-1$

					if (!values.isEmpty()) {

						if (UMLUtil.safeApplyStereotype(templateSignature,
							stereotype) != null) {

							EList nestedSignatures = (EList) templateSignature
								.getValue(stereotype,
									TAG_DEFINITION__NESTED_SIGNATURE);

							for (Iterator v = values.iterator(); v.hasNext();) {
								Object value = v.next();

								if (value instanceof String) {
									EObject eObject = resource
										.getEObject((String) value);

									if (eObject instanceof TemplateSignature) {
										nestedSignatures.add(eObject);
									}
								}
							}
						}
					}

					Object value = getValue(extension.getAnyAttribute(),
						"nestingSignature", true); //$NON-NLS-1$

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject instanceof TemplateSignature) {
							UMLUtil.setTaggedValue(templateSignature,
								stereotype, TAG_DEFINITION__NESTING_SIGNATURE,
								eObject);
						}
					}
				}

				return super.caseTemplateSignature(templateSignature);
			}

			public Object caseTimeExpression(TimeExpression timeExpression) {
				AnyType extension = getExtension(resource, timeExpression);

				if (extension != null) {
					boolean firstEvent = !"false".equals(getValue(extension //$NON-NLS-1$
						.getAnyAttribute(), "isFirstTime")); //$NON-NLS-1$

					Object value = getValue(extension.getAnyAttribute(),
						"event", true); //$NON-NLS-1$

					if (value instanceof String) {
						EObject eObject = resource.getEObject((String) value);

						if (eObject instanceof NamedElement) {
							TimeObservation timeObservation = (TimeObservation) timeExpression
								.getNearestPackage().createPackagedElement(
									timeExpression.getName(),
									UMLPackage.Literals.TIME_OBSERVATION);

							timeObservation.setEvent((NamedElement) eObject);
							timeObservation.setFirstEvent(firstEvent);
						}
					}
				}

				return super.caseTimeExpression(timeExpression);
			}

			public Object caseTransition(Transition transition) {
				Constraint guard = transition.getGuard();

				if (guard != null) {
					EList ownedRules = transition.getOwnedRules();

					if (!ownedRules.contains(guard)) {
						ownedRules.add(guard);
					}
				}

				return super.caseTransition(transition);
			}

			public Object caseTrigger(Trigger trigger) {
				Event event = null;
				AnyType extension = getExtension(resource, trigger);

				if (extension != null) {
					Object value = getValue(extension.getMixed(),
						"changeExpression"); //$NON-NLS-1$

					if (value instanceof ValueSpecification) {
						event = (Event) trigger.getNearestPackage()
							.createPackagedElement(trigger.getName(),
								UMLPackage.Literals.CHANGE_EVENT);
						((ChangeEvent) event)
							.setChangeExpression((ValueSpecification) value);
					} else {
						value = getValue(extension.getAnyAttribute(),
							"operation"); //$NON-NLS-1$

						if (value instanceof String) {
							EObject eObject = resource
								.getEObject((String) value);

							if (eObject instanceof Operation) {
								event = (CallEvent) trigger.getNearestPackage()
									.createPackagedElement(trigger.getName(),
										UMLPackage.Literals.CALL_EVENT);
								((CallEvent) event)
									.setOperation((Operation) eObject);
							}
						} else {
							value = getValue(extension.getAnyAttribute(),
								"signal"); //$NON-NLS-1$

							if (value instanceof String) {
								EObject eObject = resource
									.getEObject((String) value);

								if (eObject instanceof Signal) {
									event = (SignalEvent) trigger
										.getNearestPackage()
										.createPackagedElement(
											trigger.getName(),
											UMLPackage.Literals.SIGNAL_EVENT);
									((SignalEvent) event)
										.setSignal((Signal) eObject);
								}
							} else {
								value = getValue(extension.getMixed(), "when"); //$NON-NLS-1$

								if (value instanceof ValueSpecification) {
									event = (TimeEvent) trigger
										.getNearestPackage()
										.createPackagedElement(
											trigger.getName(),
											UMLPackage.Literals.TIME_EVENT);
									((TimeEvent) event)
										.setWhen((ValueSpecification) value);

									value = getValue(extension
										.getAnyAttribute(), "isRelative"); //$NON-NLS-1$

									if (value instanceof String) {
										((TimeEvent) event)
											.setIsRelative(Boolean.valueOf(
												(String) value).booleanValue());
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

				for (Iterator eAllReferences = eObject.eClass()
					.getEAllReferences().iterator(); eAllReferences.hasNext();) {

					EReference eReference = (EReference) eAllReferences.next();

					if (!eReference.isDerived() && !eReference.isContainer()
						&& !eReference.isContainment()
						&& eObject.eIsSet(eReference)) {

						if (eReference.isMany()) {

							for (Iterator values = ((InternalEList) eObject
								.eGet(eReference)).basicIterator(); values
								.hasNext();) {

								handleProxy((InternalEObject) values.next());
							}
						} else {
							handleProxy((InternalEObject) eObject.eGet(
								eReference, false));
						}
					}
				}

				for (Iterator eContents = eObject.eContents().iterator(); eContents
					.hasNext();) {

					doSwitch((EObject) eContents.next());
				}

				return eObject;
			}
		};

		for (int i = 0; i < resourceContents.size(); i++) {
			umlSwitch.doSwitch((EObject) resourceContents.get(i));
		}

		for (Iterator atr = annotationsToRemove.iterator(); atr.hasNext();) {
			((EAnnotation) atr.next()).setEModelElement(null);
		}
	}
}
