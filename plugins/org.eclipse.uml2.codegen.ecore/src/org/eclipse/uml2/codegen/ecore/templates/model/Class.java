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
  protected final String TEXT_116 = ")eContainer();";
  protected final String TEXT_117 = NL + "\t\t";
  protected final String TEXT_118 = " ";
  protected final String TEXT_119 = " = (";
  protected final String TEXT_120 = ")eVirtualGet(";
  protected final String TEXT_121 = ", ";
  protected final String TEXT_122 = "_EDEFAULT";
  protected final String TEXT_123 = ");";
  protected final String TEXT_124 = NL + "\t\tif (";
  protected final String TEXT_125 = " != null && ";
  protected final String TEXT_126 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_127 = " old";
  protected final String TEXT_128 = " = (";
  protected final String TEXT_129 = ")";
  protected final String TEXT_130 = ";" + NL + "\t\t\t";
  protected final String TEXT_131 = " = ";
  protected final String TEXT_132 = "eResolveProxy(old";
  protected final String TEXT_133 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_134 = " != old";
  protected final String TEXT_135 = ")" + NL + "\t\t\t{";
  protected final String TEXT_136 = NL + "\t\t\t\t";
  protected final String TEXT_137 = " new";
  protected final String TEXT_138 = " = (";
  protected final String TEXT_139 = ")";
  protected final String TEXT_140 = ";";
  protected final String TEXT_141 = NL + "\t\t\t\t";
  protected final String TEXT_142 = " msgs = old";
  protected final String TEXT_143 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_144 = ", null, null);";
  protected final String TEXT_145 = NL + "\t\t\t\t";
  protected final String TEXT_146 = " msgs =  old";
  protected final String TEXT_147 = ".eInverseRemove(this, ";
  protected final String TEXT_148 = ", ";
  protected final String TEXT_149 = ".class, null);";
  protected final String TEXT_150 = NL + "\t\t\t\tif (new";
  protected final String TEXT_151 = ".eInternalContainer() != null)" + NL + "\t\t\t\t{";
  protected final String TEXT_152 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_153 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_154 = ", null, msgs);";
  protected final String TEXT_155 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_156 = ".eInverseAdd(this, ";
  protected final String TEXT_157 = ", ";
  protected final String TEXT_158 = ".class, msgs);";
  protected final String TEXT_159 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_160 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_161 = ", ";
  protected final String TEXT_162 = ");";
  protected final String TEXT_163 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_164 = "(this, ";
  protected final String TEXT_165 = ".RESOLVE, ";
  protected final String TEXT_166 = ", old";
  protected final String TEXT_167 = ", ";
  protected final String TEXT_168 = "));" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_169 = NL + "\t\treturn (";
  protected final String TEXT_170 = ")eVirtualGet(";
  protected final String TEXT_171 = ", ";
  protected final String TEXT_172 = "_EDEFAULT";
  protected final String TEXT_173 = ");";
  protected final String TEXT_174 = NL + "\t\treturn (";
  protected final String TEXT_175 = " & ";
  protected final String TEXT_176 = "_EFLAG) != 0;";
  protected final String TEXT_177 = NL + "\t\treturn ";
  protected final String TEXT_178 = ";";
  protected final String TEXT_179 = NL + "\t\t";
  protected final String TEXT_180 = " ";
  protected final String TEXT_181 = " = basicGet";
  protected final String TEXT_182 = "();" + NL + "\t\treturn ";
  protected final String TEXT_183 = " != null && ";
  protected final String TEXT_184 = ".eIsProxy() ? ";
  protected final String TEXT_185 = "eResolveProxy((";
  protected final String TEXT_186 = ")";
  protected final String TEXT_187 = ") : ";
  protected final String TEXT_188 = ";";
  protected final String TEXT_189 = NL + "\t\treturn new ";
  protected final String TEXT_190 = "((";
  protected final String TEXT_191 = ")((";
  protected final String TEXT_192 = ")get";
  protected final String TEXT_193 = "()).featureMap().list(";
  protected final String TEXT_194 = "()));";
  protected final String TEXT_195 = NL + "\t\treturn (";
  protected final String TEXT_196 = ")((";
  protected final String TEXT_197 = ")get";
  protected final String TEXT_198 = "()).list(";
  protected final String TEXT_199 = "());";
  protected final String TEXT_200 = NL + "\t\treturn ((";
  protected final String TEXT_201 = ")get";
  protected final String TEXT_202 = "()).featureMap().list(";
  protected final String TEXT_203 = "());";
  protected final String TEXT_204 = NL + "\t\treturn ((";
  protected final String TEXT_205 = ")get";
  protected final String TEXT_206 = "()).list(";
  protected final String TEXT_207 = "());";
  protected final String TEXT_208 = NL + "\t\treturn ";
  protected final String TEXT_209 = "(";
  protected final String TEXT_210 = "(";
  protected final String TEXT_211 = ")((";
  protected final String TEXT_212 = ")get";
  protected final String TEXT_213 = "()).featureMap().get(";
  protected final String TEXT_214 = "(), true)";
  protected final String TEXT_215 = ").";
  protected final String TEXT_216 = "()";
  protected final String TEXT_217 = ";";
  protected final String TEXT_218 = NL + "\t\treturn ";
  protected final String TEXT_219 = "(";
  protected final String TEXT_220 = "(";
  protected final String TEXT_221 = ")get";
  protected final String TEXT_222 = "().get(";
  protected final String TEXT_223 = "(), true)";
  protected final String TEXT_224 = ").";
  protected final String TEXT_225 = "()";
  protected final String TEXT_226 = ";";
  protected final String TEXT_227 = NL;
  protected final String TEXT_228 = NL + "\t\t";
  protected final String TEXT_229 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_230 = " result = (";
  protected final String TEXT_231 = ") cache.get(";
  protected final String TEXT_232 = "eResource(), ";
  protected final String TEXT_233 = "this, ";
  protected final String TEXT_234 = "());" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_235 = "eResource(), ";
  protected final String TEXT_236 = "this, ";
  protected final String TEXT_237 = "(), result = ";
  protected final String TEXT_238 = "new ";
  protected final String TEXT_239 = "(";
  protected final String TEXT_240 = ".";
  protected final String TEXT_241 = "(this";
  protected final String TEXT_242 = ", ";
  protected final String TEXT_243 = ")";
  protected final String TEXT_244 = ")";
  protected final String TEXT_245 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_246 = ".";
  protected final String TEXT_247 = "()";
  protected final String TEXT_248 = ";" + NL + "\t\t}";
  protected final String TEXT_249 = NL + "\t\treturn ";
  protected final String TEXT_250 = ".";
  protected final String TEXT_251 = "(this";
  protected final String TEXT_252 = ", ";
  protected final String TEXT_253 = ");";
  protected final String TEXT_254 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_255 = "' ";
  protected final String TEXT_256 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_257 = NL + "\t}" + NL;
  protected final String TEXT_258 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_259 = " basicGet";
  protected final String TEXT_260 = "()" + NL + "\t{";
  protected final String TEXT_261 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_262 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_263 = ")eInternalContainer();";
  protected final String TEXT_264 = NL + "\t\treturn (";
  protected final String TEXT_265 = ")eVirtualGet(";
  protected final String TEXT_266 = ");";
  protected final String TEXT_267 = NL + "\t\treturn ";
  protected final String TEXT_268 = ";";
  protected final String TEXT_269 = NL + "\t\treturn (";
  protected final String TEXT_270 = ")((";
  protected final String TEXT_271 = ")get";
  protected final String TEXT_272 = "()).featureMap().get(";
  protected final String TEXT_273 = "(), false);";
  protected final String TEXT_274 = NL + "\t\treturn (";
  protected final String TEXT_275 = ")get";
  protected final String TEXT_276 = "().get(";
  protected final String TEXT_277 = "(), false);";
  protected final String TEXT_278 = NL;
  protected final String TEXT_279 = NL + "\t\treturn ";
  protected final String TEXT_280 = ".";
  protected final String TEXT_281 = "(this";
  protected final String TEXT_282 = ", ";
  protected final String TEXT_283 = ");";
  protected final String TEXT_284 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_285 = "' ";
  protected final String TEXT_286 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_287 = NL + "\t}" + NL;
  protected final String TEXT_288 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_289 = " basicSet";
  protected final String TEXT_290 = "(";
  protected final String TEXT_291 = " new";
  protected final String TEXT_292 = ", ";
  protected final String TEXT_293 = " msgs)" + NL + "\t{";
  protected final String TEXT_294 = NL;
  protected final String TEXT_295 = NL + "\t\tif (new";
  protected final String TEXT_296 = " != null && !";
  protected final String TEXT_297 = "().contains(new";
  protected final String TEXT_298 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_299 = "().add(new";
  protected final String TEXT_300 = ");" + NL + "\t\t}";
  protected final String TEXT_301 = NL + "\t\tObject old";
  protected final String TEXT_302 = " = eVirtualSet(";
  protected final String TEXT_303 = ", new";
  protected final String TEXT_304 = ");";
  protected final String TEXT_305 = NL + "\t\t";
  protected final String TEXT_306 = " old";
  protected final String TEXT_307 = " = ";
  protected final String TEXT_308 = ";" + NL + "\t\t";
  protected final String TEXT_309 = " = new";
  protected final String TEXT_310 = ";";
  protected final String TEXT_311 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_312 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_313 = NL + "\t\tboolean old";
  protected final String TEXT_314 = "ESet = (";
  protected final String TEXT_315 = " & ";
  protected final String TEXT_316 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_317 = " |= ";
  protected final String TEXT_318 = "_ESETFLAG;";
  protected final String TEXT_319 = NL + "\t\tboolean old";
  protected final String TEXT_320 = "ESet = ";
  protected final String TEXT_321 = "ESet;" + NL + "\t\t";
  protected final String TEXT_322 = "ESet = true;";
  protected final String TEXT_323 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_324 = NL + "\t\t\t";
  protected final String TEXT_325 = " notification = new ";
  protected final String TEXT_326 = "(this, ";
  protected final String TEXT_327 = ".SET, ";
  protected final String TEXT_328 = ", ";
  protected final String TEXT_329 = "isSetChange ? null : old";
  protected final String TEXT_330 = "old";
  protected final String TEXT_331 = ", new";
  protected final String TEXT_332 = ", ";
  protected final String TEXT_333 = "isSetChange";
  protected final String TEXT_334 = "!old";
  protected final String TEXT_335 = "ESet";
  protected final String TEXT_336 = ");";
  protected final String TEXT_337 = NL + "\t\t\t";
  protected final String TEXT_338 = " notification = new ";
  protected final String TEXT_339 = "(this, ";
  protected final String TEXT_340 = ".SET, ";
  protected final String TEXT_341 = ", ";
  protected final String TEXT_342 = "old";
  protected final String TEXT_343 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_344 = "old";
  protected final String TEXT_345 = ", new";
  protected final String TEXT_346 = ");";
  protected final String TEXT_347 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_348 = NL;
  protected final String TEXT_349 = NL + "\t\tif (";
  protected final String TEXT_350 = " != null && ";
  protected final String TEXT_351 = " != new";
  protected final String TEXT_352 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_353 = "(null);" + NL + "\t\t}";
  protected final String TEXT_354 = NL + "\t\tif (new";
  protected final String TEXT_355 = " != null ||  old";
  protected final String TEXT_356 = " == ";
  protected final String TEXT_357 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_358 = "(new";
  protected final String TEXT_359 = ");" + NL + "\t\t}";
  protected final String TEXT_360 = NL + "\t\treturn msgs;";
  protected final String TEXT_361 = NL + "\t\treturn ((";
  protected final String TEXT_362 = ".Internal)((";
  protected final String TEXT_363 = ")get";
  protected final String TEXT_364 = "()).featureMap()).basicAdd(";
  protected final String TEXT_365 = "(), new";
  protected final String TEXT_366 = ", msgs);";
  protected final String TEXT_367 = NL + "\t\treturn ((";
  protected final String TEXT_368 = ".Internal)get";
  protected final String TEXT_369 = "()).basicAdd(";
  protected final String TEXT_370 = "(), new";
  protected final String TEXT_371 = ", msgs);";
  protected final String TEXT_372 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_373 = "' ";
  protected final String TEXT_374 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_375 = NL + "\t}" + NL;
  protected final String TEXT_376 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_377 = "(";
  protected final String TEXT_378 = " new";
  protected final String TEXT_379 = ")" + NL + "\t{";
  protected final String TEXT_380 = NL;
  protected final String TEXT_381 = NL + "\t\tnew";
  protected final String TEXT_382 = " = new";
  protected final String TEXT_383 = " == null ? ";
  protected final String TEXT_384 = "_EDEFAULT : new";
  protected final String TEXT_385 = ";";
  protected final String TEXT_386 = NL + "\t\tif (new";
  protected final String TEXT_387 = " != null && !";
  protected final String TEXT_388 = "().contains(new";
  protected final String TEXT_389 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_390 = "().add(new";
  protected final String TEXT_391 = ");" + NL + "\t\t}";
  protected final String TEXT_392 = NL + "\t\t";
  protected final String TEXT_393 = " old";
  protected final String TEXT_394 = " = eContainer();";
  protected final String TEXT_395 = NL + "\t\teSet(";
  protected final String TEXT_396 = ".eINSTANCE.get";
  protected final String TEXT_397 = "(), ";
  protected final String TEXT_398 = "new ";
  protected final String TEXT_399 = "(";
  protected final String TEXT_400 = "new";
  protected final String TEXT_401 = ")";
  protected final String TEXT_402 = ");";
  protected final String TEXT_403 = NL + "\t\tif (new";
  protected final String TEXT_404 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_405 = " && new";
  protected final String TEXT_406 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_407 = ".isAncestor(this, ";
  protected final String TEXT_408 = "new";
  protected final String TEXT_409 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_410 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_411 = NL + "\t\t\t";
  protected final String TEXT_412 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_413 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_414 = ")new";
  protected final String TEXT_415 = ").eInverseAdd(this, ";
  protected final String TEXT_416 = ", ";
  protected final String TEXT_417 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_418 = ")new";
  protected final String TEXT_419 = ", ";
  protected final String TEXT_420 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_421 = "(this, ";
  protected final String TEXT_422 = ".SET, ";
  protected final String TEXT_423 = ", new";
  protected final String TEXT_424 = ", new";
  protected final String TEXT_425 = "));";
  protected final String TEXT_426 = NL + "\t\t";
  protected final String TEXT_427 = " ";
  protected final String TEXT_428 = " = (";
  protected final String TEXT_429 = ")eVirtualGet(";
  protected final String TEXT_430 = ");";
  protected final String TEXT_431 = NL + "\t\tif (new";
  protected final String TEXT_432 = " != ";
  protected final String TEXT_433 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_434 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_435 = " != null)";
  protected final String TEXT_436 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_437 = ")";
  protected final String TEXT_438 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_439 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_440 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_441 = ")new";
  protected final String TEXT_442 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_443 = ", null, msgs);";
  protected final String TEXT_444 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_445 = ")";
  protected final String TEXT_446 = ").eInverseRemove(this, ";
  protected final String TEXT_447 = ", ";
  protected final String TEXT_448 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_449 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_450 = ")new";
  protected final String TEXT_451 = ").eInverseAdd(this, ";
  protected final String TEXT_452 = ", ";
  protected final String TEXT_453 = ".class, msgs);";
  protected final String TEXT_454 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_455 = "(";
  protected final String TEXT_456 = "new";
  protected final String TEXT_457 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_458 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_459 = NL + "\t\t\tboolean old";
  protected final String TEXT_460 = "ESet = eVirtualIsSet(";
  protected final String TEXT_461 = ");";
  protected final String TEXT_462 = NL + "\t\t\tboolean old";
  protected final String TEXT_463 = "ESet = (";
  protected final String TEXT_464 = " & ";
  protected final String TEXT_465 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_466 = " |= ";
  protected final String TEXT_467 = "_ESETFLAG;";
  protected final String TEXT_468 = NL + "\t\t\tboolean old";
  protected final String TEXT_469 = "ESet = ";
  protected final String TEXT_470 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_471 = "ESet = true;";
  protected final String TEXT_472 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_473 = "(this, ";
  protected final String TEXT_474 = ".SET, ";
  protected final String TEXT_475 = ", new";
  protected final String TEXT_476 = ", new";
  protected final String TEXT_477 = ", !old";
  protected final String TEXT_478 = "ESet));" + NL + "    \t}";
  protected final String TEXT_479 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_480 = "(this, ";
  protected final String TEXT_481 = ".SET, ";
  protected final String TEXT_482 = ", new";
  protected final String TEXT_483 = ", new";
  protected final String TEXT_484 = "));";
  protected final String TEXT_485 = NL + "\t\t";
  protected final String TEXT_486 = " old";
  protected final String TEXT_487 = " = (";
  protected final String TEXT_488 = " & ";
  protected final String TEXT_489 = "_EFLAG) != 0;" + NL + "\t\tif (new";
  protected final String TEXT_490 = ") ";
  protected final String TEXT_491 = " |= ";
  protected final String TEXT_492 = "_EFLAG; else ";
  protected final String TEXT_493 = " &= ~";
  protected final String TEXT_494 = "_EFLAG;";
  protected final String TEXT_495 = NL + "\t\t";
  protected final String TEXT_496 = " old";
  protected final String TEXT_497 = " = ";
  protected final String TEXT_498 = ";";
  protected final String TEXT_499 = NL + "\t\t";
  protected final String TEXT_500 = " ";
  protected final String TEXT_501 = " = new";
  protected final String TEXT_502 = " == null ? ";
  protected final String TEXT_503 = "_EDEFAULT : new";
  protected final String TEXT_504 = ";";
  protected final String TEXT_505 = NL + "\t\t";
  protected final String TEXT_506 = " = new";
  protected final String TEXT_507 = " == null ? ";
  protected final String TEXT_508 = "_EDEFAULT : new";
  protected final String TEXT_509 = ";";
  protected final String TEXT_510 = NL + "\t\t";
  protected final String TEXT_511 = " ";
  protected final String TEXT_512 = " = ";
  protected final String TEXT_513 = "new";
  protected final String TEXT_514 = ";";
  protected final String TEXT_515 = NL + "\t\t";
  protected final String TEXT_516 = " = ";
  protected final String TEXT_517 = "new";
  protected final String TEXT_518 = ";";
  protected final String TEXT_519 = NL + "\t\tObject old";
  protected final String TEXT_520 = " = eVirtualSet(";
  protected final String TEXT_521 = ", ";
  protected final String TEXT_522 = ");";
  protected final String TEXT_523 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_524 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_525 = NL + "\t\tboolean old";
  protected final String TEXT_526 = "ESet = (";
  protected final String TEXT_527 = " & ";
  protected final String TEXT_528 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_529 = " |= ";
  protected final String TEXT_530 = "_ESETFLAG;";
  protected final String TEXT_531 = NL + "\t\tboolean old";
  protected final String TEXT_532 = "ESet = ";
  protected final String TEXT_533 = "ESet;" + NL + "\t\t";
  protected final String TEXT_534 = "ESet = true;";
  protected final String TEXT_535 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_536 = "(this, ";
  protected final String TEXT_537 = ".SET, ";
  protected final String TEXT_538 = ", ";
  protected final String TEXT_539 = "isSetChange ? ";
  protected final String TEXT_540 = "null";
  protected final String TEXT_541 = "_EDEFAULT";
  protected final String TEXT_542 = " : old";
  protected final String TEXT_543 = "old";
  protected final String TEXT_544 = ", ";
  protected final String TEXT_545 = "new";
  protected final String TEXT_546 = ", ";
  protected final String TEXT_547 = "isSetChange";
  protected final String TEXT_548 = "!old";
  protected final String TEXT_549 = "ESet";
  protected final String TEXT_550 = "));";
  protected final String TEXT_551 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_552 = "(this, ";
  protected final String TEXT_553 = ".SET, ";
  protected final String TEXT_554 = ", ";
  protected final String TEXT_555 = "old";
  protected final String TEXT_556 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_557 = "null";
  protected final String TEXT_558 = "_EDEFAULT";
  protected final String TEXT_559 = " : old";
  protected final String TEXT_560 = "old";
  protected final String TEXT_561 = ", ";
  protected final String TEXT_562 = "new";
  protected final String TEXT_563 = "));";
  protected final String TEXT_564 = NL;
  protected final String TEXT_565 = NL + "\t\tif (";
  protected final String TEXT_566 = " != null && ";
  protected final String TEXT_567 = " != new";
  protected final String TEXT_568 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_569 = "(null);" + NL + "\t\t}";
  protected final String TEXT_570 = NL + "\t\tif (new";
  protected final String TEXT_571 = " != null || old";
  protected final String TEXT_572 = " == ";
  protected final String TEXT_573 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_574 = "(new";
  protected final String TEXT_575 = ");" + NL + "\t\t}";
  protected final String TEXT_576 = NL + "\t\t((";
  protected final String TEXT_577 = ".Internal)((";
  protected final String TEXT_578 = ")get";
  protected final String TEXT_579 = "()).featureMap()).set(";
  protected final String TEXT_580 = "(), ";
  protected final String TEXT_581 = "new ";
  protected final String TEXT_582 = "(";
  protected final String TEXT_583 = "new";
  protected final String TEXT_584 = ")";
  protected final String TEXT_585 = ");";
  protected final String TEXT_586 = NL + "\t\t((";
  protected final String TEXT_587 = ".Internal)get";
  protected final String TEXT_588 = "()).set(";
  protected final String TEXT_589 = "(), ";
  protected final String TEXT_590 = "new ";
  protected final String TEXT_591 = "(";
  protected final String TEXT_592 = "new";
  protected final String TEXT_593 = ")";
  protected final String TEXT_594 = ");";
  protected final String TEXT_595 = NL;
  protected final String TEXT_596 = NL + "\t\t";
  protected final String TEXT_597 = ".";
  protected final String TEXT_598 = "(this";
  protected final String TEXT_599 = ", ";
  protected final String TEXT_600 = ");";
  protected final String TEXT_601 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_602 = "' ";
  protected final String TEXT_603 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_604 = NL + "\t}" + NL;
  protected final String TEXT_605 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_606 = " basicUnset";
  protected final String TEXT_607 = "(";
  protected final String TEXT_608 = " msgs)" + NL + "\t{";
  protected final String TEXT_609 = NL + "\t\tObject old";
  protected final String TEXT_610 = " = eVirtualUnset(";
  protected final String TEXT_611 = ");";
  protected final String TEXT_612 = NL + "\t\t";
  protected final String TEXT_613 = " old";
  protected final String TEXT_614 = " = ";
  protected final String TEXT_615 = ";" + NL + "\t\t";
  protected final String TEXT_616 = " = null;";
  protected final String TEXT_617 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_618 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_619 = NL + "\t\tboolean old";
  protected final String TEXT_620 = "ESet = (";
  protected final String TEXT_621 = " & ";
  protected final String TEXT_622 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_623 = " &= ~";
  protected final String TEXT_624 = "_ESETFLAG;";
  protected final String TEXT_625 = NL + "\t\tboolean old";
  protected final String TEXT_626 = "ESet = ";
  protected final String TEXT_627 = "ESet;" + NL + "\t\t";
  protected final String TEXT_628 = "ESet = false;";
  protected final String TEXT_629 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_630 = " notification = new ";
  protected final String TEXT_631 = "(this, ";
  protected final String TEXT_632 = ".UNSET, ";
  protected final String TEXT_633 = ", ";
  protected final String TEXT_634 = "isSetChange ? old";
  protected final String TEXT_635 = " : null";
  protected final String TEXT_636 = "old";
  protected final String TEXT_637 = ", null, ";
  protected final String TEXT_638 = "isSetChange";
  protected final String TEXT_639 = "old";
  protected final String TEXT_640 = "ESet";
  protected final String TEXT_641 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_642 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_643 = "' ";
  protected final String TEXT_644 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_645 = NL + "\t}" + NL;
  protected final String TEXT_646 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void unset";
  protected final String TEXT_647 = "()" + NL + "\t{";
  protected final String TEXT_648 = NL + "\t\teUnset(";
  protected final String TEXT_649 = ".eINSTANCE.get";
  protected final String TEXT_650 = "());";
  protected final String TEXT_651 = NL + "\t\t((";
  protected final String TEXT_652 = ".Unsettable)get";
  protected final String TEXT_653 = "()).unset();";
  protected final String TEXT_654 = NL + "\t\t";
  protected final String TEXT_655 = " ";
  protected final String TEXT_656 = " = (";
  protected final String TEXT_657 = ")eVirtualGet(";
  protected final String TEXT_658 = ");";
  protected final String TEXT_659 = NL + "\t\tif (";
  protected final String TEXT_660 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_661 = " msgs = null;";
  protected final String TEXT_662 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_663 = ")";
  protected final String TEXT_664 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_665 = ", null, msgs);";
  protected final String TEXT_666 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_667 = ")";
  protected final String TEXT_668 = ").eInverseRemove(this, ";
  protected final String TEXT_669 = ", ";
  protected final String TEXT_670 = ".class, msgs);";
  protected final String TEXT_671 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_672 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_673 = NL + "\t\t\tboolean old";
  protected final String TEXT_674 = "ESet = eVirtualIsSet(";
  protected final String TEXT_675 = ");";
  protected final String TEXT_676 = NL + "\t\t\tboolean old";
  protected final String TEXT_677 = "ESet = (";
  protected final String TEXT_678 = " & ";
  protected final String TEXT_679 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_680 = " &= ~";
  protected final String TEXT_681 = "_ESETFLAG;";
  protected final String TEXT_682 = NL + "\t\t\tboolean old";
  protected final String TEXT_683 = "ESet = ";
  protected final String TEXT_684 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_685 = "ESet = false;";
  protected final String TEXT_686 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_687 = "(this, ";
  protected final String TEXT_688 = ".UNSET, ";
  protected final String TEXT_689 = ", null, null, old";
  protected final String TEXT_690 = "ESet));" + NL + "    \t}";
  protected final String TEXT_691 = NL + "\t\t";
  protected final String TEXT_692 = " old";
  protected final String TEXT_693 = " = (";
  protected final String TEXT_694 = " & ";
  protected final String TEXT_695 = "_EFLAG) != 0;";
  protected final String TEXT_696 = NL + "\t\tObject old";
  protected final String TEXT_697 = " = eVirtualUnset(";
  protected final String TEXT_698 = ");";
  protected final String TEXT_699 = NL + "\t\t";
  protected final String TEXT_700 = " old";
  protected final String TEXT_701 = " = ";
  protected final String TEXT_702 = ";";
  protected final String TEXT_703 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_704 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_705 = NL + "\t\tboolean old";
  protected final String TEXT_706 = "ESet = (";
  protected final String TEXT_707 = " & ";
  protected final String TEXT_708 = "_ESETFLAG) != 0;";
  protected final String TEXT_709 = NL + "\t\tboolean old";
  protected final String TEXT_710 = "ESet = ";
  protected final String TEXT_711 = "ESet;";
  protected final String TEXT_712 = NL + "\t\t";
  protected final String TEXT_713 = " = null;";
  protected final String TEXT_714 = NL + "\t\t";
  protected final String TEXT_715 = " &= ~";
  protected final String TEXT_716 = "_ESETFLAG;";
  protected final String TEXT_717 = NL + "\t\t";
  protected final String TEXT_718 = "ESet = false;";
  protected final String TEXT_719 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_720 = "(this, ";
  protected final String TEXT_721 = ".UNSET, ";
  protected final String TEXT_722 = ", ";
  protected final String TEXT_723 = "isSetChange ? old";
  protected final String TEXT_724 = " : null";
  protected final String TEXT_725 = "old";
  protected final String TEXT_726 = ", null, ";
  protected final String TEXT_727 = "isSetChange";
  protected final String TEXT_728 = "old";
  protected final String TEXT_729 = "ESet";
  protected final String TEXT_730 = "));";
  protected final String TEXT_731 = NL + "\t\tif (";
  protected final String TEXT_732 = "_EDEFAULT) ";
  protected final String TEXT_733 = " |= ";
  protected final String TEXT_734 = "_EFLAG; else ";
  protected final String TEXT_735 = " &= ~";
  protected final String TEXT_736 = "_EFLAG;";
  protected final String TEXT_737 = NL + "\t\t";
  protected final String TEXT_738 = " = ";
  protected final String TEXT_739 = "_EDEFAULT;";
  protected final String TEXT_740 = NL + "\t\t";
  protected final String TEXT_741 = " &= ~";
  protected final String TEXT_742 = "_ESETFLAG;";
  protected final String TEXT_743 = NL + "\t\t";
  protected final String TEXT_744 = "ESet = false;";
  protected final String TEXT_745 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_746 = "(this, ";
  protected final String TEXT_747 = ".UNSET, ";
  protected final String TEXT_748 = ", ";
  protected final String TEXT_749 = "isSetChange ? old";
  protected final String TEXT_750 = " : ";
  protected final String TEXT_751 = "_EDEFAULT";
  protected final String TEXT_752 = "old";
  protected final String TEXT_753 = ", ";
  protected final String TEXT_754 = "_EDEFAULT, ";
  protected final String TEXT_755 = "isSetChange";
  protected final String TEXT_756 = "old";
  protected final String TEXT_757 = "ESet";
  protected final String TEXT_758 = "));";
  protected final String TEXT_759 = NL + "\t\t((";
  protected final String TEXT_760 = ".Internal)((";
  protected final String TEXT_761 = ")get";
  protected final String TEXT_762 = "()).featureMap()).clear(";
  protected final String TEXT_763 = "());";
  protected final String TEXT_764 = NL + "\t\t((";
  protected final String TEXT_765 = ".Internal)get";
  protected final String TEXT_766 = "()).clear(";
  protected final String TEXT_767 = "());";
  protected final String TEXT_768 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_769 = "' ";
  protected final String TEXT_770 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_771 = NL + "\t}" + NL;
  protected final String TEXT_772 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_773 = "()" + NL + "\t{";
  protected final String TEXT_774 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_775 = ".eINSTANCE.get";
  protected final String TEXT_776 = "());";
  protected final String TEXT_777 = NL + "\t\t";
  protected final String TEXT_778 = " ";
  protected final String TEXT_779 = " = (";
  protected final String TEXT_780 = ")eVirtualGet(";
  protected final String TEXT_781 = ");";
  protected final String TEXT_782 = NL + "\t\treturn ";
  protected final String TEXT_783 = " != null && ((";
  protected final String TEXT_784 = ".Unsettable)";
  protected final String TEXT_785 = ").isSet();";
  protected final String TEXT_786 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_787 = ");";
  protected final String TEXT_788 = NL + "\t\treturn (";
  protected final String TEXT_789 = " & ";
  protected final String TEXT_790 = "_ESETFLAG) != 0;";
  protected final String TEXT_791 = NL + "\t\treturn ";
  protected final String TEXT_792 = "ESet;";
  protected final String TEXT_793 = NL + "\t\treturn !((";
  protected final String TEXT_794 = ".Internal)((";
  protected final String TEXT_795 = ")get";
  protected final String TEXT_796 = "()).featureMap()).isEmpty(";
  protected final String TEXT_797 = "());";
  protected final String TEXT_798 = NL + "\t\treturn !((";
  protected final String TEXT_799 = ".Internal)get";
  protected final String TEXT_800 = "()).isEmpty(";
  protected final String TEXT_801 = "());";
  protected final String TEXT_802 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_803 = "' ";
  protected final String TEXT_804 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_805 = NL + "\t}" + NL;
  protected final String TEXT_806 = NL;
  protected final String TEXT_807 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_808 = " create";
  protected final String TEXT_809 = "(";
  protected final String TEXT_810 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_811 = " new";
  protected final String TEXT_812 = " = (";
  protected final String TEXT_813 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_814 = NL + "\t\t";
  protected final String TEXT_815 = "().add(new";
  protected final String TEXT_816 = ");";
  protected final String TEXT_817 = NL + "\t\tset";
  protected final String TEXT_818 = "(new";
  protected final String TEXT_819 = ");";
  protected final String TEXT_820 = NL + "\t\treturn new";
  protected final String TEXT_821 = ";" + NL + "\t}" + NL;
  protected final String TEXT_822 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_823 = " create";
  protected final String TEXT_824 = "() {" + NL + "\t\t";
  protected final String TEXT_825 = " new";
  protected final String TEXT_826 = " = ";
  protected final String TEXT_827 = ".eINSTANCE.create";
  protected final String TEXT_828 = "();";
  protected final String TEXT_829 = NL + "\t\t";
  protected final String TEXT_830 = "().add(new";
  protected final String TEXT_831 = ");";
  protected final String TEXT_832 = NL + "\t\tset";
  protected final String TEXT_833 = "(new";
  protected final String TEXT_834 = ");";
  protected final String TEXT_835 = NL + "\t\treturn new";
  protected final String TEXT_836 = ";" + NL + "\t}" + NL;
  protected final String TEXT_837 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_838 = " get";
  protected final String TEXT_839 = "(";
  protected final String TEXT_840 = " ";
  protected final String TEXT_841 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_842 = " i = ";
  protected final String TEXT_843 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_844 = " ";
  protected final String TEXT_845 = " = (";
  protected final String TEXT_846 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_847 = ".equals(";
  protected final String TEXT_848 = ".";
  protected final String TEXT_849 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_850 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_851 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_852 = "()" + NL + "\t{";
  protected final String TEXT_853 = NL + "  \t\treturn false;";
  protected final String TEXT_854 = NL + "\t\treturn !((";
  protected final String TEXT_855 = ")";
  protected final String TEXT_856 = "()).featureMap().isEmpty();";
  protected final String TEXT_857 = NL + "\t\treturn ";
  protected final String TEXT_858 = " != null && !";
  protected final String TEXT_859 = ".featureMap().isEmpty();";
  protected final String TEXT_860 = NL + "\t\treturn ";
  protected final String TEXT_861 = " != null && !";
  protected final String TEXT_862 = ".isEmpty();";
  protected final String TEXT_863 = NL + "\t\t";
  protected final String TEXT_864 = " ";
  protected final String TEXT_865 = " = (";
  protected final String TEXT_866 = ")eVirtualGet(";
  protected final String TEXT_867 = ");" + NL + "\t\treturn ";
  protected final String TEXT_868 = " != null && !";
  protected final String TEXT_869 = ".isEmpty();";
  protected final String TEXT_870 = NL + "\t\treturn !";
  protected final String TEXT_871 = "().isEmpty();";
  protected final String TEXT_872 = NL + "\t\treturn ";
  protected final String TEXT_873 = " != null;";
  protected final String TEXT_874 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_875 = ") != null;";
  protected final String TEXT_876 = NL + "\t\treturn basicGet";
  protected final String TEXT_877 = "() != null;";
  protected final String TEXT_878 = NL + "\t\treturn ";
  protected final String TEXT_879 = " != null;";
  protected final String TEXT_880 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_881 = ") != null;";
  protected final String TEXT_882 = NL + "\t\treturn ";
  protected final String TEXT_883 = "() != null;";
  protected final String TEXT_884 = NL + "\t\treturn ((";
  protected final String TEXT_885 = " & ";
  protected final String TEXT_886 = "_EFLAG) != 0) != ";
  protected final String TEXT_887 = "_EDEFAULT;";
  protected final String TEXT_888 = NL + "\t\treturn ";
  protected final String TEXT_889 = " != ";
  protected final String TEXT_890 = "_EDEFAULT;";
  protected final String TEXT_891 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_892 = ", ";
  protected final String TEXT_893 = "_EDEFAULT) != ";
  protected final String TEXT_894 = "_EDEFAULT;";
  protected final String TEXT_895 = NL + "\t\treturn ";
  protected final String TEXT_896 = "() != ";
  protected final String TEXT_897 = "_EDEFAULT;";
  protected final String TEXT_898 = NL + "\t\treturn ";
  protected final String TEXT_899 = "_EDEFAULT == null ? ";
  protected final String TEXT_900 = " != null : !";
  protected final String TEXT_901 = "_EDEFAULT.equals(";
  protected final String TEXT_902 = ");";
  protected final String TEXT_903 = NL + "\t\t";
  protected final String TEXT_904 = " ";
  protected final String TEXT_905 = " = (";
  protected final String TEXT_906 = ")eVirtualGet(";
  protected final String TEXT_907 = ", ";
  protected final String TEXT_908 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_909 = "_EDEFAULT == null ? ";
  protected final String TEXT_910 = " != null : !";
  protected final String TEXT_911 = "_EDEFAULT.equals(";
  protected final String TEXT_912 = ");";
  protected final String TEXT_913 = NL + "\t\treturn ";
  protected final String TEXT_914 = "_EDEFAULT == null ? ";
  protected final String TEXT_915 = "() != null : !";
  protected final String TEXT_916 = "_EDEFAULT.equals(";
  protected final String TEXT_917 = "());";
  protected final String TEXT_918 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_919 = ".eINSTANCE.get";
  protected final String TEXT_920 = "());";
  protected final String TEXT_921 = NL + "\t\t";
  protected final String TEXT_922 = " ";
  protected final String TEXT_923 = " = (";
  protected final String TEXT_924 = ")eVirtualGet(";
  protected final String TEXT_925 = ");";
  protected final String TEXT_926 = NL + "\t\treturn ";
  protected final String TEXT_927 = " != null && ((";
  protected final String TEXT_928 = ".Unsettable)";
  protected final String TEXT_929 = ").isSet();";
  protected final String TEXT_930 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_931 = ");";
  protected final String TEXT_932 = NL + "\t\treturn (";
  protected final String TEXT_933 = " & ";
  protected final String TEXT_934 = "_ESETFLAG) != 0;";
  protected final String TEXT_935 = NL + "\t\treturn ";
  protected final String TEXT_936 = "ESet;";
  protected final String TEXT_937 = NL + "\t\treturn !((";
  protected final String TEXT_938 = ".Internal)((";
  protected final String TEXT_939 = ")get";
  protected final String TEXT_940 = "()).featureMap()).isEmpty(";
  protected final String TEXT_941 = "());";
  protected final String TEXT_942 = NL + "\t\treturn !((";
  protected final String TEXT_943 = ".Internal)get";
  protected final String TEXT_944 = "()).isEmpty(";
  protected final String TEXT_945 = "());";
  protected final String TEXT_946 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_947 = "' ";
  protected final String TEXT_948 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_949 = NL + "\t}" + NL;
  protected final String TEXT_950 = NL;
  protected final String TEXT_951 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_952 = " ";
  protected final String TEXT_953 = "(";
  protected final String TEXT_954 = ")";
  protected final String TEXT_955 = NL + "\t{";
  protected final String TEXT_956 = NL + "\t\t";
  protected final String TEXT_957 = NL + "\t\treturn ";
  protected final String TEXT_958 = ".";
  protected final String TEXT_959 = "(this, ";
  protected final String TEXT_960 = ", ";
  protected final String TEXT_961 = ");";
  protected final String TEXT_962 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_963 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_964 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_965 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_966 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_967 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_968 = ".";
  protected final String TEXT_969 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_970 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_971 = "\", ";
  protected final String TEXT_972 = ".getObjectLabel(this, ";
  protected final String TEXT_973 = ") }),";
  protected final String TEXT_974 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_975 = NL + "\t\t";
  protected final String TEXT_976 = ".";
  protected final String TEXT_977 = "(this";
  protected final String TEXT_978 = ", ";
  protected final String TEXT_979 = ");";
  protected final String TEXT_980 = NL + "\t\t";
  protected final String TEXT_981 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_982 = " result = (";
  protected final String TEXT_983 = ") cache.get(";
  protected final String TEXT_984 = "eResource(), ";
  protected final String TEXT_985 = "this, ";
  protected final String TEXT_986 = ".eINSTANCE.get";
  protected final String TEXT_987 = "().getEOperations().get(";
  protected final String TEXT_988 = "));" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_989 = "eResource(), ";
  protected final String TEXT_990 = "this, ";
  protected final String TEXT_991 = ".eINSTANCE.get";
  protected final String TEXT_992 = "().getEOperations().get(";
  protected final String TEXT_993 = "), result = ";
  protected final String TEXT_994 = "new ";
  protected final String TEXT_995 = "(";
  protected final String TEXT_996 = ".";
  protected final String TEXT_997 = "(this";
  protected final String TEXT_998 = ", ";
  protected final String TEXT_999 = ")";
  protected final String TEXT_1000 = ")";
  protected final String TEXT_1001 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1002 = ".";
  protected final String TEXT_1003 = "()";
  protected final String TEXT_1004 = ";" + NL + "\t\t}";
  protected final String TEXT_1005 = NL + "\t\treturn ";
  protected final String TEXT_1006 = ".";
  protected final String TEXT_1007 = "(this";
  protected final String TEXT_1008 = ", ";
  protected final String TEXT_1009 = ");";
  protected final String TEXT_1010 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1011 = NL + "\t}" + NL;
  protected final String TEXT_1012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1013 = " eInverseAdd(";
  protected final String TEXT_1014 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_1015 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_1016 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1017 = ":";
  protected final String TEXT_1018 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1019 = ")((";
  protected final String TEXT_1020 = ")";
  protected final String TEXT_1021 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1022 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1023 = ")";
  protected final String TEXT_1024 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1025 = NL + "\t\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1026 = ", msgs);";
  protected final String TEXT_1027 = NL + "\t\t\t\t\t";
  protected final String TEXT_1028 = " ";
  protected final String TEXT_1029 = " = (";
  protected final String TEXT_1030 = ")eVirtualGet(";
  protected final String TEXT_1031 = ");";
  protected final String TEXT_1032 = NL + "\t\t\t\t\tif (";
  protected final String TEXT_1033 = " != null)";
  protected final String TEXT_1034 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1035 = ")";
  protected final String TEXT_1036 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1037 = ", null, msgs);";
  protected final String TEXT_1038 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1039 = ")";
  protected final String TEXT_1040 = ").eInverseRemove(this, ";
  protected final String TEXT_1041 = ", ";
  protected final String TEXT_1042 = ".class, msgs);";
  protected final String TEXT_1043 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_1044 = "((";
  protected final String TEXT_1045 = ")otherEnd, msgs);";
  protected final String TEXT_1046 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (eInternalContainer() != null)" + NL + "\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\treturn eBasicSetContainer(otherEnd, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1047 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1048 = " eInverseRemove(";
  protected final String TEXT_1049 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_1050 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_1051 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1052 = ":";
  protected final String TEXT_1053 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1054 = ")((";
  protected final String TEXT_1055 = ")";
  protected final String TEXT_1056 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1057 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1058 = ")((";
  protected final String TEXT_1059 = ")";
  protected final String TEXT_1060 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1061 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1062 = ")";
  protected final String TEXT_1063 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1064 = NL + "\t\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1065 = ", msgs);";
  protected final String TEXT_1066 = NL + "\t\t\t\t\treturn basicUnset";
  protected final String TEXT_1067 = "(msgs);";
  protected final String TEXT_1068 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_1069 = "(null, msgs);";
  protected final String TEXT_1070 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eBasicSetContainer(null, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1071 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1072 = " eBasicRemoveFromContainer(";
  protected final String TEXT_1073 = " msgs)" + NL + "\t{" + NL + "\t\tif (eContainerFeatureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eContainerFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1074 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1075 = ":" + NL + "\t\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1076 = ", ";
  protected final String TEXT_1077 = ".class, msgs);";
  protected final String TEXT_1078 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicBasicRemoveFromContainer(msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1079 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(";
  protected final String TEXT_1080 = " eFeature, boolean resolve)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1081 = NL + "\t\t\tcase ";
  protected final String TEXT_1082 = ":";
  protected final String TEXT_1083 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1084 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1085 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1086 = "(";
  protected final String TEXT_1087 = "());";
  protected final String TEXT_1088 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1089 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1090 = "();";
  protected final String TEXT_1091 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1092 = ")";
  protected final String TEXT_1093 = "()).eMap();";
  protected final String TEXT_1094 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1095 = ")";
  protected final String TEXT_1096 = "()).featureMap();";
  protected final String TEXT_1097 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1098 = "();";
  protected final String TEXT_1099 = NL + "\t\t}" + NL + "\t\treturn eDynamicGet(eFeature, resolve);" + NL + "\t}" + NL;
  protected final String TEXT_1100 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(";
  protected final String TEXT_1101 = " eFeature, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1102 = NL + "\t\t\tcase ";
  protected final String TEXT_1103 = ":";
  protected final String TEXT_1104 = NL + "\t\t\t\t((";
  protected final String TEXT_1105 = ")";
  protected final String TEXT_1106 = "()).featureMap().clear();";
  protected final String TEXT_1107 = NL + "\t\t\t\t";
  protected final String TEXT_1108 = "().clear();";
  protected final String TEXT_1109 = NL + "\t\t\t\t((";
  protected final String TEXT_1110 = ")";
  protected final String TEXT_1111 = "()).featureMap().addAll((";
  protected final String TEXT_1112 = ")newValue);";
  protected final String TEXT_1113 = NL + "\t\t\t\t((";
  protected final String TEXT_1114 = ")";
  protected final String TEXT_1115 = "()).eMap().addAll((";
  protected final String TEXT_1116 = ")newValue);";
  protected final String TEXT_1117 = NL + "\t\t\t\t";
  protected final String TEXT_1118 = "().addAll((";
  protected final String TEXT_1119 = ")newValue);";
  protected final String TEXT_1120 = NL + "\t\t\t\tset";
  protected final String TEXT_1121 = "(((";
  protected final String TEXT_1122 = ")newValue).";
  protected final String TEXT_1123 = "());";
  protected final String TEXT_1124 = NL + "\t\t\t\tset";
  protected final String TEXT_1125 = "((";
  protected final String TEXT_1126 = ")newValue);";
  protected final String TEXT_1127 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1128 = NL + "\t\t}" + NL + "\t\teDynamicSet(eFeature, newValue);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(";
  protected final String TEXT_1129 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1130 = NL + "\t\t\tcase ";
  protected final String TEXT_1131 = ":";
  protected final String TEXT_1132 = NL + "\t\t\t\t((";
  protected final String TEXT_1133 = ")";
  protected final String TEXT_1134 = "()).featureMap().clear();";
  protected final String TEXT_1135 = NL + "\t\t\t\t";
  protected final String TEXT_1136 = "().clear();";
  protected final String TEXT_1137 = NL + "\t\t\t\tunset";
  protected final String TEXT_1138 = "();";
  protected final String TEXT_1139 = NL + "\t\t\t\tset";
  protected final String TEXT_1140 = "((";
  protected final String TEXT_1141 = ")null);";
  protected final String TEXT_1142 = NL + "\t\t\t\tset";
  protected final String TEXT_1143 = "(";
  protected final String TEXT_1144 = "_EDEFAULT);";
  protected final String TEXT_1145 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1146 = NL + "\t\t}" + NL + "\t\teDynamicUnset(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1147 = NL;
  protected final String TEXT_1148 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(";
  protected final String TEXT_1149 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1150 = NL + "\t\t\tcase ";
  protected final String TEXT_1151 = ":";
  protected final String TEXT_1152 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1153 = "();";
  protected final String TEXT_1154 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1155 = ")";
  protected final String TEXT_1156 = "()).featureMap().isEmpty();";
  protected final String TEXT_1157 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1158 = " != null && !";
  protected final String TEXT_1159 = ".featureMap().isEmpty();";
  protected final String TEXT_1160 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1161 = " != null && !";
  protected final String TEXT_1162 = ".isEmpty();";
  protected final String TEXT_1163 = NL + "\t\t\t\t";
  protected final String TEXT_1164 = " ";
  protected final String TEXT_1165 = " = (";
  protected final String TEXT_1166 = ")eVirtualGet(";
  protected final String TEXT_1167 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1168 = " != null && !";
  protected final String TEXT_1169 = ".isEmpty();";
  protected final String TEXT_1170 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1171 = "().isEmpty();";
  protected final String TEXT_1172 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1173 = "();";
  protected final String TEXT_1174 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1175 = " != null;";
  protected final String TEXT_1176 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1177 = ") != null;";
  protected final String TEXT_1178 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1179 = "() != null;";
  protected final String TEXT_1180 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1181 = " != null;";
  protected final String TEXT_1182 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1183 = ") != null;";
  protected final String TEXT_1184 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1185 = "() != null;";
  protected final String TEXT_1186 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1187 = " & ";
  protected final String TEXT_1188 = "_EFLAG) != 0) != ";
  protected final String TEXT_1189 = "_EDEFAULT;";
  protected final String TEXT_1190 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1191 = " != ";
  protected final String TEXT_1192 = "_EDEFAULT;";
  protected final String TEXT_1193 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1194 = ", ";
  protected final String TEXT_1195 = "_EDEFAULT) != ";
  protected final String TEXT_1196 = "_EDEFAULT;";
  protected final String TEXT_1197 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1198 = "() != ";
  protected final String TEXT_1199 = "_EDEFAULT;";
  protected final String TEXT_1200 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1201 = "_EDEFAULT == null ? ";
  protected final String TEXT_1202 = " != null : !";
  protected final String TEXT_1203 = "_EDEFAULT.equals(";
  protected final String TEXT_1204 = ");";
  protected final String TEXT_1205 = NL + "\t\t\t\t";
  protected final String TEXT_1206 = " ";
  protected final String TEXT_1207 = " = (";
  protected final String TEXT_1208 = ")eVirtualGet(";
  protected final String TEXT_1209 = ", ";
  protected final String TEXT_1210 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1211 = "_EDEFAULT == null ? ";
  protected final String TEXT_1212 = " != null : !";
  protected final String TEXT_1213 = "_EDEFAULT.equals(";
  protected final String TEXT_1214 = ");";
  protected final String TEXT_1215 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1216 = "_EDEFAULT == null ? ";
  protected final String TEXT_1217 = "() != null : !";
  protected final String TEXT_1218 = "_EDEFAULT.equals(";
  protected final String TEXT_1219 = "());";
  protected final String TEXT_1220 = NL + "\t\t}" + NL + "\t\treturn eDynamicIsSet(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1221 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1222 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1223 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1224 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1225 = ": return ";
  protected final String TEXT_1226 = ";";
  protected final String TEXT_1227 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1228 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1229 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1230 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1231 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1232 = ": return ";
  protected final String TEXT_1233 = ";";
  protected final String TEXT_1234 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1235 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1236 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1237 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1238 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1239 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1240 = NL + "\t\t\tcase ";
  protected final String TEXT_1241 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1242 = ";";
  protected final String TEXT_1243 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1244 = NL + "\t\t\tcase ";
  protected final String TEXT_1245 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1246 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1247 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1248 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1249 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1250 = ": \");";
  protected final String TEXT_1251 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1252 = ": \");";
  protected final String TEXT_1253 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1254 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1255 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1256 = NL + "\t\tif (";
  protected final String TEXT_1257 = "(";
  protected final String TEXT_1258 = " & ";
  protected final String TEXT_1259 = "_ESETFLAG) != 0";
  protected final String TEXT_1260 = "ESet";
  protected final String TEXT_1261 = ") result.append((";
  protected final String TEXT_1262 = " & ";
  protected final String TEXT_1263 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1264 = NL + "\t\tif (";
  protected final String TEXT_1265 = "(";
  protected final String TEXT_1266 = " & ";
  protected final String TEXT_1267 = "_ESETFLAG) != 0";
  protected final String TEXT_1268 = "ESet";
  protected final String TEXT_1269 = ") result.append(";
  protected final String TEXT_1270 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1271 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1272 = ", ";
  protected final String TEXT_1273 = "_EDEFAULT";
  protected final String TEXT_1274 = "));";
  protected final String TEXT_1275 = NL + "\t\tresult.append((";
  protected final String TEXT_1276 = " & ";
  protected final String TEXT_1277 = "_EFLAG) != 0);";
  protected final String TEXT_1278 = NL + "\t\tresult.append(";
  protected final String TEXT_1279 = ");";
  protected final String TEXT_1280 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1281 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1282 = NL + "\t\treturn new ";
  protected final String TEXT_1283 = "(getTypedKey());";
  protected final String TEXT_1284 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1285 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1286 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1287 = ")key);";
  protected final String TEXT_1288 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1289 = ")key).";
  protected final String TEXT_1290 = "());";
  protected final String TEXT_1291 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1292 = ")key);";
  protected final String TEXT_1293 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1294 = NL + "\t\treturn new ";
  protected final String TEXT_1295 = "(getTypedValue());";
  protected final String TEXT_1296 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1297 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1298 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1299 = ")value);";
  protected final String TEXT_1300 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1301 = ")value).";
  protected final String TEXT_1302 = "());";
  protected final String TEXT_1303 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1304 = ")value);";
  protected final String TEXT_1305 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1306 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1307 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1308 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1309 = NL;
  protected final String TEXT_1310 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1311 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1312 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1313 = " getCacheAdapter() {" + NL + "\t\tfor (";
  protected final String TEXT_1314 = " i = eAdapters().iterator(); i.hasNext();) {" + NL + "\t\t\t";
  protected final String TEXT_1315 = " adapter = (";
  protected final String TEXT_1316 = ") i.next();" + NL + "\t\t\tif (adapter instanceof ";
  protected final String TEXT_1317 = ") {" + NL + "\t\t\t\treturn (";
  protected final String TEXT_1318 = ") adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1319 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1320 = " basicGet";
  protected final String TEXT_1321 = "()" + NL + "\t{";
  protected final String TEXT_1322 = NL + "\t\tif (isSet";
  protected final String TEXT_1323 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1324 = "basicGet";
  protected final String TEXT_1325 = "();" + NL + "\t\t}";
  protected final String TEXT_1326 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1327 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1328 = "basicGet";
  protected final String TEXT_1329 = "();" + NL + "\t\t}";
  protected final String TEXT_1330 = NL + "\t\t";
  protected final String TEXT_1331 = " ";
  protected final String TEXT_1332 = " = ";
  protected final String TEXT_1333 = "basicGet";
  protected final String TEXT_1334 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1335 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1336 = ";" + NL + "\t\t}";
  protected final String TEXT_1337 = NL + "\t\treturn ";
  protected final String TEXT_1338 = "super.basicGet";
  protected final String TEXT_1339 = "()";
  protected final String TEXT_1340 = "null";
  protected final String TEXT_1341 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1342 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1343 = " ";
  protected final String TEXT_1344 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1345 = " ";
  protected final String TEXT_1346 = " = basicGet";
  protected final String TEXT_1347 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1348 = " == null ? null : (";
  protected final String TEXT_1349 = ")eResolveProxy((";
  protected final String TEXT_1350 = ")";
  protected final String TEXT_1351 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1352 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1353 = " ";
  protected final String TEXT_1354 = "Helper(";
  protected final String TEXT_1355 = " ";
  protected final String TEXT_1356 = ")" + NL + "\t{";
  protected final String TEXT_1357 = NL + "\t\t";
  protected final String TEXT_1358 = ".addAll(super.";
  protected final String TEXT_1359 = "());";
  protected final String TEXT_1360 = NL + "\t\tsuper.";
  protected final String TEXT_1361 = "Helper(";
  protected final String TEXT_1362 = ");";
  protected final String TEXT_1363 = NL + "\t\tif (isSet";
  protected final String TEXT_1364 = "()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1365 = " i = ((";
  protected final String TEXT_1366 = ") ";
  protected final String TEXT_1367 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1368 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1369 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1370 = "())) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1371 = " i = ((";
  protected final String TEXT_1372 = ") ";
  protected final String TEXT_1373 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1374 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1375 = NL + "\t\t";
  protected final String TEXT_1376 = " ";
  protected final String TEXT_1377 = " = ";
  protected final String TEXT_1378 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1379 = ".isEmpty()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1380 = " i = ((";
  protected final String TEXT_1381 = ") ";
  protected final String TEXT_1382 = ").basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1383 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1384 = NL + "\t\tif (isSet";
  protected final String TEXT_1385 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1386 = ".addAll(";
  protected final String TEXT_1387 = "());" + NL + "\t\t}";
  protected final String TEXT_1388 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1389 = "())) {" + NL + "\t\t\t";
  protected final String TEXT_1390 = ".addAll(";
  protected final String TEXT_1391 = "());" + NL + "\t\t}";
  protected final String TEXT_1392 = NL + "\t\t";
  protected final String TEXT_1393 = " ";
  protected final String TEXT_1394 = " = ";
  protected final String TEXT_1395 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1396 = ".isEmpty()) {" + NL + "\t\t\t";
  protected final String TEXT_1397 = ".addAll(";
  protected final String TEXT_1398 = ");" + NL + "\t\t}";
  protected final String TEXT_1399 = NL + "\t\tif (isSet";
  protected final String TEXT_1400 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1401 = ".add(";
  protected final String TEXT_1402 = "basicGet";
  protected final String TEXT_1403 = "());" + NL + "\t\t}";
  protected final String TEXT_1404 = NL + "\t\t";
  protected final String TEXT_1405 = " ";
  protected final String TEXT_1406 = " = ";
  protected final String TEXT_1407 = "basicGet";
  protected final String TEXT_1408 = "();" + NL + "\t\tif (";
  protected final String TEXT_1409 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_1410 = ".add(";
  protected final String TEXT_1411 = ");" + NL + "\t\t}";
  protected final String TEXT_1412 = NL + "\t\treturn ";
  protected final String TEXT_1413 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1414 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1415 = " ";
  protected final String TEXT_1416 = "()" + NL + "\t{";
  protected final String TEXT_1417 = NL + "\t\t";
  protected final String TEXT_1418 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_1419 = NL + "\t\t\ttry {" + NL + "\t\t\t\t";
  protected final String TEXT_1420 = " method = getClass().getMethod(\"";
  protected final String TEXT_1421 = "\", null);";
  protected final String TEXT_1422 = NL + "\t\t\t\t";
  protected final String TEXT_1423 = " ";
  protected final String TEXT_1424 = " = (";
  protected final String TEXT_1425 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_1426 = " == null) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_1427 = " union = ";
  protected final String TEXT_1428 = "Helper(new ";
  protected final String TEXT_1429 = "());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_1430 = " = new ";
  protected final String TEXT_1431 = "(this, ";
  protected final String TEXT_1432 = "null";
  protected final String TEXT_1433 = "()";
  protected final String TEXT_1434 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1435 = ";" + NL + "\t\t\t} catch (";
  protected final String TEXT_1436 = " nsme) {" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_1437 = NL + "\t\t\t";
  protected final String TEXT_1438 = " ";
  protected final String TEXT_1439 = " = (";
  protected final String TEXT_1440 = ") cache.get(eResource(), this, ";
  protected final String TEXT_1441 = "());" + NL + "\t\t\tif (";
  protected final String TEXT_1442 = " == null) {" + NL + "\t\t\t\t";
  protected final String TEXT_1443 = " union = ";
  protected final String TEXT_1444 = "Helper(new ";
  protected final String TEXT_1445 = "());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_1446 = "(), ";
  protected final String TEXT_1447 = " = new ";
  protected final String TEXT_1448 = "(this, ";
  protected final String TEXT_1449 = "null";
  protected final String TEXT_1450 = "()";
  protected final String TEXT_1451 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_1452 = ";";
  protected final String TEXT_1453 = NL + "\t\t}";
  protected final String TEXT_1454 = NL + "\t\t";
  protected final String TEXT_1455 = " union = ";
  protected final String TEXT_1456 = "Helper(new ";
  protected final String TEXT_1457 = "());" + NL + "\t\treturn new ";
  protected final String TEXT_1458 = "(this, ";
  protected final String TEXT_1459 = "null";
  protected final String TEXT_1460 = "()";
  protected final String TEXT_1461 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_1462 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1463 = " ";
  protected final String TEXT_1464 = "()" + NL + "\t{";
  protected final String TEXT_1465 = NL + "\t\tif (isSet";
  protected final String TEXT_1466 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1467 = "();" + NL + "\t\t}";
  protected final String TEXT_1468 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1469 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1470 = "();" + NL + "\t\t}";
  protected final String TEXT_1471 = NL + "\t\t";
  protected final String TEXT_1472 = " ";
  protected final String TEXT_1473 = " = ";
  protected final String TEXT_1474 = "();" + NL + "\t\tif (";
  protected final String TEXT_1475 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1476 = ";" + NL + "\t\t}";
  protected final String TEXT_1477 = NL + "\t\treturn ";
  protected final String TEXT_1478 = "super.";
  protected final String TEXT_1479 = "()";
  protected final String TEXT_1480 = "null";
  protected final String TEXT_1481 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1482 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1483 = "()" + NL + "\t{";
  protected final String TEXT_1484 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1485 = "()";
  protected final String TEXT_1486 = NL + "\t\treturn isSet";
  protected final String TEXT_1487 = "()";
  protected final String TEXT_1488 = ";";
  protected final String TEXT_1489 = NL + "\t\treturn !";
  protected final String TEXT_1490 = "().isEmpty()";
  protected final String TEXT_1491 = ";";
  protected final String TEXT_1492 = NL + "\t\treturn ";
  protected final String TEXT_1493 = "basicGet";
  protected final String TEXT_1494 = "() != null";
  protected final String TEXT_1495 = ";";
  protected final String TEXT_1496 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1497 = "())";
  protected final String TEXT_1498 = ";";
  protected final String TEXT_1499 = NL + "\t\t\t|| isSet";
  protected final String TEXT_1500 = "()";
  protected final String TEXT_1501 = ";";
  protected final String TEXT_1502 = NL + "\t\t\t|| !";
  protected final String TEXT_1503 = "().isEmpty()";
  protected final String TEXT_1504 = ";";
  protected final String TEXT_1505 = NL + "\t\t\t|| ";
  protected final String TEXT_1506 = "basicGet";
  protected final String TEXT_1507 = "() != null";
  protected final String TEXT_1508 = ";";
  protected final String TEXT_1509 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_1510 = "())";
  protected final String TEXT_1511 = ";";
  protected final String TEXT_1512 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1513 = "();";
  protected final String TEXT_1514 = NL + "\t\treturn false;";
  protected final String TEXT_1515 = NL + "\t}" + NL;
  protected final String TEXT_1516 = NL;
  protected final String TEXT_1517 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1518 = " create";
  protected final String TEXT_1519 = "(";
  protected final String TEXT_1520 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1521 = " new";
  protected final String TEXT_1522 = " = (";
  protected final String TEXT_1523 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1524 = NL + "\t\t";
  protected final String TEXT_1525 = "().add(new";
  protected final String TEXT_1526 = ");";
  protected final String TEXT_1527 = NL + "\t\tset";
  protected final String TEXT_1528 = "(new";
  protected final String TEXT_1529 = ");";
  protected final String TEXT_1530 = NL + "\t\treturn new";
  protected final String TEXT_1531 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1532 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1533 = " create";
  protected final String TEXT_1534 = "() {" + NL + "\t\t";
  protected final String TEXT_1535 = " new";
  protected final String TEXT_1536 = " = ";
  protected final String TEXT_1537 = ".eINSTANCE.create";
  protected final String TEXT_1538 = "();";
  protected final String TEXT_1539 = NL + "\t\t";
  protected final String TEXT_1540 = "().add(new";
  protected final String TEXT_1541 = ");";
  protected final String TEXT_1542 = NL + "\t\tset";
  protected final String TEXT_1543 = "(new";
  protected final String TEXT_1544 = ");";
  protected final String TEXT_1545 = NL + "\t\treturn new";
  protected final String TEXT_1546 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1547 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1548 = " get";
  protected final String TEXT_1549 = "(";
  protected final String TEXT_1550 = " ";
  protected final String TEXT_1551 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1552 = " i = ";
  protected final String TEXT_1553 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1554 = " ";
  protected final String TEXT_1555 = " = (";
  protected final String TEXT_1556 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1557 = ".equals(";
  protected final String TEXT_1558 = ".";
  protected final String TEXT_1559 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1560 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1561 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1562 = "()" + NL + "\t{";
  protected final String TEXT_1563 = NL + "  \t\treturn false;";
  protected final String TEXT_1564 = NL + "\t\treturn !((";
  protected final String TEXT_1565 = ")";
  protected final String TEXT_1566 = "()).featureMap().isEmpty();";
  protected final String TEXT_1567 = NL + "\t\treturn ";
  protected final String TEXT_1568 = " != null && !";
  protected final String TEXT_1569 = ".featureMap().isEmpty();";
  protected final String TEXT_1570 = NL + "\t\treturn ";
  protected final String TEXT_1571 = " != null && !";
  protected final String TEXT_1572 = ".isEmpty();";
  protected final String TEXT_1573 = NL + "\t\t";
  protected final String TEXT_1574 = " ";
  protected final String TEXT_1575 = " = (";
  protected final String TEXT_1576 = ")eVirtualGet(";
  protected final String TEXT_1577 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1578 = " != null && !";
  protected final String TEXT_1579 = ".isEmpty();";
  protected final String TEXT_1580 = NL + "\t\treturn !";
  protected final String TEXT_1581 = "().isEmpty();";
  protected final String TEXT_1582 = NL + "\t\treturn ";
  protected final String TEXT_1583 = " != null;";
  protected final String TEXT_1584 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1585 = ") != null;";
  protected final String TEXT_1586 = NL + "\t\treturn basicGet";
  protected final String TEXT_1587 = "() != null;";
  protected final String TEXT_1588 = NL + "\t\treturn ";
  protected final String TEXT_1589 = " != null;";
  protected final String TEXT_1590 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1591 = ") != null;";
  protected final String TEXT_1592 = NL + "\t\treturn ";
  protected final String TEXT_1593 = "() != null;";
  protected final String TEXT_1594 = NL + "\t\treturn ((";
  protected final String TEXT_1595 = " & ";
  protected final String TEXT_1596 = "_EFLAG) != 0) != ";
  protected final String TEXT_1597 = "_EDEFAULT;";
  protected final String TEXT_1598 = NL + "\t\treturn ";
  protected final String TEXT_1599 = " != ";
  protected final String TEXT_1600 = "_EDEFAULT;";
  protected final String TEXT_1601 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1602 = ", ";
  protected final String TEXT_1603 = "_EDEFAULT) != ";
  protected final String TEXT_1604 = "_EDEFAULT;";
  protected final String TEXT_1605 = NL + "\t\treturn ";
  protected final String TEXT_1606 = "() != ";
  protected final String TEXT_1607 = "_EDEFAULT;";
  protected final String TEXT_1608 = NL + "\t\treturn ";
  protected final String TEXT_1609 = "_EDEFAULT == null ? ";
  protected final String TEXT_1610 = " != null : !";
  protected final String TEXT_1611 = "_EDEFAULT.equals(";
  protected final String TEXT_1612 = ");";
  protected final String TEXT_1613 = NL + "\t\t";
  protected final String TEXT_1614 = " ";
  protected final String TEXT_1615 = " = (";
  protected final String TEXT_1616 = ")eVirtualGet(";
  protected final String TEXT_1617 = ", ";
  protected final String TEXT_1618 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1619 = "_EDEFAULT == null ? ";
  protected final String TEXT_1620 = " != null : !";
  protected final String TEXT_1621 = "_EDEFAULT.equals(";
  protected final String TEXT_1622 = ");";
  protected final String TEXT_1623 = NL + "\t\treturn ";
  protected final String TEXT_1624 = "_EDEFAULT == null ? ";
  protected final String TEXT_1625 = "() != null : !";
  protected final String TEXT_1626 = "_EDEFAULT.equals(";
  protected final String TEXT_1627 = "());";
  protected final String TEXT_1628 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1629 = ".eINSTANCE.get";
  protected final String TEXT_1630 = "());";
  protected final String TEXT_1631 = NL + "\t\t";
  protected final String TEXT_1632 = " ";
  protected final String TEXT_1633 = " = (";
  protected final String TEXT_1634 = ")eVirtualGet(";
  protected final String TEXT_1635 = ");";
  protected final String TEXT_1636 = NL + "\t\treturn ";
  protected final String TEXT_1637 = " != null && ((";
  protected final String TEXT_1638 = ".Unsettable)";
  protected final String TEXT_1639 = ").isSet();";
  protected final String TEXT_1640 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1641 = ");";
  protected final String TEXT_1642 = NL + "\t\treturn (";
  protected final String TEXT_1643 = " & ";
  protected final String TEXT_1644 = "_ESETFLAG) != 0;";
  protected final String TEXT_1645 = NL + "\t\treturn ";
  protected final String TEXT_1646 = "ESet;";
  protected final String TEXT_1647 = NL + "\t\treturn !((";
  protected final String TEXT_1648 = ".Internal)((";
  protected final String TEXT_1649 = ")get";
  protected final String TEXT_1650 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1651 = "());";
  protected final String TEXT_1652 = NL + "\t\treturn !((";
  protected final String TEXT_1653 = ".Internal)get";
  protected final String TEXT_1654 = "()).isEmpty(";
  protected final String TEXT_1655 = "());";
  protected final String TEXT_1656 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1657 = "' ";
  protected final String TEXT_1658 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1659 = NL + "\t}" + NL;
  protected final String TEXT_1660 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1661 = " ";
  protected final String TEXT_1662 = "()" + NL + "\t{";
  protected final String TEXT_1663 = NL + "\t\treturn ";
  protected final String TEXT_1664 = "();";
  protected final String TEXT_1665 = NL + "\t\treturn new ";
  protected final String TEXT_1666 = ".UnmodifiableEList(this, ";
  protected final String TEXT_1667 = "null";
  protected final String TEXT_1668 = "()";
  protected final String TEXT_1669 = ", 0, ";
  protected final String TEXT_1670 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_1671 = NL + "\t\treturn null;";
  protected final String TEXT_1672 = NL + "\t\treturn ";
  protected final String TEXT_1673 = "();";
  protected final String TEXT_1674 = NL + "\t}" + NL;
  protected final String TEXT_1675 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1676 = " basicGet";
  protected final String TEXT_1677 = "()" + NL + "\t{";
  protected final String TEXT_1678 = NL + "\t\treturn null;";
  protected final String TEXT_1679 = NL + "\t\treturn ";
  protected final String TEXT_1680 = "basicGet";
  protected final String TEXT_1681 = "();";
  protected final String TEXT_1682 = NL + "\t}" + NL;
  protected final String TEXT_1683 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1684 = " basicSet";
  protected final String TEXT_1685 = "(";
  protected final String TEXT_1686 = " new";
  protected final String TEXT_1687 = ", ";
  protected final String TEXT_1688 = " msgs)" + NL + "\t{";
  protected final String TEXT_1689 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1690 = NL + "\t\tif (new";
  protected final String TEXT_1691 = " != null && !(new";
  protected final String TEXT_1692 = " instanceof ";
  protected final String TEXT_1693 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1694 = "));" + NL + "\t\t}";
  protected final String TEXT_1695 = NL + "\t\treturn basicSet";
  protected final String TEXT_1696 = "(";
  protected final String TEXT_1697 = "(";
  protected final String TEXT_1698 = ") ";
  protected final String TEXT_1699 = "new";
  protected final String TEXT_1700 = ", msgs);";
  protected final String TEXT_1701 = NL + "\t\tset";
  protected final String TEXT_1702 = "(";
  protected final String TEXT_1703 = "(";
  protected final String TEXT_1704 = ") ";
  protected final String TEXT_1705 = "new";
  protected final String TEXT_1706 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1707 = NL + "\t}" + NL;
  protected final String TEXT_1708 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1709 = "(";
  protected final String TEXT_1710 = " new";
  protected final String TEXT_1711 = ")" + NL + "\t{";
  protected final String TEXT_1712 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1713 = NL + "\t\tif (new";
  protected final String TEXT_1714 = " != null && !(new";
  protected final String TEXT_1715 = " instanceof ";
  protected final String TEXT_1716 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1717 = "));" + NL + "\t\t}";
  protected final String TEXT_1718 = NL + "\t\tset";
  protected final String TEXT_1719 = "(";
  protected final String TEXT_1720 = "(";
  protected final String TEXT_1721 = ") ";
  protected final String TEXT_1722 = "new";
  protected final String TEXT_1723 = ");";
  protected final String TEXT_1724 = NL + "\t}" + NL;
  protected final String TEXT_1725 = NL;
  protected final String TEXT_1726 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1727 = " create";
  protected final String TEXT_1728 = "(";
  protected final String TEXT_1729 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1730 = " new";
  protected final String TEXT_1731 = " = (";
  protected final String TEXT_1732 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1733 = NL + "\t\t";
  protected final String TEXT_1734 = "().add(new";
  protected final String TEXT_1735 = ");";
  protected final String TEXT_1736 = NL + "\t\tset";
  protected final String TEXT_1737 = "(new";
  protected final String TEXT_1738 = ");";
  protected final String TEXT_1739 = NL + "\t\treturn new";
  protected final String TEXT_1740 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1741 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1742 = " create";
  protected final String TEXT_1743 = "() {" + NL + "\t\t";
  protected final String TEXT_1744 = " new";
  protected final String TEXT_1745 = " = ";
  protected final String TEXT_1746 = ".eINSTANCE.create";
  protected final String TEXT_1747 = "();";
  protected final String TEXT_1748 = NL + "\t\t";
  protected final String TEXT_1749 = "().add(new";
  protected final String TEXT_1750 = ");";
  protected final String TEXT_1751 = NL + "\t\tset";
  protected final String TEXT_1752 = "(new";
  protected final String TEXT_1753 = ");";
  protected final String TEXT_1754 = NL + "\t\treturn new";
  protected final String TEXT_1755 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1756 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1757 = " get";
  protected final String TEXT_1758 = "(";
  protected final String TEXT_1759 = " ";
  protected final String TEXT_1760 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1761 = " i = ";
  protected final String TEXT_1762 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1763 = " ";
  protected final String TEXT_1764 = " = (";
  protected final String TEXT_1765 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1766 = ".equals(";
  protected final String TEXT_1767 = ".";
  protected final String TEXT_1768 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1769 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1770 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1771 = "()" + NL + "\t{";
  protected final String TEXT_1772 = NL + "  \t\treturn false;";
  protected final String TEXT_1773 = NL + "\t\treturn !((";
  protected final String TEXT_1774 = ")";
  protected final String TEXT_1775 = "()).featureMap().isEmpty();";
  protected final String TEXT_1776 = NL + "\t\treturn ";
  protected final String TEXT_1777 = " != null && !";
  protected final String TEXT_1778 = ".featureMap().isEmpty();";
  protected final String TEXT_1779 = NL + "\t\treturn ";
  protected final String TEXT_1780 = " != null && !";
  protected final String TEXT_1781 = ".isEmpty();";
  protected final String TEXT_1782 = NL + "\t\t";
  protected final String TEXT_1783 = " ";
  protected final String TEXT_1784 = " = (";
  protected final String TEXT_1785 = ")eVirtualGet(";
  protected final String TEXT_1786 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1787 = " != null && !";
  protected final String TEXT_1788 = ".isEmpty();";
  protected final String TEXT_1789 = NL + "\t\treturn !";
  protected final String TEXT_1790 = "().isEmpty();";
  protected final String TEXT_1791 = NL + "\t\treturn ";
  protected final String TEXT_1792 = " != null;";
  protected final String TEXT_1793 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1794 = ") != null;";
  protected final String TEXT_1795 = NL + "\t\treturn basicGet";
  protected final String TEXT_1796 = "() != null;";
  protected final String TEXT_1797 = NL + "\t\treturn ";
  protected final String TEXT_1798 = " != null;";
  protected final String TEXT_1799 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1800 = ") != null;";
  protected final String TEXT_1801 = NL + "\t\treturn ";
  protected final String TEXT_1802 = "() != null;";
  protected final String TEXT_1803 = NL + "\t\treturn ((";
  protected final String TEXT_1804 = " & ";
  protected final String TEXT_1805 = "_EFLAG) != 0) != ";
  protected final String TEXT_1806 = "_EDEFAULT;";
  protected final String TEXT_1807 = NL + "\t\treturn ";
  protected final String TEXT_1808 = " != ";
  protected final String TEXT_1809 = "_EDEFAULT;";
  protected final String TEXT_1810 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1811 = ", ";
  protected final String TEXT_1812 = "_EDEFAULT) != ";
  protected final String TEXT_1813 = "_EDEFAULT;";
  protected final String TEXT_1814 = NL + "\t\treturn ";
  protected final String TEXT_1815 = "() != ";
  protected final String TEXT_1816 = "_EDEFAULT;";
  protected final String TEXT_1817 = NL + "\t\treturn ";
  protected final String TEXT_1818 = "_EDEFAULT == null ? ";
  protected final String TEXT_1819 = " != null : !";
  protected final String TEXT_1820 = "_EDEFAULT.equals(";
  protected final String TEXT_1821 = ");";
  protected final String TEXT_1822 = NL + "\t\t";
  protected final String TEXT_1823 = " ";
  protected final String TEXT_1824 = " = (";
  protected final String TEXT_1825 = ")eVirtualGet(";
  protected final String TEXT_1826 = ", ";
  protected final String TEXT_1827 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1828 = "_EDEFAULT == null ? ";
  protected final String TEXT_1829 = " != null : !";
  protected final String TEXT_1830 = "_EDEFAULT.equals(";
  protected final String TEXT_1831 = ");";
  protected final String TEXT_1832 = NL + "\t\treturn ";
  protected final String TEXT_1833 = "_EDEFAULT == null ? ";
  protected final String TEXT_1834 = "() != null : !";
  protected final String TEXT_1835 = "_EDEFAULT.equals(";
  protected final String TEXT_1836 = "());";
  protected final String TEXT_1837 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1838 = ".eINSTANCE.get";
  protected final String TEXT_1839 = "());";
  protected final String TEXT_1840 = NL + "\t\t";
  protected final String TEXT_1841 = " ";
  protected final String TEXT_1842 = " = (";
  protected final String TEXT_1843 = ")eVirtualGet(";
  protected final String TEXT_1844 = ");";
  protected final String TEXT_1845 = NL + "\t\treturn ";
  protected final String TEXT_1846 = " != null && ((";
  protected final String TEXT_1847 = ".Unsettable)";
  protected final String TEXT_1848 = ").isSet();";
  protected final String TEXT_1849 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1850 = ");";
  protected final String TEXT_1851 = NL + "\t\treturn (";
  protected final String TEXT_1852 = " & ";
  protected final String TEXT_1853 = "_ESETFLAG) != 0;";
  protected final String TEXT_1854 = NL + "\t\treturn ";
  protected final String TEXT_1855 = "ESet;";
  protected final String TEXT_1856 = NL + "\t\treturn !((";
  protected final String TEXT_1857 = ".Internal)((";
  protected final String TEXT_1858 = ")get";
  protected final String TEXT_1859 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1860 = "());";
  protected final String TEXT_1861 = NL + "\t\treturn !((";
  protected final String TEXT_1862 = ".Internal)get";
  protected final String TEXT_1863 = "()).isEmpty(";
  protected final String TEXT_1864 = "());";
  protected final String TEXT_1865 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1866 = "' ";
  protected final String TEXT_1867 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1868 = NL + "\t}" + NL;
  protected final String TEXT_1869 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1870 = " ";
  protected final String TEXT_1871 = "(";
  protected final String TEXT_1872 = ")";
  protected final String TEXT_1873 = NL + "\t{";
  protected final String TEXT_1874 = NL + "\t\t";
  protected final String TEXT_1875 = "(";
  protected final String TEXT_1876 = ");";
  protected final String TEXT_1877 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1878 = NL + "\t\treturn ";
  protected final String TEXT_1879 = "(";
  protected final String TEXT_1880 = ");";
  protected final String TEXT_1881 = NL + "\t}" + NL;
  protected final String TEXT_1882 = NL + "} //";
  protected final String TEXT_1883 = NL;

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
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    }
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_135);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_140);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_144);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_148);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_151);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_154);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_157);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_158);
    }
    stringBuffer.append(TEXT_159);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_172);
    }
    stringBuffer.append(TEXT_173);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_176);
    } else {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_178);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_188);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap$Internal"));
    stringBuffer.append(TEXT_191);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_194);
    } else {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_197);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_199);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_203);
    } else {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_207);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_208);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_211);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_212);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_214);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_216);
    }
    stringBuffer.append(TEXT_217);
    } else {
    stringBuffer.append(TEXT_218);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_223);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_225);
    }
    stringBuffer.append(TEXT_226);
    }
    }
    } else {
    stringBuffer.append(TEXT_227);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_231);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_232);
    }
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_234);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_235);
    }
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_237);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_241);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_243);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_244);
    }
    stringBuffer.append(TEXT_245);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_247);
    }
    stringBuffer.append(TEXT_248);
    }
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
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_257);
    //Class/getGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_260);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_263);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_268);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_273);
    } else {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_277);
    }
    } else {
    stringBuffer.append(TEXT_278);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_279);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_281);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_283);
    } else {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_286);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_287);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_293);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_294);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_300);
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_304);
    } else {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_310);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_312);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_318);
    } else {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_322);
    }
    }
    stringBuffer.append(TEXT_323);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_328);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_333);
    } else {
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_335);
    }
    stringBuffer.append(TEXT_336);
    } else {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_341);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_346);
    }
    stringBuffer.append(TEXT_347);
    stringBuffer.append(TEXT_348);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_350);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_353);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_357);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    }
    }
    stringBuffer.append(TEXT_360);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_362);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_363);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_366);
    } else {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_368);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    }
    } else {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_374);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_375);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(TEXT_380);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_385);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_391);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_394);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_397);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_401);
    }
    stringBuffer.append(TEXT_402);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_415);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_416);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_425);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_430);
    }
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_435);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_443);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_447);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_453);
    }
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_457);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_458);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
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
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_478);
    } else {
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_494);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_498);
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_504);
    } else {
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_509);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_514);
    } else {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_518);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_522);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_524);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_530);
    } else {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_534);
    }
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_538);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_539);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_540);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_541);
    }
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_544);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_546);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_547);
    } else {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_549);
    }
    stringBuffer.append(TEXT_550);
    } else {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_554);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_556);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_557);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_558);
    }
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_561);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_563);
    }
    }
    stringBuffer.append(TEXT_564);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_565);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_566);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_569);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_575);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_580);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_582);
    }
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_584);
    }
    stringBuffer.append(TEXT_585);
    } else {
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_589);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_591);
    }
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_593);
    }
    stringBuffer.append(TEXT_594);
    }
    } else {
    stringBuffer.append(TEXT_595);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_596);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_598);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_600);
    } else {
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_603);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_604);
    //Class/setGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_608);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_611);
    } else {
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_616);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_618);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_624);
    } else {
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_628);
    }
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_633);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_635);
    } else {
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_637);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_638);
    } else {
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_640);
    }
    stringBuffer.append(TEXT_641);
    } else {
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_644);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_645);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset()) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_647);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_650);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_653);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_658);
    }
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_661);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_665);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_669);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_670);
    }
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_672);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_675);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_681);
    } else {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_685);
    }
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_690);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_695);
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_698);
    } else {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_702);
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_704);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_708);
    } else {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_711);
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_713);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_716);
    } else {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_718);
    }
    }
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_722);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    } else {
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_726);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_727);
    } else {
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    }
    stringBuffer.append(TEXT_730);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_736);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_739);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_742);
    } else {
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_744);
    }
    }
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_748);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_751);
    } else {
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_754);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_755);
    } else {
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    }
    stringBuffer.append(TEXT_758);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_763);
    } else {
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_767);
    }
    } else {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_770);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_771);
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet()) {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_773);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_776);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_781);
    }
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_785);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_787);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_790);
    } else {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_792);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_794);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_797);
    } else {
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_799);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_801);
    }
    } else {
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_804);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_805);
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_806);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_813);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_816);
    } else {
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    }
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_822);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_828);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_831);
    } else {
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_834);
    }
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_836);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_837);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_850);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_852);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_853);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_856);
    } else {
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_859);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_862);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_869);
    } else {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_871);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_873);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_875);
    } else {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_877);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_879);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_881);
    } else {
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_883);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_887);
    } else {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_890);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_894);
    } else {
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_897);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_902);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    } else {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_917);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_920);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_925);
    }
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_929);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_931);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_934);
    } else {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_936);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_941);
    } else {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_943);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_945);
    }
    } else {
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_948);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_949);
    }
    //Class/implementedGenFeature.override.javajetinc
    }//for
    for (Iterator i=genClass.getImplementedGenOperations().iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_950);
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_955);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_957);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_960);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_961);
    } else {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_963);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_966);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_974);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_975);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_977);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_979);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_983);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_984);
    }
    stringBuffer.append(TEXT_985);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_986);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_988);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_989);
    }
    stringBuffer.append(TEXT_990);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_991);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_993);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_995);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_997);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_999);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1000);
    }
    stringBuffer.append(TEXT_1001);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1003);
    }
    stringBuffer.append(TEXT_1004);
    }
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1007);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1009);
    }
    } else {
    stringBuffer.append(TEXT_1010);
    }
    }
    stringBuffer.append(TEXT_1011);
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1015);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1017);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1021);
    } else {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1024);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1026);
    } else {
    if (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation()) {
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1031);
    }
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1033);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1037);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1042);
    }
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1045);
    }
    }
    stringBuffer.append(TEXT_1046);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1050);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1052);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1056);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1060);
    } else {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1063);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1065);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1067);
    } else {
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1069);
    }
    }
    stringBuffer.append(TEXT_1070);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1073);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1077);
    }
    stringBuffer.append(TEXT_1078);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1080);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1082);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1084);
    } else {
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1087);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1090);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1093);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1096);
    } else {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1098);
    }
    }
    stringBuffer.append(TEXT_1099);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1101);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1103);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1106);
    } else {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1108);
    }
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1112);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1116);
    } else {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1119);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1123);
    } else {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1126);
    }
    stringBuffer.append(TEXT_1127);
    }
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1129);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1131);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1134);
    } else {
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1136);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1138);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1141);
    } else {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1144);
    }
    stringBuffer.append(TEXT_1145);
    }
    stringBuffer.append(TEXT_1146);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1149);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1151);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1153);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1156);
    } else {
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1159);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1162);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1169);
    } else {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1171);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1173);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1175);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1177);
    } else {
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1179);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1181);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1183);
    } else {
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1185);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1189);
    } else {
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1192);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1196);
    } else {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1199);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1204);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1214);
    } else {
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1219);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1220);
    //Class/eIsSet.override.javajetinc
    }
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1221);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1223);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1226);
    }
    stringBuffer.append(TEXT_1227);
    }
    stringBuffer.append(TEXT_1228);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1230);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1233);
    }
    stringBuffer.append(TEXT_1234);
    }
    stringBuffer.append(TEXT_1235);
    }
    if (genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1238);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1239);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1242);
    }
    stringBuffer.append(TEXT_1243);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1246);
    }
    stringBuffer.append(TEXT_1247);
    }
    }
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1248);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1256);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1259);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1260);
    }
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1264);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1267);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1268);
    }
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1273);
    }
    stringBuffer.append(TEXT_1274);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1277);
    } else {
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1279);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1280);
    }
    if (genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1281);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1283);
    } else {
    stringBuffer.append(TEXT_1284);
    }
    stringBuffer.append(TEXT_1285);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1287);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1290);
    } else {
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1292);
    }
    stringBuffer.append(TEXT_1293);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1295);
    } else {
    stringBuffer.append(TEXT_1296);
    }
    stringBuffer.append(TEXT_1297);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1299);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1302);
    } else {
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1304);
    }
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1308);
    }
    stringBuffer.append(TEXT_1309);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1318);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1321);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1323);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1325);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1327);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1329);
    } else {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1332);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1336);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1337);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1339);
    } else {
    stringBuffer.append(TEXT_1340);
    }
    stringBuffer.append(TEXT_1341);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1351);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1356);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1359);
    } else {
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1362);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1368);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1374);
    } else {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1383);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1387);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1391);
    } else {
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1398);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1401);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1403);
    } else {
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1406);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1411);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1413);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1416);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1418);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1431);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1432);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1433);
    }
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_1436);
    } else {
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1448);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1449);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1450);
    }
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1452);
    }
    stringBuffer.append(TEXT_1453);
    }
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1458);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1459);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1460);
    }
    stringBuffer.append(TEXT_1461);
    }
    }
    } else {
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1464);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1467);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1470);
    } else {
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1476);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1477);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1479);
    } else {
    stringBuffer.append(TEXT_1480);
    }
    stringBuffer.append(TEXT_1481);
    }
    }
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1483);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1485);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1487);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1488);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1490);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1491);
    }
    } else {
    stringBuffer.append(TEXT_1492);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1494);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1495);
    }
    }
    } else {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1497);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1498);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1500);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1501);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1503);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1504);
    }
    } else {
    stringBuffer.append(TEXT_1505);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1507);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1508);
    }
    }
    } else {
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1510);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1511);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1513);
    } else {
    stringBuffer.append(TEXT_1514);
    }
    }
    stringBuffer.append(TEXT_1515);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1516);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1523);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1526);
    } else {
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1529);
    }
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1531);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1538);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1541);
    } else {
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1544);
    }
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1546);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1560);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1562);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1563);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1566);
    } else {
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1569);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1572);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1579);
    } else {
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1581);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1583);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1585);
    } else {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1587);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1589);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1591);
    } else {
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1593);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1597);
    } else {
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1600);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1604);
    } else {
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1607);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1612);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1622);
    } else {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1627);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1630);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1635);
    }
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1639);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1641);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1644);
    } else {
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1646);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1651);
    } else {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1655);
    }
    } else {
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1658);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1659);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1662);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1664);
    } else {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_1666);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1667);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1668);
    }
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_1670);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1671);
    } else {
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1673);
    }
    }
    stringBuffer.append(TEXT_1674);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1677);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1678);
    } else {
    stringBuffer.append(TEXT_1679);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1681);
    }
    stringBuffer.append(TEXT_1682);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1688);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1689);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1694);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1696);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1698);
    }
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1700);
    } else {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1702);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1704);
    }
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1706);
    }
    }
    stringBuffer.append(TEXT_1707);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1711);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1712);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1717);
    }
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1719);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1721);
    }
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1723);
    }
    stringBuffer.append(TEXT_1724);
    }
    stringBuffer.append(TEXT_1725);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1732);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1735);
    } else {
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1738);
    }
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1740);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1747);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1750);
    } else {
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1753);
    }
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1755);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1769);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1771);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1772);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1775);
    } else {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1778);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1781);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1788);
    } else {
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1790);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1792);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1794);
    } else {
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1796);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1798);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1800);
    } else {
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1802);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1806);
    } else {
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1809);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1813);
    } else {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1816);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1821);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1831);
    } else {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1836);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1839);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1844);
    }
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1848);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1850);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1853);
    } else {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1855);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1860);
    } else {
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1864);
    }
    } else {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1867);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1868);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1873);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1876);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_1877);
    } else {
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1880);
    }
    }
    stringBuffer.append(TEXT_1881);
    }
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genClass.getClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1883);
    return stringBuffer.toString();
  }
}
