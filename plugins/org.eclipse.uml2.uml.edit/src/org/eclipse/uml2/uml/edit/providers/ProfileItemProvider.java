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

import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Profile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileItemProvider
		extends PackageItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileItemProvider(AdapterFactory adapterFactory) {
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

			addMetaclassReferencePropertyDescriptor(object);
			addMetamodelReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Metaclass Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaclassReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Profile_metaclassReference_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Profile_metaclassReference_feature", "_UI_Profile_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PROFILE__METACLASS_REFERENCE, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Metamodel Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetamodelReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Profile_metamodelReference_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Profile_metamodelReference_feature", "_UI_Profile_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE, true, false,
				true, null, null, null));
	}

	/**
	 * This returns Profile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Profile")); //$NON-NLS-1$
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
				"_UI_Profile_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Profile.class)) {
			case UMLPackage.PROFILE__METACLASS_REFERENCE :
			case UMLPackage.PROFILE__METAMODEL_REFERENCE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
			UMLPackage.Literals.PROFILE__METACLASS_REFERENCE,
			UMLFactory.eINSTANCE.createElementImport()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE,
			UMLFactory.eINSTANCE.createPackageImport()));
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
			|| childFeature == UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT
			|| childFeature == UMLPackage.Literals.PROFILE__METACLASS_REFERENCE
			|| childFeature == UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT
			|| childFeature == UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE
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
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == UMLPackage.Literals.PROFILE__METACLASS_REFERENCE) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT},
				collection, index);
		}
		if (feature == UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE) {
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
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if (feature == UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PROFILE__METACLASS_REFERENCE},
				collection);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE},
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
		if (feature == UMLPackage.Literals.PROFILE__METACLASS_REFERENCE) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.PROFILE__METACLASS_REFERENCE},
				value, collection);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE},
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
		if (feature == UMLPackage.Literals.PROFILE__METACLASS_REFERENCE) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT},
				null, value);
		}
		if (feature == UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT},
				null, value);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.PROFILE__METACLASS_REFERENCE},
				value);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.PROFILE__METAMODEL_REFERENCE},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}