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

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_5 = NL + " *" + NL + " * ";
  protected final String TEXT_6 = "Id";
  protected final String TEXT_7 = NL + " */";
  protected final String TEXT_8 = NL + "package ";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL + "package ";
  protected final String TEXT_11 = ";";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_15 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_16 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_17 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_18 = NL + " *";
  protected final String TEXT_19 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_20 = NL + " *   <li>{@link ";
  protected final String TEXT_21 = "#";
  protected final String TEXT_22 = " <em>";
  protected final String TEXT_23 = "</em>}</li>";
  protected final String TEXT_24 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_25 = NL + " *";
  protected final String TEXT_26 = NL + " * @see ";
  protected final String TEXT_27 = "#get";
  protected final String TEXT_28 = "()";
  protected final String TEXT_29 = NL + " * @model ";
  protected final String TEXT_30 = NL + " *        ";
  protected final String TEXT_31 = NL + " * @model";
  protected final String TEXT_32 = NL + " * @extends ";
  protected final String TEXT_33 = NL + " * @generated" + NL + " */";
  protected final String TEXT_34 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_35 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_36 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_37 = NL + " *   <li>{@link ";
  protected final String TEXT_38 = "#";
  protected final String TEXT_39 = " <em>";
  protected final String TEXT_40 = "</em>}</li>";
  protected final String TEXT_41 = NL + " * </ul>";
  protected final String TEXT_42 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_43 = NL + "public";
  protected final String TEXT_44 = " abstract";
  protected final String TEXT_45 = " class ";
  protected final String TEXT_46 = NL + "public interface ";
  protected final String TEXT_47 = NL + "{";
  protected final String TEXT_48 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_49 = " copyright = ";
  protected final String TEXT_50 = ";";
  protected final String TEXT_51 = NL;
  protected final String TEXT_52 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_53 = " mofDriverNumber = \"";
  protected final String TEXT_54 = "\";";
  protected final String TEXT_55 = NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_58 = ";" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_60 = ";" + NL;
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_62 = " = 0;" + NL;
  protected final String TEXT_63 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_64 = "() <em>";
  protected final String TEXT_65 = "</em>}' ";
  protected final String TEXT_66 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_67 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_68 = " ";
  protected final String TEXT_69 = ";" + NL;
  protected final String TEXT_70 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_71 = "() <em>";
  protected final String TEXT_72 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_73 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_74 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_75 = NL + "\tprotected static final ";
  protected final String TEXT_76 = "[] ";
  protected final String TEXT_77 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_78 = " [0]";
  protected final String TEXT_79 = ";" + NL;
  protected final String TEXT_80 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_81 = "() <em>";
  protected final String TEXT_82 = "</em>}' ";
  protected final String TEXT_83 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_84 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_85 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_86 = NL + "\tprotected static final ";
  protected final String TEXT_87 = " ";
  protected final String TEXT_88 = "; // TODO The default value literal \"";
  protected final String TEXT_89 = "\" is not valid.";
  protected final String TEXT_90 = " = ";
  protected final String TEXT_91 = ";";
  protected final String TEXT_92 = NL;
  protected final String TEXT_93 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_94 = " = 0;" + NL;
  protected final String TEXT_95 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_96 = "() <em>";
  protected final String TEXT_97 = "</em>}' ";
  protected final String TEXT_98 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_99 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_100 = "_EFLAG = 1 ";
  protected final String TEXT_101 = ";" + NL;
  protected final String TEXT_102 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_103 = "() <em>";
  protected final String TEXT_104 = "</em>}' ";
  protected final String TEXT_105 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_106 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_107 = " ";
  protected final String TEXT_108 = " = ";
  protected final String TEXT_109 = ";" + NL;
  protected final String TEXT_110 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_111 = " = 0;" + NL;
  protected final String TEXT_112 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_113 = " ";
  protected final String TEXT_114 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_115 = "_ESETFLAG = 1 ";
  protected final String TEXT_116 = ";" + NL;
  protected final String TEXT_117 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_118 = " ";
  protected final String TEXT_119 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_120 = "ESet;" + NL;
  protected final String TEXT_121 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_122 = " = ";
  protected final String TEXT_123 = ".getFeatureID(";
  protected final String TEXT_124 = ") - ";
  protected final String TEXT_125 = ";" + NL;
  protected final String TEXT_126 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_127 = " = ";
  protected final String TEXT_128 = ".getFeatureID(";
  protected final String TEXT_129 = ") - ";
  protected final String TEXT_130 = ";" + NL;
  protected final String TEXT_131 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_132 = "public";
  protected final String TEXT_133 = "protected";
  protected final String TEXT_134 = " ";
  protected final String TEXT_135 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_136 = NL + "\t\t";
  protected final String TEXT_137 = " |= ";
  protected final String TEXT_138 = "_EFLAG;";
  protected final String TEXT_139 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_140 = NL + "\t@Override";
  protected final String TEXT_141 = NL + "\tprotected ";
  protected final String TEXT_142 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_143 = ";" + NL + "\t}" + NL;
  protected final String TEXT_144 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_145 = NL + "\t@Override";
  protected final String TEXT_146 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_147 = ";" + NL + "\t}" + NL;
  protected final String TEXT_148 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_149 = NL + "\t";
  protected final String TEXT_150 = "[] ";
  protected final String TEXT_151 = "();" + NL;
  protected final String TEXT_152 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_153 = NL + "\tpublic ";
  protected final String TEXT_154 = "[] ";
  protected final String TEXT_155 = "()" + NL + "\t{";
  protected final String TEXT_156 = NL + "\t\t";
  protected final String TEXT_157 = " list = (";
  protected final String TEXT_158 = ")";
  protected final String TEXT_159 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_160 = "(";
  protected final String TEXT_161 = "[])";
  protected final String TEXT_162 = "_EEMPTY_ARRAY;";
  protected final String TEXT_163 = NL + "\t\tif (";
  protected final String TEXT_164 = " == null || ";
  protected final String TEXT_165 = ".isEmpty()) return ";
  protected final String TEXT_166 = "(";
  protected final String TEXT_167 = "[])";
  protected final String TEXT_168 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_169 = " list = (";
  protected final String TEXT_170 = ")";
  protected final String TEXT_171 = ";";
  protected final String TEXT_172 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_173 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_174 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_175 = NL + "\t";
  protected final String TEXT_176 = " get";
  protected final String TEXT_177 = "(int index);" + NL;
  protected final String TEXT_178 = NL + "\tpublic ";
  protected final String TEXT_179 = " get";
  protected final String TEXT_180 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_181 = "(";
  protected final String TEXT_182 = ")";
  protected final String TEXT_183 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_184 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_185 = NL + "\tint get";
  protected final String TEXT_186 = "Length();" + NL;
  protected final String TEXT_187 = NL + "\tpublic int get";
  protected final String TEXT_188 = "Length()" + NL + "\t{";
  protected final String TEXT_189 = NL + "\t\treturn ";
  protected final String TEXT_190 = "().size();";
  protected final String TEXT_191 = NL + "\t\treturn ";
  protected final String TEXT_192 = " == null ? 0 : ";
  protected final String TEXT_193 = ".size();";
  protected final String TEXT_194 = NL + "\t}" + NL;
  protected final String TEXT_195 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_196 = NL + "\tvoid set";
  protected final String TEXT_197 = "(";
  protected final String TEXT_198 = "[] new";
  protected final String TEXT_199 = ");" + NL;
  protected final String TEXT_200 = NL + "\tpublic void set";
  protected final String TEXT_201 = "(";
  protected final String TEXT_202 = "[] new";
  protected final String TEXT_203 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_204 = ")";
  protected final String TEXT_205 = "()).setData(new";
  protected final String TEXT_206 = ".length, new";
  protected final String TEXT_207 = ");" + NL + "\t}" + NL;
  protected final String TEXT_208 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_209 = NL + "\tvoid set";
  protected final String TEXT_210 = "(int index, ";
  protected final String TEXT_211 = " element);" + NL;
  protected final String TEXT_212 = NL + "\tpublic void set";
  protected final String TEXT_213 = "(int index, ";
  protected final String TEXT_214 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_215 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_216 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_217 = "</b></em>' ";
  protected final String TEXT_218 = ".";
  protected final String TEXT_219 = NL + "\t * The key is of type ";
  protected final String TEXT_220 = "list of {@link ";
  protected final String TEXT_221 = "}";
  protected final String TEXT_222 = "{@link ";
  protected final String TEXT_223 = "}";
  protected final String TEXT_224 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_225 = "list of {@link ";
  protected final String TEXT_226 = "}";
  protected final String TEXT_227 = "{@link ";
  protected final String TEXT_228 = "}";
  protected final String TEXT_229 = ",";
  protected final String TEXT_230 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_231 = "}";
  protected final String TEXT_232 = ".";
  protected final String TEXT_233 = NL + "\t * The default value is <code>";
  protected final String TEXT_234 = "</code>.";
  protected final String TEXT_235 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_236 = "}.";
  protected final String TEXT_237 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_238 = "#";
  protected final String TEXT_239 = " <em>";
  protected final String TEXT_240 = "</em>}'.";
  protected final String TEXT_241 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_242 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_243 = "#";
  protected final String TEXT_244 = "() <em>";
  protected final String TEXT_245 = "</em>}'</li>";
  protected final String TEXT_246 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_247 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_248 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_249 = "#";
  protected final String TEXT_250 = "() <em>";
  protected final String TEXT_251 = "</em>}'</li>";
  protected final String TEXT_252 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_253 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_254 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_255 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_256 = "</em>' ";
  protected final String TEXT_257 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_258 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_259 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_260 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_261 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_262 = "</em>' ";
  protected final String TEXT_263 = ".";
  protected final String TEXT_264 = NL + "\t * @see ";
  protected final String TEXT_265 = NL + "\t * @see #isSet";
  protected final String TEXT_266 = "()";
  protected final String TEXT_267 = NL + "\t * @see #unset";
  protected final String TEXT_268 = "()";
  protected final String TEXT_269 = NL + "\t * @see #set";
  protected final String TEXT_270 = "(";
  protected final String TEXT_271 = ")";
  protected final String TEXT_272 = NL + "\t * @see ";
  protected final String TEXT_273 = "#get";
  protected final String TEXT_274 = "()";
  protected final String TEXT_275 = NL + "\t * @see ";
  protected final String TEXT_276 = "#";
  protected final String TEXT_277 = NL + "\t * @model ";
  protected final String TEXT_278 = NL + "\t *        ";
  protected final String TEXT_279 = NL + "\t * @model";
  protected final String TEXT_280 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_281 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_282 = NL + "\t@Override";
  protected final String TEXT_283 = NL + "\t";
  protected final String TEXT_284 = " ";
  protected final String TEXT_285 = "();" + NL;
  protected final String TEXT_286 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_287 = NL + "\tpublic ";
  protected final String TEXT_288 = " ";
  protected final String TEXT_289 = "_";
  protected final String TEXT_290 = "()" + NL + "\t{";
  protected final String TEXT_291 = NL + "\t\treturn ";
  protected final String TEXT_292 = "(";
  protected final String TEXT_293 = "(";
  protected final String TEXT_294 = ")eGet(";
  protected final String TEXT_295 = ", true)";
  protected final String TEXT_296 = ").";
  protected final String TEXT_297 = "()";
  protected final String TEXT_298 = ";";
  protected final String TEXT_299 = NL + "\t\t";
  protected final String TEXT_300 = " ";
  protected final String TEXT_301 = " = (";
  protected final String TEXT_302 = ")eVirtualGet(";
  protected final String TEXT_303 = ");";
  protected final String TEXT_304 = NL + "\t\tif (";
  protected final String TEXT_305 = " == null)" + NL + "\t\t{";
  protected final String TEXT_306 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_307 = ", ";
  protected final String TEXT_308 = " = new ";
  protected final String TEXT_309 = ");";
  protected final String TEXT_310 = NL + "\t\t\t";
  protected final String TEXT_311 = " = new ";
  protected final String TEXT_312 = ";";
  protected final String TEXT_313 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_314 = ";";
  protected final String TEXT_315 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_316 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_317 = ")eContainer();";
  protected final String TEXT_318 = NL + "\t\t";
  protected final String TEXT_319 = " ";
  protected final String TEXT_320 = " = (";
  protected final String TEXT_321 = ")eVirtualGet(";
  protected final String TEXT_322 = ", ";
  protected final String TEXT_323 = ");";
  protected final String TEXT_324 = NL + "\t\tif (";
  protected final String TEXT_325 = " != null && ";
  protected final String TEXT_326 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_327 = " old";
  protected final String TEXT_328 = " = (";
  protected final String TEXT_329 = ")";
  protected final String TEXT_330 = ";" + NL + "\t\t\t";
  protected final String TEXT_331 = " = ";
  protected final String TEXT_332 = "eResolveProxy(old";
  protected final String TEXT_333 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_334 = " != old";
  protected final String TEXT_335 = ")" + NL + "\t\t\t{";
  protected final String TEXT_336 = NL + "\t\t\t\t";
  protected final String TEXT_337 = " new";
  protected final String TEXT_338 = " = (";
  protected final String TEXT_339 = ")";
  protected final String TEXT_340 = ";";
  protected final String TEXT_341 = NL + "\t\t\t\t";
  protected final String TEXT_342 = " msgs = old";
  protected final String TEXT_343 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_344 = ", null, null);";
  protected final String TEXT_345 = NL + "\t\t\t\t";
  protected final String TEXT_346 = " msgs =  old";
  protected final String TEXT_347 = ".eInverseRemove(this, ";
  protected final String TEXT_348 = ", ";
  protected final String TEXT_349 = ".class, null);";
  protected final String TEXT_350 = NL + "\t\t\t\tif (new";
  protected final String TEXT_351 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_352 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_353 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_354 = ", null, msgs);";
  protected final String TEXT_355 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_356 = ".eInverseAdd(this, ";
  protected final String TEXT_357 = ", ";
  protected final String TEXT_358 = ".class, msgs);";
  protected final String TEXT_359 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_360 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_361 = ", ";
  protected final String TEXT_362 = ");";
  protected final String TEXT_363 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_364 = "(this, ";
  protected final String TEXT_365 = ".RESOLVE, ";
  protected final String TEXT_366 = ", old";
  protected final String TEXT_367 = ", ";
  protected final String TEXT_368 = "));";
  protected final String TEXT_369 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_370 = NL + "\t\treturn (";
  protected final String TEXT_371 = ")eVirtualGet(";
  protected final String TEXT_372 = ", ";
  protected final String TEXT_373 = ");";
  protected final String TEXT_374 = NL + "\t\treturn (";
  protected final String TEXT_375 = " & ";
  protected final String TEXT_376 = "_EFLAG) != 0;";
  protected final String TEXT_377 = NL + "\t\treturn ";
  protected final String TEXT_378 = ";";
  protected final String TEXT_379 = NL + "\t\t";
  protected final String TEXT_380 = " ";
  protected final String TEXT_381 = " = basicGet";
  protected final String TEXT_382 = "();" + NL + "\t\treturn ";
  protected final String TEXT_383 = " != null && ";
  protected final String TEXT_384 = ".eIsProxy() ? ";
  protected final String TEXT_385 = "eResolveProxy((";
  protected final String TEXT_386 = ")";
  protected final String TEXT_387 = ") : ";
  protected final String TEXT_388 = ";";
  protected final String TEXT_389 = NL + "\t\treturn new ";
  protected final String TEXT_390 = "((";
  protected final String TEXT_391 = ".Internal)((";
  protected final String TEXT_392 = ".Internal.Wrapper)get";
  protected final String TEXT_393 = "()).featureMap().";
  protected final String TEXT_394 = "list(";
  protected final String TEXT_395 = "));";
  protected final String TEXT_396 = NL + "\t\treturn (";
  protected final String TEXT_397 = ")get";
  protected final String TEXT_398 = "().";
  protected final String TEXT_399 = "list(";
  protected final String TEXT_400 = ");";
  protected final String TEXT_401 = NL + "\t\treturn ((";
  protected final String TEXT_402 = ".Internal.Wrapper)get";
  protected final String TEXT_403 = "()).featureMap().list(";
  protected final String TEXT_404 = ");";
  protected final String TEXT_405 = NL + "\t\treturn get";
  protected final String TEXT_406 = "().list(";
  protected final String TEXT_407 = ");";
  protected final String TEXT_408 = NL + "\t\treturn ";
  protected final String TEXT_409 = "(";
  protected final String TEXT_410 = "(";
  protected final String TEXT_411 = ")";
  protected final String TEXT_412 = "((";
  protected final String TEXT_413 = ".Internal.Wrapper)get";
  protected final String TEXT_414 = "()).featureMap().get(";
  protected final String TEXT_415 = ", true)";
  protected final String TEXT_416 = ").";
  protected final String TEXT_417 = "()";
  protected final String TEXT_418 = ";";
  protected final String TEXT_419 = NL + "\t\treturn ";
  protected final String TEXT_420 = "(";
  protected final String TEXT_421 = "(";
  protected final String TEXT_422 = ")";
  protected final String TEXT_423 = "get";
  protected final String TEXT_424 = "().get(";
  protected final String TEXT_425 = ", true)";
  protected final String TEXT_426 = ").";
  protected final String TEXT_427 = "()";
  protected final String TEXT_428 = ";";
  protected final String TEXT_429 = NL + "\t\t";
  protected final String TEXT_430 = NL + "\t\t";
  protected final String TEXT_431 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_432 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_433 = NL + "\t\t\t";
  protected final String TEXT_434 = " result = (";
  protected final String TEXT_435 = ") cache.get(";
  protected final String TEXT_436 = "eResource(), ";
  protected final String TEXT_437 = "this, ";
  protected final String TEXT_438 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_439 = "eResource(), ";
  protected final String TEXT_440 = "this, ";
  protected final String TEXT_441 = ", result = ";
  protected final String TEXT_442 = "new ";
  protected final String TEXT_443 = "(";
  protected final String TEXT_444 = ".";
  protected final String TEXT_445 = "(this)";
  protected final String TEXT_446 = ")";
  protected final String TEXT_447 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_448 = ".";
  protected final String TEXT_449 = "()";
  protected final String TEXT_450 = ";" + NL + "\t\t}";
  protected final String TEXT_451 = NL + "\t\treturn ";
  protected final String TEXT_452 = ".";
  protected final String TEXT_453 = "(this);";
  protected final String TEXT_454 = NL + "\t\t";
  protected final String TEXT_455 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_456 = " eResource = eResource();";
  protected final String TEXT_457 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_458 = NL + "\t\t\t";
  protected final String TEXT_459 = " ";
  protected final String TEXT_460 = " = (";
  protected final String TEXT_461 = ") cache.get(eResource, this, ";
  protected final String TEXT_462 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_463 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_464 = ", ";
  protected final String TEXT_465 = " = new ";
  protected final String TEXT_466 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_467 = ";" + NL + "\t\t}";
  protected final String TEXT_468 = NL + "\t\treturn new ";
  protected final String TEXT_469 = ";";
  protected final String TEXT_470 = NL + "\t\t";
  protected final String TEXT_471 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_472 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_473 = " method = getClass().getMethod(\"";
  protected final String TEXT_474 = "\", null);";
  protected final String TEXT_475 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_476 = NL + "\t\t\t\t";
  protected final String TEXT_477 = " ";
  protected final String TEXT_478 = " = (";
  protected final String TEXT_479 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_480 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_481 = " union = ";
  protected final String TEXT_482 = "Helper(new ";
  protected final String TEXT_483 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_484 = " = new ";
  protected final String TEXT_485 = "(this, ";
  protected final String TEXT_486 = "null";
  protected final String TEXT_487 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_488 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_489 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_490 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_491 = NL + "\t\t\t";
  protected final String TEXT_492 = " ";
  protected final String TEXT_493 = " = (";
  protected final String TEXT_494 = ") cache.get(eResource(), this, ";
  protected final String TEXT_495 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_496 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_497 = " union = ";
  protected final String TEXT_498 = "Helper(new ";
  protected final String TEXT_499 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_500 = ", ";
  protected final String TEXT_501 = " = new ";
  protected final String TEXT_502 = "(this, ";
  protected final String TEXT_503 = "null";
  protected final String TEXT_504 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_505 = ";";
  protected final String TEXT_506 = NL + "\t\t}";
  protected final String TEXT_507 = NL + "\t\t";
  protected final String TEXT_508 = " union = ";
  protected final String TEXT_509 = "Helper(new ";
  protected final String TEXT_510 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_511 = "(this, ";
  protected final String TEXT_512 = "null";
  protected final String TEXT_513 = ", union.size(), union.toArray());";
  protected final String TEXT_514 = NL + "\t\tif (isSet";
  protected final String TEXT_515 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_516 = "();" + NL + "\t\t}";
  protected final String TEXT_517 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_518 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_519 = "();" + NL + "\t\t}";
  protected final String TEXT_520 = NL + "\t\t";
  protected final String TEXT_521 = " ";
  protected final String TEXT_522 = " = ";
  protected final String TEXT_523 = "();" + NL + "\t\tif (";
  protected final String TEXT_524 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_525 = ";" + NL + "\t\t}";
  protected final String TEXT_526 = NL + "\t\treturn ";
  protected final String TEXT_527 = "super.";
  protected final String TEXT_528 = "()";
  protected final String TEXT_529 = "null";
  protected final String TEXT_530 = ";";
  protected final String TEXT_531 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_532 = "' ";
  protected final String TEXT_533 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_534 = NL + "\t}" + NL;
  protected final String TEXT_535 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_536 = NL + "\t@Override";
  protected final String TEXT_537 = NL + "\tpublic ";
  protected final String TEXT_538 = " basicGet";
  protected final String TEXT_539 = "()" + NL + "\t{";
  protected final String TEXT_540 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_541 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_542 = ")eInternalContainer();";
  protected final String TEXT_543 = NL + "\t\treturn (";
  protected final String TEXT_544 = ")eVirtualGet(";
  protected final String TEXT_545 = ");";
  protected final String TEXT_546 = NL + "\t\treturn ";
  protected final String TEXT_547 = ";";
  protected final String TEXT_548 = NL + "\t\treturn (";
  protected final String TEXT_549 = ")((";
  protected final String TEXT_550 = ".Internal.Wrapper)get";
  protected final String TEXT_551 = "()).featureMap().get(";
  protected final String TEXT_552 = ", false);";
  protected final String TEXT_553 = NL + "\t\treturn (";
  protected final String TEXT_554 = ")get";
  protected final String TEXT_555 = "().get(";
  protected final String TEXT_556 = ", false);";
  protected final String TEXT_557 = NL + "\t\treturn ";
  protected final String TEXT_558 = ".";
  protected final String TEXT_559 = "(this);";
  protected final String TEXT_560 = NL + "\t\tif (isSet";
  protected final String TEXT_561 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_562 = "basicGet";
  protected final String TEXT_563 = "();" + NL + "\t\t}";
  protected final String TEXT_564 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_565 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_566 = "basicGet";
  protected final String TEXT_567 = "();" + NL + "\t\t}";
  protected final String TEXT_568 = NL + "\t\t";
  protected final String TEXT_569 = " ";
  protected final String TEXT_570 = " = ";
  protected final String TEXT_571 = "basicGet";
  protected final String TEXT_572 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_573 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_574 = ";" + NL + "\t\t}";
  protected final String TEXT_575 = NL + "\t\treturn ";
  protected final String TEXT_576 = "super.basicGet";
  protected final String TEXT_577 = "()";
  protected final String TEXT_578 = "null";
  protected final String TEXT_579 = ";";
  protected final String TEXT_580 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_581 = "' ";
  protected final String TEXT_582 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_583 = NL + "\t}" + NL;
  protected final String TEXT_584 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_585 = NL + "\t@Override";
  protected final String TEXT_586 = NL + "\tpublic ";
  protected final String TEXT_587 = " basicSet";
  protected final String TEXT_588 = "(";
  protected final String TEXT_589 = " new";
  protected final String TEXT_590 = ", ";
  protected final String TEXT_591 = " msgs)" + NL + "\t{";
  protected final String TEXT_592 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_593 = ")new";
  protected final String TEXT_594 = ", ";
  protected final String TEXT_595 = ", msgs);";
  protected final String TEXT_596 = NL + "\t\t";
  protected final String TEXT_597 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_598 = NL + "\t\t\t";
  protected final String TEXT_599 = " ";
  protected final String TEXT_600 = " = ";
  protected final String TEXT_601 = "();";
  protected final String TEXT_602 = NL + "\t\t\tObject ";
  protected final String TEXT_603 = " = eVirtualGet(";
  protected final String TEXT_604 = ");";
  protected final String TEXT_605 = NL + "\t\t\tif (";
  protected final String TEXT_606 = " != null && ";
  protected final String TEXT_607 = " != new";
  protected final String TEXT_608 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_609 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_610 = NL + "\t\t\tif (new";
  protected final String TEXT_611 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_612 = NL + "\t\t\t\t";
  protected final String TEXT_613 = " ";
  protected final String TEXT_614 = " = ";
  protected final String TEXT_615 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_616 = ".contains(new";
  protected final String TEXT_617 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_618 = ".add(new";
  protected final String TEXT_619 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_620 = NL + "\t\t\t\t";
  protected final String TEXT_621 = " ";
  protected final String TEXT_622 = " = ";
  protected final String TEXT_623 = "();";
  protected final String TEXT_624 = NL + "\t\t\t\tObject ";
  protected final String TEXT_625 = " = eVirtualGet(";
  protected final String TEXT_626 = ");";
  protected final String TEXT_627 = NL + "\t\t\t\tif (new";
  protected final String TEXT_628 = " != ";
  protected final String TEXT_629 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_630 = "(new";
  protected final String TEXT_631 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_632 = NL + "\t\t\t}";
  protected final String TEXT_633 = NL + "\t\t}";
  protected final String TEXT_634 = NL + "\t\treturn msgs;";
  protected final String TEXT_635 = NL + "\t\tObject old";
  protected final String TEXT_636 = " = eVirtualSet(";
  protected final String TEXT_637 = ", new";
  protected final String TEXT_638 = ");";
  protected final String TEXT_639 = NL + "\t\t";
  protected final String TEXT_640 = " old";
  protected final String TEXT_641 = " = ";
  protected final String TEXT_642 = ";" + NL + "\t\t";
  protected final String TEXT_643 = " = new";
  protected final String TEXT_644 = ";";
  protected final String TEXT_645 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_646 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_647 = NL + "\t\tboolean old";
  protected final String TEXT_648 = "ESet = (";
  protected final String TEXT_649 = " & ";
  protected final String TEXT_650 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_651 = " |= ";
  protected final String TEXT_652 = "_ESETFLAG;";
  protected final String TEXT_653 = NL + "\t\tboolean old";
  protected final String TEXT_654 = "ESet = ";
  protected final String TEXT_655 = "ESet;" + NL + "\t\t";
  protected final String TEXT_656 = "ESet = true;";
  protected final String TEXT_657 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_658 = NL + "\t\t\t";
  protected final String TEXT_659 = " notification = new ";
  protected final String TEXT_660 = "(this, ";
  protected final String TEXT_661 = ".SET, ";
  protected final String TEXT_662 = ", ";
  protected final String TEXT_663 = "isSetChange ? null : old";
  protected final String TEXT_664 = "old";
  protected final String TEXT_665 = ", new";
  protected final String TEXT_666 = ", ";
  protected final String TEXT_667 = "isSetChange";
  protected final String TEXT_668 = "!old";
  protected final String TEXT_669 = "ESet";
  protected final String TEXT_670 = ");";
  protected final String TEXT_671 = NL + "\t\t\t";
  protected final String TEXT_672 = " notification = new ";
  protected final String TEXT_673 = "(this, ";
  protected final String TEXT_674 = ".SET, ";
  protected final String TEXT_675 = ", ";
  protected final String TEXT_676 = "old";
  protected final String TEXT_677 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_678 = "old";
  protected final String TEXT_679 = ", new";
  protected final String TEXT_680 = ");";
  protected final String TEXT_681 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_682 = NL + "\t\t";
  protected final String TEXT_683 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_684 = NL + "\t\t\t";
  protected final String TEXT_685 = " ";
  protected final String TEXT_686 = " = ";
  protected final String TEXT_687 = "();";
  protected final String TEXT_688 = NL + "\t\t\tObject ";
  protected final String TEXT_689 = " = eVirtualGet(";
  protected final String TEXT_690 = ");";
  protected final String TEXT_691 = NL + "\t\t\tif (";
  protected final String TEXT_692 = " != null && ";
  protected final String TEXT_693 = " != new";
  protected final String TEXT_694 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_695 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_696 = NL + "\t\t\tif (new";
  protected final String TEXT_697 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_698 = NL + "\t\t\t\t";
  protected final String TEXT_699 = " ";
  protected final String TEXT_700 = " = ";
  protected final String TEXT_701 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_702 = ".contains(new";
  protected final String TEXT_703 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_704 = ".add(new";
  protected final String TEXT_705 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_706 = NL + "\t\t\t\t";
  protected final String TEXT_707 = " ";
  protected final String TEXT_708 = " = ";
  protected final String TEXT_709 = "();";
  protected final String TEXT_710 = NL + "\t\t\t\tObject ";
  protected final String TEXT_711 = " = eVirtualGet(";
  protected final String TEXT_712 = ");";
  protected final String TEXT_713 = NL + "\t\t\t\tif (new";
  protected final String TEXT_714 = " != ";
  protected final String TEXT_715 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_716 = "(new";
  protected final String TEXT_717 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_718 = NL + "\t\t\t}";
  protected final String TEXT_719 = NL + "\t\t}";
  protected final String TEXT_720 = NL + "\t\treturn msgs;";
  protected final String TEXT_721 = NL + "\t\treturn ((";
  protected final String TEXT_722 = ".Internal)((";
  protected final String TEXT_723 = ".Internal.Wrapper)get";
  protected final String TEXT_724 = "()).featureMap()).basicAdd(";
  protected final String TEXT_725 = ", new";
  protected final String TEXT_726 = ", msgs);";
  protected final String TEXT_727 = NL + "\t\treturn ((";
  protected final String TEXT_728 = ".Internal)get";
  protected final String TEXT_729 = "()).basicAdd(";
  protected final String TEXT_730 = ", new";
  protected final String TEXT_731 = ", msgs);";
  protected final String TEXT_732 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_733 = "' ";
  protected final String TEXT_734 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_735 = NL + "\t}" + NL;
  protected final String TEXT_736 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_737 = "#";
  protected final String TEXT_738 = " <em>";
  protected final String TEXT_739 = "</em>}' ";
  protected final String TEXT_740 = ".";
  protected final String TEXT_741 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_742 = "</em>' ";
  protected final String TEXT_743 = ".";
  protected final String TEXT_744 = NL + "\t * @see ";
  protected final String TEXT_745 = NL + "\t * @see #isSet";
  protected final String TEXT_746 = "()";
  protected final String TEXT_747 = NL + "\t * @see #unset";
  protected final String TEXT_748 = "()";
  protected final String TEXT_749 = NL + "\t * @see #";
  protected final String TEXT_750 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_751 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_752 = NL + "\t@Override";
  protected final String TEXT_753 = NL + "\tvoid set";
  protected final String TEXT_754 = "(";
  protected final String TEXT_755 = " value);" + NL;
  protected final String TEXT_756 = NL + "\tpublic void set";
  protected final String TEXT_757 = "_";
  protected final String TEXT_758 = "(";
  protected final String TEXT_759 = " ";
  protected final String TEXT_760 = ")" + NL + "\t{";
  protected final String TEXT_761 = NL + "\t\tnew";
  protected final String TEXT_762 = " = new";
  protected final String TEXT_763 = " == null ? ";
  protected final String TEXT_764 = " : new";
  protected final String TEXT_765 = ";";
  protected final String TEXT_766 = NL + "\t\teSet(";
  protected final String TEXT_767 = ", ";
  protected final String TEXT_768 = "new ";
  protected final String TEXT_769 = "(";
  protected final String TEXT_770 = "new";
  protected final String TEXT_771 = ")";
  protected final String TEXT_772 = ");";
  protected final String TEXT_773 = NL + "\t\tif (new";
  protected final String TEXT_774 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_775 = " && new";
  protected final String TEXT_776 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_777 = ".isAncestor(this, ";
  protected final String TEXT_778 = "new";
  protected final String TEXT_779 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_780 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_781 = NL + "\t\t\t";
  protected final String TEXT_782 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_783 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_784 = ")new";
  protected final String TEXT_785 = ").eInverseAdd(this, ";
  protected final String TEXT_786 = ", ";
  protected final String TEXT_787 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_788 = "(";
  protected final String TEXT_789 = "new";
  protected final String TEXT_790 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_791 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_792 = "(this, ";
  protected final String TEXT_793 = ".SET, ";
  protected final String TEXT_794 = ", new";
  protected final String TEXT_795 = ", new";
  protected final String TEXT_796 = "));";
  protected final String TEXT_797 = NL + "\t\t";
  protected final String TEXT_798 = " ";
  protected final String TEXT_799 = " = (";
  protected final String TEXT_800 = ")eVirtualGet(";
  protected final String TEXT_801 = ");";
  protected final String TEXT_802 = NL + "\t\tif (new";
  protected final String TEXT_803 = " != ";
  protected final String TEXT_804 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_805 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_806 = " != null)";
  protected final String TEXT_807 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_808 = ")";
  protected final String TEXT_809 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_810 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_811 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_812 = ")new";
  protected final String TEXT_813 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_814 = ", null, msgs);";
  protected final String TEXT_815 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_816 = ")";
  protected final String TEXT_817 = ").eInverseRemove(this, ";
  protected final String TEXT_818 = ", ";
  protected final String TEXT_819 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_820 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_821 = ")new";
  protected final String TEXT_822 = ").eInverseAdd(this, ";
  protected final String TEXT_823 = ", ";
  protected final String TEXT_824 = ".class, msgs);";
  protected final String TEXT_825 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_826 = "(";
  protected final String TEXT_827 = "new";
  protected final String TEXT_828 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_829 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_830 = NL + "\t\t\tboolean old";
  protected final String TEXT_831 = "ESet = eVirtualIsSet(";
  protected final String TEXT_832 = ");";
  protected final String TEXT_833 = NL + "\t\t\tboolean old";
  protected final String TEXT_834 = "ESet = (";
  protected final String TEXT_835 = " & ";
  protected final String TEXT_836 = "_ESETFLAG) != 0;";
  protected final String TEXT_837 = NL + "\t\t\t";
  protected final String TEXT_838 = " |= ";
  protected final String TEXT_839 = "_ESETFLAG;";
  protected final String TEXT_840 = NL + "\t\t\tboolean old";
  protected final String TEXT_841 = "ESet = ";
  protected final String TEXT_842 = "ESet;";
  protected final String TEXT_843 = NL + "\t\t\t";
  protected final String TEXT_844 = "ESet = true;";
  protected final String TEXT_845 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_846 = "(this, ";
  protected final String TEXT_847 = ".SET, ";
  protected final String TEXT_848 = ", new";
  protected final String TEXT_849 = ", new";
  protected final String TEXT_850 = ", !old";
  protected final String TEXT_851 = "ESet));";
  protected final String TEXT_852 = NL + "\t\t}";
  protected final String TEXT_853 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_854 = "(this, ";
  protected final String TEXT_855 = ".SET, ";
  protected final String TEXT_856 = ", new";
  protected final String TEXT_857 = ", new";
  protected final String TEXT_858 = "));";
  protected final String TEXT_859 = NL + "\t\t";
  protected final String TEXT_860 = " old";
  protected final String TEXT_861 = " = (";
  protected final String TEXT_862 = " & ";
  protected final String TEXT_863 = "_EFLAG) != 0;";
  protected final String TEXT_864 = NL + "\t\tif (new";
  protected final String TEXT_865 = ") ";
  protected final String TEXT_866 = " |= ";
  protected final String TEXT_867 = "_EFLAG; else ";
  protected final String TEXT_868 = " &= ~";
  protected final String TEXT_869 = "_EFLAG;";
  protected final String TEXT_870 = NL + "\t\t";
  protected final String TEXT_871 = " old";
  protected final String TEXT_872 = " = ";
  protected final String TEXT_873 = ";";
  protected final String TEXT_874 = NL + "\t\t";
  protected final String TEXT_875 = " ";
  protected final String TEXT_876 = " = new";
  protected final String TEXT_877 = " == null ? ";
  protected final String TEXT_878 = " : new";
  protected final String TEXT_879 = ";";
  protected final String TEXT_880 = NL + "\t\t";
  protected final String TEXT_881 = " = new";
  protected final String TEXT_882 = " == null ? ";
  protected final String TEXT_883 = " : new";
  protected final String TEXT_884 = ";";
  protected final String TEXT_885 = NL + "\t\t";
  protected final String TEXT_886 = " ";
  protected final String TEXT_887 = " = ";
  protected final String TEXT_888 = "new";
  protected final String TEXT_889 = ";";
  protected final String TEXT_890 = NL + "\t\t";
  protected final String TEXT_891 = " = ";
  protected final String TEXT_892 = "new";
  protected final String TEXT_893 = ";";
  protected final String TEXT_894 = NL + "\t\tObject old";
  protected final String TEXT_895 = " = eVirtualSet(";
  protected final String TEXT_896 = ", ";
  protected final String TEXT_897 = ");";
  protected final String TEXT_898 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_899 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_900 = NL + "\t\tboolean old";
  protected final String TEXT_901 = "ESet = (";
  protected final String TEXT_902 = " & ";
  protected final String TEXT_903 = "_ESETFLAG) != 0;";
  protected final String TEXT_904 = NL + "\t\t";
  protected final String TEXT_905 = " |= ";
  protected final String TEXT_906 = "_ESETFLAG;";
  protected final String TEXT_907 = NL + "\t\tboolean old";
  protected final String TEXT_908 = "ESet = ";
  protected final String TEXT_909 = "ESet;";
  protected final String TEXT_910 = NL + "\t\t";
  protected final String TEXT_911 = "ESet = true;";
  protected final String TEXT_912 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_913 = "(this, ";
  protected final String TEXT_914 = ".SET, ";
  protected final String TEXT_915 = ", ";
  protected final String TEXT_916 = "isSetChange ? ";
  protected final String TEXT_917 = " : old";
  protected final String TEXT_918 = "old";
  protected final String TEXT_919 = ", ";
  protected final String TEXT_920 = "new";
  protected final String TEXT_921 = ", ";
  protected final String TEXT_922 = "isSetChange";
  protected final String TEXT_923 = "!old";
  protected final String TEXT_924 = "ESet";
  protected final String TEXT_925 = "));";
  protected final String TEXT_926 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_927 = "(this, ";
  protected final String TEXT_928 = ".SET, ";
  protected final String TEXT_929 = ", ";
  protected final String TEXT_930 = "old";
  protected final String TEXT_931 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_932 = " : old";
  protected final String TEXT_933 = "old";
  protected final String TEXT_934 = ", ";
  protected final String TEXT_935 = "new";
  protected final String TEXT_936 = "));";
  protected final String TEXT_937 = NL + "\t\t";
  protected final String TEXT_938 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_939 = NL + "\t\t\t";
  protected final String TEXT_940 = " ";
  protected final String TEXT_941 = " = ";
  protected final String TEXT_942 = "();";
  protected final String TEXT_943 = NL + "\t\t\tObject ";
  protected final String TEXT_944 = " = eVirtualGet(";
  protected final String TEXT_945 = ");";
  protected final String TEXT_946 = NL + "\t\t\tif (";
  protected final String TEXT_947 = " != null && ";
  protected final String TEXT_948 = " != new";
  protected final String TEXT_949 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_950 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_951 = NL + "\t\t\tif (new";
  protected final String TEXT_952 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_953 = NL + "\t\t\t\t";
  protected final String TEXT_954 = " ";
  protected final String TEXT_955 = " = ";
  protected final String TEXT_956 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_957 = ".contains(new";
  protected final String TEXT_958 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_959 = ".add(new";
  protected final String TEXT_960 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_961 = NL + "\t\t\t\t";
  protected final String TEXT_962 = " ";
  protected final String TEXT_963 = " = ";
  protected final String TEXT_964 = "();";
  protected final String TEXT_965 = NL + "\t\t\t\tObject ";
  protected final String TEXT_966 = " = eVirtualGet(";
  protected final String TEXT_967 = ");";
  protected final String TEXT_968 = NL + "\t\t\t\tif (new";
  protected final String TEXT_969 = " != ";
  protected final String TEXT_970 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_971 = "(new";
  protected final String TEXT_972 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_973 = NL + "\t\t\t}";
  protected final String TEXT_974 = NL + "\t\t}";
  protected final String TEXT_975 = NL + "\t\t((";
  protected final String TEXT_976 = ".Internal)((";
  protected final String TEXT_977 = ".Internal.Wrapper)get";
  protected final String TEXT_978 = "()).featureMap()).set(";
  protected final String TEXT_979 = ", ";
  protected final String TEXT_980 = "new ";
  protected final String TEXT_981 = "(";
  protected final String TEXT_982 = "new";
  protected final String TEXT_983 = ")";
  protected final String TEXT_984 = ");";
  protected final String TEXT_985 = NL + "\t\t((";
  protected final String TEXT_986 = ".Internal)get";
  protected final String TEXT_987 = "()).set(";
  protected final String TEXT_988 = ", ";
  protected final String TEXT_989 = "new ";
  protected final String TEXT_990 = "(";
  protected final String TEXT_991 = "new";
  protected final String TEXT_992 = ")";
  protected final String TEXT_993 = ");";
  protected final String TEXT_994 = NL + "\t\t";
  protected final String TEXT_995 = NL + "\t\t";
  protected final String TEXT_996 = ".";
  protected final String TEXT_997 = "(this, ";
  protected final String TEXT_998 = ");";
  protected final String TEXT_999 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1000 = "' ";
  protected final String TEXT_1001 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1002 = NL + "\t}" + NL;
  protected final String TEXT_1003 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1004 = NL + "\t@Override";
  protected final String TEXT_1005 = NL + "\tpublic ";
  protected final String TEXT_1006 = " basicUnset";
  protected final String TEXT_1007 = "(";
  protected final String TEXT_1008 = " msgs)" + NL + "\t{";
  protected final String TEXT_1009 = NL + "\t\tObject old";
  protected final String TEXT_1010 = " = eVirtualUnset(";
  protected final String TEXT_1011 = ");";
  protected final String TEXT_1012 = NL + "\t\t";
  protected final String TEXT_1013 = " old";
  protected final String TEXT_1014 = " = ";
  protected final String TEXT_1015 = ";" + NL + "\t\t";
  protected final String TEXT_1016 = " = null;";
  protected final String TEXT_1017 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1018 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1019 = NL + "\t\tboolean old";
  protected final String TEXT_1020 = "ESet = (";
  protected final String TEXT_1021 = " & ";
  protected final String TEXT_1022 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_1023 = " &= ~";
  protected final String TEXT_1024 = "_ESETFLAG;";
  protected final String TEXT_1025 = NL + "\t\tboolean old";
  protected final String TEXT_1026 = "ESet = ";
  protected final String TEXT_1027 = "ESet;" + NL + "\t\t";
  protected final String TEXT_1028 = "ESet = false;";
  protected final String TEXT_1029 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1030 = " notification = new ";
  protected final String TEXT_1031 = "(this, ";
  protected final String TEXT_1032 = ".UNSET, ";
  protected final String TEXT_1033 = ", ";
  protected final String TEXT_1034 = "isSetChange ? old";
  protected final String TEXT_1035 = " : null";
  protected final String TEXT_1036 = "old";
  protected final String TEXT_1037 = ", null, ";
  protected final String TEXT_1038 = "isSetChange";
  protected final String TEXT_1039 = "old";
  protected final String TEXT_1040 = "ESet";
  protected final String TEXT_1041 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1042 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1043 = "' ";
  protected final String TEXT_1044 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1045 = NL + "\t}" + NL;
  protected final String TEXT_1046 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1047 = "#";
  protected final String TEXT_1048 = " <em>";
  protected final String TEXT_1049 = "</em>}' ";
  protected final String TEXT_1050 = ".";
  protected final String TEXT_1051 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1052 = NL + "\t * @see #isSet";
  protected final String TEXT_1053 = "()";
  protected final String TEXT_1054 = NL + "\t * @see #";
  protected final String TEXT_1055 = "()";
  protected final String TEXT_1056 = NL + "\t * @see #set";
  protected final String TEXT_1057 = "(";
  protected final String TEXT_1058 = ")";
  protected final String TEXT_1059 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1060 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1061 = NL + "\t@Override";
  protected final String TEXT_1062 = NL + "\tvoid unset";
  protected final String TEXT_1063 = "();" + NL;
  protected final String TEXT_1064 = NL + "\tpublic void unset";
  protected final String TEXT_1065 = "_";
  protected final String TEXT_1066 = "()" + NL + "\t{";
  protected final String TEXT_1067 = NL + "\t\teUnset(";
  protected final String TEXT_1068 = ");";
  protected final String TEXT_1069 = NL + "\t\t";
  protected final String TEXT_1070 = " ";
  protected final String TEXT_1071 = " = (";
  protected final String TEXT_1072 = ")eVirtualGet(";
  protected final String TEXT_1073 = ");";
  protected final String TEXT_1074 = NL + "\t\tif (";
  protected final String TEXT_1075 = " != null) ((";
  protected final String TEXT_1076 = ".Unsettable";
  protected final String TEXT_1077 = ")";
  protected final String TEXT_1078 = ").unset();";
  protected final String TEXT_1079 = NL + "\t\t";
  protected final String TEXT_1080 = " ";
  protected final String TEXT_1081 = " = (";
  protected final String TEXT_1082 = ")eVirtualGet(";
  protected final String TEXT_1083 = ");";
  protected final String TEXT_1084 = NL + "\t\tif (";
  protected final String TEXT_1085 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1086 = " msgs = null;";
  protected final String TEXT_1087 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1088 = ")";
  protected final String TEXT_1089 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1090 = ", null, msgs);";
  protected final String TEXT_1091 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1092 = ")";
  protected final String TEXT_1093 = ").eInverseRemove(this, ";
  protected final String TEXT_1094 = ", ";
  protected final String TEXT_1095 = ".class, msgs);";
  protected final String TEXT_1096 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1097 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1098 = NL + "\t\t\tboolean old";
  protected final String TEXT_1099 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1100 = ");";
  protected final String TEXT_1101 = NL + "\t\t\tboolean old";
  protected final String TEXT_1102 = "ESet = (";
  protected final String TEXT_1103 = " & ";
  protected final String TEXT_1104 = "_ESETFLAG) != 0;";
  protected final String TEXT_1105 = NL + "\t\t\t";
  protected final String TEXT_1106 = " &= ~";
  protected final String TEXT_1107 = "_ESETFLAG;";
  protected final String TEXT_1108 = NL + "\t\t\tboolean old";
  protected final String TEXT_1109 = "ESet = ";
  protected final String TEXT_1110 = "ESet;";
  protected final String TEXT_1111 = NL + "\t\t\t";
  protected final String TEXT_1112 = "ESet = false;";
  protected final String TEXT_1113 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1114 = "(this, ";
  protected final String TEXT_1115 = ".UNSET, ";
  protected final String TEXT_1116 = ", null, null, old";
  protected final String TEXT_1117 = "ESet));";
  protected final String TEXT_1118 = NL + "\t\t}";
  protected final String TEXT_1119 = NL + "\t\t";
  protected final String TEXT_1120 = " old";
  protected final String TEXT_1121 = " = (";
  protected final String TEXT_1122 = " & ";
  protected final String TEXT_1123 = "_EFLAG) != 0;";
  protected final String TEXT_1124 = NL + "\t\tObject old";
  protected final String TEXT_1125 = " = eVirtualUnset(";
  protected final String TEXT_1126 = ");";
  protected final String TEXT_1127 = NL + "\t\t";
  protected final String TEXT_1128 = " old";
  protected final String TEXT_1129 = " = ";
  protected final String TEXT_1130 = ";";
  protected final String TEXT_1131 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1132 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1133 = NL + "\t\tboolean old";
  protected final String TEXT_1134 = "ESet = (";
  protected final String TEXT_1135 = " & ";
  protected final String TEXT_1136 = "_ESETFLAG) != 0;";
  protected final String TEXT_1137 = NL + "\t\tboolean old";
  protected final String TEXT_1138 = "ESet = ";
  protected final String TEXT_1139 = "ESet;";
  protected final String TEXT_1140 = NL + "\t\t";
  protected final String TEXT_1141 = " = null;";
  protected final String TEXT_1142 = NL + "\t\t";
  protected final String TEXT_1143 = " &= ~";
  protected final String TEXT_1144 = "_ESETFLAG;";
  protected final String TEXT_1145 = NL + "\t\t";
  protected final String TEXT_1146 = "ESet = false;";
  protected final String TEXT_1147 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1148 = "(this, ";
  protected final String TEXT_1149 = ".UNSET, ";
  protected final String TEXT_1150 = ", ";
  protected final String TEXT_1151 = "isSetChange ? old";
  protected final String TEXT_1152 = " : null";
  protected final String TEXT_1153 = "old";
  protected final String TEXT_1154 = ", null, ";
  protected final String TEXT_1155 = "isSetChange";
  protected final String TEXT_1156 = "old";
  protected final String TEXT_1157 = "ESet";
  protected final String TEXT_1158 = "));";
  protected final String TEXT_1159 = NL + "\t\tif (";
  protected final String TEXT_1160 = ") ";
  protected final String TEXT_1161 = " |= ";
  protected final String TEXT_1162 = "_EFLAG; else ";
  protected final String TEXT_1163 = " &= ~";
  protected final String TEXT_1164 = "_EFLAG;";
  protected final String TEXT_1165 = NL + "\t\t";
  protected final String TEXT_1166 = " = ";
  protected final String TEXT_1167 = ";";
  protected final String TEXT_1168 = NL + "\t\t";
  protected final String TEXT_1169 = " &= ~";
  protected final String TEXT_1170 = "_ESETFLAG;";
  protected final String TEXT_1171 = NL + "\t\t";
  protected final String TEXT_1172 = "ESet = false;";
  protected final String TEXT_1173 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1174 = "(this, ";
  protected final String TEXT_1175 = ".UNSET, ";
  protected final String TEXT_1176 = ", ";
  protected final String TEXT_1177 = "isSetChange ? old";
  protected final String TEXT_1178 = " : ";
  protected final String TEXT_1179 = "old";
  protected final String TEXT_1180 = ", ";
  protected final String TEXT_1181 = ", ";
  protected final String TEXT_1182 = "isSetChange";
  protected final String TEXT_1183 = "old";
  protected final String TEXT_1184 = "ESet";
  protected final String TEXT_1185 = "));";
  protected final String TEXT_1186 = NL + "\t\t((";
  protected final String TEXT_1187 = ".Internal)((";
  protected final String TEXT_1188 = ".Internal.Wrapper)get";
  protected final String TEXT_1189 = "()).featureMap()).clear(";
  protected final String TEXT_1190 = ");";
  protected final String TEXT_1191 = NL + "\t\t((";
  protected final String TEXT_1192 = ".Internal)get";
  protected final String TEXT_1193 = "()).clear(";
  protected final String TEXT_1194 = ");";
  protected final String TEXT_1195 = NL + "\t\t";
  protected final String TEXT_1196 = NL + "\t\t";
  protected final String TEXT_1197 = ".";
  protected final String TEXT_1198 = "(this);";
  protected final String TEXT_1199 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1200 = "' ";
  protected final String TEXT_1201 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1202 = NL + "\t}" + NL;
  protected final String TEXT_1203 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1204 = "#";
  protected final String TEXT_1205 = " <em>";
  protected final String TEXT_1206 = "</em>}' ";
  protected final String TEXT_1207 = " is set.";
  protected final String TEXT_1208 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1209 = "</em>' ";
  protected final String TEXT_1210 = " is set.";
  protected final String TEXT_1211 = NL + "\t * @see #unset";
  protected final String TEXT_1212 = "()";
  protected final String TEXT_1213 = NL + "\t * @see #";
  protected final String TEXT_1214 = "()";
  protected final String TEXT_1215 = NL + "\t * @see #set";
  protected final String TEXT_1216 = "(";
  protected final String TEXT_1217 = ")";
  protected final String TEXT_1218 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1219 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1220 = NL + "\t@Override";
  protected final String TEXT_1221 = NL + "\tboolean isSet";
  protected final String TEXT_1222 = "();" + NL;
  protected final String TEXT_1223 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1224 = "_";
  protected final String TEXT_1225 = "()" + NL + "\t{";
  protected final String TEXT_1226 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1227 = ");";
  protected final String TEXT_1228 = NL + "\t\t";
  protected final String TEXT_1229 = " ";
  protected final String TEXT_1230 = " = (";
  protected final String TEXT_1231 = ")eVirtualGet(";
  protected final String TEXT_1232 = ");";
  protected final String TEXT_1233 = NL + "\t\treturn ";
  protected final String TEXT_1234 = " != null && ((";
  protected final String TEXT_1235 = ".Unsettable";
  protected final String TEXT_1236 = ")";
  protected final String TEXT_1237 = ").isSet();";
  protected final String TEXT_1238 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1239 = ");";
  protected final String TEXT_1240 = NL + "\t\treturn (";
  protected final String TEXT_1241 = " & ";
  protected final String TEXT_1242 = "_ESETFLAG) != 0;";
  protected final String TEXT_1243 = NL + "\t\treturn ";
  protected final String TEXT_1244 = "ESet;";
  protected final String TEXT_1245 = NL + "\t\treturn !((";
  protected final String TEXT_1246 = ".Internal)((";
  protected final String TEXT_1247 = ".Internal.Wrapper)get";
  protected final String TEXT_1248 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1249 = ");";
  protected final String TEXT_1250 = NL + "\t\treturn !((";
  protected final String TEXT_1251 = ".Internal)get";
  protected final String TEXT_1252 = "()).isEmpty(";
  protected final String TEXT_1253 = ");";
  protected final String TEXT_1254 = NL + "\t\t";
  protected final String TEXT_1255 = NL + "\t\treturn ";
  protected final String TEXT_1256 = ".";
  protected final String TEXT_1257 = "(this);";
  protected final String TEXT_1258 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1259 = "' ";
  protected final String TEXT_1260 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1261 = NL + "\t}" + NL;
  protected final String TEXT_1262 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1263 = "() <em>";
  protected final String TEXT_1264 = "</em>}' ";
  protected final String TEXT_1265 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1266 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1267 = "_ESUBSETS = ";
  protected final String TEXT_1268 = ";" + NL;
  protected final String TEXT_1269 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1270 = "() <em>";
  protected final String TEXT_1271 = "</em>}' ";
  protected final String TEXT_1272 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1273 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1274 = "_ESUPERSETS = ";
  protected final String TEXT_1275 = ";" + NL;
  protected final String TEXT_1276 = NL + "\t/**";
  protected final String TEXT_1277 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1278 = "}, with the specified ";
  protected final String TEXT_1279 = ", and appends it to the '<em><b>";
  protected final String TEXT_1280 = "</b></em>' ";
  protected final String TEXT_1281 = ".";
  protected final String TEXT_1282 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1283 = "}, with the specified ";
  protected final String TEXT_1284 = ", and sets the '<em><b>";
  protected final String TEXT_1285 = "</b></em>' ";
  protected final String TEXT_1286 = ".";
  protected final String TEXT_1287 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1288 = "} and appends it to the '<em><b>";
  protected final String TEXT_1289 = "</b></em>' ";
  protected final String TEXT_1290 = ".";
  protected final String TEXT_1291 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1292 = "} and sets the '<em><b>";
  protected final String TEXT_1293 = "</b></em>' ";
  protected final String TEXT_1294 = ".";
  protected final String TEXT_1295 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1296 = NL + "\t * @param ";
  protected final String TEXT_1297 = " The ";
  protected final String TEXT_1298 = " for the new {@link ";
  protected final String TEXT_1299 = "}, or <code>null</code>.";
  protected final String TEXT_1300 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1301 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1302 = "}." + NL + "\t * @see #";
  protected final String TEXT_1303 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1304 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1305 = NL + "\t";
  protected final String TEXT_1306 = " create";
  protected final String TEXT_1307 = "(";
  protected final String TEXT_1308 = ", ";
  protected final String TEXT_1309 = " eClass);" + NL;
  protected final String TEXT_1310 = NL + "\t@Override";
  protected final String TEXT_1311 = NL + "\tpublic ";
  protected final String TEXT_1312 = " create";
  protected final String TEXT_1313 = "(";
  protected final String TEXT_1314 = ", ";
  protected final String TEXT_1315 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1316 = " new";
  protected final String TEXT_1317 = " = (";
  protected final String TEXT_1318 = ") create(eClass);";
  protected final String TEXT_1319 = NL + "\t\t";
  protected final String TEXT_1320 = "().add(new";
  protected final String TEXT_1321 = ");";
  protected final String TEXT_1322 = NL + "\t\tset";
  protected final String TEXT_1323 = "(new";
  protected final String TEXT_1324 = ");";
  protected final String TEXT_1325 = NL + "\t\tint ";
  protected final String TEXT_1326 = "ListSize = 0;";
  protected final String TEXT_1327 = NL + "\t\tint ";
  protected final String TEXT_1328 = "Size = ";
  protected final String TEXT_1329 = " == null ? 0 : ";
  protected final String TEXT_1330 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1331 = "Size > ";
  protected final String TEXT_1332 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1333 = "ListSize = ";
  protected final String TEXT_1334 = "Size;";
  protected final String TEXT_1335 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1336 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1337 = ".create";
  protected final String TEXT_1338 = "(";
  protected final String TEXT_1339 = ", ";
  protected final String TEXT_1340 = "i < ";
  protected final String TEXT_1341 = "Size ? (";
  protected final String TEXT_1342 = ") ";
  protected final String TEXT_1343 = ".get(i) : null";
  protected final String TEXT_1344 = ");" + NL + "\t\t}";
  protected final String TEXT_1345 = NL + "\t\tnew";
  protected final String TEXT_1346 = ".create";
  protected final String TEXT_1347 = "(";
  protected final String TEXT_1348 = ", ";
  protected final String TEXT_1349 = ");";
  protected final String TEXT_1350 = NL + "\t\tif (";
  protected final String TEXT_1351 = " != null)";
  protected final String TEXT_1352 = NL + "\t\t\tnew";
  protected final String TEXT_1353 = ".";
  protected final String TEXT_1354 = "().addAll(";
  protected final String TEXT_1355 = ");";
  protected final String TEXT_1356 = NL + "\t\t\tnew";
  protected final String TEXT_1357 = ".set";
  protected final String TEXT_1358 = "(";
  protected final String TEXT_1359 = ");";
  protected final String TEXT_1360 = NL + "\t\treturn new";
  protected final String TEXT_1361 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1362 = NL + "\t/**";
  protected final String TEXT_1363 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1364 = "}, with the specified ";
  protected final String TEXT_1365 = ", and appends it to the '<em><b>";
  protected final String TEXT_1366 = "</b></em>' ";
  protected final String TEXT_1367 = ".";
  protected final String TEXT_1368 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1369 = "},with the specified ";
  protected final String TEXT_1370 = ", and sets the '<em><b>";
  protected final String TEXT_1371 = "</b></em>' ";
  protected final String TEXT_1372 = ".";
  protected final String TEXT_1373 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1374 = "} and appends it to the '<em><b>";
  protected final String TEXT_1375 = "</b></em>' ";
  protected final String TEXT_1376 = ".";
  protected final String TEXT_1377 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1378 = "} and sets the '<em><b>";
  protected final String TEXT_1379 = "</b></em>' ";
  protected final String TEXT_1380 = ".";
  protected final String TEXT_1381 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1382 = NL + "\t * @param ";
  protected final String TEXT_1383 = " The ";
  protected final String TEXT_1384 = " for the new {@link ";
  protected final String TEXT_1385 = "}, or <code>null</code>.";
  protected final String TEXT_1386 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1387 = "}." + NL + "\t * @see #";
  protected final String TEXT_1388 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1389 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1390 = NL + "\t";
  protected final String TEXT_1391 = " create";
  protected final String TEXT_1392 = "(";
  protected final String TEXT_1393 = ");" + NL;
  protected final String TEXT_1394 = NL + "\t@Override";
  protected final String TEXT_1395 = NL + "\tpublic ";
  protected final String TEXT_1396 = " create";
  protected final String TEXT_1397 = "(";
  protected final String TEXT_1398 = ")" + NL + "\t{";
  protected final String TEXT_1399 = NL + "\t\treturn create";
  protected final String TEXT_1400 = "(";
  protected final String TEXT_1401 = ", ";
  protected final String TEXT_1402 = ");";
  protected final String TEXT_1403 = NL + "\t\t";
  protected final String TEXT_1404 = " new";
  protected final String TEXT_1405 = " = (";
  protected final String TEXT_1406 = ") create(";
  protected final String TEXT_1407 = ");";
  protected final String TEXT_1408 = NL + "\t\t";
  protected final String TEXT_1409 = "().add(new";
  protected final String TEXT_1410 = ");";
  protected final String TEXT_1411 = NL + "\t\tset";
  protected final String TEXT_1412 = "(new";
  protected final String TEXT_1413 = ");";
  protected final String TEXT_1414 = NL + "\t\tint ";
  protected final String TEXT_1415 = "ListSize = 0;";
  protected final String TEXT_1416 = NL + "\t\tint ";
  protected final String TEXT_1417 = "Size = ";
  protected final String TEXT_1418 = " == null ? 0 : ";
  protected final String TEXT_1419 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1420 = "Size > ";
  protected final String TEXT_1421 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1422 = "ListSize = ";
  protected final String TEXT_1423 = "Size;";
  protected final String TEXT_1424 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1425 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1426 = ".create";
  protected final String TEXT_1427 = "(";
  protected final String TEXT_1428 = ", ";
  protected final String TEXT_1429 = "i < ";
  protected final String TEXT_1430 = "Size ? (";
  protected final String TEXT_1431 = ") ";
  protected final String TEXT_1432 = ".get(i) : null";
  protected final String TEXT_1433 = ");" + NL + "\t\t}";
  protected final String TEXT_1434 = NL + "\t\tnew";
  protected final String TEXT_1435 = ".create";
  protected final String TEXT_1436 = "(";
  protected final String TEXT_1437 = ", ";
  protected final String TEXT_1438 = ");";
  protected final String TEXT_1439 = NL + "\t\tif (";
  protected final String TEXT_1440 = " != null)";
  protected final String TEXT_1441 = NL + "\t\t\tnew";
  protected final String TEXT_1442 = ".";
  protected final String TEXT_1443 = "().addAll(";
  protected final String TEXT_1444 = ");";
  protected final String TEXT_1445 = NL + "\t\t\tnew";
  protected final String TEXT_1446 = ".set";
  protected final String TEXT_1447 = "(";
  protected final String TEXT_1448 = ");";
  protected final String TEXT_1449 = NL + "\t\treturn new";
  protected final String TEXT_1450 = ";";
  protected final String TEXT_1451 = NL + "\t}" + NL;
  protected final String TEXT_1452 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1453 = "} with the specified ";
  protected final String TEXT_1454 = " from the '<em><b>";
  protected final String TEXT_1455 = "</b></em>' ";
  protected final String TEXT_1456 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1457 = NL + "\t * @param ";
  protected final String TEXT_1458 = " The ";
  protected final String TEXT_1459 = " of the {@link ";
  protected final String TEXT_1460 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1461 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1462 = "} with the specified ";
  protected final String TEXT_1463 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1464 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1465 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1466 = NL + "\t";
  protected final String TEXT_1467 = " get";
  protected final String TEXT_1468 = "(";
  protected final String TEXT_1469 = ");" + NL;
  protected final String TEXT_1470 = NL + "\t@Override";
  protected final String TEXT_1471 = NL + "\tpublic ";
  protected final String TEXT_1472 = " get";
  protected final String TEXT_1473 = "(";
  protected final String TEXT_1474 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1475 = "(";
  protected final String TEXT_1476 = ", false";
  protected final String TEXT_1477 = ", null";
  protected final String TEXT_1478 = ", false";
  protected final String TEXT_1479 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1480 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1481 = "} with the specified ";
  protected final String TEXT_1482 = " from the '<em><b>";
  protected final String TEXT_1483 = "</b></em>' ";
  protected final String TEXT_1484 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1485 = NL + "\t * @param ";
  protected final String TEXT_1486 = " The ";
  protected final String TEXT_1487 = " of the {@link ";
  protected final String TEXT_1488 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1489 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1490 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1491 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1492 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1493 = "} on demand if not found.";
  protected final String TEXT_1494 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1495 = "} with the specified ";
  protected final String TEXT_1496 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1497 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1498 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1499 = NL + "\t";
  protected final String TEXT_1500 = " get";
  protected final String TEXT_1501 = "(";
  protected final String TEXT_1502 = ", boolean ignoreCase";
  protected final String TEXT_1503 = ", ";
  protected final String TEXT_1504 = " eClass";
  protected final String TEXT_1505 = ", boolean createOnDemand";
  protected final String TEXT_1506 = ");" + NL;
  protected final String TEXT_1507 = NL + "\t@Override";
  protected final String TEXT_1508 = NL + "\tpublic ";
  protected final String TEXT_1509 = " get";
  protected final String TEXT_1510 = "(";
  protected final String TEXT_1511 = ", boolean ignoreCase";
  protected final String TEXT_1512 = ", ";
  protected final String TEXT_1513 = " eClass";
  protected final String TEXT_1514 = ", boolean createOnDemand";
  protected final String TEXT_1515 = ")" + NL + "\t{";
  protected final String TEXT_1516 = NL + "\t\t";
  protected final String TEXT_1517 = "Loop: for (";
  protected final String TEXT_1518 = " ";
  protected final String TEXT_1519 = " : ";
  protected final String TEXT_1520 = "())" + NL + "\t\t{";
  protected final String TEXT_1521 = NL + "\t\t";
  protected final String TEXT_1522 = "Loop: for (";
  protected final String TEXT_1523 = " i = ";
  protected final String TEXT_1524 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1525 = " ";
  protected final String TEXT_1526 = " = (";
  protected final String TEXT_1527 = ") i.next();";
  protected final String TEXT_1528 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1529 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1530 = "Loop;";
  protected final String TEXT_1531 = NL + "\t\t\t";
  protected final String TEXT_1532 = " ";
  protected final String TEXT_1533 = "List = ";
  protected final String TEXT_1534 = ".";
  protected final String TEXT_1535 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1536 = "ListSize = ";
  protected final String TEXT_1537 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1538 = " || (";
  protected final String TEXT_1539 = " != null && ";
  protected final String TEXT_1540 = ".size() != ";
  protected final String TEXT_1541 = "ListSize";
  protected final String TEXT_1542 = ")";
  protected final String TEXT_1543 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1544 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1545 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1546 = " ";
  protected final String TEXT_1547 = " = ";
  protected final String TEXT_1548 = "(";
  protected final String TEXT_1549 = ") ";
  protected final String TEXT_1550 = "List.get(j);";
  protected final String TEXT_1551 = NL + "\t\t\t\tif (";
  protected final String TEXT_1552 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1553 = "(";
  protected final String TEXT_1554 = ")";
  protected final String TEXT_1555 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1556 = ".";
  protected final String TEXT_1557 = "()) : ";
  protected final String TEXT_1558 = ".get(j).equals(";
  protected final String TEXT_1559 = ".";
  protected final String TEXT_1560 = "())))";
  protected final String TEXT_1561 = NL + "\t\t\t\tif (";
  protected final String TEXT_1562 = " != null && !";
  protected final String TEXT_1563 = ".get(j).equals(";
  protected final String TEXT_1564 = ".";
  protected final String TEXT_1565 = "()))";
  protected final String TEXT_1566 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1567 = "Loop;";
  protected final String TEXT_1568 = NL + "\t\t\t}";
  protected final String TEXT_1569 = NL + "\t\t\t";
  protected final String TEXT_1570 = " ";
  protected final String TEXT_1571 = " = ";
  protected final String TEXT_1572 = ".";
  protected final String TEXT_1573 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1574 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1575 = "Loop;";
  protected final String TEXT_1576 = NL + "\t\t\tif (";
  protected final String TEXT_1577 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1578 = ".equalsIgnoreCase(";
  protected final String TEXT_1579 = ".";
  protected final String TEXT_1580 = "()) : ";
  protected final String TEXT_1581 = ".equals(";
  protected final String TEXT_1582 = ".";
  protected final String TEXT_1583 = "())))";
  protected final String TEXT_1584 = NL + "\t\t\tif (";
  protected final String TEXT_1585 = " != null && !";
  protected final String TEXT_1586 = ".equals(";
  protected final String TEXT_1587 = ".";
  protected final String TEXT_1588 = "()))";
  protected final String TEXT_1589 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1590 = "Loop;";
  protected final String TEXT_1591 = NL + "\t\t\tif (";
  protected final String TEXT_1592 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1593 = ".equalsIgnoreCase(";
  protected final String TEXT_1594 = ".";
  protected final String TEXT_1595 = "()) : ";
  protected final String TEXT_1596 = ".equals(";
  protected final String TEXT_1597 = ".";
  protected final String TEXT_1598 = "())))";
  protected final String TEXT_1599 = NL + "\t\t\tif (";
  protected final String TEXT_1600 = " != null && !";
  protected final String TEXT_1601 = ".equals(";
  protected final String TEXT_1602 = ".";
  protected final String TEXT_1603 = "()))";
  protected final String TEXT_1604 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1605 = "Loop;";
  protected final String TEXT_1606 = NL + "\t\t\treturn ";
  protected final String TEXT_1607 = ";" + NL + "\t\t}";
  protected final String TEXT_1608 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1609 = " && eClass != null";
  protected final String TEXT_1610 = " ? create";
  protected final String TEXT_1611 = "(";
  protected final String TEXT_1612 = ", eClass";
  protected final String TEXT_1613 = ") : null;";
  protected final String TEXT_1614 = NL + "\t\treturn null;";
  protected final String TEXT_1615 = NL + "\t}" + NL;
  protected final String TEXT_1616 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1617 = "()" + NL + "\t{";
  protected final String TEXT_1618 = NL + "  \t\treturn false;";
  protected final String TEXT_1619 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1620 = ");";
  protected final String TEXT_1621 = NL + "\t\treturn !((";
  protected final String TEXT_1622 = ".Internal.Wrapper)";
  protected final String TEXT_1623 = "()).featureMap().isEmpty();";
  protected final String TEXT_1624 = NL + "\t\treturn ";
  protected final String TEXT_1625 = " != null && !";
  protected final String TEXT_1626 = ".featureMap().isEmpty();";
  protected final String TEXT_1627 = NL + "\t\treturn ";
  protected final String TEXT_1628 = " != null && !";
  protected final String TEXT_1629 = ".isEmpty();";
  protected final String TEXT_1630 = NL + "\t\t";
  protected final String TEXT_1631 = " ";
  protected final String TEXT_1632 = " = (";
  protected final String TEXT_1633 = ")eVirtualGet(";
  protected final String TEXT_1634 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1635 = " != null && !";
  protected final String TEXT_1636 = ".isEmpty();";
  protected final String TEXT_1637 = NL + "\t\treturn !";
  protected final String TEXT_1638 = "().isEmpty();";
  protected final String TEXT_1639 = NL + "\t\treturn ";
  protected final String TEXT_1640 = " != null;";
  protected final String TEXT_1641 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1642 = ") != null;";
  protected final String TEXT_1643 = NL + "\t\treturn basicGet";
  protected final String TEXT_1644 = "() != null;";
  protected final String TEXT_1645 = NL + "\t\treturn ";
  protected final String TEXT_1646 = " != null;";
  protected final String TEXT_1647 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1648 = ") != null;";
  protected final String TEXT_1649 = NL + "\t\treturn ";
  protected final String TEXT_1650 = "() != null;";
  protected final String TEXT_1651 = NL + "\t\treturn ((";
  protected final String TEXT_1652 = " & ";
  protected final String TEXT_1653 = "_EFLAG) != 0) != ";
  protected final String TEXT_1654 = ";";
  protected final String TEXT_1655 = NL + "\t\treturn ";
  protected final String TEXT_1656 = " != ";
  protected final String TEXT_1657 = ";";
  protected final String TEXT_1658 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1659 = ", ";
  protected final String TEXT_1660 = ") != ";
  protected final String TEXT_1661 = ";";
  protected final String TEXT_1662 = NL + "\t\treturn ";
  protected final String TEXT_1663 = "() != ";
  protected final String TEXT_1664 = ";";
  protected final String TEXT_1665 = NL + "\t\treturn ";
  protected final String TEXT_1666 = " == null ? ";
  protected final String TEXT_1667 = " != null : !";
  protected final String TEXT_1668 = ".equals(";
  protected final String TEXT_1669 = ");";
  protected final String TEXT_1670 = NL + "\t\t";
  protected final String TEXT_1671 = " ";
  protected final String TEXT_1672 = " = (";
  protected final String TEXT_1673 = ")eVirtualGet(";
  protected final String TEXT_1674 = ", ";
  protected final String TEXT_1675 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1676 = " == null ? ";
  protected final String TEXT_1677 = " != null : !";
  protected final String TEXT_1678 = ".equals(";
  protected final String TEXT_1679 = ");";
  protected final String TEXT_1680 = NL + "\t\treturn ";
  protected final String TEXT_1681 = " == null ? ";
  protected final String TEXT_1682 = "() != null : !";
  protected final String TEXT_1683 = ".equals(";
  protected final String TEXT_1684 = "());";
  protected final String TEXT_1685 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1686 = ");";
  protected final String TEXT_1687 = NL + "\t\t";
  protected final String TEXT_1688 = " ";
  protected final String TEXT_1689 = " = (";
  protected final String TEXT_1690 = ")eVirtualGet(";
  protected final String TEXT_1691 = ");";
  protected final String TEXT_1692 = NL + "\t\treturn ";
  protected final String TEXT_1693 = " != null && ((";
  protected final String TEXT_1694 = ".Unsettable";
  protected final String TEXT_1695 = ")";
  protected final String TEXT_1696 = ").isSet();";
  protected final String TEXT_1697 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1698 = ");";
  protected final String TEXT_1699 = NL + "\t\treturn (";
  protected final String TEXT_1700 = " & ";
  protected final String TEXT_1701 = "_ESETFLAG) != 0;";
  protected final String TEXT_1702 = NL + "\t\treturn ";
  protected final String TEXT_1703 = "ESet;";
  protected final String TEXT_1704 = NL + "\t\treturn !((";
  protected final String TEXT_1705 = ".Internal)((";
  protected final String TEXT_1706 = ".Internal.Wrapper)get";
  protected final String TEXT_1707 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1708 = ");";
  protected final String TEXT_1709 = NL + "\t\treturn !((";
  protected final String TEXT_1710 = ".Internal)get";
  protected final String TEXT_1711 = "()).isEmpty(";
  protected final String TEXT_1712 = ");";
  protected final String TEXT_1713 = NL + "\t\treturn ";
  protected final String TEXT_1714 = ".";
  protected final String TEXT_1715 = "(this);";
  protected final String TEXT_1716 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1717 = "' ";
  protected final String TEXT_1718 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1719 = NL + "\t}" + NL;
  protected final String TEXT_1720 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1721 = "(";
  protected final String TEXT_1722 = ") <em>";
  protected final String TEXT_1723 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1724 = "(";
  protected final String TEXT_1725 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1726 = " ";
  protected final String TEXT_1727 = "__EOCL_EXP = \"";
  protected final String TEXT_1728 = "\";";
  protected final String TEXT_1729 = NL;
  protected final String TEXT_1730 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1731 = "(";
  protected final String TEXT_1732 = ") <em>";
  protected final String TEXT_1733 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1734 = "(";
  protected final String TEXT_1735 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1736 = " ";
  protected final String TEXT_1737 = "__EOCL_INV;" + NL;
  protected final String TEXT_1738 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1739 = "(";
  protected final String TEXT_1740 = ") <em>";
  protected final String TEXT_1741 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1742 = "(";
  protected final String TEXT_1743 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1744 = "<";
  protected final String TEXT_1745 = ">";
  protected final String TEXT_1746 = " ";
  protected final String TEXT_1747 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1748 = NL + "\t/**";
  protected final String TEXT_1749 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1750 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1751 = "#";
  protected final String TEXT_1752 = "(";
  protected final String TEXT_1753 = ") <em>";
  protected final String TEXT_1754 = "</em>}' </li>";
  protected final String TEXT_1755 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1756 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1757 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1758 = NL + "\t * ";
  protected final String TEXT_1759 = NL + "\t * @param ";
  protected final String TEXT_1760 = NL + "\t *   ";
  protected final String TEXT_1761 = NL + "\t * @param ";
  protected final String TEXT_1762 = " ";
  protected final String TEXT_1763 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1764 = NL + "\t * @model ";
  protected final String TEXT_1765 = NL + "\t *        ";
  protected final String TEXT_1766 = NL + "\t * @model";
  protected final String TEXT_1767 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1768 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1769 = NL + "\t@Override";
  protected final String TEXT_1770 = NL + "\t";
  protected final String TEXT_1771 = " ";
  protected final String TEXT_1772 = "(";
  protected final String TEXT_1773 = ")";
  protected final String TEXT_1774 = ";" + NL;
  protected final String TEXT_1775 = NL + "\tpublic ";
  protected final String TEXT_1776 = " ";
  protected final String TEXT_1777 = "(";
  protected final String TEXT_1778 = ")";
  protected final String TEXT_1779 = NL + "\t{";
  protected final String TEXT_1780 = NL + "\t\t";
  protected final String TEXT_1781 = NL + "\t\treturn ";
  protected final String TEXT_1782 = ".";
  protected final String TEXT_1783 = "(this, ";
  protected final String TEXT_1784 = ", ";
  protected final String TEXT_1785 = ");";
  protected final String TEXT_1786 = NL + "\t\tif (";
  protected final String TEXT_1787 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1788 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_1789 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1790 = " = helper.createInvariant(";
  protected final String TEXT_1791 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1792 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_1793 = ").check(this))";
  protected final String TEXT_1794 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_1795 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1796 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1797 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1798 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1799 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1800 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1801 = ".";
  protected final String TEXT_1802 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1803 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1804 = "\", ";
  protected final String TEXT_1805 = ".getObjectLabel(this, ";
  protected final String TEXT_1806 = ") }),";
  protected final String TEXT_1807 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1808 = NL + "\t\t";
  protected final String TEXT_1809 = ".";
  protected final String TEXT_1810 = "(this";
  protected final String TEXT_1811 = ", ";
  protected final String TEXT_1812 = ");";
  protected final String TEXT_1813 = NL + "\t\t";
  protected final String TEXT_1814 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1815 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1816 = NL + "\t\t\t";
  protected final String TEXT_1817 = " result = (";
  protected final String TEXT_1818 = ") cache.get(";
  protected final String TEXT_1819 = "eResource(), ";
  protected final String TEXT_1820 = "this, ";
  protected final String TEXT_1821 = ".getEOperations().get(";
  protected final String TEXT_1822 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1823 = "eResource(), ";
  protected final String TEXT_1824 = "this, ";
  protected final String TEXT_1825 = ".getEOperations().get(";
  protected final String TEXT_1826 = "), result = ";
  protected final String TEXT_1827 = "new ";
  protected final String TEXT_1828 = "(";
  protected final String TEXT_1829 = ".";
  protected final String TEXT_1830 = "(this";
  protected final String TEXT_1831 = ", ";
  protected final String TEXT_1832 = ")";
  protected final String TEXT_1833 = ")";
  protected final String TEXT_1834 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1835 = ".";
  protected final String TEXT_1836 = "()";
  protected final String TEXT_1837 = ";" + NL + "\t\t}";
  protected final String TEXT_1838 = NL + "\t\treturn ";
  protected final String TEXT_1839 = ".";
  protected final String TEXT_1840 = "(this";
  protected final String TEXT_1841 = ", ";
  protected final String TEXT_1842 = ");";
  protected final String TEXT_1843 = NL + "\t\tif (";
  protected final String TEXT_1844 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1845 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_1846 = ", ";
  protected final String TEXT_1847 = ".getEAllOperations().get(";
  protected final String TEXT_1848 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1849 = " = helper.createQuery(";
  protected final String TEXT_1850 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1851 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_1852 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_1853 = ");";
  protected final String TEXT_1854 = NL + "\t\t";
  protected final String TEXT_1855 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_1856 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_1857 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_1858 = "\", ";
  protected final String TEXT_1859 = ");";
  protected final String TEXT_1860 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1861 = NL + "\t\t";
  protected final String TEXT_1862 = "<";
  protected final String TEXT_1863 = "> result = (";
  protected final String TEXT_1864 = "<";
  protected final String TEXT_1865 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_1866 = ".UnmodifiableEList<";
  protected final String TEXT_1867 = ">(result.size(), result.toArray());";
  protected final String TEXT_1868 = NL + "\t\treturn ((";
  protected final String TEXT_1869 = ") query.evaluate(this)).";
  protected final String TEXT_1870 = "();";
  protected final String TEXT_1871 = NL + "\t\treturn (";
  protected final String TEXT_1872 = ") query.evaluate(this);";
  protected final String TEXT_1873 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1874 = NL + "\t}" + NL;
  protected final String TEXT_1875 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1876 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1877 = NL + "\t@Override";
  protected final String TEXT_1878 = NL + "\tpublic ";
  protected final String TEXT_1879 = " eInverseAdd(";
  protected final String TEXT_1880 = " otherEnd, int featureID, ";
  protected final String TEXT_1881 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1882 = ")" + NL + "\t\t{";
  protected final String TEXT_1883 = NL + "\t\t\tcase ";
  protected final String TEXT_1884 = ":";
  protected final String TEXT_1885 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1886 = "(";
  protected final String TEXT_1887 = ".InternalMapView";
  protected final String TEXT_1888 = ")";
  protected final String TEXT_1889 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1890 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1891 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1892 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1893 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1894 = "((";
  protected final String TEXT_1895 = ")otherEnd, msgs);";
  protected final String TEXT_1896 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1897 = ", msgs);";
  protected final String TEXT_1898 = NL + "\t\t\t\t";
  protected final String TEXT_1899 = " ";
  protected final String TEXT_1900 = " = (";
  protected final String TEXT_1901 = ")eVirtualGet(";
  protected final String TEXT_1902 = ");";
  protected final String TEXT_1903 = NL + "\t\t\t\t";
  protected final String TEXT_1904 = " ";
  protected final String TEXT_1905 = " = ";
  protected final String TEXT_1906 = "basicGet";
  protected final String TEXT_1907 = "();";
  protected final String TEXT_1908 = NL + "\t\t\t\tif (";
  protected final String TEXT_1909 = " != null)";
  protected final String TEXT_1910 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1911 = ")";
  protected final String TEXT_1912 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1913 = ", null, msgs);";
  protected final String TEXT_1914 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1915 = ")";
  protected final String TEXT_1916 = ").eInverseRemove(this, ";
  protected final String TEXT_1917 = ", ";
  protected final String TEXT_1918 = ".class, msgs);";
  protected final String TEXT_1919 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1920 = "((";
  protected final String TEXT_1921 = ")otherEnd, msgs);";
  protected final String TEXT_1922 = NL + "\t\t}";
  protected final String TEXT_1923 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1924 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1925 = NL + "\t}" + NL;
  protected final String TEXT_1926 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1927 = NL + "\t@Override";
  protected final String TEXT_1928 = NL + "\tpublic ";
  protected final String TEXT_1929 = " eInverseRemove(";
  protected final String TEXT_1930 = " otherEnd, int featureID, ";
  protected final String TEXT_1931 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1932 = ")" + NL + "\t\t{";
  protected final String TEXT_1933 = NL + "\t\t\tcase ";
  protected final String TEXT_1934 = ":";
  protected final String TEXT_1935 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1936 = ")((";
  protected final String TEXT_1937 = ".InternalMapView";
  protected final String TEXT_1938 = ")";
  protected final String TEXT_1939 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1940 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1941 = ")((";
  protected final String TEXT_1942 = ".Internal.Wrapper)";
  protected final String TEXT_1943 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1944 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1945 = ")";
  protected final String TEXT_1946 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1947 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1948 = ", msgs);";
  protected final String TEXT_1949 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1950 = "(msgs);";
  protected final String TEXT_1951 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1952 = "(null, msgs);";
  protected final String TEXT_1953 = NL + "\t\t}";
  protected final String TEXT_1954 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1955 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1956 = NL + "\t}" + NL;
  protected final String TEXT_1957 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1958 = NL + "\t@Override";
  protected final String TEXT_1959 = NL + "\tpublic ";
  protected final String TEXT_1960 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1961 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID";
  protected final String TEXT_1962 = ")" + NL + "\t\t{";
  protected final String TEXT_1963 = NL + "\t\t\tcase ";
  protected final String TEXT_1964 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1965 = ", ";
  protected final String TEXT_1966 = ".class, msgs);";
  protected final String TEXT_1967 = NL + "\t\t}";
  protected final String TEXT_1968 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1969 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1970 = NL + "\t}" + NL;
  protected final String TEXT_1971 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1972 = NL + "\t@Override";
  protected final String TEXT_1973 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1974 = ")" + NL + "\t\t{";
  protected final String TEXT_1975 = NL + "\t\t\tcase ";
  protected final String TEXT_1976 = ":";
  protected final String TEXT_1977 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1978 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1979 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1980 = "(";
  protected final String TEXT_1981 = "());";
  protected final String TEXT_1982 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1983 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1984 = "();";
  protected final String TEXT_1985 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1986 = ".InternalMapView";
  protected final String TEXT_1987 = ")";
  protected final String TEXT_1988 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1989 = "();";
  protected final String TEXT_1990 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1991 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1992 = "().map();";
  protected final String TEXT_1993 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1994 = ".Internal.Wrapper)";
  protected final String TEXT_1995 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1996 = "();";
  protected final String TEXT_1997 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1998 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1999 = ".Internal)";
  protected final String TEXT_2000 = "()).getWrapper();";
  protected final String TEXT_2001 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2002 = "();";
  protected final String TEXT_2003 = NL + "\t\t}";
  protected final String TEXT_2004 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2005 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2006 = NL + "\t}" + NL;
  protected final String TEXT_2007 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2008 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2009 = NL + "\t@Override";
  protected final String TEXT_2010 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2011 = ")" + NL + "\t\t{";
  protected final String TEXT_2012 = NL + "\t\t\tcase ";
  protected final String TEXT_2013 = ":";
  protected final String TEXT_2014 = NL + "\t\t\t\t((";
  protected final String TEXT_2015 = ".Internal)((";
  protected final String TEXT_2016 = ".Internal.Wrapper)";
  protected final String TEXT_2017 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2018 = NL + "\t\t\t\t((";
  protected final String TEXT_2019 = ".Internal)";
  protected final String TEXT_2020 = "()).set(newValue);";
  protected final String TEXT_2021 = NL + "\t\t\t\t((";
  protected final String TEXT_2022 = ".Setting)((";
  protected final String TEXT_2023 = ".InternalMapView";
  protected final String TEXT_2024 = ")";
  protected final String TEXT_2025 = "()).eMap()).set(newValue);";
  protected final String TEXT_2026 = NL + "\t\t\t\t((";
  protected final String TEXT_2027 = ".Setting)";
  protected final String TEXT_2028 = "()).set(newValue);";
  protected final String TEXT_2029 = NL + "\t\t\t\t";
  protected final String TEXT_2030 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2031 = "().addAll((";
  protected final String TEXT_2032 = "<? extends ";
  protected final String TEXT_2033 = ">";
  protected final String TEXT_2034 = ")newValue);";
  protected final String TEXT_2035 = NL + "\t\t\t\tset";
  protected final String TEXT_2036 = "(((";
  protected final String TEXT_2037 = ")newValue).";
  protected final String TEXT_2038 = "());";
  protected final String TEXT_2039 = NL + "\t\t\t\tset";
  protected final String TEXT_2040 = "(";
  protected final String TEXT_2041 = "(";
  protected final String TEXT_2042 = ")";
  protected final String TEXT_2043 = "newValue);";
  protected final String TEXT_2044 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2045 = NL + "\t\t}";
  protected final String TEXT_2046 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2047 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2048 = NL + "\t}" + NL;
  protected final String TEXT_2049 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2050 = NL + "\t@Override";
  protected final String TEXT_2051 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2052 = ")" + NL + "\t\t{";
  protected final String TEXT_2053 = NL + "\t\t\tcase ";
  protected final String TEXT_2054 = ":";
  protected final String TEXT_2055 = NL + "\t\t\t\t((";
  protected final String TEXT_2056 = ".Internal.Wrapper)";
  protected final String TEXT_2057 = "()).featureMap().clear();";
  protected final String TEXT_2058 = NL + "\t\t\t\t";
  protected final String TEXT_2059 = "().clear();";
  protected final String TEXT_2060 = NL + "\t\t\t\tunset";
  protected final String TEXT_2061 = "();";
  protected final String TEXT_2062 = NL + "\t\t\t\tset";
  protected final String TEXT_2063 = "((";
  protected final String TEXT_2064 = ")null);";
  protected final String TEXT_2065 = NL + "\t\t\t\tset";
  protected final String TEXT_2066 = "(";
  protected final String TEXT_2067 = ");";
  protected final String TEXT_2068 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2069 = NL + "\t\t}";
  protected final String TEXT_2070 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2071 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2072 = NL + "\t}" + NL;
  protected final String TEXT_2073 = NL;
  protected final String TEXT_2074 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2075 = NL + "\t@Override";
  protected final String TEXT_2076 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2077 = NL + "\t\t\tcase ";
  protected final String TEXT_2078 = ":";
  protected final String TEXT_2079 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2080 = "();";
  protected final String TEXT_2081 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2082 = ".Internal.Wrapper)";
  protected final String TEXT_2083 = "()).featureMap().isEmpty();";
  protected final String TEXT_2084 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2085 = " != null && !";
  protected final String TEXT_2086 = ".featureMap().isEmpty();";
  protected final String TEXT_2087 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2088 = " != null && !";
  protected final String TEXT_2089 = ".isEmpty();";
  protected final String TEXT_2090 = NL + "\t\t\t\t";
  protected final String TEXT_2091 = " ";
  protected final String TEXT_2092 = " = (";
  protected final String TEXT_2093 = ")eVirtualGet(";
  protected final String TEXT_2094 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2095 = " != null && !";
  protected final String TEXT_2096 = ".isEmpty();";
  protected final String TEXT_2097 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2098 = "().isEmpty();";
  protected final String TEXT_2099 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2100 = "();";
  protected final String TEXT_2101 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2102 = " != null;";
  protected final String TEXT_2103 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2104 = ") != null;";
  protected final String TEXT_2105 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2106 = "() != null;";
  protected final String TEXT_2107 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2108 = " != null;";
  protected final String TEXT_2109 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2110 = ") != null;";
  protected final String TEXT_2111 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2112 = "() != null;";
  protected final String TEXT_2113 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2114 = " & ";
  protected final String TEXT_2115 = "_EFLAG) != 0) != ";
  protected final String TEXT_2116 = ";";
  protected final String TEXT_2117 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2118 = " != ";
  protected final String TEXT_2119 = ";";
  protected final String TEXT_2120 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2121 = ", ";
  protected final String TEXT_2122 = ") != ";
  protected final String TEXT_2123 = ";";
  protected final String TEXT_2124 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2125 = "() != ";
  protected final String TEXT_2126 = ";";
  protected final String TEXT_2127 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2128 = " == null ? ";
  protected final String TEXT_2129 = " != null : !";
  protected final String TEXT_2130 = ".equals(";
  protected final String TEXT_2131 = ");";
  protected final String TEXT_2132 = NL + "\t\t\t\t";
  protected final String TEXT_2133 = " ";
  protected final String TEXT_2134 = " = (";
  protected final String TEXT_2135 = ")eVirtualGet(";
  protected final String TEXT_2136 = ", ";
  protected final String TEXT_2137 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2138 = " == null ? ";
  protected final String TEXT_2139 = " != null : !";
  protected final String TEXT_2140 = ".equals(";
  protected final String TEXT_2141 = ");";
  protected final String TEXT_2142 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2143 = " == null ? ";
  protected final String TEXT_2144 = "() != null : !";
  protected final String TEXT_2145 = ".equals(";
  protected final String TEXT_2146 = "());";
  protected final String TEXT_2147 = NL + "\t\t}";
  protected final String TEXT_2148 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2149 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2150 = NL + "\t}" + NL;
  protected final String TEXT_2151 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2152 = NL + "\t@Override";
  protected final String TEXT_2153 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2154 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2155 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2156 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2157 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2158 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2159 = ": return ";
  protected final String TEXT_2160 = ";";
  protected final String TEXT_2161 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2162 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2163 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2164 = NL + "\t@Override";
  protected final String TEXT_2165 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2166 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2167 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2168 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2169 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2170 = ": return ";
  protected final String TEXT_2171 = ";";
  protected final String TEXT_2172 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2173 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2174 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2175 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2176 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2177 = ": return ";
  protected final String TEXT_2178 = ";";
  protected final String TEXT_2179 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2180 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2181 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2182 = NL + "\t@Override";
  protected final String TEXT_2183 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2184 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2185 = NL + "\t@Override";
  protected final String TEXT_2186 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2187 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2188 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2189 = NL + "\t@Override";
  protected final String TEXT_2190 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2191 = NL + "\t\t\tcase ";
  protected final String TEXT_2192 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2193 = ";";
  protected final String TEXT_2194 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2195 = NL + "\t@Override";
  protected final String TEXT_2196 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2197 = NL + "\t\t\tcase ";
  protected final String TEXT_2198 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2199 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2200 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2201 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2202 = NL + "\t@Override";
  protected final String TEXT_2203 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2204 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2205 = ": \");";
  protected final String TEXT_2206 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2207 = ": \");";
  protected final String TEXT_2208 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2209 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2210 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2211 = NL + "\t\tif (";
  protected final String TEXT_2212 = "(";
  protected final String TEXT_2213 = " & ";
  protected final String TEXT_2214 = "_ESETFLAG) != 0";
  protected final String TEXT_2215 = "ESet";
  protected final String TEXT_2216 = ") result.append((";
  protected final String TEXT_2217 = " & ";
  protected final String TEXT_2218 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2219 = NL + "\t\tif (";
  protected final String TEXT_2220 = "(";
  protected final String TEXT_2221 = " & ";
  protected final String TEXT_2222 = "_ESETFLAG) != 0";
  protected final String TEXT_2223 = "ESet";
  protected final String TEXT_2224 = ") result.append(";
  protected final String TEXT_2225 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2226 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2227 = ", ";
  protected final String TEXT_2228 = "));";
  protected final String TEXT_2229 = NL + "\t\tresult.append((";
  protected final String TEXT_2230 = " & ";
  protected final String TEXT_2231 = "_EFLAG) != 0);";
  protected final String TEXT_2232 = NL + "\t\tresult.append(";
  protected final String TEXT_2233 = ");";
  protected final String TEXT_2234 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2235 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2236 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2237 = " getKey()" + NL + "\t{";
  protected final String TEXT_2238 = NL + "\t\treturn new ";
  protected final String TEXT_2239 = "(getTypedKey());";
  protected final String TEXT_2240 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2241 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2242 = " key)" + NL + "\t{";
  protected final String TEXT_2243 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2244 = "(";
  protected final String TEXT_2245 = ")";
  protected final String TEXT_2246 = "key);";
  protected final String TEXT_2247 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2248 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2249 = ")key).";
  protected final String TEXT_2250 = "());";
  protected final String TEXT_2251 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2252 = ")key);";
  protected final String TEXT_2253 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2254 = " getValue()" + NL + "\t{";
  protected final String TEXT_2255 = NL + "\t\treturn new ";
  protected final String TEXT_2256 = "(getTypedValue());";
  protected final String TEXT_2257 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2258 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2259 = " setValue(";
  protected final String TEXT_2260 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2261 = " oldValue = getValue();";
  protected final String TEXT_2262 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2263 = "(";
  protected final String TEXT_2264 = ")";
  protected final String TEXT_2265 = "value);";
  protected final String TEXT_2266 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2267 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2268 = ")value).";
  protected final String TEXT_2269 = "());";
  protected final String TEXT_2270 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2271 = ")value);";
  protected final String TEXT_2272 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2273 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2274 = NL + "\tpublic ";
  protected final String TEXT_2275 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2276 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2277 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2278 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2279 = " EOCL_ENV = ";
  protected final String TEXT_2280 = ".newInstance();" + NL;
  protected final String TEXT_2281 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2282 = " create(";
  protected final String TEXT_2283 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2284 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2285 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2286 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2287 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2288 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2289 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2290 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2291 = NL + "\t@Override";
  protected final String TEXT_2292 = NL + "\tprotected ";
  protected final String TEXT_2293 = " ";
  protected final String TEXT_2294 = "Helper(";
  protected final String TEXT_2295 = " ";
  protected final String TEXT_2296 = ")" + NL + "\t{";
  protected final String TEXT_2297 = NL + "\t\t";
  protected final String TEXT_2298 = ".addAll(super.";
  protected final String TEXT_2299 = "());";
  protected final String TEXT_2300 = NL + "\t\tsuper.";
  protected final String TEXT_2301 = "Helper(";
  protected final String TEXT_2302 = ");";
  protected final String TEXT_2303 = NL + "\t\tif (isSet";
  protected final String TEXT_2304 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2305 = "<";
  protected final String TEXT_2306 = ">";
  protected final String TEXT_2307 = " i = ((";
  protected final String TEXT_2308 = ") ";
  protected final String TEXT_2309 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2310 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2311 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2312 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2313 = "<";
  protected final String TEXT_2314 = ">";
  protected final String TEXT_2315 = " i = ((";
  protected final String TEXT_2316 = ") ";
  protected final String TEXT_2317 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2318 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2319 = NL + "\t\t";
  protected final String TEXT_2320 = " ";
  protected final String TEXT_2321 = " = ";
  protected final String TEXT_2322 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2323 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2324 = "<";
  protected final String TEXT_2325 = ">";
  protected final String TEXT_2326 = " i = ((";
  protected final String TEXT_2327 = ") ";
  protected final String TEXT_2328 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2329 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2330 = NL + "\t\tif (isSet";
  protected final String TEXT_2331 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2332 = ".addAll(";
  protected final String TEXT_2333 = "());" + NL + "\t\t}";
  protected final String TEXT_2334 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2335 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2336 = ".addAll(";
  protected final String TEXT_2337 = "());" + NL + "\t\t}";
  protected final String TEXT_2338 = NL + "\t\t";
  protected final String TEXT_2339 = " ";
  protected final String TEXT_2340 = " = ";
  protected final String TEXT_2341 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2342 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2343 = ".addAll(";
  protected final String TEXT_2344 = ");" + NL + "\t\t}";
  protected final String TEXT_2345 = NL + "\t\tif (isSet";
  protected final String TEXT_2346 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2347 = ".add(";
  protected final String TEXT_2348 = "basicGet";
  protected final String TEXT_2349 = "());" + NL + "\t\t}";
  protected final String TEXT_2350 = NL + "\t\t";
  protected final String TEXT_2351 = " ";
  protected final String TEXT_2352 = " = ";
  protected final String TEXT_2353 = "basicGet";
  protected final String TEXT_2354 = "();" + NL + "\t\tif (";
  protected final String TEXT_2355 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2356 = ".add(";
  protected final String TEXT_2357 = ");" + NL + "\t\t}";
  protected final String TEXT_2358 = NL + "\t\treturn ";
  protected final String TEXT_2359 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2360 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2361 = NL + "\t@Override";
  protected final String TEXT_2362 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2363 = "()" + NL + "\t{";
  protected final String TEXT_2364 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2365 = "()";
  protected final String TEXT_2366 = NL + "\t\treturn isSet";
  protected final String TEXT_2367 = "()";
  protected final String TEXT_2368 = ";";
  protected final String TEXT_2369 = NL + "\t\treturn !";
  protected final String TEXT_2370 = "().isEmpty()";
  protected final String TEXT_2371 = ";";
  protected final String TEXT_2372 = NL + "\t\treturn ";
  protected final String TEXT_2373 = "basicGet";
  protected final String TEXT_2374 = "() != null";
  protected final String TEXT_2375 = ";";
  protected final String TEXT_2376 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2377 = ")";
  protected final String TEXT_2378 = ";";
  protected final String TEXT_2379 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2380 = "()";
  protected final String TEXT_2381 = ";";
  protected final String TEXT_2382 = NL + "\t\t\t|| !";
  protected final String TEXT_2383 = "().isEmpty()";
  protected final String TEXT_2384 = ";";
  protected final String TEXT_2385 = NL + "\t\t\t|| ";
  protected final String TEXT_2386 = "basicGet";
  protected final String TEXT_2387 = "() != null";
  protected final String TEXT_2388 = ";";
  protected final String TEXT_2389 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2390 = ")";
  protected final String TEXT_2391 = ";";
  protected final String TEXT_2392 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2393 = "();";
  protected final String TEXT_2394 = NL + "\t\treturn false;";
  protected final String TEXT_2395 = NL + "\t}" + NL;
  protected final String TEXT_2396 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2397 = NL + "\t@Override";
  protected final String TEXT_2398 = NL + "\tpublic ";
  protected final String TEXT_2399 = " ";
  protected final String TEXT_2400 = "()" + NL + "\t{";
  protected final String TEXT_2401 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2402 = " ";
  protected final String TEXT_2403 = " = (";
  protected final String TEXT_2404 = ")((";
  protected final String TEXT_2405 = ")";
  protected final String TEXT_2406 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2407 = ";";
  protected final String TEXT_2408 = NL + "\t\treturn ";
  protected final String TEXT_2409 = "();";
  protected final String TEXT_2410 = NL + "\t\treturn new ";
  protected final String TEXT_2411 = ".UnmodifiableEList";
  protected final String TEXT_2412 = "(this, ";
  protected final String TEXT_2413 = "null";
  protected final String TEXT_2414 = ", 0, ";
  protected final String TEXT_2415 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2416 = NL + "\t\treturn null;";
  protected final String TEXT_2417 = NL + "\t\treturn ";
  protected final String TEXT_2418 = "();";
  protected final String TEXT_2419 = NL + "\t}" + NL;
  protected final String TEXT_2420 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2421 = NL + "\t@Override";
  protected final String TEXT_2422 = NL + "\tpublic ";
  protected final String TEXT_2423 = " basicGet";
  protected final String TEXT_2424 = "()" + NL + "\t{";
  protected final String TEXT_2425 = NL + "\t\treturn null;";
  protected final String TEXT_2426 = NL + "\t\treturn ";
  protected final String TEXT_2427 = "basicGet";
  protected final String TEXT_2428 = "();";
  protected final String TEXT_2429 = NL + "\t}" + NL;
  protected final String TEXT_2430 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2431 = NL + "\t@Override";
  protected final String TEXT_2432 = NL + "\tpublic ";
  protected final String TEXT_2433 = " basicSet";
  protected final String TEXT_2434 = "(";
  protected final String TEXT_2435 = " new";
  protected final String TEXT_2436 = ", ";
  protected final String TEXT_2437 = " msgs)" + NL + "\t{";
  protected final String TEXT_2438 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2439 = NL + "\t\tif (new";
  protected final String TEXT_2440 = " != null && !(new";
  protected final String TEXT_2441 = " instanceof ";
  protected final String TEXT_2442 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2443 = "));" + NL + "\t\t}";
  protected final String TEXT_2444 = NL + "\t\treturn basicSet";
  protected final String TEXT_2445 = "(";
  protected final String TEXT_2446 = "(";
  protected final String TEXT_2447 = ") ";
  protected final String TEXT_2448 = "new";
  protected final String TEXT_2449 = ", msgs);";
  protected final String TEXT_2450 = NL + "\t\tset";
  protected final String TEXT_2451 = "(";
  protected final String TEXT_2452 = "(";
  protected final String TEXT_2453 = ") ";
  protected final String TEXT_2454 = "new";
  protected final String TEXT_2455 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2456 = NL + "\t}" + NL;
  protected final String TEXT_2457 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2458 = NL + "\t@Override";
  protected final String TEXT_2459 = NL + "\tpublic void set";
  protected final String TEXT_2460 = "(";
  protected final String TEXT_2461 = " new";
  protected final String TEXT_2462 = ")" + NL + "\t{";
  protected final String TEXT_2463 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2464 = NL + "\t\tif (new";
  protected final String TEXT_2465 = " != null && !(new";
  protected final String TEXT_2466 = " instanceof ";
  protected final String TEXT_2467 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2468 = "));" + NL + "\t\t}";
  protected final String TEXT_2469 = NL + "\t\tset";
  protected final String TEXT_2470 = "(";
  protected final String TEXT_2471 = "(";
  protected final String TEXT_2472 = ") ";
  protected final String TEXT_2473 = "new";
  protected final String TEXT_2474 = ");";
  protected final String TEXT_2475 = NL + "\t}" + NL;
  protected final String TEXT_2476 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2477 = "() <em>";
  protected final String TEXT_2478 = "</em>}' ";
  protected final String TEXT_2479 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2480 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2481 = "_ESUBSETS = ";
  protected final String TEXT_2482 = ";" + NL;
  protected final String TEXT_2483 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2484 = "() <em>";
  protected final String TEXT_2485 = "</em>}' ";
  protected final String TEXT_2486 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2487 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2488 = "_ESUPERSETS = ";
  protected final String TEXT_2489 = ";" + NL;
  protected final String TEXT_2490 = NL + "\t/**";
  protected final String TEXT_2491 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2492 = "}, with the specified ";
  protected final String TEXT_2493 = ", and appends it to the '<em><b>";
  protected final String TEXT_2494 = "</b></em>' ";
  protected final String TEXT_2495 = ".";
  protected final String TEXT_2496 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2497 = "}, with the specified ";
  protected final String TEXT_2498 = ", and sets the '<em><b>";
  protected final String TEXT_2499 = "</b></em>' ";
  protected final String TEXT_2500 = ".";
  protected final String TEXT_2501 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2502 = "} and appends it to the '<em><b>";
  protected final String TEXT_2503 = "</b></em>' ";
  protected final String TEXT_2504 = ".";
  protected final String TEXT_2505 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2506 = "} and sets the '<em><b>";
  protected final String TEXT_2507 = "</b></em>' ";
  protected final String TEXT_2508 = ".";
  protected final String TEXT_2509 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2510 = NL + "\t * @param ";
  protected final String TEXT_2511 = " The ";
  protected final String TEXT_2512 = " for the new {@link ";
  protected final String TEXT_2513 = "}, or <code>null</code>.";
  protected final String TEXT_2514 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2515 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2516 = "}." + NL + "\t * @see #";
  protected final String TEXT_2517 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2518 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2519 = NL + "\t";
  protected final String TEXT_2520 = " create";
  protected final String TEXT_2521 = "(";
  protected final String TEXT_2522 = ", ";
  protected final String TEXT_2523 = " eClass);" + NL;
  protected final String TEXT_2524 = NL + "\t@Override";
  protected final String TEXT_2525 = NL + "\tpublic ";
  protected final String TEXT_2526 = " create";
  protected final String TEXT_2527 = "(";
  protected final String TEXT_2528 = ", ";
  protected final String TEXT_2529 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2530 = " new";
  protected final String TEXT_2531 = " = (";
  protected final String TEXT_2532 = ") create(eClass);";
  protected final String TEXT_2533 = NL + "\t\t";
  protected final String TEXT_2534 = "().add(new";
  protected final String TEXT_2535 = ");";
  protected final String TEXT_2536 = NL + "\t\tset";
  protected final String TEXT_2537 = "(new";
  protected final String TEXT_2538 = ");";
  protected final String TEXT_2539 = NL + "\t\tint ";
  protected final String TEXT_2540 = "ListSize = 0;";
  protected final String TEXT_2541 = NL + "\t\tint ";
  protected final String TEXT_2542 = "Size = ";
  protected final String TEXT_2543 = " == null ? 0 : ";
  protected final String TEXT_2544 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2545 = "Size > ";
  protected final String TEXT_2546 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2547 = "ListSize = ";
  protected final String TEXT_2548 = "Size;";
  protected final String TEXT_2549 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2550 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2551 = ".create";
  protected final String TEXT_2552 = "(";
  protected final String TEXT_2553 = ", ";
  protected final String TEXT_2554 = "i < ";
  protected final String TEXT_2555 = "Size ? (";
  protected final String TEXT_2556 = ") ";
  protected final String TEXT_2557 = ".get(i) : null";
  protected final String TEXT_2558 = ");" + NL + "\t\t}";
  protected final String TEXT_2559 = NL + "\t\tnew";
  protected final String TEXT_2560 = ".create";
  protected final String TEXT_2561 = "(";
  protected final String TEXT_2562 = ", ";
  protected final String TEXT_2563 = ");";
  protected final String TEXT_2564 = NL + "\t\tif (";
  protected final String TEXT_2565 = " != null)";
  protected final String TEXT_2566 = NL + "\t\t\tnew";
  protected final String TEXT_2567 = ".";
  protected final String TEXT_2568 = "().addAll(";
  protected final String TEXT_2569 = ");";
  protected final String TEXT_2570 = NL + "\t\t\tnew";
  protected final String TEXT_2571 = ".set";
  protected final String TEXT_2572 = "(";
  protected final String TEXT_2573 = ");";
  protected final String TEXT_2574 = NL + "\t\treturn new";
  protected final String TEXT_2575 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2576 = NL + "\t/**";
  protected final String TEXT_2577 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2578 = "}, with the specified ";
  protected final String TEXT_2579 = ", and appends it to the '<em><b>";
  protected final String TEXT_2580 = "</b></em>' ";
  protected final String TEXT_2581 = ".";
  protected final String TEXT_2582 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2583 = "},with the specified ";
  protected final String TEXT_2584 = ", and sets the '<em><b>";
  protected final String TEXT_2585 = "</b></em>' ";
  protected final String TEXT_2586 = ".";
  protected final String TEXT_2587 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2588 = "} and appends it to the '<em><b>";
  protected final String TEXT_2589 = "</b></em>' ";
  protected final String TEXT_2590 = ".";
  protected final String TEXT_2591 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2592 = "} and sets the '<em><b>";
  protected final String TEXT_2593 = "</b></em>' ";
  protected final String TEXT_2594 = ".";
  protected final String TEXT_2595 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2596 = NL + "\t * @param ";
  protected final String TEXT_2597 = " The ";
  protected final String TEXT_2598 = " for the new {@link ";
  protected final String TEXT_2599 = "}, or <code>null</code>.";
  protected final String TEXT_2600 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2601 = "}." + NL + "\t * @see #";
  protected final String TEXT_2602 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2603 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2604 = NL + "\t";
  protected final String TEXT_2605 = " create";
  protected final String TEXT_2606 = "(";
  protected final String TEXT_2607 = ");" + NL;
  protected final String TEXT_2608 = NL + "\t@Override";
  protected final String TEXT_2609 = NL + "\tpublic ";
  protected final String TEXT_2610 = " create";
  protected final String TEXT_2611 = "(";
  protected final String TEXT_2612 = ")" + NL + "\t{";
  protected final String TEXT_2613 = NL + "\t\treturn create";
  protected final String TEXT_2614 = "(";
  protected final String TEXT_2615 = ", ";
  protected final String TEXT_2616 = ");";
  protected final String TEXT_2617 = NL + "\t\t";
  protected final String TEXT_2618 = " new";
  protected final String TEXT_2619 = " = (";
  protected final String TEXT_2620 = ") create(";
  protected final String TEXT_2621 = ");";
  protected final String TEXT_2622 = NL + "\t\t";
  protected final String TEXT_2623 = "().add(new";
  protected final String TEXT_2624 = ");";
  protected final String TEXT_2625 = NL + "\t\tset";
  protected final String TEXT_2626 = "(new";
  protected final String TEXT_2627 = ");";
  protected final String TEXT_2628 = NL + "\t\tint ";
  protected final String TEXT_2629 = "ListSize = 0;";
  protected final String TEXT_2630 = NL + "\t\tint ";
  protected final String TEXT_2631 = "Size = ";
  protected final String TEXT_2632 = " == null ? 0 : ";
  protected final String TEXT_2633 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2634 = "Size > ";
  protected final String TEXT_2635 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2636 = "ListSize = ";
  protected final String TEXT_2637 = "Size;";
  protected final String TEXT_2638 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2639 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2640 = ".create";
  protected final String TEXT_2641 = "(";
  protected final String TEXT_2642 = ", ";
  protected final String TEXT_2643 = "i < ";
  protected final String TEXT_2644 = "Size ? (";
  protected final String TEXT_2645 = ") ";
  protected final String TEXT_2646 = ".get(i) : null";
  protected final String TEXT_2647 = ");" + NL + "\t\t}";
  protected final String TEXT_2648 = NL + "\t\tnew";
  protected final String TEXT_2649 = ".create";
  protected final String TEXT_2650 = "(";
  protected final String TEXT_2651 = ", ";
  protected final String TEXT_2652 = ");";
  protected final String TEXT_2653 = NL + "\t\tif (";
  protected final String TEXT_2654 = " != null)";
  protected final String TEXT_2655 = NL + "\t\t\tnew";
  protected final String TEXT_2656 = ".";
  protected final String TEXT_2657 = "().addAll(";
  protected final String TEXT_2658 = ");";
  protected final String TEXT_2659 = NL + "\t\t\tnew";
  protected final String TEXT_2660 = ".set";
  protected final String TEXT_2661 = "(";
  protected final String TEXT_2662 = ");";
  protected final String TEXT_2663 = NL + "\t\treturn new";
  protected final String TEXT_2664 = ";";
  protected final String TEXT_2665 = NL + "\t}" + NL;
  protected final String TEXT_2666 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2667 = "} with the specified ";
  protected final String TEXT_2668 = " from the '<em><b>";
  protected final String TEXT_2669 = "</b></em>' ";
  protected final String TEXT_2670 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2671 = NL + "\t * @param ";
  protected final String TEXT_2672 = " The ";
  protected final String TEXT_2673 = " of the {@link ";
  protected final String TEXT_2674 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2675 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2676 = "} with the specified ";
  protected final String TEXT_2677 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2678 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2679 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2680 = NL + "\t";
  protected final String TEXT_2681 = " get";
  protected final String TEXT_2682 = "(";
  protected final String TEXT_2683 = ");" + NL;
  protected final String TEXT_2684 = NL + "\t@Override";
  protected final String TEXT_2685 = NL + "\tpublic ";
  protected final String TEXT_2686 = " get";
  protected final String TEXT_2687 = "(";
  protected final String TEXT_2688 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2689 = "(";
  protected final String TEXT_2690 = ", false";
  protected final String TEXT_2691 = ", null";
  protected final String TEXT_2692 = ", false";
  protected final String TEXT_2693 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2694 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2695 = "} with the specified ";
  protected final String TEXT_2696 = " from the '<em><b>";
  protected final String TEXT_2697 = "</b></em>' ";
  protected final String TEXT_2698 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2699 = NL + "\t * @param ";
  protected final String TEXT_2700 = " The ";
  protected final String TEXT_2701 = " of the {@link ";
  protected final String TEXT_2702 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2703 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2704 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2705 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2706 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2707 = "} on demand if not found.";
  protected final String TEXT_2708 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2709 = "} with the specified ";
  protected final String TEXT_2710 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2711 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2712 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2713 = NL + "\t";
  protected final String TEXT_2714 = " get";
  protected final String TEXT_2715 = "(";
  protected final String TEXT_2716 = ", boolean ignoreCase";
  protected final String TEXT_2717 = ", ";
  protected final String TEXT_2718 = " eClass";
  protected final String TEXT_2719 = ", boolean createOnDemand";
  protected final String TEXT_2720 = ");" + NL;
  protected final String TEXT_2721 = NL + "\t@Override";
  protected final String TEXT_2722 = NL + "\tpublic ";
  protected final String TEXT_2723 = " get";
  protected final String TEXT_2724 = "(";
  protected final String TEXT_2725 = ", boolean ignoreCase";
  protected final String TEXT_2726 = ", ";
  protected final String TEXT_2727 = " eClass";
  protected final String TEXT_2728 = ", boolean createOnDemand";
  protected final String TEXT_2729 = ")" + NL + "\t{";
  protected final String TEXT_2730 = NL + "\t\t";
  protected final String TEXT_2731 = "Loop: for (";
  protected final String TEXT_2732 = " ";
  protected final String TEXT_2733 = " : ";
  protected final String TEXT_2734 = "())" + NL + "\t\t{";
  protected final String TEXT_2735 = NL + "\t\t";
  protected final String TEXT_2736 = "Loop: for (";
  protected final String TEXT_2737 = " i = ";
  protected final String TEXT_2738 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2739 = " ";
  protected final String TEXT_2740 = " = (";
  protected final String TEXT_2741 = ") i.next();";
  protected final String TEXT_2742 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2743 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2744 = "Loop;";
  protected final String TEXT_2745 = NL + "\t\t\t";
  protected final String TEXT_2746 = " ";
  protected final String TEXT_2747 = "List = ";
  protected final String TEXT_2748 = ".";
  protected final String TEXT_2749 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2750 = "ListSize = ";
  protected final String TEXT_2751 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2752 = " || (";
  protected final String TEXT_2753 = " != null && ";
  protected final String TEXT_2754 = ".size() != ";
  protected final String TEXT_2755 = "ListSize";
  protected final String TEXT_2756 = ")";
  protected final String TEXT_2757 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2758 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2759 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2760 = " ";
  protected final String TEXT_2761 = " = ";
  protected final String TEXT_2762 = "(";
  protected final String TEXT_2763 = ") ";
  protected final String TEXT_2764 = "List.get(j);";
  protected final String TEXT_2765 = NL + "\t\t\t\tif (";
  protected final String TEXT_2766 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2767 = "(";
  protected final String TEXT_2768 = ")";
  protected final String TEXT_2769 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2770 = ".";
  protected final String TEXT_2771 = "()) : ";
  protected final String TEXT_2772 = ".get(j).equals(";
  protected final String TEXT_2773 = ".";
  protected final String TEXT_2774 = "())))";
  protected final String TEXT_2775 = NL + "\t\t\t\tif (";
  protected final String TEXT_2776 = " != null && !";
  protected final String TEXT_2777 = ".get(j).equals(";
  protected final String TEXT_2778 = ".";
  protected final String TEXT_2779 = "()))";
  protected final String TEXT_2780 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2781 = "Loop;";
  protected final String TEXT_2782 = NL + "\t\t\t}";
  protected final String TEXT_2783 = NL + "\t\t\t";
  protected final String TEXT_2784 = " ";
  protected final String TEXT_2785 = " = ";
  protected final String TEXT_2786 = ".";
  protected final String TEXT_2787 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2788 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2789 = "Loop;";
  protected final String TEXT_2790 = NL + "\t\t\tif (";
  protected final String TEXT_2791 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2792 = ".equalsIgnoreCase(";
  protected final String TEXT_2793 = ".";
  protected final String TEXT_2794 = "()) : ";
  protected final String TEXT_2795 = ".equals(";
  protected final String TEXT_2796 = ".";
  protected final String TEXT_2797 = "())))";
  protected final String TEXT_2798 = NL + "\t\t\tif (";
  protected final String TEXT_2799 = " != null && !";
  protected final String TEXT_2800 = ".equals(";
  protected final String TEXT_2801 = ".";
  protected final String TEXT_2802 = "()))";
  protected final String TEXT_2803 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2804 = "Loop;";
  protected final String TEXT_2805 = NL + "\t\t\tif (";
  protected final String TEXT_2806 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2807 = ".equalsIgnoreCase(";
  protected final String TEXT_2808 = ".";
  protected final String TEXT_2809 = "()) : ";
  protected final String TEXT_2810 = ".equals(";
  protected final String TEXT_2811 = ".";
  protected final String TEXT_2812 = "())))";
  protected final String TEXT_2813 = NL + "\t\t\tif (";
  protected final String TEXT_2814 = " != null && !";
  protected final String TEXT_2815 = ".equals(";
  protected final String TEXT_2816 = ".";
  protected final String TEXT_2817 = "()))";
  protected final String TEXT_2818 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2819 = "Loop;";
  protected final String TEXT_2820 = NL + "\t\t\treturn ";
  protected final String TEXT_2821 = ";" + NL + "\t\t}";
  protected final String TEXT_2822 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2823 = " && eClass != null";
  protected final String TEXT_2824 = " ? create";
  protected final String TEXT_2825 = "(";
  protected final String TEXT_2826 = ", eClass";
  protected final String TEXT_2827 = ") : null;";
  protected final String TEXT_2828 = NL + "\t\treturn null;";
  protected final String TEXT_2829 = NL + "\t}" + NL;
  protected final String TEXT_2830 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2831 = "()" + NL + "\t{";
  protected final String TEXT_2832 = NL + "  \t\treturn false;";
  protected final String TEXT_2833 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2834 = ");";
  protected final String TEXT_2835 = NL + "\t\treturn !((";
  protected final String TEXT_2836 = ".Internal.Wrapper)";
  protected final String TEXT_2837 = "()).featureMap().isEmpty();";
  protected final String TEXT_2838 = NL + "\t\treturn ";
  protected final String TEXT_2839 = " != null && !";
  protected final String TEXT_2840 = ".featureMap().isEmpty();";
  protected final String TEXT_2841 = NL + "\t\treturn ";
  protected final String TEXT_2842 = " != null && !";
  protected final String TEXT_2843 = ".isEmpty();";
  protected final String TEXT_2844 = NL + "\t\t";
  protected final String TEXT_2845 = " ";
  protected final String TEXT_2846 = " = (";
  protected final String TEXT_2847 = ")eVirtualGet(";
  protected final String TEXT_2848 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2849 = " != null && !";
  protected final String TEXT_2850 = ".isEmpty();";
  protected final String TEXT_2851 = NL + "\t\treturn !";
  protected final String TEXT_2852 = "().isEmpty();";
  protected final String TEXT_2853 = NL + "\t\treturn ";
  protected final String TEXT_2854 = " != null;";
  protected final String TEXT_2855 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2856 = ") != null;";
  protected final String TEXT_2857 = NL + "\t\treturn basicGet";
  protected final String TEXT_2858 = "() != null;";
  protected final String TEXT_2859 = NL + "\t\treturn ";
  protected final String TEXT_2860 = " != null;";
  protected final String TEXT_2861 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2862 = ") != null;";
  protected final String TEXT_2863 = NL + "\t\treturn ";
  protected final String TEXT_2864 = "() != null;";
  protected final String TEXT_2865 = NL + "\t\treturn ((";
  protected final String TEXT_2866 = " & ";
  protected final String TEXT_2867 = "_EFLAG) != 0) != ";
  protected final String TEXT_2868 = ";";
  protected final String TEXT_2869 = NL + "\t\treturn ";
  protected final String TEXT_2870 = " != ";
  protected final String TEXT_2871 = ";";
  protected final String TEXT_2872 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2873 = ", ";
  protected final String TEXT_2874 = ") != ";
  protected final String TEXT_2875 = ";";
  protected final String TEXT_2876 = NL + "\t\treturn ";
  protected final String TEXT_2877 = "() != ";
  protected final String TEXT_2878 = ";";
  protected final String TEXT_2879 = NL + "\t\treturn ";
  protected final String TEXT_2880 = " == null ? ";
  protected final String TEXT_2881 = " != null : !";
  protected final String TEXT_2882 = ".equals(";
  protected final String TEXT_2883 = ");";
  protected final String TEXT_2884 = NL + "\t\t";
  protected final String TEXT_2885 = " ";
  protected final String TEXT_2886 = " = (";
  protected final String TEXT_2887 = ")eVirtualGet(";
  protected final String TEXT_2888 = ", ";
  protected final String TEXT_2889 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2890 = " == null ? ";
  protected final String TEXT_2891 = " != null : !";
  protected final String TEXT_2892 = ".equals(";
  protected final String TEXT_2893 = ");";
  protected final String TEXT_2894 = NL + "\t\treturn ";
  protected final String TEXT_2895 = " == null ? ";
  protected final String TEXT_2896 = "() != null : !";
  protected final String TEXT_2897 = ".equals(";
  protected final String TEXT_2898 = "());";
  protected final String TEXT_2899 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2900 = ");";
  protected final String TEXT_2901 = NL + "\t\t";
  protected final String TEXT_2902 = " ";
  protected final String TEXT_2903 = " = (";
  protected final String TEXT_2904 = ")eVirtualGet(";
  protected final String TEXT_2905 = ");";
  protected final String TEXT_2906 = NL + "\t\treturn ";
  protected final String TEXT_2907 = " != null && ((";
  protected final String TEXT_2908 = ".Unsettable";
  protected final String TEXT_2909 = ")";
  protected final String TEXT_2910 = ").isSet();";
  protected final String TEXT_2911 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2912 = ");";
  protected final String TEXT_2913 = NL + "\t\treturn (";
  protected final String TEXT_2914 = " & ";
  protected final String TEXT_2915 = "_ESETFLAG) != 0;";
  protected final String TEXT_2916 = NL + "\t\treturn ";
  protected final String TEXT_2917 = "ESet;";
  protected final String TEXT_2918 = NL + "\t\treturn !((";
  protected final String TEXT_2919 = ".Internal)((";
  protected final String TEXT_2920 = ".Internal.Wrapper)get";
  protected final String TEXT_2921 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2922 = ");";
  protected final String TEXT_2923 = NL + "\t\treturn !((";
  protected final String TEXT_2924 = ".Internal)get";
  protected final String TEXT_2925 = "()).isEmpty(";
  protected final String TEXT_2926 = ");";
  protected final String TEXT_2927 = NL + "\t\treturn ";
  protected final String TEXT_2928 = ".";
  protected final String TEXT_2929 = "(this);";
  protected final String TEXT_2930 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2931 = "' ";
  protected final String TEXT_2932 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2933 = NL + "\t}" + NL;
  protected final String TEXT_2934 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2935 = NL + "\t@Override";
  protected final String TEXT_2936 = NL + "\tpublic ";
  protected final String TEXT_2937 = " ";
  protected final String TEXT_2938 = "(";
  protected final String TEXT_2939 = ")";
  protected final String TEXT_2940 = NL + "\t{";
  protected final String TEXT_2941 = NL + "\t\t";
  protected final String TEXT_2942 = "(";
  protected final String TEXT_2943 = ");";
  protected final String TEXT_2944 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2945 = NL + "\t\treturn ";
  protected final String TEXT_2946 = "(";
  protected final String TEXT_2947 = ");";
  protected final String TEXT_2948 = NL + "\t}" + NL;
  protected final String TEXT_2949 = NL + "} //";
  protected final String TEXT_2950 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
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
    final String singleWildcard = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    }}
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    if (isInterface) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_9);
    } else {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_13);
    if (isInterface) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_15);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_19);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_23);
    }
    }
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_28);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_29);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_31);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_33);
    } else {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_35);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_36);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    }
    stringBuffer.append(TEXT_42);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_43);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_47);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_51);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_55);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_56);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_58);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_60);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_62);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_69);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_73);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_74);
    }
    stringBuffer.append(TEXT_75);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_79);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_84);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_89);
    } else {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_92);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_94);
    }
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_101);
    } else {
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_109);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_111);
    }
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_116);
    } else {
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_120);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_125);
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_130);
    }
    }
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_131);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_132);
    } else {
    stringBuffer.append(TEXT_133);
    }
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_135);
    for (GenFeature genFeature : genClass.getFlagGenFeatures("true")) {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_138);
    }
    stringBuffer.append(TEXT_139);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_143);
    }
    if (isImplementation && genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL && (genClass.getClassExtendsGenClass() == null || genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL)) {
    stringBuffer.append(TEXT_144);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_145);
    }
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_147);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_148);
    if (!isImplementation) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_151);
    } else {
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_155);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_159);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_161);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_162);
    } else {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_165);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_167);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_171);
    }
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_173);
    }
    stringBuffer.append(TEXT_174);
    if (!isImplementation) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_177);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_180);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_182);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_183);
    }
    stringBuffer.append(TEXT_184);
    if (!isImplementation) {
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_186);
    } else {
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_188);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_190);
    } else {
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_194);
    }
    stringBuffer.append(TEXT_195);
    if (!isImplementation) {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_199);
    } else {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_207);
    }
    stringBuffer.append(TEXT_208);
    if (!isImplementation) {
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_211);
    } else {
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_215);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_218);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_219);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_220);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_221);
    } else {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_224);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_226);
    } else {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_228);
    }
    stringBuffer.append(TEXT_229);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_230);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_231);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_232);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_234);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_236);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_240);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_241);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_245);
    }
    stringBuffer.append(TEXT_246);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_247);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_249);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_250);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(TEXT_258);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_260);
    }
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_263);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_266);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_268);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_271);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_274);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_277);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_279);
    }}
    stringBuffer.append(TEXT_280);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_281);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_282);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_285);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_286);
    }
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_289);
    }
    stringBuffer.append(TEXT_290);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_291);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_292);
    }
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_295);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_303);
    }
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_305);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_309);
    } else {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_312);
    }
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_314);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_317);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_335);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_340);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_344);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_348);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_349);
    }
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_351);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_354);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_357);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_358);
    }
    stringBuffer.append(TEXT_359);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_362);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    }
    stringBuffer.append(TEXT_369);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_373);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_376);
    } else {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_378);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_388);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_392);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_395);
    } else {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_400);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_404);
    } else {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_407);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_408);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_409);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_411);
    }
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_415);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_417);
    }
    stringBuffer.append(TEXT_418);
    } else {
    stringBuffer.append(TEXT_419);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_420);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_422);
    }
    stringBuffer.append(TEXT_423);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_425);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_427);
    }
    stringBuffer.append(TEXT_428);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_431);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_432);
    }
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_435);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_436);
    }
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_438);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_439);
    }
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_441);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_443);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_445);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_446);
    }
    stringBuffer.append(TEXT_447);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_449);
    }
    stringBuffer.append(TEXT_450);
    }
    stringBuffer.append(TEXT_451);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_453);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_456);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_457);
    }
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_467);
    }
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_469);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_471);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_475);
    }
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_485);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_486);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_489);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_490);
    }
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_502);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_503);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_505);
    }
    stringBuffer.append(TEXT_506);
    }
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_511);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_512);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_513);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_516);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_519);
    } else {
    stringBuffer.append(TEXT_520);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_522);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_525);
    }
    }
    }
    }
    stringBuffer.append(TEXT_526);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_528);
    } else {
    stringBuffer.append(TEXT_529);
    }
    stringBuffer.append(TEXT_530);
    }
    } else {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_533);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_534);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_535);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_536);
    }
    }
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_539);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_542);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_545);
    } else {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_547);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_552);
    } else {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_554);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_556);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_557);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_559);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_561);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_563);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_565);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_567);
    } else {
    stringBuffer.append(TEXT_568);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_571);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_572);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_573);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_574);
    }
    }
    }
    }
    stringBuffer.append(TEXT_575);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_577);
    } else {
    stringBuffer.append(TEXT_578);
    }
    stringBuffer.append(TEXT_579);
    } else {
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_582);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_583);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_584);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_585);
    }
    }
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_591);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_595);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_597);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_598);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_601);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_604);
    }
    stringBuffer.append(TEXT_605);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_609);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_611);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_612);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_617);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_619);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_620);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_622);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_623);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_626);
    }
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_631);
    }
    stringBuffer.append(TEXT_632);
    }
    stringBuffer.append(TEXT_633);
    }
    stringBuffer.append(TEXT_634);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_638);
    } else {
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_644);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_646);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_652);
    } else {
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_656);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_657);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_662);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_666);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_667);
    } else {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    }
    stringBuffer.append(TEXT_670);
    } else {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_675);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_680);
    }
    stringBuffer.append(TEXT_681);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_683);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_684);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_687);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_690);
    }
    stringBuffer.append(TEXT_691);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_695);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_697);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_699);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_707);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_709);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_712);
    }
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_717);
    }
    stringBuffer.append(TEXT_718);
    }
    stringBuffer.append(TEXT_719);
    }
    stringBuffer.append(TEXT_720);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_723);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    } else {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_731);
    }
    } else {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_734);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_735);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_743);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_746);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_748);
    }
    }
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_750);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_751);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_752);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_755);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_757);
    }
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_760);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_765);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_767);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_769);
    }
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_771);
    }
    stringBuffer.append(TEXT_772);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_786);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_790);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_796);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_801);
    }
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_806);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_814);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_818);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_823);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_824);
    }
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_829);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_832);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_836);
    }
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_839);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_842);
    }
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_844);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_851);
    }
    stringBuffer.append(TEXT_852);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_863);
    }
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_869);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_873);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_879);
    } else {
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_884);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_889);
    } else {
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_893);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_897);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_899);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_903);
    }
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_906);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_909);
    }
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_911);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_915);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_919);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_921);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_922);
    } else {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_924);
    }
    stringBuffer.append(TEXT_925);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_929);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_934);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_936);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_938);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_939);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_942);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_943);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_945);
    }
    stringBuffer.append(TEXT_946);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_949);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_950);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_952);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_953);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_954);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_956);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_964);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_967);
    }
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_972);
    }
    stringBuffer.append(TEXT_973);
    }
    stringBuffer.append(TEXT_974);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_977);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_979);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_981);
    }
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_983);
    }
    stringBuffer.append(TEXT_984);
    } else {
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_986);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_988);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_990);
    }
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_992);
    }
    stringBuffer.append(TEXT_993);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_994);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_995);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_998);
    } else {
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1001);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1002);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1003);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1004);
    }
    }
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1008);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1011);
    } else {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1016);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1018);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1024);
    } else {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1028);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1033);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1035);
    } else {
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1037);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1038);
    } else {
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1040);
    }
    stringBuffer.append(TEXT_1041);
    }
    } else {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1044);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1045);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(TEXT_1051);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1053);
    }
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1055);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1058);
    }
    stringBuffer.append(TEXT_1059);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1060);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1061);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1063);
    } else {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1065);
    }
    stringBuffer.append(TEXT_1066);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1068);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1073);
    }
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1078);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1083);
    }
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1086);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1090);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1095);
    }
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1097);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1100);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1104);
    }
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1107);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1110);
    }
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1112);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1117);
    }
    stringBuffer.append(TEXT_1118);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1123);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1126);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1130);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1132);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1136);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1139);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1141);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1144);
    } else {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1146);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1150);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1152);
    } else {
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1154);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1155);
    } else {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1157);
    }
    stringBuffer.append(TEXT_1158);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1164);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1167);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1170);
    } else {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1172);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1176);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1181);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1182);
    } else {
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1184);
    }
    stringBuffer.append(TEXT_1185);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1190);
    } else {
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1194);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1198);
    } else {
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1201);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1202);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1210);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1212);
    }
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1214);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1217);
    }
    stringBuffer.append(TEXT_1218);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1219);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1220);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1222);
    } else {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1224);
    }
    stringBuffer.append(TEXT_1225);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1227);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1232);
    }
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1237);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1239);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1242);
    } else {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1244);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1249);
    } else {
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1253);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1257);
    } else {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1260);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1261);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1268);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1275);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1276);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1281);
    } else {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1286);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1290);
    } else {
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1294);
    }
    }
    stringBuffer.append(TEXT_1295);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1299);
    }
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1303);
    } else {
    stringBuffer.append(TEXT_1304);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1307);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1308);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1309);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1310);
    }
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1313);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1314);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1318);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1321);
    } else {
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1324);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1326);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1334);
    index++;}
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1338);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1339);
    }
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1343);
    }
    stringBuffer.append(TEXT_1344);
    } else {
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1347);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1348);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1349);
    }
    } else {
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1351);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1355);
    } else {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1359);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1361);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1362);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1367);
    } else {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1372);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1376);
    } else {
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1380);
    }
    }
    stringBuffer.append(TEXT_1381);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1385);
    }
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1388);
    } else {
    stringBuffer.append(TEXT_1389);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1393);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1394);
    }
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1398);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1400);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1401);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1402);
    } else {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1407);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1410);
    } else {
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1413);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1415);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1423);
    index++;}
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1427);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1428);
    }
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1432);
    }
    stringBuffer.append(TEXT_1433);
    } else {
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1436);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1437);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1438);
    }
    } else {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1440);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1444);
    } else {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1448);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1450);
    }
    stringBuffer.append(TEXT_1451);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1456);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1460);
    }
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1464);
    } else {
    stringBuffer.append(TEXT_1465);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1469);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1470);
    }
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1476);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1477);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1478);
    }
    stringBuffer.append(TEXT_1479);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1484);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1488);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1489);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1491);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1493);
    }
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1497);
    } else {
    stringBuffer.append(TEXT_1498);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1502);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1504);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1505);
    }
    stringBuffer.append(TEXT_1506);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1507);
    }
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1511);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1513);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1514);
    }
    stringBuffer.append(TEXT_1515);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1520);
    } else {
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1527);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1530);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1537);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1538);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1541);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1542);
    }
    }
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1547);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1549);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1550);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1552);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1554);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1560);
    } else {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1565);
    }
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1567);
    index++;}
    stringBuffer.append(TEXT_1568);
    } else {
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1575);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1583);
    } else {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1588);
    }
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1590);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1598);
    } else {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1603);
    }
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1605);
    index++;}
    }
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1607);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1608);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1609);
    }
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1612);
    }
    stringBuffer.append(TEXT_1613);
    } else {
    stringBuffer.append(TEXT_1614);
    }
    stringBuffer.append(TEXT_1615);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1617);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1618);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1620);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1623);
    } else {
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1626);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1629);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1636);
    } else {
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1638);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1640);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1642);
    } else {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1644);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1646);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1648);
    } else {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1650);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1654);
    } else {
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1657);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1661);
    } else {
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1664);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1669);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1679);
    } else {
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1684);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1686);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1691);
    }
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1696);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1698);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1701);
    } else {
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1703);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1708);
    } else {
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1712);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1715);
    } else {
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1718);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1719);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage()) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1729);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1737);
    } else {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1745);
    }
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1747);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1748);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1749);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1754);
    }
    stringBuffer.append(TEXT_1755);
    }
    stringBuffer.append(TEXT_1756);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1757);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1763);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1766);
    }}
    stringBuffer.append(TEXT_1767);
    } else {
    stringBuffer.append(TEXT_1768);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1769);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1774);
    } else {
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1779);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1785);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1793);
    } else {
    stringBuffer.append(TEXT_1794);
    }
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1807);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1810);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1812);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1814);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1815);
    }
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1818);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1819);
    }
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1822);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1823);
    }
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1826);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1828);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1830);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1832);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1833);
    }
    stringBuffer.append(TEXT_1834);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1836);
    }
    stringBuffer.append(TEXT_1837);
    }
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1840);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1842);
    }
    } else if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclQry = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_QRY";
		GenOperation redefinedGenOperation = genOperation;
		while (UML2GenModelUtil.isDuplicate(redefinedGenOperation)) {
			java.util.List<GenOperation> redefinedGenOperations = UML2GenModelUtil.getRedefinedGenOperations(redefinedGenOperation);
			if (redefinedGenOperations.size() > 0) {
				redefinedGenOperation = redefinedGenOperations.get(0);
			} else {
			break;
			}
		}
		int index = genOperation.getGenClass().getAllGenOperations().indexOf(redefinedGenOperation);
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1853);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1855);
    }
    stringBuffer.append(TEXT_1856);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1860);
    }
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1867);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1870);
    } else {
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_1872);
    }
    } else {
    stringBuffer.append(TEXT_1873);
    }
    }
    stringBuffer.append(TEXT_1874);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1875);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1876);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1877);
    }
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1882);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1884);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1889);
    } else {
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1891);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1892);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1895);
    } else {
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1897);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1902);
    } else if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1905);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1907);
    }
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1909);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1913);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1918);
    }
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1921);
    }
    }
    stringBuffer.append(TEXT_1922);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1923);
    } else {
    stringBuffer.append(TEXT_1924);
    }
    stringBuffer.append(TEXT_1925);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1926);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1927);
    }
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1932);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1934);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1939);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1943);
    } else {
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1946);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1948);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1950);
    } else {
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1952);
    }
    }
    stringBuffer.append(TEXT_1953);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1954);
    } else {
    stringBuffer.append(TEXT_1955);
    }
    stringBuffer.append(TEXT_1956);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1957);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1958);
    }
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1962);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1966);
    }
    stringBuffer.append(TEXT_1967);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1968);
    } else {
    stringBuffer.append(TEXT_1969);
    }
    stringBuffer.append(TEXT_1970);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1971);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1972);
    }
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1974);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1976);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1978);
    } else {
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1981);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1984);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1989);
    } else {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1992);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1996);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2000);
    } else {
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2002);
    }
    }
    stringBuffer.append(TEXT_2003);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2004);
    } else {
    stringBuffer.append(TEXT_2005);
    }
    stringBuffer.append(TEXT_2006);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2007);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2008);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2009);
    }
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2011);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2013);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2017);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2020);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2025);
    } else {
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2028);
    }
    } else {
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2033);
    }
    stringBuffer.append(TEXT_2034);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2038);
    } else {
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2040);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2042);
    }
    stringBuffer.append(TEXT_2043);
    }
    stringBuffer.append(TEXT_2044);
    }
    stringBuffer.append(TEXT_2045);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2046);
    } else {
    stringBuffer.append(TEXT_2047);
    }
    stringBuffer.append(TEXT_2048);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2049);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2050);
    }
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2052);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2054);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2057);
    } else {
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2059);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2061);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2064);
    } else {
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2067);
    }
    stringBuffer.append(TEXT_2068);
    }
    stringBuffer.append(TEXT_2069);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2070);
    } else {
    stringBuffer.append(TEXT_2071);
    }
    stringBuffer.append(TEXT_2072);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(TEXT_2074);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2075);
    }
    stringBuffer.append(TEXT_2076);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2078);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2080);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2083);
    } else {
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2086);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2089);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2096);
    } else {
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2098);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2100);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2102);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2104);
    } else {
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2106);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2108);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2110);
    } else {
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2112);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2116);
    } else {
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2119);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2123);
    } else {
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2126);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2131);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2141);
    } else {
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2146);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2147);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2148);
    } else {
    stringBuffer.append(TEXT_2149);
    }
    stringBuffer.append(TEXT_2150);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2151);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2152);
    }
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2154);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2157);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2160);
    }
    stringBuffer.append(TEXT_2161);
    }
    stringBuffer.append(TEXT_2162);
    }
    stringBuffer.append(TEXT_2163);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2164);
    }
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2166);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2168);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2171);
    }
    stringBuffer.append(TEXT_2172);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2175);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2178);
    }
    stringBuffer.append(TEXT_2179);
    }
    stringBuffer.append(TEXT_2180);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2181);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2182);
    }
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2184);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2185);
    }
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2187);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2188);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2189);
    }
    stringBuffer.append(TEXT_2190);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2193);
    }
    stringBuffer.append(TEXT_2194);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2195);
    }
    stringBuffer.append(TEXT_2196);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2199);
    }
    stringBuffer.append(TEXT_2200);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2201);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2202);
    }
    stringBuffer.append(TEXT_2203);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2211);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2214);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2215);
    }
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2219);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2222);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2223);
    }
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2228);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2231);
    } else {
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2233);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2234);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2237);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2239);
    } else {
    stringBuffer.append(TEXT_2240);
    }
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2242);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2243);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2245);
    }
    stringBuffer.append(TEXT_2246);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2247);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2250);
    } else {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2252);
    }
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2254);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2256);
    } else {
    stringBuffer.append(TEXT_2257);
    }
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2261);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2262);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2264);
    }
    stringBuffer.append(TEXT_2265);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2266);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2269);
    } else {
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2271);
    }
    stringBuffer.append(TEXT_2272);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2273);
    }
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2277);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genClass.getGenPackage()) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2280);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2284);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2289);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2290);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2291);
    }
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2296);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2299);
    } else {
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2302);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2306);
    }
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2310);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2314);
    }
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2318);
    } else {
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2325);
    }
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2329);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2333);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2337);
    } else {
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2344);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2347);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2349);
    } else {
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2352);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2357);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2359);
    }
    }
    }
    stringBuffer.append(TEXT_2360);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2361);
    }
    }
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2363);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2365);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2367);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2368);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2370);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2371);
    }
    } else {
    stringBuffer.append(TEXT_2372);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2374);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2375);
    }
    }
    } else {
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2377);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2378);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2380);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2381);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2383);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2384);
    }
    } else {
    stringBuffer.append(TEXT_2385);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2387);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2388);
    }
    }
    } else {
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2390);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2391);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2393);
    } else {
    stringBuffer.append(TEXT_2394);
    }
    }
    stringBuffer.append(TEXT_2395);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2396);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2397);
    }
    }
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2400);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2407);
    } else {
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2409);
    }
    } else {
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2411);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2412);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2413);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2415);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2416);
    } else {
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2418);
    }
    }
    stringBuffer.append(TEXT_2419);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2420);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2421);
    }
    }
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2424);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2425);
    } else {
    stringBuffer.append(TEXT_2426);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2428);
    }
    stringBuffer.append(TEXT_2429);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2430);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2431);
    }
    }
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2437);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2438);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2443);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2445);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2447);
    }
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2449);
    } else {
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2451);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2453);
    }
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2455);
    }
    }
    stringBuffer.append(TEXT_2456);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2457);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2458);
    }
    }
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2462);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2463);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2468);
    }
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2470);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2472);
    }
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2474);
    }
    stringBuffer.append(TEXT_2475);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2482);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2489);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2490);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2495);
    } else {
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2500);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2504);
    } else {
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2508);
    }
    }
    stringBuffer.append(TEXT_2509);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2513);
    }
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2517);
    } else {
    stringBuffer.append(TEXT_2518);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2521);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2522);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2523);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2524);
    }
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2527);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2528);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2532);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2535);
    } else {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2538);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2540);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2548);
    index++;}
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2552);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2553);
    }
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2557);
    }
    stringBuffer.append(TEXT_2558);
    } else {
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2561);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2562);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2563);
    }
    } else {
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2565);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2569);
    } else {
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2573);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2575);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2576);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2581);
    } else {
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2586);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2590);
    } else {
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2594);
    }
    }
    stringBuffer.append(TEXT_2595);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2599);
    }
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2602);
    } else {
    stringBuffer.append(TEXT_2603);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2607);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2608);
    }
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2612);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2614);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2615);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2616);
    } else {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2621);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2624);
    } else {
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2627);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2629);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2637);
    index++;}
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2641);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2642);
    }
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2646);
    }
    stringBuffer.append(TEXT_2647);
    } else {
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2650);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2651);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2652);
    }
    } else {
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2654);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2658);
    } else {
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2662);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2664);
    }
    stringBuffer.append(TEXT_2665);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2670);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2674);
    }
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2678);
    } else {
    stringBuffer.append(TEXT_2679);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2683);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2684);
    }
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2690);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2691);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2692);
    }
    stringBuffer.append(TEXT_2693);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2698);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2702);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2703);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2705);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2707);
    }
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2711);
    } else {
    stringBuffer.append(TEXT_2712);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2716);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2718);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2719);
    }
    stringBuffer.append(TEXT_2720);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2721);
    }
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2725);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2727);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2728);
    }
    stringBuffer.append(TEXT_2729);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2734);
    } else {
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2741);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2744);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2751);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2752);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2755);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2756);
    }
    }
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2761);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2763);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2764);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2766);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2768);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2774);
    } else {
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2779);
    }
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2781);
    index++;}
    stringBuffer.append(TEXT_2782);
    } else {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2789);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2797);
    } else {
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2802);
    }
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2804);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2812);
    } else {
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2817);
    }
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2819);
    index++;}
    }
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2821);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2822);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2823);
    }
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2826);
    }
    stringBuffer.append(TEXT_2827);
    } else {
    stringBuffer.append(TEXT_2828);
    }
    stringBuffer.append(TEXT_2829);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2831);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2832);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2834);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2837);
    } else {
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2840);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2843);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2850);
    } else {
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2852);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2854);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2856);
    } else {
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2858);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2860);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2862);
    } else {
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2864);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2866);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2868);
    } else {
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2871);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2875);
    } else {
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2878);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2883);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2885);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2893);
    } else {
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2898);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2900);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2905);
    }
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2910);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2912);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2915);
    } else {
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2917);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2922);
    } else {
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2925);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2926);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2929);
    } else {
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2932);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2933);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2934);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2935);
    }
    }
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2940);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2943);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2944);
    } else {
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2947);
    }
    }
    stringBuffer.append(TEXT_2948);
    }
    }
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2950);
    return stringBuffer.toString();
  }
}
