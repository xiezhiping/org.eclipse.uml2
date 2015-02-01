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
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.TemplateParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterItemProvider
		extends ElementItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultPropertyDescriptor(object);
			addOwnedDefaultPropertyDescriptor(object);
			addParameteredElementPropertyDescriptor(object);
			addSignaturePropertyDescriptor(object);
			addOwnedParameteredElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameter_signature_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameter_signature_feature", "_UI_TemplateParameter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER__SIGNATURE, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Parametered Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedParameteredElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameter_ownedParameteredElement_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameter_ownedParameteredElement_feature", "_UI_TemplateParameter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameter_default_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameter_default_feature", "_UI_TemplateParameter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER__DEFAULT, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameter_ownedDefault_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameter_ownedDefault_feature", "_UI_TemplateParameter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT, true,
				false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Parametered Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameteredElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateParameter_parameteredElement_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateParameter_parameteredElement_feature", "_UI_TemplateParameter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
				true, false, true, null, null, null));
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
				.add(UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT);
			childrenFeatures
				.add(UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
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
	 * This returns TemplateParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/TemplateParameter")); //$NON-NLS-1$
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
				"_UI_TemplateParameter_type"), ((TemplateParameter) object).getParameteredElement()).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(TemplateParameter.class)) {
			case UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
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
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT,
			UMLFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeObservation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT
			|| childFeature == UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
		if (feature == UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_PARAMETER__DEFAULT},
				null, value);
		}
		if (feature == UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT},
				null, value);
		}
		if (feature == UMLPackage.Literals.TEMPLATE_PARAMETER__DEFAULT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT},
				value);
		}
		if (feature == UMLPackage.Literals.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

	@Override
	public Object getForeground(Object object) {
		ParameterableElement parameteredElement = ((TemplateParameter) object)
			.getParameteredElement();
		return parameteredElement != null && parameteredElement.eIsProxy()
			? IItemColorProvider.GRAYED_OUT_COLOR
			: super.getForeground(object);
	}

}