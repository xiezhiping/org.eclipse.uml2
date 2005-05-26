package org.eclipse.uml2.codegen.ecore.templates.edit;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class ItemProvider
{
  protected static String nl;
  public static synchronized ItemProvider create(String lineSeparator)
  {
    nl = lineSeparator;
    ItemProvider result = new ItemProvider();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_4 = "Id";
  protected final String TEXT_5 = NL + " */" + NL + "package ";
  protected final String TEXT_6 = ";" + NL + NL;
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * This is the item provider adapter for a {@link ";
  protected final String TEXT_8 = "} object." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = NL + "\textends ";
  protected final String TEXT_10 = NL + "\timplements";
  protected final String TEXT_11 = "\t" + NL + "\t\t";
  protected final String TEXT_12 = ",";
  protected final String TEXT_13 = "\t\t" + NL + "{";
  protected final String TEXT_14 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_15 = " copyright = \"";
  protected final String TEXT_16 = "\";";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL + "\t/**" + NL + "\t * This constructs an instance from a factory and a notifier." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_19 = "(AdapterFactory adapterFactory)" + NL + "\t{" + NL + "\t\tsuper(adapterFactory);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This returns the property descriptors for the adapted class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic List getPropertyDescriptors(Object object)" + NL + "\t{" + NL + "\t\tif (itemPropertyDescriptors == null)" + NL + "\t\t{" + NL + "\t\t\tsuper.getPropertyDescriptors(object);" + NL;
  protected final String TEXT_20 = NL + "\t\t\tadd";
  protected final String TEXT_21 = "PropertyDescriptor(object);";
  protected final String TEXT_22 = NL + "\t\t}" + NL + "\t\treturn itemPropertyDescriptors;" + NL + "\t}" + NL;
  protected final String TEXT_23 = NL + "\t/**" + NL + "\t * This adds a property descriptor for the ";
  protected final String TEXT_24 = " feature." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void add";
  protected final String TEXT_25 = "PropertyDescriptor(Object object)" + NL + "\t{" + NL + "\t\titemPropertyDescriptors.add" + NL + "\t\t\t(createItemPropertyDescriptor" + NL + "\t\t\t\t(((";
  protected final String TEXT_26 = ")adapterFactory).getRootAdapterFactory()," + NL + "\t\t\t\t getResourceLocator()," + NL + "\t\t\t\t getString(\"_UI_";
  protected final String TEXT_27 = "_";
  protected final String TEXT_28 = "_feature\"),";
  protected final String TEXT_29 = NL + "\t\t\t\t getString(\"_UI_PropertyDescriptor_description\", \"_UI_";
  protected final String TEXT_30 = "_";
  protected final String TEXT_31 = "_feature\", \"_UI_";
  protected final String TEXT_32 = "_type\"),";
  protected final String TEXT_33 = NL + "\t\t\t\t getString(\"_UI_";
  protected final String TEXT_34 = "_";
  protected final String TEXT_35 = "_description\"),";
  protected final String TEXT_36 = NL + "\t\t\t\t ";
  protected final String TEXT_37 = ".eINSTANCE.get";
  protected final String TEXT_38 = "()," + NL + "\t\t\t\t ";
  protected final String TEXT_39 = ",";
  protected final String TEXT_40 = NL + "\t\t\t\t null,";
  protected final String TEXT_41 = NL + "\t\t\t\t ";
  protected final String TEXT_42 = ".";
  protected final String TEXT_43 = ",";
  protected final String TEXT_44 = NL + "\t\t\t\t null,";
  protected final String TEXT_45 = NL + "\t\t\t\t getString(\"";
  protected final String TEXT_46 = "\"),";
  protected final String TEXT_47 = NL + "\t\t\t\t null));";
  protected final String TEXT_48 = NL + "\t\t\t\t new String[] {";
  protected final String TEXT_49 = NL + "\t\t\t\t\t\"";
  protected final String TEXT_50 = "\"";
  protected final String TEXT_51 = ",";
  protected final String TEXT_52 = NL + "\t\t\t\t }));";
  protected final String TEXT_53 = NL + "\t}" + NL;
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an" + NL + "\t * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or" + NL + "\t * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_55 = " getChildrenFeatures(Object object)" + NL + "\t{" + NL + "\t\tif (childrenFeatures == null)" + NL + "\t\t{" + NL + "\t\t\tsuper.getChildrenFeatures(object);";
  protected final String TEXT_56 = NL + "\t\t\tchildrenFeatures.add(";
  protected final String TEXT_57 = ".eINSTANCE.get";
  protected final String TEXT_58 = "());";
  protected final String TEXT_59 = NL + "\t\t}" + NL + "\t\treturn childrenFeatures;" + NL + "\t}" + NL;
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_61 = " getChildFeature(Object object, Object child)" + NL + "\t{" + NL + "\t\t// Check the type of the specified child object and return the proper feature to use for" + NL + "\t\t// adding (see {@link AddCommand}) it as a child." + NL + "" + NL + "\t\treturn super.getChildFeature(object, child);" + NL + "\t}" + NL;
  protected final String TEXT_62 = NL + "\t/**" + NL + "\t * This returns ";
  protected final String TEXT_63 = ".gif." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getImage(Object object)" + NL + "\t{" + NL + "\t\treturn getResourceLocator().getImage(\"full/obj16/";
  protected final String TEXT_64 = "\");";
  protected final String TEXT_65 = NL + "\t}" + NL;
  protected final String TEXT_66 = NL + "\t/**" + NL + "\t * This returns the label text for the adapted class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String getText(Object object)" + NL + "\t{";
  protected final String TEXT_67 = NL + "\t\t";
  protected final String TEXT_68 = " ";
  protected final String TEXT_69 = " = (";
  protected final String TEXT_70 = ")object;" + NL + "\t\treturn \"\" + ";
  protected final String TEXT_71 = ".getKey() + \" -> \" + ";
  protected final String TEXT_72 = ".getValue();";
  protected final String TEXT_73 = NL + "\t\t";
  protected final String TEXT_74 = " ";
  protected final String TEXT_75 = " = (";
  protected final String TEXT_76 = ")object;" + NL + "\t\treturn getString(\"_UI_";
  protected final String TEXT_77 = "_type\") + \" \" + ";
  protected final String TEXT_78 = ".";
  protected final String TEXT_79 = "();";
  protected final String TEXT_80 = NL + "\t\tString label = ((";
  protected final String TEXT_81 = ")object).";
  protected final String TEXT_82 = "();";
  protected final String TEXT_83 = NL + "\t\t";
  protected final String TEXT_84 = " labelValue = ((";
  protected final String TEXT_85 = ")object).";
  protected final String TEXT_86 = "();" + NL + "\t\tString label = labelValue == null ? null : labelValue.toString();";
  protected final String TEXT_87 = NL + "\t\treturn label == null || label.length() == 0 ?" + NL + "\t\t\tgetString(\"_UI_";
  protected final String TEXT_88 = "_type\") :";
  protected final String TEXT_89 = NL + "\t\t\tgetString(\"_UI_";
  protected final String TEXT_90 = "_type\") + \" \" + label;";
  protected final String TEXT_91 = NL + "\t\treturn getString(\"_UI_";
  protected final String TEXT_92 = "_type\");";
  protected final String TEXT_93 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This handles model notifications by calling {@link #updateChildren} to update any cached" + NL + "\t * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void notifyChanged(Notification notification)" + NL + "\t{" + NL + "\t\tupdateChildren(notification);";
  protected final String TEXT_94 = NL + NL + "\t\tswitch (notification.getFeatureID(";
  protected final String TEXT_95 = ".class))" + NL + "\t\t{";
  protected final String TEXT_96 = NL + "\t\t\tcase ";
  protected final String TEXT_97 = ":";
  protected final String TEXT_98 = NL + "\t\t\t\tfireNotifyChanged(new ";
  protected final String TEXT_99 = "(notification, notification.getNotifier(), false, true));" + NL + "\t\t\t\treturn;";
  protected final String TEXT_100 = NL + "\t\t\tcase ";
  protected final String TEXT_101 = ":";
  protected final String TEXT_102 = NL + "\t\t\t\tfireNotifyChanged(new ";
  protected final String TEXT_103 = "(notification, notification.getNotifier(), true, false));" + NL + "\t\t\t\treturn;";
  protected final String TEXT_104 = NL + "\t\t\tcase ";
  protected final String TEXT_105 = ":";
  protected final String TEXT_106 = NL + "\t\t\t\tfireNotifyChanged(new ";
  protected final String TEXT_107 = "(notification, notification.getNotifier(), true, true));" + NL + "\t\t\t\treturn;";
  protected final String TEXT_108 = NL + "\t\t}";
  protected final String TEXT_109 = NL + "\t\tsuper.notifyChanged(notification);" + NL + "\t}" + NL;
  protected final String TEXT_110 = NL + "\t/**" + NL + "\t * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s" + NL + "\t * describing all of the children that can be created under this object." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void collectNewChildDescriptors(";
  protected final String TEXT_111 = " newChildDescriptors, Object object)" + NL + "\t{" + NL + "\t\tsuper.collectNewChildDescriptors(newChildDescriptors, object);";
  protected final String TEXT_112 = NL + NL + "\t\tnewChildDescriptors.add" + NL + "\t\t\t(createChildParameter" + NL + "\t\t\t\t(";
  protected final String TEXT_113 = ".eINSTANCE.get";
  protected final String TEXT_114 = "(),";
  protected final String TEXT_115 = NL + "\t\t\t\t ";
  protected final String TEXT_116 = ".eINSTANCE.create(";
  protected final String TEXT_117 = ".eINSTANCE.get";
  protected final String TEXT_118 = "())));";
  protected final String TEXT_119 = NL + "\t\t\t\t ";
  protected final String TEXT_120 = ".eINSTANCE.create";
  protected final String TEXT_121 = "()));";
  protected final String TEXT_122 = NL + NL + "\t\tnewChildDescriptors.add" + NL + "\t\t\t(createChildParameter" + NL + "\t\t\t\t(";
  protected final String TEXT_123 = ".eINSTANCE.get";
  protected final String TEXT_124 = "()," + NL + "\t\t\t\t ";
  protected final String TEXT_125 = ".createEntry" + NL + "\t\t\t\t\t(";
  protected final String TEXT_126 = ".eINSTANCE.get";
  protected final String TEXT_127 = "(),";
  protected final String TEXT_128 = NL + "\t\t\t\t\t ";
  protected final String TEXT_129 = ".eINSTANCE.create(";
  protected final String TEXT_130 = ".eINSTANCE.get";
  protected final String TEXT_131 = "()))));";
  protected final String TEXT_132 = NL + "\t\t\t\t\t ";
  protected final String TEXT_133 = ".eINSTANCE.create";
  protected final String TEXT_134 = "())));";
  protected final String TEXT_135 = NL + NL + "\t\tnewChildDescriptors.add" + NL + "\t\t\t(createChildParameter" + NL + "\t\t\t\t(";
  protected final String TEXT_136 = ".eINSTANCE.get";
  protected final String TEXT_137 = "()," + NL + "\t\t\t\t ";
  protected final String TEXT_138 = ".createEntry" + NL + "\t\t\t\t\t(";
  protected final String TEXT_139 = ".eINSTANCE.get";
  protected final String TEXT_140 = "(),";
  protected final String TEXT_141 = NL + "\t\t\t\t\t ";
  protected final String TEXT_142 = ")));";
  protected final String TEXT_143 = NL + "\t\t\t\t\t ";
  protected final String TEXT_144 = ")));";
  protected final String TEXT_145 = NL + "\t\t\t\t\t ";
  protected final String TEXT_146 = ".eINSTANCE.createFromString(";
  protected final String TEXT_147 = ".eINSTANCE.get";
  protected final String TEXT_148 = "(), ";
  protected final String TEXT_149 = "))));";
  protected final String TEXT_150 = " // TODO: ensure this is a valid literal value";
  protected final String TEXT_151 = NL + NL + "\t\tnewChildDescriptors.add" + NL + "\t\t\t(createChildParameter" + NL + "\t\t\t\t(";
  protected final String TEXT_152 = ".eINSTANCE.get";
  protected final String TEXT_153 = "(),";
  protected final String TEXT_154 = NL + "\t\t\t\t ";
  protected final String TEXT_155 = ".eINSTANCE.create(";
  protected final String TEXT_156 = ".eINSTANCE.get";
  protected final String TEXT_157 = "())));";
  protected final String TEXT_158 = NL + "\t\t\t\t ";
  protected final String TEXT_159 = ".eINSTANCE.create";
  protected final String TEXT_160 = "()));";
  protected final String TEXT_161 = NL + NL + "\t\tnewChildDescriptors.add" + NL + "\t\t\t(createChildParameter" + NL + "\t\t\t\t(";
  protected final String TEXT_162 = ".eINSTANCE.get";
  protected final String TEXT_163 = "(),";
  protected final String TEXT_164 = NL + "\t\t\t\t ";
  protected final String TEXT_165 = "));";
  protected final String TEXT_166 = NL + "\t\t\t\t ";
  protected final String TEXT_167 = "));";
  protected final String TEXT_168 = NL + "\t\t\t\t ";
  protected final String TEXT_169 = ".eINSTANCE.createFromString(";
  protected final String TEXT_170 = ".eINSTANCE.get";
  protected final String TEXT_171 = "(), ";
  protected final String TEXT_172 = ")));";
  protected final String TEXT_173 = " // TODO: ensure this is a valid literal value";
  protected final String TEXT_174 = NL + "\t}" + NL;
  protected final String TEXT_175 = NL + "\t/**" + NL + "\t * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String getCreateChildText(Object owner, Object feature, Object child, ";
  protected final String TEXT_176 = " selection)" + NL + "\t{" + NL + "\t\tObject childFeature = feature;" + NL + "\t\tObject childObject = child;" + NL;
  protected final String TEXT_177 = NL + "\t\tif (childFeature instanceof ";
  protected final String TEXT_178 = " && ";
  protected final String TEXT_179 = ".isFeatureMap((EStructuralFeature)childFeature))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_180 = ".Entry entry = (FeatureMap.Entry)childObject;" + NL + "\t\t\tchildFeature = entry.getEStructuralFeature();" + NL + "\t\t\tchildObject = entry.getValue();" + NL + "\t\t}" + NL;
  protected final String TEXT_181 = NL + "\t\tboolean qualify =";
  protected final String TEXT_182 = NL + "\t\t\tchildFeature == ";
  protected final String TEXT_183 = ".eINSTANCE.get";
  protected final String TEXT_184 = "()";
  protected final String TEXT_185 = NL + NL + "\t\tif (qualify)" + NL + "\t\t{" + NL + "\t\t\treturn getString" + NL + "\t\t\t\t(\"_UI_CreateChild_text2\",";
  protected final String TEXT_186 = NL + "\t\t\t\t new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });" + NL + "\t\t}" + NL + "\t\treturn super.getCreateChildText(owner, feature, child, selection);" + NL + "\t}" + NL;
  protected final String TEXT_187 = NL + "\t/**" + NL + "\t * This returns the icon image for {@link org.eclipse.emf.edit.command.CreateChildCommand}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getCreateChildImage(Object owner, Object feature, Object child, Collection selection)" + NL + "\t{" + NL + "\t\tif (feature instanceof ";
  protected final String TEXT_188 = " && ";
  protected final String TEXT_189 = ".isFeatureMap((";
  protected final String TEXT_190 = ")feature))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_191 = ".Entry entry = (";
  protected final String TEXT_192 = ".Entry)child;" + NL + "\t\t\tfeature = entry.getEStructuralFeature();" + NL + "\t\t\tchild = entry.getValue();        " + NL + "\t\t}" + NL + "" + NL + "\t\tif (feature instanceof ";
  protected final String TEXT_193 = " && child instanceof ";
  protected final String TEXT_194 = ")" + NL + "\t\t{" + NL + "\t\t\tString name = \"full/obj16/\" + ((EObject)child).eClass().getName();";
  protected final String TEXT_195 = NL + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\treturn getResourceLocator().getImage(name);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_196 = ".INSTANCE.log(e);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\treturn super.getCreateChildImage(owner, feature, child, selection);" + NL + "\t}" + NL;
  protected final String TEXT_197 = NL + "\t/**" + NL + "\t * Return the resource locator for this item provider's resources." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ResourceLocator getResourceLocator()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_198 = ".INSTANCE;" + NL + "\t}" + NL;
  protected final String TEXT_199 = NL;
  protected final String TEXT_200 = NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_201 = " createAddCommand(";
  protected final String TEXT_202 = " domain, ";
  protected final String TEXT_203 = " owner, ";
  protected final String TEXT_204 = " feature, ";
  protected final String TEXT_205 = " collection, int index) {";
  protected final String TEXT_206 = NL + "\t\tif (feature == ";
  protected final String TEXT_207 = "()) {" + NL + "\t\t\treturn new ";
  protected final String TEXT_208 = "(domain, owner, feature, ";
  protected final String TEXT_209 = ", collection, index);" + NL + "\t\t}";
  protected final String TEXT_210 = NL + "\t\treturn super.createAddCommand(domain, owner, feature, collection, index);" + NL + "\t}" + NL;
  protected final String TEXT_211 = NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_212 = " createRemoveCommand(";
  protected final String TEXT_213 = " domain, ";
  protected final String TEXT_214 = " owner, ";
  protected final String TEXT_215 = " feature, ";
  protected final String TEXT_216 = " collection) {";
  protected final String TEXT_217 = NL + "\t\tif (feature == ";
  protected final String TEXT_218 = "()) {" + NL + "\t\t\treturn new ";
  protected final String TEXT_219 = "(domain, owner, feature, ";
  protected final String TEXT_220 = ", collection);" + NL + "\t\t}";
  protected final String TEXT_221 = NL + "\t\treturn super.createRemoveCommand(domain, owner, feature, collection);" + NL + "\t}" + NL;
  protected final String TEXT_222 = NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createReplaceCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject, java.util.Collection)" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_223 = " createReplaceCommand(";
  protected final String TEXT_224 = " domain, ";
  protected final String TEXT_225 = " owner, ";
  protected final String TEXT_226 = " feature, ";
  protected final String TEXT_227 = " value, ";
  protected final String TEXT_228 = " collection) {";
  protected final String TEXT_229 = NL + "\t\tif (feature == ";
  protected final String TEXT_230 = "()) {" + NL + "\t\t\treturn new ";
  protected final String TEXT_231 = "(domain, owner, feature, ";
  protected final String TEXT_232 = ", value, collection);" + NL + "\t\t}";
  protected final String TEXT_233 = NL + "\t\tif (feature == ";
  protected final String TEXT_234 = "()) {" + NL + "\t\t\treturn new ";
  protected final String TEXT_235 = "(domain, owner, feature, ";
  protected final String TEXT_236 = ", value, collection);" + NL + "\t\t}";
  protected final String TEXT_237 = NL + "\t\treturn super.createReplaceCommand(domain, owner, feature, value, collection);" + NL + "\t}" + NL;
  protected final String TEXT_238 = NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_239 = " createSetCommand(";
  protected final String TEXT_240 = " domain, ";
  protected final String TEXT_241 = " owner, ";
  protected final String TEXT_242 = " feature, Object value) {";
  protected final String TEXT_243 = NL + "\t\tif (feature == ";
  protected final String TEXT_244 = "()) {" + NL + "\t\t\treturn new ";
  protected final String TEXT_245 = "(domain, owner, feature, ";
  protected final String TEXT_246 = ", value);" + NL + "\t\t}";
  protected final String TEXT_247 = NL + "\t\tif (feature == ";
  protected final String TEXT_248 = "()) {" + NL + "\t\t\treturn new ";
  protected final String TEXT_249 = "(domain, owner, feature, ";
  protected final String TEXT_250 = ", value);" + NL + "\t\t}";
  protected final String TEXT_251 = NL + "\t\treturn super.createSetCommand(domain, owner, feature, value);" + NL + "\t}" + NL;
  protected final String TEXT_252 = NL + "}";
  protected final String TEXT_253 = NL;

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
    stringBuffer.append(genPackage.getProviderPackageName());
    stringBuffer.append(TEXT_6);
    genModel.addImport("org.eclipse.emf.common.notify.AdapterFactory");
    genModel.addImport("org.eclipse.emf.common.notify.Notification");
    genModel.addImport("org.eclipse.emf.common.util.ResourceLocator");
    genModel.addImport("org.eclipse.emf.edit.provider.IEditingDomainItemProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.IItemLabelProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.IItemPropertySource");
    genModel.addImport("org.eclipse.emf.edit.provider.IStructuredItemContentProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.ITreeItemContentProvider");
    genModel.addImport("java.util.List");
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass.getProviderBaseClassName() != null ? genClass.getProviderBaseClassName() : genModel.getImportedName("org.eclipse.emf.edit.provider.ItemProviderAdapter"));
    stringBuffer.append(TEXT_10);
    for (Iterator i = genPackage.getProviderSupportedTypes().iterator(); i.hasNext(); ) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getImportedName((String)i.next()));
    if (i.hasNext()){
    stringBuffer.append(TEXT_12);
    }
    }
    stringBuffer.append(TEXT_13);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_19);
    for (Iterator i=genClass.getPropertyFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    for (Iterator i=genClass.getPropertyFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.ComposeableAdapterFactory"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genFeature.getGenClass().getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genModel.getNonNLS());
    if (genFeature.getPropertyDescription() == null || genFeature.getPropertyDescription().length() == 0) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getGenClass().getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getGenClass().getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genFeature.getGenClass().getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getProperty() == GenPropertyKind.EDITABLE_LITERAL ? "true" : "false");
    stringBuffer.append(TEXT_39);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_40);
    } else {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.ItemPropertyDescriptor"));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getPropertyImageName());
    stringBuffer.append(TEXT_43);
    }
    if (genFeature.getPropertyCategory() == null || genFeature.getPropertyCategory().length() == 0) {
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genModel.getPropertyCategoryKey(genFeature.getPropertyCategory()));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.getPropertyFilterFlags().isEmpty()) {
    stringBuffer.append(TEXT_47);
    } else {
    stringBuffer.append(TEXT_48);
    for (Iterator j = genFeature.getPropertyFilterFlags().iterator(); j.hasNext();) { String filterFlag = (String)j.next();
    if (filterFlag != null && filterFlag.length() > 0) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(filterFlag);
    stringBuffer.append(TEXT_50);
    if (j.hasNext()) {
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    stringBuffer.append(TEXT_52);
    }
    stringBuffer.append(TEXT_53);
    }
    if (!genClass.getChildrenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_55);
    for (Iterator i=genClass.getChildrenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_59);
    if (genClass.getChildrenFeatures().size() > 1) {
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_61);
    }
    }
    if (genClass.isImage()) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_65);
    }
    stringBuffer.append(TEXT_66);
    if (genClass.isMapEntry()) {
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    } else if (genClass.getLabelFeature() != null) { GenFeature labelFeature = genClass.getLabelFeature();
    if (labelFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genClass.getLabelFeature().getGetAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    } else {
    if (labelFeature.isStringType()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(labelFeature.getGetAccessor());
    stringBuffer.append(TEXT_82);
    } else {
    stringBuffer.append(TEXT_83);
    stringBuffer.append(labelFeature.getImportedType());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(labelFeature.getGetAccessor());
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    }
    } else {
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_93);
    if (!genClass.getLabelNotifyFeatures().isEmpty() || !genClass.getContentNotifyFeatures().isEmpty() || !genClass.getLabelAndContentNotifyFeatures().isEmpty()) {
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_95);
    if (!genClass.getLabelNotifyFeatures().isEmpty()) {
    for (Iterator i=genClass.getLabelNotifyFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.ViewerNotification"));
    stringBuffer.append(TEXT_99);
    }
    if (!genClass.getContentNotifyFeatures().isEmpty()) {
    for (Iterator i=genClass.getContentNotifyFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.ViewerNotification"));
    stringBuffer.append(TEXT_103);
    }
    if (!genClass.getLabelAndContentNotifyFeatures().isEmpty()) {
    for (Iterator i=genClass.getLabelAndContentNotifyFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_105);
    }
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.ViewerNotification"));
    stringBuffer.append(TEXT_107);
    }
    stringBuffer.append(TEXT_108);
    }
    stringBuffer.append(TEXT_109);
    if (genModel.isCreationCommands()) {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_111);
    for (Iterator i=genClass.getCrossPackageCreateChildFeatures().iterator(); i.hasNext();) { GenFeature createFeature = (GenFeature)i.next();
    for (Iterator c=genClass.getCrossPackageChildrenClasses(createFeature).iterator(); c.hasNext();) { GenClass createClass = (GenClass)c.next();
    stringBuffer.append(TEXT_112);
    stringBuffer.append(createFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(createFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_114);
    if (createClass.isMapEntry()) { 
    stringBuffer.append(TEXT_115);
    stringBuffer.append(createClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(createClass.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(createClass.getName());
    stringBuffer.append(TEXT_118);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(createClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(createClass.getName());
    stringBuffer.append(TEXT_121);
    }
    }
    }
    for (Iterator i=genClass.getCreateChildFeatures().iterator(); i.hasNext();) { GenFeature createFeature = (GenFeature)i.next();
    if (createFeature.isFeatureMapType()) {
    for (Iterator d=createFeature.getDelegatedFeatures().iterator(); d.hasNext();) { GenFeature delegatedFeature = (GenFeature)d.next();
    if (delegatedFeature.isReferenceType()) {
    for (Iterator c=genClass.getChildrenClasses(delegatedFeature).iterator(); c.hasNext();) { GenClass createClass = (GenClass)c.next();
    stringBuffer.append(TEXT_122);
    stringBuffer.append(createFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(createFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil"));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(delegatedFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(delegatedFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_127);
    if (createClass.isMapEntry()) { 
    stringBuffer.append(TEXT_128);
    stringBuffer.append(createClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(createClass.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(createClass.getName());
    stringBuffer.append(TEXT_131);
    } else {
    stringBuffer.append(TEXT_132);
    stringBuffer.append(createClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(createClass.getName());
    stringBuffer.append(TEXT_134);
    }
    }
    } else {
    stringBuffer.append(TEXT_135);
    stringBuffer.append(createFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(createFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil"));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(delegatedFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(delegatedFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_140);
    if (delegatedFeature.isEnumBasedType()) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(delegatedFeature.getGenEnumType().getStaticValue(delegatedFeature.getEcoreFeature().getDefaultValueLiteral()));
    stringBuffer.append(TEXT_142);
    } else if (delegatedFeature.isStringBasedType()) {
    stringBuffer.append(TEXT_143);
    stringBuffer.append(delegatedFeature.getCreateChildValueLiteral());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genModel.getNonNLS());
    } else { String literal = delegatedFeature.getCreateChildValueLiteral(); GenDataType createDataType = delegatedFeature.getGenDataTypeType();
    stringBuffer.append(TEXT_145);
    stringBuffer.append(createDataType.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(createDataType.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(createDataType.getClassifierAccessorName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(literal);
    stringBuffer.append(TEXT_149);
    if (literal != null) {
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_150);
    }
    }
    }
    }
    } else if (createFeature.isReferenceType()) {
    for (Iterator c=genClass.getChildrenClasses(createFeature).iterator(); c.hasNext();) { GenClass createClass = (GenClass)c.next();
    stringBuffer.append(TEXT_151);
    stringBuffer.append(createFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(createFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_153);
    if (createClass.isMapEntry()) { 
    stringBuffer.append(TEXT_154);
    stringBuffer.append(createClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(createClass.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(createClass.getName());
    stringBuffer.append(TEXT_157);
    } else {
    stringBuffer.append(TEXT_158);
    stringBuffer.append(createClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(createClass.getName());
    stringBuffer.append(TEXT_160);
    }
    }
    } else {
    stringBuffer.append(TEXT_161);
    stringBuffer.append(createFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(createFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_163);
    if (createFeature.isEnumBasedType()) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(createFeature.getGenEnumType().getStaticValue(createFeature.getEcoreFeature().getDefaultValueLiteral()));
    stringBuffer.append(TEXT_165);
    } else if (createFeature.isStringBasedType()) {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(createFeature.getCreateChildValueLiteral());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genModel.getNonNLS());
    } else { String literal = createFeature.getCreateChildValueLiteral(); GenDataType createDataType = createFeature.getGenDataTypeType();
    stringBuffer.append(TEXT_168);
    stringBuffer.append(createDataType.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(createDataType.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(createDataType.getClassifierAccessorName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(literal);
    stringBuffer.append(TEXT_172);
    if (literal != null) {
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_173);
    }
    }
    }
    }
    stringBuffer.append(TEXT_174);
    if (!genClass.getSharedClassCreateChildFeatures().isEmpty()) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_176);
    if (genClass.hasFeatureMapCreateChildFeatures()) {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil"));
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_181);
    for (Iterator i = genClass.getSharedClassCreateChildFeatures().iterator(); i.hasNext();) { GenFeature createFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_182);
    stringBuffer.append(createFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(createFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(i.hasNext() ? " ||" : ";");
    }
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_186);
    }
    if (!genModel.isCreationIcons() && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil"));
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EReference"));
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genClass.getGenPackage().getImportedEditPluginClassName());
    stringBuffer.append(TEXT_196);
    }
    }
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genPackage.getImportedEditPluginClassName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(TEXT_199);
    if (!UML2GenModelUtil.getImplementedSubsetGenFeatures(genClass, true).isEmpty()) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.domain.EditingDomain"));
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_205);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getImplementedSubsetGenFeatures(genClass, true).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    stringBuffer.append(TEXT_206);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.edit.command.SubsetAddCommand"));
    stringBuffer.append(TEXT_208);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureAccessorArray(genClass, subsetGenFeature));
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    }
    if (!UML2GenModelUtil.getImplementedSupersetGenFeatures(genClass, true).isEmpty()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.domain.EditingDomain"));
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_216);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getImplementedSupersetGenFeatures(genClass, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_217);
    stringBuffer.append(supersetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.edit.command.SupersetRemoveCommand"));
    stringBuffer.append(TEXT_219);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureAccessorArray(genClass, supersetGenFeature));
    stringBuffer.append(TEXT_220);
    }
    stringBuffer.append(TEXT_221);
    }
    if (!UML2GenModelUtil.getImplementedSubsetGenFeatures(genClass, true).isEmpty() || !UML2GenModelUtil.getImplementedSupersetGenFeatures(genClass, true).isEmpty()) {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.domain.EditingDomain"));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_228);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getImplementedSubsetGenFeatures(genClass, true).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    stringBuffer.append(TEXT_229);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.edit.command.SubsetReplaceCommand"));
    stringBuffer.append(TEXT_231);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureAccessorArray(genClass, subsetGenFeature));
    stringBuffer.append(TEXT_232);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getImplementedSupersetGenFeatures(genClass, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_233);
    stringBuffer.append(supersetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.edit.command.SupersetReplaceCommand"));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureAccessorArray(genClass, supersetGenFeature));
    stringBuffer.append(TEXT_236);
    }
    stringBuffer.append(TEXT_237);
    }
    if (!UML2GenModelUtil.getImplementedSubsetGenFeatures(genClass, false).isEmpty() || !UML2GenModelUtil.getImplementedSupersetGenFeatures(genClass, false).isEmpty()) {
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.domain.EditingDomain"));
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_242);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getImplementedSubsetGenFeatures(genClass, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    stringBuffer.append(TEXT_243);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.edit.command.SubsetSetCommand"));
    stringBuffer.append(TEXT_245);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureAccessorArray(genClass, subsetGenFeature));
    stringBuffer.append(TEXT_246);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getImplementedSupersetGenFeatures(genClass, false).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_247);
    stringBuffer.append(supersetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.edit.command.SupersetSetCommand"));
    stringBuffer.append(TEXT_249);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureAccessorArray(genClass, supersetGenFeature));
    stringBuffer.append(TEXT_250);
    }
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_253);
    return stringBuffer.toString();
  }
}
