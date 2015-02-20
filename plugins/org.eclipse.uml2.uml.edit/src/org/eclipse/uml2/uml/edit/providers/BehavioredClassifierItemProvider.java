/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 215418, 204200
 *   Kenn Hussey (CEA) - 327039, 418466, 414970, 370089, 459723
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

import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.BehavioredClassifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehavioredClassifierItemProvider
		extends ClassifierItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addClassifierBehaviorPropertyDescriptor(object);
			addInterfaceRealizationPropertyDescriptor(object);
			addOwnedBehaviorPropertyDescriptor(object);
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
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				true, false, true, null, null,
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
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				true, false, true, null, null, null));
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
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
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
				.add(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
			childrenFeatures
				.add(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BehavioredClassifier) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_BehavioredClassifier_type") : //$NON-NLS-1$
			getString("_UI_BehavioredClassifier_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(BehavioredClassifier.class)) {
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION :
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR :
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
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createInteraction()));
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

		boolean qualify = childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE
			|| childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION
			|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR
			|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR},
				collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, Collection<?> collection) {
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR},
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
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR},
				null, value);
		}
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}