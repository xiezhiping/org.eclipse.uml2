/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ActivityItemProvider.java,v 1.15 2004/06/16 04:12:07 khussey Exp $
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.edit.internal.command.SubsetAddCommand;
import org.eclipse.uml2.edit.internal.command.SubsetReplaceCommand;
import org.eclipse.uml2.edit.internal.command.SupersetRemoveCommand;
import org.eclipse.uml2.edit.internal.command.SupersetReplaceCommand;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider
	extends BehaviorItemProvider
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
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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

			addBodyPropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
			addEdgePropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addStructuredNodePropertyDescriptor(object);
			addIsSingleExecutionPropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_body_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_body_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_Body(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_language_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_language_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_Language(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_edge_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_edge_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_Edge(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_group_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_group_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_Group(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_node_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_node_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_Node(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_isReadOnly_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_isReadOnly_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_IsReadOnly(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
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
			childrenFeatures.add(UML2Package.eINSTANCE.getActivity_Edge());
			childrenFeatures.add(UML2Package.eINSTANCE.getActivity_Group());
			childrenFeatures.add(UML2Package.eINSTANCE.getActivity_Node());
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
	 * This adds a property descriptor for the Is Single Execution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingleExecutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_isSingleExecution_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_isSingleExecution_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_IsSingleExecution(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_action_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_action_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_Action(),
				 true));
	}

	/**
	 * This adds a property descriptor for the Structured Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructuredNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_structuredNode_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_structuredNode_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivity_StructuredNode(),
				 false));
	}

	/**
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Activity"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") : //$NON-NLS-1$
			getString("_UI_Activity_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Activity.class)) {
			case UML2Package.ACTIVITY__BODY:
			case UML2Package.ACTIVITY__LANGUAGE:
			case UML2Package.ACTIVITY__IS_SINGLE_EXECUTION:
			case UML2Package.ACTIVITY__IS_READ_ONLY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UML2Package.ACTIVITY__EDGE:
			case UML2Package.ACTIVITY__GROUP:
			case UML2Package.ACTIVITY__NODE:
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
				(UML2Package.eINSTANCE.getActivity_Edge(),
				 UML2Factory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Edge(),
				 UML2Factory.eINSTANCE.createObjectFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Group(),
				 UML2Factory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Group(),
				 UML2Factory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Group(),
				 UML2Factory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Group(),
				 UML2Factory.eINSTANCE.createActivityPartition()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Group(),
				 UML2Factory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Group(),
				 UML2Factory.eINSTANCE.createInterruptibleActivityRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createApplyFunctionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createTimeObservationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createDurationObservationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createStartOwnedBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getActivity_Node(),
				 UML2Factory.eINSTANCE.createRaiseExceptionAction()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		boolean qualify =
			feature == UML2Package.eINSTANCE.getClassifier_OwnedUseCase() ||
			feature == UML2Package.eINSTANCE.getClass_NestedClassifier() ||
			feature == UML2Package.eINSTANCE.getBehavioredClassifier_OwnedBehavior() ||
			feature == UML2Package.eINSTANCE.getBehavioredClassifier_OwnedStateMachine() ||
			feature == UML2Package.eINSTANCE.getStructuredClassifier_OwnedAttribute() ||
			feature == UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort() ||
			feature == UML2Package.eINSTANCE.getActivity_Group() ||
			feature == UML2Package.eINSTANCE.getActivity_Node();
		return getString(
			qualify ? "_UI_CreateChild_text2" : "_UI_CreateChild_text", //$NON-NLS-1$ //$NON-NLS-2$
			new Object[] { getTypeText(child), getFeatureText(feature), getTypeText(owner) });
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
		if (feature == UML2Package.eINSTANCE.getActivity_Action()) {
			return new SubsetAddCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getActivity_Node()}, collection, index);
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
		if (feature == UML2Package.eINSTANCE.getActivity_Node()) {
			return new SupersetRemoveCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getActivity_Action()}, collection);
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
		if (feature == UML2Package.eINSTANCE.getActivity_Action()) {
			return new SubsetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getActivity_Node()}, value, collection);
		}
		if (feature == UML2Package.eINSTANCE.getActivity_Node()) {
			return new SupersetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getActivity_Action()}, value, collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value, collection);
	}
}
