/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConvertToMetamodelAction.java,v 1.2 2005/05/18 16:43:51 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.examples.ui.ExamplesUIPlugin;
import org.eclipse.uml2.util.UML2Resource;
import org.eclipse.uml2.util.UML2Switch;
import org.eclipse.uml2.util.UML2Util;
import org.eclipse.uml2.util.UML2Util.EObjectMatcher;

/**
 * 
 */
public class ConvertToMetamodelAction
		extends ConvertModelAction {

	protected static final String STEREOTYPE_NAME__METACLASS = "Metaclass"; //$NON-NLS-1$

	protected static final String STEREOTYPE_NAME__METAMODEL = "Metamodel"; //$NON-NLS-1$

	protected static boolean safeEquals(Object thisObject, Object thatObject) {
		return null == thisObject
			? null == thatObject
			: thisObject.equals(thatObject);
	}

	protected static class EClassMatcher
			implements EObjectMatcher {

		protected final EObject eObject;

		protected EClassMatcher(EObject eObject) {
			super();

			this.eObject = eObject;
		}

		public boolean matches(EObject otherEObject) {

			return null == eObject || null == otherEObject
				? null == eObject && null == otherEObject
				: eObject.eClass() == otherEObject.eClass();
		}
	}

	protected class NameMatcher
			extends EClassMatcher {

		protected NameMatcher(NamedElement namedElement) {
			super(namedElement);
		}

		public boolean matches(EObject otherEObject) {

			return super.matches(otherEObject)
				&& ((null == eObject && null == otherEObject) || ((NamedElement) eObject)
					.getName().equalsIgnoreCase(
						((NamedElement) otherEObject).getName()));
		}
	}

	protected class TypeMatcher
			extends NameMatcher {

		protected TypeMatcher(TypedElement typedElement) {
			super(typedElement);
		}

		public boolean matches(EObject otherEObject) {

			return super.matches(otherEObject)
				&& ((null == eObject && null == otherEObject) || safeEquals(
					((TypedElement) eObject).getType().getQualifiedName(),
					((TypedElement) otherEObject).getType().getQualifiedName()));
		}
	}

	protected class SignatureMatcher
			extends TypeMatcher {

		protected SignatureMatcher(Operation operation) {
			super(operation);
		}

		public boolean matches(EObject otherEObject) {

			if (super.matches(otherEObject)) {
				List parameters = ((Operation) eObject).getOwnedParameters();
				List otherParameters = ((Operation) otherEObject)
					.getOwnedParameters();

				if (parameters.size() == otherParameters.size()) {

					for (int i = 0; i < parameters.size(); i++) {

						if (!new TypeMatcher((TypedElement) parameters.get(i))
							.matches((EObject) otherParameters.get(i))) {

							return false;
						}
					}

					return true;
				}
			}

			return false;
		}
	}

	/*
	 * @see org.eclipse.emf.edit.ui.action.CommandAction#createActionCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.util.Collection)
	 */
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (1 == collection.size()
			&& Model.class.isInstance(collection.toArray()[0])) {

			final Model model = (Model) collection.toArray()[0];

			return new ChangeCommand(editingDomain, new Runnable() {

				public void run() {
					Profile completeProfile = applyProfile(model,
						UML2Resource.COMPLETE_PROFILE_URI);

					if (null != completeProfile) {
						applyStereotype(model, completeProfile
							.getOwnedStereotype(STEREOTYPE_NAME__METAMODEL));
					}

					Profile basicProfile = applyProfile(model,
						UML2Resource.BASIC_PROFILE_URI);

					if (null != basicProfile) {
						final Stereotype metaclassStereotype = basicProfile
							.getOwnedStereotype(STEREOTYPE_NAME__METACLASS);

						new UML2Switch() {

							public Object caseClass(
									org.eclipse.uml2.Class class_) {
								applyStereotype(class_, metaclassStereotype);

								return caseNamedElement(class_);
							}

							public Object caseNamedElement(
									NamedElement namedElement) {
								String qualifiedName = namedElement
									.getQualifiedName();

								if (!UML2Util.isEmpty(qualifiedName)) {
									UML2Resource resource = (UML2Resource) namedElement
										.eResource();
									UML2Resource otherResource = (UML2Resource) resource
										.getResourceSet()
										.getResource(
											URI
												.createURI(UML2Resource.ECORE_METAMODEL_URI),
											true);

									Collection otherNamedElements = UML2Util
										.findNamedElements(otherResource,
											qualifiedName, false, namedElement
												.eClass());

									if (otherNamedElements.isEmpty()) {
										otherResource = (UML2Resource) resource
											.getResourceSet()
											.getResource(
												URI
													.createURI(UML2Resource.UML2_METAMODEL_URI),
												true);

										otherNamedElements = UML2Util
											.findNamedElements(otherResource,
												qualifiedName, false,
												namedElement.eClass());
									}

									switch (otherNamedElements.size()) {
										case 0 :
											break;
										case 1 :
											NamedElement otherNamedElement = (NamedElement) otherNamedElements
												.iterator().next();

											System.out.println(qualifiedName
												+ ": "
												+ resource.getID(namedElement)
												+ " -> "
												+ otherResource
													.getID(otherNamedElement));

											resource.setID(namedElement,
												otherResource
													.getID(otherNamedElement));
											break;
										default :
											if (namedElement instanceof Operation) {
												Operation operation = (Operation) namedElement;

												for (Iterator i = otherNamedElements
													.iterator(); i.hasNext();) {

													Operation otherOperation = (Operation) i
														.next();

													if (new SignatureMatcher(
														operation)
														.matches(otherOperation)) {

														System.out
															.println(qualifiedName
																+ ": "
																+ resource
																	.getID(operation)
																+ " -> "
																+ otherResource
																	.getID(otherOperation));

														resource
															.setID(
																operation,
																otherResource
																	.getID(otherOperation));

														break;
													}
												}
											} else if (namedElement instanceof Parameter) {
												Parameter parameter = (Parameter) namedElement;

												for (Iterator i = otherNamedElements
													.iterator(); i.hasNext();) {

													Parameter otherParameter = (Parameter) i
														.next();

													if (new SignatureMatcher(
														parameter
															.getOperation())
														.matches(otherParameter
															.getOperation())) {

														System.out
															.println(qualifiedName
																+ ": "
																+ resource
																	.getID(parameter)
																+ " -> "
																+ otherResource
																	.getID(otherParameter));

														resource
															.setID(
																parameter,
																otherResource
																	.getID(otherParameter));

														break;
													}
												}
											}
									}
								}

								return defaultCase(namedElement);
							}

							public Object casePackage(
									org.eclipse.uml2.Package package_) {
								return caseNamedElement(package_);
							}

							public Object casePackageableElement(
									PackageableElement packageableElement) {
								packageableElement
									.setVisibility(VisibilityKind.PRIVATE_LITERAL);

								return caseNamedElement(packageableElement);
							}

							public Object defaultCase(EObject eObject) {

								for (Iterator eContents = eObject.eContents()
									.iterator(); eContents.hasNext();) {

									doSwitch((EObject) eContents.next());
								}

								return this;
							}
						}.doSwitch(model);
					}
				}
			}, ExamplesUIPlugin.getDefault().getString(
				"_UI_ConvertToMetamodelActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(model)}));
		}

		return UnexecutableCommand.INSTANCE;
	}

}
