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
 * $Id: StructuredActivityNodeItemProvider.java,v 1.1 2005/11/14 22:11:34 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.StructuredActivityNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredActivityNodeItemProvider
		extends ActionItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNodeItemProvider(AdapterFactory adapterFactory) {
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

			addElementImportPropertyDescriptor(object);
			addPackageImportPropertyDescriptor(object);
			addOwnedRulePropertyDescriptor(object);
			addMemberPropertyDescriptor(object);
			addImportedMemberPropertyDescriptor(object);
			addOwnedMemberPropertyDescriptor(object);
			addSubgroupPropertyDescriptor(object);
			addSuperGroupPropertyDescriptor(object);
			addContainedNodePropertyDescriptor(object);
			addInActivityPropertyDescriptor(object);
			addContainedEdgePropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addMustIsolatePropertyDescriptor(object);
			addEdgePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Element Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Namespace_elementImport_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Namespace_elementImport_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getNamespace_ElementImport(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Package Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Namespace_packageImport_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Namespace_packageImport_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getNamespace_PackageImport(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Namespace_ownedRule_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Namespace_ownedRule_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getNamespace_OwnedRule(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Namespace_member_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Namespace_member_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getNamespace_Member(), false, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Imported Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Namespace_importedMember_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Namespace_importedMember_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getNamespace_ImportedMember(), false,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Namespace_ownedMember_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Namespace_ownedMember_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getNamespace_OwnedMember(), false, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Subgroup feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubgroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityGroup_subgroup_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ActivityGroup_subgroup_feature", "_UI_ActivityGroup_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivityGroup_Subgroup(), false, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Super Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityGroup_superGroup_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ActivityGroup_superGroup_feature", "_UI_ActivityGroup_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivityGroup_SuperGroup(), false,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Contained Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityGroup_containedNode_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ActivityGroup_containedNode_feature", "_UI_ActivityGroup_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivityGroup_ContainedNode(), false,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the In Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityGroup_inActivity_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ActivityGroup_inActivity_feature", "_UI_ActivityGroup_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivityGroup_InActivity(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Contained Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActivityGroup_containedEdge_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ActivityGroup_containedEdge_feature", "_UI_ActivityGroup_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getActivityGroup_ContainedEdge(), false,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
				getString("_UI_StructuredActivityNode_variable_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_variable_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getStructuredActivityNode_Variable(),
				true, null, null,
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
				getString("_UI_StructuredActivityNode_node_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_node_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getStructuredActivityNode_Node(), true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Must Isolate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMustIsolatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_StructuredActivityNode_mustIsolate_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_mustIsolate_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getStructuredActivityNode_MustIsolate(),
				true, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
				getString("_UI_StructuredActivityNode_edge_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_edge_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getStructuredActivityNode_Edge(), true,
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
				.getNamespace_ElementImport());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getNamespace_PackageImport());
			childrenFeatures.add(UMLPackage.eINSTANCE.getNamespace_OwnedRule());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getStructuredActivityNode_Variable());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getStructuredActivityNode_Node());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getStructuredActivityNode_Edge());
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
	 * This returns StructuredActivityNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage(
			"full/obj16/StructuredActivityNode"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((StructuredActivityNode) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_StructuredActivityNode_type") : //$NON-NLS-1$
			getString("_UI_StructuredActivityNode_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(StructuredActivityNode.class)) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
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
			.getNamespace_ElementImport(), UMLFactory.eINSTANCE
			.createElementImport()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getNamespace_PackageImport(), UMLFactory.eINSTANCE
			.createPackageImport()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getNamespace_PackageImport(), UMLFactory.eINSTANCE
			.createProfileApplication()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getNamespace_OwnedRule(), UMLFactory.eINSTANCE
				.createConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getNamespace_OwnedRule(), UMLFactory.eINSTANCE
			.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getNamespace_OwnedRule(), UMLFactory.eINSTANCE
			.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getNamespace_OwnedRule(), UMLFactory.eINSTANCE
			.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getNamespace_OwnedRule(), UMLFactory.eINSTANCE
			.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Variable(), UMLFactory.eINSTANCE
			.createVariable()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createStructuredActivityNode()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
				.createPin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createOutputPin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createInputPin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createCreateObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createDestroyObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createTestIdentityAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadSelfAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createClearStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadLinkAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createCreateLinkAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createDestroyLinkAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createClearAssociationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createBroadcastSignalAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createSendObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createValueSpecificationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createTimeObservationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createValuePin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createDurationObservationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createOpaqueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createSendSignalAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createCallOperationAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createCallBehaviorAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadVariableAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createClearVariableAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createAddVariableValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createRemoveVariableValueAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createRaiseExceptionAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createActionInputPin()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadExtentAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReclassifyObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createStartClassifierBehaviorAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadLinkObjectEndAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createCreateLinkObjectAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createAcceptEventAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createAcceptCallAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createReplyAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createUnmarshallAction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createInitialNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createActivityParameterNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createForkNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createFlowFinalNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createCentralBufferNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createMergeNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createDecisionNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createActivityFinalNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createJoinNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createDataStoreNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createLoopNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createExpansionNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Node(), UMLFactory.eINSTANCE
			.createExpansionRegion()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Edge(), UMLFactory.eINSTANCE
			.createActivityEdge()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Edge(), UMLFactory.eINSTANCE
			.createControlFlow()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getStructuredActivityNode_Edge(), UMLFactory.eINSTANCE
			.createObjectFlow()));
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
			.getAction_LocalPrecondition()
			|| childFeature == UMLPackage.eINSTANCE
				.getAction_LocalPostcondition()
			|| childFeature == UMLPackage.eINSTANCE.getNamespace_OwnedRule();

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
