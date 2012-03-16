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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.uml2.uml.UMLPlugin;

/**
 * Implementation of a constraint that delegates to an {@link EPackage}'s
 * constraints via its generated {@link EValidator}.
 */
class DelegatingModelConstraint
		implements IModelConstraint {

	private final IConstraintDescriptor descriptor;

	private final EValidator delegate;

	private final EValidator.SubstitutionLabelProvider labelProvider;

	private final Method constraintMethod;

	/**
	 * Initializes me.
	 */
	DelegatingModelConstraint(String namespace, EValidator delegate,
			EValidator.SubstitutionLabelProvider labelProvider, EClass target,
			Method constraintMethod) {
		// strip the type-qualifying part off of the validator method name
		String name = constraintMethod.getName();
		String expectedPrefix = String.format("validate%s_validate", //$NON-NLS-1$
			target.getName());
		if (name.startsWith(expectedPrefix)) {
			name = name.substring(expectedPrefix.length());
		}

		this.descriptor = new DelegatingConstraintDescriptor(namespace, target,
			name);
		this.delegate = delegate;
		this.labelProvider = labelProvider;
		this.constraintMethod = constraintMethod;
	}

	public final IConstraintDescriptor getDescriptor() {
		return descriptor;
	}

	public IStatus validate(IValidationContext ctx) {
		IStatus result;

		final ContextAdapter ctxAdapter = ContextAdapter.getInstance(ctx);
		final BasicDiagnostic diagnostics = ctxAdapter.getDiagnostics();
		final Map<Object, Object> contextMap = ctxAdapter.getContextMap();

		try {
			// pass the label provider (if any) to the validator
			contextMap.put(EValidator.SubstitutionLabelProvider.class,
				labelProvider);

			boolean isOK = (Boolean) constraintMethod.invoke(delegate,
				ctx.getTarget(), diagnostics, contextMap);

			if (isOK) {
				result = ctx.createSuccessStatus();
			} else {
				final int count = diagnostics.getChildren().size();

				switch (count) {
					case 0 :
						result = ctx.createFailureStatus(getDescriptor()
							.getName());
						break;
					case 1 :
						result = toConstraintStatus(ctx, diagnostics
							.getChildren().get(0));
						break;
					default :
						List<IStatus> statuses = new java.util.ArrayList<IStatus>(
							diagnostics.getChildren().size());
						for (Diagnostic next : diagnostics.getChildren()) {
							statuses.add(toConstraintStatus(ctx, next));
						}
						result = ConstraintStatus.createMultiStatus(ctx,
							statuses);
						break;
				}
			}
		} catch (InvocationTargetException e) {
			// disable this constraint in future validation operations
			ctx.disableCurrentConstraint(e.getTargetException());

			result = ConstraintStatus.createStatus(ctx, ctx.getTarget(), ctx
				.getResultLocus(), IStatus.WARNING, getDescriptor()
				.getStatusCode(), UMLPlugin.INSTANCE
				.getString("_UI_Validation_runtimeError"), //$NON-NLS-1$
				getDescriptor().getException().getMessage());
		} catch (Exception e) {
			// disable this constraint in future validation operations
			ctx.disableCurrentConstraint(e);

			result = ConstraintStatus.createStatus(ctx, ctx.getTarget(), ctx
				.getResultLocus(), IStatus.WARNING, getDescriptor()
				.getStatusCode(), UMLPlugin.INSTANCE
				.getString("_UI_Validation_linkageError"), //$NON-NLS-1$
				e.getMessage());
		}

		return result;
	}

	private static IConstraintStatus toConstraintStatus(IValidationContext ctx,
			Diagnostic diagnostic) {
		final EObject target = ctx.getTarget();

		// collect the "result locus" on which to create problem markers, or
		// whatever
		List<EObject> resultLocus = new java.util.ArrayList<EObject>(3);
		for (Object next : diagnostic.getData()) {
			if ((next != target) && (next instanceof EObject)) {
				resultLocus.add((EObject) next);
			}
		}

		return ConstraintStatus.createStatus(ctx, target, resultLocus,
			diagnostic.getSeverity(), diagnostic.getCode(),
			diagnostic.getMessage());
	}

	//
	// Nested types
	//

	/**
	 * A translation from the EMF Validation Framework's
	 * {@link IValidationContext}-based API to EMF's {@link DiagnosticChain}-
	 * and map-based API. A weak mapping ensures that the same adapters are
	 * reused as appropriate for any given instance of the validation context.
	 */
	private static final class ContextAdapter {

		private static final Map<IValidationContext, ContextAdapter> contextAdapters = new java.util.WeakHashMap<IValidationContext, ContextAdapter>();

		private Map<Object, Object> contextMap = new java.util.HashMap<Object, Object>();

		private BasicDiagnostic diagnostics;

		ContextAdapter() {
			super();
		}

		static ContextAdapter getInstance(IValidationContext ctx) {
			ContextAdapter result = contextAdapters.get(ctx);

			if (result == null) {
				result = new ContextAdapter();
				contextAdapters.put(ctx, result);
			}

			return result;
		}

		Map<Object, Object> getContextMap() {
			return contextMap;
		}

		BasicDiagnostic getDiagnostics() {
			if ((diagnostics != null) && !diagnostics.getChildren().isEmpty()) {
				// self-destruct a diagnostic that previously had problems added
				// to it
				diagnostics = null;
			}

			if (diagnostics == null) {
				diagnostics = new BasicDiagnostic();
			}

			return diagnostics;
		}
	}
}
