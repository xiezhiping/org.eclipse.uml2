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
 * $Id: InteractionItemProvider.java,v 1.23 2005/11/23 20:02:55 khussey Exp $
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

import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Interaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionItemProvider
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
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCoveredPropertyDescriptor(object);
			addGeneralOrderingPropertyDescriptor(object);
			addEnclosingInteractionPropertyDescriptor(object);
			addEnclosingOperandPropertyDescriptor(object);
			addLifelinePropertyDescriptor(object);
			addMessagePropertyDescriptor(object);
			addFragmentPropertyDescriptor(object);
			addFormalGatePropertyDescriptor(object);
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
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_covered_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_covered_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION_FRAGMENT__COVERED,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the General Ordering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralOrderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_generalOrdering_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_generalOrdering_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Enclosing Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_enclosingInteraction_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingInteraction_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Enclosing Operand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingOperandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_enclosingOperand_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingOperand_feature", "_UI_InteractionFragment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION_FRAGMENT__ENCLOSING_OPERAND,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Lifeline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifelinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_lifeline_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_lifeline_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION__LIFELINE,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_message_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_message_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION__MESSAGE,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Fragment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_fragment_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_fragment_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION__FRAGMENT,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Formal Gate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalGatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Interaction_formalGate_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Interaction_formalGate_feature", "_UI_Interaction_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.INTERACTION__FORMAL_GATE,
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
			childrenFeatures.add(UML2Package.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING);
			childrenFeatures.add(UML2Package.Literals.INTERACTION__LIFELINE);
			childrenFeatures.add(UML2Package.Literals.INTERACTION__MESSAGE);
			childrenFeatures.add(UML2Package.Literals.INTERACTION__FRAGMENT);
			childrenFeatures.add(UML2Package.Literals.INTERACTION__FORMAL_GATE);
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
	 * This returns Interaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Interaction"); //$NON-NLS-1$
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
				"_UI_Interaction_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Interaction.class)) {
			case UML2Package.INTERACTION__GENERAL_ORDERING:
			case UML2Package.INTERACTION__LIFELINE:
			case UML2Package.INTERACTION__MESSAGE:
			case UML2Package.INTERACTION__FRAGMENT:
			case UML2Package.INTERACTION__FORMAL_GATE:
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
				(UML2Package.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
				 UML2Factory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__LIFELINE,
				 UML2Factory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__MESSAGE,
				 UML2Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createEventOccurrence()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createExecutionOccurrence()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createStop()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createInteractionOccurrence()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FRAGMENT,
				 UML2Factory.eINSTANCE.createContinuation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.INTERACTION__FORMAL_GATE,
				 UML2Factory.eINSTANCE.createGate()));
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
			childFeature == UML2Package.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == UML2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR ||
			childFeature == UML2Package.Literals.INTERACTION__FRAGMENT ||
			childFeature == UML2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE ||
			childFeature == UML2Package.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE ||
			childFeature == UML2Package.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT;

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
