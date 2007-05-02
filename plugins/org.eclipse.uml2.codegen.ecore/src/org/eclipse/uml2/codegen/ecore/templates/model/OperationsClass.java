package org.eclipse.uml2.codegen.ecore.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class OperationsClass
{
  protected static String nl;
  public static synchronized OperationsClass create(String lineSeparator)
  {
    nl = lineSeparator;
    OperationsClass result = new OperationsClass();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_5 = NL + " *" + NL + " * ";
  protected final String TEXT_6 = "Id";
  protected final String TEXT_7 = NL + " */" + NL + "package ";
  protected final String TEXT_8 = ";" + NL;
  protected final String TEXT_9 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A static utility class that provides operations related to '<em><b>";
  protected final String TEXT_10 = "</b></em>' model objects." + NL + " * <!-- end-user-doc -->" + NL + " *";
  protected final String TEXT_11 = NL + " * <p>" + NL + " * The following operations are supported:" + NL + " * <ul>";
  protected final String TEXT_12 = NL + " *   <li>{@link ";
  protected final String TEXT_13 = "#";
  protected final String TEXT_14 = "(";
  protected final String TEXT_15 = ") <em>";
  protected final String TEXT_16 = "</em>}</li>";
  protected final String TEXT_17 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_18 = NL + " *" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_19 = NL + "{";
  protected final String TEXT_20 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_21 = " copyright = \"";
  protected final String TEXT_22 = "\";";
  protected final String TEXT_23 = NL;
  protected final String TEXT_24 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_25 = "() {" + NL + "\t\tsuper();" + NL + "\t}" + NL;
  protected final String TEXT_26 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_27 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_28 = NL + "\t * ";
  protected final String TEXT_29 = NL + "\t * @param ";
  protected final String TEXT_30 = " The receiving '<em><b>";
  protected final String TEXT_31 = "</b></em>' model object.";
  protected final String TEXT_32 = NL + "\t * @param ";
  protected final String TEXT_33 = NL + "\t *   ";
  protected final String TEXT_34 = NL + "\t * @param ";
  protected final String TEXT_35 = " ";
  protected final String TEXT_36 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_37 = NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = "(";
  protected final String TEXT_40 = " ";
  protected final String TEXT_41 = ", ";
  protected final String TEXT_42 = ")";
  protected final String TEXT_43 = NL + "\t{";
  protected final String TEXT_44 = NL + "\t\t";
  protected final String TEXT_45 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_46 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_47 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_48 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_49 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_50 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_51 = ".";
  protected final String TEXT_52 = "," + NL + "\t\t\t\t\t\t org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_53 = "\", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(";
  protected final String TEXT_54 = ", ";
  protected final String TEXT_55 = ") }),";
  protected final String TEXT_56 = NL + "\t\t\t\t\t\t new Object [] { ";
  protected final String TEXT_57 = " }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_58 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_59 = NL + "\t}" + NL;
  protected final String TEXT_60 = NL + "} // ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * </copyright>
 */

    GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    }}
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    stringBuffer.append(UML2GenModelUtil.getOperationsPackageName(genPackage));
    stringBuffer.append(TEXT_8);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_10);
    if (!UML2GenModelUtil.getDuplicateGenOperations(genClass).isEmpty()) { boolean first = true;
    for (GenOperation genOperation : UML2GenModelUtil.getDuplicateGenOperations(genClass)) {
    if (first) { first = false;
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_16);
    }
     if (!first) {
    stringBuffer.append(TEXT_17);
    }
    }
    stringBuffer.append(TEXT_18);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    stringBuffer.append(UML2GenModelUtil.getOperationsClassExtends(genClass));
    stringBuffer.append(TEXT_19);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    stringBuffer.append(TEXT_25);
    for (GenOperation genOperation : UML2GenModelUtil.getDuplicateGenOperations(genClass)) {
    stringBuffer.append(TEXT_26);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_27);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_31);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_36);
    }
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_41);
    }
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_43);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    stringBuffer.append(TEXT_45);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_57);
    } else {
    stringBuffer.append(TEXT_58);
    //Operations/genOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_59);
    //Operations/genOperation.override.javajetinc
    }
    stringBuffer.append(TEXT_60);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
