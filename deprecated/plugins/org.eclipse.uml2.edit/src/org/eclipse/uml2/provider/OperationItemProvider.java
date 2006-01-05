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
 * $Id: OperationItemProvider.java,v 1.24 2006/01/05 13:53:30 khussey Exp $
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

import org.eclipse.uml2.BehavioralFeature;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider
	extends BehavioralFeatureItemProvider
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
	public OperationItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addIsOrderedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addUpperValuePropertyDescriptor(object);
			addLowerValuePropertyDescriptor(object);
			addTemplateParameterPropertyDescriptor(object);
			addOwningParameterPropertyDescriptor(object);
			addOwnedParameterPropertyDescriptor(object);
			addClass_PropertyDescriptor(object);
			addIsQueryPropertyDescriptor(object);
			addDatatypePropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
			addPostconditionPropertyDescriptor(object);
			addRedefinedOperationPropertyDescriptor(object);
			addBodyConditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypedElement_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_TypedElement_type_feature", "_UI_TypedElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.TYPED_ELEMENT__TYPE,
				 1 == ((Operation)object).getReturnResults().size(),
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isOrdered_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isOrdered_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED,
				 1 == ((Operation)object).getReturnResults().size(),
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_isUnique_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isUnique_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE,
				 1 == ((Operation)object).getReturnResults().size(),
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_lower_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lower_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_upper_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upper_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Upper Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_upperValue_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upperValue_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Lower Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiplicityElement_lowerValue_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lowerValue_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Template Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterableElement_templateParameter_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterableElement_templateParameter_feature", "_UI_ParameterableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterableElement_owningParameter_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterableElement_owningParameter_feature", "_UI_ParameterableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.PARAMETERABLE_ELEMENT__OWNING_PARAMETER,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Owned Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_ownedParameter_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_ownedParameter_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__OWNED_PARAMETER,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Class  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClass_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_class__feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_class__feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__CLASS_,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Is Query feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_isQuery_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_isQuery_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__IS_QUERY,
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datatype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatatypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_datatype_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_datatype_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__DATATYPE,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_precondition_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_precondition_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__PRECONDITION,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Postcondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_postcondition_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_postcondition_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__POSTCONDITION,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefined Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_redefinedOperation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_redefinedOperation_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__REDEFINED_OPERATION,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Body Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_bodyCondition_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_bodyCondition_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.OPERATION__BODY_CONDITION,
				 true,
				 null,
				 null,
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
	public Collection getChildrenFeaturesGen(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE);
			childrenFeatures.add(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE);
			childrenFeatures.add(UML2Package.Literals.OPERATION__OWNED_PARAMETER);
		}
		return childrenFeatures;
	}

	public Collection getChildrenFeatures(Object object) {
		if (null == childrenFeatures) {
			getChildrenFeaturesGen(object);
			childrenFeatures.remove(UML2Package.Literals.BEHAVIORAL_FEATURE__FORMAL_PARAMETER);
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
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Operation"); //$NON-NLS-1$
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
				"_UI_Operation_type"), object).toString(); //$NON-NLS-1$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Operation.class)) {
			case UML2Package.OPERATION__TYPE:
			case UML2Package.OPERATION__IS_ORDERED:
			case UML2Package.OPERATION__IS_UNIQUE:
			case UML2Package.OPERATION__LOWER:
			case UML2Package.OPERATION__UPPER:
			case UML2Package.OPERATION__IS_QUERY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UML2Package.OPERATION__UPPER_VALUE:
			case UML2Package.OPERATION__LOWER_VALUE:
			case UML2Package.OPERATION__OWNED_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	public void notifyChanged(Notification notification) {

		switch (notification.getFeatureID(BehavioralFeature.class)) {
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT :
				itemPropertyDescriptors = null;
			default :
				notifyChangedGen(notification);
		}
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
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
				 UML2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
				 UML2Factory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.OPERATION__OWNED_PARAMETER,
				 UML2Factory.eINSTANCE.createParameter()));
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
			childFeature == UML2Package.Literals.BEHAVIORAL_FEATURE__FORMAL_PARAMETER ||
			childFeature == UML2Package.Literals.BEHAVIORAL_FEATURE__RETURN_RESULT ||
			childFeature == UML2Package.Literals.OPERATION__OWNED_PARAMETER ||
			childFeature == UML2Package.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE ||
			childFeature == UML2Package.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE;

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
		if (feature == UML2Package.Literals.OPERATION__PRECONDITION) {
			return new SubsetAddCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMESPACE__OWNED_RULE}, collection, index);
		}
		if (feature == UML2Package.Literals.OPERATION__POSTCONDITION) {
			return new SubsetAddCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMESPACE__OWNED_RULE}, collection, index);
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
		if (feature == UML2Package.Literals.NAMESPACE__OWNED_RULE) {
			return new SupersetRemoveCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.OPERATION__PRECONDITION, UML2Package.Literals.OPERATION__POSTCONDITION, UML2Package.Literals.OPERATION__BODY_CONDITION}, collection);
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
		if (feature == UML2Package.Literals.OPERATION__PRECONDITION) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMESPACE__OWNED_RULE}, null, value, collection);
		}
		if (feature == UML2Package.Literals.OPERATION__POSTCONDITION) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMESPACE__OWNED_RULE}, null, value, collection);
		}
		if (feature == UML2Package.Literals.NAMESPACE__OWNED_RULE) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, null, new EStructuralFeature[] {UML2Package.Literals.OPERATION__PRECONDITION, UML2Package.Literals.OPERATION__POSTCONDITION, UML2Package.Literals.OPERATION__BODY_CONDITION}, value, collection);
		}
		return super.createReplaceCommand(domain, owner, feature, value, collection);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value) {
		if (feature == UML2Package.Literals.PARAMETERABLE_ELEMENT__OWNING_PARAMETER) {
			return new SubsetSupersetSetCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER}, null, value);
		}
		if (feature == UML2Package.Literals.OPERATION__BODY_CONDITION) {
			return new SubsetSupersetSetCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMESPACE__OWNED_RULE}, null, value);
		}
		if (feature == UML2Package.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER) {
			return new SubsetSupersetSetCommand(domain, owner, feature, null, new EStructuralFeature[] {UML2Package.Literals.PARAMETERABLE_ELEMENT__OWNING_PARAMETER}, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
