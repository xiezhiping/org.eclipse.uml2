/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation, 204200
 *   Kenn Hussey (Embarcadero Technologies) - 205188, 215418
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 418466, 414970, 370089
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.SequenceNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceNodeItemProvider
		extends StructuredActivityNodeItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceNodeItemProvider(AdapterFactory adapterFactory) {
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

			addExecutableNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Executable Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutableNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SequenceNode_executableNode_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_SequenceNode_executableNode_feature", "_UI_SequenceNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE, true,
				false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
				.remove(UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE);
			childrenFeatures
				.add(UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE);
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
	 * This returns SequenceNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/SequenceNode")); //$NON-NLS-1$
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
				"_UI_SequenceNode_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(SequenceNode.class)) {
			case UMLPackage.SEQUENCE_NODE__EXECUTABLE_NODE :
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
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		for (Iterator<Object> childDescriptorIterator = newChildDescriptors
			.iterator(); childDescriptorIterator.hasNext();) {
			Object commandParameter = childDescriptorIterator.next();

			if (commandParameter instanceof CommandParameter) {

				if (((CommandParameter) commandParameter).feature
					.equals(UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE)) {
					childDescriptorIterator.remove();
				}
			}
		}

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE,
			UMLFactory.eINSTANCE.createExpansionRegion()));
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

		boolean qualify = childFeature == UMLPackage.Literals.ACTION__LOCAL_POSTCONDITION
			|| childFeature == UMLPackage.Literals.ACTION__LOCAL_PRECONDITION
			|| childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
			|| childFeature == UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT
			|| childFeature == UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE__NODE
			|| childFeature == UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT
			|| childFeature == UMLPackage.Literals.SEQUENCE_NODE__EXECUTABLE_NODE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}