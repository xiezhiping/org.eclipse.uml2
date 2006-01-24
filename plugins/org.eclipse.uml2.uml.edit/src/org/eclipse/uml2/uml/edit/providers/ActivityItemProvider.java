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
 * $Id: ActivityItemProvider.java,v 1.11 2006/01/24 22:46:32 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

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

import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
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

			addStructuredNodePropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
			addEdgePropertyDescriptor(object);
			addPartitionPropertyDescriptor(object);
			addIsSingleExecutionPropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
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
				UMLPackage.Literals.ACTIVITY__IS_READ_ONLY, true,
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
				UMLPackage.Literals.ACTIVITY__PARTITION, true, null, null, null));
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
				UMLPackage.Literals.ACTIVITY__GROUP, true, null, null,
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
				UMLPackage.Literals.ACTIVITY__IS_SINGLE_EXECUTION, true,
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
				UMLPackage.Literals.ACTIVITY__STRUCTURED_NODE, false, null,
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
				UMLPackage.Literals.ACTIVITY__VARIABLE, true, null, null,
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
				UMLPackage.Literals.ACTIVITY__NODE, true, null, null,
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
				UMLPackage.Literals.ACTIVITY__EDGE, true, null, null,
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
			childrenFeatures.add(UMLPackage.Literals.ACTIVITY__VARIABLE);
			childrenFeatures.add(UMLPackage.Literals.ACTIVITY__NODE);
			childrenFeatures.add(UMLPackage.Literals.ACTIVITY__EDGE);
			childrenFeatures.add(UMLPackage.Literals.ACTIVITY__GROUP);
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
		return overlayImage(object, getResourceLocator().getImage(
			"full/obj16/Activity")); //$NON-NLS-1$
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
				"_UI_Activity_type"), object).toString(); //$NON-NLS-1$
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
			case UMLPackage.ACTIVITY__VARIABLE :
			case UMLPackage.ACTIVITY__NODE :
			case UMLPackage.ACTIVITY__EDGE :
			case UMLPackage.ACTIVITY__GROUP :
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
			UMLPackage.Literals.ACTIVITY__VARIABLE, UMLFactory.eINSTANCE
				.createVariable()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createOpaqueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createPin()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createOutputPin()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createInputPin()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createValuePin()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createSendSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createCallOperationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createCallBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createInitialNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createActivityParameterNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createForkNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createFlowFinalNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createCentralBufferNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createMergeNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createDecisionNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createActivityFinalNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createCreateObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createDestroyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createTestIdentityAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadSelfAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createClearStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createCreateLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createDestroyLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createClearAssociationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createBroadcastSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createSendObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createValueSpecificationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createClearVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createAddVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createRemoveVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createRaiseExceptionAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createActionInputPin()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadExtentAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReclassifyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createStartClassifierBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadLinkObjectEndAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createCreateLinkObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createAcceptEventAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createAcceptCallAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReplyAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createUnmarshallAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createReduceAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createJoinNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createDataStoreNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createLoopNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createExpansionNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__NODE, UMLFactory.eINSTANCE
				.createExpansionRegion()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__EDGE, UMLFactory.eINSTANCE
				.createControlFlow()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__EDGE, UMLFactory.eINSTANCE
				.createObjectFlow()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__GROUP, UMLFactory.eINSTANCE
				.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__GROUP, UMLFactory.eINSTANCE
				.createActivityPartition()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__GROUP, UMLFactory.eINSTANCE
				.createInterruptibleActivityRegion()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__GROUP, UMLFactory.eINSTANCE
				.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__GROUP, UMLFactory.eINSTANCE
				.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__GROUP, UMLFactory.eINSTANCE
				.createLoopNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ACTIVITY__GROUP, UMLFactory.eINSTANCE
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
			|| childFeature == UMLPackage.Literals.BEHAVIOR__PRECONDITION
			|| childFeature == UMLPackage.Literals.BEHAVIOR__POSTCONDITION
			|| childFeature == UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE
			|| childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_SIGNATURE
			|| childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE
			|| childFeature == UMLPackage.Literals.CLASS__NESTED_CLASSIFIER
			|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR
			|| childFeature == UMLPackage.Literals.ACTIVITY__NODE
			|| childFeature == UMLPackage.Literals.ACTIVITY__GROUP;

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
		if (feature == UMLPackage.Literals.ACTIVITY__GROUP) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.ACTIVITY__PARTITION},
				collection);
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
		if (feature == UMLPackage.Literals.ACTIVITY__GROUP) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.ACTIVITY__PARTITION},
				value, collection);
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
		if (feature == UMLPackage.Literals.ACTIVITY__PARTITION) {
			return new SubsetSupersetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.Literals.ACTIVITY__GROUP},
				null, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
