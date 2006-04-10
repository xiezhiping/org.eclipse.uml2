/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: TemplateParameterSubstitutionItemProvider.java,v 1.24 2006/04/10 20:41:30 khussey Exp $
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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.TemplateParameterSubstitution;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.TemplateParameterSubstitution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterSubstitutionItemProvider
	extends ElementItemProvider
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
	public TemplateParameterSubstitutionItemProvider(AdapterFactory adapterFactory) {
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

			addFormalPropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
			addActualPropertyDescriptor(object);
			addOwnedActualPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Formal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_formal_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_formal_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_templateBinding_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_templateBinding_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Actual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_actual_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_actual_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Actual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedActualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameterSubstitution_ownedActual_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameterSubstitution_ownedActual_feature", "_UI_TemplateParameterSubstitution_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
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
			childrenFeatures.add(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		}
		return childrenFeatures;
	}

	/**
	 * This returns TemplateParameterSubstitution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateParameterSubstitution")); //$NON-NLS-1$
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
				"_UI_TemplateParameterSubstitution_type"), object).toString(); //$NON-NLS-1$
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

		switch (notification.getFeatureID(TemplateParameterSubstitution.class)) {
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
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
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createPermission()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createPrimitiveFunction()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL,
				 UML2Factory.eINSTANCE.createDeploymentSpecification()));
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
		if (feature == UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL) {
			return new SubsetAddCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL}, collection, index);
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
		if (feature == UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL) {
			return new SupersetRemoveCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL}, collection);
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
		if (feature == UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL}, null, value, collection);
		}
		if (feature == UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, null, new EStructuralFeature[] {UML2Package.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL}, value, collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value, collection);
	}

}
