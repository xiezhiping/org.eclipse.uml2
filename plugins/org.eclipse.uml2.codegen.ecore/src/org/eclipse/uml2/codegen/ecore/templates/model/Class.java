package org.eclipse.uml2.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
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
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_8 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_9 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_10 = NL + " *   <li>{@link ";
  protected final String TEXT_11 = "#";
  protected final String TEXT_12 = " <em>";
  protected final String TEXT_13 = "</em>}</li>";
  protected final String TEXT_14 = NL + " * </ul>";
  protected final String TEXT_15 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */" + NL + "public";
  protected final String TEXT_16 = " abstract";
  protected final String TEXT_17 = " class ";
  protected final String TEXT_18 = NL + "{";
  protected final String TEXT_19 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_20 = " copyright = \"";
  protected final String TEXT_21 = "\";";
  protected final String TEXT_22 = NL;
  protected final String TEXT_23 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_24 = " mofDriverNumber = \"";
  protected final String TEXT_25 = "\";";
  protected final String TEXT_26 = NL;
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_28 = " = null;" + NL;
  protected final String TEXT_29 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_30 = " = 0;" + NL;
  protected final String TEXT_31 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_32 = " = 0;" + NL;
  protected final String TEXT_33 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_34 = "() <em>";
  protected final String TEXT_35 = "</em>}' ";
  protected final String TEXT_36 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_37 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = " = null;" + NL;
  protected final String TEXT_40 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_41 = "() <em>";
  protected final String TEXT_42 = "</em>}' ";
  protected final String TEXT_43 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_44 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_45 = " ";
  protected final String TEXT_46 = "_EDEFAULT = ";
  protected final String TEXT_47 = ";";
  protected final String TEXT_48 = NL;
  protected final String TEXT_49 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_50 = " = 0;" + NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_52 = "() <em>";
  protected final String TEXT_53 = "</em>}' ";
  protected final String TEXT_54 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_55 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_56 = "_EFLAG = 1 ";
  protected final String TEXT_57 = ";" + NL;
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_59 = "() <em>";
  protected final String TEXT_60 = "</em>}' ";
  protected final String TEXT_61 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_62 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_63 = " ";
  protected final String TEXT_64 = " = ";
  protected final String TEXT_65 = "_EDEFAULT;" + NL;
  protected final String TEXT_66 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_67 = " = 0;" + NL;
  protected final String TEXT_68 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_69 = " ";
  protected final String TEXT_70 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_71 = "_ESETFLAG = 1 ";
  protected final String TEXT_72 = ";" + NL;
  protected final String TEXT_73 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_74 = " ";
  protected final String TEXT_75 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_76 = "ESet = false;" + NL;
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_78 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_79 = NL + "\t\t";
  protected final String TEXT_80 = " |= ";
  protected final String TEXT_81 = "_EFLAG;";
  protected final String TEXT_82 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_83 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_84 = ".eINSTANCE.get";
  protected final String TEXT_85 = "();" + NL + "\t}" + NL;
  protected final String TEXT_86 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_87 = " ";
  protected final String TEXT_88 = "()" + NL + "\t{";
  protected final String TEXT_89 = NL + "\t\treturn ";
  protected final String TEXT_90 = "(";
  protected final String TEXT_91 = "(";
  protected final String TEXT_92 = ")eGet(";
  protected final String TEXT_93 = ".eINSTANCE.get";
  protected final String TEXT_94 = "(), true)";
  protected final String TEXT_95 = ").";
  protected final String TEXT_96 = "()";
  protected final String TEXT_97 = ";";
  protected final String TEXT_98 = NL + "\t\t";
  protected final String TEXT_99 = " ";
  protected final String TEXT_100 = " = (";
  protected final String TEXT_101 = ")eVirtualGet(";
  protected final String TEXT_102 = ");";
  protected final String TEXT_103 = NL + "\t\tif (";
  protected final String TEXT_104 = " == null)" + NL + "\t\t{";
  protected final String TEXT_105 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_106 = ", ";
  protected final String TEXT_107 = " = new ";
  protected final String TEXT_108 = ");";
  protected final String TEXT_109 = NL + "\t\t\t";
  protected final String TEXT_110 = " = new ";
  protected final String TEXT_111 = ";";
  protected final String TEXT_112 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_113 = ";";
  protected final String TEXT_114 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_115 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_116 = ")eContainer;";
  protected final String TEXT_117 = NL + "\t\t";
  protected final String TEXT_118 = " ";
  protected final String TEXT_119 = " = (";
  protected final String TEXT_120 = ")eVirtualGet(";
  protected final String TEXT_121 = ");";
  protected final String TEXT_122 = NL + "\t\tif (";
  protected final String TEXT_123 = " != null && ";
  protected final String TEXT_124 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_125 = " old";
  protected final String TEXT_126 = " = ";
  protected final String TEXT_127 = ";" + NL + "\t\t\t";
  protected final String TEXT_128 = " = ";
  protected final String TEXT_129 = "eResolveProxy((";
  protected final String TEXT_130 = ")";
  protected final String TEXT_131 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_132 = " != old";
  protected final String TEXT_133 = ")" + NL + "\t\t\t{";
  protected final String TEXT_134 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_135 = ", ";
  protected final String TEXT_136 = ");";
  protected final String TEXT_137 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_138 = "(this, ";
  protected final String TEXT_139 = ".RESOLVE, ";
  protected final String TEXT_140 = ", old";
  protected final String TEXT_141 = ", ";
  protected final String TEXT_142 = "));" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_143 = NL + "\t\treturn (";
  protected final String TEXT_144 = " & ";
  protected final String TEXT_145 = "_EFLAG) != 0;";
  protected final String TEXT_146 = NL + "\t\treturn ";
  protected final String TEXT_147 = " == null ? ";
  protected final String TEXT_148 = "_EDEFAULT : ";
  protected final String TEXT_149 = ";";
  protected final String TEXT_150 = NL + "\t\treturn ";
  protected final String TEXT_151 = ";";
  protected final String TEXT_152 = NL + "\t\t";
  protected final String TEXT_153 = " ";
  protected final String TEXT_154 = " = basicGet";
  protected final String TEXT_155 = "();" + NL + "\t\treturn ";
  protected final String TEXT_156 = " == null ? null : (";
  protected final String TEXT_157 = ".eIsProxy() ? ";
  protected final String TEXT_158 = "eResolveProxy((";
  protected final String TEXT_159 = ")";
  protected final String TEXT_160 = ") : ";
  protected final String TEXT_161 = ");";
  protected final String TEXT_162 = NL + "\t\treturn new ";
  protected final String TEXT_163 = "((";
  protected final String TEXT_164 = ")((";
  protected final String TEXT_165 = ")get";
  protected final String TEXT_166 = "()).featureMap().list(";
  protected final String TEXT_167 = "()));";
  protected final String TEXT_168 = NL + "\t\treturn (";
  protected final String TEXT_169 = ")((";
  protected final String TEXT_170 = ")get";
  protected final String TEXT_171 = "()).list(";
  protected final String TEXT_172 = "());";
  protected final String TEXT_173 = NL + "\t\treturn ((";
  protected final String TEXT_174 = ")get";
  protected final String TEXT_175 = "()).featureMap().list(";
  protected final String TEXT_176 = "());";
  protected final String TEXT_177 = NL + "\t\treturn ((";
  protected final String TEXT_178 = ")get";
  protected final String TEXT_179 = "()).list(";
  protected final String TEXT_180 = "());";
  protected final String TEXT_181 = NL + "\t\treturn ";
  protected final String TEXT_182 = "(";
  protected final String TEXT_183 = "(";
  protected final String TEXT_184 = ")((";
  protected final String TEXT_185 = ")get";
  protected final String TEXT_186 = "()).featureMap().get(";
  protected final String TEXT_187 = "(), true)";
  protected final String TEXT_188 = ").";
  protected final String TEXT_189 = "()";
  protected final String TEXT_190 = ";";
  protected final String TEXT_191 = NL + "\t\treturn ";
  protected final String TEXT_192 = "(";
  protected final String TEXT_193 = "(";
  protected final String TEXT_194 = ")get";
  protected final String TEXT_195 = "().get(";
  protected final String TEXT_196 = "(), true)";
  protected final String TEXT_197 = ").";
  protected final String TEXT_198 = "()";
  protected final String TEXT_199 = ";";
  protected final String TEXT_200 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_201 = "' ";
  protected final String TEXT_202 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_203 = NL + "\t}" + NL;
  protected final String TEXT_204 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_205 = " basicGet";
  protected final String TEXT_206 = "()" + NL + "\t{";
  protected final String TEXT_207 = NL + "\t\treturn (";
  protected final String TEXT_208 = ")eVirtualGet(";
  protected final String TEXT_209 = ");";
  protected final String TEXT_210 = NL + "\t\treturn ";
  protected final String TEXT_211 = ";";
  protected final String TEXT_212 = NL + "\t\treturn (";
  protected final String TEXT_213 = ")((";
  protected final String TEXT_214 = ")get";
  protected final String TEXT_215 = "()).featureMap().get(";
  protected final String TEXT_216 = "(), false);";
  protected final String TEXT_217 = NL + "\t\treturn (";
  protected final String TEXT_218 = ")get";
  protected final String TEXT_219 = "().get(";
  protected final String TEXT_220 = "(), false);";
  protected final String TEXT_221 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_222 = "' ";
  protected final String TEXT_223 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_224 = NL + "\t}" + NL;
  protected final String TEXT_225 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_226 = " basicSet";
  protected final String TEXT_227 = "(";
  protected final String TEXT_228 = " new";
  protected final String TEXT_229 = ", ";
  protected final String TEXT_230 = " msgs)" + NL + "\t{";
  protected final String TEXT_231 = NL;
  protected final String TEXT_232 = NL + "\t\tif (new";
  protected final String TEXT_233 = " != null && !";
  protected final String TEXT_234 = "().contains(new";
  protected final String TEXT_235 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_236 = "().add(new";
  protected final String TEXT_237 = ");" + NL + "\t\t}";
  protected final String TEXT_238 = NL + "\t\tObject old";
  protected final String TEXT_239 = " = eVirtualSet(";
  protected final String TEXT_240 = ", new";
  protected final String TEXT_241 = ");";
  protected final String TEXT_242 = NL + "\t\t";
  protected final String TEXT_243 = " old";
  protected final String TEXT_244 = " = ";
  protected final String TEXT_245 = ";" + NL + "\t\t";
  protected final String TEXT_246 = " = new";
  protected final String TEXT_247 = ";";
  protected final String TEXT_248 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_249 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_250 = NL + "\t\tboolean old";
  protected final String TEXT_251 = "ESet = (";
  protected final String TEXT_252 = " & ";
  protected final String TEXT_253 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_254 = " |= ";
  protected final String TEXT_255 = "_ESETFLAG;";
  protected final String TEXT_256 = NL + "\t\tboolean old";
  protected final String TEXT_257 = "ESet = ";
  protected final String TEXT_258 = "ESet;" + NL + "\t\t";
  protected final String TEXT_259 = "ESet = true;";
  protected final String TEXT_260 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_261 = NL + "\t\t\t";
  protected final String TEXT_262 = " notification = new ";
  protected final String TEXT_263 = "(this, ";
  protected final String TEXT_264 = ".SET, ";
  protected final String TEXT_265 = ", ";
  protected final String TEXT_266 = "isSetChange ? null : old";
  protected final String TEXT_267 = "old";
  protected final String TEXT_268 = ", new";
  protected final String TEXT_269 = ", ";
  protected final String TEXT_270 = "isSetChange";
  protected final String TEXT_271 = "!old";
  protected final String TEXT_272 = "ESet";
  protected final String TEXT_273 = ");";
  protected final String TEXT_274 = NL + "\t\t\t";
  protected final String TEXT_275 = " notification = new ";
  protected final String TEXT_276 = "(this, ";
  protected final String TEXT_277 = ".SET, ";
  protected final String TEXT_278 = ", ";
  protected final String TEXT_279 = "old";
  protected final String TEXT_280 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_281 = "old";
  protected final String TEXT_282 = ", new";
  protected final String TEXT_283 = ");";
  protected final String TEXT_284 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_285 = NL;
  protected final String TEXT_286 = NL + "\t\tif (";
  protected final String TEXT_287 = " != null && ";
  protected final String TEXT_288 = " != new";
  protected final String TEXT_289 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_290 = "(null);" + NL + "\t\t}";
  protected final String TEXT_291 = NL + "\t\tif (new";
  protected final String TEXT_292 = " != null ||  old";
  protected final String TEXT_293 = " == ";
  protected final String TEXT_294 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_295 = "(new";
  protected final String TEXT_296 = ");" + NL + "\t\t}";
  protected final String TEXT_297 = NL + "\t\treturn msgs;";
  protected final String TEXT_298 = NL + "\t\treturn ((";
  protected final String TEXT_299 = ".Internal)((";
  protected final String TEXT_300 = ")get";
  protected final String TEXT_301 = "()).featureMap()).basicAdd(";
  protected final String TEXT_302 = "(), new";
  protected final String TEXT_303 = ", msgs);";
  protected final String TEXT_304 = NL + "\t\treturn ((";
  protected final String TEXT_305 = ".Internal)get";
  protected final String TEXT_306 = "()).basicAdd(";
  protected final String TEXT_307 = "(), new";
  protected final String TEXT_308 = ", msgs);";
  protected final String TEXT_309 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_310 = "' ";
  protected final String TEXT_311 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_312 = NL + "\t}" + NL;
  protected final String TEXT_313 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_314 = "(";
  protected final String TEXT_315 = " new";
  protected final String TEXT_316 = ")" + NL + "\t{";
  protected final String TEXT_317 = NL;
  protected final String TEXT_318 = NL + "\t\tnew";
  protected final String TEXT_319 = " = new";
  protected final String TEXT_320 = " == null ? ";
  protected final String TEXT_321 = "_EDEFAULT : new";
  protected final String TEXT_322 = ";";
  protected final String TEXT_323 = NL + "\t\tif (new";
  protected final String TEXT_324 = " != null && !";
  protected final String TEXT_325 = "().contains(new";
  protected final String TEXT_326 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_327 = "().add(new";
  protected final String TEXT_328 = ");" + NL + "\t\t}";
  protected final String TEXT_329 = NL + "\t\t";
  protected final String TEXT_330 = " old";
  protected final String TEXT_331 = " = eContainer;";
  protected final String TEXT_332 = NL + "\t\teSet(";
  protected final String TEXT_333 = ".eINSTANCE.get";
  protected final String TEXT_334 = "(), ";
  protected final String TEXT_335 = "new ";
  protected final String TEXT_336 = "(";
  protected final String TEXT_337 = "new";
  protected final String TEXT_338 = ")";
  protected final String TEXT_339 = ");";
  protected final String TEXT_340 = NL + "\t\tif (new";
  protected final String TEXT_341 = " != eContainer || (eContainerFeatureID != ";
  protected final String TEXT_342 = " && new";
  protected final String TEXT_343 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_344 = ".isAncestor(this, ";
  protected final String TEXT_345 = "new";
  protected final String TEXT_346 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_347 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_348 = NL + "\t\t\t";
  protected final String TEXT_349 = " msgs = null;" + NL + "\t\t\tif (eContainer != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_350 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_351 = ")new";
  protected final String TEXT_352 = ").eInverseAdd(this, ";
  protected final String TEXT_353 = ", ";
  protected final String TEXT_354 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_355 = ")new";
  protected final String TEXT_356 = ", ";
  protected final String TEXT_357 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_358 = "(this, ";
  protected final String TEXT_359 = ".SET, ";
  protected final String TEXT_360 = ", new";
  protected final String TEXT_361 = ", new";
  protected final String TEXT_362 = "));";
  protected final String TEXT_363 = NL + "\t\t";
  protected final String TEXT_364 = " ";
  protected final String TEXT_365 = " = (";
  protected final String TEXT_366 = ")eVirtualGet(";
  protected final String TEXT_367 = ");";
  protected final String TEXT_368 = NL + "\t\tif (new";
  protected final String TEXT_369 = " != ";
  protected final String TEXT_370 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_371 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_372 = " != null)";
  protected final String TEXT_373 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_374 = ")";
  protected final String TEXT_375 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_376 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_377 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_378 = ")new";
  protected final String TEXT_379 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_380 = ", null, msgs);";
  protected final String TEXT_381 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_382 = ")";
  protected final String TEXT_383 = ").eInverseRemove(this, ";
  protected final String TEXT_384 = ", ";
  protected final String TEXT_385 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_386 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_387 = ")new";
  protected final String TEXT_388 = ").eInverseAdd(this, ";
  protected final String TEXT_389 = ", ";
  protected final String TEXT_390 = ".class, msgs);";
  protected final String TEXT_391 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_392 = "(";
  protected final String TEXT_393 = "new";
  protected final String TEXT_394 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_395 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_396 = NL + "\t\t\tboolean old";
  protected final String TEXT_397 = "ESet = eVirtualIsSet(";
  protected final String TEXT_398 = ");";
  protected final String TEXT_399 = NL + "\t\t\tboolean old";
  protected final String TEXT_400 = "ESet = (";
  protected final String TEXT_401 = " & ";
  protected final String TEXT_402 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_403 = " |= ";
  protected final String TEXT_404 = "_ESETFLAG;";
  protected final String TEXT_405 = NL + "\t\t\tboolean old";
  protected final String TEXT_406 = "ESet = ";
  protected final String TEXT_407 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_408 = "ESet = true;";
  protected final String TEXT_409 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_410 = "(this, ";
  protected final String TEXT_411 = ".SET, ";
  protected final String TEXT_412 = ", new";
  protected final String TEXT_413 = ", new";
  protected final String TEXT_414 = ", !old";
  protected final String TEXT_415 = "ESet));" + NL + "    \t}";
  protected final String TEXT_416 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_417 = "(this, ";
  protected final String TEXT_418 = ".SET, ";
  protected final String TEXT_419 = ", new";
  protected final String TEXT_420 = ", new";
  protected final String TEXT_421 = "));";
  protected final String TEXT_422 = NL + "\t\t";
  protected final String TEXT_423 = " old";
  protected final String TEXT_424 = " = (";
  protected final String TEXT_425 = " & ";
  protected final String TEXT_426 = "_EFLAG) != 0;" + NL + "\t\tif (new";
  protected final String TEXT_427 = ") ";
  protected final String TEXT_428 = " |= ";
  protected final String TEXT_429 = "_EFLAG; else ";
  protected final String TEXT_430 = " &= ~";
  protected final String TEXT_431 = "_EFLAG;";
  protected final String TEXT_432 = NL + "\t\t";
  protected final String TEXT_433 = " old";
  protected final String TEXT_434 = " = ";
  protected final String TEXT_435 = ";";
  protected final String TEXT_436 = NL + "\t\t";
  protected final String TEXT_437 = " ";
  protected final String TEXT_438 = " = new";
  protected final String TEXT_439 = " == null ? ";
  protected final String TEXT_440 = "_EDEFAULT : new";
  protected final String TEXT_441 = ";";
  protected final String TEXT_442 = NL + "\t\t";
  protected final String TEXT_443 = " = new";
  protected final String TEXT_444 = " == null ? ";
  protected final String TEXT_445 = "_EDEFAULT : new";
  protected final String TEXT_446 = ";";
  protected final String TEXT_447 = NL + "\t\t";
  protected final String TEXT_448 = " ";
  protected final String TEXT_449 = " = ";
  protected final String TEXT_450 = "new";
  protected final String TEXT_451 = ";";
  protected final String TEXT_452 = NL + "\t\t";
  protected final String TEXT_453 = " = ";
  protected final String TEXT_454 = "new";
  protected final String TEXT_455 = ";";
  protected final String TEXT_456 = NL + "\t\tObject old";
  protected final String TEXT_457 = " = eVirtualSet(";
  protected final String TEXT_458 = ", ";
  protected final String TEXT_459 = ");";
  protected final String TEXT_460 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_461 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_462 = NL + "\t\tboolean old";
  protected final String TEXT_463 = "ESet = (";
  protected final String TEXT_464 = " & ";
  protected final String TEXT_465 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_466 = " |= ";
  protected final String TEXT_467 = "_ESETFLAG;";
  protected final String TEXT_468 = NL + "\t\tboolean old";
  protected final String TEXT_469 = "ESet = ";
  protected final String TEXT_470 = "ESet;" + NL + "\t\t";
  protected final String TEXT_471 = "ESet = true;";
  protected final String TEXT_472 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_473 = "(this, ";
  protected final String TEXT_474 = ".SET, ";
  protected final String TEXT_475 = ", ";
  protected final String TEXT_476 = "isSetChange ? ";
  protected final String TEXT_477 = "null";
  protected final String TEXT_478 = "_EDEFAULT";
  protected final String TEXT_479 = " : old";
  protected final String TEXT_480 = "old";
  protected final String TEXT_481 = ", ";
  protected final String TEXT_482 = "new";
  protected final String TEXT_483 = ", ";
  protected final String TEXT_484 = "isSetChange";
  protected final String TEXT_485 = "!old";
  protected final String TEXT_486 = "ESet";
  protected final String TEXT_487 = "));";
  protected final String TEXT_488 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_489 = "(this, ";
  protected final String TEXT_490 = ".SET, ";
  protected final String TEXT_491 = ", ";
  protected final String TEXT_492 = "old";
  protected final String TEXT_493 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_494 = "null";
  protected final String TEXT_495 = "_EDEFAULT";
  protected final String TEXT_496 = " : old";
  protected final String TEXT_497 = "old";
  protected final String TEXT_498 = ", ";
  protected final String TEXT_499 = "new";
  protected final String TEXT_500 = "));";
  protected final String TEXT_501 = NL;
  protected final String TEXT_502 = NL + "\t\tif (";
  protected final String TEXT_503 = " != null && ";
  protected final String TEXT_504 = " != new";
  protected final String TEXT_505 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_506 = "(null);" + NL + "\t\t}";
  protected final String TEXT_507 = NL + "\t\tif (new";
  protected final String TEXT_508 = " != null || old";
  protected final String TEXT_509 = " == ";
  protected final String TEXT_510 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_511 = "(new";
  protected final String TEXT_512 = ");" + NL + "\t\t}";
  protected final String TEXT_513 = NL + "\t\t((";
  protected final String TEXT_514 = ".Internal)((";
  protected final String TEXT_515 = ")get";
  protected final String TEXT_516 = "()).featureMap()).set(";
  protected final String TEXT_517 = "(), ";
  protected final String TEXT_518 = "new ";
  protected final String TEXT_519 = "(";
  protected final String TEXT_520 = "new";
  protected final String TEXT_521 = ")";
  protected final String TEXT_522 = ");";
  protected final String TEXT_523 = NL + "\t\t((";
  protected final String TEXT_524 = ".Internal)get";
  protected final String TEXT_525 = "()).set(";
  protected final String TEXT_526 = "(), ";
  protected final String TEXT_527 = "new ";
  protected final String TEXT_528 = "(";
  protected final String TEXT_529 = "new";
  protected final String TEXT_530 = ")";
  protected final String TEXT_531 = ");";
  protected final String TEXT_532 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_533 = "' ";
  protected final String TEXT_534 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_535 = NL + "\t}" + NL;
  protected final String TEXT_536 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_537 = " basicUnset";
  protected final String TEXT_538 = "(";
  protected final String TEXT_539 = " msgs)" + NL + "\t{";
  protected final String TEXT_540 = NL + "\t\tObject old";
  protected final String TEXT_541 = " = eVirtualUnset(";
  protected final String TEXT_542 = ");";
  protected final String TEXT_543 = NL + "\t\t";
  protected final String TEXT_544 = " old";
  protected final String TEXT_545 = " = ";
  protected final String TEXT_546 = ";" + NL + "\t\t";
  protected final String TEXT_547 = " = null;";
  protected final String TEXT_548 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_549 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_550 = NL + "\t\tboolean old";
  protected final String TEXT_551 = "ESet = (";
  protected final String TEXT_552 = " & ";
  protected final String TEXT_553 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_554 = " &= ~";
  protected final String TEXT_555 = "_ESETFLAG;";
  protected final String TEXT_556 = NL + "\t\tboolean old";
  protected final String TEXT_557 = "ESet = ";
  protected final String TEXT_558 = "ESet;" + NL + "\t\t";
  protected final String TEXT_559 = "ESet = false;";
  protected final String TEXT_560 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_561 = " notification = new ";
  protected final String TEXT_562 = "(this, ";
  protected final String TEXT_563 = ".UNSET, ";
  protected final String TEXT_564 = ", ";
  protected final String TEXT_565 = "isSetChange ? old";
  protected final String TEXT_566 = " : null";
  protected final String TEXT_567 = "old";
  protected final String TEXT_568 = ", null, ";
  protected final String TEXT_569 = "isSetChange";
  protected final String TEXT_570 = "old";
  protected final String TEXT_571 = "ESet";
  protected final String TEXT_572 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_573 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_574 = "' ";
  protected final String TEXT_575 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_576 = NL + "\t}" + NL;
  protected final String TEXT_577 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void unset";
  protected final String TEXT_578 = "()" + NL + "\t{";
  protected final String TEXT_579 = NL + "\t\teUnset(";
  protected final String TEXT_580 = ".eINSTANCE.get";
  protected final String TEXT_581 = "());";
  protected final String TEXT_582 = NL + "\t\t((";
  protected final String TEXT_583 = ".Unsettable)get";
  protected final String TEXT_584 = "()).unset();";
  protected final String TEXT_585 = NL + "\t\t";
  protected final String TEXT_586 = " ";
  protected final String TEXT_587 = " = (";
  protected final String TEXT_588 = ")eVirtualGet(";
  protected final String TEXT_589 = ");";
  protected final String TEXT_590 = NL + "\t\tif (";
  protected final String TEXT_591 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_592 = " msgs = null;";
  protected final String TEXT_593 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_594 = ")";
  protected final String TEXT_595 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_596 = ", null, msgs);";
  protected final String TEXT_597 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_598 = ")";
  protected final String TEXT_599 = ").eInverseRemove(this, ";
  protected final String TEXT_600 = ", ";
  protected final String TEXT_601 = ".class, msgs);";
  protected final String TEXT_602 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_603 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_604 = NL + "\t\t\tboolean old";
  protected final String TEXT_605 = "ESet = eVirtualIsSet(";
  protected final String TEXT_606 = ");";
  protected final String TEXT_607 = NL + "\t\t\tboolean old";
  protected final String TEXT_608 = "ESet = (";
  protected final String TEXT_609 = " & ";
  protected final String TEXT_610 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_611 = " &= ~";
  protected final String TEXT_612 = "_ESETFLAG;";
  protected final String TEXT_613 = NL + "\t\t\tboolean old";
  protected final String TEXT_614 = "ESet = ";
  protected final String TEXT_615 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_616 = "ESet = false;";
  protected final String TEXT_617 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_618 = "(this, ";
  protected final String TEXT_619 = ".UNSET, ";
  protected final String TEXT_620 = ", null, null, old";
  protected final String TEXT_621 = "ESet));" + NL + "    \t}";
  protected final String TEXT_622 = NL + "\t\t";
  protected final String TEXT_623 = " old";
  protected final String TEXT_624 = " = (";
  protected final String TEXT_625 = " & ";
  protected final String TEXT_626 = "_EFLAG) != 0;";
  protected final String TEXT_627 = NL + "\t\tObject old";
  protected final String TEXT_628 = " = eVirtualUnset(";
  protected final String TEXT_629 = ");";
  protected final String TEXT_630 = NL + "\t\t";
  protected final String TEXT_631 = " old";
  protected final String TEXT_632 = " = ";
  protected final String TEXT_633 = ";";
  protected final String TEXT_634 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_635 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_636 = NL + "\t\tboolean old";
  protected final String TEXT_637 = "ESet = (";
  protected final String TEXT_638 = " & ";
  protected final String TEXT_639 = "_ESETFLAG) != 0;";
  protected final String TEXT_640 = NL + "\t\tboolean old";
  protected final String TEXT_641 = "ESet = ";
  protected final String TEXT_642 = "ESet;";
  protected final String TEXT_643 = NL + "\t\t";
  protected final String TEXT_644 = " = null;";
  protected final String TEXT_645 = NL + "\t\t";
  protected final String TEXT_646 = " &= ~";
  protected final String TEXT_647 = "_ESETFLAG;";
  protected final String TEXT_648 = NL + "\t\t";
  protected final String TEXT_649 = "ESet = false;";
  protected final String TEXT_650 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_651 = "(this, ";
  protected final String TEXT_652 = ".UNSET, ";
  protected final String TEXT_653 = ", ";
  protected final String TEXT_654 = "isSetChange ? old";
  protected final String TEXT_655 = " : null";
  protected final String TEXT_656 = "old";
  protected final String TEXT_657 = ", null, ";
  protected final String TEXT_658 = "isSetChange";
  protected final String TEXT_659 = "old";
  protected final String TEXT_660 = "ESet";
  protected final String TEXT_661 = "));";
  protected final String TEXT_662 = NL + "\t\tif (";
  protected final String TEXT_663 = "_EDEFAULT) ";
  protected final String TEXT_664 = " |= ";
  protected final String TEXT_665 = "_EFLAG; else ";
  protected final String TEXT_666 = " &= ~";
  protected final String TEXT_667 = "_EFLAG;";
  protected final String TEXT_668 = NL + "\t\t";
  protected final String TEXT_669 = " = ";
  protected final String TEXT_670 = "_EDEFAULT;";
  protected final String TEXT_671 = NL + "\t\t";
  protected final String TEXT_672 = " &= ~";
  protected final String TEXT_673 = "_ESETFLAG;";
  protected final String TEXT_674 = NL + "\t\t";
  protected final String TEXT_675 = "ESet = false;";
  protected final String TEXT_676 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_677 = "(this, ";
  protected final String TEXT_678 = ".UNSET, ";
  protected final String TEXT_679 = ", ";
  protected final String TEXT_680 = "isSetChange ? old";
  protected final String TEXT_681 = " : ";
  protected final String TEXT_682 = "_EDEFAULT";
  protected final String TEXT_683 = "old";
  protected final String TEXT_684 = ", ";
  protected final String TEXT_685 = "_EDEFAULT, ";
  protected final String TEXT_686 = "isSetChange";
  protected final String TEXT_687 = "old";
  protected final String TEXT_688 = "ESet";
  protected final String TEXT_689 = "));";
  protected final String TEXT_690 = NL + "\t\t((";
  protected final String TEXT_691 = ".Internal)((";
  protected final String TEXT_692 = ")get";
  protected final String TEXT_693 = "()).featureMap()).clear(";
  protected final String TEXT_694 = "());";
  protected final String TEXT_695 = NL + "\t\t((";
  protected final String TEXT_696 = ".Internal)get";
  protected final String TEXT_697 = "()).clear(";
  protected final String TEXT_698 = "());";
  protected final String TEXT_699 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_700 = "' ";
  protected final String TEXT_701 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_702 = NL + "\t}" + NL;
  protected final String TEXT_703 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_704 = "()" + NL + "\t{";
  protected final String TEXT_705 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_706 = ".eINSTANCE.get";
  protected final String TEXT_707 = "());";
  protected final String TEXT_708 = NL + "\t\t";
  protected final String TEXT_709 = " ";
  protected final String TEXT_710 = " = (";
  protected final String TEXT_711 = ")eVirtualGet(";
  protected final String TEXT_712 = ");";
  protected final String TEXT_713 = NL + "\t\treturn ";
  protected final String TEXT_714 = " != null && ((";
  protected final String TEXT_715 = ".Unsettable)";
  protected final String TEXT_716 = ").isSet();";
  protected final String TEXT_717 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_718 = ");";
  protected final String TEXT_719 = NL + "\t\treturn (";
  protected final String TEXT_720 = " & ";
  protected final String TEXT_721 = "_ESETFLAG) != 0;";
  protected final String TEXT_722 = NL + "\t\treturn ";
  protected final String TEXT_723 = "ESet;";
  protected final String TEXT_724 = NL + "\t\treturn !((";
  protected final String TEXT_725 = ".Internal)((";
  protected final String TEXT_726 = ")get";
  protected final String TEXT_727 = "()).featureMap()).isEmpty(";
  protected final String TEXT_728 = "());";
  protected final String TEXT_729 = NL + "\t\treturn !((";
  protected final String TEXT_730 = ".Internal)get";
  protected final String TEXT_731 = "()).isEmpty(";
  protected final String TEXT_732 = "());";
  protected final String TEXT_733 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_734 = "' ";
  protected final String TEXT_735 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_736 = NL + "\t}" + NL;
  protected final String TEXT_737 = NL;
  protected final String TEXT_738 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_739 = " create";
  protected final String TEXT_740 = "(";
  protected final String TEXT_741 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_742 = " new";
  protected final String TEXT_743 = " = (";
  protected final String TEXT_744 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_745 = NL + "\t\t";
  protected final String TEXT_746 = "().add(new";
  protected final String TEXT_747 = ");";
  protected final String TEXT_748 = NL + "\t\tset";
  protected final String TEXT_749 = "(new";
  protected final String TEXT_750 = ");";
  protected final String TEXT_751 = NL + "\t\treturn new";
  protected final String TEXT_752 = ";" + NL + "\t}" + NL;
  protected final String TEXT_753 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_754 = " create";
  protected final String TEXT_755 = "() {" + NL + "\t\t";
  protected final String TEXT_756 = " new";
  protected final String TEXT_757 = " = ";
  protected final String TEXT_758 = ".eINSTANCE.create";
  protected final String TEXT_759 = "();";
  protected final String TEXT_760 = NL + "\t\t";
  protected final String TEXT_761 = "().add(new";
  protected final String TEXT_762 = ");";
  protected final String TEXT_763 = NL + "\t\tset";
  protected final String TEXT_764 = "(new";
  protected final String TEXT_765 = ");";
  protected final String TEXT_766 = NL + "\t\treturn new";
  protected final String TEXT_767 = ";" + NL + "\t}" + NL;
  protected final String TEXT_768 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_769 = " get";
  protected final String TEXT_770 = "(";
  protected final String TEXT_771 = " ";
  protected final String TEXT_772 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_773 = " i = ";
  protected final String TEXT_774 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_775 = " ";
  protected final String TEXT_776 = " = (";
  protected final String TEXT_777 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_778 = ".equals(";
  protected final String TEXT_779 = ".";
  protected final String TEXT_780 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_781 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_782 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_783 = "()" + NL + "\t{";
  protected final String TEXT_784 = NL + "  \t\treturn false;";
  protected final String TEXT_785 = NL + "\t\treturn !((";
  protected final String TEXT_786 = ")";
  protected final String TEXT_787 = "()).featureMap().isEmpty();";
  protected final String TEXT_788 = NL + "\t\treturn ";
  protected final String TEXT_789 = " != null && !";
  protected final String TEXT_790 = ".featureMap().isEmpty();";
  protected final String TEXT_791 = NL + "\t\treturn ";
  protected final String TEXT_792 = " != null && !";
  protected final String TEXT_793 = ".isEmpty();";
  protected final String TEXT_794 = NL + "\t\t";
  protected final String TEXT_795 = " ";
  protected final String TEXT_796 = " = (";
  protected final String TEXT_797 = ")eVirtualGet(";
  protected final String TEXT_798 = ");" + NL + "\t\treturn ";
  protected final String TEXT_799 = " != null && !";
  protected final String TEXT_800 = ".isEmpty();";
  protected final String TEXT_801 = NL + "\t\treturn !";
  protected final String TEXT_802 = "().isEmpty();";
  protected final String TEXT_803 = NL + "\t\treturn ";
  protected final String TEXT_804 = " != null;";
  protected final String TEXT_805 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_806 = ") != null;";
  protected final String TEXT_807 = NL + "\t\treturn basicGet";
  protected final String TEXT_808 = "() != null;";
  protected final String TEXT_809 = NL + "\t\treturn ";
  protected final String TEXT_810 = " != null;";
  protected final String TEXT_811 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_812 = ") != null;";
  protected final String TEXT_813 = NL + "\t\treturn ";
  protected final String TEXT_814 = "() != null;";
  protected final String TEXT_815 = NL + "\t\treturn ((";
  protected final String TEXT_816 = " & ";
  protected final String TEXT_817 = "_EFLAG) != 0) != ";
  protected final String TEXT_818 = "_EDEFAULT;";
  protected final String TEXT_819 = NL + "\t\treturn ";
  protected final String TEXT_820 = " != ";
  protected final String TEXT_821 = "_EDEFAULT;";
  protected final String TEXT_822 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_823 = ") && eVirtualGet(";
  protected final String TEXT_824 = ") != ";
  protected final String TEXT_825 = "_EDEFAULT;";
  protected final String TEXT_826 = NL + "\t\treturn ";
  protected final String TEXT_827 = "() != ";
  protected final String TEXT_828 = "_EDEFAULT;";
  protected final String TEXT_829 = NL + "\t\treturn ";
  protected final String TEXT_830 = "_EDEFAULT == null ? ";
  protected final String TEXT_831 = " != null : !";
  protected final String TEXT_832 = "_EDEFAULT.equals(";
  protected final String TEXT_833 = ");";
  protected final String TEXT_834 = NL + "\t\t";
  protected final String TEXT_835 = " ";
  protected final String TEXT_836 = " = eVirtualIsSet(";
  protected final String TEXT_837 = ") ? (";
  protected final String TEXT_838 = ")eVirtualGet(";
  protected final String TEXT_839 = ") : ";
  protected final String TEXT_840 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_841 = "_EDEFAULT == null ? ";
  protected final String TEXT_842 = " != null : !";
  protected final String TEXT_843 = "_EDEFAULT.equals(";
  protected final String TEXT_844 = ");";
  protected final String TEXT_845 = NL + "\t\treturn ";
  protected final String TEXT_846 = "_EDEFAULT == null ? ";
  protected final String TEXT_847 = "() != null : !";
  protected final String TEXT_848 = "_EDEFAULT.equals(";
  protected final String TEXT_849 = "());";
  protected final String TEXT_850 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_851 = ".eINSTANCE.get";
  protected final String TEXT_852 = "());";
  protected final String TEXT_853 = NL + "\t\t";
  protected final String TEXT_854 = " ";
  protected final String TEXT_855 = " = (";
  protected final String TEXT_856 = ")eVirtualGet(";
  protected final String TEXT_857 = ");";
  protected final String TEXT_858 = NL + "\t\treturn ";
  protected final String TEXT_859 = " != null && ((";
  protected final String TEXT_860 = ".Unsettable)";
  protected final String TEXT_861 = ").isSet();";
  protected final String TEXT_862 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_863 = ");";
  protected final String TEXT_864 = NL + "\t\treturn (";
  protected final String TEXT_865 = " & ";
  protected final String TEXT_866 = "_ESETFLAG) != 0;";
  protected final String TEXT_867 = NL + "\t\treturn ";
  protected final String TEXT_868 = "ESet;";
  protected final String TEXT_869 = NL + "\t\treturn !((";
  protected final String TEXT_870 = ".Internal)((";
  protected final String TEXT_871 = ")get";
  protected final String TEXT_872 = "()).featureMap()).isEmpty(";
  protected final String TEXT_873 = "());";
  protected final String TEXT_874 = NL + "\t\treturn !((";
  protected final String TEXT_875 = ".Internal)get";
  protected final String TEXT_876 = "()).isEmpty(";
  protected final String TEXT_877 = "());";
  protected final String TEXT_878 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_879 = "' ";
  protected final String TEXT_880 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_881 = NL + "\t}" + NL;
  protected final String TEXT_882 = NL;
  protected final String TEXT_883 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_884 = " ";
  protected final String TEXT_885 = "(";
  protected final String TEXT_886 = ")";
  protected final String TEXT_887 = NL + "\t{";
  protected final String TEXT_888 = NL + "\t\t";
  protected final String TEXT_889 = NL + "\t\treturn ";
  protected final String TEXT_890 = ".";
  protected final String TEXT_891 = "(this, ";
  protected final String TEXT_892 = ", ";
  protected final String TEXT_893 = ");";
  protected final String TEXT_894 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_895 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_896 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_897 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_898 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_899 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_900 = ".";
  protected final String TEXT_901 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_902 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_903 = "\", ";
  protected final String TEXT_904 = ".getObjectLabel(this, ";
  protected final String TEXT_905 = ") }),";
  protected final String TEXT_906 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_907 = NL + "\t\t";
  protected final String TEXT_908 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_909 = " result = (";
  protected final String TEXT_910 = ") cache.get(";
  protected final String TEXT_911 = "eResource(), ";
  protected final String TEXT_912 = "this, ";
  protected final String TEXT_913 = ".eINSTANCE.get";
  protected final String TEXT_914 = "().getEOperations().get(";
  protected final String TEXT_915 = "));" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_916 = "eResource(), ";
  protected final String TEXT_917 = "this, ";
  protected final String TEXT_918 = ".eINSTANCE.get";
  protected final String TEXT_919 = "().getEOperations().get(";
  protected final String TEXT_920 = "), result = ";
  protected final String TEXT_921 = "new ";
  protected final String TEXT_922 = "(";
  protected final String TEXT_923 = ".";
  protected final String TEXT_924 = "(this";
  protected final String TEXT_925 = ", ";
  protected final String TEXT_926 = ")";
  protected final String TEXT_927 = ")";
  protected final String TEXT_928 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_929 = ".";
  protected final String TEXT_930 = "()";
  protected final String TEXT_931 = ";" + NL + "\t\t}";
  protected final String TEXT_932 = NL + "\t\treturn ";
  protected final String TEXT_933 = ".";
  protected final String TEXT_934 = "(this";
  protected final String TEXT_935 = ", ";
  protected final String TEXT_936 = ");";
  protected final String TEXT_937 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_938 = NL + "\t}" + NL;
  protected final String TEXT_939 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_940 = " eInverseAdd(";
  protected final String TEXT_941 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_942 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_943 = NL + "\t\t\t\tcase ";
  protected final String TEXT_944 = ":";
  protected final String TEXT_945 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_946 = ")((";
  protected final String TEXT_947 = ")";
  protected final String TEXT_948 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_949 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_950 = ")";
  protected final String TEXT_951 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_952 = NL + "\t\t\t\t\tif (eContainer != null)" + NL + "\t\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_953 = ", msgs);";
  protected final String TEXT_954 = NL + "\t\t\t\t\t";
  protected final String TEXT_955 = " ";
  protected final String TEXT_956 = " = (";
  protected final String TEXT_957 = ")eVirtualGet(";
  protected final String TEXT_958 = ");";
  protected final String TEXT_959 = NL + "\t\t\t\t\tif (";
  protected final String TEXT_960 = " != null)";
  protected final String TEXT_961 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_962 = ")";
  protected final String TEXT_963 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_964 = ", null, msgs);";
  protected final String TEXT_965 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_966 = ")";
  protected final String TEXT_967 = ").eInverseRemove(this, ";
  protected final String TEXT_968 = ", ";
  protected final String TEXT_969 = ".class, msgs);";
  protected final String TEXT_970 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_971 = "((";
  protected final String TEXT_972 = ")otherEnd, msgs);";
  protected final String TEXT_973 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (eContainer != null)" + NL + "\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\treturn eBasicSetContainer(otherEnd, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_974 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_975 = " eInverseRemove(";
  protected final String TEXT_976 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_977 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_978 = NL + "\t\t\t\tcase ";
  protected final String TEXT_979 = ":";
  protected final String TEXT_980 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_981 = ")((";
  protected final String TEXT_982 = ")";
  protected final String TEXT_983 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_984 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_985 = ")((";
  protected final String TEXT_986 = ")";
  protected final String TEXT_987 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_988 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_989 = ")";
  protected final String TEXT_990 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_991 = NL + "\t\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_992 = ", msgs);";
  protected final String TEXT_993 = NL + "\t\t\t\t\treturn basicUnset";
  protected final String TEXT_994 = "(msgs);";
  protected final String TEXT_995 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_996 = "(null, msgs);";
  protected final String TEXT_997 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eBasicSetContainer(null, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_998 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_999 = " eBasicRemoveFromContainer(";
  protected final String TEXT_1000 = " msgs)" + NL + "\t{" + NL + "\t\tif (eContainerFeatureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eContainerFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1001 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1002 = ":" + NL + "\t\t\t\t\treturn eContainer.eInverseRemove(this, ";
  protected final String TEXT_1003 = ", ";
  protected final String TEXT_1004 = ".class, msgs);";
  protected final String TEXT_1005 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicBasicRemoveFromContainer(msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1006 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(";
  protected final String TEXT_1007 = " eFeature, boolean resolve)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1008 = NL + "\t\t\tcase ";
  protected final String TEXT_1009 = ":";
  protected final String TEXT_1010 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1011 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1012 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1013 = "(";
  protected final String TEXT_1014 = "());";
  protected final String TEXT_1015 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1016 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1017 = "();";
  protected final String TEXT_1018 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1019 = ")";
  protected final String TEXT_1020 = "()).eMap();";
  protected final String TEXT_1021 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1022 = ")";
  protected final String TEXT_1023 = "()).featureMap();";
  protected final String TEXT_1024 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1025 = "();";
  protected final String TEXT_1026 = NL + "\t\t}" + NL + "\t\treturn eDynamicGet(eFeature, resolve);" + NL + "\t}" + NL;
  protected final String TEXT_1027 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(";
  protected final String TEXT_1028 = " eFeature, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1029 = NL + "\t\t\tcase ";
  protected final String TEXT_1030 = ":";
  protected final String TEXT_1031 = NL + "\t\t\t\t((";
  protected final String TEXT_1032 = ")";
  protected final String TEXT_1033 = "()).featureMap().clear();";
  protected final String TEXT_1034 = NL + "\t\t\t\t";
  protected final String TEXT_1035 = "().clear();";
  protected final String TEXT_1036 = NL + "\t\t\t\t((";
  protected final String TEXT_1037 = ")";
  protected final String TEXT_1038 = "()).featureMap().addAll((";
  protected final String TEXT_1039 = ")newValue);";
  protected final String TEXT_1040 = NL + "\t\t\t\t((";
  protected final String TEXT_1041 = ")";
  protected final String TEXT_1042 = "()).eMap().addAll((";
  protected final String TEXT_1043 = ")newValue);";
  protected final String TEXT_1044 = NL + "\t\t\t\t";
  protected final String TEXT_1045 = "().addAll((";
  protected final String TEXT_1046 = ")newValue);";
  protected final String TEXT_1047 = NL + "\t\t\t\tset";
  protected final String TEXT_1048 = "(((";
  protected final String TEXT_1049 = ")newValue).";
  protected final String TEXT_1050 = "());";
  protected final String TEXT_1051 = NL + "\t\t\t\tset";
  protected final String TEXT_1052 = "((";
  protected final String TEXT_1053 = ")newValue);";
  protected final String TEXT_1054 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1055 = NL + "\t\t}" + NL + "\t\teDynamicSet(eFeature, newValue);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(";
  protected final String TEXT_1056 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1057 = NL + "\t\t\tcase ";
  protected final String TEXT_1058 = ":";
  protected final String TEXT_1059 = NL + "\t\t\t\t((";
  protected final String TEXT_1060 = ")";
  protected final String TEXT_1061 = "()).featureMap().clear();";
  protected final String TEXT_1062 = NL + "\t\t\t\t";
  protected final String TEXT_1063 = "().clear();";
  protected final String TEXT_1064 = NL + "\t\t\t\tunset";
  protected final String TEXT_1065 = "();";
  protected final String TEXT_1066 = NL + "\t\t\t\tset";
  protected final String TEXT_1067 = "((";
  protected final String TEXT_1068 = ")null);";
  protected final String TEXT_1069 = NL + "\t\t\t\tset";
  protected final String TEXT_1070 = "(";
  protected final String TEXT_1071 = "_EDEFAULT);";
  protected final String TEXT_1072 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1073 = NL + "\t\t}" + NL + "\t\teDynamicUnset(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1074 = NL;
  protected final String TEXT_1075 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(";
  protected final String TEXT_1076 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1077 = NL + "\t\t\tcase ";
  protected final String TEXT_1078 = ":";
  protected final String TEXT_1079 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1080 = "();";
  protected final String TEXT_1081 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1082 = ")";
  protected final String TEXT_1083 = "()).featureMap().isEmpty();";
  protected final String TEXT_1084 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1085 = " != null && !";
  protected final String TEXT_1086 = ".featureMap().isEmpty();";
  protected final String TEXT_1087 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1088 = " != null && !";
  protected final String TEXT_1089 = ".isEmpty();";
  protected final String TEXT_1090 = NL + "\t\t\t\t";
  protected final String TEXT_1091 = " ";
  protected final String TEXT_1092 = " = (";
  protected final String TEXT_1093 = ")eVirtualGet(";
  protected final String TEXT_1094 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1095 = " != null && !";
  protected final String TEXT_1096 = ".isEmpty();";
  protected final String TEXT_1097 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1098 = "().isEmpty();";
  protected final String TEXT_1099 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1100 = "();";
  protected final String TEXT_1101 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1102 = " != null;";
  protected final String TEXT_1103 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1104 = ") != null;";
  protected final String TEXT_1105 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1106 = "() != null;";
  protected final String TEXT_1107 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1108 = " != null;";
  protected final String TEXT_1109 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1110 = ") != null;";
  protected final String TEXT_1111 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1112 = "() != null;";
  protected final String TEXT_1113 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1114 = " & ";
  protected final String TEXT_1115 = "_EFLAG) != 0) != ";
  protected final String TEXT_1116 = "_EDEFAULT;";
  protected final String TEXT_1117 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1118 = " != ";
  protected final String TEXT_1119 = "_EDEFAULT;";
  protected final String TEXT_1120 = NL + "\t\t\t\treturn eVirtualIsSet(";
  protected final String TEXT_1121 = ") && eVirtualGet(";
  protected final String TEXT_1122 = ") != ";
  protected final String TEXT_1123 = "_EDEFAULT;";
  protected final String TEXT_1124 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1125 = "() != ";
  protected final String TEXT_1126 = "_EDEFAULT;";
  protected final String TEXT_1127 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1128 = "_EDEFAULT == null ? ";
  protected final String TEXT_1129 = " != null : !";
  protected final String TEXT_1130 = "_EDEFAULT.equals(";
  protected final String TEXT_1131 = ");";
  protected final String TEXT_1132 = NL + "\t\t\t\t";
  protected final String TEXT_1133 = " ";
  protected final String TEXT_1134 = " = eVirtualIsSet(";
  protected final String TEXT_1135 = ") ? (";
  protected final String TEXT_1136 = ")eVirtualGet(";
  protected final String TEXT_1137 = ") : ";
  protected final String TEXT_1138 = "_EDEFAULT;" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1139 = "_EDEFAULT == null ? ";
  protected final String TEXT_1140 = " != null : !";
  protected final String TEXT_1141 = "_EDEFAULT.equals(";
  protected final String TEXT_1142 = ");";
  protected final String TEXT_1143 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1144 = "_EDEFAULT == null ? ";
  protected final String TEXT_1145 = "() != null : !";
  protected final String TEXT_1146 = "_EDEFAULT.equals(";
  protected final String TEXT_1147 = "());";
  protected final String TEXT_1148 = NL + "\t\t}" + NL + "\t\treturn eDynamicIsSet(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1149 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1150 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1151 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1152 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1153 = ": return ";
  protected final String TEXT_1154 = ";";
  protected final String TEXT_1155 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1156 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1157 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1158 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1159 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1160 = ": return ";
  protected final String TEXT_1161 = ";";
  protected final String TEXT_1162 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1163 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1164 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1165 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1166 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1167 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1168 = NL + "\t\t\tcase ";
  protected final String TEXT_1169 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1170 = ";";
  protected final String TEXT_1171 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1172 = NL + "\t\t\tcase ";
  protected final String TEXT_1173 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1174 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1175 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1177 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1178 = ": \");";
  protected final String TEXT_1179 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1180 = ": \");";
  protected final String TEXT_1181 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1182 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1183 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1184 = NL + "\t\tif (";
  protected final String TEXT_1185 = "(";
  protected final String TEXT_1186 = " & ";
  protected final String TEXT_1187 = "_ESETFLAG) != 0";
  protected final String TEXT_1188 = "ESet";
  protected final String TEXT_1189 = ") result.append((";
  protected final String TEXT_1190 = " & ";
  protected final String TEXT_1191 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1192 = NL + "\t\tif (";
  protected final String TEXT_1193 = "(";
  protected final String TEXT_1194 = " & ";
  protected final String TEXT_1195 = "_ESETFLAG) != 0";
  protected final String TEXT_1196 = "ESet";
  protected final String TEXT_1197 = ") result.append(";
  protected final String TEXT_1198 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1199 = NL + "\t\tresult.append(eVirtualIsSet(";
  protected final String TEXT_1200 = ") ? eVirtualGet(";
  protected final String TEXT_1201 = ") : ";
  protected final String TEXT_1202 = "null";
  protected final String TEXT_1203 = "_EDEFAULT";
  protected final String TEXT_1204 = ");";
  protected final String TEXT_1205 = NL + "\t\tresult.append((";
  protected final String TEXT_1206 = " & ";
  protected final String TEXT_1207 = "_EFLAG) != 0);";
  protected final String TEXT_1208 = NL + "\t\tresult.append(";
  protected final String TEXT_1209 = ");";
  protected final String TEXT_1210 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1211 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1212 = NL + "\t\treturn new ";
  protected final String TEXT_1213 = "(getTypedKey());";
  protected final String TEXT_1214 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1215 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1216 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1217 = ")key);";
  protected final String TEXT_1218 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1219 = ")key).";
  protected final String TEXT_1220 = "());";
  protected final String TEXT_1221 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1222 = ")key);";
  protected final String TEXT_1223 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1224 = NL + "\t\treturn new ";
  protected final String TEXT_1225 = "(getTypedValue());";
  protected final String TEXT_1226 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1227 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1228 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1229 = ")value);";
  protected final String TEXT_1230 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1231 = ")value).";
  protected final String TEXT_1232 = "());";
  protected final String TEXT_1233 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1234 = ")value);";
  protected final String TEXT_1235 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1236 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1237 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1238 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1239 = NL;
  protected final String TEXT_1240 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1241 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1242 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1243 = " getCacheAdapter() {" + NL + "\t\tfor (";
  protected final String TEXT_1244 = " i = eAdapters().iterator(); i.hasNext();) {" + NL + "\t\t\t";
  protected final String TEXT_1245 = " adapter = (";
  protected final String TEXT_1246 = ") i.next();" + NL + "\t\t\tif (adapter instanceof ";
  protected final String TEXT_1247 = ") {" + NL + "\t\t\t\treturn (";
  protected final String TEXT_1248 = ") adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1249 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1250 = " basicGet";
  protected final String TEXT_1251 = "()" + NL + "\t{";
  protected final String TEXT_1252 = NL + "\t\tif (isSet";
  protected final String TEXT_1253 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1254 = "basicGet";
  protected final String TEXT_1255 = "();" + NL + "\t\t}";
  protected final String TEXT_1256 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1257 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1258 = "basicGet";
  protected final String TEXT_1259 = "();" + NL + "\t\t}";
  protected final String TEXT_1260 = NL + "\t\t";
  protected final String TEXT_1261 = " ";
  protected final String TEXT_1262 = " = ";
  protected final String TEXT_1263 = "basicGet";
  protected final String TEXT_1264 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1265 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1266 = ";" + NL + "\t\t}";
  protected final String TEXT_1267 = NL + "\t\treturn ";
  protected final String TEXT_1268 = "super.basicGet";
  protected final String TEXT_1269 = "()";
  protected final String TEXT_1270 = "null";
  protected final String TEXT_1271 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1272 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1273 = " ";
  protected final String TEXT_1274 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1275 = " ";
  protected final String TEXT_1276 = " = basicGet";
  protected final String TEXT_1277 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1278 = " == null ? null : (";
  protected final String TEXT_1279 = ")eResolveProxy((";
  protected final String TEXT_1280 = ")";
  protected final String TEXT_1281 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1282 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1283 = " ";
  protected final String TEXT_1284 = "Helper(";
  protected final String TEXT_1285 = " ";
  protected final String TEXT_1286 = ")" + NL + "\t{";
  protected final String TEXT_1287 = NL + "\t\t";
  protected final String TEXT_1288 = ".addAll(super.";
  protected final String TEXT_1289 = "());";
  protected final String TEXT_1290 = NL + "\t\tsuper.";
  protected final String TEXT_1291 = "Helper(";
  protected final String TEXT_1292 = ");";
  protected final String TEXT_1293 = NL + "\t\tif (isSet";
  protected final String TEXT_1294 = "()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1295 = " i = ((";
  protected final String TEXT_1296 = ") ";
  protected final String TEXT_1297 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1298 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1299 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1300 = "())) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1301 = " i = ((";
  protected final String TEXT_1302 = ") ";
  protected final String TEXT_1303 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1304 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1305 = NL + "\t\t";
  protected final String TEXT_1306 = " ";
  protected final String TEXT_1307 = " = ";
  protected final String TEXT_1308 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1309 = ".isEmpty()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1310 = " i = ((";
  protected final String TEXT_1311 = ") ";
  protected final String TEXT_1312 = ").basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1313 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1314 = NL + "\t\tif (isSet";
  protected final String TEXT_1315 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1316 = ".addAll(";
  protected final String TEXT_1317 = "());" + NL + "\t\t}";
  protected final String TEXT_1318 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1319 = "())) {" + NL + "\t\t\t";
  protected final String TEXT_1320 = ".addAll(";
  protected final String TEXT_1321 = "());" + NL + "\t\t}";
  protected final String TEXT_1322 = NL + "\t\t";
  protected final String TEXT_1323 = " ";
  protected final String TEXT_1324 = " = ";
  protected final String TEXT_1325 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1326 = ".isEmpty()) {" + NL + "\t\t\t";
  protected final String TEXT_1327 = ".addAll(";
  protected final String TEXT_1328 = ");" + NL + "\t\t}";
  protected final String TEXT_1329 = NL + "\t\tif (isSet";
  protected final String TEXT_1330 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1331 = ".add(";
  protected final String TEXT_1332 = "basicGet";
  protected final String TEXT_1333 = "());" + NL + "\t\t}";
  protected final String TEXT_1334 = NL + "\t\t";
  protected final String TEXT_1335 = " ";
  protected final String TEXT_1336 = " = ";
  protected final String TEXT_1337 = "basicGet";
  protected final String TEXT_1338 = "();" + NL + "\t\tif (";
  protected final String TEXT_1339 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_1340 = ".add(";
  protected final String TEXT_1341 = ");" + NL + "\t\t}";
  protected final String TEXT_1342 = NL + "\t\treturn ";
  protected final String TEXT_1343 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1344 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1345 = " ";
  protected final String TEXT_1346 = "()" + NL + "\t{";
  protected final String TEXT_1347 = NL + "\t\t";
  protected final String TEXT_1348 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_1349 = NL + "\t\t\ttry {" + NL + "\t\t\t\t";
  protected final String TEXT_1350 = " method = getClass().getMethod(\"";
  protected final String TEXT_1351 = "\", null);";
  protected final String TEXT_1352 = NL + "\t\t\t\t";
  protected final String TEXT_1353 = " ";
  protected final String TEXT_1354 = " = (";
  protected final String TEXT_1355 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_1356 = " == null) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_1357 = " union = ";
  protected final String TEXT_1358 = "Helper(new ";
  protected final String TEXT_1359 = "());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_1360 = " = new ";
  protected final String TEXT_1361 = "(this, ";
  protected final String TEXT_1362 = "null";
  protected final String TEXT_1363 = "()";
  protected final String TEXT_1364 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1365 = ";" + NL + "\t\t\t} catch (";
  protected final String TEXT_1366 = " nsme) {" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_1367 = NL + "\t\t\t";
  protected final String TEXT_1368 = " ";
  protected final String TEXT_1369 = " = (";
  protected final String TEXT_1370 = ") cache.get(eResource(), this, ";
  protected final String TEXT_1371 = "());" + NL + "\t\t\tif (";
  protected final String TEXT_1372 = " == null) {" + NL + "\t\t\t\t";
  protected final String TEXT_1373 = " union = ";
  protected final String TEXT_1374 = "Helper(new ";
  protected final String TEXT_1375 = "());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_1376 = "(), ";
  protected final String TEXT_1377 = " = new ";
  protected final String TEXT_1378 = "(this, ";
  protected final String TEXT_1379 = "null";
  protected final String TEXT_1380 = "()";
  protected final String TEXT_1381 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_1382 = ";";
  protected final String TEXT_1383 = NL + "\t\t}";
  protected final String TEXT_1384 = NL + "\t\t";
  protected final String TEXT_1385 = " union = ";
  protected final String TEXT_1386 = "Helper(new ";
  protected final String TEXT_1387 = "());" + NL + "\t\treturn new ";
  protected final String TEXT_1388 = "(this, ";
  protected final String TEXT_1389 = "null";
  protected final String TEXT_1390 = "()";
  protected final String TEXT_1391 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_1392 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1393 = " ";
  protected final String TEXT_1394 = "()" + NL + "\t{";
  protected final String TEXT_1395 = NL + "\t\tif (isSet";
  protected final String TEXT_1396 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1397 = "();" + NL + "\t\t}";
  protected final String TEXT_1398 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1399 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1400 = "();" + NL + "\t\t}";
  protected final String TEXT_1401 = NL + "\t\t";
  protected final String TEXT_1402 = " ";
  protected final String TEXT_1403 = " = ";
  protected final String TEXT_1404 = "();" + NL + "\t\tif (";
  protected final String TEXT_1405 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1406 = ";" + NL + "\t\t}";
  protected final String TEXT_1407 = NL + "\t\treturn ";
  protected final String TEXT_1408 = "super.";
  protected final String TEXT_1409 = "()";
  protected final String TEXT_1410 = "null";
  protected final String TEXT_1411 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1412 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1413 = "()" + NL + "\t{";
  protected final String TEXT_1414 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1415 = "()";
  protected final String TEXT_1416 = NL + "\t\treturn isSet";
  protected final String TEXT_1417 = "()";
  protected final String TEXT_1418 = ";";
  protected final String TEXT_1419 = NL + "\t\treturn !";
  protected final String TEXT_1420 = "().isEmpty()";
  protected final String TEXT_1421 = ";";
  protected final String TEXT_1422 = NL + "\t\treturn ";
  protected final String TEXT_1423 = "basicGet";
  protected final String TEXT_1424 = "() != null";
  protected final String TEXT_1425 = ";";
  protected final String TEXT_1426 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1427 = "())";
  protected final String TEXT_1428 = ";";
  protected final String TEXT_1429 = NL + "\t\t\t|| isSet";
  protected final String TEXT_1430 = "()";
  protected final String TEXT_1431 = ";";
  protected final String TEXT_1432 = NL + "\t\t\t|| !";
  protected final String TEXT_1433 = "().isEmpty()";
  protected final String TEXT_1434 = ";";
  protected final String TEXT_1435 = NL + "\t\t\t|| ";
  protected final String TEXT_1436 = "basicGet";
  protected final String TEXT_1437 = "() != null";
  protected final String TEXT_1438 = ";";
  protected final String TEXT_1439 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_1440 = "())";
  protected final String TEXT_1441 = ";";
  protected final String TEXT_1442 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1443 = "();";
  protected final String TEXT_1444 = NL + "\t\treturn false;";
  protected final String TEXT_1445 = NL + "\t}" + NL;
  protected final String TEXT_1446 = NL;
  protected final String TEXT_1447 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1448 = " create";
  protected final String TEXT_1449 = "(";
  protected final String TEXT_1450 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1451 = " new";
  protected final String TEXT_1452 = " = (";
  protected final String TEXT_1453 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1454 = NL + "\t\t";
  protected final String TEXT_1455 = "().add(new";
  protected final String TEXT_1456 = ");";
  protected final String TEXT_1457 = NL + "\t\tset";
  protected final String TEXT_1458 = "(new";
  protected final String TEXT_1459 = ");";
  protected final String TEXT_1460 = NL + "\t\treturn new";
  protected final String TEXT_1461 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1462 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1463 = " create";
  protected final String TEXT_1464 = "() {" + NL + "\t\t";
  protected final String TEXT_1465 = " new";
  protected final String TEXT_1466 = " = ";
  protected final String TEXT_1467 = ".eINSTANCE.create";
  protected final String TEXT_1468 = "();";
  protected final String TEXT_1469 = NL + "\t\t";
  protected final String TEXT_1470 = "().add(new";
  protected final String TEXT_1471 = ");";
  protected final String TEXT_1472 = NL + "\t\tset";
  protected final String TEXT_1473 = "(new";
  protected final String TEXT_1474 = ");";
  protected final String TEXT_1475 = NL + "\t\treturn new";
  protected final String TEXT_1476 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1477 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1478 = " get";
  protected final String TEXT_1479 = "(";
  protected final String TEXT_1480 = " ";
  protected final String TEXT_1481 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1482 = " i = ";
  protected final String TEXT_1483 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1484 = " ";
  protected final String TEXT_1485 = " = (";
  protected final String TEXT_1486 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1487 = ".equals(";
  protected final String TEXT_1488 = ".";
  protected final String TEXT_1489 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1490 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1491 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1492 = "()" + NL + "\t{";
  protected final String TEXT_1493 = NL + "  \t\treturn false;";
  protected final String TEXT_1494 = NL + "\t\treturn !((";
  protected final String TEXT_1495 = ")";
  protected final String TEXT_1496 = "()).featureMap().isEmpty();";
  protected final String TEXT_1497 = NL + "\t\treturn ";
  protected final String TEXT_1498 = " != null && !";
  protected final String TEXT_1499 = ".featureMap().isEmpty();";
  protected final String TEXT_1500 = NL + "\t\treturn ";
  protected final String TEXT_1501 = " != null && !";
  protected final String TEXT_1502 = ".isEmpty();";
  protected final String TEXT_1503 = NL + "\t\t";
  protected final String TEXT_1504 = " ";
  protected final String TEXT_1505 = " = (";
  protected final String TEXT_1506 = ")eVirtualGet(";
  protected final String TEXT_1507 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1508 = " != null && !";
  protected final String TEXT_1509 = ".isEmpty();";
  protected final String TEXT_1510 = NL + "\t\treturn !";
  protected final String TEXT_1511 = "().isEmpty();";
  protected final String TEXT_1512 = NL + "\t\treturn ";
  protected final String TEXT_1513 = " != null;";
  protected final String TEXT_1514 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1515 = ") != null;";
  protected final String TEXT_1516 = NL + "\t\treturn basicGet";
  protected final String TEXT_1517 = "() != null;";
  protected final String TEXT_1518 = NL + "\t\treturn ";
  protected final String TEXT_1519 = " != null;";
  protected final String TEXT_1520 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1521 = ") != null;";
  protected final String TEXT_1522 = NL + "\t\treturn ";
  protected final String TEXT_1523 = "() != null;";
  protected final String TEXT_1524 = NL + "\t\treturn ((";
  protected final String TEXT_1525 = " & ";
  protected final String TEXT_1526 = "_EFLAG) != 0) != ";
  protected final String TEXT_1527 = "_EDEFAULT;";
  protected final String TEXT_1528 = NL + "\t\treturn ";
  protected final String TEXT_1529 = " != ";
  protected final String TEXT_1530 = "_EDEFAULT;";
  protected final String TEXT_1531 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1532 = ") && eVirtualGet(";
  protected final String TEXT_1533 = ") != ";
  protected final String TEXT_1534 = "_EDEFAULT;";
  protected final String TEXT_1535 = NL + "\t\treturn ";
  protected final String TEXT_1536 = "() != ";
  protected final String TEXT_1537 = "_EDEFAULT;";
  protected final String TEXT_1538 = NL + "\t\treturn ";
  protected final String TEXT_1539 = "_EDEFAULT == null ? ";
  protected final String TEXT_1540 = " != null : !";
  protected final String TEXT_1541 = "_EDEFAULT.equals(";
  protected final String TEXT_1542 = ");";
  protected final String TEXT_1543 = NL + "\t\t";
  protected final String TEXT_1544 = " ";
  protected final String TEXT_1545 = " = eVirtualIsSet(";
  protected final String TEXT_1546 = ") ? (";
  protected final String TEXT_1547 = ")eVirtualGet(";
  protected final String TEXT_1548 = ") : ";
  protected final String TEXT_1549 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_1550 = "_EDEFAULT == null ? ";
  protected final String TEXT_1551 = " != null : !";
  protected final String TEXT_1552 = "_EDEFAULT.equals(";
  protected final String TEXT_1553 = ");";
  protected final String TEXT_1554 = NL + "\t\treturn ";
  protected final String TEXT_1555 = "_EDEFAULT == null ? ";
  protected final String TEXT_1556 = "() != null : !";
  protected final String TEXT_1557 = "_EDEFAULT.equals(";
  protected final String TEXT_1558 = "());";
  protected final String TEXT_1559 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1560 = ".eINSTANCE.get";
  protected final String TEXT_1561 = "());";
  protected final String TEXT_1562 = NL + "\t\t";
  protected final String TEXT_1563 = " ";
  protected final String TEXT_1564 = " = (";
  protected final String TEXT_1565 = ")eVirtualGet(";
  protected final String TEXT_1566 = ");";
  protected final String TEXT_1567 = NL + "\t\treturn ";
  protected final String TEXT_1568 = " != null && ((";
  protected final String TEXT_1569 = ".Unsettable)";
  protected final String TEXT_1570 = ").isSet();";
  protected final String TEXT_1571 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1572 = ");";
  protected final String TEXT_1573 = NL + "\t\treturn (";
  protected final String TEXT_1574 = " & ";
  protected final String TEXT_1575 = "_ESETFLAG) != 0;";
  protected final String TEXT_1576 = NL + "\t\treturn ";
  protected final String TEXT_1577 = "ESet;";
  protected final String TEXT_1578 = NL + "\t\treturn !((";
  protected final String TEXT_1579 = ".Internal)((";
  protected final String TEXT_1580 = ")get";
  protected final String TEXT_1581 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1582 = "());";
  protected final String TEXT_1583 = NL + "\t\treturn !((";
  protected final String TEXT_1584 = ".Internal)get";
  protected final String TEXT_1585 = "()).isEmpty(";
  protected final String TEXT_1586 = "());";
  protected final String TEXT_1587 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1588 = "' ";
  protected final String TEXT_1589 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1590 = NL + "\t}" + NL;
  protected final String TEXT_1591 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1592 = " ";
  protected final String TEXT_1593 = "()" + NL + "\t{";
  protected final String TEXT_1594 = NL + "\t\treturn ";
  protected final String TEXT_1595 = "();";
  protected final String TEXT_1596 = NL + "\t\treturn new ";
  protected final String TEXT_1597 = ".UnmodifiableEList(this, ";
  protected final String TEXT_1598 = "null";
  protected final String TEXT_1599 = "()";
  protected final String TEXT_1600 = ", 0, ";
  protected final String TEXT_1601 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_1602 = NL + "\t\treturn null;";
  protected final String TEXT_1603 = NL + "\t\treturn ";
  protected final String TEXT_1604 = "();";
  protected final String TEXT_1605 = NL + "\t}" + NL;
  protected final String TEXT_1606 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1607 = " basicGet";
  protected final String TEXT_1608 = "()" + NL + "\t{";
  protected final String TEXT_1609 = NL + "\t\treturn null;";
  protected final String TEXT_1610 = NL + "\t\treturn ";
  protected final String TEXT_1611 = "basicGet";
  protected final String TEXT_1612 = "();";
  protected final String TEXT_1613 = NL + "\t}" + NL;
  protected final String TEXT_1614 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1615 = " basicSet";
  protected final String TEXT_1616 = "(";
  protected final String TEXT_1617 = " new";
  protected final String TEXT_1618 = ", ";
  protected final String TEXT_1619 = " msgs)" + NL + "\t{";
  protected final String TEXT_1620 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1621 = NL + "\t\tif (new";
  protected final String TEXT_1622 = " != null && !(new";
  protected final String TEXT_1623 = " instanceof ";
  protected final String TEXT_1624 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1625 = "));" + NL + "\t\t}";
  protected final String TEXT_1626 = NL + "\t\treturn basicSet";
  protected final String TEXT_1627 = "(";
  protected final String TEXT_1628 = "(";
  protected final String TEXT_1629 = ") ";
  protected final String TEXT_1630 = "new";
  protected final String TEXT_1631 = ", msgs);";
  protected final String TEXT_1632 = NL + "\t\tset";
  protected final String TEXT_1633 = "(";
  protected final String TEXT_1634 = "(";
  protected final String TEXT_1635 = ") ";
  protected final String TEXT_1636 = "new";
  protected final String TEXT_1637 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1638 = NL + "\t}" + NL;
  protected final String TEXT_1639 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1640 = "(";
  protected final String TEXT_1641 = " new";
  protected final String TEXT_1642 = ")" + NL + "\t{";
  protected final String TEXT_1643 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1644 = NL + "\t\tif (new";
  protected final String TEXT_1645 = " != null && !(new";
  protected final String TEXT_1646 = " instanceof ";
  protected final String TEXT_1647 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1648 = "));" + NL + "\t\t}";
  protected final String TEXT_1649 = NL + "\t\tset";
  protected final String TEXT_1650 = "(";
  protected final String TEXT_1651 = "(";
  protected final String TEXT_1652 = ") ";
  protected final String TEXT_1653 = "new";
  protected final String TEXT_1654 = ");";
  protected final String TEXT_1655 = NL + "\t}" + NL;
  protected final String TEXT_1656 = NL;
  protected final String TEXT_1657 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1658 = " create";
  protected final String TEXT_1659 = "(";
  protected final String TEXT_1660 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1661 = " new";
  protected final String TEXT_1662 = " = (";
  protected final String TEXT_1663 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1664 = NL + "\t\t";
  protected final String TEXT_1665 = "().add(new";
  protected final String TEXT_1666 = ");";
  protected final String TEXT_1667 = NL + "\t\tset";
  protected final String TEXT_1668 = "(new";
  protected final String TEXT_1669 = ");";
  protected final String TEXT_1670 = NL + "\t\treturn new";
  protected final String TEXT_1671 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1672 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1673 = " create";
  protected final String TEXT_1674 = "() {" + NL + "\t\t";
  protected final String TEXT_1675 = " new";
  protected final String TEXT_1676 = " = ";
  protected final String TEXT_1677 = ".eINSTANCE.create";
  protected final String TEXT_1678 = "();";
  protected final String TEXT_1679 = NL + "\t\t";
  protected final String TEXT_1680 = "().add(new";
  protected final String TEXT_1681 = ");";
  protected final String TEXT_1682 = NL + "\t\tset";
  protected final String TEXT_1683 = "(new";
  protected final String TEXT_1684 = ");";
  protected final String TEXT_1685 = NL + "\t\treturn new";
  protected final String TEXT_1686 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1687 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1688 = " get";
  protected final String TEXT_1689 = "(";
  protected final String TEXT_1690 = " ";
  protected final String TEXT_1691 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1692 = " i = ";
  protected final String TEXT_1693 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1694 = " ";
  protected final String TEXT_1695 = " = (";
  protected final String TEXT_1696 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1697 = ".equals(";
  protected final String TEXT_1698 = ".";
  protected final String TEXT_1699 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1700 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1701 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1702 = "()" + NL + "\t{";
  protected final String TEXT_1703 = NL + "  \t\treturn false;";
  protected final String TEXT_1704 = NL + "\t\treturn !((";
  protected final String TEXT_1705 = ")";
  protected final String TEXT_1706 = "()).featureMap().isEmpty();";
  protected final String TEXT_1707 = NL + "\t\treturn ";
  protected final String TEXT_1708 = " != null && !";
  protected final String TEXT_1709 = ".featureMap().isEmpty();";
  protected final String TEXT_1710 = NL + "\t\treturn ";
  protected final String TEXT_1711 = " != null && !";
  protected final String TEXT_1712 = ".isEmpty();";
  protected final String TEXT_1713 = NL + "\t\t";
  protected final String TEXT_1714 = " ";
  protected final String TEXT_1715 = " = (";
  protected final String TEXT_1716 = ")eVirtualGet(";
  protected final String TEXT_1717 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1718 = " != null && !";
  protected final String TEXT_1719 = ".isEmpty();";
  protected final String TEXT_1720 = NL + "\t\treturn !";
  protected final String TEXT_1721 = "().isEmpty();";
  protected final String TEXT_1722 = NL + "\t\treturn ";
  protected final String TEXT_1723 = " != null;";
  protected final String TEXT_1724 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1725 = ") != null;";
  protected final String TEXT_1726 = NL + "\t\treturn basicGet";
  protected final String TEXT_1727 = "() != null;";
  protected final String TEXT_1728 = NL + "\t\treturn ";
  protected final String TEXT_1729 = " != null;";
  protected final String TEXT_1730 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1731 = ") != null;";
  protected final String TEXT_1732 = NL + "\t\treturn ";
  protected final String TEXT_1733 = "() != null;";
  protected final String TEXT_1734 = NL + "\t\treturn ((";
  protected final String TEXT_1735 = " & ";
  protected final String TEXT_1736 = "_EFLAG) != 0) != ";
  protected final String TEXT_1737 = "_EDEFAULT;";
  protected final String TEXT_1738 = NL + "\t\treturn ";
  protected final String TEXT_1739 = " != ";
  protected final String TEXT_1740 = "_EDEFAULT;";
  protected final String TEXT_1741 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1742 = ") && eVirtualGet(";
  protected final String TEXT_1743 = ") != ";
  protected final String TEXT_1744 = "_EDEFAULT;";
  protected final String TEXT_1745 = NL + "\t\treturn ";
  protected final String TEXT_1746 = "() != ";
  protected final String TEXT_1747 = "_EDEFAULT;";
  protected final String TEXT_1748 = NL + "\t\treturn ";
  protected final String TEXT_1749 = "_EDEFAULT == null ? ";
  protected final String TEXT_1750 = " != null : !";
  protected final String TEXT_1751 = "_EDEFAULT.equals(";
  protected final String TEXT_1752 = ");";
  protected final String TEXT_1753 = NL + "\t\t";
  protected final String TEXT_1754 = " ";
  protected final String TEXT_1755 = " = eVirtualIsSet(";
  protected final String TEXT_1756 = ") ? (";
  protected final String TEXT_1757 = ")eVirtualGet(";
  protected final String TEXT_1758 = ") : ";
  protected final String TEXT_1759 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_1760 = "_EDEFAULT == null ? ";
  protected final String TEXT_1761 = " != null : !";
  protected final String TEXT_1762 = "_EDEFAULT.equals(";
  protected final String TEXT_1763 = ");";
  protected final String TEXT_1764 = NL + "\t\treturn ";
  protected final String TEXT_1765 = "_EDEFAULT == null ? ";
  protected final String TEXT_1766 = "() != null : !";
  protected final String TEXT_1767 = "_EDEFAULT.equals(";
  protected final String TEXT_1768 = "());";
  protected final String TEXT_1769 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1770 = ".eINSTANCE.get";
  protected final String TEXT_1771 = "());";
  protected final String TEXT_1772 = NL + "\t\t";
  protected final String TEXT_1773 = " ";
  protected final String TEXT_1774 = " = (";
  protected final String TEXT_1775 = ")eVirtualGet(";
  protected final String TEXT_1776 = ");";
  protected final String TEXT_1777 = NL + "\t\treturn ";
  protected final String TEXT_1778 = " != null && ((";
  protected final String TEXT_1779 = ".Unsettable)";
  protected final String TEXT_1780 = ").isSet();";
  protected final String TEXT_1781 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1782 = ");";
  protected final String TEXT_1783 = NL + "\t\treturn (";
  protected final String TEXT_1784 = " & ";
  protected final String TEXT_1785 = "_ESETFLAG) != 0;";
  protected final String TEXT_1786 = NL + "\t\treturn ";
  protected final String TEXT_1787 = "ESet;";
  protected final String TEXT_1788 = NL + "\t\treturn !((";
  protected final String TEXT_1789 = ".Internal)((";
  protected final String TEXT_1790 = ")get";
  protected final String TEXT_1791 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1792 = "());";
  protected final String TEXT_1793 = NL + "\t\treturn !((";
  protected final String TEXT_1794 = ".Internal)get";
  protected final String TEXT_1795 = "()).isEmpty(";
  protected final String TEXT_1796 = "());";
  protected final String TEXT_1797 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1798 = "' ";
  protected final String TEXT_1799 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1800 = NL + "\t}" + NL;
  protected final String TEXT_1801 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1802 = " ";
  protected final String TEXT_1803 = "(";
  protected final String TEXT_1804 = ")";
  protected final String TEXT_1805 = NL + "\t{";
  protected final String TEXT_1806 = NL + "\t\t";
  protected final String TEXT_1807 = "(";
  protected final String TEXT_1808 = ");";
  protected final String TEXT_1809 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1810 = NL + "\t\treturn ";
  protected final String TEXT_1811 = "(";
  protected final String TEXT_1812 = ");";
  protected final String TEXT_1813 = NL + "\t}" + NL;
  protected final String TEXT_1814 = NL + "} //";
  protected final String TEXT_1815 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2005 IBM Corporation and others.
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
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_6);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_8);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_9);
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    stringBuffer.append(TEXT_18);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_22);
    }
    if (genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_26);
    }
    if (genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_28);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (Iterator i = eVirtualIndexBitFields.iterator(); i.hasNext();) { String eVirtualIndexBitField = (String)i.next();
    stringBuffer.append(TEXT_29);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_30);
    }
    }
    }
    }
    if (genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_32);
    }
    if (!genModel.isReflectiveDelegation()) {
    for (Iterator i=genClass.getDeclaredFieldGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_39);
    }
    } else {
    if (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable())) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    stringBuffer.append(TEXT_48);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_50);
    }
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_57);
    } else {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_65);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_67);
    }
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_72);
    } else {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_76);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_78);
    for (Iterator i=genClass.getFlagGenFeatures("true").iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_81);
    }
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_85);
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_88);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_89);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_94);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_96);
    }
    stringBuffer.append(TEXT_97);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_104);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_108);
    } else {
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_111);
    }
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_113);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_116);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_121);
    }
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_133);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_136);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_142);
    }
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_145);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isReferenceType() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_149);
    } else {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    }
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_161);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap$Internal"));
    stringBuffer.append(TEXT_164);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_167);
    } else {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_172);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_176);
    } else {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_180);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_181);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_182);
    }
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_187);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_189);
    }
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_191);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_196);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(TEXT_199);
    }
    }
    } else {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_202);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_203);
    //Class/getGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_206);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_209);
    } else {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_211);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_216);
    } else {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_218);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_220);
    }
    } else {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_223);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_224);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_230);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_231);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_237);
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_241);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_247);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_249);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_255);
    } else {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_259);
    }
    }
    stringBuffer.append(TEXT_260);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_265);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_269);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_270);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_272);
    }
    stringBuffer.append(TEXT_273);
    } else {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_278);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_283);
    }
    stringBuffer.append(TEXT_284);
    stringBuffer.append(TEXT_285);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_287);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_290);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_294);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_296);
    }
    }
    stringBuffer.append(TEXT_297);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_303);
    } else {
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_305);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_308);
    }
    } else {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_311);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_312);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(TEXT_317);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_328);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_331);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_334);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_336);
    }
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_338);
    }
    stringBuffer.append(TEXT_339);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_353);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_372);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_380);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_389);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_394);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_395);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_398);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_404);
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_415);
    } else {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_421);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_431);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_435);
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_441);
    } else {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_446);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_451);
    } else {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_455);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_459);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_461);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_467);
    } else {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_471);
    }
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_475);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_476);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_477);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_478);
    }
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_481);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_483);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_484);
    } else {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_486);
    }
    stringBuffer.append(TEXT_487);
    } else {
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_491);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_493);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_494);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_495);
    }
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_498);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_500);
    }
    }
    stringBuffer.append(TEXT_501);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_506);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_510);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_512);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_514);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_517);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_519);
    }
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_521);
    }
    stringBuffer.append(TEXT_522);
    } else {
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_524);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_526);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_530);
    }
    stringBuffer.append(TEXT_531);
    }
    } else {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_534);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_535);
    //Class/setGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_539);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_542);
    } else {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_547);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_549);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_555);
    } else {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_559);
    }
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_564);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_566);
    } else {
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_568);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_569);
    } else {
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_571);
    }
    stringBuffer.append(TEXT_572);
    } else {
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_575);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_576);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset()) {
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_578);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_581);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_584);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_589);
    }
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_592);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_596);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_601);
    }
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_603);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_606);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_612);
    } else {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_621);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_626);
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_629);
    } else {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_633);
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_635);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_639);
    } else {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_642);
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_644);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_647);
    } else {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_649);
    }
    }
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_653);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_655);
    } else {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_657);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_658);
    } else {
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    }
    stringBuffer.append(TEXT_661);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_667);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_670);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_673);
    } else {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_675);
    }
    }
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_679);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_682);
    } else {
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_685);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_686);
    } else {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_688);
    }
    stringBuffer.append(TEXT_689);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_694);
    } else {
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_696);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_698);
    }
    } else {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_701);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_702);
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet()) {
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_704);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_707);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_712);
    }
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_716);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_718);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_721);
    } else {
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_723);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_725);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_726);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_728);
    } else {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_732);
    }
    } else {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_735);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_736);
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_737);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_738);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_744);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_747);
    } else {
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_752);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_753);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_759);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    } else {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_765);
    }
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_767);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_768);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_781);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_783);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_784);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_787);
    } else {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_790);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_793);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_800);
    } else {
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_802);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_804);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_806);
    } else {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_808);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_810);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_812);
    } else {
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_814);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_818);
    } else {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_821);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_825);
    } else {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_828);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_833);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_844);
    } else {
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_849);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_852);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_857);
    }
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_861);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_863);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_866);
    } else {
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_868);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_870);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_873);
    } else {
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_875);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_877);
    }
    } else {
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_880);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_881);
    }
    //Class/implementedGenFeature.override.javajetinc
    }//for
    for (Iterator i=genClass.getImplementedGenOperations().iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_882);
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_887);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_891);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_892);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_893);
    } else {
    stringBuffer.append(TEXT_894);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_895);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_898);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_900);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_904);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_906);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (!genOperation.isVoid() && UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_910);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_911);
    }
    stringBuffer.append(TEXT_912);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_915);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_916);
    }
    stringBuffer.append(TEXT_917);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_919);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_920);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_922);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_924);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_926);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_927);
    }
    stringBuffer.append(TEXT_928);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_930);
    }
    stringBuffer.append(TEXT_931);
    }
    stringBuffer.append(TEXT_932);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_934);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_936);
    } else {
    stringBuffer.append(TEXT_937);
    }
    }
    stringBuffer.append(TEXT_938);
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_942);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_944);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_948);
    } else {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_951);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_953);
    } else {
    if (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation()) {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_958);
    }
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_960);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_964);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_968);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_969);
    }
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_972);
    }
    }
    stringBuffer.append(TEXT_973);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_977);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_979);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_983);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_987);
    } else {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_990);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_992);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_994);
    } else {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_996);
    }
    }
    stringBuffer.append(TEXT_997);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1000);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1004);
    }
    stringBuffer.append(TEXT_1005);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1007);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1009);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1011);
    } else {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1014);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1017);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1020);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1023);
    } else {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1025);
    }
    }
    stringBuffer.append(TEXT_1026);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1028);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1030);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1033);
    } else {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1035);
    }
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1039);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1043);
    } else {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1046);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1050);
    } else {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1053);
    }
    stringBuffer.append(TEXT_1054);
    }
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1056);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1058);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1061);
    } else {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1063);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1065);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1068);
    } else {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1071);
    }
    stringBuffer.append(TEXT_1072);
    }
    stringBuffer.append(TEXT_1073);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1076);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1078);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1080);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1083);
    } else {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1086);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1089);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1096);
    } else {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1098);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1100);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1102);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1104);
    } else {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1106);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1108);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1110);
    } else {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1112);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1116);
    } else {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1119);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1123);
    } else {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1126);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1131);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1142);
    } else {
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1147);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1148);
    //Class/eIsSet.override.javajetinc
    }
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1149);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1151);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1154);
    }
    stringBuffer.append(TEXT_1155);
    }
    stringBuffer.append(TEXT_1156);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1158);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1161);
    }
    stringBuffer.append(TEXT_1162);
    }
    stringBuffer.append(TEXT_1163);
    }
    if (genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1166);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1167);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1170);
    }
    stringBuffer.append(TEXT_1171);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1174);
    }
    stringBuffer.append(TEXT_1175);
    }
    }
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1176);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1184);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1187);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1188);
    }
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1192);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1195);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1196);
    }
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1201);
    if (genFeature.isListType() || genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1202);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1203);
    }
    stringBuffer.append(TEXT_1204);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1207);
    } else {
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1209);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1210);
    }
    if (genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1211);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1213);
    } else {
    stringBuffer.append(TEXT_1214);
    }
    stringBuffer.append(TEXT_1215);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1217);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1220);
    } else {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1222);
    }
    stringBuffer.append(TEXT_1223);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1225);
    } else {
    stringBuffer.append(TEXT_1226);
    }
    stringBuffer.append(TEXT_1227);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1229);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1232);
    } else {
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1234);
    }
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1238);
    }
    stringBuffer.append(TEXT_1239);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1248);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1251);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1253);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1255);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1257);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1259);
    } else {
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1262);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1266);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1267);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1269);
    } else {
    stringBuffer.append(TEXT_1270);
    }
    stringBuffer.append(TEXT_1271);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1281);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1286);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1289);
    } else {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1292);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1298);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1304);
    } else {
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1313);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1317);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1321);
    } else {
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1328);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1331);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1333);
    } else {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1336);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1341);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1343);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1346);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1348);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1361);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1362);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1363);
    }
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_1366);
    } else {
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1378);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1379);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1380);
    }
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1382);
    }
    stringBuffer.append(TEXT_1383);
    }
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1388);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1389);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1390);
    }
    stringBuffer.append(TEXT_1391);
    }
    }
    } else {
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1394);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1397);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1400);
    } else {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1406);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1407);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1409);
    } else {
    stringBuffer.append(TEXT_1410);
    }
    stringBuffer.append(TEXT_1411);
    }
    }
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1413);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1415);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1417);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1418);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1420);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1421);
    }
    } else {
    stringBuffer.append(TEXT_1422);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1424);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1425);
    }
    }
    } else {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1427);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1428);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1430);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1431);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1433);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1434);
    }
    } else {
    stringBuffer.append(TEXT_1435);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1437);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1438);
    }
    }
    } else {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1440);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1441);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1443);
    } else {
    stringBuffer.append(TEXT_1444);
    }
    }
    stringBuffer.append(TEXT_1445);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1446);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1453);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1456);
    } else {
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1459);
    }
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1461);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1468);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1471);
    } else {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1474);
    }
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1476);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1490);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1492);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1493);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1496);
    } else {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1499);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1502);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1509);
    } else {
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1511);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1513);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1515);
    } else {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1517);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1519);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1521);
    } else {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1523);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1527);
    } else {
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1530);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1534);
    } else {
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1537);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1542);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1553);
    } else {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1558);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1561);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1566);
    }
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1570);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1572);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1575);
    } else {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1577);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1582);
    } else {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1586);
    }
    } else {
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1589);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1590);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1593);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1595);
    } else {
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_1597);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1598);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1599);
    }
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_1601);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1602);
    } else {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1604);
    }
    }
    stringBuffer.append(TEXT_1605);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1608);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1609);
    } else {
    stringBuffer.append(TEXT_1610);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1612);
    }
    stringBuffer.append(TEXT_1613);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1619);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1620);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1625);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1627);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1629);
    }
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1631);
    } else {
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1633);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1635);
    }
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1637);
    }
    }
    stringBuffer.append(TEXT_1638);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1642);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1643);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1648);
    }
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1650);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1652);
    }
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1654);
    }
    stringBuffer.append(TEXT_1655);
    }
    stringBuffer.append(TEXT_1656);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1663);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1666);
    } else {
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1669);
    }
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1671);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1678);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1681);
    } else {
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1684);
    }
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1686);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1700);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1702);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1703);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1706);
    } else {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1709);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1712);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1719);
    } else {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1721);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1723);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1725);
    } else {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1727);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1729);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1731);
    } else {
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1733);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1737);
    } else {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1740);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1744);
    } else {
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1747);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1752);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1763);
    } else {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1768);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1771);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1776);
    }
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1780);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1782);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1785);
    } else {
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1787);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1792);
    } else {
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1796);
    }
    } else {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1799);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1800);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1805);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1808);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_1809);
    } else {
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1812);
    }
    }
    stringBuffer.append(TEXT_1813);
    }
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genClass.getClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1815);
    return stringBuffer.toString();
  }
}
