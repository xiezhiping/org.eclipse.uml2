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
 * $Id: ActionInputPinItemProvider.java,v 1.1 2005/11/14 22:11:35 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.provider;

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

import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.ActionInputPin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionInputPinItemProvider
		extends InputPinItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInputPinItemProvider(AdapterFactory adapterFactory) {
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

			addFromActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the From Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActionInputPin_fromAction_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ActionInputPin_fromAction_feature", "_UI_ActionInputPin_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActionInputPin_FromAction(), true,
				null, null,
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
				.getActionInputPin_FromAction());
		}
		return childrenFeatures;
	}

	/**
	 * This returns ActionInputPin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/ActionInputPin"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ActionInputPin) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_ActionInputPin_type") : //$NON-NLS-1$
			getString("_UI_ActionInputPin_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ActionInputPin.class)) {
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
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
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createCreateObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createDestroyObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createTestIdentityAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadSelfAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createClearStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadLinkAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createCreateLinkAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createDestroyLinkAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createClearAssociationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createBroadcastSignalAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createSendObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createValueSpecificationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createTimeObservationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createDurationObservationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createOpaqueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createSendSignalAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createCallOperationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createCallBehaviorAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadVariableAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createClearVariableAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createAddVariableValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createRemoveVariableValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createRaiseExceptionAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadExtentAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReclassifyObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createStartClassifierBehaviorAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadLinkObjectEndAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createCreateLinkObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createAcceptEventAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createAcceptCallAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createReplyAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createUnmarshallAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createLoopNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActionInputPin_FromAction(), UMLFactory.eINSTANCE
			.createExpansionRegion()));
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
			.getNamedElement_NameExpression()
			|| childFeature == UMLPackage.eINSTANCE.getObjectNode_UpperBound();

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
