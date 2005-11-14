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
 * $Id: ActivityItemProvider.java,v 1.1 2005/11/14 22:11:33 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.provider;

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

import org.eclipse.uml2.common.edit.command.SubsetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.common.edit.command.SupersetReplaceCommand;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider
		extends BehaviorItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

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

			addIsReadOnlyPropertyDescriptor(object);
			addPartitionPropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addIsSingleExecutionPropertyDescriptor(object);
			addStructuredNodePropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addEdgePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_isReadOnly_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_isReadOnly_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_IsReadOnly(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Partition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_partition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_partition_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_Partition(), true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_group_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_group_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_Group(), true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Is Single Execution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingleExecutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_isSingleExecution_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_isSingleExecution_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_IsSingleExecution(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Structured Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructuredNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_structuredNode_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_structuredNode_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_StructuredNode(), false, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_variable_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_variable_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_Variable(), true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_node_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_node_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_Node(), true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Activity_edge_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Activity_edge_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivity_Edge(), true, null, null,
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
			childrenFeatures.add(UMLPackage.eINSTANCE.getActivity_Group());
			childrenFeatures.add(UMLPackage.eINSTANCE.getActivity_Variable());
			childrenFeatures.add(UMLPackage.eINSTANCE.getActivity_Node());
			childrenFeatures.add(UMLPackage.eINSTANCE.getActivity_Edge());
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
		String label = ((Activity) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_Activity_type") : //$NON-NLS-1$
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
			case UMLPackage.ACTIVITY__IS_READ_ONLY :
			case UMLPackage.ACTIVITY__IS_SINGLE_EXECUTION :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.ACTIVITY__GROUP :
			case UMLPackage.ACTIVITY__VARIABLE :
			case UMLPackage.ACTIVITY__NODE :
			case UMLPackage.ACTIVITY__EDGE :
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
			.getActivity_Group(), UMLFactory.eINSTANCE
			.createActivityPartition()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Group(), UMLFactory.eINSTANCE
			.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Group(), UMLFactory.eINSTANCE
			.createInterruptibleActivityRegion()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Group(), UMLFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Group(),
				UMLFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Group(), UMLFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Group(),
				UMLFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Variable(), UMLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createPin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createCreateObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createDestroyObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createTestIdentityAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createReadStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createClearStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createClearAssociationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createBroadcastSignalAction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createValueSpecificationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createTimeObservationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createValuePin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createDurationObservationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createCallOperationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createCallBehaviorAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createReadVariableAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createClearVariableAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createAddVariableValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createRemoveVariableValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createRaiseExceptionAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createActionInputPin()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createReclassifyObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createStartClassifierBehaviorAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createReadLinkObjectEndAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createCreateLinkObjectAction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE
			.createActivityParameterNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE.getActivity_Node(),
				UMLFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Node(), UMLFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Edge(), UMLFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Edge(), UMLFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getActivity_Edge(), UMLFactory.eINSTANCE.createObjectFlow()));
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
			.getTemplateableElement_OwnedTemplateSignature()
			|| childFeature == UMLPackage.eINSTANCE
				.getClassifier_OwnedSignature()
			|| childFeature == UMLPackage.eINSTANCE
				.getClassifier_OwnedUseCase()
			|| childFeature == UMLPackage.eINSTANCE.getClass_NestedClassifier()
			|| childFeature == UMLPackage.eINSTANCE
				.getBehavioredClassifier_OwnedBehavior()
			|| childFeature == UMLPackage.eINSTANCE.getActivity_Group()
			|| childFeature == UMLPackage.eINSTANCE.getActivity_Node();

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

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection) {
		if (feature == UMLPackage.eINSTANCE.getActivity_Group()) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getActivity_Partition()}, collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EObject value, Collection collection) {
		if (feature == UMLPackage.eINSTANCE.getActivity_Group()) {
			return new SupersetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getActivity_Partition()}, value, collection);
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
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.eINSTANCE.getActivity_Partition()) {
			return new SubsetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getActivity_Group()}, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
