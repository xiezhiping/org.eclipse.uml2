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
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 414970, 370089, 459723
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
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.ProtocolTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolTransitionItemProvider
		extends TransitionItemProvider {

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
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPostConditionPropertyDescriptor(object);
			addPreConditionPropertyDescriptor(object);
			addReferredPropertyDescriptor(object);
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
				false, true, null, null,
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
				UMLPackage.Literals.PROTOCOL_TRANSITION__REFERRED, false,
				false, false, null, null, null));
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
				false, true, null, null, null));
	}

	/**
	 * This returns ProtocolTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/ProtocolTransition")); //$NON-NLS-1$
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
				"_UI_ProtocolTransition_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(ProtocolTransition.class)) {
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION,
			UMLFactory.eINSTANCE.createTimeConstraint()));
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
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.Literals.TRANSITION__GUARD,
					UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION},
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
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature,
				null, new EStructuralFeature[]{
					UMLPackage.Literals.TRANSITION__GUARD,
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
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.Literals.TRANSITION__GUARD) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				new EStructuralFeature[]{UMLPackage.Literals.PROTOCOL_TRANSITION__PRE_CONDITION},
				value);
		}
		if (feature == UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value);
		}
		if (feature == UMLPackage.Literals.PROTOCOL_TRANSITION__PRE_CONDITION) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TRANSITION__GUARD},
				null, value);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SubsetSupersetSetCommand(domain, owner, feature, null,
				new EStructuralFeature[]{UMLPackage.Literals.TRANSITION__GUARD,
					UMLPackage.Literals.PROTOCOL_TRANSITION__POST_CONDITION},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}