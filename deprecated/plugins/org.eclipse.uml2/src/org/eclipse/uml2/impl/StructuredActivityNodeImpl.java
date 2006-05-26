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
 * $Id: StructuredActivityNodeImpl.java,v 1.41 2006/05/26 18:16:42 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityEdge;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.Variable;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.internal.operation.NamespaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getSubgroups <em>Subgroup</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getContainedNodes <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getContainedEdges <em>Contained Edge</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList ownedRules = null;

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList elementImports = null;

	/**
	 * The cached value of the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected EList packageImports = null;

	/**
	 * The cached value of the '{@link #getContainedNodes() <em>Contained Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList containedNodes = null;

	/**
	 * The cached value of the '{@link #getContainedEdges() <em>Contained Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList containedEdges = null;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList variables = null;

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
		return UML2Package.Literals.STRUCTURED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList members = (EList) cache.get(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				List union = getMembersHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER, members = new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray()));
			}
			return members;
		}
		List union = getMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER)
			|| isSetOwnedMembers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getMember(String name) {
		return getMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name, boolean ignoreCase, EClass eClass) {
		memberLoop: for (Iterator i = getMembers().iterator(); i.hasNext(); ) {
			NamedElement member = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(member))
				continue memberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(member.getName()) : name.equals(member.getName())))
				continue memberLoop;
			return member;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		if (eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE)) {
			ownedMembers.addAll(getOwnedRules());
		}
		if (eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE)) {
			ownedMembers.addAll(getVariables());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new EObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRules;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getOwnedRule(String name) {
		return getOwnedRule(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name, boolean ignoreCase, EClass eClass) {
		ownedRuleLoop: for (Iterator i = getOwnedRules().iterator(); i.hasNext(); ) {
			Constraint ownedRule = (Constraint) i.next();
			if (eClass != null && !eClass.isInstance(ownedRule))
				continue ownedRuleLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedRule.getName()) : name.equals(ownedRule.getName())))
				continue ownedRuleLoop;
			return ownedRule;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createOwnedRule(EClass eClass) {
		Constraint newOwnedRule = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, null, newOwnedRule));
		}
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createOwnedRule() {
		Constraint newOwnedRule = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, null, newOwnedRule));
		}
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getImportedMembers() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this,
				UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER);

			if (result == null) {
				Set importedMember = importedMember();
				cache.put(this,
					UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER,
						importedMember.size(), importedMember.toArray()));
			}

			return result;
		}

		Set importedMember = importedMember();
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER, importedMember
				.size(), importedMember.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public PackageableElement getImportedMember(String name) {
		return getImportedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name, boolean ignoreCase, EClass eClass) {
		importedMemberLoop: for (Iterator i = getImportedMembers().iterator(); i.hasNext(); ) {
			PackageableElement importedMember = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(importedMember))
				continue importedMemberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(importedMember.getName()) : name.equals(importedMember.getName())))
				continue importedMemberLoop;
			return importedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementImports() {
		if (elementImports == null) {
			elementImports = new EObjectContainmentWithInverseEList(ElementImport.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImports;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createElementImport() instead.
	 */
	public ElementImport createElementImport(EClass eClass) {
		ElementImport newElementImport = (ElementImport) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, null, newElementImport));
		}
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ElementImport createElementImport() {
		ElementImport newElementImport = UML2Factory.eINSTANCE.createElementImport();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, null, newElementImport));
		}
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		if (packageImports == null) {
			packageImports = new EObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImports;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PackageImport createPackageImport(EClass eClass) {
		PackageImport newPackageImport = (PackageImport) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, null, newPackageImport));
		}
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PackageImport createPackageImport() {
		PackageImport newPackageImport = UML2Factory.eINSTANCE.createPackageImport();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, null, newPackageImport));
		}
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy() ? (ActivityGroup)eResolveProxy((InternalEObject)superGroup) : superGroup;
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
	public ActivityGroup basicGetSuperGroup() {
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
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
		if (newMustIsolate) eFlags |= MUST_ISOLATE_EFLAG; else eFlags &= ~MUST_ISOLATE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, newMustIsolate));


	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersAreDistinguishable(DiagnosticChain diagnostics, Map context) {
		return NamespaceOperations.validateMembersAreDistinguishable(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList(Variable.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE, UML2Package.VARIABLE__SCOPE);
		}
		return variables;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Variable getVariable(String name) {
		return getVariable(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable(String name, boolean ignoreCase) {
		variableLoop: for (Iterator i = getVariables().iterator(); i.hasNext(); ) {
			Variable variable = (Variable) i.next();
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(variable.getName()) : name.equals(variable.getName())))
				continue variableLoop;
			return variable;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createVariable() instead.
	 */
	public Variable createVariable(EClass eClass) {
		Variable newVariable = (Variable) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE, null, newVariable));
		}
		getVariables().add(newVariable);
		return newVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Variable createVariable() {
		Variable newVariable = UML2Factory.eINSTANCE.createVariable();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE, null, newVariable));
		}
		getVariables().add(newVariable);
		return newVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedNodes() {
		if (containedNodes == null) {
			containedNodes = new EObjectContainmentWithInverseEList(ActivityNode.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return containedNodes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedNodes() {
		return containedNodes != null && !containedNodes.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getContainedNode(String name) {
		return getContainedNode(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getContainedNode(String name, boolean ignoreCase, EClass eClass) {
		containedNodeLoop: for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
			ActivityNode containedNode = (ActivityNode) i.next();
			if (eClass != null && !eClass.isInstance(containedNode))
				continue containedNodeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedNode.getName()) : name.equals(containedNode.getName())))
				continue containedNodeLoop;
			return containedNode;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public ActivityNode createContainedNode(EClass eClass) {
		ActivityNode newContainedNode = (ActivityNode) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, null, newContainedNode));
		}
		getContainedNodes().add(newContainedNode);
		return newContainedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedEdges() {
		if (containedEdges == null) {
			containedEdges = new EObjectContainmentWithInverseEList(ActivityEdge.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return containedEdges;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedEdges() {
		return containedEdges != null && !containedEdges.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getContainedEdge(String name) {
		return getContainedEdge(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getContainedEdge(String name, boolean ignoreCase, EClass eClass) {
		containedEdgeLoop: for (Iterator i = getContainedEdges().iterator(); i.hasNext(); ) {
			ActivityEdge containedEdge = (ActivityEdge) i.next();
			if (eClass != null && !eClass.isInstance(containedEdge))
				continue containedEdgeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedEdge.getName()) : name.equals(containedEdge.getName())))
				continue containedEdgeLoop;
			return containedEdge;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActivityEdge createContainedEdge(EClass eClass) {
		ActivityEdge newContainedEdge = (ActivityEdge) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, null, newContainedEdge));
		}
		getContainedEdges().add(newContainedEdge);
		return newContainedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set getNamesOfMember(NamedElement element) {
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
	public boolean validateImportedMemberDerived(DiagnosticChain diagnostics, Map context) {
		return NamespaceOperations.validateImportedMemberDerived(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set importedMember() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.Literals.NAMESPACE.getEOperations().get(4));
			if (result == null) {
				cache.put(this, UML2Package.Literals.NAMESPACE.getEOperations().get(4), result = NamespaceOperations.importedMember(this));
			}
			return result;
		}
		return NamespaceOperations.importedMember(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set importMembers(Set imps) {
		return NamespaceOperations.importMembers(this, imps);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set excludeCollisions(Set imps) {
		return NamespaceOperations.excludeCollisions(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return ((InternalEList)getHandlers()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityGroup_activity((Activity)otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList)getVariables()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicAdd(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return ((InternalEList)getContainedEdges()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList)getVariables()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return ((InternalEList)getContainedEdges()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubgroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getSubgroups", null); //$NON-NLS-1$
				EList subgroups = (EList) cache.get(eResource(), this, method);
				if (subgroups == null) {
					List union = getSubgroupsHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, subgroups = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return subgroups;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getSubgroupsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
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
	public Element basicGetOwner() {
		if (isSetSuperGroup()) {
			return basicGetSuperGroup();
		}
		if (isSetActivityGroup_activity()) {
			return getActivityGroup_activity();
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| isSetSuperGroup()
			|| isSetActivityGroup_activity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getSubgroupsHelper(EList subgroups) {
		return subgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity getActivity() {
		if (eContainerFeatureID != UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY
			&& eContainerFeatureID != UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetActivity() {
		return false;
	}

	public void setActivity(Activity newActivity) {
		// do nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityGroup_activity() {
		return getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetActivityGroup_activity(Activity newActivityGroup_activity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newActivityGroup_activity,
			UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		setActivity(newActivityGroup_activity);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivityGroup_activity() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getOwnedMembers", null); //$NON-NLS-1$
				EList ownedMembers = (EList) cache.get(eResource(), this, method);
				if (ownedMembers == null) {
					List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, ownedMembers = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return ownedMembers;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE)
			|| eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getOwnedMember(String name) {
		return getOwnedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name, boolean ignoreCase, EClass eClass) {
		ownedMemberLoop: for (Iterator i = getOwnedMembers().iterator(); i.hasNext(); ) {
			NamedElement ownedMember = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(ownedMember))
				continue ownedMemberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedMember.getName()) : name.equals(ownedMember.getName())))
				continue ownedMemberLoop;
			return ownedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElements) {
		ownedElements.addAll(super.getOwnedElements());
		if (eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT)) {
			ownedElements.addAll(getElementImports());
		}
		if (eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT)) {
			ownedElements.addAll(getPackageImports());
		}
		if (isSetOwnedMembers()) {
			for (Iterator i = ((InternalEList) getOwnedMembers()).basicIterator(); i.hasNext(); ) {
				ownedElements.add(i.next());
			}
		}
		if (isSetSubgroups()) {
			for (Iterator i = ((InternalEList) getSubgroups()).basicIterator(); i.hasNext(); ) {
				ownedElements.add(i.next());
			}
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList ownedElements = (EList) cache.get(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray()));
			}
			return ownedElements;
		}
		List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT)
			|| eIsSet(UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT)
			|| isSetOwnedMembers()
			|| isSetSubgroups();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT, UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING, UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE, UML2Package.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION, UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER, UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION, UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION, UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME:
				return getName();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VISIBILITY:
				return getVisibility();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return getOutgoings();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return getIncomings();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return getInGroups();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return getInPartitions();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return getHandlers();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EFFECT:
				return getEffect();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return getOutputs();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INPUT:
				return getInputs();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				return getContext();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return getMembers();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariables();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNodes();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdges();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return isMustIsolate() ? Boolean.TRUE : Boolean.FALSE;
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
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariables().clear();
				getVariables().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdges().clear();
				getContainedEdges().addAll((Collection)newValue);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(((Boolean)newValue).booleanValue());
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
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariables().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNodes().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdges().clear();
				return;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
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
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNER:
				return isSetOwner();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return isSetInGroups();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return isSetActivity();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return isSetOutputs();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INPUT:
				return isSetInputs();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				return getContext() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return isSetMembers();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return isSetSuperGroup();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return isSetActivityGroup_activity();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variables != null && !variables.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return isSetContainedNodes();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return isSetContainedEdges();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
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
				case UML2Package.STRUCTURED_ACTIVITY_NODE__MEMBER: return UML2Package.NAMESPACE__MEMBER;
				case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE: return UML2Package.NAMESPACE__OWNED_RULE;
				case UML2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER: return UML2Package.NAMESPACE__IMPORTED_MEMBER;
				case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT: return UML2Package.NAMESPACE__ELEMENT_IMPORT;
				case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT: return UML2Package.NAMESPACE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UML2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return UML2Package.ACTIVITY_GROUP__SUPER_GROUP;
				case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY: return UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY;
				default: return -1;
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
				case UML2Package.NAMESPACE__MEMBER: return UML2Package.STRUCTURED_ACTIVITY_NODE__MEMBER;
				case UML2Package.NAMESPACE__OWNED_RULE: return UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
				case UML2Package.NAMESPACE__IMPORTED_MEMBER: return UML2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
				case UML2Package.NAMESPACE__ELEMENT_IMPORT: return UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
				case UML2Package.NAMESPACE__PACKAGE_IMPORT: return UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UML2Package.ACTIVITY_GROUP__SUPER_GROUP: return UML2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY: return UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mustIsolate: "); //$NON-NLS-1$
		result.append((eFlags & MUST_ISOLATE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList members) {
		EList importedMembers = getImportedMembers();
		if (!importedMembers.isEmpty()) {
			for (Iterator i = ((InternalEList) importedMembers).basicIterator(); i.hasNext(); ) {
				members.add(i.next());
			}
		}
		if (isSetOwnedMembers()) {
			for (Iterator i = ((InternalEList) getOwnedMembers()).basicIterator(); i.hasNext(); ) {
				members.add(i.next());
			}
		}
		return members;
	}

		// <!-- begin-custom-operations -->

	private static Method GET_IMPORTED_PACKAGES = null;

	static {
		try {
			GET_IMPORTED_PACKAGES = StructuredActivityNodeImpl.class.getMethod(
				"getImportedPackages", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#getImportedPackages()
	 */
	public Set getImportedPackages() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this,
				GET_IMPORTED_PACKAGES);

			if (result == null) {
				cache.put(eResource(), this, GET_IMPORTED_PACKAGES,
					result = Collections.unmodifiableSet(NamespaceOperations
						.getImportedPackages(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(NamespaceOperations
			.getImportedPackages(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#importElement(org.eclipse.uml2.VisibilityKind,
	 *      org.eclipse.uml2.PackageableElement)
	 */
	public void importElement(VisibilityKind visibility,
			PackageableElement element) {
		NamespaceOperations.importElement(this, visibility, element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#importPackage(org.eclipse.uml2.VisibilityKind,
	 *      org.eclipse.uml2.Package)
	 */
	public void importPackage(VisibilityKind visibility,
			org.eclipse.uml2.Package package_) {
		NamespaceOperations.importPackage(this, visibility, package_);
	}

	// <!-- end-custom-operations -->

} //StructuredActivityNodeImpl
