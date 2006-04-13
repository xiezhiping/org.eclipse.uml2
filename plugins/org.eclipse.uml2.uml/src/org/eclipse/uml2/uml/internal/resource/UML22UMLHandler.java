/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML22UMLHandler.java,v 1.3 2006/04/13 01:13:49 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.uml.UMLPackage;

public class UML22UMLHandler
		extends UMLHandler {

	protected static final EMap typeToTypeMap = new BasicEMap();

	static {
		EMap typeMap = null;
		EMap featureMap = null;

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.INTERACTION, "uml:MessageOccurrenceSpecification"); //$NON-NLS-1$
		featureMap = new BasicEMap();
		featureMap.put("fragment", typeMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:Stop", featureMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.ACTIVITY, "uml:CallBehaviorAction"); //$NON-NLS-1$
		featureMap = new BasicEMap();
		featureMap.put("node", typeMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:ApplyFunctionAction", featureMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.ACTIVITY, "uml:WriteStructuralFeatureAction"); //$NON-NLS-1$
		featureMap = new BasicEMap();
		featureMap.put("node", typeMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:DurationObservationAction", featureMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:TimeObservationAction", featureMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.BEHAVIORED_CLASSIFIER, "uml:Trigger"); //$NON-NLS-1$
		featureMap = new BasicEMap();
		featureMap.put("ownedTrigger", typeMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:AnyTrigger", featureMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:CallTrigger", featureMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:ChangeTrigger", featureMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:SignalTrigger", featureMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:TimeTrigger", featureMap); //$NON-NLS-1$
		
		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.NAMESPACE, "uml:Dependency"); //$NON-NLS-1$
		featureMap = new BasicEMap();
		featureMap.put("packagedElement", typeMap); //$NON-NLS-1$
		typeToTypeMap.put("uml:Permission", featureMap); //$NON-NLS-1$
	}

	protected static final EMap featureToTypeMap = new BasicEMap();

	static {
		EMap typeMap = null;

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.WRITE_STRUCTURAL_FEATURE_ACTION, "uml:Duration"); //$NON-NLS-1$
		featureToTypeMap.put("duration", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.TRANSITION, "uml:Activity"); //$NON-NLS-1$
		featureToTypeMap.put("effect", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.BEHAVIORAL_FEATURE, "uml:Parameter"); //$NON-NLS-1$
		featureToTypeMap.put("formalParameter", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.WRITE_STRUCTURAL_FEATURE_ACTION, "uml:TimeExpression"); //$NON-NLS-1$
		featureToTypeMap.put("now", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.TRIGGER, "uml:Operation"); //$NON-NLS-1$
		featureToTypeMap.put("operation", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.BEHAVIORED_CLASSIFIER, "uml:StateMachine"); //$NON-NLS-1$
		featureToTypeMap.put("ownedStateMachine", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.CLASSIFIER, "uml:RedefinableTemplateSignature"); //$NON-NLS-1$
		featureToTypeMap.put("ownedTemplateSignature", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.PACKAGE, "uml:PackageMerge"); //$NON-NLS-1$
		featureToTypeMap.put("packageExtension", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.NAMESPACE, "uml:PackageImport"); //$NON-NLS-1$
		featureToTypeMap.put("packageImport", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.MESSAGE_END, "uml:Message"); //$NON-NLS-1$
		featureToTypeMap.put("receiveMessage", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.BEHAVIORAL_FEATURE, "uml:Parameter"); //$NON-NLS-1$
		featureToTypeMap.put("returnResult", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.MESSAGE_END, "uml:Message"); //$NON-NLS-1$
		featureToTypeMap.put("sendMessage", typeMap); //$NON-NLS-1$

		typeMap = new BasicEMap();
		typeMap.put(UMLPackage.Literals.TRIGGER, "uml:Signal"); //$NON-NLS-1$
		featureToTypeMap.put("signal", typeMap); //$NON-NLS-1$
	}

	public UML22UMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map options) {
		super(xmiResource, helper, options);
	}

	protected void createObject(EObject peekObject, EStructuralFeature feature) {

		if (!isNull()) {
			String xsiType = getXSIType();

			EMap typeMap = xsiType == null
				? featureToTypeMap
				: (EMap) typeToTypeMap.get(xsiType);
			typeMap = typeMap == null
				? null
				: (EMap) typeMap.get(feature.getName());

			if (typeMap != null) {
				EObject eObject = peekObject instanceof AnyType
					? (EObject) objects.get(objects.size() - 2)
					: peekObject;

				for (Iterator entries = typeMap.entrySet().iterator(); entries
					.hasNext();) {

					Map.Entry entry = (Map.Entry) entries.next();

					if (((EClass) entry.getKey()).isInstance(eObject)) {
						xsiType = (String) entry.getValue();
						break;
					}
				}
			}

			if (xsiType != null) {
				createObjectFromTypeName(peekObject, xsiType, feature);
			} else {
				super.createObject(peekObject, feature);
			}
		}
	}

}
