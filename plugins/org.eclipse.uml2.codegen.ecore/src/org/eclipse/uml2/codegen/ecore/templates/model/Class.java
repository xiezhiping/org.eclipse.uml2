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
  protected final String TEXT_5 = NL + " */";
  protected final String TEXT_6 = NL + "package ";
  protected final String TEXT_7 = ";";
  protected final String TEXT_8 = NL + "package ";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_13 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_14 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_15 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_16 = NL + " *";
  protected final String TEXT_17 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_18 = NL + " *   <li>{@link ";
  protected final String TEXT_19 = "#";
  protected final String TEXT_20 = " <em>";
  protected final String TEXT_21 = "</em>}</li>";
  protected final String TEXT_22 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_23 = NL + " *";
  protected final String TEXT_24 = NL + " * @see ";
  protected final String TEXT_25 = "#get";
  protected final String TEXT_26 = "()";
  protected final String TEXT_27 = NL + " * @model ";
  protected final String TEXT_28 = NL + " *        ";
  protected final String TEXT_29 = NL + " * @model";
  protected final String TEXT_30 = NL + " * @extends ";
  protected final String TEXT_31 = NL + " * @generated" + NL + " */";
  protected final String TEXT_32 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_33 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_34 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_35 = NL + " *   <li>{@link ";
  protected final String TEXT_36 = "#";
  protected final String TEXT_37 = " <em>";
  protected final String TEXT_38 = "</em>}</li>";
  protected final String TEXT_39 = NL + " * </ul>";
  protected final String TEXT_40 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_41 = NL + "public";
  protected final String TEXT_42 = " abstract";
  protected final String TEXT_43 = " class ";
  protected final String TEXT_44 = NL + "public interface ";
  protected final String TEXT_45 = NL + "{";
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_47 = " copyright = \"";
  protected final String TEXT_48 = "\";";
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_51 = " mofDriverNumber = \"";
  protected final String TEXT_52 = "\";";
  protected final String TEXT_53 = NL;
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_56 = " = null;" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_58 = " = 0;" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_60 = " = 0;" + NL;
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_62 = "() <em>";
  protected final String TEXT_63 = "</em>}' ";
  protected final String TEXT_64 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_65 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_66 = " ";
  protected final String TEXT_67 = " = null;" + NL;
  protected final String TEXT_68 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_69 = "() <em>";
  protected final String TEXT_70 = "</em>}' ";
  protected final String TEXT_71 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_72 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_73 = " ";
  protected final String TEXT_74 = "_EDEFAULT = ";
  protected final String TEXT_75 = ";";
  protected final String TEXT_76 = NL;
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_78 = " = 0;" + NL;
  protected final String TEXT_79 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_80 = "() <em>";
  protected final String TEXT_81 = "</em>}' ";
  protected final String TEXT_82 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_83 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_84 = "_EFLAG = 1 ";
  protected final String TEXT_85 = ";" + NL;
  protected final String TEXT_86 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_87 = "() <em>";
  protected final String TEXT_88 = "</em>}' ";
  protected final String TEXT_89 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_90 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_91 = " ";
  protected final String TEXT_92 = " = ";
  protected final String TEXT_93 = "_EDEFAULT;" + NL;
  protected final String TEXT_94 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_95 = " = 0;" + NL;
  protected final String TEXT_96 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_97 = " ";
  protected final String TEXT_98 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_99 = "_ESETFLAG = 1 ";
  protected final String TEXT_100 = ";" + NL;
  protected final String TEXT_101 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_102 = " ";
  protected final String TEXT_103 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_104 = "ESet = false;" + NL;
  protected final String TEXT_105 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_106 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_107 = NL + "\t\t";
  protected final String TEXT_108 = " |= ";
  protected final String TEXT_109 = "_EFLAG;";
  protected final String TEXT_110 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_111 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_112 = ";" + NL + "\t}" + NL;
  protected final String TEXT_113 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_114 = "</b></em>' ";
  protected final String TEXT_115 = ".";
  protected final String TEXT_116 = NL + "\t * The key is of type ";
  protected final String TEXT_117 = "list of {@link ";
  protected final String TEXT_118 = "}";
  protected final String TEXT_119 = "{@link ";
  protected final String TEXT_120 = "}";
  protected final String TEXT_121 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_122 = "list of {@link ";
  protected final String TEXT_123 = "}";
  protected final String TEXT_124 = "{@link ";
  protected final String TEXT_125 = "}";
  protected final String TEXT_126 = ",";
  protected final String TEXT_127 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_128 = "}.";
  protected final String TEXT_129 = NL + "\t * The default value is <code>";
  protected final String TEXT_130 = "</code>.";
  protected final String TEXT_131 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_132 = "}.";
  protected final String TEXT_133 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_134 = "#";
  protected final String TEXT_135 = " <em>";
  protected final String TEXT_136 = "</em>}'.";
  protected final String TEXT_137 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_138 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_139 = "</em>' ";
  protected final String TEXT_140 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_141 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_142 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_143 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_144 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_145 = "</em>' ";
  protected final String TEXT_146 = ".";
  protected final String TEXT_147 = NL + "\t * @see ";
  protected final String TEXT_148 = NL + "\t * @see #isSet";
  protected final String TEXT_149 = "()";
  protected final String TEXT_150 = NL + "\t * @see #unset";
  protected final String TEXT_151 = "()";
  protected final String TEXT_152 = NL + "\t * @see #set";
  protected final String TEXT_153 = "(";
  protected final String TEXT_154 = ")";
  protected final String TEXT_155 = NL + "\t * @see ";
  protected final String TEXT_156 = "#get";
  protected final String TEXT_157 = "()";
  protected final String TEXT_158 = NL + "\t * @see ";
  protected final String TEXT_159 = "#";
  protected final String TEXT_160 = NL + "\t * @model ";
  protected final String TEXT_161 = NL + "\t *        ";
  protected final String TEXT_162 = NL + "\t * @model";
  protected final String TEXT_163 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_164 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_165 = NL + "\t";
  protected final String TEXT_166 = " ";
  protected final String TEXT_167 = "();" + NL;
  protected final String TEXT_168 = NL + "\tpublic ";
  protected final String TEXT_169 = " ";
  protected final String TEXT_170 = "()" + NL + "\t{";
  protected final String TEXT_171 = NL + "\t\treturn ";
  protected final String TEXT_172 = "(";
  protected final String TEXT_173 = "(";
  protected final String TEXT_174 = ")eGet(";
  protected final String TEXT_175 = ", true)";
  protected final String TEXT_176 = ").";
  protected final String TEXT_177 = "()";
  protected final String TEXT_178 = ";";
  protected final String TEXT_179 = NL + "\t\t";
  protected final String TEXT_180 = " ";
  protected final String TEXT_181 = " = (";
  protected final String TEXT_182 = ")eVirtualGet(";
  protected final String TEXT_183 = ");";
  protected final String TEXT_184 = NL + "\t\tif (";
  protected final String TEXT_185 = " == null)" + NL + "\t\t{";
  protected final String TEXT_186 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_187 = ", ";
  protected final String TEXT_188 = " = new ";
  protected final String TEXT_189 = ");";
  protected final String TEXT_190 = NL + "\t\t\t";
  protected final String TEXT_191 = " = new ";
  protected final String TEXT_192 = ";";
  protected final String TEXT_193 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_194 = ";";
  protected final String TEXT_195 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_196 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_197 = ")eContainer();";
  protected final String TEXT_198 = NL + "\t\t";
  protected final String TEXT_199 = " ";
  protected final String TEXT_200 = " = (";
  protected final String TEXT_201 = ")eVirtualGet(";
  protected final String TEXT_202 = ", ";
  protected final String TEXT_203 = "_EDEFAULT";
  protected final String TEXT_204 = ");";
  protected final String TEXT_205 = NL + "\t\tif (";
  protected final String TEXT_206 = " != null && ";
  protected final String TEXT_207 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_208 = " old";
  protected final String TEXT_209 = " = (";
  protected final String TEXT_210 = ")";
  protected final String TEXT_211 = ";" + NL + "\t\t\t";
  protected final String TEXT_212 = " = ";
  protected final String TEXT_213 = "eResolveProxy(old";
  protected final String TEXT_214 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_215 = " != old";
  protected final String TEXT_216 = ")" + NL + "\t\t\t{";
  protected final String TEXT_217 = NL + "\t\t\t\t";
  protected final String TEXT_218 = " new";
  protected final String TEXT_219 = " = (";
  protected final String TEXT_220 = ")";
  protected final String TEXT_221 = ";";
  protected final String TEXT_222 = NL + "\t\t\t\t";
  protected final String TEXT_223 = " msgs = old";
  protected final String TEXT_224 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_225 = ", null, null);";
  protected final String TEXT_226 = NL + "\t\t\t\t";
  protected final String TEXT_227 = " msgs =  old";
  protected final String TEXT_228 = ".eInverseRemove(this, ";
  protected final String TEXT_229 = ", ";
  protected final String TEXT_230 = ".class, null);";
  protected final String TEXT_231 = NL + "\t\t\t\tif (new";
  protected final String TEXT_232 = ".eInternalContainer() != null)" + NL + "\t\t\t\t{";
  protected final String TEXT_233 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_234 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_235 = ", null, msgs);";
  protected final String TEXT_236 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_237 = ".eInverseAdd(this, ";
  protected final String TEXT_238 = ", ";
  protected final String TEXT_239 = ".class, msgs);";
  protected final String TEXT_240 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_241 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_242 = ", ";
  protected final String TEXT_243 = ");";
  protected final String TEXT_244 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_245 = "(this, ";
  protected final String TEXT_246 = ".RESOLVE, ";
  protected final String TEXT_247 = ", old";
  protected final String TEXT_248 = ", ";
  protected final String TEXT_249 = "));" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_250 = NL + "\t\treturn (";
  protected final String TEXT_251 = ")eVirtualGet(";
  protected final String TEXT_252 = ", ";
  protected final String TEXT_253 = "_EDEFAULT";
  protected final String TEXT_254 = ");";
  protected final String TEXT_255 = NL + "\t\treturn (";
  protected final String TEXT_256 = " & ";
  protected final String TEXT_257 = "_EFLAG) != 0;";
  protected final String TEXT_258 = NL + "\t\treturn ";
  protected final String TEXT_259 = ";";
  protected final String TEXT_260 = NL + "\t\t";
  protected final String TEXT_261 = " ";
  protected final String TEXT_262 = " = basicGet";
  protected final String TEXT_263 = "();" + NL + "\t\treturn ";
  protected final String TEXT_264 = " != null && ";
  protected final String TEXT_265 = ".eIsProxy() ? ";
  protected final String TEXT_266 = "eResolveProxy((";
  protected final String TEXT_267 = ")";
  protected final String TEXT_268 = ") : ";
  protected final String TEXT_269 = ";";
  protected final String TEXT_270 = NL + "\t\treturn new ";
  protected final String TEXT_271 = "((";
  protected final String TEXT_272 = ".Internal)((";
  protected final String TEXT_273 = ".Internal.Wrapper)get";
  protected final String TEXT_274 = "()).featureMap().list(";
  protected final String TEXT_275 = "));";
  protected final String TEXT_276 = NL + "\t\treturn (";
  protected final String TEXT_277 = ")((";
  protected final String TEXT_278 = ")get";
  protected final String TEXT_279 = "()).list(";
  protected final String TEXT_280 = ");";
  protected final String TEXT_281 = NL + "\t\treturn ((";
  protected final String TEXT_282 = ".Internal.Wrapper)get";
  protected final String TEXT_283 = "()).featureMap().list(";
  protected final String TEXT_284 = ");";
  protected final String TEXT_285 = NL + "\t\treturn ((";
  protected final String TEXT_286 = ")get";
  protected final String TEXT_287 = "()).list(";
  protected final String TEXT_288 = ");";
  protected final String TEXT_289 = NL + "\t\treturn ";
  protected final String TEXT_290 = "(";
  protected final String TEXT_291 = "(";
  protected final String TEXT_292 = ")((";
  protected final String TEXT_293 = ".Internal.Wrapper)get";
  protected final String TEXT_294 = "()).featureMap().get(";
  protected final String TEXT_295 = ", true)";
  protected final String TEXT_296 = ").";
  protected final String TEXT_297 = "()";
  protected final String TEXT_298 = ";";
  protected final String TEXT_299 = NL + "\t\treturn ";
  protected final String TEXT_300 = "(";
  protected final String TEXT_301 = "(";
  protected final String TEXT_302 = ")get";
  protected final String TEXT_303 = "().get(";
  protected final String TEXT_304 = ", true)";
  protected final String TEXT_305 = ").";
  protected final String TEXT_306 = "()";
  protected final String TEXT_307 = ";";
  protected final String TEXT_308 = NL;
  protected final String TEXT_309 = NL + "\t\t";
  protected final String TEXT_310 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_311 = " result = (";
  protected final String TEXT_312 = ") cache.get(";
  protected final String TEXT_313 = "eResource(), ";
  protected final String TEXT_314 = "this, ";
  protected final String TEXT_315 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_316 = "eResource(), ";
  protected final String TEXT_317 = "this, ";
  protected final String TEXT_318 = ", result = ";
  protected final String TEXT_319 = "new ";
  protected final String TEXT_320 = "(";
  protected final String TEXT_321 = ".";
  protected final String TEXT_322 = "(this";
  protected final String TEXT_323 = ", ";
  protected final String TEXT_324 = ")";
  protected final String TEXT_325 = ")";
  protected final String TEXT_326 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_327 = ".";
  protected final String TEXT_328 = "()";
  protected final String TEXT_329 = ";" + NL + "\t\t}";
  protected final String TEXT_330 = NL + "\t\treturn ";
  protected final String TEXT_331 = ".";
  protected final String TEXT_332 = "(this";
  protected final String TEXT_333 = ", ";
  protected final String TEXT_334 = ");";
  protected final String TEXT_335 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_336 = "' ";
  protected final String TEXT_337 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_338 = NL + "\t}" + NL;
  protected final String TEXT_339 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_340 = " basicGet";
  protected final String TEXT_341 = "()" + NL + "\t{";
  protected final String TEXT_342 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_343 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_344 = ")eInternalContainer();";
  protected final String TEXT_345 = NL + "\t\treturn (";
  protected final String TEXT_346 = ")eVirtualGet(";
  protected final String TEXT_347 = ");";
  protected final String TEXT_348 = NL + "\t\treturn ";
  protected final String TEXT_349 = ";";
  protected final String TEXT_350 = NL + "\t\treturn (";
  protected final String TEXT_351 = ")((";
  protected final String TEXT_352 = ".Internal.Wrapper)get";
  protected final String TEXT_353 = "()).featureMap().get(";
  protected final String TEXT_354 = ", false);";
  protected final String TEXT_355 = NL + "\t\treturn (";
  protected final String TEXT_356 = ")get";
  protected final String TEXT_357 = "().get(";
  protected final String TEXT_358 = ", false);";
  protected final String TEXT_359 = NL;
  protected final String TEXT_360 = NL + "\t\treturn ";
  protected final String TEXT_361 = ".";
  protected final String TEXT_362 = "(this";
  protected final String TEXT_363 = ", ";
  protected final String TEXT_364 = ");";
  protected final String TEXT_365 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_366 = "' ";
  protected final String TEXT_367 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_368 = NL + "\t}" + NL;
  protected final String TEXT_369 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_370 = " basicSet";
  protected final String TEXT_371 = "(";
  protected final String TEXT_372 = " new";
  protected final String TEXT_373 = ", ";
  protected final String TEXT_374 = " msgs)" + NL + "\t{";
  protected final String TEXT_375 = NL;
  protected final String TEXT_376 = NL + "\t\tif (new";
  protected final String TEXT_377 = " != null && !";
  protected final String TEXT_378 = "().contains(new";
  protected final String TEXT_379 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_380 = "().add(new";
  protected final String TEXT_381 = ");" + NL + "\t\t}";
  protected final String TEXT_382 = NL + "\t\tObject old";
  protected final String TEXT_383 = " = eVirtualSet(";
  protected final String TEXT_384 = ", new";
  protected final String TEXT_385 = ");";
  protected final String TEXT_386 = NL + "\t\t";
  protected final String TEXT_387 = " old";
  protected final String TEXT_388 = " = ";
  protected final String TEXT_389 = ";" + NL + "\t\t";
  protected final String TEXT_390 = " = new";
  protected final String TEXT_391 = ";";
  protected final String TEXT_392 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_393 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_394 = NL + "\t\tboolean old";
  protected final String TEXT_395 = "ESet = (";
  protected final String TEXT_396 = " & ";
  protected final String TEXT_397 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_398 = " |= ";
  protected final String TEXT_399 = "_ESETFLAG;";
  protected final String TEXT_400 = NL + "\t\tboolean old";
  protected final String TEXT_401 = "ESet = ";
  protected final String TEXT_402 = "ESet;" + NL + "\t\t";
  protected final String TEXT_403 = "ESet = true;";
  protected final String TEXT_404 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_405 = NL + "\t\t\t";
  protected final String TEXT_406 = " notification = new ";
  protected final String TEXT_407 = "(this, ";
  protected final String TEXT_408 = ".SET, ";
  protected final String TEXT_409 = ", ";
  protected final String TEXT_410 = "isSetChange ? null : old";
  protected final String TEXT_411 = "old";
  protected final String TEXT_412 = ", new";
  protected final String TEXT_413 = ", ";
  protected final String TEXT_414 = "isSetChange";
  protected final String TEXT_415 = "!old";
  protected final String TEXT_416 = "ESet";
  protected final String TEXT_417 = ");";
  protected final String TEXT_418 = NL + "\t\t\t";
  protected final String TEXT_419 = " notification = new ";
  protected final String TEXT_420 = "(this, ";
  protected final String TEXT_421 = ".SET, ";
  protected final String TEXT_422 = ", ";
  protected final String TEXT_423 = "old";
  protected final String TEXT_424 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_425 = "old";
  protected final String TEXT_426 = ", new";
  protected final String TEXT_427 = ");";
  protected final String TEXT_428 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_429 = NL;
  protected final String TEXT_430 = NL + "\t\tif (";
  protected final String TEXT_431 = " != null && ";
  protected final String TEXT_432 = " != new";
  protected final String TEXT_433 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_434 = "(null);" + NL + "\t\t}";
  protected final String TEXT_435 = NL + "\t\tif (new";
  protected final String TEXT_436 = " != null ||  old";
  protected final String TEXT_437 = " == ";
  protected final String TEXT_438 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_439 = "(new";
  protected final String TEXT_440 = ");" + NL + "\t\t}";
  protected final String TEXT_441 = NL + "\t\treturn msgs;";
  protected final String TEXT_442 = NL + "\t\treturn ((";
  protected final String TEXT_443 = ".Internal)((";
  protected final String TEXT_444 = ".Internal.Wrapper)get";
  protected final String TEXT_445 = "()).featureMap()).basicAdd(";
  protected final String TEXT_446 = ", new";
  protected final String TEXT_447 = ", msgs);";
  protected final String TEXT_448 = NL + "\t\treturn ((";
  protected final String TEXT_449 = ".Internal)get";
  protected final String TEXT_450 = "()).basicAdd(";
  protected final String TEXT_451 = ", new";
  protected final String TEXT_452 = ", msgs);";
  protected final String TEXT_453 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_454 = "' ";
  protected final String TEXT_455 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_456 = NL + "\t}" + NL;
  protected final String TEXT_457 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_458 = "#";
  protected final String TEXT_459 = " <em>";
  protected final String TEXT_460 = "</em>}' ";
  protected final String TEXT_461 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_462 = "</em>' ";
  protected final String TEXT_463 = ".";
  protected final String TEXT_464 = NL + "\t * @see ";
  protected final String TEXT_465 = NL + "\t * @see #isSet";
  protected final String TEXT_466 = "()";
  protected final String TEXT_467 = NL + "\t * @see #unset";
  protected final String TEXT_468 = "()";
  protected final String TEXT_469 = NL + "\t * @see #";
  protected final String TEXT_470 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_471 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_472 = NL + "\tvoid set";
  protected final String TEXT_473 = "(";
  protected final String TEXT_474 = " value);" + NL;
  protected final String TEXT_475 = NL + "\tpublic void set";
  protected final String TEXT_476 = "(";
  protected final String TEXT_477 = " new";
  protected final String TEXT_478 = ")" + NL + "\t{";
  protected final String TEXT_479 = NL;
  protected final String TEXT_480 = NL + "\t\tnew";
  protected final String TEXT_481 = " = new";
  protected final String TEXT_482 = " == null ? ";
  protected final String TEXT_483 = "_EDEFAULT : new";
  protected final String TEXT_484 = ";";
  protected final String TEXT_485 = NL + "\t\tif (new";
  protected final String TEXT_486 = " != null && !";
  protected final String TEXT_487 = "().contains(new";
  protected final String TEXT_488 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_489 = "().add(new";
  protected final String TEXT_490 = ");" + NL + "\t\t}";
  protected final String TEXT_491 = NL + "\t\t";
  protected final String TEXT_492 = " old";
  protected final String TEXT_493 = " = eContainer();";
  protected final String TEXT_494 = NL + "\t\teSet(";
  protected final String TEXT_495 = ", ";
  protected final String TEXT_496 = "new ";
  protected final String TEXT_497 = "(";
  protected final String TEXT_498 = "new";
  protected final String TEXT_499 = ")";
  protected final String TEXT_500 = ");";
  protected final String TEXT_501 = NL + "\t\tif (new";
  protected final String TEXT_502 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_503 = " && new";
  protected final String TEXT_504 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_505 = ".isAncestor(this, ";
  protected final String TEXT_506 = "new";
  protected final String TEXT_507 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_508 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_509 = NL + "\t\t\t";
  protected final String TEXT_510 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_511 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_512 = ")new";
  protected final String TEXT_513 = ").eInverseAdd(this, ";
  protected final String TEXT_514 = ", ";
  protected final String TEXT_515 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_516 = ")new";
  protected final String TEXT_517 = ", ";
  protected final String TEXT_518 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_519 = "(this, ";
  protected final String TEXT_520 = ".SET, ";
  protected final String TEXT_521 = ", new";
  protected final String TEXT_522 = ", new";
  protected final String TEXT_523 = "));";
  protected final String TEXT_524 = NL + "\t\t";
  protected final String TEXT_525 = " ";
  protected final String TEXT_526 = " = (";
  protected final String TEXT_527 = ")eVirtualGet(";
  protected final String TEXT_528 = ");";
  protected final String TEXT_529 = NL + "\t\tif (new";
  protected final String TEXT_530 = " != ";
  protected final String TEXT_531 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_532 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_533 = " != null)";
  protected final String TEXT_534 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_535 = ")";
  protected final String TEXT_536 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_537 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_538 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_539 = ")new";
  protected final String TEXT_540 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_541 = ", null, msgs);";
  protected final String TEXT_542 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_543 = ")";
  protected final String TEXT_544 = ").eInverseRemove(this, ";
  protected final String TEXT_545 = ", ";
  protected final String TEXT_546 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_547 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_548 = ")new";
  protected final String TEXT_549 = ").eInverseAdd(this, ";
  protected final String TEXT_550 = ", ";
  protected final String TEXT_551 = ".class, msgs);";
  protected final String TEXT_552 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_553 = "(";
  protected final String TEXT_554 = "new";
  protected final String TEXT_555 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_556 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_557 = NL + "\t\t\tboolean old";
  protected final String TEXT_558 = "ESet = eVirtualIsSet(";
  protected final String TEXT_559 = ");";
  protected final String TEXT_560 = NL + "\t\t\tboolean old";
  protected final String TEXT_561 = "ESet = (";
  protected final String TEXT_562 = " & ";
  protected final String TEXT_563 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_564 = " |= ";
  protected final String TEXT_565 = "_ESETFLAG;";
  protected final String TEXT_566 = NL + "\t\t\tboolean old";
  protected final String TEXT_567 = "ESet = ";
  protected final String TEXT_568 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_569 = "ESet = true;";
  protected final String TEXT_570 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_571 = "(this, ";
  protected final String TEXT_572 = ".SET, ";
  protected final String TEXT_573 = ", new";
  protected final String TEXT_574 = ", new";
  protected final String TEXT_575 = ", !old";
  protected final String TEXT_576 = "ESet));" + NL + "    \t}";
  protected final String TEXT_577 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_578 = "(this, ";
  protected final String TEXT_579 = ".SET, ";
  protected final String TEXT_580 = ", new";
  protected final String TEXT_581 = ", new";
  protected final String TEXT_582 = "));";
  protected final String TEXT_583 = NL + "\t\t";
  protected final String TEXT_584 = " old";
  protected final String TEXT_585 = " = (";
  protected final String TEXT_586 = " & ";
  protected final String TEXT_587 = "_EFLAG) != 0;" + NL + "\t\tif (new";
  protected final String TEXT_588 = ") ";
  protected final String TEXT_589 = " |= ";
  protected final String TEXT_590 = "_EFLAG; else ";
  protected final String TEXT_591 = " &= ~";
  protected final String TEXT_592 = "_EFLAG;";
  protected final String TEXT_593 = NL + "\t\t";
  protected final String TEXT_594 = " old";
  protected final String TEXT_595 = " = ";
  protected final String TEXT_596 = ";";
  protected final String TEXT_597 = NL + "\t\t";
  protected final String TEXT_598 = " ";
  protected final String TEXT_599 = " = new";
  protected final String TEXT_600 = " == null ? ";
  protected final String TEXT_601 = "_EDEFAULT : new";
  protected final String TEXT_602 = ";";
  protected final String TEXT_603 = NL + "\t\t";
  protected final String TEXT_604 = " = new";
  protected final String TEXT_605 = " == null ? ";
  protected final String TEXT_606 = "_EDEFAULT : new";
  protected final String TEXT_607 = ";";
  protected final String TEXT_608 = NL + "\t\t";
  protected final String TEXT_609 = " ";
  protected final String TEXT_610 = " = ";
  protected final String TEXT_611 = "new";
  protected final String TEXT_612 = ";";
  protected final String TEXT_613 = NL + "\t\t";
  protected final String TEXT_614 = " = ";
  protected final String TEXT_615 = "new";
  protected final String TEXT_616 = ";";
  protected final String TEXT_617 = NL + "\t\tObject old";
  protected final String TEXT_618 = " = eVirtualSet(";
  protected final String TEXT_619 = ", ";
  protected final String TEXT_620 = ");";
  protected final String TEXT_621 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_622 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_623 = NL + "\t\tboolean old";
  protected final String TEXT_624 = "ESet = (";
  protected final String TEXT_625 = " & ";
  protected final String TEXT_626 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_627 = " |= ";
  protected final String TEXT_628 = "_ESETFLAG;";
  protected final String TEXT_629 = NL + "\t\tboolean old";
  protected final String TEXT_630 = "ESet = ";
  protected final String TEXT_631 = "ESet;" + NL + "\t\t";
  protected final String TEXT_632 = "ESet = true;";
  protected final String TEXT_633 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_634 = "(this, ";
  protected final String TEXT_635 = ".SET, ";
  protected final String TEXT_636 = ", ";
  protected final String TEXT_637 = "isSetChange ? ";
  protected final String TEXT_638 = "null";
  protected final String TEXT_639 = "_EDEFAULT";
  protected final String TEXT_640 = " : old";
  protected final String TEXT_641 = "old";
  protected final String TEXT_642 = ", ";
  protected final String TEXT_643 = "new";
  protected final String TEXT_644 = ", ";
  protected final String TEXT_645 = "isSetChange";
  protected final String TEXT_646 = "!old";
  protected final String TEXT_647 = "ESet";
  protected final String TEXT_648 = "));";
  protected final String TEXT_649 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_650 = "(this, ";
  protected final String TEXT_651 = ".SET, ";
  protected final String TEXT_652 = ", ";
  protected final String TEXT_653 = "old";
  protected final String TEXT_654 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_655 = "null";
  protected final String TEXT_656 = "_EDEFAULT";
  protected final String TEXT_657 = " : old";
  protected final String TEXT_658 = "old";
  protected final String TEXT_659 = ", ";
  protected final String TEXT_660 = "new";
  protected final String TEXT_661 = "));";
  protected final String TEXT_662 = NL;
  protected final String TEXT_663 = NL + "\t\tif (";
  protected final String TEXT_664 = " != null && ";
  protected final String TEXT_665 = " != new";
  protected final String TEXT_666 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_667 = "(null);" + NL + "\t\t}";
  protected final String TEXT_668 = NL + "\t\tif (new";
  protected final String TEXT_669 = " != null || old";
  protected final String TEXT_670 = " == ";
  protected final String TEXT_671 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_672 = "(new";
  protected final String TEXT_673 = ");" + NL + "\t\t}";
  protected final String TEXT_674 = NL + "\t\t((";
  protected final String TEXT_675 = ".Internal)((";
  protected final String TEXT_676 = ".Internal.Wrapper)get";
  protected final String TEXT_677 = "()).featureMap()).set(";
  protected final String TEXT_678 = ", ";
  protected final String TEXT_679 = "new ";
  protected final String TEXT_680 = "(";
  protected final String TEXT_681 = "new";
  protected final String TEXT_682 = ")";
  protected final String TEXT_683 = ");";
  protected final String TEXT_684 = NL + "\t\t((";
  protected final String TEXT_685 = ".Internal)get";
  protected final String TEXT_686 = "()).set(";
  protected final String TEXT_687 = ", ";
  protected final String TEXT_688 = "new ";
  protected final String TEXT_689 = "(";
  protected final String TEXT_690 = "new";
  protected final String TEXT_691 = ")";
  protected final String TEXT_692 = ");";
  protected final String TEXT_693 = NL;
  protected final String TEXT_694 = NL + "\t\t";
  protected final String TEXT_695 = ".";
  protected final String TEXT_696 = "(this";
  protected final String TEXT_697 = ", ";
  protected final String TEXT_698 = ");";
  protected final String TEXT_699 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_700 = "' ";
  protected final String TEXT_701 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_702 = NL + "\t}" + NL;
  protected final String TEXT_703 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_704 = " basicUnset";
  protected final String TEXT_705 = "(";
  protected final String TEXT_706 = " msgs)" + NL + "\t{";
  protected final String TEXT_707 = NL + "\t\tObject old";
  protected final String TEXT_708 = " = eVirtualUnset(";
  protected final String TEXT_709 = ");";
  protected final String TEXT_710 = NL + "\t\t";
  protected final String TEXT_711 = " old";
  protected final String TEXT_712 = " = ";
  protected final String TEXT_713 = ";" + NL + "\t\t";
  protected final String TEXT_714 = " = null;";
  protected final String TEXT_715 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_716 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_717 = NL + "\t\tboolean old";
  protected final String TEXT_718 = "ESet = (";
  protected final String TEXT_719 = " & ";
  protected final String TEXT_720 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_721 = " &= ~";
  protected final String TEXT_722 = "_ESETFLAG;";
  protected final String TEXT_723 = NL + "\t\tboolean old";
  protected final String TEXT_724 = "ESet = ";
  protected final String TEXT_725 = "ESet;" + NL + "\t\t";
  protected final String TEXT_726 = "ESet = false;";
  protected final String TEXT_727 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_728 = " notification = new ";
  protected final String TEXT_729 = "(this, ";
  protected final String TEXT_730 = ".UNSET, ";
  protected final String TEXT_731 = ", ";
  protected final String TEXT_732 = "isSetChange ? old";
  protected final String TEXT_733 = " : null";
  protected final String TEXT_734 = "old";
  protected final String TEXT_735 = ", null, ";
  protected final String TEXT_736 = "isSetChange";
  protected final String TEXT_737 = "old";
  protected final String TEXT_738 = "ESet";
  protected final String TEXT_739 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_740 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_741 = "' ";
  protected final String TEXT_742 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_743 = NL + "\t}" + NL;
  protected final String TEXT_744 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_745 = "#";
  protected final String TEXT_746 = " <em>";
  protected final String TEXT_747 = "</em>}' ";
  protected final String TEXT_748 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_749 = NL + "\t * @see #isSet";
  protected final String TEXT_750 = "()";
  protected final String TEXT_751 = NL + "\t * @see #";
  protected final String TEXT_752 = "()";
  protected final String TEXT_753 = NL + "\t * @see #set";
  protected final String TEXT_754 = "(";
  protected final String TEXT_755 = ")";
  protected final String TEXT_756 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_757 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_758 = NL + "\tvoid unset";
  protected final String TEXT_759 = "();" + NL;
  protected final String TEXT_760 = NL + "\tpublic void unset";
  protected final String TEXT_761 = "()" + NL + "\t{";
  protected final String TEXT_762 = NL + "\t\teUnset(";
  protected final String TEXT_763 = ");";
  protected final String TEXT_764 = NL + "\t\t((";
  protected final String TEXT_765 = ".Unsettable)get";
  protected final String TEXT_766 = "()).unset();";
  protected final String TEXT_767 = NL + "\t\t";
  protected final String TEXT_768 = " ";
  protected final String TEXT_769 = " = (";
  protected final String TEXT_770 = ")eVirtualGet(";
  protected final String TEXT_771 = ");";
  protected final String TEXT_772 = NL + "\t\tif (";
  protected final String TEXT_773 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_774 = " msgs = null;";
  protected final String TEXT_775 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_776 = ")";
  protected final String TEXT_777 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_778 = ", null, msgs);";
  protected final String TEXT_779 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_780 = ")";
  protected final String TEXT_781 = ").eInverseRemove(this, ";
  protected final String TEXT_782 = ", ";
  protected final String TEXT_783 = ".class, msgs);";
  protected final String TEXT_784 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_785 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_786 = NL + "\t\t\tboolean old";
  protected final String TEXT_787 = "ESet = eVirtualIsSet(";
  protected final String TEXT_788 = ");";
  protected final String TEXT_789 = NL + "\t\t\tboolean old";
  protected final String TEXT_790 = "ESet = (";
  protected final String TEXT_791 = " & ";
  protected final String TEXT_792 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_793 = " &= ~";
  protected final String TEXT_794 = "_ESETFLAG;";
  protected final String TEXT_795 = NL + "\t\t\tboolean old";
  protected final String TEXT_796 = "ESet = ";
  protected final String TEXT_797 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_798 = "ESet = false;";
  protected final String TEXT_799 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_800 = "(this, ";
  protected final String TEXT_801 = ".UNSET, ";
  protected final String TEXT_802 = ", null, null, old";
  protected final String TEXT_803 = "ESet));" + NL + "    \t}";
  protected final String TEXT_804 = NL + "\t\t";
  protected final String TEXT_805 = " old";
  protected final String TEXT_806 = " = (";
  protected final String TEXT_807 = " & ";
  protected final String TEXT_808 = "_EFLAG) != 0;";
  protected final String TEXT_809 = NL + "\t\tObject old";
  protected final String TEXT_810 = " = eVirtualUnset(";
  protected final String TEXT_811 = ");";
  protected final String TEXT_812 = NL + "\t\t";
  protected final String TEXT_813 = " old";
  protected final String TEXT_814 = " = ";
  protected final String TEXT_815 = ";";
  protected final String TEXT_816 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_817 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_818 = NL + "\t\tboolean old";
  protected final String TEXT_819 = "ESet = (";
  protected final String TEXT_820 = " & ";
  protected final String TEXT_821 = "_ESETFLAG) != 0;";
  protected final String TEXT_822 = NL + "\t\tboolean old";
  protected final String TEXT_823 = "ESet = ";
  protected final String TEXT_824 = "ESet;";
  protected final String TEXT_825 = NL + "\t\t";
  protected final String TEXT_826 = " = null;";
  protected final String TEXT_827 = NL + "\t\t";
  protected final String TEXT_828 = " &= ~";
  protected final String TEXT_829 = "_ESETFLAG;";
  protected final String TEXT_830 = NL + "\t\t";
  protected final String TEXT_831 = "ESet = false;";
  protected final String TEXT_832 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_833 = "(this, ";
  protected final String TEXT_834 = ".UNSET, ";
  protected final String TEXT_835 = ", ";
  protected final String TEXT_836 = "isSetChange ? old";
  protected final String TEXT_837 = " : null";
  protected final String TEXT_838 = "old";
  protected final String TEXT_839 = ", null, ";
  protected final String TEXT_840 = "isSetChange";
  protected final String TEXT_841 = "old";
  protected final String TEXT_842 = "ESet";
  protected final String TEXT_843 = "));";
  protected final String TEXT_844 = NL + "\t\tif (";
  protected final String TEXT_845 = "_EDEFAULT) ";
  protected final String TEXT_846 = " |= ";
  protected final String TEXT_847 = "_EFLAG; else ";
  protected final String TEXT_848 = " &= ~";
  protected final String TEXT_849 = "_EFLAG;";
  protected final String TEXT_850 = NL + "\t\t";
  protected final String TEXT_851 = " = ";
  protected final String TEXT_852 = "_EDEFAULT;";
  protected final String TEXT_853 = NL + "\t\t";
  protected final String TEXT_854 = " &= ~";
  protected final String TEXT_855 = "_ESETFLAG;";
  protected final String TEXT_856 = NL + "\t\t";
  protected final String TEXT_857 = "ESet = false;";
  protected final String TEXT_858 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_859 = "(this, ";
  protected final String TEXT_860 = ".UNSET, ";
  protected final String TEXT_861 = ", ";
  protected final String TEXT_862 = "isSetChange ? old";
  protected final String TEXT_863 = " : ";
  protected final String TEXT_864 = "_EDEFAULT";
  protected final String TEXT_865 = "old";
  protected final String TEXT_866 = ", ";
  protected final String TEXT_867 = "_EDEFAULT, ";
  protected final String TEXT_868 = "isSetChange";
  protected final String TEXT_869 = "old";
  protected final String TEXT_870 = "ESet";
  protected final String TEXT_871 = "));";
  protected final String TEXT_872 = NL + "\t\t((";
  protected final String TEXT_873 = ".Internal)((";
  protected final String TEXT_874 = ".Internal.Wrapper)get";
  protected final String TEXT_875 = "()).featureMap()).clear(";
  protected final String TEXT_876 = ");";
  protected final String TEXT_877 = NL + "\t\t((";
  protected final String TEXT_878 = ".Internal)get";
  protected final String TEXT_879 = "()).clear(";
  protected final String TEXT_880 = ");";
  protected final String TEXT_881 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_882 = "' ";
  protected final String TEXT_883 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_884 = NL + "\t}" + NL;
  protected final String TEXT_885 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_886 = "#";
  protected final String TEXT_887 = " <em>";
  protected final String TEXT_888 = "</em>}' ";
  protected final String TEXT_889 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_890 = "</em>' ";
  protected final String TEXT_891 = " is set.";
  protected final String TEXT_892 = NL + "\t * @see #unset";
  protected final String TEXT_893 = "()";
  protected final String TEXT_894 = NL + "\t * @see #";
  protected final String TEXT_895 = "()";
  protected final String TEXT_896 = NL + "\t * @see #set";
  protected final String TEXT_897 = "(";
  protected final String TEXT_898 = ")";
  protected final String TEXT_899 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_900 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_901 = NL + "\tboolean isSet";
  protected final String TEXT_902 = "();" + NL;
  protected final String TEXT_903 = NL + "\tpublic boolean isSet";
  protected final String TEXT_904 = "()" + NL + "\t{";
  protected final String TEXT_905 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_906 = ");";
  protected final String TEXT_907 = NL + "\t\t";
  protected final String TEXT_908 = " ";
  protected final String TEXT_909 = " = (";
  protected final String TEXT_910 = ")eVirtualGet(";
  protected final String TEXT_911 = ");";
  protected final String TEXT_912 = NL + "\t\treturn ";
  protected final String TEXT_913 = " != null && ((";
  protected final String TEXT_914 = ".Unsettable)";
  protected final String TEXT_915 = ").isSet();";
  protected final String TEXT_916 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_917 = ");";
  protected final String TEXT_918 = NL + "\t\treturn (";
  protected final String TEXT_919 = " & ";
  protected final String TEXT_920 = "_ESETFLAG) != 0;";
  protected final String TEXT_921 = NL + "\t\treturn ";
  protected final String TEXT_922 = "ESet;";
  protected final String TEXT_923 = NL + "\t\treturn !((";
  protected final String TEXT_924 = ".Internal)((";
  protected final String TEXT_925 = ".Internal.Wrapper)get";
  protected final String TEXT_926 = "()).featureMap()).isEmpty(";
  protected final String TEXT_927 = ");";
  protected final String TEXT_928 = NL + "\t\treturn !((";
  protected final String TEXT_929 = ".Internal)get";
  protected final String TEXT_930 = "()).isEmpty(";
  protected final String TEXT_931 = ");";
  protected final String TEXT_932 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_933 = "' ";
  protected final String TEXT_934 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_935 = NL + "\t}" + NL;
  protected final String TEXT_936 = NL;
  protected final String TEXT_937 = NL + "\t/**";
  protected final String TEXT_938 = NL + "\t * Creates a {@link ";
  protected final String TEXT_939 = "} and appends it to the '<em><b>";
  protected final String TEXT_940 = "</b></em>' ";
  protected final String TEXT_941 = ".";
  protected final String TEXT_942 = NL + "\t * Creates a {@link ";
  protected final String TEXT_943 = "} and sets the '<em><b>";
  protected final String TEXT_944 = "</b></em>' ";
  protected final String TEXT_945 = ".";
  protected final String TEXT_946 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_947 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_948 = "}." + NL + "\t * @see #";
  protected final String TEXT_949 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_950 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_951 = NL + "\t";
  protected final String TEXT_952 = " create";
  protected final String TEXT_953 = "(";
  protected final String TEXT_954 = " eClass);" + NL;
  protected final String TEXT_955 = NL + "\tpublic ";
  protected final String TEXT_956 = " create";
  protected final String TEXT_957 = "(";
  protected final String TEXT_958 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_959 = " new";
  protected final String TEXT_960 = " = (";
  protected final String TEXT_961 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_962 = NL + "\t\t";
  protected final String TEXT_963 = "().add(new";
  protected final String TEXT_964 = ");";
  protected final String TEXT_965 = NL + "\t\tset";
  protected final String TEXT_966 = "(new";
  protected final String TEXT_967 = ");";
  protected final String TEXT_968 = NL + "\t\treturn new";
  protected final String TEXT_969 = ";" + NL + "\t}" + NL;
  protected final String TEXT_970 = NL + "\t/**";
  protected final String TEXT_971 = NL + "\t * Creates a {@link ";
  protected final String TEXT_972 = "} and appends it to the '<em><b>";
  protected final String TEXT_973 = "</b></em>' ";
  protected final String TEXT_974 = ".";
  protected final String TEXT_975 = NL + "\t * Creates a {@link ";
  protected final String TEXT_976 = "} and sets the '<em><b>";
  protected final String TEXT_977 = "</b></em>' ";
  protected final String TEXT_978 = ".";
  protected final String TEXT_979 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The new {@link ";
  protected final String TEXT_980 = "}." + NL + "\t * @see #";
  protected final String TEXT_981 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_982 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_983 = NL + "\t";
  protected final String TEXT_984 = " create";
  protected final String TEXT_985 = "();" + NL;
  protected final String TEXT_986 = NL + "\tpublic ";
  protected final String TEXT_987 = " create";
  protected final String TEXT_988 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_989 = " new";
  protected final String TEXT_990 = " = ";
  protected final String TEXT_991 = ".eINSTANCE.create";
  protected final String TEXT_992 = "();";
  protected final String TEXT_993 = NL + "\t\t";
  protected final String TEXT_994 = "().add(new";
  protected final String TEXT_995 = ");";
  protected final String TEXT_996 = NL + "\t\tset";
  protected final String TEXT_997 = "(new";
  protected final String TEXT_998 = ");";
  protected final String TEXT_999 = NL + "\t\treturn new";
  protected final String TEXT_1000 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1001 = NL + "\t/**" + NL + "\t * Retrieves the {@link ";
  protected final String TEXT_1002 = "} with the specified '<em><b>";
  protected final String TEXT_1003 = "</b></em>' from the '<em><b>";
  protected final String TEXT_1004 = "</b></em>' ";
  protected final String TEXT_1005 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_1006 = " The '<em><b>";
  protected final String TEXT_1007 = "</b></em>' of the {@link ";
  protected final String TEXT_1008 = "} to retrieve." + NL + "\t * @return The {@link ";
  protected final String TEXT_1009 = "} with the specified '<em><b>";
  protected final String TEXT_1010 = "</b></em>', or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1011 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1013 = NL + "\t";
  protected final String TEXT_1014 = " get";
  protected final String TEXT_1015 = "(";
  protected final String TEXT_1016 = " ";
  protected final String TEXT_1017 = ");" + NL;
  protected final String TEXT_1018 = NL + "\tpublic ";
  protected final String TEXT_1019 = " get";
  protected final String TEXT_1020 = "(";
  protected final String TEXT_1021 = " ";
  protected final String TEXT_1022 = ")" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_1023 = " i = ";
  protected final String TEXT_1024 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1025 = " ";
  protected final String TEXT_1026 = " = (";
  protected final String TEXT_1027 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1028 = ".equals(";
  protected final String TEXT_1029 = ".";
  protected final String TEXT_1030 = "()))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1031 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1032 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1033 = "()" + NL + "\t{";
  protected final String TEXT_1034 = NL + "  \t\treturn false;";
  protected final String TEXT_1035 = NL + "\t\treturn !((";
  protected final String TEXT_1036 = ".Internal.Wrapper)";
  protected final String TEXT_1037 = "()).featureMap().isEmpty();";
  protected final String TEXT_1038 = NL + "\t\treturn ";
  protected final String TEXT_1039 = " != null && !";
  protected final String TEXT_1040 = ".featureMap().isEmpty();";
  protected final String TEXT_1041 = NL + "\t\treturn ";
  protected final String TEXT_1042 = " != null && !";
  protected final String TEXT_1043 = ".isEmpty();";
  protected final String TEXT_1044 = NL + "\t\t";
  protected final String TEXT_1045 = " ";
  protected final String TEXT_1046 = " = (";
  protected final String TEXT_1047 = ")eVirtualGet(";
  protected final String TEXT_1048 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1049 = " != null && !";
  protected final String TEXT_1050 = ".isEmpty();";
  protected final String TEXT_1051 = NL + "\t\treturn !";
  protected final String TEXT_1052 = "().isEmpty();";
  protected final String TEXT_1053 = NL + "\t\treturn ";
  protected final String TEXT_1054 = " != null;";
  protected final String TEXT_1055 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1056 = ") != null;";
  protected final String TEXT_1057 = NL + "\t\treturn basicGet";
  protected final String TEXT_1058 = "() != null;";
  protected final String TEXT_1059 = NL + "\t\treturn ";
  protected final String TEXT_1060 = " != null;";
  protected final String TEXT_1061 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1062 = ") != null;";
  protected final String TEXT_1063 = NL + "\t\treturn ";
  protected final String TEXT_1064 = "() != null;";
  protected final String TEXT_1065 = NL + "\t\treturn ((";
  protected final String TEXT_1066 = " & ";
  protected final String TEXT_1067 = "_EFLAG) != 0) != ";
  protected final String TEXT_1068 = "_EDEFAULT;";
  protected final String TEXT_1069 = NL + "\t\treturn ";
  protected final String TEXT_1070 = " != ";
  protected final String TEXT_1071 = "_EDEFAULT;";
  protected final String TEXT_1072 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1073 = ", ";
  protected final String TEXT_1074 = "_EDEFAULT) != ";
  protected final String TEXT_1075 = "_EDEFAULT;";
  protected final String TEXT_1076 = NL + "\t\treturn ";
  protected final String TEXT_1077 = "() != ";
  protected final String TEXT_1078 = "_EDEFAULT;";
  protected final String TEXT_1079 = NL + "\t\treturn ";
  protected final String TEXT_1080 = "_EDEFAULT == null ? ";
  protected final String TEXT_1081 = " != null : !";
  protected final String TEXT_1082 = "_EDEFAULT.equals(";
  protected final String TEXT_1083 = ");";
  protected final String TEXT_1084 = NL + "\t\t";
  protected final String TEXT_1085 = " ";
  protected final String TEXT_1086 = " = (";
  protected final String TEXT_1087 = ")eVirtualGet(";
  protected final String TEXT_1088 = ", ";
  protected final String TEXT_1089 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1090 = "_EDEFAULT == null ? ";
  protected final String TEXT_1091 = " != null : !";
  protected final String TEXT_1092 = "_EDEFAULT.equals(";
  protected final String TEXT_1093 = ");";
  protected final String TEXT_1094 = NL + "\t\treturn ";
  protected final String TEXT_1095 = "_EDEFAULT == null ? ";
  protected final String TEXT_1096 = "() != null : !";
  protected final String TEXT_1097 = "_EDEFAULT.equals(";
  protected final String TEXT_1098 = "());";
  protected final String TEXT_1099 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1100 = ");";
  protected final String TEXT_1101 = NL + "\t\t";
  protected final String TEXT_1102 = " ";
  protected final String TEXT_1103 = " = (";
  protected final String TEXT_1104 = ")eVirtualGet(";
  protected final String TEXT_1105 = ");";
  protected final String TEXT_1106 = NL + "\t\treturn ";
  protected final String TEXT_1107 = " != null && ((";
  protected final String TEXT_1108 = ".Unsettable)";
  protected final String TEXT_1109 = ").isSet();";
  protected final String TEXT_1110 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1111 = ");";
  protected final String TEXT_1112 = NL + "\t\treturn (";
  protected final String TEXT_1113 = " & ";
  protected final String TEXT_1114 = "_ESETFLAG) != 0;";
  protected final String TEXT_1115 = NL + "\t\treturn ";
  protected final String TEXT_1116 = "ESet;";
  protected final String TEXT_1117 = NL + "\t\treturn !((";
  protected final String TEXT_1118 = ".Internal)((";
  protected final String TEXT_1119 = ".Internal.Wrapper)get";
  protected final String TEXT_1120 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1121 = ");";
  protected final String TEXT_1122 = NL + "\t\treturn !((";
  protected final String TEXT_1123 = ".Internal)get";
  protected final String TEXT_1124 = "()).isEmpty(";
  protected final String TEXT_1125 = ");";
  protected final String TEXT_1126 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1127 = "' ";
  protected final String TEXT_1128 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1129 = NL + "\t}" + NL;
  protected final String TEXT_1130 = NL;
  protected final String TEXT_1131 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1132 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1133 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1134 = NL + "\t * @model ";
  protected final String TEXT_1135 = NL + "\t *        ";
  protected final String TEXT_1136 = NL + "\t * @model";
  protected final String TEXT_1137 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1138 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1139 = NL + "\t";
  protected final String TEXT_1140 = " ";
  protected final String TEXT_1141 = "(";
  protected final String TEXT_1142 = ")";
  protected final String TEXT_1143 = ";" + NL;
  protected final String TEXT_1144 = NL + "\tpublic ";
  protected final String TEXT_1145 = " ";
  protected final String TEXT_1146 = "(";
  protected final String TEXT_1147 = ")";
  protected final String TEXT_1148 = NL + "\t{";
  protected final String TEXT_1149 = NL + "\t\t";
  protected final String TEXT_1150 = NL + "\t\treturn ";
  protected final String TEXT_1151 = ".";
  protected final String TEXT_1152 = "(this, ";
  protected final String TEXT_1153 = ", ";
  protected final String TEXT_1154 = ");";
  protected final String TEXT_1155 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1156 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1157 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1158 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1159 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1160 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1161 = ".";
  protected final String TEXT_1162 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1163 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1164 = "\", ";
  protected final String TEXT_1165 = ".getObjectLabel(this, ";
  protected final String TEXT_1166 = ") }),";
  protected final String TEXT_1167 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1168 = NL + "\t\t";
  protected final String TEXT_1169 = ".";
  protected final String TEXT_1170 = "(this";
  protected final String TEXT_1171 = ", ";
  protected final String TEXT_1172 = ");";
  protected final String TEXT_1173 = NL + "\t\t";
  protected final String TEXT_1174 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1175 = " result = (";
  protected final String TEXT_1176 = ") cache.get(";
  protected final String TEXT_1177 = "eResource(), ";
  protected final String TEXT_1178 = "this, ";
  protected final String TEXT_1179 = ".getEOperations().get(";
  protected final String TEXT_1180 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1181 = "eResource(), ";
  protected final String TEXT_1182 = "this, ";
  protected final String TEXT_1183 = ".getEOperations().get(";
  protected final String TEXT_1184 = "), result = ";
  protected final String TEXT_1185 = "new ";
  protected final String TEXT_1186 = "(";
  protected final String TEXT_1187 = ".";
  protected final String TEXT_1188 = "(this";
  protected final String TEXT_1189 = ", ";
  protected final String TEXT_1190 = ")";
  protected final String TEXT_1191 = ")";
  protected final String TEXT_1192 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1193 = ".";
  protected final String TEXT_1194 = "()";
  protected final String TEXT_1195 = ";" + NL + "\t\t}";
  protected final String TEXT_1196 = NL + "\t\treturn ";
  protected final String TEXT_1197 = ".";
  protected final String TEXT_1198 = "(this";
  protected final String TEXT_1199 = ", ";
  protected final String TEXT_1200 = ");";
  protected final String TEXT_1201 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1202 = NL + "\t}" + NL;
  protected final String TEXT_1203 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1204 = " eInverseAdd(";
  protected final String TEXT_1205 = " otherEnd, int featureID, ";
  protected final String TEXT_1206 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1207 = NL + "\t\t\tcase ";
  protected final String TEXT_1208 = ":";
  protected final String TEXT_1209 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1210 = ")((";
  protected final String TEXT_1211 = ".InternalMapView)";
  protected final String TEXT_1212 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1213 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1214 = ")";
  protected final String TEXT_1215 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1216 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1217 = ", msgs);";
  protected final String TEXT_1218 = NL + "\t\t\t\t";
  protected final String TEXT_1219 = " ";
  protected final String TEXT_1220 = " = (";
  protected final String TEXT_1221 = ")eVirtualGet(";
  protected final String TEXT_1222 = ");";
  protected final String TEXT_1223 = NL + "\t\t\t\tif (";
  protected final String TEXT_1224 = " != null)";
  protected final String TEXT_1225 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1226 = ")";
  protected final String TEXT_1227 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1228 = ", null, msgs);";
  protected final String TEXT_1229 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1230 = ")";
  protected final String TEXT_1231 = ").eInverseRemove(this, ";
  protected final String TEXT_1232 = ", ";
  protected final String TEXT_1233 = ".class, msgs);";
  protected final String TEXT_1234 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1235 = "((";
  protected final String TEXT_1236 = ")otherEnd, msgs);";
  protected final String TEXT_1237 = NL + "\t\t}";
  protected final String TEXT_1238 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1239 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1240 = NL + "\t}" + NL;
  protected final String TEXT_1241 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1242 = " eInverseRemove(";
  protected final String TEXT_1243 = " otherEnd, int featureID, ";
  protected final String TEXT_1244 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1245 = NL + "\t\t\tcase ";
  protected final String TEXT_1246 = ":";
  protected final String TEXT_1247 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1248 = ")((";
  protected final String TEXT_1249 = ".InternalMapView)";
  protected final String TEXT_1250 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1251 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1252 = ")((";
  protected final String TEXT_1253 = ".Internal.Wrapper)";
  protected final String TEXT_1254 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1255 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1256 = ")";
  protected final String TEXT_1257 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1258 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1259 = ", msgs);";
  protected final String TEXT_1260 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1261 = "(msgs);";
  protected final String TEXT_1262 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1263 = "(null, msgs);";
  protected final String TEXT_1264 = NL + "\t\t}";
  protected final String TEXT_1265 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1266 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1267 = NL + "\t}" + NL;
  protected final String TEXT_1268 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1269 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1270 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1271 = NL + "\t\t\tcase ";
  protected final String TEXT_1272 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1273 = ", ";
  protected final String TEXT_1274 = ".class, msgs);";
  protected final String TEXT_1275 = NL + "\t\t}";
  protected final String TEXT_1276 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1277 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1278 = NL + "\t}" + NL;
  protected final String TEXT_1279 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1280 = NL + "\t\t\tcase ";
  protected final String TEXT_1281 = ":";
  protected final String TEXT_1282 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1283 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1284 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1285 = "(";
  protected final String TEXT_1286 = "());";
  protected final String TEXT_1287 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1288 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1289 = "();";
  protected final String TEXT_1290 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1291 = ".InternalMapView)";
  protected final String TEXT_1292 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1293 = "();";
  protected final String TEXT_1294 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1295 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1296 = "().map();";
  protected final String TEXT_1297 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1298 = ".Internal.Wrapper)";
  protected final String TEXT_1299 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1300 = "();";
  protected final String TEXT_1301 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1302 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1303 = ".Internal)";
  protected final String TEXT_1304 = "()).getWrapper();";
  protected final String TEXT_1305 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1306 = "();";
  protected final String TEXT_1307 = NL + "\t\t}";
  protected final String TEXT_1308 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1309 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1310 = NL + "\t}" + NL;
  protected final String TEXT_1311 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1312 = NL + "\t\t\tcase ";
  protected final String TEXT_1313 = ":";
  protected final String TEXT_1314 = NL + "\t\t\t\t((";
  protected final String TEXT_1315 = ".Internal)((";
  protected final String TEXT_1316 = ".Internal.Wrapper)";
  protected final String TEXT_1317 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1318 = NL + "\t\t\t\t((";
  protected final String TEXT_1319 = ".Internal)";
  protected final String TEXT_1320 = "()).set(newValue);";
  protected final String TEXT_1321 = NL + "\t\t\t\t((";
  protected final String TEXT_1322 = ".Setting)((";
  protected final String TEXT_1323 = ".InternalMapView)";
  protected final String TEXT_1324 = "()).eMap()).set(newValue);";
  protected final String TEXT_1325 = NL + "\t\t\t\t((";
  protected final String TEXT_1326 = ".Setting)";
  protected final String TEXT_1327 = "()).set(newValue);";
  protected final String TEXT_1328 = NL + "\t\t\t\t";
  protected final String TEXT_1329 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1330 = "().addAll((";
  protected final String TEXT_1331 = ")newValue);";
  protected final String TEXT_1332 = NL + "\t\t\t\tset";
  protected final String TEXT_1333 = "(((";
  protected final String TEXT_1334 = ")newValue).";
  protected final String TEXT_1335 = "());";
  protected final String TEXT_1336 = NL + "\t\t\t\tset";
  protected final String TEXT_1337 = "((";
  protected final String TEXT_1338 = ")newValue);";
  protected final String TEXT_1339 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1340 = NL + "\t\t}";
  protected final String TEXT_1341 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1342 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1343 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1344 = NL + "\t\t\tcase ";
  protected final String TEXT_1345 = ":";
  protected final String TEXT_1346 = NL + "\t\t\t\t((";
  protected final String TEXT_1347 = ".Internal.Wrapper)";
  protected final String TEXT_1348 = "()).featureMap().clear();";
  protected final String TEXT_1349 = NL + "\t\t\t\t";
  protected final String TEXT_1350 = "().clear();";
  protected final String TEXT_1351 = NL + "\t\t\t\tunset";
  protected final String TEXT_1352 = "();";
  protected final String TEXT_1353 = NL + "\t\t\t\tset";
  protected final String TEXT_1354 = "((";
  protected final String TEXT_1355 = ")null);";
  protected final String TEXT_1356 = NL + "\t\t\t\tset";
  protected final String TEXT_1357 = "(";
  protected final String TEXT_1358 = "_EDEFAULT);";
  protected final String TEXT_1359 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1360 = NL + "\t\t}";
  protected final String TEXT_1361 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1362 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1363 = NL + "\t}" + NL;
  protected final String TEXT_1364 = NL;
  protected final String TEXT_1365 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1366 = NL + "\t\t\tcase ";
  protected final String TEXT_1367 = ":";
  protected final String TEXT_1368 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1369 = "();";
  protected final String TEXT_1370 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1371 = ".Internal.Wrapper)";
  protected final String TEXT_1372 = "()).featureMap().isEmpty();";
  protected final String TEXT_1373 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1374 = " != null && !";
  protected final String TEXT_1375 = ".featureMap().isEmpty();";
  protected final String TEXT_1376 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1377 = " != null && !";
  protected final String TEXT_1378 = ".isEmpty();";
  protected final String TEXT_1379 = NL + "\t\t\t\t";
  protected final String TEXT_1380 = " ";
  protected final String TEXT_1381 = " = (";
  protected final String TEXT_1382 = ")eVirtualGet(";
  protected final String TEXT_1383 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1384 = " != null && !";
  protected final String TEXT_1385 = ".isEmpty();";
  protected final String TEXT_1386 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1387 = "().isEmpty();";
  protected final String TEXT_1388 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1389 = "();";
  protected final String TEXT_1390 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1391 = " != null;";
  protected final String TEXT_1392 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1393 = ") != null;";
  protected final String TEXT_1394 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1395 = "() != null;";
  protected final String TEXT_1396 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1397 = " != null;";
  protected final String TEXT_1398 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1399 = ") != null;";
  protected final String TEXT_1400 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1401 = "() != null;";
  protected final String TEXT_1402 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1403 = " & ";
  protected final String TEXT_1404 = "_EFLAG) != 0) != ";
  protected final String TEXT_1405 = "_EDEFAULT;";
  protected final String TEXT_1406 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1407 = " != ";
  protected final String TEXT_1408 = "_EDEFAULT;";
  protected final String TEXT_1409 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1410 = ", ";
  protected final String TEXT_1411 = "_EDEFAULT) != ";
  protected final String TEXT_1412 = "_EDEFAULT;";
  protected final String TEXT_1413 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1414 = "() != ";
  protected final String TEXT_1415 = "_EDEFAULT;";
  protected final String TEXT_1416 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1417 = "_EDEFAULT == null ? ";
  protected final String TEXT_1418 = " != null : !";
  protected final String TEXT_1419 = "_EDEFAULT.equals(";
  protected final String TEXT_1420 = ");";
  protected final String TEXT_1421 = NL + "\t\t\t\t";
  protected final String TEXT_1422 = " ";
  protected final String TEXT_1423 = " = (";
  protected final String TEXT_1424 = ")eVirtualGet(";
  protected final String TEXT_1425 = ", ";
  protected final String TEXT_1426 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1427 = "_EDEFAULT == null ? ";
  protected final String TEXT_1428 = " != null : !";
  protected final String TEXT_1429 = "_EDEFAULT.equals(";
  protected final String TEXT_1430 = ");";
  protected final String TEXT_1431 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1432 = "_EDEFAULT == null ? ";
  protected final String TEXT_1433 = "() != null : !";
  protected final String TEXT_1434 = "_EDEFAULT.equals(";
  protected final String TEXT_1435 = "());";
  protected final String TEXT_1436 = NL + "\t\t}";
  protected final String TEXT_1437 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1438 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1439 = NL + "\t}" + NL;
  protected final String TEXT_1440 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1441 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1442 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1443 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1444 = ": return ";
  protected final String TEXT_1445 = ";";
  protected final String TEXT_1446 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1447 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1448 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1449 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1450 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1451 = ": return ";
  protected final String TEXT_1452 = ";";
  protected final String TEXT_1453 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1454 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1455 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1456 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1457 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1458 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1459 = NL + "\t\t\tcase ";
  protected final String TEXT_1460 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1461 = ";";
  protected final String TEXT_1462 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1463 = NL + "\t\t\tcase ";
  protected final String TEXT_1464 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1465 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1466 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1467 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1468 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1469 = ": \");";
  protected final String TEXT_1470 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1471 = ": \");";
  protected final String TEXT_1472 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1473 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1474 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1475 = NL + "\t\tif (";
  protected final String TEXT_1476 = "(";
  protected final String TEXT_1477 = " & ";
  protected final String TEXT_1478 = "_ESETFLAG) != 0";
  protected final String TEXT_1479 = "ESet";
  protected final String TEXT_1480 = ") result.append((";
  protected final String TEXT_1481 = " & ";
  protected final String TEXT_1482 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1483 = NL + "\t\tif (";
  protected final String TEXT_1484 = "(";
  protected final String TEXT_1485 = " & ";
  protected final String TEXT_1486 = "_ESETFLAG) != 0";
  protected final String TEXT_1487 = "ESet";
  protected final String TEXT_1488 = ") result.append(";
  protected final String TEXT_1489 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1490 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1491 = ", ";
  protected final String TEXT_1492 = "_EDEFAULT";
  protected final String TEXT_1493 = "));";
  protected final String TEXT_1494 = NL + "\t\tresult.append((";
  protected final String TEXT_1495 = " & ";
  protected final String TEXT_1496 = "_EFLAG) != 0);";
  protected final String TEXT_1497 = NL + "\t\tresult.append(";
  protected final String TEXT_1498 = ");";
  protected final String TEXT_1499 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1500 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1501 = NL + "\t\treturn new ";
  protected final String TEXT_1502 = "(getTypedKey());";
  protected final String TEXT_1503 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1504 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1505 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1506 = ")key);";
  protected final String TEXT_1507 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1508 = ")key).";
  protected final String TEXT_1509 = "());";
  protected final String TEXT_1510 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1511 = ")key);";
  protected final String TEXT_1512 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1513 = NL + "\t\treturn new ";
  protected final String TEXT_1514 = "(getTypedValue());";
  protected final String TEXT_1515 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1516 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1517 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1518 = ")value);";
  protected final String TEXT_1519 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1520 = ")value).";
  protected final String TEXT_1521 = "());";
  protected final String TEXT_1522 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1523 = ")value);";
  protected final String TEXT_1524 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1525 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1526 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1527 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1528 = NL;
  protected final String TEXT_1529 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1530 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1531 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1532 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_1533 = " i = eAdapters().iterator(); i.hasNext();)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1534 = " adapter = (";
  protected final String TEXT_1535 = ") i.next();" + NL + "\t\t\tif (adapter instanceof ";
  protected final String TEXT_1536 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\treturn (";
  protected final String TEXT_1537 = ") adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1538 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1539 = " basicGet";
  protected final String TEXT_1540 = "()" + NL + "\t{";
  protected final String TEXT_1541 = NL + "\t\tif (isSet";
  protected final String TEXT_1542 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1543 = "basicGet";
  protected final String TEXT_1544 = "();" + NL + "\t\t}";
  protected final String TEXT_1545 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1546 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1547 = "basicGet";
  protected final String TEXT_1548 = "();" + NL + "\t\t}";
  protected final String TEXT_1549 = NL + "\t\t";
  protected final String TEXT_1550 = " ";
  protected final String TEXT_1551 = " = ";
  protected final String TEXT_1552 = "basicGet";
  protected final String TEXT_1553 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1554 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1555 = ";" + NL + "\t\t}";
  protected final String TEXT_1556 = NL + "\t\treturn ";
  protected final String TEXT_1557 = "super.basicGet";
  protected final String TEXT_1558 = "()";
  protected final String TEXT_1559 = "null";
  protected final String TEXT_1560 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1561 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1562 = " ";
  protected final String TEXT_1563 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1564 = " ";
  protected final String TEXT_1565 = " = basicGet";
  protected final String TEXT_1566 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1567 = " == null ? null : (";
  protected final String TEXT_1568 = ")eResolveProxy((";
  protected final String TEXT_1569 = ")";
  protected final String TEXT_1570 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1571 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1572 = " ";
  protected final String TEXT_1573 = "Helper(";
  protected final String TEXT_1574 = " ";
  protected final String TEXT_1575 = ")" + NL + "\t{";
  protected final String TEXT_1576 = NL + "\t\t";
  protected final String TEXT_1577 = ".addAll(super.";
  protected final String TEXT_1578 = "());";
  protected final String TEXT_1579 = NL + "\t\tsuper.";
  protected final String TEXT_1580 = "Helper(";
  protected final String TEXT_1581 = ");";
  protected final String TEXT_1582 = NL + "\t\tif (isSet";
  protected final String TEXT_1583 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1584 = " i = ((";
  protected final String TEXT_1585 = ") ";
  protected final String TEXT_1586 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1587 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1588 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1589 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1590 = " i = ((";
  protected final String TEXT_1591 = ") ";
  protected final String TEXT_1592 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1593 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1594 = NL + "\t\t";
  protected final String TEXT_1595 = " ";
  protected final String TEXT_1596 = " = ";
  protected final String TEXT_1597 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1598 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1599 = " i = ((";
  protected final String TEXT_1600 = ") ";
  protected final String TEXT_1601 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1602 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1603 = NL + "\t\tif (isSet";
  protected final String TEXT_1604 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1605 = ".addAll(";
  protected final String TEXT_1606 = "());" + NL + "\t\t}";
  protected final String TEXT_1607 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1608 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1609 = ".addAll(";
  protected final String TEXT_1610 = "());" + NL + "\t\t}";
  protected final String TEXT_1611 = NL + "\t\t";
  protected final String TEXT_1612 = " ";
  protected final String TEXT_1613 = " = ";
  protected final String TEXT_1614 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1615 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1616 = ".addAll(";
  protected final String TEXT_1617 = ");" + NL + "\t\t}";
  protected final String TEXT_1618 = NL + "\t\tif (isSet";
  protected final String TEXT_1619 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1620 = ".add(";
  protected final String TEXT_1621 = "basicGet";
  protected final String TEXT_1622 = "());" + NL + "\t\t}";
  protected final String TEXT_1623 = NL + "\t\t";
  protected final String TEXT_1624 = " ";
  protected final String TEXT_1625 = " = ";
  protected final String TEXT_1626 = "basicGet";
  protected final String TEXT_1627 = "();" + NL + "\t\tif (";
  protected final String TEXT_1628 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1629 = ".add(";
  protected final String TEXT_1630 = ");" + NL + "\t\t}";
  protected final String TEXT_1631 = NL + "\t\treturn ";
  protected final String TEXT_1632 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1633 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1634 = " ";
  protected final String TEXT_1635 = "()" + NL + "\t{";
  protected final String TEXT_1636 = NL + "\t\t";
  protected final String TEXT_1637 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_1638 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1639 = " method = getClass().getMethod(\"";
  protected final String TEXT_1640 = "\", null);";
  protected final String TEXT_1641 = NL + "\t\t\t\t";
  protected final String TEXT_1642 = " ";
  protected final String TEXT_1643 = " = (";
  protected final String TEXT_1644 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_1645 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1646 = " union = ";
  protected final String TEXT_1647 = "Helper(new ";
  protected final String TEXT_1648 = "());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_1649 = " = new ";
  protected final String TEXT_1650 = "(this, ";
  protected final String TEXT_1651 = "null";
  protected final String TEXT_1652 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1653 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1654 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_1655 = NL + "\t\t\t";
  protected final String TEXT_1656 = " ";
  protected final String TEXT_1657 = " = (";
  protected final String TEXT_1658 = ") cache.get(eResource(), this, ";
  protected final String TEXT_1659 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_1660 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1661 = " union = ";
  protected final String TEXT_1662 = "Helper(new ";
  protected final String TEXT_1663 = "());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_1664 = ", ";
  protected final String TEXT_1665 = " = new ";
  protected final String TEXT_1666 = "(this, ";
  protected final String TEXT_1667 = "null";
  protected final String TEXT_1668 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_1669 = ";";
  protected final String TEXT_1670 = NL + "\t\t}";
  protected final String TEXT_1671 = NL + "\t\t";
  protected final String TEXT_1672 = " union = ";
  protected final String TEXT_1673 = "Helper(new ";
  protected final String TEXT_1674 = "());" + NL + "\t\treturn new ";
  protected final String TEXT_1675 = "(this, ";
  protected final String TEXT_1676 = "null";
  protected final String TEXT_1677 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_1678 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1679 = " ";
  protected final String TEXT_1680 = "()" + NL + "\t{";
  protected final String TEXT_1681 = NL + "\t\tif (isSet";
  protected final String TEXT_1682 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1683 = "();" + NL + "\t\t}";
  protected final String TEXT_1684 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1685 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1686 = "();" + NL + "\t\t}";
  protected final String TEXT_1687 = NL + "\t\t";
  protected final String TEXT_1688 = " ";
  protected final String TEXT_1689 = " = ";
  protected final String TEXT_1690 = "();" + NL + "\t\tif (";
  protected final String TEXT_1691 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1692 = ";" + NL + "\t\t}";
  protected final String TEXT_1693 = NL + "\t\treturn ";
  protected final String TEXT_1694 = "super.";
  protected final String TEXT_1695 = "()";
  protected final String TEXT_1696 = "null";
  protected final String TEXT_1697 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1698 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1699 = "()" + NL + "\t{";
  protected final String TEXT_1700 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1701 = "()";
  protected final String TEXT_1702 = NL + "\t\treturn isSet";
  protected final String TEXT_1703 = "()";
  protected final String TEXT_1704 = ";";
  protected final String TEXT_1705 = NL + "\t\treturn !";
  protected final String TEXT_1706 = "().isEmpty()";
  protected final String TEXT_1707 = ";";
  protected final String TEXT_1708 = NL + "\t\treturn ";
  protected final String TEXT_1709 = "basicGet";
  protected final String TEXT_1710 = "() != null";
  protected final String TEXT_1711 = ";";
  protected final String TEXT_1712 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1713 = ")";
  protected final String TEXT_1714 = ";";
  protected final String TEXT_1715 = NL + "\t\t\t|| isSet";
  protected final String TEXT_1716 = "()";
  protected final String TEXT_1717 = ";";
  protected final String TEXT_1718 = NL + "\t\t\t|| !";
  protected final String TEXT_1719 = "().isEmpty()";
  protected final String TEXT_1720 = ";";
  protected final String TEXT_1721 = NL + "\t\t\t|| ";
  protected final String TEXT_1722 = "basicGet";
  protected final String TEXT_1723 = "() != null";
  protected final String TEXT_1724 = ";";
  protected final String TEXT_1725 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_1726 = ")";
  protected final String TEXT_1727 = ";";
  protected final String TEXT_1728 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1729 = "();";
  protected final String TEXT_1730 = NL + "\t\treturn false;";
  protected final String TEXT_1731 = NL + "\t}" + NL;
  protected final String TEXT_1732 = NL;
  protected final String TEXT_1733 = NL + "\t/**";
  protected final String TEXT_1734 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1735 = "} and appends it to the '<em><b>";
  protected final String TEXT_1736 = "</b></em>' ";
  protected final String TEXT_1737 = ".";
  protected final String TEXT_1738 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1739 = "} and sets the '<em><b>";
  protected final String TEXT_1740 = "</b></em>' ";
  protected final String TEXT_1741 = ".";
  protected final String TEXT_1742 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1743 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1744 = "}." + NL + "\t * @see #";
  protected final String TEXT_1745 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1746 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1747 = NL + "\t";
  protected final String TEXT_1748 = " create";
  protected final String TEXT_1749 = "(";
  protected final String TEXT_1750 = " eClass);" + NL;
  protected final String TEXT_1751 = NL + "\tpublic ";
  protected final String TEXT_1752 = " create";
  protected final String TEXT_1753 = "(";
  protected final String TEXT_1754 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1755 = " new";
  protected final String TEXT_1756 = " = (";
  protected final String TEXT_1757 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1758 = NL + "\t\t";
  protected final String TEXT_1759 = "().add(new";
  protected final String TEXT_1760 = ");";
  protected final String TEXT_1761 = NL + "\t\tset";
  protected final String TEXT_1762 = "(new";
  protected final String TEXT_1763 = ");";
  protected final String TEXT_1764 = NL + "\t\treturn new";
  protected final String TEXT_1765 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1766 = NL + "\t/**";
  protected final String TEXT_1767 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1768 = "} and appends it to the '<em><b>";
  protected final String TEXT_1769 = "</b></em>' ";
  protected final String TEXT_1770 = ".";
  protected final String TEXT_1771 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1772 = "} and sets the '<em><b>";
  protected final String TEXT_1773 = "</b></em>' ";
  protected final String TEXT_1774 = ".";
  protected final String TEXT_1775 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The new {@link ";
  protected final String TEXT_1776 = "}." + NL + "\t * @see #";
  protected final String TEXT_1777 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1778 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1779 = NL + "\t";
  protected final String TEXT_1780 = " create";
  protected final String TEXT_1781 = "();" + NL;
  protected final String TEXT_1782 = NL + "\tpublic ";
  protected final String TEXT_1783 = " create";
  protected final String TEXT_1784 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1785 = " new";
  protected final String TEXT_1786 = " = ";
  protected final String TEXT_1787 = ".eINSTANCE.create";
  protected final String TEXT_1788 = "();";
  protected final String TEXT_1789 = NL + "\t\t";
  protected final String TEXT_1790 = "().add(new";
  protected final String TEXT_1791 = ");";
  protected final String TEXT_1792 = NL + "\t\tset";
  protected final String TEXT_1793 = "(new";
  protected final String TEXT_1794 = ");";
  protected final String TEXT_1795 = NL + "\t\treturn new";
  protected final String TEXT_1796 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1797 = NL + "\t/**" + NL + "\t * Retrieves the {@link ";
  protected final String TEXT_1798 = "} with the specified '<em><b>";
  protected final String TEXT_1799 = "</b></em>' from the '<em><b>";
  protected final String TEXT_1800 = "</b></em>' ";
  protected final String TEXT_1801 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_1802 = " The '<em><b>";
  protected final String TEXT_1803 = "</b></em>' of the {@link ";
  protected final String TEXT_1804 = "} to retrieve." + NL + "\t * @return The {@link ";
  protected final String TEXT_1805 = "} with the specified '<em><b>";
  protected final String TEXT_1806 = "</b></em>', or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1807 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1808 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1809 = NL + "\t";
  protected final String TEXT_1810 = " get";
  protected final String TEXT_1811 = "(";
  protected final String TEXT_1812 = " ";
  protected final String TEXT_1813 = ");" + NL;
  protected final String TEXT_1814 = NL + "\tpublic ";
  protected final String TEXT_1815 = " get";
  protected final String TEXT_1816 = "(";
  protected final String TEXT_1817 = " ";
  protected final String TEXT_1818 = ")" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_1819 = " i = ";
  protected final String TEXT_1820 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1821 = " ";
  protected final String TEXT_1822 = " = (";
  protected final String TEXT_1823 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1824 = ".equals(";
  protected final String TEXT_1825 = ".";
  protected final String TEXT_1826 = "()))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1827 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1828 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1829 = "()" + NL + "\t{";
  protected final String TEXT_1830 = NL + "  \t\treturn false;";
  protected final String TEXT_1831 = NL + "\t\treturn !((";
  protected final String TEXT_1832 = ".Internal.Wrapper)";
  protected final String TEXT_1833 = "()).featureMap().isEmpty();";
  protected final String TEXT_1834 = NL + "\t\treturn ";
  protected final String TEXT_1835 = " != null && !";
  protected final String TEXT_1836 = ".featureMap().isEmpty();";
  protected final String TEXT_1837 = NL + "\t\treturn ";
  protected final String TEXT_1838 = " != null && !";
  protected final String TEXT_1839 = ".isEmpty();";
  protected final String TEXT_1840 = NL + "\t\t";
  protected final String TEXT_1841 = " ";
  protected final String TEXT_1842 = " = (";
  protected final String TEXT_1843 = ")eVirtualGet(";
  protected final String TEXT_1844 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1845 = " != null && !";
  protected final String TEXT_1846 = ".isEmpty();";
  protected final String TEXT_1847 = NL + "\t\treturn !";
  protected final String TEXT_1848 = "().isEmpty();";
  protected final String TEXT_1849 = NL + "\t\treturn ";
  protected final String TEXT_1850 = " != null;";
  protected final String TEXT_1851 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1852 = ") != null;";
  protected final String TEXT_1853 = NL + "\t\treturn basicGet";
  protected final String TEXT_1854 = "() != null;";
  protected final String TEXT_1855 = NL + "\t\treturn ";
  protected final String TEXT_1856 = " != null;";
  protected final String TEXT_1857 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1858 = ") != null;";
  protected final String TEXT_1859 = NL + "\t\treturn ";
  protected final String TEXT_1860 = "() != null;";
  protected final String TEXT_1861 = NL + "\t\treturn ((";
  protected final String TEXT_1862 = " & ";
  protected final String TEXT_1863 = "_EFLAG) != 0) != ";
  protected final String TEXT_1864 = "_EDEFAULT;";
  protected final String TEXT_1865 = NL + "\t\treturn ";
  protected final String TEXT_1866 = " != ";
  protected final String TEXT_1867 = "_EDEFAULT;";
  protected final String TEXT_1868 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1869 = ", ";
  protected final String TEXT_1870 = "_EDEFAULT) != ";
  protected final String TEXT_1871 = "_EDEFAULT;";
  protected final String TEXT_1872 = NL + "\t\treturn ";
  protected final String TEXT_1873 = "() != ";
  protected final String TEXT_1874 = "_EDEFAULT;";
  protected final String TEXT_1875 = NL + "\t\treturn ";
  protected final String TEXT_1876 = "_EDEFAULT == null ? ";
  protected final String TEXT_1877 = " != null : !";
  protected final String TEXT_1878 = "_EDEFAULT.equals(";
  protected final String TEXT_1879 = ");";
  protected final String TEXT_1880 = NL + "\t\t";
  protected final String TEXT_1881 = " ";
  protected final String TEXT_1882 = " = (";
  protected final String TEXT_1883 = ")eVirtualGet(";
  protected final String TEXT_1884 = ", ";
  protected final String TEXT_1885 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1886 = "_EDEFAULT == null ? ";
  protected final String TEXT_1887 = " != null : !";
  protected final String TEXT_1888 = "_EDEFAULT.equals(";
  protected final String TEXT_1889 = ");";
  protected final String TEXT_1890 = NL + "\t\treturn ";
  protected final String TEXT_1891 = "_EDEFAULT == null ? ";
  protected final String TEXT_1892 = "() != null : !";
  protected final String TEXT_1893 = "_EDEFAULT.equals(";
  protected final String TEXT_1894 = "());";
  protected final String TEXT_1895 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1896 = ");";
  protected final String TEXT_1897 = NL + "\t\t";
  protected final String TEXT_1898 = " ";
  protected final String TEXT_1899 = " = (";
  protected final String TEXT_1900 = ")eVirtualGet(";
  protected final String TEXT_1901 = ");";
  protected final String TEXT_1902 = NL + "\t\treturn ";
  protected final String TEXT_1903 = " != null && ((";
  protected final String TEXT_1904 = ".Unsettable)";
  protected final String TEXT_1905 = ").isSet();";
  protected final String TEXT_1906 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1907 = ");";
  protected final String TEXT_1908 = NL + "\t\treturn (";
  protected final String TEXT_1909 = " & ";
  protected final String TEXT_1910 = "_ESETFLAG) != 0;";
  protected final String TEXT_1911 = NL + "\t\treturn ";
  protected final String TEXT_1912 = "ESet;";
  protected final String TEXT_1913 = NL + "\t\treturn !((";
  protected final String TEXT_1914 = ".Internal)((";
  protected final String TEXT_1915 = ".Internal.Wrapper)get";
  protected final String TEXT_1916 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1917 = ");";
  protected final String TEXT_1918 = NL + "\t\treturn !((";
  protected final String TEXT_1919 = ".Internal)get";
  protected final String TEXT_1920 = "()).isEmpty(";
  protected final String TEXT_1921 = ");";
  protected final String TEXT_1922 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1923 = "' ";
  protected final String TEXT_1924 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1925 = NL + "\t}" + NL;
  protected final String TEXT_1926 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1927 = " ";
  protected final String TEXT_1928 = "()" + NL + "\t{";
  protected final String TEXT_1929 = NL + "\t\treturn ";
  protected final String TEXT_1930 = "();";
  protected final String TEXT_1931 = NL + "\t\treturn new ";
  protected final String TEXT_1932 = ".UnmodifiableEList(this, ";
  protected final String TEXT_1933 = "null";
  protected final String TEXT_1934 = ", 0, ";
  protected final String TEXT_1935 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_1936 = NL + "\t\treturn null;";
  protected final String TEXT_1937 = NL + "\t\treturn ";
  protected final String TEXT_1938 = "();";
  protected final String TEXT_1939 = NL + "\t}" + NL;
  protected final String TEXT_1940 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1941 = " basicGet";
  protected final String TEXT_1942 = "()" + NL + "\t{";
  protected final String TEXT_1943 = NL + "\t\treturn null;";
  protected final String TEXT_1944 = NL + "\t\treturn ";
  protected final String TEXT_1945 = "basicGet";
  protected final String TEXT_1946 = "();";
  protected final String TEXT_1947 = NL + "\t}" + NL;
  protected final String TEXT_1948 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1949 = " basicSet";
  protected final String TEXT_1950 = "(";
  protected final String TEXT_1951 = " new";
  protected final String TEXT_1952 = ", ";
  protected final String TEXT_1953 = " msgs)" + NL + "\t{";
  protected final String TEXT_1954 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1955 = NL + "\t\tif (new";
  protected final String TEXT_1956 = " != null && !(new";
  protected final String TEXT_1957 = " instanceof ";
  protected final String TEXT_1958 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1959 = "));" + NL + "\t\t}";
  protected final String TEXT_1960 = NL + "\t\treturn basicSet";
  protected final String TEXT_1961 = "(";
  protected final String TEXT_1962 = "(";
  protected final String TEXT_1963 = ") ";
  protected final String TEXT_1964 = "new";
  protected final String TEXT_1965 = ", msgs);";
  protected final String TEXT_1966 = NL + "\t\tset";
  protected final String TEXT_1967 = "(";
  protected final String TEXT_1968 = "(";
  protected final String TEXT_1969 = ") ";
  protected final String TEXT_1970 = "new";
  protected final String TEXT_1971 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1972 = NL + "\t}" + NL;
  protected final String TEXT_1973 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1974 = "(";
  protected final String TEXT_1975 = " new";
  protected final String TEXT_1976 = ")" + NL + "\t{";
  protected final String TEXT_1977 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1978 = NL + "\t\tif (new";
  protected final String TEXT_1979 = " != null && !(new";
  protected final String TEXT_1980 = " instanceof ";
  protected final String TEXT_1981 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1982 = "));" + NL + "\t\t}";
  protected final String TEXT_1983 = NL + "\t\tset";
  protected final String TEXT_1984 = "(";
  protected final String TEXT_1985 = "(";
  protected final String TEXT_1986 = ") ";
  protected final String TEXT_1987 = "new";
  protected final String TEXT_1988 = ");";
  protected final String TEXT_1989 = NL + "\t}" + NL;
  protected final String TEXT_1990 = NL;
  protected final String TEXT_1991 = NL + "\t/**";
  protected final String TEXT_1992 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1993 = "} and appends it to the '<em><b>";
  protected final String TEXT_1994 = "</b></em>' ";
  protected final String TEXT_1995 = ".";
  protected final String TEXT_1996 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1997 = "} and sets the '<em><b>";
  protected final String TEXT_1998 = "</b></em>' ";
  protected final String TEXT_1999 = ".";
  protected final String TEXT_2000 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2001 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2002 = "}." + NL + "\t * @see #";
  protected final String TEXT_2003 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2004 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2005 = NL + "\t";
  protected final String TEXT_2006 = " create";
  protected final String TEXT_2007 = "(";
  protected final String TEXT_2008 = " eClass);" + NL;
  protected final String TEXT_2009 = NL + "\tpublic ";
  protected final String TEXT_2010 = " create";
  protected final String TEXT_2011 = "(";
  protected final String TEXT_2012 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2013 = " new";
  protected final String TEXT_2014 = " = (";
  protected final String TEXT_2015 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_2016 = NL + "\t\t";
  protected final String TEXT_2017 = "().add(new";
  protected final String TEXT_2018 = ");";
  protected final String TEXT_2019 = NL + "\t\tset";
  protected final String TEXT_2020 = "(new";
  protected final String TEXT_2021 = ");";
  protected final String TEXT_2022 = NL + "\t\treturn new";
  protected final String TEXT_2023 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2024 = NL + "\t/**";
  protected final String TEXT_2025 = NL + "\t * Creates a {@link ";
  protected final String TEXT_2026 = "} and appends it to the '<em><b>";
  protected final String TEXT_2027 = "</b></em>' ";
  protected final String TEXT_2028 = ".";
  protected final String TEXT_2029 = NL + "\t * Creates a {@link ";
  protected final String TEXT_2030 = "} and sets the '<em><b>";
  protected final String TEXT_2031 = "</b></em>' ";
  protected final String TEXT_2032 = ".";
  protected final String TEXT_2033 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The new {@link ";
  protected final String TEXT_2034 = "}." + NL + "\t * @see #";
  protected final String TEXT_2035 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2036 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2037 = NL + "\t";
  protected final String TEXT_2038 = " create";
  protected final String TEXT_2039 = "();" + NL;
  protected final String TEXT_2040 = NL + "\tpublic ";
  protected final String TEXT_2041 = " create";
  protected final String TEXT_2042 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2043 = " new";
  protected final String TEXT_2044 = " = ";
  protected final String TEXT_2045 = ".eINSTANCE.create";
  protected final String TEXT_2046 = "();";
  protected final String TEXT_2047 = NL + "\t\t";
  protected final String TEXT_2048 = "().add(new";
  protected final String TEXT_2049 = ");";
  protected final String TEXT_2050 = NL + "\t\tset";
  protected final String TEXT_2051 = "(new";
  protected final String TEXT_2052 = ");";
  protected final String TEXT_2053 = NL + "\t\treturn new";
  protected final String TEXT_2054 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2055 = NL + "\t/**" + NL + "\t * Retrieves the {@link ";
  protected final String TEXT_2056 = "} with the specified '<em><b>";
  protected final String TEXT_2057 = "</b></em>' from the '<em><b>";
  protected final String TEXT_2058 = "</b></em>' ";
  protected final String TEXT_2059 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_2060 = " The '<em><b>";
  protected final String TEXT_2061 = "</b></em>' of the {@link ";
  protected final String TEXT_2062 = "} to retrieve." + NL + "\t * @return The {@link ";
  protected final String TEXT_2063 = "} with the specified '<em><b>";
  protected final String TEXT_2064 = "</b></em>', or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2065 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2066 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2067 = NL + "\t";
  protected final String TEXT_2068 = " get";
  protected final String TEXT_2069 = "(";
  protected final String TEXT_2070 = " ";
  protected final String TEXT_2071 = ");" + NL;
  protected final String TEXT_2072 = NL + "\tpublic ";
  protected final String TEXT_2073 = " get";
  protected final String TEXT_2074 = "(";
  protected final String TEXT_2075 = " ";
  protected final String TEXT_2076 = ")" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_2077 = " i = ";
  protected final String TEXT_2078 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2079 = " ";
  protected final String TEXT_2080 = " = (";
  protected final String TEXT_2081 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_2082 = ".equals(";
  protected final String TEXT_2083 = ".";
  protected final String TEXT_2084 = "()))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2085 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_2086 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2087 = "()" + NL + "\t{";
  protected final String TEXT_2088 = NL + "  \t\treturn false;";
  protected final String TEXT_2089 = NL + "\t\treturn !((";
  protected final String TEXT_2090 = ".Internal.Wrapper)";
  protected final String TEXT_2091 = "()).featureMap().isEmpty();";
  protected final String TEXT_2092 = NL + "\t\treturn ";
  protected final String TEXT_2093 = " != null && !";
  protected final String TEXT_2094 = ".featureMap().isEmpty();";
  protected final String TEXT_2095 = NL + "\t\treturn ";
  protected final String TEXT_2096 = " != null && !";
  protected final String TEXT_2097 = ".isEmpty();";
  protected final String TEXT_2098 = NL + "\t\t";
  protected final String TEXT_2099 = " ";
  protected final String TEXT_2100 = " = (";
  protected final String TEXT_2101 = ")eVirtualGet(";
  protected final String TEXT_2102 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2103 = " != null && !";
  protected final String TEXT_2104 = ".isEmpty();";
  protected final String TEXT_2105 = NL + "\t\treturn !";
  protected final String TEXT_2106 = "().isEmpty();";
  protected final String TEXT_2107 = NL + "\t\treturn ";
  protected final String TEXT_2108 = " != null;";
  protected final String TEXT_2109 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2110 = ") != null;";
  protected final String TEXT_2111 = NL + "\t\treturn basicGet";
  protected final String TEXT_2112 = "() != null;";
  protected final String TEXT_2113 = NL + "\t\treturn ";
  protected final String TEXT_2114 = " != null;";
  protected final String TEXT_2115 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2116 = ") != null;";
  protected final String TEXT_2117 = NL + "\t\treturn ";
  protected final String TEXT_2118 = "() != null;";
  protected final String TEXT_2119 = NL + "\t\treturn ((";
  protected final String TEXT_2120 = " & ";
  protected final String TEXT_2121 = "_EFLAG) != 0) != ";
  protected final String TEXT_2122 = "_EDEFAULT;";
  protected final String TEXT_2123 = NL + "\t\treturn ";
  protected final String TEXT_2124 = " != ";
  protected final String TEXT_2125 = "_EDEFAULT;";
  protected final String TEXT_2126 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2127 = ", ";
  protected final String TEXT_2128 = "_EDEFAULT) != ";
  protected final String TEXT_2129 = "_EDEFAULT;";
  protected final String TEXT_2130 = NL + "\t\treturn ";
  protected final String TEXT_2131 = "() != ";
  protected final String TEXT_2132 = "_EDEFAULT;";
  protected final String TEXT_2133 = NL + "\t\treturn ";
  protected final String TEXT_2134 = "_EDEFAULT == null ? ";
  protected final String TEXT_2135 = " != null : !";
  protected final String TEXT_2136 = "_EDEFAULT.equals(";
  protected final String TEXT_2137 = ");";
  protected final String TEXT_2138 = NL + "\t\t";
  protected final String TEXT_2139 = " ";
  protected final String TEXT_2140 = " = (";
  protected final String TEXT_2141 = ")eVirtualGet(";
  protected final String TEXT_2142 = ", ";
  protected final String TEXT_2143 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2144 = "_EDEFAULT == null ? ";
  protected final String TEXT_2145 = " != null : !";
  protected final String TEXT_2146 = "_EDEFAULT.equals(";
  protected final String TEXT_2147 = ");";
  protected final String TEXT_2148 = NL + "\t\treturn ";
  protected final String TEXT_2149 = "_EDEFAULT == null ? ";
  protected final String TEXT_2150 = "() != null : !";
  protected final String TEXT_2151 = "_EDEFAULT.equals(";
  protected final String TEXT_2152 = "());";
  protected final String TEXT_2153 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2154 = ");";
  protected final String TEXT_2155 = NL + "\t\t";
  protected final String TEXT_2156 = " ";
  protected final String TEXT_2157 = " = (";
  protected final String TEXT_2158 = ")eVirtualGet(";
  protected final String TEXT_2159 = ");";
  protected final String TEXT_2160 = NL + "\t\treturn ";
  protected final String TEXT_2161 = " != null && ((";
  protected final String TEXT_2162 = ".Unsettable)";
  protected final String TEXT_2163 = ").isSet();";
  protected final String TEXT_2164 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2165 = ");";
  protected final String TEXT_2166 = NL + "\t\treturn (";
  protected final String TEXT_2167 = " & ";
  protected final String TEXT_2168 = "_ESETFLAG) != 0;";
  protected final String TEXT_2169 = NL + "\t\treturn ";
  protected final String TEXT_2170 = "ESet;";
  protected final String TEXT_2171 = NL + "\t\treturn !((";
  protected final String TEXT_2172 = ".Internal)((";
  protected final String TEXT_2173 = ".Internal.Wrapper)get";
  protected final String TEXT_2174 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2175 = ");";
  protected final String TEXT_2176 = NL + "\t\treturn !((";
  protected final String TEXT_2177 = ".Internal)get";
  protected final String TEXT_2178 = "()).isEmpty(";
  protected final String TEXT_2179 = ");";
  protected final String TEXT_2180 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2181 = "' ";
  protected final String TEXT_2182 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2183 = NL + "\t}" + NL;
  protected final String TEXT_2184 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2185 = " ";
  protected final String TEXT_2186 = "(";
  protected final String TEXT_2187 = ")";
  protected final String TEXT_2188 = NL + "\t{";
  protected final String TEXT_2189 = NL + "\t\t";
  protected final String TEXT_2190 = "(";
  protected final String TEXT_2191 = ");";
  protected final String TEXT_2192 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2193 = NL + "\t\treturn ";
  protected final String TEXT_2194 = "(";
  protected final String TEXT_2195 = ");";
  protected final String TEXT_2196 = NL + "\t}" + NL;
  protected final String TEXT_2197 = NL + "} //";
  protected final String TEXT_2198 = NL;

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

    GenClass genClass = (GenClass)((Object[])argument)[0]; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    if (isInterface) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_7);
    } else {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_11);
    if (isInterface) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_13);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_17);
    for (Iterator i=genClass.getGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_21);
    }
    }
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_26);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_27);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_29);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_31);
    } else {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_33);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_34);
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_41);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_45);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_49);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_53);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_54);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_56);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (Iterator i = eVirtualIndexBitFields.iterator(); i.hasNext();) { String eVirtualIndexBitField = (String)i.next();
    stringBuffer.append(TEXT_57);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_58);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_60);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (Iterator i=genClass.getDeclaredFieldGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_67);
    }
    } else {
    if (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable())) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    stringBuffer.append(TEXT_76);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_78);
    }
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_85);
    } else {
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_93);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_100);
    } else {
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_104);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_106);
    for (Iterator i=genClass.getFlagGenFeatures("true").iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_109);
    }
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_112);
    }
    for (Iterator i=(isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures()).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_115);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_116);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_117);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_118);
    } else {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_123);
    } else {
    stringBuffer.append(TEXT_124);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_125);
    }
    stringBuffer.append(TEXT_126);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_128);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_130);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_132);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_136);
    }
    }
    stringBuffer.append(TEXT_137);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_146);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_149);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_151);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_154);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_157);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_158);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_160);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_161);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_162);
    }}
    stringBuffer.append(TEXT_163);
    } else {
    stringBuffer.append(TEXT_164);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_167);
    } else {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_170);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_171);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_172);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_175);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_177);
    }
    stringBuffer.append(TEXT_178);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_183);
    }
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_185);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_189);
    } else {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_194);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_197);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_203);
    }
    stringBuffer.append(TEXT_204);
    }
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_216);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_221);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_225);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_229);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_230);
    }
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_232);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_235);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_237);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_238);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(TEXT_240);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_243);
    }
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_249);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_257);
    } else {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_259);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_269);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_273);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_275);
    } else {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_280);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_282);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_284);
    } else {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_286);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_288);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_289);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_290);
    }
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_295);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    } else {
    stringBuffer.append(TEXT_299);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_300);
    }
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_304);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_306);
    }
    stringBuffer.append(TEXT_307);
    }
    }
    } else {
    stringBuffer.append(TEXT_308);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_312);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_313);
    }
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_315);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_316);
    }
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_318);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_322);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_324);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_325);
    }
    stringBuffer.append(TEXT_326);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_328);
    }
    stringBuffer.append(TEXT_329);
    }
    stringBuffer.append(TEXT_330);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_332);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_334);
    } else {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_337);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_338);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_341);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_344);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_347);
    } else {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_349);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_352);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_354);
    } else {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_358);
    }
    } else {
    stringBuffer.append(TEXT_359);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_360);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_362);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_364);
    } else {
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_367);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_368);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_374);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_375);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_381);
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_385);
    } else {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_391);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_399);
    } else {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_403);
    }
    }
    stringBuffer.append(TEXT_404);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_409);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_413);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_414);
    } else {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_416);
    }
    stringBuffer.append(TEXT_417);
    } else {
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_422);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_427);
    }
    stringBuffer.append(TEXT_428);
    stringBuffer.append(TEXT_429);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_431);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_434);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_438);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_440);
    }
    }
    stringBuffer.append(TEXT_441);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_447);
    } else {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_449);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_452);
    }
    } else {
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_455);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_456);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_463);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_466);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_468);
    }
    }
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_470);
    } else {
    stringBuffer.append(TEXT_471);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_474);
    } else {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(TEXT_479);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_490);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_493);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_495);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_497);
    }
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_499);
    }
    stringBuffer.append(TEXT_500);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_513);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_514);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_523);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_533);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_541);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_545);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_551);
    }
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_555);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_556);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_559);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_565);
    } else {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_569);
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_576);
    } else {
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_582);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_592);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_596);
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_602);
    } else {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_607);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    } else {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_616);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_620);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_622);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_632);
    }
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_636);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_637);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_638);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_639);
    }
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_642);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_644);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_645);
    } else {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_647);
    }
    stringBuffer.append(TEXT_648);
    } else {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_652);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_654);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_655);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_656);
    }
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_659);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_661);
    }
    }
    stringBuffer.append(TEXT_662);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_663);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_667);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_671);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_673);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_676);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_678);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_680);
    }
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_682);
    }
    stringBuffer.append(TEXT_683);
    } else {
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_687);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_689);
    }
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_691);
    }
    stringBuffer.append(TEXT_692);
    }
    } else {
    stringBuffer.append(TEXT_693);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_694);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_696);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_698);
    } else {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_701);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_702);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_706);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_709);
    } else {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_714);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_716);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_722);
    } else {
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_726);
    }
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_731);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_733);
    } else {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_735);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_736);
    } else {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_738);
    }
    stringBuffer.append(TEXT_739);
    } else {
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_742);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_743);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_748);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_752);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_755);
    }
    stringBuffer.append(TEXT_756);
    } else {
    stringBuffer.append(TEXT_757);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_759);
    } else {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_761);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_763);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_766);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_771);
    }
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_774);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_778);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_783);
    }
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_785);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_788);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_794);
    } else {
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_798);
    }
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_808);
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_811);
    } else {
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_815);
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_821);
    } else {
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_824);
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_826);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_829);
    } else {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_831);
    }
    }
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_835);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_837);
    } else {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_839);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_840);
    } else {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_842);
    }
    stringBuffer.append(TEXT_843);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_849);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_852);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_855);
    } else {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_857);
    }
    }
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_861);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_864);
    } else {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_867);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_868);
    } else {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_870);
    }
    stringBuffer.append(TEXT_871);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_874);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_876);
    } else {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_878);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_880);
    }
    } else {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_883);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_884);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_891);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_893);
    }
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_895);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_898);
    }
    stringBuffer.append(TEXT_899);
    } else {
    stringBuffer.append(TEXT_900);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_902);
    } else {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_904);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_906);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_911);
    }
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_915);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_917);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_920);
    } else {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_922);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_925);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_927);
    } else {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_931);
    }
    } else {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_934);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_935);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_936);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_937);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_941);
    } else {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_945);
    }
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_949);
    } else {
    stringBuffer.append(TEXT_950);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_951);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_954);
    } else {
    stringBuffer.append(TEXT_955);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_961);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_964);
    } else {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_967);
    }
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_970);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_971);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_974);
    } else {
    stringBuffer.append(TEXT_975);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_978);
    }
    stringBuffer.append(TEXT_979);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_981);
    } else {
    stringBuffer.append(TEXT_982);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_985);
    } else {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_988);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_991);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_992);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_995);
    } else {
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_998);
    }
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1000);
    }
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    if (isInterface) {
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1011);
    } else {
    stringBuffer.append(TEXT_1012);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1017);
    } else {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1031);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1033);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1034);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1037);
    } else {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1040);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1043);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1050);
    } else {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1052);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1054);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1056);
    } else {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1058);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1060);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1062);
    } else {
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1064);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1068);
    } else {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1071);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1075);
    } else {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1078);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1083);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1093);
    } else {
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1098);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1100);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1105);
    }
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1109);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1111);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1114);
    } else {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1116);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1121);
    } else {
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1125);
    }
    } else {
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1128);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1129);
    }
    //Class/genFeature.override.javajetinc
    }//for
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1130);
    if (isInterface) {
    stringBuffer.append(TEXT_1131);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1133);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1136);
    }}
    stringBuffer.append(TEXT_1137);
    } else {
    stringBuffer.append(TEXT_1138);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1143);
    } else {
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1148);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1154);
    } else {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1167);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1170);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1172);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1176);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1177);
    }
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1180);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1181);
    }
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1184);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1186);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1188);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1190);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1191);
    }
    stringBuffer.append(TEXT_1192);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1194);
    }
    stringBuffer.append(TEXT_1195);
    }
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1198);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1200);
    }
    } else {
    stringBuffer.append(TEXT_1201);
    }
    }
    stringBuffer.append(TEXT_1202);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1206);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1208);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1212);
    } else {
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1215);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1217);
    } else {
    if (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation()) {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1222);
    }
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1224);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1228);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1233);
    }
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1236);
    }
    }
    }
    stringBuffer.append(TEXT_1237);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1238);
    } else {
    stringBuffer.append(TEXT_1239);
    }
    stringBuffer.append(TEXT_1240);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1244);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1246);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1250);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1254);
    } else {
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1257);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1259);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1261);
    } else {
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1263);
    }
    }
    }
    stringBuffer.append(TEXT_1264);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1265);
    } else {
    stringBuffer.append(TEXT_1266);
    }
    stringBuffer.append(TEXT_1267);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1270);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1274);
    }
    }
    stringBuffer.append(TEXT_1275);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1276);
    } else {
    stringBuffer.append(TEXT_1277);
    }
    stringBuffer.append(TEXT_1278);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1279);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1281);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1283);
    } else {
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1286);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1289);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1293);
    } else {
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1296);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1300);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1304);
    } else {
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1306);
    }
    }
    }
    stringBuffer.append(TEXT_1307);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1308);
    } else {
    stringBuffer.append(TEXT_1309);
    }
    stringBuffer.append(TEXT_1310);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1311);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1313);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1317);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1320);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1324);
    } else {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1327);
    }
    } else {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1331);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1335);
    } else {
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1338);
    }
    stringBuffer.append(TEXT_1339);
    }
    }
    stringBuffer.append(TEXT_1340);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1341);
    } else {
    stringBuffer.append(TEXT_1342);
    }
    stringBuffer.append(TEXT_1343);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1345);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1348);
    } else {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1350);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1352);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1355);
    } else {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1358);
    }
    stringBuffer.append(TEXT_1359);
    }
    }
    stringBuffer.append(TEXT_1360);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1361);
    } else {
    stringBuffer.append(TEXT_1362);
    }
    stringBuffer.append(TEXT_1363);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(TEXT_1365);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1367);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1369);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1372);
    } else {
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1375);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1378);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1385);
    } else {
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1387);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1389);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1391);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1393);
    } else {
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1395);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1397);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1399);
    } else {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1401);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1405);
    } else {
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1408);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1412);
    } else {
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1415);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1420);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1430);
    } else {
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1435);
    }
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1436);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1437);
    } else {
    stringBuffer.append(TEXT_1438);
    }
    stringBuffer.append(TEXT_1439);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1440);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1442);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1445);
    }
    stringBuffer.append(TEXT_1446);
    }
    stringBuffer.append(TEXT_1447);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1449);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1452);
    }
    stringBuffer.append(TEXT_1453);
    }
    stringBuffer.append(TEXT_1454);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1457);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1458);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1461);
    }
    stringBuffer.append(TEXT_1462);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1465);
    }
    stringBuffer.append(TEXT_1466);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1467);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1475);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1478);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1479);
    }
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1483);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1486);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1487);
    }
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1492);
    }
    stringBuffer.append(TEXT_1493);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1496);
    } else {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1498);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1499);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1500);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1502);
    } else {
    stringBuffer.append(TEXT_1503);
    }
    stringBuffer.append(TEXT_1504);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1506);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1509);
    } else {
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1511);
    }
    stringBuffer.append(TEXT_1512);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1514);
    } else {
    stringBuffer.append(TEXT_1515);
    }
    stringBuffer.append(TEXT_1516);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1518);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1521);
    } else {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1523);
    }
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1527);
    }
    stringBuffer.append(TEXT_1528);
    if (isImplementation) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1537);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1540);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1542);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1544);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1546);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1548);
    } else {
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1551);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1555);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1556);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1558);
    } else {
    stringBuffer.append(TEXT_1559);
    }
    stringBuffer.append(TEXT_1560);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1570);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1575);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1578);
    } else {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1581);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1587);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1593);
    } else {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1602);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1606);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1610);
    } else {
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1617);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1620);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1622);
    } else {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1625);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1630);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1632);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1635);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1637);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1650);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1651);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_1654);
    } else {
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1666);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1667);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1669);
    }
    stringBuffer.append(TEXT_1670);
    }
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1675);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1676);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1677);
    }
    }
    } else {
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1680);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1683);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1686);
    } else {
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1692);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1693);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1695);
    } else {
    stringBuffer.append(TEXT_1696);
    }
    stringBuffer.append(TEXT_1697);
    }
    }
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1699);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1701);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1703);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1704);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1706);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1707);
    }
    } else {
    stringBuffer.append(TEXT_1708);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1710);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1711);
    }
    }
    } else {
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1713);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1714);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1716);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1717);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1719);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1720);
    }
    } else {
    stringBuffer.append(TEXT_1721);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1723);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1724);
    }
    }
    } else {
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1726);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1727);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1729);
    } else {
    stringBuffer.append(TEXT_1730);
    }
    }
    stringBuffer.append(TEXT_1731);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1732);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1733);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1737);
    } else {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1741);
    }
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1745);
    } else {
    stringBuffer.append(TEXT_1746);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1750);
    } else {
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1757);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1760);
    } else {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1763);
    }
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1765);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1766);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1770);
    } else {
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1774);
    }
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1777);
    } else {
    stringBuffer.append(TEXT_1778);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1781);
    } else {
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1788);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1791);
    } else {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1794);
    }
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1796);
    }
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    if (isInterface) {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1807);
    } else {
    stringBuffer.append(TEXT_1808);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1813);
    } else {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1827);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1829);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1830);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1833);
    } else {
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1836);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1839);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1846);
    } else {
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1848);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1850);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1852);
    } else {
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1854);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1856);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1858);
    } else {
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1860);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1864);
    } else {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1867);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1871);
    } else {
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1874);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1879);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1889);
    } else {
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1894);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1896);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1901);
    }
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1905);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1907);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1910);
    } else {
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1912);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1917);
    } else {
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1921);
    }
    } else {
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1924);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1925);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1928);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1930);
    } else {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_1932);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1933);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_1935);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1936);
    } else {
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1938);
    }
    }
    stringBuffer.append(TEXT_1939);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1942);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1943);
    } else {
    stringBuffer.append(TEXT_1944);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1946);
    }
    stringBuffer.append(TEXT_1947);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1953);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1954);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1959);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1961);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1963);
    }
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1965);
    } else {
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1967);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1969);
    }
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1971);
    }
    }
    stringBuffer.append(TEXT_1972);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1976);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1977);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1982);
    }
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1984);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1986);
    }
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1988);
    }
    stringBuffer.append(TEXT_1989);
    }
    stringBuffer.append(TEXT_1990);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1991);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1995);
    } else {
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1999);
    }
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2003);
    } else {
    stringBuffer.append(TEXT_2004);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2008);
    } else {
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2015);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2018);
    } else {
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2021);
    }
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2023);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2024);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2028);
    } else {
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2032);
    }
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2035);
    } else {
    stringBuffer.append(TEXT_2036);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2039);
    } else {
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_2046);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2049);
    } else {
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2052);
    }
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2054);
    }
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    if (isInterface) {
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2065);
    } else {
    stringBuffer.append(TEXT_2066);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2071);
    } else {
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2085);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2087);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2088);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2091);
    } else {
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2094);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2097);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2104);
    } else {
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2106);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2108);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2110);
    } else {
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2112);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2114);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2116);
    } else {
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2118);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2122);
    } else {
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2125);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2129);
    } else {
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2132);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2137);
    } else {
    if (genFeature.isField() && (genClass.getImplementedGenFeatures().contains(genFeature) ? genModel.isVirtualDelegation() : genFeature.getGenModel().isVirtualDelegation())) {
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2147);
    } else {
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2152);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2154);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2159);
    }
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2163);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2165);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2168);
    } else {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2170);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2175);
    } else {
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2179);
    }
    } else {
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2182);
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2183);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2188);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2191);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2192);
    } else {
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2195);
    }
    }
    stringBuffer.append(TEXT_2196);
    }
    }
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2198);
    return stringBuffer.toString();
  }
}
