/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2Operations.java,v 1.25 2005/12/19 18:49:17 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.util.UML2Util;

class UML2Operations
		extends UML2Util {

	protected static EAnnotation safeGetEAnnotation(
			EModelElement eModelElement, String source) {

		EAnnotation eAnnotation = null == eModelElement
			? null
			: getEAnnotation(eModelElement, source, false);

		return null == eAnnotation
			? EcoreFactory.eINSTANCE.createEAnnotation()
			: eAnnotation;
	}

}