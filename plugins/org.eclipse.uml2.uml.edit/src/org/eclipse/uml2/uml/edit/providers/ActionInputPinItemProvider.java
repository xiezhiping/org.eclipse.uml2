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
 *   Kenn Hussey (CEA) - 327039, 418466, 414970, 370089
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.ActionInputPin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionInputPinItemProvider
		extends InputPinItemProvider {

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
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
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
				UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION, true, false,
				true, null, null,
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
				.add(UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION);
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
	 * This returns ActionInputPin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/ActionInputPin")); //$NON-NLS-1$
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
		return MultiplicityElementItemProvider.appendMultiplicity(
			appendLabel(
				appendType(appendKeywords(new StringBuffer(), object),
					"_UI_ActionInputPin_type"), object), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(ActionInputPin.class)) {
			case UMLPackage.ACTION_INPUT_PIN__FROM_ACTION :
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
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTION_INPUT_PIN__FROM_ACTION,
			UMLFactory.eINSTANCE.createUnmarshallAction()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION
			|| childFeature == UMLPackage.Literals.OBJECT_NODE__UPPER_BOUND
			|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE
			|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}