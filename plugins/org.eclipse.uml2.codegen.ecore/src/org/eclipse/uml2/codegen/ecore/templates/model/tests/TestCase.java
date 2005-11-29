package org.eclipse.uml2.codegen.ecore.templates.model.tests;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class TestCase
{
  protected static String nl;
  public static synchronized TestCase create(String lineSeparator)
  {
    nl = lineSeparator;
    TestCase result = new TestCase();
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
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A test case for the model object '<em><b>";
  protected final String TEXT_8 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_9 = NL + " * <p>" + NL + " * The following features are tested:" + NL + " * <ul>";
  protected final String TEXT_10 = NL + " *   <li>{@link ";
  protected final String TEXT_11 = "#";
  protected final String TEXT_12 = "() <em>";
  protected final String TEXT_13 = "</em>}</li>";
  protected final String TEXT_14 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_15 = NL + " * <p>" + NL + " * The following operations are tested:" + NL + " * <ul>";
  protected final String TEXT_16 = NL + " *   <li>{@link ";
  protected final String TEXT_17 = "#";
  protected final String TEXT_18 = "(";
  protected final String TEXT_19 = ") <em>";
  protected final String TEXT_20 = "</em>}</li>";
  protected final String TEXT_21 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_22 = NL + " * @generated" + NL + " */" + NL + "public";
  protected final String TEXT_23 = " abstract";
  protected final String TEXT_24 = " class ";
  protected final String TEXT_25 = " extends ";
  protected final String TEXT_26 = NL + "{";
  protected final String TEXT_27 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_28 = " copyright = \"";
  protected final String TEXT_29 = "\";";
  protected final String TEXT_30 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_31 = " mofDriverNumber = \"";
  protected final String TEXT_32 = "\";";
  protected final String TEXT_33 = NL + NL + "\t/**" + NL + "\t * The fixture for this ";
  protected final String TEXT_34 = " test case." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_35 = " fixture = null;";
  protected final String TEXT_36 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static void main(String[] args)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_37 = ".run(";
  protected final String TEXT_38 = "Test.class);" + NL + "\t}";
  protected final String TEXT_39 = NL + NL + "\t/**" + NL + "\t * Constructs a new ";
  protected final String TEXT_40 = " test case with the given name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_41 = "(String name)" + NL + "\t{" + NL + "\t\tsuper(name);" + NL + "\t}";
  protected final String TEXT_42 = NL + NL + "\t/**" + NL + "\t * Sets the fixture for this ";
  protected final String TEXT_43 = " test case." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void setFixture(";
  protected final String TEXT_44 = " fixture)" + NL + "\t{" + NL + "\t\tthis.fixture = fixture;" + NL + "\t}";
  protected final String TEXT_45 = NL + NL + "\t/**" + NL + "\t * Returns the fixture for this ";
  protected final String TEXT_46 = " test case." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_47 = " getFixture()" + NL + "\t{";
  protected final String TEXT_48 = NL + "\t\treturn fixture;";
  protected final String TEXT_49 = NL + "\t\treturn (";
  protected final String TEXT_50 = ")fixture;";
  protected final String TEXT_51 = NL + "\t}";
  protected final String TEXT_52 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see junit.framework.TestCase#setUp()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void setUp() throws Exception" + NL + "\t{" + NL + "\t\tsetFixture(";
  protected final String TEXT_53 = ".create";
  protected final String TEXT_54 = "());" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see junit.framework.TestCase#tearDown()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void tearDown() throws Exception" + NL + "\t{" + NL + "\t\tsetFixture(null);" + NL + "\t}";
  protected final String TEXT_55 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_56 = "#";
  protected final String TEXT_57 = "() <em>";
  protected final String TEXT_58 = "</em>}' feature getter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_59 = "#";
  protected final String TEXT_60 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void test";
  protected final String TEXT_61 = "()" + NL + "\t{";
  protected final String TEXT_62 = NL;
  protected final String TEXT_63 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_64 = NL + "\t}";
  protected final String TEXT_65 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_66 = "#set";
  protected final String TEXT_67 = "(";
  protected final String TEXT_68 = ") <em>";
  protected final String TEXT_69 = "</em>}' feature setter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_70 = "#set";
  protected final String TEXT_71 = "(";
  protected final String TEXT_72 = ")" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void testSet";
  protected final String TEXT_73 = "()" + NL + "\t{";
  protected final String TEXT_74 = NL;
  protected final String TEXT_75 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_76 = NL + "\t}";
  protected final String TEXT_77 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_78 = "#unset";
  protected final String TEXT_79 = "() <em>unset";
  protected final String TEXT_80 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_81 = "#unset";
  protected final String TEXT_82 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void testUnset";
  protected final String TEXT_83 = "()" + NL + "\t{";
  protected final String TEXT_84 = NL;
  protected final String TEXT_85 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_86 = NL + "\t}";
  protected final String TEXT_87 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_88 = "#isSet";
  protected final String TEXT_89 = "() <em>isSet";
  protected final String TEXT_90 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_91 = "#isSet";
  protected final String TEXT_92 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void testIsSet";
  protected final String TEXT_93 = "()" + NL + "\t{";
  protected final String TEXT_94 = NL;
  protected final String TEXT_95 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_96 = NL + "\t}";
  protected final String TEXT_97 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_98 = "#";
  protected final String TEXT_99 = "(";
  protected final String TEXT_100 = ") <em>";
  protected final String TEXT_101 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_102 = "#";
  protected final String TEXT_103 = "(";
  protected final String TEXT_104 = ")" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void test";
  protected final String TEXT_105 = "()" + NL + "\t{";
  protected final String TEXT_106 = NL;
  protected final String TEXT_107 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_108 = NL + "\t}";
  protected final String TEXT_109 = NL;
  protected final String TEXT_110 = NL;
  protected final String TEXT_111 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_112 = "#";
  protected final String TEXT_113 = "() <em>";
  protected final String TEXT_114 = "</em>}' feature getter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_115 = "#";
  protected final String TEXT_116 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void test";
  protected final String TEXT_117 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this union feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_118 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_119 = "#isSet";
  protected final String TEXT_120 = "() <em>isSet";
  protected final String TEXT_121 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_122 = "#isSet";
  protected final String TEXT_123 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void testIsSet";
  protected final String TEXT_124 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this union test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_125 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_126 = "#";
  protected final String TEXT_127 = "() <em>";
  protected final String TEXT_128 = "</em>}' feature getter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_129 = "#";
  protected final String TEXT_130 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void test";
  protected final String TEXT_131 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_132 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_133 = "#set";
  protected final String TEXT_134 = "(";
  protected final String TEXT_135 = ") <em>";
  protected final String TEXT_136 = "</em>}' feature setter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_137 = "#set";
  protected final String TEXT_138 = "(";
  protected final String TEXT_139 = ")" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void testSet";
  protected final String TEXT_140 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined feature setter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_141 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_142 = "#unset";
  protected final String TEXT_143 = "() <em>unset";
  protected final String TEXT_144 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_145 = "#unset";
  protected final String TEXT_146 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void testUnset";
  protected final String TEXT_147 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_148 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_149 = "#isSet";
  protected final String TEXT_150 = "() <em>isSet";
  protected final String TEXT_151 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_152 = "#isSet";
  protected final String TEXT_153 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void testIsSet";
  protected final String TEXT_154 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_155 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_156 = "#";
  protected final String TEXT_157 = "(";
  protected final String TEXT_158 = ") <em>";
  protected final String TEXT_159 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_160 = "#";
  protected final String TEXT_161 = "(";
  protected final String TEXT_162 = ")" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void test";
  protected final String TEXT_163 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined operation test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_164 = NL + "} //";
  protected final String TEXT_165 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
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

    GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getTestsPackageName());
    stringBuffer.append(TEXT_6);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_8);
    if (!genClass.getImplementedGenFeatures().isEmpty()) { boolean first = true;
    for (Iterator genFeatures = genClass.getImplementedGenFeatures().iterator(); genFeatures.hasNext();) { GenFeature genFeature = (GenFeature)genFeatures.next();
    if ((genFeature.isVolatile() || genFeature.isDerived()) && !genFeature.isSuppressedGetVisibility()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_13);
    }
    }
     if (!first) {
    stringBuffer.append(TEXT_14);
    }
    }
    if (!genClass.getImplementedGenOperations().isEmpty()) { boolean first = true;
    for (Iterator genOperations = genClass.getImplementedGenOperations().iterator(); genOperations.hasNext();) { GenOperation genOperation = (GenOperation)genOperations.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_20);
    }
     if (!first) {
    stringBuffer.append(TEXT_21);
    }
    }
    stringBuffer.append(TEXT_22);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genClass.getTestCaseClassName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genClass.isModelRoot() ? genModel.getImportedName("junit.framework.TestCase") : genClass.getClassExtendsGenClass().getImportedTestCaseClassName());
    stringBuffer.append(TEXT_26);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genClass.isModelRoot()) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_35);
    }
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getImportedName("junit.textui.TestRunner"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genClass.getTestCaseClassName());
    stringBuffer.append(TEXT_41);
    if (genClass.isModelRoot()) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_47);
    if (genClass.isModelRoot()) {
    stringBuffer.append(TEXT_48);
    } else {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_50);
    }
    stringBuffer.append(TEXT_51);
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genPackage.getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_54);
    }
    for (Iterator genFeatures=genClass.getImplementedGenFeatures().iterator(); genFeatures.hasNext();) { GenFeature genFeature = (GenFeature)genFeatures.next();
    if (genFeature.isVolatile() || genFeature.isDerived()) {
    if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genModel.capName(genFeature.getGetAccessor()));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(TEXT_63);
    //TestCase/getGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_64);
    //TestCase/getGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(TEXT_75);
    //TestCase/setGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_76);
    //TestCase/setGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(TEXT_85);
    //TestCase/unsetGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_86);
    //TestCase/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(TEXT_95);
    //TestCase/isSetGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_96);
    //TestCase/isSetGenFeature.override.javajetinc
    }
    }
    //TestCase/implementedGenFeature.override.javajetinc
    }
    for (Iterator genOperations = genClass.getImplementedGenOperations().iterator(); genOperations.hasNext();) { GenOperation genOperation = (GenOperation)genOperations.next();
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genModel.capName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + genOperation.getParameterTypes("_", false));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(TEXT_107);
    //TestCase/implementedGenOperation.todo.override.javajetinc
    stringBuffer.append(TEXT_108);
    //TestCase/implementedGenOperation.override.javajetinc
    }
    stringBuffer.append(TEXT_109);
    stringBuffer.append(TEXT_110);
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genFeature.isListType() || !UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genModel.capName(genFeature.getGetAccessor()));
    stringBuffer.append(TEXT_117);
    }
    if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_124);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genModel.capName(genFeature.getGetAccessor()));
    stringBuffer.append(TEXT_131);
    }
    if (genFeature.isSet() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_140);
    }
    if (genFeature.isUnset() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_147);
    }
    if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_154);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genModel.capName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + genOperation.getParameterTypes("_", false));
    stringBuffer.append(TEXT_163);
    }
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genClass.getTestCaseClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_165);
    return stringBuffer.toString();
  }
}
