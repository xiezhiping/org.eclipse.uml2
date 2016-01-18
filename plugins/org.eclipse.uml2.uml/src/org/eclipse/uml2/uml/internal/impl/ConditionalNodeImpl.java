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
 *   Kenn Hussey (CEA) - 327039, 351774, 397139, 418466, 451350, 485756
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

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ConditionalNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#getClauses <em>Clause</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#isAssured <em>Is Assured</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#isDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConditionalNodeImpl#getResults <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalNodeImpl
		extends StructuredActivityNodeImpl
		implements ConditionalNode {

	/**
	 * The cached value of the '{@link #getClauses() <em>Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clauses;

	/**
	 * The default value of the '{@link #isAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssured()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSURED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssured()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ASSURED_EFLAG = 1 << 15;

	/**
	 * The default value of the '{@link #isDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DETERMINATE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DETERMINATE_EFLAG = 1 << 16;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONDITIONAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(eResource,
				this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeterminate() {
		return (eFlags & IS_DETERMINATE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeterminate(boolean newIsDeterminate) {
		boolean oldIsDeterminate = (eFlags & IS_DETERMINATE_EFLAG) != 0;
		if (newIsDeterminate)
			eFlags |= IS_DETERMINATE_EFLAG;
		else
			eFlags &= ~IS_DETERMINATE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate,
				newIsDeterminate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssured() {
		return (eFlags & IS_ASSURED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssured(boolean newIsAssured) {
		boolean oldIsAssured = (eFlags & IS_ASSURED_EFLAG) != 0;
		if (newIsAssured)
			eFlags |= IS_ASSURED_EFLAG;
		else
			eFlags &= ~IS_ASSURED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CONDITIONAL_NODE__IS_ASSURED, oldIsAssured,
				newIsAssured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClauses() {
		if (clauses == null) {
			clauses = new EObjectContainmentEList.Resolving<Clause>(
				Clause.class, this, UMLPackage.CONDITIONAL_NODE__CLAUSE);
		}
		return clauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		Clause newClause = (Clause) create(UMLPackage.Literals.CLAUSE);
		getClauses().add(newClause);
		return newClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList.Resolving<OutputPin>(
				OutputPin.class, this, UMLPackage.CONDITIONAL_NODE__RESULT);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createResult(String name, Type type) {
		OutputPin newResult = (OutputPin) create(
			UMLPackage.Literals.OUTPUT_PIN);
		getResults().add(newResult);
		if (name != null)
			newResult.setName(name);
		if (type != null)
			newResult.setType(type);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name, Type type) {
		return getResult(name, type, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		resultLoop : for (OutputPin result : getResults()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(result.getName())
				: name.equals(result.getName())))
				continue resultLoop;
			if (type != null && !type.equals(result.getType()))
				continue resultLoop;
			return result;
		}
		return createOnDemand
			? createResult(name, type)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResults() {
		return results != null && !results.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultNoIncoming(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConditionalNodeOperations.validateResultNoIncoming(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoInputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConditionalNodeOperations.validateNoInputPins(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneClauseWithExecutableNode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionalNodeOperations
			.validateOneClauseWithExecutableNode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchingOutputPins(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConditionalNodeOperations.validateMatchingOutputPins(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableNodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConditionalNodeOperations.validateExecutableNodes(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClauseNoPredecessor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConditionalNodeOperations.validateClauseNoPredecessor(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> allActions() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Action> result = (EList<Action>) cache.get(this,
				UMLPackage.Literals.ACTION___ALL_ACTIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ACTION___ALL_ACTIONS,
					result = ConditionalNodeOperations.allActions(this));
			}
			return result;
		}
		return ConditionalNodeOperations.allActions(this);
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				return ((InternalEList<?>) getEdges()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_INPUT :
				return ((InternalEList<?>) getStructuredNodeInputs())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT :
				return ((InternalEList<?>) getStructuredNodeOutputs())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				return ((InternalEList<?>) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__NODE :
				return ((InternalEList<?>) getNodes()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				return ((InternalEList<?>) getClauses()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				return ((InternalEList<?>) getResults()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CONDITIONAL_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CONDITIONAL_NODE__NAME :
				return getName();
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CONDITIONAL_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CONDITIONAL_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				return isLeaf();
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CONDITIONAL_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.CONDITIONAL_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.CONDITIONAL_NODE__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.CONDITIONAL_NODE__INPUT :
				return getInputs();
			case UMLPackage.CONDITIONAL_NODE__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.CONDITIONAL_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.CONDITIONAL_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.CONDITIONAL_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.CONDITIONAL_NODE__MEMBER :
				return getMembers();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				if (resolve)
					return getInActivity();
				return basicGetInActivity();
			case UMLPackage.CONDITIONAL_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.CONDITIONAL_NODE__SUPER_GROUP :
				if (resolve)
					return getSuperGroup();
				return basicGetSuperGroup();
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				return getEdges();
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				return isMustIsolate();
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_INPUT :
				return getStructuredNodeInputs();
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT :
				return getStructuredNodeOutputs();
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.CONDITIONAL_NODE__NODE :
				return getNodes();
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				return getClauses();
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				return isAssured();
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				return isDeterminate();
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				return getResults();
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				getEdges().clear();
				getEdges()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				setMustIsolate((Boolean) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_INPUT :
				getStructuredNodeInputs().clear();
				getStructuredNodeInputs()
					.addAll((Collection<? extends InputPin>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT :
				getStructuredNodeOutputs().clear();
				getStructuredNodeOutputs()
					.addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				getVariables().clear();
				getVariables()
					.addAll((Collection<? extends Variable>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__NODE :
				getNodes().clear();
				getNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				getClauses().clear();
				getClauses().addAll((Collection<? extends Clause>) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				setIsAssured((Boolean) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				setIsDeterminate((Boolean) newValue);
				return;
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				getResults().clear();
				getResults().addAll((Collection<? extends OutputPin>) newValue);
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				getEdges().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_INPUT :
				getStructuredNodeInputs().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT :
				getStructuredNodeOutputs().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				getClauses().clear();
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				setIsAssured(IS_ASSURED_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				setIsDeterminate(IS_DETERMINATE_EDEFAULT);
				return;
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				getResults().clear();
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
			case UMLPackage.CONDITIONAL_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CONDITIONAL_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.CONDITIONAL_NODE__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.CONDITIONAL_NODE__NAME :
				return isSetName();
			case UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CONDITIONAL_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CONDITIONAL_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CONDITIONAL_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CONDITIONAL_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CONDITIONAL_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CONDITIONAL_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.CONDITIONAL_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.CONDITIONAL_NODE__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.CONDITIONAL_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.CONDITIONAL_NODE__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.CONDITIONAL_NODE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.CONDITIONAL_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.CONDITIONAL_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.CONDITIONAL_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.CONDITIONAL_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.CONDITIONAL_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.CONDITIONAL_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.CONDITIONAL_NODE__EDGE :
				return edges != null && !edges.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__MUST_ISOLATE :
				return ((eFlags
					& MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_INPUT :
				return structuredNodeInputs != null
					&& !structuredNodeInputs.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT :
				return isSetStructuredNodeOutputs();
			case UMLPackage.CONDITIONAL_NODE__VARIABLE :
				return variables != null && !variables.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__NODE :
				return nodes != null && !nodes.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__CLAUSE :
				return clauses != null && !clauses.isEmpty();
			case UMLPackage.CONDITIONAL_NODE__IS_ASSURED :
				return ((eFlags
					& IS_ASSURED_EFLAG) != 0) != IS_ASSURED_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__IS_DETERMINATE :
				return ((eFlags
					& IS_DETERMINATE_EFLAG) != 0) != IS_DETERMINATE_EDEFAULT;
			case UMLPackage.CONDITIONAL_NODE__RESULT :
				return isSetResults();
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
			case UMLPackage.CONDITIONAL_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.CONDITIONAL_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.CONDITIONAL_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.CONDITIONAL_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.CONDITIONAL_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.CONDITIONAL_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.CONDITIONAL_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.CONDITIONAL_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.CONDITIONAL_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.CONDITIONAL_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.CONDITIONAL_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.CONDITIONAL_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.CONDITIONAL_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.CONDITIONAL_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.CONDITIONAL_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.CONDITIONAL_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.CONDITIONAL_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.CONDITIONAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CONDITIONAL_NODE___SEPARATOR :
				return separator();
			case UMLPackage.CONDITIONAL_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.CONDITIONAL_NODE___GET_CONTEXT :
				return getContext();
			case UMLPackage.CONDITIONAL_NODE___ALL_ACTIONS :
				return allActions();
			case UMLPackage.CONDITIONAL_NODE___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.CONDITIONAL_NODE___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.CONDITIONAL_NODE___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.CONDITIONAL_NODE___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.CONDITIONAL_NODE___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.CONDITIONAL_NODE___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.CONDITIONAL_NODE___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNodesAndEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP :
				return validateNotContained((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_OUTPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateOutputPinEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_INPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateInputPinEdges((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___SOURCE_NODES :
				return sourceNodes();
			case UMLPackage.CONDITIONAL_NODE___TARGET_NODES :
				return targetNodes();
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_RESULT_NO_INCOMING__DIAGNOSTICCHAIN_MAP :
				return validateResultNoIncoming(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_NO_INPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateNoInputPins((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_ONE_CLAUSE_WITH_EXECUTABLE_NODE__DIAGNOSTICCHAIN_MAP :
				return validateOneClauseWithExecutableNode(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_MATCHING_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP :
				return validateMatchingOutputPins(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_EXECUTABLE_NODES__DIAGNOSTICCHAIN_MAP :
				return validateExecutableNodes(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.CONDITIONAL_NODE___VALIDATE_CLAUSE_NO_PREDECESSOR__DIAGNOSTICCHAIN_MAP :
				return validateClauseNoPredecessor(
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
		result.append(" (isAssured: "); //$NON-NLS-1$
		result.append((eFlags & IS_ASSURED_EFLAG) != 0);
		result.append(", isDeterminate: "); //$NON-NLS-1$
		result.append((eFlags & IS_DETERMINATE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.CONDITIONAL_NODE__OWNED_COMMENT,
		UMLPackage.CONDITIONAL_NODE__NAME_EXPRESSION,
		UMLPackage.CONDITIONAL_NODE__HANDLER,
		UMLPackage.CONDITIONAL_NODE__INPUT,
		UMLPackage.CONDITIONAL_NODE__LOCAL_POSTCONDITION,
		UMLPackage.CONDITIONAL_NODE__LOCAL_PRECONDITION,
		UMLPackage.CONDITIONAL_NODE__OUTPUT,
		UMLPackage.CONDITIONAL_NODE__ELEMENT_IMPORT,
		UMLPackage.CONDITIONAL_NODE__PACKAGE_IMPORT,
		UMLPackage.CONDITIONAL_NODE__OWNED_MEMBER,
		UMLPackage.CONDITIONAL_NODE__SUBGROUP,
		UMLPackage.CONDITIONAL_NODE__EDGE, UMLPackage.CONDITIONAL_NODE__NODE,
		UMLPackage.CONDITIONAL_NODE__CLAUSE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CONDITIONAL_NODE__CLAUSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputPin> getStructuredNodeOutputs() {
		return getResults();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructuredNodeOutputs() {
		return false;
	}

	protected static final int[] OUTPUT_ESUBSETS = new int[]{
		UMLPackage.CONDITIONAL_NODE__RESULT};

	@Override
	public EList<OutputPin> getOutputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<OutputPin> outputs = (EList<OutputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__OUTPUT,
					outputs = new DerivedUnionEObjectEList<OutputPin>(
						OutputPin.class, this,
						UMLPackage.CONDITIONAL_NODE__OUTPUT, OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList<OutputPin>(OutputPin.class, this,
			UMLPackage.CONDITIONAL_NODE__OUTPUT, OUTPUT_ESUBSETS);
	}

} //ConditionalNodeImpl
