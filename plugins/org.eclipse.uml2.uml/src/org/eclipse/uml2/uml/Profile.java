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
 * $Id: Profile.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Profile is a kind of Package that extends a reference metamodel. The primary extension construct is the Stereotype, which are defined as part of Profiles.
 * 
 * 
 * 
 * A profile introduces several constraints, or restrictions, on ordinary metamodeling through the use of the metaclasses defined in this package.
 * 
 * 
 * 
 * A profile is a restricted form of a metamodel that must always be related to a reference metamodel, such as UML, as described below. A profile cannot be used without its reference metamodel, and defines a limited capability to extendmetaclasses of the reference metamodel. The extensions are defined as stereotypes that apply to existing metaclasses.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile
		extends org.eclipse.uml2.uml.Package {

	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Stereotypes that are owned by the Profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_OwnedStereotype()
	 * @model type="org.eclipse.uml2.uml.Stereotype" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getOwnedStereotypes();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Stereotype} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedStereotypes()
	 * @generated
	 */
	Stereotype getOwnedStereotype(String name);

	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a metaclass that may be extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_MetaclassReference()
	 * @model type="org.eclipse.uml2.uml.ElementImport" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getMetaclassReferences();

	/**
	 * Returns the value of the '<em><b>Metamodel Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a package containing (directly or indirectly) metaclasses that may be extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_MetamodelReference()
	 * @model type="org.eclipse.uml2.uml.PackageImport" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getMetamodelReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element imported as a metaclassReference is not specialized or generalized in a Profile.
	 * self.metaclassReference.importedElement->
	 * 
	 *   select(c | c.oclIsKindOf(Classifier) and
	 * 
	 *     (c.generalization.namespace = self or
	 * 
	 *       (c.specialization.namespace = self) )->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMetaclassReferenceNotSpecialized(
			DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements imported either as metaclassReferences or through metamodelReferences are members of the same base reference metamodel.
	 * self.metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages())->
	 * 
	 *   union(self.metaclassReference.importedElement.allOwningPackages() )->notEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReferencesSameMetamodel(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwningPackages() returns all the directly or indirectly owning packages.
	 * result = self.namespace->select(p | p.oclIsKindOf(Package))->union(p.allOwningPackages())
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Package" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List allOwningPackages();

} // Profile
