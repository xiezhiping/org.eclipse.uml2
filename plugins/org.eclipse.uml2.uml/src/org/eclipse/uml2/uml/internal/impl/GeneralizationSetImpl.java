/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.GeneralizationSetOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationSetImpl#isCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationSetImpl#isDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationSetImpl#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationSetImpl#getGeneralizations <em>Generalization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationSetImpl
		extends PackageableElementImpl
		implements GeneralizationSet {

	/**
	 * The default value of the '{@link #isCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCovering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COVERING_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCovering()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_COVERING_EFLAG = 1 << 12;

	/**
	 * The default value of the '{@link #isDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISJOINT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DISJOINT_EFLAG = 1 << 13;

	/**
	 * The cached value of the '{@link #getPowertype() <em>Powertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertype()
	 * @generated
	 * @ordered
	 */
	protected Classifier powertype;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.GENERALIZATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCovering() {
		return (eFlags & IS_COVERING_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCovering(boolean newIsCovering) {
		boolean oldIsCovering = (eFlags & IS_COVERING_EFLAG) != 0;
		if (newIsCovering)
			eFlags |= IS_COVERING_EFLAG;
		else
			eFlags &= ~IS_COVERING_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION_SET__IS_COVERING, oldIsCovering,
				newIsCovering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisjoint() {
		return (eFlags & IS_DISJOINT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(boolean newIsDisjoint) {
		boolean oldIsDisjoint = (eFlags & IS_DISJOINT_EFLAG) != 0;
		if (newIsDisjoint)
			eFlags |= IS_DISJOINT_EFLAG;
		else
			eFlags &= ~IS_DISJOINT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint,
				newIsDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getPowertype() {
		if (powertype != null && powertype.eIsProxy()) {
			InternalEObject oldPowertype = (InternalEObject) powertype;
			powertype = (Classifier) eResolveProxy(oldPowertype);
			if (powertype != oldPowertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.GENERALIZATION_SET__POWERTYPE, oldPowertype,
						powertype));
			}
		}
		return powertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetPowertype() {
		return powertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowertype(Classifier newPowertype,
			NotificationChain msgs) {
		Classifier oldPowertype = powertype;
		powertype = newPowertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.GENERALIZATION_SET__POWERTYPE,
				oldPowertype, newPowertype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertype(Classifier newPowertype) {
		if (newPowertype != powertype) {
			NotificationChain msgs = null;
			if (powertype != null)
				msgs = ((InternalEObject) powertype).eInverseRemove(this,
					UMLPackage.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class,
					msgs);
			if (newPowertype != null)
				msgs = ((InternalEObject) newPowertype).eInverseAdd(this,
					UMLPackage.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class,
					msgs);
			msgs = basicSetPowertype(newPowertype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION_SET__POWERTYPE, newPowertype,
				newPowertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectWithInverseResolvingEList.ManyInverse<Generalization>(
				Generalization.class, this,
				UMLPackage.GENERALIZATION_SET__GENERALIZATION,
				UMLPackage.GENERALIZATION__GENERALIZATION_SET);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization(Classifier general) {
		generalizationLoop : for (Generalization generalization : getGeneralizations()) {
			if (general != null && !general.equals(generalization.getGeneral()))
				continue generalizationLoop;
			return generalization;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSameClassifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralizationSetOperations
			.validateGeneralizationSameClassifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralizationSetOperations.validateMapsToGeneralizationSet(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.GENERALIZATION_SET__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.GENERALIZATION_SET__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.GENERALIZATION_SET__POWERTYPE :
				if (powertype != null)
					msgs = ((InternalEObject) powertype).eInverseRemove(this,
						UMLPackage.CLASSIFIER__POWERTYPE_EXTENT,
						Classifier.class, msgs);
				return basicSetPowertype((Classifier) otherEnd, msgs);
			case UMLPackage.GENERALIZATION_SET__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.GENERALIZATION_SET__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.GENERALIZATION_SET__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.GENERALIZATION_SET__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.GENERALIZATION_SET__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.GENERALIZATION_SET__POWERTYPE :
				return basicSetPowertype(null, msgs);
			case UMLPackage.GENERALIZATION_SET__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.GENERALIZATION_SET__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.GENERALIZATION_SET__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.GENERALIZATION_SET__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.GENERALIZATION_SET__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.GENERALIZATION_SET__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.GENERALIZATION_SET__NAME :
				return getName();
			case UMLPackage.GENERALIZATION_SET__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.GENERALIZATION_SET__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.GENERALIZATION_SET__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.GENERALIZATION_SET__VISIBILITY :
				return getVisibility();
			case UMLPackage.GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.GENERALIZATION_SET__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.GENERALIZATION_SET__IS_COVERING :
				return isCovering();
			case UMLPackage.GENERALIZATION_SET__IS_DISJOINT :
				return isDisjoint();
			case UMLPackage.GENERALIZATION_SET__POWERTYPE :
				if (resolve)
					return getPowertype();
				return basicGetPowertype();
			case UMLPackage.GENERALIZATION_SET__GENERALIZATION :
				return getGeneralizations();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.GENERALIZATION_SET__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__IS_COVERING :
				setIsCovering((Boolean) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__IS_DISJOINT :
				setIsDisjoint((Boolean) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__POWERTYPE :
				setPowertype((Classifier) newValue);
				return;
			case UMLPackage.GENERALIZATION_SET__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.GENERALIZATION_SET__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.GENERALIZATION_SET__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.GENERALIZATION_SET__NAME :
				unsetName();
				return;
			case UMLPackage.GENERALIZATION_SET__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.GENERALIZATION_SET__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.GENERALIZATION_SET__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.GENERALIZATION_SET__IS_COVERING :
				setIsCovering(IS_COVERING_EDEFAULT);
				return;
			case UMLPackage.GENERALIZATION_SET__IS_DISJOINT :
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case UMLPackage.GENERALIZATION_SET__POWERTYPE :
				setPowertype((Classifier) null);
				return;
			case UMLPackage.GENERALIZATION_SET__GENERALIZATION :
				getGeneralizations().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.GENERALIZATION_SET__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.GENERALIZATION_SET__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.GENERALIZATION_SET__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.GENERALIZATION_SET__OWNER :
				return isSetOwner();
			case UMLPackage.GENERALIZATION_SET__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.GENERALIZATION_SET__NAME :
				return isSetName();
			case UMLPackage.GENERALIZATION_SET__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.GENERALIZATION_SET__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.GENERALIZATION_SET__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.GENERALIZATION_SET__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.GENERALIZATION_SET__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.GENERALIZATION_SET__IS_COVERING :
				return ((eFlags
					& IS_COVERING_EFLAG) != 0) != IS_COVERING_EDEFAULT;
			case UMLPackage.GENERALIZATION_SET__IS_DISJOINT :
				return ((eFlags
					& IS_DISJOINT_EFLAG) != 0) != IS_DISJOINT_EDEFAULT;
			case UMLPackage.GENERALIZATION_SET__POWERTYPE :
				return powertype != null;
			case UMLPackage.GENERALIZATION_SET__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.GENERALIZATION_SET___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___DESTROY :
				destroy();
				return null;
			case UMLPackage.GENERALIZATION_SET___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.GENERALIZATION_SET___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.GENERALIZATION_SET___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.GENERALIZATION_SET___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_MODEL :
				return getModel();
			case UMLPackage.GENERALIZATION_SET___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.GENERALIZATION_SET___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.GENERALIZATION_SET___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.GENERALIZATION_SET___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.GENERALIZATION_SET___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.GENERALIZATION_SET___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.GENERALIZATION_SET___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.GENERALIZATION_SET___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.GENERALIZATION_SET___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.GENERALIZATION_SET___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_LABEL :
				return getLabel();
			case UMLPackage.GENERALIZATION_SET___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.GENERALIZATION_SET___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.GENERALIZATION_SET___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.GENERALIZATION_SET___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.GENERALIZATION_SET___SEPARATOR :
				return separator();
			case UMLPackage.GENERALIZATION_SET___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.GENERALIZATION_SET___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.GENERALIZATION_SET___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.GENERALIZATION_SET___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___VALIDATE_GENERALIZATION_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP :
				return validateGeneralizationSameClassifier(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.GENERALIZATION_SET___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isCovering: "); //$NON-NLS-1$
		result.append((eFlags & IS_COVERING_EFLAG) != 0);
		result.append(", isDisjoint: "); //$NON-NLS-1$
		result.append((eFlags & IS_DISJOINT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl
