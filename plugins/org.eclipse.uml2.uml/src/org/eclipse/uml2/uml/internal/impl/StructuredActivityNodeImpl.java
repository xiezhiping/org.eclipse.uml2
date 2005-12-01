/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredActivityNodeImpl.java,v 1.9 2005/12/01 20:04:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityGroupOperations;
import org.eclipse.uml2.uml.internal.operations.NamespaceOperations;
import org.eclipse.uml2.uml.internal.operations.StructuredActivityNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getNodes <em>Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getEdges <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuredActivityNodeImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl
		extends ActionImpl
		implements StructuredActivityNode {

	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits1 = 0;

	/**
	 * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_ISOLATE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final int MUST_ISOLATE_EFLAG = 1 << 9;

	/**
	 * The flag representing whether the Must Isolate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MUST_ISOLATE_ESETFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRUCTURED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(
				UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(
					Element.class,
					this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT,
					new int[]{
						UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__INPUT,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedMembers() {
		List ownedMember = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER,
					new int[]{UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name) {
		for (Iterator i = getOwnedMembers().iterator(); i.hasNext();) {
			NamedElement ownedMember = (NamedElement) i.next();
			if (name.equals(ownedMember.getName())) {
				return ownedMember;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMembers() {
		List member = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER);
		if (member == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER,
				member = new DerivedUnionEObjectEList(NamedElement.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER, new int[]{
						UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER,
						UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER}));
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name) {
		for (Iterator i = getMembers().iterator(); i.hasNext();) {
			NamedElement member = (NamedElement) i.next();
			if (name.equals(member.getName())) {
				return member;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getElementImports() {
		List elementImport = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT);
		if (elementImport == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT,
				elementImport = new EObjectContainmentWithInverseEList(
					ElementImport.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT,
					UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE));
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport() {
		ElementImport newElementImport = UMLFactory.eINSTANCE
			.createElementImport();
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPackageImports() {
		List packageImport = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT);
		if (packageImport == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT,
				packageImport = new EObjectContainmentWithInverseEList(
					PackageImport.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT,
					UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE));
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(EClass eClass) {
		PackageImport newPackageImport = (PackageImport) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport() {
		PackageImport newPackageImport = UMLFactory.eINSTANCE
			.createPackageImport();
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedRules() {
		List ownedRule = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE);
		if (ownedRule == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE,
				ownedRule = new EObjectContainmentWithInverseEList(
					Constraint.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE,
					UMLPackage.CONSTRAINT__CONTEXT));
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule(EClass eClass) {
		Constraint newOwnedRule = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createOwnedRule() {
		Constraint newOwnedRule = UMLFactory.eINSTANCE.createConstraint();
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name) {
		for (Iterator i = getOwnedRules().iterator(); i.hasNext();) {
			Constraint ownedRule = (Constraint) i.next();
			if (name.equals(ownedRule.getName())) {
				return ownedRule;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getImportedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			List result = (List) cache.get(this,
				UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER,
					result = NamespaceOperations.getImportedMembers(this));
			}
			return result;
		}
		return NamespaceOperations.getImportedMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name) {
		for (Iterator i = getImportedMembers().iterator(); i.hasNext();) {
			PackageableElement importedMember = (PackageableElement) i.next();
			if (name.equals(importedMember.getName())) {
				return importedMember;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSubgroups() {
		List subgroup = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP);
		if (subgroup == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP,
				subgroup = new DerivedUnionEObjectEList(ActivityGroup.class,
					this, UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP,
					new int[]{}));
		}
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getContainedNodes() {
		List containedNode = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE);
		if (containedNode == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE,
				containedNode = new DerivedUnionEObjectEList(
					ActivityNode.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE,
					new int[]{UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE}));
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name) {
		for (Iterator i = getContainedNodes().iterator(); i.hasNext();) {
			ActivityNode containedNode = (ActivityNode) i.next();
			if (name.equals(containedNode.getName())) {
				return containedNode;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getContainedEdges() {
		List containedEdge = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE);
		if (containedEdge == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE,
				containedEdge = new DerivedUnionEObjectEList(
					ActivityEdge.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE,
					new int[]{UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE}));
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name) {
		for (Iterator i = getContainedEdges().iterator(); i.hasNext();) {
			ActivityEdge containedEdge = (ActivityEdge) i.next();
			if (name.equals(containedEdge.getName())) {
				return containedEdge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getVariables() {
		List variable = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE);
		if (variable == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE,
				variable = new EObjectContainmentWithInverseEList(
					Variable.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE,
					UMLPackage.VARIABLE__SCOPE));
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		Variable newVariable = UMLFactory.eINSTANCE.createVariable();
		getVariables().add(newVariable);
		return newVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable(String name) {
		for (Iterator i = getVariables().iterator(); i.hasNext();) {
			Variable variable = (Variable) i.next();
			if (name.equals(variable.getName())) {
				return variable;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNodes() {
		List node = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE);
		if (node == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE,
				node = new EObjectContainmentWithInverseEList(
					ActivityNode.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE,
					UMLPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE));
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createNode(EClass eClass) {
		ActivityNode newNode = (ActivityNode) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getNodes().add(newNode);
		return newNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getNode(String name) {
		for (Iterator i = getNodes().iterator(); i.hasNext();) {
			ActivityNode node = (ActivityNode) i.next();
			if (name.equals(node.getName())) {
				return node;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustIsolate() {
		return (eFlags & MUST_ISOLATE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(boolean newMustIsolate) {
		boolean oldMustIsolate = (eFlags & MUST_ISOLATE_EFLAG) != 0;
		if (newMustIsolate)
			eFlags |= MUST_ISOLATE_EFLAG;
		else
			eFlags &= ~MUST_ISOLATE_EFLAG;
		boolean oldMustIsolateESet = (eFlags & MUST_ISOLATE_ESETFLAG) != 0;
		eFlags |= MUST_ISOLATE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE,
				oldMustIsolate, newMustIsolate, !oldMustIsolateESet));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMustIsolate() {
		boolean oldMustIsolate = (eFlags & MUST_ISOLATE_EFLAG) != 0;
		boolean oldMustIsolateESet = (eFlags & MUST_ISOLATE_ESETFLAG) != 0;
		if (MUST_ISOLATE_EDEFAULT)
			eFlags |= MUST_ISOLATE_EFLAG;
		else
			eFlags &= ~MUST_ISOLATE_EFLAG;
		eFlags &= ~MUST_ISOLATE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE,
				oldMustIsolate, MUST_ISOLATE_EDEFAULT, oldMustIsolateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMustIsolate() {
		return (eFlags & MUST_ISOLATE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEdges() {
		List edge = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE);
		if (edge == null) {
			eVirtualSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE,
				edge = new EObjectContainmentWithInverseEList(
					ActivityEdge.class, this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE,
					UMLPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE));
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createEdge(EClass eClass) {
		ActivityEdge newEdge = (ActivityEdge) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getEdges().add(newEdge);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createEdge() {
		ActivityEdge newEdge = UMLFactory.eINSTANCE.createActivityEdge();
		getEdges().add(newEdge);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdge(String name) {
		for (Iterator i = getEdges().iterator(); i.hasNext();) {
			ActivityEdge edge = (ActivityEdge) i.next();
			if (name.equals(edge.getName())) {
				return edge;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity getActivity() {
		if (eContainerFeatureID != UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY
			&& eContainerFeatureID != UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setActivity(Activity newActivity) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivity() {
		return getActivity() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersDistinguishable(DiagnosticChain diagnostics,
			Map context) {
		return NamespaceOperations.validateMembersDistinguishable(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNamesOfMember(NamedElement element) {
		return NamespaceOperations.getNamesOfMember(this, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		return NamespaceOperations.membersAreDistinguishable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List importMembers(List imps) {
		return NamespaceOperations.importMembers(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List excludeCollisions(List imps) {
		return NamespaceOperations.excludeCollisions(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodesAndEdges(DiagnosticChain diagnostics,
			Map context) {
		return ActivityGroupOperations.validateNodesAndEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotContained(DiagnosticChain diagnostics, Map context) {
		return ActivityGroupOperations.validateNotContained(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupOwned(DiagnosticChain diagnostics, Map context) {
		return ActivityGroupOperations.validateGroupOwned(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdges(DiagnosticChain diagnostics, Map context) {
		return StructuredActivityNodeOperations.validateEdges(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				return ((InternalEList) getOutgoings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				return ((InternalEList) getIncomings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				return ((InternalEList) getHandlers()).basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				return ((InternalEList) getVariables())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				return ((InternalEList) getNodes()).basicAdd(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				return ((InternalEList) getEdges()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return eBasicSetContainer(null,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				return eBasicSetContainer(null,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				return ((InternalEList) getVariables()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				return ((InternalEList) getNodes()).basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				return ((InternalEList) getEdges()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				return getName();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				return getHandlers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT :
				return getOutputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INPUT :
				return getInputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT :
				return getContext();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER :
				return getMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP :
				return getSubgroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP :
				return getSuperGroup();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE :
				return getContainedNodes();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				return getInActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE :
				return getContainedEdges();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				return getVariables();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				return getNodes();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				return isMustIsolate()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				return getEdges();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				setInActivity((Activity) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				getVariables().clear();
				getVariables().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				getNodes().clear();
				getNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				setMustIsolate(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				getEdges().clear();
				getEdges().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				setInActivity((Activity) null);
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				getVariables().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				getNodes().clear();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				unsetMustIsolate();
				return;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				getEdges().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY :
				return eVirtualGet(
					UMLPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING :
				List outgoing = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION :
				List inPartition = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY :
				return isSetActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING :
				List incoming = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION :
				List inInterruptibleRegion = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE :
				List redefinedNode = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER :
				List handler = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__HANDLER);
				return handler != null && !handler.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT :
				return isSetOutputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__INPUT :
				return isSetInputs();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT :
				return getContext() != null;
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION :
				List localPrecondition = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION);
				return localPrecondition != null
					&& !localPrecondition.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION :
				List localPostcondition = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION);
				return localPostcondition != null
					&& !localPostcondition.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER :
				return isSetMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP :
				return isSetSubgroups();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP :
				return isSetSuperGroup();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE :
				return isSetContainedNodes();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
				return isSetInActivity();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE :
				return isSetContainedEdges();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE :
				List variable = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE);
				return variable != null && !variable.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE :
				List node = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE);
				return node != null && !node.isEmpty();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE :
				return isSetMustIsolate();
			case UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE :
				List edge = (List) eVirtualGet(UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE);
				return edge != null && !edge.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT :
					return UMLPackage.NAMESPACE__ELEMENT_IMPORT;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT :
					return UMLPackage.NAMESPACE__PACKAGE_IMPORT;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE :
					return UMLPackage.NAMESPACE__OWNED_RULE;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER :
					return UMLPackage.NAMESPACE__MEMBER;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER :
					return UMLPackage.NAMESPACE__IMPORTED_MEMBER;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER :
					return UMLPackage.NAMESPACE__OWNED_MEMBER;
				default :
					return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP :
					return UMLPackage.ACTIVITY_GROUP__SUBGROUP;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP :
					return UMLPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE :
					return UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY :
					return UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY;
				case UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE :
					return UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case UMLPackage.NAMESPACE__ELEMENT_IMPORT :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
				case UMLPackage.NAMESPACE__PACKAGE_IMPORT :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
				case UMLPackage.NAMESPACE__OWNED_RULE :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
				case UMLPackage.NAMESPACE__MEMBER :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__MEMBER;
				case UMLPackage.NAMESPACE__IMPORTED_MEMBER :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
				case UMLPackage.NAMESPACE__OWNED_MEMBER :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;
				default :
					return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UMLPackage.ACTIVITY_GROUP__SUBGROUP :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
				case UMLPackage.ACTIVITY_GROUP__SUPER_GROUP :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case UMLPackage.ACTIVITY_GROUP__CONTAINED_NODE :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
				case UMLPackage.ACTIVITY_GROUP__IN_ACTIVITY :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
				case UMLPackage.ACTIVITY_GROUP__CONTAINED_EDGE :
					return UMLPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			case 1 :
				return eVirtualIndexBits1;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			case 1 :
				eVirtualIndexBits1 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mustIsolate: "); //$NON-NLS-1$
		if ((eFlags & MUST_ISOLATE_ESETFLAG) != 0)
			result.append((eFlags & MUST_ISOLATE_EFLAG) != 0);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT)
			|| eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT)
			|| isSetOwnedMembers() || isSetSubgroups();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE)
			|| eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER)
			|| isSetOwnedMembers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubgroups() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperGroup() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (isSetSuperGroup()) {
			return getSuperGroup();
		}
		if (isSetInActivity()) {
			return getInActivity();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner() || isSetSuperGroup() || isSetInActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedEdges() {
		return eIsSet(UMLPackage.STRUCTURED_ACTIVITY_NODE__EDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInActivity() {
		return getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		setActivity(newInActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInActivity() {
		return false;
	}

} //StructuredActivityNodeImpl
