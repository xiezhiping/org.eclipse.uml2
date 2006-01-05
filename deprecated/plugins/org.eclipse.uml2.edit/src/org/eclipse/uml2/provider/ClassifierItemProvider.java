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
 * $Id: ClassifierItemProvider.java,v 1.20 2006/01/05 13:53:29 khussey Exp $
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

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

import org.eclipse.uml2.common.edit.command.SubsetAddCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetReplaceCommand;
import org.eclipse.uml2.common.edit.command.SubsetSupersetSetCommand;
import org.eclipse.uml2.common.edit.command.SupersetRemoveCommand;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.Classifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierItemProvider
	extends NamespaceItemProvider
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
	public ClassifierItemProvider(AdapterFactory adapterFactory) {
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
			addOwningParameterPropertyDescriptor(object);
			addPackageableElement_visibilityPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
			addRedefinitionContextPropertyDescriptor(object);
			addIsLeafPropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addInheritedMemberPropertyDescriptor(object);
			addGeneralPropertyDescriptor(object);
			addGeneralizationPropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addRedefinedClassifierPropertyDescriptor(object);
			addSubstitutionPropertyDescriptor(object);
			addPowertypeExtentPropertyDescriptor(object);
			addOwnedUseCasePropertyDescriptor(object);
			addUseCasePropertyDescriptor(object);
			addRepresentationPropertyDescriptor(object);
			addOccurrencePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Packageable Element visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageableElement_visibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageableElement_packageableElement_visibility_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageableElement_packageableElement_visibility_feature", "_UI_PackageableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_package_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_package_feature", "_UI_Type_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.TYPE__PACKAGE,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Is Leaf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLeafPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_isLeaf_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_isLeaf_feature", "_UI_RedefinableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.REDEFINABLE_ELEMENT__IS_LEAF,
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redefinition Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinitionContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefinableElement_redefinitionContext_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefinableElement_redefinitionContext_feature", "_UI_RedefinableElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_isAbstract_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_isAbstract_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__IS_ABSTRACT,
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_feature_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_feature_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__FEATURE,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Inherited Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_inheritedMember_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_inheritedMember_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__INHERITED_MEMBER,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the General feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_general_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_general_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__GENERAL,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Generalization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_generalization_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_generalization_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__GENERALIZATION,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_attribute_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_attribute_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__ATTRIBUTE,
				 false,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Redefined Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_redefinedClassifier_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_redefinedClassifier_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__REDEFINED_CLASSIFIER,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Substitution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubstitutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_substitution_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_substitution_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__SUBSTITUTION,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Powertype Extent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowertypeExtentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_powertypeExtent_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_powertypeExtent_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__POWERTYPE_EXTENT,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Use Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedUseCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_ownedUseCase_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_ownedUseCase_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__OWNED_USE_CASE,
				 true,
				 null,
				 null,
				 new String[] {
					"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				 }));
	}

	/**
	 * This adds a property descriptor for the Use Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_useCase_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_useCase_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__USE_CASE,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Representation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_representation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_representation_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__REPRESENTATION,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occurrence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOccurrencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_occurrence_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_occurrence_feature", "_UI_Classifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UML2Package.Literals.CLASSIFIER__OCCURRENCE,
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
			childrenFeatures.add(UML2Package.Literals.CLASSIFIER__GENERALIZATION);
			childrenFeatures.add(UML2Package.Literals.CLASSIFIER__SUBSTITUTION);
			childrenFeatures.add(UML2Package.Literals.CLASSIFIER__OWNED_USE_CASE);
			childrenFeatures.add(UML2Package.Literals.CLASSIFIER__OCCURRENCE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Classifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Classifier_type") : //$NON-NLS-1$
			getString("_UI_Classifier_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Classifier.class)) {
			case UML2Package.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
			case UML2Package.CLASSIFIER__IS_LEAF:
			case UML2Package.CLASSIFIER__IS_ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UML2Package.CLASSIFIER__GENERALIZATION:
			case UML2Package.CLASSIFIER__SUBSTITUTION:
			case UML2Package.CLASSIFIER__OWNED_USE_CASE:
			case UML2Package.CLASSIFIER__OCCURRENCE:
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
				(UML2Package.Literals.CLASSIFIER__GENERALIZATION,
				 UML2Factory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.CLASSIFIER__SUBSTITUTION,
				 UML2Factory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.CLASSIFIER__OWNED_USE_CASE,
				 UML2Factory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UML2Package.Literals.CLASSIFIER__OCCURRENCE,
				 UML2Factory.eINSTANCE.createCollaborationOccurrence()));
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
		if (feature == UML2Package.Literals.CLASSIFIER__SUBSTITUTION) {
			return new SubsetAddCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY}, collection, index);
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
		if (feature == UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY) {
			return new SupersetRemoveCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.CLASSIFIER__SUBSTITUTION}, collection);
		}
		if (feature == UML2Package.Literals.CLASSIFIER__OCCURRENCE) {
			return new SupersetRemoveCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.CLASSIFIER__REPRESENTATION}, collection);
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
		if (feature == UML2Package.Literals.CLASSIFIER__SUBSTITUTION) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY}, null, value, collection);
		}
		if (feature == UML2Package.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, null, new EStructuralFeature[] {UML2Package.Literals.CLASSIFIER__SUBSTITUTION}, value, collection);
		}
		if (feature == UML2Package.Literals.CLASSIFIER__OCCURRENCE) {
			return new SubsetSupersetReplaceCommand(domain, owner, feature, null, new EStructuralFeature[] {UML2Package.Literals.CLASSIFIER__REPRESENTATION}, value, collection);
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
		if (feature == UML2Package.Literals.CLASSIFIER__REPRESENTATION) {
			return new SubsetSupersetSetCommand(domain, owner, feature, new EStructuralFeature[] {UML2Package.Literals.CLASSIFIER__OCCURRENCE}, null, value);
		}
		if (feature == UML2Package.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER) {
			return new SubsetSupersetSetCommand(domain, owner, feature, null, new EStructuralFeature[] {UML2Package.Literals.PARAMETERABLE_ELEMENT__OWNING_PARAMETER}, value);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
