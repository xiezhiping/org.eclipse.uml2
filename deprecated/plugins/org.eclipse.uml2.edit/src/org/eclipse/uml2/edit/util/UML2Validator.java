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
 * $Id: UML2Validator.java,v 1.3 2004/04/11 02:53:43 khussey Exp $
 */
package org.eclipse.uml2.edit.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2StatusConstants;

import org.eclipse.uml2.provider.UML2EditPlugin;
import org.eclipse.uml2.provider.UML2ItemProviderAdapterFactory;

import org.eclipse.uml2.util.BasicProgressMonitor;
import org.eclipse.uml2.util.ProgressMonitor;
import org.eclipse.uml2.util.UML2Switch;
import org.eclipse.uml2.util.Validator;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * A utility that performs validation operations on UML2 model objects and
 * notifies a monitor of progress. The outcome of a validation operation is
 * represented by a diagnostic containing zero or more children.
 * 
 * @see org.eclipse.uml2.util.UML2Switch
 * @generated
 */
public class UML2Validator
	extends UML2Switch
	implements Validator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Represents the singleton instance of this validator.
	 * @generated
	 */
	public static final UML2Validator INSTANCE = new UML2Validator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Represents the adaptor factory used by this validator.
	 * @generated
	 */
	private final AdapterFactory adapterFactory =
		new ComposedAdapterFactory(new AdapterFactory[] {
			new UML2ItemProviderAdapterFactory(),
			new EcoreItemProviderAdapterFactory()
		});

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Represents the context for validation operations.
	 * @generated
	 */
	private Validator.ValidationContext context = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Constructs a validator.
	 * @generated
	 */
	protected UML2Validator() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Retrieves the adapter factory used by this validator.
	 * 
	 * @return The adapter factory used by this validator.
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Retrieves the context for the current validation operation.
	 * 
	 * @return The context for the current validation operation.
	 * @generated
	 */
	protected Validator.ValidationContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Retrieves a textual representation of the specified model object from
	 * the adapter factory used by this validator.
	 * 
	 * @param object The model object for which to retrieve text.
	 * @return A textual representation of the model object.
	 * @generated
	 */
	protected String getText(EObject object) {
		return ((IItemLabelProvider) getAdapterFactory().adapt(object, IItemLabelProvider.class)).getText(object);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Performs a validation operation on the specified object and notifies the
	 * specified monitor of progress.
	 * 
	 * @param object The object to be validated.
	 * @param monitor The monitor to notify of progress.
	 * @return A diagnostic indicating the outcome of the operation.
	 * @generated
	 */
	public Diagnostic validate(EObject object, ProgressMonitor monitor) {
		context =
			new Validator.ValidationContext(
				new BasicDiagnostic(UML2StatusConstants.PLUGIN_ID, UML2StatusConstants.UNSPECIFIED, getText(object), null),
				null == monitor ? new BasicProgressMonitor() : monitor);

		context.getMonitor().beginTask(UML2EditPlugin.INSTANCE.getString("_UI_Validating_message", new Object[] { getText(object)}), ProgressMonitor.UNKNOWN); //$NON-NLS-1$

		try {
			doSwitch(object);
		} finally {
			context.getMonitor().done();
		}

		return context.getDiagnostics();
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.util.UML2Switch#defaultCase(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {

		if (modelPackage == object.eClass().eContainer()) {

			for (Iterator eContents = object.eContents().iterator(); eContents
				.hasNext();) {

				doSwitch((EObject) eContents.next());
			}
		}

		return getContext();
	}

	/* (non-Javadoc)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.util.UML2Switch#doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {

		if (!getContext().getMonitor().isCanceled()) {
			getContext().getMonitor().subTask(
				UML2EditPlugin.INSTANCE.getString("_UI_Validating_message", //$NON-NLS-1$
					new Object[] {getText(theEObject)}));

			super.doSwitch(theEObject);
		}

		return getContext();
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		object.validateNotOwnSelf(getContext().getDiagnostics(), getContext().getData());
		object.validateHasOwner(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMultiplicityElement(MultiplicityElement object) {
		object.validateUpperGt0(getContext().getDiagnostics(), getContext().getData());
		object.validateLowerGe0(getContext().getDiagnostics(), getContext().getData());
		object.validateUpperGeLower(getContext().getDiagnostics(), getContext().getData());
		object.validateLowerEqLowerbound(getContext().getDiagnostics(), getContext().getData());
		object.validateUpperEqUpperbound(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProperty(Property object) {
		object.validateOppositeIsOtherEnd(getContext().getDiagnostics(), getContext().getData());
		object.validateMultiplicityOfComposite(getContext().getDiagnostics(), getContext().getData());
		object.validateSubsettingContext(getContext().getDiagnostics(), getContext().getData());
		object.validateNavigablePropertyRedefinition(getContext().getDiagnostics(), getContext().getData());
		object.validateSubsettingRules(getContext().getDiagnostics(), getContext().getData());
		object.validateNavigableReadonly(getContext().getDiagnostics(), getContext().getData());
		object.validateDerivedUnionIsDerived(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperation(Operation object) {
		object.validateTypeOfResult(getContext().getDiagnostics(), getContext().getData());
		object.validateOnlyBodyForQuery(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		object.validateNoName(getContext().getDiagnostics(), getContext().getData());
		object.validateQualifiedName(getContext().getDiagnostics(), getContext().getData());
		object.validateVisibilityNeedsOwnership(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(org.eclipse.uml2.Package object) {
		object.validateElementsPublicOrPrivate(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamespace(Namespace object) {
		object.validateMembersAreDistinguishable(getContext().getDiagnostics(), getContext().getData());
		object.validateImportedMemberDerived(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassifier(Classifier object) {
		object.validateNoCyclesInGeneralization(getContext().getDiagnostics(), getContext().getData());
		object.validateSpecializeType(getContext().getDiagnostics(), getContext().getData());
		object.validateInheritedMember(getContext().getDiagnostics(), getContext().getData());
		object.validateGeneralEqualsParents(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraint(Constraint object) {
		object.validateNotApplyToSelf(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Instance Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceSpecification(InstanceSpecification object) {
		object.validateSlotsAreDefined(getContext().getDiagnostics(), getContext().getData());
		object.validateNoDuplicateSlots(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRedefinableElement(RedefinableElement object) {
		object.validateRedefinitionContextValid(getContext().getDiagnostics(), getContext().getData());
		object.validateRedefinitionConsistent(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Element Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElementImport(ElementImport object) {
		object.validateVisibilityPublicOrPrivate(getContext().getDiagnostics(), getContext().getData());
		object.validateImportedElementIsPublic(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/**
	 * Returns the result of validating the object as an instance of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object The target of the switch.
	 * @return The result of validating the object as an instance of '<em>Package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackageImport(PackageImport object) {
		object.validatePublicOrPrivate(getContext().getDiagnostics(), getContext().getData());
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.util.UML2Switch#caseEModelElement(org.eclipse.emf.ecore.EModelElement)
	 */
	public Object caseEModelElement(EModelElement object) {

		for (Iterator eAllStructuralFeatures = object.eClass()
			.getEAllStructuralFeatures().iterator(); eAllStructuralFeatures
			.hasNext();) {

			EStructuralFeature eStructuralFeature = (EStructuralFeature) eAllStructuralFeatures
				.next();

			if (eStructuralFeature.isMany()) {
				int lowerBound = eStructuralFeature.getLowerBound();

				if (lowerBound > 0) {
					int size = ((List) object.eGet(eStructuralFeature)).size();

					if (size < lowerBound) {
						getContext().getDiagnostics().add(
							new BasicDiagnostic(Diagnostic.WARNING,
									UML2StatusConstants.PLUGIN_ID,
									UML2StatusConstants.UNSPECIFIED,
									UML2EditPlugin.INSTANCE.getString(
										"_UI_FeatureHasTooFewValues_message", //$NON-NLS-1$
										new Object[] {
											eStructuralFeature.getName(),
											getText(object), new Integer(size),
											new Integer(lowerBound)}),
									new Object[] {object, eStructuralFeature}));
					}

					int upperBound = eStructuralFeature.getUpperBound();

					if (upperBound > 0 && size > upperBound) {
						getContext().getDiagnostics().add(
							new BasicDiagnostic(Diagnostic.WARNING,
									UML2StatusConstants.PLUGIN_ID,
									UML2StatusConstants.UNSPECIFIED,
									UML2EditPlugin.INSTANCE.getString(
										"_UI_FeatureHasTooManyValues_message", //$NON-NLS-1$
										new Object[] {
											eStructuralFeature.getName(),
											getText(object), new Integer(size),
											new Integer(upperBound)}),
									new Object[] {object, eStructuralFeature}));
					}
				} else {
					int upperBound = eStructuralFeature.getUpperBound();

					if (upperBound > 0) {
						int size = ((List) object.eGet(eStructuralFeature))
							.size();

						if (size > upperBound) {
							getContext()
								.getDiagnostics()
								.add(
									new BasicDiagnostic(
											Diagnostic.WARNING,
											UML2StatusConstants.PLUGIN_ID,
											UML2StatusConstants.UNSPECIFIED,
											UML2EditPlugin.INSTANCE
												.getString(
													"_UI_FeatureHasTooManyValues_message", //$NON-NLS-1$
													new Object[] {
														eStructuralFeature
															.getName(),
														getText(object),
														new Integer(size),
														new Integer(upperBound)}),
											new Object[] {object,
												eStructuralFeature}));
						}
					}
				}
			} else if (eStructuralFeature.isRequired()) {

				if (!object.eIsSet(eStructuralFeature)) {
					getContext().getDiagnostics().add(
						new BasicDiagnostic(Diagnostic.WARNING,
								UML2StatusConstants.PLUGIN_ID,
								UML2StatusConstants.UNSPECIFIED,
								UML2EditPlugin.INSTANCE.getString(
									"_UI_RequiredFeatureMustBeSet_message", //$NON-NLS-1$
									new Object[] {eStructuralFeature.getName(),
										getText(object)}), new Object[] {
									object, eStructuralFeature}));
				}
			}
		}

		return null;
	}

} //UML2Validator
