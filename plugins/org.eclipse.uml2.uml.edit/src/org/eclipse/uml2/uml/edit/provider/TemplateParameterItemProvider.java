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
 * $Id: TemplateParameterItemProvider.java,v 1.1 2005/11/14 22:11:36 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetSetCommand;

import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.TemplateParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterItemProvider
		extends ElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

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
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSignaturePropertyDescriptor(object);
			addOwnedParameteredElementPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addOwnedDefaultPropertyDescriptor(object);
			addParameteredElementPropertyDescriptor(object);
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
				UMLPackage.eINSTANCE.getTemplateParameter_Signature(), true,
				null, null,
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
				UMLPackage.eINSTANCE
					.getTemplateParameter_OwnedParameteredElement(), true,
				null, null,
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
				UMLPackage.eINSTANCE.getTemplateParameter_Default(), true,
				null, null, null));
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
				UMLPackage.eINSTANCE.getTemplateParameter_OwnedDefault(), true,
				null, null,
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
				UMLPackage.eINSTANCE.getTemplateParameter_ParameteredElement(),
				true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getTemplateParameter_OwnedParameteredElement());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getTemplateParameter_OwnedDefault());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/TemplateParameter"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_TemplateParameter_type"); //$NON-NLS-1$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TemplateParameter.class)) {
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT :
			case UMLPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createSendOperationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement(),
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDependency()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createPackage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createProfile()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createStereotype()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createUseCase()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createAbstraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createSubstitution()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDeployment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createArtifact()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createManifestation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createOperation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDataType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createSignal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createPort()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createCollaboration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createExtension()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createEnumeration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createActor()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createUsage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInteraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createActivity()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createExecutionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createCreationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDestructionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createSendOperationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createSendSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createCallEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInformationItem()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createModel()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createComponent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createDevice()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedDefault(), UMLFactory.eINSTANCE
			.createAssociationClass()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement()
			|| childFeature == UMLPackage.eINSTANCE
				.getTemplateParameter_OwnedDefault();

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return UMLEditPlugin.INSTANCE;
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.eINSTANCE
			.getTemplateParameter_OwnedParameteredElement()) {
			return new SubsetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameter_ParameteredElement()}, value);
		}
		if (feature == UMLPackage.eINSTANCE.getTemplateParameter_OwnedDefault()) {
			return new SubsetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameter_Default()}, value);
		}
		if (feature == UMLPackage.eINSTANCE
			.getTemplateParameter_ParameteredElement()) {
			return new SupersetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameter_OwnedParameteredElement()}, value);
		}
		if (feature == UMLPackage.eINSTANCE.getTemplateParameter_Default()) {
			return new SupersetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameter_OwnedDefault()}, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
