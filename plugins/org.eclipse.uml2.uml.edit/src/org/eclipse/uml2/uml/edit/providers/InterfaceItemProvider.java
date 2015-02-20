/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188, 215418, 204200
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 414970, 370089, 459723
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Interface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceItemProvider
		extends ClassifierItemProvider {

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
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNestedClassifierPropertyDescriptor(object);
			addOwnedAttributePropertyDescriptor(object);
			addOwnedReceptionPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addRedefinedInterfacePropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
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
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interface_ownedAttribute_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interface_ownedAttribute_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Nested Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interface_nestedClassifier_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interface_nestedClassifier_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Redefined Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interface_redefinedInterface_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interface_redefinedInterface_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Reception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedReceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interface_ownedReception_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interface_ownedReception_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERFACE__OWNED_RECEPTION, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interface_protocol_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interface_protocol_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERFACE__PROTOCOL, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interface_ownedOperation_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interface_ownedOperation_feature", "_UI_Interface_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERFACE__OWNED_OPERATION, true, false,
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
				.add(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER);
			childrenFeatures
				.add(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE);
			childrenFeatures
				.add(UMLPackage.Literals.INTERFACE__OWNED_RECEPTION);
			childrenFeatures.add(UMLPackage.Literals.INTERFACE__PROTOCOL);
			childrenFeatures
				.add(UMLPackage.Literals.INTERFACE__OWNED_OPERATION);
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
	 * This returns Interface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Interface")); //$NON-NLS-1$
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
				"_UI_Interface_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Interface.class)) {
			case UMLPackage.INTERFACE__NESTED_CLASSIFIER :
			case UMLPackage.INTERFACE__OWNED_ATTRIBUTE :
			case UMLPackage.INTERFACE__OWNED_RECEPTION :
			case UMLPackage.INTERFACE__PROTOCOL :
			case UMLPackage.INTERFACE__OWNED_OPERATION :
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
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
			UMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
			UMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
			UMLFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__OWNED_RECEPTION,
			UMLFactory.eINSTANCE.createReception()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__PROTOCOL,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
			UMLFactory.eINSTANCE.createOperation()));
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

		boolean qualify = childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE
			|| childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION
			|| childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE
			|| childFeature == UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER
			|| childFeature == UMLPackage.Literals.INTERFACE__PROTOCOL;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER},
				collection, index);
		}
		return super
			.createAddCommand(domain, owner, feature, collection, index);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if (feature == UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE},
				collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, Collection<?> collection) {
		if (feature == UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE},
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
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER},
				null, value);
		}
		if (feature == UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}