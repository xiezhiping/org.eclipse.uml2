/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LifelineItemProvider.java,v 1.13 2005/05/18 16:40:46 khussey Exp $
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

import org.eclipse.uml2.Lifeline;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Lifeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LifelineItemProvider
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifelineItemProvider(AdapterFactory adapterFactory) {
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

			addCoveredByPropertyDescriptor(object);
			addRepresentsPropertyDescriptor(object);
			addInteractionPropertyDescriptor(object);
			addSelectorPropertyDescriptor(object);
			addDecomposedAsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Covered By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_coveredBy_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_coveredBy_feature", "_UI_Lifeline_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getLifeline_CoveredBy(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Represents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_represents_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_represents_feature", "_UI_Lifeline_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getLifeline_Represents(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_interaction_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_interaction_feature", "_UI_Lifeline_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getLifeline_Interaction(),
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Selector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_selector_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_selector_feature", "_UI_Lifeline_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getLifeline_Selector(),
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Decomposed As feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposedAsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_decomposedAs_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_decomposedAs_feature", "_UI_Lifeline_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getLifeline_DecomposedAs(),
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(UML2Package.eINSTANCE.getLifeline_Selector());
		}
		return childrenFeatures;
	}

	/**
	 * This returns Lifeline.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Lifeline"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Lifeline)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Lifeline_type") : //$NON-NLS-1$
			getString("_UI_Lifeline_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Lifeline.class)) {
			case UML2Package.LIFELINE__SELECTOR:
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
				(UML2Package.eINSTANCE.getLifeline_Selector(),
				 UML2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getLifeline_Selector(),
				 UML2Factory.eINSTANCE.createExpression()));
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
