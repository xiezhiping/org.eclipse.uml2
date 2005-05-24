package org.eclipse.uml2.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class Interface
{
  protected static String nl;
  public static synchronized Interface create(String lineSeparator)
  {
    nl = lineSeparator;
    Interface result = new Interface();
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
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_8 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_9 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_10 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_11 = NL + " *";
  protected final String TEXT_12 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_13 = NL + " *   <li>{@link ";
  protected final String TEXT_14 = "#";
  protected final String TEXT_15 = " <em>";
  protected final String TEXT_16 = "</em>}</li>";
  protected final String TEXT_17 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_18 = NL + " *" + NL + " * @see ";
  protected final String TEXT_19 = "#get";
  protected final String TEXT_20 = "()";
  protected final String TEXT_21 = NL + " * @model ";
  protected final String TEXT_22 = NL + " *        ";
  protected final String TEXT_23 = NL + " * @model";
  protected final String TEXT_24 = NL + " * @extends ";
  protected final String TEXT_25 = NL + " * @generated" + NL + " */" + NL + "public interface ";
  protected final String TEXT_26 = NL + "{";
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_28 = " copyright = \"";
  protected final String TEXT_29 = "\";";
  protected final String TEXT_30 = NL;
  protected final String TEXT_31 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_32 = "</b></em>' ";
  protected final String TEXT_33 = ".";
  protected final String TEXT_34 = NL + "\t * The key is of type ";
  protected final String TEXT_35 = "list of {@link ";
  protected final String TEXT_36 = "}";
  protected final String TEXT_37 = "{@link ";
  protected final String TEXT_38 = "}";
  protected final String TEXT_39 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_40 = "list of {@link ";
  protected final String TEXT_41 = "}";
  protected final String TEXT_42 = "{@link ";
  protected final String TEXT_43 = "}";
  protected final String TEXT_44 = ",";
  protected final String TEXT_45 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_46 = "}.";
  protected final String TEXT_47 = NL + "\t * The default value is <code>";
  protected final String TEXT_48 = "</code>.";
  protected final String TEXT_49 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_50 = "}.";
  protected final String TEXT_51 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_52 = "#";
  protected final String TEXT_53 = " <em>";
  protected final String TEXT_54 = "</em>}'.";
  protected final String TEXT_55 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_56 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_57 = "</em>' ";
  protected final String TEXT_58 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_59 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_60 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_61 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_62 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_63 = "</em>' ";
  protected final String TEXT_64 = ".";
  protected final String TEXT_65 = NL + "\t * @see ";
  protected final String TEXT_66 = NL + "\t * @see #isSet";
  protected final String TEXT_67 = "()";
  protected final String TEXT_68 = NL + "\t * @see #unset";
  protected final String TEXT_69 = "()";
  protected final String TEXT_70 = NL + "\t * @see #set";
  protected final String TEXT_71 = "(";
  protected final String TEXT_72 = ")";
  protected final String TEXT_73 = NL + "\t * @see ";
  protected final String TEXT_74 = "#get";
  protected final String TEXT_75 = "()";
  protected final String TEXT_76 = NL + "\t * @see ";
  protected final String TEXT_77 = "#";
  protected final String TEXT_78 = NL + "\t * @model ";
  protected final String TEXT_79 = NL + "\t *        ";
  protected final String TEXT_80 = NL + "\t * @model";
  protected final String TEXT_81 = NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_82 = " ";
  protected final String TEXT_83 = "();" + NL;
  protected final String TEXT_84 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_85 = "#";
  protected final String TEXT_86 = " <em>";
  protected final String TEXT_87 = "</em>}' ";
  protected final String TEXT_88 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_89 = "</em>' ";
  protected final String TEXT_90 = ".";
  protected final String TEXT_91 = NL + "\t * @see ";
  protected final String TEXT_92 = NL + "\t * @see #isSet";
  protected final String TEXT_93 = "()";
  protected final String TEXT_94 = NL + "\t * @see #unset";
  protected final String TEXT_95 = "()";
  protected final String TEXT_96 = NL + "\t * @see #";
  protected final String TEXT_97 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_98 = "(";
  protected final String TEXT_99 = " value);" + NL;
  protected final String TEXT_100 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_101 = "#";
  protected final String TEXT_102 = " <em>";
  protected final String TEXT_103 = "</em>}' ";
  protected final String TEXT_104 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_105 = NL + "\t * @see #isSet";
  protected final String TEXT_106 = "()";
  protected final String TEXT_107 = NL + "\t * @see #";
  protected final String TEXT_108 = "()";
  protected final String TEXT_109 = NL + "\t * @see #set";
  protected final String TEXT_110 = "(";
  protected final String TEXT_111 = ")";
  protected final String TEXT_112 = NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid unset";
  protected final String TEXT_113 = "();" + NL;
  protected final String TEXT_114 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_115 = "#";
  protected final String TEXT_116 = " <em>";
  protected final String TEXT_117 = "</em>}' ";
  protected final String TEXT_118 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_119 = "</em>' ";
  protected final String TEXT_120 = " is set.";
  protected final String TEXT_121 = NL + "\t * @see #unset";
  protected final String TEXT_122 = "()";
  protected final String TEXT_123 = NL + "\t * @see #";
  protected final String TEXT_124 = "()";
  protected final String TEXT_125 = NL + "\t * @see #set";
  protected final String TEXT_126 = "(";
  protected final String TEXT_127 = ")";
  protected final String TEXT_128 = NL + "\t * @generated" + NL + "\t */" + NL + "\tboolean isSet";
  protected final String TEXT_129 = "();" + NL;
  protected final String TEXT_130 = NL;
  protected final String TEXT_131 = NL + "    /**";
  protected final String TEXT_132 = NL + "     * Creates a {@link ";
  protected final String TEXT_133 = "} and appends it to the '<em><b>";
  protected final String TEXT_134 = "</b></em>' ";
  protected final String TEXT_135 = ".";
  protected final String TEXT_136 = NL + "     * Creates a {@link ";
  protected final String TEXT_137 = "} and sets the '<em><b>";
  protected final String TEXT_138 = "</b></em>' ";
  protected final String TEXT_139 = ".";
  protected final String TEXT_140 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_141 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_142 = "}." + NL + "\t * @see #";
  protected final String TEXT_143 = "()" + NL + "\t * @generated" + NL + "     */";
  protected final String TEXT_144 = NL + "    ";
  protected final String TEXT_145 = " create";
  protected final String TEXT_146 = "(";
  protected final String TEXT_147 = " eClass);" + NL;
  protected final String TEXT_148 = NL + "    /**";
  protected final String TEXT_149 = NL + "     * Creates a {@link ";
  protected final String TEXT_150 = "} and appends it to the '<em><b>";
  protected final String TEXT_151 = "</b></em>' ";
  protected final String TEXT_152 = ".";
  protected final String TEXT_153 = NL + "     * Creates a {@link ";
  protected final String TEXT_154 = "} and sets the '<em><b>";
  protected final String TEXT_155 = "</b></em>' ";
  protected final String TEXT_156 = ".";
  protected final String TEXT_157 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The new {@link ";
  protected final String TEXT_158 = "}." + NL + "\t * @see #";
  protected final String TEXT_159 = "()" + NL + "\t * @generated" + NL + "     */";
  protected final String TEXT_160 = NL + "    ";
  protected final String TEXT_161 = " create";
  protected final String TEXT_162 = "();" + NL;
  protected final String TEXT_163 = NL + "    /**" + NL + "     * Retrieves the {@link ";
  protected final String TEXT_164 = "} with the specified '<em><b>";
  protected final String TEXT_165 = "</b></em>' from the '<em><b>";
  protected final String TEXT_166 = "</b></em>' ";
  protected final String TEXT_167 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_168 = " The '<em><b>";
  protected final String TEXT_169 = "</b></em>' of the {@link ";
  protected final String TEXT_170 = "} to retrieve." + NL + "\t * @return The {@link ";
  protected final String TEXT_171 = "} with the specified '<em><b>";
  protected final String TEXT_172 = "</b></em>', or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_173 = "()" + NL + "\t * @generated" + NL + "     */";
  protected final String TEXT_174 = NL + "    ";
  protected final String TEXT_175 = " get";
  protected final String TEXT_176 = "(";
  protected final String TEXT_177 = " ";
  protected final String TEXT_178 = ");" + NL + "      ";
  protected final String TEXT_179 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_180 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_181 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_182 = NL + "\t * @model ";
  protected final String TEXT_183 = NL + "\t *        ";
  protected final String TEXT_184 = NL + "\t * @model";
  protected final String TEXT_185 = NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_186 = " ";
  protected final String TEXT_187 = "(";
  protected final String TEXT_188 = ")";
  protected final String TEXT_189 = ";" + NL;
  protected final String TEXT_190 = NL + "} // ";
  protected final String TEXT_191 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
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
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_6);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_8);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_12);
    for (Iterator i=genClass.getGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_16);
    }
    }
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_20);
    {boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_21);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_23);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getInterfaceExtends());
    stringBuffer.append(TEXT_26);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_30);
    }
    for (Iterator i=genClass.getDeclaredGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_33);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_34);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_36);
    } else {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_41);
    } else {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_46);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_48);
    }
    if (genFeature.getGenEnumType() != null) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getGenEnumType().getQualifiedName());
    stringBuffer.append(TEXT_50);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_54);
    }
    }
    stringBuffer.append(TEXT_55);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_59);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_64);
    if (genFeature.getGenEnumType() != null) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGenEnumType().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_67);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_69);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_72);
    }
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_75);
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_76);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    {boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_78);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_79);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_80);
    }}
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_83);
    //Interface/getGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_90);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getGenEnumType().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_95);
    }
    }
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_99);
    //Interface/setGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_104);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_106);
    }
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_108);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_111);
    }
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_113);
    //Interface/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_120);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_124);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_127);
    }
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_129);
    //Interface/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_130);
    if (UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains() && !genFeature.isSuppressedSetVisibility()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getGenClassType().isAbstract()) {
    stringBuffer.append(TEXT_131);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_135);
    } else {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_139);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_147);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getGenClassType().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_148);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_156);
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(TEXT_160);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_162);
    }
    }
    }
    if (genFeature.isListType() && genFeature.isReferenceType() && !genFeature.isSuppressedSetVisibility()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getGenClassType()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(TEXT_174);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_178);
    }
    }
    //Interface/declaredGenFeature.override.javajetinc
    }//for
    for (Iterator i=genClass.getDeclaredGenOperations().iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_179);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_181);
    }
    {boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_182);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_183);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_184);
    }}
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genOperation.getImportedReturnType());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_189);
    //Interface/declaredGenOperation.override.javajetinc
    }//for
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genClass.getInterfaceName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_191);
    return stringBuffer.toString();
  }
}
