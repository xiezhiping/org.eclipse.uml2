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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider
		extends EncapsulatedClassifierItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItemProvider(AdapterFactory adapterFactory) {
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

			addClassifierBehaviorPropertyDescriptor(object);
			addInterfaceRealizationPropertyDescriptor(object);
			addOwnedBehaviorPropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
			addExtensionPropertyDescriptor(object);
			addIsActivePropertyDescriptor(object);
			addNestedClassifierPropertyDescriptor(object);
			addOwnedReceptionPropertyDescriptor(object);
			addSuperClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_BehavioredClassifier_ownedBehavior_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_ownedBehavior_feature", "_UI_BehavioredClassifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				true, false, true, null, null,
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
				getString("_UI_Class_ownedOperation_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_ownedOperation_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.CLASS__OWNED_OPERATION, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Classifier Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_BehavioredClassifier_classifierBehavior_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_classifierBehavior_feature", "_UI_BehavioredClassifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Interface Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_BehavioredClassifier_interfaceRealization_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_BehavioredClassifier_interfaceRealization_feature", "_UI_BehavioredClassifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_superClass_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_superClass_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.CLASS__SUPER_CLASS, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Is Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_isActive_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_isActive_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.CLASS__IS_ACTIVE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
				getString("_UI_Class_nestedClassifier_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_nestedClassifier_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.CLASS__NESTED_CLASSIFIER, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
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
				getString("_UI_Class_ownedReception_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_ownedReception_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.CLASS__OWNED_RECEPTION, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Class_extension_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Class_extension_feature", "_UI_Class_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.CLASS__EXTENSION, false, false, false,
				null, null, null));
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
				.add(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
			childrenFeatures
				.add(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
			childrenFeatures.add(UMLPackage.Literals.CLASS__OWNED_OPERATION);
			childrenFeatures.add(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER);
			childrenFeatures.add(UMLPackage.Literals.CLASS__OWNED_RECEPTION);
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Class")); //$NON-NLS-1$
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
				"_UI_Class_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(org.eclipse.uml2.uml.Class.class)) {
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR :
			case UMLPackage.CLASS__IS_ACTIVE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.CLASS__INTERFACE_REALIZATION :
			case UMLPackage.CLASS__OWNED_BEHAVIOR :
			case UMLPackage.CLASS__OWNED_OPERATION :
			case UMLPackage.CLASS__NESTED_CLASSIFIER :
			case UMLPackage.CLASS__OWNED_RECEPTION :
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
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__OWNED_OPERATION,
			UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.CLASS__OWNED_RECEPTION,
			UMLFactory.eINSTANCE.createReception()));
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
			|| childFeature == UMLPackage.Literals.CLASS__NESTED_CLASSIFIER
			|| childFeature == UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE
			|| childFeature == UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT
			|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR
			|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR},
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
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR},
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
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR},
				null, value);
		}
		if (feature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}