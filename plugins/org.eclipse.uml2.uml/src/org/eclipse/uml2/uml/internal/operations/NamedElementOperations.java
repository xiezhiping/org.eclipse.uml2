/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 374878, 418466, 433211, 451350, 485756, 495564
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Named Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Needs Ownership</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateHasQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateHasNoQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has No Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#createDependency(org.eclipse.uml2.uml.NamedElement) <em>Create Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#createUsage(org.eclipse.uml2.uml.NamedElement) <em>Create Usage</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getLabel() <em>Get Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getLabel(boolean) <em>Get Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#allNamespaces() <em>All Namespaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#allOwningPackages() <em>All Owning Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getQualifiedName() <em>Get Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#separator() <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is no name, or one of the containing Namespaces has no name, there is no qualifiedName.
	 * name=null or allNamespaces()->select( ns | ns.name=null )->notEmpty() implies qualifiedName = null
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasNoQualifiedName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateHasNoQualifiedName", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(namedElement, context)}),
					new Object[]{namedElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing Namespaces have a name, the qualifiedName is constructed from the name of the NamedElement and the names of the containing Namespaces.
	 * (name <> null and allNamespaces()->select(ns | ns.name = null)->isEmpty()) implies
	 *   qualifiedName = allNamespaces()->iterate( ns : Namespace; agg: String = name | ns.name.concat(self.separator()).concat(agg))
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasQualifiedName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMED_ELEMENT__HAS_QUALIFIED_NAME,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateHasQualifiedName", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(namedElement, context)}),
					new Object[]{namedElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a NamedElement is owned by something other than a Namespace, it does not have a visibility. One that is not owned by anything (and hence must be a Package, as this is the only kind of NamedElement that overrides mustBeOwned()) may have a visibility.
	 * (namespace = null and owner <> null) implies visibility = null
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateVisibilityNeedsOwnership(
			NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		if (namedElement.getNamespace() == null && namedElement
			.eIsSet(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY)) {

			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP,
					UMLPlugin.INSTANCE.getString(
						"_UI_NamedElement_VisibilityNeedsOwnership_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, namedElement)),
					new Object[]{namedElement}));
			}
		}

		return result;
	}

	protected static Dependency createDependency(NamedElement namedElement,
			NamedElement supplier, EClass eClass) {
		org.eclipse.uml2.uml.Package package_ = namedElement
			.getNearestPackage();

		if (package_ == null) {
			throw new IllegalStateException();
		}

		if (supplier == null) {
			throw new IllegalArgumentException(String.valueOf(supplier));
		}

		Dependency dependency = (Dependency) package_
			.createPackagedElement(null, eClass);

		dependency.getClients().add(namedElement);
		dependency.getSuppliers().add(supplier);

		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a dependency between this named element and the specified supplier, owned by this named element's nearest package.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param supplier The supplier for the new dependency.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Dependency createDependency(NamedElement namedElement,
			NamedElement supplier) {
		return createDependency(namedElement, supplier,
			UMLPackage.Literals.DEPENDENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves a localized label for this named element.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getLabel(NamedElement namedElement) {
		return namedElement.getLabel(true);
	}

	protected static final String LABEL_KEY_PREFIX = "_label_"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves a label for this named element, localized if indicated.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param localize Whether to localize the label.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getLabel(NamedElement namedElement, boolean localize) {
		String qualifiedName = namedElement.getQualifiedName();
		return getString(namedElement,
			LABEL_KEY_PREFIX + getValidJavaIdentifier(isEmpty(qualifiedName)
				? EMPTY_STRING
				: qualifiedName.replace(':', '_')),
			namedElement.getName(), localize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a usage between this named element and the specified supplier, owned by this named element's nearest package.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param supplier The supplier for the new usage.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Usage createUsage(NamedElement namedElement,
			NamedElement supplier) {
		return (Usage) createDependency(namedElement, supplier,
			UMLPackage.Literals.USAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a NamedElement has a name, and all of its containing Namespaces have a name, the qualifiedName is constructed from the name of the NamedElement and the names of the containing Namespaces.
	 * result = (if self.name <> null and self.allNamespaces()->select( ns | ns.name=null )->isEmpty()
	 * then 
	 *     self.allNamespaces()->iterate( ns : Namespace; agg: String = self.name | ns.name.concat(self.separator()).concat(agg))
	 * else
	 *    null
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getQualifiedName(NamedElement namedElement) {
		return getQualifiedName(namedElement, namedElement.separator());
	}

	protected static EList<Namespace> allNamespaces(NamedElement namedElement,
			EList<Namespace> allNamespaces) {
		Namespace namespace = namedElement.getNamespace();

		Element owner = namedElement.getOwner();

		if (owner instanceof TemplateParameter) {
			TemplateSignature signature = ((TemplateParameter) owner)
				.getSignature();

			if (signature != null) {
				TemplateableElement template = signature.getTemplate();

				if (template instanceof Namespace) {
					namespace = (Namespace) template;
				}
			}
		}

		if (namespace != null && allNamespaces.add(namespace)) {
			allNamespaces(namespace, allNamespaces);
		}

		return allNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of Namespaces in which the NamedElement is nested, working outwards.
	 * result = (
	 * if owner = null
	 *   then OrderedSet{}
	 * else
	 *   let enclosingNamespace : Namespace =
	 *     if owner.oclIsKindOf(TemplateParameter) and owner.oclAsType(TemplateParameter).signature.template.oclIsKindOf(Namespace)
	 *       then owner.oclAsType(TemplateParameter).signature.template.oclAsType(Namespace)
	 *     else
	 *       namespace
	 *     endif
	 *   in enclosingNamespace.allNamespaces()->prepend(enclosingNamespace)
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Namespace> allNamespaces(NamedElement namedElement) {
		return ECollections.unmodifiableEList(allNamespaces(namedElement,
			new UniqueEList.FastCompare<Namespace>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically co-exist within a Namespace. By default, two named elements are distinguishable if (a) they have types neither of which is a kind of the other or (b) they have different names.
	 * result = ((self.oclIsKindOf(n.oclType()) or n.oclIsKindOf(self.oclType())) implies
	 *     ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
	 * )
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(NamedElement namedElement,
			NamedElement n, Namespace ns) {
		EClass eClass = namedElement.eClass();
		EClass nEClass = n.eClass();

		if (nEClass.isSuperTypeOf(eClass) || eClass.isSuperTypeOf(nEClass)) {
			EList<String> namesOfN = ns.getNamesOfMember(n);

			for (String nameOfNamedElement : ns
				.getNamesOfMember(namedElement)) {

				if (namesOfN.contains(nameOfNamedElement)) {
					return false;
				}
			}
		}

		return true;
	}

	protected static final List<EStructuralFeature> NAMESPACE__MEMBER__ALL_SUBSETS = getAllSubsetFeatures(
		UMLPackage.Literals.NAMESPACE__MEMBER);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Namespace getNamespace(NamedElement namedElement) {
		InternalEObject eInternalContainer = ((InternalEObject) namedElement)
			.eInternalContainer();

		return eInternalContainer instanceof Namespace
			&& NAMESPACE__MEMBER__ALL_SUBSETS
				.contains(namedElement.eContainingFeature())
					? (Namespace) eInternalContainer
					: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualifiedName.
	 * result = ('::')
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String separator(NamedElement namedElement) {
		return NamedElement.SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = (Dependency.allInstances()->select(d | d.client->includes(self)))
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Dependency> getClientDependencies(
			NamedElement namedElement) {
		EList<Dependency> clientDependency = new UniqueEList.FastCompare<Dependency>();

		for (EStructuralFeature.Setting nonNavigableInverseReference : getNonNavigableInverseReferences(
			namedElement)) {

			if (nonNavigableInverseReference
				.getEStructuralFeature() == UMLPackage.Literals.DEPENDENCY__CLIENT) {
				clientDependency.add(
					(Dependency) nonNavigableInverseReference.getEObject());
			}
		}

		return new UnionEObjectEList<Dependency>((InternalEObject) namedElement,
			UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY,
			clientDependency.size(), clientDependency.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwningPackages() returns the set of all the enclosing Namespaces of this NamedElement, working outwards, that are Packages, up to but not including the first such Namespace that is not a Package.
	 * result = (if namespace.oclIsKindOf(Package)
	 * then
	 *   let owningPackage : Package = namespace.oclAsType(Package) in
	 *     owningPackage->union(owningPackage.allOwningPackages())
	 * else
	 *   null
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<org.eclipse.uml2.uml.Package> allOwningPackages(
			NamedElement namedElement) {
		EList<org.eclipse.uml2.uml.Package> allOwningPackages = new UniqueEList.FastCompare<org.eclipse.uml2.uml.Package>();

		while ((namedElement = (NamedElement) getOwningElement(namedElement,
			UMLPackage.Literals.PACKAGE, true)) != null) {

			allOwningPackages.add((org.eclipse.uml2.uml.Package) namedElement);
		}

		return ECollections.unmodifiableEList(allOwningPackages);
	}

} // NamedElementOperations