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
  protected final String TEXT_401 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_402 = "' ";
  protected final String TEXT_403 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_404 = NL + "\t}" + NL;
  protected final String TEXT_405 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_406 = " basicGet";
  protected final String TEXT_407 = "()" + NL + "\t{";
  protected final String TEXT_408 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_409 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_410 = ")eInternalContainer();";
  protected final String TEXT_411 = NL + "\t\treturn (";
  protected final String TEXT_412 = ")eVirtualGet(";
  protected final String TEXT_413 = ");";
  protected final String TEXT_414 = NL + "\t\treturn ";
  protected final String TEXT_415 = ";";
  protected final String TEXT_416 = NL + "\t\treturn (";
  protected final String TEXT_417 = ")((";
  protected final String TEXT_418 = ".Internal.Wrapper)get";
  protected final String TEXT_419 = "()).featureMap().get(";
  protected final String TEXT_420 = ", false);";
  protected final String TEXT_421 = NL + "\t\treturn (";
  protected final String TEXT_422 = ")get";
  protected final String TEXT_423 = "().get(";
  protected final String TEXT_424 = ", false);";
  protected final String TEXT_425 = NL;
  protected final String TEXT_426 = NL + "\t\treturn ";
  protected final String TEXT_427 = ".";
  protected final String TEXT_428 = "(this);";
  protected final String TEXT_429 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_430 = "' ";
  protected final String TEXT_431 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_432 = NL + "\t}" + NL;
  protected final String TEXT_433 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_434 = " basicSet";
  protected final String TEXT_435 = "(";
  protected final String TEXT_436 = " new";
  protected final String TEXT_437 = ", ";
  protected final String TEXT_438 = " msgs)" + NL + "\t{";
  protected final String TEXT_439 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_440 = ")new";
  protected final String TEXT_441 = ", ";
  protected final String TEXT_442 = ", msgs);";
  protected final String TEXT_443 = NL;
  protected final String TEXT_444 = NL + "\t\t";
  protected final String TEXT_445 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_446 = NL + "\t\t\t";
  protected final String TEXT_447 = " ";
  protected final String TEXT_448 = " = ";
  protected final String TEXT_449 = "();";
  protected final String TEXT_450 = NL + "\t\t\tObject ";
  protected final String TEXT_451 = " = eVirtualGet(";
  protected final String TEXT_452 = ");";
  protected final String TEXT_453 = NL + "\t\t\tif (";
  protected final String TEXT_454 = " != null && ";
  protected final String TEXT_455 = " != new";
  protected final String TEXT_456 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_457 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_458 = NL + "\t\t\tif (new";
  protected final String TEXT_459 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_460 = NL + "\t\t\t\t";
  protected final String TEXT_461 = " ";
  protected final String TEXT_462 = " = ";
  protected final String TEXT_463 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_464 = ".contains(new";
  protected final String TEXT_465 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_466 = ".add(new";
  protected final String TEXT_467 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_468 = NL + "\t\t\t\t";
  protected final String TEXT_469 = " ";
  protected final String TEXT_470 = " = ";
  protected final String TEXT_471 = "();";
  protected final String TEXT_472 = NL + "\t\t\t\tObject ";
  protected final String TEXT_473 = " = eVirtualGet(";
  protected final String TEXT_474 = ");";
  protected final String TEXT_475 = NL + "\t\t\t\tif (new";
  protected final String TEXT_476 = " != ";
  protected final String TEXT_477 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_478 = "(new";
  protected final String TEXT_479 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_480 = NL + "\t\t\t}";
  protected final String TEXT_481 = NL + "\t\t}";
  protected final String TEXT_482 = NL + "\t\treturn msgs;";
  protected final String TEXT_483 = NL + "\t\tObject old";
  protected final String TEXT_484 = " = eVirtualSet(";
  protected final String TEXT_485 = ", new";
  protected final String TEXT_486 = ");";
  protected final String TEXT_487 = NL + "\t\t";
  protected final String TEXT_488 = " old";
  protected final String TEXT_489 = " = ";
  protected final String TEXT_490 = ";" + NL + "\t\t";
  protected final String TEXT_491 = " = new";
  protected final String TEXT_492 = ";";
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
  protected final String TEXT_505 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_506 = NL + "\t\t\t";
  protected final String TEXT_507 = " notification = new ";
  protected final String TEXT_508 = "(this, ";
  protected final String TEXT_509 = ".SET, ";
  protected final String TEXT_510 = ", ";
  protected final String TEXT_511 = "isSetChange ? null : old";
  protected final String TEXT_512 = "old";
  protected final String TEXT_513 = ", new";
  protected final String TEXT_514 = ", ";
  protected final String TEXT_515 = "isSetChange";
  protected final String TEXT_516 = "!old";
  protected final String TEXT_517 = "ESet";
  protected final String TEXT_518 = ");";
  protected final String TEXT_519 = NL + "\t\t\t";
  protected final String TEXT_520 = " notification = new ";
  protected final String TEXT_521 = "(this, ";
  protected final String TEXT_522 = ".SET, ";
  protected final String TEXT_523 = ", ";
  protected final String TEXT_524 = "old";
  protected final String TEXT_525 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_526 = "old";
  protected final String TEXT_527 = ", new";
  protected final String TEXT_528 = ");";
  protected final String TEXT_529 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_530 = NL;
  protected final String TEXT_531 = NL + "\t\t";
  protected final String TEXT_532 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_533 = NL + "\t\t\t";
  protected final String TEXT_534 = " ";
  protected final String TEXT_535 = " = ";
  protected final String TEXT_536 = "();";
  protected final String TEXT_537 = NL + "\t\t\tObject ";
  protected final String TEXT_538 = " = eVirtualGet(";
  protected final String TEXT_539 = ");";
  protected final String TEXT_540 = NL + "\t\t\tif (";
  protected final String TEXT_541 = " != null && ";
  protected final String TEXT_542 = " != new";
  protected final String TEXT_543 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_544 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_545 = NL + "\t\t\tif (new";
  protected final String TEXT_546 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_547 = NL + "\t\t\t\t";
  protected final String TEXT_548 = " ";
  protected final String TEXT_549 = " = ";
  protected final String TEXT_550 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_551 = ".contains(new";
  protected final String TEXT_552 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_553 = ".add(new";
  protected final String TEXT_554 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_555 = NL + "\t\t\t\t";
  protected final String TEXT_556 = " ";
  protected final String TEXT_557 = " = ";
  protected final String TEXT_558 = "();";
  protected final String TEXT_559 = NL + "\t\t\t\tObject ";
  protected final String TEXT_560 = " = eVirtualGet(";
  protected final String TEXT_561 = ");";
  protected final String TEXT_562 = NL + "\t\t\t\tif (new";
  protected final String TEXT_563 = " != ";
  protected final String TEXT_564 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_565 = "(new";
  protected final String TEXT_566 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_567 = NL + "\t\t\t}";
  protected final String TEXT_568 = NL + "\t\t}";
  protected final String TEXT_569 = NL + "\t\treturn msgs;";
  protected final String TEXT_570 = NL + "\t\treturn ((";
  protected final String TEXT_571 = ".Internal)((";
  protected final String TEXT_572 = ".Internal.Wrapper)get";
  protected final String TEXT_573 = "()).featureMap()).basicAdd(";
  protected final String TEXT_574 = ", new";
  protected final String TEXT_575 = ", msgs);";
  protected final String TEXT_576 = NL + "\t\treturn ((";
  protected final String TEXT_577 = ".Internal)get";
  protected final String TEXT_578 = "()).basicAdd(";
  protected final String TEXT_579 = ", new";
  protected final String TEXT_580 = ", msgs);";
  protected final String TEXT_581 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_582 = "' ";
  protected final String TEXT_583 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_584 = NL + "\t}" + NL;
  protected final String TEXT_585 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_586 = "#";
  protected final String TEXT_587 = " <em>";
  protected final String TEXT_588 = "</em>}' ";
  protected final String TEXT_589 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_590 = "</em>' ";
  protected final String TEXT_591 = ".";
  protected final String TEXT_592 = NL + "\t * @see ";
  protected final String TEXT_593 = NL + "\t * @see #isSet";
  protected final String TEXT_594 = "()";
  protected final String TEXT_595 = NL + "\t * @see #unset";
  protected final String TEXT_596 = "()";
  protected final String TEXT_597 = NL + "\t * @see #";
  protected final String TEXT_598 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_599 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_600 = NL + "\tvoid set";
  protected final String TEXT_601 = "(";
  protected final String TEXT_602 = " value);" + NL;
  protected final String TEXT_603 = NL + "\tpublic void set";
  protected final String TEXT_604 = "(";
  protected final String TEXT_605 = " new";
  protected final String TEXT_606 = ")" + NL + "\t{";
  protected final String TEXT_607 = NL;
  protected final String TEXT_608 = NL + "\t\tnew";
  protected final String TEXT_609 = " = new";
  protected final String TEXT_610 = " == null ? ";
  protected final String TEXT_611 = "_EDEFAULT : new";
  protected final String TEXT_612 = ";";
  protected final String TEXT_613 = NL + "\t\teSet(";
  protected final String TEXT_614 = ", ";
  protected final String TEXT_615 = "new ";
  protected final String TEXT_616 = "(";
  protected final String TEXT_617 = "new";
  protected final String TEXT_618 = ")";
  protected final String TEXT_619 = ");";
  protected final String TEXT_620 = NL + "\t\tif (new";
  protected final String TEXT_621 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_622 = " && new";
  protected final String TEXT_623 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_624 = ".isAncestor(this, ";
  protected final String TEXT_625 = "new";
  protected final String TEXT_626 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_627 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_628 = NL + "\t\t\t";
  protected final String TEXT_629 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_630 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_631 = ")new";
  protected final String TEXT_632 = ").eInverseAdd(this, ";
  protected final String TEXT_633 = ", ";
  protected final String TEXT_634 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_635 = "(";
  protected final String TEXT_636 = "new";
  protected final String TEXT_637 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_638 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_639 = "(this, ";
  protected final String TEXT_640 = ".SET, ";
  protected final String TEXT_641 = ", new";
  protected final String TEXT_642 = ", new";
  protected final String TEXT_643 = "));";
  protected final String TEXT_644 = NL + "\t\t";
  protected final String TEXT_645 = " ";
  protected final String TEXT_646 = " = (";
  protected final String TEXT_647 = ")eVirtualGet(";
  protected final String TEXT_648 = ");";
  protected final String TEXT_649 = NL + "\t\tif (new";
  protected final String TEXT_650 = " != ";
  protected final String TEXT_651 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_652 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_653 = " != null)";
  protected final String TEXT_654 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_655 = ")";
  protected final String TEXT_656 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_657 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_658 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_659 = ")new";
  protected final String TEXT_660 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_661 = ", null, msgs);";
  protected final String TEXT_662 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_663 = ")";
  protected final String TEXT_664 = ").eInverseRemove(this, ";
  protected final String TEXT_665 = ", ";
  protected final String TEXT_666 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_667 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_668 = ")new";
  protected final String TEXT_669 = ").eInverseAdd(this, ";
  protected final String TEXT_670 = ", ";
  protected final String TEXT_671 = ".class, msgs);";
  protected final String TEXT_672 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_673 = "(";
  protected final String TEXT_674 = "new";
  protected final String TEXT_675 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_676 = NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_677 = NL + "\t\t\tboolean old";
  protected final String TEXT_678 = "ESet = eVirtualIsSet(";
  protected final String TEXT_679 = ");";
  protected final String TEXT_680 = NL + "\t\t\tboolean old";
  protected final String TEXT_681 = "ESet = (";
  protected final String TEXT_682 = " & ";
  protected final String TEXT_683 = "_ESETFLAG) != 0;";
  protected final String TEXT_684 = NL + "\t\t\t";
  protected final String TEXT_685 = " |= ";
  protected final String TEXT_686 = "_ESETFLAG;";
  protected final String TEXT_687 = NL + "\t\t\tboolean old";
  protected final String TEXT_688 = "ESet = ";
  protected final String TEXT_689 = "ESet;";
  protected final String TEXT_690 = NL + "\t\t\t";
  protected final String TEXT_691 = "ESet = true;";
  protected final String TEXT_692 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_693 = "(this, ";
  protected final String TEXT_694 = ".SET, ";
  protected final String TEXT_695 = ", new";
  protected final String TEXT_696 = ", new";
  protected final String TEXT_697 = ", !old";
  protected final String TEXT_698 = "ESet));";
  protected final String TEXT_699 = NL + "    \t}";
  protected final String TEXT_700 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_701 = "(this, ";
  protected final String TEXT_702 = ".SET, ";
  protected final String TEXT_703 = ", new";
  protected final String TEXT_704 = ", new";
  protected final String TEXT_705 = "));";
  protected final String TEXT_706 = NL + "\t\t";
  protected final String TEXT_707 = " old";
  protected final String TEXT_708 = " = (";
  protected final String TEXT_709 = " & ";
  protected final String TEXT_710 = "_EFLAG) != 0;";
  protected final String TEXT_711 = NL + "\t\tif (new";
  protected final String TEXT_712 = ") ";
  protected final String TEXT_713 = " |= ";
  protected final String TEXT_714 = "_EFLAG; else ";
  protected final String TEXT_715 = " &= ~";
  protected final String TEXT_716 = "_EFLAG;";
  protected final String TEXT_717 = NL + "\t\t";
  protected final String TEXT_718 = " old";
  protected final String TEXT_719 = " = ";
  protected final String TEXT_720 = ";";
  protected final String TEXT_721 = NL + "\t\t";
  protected final String TEXT_722 = " ";
  protected final String TEXT_723 = " = new";
  protected final String TEXT_724 = " == null ? ";
  protected final String TEXT_725 = "_EDEFAULT : new";
  protected final String TEXT_726 = ";";
  protected final String TEXT_727 = NL + "\t\t";
  protected final String TEXT_728 = " = new";
  protected final String TEXT_729 = " == null ? ";
  protected final String TEXT_730 = "_EDEFAULT : new";
  protected final String TEXT_731 = ";";
  protected final String TEXT_732 = NL + "\t\t";
  protected final String TEXT_733 = " ";
  protected final String TEXT_734 = " = ";
  protected final String TEXT_735 = "new";
  protected final String TEXT_736 = ";";
  protected final String TEXT_737 = NL + "\t\t";
  protected final String TEXT_738 = " = ";
  protected final String TEXT_739 = "new";
  protected final String TEXT_740 = ";";
  protected final String TEXT_741 = NL + "\t\tObject old";
  protected final String TEXT_742 = " = eVirtualSet(";
  protected final String TEXT_743 = ", ";
  protected final String TEXT_744 = ");";
  protected final String TEXT_745 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_746 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_747 = NL + "\t\tboolean old";
  protected final String TEXT_748 = "ESet = (";
  protected final String TEXT_749 = " & ";
  protected final String TEXT_750 = "_ESETFLAG) != 0;";
  protected final String TEXT_751 = NL + "\t\t";
  protected final String TEXT_752 = " |= ";
  protected final String TEXT_753 = "_ESETFLAG;";
  protected final String TEXT_754 = NL + "\t\tboolean old";
  protected final String TEXT_755 = "ESet = ";
  protected final String TEXT_756 = "ESet;";
  protected final String TEXT_757 = NL + "\t\t";
  protected final String TEXT_758 = "ESet = true;";
  protected final String TEXT_759 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_760 = "(this, ";
  protected final String TEXT_761 = ".SET, ";
  protected final String TEXT_762 = ", ";
  protected final String TEXT_763 = "isSetChange ? ";
  protected final String TEXT_764 = "null";
  protected final String TEXT_765 = "_EDEFAULT";
  protected final String TEXT_766 = " : old";
  protected final String TEXT_767 = "old";
  protected final String TEXT_768 = ", ";
  protected final String TEXT_769 = "new";
  protected final String TEXT_770 = ", ";
  protected final String TEXT_771 = "isSetChange";
  protected final String TEXT_772 = "!old";
  protected final String TEXT_773 = "ESet";
  protected final String TEXT_774 = "));";
  protected final String TEXT_775 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_776 = "(this, ";
  protected final String TEXT_777 = ".SET, ";
  protected final String TEXT_778 = ", ";
  protected final String TEXT_779 = "old";
  protected final String TEXT_780 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_781 = "null";
  protected final String TEXT_782 = "_EDEFAULT";
  protected final String TEXT_783 = " : old";
  protected final String TEXT_784 = "old";
  protected final String TEXT_785 = ", ";
  protected final String TEXT_786 = "new";
  protected final String TEXT_787 = "));";
  protected final String TEXT_788 = NL;
  protected final String TEXT_789 = NL;
  protected final String TEXT_790 = NL + "\t\t";
  protected final String TEXT_791 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_792 = NL + "\t\t\t";
  protected final String TEXT_793 = " ";
  protected final String TEXT_794 = " = ";
  protected final String TEXT_795 = "();";
  protected final String TEXT_796 = NL + "\t\t\tObject ";
  protected final String TEXT_797 = " = eVirtualGet(";
  protected final String TEXT_798 = ");";
  protected final String TEXT_799 = NL + "\t\t\tif (";
  protected final String TEXT_800 = " != null && ";
  protected final String TEXT_801 = " != new";
  protected final String TEXT_802 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_803 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_804 = NL + "\t\t\tif (new";
  protected final String TEXT_805 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_806 = NL + "\t\t\t\t";
  protected final String TEXT_807 = " ";
  protected final String TEXT_808 = " = ";
  protected final String TEXT_809 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_810 = ".contains(new";
  protected final String TEXT_811 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_812 = ".add(new";
  protected final String TEXT_813 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_814 = NL + "\t\t\t\t";
  protected final String TEXT_815 = " ";
  protected final String TEXT_816 = " = ";
  protected final String TEXT_817 = "();";
  protected final String TEXT_818 = NL + "\t\t\t\tObject ";
  protected final String TEXT_819 = " = eVirtualGet(";
  protected final String TEXT_820 = ");";
  protected final String TEXT_821 = NL + "\t\t\t\tif (new";
  protected final String TEXT_822 = " != ";
  protected final String TEXT_823 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_824 = "(new";
  protected final String TEXT_825 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_826 = NL + "\t\t\t}";
  protected final String TEXT_827 = NL + "\t\t}";
  protected final String TEXT_828 = NL + "\t\t((";
  protected final String TEXT_829 = ".Internal)((";
  protected final String TEXT_830 = ".Internal.Wrapper)get";
  protected final String TEXT_831 = "()).featureMap()).set(";
  protected final String TEXT_832 = ", ";
  protected final String TEXT_833 = "new ";
  protected final String TEXT_834 = "(";
  protected final String TEXT_835 = "new";
  protected final String TEXT_836 = ")";
  protected final String TEXT_837 = ");";
  protected final String TEXT_838 = NL + "\t\t((";
  protected final String TEXT_839 = ".Internal)get";
  protected final String TEXT_840 = "()).set(";
  protected final String TEXT_841 = ", ";
  protected final String TEXT_842 = "new ";
  protected final String TEXT_843 = "(";
  protected final String TEXT_844 = "new";
  protected final String TEXT_845 = ")";
  protected final String TEXT_846 = ");";
  protected final String TEXT_847 = NL;
  protected final String TEXT_848 = NL + "\t\t";
  protected final String TEXT_849 = ".";
  protected final String TEXT_850 = "(this, ";
  protected final String TEXT_851 = ");";
  protected final String TEXT_852 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_853 = "' ";
  protected final String TEXT_854 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_855 = NL + "\t}" + NL;
  protected final String TEXT_856 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_857 = " basicUnset";
  protected final String TEXT_858 = "(";
  protected final String TEXT_859 = " msgs)" + NL + "\t{";
  protected final String TEXT_860 = NL + "\t\tObject old";
  protected final String TEXT_861 = " = eVirtualUnset(";
  protected final String TEXT_862 = ");";
  protected final String TEXT_863 = NL + "\t\t";
  protected final String TEXT_864 = " old";
  protected final String TEXT_865 = " = ";
  protected final String TEXT_866 = ";" + NL + "\t\t";
  protected final String TEXT_867 = " = null;";
  protected final String TEXT_868 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_869 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_870 = NL + "\t\tboolean old";
  protected final String TEXT_871 = "ESet = (";
  protected final String TEXT_872 = " & ";
  protected final String TEXT_873 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_874 = " &= ~";
  protected final String TEXT_875 = "_ESETFLAG;";
  protected final String TEXT_876 = NL + "\t\tboolean old";
  protected final String TEXT_877 = "ESet = ";
  protected final String TEXT_878 = "ESet;" + NL + "\t\t";
  protected final String TEXT_879 = "ESet = false;";
  protected final String TEXT_880 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_881 = " notification = new ";
  protected final String TEXT_882 = "(this, ";
  protected final String TEXT_883 = ".UNSET, ";
  protected final String TEXT_884 = ", ";
  protected final String TEXT_885 = "isSetChange ? old";
  protected final String TEXT_886 = " : null";
  protected final String TEXT_887 = "old";
  protected final String TEXT_888 = ", null, ";
  protected final String TEXT_889 = "isSetChange";
  protected final String TEXT_890 = "old";
  protected final String TEXT_891 = "ESet";
  protected final String TEXT_892 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_893 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_894 = "' ";
  protected final String TEXT_895 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_896 = NL + "\t}" + NL;
  protected final String TEXT_897 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_898 = "#";
  protected final String TEXT_899 = " <em>";
  protected final String TEXT_900 = "</em>}' ";
  protected final String TEXT_901 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_902 = NL + "\t * @see #isSet";
  protected final String TEXT_903 = "()";
  protected final String TEXT_904 = NL + "\t * @see #";
  protected final String TEXT_905 = "()";
  protected final String TEXT_906 = NL + "\t * @see #set";
  protected final String TEXT_907 = "(";
  protected final String TEXT_908 = ")";
  protected final String TEXT_909 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_910 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_911 = NL + "\tvoid unset";
  protected final String TEXT_912 = "();" + NL;
  protected final String TEXT_913 = NL + "\tpublic void unset";
  protected final String TEXT_914 = "()" + NL + "\t{";
  protected final String TEXT_915 = NL + "\t\teUnset(";
  protected final String TEXT_916 = ");";
  protected final String TEXT_917 = NL + "\t\t";
  protected final String TEXT_918 = " ";
  protected final String TEXT_919 = " = (";
  protected final String TEXT_920 = ")eVirtualGet(";
  protected final String TEXT_921 = ");";
  protected final String TEXT_922 = NL + "\t\tif (";
  protected final String TEXT_923 = " != null) ((";
  protected final String TEXT_924 = ".Unsettable)";
  protected final String TEXT_925 = ").unset();";
  protected final String TEXT_926 = NL + "\t\t";
  protected final String TEXT_927 = " ";
  protected final String TEXT_928 = " = (";
  protected final String TEXT_929 = ")eVirtualGet(";
  protected final String TEXT_930 = ");";
  protected final String TEXT_931 = NL + "\t\tif (";
  protected final String TEXT_932 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_933 = " msgs = null;";
  protected final String TEXT_934 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_935 = ")";
  protected final String TEXT_936 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_937 = ", null, msgs);";
  protected final String TEXT_938 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_939 = ")";
  protected final String TEXT_940 = ").eInverseRemove(this, ";
  protected final String TEXT_941 = ", ";
  protected final String TEXT_942 = ".class, msgs);";
  protected final String TEXT_943 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_944 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{";
  protected final String TEXT_945 = NL + "\t\t\tboolean old";
  protected final String TEXT_946 = "ESet = eVirtualIsSet(";
  protected final String TEXT_947 = ");";
  protected final String TEXT_948 = NL + "\t\t\tboolean old";
  protected final String TEXT_949 = "ESet = (";
  protected final String TEXT_950 = " & ";
  protected final String TEXT_951 = "_ESETFLAG) != 0;";
  protected final String TEXT_952 = NL + "\t\t\t";
  protected final String TEXT_953 = " &= ~";
  protected final String TEXT_954 = "_ESETFLAG;";
  protected final String TEXT_955 = NL + "\t\t\tboolean old";
  protected final String TEXT_956 = "ESet = ";
  protected final String TEXT_957 = "ESet;";
  protected final String TEXT_958 = NL + "\t\t\t";
  protected final String TEXT_959 = "ESet = false;";
  protected final String TEXT_960 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_961 = "(this, ";
  protected final String TEXT_962 = ".UNSET, ";
  protected final String TEXT_963 = ", null, null, old";
  protected final String TEXT_964 = "ESet));";
  protected final String TEXT_965 = NL + "    \t}";
  protected final String TEXT_966 = NL + "\t\t";
  protected final String TEXT_967 = " old";
  protected final String TEXT_968 = " = (";
  protected final String TEXT_969 = " & ";
  protected final String TEXT_970 = "_EFLAG) != 0;";
  protected final String TEXT_971 = NL + "\t\tObject old";
  protected final String TEXT_972 = " = eVirtualUnset(";
  protected final String TEXT_973 = ");";
  protected final String TEXT_974 = NL + "\t\t";
  protected final String TEXT_975 = " old";
  protected final String TEXT_976 = " = ";
  protected final String TEXT_977 = ";";
  protected final String TEXT_978 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_979 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_980 = NL + "\t\tboolean old";
  protected final String TEXT_981 = "ESet = (";
  protected final String TEXT_982 = " & ";
  protected final String TEXT_983 = "_ESETFLAG) != 0;";
  protected final String TEXT_984 = NL + "\t\tboolean old";
  protected final String TEXT_985 = "ESet = ";
  protected final String TEXT_986 = "ESet;";
  protected final String TEXT_987 = NL + "\t\t";
  protected final String TEXT_988 = " = null;";
  protected final String TEXT_989 = NL + "\t\t";
  protected final String TEXT_990 = " &= ~";
  protected final String TEXT_991 = "_ESETFLAG;";
  protected final String TEXT_992 = NL + "\t\t";
  protected final String TEXT_993 = "ESet = false;";
  protected final String TEXT_994 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_995 = "(this, ";
  protected final String TEXT_996 = ".UNSET, ";
  protected final String TEXT_997 = ", ";
  protected final String TEXT_998 = "isSetChange ? old";
  protected final String TEXT_999 = " : null";
  protected final String TEXT_1000 = "old";
  protected final String TEXT_1001 = ", null, ";
  protected final String TEXT_1002 = "isSetChange";
  protected final String TEXT_1003 = "old";
  protected final String TEXT_1004 = "ESet";
  protected final String TEXT_1005 = "));";
  protected final String TEXT_1006 = NL + "\t\tif (";
  protected final String TEXT_1007 = "_EDEFAULT) ";
  protected final String TEXT_1008 = " |= ";
  protected final String TEXT_1009 = "_EFLAG; else ";
  protected final String TEXT_1010 = " &= ~";
  protected final String TEXT_1011 = "_EFLAG;";
  protected final String TEXT_1012 = NL + "\t\t";
  protected final String TEXT_1013 = " = ";
  protected final String TEXT_1014 = "_EDEFAULT;";
  protected final String TEXT_1015 = NL + "\t\t";
  protected final String TEXT_1016 = " &= ~";
  protected final String TEXT_1017 = "_ESETFLAG;";
  protected final String TEXT_1018 = NL + "\t\t";
  protected final String TEXT_1019 = "ESet = false;";
  protected final String TEXT_1020 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1021 = "(this, ";
  protected final String TEXT_1022 = ".UNSET, ";
  protected final String TEXT_1023 = ", ";
  protected final String TEXT_1024 = "isSetChange ? old";
  protected final String TEXT_1025 = " : ";
  protected final String TEXT_1026 = "_EDEFAULT";
  protected final String TEXT_1027 = "old";
  protected final String TEXT_1028 = ", ";
  protected final String TEXT_1029 = "_EDEFAULT, ";
  protected final String TEXT_1030 = "isSetChange";
  protected final String TEXT_1031 = "old";
  protected final String TEXT_1032 = "ESet";
  protected final String TEXT_1033 = "));";
  protected final String TEXT_1034 = NL + "\t\t((";
  protected final String TEXT_1035 = ".Internal)((";
  protected final String TEXT_1036 = ".Internal.Wrapper)get";
  protected final String TEXT_1037 = "()).featureMap()).clear(";
  protected final String TEXT_1038 = ");";
  protected final String TEXT_1039 = NL + "\t\t((";
  protected final String TEXT_1040 = ".Internal)get";
  protected final String TEXT_1041 = "()).clear(";
  protected final String TEXT_1042 = ");";
  protected final String TEXT_1043 = NL;
  protected final String TEXT_1044 = NL + "\t\t";
  protected final String TEXT_1045 = ".";
  protected final String TEXT_1046 = "(this);";
  protected final String TEXT_1047 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1048 = "' ";
  protected final String TEXT_1049 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1050 = NL + "\t}" + NL;
  protected final String TEXT_1051 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1052 = "#";
  protected final String TEXT_1053 = " <em>";
  protected final String TEXT_1054 = "</em>}' ";
  protected final String TEXT_1055 = " is set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1056 = "</em>' ";
  protected final String TEXT_1057 = " is set.";
  protected final String TEXT_1058 = NL + "\t * @see #unset";
  protected final String TEXT_1059 = "()";
  protected final String TEXT_1060 = NL + "\t * @see #";
  protected final String TEXT_1061 = "()";
  protected final String TEXT_1062 = NL + "\t * @see #set";
  protected final String TEXT_1063 = "(";
  protected final String TEXT_1064 = ")";
  protected final String TEXT_1065 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1066 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1067 = NL + "\tboolean isSet";
  protected final String TEXT_1068 = "();" + NL;
  protected final String TEXT_1069 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1070 = "()" + NL + "\t{";
  protected final String TEXT_1071 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1072 = ");";
  protected final String TEXT_1073 = NL + "\t\t";
  protected final String TEXT_1074 = " ";
  protected final String TEXT_1075 = " = (";
  protected final String TEXT_1076 = ")eVirtualGet(";
  protected final String TEXT_1077 = ");";
  protected final String TEXT_1078 = NL + "\t\treturn ";
  protected final String TEXT_1079 = " != null && ((";
  protected final String TEXT_1080 = ".Unsettable)";
  protected final String TEXT_1081 = ").isSet();";
  protected final String TEXT_1082 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1083 = ");";
  protected final String TEXT_1084 = NL + "\t\treturn (";
  protected final String TEXT_1085 = " & ";
  protected final String TEXT_1086 = "_ESETFLAG) != 0;";
  protected final String TEXT_1087 = NL + "\t\treturn ";
  protected final String TEXT_1088 = "ESet;";
  protected final String TEXT_1089 = NL + "\t\treturn !((";
  protected final String TEXT_1090 = ".Internal)((";
  protected final String TEXT_1091 = ".Internal.Wrapper)get";
  protected final String TEXT_1092 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1093 = ");";
  protected final String TEXT_1094 = NL + "\t\treturn !((";
  protected final String TEXT_1095 = ".Internal)get";
  protected final String TEXT_1096 = "()).isEmpty(";
  protected final String TEXT_1097 = ");";
  protected final String TEXT_1098 = NL;
  protected final String TEXT_1099 = NL + "\t\treturn ";
  protected final String TEXT_1100 = ".";
  protected final String TEXT_1101 = "(this);";
  protected final String TEXT_1102 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1103 = "' ";
  protected final String TEXT_1104 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1105 = NL + "\t}" + NL;
  protected final String TEXT_1106 = NL;
  protected final String TEXT_1107 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1108 = "() <em>";
  protected final String TEXT_1109 = "</em>}' ";
  protected final String TEXT_1110 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1111 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1112 = "_ESUBSETS = ";
  protected final String TEXT_1113 = ";" + NL;
  protected final String TEXT_1114 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1115 = "() <em>";
  protected final String TEXT_1116 = "</em>}' ";
  protected final String TEXT_1117 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1118 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1119 = "_ESUPERSETS = ";
  protected final String TEXT_1120 = ";" + NL;
  protected final String TEXT_1121 = NL + "\t/**";
  protected final String TEXT_1122 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1123 = "}, with the specified ";
  protected final String TEXT_1124 = ", and appends it to the '<em><b>";
  protected final String TEXT_1125 = "</b></em>' ";
  protected final String TEXT_1126 = ".";
  protected final String TEXT_1127 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1128 = "}, with the specified ";
  protected final String TEXT_1129 = ", and sets the '<em><b>";
  protected final String TEXT_1130 = "</b></em>' ";
  protected final String TEXT_1131 = ".";
  protected final String TEXT_1132 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1133 = "} and appends it to the '<em><b>";
  protected final String TEXT_1134 = "</b></em>' ";
  protected final String TEXT_1135 = ".";
  protected final String TEXT_1136 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1137 = "} and sets the '<em><b>";
  protected final String TEXT_1138 = "</b></em>' ";
  protected final String TEXT_1139 = ".";
  protected final String TEXT_1140 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1141 = NL + "\t * @param ";
  protected final String TEXT_1142 = " The ";
  protected final String TEXT_1143 = " for the new {@link ";
  protected final String TEXT_1144 = "}, or <code>null</code>.";
  protected final String TEXT_1145 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1146 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1147 = "}." + NL + "\t * @see #";
  protected final String TEXT_1148 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1149 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1150 = NL + "\t";
  protected final String TEXT_1151 = " create";
  protected final String TEXT_1152 = "(";
  protected final String TEXT_1153 = ", ";
  protected final String TEXT_1154 = " eClass);" + NL;
  protected final String TEXT_1155 = NL + "\tpublic ";
  protected final String TEXT_1156 = " create";
  protected final String TEXT_1157 = "(";
  protected final String TEXT_1158 = ", ";
  protected final String TEXT_1159 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1160 = " new";
  protected final String TEXT_1161 = " = (";
  protected final String TEXT_1162 = ") create(eClass);";
  protected final String TEXT_1163 = NL + "\t\t";
  protected final String TEXT_1164 = "().add(new";
  protected final String TEXT_1165 = ");";
  protected final String TEXT_1166 = NL + "\t\tset";
  protected final String TEXT_1167 = "(new";
  protected final String TEXT_1168 = ");";
  protected final String TEXT_1169 = NL + "\t\tint ";
  protected final String TEXT_1170 = "ListSize = 0;";
  protected final String TEXT_1171 = NL + "\t\tint ";
  protected final String TEXT_1172 = "Size = ";
  protected final String TEXT_1173 = " == null ? 0 : ";
  protected final String TEXT_1174 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1175 = "Size > ";
  protected final String TEXT_1176 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1177 = "ListSize = ";
  protected final String TEXT_1178 = "Size;";
  protected final String TEXT_1179 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1180 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1181 = ".create";
  protected final String TEXT_1182 = "(";
  protected final String TEXT_1183 = ", ";
  protected final String TEXT_1184 = "i < ";
  protected final String TEXT_1185 = "Size ? (";
  protected final String TEXT_1186 = ") ";
  protected final String TEXT_1187 = ".get(i) : null";
  protected final String TEXT_1188 = ");" + NL + "\t\t}";
  protected final String TEXT_1189 = NL + "\t\tnew";
  protected final String TEXT_1190 = ".create";
  protected final String TEXT_1191 = "(";
  protected final String TEXT_1192 = ", ";
  protected final String TEXT_1193 = ");";
  protected final String TEXT_1194 = NL + "\t\tif (";
  protected final String TEXT_1195 = " != null)";
  protected final String TEXT_1196 = NL + "\t\t\tnew";
  protected final String TEXT_1197 = ".";
  protected final String TEXT_1198 = "().addAll(";
  protected final String TEXT_1199 = ");";
  protected final String TEXT_1200 = NL + "\t\t\tnew";
  protected final String TEXT_1201 = ".set";
  protected final String TEXT_1202 = "(";
  protected final String TEXT_1203 = ");";
  protected final String TEXT_1204 = NL + "\t\treturn new";
  protected final String TEXT_1205 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1206 = NL + "\t/**";
  protected final String TEXT_1207 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1208 = "}, with the specified ";
  protected final String TEXT_1209 = ", and appends it to the '<em><b>";
  protected final String TEXT_1210 = "</b></em>' ";
  protected final String TEXT_1211 = ".";
  protected final String TEXT_1212 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1213 = "},with the specified ";
  protected final String TEXT_1214 = ", and sets the '<em><b>";
  protected final String TEXT_1215 = "</b></em>' ";
  protected final String TEXT_1216 = ".";
  protected final String TEXT_1217 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1218 = "} and appends it to the '<em><b>";
  protected final String TEXT_1219 = "</b></em>' ";
  protected final String TEXT_1220 = ".";
  protected final String TEXT_1221 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1222 = "} and sets the '<em><b>";
  protected final String TEXT_1223 = "</b></em>' ";
  protected final String TEXT_1224 = ".";
  protected final String TEXT_1225 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1226 = NL + "\t * @param ";
  protected final String TEXT_1227 = " The ";
  protected final String TEXT_1228 = " for the new {@link ";
  protected final String TEXT_1229 = "}, or <code>null</code>.";
  protected final String TEXT_1230 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1231 = "}." + NL + "\t * @see #";
  protected final String TEXT_1232 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1233 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1234 = NL + "\t";
  protected final String TEXT_1235 = " create";
  protected final String TEXT_1236 = "(";
  protected final String TEXT_1237 = ");" + NL;
  protected final String TEXT_1238 = NL + "\tpublic ";
  protected final String TEXT_1239 = " create";
  protected final String TEXT_1240 = "(";
  protected final String TEXT_1241 = ")" + NL + "\t{";
  protected final String TEXT_1242 = NL + "\t\treturn create";
  protected final String TEXT_1243 = "(";
  protected final String TEXT_1244 = ", ";
  protected final String TEXT_1245 = ");";
  protected final String TEXT_1246 = NL + "\t\t";
  protected final String TEXT_1247 = " new";
  protected final String TEXT_1248 = " = (";
  protected final String TEXT_1249 = ") create(";
  protected final String TEXT_1250 = ");";
  protected final String TEXT_1251 = NL + "\t\t";
  protected final String TEXT_1252 = "().add(new";
  protected final String TEXT_1253 = ");";
  protected final String TEXT_1254 = NL + "\t\tset";
  protected final String TEXT_1255 = "(new";
  protected final String TEXT_1256 = ");";
  protected final String TEXT_1257 = NL + "\t\tint ";
  protected final String TEXT_1258 = "ListSize = 0;";
  protected final String TEXT_1259 = NL + "\t\tint ";
  protected final String TEXT_1260 = "Size = ";
  protected final String TEXT_1261 = " == null ? 0 : ";
  protected final String TEXT_1262 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1263 = "Size > ";
  protected final String TEXT_1264 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1265 = "ListSize = ";
  protected final String TEXT_1266 = "Size;";
  protected final String TEXT_1267 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1268 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1269 = ".create";
  protected final String TEXT_1270 = "(";
  protected final String TEXT_1271 = ", ";
  protected final String TEXT_1272 = "i < ";
  protected final String TEXT_1273 = "Size ? (";
  protected final String TEXT_1274 = ") ";
  protected final String TEXT_1275 = ".get(i) : null";
  protected final String TEXT_1276 = ");" + NL + "\t\t}";
  protected final String TEXT_1277 = NL + "\t\tnew";
  protected final String TEXT_1278 = ".create";
  protected final String TEXT_1279 = "(";
  protected final String TEXT_1280 = ", ";
  protected final String TEXT_1281 = ");";
  protected final String TEXT_1282 = NL + "\t\tif (";
  protected final String TEXT_1283 = " != null)";
  protected final String TEXT_1284 = NL + "\t\t\tnew";
  protected final String TEXT_1285 = ".";
  protected final String TEXT_1286 = "().addAll(";
  protected final String TEXT_1287 = ");";
  protected final String TEXT_1288 = NL + "\t\t\tnew";
  protected final String TEXT_1289 = ".set";
  protected final String TEXT_1290 = "(";
  protected final String TEXT_1291 = ");";
  protected final String TEXT_1292 = NL + "\t\treturn new";
  protected final String TEXT_1293 = ";";
  protected final String TEXT_1294 = NL + "\t}" + NL;
  protected final String TEXT_1295 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1296 = "} with the specified ";
  protected final String TEXT_1297 = " from the '<em><b>";
  protected final String TEXT_1298 = "</b></em>' ";
  protected final String TEXT_1299 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1300 = NL + "\t * @param ";
  protected final String TEXT_1301 = " The ";
  protected final String TEXT_1302 = " of the {@link ";
  protected final String TEXT_1303 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1304 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1305 = "} with the specified ";
  protected final String TEXT_1306 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1307 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1308 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1309 = NL + "\t";
  protected final String TEXT_1310 = " get";
  protected final String TEXT_1311 = "(";
  protected final String TEXT_1312 = ");" + NL;
  protected final String TEXT_1313 = NL + "\tpublic ";
  protected final String TEXT_1314 = " get";
  protected final String TEXT_1315 = "(";
  protected final String TEXT_1316 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1317 = "(";
  protected final String TEXT_1318 = ", false";
  protected final String TEXT_1319 = ", null";
  protected final String TEXT_1320 = ", false";
  protected final String TEXT_1321 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1322 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1323 = "} with the specified ";
  protected final String TEXT_1324 = " from the '<em><b>";
  protected final String TEXT_1325 = "</b></em>' ";
  protected final String TEXT_1326 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1327 = NL + "\t * @param ";
  protected final String TEXT_1328 = " The ";
  protected final String TEXT_1329 = " of the {@link ";
  protected final String TEXT_1330 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1331 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1332 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1333 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1334 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1335 = "} on demand if not found.";
  protected final String TEXT_1336 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1337 = "} with the specified ";
  protected final String TEXT_1338 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1339 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1340 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1341 = NL + "\t";
  protected final String TEXT_1342 = " get";
  protected final String TEXT_1343 = "(";
  protected final String TEXT_1344 = ", boolean ignoreCase";
  protected final String TEXT_1345 = ", ";
  protected final String TEXT_1346 = " eClass";
  protected final String TEXT_1347 = ", boolean createOnDemand";
  protected final String TEXT_1348 = ");" + NL;
  protected final String TEXT_1349 = NL + "\tpublic ";
  protected final String TEXT_1350 = " get";
  protected final String TEXT_1351 = "(";
  protected final String TEXT_1352 = ", boolean ignoreCase";
  protected final String TEXT_1353 = ", ";
  protected final String TEXT_1354 = " eClass";
  protected final String TEXT_1355 = ", boolean createOnDemand";
  protected final String TEXT_1356 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1357 = "Loop: for (";
  protected final String TEXT_1358 = " i = ";
  protected final String TEXT_1359 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1360 = " ";
  protected final String TEXT_1361 = " = (";
  protected final String TEXT_1362 = ") i.next();";
  protected final String TEXT_1363 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1364 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1365 = "Loop;";
  protected final String TEXT_1366 = NL + "\t\t\t";
  protected final String TEXT_1367 = " ";
  protected final String TEXT_1368 = "List = ";
  protected final String TEXT_1369 = ".";
  protected final String TEXT_1370 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1371 = "ListSize = ";
  protected final String TEXT_1372 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1373 = " || (";
  protected final String TEXT_1374 = " != null && ";
  protected final String TEXT_1375 = ".size() != ";
  protected final String TEXT_1376 = "ListSize";
  protected final String TEXT_1377 = ")";
  protected final String TEXT_1378 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1379 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1380 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1381 = " ";
  protected final String TEXT_1382 = " = (";
  protected final String TEXT_1383 = ") ";
  protected final String TEXT_1384 = "List.get(j);";
  protected final String TEXT_1385 = NL + "\t\t\t\tif (";
  protected final String TEXT_1386 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_1387 = ")";
  protected final String TEXT_1388 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1389 = ".";
  protected final String TEXT_1390 = "()) : ";
  protected final String TEXT_1391 = ".get(j).equals(";
  protected final String TEXT_1392 = ".";
  protected final String TEXT_1393 = "())))";
  protected final String TEXT_1394 = NL + "\t\t\t\tif (";
  protected final String TEXT_1395 = " != null && !";
  protected final String TEXT_1396 = ".get(j).equals(";
  protected final String TEXT_1397 = ".";
  protected final String TEXT_1398 = "()))";
  protected final String TEXT_1399 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1400 = "Loop;";
  protected final String TEXT_1401 = NL + "\t\t\t}";
  protected final String TEXT_1402 = NL + "\t\t\t";
  protected final String TEXT_1403 = " ";
  protected final String TEXT_1404 = " = ";
  protected final String TEXT_1405 = ".";
  protected final String TEXT_1406 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1407 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1408 = "Loop;";
  protected final String TEXT_1409 = NL + "\t\t\tif (";
  protected final String TEXT_1410 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1411 = ".equalsIgnoreCase(";
  protected final String TEXT_1412 = ".";
  protected final String TEXT_1413 = "()) : ";
  protected final String TEXT_1414 = ".equals(";
  protected final String TEXT_1415 = ".";
  protected final String TEXT_1416 = "())))";
  protected final String TEXT_1417 = NL + "\t\t\tif (";
  protected final String TEXT_1418 = " != null && !";
  protected final String TEXT_1419 = ".equals(";
  protected final String TEXT_1420 = ".";
  protected final String TEXT_1421 = "()))";
  protected final String TEXT_1422 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1423 = "Loop;";
  protected final String TEXT_1424 = NL + "\t\t\tif (";
  protected final String TEXT_1425 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1426 = ".equalsIgnoreCase(";
  protected final String TEXT_1427 = ".";
  protected final String TEXT_1428 = "()) : ";
  protected final String TEXT_1429 = ".equals(";
  protected final String TEXT_1430 = ".";
  protected final String TEXT_1431 = "())))";
  protected final String TEXT_1432 = NL + "\t\t\tif (";
  protected final String TEXT_1433 = " != null && !";
  protected final String TEXT_1434 = ".equals(";
  protected final String TEXT_1435 = ".";
  protected final String TEXT_1436 = "()))";
  protected final String TEXT_1437 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1438 = "Loop;";
  protected final String TEXT_1439 = NL + "\t\t\treturn ";
  protected final String TEXT_1440 = ";" + NL + "\t\t}";
  protected final String TEXT_1441 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1442 = " && eClass != null";
  protected final String TEXT_1443 = " ? create";
  protected final String TEXT_1444 = "(";
  protected final String TEXT_1445 = ", eClass";
  protected final String TEXT_1446 = ") : null;";
  protected final String TEXT_1447 = NL + "\t\treturn null;";
  protected final String TEXT_1448 = NL + "\t}" + NL;
  protected final String TEXT_1449 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1450 = "()" + NL + "\t{";
  protected final String TEXT_1451 = NL + "  \t\treturn false;";
  protected final String TEXT_1452 = NL + "\t\treturn !((";
  protected final String TEXT_1453 = ".Internal.Wrapper)";
  protected final String TEXT_1454 = "()).featureMap().isEmpty();";
  protected final String TEXT_1455 = NL + "\t\treturn ";
  protected final String TEXT_1456 = " != null && !";
  protected final String TEXT_1457 = ".featureMap().isEmpty();";
  protected final String TEXT_1458 = NL + "\t\treturn ";
  protected final String TEXT_1459 = " != null && !";
  protected final String TEXT_1460 = ".isEmpty();";
  protected final String TEXT_1461 = NL + "\t\t";
  protected final String TEXT_1462 = " ";
  protected final String TEXT_1463 = " = (";
  protected final String TEXT_1464 = ")eVirtualGet(";
  protected final String TEXT_1465 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1466 = " != null && !";
  protected final String TEXT_1467 = ".isEmpty();";
  protected final String TEXT_1468 = NL + "\t\treturn !";
  protected final String TEXT_1469 = "().isEmpty();";
  protected final String TEXT_1470 = NL + "\t\treturn ";
  protected final String TEXT_1471 = " != null;";
  protected final String TEXT_1472 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1473 = ") != null;";
  protected final String TEXT_1474 = NL + "\t\treturn basicGet";
  protected final String TEXT_1475 = "() != null;";
  protected final String TEXT_1476 = NL + "\t\treturn ";
  protected final String TEXT_1477 = " != null;";
  protected final String TEXT_1478 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1479 = ") != null;";
  protected final String TEXT_1480 = NL + "\t\treturn ";
  protected final String TEXT_1481 = "() != null;";
  protected final String TEXT_1482 = NL + "\t\treturn ((";
  protected final String TEXT_1483 = " & ";
  protected final String TEXT_1484 = "_EFLAG) != 0) != ";
  protected final String TEXT_1485 = "_EDEFAULT;";
  protected final String TEXT_1486 = NL + "\t\treturn ";
  protected final String TEXT_1487 = " != ";
  protected final String TEXT_1488 = "_EDEFAULT;";
  protected final String TEXT_1489 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1490 = ", ";
  protected final String TEXT_1491 = "_EDEFAULT) != ";
  protected final String TEXT_1492 = "_EDEFAULT;";
  protected final String TEXT_1493 = NL + "\t\treturn ";
  protected final String TEXT_1494 = "() != ";
  protected final String TEXT_1495 = "_EDEFAULT;";
  protected final String TEXT_1496 = NL + "\t\treturn ";
  protected final String TEXT_1497 = "_EDEFAULT == null ? ";
  protected final String TEXT_1498 = " != null : !";
  protected final String TEXT_1499 = "_EDEFAULT.equals(";
  protected final String TEXT_1500 = ");";
  protected final String TEXT_1501 = NL + "\t\t";
  protected final String TEXT_1502 = " ";
  protected final String TEXT_1503 = " = (";
  protected final String TEXT_1504 = ")eVirtualGet(";
  protected final String TEXT_1505 = ", ";
  protected final String TEXT_1506 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_1507 = "_EDEFAULT == null ? ";
  protected final String TEXT_1508 = " != null : !";
  protected final String TEXT_1509 = "_EDEFAULT.equals(";
  protected final String TEXT_1510 = ");";
  protected final String TEXT_1511 = NL + "\t\treturn ";
  protected final String TEXT_1512 = "_EDEFAULT == null ? ";
  protected final String TEXT_1513 = "() != null : !";
  protected final String TEXT_1514 = "_EDEFAULT.equals(";
  protected final String TEXT_1515 = "());";
  protected final String TEXT_1516 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1517 = ");";
  protected final String TEXT_1518 = NL + "\t\t";
  protected final String TEXT_1519 = " ";
  protected final String TEXT_1520 = " = (";
  protected final String TEXT_1521 = ")eVirtualGet(";
  protected final String TEXT_1522 = ");";
  protected final String TEXT_1523 = NL + "\t\treturn ";
  protected final String TEXT_1524 = " != null && ((";
  protected final String TEXT_1525 = ".Unsettable)";
  protected final String TEXT_1526 = ").isSet();";
  protected final String TEXT_1527 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1528 = ");";
  protected final String TEXT_1529 = NL + "\t\treturn (";
  protected final String TEXT_1530 = " & ";
  protected final String TEXT_1531 = "_ESETFLAG) != 0;";
  protected final String TEXT_1532 = NL + "\t\treturn ";
  protected final String TEXT_1533 = "ESet;";
  protected final String TEXT_1534 = NL + "\t\treturn !((";
  protected final String TEXT_1535 = ".Internal)((";
  protected final String TEXT_1536 = ".Internal.Wrapper)get";
  protected final String TEXT_1537 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1538 = ");";
  protected final String TEXT_1539 = NL + "\t\treturn !((";
  protected final String TEXT_1540 = ".Internal)get";
  protected final String TEXT_1541 = "()).isEmpty(";
  protected final String TEXT_1542 = ");";
  protected final String TEXT_1543 = NL;
  protected final String TEXT_1544 = NL + "\t\treturn ";
  protected final String TEXT_1545 = ".";
  protected final String TEXT_1546 = "(this);";
  protected final String TEXT_1547 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1548 = "' ";
  protected final String TEXT_1549 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1550 = NL + "\t}" + NL;
  protected final String TEXT_1551 = NL;
  protected final String TEXT_1552 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1553 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_1554 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1555 = NL + "\t * @model ";
  protected final String TEXT_1556 = NL + "\t *        ";
  protected final String TEXT_1557 = NL + "\t * @model";
  protected final String TEXT_1558 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1559 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1560 = NL + "\t";
  protected final String TEXT_1561 = " ";
  protected final String TEXT_1562 = "(";
  protected final String TEXT_1563 = ")";
  protected final String TEXT_1564 = ";" + NL;
  protected final String TEXT_1565 = NL + "\tpublic ";
  protected final String TEXT_1566 = " ";
  protected final String TEXT_1567 = "(";
  protected final String TEXT_1568 = ")";
  protected final String TEXT_1569 = NL + "\t{";
  protected final String TEXT_1570 = NL + "\t\t";
  protected final String TEXT_1571 = NL + "\t\treturn ";
  protected final String TEXT_1572 = ".";
  protected final String TEXT_1573 = "(this, ";
  protected final String TEXT_1574 = ", ";
  protected final String TEXT_1575 = ");";
  protected final String TEXT_1576 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1577 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1578 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1579 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1580 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1581 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1582 = ".";
  protected final String TEXT_1583 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1584 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1585 = "\", ";
  protected final String TEXT_1586 = ".getObjectLabel(this, ";
  protected final String TEXT_1587 = ") }),";
  protected final String TEXT_1588 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1589 = NL + "\t\t";
  protected final String TEXT_1590 = ".";
  protected final String TEXT_1591 = "(this";
  protected final String TEXT_1592 = ", ";
  protected final String TEXT_1593 = ");";
  protected final String TEXT_1594 = NL + "\t\t";
  protected final String TEXT_1595 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1596 = " result = (";
  protected final String TEXT_1597 = ") cache.get(";
  protected final String TEXT_1598 = "eResource(), ";
  protected final String TEXT_1599 = "this, ";
  protected final String TEXT_1600 = ".getEOperations().get(";
  protected final String TEXT_1601 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1602 = "eResource(), ";
  protected final String TEXT_1603 = "this, ";
  protected final String TEXT_1604 = ".getEOperations().get(";
  protected final String TEXT_1605 = "), result = ";
  protected final String TEXT_1606 = "new ";
  protected final String TEXT_1607 = "(";
  protected final String TEXT_1608 = ".";
  protected final String TEXT_1609 = "(this";
  protected final String TEXT_1610 = ", ";
  protected final String TEXT_1611 = ")";
  protected final String TEXT_1612 = ")";
  protected final String TEXT_1613 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1614 = ".";
  protected final String TEXT_1615 = "()";
  protected final String TEXT_1616 = ";" + NL + "\t\t}";
  protected final String TEXT_1617 = NL + "\t\treturn ";
  protected final String TEXT_1618 = ".";
  protected final String TEXT_1619 = "(this";
  protected final String TEXT_1620 = ", ";
  protected final String TEXT_1621 = ");";
  protected final String TEXT_1622 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1623 = NL + "\t}" + NL;
  protected final String TEXT_1624 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1625 = " eInverseAdd(";
  protected final String TEXT_1626 = " otherEnd, int featureID, ";
  protected final String TEXT_1627 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1628 = NL + "\t\t\tcase ";
  protected final String TEXT_1629 = ":";
  protected final String TEXT_1630 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1631 = ")((";
  protected final String TEXT_1632 = ".InternalMapView)";
  protected final String TEXT_1633 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1634 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1635 = ")";
  protected final String TEXT_1636 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1637 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1638 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1639 = "((";
  protected final String TEXT_1640 = ")otherEnd, msgs);";
  protected final String TEXT_1641 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1642 = ", msgs);";
  protected final String TEXT_1643 = NL + "\t\t\t\t";
  protected final String TEXT_1644 = " ";
  protected final String TEXT_1645 = " = (";
  protected final String TEXT_1646 = ")eVirtualGet(";
  protected final String TEXT_1647 = ");";
  protected final String TEXT_1648 = NL + "\t\t\t\tif (";
  protected final String TEXT_1649 = " != null)";
  protected final String TEXT_1650 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1651 = ")";
  protected final String TEXT_1652 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1653 = ", null, msgs);";
  protected final String TEXT_1654 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1655 = ")";
  protected final String TEXT_1656 = ").eInverseRemove(this, ";
  protected final String TEXT_1657 = ", ";
  protected final String TEXT_1658 = ".class, msgs);";
  protected final String TEXT_1659 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1660 = "((";
  protected final String TEXT_1661 = ")otherEnd, msgs);";
  protected final String TEXT_1662 = NL + "\t\t}";
  protected final String TEXT_1663 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1664 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1665 = NL + "\t}" + NL;
  protected final String TEXT_1666 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1667 = " eInverseRemove(";
  protected final String TEXT_1668 = " otherEnd, int featureID, ";
  protected final String TEXT_1669 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1670 = NL + "\t\t\tcase ";
  protected final String TEXT_1671 = ":";
  protected final String TEXT_1672 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1673 = ")((";
  protected final String TEXT_1674 = ".InternalMapView)";
  protected final String TEXT_1675 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1676 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1677 = ")((";
  protected final String TEXT_1678 = ".Internal.Wrapper)";
  protected final String TEXT_1679 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1680 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1681 = ")";
  protected final String TEXT_1682 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1683 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1684 = ", msgs);";
  protected final String TEXT_1685 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1686 = "(msgs);";
  protected final String TEXT_1687 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1688 = "(null, msgs);";
  protected final String TEXT_1689 = NL + "\t\t}";
  protected final String TEXT_1690 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1691 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1692 = NL + "\t}" + NL;
  protected final String TEXT_1693 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1694 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1695 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID)" + NL + "\t\t{";
  protected final String TEXT_1696 = NL + "\t\t\tcase ";
  protected final String TEXT_1697 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1698 = ", ";
  protected final String TEXT_1699 = ".class, msgs);";
  protected final String TEXT_1700 = NL + "\t\t}";
  protected final String TEXT_1701 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1702 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1703 = NL + "\t}" + NL;
  protected final String TEXT_1704 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1705 = NL + "\t\t\tcase ";
  protected final String TEXT_1706 = ":";
  protected final String TEXT_1707 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1708 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1709 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1710 = "(";
  protected final String TEXT_1711 = "());";
  protected final String TEXT_1712 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1713 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1714 = "();";
  protected final String TEXT_1715 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1716 = ".InternalMapView)";
  protected final String TEXT_1717 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1718 = "();";
  protected final String TEXT_1719 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1720 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1721 = "().map();";
  protected final String TEXT_1722 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1723 = ".Internal.Wrapper)";
  protected final String TEXT_1724 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1725 = "();";
  protected final String TEXT_1726 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1727 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1728 = ".Internal)";
  protected final String TEXT_1729 = "()).getWrapper();";
  protected final String TEXT_1730 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1731 = "();";
  protected final String TEXT_1732 = NL + "\t\t}";
  protected final String TEXT_1733 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1734 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1735 = NL + "\t}" + NL;
  protected final String TEXT_1736 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1737 = NL + "\t\t\tcase ";
  protected final String TEXT_1738 = ":";
  protected final String TEXT_1739 = NL + "\t\t\t\t((";
  protected final String TEXT_1740 = ".Internal)((";
  protected final String TEXT_1741 = ".Internal.Wrapper)";
  protected final String TEXT_1742 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1743 = NL + "\t\t\t\t((";
  protected final String TEXT_1744 = ".Internal)";
  protected final String TEXT_1745 = "()).set(newValue);";
  protected final String TEXT_1746 = NL + "\t\t\t\t((";
  protected final String TEXT_1747 = ".Setting)((";
  protected final String TEXT_1748 = ".InternalMapView)";
  protected final String TEXT_1749 = "()).eMap()).set(newValue);";
  protected final String TEXT_1750 = NL + "\t\t\t\t((";
  protected final String TEXT_1751 = ".Setting)";
  protected final String TEXT_1752 = "()).set(newValue);";
  protected final String TEXT_1753 = NL + "\t\t\t\t";
  protected final String TEXT_1754 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1755 = "().addAll((";
  protected final String TEXT_1756 = ")newValue);";
  protected final String TEXT_1757 = NL + "\t\t\t\tset";
  protected final String TEXT_1758 = "(((";
  protected final String TEXT_1759 = ")newValue).";
  protected final String TEXT_1760 = "());";
  protected final String TEXT_1761 = NL + "\t\t\t\tset";
  protected final String TEXT_1762 = "((";
  protected final String TEXT_1763 = ")newValue);";
  protected final String TEXT_1764 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1765 = NL + "\t\t}";
  protected final String TEXT_1766 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1767 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1768 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1769 = NL + "\t\t\tcase ";
  protected final String TEXT_1770 = ":";
  protected final String TEXT_1771 = NL + "\t\t\t\t((";
  protected final String TEXT_1772 = ".Internal.Wrapper)";
  protected final String TEXT_1773 = "()).featureMap().clear();";
  protected final String TEXT_1774 = NL + "\t\t\t\t";
  protected final String TEXT_1775 = "().clear();";
  protected final String TEXT_1776 = NL + "\t\t\t\tunset";
  protected final String TEXT_1777 = "();";
  protected final String TEXT_1778 = NL + "\t\t\t\tset";
  protected final String TEXT_1779 = "((";
  protected final String TEXT_1780 = ")null);";
  protected final String TEXT_1781 = NL + "\t\t\t\tset";
  protected final String TEXT_1782 = "(";
  protected final String TEXT_1783 = "_EDEFAULT);";
  protected final String TEXT_1784 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1785 = NL + "\t\t}";
  protected final String TEXT_1786 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1787 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1788 = NL + "\t}" + NL;
  protected final String TEXT_1789 = NL;
  protected final String TEXT_1790 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_1791 = NL + "\t\t\tcase ";
  protected final String TEXT_1792 = ":";
  protected final String TEXT_1793 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1794 = "();";
  protected final String TEXT_1795 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1796 = ".Internal.Wrapper)";
  protected final String TEXT_1797 = "()).featureMap().isEmpty();";
  protected final String TEXT_1798 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1799 = " != null && !";
  protected final String TEXT_1800 = ".featureMap().isEmpty();";
  protected final String TEXT_1801 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1802 = " != null && !";
  protected final String TEXT_1803 = ".isEmpty();";
  protected final String TEXT_1804 = NL + "\t\t\t\t";
  protected final String TEXT_1805 = " ";
  protected final String TEXT_1806 = " = (";
  protected final String TEXT_1807 = ")eVirtualGet(";
  protected final String TEXT_1808 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1809 = " != null && !";
  protected final String TEXT_1810 = ".isEmpty();";
  protected final String TEXT_1811 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1812 = "().isEmpty();";
  protected final String TEXT_1813 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1814 = "();";
  protected final String TEXT_1815 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1816 = " != null;";
  protected final String TEXT_1817 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1818 = ") != null;";
  protected final String TEXT_1819 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1820 = "() != null;";
  protected final String TEXT_1821 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1822 = " != null;";
  protected final String TEXT_1823 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1824 = ") != null;";
  protected final String TEXT_1825 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1826 = "() != null;";
  protected final String TEXT_1827 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1828 = " & ";
  protected final String TEXT_1829 = "_EFLAG) != 0) != ";
  protected final String TEXT_1830 = "_EDEFAULT;";
  protected final String TEXT_1831 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1832 = " != ";
  protected final String TEXT_1833 = "_EDEFAULT;";
  protected final String TEXT_1834 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1835 = ", ";
  protected final String TEXT_1836 = "_EDEFAULT) != ";
  protected final String TEXT_1837 = "_EDEFAULT;";
  protected final String TEXT_1838 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1839 = "() != ";
  protected final String TEXT_1840 = "_EDEFAULT;";
  protected final String TEXT_1841 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1842 = "_EDEFAULT == null ? ";
  protected final String TEXT_1843 = " != null : !";
  protected final String TEXT_1844 = "_EDEFAULT.equals(";
  protected final String TEXT_1845 = ");";
  protected final String TEXT_1846 = NL + "\t\t\t\t";
  protected final String TEXT_1847 = " ";
  protected final String TEXT_1848 = " = (";
  protected final String TEXT_1849 = ")eVirtualGet(";
  protected final String TEXT_1850 = ", ";
  protected final String TEXT_1851 = "_EDEFAULT);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1852 = "_EDEFAULT == null ? ";
  protected final String TEXT_1853 = " != null : !";
  protected final String TEXT_1854 = "_EDEFAULT.equals(";
  protected final String TEXT_1855 = ");";
  protected final String TEXT_1856 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1857 = "_EDEFAULT == null ? ";
  protected final String TEXT_1858 = "() != null : !";
  protected final String TEXT_1859 = "_EDEFAULT.equals(";
  protected final String TEXT_1860 = "());";
  protected final String TEXT_1861 = NL + "\t\t}";
  protected final String TEXT_1862 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1863 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1864 = NL + "\t}" + NL;
  protected final String TEXT_1865 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1866 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1867 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1868 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1869 = ": return ";
  protected final String TEXT_1870 = ";";
  protected final String TEXT_1871 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1872 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_1873 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1874 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1875 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1876 = ": return ";
  protected final String TEXT_1877 = ";";
  protected final String TEXT_1878 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1879 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1880 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1881 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1882 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1883 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1884 = NL + "\t\t\tcase ";
  protected final String TEXT_1885 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1886 = ";";
  protected final String TEXT_1887 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1888 = NL + "\t\t\tcase ";
  protected final String TEXT_1889 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1890 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1891 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1892 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1893 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1894 = ": \");";
  protected final String TEXT_1895 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1896 = ": \");";
  protected final String TEXT_1897 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1898 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1899 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1900 = NL + "\t\tif (";
  protected final String TEXT_1901 = "(";
  protected final String TEXT_1902 = " & ";
  protected final String TEXT_1903 = "_ESETFLAG) != 0";
  protected final String TEXT_1904 = "ESet";
  protected final String TEXT_1905 = ") result.append((";
  protected final String TEXT_1906 = " & ";
  protected final String TEXT_1907 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1908 = NL + "\t\tif (";
  protected final String TEXT_1909 = "(";
  protected final String TEXT_1910 = " & ";
  protected final String TEXT_1911 = "_ESETFLAG) != 0";
  protected final String TEXT_1912 = "ESet";
  protected final String TEXT_1913 = ") result.append(";
  protected final String TEXT_1914 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1915 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1916 = ", ";
  protected final String TEXT_1917 = "_EDEFAULT";
  protected final String TEXT_1918 = "));";
  protected final String TEXT_1919 = NL + "\t\tresult.append((";
  protected final String TEXT_1920 = " & ";
  protected final String TEXT_1921 = "_EFLAG) != 0);";
  protected final String TEXT_1922 = NL + "\t\tresult.append(";
  protected final String TEXT_1923 = ");";
  protected final String TEXT_1924 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1925 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_1926 = NL + "\t\treturn new ";
  protected final String TEXT_1927 = "(getTypedKey());";
  protected final String TEXT_1928 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1929 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_1930 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_1931 = ")key);";
  protected final String TEXT_1932 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1933 = ")key).";
  protected final String TEXT_1934 = "());";
  protected final String TEXT_1935 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1936 = ")key);";
  protected final String TEXT_1937 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_1938 = NL + "\t\treturn new ";
  protected final String TEXT_1939 = "(getTypedValue());";
  protected final String TEXT_1940 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1941 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_1942 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_1943 = ")value);";
  protected final String TEXT_1944 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1945 = ")value).";
  protected final String TEXT_1946 = "());";
  protected final String TEXT_1947 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1948 = ")value);";
  protected final String TEXT_1949 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1950 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1951 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1952 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1953 = NL;
  protected final String TEXT_1954 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1955 = " create(";
  protected final String TEXT_1956 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1957 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_1958 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_1959 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_1960 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_1961 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1962 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_1963 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1964 = " basicGet";
  protected final String TEXT_1965 = "()" + NL + "\t{";
  protected final String TEXT_1966 = NL + "\t\tif (isSet";
  protected final String TEXT_1967 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1968 = "basicGet";
  protected final String TEXT_1969 = "();" + NL + "\t\t}";
  protected final String TEXT_1970 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_1971 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1972 = "basicGet";
  protected final String TEXT_1973 = "();" + NL + "\t\t}";
  protected final String TEXT_1974 = NL + "\t\t";
  protected final String TEXT_1975 = " ";
  protected final String TEXT_1976 = " = ";
  protected final String TEXT_1977 = "basicGet";
  protected final String TEXT_1978 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_1979 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_1980 = ";" + NL + "\t\t}";
  protected final String TEXT_1981 = NL + "\t\treturn ";
  protected final String TEXT_1982 = "super.basicGet";
  protected final String TEXT_1983 = "()";
  protected final String TEXT_1984 = "null";
  protected final String TEXT_1985 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1986 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1987 = " ";
  protected final String TEXT_1988 = "()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1989 = " ";
  protected final String TEXT_1990 = " = basicGet";
  protected final String TEXT_1991 = "();" + NL + "\t\treturn ";
  protected final String TEXT_1992 = " == null ? null : (";
  protected final String TEXT_1993 = ")eResolveProxy((";
  protected final String TEXT_1994 = ")";
  protected final String TEXT_1995 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1996 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1997 = " ";
  protected final String TEXT_1998 = "()" + NL + "\t{";
  protected final String TEXT_1999 = NL + "\t\t";
  protected final String TEXT_2000 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_2001 = " eResource = eResource();" + NL + "\t\t\t";
  protected final String TEXT_2002 = " ";
  protected final String TEXT_2003 = " = (";
  protected final String TEXT_2004 = ") cache.get(eResource, this, ";
  protected final String TEXT_2005 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_2006 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_2007 = ", ";
  protected final String TEXT_2008 = " = new ";
  protected final String TEXT_2009 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_2010 = ";" + NL + "\t\t}";
  protected final String TEXT_2011 = NL + "\t\treturn new ";
  protected final String TEXT_2012 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2013 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2014 = " ";
  protected final String TEXT_2015 = "Helper(";
  protected final String TEXT_2016 = " ";
  protected final String TEXT_2017 = ")" + NL + "\t{";
  protected final String TEXT_2018 = NL + "\t\t";
  protected final String TEXT_2019 = ".addAll(super.";
  protected final String TEXT_2020 = "());";
  protected final String TEXT_2021 = NL + "\t\tsuper.";
  protected final String TEXT_2022 = "Helper(";
  protected final String TEXT_2023 = ");";
  protected final String TEXT_2024 = NL + "\t\tif (isSet";
  protected final String TEXT_2025 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2026 = " i = ((";
  protected final String TEXT_2027 = ") ";
  protected final String TEXT_2028 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2029 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2030 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2031 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2032 = " i = ((";
  protected final String TEXT_2033 = ") ";
  protected final String TEXT_2034 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2035 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2036 = NL + "\t\t";
  protected final String TEXT_2037 = " ";
  protected final String TEXT_2038 = " = ";
  protected final String TEXT_2039 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2040 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2041 = " i = ((";
  protected final String TEXT_2042 = ") ";
  protected final String TEXT_2043 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2044 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2045 = NL + "\t\tif (isSet";
  protected final String TEXT_2046 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2047 = ".addAll(";
  protected final String TEXT_2048 = "());" + NL + "\t\t}";
  protected final String TEXT_2049 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2050 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2051 = ".addAll(";
  protected final String TEXT_2052 = "());" + NL + "\t\t}";
  protected final String TEXT_2053 = NL + "\t\t";
  protected final String TEXT_2054 = " ";
  protected final String TEXT_2055 = " = ";
  protected final String TEXT_2056 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2057 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2058 = ".addAll(";
  protected final String TEXT_2059 = ");" + NL + "\t\t}";
  protected final String TEXT_2060 = NL + "\t\tif (isSet";
  protected final String TEXT_2061 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2062 = ".add(";
  protected final String TEXT_2063 = "basicGet";
  protected final String TEXT_2064 = "());" + NL + "\t\t}";
  protected final String TEXT_2065 = NL + "\t\t";
  protected final String TEXT_2066 = " ";
  protected final String TEXT_2067 = " = ";
  protected final String TEXT_2068 = "basicGet";
  protected final String TEXT_2069 = "();" + NL + "\t\tif (";
  protected final String TEXT_2070 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2071 = ".add(";
  protected final String TEXT_2072 = ");" + NL + "\t\t}";
  protected final String TEXT_2073 = NL + "\t\treturn ";
  protected final String TEXT_2074 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2075 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2076 = " ";
  protected final String TEXT_2077 = "()" + NL + "\t{";
  protected final String TEXT_2078 = NL + "\t\t";
  protected final String TEXT_2079 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_2080 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2081 = " method = getClass().getMethod(\"";
  protected final String TEXT_2082 = "\", null);";
  protected final String TEXT_2083 = NL + "\t\t\t\t";
  protected final String TEXT_2084 = " ";
  protected final String TEXT_2085 = " = (";
  protected final String TEXT_2086 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_2087 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_2088 = " union = ";
  protected final String TEXT_2089 = "Helper(new ";
  protected final String TEXT_2090 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_2091 = " = new ";
  protected final String TEXT_2092 = "(this, ";
  protected final String TEXT_2093 = "null";
  protected final String TEXT_2094 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2095 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2096 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_2097 = NL + "\t\t\t";
  protected final String TEXT_2098 = " ";
  protected final String TEXT_2099 = " = (";
  protected final String TEXT_2100 = ") cache.get(eResource(), this, ";
  protected final String TEXT_2101 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_2102 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2103 = " union = ";
  protected final String TEXT_2104 = "Helper(new ";
  protected final String TEXT_2105 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_2106 = ", ";
  protected final String TEXT_2107 = " = new ";
  protected final String TEXT_2108 = "(this, ";
  protected final String TEXT_2109 = "null";
  protected final String TEXT_2110 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_2111 = ";";
  protected final String TEXT_2112 = NL + "\t\t}";
  protected final String TEXT_2113 = NL + "\t\t";
  protected final String TEXT_2114 = " union = ";
  protected final String TEXT_2115 = "Helper(new ";
  protected final String TEXT_2116 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_2117 = "(this, ";
  protected final String TEXT_2118 = "null";
  protected final String TEXT_2119 = ", union.size(), union.toArray());" + NL + "\t}" + NL;
  protected final String TEXT_2120 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2121 = " ";
  protected final String TEXT_2122 = "()" + NL + "\t{";
  protected final String TEXT_2123 = NL + "\t\tif (isSet";
  protected final String TEXT_2124 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_2125 = "();" + NL + "\t\t}";
  protected final String TEXT_2126 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2127 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_2128 = "();" + NL + "\t\t}";
  protected final String TEXT_2129 = NL + "\t\t";
  protected final String TEXT_2130 = " ";
  protected final String TEXT_2131 = " = ";
  protected final String TEXT_2132 = "();" + NL + "\t\tif (";
  protected final String TEXT_2133 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_2134 = ";" + NL + "\t\t}";
  protected final String TEXT_2135 = NL + "\t\treturn ";
  protected final String TEXT_2136 = "super.";
  protected final String TEXT_2137 = "()";
  protected final String TEXT_2138 = "null";
  protected final String TEXT_2139 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2140 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2141 = "()" + NL + "\t{";
  protected final String TEXT_2142 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2143 = "()";
  protected final String TEXT_2144 = NL + "\t\treturn isSet";
  protected final String TEXT_2145 = "()";
  protected final String TEXT_2146 = ";";
  protected final String TEXT_2147 = NL + "\t\treturn !";
  protected final String TEXT_2148 = "().isEmpty()";
  protected final String TEXT_2149 = ";";
  protected final String TEXT_2150 = NL + "\t\treturn ";
  protected final String TEXT_2151 = "basicGet";
  protected final String TEXT_2152 = "() != null";
  protected final String TEXT_2153 = ";";
  protected final String TEXT_2154 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2155 = ")";
  protected final String TEXT_2156 = ";";
  protected final String TEXT_2157 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2158 = "()";
  protected final String TEXT_2159 = ";";
  protected final String TEXT_2160 = NL + "\t\t\t|| !";
  protected final String TEXT_2161 = "().isEmpty()";
  protected final String TEXT_2162 = ";";
  protected final String TEXT_2163 = NL + "\t\t\t|| ";
  protected final String TEXT_2164 = "basicGet";
  protected final String TEXT_2165 = "() != null";
  protected final String TEXT_2166 = ";";
  protected final String TEXT_2167 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2168 = ")";
  protected final String TEXT_2169 = ";";
  protected final String TEXT_2170 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2171 = "();";
  protected final String TEXT_2172 = NL + "\t\treturn false;";
  protected final String TEXT_2173 = NL + "\t}" + NL;
  protected final String TEXT_2174 = NL;
  protected final String TEXT_2175 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2176 = "() <em>";
  protected final String TEXT_2177 = "</em>}' ";
  protected final String TEXT_2178 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2179 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2180 = "_ESUBSETS = ";
  protected final String TEXT_2181 = ";" + NL;
  protected final String TEXT_2182 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2183 = "() <em>";
  protected final String TEXT_2184 = "</em>}' ";
  protected final String TEXT_2185 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2186 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2187 = "_ESUPERSETS = ";
  protected final String TEXT_2188 = ";" + NL;
  protected final String TEXT_2189 = NL + "\t/**";
  protected final String TEXT_2190 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2191 = "}, with the specified ";
  protected final String TEXT_2192 = ", and appends it to the '<em><b>";
  protected final String TEXT_2193 = "</b></em>' ";
  protected final String TEXT_2194 = ".";
  protected final String TEXT_2195 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2196 = "}, with the specified ";
  protected final String TEXT_2197 = ", and sets the '<em><b>";
  protected final String TEXT_2198 = "</b></em>' ";
  protected final String TEXT_2199 = ".";
  protected final String TEXT_2200 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2201 = "} and appends it to the '<em><b>";
  protected final String TEXT_2202 = "</b></em>' ";
  protected final String TEXT_2203 = ".";
  protected final String TEXT_2204 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2205 = "} and sets the '<em><b>";
  protected final String TEXT_2206 = "</b></em>' ";
  protected final String TEXT_2207 = ".";
  protected final String TEXT_2208 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2209 = NL + "\t * @param ";
  protected final String TEXT_2210 = " The ";
  protected final String TEXT_2211 = " for the new {@link ";
  protected final String TEXT_2212 = "}, or <code>null</code>.";
  protected final String TEXT_2213 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2214 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2215 = "}." + NL + "\t * @see #";
  protected final String TEXT_2216 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2217 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2218 = NL + "\t";
  protected final String TEXT_2219 = " create";
  protected final String TEXT_2220 = "(";
  protected final String TEXT_2221 = ", ";
  protected final String TEXT_2222 = " eClass);" + NL;
  protected final String TEXT_2223 = NL + "\tpublic ";
  protected final String TEXT_2224 = " create";
  protected final String TEXT_2225 = "(";
  protected final String TEXT_2226 = ", ";
  protected final String TEXT_2227 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2228 = " new";
  protected final String TEXT_2229 = " = (";
  protected final String TEXT_2230 = ") create(eClass);";
  protected final String TEXT_2231 = NL + "\t\t";
  protected final String TEXT_2232 = "().add(new";
  protected final String TEXT_2233 = ");";
  protected final String TEXT_2234 = NL + "\t\tset";
  protected final String TEXT_2235 = "(new";
  protected final String TEXT_2236 = ");";
  protected final String TEXT_2237 = NL + "\t\tint ";
  protected final String TEXT_2238 = "ListSize = 0;";
  protected final String TEXT_2239 = NL + "\t\tint ";
  protected final String TEXT_2240 = "Size = ";
  protected final String TEXT_2241 = " == null ? 0 : ";
  protected final String TEXT_2242 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2243 = "Size > ";
  protected final String TEXT_2244 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2245 = "ListSize = ";
  protected final String TEXT_2246 = "Size;";
  protected final String TEXT_2247 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2248 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2249 = ".create";
  protected final String TEXT_2250 = "(";
  protected final String TEXT_2251 = ", ";
  protected final String TEXT_2252 = "i < ";
  protected final String TEXT_2253 = "Size ? (";
  protected final String TEXT_2254 = ") ";
  protected final String TEXT_2255 = ".get(i) : null";
  protected final String TEXT_2256 = ");" + NL + "\t\t}";
  protected final String TEXT_2257 = NL + "\t\tnew";
  protected final String TEXT_2258 = ".create";
  protected final String TEXT_2259 = "(";
  protected final String TEXT_2260 = ", ";
  protected final String TEXT_2261 = ");";
  protected final String TEXT_2262 = NL + "\t\tif (";
  protected final String TEXT_2263 = " != null)";
  protected final String TEXT_2264 = NL + "\t\t\tnew";
  protected final String TEXT_2265 = ".";
  protected final String TEXT_2266 = "().addAll(";
  protected final String TEXT_2267 = ");";
  protected final String TEXT_2268 = NL + "\t\t\tnew";
  protected final String TEXT_2269 = ".set";
  protected final String TEXT_2270 = "(";
  protected final String TEXT_2271 = ");";
  protected final String TEXT_2272 = NL + "\t\treturn new";
  protected final String TEXT_2273 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2274 = NL + "\t/**";
  protected final String TEXT_2275 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2276 = "}, with the specified ";
  protected final String TEXT_2277 = ", and appends it to the '<em><b>";
  protected final String TEXT_2278 = "</b></em>' ";
  protected final String TEXT_2279 = ".";
  protected final String TEXT_2280 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2281 = "},with the specified ";
  protected final String TEXT_2282 = ", and sets the '<em><b>";
  protected final String TEXT_2283 = "</b></em>' ";
  protected final String TEXT_2284 = ".";
  protected final String TEXT_2285 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2286 = "} and appends it to the '<em><b>";
  protected final String TEXT_2287 = "</b></em>' ";
  protected final String TEXT_2288 = ".";
  protected final String TEXT_2289 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2290 = "} and sets the '<em><b>";
  protected final String TEXT_2291 = "</b></em>' ";
  protected final String TEXT_2292 = ".";
  protected final String TEXT_2293 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2294 = NL + "\t * @param ";
  protected final String TEXT_2295 = " The ";
  protected final String TEXT_2296 = " for the new {@link ";
  protected final String TEXT_2297 = "}, or <code>null</code>.";
  protected final String TEXT_2298 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2299 = "}." + NL + "\t * @see #";
  protected final String TEXT_2300 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2301 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2302 = NL + "\t";
  protected final String TEXT_2303 = " create";
  protected final String TEXT_2304 = "(";
  protected final String TEXT_2305 = ");" + NL;
  protected final String TEXT_2306 = NL + "\tpublic ";
  protected final String TEXT_2307 = " create";
  protected final String TEXT_2308 = "(";
  protected final String TEXT_2309 = ")" + NL + "\t{";
  protected final String TEXT_2310 = NL + "\t\treturn create";
  protected final String TEXT_2311 = "(";
  protected final String TEXT_2312 = ", ";
  protected final String TEXT_2313 = ");";
  protected final String TEXT_2314 = NL + "\t\t";
  protected final String TEXT_2315 = " new";
  protected final String TEXT_2316 = " = (";
  protected final String TEXT_2317 = ") create(";
  protected final String TEXT_2318 = ");";
  protected final String TEXT_2319 = NL + "\t\t";
  protected final String TEXT_2320 = "().add(new";
  protected final String TEXT_2321 = ");";
  protected final String TEXT_2322 = NL + "\t\tset";
  protected final String TEXT_2323 = "(new";
  protected final String TEXT_2324 = ");";
  protected final String TEXT_2325 = NL + "\t\tint ";
  protected final String TEXT_2326 = "ListSize = 0;";
  protected final String TEXT_2327 = NL + "\t\tint ";
  protected final String TEXT_2328 = "Size = ";
  protected final String TEXT_2329 = " == null ? 0 : ";
  protected final String TEXT_2330 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2331 = "Size > ";
  protected final String TEXT_2332 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2333 = "ListSize = ";
  protected final String TEXT_2334 = "Size;";
  protected final String TEXT_2335 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2336 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2337 = ".create";
  protected final String TEXT_2338 = "(";
  protected final String TEXT_2339 = ", ";
  protected final String TEXT_2340 = "i < ";
  protected final String TEXT_2341 = "Size ? (";
  protected final String TEXT_2342 = ") ";
  protected final String TEXT_2343 = ".get(i) : null";
  protected final String TEXT_2344 = ");" + NL + "\t\t}";
  protected final String TEXT_2345 = NL + "\t\tnew";
  protected final String TEXT_2346 = ".create";
  protected final String TEXT_2347 = "(";
  protected final String TEXT_2348 = ", ";
  protected final String TEXT_2349 = ");";
  protected final String TEXT_2350 = NL + "\t\tif (";
  protected final String TEXT_2351 = " != null)";
  protected final String TEXT_2352 = NL + "\t\t\tnew";
  protected final String TEXT_2353 = ".";
  protected final String TEXT_2354 = "().addAll(";
  protected final String TEXT_2355 = ");";
  protected final String TEXT_2356 = NL + "\t\t\tnew";
  protected final String TEXT_2357 = ".set";
  protected final String TEXT_2358 = "(";
  protected final String TEXT_2359 = ");";
  protected final String TEXT_2360 = NL + "\t\treturn new";
  protected final String TEXT_2361 = ";";
  protected final String TEXT_2362 = NL + "\t}" + NL;
  protected final String TEXT_2363 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2364 = "} with the specified ";
  protected final String TEXT_2365 = " from the '<em><b>";
  protected final String TEXT_2366 = "</b></em>' ";
  protected final String TEXT_2367 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2368 = NL + "\t * @param ";
  protected final String TEXT_2369 = " The ";
  protected final String TEXT_2370 = " of the {@link ";
  protected final String TEXT_2371 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2372 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2373 = "} with the specified ";
  protected final String TEXT_2374 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2375 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2376 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2377 = NL + "\t";
  protected final String TEXT_2378 = " get";
  protected final String TEXT_2379 = "(";
  protected final String TEXT_2380 = ");" + NL;
  protected final String TEXT_2381 = NL + "\tpublic ";
  protected final String TEXT_2382 = " get";
  protected final String TEXT_2383 = "(";
  protected final String TEXT_2384 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2385 = "(";
  protected final String TEXT_2386 = ", false";
  protected final String TEXT_2387 = ", null";
  protected final String TEXT_2388 = ", false";
  protected final String TEXT_2389 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2390 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2391 = "} with the specified ";
  protected final String TEXT_2392 = " from the '<em><b>";
  protected final String TEXT_2393 = "</b></em>' ";
  protected final String TEXT_2394 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2395 = NL + "\t * @param ";
  protected final String TEXT_2396 = " The ";
  protected final String TEXT_2397 = " of the {@link ";
  protected final String TEXT_2398 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2399 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2400 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2401 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2402 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2403 = "} on demand if not found.";
  protected final String TEXT_2404 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2405 = "} with the specified ";
  protected final String TEXT_2406 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2407 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2408 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2409 = NL + "\t";
  protected final String TEXT_2410 = " get";
  protected final String TEXT_2411 = "(";
  protected final String TEXT_2412 = ", boolean ignoreCase";
  protected final String TEXT_2413 = ", ";
  protected final String TEXT_2414 = " eClass";
  protected final String TEXT_2415 = ", boolean createOnDemand";
  protected final String TEXT_2416 = ");" + NL;
  protected final String TEXT_2417 = NL + "\tpublic ";
  protected final String TEXT_2418 = " get";
  protected final String TEXT_2419 = "(";
  protected final String TEXT_2420 = ", boolean ignoreCase";
  protected final String TEXT_2421 = ", ";
  protected final String TEXT_2422 = " eClass";
  protected final String TEXT_2423 = ", boolean createOnDemand";
  protected final String TEXT_2424 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2425 = "Loop: for (";
  protected final String TEXT_2426 = " i = ";
  protected final String TEXT_2427 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2428 = " ";
  protected final String TEXT_2429 = " = (";
  protected final String TEXT_2430 = ") i.next();";
  protected final String TEXT_2431 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2432 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2433 = "Loop;";
  protected final String TEXT_2434 = NL + "\t\t\t";
  protected final String TEXT_2435 = " ";
  protected final String TEXT_2436 = "List = ";
  protected final String TEXT_2437 = ".";
  protected final String TEXT_2438 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2439 = "ListSize = ";
  protected final String TEXT_2440 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2441 = " || (";
  protected final String TEXT_2442 = " != null && ";
  protected final String TEXT_2443 = ".size() != ";
  protected final String TEXT_2444 = "ListSize";
  protected final String TEXT_2445 = ")";
  protected final String TEXT_2446 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2447 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2448 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2449 = " ";
  protected final String TEXT_2450 = " = (";
  protected final String TEXT_2451 = ") ";
  protected final String TEXT_2452 = "List.get(j);";
  protected final String TEXT_2453 = NL + "\t\t\t\tif (";
  protected final String TEXT_2454 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2455 = ")";
  protected final String TEXT_2456 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2457 = ".";
  protected final String TEXT_2458 = "()) : ";
  protected final String TEXT_2459 = ".get(j).equals(";
  protected final String TEXT_2460 = ".";
  protected final String TEXT_2461 = "())))";
  protected final String TEXT_2462 = NL + "\t\t\t\tif (";
  protected final String TEXT_2463 = " != null && !";
  protected final String TEXT_2464 = ".get(j).equals(";
  protected final String TEXT_2465 = ".";
  protected final String TEXT_2466 = "()))";
  protected final String TEXT_2467 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2468 = "Loop;";
  protected final String TEXT_2469 = NL + "\t\t\t}";
  protected final String TEXT_2470 = NL + "\t\t\t";
  protected final String TEXT_2471 = " ";
  protected final String TEXT_2472 = " = ";
  protected final String TEXT_2473 = ".";
  protected final String TEXT_2474 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2475 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2476 = "Loop;";
  protected final String TEXT_2477 = NL + "\t\t\tif (";
  protected final String TEXT_2478 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2479 = ".equalsIgnoreCase(";
  protected final String TEXT_2480 = ".";
  protected final String TEXT_2481 = "()) : ";
  protected final String TEXT_2482 = ".equals(";
  protected final String TEXT_2483 = ".";
  protected final String TEXT_2484 = "())))";
  protected final String TEXT_2485 = NL + "\t\t\tif (";
  protected final String TEXT_2486 = " != null && !";
  protected final String TEXT_2487 = ".equals(";
  protected final String TEXT_2488 = ".";
  protected final String TEXT_2489 = "()))";
  protected final String TEXT_2490 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2491 = "Loop;";
  protected final String TEXT_2492 = NL + "\t\t\tif (";
  protected final String TEXT_2493 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2494 = ".equalsIgnoreCase(";
  protected final String TEXT_2495 = ".";
  protected final String TEXT_2496 = "()) : ";
  protected final String TEXT_2497 = ".equals(";
  protected final String TEXT_2498 = ".";
  protected final String TEXT_2499 = "())))";
  protected final String TEXT_2500 = NL + "\t\t\tif (";
  protected final String TEXT_2501 = " != null && !";
  protected final String TEXT_2502 = ".equals(";
  protected final String TEXT_2503 = ".";
  protected final String TEXT_2504 = "()))";
  protected final String TEXT_2505 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2506 = "Loop;";
  protected final String TEXT_2507 = NL + "\t\t\treturn ";
  protected final String TEXT_2508 = ";" + NL + "\t\t}";
  protected final String TEXT_2509 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2510 = " && eClass != null";
  protected final String TEXT_2511 = " ? create";
  protected final String TEXT_2512 = "(";
  protected final String TEXT_2513 = ", eClass";
  protected final String TEXT_2514 = ") : null;";
  protected final String TEXT_2515 = NL + "\t\treturn null;";
  protected final String TEXT_2516 = NL + "\t}" + NL;
  protected final String TEXT_2517 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2518 = "()" + NL + "\t{";
  protected final String TEXT_2519 = NL + "  \t\treturn false;";
  protected final String TEXT_2520 = NL + "\t\treturn !((";
  protected final String TEXT_2521 = ".Internal.Wrapper)";
  protected final String TEXT_2522 = "()).featureMap().isEmpty();";
  protected final String TEXT_2523 = NL + "\t\treturn ";
  protected final String TEXT_2524 = " != null && !";
  protected final String TEXT_2525 = ".featureMap().isEmpty();";
  protected final String TEXT_2526 = NL + "\t\treturn ";
  protected final String TEXT_2527 = " != null && !";
  protected final String TEXT_2528 = ".isEmpty();";
  protected final String TEXT_2529 = NL + "\t\t";
  protected final String TEXT_2530 = " ";
  protected final String TEXT_2531 = " = (";
  protected final String TEXT_2532 = ")eVirtualGet(";
  protected final String TEXT_2533 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2534 = " != null && !";
  protected final String TEXT_2535 = ".isEmpty();";
  protected final String TEXT_2536 = NL + "\t\treturn !";
  protected final String TEXT_2537 = "().isEmpty();";
  protected final String TEXT_2538 = NL + "\t\treturn ";
  protected final String TEXT_2539 = " != null;";
  protected final String TEXT_2540 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2541 = ") != null;";
  protected final String TEXT_2542 = NL + "\t\treturn basicGet";
  protected final String TEXT_2543 = "() != null;";
  protected final String TEXT_2544 = NL + "\t\treturn ";
  protected final String TEXT_2545 = " != null;";
  protected final String TEXT_2546 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2547 = ") != null;";
  protected final String TEXT_2548 = NL + "\t\treturn ";
  protected final String TEXT_2549 = "() != null;";
  protected final String TEXT_2550 = NL + "\t\treturn ((";
  protected final String TEXT_2551 = " & ";
  protected final String TEXT_2552 = "_EFLAG) != 0) != ";
  protected final String TEXT_2553 = "_EDEFAULT;";
  protected final String TEXT_2554 = NL + "\t\treturn ";
  protected final String TEXT_2555 = " != ";
  protected final String TEXT_2556 = "_EDEFAULT;";
  protected final String TEXT_2557 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2558 = ", ";
  protected final String TEXT_2559 = "_EDEFAULT) != ";
  protected final String TEXT_2560 = "_EDEFAULT;";
  protected final String TEXT_2561 = NL + "\t\treturn ";
  protected final String TEXT_2562 = "() != ";
  protected final String TEXT_2563 = "_EDEFAULT;";
  protected final String TEXT_2564 = NL + "\t\treturn ";
  protected final String TEXT_2565 = "_EDEFAULT == null ? ";
  protected final String TEXT_2566 = " != null : !";
  protected final String TEXT_2567 = "_EDEFAULT.equals(";
  protected final String TEXT_2568 = ");";
  protected final String TEXT_2569 = NL + "\t\t";
  protected final String TEXT_2570 = " ";
  protected final String TEXT_2571 = " = (";
  protected final String TEXT_2572 = ")eVirtualGet(";
  protected final String TEXT_2573 = ", ";
  protected final String TEXT_2574 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_2575 = "_EDEFAULT == null ? ";
  protected final String TEXT_2576 = " != null : !";
  protected final String TEXT_2577 = "_EDEFAULT.equals(";
  protected final String TEXT_2578 = ");";
  protected final String TEXT_2579 = NL + "\t\treturn ";
  protected final String TEXT_2580 = "_EDEFAULT == null ? ";
  protected final String TEXT_2581 = "() != null : !";
  protected final String TEXT_2582 = "_EDEFAULT.equals(";
  protected final String TEXT_2583 = "());";
  protected final String TEXT_2584 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2585 = ");";
  protected final String TEXT_2586 = NL + "\t\t";
  protected final String TEXT_2587 = " ";
  protected final String TEXT_2588 = " = (";
  protected final String TEXT_2589 = ")eVirtualGet(";
  protected final String TEXT_2590 = ");";
  protected final String TEXT_2591 = NL + "\t\treturn ";
  protected final String TEXT_2592 = " != null && ((";
  protected final String TEXT_2593 = ".Unsettable)";
  protected final String TEXT_2594 = ").isSet();";
  protected final String TEXT_2595 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2596 = ");";
  protected final String TEXT_2597 = NL + "\t\treturn (";
  protected final String TEXT_2598 = " & ";
  protected final String TEXT_2599 = "_ESETFLAG) != 0;";
  protected final String TEXT_2600 = NL + "\t\treturn ";
  protected final String TEXT_2601 = "ESet;";
  protected final String TEXT_2602 = NL + "\t\treturn !((";
  protected final String TEXT_2603 = ".Internal)((";
  protected final String TEXT_2604 = ".Internal.Wrapper)get";
  protected final String TEXT_2605 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2606 = ");";
  protected final String TEXT_2607 = NL + "\t\treturn !((";
  protected final String TEXT_2608 = ".Internal)get";
  protected final String TEXT_2609 = "()).isEmpty(";
  protected final String TEXT_2610 = ");";
  protected final String TEXT_2611 = NL;
  protected final String TEXT_2612 = NL + "\t\treturn ";
  protected final String TEXT_2613 = ".";
  protected final String TEXT_2614 = "(this);";
  protected final String TEXT_2615 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2616 = "' ";
  protected final String TEXT_2617 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2618 = NL + "\t}" + NL;
  protected final String TEXT_2619 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2620 = " ";
  protected final String TEXT_2621 = "()" + NL + "\t{";
  protected final String TEXT_2622 = NL + "\t\treturn ";
  protected final String TEXT_2623 = "();";
  protected final String TEXT_2624 = NL + "\t\treturn new ";
  protected final String TEXT_2625 = ".UnmodifiableEList(this, ";
  protected final String TEXT_2626 = "null";
  protected final String TEXT_2627 = ", 0, ";
  protected final String TEXT_2628 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2629 = NL + "\t\treturn null;";
  protected final String TEXT_2630 = NL + "\t\treturn ";
  protected final String TEXT_2631 = "();";
  protected final String TEXT_2632 = NL + "\t}" + NL;
  protected final String TEXT_2633 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2634 = " basicGet";
  protected final String TEXT_2635 = "()" + NL + "\t{";
  protected final String TEXT_2636 = NL + "\t\treturn null;";
  protected final String TEXT_2637 = NL + "\t\treturn ";
  protected final String TEXT_2638 = "basicGet";
  protected final String TEXT_2639 = "();";
  protected final String TEXT_2640 = NL + "\t}" + NL;
  protected final String TEXT_2641 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2642 = " basicSet";
  protected final String TEXT_2643 = "(";
  protected final String TEXT_2644 = " new";
  protected final String TEXT_2645 = ", ";
  protected final String TEXT_2646 = " msgs)" + NL + "\t{";
  protected final String TEXT_2647 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2648 = NL + "\t\tif (new";
  protected final String TEXT_2649 = " != null && !(new";
  protected final String TEXT_2650 = " instanceof ";
  protected final String TEXT_2651 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2652 = "));" + NL + "\t\t}";
  protected final String TEXT_2653 = NL + "\t\treturn basicSet";
  protected final String TEXT_2654 = "(";
  protected final String TEXT_2655 = "(";
  protected final String TEXT_2656 = ") ";
  protected final String TEXT_2657 = "new";
  protected final String TEXT_2658 = ", msgs);";
  protected final String TEXT_2659 = NL + "\t\tset";
  protected final String TEXT_2660 = "(";
  protected final String TEXT_2661 = "(";
  protected final String TEXT_2662 = ") ";
  protected final String TEXT_2663 = "new";
  protected final String TEXT_2664 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2665 = NL + "\t}" + NL;
  protected final String TEXT_2666 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_2667 = "(";
  protected final String TEXT_2668 = " new";
  protected final String TEXT_2669 = ")" + NL + "\t{";
  protected final String TEXT_2670 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2671 = NL + "\t\tif (new";
  protected final String TEXT_2672 = " != null && !(new";
  protected final String TEXT_2673 = " instanceof ";
  protected final String TEXT_2674 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2675 = "));" + NL + "\t\t}";
  protected final String TEXT_2676 = NL + "\t\tset";
  protected final String TEXT_2677 = "(";
  protected final String TEXT_2678 = "(";
  protected final String TEXT_2679 = ") ";
  protected final String TEXT_2680 = "new";
  protected final String TEXT_2681 = ");";
  protected final String TEXT_2682 = NL + "\t}" + NL;
  protected final String TEXT_2683 = NL;
  protected final String TEXT_2684 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2685 = "() <em>";
  protected final String TEXT_2686 = "</em>}' ";
  protected final String TEXT_2687 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2688 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2689 = "_ESUBSETS = ";
  protected final String TEXT_2690 = ";" + NL;
  protected final String TEXT_2691 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2692 = "() <em>";
  protected final String TEXT_2693 = "</em>}' ";
  protected final String TEXT_2694 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2695 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2696 = "_ESUPERSETS = ";
  protected final String TEXT_2697 = ";" + NL;
  protected final String TEXT_2698 = NL + "\t/**";
  protected final String TEXT_2699 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2700 = "}, with the specified ";
  protected final String TEXT_2701 = ", and appends it to the '<em><b>";
  protected final String TEXT_2702 = "</b></em>' ";
  protected final String TEXT_2703 = ".";
  protected final String TEXT_2704 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2705 = "}, with the specified ";
  protected final String TEXT_2706 = ", and sets the '<em><b>";
  protected final String TEXT_2707 = "</b></em>' ";
  protected final String TEXT_2708 = ".";
  protected final String TEXT_2709 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2710 = "} and appends it to the '<em><b>";
  protected final String TEXT_2711 = "</b></em>' ";
  protected final String TEXT_2712 = ".";
  protected final String TEXT_2713 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2714 = "} and sets the '<em><b>";
  protected final String TEXT_2715 = "</b></em>' ";
  protected final String TEXT_2716 = ".";
  protected final String TEXT_2717 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2718 = NL + "\t * @param ";
  protected final String TEXT_2719 = " The ";
  protected final String TEXT_2720 = " for the new {@link ";
  protected final String TEXT_2721 = "}, or <code>null</code>.";
  protected final String TEXT_2722 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2723 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2724 = "}." + NL + "\t * @see #";
  protected final String TEXT_2725 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2726 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2727 = NL + "\t";
  protected final String TEXT_2728 = " create";
  protected final String TEXT_2729 = "(";
  protected final String TEXT_2730 = ", ";
  protected final String TEXT_2731 = " eClass);" + NL;
  protected final String TEXT_2732 = NL + "\tpublic ";
  protected final String TEXT_2733 = " create";
  protected final String TEXT_2734 = "(";
  protected final String TEXT_2735 = ", ";
  protected final String TEXT_2736 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2737 = " new";
  protected final String TEXT_2738 = " = (";
  protected final String TEXT_2739 = ") create(eClass);";
  protected final String TEXT_2740 = NL + "\t\t";
  protected final String TEXT_2741 = "().add(new";
  protected final String TEXT_2742 = ");";
  protected final String TEXT_2743 = NL + "\t\tset";
  protected final String TEXT_2744 = "(new";
  protected final String TEXT_2745 = ");";
  protected final String TEXT_2746 = NL + "\t\tint ";
  protected final String TEXT_2747 = "ListSize = 0;";
  protected final String TEXT_2748 = NL + "\t\tint ";
  protected final String TEXT_2749 = "Size = ";
  protected final String TEXT_2750 = " == null ? 0 : ";
  protected final String TEXT_2751 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2752 = "Size > ";
  protected final String TEXT_2753 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2754 = "ListSize = ";
  protected final String TEXT_2755 = "Size;";
  protected final String TEXT_2756 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2757 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2758 = ".create";
  protected final String TEXT_2759 = "(";
  protected final String TEXT_2760 = ", ";
  protected final String TEXT_2761 = "i < ";
  protected final String TEXT_2762 = "Size ? (";
  protected final String TEXT_2763 = ") ";
  protected final String TEXT_2764 = ".get(i) : null";
  protected final String TEXT_2765 = ");" + NL + "\t\t}";
  protected final String TEXT_2766 = NL + "\t\tnew";
  protected final String TEXT_2767 = ".create";
  protected final String TEXT_2768 = "(";
  protected final String TEXT_2769 = ", ";
  protected final String TEXT_2770 = ");";
  protected final String TEXT_2771 = NL + "\t\tif (";
  protected final String TEXT_2772 = " != null)";
  protected final String TEXT_2773 = NL + "\t\t\tnew";
  protected final String TEXT_2774 = ".";
  protected final String TEXT_2775 = "().addAll(";
  protected final String TEXT_2776 = ");";
  protected final String TEXT_2777 = NL + "\t\t\tnew";
  protected final String TEXT_2778 = ".set";
  protected final String TEXT_2779 = "(";
  protected final String TEXT_2780 = ");";
  protected final String TEXT_2781 = NL + "\t\treturn new";
  protected final String TEXT_2782 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2783 = NL + "\t/**";
  protected final String TEXT_2784 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2785 = "}, with the specified ";
  protected final String TEXT_2786 = ", and appends it to the '<em><b>";
  protected final String TEXT_2787 = "</b></em>' ";
  protected final String TEXT_2788 = ".";
  protected final String TEXT_2789 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2790 = "},with the specified ";
  protected final String TEXT_2791 = ", and sets the '<em><b>";
  protected final String TEXT_2792 = "</b></em>' ";
  protected final String TEXT_2793 = ".";
  protected final String TEXT_2794 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2795 = "} and appends it to the '<em><b>";
  protected final String TEXT_2796 = "</b></em>' ";
  protected final String TEXT_2797 = ".";
  protected final String TEXT_2798 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2799 = "} and sets the '<em><b>";
  protected final String TEXT_2800 = "</b></em>' ";
  protected final String TEXT_2801 = ".";
  protected final String TEXT_2802 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2803 = NL + "\t * @param ";
  protected final String TEXT_2804 = " The ";
  protected final String TEXT_2805 = " for the new {@link ";
  protected final String TEXT_2806 = "}, or <code>null</code>.";
  protected final String TEXT_2807 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2808 = "}." + NL + "\t * @see #";
  protected final String TEXT_2809 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2810 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2811 = NL + "\t";
  protected final String TEXT_2812 = " create";
  protected final String TEXT_2813 = "(";
  protected final String TEXT_2814 = ");" + NL;
  protected final String TEXT_2815 = NL + "\tpublic ";
  protected final String TEXT_2816 = " create";
  protected final String TEXT_2817 = "(";
  protected final String TEXT_2818 = ")" + NL + "\t{";
  protected final String TEXT_2819 = NL + "\t\treturn create";
  protected final String TEXT_2820 = "(";
  protected final String TEXT_2821 = ", ";
  protected final String TEXT_2822 = ");";
  protected final String TEXT_2823 = NL + "\t\t";
  protected final String TEXT_2824 = " new";
  protected final String TEXT_2825 = " = (";
  protected final String TEXT_2826 = ") create(";
  protected final String TEXT_2827 = ");";
  protected final String TEXT_2828 = NL + "\t\t";
  protected final String TEXT_2829 = "().add(new";
  protected final String TEXT_2830 = ");";
  protected final String TEXT_2831 = NL + "\t\tset";
  protected final String TEXT_2832 = "(new";
  protected final String TEXT_2833 = ");";
  protected final String TEXT_2834 = NL + "\t\tint ";
  protected final String TEXT_2835 = "ListSize = 0;";
  protected final String TEXT_2836 = NL + "\t\tint ";
  protected final String TEXT_2837 = "Size = ";
  protected final String TEXT_2838 = " == null ? 0 : ";
  protected final String TEXT_2839 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2840 = "Size > ";
  protected final String TEXT_2841 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2842 = "ListSize = ";
  protected final String TEXT_2843 = "Size;";
  protected final String TEXT_2844 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2845 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2846 = ".create";
  protected final String TEXT_2847 = "(";
  protected final String TEXT_2848 = ", ";
  protected final String TEXT_2849 = "i < ";
  protected final String TEXT_2850 = "Size ? (";
  protected final String TEXT_2851 = ") ";
  protected final String TEXT_2852 = ".get(i) : null";
  protected final String TEXT_2853 = ");" + NL + "\t\t}";
  protected final String TEXT_2854 = NL + "\t\tnew";
  protected final String TEXT_2855 = ".create";
  protected final String TEXT_2856 = "(";
  protected final String TEXT_2857 = ", ";
  protected final String TEXT_2858 = ");";
  protected final String TEXT_2859 = NL + "\t\tif (";
  protected final String TEXT_2860 = " != null)";
  protected final String TEXT_2861 = NL + "\t\t\tnew";
  protected final String TEXT_2862 = ".";
  protected final String TEXT_2863 = "().addAll(";
  protected final String TEXT_2864 = ");";
  protected final String TEXT_2865 = NL + "\t\t\tnew";
  protected final String TEXT_2866 = ".set";
  protected final String TEXT_2867 = "(";
  protected final String TEXT_2868 = ");";
  protected final String TEXT_2869 = NL + "\t\treturn new";
  protected final String TEXT_2870 = ";";
  protected final String TEXT_2871 = NL + "\t}" + NL;
  protected final String TEXT_2872 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2873 = "} with the specified ";
  protected final String TEXT_2874 = " from the '<em><b>";
  protected final String TEXT_2875 = "</b></em>' ";
  protected final String TEXT_2876 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2877 = NL + "\t * @param ";
  protected final String TEXT_2878 = " The ";
  protected final String TEXT_2879 = " of the {@link ";
  protected final String TEXT_2880 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2881 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2882 = "} with the specified ";
  protected final String TEXT_2883 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2884 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2885 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2886 = NL + "\t";
  protected final String TEXT_2887 = " get";
  protected final String TEXT_2888 = "(";
  protected final String TEXT_2889 = ");" + NL;
  protected final String TEXT_2890 = NL + "\tpublic ";
  protected final String TEXT_2891 = " get";
  protected final String TEXT_2892 = "(";
  protected final String TEXT_2893 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2894 = "(";
  protected final String TEXT_2895 = ", false";
  protected final String TEXT_2896 = ", null";
  protected final String TEXT_2897 = ", false";
  protected final String TEXT_2898 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2899 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2900 = "} with the specified ";
  protected final String TEXT_2901 = " from the '<em><b>";
  protected final String TEXT_2902 = "</b></em>' ";
  protected final String TEXT_2903 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2904 = NL + "\t * @param ";
  protected final String TEXT_2905 = " The ";
  protected final String TEXT_2906 = " of the {@link ";
  protected final String TEXT_2907 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2908 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2909 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2910 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2911 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2912 = "} on demand if not found.";
  protected final String TEXT_2913 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2914 = "} with the specified ";
  protected final String TEXT_2915 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2916 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2917 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2918 = NL + "\t";
  protected final String TEXT_2919 = " get";
  protected final String TEXT_2920 = "(";
  protected final String TEXT_2921 = ", boolean ignoreCase";
  protected final String TEXT_2922 = ", ";
  protected final String TEXT_2923 = " eClass";
  protected final String TEXT_2924 = ", boolean createOnDemand";
  protected final String TEXT_2925 = ");" + NL;
  protected final String TEXT_2926 = NL + "\tpublic ";
  protected final String TEXT_2927 = " get";
  protected final String TEXT_2928 = "(";
  protected final String TEXT_2929 = ", boolean ignoreCase";
  protected final String TEXT_2930 = ", ";
  protected final String TEXT_2931 = " eClass";
  protected final String TEXT_2932 = ", boolean createOnDemand";
  protected final String TEXT_2933 = ")" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2934 = "Loop: for (";
  protected final String TEXT_2935 = " i = ";
  protected final String TEXT_2936 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2937 = " ";
  protected final String TEXT_2938 = " = (";
  protected final String TEXT_2939 = ") i.next();";
  protected final String TEXT_2940 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2941 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2942 = "Loop;";
  protected final String TEXT_2943 = NL + "\t\t\t";
  protected final String TEXT_2944 = " ";
  protected final String TEXT_2945 = "List = ";
  protected final String TEXT_2946 = ".";
  protected final String TEXT_2947 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2948 = "ListSize = ";
  protected final String TEXT_2949 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2950 = " || (";
  protected final String TEXT_2951 = " != null && ";
  protected final String TEXT_2952 = ".size() != ";
  protected final String TEXT_2953 = "ListSize";
  protected final String TEXT_2954 = ")";
  protected final String TEXT_2955 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2956 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2957 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2958 = " ";
  protected final String TEXT_2959 = " = (";
  protected final String TEXT_2960 = ") ";
  protected final String TEXT_2961 = "List.get(j);";
  protected final String TEXT_2962 = NL + "\t\t\t\tif (";
  protected final String TEXT_2963 = " != null && !(ignoreCase ? ((";
  protected final String TEXT_2964 = ")";
  protected final String TEXT_2965 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2966 = ".";
  protected final String TEXT_2967 = "()) : ";
  protected final String TEXT_2968 = ".get(j).equals(";
  protected final String TEXT_2969 = ".";
  protected final String TEXT_2970 = "())))";
  protected final String TEXT_2971 = NL + "\t\t\t\tif (";
  protected final String TEXT_2972 = " != null && !";
  protected final String TEXT_2973 = ".get(j).equals(";
  protected final String TEXT_2974 = ".";
  protected final String TEXT_2975 = "()))";
  protected final String TEXT_2976 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2977 = "Loop;";
  protected final String TEXT_2978 = NL + "\t\t\t}";
  protected final String TEXT_2979 = NL + "\t\t\t";
  protected final String TEXT_2980 = " ";
  protected final String TEXT_2981 = " = ";
  protected final String TEXT_2982 = ".";
  protected final String TEXT_2983 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2984 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2985 = "Loop;";
  protected final String TEXT_2986 = NL + "\t\t\tif (";
  protected final String TEXT_2987 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2988 = ".equalsIgnoreCase(";
  protected final String TEXT_2989 = ".";
  protected final String TEXT_2990 = "()) : ";
  protected final String TEXT_2991 = ".equals(";
  protected final String TEXT_2992 = ".";
  protected final String TEXT_2993 = "())))";
  protected final String TEXT_2994 = NL + "\t\t\tif (";
  protected final String TEXT_2995 = " != null && !";
  protected final String TEXT_2996 = ".equals(";
  protected final String TEXT_2997 = ".";
  protected final String TEXT_2998 = "()))";
  protected final String TEXT_2999 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3000 = "Loop;";
  protected final String TEXT_3001 = NL + "\t\t\tif (";
  protected final String TEXT_3002 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3003 = ".equalsIgnoreCase(";
  protected final String TEXT_3004 = ".";
  protected final String TEXT_3005 = "()) : ";
  protected final String TEXT_3006 = ".equals(";
  protected final String TEXT_3007 = ".";
  protected final String TEXT_3008 = "())))";
  protected final String TEXT_3009 = NL + "\t\t\tif (";
  protected final String TEXT_3010 = " != null && !";
  protected final String TEXT_3011 = ".equals(";
  protected final String TEXT_3012 = ".";
  protected final String TEXT_3013 = "()))";
  protected final String TEXT_3014 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3015 = "Loop;";
  protected final String TEXT_3016 = NL + "\t\t\treturn ";
  protected final String TEXT_3017 = ";" + NL + "\t\t}";
  protected final String TEXT_3018 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3019 = " && eClass != null";
  protected final String TEXT_3020 = " ? create";
  protected final String TEXT_3021 = "(";
  protected final String TEXT_3022 = ", eClass";
  protected final String TEXT_3023 = ") : null;";
  protected final String TEXT_3024 = NL + "\t\treturn null;";
  protected final String TEXT_3025 = NL + "\t}" + NL;
  protected final String TEXT_3026 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3027 = "()" + NL + "\t{";
  protected final String TEXT_3028 = NL + "  \t\treturn false;";
  protected final String TEXT_3029 = NL + "\t\treturn !((";
  protected final String TEXT_3030 = ".Internal.Wrapper)";
  protected final String TEXT_3031 = "()).featureMap().isEmpty();";
  protected final String TEXT_3032 = NL + "\t\treturn ";
  protected final String TEXT_3033 = " != null && !";
  protected final String TEXT_3034 = ".featureMap().isEmpty();";
  protected final String TEXT_3035 = NL + "\t\treturn ";
  protected final String TEXT_3036 = " != null && !";
  protected final String TEXT_3037 = ".isEmpty();";
  protected final String TEXT_3038 = NL + "\t\t";
  protected final String TEXT_3039 = " ";
  protected final String TEXT_3040 = " = (";
  protected final String TEXT_3041 = ")eVirtualGet(";
  protected final String TEXT_3042 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3043 = " != null && !";
  protected final String TEXT_3044 = ".isEmpty();";
  protected final String TEXT_3045 = NL + "\t\treturn !";
  protected final String TEXT_3046 = "().isEmpty();";
  protected final String TEXT_3047 = NL + "\t\treturn ";
  protected final String TEXT_3048 = " != null;";
  protected final String TEXT_3049 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3050 = ") != null;";
  protected final String TEXT_3051 = NL + "\t\treturn basicGet";
  protected final String TEXT_3052 = "() != null;";
  protected final String TEXT_3053 = NL + "\t\treturn ";
  protected final String TEXT_3054 = " != null;";
  protected final String TEXT_3055 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3056 = ") != null;";
  protected final String TEXT_3057 = NL + "\t\treturn ";
  protected final String TEXT_3058 = "() != null;";
  protected final String TEXT_3059 = NL + "\t\treturn ((";
  protected final String TEXT_3060 = " & ";
  protected final String TEXT_3061 = "_EFLAG) != 0) != ";
  protected final String TEXT_3062 = "_EDEFAULT;";
  protected final String TEXT_3063 = NL + "\t\treturn ";
  protected final String TEXT_3064 = " != ";
  protected final String TEXT_3065 = "_EDEFAULT;";
  protected final String TEXT_3066 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3067 = ", ";
  protected final String TEXT_3068 = "_EDEFAULT) != ";
  protected final String TEXT_3069 = "_EDEFAULT;";
  protected final String TEXT_3070 = NL + "\t\treturn ";
  protected final String TEXT_3071 = "() != ";
  protected final String TEXT_3072 = "_EDEFAULT;";
  protected final String TEXT_3073 = NL + "\t\treturn ";
  protected final String TEXT_3074 = "_EDEFAULT == null ? ";
  protected final String TEXT_3075 = " != null : !";
  protected final String TEXT_3076 = "_EDEFAULT.equals(";
  protected final String TEXT_3077 = ");";
  protected final String TEXT_3078 = NL + "\t\t";
  protected final String TEXT_3079 = " ";
  protected final String TEXT_3080 = " = (";
  protected final String TEXT_3081 = ")eVirtualGet(";
  protected final String TEXT_3082 = ", ";
  protected final String TEXT_3083 = "_EDEFAULT);" + NL + "\t\treturn ";
  protected final String TEXT_3084 = "_EDEFAULT == null ? ";
  protected final String TEXT_3085 = " != null : !";
  protected final String TEXT_3086 = "_EDEFAULT.equals(";
  protected final String TEXT_3087 = ");";
  protected final String TEXT_3088 = NL + "\t\treturn ";
  protected final String TEXT_3089 = "_EDEFAULT == null ? ";
  protected final String TEXT_3090 = "() != null : !";
  protected final String TEXT_3091 = "_EDEFAULT.equals(";
  protected final String TEXT_3092 = "());";
  protected final String TEXT_3093 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3094 = ");";
  protected final String TEXT_3095 = NL + "\t\t";
  protected final String TEXT_3096 = " ";
  protected final String TEXT_3097 = " = (";
  protected final String TEXT_3098 = ")eVirtualGet(";
  protected final String TEXT_3099 = ");";
  protected final String TEXT_3100 = NL + "\t\treturn ";
  protected final String TEXT_3101 = " != null && ((";
  protected final String TEXT_3102 = ".Unsettable)";
  protected final String TEXT_3103 = ").isSet();";
  protected final String TEXT_3104 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3105 = ");";
  protected final String TEXT_3106 = NL + "\t\treturn (";
  protected final String TEXT_3107 = " & ";
  protected final String TEXT_3108 = "_ESETFLAG) != 0;";
  protected final String TEXT_3109 = NL + "\t\treturn ";
  protected final String TEXT_3110 = "ESet;";
  protected final String TEXT_3111 = NL + "\t\treturn !((";
  protected final String TEXT_3112 = ".Internal)((";
  protected final String TEXT_3113 = ".Internal.Wrapper)get";
  protected final String TEXT_3114 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3115 = ");";
  protected final String TEXT_3116 = NL + "\t\treturn !((";
  protected final String TEXT_3117 = ".Internal)get";
  protected final String TEXT_3118 = "()).isEmpty(";
  protected final String TEXT_3119 = ");";
  protected final String TEXT_3120 = NL;
  protected final String TEXT_3121 = NL + "\t\treturn ";
  protected final String TEXT_3122 = ".";
  protected final String TEXT_3123 = "(this);";
  protected final String TEXT_3124 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3125 = "' ";
  protected final String TEXT_3126 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3127 = NL + "\t}" + NL;
  protected final String TEXT_3128 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_3129 = " ";
  protected final String TEXT_3130 = "(";
  protected final String TEXT_3131 = ")";
  protected final String TEXT_3132 = NL + "\t{";
  protected final String TEXT_3133 = NL + "\t\t";
  protected final String TEXT_3134 = "(";
  protected final String TEXT_3135 = ");";
  protected final String TEXT_3136 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3137 = NL + "\t\treturn ";
  protected final String TEXT_3138 = "(";
  protected final String TEXT_3139 = ");";
  protected final String TEXT_3140 = NL + "\t}" + NL;
  protected final String TEXT_3141 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
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
    } else {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_403);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_404);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_407);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_410);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_413);
    } else {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_415);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_420);
    } else {
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_424);
    }
    } else {
    stringBuffer.append(TEXT_425);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_426);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_428);
    } else {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_431);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_432);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_438);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(TEXT_443);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_445);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_449);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_452);
    }
    stringBuffer.append(TEXT_453);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_457);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_459);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_467);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_471);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_472);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_474);
    }
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_479);
    }
    stringBuffer.append(TEXT_480);
    }
    stringBuffer.append(TEXT_481);
    }
    stringBuffer.append(TEXT_482);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_486);
    } else {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_492);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
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
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_505);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_510);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_514);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_515);
    } else {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_517);
    }
    stringBuffer.append(TEXT_518);
    } else {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_523);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(TEXT_529);
    }
    stringBuffer.append(TEXT_530);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_532);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_533);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_534);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_535);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_536);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_539);
    }
    stringBuffer.append(TEXT_540);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_544);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_546);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_547);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_552);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_554);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_558);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_561);
    }
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_566);
    }
    stringBuffer.append(TEXT_567);
    }
    stringBuffer.append(TEXT_568);
    }
    stringBuffer.append(TEXT_569);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_572);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_575);
    } else {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_580);
    }
    } else {
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_583);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_584);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_591);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_594);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_596);
    }
    }
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_598);
    } else {
    stringBuffer.append(TEXT_599);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_602);
    } else {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(TEXT_607);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_614);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_618);
    }
    stringBuffer.append(TEXT_619);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_637);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_643);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_648);
    }
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_661);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_671);
    }
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_675);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_676);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_679);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_683);
    }
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_686);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_689);
    }
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_691);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_698);
    }
    stringBuffer.append(TEXT_699);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_710);
    }
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_716);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_720);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    } else {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_731);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_736);
    } else {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_744);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_746);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_753);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_756);
    }
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_758);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_762);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_763);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_764);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_765);
    }
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_768);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_770);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_771);
    } else {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_773);
    }
    stringBuffer.append(TEXT_774);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_778);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_781);
    } else {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_782);
    }
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_785);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_787);
    }
    }
    }
    stringBuffer.append(TEXT_788);
    if (!genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_789);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_791);
    for (Iterator subsetGenFeatures = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).iterator(); subsetGenFeatures.hasNext(); ) { GenFeature subsetGenFeature = (GenFeature) subsetGenFeatures.next();
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_792);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_793);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_795);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_796);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_798);
    }
    stringBuffer.append(TEXT_799);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_803);
    }
    for (Iterator supersetGenFeatures = UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).iterator(); supersetGenFeatures.hasNext(); ) { GenFeature supersetGenFeature = (GenFeature) supersetGenFeatures.next();
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_805);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_813);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(supersetGenFeature.getImportedType());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_817);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_818);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_820);
    }
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    }
    stringBuffer.append(TEXT_826);
    }
    stringBuffer.append(TEXT_827);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_830);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_832);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_834);
    }
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_836);
    }
    stringBuffer.append(TEXT_837);
    } else {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_839);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_841);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_843);
    }
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_845);
    }
    stringBuffer.append(TEXT_846);
    }
    } else {
    stringBuffer.append(TEXT_847);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_848);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_851);
    } else {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_854);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_855);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_859);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_862);
    } else {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_867);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_869);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_875);
    } else {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_879);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_884);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_886);
    } else {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_888);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_889);
    } else {
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_891);
    }
    stringBuffer.append(TEXT_892);
    }
    } else {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_895);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_896);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_901);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_903);
    }
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_905);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_908);
    }
    stringBuffer.append(TEXT_909);
    } else {
    stringBuffer.append(TEXT_910);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_912);
    } else {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_914);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_916);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_921);
    }
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_925);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_930);
    }
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_933);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_937);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_942);
    }
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_944);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_947);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_951);
    }
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_954);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_957);
    }
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_959);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_964);
    }
    stringBuffer.append(TEXT_965);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_970);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_973);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_977);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_979);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_983);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_986);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_988);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_991);
    } else {
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_993);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_997);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_999);
    } else {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1001);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1002);
    } else {
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1004);
    }
    stringBuffer.append(TEXT_1005);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1011);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1014);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1017);
    } else {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1019);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1023);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1026);
    } else {
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1029);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1030);
    } else {
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1032);
    }
    stringBuffer.append(TEXT_1033);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1038);
    } else {
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1042);
    }
    } else {
    stringBuffer.append(TEXT_1043);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1046);
    } else {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1049);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1050);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1057);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1059);
    }
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1061);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1064);
    }
    stringBuffer.append(TEXT_1065);
    } else {
    stringBuffer.append(TEXT_1066);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1068);
    } else {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1070);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1072);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1077);
    }
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1081);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1083);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1086);
    } else {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1088);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1093);
    } else {
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1097);
    }
    } else {
    stringBuffer.append(TEXT_1098);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1101);
    } else {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1104);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1105);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    stringBuffer.append(TEXT_1106);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1113);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1120);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1121);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1126);
    } else {
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1131);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1135);
    } else {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1139);
    }
    }
    stringBuffer.append(TEXT_1140);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1144);
    }
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1148);
    } else {
    stringBuffer.append(TEXT_1149);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1152);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1153);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1154);
    } else { int index = 0;
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1157);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1158);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1162);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1165);
    } else {
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1168);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1170);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1178);
    }
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1182);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1183);
    }
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1187);
    }
    stringBuffer.append(TEXT_1188);
    } else {
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1191);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1192);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1193);
    }
    } else {
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1195);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1199);
    } else {
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1203);
    }
    }
    }
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1205);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1206);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1211);
    } else {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1216);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1220);
    } else {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1224);
    }
    }
    stringBuffer.append(TEXT_1225);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1229);
    }
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1232);
    } else {
    stringBuffer.append(TEXT_1233);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1237);
    } else { int index = 0;
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1241);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1243);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_1244);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1245);
    } else {
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1250);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1253);
    } else {
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1256);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1258);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1266);
    }
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1270);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1271);
    }
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_1275);
    }
    stringBuffer.append(TEXT_1276);
    } else {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1279);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1280);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_1281);
    }
    } else {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1283);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1287);
    } else {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1291);
    }
    }
    }
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    }
    stringBuffer.append(TEXT_1294);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1299);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1303);
    }
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1307);
    } else {
    stringBuffer.append(TEXT_1308);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1312);
    } else {
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1318);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1319);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1320);
    }
    stringBuffer.append(TEXT_1321);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1326);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1330);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1331);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1333);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1335);
    }
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1339);
    } else {
    stringBuffer.append(TEXT_1340);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1344);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1346);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1347);
    }
    stringBuffer.append(TEXT_1348);
    } else { int index = 0;
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1352);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1354);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1355);
    }
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1362);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1365);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1372);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1373);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1376);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1377);
    }
    }
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1384);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1393);
    } else {
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1398);
    }
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1400);
    }
    stringBuffer.append(TEXT_1401);
    } else {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1408);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1416);
    } else {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1421);
    }
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1423);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1431);
    } else {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1436);
    }
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1438);
    }
    }
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1440);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1441);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1442);
    }
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1445);
    }
    stringBuffer.append(TEXT_1446);
    } else {
    stringBuffer.append(TEXT_1447);
    }
    stringBuffer.append(TEXT_1448);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1450);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1451);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1454);
    } else {
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1457);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1460);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1467);
    } else {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1469);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1471);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1473);
    } else {
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1475);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1477);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1479);
    } else {
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1481);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1485);
    } else {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1488);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1492);
    } else {
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1495);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1500);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1510);
    } else {
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1515);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1517);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1522);
    }
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1526);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1528);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1531);
    } else {
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1533);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1538);
    } else {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1542);
    }
    } else {
    stringBuffer.append(TEXT_1543);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1546);
    } else {
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1549);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1550);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (Iterator i= (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations()).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_1551);
    if (isInterface) {
    stringBuffer.append(TEXT_1552);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_1554);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1557);
    }}
    stringBuffer.append(TEXT_1558);
    } else {
    stringBuffer.append(TEXT_1559);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1564);
    } else {
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_1569);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = ((GenParameter)genOperation.getGenParameters().get(0)).getName(); String context = ((GenParameter)genOperation.getGenParameters().get(1)).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1575);
    } else {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1588);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1591);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1593);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1597);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1598);
    }
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1601);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1602);
    }
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1605);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genOperation.getObjectType());
    stringBuffer.append(TEXT_1607);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1609);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1611);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1612);
    }
    stringBuffer.append(TEXT_1613);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1615);
    }
    stringBuffer.append(TEXT_1616);
    }
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1619);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1621);
    }
    } else {
    stringBuffer.append(TEXT_1622);
    }
    }
    stringBuffer.append(TEXT_1623);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1627);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1629);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1633);
    } else {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1636);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1637);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1640);
    } else {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1642);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1647);
    }
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1649);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1653);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1658);
    }
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1661);
    }
    }
    }
    stringBuffer.append(TEXT_1662);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1663);
    } else {
    stringBuffer.append(TEXT_1664);
    }
    stringBuffer.append(TEXT_1665);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1669);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1671);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1675);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1679);
    } else {
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1682);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1684);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1686);
    } else {
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1688);
    }
    }
    }
    stringBuffer.append(TEXT_1689);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1690);
    } else {
    stringBuffer.append(TEXT_1691);
    }
    stringBuffer.append(TEXT_1692);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1695);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1699);
    }
    }
    stringBuffer.append(TEXT_1700);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1701);
    } else {
    stringBuffer.append(TEXT_1702);
    }
    stringBuffer.append(TEXT_1703);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1704);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1706);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1708);
    } else {
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1711);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1714);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1718);
    } else {
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1721);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1725);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1729);
    } else {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1731);
    }
    }
    }
    stringBuffer.append(TEXT_1732);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1733);
    } else {
    stringBuffer.append(TEXT_1734);
    }
    stringBuffer.append(TEXT_1735);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1736);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1738);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1742);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1745);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1749);
    } else {
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1752);
    }
    } else {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1756);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1760);
    } else {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1763);
    }
    stringBuffer.append(TEXT_1764);
    }
    }
    stringBuffer.append(TEXT_1765);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1766);
    } else {
    stringBuffer.append(TEXT_1767);
    }
    stringBuffer.append(TEXT_1768);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1770);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1773);
    } else {
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1775);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1777);
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1780);
    } else {
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1783);
    }
    stringBuffer.append(TEXT_1784);
    }
    }
    stringBuffer.append(TEXT_1785);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1786);
    } else {
    stringBuffer.append(TEXT_1787);
    }
    stringBuffer.append(TEXT_1788);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(TEXT_1790);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genModel.isMinimalReflectiveMethods() || genClass.getImplementedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1792);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1794);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1797);
    } else {
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1800);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1803);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1810);
    } else {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1812);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1814);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1816);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1818);
    } else {
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1820);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1822);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1824);
    } else {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1826);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1830);
    } else {
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1833);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1837);
    } else {
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1840);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1845);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1855);
    } else {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1860);
    }
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1861);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1862);
    } else {
    stringBuffer.append(TEXT_1863);
    }
    stringBuffer.append(TEXT_1864);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && !genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1865);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1867);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1870);
    }
    stringBuffer.append(TEXT_1871);
    }
    stringBuffer.append(TEXT_1872);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1874);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1877);
    }
    stringBuffer.append(TEXT_1878);
    }
    stringBuffer.append(TEXT_1879);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1882);
    }
    { List eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList());
    if (!eVirtualIndexBitFields.isEmpty()) { List allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList());
    stringBuffer.append(TEXT_1883);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1886);
    }
    stringBuffer.append(TEXT_1887);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1890);
    }
    stringBuffer.append(TEXT_1891);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1892);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1900);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1903);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1904);
    }
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1908);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1911);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1912);
    }
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1917);
    }
    stringBuffer.append(TEXT_1918);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1921);
    } else {
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1923);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1924);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_1925);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1927);
    } else {
    stringBuffer.append(TEXT_1928);
    }
    stringBuffer.append(TEXT_1929);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1931);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1934);
    } else {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_1936);
    }
    stringBuffer.append(TEXT_1937);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1939);
    } else {
    stringBuffer.append(TEXT_1940);
    }
    stringBuffer.append(TEXT_1941);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1943);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1946);
    } else {
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_1948);
    }
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1952);
    }
    stringBuffer.append(TEXT_1953);
    if (isImplementation) {
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genModel)) {
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_1957);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel)) {
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1962);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1965);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1967);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1969);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1971);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1973);
    } else {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1976);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1980);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1981);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1983);
    } else {
    stringBuffer.append(TEXT_1984);
    }
    stringBuffer.append(TEXT_1985);
    if (!genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1995);
    }
    } else if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1998);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2010);
    }
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_2012);
    } else {
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2017);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2020);
    } else {
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2023);
    }
    }
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2029);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2035);
    } else {
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2044);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2048);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2052);
    } else {
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2059);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2062);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2064);
    } else {
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2067);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2072);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2074);
    if (!genClass.getExtendedGenFeatures().contains(genFeature) || UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2077);
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2079);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_2092);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2093);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_2096);
    } else {
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_2108);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2109);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2111);
    }
    stringBuffer.append(TEXT_2112);
    }
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_2117);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2118);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2119);
    }
    }
    } else {
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2122);
    for (Iterator j = UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2125);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2128);
    } else {
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(subsetGenFeature.getImportedType());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2134);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2135);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2137);
    } else {
    stringBuffer.append(TEXT_2138);
    }
    stringBuffer.append(TEXT_2139);
    }
    }
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2141);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2143);
    }
    for (Iterator j = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); j.hasNext();) { GenFeature subsetGenFeature = (GenFeature) j.next();
    if (first) { first = false;
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2145);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2146);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2148);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2149);
    }
    } else {
    stringBuffer.append(TEXT_2150);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2152);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2153);
    }
    }
    } else {
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2155);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2156);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2158);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2159);
    }
    } else if (UML2GenModelUtil.isDuplicate(subsetGenFeature) && !UML2GenModelUtil.isRedefinition(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2161);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2162);
    }
    } else {
    stringBuffer.append(TEXT_2163);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2165);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2166);
    }
    }
    } else {
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2168);
    if (!j.hasNext()) {
    stringBuffer.append(TEXT_2169);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2171);
    } else {
    stringBuffer.append(TEXT_2172);
    }
    }
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(TEXT_2174);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2181);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2188);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2189);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2194);
    } else {
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2199);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2203);
    } else {
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2207);
    }
    }
    stringBuffer.append(TEXT_2208);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2212);
    }
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2216);
    } else {
    stringBuffer.append(TEXT_2217);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2220);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2221);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2222);
    } else { int index = 0;
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2225);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2226);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2230);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2233);
    } else {
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2236);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2238);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2246);
    }
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2250);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2251);
    }
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2255);
    }
    stringBuffer.append(TEXT_2256);
    } else {
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2259);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2260);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2261);
    }
    } else {
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2263);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2267);
    } else {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2271);
    }
    }
    }
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2273);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2274);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2279);
    } else {
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2284);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2288);
    } else {
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2292);
    }
    }
    stringBuffer.append(TEXT_2293);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2297);
    }
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2300);
    } else {
    stringBuffer.append(TEXT_2301);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2305);
    } else { int index = 0;
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2309);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2311);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2312);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2313);
    } else {
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2318);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2321);
    } else {
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2324);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2326);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2334);
    }
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2338);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2339);
    }
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2343);
    }
    stringBuffer.append(TEXT_2344);
    } else {
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2347);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2348);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2349);
    }
    } else {
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2351);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2355);
    } else {
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2359);
    }
    }
    }
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2361);
    }
    stringBuffer.append(TEXT_2362);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2367);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2371);
    }
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2375);
    } else {
    stringBuffer.append(TEXT_2376);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2380);
    } else {
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2386);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2387);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2388);
    }
    stringBuffer.append(TEXT_2389);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2394);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2398);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2399);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2401);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2403);
    }
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2407);
    } else {
    stringBuffer.append(TEXT_2408);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2412);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2414);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2415);
    }
    stringBuffer.append(TEXT_2416);
    } else { int index = 0;
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2420);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2422);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2423);
    }
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2430);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2433);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2440);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2441);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2444);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2445);
    }
    }
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2452);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2461);
    } else {
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2466);
    }
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2468);
    }
    stringBuffer.append(TEXT_2469);
    } else {
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2476);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2484);
    } else {
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2489);
    }
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2491);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2499);
    } else {
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2504);
    }
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2506);
    }
    }
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2508);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2509);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2510);
    }
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2513);
    }
    stringBuffer.append(TEXT_2514);
    } else {
    stringBuffer.append(TEXT_2515);
    }
    stringBuffer.append(TEXT_2516);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2518);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2519);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2522);
    } else {
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2525);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2528);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2535);
    } else {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2537);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2539);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2541);
    } else {
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2543);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2545);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2547);
    } else {
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2549);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2553);
    } else {
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2556);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2560);
    } else {
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2563);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2568);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2578);
    } else {
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2583);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2585);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2590);
    }
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2594);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2596);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2599);
    } else {
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2601);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2606);
    } else {
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2610);
    }
    } else {
    stringBuffer.append(TEXT_2611);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2614);
    } else {
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2617);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2618);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass).iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next(); GenFeature redefinitionGenFeature = (GenFeature) UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2621);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2623);
    } else {
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2625);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2626);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2628);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2629);
    } else {
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2631);
    }
    }
    stringBuffer.append(TEXT_2632);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2635);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2636);
    } else {
    stringBuffer.append(TEXT_2637);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2639);
    }
    stringBuffer.append(TEXT_2640);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2646);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2647);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2652);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2654);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2656);
    }
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2658);
    } else {
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2660);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2662);
    }
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2664);
    }
    }
    stringBuffer.append(TEXT_2665);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2669);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2670);
    } else {
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2675);
    }
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2677);
    if (!genFeature.getType().equals(redefinitionGenFeature.getType())) {
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(redefinitionGenFeature.getImportedType());
    stringBuffer.append(TEXT_2679);
    }
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2681);
    }
    stringBuffer.append(TEXT_2682);
    }
    stringBuffer.append(TEXT_2683);
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2690);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2697);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2698);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2703);
    } else {
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2708);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2712);
    } else {
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2716);
    }
    }
    stringBuffer.append(TEXT_2717);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2721);
    }
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2725);
    } else {
    stringBuffer.append(TEXT_2726);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2729);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2730);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2731);
    } else { int index = 0;
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2734);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2735);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2739);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2742);
    } else {
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2745);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2747);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2755);
    }
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2759);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2760);
    }
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2764);
    }
    stringBuffer.append(TEXT_2765);
    } else {
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2768);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2769);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2770);
    }
    } else {
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2772);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2776);
    } else {
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2780);
    }
    }
    }
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2782);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = (GenClass) genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2783);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2788);
    } else {
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2793);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2797);
    } else {
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2801);
    }
    }
    stringBuffer.append(TEXT_2802);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2806);
    }
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2809);
    } else {
    stringBuffer.append(TEXT_2810);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2814);
    } else { int index = 0;
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2818);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2820);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    stringBuffer.append(TEXT_2821);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2822);
    } else {
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2827);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2830);
    } else {
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2833);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2835);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2843);
    }
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2847);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = (GenFeature) nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2848);
    }
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(nestedKeyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index - n, false));
    stringBuffer.append(TEXT_2852);
    }
    stringBuffer.append(TEXT_2853);
    } else {
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2856);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { n.next();
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2857);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    }
    stringBuffer.append(TEXT_2858);
    }
    } else {
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2860);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2864);
    } else {
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2866);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2868);
    }
    }
    }
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2870);
    }
    stringBuffer.append(TEXT_2871);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2875);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2876);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2880);
    }
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2884);
    } else {
    stringBuffer.append(TEXT_2885);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2889);
    } else {
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2895);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2896);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2897);
    }
    stringBuffer.append(TEXT_2898);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2903);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2907);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2908);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2910);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2912);
    }
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genFeature.getQualifiedListItemType());
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2915);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2916);
    } else {
    stringBuffer.append(TEXT_2917);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2921);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2923);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2924);
    }
    stringBuffer.append(TEXT_2925);
    } else { int index = 0;
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(UML2GenModelUtil.getRedefinedListItemType(genFeature));
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2929);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2931);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2932);
    }
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2939);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2942);
    }
    for (Iterator k = UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass()).iterator(); k.hasNext(); index++) { GenFeature keyGenFeature = (GenFeature) k.next();
    if (keyGenFeature.isContains()) { List nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2949);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2950);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2951);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index + n, false));
    stringBuffer.append(TEXT_2952);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2953);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2954);
    }
    }
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType()));
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2961);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2965);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2969);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2970);
    } else {
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2972);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2974);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2975);
    }
    stringBuffer.append(TEXT_2976);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2977);
    }
    stringBuffer.append(TEXT_2978);
    } else {
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(keyGenFeature.getImportedType());
    stringBuffer.append(TEXT_2980);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2985);
    for (Iterator n = nestedKeyGenFeatures.iterator(); n.hasNext(); index++) { GenFeature nestedKeyGenFeature = (GenFeature) n.next();
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2987);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2989);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2991);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2993);
    } else {
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2998);
    }
    stringBuffer.append(TEXT_2999);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3000);
    }
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3001);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3004);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3008);
    } else {
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genFeature, index, false));
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3012);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3013);
    }
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3015);
    }
    }
    stringBuffer.append(TEXT_3016);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3017);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3018);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3019);
    }
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3022);
    }
    stringBuffer.append(TEXT_3023);
    } else {
    stringBuffer.append(TEXT_3024);
    }
    stringBuffer.append(TEXT_3025);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3026);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3027);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3028);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3029);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3030);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3031);
    } else {
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3034);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3036);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3037);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3044);
    } else {
    stringBuffer.append(TEXT_3045);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3046);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3048);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3049);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3050);
    } else {
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3052);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3054);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3055);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3056);
    } else {
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3058);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_3059);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3060);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3061);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3062);
    } else {
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3064);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3065);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3067);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3068);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3069);
    } else {
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3071);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3072);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3073);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3074);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3077);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3078);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3079);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3080);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3082);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3083);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3086);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3087);
    } else {
    stringBuffer.append(TEXT_3088);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3089);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3090);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3091);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3092);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3093);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3094);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3095);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3096);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3099);
    }
    stringBuffer.append(TEXT_3100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3102);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3103);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3104);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3105);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3106);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3107);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3108);
    } else {
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3110);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3112);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3113);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3114);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3115);
    } else {
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3117);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3118);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3119);
    }
    } else {
    stringBuffer.append(TEXT_3120);
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_3121);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_3122);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3123);
    } else {
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3125);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3126);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3127);
    }
    }
    for (Iterator i=UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass).iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next(); GenOperation redefinitionGenOperation = (GenOperation) UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3128);
    stringBuffer.append(genOperation.getImportedType());
    stringBuffer.append(TEXT_3129);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3130);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_3131);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_3132);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3133);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3134);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3135);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3136);
    } else {
    stringBuffer.append(TEXT_3137);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3138);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3139);
    }
    }
    stringBuffer.append(TEXT_3140);
    }
    }
    stringBuffer.append(TEXT_3141);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
