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
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A static utility class that provides operations related to '<em><b>";
  protected final String TEXT_7 = "</b></em>' model objects." + NL + " * <!-- end-user-doc -->" + NL + " *";
  protected final String TEXT_8 = NL + " * <p>" + NL + " * The following operations are supported:" + NL + " * <ul>";
  protected final String TEXT_9 = NL + " *   <li>{@link ";
  protected final String TEXT_10 = "#";
  protected final String TEXT_11 = "(";
  protected final String TEXT_12 = ") <em>";
  protected final String TEXT_13 = "</em>}</li>";
  protected final String TEXT_14 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_15 = NL + " *" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_16 = NL + "{";
  protected final String TEXT_17 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_18 = " copyright = \"";
  protected final String TEXT_19 = "\";";
  protected final String TEXT_20 = NL;
  protected final String TEXT_21 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_22 = "() {" + NL + "\t\tsuper();" + NL + "\t}" + NL;
  protected final String TEXT_23 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_24 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_25 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_26 = NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = "(";
  protected final String TEXT_29 = " ";
  protected final String TEXT_30 = ", ";
  protected final String TEXT_31 = ")";
  protected final String TEXT_32 = NL + "\t{";
  protected final String TEXT_33 = NL + "\t\t";
  protected final String TEXT_34 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_35 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_36 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_37 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_38 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_39 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_40 = ".";
  protected final String TEXT_41 = "," + NL + "\t\t\t\t\t\t org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_42 = "\", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(";
  protected final String TEXT_43 = ", ";
  protected final String TEXT_44 = ") }),";
  protected final String TEXT_45 = NL + "\t\t\t\t\t\t new Object [] { ";
  protected final String TEXT_46 = " }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_47 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_48 = NL + "\t}" + NL;
  protected final String TEXT_49 = NL + "} // ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 IBM Corporation and others.
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
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append(UML2GenModelUtil.getOperationsPackageName(genPackage));
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_7);
    if (!UML2GenModelUtil.getDuplicateGenOperations(genClass).isEmpty()) { boolean first = true;
    for (GenOperation genOperation : UML2GenModelUtil.getDuplicateGenOperations(genClass)) {
    if (first) { first = false;
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_13);
    }
     if (!first) {
    stringBuffer.append(TEXT_14);
    }
    }
    stringBuffer.append(TEXT_15);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    stringBuffer.append(UML2GenModelUtil.getOperationsClassExtends(genClass));
    stringBuffer.append(TEXT_16);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    stringBuffer.append(TEXT_22);
    for (GenOperation genOperation : UML2GenModelUtil.getDuplicateGenOperations(genClass)) {
    stringBuffer.append(TEXT_23);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genOperation.getTypeParameters());
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_32);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    stringBuffer.append(TEXT_34);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_46);
    } else {
    stringBuffer.append(TEXT_47);
    //Operations/genOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_48);
    //Operations/genOperation.override.javajetinc
    }
    stringBuffer.append(TEXT_49);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
