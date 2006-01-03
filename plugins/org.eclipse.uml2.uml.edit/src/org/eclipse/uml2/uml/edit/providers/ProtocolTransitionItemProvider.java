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
 * $Id: ProtocolTransitionItemProvider.java,v 1.3 2006/01/03 18:02:30 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

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
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.common.edit.command.SupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SupersetSetCommand;

import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.ProtocolTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolTransitionItemProvider
		extends TransitionItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransitionItemProvider(AdapterFactory adapterFactory) {
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

			addPostConditionPropertyDescriptor(object);
			addReferredPropertyDescriptor(object);
			addPreConditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Post Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ProtocolTransition_postCondition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ProtocolTransition_postCondition_feature", "_UI_ProtocolTransition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Referred feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferredPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ProtocolTransition_referred_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ProtocolTransition_referred_feature", "_UI_ProtocolTransition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PROTOCOL_TRANSITION__REFERRED, false, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Pre Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ProtocolTransition_preCondition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ProtocolTransition_preCondition_feature", "_UI_ProtocolTransition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PROTOCOL_TRANSITION__PRE_CONDITION, true,
				null, null, null));
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
			childrenFeatures
				.add(UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION);
		}
		return childrenFeatures;
	}

	/**
	 * This returns ProtocolTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/ProtocolTransition"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ProtocolTransition) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_ProtocolTransition_type") : //$NON-NLS-1$
			getString("_UI_ProtocolTransition_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ProtocolTransition.class)) {
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
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

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION,
			UMLFactory.eINSTANCE.createDurationConstraint()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
			|| childFeature == UMLPackage.Literals.TRANSITION__GUARD
			|| childFeature == UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION;

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
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection) {
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.Literals.TRANSITION__GUARD,
					UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION},
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
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SupersetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.Literals.TRANSITION__GUARD,
					UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION},
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
		if (feature == UMLPackage.Literals.TRANSITION__GUARD) {
			return new SubsetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				value);
		}
		if (feature == UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION) {
			return new SubsetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				value);
		}
		if (feature == UMLPackage.Literals.PROTOCOL_TRANSITION__PRE_CONDITION) {
			return new SubsetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TRANSITION__GUARD},
				value);
		}
		if (feature == UMLPackage.Literals.TRANSITION__GUARD) {
			return new SupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PROTOCOL_TRANSITION__PRE_CONDITION},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
