/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2Operations.java,v 1.2 2004/04/10 04:09:50 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.Artifact;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Interface;
import org.eclipse.uml2.Signal;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.util.UML2Switch;

/**
 * The base class for all UML2 operation utility classes.
 */
class UML2Operations {

	protected static final String EMPTY_STRING = ""; //$NON-NLS-1$

	protected static EAnnotation createEAnnotation(String source,
			EModelElement eModelElement) {

		if (Element.class.isInstance(eModelElement)) {
			return ((Element) eModelElement).createEAnnotation(source);
		} else {
			EAnnotation eAnnotation = EcoreFactory.eINSTANCE
				.createEAnnotation();

			eAnnotation.setSource(source);
			eAnnotation.setEModelElement(eModelElement);

			return eAnnotation;
		}
	}

	protected static EAnnotation getOrCreateEAnnotation(String source,
			EModelElement eModelElement) {
		EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

		return null == eAnnotation
			? createEAnnotation(source, eModelElement) : eAnnotation;
	}

	protected static EAnnotation getEAnnotation(String source,
			EModelElement eModelElement) {
		EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

		return null == eAnnotation
			? EcoreFactory.eINSTANCE.createEAnnotation() : eAnnotation;
	}

	protected static boolean safeEquals(Object thisObject, Object thatObject) {
		return null == thisObject
			? null == thatObject : thisObject.equals(thatObject);
	}

	protected static boolean isEmpty(String string) {
		return null == string || 0 == string.length();
	}

	protected static EList getOwnedAttributes(Type type) {

		if (null == type) {
			return null;
		}

		return (EList) new UML2Switch() {

			public Object caseArtifact(Artifact object) {
				return object.getOwnedAttributes();
			}

			public Object caseDataType(DataType object) {
				return object.getOwnedAttributes();
			}

			public Object caseInterface(Interface object) {
				return object.getOwnedAttributes();
			}

			public Object caseSignal(Signal object) {
				return object.getOwnedAttributes();
			}

			public Object caseStructuredClassifier(StructuredClassifier object) {
				return object.getOwnedAttributes();
			}
		}.doSwitch(type);
	}

}