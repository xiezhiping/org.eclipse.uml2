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
  protected final String TEXT_200 = NL;
  protected final String TEXT_201 = NL + "\t\t";
  protected final String TEXT_202 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_203 = " result = (";
  protected final String TEXT_204 = ") cache.get(";
  protected final String TEXT_205 = "eResource(), ";
  protected final String TEXT_206 = "this, ";
  protected final String TEXT_207 = "());" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_208 = "eResource(), ";
  protected final String TEXT_209 = "this, ";
  protected final String TEXT_210 = "(), result = ";
  protected final String TEXT_211 = "new ";
  protected final String TEXT_212 = "(";
  protected final String TEXT_213 = ".";
  protected final String TEXT_214 = "(this";
  protected final String TEXT_215 = ", ";
  protected final String TEXT_216 = ")";
  protected final String TEXT_217 = ")";
  protected final String TEXT_218 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_219 = ".";
  protected final String TEXT_220 = "()";
  protected final String TEXT_221 = ";" + NL + "\t\t}";
  protected final String TEXT_222 = NL + "\t\treturn ";
  protected final String TEXT_223 = ".";
  protected final String TEXT_224 = "(this";
  protected final String TEXT_225 = ", ";
  protected final String TEXT_226 = ");";
  protected final String TEXT_227 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_228 = "' ";
  protected final String TEXT_229 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_230 = NL + "\t}" + NL;
  protected final String TEXT_231 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_232 = " basicGet";
  protected final String TEXT_233 = "()" + NL + "\t{";
  protected final String TEXT_234 = NL + "\t\treturn (";
  protected final String TEXT_235 = ")eVirtualGet(";
  protected final String TEXT_236 = ");";
  protected final String TEXT_237 = NL + "\t\treturn ";
  protected final String TEXT_238 = ";";
  protected final String TEXT_239 = NL + "\t\treturn (";
  protected final String TEXT_240 = ")((";
  protected final String TEXT_241 = ")get";
  protected final String TEXT_242 = "()).featureMap().get(";
  protected final String TEXT_243 = "(), false);";
  protected final String TEXT_244 = NL + "\t\treturn (";
  protected final String TEXT_245 = ")get";
  protected final String TEXT_246 = "().get(";
  protected final String TEXT_247 = "(), false);";
  protected final String TEXT_248 = NL;
  protected final String TEXT_249 = NL + "\t\treturn ";
  protected final String TEXT_250 = ".";
  protected final String TEXT_251 = "(this";
  protected final String TEXT_252 = ", ";
  protected final String TEXT_253 = ");";
  protected final String TEXT_254 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_255 = "' ";
  protected final String TEXT_256 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_257 = NL + "\t}" + NL;
  protected final String TEXT_258 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_259 = " basicSet";
  protected final String TEXT_260 = "(";
  protected final String TEXT_261 = " new";
  protected final String TEXT_262 = ", ";
  protected final String TEXT_263 = " msgs)" + NL + "\t{";
  protected final String TEXT_264 = NL;
  protected final String TEXT_265 = NL + "\t\tif (new";
  protected final String TEXT_266 = " != null && !";
  protected final String TEXT_267 = "().contains(new";
  protected final String TEXT_268 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_269 = "().add(new";
  protected final String TEXT_270 = ");" + NL + "\t\t}";
  protected final String TEXT_271 = NL + "\t\tObject old";
  protected final String TEXT_272 = " = eVirtualSet(";
  protected final String TEXT_273 = ", new";
  protected final String TEXT_274 = ");";
  protected final String TEXT_275 = NL + "\t\t";
  protected final String TEXT_276 = " old";
  protected final String TEXT_277 = " = ";
  protected final String TEXT_278 = ";" + NL + "\t\t";
  protected final String TEXT_279 = " = new";
  protected final String TEXT_280 = ";";
  protected final String TEXT_281 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_282 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_283 = NL + "\t\tboolean old";
  protected final String TEXT_284 = "ESet = (";
  protected final String TEXT_285 = " & ";
  protected final String TEXT_286 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_287 = " |= ";
  protected final String TEXT_288 = "_ESETFLAG;";
  protected final String TEXT_289 = NL + "\t\tboolean old";
  protected final String TEXT_290 = "ESet = ";
  protected final String TEXT_291 = "ESet;" + NL + "\t\t";
  protected final String TEXT_292 = "ESet = true;";
  protected final String TEXT_293 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_294 = NL + "\t\t\t";
  protected final String TEXT_295 = " notification = new ";
  protected final String TEXT_296 = "(this, ";
  protected final String TEXT_297 = ".SET, ";
  protected final String TEXT_298 = ", ";
  protected final String TEXT_299 = "isSetChange ? null : old";
  protected final String TEXT_300 = "old";
  protected final String TEXT_301 = ", new";
  protected final String TEXT_302 = ", ";
  protected final String TEXT_303 = "isSetChange";
  protected final String TEXT_304 = "!old";
  protected final String TEXT_305 = "ESet";
  protected final String TEXT_306 = ");";
  protected final String TEXT_307 = NL + "\t\t\t";
  protected final String TEXT_308 = " notification = new ";
  protected final String TEXT_309 = "(this, ";
  protected final String TEXT_310 = ".SET, ";
  protected final String TEXT_311 = ", ";
  protected final String TEXT_312 = "old";
  protected final String TEXT_313 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_314 = "old";
  protected final String TEXT_315 = ", new";
  protected final String TEXT_316 = ");";
  protected final String TEXT_317 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_318 = NL;
  protected final String TEXT_319 = NL + "\t\tif (";
  protected final String TEXT_320 = " != null && ";
  protected final String TEXT_321 = " != new";
  protected final String TEXT_322 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_323 = "(null);" + NL + "\t\t}";
  protected final String TEXT_324 = NL + "\t\tif (new";
  protected final String TEXT_325 = " != null ||  old";
  protected final String TEXT_326 = " == ";
  protected final String TEXT_327 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_328 = "(new";
  protected final String TEXT_329 = ");" + NL + "\t\t}";
  protected final String TEXT_330 = NL + "\t\treturn msgs;";
  protected final String TEXT_331 = NL + "\t\treturn ((";
  protected final String TEXT_332 = ".Internal)((";
  protected final String TEXT_333 = ")get";
  protected final String TEXT_334 = "()).featureMap()).basicAdd(";
  protected final String TEXT_335 = "(), new";
  protected final String TEXT_336 = ", msgs);";
  protected final String TEXT_337 = NL + "\t\treturn ((";
  protected final String TEXT_338 = ".Internal)get";
  protected final String TEXT_339 = "()).basicAdd(";
  protected final String TEXT_340 = "(), new";
  protected final String TEXT_341 = ", msgs);";
  protected final String TEXT_342 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_343 = "' ";
  protected final String TEXT_344 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_345 = NL + "\t}" + NL;
  protected final String TEXT_346 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_347 = "(";
  protected final String TEXT_348 = " new";
  protected final String TEXT_349 = ")" + NL + "\t{";
  protected final String TEXT_350 = NL;
  protected final String TEXT_351 = NL + "\t\tnew";
  protected final String TEXT_352 = " = new";
  protected final String TEXT_353 = " == null ? ";
  protected final String TEXT_354 = "_EDEFAULT : new";
  protected final String TEXT_355 = ";";
  protected final String TEXT_356 = NL + "\t\tif (new";
  protected final String TEXT_357 = " != null && !";
  protected final String TEXT_358 = "().contains(new";
  protected final String TEXT_359 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_360 = "().add(new";
  protected final String TEXT_361 = ");" + NL + "\t\t}";
  protected final String TEXT_362 = NL + "\t\t";
  protected final String TEXT_363 = " old";
  protected final String TEXT_364 = " = eContainer;";
  protected final String TEXT_365 = NL + "\t\teSet(";
  protected final String TEXT_366 = ".eINSTANCE.get";
  protected final String TEXT_367 = "(), ";
  protected final String TEXT_368 = "new ";
  protected final String TEXT_369 = "(";
  protected final String TEXT_370 = "new";
  protected final String TEXT_371 = ")";
  protected final String TEXT_372 = ");";
  protected final String TEXT_373 = NL + "\t\tif (new";
  protected final String TEXT_374 = " != eContainer || (eContainerFeatureID != ";
  protected final String TEXT_375 = " && new";
  protected final String TEXT_376 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_377 = ".isAncestor(this, ";
  protected final String TEXT_378 = "new";
  protected final String TEXT_379 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_380 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_381 = NL + "\t\t\t";
  protected final String TEXT_382 = " msgs = null;" + NL + "\t\t\tif (eContainer != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_383 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_384 = ")new";
  protected final String TEXT_385 = ").eInverseAdd(this, ";
  protected final String TEXT_386 = ", ";
  protected final String TEXT_387 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_388 = ")new";
  protected final String TEXT_389 = ", ";
  protected final String TEXT_390 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_391 = "(this, ";
  protected final String TEXT_392 = ".SET, ";
  protected final String TEXT_393 = ", new";
  protected final String TEXT_394 = ", new";
  protected final String TEXT_395 = "));";
  protected final String TEXT_396 = NL + "\t\t";
  protected final String TEXT_397 = " ";
  protected final String TEXT_398 = " = (";
  protected final String TEXT_399 = ")eVirtualGet(";
  protected final String TEXT_400 = ");";
  protected final String TEXT_401 = NL + "\t\tif (new";
  protected final String TEXT_402 = " != ";
  protected final String TEXT_403 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_404 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_405 = " != null)";
  protected final String TEXT_406 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_407 = ")";
  protected final String TEXT_408 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_409 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_410 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_411 = ")new";
  protected final String TEXT_412 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_413 = ", null, msgs);";
  protected final String TEXT_414 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_415 = ")";
  protected final String TEXT_416 = ").eInverseRemove(this, ";
  protected final String TEXT_417 = ", ";
  protected final String TEXT_418 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_419 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_420 = ")new";
  protected final String TEXT_421 = ").eInverseAdd(this, ";
  protected final String TEXT_422 = ", ";
  protected final String TEXT_423 = ".class, msgs);";
  protected final String TEXT_424 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_425 = "(";
  protected final String TEXT_426 = "new";
  protected final String TEXT_427 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_428 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_429 = NL + "\t\t\tboolean old";
  protected final String TEXT_430 = "ESet = eVirtualIsSet(";
  protected final String TEXT_431 = ");";
  protected final String TEXT_432 = NL + "\t\t\tboolean old";
  protected final String TEXT_433 = "ESet = (";
  protected final String TEXT_434 = " & ";
  protected final String TEXT_435 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_436 = " |= ";
  protected final String TEXT_437 = "_ESETFLAG;";
  protected final String TEXT_438 = NL + "\t\t\tboolean old";
  protected final String TEXT_439 = "ESet = ";
  protected final String TEXT_440 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_441 = "ESet = true;";
  protected final String TEXT_442 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_443 = "(this, ";
  protected final String TEXT_444 = ".SET, ";
  protected final String TEXT_445 = ", new";
  protected final String TEXT_446 = ", new";
  protected final String TEXT_447 = ", !old";
  protected final String TEXT_448 = "ESet));" + NL + "    \t}";
  protected final String TEXT_449 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_450 = "(this, ";
  protected final String TEXT_451 = ".SET, ";
  protected final String TEXT_452 = ", new";
  protected final String TEXT_453 = ", new";
  protected final String TEXT_454 = "));";
  protected final String TEXT_455 = NL + "\t\t";
  protected final String TEXT_456 = " old";
  protected final String TEXT_457 = " = (";
  protected final String TEXT_458 = " & ";
  protected final String TEXT_459 = "_EFLAG) != 0;" + NL + "\t\tif (new";
  protected final String TEXT_460 = ") ";
  protected final String TEXT_461 = " |= ";
  protected final String TEXT_462 = "_EFLAG; else ";
  protected final String TEXT_463 = " &= ~";
  protected final String TEXT_464 = "_EFLAG;";
  protected final String TEXT_465 = NL + "\t\t";
  protected final String TEXT_466 = " old";
  protected final String TEXT_467 = " = ";
  protected final String TEXT_468 = ";";
  protected final String TEXT_469 = NL + "\t\t";
  protected final String TEXT_470 = " ";
  protected final String TEXT_471 = " = new";
  protected final String TEXT_472 = " == null ? ";
  protected final String TEXT_473 = "_EDEFAULT : new";
  protected final String TEXT_474 = ";";
  protected final String TEXT_475 = NL + "\t\t";
  protected final String TEXT_476 = " = new";
  protected final String TEXT_477 = " == null ? ";
  protected final String TEXT_478 = "_EDEFAULT : new";
  protected final String TEXT_479 = ";";
  protected final String TEXT_480 = NL + "\t\t";
  protected final String TEXT_481 = " ";
  protected final String TEXT_482 = " = ";
  protected final String TEXT_483 = "new";
  protected final String TEXT_484 = ";";
  protected final String TEXT_485 = NL + "\t\t";
  protected final String TEXT_486 = " = ";
  protected final String TEXT_487 = "new";
  protected final String TEXT_488 = ";";
  protected final String TEXT_489 = NL + "\t\tObject old";
  protected final String TEXT_490 = " = eVirtualSet(";
  protected final String TEXT_491 = ", ";
  protected final String TEXT_492 = ");";
  protected final String TEXT_493 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_494 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_495 = NL + "\t\tboolean old";
  protected final String TEXT_496 = "ESet = (";
  protected final String TEXT_497 = " & ";
  protected final String TEXT_498 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_499 = " |= ";
  protected final String TEXT_500 = "_ESETFLAG;";
  protected final String TEXT_501 = NL + "\t\tboolean old";
  protected final String TEXT_502 = "ESet = ";
  protected final String TEXT_503 = "ESet;" + NL + "\t\t";
  protected final String TEXT_504 = "ESet = true;";
  protected final String TEXT_505 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_506 = "(this, ";
  protected final String TEXT_507 = ".SET, ";
  protected final String TEXT_508 = ", ";
  protected final String TEXT_509 = "isSetChange ? ";
  protected final String TEXT_510 = "null";
  protected final String TEXT_511 = "_EDEFAULT";
  protected final String TEXT_512 = " : old";
  protected final String TEXT_513 = "old";
  protected final String TEXT_514 = ", ";
  protected final String TEXT_515 = "new";
  protected final String TEXT_516 = ", ";
  protected final String TEXT_517 = "isSetChange";
  protected final String TEXT_518 = "!old";
  protected final String TEXT_519 = "ESet";
  protected final String TEXT_520 = "));";
  protected final String TEXT_521 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_522 = "(this, ";
  protected final String TEXT_523 = ".SET, ";
  protected final String TEXT_524 = ", ";
  protected final String TEXT_525 = "old";
  protected final String TEXT_526 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_527 = "null";
  protected final String TEXT_528 = "_EDEFAULT";
  protected final String TEXT_529 = " : old";
  protected final String TEXT_530 = "old";
  protected final String TEXT_531 = ", ";
  protected final String TEXT_532 = "new";
  protected final String TEXT_533 = "));";
  protected final String TEXT_534 = NL;
  protected final String TEXT_535 = NL + "\t\tif (";
  protected final String TEXT_536 = " != null && ";
  protected final String TEXT_537 = " != new";
  protected final String TEXT_538 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_539 = "(null);" + NL + "\t\t}";
  protected final String TEXT_540 = NL + "\t\tif (new";
  protected final String TEXT_541 = " != null || old";
  protected final String TEXT_542 = " == ";
  protected final String TEXT_543 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_544 = "(new";
  protected final String TEXT_545 = ");" + NL + "\t\t}";
  protected final String TEXT_546 = NL + "\t\t((";
  protected final String TEXT_547 = ".Internal)((";
  protected final String TEXT_548 = ")get";
  protected final String TEXT_549 = "()).featureMap()).set(";
  protected final String TEXT_550 = "(), ";
  protected final String TEXT_551 = "new ";
  protected final String TEXT_552 = "(";
  protected final String TEXT_553 = "new";
  protected final String TEXT_554 = ")";
  protected final String TEXT_555 = ");";
  protected final String TEXT_556 = NL + "\t\t((";
  protected final String TEXT_557 = ".Internal)get";
  protected final String TEXT_558 = "()).set(";
  protected final String TEXT_559 = "(), ";
  protected final String TEXT_560 = "new ";
  protected final String TEXT_561 = "(";
  protected final String TEXT_562 = "new";
  protected final String TEXT_563 = ")";
  protected final String TEXT_564 = ");";
  protected final String TEXT_565 = NL;
  protected final String TEXT_566 = NL + "\t\t";
  protected final String TEXT_567 = ".";
  protected final String TEXT_568 = "(this";
  protected final String TEXT_569 = ", ";
  protected final String TEXT_570 = ");";
  protected final String TEXT_571 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_572 = "' ";
  protected final String TEXT_573 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_574 = NL + "\t}" + NL;
  protected final String TEXT_575 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_576 = " basicUnset";
  protected final String TEXT_577 = "(";
  protected final String TEXT_578 = " msgs)" + NL + "\t{";
  protected final String TEXT_579 = NL + "\t\tObject old";
  protected final String TEXT_580 = " = eVirtualUnset(";
  protected final String TEXT_581 = ");";
  protected final String TEXT_582 = NL + "\t\t";
  protected final String TEXT_583 = " old";
  protected final String TEXT_584 = " = ";
  protected final String TEXT_585 = ";" + NL + "\t\t";
  protected final String TEXT_586 = " = null;";
  protected final String TEXT_587 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_588 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_589 = NL + "\t\tboolean old";
  protected final String TEXT_590 = "ESet = (";
  protected final String TEXT_591 = " & ";
  protected final String TEXT_592 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_593 = " &= ~";
  protected final String TEXT_594 = "_ESETFLAG;";
  protected final String TEXT_595 = NL + "\t\tboolean old";
  protected final String TEXT_596 = "ESet = ";
  protected final String TEXT_597 = "ESet;" + NL + "\t\t";
  protected final String TEXT_598 = "ESet = false;";
  protected final String TEXT_599 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_600 = " notification = new ";
  protected final String TEXT_601 = "(this, ";
  protected final String TEXT_602 = ".UNSET, ";
  protected final String TEXT_603 = ", ";
  protected final String TEXT_604 = "isSetChange ? old";
  protected final String TEXT_605 = " : null";
  protected final String TEXT_606 = "old";
  protected final String TEXT_607 = ", null, ";
  protected final String TEXT_608 = "isSetChange";
  protected final String TEXT_609 = "old";
  protected final String TEXT_610 = "ESet";
  protected final String TEXT_611 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_612 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_613 = "' ";
  protected final String TEXT_614 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_615 = NL + "\t}" + NL;
  protected final String TEXT_616 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void unset";
  protected final String TEXT_617 = "()" + NL + "\t{";
  protected final String TEXT_618 = NL + "\t\teUnset(";
  protected final String TEXT_619 = ".eINSTANCE.get";
  protected final String TEXT_620 = "());";
  protected final String TEXT_621 = NL + "\t\t((";
  protected final String TEXT_622 = ".Unsettable)get";
  protected final String TEXT_623 = "()).unset();";
  protected final String TEXT_624 = NL + "\t\t";
  protected final String TEXT_625 = " ";
  protected final String TEXT_626 = " = (";
  protected final String TEXT_627 = ")eVirtualGet(";
  protected final String TEXT_628 = ");";
  protected final String TEXT_629 = NL + "\t\tif (";
  protected final String TEXT_630 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_631 = " msgs = null;";
  protected final String TEXT_632 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_633 = ")";
  protected final String TEXT_634 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_635 = ", null, msgs);";
  protected final String TEXT_636 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_637 = ")";
  protected final String TEXT_638 = ").eInverseRemove(this, ";
  protected final String TEXT_639 = ", ";
  protected final String TEXT_640 = ".class, msgs);";
  protected final String TEXT_641 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_642 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_643 = NL + "\t\t\tboolean old";
  protected final String TEXT_644 = "ESet = eVirtualIsSet(";
  protected final String TEXT_645 = ");";
  protected final String TEXT_646 = NL + "\t\t\tboolean old";
  protected final String TEXT_647 = "ESet = (";
  protected final String TEXT_648 = " & ";
  protected final String TEXT_649 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_650 = " &= ~";
  protected final String TEXT_651 = "_ESETFLAG;";
  protected final String TEXT_652 = NL + "\t\t\tboolean old";
  protected final String TEXT_653 = "ESet = ";
  protected final String TEXT_654 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_655 = "ESet = false;";
  protected final String TEXT_656 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_657 = "(this, ";
  protected final String TEXT_658 = ".UNSET, ";
  protected final String TEXT_659 = ", null, null, old";
  protected final String TEXT_660 = "ESet));" + NL + "    \t}";
  protected final String TEXT_661 = NL + "\t\t";
  protected final String TEXT_662 = " old";
  protected final String TEXT_663 = " = (";
  protected final String TEXT_664 = " & ";
  protected final String TEXT_665 = "_EFLAG) != 0;";
  protected final String TEXT_666 = NL + "\t\tObject old";
  protected final String TEXT_667 = " = eVirtualUnset(";
  protected final String TEXT_668 = ");";
  protected final String TEXT_669 = NL + "\t\t";
  protected final String TEXT_670 = " old";
  protected final String TEXT_671 = " = ";
  protected final String TEXT_672 = ";";
  protected final String TEXT_673 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_674 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_675 = NL + "\t\tboolean old";
  protected final String TEXT_676 = "ESet = (";
  protected final String TEXT_677 = " & ";
  protected final String TEXT_678 = "_ESETFLAG) != 0;";
  protected final String TEXT_679 = NL + "\t\tboolean old";
  protected final String TEXT_680 = "ESet = ";
  protected final String TEXT_681 = "ESet;";
  protected final String TEXT_682 = NL + "\t\t";
  protected final String TEXT_683 = " = null;";
  protected final String TEXT_684 = NL + "\t\t";
  protected final String TEXT_685 = " &= ~";
  protected final String TEXT_686 = "_ESETFLAG;";
  protected final String TEXT_687 = NL + "\t\t";
  protected final String TEXT_688 = "ESet = false;";
  protected final String TEXT_689 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_690 = "(this, ";
  protected final String TEXT_691 = ".UNSET, ";
  protected final String TEXT_692 = ", ";
  protected final String TEXT_693 = "isSetChange ? old";
  protected final String TEXT_694 = " : null";
  protected final String TEXT_695 = "old";
  protected final String TEXT_696 = ", null, ";
  protected final String TEXT_697 = "isSetChange";
  protected final String TEXT_698 = "old";
  protected final String TEXT_699 = "ESet";
  protected final String TEXT_700 = "));";
  protected final String TEXT_701 = NL + "\t\tif (";
  protected final String TEXT_702 = "_EDEFAULT) ";
  protected final String TEXT_703 = " |= ";
  protected final String TEXT_704 = "_EFLAG; else ";
  protected final String TEXT_705 = " &= ~";
  protected final String TEXT_706 = "_EFLAG;";
  protected final String TEXT_707 = NL + "\t\t";
  protected final String TEXT_708 = " = ";
  protected final String TEXT_709 = "_EDEFAULT;";
  protected final String TEXT_710 = NL + "\t\t";
  protected final String TEXT_711 = " &= ~";
  protected final String TEXT_712 = "_ESETFLAG;";
  protected final String TEXT_713 = NL + "\t\t";
  protected final String TEXT_714 = "ESet = false;";
  protected final String TEXT_715 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_716 = "(this, ";
  protected final String TEXT_717 = ".UNSET, ";
  protected final String TEXT_718 = ", ";
  protected final String TEXT_719 = "isSetChange ? old";
  protected final String TEXT_720 = " : ";
  protected final String TEXT_721 = "_EDEFAULT";
  protected final String TEXT_722 = "old";
  protected final String TEXT_723 = ", ";
  protected final String TEXT_724 = "_EDEFAULT, ";
  protected final String TEXT_725 = "isSetChange";
  protected final String TEXT_726 = "old";
  protected final String TEXT_727 = "ESet";
  protected final String TEXT_728 = "));";
  protected final String TEXT_729 = NL + "\t\t((";
  protected final String TEXT_730 = ".Internal)((";
  protected final String TEXT_731 = ")get";
  protected final String TEXT_732 = "()).featureMap()).clear(";
  protected final String TEXT_733 = "());";
  protected final String TEXT_734 = NL + "\t\t((";
  protected final String TEXT_735 = ".Internal)get";
  protected final String TEXT_736 = "()).clear(";
  protected final String TEXT_737 = "());";
  protected final String TEXT_738 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_739 = "' ";
  protected final String TEXT_740 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_741 = NL + "\t}" + NL;
  protected final String TEXT_742 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_743 = "()" + NL + "\t{";
  protected final String TEXT_744 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_745 = ".eINSTANCE.get";
  protected final String TEXT_746 = "());";
  protected final String TEXT_747 = NL + "\t\t";
  protected final String TEXT_748 = " ";
  protected final String TEXT_749 = " = (";
  protected final String TEXT_750 = ")eVirtualGet(";
  protected final String TEXT_751 = ");";
  protected final String TEXT_752 = NL + "\t\treturn ";
  protected final String TEXT_753 = " != null && ((";
  protected final String TEXT_754 = ".Unsettable)";
  protected final String TEXT_755 = ").isSet();";
  protected final String TEXT_756 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_757 = ");";
  protected final String TEXT_758 = NL + "\t\treturn (";
  protected final String TEXT_759 = " & ";
  protected final String TEXT_760 = "_ESETFLAG) != 0;";
  protected final String TEXT_761 = NL + "\t\treturn ";
  protected final String TEXT_762 = "ESet;";
  protected final String TEXT_763 = NL + "\t\treturn !((";
  protected final String TEXT_764 = ".Internal)((";
  protected final String TEXT_765 = ")get";
  protected final String TEXT_766 = "()).featureMap()).isEmpty(";
  protected final String TEXT_767 = "());";
  protected final String TEXT_768 = NL + "\t\treturn !((";
  protected final String TEXT_769 = ".Internal)get";
  protected final String TEXT_770 = "()).isEmpty(";
  protected final String TEXT_771 = "());";
  protected final String TEXT_772 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_773 = "' ";
  protected final String TEXT_774 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_775 = NL + "\t}" + NL;
  protected final String TEXT_776 = NL;
  protected final String TEXT_777 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_778 = " create";
  protected final String TEXT_779 = "(";
  protected final String TEXT_780 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_781 = " new";
  protected final String TEXT_782 = " = (";
  protected final String TEXT_783 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_784 = NL + "\t\t";
  protected final String TEXT_785 = "().add(new";
  protected final String TEXT_786 = ");";
  protected final String TEXT_787 = NL + "\t\tset";
  protected final String TEXT_788 = "(new";
  protected final String TEXT_789 = ");";
  protected final String TEXT_790 = NL + "\t\treturn new";
  protected final String TEXT_791 = ";" + NL + "\t}" + NL;
  protected final String TEXT_792 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_793 = " create";
  protected final String TEXT_794 = "() {" + NL + "\t\t";
  protected final String TEXT_795 = " new";
  protected final String TEXT_796 = " = ";
  protected final String TEXT_797 = ".eINSTANCE.create";
  protected final String TEXT_798 = "();";
  protected final String TEXT_799 = NL + "\t\t";
  protected final String TEXT_800 = "().add(new";
  protected final String TEXT_801 = ");";
  protected final String TEXT_802 = NL + "\t\tset";
  protected final String TEXT_803 = "(new";
  protected final String TEXT_804 = ");";
  protected final String TEXT_805 = NL + "\t\treturn new";
  protected final String TEXT_806 = ";" + NL + "\t}" + NL;
  protected final String TEXT_807 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_808 = " get";
  protected final String TEXT_809 = "(";
  protected final String TEXT_810 = " ";
  protected final String TEXT_811 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_812 = " i = ";
  protected final String TEXT_813 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_814 = " ";
  protected final String TEXT_815 = " = (";
  protected final String TEXT_816 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_817 = ".equals(";
  protected final String TEXT_818 = ".";
  protected final String TEXT_819 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_820 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_821 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_822 = "()" + NL + "\t{";
  protected final String TEXT_823 = NL + "  \t\treturn false;";
  protected final String TEXT_824 = NL + "\t\treturn !((";
  protected final String TEXT_825 = ")";
  protected final String TEXT_826 = "()).featureMap().isEmpty();";
  protected final String TEXT_827 = NL + "\t\treturn ";
  protected final String TEXT_828 = " != null && !";
  protected final String TEXT_829 = ".featureMap().isEmpty();";
  protected final String TEXT_830 = NL + "\t\treturn ";
  protected final String TEXT_831 = " != null && !";
  protected final String TEXT_832 = ".isEmpty();";
  protected final String TEXT_833 = NL + "\t\t";
  protected final String TEXT_834 = " ";
  protected final String TEXT_835 = " = (";
  protected final String TEXT_836 = ")eVirtualGet(";
  protected final String TEXT_837 = ");" + NL + "\t\treturn ";
  protected final String TEXT_838 = " != null && !";
  protected final String TEXT_839 = ".isEmpty();";
  protected final String TEXT_840 = NL + "\t\treturn !";
  protected final String TEXT_841 = "().isEmpty();";
  protected final String TEXT_842 = NL + "\t\treturn ";
  protected final String TEXT_843 = " != null;";
  protected final String TEXT_844 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_845 = ") != null;";
  protected final String TEXT_846 = NL + "\t\treturn basicGet";
  protected final String TEXT_847 = "() != null;";
  protected final String TEXT_848 = NL + "\t\treturn ";
  protected final String TEXT_849 = " != null;";
  protected final String TEXT_850 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_851 = ") != null;";
  protected final String TEXT_852 = NL + "\t\treturn ";
  protected final String TEXT_853 = "() != null;";
  protected final String TEXT_854 = NL + "\t\treturn ((";
  protected final String TEXT_855 = " & ";
  protected final String TEXT_856 = "_EFLAG) != 0) != ";
  protected final String TEXT_857 = "_EDEFAULT;";
  protected final String TEXT_858 = NL + "\t\treturn ";
  protected final String TEXT_859 = " != ";
  protected final String TEXT_860 = "_EDEFAULT;";
  protected final String TEXT_861 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_862 = ") && eVirtualGet(";
  protected final String TEXT_863 = ") != ";
  protected final String TEXT_864 = "_EDEFAULT;";
  protected final String TEXT_865 = NL + "\t\treturn ";
  protected final String TEXT_866 = "() != ";
  protected final String TEXT_867 = "_EDEFAULT;";
  protected final String TEXT_868 = NL + "\t\treturn ";
  protected final String TEXT_869 = "_EDEFAULT == null ? ";
  protected final String TEXT_870 = " != null : !";
  protected final String TEXT_871 = "_EDEFAULT.equals(";
  protected final String TEXT_872 = ");";
  protected final String TEXT_873 = NL + "\t\t";
  protected final String TEXT_874 = " ";
  protected final String TEXT_875 = " = eVirtualIsSet(";
  protected final String TEXT_876 = ") ? (";
  protected final String TEXT_877 = ")eVirtualGet(";
  protected final String TEXT_878 = ") : ";
  protected final String TEXT_879 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_880 = "_EDEFAULT == null ? ";
  protected final String TEXT_881 = " != null : !";
  protected final String TEXT_882 = "_EDEFAULT.equals(";
  protected final String TEXT_883 = ");";
  protected final String TEXT_884 = NL + "\t\treturn ";
  protected final String TEXT_885 = "_EDEFAULT == null ? ";
  protected final String TEXT_886 = "() != null : !";
  protected final String TEXT_887 = "_EDEFAULT.equals(";
  protected final String TEXT_888 = "());";
  protected final String TEXT_889 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_890 = ".eINSTANCE.get";
  protected final String TEXT_891 = "());";
  protected final String TEXT_892 = NL + "\t\t";
  protected final String TEXT_893 = " ";
  protected final String TEXT_894 = " = (";
  protected final String TEXT_895 = ")eVirtualGet(";
  protected final String TEXT_896 = ");";
  protected final String TEXT_897 = NL + "\t\treturn ";
  protected final String TEXT_898 = " != null && ((";
  protected final String TEXT_899 = ".Unsettable)";
  protected final String TEXT_900 = ").isSet();";
  protected final String TEXT_901 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_902 = ");";
  protected final String TEXT_903 = NL + "\t\treturn (";
  protected final String TEXT_904 = " & ";
  protected final String TEXT_905 = "_ESETFLAG) != 0;";
  protected final String TEXT_906 = NL + "\t\treturn ";
  protected final String TEXT_907 = "ESet;";
  protected final String TEXT_908 = NL + "\t\treturn !((";
  protected final String TEXT_909 = ".Internal)((";
  protected final String TEXT_910 = ")get";
  protected final String TEXT_911 = "()).featureMap()).isEmpty(";
  protected final String TEXT_912 = "());";
  protected final String TEXT_913 = NL + "\t\treturn !((";
  protected final String TEXT_914 = ".Internal)get";
  protected final String TEXT_915 = "()).isEmpty(";
  protected final String TEXT_916 = "());";
  protected final String TEXT_917 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_918 = "' ";
  protected final String TEXT_919 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_920 = NL + "\t}" + NL;
  protected final String TEXT_921 = NL;
  protected final String TEXT_922 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_923 = " ";
  protected final String TEXT_924 = "(";
  protected final String TEXT_925 = ")";
  protected final String TEXT_926 = NL + "\t{";
  protected final String TEXT_927 = NL + "\t\t";
  protected final String TEXT_928 = NL + "\t\treturn ";
  protected final String TEXT_929 = ".";
  protected final String TEXT_930 = "(this, ";
  protected final String TEXT_931 = ", ";
  protected final String TEXT_932 = ");";
  protected final String TEXT_933 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_934 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_935 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_936 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_937 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_938 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_939 = ".";
  protected final String TEXT_940 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_941 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_942 = "\", ";
  protected final String TEXT_943 = ".getObjectLabel(this, ";
  protected final String TEXT_944 = ") }),";
  protected final String TEXT_945 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_946 = NL + "\t\t";
  protected final String TEXT_947 = ".";
  protected final String TEXT_948 = "(this";
  protected final String TEXT_949 = ", ";
  protected final String TEXT_950 = ");";
  protected final String TEXT_951 = NL + "\t\t";
  protected final String TEXT_952 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_953 = " result = (";
  protected final String TEXT_954 = ") cache.get(";
  protected final String TEXT_955 = "eResource(), ";
  protected final String TEXT_956 = "this, ";
  protected final String TEXT_957 = ".eINSTANCE.get";
  protected final String TEXT_958 = "().getEOperations().get(";
  protected final String TEXT_959 = "));" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_960 = "eResource(), ";
  protected final String TEXT_961 = "this, ";
  protected final String TEXT_962 = ".eINSTANCE.get";
  protected final String TEXT_963 = "().getEOperations().get(";
  protected final String TEXT_964 = "), result = ";
  protected final String TEXT_965 = "new ";
  protected final String TEXT_966 = "(";
  protected final String TEXT_967 = ".";
  protected final String TEXT_968 = "(this";
  protected final String TEXT_969 = ", ";
  protected final String TEXT_970 = ")";
  protected final String TEXT_971 = ")";
  protected final String TEXT_972 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_973 = ".";
  protected final String TEXT_974 = "()";
  protected final String TEXT_975 = ";" + NL + "\t\t}";
  protected final String TEXT_976 = NL + "\t\treturn ";
  protected final String TEXT_977 = ".";
  protected final String TEXT_978 = "(this";
  protected final String TEXT_979 = ", ";
  protected final String TEXT_980 = ");";
  protected final String TEXT_981 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_982 = NL + "\t}" + NL;
  protected final String TEXT_983 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_984 = " eInverseAdd(";
  protected final String TEXT_985 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_986 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_987 = NL + "\t\t\t\tcase ";
  protected final String TEXT_988 = ":";
  protected final String TEXT_989 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_990 = ")((";
  protected final String TEXT_991 = ")";
  protected final String TEXT_992 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_993 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_994 = ")";
  protected final String TEXT_995 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_996 = NL + "\t\t\t\t\tif (eContainer != null)" + NL + "\t\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_997 = ", msgs);";
  protected final String TEXT_998 = NL + "\t\t\t\t\t";
  protected final String TEXT_999 = " ";
  protected final String TEXT_1000 = " = (";
  protected final String TEXT_1001 = ")eVirtualGet(";
  protected final String TEXT_1002 = ");";
  protected final String TEXT_1003 = NL + "\t\t\t\t\tif (";
  protected final String TEXT_1004 = " != null)";
  protected final String TEXT_1005 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1006 = ")";
  protected final String TEXT_1007 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1008 = ", null, msgs);";
  protected final String TEXT_1009 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1010 = ")";
  protected final String TEXT_1011 = ").eInverseRemove(this, ";
  protected final String TEXT_1012 = ", ";
  protected final String TEXT_1013 = ".class, msgs);";
  protected final String TEXT_1014 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_1015 = "((";
  protected final String TEXT_1016 = ")otherEnd, msgs);";
  protected final String TEXT_1017 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (eContainer != null)" + NL + "\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\treturn eBasicSetContainer(otherEnd, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1018 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1019 = " eInverseRemove(";
  protected final String TEXT_1020 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_1021 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_1022 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1023 = ":";
  protected final String TEXT_1024 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1025 = ")((";
  protected final String TEXT_1026 = ")";
  protected final String TEXT_1027 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1028 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1029 = ")((";
  protected final String TEXT_1030 = ")";
  protected final String TEXT_1031 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1032 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1033 = ")";
  protected final String TEXT_1034 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1035 = NL + "\t\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1036 = ", msgs);";
  protected final String TEXT_1037 = NL + "\t\t\t\t\treturn basicUnset";
  protected final String TEXT_1038 = "(msgs);";
  protected final String TEXT_1039 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_1040 = "(null, msgs);";
  protected final String TEXT_1041 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eBasicSetContainer(null, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1042 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1043 = " eBasicRemoveFromContainer(";
  protected final String TEXT_1044 = " msgs)" + NL + "\t{" + NL + "\t\tif (eContainerFeatureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eContainerFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1045 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1046 = ":" + NL + "\t\t\t\t\treturn eContainer.eInverseRemove(this, ";
  protected final String TEXT_1047 = ", ";
  protected final String TEXT_1048 = ".class, msgs);";
  protected final String TEXT_1049 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicBasicRemoveFromContainer(msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1050 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(";
  protected final String TEXT_1051 = " eFeature, boolean resolve)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1052 = NL + "\t\t\tcase ";
  protected final String TEXT_1053 = ":";
  protected final String TEXT_1054 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1055 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1056 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1057 = "(";
  protected final String TEXT_1058 = "());";
  protected final String TEXT_1059 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1060 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1061 = "();";
  protected final String TEXT_1062 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1063 = ")";
  protected final String TEXT_1064 = "()).eMap();";
  protected final String TEXT_1065 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1066 = ")";
  protected final String TEXT_1067 = "()).featureMap();";
  protected final String TEXT_1068 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1069 = "();";
  protected final String TEXT_1070 = NL + "\t\t}" + NL + "\t\treturn eDynamicGet(eFeature, resolve);" + NL + "\t}" + NL;
  protected final String TEXT_1071 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(";
  protected final String TEXT_1072 = " eFeature, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1073 = NL + "\t\t\tcase ";
  protected final String TEXT_1074 = ":";
  protected final String TEXT_1075 = NL + "\t\t\t\t((";
  protected final String TEXT_1076 = ")";
  protected final String TEXT_1077 = "()).featureMap().clear();";
  protected final String TEXT_1078 = NL + "\t\t\t\t";
  protected final String TEXT_1079 = "().clear();";
  protected final String TEXT_1080 = NL + "\t\t\t\t((";
  protected final String TEXT_1081 = ")";
  protected final String TEXT_1082 = "()).featureMap().addAll((";
  protected final String TEXT_1083 = ")newValue);";
  protected final String TEXT_1084 = NL + "\t\t\t\t((";
  protected final String TEXT_1085 = ")";
  protected final String TEXT_1086 = "()).eMap().addAll((";
  protected final String TEXT_1087 = ")newValue);";
  protected final String TEXT_1088 = NL + "\t\t\t\t";
  protected final String TEXT_1089 = "().addAll((";
  protected final String TEXT_1090 = ")newValue);";
  protected final String TEXT_1091 = NL + "\t\t\t\tset";
  protected final String TEXT_1092 = "(((";
  protected final String TEXT_1093 = ")newValue).";
  protected final String TEXT_1094 = "());";
  protected final String TEXT_1095 = NL + "\t\t\t\tset";
  protected final String TEXT_1096 = "((";
  protected final String TEXT_1097 = ")newValue);";
  protected final String TEXT_1098 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1099 = NL + "\t\t}" + NL + "\t\teDynamicSet(eFeature, newValue);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(";
  protected final String TEXT_1100 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1101 = NL + "\t\t\tcase ";
  protected final String TEXT_1102 = ":";
  protected final String TEXT_1103 = NL + "\t\t\t\t((";
  protected final String TEXT_1104 = ")";
  protected final String TEXT_1105 = "()).featureMap().clear();";
  protected final String TEXT_1106 = NL + "\t\t\t\t";
  protected final String TEXT_1107 = "().clear();";
  protected final String TEXT_1108 = NL + "\t\t\t\tunset";
  protected final String TEXT_1109 = "();";
  protected final String TEXT_1110 = NL + "\t\t\t\tset";
  protected final String TEXT_1111 = "((";
  protected final String TEXT_1112 = ")null);";
  protected final String TEXT_1113 = NL + "\t\t\t\tset";
  protected final String TEXT_1114 = "(";
  protected final String TEXT_1115 = "_EDEFAULT);";
  protected final String TEXT_1116 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1117 = NL + "\t\t}" + NL + "\t\teDynamicUnset(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1118 = NL;
  protected final String TEXT_1119 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(";
  protected final String TEXT_1120 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1121 = NL + "\t\t\tcase ";
  protected final String TEXT_1122 = ":";
  protected final String TEXT_1123 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1124 = "();";
  protected final String TEXT_1125 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1126 = ")";
  protected final String TEXT_1127 = "()).featureMap().isEmpty();";
  protected final String TEXT_1128 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1129 = " != null && !";
  protected final String TEXT_1130 = ".featureMap().isEmpty();";
  protected final String TEXT_1131 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1132 = " != null && !";
  protected final String TEXT_1133 = ".isEmpty();";
  protected final String TEXT_1134 = NL + "\t\t\t\t";
  protected final String TEXT_1135 = " ";
  protected final String TEXT_1136 = " = (";
  protected final String TEXT_1137 = ")eVirtualGet(";
  protected final String TEXT_1138 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1139 = " != null && !";
  protected final String TEXT_1140 = ".isEmpty();";
  protected final String TEXT_1141 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1142 = "().isEmpty();";
  protected final String TEXT_1143 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1144 = "();";
  protected final String TEXT_1145 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1146 = " != null;";
  protected final String TEXT_1147 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1148 = ") != null;";
  protected final String TEXT_1149 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1150 = "() != null;";
  protected final String TEXT_1151 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1152 = " != null;";
  protected final String TEXT_1153 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1154 = ") != null;";
  protected final String TEXT_1155 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1156 = "() != null;";
  protected final String TEXT_1157 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1158 = " & ";
  protected final String TEXT_1159 = "_EFLAG) != 0) != ";
  protected final String TEXT_1160 = "_EDEFAULT;";
  protected final String TEXT_1161 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1162 = " != ";
  protected final String TEXT_1163 = "_EDEFAULT;";
  protected final String TEXT_1164 = NL + "\t\t\t\treturn eVirtualIsSet(";
  protected final String TEXT_1165 = ") && eVirtualGet(";
  protected final String TEXT_1166 = ") != ";
  protected final String TEXT_1167 = "_EDEFAULT;";
  protected final String TEXT_1168 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1169 = "() != ";
  protected final String TEXT_1170 = "_EDEFAULT;";
  protected final String TEXT_1171 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1172 = "_EDEFAULT == null ? ";
  protected final String TEXT_1173 = " != null : !";
  protected final String TEXT_1174 = "_EDEFAULT.equals(";
  protected final String TEXT_1175 = ");";
  protected final String TEXT_1176 = NL + "\t\t\t\t";
  protected final String TEXT_1177 = " ";
  protected final String TEXT_1178 = " = eVirtualIsSet(";
  protected final String TEXT_1179 = ") ? (";
  protected final String TEXT_1180 = ")eVirtualGet(";
  protected final String TEXT_1181 = ") : ";
  protected final String TEXT_1182 = "_EDEFAULT;" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1183 = "_EDEFAULT == null ? ";
  protected final String TEXT_1184 = " != null : !";
  protected final String TEXT_1185 = "_EDEFAULT.equals(";
  protected final String TEXT_1186 = ");";
  protected final String TEXT_1187 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1188 = "_EDEFAULT == null ? ";
  protected final String TEXT_1189 = "() != null : !";
  protected final String TEXT_1190 = "_EDEFAULT.equals(";
  protected final String TEXT_1191 = "());";
  protected final String TEXT_1192 = NL + "\t\t}" + NL + "\t\treturn eDynamicIsSet(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1193 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1194 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1195 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1196 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1197 = ": return ";
  protected final String TEXT_1198 = ";";
  protected final String TEXT_1199 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1200 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1201 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1202 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1203 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1204 = ": return ";
  protected final String TEXT_1205 = ";";
  protected final String TEXT_1206 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1207 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1208 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1209 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1210 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1211 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1212 = NL + "\t\t\tcase ";
  protected final String TEXT_1213 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1214 = ";";
  protected final String TEXT_1215 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1216 = NL + "\t\t\tcase ";
  protected final String TEXT_1217 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1218 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1219 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1220 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1221 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1222 = ": \");";
  protected final String TEXT_1223 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1224 = ": \");";
  protected final String TEXT_1225 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1226 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1227 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1228 = NL + "\t\tif (";
  protected final String TEXT_1229 = "(";
  protected final String TEXT_1230 = " & ";
  protected final String TEXT_1231 = "_ESETFLAG) != 0";
  protected final String TEXT_1232 = "ESet";
  protected final String TEXT_1233 = ") result.append((";
  protected final String TEXT_1234 = " & ";
  protected final String TEXT_1235 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1236 = NL + "\t\tif (";
  protected final String TEXT_1237 = "(";
  protected final String TEXT_1238 = " & ";
  protected final String TEXT_1239 = "_ESETFLAG) != 0";
  protected final String TEXT_1240 = "ESet";
  protected final String TEXT_1241 = ") result.append(";
  protected final String TEXT_1242 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1243 = NL + "\t\tresult.append(eVirtualIsSet(";
  protected final String TEXT_1244 = ") ? eVirtualGet(";
  protected final String TEXT_1245 = ") : ";
  protected final String TEXT_1246 = "null";
  protected final String TEXT_1247 = "_EDEFAULT";
  protected final String TEXT_1248 = ");";
  protected final String TEXT_1249 = NL + "\t\tresult.append((";
  protected final String TEXT_1250 = " & ";
  protected final String TEXT_1251 = "_EFLAG) != 0);";
  protected final String TEXT_1252 = NL + "\t\tresult.append(";
  protected final String TEXT_1253 = ");";
  protected final String TEXT_1254 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1255 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1256 = NL + "\t\treturn new ";
  protected final String TEXT_1257 = "(getTypedKey());";
  protected final String TEXT_1258 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1259 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1260 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1261 = ")key);";
  protected final String TEXT_1262 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1263 = ")key).";
  protected final String TEXT_1264 = "());";
  protected final String TEXT_1265 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1266 = ")key);";
  protected final String TEXT_1267 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1268 = NL + "\t\treturn new ";
  protected final String TEXT_1269 = "(getTypedValue());";
  protected final String TEXT_1270 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1271 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1272 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1273 = ")value);";
  protected final String TEXT_1274 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1275 = ")value).";
  protected final String TEXT_1276 = "());";
  protected final String TEXT_1277 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1278 = ")value);";
  protected final String TEXT_1279 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1280 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1281 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1282 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1283 = NL;
  protected final String TEXT_1284 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1285 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1286 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1287 = " getCacheAdapter() {" + NL + "\t\tfor (";
  protected final String TEXT_1288 = " i = eAdapters().iterator(); i.hasNext();) {" + NL + "\t\t\t";
  protected final String TEXT_1289 = " adapter = (";
  protected final String TEXT_1290 = ") i.next();" + NL + "\t\t\tif (adapter instanceof ";
  protected final String TEXT_1291 = ") {" + NL + "\t\t\t\treturn (";
  protected final String TEXT_1292 = ") adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1293 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1294 = " basicGet";
  protected final String TEXT_1295 = "()" + NL + "\t{";
  protected final String TEXT_1296 = NL + "\t\tif (isSet";
  protected final String TEXT_1297 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1298 = "basicGet";
  protected final String TEXT_1299 = "();" + NL + "\t\t}";
  protected final String TEXT_1300 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1301 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1302 = "basicGet";
  protected final String TEXT_1303 = "();" + NL + "\t\t}";
  protected final String TEXT_1304 = NL + "\t\t";
  protected final String TEXT_1305 = " ";
  protected final String TEXT_1306 = " = ";
  protected final String TEXT_1307 = "basicGet";
  protected final String TEXT_1308 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1309 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1310 = ";" + NL + "\t\t}";
  protected final String TEXT_1311 = NL + "\t\treturn ";
  protected final String TEXT_1312 = "super.basicGet";
  protected final String TEXT_1313 = "()";
  protected final String TEXT_1314 = "null";
  protected final String TEXT_1315 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1316 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1317 = " ";
  protected final String TEXT_1318 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1319 = " ";
  protected final String TEXT_1320 = " = basicGet";
  protected final String TEXT_1321 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1322 = " == null ? null : (";
  protected final String TEXT_1323 = ")eResolveProxy((";
  protected final String TEXT_1324 = ")";
  protected final String TEXT_1325 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1326 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1327 = " ";
  protected final String TEXT_1328 = "Helper(";
  protected final String TEXT_1329 = " ";
  protected final String TEXT_1330 = ")" + NL + "\t{";
  protected final String TEXT_1331 = NL + "\t\t";
  protected final String TEXT_1332 = ".addAll(super.";
  protected final String TEXT_1333 = "());";
  protected final String TEXT_1334 = NL + "\t\tsuper.";
  protected final String TEXT_1335 = "Helper(";
  protected final String TEXT_1336 = ");";
  protected final String TEXT_1337 = NL + "\t\tif (isSet";
  protected final String TEXT_1338 = "()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1339 = " i = ((";
  protected final String TEXT_1340 = ") ";
  protected final String TEXT_1341 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1342 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1343 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1344 = "())) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1345 = " i = ((";
  protected final String TEXT_1346 = ") ";
  protected final String TEXT_1347 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1348 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1349 = NL + "\t\t";
  protected final String TEXT_1350 = " ";
  protected final String TEXT_1351 = " = ";
  protected final String TEXT_1352 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1353 = ".isEmpty()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1354 = " i = ((";
  protected final String TEXT_1355 = ") ";
  protected final String TEXT_1356 = ").basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1357 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1358 = NL + "\t\tif (isSet";
  protected final String TEXT_1359 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1360 = ".addAll(";
  protected final String TEXT_1361 = "());" + NL + "\t\t}";
  protected final String TEXT_1362 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1363 = "())) {" + NL + "\t\t\t";
  protected final String TEXT_1364 = ".addAll(";
  protected final String TEXT_1365 = "());" + NL + "\t\t}";
  protected final String TEXT_1366 = NL + "\t\t";
  protected final String TEXT_1367 = " ";
  protected final String TEXT_1368 = " = ";
  protected final String TEXT_1369 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1370 = ".isEmpty()) {" + NL + "\t\t\t";
  protected final String TEXT_1371 = ".addAll(";
  protected final String TEXT_1372 = ");" + NL + "\t\t}";
  protected final String TEXT_1373 = NL + "\t\tif (isSet";
  protected final String TEXT_1374 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1375 = ".add(";
  protected final String TEXT_1376 = "basicGet";
  protected final String TEXT_1377 = "());" + NL + "\t\t}";
  protected final String TEXT_1378 = NL + "\t\t";
  protected final String TEXT_1379 = " ";
  protected final String TEXT_1380 = " = ";
  protected final String TEXT_1381 = "basicGet";
  protected final String TEXT_1382 = "();" + NL + "\t\tif (";
  protected final String TEXT_1383 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_1384 = ".add(";
  protected final String TEXT_1385 = ");" + NL + "\t\t}";
  protected final String TEXT_1386 = NL + "\t\treturn ";
  protected final String TEXT_1387 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1388 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1389 = " ";
  protected final String TEXT_1390 = "()" + NL + "\t{";
  protected final String TEXT_1391 = NL + "\t\t";
  protected final String TEXT_1392 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_1393 = NL + "\t\t\ttry {" + NL + "\t\t\t\t";
  protected final String TEXT_1394 = " method = getClass().getMethod(\"";
  protected final String TEXT_1395 = "\", null);";
  protected final String TEXT_1396 = NL + "\t\t\t\t";
  protected final String TEXT_1397 = " ";
  protected final String TEXT_1398 = " = (";
  protected final String TEXT_1399 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_1400 = " == null) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_1401 = " union = ";
  protected final String TEXT_1402 = "Helper(new ";
  protected final String TEXT_1403 = "());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_1404 = " = new ";
  protected final String TEXT_1405 = "(this, ";
  protected final String TEXT_1406 = "null";
  protected final String TEXT_1407 = "()";
  protected final String TEXT_1408 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1409 = ";" + NL + "\t\t\t} catch (";
  protected final String TEXT_1410 = " nsme) {" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_1411 = NL + "\t\t\t";
  protected final String TEXT_1412 = " ";
  protected final String TEXT_1413 = " = (";
  protected final String TEXT_1414 = ") cache.get(eResource(), this, ";
  protected final String TEXT_1415 = "());" + NL + "\t\t\tif (";
  protected final String TEXT_1416 = " == null) {" + NL + "\t\t\t\t";
  protected final String TEXT_1417 = " union = ";
  protected final String TEXT_1418 = "Helper(new ";
  protected final String TEXT_1419 = "());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_1420 = "(), ";
  protected final String TEXT_1421 = " = new ";
  protected final String TEXT_1422 = "(this, ";
  protected final String TEXT_1423 = "null";
  protected final String TEXT_1424 = "()";
  protected final String TEXT_1425 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_1426 = ";";
  protected final String TEXT_1427 = NL + "\t\t}";
  protected final String TEXT_1428 = NL + "\t\t";
  protected final String TEXT_1429 = " union = ";
  protected final String TEXT_1430 = "Helper(new ";
  protected final String TEXT_1431 = "());" + NL + "\t\treturn new ";
  protected final String TEXT_1432 = "(this, ";
  protected final String TEXT_1433 = "null";
  protected final String TEXT_1434 = "()";
  protected final String TEXT_1435 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_1436 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1437 = " ";
  protected final String TEXT_1438 = "()" + NL + "\t{";
  protected final String TEXT_1439 = NL + "\t\tif (isSet";
  protected final String TEXT_1440 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1441 = "();" + NL + "\t\t}";
  protected final String TEXT_1442 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1443 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1444 = "();" + NL + "\t\t}";
  protected final String TEXT_1445 = NL + "\t\t";
  protected final String TEXT_1446 = " ";
  protected final String TEXT_1447 = " = ";
  protected final String TEXT_1448 = "();" + NL + "\t\tif (";
  protected final String TEXT_1449 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1450 = ";" + NL + "\t\t}";
  protected final String TEXT_1451 = NL + "\t\treturn ";
  protected final String TEXT_1452 = "super.";
  protected final String TEXT_1453 = "()";
  protected final String TEXT_1454 = "null";
  protected final String TEXT_1455 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1456 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1457 = "()" + NL + "\t{";
  protected final String TEXT_1458 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1459 = "()";
  protected final String TEXT_1460 = NL + "\t\treturn isSet";
  protected final String TEXT_1461 = "()";
  protected final String TEXT_1462 = ";";
  protected final String TEXT_1463 = NL + "\t\treturn !";
  protected final String TEXT_1464 = "().isEmpty()";
  protected final String TEXT_1465 = ";";
  protected final String TEXT_1466 = NL + "\t\treturn ";
  protected final String TEXT_1467 = "basicGet";
  protected final String TEXT_1468 = "() != null";
  protected final String TEXT_1469 = ";";
  protected final String TEXT_1470 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1471 = "())";
  protected final String TEXT_1472 = ";";
  protected final String TEXT_1473 = NL + "\t\t\t|| isSet";
  protected final String TEXT_1474 = "()";
  protected final String TEXT_1475 = ";";
  protected final String TEXT_1476 = NL + "\t\t\t|| !";
  protected final String TEXT_1477 = "().isEmpty()";
  protected final String TEXT_1478 = ";";
  protected final String TEXT_1479 = NL + "\t\t\t|| ";
  protected final String TEXT_1480 = "basicGet";
  protected final String TEXT_1481 = "() != null";
  protected final String TEXT_1482 = ";";
  protected final String TEXT_1483 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_1484 = "())";
  protected final String TEXT_1485 = ";";
  protected final String TEXT_1486 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1487 = "();";
  protected final String TEXT_1488 = NL + "\t\treturn false;";
  protected final String TEXT_1489 = NL + "\t}" + NL;
  protected final String TEXT_1490 = NL;
  protected final String TEXT_1491 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1492 = " create";
  protected final String TEXT_1493 = "(";
  protected final String TEXT_1494 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1495 = " new";
  protected final String TEXT_1496 = " = (";
  protected final String TEXT_1497 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1498 = NL + "\t\t";
  protected final String TEXT_1499 = "().add(new";
  protected final String TEXT_1500 = ");";
  protected final String TEXT_1501 = NL + "\t\tset";
  protected final String TEXT_1502 = "(new";
  protected final String TEXT_1503 = ");";
  protected final String TEXT_1504 = NL + "\t\treturn new";
  protected final String TEXT_1505 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1506 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1507 = " create";
  protected final String TEXT_1508 = "() {" + NL + "\t\t";
  protected final String TEXT_1509 = " new";
  protected final String TEXT_1510 = " = ";
  protected final String TEXT_1511 = ".eINSTANCE.create";
  protected final String TEXT_1512 = "();";
  protected final String TEXT_1513 = NL + "\t\t";
  protected final String TEXT_1514 = "().add(new";
  protected final String TEXT_1515 = ");";
  protected final String TEXT_1516 = NL + "\t\tset";
  protected final String TEXT_1517 = "(new";
  protected final String TEXT_1518 = ");";
  protected final String TEXT_1519 = NL + "\t\treturn new";
  protected final String TEXT_1520 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1521 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1522 = " get";
  protected final String TEXT_1523 = "(";
  protected final String TEXT_1524 = " ";
  protected final String TEXT_1525 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1526 = " i = ";
  protected final String TEXT_1527 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1528 = " ";
  protected final String TEXT_1529 = " = (";
  protected final String TEXT_1530 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1531 = ".equals(";
  protected final String TEXT_1532 = ".";
  protected final String TEXT_1533 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1534 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1535 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1536 = "()" + NL + "\t{";
  protected final String TEXT_1537 = NL + "  \t\treturn false;";
  protected final String TEXT_1538 = NL + "\t\treturn !((";
  protected final String TEXT_1539 = ")";
  protected final String TEXT_1540 = "()).featureMap().isEmpty();";
  protected final String TEXT_1541 = NL + "\t\treturn ";
  protected final String TEXT_1542 = " != null && !";
  protected final String TEXT_1543 = ".featureMap().isEmpty();";
  protected final String TEXT_1544 = NL + "\t\treturn ";
  protected final String TEXT_1545 = " != null && !";
  protected final String TEXT_1546 = ".isEmpty();";
  protected final String TEXT_1547 = NL + "\t\t";
  protected final String TEXT_1548 = " ";
  protected final String TEXT_1549 = " = (";
  protected final String TEXT_1550 = ")eVirtualGet(";
  protected final String TEXT_1551 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1552 = " != null && !";
  protected final String TEXT_1553 = ".isEmpty();";
  protected final String TEXT_1554 = NL + "\t\treturn !";
  protected final String TEXT_1555 = "().isEmpty();";
  protected final String TEXT_1556 = NL + "\t\treturn ";
  protected final String TEXT_1557 = " != null;";
  protected final String TEXT_1558 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1559 = ") != null;";
  protected final String TEXT_1560 = NL + "\t\treturn basicGet";
  protected final String TEXT_1561 = "() != null;";
  protected final String TEXT_1562 = NL + "\t\treturn ";
  protected final String TEXT_1563 = " != null;";
  protected final String TEXT_1564 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1565 = ") != null;";
  protected final String TEXT_1566 = NL + "\t\treturn ";
  protected final String TEXT_1567 = "() != null;";
  protected final String TEXT_1568 = NL + "\t\treturn ((";
  protected final String TEXT_1569 = " & ";
  protected final String TEXT_1570 = "_EFLAG) != 0) != ";
  protected final String TEXT_1571 = "_EDEFAULT;";
  protected final String TEXT_1572 = NL + "\t\treturn ";
  protected final String TEXT_1573 = " != ";
  protected final String TEXT_1574 = "_EDEFAULT;";
  protected final String TEXT_1575 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1576 = ") && eVirtualGet(";
  protected final String TEXT_1577 = ") != ";
  protected final String TEXT_1578 = "_EDEFAULT;";
  protected final String TEXT_1579 = NL + "\t\treturn ";
  protected final String TEXT_1580 = "() != ";
  protected final String TEXT_1581 = "_EDEFAULT;";
  protected final String TEXT_1582 = NL + "\t\treturn ";
  protected final String TEXT_1583 = "_EDEFAULT == null ? ";
  protected final String TEXT_1584 = " != null : !";
  protected final String TEXT_1585 = "_EDEFAULT.equals(";
  protected final String TEXT_1586 = ");";
  protected final String TEXT_1587 = NL + "\t\t";
  protected final String TEXT_1588 = " ";
  protected final String TEXT_1589 = " = eVirtualIsSet(";
  protected final String TEXT_1590 = ") ? (";
  protected final String TEXT_1591 = ")eVirtualGet(";
  protected final String TEXT_1592 = ") : ";
  protected final String TEXT_1593 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_1594 = "_EDEFAULT == null ? ";
  protected final String TEXT_1595 = " != null : !";
  protected final String TEXT_1596 = "_EDEFAULT.equals(";
  protected final String TEXT_1597 = ");";
  protected final String TEXT_1598 = NL + "\t\treturn ";
  protected final String TEXT_1599 = "_EDEFAULT == null ? ";
  protected final String TEXT_1600 = "() != null : !";
  protected final String TEXT_1601 = "_EDEFAULT.equals(";
  protected final String TEXT_1602 = "());";
  protected final String TEXT_1603 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1604 = ".eINSTANCE.get";
  protected final String TEXT_1605 = "());";
  protected final String TEXT_1606 = NL + "\t\t";
  protected final String TEXT_1607 = " ";
  protected final String TEXT_1608 = " = (";
  protected final String TEXT_1609 = ")eVirtualGet(";
  protected final String TEXT_1610 = ");";
  protected final String TEXT_1611 = NL + "\t\treturn ";
  protected final String TEXT_1612 = " != null && ((";
  protected final String TEXT_1613 = ".Unsettable)";
  protected final String TEXT_1614 = ").isSet();";
  protected final String TEXT_1615 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1616 = ");";
  protected final String TEXT_1617 = NL + "\t\treturn (";
  protected final String TEXT_1618 = " & ";
  protected final String TEXT_1619 = "_ESETFLAG) != 0;";
  protected final String TEXT_1620 = NL + "\t\treturn ";
  protected final String TEXT_1621 = "ESet;";
  protected final String TEXT_1622 = NL + "\t\treturn !((";
  protected final String TEXT_1623 = ".Internal)((";
  protected final String TEXT_1624 = ")get";
  protected final String TEXT_1625 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1626 = "());";
  protected final String TEXT_1627 = NL + "\t\treturn !((";
  protected final String TEXT_1628 = ".Internal)get";
  protected final String TEXT_1629 = "()).isEmpty(";
  protected final String TEXT_1630 = "());";
  protected final String TEXT_1631 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1632 = "' ";
  protected final String TEXT_1633 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1634 = NL + "\t}" + NL;
  protected final String TEXT_1635 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1636 = " ";
  protected final String TEXT_1637 = "()" + NL + "\t{";
  protected final String TEXT_1638 = NL + "\t\treturn ";
  protected final String TEXT_1639 = "();";
  protected final String TEXT_1640 = NL + "\t\treturn new ";
  protected final String TEXT_1641 = ".UnmodifiableEList(this, ";
  protected final String TEXT_1642 = "null";
  protected final String TEXT_1643 = "()";
  protected final String TEXT_1644 = ", 0, ";
  protected final String TEXT_1645 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_1646 = NL + "\t\treturn null;";
  protected final String TEXT_1647 = NL + "\t\treturn ";
  protected final String TEXT_1648 = "();";
  protected final String TEXT_1649 = NL + "\t}" + NL;
  protected final String TEXT_1650 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1651 = " basicGet";
  protected final String TEXT_1652 = "()" + NL + "\t{";
  protected final String TEXT_1653 = NL + "\t\treturn null;";
  protected final String TEXT_1654 = NL + "\t\treturn ";
  protected final String TEXT_1655 = "basicGet";
  protected final String TEXT_1656 = "();";
  protected final String TEXT_1657 = NL + "\t}" + NL;
  protected final String TEXT_1658 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1659 = " basicSet";
  protected final String TEXT_1660 = "(";
  protected final String TEXT_1661 = " new";
  protected final String TEXT_1662 = ", ";
  protected final String TEXT_1663 = " msgs)" + NL + "\t{";
  protected final String TEXT_1664 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1665 = NL + "\t\tif (new";
  protected final String TEXT_1666 = " != null && !(new";
  protected final String TEXT_1667 = " instanceof ";
  protected final String TEXT_1668 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1669 = "));" + NL + "\t\t}";
  protected final String TEXT_1670 = NL + "\t\treturn basicSet";
  protected final String TEXT_1671 = "(";
  protected final String TEXT_1672 = "(";
  protected final String TEXT_1673 = ") ";
  protected final String TEXT_1674 = "new";
  protected final String TEXT_1675 = ", msgs);";
  protected final String TEXT_1676 = NL + "\t\tset";
  protected final String TEXT_1677 = "(";
  protected final String TEXT_1678 = "(";
  protected final String TEXT_1679 = ") ";
  protected final String TEXT_1680 = "new";
  protected final String TEXT_1681 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1682 = NL + "\t}" + NL;
  protected final String TEXT_1683 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1684 = "(";
  protected final String TEXT_1685 = " new";
  protected final String TEXT_1686 = ")" + NL + "\t{";
  protected final String TEXT_1687 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1688 = NL + "\t\tif (new";
  protected final String TEXT_1689 = " != null && !(new";
  protected final String TEXT_1690 = " instanceof ";
  protected final String TEXT_1691 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1692 = "));" + NL + "\t\t}";
  protected final String TEXT_1693 = NL + "\t\tset";
  protected final String TEXT_1694 = "(";
  protected final String TEXT_1695 = "(";
  protected final String TEXT_1696 = ") ";
  protected final String TEXT_1697 = "new";
  protected final String TEXT_1698 = ");";
  protected final String TEXT_1699 = NL + "\t}" + NL;
  protected final String TEXT_1700 = NL;
  protected final String TEXT_1701 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1702 = " create";
  protected final String TEXT_1703 = "(";
  protected final String TEXT_1704 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1705 = " new";
  protected final String TEXT_1706 = " = (";
  protected final String TEXT_1707 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1708 = NL + "\t\t";
  protected final String TEXT_1709 = "().add(new";
  protected final String TEXT_1710 = ");";
  protected final String TEXT_1711 = NL + "\t\tset";
  protected final String TEXT_1712 = "(new";
  protected final String TEXT_1713 = ");";
  protected final String TEXT_1714 = NL + "\t\treturn new";
  protected final String TEXT_1715 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1716 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1717 = " create";
  protected final String TEXT_1718 = "() {" + NL + "\t\t";
  protected final String TEXT_1719 = " new";
  protected final String TEXT_1720 = " = ";
  protected final String TEXT_1721 = ".eINSTANCE.create";
  protected final String TEXT_1722 = "();";
  protected final String TEXT_1723 = NL + "\t\t";
  protected final String TEXT_1724 = "().add(new";
  protected final String TEXT_1725 = ");";
  protected final String TEXT_1726 = NL + "\t\tset";
  protected final String TEXT_1727 = "(new";
  protected final String TEXT_1728 = ");";
  protected final String TEXT_1729 = NL + "\t\treturn new";
  protected final String TEXT_1730 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1731 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1732 = " get";
  protected final String TEXT_1733 = "(";
  protected final String TEXT_1734 = " ";
  protected final String TEXT_1735 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1736 = " i = ";
  protected final String TEXT_1737 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1738 = " ";
  protected final String TEXT_1739 = " = (";
  protected final String TEXT_1740 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1741 = ".equals(";
  protected final String TEXT_1742 = ".";
  protected final String TEXT_1743 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1744 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1745 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1746 = "()" + NL + "\t{";
  protected final String TEXT_1747 = NL + "  \t\treturn false;";
  protected final String TEXT_1748 = NL + "\t\treturn !((";
  protected final String TEXT_1749 = ")";
  protected final String TEXT_1750 = "()).featureMap().isEmpty();";
  protected final String TEXT_1751 = NL + "\t\treturn ";
  protected final String TEXT_1752 = " != null && !";
  protected final String TEXT_1753 = ".featureMap().isEmpty();";
  protected final String TEXT_1754 = NL + "\t\treturn ";
  protected final String TEXT_1755 = " != null && !";
  protected final String TEXT_1756 = ".isEmpty();";
  protected final String TEXT_1757 = NL + "\t\t";
  protected final String TEXT_1758 = " ";
  protected final String TEXT_1759 = " = (";
  protected final String TEXT_1760 = ")eVirtualGet(";
  protected final String TEXT_1761 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1762 = " != null && !";
  protected final String TEXT_1763 = ".isEmpty();";
  protected final String TEXT_1764 = NL + "\t\treturn !";
  protected final String TEXT_1765 = "().isEmpty();";
  protected final String TEXT_1766 = NL + "\t\treturn ";
  protected final String TEXT_1767 = " != null;";
  protected final String TEXT_1768 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1769 = ") != null;";
  protected final String TEXT_1770 = NL + "\t\treturn basicGet";
  protected final String TEXT_1771 = "() != null;";
  protected final String TEXT_1772 = NL + "\t\treturn ";
  protected final String TEXT_1773 = " != null;";
  protected final String TEXT_1774 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1775 = ") != null;";
  protected final String TEXT_1776 = NL + "\t\treturn ";
  protected final String TEXT_1777 = "() != null;";
  protected final String TEXT_1778 = NL + "\t\treturn ((";
  protected final String TEXT_1779 = " & ";
  protected final String TEXT_1780 = "_EFLAG) != 0) != ";
  protected final String TEXT_1781 = "_EDEFAULT;";
  protected final String TEXT_1782 = NL + "\t\treturn ";
  protected final String TEXT_1783 = " != ";
  protected final String TEXT_1784 = "_EDEFAULT;";
  protected final String TEXT_1785 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1786 = ") && eVirtualGet(";
  protected final String TEXT_1787 = ") != ";
  protected final String TEXT_1788 = "_EDEFAULT;";
  protected final String TEXT_1789 = NL + "\t\treturn ";
  protected final String TEXT_1790 = "() != ";
  protected final String TEXT_1791 = "_EDEFAULT;";
  protected final String TEXT_1792 = NL + "\t\treturn ";
  protected final String TEXT_1793 = "_EDEFAULT == null ? ";
  protected final String TEXT_1794 = " != null : !";
  protected final String TEXT_1795 = "_EDEFAULT.equals(";
  protected final String TEXT_1796 = ");";
  protected final String TEXT_1797 = NL + "\t\t";
  protected final String TEXT_1798 = " ";
  protected final String TEXT_1799 = " = eVirtualIsSet(";
  protected final String TEXT_1800 = ") ? (";
  protected final String TEXT_1801 = ")eVirtualGet(";
  protected final String TEXT_1802 = ") : ";
  protected final String TEXT_1803 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_1804 = "_EDEFAULT == null ? ";
  protected final String TEXT_1805 = " != null : !";
  protected final String TEXT_1806 = "_EDEFAULT.equals(";
  protected final String TEXT_1807 = ");";
  protected final String TEXT_1808 = NL + "\t\treturn ";
  protected final String TEXT_1809 = "_EDEFAULT == null ? ";
  protected final String TEXT_1810 = "() != null : !";
  protected final String TEXT_1811 = "_EDEFAULT.equals(";
  protected final String TEXT_1812 = "());";
  protected final String TEXT_1813 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1814 = ".eINSTANCE.get";
  protected final String TEXT_1815 = "());";
  protected final String TEXT_1816 = NL + "\t\t";
  protected final String TEXT_1817 = " ";
  protected final String TEXT_1818 = " = (";
  protected final String TEXT_1819 = ")eVirtualGet(";
  protected final String TEXT_1820 = ");";
  protected final String TEXT_1821 = NL + "\t\treturn ";
  protected final String TEXT_1822 = " != null && ((";
  protected final String TEXT_1823 = ".Unsettable)";
  protected final String TEXT_1824 = ").isSet();";
  protected final String TEXT_1825 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1826 = ");";
  protected final String TEXT_1827 = NL + "\t\treturn (";
  protected final String TEXT_1828 = " & ";
  protected final String TEXT_1829 = "_ESETFLAG) != 0;";
  protected final String TEXT_1830 = NL + "\t\treturn ";
  protected final String TEXT_1831 = "ESet;";
  protected final String TEXT_1832 = NL + "\t\treturn !((";
  protected final String TEXT_1833 = ".Internal)((";
  protected final String TEXT_1834 = ")get";
  protected final String TEXT_1835 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1836 = "());";
  protected final String TEXT_1837 = NL + "\t\treturn !((";
  protected final String TEXT_1838 = ".Internal)get";
  protected final String TEXT_1839 = "()).isEmpty(";
  protected final String TEXT_1840 = "());";
  protected final String TEXT_1841 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1842 = "' ";
  protected final String TEXT_1843 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1844 = NL + "\t}" + NL;
  protected final String TEXT_1845 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1846 = " ";
  protected final String TEXT_1847 = "(";
  protected final String TEXT_1848 = ")";
  protected final String TEXT_1849 = NL + "\t{";
  protected final String TEXT_1850 = NL + "\t\t";
  protected final String TEXT_1851 = "(";
  protected final String TEXT_1852 = ");";
  protected final String TEXT_1853 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1854 = NL + "\t\treturn ";
  protected final String TEXT_1855 = "(";
  protected final String TEXT_1856 = ");";
  protected final String TEXT_1857 = NL + "\t}" + NL;
  protected final String TEXT_1858 = NL + "} //";
  protected final String TEXT_1859 = NL;

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
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_204);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_205);
    }
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_207);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_208);
    }
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_210);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_214);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_216);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_217);
    }
    stringBuffer.append(TEXT_218);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_220);
    }
    stringBuffer.append(TEXT_221);
    }
    stringBuffer.append(TEXT_222);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_224);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_226);
    } else {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_229);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_230);
    //Class/getGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_233);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_236);
    } else {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_238);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_241);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_243);
    } else {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_247);
    }
    } else {
    stringBuffer.append(TEXT_248);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_249);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_251);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_253);
    } else {
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_256);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_257);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_263);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_264);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_266);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_270);
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    } else {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_280);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_282);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_288);
    } else {
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_292);
    }
    }
    stringBuffer.append(TEXT_293);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_298);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_302);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_303);
    } else {
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_305);
    }
    stringBuffer.append(TEXT_306);
    } else {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_311);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_316);
    }
    stringBuffer.append(TEXT_317);
    stringBuffer.append(TEXT_318);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_323);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_329);
    }
    }
    stringBuffer.append(TEXT_330);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_332);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_336);
    } else {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_341);
    }
    } else {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_344);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_345);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(TEXT_350);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_355);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_361);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_364);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_367);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_369);
    }
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_371);
    }
    stringBuffer.append(TEXT_372);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_386);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_400);
    }
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_405);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_413);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_416);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_423);
    }
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_427);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_428);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_431);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_437);
    } else {
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_441);
    }
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_448);
    } else {
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_454);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_464);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_468);
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_474);
    } else {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_479);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    } else {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_488);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_492);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_494);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_500);
    } else {
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_504);
    }
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_508);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_509);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_510);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_511);
    }
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_514);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_516);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_517);
    } else {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_519);
    }
    stringBuffer.append(TEXT_520);
    } else {
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_524);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_526);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_527);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_531);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_533);
    }
    }
    stringBuffer.append(TEXT_534);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_539);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_545);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_550);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_552);
    }
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_554);
    }
    stringBuffer.append(TEXT_555);
    } else {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_559);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_561);
    }
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_563);
    }
    stringBuffer.append(TEXT_564);
    }
    } else {
    stringBuffer.append(TEXT_565);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_566);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_568);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_570);
    } else {
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_573);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_574);
    //Class/setGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_578);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_581);
    } else {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_586);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_588);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_594);
    } else {
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_598);
    }
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_603);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_605);
    } else {
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_607);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_608);
    } else {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    }
    stringBuffer.append(TEXT_611);
    } else {
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_614);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_615);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset()) {
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_617);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_620);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_623);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_628);
    }
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_631);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_635);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_638);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_640);
    }
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_642);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_645);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_651);
    } else {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_655);
    }
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_665);
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_668);
    } else {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_672);
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_674);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_678);
    } else {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_681);
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_683);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_686);
    } else {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_688);
    }
    }
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_692);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_694);
    } else {
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_696);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_697);
    } else {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_699);
    }
    stringBuffer.append(TEXT_700);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_706);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_709);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_712);
    } else {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_714);
    }
    }
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_718);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_721);
    } else {
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_724);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_725);
    } else {
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_727);
    }
    stringBuffer.append(TEXT_728);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_733);
    } else {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_737);
    }
    } else {
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_740);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_741);
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet()) {
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_743);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_746);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_751);
    }
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_755);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_757);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_760);
    } else {
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_762);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_765);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_767);
    } else {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_771);
    }
    } else {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_774);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_775);
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_776);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_777);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_783);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_786);
    } else {
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    }
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_791);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_792);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_798);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_801);
    } else {
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_804);
    }
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_806);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_807);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_820);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_822);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_823);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_826);
    } else {
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_829);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_832);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_839);
    } else {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_841);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_843);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_845);
    } else {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_847);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_849);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_851);
    } else {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_853);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_857);
    } else {
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_860);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_864);
    } else {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_867);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_872);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_883);
    } else {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_888);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_891);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_896);
    }
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_900);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_902);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_905);
    } else {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_907);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_909);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_912);
    } else {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_914);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_916);
    }
    } else {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_919);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_920);
    }
    //Class/implementedGenFeature.override.javajetinc
    }//for
    for (Iterator i=genClass.getImplementedGenOperations().iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_921);
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_926);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_931);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_932);
    } else {
    stringBuffer.append(TEXT_933);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_934);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_943);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_945);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_946);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_948);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_950);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_954);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_955);
    }
    stringBuffer.append(TEXT_956);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_959);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_960);
    }
    stringBuffer.append(TEXT_961);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_964);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_966);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_968);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_970);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_971);
    }
    stringBuffer.append(TEXT_972);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_974);
    }
    stringBuffer.append(TEXT_975);
    }
    stringBuffer.append(TEXT_976);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_978);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_980);
    }
    } else {
    stringBuffer.append(TEXT_981);
    }
    }
    stringBuffer.append(TEXT_982);
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_986);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_988);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_992);
    } else {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_995);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_997);
    } else {
    if (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation()) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1002);
    }
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1004);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1008);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1013);
    }
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1016);
    }
    }
    stringBuffer.append(TEXT_1017);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1021);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1023);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1027);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1031);
    } else {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1034);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1036);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1038);
    } else {
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1040);
    }
    }
    stringBuffer.append(TEXT_1041);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1044);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1048);
    }
    stringBuffer.append(TEXT_1049);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1051);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1053);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1055);
    } else {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1058);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1061);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1064);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1067);
    } else {
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1069);
    }
    }
    stringBuffer.append(TEXT_1070);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1072);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1074);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1077);
    } else {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1079);
    }
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1083);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1087);
    } else {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1090);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1094);
    } else {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1097);
    }
    stringBuffer.append(TEXT_1098);
    }
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1100);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1102);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1105);
    } else {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1107);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1109);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1112);
    } else {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1115);
    }
    stringBuffer.append(TEXT_1116);
    }
    stringBuffer.append(TEXT_1117);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1120);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1122);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1124);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1127);
    } else {
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1130);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1133);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1140);
    } else {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1142);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1144);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1146);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1148);
    } else {
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1150);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1152);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1154);
    } else {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1156);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1160);
    } else {
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1163);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1167);
    } else {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1170);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1175);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1186);
    } else {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1191);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1192);
    //Class/eIsSet.override.javajetinc
    }
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1193);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1195);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1198);
    }
    stringBuffer.append(TEXT_1199);
    }
    stringBuffer.append(TEXT_1200);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1202);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1205);
    }
    stringBuffer.append(TEXT_1206);
    }
    stringBuffer.append(TEXT_1207);
    }
    if (genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1210);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1211);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1214);
    }
    stringBuffer.append(TEXT_1215);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1218);
    }
    stringBuffer.append(TEXT_1219);
    }
    }
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1220);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1228);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1231);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1232);
    }
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1236);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1239);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1240);
    }
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1245);
    if (genFeature.isListType() || genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1246);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1247);
    }
    stringBuffer.append(TEXT_1248);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1251);
    } else {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1253);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1254);
    }
    if (genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1255);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1257);
    } else {
    stringBuffer.append(TEXT_1258);
    }
    stringBuffer.append(TEXT_1259);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1261);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1264);
    } else {
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1266);
    }
    stringBuffer.append(TEXT_1267);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1269);
    } else {
    stringBuffer.append(TEXT_1270);
    }
    stringBuffer.append(TEXT_1271);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1273);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1276);
    } else {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1278);
    }
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1282);
    }
    stringBuffer.append(TEXT_1283);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1292);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1295);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1297);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1299);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1301);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1303);
    } else {
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1306);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1310);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1311);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1313);
    } else {
    stringBuffer.append(TEXT_1314);
    }
    stringBuffer.append(TEXT_1315);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1325);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1330);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1333);
    } else {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1336);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1342);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1348);
    } else {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1357);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1361);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1365);
    } else {
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1372);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1375);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1380);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1385);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1387);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1390);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1392);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1405);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1406);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1407);
    }
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_1410);
    } else {
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1422);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1423);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1424);
    }
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1426);
    }
    stringBuffer.append(TEXT_1427);
    }
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1432);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1433);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1434);
    }
    stringBuffer.append(TEXT_1435);
    }
    }
    } else {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1438);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1441);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1444);
    } else {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1450);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1451);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1453);
    } else {
    stringBuffer.append(TEXT_1454);
    }
    stringBuffer.append(TEXT_1455);
    }
    }
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1457);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1459);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1461);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1462);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1464);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1465);
    }
    } else {
    stringBuffer.append(TEXT_1466);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1468);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1469);
    }
    }
    } else {
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1471);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1472);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1474);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1475);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1477);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1478);
    }
    } else {
    stringBuffer.append(TEXT_1479);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1481);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1482);
    }
    }
    } else {
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1484);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1485);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1487);
    } else {
    stringBuffer.append(TEXT_1488);
    }
    }
    stringBuffer.append(TEXT_1489);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1490);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1497);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1500);
    } else {
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1503);
    }
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1505);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1512);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1515);
    } else {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1518);
    }
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1520);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1534);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1536);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1537);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1540);
    } else {
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1543);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1546);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1553);
    } else {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1555);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1557);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1559);
    } else {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1561);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1563);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1565);
    } else {
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1567);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1571);
    } else {
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1574);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1578);
    } else {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1581);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1586);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1597);
    } else {
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1602);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1605);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1610);
    }
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1614);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1616);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1619);
    } else {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1621);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1626);
    } else {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1630);
    }
    } else {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1633);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1634);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1637);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1639);
    } else {
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_1641);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1642);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1643);
    }
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_1645);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1646);
    } else {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1648);
    }
    }
    stringBuffer.append(TEXT_1649);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1652);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1653);
    } else {
    stringBuffer.append(TEXT_1654);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1656);
    }
    stringBuffer.append(TEXT_1657);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1663);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1664);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1669);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1671);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1673);
    }
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1675);
    } else {
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1677);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1679);
    }
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1681);
    }
    }
    stringBuffer.append(TEXT_1682);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1686);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1687);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1692);
    }
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1694);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1696);
    }
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1698);
    }
    stringBuffer.append(TEXT_1699);
    }
    stringBuffer.append(TEXT_1700);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1707);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1710);
    } else {
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1713);
    }
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1715);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1722);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1725);
    } else {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1728);
    }
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1730);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1744);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1746);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1747);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1750);
    } else {
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1753);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1756);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1763);
    } else {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1765);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1767);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1769);
    } else {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1771);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1773);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1775);
    } else {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1777);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1781);
    } else {
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1784);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1788);
    } else {
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1791);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1796);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1807);
    } else {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1812);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1815);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1820);
    }
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1824);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1826);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1829);
    } else {
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1831);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1836);
    } else {
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1840);
    }
    } else {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1843);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1844);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1849);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1852);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_1853);
    } else {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1856);
    }
    }
    stringBuffer.append(TEXT_1857);
    }
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genClass.getClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1859);
    return stringBuffer.toString();
  }
}
