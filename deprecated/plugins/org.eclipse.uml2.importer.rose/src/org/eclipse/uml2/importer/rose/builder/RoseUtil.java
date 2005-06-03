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
 * $Id: RoseUtil.java,v 1.3 2005/06/03 19:53:40 khussey Exp $
 */
package org.eclipse.uml2.importer.rose.builder;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.importer.rose.builder.UnitTreeNode;

public class RoseUtil
		extends org.eclipse.emf.importer.rose.builder.RoseUtil {

	protected Map dependencyTable = new HashMap();

	public RoseUtil(URIConverter uriConverter) {
		super(uriConverter);

		roseEcoreBuilder = new RoseEcoreBuilder(this);
	}

	protected Map getDependencyTable() {
		return dependencyTable;
	}

	protected Map getQuidTable() {
		return quidTable;
	}

	protected Map getNameTable() {
		return nameTable;
	}

	protected Map getTypeTable() {
		return typeTable;
	}

	public void processUnitTree(UnitTreeNode unitTree)
			throws Exception {

		if (null != unitTree) {
			loadTree(null, unitTree);

			String packageName = unitTree.getEcoreFileName();
			int fileSeparatorIndex = packageName.lastIndexOf(File.separator);

			if (-1 != fileSeparatorIndex) {
				packageName = packageName.substring(fileSeparatorIndex + 1);
			}

			int dotIndex = packageName.lastIndexOf('.');

			if (-1 != dotIndex) {
				packageName = packageName.substring(0, dotIndex);
			}

			roseEcoreBuilder.createEPackageForRootClasses(unitTree.getExtent(),
				unitTree.getRoseNode(), packageName);
			roseEcoreBuilder.setEEnums();
			roseEcoreBuilder.setEReferences();

			// reverse order...
			roseEcoreBuilder.setETypeClassifier();
			roseEcoreBuilder.setSuper();

			// custom extensions...
			processAnnotations(unitTree);

			processUnionFeatures(unitTree);
			processDerivedFeatures(unitTree);

			processDuplicateOperations(unitTree);
			processDuplicateFeatures(unitTree);

			processSubsetsAnnotations(unitTree);

			setIDs(unitTree);
			validate(unitTree);
		}
	}

	protected void processAnnotations(UnitTreeNode node)
			throws Exception {

		for (Iterator extent = node.getExtent().iterator(); extent.hasNext();) {
			((RoseEcoreBuilder) roseEcoreBuilder)
				.processAnnotations((EObject) extent.next());
		}
	}

	protected void processDuplicateOperations(UnitTreeNode node)
			throws Exception {

		for (Iterator extent = node.getExtent().iterator(); extent.hasNext();) {
			((RoseEcoreBuilder) roseEcoreBuilder)
				.processDuplicateOperations((EObject) extent.next());
		}
	}

	protected void processUnionFeatures(UnitTreeNode node)
			throws Exception {

		for (Iterator extent = node.getExtent().iterator(); extent.hasNext();) {
			((RoseEcoreBuilder) roseEcoreBuilder)
				.processUnionFeatures((EObject) extent.next());
		}
	}

	protected void processDerivedFeatures(UnitTreeNode node)
			throws Exception {

		for (Iterator extent = node.getExtent().iterator(); extent.hasNext();) {
			((RoseEcoreBuilder) roseEcoreBuilder)
				.processDerivedFeatures((EObject) extent.next());
		}
	}

	protected void processDuplicateFeatures(UnitTreeNode node)
			throws Exception {

		for (Iterator extent = node.getExtent().iterator(); extent.hasNext();) {
			((RoseEcoreBuilder) roseEcoreBuilder)
				.processDuplicateFeatures((EObject) extent.next());
		}
	}

	protected void processSubsetsAnnotations(UnitTreeNode node)
			throws Exception {

		for (Iterator extent = node.getExtent().iterator(); extent.hasNext();) {
			((RoseEcoreBuilder) roseEcoreBuilder)
				.processSubsetsAnnotations((EObject) extent.next());
		}
	}

	protected void dumpFeatureCounts(UnitTreeNode node)
			throws Exception {

		for (Iterator extent = node.getExtent().iterator(); extent.hasNext();) {
			((RoseEcoreBuilder) roseEcoreBuilder)
				.dumpFeatureCounts((EObject) extent.next());
		}
	}

}