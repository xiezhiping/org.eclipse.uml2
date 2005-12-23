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
 * $Id: PropertyOperations.java,v 1.18 2005/12/23 06:48:22 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Property</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateMultiplicityOfComposite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettingContextConforms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Context Conforms</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateNavigablePropertyRedefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Property Redefinition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateSubsettingRules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subsetting Rules</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateNavigableReadonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Navigable Readonly</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDerivedUnionIsDerived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDerivedUnionIsReadOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Union Is Read Only</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateDeploymentTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deployment Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#validateBindingToAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binding To Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isAttribute(org.eclipse.uml2.uml.Property) <em>Is Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getOpposite() <em>Get Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isNavigable() <em>Is Navigable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getDefault() <em>Get Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setDefault(java.lang.String) <em>Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setIsComposite(boolean) <em>Set Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#setOpposite(org.eclipse.uml2.uml.Property) <em>Set Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class PropertyOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PropertyOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A multiplicity of a composite aggregation must not have an upper bound greater than 1.
	 * A multiplicity on an aggregate end of a composite aggregation must not have an upper bound greater than 1.
	 * isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfComposite(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__MULTIPLICITY_OF_COMPOSITE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfComposite", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsetting may only occur when the context of the subsetting property conforms to the context of the subsetted property.
	 * self.subsettedProperty->notEmpty() implies
	 *   (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |
	 *     self.subsettedProperty->forAll(sp |
	 *       sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubsettingContextConforms(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__SUBSETTING_CONTEXT_CONFORMS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSubsettingContextConforms", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefined property must be inherited from a more general classifier containing the redefining property.
	 * if (redefinedProperty->notEmpty()) then
	 * 
	 *   (redefinitionContext->notEmpty() and
	 * 
	 *       redefinedProperty->forAll(rp|
	 * 
	 *         ((redefinitionContext->collect(fc|
	 * 
	 *           fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRedefinedPropertyInherited(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__REDEFINED_PROPERTY_INHERITED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRedefinedPropertyInherited", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subsetting property may strengthen the type of the subsetted property, and its upper bound may be less.
	 * self.subsettedProperty->forAll(sp |
	 *   self.type.conformsTo(sp.type) and
	 *     ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	 *       self.upperBound()<=sp.upperBound() ))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubsettingRules(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__SUBSETTING_RULES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSubsettingRules", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only a navigable property can be marked as readOnly.
	 * isReadOnly implies isNavigable()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNavigableReadonly(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__NAVIGABLE_READONLY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNavigableReadonly", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is derived.
	 * isDerivedUnion implies isDerived
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDerivedUnionIsDerived(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__DERIVED_UNION_IS_DERIVED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDerivedUnionIsDerived", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is read only.
	 * isDerivedUnion implies isReadOnly
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDerivedUnionIsReadOnly(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__DERIVED_UNION_IS_READ_ONLY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDerivedUnionIsReadOnly", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property may not subset a property with the same name.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubsettedPropertyNames(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__SUBSETTED_PROPERTY_NAMES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSubsettedPropertyNames", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Property can be a DeploymentTarget if it is a kind of Node and functions as a part in the internal structure of an encompassing Node.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeploymentTarget(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__DEPLOYMENT_TARGET,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDeploymentTarget", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binding of a property template parameter representing an attribute must be to an attribute.
	 * (isAttribute(self) and (templateParameterSubstitution->notEmpty())
	 * 
	 *   implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBindingToAttribute(Property property,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PROPERTY__BINDING_TO_ATTRIBUTE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBindingToAttribute", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(property, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{property}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isAttribute() is true if the Property is defined as an attribute of some classifier.
	 * result = Classifier.allInstances->exists(c | c.attribute->includes(p))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isAttribute(Property property, Property p) {

		for (Iterator nonNavigableInverseReferences = CacheAdapter.INSTANCE
			.getNonNavigableInverseReferences(p).iterator(); nonNavigableInverseReferences
			.hasNext();) {

			EObject eObject = ((EStructuralFeature.Setting) nonNavigableInverseReferences
				.next()).getEObject();

			if (eObject instanceof Classifier
				&& ((Classifier) eObject).getAttributes().contains(p)) {

				return true;
			}
		}

		return false;
	}

	protected static Property getOtherEnd(Property property) {
		Association association = property.getAssociation();

		if (association != null) {
			List memberEnds = ((InternalEList) association.getMemberEnds())
				.basicList();

			if (memberEnds.size() == 2) {
				return (Property) memberEnds.get(Math.abs(memberEnds
					.indexOf(property) - 1));
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is owned by a class, associated with a binary association, and the other end of the association is also owned by a class, then opposite gives the other end.
	 * result = if owningAssociation->isEmpty() and association.memberEnd->size() = 2
	 *   then
	 *     let otherEnd = (association.memberEnd - self)->any() in
	 *       if otherEnd.owningAssociation->isEmpty() then otherEnd else Set{} endif
	 *     else Set {}
	 *     endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property getOpposite(Property property) {

		if (property.getOwningAssociation() == null) {
			Property otherEnd = getOtherEnd(property);

			if (otherEnd != null && otherEnd.getOwningAssociation() == null) {
				return otherEnd;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of isComposite is true only if aggregation is composite.
	 * result = (self.aggregation = #composite)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isComposite(Property property) {
		return property.getAggregation() == AggregationKind.COMPOSITE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query subsettingContext() gives the context for subsetting a property. It consists, in the case of an attribute, of the corresponding classifier, and in the case of an association end, all of the classifiers at the other ends.
	 * result = if association->notEmpty()
	 * then association.endType-type
	 * else if classifier->notEmpty() then Set{classifier} else Set{} endif
	 * endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList subsettingContext(Property property) {
		EList subsettingContext = new UniqueEList();

		Association association = property.getAssociation();

		if (association == null) {
			Namespace namespace = property.getNamespace();

			if (namespace instanceof Classifier) {
				subsettingContext.add(namespace);
			}
		} else {

			for (Iterator memberEnds = association.getMemberEnds().iterator(); memberEnds
				.hasNext();) {

				Property memberEnd = (Property) memberEnds.next();

				if (memberEnd != property) {
					Type memberEndType = memberEnd.getType();

					if (memberEndType instanceof Classifier) {
						subsettingContext.add(memberEndType);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(subsettingContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNavigable indicates whether it is possible to navigate across the property.
	 * The query isNavigable() indicates whether it is possible to navigate across the property.
	 * result = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isNavigable(Property property) {
		Association owningAssociation = property.getOwningAssociation();
		return owningAssociation == null
			|| owningAssociation.getNavigableOwnedEnds().contains(property);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getDefault(Property property) {
		ValueSpecification defaultValue = property.getDefaultValue();

		if (defaultValue != null) {
			return defaultValue.stringValue();
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) property;
			return (String) basicEObjectImpl
				.eVirtualGet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.PROPERTY__DEFAULT),
					null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setDefault(final Property property,
			final String newDefault) {
		ValueSpecification defaultValue = property.getDefaultValue();

		if (defaultValue != null) {
			new UMLSwitch() {

				public Object caseInstanceValue(InstanceValue instanceValue) {
					Type type = property.getType();

					if (type instanceof Enumeration) {
						instanceValue.setInstance(((Enumeration) type)
							.getOwnedLiteral(newDefault));
					} else {
						InstanceSpecification instance = instanceValue
							.getInstance();

						if (instance != null) {
							ValueSpecification specification = instance
								.getSpecification();

							if (specification != null) {
								return doSwitch(specification);
							}
						}

						return null;
					}

					return instanceValue;
				}

				public Object caseLiteralBoolean(LiteralBoolean literalBoolean) {
					literalBoolean.setValue(Boolean.getBoolean(newDefault));
					return literalBoolean;
				}

				public Object caseLiteralInteger(LiteralInteger literalInteger) {
					literalInteger.setValue(Integer.parseInt(newDefault));
					return literalInteger;
				}

				public Object caseLiteralString(LiteralString literalString) {
					literalString.setValue(newDefault);
					return literalString;
				}

				public Object caseLiteralUnlimitedNatural(
						LiteralUnlimitedNatural literalUnlimitedNatural) {
					literalUnlimitedNatural.setValue(Integer
						.parseInt(newDefault));
					return literalUnlimitedNatural;
				}

				public Object caseOpaqueExpression(
						OpaqueExpression opaqueExpression) {
					EList bodies = opaqueExpression.getBodies();

					if (bodies.isEmpty()) {
						bodies.add(newDefault);
					} else {
						bodies.set(0, newDefault);
					}

					return opaqueExpression;
				}

				public Object defaultCase(EObject eObject) {
					throw new UnsupportedOperationException();
				}
			}.doSwitch(defaultValue);
		} else {
			BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) property;
			basicEObjectImpl
				.eVirtualSet(
					basicEObjectImpl
						.eDerivedStructuralFeatureID(UMLPackage.Literals.PROPERTY__DEFAULT),
					newDefault);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setIsComposite(Property property, boolean newIsComposite) {
		property.setAggregation(newIsComposite
			? AggregationKind.COMPOSITE_LITERAL
			: AggregationKind.NONE_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setOpposite(Property property, Property newOpposite) {

		if (property.getOwningAssociation() != null) {
			throw new IllegalStateException();
		}

		if (newOpposite.getOwningAssociation() != null) {
			throw new IllegalArgumentException(String.valueOf(newOpposite));
		}

		Association association = property.getAssociation();

		if (association == null) {
			association = UMLFactory.eINSTANCE.createAssociation();

			org.eclipse.uml2.uml.Package owningPackage = (org.eclipse.uml2.uml.Package) ElementOperations
				.getOwningElement(property, UMLPackage.Literals.PACKAGE, true);

			if (owningPackage != null) {
				owningPackage.getPackagedElements().add(association);
			}
		}

		EList memberEnds = association.getMemberEnds();

		switch (memberEnds.size()) {
			case 0 :
				memberEnds.add(property);
			case 1 :
				if (newOpposite != null) {
					memberEnds.add(newOpposite);
				}
				break;
			case 2 :
				if (newOpposite == null) {
					memberEnds.remove(Math
						.abs(memberEnds.indexOf(property) - 1));
				} else {
					memberEnds.set(Math.abs(memberEnds.indexOf(property) - 1),
						newOpposite);
				}
				break;
			default :
				throw new IllegalStateException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isSetDefault(Property property) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) property;
		return basicEObjectImpl
			.eVirtualIsSet(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.PROPERTY__DEFAULT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void unsetDefault(Property property) {
		BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl) property;
		basicEObjectImpl
			.eVirtualUnset(basicEObjectImpl
				.eDerivedStructuralFeatureID(UMLPackage.Literals.PROPERTY__DEFAULT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two Properties in a context in which redefinition is possible, whether redefinition would be logically consistent. A redefining property is consistent with a redefined property if the type of the redefining property conforms to the type of the redefined property, the multiplicity of the redefining property (if specified) is contained in the multiplicity of the redefined property, and the redefining property is derived if the redefined property is derived.
	 * The query isConsistentWith() specifies, for any two Properties in a context in which redefinition is possible, whether redefinition would be logically consistent. A redefining property is consistent with a redefined property if the type of the redefining property conforms to the type of the redefined property, the multiplicity of the redefining property (if specified) is contained in the multiplicity of the redefined property, and the redefining property is derived if the redefined attribute is property.
	 * redefinee.isRedefinitionContextValid(self)
	 * result = redefinee.oclIsKindOf(Property) and 
	 *   let prop : Property = redefinee.oclAsType(Property) in 
	 *   (prop.type.conformsTo(self.type) and 
	 *   ((prop.lowerBound()->notEmpty() and self.lowerBound()->notEmpty()) implies prop.lowerBound() >= self.lowerBound()) and 
	 *   ((prop.upperBound()->notEmpty() and self.upperBound()->notEmpty()) implies prop.lowerBound() <= self.lowerBound()) and 
	 *   (self.isDerived implies prop.isDerived) and
	 *   (self.isComposite implies prop.isComposite))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(Property property,
			RedefinableElement redefinee) {

		if (redefinee.isRedefinitionContextValid(property)
			&& redefinee instanceof Property) {

			Property prop = (Property) redefinee;

			Type type = property.getType();
			int upperBound = property.upperBound();

			Type propType = prop.getType();
			int propUpperBound = prop.upperBound();

			return (type == null
				? propType == null
				: propType.conformsTo(type))
				&& prop.lowerBound() >= property.lowerBound()
				&& (upperBound == LiteralUnlimitedNatural.UNLIMITED || (propUpperBound != LiteralUnlimitedNatural.UNLIMITED && propUpperBound <= upperBound))
				&& (property.isDerived()
					? prop.isDerived()
					: true) && (property.isComposite()
					? prop.isComposite()
					: true);
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this parameterable element is compatible with the specified parameterable element. By default parameterable element P is compatible with parameterable element Q if the kind of P is the same or a subtype as the kind of Q. In addition, for properties, the type must be conformant with the type of the specified parameterable element.
	 * 
	 * 
	 * result = p->oclIsKindOf(self.oclType) and self.type.conformsTo(p.oclAsType(TypedElement).type)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isCompatibleWith(Property property,
			ParameterableElement p) {

		if (property.eClass().isInstance(p)) {
			Type type = property.getType();

			return type == null
				? ((Property) p).eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE,
					false) == null
				: type.conformsTo(((Property) p).getType());
		}

		return false;
	}

} // PropertyOperations
