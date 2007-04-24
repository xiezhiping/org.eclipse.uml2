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
  protected final String TEXT_46 = " test case." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_47 = NL + "\t@Override";
  protected final String TEXT_48 = NL + "\t";
  protected final String TEXT_49 = "protected";
  protected final String TEXT_50 = "private";
  protected final String TEXT_51 = " ";
  protected final String TEXT_52 = " getFixture()" + NL + "\t{";
  protected final String TEXT_53 = NL + "\t\treturn fixture;";
  protected final String TEXT_54 = NL + "\t\treturn (";
  protected final String TEXT_55 = ")fixture;";
  protected final String TEXT_56 = NL + "\t}";
  protected final String TEXT_57 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see junit.framework.TestCase#setUp()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_58 = NL + "\t@Override";
  protected final String TEXT_59 = NL + "\tprotected void setUp() throws Exception" + NL + "\t{" + NL + "\t\tsetFixture(";
  protected final String TEXT_60 = ".create";
  protected final String TEXT_61 = "());" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see junit.framework.TestCase#tearDown()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_62 = NL + "\t@Override";
  protected final String TEXT_63 = NL + "\tprotected void tearDown() throws Exception" + NL + "\t{" + NL + "\t\tsetFixture(null);" + NL + "\t}";
  protected final String TEXT_64 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_65 = "#";
  protected final String TEXT_66 = "() <em>";
  protected final String TEXT_67 = "</em>}' feature getter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_68 = "#";
  protected final String TEXT_69 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_70 = NL;
  protected final String TEXT_71 = NL + "\t@Override";
  protected final String TEXT_72 = NL + "\tpublic void test";
  protected final String TEXT_73 = "()" + NL + "\t{";
  protected final String TEXT_74 = NL;
  protected final String TEXT_75 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_76 = NL + "\t}";
  protected final String TEXT_77 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_78 = "#set";
  protected final String TEXT_79 = "(";
  protected final String TEXT_80 = ") <em>";
  protected final String TEXT_81 = "</em>}' feature setter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_82 = "#set";
  protected final String TEXT_83 = "(";
  protected final String TEXT_84 = ")" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_85 = NL;
  protected final String TEXT_86 = NL + "\t@Override";
  protected final String TEXT_87 = NL + "\tpublic void testSet";
  protected final String TEXT_88 = "()" + NL + "\t{";
  protected final String TEXT_89 = NL;
  protected final String TEXT_90 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_91 = NL + "\t}";
  protected final String TEXT_92 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_93 = "#unset";
  protected final String TEXT_94 = "() <em>unset";
  protected final String TEXT_95 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_96 = "#unset";
  protected final String TEXT_97 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_98 = NL;
  protected final String TEXT_99 = NL + "\t@Override";
  protected final String TEXT_100 = NL + "\tpublic void testUnset";
  protected final String TEXT_101 = "()" + NL + "\t{";
  protected final String TEXT_102 = NL;
  protected final String TEXT_103 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_104 = NL + "\t}";
  protected final String TEXT_105 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_106 = "#isSet";
  protected final String TEXT_107 = "() <em>isSet";
  protected final String TEXT_108 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_109 = "#isSet";
  protected final String TEXT_110 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_111 = NL;
  protected final String TEXT_112 = NL + "\t@Override";
  protected final String TEXT_113 = NL + "\tpublic void testIsSet";
  protected final String TEXT_114 = "()" + NL + "\t{";
  protected final String TEXT_115 = NL;
  protected final String TEXT_116 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_117 = NL + "\t}";
  protected final String TEXT_118 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_119 = "#";
  protected final String TEXT_120 = "(";
  protected final String TEXT_121 = ") <em>";
  protected final String TEXT_122 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_123 = "#";
  protected final String TEXT_124 = "(";
  protected final String TEXT_125 = ")" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_126 = NL;
  protected final String TEXT_127 = NL + "\t@Override";
  protected final String TEXT_128 = NL + "\tpublic void test";
  protected final String TEXT_129 = "()" + NL + "\t{";
  protected final String TEXT_130 = NL;
  protected final String TEXT_131 = "\t\t// TODO: implement this feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_132 = NL + "\t}";
  protected final String TEXT_133 = NL;
  protected final String TEXT_134 = NL;
  protected final String TEXT_135 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_136 = "#";
  protected final String TEXT_137 = "() <em>";
  protected final String TEXT_138 = "</em>}' feature getter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_139 = "#";
  protected final String TEXT_140 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_141 = NL;
  protected final String TEXT_142 = NL + "\t@Override";
  protected final String TEXT_143 = NL + "\tpublic void test";
  protected final String TEXT_144 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined feature getter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_145 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_146 = "#set";
  protected final String TEXT_147 = "(";
  protected final String TEXT_148 = ") <em>";
  protected final String TEXT_149 = "</em>}' feature setter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_150 = "#set";
  protected final String TEXT_151 = "(";
  protected final String TEXT_152 = ")" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_153 = NL;
  protected final String TEXT_154 = NL + "\t@Override";
  protected final String TEXT_155 = NL + "\tpublic void testSet";
  protected final String TEXT_156 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined feature setter test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_157 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_158 = "#unset";
  protected final String TEXT_159 = "() <em>unset";
  protected final String TEXT_160 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_161 = "#unset";
  protected final String TEXT_162 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_163 = NL;
  protected final String TEXT_164 = NL + "\t@Override";
  protected final String TEXT_165 = NL + "\tpublic void testUnset";
  protected final String TEXT_166 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_167 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_168 = "#isSet";
  protected final String TEXT_169 = "() <em>isSet";
  protected final String TEXT_170 = "()</em>}' method." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_171 = "#isSet";
  protected final String TEXT_172 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_173 = NL;
  protected final String TEXT_174 = NL + "\t@Override";
  protected final String TEXT_175 = NL + "\tpublic void testIsSet";
  protected final String TEXT_176 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_177 = NL + NL + "\t/**" + NL + "\t * Tests the '{@link ";
  protected final String TEXT_178 = "#";
  protected final String TEXT_179 = "(";
  protected final String TEXT_180 = ") <em>";
  protected final String TEXT_181 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_182 = "#";
  protected final String TEXT_183 = "(";
  protected final String TEXT_184 = ")" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_185 = NL;
  protected final String TEXT_186 = NL + "\t@Override";
  protected final String TEXT_187 = NL + "\tpublic void test";
  protected final String TEXT_188 = "()" + NL + "\t{" + NL + "\t\t// TODO: implement this redefined operation test method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t}";
  protected final String TEXT_189 = NL + "} //";
  protected final String TEXT_190 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
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
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel(); if (false) {/* Trick to import java.util.* without warnings */Iterator.class.getName();}
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
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    if (genFeature.isTested() && !genFeature.isSuppressedGetVisibility()) {
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
    for (GenOperation genOperation : genClass.getImplementedGenOperations()) {
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
    stringBuffer.append(genClass.getInterfaceWildTypeArguments());
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
    stringBuffer.append(genClass.getInterfaceWildTypeArguments());
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_46);
    if (!genClass.isModelRoot() && genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_48);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_49);
    } else {
    stringBuffer.append(TEXT_50);
    }
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceWildTypeArguments());
    stringBuffer.append(TEXT_52);
    if (genClass.isModelRoot()) {
    stringBuffer.append(TEXT_53);
    } else {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceWildTypeArguments());
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_57);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genPackage.getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_61);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_62);
    }
    stringBuffer.append(TEXT_63);
    }
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    if (genFeature.isTested()) {
    if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_69);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/getGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_70);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_71);
    }
    }
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genModel.capName(genFeature.getGetAccessor()));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(TEXT_75);
    //TestCase/getGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_76);
    //TestCase/getGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_84);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/setGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_85);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_86);
    }
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(TEXT_90);
    //TestCase/setGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_91);
    //TestCase/setGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/unsetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_98);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_99);
    }
    }
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(TEXT_103);
    //TestCase/unsetGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_104);
    //TestCase/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_110);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/isSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_111);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_112);
    }
    }
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(TEXT_115);
    stringBuffer.append(TEXT_116);
    //TestCase/isSetGenFeature.todo.override.javajetinc
    stringBuffer.append(TEXT_117);
    //TestCase/isSetGenFeature.override.javajetinc
    }
    }
    //TestCase/implementedGenFeature.override.javajetinc
    }
    for (GenOperation genOperation : genClass.getImplementedGenOperations()) {
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_125);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/genOperation.annotations.insert.javajetinc
    stringBuffer.append(TEXT_126);
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_127);
    }
    }
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.capName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + genOperation.getParameterTypes("_", false));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(TEXT_130);
    stringBuffer.append(TEXT_131);
    //TestCase/implementedGenOperation.todo.override.javajetinc
    stringBuffer.append(TEXT_132);
    //TestCase/implementedGenOperation.override.javajetinc
    }
    stringBuffer.append(TEXT_133);
    stringBuffer.append(TEXT_134);
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) {
    if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_140);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 && UML2GenModelUtil.isTest(genFeature)) { //getGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_141);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_142);
    }
    }
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genModel.capName(genFeature.getGetAccessor()));
    stringBuffer.append(TEXT_144);
    }
    if (genFeature.isSet() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_152);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 && UML2GenModelUtil.isTest(genFeature)) { //setGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_153);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_154);
    }
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_156);
    }
    if (genFeature.isUnset() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_162);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 && UML2GenModelUtil.isTest(genFeature)) { //unsetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_163);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_164);
    }
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_166);
    }
    if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_172);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 && UML2GenModelUtil.isTest(genFeature)) { //isSetGenFeature.annotations.insert.javajetinc
    stringBuffer.append(TEXT_173);
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || (genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()) && UML2GenModelUtil.isTest(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next()))))) {
    stringBuffer.append(TEXT_174);
    }
    }
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_176);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_184);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    stringBuffer.append(TEXT_185);
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_186);
    }
    }
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genModel.capName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + genOperation.getParameterTypes("_", false));
    stringBuffer.append(TEXT_188);
    }
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genClass.getTestCaseClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_190);
    return stringBuffer.toString();
  }
}
