/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CollaborationOccurrenceItemProvider.java,v 1.10 2005/03/15 18:48:27 khussey Exp $
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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.edit.internal.provider.UML2ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.CollaborationOccurrence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationOccurrenceItemProvider
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
	public CollaborationOccurrenceItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addRoleBindingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new UML2ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborationOccurrence_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborationOccurrence_type_feature", "_UI_CollaborationOccurrence_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getCollaborationOccurrence_Type(),
				 true));
	}

	/**
	 * This adds a property descriptor for the Role Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new UML2ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborationOccurrence_roleBinding_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborationOccurrence_roleBinding_feature", "_UI_CollaborationOccurrence_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
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
			childrenFeatures.add(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding());
		}
		return childrenFeatures;
	}

	/**
	 * This returns CollaborationOccurrence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/CollaborationOccurrence"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CollaborationOccurrence)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CollaborationOccurrence_type") : //$NON-NLS-1$
			getString("_UI_CollaborationOccurrence_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(CollaborationOccurrence.class)) {
			case UML2Package.COLLABORATION_OCCURRENCE__ROLE_BINDING:
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
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createPermission()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getCollaborationOccurrence_RoleBinding(),
				 UML2Factory.eINSTANCE.createDeployment()));
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
