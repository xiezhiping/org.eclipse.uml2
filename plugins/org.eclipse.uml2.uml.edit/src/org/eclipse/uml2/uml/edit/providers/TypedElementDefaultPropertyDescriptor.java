/*
 * Copyright (c) 2013, 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.edit.UMLEditPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * A custom property descriptor for the <tt>Property::default</tt> or
 * <tt>Parameter::default</tt> attribute, which creates the most appropriate
 * value specification in <tt>Property::defaultValue</tt> according to the
 * property's current type.
 * 
 * @since 5.0
 */
public class TypedElementDefaultPropertyDescriptor
		extends UMLItemPropertyDescriptor {

	public TypedElementDefaultPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {

		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, multiLine, sortChoices, staticImage, category,
			filterFlags);
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		if (isDefaultableTypedElement(object)) {
			TypedElement element = (TypedElement) object;

			switch (getDefaultType(element)) {
				case BOOLEAN :
					return Arrays.asList(Boolean.toString(false),
						Boolean.toString(true));
				case ENUMERATION :
					return getLiteralNames((Enumeration) element.getType());
				default :
					return super.getChoiceOfValues(object);
			}
		}

		return super.getChoiceOfValues(object);
	}

	protected List<String> getLiteralNames(Enumeration enumeration) {
		List<String> result = new ArrayList<String>(enumeration
			.getOwnedLiterals().size());

		for (EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
			String name = literal.getName();
			if (name == null) {
				name = UMLUtil.getQualifiedText(literal);
			}
			result.add(name);
		}

		return result;
	}

	protected EnumerationLiteral getLiteral(Enumeration enumeration, String name) {
		for (EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
			String actualName = literal.getName();
			if (actualName == null) {
				actualName = UMLUtil.getQualifiedText(literal);
			}

			if (UML2Util.safeEquals(actualName, name)) {
				return literal;
			}
		}

		return null;
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		if (isDefaultableTypedElement(object)) {
			TypedElement element = (TypedElement) object;
			EditingDomain editingDomain = getEditingDomain(object);

			if (value == null) {
				resetPropertyValue(object);
			} else {
				switch (getDefaultType(element)) {
					case BOOLEAN :
						if (editingDomain == null) {
							setBooleanDefaultValue(element,
								Boolean.parseBoolean((String) value));
						} else {
							editingDomain
								.getCommandStack()
								.execute(
									createOperationCommand(
										editingDomain,
										element,
										getSetBooleanDefaultValueOperation(element),
										Boolean.valueOf((String) value)));
						}
						break;
					case INTEGER :
						try {
							int intValue = Integer.parseInt((String) value);

							if (editingDomain == null) {
								setIntegerDefaultValue(element, intValue);
							} else {
								editingDomain
									.getCommandStack()
									.execute(
										createOperationCommand(
											editingDomain,
											element,
											getSetIntegerDefaultValueOperation(element),
											intValue));
							}
						} catch (NumberFormatException e) {
							// just reject the user's input
						}
						break;
					case REAL :
						try {
							double doubleValue = Double
								.parseDouble((String) value);

							if (editingDomain == null) {
								setRealDefaultValue(element, doubleValue);
							} else {
								editingDomain
									.getCommandStack()
									.execute(
										createOperationCommand(
											editingDomain,
											element,
											getSetRealDefaultValueOperation(element),
											doubleValue));
							}
						} catch (NumberFormatException e) {
							// just reject the user's input
						}
						break;
					case UNLIMITED_NATURAL :
						try {
							int naturalValue = "*".equals(value)
								? LiteralUnlimitedNatural.UNLIMITED
								: Integer.parseInt((String) value);

							if (editingDomain == null) {
								setUnlimitedNaturalDefaultValue(element,
									naturalValue);
							} else {
								editingDomain
									.getCommandStack()
									.execute(
										createOperationCommand(
											editingDomain,
											element,
											getSetUnlimitedNaturalDefaultValueOperation(element),
											naturalValue));
							}
						} catch (NumberFormatException e) {
							// just reject the user's input
						}
						break;
					case ENUMERATION :
						// search for the enumeration literal
						EnumerationLiteral literal = getLiteral(
							(Enumeration) element.getType(), (String) value);
						if (literal == null) {
							super.setPropertyValue(object, value);
						} else {
							EStructuralFeature defaultValueFeature = getDefaultValueFeature(element);
							ValueSpecification existing = (ValueSpecification) element
								.eGet(defaultValueFeature);

							if (existing instanceof InstanceValue) {
								InstanceValue instance = (InstanceValue) existing;

								if (editingDomain == null) {
									instance.setInstance(literal);
								} else {
									editingDomain
										.getCommandStack()
										.execute(
											SetCommand
												.create(
													editingDomain,
													instance,
													UMLPackage.Literals.INSTANCE_VALUE__INSTANCE,
													literal));
								}
							} else {
								InstanceValue instance = UMLFactory.eINSTANCE
									.createInstanceValue();
								instance.setInstance(literal);

								if (editingDomain == null) {
									setDefaultValue(element, instance);
								} else {
									editingDomain.getCommandStack().execute(
										SetCommand.create(editingDomain,
											element, defaultValueFeature,
											instance));
								}
							}
						}
						break;
					default :
						super.setPropertyValue(object, value);
						break;
				}
			}
		} else {
			super.setPropertyValue(object, value);
		}
	}

	protected Command createOperationCommand(EditingDomain editingDomain,
			final EObject object, final EOperation operation,
			final Object... argument) {
		Runnable op = new Runnable() {

			public void run() {
				try {
					object.eInvoke(operation,
						new BasicEList.UnmodifiableEList<Object>(
							argument.length, argument));
				} catch (Exception e) {
					UMLEditPlugin.INSTANCE.log(e);
				}
			}
		};

		return new ChangeCommand(editingDomain, op,
			UMLEditPlugin.INSTANCE.getString("_UI_SetCommand_label"), //$NON-NLS-1$
			UMLEditPlugin.INSTANCE.getString("_UI_SetCommand_description")); //$NON-NLS-1$
	}

	protected boolean isDefaultableTypedElement(Object object) {
		return (object instanceof Property) || (object instanceof Parameter);
	}

	protected void setBooleanDefaultValue(TypedElement element, boolean value) {
		if (element instanceof Parameter) {
			((Parameter) element).setBooleanDefaultValue(value);
		} else {
			((Property) element).setBooleanDefaultValue(value);
		}
	}

	protected EOperation getSetBooleanDefaultValueOperation(TypedElement element) {
		return (element instanceof Parameter)
			? UMLPackage.Literals.PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN
			: UMLPackage.Literals.PROPERTY___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;
	}

	protected void setIntegerDefaultValue(TypedElement element, int value) {
		if (element instanceof Parameter) {
			((Parameter) element).setIntegerDefaultValue(value);
		} else {
			((Property) element).setIntegerDefaultValue(value);
		}
	}

	protected EOperation getSetIntegerDefaultValueOperation(TypedElement element) {
		return (element instanceof Parameter)
			? UMLPackage.Literals.PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT
			: UMLPackage.Literals.PROPERTY___SET_INTEGER_DEFAULT_VALUE__INT;
	}

	protected void setRealDefaultValue(TypedElement element, double value) {
		if (element instanceof Parameter) {
			((Parameter) element).setRealDefaultValue(value);
		} else {
			((Property) element).setRealDefaultValue(value);
		}
	}

	protected EOperation getSetRealDefaultValueOperation(TypedElement element) {
		return (element instanceof Parameter)
			? UMLPackage.Literals.PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE
			: UMLPackage.Literals.PROPERTY___SET_REAL_DEFAULT_VALUE__DOUBLE;
	}

	protected void setUnlimitedNaturalDefaultValue(TypedElement element,
			int value) {
		if (element instanceof Parameter) {
			((Parameter) element).setUnlimitedNaturalDefaultValue(value);
		} else {
			((Property) element).setUnlimitedNaturalDefaultValue(value);
		}
	}

	protected EOperation getSetUnlimitedNaturalDefaultValueOperation(
			TypedElement element) {
		return (element instanceof Parameter)
			? UMLPackage.Literals.PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT
			: UMLPackage.Literals.PROPERTY___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;
	}

	protected void setDefaultValue(TypedElement element,
			ValueSpecification value) {
		if (element instanceof Parameter) {
			((Parameter) element).setDefaultValue(value);
		} else {
			((Property) element).setDefaultValue(value);
		}
	}

	protected EReference getDefaultValueFeature(TypedElement element) {
		return (element instanceof Parameter)
			? UMLPackage.Literals.PARAMETER__DEFAULT_VALUE
			: UMLPackage.Literals.PROPERTY__DEFAULT_VALUE;
	}

	protected PropertyType getDefaultType(TypedElement element) {
		final Type type = element.getType();

		if (type instanceof Enumeration) {
			return PropertyType.ENUMERATION;
		}

		if (UMLUtil.isBoolean(type)) {
			return PropertyType.BOOLEAN;
		}

		if (UMLUtil.isString(type)) {
			return PropertyType.STRING;
		}

		if (UMLUtil.isInteger(type)) {
			return PropertyType.INTEGER;
		}

		if (UMLUtil.isReal(type)) {
			return PropertyType.REAL;
		}

		if (UMLUtil.isUnlimitedNatural(type)) {
			return PropertyType.UNLIMITED_NATURAL;
		}

		return PropertyType.USER;
	}

	protected static enum PropertyType {
		USER, BOOLEAN, STRING, INTEGER, REAL, UNLIMITED_NATURAL, ENUMERATION;
	}
}
