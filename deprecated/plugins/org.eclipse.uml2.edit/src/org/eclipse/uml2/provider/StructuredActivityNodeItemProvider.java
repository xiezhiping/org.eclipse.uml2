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
 * $Id: StructuredActivityNodeItemProvider.java,v 1.3 2004/04/14 20:45:54 khussey Exp $
 */
package org.eclipse.uml2.provider;


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

import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.StructuredActivityNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredActivityNodeItemProvider
	extends ActionItemProvider
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

			addMemberPropertyDescriptor(object);
			addOwnedRulePropertyDescriptor(object);
			addImportedMemberPropertyDescriptor(object);
			addElementImportPropertyDescriptor(object);
			addPackageImportPropertyDescriptor(object);
			addSuperGroupPropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
			addContainedNodePropertyDescriptor(object);
			addContainedEdgePropertyDescriptor(object);
			addMustIsolatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Namespace_member_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_member_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getNamespace_Member(),
				 false));
	}

	/**
	 * This adds a property descriptor for the Owned Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Namespace_ownedRule_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_ownedRule_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Imported Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Namespace_importedMember_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_importedMember_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getNamespace_ImportedMember(),
				 false));
	}

	/**
	 * This adds a property descriptor for the Element Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Namespace_elementImport_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_elementImport_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getNamespace_ElementImport(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Package Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_Namespace_packageImport_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_packageImport_feature", "_UI_Namespace_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getNamespace_PackageImport(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Super Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_ActivityGroup_superGroup_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityGroup_superGroup_feature", "_UI_ActivityGroup_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getActivityGroup_SuperGroup(),
				 false));
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_StructuredActivityNode_variable_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_variable_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getStructuredActivityNode_Variable(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Contained Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_StructuredActivityNode_containedNode_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_containedNode_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Contained Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_StructuredActivityNode_containedEdge_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_containedEdge_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getStructuredActivityNode_ContainedEdge(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Must Isolate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMustIsolatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getString("_UI_StructuredActivityNode_mustIsolate_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredActivityNode_mustIsolate_feature", "_UI_StructuredActivityNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getStructuredActivityNode_MustIsolate(),
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
			childrenFeatures.add(UML2Package.eINSTANCE.getNamespace_OwnedRule());
			childrenFeatures.add(UML2Package.eINSTANCE.getNamespace_ElementImport());
			childrenFeatures.add(UML2Package.eINSTANCE.getNamespace_PackageImport());
			childrenFeatures.add(UML2Package.eINSTANCE.getStructuredActivityNode_Variable());
			childrenFeatures.add(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode());
			childrenFeatures.add(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedEdge());
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
		return getResourceLocator().getImage("full/obj16/StructuredActivityNode"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((StructuredActivityNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StructuredActivityNode_type") : //$NON-NLS-1$
			getString("_UI_StructuredActivityNode_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by updating any cached children and by
	 * creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StructuredActivityNode.class)) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
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
				(UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				 UML2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				 UML2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				 UML2Factory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				 UML2Factory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getNamespace_OwnedRule(),
				 UML2Factory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getNamespace_ElementImport(),
				 UML2Factory.eINSTANCE.createElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getNamespace_PackageImport(),
				 UML2Factory.eINSTANCE.createPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getNamespace_PackageImport(),
				 UML2Factory.eINSTANCE.createProfileApplication()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_Variable(),
				 UML2Factory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createApplyFunctionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createStartOwnedBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createTimeObservationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedNode(),
				 UML2Factory.eINSTANCE.createDurationObservationAction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedEdge(),
				 UML2Factory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getStructuredActivityNode_ContainedEdge(),
				 UML2Factory.eINSTANCE.createObjectFlow()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		boolean qualify =
			feature == UML2Package.eINSTANCE.getAction_LocalPrecondition() ||
			feature == UML2Package.eINSTANCE.getAction_LocalPostcondition() ||
			feature == UML2Package.eINSTANCE.getNamespace_OwnedRule();
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
}
