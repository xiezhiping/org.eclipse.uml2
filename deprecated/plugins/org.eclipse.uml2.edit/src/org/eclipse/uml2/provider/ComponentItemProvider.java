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
 * $Id: ComponentItemProvider.java,v 1.18 2005/03/15 18:48:28 khussey Exp $
 */
package org.eclipse.uml2.provider;

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

import org.eclipse.uml2.Component;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.edit.internal.command.SubsetAddCommand;
import org.eclipse.uml2.edit.internal.command.SubsetReplaceCommand;
import org.eclipse.uml2.edit.internal.command.SupersetRemoveCommand;
import org.eclipse.uml2.edit.internal.command.SupersetReplaceCommand;

import org.eclipse.uml2.edit.internal.provider.UML2ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
	extends ClassItemProvider
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
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addIsIndirectlyInstantiatedPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addProvidedPropertyDescriptor(object);
			addRealizationPropertyDescriptor(object);
			addOwnedMemberPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Indirectly Instantiated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIndirectlyInstantiatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new UML2ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_isIndirectlyInstantiated_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_isIndirectlyInstantiated_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getComponent_IsIndirectlyInstantiated(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new UML2ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_required_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_required_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getComponent_Required(),
				 false,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Provided feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new UML2ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_provided_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_provided_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getComponent_Provided(),
				 false,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new UML2ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_realization_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_realization_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getComponent_Realization(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
	}

	/**
	 * This adds a property descriptor for the Owned Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new UML2ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_ownedMember_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_ownedMember_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 true,
				 null,
				 new String[] {"org.eclipse.ui.views.properties.expert"})); //$NON-NLS-1$
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
			childrenFeatures.add(UML2Package.eINSTANCE.getComponent_Realization());
			childrenFeatures.add(UML2Package.eINSTANCE.getComponent_OwnedMember());
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Component"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") : //$NON-NLS-1$
			getString("_UI_Component_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Component.class)) {
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UML2Package.COMPONENT__REALIZATION:
			case UML2Package.COMPONENT__OWNED_MEMBER:
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
				(UML2Package.eINSTANCE.getComponent_Realization(),
				 UML2Factory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_Realization(),
				 UML2Factory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_Realization(),
				 UML2Factory.eINSTANCE.createImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createPermission()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createPrimitiveFunction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.eINSTANCE.getComponent_OwnedMember(),
				 UML2Factory.eINSTANCE.createDeploymentSpecification()));
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
			childFeature == UML2Package.eINSTANCE.getNamespace_OwnedRule() ||
			childFeature == UML2Package.eINSTANCE.getComponent_OwnedMember() ||
			childFeature == UML2Package.eINSTANCE.getClassifier_Substitution() ||
			childFeature == UML2Package.eINSTANCE.getComponent_Realization() ||
			childFeature == UML2Package.eINSTANCE.getClassifier_OwnedUseCase() ||
			childFeature == UML2Package.eINSTANCE.getClass_NestedClassifier() ||
			childFeature == UML2Package.eINSTANCE.getBehavioredClassifier_OwnedBehavior() ||
			childFeature == UML2Package.eINSTANCE.getBehavioredClassifier_OwnedStateMachine() ||
			childFeature == UML2Package.eINSTANCE.getBehavioredClassifier_Implementation() ||
			childFeature == UML2Package.eINSTANCE.getStructuredClassifier_OwnedAttribute() ||
			childFeature == UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort();

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


	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection collection, int index) {
		if (feature == UML2Package.eINSTANCE.getComponent_Realization()) {
			return new SubsetAddCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getNamedElement_ClientDependency()}, collection, index);
		}
		return super.createAddCommand(domain, owner, feature, collection, index);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection collection) {
		if (feature == UML2Package.eINSTANCE.getNamedElement_ClientDependency()) {
			return new SupersetRemoveCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getClassifier_Substitution(), UML2Package.eINSTANCE.getBehavioredClassifier_Implementation(), UML2Package.eINSTANCE.getComponent_Realization()}, collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createReplaceCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, EObject value, Collection collection) {
		if (feature == UML2Package.eINSTANCE.getComponent_Realization()) {
			return new SubsetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getNamedElement_ClientDependency()}, value, collection);
		}
		if (feature == UML2Package.eINSTANCE.getNamedElement_ClientDependency()) {
			return new SupersetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.eINSTANCE.getClassifier_Substitution(), UML2Package.eINSTANCE.getBehavioredClassifier_Implementation(), UML2Package.eINSTANCE.getComponent_Realization()}, value, collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value, collection);
	}
}
