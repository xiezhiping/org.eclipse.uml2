package org.eclipse.uml2.codegen.ecore.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class ResourceInterface
{
  protected static String nl;
  public static synchronized ResourceInterface create(String lineSeparator)
  {
    nl = lineSeparator;
    ResourceInterface result = new ResourceInterface();
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
  protected final String TEXT_9 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The resource associated with the '<em><b>";
  protected final String TEXT_10 = "</b></em>' package." + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public interface ";
  protected final String TEXT_11 = " extends ";
  protected final String TEXT_12 = NL + "{";
  protected final String TEXT_13 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_14 = " copyright = ";
  protected final String TEXT_15 = ";";
  protected final String TEXT_16 = NL;
  protected final String TEXT_17 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * The factory for '<em><b>";
  protected final String TEXT_18 = "</b></em>' resources." + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic interface Factory" + NL + "\t\t\textends ";
  protected final String TEXT_19 = " {" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic static final Factory INSTANCE = new ";
  protected final String TEXT_20 = "();" + NL + "" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * The file extension for '<em><b>";
  protected final String TEXT_21 = "</b></em>' resources." + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final String FILE_EXTENSION = \"";
  protected final String TEXT_22 = "\";";
  protected final String TEXT_23 = NL;
  protected final String TEXT_24 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * The default encoding for '<em><b>";
  protected final String TEXT_25 = "</b></em>' resources." + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final String DEFAULT_ENCODING = \"UTF-8\";";
  protected final String TEXT_26 = NL;
  protected final String TEXT_27 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2005, 2008 IBM Corporation and others.
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

    GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel();
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
    stringBuffer.append(genPackage.getUtilitiesPackageName());
    stringBuffer.append(TEXT_8);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(UML2GenModelUtil.getResourceInterfaceName(genPackage));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(UML2GenModelUtil.getImportedResourceBaseInterfaceName(genPackage));
    stringBuffer.append(TEXT_12);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(UML2GenModelUtil.getImportedResourceFactoryBaseInterfaceName(genPackage));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genPackage.getImportedResourceFactoryClassName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genPackage.getPrefix().toLowerCase());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_23);
    if (UML2GenModelUtil.isXMLResource(genPackage)) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    stringBuffer.append(UML2GenModelUtil.getResourceInterfaceName(genPackage));
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
