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

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A static utility class that provides operations related to '<em><b>";
  protected final String TEXT_7 = "</b></em>' model objects." + NL + " * <!-- end-user-doc -->" + NL + " *";
  protected final String TEXT_8 = NL + " * <p>" + NL + " * The following operations are supported:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_9 = NL + " *   <li>{@link ";
  protected final String TEXT_10 = "#";
  protected final String TEXT_11 = "(";
  protected final String TEXT_12 = ") <em>";
  protected final String TEXT_13 = "</em>}</li>";
  protected final String TEXT_14 = NL + " * </ul>";
  protected final String TEXT_15 = NL + " *" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_16 = NL + "{";
  protected final String TEXT_17 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_18 = " copyright = ";
  protected final String TEXT_19 = ";";
  protected final String TEXT_20 = NL;
  protected final String TEXT_21 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_22 = " EOCL_ENV = ";
  protected final String TEXT_23 = ".newInstance();" + NL;
  protected final String TEXT_24 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_25 = "() {" + NL + "\t\tsuper();" + NL + "\t}" + NL;
  protected final String TEXT_26 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_27 = "(";
  protected final String TEXT_28 = ", ";
  protected final String TEXT_29 = ") <em>";
  protected final String TEXT_30 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_31 = "(";
  protected final String TEXT_32 = ", ";
  protected final String TEXT_33 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_34 = " ";
  protected final String TEXT_35 = "__EOCL_EXP = \"";
  protected final String TEXT_36 = "\";";
  protected final String TEXT_37 = NL;
  protected final String TEXT_38 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_39 = "(";
  protected final String TEXT_40 = ", ";
  protected final String TEXT_41 = ") <em>";
  protected final String TEXT_42 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_43 = "(";
  protected final String TEXT_44 = ", ";
  protected final String TEXT_45 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_46 = " ";
  protected final String TEXT_47 = "__EOCL_INV;" + NL;
  protected final String TEXT_48 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_49 = "(";
  protected final String TEXT_50 = ", ";
  protected final String TEXT_51 = ") <em>";
  protected final String TEXT_52 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_53 = "(";
  protected final String TEXT_54 = ", ";
  protected final String TEXT_55 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_56 = "<";
  protected final String TEXT_57 = ">";
  protected final String TEXT_58 = " ";
  protected final String TEXT_59 = "__EOCL_QRY;" + NL;
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_61 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_62 = NL + "\t * ";
  protected final String TEXT_63 = NL + "\t * @param ";
  protected final String TEXT_64 = " The receiving '<em><b>";
  protected final String TEXT_65 = "</b></em>' model object.";
  protected final String TEXT_66 = NL + "\t * @param ";
  protected final String TEXT_67 = NL + "\t *   ";
  protected final String TEXT_68 = NL + "\t * @param ";
  protected final String TEXT_69 = " ";
  protected final String TEXT_70 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_71 = NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_72 = " ";
  protected final String TEXT_73 = " ";
  protected final String TEXT_74 = "(";
  protected final String TEXT_75 = " ";
  protected final String TEXT_76 = ", ";
  protected final String TEXT_77 = ")";
  protected final String TEXT_78 = NL + "\t{";
  protected final String TEXT_79 = NL + "\t\tif (";
  protected final String TEXT_80 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_81 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_82 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_83 = " = helper.createInvariant(";
  protected final String TEXT_84 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_85 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_86 = ").check(";
  protected final String TEXT_87 = "))";
  protected final String TEXT_88 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_89 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_90 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_91 = NL + "\t\t\t\t";
  protected final String TEXT_92 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_93 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_94 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_95 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_96 = ".";
  protected final String TEXT_97 = "," + NL + "\t\t\t\t\t\t org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_98 = "\", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(";
  protected final String TEXT_99 = ", ";
  protected final String TEXT_100 = ") }),";
  protected final String TEXT_101 = NL + "\t\t\t\t\t\t new Object [] { ";
  protected final String TEXT_102 = " }));";
  protected final String TEXT_103 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_104 = NL + "\t\tif (";
  protected final String TEXT_105 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_106 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_107 = ", ";
  protected final String TEXT_108 = ".getEAllOperations().get(";
  protected final String TEXT_109 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_110 = " = helper.createQuery(";
  protected final String TEXT_111 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_112 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_113 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_114 = ");";
  protected final String TEXT_115 = NL + "\t\t";
  protected final String TEXT_116 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_117 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_118 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_119 = "\", ";
  protected final String TEXT_120 = ");";
  protected final String TEXT_121 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_122 = NL + "\t\t";
  protected final String TEXT_123 = "<";
  protected final String TEXT_124 = "> result = (";
  protected final String TEXT_125 = "<";
  protected final String TEXT_126 = ">) query.evaluate(";
  protected final String TEXT_127 = ");" + NL + "\t\treturn new ";
  protected final String TEXT_128 = ".UnmodifiableEList<";
  protected final String TEXT_129 = ">(result.size(), result.toArray());";
  protected final String TEXT_130 = NL + "\t\treturn ((";
  protected final String TEXT_131 = ") query.evaluate(";
  protected final String TEXT_132 = ")).";
  protected final String TEXT_133 = "();";
  protected final String TEXT_134 = NL + "\t\treturn (";
  protected final String TEXT_135 = ") query.evaluate(";
  protected final String TEXT_136 = ");";
  protected final String TEXT_137 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_138 = NL + "\t}" + NL;
  protected final String TEXT_139 = NL + "} // ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 206636, 224693
 *	 Lutz Wrage - 242726
 *   Kenn Hussey - 344908, 284810, 345083
 *   Kenn Hussey (CEA) - 451350
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
    }}
    stringBuffer.append(TEXT_4);
    stringBuffer.append(UML2GenModelUtil.getOperationsPackageName(genPackage));
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_7);
    if (!UML2GenModelUtil.getOperationsClassGenOperations(genClass).isEmpty()) { boolean first = true;
    for (GenOperation genOperation : UML2GenModelUtil.getOperationsClassGenOperations(genClass)) {
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
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_20);
    }
    if (UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || !UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    stringBuffer.append(TEXT_25);
    for (GenOperation genOperation : UML2GenModelUtil.getOperationsClassGenOperations(genClass)) {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_37);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_47);
    } else {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_50);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_57);
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_59);
    }
    }
    stringBuffer.append(TEXT_60);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_61);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_65);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_70);
    }
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genClass.getTypeParameters().length() > 0 && genOperation.getTypeParameters(genClass).length() > 0 ? genClass.getTypeParameters().substring(0, genClass.getTypeParameters().length() - 2) + ", " + genOperation.getTypeParameters(genClass).trim().substring(1) : genClass.getTypeParameters().trim() + genOperation.getTypeParameters(genClass).trim());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_76);
    }
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_78);
    if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_79);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_87);
    } else {
    stringBuffer.append(TEXT_88);
    }
    stringBuffer.append(TEXT_89);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_102);
    //Operations/genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_103);
    } else if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclQry = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_QRY";
		GenOperation redefinedGenOperation = genOperation;
		while (UML2GenModelUtil.isDuplicate(redefinedGenOperation)) {
			java.util.List<GenOperation> redefinedGenOperations = UML2GenModelUtil.getRedefinedGenOperations(redefinedGenOperation);
			if (redefinedGenOperations.size() > 0) {
				redefinedGenOperation = redefinedGenOperations.get(0);
			} else {
				break;
			}
		}
		int index = genOperation.getGenClass().getAllGenOperations().indexOf(redefinedGenOperation);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_109);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_114);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_116);
    }
    stringBuffer.append(TEXT_117);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_121);
    }
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_129);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_133);
    } else {
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_136);
    }
    } else {
    stringBuffer.append(TEXT_137);
    //Operations/genOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_138);
    //Operations/genOperation.override.javajetinc
    }
    stringBuffer.append(TEXT_139);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
