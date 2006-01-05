/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InstanceSpecificationItemProvider.java,v 1.15 2006/01/05 13:53:30 khussey Exp $
 */
package org.eclipse.uml2.provider;

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

import org.eclipse.uml2.InstanceSpecification;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.InstanceSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceSpecificationItemProvider
	extends PackageableElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addDeploymentPropertyDescriptor(object);
			addDeployedElementPropertyDescriptor(object);
			addSlotPropertyDescriptor(object);
			addClassifierPropertyDescriptor(object);
			addSpecificationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeploymentTarget_deployment_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DeploymentTarget_deployment_feature", "_UI_DeploymentTarget_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYMENT,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Deployed Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeploymentTarget_deployedElement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DeploymentTarget_deployedElement_feature", "_UI_DeploymentTarget_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Slot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlotPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceSpecification_slot_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceSpecification_slot_feature", "_UI_InstanceSpecification_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INSTANCE_SPECIFICATION__SLOT,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceSpecification_classifier_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceSpecification_classifier_feature", "_UI_InstanceSpecification_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INSTANCE_SPECIFICATION__CLASSIFIER,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InstanceSpecification_specification_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InstanceSpecification_specification_feature", "_UI_InstanceSpecification_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
			childrenFeatures.add(UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYMENT);
			childrenFeatures.add(UML2Package.Literals.INSTANCE_SPECIFICATION__SLOT);
			childrenFeatures.add(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION);
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
	 * This returns InstanceSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/InstanceSpecification"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getText(Object object) {
		return appendLabel(
			appendType(appendKeywords(new StringBuffer(), object),
				"_UI_InstanceSpecification_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(InstanceSpecification.class)) {
			case UML2Package.INSTANCE_SPECIFICATION__DEPLOYMENT:
			case UML2Package.INSTANCE_SPECIFICATION__SLOT:
			case UML2Package.INSTANCE_SPECIFICATION__SPECIFICATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYMENT,
				 UML2Factory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SLOT,
				 UML2Factory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INSTANCE_SPECIFICATION__SPECIFICATION,
				 UML2Factory.eINSTANCE.createTimeInterval()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return UML2EditPlugin.INSTANCE;
	}


	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection collection, int index) {
		if (feature == UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYMENT) {
			return new SubsetAddCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY}, collection, index);
		}
		return super.createAddCommand(domain, owner, feature, collection, index);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection collection) {
		if (feature == UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY) {
			return new SupersetRemoveCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYMENT}, collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createReplaceCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, EObject value, Collection collection) {
		if (feature == UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYMENT) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY}, null, value, collection);
		}
		if (feature == UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, null, new EStructuralFeature[] {UML2Package.Literals.DEPLOYMENT_TARGET__DEPLOYMENT}, value, collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value, collection);
	}

}
