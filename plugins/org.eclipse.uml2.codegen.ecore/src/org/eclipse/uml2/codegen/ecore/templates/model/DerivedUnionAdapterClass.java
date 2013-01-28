package org.eclipse.uml2.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class DerivedUnionAdapterClass
{
  protected static String nl;
  public static synchronized DerivedUnionAdapterClass create(String lineSeparator)
  {
    nl = lineSeparator;
    DerivedUnionAdapterClass result = new DerivedUnionAdapterClass();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An adapter that propagates notifications for derived unions." + NL + " * <!-- end-user-doc -->" + NL + " * @see ";
  protected final String TEXT_7 = NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_8 = " extends ";
  protected final String TEXT_9 = NL + "{";
  protected final String TEXT_10 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_11 = " copyright = ";
  protected final String TEXT_12 = ";";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "\t/**" + NL + "\t * The cached model package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_15 = " modelPackage;" + NL + "" + NL + "\t/**" + NL + "\t * Creates an instance of the adapter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_16 = "()" + NL + "\t{" + NL + "\t\tif (modelPackage == null)" + NL + "\t\t{" + NL + "\t\t\tmodelPackage = ";
  protected final String TEXT_17 = ".eINSTANCE;" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Calls <code>notifyChanged</code> with the appropriate model class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param notification a description of the change." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void notifyChanged(";
  protected final String TEXT_18 = " notification)" + NL + "\t{" + NL + "\t\tObject notifier = notification.getNotifier();" + NL + "\t\tif (notifier instanceof ";
  protected final String TEXT_19 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_20 = " eClass = ((";
  protected final String TEXT_21 = ")notifier).eClass();" + NL + "\t\t\tif (eClass.eContainer() == modelPackage)" + NL + "\t\t\t{" + NL + "\t\t\t\tnotifyChanged(notification, eClass);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Calls <code>notifyXXXChanged</code> for the corresponding class of the model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param notification a description of the change." + NL + "\t * @param eClass the Ecore class of the notifier." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void notifyChanged(";
  protected final String TEXT_22 = " notification, ";
  protected final String TEXT_23 = " eClass)" + NL + "\t{" + NL + "\t\tswitch (eClass.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_24 = NL + "\t\t\tcase ";
  protected final String TEXT_25 = ".";
  protected final String TEXT_26 = ":" + NL + "\t\t\t\tnotify";
  protected final String TEXT_27 = "Changed(notification, eClass);" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_28 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Does nothing; clients may override so that it does something." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param notification a description of the change." + NL + "\t * @param eClass the Ecore class of the notifier." + NL + "\t * @param derivedUnion the derived union affected by the change." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void notifyChanged(";
  protected final String TEXT_29 = " notification, ";
  protected final String TEXT_30 = " eClass, ";
  protected final String TEXT_31 = " derivedUnion)" + NL + "\t{" + NL + "\t\t// Do nothing." + NL + "\t}" + NL;
  protected final String TEXT_32 = NL + "\t/**" + NL + "\t * Calls <code>notifyChanged</code> for each affected derived union." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param notification a description of the change." + NL + "\t * @param eClass the Ecore class of the notifier." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void notify";
  protected final String TEXT_33 = "Changed(";
  protected final String TEXT_34 = " notification, ";
  protected final String TEXT_35 = " eClass)" + NL + "\t{" + NL + "\t\tswitch (notification.getFeatureID(";
  protected final String TEXT_36 = ".class))" + NL + "\t\t{";
  protected final String TEXT_37 = NL + "\t\t\tcase ";
  protected final String TEXT_38 = ":";
  protected final String TEXT_39 = NL + "\t\t\t\tnotifyChanged(notification, eClass, ";
  protected final String TEXT_40 = ");";
  protected final String TEXT_41 = NL + "\t\t\t\tbreak;";
  protected final String TEXT_42 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_43 = NL + "} //";
  protected final String TEXT_44 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2013 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 * </copyright>
 */

    GenPackage genPackage = (GenPackage)argument; GenModel genModel = genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    }}
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genPackage.getUtilitiesPackageName());
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(UML2GenModelUtil.getDerivedUnionAdapterClassName(genPackage));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.impl.AdapterImpl"));
    stringBuffer.append(TEXT_9);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(UML2GenModelUtil.getDerivedUnionAdapterClassName(genPackage));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_23);
    for (GenClass genClass : UML2GenModelUtil.getDerivedUnionAdapterGenClasses(genPackage)) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genPackage.getClassifierID(genClass));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_31);
    for (GenClass genClass : UML2GenModelUtil.getDerivedUnionAdapterGenClasses(genPackage)) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_36);
    for (GenFeature genFeature : genClass.getAllGenFeatures()) { List<GenFeature> allSubsettedUnionGenFeatures = UML2GenModelUtil.getAllSubsettedUnionGenFeatures(genFeature); if (!allSubsettedUnionGenFeatures.isEmpty()) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_38);
    for (GenFeature subsettedUnionGenFeature : allSubsettedUnionGenFeatures) {
    stringBuffer.append(TEXT_39);
    stringBuffer.append(subsettedUnionGenFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    }}
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(UML2GenModelUtil.getDerivedUnionAdapterClassName(genPackage));
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_44);
    return stringBuffer.toString();
  }
}
