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
 *   Kenn Hussey (CEA) - 327039, 351774, 383028, 418466, 414970, 370089, 459723
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider
		extends BehavioralFeatureItemProvider {

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
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOwningTemplateParameterPropertyDescriptor(object);
			addTemplateParameterPropertyDescriptor(object);
			addTemplateBindingPropertyDescriptor(object);
			addOwnedTemplateSignaturePropertyDescriptor(object);
			addBodyConditionPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addDatatypePropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
			addIsOrderedPropertyDescriptor(object);
			addIsQueryPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addPostconditionPropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
			addRedefinedOperationPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Is Query feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_isQuery_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_isQuery_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__IS_QUERY, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_isOrdered_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_isOrdered_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__IS_ORDERED, false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_isUnique_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_isUnique_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__IS_UNIQUE, false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_lower_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_lower_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__LOWER, false, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_upper_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_upper_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__UPPER, false, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_precondition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_precondition_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__PRECONDITION, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Postcondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_postcondition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_postcondition_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__POSTCONDITION, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Redefined Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_redefinedOperation_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_redefinedOperation_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__REDEFINED_OPERATION, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Body Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_bodyCondition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_bodyCondition_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__BODY_CONDITION, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_class_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_class_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__CLASS, true, false, true, null,
				null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Datatype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatatypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_datatype_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_datatype_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__DATATYPE, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_interface_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_interface_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__INTERFACE, true, false, true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Operation_type_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Operation_type_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.OPERATION__TYPE, false, false, true, null,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
				.add(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
			childrenFeatures
				.add(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
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
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Operation")); //$NON-NLS-1$
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
		StringBuffer text = appendLabel(
			appendType(appendKeywords(new StringBuffer(), object),
				"_UI_Operation_type"), object); //$NON-NLS-1$

		Operation operation = (Operation) object;

		appendString(text, "("); //$NON-NLS-1$

		List<Parameter> ownedParameters = new ArrayList<Parameter>(
			operation.getOwnedParameters());
		ownedParameters.removeAll(operation.returnResult());

		for (Iterator<Parameter> parameters = ownedParameters.iterator(); parameters
			.hasNext();) {

			Parameter parameter = parameters.next();
			String label = parameter.getLabel(shouldTranslate());

			if (UMLUtil.isEmpty(label)) {
				text.append('<').append(getTypeText(parameter)).append('>');
			} else {
				text.append(label);
			}

			Type type = parameter.getType();

			if (type != null) {
				String typeLabel = type.getLabel(shouldTranslate());

				if (!UMLUtil.isEmpty(typeLabel)) {
					appendString(text, ": " + typeLabel); //$NON-NLS-1$
				}
			}

			MultiplicityElementItemProvider.appendMultiplicity(text, parameter);

			if (parameters.hasNext()) {
				text.append(", "); //$NON-NLS-1$
			}
		}

		text.append(')');

		Parameter returnResult = operation.getReturnResult();

		if (returnResult != null) {
			Type type = returnResult.getType();

			if (type != null) {
				String typeLabel = type.getLabel(shouldTranslate());

				if (!UMLUtil.isEmpty(typeLabel)) {
					appendString(text, ": " + typeLabel); //$NON-NLS-1$
				}
			}

			MultiplicityElementItemProvider.appendMultiplicity(text,
				returnResult);
		}

		return text.toString();
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

		switch (notification.getFeatureID(Operation.class)) {
			case UMLPackage.OPERATION__BODY_CONDITION :
			case UMLPackage.OPERATION__IS_ORDERED :
			case UMLPackage.OPERATION__IS_QUERY :
			case UMLPackage.OPERATION__IS_UNIQUE :
			case UMLPackage.OPERATION__LOWER :
			case UMLPackage.OPERATION__POSTCONDITION :
			case UMLPackage.OPERATION__PRECONDITION :
			case UMLPackage.OPERATION__UPPER :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.OPERATION__TEMPLATE_BINDING :
			case UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE :
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
			UMLPackage.Literals.OPERATION__BODY_CONDITION,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__BODY_CONDITION,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__BODY_CONDITION,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__BODY_CONDITION,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__BODY_CONDITION,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__POSTCONDITION,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__POSTCONDITION,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__POSTCONDITION,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__POSTCONDITION,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__POSTCONDITION,
			UMLFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__PRECONDITION,
			UMLFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__PRECONDITION,
			UMLFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__PRECONDITION,
			UMLFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__PRECONDITION,
			UMLFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.OPERATION__PRECONDITION,
			UMLFactory.eINSTANCE.createTimeConstraint()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
			|| childFeature == UMLPackage.Literals.OPERATION__BODY_CONDITION
			|| childFeature == UMLPackage.Literals.OPERATION__POSTCONDITION
			|| childFeature == UMLPackage.Literals.OPERATION__PRECONDITION;

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
		if (feature == UMLPackage.Literals.OPERATION__POSTCONDITION) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				collection, index);
		}
		if (feature == UMLPackage.Literals.OPERATION__PRECONDITION) {
			return new SubsetAddCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
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
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SupersetRemoveCommand(domain, owner, feature,
				new EStructuralFeature[]{
					UMLPackage.Literals.OPERATION__BODY_CONDITION,
					UMLPackage.Literals.OPERATION__POSTCONDITION,
					UMLPackage.Literals.OPERATION__PRECONDITION}, collection);
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
		if (feature == UMLPackage.Literals.OPERATION__POSTCONDITION) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.OPERATION__PRECONDITION) {
			return new SubsetSupersetReplaceCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value, collection);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature,
				null, new EStructuralFeature[]{
					UMLPackage.Literals.OPERATION__BODY_CONDITION,
					UMLPackage.Literals.OPERATION__POSTCONDITION,
					UMLPackage.Literals.OPERATION__PRECONDITION}, value,
				collection);
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
		if (feature == UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER},
				null, value);
		}
		if (feature == UMLPackage.Literals.OPERATION__BODY_CONDITION) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value);
		}
		if (feature == UMLPackage.Literals.OPERATION__POSTCONDITION) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value);
		}
		if (feature == UMLPackage.Literals.OPERATION__PRECONDITION) {
			return new SubsetSupersetSetCommand(
				domain,
				owner,
				feature,
				new EStructuralFeature[]{UMLPackage.Literals.NAMESPACE__OWNED_RULE},
				null, value);
		}
		if (feature == UMLPackage.Literals.NAMESPACE__OWNED_RULE) {
			return new SubsetSupersetSetCommand(domain, owner, feature, null,
				new EStructuralFeature[]{
					UMLPackage.Literals.OPERATION__BODY_CONDITION,
					UMLPackage.Literals.OPERATION__POSTCONDITION,
					UMLPackage.Literals.OPERATION__PRECONDITION}, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}