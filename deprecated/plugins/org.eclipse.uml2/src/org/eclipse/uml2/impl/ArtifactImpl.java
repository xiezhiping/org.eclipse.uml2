/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectContainmentEList;
import org.eclipse.uml2.internal.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getNestedArtifacts <em>Nested Artifact</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ArtifactImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends ClassifierImpl implements Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedArtifacts() <em>Nested Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList nestedArtifact = null;

	/**
	 * The cached value of the '{@link #getManifestations() <em>Manifestation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestations()
	 * @generated
	 * @ordered
	 */
	protected EList manifestation = null;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList ownedOperation = null;

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList ownedAttribute = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getArtifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName == null ? FILE_NAME_EDEFAULT : newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ARTIFACT__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * @generated
	 */
	public EList getNestedArtifacts() {
		if (nestedArtifact == null) {
			nestedArtifact = new EObjectContainmentEList(Artifact.class, this, UML2Package.ARTIFACT__NESTED_ARTIFACT);
		}
		return nestedArtifact;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Artifact getNestedArtifact(String unqualifiedName) {
    	for (Iterator i = getNestedArtifacts().iterator(); i.hasNext(); ) {
    		Artifact namedNestedArtifact = (Artifact) i.next();
    		
    		if (unqualifiedName.equals(namedNestedArtifact.getName())) {
    			return namedNestedArtifact;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createNestedArtifact(EClass eClass) {
		Artifact newNestedArtifact = (Artifact) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.ARTIFACT__NESTED_ARTIFACT, null, newNestedArtifact));
		}
		getNestedArtifacts().add(newNestedArtifact);
		return newNestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getClientDependencies}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getManifestations() {
		// TODO: test this subset getter
		if (manifestation == null) {
			manifestation = new SubsetEObjectContainmentEList(Manifestation.class, this, UML2Package.ARTIFACT__MANIFESTATION, new int[] {UML2Package.ARTIFACT__CLIENT_DEPENDENCY});
		}
		return manifestation;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Manifestation getManifestation(String unqualifiedName) {
    	for (Iterator i = getManifestations().iterator(); i.hasNext(); ) {
    		Manifestation namedManifestation = (Manifestation) i.next();
    		
    		if (unqualifiedName.equals(namedManifestation.getName())) {
    			return namedManifestation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation createManifestation(EClass eClass) {
		Manifestation newManifestation = (Manifestation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.ARTIFACT__MANIFESTATION, null, newManifestation));
		}
		getManifestations().add(newManifestation);
		return newManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Classifier#getFeatures}</li>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedOperations() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList(Operation.class, this, UML2Package.ARTIFACT__OWNED_OPERATION);
		}
		return ownedOperation;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Operation getOwnedOperation(String unqualifiedName) {
    	for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
    		Operation namedOwnedOperation = (Operation) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedOperation.getName())) {
    			return namedOwnedOperation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(EClass eClass) {
		Operation newOwnedOperation = (Operation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.ARTIFACT__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Classifier#getAttributes}</li>
	 *   <li>{@link org.eclipse.uml2.Namespace#getOwnedMembers}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getOwnedAttributes() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList(Property.class, this, UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getOwnedAttribute(String unqualifiedName) {
    	for (Iterator i = getOwnedAttributes().iterator(); i.hasNext(); ) {
    		Property namedOwnedAttribute = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedAttribute.getName())) {
    			return namedOwnedAttribute;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.ARTIFACT__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Feature</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Feature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Feature#getFeaturingClassifiers <em>Featuring Classifier</em>}'.
	 * @generated
	 */
	public EList getFeatures() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_Feature())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getFeatures());
			union.addAll(getOwnedOperations());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier_Feature(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getClassifier_Feature(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Feature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.NamedElement#getNamespace <em>Namespace</em>}'.
	 * @generated
	 */
	public EList getOwnedMembers() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getArtifact().getEAllOperations().get(72))) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getOwnedOperations());
			union.addAll(getOwnedAttributes());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getArtifact().getEAllOperations().get(72),
				new BasicEList.UnmodifiableEList(union.size(), union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getArtifact().getEAllOperations().get(72));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * @generated
	 */
	public EList getAttributes() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getClassifier_Attribute())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getAttributes());
			union.addAll(getOwnedAttributes());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getClassifier_Attribute(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getClassifier_Attribute(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Attribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list, a derived union.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * @generated
	 */
	public EList getOwnedElements() {
		// TODO: test this union getter
		if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getElement_OwnedElement())) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			union.addAll(getManifestations());
			getCacheAdapter().put(
				this,
				UML2Package.eINSTANCE.getElement_OwnedElement(),
				new EcoreEList.UnmodifiableEList(this, 
					UML2Package.eINSTANCE.getElement_OwnedElement(),
					union.size(),
					union.toArray()));
		}
		return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Dependency}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Dependency#getClients <em>Client</em>}'.
	 * @generated
	 */
	public EList getClientDependencies() {
		// TODO: test this superset getter
		if (clientDependency == null) {
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.ARTIFACT__CLIENT_DEPENDENCY, new int[] {UML2Package.ARTIFACT__SUBSTITUTION, UML2Package.ARTIFACT__MANIFESTATION}, UML2Package.DEPENDENCY__CLIENT);
		}
		return clientDependency;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ARTIFACT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ARTIFACT__OWNING_PARAMETER, msgs);
				case UML2Package.ARTIFACT__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.ARTIFACT__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ARTIFACT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.ARTIFACT__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.ARTIFACT__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.ARTIFACT__OWNING_PARAMETER, msgs);
				case UML2Package.ARTIFACT__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__NESTED_ARTIFACT:
					return ((InternalEList)getNestedArtifacts()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__MANIFESTATION:
					return ((InternalEList)getManifestations()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.ARTIFACT__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ARTIFACT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ARTIFACT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ARTIFACT__NAME:
				return getName();
			case UML2Package.ARTIFACT__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ARTIFACT__VISIBILITY:
				return getVisibility();
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ARTIFACT__MEMBER:
				return getMembers();
			case UML2Package.ARTIFACT__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.ARTIFACT__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ARTIFACT__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.ARTIFACT__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ARTIFACT__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ARTIFACT__FEATURE:
				return getFeatures();
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ARTIFACT__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.ARTIFACT__GENERAL:
				return getGenerals();
			case UML2Package.ARTIFACT__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.ARTIFACT__ATTRIBUTE:
				return getAttributes();
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.ARTIFACT__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.ARTIFACT__REPRESENTATION:
				return getRepresentation();
			case UML2Package.ARTIFACT__OCCURRENCE:
				return getOccurrences();
			case UML2Package.ARTIFACT__FILE_NAME:
				return getFileName();
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return getNestedArtifacts();
			case UML2Package.ARTIFACT__MANIFESTATION:
				return getManifestations();
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ARTIFACT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ARTIFACT__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ARTIFACT__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.ARTIFACT__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifacts().clear();
				getNestedArtifacts().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__MANIFESTATION:
				getManifestations().clear();
				getManifestations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
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
			case UML2Package.ARTIFACT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ARTIFACT__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				setOwningParameter(null);
				return;
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.ARTIFACT__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.ARTIFACT__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.ARTIFACT__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.ARTIFACT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifacts().clear();
				return;
			case UML2Package.ARTIFACT__MANIFESTATION:
				getManifestations().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.ARTIFACT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ARTIFACT__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.ARTIFACT__OWNER:
				return basicGetOwner() != null;
			case UML2Package.ARTIFACT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ARTIFACT__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ARTIFACT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ARTIFACT__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.ARTIFACT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ARTIFACT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ARTIFACT__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ARTIFACT__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.ARTIFACT__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.ARTIFACT__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ARTIFACT__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.ARTIFACT__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.ARTIFACT__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ARTIFACT__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ARTIFACT__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.ARTIFACT__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.ARTIFACT__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.ARTIFACT__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.ARTIFACT__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.ARTIFACT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.ARTIFACT__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ARTIFACT__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.ARTIFACT__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.ARTIFACT__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.ARTIFACT__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.ARTIFACT__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.ARTIFACT__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.ARTIFACT__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.ARTIFACT__REPRESENTATION:
				return representation != null;
			case UML2Package.ARTIFACT__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.ARTIFACT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case UML2Package.ARTIFACT__MANIFESTATION:
				return manifestation != null && !manifestation.isEmpty();
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: "); //$NON-NLS-1$
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
