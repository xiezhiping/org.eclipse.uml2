/*
 * Copyright (c) 2005, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 215418, 204200
 *
 * $Id: ArtifactItemProvider.java,v 1.13 2009/12/02 18:27:49 jbruck Exp $
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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Artifact} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactItemProvider
		extends ClassifierItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactItemProvider(AdapterFactory adapterFactory) {
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

			addFileNamePropertyDescriptor(object);
			addNestedArtifactPropertyDescriptor(object);
			addManifestationPropertyDescriptor(object);
			addOwnedOperationPropertyDescriptor(object);
			addOwnedAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Artifact_fileName_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Artifact_fileName_feature", "_UI_Artifact_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ARTIFACT__FILE_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nested Artifact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNestedArtifactPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Artifact_nestedArtifact_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Artifact_nestedArtifact_feature", "_UI_Artifact_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ARTIFACT__NESTED_ARTIFACT, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Manifestation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManifestationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Artifact_manifestation_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Artifact_manifestation_feature", "_UI_Artifact_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ARTIFACT__MANIFESTATION, true, false, true,
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
				getString("_UI_Artifact_ownedOperation_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Artifact_ownedOperation_feature", "_UI_Artifact_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ARTIFACT__OWNED_OPERATION, true, false,
				true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
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
				getString("_UI_Artifact_ownedAttribute_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Artifact_ownedAttribute_feature", "_UI_Artifact_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ARTIFACT__OWNED_ATTRIBUTE, true, false,
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
			childrenFeatures.add(UMLPackage.Literals.ARTIFACT__NESTED_ARTIFACT);
			childrenFeatures.add(UMLPackage.Literals.ARTIFACT__MANIFESTATION);
			childrenFeatures.add(UMLPackage.Literals.ARTIFACT__OWNED_OPERATION);
			childrenFeatures.add(UMLPackage.Literals.ARTIFACT__OWNED_ATTRIBUTE);
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
	 * This returns Artifact.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
			"full/obj16/Artifact")); //$NON-NLS-1$
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
				"_UI_Artifact_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Artifact.class)) {
			case UMLPackage.ARTIFACT__FILE_NAME :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.ARTIFACT__NESTED_ARTIFACT :
			case UMLPackage.ARTIFACT__MANIFESTATION :
			case UMLPackage.ARTIFACT__OWNED_OPERATION :
			case UMLPackage.ARTIFACT__OWNED_ATTRIBUTE :
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
			UMLPackage.Literals.ARTIFACT__NESTED_ARTIFACT, UMLFactory.eINSTANCE
				.createArtifact()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ARTIFACT__NESTED_ARTIFACT, UMLFactory.eINSTANCE
				.createDeploymentSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ARTIFACT__MANIFESTATION, UMLFactory.eINSTANCE
				.createManifestation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ARTIFACT__OWNED_OPERATION, UMLFactory.eINSTANCE
				.createOperation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ARTIFACT__OWNED_ATTRIBUTE, UMLFactory.eINSTANCE
				.createProperty()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ARTIFACT__OWNED_ATTRIBUTE, UMLFactory.eINSTANCE
				.createPort()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ARTIFACT__OWNED_ATTRIBUTE, UMLFactory.eINSTANCE
				.createExtensionEnd()));
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

		boolean qualify = childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION
			|| childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE;

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
		if (feature == UMLPackage.Literals.ARTIFACT__MANIFESTATION) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY},
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
		if (feature == UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{
					UMLPackage.Literals.CLASSIFIER__SUBSTITUTION,
					UMLPackage.Literals.ARTIFACT__MANIFESTATION}, collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject, java.util.Collection)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createReplaceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EObject value, Collection<?> collection) {
		if (feature == UMLPackage.Literals.ARTIFACT__MANIFESTATION) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature,
				null, new EStructuralFeature[]{
					UMLPackage.Literals.CLASSIFIER__SUBSTITUTION,
					UMLPackage.Literals.ARTIFACT__MANIFESTATION}, value,
				collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value,
			collection);
	}

}