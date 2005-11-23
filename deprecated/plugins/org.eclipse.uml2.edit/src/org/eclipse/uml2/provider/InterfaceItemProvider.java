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
 * $Id: InterfaceItemProvider.java,v 1.23 2005/11/23 20:02:55 khussey Exp $
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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.Interface;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Interface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceItemProvider
	extends ClassifierItemProvider
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
	public InterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedAttributePropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
			addRedefinedInterfacePropertyDescriptor(object);
			addNestedClassifierPropertyDescriptor(object);
			addOwnedReceptionPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_ownedAttribute_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_ownedAttribute_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_ownedOperation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_ownedOperation_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERFACE__OWNED_OPERATION,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Redefined Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_redefinedInterface_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_redefinedInterface_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERFACE__REDEFINED_INTERFACE,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nested Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_nestedClassifier_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_nestedClassifier_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Reception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedReceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_ownedReception_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_ownedReception_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERFACE__OWNED_RECEPTION,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interface_protocol_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interface_protocol_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERFACE__PROTOCOL,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
			childrenFeatures.add(UML2Package.Literals.INTERFACE__OWNED_ATTRIBUTE);
			childrenFeatures.add(UML2Package.Literals.INTERFACE__OWNED_OPERATION);
			childrenFeatures.add(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER);
			childrenFeatures.add(UML2Package.Literals.INTERFACE__OWNED_RECEPTION);
			childrenFeatures.add(UML2Package.Literals.INTERFACE__PROTOCOL);
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
	 * This returns Interface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Interface"); //$NON-NLS-1$
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
				"_UI_Interface_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Interface.class)) {
			case UML2Package.INTERFACE__OWNED_ATTRIBUTE:
			case UML2Package.INTERFACE__OWNED_OPERATION:
			case UML2Package.INTERFACE__NESTED_CLASSIFIER:
			case UML2Package.INTERFACE__OWNED_RECEPTION:
			case UML2Package.INTERFACE__PROTOCOL:
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
				(UML2Package.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 UML2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 UML2Factory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 UML2Factory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__OWNED_OPERATION,
				 UML2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER,
				 UML2Factory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__OWNED_RECEPTION,
				 UML2Factory.eINSTANCE.createReception()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERFACE__PROTOCOL,
				 UML2Factory.eINSTANCE.createProtocolStateMachine()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UML2Package.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == UML2Package.Literals.INTERFACE__NESTED_CLASSIFIER ||
			childFeature == UML2Package.Literals.INTERFACE__PROTOCOL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
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
		return UML2EditPlugin.INSTANCE;
	}


}
