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
  protected final String TEXT_24 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_25 = " EOCL_ENV = ";
  protected final String TEXT_26 = ".newInstance();" + NL;
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_28 = "() {" + NL + "\t\tsuper();" + NL + "\t}" + NL;
  protected final String TEXT_29 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_30 = "(";
  protected final String TEXT_31 = ", ";
  protected final String TEXT_32 = ") <em>";
  protected final String TEXT_33 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_34 = "(";
  protected final String TEXT_35 = ", ";
  protected final String TEXT_36 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_37 = " ";
  protected final String TEXT_38 = "__EOCL_EXP = \"";
  protected final String TEXT_39 = "\";";
  protected final String TEXT_40 = NL;
  protected final String TEXT_41 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_42 = "(";
  protected final String TEXT_43 = ", ";
  protected final String TEXT_44 = ") <em>";
  protected final String TEXT_45 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_46 = "(";
  protected final String TEXT_47 = ", ";
  protected final String TEXT_48 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_49 = " ";
  protected final String TEXT_50 = "__EOCL_INV;" + NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_52 = "(";
  protected final String TEXT_53 = ", ";
  protected final String TEXT_54 = ") <em>";
  protected final String TEXT_55 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_56 = "(";
  protected final String TEXT_57 = ", ";
  protected final String TEXT_58 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_59 = "<";
  protected final String TEXT_60 = ">";
  protected final String TEXT_61 = " ";
  protected final String TEXT_62 = "__EOCL_QRY;" + NL;
  protected final String TEXT_63 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_64 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_65 = NL + "\t * ";
  protected final String TEXT_66 = NL + "\t * @param ";
  protected final String TEXT_67 = " The receiving '<em><b>";
  protected final String TEXT_68 = "</b></em>' model object.";
  protected final String TEXT_69 = NL + "\t * @param ";
  protected final String TEXT_70 = NL + "\t *   ";
  protected final String TEXT_71 = NL + "\t * @param ";
  protected final String TEXT_72 = " ";
  protected final String TEXT_73 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_74 = NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_75 = " ";
  protected final String TEXT_76 = "(";
  protected final String TEXT_77 = " ";
  protected final String TEXT_78 = ", ";
  protected final String TEXT_79 = ")";
  protected final String TEXT_80 = NL + "\t{";
  protected final String TEXT_81 = NL + "\t\t";
  protected final String TEXT_82 = NL + "\t\tif (";
  protected final String TEXT_83 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_84 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_85 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_86 = " = helper.createInvariant(";
  protected final String TEXT_87 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_88 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_89 = ").check(";
  protected final String TEXT_90 = "))";
  protected final String TEXT_91 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_92 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_93 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_94 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_95 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_96 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_97 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_98 = ".";
  protected final String TEXT_99 = "," + NL + "\t\t\t\t\t\t org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_100 = "\", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(";
  protected final String TEXT_101 = ", ";
  protected final String TEXT_102 = ") }),";
  protected final String TEXT_103 = NL + "\t\t\t\t\t\t new Object [] { ";
  protected final String TEXT_104 = " }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_105 = NL + "\t\tif (";
  protected final String TEXT_106 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_107 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_108 = ", ";
  protected final String TEXT_109 = ".getEAllOperations().get(";
  protected final String TEXT_110 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_111 = " = helper.createQuery(";
  protected final String TEXT_112 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_113 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_114 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_115 = ");";
  protected final String TEXT_116 = NL + "\t\t";
  protected final String TEXT_117 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_118 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_119 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_120 = "\", ";
  protected final String TEXT_121 = ");";
  protected final String TEXT_122 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_123 = NL + "\t\t";
  protected final String TEXT_124 = "<";
  protected final String TEXT_125 = "> result = (";
  protected final String TEXT_126 = "<";
  protected final String TEXT_127 = ">) query.evaluate(";
  protected final String TEXT_128 = ");" + NL + "\t\treturn new ";
  protected final String TEXT_129 = ".UnmodifiableEList<";
  protected final String TEXT_130 = ">(result.size(), result.toArray());";
  protected final String TEXT_131 = NL + "\t\treturn ((";
  protected final String TEXT_132 = ") query.evaluate(";
  protected final String TEXT_133 = ")).";
  protected final String TEXT_134 = "();";
  protected final String TEXT_135 = NL + "\t\treturn (";
  protected final String TEXT_136 = ") query.evaluate(";
  protected final String TEXT_137 = ");";
  protected final String TEXT_138 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_139 = NL + "\t}" + NL;
  protected final String TEXT_140 = NL + "} // ";

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
    if (UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    stringBuffer.append(TEXT_28);
    for (GenOperation genOperation : UML2GenModelUtil.getDuplicateGenOperations(genClass)) {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_40);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_50);
    } else {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genClass.getImportedInterfaceName());
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_57);
    }
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_60);
    }
    stringBuffer.append(TEXT_61);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_62);
    }
    }
    stringBuffer.append(TEXT_63);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_64);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_68);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_73);
    }
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genOperation.getTypeParameters(null));
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_78);
    }
    stringBuffer.append(genOperation.getParameters(null));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genOperation.getThrows(null));
    stringBuffer.append(TEXT_80);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_82);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_90);
    } else {
    stringBuffer.append(TEXT_91);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_93);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_96);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_104);
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
    stringBuffer.append(TEXT_105);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_115);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_117);
    }
    stringBuffer.append(TEXT_118);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_130);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_134);
    } else {
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genClass.safeName(genClass.getUncapName()));
    stringBuffer.append(TEXT_137);
    }
    } else {
    stringBuffer.append(TEXT_138);
    //Operations/genOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_139);
    //Operations/genOperation.override.javajetinc
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(UML2GenModelUtil.getOperationsClassName(genClass));
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
