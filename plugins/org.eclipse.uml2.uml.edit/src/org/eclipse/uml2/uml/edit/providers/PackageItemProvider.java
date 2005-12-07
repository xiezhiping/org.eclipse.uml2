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
 * $Id: PackageItemProvider.java,v 1.1 2005/12/07 14:20:28 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

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
				UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
				true, null, null, null));
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
				UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER,
				true, null, null,
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
				UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING,
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
				UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
				true, null, null,
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
				UMLPackage.Literals.PACKAGE__PACKAGE_MERGE, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
				UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, true, null,
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
				UMLPackage.Literals.PACKAGE__OWNED_TYPE, true, null, null,
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
				UMLPackage.Literals.PACKAGE__NESTED_PACKAGE, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
				UMLPackage.Literals.PACKAGE__NESTING_PACKAGE, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
				UMLPackage.Literals.PACKAGE__APPLIED_PROFILE, true, null, null,
				null));
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
			childrenFeatures
				.add(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
			childrenFeatures
				.add(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
			childrenFeatures.add(UMLPackage.Literals.PACKAGE__PACKAGE_MERGE);
			childrenFeatures.add(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT);
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

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING,
			UMLFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
			UMLFactory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
			UMLFactory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGE_MERGE, UMLFactory.eINSTANCE
				.createPackageMerge()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDependency()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createPackage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createProfile()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createAbstraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createSubstitution()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDeployment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createManifestation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createUsage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createExecutionEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createCreationEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDestructionEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createSendOperationEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createSendSignalEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createCallEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createModel()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
				.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, UMLFactory.eINSTANCE
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION
			|| childFeature == UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT
			|| childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE;

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
		if (feature == UMLPackage.Literals.PACKAGE__APPLIED_PROFILE) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT},
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
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection collection) {
		if (feature == UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PACKAGE__APPLIED_PROFILE},
				collection);
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
		if (feature == UMLPackage.Literals.PACKAGE__APPLIED_PROFILE) {
			return new SubsetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT},
				value, collection);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT) {
			return new SupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PACKAGE__APPLIED_PROFILE},
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
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		if (feature == UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER) {
			return new SubsetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER},
				value);
		}
		if (feature == UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER) {
			return new SupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
