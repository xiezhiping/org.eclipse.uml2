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
 * $Id: ActivityOperations.java,v 1.2 2005/10/26 20:59:34 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityGroup;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.StructuredActivityNode;

/**
 * A static utility class that provides operations related to '<em><b>Activity</b></em>'
 * model objects.
 * 
 * @deprecated
 */
public final class ActivityOperations
		extends UML2Operations {

	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	private ActivityOperations() {
		super();
	}

	public static EList getStructuredNodes(Activity activity) {
		EList structuredNodes = new UniqueEList();

		if (activity != null) {

			for (Iterator nodes = activity.getNodes().iterator(); nodes
				.hasNext();) {

				ActivityNode node = (ActivityNode) nodes.next();

				if (StructuredActivityNode.class.isInstance(node)) {
					structuredNodes.add(node);
				}
			}

			for (Iterator groups = activity.getGroups().iterator(); groups
				.hasNext();) {

				ActivityGroup group = (ActivityGroup) groups.next();

				if (StructuredActivityNode.class.isInstance(group)) {
					structuredNodes.add(group);
				}
			}
		}

		return structuredNodes;
	}

} // ActivityOperations
