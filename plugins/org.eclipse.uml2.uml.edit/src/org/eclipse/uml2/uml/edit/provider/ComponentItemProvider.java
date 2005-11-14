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
 * $Id: ComponentItemProvider.java,v 1.1 2005/11/14 22:11:35 khussey Exp $
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

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
		extends ClassItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

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
			addPackagedElementPropertyDescriptor(object);
			addRealizationPropertyDescriptor(object);
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
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Component_isIndirectlyInstantiated_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Component_isIndirectlyInstantiated_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getComponent_IsIndirectlyInstantiated(),
				true, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Component_required_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Component_required_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getComponent_Required(), false, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Provided feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Component_provided_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Component_provided_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getComponent_Provided(), false, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Packaged Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Component_packagedElement_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Component_packagedElement_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getComponent_PackagedElement(), true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Component_realization_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Component_realization_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getComponent_Realization(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
				.getComponent_PackagedElement());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getComponent_Realization());
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
		String label = ((Component) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_Component_type") : //$NON-NLS-1$
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
			case UMLPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.COMPONENT__PACKAGED_ELEMENT :
			case UMLPackage.COMPONENT__REALIZATION :
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
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDependency()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createPackage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createProfile()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getComponent_PackagedElement(), UMLFactory.eINSTANCE
				.createClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createStereotype()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createUseCase()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createAbstraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createSubstitution()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDeployment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createArtifact()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createManifestation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDataType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createSignal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createCollaboration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createExtension()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createEnumeration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createFunctionBehavior()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getComponent_PackagedElement(), UMLFactory.eINSTANCE
				.createActor()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getComponent_PackagedElement(), UMLFactory.eINSTANCE
				.createUsage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInteraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createActivity()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createExecutionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createCreationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDestructionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createSendOperationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createSendSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createCallEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInformationItem()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createInformationFlow()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getComponent_PackagedElement(), UMLFactory.eINSTANCE
				.createModel()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createComponent()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getComponent_PackagedElement(), UMLFactory.eINSTANCE
				.createNode()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createDevice()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_PackagedElement(), UMLFactory.eINSTANCE
			.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getComponent_Realization(), UMLFactory.eINSTANCE
			.createComponentRealization()));
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
			.getNamedElement_NameExpression()
			|| childFeature == UMLPackage.eINSTANCE
				.getComponent_PackagedElement()
			|| childFeature == UMLPackage.eINSTANCE.getNamespace_OwnedRule()
			|| childFeature == UMLPackage.eINSTANCE
				.getTemplateableElement_OwnedTemplateSignature()
			|| childFeature == UMLPackage.eINSTANCE
				.getClassifier_OwnedSignature()
			|| childFeature == UMLPackage.eINSTANCE
				.getClassifier_OwnedUseCase()
			|| childFeature == UMLPackage.eINSTANCE.getClass_NestedClassifier()
			|| childFeature == UMLPackage.eINSTANCE
				.getClassifier_Substitution()
			|| childFeature == UMLPackage.eINSTANCE
				.getBehavioredClassifier_OwnedBehavior()
			|| childFeature == UMLPackage.eINSTANCE
				.getBehavioredClassifier_InterfaceRealization()
			|| childFeature == UMLPackage.eINSTANCE.getComponent_Realization();

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
