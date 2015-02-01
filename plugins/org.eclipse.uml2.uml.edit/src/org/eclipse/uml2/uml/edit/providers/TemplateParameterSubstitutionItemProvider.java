/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188, 215418, 204200
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 414970, 370089
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.TemplateParameterSubstitution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterSubstitutionItemProvider
		extends ElementItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitutionItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addActualPropertyDescriptor(object);
			addFormalPropertyDescriptor(object);
			addOwnedActualPropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Formal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameterSubstitution_formal_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_formal_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Actual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameterSubstitution_actual_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_actual_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Actual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedActualPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameterSubstitution_ownedActual_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_ownedActual_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Template Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameterSubstitution_templateBinding_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_templateBinding_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
				.add(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TemplateParameterSubstitution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
			object,
			getResourceLocator().getImage(
				"full/obj16/TemplateParameterSubstitution")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return appendLabel(
			appendType(appendKeywords(new StringBuffer(), object),
				"_UI_TemplateParameterSubstitution_type"), object).toString(); //$NON-NLS-1$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TemplateParameterSubstitution.class)) {
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
			UMLFactory.eINSTANCE.createTimeObservation()));
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL},
				null, value);
		}
		if (feature == UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}