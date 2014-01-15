/*
 * Copyright (c) 2007, 2014 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 213218
 *   Kenn Hussey (CEA) - 322715
 *   Christian W. Damus (CEA) - 403374, 420338, 405065
 *
 */
package org.eclipse.uml2.uml.ecore.importer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.emf.importer.ModelImporterApplication;
import org.eclipse.uml2.uml.util.UMLUtil;


public class UMLImporterApplication
		extends ModelImporterApplication {

	public static class PackageInfo {

		public String name;

		public String nsPrefix;

		public String nsURI;

		public String base;

		public String prefix;

		public String operationsPackage;

		public boolean resourceInterfaces = false;
	}
	
	protected boolean pluralizeGetters = false;

	protected boolean safeStrings = false;

	protected boolean cacheAdapterSupport = false;

	protected boolean factoryMethods = false;

	protected String invariantPrefix;

	protected Map<String, PackageInfo> nameToPackageInfo;

	protected Map<String, String> importerOptions = new HashMap<String, String>(); 

	public UMLImporter getUMLImporter() {
		return (UMLImporter) getModelImporter();
	}

	@Override
	protected ModelImporter createModelImporter() {
		return new UMLImporter();
	}

	@Override
	protected StringBuffer getUsage() {
		StringBuffer result = new StringBuffer();

		appendLine(result, "Usage: { <model.uml> }+ [ <model.genmodel> [ -reload ] ] <OPTIONS>"); //$NON-NLS-1$
		appendLine(result, "<OPTIONS>               ::= [ <PROJECT-OPTION> ] [ <PATHMAP> ]"); //$NON-NLS-1$
		appendLine(result, "                            { <PACKAGE> }+ { <REF-PACKAGE> }* { <REF-GEN-MODEL> }*"); //$NON-NLS-1$
		appendLine(result, "                            [ <TEMPLATE-PATH> ] [ <MODEL-PLUGIN-ID> ] [ <COPYRIGHT> ]"); //$NON-NLS-1$
		appendLine(result, "                            [ <SDO> ] [ <QUIET> ] { <IMPORTER-OPTION> }*"); //$NON-NLS-1$
		appendLine(result, "                            [ <CACHE-ADAPTER-SUPPORT> ] [ <FACTORY-METHODS> ] [ <PLURALIZE-GETTERS> ]"); //$NON-NLS-1$
		appendLine(result, "                            [ <SAFE-STRINGS> ] [ <INVARIANT-PREFIX> ]"); //$NON-NLS-1$
		appendLine(result, "<PROJECT-OPTION>        ::= <MODEL-PROJECT> [ <EDIT-PROJECT> ] [ <EDITOR-PROJECT> ]"); //$NON-NLS-1$
		appendLine(result, "                            [ <TESTS-PROJECT> ]"); //$NON-NLS-1$
		appendLine(result, "<MODEL-PROJECT>         ::= -modelProject <model-directory> <fragment-path>"); //$NON-NLS-1$
		appendLine(result, "<EDIT-PROJECT>          ::= -editProject <edit-directory> <fragment-path>"); //$NON-NLS-1$
		appendLine(result, "<EDITOR-PROJECT>        ::= -editorProject <editor-directory> <fragment-path>"); //$NON-NLS-1$
		appendLine(result, "<TESTS-PROJECT>         ::= -testsProject <tests-directory> <fragment-path>"); //$NON-NLS-1$
		appendLine(result, "<PACKAGE>               ::= -package <name> [ <nsPrefix> <nsURI> <base> <prefix> ]"); //$NON-NLS-1$
		appendLine(result, "                            [ <operationsPackage> ] [ resourceInterfaces ]"); //$NON-NLS-1$
		appendLine(result, "<REF-GEN-MODEL>         ::= -refGenModel <model.genmodel> { <nsURI> }+"); //$NON-NLS-1$
		appendLine(result, "<TEMPLATE-PATH>         ::= -templatePath <template-directory>"); //$NON-NLS-1$
		appendLine(result, "<MODEL-PLUGIN-ID>       ::= -modelPluginID <plugin-ID>"); //$NON-NLS-1$
		appendLine(result, "<COPYRIGHT>             ::= -copyright <copyright-string>"); //$NON-NLS-1$
		appendLine(result, "<JDK-LEVEL>             ::= -jdkLevel <jdk level: 1.4 5.0 6.0>"); //$NON-NLS-1$
		appendLine(result, "<VALIDATE-MODEL>        ::= -validateModel < true | false >"); //$NON-NLS-1$
		appendLine(result, "<SDO>                   ::= -sdo"); //$NON-NLS-1$
		appendLine(result, "<QUIET>                 ::= -quiet"); //$NON-NLS-1$
		appendLine(result, "<IMPORTER-OPTION>       ::= < -ECORE_TAGGED_VALUES |" ); //$NON-NLS-1$
		appendLine(result,"                               -REDEFINING_OPERATIONS | -REDEFINING_PROPERTIES |"); //$NON-NLS-1$
		appendLine(result,"                               -SUBSETTING_PROPERTIES | -UNION_PROPERTIES | -DERIVED_FEATURES |" ); //$NON-NLS-1$
		appendLine(result,"                               -DUPLICATE_OPERATIONS | -DUPLICATE_OPERATION_INHERITANCE |" ); //$NON-NLS-1$
		appendLine(result,"                               -DUPLICATE_FEATURES | -DUPLICATE_FEATURE_INHERITANCE |" ); //$NON-NLS-1$
		appendLine(result,"                               -UNTYPED_PROPERTIES | -OPPOSITE_ROLE_NAMES |"); //$NON-NLS-1$
		appendLine(result,"                               -SUPER_CLASS_ORDER | -ANNOTATION_DETAILS |" ); //$NON-NLS-1$
		appendLine(result,"                               -INVARIANT_CONSTRAINTS | -VALIDATION_DELEGATES | -NON_API_INVARIANTS |" ); //$NON-NLS-1$
		appendLine(result,"                               -OPERATION_BODIES | -INVOCATION_DELEGATES |" ); //$NON-NLS-1$
		appendLine(result,"                               -PROPERTY_DEFAULT_EXPRESSIONS |"); //$NON-NLS-1$
		appendLine(result,"                               -COMMENTS | -CAMEL_CASE_NAMES >" ); //$NON-NLS-1$
		appendLine(result,"                             < PROCESS | IGNORE | REPORT | DISCARD >"); //$NON-NLS-1$
		appendLine(result, "<CACHE-ADAPTER-SUPPORT> ::= -cacheAdapterSupport"); //$NON-NLS-1$
		appendLine(result, "<FACTORY-METHODS>       ::= -factoryMethods"); //$NON-NLS-1$
		appendLine(result, "<PLURALIZE-GETTERS>     ::= -pluralizeGetters"); //$NON-NLS-1$
		appendLine(result, "<SAFE-STRINGS>          ::= -safeStrings"); //$NON-NLS-1$
		appendLine(result, "<INVARIANT-PREFIX>      ::= -invariantPrefix <prefix>"); //$NON-NLS-1$
		appendLine(result, ""); //$NON-NLS-1$
		appendLine(result, "For example:"); //$NON-NLS-1$
		appendLine(result, ""); //$NON-NLS-1$
		appendLine(result, ""); //$NON-NLS-1$
		appendLine(result, "  uml2genmodel"); //$NON-NLS-1$
		appendLine(result, "    ../../company/model.uml"); //$NON-NLS-1$
		appendLine(result, "    result/model/Extended.genmodel"); //$NON-NLS-1$
		appendLine(result, "    -modelProject result src"); //$NON-NLS-1$
		appendLine(result, "    -editProject result.edit src"); //$NON-NLS-1$
		appendLine(result, "    -editorProject result.editor src"); //$NON-NLS-1$
		appendLine(result, "    -refGenModel company.genmodel http://org.sample.company"); //$NON-NLS-1$
		
		return result;
	}

	@Override
	protected int processArgument(String[] arguments, int index) {

		if (arguments[index].equalsIgnoreCase("-package")) { //$NON-NLS-1$

			if (nameToPackageInfo == null) {
				nameToPackageInfo = new HashMap<String, PackageInfo>();
			}

			index = processPackageInformation(arguments, index,
				nameToPackageInfo);
		} else if (isImporterOption(arguments[index])) {
			importerOptions.put(arguments[index].substring(1), arguments[++index]);
		} else if (arguments[index].equalsIgnoreCase("-pluralizeGetters")) { //$NON-NLS-1$
			pluralizeGetters = true;
		} else if (arguments[index].equalsIgnoreCase("-safeStrings")) { //$NON-NLS-1$
			safeStrings = true;
		} else if (arguments[index].equalsIgnoreCase("-cacheAdapterSupport")) { //$NON-NLS-1$
			cacheAdapterSupport = true;
		} else if (arguments[index].equalsIgnoreCase("-factoryMethods")) { //$NON-NLS-1$
			factoryMethods = true;
		} else if (arguments[index].equalsIgnoreCase("-invariantPrefix")) { //$NON-NLS-1$
			invariantPrefix = arguments[++index];
		} else {
			return super.processArgument(arguments, index);
		}

		return index + 1;
	}

	protected boolean isImporterOption(String key) {
		String strippedKey = key.substring(1);

		return UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES
			.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__VALIDATION_DELEGATES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__NON_API_INVARIANTS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__INVOCATION_DELEGATES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__COMMENTS
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES
				.equalsIgnoreCase(strippedKey)
			|| UMLUtil.UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES
				.equalsIgnoreCase(strippedKey);
	}

	protected int processPackageInformation(String[] arguments, int index,
			Map<String, PackageInfo> nameToPackageInfo) {
		int start = index;
		PackageInfo packageInfo = new PackageInfo();

		if (index + 1 < arguments.length
			&& !arguments[index + 1].startsWith("-")) { //$NON-NLS-1$

			packageInfo.name = arguments[++index];

			if (index + 1 < arguments.length
				&& !arguments[index + 1].startsWith("-") //$NON-NLS-1$
				&& !arguments[index + 2].startsWith("-") //$NON-NLS-1$
				&& !arguments[index + 3].startsWith("-")) { //$NON-NLS-1$

				packageInfo.nsPrefix = arguments[++index];

				if (index + 1 < arguments.length
					&& !arguments[index + 1].startsWith("-")) { //$NON-NLS-1$

					packageInfo.nsURI = arguments[++index];

					if (index + 1 < arguments.length
						&& !arguments[index + 1].startsWith("-")) { //$NON-NLS-1$

						packageInfo.base = arguments[++index];

						if (index + 1 < arguments.length
							&& !arguments[index + 1].startsWith("-")) { //$NON-NLS-1$

							packageInfo.prefix = arguments[++index];
						}
					}
				}
			}

			while (index + 1 < arguments.length
				&& !arguments[index + 1].startsWith("-")) { //$NON-NLS-1$

				if (arguments[++index].equalsIgnoreCase("resourceInterfaces")) { //$NON-NLS-1$
					packageInfo.resourceInterfaces = true;
					break;
				} else {
					packageInfo.operationsPackage = arguments[index];
				}
			}

			if (index - start == 0 || index - start == 4) {
				throw new IllegalArgumentException(
					"Error: Expecting either 1 - 3 or 5 - 7 arguments for " //$NON-NLS-1$
						+ arguments[start]);
			} else {
				nameToPackageInfo.put(packageInfo.name, packageInfo);
				nameToPackageInfo.put(packageInfo.name.toLowerCase(),
					packageInfo);
				return index;
			}
		} else {
			throw new IllegalArgumentException(
				"Error: No package name was specified for " + arguments[start]); //$NON-NLS-1$
		}
	}

	@Override
	protected void adjustModelImporter(Monitor monitor) {

		try {
			monitor.beginTask("", 2); //$NON-NLS-1$

			super.adjustModelImporter(CodeGenUtil.createMonitor(monitor, 1));

			UMLImporter umlImporter = getUMLImporter();

			if (umlImporter != null) {
				umlImporter.getOptions().putAll(importerOptions);
			}

		} finally {
			monitor.done();
		}
	}

	@Override
	protected void adjustGenModel(Monitor monitor) {

		try {
			monitor.beginTask("", 2); //$NON-NLS-1$

			super.adjustGenModel(CodeGenUtil.createMonitor(monitor, 1));

			GenModel genModel = getUMLImporter().getGenModel();

			if (genModel instanceof org.eclipse.uml2.codegen.ecore.genmodel.GenModel) {
				org.eclipse.uml2.codegen.ecore.genmodel.GenModel uml2GenModel = (org.eclipse.uml2.codegen.ecore.genmodel.GenModel) genModel;

				if (pluralizeGetters) {
					uml2GenModel.setPluralizedGetters(pluralizeGetters);
				}

				if (safeStrings) {
					uml2GenModel.setSafeStrings(safeStrings);
				}

				if (cacheAdapterSupport) {
					uml2GenModel.setCacheAdapterSupport(cacheAdapterSupport);
				}

				if (factoryMethods) {
					uml2GenModel.setFactoryMethods(factoryMethods);
				}

				if (invariantPrefix != null) {
					uml2GenModel.setInvariantPrefix(invariantPrefix);
				}
			}
		} finally {
			monitor.done();
		}
	}

	@Override
	protected void adjustEPackages(Monitor monitor) {

		try {
			monitor.beginTask("", 2); //$NON-NLS-1$
			super.adjustEPackages(CodeGenUtil.createMonitor(monitor, 1));

			UMLImporter umlImporter = getUMLImporter();
			List<EPackage> ePackages = umlImporter.getEPackages();

			traverseEPackages(ePackages);
			umlImporter.adjustEPackages(CodeGenUtil.createMonitor(monitor, 1));
		} finally {
			monitor.done();
		}
	}

	protected void traverseEPackages(List<EPackage> ePackages) {

		for (EPackage ePackage : ePackages) {

			if (nameToPackageInfo != null) {
				PackageInfo packageInfo = nameToPackageInfo.get(ePackage
					.getName());

				if (packageInfo != null) {
					handleEPackage(ePackage, true);

					ModelImporter.EPackageImportInfo ePackageImportInfo = getUMLImporter()
						.getEPackageImportInfo(ePackage);

					if (packageInfo.nsPrefix != null) {
						ePackage.setNsPrefix(packageInfo.nsPrefix);
					}

					if (packageInfo.nsURI != null) {
						ePackage.setNsURI(packageInfo.nsURI);
					}

					if (ePackageImportInfo.getBasePackage() == null) {
						ePackageImportInfo.setBasePackage(packageInfo.base);
					}

					if (ePackageImportInfo.getPrefix() == null) {
						ePackageImportInfo.setPrefix(packageInfo.prefix);
					}

					if (ePackageImportInfo instanceof UMLImporter.EPackageImportInfo) {
						UMLImporter.EPackageImportInfo umlEPackageImportInfo = (UMLImporter.EPackageImportInfo) ePackageImportInfo;

						umlEPackageImportInfo
							.setResourceInterfaces(packageInfo.resourceInterfaces);

						umlEPackageImportInfo
							.setOperationsPackage(packageInfo.operationsPackage);
					}
				}
			}

			handleQualifiedEPackageName(ePackage);
			traverseEPackages(ePackage.getESubpackages());
		}
	}  

}
