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
 * $Id: UML22UMLResourceHandler.java,v 1.8 2006/04/13 15:52:25 khussey Exp $
 */
package org.eclipse.uml2.uml.resource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

public class UML22UMLResourceHandler
		extends BasicResourceHandler {

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
			URI uri = (URI) UML22UMLExtendedMetadata.getURIMap().get(
				eProxyURI.trimFragment());

			if (uri != null) {
				String fragment = (String) UML22UMLExtendedMetadata
					.getFragmentMap().get(eProxyURI.fragment());

				if (fragment != null) {
					internalEObject.eSetProxyURI(uri.appendFragment(fragment));
				}
			}
		}

		return internalEObject;
	}

	public void postLoad(final XMLResource resource, InputStream inputStream,
			Map options) {
		final EList resourceContents = resource.getContents();
		final List annotationsToRemove = new ArrayList();

		UMLSwitch umlSwitch = new UMLSwitch() {

			public Object caseBehavioralFeature(
					BehavioralFeature behavioralFeature) {
				AnyType extension = getExtension(resource, behavioralFeature);

				if (extension != null) {
					EList ownedParameters = behavioralFeature
						.getOwnedParameters();

					for (Iterator returnResults = getValues(
						extension.getMixed(), "returnResult", true).iterator(); returnResults //$NON-NLS-1$
						.hasNext();) {

						Parameter returnResult = (Parameter) returnResults
							.next();

						doSwitch(returnResult);
						ownedParameters.add(0, returnResult);
					}

					for (Iterator formalParameters = getValues(
						extension.getMixed(), "formalParameter", true) //$NON-NLS-1$
						.iterator(); formalParameters.hasNext();) {

						Parameter formalParameter = (Parameter) formalParameters
							.next();

						doSwitch(formalParameter);
						ownedParameters.add(formalParameter);
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

					for (Iterator ownedStateMachines = getValues(
						extension.getMixed(), "ownedStateMachine", true) //$NON-NLS-1$
						.iterator(); ownedStateMachines.hasNext();) {

						StateMachine ownedStateMachine = (StateMachine) ownedStateMachines
							.next();

						doSwitch(ownedStateMachine);
						ownedBehaviors.add(ownedStateMachine);
					}
				}

				return super.caseBehavioredClassifier(behavioredClassifier);
			}

			public Object caseCallBehaviorAction(
					CallBehaviorAction callBehaviorAction) {
				AnyType extension = getExtension(resource, callBehaviorAction);

				if (extension != null) {
					String function = (String) getValue(extension
						.getAnyAttribute(), "function", true); //$NON-NLS-1$

					if (function != null) {
						FunctionBehavior functionBehavior = (FunctionBehavior) resource
							.getEObject(function);

						if (functionBehavior != null) {
							callBehaviorAction.setBehavior(functionBehavior);
						}
					}
				}

				return super.caseCallBehaviorAction(callBehaviorAction);
			}

			public Object caseComment(Comment comment) {
				AnyType extension = getExtension(resource, comment);

				if (extension != null) {
					String body = (String) getValue(
						extension.getAnyAttribute(), "body", true); //$NON-NLS-1$

					if (body != null) {
						comment.setBody(body);
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

					Collection events = getValues(extension.getAnyAttribute(),
						"event", true);

					if (!events.isEmpty()) {
						DurationObservation durationObservation = (DurationObservation) duration
							.getNearestPackage().createPackagedElement(
								duration.getName(),
								UMLPackage.Literals.DURATION_OBSERVATION);

						for (Iterator e = events.iterator(); e.hasNext();) {
							NamedElement event = (NamedElement) resource
								.getEObject((String) e.next());

							if (event != null) {
								durationObservation.getEvents().add(event);
								durationObservation.getFirstEvents().add(
									isFirstEvent);
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

			public Object caseExtensionEnd(ExtensionEnd extensionEnd) {
				String name = extensionEnd.getName();

				if (!UML2Util.isEmpty(name) && name.startsWith("extension$")) { //$NON-NLS-1$
					extensionEnd.setName(Extension.STEREOTYPE_ROLE_PREFIX
						+ name.substring(10));
				}

				AnyType extension = getExtension(resource, extensionEnd);

				if (extension != null
					&& getValue(extension.getMixed(), "lowerValue") == null) { //$NON-NLS-1$

					extensionEnd.setLower(1);
				}

				return super.caseExtensionEnd(extensionEnd);
			}

			public Object caseInteractionUse(InteractionUse interactionUse) {
				AnyType extension = getExtension(resource, interactionUse);

				if (extension != null) {
					InputPin argument = (InputPin) getValue(extension
						.getMixed(), "argument", true); //$NON-NLS-1$

					if (argument != null) {
						doSwitch(argument);

						((CallBehaviorAction) interactionUse.createArgument(
							argument.getName(),
							UMLPackage.Literals.CALL_BEHAVIOR_ACTION))
							.getArguments().add(argument);
					}
				}

				return super.caseInteractionUse(interactionUse);
			}

			public Object caseMultiplicityElement(
					MultiplicityElement multiplicityElement) {
				AnyType extension = getExtension(resource, multiplicityElement);

				if (extension != null) {
					ValueSpecification lowerValue = (ValueSpecification) getValue(
						extension.getMixed(), "lowerValue", true); //$NON-NLS-1$

					if (lowerValue != null) {
						multiplicityElement.setLowerValue(lowerValue);
					}
				}

				return super.caseMultiplicityElement(multiplicityElement);
			}

			public Object caseMessage(Message message) {
				AnyType extension = getExtension(resource, message);

				if (extension != null) {
					String messageSort = (String) getValue(extension
						.getAnyAttribute(), "messageSort", true); //$NON-NLS-1$

					if (messageSort != null) {
						message.setMessageSort("synchSignal" //$NON-NLS-1$
							.equals(messageSort)
								? MessageSort.ASYNCH_SIGNAL_LITERAL
								: MessageSort.get(messageSort));
					}
				}

				return super.caseMessage(message);
			}

			public Object caseMessageEnd(MessageEnd messageEnd) {
				AnyType extension = getExtension(resource, messageEnd);

				if (extension != null) {
					String receiveMessage = (String) getValue(extension
						.getAnyAttribute(), "receiveMessage", true); //$NON-NLS-1$

					if (receiveMessage != null) {
						Message message = (Message) resource
							.getEObject(receiveMessage);

						if (message != null) {
							messageEnd.setMessage(message);
						}
					}

					String sendMessage = (String) getValue(extension
						.getAnyAttribute(), "sendMessage", true); //$NON-NLS-1$

					if (sendMessage != null) {
						Message message = (Message) resource
							.getEObject(sendMessage);

						if (message != null) {
							messageEnd.setMessage(message);
						}
					}
				}

				return super.caseMessageEnd(messageEnd);
			}

			public Object caseNamespace(Namespace namespace) {
				AnyType extension = getExtension(resource, namespace);

				if (extension != null) {
					EList packageImports = namespace.getPackageImports();

					for (Iterator pi = getValues(extension.getMixed(),
						"packageImport", true).iterator(); pi.hasNext();) { //$NON-NLS-1$

						EObject packageImport = (EObject) pi.next();

						if (packageImport instanceof PackageImport) {
							doSwitch(packageImport);
							packageImports.add(packageImport);
						}
					}
				}

				return super.caseNamespace(namespace);
			}

			public Object caseOpaqueExpression(OpaqueExpression opaqueExpression) {
				AnyType extension = getExtension(resource, opaqueExpression);

				if (extension != null) {
					String body = (String) getValue(
						extension.getAnyAttribute(), "body", true); //$NON-NLS-1$

					if (body != null) {
						opaqueExpression.getBodies().add(body);
					}
				}

				return super.caseOpaqueExpression(opaqueExpression);
			}

			public Object casePackageableElement(
					PackageableElement packageableElement) {
				AnyType extension = getExtension(resource, packageableElement);

				if (extension != null) {
					String packageableElement_visibility = (String) getValue(
						extension.getAnyAttribute(),
						"packageableElement_visibility", true); //$NON-NLS-1$

					if (packageableElement_visibility != null) {
						packageableElement.setVisibility(VisibilityKind
							.get(packageableElement_visibility));
					}
				}

				return super.casePackageableElement(packageableElement);
			}

			public Object caseProfileApplication(
					ProfileApplication profileApplication) {
				removeExtension(resource, profileApplication);

				String profileName = null;
				InternalEObject internalEObject = (InternalEObject) profileApplication
					.eGet(
						UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE,
						false);

				if (internalEObject != null && internalEObject.eIsProxy()) {
					URI eProxyURI = internalEObject.eProxyURI();

					if (eProxyURI.segmentCount() > 0) {
						String segment0 = eProxyURI.segment(0);

						int index = segment0.indexOf('.');
						profileName = index == -1
							? segment0
							: segment0.substring(0, index);
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

				caseElement(profileApplication);

				return profileApplication;
			}

			public Object caseProfile(Profile profile) {
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

				caseNamespace(profile);
				casePackageableElement(profile);
				caseElement(profile);

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

			public Object caseTimeExpression(TimeExpression timeExpression) {
				AnyType extension = getExtension(resource, timeExpression);

				if (extension != null) {
					boolean firstEvent = !"false".equals(getValue(extension //$NON-NLS-1$
						.getAnyAttribute(), "isFirstTime")); //$NON-NLS-1$

					NamedElement event = (NamedElement) resource
						.getEObject((String) getValue(extension
							.getAnyAttribute(), "event", true)); //$NON-NLS-1$

					if (event != null) {
						TimeObservation timeObservation = (TimeObservation) timeExpression
							.getNearestPackage().createPackagedElement(
								timeExpression.getName(),
								UMLPackage.Literals.TIME_OBSERVATION);

						timeObservation.setEvent(event);
						timeObservation.setFirstEvent(firstEvent);
					}
				}

				return super.caseTimeExpression(timeExpression);
			}

			public Object caseTrigger(Trigger trigger) {
				Event event = null;

				AnyType extension = getExtension(resource, trigger);

				if (extension != null) {
					ValueSpecification changeExpression = (ValueSpecification) getValue(
						extension.getMixed(), "changeExpression"); //$NON-NLS-1$

					if (changeExpression != null) {
						event = (Event) trigger.getNearestPackage()
							.createPackagedElement(trigger.getName(),
								UMLPackage.Literals.CHANGE_EVENT);
						((ChangeEvent) event)
							.setChangeExpression(changeExpression);
					} else {
						Operation operation = (Operation) getValue(extension
							.getMixed(), "operation"); //$NON-NLS-1$

						if (operation != null) {
							event = (CallEvent) trigger.getNearestPackage()
								.createPackagedElement(trigger.getName(),
									UMLPackage.Literals.CALL_EVENT);
							((CallEvent) event).setOperation(operation);
						} else {
							Signal signal = (Signal) getValue(extension
								.getMixed(), "signal"); //$NON-NLS-1$

							if (signal != null) {
								event = (SignalEvent) trigger
									.getNearestPackage().createPackagedElement(
										trigger.getName(),
										UMLPackage.Literals.SIGNAL_EVENT);
								((SignalEvent) event).setSignal(signal);
							} else {
								ValueSpecification when = (ValueSpecification) getValue(
									extension.getMixed(), "when"); //$NON-NLS-1$

								if (when != null) {
									event = (TimeEvent) trigger
										.getNearestPackage()
										.createPackagedElement(
											trigger.getName(),
											UMLPackage.Literals.TIME_EVENT);
									((TimeEvent) event).setWhen(when);

									String isRelative = (String) getValue(
										extension.getAnyAttribute(),
										"isRelative"); //$NON-NLS-1$

									if (isRelative != null) {
										((TimeEvent) event)
											.setIsRelative(Boolean.valueOf(
												isRelative).booleanValue());
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

			public Object caseOpaqueAction(OpaqueAction opaqueAction) {
				AnyType extension = getExtension(resource, opaqueAction);

				if (extension != null) {
					Activity activity = opaqueAction.getActivity();

					if (activity != null) {
						Duration duration = (Duration) getValue(extension
							.getMixed(), "duration", true); //$NON-NLS-1$

						if (duration != null) {
							doSwitch(duration);

							ValuePin inputValue = (ValuePin) activity
								.createNode(duration.getName(),
									UMLPackage.Literals.VALUE_PIN);

							inputValue.setType(duration.getType());
							inputValue.setValue(duration);

							opaqueAction.getInputValues().add(inputValue);
						}

						TimeExpression timeExpression = (TimeExpression) getValue(
							extension.getMixed(), "now", true); //$NON-NLS-1$

						if (timeExpression != null) {
							doSwitch(timeExpression);

							ValuePin inputValue = (ValuePin) activity
								.createNode(timeExpression.getName(),
									UMLPackage.Literals.VALUE_PIN);

							inputValue.setType(timeExpression.getType());
							inputValue.setValue(timeExpression);

							opaqueAction.getInputValues().add(inputValue);
						}
					}
				}

				return super.caseOpaqueAction(opaqueAction);
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

		for (int i = 0, size = resourceContents.size(); i < size; i++) {
			umlSwitch.doSwitch((EObject) resourceContents.get(i));
		}

		for (Iterator atr = annotationsToRemove.iterator(); atr.hasNext();) {
			((EAnnotation) atr.next()).setEModelElement(null);
		}

		EcoreUtil.resolveAll(resource);
	}
}
