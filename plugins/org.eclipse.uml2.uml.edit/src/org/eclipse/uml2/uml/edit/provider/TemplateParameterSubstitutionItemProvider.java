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
 * $Id: TemplateParameterSubstitutionItemProvider.java,v 1.1 2005/11/14 22:11:33 khussey Exp $
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

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.common.edit.command.SupersetReplaceCommand;

import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.TemplateParameterSubstitution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterSubstitutionItemProvider
		extends ElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

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
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFormalPropertyDescriptor(object);
			addActualPropertyDescriptor(object);
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
				UMLPackage.eINSTANCE.getTemplateParameterSubstitution_Formal(),
				true, null, null, null));
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
				UMLPackage.eINSTANCE.getTemplateParameterSubstitution_Actual(),
				true, null, null, null));
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
				UMLPackage.eINSTANCE
					.getTemplateParameterSubstitution_OwnedActual(), true,
				null, null,
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
				UMLPackage.eINSTANCE
					.getTemplateParameterSubstitution_TemplateBinding(), true,
				null, null,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getTemplateParameterSubstitution_OwnedActual());
		}
		return childrenFeatures;
	}

	/**
	 * This returns TemplateParameterSubstitution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage(
			"full/obj16/TemplateParameterSubstitution"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_TemplateParameterSubstitution_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(TemplateParameterSubstitution.class)) {
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL :
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
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createSendOperationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual(),
			UMLFactory.eINSTANCE.createAssociationClass()));
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
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection, int index) {
		if (feature == UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual()) {
			return new SubsetAddCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameterSubstitution_Actual()}, collection,
				index);
		}
		return super
			.createAddCommand(domain, owner, feature, collection, index);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection) {
		if (feature == UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_Actual()) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameterSubstitution_OwnedActual()},
				collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EObject value, Collection collection) {
		if (feature == UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_OwnedActual()) {
			return new SubsetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameterSubstitution_Actual()}, value,
				collection);
		}
		if (feature == UMLPackage.eINSTANCE
			.getTemplateParameterSubstitution_Actual()) {
			return new SupersetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getTemplateParameterSubstitution_OwnedActual()}, value,
				collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value,
			collection);
	}

}
