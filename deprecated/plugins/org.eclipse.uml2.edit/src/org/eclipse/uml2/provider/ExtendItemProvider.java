/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.Extend;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Extend} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendItemProvider
	extends NamedElementItemProvider
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
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendItemProvider(AdapterFactory adapterFactory) {
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

			addRelatedElementPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addExtendedCasePropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
			addExtensionLocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Related Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Relationship_relatedElement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Relationship_relatedElement_feature", "_UI_Relationship_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getRelationship_RelatedElement(),
				 false));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_DirectedRelationship_source_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedRelationship_source_feature", "_UI_DirectedRelationship_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getDirectedRelationship_Source(),
				 false));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_DirectedRelationship_target_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedRelationship_target_feature", "_UI_DirectedRelationship_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getDirectedRelationship_Target(),
				 false));
	}

	/**
	 * This adds a property descriptor for the Extended Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Extend_extendedCase_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Extend_extendedCase_feature", "_UI_Extend_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getExtend_ExtendedCase(),
				 true));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Extend_condition_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Extend_condition_feature", "_UI_Extend_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getExtend_Condition(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Extension Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Extend_extensionLocation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Extend_extensionLocation_feature", "_UI_Extend_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getExtend_ExtensionLocation(),
				 true));
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
			childrenFeatures.add(UML2Package.eINSTANCE.getExtend_Condition());
		}
		return childrenFeatures;
	}


	/**
	 * This returns Extend.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Extend"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Extend)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Extend_type") : //$NON-NLS-1$
			getString("_UI_Extend_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Extend.class)) {
			case UML2Package.EXTEND__CONDITION:
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
				(UML2Package.eINSTANCE.getExtend_Condition(),
				 UML2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getExtend_Condition(),
				 UML2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getExtend_Condition(),
				 UML2Factory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getExtend_Condition(),
				 UML2Factory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getExtend_Condition(),
				 UML2Factory.eINSTANCE.createDurationConstraint()));
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
}
