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
  protected final String TEXT_121 = ");";
  protected final String TEXT_122 = NL + "\t\tif (";
  protected final String TEXT_123 = " != null && ";
  protected final String TEXT_124 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_125 = " old";
  protected final String TEXT_126 = " = (";
  protected final String TEXT_127 = ")";
  protected final String TEXT_128 = ";" + NL + "\t\t\t";
  protected final String TEXT_129 = " = ";
  protected final String TEXT_130 = "eResolveProxy(old";
  protected final String TEXT_131 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_132 = " != old";
  protected final String TEXT_133 = ")" + NL + "\t\t\t{";
  protected final String TEXT_134 = NL + "\t\t\t\t";
  protected final String TEXT_135 = " new";
  protected final String TEXT_136 = " = (";
  protected final String TEXT_137 = ")";
  protected final String TEXT_138 = ";";
  protected final String TEXT_139 = NL + "\t\t\t\t";
  protected final String TEXT_140 = " msgs = old";
  protected final String TEXT_141 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_142 = ", null, null);";
  protected final String TEXT_143 = NL + "\t\t\t\t";
  protected final String TEXT_144 = " msgs =  old";
  protected final String TEXT_145 = ".eInverseRemove(this, ";
  protected final String TEXT_146 = ", ";
  protected final String TEXT_147 = ".class, null);";
  protected final String TEXT_148 = NL + "\t\t\t\tif (new";
  protected final String TEXT_149 = ".eInternalContainer() != null)" + NL + "\t\t\t\t{";
  protected final String TEXT_150 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_151 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_152 = ", null, msgs);";
  protected final String TEXT_153 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_154 = ".eInverseAdd(this, ";
  protected final String TEXT_155 = ", ";
  protected final String TEXT_156 = ".class, msgs);";
  protected final String TEXT_157 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_158 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_159 = ", ";
  protected final String TEXT_160 = ");";
  protected final String TEXT_161 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_162 = "(this, ";
  protected final String TEXT_163 = ".RESOLVE, ";
  protected final String TEXT_164 = ", old";
  protected final String TEXT_165 = ", ";
  protected final String TEXT_166 = "));" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_167 = NL + "\t\treturn (";
  protected final String TEXT_168 = " & ";
  protected final String TEXT_169 = "_EFLAG) != 0;";
  protected final String TEXT_170 = NL + "\t\treturn ";
  protected final String TEXT_171 = " == null ? ";
  protected final String TEXT_172 = "_EDEFAULT : ";
  protected final String TEXT_173 = ";";
  protected final String TEXT_174 = NL + "\t\treturn ";
  protected final String TEXT_175 = ";";
  protected final String TEXT_176 = NL + "\t\t";
  protected final String TEXT_177 = " ";
  protected final String TEXT_178 = " = basicGet";
  protected final String TEXT_179 = "();" + NL + "\t\treturn ";
  protected final String TEXT_180 = " != null && ";
  protected final String TEXT_181 = ".eIsProxy() ? ";
  protected final String TEXT_182 = "eResolveProxy((";
  protected final String TEXT_183 = ")";
  protected final String TEXT_184 = ") : ";
  protected final String TEXT_185 = ";";
  protected final String TEXT_186 = NL + "\t\treturn new ";
  protected final String TEXT_187 = "((";
  protected final String TEXT_188 = ")((";
  protected final String TEXT_189 = ")get";
  protected final String TEXT_190 = "()).featureMap().list(";
  protected final String TEXT_191 = "()));";
  protected final String TEXT_192 = NL + "\t\treturn (";
  protected final String TEXT_193 = ")((";
  protected final String TEXT_194 = ")get";
  protected final String TEXT_195 = "()).list(";
  protected final String TEXT_196 = "());";
  protected final String TEXT_197 = NL + "\t\treturn ((";
  protected final String TEXT_198 = ")get";
  protected final String TEXT_199 = "()).featureMap().list(";
  protected final String TEXT_200 = "());";
  protected final String TEXT_201 = NL + "\t\treturn ((";
  protected final String TEXT_202 = ")get";
  protected final String TEXT_203 = "()).list(";
  protected final String TEXT_204 = "());";
  protected final String TEXT_205 = NL + "\t\treturn ";
  protected final String TEXT_206 = "(";
  protected final String TEXT_207 = "(";
  protected final String TEXT_208 = ")((";
  protected final String TEXT_209 = ")get";
  protected final String TEXT_210 = "()).featureMap().get(";
  protected final String TEXT_211 = "(), true)";
  protected final String TEXT_212 = ").";
  protected final String TEXT_213 = "()";
  protected final String TEXT_214 = ";";
  protected final String TEXT_215 = NL + "\t\treturn ";
  protected final String TEXT_216 = "(";
  protected final String TEXT_217 = "(";
  protected final String TEXT_218 = ")get";
  protected final String TEXT_219 = "().get(";
  protected final String TEXT_220 = "(), true)";
  protected final String TEXT_221 = ").";
  protected final String TEXT_222 = "()";
  protected final String TEXT_223 = ";";
  protected final String TEXT_224 = NL;
  protected final String TEXT_225 = NL + "\t\t";
  protected final String TEXT_226 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_227 = " result = (";
  protected final String TEXT_228 = ") cache.get(";
  protected final String TEXT_229 = "eResource(), ";
  protected final String TEXT_230 = "this, ";
  protected final String TEXT_231 = "());" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_232 = "eResource(), ";
  protected final String TEXT_233 = "this, ";
  protected final String TEXT_234 = "(), result = ";
  protected final String TEXT_235 = "new ";
  protected final String TEXT_236 = "(";
  protected final String TEXT_237 = ".";
  protected final String TEXT_238 = "(this";
  protected final String TEXT_239 = ", ";
  protected final String TEXT_240 = ")";
  protected final String TEXT_241 = ")";
  protected final String TEXT_242 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_243 = ".";
  protected final String TEXT_244 = "()";
  protected final String TEXT_245 = ";" + NL + "\t\t}";
  protected final String TEXT_246 = NL + "\t\treturn ";
  protected final String TEXT_247 = ".";
  protected final String TEXT_248 = "(this";
  protected final String TEXT_249 = ", ";
  protected final String TEXT_250 = ");";
  protected final String TEXT_251 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_252 = "' ";
  protected final String TEXT_253 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_254 = NL + "\t}" + NL;
  protected final String TEXT_255 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_256 = " basicGet";
  protected final String TEXT_257 = "()" + NL + "\t{";
  protected final String TEXT_258 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_259 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_260 = ")eInternalContainer();";
  protected final String TEXT_261 = NL + "\t\treturn (";
  protected final String TEXT_262 = ")eVirtualGet(";
  protected final String TEXT_263 = ");";
  protected final String TEXT_264 = NL + "\t\treturn ";
  protected final String TEXT_265 = ";";
  protected final String TEXT_266 = NL + "\t\treturn (";
  protected final String TEXT_267 = ")((";
  protected final String TEXT_268 = ")get";
  protected final String TEXT_269 = "()).featureMap().get(";
  protected final String TEXT_270 = "(), false);";
  protected final String TEXT_271 = NL + "\t\treturn (";
  protected final String TEXT_272 = ")get";
  protected final String TEXT_273 = "().get(";
  protected final String TEXT_274 = "(), false);";
  protected final String TEXT_275 = NL;
  protected final String TEXT_276 = NL + "\t\treturn ";
  protected final String TEXT_277 = ".";
  protected final String TEXT_278 = "(this";
  protected final String TEXT_279 = ", ";
  protected final String TEXT_280 = ");";
  protected final String TEXT_281 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_282 = "' ";
  protected final String TEXT_283 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_284 = NL + "\t}" + NL;
  protected final String TEXT_285 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_286 = " basicSet";
  protected final String TEXT_287 = "(";
  protected final String TEXT_288 = " new";
  protected final String TEXT_289 = ", ";
  protected final String TEXT_290 = " msgs)" + NL + "\t{";
  protected final String TEXT_291 = NL;
  protected final String TEXT_292 = NL + "\t\tif (new";
  protected final String TEXT_293 = " != null && !";
  protected final String TEXT_294 = "().contains(new";
  protected final String TEXT_295 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_296 = "().add(new";
  protected final String TEXT_297 = ");" + NL + "\t\t}";
  protected final String TEXT_298 = NL + "\t\tObject old";
  protected final String TEXT_299 = " = eVirtualSet(";
  protected final String TEXT_300 = ", new";
  protected final String TEXT_301 = ");";
  protected final String TEXT_302 = NL + "\t\t";
  protected final String TEXT_303 = " old";
  protected final String TEXT_304 = " = ";
  protected final String TEXT_305 = ";" + NL + "\t\t";
  protected final String TEXT_306 = " = new";
  protected final String TEXT_307 = ";";
  protected final String TEXT_308 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_309 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_310 = NL + "\t\tboolean old";
  protected final String TEXT_311 = "ESet = (";
  protected final String TEXT_312 = " & ";
  protected final String TEXT_313 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_314 = " |= ";
  protected final String TEXT_315 = "_ESETFLAG;";
  protected final String TEXT_316 = NL + "\t\tboolean old";
  protected final String TEXT_317 = "ESet = ";
  protected final String TEXT_318 = "ESet;" + NL + "\t\t";
  protected final String TEXT_319 = "ESet = true;";
  protected final String TEXT_320 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_321 = NL + "\t\t\t";
  protected final String TEXT_322 = " notification = new ";
  protected final String TEXT_323 = "(this, ";
  protected final String TEXT_324 = ".SET, ";
  protected final String TEXT_325 = ", ";
  protected final String TEXT_326 = "isSetChange ? null : old";
  protected final String TEXT_327 = "old";
  protected final String TEXT_328 = ", new";
  protected final String TEXT_329 = ", ";
  protected final String TEXT_330 = "isSetChange";
  protected final String TEXT_331 = "!old";
  protected final String TEXT_332 = "ESet";
  protected final String TEXT_333 = ");";
  protected final String TEXT_334 = NL + "\t\t\t";
  protected final String TEXT_335 = " notification = new ";
  protected final String TEXT_336 = "(this, ";
  protected final String TEXT_337 = ".SET, ";
  protected final String TEXT_338 = ", ";
  protected final String TEXT_339 = "old";
  protected final String TEXT_340 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_341 = "old";
  protected final String TEXT_342 = ", new";
  protected final String TEXT_343 = ");";
  protected final String TEXT_344 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_345 = NL;
  protected final String TEXT_346 = NL + "\t\tif (";
  protected final String TEXT_347 = " != null && ";
  protected final String TEXT_348 = " != new";
  protected final String TEXT_349 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_350 = "(null);" + NL + "\t\t}";
  protected final String TEXT_351 = NL + "\t\tif (new";
  protected final String TEXT_352 = " != null ||  old";
  protected final String TEXT_353 = " == ";
  protected final String TEXT_354 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_355 = "(new";
  protected final String TEXT_356 = ");" + NL + "\t\t}";
  protected final String TEXT_357 = NL + "\t\treturn msgs;";
  protected final String TEXT_358 = NL + "\t\treturn ((";
  protected final String TEXT_359 = ".Internal)((";
  protected final String TEXT_360 = ")get";
  protected final String TEXT_361 = "()).featureMap()).basicAdd(";
  protected final String TEXT_362 = "(), new";
  protected final String TEXT_363 = ", msgs);";
  protected final String TEXT_364 = NL + "\t\treturn ((";
  protected final String TEXT_365 = ".Internal)get";
  protected final String TEXT_366 = "()).basicAdd(";
  protected final String TEXT_367 = "(), new";
  protected final String TEXT_368 = ", msgs);";
  protected final String TEXT_369 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_370 = "' ";
  protected final String TEXT_371 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_372 = NL + "\t}" + NL;
  protected final String TEXT_373 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_374 = "(";
  protected final String TEXT_375 = " new";
  protected final String TEXT_376 = ")" + NL + "\t{";
  protected final String TEXT_377 = NL;
  protected final String TEXT_378 = NL + "\t\tnew";
  protected final String TEXT_379 = " = new";
  protected final String TEXT_380 = " == null ? ";
  protected final String TEXT_381 = "_EDEFAULT : new";
  protected final String TEXT_382 = ";";
  protected final String TEXT_383 = NL + "\t\tif (new";
  protected final String TEXT_384 = " != null && !";
  protected final String TEXT_385 = "().contains(new";
  protected final String TEXT_386 = ")) {" + NL + "\t\t\t";
  protected final String TEXT_387 = "().add(new";
  protected final String TEXT_388 = ");" + NL + "\t\t}";
  protected final String TEXT_389 = NL + "\t\t";
  protected final String TEXT_390 = " old";
  protected final String TEXT_391 = " = eContainer();";
  protected final String TEXT_392 = NL + "\t\teSet(";
  protected final String TEXT_393 = ".eINSTANCE.get";
  protected final String TEXT_394 = "(), ";
  protected final String TEXT_395 = "new ";
  protected final String TEXT_396 = "(";
  protected final String TEXT_397 = "new";
  protected final String TEXT_398 = ")";
  protected final String TEXT_399 = ");";
  protected final String TEXT_400 = NL + "\t\tif (new";
  protected final String TEXT_401 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_402 = " && new";
  protected final String TEXT_403 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_404 = ".isAncestor(this, ";
  protected final String TEXT_405 = "new";
  protected final String TEXT_406 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_407 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_408 = NL + "\t\t\t";
  protected final String TEXT_409 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_410 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_411 = ")new";
  protected final String TEXT_412 = ").eInverseAdd(this, ";
  protected final String TEXT_413 = ", ";
  protected final String TEXT_414 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_415 = ")new";
  protected final String TEXT_416 = ", ";
  protected final String TEXT_417 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_418 = "(this, ";
  protected final String TEXT_419 = ".SET, ";
  protected final String TEXT_420 = ", new";
  protected final String TEXT_421 = ", new";
  protected final String TEXT_422 = "));";
  protected final String TEXT_423 = NL + "\t\t";
  protected final String TEXT_424 = " ";
  protected final String TEXT_425 = " = (";
  protected final String TEXT_426 = ")eVirtualGet(";
  protected final String TEXT_427 = ");";
  protected final String TEXT_428 = NL + "\t\tif (new";
  protected final String TEXT_429 = " != ";
  protected final String TEXT_430 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_431 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_432 = " != null)";
  protected final String TEXT_433 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_434 = ")";
  protected final String TEXT_435 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_436 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_437 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_438 = ")new";
  protected final String TEXT_439 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_440 = ", null, msgs);";
  protected final String TEXT_441 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_442 = ")";
  protected final String TEXT_443 = ").eInverseRemove(this, ";
  protected final String TEXT_444 = ", ";
  protected final String TEXT_445 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_446 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_447 = ")new";
  protected final String TEXT_448 = ").eInverseAdd(this, ";
  protected final String TEXT_449 = ", ";
  protected final String TEXT_450 = ".class, msgs);";
  protected final String TEXT_451 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_452 = "(";
  protected final String TEXT_453 = "new";
  protected final String TEXT_454 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_455 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_456 = NL + "\t\t\tboolean old";
  protected final String TEXT_457 = "ESet = eVirtualIsSet(";
  protected final String TEXT_458 = ");";
  protected final String TEXT_459 = NL + "\t\t\tboolean old";
  protected final String TEXT_460 = "ESet = (";
  protected final String TEXT_461 = " & ";
  protected final String TEXT_462 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_463 = " |= ";
  protected final String TEXT_464 = "_ESETFLAG;";
  protected final String TEXT_465 = NL + "\t\t\tboolean old";
  protected final String TEXT_466 = "ESet = ";
  protected final String TEXT_467 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_468 = "ESet = true;";
  protected final String TEXT_469 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_470 = "(this, ";
  protected final String TEXT_471 = ".SET, ";
  protected final String TEXT_472 = ", new";
  protected final String TEXT_473 = ", new";
  protected final String TEXT_474 = ", !old";
  protected final String TEXT_475 = "ESet));" + NL + "    \t}";
  protected final String TEXT_476 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_477 = "(this, ";
  protected final String TEXT_478 = ".SET, ";
  protected final String TEXT_479 = ", new";
  protected final String TEXT_480 = ", new";
  protected final String TEXT_481 = "));";
  protected final String TEXT_482 = NL + "\t\t";
  protected final String TEXT_483 = " old";
  protected final String TEXT_484 = " = (";
  protected final String TEXT_485 = " & ";
  protected final String TEXT_486 = "_EFLAG) != 0;" + NL + "\t\tif (new";
  protected final String TEXT_487 = ") ";
  protected final String TEXT_488 = " |= ";
  protected final String TEXT_489 = "_EFLAG; else ";
  protected final String TEXT_490 = " &= ~";
  protected final String TEXT_491 = "_EFLAG;";
  protected final String TEXT_492 = NL + "\t\t";
  protected final String TEXT_493 = " old";
  protected final String TEXT_494 = " = ";
  protected final String TEXT_495 = ";";
  protected final String TEXT_496 = NL + "\t\t";
  protected final String TEXT_497 = " ";
  protected final String TEXT_498 = " = new";
  protected final String TEXT_499 = " == null ? ";
  protected final String TEXT_500 = "_EDEFAULT : new";
  protected final String TEXT_501 = ";";
  protected final String TEXT_502 = NL + "\t\t";
  protected final String TEXT_503 = " = new";
  protected final String TEXT_504 = " == null ? ";
  protected final String TEXT_505 = "_EDEFAULT : new";
  protected final String TEXT_506 = ";";
  protected final String TEXT_507 = NL + "\t\t";
  protected final String TEXT_508 = " ";
  protected final String TEXT_509 = " = ";
  protected final String TEXT_510 = "new";
  protected final String TEXT_511 = ";";
  protected final String TEXT_512 = NL + "\t\t";
  protected final String TEXT_513 = " = ";
  protected final String TEXT_514 = "new";
  protected final String TEXT_515 = ";";
  protected final String TEXT_516 = NL + "\t\tObject old";
  protected final String TEXT_517 = " = eVirtualSet(";
  protected final String TEXT_518 = ", ";
  protected final String TEXT_519 = ");";
  protected final String TEXT_520 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_521 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_522 = NL + "\t\tboolean old";
  protected final String TEXT_523 = "ESet = (";
  protected final String TEXT_524 = " & ";
  protected final String TEXT_525 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_526 = " |= ";
  protected final String TEXT_527 = "_ESETFLAG;";
  protected final String TEXT_528 = NL + "\t\tboolean old";
  protected final String TEXT_529 = "ESet = ";
  protected final String TEXT_530 = "ESet;" + NL + "\t\t";
  protected final String TEXT_531 = "ESet = true;";
  protected final String TEXT_532 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_533 = "(this, ";
  protected final String TEXT_534 = ".SET, ";
  protected final String TEXT_535 = ", ";
  protected final String TEXT_536 = "isSetChange ? ";
  protected final String TEXT_537 = "null";
  protected final String TEXT_538 = "_EDEFAULT";
  protected final String TEXT_539 = " : old";
  protected final String TEXT_540 = "old";
  protected final String TEXT_541 = ", ";
  protected final String TEXT_542 = "new";
  protected final String TEXT_543 = ", ";
  protected final String TEXT_544 = "isSetChange";
  protected final String TEXT_545 = "!old";
  protected final String TEXT_546 = "ESet";
  protected final String TEXT_547 = "));";
  protected final String TEXT_548 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_549 = "(this, ";
  protected final String TEXT_550 = ".SET, ";
  protected final String TEXT_551 = ", ";
  protected final String TEXT_552 = "old";
  protected final String TEXT_553 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_554 = "null";
  protected final String TEXT_555 = "_EDEFAULT";
  protected final String TEXT_556 = " : old";
  protected final String TEXT_557 = "old";
  protected final String TEXT_558 = ", ";
  protected final String TEXT_559 = "new";
  protected final String TEXT_560 = "));";
  protected final String TEXT_561 = NL;
  protected final String TEXT_562 = NL + "\t\tif (";
  protected final String TEXT_563 = " != null && ";
  protected final String TEXT_564 = " != new";
  protected final String TEXT_565 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_566 = "(null);" + NL + "\t\t}";
  protected final String TEXT_567 = NL + "\t\tif (new";
  protected final String TEXT_568 = " != null || old";
  protected final String TEXT_569 = " == ";
  protected final String TEXT_570 = ") {" + NL + "\t\t\tset";
  protected final String TEXT_571 = "(new";
  protected final String TEXT_572 = ");" + NL + "\t\t}";
  protected final String TEXT_573 = NL + "\t\t((";
  protected final String TEXT_574 = ".Internal)((";
  protected final String TEXT_575 = ")get";
  protected final String TEXT_576 = "()).featureMap()).set(";
  protected final String TEXT_577 = "(), ";
  protected final String TEXT_578 = "new ";
  protected final String TEXT_579 = "(";
  protected final String TEXT_580 = "new";
  protected final String TEXT_581 = ")";
  protected final String TEXT_582 = ");";
  protected final String TEXT_583 = NL + "\t\t((";
  protected final String TEXT_584 = ".Internal)get";
  protected final String TEXT_585 = "()).set(";
  protected final String TEXT_586 = "(), ";
  protected final String TEXT_587 = "new ";
  protected final String TEXT_588 = "(";
  protected final String TEXT_589 = "new";
  protected final String TEXT_590 = ")";
  protected final String TEXT_591 = ");";
  protected final String TEXT_592 = NL;
  protected final String TEXT_593 = NL + "\t\t";
  protected final String TEXT_594 = ".";
  protected final String TEXT_595 = "(this";
  protected final String TEXT_596 = ", ";
  protected final String TEXT_597 = ");";
  protected final String TEXT_598 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_599 = "' ";
  protected final String TEXT_600 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_601 = NL + "\t}" + NL;
  protected final String TEXT_602 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_603 = " basicUnset";
  protected final String TEXT_604 = "(";
  protected final String TEXT_605 = " msgs)" + NL + "\t{";
  protected final String TEXT_606 = NL + "\t\tObject old";
  protected final String TEXT_607 = " = eVirtualUnset(";
  protected final String TEXT_608 = ");";
  protected final String TEXT_609 = NL + "\t\t";
  protected final String TEXT_610 = " old";
  protected final String TEXT_611 = " = ";
  protected final String TEXT_612 = ";" + NL + "\t\t";
  protected final String TEXT_613 = " = null;";
  protected final String TEXT_614 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_615 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_616 = NL + "\t\tboolean old";
  protected final String TEXT_617 = "ESet = (";
  protected final String TEXT_618 = " & ";
  protected final String TEXT_619 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_620 = " &= ~";
  protected final String TEXT_621 = "_ESETFLAG;";
  protected final String TEXT_622 = NL + "\t\tboolean old";
  protected final String TEXT_623 = "ESet = ";
  protected final String TEXT_624 = "ESet;" + NL + "\t\t";
  protected final String TEXT_625 = "ESet = false;";
  protected final String TEXT_626 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_627 = " notification = new ";
  protected final String TEXT_628 = "(this, ";
  protected final String TEXT_629 = ".UNSET, ";
  protected final String TEXT_630 = ", ";
  protected final String TEXT_631 = "isSetChange ? old";
  protected final String TEXT_632 = " : null";
  protected final String TEXT_633 = "old";
  protected final String TEXT_634 = ", null, ";
  protected final String TEXT_635 = "isSetChange";
  protected final String TEXT_636 = "old";
  protected final String TEXT_637 = "ESet";
  protected final String TEXT_638 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_639 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_640 = "' ";
  protected final String TEXT_641 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_642 = NL + "\t}" + NL;
  protected final String TEXT_643 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void unset";
  protected final String TEXT_644 = "()" + NL + "\t{";
  protected final String TEXT_645 = NL + "\t\teUnset(";
  protected final String TEXT_646 = ".eINSTANCE.get";
  protected final String TEXT_647 = "());";
  protected final String TEXT_648 = NL + "\t\t((";
  protected final String TEXT_649 = ".Unsettable)get";
  protected final String TEXT_650 = "()).unset();";
  protected final String TEXT_651 = NL + "\t\t";
  protected final String TEXT_652 = " ";
  protected final String TEXT_653 = " = (";
  protected final String TEXT_654 = ")eVirtualGet(";
  protected final String TEXT_655 = ");";
  protected final String TEXT_656 = NL + "\t\tif (";
  protected final String TEXT_657 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_658 = " msgs = null;";
  protected final String TEXT_659 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_660 = ")";
  protected final String TEXT_661 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_662 = ", null, msgs);";
  protected final String TEXT_663 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_664 = ")";
  protected final String TEXT_665 = ").eInverseRemove(this, ";
  protected final String TEXT_666 = ", ";
  protected final String TEXT_667 = ".class, msgs);";
  protected final String TEXT_668 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_669 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_670 = NL + "\t\t\tboolean old";
  protected final String TEXT_671 = "ESet = eVirtualIsSet(";
  protected final String TEXT_672 = ");";
  protected final String TEXT_673 = NL + "\t\t\tboolean old";
  protected final String TEXT_674 = "ESet = (";
  protected final String TEXT_675 = " & ";
  protected final String TEXT_676 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_677 = " &= ~";
  protected final String TEXT_678 = "_ESETFLAG;";
  protected final String TEXT_679 = NL + "\t\t\tboolean old";
  protected final String TEXT_680 = "ESet = ";
  protected final String TEXT_681 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_682 = "ESet = false;";
  protected final String TEXT_683 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_684 = "(this, ";
  protected final String TEXT_685 = ".UNSET, ";
  protected final String TEXT_686 = ", null, null, old";
  protected final String TEXT_687 = "ESet));" + NL + "    \t}";
  protected final String TEXT_688 = NL + "\t\t";
  protected final String TEXT_689 = " old";
  protected final String TEXT_690 = " = (";
  protected final String TEXT_691 = " & ";
  protected final String TEXT_692 = "_EFLAG) != 0;";
  protected final String TEXT_693 = NL + "\t\tObject old";
  protected final String TEXT_694 = " = eVirtualUnset(";
  protected final String TEXT_695 = ");";
  protected final String TEXT_696 = NL + "\t\t";
  protected final String TEXT_697 = " old";
  protected final String TEXT_698 = " = ";
  protected final String TEXT_699 = ";";
  protected final String TEXT_700 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_701 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_702 = NL + "\t\tboolean old";
  protected final String TEXT_703 = "ESet = (";
  protected final String TEXT_704 = " & ";
  protected final String TEXT_705 = "_ESETFLAG) != 0;";
  protected final String TEXT_706 = NL + "\t\tboolean old";
  protected final String TEXT_707 = "ESet = ";
  protected final String TEXT_708 = "ESet;";
  protected final String TEXT_709 = NL + "\t\t";
  protected final String TEXT_710 = " = null;";
  protected final String TEXT_711 = NL + "\t\t";
  protected final String TEXT_712 = " &= ~";
  protected final String TEXT_713 = "_ESETFLAG;";
  protected final String TEXT_714 = NL + "\t\t";
  protected final String TEXT_715 = "ESet = false;";
  protected final String TEXT_716 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_717 = "(this, ";
  protected final String TEXT_718 = ".UNSET, ";
  protected final String TEXT_719 = ", ";
  protected final String TEXT_720 = "isSetChange ? old";
  protected final String TEXT_721 = " : null";
  protected final String TEXT_722 = "old";
  protected final String TEXT_723 = ", null, ";
  protected final String TEXT_724 = "isSetChange";
  protected final String TEXT_725 = "old";
  protected final String TEXT_726 = "ESet";
  protected final String TEXT_727 = "));";
  protected final String TEXT_728 = NL + "\t\tif (";
  protected final String TEXT_729 = "_EDEFAULT) ";
  protected final String TEXT_730 = " |= ";
  protected final String TEXT_731 = "_EFLAG; else ";
  protected final String TEXT_732 = " &= ~";
  protected final String TEXT_733 = "_EFLAG;";
  protected final String TEXT_734 = NL + "\t\t";
  protected final String TEXT_735 = " = ";
  protected final String TEXT_736 = "_EDEFAULT;";
  protected final String TEXT_737 = NL + "\t\t";
  protected final String TEXT_738 = " &= ~";
  protected final String TEXT_739 = "_ESETFLAG;";
  protected final String TEXT_740 = NL + "\t\t";
  protected final String TEXT_741 = "ESet = false;";
  protected final String TEXT_742 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_743 = "(this, ";
  protected final String TEXT_744 = ".UNSET, ";
  protected final String TEXT_745 = ", ";
  protected final String TEXT_746 = "isSetChange ? old";
  protected final String TEXT_747 = " : ";
  protected final String TEXT_748 = "_EDEFAULT";
  protected final String TEXT_749 = "old";
  protected final String TEXT_750 = ", ";
  protected final String TEXT_751 = "_EDEFAULT, ";
  protected final String TEXT_752 = "isSetChange";
  protected final String TEXT_753 = "old";
  protected final String TEXT_754 = "ESet";
  protected final String TEXT_755 = "));";
  protected final String TEXT_756 = NL + "\t\t((";
  protected final String TEXT_757 = ".Internal)((";
  protected final String TEXT_758 = ")get";
  protected final String TEXT_759 = "()).featureMap()).clear(";
  protected final String TEXT_760 = "());";
  protected final String TEXT_761 = NL + "\t\t((";
  protected final String TEXT_762 = ".Internal)get";
  protected final String TEXT_763 = "()).clear(";
  protected final String TEXT_764 = "());";
  protected final String TEXT_765 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_766 = "' ";
  protected final String TEXT_767 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_768 = NL + "\t}" + NL;
  protected final String TEXT_769 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_770 = "()" + NL + "\t{";
  protected final String TEXT_771 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_772 = ".eINSTANCE.get";
  protected final String TEXT_773 = "());";
  protected final String TEXT_774 = NL + "\t\t";
  protected final String TEXT_775 = " ";
  protected final String TEXT_776 = " = (";
  protected final String TEXT_777 = ")eVirtualGet(";
  protected final String TEXT_778 = ");";
  protected final String TEXT_779 = NL + "\t\treturn ";
  protected final String TEXT_780 = " != null && ((";
  protected final String TEXT_781 = ".Unsettable)";
  protected final String TEXT_782 = ").isSet();";
  protected final String TEXT_783 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_784 = ");";
  protected final String TEXT_785 = NL + "\t\treturn (";
  protected final String TEXT_786 = " & ";
  protected final String TEXT_787 = "_ESETFLAG) != 0;";
  protected final String TEXT_788 = NL + "\t\treturn ";
  protected final String TEXT_789 = "ESet;";
  protected final String TEXT_790 = NL + "\t\treturn !((";
  protected final String TEXT_791 = ".Internal)((";
  protected final String TEXT_792 = ")get";
  protected final String TEXT_793 = "()).featureMap()).isEmpty(";
  protected final String TEXT_794 = "());";
  protected final String TEXT_795 = NL + "\t\treturn !((";
  protected final String TEXT_796 = ".Internal)get";
  protected final String TEXT_797 = "()).isEmpty(";
  protected final String TEXT_798 = "());";
  protected final String TEXT_799 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_800 = "' ";
  protected final String TEXT_801 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_802 = NL + "\t}" + NL;
  protected final String TEXT_803 = NL;
  protected final String TEXT_804 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_805 = " create";
  protected final String TEXT_806 = "(";
  protected final String TEXT_807 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_808 = " new";
  protected final String TEXT_809 = " = (";
  protected final String TEXT_810 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_811 = NL + "\t\t";
  protected final String TEXT_812 = "().add(new";
  protected final String TEXT_813 = ");";
  protected final String TEXT_814 = NL + "\t\tset";
  protected final String TEXT_815 = "(new";
  protected final String TEXT_816 = ");";
  protected final String TEXT_817 = NL + "\t\treturn new";
  protected final String TEXT_818 = ";" + NL + "\t}" + NL;
  protected final String TEXT_819 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_820 = " create";
  protected final String TEXT_821 = "() {" + NL + "\t\t";
  protected final String TEXT_822 = " new";
  protected final String TEXT_823 = " = ";
  protected final String TEXT_824 = ".eINSTANCE.create";
  protected final String TEXT_825 = "();";
  protected final String TEXT_826 = NL + "\t\t";
  protected final String TEXT_827 = "().add(new";
  protected final String TEXT_828 = ");";
  protected final String TEXT_829 = NL + "\t\tset";
  protected final String TEXT_830 = "(new";
  protected final String TEXT_831 = ");";
  protected final String TEXT_832 = NL + "\t\treturn new";
  protected final String TEXT_833 = ";" + NL + "\t}" + NL;
  protected final String TEXT_834 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_835 = " get";
  protected final String TEXT_836 = "(";
  protected final String TEXT_837 = " ";
  protected final String TEXT_838 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_839 = " i = ";
  protected final String TEXT_840 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_841 = " ";
  protected final String TEXT_842 = " = (";
  protected final String TEXT_843 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_844 = ".equals(";
  protected final String TEXT_845 = ".";
  protected final String TEXT_846 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_847 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_848 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_849 = "()" + NL + "\t{";
  protected final String TEXT_850 = NL + "  \t\treturn false;";
  protected final String TEXT_851 = NL + "\t\treturn !((";
  protected final String TEXT_852 = ")";
  protected final String TEXT_853 = "()).featureMap().isEmpty();";
  protected final String TEXT_854 = NL + "\t\treturn ";
  protected final String TEXT_855 = " != null && !";
  protected final String TEXT_856 = ".featureMap().isEmpty();";
  protected final String TEXT_857 = NL + "\t\treturn ";
  protected final String TEXT_858 = " != null && !";
  protected final String TEXT_859 = ".isEmpty();";
  protected final String TEXT_860 = NL + "\t\t";
  protected final String TEXT_861 = " ";
  protected final String TEXT_862 = " = (";
  protected final String TEXT_863 = ")eVirtualGet(";
  protected final String TEXT_864 = ");" + NL + "\t\treturn ";
  protected final String TEXT_865 = " != null && !";
  protected final String TEXT_866 = ".isEmpty();";
  protected final String TEXT_867 = NL + "\t\treturn !";
  protected final String TEXT_868 = "().isEmpty();";
  protected final String TEXT_869 = NL + "\t\treturn ";
  protected final String TEXT_870 = " != null;";
  protected final String TEXT_871 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_872 = ") != null;";
  protected final String TEXT_873 = NL + "\t\treturn basicGet";
  protected final String TEXT_874 = "() != null;";
  protected final String TEXT_875 = NL + "\t\treturn ";
  protected final String TEXT_876 = " != null;";
  protected final String TEXT_877 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_878 = ") != null;";
  protected final String TEXT_879 = NL + "\t\treturn ";
  protected final String TEXT_880 = "() != null;";
  protected final String TEXT_881 = NL + "\t\treturn ((";
  protected final String TEXT_882 = " & ";
  protected final String TEXT_883 = "_EFLAG) != 0) != ";
  protected final String TEXT_884 = "_EDEFAULT;";
  protected final String TEXT_885 = NL + "\t\treturn ";
  protected final String TEXT_886 = " != ";
  protected final String TEXT_887 = "_EDEFAULT;";
  protected final String TEXT_888 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_889 = ") && eVirtualGet(";
  protected final String TEXT_890 = ") != ";
  protected final String TEXT_891 = "_EDEFAULT;";
  protected final String TEXT_892 = NL + "\t\treturn ";
  protected final String TEXT_893 = "() != ";
  protected final String TEXT_894 = "_EDEFAULT;";
  protected final String TEXT_895 = NL + "\t\treturn ";
  protected final String TEXT_896 = "_EDEFAULT == null ? ";
  protected final String TEXT_897 = " != null : !";
  protected final String TEXT_898 = "_EDEFAULT.equals(";
  protected final String TEXT_899 = ");";
  protected final String TEXT_900 = NL + "\t\t";
  protected final String TEXT_901 = " ";
  protected final String TEXT_902 = " = eVirtualIsSet(";
  protected final String TEXT_903 = ") ? (";
  protected final String TEXT_904 = ")eVirtualGet(";
  protected final String TEXT_905 = ") : ";
  protected final String TEXT_906 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_907 = "_EDEFAULT == null ? ";
  protected final String TEXT_908 = " != null : !";
  protected final String TEXT_909 = "_EDEFAULT.equals(";
  protected final String TEXT_910 = ");";
  protected final String TEXT_911 = NL + "\t\treturn ";
  protected final String TEXT_912 = "_EDEFAULT == null ? ";
  protected final String TEXT_913 = "() != null : !";
  protected final String TEXT_914 = "_EDEFAULT.equals(";
  protected final String TEXT_915 = "());";
  protected final String TEXT_916 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_917 = ".eINSTANCE.get";
  protected final String TEXT_918 = "());";
  protected final String TEXT_919 = NL + "\t\t";
  protected final String TEXT_920 = " ";
  protected final String TEXT_921 = " = (";
  protected final String TEXT_922 = ")eVirtualGet(";
  protected final String TEXT_923 = ");";
  protected final String TEXT_924 = NL + "\t\treturn ";
  protected final String TEXT_925 = " != null && ((";
  protected final String TEXT_926 = ".Unsettable)";
  protected final String TEXT_927 = ").isSet();";
  protected final String TEXT_928 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_929 = ");";
  protected final String TEXT_930 = NL + "\t\treturn (";
  protected final String TEXT_931 = " & ";
  protected final String TEXT_932 = "_ESETFLAG) != 0;";
  protected final String TEXT_933 = NL + "\t\treturn ";
  protected final String TEXT_934 = "ESet;";
  protected final String TEXT_935 = NL + "\t\treturn !((";
  protected final String TEXT_936 = ".Internal)((";
  protected final String TEXT_937 = ")get";
  protected final String TEXT_938 = "()).featureMap()).isEmpty(";
  protected final String TEXT_939 = "());";
  protected final String TEXT_940 = NL + "\t\treturn !((";
  protected final String TEXT_941 = ".Internal)get";
  protected final String TEXT_942 = "()).isEmpty(";
  protected final String TEXT_943 = "());";
  protected final String TEXT_944 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_945 = "' ";
  protected final String TEXT_946 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_947 = NL + "\t}" + NL;
  protected final String TEXT_948 = NL;
  protected final String TEXT_949 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_950 = " ";
  protected final String TEXT_951 = "(";
  protected final String TEXT_952 = ")";
  protected final String TEXT_953 = NL + "\t{";
  protected final String TEXT_954 = NL + "\t\t";
  protected final String TEXT_955 = NL + "\t\treturn ";
  protected final String TEXT_956 = ".";
  protected final String TEXT_957 = "(this, ";
  protected final String TEXT_958 = ", ";
  protected final String TEXT_959 = ");";
  protected final String TEXT_960 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_961 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_962 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_963 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_964 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_965 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_966 = ".";
  protected final String TEXT_967 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_968 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_969 = "\", ";
  protected final String TEXT_970 = ".getObjectLabel(this, ";
  protected final String TEXT_971 = ") }),";
  protected final String TEXT_972 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_973 = NL + "\t\t";
  protected final String TEXT_974 = ".";
  protected final String TEXT_975 = "(this";
  protected final String TEXT_976 = ", ";
  protected final String TEXT_977 = ");";
  protected final String TEXT_978 = NL + "\t\t";
  protected final String TEXT_979 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_980 = " result = (";
  protected final String TEXT_981 = ") cache.get(";
  protected final String TEXT_982 = "eResource(), ";
  protected final String TEXT_983 = "this, ";
  protected final String TEXT_984 = ".eINSTANCE.get";
  protected final String TEXT_985 = "().getEOperations().get(";
  protected final String TEXT_986 = "));" + NL + "\t\t\tif (result == null) {" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_987 = "eResource(), ";
  protected final String TEXT_988 = "this, ";
  protected final String TEXT_989 = ".eINSTANCE.get";
  protected final String TEXT_990 = "().getEOperations().get(";
  protected final String TEXT_991 = "), result = ";
  protected final String TEXT_992 = "new ";
  protected final String TEXT_993 = "(";
  protected final String TEXT_994 = ".";
  protected final String TEXT_995 = "(this";
  protected final String TEXT_996 = ", ";
  protected final String TEXT_997 = ")";
  protected final String TEXT_998 = ")";
  protected final String TEXT_999 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1000 = ".";
  protected final String TEXT_1001 = "()";
  protected final String TEXT_1002 = ";" + NL + "\t\t}";
  protected final String TEXT_1003 = NL + "\t\treturn ";
  protected final String TEXT_1004 = ".";
  protected final String TEXT_1005 = "(this";
  protected final String TEXT_1006 = ", ";
  protected final String TEXT_1007 = ");";
  protected final String TEXT_1008 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1009 = NL + "\t}" + NL;
  protected final String TEXT_1010 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1011 = " eInverseAdd(";
  protected final String TEXT_1012 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_1013 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_1014 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1015 = ":";
  protected final String TEXT_1016 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1017 = ")((";
  protected final String TEXT_1018 = ")";
  protected final String TEXT_1019 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1020 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1021 = ")";
  protected final String TEXT_1022 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1023 = NL + "\t\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1024 = ", msgs);";
  protected final String TEXT_1025 = NL + "\t\t\t\t\t";
  protected final String TEXT_1026 = " ";
  protected final String TEXT_1027 = " = (";
  protected final String TEXT_1028 = ")eVirtualGet(";
  protected final String TEXT_1029 = ");";
  protected final String TEXT_1030 = NL + "\t\t\t\t\tif (";
  protected final String TEXT_1031 = " != null)";
  protected final String TEXT_1032 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1033 = ")";
  protected final String TEXT_1034 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1035 = ", null, msgs);";
  protected final String TEXT_1036 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1037 = ")";
  protected final String TEXT_1038 = ").eInverseRemove(this, ";
  protected final String TEXT_1039 = ", ";
  protected final String TEXT_1040 = ".class, msgs);";
  protected final String TEXT_1041 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_1042 = "((";
  protected final String TEXT_1043 = ")otherEnd, msgs);";
  protected final String TEXT_1044 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (eInternalContainer() != null)" + NL + "\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\treturn eBasicSetContainer(otherEnd, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1045 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1046 = " eInverseRemove(";
  protected final String TEXT_1047 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_1048 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_1049 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1050 = ":";
  protected final String TEXT_1051 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1052 = ")((";
  protected final String TEXT_1053 = ")";
  protected final String TEXT_1054 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1055 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1056 = ")((";
  protected final String TEXT_1057 = ")";
  protected final String TEXT_1058 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1059 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_1060 = ")";
  protected final String TEXT_1061 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1062 = NL + "\t\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1063 = ", msgs);";
  protected final String TEXT_1064 = NL + "\t\t\t\t\treturn basicUnset";
  protected final String TEXT_1065 = "(msgs);";
  protected final String TEXT_1066 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_1067 = "(null, msgs);";
  protected final String TEXT_1068 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eBasicSetContainer(null, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1069 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1070 = " eBasicRemoveFromContainer(";
  protected final String TEXT_1071 = " msgs)" + NL + "\t{" + NL + "\t\tif (eContainerFeatureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eContainerFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1072 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1073 = ":" + NL + "\t\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1074 = ", ";
  protected final String TEXT_1075 = ".class, msgs);";
  protected final String TEXT_1076 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicBasicRemoveFromContainer(msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eInternalContainer().eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_1077 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(";
  protected final String TEXT_1078 = " eFeature, boolean resolve)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1079 = NL + "\t\t\tcase ";
  protected final String TEXT_1080 = ":";
  protected final String TEXT_1081 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1082 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1083 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1084 = "(";
  protected final String TEXT_1085 = "());";
  protected final String TEXT_1086 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1087 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1088 = "();";
  protected final String TEXT_1089 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1090 = ")";
  protected final String TEXT_1091 = "()).eMap();";
  protected final String TEXT_1092 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1093 = ")";
  protected final String TEXT_1094 = "()).featureMap();";
  protected final String TEXT_1095 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1096 = "();";
  protected final String TEXT_1097 = NL + "\t\t}" + NL + "\t\treturn eDynamicGet(eFeature, resolve);" + NL + "\t}" + NL;
  protected final String TEXT_1098 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(";
  protected final String TEXT_1099 = " eFeature, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1100 = NL + "\t\t\tcase ";
  protected final String TEXT_1101 = ":";
  protected final String TEXT_1102 = NL + "\t\t\t\t((";
  protected final String TEXT_1103 = ")";
  protected final String TEXT_1104 = "()).featureMap().clear();";
  protected final String TEXT_1105 = NL + "\t\t\t\t";
  protected final String TEXT_1106 = "().clear();";
  protected final String TEXT_1107 = NL + "\t\t\t\t((";
  protected final String TEXT_1108 = ")";
  protected final String TEXT_1109 = "()).featureMap().addAll((";
  protected final String TEXT_1110 = ")newValue);";
  protected final String TEXT_1111 = NL + "\t\t\t\t((";
  protected final String TEXT_1112 = ")";
  protected final String TEXT_1113 = "()).eMap().addAll((";
  protected final String TEXT_1114 = ")newValue);";
  protected final String TEXT_1115 = NL + "\t\t\t\t";
  protected final String TEXT_1116 = "().addAll((";
  protected final String TEXT_1117 = ")newValue);";
  protected final String TEXT_1118 = NL + "\t\t\t\tset";
  protected final String TEXT_1119 = "(((";
  protected final String TEXT_1120 = ")newValue).";
  protected final String TEXT_1121 = "());";
  protected final String TEXT_1122 = NL + "\t\t\t\tset";
  protected final String TEXT_1123 = "((";
  protected final String TEXT_1124 = ")newValue);";
  protected final String TEXT_1125 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1126 = NL + "\t\t}" + NL + "\t\teDynamicSet(eFeature, newValue);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(";
  protected final String TEXT_1127 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1128 = NL + "\t\t\tcase ";
  protected final String TEXT_1129 = ":";
  protected final String TEXT_1130 = NL + "\t\t\t\t((";
  protected final String TEXT_1131 = ")";
  protected final String TEXT_1132 = "()).featureMap().clear();";
  protected final String TEXT_1133 = NL + "\t\t\t\t";
  protected final String TEXT_1134 = "().clear();";
  protected final String TEXT_1135 = NL + "\t\t\t\tunset";
  protected final String TEXT_1136 = "();";
  protected final String TEXT_1137 = NL + "\t\t\t\tset";
  protected final String TEXT_1138 = "((";
  protected final String TEXT_1139 = ")null);";
  protected final String TEXT_1140 = NL + "\t\t\t\tset";
  protected final String TEXT_1141 = "(";
  protected final String TEXT_1142 = "_EDEFAULT);";
  protected final String TEXT_1143 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1144 = NL + "\t\t}" + NL + "\t\teDynamicUnset(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1145 = NL;
  protected final String TEXT_1146 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(";
  protected final String TEXT_1147 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_1148 = NL + "\t\t\tcase ";
  protected final String TEXT_1149 = ":";
  protected final String TEXT_1150 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1151 = "();";
  protected final String TEXT_1152 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1153 = ")";
  protected final String TEXT_1154 = "()).featureMap().isEmpty();";
  protected final String TEXT_1155 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1156 = " != null && !";
  protected final String TEXT_1157 = ".featureMap().isEmpty();";
  protected final String TEXT_1158 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1159 = " != null && !";
  protected final String TEXT_1160 = ".isEmpty();";
  protected final String TEXT_1161 = NL + "\t\t\t\t";
  protected final String TEXT_1162 = " ";
  protected final String TEXT_1163 = " = (";
  protected final String TEXT_1164 = ")eVirtualGet(";
  protected final String TEXT_1165 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1166 = " != null && !";
  protected final String TEXT_1167 = ".isEmpty();";
  protected final String TEXT_1168 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1169 = "().isEmpty();";
  protected final String TEXT_1170 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1171 = "();";
  protected final String TEXT_1172 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1173 = " != null;";
  protected final String TEXT_1174 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1175 = ") != null;";
  protected final String TEXT_1176 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1177 = "() != null;";
  protected final String TEXT_1178 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1179 = " != null;";
  protected final String TEXT_1180 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1181 = ") != null;";
  protected final String TEXT_1182 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1183 = "() != null;";
  protected final String TEXT_1184 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1185 = " & ";
  protected final String TEXT_1186 = "_EFLAG) != 0) != ";
  protected final String TEXT_1187 = "_EDEFAULT;";
  protected final String TEXT_1188 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1189 = " != ";
  protected final String TEXT_1190 = "_EDEFAULT;";
  protected final String TEXT_1191 = NL + "\t\t\t\treturn eVirtualIsSet(";
  protected final String TEXT_1192 = ") && eVirtualGet(";
  protected final String TEXT_1193 = ") != ";
  protected final String TEXT_1194 = "_EDEFAULT;";
  protected final String TEXT_1195 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1196 = "() != ";
  protected final String TEXT_1197 = "_EDEFAULT;";
  protected final String TEXT_1198 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1199 = "_EDEFAULT == null ? ";
  protected final String TEXT_1200 = " != null : !";
  protected final String TEXT_1201 = "_EDEFAULT.equals(";
  protected final String TEXT_1202 = ");";
  protected final String TEXT_1203 = NL + "\t\t\t\t";
  protected final String TEXT_1204 = " ";
  protected final String TEXT_1205 = " = eVirtualIsSet(";
  protected final String TEXT_1206 = ") ? (";
  protected final String TEXT_1207 = ")eVirtualGet(";
  protected final String TEXT_1208 = ") : ";
  protected final String TEXT_1209 = "_EDEFAULT;" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1210 = "_EDEFAULT == null ? ";
  protected final String TEXT_1211 = " != null : !";
  protected final String TEXT_1212 = "_EDEFAULT.equals(";
  protected final String TEXT_1213 = ");";
  protected final String TEXT_1214 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1215 = "_EDEFAULT == null ? ";
  protected final String TEXT_1216 = "() != null : !";
  protected final String TEXT_1217 = "_EDEFAULT.equals(";
  protected final String TEXT_1218 = "());";
  protected final String TEXT_1219 = NL + "\t\t}" + NL + "\t\treturn eDynamicIsSet(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_1220 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1221 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1222 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1223 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1224 = ": return ";
  protected final String TEXT_1225 = ";";
  protected final String TEXT_1226 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1227 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1228 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1229 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1230 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1231 = ": return ";
  protected final String TEXT_1232 = ";";
  protected final String TEXT_1233 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1234 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1235 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1236 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1237 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1238 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1239 = NL + "\t\t\tcase ";
  protected final String TEXT_1240 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1241 = ";";
  protected final String TEXT_1242 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1243 = NL + "\t\t\tcase ";
  protected final String TEXT_1244 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1245 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1246 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1247 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1248 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1249 = ": \");";
  protected final String TEXT_1250 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1251 = ": \");";
  protected final String TEXT_1252 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1253 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1254 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1255 = NL + "\t\tif (";
  protected final String TEXT_1256 = "(";
  protected final String TEXT_1257 = " & ";
  protected final String TEXT_1258 = "_ESETFLAG) != 0";
  protected final String TEXT_1259 = "ESet";
  protected final String TEXT_1260 = ") result.append((";
  protected final String TEXT_1261 = " & ";
  protected final String TEXT_1262 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1263 = NL + "\t\tif (";
  protected final String TEXT_1264 = "(";
  protected final String TEXT_1265 = " & ";
  protected final String TEXT_1266 = "_ESETFLAG) != 0";
  protected final String TEXT_1267 = "ESet";
  protected final String TEXT_1268 = ") result.append(";
  protected final String TEXT_1269 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1270 = NL + "\t\tresult.append(eVirtualIsSet(";
  protected final String TEXT_1271 = ") ? eVirtualGet(";
  protected final String TEXT_1272 = ") : ";
  protected final String TEXT_1273 = "null";
  protected final String TEXT_1274 = "_EDEFAULT";
  protected final String TEXT_1275 = ");";
  protected final String TEXT_1276 = NL + "\t\tresult.append((";
  protected final String TEXT_1277 = " & ";
  protected final String TEXT_1278 = "_EFLAG) != 0);";
  protected final String TEXT_1279 = NL + "\t\tresult.append(";
  protected final String TEXT_1280 = ");";
  protected final String TEXT_1281 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1282 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1283 = NL + "\t\treturn new ";
  protected final String TEXT_1284 = "(getTypedKey());";
  protected final String TEXT_1285 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1286 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1287 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1288 = ")key);";
  protected final String TEXT_1289 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1290 = ")key).";
  protected final String TEXT_1291 = "());";
  protected final String TEXT_1292 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1293 = ")key);";
  protected final String TEXT_1294 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1295 = NL + "\t\treturn new ";
  protected final String TEXT_1296 = "(getTypedValue());";
  protected final String TEXT_1297 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1298 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1299 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1300 = ")value);";
  protected final String TEXT_1301 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1302 = ")value).";
  protected final String TEXT_1303 = "());";
  protected final String TEXT_1304 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1305 = ")value);";
  protected final String TEXT_1306 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1307 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1308 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1309 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1310 = NL;
  protected final String TEXT_1311 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1312 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1313 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1314 = " getCacheAdapter() {" + NL + "\t\tfor (";
  protected final String TEXT_1315 = " i = eAdapters().iterator(); i.hasNext();) {" + NL + "\t\t\t";
  protected final String TEXT_1316 = " adapter = (";
  protected final String TEXT_1317 = ") i.next();" + NL + "\t\t\tif (adapter instanceof ";
  protected final String TEXT_1318 = ") {" + NL + "\t\t\t\treturn (";
  protected final String TEXT_1319 = ") adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1320 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1321 = " basicGet";
  protected final String TEXT_1322 = "()" + NL + "\t{";
  protected final String TEXT_1323 = NL + "\t\tif (isSet";
  protected final String TEXT_1324 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1325 = "basicGet";
  protected final String TEXT_1326 = "();" + NL + "\t\t}";
  protected final String TEXT_1327 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1328 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1329 = "basicGet";
  protected final String TEXT_1330 = "();" + NL + "\t\t}";
  protected final String TEXT_1331 = NL + "\t\t";
  protected final String TEXT_1332 = " ";
  protected final String TEXT_1333 = " = ";
  protected final String TEXT_1334 = "basicGet";
  protected final String TEXT_1335 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1336 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1337 = ";" + NL + "\t\t}";
  protected final String TEXT_1338 = NL + "\t\treturn ";
  protected final String TEXT_1339 = "super.basicGet";
  protected final String TEXT_1340 = "()";
  protected final String TEXT_1341 = "null";
  protected final String TEXT_1342 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1343 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1344 = " ";
  protected final String TEXT_1345 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1346 = " ";
  protected final String TEXT_1347 = " = basicGet";
  protected final String TEXT_1348 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1349 = " == null ? null : (";
  protected final String TEXT_1350 = ")eResolveProxy((";
  protected final String TEXT_1351 = ")";
  protected final String TEXT_1352 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1353 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1354 = " ";
  protected final String TEXT_1355 = "Helper(";
  protected final String TEXT_1356 = " ";
  protected final String TEXT_1357 = ")" + NL + "\t{";
  protected final String TEXT_1358 = NL + "\t\t";
  protected final String TEXT_1359 = ".addAll(super.";
  protected final String TEXT_1360 = "());";
  protected final String TEXT_1361 = NL + "\t\tsuper.";
  protected final String TEXT_1362 = "Helper(";
  protected final String TEXT_1363 = ");";
  protected final String TEXT_1364 = NL + "\t\tif (isSet";
  protected final String TEXT_1365 = "()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1366 = " i = ((";
  protected final String TEXT_1367 = ") ";
  protected final String TEXT_1368 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1369 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1370 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1371 = "())) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1372 = " i = ((";
  protected final String TEXT_1373 = ") ";
  protected final String TEXT_1374 = "()).basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1375 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1376 = NL + "\t\t";
  protected final String TEXT_1377 = " ";
  protected final String TEXT_1378 = " = ";
  protected final String TEXT_1379 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1380 = ".isEmpty()) {" + NL + "\t\t\tfor (";
  protected final String TEXT_1381 = " i = ((";
  protected final String TEXT_1382 = ") ";
  protected final String TEXT_1383 = ").basicIterator(); i.hasNext(); ) {" + NL + "\t\t\t\t";
  protected final String TEXT_1384 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1385 = NL + "\t\tif (isSet";
  protected final String TEXT_1386 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1387 = ".addAll(";
  protected final String TEXT_1388 = "());" + NL + "\t\t}";
  protected final String TEXT_1389 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1390 = "())) {" + NL + "\t\t\t";
  protected final String TEXT_1391 = ".addAll(";
  protected final String TEXT_1392 = "());" + NL + "\t\t}";
  protected final String TEXT_1393 = NL + "\t\t";
  protected final String TEXT_1394 = " ";
  protected final String TEXT_1395 = " = ";
  protected final String TEXT_1396 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1397 = ".isEmpty()) {" + NL + "\t\t\t";
  protected final String TEXT_1398 = ".addAll(";
  protected final String TEXT_1399 = ");" + NL + "\t\t}";
  protected final String TEXT_1400 = NL + "\t\tif (isSet";
  protected final String TEXT_1401 = "()) {" + NL + "\t\t\t";
  protected final String TEXT_1402 = ".add(";
  protected final String TEXT_1403 = "basicGet";
  protected final String TEXT_1404 = "());" + NL + "\t\t}";
  protected final String TEXT_1405 = NL + "\t\t";
  protected final String TEXT_1406 = " ";
  protected final String TEXT_1407 = " = ";
  protected final String TEXT_1408 = "basicGet";
  protected final String TEXT_1409 = "();" + NL + "\t\tif (";
  protected final String TEXT_1410 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_1411 = ".add(";
  protected final String TEXT_1412 = ");" + NL + "\t\t}";
  protected final String TEXT_1413 = NL + "\t\treturn ";
  protected final String TEXT_1414 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1415 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1416 = " ";
  protected final String TEXT_1417 = "()" + NL + "\t{";
  protected final String TEXT_1418 = NL + "\t\t";
  protected final String TEXT_1419 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_1420 = NL + "\t\t\ttry {" + NL + "\t\t\t\t";
  protected final String TEXT_1421 = " method = getClass().getMethod(\"";
  protected final String TEXT_1422 = "\", null);";
  protected final String TEXT_1423 = NL + "\t\t\t\t";
  protected final String TEXT_1424 = " ";
  protected final String TEXT_1425 = " = (";
  protected final String TEXT_1426 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_1427 = " == null) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_1428 = " union = ";
  protected final String TEXT_1429 = "Helper(new ";
  protected final String TEXT_1430 = "());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_1431 = " = new ";
  protected final String TEXT_1432 = "(this, ";
  protected final String TEXT_1433 = "null";
  protected final String TEXT_1434 = "()";
  protected final String TEXT_1435 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1436 = ";" + NL + "\t\t\t} catch (";
  protected final String TEXT_1437 = " nsme) {" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_1438 = NL + "\t\t\t";
  protected final String TEXT_1439 = " ";
  protected final String TEXT_1440 = " = (";
  protected final String TEXT_1441 = ") cache.get(eResource(), this, ";
  protected final String TEXT_1442 = "());" + NL + "\t\t\tif (";
  protected final String TEXT_1443 = " == null) {" + NL + "\t\t\t\t";
  protected final String TEXT_1444 = " union = ";
  protected final String TEXT_1445 = "Helper(new ";
  protected final String TEXT_1446 = "());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_1447 = "(), ";
  protected final String TEXT_1448 = " = new ";
  protected final String TEXT_1449 = "(this, ";
  protected final String TEXT_1450 = "null";
  protected final String TEXT_1451 = "()";
  protected final String TEXT_1452 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_1453 = ";";
  protected final String TEXT_1454 = NL + "\t\t}";
  protected final String TEXT_1455 = NL + "\t\t";
  protected final String TEXT_1456 = " union = ";
  protected final String TEXT_1457 = "Helper(new ";
  protected final String TEXT_1458 = "());" + NL + "\t\treturn new ";
  protected final String TEXT_1459 = "(this, ";
  protected final String TEXT_1460 = "null";
  protected final String TEXT_1461 = "()";
  protected final String TEXT_1462 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_1463 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1464 = " ";
  protected final String TEXT_1465 = "()" + NL + "\t{";
  protected final String TEXT_1466 = NL + "\t\tif (isSet";
  protected final String TEXT_1467 = "()) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1468 = "();" + NL + "\t\t}";
  protected final String TEXT_1469 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1470 = "())) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1471 = "();" + NL + "\t\t}";
  protected final String TEXT_1472 = NL + "\t\t";
  protected final String TEXT_1473 = " ";
  protected final String TEXT_1474 = " = ";
  protected final String TEXT_1475 = "();" + NL + "\t\tif (";
  protected final String TEXT_1476 = " != null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_1477 = ";" + NL + "\t\t}";
  protected final String TEXT_1478 = NL + "\t\treturn ";
  protected final String TEXT_1479 = "super.";
  protected final String TEXT_1480 = "()";
  protected final String TEXT_1481 = "null";
  protected final String TEXT_1482 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1483 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1484 = "()" + NL + "\t{";
  protected final String TEXT_1485 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1486 = "()";
  protected final String TEXT_1487 = NL + "\t\treturn isSet";
  protected final String TEXT_1488 = "()";
  protected final String TEXT_1489 = ";";
  protected final String TEXT_1490 = NL + "\t\treturn !";
  protected final String TEXT_1491 = "().isEmpty()";
  protected final String TEXT_1492 = ";";
  protected final String TEXT_1493 = NL + "\t\treturn ";
  protected final String TEXT_1494 = "basicGet";
  protected final String TEXT_1495 = "() != null";
  protected final String TEXT_1496 = ";";
  protected final String TEXT_1497 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1498 = "())";
  protected final String TEXT_1499 = ";";
  protected final String TEXT_1500 = NL + "\t\t\t|| isSet";
  protected final String TEXT_1501 = "()";
  protected final String TEXT_1502 = ";";
  protected final String TEXT_1503 = NL + "\t\t\t|| !";
  protected final String TEXT_1504 = "().isEmpty()";
  protected final String TEXT_1505 = ";";
  protected final String TEXT_1506 = NL + "\t\t\t|| ";
  protected final String TEXT_1507 = "basicGet";
  protected final String TEXT_1508 = "() != null";
  protected final String TEXT_1509 = ";";
  protected final String TEXT_1510 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_1511 = "())";
  protected final String TEXT_1512 = ";";
  protected final String TEXT_1513 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1514 = "();";
  protected final String TEXT_1515 = NL + "\t\treturn false;";
  protected final String TEXT_1516 = NL + "\t}" + NL;
  protected final String TEXT_1517 = NL;
  protected final String TEXT_1518 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1519 = " create";
  protected final String TEXT_1520 = "(";
  protected final String TEXT_1521 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1522 = " new";
  protected final String TEXT_1523 = " = (";
  protected final String TEXT_1524 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1525 = NL + "\t\t";
  protected final String TEXT_1526 = "().add(new";
  protected final String TEXT_1527 = ");";
  protected final String TEXT_1528 = NL + "\t\tset";
  protected final String TEXT_1529 = "(new";
  protected final String TEXT_1530 = ");";
  protected final String TEXT_1531 = NL + "\t\treturn new";
  protected final String TEXT_1532 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1533 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1534 = " create";
  protected final String TEXT_1535 = "() {" + NL + "\t\t";
  protected final String TEXT_1536 = " new";
  protected final String TEXT_1537 = " = ";
  protected final String TEXT_1538 = ".eINSTANCE.create";
  protected final String TEXT_1539 = "();";
  protected final String TEXT_1540 = NL + "\t\t";
  protected final String TEXT_1541 = "().add(new";
  protected final String TEXT_1542 = ");";
  protected final String TEXT_1543 = NL + "\t\tset";
  protected final String TEXT_1544 = "(new";
  protected final String TEXT_1545 = ");";
  protected final String TEXT_1546 = NL + "\t\treturn new";
  protected final String TEXT_1547 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1548 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1549 = " get";
  protected final String TEXT_1550 = "(";
  protected final String TEXT_1551 = " ";
  protected final String TEXT_1552 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1553 = " i = ";
  protected final String TEXT_1554 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1555 = " ";
  protected final String TEXT_1556 = " = (";
  protected final String TEXT_1557 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1558 = ".equals(";
  protected final String TEXT_1559 = ".";
  protected final String TEXT_1560 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1561 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1562 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1563 = "()" + NL + "\t{";
  protected final String TEXT_1564 = NL + "  \t\treturn false;";
  protected final String TEXT_1565 = NL + "\t\treturn !((";
  protected final String TEXT_1566 = ")";
  protected final String TEXT_1567 = "()).featureMap().isEmpty();";
  protected final String TEXT_1568 = NL + "\t\treturn ";
  protected final String TEXT_1569 = " != null && !";
  protected final String TEXT_1570 = ".featureMap().isEmpty();";
  protected final String TEXT_1571 = NL + "\t\treturn ";
  protected final String TEXT_1572 = " != null && !";
  protected final String TEXT_1573 = ".isEmpty();";
  protected final String TEXT_1574 = NL + "\t\t";
  protected final String TEXT_1575 = " ";
  protected final String TEXT_1576 = " = (";
  protected final String TEXT_1577 = ")eVirtualGet(";
  protected final String TEXT_1578 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1579 = " != null && !";
  protected final String TEXT_1580 = ".isEmpty();";
  protected final String TEXT_1581 = NL + "\t\treturn !";
  protected final String TEXT_1582 = "().isEmpty();";
  protected final String TEXT_1583 = NL + "\t\treturn ";
  protected final String TEXT_1584 = " != null;";
  protected final String TEXT_1585 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1586 = ") != null;";
  protected final String TEXT_1587 = NL + "\t\treturn basicGet";
  protected final String TEXT_1588 = "() != null;";
  protected final String TEXT_1589 = NL + "\t\treturn ";
  protected final String TEXT_1590 = " != null;";
  protected final String TEXT_1591 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1592 = ") != null;";
  protected final String TEXT_1593 = NL + "\t\treturn ";
  protected final String TEXT_1594 = "() != null;";
  protected final String TEXT_1595 = NL + "\t\treturn ((";
  protected final String TEXT_1596 = " & ";
  protected final String TEXT_1597 = "_EFLAG) != 0) != ";
  protected final String TEXT_1598 = "_EDEFAULT;";
  protected final String TEXT_1599 = NL + "\t\treturn ";
  protected final String TEXT_1600 = " != ";
  protected final String TEXT_1601 = "_EDEFAULT;";
  protected final String TEXT_1602 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1603 = ") && eVirtualGet(";
  protected final String TEXT_1604 = ") != ";
  protected final String TEXT_1605 = "_EDEFAULT;";
  protected final String TEXT_1606 = NL + "\t\treturn ";
  protected final String TEXT_1607 = "() != ";
  protected final String TEXT_1608 = "_EDEFAULT;";
  protected final String TEXT_1609 = NL + "\t\treturn ";
  protected final String TEXT_1610 = "_EDEFAULT == null ? ";
  protected final String TEXT_1611 = " != null : !";
  protected final String TEXT_1612 = "_EDEFAULT.equals(";
  protected final String TEXT_1613 = ");";
  protected final String TEXT_1614 = NL + "\t\t";
  protected final String TEXT_1615 = " ";
  protected final String TEXT_1616 = " = eVirtualIsSet(";
  protected final String TEXT_1617 = ") ? (";
  protected final String TEXT_1618 = ")eVirtualGet(";
  protected final String TEXT_1619 = ") : ";
  protected final String TEXT_1620 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_1621 = "_EDEFAULT == null ? ";
  protected final String TEXT_1622 = " != null : !";
  protected final String TEXT_1623 = "_EDEFAULT.equals(";
  protected final String TEXT_1624 = ");";
  protected final String TEXT_1625 = NL + "\t\treturn ";
  protected final String TEXT_1626 = "_EDEFAULT == null ? ";
  protected final String TEXT_1627 = "() != null : !";
  protected final String TEXT_1628 = "_EDEFAULT.equals(";
  protected final String TEXT_1629 = "());";
  protected final String TEXT_1630 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1631 = ".eINSTANCE.get";
  protected final String TEXT_1632 = "());";
  protected final String TEXT_1633 = NL + "\t\t";
  protected final String TEXT_1634 = " ";
  protected final String TEXT_1635 = " = (";
  protected final String TEXT_1636 = ")eVirtualGet(";
  protected final String TEXT_1637 = ");";
  protected final String TEXT_1638 = NL + "\t\treturn ";
  protected final String TEXT_1639 = " != null && ((";
  protected final String TEXT_1640 = ".Unsettable)";
  protected final String TEXT_1641 = ").isSet();";
  protected final String TEXT_1642 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1643 = ");";
  protected final String TEXT_1644 = NL + "\t\treturn (";
  protected final String TEXT_1645 = " & ";
  protected final String TEXT_1646 = "_ESETFLAG) != 0;";
  protected final String TEXT_1647 = NL + "\t\treturn ";
  protected final String TEXT_1648 = "ESet;";
  protected final String TEXT_1649 = NL + "\t\treturn !((";
  protected final String TEXT_1650 = ".Internal)((";
  protected final String TEXT_1651 = ")get";
  protected final String TEXT_1652 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1653 = "());";
  protected final String TEXT_1654 = NL + "\t\treturn !((";
  protected final String TEXT_1655 = ".Internal)get";
  protected final String TEXT_1656 = "()).isEmpty(";
  protected final String TEXT_1657 = "());";
  protected final String TEXT_1658 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1659 = "' ";
  protected final String TEXT_1660 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1661 = NL + "\t}" + NL;
  protected final String TEXT_1662 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1663 = " ";
  protected final String TEXT_1664 = "()" + NL + "\t{";
  protected final String TEXT_1665 = NL + "\t\treturn ";
  protected final String TEXT_1666 = "();";
  protected final String TEXT_1667 = NL + "\t\treturn new ";
  protected final String TEXT_1668 = ".UnmodifiableEList(this, ";
  protected final String TEXT_1669 = "null";
  protected final String TEXT_1670 = "()";
  protected final String TEXT_1671 = ", 0, ";
  protected final String TEXT_1672 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_1673 = NL + "\t\treturn null;";
  protected final String TEXT_1674 = NL + "\t\treturn ";
  protected final String TEXT_1675 = "();";
  protected final String TEXT_1676 = NL + "\t}" + NL;
  protected final String TEXT_1677 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1678 = " basicGet";
  protected final String TEXT_1679 = "()" + NL + "\t{";
  protected final String TEXT_1680 = NL + "\t\treturn null;";
  protected final String TEXT_1681 = NL + "\t\treturn ";
  protected final String TEXT_1682 = "basicGet";
  protected final String TEXT_1683 = "();";
  protected final String TEXT_1684 = NL + "\t}" + NL;
  protected final String TEXT_1685 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1686 = " basicSet";
  protected final String TEXT_1687 = "(";
  protected final String TEXT_1688 = " new";
  protected final String TEXT_1689 = ", ";
  protected final String TEXT_1690 = " msgs)" + NL + "\t{";
  protected final String TEXT_1691 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1692 = NL + "\t\tif (new";
  protected final String TEXT_1693 = " != null && !(new";
  protected final String TEXT_1694 = " instanceof ";
  protected final String TEXT_1695 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1696 = "));" + NL + "\t\t}";
  protected final String TEXT_1697 = NL + "\t\treturn basicSet";
  protected final String TEXT_1698 = "(";
  protected final String TEXT_1699 = "(";
  protected final String TEXT_1700 = ") ";
  protected final String TEXT_1701 = "new";
  protected final String TEXT_1702 = ", msgs);";
  protected final String TEXT_1703 = NL + "\t\tset";
  protected final String TEXT_1704 = "(";
  protected final String TEXT_1705 = "(";
  protected final String TEXT_1706 = ") ";
  protected final String TEXT_1707 = "new";
  protected final String TEXT_1708 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1709 = NL + "\t}" + NL;
  protected final String TEXT_1710 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1711 = "(";
  protected final String TEXT_1712 = " new";
  protected final String TEXT_1713 = ")" + NL + "\t{";
  protected final String TEXT_1714 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1715 = NL + "\t\tif (new";
  protected final String TEXT_1716 = " != null && !(new";
  protected final String TEXT_1717 = " instanceof ";
  protected final String TEXT_1718 = ")) {" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1719 = "));" + NL + "\t\t}";
  protected final String TEXT_1720 = NL + "\t\tset";
  protected final String TEXT_1721 = "(";
  protected final String TEXT_1722 = "(";
  protected final String TEXT_1723 = ") ";
  protected final String TEXT_1724 = "new";
  protected final String TEXT_1725 = ");";
  protected final String TEXT_1726 = NL + "\t}" + NL;
  protected final String TEXT_1727 = NL;
  protected final String TEXT_1728 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1729 = " create";
  protected final String TEXT_1730 = "(";
  protected final String TEXT_1731 = " eClass) {" + NL + "\t\t";
  protected final String TEXT_1732 = " new";
  protected final String TEXT_1733 = " = (";
  protected final String TEXT_1734 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1735 = NL + "\t\t";
  protected final String TEXT_1736 = "().add(new";
  protected final String TEXT_1737 = ");";
  protected final String TEXT_1738 = NL + "\t\tset";
  protected final String TEXT_1739 = "(new";
  protected final String TEXT_1740 = ");";
  protected final String TEXT_1741 = NL + "\t\treturn new";
  protected final String TEXT_1742 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1743 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1744 = " create";
  protected final String TEXT_1745 = "() {" + NL + "\t\t";
  protected final String TEXT_1746 = " new";
  protected final String TEXT_1747 = " = ";
  protected final String TEXT_1748 = ".eINSTANCE.create";
  protected final String TEXT_1749 = "();";
  protected final String TEXT_1750 = NL + "\t\t";
  protected final String TEXT_1751 = "().add(new";
  protected final String TEXT_1752 = ");";
  protected final String TEXT_1753 = NL + "\t\tset";
  protected final String TEXT_1754 = "(new";
  protected final String TEXT_1755 = ");";
  protected final String TEXT_1756 = NL + "\t\treturn new";
  protected final String TEXT_1757 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1758 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1759 = " get";
  protected final String TEXT_1760 = "(";
  protected final String TEXT_1761 = " ";
  protected final String TEXT_1762 = ") {" + NL + "\t\tfor (";
  protected final String TEXT_1763 = " i = ";
  protected final String TEXT_1764 = "().iterator(); i.hasNext(); ) {" + NL + "\t\t\t";
  protected final String TEXT_1765 = " ";
  protected final String TEXT_1766 = " = (";
  protected final String TEXT_1767 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1768 = ".equals(";
  protected final String TEXT_1769 = ".";
  protected final String TEXT_1770 = "())) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1771 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1772 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1773 = "()" + NL + "\t{";
  protected final String TEXT_1774 = NL + "  \t\treturn false;";
  protected final String TEXT_1775 = NL + "\t\treturn !((";
  protected final String TEXT_1776 = ")";
  protected final String TEXT_1777 = "()).featureMap().isEmpty();";
  protected final String TEXT_1778 = NL + "\t\treturn ";
  protected final String TEXT_1779 = " != null && !";
  protected final String TEXT_1780 = ".featureMap().isEmpty();";
  protected final String TEXT_1781 = NL + "\t\treturn ";
  protected final String TEXT_1782 = " != null && !";
  protected final String TEXT_1783 = ".isEmpty();";
  protected final String TEXT_1784 = NL + "\t\t";
  protected final String TEXT_1785 = " ";
  protected final String TEXT_1786 = " = (";
  protected final String TEXT_1787 = ")eVirtualGet(";
  protected final String TEXT_1788 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1789 = " != null && !";
  protected final String TEXT_1790 = ".isEmpty();";
  protected final String TEXT_1791 = NL + "\t\treturn !";
  protected final String TEXT_1792 = "().isEmpty();";
  protected final String TEXT_1793 = NL + "\t\treturn ";
  protected final String TEXT_1794 = " != null;";
  protected final String TEXT_1795 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1796 = ") != null;";
  protected final String TEXT_1797 = NL + "\t\treturn basicGet";
  protected final String TEXT_1798 = "() != null;";
  protected final String TEXT_1799 = NL + "\t\treturn ";
  protected final String TEXT_1800 = " != null;";
  protected final String TEXT_1801 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1802 = ") != null;";
  protected final String TEXT_1803 = NL + "\t\treturn ";
  protected final String TEXT_1804 = "() != null;";
  protected final String TEXT_1805 = NL + "\t\treturn ((";
  protected final String TEXT_1806 = " & ";
  protected final String TEXT_1807 = "_EFLAG) != 0) != ";
  protected final String TEXT_1808 = "_EDEFAULT;";
  protected final String TEXT_1809 = NL + "\t\treturn ";
  protected final String TEXT_1810 = " != ";
  protected final String TEXT_1811 = "_EDEFAULT;";
  protected final String TEXT_1812 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1813 = ") && eVirtualGet(";
  protected final String TEXT_1814 = ") != ";
  protected final String TEXT_1815 = "_EDEFAULT;";
  protected final String TEXT_1816 = NL + "\t\treturn ";
  protected final String TEXT_1817 = "() != ";
  protected final String TEXT_1818 = "_EDEFAULT;";
  protected final String TEXT_1819 = NL + "\t\treturn ";
  protected final String TEXT_1820 = "_EDEFAULT == null ? ";
  protected final String TEXT_1821 = " != null : !";
  protected final String TEXT_1822 = "_EDEFAULT.equals(";
  protected final String TEXT_1823 = ");";
  protected final String TEXT_1824 = NL + "\t\t";
  protected final String TEXT_1825 = " ";
  protected final String TEXT_1826 = " = eVirtualIsSet(";
  protected final String TEXT_1827 = ") ? (";
  protected final String TEXT_1828 = ")eVirtualGet(";
  protected final String TEXT_1829 = ") : ";
  protected final String TEXT_1830 = "_EDEFAULT;" + NL + "\t\treturn ";
  protected final String TEXT_1831 = "_EDEFAULT == null ? ";
  protected final String TEXT_1832 = " != null : !";
  protected final String TEXT_1833 = "_EDEFAULT.equals(";
  protected final String TEXT_1834 = ");";
  protected final String TEXT_1835 = NL + "\t\treturn ";
  protected final String TEXT_1836 = "_EDEFAULT == null ? ";
  protected final String TEXT_1837 = "() != null : !";
  protected final String TEXT_1838 = "_EDEFAULT.equals(";
  protected final String TEXT_1839 = "());";
  protected final String TEXT_1840 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1841 = ".eINSTANCE.get";
  protected final String TEXT_1842 = "());";
  protected final String TEXT_1843 = NL + "\t\t";
  protected final String TEXT_1844 = " ";
  protected final String TEXT_1845 = " = (";
  protected final String TEXT_1846 = ")eVirtualGet(";
  protected final String TEXT_1847 = ");";
  protected final String TEXT_1848 = NL + "\t\treturn ";
  protected final String TEXT_1849 = " != null && ((";
  protected final String TEXT_1850 = ".Unsettable)";
  protected final String TEXT_1851 = ").isSet();";
  protected final String TEXT_1852 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1853 = ");";
  protected final String TEXT_1854 = NL + "\t\treturn (";
  protected final String TEXT_1855 = " & ";
  protected final String TEXT_1856 = "_ESETFLAG) != 0;";
  protected final String TEXT_1857 = NL + "\t\treturn ";
  protected final String TEXT_1858 = "ESet;";
  protected final String TEXT_1859 = NL + "\t\treturn !((";
  protected final String TEXT_1860 = ".Internal)((";
  protected final String TEXT_1861 = ")get";
  protected final String TEXT_1862 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1863 = "());";
  protected final String TEXT_1864 = NL + "\t\treturn !((";
  protected final String TEXT_1865 = ".Internal)get";
  protected final String TEXT_1866 = "()).isEmpty(";
  protected final String TEXT_1867 = "());";
  protected final String TEXT_1868 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1869 = "' ";
  protected final String TEXT_1870 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1871 = NL + "\t}" + NL;
  protected final String TEXT_1872 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1873 = " ";
  protected final String TEXT_1874 = "(";
  protected final String TEXT_1875 = ")";
  protected final String TEXT_1876 = NL + "\t{";
  protected final String TEXT_1877 = NL + "\t\t";
  protected final String TEXT_1878 = "(";
  protected final String TEXT_1879 = ");";
  protected final String TEXT_1880 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1881 = NL + "\t\treturn ";
  protected final String TEXT_1882 = "(";
  protected final String TEXT_1883 = ");";
  protected final String TEXT_1884 = NL + "\t}" + NL;
  protected final String TEXT_1885 = NL + "} //";
  protected final String TEXT_1886 = NL;

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
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_133);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_138);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_142);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_149);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_152);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_156);
    }
    stringBuffer.append(TEXT_157);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    }
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_169);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isReferenceType() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_173);
    } else {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_175);
    }
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_185);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap$Internal"));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_191);
    } else {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_196);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_200);
    } else {
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_202);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_204);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_205);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_209);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_211);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_213);
    }
    stringBuffer.append(TEXT_214);
    } else {
    stringBuffer.append(TEXT_215);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_216);
    }
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_218);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_220);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_223);
    }
    }
    } else {
    stringBuffer.append(TEXT_224);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_228);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_229);
    }
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_231);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_232);
    }
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_234);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_236);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_238);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_240);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_244);
    }
    stringBuffer.append(TEXT_245);
    }
    stringBuffer.append(TEXT_246);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_248);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_250);
    } else {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_253);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_254);
    //Class/getGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_257);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_260);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_265);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_270);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_274);
    }
    } else {
    stringBuffer.append(TEXT_275);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_276);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_278);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_280);
    } else {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_283);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_284);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_290);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_291);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_295);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_297);
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_301);
    } else {
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_307);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_309);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_315);
    } else {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_319);
    }
    }
    stringBuffer.append(TEXT_320);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_325);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_329);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_333);
    } else {
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_338);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_343);
    }
    stringBuffer.append(TEXT_344);
    stringBuffer.append(TEXT_345);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_350);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_356);
    }
    }
    stringBuffer.append(TEXT_357);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_363);
    } else {
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_365);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_368);
    }
    } else {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_371);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_372);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(TEXT_377);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_388);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_391);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_394);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_398);
    }
    stringBuffer.append(TEXT_399);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_422);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_427);
    }
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_432);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_440);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_449);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_450);
    }
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_454);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_455);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_458);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_464);
    } else {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_468);
    }
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_475);
    } else {
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_481);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_491);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_495);
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_501);
    } else {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_506);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_511);
    } else {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_515);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_519);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_521);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_527);
    } else {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_531);
    }
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_535);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_536);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_537);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_538);
    }
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_541);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_543);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_544);
    } else {
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_546);
    }
    stringBuffer.append(TEXT_547);
    } else {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_551);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_553);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_554);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_555);
    }
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_558);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_560);
    }
    }
    stringBuffer.append(TEXT_561);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_566);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_570);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_572);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_574);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_577);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_579);
    }
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_581);
    }
    stringBuffer.append(TEXT_582);
    } else {
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_584);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_586);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_588);
    }
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_590);
    }
    stringBuffer.append(TEXT_591);
    }
    } else {
    stringBuffer.append(TEXT_592);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_593);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_595);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_597);
    } else {
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_600);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_601);
    //Class/setGenFeature.override.javajetinc
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_605);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_608);
    } else {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_613);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_615);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_621);
    } else {
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_625);
    }
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_630);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    } else {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_634);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_635);
    } else {
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_637);
    }
    stringBuffer.append(TEXT_638);
    } else {
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_641);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_642);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset()) {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_644);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_647);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_650);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_655);
    }
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_658);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_662);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_666);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_667);
    }
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_669);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_670);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_672);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getUpperName());
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
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_682);
    }
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_687);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_692);
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_695);
    } else {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_699);
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_701);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_705);
    } else {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_708);
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_710);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_713);
    } else {
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_715);
    }
    }
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_719);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_721);
    } else {
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_723);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_724);
    } else {
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    }
    stringBuffer.append(TEXT_727);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_733);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_736);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_739);
    } else {
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_741);
    }
    }
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_745);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_748);
    } else {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_751);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_752);
    } else {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_754);
    }
    stringBuffer.append(TEXT_755);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_757);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_760);
    } else {
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_762);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_764);
    }
    } else {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_767);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_768);
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet()) {
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_770);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_773);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_778);
    }
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_782);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_784);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_787);
    } else {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_789);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_791);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_794);
    } else {
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_798);
    }
    } else {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_801);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_802);
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_803);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_810);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_813);
    } else {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_816);
    }
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_818);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_819);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_825);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    } else {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_831);
    }
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_833);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_834);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_847);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_849);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_850);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_853);
    } else {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_856);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_859);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_866);
    } else {
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_868);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_870);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_872);
    } else {
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_874);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_876);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_878);
    } else {
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_880);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_884);
    } else {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_887);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_891);
    } else {
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_894);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_899);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_910);
    } else {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_915);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_918);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_923);
    }
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_927);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_929);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_932);
    } else {
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_934);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_939);
    } else {
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_943);
    }
    } else {
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_946);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_947);
    }
    //Class/implementedGenFeature.override.javajetinc
    }//for
    for (Iterator i=genClass.getImplementedGenOperations().iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_948);
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_953);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_955);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_958);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_959);
    } else {
    stringBuffer.append(TEXT_960);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_961);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_964);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_965);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_972);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_973);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_975);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_977);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_981);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_982);
    }
    stringBuffer.append(TEXT_983);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_984);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_986);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_987);
    }
    stringBuffer.append(TEXT_988);
    stringBuffer.append(opPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_989);
    stringBuffer.append(opClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_991);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_993);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_995);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_997);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_998);
    }
    stringBuffer.append(TEXT_999);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1001);
    }
    stringBuffer.append(TEXT_1002);
    }
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1005);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1007);
    }
    } else {
    stringBuffer.append(TEXT_1008);
    }
    }
    stringBuffer.append(TEXT_1009);
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1013);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1015);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1019);
    } else {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1022);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1024);
    } else {
    if (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1029);
    }
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1031);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1035);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1040);
    }
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1043);
    }
    }
    stringBuffer.append(TEXT_1044);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1048);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1050);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1054);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1058);
    } else {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1061);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1063);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1065);
    } else {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1067);
    }
    }
    stringBuffer.append(TEXT_1068);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1071);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1075);
    }
    stringBuffer.append(TEXT_1076);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1078);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1080);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1082);
    } else {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1085);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1088);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1091);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1094);
    } else {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1096);
    }
    }
    stringBuffer.append(TEXT_1097);
    }
    if (!genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1099);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1101);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1104);
    } else {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1106);
    }
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1110);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1114);
    } else {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1117);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1121);
    } else {
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1124);
    }
    stringBuffer.append(TEXT_1125);
    }
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1127);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1129);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1132);
    } else {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1134);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1136);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1139);
    } else {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1142);
    }
    stringBuffer.append(TEXT_1143);
    }
    stringBuffer.append(TEXT_1144);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1147);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1149);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1151);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1154);
    } else {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1157);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1160);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1167);
    } else {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1169);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1171);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1173);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1175);
    } else {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1177);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1179);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1181);
    } else {
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1183);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1187);
    } else {
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1190);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1194);
    } else {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1197);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1202);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1213);
    } else {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1218);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1219);
    //Class/eIsSet.override.javajetinc
    }
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1220);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1222);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1225);
    }
    stringBuffer.append(TEXT_1226);
    }
    stringBuffer.append(TEXT_1227);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1229);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1232);
    }
    stringBuffer.append(TEXT_1233);
    }
    stringBuffer.append(TEXT_1234);
    }
    if (genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1237);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1238);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1241);
    }
    stringBuffer.append(TEXT_1242);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1245);
    }
    stringBuffer.append(TEXT_1246);
    }
    }
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1247);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1255);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1258);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1259);
    }
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1263);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1266);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1267);
    }
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1272);
    if (genFeature.isListType() || genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1273);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1274);
    }
    stringBuffer.append(TEXT_1275);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1278);
    } else {
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1280);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1281);
    }
    if (genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1282);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1284);
    } else {
    stringBuffer.append(TEXT_1285);
    }
    stringBuffer.append(TEXT_1286);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1288);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1291);
    } else {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1293);
    }
    stringBuffer.append(TEXT_1294);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1296);
    } else {
    stringBuffer.append(TEXT_1297);
    }
    stringBuffer.append(TEXT_1298);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1300);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1303);
    } else {
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1305);
    }
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1309);
    }
    stringBuffer.append(TEXT_1310);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1319);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1322);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1324);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1326);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1328);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1330);
    } else {
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1333);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1337);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1338);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1340);
    } else {
    stringBuffer.append(TEXT_1341);
    }
    stringBuffer.append(TEXT_1342);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1352);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1357);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1360);
    } else {
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1363);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1369);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1375);
    } else {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1384);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1388);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1392);
    } else {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1399);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1402);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1404);
    } else {
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1407);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1412);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1414);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1417);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1419);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getSafeName());
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
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_1437);
    } else {
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1449);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1450);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1451);
    }
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1453);
    }
    stringBuffer.append(TEXT_1454);
    }
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1459);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1460);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1461);
    }
    stringBuffer.append(TEXT_1462);
    }
    }
    } else {
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1465);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1468);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1471);
    } else {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1477);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1478);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1480);
    } else {
    stringBuffer.append(TEXT_1481);
    }
    stringBuffer.append(TEXT_1482);
    }
    }
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1484);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1486);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1488);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1489);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1491);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1492);
    }
    } else {
    stringBuffer.append(TEXT_1493);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1495);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1496);
    }
    }
    } else {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1498);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1499);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1501);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1502);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1504);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1505);
    }
    } else {
    stringBuffer.append(TEXT_1506);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1508);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1509);
    }
    }
    } else {
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(subsetGenFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1511);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1512);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1514);
    } else {
    stringBuffer.append(TEXT_1515);
    }
    }
    stringBuffer.append(TEXT_1516);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1517);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1524);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1527);
    } else {
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1530);
    }
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1532);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1539);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1542);
    } else {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1545);
    }
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1547);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1561);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1563);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1564);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1567);
    } else {
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1570);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1573);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1580);
    } else {
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1582);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1584);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1586);
    } else {
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1588);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1590);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1592);
    } else {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1594);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1598);
    } else {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1601);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1605);
    } else {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1608);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1613);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1624);
    } else {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1629);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1632);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1637);
    }
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1641);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1643);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1646);
    } else {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1648);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1653);
    } else {
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1657);
    }
    } else {
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1660);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1661);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1664);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1666);
    } else {
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_1668);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1669);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1670);
    }
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_1672);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1673);
    } else {
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1675);
    }
    }
    stringBuffer.append(TEXT_1676);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1679);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1680);
    } else {
    stringBuffer.append(TEXT_1681);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1683);
    }
    stringBuffer.append(TEXT_1684);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1690);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1691);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1696);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1698);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1700);
    }
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1702);
    } else {
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1704);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1706);
    }
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1708);
    }
    }
    stringBuffer.append(TEXT_1709);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1713);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1714);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1719);
    }
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1721);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1723);
    }
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1725);
    }
    stringBuffer.append(TEXT_1726);
    }
    stringBuffer.append(TEXT_1727);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1734);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1737);
    } else {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1740);
    }
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1742);
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1749);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1752);
    } else {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1755);
    }
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1757);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1771);
    }
    }
    if ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1773);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1774);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1777);
    } else {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1780);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1783);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1790);
    } else {
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1792);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1794);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1796);
    } else {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1798);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1800);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1802);
    } else {
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1804);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1808);
    } else {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1811);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1815);
    } else {
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1818);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1823);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1834);
    } else {
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1839);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_1842);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1847);
    }
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1851);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1853);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1856);
    } else {
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1858);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1863);
    } else {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_1867);
    }
    } else {
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1870);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1871);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1876);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1879);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_1880);
    } else {
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1883);
    }
    }
    stringBuffer.append(TEXT_1884);
    }
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genClass.getClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1886);
    return stringBuffer.toString();
  }
}
