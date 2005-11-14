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
 * $Id: PackageItemProvider.java,v 1.1 2005/11/14 22:11:34 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.provider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.common.edit.command.SupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SupersetSetCommand;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
		extends NamespaceItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addTemplateParameterPropertyDescriptor(object);
			addOwningTemplateParameterPropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
			addOwnedTemplateSignaturePropertyDescriptor(object);
			addPackageMergePropertyDescriptor(object);
			addPackagedElementPropertyDescriptor(object);
			addOwnedTypePropertyDescriptor(object);
			addNestedPackagePropertyDescriptor(object);
			addNestingPackagePropertyDescriptor(object);
			addAppliedProfilePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Template Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ParameterableElement_templateParameter_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ParameterableElement_templateParameter_feature", "_UI_ParameterableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE
					.getParameterableElement_TemplateParameter(), true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Owning Template Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningTemplateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ParameterableElement_owningTemplateParameter_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_ParameterableElement_owningTemplateParameter_feature", "_UI_ParameterableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE
					.getParameterableElement_OwningTemplateParameter(), true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Template Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateableElement_templateBinding_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateableElement_templateBinding_feature", "_UI_TemplateableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getTemplateableElement_TemplateBinding(),
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Template Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedTemplateSignaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TemplateableElement_ownedTemplateSignature_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TemplateableElement_ownedTemplateSignature_feature", "_UI_TemplateableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE
					.getTemplateableElement_OwnedTemplateSignature(), true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Package Merge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageMergePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_packageMerge_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_packageMerge_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getPackage_PackageMerge(), true, null,
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
				getString("_UI_Package_packagedElement_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_packagedElement_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getPackage_PackagedElement(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_ownedType_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_ownedType_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getPackage_OwnedType(), true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Nested Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_nestedPackage_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_nestedPackage_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getPackage_NestedPackage(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Nesting Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestingPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_nestingPackage_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_nestingPackage_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getPackage_NestingPackage(), true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Applied Profile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedProfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_appliedProfile_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_appliedProfile_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getPackage_AppliedProfile(), true, null,
				null, null));
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
				.getTemplateableElement_TemplateBinding());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getTemplateableElement_OwnedTemplateSignature());
			childrenFeatures
				.add(UMLPackage.eINSTANCE.getPackage_PackageMerge());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getPackage_PackagedElement());
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Package"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((org.eclipse.uml2.uml.Package) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_Package_type") : //$NON-NLS-1$
			getString("_UI_Package_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(org.eclipse.uml2.uml.Package.class)) {
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
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
			.getTemplateableElement_TemplateBinding(), UMLFactory.eINSTANCE
			.createTemplateBinding()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateableElement_OwnedTemplateSignature(),
			UMLFactory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getTemplateableElement_OwnedTemplateSignature(),
			UMLFactory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackageMerge(), UMLFactory.eINSTANCE
			.createPackageMerge()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDependency()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getPackage_PackagedElement(), UMLFactory.eINSTANCE
				.createPackage()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getPackage_PackagedElement(), UMLFactory.eINSTANCE
				.createProfile()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createStereotype()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createGeneralizationSet()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getPackage_PackagedElement(), UMLFactory.eINSTANCE
				.createUseCase()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createAbstraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createSubstitution()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDeployment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createArtifact()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createManifestation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDataType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInterface()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getPackage_PackagedElement(), UMLFactory.eINSTANCE
				.createSignal()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createCollaboration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createExtension()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createEnumeration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInteraction()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createActivity()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createExecutionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createCreationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDestructionEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createSendOperationEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createSendSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createCallEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInformationItem()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createComponent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.eINSTANCE
				.getPackage_PackagedElement(), UMLFactory.eINSTANCE
				.createDevice()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getPackage_PackagedElement(), UMLFactory.eINSTANCE
			.createAssociationClass()));
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
				.getPackage_PackagedElement()
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

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection, int index) {
		if (feature == UMLPackage.eINSTANCE.getPackage_AppliedProfile()) {
			return new SubsetAddCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getNamespace_PackageImport()}, collection, index);
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
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection) {
		if (feature == UMLPackage.eINSTANCE.getNamespace_PackageImport()) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getPackage_AppliedProfile()}, collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EObject value, Collection collection) {
		if (feature == UMLPackage.eINSTANCE.getPackage_AppliedProfile()) {
			return new SubsetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getNamespace_PackageImport()}, value, collection);
		}
		if (feature == UMLPackage.eINSTANCE.getNamespace_PackageImport()) {
			return new SupersetReplaceCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getPackage_AppliedProfile()}, value, collection);
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
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.eINSTANCE
			.getParameterableElement_OwningTemplateParameter()) {
			return new SubsetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getParameterableElement_TemplateParameter()}, value);
		}
		if (feature == UMLPackage.eINSTANCE
			.getParameterableElement_TemplateParameter()) {
			return new SupersetSetCommand(domain, owner, feature,
				new EStructuralFeature[]{UMLPackage.eINSTANCE
					.getParameterableElement_OwningTemplateParameter()}, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
