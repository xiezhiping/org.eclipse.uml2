/*
 * Copyright (c) 2012 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 */
package org.eclipse.uml2.uml.validation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.preferences.EMFModelValidationPreferences;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.uml2.uml.UMLPlugin;

/**
 * Descriptor of a constraint that delegates to an {@link EPackage}'s
 * constraints via its generated {@link EValidator}.
 */
class DelegatingConstraintDescriptor
		extends AbstractConstraintDescriptor {

	private final String namespace;

	private final EClass target;

	private final String id;

	private final String name;

	/**
	 * Initializes me with the {@code EClass} that I constrain.
	 * 
	 * @param a
	 *            namespace in which to define the constraints (e.g.,
	 *            {@code "org.eclipse.uml2.uml"})
	 * @param target
	 *            my target model class
	 * @param name
	 *            my name, from the model
	 */
	DelegatingConstraintDescriptor(String namespace, EClass target, String name) {
		this.namespace = namespace;
		this.target = target;
		this.name = UMLPlugin.INSTANCE.getString(
			"_UI_Validation_constraintName", //$NON-NLS-1$
			new Object[]{target.getName(), name});

		StringBuilder buf = new StringBuilder();
		buf.append(namespace);
		buf.append('.').append(target.getEPackage().getName()).append('.')
			.append(target.getName());
		buf.append('.').append(name);
		this.id = buf.toString();
		
		// this public method call is safe because it's final in my superclass
		setEnabled(!EMFModelValidationPreferences.isConstraintDisabled(this.id));
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPluginId() {
		return namespace;
	}

	public String getDescription() {
		return UMLPlugin.INSTANCE.getString("_UI_Validation_constraintDesc", //$NON-NLS-1$
			new Object[]{getName()});
	}

	public ConstraintSeverity getSeverity() {
		// in the UML metamodel, constraints generally are warnings
		return ConstraintSeverity.WARNING;
	}

	public int getStatusCode() {
		return 0; // constraints determine their own codes
	}

	public EvaluationMode<?> getEvaluationMode() {
		// it is not appropriate to try to invoke EValidator constraints in
		// Batch mode
		return EvaluationMode.BATCH;
	}

	public boolean targetsTypeOf(EObject eObject) {
		return target.isInstance(eObject);
	}

	public boolean targetsEvent(Notification notification) {
		// live mode is not supported
		return false;
	}

	public String getMessagePattern() {
		return UMLPlugin.INSTANCE.getString("_UI_Validation_violation", //$NON-NLS-1$
			new Object[]{getName()});
	}

	public String getBody() {
		// delegated constraints have nobody (har, har)
		return null;
	}

	EClass getTarget() {
		return target;
	}
}
