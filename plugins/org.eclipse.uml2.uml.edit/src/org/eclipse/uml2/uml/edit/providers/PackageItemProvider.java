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
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 414970, 370089
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

import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
		extends NamespaceItemProvider {

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
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOwningTemplateParameterPropertyDescriptor(object);
			addTemplateParameterPropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
			addOwnedTemplateSignaturePropertyDescriptor(object);
			addURIPropertyDescriptor(object);
			addNestedPackagePropertyDescriptor(object);
			addNestingPackagePropertyDescriptor(object);
			addOwnedStereotypePropertyDescriptor(object);
			addOwnedTypePropertyDescriptor(object);
			addPackageMergePropertyDescriptor(object);
			addPackagedElementPropertyDescriptor(object);
			addProfileApplicationPropertyDescriptor(object);
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
				true, false, true, null, null, null));
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
				true, false, true, null, null,
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
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_URI_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_URI_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PACKAGE__URI, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
				UMLPackage.Literals.PACKAGE__OWNED_TYPE, true, false, true,
				null, null,
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
				UMLPackage.Literals.PACKAGE__NESTED_PACKAGE, true, false, true,
				null, null,
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
				UMLPackage.Literals.PACKAGE__NESTING_PACKAGE, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Stereotype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedStereotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_ownedStereotype_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_ownedStereotype_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE, true, false,
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
				UMLPackage.Literals.PACKAGE__PACKAGE_MERGE, true, false, true,
				null, null,
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
				UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Profile Application feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProfileApplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Package_profileApplication_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Package_profileApplication_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION, true, false,
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
				.add(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
			childrenFeatures
				.add(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
			childrenFeatures.add(UMLPackage.Literals.PACKAGE__PACKAGE_MERGE);
			childrenFeatures.add(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT);
			childrenFeatures
				.add(UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Package")); //$NON-NLS-1$
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
				"_UI_Package_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(org.eclipse.uml2.uml.Package.class)) {
			case UMLPackage.PACKAGE__URI :
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
			case UMLPackage.PACKAGE__OWNED_STEREOTYPE :
			case UMLPackage.PACKAGE__OWNED_TYPE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
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
			UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING,
			UMLFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
			UMLFactory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE,
			UMLFactory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
			UMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
			UMLFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
			UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__OWNED_TYPE,
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGE_MERGE,
			UMLFactory.eINSTANCE.createPackageMerge()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
			UMLFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION,
			UMLFactory.eINSTANCE.createProfileApplication()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION
			|| childFeature == UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT
			|| childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
			|| childFeature == UMLPackage.Literals.PACKAGE__NESTED_PACKAGE
			|| childFeature == UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE
			|| childFeature == UMLPackage.Literals.PACKAGE__OWNED_TYPE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
		if (feature == UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER},
				null, value);
		}
		if (feature == UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}