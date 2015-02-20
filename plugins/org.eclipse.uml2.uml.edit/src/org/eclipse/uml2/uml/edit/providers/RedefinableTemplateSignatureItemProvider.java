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

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RedefinableTemplateSignatureItemProvider
		extends RedefinableElementItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignatureItemProvider(
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

			addParameterPropertyDescriptor(object);
			addTemplatePropertyDescriptor(object);
			addOwnedParameterPropertyDescriptor(object);
			addExtendedSignaturePropertyDescriptor(object);
			addInheritedParameterPropertyDescriptor(object);
			addClassifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateSignature_parameter_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateSignature_parameter_feature", "_UI_TemplateSignature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateSignature_template_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateSignature_template_feature", "_UI_TemplateSignature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_SIGNATURE__TEMPLATE, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateSignature_ownedParameter_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateSignature_ownedParameter_feature", "_UI_TemplateSignature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER, true,
				false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Extended Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedSignaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RedefinableTemplateSignature_extendedSignature_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_RedefinableTemplateSignature_extendedSignature_feature", "_UI_RedefinableTemplateSignature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Inherited Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RedefinableTemplateSignature_inheritedParameter_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_RedefinableTemplateSignature_inheritedParameter_feature", "_UI_RedefinableTemplateSignature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER,
				false, false, false, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RedefinableTemplateSignature_classifier_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_RedefinableTemplateSignature_classifier_feature", "_UI_RedefinableTemplateSignature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER,
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
				.add(UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER);
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
	 * This returns RedefinableTemplateSignature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
			object,
			getResourceLocator().getImage(
				"full/obj16/RedefinableTemplateSignature")); //$NON-NLS-1$
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
				"_UI_RedefinableTemplateSignature_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(RedefinableTemplateSignature.class)) {
			case UMLPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER :
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
			UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
			UMLFactory.eINSTANCE.createTemplateParameter()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
			UMLFactory.eINSTANCE.createConnectableElementTemplateParameter()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
			UMLFactory.eINSTANCE.createOperationTemplateParameter()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER,
			UMLFactory.eINSTANCE.createClassifierTemplateParameter()));
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER},
				collection, index);
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
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if (feature == UMLPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER},
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
		if (feature == UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER},
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
		if (feature == UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER},
				null, value);
		}
		if (feature == UMLPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}