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
 * $Id: ClassItemProvider.java,v 1.1 2005/11/14 22:11:37 khussey Exp $
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.common.edit.command.SupersetReplaceCommand;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider
		extends EncapsulatedClassifierItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedBehaviorPropertyDescriptor(object);
			addClassifierBehaviorPropertyDescriptor(object);
			addInterfaceRealizationPropertyDescriptor(object);
			addOwnedTriggerPropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
			addNestedClassifierPropertyDescriptor(object);
			addSuperClassPropertyDescriptor(object);
			addIsActivePropertyDescriptor(object);
			addOwnedReceptionPropertyDescriptor(object);
			addExtensionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_BehavioredClassifier_ownedBehavior_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_ownedBehavior_feature", "_UI_BehavioredClassifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(),
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Classifier Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_BehavioredClassifier_classifierBehavior_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_classifierBehavior_feature", "_UI_BehavioredClassifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE
					.getBehavioredClassifier_ClassifierBehavior(), true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Interface Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_BehavioredClassifier_interfaceRealization_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_interfaceRealization_feature", "_UI_BehavioredClassifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE
					.getBehavioredClassifier_InterfaceRealization(), true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_BehavioredClassifier_ownedTrigger_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_ownedTrigger_feature", "_UI_BehavioredClassifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger(),
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_ownedOperation_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_ownedOperation_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getClass_OwnedOperation(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Nested Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_nestedClassifier_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_nestedClassifier_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getClass_NestedClassifier(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_superClass_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_superClass_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getClass_SuperClass(), true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Is Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_isActive_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_isActive_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getClass_IsActive(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Reception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedReceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_ownedReception_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_ownedReception_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getClass_OwnedReception(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_extension_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_extension_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getClass_Extension(), false, null, null,
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
				.getBehavioredClassifier_OwnedBehavior());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getBehavioredClassifier_InterfaceRealization());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getBehavioredClassifier_OwnedTrigger());
			childrenFeatures
				.add(UMLPackage.eINSTANCE.getClass_OwnedOperation());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getClass_NestedClassifier());
			childrenFeatures
				.add(UMLPackage.eINSTANCE.getClass_OwnedReception());
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Class"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((org.eclipse.uml2.uml.Class) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_Class_type") : //$NON-NLS-1$
			getString("_UI_Class_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(org.eclipse.uml2.uml.Class.class)) {
			case UMLPackage.CLASS__IS_ACTIVE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
			case UMLPackage.CLASS__OWNED_TRIGGER :
			case UMLPackage.CLASS__OWNED_OPERATION :
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
			case UMLPackage.CLASS__OWNED_RECEPTION :
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
			.getBehavioredClassifier_OwnedBehavior(), UMLFactory.eINSTANCE
			.createBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedBehavior(), UMLFactory.eINSTANCE
			.createStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedBehavior(), UMLFactory.eINSTANCE
			.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedBehavior(), UMLFactory.eINSTANCE
			.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedBehavior(), UMLFactory.eINSTANCE
			.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedBehavior(), UMLFactory.eINSTANCE
			.createInteraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedBehavior(), UMLFactory.eINSTANCE
			.createActivity()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_InterfaceRealization(),
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedTrigger(), UMLFactory.eINSTANCE
			.createTrigger()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getClass_OwnedOperation(), UMLFactory.eINSTANCE
				.createOperation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createStereotype()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getClass_NestedClassifier(), UMLFactory.eINSTANCE
				.createUseCase()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getClass_NestedClassifier(), UMLFactory.eINSTANCE
				.createArtifact()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createDeploymentSpecification()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getClass_NestedClassifier(), UMLFactory.eINSTANCE
				.createBehavior()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getClass_NestedClassifier(), UMLFactory.eINSTANCE
				.createDataType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createCollaboration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createExtension()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createEnumeration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createInteraction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getClass_NestedClassifier(), UMLFactory.eINSTANCE
				.createActivity()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createInformationItem()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createComponent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getClass_NestedClassifier(), UMLFactory.eINSTANCE
			.createAssociationClass()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getClass_OwnedReception(), UMLFactory.eINSTANCE
				.createReception()));
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
			.getTemplateableElement_OwnedTemplateSignature()
			|| childFeature == UMLPackage.eINSTANCE
				.getClassifier_OwnedSignature()
			|| childFeature == UMLPackage.eINSTANCE
				.getClassifier_OwnedUseCase()
			|| childFeature == UMLPackage.eINSTANCE.getClass_NestedClassifier()
			|| childFeature == UMLPackage.eINSTANCE
				.getBehavioredClassifier_OwnedBehavior();

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
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection, int index) {
		if (feature == UMLPackage.eINSTANCE
			.getBehavioredClassifier_InterfaceRealization()) {
			return new SubsetAddCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getNamedElement_ClientDependency()}, collection, index);
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
			.getBehavioredClassifier_OwnedBehavior()) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getBehavioredClassifier_ClassifierBehavior()}, collection);
		}
		if (feature == UMLPackage.eINSTANCE.getNamedElement_ClientDependency()) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{
					UMLPackage.eINSTANCE.getClassifier_Substitution(),
					UMLPackage.eINSTANCE
						.getBehavioredClassifier_InterfaceRealization()},
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
			.getBehavioredClassifier_InterfaceRealization()) {
			return new SubsetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getNamedElement_ClientDependency()}, value, collection);
		}
		if (feature == UMLPackage.eINSTANCE
			.getBehavioredClassifier_OwnedBehavior()) {
			return new SupersetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getBehavioredClassifier_ClassifierBehavior()}, value,
				collection);
		}
		if (feature == UMLPackage.eINSTANCE.getNamedElement_ClientDependency()) {
			return new SupersetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{
					UMLPackage.eINSTANCE.getClassifier_Substitution(),
					UMLPackage.eINSTANCE
						.getBehavioredClassifier_InterfaceRealization()},
				value, collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value,
			collection);
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
			.getBehavioredClassifier_ClassifierBehavior()) {
			return new SubsetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getBehavioredClassifier_OwnedBehavior()}, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
