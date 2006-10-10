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
  protected final String TEXT_68 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_69 = "() <em>";
  protected final String TEXT_70 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_71 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_72 = "[] ";
  protected final String TEXT_73 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_74 = " [0];" + NL;
  protected final String TEXT_75 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_76 = "() <em>";
  protected final String TEXT_77 = "</em>}' ";
  protected final String TEXT_78 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_79 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_80 = " ";
  protected final String TEXT_81 = "_EDEFAULT = ";
  protected final String TEXT_82 = ";";
  protected final String TEXT_83 = NL;
  protected final String TEXT_84 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_85 = " = 0;" + NL;
  protected final String TEXT_86 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_87 = "() <em>";
  protected final String TEXT_88 = "</em>}' ";
  protected final String TEXT_89 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_90 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_91 = "_EFLAG = 1 ";
  protected final String TEXT_92 = ";" + NL;
  protected final String TEXT_93 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_94 = "() <em>";
  protected final String TEXT_95 = "</em>}' ";
  protected final String TEXT_96 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_97 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_98 = " ";
  protected final String TEXT_99 = " = ";
  protected final String TEXT_100 = "_EDEFAULT;" + NL;
  protected final String TEXT_101 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_102 = " = 0;" + NL;
  protected final String TEXT_103 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_104 = " ";
  protected final String TEXT_105 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_106 = "_ESETFLAG = 1 ";
  protected final String TEXT_107 = ";" + NL;
  protected final String TEXT_108 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_109 = " ";
  protected final String TEXT_110 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_111 = "ESet = false;" + NL;
  protected final String TEXT_112 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_113 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_114 = NL + "\t\t";
  protected final String TEXT_115 = " |= ";
  protected final String TEXT_116 = "_EFLAG;";
  protected final String TEXT_117 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_118 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_119 = ";" + NL + "\t}" + NL;
  protected final String TEXT_120 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_121 = NL + "\t";
  protected final String TEXT_122 = "[] ";
  protected final String TEXT_123 = "();" + NL;
  protected final String TEXT_124 = NL + "\tpublic ";
  protected final String TEXT_125 = "[] ";
  protected final String TEXT_126 = "()" + NL + "\t{";
  protected final String TEXT_127 = NL + "\t\t";
  protected final String TEXT_128 = " list = (";
  protected final String TEXT_129 = ")";
  protected final String TEXT_130 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_131 = "_EEMPTY_ARRAY;";
  protected final String TEXT_132 = NL + "\t\tif (";
  protected final String TEXT_133 = " == null || ";
  protected final String TEXT_134 = ".isEmpty()) return ";
  protected final String TEXT_135 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_136 = " list = (";
  protected final String TEXT_137 = ")";
  protected final String TEXT_138 = ";";
  protected final String TEXT_139 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_140 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_142 = NL + "\t";
  protected final String TEXT_143 = " get";
  protected final String TEXT_144 = "(int index);" + NL;
  protected final String TEXT_145 = NL + "\tpublic ";
  protected final String TEXT_146 = " get";
  protected final String TEXT_147 = "(int index)" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_148 = ")";
  protected final String TEXT_149 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_150 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_151 = NL + "\tint get";
  protected final String TEXT_152 = "Length();" + NL;
  protected final String TEXT_153 = NL + "\tpublic int get";
  protected final String TEXT_154 = "Length()" + NL + "\t{";
  protected final String TEXT_155 = NL + "\t\treturn ";
  protected final String TEXT_156 = "().size();";
  protected final String TEXT_157 = NL + "\t\treturn ";
  protected final String TEXT_158 = " == null ? 0 : ";
  protected final String TEXT_159 = ".size();";
  protected final String TEXT_160 = NL + "\t}" + NL;
  protected final String TEXT_161 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_162 = NL + "\tvoid set";
  protected final String TEXT_163 = "(";
  protected final String TEXT_164 = "[] new";
  protected final String TEXT_165 = ");" + NL;
  protected final String TEXT_166 = NL + "\tpublic void set";
  protected final String TEXT_167 = "(";
  protected final String TEXT_168 = "[] new";
  protected final String TEXT_169 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_170 = ")";
  protected final String TEXT_171 = "()).setData(new";
  protected final String TEXT_172 = ".length, new";
  protected final String TEXT_173 = ");" + NL + "\t}" + NL;
  protected final String TEXT_174 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_175 = NL + "\tvoid set";
  protected final String TEXT_176 = "(int index, ";
  protected final String TEXT_177 = " element);" + NL;
  protected final String TEXT_178 = NL + "\tpublic void set";
  protected final String TEXT_179 = "(int index, ";
  protected final String TEXT_180 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_181 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_182 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_183 = "</b></em>' ";
  protected final String TEXT_184 = ".";
  protected final String TEXT_185 = NL + "\t * The key is of type ";
  protected final String TEXT_186 = "list of {@link ";
  protected final String TEXT_187 = "}";
  protected final String TEXT_188 = "{@link ";
  protected final String TEXT_189 = "}";
  protected final String TEXT_190 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_191 = "list of {@link ";
  protected final String TEXT_192 = "}";
  protected final String TEXT_193 = "{@link ";
  protected final String TEXT_194 = "}";
  protected final String TEXT_195 = ",";
  protected final String TEXT_196 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_197 = "}.";
  protected final String TEXT_198 = NL + "\t * The default value is <code>";
  protected final String TEXT_199 = "</code>.";
  protected final String TEXT_200 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_201 = "}.";
  protected final String TEXT_202 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_203 = "#";
  protected final String TEXT_204 = " <em>";
  protected final String TEXT_205 = "</em>}'.";
  protected final String TEXT_206 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_207 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_208 = "</em>' ";
  protected final String TEXT_209 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_210 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_211 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_212 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_213 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_214 = "</em>' ";
  protected final String TEXT_215 = ".";
  protected final String TEXT_216 = NL + "\t * @see ";
  protected final String TEXT_217 = NL + "\t * @see #isSet";
  protected final String TEXT_218 = "()";
  protected final String TEXT_219 = NL + "\t * @see #unset";
  protected final String TEXT_220 = "()";
  protected final String TEXT_221 = NL + "\t * @see #set";
  protected final String TEXT_222 = "(";
  protected final String TEXT_223 = ")";
  protected final String TEXT_224 = NL + "\t * @see ";
  protected final String TEXT_225 = "#get";
  protected final String TEXT_226 = "()";
  protected final String TEXT_227 = NL + "\t * @see ";
  protected final String TEXT_228 = "#";
  protected final String TEXT_229 = NL + "\t * @model ";
  protected final String TEXT_230 = NL + "\t *        ";
  protected final String TEXT_231 = NL + "\t * @model";
  protected final String TEXT_232 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_233 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_234 = NL + "\t";
  protected final String TEXT_235 = " ";
  protected final String TEXT_236 = "();" + NL;
  protected final String TEXT_237 = NL + "\tpublic ";
  protected final String TEXT_238 = " ";
  protected final String TEXT_239 = "()" + NL + "\t{";
  protected final String TEXT_240 = NL + "\t\treturn ";
  protected final String TEXT_241 = "(";
  protected final String TEXT_242 = "(";
  protected final String TEXT_243 = ")eGet(";
  protected final String TEXT_244 = ", true)";
  protected final String TEXT_245 = ").";
  protected final String TEXT_246 = "()";
  protected final String TEXT_247 = ";";
  protected final String TEXT_248 = NL + "\t\t";
  protected final String TEXT_249 = " ";
  protected final String TEXT_250 = " = (";
  protected final String TEXT_251 = ")eVirtualGet(";
  protected final String TEXT_252 = ");";
  protected final String TEXT_253 = NL + "\t\tif (";
  protected final String TEXT_254 = " == null)" + NL + "\t\t{";
  protected final String TEXT_255 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_256 = ", ";
  protected final String TEXT_257 = " = new ";
  protected final String TEXT_258 = ");";
  protected final String TEXT_259 = NL + "\t\t\t";
  protected final String TEXT_260 = " = new ";
  protected final String TEXT_261 = ";";
  protected final String TEXT_262 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_263 = ";";
  protected final String TEXT_264 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_265 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_266 = ")eContainer();";
  protected final String TEXT_267 = NL + "\t\t";
  protected final String TEXT_268 = " ";
  protected final String TEXT_269 = " = (";
  protected final String TEXT_270 = ")eVirtualGet(";
  protected final String TEXT_271 = ", ";
  protected final String TEXT_272 = "_EDEFAULT";
  protected final String TEXT_273 = ");";
  protected final String TEXT_274 = NL + "\t\tif (";
  protected final String TEXT_275 = " != null && ";
  protected final String TEXT_276 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_277 = " old";
  protected final String TEXT_278 = " = (";
  protected final String TEXT_279 = ")";
  protected final String TEXT_280 = ";" + NL + "\t\t\t";
  protected final String TEXT_281 = " = ";
  protected final String TEXT_282 = "eResolveProxy(old";
  protected final String TEXT_283 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_284 = " != old";
  protected final String TEXT_285 = ")" + NL + "\t\t\t{";
  protected final String TEXT_286 = NL + "\t\t\t\t";
  protected final String TEXT_287 = " new";
  protected final String TEXT_288 = " = (";
  protected final String TEXT_289 = ")";
  protected final String TEXT_290 = ";";
  protected final String TEXT_291 = NL + "\t\t\t\t";
  protected final String TEXT_292 = " msgs = old";
  protected final String TEXT_293 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_294 = ", null, null);";
  protected final String TEXT_295 = NL + "\t\t\t\t";
  protected final String TEXT_296 = " msgs =  old";
  protected final String TEXT_297 = ".eInverseRemove(this, ";
  protected final String TEXT_298 = ", ";
  protected final String TEXT_299 = ".class, null);";
  protected final String TEXT_300 = NL + "\t\t\t\tif (new";
  protected final String TEXT_301 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_302 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_303 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_304 = ", null, msgs);";
  protected final String TEXT_305 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_306 = ".eInverseAdd(this, ";
  protected final String TEXT_307 = ", ";
  protected final String TEXT_308 = ".class, msgs);";
  protected final String TEXT_309 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_310 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_311 = ", ";
  protected final String TEXT_312 = ");";
  protected final String TEXT_313 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_314 = "(this, ";
  protected final String TEXT_315 = ".RESOLVE, ";
  protected final String TEXT_316 = ", old";
  protected final String TEXT_317 = ", ";
  protected final String TEXT_318 = "));";
  protected final String TEXT_319 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_320 = NL + "\t\treturn (";
  protected final String TEXT_321 = ")eVirtualGet(";
  protected final String TEXT_322 = ", ";
  protected final String TEXT_323 = "_EDEFAULT";
  protected final String TEXT_324 = ");";
  protected final String TEXT_325 = NL + "\t\treturn (";
  protected final String TEXT_326 = " & ";
  protected final String TEXT_327 = "_EFLAG) != 0;";
  protected final String TEXT_328 = NL + "\t\treturn ";
  protected final String TEXT_329 = ";";
  protected final String TEXT_330 = NL + "\t\t";
  protected final String TEXT_331 = " ";
  protected final String TEXT_332 = " = basicGet";
  protected final String TEXT_333 = "();" + NL + "\t\treturn ";
  protected final String TEXT_334 = " != null && ";
  protected final String TEXT_335 = ".eIsProxy() ? ";
  protected final String TEXT_336 = "eResolveProxy((";
  protected final String TEXT_337 = ")";
  protected final String TEXT_338 = ") : ";
  protected final String TEXT_339 = ";";
  protected final String TEXT_340 = NL + "\t\treturn new ";
  protected final String TEXT_341 = "((";
  protected final String TEXT_342 = ".Internal)((";
  protected final String TEXT_343 = ".Internal.Wrapper)get";
  protected final String TEXT_344 = "()).featureMap().list(";
  protected final String TEXT_345 = "));";
  protected final String TEXT_346 = NL + "\t\treturn (";
  protected final String TEXT_347 = ")((";
  protected final String TEXT_348 = ")get";
  protected final String TEXT_349 = "()).list(";
  protected final String TEXT_350 = ");";
  protected final String TEXT_351 = NL + "\t\treturn ((";
  protected final String TEXT_352 = ".Internal.Wrapper)get";
  protected final String TEXT_353 = "()).featureMap().list(";
  protected final String TEXT_354 = ");";
  protected final String TEXT_355 = NL + "\t\treturn ((";
  protected final String TEXT_356 = ")get";
  protected final String TEXT_357 = "()).list(";
  protected final String TEXT_358 = ");";
  protected final String TEXT_359 = NL + "\t\treturn ";
  protected final String TEXT_360 = "(";
  protected final String TEXT_361 = "(";
  protected final String TEXT_362 = ")((";
  protected final String TEXT_363 = ".Internal.Wrapper)get";
  protected final String TEXT_364 = "()).featureMap().get(";
  protected final String TEXT_365 = ", true)";
  protected final String TEXT_366 = ").";
  protected final String TEXT_367 = "()";
  protected final String TEXT_368 = ";";
  protected final String TEXT_369 = NL + "\t\treturn ";
  protected final String TEXT_370 = "(";
  protected final String TEXT_371 = "(";
  protected final String TEXT_372 = ")get";
  protected final String TEXT_373 = "().get(";
  protected final String TEXT_374 = ", true)";
  protected final String TEXT_375 = ").";
  protected final String TEXT_376 = "()";
  protected final String TEXT_377 = ";";
  protected final String TEXT_378 = NL;
  protected final String TEXT_379 = NL + "\t\t";
  protected final String TEXT_380 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_381 = " result = (";
  protected final String TEXT_382 = ") cache.get(";
  protected final String TEXT_383 = "eResource(), ";
  protected final String TEXT_384 = "this, ";
  protected final String TEXT_385 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_386 = "eResource(), ";
  protected final String TEXT_387 = "this, ";
  protected final String TEXT_388 = ", result = ";
  protected final String TEXT_389 = "new ";
  protected final String TEXT_390 = "(";
  protected final String TEXT_391 = ".";
  protected final String TEXT_392 = "(this)";
  protected final String TEXT_393 = ")";
  protected final String TEXT_394 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_395 = ".";
  protected final String TEXT_396 = "()";
  protected final String TEXT_397 = ";" + NL + "\t\t}";
  protected final String TEXT_398 = NL + "\t\treturn ";
  protected final String TEXT_399 = ".";
  protected final String TEXT_400 = "(this);";
  protected final String TEXT_401 = NL + "\t\t";
  protected final String TEXT_402 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_403 = " eResource = eResource();" + NL + "\t\t\t";
  protected final String TEXT_404 = " ";
  protected final String TEXT_405 = " = (";
  protected final String TEXT_406 = ") cache.get(eResource, this, ";
  protected final String TEXT_407 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_408 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_409 = ", ";
  protected final String TEXT_410 = " = new ";
  protected final String TEXT_411 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_412 = ";" + NL + "\t\t}";
  protected final String TEXT_413 = NL + "\t\treturn new ";
  protected final String TEXT_414 = ";";
  protected final String TEXT_415 = NL + "\t\t";
  protected final String TEXT_416 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_417 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_418 = " method = getClass().getMethod(\"";
  protected final String TEXT_419 = "\", null);";
  protected final String TEXT_420 = NL + "\t\t\t\t";
  protected final String TEXT_421 = " ";
  protected final String TEXT_422 = " = (";
  protected final String TEXT_423 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_424 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_425 = " union = ";
  protected final String TEXT_426 = "Helper(new ";
  protected final String TEXT_427 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_428 = " = new ";
  protected final String TEXT_429 = "(this, ";
  protected final String TEXT_430 = "null";
  protected final String TEXT_431 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_432 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_433 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_434 = NL + "\t\t\t";
  protected final String TEXT_435 = " ";
  protected final String TEXT_436 = " = (";
  protected final String TEXT_437 = ") cache.get(eResource(), this, ";
  protected final String TEXT_438 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_439 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_440 = " union = ";
  protected final String TEXT_441 = "Helper(new ";
  protected final String TEXT_442 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_443 = ", ";
  protected final String TEXT_444 = " = new ";
  protected final String TEXT_445 = "(this, ";
  protected final String TEXT_446 = "null";
  protected final String TEXT_447 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_448 = ";";
  protected final String TEXT_449 = NL + "\t\t}";
  protected final String TEXT_450 = NL + "\t\t";
  protected final String TEXT_451 = " union = ";
  protected final String TEXT_452 = "Helper(new ";
  protected final String TEXT_453 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_454 = "(this, ";
  protected final String TEXT_455 = "null";
  protected final String TEXT_456 = ", union.size(), union.toArray());";
  protected final String TEXT_457 = NL + "\t\tif (isSet";
  protected final String TEXT_458 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_459 = "();" + NL + "\t\t}";
  protected final String TEXT_460 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_461 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_462 = "();" + NL + "\t\t}";
  protected final String TEXT_463 = NL + "\t\t";
  protected final String TEXT_464 = " ";
  protected final String TEXT_465 = " = ";
  protected final String TEXT_466 = "();" + NL + "\t\tif (";
  protected final String TEXT_467 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_468 = ";" + NL + "\t\t}";
  protected final String TEXT_469 = NL + "\t\treturn ";
  protected final String TEXT_470 = "super.";
  protected final String TEXT_471 = "()";
  protected final String TEXT_472 = "null";
  protected final String TEXT_473 = ";";
  protected final String TEXT_474 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_475 = "' ";
  protected final String TEXT_476 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_477 = NL + "\t}" + NL;
  protected final String TEXT_478 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_479 = " basicGet";
  protected final String TEXT_480 = "()" + NL + "\t{";
  protected final String TEXT_481 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_482 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_483 = ")eInternalContainer();";
  protected final String TEXT_484 = NL + "\t\treturn (";
  protected final String TEXT_485 = ")eVirtualGet(";
  protected final String TEXT_486 = ");";
  protected final String TEXT_487 = NL + "\t\treturn ";
  protected final String TEXT_488 = ";";
  protected final String TEXT_489 = NL + "\t\treturn (";
  protected final String TEXT_490 = ")((";
  protected final String TEXT_491 = ".Internal.Wrapper)get";
  protected final String TEXT_492 = "()).featureMap().get(";
  protected final String TEXT_493 = ", false);";
  protected final String TEXT_494 = NL + "\t\treturn (";
  protected final String TEXT_495 = ")get";
  protected final String TEXT_496 = "().get(";
  protected final String TEXT_497 = ", false);";
  protected final String TEXT_498 = NL;
  protected final String TEXT_499 = NL + "\t\treturn ";
  protected final String TEXT_500 = ".";
  protected final String TEXT_501 = "(this);";
  protected final String TEXT_502 = NL + "\t\tif (isSet";
  protected final String TEXT_503 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_504 = "basicGet";
  protected final String TEXT_505 = "();" + NL + "\t\t}";
  protected final String TEXT_506 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_507 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_508 = "basicGet";
  protected final String TEXT_509 = "();" + NL + "\t\t}";
  protected final String TEXT_510 = NL + "\t\t";
  protected final String TEXT_511 = " ";
  protected final String TEXT_512 = " = ";
  protected final String TEXT_513 = "basicGet";
  protected final String TEXT_514 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_515 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_516 = ";" + NL + "\t\t}";
  protected final String TEXT_517 = NL + "\t\treturn ";
  protected final String TEXT_518 = "super.basicGet";
  protected final String TEXT_519 = "()";
  protected final String TEXT_520 = "null";
  protected final String TEXT_521 = ";";
  protected final String TEXT_522 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_523 = "' ";
  protected final String TEXT_524 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_525 = NL + "\t}" + NL;
  protected final String TEXT_526 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_527 = " basicSet";
  protected final String TEXT_528 = "(";
  protected final String TEXT_529 = " new";
  protected final String TEXT_530 = ", ";
  protected final String TEXT_531 = " msgs)" + NL + "\t{";
  protected final String TEXT_532 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_533 = ")new";
  protected final String TEXT_534 = ", ";
  protected final String TEXT_535 = ", msgs);";
  protected final String TEXT_536 = NL;
  protected final String TEXT_537 = NL + "\t\t";
  protected final String TEXT_538 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_539 = NL + "\t\t\t";
  protected final String TEXT_540 = " ";
  protected final String TEXT_541 = " = ";
  protected final String TEXT_542 = "();";
  protected final String TEXT_543 = NL + "\t\t\tObject ";
  protected final String TEXT_544 = " = eVirtualGet(";
  protected final String TEXT_545 = ");";
  protected final String TEXT_546 = NL + "\t\t\tif (";
  protected final String TEXT_547 = " != null && ";
  protected final String TEXT_548 = " != new";
  protected final String TEXT_549 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_550 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_551 = NL + "\t\t\tif (new";
  protected final String TEXT_552 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_553 = NL + "\t\t\t\t";
  protected final String TEXT_554 = " ";
  protected final String TEXT_555 = " = ";
  protected final String TEXT_556 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_557 = ".contains(new";
  protected final String TEXT_558 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_559 = ".add(new";
  protected final String TEXT_560 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_561 = NL + "\t\t\t\t";
  protected final String TEXT_562 = " ";
  protected final String TEXT_563 = " = ";
  protected final String TEXT_564 = "();";
  protected final String TEXT_565 = NL + "\t\t\t\tObject ";
  protected final String TEXT_566 = " = eVirtualGet(";
  protected final String TEXT_567 = ");";
  protected final String TEXT_568 = NL + "\t\t\t\tif (new";
  protected final String TEXT_569 = " != ";
  protected final String TEXT_570 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_571 = "(new";
  protected final String TEXT_572 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_573 = NL + "\t\t\t}";
  protected final String TEXT_574 = NL + "\t\t}";
  protected final String TEXT_575 = NL + "\t\treturn msgs;";
  protected final String TEXT_576 = NL + "\t\tObject old";
  protected final String TEXT_577 = " = eVirtualSet(";
  protected final String TEXT_578 = ", new";
  protected final String TEXT_579 = ");";
  protected final String TEXT_580 = NL + "\t\t";
  protected final String TEXT_581 = " old";
  protected final String TEXT_582 = " = ";
  protected final String TEXT_583 = ";" + NL + "\t\t";
  protected final String TEXT_584 = " = new";
  protected final String TEXT_585 = ";";
  protected final String TEXT_586 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_587 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_588 = NL + "\t\tboolean old";
  protected final String TEXT_589 = "ESet = (";
  protected final String TEXT_590 = " & ";
  protected final String TEXT_591 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_592 = " |= ";
  protected final String TEXT_593 = "_ESETFLAG;";
  protected final String TEXT_594 = NL + "\t\tboolean old";
  protected final String TEXT_595 = "ESet = ";
  protected final String TEXT_596 = "ESet;" + NL + "\t\t";
  protected final String TEXT_597 = "ESet = true;";
  protected final String TEXT_598 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_599 = NL + "\t\t\t";
  protected final String TEXT_600 = " notification = new ";
  protected final String TEXT_601 = "(this, ";
  protected final String TEXT_602 = ".SET, ";
  protected final String TEXT_603 = ", ";
  protected final String TEXT_604 = "isSetChange ? null : old";
  protected final String TEXT_605 = "old";
  protected final String TEXT_606 = ", new";
  protected final String TEXT_607 = ", ";
  protected final String TEXT_608 = "isSetChange";
  protected final String TEXT_609 = "!old";
  protected final String TEXT_610 = "ESet";
  protected final String TEXT_611 = ");";
  protected final String TEXT_612 = NL + "\t\t\t";
  protected final String TEXT_613 = " notification = new ";
  protected final String TEXT_614 = "(this, ";
  protected final String TEXT_615 = ".SET, ";
  protected final String TEXT_616 = ", ";
  protected final String TEXT_617 = "old";
  protected final String TEXT_618 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_619 = "old";
  protected final String TEXT_620 = ", new";
  protected final String TEXT_621 = ");";
  protected final String TEXT_622 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_623 = NL;
  protected final String TEXT_624 = NL + "\t\t";
  protected final String TEXT_625 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_626 = NL + "\t\t\t";
  protected final String TEXT_627 = " ";
  protected final String TEXT_628 = " = ";
  protected final String TEXT_629 = "();";
  protected final String TEXT_630 = NL + "\t\t\tObject ";
  protected final String TEXT_631 = " = eVirtualGet(";
  protected final String TEXT_632 = ");";
  protected final String TEXT_633 = NL + "\t\t\tif (";
  protected final String TEXT_634 = " != null && ";
  protected final String TEXT_635 = " != new";
  protected final String TEXT_636 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_637 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_638 = NL + "\t\t\tif (new";
  protected final String TEXT_639 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_640 = NL + "\t\t\t\t";
  protected final String TEXT_641 = " ";
  protected final String TEXT_642 = " = ";
  protected final String TEXT_643 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_644 = ".contains(new";
  protected final String TEXT_645 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_646 = ".add(new";
  protected final String TEXT_647 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_648 = NL + "\t\t\t\t";
  protected final String TEXT_649 = " ";
  protected final String TEXT_650 = " = ";
  protected final String TEXT_651 = "();";
  protected final String TEXT_652 = NL + "\t\t\t\tObject ";
  protected final String TEXT_653 = " = eVirtualGet(";
  protected final String TEXT_654 = ");";
  protected final String TEXT_655 = NL + "\t\t\t\tif (new";
  protected final String TEXT_656 = " != ";
  protected final String TEXT_657 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_658 = "(new";
  protected final String TEXT_659 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_660 = NL + "\t\t\t}";
  protected final String TEXT_661 = NL + "\t\t}";
  protected final String TEXT_662 = NL + "\t\treturn msgs;";
  protected final String TEXT_663 = NL + "\t\treturn ((";
  protected final String TEXT_664 = ".Internal)((";
  protected final String TEXT_665 = ".Internal.Wrapper)get";
  protected final String TEXT_666 = "()).featureMap()).basicAdd(";
  protected final String TEXT_667 = ", new";
  protected final String TEXT_668 = ", msgs);";
  protected final String TEXT_669 = NL + "\t\treturn ((";
  protected final String TEXT_670 = ".Internal)get";
  protected final String TEXT_671 = "()).basicAdd(";
  protected final String TEXT_672 = ", new";
  protected final String TEXT_673 = ", msgs);";
  protected final String TEXT_674 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_675 = "' ";
  protected final String TEXT_676 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_677 = NL + "\t}" + NL;
  protected final String TEXT_678 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_679 = "#";
  protected final String TEXT_680 = " <em>";
  protected final String TEXT_681 = "</em>}' ";
  protected final String TEXT_682 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_683 = "</em>' ";
  protected final String TEXT_684 = ".";
  protected final String TEXT_685 = NL + "\t * @see ";
  protected final String TEXT_686 = NL + "\t * @see #isSet";
  protected final String TEXT_687 = "()";
  protected final String TEXT_688 = NL + "\t * @see #unset";
  protected final String TEXT_689 = "()";
  protected final String TEXT_690 = NL + "\t * @see #";
  protected final String TEXT_691 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_692 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_693 = NL + "\tvoid set";
  protected final String TEXT_694 = "(";
  protected final String TEXT_695 = " value);" + NL;
  protected final String TEXT_696 = NL + "\tpublic void set";
  protected final String TEXT_697 = "(";
  protected final String TEXT_698 = " new";
  protected final String TEXT_699 = ")" + NL + "\t{";
  protected final String TEXT_700 = NL;
  protected final String TEXT_701 = NL + "\t\tnew";
  protected final String TEXT_702 = " = new";
  protected final String TEXT_703 = " == null ? ";
  protected final String TEXT_704 = "_EDEFAULT : new";
  protected final String TEXT_705 = ";";
  protected final String TEXT_706 = NL + "\t\teSet(";
  protected final String TEXT_707 = ", ";
  protected final String TEXT_708 = "new ";
  protected final String TEXT_709 = "(";
  protected final String TEXT_710 = "new";
  protected final String TEXT_711 = ")";
  protected final String TEXT_712 = ");";
  protected final String TEXT_713 = NL + "\t\tif (new";
  protected final String TEXT_714 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_715 = " && new";
  protected final String TEXT_716 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_717 = ".isAncestor(this, ";
  protected final String TEXT_718 = "new";
  protected final String TEXT_719 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_720 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_721 = NL + "\t\t\t";
  protected final String TEXT_722 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_723 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_724 = ")new";
  protected final String TEXT_725 = ").eInverseAdd(this, ";
  protected final String TEXT_726 = ", ";
  protected final String TEXT_727 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_728 = "(";
  protected final String TEXT_729 = "new";
  protected final String TEXT_730 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_731 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_732 = "(this, ";
  protected final String TEXT_733 = ".SET, ";
  protected final String TEXT_734 = ", new";
  protected final String TEXT_735 = ", new";
  protected final String TEXT_736 = "));";
  protected final String TEXT_737 = NL + "\t\t";
  protected final String TEXT_738 = " ";
  protected final String TEXT_739 = " = (";
  protected final String TEXT_740 = ")eVirtualGet(";
  protected final String TEXT_741 = ");";
  protected final String TEXT_742 = NL + "\t\tif (new";
  protected final String TEXT_743 = " != ";
  protected final String TEXT_744 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_745 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_746 = " != null)";
  protected final String TEXT_747 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_748 = ")";
  protected final String TEXT_749 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_750 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_751 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_752 = ")new";
  protected final String TEXT_753 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_754 = ", null, msgs);";
  protected final String TEXT_755 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_756 = ")";
  protected final String TEXT_757 = ").eInverseRemove(this, ";
  protected final String TEXT_758 = ", ";
  protected final String TEXT_759 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_760 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_761 = ")new";
  protected final String TEXT_762 = ").eInverseAdd(this, ";
  protected final String TEXT_763 = ", ";
  protected final String TEXT_764 = ".class, msgs);";
  protected final String TEXT_765 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_766 = "(";
  protected final String TEXT_767 = "new";
  protected final String TEXT_768 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_769 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_770 = NL + "\t\t\tboolean old";
  protected final String TEXT_771 = "ESet = eVirtualIsSet(";
  protected final String TEXT_772 = ");";
  protected final String TEXT_773 = NL + "\t\t\tboolean old";
  protected final String TEXT_774 = "ESet = (";
  protected final String TEXT_775 = " & ";
  protected final String TEXT_776 = "_ESETFLAG) != 0;";
  protected final String TEXT_777 = NL + "\t\t\t";
  protected final String TEXT_778 = " |= ";
  protected final String TEXT_779 = "_ESETFLAG;";
  protected final String TEXT_780 = NL + "\t\t\tboolean old";
  protected final String TEXT_781 = "ESet = ";
  protected final String TEXT_782 = "ESet;";
  protected final String TEXT_783 = NL + "\t\t\t";
  protected final String TEXT_784 = "ESet = true;";
  protected final String TEXT_785 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_786 = "(this, ";
  protected final String TEXT_787 = ".SET, ";
  protected final String TEXT_788 = ", new";
  protected final String TEXT_789 = ", new";
  protected final String TEXT_790 = ", !old";
  protected final String TEXT_791 = "ESet));";
  protected final String TEXT_792 = NL + "    \t}";
  protected final String TEXT_793 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_794 = "(this, ";
  protected final String TEXT_795 = ".SET, ";
  protected final String TEXT_796 = ", new";
  protected final String TEXT_797 = ", new";
  protected final String TEXT_798 = "));";
  protected final String TEXT_799 = NL + "\t\t";
  protected final String TEXT_800 = " old";
  protected final String TEXT_801 = " = (";
  protected final String TEXT_802 = " & ";
  protected final String TEXT_803 = "_EFLAG) != 0;";
  protected final String TEXT_804 = NL + "\t\tif (new";
  protected final String TEXT_805 = ") ";
  protected final String TEXT_806 = " |= ";
  protected final String TEXT_807 = "_EFLAG; else ";
  protected final String TEXT_808 = " &= ~";
  protected final String TEXT_809 = "_EFLAG;";
  protected final String TEXT_810 = NL + "\t\t";
  protected final String TEXT_811 = " old";
  protected final String TEXT_812 = " = ";
  protected final String TEXT_813 = ";";
  protected final String TEXT_814 = NL + "\t\t";
  protected final String TEXT_815 = " ";
  protected final String TEXT_816 = " = new";
  protected final String TEXT_817 = " == null ? ";
  protected final String TEXT_818 = "_EDEFAULT : new";
  protected final String TEXT_819 = ";";
  protected final String TEXT_820 = NL + "\t\t";
  protected final String TEXT_821 = " = new";
  protected final String TEXT_822 = " == null ? ";
  protected final String TEXT_823 = "_EDEFAULT : new";
  protected final String TEXT_824 = ";";
  protected final String TEXT_825 = NL + "\t\t";
  protected final String TEXT_826 = " ";
  protected final String TEXT_827 = " = ";
  protected final String TEXT_828 = "new";
  protected final String TEXT_829 = ";";
  protected final String TEXT_830 = NL + "\t\t";
  protected final String TEXT_831 = " = ";
  protected final String TEXT_832 = "new";
  protected final String TEXT_833 = ";";
  protected final String TEXT_834 = NL + "\t\tObject old";
  protected final String TEXT_835 = " = eVirtualSet(";
  protected final String TEXT_836 = ", ";
  protected final String TEXT_837 = ");";
  protected final String TEXT_838 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_839 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_840 = NL + "\t\tboolean old";
  protected final String TEXT_841 = "ESet = (";
  protected final String TEXT_842 = " & ";
  protected final String TEXT_843 = "_ESETFLAG) != 0;";
  protected final String TEXT_844 = NL + "\t\t";
  protected final String TEXT_845 = " |= ";
  protected final String TEXT_846 = "_ESETFLAG;";
  protected final String TEXT_847 = NL + "\t\tboolean old";
  protected final String TEXT_848 = "ESet = ";
  protected final String TEXT_849 = "ESet;";
  protected final String TEXT_850 = NL + "\t\t";
  protected final String TEXT_851 = "ESet = true;";
  protected final String TEXT_852 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_853 = "(this, ";
  protected final String TEXT_854 = ".SET, ";
  protected final String TEXT_855 = ", ";
  protected final String TEXT_856 = "isSetChange ? ";
  protected final String TEXT_857 = "null";
  protected final String TEXT_858 = "_EDEFAULT";
  protected final String TEXT_859 = " : old";
  protected final String TEXT_860 = "old";
  protected final String TEXT_861 = ", ";
  protected final String TEXT_862 = "new";
  protected final String TEXT_863 = ", ";
  protected final String TEXT_864 = "isSetChange";
  protected final String TEXT_865 = "!old";
  protected final String TEXT_866 = "ESet";
  protected final String TEXT_867 = "));";
  protected final String TEXT_868 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_869 = "(this, ";
  protected final String TEXT_870 = ".SET, ";
  protected final String TEXT_871 = ", ";
  protected final String TEXT_872 = "old";
  protected final String TEXT_873 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_874 = "null";
  protected final String TEXT_875 = "_EDEFAULT";
  protected final String TEXT_876 = " : old";
  protected final String TEXT_877 = "old";
  protected final String TEXT_878 = ", ";
  protected final String TEXT_879 = "new";
  protected final String TEXT_880 = "));";
  protected final String TEXT_881 = NL;
  protected final String TEXT_882 = NL;
  protected final String TEXT_883 = NL + "\t\t";
  protected final String TEXT_884 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_885 = NL + "\t\t\t";
  protected final String TEXT_886 = " ";
  protected final String TEXT_887 = " = ";
  protected final String TEXT_888 = "();";
  protected final String TEXT_889 = NL + "\t\t\tObject ";
  protected final String TEXT_890 = " = eVirtualGet(";
  protected final String TEXT_891 = ");";
  protected final String TEXT_892 = NL + "\t\t\tif (";
  protected final String TEXT_893 = " != null && ";
  protected final String TEXT_894 = " != new";
  protected final String TEXT_895 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_896 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_897 = NL + "\t\t\tif (new";
  protected final String TEXT_898 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_899 = NL + "\t\t\t\t";
  protected final String TEXT_900 = " ";
  protected final String TEXT_901 = " = ";
  protected final String TEXT_902 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_903 = ".contains(new";
  protected final String TEXT_904 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_905 = ".add(new";
  protected final String TEXT_906 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_907 = NL + "\t\t\t\t";
  protected final String TEXT_908 = " ";
  protected final String TEXT_909 = " = ";
  protected final String TEXT_910 = "();";
  protected final String TEXT_911 = NL + "\t\t\t\tObject ";
  protected final String TEXT_912 = " = eVirtualGet(";
  protected final String TEXT_913 = ");";
  protected final String TEXT_914 = NL + "\t\t\t\tif (new";
  protected final String TEXT_915 = " != ";
  protected final String TEXT_916 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_917 = "(new";
  protected final String TEXT_918 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_919 = NL + "\t\t\t}";
  protected final String TEXT_920 = NL + "\t\t}";
  protected final String TEXT_921 = NL + "\t\t((";
  protected final String TEXT_922 = ".Internal)((";
  protected final String TEXT_923 = ".Internal.Wrapper)get";
  protected final String TEXT_924 = "()).featureMap()).set(";
  protected final String TEXT_925 = ", ";
  protected final String TEXT_926 = "new ";
  protected final String TEXT_927 = "(";
  protected final String TEXT_928 = "new";
  protected final String TEXT_929 = ")";
  protected final String TEXT_930 = ");";
  protected final String TEXT_931 = NL + "\t\t((";
  protected final String TEXT_932 = ".Internal)get";
  protected final String TEXT_933 = "()).set(";
  protected final String TEXT_934 = ", ";
  protected final String TEXT_935 = "new ";
  protected final String TEXT_936 = "(";
  protected final String TEXT_937 = "new";
  protected final String TEXT_938 = ")";
  protected final String TEXT_939 = ");";
  protected final String TEXT_940 = NL;
  protected final String TEXT_941 = NL + "\t\t";
  protected final String TEXT_942 = ".";
  protected final String TEXT_943 = "(this, ";
  protected final String TEXT_944 = ");";
  protected final String TEXT_945 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_946 = "' ";
  protected final String TEXT_947 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_948 = NL + "\t}" + NL;
  protected final String TEXT_949 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_950 = " basicUnset";
  protected final String TEXT_951 = "(";
  protected final String TEXT_952 = " msgs)" + NL + "\t{";
  protected final String TEXT_953 = NL + "\t\tObject old";
  protected final String TEXT_954 = " = eVirtualUnset(";
  protected final String TEXT_955 = ");";
  protected final String TEXT_956 = NL + "\t\t";
  protected final String TEXT_957 = " old";
  protected final String TEXT_958 = " = ";
  protected final String TEXT_959 = ";" + NL + "\t\t";
  protected final String TEXT_960 = " = null;";
  protected final String TEXT_961 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_962 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_963 = NL + "\t\tboolean old";
  protected final String TEXT_964 = "ESet = (";
  protected final String TEXT_965 = " & ";
  protected final String TEXT_966 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_967 = " &= ~";
  protected final String TEXT_968 = "_ESETFLAG;";
  protected final String TEXT_969 = NL + "\t\tboolean old";
  protected final String TEXT_970 = "ESet = ";
  protected final String TEXT_971 = "ESet;" + NL + "\t\t";
  protected final String TEXT_972 = "ESet = false;";
  protected final String TEXT_973 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_974 = " notification = new ";
  protected final String TEXT_975 = "(this, ";
  protected final String TEXT_976 = ".UNSET, ";
  protected final String TEXT_977 = ", ";
  protected final String TEXT_978 = "isSetChange ? old";
  protected final String TEXT_979 = " : null";
  protected final String TEXT_980 = "old";
  protected final String TEXT_981 = ", null, ";
  protected final String TEXT_982 = "isSetChange";
  protected final String TEXT_983 = "old";
  protected final String TEXT_984 = "ESet";
  protected final String TEXT_985 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_986 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_987 = "' ";
  protected final String TEXT_988 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_989 = NL + "\t}" + NL;
  protected final String TEXT_990 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_991 = "#";
  protected final String TEXT_992 = " <em>";
  protected final String TEXT_993 = "</em>}' ";
  protected final String TEXT_994 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_995 = NL + "\t * @see #isSet";
  protected final String TEXT_996 = "()";
  protected final String TEXT_997 = NL + "\t * @see #";
  protected final String TEXT_998 = "()";
  protected final String TEXT_999 = NL + "\t * @see #set";
  protected final String TEXT_1000 = "(";
  protected final String TEXT_1001 = ")";
  protected final String TEXT_1002 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1003 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1004 = NL + "\tvoid unset";
  protected final String TEXT_1005 = "();" + NL;
  protected final String TEXT_1006 = NL + "\tpublic void unset";
  protected final String TEXT_1007 = "()" + NL + "\t{";
  protected final String TEXT_1008 = NL + "\t\teUnset(";
  protected final String TEXT_1009 = ");";
  protected final String TEXT_1010 = NL + "\t\t";
  protected final String TEXT_1011 = " ";
  protected final String TEXT_1012 = " = (";
  protected final String TEXT_1013 = ")eVirtualGet(";
  protected final String TEXT_1014 = ");";
  protected final String TEXT_1015 = NL + "\t\tif (";
  protected final String TEXT_1016 = " != null) ((";
  protected final String TEXT_1017 = ".Unsettable)";
  protected final String TEXT_1018 = ").unset();";
  protected final String TEXT_1019 = NL + "\t\t";
  protected final String TEXT_1020 = " ";
  protected final String TEXT_1021 = " = (";
  protected final String TEXT_1022 = ")eVirtualGet(";
  protected final String TEXT_1023 = ");";
  protected final String TEXT_1024 = NL + "\t\tif (";
  protected final String TEXT_1025 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1026 = " msgs = null;";
  protected final String TEXT_1027 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1028 = ")";
  protected final String TEXT_1029 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1030 = ", null, msgs);";
  protected final String TEXT_1031 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1032 = ")";
  protected final String TEXT_1033 = ").eInverseRemove(this, ";
  protected final String TEXT_1034 = ", ";
  protected final String TEXT_1035 = ".class, msgs);";
  protected final String TEXT_1036 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1037 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_1038 = NL + "\t\t\tboolean old";
  protected final String TEXT_1039 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1040 = ");";
  protected final String TEXT_1041 = NL + "\t\t\tboolean old";
  protected final String TEXT_1042 = "ESet = (";
  protected final String TEXT_1043 = " & ";
  protected final String TEXT_1044 = "_ESETFLAG) != 0;";
  protected final String TEXT_1045 = NL + "\t\t\t";
  protected final String TEXT_1046 = " &= ~";
  protected final String TEXT_1047 = "_ESETFLAG;";
  protected final String TEXT_1048 = NL + "\t\t\tboolean old";
  protected final String TEXT_1049 = "ESet = ";
  protected final String TEXT_1050 = "ESet;";
  protected final String TEXT_1051 = NL + "\t\t\t";
  protected final String TEXT_1052 = "ESet = false;";
  protected final String TEXT_1053 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1054 = "(this, ";
  protected final String TEXT_1055 = ".UNSET, ";
  protected final String TEXT_1056 = ", null, null, old";
  protected final String TEXT_1057 = "ESet));";
  protected final String TEXT_1058 = NL + "    \t}";
  protected final String TEXT_1059 = NL + "\t\t";
  protected final String TEXT_1060 = " old";
  protected final String TEXT_1061 = " = (";
  protected final String TEXT_1062 = " & ";
  protected final String TEXT_1063 = "_EFLAG) != 0;";
  protected final String TEXT_1064 = NL + "\t\tObject old";
  protected final String TEXT_1065 = " = eVirtualUnset(";
  protected final String TEXT_1066 = ");";
  protected final String TEXT_1067 = NL + "\t\t";
  protected final String TEXT_1068 = " old";
  protected final String TEXT_1069 = " = ";
  protected final String TEXT_1070 = ";";
  protected final String TEXT_1071 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1072 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1073 = NL + "\t\tboolean old";
  protected final String TEXT_1074 = "ESet = (";
  protected final String TEXT_1075 = " & ";
  protected final String TEXT_1076 = "_ESETFLAG) != 0;";
  protected final String TEXT_1077 = NL + "\t\tboolean old";
  protected final String TEXT_1078 = "ESet = ";
  protected final String TEXT_1079 = "ESet;";
  protected final String TEXT_1080 = NL + "\t\t";
  protected final String TEXT_1081 = " = null;";
  protected final String TEXT_1082 = NL + "\t\t";
  protected final String TEXT_1083 = " &= ~";
  protected final String TEXT_1084 = "_ESETFLAG;";
  protected final String TEXT_1085 = NL + "\t\t";
  protected final String TEXT_1086 = "ESet = false;";
  protected final String TEXT_1087 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1088 = "(this, ";
  protected final String TEXT_1089 = ".UNSET, ";
  protected final String TEXT_1090 = ", ";
  protected final String TEXT_1091 = "isSetChange ? old";
  protected final String TEXT_1092 = " : null";
  protected final String TEXT_1093 = "old";
  protected final String TEXT_1094 = ", null, ";
  protected final String TEXT_1095 = "isSetChange";
  protected final String TEXT_1096 = "old";
  protected final String TEXT_1097 = "ESet";
  protected final String TEXT_1098 = "));";
  protected final String TEXT_1099 = NL + "\t\tif (";
  protected final String TEXT_1100 = "_EDEFAULT) ";
  protected final String TEXT_1101 = " |= ";
  protected final String TEXT_1102 = "_EFLAG; else ";
  protected final String TEXT_1103 = " &= ~";
  protected final String TEXT_1104 = "_EFLAG;";
  protected final String TEXT_1105 = NL + "\t\t";
  protected final String TEXT_1106 = " = ";
  protected final String TEXT_1107 = "_EDEFAULT;";
  protected final String TEXT_1108 = NL + "\t\t";
  protected final String TEXT_1109 = " &= ~";
  protected final String TEXT_1110 = "_ESETFLAG;";
  protected final String TEXT_1111 = NL + "\t\t";
  protected final String TEXT_1112 = "ESet = false;";
  protected final String TEXT_1113 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1114 = "(this, ";
  protected final String TEXT_1115 = ".UNSET, ";
  protected final String TEXT_1116 = ", ";
  protected final String TEXT_1117 = "isSetChange ? old";
  protected final String TEXT_1118 = " : ";
  protected final String TEXT_1119 = "_EDEFAULT";
  protected final String TEXT_1120 = "old";
  protected final String TEXT_1121 = ", ";
  protected final String TEXT_1122 = "_EDEFAULT, ";
  protected final String TEXT_1123 = "isSetChange";
  protected final String TEXT_1124 = "old";
  protected final String TEXT_1125 = "ESet";
  protected final String TEXT_1126 = "));";
  protected final String TEXT_1127 = NL + "\t\t((";
  protected final String TEXT_1128 = ".Internal)((";
  protected final String TEXT_1129 = ".Internal.Wrapper)get";
  protected final String TEXT_1130 = "()).featureMap()).clear(";
  protected final String TEXT_1131 = ");";
  protected final String TEXT_1132 = NL + "\t\t((";
  protected final String TEXT_1133 = ".Internal)get";
  protected final String TEXT_1134 = "()).clear(";
  protected final String TEXT_1135 = ");";
  protected final String TEXT_1136 = NL;
  protected final String TEXT_1137 = NL + "\t\t";
  protected final String TEXT_1138 = ".";
  protected final String TEXT_1139 = "(this);";
  protected final String TEXT_1140 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1141 = "' ";
  protected final String TEXT_1142 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1143 = NL + "\t}" + NL;
  protected final String TEXT_1144 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1145 = "#";
  protected final String TEXT_1146 = " <em>";
  protected final String TEXT_1147 = "</em>}' ";
  protected final String TEXT_1148 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1149 = "</em>' ";
  protected final String TEXT_1150 = " is set.";
  protected final String TEXT_1151 = NL + "\t * @see #unset";
  protected final String TEXT_1152 = "()";
  protected final String TEXT_1153 = NL + "\t * @see #";
  protected final String TEXT_1154 = "()";
  protected final String TEXT_1155 = NL + "\t * @see #set";
  protected final String TEXT_1156 = "(";
  protected final String TEXT_1157 = ")";
  protected final String TEXT_1158 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1159 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1160 = NL + "\tboolean isSet";
  protected final String TEXT_1161 = "();" + NL;
  protected final String TEXT_1162 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1163 = "()" + NL + "\t{";
  protected final String TEXT_1164 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1165 = ");";
  protected final String TEXT_1166 = NL + "\t\t";
  protected final String TEXT_1167 = " ";
  protected final String TEXT_1168 = " = (";
  protected final String TEXT_1169 = ")eVirtualGet(";
  protected final String TEXT_1170 = ");";
  protected final String TEXT_1171 = NL + "\t\treturn ";
  protected final String TEXT_1172 = " != null && ((";
  protected final String TEXT_1173 = ".Unsettable)";
  protected final String TEXT_1174 = ").isSet();";
  protected final String TEXT_1175 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1176 = ");";
  protected final String TEXT_1177 = NL + "\t\treturn (";
  protected final String TEXT_1178 = " & ";
  protected final String TEXT_1179 = "_ESETFLAG) != 0;";
  protected final String TEXT_1180 = NL + "\t\treturn ";
  protected final String TEXT_1181 = "ESet;";
  protected final String TEXT_1182 = NL + "\t\treturn !((";
  protected final String TEXT_1183 = ".Internal)((";
  protected final String TEXT_1184 = ".Internal.Wrapper)get";
  protected final String TEXT_1185 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1186 = ");";
  protected final String TEXT_1187 = NL + "\t\treturn !((";
  protected final String TEXT_1188 = ".Internal)get";
  protected final String TEXT_1189 = "()).isEmpty(";
  protected final String TEXT_1190 = ");";
  protected final String TEXT_1191 = NL;
  protected final String TEXT_1192 = NL + "\t\treturn ";
  protected final String TEXT_1193 = ".";
  protected final String TEXT_1194 = "(this);";
  protected final String TEXT_1195 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1196 = "' ";
  protected final String TEXT_1197 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1198 = NL + "\t}" + NL;
  protected final String TEXT_1199 = NL;
  protected final String TEXT_1200 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1201 = "() <em>";
  protected final String TEXT_1202 = "</em>}' ";
  protected final String TEXT_1203 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1204 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1205 = "_ESUBSETS = ";
  protected final String TEXT_1206 = ";" + NL;
  protected final String TEXT_1207 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1208 = "() <em>";
  protected final String TEXT_1209 = "</em>}' ";
  protected final String TEXT_1210 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1211 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1212 = "_ESUPERSETS = ";
  protected final String TEXT_1213 = ";" + NL;
  protected final String TEXT_1214 = NL + "\t/**";
  protected final String TEXT_1215 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1216 = "}, with the specified ";
  protected final String TEXT_1217 = ", and appends it to the '<em><b>";
  protected final String TEXT_1218 = "</b></em>' ";
  protected final String TEXT_1219 = ".";
  protected final String TEXT_1220 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1221 = "}, with the specified ";
  protected final String TEXT_1222 = ", and sets the '<em><b>";
  protected final String TEXT_1223 = "</b></em>' ";
  protected final String TEXT_1224 = ".";
  protected final String TEXT_1225 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1226 = "} and appends it to the '<em><b>";
  protected final String TEXT_1227 = "</b></em>' ";
  protected final String TEXT_1228 = ".";
  protected final String TEXT_1229 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1230 = "} and sets the '<em><b>";
  protected final String TEXT_1231 = "</b></em>' ";
  protected final String TEXT_1232 = ".";
  protected final String TEXT_1233 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1234 = NL + "\t * @param ";
  protected final String TEXT_1235 = " The ";
  protected final String TEXT_1236 = " for the new {@link ";
  protected final String TEXT_1237 = "}, or <code>null</code>.";
  protected final String TEXT_1238 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1239 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1240 = "}." + NL + "\t * @see #";
  protected final String TEXT_1241 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1242 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1243 = NL + "\t";
  protected final String TEXT_1244 = " create";
  protected final String TEXT_1245 = "(";
  protected final String TEXT_1246 = ", ";
  protected final String TEXT_1247 = " eClass);" + NL;
  protected final String TEXT_1248 = NL + "\tpublic ";
  protected final String TEXT_1249 = " create";
  protected final String TEXT_1250 = "(";
  protected final String TEXT_1251 = ", ";
  protected final String TEXT_1252 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1253 = " new";
  protected final String TEXT_1254 = " = (";
  protected final String TEXT_1255 = ") create(eClass);";
  protected final String TEXT_1256 = NL + "\t\t";
  protected final String TEXT_1257 = "().add(new";
  protected final String TEXT_1258 = ");";
  protected final String TEXT_1259 = NL + "\t\tset";
  protected final String TEXT_1260 = "(new";
  protected final String TEXT_1261 = ");";
  protected final String TEXT_1262 = NL + "\t\tint ";
  protected final String TEXT_1263 = "ListSize = 0;";
  protected final String TEXT_1264 = NL + "\t\tint ";
  protected final String TEXT_1265 = "Size = ";
  protected final String TEXT_1266 = " == null ? 0 : ";
  protected final String TEXT_1267 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1268 = "Size > ";
  protected final String TEXT_1269 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1270 = "ListSize = ";
  protected final String TEXT_1271 = "Size;";
  protected final String TEXT_1272 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1273 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1274 = ".create";
  protected final String TEXT_1275 = "(";
  protected final String TEXT_1276 = ", ";
  protected final String TEXT_1277 = "i < ";
  protected final String TEXT_1278 = "Size ? (";
  protected final String TEXT_1279 = ") ";
  protected final String TEXT_1280 = ".get(i) : null";
  protected final String TEXT_1281 = ");" + NL + "\t\t}";
  protected final String TEXT_1282 = NL + "\t\tnew";
  protected final String TEXT_1283 = ".create";
  protected final String TEXT_1284 = "(";
  protected final String TEXT_1285 = ", ";
  protected final String TEXT_1286 = ");";
  protected final String TEXT_1287 = NL + "\t\tif (";
  protected final String TEXT_1288 = " != null)";
  protected final String TEXT_1289 = NL + "\t\t\tnew";
  protected final String TEXT_1290 = ".";
  protected final String TEXT_1291 = "().addAll(";
  protected final String TEXT_1292 = ");";
  protected final String TEXT_1293 = NL + "\t\t\tnew";
  protected final String TEXT_1294 = ".set";
  protected final String TEXT_1295 = "(";
  protected final String TEXT_1296 = ");";
  protected final String TEXT_1297 = NL + "\t\treturn new";
  protected final String TEXT_1298 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1299 = NL + "\t/**";
  protected final String TEXT_1300 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1301 = "}, with the specified ";
  protected final String TEXT_1302 = ", and appends it to the '<em><b>";
  protected final String TEXT_1303 = "</b></em>' ";
  protected final String TEXT_1304 = ".";
  protected final String TEXT_1305 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1306 = "},with the specified ";
  protected final String TEXT_1307 = ", and sets the '<em><b>";
  protected final String TEXT_1308 = "</b></em>' ";
  protected final String TEXT_1309 = ".";
  protected final String TEXT_1310 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1311 = "} and appends it to the '<em><b>";
  protected final String TEXT_1312 = "</b></em>' ";
  protected final String TEXT_1313 = ".";
  protected final String TEXT_1314 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1315 = "} and sets the '<em><b>";
  protected final String TEXT_1316 = "</b></em>' ";
  protected final String TEXT_1317 = ".";
  protected final String TEXT_1318 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1319 = NL + "\t * @param ";
  protected final String TEXT_1320 = " The ";
  protected final String TEXT_1321 = " for the new {@link ";
  protected final String TEXT_1322 = "}, or <code>null</code>.";
  protected final String TEXT_1323 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1324 = "}." + NL + "\t * @see #";
  protected final String TEXT_1325 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1326 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1327 = NL + "\t";
  protected final String TEXT_1328 = " create";
  protected final String TEXT_1329 = "(";
  protected final String TEXT_1330 = ");" + NL;
  protected final String TEXT_1331 = NL + "\tpublic ";
  protected final String TEXT_1332 = " create";
  protected final String TEXT_1333 = "(";
  protected final String TEXT_1334 = ")" + NL + "\t{";
  protected final String TEXT_1335 = NL + "\t\treturn create";
  protected final String TEXT_1336 = "(";
  protected final String TEXT_1337 = ", ";
  protected final String TEXT_1338 = ");";
  protected final String TEXT_1339 = NL + "\t\t";
  protected final String TEXT_1340 = " new";
  protected final String TEXT_1341 = " = (";
  protected final String TEXT_1342 = ") create(";
  protected final String TEXT_1343 = ");";
  protected final String TEXT_1344 = NL + "\t\t";
  protected final String TEXT_1345 = "().add(new";
  protected final String TEXT_1346 = ");";
  protected final String TEXT_1347 = NL + "\t\tset";
  protected final String TEXT_1348 = "(new";
  protected final String TEXT_1349 = ");";
  protected final String TEXT_1350 = NL + "\t\tint ";
  protected final String TEXT_1351 = "ListSize = 0;";
  protected final String TEXT_1352 = NL + "\t\tint ";
  protected final String TEXT_1353 = "Size = ";
  protected final String TEXT_1354 = " == null ? 0 : ";
  protected final String TEXT_1355 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1356 = "Size > ";
  protected final String TEXT_1357 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1358 = "ListSize = ";
  protected final String TEXT_1359 = "Size;";
  protected final String TEXT_1360 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1361 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1362 = ".create";
  protected final String TEXT_1363 = "(";
  protected final String TEXT_1364 = ", ";
  protected final String TEXT_1365 = "i < ";
  protected final String TEXT_1366 = "Size ? (";
  protected final String TEXT_1367 = ") ";
  protected final String TEXT_1368 = ".get(i) : null";
  protected final String TEXT_1369 = ");" + NL + "\t\t}";
  protected final String TEXT_1370 = NL + "\t\tnew";
  protected final String TEXT_1371 = ".create";
  protected final String TEXT_1372 = "(";
  protected final String TEXT_1373 = ", ";
  protected final String TEXT_1374 = ");";
  protected final String TEXT_1375 = NL + "\t\tif (";
  protected final String TEXT_1376 = " != null)";
  protected final String TEXT_1377 = NL + "\t\t\tnew";
  protected final String TEXT_1378 = ".";
  protected final String TEXT_1379 = "().addAll(";
  protected final String TEXT_1380 = ");";
  protected final String TEXT_1381 = NL + "\t\t\tnew";
  protected final String TEXT_1382 = ".set";
  protected final String TEXT_1383 = "(";
  protected final String TEXT_1384 = ");";
  protected final String TEXT_1385 = NL + "\t\treturn new";
  protected final String TEXT_1386 = ";";
  protected final String TEXT_1387 = NL + "\t}" + NL;
  protected final String TEXT_1388 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1389 = "} with the specified ";
  protected final String TEXT_1390 = " from the '<em><b>";
  protected final String TEXT_1391 = "</b></em>' ";
  protected final String TEXT_1392 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1393 = NL + "\t * @param ";
  protected final String TEXT_1394 = " The ";
  protected final String TEXT_1395 = " of the {@link ";
  protected final String TEXT_1396 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1397 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1398 = "} with the specified ";
  protected final String TEXT_1399 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1400 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1401 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1402 = NL + "\t";
  protected final String TEXT_1403 = " get";
  protected final String TEXT_1404 = "(";
  protected final String TEXT_1405 = ");" + NL;
  protected final String TEXT_1406 = NL + "\tpublic ";
  protected final String TEXT_1407 = " get";
  protected final String TEXT_1408 = "(";
  protected final String TEXT_1409 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1410 = "(";
  protected final String TEXT_1411 = ", false";
  protected final String TEXT_1412 = ", null";
  protected final String TEXT_1413 = ", false";
  protected final String TEXT_1414 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1415 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1416 = "} with the specified ";
  protected final String TEXT_1417 = " from the '<em><b>";
  protected final String TEXT_1418 = "</b></em>' ";
  protected final String TEXT_1419 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1420 = NL + "\t * @param ";
  protected final String TEXT_1421 = " The ";
  protected final String TEXT_1422 = " of the {@link ";
  protected final String TEXT_1423 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1424 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1425 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1426 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1427 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1428 = "} on demand if not found.";
  protected final String TEXT_1429 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1430 = "} with the specified ";
  protected final String TEXT_1431 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1432 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1433 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1434 = NL + "\t";
  protected final String TEXT_1435 = " get";
  protected final String TEXT_1436 = "(";
  protected final String TEXT_1437 = ", boolean ignoreCase";
  protected final String TEXT_1438 = ", ";
  protected final String TEXT_1439 = " eClass";
  protected final String TEXT_1440 = ", boolean createOnDemand";
  protected final String TEXT_1441 = ");" + NL;
  protected final String TEXT_1442 = NL + "\tpublic ";
  protected final String TEXT_1443 = " get";
  protected final String TEXT_1444 = "(";
  protected final String TEXT_1445 = ", boolean ignoreCase";
  protected final String TEXT_1446 = ", ";
  protected final String TEXT_1447 = " eClass";
  protected final String TEXT_1448 = ", boolean createOnDemand";
  protected final String TEXT_1449 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1450 = "Loop: for (";
  protected final String TEXT_1451 = " i = ";
  protected final String TEXT_1452 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1453 = " ";
  protected final String TEXT_1454 = " = (";
  protected final String TEXT_1455 = ") i.next();";
  protected final String TEXT_1456 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1457 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1458 = "Loop;";
  protected final String TEXT_1459 = NL + "\t\t\t";
  protected final String TEXT_1460 = " ";
  protected final String TEXT_1461 = "List = ";
  protected final String TEXT_1462 = ".";
  protected final String TEXT_1463 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1464 = "ListSize = ";
  protected final String TEXT_1465 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1466 = " || (";
  protected final String TEXT_1467 = " != null && ";
  protected final String TEXT_1468 = ".size() != ";
  protected final String TEXT_1469 = "ListSize";
  protected final String TEXT_1470 = ")";
  protected final String TEXT_1471 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1472 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1473 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1474 = " ";
  protected final String TEXT_1475 = " = (";
  protected final String TEXT_1476 = ") ";
  protected final String TEXT_1477 = "List.get(j);";
  protected final String TEXT_1478 = NL + "\t\t\t\tif (";
  protected final String TEXT_1479 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_1480 = ")";
  protected final String TEXT_1481 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1482 = ".";
  protected final String TEXT_1483 = "()) : ";
  protected final String TEXT_1484 = ".get(j).equals(";
  protected final String TEXT_1485 = ".";
  protected final String TEXT_1486 = "())))";
  protected final String TEXT_1487 = NL + "\t\t\t\tif (";
  protected final String TEXT_1488 = " != null && !";
  protected final String TEXT_1489 = ".get(j).equals(";
  protected final String TEXT_1490 = ".";
  protected final String TEXT_1491 = "()))";
  protected final String TEXT_1492 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1493 = "Loop;";
  protected final String TEXT_1494 = NL + "\t\t\t}";
  protected final String TEXT_1495 = NL + "\t\t\t";
  protected final String TEXT_1496 = " ";
  protected final String TEXT_1497 = " = ";
  protected final String TEXT_1498 = ".";
  protected final String TEXT_1499 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1500 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1501 = "Loop;";
  protected final String TEXT_1502 = NL + "\t\t\tif (";
  protected final String TEXT_1503 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1504 = ".equalsIgnoreCase(";
  protected final String TEXT_1505 = ".";
  protected final String TEXT_1506 = "()) : ";
  protected final String TEXT_1507 = ".equals(";
  protected final String TEXT_1508 = ".";
  protected final String TEXT_1509 = "())))";
  protected final String TEXT_1510 = NL + "\t\t\tif (";
  protected final String TEXT_1511 = " != null && !";
  protected final String TEXT_1512 = ".equals(";
  protected final String TEXT_1513 = ".";
  protected final String TEXT_1514 = "()))";
  protected final String TEXT_1515 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1516 = "Loop;";
  protected final String TEXT_1517 = NL + "\t\t\tif (";
  protected final String TEXT_1518 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1519 = ".equalsIgnoreCase(";
  protected final String TEXT_1520 = ".";
  protected final String TEXT_1521 = "()) : ";
  protected final String TEXT_1522 = ".equals(";
  protected final String TEXT_1523 = ".";
  protected final String TEXT_1524 = "())))";
  protected final String TEXT_1525 = NL + "\t\t\tif (";
  protected final String TEXT_1526 = " != null && !";
  protected final String TEXT_1527 = ".equals(";
  protected final String TEXT_1528 = ".";
  protected final String TEXT_1529 = "()))";
  protected final String TEXT_1530 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1531 = "Loop;";
  protected final String TEXT_1532 = NL + "\t\t\treturn ";
  protected final String TEXT_1533 = ";" + NL + "\t\t}";
  protected final String TEXT_1534 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1535 = " && eClass != null";
  protected final String TEXT_1536 = " ? create";
  protected final String TEXT_1537 = "(";
  protected final String TEXT_1538 = ", eClass";
  protected final String TEXT_1539 = ") : null;";
  protected final String TEXT_1540 = NL + "\t\treturn null;";
  protected final String TEXT_1541 = NL + "\t}" + NL;
  protected final String TEXT_1542 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1543 = "()" + NL + "\t{";
  protected final String TEXT_1544 = NL + "  \t\treturn false;";
  protected final String TEXT_1545 = NL + "\t\treturn !((";
  protected final String TEXT_1546 = ".Internal.Wrapper)";
  protected final String TEXT_1547 = "()).featureMap().isEmpty();";
  protected final String TEXT_1548 = NL + "\t\treturn ";
  protected final String TEXT_1549 = " != null && !";
  protected final String TEXT_1550 = ".featureMap().isEmpty();";
  protected final String TEXT_1551 = NL + "\t\treturn ";
  protected final String TEXT_1552 = " != null && !";
  protected final String TEXT_1553 = ".isEmpty();";
  protected final String TEXT_1554 = NL + "\t\t";
  protected final String TEXT_1555 = " ";
  protected final String TEXT_1556 = " = (";
  protected final String TEXT_1557 = ")eVirtualGet(";
  protected final String TEXT_1558 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1559 = " != null && !";
  protected final String TEXT_1560 = ".isEmpty();";
  protected final String TEXT_1561 = NL + "\t\treturn !";
  protected final String TEXT_1562 = "().isEmpty();";
  protected final String TEXT_1563 = NL + "\t\treturn ";
  protected final String TEXT_1564 = " != null;";
  protected final String TEXT_1565 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1566 = ") != null;";
  protected final String TEXT_1567 = NL + "\t\treturn basicGet";
  protected final String TEXT_1568 = "() != null;";
  protected final String TEXT_1569 = NL + "\t\treturn ";
  protected final String TEXT_1570 = " != null;";
  protected final String TEXT_1571 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1572 = ") != null;";
  protected final String TEXT_1573 = NL + "\t\treturn ";
  protected final String TEXT_1574 = "() != null;";
  protected final String TEXT_1575 = NL + "\t\treturn ((";
  protected final String TEXT_1576 = " & ";
  protected final String TEXT_1577 = "_EFLAG) != 0) != ";
  protected final String TEXT_1578 = "_EDEFAULT;";
  protected final String TEXT_1579 = NL + "\t\treturn ";
  protected final String TEXT_1580 = " != ";
  protected final String TEXT_1581 = "_EDEFAULT;";
  protected final String TEXT_1582 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1583 = ", ";
  protected final String TEXT_1584 = "_EDEFAULT) != ";
  protected final String TEXT_1585 = "_EDEFAULT;";
  protected final String TEXT_1586 = NL + "\t\treturn ";
  protected final String TEXT_1587 = "() != ";
  protected final String TEXT_1588 = "_EDEFAULT;";
  protected final String TEXT_1589 = NL + "\t\treturn ";
  protected final String TEXT_1590 = "_EDEFAULT == null ? ";
  protected final String TEXT_1591 = " != null : !";
  protected final String TEXT_1592 = "_EDEFAULT.equals(";
  protected final String TEXT_1593 = ");";
  protected final String TEXT_1594 = NL + "\t\t";
  protected final String TEXT_1595 = " ";
  protected final String TEXT_1596 = " = (";
  protected final String TEXT_1597 = ")eVirtualGet(";
  protected final String TEXT_1598 = ", ";
  protected final String TEXT_1599 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1600 = "_EDEFAULT == null ? ";
  protected final String TEXT_1601 = " != null : !";
  protected final String TEXT_1602 = "_EDEFAULT.equals(";
  protected final String TEXT_1603 = ");";
  protected final String TEXT_1604 = NL + "\t\treturn ";
  protected final String TEXT_1605 = "_EDEFAULT == null ? ";
  protected final String TEXT_1606 = "() != null : !";
  protected final String TEXT_1607 = "_EDEFAULT.equals(";
  protected final String TEXT_1608 = "());";
  protected final String TEXT_1609 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1610 = ");";
  protected final String TEXT_1611 = NL + "\t\t";
  protected final String TEXT_1612 = " ";
  protected final String TEXT_1613 = " = (";
  protected final String TEXT_1614 = ")eVirtualGet(";
  protected final String TEXT_1615 = ");";
  protected final String TEXT_1616 = NL + "\t\treturn ";
  protected final String TEXT_1617 = " != null && ((";
  protected final String TEXT_1618 = ".Unsettable)";
  protected final String TEXT_1619 = ").isSet();";
  protected final String TEXT_1620 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1621 = ");";
  protected final String TEXT_1622 = NL + "\t\treturn (";
  protected final String TEXT_1623 = " & ";
  protected final String TEXT_1624 = "_ESETFLAG) != 0;";
  protected final String TEXT_1625 = NL + "\t\treturn ";
  protected final String TEXT_1626 = "ESet;";
  protected final String TEXT_1627 = NL + "\t\treturn !((";
  protected final String TEXT_1628 = ".Internal)((";
  protected final String TEXT_1629 = ".Internal.Wrapper)get";
  protected final String TEXT_1630 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1631 = ");";
  protected final String TEXT_1632 = NL + "\t\treturn !((";
  protected final String TEXT_1633 = ".Internal)get";
  protected final String TEXT_1634 = "()).isEmpty(";
  protected final String TEXT_1635 = ");";
  protected final String TEXT_1636 = NL;
  protected final String TEXT_1637 = NL + "\t\treturn ";
  protected final String TEXT_1638 = ".";
  protected final String TEXT_1639 = "(this);";
  protected final String TEXT_1640 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1641 = "' ";
  protected final String TEXT_1642 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1643 = NL + "\t}" + NL;
  protected final String TEXT_1644 = NL;
  protected final String TEXT_1645 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1646 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1647 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1648 = NL + "\t * @model ";
  protected final String TEXT_1649 = NL + "\t *        ";
  protected final String TEXT_1650 = NL + "\t * @model";
  protected final String TEXT_1651 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1652 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1653 = NL + "\t";
  protected final String TEXT_1654 = " ";
  protected final String TEXT_1655 = "(";
  protected final String TEXT_1656 = ")";
  protected final String TEXT_1657 = ";" + NL;
  protected final String TEXT_1658 = NL + "\tpublic ";
  protected final String TEXT_1659 = " ";
  protected final String TEXT_1660 = "(";
  protected final String TEXT_1661 = ")";
  protected final String TEXT_1662 = NL + "\t{";
  protected final String TEXT_1663 = NL + "\t\t";
  protected final String TEXT_1664 = NL + "\t\treturn ";
  protected final String TEXT_1665 = ".";
  protected final String TEXT_1666 = "(this, ";
  protected final String TEXT_1667 = ", ";
  protected final String TEXT_1668 = ");";
  protected final String TEXT_1669 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1670 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1671 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1672 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1673 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1674 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1675 = ".";
  protected final String TEXT_1676 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1677 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1678 = "\", ";
  protected final String TEXT_1679 = ".getObjectLabel(this, ";
  protected final String TEXT_1680 = ") }),";
  protected final String TEXT_1681 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1682 = NL + "\t\t";
  protected final String TEXT_1683 = ".";
  protected final String TEXT_1684 = "(this";
  protected final String TEXT_1685 = ", ";
  protected final String TEXT_1686 = ");";
  protected final String TEXT_1687 = NL + "\t\t";
  protected final String TEXT_1688 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1689 = " result = (";
  protected final String TEXT_1690 = ") cache.get(";
  protected final String TEXT_1691 = "eResource(), ";
  protected final String TEXT_1692 = "this, ";
  protected final String TEXT_1693 = ".getEOperations().get(";
  protected final String TEXT_1694 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1695 = "eResource(), ";
  protected final String TEXT_1696 = "this, ";
  protected final String TEXT_1697 = ".getEOperations().get(";
  protected final String TEXT_1698 = "), result = ";
  protected final String TEXT_1699 = "new ";
  protected final String TEXT_1700 = "(";
  protected final String TEXT_1701 = ".";
  protected final String TEXT_1702 = "(this";
  protected final String TEXT_1703 = ", ";
  protected final String TEXT_1704 = ")";
  protected final String TEXT_1705 = ")";
  protected final String TEXT_1706 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1707 = ".";
  protected final String TEXT_1708 = "()";
  protected final String TEXT_1709 = ";" + NL + "\t\t}";
  protected final String TEXT_1710 = NL + "\t\treturn ";
  protected final String TEXT_1711 = ".";
  protected final String TEXT_1712 = "(this";
  protected final String TEXT_1713 = ", ";
  protected final String TEXT_1714 = ");";
  protected final String TEXT_1715 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1716 = NL + "\t}" + NL;
  protected final String TEXT_1717 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1718 = " eInverseAdd(";
  protected final String TEXT_1719 = " otherEnd, int featureID, ";
  protected final String TEXT_1720 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1721 = NL + "\t\t\tcase ";
  protected final String TEXT_1722 = ":";
  protected final String TEXT_1723 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1724 = ")((";
  protected final String TEXT_1725 = ".InternalMapView)";
  protected final String TEXT_1726 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1727 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1728 = ")";
  protected final String TEXT_1729 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1730 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1731 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1732 = "((";
  protected final String TEXT_1733 = ")otherEnd, msgs);";
  protected final String TEXT_1734 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1735 = ", msgs);";
  protected final String TEXT_1736 = NL + "\t\t\t\t";
  protected final String TEXT_1737 = " ";
  protected final String TEXT_1738 = " = (";
  protected final String TEXT_1739 = ")eVirtualGet(";
  protected final String TEXT_1740 = ");";
  protected final String TEXT_1741 = NL + "\t\t\t\tif (";
  protected final String TEXT_1742 = " != null)";
  protected final String TEXT_1743 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1744 = ")";
  protected final String TEXT_1745 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1746 = ", null, msgs);";
  protected final String TEXT_1747 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1748 = ")";
  protected final String TEXT_1749 = ").eInverseRemove(this, ";
  protected final String TEXT_1750 = ", ";
  protected final String TEXT_1751 = ".class, msgs);";
  protected final String TEXT_1752 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1753 = "((";
  protected final String TEXT_1754 = ")otherEnd, msgs);";
  protected final String TEXT_1755 = NL + "\t\t}";
  protected final String TEXT_1756 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1757 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1758 = NL + "\t}" + NL;
  protected final String TEXT_1759 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1760 = " eInverseRemove(";
  protected final String TEXT_1761 = " otherEnd, int featureID, ";
  protected final String TEXT_1762 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1763 = NL + "\t\t\tcase ";
  protected final String TEXT_1764 = ":";
  protected final String TEXT_1765 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1766 = ")((";
  protected final String TEXT_1767 = ".InternalMapView)";
  protected final String TEXT_1768 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1769 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1770 = ")((";
  protected final String TEXT_1771 = ".Internal.Wrapper)";
  protected final String TEXT_1772 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1773 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1774 = ")";
  protected final String TEXT_1775 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1776 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1777 = ", msgs);";
  protected final String TEXT_1778 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1779 = "(msgs);";
  protected final String TEXT_1780 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1781 = "(null, msgs);";
  protected final String TEXT_1782 = NL + "\t\t}";
  protected final String TEXT_1783 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1784 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1785 = NL + "\t}" + NL;
  protected final String TEXT_1786 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1787 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1788 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1789 = NL + "\t\t\tcase ";
  protected final String TEXT_1790 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1791 = ", ";
  protected final String TEXT_1792 = ".class, msgs);";
  protected final String TEXT_1793 = NL + "\t\t}";
  protected final String TEXT_1794 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1795 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1796 = NL + "\t}" + NL;
  protected final String TEXT_1797 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1798 = NL + "\t\t\tcase ";
  protected final String TEXT_1799 = ":";
  protected final String TEXT_1800 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1801 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1802 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1803 = "(";
  protected final String TEXT_1804 = "());";
  protected final String TEXT_1805 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1806 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1807 = "();";
  protected final String TEXT_1808 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1809 = ".InternalMapView)";
  protected final String TEXT_1810 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1811 = "();";
  protected final String TEXT_1812 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1813 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1814 = "().map();";
  protected final String TEXT_1815 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1816 = ".Internal.Wrapper)";
  protected final String TEXT_1817 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1818 = "();";
  protected final String TEXT_1819 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1820 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1821 = ".Internal)";
  protected final String TEXT_1822 = "()).getWrapper();";
  protected final String TEXT_1823 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1824 = "();";
  protected final String TEXT_1825 = NL + "\t\t}";
  protected final String TEXT_1826 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1827 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1828 = NL + "\t}" + NL;
  protected final String TEXT_1829 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1830 = NL + "\t\t\tcase ";
  protected final String TEXT_1831 = ":";
  protected final String TEXT_1832 = NL + "\t\t\t\t((";
  protected final String TEXT_1833 = ".Internal)((";
  protected final String TEXT_1834 = ".Internal.Wrapper)";
  protected final String TEXT_1835 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1836 = NL + "\t\t\t\t((";
  protected final String TEXT_1837 = ".Internal)";
  protected final String TEXT_1838 = "()).set(newValue);";
  protected final String TEXT_1839 = NL + "\t\t\t\t((";
  protected final String TEXT_1840 = ".Setting)((";
  protected final String TEXT_1841 = ".InternalMapView)";
  protected final String TEXT_1842 = "()).eMap()).set(newValue);";
  protected final String TEXT_1843 = NL + "\t\t\t\t((";
  protected final String TEXT_1844 = ".Setting)";
  protected final String TEXT_1845 = "()).set(newValue);";
  protected final String TEXT_1846 = NL + "\t\t\t\t";
  protected final String TEXT_1847 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1848 = "().addAll((";
  protected final String TEXT_1849 = ")newValue);";
  protected final String TEXT_1850 = NL + "\t\t\t\tset";
  protected final String TEXT_1851 = "(((";
  protected final String TEXT_1852 = ")newValue).";
  protected final String TEXT_1853 = "());";
  protected final String TEXT_1854 = NL + "\t\t\t\tset";
  protected final String TEXT_1855 = "((";
  protected final String TEXT_1856 = ")newValue);";
  protected final String TEXT_1857 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1858 = NL + "\t\t}";
  protected final String TEXT_1859 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1860 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1861 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1862 = NL + "\t\t\tcase ";
  protected final String TEXT_1863 = ":";
  protected final String TEXT_1864 = NL + "\t\t\t\t((";
  protected final String TEXT_1865 = ".Internal.Wrapper)";
  protected final String TEXT_1866 = "()).featureMap().clear();";
  protected final String TEXT_1867 = NL + "\t\t\t\t";
  protected final String TEXT_1868 = "().clear();";
  protected final String TEXT_1869 = NL + "\t\t\t\tunset";
  protected final String TEXT_1870 = "();";
  protected final String TEXT_1871 = NL + "\t\t\t\tset";
  protected final String TEXT_1872 = "((";
  protected final String TEXT_1873 = ")null);";
  protected final String TEXT_1874 = NL + "\t\t\t\tset";
  protected final String TEXT_1875 = "(";
  protected final String TEXT_1876 = "_EDEFAULT);";
  protected final String TEXT_1877 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1878 = NL + "\t\t}";
  protected final String TEXT_1879 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1880 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1881 = NL + "\t}" + NL;
  protected final String TEXT_1882 = NL;
  protected final String TEXT_1883 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1884 = NL + "\t\t\tcase ";
  protected final String TEXT_1885 = ":";
  protected final String TEXT_1886 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1887 = "();";
  protected final String TEXT_1888 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1889 = ".Internal.Wrapper)";
  protected final String TEXT_1890 = "()).featureMap().isEmpty();";
  protected final String TEXT_1891 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1892 = " != null && !";
  protected final String TEXT_1893 = ".featureMap().isEmpty();";
  protected final String TEXT_1894 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1895 = " != null && !";
  protected final String TEXT_1896 = ".isEmpty();";
  protected final String TEXT_1897 = NL + "\t\t\t\t";
  protected final String TEXT_1898 = " ";
  protected final String TEXT_1899 = " = (";
  protected final String TEXT_1900 = ")eVirtualGet(";
  protected final String TEXT_1901 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1902 = " != null && !";
  protected final String TEXT_1903 = ".isEmpty();";
  protected final String TEXT_1904 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1905 = "().isEmpty();";
  protected final String TEXT_1906 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1907 = "();";
  protected final String TEXT_1908 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1909 = " != null;";
  protected final String TEXT_1910 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1911 = ") != null;";
  protected final String TEXT_1912 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1913 = "() != null;";
  protected final String TEXT_1914 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1915 = " != null;";
  protected final String TEXT_1916 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1917 = ") != null;";
  protected final String TEXT_1918 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1919 = "() != null;";
  protected final String TEXT_1920 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1921 = " & ";
  protected final String TEXT_1922 = "_EFLAG) != 0) != ";
  protected final String TEXT_1923 = "_EDEFAULT;";
  protected final String TEXT_1924 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1925 = " != ";
  protected final String TEXT_1926 = "_EDEFAULT;";
  protected final String TEXT_1927 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1928 = ", ";
  protected final String TEXT_1929 = "_EDEFAULT) != ";
  protected final String TEXT_1930 = "_EDEFAULT;";
  protected final String TEXT_1931 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1932 = "() != ";
  protected final String TEXT_1933 = "_EDEFAULT;";
  protected final String TEXT_1934 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1935 = "_EDEFAULT == null ? ";
  protected final String TEXT_1936 = " != null : !";
  protected final String TEXT_1937 = "_EDEFAULT.equals(";
  protected final String TEXT_1938 = ");";
  protected final String TEXT_1939 = NL + "\t\t\t\t";
  protected final String TEXT_1940 = " ";
  protected final String TEXT_1941 = " = (";
  protected final String TEXT_1942 = ")eVirtualGet(";
  protected final String TEXT_1943 = ", ";
  protected final String TEXT_1944 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1945 = "_EDEFAULT == null ? ";
  protected final String TEXT_1946 = " != null : !";
  protected final String TEXT_1947 = "_EDEFAULT.equals(";
  protected final String TEXT_1948 = ");";
  protected final String TEXT_1949 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1950 = "_EDEFAULT == null ? ";
  protected final String TEXT_1951 = "() != null : !";
  protected final String TEXT_1952 = "_EDEFAULT.equals(";
  protected final String TEXT_1953 = "());";
  protected final String TEXT_1954 = NL + "\t\t}";
  protected final String TEXT_1955 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1956 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1957 = NL + "\t}" + NL;
  protected final String TEXT_1958 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1959 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1960 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1961 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1962 = ": return ";
  protected final String TEXT_1963 = ";";
  protected final String TEXT_1964 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1965 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1966 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1967 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1968 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1969 = ": return ";
  protected final String TEXT_1970 = ";";
  protected final String TEXT_1971 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1972 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1973 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1974 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1975 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1976 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1977 = NL + "\t\t\tcase ";
  protected final String TEXT_1978 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1979 = ";";
  protected final String TEXT_1980 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1981 = NL + "\t\t\tcase ";
  protected final String TEXT_1982 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1983 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1984 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1985 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1986 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1987 = ": \");";
  protected final String TEXT_1988 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1989 = ": \");";
  protected final String TEXT_1990 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1991 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1992 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1993 = NL + "\t\tif (";
  protected final String TEXT_1994 = "(";
  protected final String TEXT_1995 = " & ";
  protected final String TEXT_1996 = "_ESETFLAG) != 0";
  protected final String TEXT_1997 = "ESet";
  protected final String TEXT_1998 = ") result.append((";
  protected final String TEXT_1999 = " & ";
  protected final String TEXT_2000 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2001 = NL + "\t\tif (";
  protected final String TEXT_2002 = "(";
  protected final String TEXT_2003 = " & ";
  protected final String TEXT_2004 = "_ESETFLAG) != 0";
  protected final String TEXT_2005 = "ESet";
  protected final String TEXT_2006 = ") result.append(";
  protected final String TEXT_2007 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2008 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2009 = ", ";
  protected final String TEXT_2010 = "_EDEFAULT";
  protected final String TEXT_2011 = "));";
  protected final String TEXT_2012 = NL + "\t\tresult.append((";
  protected final String TEXT_2013 = " & ";
  protected final String TEXT_2014 = "_EFLAG) != 0);";
  protected final String TEXT_2015 = NL + "\t\tresult.append(";
  protected final String TEXT_2016 = ");";
  protected final String TEXT_2017 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2018 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_2019 = NL + "\t\treturn new ";
  protected final String TEXT_2020 = "(getTypedKey());";
  protected final String TEXT_2021 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2022 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_2023 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_2024 = ")key);";
  protected final String TEXT_2025 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2026 = ")key).";
  protected final String TEXT_2027 = "());";
  protected final String TEXT_2028 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2029 = ")key);";
  protected final String TEXT_2030 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_2031 = NL + "\t\treturn new ";
  protected final String TEXT_2032 = "(getTypedValue());";
  protected final String TEXT_2033 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2034 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_2035 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_2036 = ")value);";
  protected final String TEXT_2037 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2038 = ")value).";
  protected final String TEXT_2039 = "());";
  protected final String TEXT_2040 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2041 = ")value);";
  protected final String TEXT_2042 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2043 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2044 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2045 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2046 = NL;
  protected final String TEXT_2047 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2048 = " create(";
  protected final String TEXT_2049 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2050 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2051 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2052 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2053 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2054 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2055 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2056 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2057 = " ";
  protected final String TEXT_2058 = "Helper(";
  protected final String TEXT_2059 = " ";
  protected final String TEXT_2060 = ")" + NL + "\t{";
  protected final String TEXT_2061 = NL + "\t\t";
  protected final String TEXT_2062 = ".addAll(super.";
  protected final String TEXT_2063 = "());";
  protected final String TEXT_2064 = NL + "\t\tsuper.";
  protected final String TEXT_2065 = "Helper(";
  protected final String TEXT_2066 = ");";
  protected final String TEXT_2067 = NL + "\t\tif (isSet";
  protected final String TEXT_2068 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2069 = " i = ((";
  protected final String TEXT_2070 = ") ";
  protected final String TEXT_2071 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2072 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2073 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2074 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2075 = " i = ((";
  protected final String TEXT_2076 = ") ";
  protected final String TEXT_2077 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2078 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2079 = NL + "\t\t";
  protected final String TEXT_2080 = " ";
  protected final String TEXT_2081 = " = ";
  protected final String TEXT_2082 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2083 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2084 = " i = ((";
  protected final String TEXT_2085 = ") ";
  protected final String TEXT_2086 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2087 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2088 = NL + "\t\tif (isSet";
  protected final String TEXT_2089 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2090 = ".addAll(";
  protected final String TEXT_2091 = "());" + NL + "\t\t}";
  protected final String TEXT_2092 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2093 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2094 = ".addAll(";
  protected final String TEXT_2095 = "());" + NL + "\t\t}";
  protected final String TEXT_2096 = NL + "\t\t";
  protected final String TEXT_2097 = " ";
  protected final String TEXT_2098 = " = ";
  protected final String TEXT_2099 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2100 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2101 = ".addAll(";
  protected final String TEXT_2102 = ");" + NL + "\t\t}";
  protected final String TEXT_2103 = NL + "\t\tif (isSet";
  protected final String TEXT_2104 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2105 = ".add(";
  protected final String TEXT_2106 = "basicGet";
  protected final String TEXT_2107 = "());" + NL + "\t\t}";
  protected final String TEXT_2108 = NL + "\t\t";
  protected final String TEXT_2109 = " ";
  protected final String TEXT_2110 = " = ";
  protected final String TEXT_2111 = "basicGet";
  protected final String TEXT_2112 = "();" + NL + "\t\tif (";
  protected final String TEXT_2113 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2114 = ".add(";
  protected final String TEXT_2115 = ");" + NL + "\t\t}";
  protected final String TEXT_2116 = NL + "\t\treturn ";
  protected final String TEXT_2117 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2118 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2119 = "()" + NL + "\t{";
  protected final String TEXT_2120 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2121 = "()";
  protected final String TEXT_2122 = NL + "\t\treturn isSet";
  protected final String TEXT_2123 = "()";
  protected final String TEXT_2124 = ";";
  protected final String TEXT_2125 = NL + "\t\treturn !";
  protected final String TEXT_2126 = "().isEmpty()";
  protected final String TEXT_2127 = ";";
  protected final String TEXT_2128 = NL + "\t\treturn ";
  protected final String TEXT_2129 = "basicGet";
  protected final String TEXT_2130 = "() != null";
  protected final String TEXT_2131 = ";";
  protected final String TEXT_2132 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2133 = ")";
  protected final String TEXT_2134 = ";";
  protected final String TEXT_2135 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2136 = "()";
  protected final String TEXT_2137 = ";";
  protected final String TEXT_2138 = NL + "\t\t\t|| !";
  protected final String TEXT_2139 = "().isEmpty()";
  protected final String TEXT_2140 = ";";
  protected final String TEXT_2141 = NL + "\t\t\t|| ";
  protected final String TEXT_2142 = "basicGet";
  protected final String TEXT_2143 = "() != null";
  protected final String TEXT_2144 = ";";
  protected final String TEXT_2145 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2146 = ")";
  protected final String TEXT_2147 = ";";
  protected final String TEXT_2148 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2149 = "();";
  protected final String TEXT_2150 = NL + "\t\treturn false;";
  protected final String TEXT_2151 = NL + "\t}" + NL;
  protected final String TEXT_2152 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2153 = " ";
  protected final String TEXT_2154 = "()" + NL + "\t{";
  protected final String TEXT_2155 = NL + "\t\treturn ";
  protected final String TEXT_2156 = "();";
  protected final String TEXT_2157 = NL + "\t\treturn new ";
  protected final String TEXT_2158 = ".UnmodifiableEList(this, ";
  protected final String TEXT_2159 = "null";
  protected final String TEXT_2160 = ", 0, ";
  protected final String TEXT_2161 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2162 = NL + "\t\treturn null;";
  protected final String TEXT_2163 = NL + "\t\treturn ";
  protected final String TEXT_2164 = "();";
  protected final String TEXT_2165 = NL + "\t}" + NL;
  protected final String TEXT_2166 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2167 = " basicGet";
  protected final String TEXT_2168 = "()" + NL + "\t{";
  protected final String TEXT_2169 = NL + "\t\treturn null;";
  protected final String TEXT_2170 = NL + "\t\treturn ";
  protected final String TEXT_2171 = "basicGet";
  protected final String TEXT_2172 = "();";
  protected final String TEXT_2173 = NL + "\t}" + NL;
  protected final String TEXT_2174 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2175 = " basicSet";
  protected final String TEXT_2176 = "(";
  protected final String TEXT_2177 = " new";
  protected final String TEXT_2178 = ", ";
  protected final String TEXT_2179 = " msgs)" + NL + "\t{";
  protected final String TEXT_2180 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2181 = NL + "\t\tif (new";
  protected final String TEXT_2182 = " != null && !(new";
  protected final String TEXT_2183 = " instanceof ";
  protected final String TEXT_2184 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2185 = "));" + NL + "\t\t}";
  protected final String TEXT_2186 = NL + "\t\treturn basicSet";
  protected final String TEXT_2187 = "(";
  protected final String TEXT_2188 = "(";
  protected final String TEXT_2189 = ") ";
  protected final String TEXT_2190 = "new";
  protected final String TEXT_2191 = ", msgs);";
  protected final String TEXT_2192 = NL + "\t\tset";
  protected final String TEXT_2193 = "(";
  protected final String TEXT_2194 = "(";
  protected final String TEXT_2195 = ") ";
  protected final String TEXT_2196 = "new";
  protected final String TEXT_2197 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2198 = NL + "\t}" + NL;
  protected final String TEXT_2199 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_2200 = "(";
  protected final String TEXT_2201 = " new";
  protected final String TEXT_2202 = ")" + NL + "\t{";
  protected final String TEXT_2203 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2204 = NL + "\t\tif (new";
  protected final String TEXT_2205 = " != null && !(new";
  protected final String TEXT_2206 = " instanceof ";
  protected final String TEXT_2207 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2208 = "));" + NL + "\t\t}";
  protected final String TEXT_2209 = NL + "\t\tset";
  protected final String TEXT_2210 = "(";
  protected final String TEXT_2211 = "(";
  protected final String TEXT_2212 = ") ";
  protected final String TEXT_2213 = "new";
  protected final String TEXT_2214 = ");";
  protected final String TEXT_2215 = NL + "\t}" + NL;
  protected final String TEXT_2216 = NL;
  protected final String TEXT_2217 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2218 = "() <em>";
  protected final String TEXT_2219 = "</em>}' ";
  protected final String TEXT_2220 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2221 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2222 = "_ESUBSETS = ";
  protected final String TEXT_2223 = ";" + NL;
  protected final String TEXT_2224 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2225 = "() <em>";
  protected final String TEXT_2226 = "</em>}' ";
  protected final String TEXT_2227 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2228 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2229 = "_ESUPERSETS = ";
  protected final String TEXT_2230 = ";" + NL;
  protected final String TEXT_2231 = NL + "\t/**";
  protected final String TEXT_2232 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2233 = "}, with the specified ";
  protected final String TEXT_2234 = ", and appends it to the '<em><b>";
  protected final String TEXT_2235 = "</b></em>' ";
  protected final String TEXT_2236 = ".";
  protected final String TEXT_2237 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2238 = "}, with the specified ";
  protected final String TEXT_2239 = ", and sets the '<em><b>";
  protected final String TEXT_2240 = "</b></em>' ";
  protected final String TEXT_2241 = ".";
  protected final String TEXT_2242 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2243 = "} and appends it to the '<em><b>";
  protected final String TEXT_2244 = "</b></em>' ";
  protected final String TEXT_2245 = ".";
  protected final String TEXT_2246 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2247 = "} and sets the '<em><b>";
  protected final String TEXT_2248 = "</b></em>' ";
  protected final String TEXT_2249 = ".";
  protected final String TEXT_2250 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2251 = NL + "\t * @param ";
  protected final String TEXT_2252 = " The ";
  protected final String TEXT_2253 = " for the new {@link ";
  protected final String TEXT_2254 = "}, or <code>null</code>.";
  protected final String TEXT_2255 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2256 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2257 = "}." + NL + "\t * @see #";
  protected final String TEXT_2258 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2259 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2260 = NL + "\t";
  protected final String TEXT_2261 = " create";
  protected final String TEXT_2262 = "(";
  protected final String TEXT_2263 = ", ";
  protected final String TEXT_2264 = " eClass);" + NL;
  protected final String TEXT_2265 = NL + "\tpublic ";
  protected final String TEXT_2266 = " create";
  protected final String TEXT_2267 = "(";
  protected final String TEXT_2268 = ", ";
  protected final String TEXT_2269 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2270 = " new";
  protected final String TEXT_2271 = " = (";
  protected final String TEXT_2272 = ") create(eClass);";
  protected final String TEXT_2273 = NL + "\t\t";
  protected final String TEXT_2274 = "().add(new";
  protected final String TEXT_2275 = ");";
  protected final String TEXT_2276 = NL + "\t\tset";
  protected final String TEXT_2277 = "(new";
  protected final String TEXT_2278 = ");";
  protected final String TEXT_2279 = NL + "\t\tint ";
  protected final String TEXT_2280 = "ListSize = 0;";
  protected final String TEXT_2281 = NL + "\t\tint ";
  protected final String TEXT_2282 = "Size = ";
  protected final String TEXT_2283 = " == null ? 0 : ";
  protected final String TEXT_2284 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2285 = "Size > ";
  protected final String TEXT_2286 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2287 = "ListSize = ";
  protected final String TEXT_2288 = "Size;";
  protected final String TEXT_2289 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2290 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2291 = ".create";
  protected final String TEXT_2292 = "(";
  protected final String TEXT_2293 = ", ";
  protected final String TEXT_2294 = "i < ";
  protected final String TEXT_2295 = "Size ? (";
  protected final String TEXT_2296 = ") ";
  protected final String TEXT_2297 = ".get(i) : null";
  protected final String TEXT_2298 = ");" + NL + "\t\t}";
  protected final String TEXT_2299 = NL + "\t\tnew";
  protected final String TEXT_2300 = ".create";
  protected final String TEXT_2301 = "(";
  protected final String TEXT_2302 = ", ";
  protected final String TEXT_2303 = ");";
  protected final String TEXT_2304 = NL + "\t\tif (";
  protected final String TEXT_2305 = " != null)";
  protected final String TEXT_2306 = NL + "\t\t\tnew";
  protected final String TEXT_2307 = ".";
  protected final String TEXT_2308 = "().addAll(";
  protected final String TEXT_2309 = ");";
  protected final String TEXT_2310 = NL + "\t\t\tnew";
  protected final String TEXT_2311 = ".set";
  protected final String TEXT_2312 = "(";
  protected final String TEXT_2313 = ");";
  protected final String TEXT_2314 = NL + "\t\treturn new";
  protected final String TEXT_2315 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2316 = NL + "\t/**";
  protected final String TEXT_2317 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2318 = "}, with the specified ";
  protected final String TEXT_2319 = ", and appends it to the '<em><b>";
  protected final String TEXT_2320 = "</b></em>' ";
  protected final String TEXT_2321 = ".";
  protected final String TEXT_2322 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2323 = "},with the specified ";
  protected final String TEXT_2324 = ", and sets the '<em><b>";
  protected final String TEXT_2325 = "</b></em>' ";
  protected final String TEXT_2326 = ".";
  protected final String TEXT_2327 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2328 = "} and appends it to the '<em><b>";
  protected final String TEXT_2329 = "</b></em>' ";
  protected final String TEXT_2330 = ".";
  protected final String TEXT_2331 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2332 = "} and sets the '<em><b>";
  protected final String TEXT_2333 = "</b></em>' ";
  protected final String TEXT_2334 = ".";
  protected final String TEXT_2335 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2336 = NL + "\t * @param ";
  protected final String TEXT_2337 = " The ";
  protected final String TEXT_2338 = " for the new {@link ";
  protected final String TEXT_2339 = "}, or <code>null</code>.";
  protected final String TEXT_2340 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2341 = "}." + NL + "\t * @see #";
  protected final String TEXT_2342 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2343 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2344 = NL + "\t";
  protected final String TEXT_2345 = " create";
  protected final String TEXT_2346 = "(";
  protected final String TEXT_2347 = ");" + NL;
  protected final String TEXT_2348 = NL + "\tpublic ";
  protected final String TEXT_2349 = " create";
  protected final String TEXT_2350 = "(";
  protected final String TEXT_2351 = ")" + NL + "\t{";
  protected final String TEXT_2352 = NL + "\t\treturn create";
  protected final String TEXT_2353 = "(";
  protected final String TEXT_2354 = ", ";
  protected final String TEXT_2355 = ");";
  protected final String TEXT_2356 = NL + "\t\t";
  protected final String TEXT_2357 = " new";
  protected final String TEXT_2358 = " = (";
  protected final String TEXT_2359 = ") create(";
  protected final String TEXT_2360 = ");";
  protected final String TEXT_2361 = NL + "\t\t";
  protected final String TEXT_2362 = "().add(new";
  protected final String TEXT_2363 = ");";
  protected final String TEXT_2364 = NL + "\t\tset";
  protected final String TEXT_2365 = "(new";
  protected final String TEXT_2366 = ");";
  protected final String TEXT_2367 = NL + "\t\tint ";
  protected final String TEXT_2368 = "ListSize = 0;";
  protected final String TEXT_2369 = NL + "\t\tint ";
  protected final String TEXT_2370 = "Size = ";
  protected final String TEXT_2371 = " == null ? 0 : ";
  protected final String TEXT_2372 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2373 = "Size > ";
  protected final String TEXT_2374 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2375 = "ListSize = ";
  protected final String TEXT_2376 = "Size;";
  protected final String TEXT_2377 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2378 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2379 = ".create";
  protected final String TEXT_2380 = "(";
  protected final String TEXT_2381 = ", ";
  protected final String TEXT_2382 = "i < ";
  protected final String TEXT_2383 = "Size ? (";
  protected final String TEXT_2384 = ") ";
  protected final String TEXT_2385 = ".get(i) : null";
  protected final String TEXT_2386 = ");" + NL + "\t\t}";
  protected final String TEXT_2387 = NL + "\t\tnew";
  protected final String TEXT_2388 = ".create";
  protected final String TEXT_2389 = "(";
  protected final String TEXT_2390 = ", ";
  protected final String TEXT_2391 = ");";
  protected final String TEXT_2392 = NL + "\t\tif (";
  protected final String TEXT_2393 = " != null)";
  protected final String TEXT_2394 = NL + "\t\t\tnew";
  protected final String TEXT_2395 = ".";
  protected final String TEXT_2396 = "().addAll(";
  protected final String TEXT_2397 = ");";
  protected final String TEXT_2398 = NL + "\t\t\tnew";
  protected final String TEXT_2399 = ".set";
  protected final String TEXT_2400 = "(";
  protected final String TEXT_2401 = ");";
  protected final String TEXT_2402 = NL + "\t\treturn new";
  protected final String TEXT_2403 = ";";
  protected final String TEXT_2404 = NL + "\t}" + NL;
  protected final String TEXT_2405 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2406 = "} with the specified ";
  protected final String TEXT_2407 = " from the '<em><b>";
  protected final String TEXT_2408 = "</b></em>' ";
  protected final String TEXT_2409 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2410 = NL + "\t * @param ";
  protected final String TEXT_2411 = " The ";
  protected final String TEXT_2412 = " of the {@link ";
  protected final String TEXT_2413 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2414 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2415 = "} with the specified ";
  protected final String TEXT_2416 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2417 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2418 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2419 = NL + "\t";
  protected final String TEXT_2420 = " get";
  protected final String TEXT_2421 = "(";
  protected final String TEXT_2422 = ");" + NL;
  protected final String TEXT_2423 = NL + "\tpublic ";
  protected final String TEXT_2424 = " get";
  protected final String TEXT_2425 = "(";
  protected final String TEXT_2426 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2427 = "(";
  protected final String TEXT_2428 = ", false";
  protected final String TEXT_2429 = ", null";
  protected final String TEXT_2430 = ", false";
  protected final String TEXT_2431 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2432 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2433 = "} with the specified ";
  protected final String TEXT_2434 = " from the '<em><b>";
  protected final String TEXT_2435 = "</b></em>' ";
  protected final String TEXT_2436 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2437 = NL + "\t * @param ";
  protected final String TEXT_2438 = " The ";
  protected final String TEXT_2439 = " of the {@link ";
  protected final String TEXT_2440 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2441 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2442 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2443 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2444 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2445 = "} on demand if not found.";
  protected final String TEXT_2446 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2447 = "} with the specified ";
  protected final String TEXT_2448 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2449 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2450 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2451 = NL + "\t";
  protected final String TEXT_2452 = " get";
  protected final String TEXT_2453 = "(";
  protected final String TEXT_2454 = ", boolean ignoreCase";
  protected final String TEXT_2455 = ", ";
  protected final String TEXT_2456 = " eClass";
  protected final String TEXT_2457 = ", boolean createOnDemand";
  protected final String TEXT_2458 = ");" + NL;
  protected final String TEXT_2459 = NL + "\tpublic ";
  protected final String TEXT_2460 = " get";
  protected final String TEXT_2461 = "(";
  protected final String TEXT_2462 = ", boolean ignoreCase";
  protected final String TEXT_2463 = ", ";
  protected final String TEXT_2464 = " eClass";
  protected final String TEXT_2465 = ", boolean createOnDemand";
  protected final String TEXT_2466 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2467 = "Loop: for (";
  protected final String TEXT_2468 = " i = ";
  protected final String TEXT_2469 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2470 = " ";
  protected final String TEXT_2471 = " = (";
  protected final String TEXT_2472 = ") i.next();";
  protected final String TEXT_2473 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2474 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2475 = "Loop;";
  protected final String TEXT_2476 = NL + "\t\t\t";
  protected final String TEXT_2477 = " ";
  protected final String TEXT_2478 = "List = ";
  protected final String TEXT_2479 = ".";
  protected final String TEXT_2480 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2481 = "ListSize = ";
  protected final String TEXT_2482 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2483 = " || (";
  protected final String TEXT_2484 = " != null && ";
  protected final String TEXT_2485 = ".size() != ";
  protected final String TEXT_2486 = "ListSize";
  protected final String TEXT_2487 = ")";
  protected final String TEXT_2488 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2489 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2490 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2491 = " ";
  protected final String TEXT_2492 = " = (";
  protected final String TEXT_2493 = ") ";
  protected final String TEXT_2494 = "List.get(j);";
  protected final String TEXT_2495 = NL + "\t\t\t\tif (";
  protected final String TEXT_2496 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2497 = ")";
  protected final String TEXT_2498 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2499 = ".";
  protected final String TEXT_2500 = "()) : ";
  protected final String TEXT_2501 = ".get(j).equals(";
  protected final String TEXT_2502 = ".";
  protected final String TEXT_2503 = "())))";
  protected final String TEXT_2504 = NL + "\t\t\t\tif (";
  protected final String TEXT_2505 = " != null && !";
  protected final String TEXT_2506 = ".get(j).equals(";
  protected final String TEXT_2507 = ".";
  protected final String TEXT_2508 = "()))";
  protected final String TEXT_2509 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2510 = "Loop;";
  protected final String TEXT_2511 = NL + "\t\t\t}";
  protected final String TEXT_2512 = NL + "\t\t\t";
  protected final String TEXT_2513 = " ";
  protected final String TEXT_2514 = " = ";
  protected final String TEXT_2515 = ".";
  protected final String TEXT_2516 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2517 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2518 = "Loop;";
  protected final String TEXT_2519 = NL + "\t\t\tif (";
  protected final String TEXT_2520 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2521 = ".equalsIgnoreCase(";
  protected final String TEXT_2522 = ".";
  protected final String TEXT_2523 = "()) : ";
  protected final String TEXT_2524 = ".equals(";
  protected final String TEXT_2525 = ".";
  protected final String TEXT_2526 = "())))";
  protected final String TEXT_2527 = NL + "\t\t\tif (";
  protected final String TEXT_2528 = " != null && !";
  protected final String TEXT_2529 = ".equals(";
  protected final String TEXT_2530 = ".";
  protected final String TEXT_2531 = "()))";
  protected final String TEXT_2532 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2533 = "Loop;";
  protected final String TEXT_2534 = NL + "\t\t\tif (";
  protected final String TEXT_2535 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2536 = ".equalsIgnoreCase(";
  protected final String TEXT_2537 = ".";
  protected final String TEXT_2538 = "()) : ";
  protected final String TEXT_2539 = ".equals(";
  protected final String TEXT_2540 = ".";
  protected final String TEXT_2541 = "())))";
  protected final String TEXT_2542 = NL + "\t\t\tif (";
  protected final String TEXT_2543 = " != null && !";
  protected final String TEXT_2544 = ".equals(";
  protected final String TEXT_2545 = ".";
  protected final String TEXT_2546 = "()))";
  protected final String TEXT_2547 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2548 = "Loop;";
  protected final String TEXT_2549 = NL + "\t\t\treturn ";
  protected final String TEXT_2550 = ";" + NL + "\t\t}";
  protected final String TEXT_2551 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2552 = " && eClass != null";
  protected final String TEXT_2553 = " ? create";
  protected final String TEXT_2554 = "(";
  protected final String TEXT_2555 = ", eClass";
  protected final String TEXT_2556 = ") : null;";
  protected final String TEXT_2557 = NL + "\t\treturn null;";
  protected final String TEXT_2558 = NL + "\t}" + NL;
  protected final String TEXT_2559 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2560 = "()" + NL + "\t{";
  protected final String TEXT_2561 = NL + "  \t\treturn false;";
  protected final String TEXT_2562 = NL + "\t\treturn !((";
  protected final String TEXT_2563 = ".Internal.Wrapper)";
  protected final String TEXT_2564 = "()).featureMap().isEmpty();";
  protected final String TEXT_2565 = NL + "\t\treturn ";
  protected final String TEXT_2566 = " != null && !";
  protected final String TEXT_2567 = ".featureMap().isEmpty();";
  protected final String TEXT_2568 = NL + "\t\treturn ";
  protected final String TEXT_2569 = " != null && !";
  protected final String TEXT_2570 = ".isEmpty();";
  protected final String TEXT_2571 = NL + "\t\t";
  protected final String TEXT_2572 = " ";
  protected final String TEXT_2573 = " = (";
  protected final String TEXT_2574 = ")eVirtualGet(";
  protected final String TEXT_2575 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2576 = " != null && !";
  protected final String TEXT_2577 = ".isEmpty();";
  protected final String TEXT_2578 = NL + "\t\treturn !";
  protected final String TEXT_2579 = "().isEmpty();";
  protected final String TEXT_2580 = NL + "\t\treturn ";
  protected final String TEXT_2581 = " != null;";
  protected final String TEXT_2582 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2583 = ") != null;";
  protected final String TEXT_2584 = NL + "\t\treturn basicGet";
  protected final String TEXT_2585 = "() != null;";
  protected final String TEXT_2586 = NL + "\t\treturn ";
  protected final String TEXT_2587 = " != null;";
  protected final String TEXT_2588 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2589 = ") != null;";
  protected final String TEXT_2590 = NL + "\t\treturn ";
  protected final String TEXT_2591 = "() != null;";
  protected final String TEXT_2592 = NL + "\t\treturn ((";
  protected final String TEXT_2593 = " & ";
  protected final String TEXT_2594 = "_EFLAG) != 0) != ";
  protected final String TEXT_2595 = "_EDEFAULT;";
  protected final String TEXT_2596 = NL + "\t\treturn ";
  protected final String TEXT_2597 = " != ";
  protected final String TEXT_2598 = "_EDEFAULT;";
  protected final String TEXT_2599 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2600 = ", ";
  protected final String TEXT_2601 = "_EDEFAULT) != ";
  protected final String TEXT_2602 = "_EDEFAULT;";
  protected final String TEXT_2603 = NL + "\t\treturn ";
  protected final String TEXT_2604 = "() != ";
  protected final String TEXT_2605 = "_EDEFAULT;";
  protected final String TEXT_2606 = NL + "\t\treturn ";
  protected final String TEXT_2607 = "_EDEFAULT == null ? ";
  protected final String TEXT_2608 = " != null : !";
  protected final String TEXT_2609 = "_EDEFAULT.equals(";
  protected final String TEXT_2610 = ");";
  protected final String TEXT_2611 = NL + "\t\t";
  protected final String TEXT_2612 = " ";
  protected final String TEXT_2613 = " = (";
  protected final String TEXT_2614 = ")eVirtualGet(";
  protected final String TEXT_2615 = ", ";
  protected final String TEXT_2616 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2617 = "_EDEFAULT == null ? ";
  protected final String TEXT_2618 = " != null : !";
  protected final String TEXT_2619 = "_EDEFAULT.equals(";
  protected final String TEXT_2620 = ");";
  protected final String TEXT_2621 = NL + "\t\treturn ";
  protected final String TEXT_2622 = "_EDEFAULT == null ? ";
  protected final String TEXT_2623 = "() != null : !";
  protected final String TEXT_2624 = "_EDEFAULT.equals(";
  protected final String TEXT_2625 = "());";
  protected final String TEXT_2626 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2627 = ");";
  protected final String TEXT_2628 = NL + "\t\t";
  protected final String TEXT_2629 = " ";
  protected final String TEXT_2630 = " = (";
  protected final String TEXT_2631 = ")eVirtualGet(";
  protected final String TEXT_2632 = ");";
  protected final String TEXT_2633 = NL + "\t\treturn ";
  protected final String TEXT_2634 = " != null && ((";
  protected final String TEXT_2635 = ".Unsettable)";
  protected final String TEXT_2636 = ").isSet();";
  protected final String TEXT_2637 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2638 = ");";
  protected final String TEXT_2639 = NL + "\t\treturn (";
  protected final String TEXT_2640 = " & ";
  protected final String TEXT_2641 = "_ESETFLAG) != 0;";
  protected final String TEXT_2642 = NL + "\t\treturn ";
  protected final String TEXT_2643 = "ESet;";
  protected final String TEXT_2644 = NL + "\t\treturn !((";
  protected final String TEXT_2645 = ".Internal)((";
  protected final String TEXT_2646 = ".Internal.Wrapper)get";
  protected final String TEXT_2647 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2648 = ");";
  protected final String TEXT_2649 = NL + "\t\treturn !((";
  protected final String TEXT_2650 = ".Internal)get";
  protected final String TEXT_2651 = "()).isEmpty(";
  protected final String TEXT_2652 = ");";
  protected final String TEXT_2653 = NL;
  protected final String TEXT_2654 = NL + "\t\treturn ";
  protected final String TEXT_2655 = ".";
  protected final String TEXT_2656 = "(this);";
  protected final String TEXT_2657 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2658 = "' ";
  protected final String TEXT_2659 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2660 = NL + "\t}" + NL;
  protected final String TEXT_2661 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2662 = " ";
  protected final String TEXT_2663 = "(";
  protected final String TEXT_2664 = ")";
  protected final String TEXT_2665 = NL + "\t{";
  protected final String TEXT_2666 = NL + "\t\t";
  protected final String TEXT_2667 = "(";
  protected final String TEXT_2668 = ");";
  protected final String TEXT_2669 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2670 = NL + "\t\treturn ";
  protected final String TEXT_2671 = "(";
  protected final String TEXT_2672 = ");";
  protected final String TEXT_2673 = NL + "\t}" + NL;
  protected final String TEXT_2674 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
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

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
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
    if (genModel.isArrayAccessors() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_74);
    }
    } else {
    if (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable())) {
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    stringBuffer.append(TEXT_83);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_91);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_92);
    } else {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_100);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_107);
    } else {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_111);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_113);
    for (Iterator i=genClass.getFlagGenFeatures("true").iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_116);
    }
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_119);
    }
    new Runnable() { public void run() {
    for (Iterator i=(isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures()).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_120);
    if (!isImplementation) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_123);
    } else {
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_126);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_131);
    } else {
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_138);
    }
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    if (!isImplementation) {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_144);
    } else {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_150);
    if (!isImplementation) {
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_154);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_156);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_159);
    }
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    if (!isImplementation) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_165);
    } else {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_173);
    }
    stringBuffer.append(TEXT_174);
    if (!isImplementation) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_177);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_181);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_184);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_185);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(keyFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_187);
    } else {
    stringBuffer.append(TEXT_188);
    stringBuffer.append(keyFeature.getType());
    stringBuffer.append(TEXT_189);
    }
    stringBuffer.append(TEXT_190);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_191);
    stringBuffer.append(valueFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_192);
    } else {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(valueFeature.getType());
    stringBuffer.append(TEXT_194);
    }
    stringBuffer.append(TEXT_195);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType()))) {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_197);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_199);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_201);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_205);
    }
    }
    stringBuffer.append(TEXT_206);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_215);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_218);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_220);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_223);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_226);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_229);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_231);
    }}
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_233);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_236);
    } else {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_239);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_240);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_244);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_246);
    }
    stringBuffer.append(TEXT_247);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_252);
    }
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_254);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_258);
    } else {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_261);
    }
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_263);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_266);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_272);
    }
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_285);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_290);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_294);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_298);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_299);
    }
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_301);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_304);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_307);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_308);
    }
    stringBuffer.append(TEXT_309);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_312);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_319);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_324);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_327);
    } else {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_329);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_339);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_343);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_345);
    } else {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_350);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_352);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_354);
    } else {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_358);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_359);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_360);
    }
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_365);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    } else {
    stringBuffer.append(TEXT_369);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_370);
    }
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_374);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_376);
    }
    stringBuffer.append(TEXT_377);
    }
    }
    } else {
    stringBuffer.append(TEXT_378);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_382);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_385);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_386);
    }
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_388);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_392);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_393);
    }
    stringBuffer.append(TEXT_394);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_397);
    }
    stringBuffer.append(TEXT_398);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_400);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_412);
    }
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_414);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_416);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_429);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_430);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_433);
    } else {
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_445);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_446);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_448);
    }
    stringBuffer.append(TEXT_449);
    }
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_454);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_455);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_456);
    }
    } else {
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_459);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_462);
    } else {
    stringBuffer.append(TEXT_463);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_468);
    }
    }
    }
    }
    stringBuffer.append(TEXT_469);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_471);
    } else {
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_473);
    }
    } else {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_476);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_477);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_480);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_483);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_486);
    } else {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_488);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_493);
    } else {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_495);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_497);
    }
    } else {
    stringBuffer.append(TEXT_498);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_499);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_501);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_503);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_505);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_507);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_509);
    } else {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_512);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_514);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_516);
    }
    }
    }
    }
    stringBuffer.append(TEXT_517);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_519);
    } else {
    stringBuffer.append(TEXT_520);
    }
    stringBuffer.append(TEXT_521);
    } else {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_524);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_525);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_531);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(TEXT_536);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_538);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_539);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_542);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_545);
    }
    stringBuffer.append(TEXT_546);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_550);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_552);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_560);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_561);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_564);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_565);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_567);
    }
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_573);
    }
    stringBuffer.append(TEXT_574);
    }
    stringBuffer.append(TEXT_575);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_579);
    } else {
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_585);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_587);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_593);
    } else {
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_597);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_598);
    if (genFeature.isUnsettable()) {
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
    } else {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genFeature.getCapName());
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
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_616);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_621);
    }
    stringBuffer.append(TEXT_622);
    }
    stringBuffer.append(TEXT_623);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_625);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_626);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_629);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_632);
    }
    stringBuffer.append(TEXT_633);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_637);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_639);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_645);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_647);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_654);
    }
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_659);
    }
    stringBuffer.append(TEXT_660);
    }
    stringBuffer.append(TEXT_661);
    }
    stringBuffer.append(TEXT_662);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_668);
    } else {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_673);
    }
    } else {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_676);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_677);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_684);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_687);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_689);
    }
    }
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_691);
    } else {
    stringBuffer.append(TEXT_692);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_695);
    } else {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(TEXT_700);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_707);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_709);
    }
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_711);
    }
    stringBuffer.append(TEXT_712);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_726);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_730);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_736);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_741);
    }
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_754);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_764);
    }
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_768);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_769);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_772);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_776);
    }
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_779);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_782);
    }
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_784);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_791);
    }
    stringBuffer.append(TEXT_792);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_798);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_803);
    }
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_809);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_813);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    } else {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_824);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_829);
    } else {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_833);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_837);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_839);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_843);
    }
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_846);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_849);
    }
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_851);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_855);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_856);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_857);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_858);
    }
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_861);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_863);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_864);
    } else {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_866);
    }
    stringBuffer.append(TEXT_867);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_871);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_873);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_874);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_875);
    }
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_878);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_880);
    }
    }
    }
    stringBuffer.append(TEXT_881);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_882);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_884);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_888);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_891);
    }
    stringBuffer.append(TEXT_892);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_893);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_896);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_898);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_899);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_900);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_902);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_906);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_910);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_913);
    }
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_915);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_918);
    }
    stringBuffer.append(TEXT_919);
    }
    stringBuffer.append(TEXT_920);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_923);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_925);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_927);
    }
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_929);
    }
    stringBuffer.append(TEXT_930);
    } else {
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_932);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_934);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_936);
    }
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_938);
    }
    stringBuffer.append(TEXT_939);
    }
    } else {
    stringBuffer.append(TEXT_940);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_941);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_944);
    } else {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_947);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_948);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_952);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_955);
    } else {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_960);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_962);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_968);
    } else {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_972);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_977);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_979);
    } else {
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_981);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_982);
    } else {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_984);
    }
    stringBuffer.append(TEXT_985);
    }
    } else {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_988);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_989);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_994);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_996);
    }
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_998);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1001);
    }
    stringBuffer.append(TEXT_1002);
    } else {
    stringBuffer.append(TEXT_1003);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1005);
    } else {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1007);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1009);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1014);
    }
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1018);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1023);
    }
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1026);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1030);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1035);
    }
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1037);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1040);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1044);
    }
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1047);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1050);
    }
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1052);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1057);
    }
    stringBuffer.append(TEXT_1058);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1063);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1066);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1070);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1072);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1076);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1079);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1081);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1084);
    } else {
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1086);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1090);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1092);
    } else {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1094);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1095);
    } else {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1097);
    }
    stringBuffer.append(TEXT_1098);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1104);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1107);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1110);
    } else {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1112);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1116);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1119);
    } else {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1122);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1123);
    } else {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1125);
    }
    stringBuffer.append(TEXT_1126);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1131);
    } else {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1135);
    }
    } else {
    stringBuffer.append(TEXT_1136);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1139);
    } else {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1142);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1143);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1150);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1152);
    }
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1154);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1157);
    }
    stringBuffer.append(TEXT_1158);
    } else {
    stringBuffer.append(TEXT_1159);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1161);
    } else {
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1163);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1165);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1170);
    }
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1174);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1176);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1179);
    } else {
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1181);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1186);
    } else {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1190);
    }
    } else {
    stringBuffer.append(TEXT_1191);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1194);
    } else {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1197);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1198);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1199);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1206);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1213);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1214);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1219);
    } else {
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1224);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1228);
    } else {
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1232);
    }
    }
    stringBuffer.append(TEXT_1233);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1237);
    }
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1241);
    } else {
    stringBuffer.append(TEXT_1242);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1245);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1246);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1247);
    } else { int index = 0;
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1250);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1251);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1255);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1258);
    } else {
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1261);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1263);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1271);
    }
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1275);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1276);
    }
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1280);
    }
    stringBuffer.append(TEXT_1281);
    } else {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1284);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1285);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1286);
    }
    } else {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1288);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1292);
    } else {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1296);
    }
    }
    }
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1298);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1299);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1304);
    } else {
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1309);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1313);
    } else {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1317);
    }
    }
    stringBuffer.append(TEXT_1318);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1322);
    }
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1325);
    } else {
    stringBuffer.append(TEXT_1326);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1330);
    } else { int index = 0;
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1334);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1336);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1337);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1338);
    } else {
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1343);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1346);
    } else {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1349);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1351);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1359);
    }
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1363);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1364);
    }
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1368);
    }
    stringBuffer.append(TEXT_1369);
    } else {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1372);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1373);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1374);
    }
    } else {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1376);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1380);
    } else {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1384);
    }
    }
    }
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1386);
    }
    stringBuffer.append(TEXT_1387);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1392);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1396);
    }
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1400);
    } else {
    stringBuffer.append(TEXT_1401);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1405);
    } else {
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1411);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1412);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1413);
    }
    stringBuffer.append(TEXT_1414);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1419);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1423);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1424);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1426);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1428);
    }
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1432);
    } else {
    stringBuffer.append(TEXT_1433);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1437);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1439);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1440);
    }
    stringBuffer.append(TEXT_1441);
    } else { int index = 0;
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1445);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1447);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1448);
    }
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1455);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1458);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1465);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1466);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1469);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1470);
    }
    }
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1477);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1486);
    } else {
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1491);
    }
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1493);
    }
    stringBuffer.append(TEXT_1494);
    } else {
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1501);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1509);
    } else {
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1514);
    }
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1516);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1524);
    } else {
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1529);
    }
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1531);
    }
    }
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1533);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1534);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1535);
    }
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1538);
    }
    stringBuffer.append(TEXT_1539);
    } else {
    stringBuffer.append(TEXT_1540);
    }
    stringBuffer.append(TEXT_1541);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1543);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1544);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1547);
    } else {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1550);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1553);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1560);
    } else {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1562);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1564);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1566);
    } else {
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1568);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1570);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1572);
    } else {
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1574);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1578);
    } else {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1581);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1585);
    } else {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1588);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1593);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1603);
    } else {
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1608);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1610);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1615);
    }
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1619);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1621);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1624);
    } else {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1626);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1631);
    } else {
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1635);
    }
    } else {
    stringBuffer.append(TEXT_1636);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1639);
    } else {
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1642);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1643);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1644);
    if (isInterface) {
    stringBuffer.append(TEXT_1645);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1647);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1650);
    }}
    stringBuffer.append(TEXT_1651);
    } else {
    stringBuffer.append(TEXT_1652);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1657);
    } else {
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1662);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1668);
    } else {
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1681);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1684);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1686);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1690);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1691);
    }
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1694);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1695);
    }
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1698);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1700);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1702);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1704);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1705);
    }
    stringBuffer.append(TEXT_1706);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1708);
    }
    stringBuffer.append(TEXT_1709);
    }
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1712);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1714);
    }
    } else {
    stringBuffer.append(TEXT_1715);
    }
    }
    stringBuffer.append(TEXT_1716);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1720);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1722);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1726);
    } else {
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1729);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1730);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1733);
    } else {
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1735);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1740);
    }
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1742);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1746);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1751);
    }
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1754);
    }
    }
    stringBuffer.append(TEXT_1755);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1756);
    } else {
    stringBuffer.append(TEXT_1757);
    }
    stringBuffer.append(TEXT_1758);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1762);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1764);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1768);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1772);
    } else {
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1775);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1777);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1779);
    } else {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1781);
    }
    }
    stringBuffer.append(TEXT_1782);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1783);
    } else {
    stringBuffer.append(TEXT_1784);
    }
    stringBuffer.append(TEXT_1785);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1788);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1792);
    }
    stringBuffer.append(TEXT_1793);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1794);
    } else {
    stringBuffer.append(TEXT_1795);
    }
    stringBuffer.append(TEXT_1796);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1797);
    for (Iterator i=genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenFeatures().iterator() : genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1799);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1801);
    } else {
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1804);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1807);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1811);
    } else {
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1814);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1818);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1822);
    } else {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1824);
    }
    }
    stringBuffer.append(TEXT_1825);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1826);
    } else {
    stringBuffer.append(TEXT_1827);
    }
    stringBuffer.append(TEXT_1828);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1829);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1831);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1835);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1838);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1842);
    } else {
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1845);
    }
    } else {
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1849);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1853);
    } else {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1856);
    }
    stringBuffer.append(TEXT_1857);
    }
    stringBuffer.append(TEXT_1858);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1859);
    } else {
    stringBuffer.append(TEXT_1860);
    }
    stringBuffer.append(TEXT_1861);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1863);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1866);
    } else {
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1868);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1870);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1873);
    } else {
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1876);
    }
    stringBuffer.append(TEXT_1877);
    }
    stringBuffer.append(TEXT_1878);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1879);
    } else {
    stringBuffer.append(TEXT_1880);
    }
    stringBuffer.append(TEXT_1881);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(TEXT_1883);
    for (Iterator i=genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenFeatures().iterator() : genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1885);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1887);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1890);
    } else {
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1893);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1896);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1903);
    } else {
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1905);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1907);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1909);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1911);
    } else {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1913);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1915);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1917);
    } else {
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1919);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1923);
    } else {
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1926);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1930);
    } else {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1933);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1938);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1948);
    } else {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1953);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1954);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1955);
    } else {
    stringBuffer.append(TEXT_1956);
    }
    stringBuffer.append(TEXT_1957);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1958);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1960);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1963);
    }
    stringBuffer.append(TEXT_1964);
    }
    stringBuffer.append(TEXT_1965);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1967);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1970);
    }
    stringBuffer.append(TEXT_1971);
    }
    stringBuffer.append(TEXT_1972);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1975);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1976);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1979);
    }
    stringBuffer.append(TEXT_1980);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1983);
    }
    stringBuffer.append(TEXT_1984);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1985);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1993);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1996);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1997);
    }
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2001);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2004);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2005);
    }
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2010);
    }
    stringBuffer.append(TEXT_2011);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2014);
    } else {
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2016);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2017);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_2018);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2020);
    } else {
    stringBuffer.append(TEXT_2021);
    }
    stringBuffer.append(TEXT_2022);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2024);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2027);
    } else {
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_2029);
    }
    stringBuffer.append(TEXT_2030);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2032);
    } else {
    stringBuffer.append(TEXT_2033);
    }
    stringBuffer.append(TEXT_2034);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2036);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2039);
    } else {
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_2041);
    }
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2045);
    }
    stringBuffer.append(TEXT_2046);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genModel)) {
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2050);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2055);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2060);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2063);
    } else {
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2066);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2072);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2078);
    } else {
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2087);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2091);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2095);
    } else {
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2102);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2105);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2107);
    } else {
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2110);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2115);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2117);
    }
    }
    }
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2119);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2121);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2123);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2124);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2126);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2127);
    }
    } else {
    stringBuffer.append(TEXT_2128);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2130);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2131);
    }
    }
    } else {
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2133);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2134);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2136);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2137);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2139);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2140);
    }
    } else {
    stringBuffer.append(TEXT_2141);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2143);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2144);
    }
    }
    } else {
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2146);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2147);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2149);
    } else {
    stringBuffer.append(TEXT_2150);
    }
    }
    stringBuffer.append(TEXT_2151);
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2154);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2156);
    } else {
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2158);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2159);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2161);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2162);
    } else {
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2164);
    }
    }
    stringBuffer.append(TEXT_2165);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2168);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2169);
    } else {
    stringBuffer.append(TEXT_2170);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2172);
    }
    stringBuffer.append(TEXT_2173);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2179);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2180);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2185);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2187);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2189);
    }
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2191);
    } else {
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2193);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2195);
    }
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2197);
    }
    }
    stringBuffer.append(TEXT_2198);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2202);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2203);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2208);
    }
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2210);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2212);
    }
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2214);
    }
    stringBuffer.append(TEXT_2215);
    }
    stringBuffer.append(TEXT_2216);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2223);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2230);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2231);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2236);
    } else {
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2241);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2245);
    } else {
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2249);
    }
    }
    stringBuffer.append(TEXT_2250);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2254);
    }
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2258);
    } else {
    stringBuffer.append(TEXT_2259);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2262);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2263);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2264);
    } else { int index = 0;
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2267);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2268);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2272);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2275);
    } else {
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2278);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2280);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2288);
    }
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2292);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2293);
    }
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2297);
    }
    stringBuffer.append(TEXT_2298);
    } else {
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2301);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2302);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2303);
    }
    } else {
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2305);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2309);
    } else {
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2313);
    }
    }
    }
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2315);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2316);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2321);
    } else {
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2326);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2330);
    } else {
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2334);
    }
    }
    stringBuffer.append(TEXT_2335);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2339);
    }
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2342);
    } else {
    stringBuffer.append(TEXT_2343);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2347);
    } else { int index = 0;
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2351);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2353);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2354);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2355);
    } else {
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2360);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2363);
    } else {
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2366);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2368);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2376);
    }
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2380);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2381);
    }
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2385);
    }
    stringBuffer.append(TEXT_2386);
    } else {
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2389);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2390);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2391);
    }
    } else {
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2393);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2397);
    } else {
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2401);
    }
    }
    }
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2403);
    }
    stringBuffer.append(TEXT_2404);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2409);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2413);
    }
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2417);
    } else {
    stringBuffer.append(TEXT_2418);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2422);
    } else {
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2428);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2429);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2430);
    }
    stringBuffer.append(TEXT_2431);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2436);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2440);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2441);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2443);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2445);
    }
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2449);
    } else {
    stringBuffer.append(TEXT_2450);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2454);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2456);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2457);
    }
    stringBuffer.append(TEXT_2458);
    } else { int index = 0;
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2462);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2464);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2465);
    }
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2472);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2475);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2482);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2483);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2486);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2487);
    }
    }
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2494);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2503);
    } else {
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2508);
    }
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2510);
    }
    stringBuffer.append(TEXT_2511);
    } else {
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2518);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2526);
    } else {
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2531);
    }
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2533);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2541);
    } else {
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2546);
    }
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2548);
    }
    }
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2550);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2551);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2552);
    }
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2555);
    }
    stringBuffer.append(TEXT_2556);
    } else {
    stringBuffer.append(TEXT_2557);
    }
    stringBuffer.append(TEXT_2558);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2560);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2561);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2564);
    } else {
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2567);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2570);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2577);
    } else {
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2579);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2581);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2583);
    } else {
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2585);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2587);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2589);
    } else {
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2591);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2595);
    } else {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2598);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2602);
    } else {
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2605);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2610);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2620);
    } else {
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2625);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2627);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2632);
    }
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2636);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2638);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2641);
    } else {
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2643);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2648);
    } else {
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2652);
    }
    } else {
    stringBuffer.append(TEXT_2653);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2656);
    } else {
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2659);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2660);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_2665);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2668);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2669);
    } else {
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2672);
    }
    }
    stringBuffer.append(TEXT_2673);
    }
    }
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
