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
 * $Id: GenerateModelAction.java,v 1.1 2005/12/22 20:19:55 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.uml.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.editor.actions.UMLCommandAction;

public class GenerateModelAction
		extends UMLCommandAction {

	protected PrimitiveType generateOwnedPrimitiveType(
			org.eclipse.uml2.uml.Package package_, final String name) {
		PrimitiveType primitiveType = (PrimitiveType) UML2Util.findEObject(
			package_.getOwnedTypes(), new UML2Util.EObjectMatcher() {

				public boolean matches(EObject eObject) {
					return eObject instanceof PrimitiveType
						&& ((PrimitiveType) eObject).getName().equals(name);
				}
			});

		return primitiveType == null
			? package_.createOwnedPrimitiveType(name)
			: primitiveType;
	}

}
