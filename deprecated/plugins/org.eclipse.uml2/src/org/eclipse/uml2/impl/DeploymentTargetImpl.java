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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.DeployedArtifact;
import org.eclipse.uml2.Deployment;
import org.eclipse.uml2.DeploymentTarget;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.Manifestation;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.internal.util.SupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentTargetImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DeploymentTargetImpl#getDeployedElements <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeploymentTargetImpl extends NamedElementImpl implements DeploymentTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList deployment = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDeploymentTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * <p>
	 * Subsets the following features:
	 * <ul>
	 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements}</li>
	 *   <li>{@link org.eclipse.uml2.NamedElement#getClientDependencies}</li>
	 * </ul>
	 * </p>
	 * @generated
	 */
	public EList getDeployments() {
		// TODO: test this subset getter
		if (deployment == null) {
			deployment = new SubsetEObjectContainmentWithInverseEList(Deployment.class, this, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, new int[] {UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY}, UML2Package.DEPLOYMENT__LOCATION);
		}
		return deployment;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Deployment getDeployment(String unqualifiedName) {
    	for (Iterator i = getDeployments().iterator(); i.hasNext(); ) {
    		Deployment namedDeployment = (Deployment) i.next();
    		
    		if (unqualifiedName.equals(namedDeployment.getName())) {
    			return namedDeployment;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment(EClass eClass) {
		Deployment newDeployment = (Deployment) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.CREATE, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, null, newDeployment));
		}
		getDeployments().add(newDeployment);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns the derived value of the '<em><b>Deployed Element</b></em>' reference list.
	 * @generated
	 */
	public EList getDeployedElementsGen() {
		// TODO: implement this derived getter to return the 'Deployed Element' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public EList getDeployedElements() {
		// TODO: test this derived getter
	    if (!getCacheAdapter().containsKey(this, UML2Package.eINSTANCE.getDeploymentTarget_DeployedElement())) {
	        Set deployedElement = new HashSet();
	        
	        for (Iterator deployments = getDeployments().iterator(); deployments.hasNext();) {
	            
	            for (Iterator deployedArtifacts = ((Deployment) deployments.next()).getDeployedArtifacts().iterator(); deployedArtifacts.hasNext();) {
	                DeployedArtifact deployedArtifact = (DeployedArtifact) deployedArtifacts.next();
	                
	                if (Artifact.class.isInstance(deployedArtifact)) {
	                    
	                    for (Iterator manifestations = ((Artifact) deployedArtifact).getManifestations().iterator(); manifestations.hasNext();) {
	                        deployedElement.add(((Manifestation) manifestations.next()).getUtilizedElement());
	                    }
	                }
	            }
	        }
	        
	        getCacheAdapter().put(
	                this,
	                UML2Package.eINSTANCE.getDeploymentTarget_DeployedElement(),
	                new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getDeploymentTarget_DeployedElement(), deployedElement.size(), deployedElement
	                        .toArray()));
	    }
	    
	    return (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getDeploymentTarget_DeployedElement());
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public PackageableElement getDeployedElement(String unqualifiedName) {
    	for (Iterator i = getDeployedElements().iterator(); i.hasNext(); ) {
    		PackageableElement namedDeployedElement = (PackageableElement) i.next();
    		
    		if (unqualifiedName.equals(namedDeployedElement.getName())) {
    			return namedDeployedElement;
    		}
    	}
    	
    	return null;
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
			union.addAll(getDeployments());
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
			clientDependency = new SupersetEObjectWithInverseResolvingEList.ManyInverse(Dependency.class, this, UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY, new int[] {UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT}, UML2Package.DEPENDENCY__CLIENT);
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
				case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
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
				case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
					return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.DEPLOYMENT_TARGET__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				return getName();
			case UML2Package.DEPLOYMENT_TARGET__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				return getVisibility();
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return getDeployments();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				return getDeployedElements();
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
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				setName((String)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				getDeployments().clear();
				getDeployments().addAll((Collection)newValue);
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
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				getDeployments().clear();
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
			case UML2Package.DEPLOYMENT_TARGET__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__OWNER:
				return basicGetOwner() != null;
			case UML2Package.DEPLOYMENT_TARGET__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.DEPLOYMENT_TARGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.DEPLOYMENT_TARGET__QUALIFIED_NAME:
				return !"".equals(getQualifiedName()); //$NON-NLS-1$
			case UML2Package.DEPLOYMENT_TARGET__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				return !getDeployedElements().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //DeploymentTargetImpl
