/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ValuePinItemProvider.java,v 1.5 2006/05/15 20:57:53 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

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

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValuePin;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.ValuePin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuePinItemProvider
		extends InputPinItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePinItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ValuePin_value_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ValuePin_value_feature", "_UI_ValuePin_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.VALUE_PIN__VALUE, true, false, true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
			childrenFeatures.add(UMLPackage.Literals.VALUE_PIN__VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * This returns ValuePin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
			"full/obj16/ValuePin")); //$NON-NLS-1$
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
				"_UI_ValuePin_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(ValuePin.class)) {
			case UMLPackage.VALUE_PIN__VALUE :
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
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.VALUE_PIN__VALUE, UMLFactory.eINSTANCE
				.createTimeInterval()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION
			|| childFeature == UMLPackage.Literals.OBJECT_NODE__UPPER_BOUND
			|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE
			|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE
			|| childFeature == UMLPackage.Literals.VALUE_PIN__VALUE;

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

}
