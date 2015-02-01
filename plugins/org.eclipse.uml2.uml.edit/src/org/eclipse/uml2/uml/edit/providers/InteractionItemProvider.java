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
 *   Kenn Hussey - 323181
 *   Kenn Hussey (CEA) - 327039, 418466, 414970, 370089
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Interaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionItemProvider
		extends BehaviorItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionItemProvider(AdapterFactory adapterFactory) {
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

			addCoveredPropertyDescriptor(object);
			addEnclosingOperandPropertyDescriptor(object);
			addEnclosingInteractionPropertyDescriptor(object);
			addGeneralOrderingPropertyDescriptor(object);
			addLifelinePropertyDescriptor(object);
			addFragmentPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addFormalGatePropertyDescriptor(object);
			addMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Covered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_InteractionFragment_covered_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_InteractionFragment_covered_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION_FRAGMENT__COVERED, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the General Ordering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralOrderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_InteractionFragment_generalOrdering_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_InteractionFragment_generalOrdering_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Enclosing Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_InteractionFragment_enclosingInteraction_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingInteraction_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Enclosing Operand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingOperandPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_InteractionFragment_enclosingOperand_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingOperand_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION_FRAGMENT__ENCLOSING_OPERAND,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Lifeline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifelinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interaction_lifeline_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interaction_lifeline_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION__LIFELINE, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Fragment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interaction_fragment_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interaction_fragment_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION__FRAGMENT, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interaction_action_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interaction_action_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION__ACTION, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Formal Gate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalGatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interaction_formalGate_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interaction_formalGate_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION__FORMAL_GATE, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Interaction_message_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Interaction_message_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.INTERACTION__MESSAGE, true, false, true,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
				.add(UMLPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING);
			childrenFeatures.add(UMLPackage.Literals.INTERACTION__LIFELINE);
			childrenFeatures.add(UMLPackage.Literals.INTERACTION__FRAGMENT);
			childrenFeatures.add(UMLPackage.Literals.INTERACTION__ACTION);
			childrenFeatures.add(UMLPackage.Literals.INTERACTION__FORMAL_GATE);
			childrenFeatures.add(UMLPackage.Literals.INTERACTION__MESSAGE);
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
	 * This returns Interaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Interaction")); //$NON-NLS-1$
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
				"_UI_Interaction_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Interaction.class)) {
			case UMLPackage.INTERACTION__GENERAL_ORDERING :
			case UMLPackage.INTERACTION__LIFELINE :
			case UMLPackage.INTERACTION__FRAGMENT :
			case UMLPackage.INTERACTION__ACTION :
			case UMLPackage.INTERACTION__FORMAL_GATE :
			case UMLPackage.INTERACTION__MESSAGE :
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
			UMLPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
			UMLFactory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__LIFELINE,
			UMLFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createContinuation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createDestructionOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FRAGMENT,
			UMLFactory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__ACTION,
			UMLFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__FORMAL_GATE,
			UMLFactory.eINSTANCE.createGate()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION__MESSAGE,
			UMLFactory.eINSTANCE.createMessage()));
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
			|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR
			|| childFeature == UMLPackage.Literals.INTERACTION__FRAGMENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}