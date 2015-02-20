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
 *   Kenn Hussey (CEA) - 414970, 370089, 459723
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
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;
import org.eclipse.uml2.common.util.UML2Util;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Substitution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstitutionItemProvider
		extends RealizationItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionItemProvider(AdapterFactory adapterFactory) {
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

			addContractPropertyDescriptor(object);
			addSubstitutingClassifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Contract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContractPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Substitution_contract_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Substitution_contract_feature", "_UI_Substitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.SUBSTITUTION__CONTRACT, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Substituting Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubstitutingClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Substitution_substitutingClassifier_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Substitution_substitutingClassifier_feature", "_UI_Substitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.SUBSTITUTION__SUBSTITUTING_CLASSIFIER,
				true, false, true, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This returns Substitution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Substitution")); //$NON-NLS-1$
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
		StringBuffer text = appendType(
			appendKeywords(new StringBuffer(), object), "_UI_Substitution_type"); //$NON-NLS-1$

		Substitution substitution = (Substitution) object;
		String label = substitution.getLabel(shouldTranslate());

		return (!UML2Util.isEmpty(label)
			? appendString(text, label)
			: appendLabel(text, substitution.getContract())).toString();
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

		switch (notification.getFeatureID(Substitution.class)) {
			case UMLPackage.SUBSTITUTION__CONTRACT :
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
		if (feature == UMLPackage.Literals.DEPENDENCY__SUPPLIER) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.SUBSTITUTION__CONTRACT},
				collection);
		}
		if (feature == UMLPackage.Literals.DEPENDENCY__CLIENT) {
			return new SupersetRemoveCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.SUBSTITUTION__SUBSTITUTING_CLASSIFIER},
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
		if (feature == UMLPackage.Literals.DEPENDENCY__SUPPLIER) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.SUBSTITUTION__CONTRACT},
				value, collection);
		}
		if (feature == UMLPackage.Literals.DEPENDENCY__CLIENT) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.SUBSTITUTION__SUBSTITUTING_CLASSIFIER},
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
		if (feature == UMLPackage.Literals.SUBSTITUTION__CONTRACT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.DEPENDENCY__SUPPLIER},
				null, value);
		}
		if (feature == UMLPackage.Literals.SUBSTITUTION__SUBSTITUTING_CLASSIFIER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.DEPENDENCY__CLIENT},
				null, value);
		}
		if (feature == UMLPackage.Literals.DEPENDENCY__SUPPLIER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.SUBSTITUTION__CONTRACT},
				value);
		}
		if (feature == UMLPackage.Literals.DEPENDENCY__CLIENT) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				null,
				new EStructuralFeature[]{UMLPackage.Literals.SUBSTITUTION__SUBSTITUTING_CLASSIFIER},
				value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

	@Override
	public Object getForeground(Object object) {
		Substitution substitution = (Substitution) object;
		Classifier contract = substitution.getContract();
		return contract != null && contract.eIsProxy()
			? IItemColorProvider.GRAYED_OUT_COLOR
			: (substitution.eIsProxy()
				? IItemColorProvider.GRAYED_OUT_COLOR
				: null);
	}

}