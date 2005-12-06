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
  protected final String TEXT_322 = "(this)";
  protected final String TEXT_323 = ")";
  protected final String TEXT_324 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_325 = ".";
  protected final String TEXT_326 = "()";
  protected final String TEXT_327 = ";" + NL + "\t\t}";
  protected final String TEXT_328 = NL + "\t\treturn ";
  protected final String TEXT_329 = ".";
  protected final String TEXT_330 = "(this);";
  protected final String TEXT_331 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_332 = "' ";
  protected final String TEXT_333 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_334 = NL + "\t}" + NL;
  protected final String TEXT_335 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_336 = " basicGet";
  protected final String TEXT_337 = "()" + NL + "\t{";
  protected final String TEXT_338 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_339 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_340 = ")eInternalContainer();";
  protected final String TEXT_341 = NL + "\t\treturn (";
  protected final String TEXT_342 = ")eVirtualGet(";
  protected final String TEXT_343 = ");";
  protected final String TEXT_344 = NL + "\t\treturn ";
  protected final String TEXT_345 = ";";
  protected final String TEXT_346 = NL + "\t\treturn (";
  protected final String TEXT_347 = ")((";
  protected final String TEXT_348 = ".Internal.Wrapper)get";
  protected final String TEXT_349 = "()).featureMap().get(";
  protected final String TEXT_350 = ", false);";
  protected final String TEXT_351 = NL + "\t\treturn (";
  protected final String TEXT_352 = ")get";
  protected final String TEXT_353 = "().get(";
  protected final String TEXT_354 = ", false);";
  protected final String TEXT_355 = NL;
  protected final String TEXT_356 = NL + "\t\treturn ";
  protected final String TEXT_357 = ".";
  protected final String TEXT_358 = "(this);";
  protected final String TEXT_359 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_360 = "' ";
  protected final String TEXT_361 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_362 = NL + "\t}" + NL;
  protected final String TEXT_363 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_364 = " basicSet";
  protected final String TEXT_365 = "(";
  protected final String TEXT_366 = " new";
  protected final String TEXT_367 = ", ";
  protected final String TEXT_368 = " msgs)" + NL + "\t{";
  protected final String TEXT_369 = NL;
  protected final String TEXT_370 = NL + "\t\tif (new";
  protected final String TEXT_371 = " != null && !";
  protected final String TEXT_372 = "().contains(new";
  protected final String TEXT_373 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_374 = "().add(new";
  protected final String TEXT_375 = ");" + NL + "\t\t}";
  protected final String TEXT_376 = NL + "\t\tObject old";
  protected final String TEXT_377 = " = eVirtualSet(";
  protected final String TEXT_378 = ", new";
  protected final String TEXT_379 = ");";
  protected final String TEXT_380 = NL + "\t\t";
  protected final String TEXT_381 = " old";
  protected final String TEXT_382 = " = ";
  protected final String TEXT_383 = ";" + NL + "\t\t";
  protected final String TEXT_384 = " = new";
  protected final String TEXT_385 = ";";
  protected final String TEXT_386 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_387 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_388 = NL + "\t\tboolean old";
  protected final String TEXT_389 = "ESet = (";
  protected final String TEXT_390 = " & ";
  protected final String TEXT_391 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_392 = " |= ";
  protected final String TEXT_393 = "_ESETFLAG;";
  protected final String TEXT_394 = NL + "\t\tboolean old";
  protected final String TEXT_395 = "ESet = ";
  protected final String TEXT_396 = "ESet;" + NL + "\t\t";
  protected final String TEXT_397 = "ESet = true;";
  protected final String TEXT_398 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_399 = NL + "\t\t\t";
  protected final String TEXT_400 = " notification = new ";
  protected final String TEXT_401 = "(this, ";
  protected final String TEXT_402 = ".SET, ";
  protected final String TEXT_403 = ", ";
  protected final String TEXT_404 = "isSetChange ? null : old";
  protected final String TEXT_405 = "old";
  protected final String TEXT_406 = ", new";
  protected final String TEXT_407 = ", ";
  protected final String TEXT_408 = "isSetChange";
  protected final String TEXT_409 = "!old";
  protected final String TEXT_410 = "ESet";
  protected final String TEXT_411 = ");";
  protected final String TEXT_412 = NL + "\t\t\t";
  protected final String TEXT_413 = " notification = new ";
  protected final String TEXT_414 = "(this, ";
  protected final String TEXT_415 = ".SET, ";
  protected final String TEXT_416 = ", ";
  protected final String TEXT_417 = "old";
  protected final String TEXT_418 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_419 = "old";
  protected final String TEXT_420 = ", new";
  protected final String TEXT_421 = ");";
  protected final String TEXT_422 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_423 = NL;
  protected final String TEXT_424 = NL + "\t\tif (";
  protected final String TEXT_425 = " != null && ";
  protected final String TEXT_426 = " != new";
  protected final String TEXT_427 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_428 = "(null);" + NL + "\t\t}";
  protected final String TEXT_429 = NL + "\t\tif (new";
  protected final String TEXT_430 = " != null ||  old";
  protected final String TEXT_431 = " == ";
  protected final String TEXT_432 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_433 = "(new";
  protected final String TEXT_434 = ");" + NL + "\t\t}";
  protected final String TEXT_435 = NL + "\t\treturn msgs;";
  protected final String TEXT_436 = NL + "\t\treturn ((";
  protected final String TEXT_437 = ".Internal)((";
  protected final String TEXT_438 = ".Internal.Wrapper)get";
  protected final String TEXT_439 = "()).featureMap()).basicAdd(";
  protected final String TEXT_440 = ", new";
  protected final String TEXT_441 = ", msgs);";
  protected final String TEXT_442 = NL + "\t\treturn ((";
  protected final String TEXT_443 = ".Internal)get";
  protected final String TEXT_444 = "()).basicAdd(";
  protected final String TEXT_445 = ", new";
  protected final String TEXT_446 = ", msgs);";
  protected final String TEXT_447 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_448 = "' ";
  protected final String TEXT_449 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_450 = NL + "\t}" + NL;
  protected final String TEXT_451 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_452 = "#";
  protected final String TEXT_453 = " <em>";
  protected final String TEXT_454 = "</em>}' ";
  protected final String TEXT_455 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_456 = "</em>' ";
  protected final String TEXT_457 = ".";
  protected final String TEXT_458 = NL + "\t * @see ";
  protected final String TEXT_459 = NL + "\t * @see #isSet";
  protected final String TEXT_460 = "()";
  protected final String TEXT_461 = NL + "\t * @see #unset";
  protected final String TEXT_462 = "()";
  protected final String TEXT_463 = NL + "\t * @see #";
  protected final String TEXT_464 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_465 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_466 = NL + "\tvoid set";
  protected final String TEXT_467 = "(";
  protected final String TEXT_468 = " value);" + NL;
  protected final String TEXT_469 = NL + "\tpublic void set";
  protected final String TEXT_470 = "(";
  protected final String TEXT_471 = " new";
  protected final String TEXT_472 = ")" + NL + "\t{";
  protected final String TEXT_473 = NL;
  protected final String TEXT_474 = NL + "\t\tnew";
  protected final String TEXT_475 = " = new";
  protected final String TEXT_476 = " == null ? ";
  protected final String TEXT_477 = "_EDEFAULT : new";
  protected final String TEXT_478 = ";";
  protected final String TEXT_479 = NL + "\t\tif (new";
  protected final String TEXT_480 = " != null && !";
  protected final String TEXT_481 = "().contains(new";
  protected final String TEXT_482 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_483 = "().add(new";
  protected final String TEXT_484 = ");" + NL + "\t\t}";
  protected final String TEXT_485 = NL + "\t\t";
  protected final String TEXT_486 = " old";
  protected final String TEXT_487 = " = eContainer();";
  protected final String TEXT_488 = NL + "\t\teSet(";
  protected final String TEXT_489 = ", ";
  protected final String TEXT_490 = "new ";
  protected final String TEXT_491 = "(";
  protected final String TEXT_492 = "new";
  protected final String TEXT_493 = ")";
  protected final String TEXT_494 = ");";
  protected final String TEXT_495 = NL + "\t\tif (new";
  protected final String TEXT_496 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_497 = " && new";
  protected final String TEXT_498 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_499 = ".isAncestor(this, ";
  protected final String TEXT_500 = "new";
  protected final String TEXT_501 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_502 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_503 = NL + "\t\t\t";
  protected final String TEXT_504 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_505 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_506 = ")new";
  protected final String TEXT_507 = ").eInverseAdd(this, ";
  protected final String TEXT_508 = ", ";
  protected final String TEXT_509 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_510 = ")new";
  protected final String TEXT_511 = ", ";
  protected final String TEXT_512 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_513 = "(this, ";
  protected final String TEXT_514 = ".SET, ";
  protected final String TEXT_515 = ", new";
  protected final String TEXT_516 = ", new";
  protected final String TEXT_517 = "));";
  protected final String TEXT_518 = NL + "\t\t";
  protected final String TEXT_519 = " ";
  protected final String TEXT_520 = " = (";
  protected final String TEXT_521 = ")eVirtualGet(";
  protected final String TEXT_522 = ");";
  protected final String TEXT_523 = NL + "\t\tif (new";
  protected final String TEXT_524 = " != ";
  protected final String TEXT_525 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_526 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_527 = " != null)";
  protected final String TEXT_528 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_529 = ")";
  protected final String TEXT_530 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_531 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_532 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_533 = ")new";
  protected final String TEXT_534 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_535 = ", null, msgs);";
  protected final String TEXT_536 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_537 = ")";
  protected final String TEXT_538 = ").eInverseRemove(this, ";
  protected final String TEXT_539 = ", ";
  protected final String TEXT_540 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_541 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_542 = ")new";
  protected final String TEXT_543 = ").eInverseAdd(this, ";
  protected final String TEXT_544 = ", ";
  protected final String TEXT_545 = ".class, msgs);";
  protected final String TEXT_546 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_547 = "(";
  protected final String TEXT_548 = "new";
  protected final String TEXT_549 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_550 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_551 = NL + "\t\t\tboolean old";
  protected final String TEXT_552 = "ESet = eVirtualIsSet(";
  protected final String TEXT_553 = ");";
  protected final String TEXT_554 = NL + "\t\t\tboolean old";
  protected final String TEXT_555 = "ESet = (";
  protected final String TEXT_556 = " & ";
  protected final String TEXT_557 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_558 = " |= ";
  protected final String TEXT_559 = "_ESETFLAG;";
  protected final String TEXT_560 = NL + "\t\t\tboolean old";
  protected final String TEXT_561 = "ESet = ";
  protected final String TEXT_562 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_563 = "ESet = true;";
  protected final String TEXT_564 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_565 = "(this, ";
  protected final String TEXT_566 = ".SET, ";
  protected final String TEXT_567 = ", new";
  protected final String TEXT_568 = ", new";
  protected final String TEXT_569 = ", !old";
  protected final String TEXT_570 = "ESet));" + NL + "    \t}";
  protected final String TEXT_571 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_572 = "(this, ";
  protected final String TEXT_573 = ".SET, ";
  protected final String TEXT_574 = ", new";
  protected final String TEXT_575 = ", new";
  protected final String TEXT_576 = "));";
  protected final String TEXT_577 = NL + "\t\t";
  protected final String TEXT_578 = " old";
  protected final String TEXT_579 = " = (";
  protected final String TEXT_580 = " & ";
  protected final String TEXT_581 = "_EFLAG) != 0;" + NL + "\t\tif (new";
  protected final String TEXT_582 = ") ";
  protected final String TEXT_583 = " |= ";
  protected final String TEXT_584 = "_EFLAG; else ";
  protected final String TEXT_585 = " &= ~";
  protected final String TEXT_586 = "_EFLAG;";
  protected final String TEXT_587 = NL + "\t\t";
  protected final String TEXT_588 = " old";
  protected final String TEXT_589 = " = ";
  protected final String TEXT_590 = ";";
  protected final String TEXT_591 = NL + "\t\t";
  protected final String TEXT_592 = " ";
  protected final String TEXT_593 = " = new";
  protected final String TEXT_594 = " == null ? ";
  protected final String TEXT_595 = "_EDEFAULT : new";
  protected final String TEXT_596 = ";";
  protected final String TEXT_597 = NL + "\t\t";
  protected final String TEXT_598 = " = new";
  protected final String TEXT_599 = " == null ? ";
  protected final String TEXT_600 = "_EDEFAULT : new";
  protected final String TEXT_601 = ";";
  protected final String TEXT_602 = NL + "\t\t";
  protected final String TEXT_603 = " ";
  protected final String TEXT_604 = " = ";
  protected final String TEXT_605 = "new";
  protected final String TEXT_606 = ";";
  protected final String TEXT_607 = NL + "\t\t";
  protected final String TEXT_608 = " = ";
  protected final String TEXT_609 = "new";
  protected final String TEXT_610 = ";";
  protected final String TEXT_611 = NL + "\t\tObject old";
  protected final String TEXT_612 = " = eVirtualSet(";
  protected final String TEXT_613 = ", ";
  protected final String TEXT_614 = ");";
  protected final String TEXT_615 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_616 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_617 = NL + "\t\tboolean old";
  protected final String TEXT_618 = "ESet = (";
  protected final String TEXT_619 = " & ";
  protected final String TEXT_620 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_621 = " |= ";
  protected final String TEXT_622 = "_ESETFLAG;";
  protected final String TEXT_623 = NL + "\t\tboolean old";
  protected final String TEXT_624 = "ESet = ";
  protected final String TEXT_625 = "ESet;" + NL + "\t\t";
  protected final String TEXT_626 = "ESet = true;";
  protected final String TEXT_627 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_628 = "(this, ";
  protected final String TEXT_629 = ".SET, ";
  protected final String TEXT_630 = ", ";
  protected final String TEXT_631 = "isSetChange ? ";
  protected final String TEXT_632 = "null";
  protected final String TEXT_633 = "_EDEFAULT";
  protected final String TEXT_634 = " : old";
  protected final String TEXT_635 = "old";
  protected final String TEXT_636 = ", ";
  protected final String TEXT_637 = "new";
  protected final String TEXT_638 = ", ";
  protected final String TEXT_639 = "isSetChange";
  protected final String TEXT_640 = "!old";
  protected final String TEXT_641 = "ESet";
  protected final String TEXT_642 = "));";
  protected final String TEXT_643 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_644 = "(this, ";
  protected final String TEXT_645 = ".SET, ";
  protected final String TEXT_646 = ", ";
  protected final String TEXT_647 = "old";
  protected final String TEXT_648 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_649 = "null";
  protected final String TEXT_650 = "_EDEFAULT";
  protected final String TEXT_651 = " : old";
  protected final String TEXT_652 = "old";
  protected final String TEXT_653 = ", ";
  protected final String TEXT_654 = "new";
  protected final String TEXT_655 = "));";
  protected final String TEXT_656 = NL;
  protected final String TEXT_657 = NL + "\t\tif (";
  protected final String TEXT_658 = " != null && ";
  protected final String TEXT_659 = " != new";
  protected final String TEXT_660 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_661 = "(null);" + NL + "\t\t}";
  protected final String TEXT_662 = NL + "\t\tif (new";
  protected final String TEXT_663 = " != null || old";
  protected final String TEXT_664 = " == ";
  protected final String TEXT_665 = ")" + NL + "\t\t{" + NL + "\t\t\tset";
  protected final String TEXT_666 = "(new";
  protected final String TEXT_667 = ");" + NL + "\t\t}";
  protected final String TEXT_668 = NL + "\t\t((";
  protected final String TEXT_669 = ".Internal)((";
  protected final String TEXT_670 = ".Internal.Wrapper)get";
  protected final String TEXT_671 = "()).featureMap()).set(";
  protected final String TEXT_672 = ", ";
  protected final String TEXT_673 = "new ";
  protected final String TEXT_674 = "(";
  protected final String TEXT_675 = "new";
  protected final String TEXT_676 = ")";
  protected final String TEXT_677 = ");";
  protected final String TEXT_678 = NL + "\t\t((";
  protected final String TEXT_679 = ".Internal)get";
  protected final String TEXT_680 = "()).set(";
  protected final String TEXT_681 = ", ";
  protected final String TEXT_682 = "new ";
  protected final String TEXT_683 = "(";
  protected final String TEXT_684 = "new";
  protected final String TEXT_685 = ")";
  protected final String TEXT_686 = ");";
  protected final String TEXT_687 = NL;
  protected final String TEXT_688 = NL + "\t\t";
  protected final String TEXT_689 = ".";
  protected final String TEXT_690 = "(this, ";
  protected final String TEXT_691 = ");";
  protected final String TEXT_692 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_693 = "' ";
  protected final String TEXT_694 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_695 = NL + "\t}" + NL;
  protected final String TEXT_696 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_697 = " basicUnset";
  protected final String TEXT_698 = "(";
  protected final String TEXT_699 = " msgs)" + NL + "\t{";
  protected final String TEXT_700 = NL + "\t\tObject old";
  protected final String TEXT_701 = " = eVirtualUnset(";
  protected final String TEXT_702 = ");";
  protected final String TEXT_703 = NL + "\t\t";
  protected final String TEXT_704 = " old";
  protected final String TEXT_705 = " = ";
  protected final String TEXT_706 = ";" + NL + "\t\t";
  protected final String TEXT_707 = " = null;";
  protected final String TEXT_708 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_709 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_710 = NL + "\t\tboolean old";
  protected final String TEXT_711 = "ESet = (";
  protected final String TEXT_712 = " & ";
  protected final String TEXT_713 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_714 = " &= ~";
  protected final String TEXT_715 = "_ESETFLAG;";
  protected final String TEXT_716 = NL + "\t\tboolean old";
  protected final String TEXT_717 = "ESet = ";
  protected final String TEXT_718 = "ESet;" + NL + "\t\t";
  protected final String TEXT_719 = "ESet = false;";
  protected final String TEXT_720 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_721 = " notification = new ";
  protected final String TEXT_722 = "(this, ";
  protected final String TEXT_723 = ".UNSET, ";
  protected final String TEXT_724 = ", ";
  protected final String TEXT_725 = "isSetChange ? old";
  protected final String TEXT_726 = " : null";
  protected final String TEXT_727 = "old";
  protected final String TEXT_728 = ", null, ";
  protected final String TEXT_729 = "isSetChange";
  protected final String TEXT_730 = "old";
  protected final String TEXT_731 = "ESet";
  protected final String TEXT_732 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_733 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_734 = "' ";
  protected final String TEXT_735 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_736 = NL + "\t}" + NL;
  protected final String TEXT_737 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_738 = "#";
  protected final String TEXT_739 = " <em>";
  protected final String TEXT_740 = "</em>}' ";
  protected final String TEXT_741 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_742 = NL + "\t * @see #isSet";
  protected final String TEXT_743 = "()";
  protected final String TEXT_744 = NL + "\t * @see #";
  protected final String TEXT_745 = "()";
  protected final String TEXT_746 = NL + "\t * @see #set";
  protected final String TEXT_747 = "(";
  protected final String TEXT_748 = ")";
  protected final String TEXT_749 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_750 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_751 = NL + "\tvoid unset";
  protected final String TEXT_752 = "();" + NL;
  protected final String TEXT_753 = NL + "\tpublic void unset";
  protected final String TEXT_754 = "()" + NL + "\t{";
  protected final String TEXT_755 = NL + "\t\teUnset(";
  protected final String TEXT_756 = ");";
  protected final String TEXT_757 = NL + "\t\t((";
  protected final String TEXT_758 = ".Unsettable)get";
  protected final String TEXT_759 = "()).unset();";
  protected final String TEXT_760 = NL + "\t\t";
  protected final String TEXT_761 = " ";
  protected final String TEXT_762 = " = (";
  protected final String TEXT_763 = ")eVirtualGet(";
  protected final String TEXT_764 = ");";
  protected final String TEXT_765 = NL + "\t\tif (";
  protected final String TEXT_766 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_767 = " msgs = null;";
  protected final String TEXT_768 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_769 = ")";
  protected final String TEXT_770 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_771 = ", null, msgs);";
  protected final String TEXT_772 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_773 = ")";
  protected final String TEXT_774 = ").eInverseRemove(this, ";
  protected final String TEXT_775 = ", ";
  protected final String TEXT_776 = ".class, msgs);";
  protected final String TEXT_777 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_778 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_779 = NL + "\t\t\tboolean old";
  protected final String TEXT_780 = "ESet = eVirtualIsSet(";
  protected final String TEXT_781 = ");";
  protected final String TEXT_782 = NL + "\t\t\tboolean old";
  protected final String TEXT_783 = "ESet = (";
  protected final String TEXT_784 = " & ";
  protected final String TEXT_785 = "_ESETFLAG) != 0;" + NL + "\t\t\t";
  protected final String TEXT_786 = " &= ~";
  protected final String TEXT_787 = "_ESETFLAG;";
  protected final String TEXT_788 = NL + "\t\t\tboolean old";
  protected final String TEXT_789 = "ESet = ";
  protected final String TEXT_790 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_791 = "ESet = false;";
  protected final String TEXT_792 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_793 = "(this, ";
  protected final String TEXT_794 = ".UNSET, ";
  protected final String TEXT_795 = ", null, null, old";
  protected final String TEXT_796 = "ESet));" + NL + "    \t}";
  protected final String TEXT_797 = NL + "\t\t";
  protected final String TEXT_798 = " old";
  protected final String TEXT_799 = " = (";
  protected final String TEXT_800 = " & ";
  protected final String TEXT_801 = "_EFLAG) != 0;";
  protected final String TEXT_802 = NL + "\t\tObject old";
  protected final String TEXT_803 = " = eVirtualUnset(";
  protected final String TEXT_804 = ");";
  protected final String TEXT_805 = NL + "\t\t";
  protected final String TEXT_806 = " old";
  protected final String TEXT_807 = " = ";
  protected final String TEXT_808 = ";";
  protected final String TEXT_809 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_810 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_811 = NL + "\t\tboolean old";
  protected final String TEXT_812 = "ESet = (";
  protected final String TEXT_813 = " & ";
  protected final String TEXT_814 = "_ESETFLAG) != 0;";
  protected final String TEXT_815 = NL + "\t\tboolean old";
  protected final String TEXT_816 = "ESet = ";
  protected final String TEXT_817 = "ESet;";
  protected final String TEXT_818 = NL + "\t\t";
  protected final String TEXT_819 = " = null;";
  protected final String TEXT_820 = NL + "\t\t";
  protected final String TEXT_821 = " &= ~";
  protected final String TEXT_822 = "_ESETFLAG;";
  protected final String TEXT_823 = NL + "\t\t";
  protected final String TEXT_824 = "ESet = false;";
  protected final String TEXT_825 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_826 = "(this, ";
  protected final String TEXT_827 = ".UNSET, ";
  protected final String TEXT_828 = ", ";
  protected final String TEXT_829 = "isSetChange ? old";
  protected final String TEXT_830 = " : null";
  protected final String TEXT_831 = "old";
  protected final String TEXT_832 = ", null, ";
  protected final String TEXT_833 = "isSetChange";
  protected final String TEXT_834 = "old";
  protected final String TEXT_835 = "ESet";
  protected final String TEXT_836 = "));";
  protected final String TEXT_837 = NL + "\t\tif (";
  protected final String TEXT_838 = "_EDEFAULT) ";
  protected final String TEXT_839 = " |= ";
  protected final String TEXT_840 = "_EFLAG; else ";
  protected final String TEXT_841 = " &= ~";
  protected final String TEXT_842 = "_EFLAG;";
  protected final String TEXT_843 = NL + "\t\t";
  protected final String TEXT_844 = " = ";
  protected final String TEXT_845 = "_EDEFAULT;";
  protected final String TEXT_846 = NL + "\t\t";
  protected final String TEXT_847 = " &= ~";
  protected final String TEXT_848 = "_ESETFLAG;";
  protected final String TEXT_849 = NL + "\t\t";
  protected final String TEXT_850 = "ESet = false;";
  protected final String TEXT_851 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_852 = "(this, ";
  protected final String TEXT_853 = ".UNSET, ";
  protected final String TEXT_854 = ", ";
  protected final String TEXT_855 = "isSetChange ? old";
  protected final String TEXT_856 = " : ";
  protected final String TEXT_857 = "_EDEFAULT";
  protected final String TEXT_858 = "old";
  protected final String TEXT_859 = ", ";
  protected final String TEXT_860 = "_EDEFAULT, ";
  protected final String TEXT_861 = "isSetChange";
  protected final String TEXT_862 = "old";
  protected final String TEXT_863 = "ESet";
  protected final String TEXT_864 = "));";
  protected final String TEXT_865 = NL + "\t\t((";
  protected final String TEXT_866 = ".Internal)((";
  protected final String TEXT_867 = ".Internal.Wrapper)get";
  protected final String TEXT_868 = "()).featureMap()).clear(";
  protected final String TEXT_869 = ");";
  protected final String TEXT_870 = NL + "\t\t((";
  protected final String TEXT_871 = ".Internal)get";
  protected final String TEXT_872 = "()).clear(";
  protected final String TEXT_873 = ");";
  protected final String TEXT_874 = NL;
  protected final String TEXT_875 = NL + "\t\t";
  protected final String TEXT_876 = ".";
  protected final String TEXT_877 = "(this);";
  protected final String TEXT_878 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_879 = "' ";
  protected final String TEXT_880 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_881 = NL + "\t}" + NL;
  protected final String TEXT_882 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_883 = "#";
  protected final String TEXT_884 = " <em>";
  protected final String TEXT_885 = "</em>}' ";
  protected final String TEXT_886 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_887 = "</em>' ";
  protected final String TEXT_888 = " is set.";
  protected final String TEXT_889 = NL + "\t * @see #unset";
  protected final String TEXT_890 = "()";
  protected final String TEXT_891 = NL + "\t * @see #";
  protected final String TEXT_892 = "()";
  protected final String TEXT_893 = NL + "\t * @see #set";
  protected final String TEXT_894 = "(";
  protected final String TEXT_895 = ")";
  protected final String TEXT_896 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_897 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_898 = NL + "\tboolean isSet";
  protected final String TEXT_899 = "();" + NL;
  protected final String TEXT_900 = NL + "\tpublic boolean isSet";
  protected final String TEXT_901 = "()" + NL + "\t{";
  protected final String TEXT_902 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_903 = ");";
  protected final String TEXT_904 = NL + "\t\t";
  protected final String TEXT_905 = " ";
  protected final String TEXT_906 = " = (";
  protected final String TEXT_907 = ")eVirtualGet(";
  protected final String TEXT_908 = ");";
  protected final String TEXT_909 = NL + "\t\treturn ";
  protected final String TEXT_910 = " != null && ((";
  protected final String TEXT_911 = ".Unsettable)";
  protected final String TEXT_912 = ").isSet();";
  protected final String TEXT_913 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_914 = ");";
  protected final String TEXT_915 = NL + "\t\treturn (";
  protected final String TEXT_916 = " & ";
  protected final String TEXT_917 = "_ESETFLAG) != 0;";
  protected final String TEXT_918 = NL + "\t\treturn ";
  protected final String TEXT_919 = "ESet;";
  protected final String TEXT_920 = NL + "\t\treturn !((";
  protected final String TEXT_921 = ".Internal)((";
  protected final String TEXT_922 = ".Internal.Wrapper)get";
  protected final String TEXT_923 = "()).featureMap()).isEmpty(";
  protected final String TEXT_924 = ");";
  protected final String TEXT_925 = NL + "\t\treturn !((";
  protected final String TEXT_926 = ".Internal)get";
  protected final String TEXT_927 = "()).isEmpty(";
  protected final String TEXT_928 = ");";
  protected final String TEXT_929 = NL;
  protected final String TEXT_930 = NL + "\t\treturn ";
  protected final String TEXT_931 = ".";
  protected final String TEXT_932 = "(this);";
  protected final String TEXT_933 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_934 = "' ";
  protected final String TEXT_935 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_936 = NL + "\t}" + NL;
  protected final String TEXT_937 = NL;
  protected final String TEXT_938 = NL + "\t/**";
  protected final String TEXT_939 = NL + "\t * Creates a {@link ";
  protected final String TEXT_940 = "} and appends it to the '<em><b>";
  protected final String TEXT_941 = "</b></em>' ";
  protected final String TEXT_942 = ".";
  protected final String TEXT_943 = NL + "\t * Creates a {@link ";
  protected final String TEXT_944 = "} and sets the '<em><b>";
  protected final String TEXT_945 = "</b></em>' ";
  protected final String TEXT_946 = ".";
  protected final String TEXT_947 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_948 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_949 = "}." + NL + "\t * @see #";
  protected final String TEXT_950 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_951 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_952 = NL + "\t";
  protected final String TEXT_953 = " create";
  protected final String TEXT_954 = "(";
  protected final String TEXT_955 = " eClass);" + NL;
  protected final String TEXT_956 = NL + "\tpublic ";
  protected final String TEXT_957 = " create";
  protected final String TEXT_958 = "(";
  protected final String TEXT_959 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_960 = " new";
  protected final String TEXT_961 = " = (";
  protected final String TEXT_962 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_963 = NL + "\t\t";
  protected final String TEXT_964 = "().add(new";
  protected final String TEXT_965 = ");";
  protected final String TEXT_966 = NL + "\t\tset";
  protected final String TEXT_967 = "(new";
  protected final String TEXT_968 = ");";
  protected final String TEXT_969 = NL + "\t\treturn new";
  protected final String TEXT_970 = ";" + NL + "\t}" + NL;
  protected final String TEXT_971 = NL + "\t/**";
  protected final String TEXT_972 = NL + "\t * Creates a {@link ";
  protected final String TEXT_973 = "} and appends it to the '<em><b>";
  protected final String TEXT_974 = "</b></em>' ";
  protected final String TEXT_975 = ".";
  protected final String TEXT_976 = NL + "\t * Creates a {@link ";
  protected final String TEXT_977 = "} and sets the '<em><b>";
  protected final String TEXT_978 = "</b></em>' ";
  protected final String TEXT_979 = ".";
  protected final String TEXT_980 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The new {@link ";
  protected final String TEXT_981 = "}." + NL + "\t * @see #";
  protected final String TEXT_982 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_983 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_984 = NL + "\t";
  protected final String TEXT_985 = " create";
  protected final String TEXT_986 = "();" + NL;
  protected final String TEXT_987 = NL + "\tpublic ";
  protected final String TEXT_988 = " create";
  protected final String TEXT_989 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_990 = " new";
  protected final String TEXT_991 = " = ";
  protected final String TEXT_992 = ".eINSTANCE.create";
  protected final String TEXT_993 = "();";
  protected final String TEXT_994 = NL + "\t\t";
  protected final String TEXT_995 = "().add(new";
  protected final String TEXT_996 = ");";
  protected final String TEXT_997 = NL + "\t\tset";
  protected final String TEXT_998 = "(new";
  protected final String TEXT_999 = ");";
  protected final String TEXT_1000 = NL + "\t\treturn new";
  protected final String TEXT_1001 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1002 = NL + "\t/**" + NL + "\t * Retrieves the {@link ";
  protected final String TEXT_1003 = "} with the specified '<em><b>";
  protected final String TEXT_1004 = "</b></em>' from the '<em><b>";
  protected final String TEXT_1005 = "</b></em>' ";
  protected final String TEXT_1006 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_1007 = " The '<em><b>";
  protected final String TEXT_1008 = "</b></em>' of the {@link ";
  protected final String TEXT_1009 = "} to retrieve." + NL + "\t * @return The {@link ";
  protected final String TEXT_1010 = "} with the specified '<em><b>";
  protected final String TEXT_1011 = "</b></em>', or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1012 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1013 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1014 = NL + "\t";
  protected final String TEXT_1015 = " get";
  protected final String TEXT_1016 = "(";
  protected final String TEXT_1017 = " ";
  protected final String TEXT_1018 = ");" + NL;
  protected final String TEXT_1019 = NL + "\tpublic ";
  protected final String TEXT_1020 = " get";
  protected final String TEXT_1021 = "(";
  protected final String TEXT_1022 = " ";
  protected final String TEXT_1023 = ")" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_1024 = " i = ";
  protected final String TEXT_1025 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1026 = " ";
  protected final String TEXT_1027 = " = (";
  protected final String TEXT_1028 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1029 = ".equals(";
  protected final String TEXT_1030 = ".";
  protected final String TEXT_1031 = "()))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1032 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1033 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1034 = "()" + NL + "\t{";
  protected final String TEXT_1035 = NL + "  \t\treturn false;";
  protected final String TEXT_1036 = NL + "\t\treturn !((";
  protected final String TEXT_1037 = ".Internal.Wrapper)";
  protected final String TEXT_1038 = "()).featureMap().isEmpty();";
  protected final String TEXT_1039 = NL + "\t\treturn ";
  protected final String TEXT_1040 = " != null && !";
  protected final String TEXT_1041 = ".featureMap().isEmpty();";
  protected final String TEXT_1042 = NL + "\t\treturn ";
  protected final String TEXT_1043 = " != null && !";
  protected final String TEXT_1044 = ".isEmpty();";
  protected final String TEXT_1045 = NL + "\t\t";
  protected final String TEXT_1046 = " ";
  protected final String TEXT_1047 = " = (";
  protected final String TEXT_1048 = ")eVirtualGet(";
  protected final String TEXT_1049 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1050 = " != null && !";
  protected final String TEXT_1051 = ".isEmpty();";
  protected final String TEXT_1052 = NL + "\t\treturn !";
  protected final String TEXT_1053 = "().isEmpty();";
  protected final String TEXT_1054 = NL + "\t\treturn ";
  protected final String TEXT_1055 = " != null;";
  protected final String TEXT_1056 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1057 = ") != null;";
  protected final String TEXT_1058 = NL + "\t\treturn basicGet";
  protected final String TEXT_1059 = "() != null;";
  protected final String TEXT_1060 = NL + "\t\treturn ";
  protected final String TEXT_1061 = " != null;";
  protected final String TEXT_1062 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1063 = ") != null;";
  protected final String TEXT_1064 = NL + "\t\treturn ";
  protected final String TEXT_1065 = "() != null;";
  protected final String TEXT_1066 = NL + "\t\treturn ((";
  protected final String TEXT_1067 = " & ";
  protected final String TEXT_1068 = "_EFLAG) != 0) != ";
  protected final String TEXT_1069 = "_EDEFAULT;";
  protected final String TEXT_1070 = NL + "\t\treturn ";
  protected final String TEXT_1071 = " != ";
  protected final String TEXT_1072 = "_EDEFAULT;";
  protected final String TEXT_1073 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1074 = ", ";
  protected final String TEXT_1075 = "_EDEFAULT) != ";
  protected final String TEXT_1076 = "_EDEFAULT;";
  protected final String TEXT_1077 = NL + "\t\treturn ";
  protected final String TEXT_1078 = "() != ";
  protected final String TEXT_1079 = "_EDEFAULT;";
  protected final String TEXT_1080 = NL + "\t\treturn ";
  protected final String TEXT_1081 = "_EDEFAULT == null ? ";
  protected final String TEXT_1082 = " != null : !";
  protected final String TEXT_1083 = "_EDEFAULT.equals(";
  protected final String TEXT_1084 = ");";
  protected final String TEXT_1085 = NL + "\t\t";
  protected final String TEXT_1086 = " ";
  protected final String TEXT_1087 = " = (";
  protected final String TEXT_1088 = ")eVirtualGet(";
  protected final String TEXT_1089 = ", ";
  protected final String TEXT_1090 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1091 = "_EDEFAULT == null ? ";
  protected final String TEXT_1092 = " != null : !";
  protected final String TEXT_1093 = "_EDEFAULT.equals(";
  protected final String TEXT_1094 = ");";
  protected final String TEXT_1095 = NL + "\t\treturn ";
  protected final String TEXT_1096 = "_EDEFAULT == null ? ";
  protected final String TEXT_1097 = "() != null : !";
  protected final String TEXT_1098 = "_EDEFAULT.equals(";
  protected final String TEXT_1099 = "());";
  protected final String TEXT_1100 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1101 = ");";
  protected final String TEXT_1102 = NL + "\t\t";
  protected final String TEXT_1103 = " ";
  protected final String TEXT_1104 = " = (";
  protected final String TEXT_1105 = ")eVirtualGet(";
  protected final String TEXT_1106 = ");";
  protected final String TEXT_1107 = NL + "\t\treturn ";
  protected final String TEXT_1108 = " != null && ((";
  protected final String TEXT_1109 = ".Unsettable)";
  protected final String TEXT_1110 = ").isSet();";
  protected final String TEXT_1111 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1112 = ");";
  protected final String TEXT_1113 = NL + "\t\treturn (";
  protected final String TEXT_1114 = " & ";
  protected final String TEXT_1115 = "_ESETFLAG) != 0;";
  protected final String TEXT_1116 = NL + "\t\treturn ";
  protected final String TEXT_1117 = "ESet;";
  protected final String TEXT_1118 = NL + "\t\treturn !((";
  protected final String TEXT_1119 = ".Internal)((";
  protected final String TEXT_1120 = ".Internal.Wrapper)get";
  protected final String TEXT_1121 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1122 = ");";
  protected final String TEXT_1123 = NL + "\t\treturn !((";
  protected final String TEXT_1124 = ".Internal)get";
  protected final String TEXT_1125 = "()).isEmpty(";
  protected final String TEXT_1126 = ");";
  protected final String TEXT_1127 = NL;
  protected final String TEXT_1128 = NL + "\t\treturn ";
  protected final String TEXT_1129 = ".";
  protected final String TEXT_1130 = "(this);";
  protected final String TEXT_1131 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1132 = "' ";
  protected final String TEXT_1133 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1134 = NL + "\t}" + NL;
  protected final String TEXT_1135 = NL;
  protected final String TEXT_1136 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1137 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1138 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1139 = NL + "\t * @model ";
  protected final String TEXT_1140 = NL + "\t *        ";
  protected final String TEXT_1141 = NL + "\t * @model";
  protected final String TEXT_1142 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1143 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1144 = NL + "\t";
  protected final String TEXT_1145 = " ";
  protected final String TEXT_1146 = "(";
  protected final String TEXT_1147 = ")";
  protected final String TEXT_1148 = ";" + NL;
  protected final String TEXT_1149 = NL + "\tpublic ";
  protected final String TEXT_1150 = " ";
  protected final String TEXT_1151 = "(";
  protected final String TEXT_1152 = ")";
  protected final String TEXT_1153 = NL + "\t{";
  protected final String TEXT_1154 = NL + "\t\t";
  protected final String TEXT_1155 = NL + "\t\treturn ";
  protected final String TEXT_1156 = ".";
  protected final String TEXT_1157 = "(this, ";
  protected final String TEXT_1158 = ", ";
  protected final String TEXT_1159 = ");";
  protected final String TEXT_1160 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1161 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1162 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1163 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1164 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1165 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1166 = ".";
  protected final String TEXT_1167 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1168 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1169 = "\", ";
  protected final String TEXT_1170 = ".getObjectLabel(this, ";
  protected final String TEXT_1171 = ") }),";
  protected final String TEXT_1172 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1173 = NL + "\t\t";
  protected final String TEXT_1174 = ".";
  protected final String TEXT_1175 = "(this";
  protected final String TEXT_1176 = ", ";
  protected final String TEXT_1177 = ");";
  protected final String TEXT_1178 = NL + "\t\t";
  protected final String TEXT_1179 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1180 = " result = (";
  protected final String TEXT_1181 = ") cache.get(";
  protected final String TEXT_1182 = "eResource(), ";
  protected final String TEXT_1183 = "this, ";
  protected final String TEXT_1184 = ".getEOperations().get(";
  protected final String TEXT_1185 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1186 = "eResource(), ";
  protected final String TEXT_1187 = "this, ";
  protected final String TEXT_1188 = ".getEOperations().get(";
  protected final String TEXT_1189 = "), result = ";
  protected final String TEXT_1190 = "new ";
  protected final String TEXT_1191 = "(";
  protected final String TEXT_1192 = ".";
  protected final String TEXT_1193 = "(this";
  protected final String TEXT_1194 = ", ";
  protected final String TEXT_1195 = ")";
  protected final String TEXT_1196 = ")";
  protected final String TEXT_1197 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1198 = ".";
  protected final String TEXT_1199 = "()";
  protected final String TEXT_1200 = ";" + NL + "\t\t}";
  protected final String TEXT_1201 = NL + "\t\treturn ";
  protected final String TEXT_1202 = ".";
  protected final String TEXT_1203 = "(this";
  protected final String TEXT_1204 = ", ";
  protected final String TEXT_1205 = ");";
  protected final String TEXT_1206 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1207 = NL + "\t}" + NL;
  protected final String TEXT_1208 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1209 = " eInverseAdd(";
  protected final String TEXT_1210 = " otherEnd, int featureID, ";
  protected final String TEXT_1211 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1212 = NL + "\t\t\tcase ";
  protected final String TEXT_1213 = ":";
  protected final String TEXT_1214 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1215 = ")((";
  protected final String TEXT_1216 = ".InternalMapView)";
  protected final String TEXT_1217 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1218 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1219 = ")";
  protected final String TEXT_1220 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1221 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1222 = ", msgs);";
  protected final String TEXT_1223 = NL + "\t\t\t\t";
  protected final String TEXT_1224 = " ";
  protected final String TEXT_1225 = " = (";
  protected final String TEXT_1226 = ")eVirtualGet(";
  protected final String TEXT_1227 = ");";
  protected final String TEXT_1228 = NL + "\t\t\t\tif (";
  protected final String TEXT_1229 = " != null)";
  protected final String TEXT_1230 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1231 = ")";
  protected final String TEXT_1232 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1233 = ", null, msgs);";
  protected final String TEXT_1234 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1235 = ")";
  protected final String TEXT_1236 = ").eInverseRemove(this, ";
  protected final String TEXT_1237 = ", ";
  protected final String TEXT_1238 = ".class, msgs);";
  protected final String TEXT_1239 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1240 = "((";
  protected final String TEXT_1241 = ")otherEnd, msgs);";
  protected final String TEXT_1242 = NL + "\t\t}";
  protected final String TEXT_1243 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1244 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1245 = NL + "\t}" + NL;
  protected final String TEXT_1246 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1247 = " eInverseRemove(";
  protected final String TEXT_1248 = " otherEnd, int featureID, ";
  protected final String TEXT_1249 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1250 = NL + "\t\t\tcase ";
  protected final String TEXT_1251 = ":";
  protected final String TEXT_1252 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1253 = ")((";
  protected final String TEXT_1254 = ".InternalMapView)";
  protected final String TEXT_1255 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1256 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1257 = ")((";
  protected final String TEXT_1258 = ".Internal.Wrapper)";
  protected final String TEXT_1259 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1260 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1261 = ")";
  protected final String TEXT_1262 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1263 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1264 = ", msgs);";
  protected final String TEXT_1265 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1266 = "(msgs);";
  protected final String TEXT_1267 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1268 = "(null, msgs);";
  protected final String TEXT_1269 = NL + "\t\t}";
  protected final String TEXT_1270 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1271 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1272 = NL + "\t}" + NL;
  protected final String TEXT_1273 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1274 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1275 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1276 = NL + "\t\t\tcase ";
  protected final String TEXT_1277 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1278 = ", ";
  protected final String TEXT_1279 = ".class, msgs);";
  protected final String TEXT_1280 = NL + "\t\t}";
  protected final String TEXT_1281 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1282 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1283 = NL + "\t}" + NL;
  protected final String TEXT_1284 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1285 = NL + "\t\t\tcase ";
  protected final String TEXT_1286 = ":";
  protected final String TEXT_1287 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1288 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1289 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1290 = "(";
  protected final String TEXT_1291 = "());";
  protected final String TEXT_1292 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1293 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1294 = "();";
  protected final String TEXT_1295 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1296 = ".InternalMapView)";
  protected final String TEXT_1297 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1298 = "();";
  protected final String TEXT_1299 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1300 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1301 = "().map();";
  protected final String TEXT_1302 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1303 = ".Internal.Wrapper)";
  protected final String TEXT_1304 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1305 = "();";
  protected final String TEXT_1306 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1307 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1308 = ".Internal)";
  protected final String TEXT_1309 = "()).getWrapper();";
  protected final String TEXT_1310 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1311 = "();";
  protected final String TEXT_1312 = NL + "\t\t}";
  protected final String TEXT_1313 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1314 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1315 = NL + "\t}" + NL;
  protected final String TEXT_1316 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1317 = NL + "\t\t\tcase ";
  protected final String TEXT_1318 = ":";
  protected final String TEXT_1319 = NL + "\t\t\t\t((";
  protected final String TEXT_1320 = ".Internal)((";
  protected final String TEXT_1321 = ".Internal.Wrapper)";
  protected final String TEXT_1322 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1323 = NL + "\t\t\t\t((";
  protected final String TEXT_1324 = ".Internal)";
  protected final String TEXT_1325 = "()).set(newValue);";
  protected final String TEXT_1326 = NL + "\t\t\t\t((";
  protected final String TEXT_1327 = ".Setting)((";
  protected final String TEXT_1328 = ".InternalMapView)";
  protected final String TEXT_1329 = "()).eMap()).set(newValue);";
  protected final String TEXT_1330 = NL + "\t\t\t\t((";
  protected final String TEXT_1331 = ".Setting)";
  protected final String TEXT_1332 = "()).set(newValue);";
  protected final String TEXT_1333 = NL + "\t\t\t\t";
  protected final String TEXT_1334 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1335 = "().addAll((";
  protected final String TEXT_1336 = ")newValue);";
  protected final String TEXT_1337 = NL + "\t\t\t\tset";
  protected final String TEXT_1338 = "(((";
  protected final String TEXT_1339 = ")newValue).";
  protected final String TEXT_1340 = "());";
  protected final String TEXT_1341 = NL + "\t\t\t\tset";
  protected final String TEXT_1342 = "((";
  protected final String TEXT_1343 = ")newValue);";
  protected final String TEXT_1344 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1345 = NL + "\t\t}";
  protected final String TEXT_1346 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1347 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1348 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1349 = NL + "\t\t\tcase ";
  protected final String TEXT_1350 = ":";
  protected final String TEXT_1351 = NL + "\t\t\t\t((";
  protected final String TEXT_1352 = ".Internal.Wrapper)";
  protected final String TEXT_1353 = "()).featureMap().clear();";
  protected final String TEXT_1354 = NL + "\t\t\t\t";
  protected final String TEXT_1355 = "().clear();";
  protected final String TEXT_1356 = NL + "\t\t\t\tunset";
  protected final String TEXT_1357 = "();";
  protected final String TEXT_1358 = NL + "\t\t\t\tset";
  protected final String TEXT_1359 = "((";
  protected final String TEXT_1360 = ")null);";
  protected final String TEXT_1361 = NL + "\t\t\t\tset";
  protected final String TEXT_1362 = "(";
  protected final String TEXT_1363 = "_EDEFAULT);";
  protected final String TEXT_1364 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1365 = NL + "\t\t}";
  protected final String TEXT_1366 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1367 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1368 = NL + "\t}" + NL;
  protected final String TEXT_1369 = NL;
  protected final String TEXT_1370 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1371 = NL + "\t\t\tcase ";
  protected final String TEXT_1372 = ":";
  protected final String TEXT_1373 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1374 = "();";
  protected final String TEXT_1375 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1376 = ".Internal.Wrapper)";
  protected final String TEXT_1377 = "()).featureMap().isEmpty();";
  protected final String TEXT_1378 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1379 = " != null && !";
  protected final String TEXT_1380 = ".featureMap().isEmpty();";
  protected final String TEXT_1381 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1382 = " != null && !";
  protected final String TEXT_1383 = ".isEmpty();";
  protected final String TEXT_1384 = NL + "\t\t\t\t";
  protected final String TEXT_1385 = " ";
  protected final String TEXT_1386 = " = (";
  protected final String TEXT_1387 = ")eVirtualGet(";
  protected final String TEXT_1388 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1389 = " != null && !";
  protected final String TEXT_1390 = ".isEmpty();";
  protected final String TEXT_1391 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1392 = "().isEmpty();";
  protected final String TEXT_1393 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1394 = "();";
  protected final String TEXT_1395 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1396 = " != null;";
  protected final String TEXT_1397 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1398 = ") != null;";
  protected final String TEXT_1399 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1400 = "() != null;";
  protected final String TEXT_1401 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1402 = " != null;";
  protected final String TEXT_1403 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1404 = ") != null;";
  protected final String TEXT_1405 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1406 = "() != null;";
  protected final String TEXT_1407 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1408 = " & ";
  protected final String TEXT_1409 = "_EFLAG) != 0) != ";
  protected final String TEXT_1410 = "_EDEFAULT;";
  protected final String TEXT_1411 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1412 = " != ";
  protected final String TEXT_1413 = "_EDEFAULT;";
  protected final String TEXT_1414 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1415 = ", ";
  protected final String TEXT_1416 = "_EDEFAULT) != ";
  protected final String TEXT_1417 = "_EDEFAULT;";
  protected final String TEXT_1418 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1419 = "() != ";
  protected final String TEXT_1420 = "_EDEFAULT;";
  protected final String TEXT_1421 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1422 = "_EDEFAULT == null ? ";
  protected final String TEXT_1423 = " != null : !";
  protected final String TEXT_1424 = "_EDEFAULT.equals(";
  protected final String TEXT_1425 = ");";
  protected final String TEXT_1426 = NL + "\t\t\t\t";
  protected final String TEXT_1427 = " ";
  protected final String TEXT_1428 = " = (";
  protected final String TEXT_1429 = ")eVirtualGet(";
  protected final String TEXT_1430 = ", ";
  protected final String TEXT_1431 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1432 = "_EDEFAULT == null ? ";
  protected final String TEXT_1433 = " != null : !";
  protected final String TEXT_1434 = "_EDEFAULT.equals(";
  protected final String TEXT_1435 = ");";
  protected final String TEXT_1436 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1437 = "_EDEFAULT == null ? ";
  protected final String TEXT_1438 = "() != null : !";
  protected final String TEXT_1439 = "_EDEFAULT.equals(";
  protected final String TEXT_1440 = "());";
  protected final String TEXT_1441 = NL + "\t\t}";
  protected final String TEXT_1442 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1443 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1444 = NL + "\t}" + NL;
  protected final String TEXT_1445 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1446 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1447 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1448 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1449 = ": return ";
  protected final String TEXT_1450 = ";";
  protected final String TEXT_1451 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1452 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1453 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1454 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1455 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1456 = ": return ";
  protected final String TEXT_1457 = ";";
  protected final String TEXT_1458 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1459 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1460 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1461 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1462 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1463 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1464 = NL + "\t\t\tcase ";
  protected final String TEXT_1465 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1466 = ";";
  protected final String TEXT_1467 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1468 = NL + "\t\t\tcase ";
  protected final String TEXT_1469 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1470 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1471 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1472 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1473 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1474 = ": \");";
  protected final String TEXT_1475 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1476 = ": \");";
  protected final String TEXT_1477 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1478 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1479 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1480 = NL + "\t\tif (";
  protected final String TEXT_1481 = "(";
  protected final String TEXT_1482 = " & ";
  protected final String TEXT_1483 = "_ESETFLAG) != 0";
  protected final String TEXT_1484 = "ESet";
  protected final String TEXT_1485 = ") result.append((";
  protected final String TEXT_1486 = " & ";
  protected final String TEXT_1487 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1488 = NL + "\t\tif (";
  protected final String TEXT_1489 = "(";
  protected final String TEXT_1490 = " & ";
  protected final String TEXT_1491 = "_ESETFLAG) != 0";
  protected final String TEXT_1492 = "ESet";
  protected final String TEXT_1493 = ") result.append(";
  protected final String TEXT_1494 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1495 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1496 = ", ";
  protected final String TEXT_1497 = "_EDEFAULT";
  protected final String TEXT_1498 = "));";
  protected final String TEXT_1499 = NL + "\t\tresult.append((";
  protected final String TEXT_1500 = " & ";
  protected final String TEXT_1501 = "_EFLAG) != 0);";
  protected final String TEXT_1502 = NL + "\t\tresult.append(";
  protected final String TEXT_1503 = ");";
  protected final String TEXT_1504 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1505 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1506 = NL + "\t\treturn new ";
  protected final String TEXT_1507 = "(getTypedKey());";
  protected final String TEXT_1508 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1509 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1510 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1511 = ")key);";
  protected final String TEXT_1512 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1513 = ")key).";
  protected final String TEXT_1514 = "());";
  protected final String TEXT_1515 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1516 = ")key);";
  protected final String TEXT_1517 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1518 = NL + "\t\treturn new ";
  protected final String TEXT_1519 = "(getTypedValue());";
  protected final String TEXT_1520 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1521 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1522 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1523 = ")value);";
  protected final String TEXT_1524 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1525 = ")value).";
  protected final String TEXT_1526 = "());";
  protected final String TEXT_1527 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1528 = ")value);";
  protected final String TEXT_1529 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1530 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1531 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1532 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1533 = NL;
  protected final String TEXT_1534 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1535 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1536 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1537 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_1538 = " i = eAdapters().iterator(); i.hasNext();)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1539 = " adapter = (";
  protected final String TEXT_1540 = ") i.next();" + NL + "\t\t\tif (adapter instanceof ";
  protected final String TEXT_1541 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\treturn (";
  protected final String TEXT_1542 = ") adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1543 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1544 = " basicGet";
  protected final String TEXT_1545 = "()" + NL + "\t{";
  protected final String TEXT_1546 = NL + "\t\tif (isSet";
  protected final String TEXT_1547 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1548 = "basicGet";
  protected final String TEXT_1549 = "();" + NL + "\t\t}";
  protected final String TEXT_1550 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1551 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1552 = "basicGet";
  protected final String TEXT_1553 = "();" + NL + "\t\t}";
  protected final String TEXT_1554 = NL + "\t\t";
  protected final String TEXT_1555 = " ";
  protected final String TEXT_1556 = " = ";
  protected final String TEXT_1557 = "basicGet";
  protected final String TEXT_1558 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1559 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1560 = ";" + NL + "\t\t}";
  protected final String TEXT_1561 = NL + "\t\treturn ";
  protected final String TEXT_1562 = "super.basicGet";
  protected final String TEXT_1563 = "()";
  protected final String TEXT_1564 = "null";
  protected final String TEXT_1565 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1566 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1567 = " ";
  protected final String TEXT_1568 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1569 = " ";
  protected final String TEXT_1570 = " = basicGet";
  protected final String TEXT_1571 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1572 = " == null ? null : (";
  protected final String TEXT_1573 = ")eResolveProxy((";
  protected final String TEXT_1574 = ")";
  protected final String TEXT_1575 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1576 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1577 = " ";
  protected final String TEXT_1578 = "Helper(";
  protected final String TEXT_1579 = " ";
  protected final String TEXT_1580 = ")" + NL + "\t{";
  protected final String TEXT_1581 = NL + "\t\t";
  protected final String TEXT_1582 = ".addAll(super.";
  protected final String TEXT_1583 = "());";
  protected final String TEXT_1584 = NL + "\t\tsuper.";
  protected final String TEXT_1585 = "Helper(";
  protected final String TEXT_1586 = ");";
  protected final String TEXT_1587 = NL + "\t\tif (isSet";
  protected final String TEXT_1588 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1589 = " i = ((";
  protected final String TEXT_1590 = ") ";
  protected final String TEXT_1591 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1592 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1593 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1594 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1595 = " i = ((";
  protected final String TEXT_1596 = ") ";
  protected final String TEXT_1597 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1598 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1599 = NL + "\t\t";
  protected final String TEXT_1600 = " ";
  protected final String TEXT_1601 = " = ";
  protected final String TEXT_1602 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1603 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_1604 = " i = ((";
  protected final String TEXT_1605 = ") ";
  protected final String TEXT_1606 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1607 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1608 = NL + "\t\tif (isSet";
  protected final String TEXT_1609 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1610 = ".addAll(";
  protected final String TEXT_1611 = "());" + NL + "\t\t}";
  protected final String TEXT_1612 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1613 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1614 = ".addAll(";
  protected final String TEXT_1615 = "());" + NL + "\t\t}";
  protected final String TEXT_1616 = NL + "\t\t";
  protected final String TEXT_1617 = " ";
  protected final String TEXT_1618 = " = ";
  protected final String TEXT_1619 = "();" + NL + "\t\tif (!";
  protected final String TEXT_1620 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1621 = ".addAll(";
  protected final String TEXT_1622 = ");" + NL + "\t\t}";
  protected final String TEXT_1623 = NL + "\t\tif (isSet";
  protected final String TEXT_1624 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1625 = ".add(";
  protected final String TEXT_1626 = "basicGet";
  protected final String TEXT_1627 = "());" + NL + "\t\t}";
  protected final String TEXT_1628 = NL + "\t\t";
  protected final String TEXT_1629 = " ";
  protected final String TEXT_1630 = " = ";
  protected final String TEXT_1631 = "basicGet";
  protected final String TEXT_1632 = "();" + NL + "\t\tif (";
  protected final String TEXT_1633 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1634 = ".add(";
  protected final String TEXT_1635 = ");" + NL + "\t\t}";
  protected final String TEXT_1636 = NL + "\t\treturn ";
  protected final String TEXT_1637 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1638 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1639 = " ";
  protected final String TEXT_1640 = "()" + NL + "\t{";
  protected final String TEXT_1641 = NL + "\t\t";
  protected final String TEXT_1642 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_1643 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1644 = " method = getClass().getMethod(\"";
  protected final String TEXT_1645 = "\", null);";
  protected final String TEXT_1646 = NL + "\t\t\t\t";
  protected final String TEXT_1647 = " ";
  protected final String TEXT_1648 = " = (";
  protected final String TEXT_1649 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_1650 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1651 = " union = ";
  protected final String TEXT_1652 = "Helper(new ";
  protected final String TEXT_1653 = "());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_1654 = " = new ";
  protected final String TEXT_1655 = "(this, ";
  protected final String TEXT_1656 = "null";
  protected final String TEXT_1657 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1658 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1659 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_1660 = NL + "\t\t\t";
  protected final String TEXT_1661 = " ";
  protected final String TEXT_1662 = " = (";
  protected final String TEXT_1663 = ") cache.get(eResource(), this, ";
  protected final String TEXT_1664 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_1665 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1666 = " union = ";
  protected final String TEXT_1667 = "Helper(new ";
  protected final String TEXT_1668 = "());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_1669 = ", ";
  protected final String TEXT_1670 = " = new ";
  protected final String TEXT_1671 = "(this, ";
  protected final String TEXT_1672 = "null";
  protected final String TEXT_1673 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_1674 = ";";
  protected final String TEXT_1675 = NL + "\t\t}";
  protected final String TEXT_1676 = NL + "\t\t";
  protected final String TEXT_1677 = " union = ";
  protected final String TEXT_1678 = "Helper(new ";
  protected final String TEXT_1679 = "());" + NL + "\t\treturn new ";
  protected final String TEXT_1680 = "(this, ";
  protected final String TEXT_1681 = "null";
  protected final String TEXT_1682 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_1683 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1684 = " ";
  protected final String TEXT_1685 = "()" + NL + "\t{";
  protected final String TEXT_1686 = NL + "\t\tif (isSet";
  protected final String TEXT_1687 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1688 = "();" + NL + "\t\t}";
  protected final String TEXT_1689 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1690 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1691 = "();" + NL + "\t\t}";
  protected final String TEXT_1692 = NL + "\t\t";
  protected final String TEXT_1693 = " ";
  protected final String TEXT_1694 = " = ";
  protected final String TEXT_1695 = "();" + NL + "\t\tif (";
  protected final String TEXT_1696 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1697 = ";" + NL + "\t\t}";
  protected final String TEXT_1698 = NL + "\t\treturn ";
  protected final String TEXT_1699 = "super.";
  protected final String TEXT_1700 = "()";
  protected final String TEXT_1701 = "null";
  protected final String TEXT_1702 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1703 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1704 = "()" + NL + "\t{";
  protected final String TEXT_1705 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1706 = "()";
  protected final String TEXT_1707 = NL + "\t\treturn isSet";
  protected final String TEXT_1708 = "()";
  protected final String TEXT_1709 = ";";
  protected final String TEXT_1710 = NL + "\t\treturn !";
  protected final String TEXT_1711 = "().isEmpty()";
  protected final String TEXT_1712 = ";";
  protected final String TEXT_1713 = NL + "\t\treturn ";
  protected final String TEXT_1714 = "basicGet";
  protected final String TEXT_1715 = "() != null";
  protected final String TEXT_1716 = ";";
  protected final String TEXT_1717 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1718 = ")";
  protected final String TEXT_1719 = ";";
  protected final String TEXT_1720 = NL + "\t\t\t|| isSet";
  protected final String TEXT_1721 = "()";
  protected final String TEXT_1722 = ";";
  protected final String TEXT_1723 = NL + "\t\t\t|| !";
  protected final String TEXT_1724 = "().isEmpty()";
  protected final String TEXT_1725 = ";";
  protected final String TEXT_1726 = NL + "\t\t\t|| ";
  protected final String TEXT_1727 = "basicGet";
  protected final String TEXT_1728 = "() != null";
  protected final String TEXT_1729 = ";";
  protected final String TEXT_1730 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_1731 = ")";
  protected final String TEXT_1732 = ";";
  protected final String TEXT_1733 = NL + "\t\treturn super.isSet";
  protected final String TEXT_1734 = "();";
  protected final String TEXT_1735 = NL + "\t\treturn false;";
  protected final String TEXT_1736 = NL + "\t}" + NL;
  protected final String TEXT_1737 = NL;
  protected final String TEXT_1738 = NL + "\t/**";
  protected final String TEXT_1739 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1740 = "} and appends it to the '<em><b>";
  protected final String TEXT_1741 = "</b></em>' ";
  protected final String TEXT_1742 = ".";
  protected final String TEXT_1743 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1744 = "} and sets the '<em><b>";
  protected final String TEXT_1745 = "</b></em>' ";
  protected final String TEXT_1746 = ".";
  protected final String TEXT_1747 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1748 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1749 = "}." + NL + "\t * @see #";
  protected final String TEXT_1750 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1751 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1752 = NL + "\t";
  protected final String TEXT_1753 = " create";
  protected final String TEXT_1754 = "(";
  protected final String TEXT_1755 = " eClass);" + NL;
  protected final String TEXT_1756 = NL + "\tpublic ";
  protected final String TEXT_1757 = " create";
  protected final String TEXT_1758 = "(";
  protected final String TEXT_1759 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1760 = " new";
  protected final String TEXT_1761 = " = (";
  protected final String TEXT_1762 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_1763 = NL + "\t\t";
  protected final String TEXT_1764 = "().add(new";
  protected final String TEXT_1765 = ");";
  protected final String TEXT_1766 = NL + "\t\tset";
  protected final String TEXT_1767 = "(new";
  protected final String TEXT_1768 = ");";
  protected final String TEXT_1769 = NL + "\t\treturn new";
  protected final String TEXT_1770 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1771 = NL + "\t/**";
  protected final String TEXT_1772 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1773 = "} and appends it to the '<em><b>";
  protected final String TEXT_1774 = "</b></em>' ";
  protected final String TEXT_1775 = ".";
  protected final String TEXT_1776 = NL + "\t * Creates a {@link ";
  protected final String TEXT_1777 = "} and sets the '<em><b>";
  protected final String TEXT_1778 = "</b></em>' ";
  protected final String TEXT_1779 = ".";
  protected final String TEXT_1780 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The new {@link ";
  protected final String TEXT_1781 = "}." + NL + "\t * @see #";
  protected final String TEXT_1782 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1783 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1784 = NL + "\t";
  protected final String TEXT_1785 = " create";
  protected final String TEXT_1786 = "();" + NL;
  protected final String TEXT_1787 = NL + "\tpublic ";
  protected final String TEXT_1788 = " create";
  protected final String TEXT_1789 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1790 = " new";
  protected final String TEXT_1791 = " = ";
  protected final String TEXT_1792 = ".eINSTANCE.create";
  protected final String TEXT_1793 = "();";
  protected final String TEXT_1794 = NL + "\t\t";
  protected final String TEXT_1795 = "().add(new";
  protected final String TEXT_1796 = ");";
  protected final String TEXT_1797 = NL + "\t\tset";
  protected final String TEXT_1798 = "(new";
  protected final String TEXT_1799 = ");";
  protected final String TEXT_1800 = NL + "\t\treturn new";
  protected final String TEXT_1801 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1802 = NL + "\t/**" + NL + "\t * Retrieves the {@link ";
  protected final String TEXT_1803 = "} with the specified '<em><b>";
  protected final String TEXT_1804 = "</b></em>' from the '<em><b>";
  protected final String TEXT_1805 = "</b></em>' ";
  protected final String TEXT_1806 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_1807 = " The '<em><b>";
  protected final String TEXT_1808 = "</b></em>' of the {@link ";
  protected final String TEXT_1809 = "} to retrieve." + NL + "\t * @return The {@link ";
  protected final String TEXT_1810 = "} with the specified '<em><b>";
  protected final String TEXT_1811 = "</b></em>', or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1812 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1813 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1814 = NL + "\t";
  protected final String TEXT_1815 = " get";
  protected final String TEXT_1816 = "(";
  protected final String TEXT_1817 = " ";
  protected final String TEXT_1818 = ");" + NL;
  protected final String TEXT_1819 = NL + "\tpublic ";
  protected final String TEXT_1820 = " get";
  protected final String TEXT_1821 = "(";
  protected final String TEXT_1822 = " ";
  protected final String TEXT_1823 = ")" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_1824 = " i = ";
  protected final String TEXT_1825 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1826 = " ";
  protected final String TEXT_1827 = " = (";
  protected final String TEXT_1828 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_1829 = ".equals(";
  protected final String TEXT_1830 = ".";
  protected final String TEXT_1831 = "()))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1832 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_1833 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1834 = "()" + NL + "\t{";
  protected final String TEXT_1835 = NL + "  \t\treturn false;";
  protected final String TEXT_1836 = NL + "\t\treturn !((";
  protected final String TEXT_1837 = ".Internal.Wrapper)";
  protected final String TEXT_1838 = "()).featureMap().isEmpty();";
  protected final String TEXT_1839 = NL + "\t\treturn ";
  protected final String TEXT_1840 = " != null && !";
  protected final String TEXT_1841 = ".featureMap().isEmpty();";
  protected final String TEXT_1842 = NL + "\t\treturn ";
  protected final String TEXT_1843 = " != null && !";
  protected final String TEXT_1844 = ".isEmpty();";
  protected final String TEXT_1845 = NL + "\t\t";
  protected final String TEXT_1846 = " ";
  protected final String TEXT_1847 = " = (";
  protected final String TEXT_1848 = ")eVirtualGet(";
  protected final String TEXT_1849 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1850 = " != null && !";
  protected final String TEXT_1851 = ".isEmpty();";
  protected final String TEXT_1852 = NL + "\t\treturn !";
  protected final String TEXT_1853 = "().isEmpty();";
  protected final String TEXT_1854 = NL + "\t\treturn ";
  protected final String TEXT_1855 = " != null;";
  protected final String TEXT_1856 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1857 = ") != null;";
  protected final String TEXT_1858 = NL + "\t\treturn basicGet";
  protected final String TEXT_1859 = "() != null;";
  protected final String TEXT_1860 = NL + "\t\treturn ";
  protected final String TEXT_1861 = " != null;";
  protected final String TEXT_1862 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1863 = ") != null;";
  protected final String TEXT_1864 = NL + "\t\treturn ";
  protected final String TEXT_1865 = "() != null;";
  protected final String TEXT_1866 = NL + "\t\treturn ((";
  protected final String TEXT_1867 = " & ";
  protected final String TEXT_1868 = "_EFLAG) != 0) != ";
  protected final String TEXT_1869 = "_EDEFAULT;";
  protected final String TEXT_1870 = NL + "\t\treturn ";
  protected final String TEXT_1871 = " != ";
  protected final String TEXT_1872 = "_EDEFAULT;";
  protected final String TEXT_1873 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1874 = ", ";
  protected final String TEXT_1875 = "_EDEFAULT) != ";
  protected final String TEXT_1876 = "_EDEFAULT;";
  protected final String TEXT_1877 = NL + "\t\treturn ";
  protected final String TEXT_1878 = "() != ";
  protected final String TEXT_1879 = "_EDEFAULT;";
  protected final String TEXT_1880 = NL + "\t\treturn ";
  protected final String TEXT_1881 = "_EDEFAULT == null ? ";
  protected final String TEXT_1882 = " != null : !";
  protected final String TEXT_1883 = "_EDEFAULT.equals(";
  protected final String TEXT_1884 = ");";
  protected final String TEXT_1885 = NL + "\t\t";
  protected final String TEXT_1886 = " ";
  protected final String TEXT_1887 = " = (";
  protected final String TEXT_1888 = ")eVirtualGet(";
  protected final String TEXT_1889 = ", ";
  protected final String TEXT_1890 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1891 = "_EDEFAULT == null ? ";
  protected final String TEXT_1892 = " != null : !";
  protected final String TEXT_1893 = "_EDEFAULT.equals(";
  protected final String TEXT_1894 = ");";
  protected final String TEXT_1895 = NL + "\t\treturn ";
  protected final String TEXT_1896 = "_EDEFAULT == null ? ";
  protected final String TEXT_1897 = "() != null : !";
  protected final String TEXT_1898 = "_EDEFAULT.equals(";
  protected final String TEXT_1899 = "());";
  protected final String TEXT_1900 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1901 = ");";
  protected final String TEXT_1902 = NL + "\t\t";
  protected final String TEXT_1903 = " ";
  protected final String TEXT_1904 = " = (";
  protected final String TEXT_1905 = ")eVirtualGet(";
  protected final String TEXT_1906 = ");";
  protected final String TEXT_1907 = NL + "\t\treturn ";
  protected final String TEXT_1908 = " != null && ((";
  protected final String TEXT_1909 = ".Unsettable)";
  protected final String TEXT_1910 = ").isSet();";
  protected final String TEXT_1911 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1912 = ");";
  protected final String TEXT_1913 = NL + "\t\treturn (";
  protected final String TEXT_1914 = " & ";
  protected final String TEXT_1915 = "_ESETFLAG) != 0;";
  protected final String TEXT_1916 = NL + "\t\treturn ";
  protected final String TEXT_1917 = "ESet;";
  protected final String TEXT_1918 = NL + "\t\treturn !((";
  protected final String TEXT_1919 = ".Internal)((";
  protected final String TEXT_1920 = ".Internal.Wrapper)get";
  protected final String TEXT_1921 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1922 = ");";
  protected final String TEXT_1923 = NL + "\t\treturn !((";
  protected final String TEXT_1924 = ".Internal)get";
  protected final String TEXT_1925 = "()).isEmpty(";
  protected final String TEXT_1926 = ");";
  protected final String TEXT_1927 = NL;
  protected final String TEXT_1928 = NL + "\t\treturn ";
  protected final String TEXT_1929 = ".";
  protected final String TEXT_1930 = "(this);";
  protected final String TEXT_1931 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1932 = "' ";
  protected final String TEXT_1933 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1934 = NL + "\t}" + NL;
  protected final String TEXT_1935 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1936 = " ";
  protected final String TEXT_1937 = "()" + NL + "\t{";
  protected final String TEXT_1938 = NL + "\t\treturn ";
  protected final String TEXT_1939 = "();";
  protected final String TEXT_1940 = NL + "\t\treturn new ";
  protected final String TEXT_1941 = ".UnmodifiableEList(this, ";
  protected final String TEXT_1942 = "null";
  protected final String TEXT_1943 = ", 0, ";
  protected final String TEXT_1944 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_1945 = NL + "\t\treturn null;";
  protected final String TEXT_1946 = NL + "\t\treturn ";
  protected final String TEXT_1947 = "();";
  protected final String TEXT_1948 = NL + "\t}" + NL;
  protected final String TEXT_1949 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1950 = " basicGet";
  protected final String TEXT_1951 = "()" + NL + "\t{";
  protected final String TEXT_1952 = NL + "\t\treturn null;";
  protected final String TEXT_1953 = NL + "\t\treturn ";
  protected final String TEXT_1954 = "basicGet";
  protected final String TEXT_1955 = "();";
  protected final String TEXT_1956 = NL + "\t}" + NL;
  protected final String TEXT_1957 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1958 = " basicSet";
  protected final String TEXT_1959 = "(";
  protected final String TEXT_1960 = " new";
  protected final String TEXT_1961 = ", ";
  protected final String TEXT_1962 = " msgs)" + NL + "\t{";
  protected final String TEXT_1963 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1964 = NL + "\t\tif (new";
  protected final String TEXT_1965 = " != null && !(new";
  protected final String TEXT_1966 = " instanceof ";
  protected final String TEXT_1967 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1968 = "));" + NL + "\t\t}";
  protected final String TEXT_1969 = NL + "\t\treturn basicSet";
  protected final String TEXT_1970 = "(";
  protected final String TEXT_1971 = "(";
  protected final String TEXT_1972 = ") ";
  protected final String TEXT_1973 = "new";
  protected final String TEXT_1974 = ", msgs);";
  protected final String TEXT_1975 = NL + "\t\tset";
  protected final String TEXT_1976 = "(";
  protected final String TEXT_1977 = "(";
  protected final String TEXT_1978 = ") ";
  protected final String TEXT_1979 = "new";
  protected final String TEXT_1980 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_1981 = NL + "\t}" + NL;
  protected final String TEXT_1982 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1983 = "(";
  protected final String TEXT_1984 = " new";
  protected final String TEXT_1985 = ")" + NL + "\t{";
  protected final String TEXT_1986 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1987 = NL + "\t\tif (new";
  protected final String TEXT_1988 = " != null && !(new";
  protected final String TEXT_1989 = " instanceof ";
  protected final String TEXT_1990 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_1991 = "));" + NL + "\t\t}";
  protected final String TEXT_1992 = NL + "\t\tset";
  protected final String TEXT_1993 = "(";
  protected final String TEXT_1994 = "(";
  protected final String TEXT_1995 = ") ";
  protected final String TEXT_1996 = "new";
  protected final String TEXT_1997 = ");";
  protected final String TEXT_1998 = NL + "\t}" + NL;
  protected final String TEXT_1999 = NL;
  protected final String TEXT_2000 = NL + "\t/**";
  protected final String TEXT_2001 = NL + "\t * Creates a {@link ";
  protected final String TEXT_2002 = "} and appends it to the '<em><b>";
  protected final String TEXT_2003 = "</b></em>' ";
  protected final String TEXT_2004 = ".";
  protected final String TEXT_2005 = NL + "\t * Creates a {@link ";
  protected final String TEXT_2006 = "} and sets the '<em><b>";
  protected final String TEXT_2007 = "</b></em>' ";
  protected final String TEXT_2008 = ".";
  protected final String TEXT_2009 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2010 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2011 = "}." + NL + "\t * @see #";
  protected final String TEXT_2012 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2013 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2014 = NL + "\t";
  protected final String TEXT_2015 = " create";
  protected final String TEXT_2016 = "(";
  protected final String TEXT_2017 = " eClass);" + NL;
  protected final String TEXT_2018 = NL + "\tpublic ";
  protected final String TEXT_2019 = " create";
  protected final String TEXT_2020 = "(";
  protected final String TEXT_2021 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2022 = " new";
  protected final String TEXT_2023 = " = (";
  protected final String TEXT_2024 = ") eClass.getEPackage().getEFactoryInstance().create(eClass);";
  protected final String TEXT_2025 = NL + "\t\t";
  protected final String TEXT_2026 = "().add(new";
  protected final String TEXT_2027 = ");";
  protected final String TEXT_2028 = NL + "\t\tset";
  protected final String TEXT_2029 = "(new";
  protected final String TEXT_2030 = ");";
  protected final String TEXT_2031 = NL + "\t\treturn new";
  protected final String TEXT_2032 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2033 = NL + "\t/**";
  protected final String TEXT_2034 = NL + "\t * Creates a {@link ";
  protected final String TEXT_2035 = "} and appends it to the '<em><b>";
  protected final String TEXT_2036 = "</b></em>' ";
  protected final String TEXT_2037 = ".";
  protected final String TEXT_2038 = NL + "\t * Creates a {@link ";
  protected final String TEXT_2039 = "} and sets the '<em><b>";
  protected final String TEXT_2040 = "</b></em>' ";
  protected final String TEXT_2041 = ".";
  protected final String TEXT_2042 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The new {@link ";
  protected final String TEXT_2043 = "}." + NL + "\t * @see #";
  protected final String TEXT_2044 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2045 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2046 = NL + "\t";
  protected final String TEXT_2047 = " create";
  protected final String TEXT_2048 = "();" + NL;
  protected final String TEXT_2049 = NL + "\tpublic ";
  protected final String TEXT_2050 = " create";
  protected final String TEXT_2051 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2052 = " new";
  protected final String TEXT_2053 = " = ";
  protected final String TEXT_2054 = ".eINSTANCE.create";
  protected final String TEXT_2055 = "();";
  protected final String TEXT_2056 = NL + "\t\t";
  protected final String TEXT_2057 = "().add(new";
  protected final String TEXT_2058 = ");";
  protected final String TEXT_2059 = NL + "\t\tset";
  protected final String TEXT_2060 = "(new";
  protected final String TEXT_2061 = ");";
  protected final String TEXT_2062 = NL + "\t\treturn new";
  protected final String TEXT_2063 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2064 = NL + "\t/**" + NL + "\t * Retrieves the {@link ";
  protected final String TEXT_2065 = "} with the specified '<em><b>";
  protected final String TEXT_2066 = "</b></em>' from the '<em><b>";
  protected final String TEXT_2067 = "</b></em>' ";
  protected final String TEXT_2068 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_2069 = " The '<em><b>";
  protected final String TEXT_2070 = "</b></em>' of the {@link ";
  protected final String TEXT_2071 = "} to retrieve." + NL + "\t * @return The {@link ";
  protected final String TEXT_2072 = "} with the specified '<em><b>";
  protected final String TEXT_2073 = "</b></em>', or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2074 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2075 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2076 = NL + "\t";
  protected final String TEXT_2077 = " get";
  protected final String TEXT_2078 = "(";
  protected final String TEXT_2079 = " ";
  protected final String TEXT_2080 = ");" + NL;
  protected final String TEXT_2081 = NL + "\tpublic ";
  protected final String TEXT_2082 = " get";
  protected final String TEXT_2083 = "(";
  protected final String TEXT_2084 = " ";
  protected final String TEXT_2085 = ")" + NL + "\t{" + NL + "\t\tfor (";
  protected final String TEXT_2086 = " i = ";
  protected final String TEXT_2087 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2088 = " ";
  protected final String TEXT_2089 = " = (";
  protected final String TEXT_2090 = ") i.next();" + NL + "\t\t\tif (";
  protected final String TEXT_2091 = ".equals(";
  protected final String TEXT_2092 = ".";
  protected final String TEXT_2093 = "()))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2094 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_2095 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2096 = "()" + NL + "\t{";
  protected final String TEXT_2097 = NL + "  \t\treturn false;";
  protected final String TEXT_2098 = NL + "\t\treturn !((";
  protected final String TEXT_2099 = ".Internal.Wrapper)";
  protected final String TEXT_2100 = "()).featureMap().isEmpty();";
  protected final String TEXT_2101 = NL + "\t\treturn ";
  protected final String TEXT_2102 = " != null && !";
  protected final String TEXT_2103 = ".featureMap().isEmpty();";
  protected final String TEXT_2104 = NL + "\t\treturn ";
  protected final String TEXT_2105 = " != null && !";
  protected final String TEXT_2106 = ".isEmpty();";
  protected final String TEXT_2107 = NL + "\t\t";
  protected final String TEXT_2108 = " ";
  protected final String TEXT_2109 = " = (";
  protected final String TEXT_2110 = ")eVirtualGet(";
  protected final String TEXT_2111 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2112 = " != null && !";
  protected final String TEXT_2113 = ".isEmpty();";
  protected final String TEXT_2114 = NL + "\t\treturn !";
  protected final String TEXT_2115 = "().isEmpty();";
  protected final String TEXT_2116 = NL + "\t\treturn ";
  protected final String TEXT_2117 = " != null;";
  protected final String TEXT_2118 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2119 = ") != null;";
  protected final String TEXT_2120 = NL + "\t\treturn basicGet";
  protected final String TEXT_2121 = "() != null;";
  protected final String TEXT_2122 = NL + "\t\treturn ";
  protected final String TEXT_2123 = " != null;";
  protected final String TEXT_2124 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2125 = ") != null;";
  protected final String TEXT_2126 = NL + "\t\treturn ";
  protected final String TEXT_2127 = "() != null;";
  protected final String TEXT_2128 = NL + "\t\treturn ((";
  protected final String TEXT_2129 = " & ";
  protected final String TEXT_2130 = "_EFLAG) != 0) != ";
  protected final String TEXT_2131 = "_EDEFAULT;";
  protected final String TEXT_2132 = NL + "\t\treturn ";
  protected final String TEXT_2133 = " != ";
  protected final String TEXT_2134 = "_EDEFAULT;";
  protected final String TEXT_2135 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2136 = ", ";
  protected final String TEXT_2137 = "_EDEFAULT) != ";
  protected final String TEXT_2138 = "_EDEFAULT;";
  protected final String TEXT_2139 = NL + "\t\treturn ";
  protected final String TEXT_2140 = "() != ";
  protected final String TEXT_2141 = "_EDEFAULT;";
  protected final String TEXT_2142 = NL + "\t\treturn ";
  protected final String TEXT_2143 = "_EDEFAULT == null ? ";
  protected final String TEXT_2144 = " != null : !";
  protected final String TEXT_2145 = "_EDEFAULT.equals(";
  protected final String TEXT_2146 = ");";
  protected final String TEXT_2147 = NL + "\t\t";
  protected final String TEXT_2148 = " ";
  protected final String TEXT_2149 = " = (";
  protected final String TEXT_2150 = ")eVirtualGet(";
  protected final String TEXT_2151 = ", ";
  protected final String TEXT_2152 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2153 = "_EDEFAULT == null ? ";
  protected final String TEXT_2154 = " != null : !";
  protected final String TEXT_2155 = "_EDEFAULT.equals(";
  protected final String TEXT_2156 = ");";
  protected final String TEXT_2157 = NL + "\t\treturn ";
  protected final String TEXT_2158 = "_EDEFAULT == null ? ";
  protected final String TEXT_2159 = "() != null : !";
  protected final String TEXT_2160 = "_EDEFAULT.equals(";
  protected final String TEXT_2161 = "());";
  protected final String TEXT_2162 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2163 = ");";
  protected final String TEXT_2164 = NL + "\t\t";
  protected final String TEXT_2165 = " ";
  protected final String TEXT_2166 = " = (";
  protected final String TEXT_2167 = ")eVirtualGet(";
  protected final String TEXT_2168 = ");";
  protected final String TEXT_2169 = NL + "\t\treturn ";
  protected final String TEXT_2170 = " != null && ((";
  protected final String TEXT_2171 = ".Unsettable)";
  protected final String TEXT_2172 = ").isSet();";
  protected final String TEXT_2173 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2174 = ");";
  protected final String TEXT_2175 = NL + "\t\treturn (";
  protected final String TEXT_2176 = " & ";
  protected final String TEXT_2177 = "_ESETFLAG) != 0;";
  protected final String TEXT_2178 = NL + "\t\treturn ";
  protected final String TEXT_2179 = "ESet;";
  protected final String TEXT_2180 = NL + "\t\treturn !((";
  protected final String TEXT_2181 = ".Internal)((";
  protected final String TEXT_2182 = ".Internal.Wrapper)get";
  protected final String TEXT_2183 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2184 = ");";
  protected final String TEXT_2185 = NL + "\t\treturn !((";
  protected final String TEXT_2186 = ".Internal)get";
  protected final String TEXT_2187 = "()).isEmpty(";
  protected final String TEXT_2188 = ");";
  protected final String TEXT_2189 = NL;
  protected final String TEXT_2190 = NL + "\t\treturn ";
  protected final String TEXT_2191 = ".";
  protected final String TEXT_2192 = "(this);";
  protected final String TEXT_2193 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2194 = "' ";
  protected final String TEXT_2195 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2196 = NL + "\t}" + NL;
  protected final String TEXT_2197 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2198 = " ";
  protected final String TEXT_2199 = "(";
  protected final String TEXT_2200 = ")";
  protected final String TEXT_2201 = NL + "\t{";
  protected final String TEXT_2202 = NL + "\t\t";
  protected final String TEXT_2203 = "(";
  protected final String TEXT_2204 = ");";
  protected final String TEXT_2205 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2206 = NL + "\t\treturn ";
  protected final String TEXT_2207 = "(";
  protected final String TEXT_2208 = ");";
  protected final String TEXT_2209 = NL + "\t}" + NL;
  protected final String TEXT_2210 = NL + "} //";
  protected final String TEXT_2211 = NL;

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
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_324);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_326);
    }
    stringBuffer.append(TEXT_327);
    }
    stringBuffer.append(TEXT_328);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_333);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_334);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_337);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_340);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_343);
    } else {
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_345);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_350);
    } else {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_354);
    }
    } else {
    stringBuffer.append(TEXT_355);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_356);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_358);
    } else {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_361);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_362);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_368);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_369);
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_375);
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    } else {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_385);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_387);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_393);
    } else {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_397);
    }
    }
    stringBuffer.append(TEXT_398);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_403);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_407);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_408);
    } else {
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_410);
    }
    stringBuffer.append(TEXT_411);
    } else {
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_416);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_422);
    stringBuffer.append(TEXT_423);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_428);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_431);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_432);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_434);
    }
    }
    stringBuffer.append(TEXT_435);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_438);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_441);
    } else {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_446);
    }
    } else {
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_449);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_450);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_457);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_460);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_462);
    }
    }
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_464);
    } else {
    stringBuffer.append(TEXT_465);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_468);
    } else {
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(TEXT_473);
    if ("java.lang.String".equals(genFeature.getType()) && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_478);
    }
    if (!genFeature.isBasicSet()) { boolean first = genFeature.isContainer() && !genFeature.isVolatile();
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!UML2GenModelUtil.isUnion(supersetGenFeature)) {
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    } else {
    if (first) { first = false;
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_487);
    }
    }
    }
    }
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_489);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_491);
    }
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_493);
    }
    stringBuffer.append(TEXT_494);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_517);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_522);
    }
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_527);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_535);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_539);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_545);
    }
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_549);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_550);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_553);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_559);
    } else {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_563);
    }
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_570);
    } else {
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_576);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_586);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_590);
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_596);
    } else {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_601);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_606);
    } else {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_614);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_616);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_622);
    } else {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_626);
    }
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_630);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_631);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_632);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_633);
    }
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_636);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_638);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_639);
    } else {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_641);
    }
    stringBuffer.append(TEXT_642);
    } else {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_646);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_648);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_649);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_650);
    }
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_653);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_655);
    }
    }
    stringBuffer.append(TEXT_656);
    if (!genFeature.isBasicSet()) {
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (!subsetGenFeature.isListType() && !UML2GenModelUtil.isUnion(subsetGenFeature)) {
    stringBuffer.append(TEXT_657);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(subsetGenFeature.isContainer() ? subsetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(subsetGenFeature) + ")" : subsetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_661);
    }
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    if (!supersetGenFeature.isListType() && !UML2GenModelUtil.isUnion(supersetGenFeature)) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(supersetGenFeature.isContainer() ? supersetGenFeature.getGetAccessor() + "()" : (genModel.isVirtualDelegation() ? "eVirtualGet(" + genClass.getQualifiedFeatureID(supersetGenFeature) + ")" : supersetGenFeature.getSafeName()));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_672);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_676);
    }
    stringBuffer.append(TEXT_677);
    } else {
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_679);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_681);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_683);
    }
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_685);
    }
    stringBuffer.append(TEXT_686);
    }
    } else {
    stringBuffer.append(TEXT_687);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_688);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_691);
    } else {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_694);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_695);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_699);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_702);
    } else {
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_707);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_709);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_715);
    } else {
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_719);
    }
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_724);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    } else {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_728);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_729);
    } else {
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_731);
    }
    stringBuffer.append(TEXT_732);
    } else {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_735);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_736);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_741);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_743);
    }
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_745);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_748);
    }
    stringBuffer.append(TEXT_749);
    } else {
    stringBuffer.append(TEXT_750);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_752);
    } else {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_754);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_756);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_759);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_764);
    }
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_767);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_771);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_776);
    }
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_778);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_781);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_787);
    } else {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_791);
    }
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_796);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_801);
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_804);
    } else {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_808);
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_810);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_814);
    } else {
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_817);
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_819);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_822);
    } else {
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_824);
    }
    }
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_828);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_830);
    } else {
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_832);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_833);
    } else {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_835);
    }
    stringBuffer.append(TEXT_836);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_842);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_845);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_848);
    } else {
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_850);
    }
    }
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_854);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_857);
    } else {
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_860);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_861);
    } else {
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_863);
    }
    stringBuffer.append(TEXT_864);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_869);
    } else {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_871);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_873);
    }
    } else {
    stringBuffer.append(TEXT_874);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_875);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_877);
    } else {
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_880);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_881);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_888);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_890);
    }
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_892);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_895);
    }
    stringBuffer.append(TEXT_896);
    } else {
    stringBuffer.append(TEXT_897);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_899);
    } else {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_901);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_903);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_908);
    }
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_914);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_917);
    } else {
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_919);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_922);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_924);
    } else {
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_926);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_928);
    }
    } else {
    stringBuffer.append(TEXT_929);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_930);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_932);
    } else {
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_935);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_936);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_937);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_938);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_942);
    } else {
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_946);
    }
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_950);
    } else {
    stringBuffer.append(TEXT_951);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_955);
    } else {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_962);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_965);
    } else {
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_968);
    }
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_970);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_971);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_972);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_975);
    } else {
    stringBuffer.append(TEXT_976);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_979);
    }
    stringBuffer.append(TEXT_980);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_982);
    } else {
    stringBuffer.append(TEXT_983);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_986);
    } else {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_989);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_991);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_993);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_996);
    } else {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_999);
    }
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1001);
    }
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    if (isInterface) {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1012);
    } else {
    stringBuffer.append(TEXT_1013);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1018);
    } else {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1032);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1034);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1035);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1038);
    } else {
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1041);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1044);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1051);
    } else {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1053);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1055);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1057);
    } else {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1059);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1061);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1063);
    } else {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1065);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1069);
    } else {
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1072);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1076);
    } else {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1079);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1084);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1094);
    } else {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1099);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1101);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1106);
    }
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1110);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1112);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1115);
    } else {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1117);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1122);
    } else {
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1126);
    }
    } else {
    stringBuffer.append(TEXT_1127);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1130);
    } else {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1133);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1134);
    }
    //Class/genFeature.override.javajetinc
    }//for
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1135);
    if (isInterface) {
    stringBuffer.append(TEXT_1136);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1138);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1141);
    }}
    stringBuffer.append(TEXT_1142);
    } else {
    stringBuffer.append(TEXT_1143);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1148);
    } else {
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1153);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1159);
    } else {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1172);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1175);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1177);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1181);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1182);
    }
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1185);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1186);
    }
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1189);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1191);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1193);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1195);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1196);
    }
    stringBuffer.append(TEXT_1197);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1199);
    }
    stringBuffer.append(TEXT_1200);
    }
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1203);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1205);
    }
    } else {
    stringBuffer.append(TEXT_1206);
    }
    }
    stringBuffer.append(TEXT_1207);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1211);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1213);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1217);
    } else {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1220);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1222);
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1227);
    }
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1229);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1233);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1238);
    }
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1241);
    }
    }
    }
    stringBuffer.append(TEXT_1242);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1243);
    } else {
    stringBuffer.append(TEXT_1244);
    }
    stringBuffer.append(TEXT_1245);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1249);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1251);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1255);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1259);
    } else {
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1262);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1264);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1266);
    } else {
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1268);
    }
    }
    }
    stringBuffer.append(TEXT_1269);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1270);
    } else {
    stringBuffer.append(TEXT_1271);
    }
    stringBuffer.append(TEXT_1272);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1275);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1279);
    }
    }
    stringBuffer.append(TEXT_1280);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1281);
    } else {
    stringBuffer.append(TEXT_1282);
    }
    stringBuffer.append(TEXT_1283);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1284);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1286);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1288);
    } else {
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1291);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1294);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1298);
    } else {
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1301);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1305);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1309);
    } else {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1311);
    }
    }
    }
    stringBuffer.append(TEXT_1312);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1313);
    } else {
    stringBuffer.append(TEXT_1314);
    }
    stringBuffer.append(TEXT_1315);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1316);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1318);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1322);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1325);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1329);
    } else {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1332);
    }
    } else {
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1336);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1340);
    } else {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1343);
    }
    stringBuffer.append(TEXT_1344);
    }
    }
    stringBuffer.append(TEXT_1345);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1346);
    } else {
    stringBuffer.append(TEXT_1347);
    }
    stringBuffer.append(TEXT_1348);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1350);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1353);
    } else {
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1355);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1357);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1360);
    } else {
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1363);
    }
    stringBuffer.append(TEXT_1364);
    }
    }
    stringBuffer.append(TEXT_1365);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1366);
    } else {
    stringBuffer.append(TEXT_1367);
    }
    stringBuffer.append(TEXT_1368);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(TEXT_1370);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1372);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1374);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1380);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1383);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1390);
    } else {
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1392);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1394);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1396);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1398);
    } else {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1400);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1402);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1404);
    } else {
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1406);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1410);
    } else {
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1413);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1417);
    } else {
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1420);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1425);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1435);
    } else {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1440);
    }
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1441);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1442);
    } else {
    stringBuffer.append(TEXT_1443);
    }
    stringBuffer.append(TEXT_1444);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1445);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1447);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1450);
    }
    stringBuffer.append(TEXT_1451);
    }
    stringBuffer.append(TEXT_1452);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1454);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1457);
    }
    stringBuffer.append(TEXT_1458);
    }
    stringBuffer.append(TEXT_1459);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1462);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1463);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1466);
    }
    stringBuffer.append(TEXT_1467);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1470);
    }
    stringBuffer.append(TEXT_1471);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1472);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1480);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1483);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1484);
    }
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1488);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1491);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1492);
    }
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1497);
    }
    stringBuffer.append(TEXT_1498);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1501);
    } else {
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1503);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1504);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1505);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1507);
    } else {
    stringBuffer.append(TEXT_1508);
    }
    stringBuffer.append(TEXT_1509);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1511);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1514);
    } else {
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1516);
    }
    stringBuffer.append(TEXT_1517);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1519);
    } else {
    stringBuffer.append(TEXT_1520);
    }
    stringBuffer.append(TEXT_1521);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1523);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1526);
    } else {
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1528);
    }
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1532);
    }
    stringBuffer.append(TEXT_1533);
    if (isImplementation) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && genClass.isModelRoot()) {
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Adapter"));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1542);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1545);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1547);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1549);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1551);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1553);
    } else {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1556);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1560);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1561);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1563);
    } else {
    stringBuffer.append(TEXT_1564);
    }
    stringBuffer.append(TEXT_1565);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1575);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1580);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1583);
    } else {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1586);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1592);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1598);
    } else {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1607);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1611);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1615);
    } else {
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1622);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1625);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1627);
    } else {
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1630);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1635);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1637);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1640);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1642);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1655);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1656);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_1659);
    } else {
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1671);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1672);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1674);
    }
    stringBuffer.append(TEXT_1675);
    }
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_1680);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1681);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1682);
    }
    }
    } else {
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1685);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1688);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1691);
    } else {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1697);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1698);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1700);
    } else {
    stringBuffer.append(TEXT_1701);
    }
    stringBuffer.append(TEXT_1702);
    }
    }
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1704);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1706);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1708);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1709);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1711);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1712);
    }
    } else {
    stringBuffer.append(TEXT_1713);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1715);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1716);
    }
    }
    } else {
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1718);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1719);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1721);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1722);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1724);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1725);
    }
    } else {
    stringBuffer.append(TEXT_1726);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1728);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1729);
    }
    }
    } else {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1731);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_1732);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1734);
    } else {
    stringBuffer.append(TEXT_1735);
    }
    }
    stringBuffer.append(TEXT_1736);
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1737);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1738);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1742);
    } else {
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1746);
    }
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1750);
    } else {
    stringBuffer.append(TEXT_1751);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1755);
    } else {
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1762);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1765);
    } else {
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1768);
    }
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1770);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1771);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1775);
    } else {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1779);
    }
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1782);
    } else {
    stringBuffer.append(TEXT_1783);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1786);
    } else {
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_1793);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1796);
    } else {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1799);
    }
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1801);
    }
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    if (isInterface) {
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1812);
    } else {
    stringBuffer.append(TEXT_1813);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1818);
    } else {
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1832);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1834);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1835);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1838);
    } else {
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1841);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1844);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1851);
    } else {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1853);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1855);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1857);
    } else {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1859);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1861);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1863);
    } else {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1865);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1869);
    } else {
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1872);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1876);
    } else {
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1879);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1884);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1894);
    } else {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1899);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1901);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1906);
    }
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1910);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1912);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1915);
    } else {
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1917);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1922);
    } else {
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1926);
    }
    } else {
    stringBuffer.append(TEXT_1927);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1930);
    } else {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1933);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1934);
    }
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1937);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1939);
    } else {
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_1941);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1942);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_1944);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1945);
    } else {
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1947);
    }
    }
    stringBuffer.append(TEXT_1948);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1951);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1952);
    } else {
    stringBuffer.append(TEXT_1953);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1955);
    }
    stringBuffer.append(TEXT_1956);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1962);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1963);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1968);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1970);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1972);
    }
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1974);
    } else {
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1976);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1978);
    }
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1980);
    }
    }
    stringBuffer.append(TEXT_1981);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1985);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_1986);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1991);
    }
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1993);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_1995);
    }
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1997);
    }
    stringBuffer.append(TEXT_1998);
    }
    stringBuffer.append(TEXT_1999);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genModel) && genFeature.isChangeable() && genFeature.isContains()) {
    if (genClass.getChildrenClasses(genFeature).size() > 0) {
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2000);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2004);
    } else {
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2008);
    }
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2012);
    } else {
    stringBuffer.append(TEXT_2013);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2017);
    } else {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2024);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2027);
    } else {
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2030);
    }
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2032);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2033);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2037);
    } else {
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2041);
    }
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2044);
    } else {
    stringBuffer.append(TEXT_2045);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2048);
    } else {
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(childGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(childGenClass.getGenPackage().getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(childGenClass.getName());
    stringBuffer.append(TEXT_2055);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2058);
    } else {
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2061);
    }
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2063);
    }
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) {
    for (Iterator j = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); j.hasNext();) {GenFeature keyGenFeature = (GenFeature)j.next();
    if (isInterface) {
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(keyGenFeature.getFormattedName());
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2074);
    } else {
    stringBuffer.append(TEXT_2075);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2080);
    } else {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2094);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2096);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2097);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2100);
    } else {
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2103);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2106);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2113);
    } else {
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2115);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2117);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2119);
    } else {
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2121);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2123);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2125);
    } else {
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2127);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2131);
    } else {
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2134);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2138);
    } else {
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2141);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2146);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2156);
    } else {
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2161);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2163);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2168);
    }
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2172);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2174);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2177);
    } else {
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2179);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2184);
    } else {
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2188);
    }
    } else {
    stringBuffer.append(TEXT_2189);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2192);
    } else {
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2195);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2196);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2201);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2204);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2205);
    } else {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2208);
    }
    }
    stringBuffer.append(TEXT_2209);
    }
    }
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2211);
    return stringBuffer.toString();
  }
}
