/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ElementItemProvider.java,v 1.4 2006/01/04 16:16:56 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.provider.EObjectItemProvider;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Element} object.
 * <!-- begin-user-doc -->
 * @extends IItemQualifiedTextProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider
		extends EObjectItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemQualifiedTextProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptorsGen(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOwnedElementPropertyDescriptor(object);
			addOwnerPropertyDescriptor(object);
			addOwnedCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	public List getPropertyDescriptors(Object object) {

		if (itemPropertyDescriptors == null) {
			getPropertyDescriptorsGen(object);

			addStereotypeApplicationPropertyDescriptors(object);
		}

		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Owned Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Element_ownedElement_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Element_ownedElement_feature", "_UI_Element_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT, false, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Element_owner_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Element_owner_feature", "_UI_Element_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ELEMENT__OWNER, false, null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Owned Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Element_ownedComment_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_Element_ownedComment_feature", "_UI_Element_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.Literals.ELEMENT__OWNED_COMMENT, true, null, null,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
				.add(EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS);
			childrenFeatures.add(UMLPackage.Literals.ELEMENT__OWNED_COMMENT);
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
		return getString("_UI_Element_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Element.class)) {
			case UMLPackage.ELEMENT__EANNOTATIONS :
			case UMLPackage.ELEMENT__OWNED_COMMENT :
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
			EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS,
			EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.ELEMENT__OWNED_COMMENT, UMLFactory.eINSTANCE
				.createComment()));
	}

	/**
	 * This returns the icon image for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCreateChildImage(Object owner, Object feature,
			Object child, Collection selection) {
		if (feature instanceof EStructuralFeature
			&& FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry) child;
			feature = entry.getEStructuralFeature();
			child = entry.getValue();
		}

		if (feature instanceof EReference && child instanceof EObject) {
			String name = "full/obj16/" + ((EObject) child).eClass().getName(); //$NON-NLS-1$

			try {
				return getResourceLocator().getImage(name);
			} catch (Exception e) {
				UMLEditPlugin.INSTANCE.log(e);
			}
		}

		return super.getCreateChildImage(owner, feature, child, selection);
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

	protected void addStereotypeApplicationPropertyDescriptors(Object object) {

		for (Iterator stereotypeApplications = ((Element) object)
			.getStereotypeApplications().iterator(); stereotypeApplications
			.hasNext();) {

			final Object stereotypeApplication = stereotypeApplications.next();
			IItemPropertySource itemPropertySource = (IItemPropertySource) adapterFactory
				.adapt(stereotypeApplication, IItemPropertySource.class);

			if (itemPropertySource != null) {

				for (Iterator propertyDescriptors = itemPropertySource
					.getPropertyDescriptors(stereotypeApplication).iterator(); propertyDescriptors
					.hasNext();) {

					itemPropertyDescriptors
						.add(new ItemPropertyDescriptorDecorator(
							stereotypeApplication,
							(IItemPropertyDescriptor) propertyDescriptors
								.next()));
				}
			}
		}
	}

	protected boolean shouldTranslate() {
		return UMLEditPlugin.INSTANCE.shouldTranslate();
	}

	public String getQualifiedText(Object object) {
		return UML2Util.getQualifiedText((EObject) object,
			new UMLUtil.QualifiedTextProvider() {

				public String getFeatureText(
						EStructuralFeature eStructuralFeature) {
					return ElementItemProvider.this
						.getFeatureText(eStructuralFeature);
				}

				public String getClassText(EObject eObject) {
					return getTypeText(eObject);
				}

			});
	}

	protected StringBuffer appendKeywords(StringBuffer text, Object object) {

		if (object instanceof Element) {
			Element element = (Element) object;

			Iterator appliedStereotypes = element.getAppliedStereotypes()
				.iterator();
			Iterator keywords = element.getKeywords().iterator();

			if (appliedStereotypes.hasNext() || keywords.hasNext()) {

				if (text.length() > 0) {
					text.append(' ');
				}

				text.append("<<"); //$NON-NLS-1$

				while (appliedStereotypes.hasNext()) {
					text.append(((Stereotype) appliedStereotypes.next())
						.getKeyword(shouldTranslate()));

					if (appliedStereotypes.hasNext() || keywords.hasNext()) {
						text.append(", "); //$NON-NLS-1$
					}
				}

				while (keywords.hasNext()) {
					text.append((String) keywords.next());

					if (keywords.hasNext()) {
						text.append(", "); //$NON-NLS-1$
					}
				}

				text.append(">>"); //$NON-NLS-1$
			}
		}

		return text;
	}

	protected StringBuffer appendType(StringBuffer text, Object object) {

		if (text.length() > 0) {
			text.append(' ');
		}

		return text.append('<').append(getTypeText(object)).append('>');
	}

	protected StringBuffer appendType(StringBuffer text, String key) {

		if (text.length() > 0) {
			text.append(' ');
		}

		return text.append('<').append(getString(key)).append('>');
	}

	protected StringBuffer appendLabel(StringBuffer text, Object object) {
		return object instanceof NamedElement
			? appendString(text, ((NamedElement) object)
				.getLabel(shouldTranslate()))
			: text;
	}

	protected StringBuffer appendString(StringBuffer text, String string) {

		if (!UML2Util.isEmpty(string)) {

			if (text.length() > 0) {
				text.append(' ');
			}

			text.append(string);
		}

		return text;
	}

	protected String getTypeText(ResourceLocator resourceLocator, EClass eClass) {

		if (resourceLocator != null) {

			String typeKey = eClass.getName();
			try {
				return resourceLocator.getString("_UI_" + typeKey + "_type"); //$NON-NLS-1$ //$NON-NLS-2$
			} catch (MissingResourceException mre) {
				return typeKey;
			}
		}

		return getString("_UI_Unknown_type"); //$NON-NLS-1$
	}

	protected ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		return new UMLItemPropertyDescriptor(adapterFactory, resourceLocator,
			displayName, description, feature, isSettable, staticImage,
			category == null
				? getTypeText(resourceLocator, feature.getEContainingClass())
				: category, filterFlags);
	}

}