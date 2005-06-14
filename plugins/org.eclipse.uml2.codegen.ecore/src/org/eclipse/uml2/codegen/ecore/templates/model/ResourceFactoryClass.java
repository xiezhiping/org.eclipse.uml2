package org.eclipse.uml2.codegen.ecore.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class ResourceFactoryClass
{
  protected static String nl;
  public static synchronized ResourceFactoryClass create(String lineSeparator)
  {
    nl = lineSeparator;
    ResourceFactoryClass result = new ResourceFactoryClass();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_4 = "Id";
  protected final String TEXT_5 = NL + " */" + NL + "package ";
  protected final String TEXT_6 = ";" + NL;
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Resource Factory</b> associated with the package." + NL + " * <!-- end-user-doc -->" + NL + " * @see ";
  protected final String TEXT_8 = NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = " extends ";
  protected final String TEXT_10 = NL + "{";
  protected final String TEXT_11 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_12 = " copyright = \"";
  protected final String TEXT_13 = "\";";
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_16 = " extendedMetaData;" + NL;
  protected final String TEXT_17 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_18 = " xmlMap = new ";
  protected final String TEXT_19 = "();" + NL;
  protected final String TEXT_20 = NL + "\t/**" + NL + "\t * Creates an instance of the resource factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_21 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_22 = NL + "\t\textendedMetaData = new ";
  protected final String TEXT_23 = "(new ";
  protected final String TEXT_24 = "(";
  protected final String TEXT_25 = ".Registry.INSTANCE));" + NL + "\t\textendedMetaData.putPackage(null, ";
  protected final String TEXT_26 = ".eINSTANCE);";
  protected final String TEXT_27 = NL + "\t\txmlMap.setNoNamespacePackage(";
  protected final String TEXT_28 = ".eINSTANCE);";
  protected final String TEXT_29 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates an instance of the resource." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Resource createResource(URI uri)" + NL + "\t{";
  protected final String TEXT_30 = NL;
  protected final String TEXT_31 = "\t\t";
  protected final String TEXT_32 = " result = new ";
  protected final String TEXT_33 = "(uri);";
  protected final String TEXT_34 = NL + "\t\tresult.getDefaultSaveOptions().put(";
  protected final String TEXT_35 = ".OPTION_EXTENDED_META_DATA, extendedMetaData);" + NL + "\t\tresult.getDefaultLoadOptions().put(";
  protected final String TEXT_36 = ".OPTION_EXTENDED_META_DATA, extendedMetaData);" + NL + "" + NL + "\t\tresult.getDefaultSaveOptions().put(";
  protected final String TEXT_37 = ".OPTION_SCHEMA_LOCATION, Boolean.TRUE);" + NL + "\t\tresult.getDefaultSaveOptions().put(";
  protected final String TEXT_38 = ".OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);" + NL + "" + NL + "\t\tresult.getDefaultLoadOptions().put(";
  protected final String TEXT_39 = ".OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);";
  protected final String TEXT_40 = NL + "\t\tresult.getDefaultSaveOptions().put(";
  protected final String TEXT_41 = ".OPTION_XML_MAP, xmlMap);" + NL + "\t\tresult.getDefaultLoadOptions().put(";
  protected final String TEXT_42 = ".OPTION_XML_MAP, xmlMap);";
  protected final String TEXT_43 = NL + "\t\tresult.setEncoding(";
  protected final String TEXT_44 = ".DEFAULT_ENCODING);";
  protected final String TEXT_45 = NL + "\t\treturn result;";
  protected final String TEXT_46 = NL + "\t}" + NL + "" + NL + "} //";
  protected final String TEXT_47 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getUtilitiesPackageName());
    stringBuffer.append(TEXT_6);
    genModel.getImportedName("org.eclipse.emf.common.util.URI");
    genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource");
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getQualifiedResourceClassName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getResourceFactoryClassName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getImportedResourceFactoryBaseClassName());
    stringBuffer.append(TEXT_10);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_14);
    }
    if (genPackage.hasExtendedMetaData() && !genPackage.hasTargetNamespace()) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData"));
    stringBuffer.append(TEXT_16);
    } else if (genPackage.hasXMLMap()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource$XMLMap"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.XMLMapImpl"));
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genPackage.getResourceFactoryClassName());
    stringBuffer.append(TEXT_21);
    if (genPackage.hasExtendedMetaData() && !genPackage.hasTargetNamespace()) {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.BasicExtendedMetaData"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.EPackageRegistryImpl"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_26);
    } else if (genPackage.hasXMLMap() && !genPackage.hasTargetNamespace()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(UML2GenModelUtil.isResourceInterfaces(genPackage) ? UML2GenModelUtil.getImportedResourceInterfaceName(genPackage) : genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genPackage.getResourceClassName());
    stringBuffer.append(TEXT_33);
    if (genPackage.hasExtendedMetaData()) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
    stringBuffer.append(TEXT_39);
    } else if (genPackage.hasXMLMap()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
    stringBuffer.append(TEXT_42);
    }
    if (UML2GenModelUtil.isResourceInterfaces(genPackage) && UML2GenModelUtil.isXMLResource(genPackage)) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(UML2GenModelUtil.getImportedResourceInterfaceName(genPackage));
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    //ResourceFactoryClass/createResource.override.javajetinc
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genPackage.getResourceFactoryClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_47);
    return stringBuffer.toString();
  }
}
