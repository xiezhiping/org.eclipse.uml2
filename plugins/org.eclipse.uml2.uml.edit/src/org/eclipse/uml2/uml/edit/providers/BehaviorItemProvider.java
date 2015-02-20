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
 *   Kenn Hussey - 296008, 323181
 *   Kenn Hussey (CEA) - 327039, 418466, 414970, 370089, 459723
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

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Behavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorItemProvider
		extends ClassItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItemProvider(AdapterFactory adapterFactory) {
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

			addSpecificationPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addIsReentrantPropertyDescriptor(object);
			addOwnedParameterPropertyDescriptor(object);
			addOwnedParameterSetPropertyDescriptor(object);
			addPostconditionPropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
			addRedefinedBehaviorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Reentrant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReentrantPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_isReentrant_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_isReentrant_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__IS_REENTRANT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_ownedParameter_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_ownedParameter_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__OWNED_PARAMETER, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Parameter Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedParameterSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_ownedParameterSet_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_ownedParameterSet_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__OWNED_PARAMETER_SET, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Postcondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_postcondition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_postcondition_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__POSTCONDITION, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_precondition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_precondition_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__PRECONDITION, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Redefined Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_redefinedBehavior_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_redefinedBehavior_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__REDEFINED_BEHAVIOR, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_context_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_context_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__CONTEXT, false, false, false,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Behavior_specification_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Behavior_specification_feature", "_UI_Behavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.BEHAVIOR__SPECIFICATION, true, false, true,
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
			childrenFeatures.add(UMLPackage.Literals.BEHAVIOR__OWNED_PARAMETER);
			childrenFeatures
				.add(UMLPackage.Literals.BEHAVIOR__OWNED_PARAMETER_SET);
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Behavior) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_Behavior_type") : //$NON-NLS-1$
			getString("_UI_Behavior_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Behavior.class)) {
			case UMLPackage.BEHAVIOR__IS_REENTRANT :
			case UMLPackage.BEHAVIOR__POSTCONDITION :
			case UMLPackage.BEHAVIOR__PRECONDITION :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER :
			case UMLPackage.BEHAVIOR__OWNED_PARAMETER_SET :
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
			UMLPackage.Literals.BEHAVIOR__OWNED_PARAMETER,
			UMLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__OWNED_PARAMETER_SET,
			UMLFactory.eINSTANCE.createParameterSet()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__PRECONDITION,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__PRECONDITION,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__PRECONDITION,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__PRECONDITION,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.BEHAVIOR__PRECONDITION,
			UMLFactory.eINSTANCE.createTimeConstraint()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
			|| childFeature == UMLPackage.Literals.BEHAVIOR__POSTCONDITION
			|| childFeature == UMLPackage.Literals.BEHAVIOR__PRECONDITION
			|| childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE
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
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == UMLPackage.Literals.BEHAVIOR__POSTCONDITION) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				collection, index);
		}
		if (feature == UMLPackage.Literals.BEHAVIOR__PRECONDITION) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				collection, index);
		}
		if (feature == UMLPackage.Literals.BEHAVIOR__REDEFINED_BEHAVIOR) {
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
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{
					UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
					UMLPackage.Literals.BEHAVIOR__PRECONDITION}, collection);
		}
		if (feature == UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIOR__REDEFINED_BEHAVIOR},
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
		if (feature == UMLPackage.Literals.BEHAVIOR__POSTCONDITION) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.BEHAVIOR__PRECONDITION) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.BEHAVIOR__REDEFINED_BEHAVIOR) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature,
				null, new EStructuralFeature[]{
					UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
					UMLPackage.Literals.BEHAVIOR__PRECONDITION}, value,
				collection);
		}
		if (feature == UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIOR__REDEFINED_BEHAVIOR},
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
		if (feature == UMLPackage.Literals.BEHAVIOR__POSTCONDITION) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value);
		}
		if (feature == UMLPackage.Literals.BEHAVIOR__PRECONDITION) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value);
		}
		if (feature == UMLPackage.Literals.BEHAVIOR__REDEFINED_BEHAVIOR) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER},
				null, value);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SubsetSupersetSetCommand(domain, owner, feature, null,
				new EStructuralFeature[]{
					UMLPackage.Literals.BEHAVIOR__POSTCONDITION,
					UMLPackage.Literals.BEHAVIOR__PRECONDITION}, value);
		}
		if (feature == UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.BEHAVIOR__REDEFINED_BEHAVIOR},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}