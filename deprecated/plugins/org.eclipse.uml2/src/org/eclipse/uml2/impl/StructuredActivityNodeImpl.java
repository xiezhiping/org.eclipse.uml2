/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StructuredActivityNodeImpl.java,v 1.21 2005/05/25 15:21:32 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StructuredActivityNodeImpl#getPackageImports <em>Package Import</em>}</li>
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
	protected EList ownedRule = null;

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList elementImport = null;

	/**
	 * The cached value of the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected EList packageImport = null;

	/**
	 * The cached value of the '{@link #getContainedNodes() <em>Contained Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
    protected EList containedNode = null;

	/**
	 * The cached value of the '{@link #getContainedEdges() <em>Contained Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList containedEdge = null;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList variable = null;

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
		return UML2Package.eINSTANCE.getStructuredActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList member = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getNamespace_Member());
			if (member == null) {
				EList union = getMembersHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getNamespace_Member(), member = new UnionEObjectEList(this, union.size(), union.toArray()));
			}
			return member;
		}
		EList union = getMembersHelper(new UniqueEList());
		return new UnionEObjectEList(this, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getMember(String name) {
		for (Iterator i = getMembers().iterator(); i.hasNext(); ) {
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
	protected EList getOwnedMembersHelper(EList ownedMember) {
		if (ownedRule != null) {
			ownedMember.addAll(ownedRule);
		}
		if (variable != null) {
			ownedMember.addAll(variable);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRule;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getOwnedRule(String name) {
		for (Iterator i = getOwnedRules().iterator(); i.hasNext(); ) {
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
	 * @generated
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
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getNamespace_ImportedMember());

			if (result == null) {
				Set importedMember = importedMember();
				cache.put(this, UML2Package.eINSTANCE
					.getNamespace_ImportedMember(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getNamespace_ImportedMember(),
						importedMember.size(), importedMember.toArray()));
			}

			return result;
		}

		Set importedMember = importedMember();
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getNamespace_ImportedMember(), importedMember.size(),
			importedMember.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public PackageableElement getImportedMember(String name) {
		for (Iterator i = getImportedMembers().iterator(); i.hasNext(); ) {
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
	public EList getElementImports() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList(ElementImport.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
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
	 * @generated
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
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	 * @generated
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
		return superGroup == null ? null : (ActivityGroup)eResolveProxy((InternalEObject)superGroup);
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
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList(Variable.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE, UML2Package.VARIABLE__SCOPE);
		}
		return variable;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Variable getVariable(String name) {
		for (Iterator i = getVariables().iterator(); i.hasNext(); ) {
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
	 * @generated
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
		if (containedNode == null) {
			containedNode = new EObjectContainmentWithInverseEList(ActivityNode.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return containedNode;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityNode getContainedNode(String name) {
		for (Iterator i = getContainedNodes().iterator(); i.hasNext(); ) {
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
		if (containedEdge == null) {
			containedEdge = new EObjectContainmentWithInverseEList(ActivityEdge.class, this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, UML2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return containedEdge;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public ActivityEdge getContainedEdge(String name) {
		for (Iterator i = getContainedEdges().iterator(); i.hasNext(); ) {
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
			Set result = (Set) cache.get(this, UML2Package.eINSTANCE.getNamespace().getEOperations().get(4));
			if (result == null) {
				cache.put(this, UML2Package.eINSTANCE.getNamespace().getEOperations().get(4), result = NamespaceOperations.importedMember(this));
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
	public EList getSubgroups() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getSubgroups", null);
				EList subgroup = (EList) cache.get(eResource(), this, method);
				if (subgroup == null) {
					EList union = getSubgroupsHelper(new UniqueEList());
					cache.put(eResource(), this, method, subgroup = new UnionEObjectEList(this, union.size(), union.toArray()));
				}
				return subgroup;
			} catch (NoSuchMethodException nsme) {
				// do nothing
			}
		}
		EList union = getSubgroupsHelper(new UniqueEList());
		return new UnionEObjectEList(this, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		ActivityGroup superGroup = basicGetSuperGroup();			
		if (superGroup != null) {
			return superGroup;
		}
		Activity activityGroup_activity = getActivityGroup_activity();			
		if (activityGroup_activity != null) {
			return activityGroup_activity;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getSubgroupsHelper(EList subgroup) {
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		Activity activity = basicGetActivity();
		return activity == null ? null : (Activity)eResolveProxy((InternalEObject)activity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Activity basicGetActivity() {
		if (eContainerFeatureID != UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY && eContainerFeatureID != UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY) return null;
		return (Activity)eContainer;
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
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		setActivity(newActivityGroup_activity);
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
				Method method = getClass().getMethod("getOwnedMembers", null);
				EList ownedMember = (EList) cache.get(eResource(), this, method);
				if (ownedMember == null) {
					EList union = getOwnedMembersHelper(new UniqueEList());
					cache.put(eResource(), this, method, ownedMember = new UnionEObjectEList(this, union.size(), union.toArray()));
				}
				return ownedMember;
			} catch (NoSuchMethodException nsme) {
				// do nothing
			}
		}
		EList union = getOwnedMembersHelper(new UniqueEList());
		return new UnionEObjectEList(this, union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getOwnedMember(String name) {
		for (Iterator i = getOwnedMembers().iterator(); i.hasNext(); ) {
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
	protected EList getOwnedElementsHelper(EList ownedElement) {
		super.getOwnedElementsHelper(ownedElement);
		if (elementImport != null) {
			ownedElement.addAll(elementImport);
		}
		if (packageImport != null) {
			ownedElement.addAll(packageImport);
		}
		for (Iterator i = ((InternalEList) getOwnedMembers()).basicIterator(); i.hasNext(); ) {
			ownedElement.add(i.next());
		}
		for (Iterator i = ((InternalEList) getSubgroups()).basicIterator(); i.hasNext(); ) {
			ownedElement.add(i.next());
		}
		return ownedElement;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
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
				case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
					return ((InternalEList)getVariables()).basicAdd(otherEnd, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
					return ((InternalEList)getContainedNodes()).basicAdd(otherEnd, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
					return ((InternalEList)getContainedEdges()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * @see org.eclipse.emf.ecore.impl.EObjectImpl#eDynamicInverseAdd(org.eclipse.emf.ecore.InternalEObject, int, java.lang.Class, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY :
				if (eContainer != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY, msgs);
			default :
				return super.eDynamicInverseAdd(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
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
					return eBasicSetContainer(null, UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
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
				case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
					return ((InternalEList)getVariables()).basicRemove(otherEnd, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
					return ((InternalEList)getContainedNodes()).basicRemove(otherEnd, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
					return ((InternalEList)getContainedEdges()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	public NotificationChain eDynamicInverseRemove(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return eBasicSetContainer(null, UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY, msgs);
			default :
				return super.eDynamicInverseRemove(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
					return eContainer.eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
				case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
				if (resolve) return getContext();
				return basicGetContext();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNER:
				return basicGetOwner() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_GROUP:
				return !getInGroups().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__HANDLER:
				return handler != null && !handler.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OUTPUT:
				return !getOutputs().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__INPUT:
				return !getInputs().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				return basicGetContext() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return basicGetSuperGroup() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity() != null;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
			case UML2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return ((eFlags & MUST_ISOLATE_EFLAG) != 0) != MUST_ISOLATE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY:
				return false;
			case UML2Package.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return false;
		}
		return eIsSetGen(eFeature);
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
	protected EList getMembersHelper(EList member) {
		for (Iterator i = ((InternalEList) getImportedMembers()).basicIterator(); i.hasNext(); ) {
			member.add(i.next());
		}
		for (Iterator i = ((InternalEList) getOwnedMembers()).basicIterator(); i.hasNext(); ) {
			member.add(i.next());
		}
		return member;
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
