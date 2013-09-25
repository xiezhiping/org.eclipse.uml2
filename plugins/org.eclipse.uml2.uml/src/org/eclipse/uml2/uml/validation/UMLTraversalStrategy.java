/*
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink (CEA LIST) - initial API and implementation
 */
package org.eclipse.uml2.uml.validation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.service.ITraversalStrategy;
import org.eclipse.uml2.uml.Element;

/**
 * A UMLTraversalStrategy extends a standard recursive traversal to insert
 * stereotype applications following each each stereotyped element.
 */
public class UMLTraversalStrategy
		implements ITraversalStrategy {

	private final ITraversalStrategy delegate = new ITraversalStrategy.Recursive();

	private Iterator<EObject> stereotypeApplications = null; // Non-null if
																// stereotypeApplications
																// maybe pending

	public void elementValidated(EObject element, IStatus status) {
		delegate.elementValidated(element, status);
	}

	public boolean hasNext() {
		if (stereotypeApplications != null) {
			if (stereotypeApplications.hasNext()) {
				return true;
			}
			stereotypeApplications = null;
		}
		return delegate.hasNext();
	}

	public boolean isClientContextChanged() {
		return delegate.isClientContextChanged();
	}

	public EObject next() {
		if (stereotypeApplications != null) {
			return stereotypeApplications.next();
		}
		EObject next = delegate.next();
		if (next instanceof Element) {
			List<EObject> stereotypeApplicationsList = ((Element) next)
				.getStereotypeApplications();
			if (stereotypeApplicationsList.size() > 0) {
				stereotypeApplications = stereotypeApplicationsList.iterator();
			}
		}
		return next;
	}

	public void startTraversal(Collection<? extends EObject> traversalRoots,
			IProgressMonitor monitor) {
		delegate.startTraversal(traversalRoots, monitor);
	}
}